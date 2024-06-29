import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class196 extends class41 {

    @OriginalMember(owner = "client!na", name = "A", descriptor = "[I")
    public int[] field3418 = new int[1];

    @OriginalMember(owner = "client!na", name = "C", descriptor = "[I")
    public int[] field3420 = new int[] { -1 };

    @OriginalMember(owner = "client!na", name = "I", descriptor = "[I")
    public static int[] field3426 = new int[2000];

    @OriginalMember(owner = "client!na", name = "L", descriptor = "I")
    public static int field3429 = 0;

    @OriginalMember(owner = "client!na", name = "K", descriptor = "Lsc;")
    private static class181 field3428 = class149.method967(255, "Loaded update list");

    @OriginalMember(owner = "client!na", name = "y", descriptor = "Lsc;")
    public static class181 field3416 = field3428;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "Z")
    public static boolean field3415 = false;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field3431 = 0;

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Lsc;")
    public static class181 field3432 = class149.method967(255, "Welt");

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!na", name = "D", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!na", name = "E", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Ldf;")
    public static class117 field3414;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "Ljb;")
    public static class11 field3413;

    @OriginalMember(owner = "client!na", name = "J", descriptor = "Ldg;")
    public static class90 field3427;

    @OriginalMember(owner = "client!na", name = "G", descriptor = "[I")
    public static int[] field3424;

    @OriginalMember(owner = "client!na", name = "H", descriptor = "[I")
    public static int[] field3425;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "(I)V")
    public static void method1334(int arg0) {
        field3432 = null;
        field3428 = null;
        field3427 = null;
        field3416 = null;
        field3425 = null;
        field3424 = null;
        field3414 = null;
        field3413 = null;
        if (arg0 != -7613) {
            method1337((byte) 93, 2, 91, -106, (class157) null, 6, -59);
        }
        field3426 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Ljb;IBI)[Ltg;")
    public static final class107[] method1335(class11 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 35) {
            field3421++;
            return class242.method1646(arg3, (byte) -64, arg0, arg1) ? class240.method1635(arg2 ^ 0xDC) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V")
    public static final void method1336(byte arg0, int arg1) {
        field3423++;
        if (arg0 != 124) {
            method1336((byte) 63, 39);
        }
        class247.field4311.method1796(20, arg1);
        class97.field1568.method1796(arg0 ^ 0x68, arg1);
        class146.field2390.method1796(20, arg1);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIILeg;II)V")
    public static final void method1337(byte arg0, int arg1, int arg2, int arg3, class157 arg4, int arg5, int arg6) {
        if (arg0 <= -25) {
            field3417++;
            class116.method767(arg5, arg4.field2654, arg2, arg1, false, arg4.field2681, arg6, arg3);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IJZI)Z")
    public static final boolean method1338(int arg0, long arg1, boolean arg2, int arg3) {
        int var5 = ((int) arg1 & 0x7FCB9) >> 14;
        int var6 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        int var7 = (int) arg1 >> 20 & 0x3;
        field3430++;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class148 var8 = class62.method442((byte) 79, var6);
            int var9 = var8.field2439;
            int var10;
            int var11;
            if (var7 == 0 || var7 == 2) {
                var10 = var8.field2466;
                var11 = var8.field2433;
            } else {
                var10 = var8.field2433;
                var11 = var8.field2466;
            }
            if (var7 != 0) {
                var9 = (var9 >> 4 - var7) + (var9 << var7 & 0xF);
            }
            class201.method1356(var9, (byte) 119, arg3, var10, arg0, class258.field4507.field2623[0], 0, true, var11, 0, class258.field4507.field2672[0], 2);
        } else {
            class201.method1356(0, (byte) 119, arg3, 0, arg0, class258.field4507.field2623[0], var5 + 1, true, 0, var7, class258.field4507.field2672[0], 2);
        }
        if (arg2) {
            method1338(-34, 108L, true, -118);
        }
        class239.field4146 = class235.field4093;
        class57.field871 = class93.field1478;
        class37.field573 = 2;
        class163.field2780 = 0;
        return true;
    }
}
