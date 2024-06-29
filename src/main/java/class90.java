import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class90 extends class424 {

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "Z")
    private boolean field1258 = true;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "I")
    private int field1267 = 4096;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "Lhc;")
    public static class368 field1257 = new class368("M", "M", "M", "M");

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1261 = 0;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "[J")
    public static long[] field1263 = new long[100];

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "Ljm;")
    public static class162 field1262 = new class162();

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "F")
    public static float field1265;

    @OriginalMember(owner = "client!ja", name = "L", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "[Lwn;")
    public static class77[] field1259;

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(IB)Lmc;", line = 4)
    public static final class318 method714(int arg0, byte arg1) {
        ++field1266;
        class318 var2 = (class318) class402.field5559.method515(-1, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 != 71) {
                field1262 = null;
            }
            byte[] var3 = class72.field1011.method1926(0, 0, arg0);
            if (var3 != null && ~var3.length < -2) {
                class318 var4 = class431.method2656(var3, false);
                class402.field5559.method519((long) arg0, true, var4);
                return var4;
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V", line = 29)
    public static final void method715(int arg0, int arg1) {
        ++field1254;
        class380.method2359((byte) -52);
        class251.method1616((byte) 41);
        class119.method929(arg1, true, true);
        if (arg0 < 70) {
            field1259 = null;
        }
        class141.method1031(class170.field2406, -27455, class354.field4765, class112.field1726);
        class8.method47(class112.field1726, class354.field4765, (byte) 115);
        class26.method159((byte) 53, class242.field3429);
        class229.method1494(false);
        class136.method1018((byte) 93);
        if (~class98.field1383 != -11) {
            if (~class98.field1383 == -31) {
                class191.method1321(25, 40);
                return;
            }
            if (class98.field1383 == 5) {
                class448.method2783(-123, class112.field1726, class354.field4765);
                return;
            }
        } else {
            class428.method2634(false, 11539);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIZZIIII)V", line = 58)
    public static final void method716(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1260;
        if (arg2 || class26.field335 != arg6 || class133.field1988 != arg4 || class367.field5096 != arg0 && !class397.method2461(-32)) {
            class26.field335 = arg6;
            class367.field5096 = arg0;
            class133.field1988 = arg4;
            if (class397.method2461(-26)) {
                class367.field5096 = 0;
            }
            if (arg3) {
                class191.method1321(28, 40);
            } else {
                class191.method1321(25, 40);
            }
            class405.method2502(1, true, class31.field432, class326.field4432.method2313((byte) -97, class445.field6241));
            int var8 = class6.field65;
            int var9 = class371.field5148;
            class6.field65 = (class26.field335 - (class11.field107 >> 4)) * 8;
            class371.field5148 = (class133.field1988 - (class264.field3620 >> 4)) * 8;
            class337.field4554 = class333.method2026(class26.field335 * 8, class133.field1988 * 8);
            class430.field5988 = null;
            int var10 = class6.field65 - var8;
            int var11 = class371.field5148 - var9;
            if (!arg3) {
                for (int var12 = 0; var12 < 32768; ++var12) {
                    class419 var13 = class428.field5951[var12];
                    if (var13 != null) {
                        for (int var14 = 0; var14 < 10; ++var14) {
                            var13.field2662[var14] -= var10;
                            var13.field2659[var14] -= var11;
                        }
                        var13.field44 -= var11 * 128;
                        var13.field40 -= var10 * 128;
                    }
                }
            } else {
                class53.field674 = 0;
                int var15 = (class11.field107 - 1) * 128;
                int var16 = (class264.field3620 + -1) * 128;
                for (int var17 = 0; var17 < 32768; ++var17) {
                    class419 var22 = class428.field5951[var17];
                    if (var22 != null) {
                        var22.field40 -= var10 * 128;
                        var22.field44 -= var11 * 128;
                        if (var22.field40 >= 0 && ~var15 <= ~var22.field40 && var22.field44 >= 0 && ~var16 <= ~var22.field44) {
                            boolean var23 = true;
                            for (int var24 = 0; ~var24 > -11; ++var24) {
                                var22.field2662[var24] -= var10;
                                var22.field2659[var24] -= var11;
                                if (var22.field2662[var24] < 0 || ~var22.field2662[var24] <= ~class11.field107 || var22.field2659[var24] < 0 || var22.field2659[var24] >= class264.field3620) {
                                    var23 = false;
                                }
                            }
                            if (var23) {
                                class228.field3187[class53.field674++] = var17;
                            } else {
                                class428.field5951[var17].method2586((class233) null, -8);
                                class428.field5951[var17] = null;
                            }
                        } else {
                            class428.field5951[var17].method2586((class233) null, -8);
                            class428.field5951[var17] = null;
                        }
                    }
                }
            }
            int var18 = 0;
            if (arg5 >= -116) {
                method716(-97, 16, true, false, 60, -113, -34, 71);
            }
            while (~var18 > -2049) {
                class423 var20 = class87.field1227[var18];
                if (var20 != null) {
                    for (int var21 = 0; ~var21 > -11; ++var21) {
                        var20.field2662[var21] -= var10;
                        var20.field2659[var21] -= var11;
                    }
                    var20.field40 -= var10 * 128;
                    var20.field44 -= var11 * 128;
                }
                ++var18;
            }
            class343.field4623 = arg0;
            class359.field4970.method2609(false, arg1, class343.field4623, arg7, (byte) 92);
            class406.method2507(var10, (byte) 68, var11);
            for (class352 var19 = (class352) class155.field2207.method1173(0); var19 != null; var19 = (class352) class155.field2207.method1165(true)) {
                var19.field4739 -= var10;
                var19.field4738 -= var11;
                if (var19.field4739 < 0 || ~var19.field4738 > -1 || var19.field4739 >= class11.field107 || var19.field4738 >= class264.field3620) {
                    var19.method1884(false);
                }
            }
            class182.field2561 = 0;
            if (class93.field1300 != 0) {
                class233.field3265 -= var11;
                class93.field1300 -= var10;
            }
            if (!arg3) {
                if (~class26.field337 != -5) {
                    class26.field337 = 1;
                } else {
                    class436.field6153 -= var10 * 128;
                    class431.field6044 -= var11 * 128;
                    class24.field309 -= var10 * 128;
                    class81.field1126 -= var11 * 128;
                }
            } else {
                class313.field4250 -= var10;
                class106.field1499 -= var11;
                class41.field536 -= var10;
                class375.field5213 -= var11 * 128;
                class447.field6263 -= var11;
                class63.field874 -= var10 * 128;
                if (~Math.abs(var10) < ~class11.field107 || Math.abs(var11) > class264.field3620) {
                    class453.method2823(0);
                }
            }
            class302.method1835(0);
            class169.method1204((byte) 75);
            class196.field2843.method1168(124);
            class48.field612.method1168(122);
            class398.field5512.method2476((byte) 0);
            class70.method558(0);
        }
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 275)
    public class90() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V", line = 283)
    public static void method717(byte arg0) {
        field1257 = null;
        field1263 = null;
        if (arg0 <= 96) {
            method717((byte) 111);
        }
        field1262 = null;
        field1259 = null;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lij;B)V", line = 297)
    public static final void method718(class316 arg0, byte arg1) {
        ++field1255;
        class11.field93 = arg0;
        if (arg1 <= 32) {
            field1265 = -0.83562636F;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZ)[[I", line = 317)
    public final int[][] method21(int arg0, boolean arg1) {
        ++field1264;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int[] var4 = this.method2621(0, -124, class174.field2484 & arg0 + -1);
            int[] var5 = this.method2621(0, -123, arg0);
            int[] var6 = this.method2621(0, -126, class174.field2484 & arg0 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; class303.field4135 > var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field1267;
                int var12 = (var5[var10 + 1 & class65.field898] + -var5[class65.field898 & var10 - 1]) * this.field1267;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 - -4096 + var15) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (~var17 == -1) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var12 / var17;
                    var18 = 16777216 / var17;
                    var19 = var11 / var17;
                }
                if (this.field1258) {
                    var19 = (var19 >> 1) + 2048;
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var20;
                var8[var10] = var19;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lrg;BI)V", line = 398)
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 == 1) {
                this.field1258 = ~arg0.method2306((byte) 26) == -2;
            }
        } else {
            this.field1267 = arg0.method2297(13352);
        }
        if (arg1 != -48) {
            this.method19((class366) null, (byte) -49, 96);
        }
        ++field1256;
    }
}
