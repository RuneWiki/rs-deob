import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class152 {

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "[I")
    public static int[] field2039 = new int[14];

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!lp", name = "c", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!lp", name = "d", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!lp", name = "e", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!lp", name = "f", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V", line = 15)
    public static final void method1046(byte arg0) {
        if (arg0 != -64) {
            field2043 = 3;
        }
        field2042++;
        if (class311.field4022 > 0) {
            class450.method2667((byte) -120);
        } else {
            class429.field5884 = class286.field3643;
            class286.field3643 = null;
            class294.method1767(40, (byte) -59);
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIIIII)V", line = 35)
    public static final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2038++;
        if (arg0 != 40) {
            return;
        }
        int var6 = class141.method970(arg2, class456.field6365, arg0 + 1150002036, class418.field5559);
        int var7 = class141.method970(arg5, class456.field6365, arg0 ^ 0x448BA3B4, class418.field5559);
        int var8 = class141.method970(arg3, class281.field3589, arg0 + 1150002036, class65.field827);
        int var9 = class141.method970(arg4, class281.field3589, 1150002076, class65.field827);
        for (int var10 = var6; var10 <= var7; var10++) {
            class183.method1212(arg1, class333.field4265[var10], true, var8, var9);
        }
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(B)V", line = 62)
    public static void method1048(byte arg0) {
        int var1 = -8 / ((arg0 + 62) / 45);
        field2039 = null;
    }
}
