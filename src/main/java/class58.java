import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class58 extends class224 {

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    private int field819 = 1;

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    private int field822 = 1;

    @OriginalMember(owner = "client!qb", name = "K", descriptor = "I")
    private int field815 = 204;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "Ljava/lang/String;")
    public static String field813 = "Please wait...";

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "I")
    public static int field816;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field817;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(Z)V")
    public static void method417(boolean arg0) {
        if (!arg0) {
            method417(false);
        }
        field813 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V")
    public static final void method418(byte arg0) {
        ++field812;
        if (arg0 != -108) {
            method417(false);
        }
        for (class34 var1 = (class34) class158.field2431.method350(8240); var1 != null; var1 = (class34) class158.field2431.method353((byte) -114)) {
            class98 var2 = var1.field440;
            if (~class276.field4398 == ~var2.field1518 && !var2.field1505) {
                if (~var2.field1532 >= ~class111.field1684) {
                    var2.method648(class80.field1166, arg0 + 185);
                    if (var2.field1505) {
                        var1.method784(false);
                    } else {
                        class143.method952(var2.field1518, var2.field1515, var2.field1507, var2.field1513, 60, var2, 0, -1L, false);
                    }
                }
            } else {
                var1.method784(false);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            field813 = null;
        }
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        ++field821;
        if (super.field3625.field4425) {
            for (int var4 = 0; ~var4 > ~class78.field1108; ++var4) {
                int var5 = class243.field3893[var4];
                int var6 = this.field822 * var5 >> 12;
                int var7 = class251.field4018[arg0];
                int var8 = var5 % (4096 / this.field822) * this.field822;
                int var9 = this.field819 * var7 >> 12;
                int var10 = var7 % (4096 / this.field819) * this.field819;
                if (~var10 > ~this.field815) {
                    for (var6 -= var9; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field815 > var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (var8 < this.field815) {
                    int var11;
                    for (var11 = var6 - var9; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "(Z)V")
    public static final void method419(boolean arg0) {
        if (!arg0) {
            class286.field4537.method1420(-1);
            ++field820;
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V")
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ILlk;)V")
    public static final void method420(int arg0, class82 arg1) {
        ++field816;
        int var2 = 116 % ((65 - arg0) / 37);
        class85 var3 = arg1.method564(-49);
        arg1.field1196 = var3.field1319;
        if (arg1.field1246 != 0) {
            if (~arg1.field1252 != 0 && arg1.field1287 == 0) {
                class198 var4 = class104.method688(arg1.field1252, 30091);
                if (arg1.field1224 > 0 && ~var4.field3102 == -1) {
                    ++arg1.field1206;
                    return;
                }
                if (~arg1.field1224 >= -1 && ~var4.field3078 == -1) {
                    ++arg1.field1206;
                    return;
                }
            }
            int var5 = arg1.field1226;
            int var6 = arg1.field1273;
            int var7 = arg1.field1257[arg1.field1246 + -1] * 128 + 64 * arg1.method565((byte) 0);
            int var8 = arg1.field1272[arg1.field1246 + -1] * 128 + 64 * arg1.method565((byte) 0);
            if (-var5 + var7 > 256 || -var5 + var7 < -256 || ~(-var6 + var8) < -257 || -var6 + var8 < -256) {
                arg1.field1226 = var7;
                arg1.field1273 = var8;
                return;
            }
            if (~var5 <= ~var7) {
                if (~var7 > ~var5) {
                    if (var6 < var8) {
                        arg1.field1211 = 768;
                    } else if (~var6 >= ~var8) {
                        arg1.field1211 = 512;
                    } else {
                        arg1.field1211 = 256;
                    }
                } else if (var6 < var8) {
                    arg1.field1211 = 1024;
                } else if (var8 < var6) {
                    arg1.field1211 = 0;
                }
            } else if (var8 <= var6) {
                if (~var8 > ~var6) {
                    arg1.field1211 = 1792;
                } else {
                    arg1.field1211 = 1536;
                }
            } else {
                arg1.field1211 = 1280;
            }
            boolean var9 = true;
            int var10 = -arg1.field1222 + arg1.field1211 & 2047;
            int var11 = var3.field1341;
            if (var10 > 1024) {
                var10 -= 2048;
            }
            int var12 = 4;
            byte var13 = 1;
            if (var10 >= -256 && var10 <= 256) {
                var11 = var3.field1347;
            } else if (var10 >= 256 && var10 < 768) {
                var11 = var3.field1352;
            } else if (var10 >= -768 && var10 <= -256) {
                var11 = var3.field1355;
            }
            if (~var11 == 0) {
                var11 = var3.field1347;
            }
            arg1.field1196 = var11;
            if (arg1 instanceof class56) {
                var9 = ((class56) arg1).field793.field2019;
            }
            if (!var9) {
                if (~arg1.field1246 < -2) {
                    var12 = 6;
                }
                if (~arg1.field1246 < -3) {
                    var12 = 8;
                }
                if (arg1.field1206 > 0 && arg1.field1246 > 1) {
                    --arg1.field1206;
                    var12 = 8;
                }
            } else {
                if (~arg1.field1222 != ~arg1.field1211 && ~arg1.field1281 == 0 && ~arg1.field1289 != -1) {
                    var12 = 2;
                }
                if (arg1.field1246 > 2) {
                    var12 = 6;
                }
                if (arg1.field1246 > 3) {
                    var12 = 8;
                }
                if (arg1.field1206 > 0 && arg1.field1246 > 1) {
                    --arg1.field1206;
                    var12 = 8;
                }
            }
            if (~arg1.field1262[arg1.field1246 - 1] == -3) {
                var12 <<= 1;
                var13 = 2;
            } else if (~arg1.field1262[arg1.field1246 + -1] == -1) {
                var13 = 0;
                var12 >>= 1;
            }
            if (var12 >= 8 && ~var3.field1354 != 0) {
                if (arg1.field1196 == var3.field1341 && var3.field1353 != -1) {
                    arg1.field1196 = var3.field1353;
                } else if (~arg1.field1196 == ~var3.field1355 && ~var3.field1340 != 0) {
                    arg1.field1196 = var3.field1340;
                } else if (arg1.field1196 == var3.field1352 && var3.field1356 != -1) {
                    arg1.field1196 = var3.field1356;
                } else {
                    arg1.field1196 = var3.field1354;
                }
            } else if (~var3.field1336 != 0 && var13 == 0) {
                if (~arg1.field1196 == ~var3.field1341 && ~var3.field1334 != 0) {
                    arg1.field1196 = var3.field1334;
                } else if (~arg1.field1196 == ~var3.field1355 && var3.field1338 != -1) {
                    arg1.field1196 = var3.field1338;
                } else if (arg1.field1196 == var3.field1352 && var3.field1323 != -1) {
                    arg1.field1196 = var3.field1323;
                } else {
                    arg1.field1196 = var3.field1336;
                }
            }
            if (~var3.field1332 != 0) {
                int var14 = var12 << 7;
                if (~arg1.field1246 != -2) {
                    if (var14 > arg1.field1237) {
                        arg1.field1237 += var3.field1332;
                        if (arg1.field1237 > var14) {
                            arg1.field1237 = var14;
                        }
                    } else if (~arg1.field1237 < -1) {
                        arg1.field1237 -= var3.field1332;
                        if (arg1.field1237 < 0) {
                            arg1.field1237 = 0;
                        }
                    }
                } else {
                    int var15 = arg1.field1237 * arg1.field1237;
                    int var16 = (arg1.field1273 <= var8 ? -arg1.field1273 + var8 : -var8 + arg1.field1273) << 7;
                    int var17 = (~arg1.field1226 >= ~var7 ? -arg1.field1226 + var7 : -var7 + arg1.field1226) << 7;
                    int var18 = var16 < var17 ? var17 : var16;
                    int var19 = var3.field1332 * 2 * var18;
                    if (~var15 < ~var19) {
                        arg1.field1237 /= 2;
                    } else if (var18 < var15 / 2) {
                        arg1.field1237 -= var3.field1332;
                        if (~arg1.field1237 > -1) {
                            arg1.field1237 = 0;
                        }
                    } else if (~var14 < ~arg1.field1237) {
                        arg1.field1237 += var3.field1332;
                        if (arg1.field1237 > var14) {
                            arg1.field1237 = var14;
                        }
                    }
                }
                var12 = arg1.field1237 >> 7;
                if (var12 < 1) {
                    var12 = 1;
                }
            }
            if (~var7 >= ~var5) {
                if (~var5 < ~var7) {
                    arg1.field1226 -= var12;
                    if (arg1.field1226 < var7) {
                        arg1.field1226 = var7;
                    }
                }
            } else {
                arg1.field1226 += var12;
                if (~var7 > ~arg1.field1226) {
                    arg1.field1226 = var7;
                }
            }
            if (~var8 < ~var6) {
                arg1.field1273 += var12;
                if (~arg1.field1273 < ~var8) {
                    arg1.field1273 = var8;
                }
            } else if (var6 > var8) {
                arg1.field1273 -= var12;
                if (var8 > arg1.field1273) {
                    arg1.field1273 = var8;
                }
            }
            if (arg1.field1226 == var7 && ~arg1.field1273 == ~var8) {
                if (arg1.field1224 > 0) {
                    --arg1.field1224;
                }
                --arg1.field1246;
                return;
            }
        } else {
            arg1.field1206 = 0;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BC)B")
    public static final byte method421(byte arg0, char arg1) {
        if (arg0 >= -116) {
            return -21;
        } else {
            ++field818;
            byte var2;
            if ((arg1 <= 0 || ~arg1 <= -129) && (~arg1 > -161 || ~arg1 < -256)) {
                if (arg1 != 8364) {
                    if (~arg1 != -8219) {
                        if (~arg1 != -403) {
                            if (~arg1 == -8223) {
                                var2 = -124;
                            } else if (arg1 == 8230) {
                                var2 = -123;
                            } else if (arg1 != 8224) {
                                if (~arg1 != -8226) {
                                    if (arg1 == 710) {
                                        var2 = -120;
                                    } else if (~arg1 == -8241) {
                                        var2 = -119;
                                    } else if (arg1 == 352) {
                                        var2 = -118;
                                    } else if (~arg1 == -8250) {
                                        var2 = -117;
                                    } else if (~arg1 != -339) {
                                        if (~arg1 == -382) {
                                            var2 = -114;
                                        } else if (arg1 != 8216) {
                                            if (arg1 == 8217) {
                                                var2 = -110;
                                            } else if (~arg1 != -8221) {
                                                if (arg1 == 8221) {
                                                    var2 = -108;
                                                } else if (~arg1 != -8227) {
                                                    if (~arg1 == -8212) {
                                                        var2 = -106;
                                                    } else if (~arg1 == -8213) {
                                                        var2 = -105;
                                                    } else if (~arg1 == -733) {
                                                        var2 = -104;
                                                    } else if (arg1 != 8482) {
                                                        if (~arg1 == -354) {
                                                            var2 = -102;
                                                        } else if (~arg1 == -8251) {
                                                            var2 = -101;
                                                        } else if (arg1 != 339) {
                                                            if (~arg1 == -383) {
                                                                var2 = -98;
                                                            } else {
                                                                if (arg1 != 376) {
                                                                    throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(arg1, 16) + " provided");
                                                                }
                                                                var2 = -97;
                                                            }
                                                        } else {
                                                            var2 = -100;
                                                        }
                                                    } else {
                                                        var2 = -103;
                                                    }
                                                } else {
                                                    var2 = -107;
                                                }
                                            } else {
                                                var2 = -109;
                                            }
                                        } else {
                                            var2 = -111;
                                        }
                                    } else {
                                        var2 = -116;
                                    }
                                } else {
                                    var2 = -121;
                                }
                            } else {
                                var2 = -122;
                            }
                        } else {
                            var2 = -125;
                        }
                    } else {
                        var2 = -126;
                    }
                } else {
                    var2 = -128;
                }
            } else {
                var2 = (byte) arg1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 >= -46) {
            field817 = 76;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field815 = arg0.method190(-3);
                }
            } else {
                this.field819 = arg0.method201(255);
            }
        } else {
            this.field822 = arg0.method201(255);
        }
        ++field814;
    }
}
