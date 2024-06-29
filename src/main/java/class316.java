import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class316 extends class30 {

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Ljava/lang/String;")
    public static String field4962 = "Opened title screen";

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "[I")
    public static int[] field4956 = new int[14];

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "F")
    public static float field4958 = 1024.0F;

    @OriginalMember(owner = "client!rc", name = "U", descriptor = "I")
    public static int field4967 = 0;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!rc", name = "Q", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!rc", name = "R", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!rc", name = "S", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!rc", name = "T", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "Lio;")
    public static class250 field4957;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "Ljava/lang/String;")
    public static String field4959;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(III)V", line = 4)
    private final void method2104(int arg0, int arg1, int arg2) {
        ++field4965;
        int var4 = class79.field995[arg2];
        if (arg0 <= 50) {
            field4967 = 88;
        }
        int var5 = class132.field2064[arg1];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class68.field851 = arg2;
            class351.field5426 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class351.field5426 = arg2;
            class68.field851 = arg1;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class351.field5426 = arg2;
            class68.field851 = -arg1 + class369.field5610;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class351.field5426 = class312.field4921 - arg1;
            class68.field851 = arg2;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class351.field5426 = -arg1 + class312.field4921;
            class68.field851 = class369.field5610 - arg2;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class68.field851 = -arg1 + class369.field5610;
            class351.field5426 = -arg2 + class312.field4921;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class351.field5426 = -arg2 + class312.field4921;
            class68.field851 = arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class68.field851 = -arg2 + class369.field5610;
            class351.field5426 = arg1;
        }
        class351.field5426 &= class246.field4033;
        class68.field851 &= class106.field1492;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIZLe;ILfa;)V", line = 79)
    public static final void method2105(int arg0, int arg1, boolean arg2, class312 arg3, int arg4, class127 arg5) {
        ++field4963;
        class138 var6 = class94.method551(6635, arg5.field2011);
        if (~var6.field2158 != 0) {
            int var7;
            if (!arg5.field1986) {
                var7 = 0;
            } else {
                int var8 = arg5.field1983 + arg1;
                var7 = var8 & 3;
            }
            class356 var9 = var6.method1008(arg5.field1996, var7, (byte) -98, arg3);
            if (var9 != null) {
                int var10 = arg5.field2014;
                int var11 = arg5.field1944;
                if (~(1 & var7) == -2) {
                    var11 = arg5.field2014;
                    var10 = arg5.field1944;
                }
                int var12 = var9.method2318();
                int var13 = var9.method2315();
                if (var6.field2152) {
                    var12 = var10 * 4;
                    var13 = var11 * 4;
                }
                if (arg2) {
                    if (var6.field2153 != 0) {
                        var9.method420(arg0, -((var11 + -1) * 4) + arg4, var12, var13, 1, var6.field2153 | -16777216, 1);
                    } else {
                        var9.method2320(arg0, arg4 - -4 - var11 * 4, var12, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "(B)V", line = 136)
    public static void method2106(byte arg0) {
        field4956 = null;
        field4957 = null;
        field4959 = null;
        field4962 = null;
        if (arg0 != 40) {
            method2105(-22, -88, true, (class312) null, 84, (class127) null);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(Ljg;II)V", line = 152)
    public final void method115(class186 arg0, int arg1, int arg2) {
        ++field4966;
        if (~arg2 == -1) {
            super.field376 = arg0.method1322(false) == 1;
        }
        if (arg1 != 6456) {
            field4957 = null;
        }
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "()V", line = 166)
    public class316() {
        super(1, false);
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(III)Ltk;", line = 170)
    public static final class191 method2107(int arg0, int arg1, int arg2) {
        class232 var3 = class423.field6252[arg0][arg1][arg2];
        return var3 != null && var3.field3864 != null ? var3.field3864 : null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)[I", line = 177)
    public final int[] method116(int arg0, byte arg1) {
        ++field4964;
        int[] var3 = super.field371.method2367((byte) -57, arg0);
        if (super.field371.field5586) {
            for (int var4 = 0; ~class369.field5610 < ~var4; ++var4) {
                this.method2104(61, arg0, var4);
                int[] var5 = this.method210((byte) 72, 0, class351.field5426);
                var3[var4] = var5[class68.field851];
            }
        }
        if (arg1 < 49) {
            this.method115((class186) null, 80, -36);
        }
        return var3;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I[IB)V", line = 224)
    public static final void method2108(int arg0, int[] arg1, byte arg2) {
        int var3 = 18 % ((-18 - arg2) / 60);
        for (int var4 = 31; var4 > 0; --var4) {
            int var5 = var4 * 36;
            for (int var6 = 35; var6 > 0; --var6) {
                if (arg1[var5 + var6] == 0 && ~arg1[var6 - -var5 + -37] != -1) {
                    arg1[var5 + var6] = arg0;
                }
            }
        }
        ++field4960;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)[[I", line = 255)
    public final int[][] method203(byte arg0, int arg1) {
        ++field4961;
        if (arg0 != -93) {
            field4962 = null;
        }
        int[][] var3 = super.field360.method2803(arg1, true);
        if (super.field360.field6566) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~var7 > ~class369.field5610; ++var7) {
                this.method2104(85, arg1, var7);
                int[][] var8 = this.method206(class351.field5426, arg0 ^ -95, 0);
                var4[var7] = var8[0][class68.field851];
                var5[var7] = var8[1][class68.field851];
                var6[var7] = var8[2][class68.field851];
            }
        }
        return var3;
    }
}
