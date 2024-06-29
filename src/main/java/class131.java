import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class131 extends class134 {

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[B")
    public byte[] field2012;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[I")
    public static int[] field2016 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2014 = "wave:";

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lfa;III)Lti;")
    public static final class5 method875(class273 arg0, int arg1, int arg2, int arg3) {
        field2019++;
        if (arg2 == 3) {
            return class163.method1081(0, arg0, arg3, arg1) ? class313.method2120(108) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
    public static void method876(int arg0) {
        field2016 = null;
        if (arg0 != 2718) {
            field2013 = 119;
        }
        field2014 = null;
    }

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)V")
    public static final void method877(int arg0) {
        if (arg0 != 1) {
            field2014 = null;
        }
        class87.field1360.method144(0);
        field2022++;
        class33.field412.method144(0);
        class27.field342.method144(0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZLjava/lang/String;Lfa;)Lmg;")
    public static final class288 method878(int arg0, boolean arg1, String arg2, class273 arg3) {
        int var4 = arg3.method1895(arg2, false);
        field2017++;
        if (var4 == -1) {
            return new class288(0);
        }
        if (arg0 != -2) {
            field2018 = -75;
        }
        int[] var5 = arg3.method1875(var4, 0);
        class288 var6 = new class288(var5.length);
        int var7 = 0;
        int var8 = 0;
        while (true) {
            while (var7 < var6.field4792) {
                class202 var9 = new class202(arg3.method1877(var5[var8++], var4, (byte) 66));
                int var10 = var9.method1440(20404);
                int var11 = var9.method1419(99);
                int var12 = var9.method1420((byte) 0);
                if (!arg1 && var12 == 1) {
                    var6.field4792--;
                } else {
                    var6.field4795[var7] = var10;
                    var6.field4796[var7] = new class314();
                    var6.field4796[var7].field5051 = var11;
                    var7++;
                }
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "([B)V")
    public class131(byte[] arg0) {
        this.field2012 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V")
    public static final void method879(int arg0) {
        field2021++;
        class218.field3482.method144(arg0);
        class69.field1009.method144(0);
        class12.field152.method144(0);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIII)V")
    public static final void method880(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2015++;
        int var6 = arg5;
        int var7 = 0;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        if (arg0 <= 78) {
            method879(-11);
        }
        int var10 = var8 << 1;
        int var11 = arg5 << 1;
        int var12 = var9 << 1;
        int var13 = var9 - ((var11 - 1) * var10);
        int var14 = (1 - var11) * var8 + var12;
        int var15 = var8 << 2;
        int var16 = ((var7 << 1) + 3) * var12;
        int var17 = ((arg5 << 1) - 3) * var10;
        int var18 = var9 << 2;
        int var19 = (var7 + 1) * var18;
        if (arg4 >= class63.field941 && class75.field1180 >= arg4) {
            int var20 = class245.method1720(class53.field711, -81, arg1 + arg2, class87.field1356);
            int var21 = class245.method1720(class53.field711, -91, arg1 - arg2, class87.field1356);
            class71.method451(arg3, true, var20, var21, class130.field2005[arg4]);
        }
        int var22 = (arg5 - 1) * var15;
        while (var6 > 0) {
            var6--;
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var16;
                    var13 += var19;
                    var19 += var18;
                    var16 += var18;
                    var7++;
                }
            }
            if (var13 < 0) {
                var7++;
                var14 += var16;
                var16 += var18;
                var13 += var19;
                var19 += var18;
            }
            var14 += -var22;
            var13 += -var17;
            var22 -= var15;
            var17 -= var15;
            int var23 = arg4 - var6;
            int var24 = arg4 + var6;
            if (class63.field941 <= var24 && var23 <= class75.field1180) {
                int var25 = class245.method1720(class53.field711, -49, arg1 + var7, class87.field1356);
                int var26 = class245.method1720(class53.field711, -126, arg1 - var7, class87.field1356);
                if (var23 >= class63.field941) {
                    class71.method451(arg3, true, var25, var26, class130.field2005[var23]);
                }
                if (var24 <= class75.field1180) {
                    class71.method451(arg3, true, var25, var26, class130.field2005[var24]);
                }
            }
        }
    }
}
