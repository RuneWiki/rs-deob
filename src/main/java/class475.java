import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class475 extends class77 {

    @OriginalMember(owner = "client!sp", name = "h", descriptor = "Lat;")
    public static class412 field6646 = new class412();

    @OriginalMember(owner = "client!sp", name = "i", descriptor = "Lje;")
    public static class178 field6647 = null;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "[Lqm;")
    public static class262[] field6652 = new class262[29];

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field6649 = 0;

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "Ltl;")
    public static class400 field6651 = new class400(32);

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "[I")
    public static int[] field6653 = new int[32];

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
    public static int field6643;

    @OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
    public static int field6645;

    @OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
    public static int field6648;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "[[[Lke;")
    public static class337[][][] field6650;

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field6653[var1] = var0 - 1;
            var0 += var0;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)V", line = 5)
    public static final void method2764(int arg0, int arg1) {
        field6645++;
        class28.field375.method2389(false, arg1);
        class327.field4893.method2389(false, arg1);
        class169.field2409.method2389(false, arg1);
        class138.field1986.method2389(false, arg1);
        int var2 = -71 / ((arg0 + 8) / 48);
        class273.field4114.method2389(false, arg1);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lre;B)V", line = 19)
    public static final void method2765(class446 arg0, byte arg1) {
        field6644++;
        if (arg1 != -114) {
            method2766((class153) null, (Frame) null, (byte) 114);
        }
        for (int var2 = 0; var2 < class306.field4563; var2++) {
            int var3 = arg0.method2635(27);
            int var4 = arg0.method2631(2530);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class472.field6620[var3] != null) {
                class472.field6620[var3].field4990 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lng;Ljava/awt/Frame;B)V", line = 48)
    public static final void method2766(class153 arg0, Frame arg1, byte arg2) {
        field6643++;
        while (true) {
            class397 var3 = arg0.method1048(1095, arg1);
            while (var3.field5822 == 0) {
                class325.method2005(true, 10L);
            }
            if (var3.field5822 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                if (arg2 < 24) {
                    field6649 = 19;
                    return;
                }
                return;
            }
            class325.method2005(true, 100L);
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V", line = 75)
    public static void method2767(int arg0) {
        field6651 = null;
        int var1 = -17 / ((14 - arg0) / 37);
        field6653 = null;
        field6650 = null;
        field6646 = null;
        field6652 = null;
        field6647 = null;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I[IJB)Ljava/lang/String;", line = 99)
    public static final String method2768(int arg0, int[] arg1, long arg2, byte arg3) {
        int var5 = 96 % ((-arg3 - 62) / 58);
        field6648++;
        if (class260.field3871 != null) {
            String var6 = class260.field3871.method1588(arg2, arg1, arg0, -3569);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }
}
