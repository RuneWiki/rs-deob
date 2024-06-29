import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class222 implements class204 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Lmb;")
    public static class96 field3794 = class167.method1208(160, -256);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lw;")
    public static class107 field3798 = null;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field3800 = 0;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "[I")
    public static int[] field3799 = new int[4096];

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "[I")
    public static int[] field3797 = new int[32768];

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "[I")
    public static int[] field3796 = new int[256];

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Lmb;")
    public static class96 field3795 = class243.method1708("Starte 3D)2Softwarebibliothek)3", (byte) 91);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[I")
    public static int[] field3789;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([IIIJ)Lmb;")
    public final class96 method1420(int[] arg0, int arg1, int arg2, long arg3) {
        field3792++;
        if (arg1 != 0) {
            field3799 = null;
        }
        if (arg2 == 0) {
            class42 var6 = class50.method378(arg1 ^ 0xA, arg0[0]);
            return var6.method326(-4, (int) arg3);
        } else if (arg2 == 1 || arg2 == 10) {
            class159 var7 = class269.method1845((int) arg3, (byte) 61);
            return var7.field2779;
        } else if (arg2 == 6 || arg2 == 7) {
            return class50.method378(10, arg0[0]).method326(-4, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIILnb;IJ)Z")
    public static final boolean method1526(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class108 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class120.method925(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method1527(int arg0) {
        if (arg0 != 64) {
            field3789 = null;
        }
        field3793++;
        class15.field233.method83(0);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method1528(byte arg0) {
        field3789 = null;
        if (arg0 != 54) {
            field3795 = null;
        }
        field3798 = null;
        field3795 = null;
        field3794 = null;
        field3797 = null;
        field3799 = null;
        field3796 = null;
    }
}
