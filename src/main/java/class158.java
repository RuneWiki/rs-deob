import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class158 extends class397 {

    @OriginalMember(owner = "client!kf", name = "N", descriptor = "Z")
    private boolean field2062 = true;

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Z")
    private boolean field2067 = true;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Lwt;")
    public static class194 field2066 = new class194("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!kf", name = "O", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "Lhe;")
    public static class239 field2064;

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "[Lil;")
    public static class7[] field2065;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBI)I")
    public static final int method1010(int arg0, byte arg1, int arg2) {
        ++field2068;
        int var3 = (127 & arg0) * arg2 >> 7;
        if (arg1 >= -93) {
            return -105;
        } else {
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (65408 & arg0) + var3;
        }
    }

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "(I)V")
    public static void method1011(int arg0) {
        field2066 = null;
        field2065 = null;
        field2064 = null;
        if (arg0 != 14558) {
            field2066 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IBLae;)V")
    public final void method27(int arg0, byte arg1, class156 arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field5859 = arg2.method941((byte) 124) == 1;
                }
            } else {
                this.field2062 = arg2.method941((byte) 126) == 1;
            }
        } else {
            this.field2067 = arg2.method941((byte) 125) == 1;
        }
        if (arg1 != 80) {
            this.field2062 = true;
        }
        ++field2060;
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(BI)[[I")
    public final int[][] method486(byte arg0, int arg1) {
        if (arg0 <= 81) {
            method1011(-112);
        }
        ++field2061;
        int[][] var3 = super.field5848.method1692(arg1, 92);
        if (super.field5848.field3939) {
            int[][] var4 = this.method2377(!this.field2062 ? arg1 : -arg1 + class340.field4948, -4, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field2067) {
                for (int var11 = 0; var11 < class164.field2152; ++var11) {
                    var8[var11] = var5[var11];
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                }
            } else {
                for (int var12 = 0; ~class164.field2152 < ~var12; ++var12) {
                    var8[var12] = var5[-var12 + class107.field1429];
                    var9[var12] = var6[-var12 + class107.field1429];
                    var10[var12] = var7[-var12 + class107.field1429];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "()V")
    public class158() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public static final void method1012(int arg0) {
        class431.method2560(arg0 ^ -27406, false);
        ++field2069;
        class120.field1567 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class191.field2708.length; ++var2) {
            if (~class270.field3775[var2] != 0 && class191.field2708[var2] == null) {
                class191.field2708[var2] = class67.field1004.method1470(4, 0, class270.field3775[var2]);
                if (class191.field2708[var2] == null) {
                    ++class120.field1567;
                    var1 = false;
                }
            }
            if (~class195.field2748[var2] != 0 && class369.field5535[var2] == null) {
                class369.field5535[var2] = class67.field1004.method1461(class195.field2748[var2], class55.field855[var2], true, 0);
                if (class369.field5535[var2] == null) {
                    var1 = false;
                    ++class120.field1567;
                }
            }
            if (~class105.field1410[var2] != 0 && class285.field4068[var2] == null) {
                class285.field4068[var2] = class67.field1004.method1470(4, 0, class105.field1410[var2]);
                if (class285.field4068[var2] == null) {
                    ++class120.field1567;
                    var1 = false;
                }
            }
            if (class454.field6602[var2] != -1 && class51.field761[var2] == null) {
                class51.field761[var2] = class67.field1004.method1470(4, 0, class454.field6602[var2]);
                if (class51.field761[var2] == null) {
                    var1 = false;
                    ++class120.field1567;
                }
            }
            if (class288.field4105 != null && class238.field3337[var2] == null && class288.field4105[var2] != -1) {
                class238.field3337[var2] = class67.field1004.method1461(class288.field4105[var2], class55.field855[var2], true, 0);
                if (class238.field3337[var2] == null) {
                    ++class120.field1567;
                    var1 = false;
                }
            }
        }
        if (class191.field2706 == null) {
            if (class134.field1713 != null && class56.field881.method1453(class134.field1713.field3546 + "_staticelements", 122)) {
                if (class56.field881.method1446(false, class134.field1713.field3546 + "_staticelements")) {
                    class191.field2706 = class342.method2071(class134.field1713.field3546 + "_staticelements", class56.field881, (byte) -22, class470.field6790);
                } else {
                    var1 = false;
                    ++class120.field1567;
                }
            } else {
                class191.field2706 = new class281(0);
            }
        }
        if (!var1) {
            class376.field5625 = 1;
        } else {
            class507.field7740 = 0;
            boolean var3 = true;
            for (int var4 = 0; ~class191.field2708.length < ~var4; ++var4) {
                byte[] var19 = class369.field5535[var4];
                if (var19 != null) {
                    int var20 = (class76.field1081[var4] >> 8) * 64 + -class455.field6637;
                    int var21 = (255 & class76.field1081[var4]) * 64 + -class223.field3158;
                    if (~class247.field3542 != -1) {
                        var21 = 10;
                        var20 = 10;
                    }
                    var3 &= class322.method1927(var21, var19, -13184, class203.field2813, var20, class362.field5442);
                }
                byte[] var22 = class51.field761[var4];
                if (var22 != null) {
                    int var23 = (class76.field1081[var4] >> 8) * 64 + -class455.field6637;
                    int var24 = (255 & class76.field1081[var4]) * 64 - class223.field3158;
                    if (~class247.field3542 != -1) {
                        var24 = 10;
                        var23 = 10;
                    }
                    var3 &= class322.method1927(var24, var22, -13184, class203.field2813, var23, class362.field5442);
                }
            }
            if (!var3) {
                class376.field5625 = 2;
            } else {
                if (~class376.field5625 != -1) {
                    class475.method2783(class181.field2587, class489.field7488.method1220(arg0 + 33148, class81.field1122) + "<br>(100%)", true, arg0 ^ -30181);
                }
                class498.method2992(0);
                class110.method656(false);
                boolean var5 = false;
                if (class481.field6937.method744() && class118.field1533.field6911) {
                    for (int var6 = 0; ~var6 > ~class191.field2708.length; ++var6) {
                        if (class51.field761[var6] != null || class285.field4068[var6] != null) {
                            var5 = true;
                            break;
                        }
                    }
                }
                int var7;
                if (class118.field1533.field6907) {
                    var7 = class466.field6744[class247.field3541];
                } else {
                    var7 = class297.field4330[class247.field3541];
                }
                if (class481.field6937.method774()) {
                    ++var7;
                }
                class454.method2650(7, 4, class362.field5442, class203.field2813, var7, var5, class481.field6937.method778() > 0);
                for (int var8 = 0; var8 < 4; ++var8) {
                    class169.field2234[var8].method139(true);
                }
                class412.method2456(arg0 + 30218);
                class424.method2534(false, -1);
                class154.method932(0);
                class252.field3649 = null;
                class498.method2992(arg0 ^ arg0);
                System.gc();
                class431.method2560(7919, true);
                class286.method1732((byte) 86);
                class153.field1967 = class118.field1533.field6886;
                class124.field1612 = !class118.field1533.field6900;
                class63.field930 = class118.field1533.field6911;
                class103.field1391 = class118.field1533.field6901;
                class280.field4012 = class315.field4620 >= 96;
                class450.field6562 = !class118.field1533.method2961(class293.field4174, 29) ? class234.field3290 : -1;
                class148.field1917 = class293.field4174 == 1 || class118.field1533.field6888;
                class453.field6588 = new class388(4, class362.field5442, class203.field2813, false);
                if (class247.field3542 == 0) {
                    class40.method309(64, class191.field2708, class453.field6588);
                } else {
                    class25.method219(class191.field2708, (byte) -91, class453.field6588);
                }
                class121.method690(class362.field5442 >> 4, (byte) -127, class203.field2813 >> 4);
                class128.method714((byte) -34);
                if (var5) {
                    class181.method1149(true);
                    class141.field1844 = new class388(1, class362.field5442, class203.field2813, true);
                    if (~class247.field3542 == -1) {
                        class40.method309(64, class285.field4068, class141.field1844);
                        class431.method2560(7919, true);
                    } else {
                        class25.method219(class285.field4068, (byte) 98, class141.field1844);
                        class431.method2560(7919, true);
                    }
                    class141.field1844.method58(class453.field6588.field99[0], (byte) -116, 0);
                    class141.field1844.method51((int[][][]) null, (class19[]) null, arg0 + 30179, class481.field6937);
                    class181.method1149(false);
                }
                class453.field6588.method51(!var5 ? null : class141.field1844.field99, class169.field2234, 0, class481.field6937);
                if (class247.field3542 != 0) {
                    class431.method2560(arg0 ^ -27406, true);
                    class199.method1238(false, class369.field5535, class453.field6588);
                } else {
                    class431.method2560(arg0 + 38098, true);
                    class296.method1801(class453.field6588, class369.field5535, true);
                    if (class238.field3337 != null) {
                        class356.method2158((byte) 60);
                    }
                }
                class110.method656(false);
                class431.method2560(7919, true);
                class453.field6588.method59(32, class481.field6937, (class441) null, !var5 ? null : class178.field2562[0]);
                class453.field6588.method2336(class481.field6937, -125);
                class431.method2560(7919, true);
                if (var5) {
                    class181.method1149(true);
                    class431.method2560(arg0 + 38098, true);
                    if (class247.field3542 == 0) {
                        class296.method1801(class141.field1844, class51.field761, true);
                    } else {
                        class199.method1238(false, class51.field761, class141.field1844);
                    }
                    class110.method656(false);
                    class431.method2560(7919, true);
                    class141.field1844.method59(arg0 ^ -30081, class481.field6937, class459.field6685[0], (class441) null);
                    class141.field1844.method2336(class481.field6937, arg0 ^ 30199);
                    class431.method2560(7919, true);
                    class181.method1149(false);
                }
                class96.method586(arg0 ^ -30178);
                int var9 = class453.field6588.field5752;
                if (var9 > class355.field5121) {
                    var9 = class355.field5121;
                }
                if (class355.field5121 + -1 > var9) {
                    var9 = class355.field5121 + -1;
                }
                if (class118.field1533.method2961(class293.field4174, arg0 ^ -30208)) {
                    class156.method990(0);
                } else {
                    class156.method990(var9);
                }
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var17 = 0; ~var17 > ~class362.field5442; ++var17) {
                        for (int var18 = 0; ~var18 > ~class203.field2813; ++var18) {
                            class409.method2447(var17, (byte) 68, var18, var10);
                        }
                    }
                }
                class2.method9((byte) -48);
                class498.method2992(arg0 ^ -30179);
                class424.method2530(0);
                class110.method656(false);
                class151.field1950 = false;
                class485.method2831((byte) 113);
                if (class75.field1066 != null && class22.field294 != null && ~class323.field4729 == -26) {
                    class386.method2321(true, class130.field1653);
                    ++class25.field415;
                    class79.field1108.method969(19869, 1057001181);
                }
                if (~class247.field3542 == -1) {
                    int var11 = (-(class362.field5442 >> 4) + class134.field1714) / 8;
                    int var12 = ((class362.field5442 >> 4) + class134.field1714) / 8;
                    int var13 = (-(class203.field2813 >> 4) + class454.field6612) / 8;
                    int var14 = ((class203.field2813 >> 4) + class454.field6612) / 8;
                    for (int var15 = var11 - 1; var15 <= var12 + 1; ++var15) {
                        for (int var16 = var13 + -1; ~(var14 - -1) <= ~var16; ++var16) {
                            if (~var15 > ~var11 || var15 > var12 || var16 < var13 || ~var16 < ~var14) {
                                class67.field1004.method1468(-51, "m" + var15 + "_" + var16);
                                class67.field1004.method1468(-41, "l" + var15 + "_" + var16);
                            }
                        }
                    }
                }
                if (~class323.field4729 != -29) {
                    class319.method1921(15508, 30);
                    if (class22.field294 != null) {
                        class386.method2321(true, class283.field4036);
                    }
                } else {
                    class319.method1921(15508, 10);
                }
                class400.method2388(-15225);
                class498.method2992(0);
                class472.method2757(0);
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field2063;
        int[] var3 = super.field5854.method465(arg1, 102);
        if (super.field5854.field991) {
            int[] var4 = this.method2376(120, 0, this.field2062 ? -arg1 + class340.field4948 : arg1);
            if (!this.field2067) {
                class268.method1641(var4, 0, var3, 0, class164.field2152);
            } else {
                for (int var5 = 0; ~class164.field2152 < ~var5; ++var5) {
                    var3[var5] = var4[class107.field1429 - var5];
                }
            }
        }
        if (arg0 != -780833076) {
            method1011(3);
        }
        return var3;
    }
}
