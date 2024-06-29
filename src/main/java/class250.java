import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class250 extends class145 {

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    private final int field4422;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    private final int field4415;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    private final int field4426;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    private final int field4428;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "I")
    public static int field4430 = 0;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field4424 = 0;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public static int field4425;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!be", name = "y", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lmc;")
    public static class151 field4418;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "[I")
    public static int[] field4416;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "[I")
    public static int[] field4420;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "[Z")
    public static boolean[] field4423;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)V")
    public final void method788(int arg0, int arg1, int arg2) {
        if (arg1 <= 120) {
            field4423 = null;
        }
        ++field4419;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lmc;Z)V")
    public static final void method1748(class151 arg0, boolean arg1) {
        class276.field4818 = class186.method1341(-16775, class60.field1293, arg0, 0);
        class193.field3484 = new class192[class276.field4818.length];
        ++field4431;
        class20.field373 = new class192[class276.field4818.length];
        class23.field427 = new class192[class276.field4818.length];
        for (int var2 = 0; class276.field4818.length > var2; ++var2) {
            class276.field4818[var2].method1386();
            class193.field3484[var2] = class276.field4818[var2].method1389();
            class276.field4818[var2].method1386();
            class20.field373[var2] = class276.field4818[var2].method1389();
            class276.field4818[var2].method1386();
            class23.field427[var2] = class276.field4818[var2].method1389();
            class276.field4818[var2].method1386();
        }
        class255.field4499 = class108.method853(90, arg0, class45.field1057, 0);
        class138.field2687 = class15.method157(class175.field3257, arg0, (byte) -89, 0);
        class73.field1647 = class15.method157(class168.field3168, arg0, (byte) -89, 0);
        class243.field4341 = class15.method157(class104.field2092, arg0, (byte) -89, 0);
        class272.field4766 = class15.method157(class79.field1709, arg0, (byte) -89, 0);
        class9.field172 = class31.method300(class220.field3975, arg0, (byte) 90, 0);
        class64.field1424 = class31.method300(class176.field3273, arg0, (byte) 90, 0);
        class201.field3589 = class73.method673(60, arg0, class90.field1821, 0);
        class102.field2068 = class31.method300(class177.field3288, arg0, (byte) 90, 0);
        class14.field281 = class31.method300(class246.field4391, arg0, (byte) 90, 0);
        class167.field3086 = class117.method901(0, -125, class32.field819, arg0);
        class100.field2039 = class117.method901(0, -127, class93.field1871, arg0);
        class191.field3476.method1454(class100.field2039, (int[]) null);
        class232.field4126.method1454(class100.field2039, (int[]) null);
        class223.field4000.method1454(class100.field2039, (int[]) null);
        class152 var3 = class169.method1245(arg0, (byte) 108, 0, class203.field3629);
        var3.method1135();
        class268.field4715 = var3;
        class152[] var4 = class108.method853(90, arg0, class52.field1172, 0);
        for (int var5 = 0; var4.length > var5; ++var5) {
            var4[var5].method1135();
        }
        int var6 = (int) (21.0D * Math.random()) - 10;
        int var7 = (int) (21.0D * Math.random()) - 10;
        class135.field2638 = var4;
        if (arg1) {
            int var8 = (int) (41.0D * Math.random()) + -20;
            int var9 = -10 + (int) (Math.random() * 21.0D);
            for (int var10 = 0; ~var10 > ~class255.field4499.length; ++var10) {
                class255.field4499[var10].method1141(var6 - -var8, var7 + var8, var8 + var9);
            }
            class276.field4818[0].method1394(var6 - -var8, var7 + var8, var8 + var9);
            class110.field2207 = class255.field4499;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZII)V")
    public final void method792(boolean arg0, int arg1, int arg2) {
        int var4 = this.field4415 * arg1 >> 12;
        if (!arg0) {
            int var5 = this.field4426 * arg2 >> 12;
            ++field4429;
            int var6 = this.field4428 * arg2 >> 12;
            int var7 = this.field4422 * arg1 >> 12;
            class241.method1704(var6, var7, super.field2787, var5, var4, 93);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(ZII)V")
    public final void method790(boolean arg0, int arg1, int arg2) {
        int var4 = this.field4415 * arg2 >> 12;
        ++field4427;
        int var5 = this.field4422 * arg2 >> 12;
        if (!arg0) {
            int var6 = this.field4426 * arg1 >> 12;
            int var7 = this.field4428 * arg1 >> 12;
            class65.method588(var7, super.field2784, super.field2779, super.field2787, (byte) 101, var4, var6, var5);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (~class230.field4095 > -101) {
            class73.method674(false);
        }
        class188.method1355(arg0, arg4, arg0 - -arg3, arg1 + arg4);
        ++field4421;
        if (~class230.field4095 > -101) {
            byte var5 = 20;
            int var6 = arg0 - -(arg3 / 2);
            int var7 = arg4 - 18 + arg1 / 2 + -var5;
            class188.method1361(arg0, arg4, arg3, arg1, 0);
            class188.method1354(var6 + -152, var7, 304, 34, 9179409);
            class188.method1354(var6 + -151, var7 + 1, 302, 32, 0);
            class188.method1361(var6 + -150, var7 + 2, class230.field4095 * 3, 30, 9179409);
            class188.method1361(class230.field4095 * 3 + var6 + -150, var7 - -2, -(class230.field4095 * 3) + 300, 30, 0);
            class223.field4000.method1472(class129.field2550, var6, var5 + var7, 16777215, -1);
        } else {
            class119.field2324 = (int) ((float) (arg1 * 2) / class208.field3749);
            class191.field3477 = class242.field4331 - (int) ((float) arg3 / class208.field3749);
            class208.field3751 = (int) ((float) (arg3 * 2) / class208.field3749);
            class167.field3076 = -((int) ((float) arg1 / class208.field3749)) + class241.field4304;
            int var8 = -((int) ((float) arg3 / class208.field3749)) + class242.field4331;
            int var9 = class241.field4304 - (int) ((float) arg1 / class208.field3749);
            int var10 = (int) ((float) arg1 / class208.field3749) + class241.field4304;
            int var11 = class242.field4331 - -((int) ((float) arg3 / class208.field3749));
            class91.method741(var9, arg4 - -arg1, arg0, var11, arg4, var10, true, var8, arg0 + arg3);
            class49.method486(arg1 + arg4, var10, var8, arg0, var11, arg0 - -arg3, arg4, var9, -28637);
            class164.method1212(arg0, arg4, var10, var8, var9, (byte) -116, var11, arg1 + arg4, arg0 + arg3);
            if (arg2 < class252.field4453) {
                --class252.field4453;
            }
            if (class197.field3570) {
                int var12 = arg0 + arg3 + -5;
                int var13 = arg1 + -8 + arg4;
                int var14 = 16776960;
                class232.field4126.method1458(class160.method1188(new class30[] { class113.field2245, class73.method675(-45, class136.field2656) }, 0), var12, var13, 16776960, -1);
                int var17 = var13 - 15;
                Runtime var15 = Runtime.getRuntime();
                int var16 = (int) ((var15.totalMemory() + -var15.freeMemory()) / 1024L);
                if (~var16 < -65537) {
                    var14 = 16711680;
                }
                class232.field4126.method1458(class160.method1188(new class30[] { class211.field3805, class73.method675(arg2 ^ 10, var16), class261.field4617 }, 0), var12, var17, var14, -1);
                var13 = var17 - 15;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(IIIIIII)V")
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field4422 = arg2;
        this.field4415 = arg0;
        this.field4426 = arg1;
        this.field4428 = arg3;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1750(int arg0, int arg1, int arg2, int arg3) {
        if (!class87.method731(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class138.method1045(var4 + 1, class242.field4333[arg0][arg1][arg2] + arg3, var5 + 1) && class138.method1045(var4 + 128 - 1, class242.field4333[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class138.method1045(var4 + 128 - 1, class242.field4333[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class138.method1045(var4 + 1, class242.field4333[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method1751(int arg0) {
        field4420 = null;
        if (arg0 < 70) {
            method1748((class151) null, false);
        }
        field4418 = null;
        field4423 = null;
        field4416 = null;
    }
}
