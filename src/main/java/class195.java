import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class195 extends class310 {

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field3106 = -1;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field3105 = 5063219;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field3107 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field3101 = 0;

    @OriginalMember(owner = "client!s", name = "W", descriptor = "F")
    public static float field3112;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!s", name = "U", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!s", name = "V", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!s", name = "X", descriptor = "I")
    public static int field3113;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "Len;")
    public static class192 field3102;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[S")
    public static short[] field3104;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(Z)V", line = 14)
    public static final void method1506(boolean arg0) {
        if (class260.field4374 != null) {
            class260.field4374.method1516(256);
        }
        if (class65.field1152 != null) {
            class65.field1152.method1516(256);
        }
        field3113++;
        if (arg0) {
            field3104 = (short[]) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[I", line = 33)
    public final int[] method77(int arg0, int arg1) {
        if (arg1 != -13093) {
            field3106 = 74;
        }
        field3110++;
        int[] var3 = this.field4950.method930(arg0, 0);
        if (this.field4950.field2001) {
            class242.method1839(var3, 0, class261.field4405, class230.field3818[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 54)
    public class195() {
        super(0, true);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lqm;I)Ljc;", line = 58)
    public static final class243 method1507(class227 arg0, int arg1) {
        if (arg1 != 64) {
            method1511((class227) null, false);
        }
        field3100++;
        class243 var2 = new class243();
        var2.field4000 = arg0.method1765(true);
        var2.field3999 = class326.method2298(4575, var2.field4000);
        return var2;
    }

    @OriginalMember(owner = "client!s", name = "d", descriptor = "(II)I", line = 73)
    public static final int method1508(int arg0, int arg1) {
        field3109++;
        if (arg0 != 19) {
            method1508(-99, -59);
        }
        int var2 = arg1 >> 6 & 0x3;
        int var3 = arg1 & 0x3F;
        if (var3 == 18) {
            if (var2 == 0) {
                return 1;
            }
            if (var2 == 1) {
                return 2;
            }
            if (var2 == 2) {
                return 4;
            }
            if (var2 == 3) {
                return 8;
            }
        } else if (var3 == 19 || var3 == 21) {
            if (var2 == 0) {
                return 16;
            }
            if (var2 == 1) {
                return 32;
            }
            if (var2 == 2) {
                return 64;
            }
            if (var2 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!s", name = "e", descriptor = "(II)V", line = 128)
    public static final void method1509(int arg0, int arg1) {
        class321 var2 = class46.method370(7, (byte) -106, arg1);
        if (arg0 == 255) {
            field3111++;
            var2.method2261(-129);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(Z)V", line = 140)
    public static void method1510(boolean arg0) {
        field3107 = null;
        if (arg0) {
            field3112 = 1.2853208F;
        }
        field3102 = null;
        field3104 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lqm;Z)V", line = 154)
    public static final void method1511(class227 arg0, boolean arg1) {
        field3103++;
        int var2 = class174.field2778 >> 1;
        byte[][] var3 = new byte[class174.field2776][class174.field2780];
        int var4 = class174.field2781 >> 2 << 10;
        while (arg0.field3793.length > arg0.field3760) {
            int var5 = 0;
            boolean var6 = false;
            int var7 = 0;
            if (arg0.method1720((byte) -105) == 1) {
                var5 = arg0.method1720((byte) -95);
                var7 = arg0.method1720((byte) -14);
                var6 = true;
            }
            int var8 = arg0.method1720((byte) -83);
            int var9 = arg0.method1720((byte) -120);
            int var10 = var8 * 64 - class174.field2772;
            int var11 = class174.field2780 - (var9 * 64 + -class174.field2773) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && var10 + 63 < class174.field2776 && var11 < class174.field2780) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var3[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var6 || var5 * 8 <= var12 && var12 < (var5 * 8 + 8) && var7 * 8 <= var14 && var14 < (var7 * 8 + 8)) {
                            var13[var11 - var14] = arg0.method1733(0);
                        }
                    }
                }
            } else if (var6) {
                arg0.field3760 += 64;
            } else {
                arg0.field3760 += 4096;
            }
        }
        int var15 = class174.field2780;
        int[] var16 = new int[var15];
        int var17 = class174.field2776;
        int[] var18 = new int[var15];
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        if (arg1) {
            method1510(false);
        }
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var17; var22++) {
            if ((var22 & 0x1FF) == 0) {
                class291.method2107(false, true);
            }
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var17 > var24) {
                    int var25 = var3[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class279 var26 = class273.method2045(1, var25 - 1);
                        var18[var23] += var26.field4592;
                        var16[var23] += var26.field4593;
                        var19[var23] += var26.field4590;
                        var20[var23] += var26.field4586;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var3[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class279 var29 = class273.method2045(1, var28 - 1);
                        var18[var23] -= var29.field4592;
                        var16[var23] -= var29.field4593;
                        var19[var23] -= var29.field4590;
                        var20[var23] -= var29.field4586;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class174.field2786[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var15) {
                        var33 += var20[var37];
                        var31 += var19[var37];
                        var34 += var21[var37];
                        var32 += var16[var37];
                        var35 += var18[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var34 -= var21[var38];
                        var35 -= var18[var38];
                        var32 -= var16[var38];
                        var31 -= var19[var38];
                        var33 -= var20[var38];
                    }
                    if (var36 >= 0 && var34 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class181.method1422(15463, var31 / var34, var32 / var34, var35 * 256 / var33);
                        if (var3[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var4 + var40 & 0xFC00) + ((var40 & 0x380) + var41);
                            var39[class343.method2418(var22, 63) + (class343.method2418(var36, 63) << 6)] = class153.field2444[class157.method1218(96, 127, var42)];
                        } else if (var39 != null) {
                            var39[class343.method2418(63, var22) + class343.method2418(4032, var36 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }
}
