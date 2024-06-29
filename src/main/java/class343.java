import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class343 implements Runnable {

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "[Ljl;")
    public volatile class179[] field4599 = new class179[2];

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Z")
    public volatile boolean field4591 = false;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "Z")
    public volatile boolean field4597 = false;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "[I")
    public static int[] field4594 = new int[1000];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lfq;")
    public class137 field4592;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "Lza;")
    public static class287 field4596;

    @OriginalMember(owner = "client!jb", name = "run", descriptor = "()V", line = 6)
    public final void run() {
        field4598++;
        this.field4597 = true;
        try {
            while (!this.field4591) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class179 var2 = this.field4599[var1];
                    if (var2 != null) {
                        var2.method1040((byte) -84);
                    }
                }
                class316.method1873(10L, false);
                client.method1259(null, this.field4592, -25233);
            }
        } catch (Exception var9) {
            client.method1256(var9, -2020, null);
        } finally {
            Object var6 = null;
            this.field4597 = false;
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjk;)V", line = 40)
    public static final void method1995(int arg0, class450 arg1) {
        field4595++;
        if (arg0 != 2 || class61.field702 != arg1.field6679) {
            return;
        }
        if (class96.field1170.field7783 == null) {
            arg1.field6587 = 0;
            arg1.field6692 = 0;
            return;
        }
        arg1.field6615 = 150;
        arg1.field6701 = (int) (Math.sin((double) class532.field7836 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field6692 = class308.field4121;
        arg1.field6652 = 5;
        arg1.field6587 = class263.method1616(0, class96.field1170.field7783);
        arg1.field6575 = class96.field1170.field1159;
        arg1.field6590 = 0;
        arg1.field6702 = class96.field1170.field1216;
        arg1.field6577 = class96.field1170.field1245;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(CI)Z", line = 76)
    public static final boolean method1996(char arg0, int arg1) {
        field4593++;
        if (arg1 <= 41) {
            field4596 = null;
        }
        return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V", line = 89)
    public static void method1997(int arg0) {
        field4594 = null;
        field4596 = null;
        int var1 = -113 / ((58 - arg0) / 51);
    }
}
