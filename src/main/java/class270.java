import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mu")
public class class270 {

    @OriginalMember(owner = "client!mu", name = "h", descriptor = "I")
    public static int field3401 = -1;

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "[I")
    public static int[] field3396 = new int[200];

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "I")
    public static int field3395;

    @OriginalMember(owner = "client!mu", name = "d", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!mu", name = "j", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!mu", name = "l", descriptor = "J")
    public long field3405;

    @OriginalMember(owner = "client!mu", name = "i", descriptor = "Ldga;")
    public static class190 field3402;

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "Lmu;")
    public class270 field3394;

    @OriginalMember(owner = "client!mu", name = "k", descriptor = "Lmu;")
    public class270 field3404;

    @OriginalMember(owner = "client!mu", name = "b", descriptor = "(B)V")
    public static void method1518(byte arg0) {
        field3396 = null;
        if (arg0 > -40) {
            method1523(-44, 25, -84);
        }
        field3402 = null;
    }

    @OriginalMember(owner = "client!mu", name = "c", descriptor = "(B)V")
    public final void method1519(byte arg0) {
        field3398++;
        if (arg0 != 121) {
            this.method1520(-68);
        }
        if (this.field3404 != null) {
            this.field3404.field3394 = this.field3394;
            this.field3394.field3404 = this.field3404;
            this.field3394 = null;
            this.field3404 = null;
        }
    }

    @OriginalMember(owner = "client!mu", name = "e", descriptor = "(I)Z")
    public final boolean method1520(int arg0) {
        int var2 = 69 / ((arg0 - 47) / 59);
        field3395++;
        return this.field3404 != null;
    }

    @OriginalMember(owner = "client!mu", name = "f", descriptor = "(I)[Lbi;")
    public static final class438[] method1521(int arg0) {
        field3403++;
        if (arg0 >= -105) {
            field3402 = null;
        }
        if (class168.field2015 == null) {
            class438[] var1 = class63.method426(-3, class623.field8837);
            class438[] var2 = new class438[var1.length];
            int var3 = 0;
            int var4 = class601.field8530.method1844(class150.field1711, true);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class438 var9 = var1[var5];
                if ((var9.field6088 <= 0 || var9.field6088 >= 24) && var9.field6090 >= 800 && var9.field6092 >= 600 && (var4 != 2 || var9.field6090 <= 800 && var9.field6092 <= 600) && (var4 != 1 || var9.field6090 <= 1024 && var9.field6092 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class438 var11 = var2[var10];
                        if (var9.field6090 == var11.field6090 && var9.field6092 == var11.field6092) {
                            if (var9.field6088 > var11.field6088) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class168.field2015 = new class438[var3];
            class652.method3677(var2, 0, class168.field2015, 0, var3);
            int[] var6 = new int[class168.field2015.length];
            for (int var7 = 0; var7 < class168.field2015.length; var7++) {
                class438 var8 = class168.field2015[var7];
                var6[var7] = var8.field6092 * var8.field6090;
            }
            class519.method2957(class168.field2015, var6, 1);
        }
        return class168.field2015;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(FIIIIFIIIF[FII)V")
    public static final void method1522(float arg0, int arg1, int arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, float arg9, float[] arg10, int arg11, int arg12) {
        int var13 = arg4 - arg6;
        int var14 = arg1 - arg11;
        field3400++;
        int var15 = arg3 - arg12;
        float var16 = arg10[2] * (float) var15 + arg10[0] * (float) var14 + arg10[1] * (float) var13;
        if (arg8 != 9830) {
            method1521(-98);
        }
        float var17 = arg10[5] * (float) var15 + arg10[3] * (float) var14 + arg10[4] * (float) var13;
        float var18 = arg10[8] * (float) var15 + arg10[6] * (float) var14 + arg10[7] * (float) var13;
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg9 + var16 + 0.5F;
            var20 = arg0 + 0.5F - var18;
        } else if (arg7 == 1) {
            var19 = arg9 + var16 + 0.5F;
            var20 = arg0 + var18 + 0.5F;
        } else if (arg7 == 2) {
            var19 = arg9 + 0.5F - var16;
            var20 = arg5 + 0.5F - var17;
        } else if (arg7 == 3) {
            var19 = arg9 + var16 + 0.5F;
            var20 = arg5 + 0.5F - var17;
        } else if (arg7 == 4) {
            var20 = arg5 + 0.5F - var17;
            var19 = arg0 + var18 + 0.5F;
        } else {
            var20 = arg5 + 0.5F - var17;
            var19 = arg0 + 0.5F - var18;
        }
        if (arg2 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg2 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg2 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class389.field5196 = var20;
        class622.field8830 = var19;
    }

    @OriginalMember(owner = "client!mu", name = "a", descriptor = "(III)Z")
    public static final boolean method1523(int arg0, int arg1, int arg2) {
        field3399++;
        if (arg2 != -4) {
            field3396 = null;
        }
        if (class185.method1073(arg0, arg1, false)) {
            return class373.method2052(31312, arg1, arg0) | (arg1 & 0x9000) != 0 | class431.method2307(arg0, arg1, (byte) 97) ? true : (arg0 & 0x37) == 0 & ((arg1 & 0x2000) != 0 | class181.method1059(arg0, arg1, true) | class587.method3294(arg0, arg1, (byte) 119));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mu", name = "g", descriptor = "(I)V")
    public static final void method1524(int arg0) {
        class456.field6350 = false;
        class423.field5637 = null;
        field3397++;
        class14.method66(12287);
        if (arg0 != 4489) {
            method1521(-84);
        }
    }
}
