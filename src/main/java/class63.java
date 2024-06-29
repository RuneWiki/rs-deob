import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class63 extends class65 {

    @OriginalMember(owner = "client!kc", name = "Ic", descriptor = "I")
    public int field1296 = -1;

    @OriginalMember(owner = "client!kc", name = "Qc", descriptor = "I")
    public int field1304 = 0;

    @OriginalMember(owner = "client!kc", name = "Vc", descriptor = "I")
    public int field1309 = 0;

    @OriginalMember(owner = "client!kc", name = "Uc", descriptor = "I")
    public int field1308 = -1;

    @OriginalMember(owner = "client!kc", name = "Xc", descriptor = "I")
    public int field1311 = 0;

    @OriginalMember(owner = "client!kc", name = "Lc", descriptor = "I")
    public int field1299 = 0;

    @OriginalMember(owner = "client!kc", name = "Rc", descriptor = "I")
    public int field1305 = 0;

    @OriginalMember(owner = "client!kc", name = "nd", descriptor = "Z")
    public boolean field1327 = false;

    @OriginalMember(owner = "client!kc", name = "Sc", descriptor = "[I")
    public static int[] field1306 = new int[500];

    @OriginalMember(owner = "client!kc", name = "ed", descriptor = "Lo;")
    public static class84 field1318 = class15.method124("Mar", 255);

    @OriginalMember(owner = "client!kc", name = "Wc", descriptor = "Z")
    public static boolean field1310 = false;

    @OriginalMember(owner = "client!kc", name = "hd", descriptor = "Z")
    public static boolean field1321 = false;

    @OriginalMember(owner = "client!kc", name = "kd", descriptor = "[I")
    public static int[] field1324 = new int[2000];

    @OriginalMember(owner = "client!kc", name = "Fc", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!kc", name = "Gc", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!kc", name = "Hc", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!kc", name = "Jc", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!kc", name = "Kc", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!kc", name = "Nc", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!kc", name = "Oc", descriptor = "I")
    public int field1302;

    @OriginalMember(owner = "client!kc", name = "Pc", descriptor = "I")
    public int field1303;

    @OriginalMember(owner = "client!kc", name = "Tc", descriptor = "I")
    public int field1307;

    @OriginalMember(owner = "client!kc", name = "Zc", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!kc", name = "ad", descriptor = "I")
    public int field1314;

    @OriginalMember(owner = "client!kc", name = "dd", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!kc", name = "fd", descriptor = "I")
    public int field1319;

    @OriginalMember(owner = "client!kc", name = "gd", descriptor = "I")
    public int field1320;

    @OriginalMember(owner = "client!kc", name = "jd", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!kc", name = "ld", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!kc", name = "bd", descriptor = "Lud;")
    public static class118 field1315;

    @OriginalMember(owner = "client!kc", name = "md", descriptor = "Lud;")
    public static class118 field1326;

    @OriginalMember(owner = "client!kc", name = "id", descriptor = "Lle;")
    public class71 field1322;

    @OriginalMember(owner = "client!kc", name = "Mc", descriptor = "Lne;")
    public class83 field1300;

    @OriginalMember(owner = "client!kc", name = "Yc", descriptor = "Lo;")
    public class84 field1312;

    @OriginalMember(owner = "client!kc", name = "cd", descriptor = "[Lvb;")
    public static class121[] field1316;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "(I)V", line = 4)
    public static final void method490(int arg0) {
        ++field1297;
        class123 var1 = class99.field2104;
        synchronized (class99.field2104) {
            class111.field2414 = class45.field942;
            class38.field748 = class118.field2615;
            class119.field2644 = class78.field1669;
            class105.field2225 = class126.field2784;
            class128.field2820 = class60.field1259;
            class109.field2367 = class123.field2763;
            class1.field19 = class55.field1143;
            class126.field2784 = arg0;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(Z)V", line = 28)
    public static final void method491(boolean arg0) {
        ++field1325;
        for (class64 var1 = (class64) class30.field595.method695((byte) -121); var1 != null; var1 = (class64) class30.field595.method702(0)) {
            if (~class1.field11 == ~var1.field1329 && ~var1.field1347 <= ~class128.field2837) {
                if (class128.field2837 >= var1.field1333) {
                    if (var1.field1359 > 0) {
                        class115 var2 = class3.field30[var1.field1359 + -1];
                        if (var2 != null && ~var2.field1380 <= -1 && var2.field1380 < 13312 && ~var2.field1391 <= -1 && var2.field1391 < 13312) {
                            var1.method497(var2.field1380, class105.method778(var1.field1329, var2.field1380, 3, var2.field1391) - var1.field1328, 1, class128.field2837, var2.field1391);
                        }
                    }
                    if (var1.field1359 < 0) {
                        int var3 = -var1.field1359 + -1;
                        class63 var4;
                        if (class101.field2142 != var3) {
                            var4 = class119.field2643[var3];
                        } else {
                            var4 = class107.field2271;
                        }
                        if (var4 != null && var4.field1380 >= 0 && ~var4.field1380 > -13313 && ~var4.field1391 <= -1 && ~var4.field1391 > -13313) {
                            var1.method497(var4.field1380, class105.method778(var1.field1329, var4.field1380, 3, var4.field1391) + -var1.field1328, 1, class128.field2837, var4.field1391);
                        }
                    }
                    var1.method500((byte) -79, class54.field1126);
                    class112.field2427.method811(class1.field11, (int) var1.field1357, (int) var1.field1346, (int) var1.field1330, 60, var1, var1.field1362, -1, false);
                }
            } else {
                var1.method333(0);
            }
        }
        if (arg0) {
            method493(78);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Leb;I)V", line = 88)
    public final void method492(class27 arg0, int arg1) {
        arg0.field482 = 0;
        ++field1323;
        int var3 = arg0.method231(arg1 ^ -10241);
        this.field1308 = arg0.method219(arg1 + 37165);
        int var4 = -1;
        this.field1296 = arg0.method219(arg1 ^ -16595);
        int[] var5 = new int[12];
        this.field1311 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg0.method231(255);
            if (~var7 == -1) {
                var5[var6] = 0;
            } else {
                int var8 = arg0.method231(255);
                var5[var6] = (var7 << 8) + var8;
                if (var6 == 0 && var5[0] == 65535) {
                    var4 = arg0.method227(127);
                    break;
                }
                if (var5[var6] >= 512) {
                    int var12 = class126.method970(arg1 ^ 10434, var5[var6] + -512).field917;
                    if (~var12 != -1) {
                        this.field1311 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        for (int var10 = 0; var10 < 5; ++var10) {
            int var11 = arg0.method231(arg1 + 10751);
            if (var11 < 0 || var11 >= class11.field218[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field1399 = arg0.method227(arg1 ^ -10369);
        if (~super.field1399 == -65536) {
            super.field1399 = -1;
        }
        super.field1381 = arg0.method227(127);
        if (super.field1381 == 65535) {
            super.field1381 = -1;
        }
        super.field1373 = arg0.method227(127);
        if (~super.field1373 == -65536) {
            super.field1373 = -1;
        }
        super.field1419 = arg0.method227(127);
        if (~super.field1419 == -65536) {
            super.field1419 = -1;
        }
        super.field1420 = arg0.method227(127);
        if (super.field1420 == 65535) {
            super.field1420 = -1;
        }
        super.field1440 = arg0.method227(127);
        if (super.field1440 == 65535) {
            super.field1440 = -1;
        }
        super.field1378 = arg0.method227(127);
        if (super.field1378 == 65535) {
            super.field1378 = -1;
        }
        if (arg1 == -10496) {
            this.field1312 = class57.method463(arg0.method240(121), (byte) -42).method637(true);
            this.field1305 = arg0.method231(255);
            this.field1299 = arg0.method227(127);
            if (this.field1322 == null) {
                this.field1322 = new class71();
            }
            this.field1322.method526(~var3 == -2, var9, var4, var5, (byte) 86);
        }
    }

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "(I)V", line = 220)
    public static void method493(int arg0) {
        field1318 = null;
        if (arg0 == -1537) {
            field1306 = null;
            field1316 = null;
            field1324 = null;
            field1326 = null;
            field1315 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILmc;IIIIIII)V", line = 248)
    public static final void method494(int arg0, class75 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1313;
        if (!class55.field1132) {
            class6.field113 = 0;
        } else {
            class6.field113 = 32;
        }
        class55.field1132 = false;
        if (~arg7 <= ~arg2 && ~arg7 > ~(arg2 + 16) && arg8 <= arg6 && arg8 + 16 > arg6) {
            arg1.field1588 -= class65.field1444 * 4;
            if (~arg5 == -2) {
                class39.field798 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                class85.field1927 = true;
            }
        } else if (~arg2 >= ~arg7 && ~(arg2 + 16) < ~arg7 && arg4 + -16 + arg8 <= arg6 && arg4 + arg8 > arg6) {
            if (arg5 == 2 || ~arg5 == -4) {
                class85.field1927 = true;
            }
            if (~arg5 == -2) {
                class39.field798 = true;
            }
            arg1.field1588 += class65.field1444 * 4;
        } else if (arg2 - class6.field113 <= arg7 && ~arg7 > ~(arg2 + 16 + class6.field113) && arg8 - -16 <= arg6 && arg6 < arg8 + -16 + arg4 && class65.field1444 > 0) {
            if (arg5 == 1) {
                class39.field798 = true;
            }
            if (arg5 == 2 || ~arg5 == -4) {
                class85.field1927 = true;
            }
            class55.field1132 = true;
            int var9 = (arg4 - 32) * arg4 / arg3;
            if (~var9 > -9) {
                var9 = 8;
            }
            int var10 = arg6 + -16 - (arg8 - -(var9 / 2));
            int var11 = arg4 + -32 + -var9;
            arg1.field1588 = (-arg4 + arg3) * var10 / var11;
        }
        if (arg0 <= 97) {
            method495((byte[]) null, 81, -71, -126, -63, -47, 120, (class33[]) null, -63, (byte) -120);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "([BIIIIII[Lfb;IB)V", line = 340)
    public static final void method495(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class33[] arg7, int arg8, byte arg9) {
        ++field1298;
        for (int var10 = 0; var10 < 8; ++var10) {
            for (int var15 = 0; var15 < 8; ++var15) {
                if (arg4 + var10 > 0 && ~(arg4 - -var10) > -104 && arg1 - -var15 > 0 && arg1 + var15 < 103) {
                    arg7[arg8].field654[arg4 + var10][arg1 + var15] = class61.method486(arg7[arg8].field654[arg4 + var10][arg1 + var15], -16777217);
                }
            }
        }
        if (arg9 <= 52) {
            method493(-27);
        }
        class27 var11 = new class27(arg0);
        for (int var12 = 0; var12 < 4; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; ~var14 > -65; ++var14) {
                    if (~arg5 == ~var12 && var13 >= arg2 && ~var13 > ~(arg2 + 8) && ~arg6 >= ~var14 && ~var14 > ~(arg6 + 8)) {
                        class67.method515(class8.method65(true, 7 & var14, arg3, 7 & var13) + arg1, arg8, arg3, 0, var11, 0, (byte) -74, class103.method774(var13 & 7, 124, var14 & 7, arg3) + arg4);
                    } else {
                        class67.method515(-1, 0, 0, 0, var11, 0, (byte) -106, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "(I)Z", line = 422)
    public final boolean method496(int arg0) {
        ++field1317;
        if (arg0 != 28738) {
            method494(52, (class75) null, 34, -74, 40, 103, -119, 36, 105);
        }
        return this.field1322 != null;
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)Lne;", line = 437)
    public final class83 method471(byte arg0) {
        ++field1301;
        if (this.field1322 == null) {
            return null;
        } else {
            class31 var2 = ~super.field1423 != 0 && ~super.field1429 == -1 ? class74.method554(super.field1423, 4867) : null;
            class31 var3 = super.field1434 == -1 || this.field1327 || super.field1434 == super.field1399 && var2 != null ? null : class74.method554(super.field1434, 4867);
            class83 var4 = this.field1322.method530(super.field1432, super.field1409, (byte) 101, var2, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method605();
                super.field1426 = var4.field1207;
                if (!this.field1327 && ~super.field1417 != 0 && super.field1401 != -1) {
                    class83 var5 = class6.method36((byte) 30, super.field1417).method264((byte) -39, super.field1401);
                    if (var5 != null) {
                        var5.method607(0, -super.field1398, 0);
                        class83[] var6 = new class83[] { var4, var5 };
                        var4 = new class83(var6, 2, true);
                    }
                }
                if (!this.field1327 && this.field1300 != null) {
                    if (this.field1309 <= class128.field2837) {
                        this.field1300 = null;
                    }
                    if (class128.field2837 >= this.field1304 && ~class128.field2837 > ~this.field1309) {
                        class83 var7 = this.field1300;
                        class83[] var8 = new class83[] { var4, var7 };
                        var7.method607(-super.field1380 + this.field1320, -this.field1307 + this.field1314, -super.field1391 + this.field1302);
                        if (~super.field1390 == -513) {
                            var7.method618();
                            var7.method618();
                            var7.method618();
                        } else if (~super.field1390 == -1025) {
                            var7.method618();
                            var7.method618();
                        } else if (super.field1390 == 1536) {
                            var7.method618();
                        }
                        var4 = new class83(var8, 2, true);
                        if (super.field1390 != 512) {
                            if (super.field1390 == 1024) {
                                var7.method618();
                                var7.method618();
                            } else if (~super.field1390 == -1537) {
                                var7.method618();
                                var7.method618();
                                var7.method618();
                            }
                        } else {
                            var7.method618();
                        }
                        var7.method607(-this.field1320 + super.field1380, -this.field1314 + this.field1307, -this.field1302 + super.field1391);
                    }
                }
                if (arg0 != 3) {
                    this.method471((byte) -110);
                }
                var4.field1826 = true;
                return var4;
            }
        }
    }
}
