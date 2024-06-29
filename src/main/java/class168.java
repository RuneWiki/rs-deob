import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class168 {

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2627 = " has logged out.";

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field2629 = -1;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lhc;")
    public static class235 field2626;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;I)V")
    public static final void method1130(String arg0, Throwable arg1, int arg2) {
        int var3 = 118 % ((-arg2 - 39) / 59);
        field2625++;
        try {
            String var4 = "";
            if (arg1 != null) {
                var4 = class204.method1373(1, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var4 = var4 + " | ";
                }
                var4 = var4 + arg0;
            }
            class171.method1147(0, var4);
            String var5 = class266.method1799((byte) -128, ":", "%3a", var4);
            String var6 = class266.method1799((byte) -108, "@", "%40", var5);
            String var7 = class266.method1799((byte) -96, "&", "%26", var6);
            String var8 = class266.method1799((byte) -99, "#", "%23", var7);
            if (class84.field1415.field479 != null) {
                class76 var9 = class84.field1415.method249(new URL(class84.field1415.field479.getCodeBase(), "clienterror.ws?c=" + class198.field3124 + "&u=" + class265.field4212 + "&v1=" + class32.field484 + "&v2=" + class32.field476 + "&e=" + var8), (byte) -16);
                while (var9.field1255 == 0) {
                    class150.method1011((byte) 41, 1L);
                }
                if (var9.field1255 == 1) {
                    DataInputStream var10 = (DataInputStream) var9.field1258;
                    var10.read();
                    var10.close();
                }
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2624++;
        int var8 = arg3;
        int var9 = 0;
        int var10 = 0;
        int var11 = arg3 - arg7;
        int var12 = arg5 * arg5;
        int var13 = arg5 - arg7;
        int var14 = arg3 * arg3;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var12 << 1;
        int var18 = var14 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg3 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var21) * var12 + var18;
        int var24 = var14 - ((var21 - 1) * var17);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((arg6 + var22) * var20);
        int var27 = var12 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var18 * 3;
        int var32 = (var22 - 3) * var20;
        int var33 = (var21 - 3) * var17;
        int var34 = var19 * 3;
        int var35 = (arg3 - 1) * var27;
        int var36 = var30;
        if (arg4 >= class90.field1568 && class266.field4247 >= arg4) {
            int[] var37 = class154.field2406[arg4];
            int var38 = class219.method1470(class223.field3423, arg2 - arg5, -1, class148.field2338);
            int var39 = class219.method1470(class223.field3423, arg2 + arg5, arg6, class148.field2338);
            int var40 = class219.method1470(class223.field3423, arg2 - var13, -1, class148.field2338);
            int var41 = class219.method1470(class223.field3423, arg2 + var13, -1, class148.field2338);
            class166.method1124(true, var37, var40, arg1, var38);
            class166.method1124(true, var37, var41, arg0, var40);
            class166.method1124(true, var37, var39, arg1, var41);
        }
        int var42 = (var11 - 1) * var29;
        int var43 = var28;
        while (var8 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var31 += var28;
                    var9++;
                    var24 += var43;
                    var43 += var28;
                }
            }
            if (var24 < 0) {
                var24 += var43;
                var23 += var31;
                var43 += var28;
                var9++;
                var31 += var28;
            }
            var23 += -var35;
            var24 += -var33;
            var33 -= var27;
            boolean var44 = var11 >= var8;
            var8--;
            int var45 = arg4 - var8;
            var35 -= var27;
            int var46 = arg4 + var8;
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var34;
                        var10++;
                        var34 += var30;
                        var26 += var36;
                        var36 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var36;
                    var25 += var34;
                    var36 += var30;
                    var10++;
                    var34 += var30;
                }
                var25 += -var42;
                var26 += -var32;
                var32 -= var29;
                var42 -= var29;
            }
            if (class90.field1568 <= var46 && var45 <= class266.field4247) {
                int var47 = class219.method1470(class223.field3423, arg2 + var9, arg6, class148.field2338);
                int var48 = class219.method1470(class223.field3423, arg2 - var9, arg6, class148.field2338);
                if (var44) {
                    int var49 = class219.method1470(class223.field3423, arg2 + var10, -1, class148.field2338);
                    int var50 = class219.method1470(class223.field3423, arg2 - var10, arg6, class148.field2338);
                    if (class90.field1568 <= var45) {
                        int[] var51 = class154.field2406[var45];
                        class166.method1124(true, var51, var50, arg1, var48);
                        class166.method1124(true, var51, var49, arg0, var50);
                        class166.method1124(true, var51, var47, arg1, var49);
                    }
                    if (var46 <= class266.field4247) {
                        int[] var52 = class154.field2406[var46];
                        class166.method1124(true, var52, var50, arg1, var48);
                        class166.method1124(true, var52, var49, arg0, var50);
                        class166.method1124(true, var52, var47, arg1, var49);
                    }
                } else {
                    if (class90.field1568 <= var45) {
                        class166.method1124(true, class154.field2406[var45], var47, arg1, var48);
                    }
                    if (var46 <= class266.field4247) {
                        class166.method1124(true, class154.field2406[var46], var47, arg1, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lnj;I)V")
    public static final void method1132(class144 arg0, int arg1) {
        field2623++;
        if (arg0.field2260 == 0) {
            return;
        }
        class283 var2 = arg0.method972((byte) -71);
        if (arg0.field2223 != -1 && arg0.field2223 < 32768) {
            class45 var3 = class255.field4082[arg0.field2223];
            if (var3 != null) {
                int var4 = arg0.field2240 - var3.field2240;
                int var5 = arg0.field2278 - var3.field2278;
                if (var4 != 0 || var5 != 0) {
                    arg0.field2257 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg0.field2223 >= 32768) {
            int var6 = arg0.field2223 - 32768;
            if (class116.field1897 == var6) {
                var6 = 2047;
            }
            class236 var7 = class210.field3267[var6];
            if (var7 != null) {
                int var8 = arg0.field2240 - var7.field2240;
                int var9 = arg0.field2278 - var7.field2278;
                if (var8 != 0 || var9 != 0) {
                    arg0.field2257 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg0.field2252 != 0 || arg0.field2202 != 0) && (arg0.field2263 == 0 || arg0.field2267 > 0)) {
            int var10 = arg0.field2240 - ((arg0.field2252 - class46.field656 - class46.field656) * 64);
            int var11 = arg0.field2278 - ((arg0.field2202 - class260.field4162 - class260.field4162) * 64);
            if (var10 != 0 || var11 != 0) {
                arg0.field2257 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg0.field2202 = 0;
            arg0.field2252 = 0;
        }
        if (arg1 != 65536) {
            method1132((class144) null, -105);
        }
        int var12 = arg0.field2257 - arg0.field2275 & 0x7FF;
        if (var12 == 0) {
            arg0.field2221 = 0;
            arg0.field2226 = 0;
        } else if (var2.field4461 == 0) {
            arg0.field2221++;
            if (var12 > 1024) {
                arg0.field2275 -= arg0.field2260;
                boolean var20 = true;
                if (var12 < arg0.field2260 || (2048 - arg0.field2260) < var12) {
                    arg0.field2275 = arg0.field2257;
                    var20 = false;
                }
                if (arg0.field2221 > 25 || var20) {
                    arg0.field2250 = var2.field4477;
                    if (arg0.field2263 <= 0) {
                        if (var2.field4455 != -1) {
                            arg0.field2250 = var2.field4455;
                        }
                    } else if (arg0.field2256[arg0.field2263 - 1] == 2) {
                        if (var2.field4469 != -1) {
                            arg0.field2250 = var2.field4469;
                        } else if (var2.field4468 != -1) {
                            arg0.field2250 = var2.field4468;
                        }
                    } else if (arg0.field2256[arg0.field2263 - 1] == 0) {
                        if (var2.field4486 != -1) {
                            arg0.field2250 = var2.field4486;
                        } else if (var2.field4494 != -1) {
                            arg0.field2250 = var2.field4494;
                        }
                    } else if (var2.field4499 != -1) {
                        arg0.field2250 = var2.field4499;
                    }
                }
            } else {
                arg0.field2275 += arg0.field2260;
                boolean var21 = true;
                if (var12 < arg0.field2260 || var12 > 2048 - arg0.field2260) {
                    var21 = false;
                    arg0.field2275 = arg0.field2257;
                }
                if (arg0.field2221 > 25 || var21) {
                    arg0.field2250 = var2.field4477;
                    if (arg0.field2263 <= 0) {
                        if (var2.field4476 != -1) {
                            arg0.field2250 = var2.field4476;
                        }
                    } else if (arg0.field2256[arg0.field2263 - 1] == 2) {
                        if (var2.field4479 != -1) {
                            arg0.field2250 = var2.field4479;
                        } else if (var2.field4468 != -1) {
                            arg0.field2250 = var2.field4468;
                        }
                    } else if (arg0.field2256[arg0.field2263 - 1] == 0) {
                        if (var2.field4491 != -1) {
                            arg0.field2250 = var2.field4491;
                        } else if (var2.field4494 != -1) {
                            arg0.field2250 = var2.field4494;
                        }
                    } else if (var2.field4471 != -1) {
                        arg0.field2250 = var2.field4471;
                    }
                }
            }
            arg0.field2275 &= 0x7FF;
        } else {
            arg0.field2250 = -1;
            int var13 = arg0.field2257 << 5;
            if (arg0.field2213 != var13) {
                arg0.field2213 = var13;
                arg0.field2245 = 0;
                int var14 = arg0.field2226 * arg0.field2226 / (var2.field4461 * 2);
                int var15 = var13 - arg0.field2208 & 0xFFFF;
                if (arg0.field2226 > 0 && var15 >= var14 && (var15 - var14) < 32768) {
                    arg0.field2229 = var15 / 2;
                    arg0.field2248 = true;
                    int var16 = var2.field4460 * var2.field4460 / (var2.field4461 * 2);
                    if (var16 > 32767) {
                        var16 = 32767;
                    }
                    if (var16 < arg0.field2229) {
                        arg0.field2229 = var15 - var16;
                    }
                } else if (arg0.field2226 < 0 && var14 <= (65536 - var15) && 65536 - var14 - var15 < 32768) {
                    arg0.field2229 = (65536 - var15) / 2;
                    arg0.field2248 = true;
                    int var17 = var2.field4460 * var2.field4460 / (var2.field4461 * 2);
                    if (var17 > 32767) {
                        var17 = 32767;
                    }
                    if (arg0.field2229 > var17) {
                        arg0.field2229 = 65536 - var15 - var17;
                    }
                } else {
                    arg0.field2248 = false;
                }
            }
            if (arg0.field2226 == 0) {
                int var18 = arg0.field2213 - arg0.field2208 & 0xFFFF;
                if (var2.field4461 > var18) {
                    arg0.field2208 = arg0.field2213;
                } else {
                    arg0.field2248 = true;
                    arg0.field2245 = 0;
                    int var19 = var2.field4460 * var2.field4460 / (var2.field4461 * 2);
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var18 < 32768) {
                        arg0.field2226 = var2.field4461;
                        arg0.field2229 = var18 / 2;
                        if (arg0.field2229 > var19) {
                            arg0.field2229 = var18 - var19;
                        }
                    } else {
                        arg0.field2226 = -var2.field4461;
                        arg0.field2229 = (65536 - var18) / 2;
                        if (arg0.field2229 > var19) {
                            arg0.field2229 = 65536 - var18 - var19;
                        }
                    }
                }
            } else if (arg0.field2226 > 0) {
                if (arg0.field2245 >= arg0.field2229) {
                    arg0.field2248 = false;
                }
                if (!arg0.field2248) {
                    arg0.field2226 -= var2.field4461;
                    if (arg0.field2226 < 0) {
                        arg0.field2226 = 0;
                    }
                } else if (arg0.field2226 < var2.field4460) {
                    arg0.field2226 += var2.field4461;
                }
            } else {
                if (arg0.field2229 <= arg0.field2245) {
                    arg0.field2248 = false;
                }
                if (!arg0.field2248) {
                    arg0.field2226 += var2.field4461;
                    if (arg0.field2226 > 0) {
                        arg0.field2226 = 0;
                    }
                } else if (arg0.field2226 > (-var2.field4460)) {
                    arg0.field2226 -= var2.field4461;
                }
            }
            if (arg0.field2226 > 0) {
                arg0.field2245 += arg0.field2226;
            } else {
                arg0.field2245 -= arg0.field2226;
            }
            arg0.field2208 += arg0.field2226;
            arg0.field2208 &= 0xFFFF;
            arg0.field2275 = arg0.field2208 >> 5;
            if (arg0.field2226 >= 0) {
                if (arg0.field2263 > 0) {
                    if (arg0.field2256[arg0.field2263 - 1] == 2) {
                        if (var2.field4479 != -1) {
                            arg0.field2250 = var2.field4479;
                        } else if (var2.field4468 != -1) {
                            arg0.field2250 = var2.field4468;
                        }
                    } else if (arg0.field2256[arg0.field2263 - 1] == 0) {
                        if (var2.field4491 != -1) {
                            arg0.field2250 = var2.field4491;
                        } else if (var2.field4494 != -1) {
                            arg0.field2250 = var2.field4494;
                        }
                    }
                }
                if (arg0.field2250 == -1) {
                    if (var2.field4471 != -1) {
                        arg0.field2250 = var2.field4471;
                    } else if (var2.field4476 != -1) {
                        arg0.field2250 = var2.field4476;
                    }
                }
            } else {
                if (arg0.field2263 > 0) {
                    if (arg0.field2256[arg0.field2263 - 1] == 2) {
                        if (var2.field4469 != -1) {
                            arg0.field2250 = var2.field4469;
                        } else if (var2.field4468 != -1) {
                            arg0.field2250 = var2.field4468;
                        }
                    } else if (arg0.field2256[arg0.field2263 - 1] == 0) {
                        if (var2.field4486 != -1) {
                            arg0.field2250 = var2.field4486;
                        } else if (var2.field4494 != -1) {
                            arg0.field2250 = var2.field4494;
                        }
                    }
                }
                if (arg0.field2250 == -1) {
                    if (var2.field4499 != -1) {
                        arg0.field2250 = var2.field4499;
                    } else if (var2.field4455 != -1) {
                        arg0.field2250 = var2.field4455;
                    }
                }
            }
            if (arg0.field2250 == -1) {
                arg0.field2250 = var2.field4477;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method1133(byte arg0) {
        if (arg0 <= 71) {
            method1134(-96, 26, -122, 87, 28);
        }
        field2626 = null;
        field2627 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
    public static final void method1134(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2630++;
        int var5 = 44 / ((arg4 + 10) / 63);
        if (arg0 < arg3) {
            class166.method1124(true, class154.field2406[arg2], arg3, arg1, arg0);
        } else {
            class166.method1124(true, class154.field2406[arg2], arg0, arg1, arg3);
        }
    }
}
