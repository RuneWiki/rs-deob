import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public int field275;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[B")
    public byte[] field270;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[S")
    public short[] field264;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "[I")
    public int[] field278;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[Ljava/lang/String;")
    public String[] field266;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[S")
    public short[] field276;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[Log;")
    public static class221[] field265 = new class221[2048];

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Z")
    public static boolean field263 = false;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Log;")
    public static class221 field280 = new class221(new byte[5000]);

    @OriginalMember(owner = "client!n", name = "s", descriptor = "[I")
    public static int[] field281 = new int[99];

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "Lsg;")
    public static class163 field282;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method123(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class20.field344++;
        class66.field1095 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class75.field1214; var12 < class156.field2537; var12++) {
            class134[][] var38 = class288.field4563[var12];
            for (int var39 = class230.field3790; var39 < class244.field3908; var39++) {
                for (int var40 = class235.field3825; var40 < class220.field3605; var40++) {
                    class134 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (class254.field4040[var39 + class148.field2370 - class8.field105][var40 + class148.field2370 - class214.field3496] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field2154 = true;
                            var41.field2135 = true;
                            if (var41.field2151 > 0) {
                                var41.field2142 = true;
                            } else {
                                var41.field2142 = false;
                            }
                            class66.field1095++;
                        } else {
                            var41.field2154 = false;
                            var41.field2135 = false;
                            var41.field2134 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field2133 != null) {
                                    class229 var42 = var41.field2133;
                                    var42.field3775.method116(0, var12, var42.field3781, var42.field3788, var42.field3774);
                                    if (var42.field3784 != null) {
                                        var42.field3784.method116(0, var12, var42.field3781, var42.field3788, var42.field3774);
                                    }
                                }
                                if (var41.field2143 != null) {
                                    class278 var43 = var41.field2143;
                                    var43.field4390.method116(var43.field4378, var12, var43.field4379, var43.field4382, var43.field4384);
                                    if (var43.field4375 != null) {
                                        var43.field4375.method116(var43.field4378, var12, var43.field4379, var43.field4382, var43.field4384);
                                    }
                                }
                                if (var41.field2140 != null) {
                                    class42 var44 = var41.field2140;
                                    var44.field789.method116(0, var12, var44.field783, var44.field787, var44.field788);
                                }
                                if (var41.field2153 != null) {
                                    for (int var45 = 0; var45 < var41.field2151; var45++) {
                                        class289 var46 = var41.field2153[var45];
                                        var46.field4581.method116(var46.field4578, var12, var46.field4580, var46.field4570, var46.field4577);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class83.field1307 == class124.field2012;
        for (int var14 = class75.field1214; var14 < class156.field2537; var14++) {
            class134[][] var27 = class288.field4563[var14];
            for (int var28 = -class148.field2370; var28 <= 0; var28++) {
                int var29 = class8.field105 + var28;
                int var30 = class8.field105 - var28;
                if (var29 >= class230.field3790 || var30 < class244.field3908) {
                    for (int var31 = -class148.field2370; var31 <= 0; var31++) {
                        int var32 = class214.field3496 + var31;
                        int var33 = class214.field3496 - var31;
                        if (var29 >= class230.field3790) {
                            if (var32 >= class235.field3825) {
                                class134 var34 = var27[var29][var32];
                                if (var34 != null && var34.field2154) {
                                    class97.method717(var34, true);
                                }
                            }
                            if (var33 < class220.field3605) {
                                class134 var35 = var27[var29][var33];
                                if (var35 != null && var35.field2154) {
                                    class97.method717(var35, true);
                                }
                            }
                        }
                        if (var30 < class244.field3908) {
                            if (var32 >= class235.field3825) {
                                class134 var36 = var27[var30][var32];
                                if (var36 != null && var36.field2154) {
                                    class97.method717(var36, true);
                                }
                            }
                            if (var33 < class220.field3605) {
                                class134 var37 = var27[var30][var33];
                                if (var37 != null && var37.field2154) {
                                    class97.method717(var37, true);
                                }
                            }
                        }
                        if (class66.field1095 == 0) {
                            if (!var13) {
                                class5.field57 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class75.field1214; var15 < class156.field2537; var15++) {
            class134[][] var16 = class288.field4563[var15];
            for (int var17 = -class148.field2370; var17 <= 0; var17++) {
                int var18 = class8.field105 + var17;
                int var19 = class8.field105 - var17;
                if (var18 >= class230.field3790 || var19 < class244.field3908) {
                    for (int var20 = -class148.field2370; var20 <= 0; var20++) {
                        int var21 = class214.field3496 + var20;
                        int var22 = class214.field3496 - var20;
                        if (var18 >= class230.field3790) {
                            if (var21 >= class235.field3825) {
                                class134 var23 = var16[var18][var21];
                                if (var23 != null && var23.field2154) {
                                    class97.method717(var23, false);
                                }
                            }
                            if (var22 < class220.field3605) {
                                class134 var24 = var16[var18][var22];
                                if (var24 != null && var24.field2154) {
                                    class97.method717(var24, false);
                                }
                            }
                        }
                        if (var19 < class244.field3908) {
                            if (var21 >= class235.field3825) {
                                class134 var25 = var16[var19][var21];
                                if (var25 != null && var25.field2154) {
                                    class97.method717(var25, false);
                                }
                            }
                            if (var22 < class220.field3605) {
                                class134 var26 = var16[var19][var22];
                                if (var26 != null && var26.field2154) {
                                    class97.method717(var26, false);
                                }
                            }
                        }
                        if (class66.field1095 == 0) {
                            if (!var13) {
                                class5.field57 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class5.field57 = false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)I")
    public final int method124(byte arg0, int arg1) {
        if (arg0 >= -46) {
            method127(-34, -94);
        }
        field267++;
        return this.field270[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 != 0) {
            return;
        }
        if (arg7 >= class255.field4055 && class9.field128 >= arg4 && class161.field2561 <= arg5 && arg3 <= class51.field896) {
            class225.method1582(arg2, arg0, arg3, arg5, arg4, 1652, arg6, arg7);
        } else {
            class274.method1848(arg5, arg2, -31959, arg4, arg7, arg3, arg0, arg6);
        }
        field273++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method126(int arg0) {
        if (arg0 < 67) {
            method127(-41, 14);
        }
        field282 = null;
        field280 = null;
        field265 = null;
        field281 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public static final int method127(int arg0, int arg1) {
        if (arg0 != 5000) {
            method131(-109, -117, -36);
        }
        field268++;
        return arg1 == 16711935 ? -1 : class207.method1428(arg1, (byte) 102);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)Z")
    public final boolean method128(int arg0, byte arg1) {
        int var3 = 81 % ((arg1 - 54) / 33);
        field277++;
        return (this.field270[arg0] & 0x8) != 0;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Z")
    public final boolean method129(int arg0, int arg1) {
        field272++;
        int var3 = 6 % ((-arg0 - 37) / 60);
        return (this.field270[arg1] & 0x10) == 0;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)Z")
    public final boolean method130(int arg0, int arg1) {
        field269++;
        if (arg1 == 4) {
            return (this.field270[arg0] & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(I)V")
    public class16(int arg0) {
        this.field275 = arg0;
        this.field270 = new byte[this.field275];
        this.field264 = new short[this.field275];
        this.field278 = new int[this.field275];
        this.field266 = new String[this.field275];
        this.field276 = new short[this.field275];
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method131(int arg0, int arg1, int arg2) {
        field279++;
        for (int var3 = arg1; var3 < class158.field2558; var3++) {
            class45 var4 = class57.method423(var3, (byte) 107);
            if (var4 != null) {
                int var5 = var4.field820;
                if (var5 >= 0 && !class69.field1140.method1115((byte) 83, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field812 >= 0) {
                    int var10 = var4.field812;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class69.field1149[class230.method1611(false, var12, 96)];
                } else if (var5 >= 0) {
                    var9 = class69.field1149[class230.method1611(false, class69.field1140.method1113(var5, 65535), 96)];
                } else if (var4.field819 == -1) {
                    var9 = -1;
                } else {
                    int var6 = var4.field819;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (var6 + arg0 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class69.field1149[class230.method1611(false, var8, 96)];
                }
                class7.field90[var3 + 1] = var9;
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field281[var1] = var0 / 4;
        }
    }
}
