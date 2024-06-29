import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class9 extends class303 {

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    private int field145 = -1;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field136 = 0;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public static int field137 = 0;

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "Ljava/lang/String;")
    public static String field135 = "M";

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "Lik;")
    public static class259 field132 = new class259(50);

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public int field134;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public int field142;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field143;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field150;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "Lai;")
    public static class126 field149;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "Lbh;")
    public static class274 field141;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "[I")
    public int[] field146;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)V", line = 5)
    public static final void method71(int arg0, byte arg1) {
        field148++;
        if (arg1 <= 0) {
            field147 = 2;
        }
        class4 var2 = class67.method510(1, 5, arg0);
        var2.method6(255);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILpe;I)V", line = 28)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg0 != -4004) {
            field137 = -29;
        }
        field139++;
        if (arg2 == 0) {
            this.field145 = arg1.method731(false);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V", line = 43)
    public final void method72(byte arg0) {
        super.method72(arg0);
        field140++;
        this.field146 = null;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 52)
    public class9() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)I", line = 59)
    public final int method73(byte arg0) {
        if (arg0 != 2) {
            this.method74(96, -87);
        }
        field150++;
        return this.field145;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)[[I", line = 80)
    public int[][] method74(int arg0, int arg1) {
        int[][] var3 = this.field4772.method1175(arg1 - 169, arg0);
        field143++;
        if (this.field4772.field2488 && this.method75(16891)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class247.field3815 == this.field142 ? arg0 : this.field142 * arg0 / class247.field3815) * this.field134;
            int[] var7 = var3[2];
            if (class70.field1108 == this.field134) {
                for (int var8 = 0; var8 < class70.field1108; var8++) {
                    int var9 = this.field146[var6++];
                    var7[var8] = class280.method2001(255, var9) << 4;
                    var5[var8] = class280.method2001(4080, var9 >> 4);
                    var4[var8] = class280.method2001(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; var10 < class70.field1108; var10++) {
                    int var11 = this.field134 * var10 / class70.field1108;
                    int var12 = this.field146[var6 + var11];
                    var7[var10] = class280.method2001(var12 << 4, 4080);
                    var5[var10] = class280.method2001(var12 >> 4, 4080);
                    var4[var10] = class280.method2001(16711680, var12) >> 12;
                }
            }
        }
        return arg1 == 82 ? var3 : (int[][]) ((int[][]) null);
    }

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)Z", line = 160)
    public final boolean method75(int arg0) {
        field133++;
        if (this.field146 != null) {
            return true;
        } else if (this.field145 >= 0) {
            class7 var2 = class282.field4356 >= 0 ? class6.method31(this.field145, 117, class282.field4356, class255.field3953) : class12.method111(this.field145, 27143, class255.field3953);
            var2.method61();
            this.field142 = var2.field2011;
            this.field146 = var2.field117;
            this.field134 = var2.field2007;
            return true;
        } else if (arg0 == 16891) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V", line = 186)
    public static void method76(boolean arg0) {
        field135 = null;
        field141 = null;
        if (!arg0) {
            method71(14, (byte) 92);
        }
        field149 = null;
        field132 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 203)
    public static final void method77(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class323.field5009 * 128) {
            arg0 = class323.field5009 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class196.field3122 * 128) {
            arg2 = class196.field3122 * 128 - 1;
        }
        class20.field371 = class174.field2731[arg3];
        class204.field3230 = class174.field2732[arg3];
        class249.field3849 = class174.field2731[arg4];
        class10.field170 = class174.field2732[arg4];
        class31.field533 = arg0;
        class203.field3223 = arg1;
        class236.field3717 = arg2;
        class151.field2419 = arg0 / 128;
        class301.field4744 = arg2 / 128;
        class276.field4277 = class151.field2419 - class258.field4008;
        if (class276.field4277 < 0) {
            class276.field4277 = 0;
        }
        class90.field1464 = class301.field4744 - class258.field4008;
        if (class90.field1464 < 0) {
            class90.field1464 = 0;
        }
        class219.field3513 = class258.field4008 + class151.field2419;
        if (class219.field3513 > class323.field5009) {
            class219.field3513 = class323.field5009;
        }
        class110.field1821 = class301.field4744 + class258.field4008;
        if (class110.field1821 > class196.field3122) {
            class110.field1821 = class196.field3122;
        }
        short var15;
        if (class265.field4126) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class258.field4008 + class258.field4008 + 2; var16++) {
            for (int var17 = 0; var17 < class258.field4008 + class258.field4008 + 2; var17++) {
                int var18 = (var16 - class258.field4008 << 7) - (class31.field533 & 0x7F);
                int var19 = (var17 - class258.field4008 << 7) - (class236.field3717 & 0x7F);
                int var20 = class151.field2419 + var16 - class258.field4008;
                int var21 = class301.field4744 + var17 - class258.field4008;
                if (var20 >= 0 && var21 >= 0 && var20 < class323.field5009 && var21 < class196.field3122) {
                    int var22;
                    if (class150.field2404 == null) {
                        var22 = class298.field4701[0][var20][var21] + 128 - class203.field3223;
                    } else {
                        var22 = class150.field2404[0][var20][var21] + 128 - class203.field3223;
                    }
                    int var23 = class298.field4701[3][var20][var21] - class203.field3223 - 1000;
                    class249.field3843[var16][var17] = class70.method538(var18, var23, var22, var19, var15);
                } else {
                    class249.field3843[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class258.field4008 + class258.field4008 + 1; var24++) {
            for (int var25 = 0; var25 < class258.field4008 + class258.field4008 + 1; var25++) {
                class87.field1329[var24][var25] = class249.field3843[var24][var25] || class249.field3843[var24 + 1][var25] || class249.field3843[var24][var25 + 1] || class249.field3843[var24 + 1][var25 + 1];
            }
        }
        class324.field5033 = arg6;
        class298.field4705 = arg7;
        class125.field1992 = arg8;
        class89.field1447 = arg9;
        class37.field670 = arg10;
        class98.method714();
        if (class115.field1885 != null) {
            class151.method1155(true);
            class124.method935(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class265.field4126) {
                class54.field843 = false;
                class308.method2132(0, (byte) -28, 0);
                class97.method702((float[]) null);
                class38.method315();
            }
            class151.method1155(false);
        }
        class124.method935(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
