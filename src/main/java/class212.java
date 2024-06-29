import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class212 extends class59 {

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "Lpk;")
    public class105 field3303;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "[I")
    public static int[] field3299 = new int[2048];

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "[J")
    public static long[] field3302 = new long[32];

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!kf", name = "B", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "Lvl;")
    public static class73 field3298;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "[[[Lda;")
    public static class113[][][] field3297;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)V")
    public static final void method1465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3296++;
        class151.method1042(arg1, arg2, arg1 + arg4, arg0 + arg2);
        class151.method1026(arg1, arg2, arg4, arg0, 0);
        if (class200.field3150 < 100) {
            return;
        }
        int var5 = arg0;
        float var6 = (float) class207.field3247 / (float) class207.field3242;
        int var7 = arg4;
        if ((var6 < 1.0F)) {
            var5 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var8 = (arg0 - var5) / 2 + arg2;
        if (class303.field4813 == null || class303.field4813.field3353 != arg4 || class303.field4813.field3351 != arg0) {
            class48 var9 = new class48(arg4, arg0);
            class151.method1045(var9.field602, arg4, arg0);
            if (class207.field3240.field608 != -1) {
                class151.method1026(0, 0, arg4, arg0, class207.field3240.field608);
            }
            class207.method1435(0, 0, class207.field3242, class207.field3247, 0, 0, var7, var5);
            class207.method1430();
            class303.field4813 = var9;
            class187.field2935.method1849(false);
        }
        int var10 = (arg4 - var7) / 2 + arg1;
        class303.field4813.method283(var10, var8);
        int var11 = class58.field862 * var7 / class207.field3242 + var10;
        int var12 = 16711680;
        if (class257.field4188 == 1) {
            var12 = 16777215;
        }
        int var13 = class276.field4471 * var7 / class207.field3242;
        int var14 = class230.field3553 * var5 / class207.field3247 + var8;
        int var15 = class307.field4895 * var5 / class207.field3247;
        class151.method1033(var11, var14, var13, var15, var12, 128);
        class151.method1040(var11, var14, var13, var15, var12);
        if (~class99.field1490 >= arg3) {
            return;
        }
        int var16;
        if (class124.field1785 > 50) {
            var16 = (100 - class124.field1785) * 5;
        } else {
            var16 = class124.field1785 * 5;
        }
        for (class138 var17 = (class138) class207.field3238.method1146(arg3 ^ 0x6C); var17 != null; var17 = (class138) class207.field3238.method1148((byte) 113)) {
            class152 var18 = class136.method863(var17.field1987, ~arg3);
            if (class40.method229(127, var18)) {
                if (class19.field255 == var17.field1987) {
                    int var21 = var17.field1996 * var7 / class207.field3242 + var10;
                    int var22 = var17.field1986 * var5 / class207.field3247 + var8;
                    class151.method1033(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                } else if (class181.field2855 != -1 && class181.field2855 == var18.field2262) {
                    int var19 = var10 + (var17.field1996 * var7 / class207.field3242);
                    int var20 = var17.field1986 * var5 / class207.field3247 + var8;
                    class151.method1033(var19 - 2, var20 - 2, 4, 4, 16776960, var16);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)V")
    public static void method1466(byte arg0) {
        if (arg0 != -85) {
            method1465(123, -57, -118, 38, -12);
        }
        field3299 = null;
        field3298 = null;
        field3297 = null;
        field3302 = null;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(III)V")
    public static final void method1467(int arg0, int arg1, int arg2) {
        class270 var3 = class245.method1746(true, arg0);
        field3300++;
        int var4 = var3.field4398;
        if (arg2 != 26591) {
            return;
        }
        int var5 = var3.field4400;
        int var6 = var3.field4399;
        int var7 = class198.field3141[var6 - var5];
        if (arg1 < 0 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var5;
        class253.method1798(var4, class110.field1596[var4] & ~var8 | var8 & arg1 << var5, -94);
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lpk;)V")
    public class212(class105 arg0) {
        this.field3303 = arg0;
    }
}
