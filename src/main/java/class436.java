import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class436 extends class30 {

    @OriginalMember(owner = "client!en", name = "gb", descriptor = "Z")
    public boolean field6402 = false;

    @OriginalMember(owner = "client!en", name = "pb", descriptor = "Z")
    public boolean field6411 = false;

    @OriginalMember(owner = "client!en", name = "xb", descriptor = "Z")
    public boolean field6419 = false;

    @OriginalMember(owner = "client!en", name = "Ab", descriptor = "Z")
    public boolean field6422 = false;

    @OriginalMember(owner = "client!en", name = "yb", descriptor = "Z")
    public boolean field6420 = false;

    @OriginalMember(owner = "client!en", name = "Eb", descriptor = "I")
    public static int field6426 = 0;

    @OriginalMember(owner = "client!en", name = "qb", descriptor = "Lqu;")
    public static class364 field6412 = new class364(68, 3);

    @OriginalMember(owner = "client!en", name = "Gb", descriptor = "Lnj;")
    public static class487 field6428 = new class487("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!en", name = "cb", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!en", name = "db", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!en", name = "eb", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!en", name = "fb", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!en", name = "hb", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!en", name = "ib", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!en", name = "jb", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!en", name = "kb", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!en", name = "lb", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!en", name = "mb", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!en", name = "nb", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!en", name = "ob", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!en", name = "rb", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!en", name = "sb", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!en", name = "tb", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!en", name = "ub", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!en", name = "vb", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!en", name = "wb", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!en", name = "zb", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!en", name = "Bb", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!en", name = "Cb", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!en", name = "Db", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!en", name = "Fb", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public final void method2657(int arg0) {
        this.method2658(true, 2);
        ++field6415;
        super.field266 = true;
        super.field283 = 1;
        super.field265 = true;
        super.field299 = true;
        super.field290 = true;
        if (arg0 > -35) {
            this.method2668(true);
        }
        super.field268 = true;
        super.field298 = true;
        super.field271 = true;
        super.field286 = super.field291 = 2;
        super.field262 = true;
        super.field263 = true;
        super.field267 = super.field285 = 0;
        super.field281 = true;
        super.field284 = true;
        if (class223.field3276 <= 95) {
            class295.method1828((byte) -124, 0);
        } else {
            class295.method1828((byte) -109, 2);
        }
        super.field297 = false;
        super.field278 = 0;
        super.field296 = true;
        this.method2668(true);
        super.field288 = 4;
        class394.method2372(true);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(ZI)V")
    public final void method2658(boolean arg0, int arg1) {
        ++field6423;
        if (arg1 != 2) {
            method2670(120L, -95, -98, -12, false, (byte) -63, (String) null, -38, (String) null, -108, false);
        }
        super.field279 = arg0;
        if (class312.field4690 != null) {
            class312.field4690.method2007(!this.method2675(0, class239.field3499), 31799);
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(ZI)Lwca;")
    public static final class311 method2659(boolean arg0, int arg1) {
        if (!arg0) {
            method2679((String) null, 103);
        }
        ++field6425;
        int var2 = arg1 >> 16;
        int var3 = 65535 & arg1;
        if (class251.field3650[var2] == null || class251.field3650[var2][var3] == null) {
            boolean var4 = class159.method929(0, var2);
            if (!var4) {
                return null;
            }
        }
        return class251.field3650[var2][var3];
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public final void method2660(boolean arg0) {
        ++field6405;
        this.method2658(true, 2);
        super.field281 = false;
        super.field268 = arg0;
        super.field263 = false;
        super.field290 = false;
        super.field286 = super.field291 = 0;
        super.field267 = super.field285 = 0;
        super.field299 = false;
        super.field284 = false;
        super.field266 = false;
        super.field265 = false;
        super.field283 = 0;
        super.field298 = false;
        super.field271 = false;
        super.field262 = false;
        class295.method1828((byte) -124, 0);
        super.field296 = true;
        super.field278 = 0;
        super.field297 = false;
        this.method2668(true);
        super.field288 = 2;
        class394.method2372(true);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Luf;I)V")
    public final void method2661(class353 arg0, int arg1) {
        ++field6404;
        class211 var3 = null;
        try {
            class286 var4 = arg0.method2175("", 44, true);
            while (var4.field4208 == 0) {
                class428.method2624(1, 1L);
            }
            if (var4.field4208 == 1) {
                var3 = (class211) var4.field4213;
                class428 var5 = new class428(class477.method2897((byte) 73));
                this.method135(0, var5);
                var3.method1368((byte) 37, 0, var5.field6221, var5.field6162);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1367(0);
            }
        } catch (Exception var6) {
        }
        if (arg1 != -1) {
            field6412 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
    private final int method2662(int arg0, int arg1) {
        ++field6398;
        byte var3;
        if (~arg1 >= -12001) {
            if (~arg1 >= -5001) {
                if (arg1 > 2000) {
                    this.method2660(true);
                    var3 = 2;
                } else {
                    var3 = 1;
                    this.method2666(arg0 + 1);
                }
            } else {
                var3 = 3;
                this.method2664(false);
            }
        } else {
            var3 = 4;
            this.method2657(-90);
        }
        if (~class239.field3499 != -3) {
            super.field264 = 2;
            class447.method2712(10, 2);
        }
        this.method2661(class328.field4850, arg0);
        return arg0 != -1 ? -45 : var3;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BLdda;)V")
    public static final void method2663(byte arg0, class597 arg1) {
        if (arg0 != -12) {
            field6412 = null;
        }
        ++field6407;
        class36.field414 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V")
    public final void method2664(boolean arg0) {
        ++field6399;
        this.method2658(true, 2);
        super.field283 = 1;
        super.field286 = super.field291 = 1;
        super.field298 = true;
        super.field299 = false;
        super.field268 = true;
        super.field281 = true;
        super.field266 = true;
        super.field267 = super.field285 = 0;
        super.field262 = true;
        super.field263 = arg0;
        super.field271 = true;
        super.field265 = true;
        super.field284 = true;
        super.field290 = true;
        if (~class223.field3276 < -96) {
            class295.method1828((byte) -115, 1);
        } else {
            class295.method1828((byte) -125, 0);
        }
        super.field278 = 0;
        super.field297 = false;
        super.field296 = true;
        this.method2668(true);
        super.field288 = 3;
        class394.method2372(true);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)I")
    public final int method2665(byte arg0) {
        ++field6414;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class353.field5140 != 3 && class353.field5140 != 2) {
            if (class353.field5142.startsWith("win")) {
                var4 = true;
                var3 = true;
                if (!class353.field5125.startsWith("amd64") && !class353.field5125.startsWith("x86_64")) {
                    var2 = true;
                }
            } else {
                var3 = true;
            }
        }
        if (this.field6411) {
            var3 = false;
        }
        if (this.field6419) {
            var4 = false;
        }
        if (this.field6420) {
            var2 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2667((byte) 39);
        } else {
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class73.method431(1000, 2, -12693);
                } catch (Exception var14) {
                }
            }
            if (arg0 >= -19) {
                field6426 = -61;
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class73.method431(1000, 3, -12693);
                    if (~class239.field3499 == -4) {
                        class374 var8 = class379.field5558.method287();
                        long var9 = var8.field5508 & 281474976710655L;
                        int var11 = var8.field5509;
                        if (var11 != 4318) {
                            if (var11 == 4098) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var13) {
                }
            }
            if (var3) {
                try {
                    var6 = class73.method431(1000, 1, -12693);
                } catch (Exception var12) {
                }
            }
            if (~var5 == 0 && ~var6 == 0 && ~var7 == 0) {
                return this.method2667((byte) 99);
            } else if (var7 < var5 && ~var6 > ~var5) {
                return this.method2662(-1, var5);
            } else {
                return var7 <= var6 ? this.method2669(1, 1, var6) : this.method2669(1, 3, var7);
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
    public final void method2666(int arg0) {
        this.method2658(false, arg0 + 2);
        ++field6403;
        super.field284 = false;
        super.field299 = false;
        super.field283 = 0;
        super.field267 = super.field285 = 0;
        super.field266 = false;
        super.field265 = false;
        super.field298 = false;
        super.field268 = false;
        super.field290 = false;
        super.field262 = false;
        super.field263 = false;
        super.field281 = false;
        super.field286 = super.field291 = arg0;
        super.field271 = false;
        class295.method1828((byte) -127, 0);
        super.field278 = 0;
        super.field297 = false;
        super.field296 = false;
        this.method2668(true);
        super.field288 = 1;
        class394.method2372(true);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)I")
    private final int method2667(byte arg0) {
        ++field6421;
        byte var3;
        if (class223.field3276 >= 96) {
            int var2 = class28.method125(false);
            if (var2 > 100) {
                if (~var2 < -501) {
                    if (var2 <= 1000) {
                        this.method2660(true);
                        var3 = 2;
                    } else {
                        var3 = 1;
                        this.method2666(0);
                    }
                } else {
                    var3 = 3;
                    this.method2664(false);
                }
            } else {
                this.method2657(-81);
                var3 = 4;
            }
        } else {
            this.method2666(0);
            var3 = 1;
        }
        if (~class239.field3499 != -1) {
            super.field264 = 0;
            class447.method2712(10, 0);
        }
        this.method2661(class328.field4850, -1);
        if (arg0 < 33) {
            this.method2657(98);
        }
        return var3;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
    private final void method2668(boolean arg0) {
        if (!arg0) {
            this.field6422 = true;
        }
        ++field6406;
        if (~class56.field692 >= -2) {
            super.field270 = 2;
        } else {
            super.field270 = 4;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(III)I")
    private final int method2669(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field6412 = null;
        }
        ++field6416;
        byte var4;
        if (arg2 <= 20000) {
            if (arg2 > 10000) {
                var4 = 3;
                this.method2664(false);
            } else if (arg2 > 5000) {
                this.method2660(true);
                var4 = 2;
            } else {
                var4 = 1;
                this.method2666(0);
            }
        } else {
            this.method2657(-78);
            var4 = 4;
        }
        if (~class239.field3499 != ~arg1) {
            super.field264 = arg1;
            class447.method2712(arg0 ^ 11, arg1);
        }
        this.method2661(class328.field4850, -1);
        return var4;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(JIIIZBLjava/lang/String;ILjava/lang/String;IZ)V")
    public static final void method2670(long arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, String arg6, int arg7, String arg8, int arg9, boolean arg10) {
        ++field6417;
        if (!class139.field1826 && class487.field7385 < 500) {
            int var12 = ~arg9 != 0 ? arg9 : class362.field5233;
            if (arg5 != -5) {
                field6428 = null;
            }
            class548 var13 = new class548(arg6, arg8, var12, arg2, arg1, arg0, arg7, arg3, arg4, arg10);
            class272.field4014.method2492(var13, (byte) 33);
            ++class487.field7385;
        }
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(ZI)Z")
    public final boolean method2671(boolean arg0, int arg1) {
        ++field6401;
        if (!arg0) {
            return true;
        } else {
            return arg1 == 0 ? super.field279 : true;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZ)Lwu;")
    public static final class500 method2672(int arg0, boolean arg1) {
        ++field6400;
        class500[] var2 = class312.method1922((byte) 127);
        for (int var3 = 0; var3 < var2.length; ++var3) {
            class500 var4 = var2[var3];
            if (~var4.field7495 == ~arg0) {
                return var4;
            }
        }
        if (arg1) {
            field6428 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)V")
    public static void method2673(int arg0) {
        field6428 = null;
        field6412 = null;
        int var1 = -9 % ((22 - arg0) / 50);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(B)I")
    public static final int method2674(byte arg0) {
        if (arg0 < 63) {
            field6426 = -35;
        }
        ++field6408;
        return 16;
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II)Z")
    public final boolean method2675(int arg0, int arg1) {
        ++field6418;
        return arg0 == arg1 && !this.field6402 ? super.field279 : true;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(II)I")
    public final int method2676(int arg0, int arg1) {
        ++field6409;
        if (this.field6422) {
            return 0;
        } else {
            if (arg1 <= 117) {
                this.method2660(false);
            }
            if (!this.method2675(0, arg0)) {
                return 1;
            } else {
                return !super.field298 ? 1 : 2;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lps;I)V")
    private final void method2677(class428 arg0, int arg1) {
        ++field6410;
        if (arg0.field6162.length - arg0.field6221 >= 1) {
            int var3 = arg0.method2561((byte) 125);
            if (var3 >= 0 && ~var3 >= -19) {
                byte var4;
                if (var3 != 18) {
                    if (var3 == 17) {
                        var4 = 40;
                    } else if (var3 != 16) {
                        if (~var3 == -16) {
                            var4 = 37;
                        } else if (~var3 == -15) {
                            var4 = 36;
                        } else if (var3 != 13) {
                            if (~var3 == -13) {
                                var4 = 34;
                            } else if (~var3 == -12) {
                                var4 = 33;
                            } else if (~var3 != -11) {
                                if (~var3 != -10) {
                                    if (~var3 == -9) {
                                        var4 = 30;
                                    } else if (~var3 != -8) {
                                        if (~var3 == -7) {
                                            var4 = 28;
                                        } else if (var3 != 5) {
                                            if (~var3 != -5) {
                                                if (~var3 != -4) {
                                                    if (var3 == 2) {
                                                        var4 = 22;
                                                    } else if (~var3 != -2) {
                                                        var4 = 19;
                                                    } else {
                                                        var4 = 23;
                                                    }
                                                } else {
                                                    var4 = 23;
                                                }
                                            } else {
                                                var4 = 24;
                                            }
                                        } else {
                                            var4 = 28;
                                        }
                                    } else {
                                        var4 = 29;
                                    }
                                } else {
                                    var4 = 31;
                                }
                            } else {
                                var4 = 32;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 41;
                }
                if (~(arg0.field6162.length + -arg0.field6221) <= ~var4) {
                    super.field287 = arg0.method2561((byte) -58);
                    if (super.field287 >= 1) {
                        if (super.field287 > 4) {
                            super.field287 = 4;
                        }
                    } else {
                        super.field287 = 1;
                    }
                    this.method2658(~arg0.method2561((byte) -85) == -2, 2);
                    super.field298 = arg0.method2561((byte) -93) == 1;
                    super.field268 = arg0.method2561((byte) -115) == 1;
                    super.field266 = ~arg0.method2561((byte) 127) == -2;
                    super.field283 = arg0.method2561((byte) 112) == 1 ? 1 : 0;
                    super.field281 = arg0.method2561((byte) 112) == 1;
                    super.field290 = arg0.method2561((byte) 115) == 1;
                    super.field284 = arg0.method2561((byte) -44) == 1;
                    super.field286 = arg0.method2561((byte) 125);
                    if (~super.field286 < -3) {
                        super.field286 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field291 = arg0.method2561((byte) -65);
                    }
                    if (~var3 <= -3) {
                        super.field271 = ~arg0.method2561((byte) -73) == -2;
                        if (var3 >= 17) {
                            super.field263 = ~arg0.method2561((byte) 112) == -2;
                        }
                    } else {
                        super.field271 = ~arg0.method2561((byte) -34) == -2;
                        arg0.method2561((byte) -25);
                    }
                    super.field299 = ~arg0.method2561((byte) -81) == -2;
                    super.field265 = ~arg0.method2561((byte) -50) == -2;
                    super.field267 = arg0.method2561((byte) 121);
                    if (~super.field267 < -3) {
                        super.field267 = 2;
                    }
                    super.field285 = super.field267;
                    super.field300 = arg0.method2561((byte) -97) == 1;
                    super.field276 = arg0.method2561((byte) 118);
                    if (~super.field276 < -128) {
                        super.field276 = 127;
                    }
                    super.field280 = arg0.method2561((byte) 109);
                    super.field303 = arg0.method2561((byte) -80);
                    if (~super.field303 < -128) {
                        super.field303 = 127;
                    }
                    if (var3 >= 1) {
                        super.field269 = arg0.method2620(arg1 + -12912);
                        super.field302 = arg0.method2620(78);
                    }
                    if (~var3 <= -4 && ~var3 > -7) {
                        arg0.method2561((byte) -118);
                    }
                    if (var3 >= 4) {
                        int var5 = arg0.method2561((byte) 117);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class223.field3276 > -97) {
                            var5 = 0;
                        }
                        class295.method1828((byte) -120, var5);
                    }
                    if (var3 >= 5) {
                        super.field289 = arg0.method2589(arg1 + -24181);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field293 = var6 = arg0.method2561((byte) -82);
                    }
                    if (~super.field293 != -2 && super.field293 != 2) {
                        super.field293 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field305 = ~arg0.method2561((byte) -46) == -2;
                    }
                    if (var3 >= 8) {
                        super.field301 = arg0.method2561((byte) 119) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field278 = arg0.method2561((byte) 113);
                    }
                    if (~super.field278 > -1 || super.field278 > class390.method2353(false, class223.field3276)) {
                        super.field278 = 0;
                    }
                    if (var3 >= 10) {
                        super.field297 = arg0.method2561((byte) -29) != 0;
                    }
                    if (var3 >= 11) {
                        super.field292 = ~arg0.method2561((byte) 114) != -1;
                    }
                    if (~var3 <= -13) {
                        super.field283 = arg0.method2561((byte) 114);
                    }
                    if (arg1 == 13002) {
                        if (super.field283 < 0 || super.field283 > 2) {
                            super.field283 = 1;
                        }
                        if (var3 >= 13) {
                            super.field296 = arg0.method2561((byte) 124) == 1;
                        }
                        if (~var3 > -15) {
                            if (~var6 == -1) {
                                super.field264 = 2;
                            } else {
                                super.field264 = 1;
                            }
                        } else {
                            super.field264 = arg0.method2561((byte) -88);
                        }
                        if (~super.field264 > -1 || super.field264 > 5) {
                            super.field264 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field270 = arg0.method2561((byte) -50);
                            if (~super.field270 > -1 || ~super.field270 < -5) {
                                super.field270 = ~class56.field692 != -2 ? 4 : 2;
                            }
                        }
                        if (~var3 <= -17) {
                            super.field262 = arg0.method2561((byte) -21) == 1;
                            try {
                                if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                    super.field262 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && super.field264 == 0) {
                            super.field264 = 2;
                        }
                        if (var3 >= 18) {
                            super.field288 = arg0.method2561((byte) 113);
                            if (super.field288 < 0 || super.field288 > 4) {
                                super.field288 = 0;
                            }
                            if (~super.field288 == -3) {
                                super.field268 = true;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lcd;I)V")
    public static final void method2678(class86 arg0, int arg1) {
        arg0.field996 = 0;
        ++field6424;
        if (arg0.field1039 != -1) {
            class224 var2 = class470.field7205.method3498(false, arg0.field1039);
            if (var2 != null && var2.field3296 != null) {
                label400: {
                    ++arg0.field1000;
                    if (~arg0.field1003 > ~var2.field3296.length && ~arg0.field1000 < ~var2.field3307[arg0.field1003]) {
                        arg0.field1000 = 1;
                        ++arg0.field1003;
                        ++arg0.field1048;
                        class295.method1830(arg0.field1003, arg0.field3463, (byte) 52, arg0.field3457, var2, class239.field3493 == arg0, arg0.field3464);
                    }
                    if (arg0.field1003 >= var2.field3296.length) {
                        arg0.field1000 = 0;
                        arg0.field1003 = 0;
                        if (arg0.field1065) {
                            arg0.field1039 = arg0.method513(0).method1493(true);
                            if (arg0.field1039 == -1) {
                                arg0.field1065 = false;
                                break label400;
                            }
                            var2 = class470.field7205.method3498(false, arg0.field1039);
                        }
                        class295.method1830(arg0.field1003, arg0.field3463, (byte) -99, arg0.field3457, var2, class239.field3493 == arg0, arg0.field3464);
                    }
                    arg0.field1048 = arg0.field1003 + 1;
                    if (var2.field3296.length <= arg0.field1048) {
                        arg0.field1048 = 0;
                    }
                }
            } else {
                arg0.field1039 = -1;
                arg0.field1065 = false;
            }
        }
        if (~arg0.field1082 != 0 && ~arg0.field1036 >= ~class576.field8505) {
            class465 var3 = class138.field1821.method2251(arg0.field1082, false);
            int var4 = var3.field6708;
            if (~var4 == 0) {
                arg0.field1082 = -1;
            } else {
                label402: {
                    class224 var5 = class470.field7205.method3498(false, var4);
                    if (var3.field6723) {
                        if (~var5.field3299 != -4) {
                            if (var5.field3299 == 1 && arg0.field1097 > 0 && class576.field8505 >= arg0.field1045 && class576.field8505 > arg0.field1004) {
                                arg0.field1036 = class576.field8505 + 1;
                                break label402;
                            }
                        } else if (arg0.field1097 > 0 && ~arg0.field1045 >= ~class576.field8505 && ~class576.field8505 < ~arg0.field1004) {
                            arg0.field1082 = -1;
                            break label402;
                        }
                    }
                    if (var5 != null && var5.field3296 != null) {
                        if (arg0.field1002 < 0) {
                            arg0.field1002 = 0;
                            class295.method1830(0, arg0.field3463, (byte) 90, arg0.field3457, var5, class239.field3493 == arg0, arg0.field3464);
                        }
                        ++arg0.field1023;
                        if (~var5.field3296.length < ~arg0.field1002 && ~var5.field3307[arg0.field1002] > ~arg0.field1023) {
                            arg0.field1023 = 1;
                            ++arg0.field1002;
                            class295.method1830(arg0.field1002, arg0.field3463, (byte) 83, arg0.field3457, var5, class239.field3493 == arg0, arg0.field3464);
                        }
                        if (~arg0.field1002 <= ~var5.field3296.length) {
                            if (!var3.field6723) {
                                arg0.field1082 = -1;
                            } else {
                                ++arg0.field1025;
                                arg0.field1002 -= var5.field3290;
                                if (~var5.field3306 >= ~arg0.field1025) {
                                    arg0.field1082 = -1;
                                } else if (arg0.field1002 >= 0 && var5.field3296.length > arg0.field1002) {
                                    class295.method1830(arg0.field1002, arg0.field3463, (byte) -101, arg0.field3457, var5, class239.field3493 == arg0, arg0.field3464);
                                } else {
                                    arg0.field1082 = -1;
                                }
                            }
                        }
                        arg0.field1058 = arg0.field1002 + 1;
                        if (arg0.field1058 >= var5.field3296.length) {
                            if (!var3.field6723) {
                                arg0.field1058 = -1;
                            } else {
                                arg0.field1058 -= var5.field3290;
                                if (var5.field3306 > arg0.field1025 - -1) {
                                    if (~arg0.field1058 > -1 || var5.field3296.length <= arg0.field1058) {
                                        arg0.field1058 = -1;
                                    }
                                } else {
                                    arg0.field1058 = -1;
                                }
                            }
                        }
                    } else {
                        arg0.field1082 = -1;
                    }
                }
            }
        }
        if (~arg0.field1035 != 0 && ~class576.field8505 <= ~arg0.field1062) {
            class465 var6 = class138.field1821.method2251(arg0.field1035, false);
            int var7 = var6.field6708;
            if (~var7 == 0) {
                arg0.field1035 = -1;
            } else {
                label405: {
                    class224 var8 = class470.field7205.method3498(false, var7);
                    if (var6.field6723) {
                        if (~var8.field3299 != -4) {
                            if (var8.field3299 == 1 && arg0.field1097 > 0 && arg0.field1045 <= class576.field8505 && ~arg0.field1004 > ~class576.field8505) {
                                arg0.field1062 = class576.field8505 - -1;
                                break label405;
                            }
                        } else if (arg0.field1097 > 0 && arg0.field1045 <= class576.field8505 && ~class576.field8505 < ~arg0.field1004) {
                            arg0.field1035 = -1;
                            break label405;
                        }
                    }
                    if (var8 != null && var8.field3296 != null) {
                        if (~arg0.field1005 > -1) {
                            arg0.field1005 = 0;
                            class295.method1830(0, arg0.field3463, (byte) -109, arg0.field3457, var8, class239.field3493 == arg0, arg0.field3464);
                        }
                        ++arg0.field1013;
                        if (var8.field3296.length > arg0.field1005 && arg0.field1013 > var8.field3307[arg0.field1005]) {
                            ++arg0.field1005;
                            arg0.field1013 = 1;
                            class295.method1830(arg0.field1005, arg0.field3463, (byte) -128, arg0.field3457, var8, class239.field3493 == arg0, arg0.field3464);
                        }
                        if (~arg0.field1005 <= ~var8.field3296.length) {
                            if (!var6.field6723) {
                                arg0.field1035 = -1;
                            } else {
                                ++arg0.field1031;
                                arg0.field1005 -= var8.field3290;
                                if (~arg0.field1031 <= ~var8.field3306) {
                                    arg0.field1035 = -1;
                                } else if (~arg0.field1005 <= -1 && ~arg0.field1005 > ~var8.field3296.length) {
                                    class295.method1830(arg0.field1005, arg0.field3463, (byte) -101, arg0.field3457, var8, class239.field3493 == arg0, arg0.field3464);
                                } else {
                                    arg0.field1035 = -1;
                                }
                            }
                        }
                        arg0.field1086 = arg0.field1005 + 1;
                        if (var8.field3296.length <= arg0.field1086) {
                            if (!var6.field6723) {
                                arg0.field1086 = -1;
                            } else {
                                arg0.field1086 -= var8.field3290;
                                if (~var8.field3306 < ~(arg0.field1031 + 1)) {
                                    if (~arg0.field1086 > -1 || var8.field3296.length <= arg0.field1086) {
                                        arg0.field1086 = -1;
                                    }
                                } else {
                                    arg0.field1086 = -1;
                                }
                            }
                        }
                    } else {
                        arg0.field1035 = -1;
                    }
                }
            }
        }
        if (~arg0.field1024 != 0 && ~arg0.field1079 >= -2) {
            class224 var9 = class470.field7205.method3498(false, arg0.field1024);
            if (var9.field3299 != 3) {
                if (~var9.field3299 == -2 && ~arg0.field1097 < -1 && ~arg0.field1045 >= ~class576.field8505 && class576.field8505 > arg0.field1004) {
                    arg0.field1079 = 2;
                }
            } else if (arg0.field1097 > 0 && arg0.field1045 <= class576.field8505 && class576.field8505 > arg0.field1004) {
                arg0.field1024 = -1;
            }
        }
        if (arg1 > 114) {
            if (arg0.field1024 != -1 && ~arg0.field1079 == -1) {
                class224 var10 = class470.field7205.method3498(false, arg0.field1024);
                if (var10 != null && var10.field3296 != null) {
                    ++arg0.field1008;
                    if (var10.field3296.length > arg0.field1057 && ~arg0.field1008 < ~var10.field3307[arg0.field1057]) {
                        arg0.field1008 = 1;
                        ++arg0.field1057;
                        class295.method1830(arg0.field1057, arg0.field3463, (byte) -102, arg0.field3457, var10, class239.field3493 == arg0, arg0.field3464);
                    }
                    if (~arg0.field1057 <= ~var10.field3296.length) {
                        ++arg0.field998;
                        arg0.field1057 -= var10.field3290;
                        if (var10.field3306 > arg0.field998) {
                            if (arg0.field1057 >= 0 && arg0.field1057 < var10.field3296.length) {
                                class295.method1830(arg0.field1057, arg0.field3463, (byte) 83, arg0.field3457, var10, class239.field3493 == arg0, arg0.field3464);
                            } else {
                                arg0.field1024 = -1;
                            }
                        } else {
                            arg0.field1024 = -1;
                        }
                    }
                    arg0.field999 = arg0.field1057 - -1;
                    if (~var10.field3296.length >= ~arg0.field999) {
                        arg0.field999 -= var10.field3290;
                        if (~(arg0.field998 - -1) <= ~var10.field3306) {
                            arg0.field999 = -1;
                        } else if (~arg0.field999 > -1 || arg0.field999 >= var10.field3296.length) {
                            arg0.field999 = -1;
                        }
                    }
                    arg0.field996 = var10.field3303;
                } else {
                    arg0.field1024 = -1;
                }
            }
            if (arg0.field1079 > 0) {
                --arg0.field1079;
            }
            for (int var11 = 0; ~arg0.field1074.length < ~var11; ++var11) {
                class251 var12 = arg0.field1074[var11];
                if (var12 != null) {
                    if (~var12.field3646 < -1) {
                        --var12.field3646;
                    } else {
                        class224 var13 = class470.field7205.method3498(false, var12.field3649);
                        if (var13 != null && var13.field3296 != null) {
                            ++var12.field3651;
                            if (var13.field3296.length > var12.field3654 && var13.field3307[var12.field3654] < var12.field3651) {
                                ++var12.field3654;
                                var12.field3651 = 1;
                                class295.method1830(var12.field3654, arg0.field3463, (byte) -98, arg0.field3457, var13, class239.field3493 == arg0, arg0.field3464);
                            }
                            if (var13.field3296.length <= var12.field3654) {
                                ++var12.field3653;
                                var12.field3654 -= var13.field3290;
                                if (~var12.field3653 <= ~var13.field3306) {
                                    arg0.field1074[var11] = null;
                                } else if (var12.field3654 >= 0 && ~var12.field3654 > ~var13.field3296.length) {
                                    class295.method1830(var12.field3654, arg0.field3463, (byte) -95, arg0.field3457, var13, class239.field3493 == arg0, arg0.field3464);
                                } else {
                                    arg0.field1074[var11] = null;
                                }
                            }
                            var12.field3644 = var12.field3654 + 1;
                            if (~var13.field3296.length >= ~var12.field3644) {
                                var12.field3644 -= var13.field3290;
                                if (~(var12.field3653 + 1) > ~var13.field3306) {
                                    if (~var12.field3644 > -1 || var12.field3644 >= var13.field3296.length) {
                                        var12.field3644 = -1;
                                    }
                                } else {
                                    var12.field3644 = -1;
                                }
                            }
                        } else {
                            arg0.field1074[var11] = null;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2679(String arg0, int arg1) {
        ++field6413;
        if (arg0 == null) {
            return null;
        } else {
            int var2 = 0;
            if (arg1 != -1) {
                return null;
            } else {
                int var3 = arg0.length();
                while (var2 < var3 && class639.method3702(arg0.charAt(var2), (byte) 107)) {
                    ++var2;
                }
                while (var2 < var3 && class639.method3702(arg0.charAt(var3 + -1), (byte) 77)) {
                    --var3;
                }
                int var4 = var3 - var2;
                if (var4 >= 1 && ~var4 >= -13) {
                    StringBuffer var5 = new StringBuffer(var4);
                    for (int var6 = var2; var3 > var6; ++var6) {
                        char var7 = arg0.charAt(var6);
                        if (class367.method2244(var7, (byte) 112)) {
                            char var8 = class433.method2640(var7, (byte) -5);
                            if (var8 != 0) {
                                var5.append(var8);
                            }
                        }
                    }
                    if (var5.length() == 0) {
                        return null;
                    } else {
                        return var5.toString();
                    }
                } else {
                    return null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Luf;)V")
    public class436(class353 arg0) {
        super.field287 = 3;
        super.field288 = 3;
        this.method2658(true, 2);
        super.field263 = false;
        super.field265 = true;
        super.field285 = 0;
        super.field266 = true;
        super.field298 = true;
        super.field283 = 1;
        super.field271 = true;
        super.field286 = 2;
        super.field281 = true;
        super.field284 = true;
        super.field303 = 127;
        super.field267 = 0;
        super.field300 = true;
        super.field299 = true;
        super.field268 = true;
        super.field280 = 127;
        super.field269 = 0;
        super.field302 = 0;
        super.field276 = 127;
        super.field290 = true;
        super.field291 = 0;
        if (~class223.field3276 > -97) {
            class295.method1828((byte) -107, 0);
        } else {
            class295.method1828((byte) -114, 2);
        }
        super.field305 = false;
        super.field297 = false;
        super.field289 = 0;
        super.field270 = class56.field692 == 1 ? 2 : 4;
        super.field264 = 2;
        super.field278 = 0;
        super.field292 = true;
        super.field296 = true;
        super.field301 = false;
        super.field293 = 2;
        class211 var2 = null;
        try {
            class286 var3 = arg0.method2175("", 124, true);
            while (var3.field4208 == 0) {
                class428.method2624(1, 1L);
            }
            if (var3.field4208 == 1) {
                var2 = (class211) var3.field4213;
                byte[] var4 = new byte[(int) var2.method1372((byte) 105)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1370(var4.length - var5, var4, (byte) -13, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2677(new class428(var4), 13002);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1367(0);
            }
        } catch (Exception var7) {
        }
    }
}
