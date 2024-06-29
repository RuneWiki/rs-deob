import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class471 extends class73 {

    @OriginalMember(owner = "client!dv", name = "B", descriptor = "I")
    public int field6982 = -1;

    @OriginalMember(owner = "client!dv", name = "D", descriptor = "I")
    public int field6984 = -1;

    @OriginalMember(owner = "client!dv", name = "R", descriptor = "[F")
    public static float[] field6996 = new float[16384];

    @OriginalMember(owner = "client!dv", name = "P", descriptor = "[F")
    public static float[] field6994 = new float[16384];

    @OriginalMember(owner = "client!dv", name = "S", descriptor = "Lho;")
    public static class103 field6997;

    @OriginalMember(owner = "client!dv", name = "T", descriptor = "[I")
    public static int[] field6998;

    @OriginalMember(owner = "client!dv", name = "F", descriptor = "F")
    public static float field6986;

    @OriginalMember(owner = "client!dv", name = "A", descriptor = "I")
    public static int field6981;

    @OriginalMember(owner = "client!dv", name = "C", descriptor = "I")
    public static int field6983;

    @OriginalMember(owner = "client!dv", name = "E", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!dv", name = "G", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!dv", name = "H", descriptor = "I")
    public int field6988;

    @OriginalMember(owner = "client!dv", name = "J", descriptor = "I")
    public int field6989;

    @OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
    public int field6990;

    @OriginalMember(owner = "client!dv", name = "M", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!dv", name = "N", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!dv", name = "O", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!dv", name = "Q", descriptor = "I")
    public int field6995;

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(I)V")
    public static void method2872(int arg0) {
        field6996 = null;
        field6997 = null;
        if (arg0 < 113) {
            field6986 = -0.1382436F;
        }
        field6998 = null;
        field6994 = null;
    }

    @OriginalMember(owner = "client!dv", name = "c", descriptor = "(BLza;)V")
    public final void method36(byte arg0, class287 arg1) {
        if (arg0 > -120) {
            this.method50((byte) -55, (class287) null);
        }
        ++field6991;
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[IIBII)V")
    public static final void method2873(int arg0, int arg1, int arg2, int[] arg3, int arg4, byte arg5, int arg6, int arg7) {
        ++field6981;
        if (arg1 > 0 && !class119.method713(arg1, -94)) {
            throw new IllegalArgumentException("");
        } else if (~arg4 < -1 && !class119.method713(arg4, -121)) {
            throw new IllegalArgumentException("");
        } else if (arg5 == -59) {
            if (arg2 != 32993) {
                throw new IllegalArgumentException("");
            } else {
                int var8 = 0;
                int var9 = ~arg4 < ~arg1 ? arg1 : arg4;
                int var10 = arg1 >> 1;
                int var11 = arg4 >> 1;
                int[] var12 = arg3;
                int[] var13 = new int[var10 * var11];
                while (true) {
                    OpenGL.glTexImage2Di(arg6, var8, arg7, arg1, arg4, 0, arg2, arg0, var12, 0);
                    if (~var9 >= -2) {
                        return;
                    }
                    int var14 = 0;
                    int var15 = 0;
                    int var16 = arg1 + var15;
                    int[] var17 = var13;
                    for (int var18 = 0; ~var11 < ~var18; ++var18) {
                        for (int var19 = 0; var10 > var19; ++var19) {
                            int var20 = var12[var15++];
                            int var21 = var12[var16++];
                            int var22 = var12[var15++];
                            int var23 = var12[var16++];
                            int var24 = var20 >> 24 & 255;
                            int var25 = var20 >> 16 & 255;
                            int var26 = var20 & 255;
                            int var27 = var20 >> 8 & 255;
                            int var28 = (var22 & 255) + var26;
                            int var29 = (var22 >> 8 & 255) + var27;
                            int var30 = (255 & var22 >> 24) + var24;
                            int var31 = (var22 >> 16 & 255) + var25;
                            int var32 = (var21 >> 8 & 255) + var29;
                            int var33 = (var21 >> 16 & 255) + var31;
                            int var34 = (var21 >> 24 & 255) + var30;
                            int var35 = (255 & var21) + var28;
                            int var36 = ((var23 & 65418) >> 8) + var32;
                            int var37 = (255 & var23 >> 16) + var33;
                            int var38 = (255 & var23 >> 24) + var34;
                            int var39 = (var23 & 255) + var35;
                            var13[var14++] = class219.method1381(class219.method1381(class95.method534(var36 << 6, 65280), class219.method1381(class95.method534(var38, 1020) << 22, class95.method534(var37, 1020) << 14)), class95.method534(1020, var39) >> 2);
                        }
                        var16 += arg1;
                        var15 += arg1;
                    }
                    var13 = var12;
                    var12 = var17;
                    arg1 = var10;
                    arg4 = var11;
                    ++var8;
                    var10 >>= 1;
                    var9 >>= 1;
                    var11 >>= 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "([BIIBILjava/lang/String;)I")
    public static final int method2874(byte[] arg0, int arg1, int arg2, byte arg3, int arg4, String arg5) {
        ++field6993;
        int var6 = -arg4 + arg1;
        if (arg3 != -1) {
            field6998 = null;
        }
        for (int var7 = 0; var7 < var6; ++var7) {
            char var8 = arg5.charAt(arg4 + var7);
            if (~var8 < -1 && var8 < 128 || ~var8 <= -161 && var8 <= 255) {
                arg0[arg2 - -var7] = (byte) var8;
            } else if (var8 != 8364) {
                if (~var8 == -8219) {
                    arg0[arg2 + var7] = -126;
                } else if (~var8 == -403) {
                    arg0[arg2 + var7] = -125;
                } else if (~var8 == -8223) {
                    arg0[arg2 + var7] = -124;
                } else if (var8 != 8230) {
                    if (var8 == 8224) {
                        arg0[arg2 + var7] = -122;
                    } else if (var8 != 8225) {
                        if (~var8 == -711) {
                            arg0[arg2 + var7] = -120;
                        } else if (var8 == 8240) {
                            arg0[arg2 + var7] = -119;
                        } else if (~var8 == -353) {
                            arg0[arg2 + var7] = -118;
                        } else if (var8 == 8249) {
                            arg0[arg2 - -var7] = -117;
                        } else if (var8 == 338) {
                            arg0[arg2 + var7] = -116;
                        } else if (var8 == 381) {
                            arg0[arg2 - -var7] = -114;
                        } else if (var8 != 8216) {
                            if (var8 == 8217) {
                                arg0[arg2 + var7] = -110;
                            } else if (~var8 == -8221) {
                                arg0[arg2 - -var7] = -109;
                            } else if (~var8 != -8222) {
                                if (var8 == 8226) {
                                    arg0[arg2 + var7] = -107;
                                } else if (var8 != 8211) {
                                    if (var8 != 8212) {
                                        if (var8 != 732) {
                                            if (var8 == 8482) {
                                                arg0[arg2 + var7] = -103;
                                            } else if (~var8 != -354) {
                                                if (~var8 != -8251) {
                                                    if (var8 == 339) {
                                                        arg0[arg2 + var7] = -100;
                                                    } else if (~var8 != -383) {
                                                        if (var8 == 376) {
                                                            arg0[arg2 + var7] = -97;
                                                        } else {
                                                            arg0[arg2 + var7] = 63;
                                                        }
                                                    } else {
                                                        arg0[arg2 - -var7] = -98;
                                                    }
                                                } else {
                                                    arg0[arg2 + var7] = -101;
                                                }
                                            } else {
                                                arg0[arg2 + var7] = -102;
                                            }
                                        } else {
                                            arg0[arg2 + var7] = -104;
                                        }
                                    } else {
                                        arg0[arg2 + var7] = -105;
                                    }
                                } else {
                                    arg0[arg2 - -var7] = -106;
                                }
                            } else {
                                arg0[arg2 + var7] = -108;
                            }
                        } else {
                            arg0[arg2 - -var7] = -111;
                        }
                    } else {
                        arg0[arg2 + var7] = -121;
                    }
                } else {
                    arg0[arg2 + var7] = -123;
                }
            } else {
                arg0[arg2 + var7] = -128;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!dv", name = "b", descriptor = "(BLza;)Luc;")
    public final class23 method50(byte arg0, class287 arg1) {
        ++field6983;
        class124 var3 = arg1.method1183();
        if (arg0 != -112) {
            return null;
        } else {
            var3.method743(super.field921, super.field919, super.field926);
            class23 var4 = class117.method703(3, arg0 + 150);
            if (~this.field6984 != 0) {
                class373 var5 = class237.field3158.method236(-18315, this.field6984).method1277(this.field6988, 2048, -1, -129, (class260) null, 0, 0, arg1, (class136) null);
                if (var5 != null) {
                    var5.method2051(var3, var4.field226[2], 0);
                }
            }
            if (~this.field6982 != 0) {
                class373 var6 = class237.field3158.method236(-18315, this.field6982).method1277(this.field6995, 2048, -1, -129, (class260) null, 0, 0, arg1, (class136) null);
                if (var6 != null) {
                    var6.method2051(var3, var4.field226[1], 0);
                }
            }
            class373 var7 = class237.field3158.method236(-18315, this.field6990).method1277(this.field6989, 2048, -1, -129, (class260) null, 0, 0, arg1, (class136) null);
            if (var7 != null) {
                var7.method2051(var3, var4.field226[0], 0);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILza;BI)Z")
    public final boolean method37(int arg0, class287 arg1, byte arg2, int arg3) {
        ++field6992;
        class124 var5 = arg1.method1183();
        var5.method743(super.field921, super.field919, super.field926);
        class373 var6 = class237.field3158.method236(-18315, this.field6990).method1277(this.field6989, 131072, -1, -129, (class260) null, 0, 0, arg1, (class136) null);
        if (var6 != null && var6.method2026(arg3, arg0, var5, true)) {
            return true;
        } else {
            if (~this.field6982 != 0) {
                class373 var7 = class237.field3158.method236(-18315, this.field6982).method1277(this.field6995, 131072, -1, -129, (class260) null, 0, 0, arg1, (class136) null);
                if (var7 != null && var7.method2026(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            if (arg2 > -64) {
                return false;
            } else {
                if (~this.field6984 != 0) {
                    class373 var8 = class237.field3158.method236(-18315, this.field6984).method1277(this.field6988, 131072, -1, -129, (class260) null, 0, 0, arg1, (class136) null);
                    if (var8 != null && var8.method2026(arg3, arg0, var5, true)) {
                        return true;
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIBILer;Lir;ILlr;)V")
    public static final void method2875(int arg0, int arg1, byte arg2, int arg3, class70 arg4, class22 arg5, int arg6, class531 arg7) {
        ++field6985;
        class325 var8 = new class325();
        var8.field4309 = arg3 << 7;
        var8.field4317 = arg0;
        var8.field4313 = arg6 << 7;
        if (arg4 != null) {
            var8.field4316 = arg4;
            int var9 = arg4.field865;
            int var10 = arg4.field857;
            if (~arg1 == -2 || arg1 == 3) {
                var9 = arg4.field857;
                var10 = arg4.field865;
            }
            var8.field4311 = arg4.field845;
            var8.field4318 = arg4.field846;
            var8.field4308 = arg6 - -var9 << 7;
            var8.field4327 = arg3 + var10 << 7;
            var8.field4329 = arg4.field881;
            var8.field4310 = arg4.field859 << 7;
            var8.field4328 = arg4.field861;
            var8.field4320 = arg4.field855;
            if (arg4.field848 != null) {
                var8.field4325 = true;
                var8.method1915(-40751577);
            }
            if (var8.field4329 != null) {
                var8.field4319 = (int) ((double) (var8.field4328 - var8.field4318) * Math.random()) + var8.field4318;
            }
            class282.field3740.method975(0, var8);
        } else if (arg5 == null) {
            if (arg7 != null) {
                var8.field4326 = arg7;
                var8.field4308 = arg7.method546(24273) + arg6 << 7;
                var8.field4327 = arg7.method546(24273) + arg3 << 7;
                var8.field4320 = class98.method566(127, arg7);
                var8.field4311 = arg7.field7790;
                var8.field4310 = arg7.field7801 << 7;
                class264.field3548.method291((long) arg7.field1211, var8, -36);
            }
        } else {
            var8.field4312 = arg5;
            class212 var11 = arg5.field220;
            if (var11.field2903 != null) {
                var8.field4325 = true;
                var11 = var11.method1350(class52.field606, -1);
            }
            if (var11 != null) {
                var8.field4327 = var11.field2904 + arg3 << 7;
                var8.field4308 = arg6 - -var11.field2904 << 7;
                var8.field4320 = class294.method1769(arg5, true);
                var8.field4311 = var11.field2907;
                var8.field4310 = var11.field2900 << 7;
            }
            class193.field2491.method975(0, var8);
        }
        if (arg2 >= -58) {
            field6986 = -0.5178635F;
        }
    }

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field6996[var2] = (float) Math.sin((double) var2 * var0);
            field6994[var2] = (float) Math.cos((double) var2 * var0);
        }
        field6997 = new class103(16, 3);
        field6998 = new int[50];
    }
}
