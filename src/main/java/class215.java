import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class215 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "[I")
    public static int[] field3922 = new int[] { 0, 0, 0, 0, 10, 0, 0, 7, 6, 0, -2, 2, 2, 0, 0, 0, 0, -2, 4, 0, 5, 0, 5, 6, 0, 0, 0, -1, 0, 1, 0, -1, 0, 0, 0, -2, -2, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0, -2, 0, 1, 0, 0, 3, 6, 0, 4, 0, 0, 20, 0, 0, 0, 0, 0, 3, -1, 0, 0, 8, 0, 0, 3, -1, 0, 4, 7, -1, 0, 14, 0, 0, 4, 0, 12, 0, 0, 0, 0, -1, 0, 10, 0, 5, 0, 0, 2, 15, 0, 0, -1, 0, -1, 0, -1, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 0, 0, 8, 0, 3, -2, 0, 0, 4, 5, 0, 0, 0, 0, 0, 0, 0, 3, 7, 0, 0, 0, 6, 4, -1, -2, 0, -1, 0, 0, 0, 0, 0, 0, 0, 4, 0, -2, 0, 0, -2, 0, 0, -2, 6, 0, 0, 6, 4, 0, 0, 6, 5, 0, 0, 8, 7, 0, -2, 5, 0, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 4, 0, 0, 1, 0, 2, 1, 0, 0, 0, -1, 6, -2, 0, 0, 0, 0, 0, 8, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 10, 0, 0, 2, 24, 0, 0, 0, 6, -1, 9, 0, 0, 0, 2, 5, 0, -2, 3, 1, -1, 8, 0, 0, 0, 6, 0, 0, 0, 0, 0, -1, 0 };

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "[I")
    public static int[] field3921 = new int[2];

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "Lhh;")
    public static class163 field3919 = class137.method1065("<col=00ff80>", 17);

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "Lhh;")
    public static class163 field3927 = class137.method1065("(U", 17);

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field3928 = 127;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field3914;

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "I")
    public int field3923;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "Lok;")
    public static class92 field3916;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "[[[I")
    public static int[][][] field3917;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1528(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class201 var7 = new class201();
        var7.field3592 = arg1 / 128;
        var7.field3610 = arg2 / 128;
        var7.field3605 = arg3 / 128;
        var7.field3602 = arg4 / 128;
        var7.field3609 = arg0;
        var7.field3590 = arg1;
        var7.field3606 = arg2;
        var7.field3604 = arg3;
        var7.field3599 = arg4;
        var7.field3608 = arg5;
        var7.field3597 = arg6;
        class239.field4254[class20.field330++] = var7;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lpg;II)V")
    private final void method1529(class81 arg0, int arg1, int arg2) {
        field3918++;
        if (arg1 == arg2) {
            this.field3914 = arg0.method658(arg2 + 112);
            this.field3923 = arg0.method622(true);
            this.field3926 = arg0.method622(true);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1530(int arg0) {
        field3916 = null;
        field3917 = null;
        field3927 = null;
        field3921 = null;
        field3922 = null;
        field3919 = null;
        if (arg0 != 15) {
            method1533(87);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILpg;)V")
    public final void method1531(int arg0, class81 arg1) {
        if (arg0 != -1) {
            method1528(-123, -94, -46, 117, -98, 38, 57);
        }
        field3920++;
        while (true) {
            int var3 = arg1.method622(true);
            if (var3 == 0) {
                return;
            }
            this.method1529(arg1, var3, 1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lii;IIIII)V")
    public static final void method1532(class247 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3924++;
        if (arg0.field4370 == -1 && arg0.field4359 == null) {
            return;
        }
        int var6 = 0;
        if (arg4 > arg0.field4356) {
            var6 += arg4 - arg0.field4356;
        } else if (arg0.field4361 > arg4) {
            var6 += arg0.field4361 - arg4;
        }
        if (arg5 > arg0.field4364) {
            var6 += arg5 - arg0.field4364;
        } else if (arg5 < arg0.field4373) {
            var6 += arg0.field4373 - arg5;
        }
        if (arg0.field4358 == 0 || arg0.field4358 < (var6 - 64) || class2.field46 == 0 || arg0.field4368 != arg1) {
            if (arg0.field4366 != null) {
                class225.field4085.method594(arg0.field4366);
                arg0.field4366 = null;
            }
            if (arg0.field4353 != null) {
                class225.field4085.method594(arg0.field4353);
                arg0.field4353 = null;
            }
            return;
        }
        if (arg2 < 89) {
            field3919 = null;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg0.field4358 - var6) * class2.field46 / arg0.field4358;
        if (arg0.field4366 != null) {
            arg0.field4366.method226(var7);
        } else if (arg0.field4370 >= 0) {
            class112 var8 = class112.method891(class149.field2805, arg0.field4370, 0);
            if (var8 != null) {
                class167 var9 = var8.method893().method1257(class51.field855);
                class34 var10 = class34.method230(var9, 100, var7);
                var10.method200(-1);
                class225.field4085.method595(var10);
                arg0.field4366 = var10;
            }
        }
        if (arg0.field4353 != null) {
            arg0.field4353.method226(var7);
            if (arg0.field4353.method1067(-60)) {
                return;
            }
            arg0.field4353 = null;
        } else if (arg0.field4359 != null && (arg0.field4352 -= arg3) <= 0) {
            int var11 = (int) ((double) arg0.field4359.length * Math.random());
            class112 var12 = class112.method891(class149.field2805, arg0.field4359[var11], 0);
            if (var12 != null) {
                class167 var13 = var12.method893().method1257(class51.field855);
                class34 var14 = class34.method230(var13, 100, var7);
                var14.method200(0);
                class225.field4085.method595(var14);
                arg0.field4353 = var14;
                arg0.field4352 = arg0.field4357 + (int) (Math.random() * (double) (arg0.field4347 - arg0.field4357));
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(I)V")
    public static final void method1533(int arg0) {
        field3925++;
        class89.field1639.method120((byte) -92);
        if (arg0 != 0) {
            field3917 = null;
        }
    }
}
