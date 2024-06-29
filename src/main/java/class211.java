import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class211 {

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "J")
    public long field3928 = 0L;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3926 = 255;

    @OriginalMember(owner = "client!qg", name = "h", descriptor = "Llc;")
    public static class143 field3921 = class66.method374(")3", -1);

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "Llc;")
    public static class143 field3923 = class66.method374("V-Brification des mises -9 jour )2 ", -1);

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!qg", name = "b", descriptor = "I")
    public int field3915;

    @OriginalMember(owner = "client!qg", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!qg", name = "e", descriptor = "I")
    public int field3918;

    @OriginalMember(owner = "client!qg", name = "f", descriptor = "I")
    public int field3919;

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!qg", name = "i", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "I")
    public int field3930;

    @OriginalMember(owner = "client!qg", name = "r", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!qg", name = "s", descriptor = "I")
    public int field3932;

    @OriginalMember(owner = "client!qg", name = "t", descriptor = "I")
    public int field3933;

    @OriginalMember(owner = "client!qg", name = "u", descriptor = "I")
    public int field3934;

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "Lqk;")
    public class51 field3916;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "Lgf;")
    public static class7 field3925;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIIII)V")
    public static final void method1472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3922++;
        if (arg3 != -24335) {
            return;
        }
        if (arg0 == arg1) {
            class110.method666(arg1, arg5, (byte) -14, arg2, arg4);
        } else if (class31.field481 <= arg5 - arg1 && arg1 + arg5 <= class9.field173 && (arg4 - arg0) >= class188.field3398 && arg0 + arg4 <= class239.field4321) {
            class237.method1595(arg5, (byte) 69, arg1, arg4, arg2, arg0);
        } else {
            class244.method1625(arg5, arg1, arg2, arg0, false, arg4);
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIIII)V")
    public static final void method1473(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3924++;
        class162 var5 = (class162) class143.field2518.method1824((long) arg1, arg4);
        if (var5 == null) {
            var5 = new class162();
            class143.field2518.method1825(var5, (byte) 64, (long) arg1);
        }
        if (var5.field2916.length <= arg0) {
            int[] var6 = new int[arg0 + 1];
            int[] var7 = new int[arg0 + 1];
            for (int var8 = 0; var8 < var5.field2916.length; var8++) {
                var6[var8] = var5.field2916[var8];
                var7[var8] = var5.field2911[var8];
            }
            for (int var9 = var5.field2916.length; var9 < arg0; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field2911 = var7;
            var5.field2916 = var6;
        }
        var5.field2916[arg0] = arg3;
        var5.field2911[arg0] = arg2;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3925 = null;
        if (arg0 != 1312) {
            field3921 = null;
        }
        field3923 = null;
        field3921 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IIBI)I")
    public static final int method1475(int arg0, int arg1, byte arg2, int arg3) {
        field3917++;
        if (arg1 > 243) {
            arg0 >>= 0x4;
        } else if (arg1 > 217) {
            arg0 >>= 0x3;
        } else if (arg1 > 192) {
            arg0 >>= 0x2;
        } else if (arg1 > 179) {
            arg0 >>= 0x1;
        }
        if (arg2 > -107) {
            method1473(-126, -89, 60, 25, -75);
        }
        return (arg1 >> 1) + (arg0 >> 5 << 7) + (arg3 >> 2 << 10);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLh;)Ltd;")
    public static final class210 method1476(byte arg0, class190 arg1) {
        if (arg0 >= -110) {
            return null;
        } else {
            field3920++;
            return new class210(arg1.method1274((byte) 77), arg1.method1274((byte) 114), arg1.method1274((byte) 121), arg1.method1274((byte) 114), arg1.method1282(105), arg1.method1282(113), arg1.method1265(126));
        }
    }
}
