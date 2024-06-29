import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class523 extends class691 implements class422 {

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Ldw;")
    private class748 field7419;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lhj;")
    public static class596 field7417 = new class596(120, 4);

    @OriginalMember(owner = "client!va", name = "x", descriptor = "I")
    public static int field7410;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "I")
    public static int field7412;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!va", name = "D", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Z")
    public static boolean field7420;

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "(Lnv;Ldw;Z)V", line = 6)
    public class523(class439 arg0, class748 arg1, boolean arg2) {
        super(arg0, 34963, arg2);
        this.field7419 = arg1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)I", line = 14)
    public final int method276(byte arg0) {
        int var2 = -74 % ((87 - arg0) / 35);
        ++field7411;
        return super.method276((byte) 34);
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)V", line = 26)
    public static void method3137(int arg0) {
        if (arg0 > 101) {
            field7417 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Z", line = 40)
    public final boolean method2526(int arg0) {
        if (arg0 != 1234) {
            return false;
        } else {
            ++field7418;
            return super.method3863((byte) -77, super.field9410.field5877);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(BZ)Ljaclib/memory/Buffer;", line = 52)
    public final Buffer method2527(byte arg0, boolean arg1) {
        if (arg0 >= -55) {
            method3139(-64, (class620) null, 96, 75, true);
        }
        ++field7410;
        return super.method3857(super.field9410.field5877, arg1, 63);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Luea;I)[I", line = 72)
    public static final int[] method3138(class336 arg0, int arg1) {
        ++field7414;
        class403 var2 = new class403(518);
        int[] var3 = new int[4];
        for (int var4 = 0; ~var4 > -5; ++var4) {
            var3[var4] = (int) (9.9999999E7D * Math.random());
        }
        var2.method2353(80, 10);
        var2.method2391(-120, var3[0]);
        var2.method2391(arg1 + -25072, var3[1]);
        var2.method2391(-103, var3[2]);
        var2.method2391(-105, var3[3]);
        for (int var5 = 0; ~var5 > -11; ++var5) {
            var2.method2391(arg1 + -25086, (int) (9.9999999E7D * Math.random()));
        }
        var2.method2369(-18090, (int) (Math.random() * 9.9999999E7D));
        var2.method2409(class419.field5455, (byte) -95, class116.field1479);
        if (arg1 != 24960) {
            method3139(-28, (class620) null, -108, 107, true);
        }
        arg0.field4150.method2355(var2.field5275, var2.field5262, (byte) 74, 0);
        return var3;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)Ldw;", line = 110)
    public final class748 method2528(boolean arg0) {
        if (!arg0) {
            method3140(87, -54, 33, -97, (byte[][][]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, (int[]) null, -116, (byte) -71, -77, 64, true, false, 112, 47, false);
        }
        ++field7415;
        return this.field7419;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(II)V", line = 122)
    public final void method2529(int arg0, int arg1) {
        if (arg0 > 79) {
            ++field7413;
            super.method2529(81, this.field7419.field10374 * arg1);
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ILkq;IIZ)V", line = 135)
    public static final void method3139(int arg0, class620 arg1, int arg2, int arg3, boolean arg4) {
        ++field7412;
        int var5 = -80 % ((arg2 - -83) / 38);
        int var6 = arg1.field8506;
        int var7 = arg1.field8416;
        if (~arg1.field8423 != -1) {
            if (arg1.field8423 == 1) {
                arg1.field8506 = -arg1.field8364 + arg0;
            } else if (~arg1.field8423 == -3) {
                arg1.field8506 = arg1.field8364 * arg0 >> 14;
            }
        } else {
            arg1.field8506 = arg1.field8364;
        }
        if (~arg1.field8465 != -1) {
            if (arg1.field8465 == 1) {
                arg1.field8416 = -arg1.field8360 + arg3;
            } else if (~arg1.field8465 == -3) {
                arg1.field8416 = arg1.field8360 * arg3 >> 14;
            }
        } else {
            arg1.field8416 = arg1.field8360;
        }
        if (~arg1.field8423 == -5) {
            arg1.field8506 = arg1.field8484 * arg1.field8416 / arg1.field8345;
        }
        if (arg1.field8465 == 4) {
            arg1.field8416 = arg1.field8506 * arg1.field8345 / arg1.field8484;
        }
        if (class687.field9373 && (~client.method1882(arg1).field5126 != -1 || ~arg1.field8371 == -1)) {
            if (arg1.field8416 < 5 && arg1.field8506 < 5) {
                arg1.field8506 = 5;
                arg1.field8416 = 5;
            } else {
                if (~arg1.field8416 >= -1) {
                    arg1.field8416 = 5;
                }
                if (arg1.field8506 <= 0) {
                    arg1.field8506 = 5;
                }
            }
        }
        if (class776.field10717 == arg1.field8351) {
            class81.field1103 = arg1;
        }
        if (arg4 && arg1.field8336 != null) {
            if (arg1.field8506 != var6 || arg1.field8416 != var7) {
                class529 var8 = new class529();
                var8.field7477 = arg1.field8336;
                var8.field7473 = arg1;
                class756.field10475.method2732(var8, 21939);
            }
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 212)
    public static final void method3140(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class722.field10132 = true;
        class341.field4281 = class6.field80.method583() > 0;
        class690.field9396 = arg15;
        class463.field6493 = arg1 >> class714.field10017;
        class619.field8331 = arg3 >> class714.field10017;
        class637.field8739 = arg1;
        class743.field10349 = arg3;
        class325.field4024 = arg2;
        class741.field10312 = class463.field6493 - class573.field7852;
        if (class741.field10312 < 0) {
            class215.field2535 = -class741.field10312;
            class741.field10312 = 0;
        } else {
            class215.field2535 = 0;
        }
        class784.field10831 = class619.field8331 - class573.field7852;
        if (class784.field10831 < 0) {
            class46.field616 = -class784.field10831;
            class784.field10831 = 0;
        } else {
            class46.field616 = 0;
        }
        class165.field2022 = class573.field7852 + class463.field6493;
        if (class165.field2022 > class307.field3799) {
            class165.field2022 = class307.field3799;
        }
        class737.field10286 = class619.field8331 + class573.field7852;
        if (class737.field10286 > class250.field2938) {
            class737.field10286 = class250.field2938;
        }
        boolean[][] var19 = class308.field3820;
        boolean[][] var20 = class152.field1896;
        if (class690.field9396) {
            for (int var21 = 0; var21 < class573.field7852 + class573.field7852 + 2; ++var21) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class573.field7852 + class573.field7852 + 2; ++var24) {
                    if (var24 > 1) {
                        class467.field6533[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class463.field6493 - class573.field7852 + var21;
                    int var26 = class619.field8331 - class573.field7852 + var24;
                    if (var25 >= 0 && var26 >= 0 && var25 < class307.field3799 && var26 < class250.field2938) {
                        int var27 = var25 << class714.field10017;
                        int var28 = var26 << class714.field10017;
                        int var29 = class707.field9933[class707.field9933.length - 1].method1728(var26, (byte) -93, var25) - (1000 << class714.field10017 - 7);
                        int var30 = class704.field9910 != null ? class704.field9910[0].method1728(var26, (byte) -35, var25) + class327.field4047 : class707.field9933[0].method1728(var26, (byte) -105, var25) + class327.field4047;
                        var23 = arg16 >= 0 ? class6.field80.method572(var27, var29, var28, var27, var30, var28, arg16) : class6.field80.method649(var27, var29, var28, var27, var30, var28);
                        class152.field1896[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class152.field1896[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class467.field6533[var24 - 1] & class467.field6533[var24] & var22 & var23;
                        class308.field3820[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class467.field6533[class573.field7852 + class573.field7852] = var22;
                class467.field6533[class573.field7852 + class573.field7852 + 1] = var23;
            }
            if (arg16 >= 0) {
                class722.field10132 = false;
            } else {
                class709.field9948 = arg5;
                class153.field1906 = arg6;
                class324.field4019 = arg7;
                class597.field8102 = arg8;
                class588.field8002 = arg9;
                class77.method709((byte) 122, arg10, class6.field80);
            }
        } else {
            if (class386.field4973 == null) {
                class386.field4973 = new boolean[class307.field3799 + class307.field3799 + 1][class307.field3799 + class250.field2938 + 1];
            }
            for (int var32 = 0; var32 < class386.field4973.length; ++var32) {
                for (int var42 = 0; var42 < class386.field4973[0].length; ++var42) {
                    class386.field4973[var32][var42] = true;
                }
            }
            class152.field1896 = class386.field4973;
            class308.field3820 = class386.field4973;
            class741.field10312 = 0;
            class784.field10831 = 0;
            class165.field2022 = class307.field3799;
            class737.field10286 = class250.field2938;
            class722.field10132 = false;
        }
        class733.method4136(class6.field80, 70);
        if (!class613.field8242.field6956) {
            class408 var33 = class613.field8242.field6949;
            for (class35 var34 = (class35) var33.method2447(-113); var34 != null; var34 = (class35) var33.method2439(-104)) {
                var34.method892(50560);
                class548.method3224(var34, false);
            }
        }
        if (class341.field4281) {
            for (int var35 = 0; var35 < class784.field10818; ++var35) {
                class331.field4094[var35].method886(arg14, -123, arg0);
            }
        }
        if (class309.field3847) {
            class212.field2508 = class6.field80.method569();
            class6.field80.method566(class3.field44);
            int var36 = (class3.field44[2] - class3.field44[0]) / class46.field612;
            for (int var37 = 0; var37 < class46.field612 - 1; ++var37) {
                class688.field9379[var37] = (var37 + 1) * var36 + class548.field7643[var37];
            }
            for (int var38 = 0; var38 < class747.field10373.length; ++var38) {
                class747.field10373[var38].method2123();
            }
        }
        if (class50.field707 != null) {
            if (class309.field3847) {
                class639.method3589(0);
            }
            class146.method1064(true);
            class6.field80.method560(-1, 1583160, 40, 127);
            class689.method3847(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class309.field3847) {
                class34.method313();
            }
            class6.field80.method564();
            class146.method1064(false);
        }
        class689.method3847(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class309.field3847) {
            for (int var39 = 0; var39 < class368.field4569; ++var39) {
                class207.field2459[var39] = class617.field8308[var39];
            }
            class639.method3589(0);
            for (int var40 = 0; var40 < class747.field10373.length; ++var40) {
                class747.field10373[var40].method2123();
            }
        }
        if (class309.field3847) {
            class34.method313();
            for (int var41 = 0; var41 < class368.field4569; ++var41) {
                class617.field8308[var41] = class207.field2459[var41];
            }
            if (class538.field7570 == 2) {
                int var10002;
                if (class180.field2202[0] < class180.field2202[1]) {
                    if (class688.field9379[0] + class548.field7643[0] > class3.field44[0]) {
                        var10002 = class548.field7643[0]++;
                    }
                } else if (class180.field2202[0] > class180.field2202[1] && class688.field9379[0] + class548.field7643[0] < class3.field44[2]) {
                    var10002 = class548.field7643[0]--;
                }
            }
        }
        if (!class690.field9396) {
            class308.field3820 = var19;
            class152.field1896 = var20;
        }
        class331.method1965();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(B)V", line = 493)
    public final void method274(byte arg0) {
        int var2 = -106 % ((arg0 - -40) / 36);
        super.method274((byte) -125);
        ++field7416;
    }
}
