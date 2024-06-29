import jagex3.jagmisc.jagmisc;
import java.awt.Frame;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class289 extends class107 {

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "Z")
    public boolean field4222 = false;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Z")
    public boolean field4220 = false;

    @OriginalMember(owner = "client!lg", name = "cb", descriptor = "[Lco;")
    public static class78[] field4229;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!lg", name = "db", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!lg", name = "eb", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!lg", name = "fb", descriptor = "I")
    public static int field4232;

    static {
        new class530("Your friends list is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field4229 = new class78[50];
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(ZI)Z", line = 3)
    public final boolean method1782(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            ++field4224;
            return ~arg1 == -1 ? super.field1442 : true;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)Lwm;", line = 19)
    public final class403 method1783(int arg0) {
        ++field4221;
        class403 var2 = new class403(41);
        var2.method2376((byte) 122, 17);
        var2.method2376((byte) 122, super.field1453);
        var2.method2376((byte) 122, super.field1442 ? 1 : 0);
        var2.method2376((byte) 122, !super.field1446 ? 0 : 1);
        var2.method2376((byte) 122, !super.field1444 ? 0 : 1);
        var2.method2376((byte) 122, super.field1427 ? 1 : 0);
        var2.method2376((byte) 122, 0);
        var2.method2376((byte) 122, !super.field1447 ? 0 : 1);
        var2.method2376((byte) 122, !super.field1450 ? 0 : 1);
        var2.method2376((byte) 122, !super.field1434 ? 0 : 1);
        var2.method2376((byte) 122, super.field1419);
        var2.method2376((byte) 122, super.field1441);
        var2.method2376((byte) 122, super.field1449 ? 1 : 0);
        var2.method2376((byte) 122, super.field1440 ? 1 : 0);
        var2.method2376((byte) 122, super.field1428 ? 1 : 0);
        var2.method2376((byte) 122, !super.field1438 ? 0 : 1);
        var2.method2376((byte) 122, super.field1426);
        var2.method2376((byte) 122, super.field1433 ? 1 : 0);
        var2.method2376((byte) 122, super.field1423);
        var2.method2376((byte) 122, super.field1422);
        var2.method2376((byte) 122, super.field1418);
        var2.method2372(super.field1455, -127);
        var2.method2372(super.field1429, -128);
        var2.method2376((byte) 122, class412.method2439(true));
        var2.method2354(super.field1430, false);
        var2.method2376((byte) 122, super.field1415);
        var2.method2376((byte) 122, super.field1411 ? 1 : 0);
        var2.method2376((byte) 122, !super.field1437 ? 0 : 1);
        var2.method2376((byte) 122, super.field1435);
        var2.method2376((byte) 122, !super.field1416 ? 0 : 1);
        if (arg0 > -70) {
            this.method1782(false, 37);
        }
        var2.method2376((byte) 122, !super.field1448 ? 0 : 1);
        var2.method2376((byte) 122, super.field1451);
        var2.method2376((byte) 122, super.field1439 ? 1 : 0);
        var2.method2376((byte) 122, super.field1414);
        var2.method2376((byte) 122, super.field1424);
        var2.method2376((byte) 122, !super.field1412 ? 0 : 1);
        return var2;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BLnt;)V", line = 68)
    public final void method1784(byte arg0, class151 arg1) {
        ++field4230;
        class302 var3 = null;
        try {
            int var4 = 72 / ((81 - arg0) / 43);
            class370 var5 = arg1.method950(true, "", 0);
            while (var5.field5277 == 0) {
                class52.method411(1L, (byte) 105);
            }
            if (~var5.field5277 == -2) {
                var3 = (class302) var5.field5274;
                class403 var6 = this.method1783(-109);
                var3.method1845((byte) -87, 0, var6.field5665, var6.field5663);
            }
        } catch (Exception var8) {
        }
        try {
            if (var3 != null) {
                var3.method1844((byte) -115);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIBIII)V", line = 104)
    public static final void method1785(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        int var11 = arg3 + 1;
        class447.method2605(-7, arg4, arg1, arg5, class112.field1523[arg3]);
        ++field4232;
        int var10 = arg0 - 1;
        class447.method2605(-7, arg4, arg1, arg5, class112.field1523[arg0]);
        int var6 = -9 / ((-64 - arg2) / 58);
        for (int var7 = var11; var7 <= var10; ++var7) {
            int[] var8 = class112.field1523[var7];
            var8[arg4] = var8[arg5] = arg1;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)I", line = 127)
    public final int method1786(int arg0, int arg1) {
        ++field4223;
        if (arg0 > -78) {
            this.field4220 = false;
        }
        if (this.field4220) {
            return 0;
        } else if (!this.method1791(-2, arg1)) {
            return 1;
        } else {
            return !super.field1446 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 146)
    public static void method1787(byte arg0) {
        int var1 = -64 % ((52 - arg0) / 42);
        field4229 = null;
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lnt;)V", line = 543)
    public class289(class151 arg0) {
        super.field1453 = 3;
        this.method1788(true, false);
        super.field1446 = true;
        super.field1429 = 0;
        super.field1444 = true;
        super.field1440 = false;
        super.field1426 = 0;
        super.field1428 = true;
        super.field1438 = true;
        super.field1451 = 1;
        super.field1447 = true;
        super.field1433 = true;
        super.field1422 = 255;
        super.field1441 = 0;
        super.field1423 = 127;
        super.field1434 = true;
        super.field1419 = 2;
        super.field1413 = 0;
        super.field1450 = true;
        super.field1449 = true;
        super.field1455 = 0;
        super.field1427 = true;
        super.field1418 = 127;
        if (~class494.field6991 <= -97) {
            class254.method1640(2, 0);
        } else {
            class254.method1640(0, 0);
        }
        super.field1448 = true;
        super.field1416 = false;
        super.field1435 = 0;
        super.field1430 = 0;
        super.field1439 = true;
        super.field1437 = false;
        super.field1424 = class347.field5020 == 1 ? 2 : 4;
        super.field1415 = 2;
        super.field1414 = 2;
        super.field1411 = false;
        class302 var2 = null;
        try {
            class370 var3 = arg0.method950(true, "", 0);
            while (var3.field5277 == 0) {
                class52.method411(1L, (byte) 111);
            }
            if (var3.field5277 == 1) {
                var2 = (class302) var3.field5274;
                byte[] var4 = new byte[(int) var2.method1843(117)];
                int var6;
                for (int var5 = 0; var4.length > var5; var5 += var6) {
                    var6 = var2.method1842(var5, (byte) 39, var4, var4.length + -var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method1790(new class403(var4), true);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1844((byte) 104);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZZ)V", line = 162)
    public final void method1788(boolean arg0, boolean arg1) {
        ++field4226;
        super.field1442 = arg0;
        if (class377.field5338 != null) {
            class377.field5338.method1899(!this.method1791(-2, class405.field5737), (byte) -8);
        }
        if (arg1) {
            this.method1788(true, true);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILnt;IIII)Ljava/awt/Frame;", line = 178)
    public static final Frame method1789(int arg0, class151 arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -77 / ((arg5 - -30) / 41);
        ++field4231;
        if (!arg1.method961((byte) -110)) {
            return null;
        } else {
            if (arg4 == 0) {
                class392[] var7 = class250.method1627((byte) 80, arg1);
                if (var7 == null) {
                    return null;
                }
                boolean var8 = false;
                for (int var9 = 0; var9 < var7.length; ++var9) {
                    if (var7[var9].field5509 == arg0 && ~var7[var9].field5510 == ~arg2 && (~arg3 == -1 || ~var7[var9].field5513 == ~arg3) && (!var8 || ~arg4 > ~var7[var9].field5508)) {
                        var8 = true;
                        arg4 = var7[var9].field5508;
                    }
                }
                if (!var8) {
                    return null;
                }
            }
            class370 var10 = arg1.method973(arg2, arg4, arg3, arg0, (byte) 103);
            while (var10.field5277 == 0) {
                class52.method411(10L, (byte) 115);
            }
            Frame var11 = (Frame) var10.field5274;
            if (var11 == null) {
                return null;
            } else if (~var10.field5277 == -3) {
                class390.method2259(arg1, var11, (byte) -125);
                return null;
            } else {
                return var11;
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lwm;Z)V", line = 261)
    private final void method1790(class403 arg0, boolean arg1) {
        ++field4227;
        if (arg0.field5663.length - arg0.field5665 >= 1) {
            int var3 = arg0.method2357((byte) 119);
            if (var3 >= 0 && ~var3 >= -18) {
                byte var4;
                if (var3 != 17) {
                    if (~var3 == -17) {
                        var4 = 38;
                    } else if (~var3 != -16) {
                        if (var3 == 14) {
                            var4 = 36;
                        } else if (var3 == 13) {
                            var4 = 35;
                        } else if (~var3 == -13) {
                            var4 = 34;
                        } else if (var3 != 11) {
                            if (~var3 == -11) {
                                var4 = 32;
                            } else if (var3 != 9) {
                                if (~var3 == -9) {
                                    var4 = 30;
                                } else if (~var3 == -8) {
                                    var4 = 29;
                                } else if (~var3 == -7) {
                                    var4 = 28;
                                } else if (var3 != 5) {
                                    if (var3 != 4) {
                                        if (~var3 == -4) {
                                            var4 = 23;
                                        } else if (var3 != 2) {
                                            if (var3 == 1) {
                                                var4 = 23;
                                            } else {
                                                var4 = 19;
                                            }
                                        } else {
                                            var4 = 22;
                                        }
                                    } else {
                                        var4 = 24;
                                    }
                                } else {
                                    var4 = 28;
                                }
                            } else {
                                var4 = 31;
                            }
                        } else {
                            var4 = 33;
                        }
                    } else {
                        var4 = 37;
                    }
                } else {
                    var4 = 40;
                }
                if (~var4 >= ~(arg0.field5663.length + -arg0.field5665)) {
                    super.field1453 = arg0.method2357((byte) 125);
                    if (super.field1453 < 1) {
                        super.field1453 = 1;
                    } else if (super.field1453 > 4) {
                        super.field1453 = 4;
                    }
                    this.method1788(~arg0.method2357((byte) 125) == -2, !arg1);
                    super.field1446 = ~arg0.method2357((byte) 127) == -2;
                    super.field1444 = ~arg0.method2357((byte) 116) == -2;
                    super.field1427 = ~arg0.method2357((byte) 122) == -2;
                    super.field1451 = arg0.method2357((byte) 114) != 1 ? 0 : 1;
                    super.field1447 = arg0.method2357((byte) 117) == 1;
                    super.field1450 = ~arg0.method2357((byte) 108) == -2;
                    super.field1434 = ~arg0.method2357((byte) 115) == -2;
                    super.field1419 = arg0.method2357((byte) 110);
                    if (~super.field1419 < -3) {
                        super.field1419 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field1441 = arg0.method2357((byte) 118);
                    }
                    if (~var3 > -3) {
                        super.field1449 = ~arg0.method2357((byte) 120) == -2;
                        arg0.method2357((byte) 123);
                    } else {
                        super.field1449 = ~arg0.method2357((byte) 117) == -2;
                        if (~var3 <= -18) {
                            super.field1440 = ~arg0.method2357((byte) 116) == -2;
                        }
                    }
                    super.field1428 = ~arg0.method2357((byte) 119) == -2;
                    super.field1438 = ~arg0.method2357((byte) 124) == -2;
                    super.field1426 = arg0.method2357((byte) 111);
                    if (~super.field1426 < -3) {
                        super.field1426 = 2;
                    }
                    super.field1413 = super.field1426;
                    super.field1433 = ~arg0.method2357((byte) 120) == -2;
                    super.field1423 = arg0.method2357((byte) 108);
                    if (super.field1423 > 127) {
                        super.field1423 = 127;
                    }
                    super.field1422 = arg0.method2357((byte) 126);
                    super.field1418 = arg0.method2357((byte) 115);
                    if (super.field1418 > 127) {
                        super.field1418 = 127;
                    }
                    if (var3 >= 1) {
                        super.field1455 = arg0.method2338(0);
                        super.field1429 = arg0.method2338(0);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg0.method2357((byte) 125);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method2357((byte) 113);
                        if (var5 < 0 || var5 > 2) {
                            var5 = 0;
                        }
                        if (~class494.field6991 > -97) {
                            var5 = 0;
                        }
                        class254.method1640(var5, 0);
                    }
                    if (~var3 <= -6) {
                        super.field1430 = arg0.method2319((byte) 81);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field1415 = var6 = arg0.method2357((byte) 109);
                    }
                    if (~super.field1415 != -2 && ~super.field1415 != -3) {
                        super.field1415 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field1411 = ~arg0.method2357((byte) 119) == -2;
                    }
                    if (var3 >= 8) {
                        super.field1437 = arg0.method2357((byte) 111) == 1;
                    }
                    if (~var3 <= -10) {
                        super.field1435 = arg0.method2357((byte) 118);
                    }
                    if (super.field1435 < 0 || ~super.field1435 < ~class434.method2559(class494.field6991, (byte) -116)) {
                        super.field1435 = 0;
                    }
                    if (var3 >= 10) {
                        super.field1416 = ~arg0.method2357((byte) 106) != -1;
                    }
                    if (arg1) {
                        if (~var3 <= -12) {
                            super.field1448 = arg0.method2357((byte) 115) != 0;
                        }
                        if (~var3 <= -13) {
                            super.field1451 = arg0.method2357((byte) 117);
                        }
                        if (super.field1451 < 0 || ~super.field1451 < -3) {
                            super.field1451 = 1;
                        }
                        if (~var3 <= -14) {
                            super.field1439 = ~arg0.method2357((byte) 114) == -2;
                        }
                        if (var3 >= 14) {
                            super.field1414 = arg0.method2357((byte) 115);
                        } else if (var6 == 0) {
                            super.field1414 = 2;
                        } else {
                            super.field1414 = 1;
                        }
                        if (super.field1414 < 0 || super.field1414 > 3) {
                            super.field1414 = 2;
                        }
                        if (~var3 <= -16) {
                            super.field1424 = arg0.method2357((byte) 115);
                            if (~super.field1424 > -1 || ~super.field1424 < -5) {
                                super.field1424 = ~class347.field5020 != -2 ? 4 : 2;
                            }
                        }
                        if (var3 >= 16) {
                            super.field1412 = ~arg0.method2357((byte) 115) == -2;
                            try {
                                if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                    super.field1412 = false;
                                }
                            } catch (Throwable var7) {
                            }
                        }
                        if (var3 < 17 && ~super.field1414 == -1) {
                            super.field1414 = 2;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)Z", line = 529)
    public final boolean method1791(int arg0, int arg1) {
        if (arg0 != -2) {
            this.field4220 = false;
        }
        ++field4228;
        return arg1 == 0 && !this.field4222 ? super.field1442 : true;
    }
}
