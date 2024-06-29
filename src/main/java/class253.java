import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class253 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Z")
    public static boolean field4392 = false;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Z")
    public static boolean field4397 = true;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lpc;")
    public static class21 field4404 = null;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public int field4387;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public int field4388;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field4389;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public int field4400;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public int field4401;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public int field4406;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "I")
    public int field4407;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public int field4408;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "I")
    public int field4410;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "I")
    public int field4411;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public int field4413;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lpc;")
    public static class21 field4390;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)Z")
    public static final boolean method1680(int arg0, byte arg1) {
        if (arg1 != -5) {
            field4397 = false;
        }
        field4395++;
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILjava/lang/String;)Loh;")
    public static final class263 method1681(int arg0, String arg1) {
        field4412++;
        if (arg0 >= -116) {
            method1684(2);
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        class263 var4 = new class263();
        int var5 = 0;
        var4.field4605 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field4605[var4.field4591++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field4605[var4.field4591++] = (byte) var6;
            }
        }
        var4.method1782(92);
        return var4.method1741(10516);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method1682(int arg0) {
        field4390 = null;
        if (arg0 != 255) {
            field4397 = false;
        }
        field4404 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIIIII)V")
    public static final void method1683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4398++;
        class191.method1255(arg5 - arg3, arg4, arg3 + arg5, 70, class38.field870[arg2]);
        int var6 = arg0;
        int var7 = arg3 * arg3;
        int var8 = arg0 * arg0;
        int var9 = 0;
        int var10 = var8 << 1;
        int var11 = var7 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var7 + var10;
        int var14 = var8 - ((var12 - 1) * var11);
        int var15 = ((var9 << 1) + 3) * var10;
        int var16 = var8 << 2;
        int var17 = var7 << 2;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var9 + 1) * var16;
        int var20 = (arg0 - 1) * var17;
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var19 += var16;
                    var13 += var15;
                    var9++;
                    var15 += var16;
                }
            }
            int var22 = arg2 - var6;
            int var23 = arg2 + var6;
            if (var14 < 0) {
                var13 += var15;
                var9++;
                var15 += var16;
                var14 += var19;
                var19 += var16;
            }
            var13 += -var20;
            var20 -= var17;
            int var24 = arg5 - var9;
            var14 += -var18;
            var18 -= var17;
            int var25 = arg5 + var9;
            class191.method1255(var24, arg4, var25, 70, class38.field870[var22]);
            class191.method1255(var24, arg4, var25, 118, class38.field870[var23]);
        }
        int var21 = -123 / ((arg1 - 44) / 38);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static final void method1684(int arg0) {
        field4393++;
        if (class254.field4424 > 1) {
            class257.field4474 = class112.field2108;
            class254.field4424--;
        }
        if (class118.field2194 > 0) {
            class118.field2194--;
        }
        if (class182.field3309) {
            class182.field3309 = false;
            class108.method722(-1834571320);
            return;
        }
        for (int var1 = 0; var1 < 100 && class156.method1021(arg0 ^ 0xFFFFC41E); var1++) {
        }
        if (class271.field4786 != 30) {
            return;
        }
        class181.method1209(class154.field2792, (byte) -51, 41);
        Object var2 = class226.field3984.field3629;
        synchronized (class226.field3984.field3629) {
            if (!field4392) {
                class226.field3984.field3638 = 0;
            } else if (class268.field4733 != 0 || class226.field3984.field3638 >= 40) {
                class130.field2389++;
                class154.field2792.method1516(-55, 56);
                class154.field2792.method1288((byte) -69, 0);
                int var3 = 0;
                int var4 = class154.field2792.field3497;
                for (int var5 = 0; var5 < class226.field3984.field3638 && (class154.field2792.field3497 - var4) < 240; var5++) {
                    int var6 = class226.field3984.field3642[var5];
                    boolean var7 = false;
                    var3++;
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var8 = class226.field3984.field3643[var5];
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 65534) {
                        var8 = 65534;
                    }
                    if (class226.field3984.field3642[var5] == -1 && class226.field3984.field3643[var5] == -1) {
                        var7 = true;
                        var8 = -1;
                        var6 = -1;
                    }
                    if (class121.field2252 != var8 || class5.field107 != var6) {
                        int var9 = var8 - class121.field2252;
                        int var10 = var6 - class5.field107;
                        class121.field2252 = var8;
                        class5.field107 = var6;
                        if (class255.field4436 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class154.field2792.method1276((class255.field4436 << 12) + (var9 << 6) + var10, arg0 + 15074);
                            class255.field4436 = 0;
                        } else if (class255.field4436 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            var10 += 128;
                            var9 += 128;
                            class154.field2792.method1288((byte) -11, class255.field4436 + 128);
                            class154.field2792.method1276((var9 << 8) + var10, -116);
                            class255.field4436 = 0;
                        } else if (class255.field4436 < 32) {
                            class154.field2792.method1288((byte) -93, class255.field4436 + 192);
                            if (var7) {
                                class154.field2792.method1286(arg0 ^ 0x16E4, Integer.MIN_VALUE);
                            } else {
                                class154.field2792.method1286(-11740, var8 | var6 << 16);
                            }
                            class255.field4436 = 0;
                        } else {
                            class154.field2792.method1276(class255.field4436 + 57344, arg0 + 15124);
                            if (var7) {
                                class154.field2792.method1286(-11740, Integer.MIN_VALUE);
                            } else {
                                class154.field2792.method1286(-11740, var6 << 16 | var8);
                            }
                            class255.field4436 = 0;
                        }
                    } else if (class255.field4436 < 2047) {
                        class255.field4436++;
                    }
                }
                class154.field2792.method1285((byte) -125, class154.field2792.field3497 - var4);
                if (class226.field3984.field3638 > var3) {
                    class226.field3984.field3638 -= var3;
                    for (int var11 = 0; var11 < class226.field3984.field3638; var11++) {
                        class226.field3984.field3643[var11] = class226.field3984.field3643[var3 + var11];
                        class226.field3984.field3642[var11] = class226.field3984.field3642[var3 + var11];
                    }
                } else {
                    class226.field3984.field3638 = 0;
                }
            }
        }
        if (class268.field4733 != 0) {
            long var12 = (class131.field2398 - class183.field3312) / 50L;
            class251.field4372++;
            class183.field3312 = class131.field2398;
            if (var12 > 32767L) {
                var12 = 32767L;
            }
            int var14 = class31.field777;
            if (var14 < 0) {
                var14 = 0;
            } else if (var14 > 65535) {
                var14 = 65535;
            }
            int var15 = class57.field1173;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 65535) {
                var15 = 65535;
            }
            byte var16 = 0;
            if (class268.field4733 == 2) {
                var16 = 1;
            }
            int var17 = (int) var12;
            class154.field2792.method1516(52, 136);
            class154.field2792.method1286(arg0 ^ 0x16E4, var15 | var14 << 16);
            class154.field2792.method1276(var17 | var16 << 15, arg0 + 15099);
        }
        if (class248.field4342[96] || class248.field4342[97] || class248.field4342[98] || class248.field4342[99]) {
            class240.field4222 = true;
        }
        if (class95.field1863 > 0) {
            class95.field1863--;
        }
        if (class240.field4222 && class95.field1863 <= 0) {
            class66.field1345++;
            class240.field4222 = false;
            class95.field1863 = 20;
            class154.field2792.method1516(arg0 ^ 0x3B5C, 237);
            class154.field2792.method1299(class241.field4230, 4929);
            class154.field2792.method1325(false, class256.field4464);
        }
        if (class101.field1925 && !class216.field3844) {
            class54.field1133++;
            class216.field3844 = true;
            class154.field2792.method1516(arg0 + 15275, 212);
            class154.field2792.method1288((byte) -86, 1);
        }
        if (!class101.field1925 && class216.field3844) {
            class54.field1133++;
            class216.field3844 = false;
            class154.field2792.method1516(-109, 212);
            class154.field2792.method1288((byte) -45, 0);
        }
        if (!class120.field2234) {
            class226.field3978++;
            class154.field2792.method1516(-58, 165);
            class154.field2792.method1292(class83.method557(126), 10776);
            class120.field2234 = true;
        }
        class254.method1691((byte) -45);
        if (class271.field4786 != 30) {
            return;
        }
        class223.method1521(18743);
        class114.method740(arg0 + 37849);
        class154.field2788++;
        if (class154.field2788 > 750) {
            class108.method722(-1834571320);
            return;
        }
        class32.method213(-119);
        class125.method808(-397);
        class143.method944(arg0 + 47936);
        if (field4390 != null) {
            class176.method1157(arg0 + 15167);
        }
        for (int var18 = class1.method8(true, true); var18 != -1; var18 = class1.method8(true, false)) {
            class233.method1568(var18, arg0 + 15049);
            class245.field4313[class263.method1777(31, class179.field3277++)] = var18;
        }
        for (class64 var19 = class139.method908(0); var19 != null; var19 = class139.method908(0)) {
            int var20 = var19.method389((byte) -123);
            int var21 = var19.method392((byte) -127);
            if (var20 == 1) {
                class157.field2822[var21] = var19.field1290;
                class276.field4836[class263.method1777(31, class121.field2249++)] = var21;
            } else if (var20 == 2) {
                class177.field3250[var21] = var19.field1282;
                class7.field121[class263.method1777(class29.field729++, 31)] = var21;
            } else if (var20 == 3) {
                class21 var41 = class8.method55(65535, var21);
                if (!var19.field1282.method1788(arg0 ^ 0x5EAA, var41.field615)) {
                    var41.field615 = var19.field1282;
                    class220.method1508(var41, (byte) -77);
                }
            } else if (var20 == 4) {
                class21 var22 = class8.method55(65535, var21);
                int var23 = var19.field1281;
                int var24 = var19.field1290;
                if (var22.field481 != var24 || var22.field594 != var23) {
                    var22.field481 = var24;
                    var22.field594 = var23;
                    class220.method1508(var22, (byte) -114);
                }
            } else if (var20 == 5) {
                class21 var25 = class8.method55(65535, var21);
                if (var19.field1290 != var25.field623 || var19.field1290 == -1) {
                    var25.field614 = 0;
                    var25.field623 = var19.field1290;
                    var25.field535 = 0;
                    class220.method1508(var25, (byte) -116);
                }
            } else if (var20 == 6) {
                int var26 = var19.field1290;
                int var27 = var26 >> 10 & 0x1F;
                int var28 = var26 >> 5 & 0x1F;
                int var29 = var26 & 0x1F;
                int var30 = (var29 << 3) + (var27 << 19) + (var28 << 11);
                class21 var31 = class8.method55(65535, var21);
                if (var31.field515 != var30) {
                    var31.field515 = var30;
                    class220.method1508(var31, (byte) -113);
                }
            } else if (var20 == 7) {
                class21 var32 = class8.method55(arg0 + 80703, var21);
                boolean var33 = var19.field1290 == 1;
                if (var33 != var32.field563) {
                    var32.field563 = var33;
                    class220.method1508(var32, (byte) -76);
                }
            } else if (var20 == 8) {
                class21 var40 = class8.method55(65535, var21);
                if (var19.field1290 != var40.field495 || var19.field1281 != var40.field588 || var19.field1298 != var40.field587) {
                    var40.field588 = var19.field1281;
                    var40.field495 = var19.field1290;
                    var40.field587 = var19.field1298;
                    if (var40.field620 != -1) {
                        if (var40.field487 > 0) {
                            var40.field587 = var40.field587 * 32 / var40.field487;
                        } else if (var40.field491 > 0) {
                            var40.field587 = var40.field587 * 32 / var40.field491;
                        }
                    }
                    class220.method1508(var40, (byte) -53);
                }
            } else if (var20 == 9) {
                class21 var34 = class8.method55(65535, var21);
                if (var19.field1290 != var34.field620 || var19.field1281 != var34.field508) {
                    var34.field620 = var19.field1290;
                    var34.field508 = var19.field1281;
                    class220.method1508(var34, (byte) -108);
                }
            } else if (var20 == 10) {
                class21 var35 = class8.method55(65535, var21);
                if (var19.field1290 != var35.field555 || var19.field1281 != var35.field553 || var19.field1298 != var35.field582) {
                    var35.field553 = var19.field1281;
                    var35.field582 = var19.field1298;
                    var35.field555 = var19.field1290;
                    class220.method1508(var35, (byte) -60);
                }
            } else if (var20 == 11) {
                class21 var39 = class8.method55(arg0 + 80703, var21);
                var39.field604 = 0;
                var39.field488 = 0;
                var39.field523 = var39.field551 = var19.field1290;
                var39.field547 = var39.field493 = var19.field1281;
                class220.method1508(var39, (byte) -110);
            } else if (var20 == 12) {
                class21 var37 = class8.method55(arg0 ^ 0xFFFF3B3F, var21);
                int var38 = var19.field1290;
                if (var37 != null && var37.field519 == 0) {
                    if ((var37.field503 - var37.field479) < var38) {
                        var38 = var37.field503 - var37.field479;
                    }
                    if (var38 < 0) {
                        var38 = 0;
                    }
                    if (var37.field530 != var38) {
                        var37.field530 = var38;
                        class220.method1508(var37, (byte) -62);
                    }
                }
            } else if (var20 == 13) {
                class21 var36 = class8.method55(arg0 ^ 0xFFFF3B3F, var21);
                var36.field625 = var19.field1290;
            }
        }
        class187.field3369++;
        if (class143.field2623 != 0) {
            class3.field58 += 20;
            if (class3.field58 >= 400) {
                class143.field2623 = 0;
            }
        }
        if (class150.field2705 != null) {
            class55.field1160++;
            if (class55.field1160 >= 15) {
                class220.method1508(class150.field2705, (byte) -49);
                class150.field2705 = null;
            }
        }
        if (class127.field2360 != null) {
            class220.method1508(class127.field2360, (byte) -69);
            if (class136.field2492 > class153.field2776 + 5 || class136.field2492 < class153.field2776 - 5 || client.field2762 + 5 < class252.field4380 || class252.field4380 < client.field2762 - 5) {
                class68.field1385 = true;
            }
            class130.field2388++;
            if (class11.field247 == 0) {
                if (class68.field1385 && class130.field2388 >= 5) {
                    if (class259.field4485 == class127.field2360 && class91.field1806 != class64.field1288) {
                        class269.field4737++;
                        class21 var42 = class127.field2360;
                        byte var43 = 0;
                        if (class50.field1074 == 1 && var42.field516 == 206) {
                            var43 = 1;
                        }
                        if (var42.field469[class64.field1288] <= 0) {
                            var43 = 0;
                        }
                        if (class47.method305(-54, client.method1005(var42))) {
                            int var46 = class91.field1806;
                            int var47 = class64.field1288;
                            var42.field469[var47] = var42.field469[var46];
                            var42.field618[var47] = var42.field618[var46];
                            var42.field469[var46] = -1;
                            var42.field618[var46] = 0;
                        } else if (var43 == 1) {
                            int var44 = class91.field1806;
                            int var45 = class64.field1288;
                            while (var44 != var45) {
                                if (var44 > var45) {
                                    var42.method151(var44 - 1, var44, -72);
                                    var44--;
                                } else if (var44 < var45) {
                                    var42.method151(var44 + 1, var44, arg0 + 15057);
                                    var44++;
                                }
                            }
                        } else {
                            var42.method151(class64.field1288, class91.field1806, -111);
                        }
                        class154.field2792.method1516(-96, 22);
                        class154.field2792.method1325(false, class91.field1806);
                        class154.field2792.method1287((byte) 114, var43);
                        class154.field2792.method1292(class127.field2360.field537, 10776);
                        class154.field2792.method1276(class64.field1288, -48);
                    }
                } else if ((class188.field3376 == 1 || class61.method376(false, class252.field4384 - 1)) && class252.field4384 > 2) {
                    class27.method186((byte) -33);
                } else if (class252.field4384 > 0) {
                    class238.method1588((byte) 112);
                }
                class268.field4733 = 0;
                class127.field2360 = null;
                class55.field1160 = 10;
            }
        }
        class171.field3124 = 0;
        class108.field2039 = false;
        class157.field2816 = false;
        class21 var48 = class222.field3929;
        class222.field3929 = null;
        class21 var49 = class75.field1556;
        class240.field4216 = null;
        class75.field1556 = null;
        while (class263.method1779((byte) 113) && class171.field3124 < 128) {
            class99.field1906[class171.field3124] = class91.field1809;
            class195.field3538[class171.field3124] = class185.field3343;
            class171.field3124++;
        }
        field4390 = null;
        class255.field4445 = null;
        if (class186.field3353 != -1) {
            class32.method209(class143.field2616, (byte) -65, 0, 0, class138.field2558, 0, 0, class186.field3353);
        }
        class112.field2108++;
        if (class255.field4445 != null) {
            class7.method48(class255.field4445, class143.field2625, class271.field4788, (byte) 120);
            class255.field4445 = null;
        }
        while (true) {
            class116 var50;
            class21 var51;
            class21 var52;
            do {
                var50 = (class116) class23.field673.method1879(false);
                if (var50 == null) {
                    while (true) {
                        class116 var53;
                        class21 var54;
                        class21 var55;
                        do {
                            var53 = (class116) class36.field837.method1879(false);
                            if (var53 == null) {
                                while (true) {
                                    class116 var56;
                                    class21 var57;
                                    class21 var58;
                                    do {
                                        var56 = (class116) class261.field4531.method1879(false);
                                        if (var56 == null) {
                                            if (class121.field2256 && field4390 == null) {
                                                class121.field2256 = false;
                                            }
                                            if (class268.field4724 != null) {
                                                class166.method1091((byte) 124);
                                            }
                                            if (class4.field82 > 0 && class248.field4342[82] && class248.field4342[81] && class117.field2189 != 0) {
                                                int var59 = class12.field321 - class117.field2189;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class64.method391((byte) -125, var59, class229.field4018.field4713[0] + class142.field2596, class229.field4018.field4714[0] + class93.field1844);
                                            }
                                            if (class142.field2608 != -1) {
                                                int var60 = class142.field2608;
                                                int var61 = class90.field1775;
                                                if (class4.field82 > 0 && class248.field4342[82] && class248.field4342[81]) {
                                                    class64.method391((byte) -122, class12.field321, class142.field2596 + var61, class93.field1844 + var60);
                                                } else if (class112.field2099) {
                                                    class260.field4516++;
                                                    class154.field2792.method1516(79, 225);
                                                    class154.field2792.method1299(class93.field1844 + var60, 4929);
                                                    class154.field2792.method1292(class114.field2144, 10776);
                                                    class154.field2792.method1276(class142.field2596 + var61, arg0 + 15081);
                                                    class154.field2792.method1276(class5.field100, -36);
                                                    class3.field58 = 0;
                                                    class184.field3338 = class57.field1173;
                                                    class143.field2623 = 1;
                                                    class108.field2032 = class31.field777;
                                                } else {
                                                    boolean var62 = class131.method845(true, class229.field4018.field4713[0], 0, 0, var60, 0, class229.field4018.field4714[0], var61, 0, 0, 0, (byte) -128);
                                                    if (var62) {
                                                        class3.field58 = 0;
                                                        class143.field2623 = 1;
                                                        class184.field3338 = class57.field1173;
                                                        class108.field2032 = class31.field777;
                                                    }
                                                }
                                                class142.field2608 = -1;
                                                class112.field2099 = false;
                                            }
                                            class263.method1739((byte) -101);
                                            if (class222.field3929 != var48) {
                                                if (var48 != null) {
                                                    class220.method1508(var48, (byte) -116);
                                                }
                                                if (class222.field3929 != null) {
                                                    class220.method1508(class222.field3929, (byte) -110);
                                                }
                                            }
                                            if (class75.field1556 != var49 && class156.field2808 == class11.field245) {
                                                if (var49 != null) {
                                                    class220.method1508(var49, (byte) -57);
                                                }
                                                if (class75.field1556 != null) {
                                                    class220.method1508(class75.field1556, (byte) -69);
                                                }
                                            }
                                            if (class75.field1556 == null) {
                                                if (class156.field2808 > 0) {
                                                    class156.field2808--;
                                                }
                                            } else if (class156.field2808 < class11.field245) {
                                                class156.field2808++;
                                                if (class156.field2808 == class11.field245) {
                                                    class220.method1508(class75.field1556, (byte) -83);
                                                }
                                            }
                                            if (class89.field1772 == 1) {
                                                class267.method1808(arg0 + 15184);
                                            } else if (class89.field1772 == 2) {
                                                class164.method1080((byte) -65);
                                            } else {
                                                class122.method791((byte) 20);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class161.field2944[var63]++;
                                            }
                                            if (arg0 != -15168) {
                                                return;
                                            }
                                            int var64 = class148.method968(127);
                                            int var65 = class196.method1339(73);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class118.field2194 = 250;
                                                class22.field635++;
                                                class164.method1077(4000, true);
                                                class154.field2792.method1516(127, 132);
                                            }
                                            if (class68.field1380 != null && class68.field1380.field4114 == 1) {
                                                if (class68.field1380.field4117 != null) {
                                                    class125.method802(class148.field2696, -117, class29.field730);
                                                }
                                                class29.field730 = false;
                                                class148.field2696 = null;
                                                class68.field1380 = null;
                                            }
                                            class209.field3778++;
                                            class30.field747++;
                                            if (class30.field747 > 500) {
                                                class30.field747 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x2) == 2) {
                                                    class63.field1277 += class222.field3933;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class158.field2860 += class166.field3027;
                                                }
                                                if ((var66 & 0x1) == 1) {
                                                    class134.field2465 += class51.field1092;
                                                }
                                            }
                                            if (class134.field2465 < -50) {
                                                class51.field1092 = 2;
                                            }
                                            if (class158.field2860 < -40) {
                                                class166.field3027 = 1;
                                            }
                                            if (class134.field2465 > 50) {
                                                class51.field1092 = -2;
                                            }
                                            class1.field12++;
                                            if (class63.field1277 < -55) {
                                                class222.field3933 = 2;
                                            }
                                            if (class1.field12 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class1.field12 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class201.field3625 += class18.field418;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class121.field2255 += class85.field1677;
                                                }
                                            }
                                            if (class158.field2860 > 40) {
                                                class166.field3027 = -1;
                                            }
                                            if (class201.field3625 < -60) {
                                                class18.field418 = 2;
                                            }
                                            if (class121.field2255 < -20) {
                                                class85.field1677 = 1;
                                            }
                                            if (class63.field1277 > 55) {
                                                class222.field3933 = -2;
                                            }
                                            if (class121.field2255 > 10) {
                                                class85.field1677 = -1;
                                            }
                                            if (class201.field3625 > 60) {
                                                class18.field418 = -2;
                                            }
                                            if (class209.field3778 > 50) {
                                                class154.field2792.method1516(-106, 190);
                                                class261.field4536++;
                                            }
                                            if (class6.field118) {
                                                class61.method374(false);
                                                class6.field118 = false;
                                            }
                                            try {
                                                if (class166.field3023 != null && class154.field2792.field3497 > 0) {
                                                    class166.field3023.method806(0, class154.field2792.field3497, class154.field2792.field3469, -117);
                                                    class209.field3778 = 0;
                                                    class154.field2792.field3497 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class108.method722(-1834571320);
                                                return;
                                            }
                                        }
                                        var57 = var56.field2166;
                                        if (var57.field470 < 0) {
                                            break;
                                        }
                                        var58 = class8.method55(65535, var57.field536);
                                    } while (var58 == null || var58.field589 == null || var58.field589.length <= var57.field470 || var58.field589[var57.field470] != var57);
                                    class182.method1211(var56, 104);
                                }
                            }
                            var54 = var53.field2166;
                            if (var54.field470 < 0) {
                                break;
                            }
                            var55 = class8.method55(65535, var54.field536);
                        } while (var55 == null || var55.field589 == null || var54.field470 >= var55.field589.length || var55.field589[var54.field470] != var54);
                        class182.method1211(var53, 109);
                    }
                }
                var51 = var50.field2166;
                if (var51.field470 < 0) {
                    break;
                }
                var52 = class8.method55(65535, var51.field536);
            } while (var52 == null || var52.field589 == null || var51.field470 >= var52.field589.length || var52.field589[var51.field470] != var51);
            class182.method1211(var50, 125);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)V")
    public static final void method1685(int arg0, int arg1) {
        class2 var2 = class18.field417[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class2 var4 = class18.field417[var3][arg0][arg1] = class18.field417[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field33--;
                for (int var5 = 0; var5 < var4.field27; var5++) {
                    class70 var6 = var4.field37[var5];
                    if ((var6.field1408 >> 29 & 0x3L) == 2L && var6.field1405 == arg0 && var6.field1403 == arg1) {
                        var6.field1399--;
                    }
                }
            }
        }
        if (class18.field417[0][arg0][arg1] == null) {
            class18.field417[0][arg0][arg1] = new class2(0, arg0, arg1);
        }
        class18.field417[0][arg0][arg1].field48 = var2;
        class18.field417[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBII)V")
    public static final void method1686(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4396++;
        if (class163.field2967 < 100) {
            class121.method783(-1);
        }
        class133.method881(arg1, arg0, arg1 + arg4, arg0 + arg3);
        int var5 = 2 / ((arg2 - 52) / 32);
        if (class163.field2967 < 100) {
            byte var6 = 20;
            int var7 = arg4 / 2 + arg1;
            int var8 = arg3 / 2 + arg0 - var6 - 18;
            class133.method865(arg1, arg0, arg4, arg3, 0);
            class133.method876(var7 - 152, var8, 304, 34, 9179409);
            class133.method876(var7 - 151, var8 + 1, 302, 32, 0);
            class133.method865(var7 - 150, var8 - -2, class163.field2967 * 3, 30, 9179409);
            class133.method865(var7 + (class163.field2967 * 3) - 150, var8 - -2, 300 - (class163.field2967 * 3), 30, 0);
            class107.field2026.method401(class83.field1656, var7, var6 + var8, 16777215, -1);
            return;
        }
        class177.field3253 = class113.field2115 - ((int) ((float) arg3 / class201.field3627));
        class134.field2462 = (int) ((float) (arg3 * 2) / class201.field3627);
        class86.field1682 = (int) ((float) (arg4 * 2) / class201.field3627);
        client.field2771 = class207.field3755 - ((int) ((float) arg4 / class201.field3627));
        int var9 = class113.field2115 - ((int) ((float) arg3 / class201.field3627));
        int var10 = class207.field3755 - (int) ((float) arg4 / class201.field3627);
        int var11 = (int) ((float) arg4 / class201.field3627) + class207.field3755;
        int var12 = class113.field2115 + ((int) ((float) arg3 / class201.field3627));
        class269.method1820(arg1 + arg4, arg0 + arg3, 2998, var11, var12, arg1, var10, arg0, var9);
        class189.method1239(arg1, arg1 + arg4, var9, var10, (byte) 79, var12, var11, arg0, arg0 + arg3);
        class30.method197(arg1 + arg4, var9, arg0, var10, arg1, var12, var11, 1, arg0 + arg3);
        if (class33.field800 > 0) {
            class33.field800--;
        }
        if (!class92.field1816) {
            return;
        }
        int var13 = arg1 + arg4 - 5;
        int var14 = arg0 + arg3 - 8;
        class151.field2733.method404(class124.method797(-120, new class263[] { class158.field2856, class136.method891(-125, class225.field3969) }), var13, var14, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        int var18 = var14 - 15;
        int var17 = 16776960;
        if (var16 > 65536) {
            var17 = 16711680;
        }
        class151.field2733.method404(class124.method797(-48, new class263[] { class181.field3285, class136.method891(-115, var16), class2.field26 }), var13, var18, var17, -1);
        var14 = var18 - 15;
    }
}
