import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 extends class242 {

    @OriginalMember(owner = "client!qd", name = "V", descriptor = "I")
    private int field97 = 4096;

    @OriginalMember(owner = "client!qd", name = "Y", descriptor = "[I")
    public static int[] field100 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!qd", name = "Z", descriptor = "Z")
    public static boolean field101 = true;

    @OriginalMember(owner = "client!qd", name = "T", descriptor = "Lp;")
    public static class280 field95 = class18.method140((byte) -123, "Fichiers config charg-Bs");

    @OriginalMember(owner = "client!qd", name = "hb", descriptor = "[I")
    public static int[] field109 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!qd", name = "cb", descriptor = "Lp;")
    public static class280 field104 = class18.method140((byte) -117, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!qd", name = "ab", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!qd", name = "bb", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!qd", name = "db", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!qd", name = "eb", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!qd", name = "fb", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!qd", name = "gb", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!qd", name = "S", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!qd", name = "U", descriptor = "I")
    public static int field96;

    @OriginalMember(owner = "client!qd", name = "X", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!qd", name = "R", descriptor = "[I")
    public static int[] field93;

    @OriginalMember(owner = "client!qd", name = "W", descriptor = "[[[I")
    public static int[][][] field98;

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "(I)V")
    public static void method48(int arg0) {
        field109 = null;
        field104 = null;
        field93 = null;
        if (arg0 != 0) {
            field100 = null;
        }
        field95 = null;
        field100 = null;
        field98 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILlj;)V")
    public final void method49(int arg0, int arg1, class25 arg2) {
        if (arg1 == 0) {
            this.field97 = arg2.method193((byte) 77);
        }
        if (arg0 > -119) {
            method48(101);
        }
        ++field107;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IZ)V")
    public static final void method50(int arg0, boolean arg1) {
        ++field106;
        if (class94.field1527 != arg1) {
            class94.field1527 = arg1;
            int var2 = -105 % ((-61 - arg0) / 45);
            class236.method1586(-1);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(BLug;)V")
    public static final void method51(byte arg0, class198 arg1) {
        class120.field2126 = 3;
        ++field102;
        class250.method1688(-121, true);
        field101 = true;
        class119 var2 = null;
        class222.field3854 = 0;
        class215.field3720 = true;
        class9.field190 = 0;
        class128.field2234 = 0;
        class140.field2430 = true;
        class273.field4754 = true;
        class188.field3307 = 255;
        class12.field252 = true;
        class2.field80 = true;
        class17.field316 = 2;
        class54.field892 = 127;
        class157.field2752 = true;
        class175.field3029 = 0;
        class83.field1376 = true;
        class81.field1332 = true;
        class261.field4617 = 127;
        class183.field3219 = true;
        class160.field2810 = true;
        if (~class142.field2494 <= -97) {
            class95.method670(2);
        } else {
            class95.method670(0);
        }
        if (arg0 == -90) {
            class98.field1573 = 0;
            class9.field193 = false;
            class242.field4247 = false;
            class50.field817 = 0;
            class190.field3332 = true;
            class185.field3267 = false;
            class64.field1053 = 0;
            try {
                class174 var3 = arg1.method1362(10, "runescape");
                while (~var3.field3025 == -1) {
                    class159.method1130(1L, 0);
                }
                if (var3.field3025 == 1) {
                    var2 = (class119) var3.field3028;
                    byte[] var4 = new byte[(int) var2.method850(-19387)];
                    int var6;
                    for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                        var6 = var2.method847(var5, var4.length + -var5, arg0 ^ -90, var4);
                        if (~var6 == 0) {
                            throw new IOException("EOF");
                        }
                    }
                    class11.method106(new class25(var4), -102);
                }
            } catch (Exception var8) {
            }
            try {
                if (var2 != null) {
                    var2.method849(60);
                }
            } catch (Exception var7) {
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "<init>", descriptor = "()V")
    public class3() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "(II)V")
    public static final void method52(int arg0, int arg1) {
        ++field103;
        if (arg1 >= 0) {
            int var2 = class242.field4235[arg1];
            int var3 = class227.field3917[arg1];
            int var4 = (int) class219.field3753[arg1];
            int var5 = class275.field4765[arg1];
            if (~var5 <= -2001) {
                var5 -= 2000;
            }
            long var6 = class219.field3753[arg1];
            if (~var5 == -1004) {
                class34.field632 = 0;
                class60.field964 = class98.field1572;
                class22.field401 = class187.field3268;
                class97.field1563 = 2;
                class61 var8 = class46.field756[var4];
                if (var8 != null) {
                    class255 var9 = var8.field987;
                    if (var9.field4516 != null) {
                        var9 = var9.method1717(false);
                    }
                    if (var9 != null) {
                        class34.field627.method551(212, true);
                        class34.field627.method224(var9.field4526, 112);
                        ++class208.field3588;
                    }
                }
            }
            if (var5 == 17) {
                class142 var10 = class280.field4940[var4];
                if (var10 != null) {
                    ++class16.field296;
                    class49.method362(2, var10.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var10.field4792[0], 1, false, 0, 0);
                    class97.field1563 = 2;
                    class22.field401 = class187.field3268;
                    class34.field632 = 0;
                    class60.field964 = class98.field1572;
                    class34.field627.method551(226, true);
                    class34.field627.method228(arg0 ^ 9951, var4);
                }
            }
            if (var5 == 21) {
                if (~var4 != -1) {
                    if (class129.field2238 > 0 && class88.field1431[82] && class88.field1431[81]) {
                        class207.method1399(class49.field806 + var2, class231.field4013, arg0 + 29605, class91.field1480 - -var3);
                    } else {
                        class34.field627.method551(36, true);
                        ++class152.field2619;
                        class34.field627.method224(class49.field806 - -var2, 115);
                        class34.field627.method223(class91.field1480 + var3, -3339);
                    }
                } else {
                    class55.field896 = 1;
                    class159.method1129(class231.field4013, var2, var3);
                }
            }
            if (~var5 == -29) {
                class142 var11 = class280.field4940[var4];
                if (var11 != null) {
                    class49.method362(2, var11.field4837[0], arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var11.field4792[0], 1, false, 0, 0);
                    ++class62.field1012;
                    class97.field1563 = 2;
                    class22.field401 = class187.field3268;
                    class34.field632 = 0;
                    class60.field964 = class98.field1572;
                    class34.field627.method551(50, true);
                    class34.field627.method214(-3, var4);
                }
            }
            if (var5 == 59) {
                ++class153.field2643;
                if (class283.field4992 == 1) {
                    class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                } else {
                    boolean var12 = class49.method362(2, var2, arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                    if (!var12) {
                        class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                    }
                }
                class22.field401 = class187.field3268;
                class97.field1563 = 2;
                class60.field964 = class98.field1572;
                class34.field632 = 0;
                class34.field627.method551(166, true);
                class34.field627.method228(9949, var4);
                class34.field627.method223(class91.field1480 + var3, -3339);
                class34.field627.method214(-3, class49.field806 + var2);
            }
            if (var5 == 1005) {
                ++class94.field1524;
                class199.method1364(var6, var3, var2, 55);
                class34.field627.method551(185, true);
                class34.field627.method224(class49.field806 + var2, 75);
                class34.field627.method214(-3, class91.field1480 + var3);
                class34.field627.method224(Integer.MAX_VALUE & (int) (var6 >>> 32), 112);
            }
            if (var5 == 10) {
                class34.field627.method551(53, true);
                class34.field627.method231(11510, var3);
                ++class208.field3597;
                class113 var14 = class233.method1569(arg0 + 65533, var3);
                if (var14.field1950 != null && var14.field1950[0][0] == 5) {
                    int var15 = var14.field1950[0][1];
                    if (~class17.field314[var15] != ~var14.field1982[0]) {
                        class17.field314[var15] = var14.field1982[0];
                        class2.method44(false, var15);
                    }
                }
            }
            if (~var5 == -47) {
                class199.method1364(var6, var3, var2, arg0 + 89);
                class34.field627.method551(98, true);
                ++class149.field2581;
                class34.field627.method214(-3, class91.field1480 + var3);
                class34.field627.method214(~arg0, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class34.field627.method223(var2 - -class49.field806, -3339);
            }
            if (~var5 == -21) {
                ++class230.field4001;
                if (~class283.field4992 != -2) {
                    boolean var16 = class49.method362(2, var2, arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                    if (!var16) {
                        class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                    }
                } else {
                    class49.method362(2, var2, arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                }
                class60.field964 = class98.field1572;
                class34.field632 = 0;
                class22.field401 = class187.field3268;
                class97.field1563 = 2;
                class34.field627.method551(171, true);
                class34.field627.method214(arg0 + -5, class91.field1480 + var3);
                class34.field627.method214(-3, var4);
                class34.field627.method228(arg0 + 9947, class49.field806 + var2);
            }
            if (~var5 == -3) {
                class113 var18 = class233.method1569(65535, var3);
                boolean var19 = true;
                if (~var18.field1899 < -1) {
                    var19 = class262.method1775(true, var18);
                }
                if (var19) {
                    ++class208.field3597;
                    class34.field627.method551(53, true);
                    class34.field627.method231(11510, var3);
                }
            }
            if (var5 == 3) {
                if (class283.field4992 != 1) {
                    boolean var20 = class49.method362(2, var2, arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                    if (!var20) {
                        class49.method362(2, var2, arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                    }
                } else {
                    class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                }
                class22.field401 = class187.field3268;
                class97.field1563 = 2;
                class60.field964 = class98.field1572;
                class34.field632 = 0;
                ++class184.field3239;
                class34.field627.method551(0, true);
                class34.field627.method214(arg0 + -5, var4);
                class34.field627.method228(arg0 ^ 9951, var2 - -class49.field806);
                class34.field627.method223(var3 - -class91.field1480, arg0 ^ -3337);
            }
            if (var5 == 15) {
                class142 var22 = class280.field4940[var4];
                if (var22 != null) {
                    class49.method362(2, var22.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var22.field4792[0], 1, false, 0, 0);
                    class34.field632 = 0;
                    class97.field1563 = 2;
                    ++class86.field1414;
                    class60.field964 = class98.field1572;
                    class22.field401 = class187.field3268;
                    class34.field627.method551(103, true);
                    class34.field627.method224(var4, 92);
                }
            }
            if (~var5 == -49) {
                class34.field627.method551(13, true);
                ++class201.field3513;
                class34.field627.method235(var3, true);
                class34.field627.method224(var2, arg0 ^ 104);
                class34.field627.method224(var4, arg0 ^ 55);
                class153.field2651 = 0;
                class206.field3575 = class233.method1569(65535, var3);
                class227.field3915 = var2;
            }
            if (~var5 == -2) {
                if (~class283.field4992 == -2) {
                    class49.method362(2, var2, arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                } else {
                    boolean var23 = class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                    if (!var23) {
                        class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                    }
                }
                class22.field401 = class187.field3268;
                class60.field964 = class98.field1572;
                class97.field1563 = 2;
                class34.field632 = 0;
                class34.field627.method551(252, true);
                class34.field627.method223(var4, -3339);
                ++class175.field3043;
                class34.field627.method214(-3, var2 - -class49.field806);
                class34.field627.method228(9949, class91.field1480 + var3);
            }
            if (var5 == 36) {
                class61 var25 = class46.field756[var4];
                if (var25 != null) {
                    ++class180.field3122;
                    class49.method362(2, var25.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var25.field4792[0], 1, false, 0, 0);
                    class97.field1563 = 2;
                    class22.field401 = class187.field3268;
                    class34.field632 = 0;
                    class60.field964 = class98.field1572;
                    class34.field627.method551(11, true);
                    class34.field627.method224(var4, 62);
                }
            }
            if (~var5 == -61 && class180.field3157 == null) {
                class273.method1816(var2, arg0 + 192, var3);
                class180.field3157 = class224.method1509(var3, var2, (byte) 108);
                class242.method1642((byte) 114, class180.field3157);
            }
            if (var5 == 41) {
                if (~var4 == -1) {
                    class176.field3071 = 1;
                    class159.method1129(class231.field4013, var2, var3);
                } else if (var4 == 1) {
                    class34.field627.method551(7, true);
                    class34.field627.method224(class49.field806 + var2, arg0 ^ 86);
                    class34.field627.method209(arg0 ^ -66, class235.field4098);
                    ++class167.field2922;
                    class34.field627.method223(class28.field529, -3339);
                    class34.field627.method214(-3, class91.field1480 + var3);
                }
            }
            if (~var5 == -9) {
                ++class242.field4240;
                class199.method1364(var6, var3, var2, 62);
                class34.field627.method551(253, true);
                class34.field627.method224(var2 - -class49.field806, arg0 + 115);
                class34.field627.method223((int) (var6 >>> 32) & Integer.MAX_VALUE, -3339);
                class34.field627.method228(arg0 ^ 9951, class91.field1480 + var3);
            }
            if (var5 == 30) {
                class113 var26 = class224.method1509(var3, var2, (byte) 97);
                if (var26 != null) {
                    class34.method286((byte) -15);
                    class249.method1682(var2, (byte) -86, var3, class140.method972((byte) 100, client.method1099(var26)));
                    class112.field1836 = 0;
                    class90.field1473 = class204.method1393((byte) 103, var26);
                    if (class90.field1473 == null) {
                        class90.field1473 = class14.field281;
                    }
                    if (var26.field2008) {
                        class268.field4702 = class30.method266(new class280[] { var26.field1904, class89.field1452 }, (byte) -87);
                        return;
                    }
                    class268.field4702 = class30.method266(new class280[] { class58.field933, var26.field1987, class89.field1452 }, (byte) -87);
                }
            } else {
                if (var5 == 19) {
                    ++class197.field3445;
                    class34.field627.method551(198, true);
                    class34.field627.method214(-3, var4);
                    class34.field627.method224(var2, 54);
                    class34.field627.method231(11510, var3);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (~var5 == -1005) {
                    class113 var27 = class233.method1569(arg0 + 65533, var3);
                    if (var27 != null && ~var27.field1951[var2] <= -100001) {
                        class188.method1312(-1117075764, 0, class229.field3959, class30.method266(new class280[] { class249.method1685((byte) -111, var27.field1951[var2]), class131.field2327, class23.method177((byte) -107, var4).field3818 }, (byte) -87));
                    } else {
                        ++class101.field1645;
                        class34.field627.method551(128, true);
                        class34.field627.method223(var4, arg0 + -3341);
                    }
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (var5 == 58) {
                    ++class74.field1235;
                    class199.method1364(var6, var3, var2, arg0 + 119);
                    class34.field627.method551(241, true);
                    class34.field627.method214(-3, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class34.field627.method223(class49.field806 + var2, arg0 + -3341);
                    class34.field627.method228(9949, class91.field1480 + var3);
                }
                if (~var5 == -44) {
                    class61 var28 = class46.field756[var4];
                    if (var28 != null) {
                        class49.method362(2, var28.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var28.field4792[0], 1, false, 0, 0);
                        class60.field964 = class98.field1572;
                        class22.field401 = class187.field3268;
                        class34.field632 = 0;
                        ++class9.field205;
                        class97.field1563 = 2;
                        class34.field627.method551(145, true);
                        class34.field627.method228(9949, class64.field1077);
                        class34.field627.method214(-3, class35.field647);
                        class34.field627.method209(99, class268.field4704);
                        class34.field627.method223(var4, -3339);
                    }
                }
                if (~var5 == -34) {
                    if (var4 == 0) {
                        class159.method1129(class231.field4013, var2, var3);
                    } else if (~var4 == -2) {
                        if (class129.field2238 > 0 && class88.field1431[82] && class88.field1431[81]) {
                            class207.method1399(class49.field806 + var2, class231.field4013, 29607, class91.field1480 + var3);
                        } else if (class49.method362(1, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, true, 0, 0)) {
                            class34.field627.method227(-20435, class68.field1126);
                            class34.field627.method227(-20435, class226.field3898);
                            class34.field627.method214(-3, class25.field487);
                            class34.field627.method227(-20435, 57);
                            class34.field627.method227(arg0 ^ -20433, class273.field4756);
                            class34.field627.method227(arg0 ^ -20433, class142.field2461);
                            class34.field627.method227(arg0 + -20437, 89);
                            class34.field627.method214(arg0 + -5, class262.field4631.field4791);
                            class34.field627.method214(~arg0, class262.field4631.field4793);
                            class34.field627.method227(-20435, class104.field1733);
                            class34.field627.method227(-20435, 63);
                        }
                    }
                }
                if (~var5 == -41) {
                    class142 var29 = class280.field4940[var4];
                    if (var29 != null) {
                        class49.method362(2, var29.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var29.field4792[0], 1, false, 0, 0);
                        ++class56.field913;
                        class60.field964 = class98.field1572;
                        class97.field1563 = 2;
                        class34.field632 = 0;
                        class22.field401 = class187.field3268;
                        class34.field627.method551(209, true);
                        class34.field627.method214(-3, var4);
                        class34.field627.method224(class28.field529, arg0 ^ 43);
                        class34.field627.method225(class235.field4098, -55);
                    }
                }
                if (var5 == 23) {
                    class142 var30 = class280.field4940[var4];
                    if (var30 != null) {
                        class49.method362(2, var30.field4837[0], arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var30.field4792[0], 1, false, 0, 0);
                        class60.field964 = class98.field1572;
                        class34.field632 = 0;
                        ++class94.field1523;
                        class97.field1563 = 2;
                        class22.field401 = class187.field3268;
                        class34.field627.method551(47, true);
                        class34.field627.method224(var4, arg0 + 72);
                    }
                }
                if (~var5 == -50) {
                    class34.field627.method551(89, true);
                    ++class226.field3896;
                    class34.field627.method223(var2, -3339);
                    class34.field627.method231(11510, var3);
                    class34.field627.method214(~arg0, class28.field529);
                    class34.field627.method225(class235.field4098, -82);
                }
                if (~var5 == -7) {
                    class61 var31 = class46.field756[var4];
                    if (var31 != null) {
                        class49.method362(2, var31.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var31.field4792[0], 1, false, 0, 0);
                        class60.field964 = class98.field1572;
                        class22.field401 = class187.field3268;
                        ++class142.field2457;
                        class34.field632 = 0;
                        class97.field1563 = 2;
                        class34.field627.method551(117, true);
                        class34.field627.method223(var4, -3339);
                    }
                }
                if (~var5 == -23) {
                    class142 var32 = class280.field4940[var4];
                    if (var32 != null) {
                        ++class176.field3048;
                        class49.method362(2, var32.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var32.field4792[0], 1, false, 0, 0);
                        class34.field632 = 0;
                        class97.field1563 = 2;
                        class22.field401 = class187.field3268;
                        class60.field964 = class98.field1572;
                        class34.field627.method551(64, true);
                        class34.field627.method224(var4, arg0 + 67);
                    }
                }
                if (~var5 == -25) {
                    ++class97.field1548;
                    class34.field627.method551(68, true);
                    class34.field627.method224(var4, 116);
                    class34.field627.method231(11510, var3);
                    class34.field627.method224(var2, 78);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (var5 == 11) {
                    class34.field627.method551(82, true);
                    class34.field627.method209(120, var3);
                    class34.field627.method228(arg0 ^ 9951, class64.field1077);
                    class34.field627.method223(class35.field647, -3339);
                    ++class259.field4584;
                    class34.field627.method223(var2, -3339);
                    class34.field627.method223(var4, arg0 ^ -3337);
                    class34.field627.method209(arg0 + 93, class268.field4704);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (var5 == 14 || var5 == 1001) {
                    class153.method1087(class258.field4566[arg1], var2, -11714, var4, var3);
                }
                if (var5 == 13) {
                    class34.field627.method551(53, true);
                    class34.field627.method231(11510, var3);
                    ++class208.field3597;
                    class113 var33 = class233.method1569(arg0 ^ 65533, var3);
                    if (var33.field1950 != null && ~var33.field1950[0][0] == -6) {
                        int var34 = var33.field1950[0][1];
                        class17.field314[var34] = 1 - class17.field314[var34];
                        class2.method44(false, var34);
                    }
                }
                if (~var5 == -27) {
                    class199.method1364(var6, var3, var2, 108);
                    ++class236.field4114;
                    class34.field627.method551(221, true);
                    class34.field627.method228(9949, class91.field1480 + var3);
                    class34.field627.method224(class49.field806 + var2, 114);
                    class34.field627.method224((int) (var6 >>> 32) & Integer.MAX_VALUE, arg0 + 71);
                }
                if (var5 == 5) {
                    class142 var35 = class280.field4940[var4];
                    if (var35 != null) {
                        class49.method362(2, var35.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var35.field4792[0], 1, false, 0, 0);
                        class34.field632 = 0;
                        class60.field964 = class98.field1572;
                        class22.field401 = class187.field3268;
                        ++class29.field548;
                        class97.field1563 = 2;
                        class34.field627.method551(146, true);
                        class34.field627.method223(var4, arg0 ^ -3337);
                    }
                }
                if (~var5 == -8) {
                    class34.field627.method551(218, true);
                    ++class244.field4285;
                    class34.field627.method224(var2, 88);
                    class34.field627.method209(-27, var3);
                    class34.field627.method224(var4, arg0 ^ 87);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (var5 == 37 && class199.method1364(var6, var3, var2, 35)) {
                    ++class194.field3422;
                    class34.field627.method551(230, true);
                    class34.field627.method223(class91.field1480 + var3, -3339);
                    class34.field627.method228(9949, class49.field806 + var2);
                    class34.field627.method223(class28.field529, arg0 ^ -3337);
                    class34.field627.method228(9949, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class34.field627.method235(class235.field4098, true);
                }
                if (var5 == 50) {
                    class34.field627.method551(108, true);
                    ++class235.field4101;
                    class34.field627.method235(var3, true);
                    class34.field627.method224(var4, 74);
                    class34.field627.method223(var2, -3339);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (~var5 == -32) {
                    class34.field627.method551(156, true);
                    class34.field627.method228(arg0 ^ 9951, var4);
                    class34.field627.method209(-1, var3);
                    ++class55.field900;
                    class34.field627.method214(~arg0, var2);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(65535, var3);
                    class227.field3915 = var2;
                }
                if (~var5 == -1008) {
                    class34.field632 = 0;
                    class22.field401 = class187.field3268;
                    class60.field964 = class98.field1572;
                    class97.field1563 = 2;
                    ++class109.field1796;
                    class34.field627.method551(20, true);
                    class34.field627.method223(var4, -3339);
                }
                if (var5 == 44) {
                    class61 var36 = class46.field756[var4];
                    if (var36 != null) {
                        ++class28.field524;
                        class49.method362(2, var36.field4837[0], arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var36.field4792[0], 1, false, 0, 0);
                        class34.field632 = 0;
                        class22.field401 = class187.field3268;
                        class60.field964 = class98.field1572;
                        class97.field1563 = 2;
                        class34.field627.method551(109, true);
                        class34.field627.method228(9949, var4);
                    }
                }
                if (var5 == 18) {
                    class34.field627.method551(243, true);
                    class34.field627.method209(88, var3);
                    class34.field627.method209(arg0 ^ 98, class235.field4098);
                    class34.field627.method228(9949, var2);
                    class34.field627.method224(var4, 46);
                    class34.field627.method228(9949, class28.field529);
                    ++class127.field2218;
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(arg0 + 65533, var3);
                    class227.field3915 = var2;
                }
                if (~var5 == -39) {
                    ++class64.field1078;
                    class34.field627.method551(148, true);
                    class34.field627.method223(var2, -3339);
                    class34.field627.method235(var3, true);
                    class34.field627.method214(-3, var4);
                    class153.field2651 = 0;
                    class206.field3575 = class233.method1569(arg0 ^ 65533, var3);
                    class227.field3915 = var2;
                }
                if (~var5 == -17) {
                    class142 var37 = class280.field4940[var4];
                    if (var37 != null) {
                        class49.method362(2, var37.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var37.field4792[0], 1, false, 0, 0);
                        class60.field964 = class98.field1572;
                        class97.field1563 = 2;
                        class34.field632 = 0;
                        ++class8.field160;
                        class22.field401 = class187.field3268;
                        class34.field627.method551(233, true);
                        class34.field627.method223(var4, -3339);
                    }
                }
                if (~var5 == -58 && class199.method1364(var6, var3, var2, 108)) {
                    class34.field627.method551(210, true);
                    ++field99;
                    class34.field627.method214(-3, class64.field1077);
                    class34.field627.method228(arg0 ^ 9951, class91.field1480 + var3);
                    class34.field627.method214(~arg0, class49.field806 + var2);
                    class34.field627.method228(9949, class35.field647);
                    class34.field627.method214(~arg0, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class34.field627.method231(arg0 ^ 11508, class268.field4704);
                }
                if (~var5 == -48) {
                    class275.method1827((byte) 32);
                }
                if (~var5 == -13) {
                    ++class51.field845;
                    boolean var38 = class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                    if (!var38) {
                        class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                    }
                    class34.field632 = 0;
                    class97.field1563 = 2;
                    class60.field964 = class98.field1572;
                    class22.field401 = class187.field3268;
                    class34.field627.method551(249, true);
                    class34.field627.method224(class28.field529, arg0 ^ 125);
                    class34.field627.method214(-3, class91.field1480 + var3);
                    class34.field627.method224(class49.field806 + var2, 55);
                    class34.field627.method225(class235.field4098, -125);
                    class34.field627.method223(var4, -3339);
                }
                if (~var5 == -35) {
                    class61 var40 = class46.field756[var4];
                    if (var40 != null) {
                        ++class44.field733;
                        class49.method362(2, var40.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var40.field4792[0], 1, false, 0, 0);
                        class34.field632 = 0;
                        class60.field964 = class98.field1572;
                        class97.field1563 = 2;
                        class22.field401 = class187.field3268;
                        class34.field627.method551(250, true);
                        class34.field627.method223(var4, arg0 + -3341);
                    }
                }
                if (var5 == 1006) {
                    class22.field401 = class187.field3268;
                    class34.field632 = 0;
                    ++class101.field1645;
                    class60.field964 = class98.field1572;
                    class97.field1563 = 2;
                    class34.field627.method551(128, true);
                    class34.field627.method223(var4, -3339);
                }
                if (~var5 == -46) {
                    class34.method286((byte) -123);
                    class113 var41 = class233.method1569(65535, var3);
                    class112.field1836 = 1;
                    class64.field1077 = var4;
                    class35.field647 = var2;
                    class268.field4704 = var3;
                    class242.method1642((byte) 115, var41);
                    class48.field791 = class30.method266(new class280[] { class173.field3015, class23.method177((byte) -82, var4).field3818, class89.field1452 }, (byte) -87);
                    if (class48.field791 == null) {
                        class48.field791 = class20.field374;
                    }
                } else {
                    if (var5 == 9) {
                        class61 var42 = class46.field756[var4];
                        if (var42 != null) {
                            ++class160.field2787;
                            class49.method362(2, var42.field4837[0], arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var42.field4792[0], 1, false, 0, 0);
                            class34.field632 = 0;
                            class60.field964 = class98.field1572;
                            class97.field1563 = 2;
                            class22.field401 = class187.field3268;
                            class34.field627.method551(59, true);
                            class34.field627.method224(class28.field529, 78);
                            class34.field627.method224(var4, 49);
                            class34.field627.method235(class235.field4098, true);
                        }
                    }
                    if (~var5 == -43) {
                        if (~class283.field4992 != -2) {
                            boolean var43 = class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                            if (!var43) {
                                class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                            }
                        } else {
                            class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                        }
                        ++class73.field1200;
                        class97.field1563 = 2;
                        class22.field401 = class187.field3268;
                        class34.field632 = 0;
                        class60.field964 = class98.field1572;
                        class34.field627.method551(248, true);
                        class34.field627.method223(var2 - -class49.field806, -3339);
                        class34.field627.method223(var4, -3339);
                        class34.field627.method228(9949, class91.field1480 + var3);
                    }
                    if (~var5 == -52) {
                        class142 var45 = class280.field4940[var4];
                        if (var45 != null) {
                            class49.method362(2, var45.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var45.field4792[0], 1, false, 0, 0);
                            class22.field401 = class187.field3268;
                            ++class164.field2885;
                            class34.field632 = 0;
                            class60.field964 = class98.field1572;
                            class97.field1563 = 2;
                            class34.field627.method551(124, true);
                            class34.field627.method224(var4, 111);
                        }
                    }
                    if (var5 == 35) {
                        class61 var46 = class46.field756[var4];
                        if (var46 != null) {
                            ++class165.field2895;
                            class49.method362(2, var46.field4837[0], arg0, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var46.field4792[0], 1, false, 0, 0);
                            class60.field964 = class98.field1572;
                            class34.field632 = 0;
                            class97.field1563 = 2;
                            class22.field401 = class187.field3268;
                            class34.field627.method551(141, true);
                            class34.field627.method214(-3, var4);
                        }
                    }
                    if (~var5 == -30) {
                        ++class282.field4958;
                        boolean var47 = class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 0, var3, 0, false, 0, 0);
                        if (!var47) {
                            class49.method362(2, var2, 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var3, 1, false, 0, 0);
                        }
                        class34.field632 = 0;
                        class60.field964 = class98.field1572;
                        class22.field401 = class187.field3268;
                        class97.field1563 = 2;
                        class34.field627.method551(87, true);
                        class34.field627.method228(9949, class91.field1480 + var3);
                        class34.field627.method224(var4, 109);
                        class34.field627.method214(arg0 + -5, class64.field1077);
                        class34.field627.method223(var2 - -class49.field806, -3339);
                        class34.field627.method235(class268.field4704, true);
                        class34.field627.method223(class35.field647, -3339);
                    }
                    if (~var5 == -5) {
                        class142 var49 = class280.field4940[var4];
                        if (var49 != null) {
                            class49.method362(2, var49.field4837[0], 2, 0, class262.field4631.field4792[0], class262.field4631.field4837[0], 1, var49.field4792[0], 1, false, 0, 0);
                            ++class283.field4971;
                            class60.field964 = class98.field1572;
                            class97.field1563 = 2;
                            class22.field401 = class187.field3268;
                            class34.field632 = 0;
                            class34.field627.method551(254, true);
                            class34.field627.method225(class268.field4704, -104);
                            class34.field627.method224(var4, 56);
                            class34.field627.method223(class35.field647, -3339);
                            class34.field627.method214(arg0 + -5, class64.field1077);
                        }
                    }
                    if (~var5 == -33) {
                        ++class248.field4340;
                        class34.field627.method551(75, true);
                        class34.field627.method228(arg0 + 9947, var4);
                        class34.field627.method235(var3, true);
                        class34.field627.method224(var2, 77);
                        class153.field2651 = 0;
                        class206.field3575 = class233.method1569(65535, var3);
                        class227.field3915 = var2;
                    }
                    if (~var5 == -26) {
                        ++client.field2682;
                        class34.field627.method551(94, true);
                        class34.field627.method225(var3, -125);
                        class34.field627.method223(var2, arg0 + -3341);
                        class34.field627.method223(var4, -3339);
                        class153.field2651 = 0;
                        class206.field3575 = class233.method1569(65535, var3);
                        class227.field3915 = var2;
                    }
                    if (arg0 == 2) {
                        if (var5 == 39) {
                            ++class92.field1500;
                            class34.field627.method551(160, true);
                            class34.field627.method223(var2, -3339);
                            class34.field627.method235(var3, true);
                            class34.field627.method223(var4, -3339);
                            class153.field2651 = 0;
                            class206.field3575 = class233.method1569(65535, var3);
                            class227.field3915 = var2;
                        }
                        if (~class112.field1836 != -1) {
                            class112.field1836 = 0;
                            class242.method1642((byte) 122, class233.method1569(65535, class268.field4704));
                        }
                        if (class263.field4647) {
                            class34.method286((byte) 82);
                        }
                        if (class206.field3575 != null && class153.field2651 == 0) {
                            class242.method1642((byte) 48, class206.field3575);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(Ltg;I)Z")
    public static final boolean method53(class180 arg0, int arg1) {
        ++field108;
        if (arg0.method1262(class185.field3259, (byte) 93)) {
            return true;
        } else {
            if (arg1 != 0) {
                method50(1, false);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)[I")
    public final int[] method54(int arg0, int arg1) {
        ++field94;
        int var3 = 90 % ((arg1 - 73) / 41);
        int[] var4 = super.field4251.method1417((byte) 88, arg0);
        if (super.field4251.field3655) {
            int[] var5 = this.method1647(0, arg0 - 1 & class29.field540, 48);
            int[] var6 = this.method1647(0, arg0, 48);
            int[] var7 = this.method1647(0, arg0 + 1 & class29.field540, 48);
            for (int var8 = 0; var8 < class264.field4654; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * this.field97;
                int var10 = (var6[class230.field3968 & var8 + 1] + -var6[class230.field3968 & var8 + -1]) * this.field97;
                int var11 = var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = var12 * var12 >> 12;
                int var15 = (int) (Math.sqrt((double) ((float) (var13 + 4096 + var14) / 4096.0F)) * 4096.0D);
                int var16 = ~var15 != -1 ? 16777216 / var15 : 0;
                var4[var8] = 4096 - var16;
            }
        }
        return var4;
    }
}
