import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class23 {

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field275 = 0;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field277 = " is already on your ignore list.";

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public int field272;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public int field274;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "[[I")
    public static int[][] field284;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static final int method143(int arg0, int arg1) {
        field278++;
        return arg0 == -25737 ? arg1 & 0xFF : -22;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIIIIII)I")
    public static final int method144(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field276++;
        int var7 = arg1 & 0x3;
        if (arg0 != 125) {
            field283 = 41;
        }
        if ((arg6 & 0x1) == 1) {
            int var8 = arg4;
            arg4 = arg2;
            arg2 = var8;
        }
        if (var7 == 0) {
            return arg5;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return -arg4 - (arg5 - 1 - 7);
        } else {
            return 7 - arg3 - (arg2 + -1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        field284 = null;
        field277 = null;
        if (arg0 != 0) {
            field284 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lfl;II)V")
    private final void method146(class248 arg0, int arg1, int arg2) {
        field280++;
        if (arg1 == 1) {
            this.field272 = arg0.method1575(false);
            this.field274 = arg0.method1593((byte) 27);
            this.field281 = arg0.method1593((byte) 27);
        }
        if (arg2 != 0) {
            method147(106, (class107) null, (int[]) null, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjj;[I[I[I)V")
    public static final void method147(int arg0, class107 arg1, int[] arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg4[var5];
            for (int var9 = 0; var6 != 0 && var9 < arg1.field2290.length; var9++) {
                if ((var6 & 0x1) != 0) {
                    if (var7 == -1) {
                        arg1.field2290[var9] = null;
                    } else {
                        class215 var10 = class276.method1829(var7, 29223);
                        class44 var11 = arg1.field2290[var9];
                        int var12 = var10.field3220;
                        if (var11 != null) {
                            if (var11.field702 == var7) {
                                if (var12 == 0) {
                                    var11 = arg1.field2290[var9] = null;
                                } else if (var12 == 1) {
                                    var11.field701 = 1;
                                    var11.field699 = 0;
                                    var11.field700 = 0;
                                    var11.field698 = var8;
                                    var11.field703 = 0;
                                    client.method966((byte) 52, 0, class165.field2537 == arg1, arg1.field2234, var10, arg1.field2251);
                                } else if (var12 == 2) {
                                    var11.field703 = 0;
                                }
                            } else if (var10.field3227 >= class276.method1829(var11.field702, 29223).field3227) {
                                var11 = arg1.field2290[var9] = null;
                            }
                        }
                        if (var11 == null) {
                            class44 var13 = arg1.field2290[var9] = new class44();
                            var13.field698 = var8;
                            var13.field702 = var7;
                            var13.field699 = 0;
                            var13.field700 = 0;
                            var13.field701 = 1;
                            var13.field703 = 0;
                            client.method966((byte) 52, 0, class165.field2537 == arg1, arg1.field2234, var10, arg1.field2251);
                        }
                    }
                }
                var6 >>>= 0x1;
            }
        }
        if (arg0 != 1) {
            method143(119, -66);
        }
        field279++;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BLqa;)V")
    public static final void method148(byte arg0, class153 arg1) {
        field282++;
        if (arg1.field2269 == 0) {
            return;
        }
        class158 var2 = arg1.method928(24840);
        if (arg1.field2283 != -1 && arg1.field2283 < 32768) {
            class61 var3 = class18.field220[arg1.field2283];
            if (var3 != null) {
                int var4 = arg1.field2251 - var3.field2251;
                int var5 = arg1.field2234 - var3.field2234;
                if (var4 != 0 || var5 != 0) {
                    arg1.field2233 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2283 >= 32768) {
            int var6 = arg1.field2283 - 32768;
            if (class221.field3334 == var6) {
                var6 = 2047;
            }
            class107 var7 = class96.field1521[var6];
            if (var7 != null) {
                int var8 = arg1.field2234 - var7.field2234;
                int var9 = arg1.field2251 - var7.field2251;
                if (var9 != 0 || var8 != 0) {
                    arg1.field2233 = (int) (Math.atan2((double) var9, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2210 != 0 || arg1.field2216 != 0) && (arg1.field2277 == 0 || arg1.field2219 > 0)) {
            int var10 = arg1.field2251 - ((arg1.field2210 - class81.field1303 - class81.field1303) * 64);
            int var11 = arg1.field2234 - ((arg1.field2216 - class147.field2141 - class147.field2141) * 64);
            if (var10 != 0 || var11 != 0) {
                arg1.field2233 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 0x7FF;
            }
            arg1.field2216 = 0;
            arg1.field2210 = 0;
        }
        int var12 = arg1.field2233 - arg1.field2273 & 0x7FF;
        if (var12 == 0) {
            arg1.field2291 = 0;
            arg1.field2286 = 0;
        } else if (var2.field2408 == 0) {
            arg1.field2291++;
            if (var12 <= 1024) {
                arg1.field2273 += arg1.field2269;
                boolean var13 = true;
                if (var12 < arg1.field2269 || var12 > 2048 - arg1.field2269) {
                    arg1.field2273 = arg1.field2233;
                    var13 = false;
                }
                if (arg1.field2291 > 25 || var13) {
                    arg1.field2303 = var2.field2403;
                    if (arg1.field2277 <= 0) {
                        if (var2.field2428 != -1) {
                            arg1.field2303 = var2.field2428;
                        }
                    } else if (arg1.field2292[arg1.field2277 - 1] == 2) {
                        if (var2.field2421 != -1) {
                            arg1.field2303 = var2.field2421;
                        } else if (var2.field2430 != -1) {
                            arg1.field2303 = var2.field2430;
                        }
                    } else if (arg1.field2292[arg1.field2277 - 1] == 0) {
                        if (var2.field2395 != -1) {
                            arg1.field2303 = var2.field2395;
                        } else if (var2.field2411 != -1) {
                            arg1.field2303 = var2.field2411;
                        }
                    } else if (var2.field2404 != -1) {
                        arg1.field2303 = var2.field2404;
                    }
                }
            } else {
                arg1.field2273 -= arg1.field2269;
                boolean var14 = true;
                if (var12 < arg1.field2269 || (2048 - arg1.field2269) < var12) {
                    var14 = false;
                    arg1.field2273 = arg1.field2233;
                }
                if (arg1.field2291 > 25 || var14) {
                    arg1.field2303 = var2.field2403;
                    if (arg1.field2277 <= 0) {
                        if (var2.field2433 != -1) {
                            arg1.field2303 = var2.field2433;
                        }
                    } else if (arg1.field2292[arg1.field2277 - 1] == 2) {
                        if (var2.field2407 != -1) {
                            arg1.field2303 = var2.field2407;
                        } else if (var2.field2430 != -1) {
                            arg1.field2303 = var2.field2430;
                        }
                    } else if (arg1.field2292[arg1.field2277 - 1] == 0) {
                        if (var2.field2413 != -1) {
                            arg1.field2303 = var2.field2413;
                        } else if (var2.field2411 != -1) {
                            arg1.field2303 = var2.field2411;
                        }
                    } else if (var2.field2394 != -1) {
                        arg1.field2303 = var2.field2394;
                    }
                }
            }
            arg1.field2273 &= 0x7FF;
        } else {
            arg1.field2303 = -1;
            int var15 = arg1.field2233 << 5;
            if (arg1.field2239 != var15) {
                arg1.field2239 = var15;
                int var16 = var15 - arg1.field2205 & 0xFFFF;
                arg1.field2217 = 0;
                int var17 = arg1.field2286 * arg1.field2286 / (var2.field2408 * 2);
                if (arg1.field2286 > 0 && var16 >= var17 && (var16 - var17) < 32768) {
                    arg1.field2294 = true;
                    int var18 = var2.field2400 * var2.field2400 / (var2.field2408 * 2);
                    arg1.field2302 = var16 / 2;
                    if (var18 > 32767) {
                        var18 = 32767;
                    }
                    if (var18 < arg1.field2302) {
                        arg1.field2302 = var16 - var18;
                    }
                } else if (arg1.field2286 < 0 && 65536 - var16 >= var17 && 65536 - var16 - var17 < 32768) {
                    arg1.field2302 = (65536 - var16) / 2;
                    int var19 = var2.field2400 * var2.field2400 / (var2.field2408 * 2);
                    arg1.field2294 = true;
                    if (var19 > 32767) {
                        var19 = 32767;
                    }
                    if (var19 < arg1.field2302) {
                        arg1.field2302 = 65536 - var16 - var19;
                    }
                } else {
                    arg1.field2294 = false;
                }
            }
            if (arg1.field2286 == 0) {
                int var20 = arg1.field2239 - arg1.field2205 & 0xFFFF;
                if (var2.field2408 > var20) {
                    arg1.field2205 = arg1.field2239;
                } else {
                    arg1.field2294 = true;
                    arg1.field2217 = 0;
                    int var21 = var2.field2400 * var2.field2400 / (var2.field2408 * 2);
                    if (var21 > 32767) {
                        var21 = 32767;
                    }
                    if (var20 < 32768) {
                        arg1.field2286 = var2.field2408;
                        arg1.field2302 = var20 / 2;
                        if (var21 < arg1.field2302) {
                            arg1.field2302 = var20 - var21;
                        }
                    } else {
                        arg1.field2302 = (65536 - var20) / 2;
                        if (var21 < arg1.field2302) {
                            arg1.field2302 = 65536 - var20 - var21;
                        }
                        arg1.field2286 = -var2.field2408;
                    }
                }
            } else if (arg1.field2286 <= 0) {
                if (arg1.field2302 <= arg1.field2217) {
                    arg1.field2294 = false;
                }
                if (!arg1.field2294) {
                    arg1.field2286 += var2.field2408;
                    if (arg1.field2286 > 0) {
                        arg1.field2286 = 0;
                    }
                } else if (arg1.field2286 > (-var2.field2400)) {
                    arg1.field2286 -= var2.field2408;
                }
            } else {
                if (arg1.field2302 <= arg1.field2217) {
                    arg1.field2294 = false;
                }
                if (!arg1.field2294) {
                    arg1.field2286 -= var2.field2408;
                    if (arg1.field2286 < 0) {
                        arg1.field2286 = 0;
                    }
                } else if (var2.field2400 > arg1.field2286) {
                    arg1.field2286 += var2.field2408;
                }
            }
            if (arg1.field2286 > 0) {
                arg1.field2217 += arg1.field2286;
            } else {
                arg1.field2217 -= arg1.field2286;
            }
            arg1.field2205 += arg1.field2286;
            arg1.field2205 &= 0xFFFF;
            arg1.field2273 = arg1.field2205 >> 5;
            if (arg1.field2286 < 0) {
                if (arg1.field2277 > 0) {
                    if (arg1.field2292[arg1.field2277 - 1] == 2) {
                        if (var2.field2407 != -1) {
                            arg1.field2303 = var2.field2407;
                        } else if (var2.field2430 != -1) {
                            arg1.field2303 = var2.field2430;
                        }
                    } else if (arg1.field2292[arg1.field2277 - 1] == 0) {
                        if (var2.field2413 != -1) {
                            arg1.field2303 = var2.field2413;
                        } else if (var2.field2411 != -1) {
                            arg1.field2303 = var2.field2411;
                        }
                    }
                }
                if (arg1.field2303 == -1) {
                    if (var2.field2394 != -1) {
                        arg1.field2303 = var2.field2394;
                    } else if (var2.field2433 != -1) {
                        arg1.field2303 = var2.field2433;
                    }
                }
            } else {
                if (arg1.field2277 > 0) {
                    if (arg1.field2292[arg1.field2277 - 1] == 2) {
                        if (var2.field2421 != -1) {
                            arg1.field2303 = var2.field2421;
                        } else if (var2.field2430 != -1) {
                            arg1.field2303 = var2.field2430;
                        }
                    } else if (arg1.field2292[arg1.field2277 - 1] == 0) {
                        if (var2.field2395 != -1) {
                            arg1.field2303 = var2.field2395;
                        } else if (var2.field2411 != -1) {
                            arg1.field2303 = var2.field2411;
                        }
                    }
                }
                if (arg1.field2303 == -1) {
                    if (var2.field2404 != -1) {
                        arg1.field2303 = var2.field2404;
                    } else if (var2.field2428 != -1) {
                        arg1.field2303 = var2.field2428;
                    }
                }
            }
            if (arg1.field2303 == -1) {
                arg1.field2303 = var2.field2403;
            }
        }
        if (arg0 != 39) {
            method147(27, (class107) null, (int[]) null, (int[]) null, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZLfl;)V")
    public final void method149(boolean arg0, class248 arg1) {
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                if (!arg0) {
                    return;
                }
                field273++;
                return;
            }
            this.method146(arg1, var3, 0);
        }
    }
}
