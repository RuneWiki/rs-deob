import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class138 extends class288 {

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "I")
    public int field2013;

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[[B")
    public static byte[][] field2014 = new byte[50][];

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "[Lmc;")
    public static class176[] field2012 = new class176[0];

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "[I")
    public static int[] field2009;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIIZ)V")
    public static final void method901(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg0 == 127) {
            field2011++;
            class55.method337(field2012.length - 1, 0, arg1, arg2, arg3, 64, arg4);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;")
    public static final String method902(String arg0, String arg1, byte arg2, String arg3) {
        field2007++;
        if (arg2 != -120) {
            method903(96);
        }
        int var4 = arg0.length();
        int var5 = arg3.length();
        int var6 = arg1.length();
        if (var5 == 0) {
            throw new IllegalArgumentException("Key cannot have zero length");
        }
        int var7 = var6 - var5;
        int var8 = var4;
        if (var7 != 0) {
            int var9 = 0;
            while (true) {
                int var10 = arg0.indexOf(arg3, var9);
                if (var10 < 0) {
                    break;
                }
                var9 = var5 + var10;
                var8 += var7;
            }
        }
        StringBuffer var11 = new StringBuffer(var8);
        int var12 = 0;
        while (true) {
            int var13 = arg0.indexOf(arg3, var12);
            if (var13 < 0) {
                var11.append(arg0.substring(var12));
                return var11.toString();
            }
            var11.append(arg0.substring(var12, var13));
            var11.append(arg1);
            var12 = var5 + var13;
        }
    }

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
    public static void method903(int arg0) {
        field2012 = null;
        if (arg0 < -101) {
            field2014 = null;
            field2009 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILqi;)V")
    public static final void method904(int arg0, class216 arg1) {
        field2008++;
        byte[][] var2 = new byte[client.field4446][class133.field1940];
        if (arg0 != -1) {
            field2012 = null;
        }
        int var3 = class203.field2873 >> 1;
        int var4 = class226.field3193 >> 2 << 10;
        while (arg1.field3021 < arg1.field3030.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg1.method1407(arg0 + 123) == 1) {
                var35 = arg1.method1407(arg0 + 106);
                var33 = true;
                var34 = arg1.method1407(119);
            }
            int var36 = arg1.method1407(104);
            int var37 = arg1.method1407(108);
            int var38 = var36 * 64 - class230.field3313;
            int var39 = class133.field1940 + class1.field1 - (var37 * 64) - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && client.field4446 > (var38 + 63) && var39 < class133.field1940) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var2[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || (var35 * 8) <= var40 && var40 < (var35 * 8 + 8) && (var34 * 8) <= var42 && var34 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg1.method1355(true);
                        }
                    }
                }
            } else if (var33) {
                arg1.field3021 += 64;
            } else {
                arg1.field3021 += 4096;
            }
        }
        int var5 = client.field4446;
        int var6 = class133.field1940;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var2[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class19 var29 = class1.method7(var28 - 1, -5629);
                        var9[var13] += var29.field235;
                        var8[var13] += var29.field239;
                        var7[var13] += var29.field228;
                        var10[var13] += var29.field227;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var2[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class19 var32 = class1.method7(var31 - 1, -5629);
                        var9[var13] -= var32.field235;
                        var8[var13] -= var32.field239;
                        var7[var13] -= var32.field228;
                        var10[var13] -= var32.field227;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int[][] var18 = class104.field1413[var12 >> 6];
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var16 += var7[var21];
                        var17 += var11[var21];
                        var19 += var10[var21];
                        var14 += var9[var21];
                        var15 += var8[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var15 -= var8[var22];
                        var16 -= var7[var22];
                        var19 -= var10[var22];
                        var17 -= var11[var22];
                        var14 -= var9[var22];
                    }
                    if (var20 >= 0 && var17 > 0) {
                        int[] var23 = var18[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class233.method1516(var16 / var17, var14 * 256 / var19, arg0 ^ 0x6A69, var15 / var17);
                        if (var2[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var18[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + (var4 + var24 & 0xFC00) + var25;
                            var23[(class5.method26(63, var20) << 6) + class5.method26(var12, 63)] = class297.field4693[class145.method949(arg0 + 65409, var26, 96)];
                        } else if (var23 != null) {
                            var23[(class5.method26(var20, 63) << 6) + class5.method26(var12, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "()V")
    public class138() {
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I)V")
    public class138(int arg0) {
        this.field2013 = arg0;
    }
}
