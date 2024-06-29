import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class369 {

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public int field5084 = 8;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public int field5086 = 16777215;

    @OriginalMember(owner = "client!gr", name = "h", descriptor = "[F")
    public static float[] field5087 = new float[4];

    @OriginalMember(owner = "client!gr", name = "l", descriptor = "Lmt;")
    public static class336 field5091 = new class336("WTQA", 2);

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public int field5081;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public int field5083;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "I")
    public int field5085;

    @OriginalMember(owner = "client!gr", name = "i", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!gr", name = "j", descriptor = "I")
    public int field5089;

    @OriginalMember(owner = "client!gr", name = "k", descriptor = "I")
    public int field5090;

    @OriginalMember(owner = "client!gr", name = "m", descriptor = "I")
    public static int field5092;

    @OriginalMember(owner = "client!gr", name = "n", descriptor = "Lkda;")
    public static class328 field5093;

    @OriginalMember(owner = "client!gr", name = "o", descriptor = "Z")
    public boolean field5094;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "[B")
    public static byte[] field5080;

    static {
        new class572("clan_chat", "clanchat", "conversation_clan", "clan_chat");
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(Lgw;I)V", line = 5)
    public final void method2210(class148 arg0, int arg1) {
        int var3 = 35 / ((arg1 + 58) / 46);
        while (true) {
            int var4 = arg0.method1032((byte) -33);
            if (var4 == 0) {
                field5082++;
                return;
            }
            this.method2212(var4, (byte) -84, arg0);
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 27)
    public static void method2211(byte arg0) {
        if (arg0 <= 95) {
            field5091 = null;
        }
        field5087 = null;
        field5091 = null;
        field5080 = null;
        field5093 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IBLgw;)V", line = 44)
    private final void method2212(int arg0, byte arg1, class148 arg2) {
        field5088++;
        if (arg1 >= -73) {
            return;
        }
        if (arg0 == 1) {
            this.field5084 = arg2.method1045(true);
        } else if (arg0 == 2) {
            this.field5094 = true;
        } else if (arg0 == 3) {
            this.field5090 = arg2.method1047(0);
            this.field5081 = arg2.method1047(0);
            this.field5085 = arg2.method1047(0);
        } else if (arg0 == 4) {
            this.field5083 = arg2.method1032((byte) -33);
            return;
        } else if (arg0 == 5) {
            this.field5089 = arg2.method1045(true);
            return;
        } else if (arg0 == 6) {
            this.field5086 = arg2.method1028((byte) 123);
            return;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(BLlp;Ljava/lang/Object;)V", line = 97)
    public static final void method2213(byte arg0, class331 arg1, Object arg2) {
        if (arg0 < 71) {
            method2213((byte) 2, null, null);
        }
        field5092++;
        if (arg1.field4560 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg1.field4560.peekEvent() != null; var3++) {
            class236.method1513(true, 1L);
        }
        if (arg2 != null) {
            arg1.field4560.postEvent(new ActionEvent(arg2, 1001, "dummy"));
        }
    }
}
