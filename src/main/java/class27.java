import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class27 implements class228 {

    @OriginalMember(owner = "client!da", name = "I", descriptor = "I")
    private int field366 = 50;

    @OriginalMember(owner = "client!da", name = "r", descriptor = "Z")
    private boolean field349 = false;

    @OriginalMember(owner = "client!da", name = "D", descriptor = "Lng;")
    private class138 field361;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "Lng;")
    private class138 field373;

    @OriginalMember(owner = "client!da", name = "J", descriptor = "Lmf;")
    private class174 field367;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Lmf;")
    private class174 field336;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "[Z")
    private boolean[] field332;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "[Z")
    private boolean[] field341;

    @OriginalMember(owner = "client!da", name = "t", descriptor = "[B")
    private byte[] field351;

    @OriginalMember(owner = "client!da", name = "C", descriptor = "[Z")
    private boolean[] field360;

    @OriginalMember(owner = "client!da", name = "F", descriptor = "[Z")
    private boolean[] field363;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[S")
    private short[] field340;

    @OriginalMember(owner = "client!da", name = "y", descriptor = "[B")
    private byte[] field356;

    @OriginalMember(owner = "client!da", name = "o", descriptor = "[B")
    private byte[] field346;

    @OriginalMember(owner = "client!da", name = "p", descriptor = "[B")
    private byte[] field347;

    @OriginalMember(owner = "client!da", name = "B", descriptor = "[Z")
    private boolean[] field359;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Lke;")
    public static class256 field339 = class316.method2202("(U0a )2 via: ", 27626);

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!da", name = "q", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!da", name = "s", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!da", name = "u", descriptor = "I")
    public static int field352;

    @OriginalMember(owner = "client!da", name = "v", descriptor = "I")
    public static int field353;

    @OriginalMember(owner = "client!da", name = "w", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!da", name = "x", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!da", name = "z", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!da", name = "A", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!da", name = "E", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!da", name = "G", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!da", name = "H", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!da", name = "K", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!da", name = "L", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!da", name = "M", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!da", name = "N", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V", line = 5)
    public final void method180(byte arg0) {
        if (arg0 != -49) {
            return;
        }
        this.field367.method1261(arg0 ^ 0x30);
        field337++;
        if (this.field336 != null) {
            this.field336.method1261(-1);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IB)[I", line = 23)
    public final int[] method181(int arg0, byte arg1) {
        field335++;
        int var3 = -128 % ((-arg1 - 62) / 63);
        class308 var4 = this.method188(arg0, 0);
        return var4 == null ? null : var4.method2142(this.field373, -3486, this, this.field349 || this.field360[arg0]);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)I", line = 42)
    public static final int method182(int arg0) {
        field354++;
        if (class301.field5189 == null) {
            return -1;
        }
        while (class301.field5189.field4113 > class50.field906) {
            if (class301.field5189.method1620(class50.field906, (byte) -101)) {
                return class50.field906++;
            }
            class50.field906++;
        }
        if (arg0 != 31860) {
            method201((class138) null, (byte) -75);
        }
        return -1;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)I", line = 72)
    public final int method183(int arg0, int arg1) {
        if (arg0 != 15874) {
            this.method197((byte) -13, -106);
        }
        field364++;
        return this.field356[arg1] & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "e", descriptor = "(II)Z", line = 84)
    public final boolean method184(int arg0, int arg1) {
        field362++;
        return arg0 < 33 ? true : this.field363[arg1];
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V", line = 98)
    public static void method185(int arg0) {
        field339 = null;
        if (arg0 != 150) {
            field339 = (class256) null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 109)
    public static final void method186(byte arg0, Component arg1) {
        field353++;
        if (arg0 >= -39) {
            method191((class232[]) null, (class138) null, (class232[]) null, (class227[]) null, (class232[]) null, (class232[]) null, -50);
        }
        Method var2 = class4.field73;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class233.field3981);
        arg1.addFocusListener(class233.field3981);
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(II)Lni;", line = 135)
    private final class215 method187(int arg0, int arg1) {
        field358++;
        class215 var3 = (class215) this.field336.method1260(-111, (long) arg1);
        if (var3 == null) {
            class215 var4 = new class215(this.field340[arg1] & 0xFFFF);
            this.field336.method1259(var4, (long) arg1, arg0 ^ arg0);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!da", name = "i", descriptor = "(II)Lge;", line = 151)
    private final class308 method188(int arg0, int arg1) {
        class308 var3 = (class308) this.field367.method1260(-86, (long) arg0);
        field344++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field361.method1016(arg0, 100, 0);
        if (var4 == null) {
            return null;
        } else {
            class41 var5 = new class41(var4);
            class308 var6 = new class308(var5);
            this.field367.method1259(var6, (long) arg0, arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!da", name = "d", descriptor = "(II)I", line = 174)
    public final int method189(int arg0, int arg1) {
        if (arg1 == 255) {
            field355++;
            return this.field346[arg0] & 0xFF;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(II)I", line = 189)
    public final int method190(int arg0, int arg1) {
        field371++;
        return arg1 == 65535 ? this.field340[arg0] & 0xFFFF : -86;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "([Lel;Lng;[Lel;[Lj;[Lel;[Lel;I)V", line = 200)
    public static final void method191(class232[] arg0, class138 arg1, class232[] arg2, class227[] arg3, class232[] arg4, class232[] arg5, int arg6) {
        class118.field2077 = arg5;
        class86.field1551 = arg0;
        field374++;
        class236.field4027 = arg4;
        class191.field3495 = arg3;
        class164.field2907 = arg2;
        class185.field3253 = arg1;
        class196.field3592 = new boolean[class191.field3495.length];
        if (arg6 != -1) {
            field339 = (class256) null;
        }
        class234.field4003.method1275((byte) -99);
        int var7 = class185.field3253.method1006((byte) 84, class46.field847);
        int[] var8 = class185.field3253.method1001(-2658, var7);
        for (int var9 = 0; var9 < var8.length; var9++) {
            class234.field4003.method1269(false, class238.method1600(new class41(class185.field3253.method1016(var7, 100, var8[var9])), -72));
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V", line = 235)
    public static final void method192(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class98.field1753 = 0;
        field365++;
        for (int var7 = -1; var7 < (class67.field1206 + class311.field5357); var7++) {
            class67 var8;
            if (var7 == -1) {
                var8 = class121.field2124;
            } else if (class67.field1206 <= var7) {
                var8 = class187.field3281[class141.field2480[var7 - class67.field1206]];
            } else {
                var8 = class300.field5172[class140.field2463[var7]];
            }
            if (var8 != null && var8.method519(119)) {
                if (var8 instanceof class279) {
                    class74 var9 = ((class279) var8).field4860;
                    if (var9.field1381 != null) {
                        var9 = var9.method553(4175);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (class67.field1206 <= var7) {
                    class74 var10 = ((class279) var8).field4860;
                    if (var10.field1381 != null) {
                        var10 = var10.method553(4175);
                    }
                    if (var10.field1393 >= 0 && var10.field1393 < class192.field3511.length) {
                        int var11;
                        if (var10.field1423 == -1) {
                            var11 = var8.method514(96) + 15;
                        } else {
                            var11 = var10.field1423 + 15;
                        }
                        class175.method1279(arg5 >> 1, var8, var11, arg4 >> 1, arg0, arg1, true);
                        if (class161.field2860 > -1) {
                            class192.field3511[var10.field1393].method637(class161.field2860 + arg2 - 12, arg6 - -class203.field3677 + -30);
                        }
                    }
                    class96[] var12 = class38.field690;
                    for (int var13 = 0; var13 < var12.length; var13++) {
                        class96 var14 = var12[var13];
                        if (var14 != null && var14.field1733 == 1 && class141.field2480[var7 - class67.field1206] == var14.field1720 && (class45.field840 % 20) < 10) {
                            int var15;
                            if (var10.field1423 == -1) {
                                var15 = var8.method514(33) + 15;
                            } else {
                                var15 = var10.field1423 + 15;
                            }
                            class175.method1279(arg5 >> 1, var8, var15, arg4 >> 1, arg0, arg1, true);
                            if (class161.field2860 > -1) {
                                class39.field713[var14.field1725].method637(class161.field2860 + arg2 - 12, arg6 - 28 + class203.field3677);
                            }
                        }
                    }
                } else {
                    int var16 = 30;
                    class144 var17 = (class144) var8;
                    if (var17.field2528 != -1 || var17.field2551 != -1) {
                        class175.method1279(arg5 >> 1, var8, var8.method514(117) + 15, arg4 >> 1, arg0, arg1, true);
                        if (class161.field2860 > -1) {
                            if (var17.field2528 != -1) {
                                class118.field2097[var17.field2528].method637(arg2 + class161.field2860 - 12, -var16 + arg6 + class203.field3677);
                                var16 += 25;
                            }
                            if (var17.field2551 != -1) {
                                class192.field3511[var17.field2551].method637(arg2 - (12 - class161.field2860), -var16 + class203.field3677 + arg6);
                                var16 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class96[] var18 = class38.field690;
                        for (int var19 = 0; var19 < var18.length; var19++) {
                            class96 var20 = var18[var19];
                            if (var20 != null && var20.field1733 == 10 && class140.field2463[var7] == var20.field1720) {
                                class175.method1279(arg5 >> 1, var8, var8.method514(108) + 15, arg4 >> 1, arg0, arg1, true);
                                if (class161.field2860 > -1) {
                                    class39.field713[var20.field1725].method637(class161.field2860 + arg2 - 12, -var16 + arg6 - -class203.field3677);
                                }
                            }
                        }
                    }
                }
                if (var8.field1193 != null && (class67.field1206 <= var7 || class267.field4556 == 0 || class267.field4556 == 3 || class267.field4556 == 1 && class121.method811(((class144) var8).field2532, 94))) {
                    class175.method1279(arg5 >> 1, var8, var8.method514(60), arg4 >> 1, arg0, arg1, true);
                    if (class161.field2860 > -1 && class98.field1753 < class107.field1897) {
                        class107.field1911[class98.field1753] = class17.field215.method2045(var8.field1193) / 2;
                        class107.field1913[class98.field1753] = class17.field215.field5094;
                        class107.field1904[class98.field1753] = class161.field2860;
                        class107.field1912[class98.field1753] = class203.field3677;
                        class107.field1899[class98.field1753] = var8.field1183;
                        class107.field1902[class98.field1753] = var8.field1209;
                        class107.field1917[class98.field1753] = var8.field1242;
                        class107.field1901[class98.field1753] = var8.field1193;
                        class98.field1753++;
                    }
                }
                if (var8.field1225 > class45.field840) {
                    class135 var21 = class94.field1686[1];
                    class135 var22 = class94.field1686[0];
                    int var26;
                    if (var8 instanceof class279) {
                        class279 var23 = (class279) var8;
                        class135[] var24 = (class135[]) ((class135[]) class76.field1446.method2077(-13408, (long) var23.field4860.field1378));
                        if (var24 == null) {
                            var24 = class152.method1141(-31199, var23.field4860.field1378, class153.field2743, 0);
                            if (var24 != null) {
                                class76.field1446.method2074(var24, (long) var23.field4860.field1378, -1);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[0];
                            var21 = var24[1];
                        }
                        class74 var25 = var23.field4860;
                        if (var25.field1423 == -1) {
                            var26 = var8.method514(86);
                        } else {
                            var26 = var25.field1423;
                        }
                    } else {
                        var26 = var8.method514(46);
                    }
                    class175.method1279(arg5 >> 1, var8, var22.field2348 + var26 + 10, arg4 >> 1, arg0, arg1, true);
                    if (class161.field2860 > -1) {
                        int var27 = class203.field3677 + arg6 - 3;
                        int var28 = class161.field2860 + arg2 - (var22.field2343 >> 1);
                        var22.method637(var28, var27);
                        int var29 = var8.field1203 * var22.field2343 / 255;
                        int var30 = var22.field2348;
                        if (class253.field4323) {
                            class60.method468(var28, var27, var28 + var29, var27 + var30);
                        } else {
                            class178.method1289(var28, var27, var28 + var29, var27 + var30);
                        }
                        var21.method637(var28, var27);
                        if (class253.field4323) {
                            class60.method470(arg2, arg6, arg2 + arg4, arg5 + arg6);
                        } else {
                            class178.method1302(arg2, arg6, arg2 + arg4, arg5 + arg6);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (class45.field840 < var8.field1235[var31]) {
                        int var34;
                        if (var8 instanceof class279) {
                            class279 var32 = (class279) var8;
                            class74 var33 = var32.field4860;
                            if (var33.field1423 == -1) {
                                var34 = var8.method514(86) / 2;
                            } else {
                                var34 = var33.field1423 / 2;
                            }
                        } else {
                            var34 = var8.method514(123) / 2;
                        }
                        class175.method1279(arg5 >> 1, var8, var34, arg4 >> 1, arg0, arg1, true);
                        if (class161.field2860 > -1) {
                            if (var31 == 1) {
                                class203.field3677 -= 20;
                            }
                            if (var31 == 2) {
                                class203.field3677 -= 10;
                                class161.field2860 -= 15;
                            }
                            if (var31 == 3) {
                                class203.field3677 -= 10;
                                class161.field2860 += 15;
                            }
                            class15.field207[var8.field1246[var31]].method637(class161.field2860 + arg2 - 12, arg6 + -12 - -class203.field3677);
                            class159.field2838.method2056(class305.method2125((byte) 98, var8.field1188[var31]), class161.field2860 + arg2 - 1, class203.field3677 + arg6 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg3 <= 22) {
            method191((class232[]) null, (class138) null, (class232[]) null, (class227[]) null, (class232[]) null, (class232[]) null, 13);
        }
        for (int var35 = 0; var35 < class98.field1753; var35++) {
            int var36 = class107.field1904[var35];
            int var37 = class107.field1911[var35];
            boolean var38 = true;
            int var39 = class107.field1913[var35];
            int var40 = class107.field1912[var35];
            while (var38) {
                var38 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class107.field1912[var41] - class107.field1913[var41] < var40 + 2 && (class107.field1912[var41] + 2) > (var40 - var39) && var36 - var37 < class107.field1911[var41] + class107.field1904[var41] && class107.field1904[var41] - class107.field1911[var41] < var36 + var37 && var40 > class107.field1912[var41] - class107.field1913[var41]) {
                        var38 = true;
                        var40 = class107.field1912[var41] - class107.field1913[var41];
                    }
                }
            }
            class161.field2860 = class107.field1904[var35];
            class203.field3677 = class107.field1912[var35] = var40;
            class256 var42 = class107.field1901[var35];
            if (class282.field4903 == 0) {
                int var43 = 16776960;
                if (class107.field1899[var35] < 6) {
                    var43 = class7.field103[class107.field1899[var35]];
                }
                if (class107.field1899[var35] == 6) {
                    var43 = class78.field1469 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class107.field1899[var35] == 7) {
                    var43 = class78.field1469 % 20 >= 10 ? 65535 : 255;
                }
                if (class107.field1899[var35] == 8) {
                    var43 = (class78.field1469 % 20) < 10 ? 45056 : 8454016;
                }
                if (class107.field1899[var35] == 9) {
                    int var44 = 150 - class107.field1917[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - ((var44 - 50) * 327680);
                    } else if (var44 < 150) {
                        var43 = var44 * 5 + 65280 - 500;
                    }
                }
                if (class107.field1899[var35] == 10) {
                    int var45 = 150 - class107.field1917[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = ((var45 + -100) * 327680) + 255 - ((var45 - 100) * 5);
                    }
                }
                if (class107.field1899[var35] == 11) {
                    int var46 = 150 - class107.field1917[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = var46 * 327685 - 16318970;
                    } else if (var46 < 150) {
                        var43 = 16777215 - ((var46 - 100) * 327680);
                    }
                }
                if (class107.field1902[var35] == 0) {
                    class17.field215.method2056(var42, arg2 + class161.field2860, class203.field3677 + arg6, var43, 0);
                }
                if (class107.field1902[var35] == 1) {
                    class17.field215.method2055(var42, arg2 + class161.field2860, class203.field3677 + arg6, var43, 0, class78.field1469);
                }
                if (class107.field1902[var35] == 2) {
                    class17.field215.method2057(var42, class161.field2860 + arg2, arg6 - -class203.field3677, var43, 0, class78.field1469);
                }
                if (class107.field1902[var35] == 3) {
                    class17.field215.method2043(var42, class161.field2860 + arg2, class203.field3677 + arg6, var43, 0, class78.field1469, 150 - class107.field1917[var35]);
                }
                if (class107.field1902[var35] == 4) {
                    int var47 = (150 - class107.field1917[var35]) * (class17.field215.method2045(var42) + 100) / 150;
                    if (class253.field4323) {
                        class60.method468(class161.field2860 + arg2 - 50, arg6, class161.field2860 + arg2 + 50, arg6 - -arg5);
                    } else {
                        class178.method1289(class161.field2860 + arg2 - 50, arg6, class161.field2860 + arg2 + 50, arg6 - -arg5);
                    }
                    class17.field215.method2042(var42, class161.field2860 + arg2 + 50 - var47, class203.field3677 + arg6, var43, 0);
                    if (class253.field4323) {
                        class60.method470(arg2, arg6, arg2 + arg4, arg5 + arg6);
                    } else {
                        class178.method1302(arg2, arg6, arg2 + arg4, arg6 - -arg5);
                    }
                }
                if (class107.field1902[var35] == 5) {
                    int var48 = 150 - class107.field1917[var35];
                    if (class253.field4323) {
                        class60.method468(arg2, class203.field3677 + arg6 - class17.field215.field5094 - 1, arg2 + arg4, arg6 + class203.field3677 + 5);
                    } else {
                        class178.method1289(arg2, arg6 - class17.field215.field5094 - (-class203.field3677 + 1), arg2 + arg4, class203.field3677 + arg6 + 5);
                    }
                    int var49 = 0;
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class17.field215.method2056(var42, arg2 + class161.field2860, arg6 + var49 + class203.field3677, var43, 0);
                    if (class253.field4323) {
                        class60.method470(arg2, arg6, arg2 + arg4, arg5 + arg6);
                    } else {
                        class178.method1302(arg2, arg6, arg2 + arg4, arg6 - -arg5);
                    }
                }
            } else {
                class17.field215.method2056(var42, class161.field2860 + arg2, class203.field3677 + arg6, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIF)[I", line = 713)
    public final int[] method193(int arg0, int arg1, float arg2) {
        if (arg1 != 6690) {
            this.field336 = (class174) null;
        }
        field369++;
        class308 var4 = this.method188(arg0, 0);
        if (var4 == null) {
            return null;
        } else {
            var4.field5298 = true;
            return var4.method2145(this.field349 || this.field360[arg0], 0, arg2, this.field373, this);
        }
    }

    @OriginalMember(owner = "client!da", name = "j", descriptor = "(II)V", line = 733)
    public final void method194(int arg0, int arg1) {
        for (class308 var3 = (class308) this.field367.method1262(-13503); var3 != null; var3 = (class308) this.field367.method1263(arg1 ^ 0x50)) {
            if (var3.field5298) {
                var3.method2144((byte) -103, arg0);
                var3.field5298 = false;
            }
        }
        if (arg1 != -100) {
            this.method190(-56, -96);
        }
        field368++;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)V", line = 760)
    public final void method195(int arg0, int arg1) {
        class277.method1910(this.field346[arg0] & 0xFF, this.field347[arg0] & 0xFF, -19856);
        boolean var3 = false;
        field334++;
        if (arg1 < 10) {
            this.method181(-121, (byte) 42);
        }
        class308 var4 = this.method188(arg0, 0);
        if (var4 != null) {
            var3 = var4.method2138(0, this.field373, this.field349 || this.field360[arg0], this);
        }
        if (!var3) {
            class215 var5 = this.method187(1139338433, arg0);
            var5.method1508(5744);
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(II)Z", line = 797)
    public final boolean method196(int arg0, int arg1) {
        field372++;
        if (arg0 > -78) {
            this.field363 = (boolean[]) null;
        }
        return this.field341[arg1];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BI)Z", line = 812)
    public final boolean method197(byte arg0, int arg1) {
        field375++;
        if (arg0 <= 117) {
            this.method200((byte) 113, -6);
        }
        class308 var3 = this.method188(arg1, 0);
        return var3 == null ? false : var3.method2140(128, this.field373, this);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(ZI)V", line = 828)
    public final void method198(boolean arg0, int arg1) {
        this.field349 = arg0;
        field343++;
        this.method180((byte) -49);
        if (arg1 < 62) {
            this.field349 = false;
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(IB)I", line = 843)
    public final int method199(int arg0, byte arg1) {
        field342++;
        if (arg1 <= 67) {
            this.field373 = (class138) null;
        }
        return this.field347[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(BI)Z", line = 859)
    public final boolean method200(byte arg0, int arg1) {
        int var3 = 40 / ((arg0 - 83) / 40);
        field350++;
        return this.field349 || this.field360[arg1];
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lng;B)V", line = 873)
    public static final void method201(class138 arg0, byte arg1) {
        if (arg1 != -34) {
            method192(-115, -108, -3, 18, -78, 58, 46);
        }
        class79.field1479 = arg0;
        field345++;
    }

    @OriginalMember(owner = "client!da", name = "f", descriptor = "(II)I", line = 884)
    public final int method202(int arg0, int arg1) {
        field333++;
        if (arg1 != 27993) {
            method192(58, 81, 127, -60, 25, -124, 18);
        }
        return this.field351[arg0] & 0xFF;
    }

    @OriginalMember(owner = "client!da", name = "k", descriptor = "(II)V", line = 899)
    public final void method203(int arg0, int arg1) {
        this.field366 = arg0;
        if (arg1 != 10) {
            this.method200((byte) 102, 3);
        }
        field348++;
        this.field367 = new class174(this.field366);
        if (class253.field4323) {
            this.field336 = new class174(this.field366);
        } else {
            this.field336 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V", line = 917)
    public static final void method204(int arg0) {
        if (arg0 <= -120) {
            class270.field4611.method2084(-30);
            field357++;
            class19.field261.method2084(122);
        }
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(Lng;Lng;Lng;IZ)V", line = 949)
    public class27(class138 arg0, class138 arg1, class138 arg2, int arg3, boolean arg4) {
        this.field361 = arg0;
        this.field373 = arg2;
        this.field366 = arg3;
        this.field349 = arg4;
        this.field367 = new class174(this.field366);
        if (class253.field4323) {
            this.field336 = new class174(this.field366);
        } else {
            this.field336 = null;
        }
        class41 var6 = new class41(arg1.method1016(0, 100, 0));
        int var7 = var6.method346(-16);
        this.field332 = new boolean[var7];
        this.field341 = new boolean[var7];
        this.field351 = new byte[var7];
        this.field360 = new boolean[var7];
        this.field363 = new boolean[var7];
        this.field340 = new short[var7];
        this.field356 = new byte[var7];
        this.field346 = new byte[var7];
        this.field347 = new byte[var7];
        this.field359 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field332[var8] = var6.method357(false) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field332[var9]) {
                this.field359[var9] = var6.method357(false) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field332[var10]) {
                this.field341[var10] = var6.method357(false) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field332[var11]) {
                this.field360[var11] = var6.method357(false) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field332[var12]) {
                this.field363[var12] = var6.method357(false) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field332[var13]) {
                this.field356[var13] = var6.method323(9092);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field332[var14]) {
                this.field351[var14] = var6.method323(9092);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field332[var15]) {
                this.field347[var15] = var6.method323(9092);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field332[var16]) {
                this.field346[var16] = var6.method323(9092);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field332[var17]) {
                this.field340[var17] = (short) var6.method346(-16);
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)Z", line = 934)
    public final boolean method205(int arg0, boolean arg1) {
        field338++;
        if (arg1) {
            this.field366 = 125;
        }
        return this.field359[arg0];
    }
}
