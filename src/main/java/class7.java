import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class7 extends class87 {

    @OriginalMember(owner = "client!kh", name = "H", descriptor = "I")
    private int field64 = 1365;

    @OriginalMember(owner = "client!kh", name = "L", descriptor = "I")
    private int field68 = 0;

    @OriginalMember(owner = "client!kh", name = "M", descriptor = "I")
    private int field69 = 0;

    @OriginalMember(owner = "client!kh", name = "U", descriptor = "I")
    private int field77 = 20;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field66 = "Loading defaults - ";

    @OriginalMember(owner = "client!kh", name = "P", descriptor = "I")
    public static int field72 = 0;

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!kh", name = "K", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!kh", name = "N", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!kh", name = "O", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!kh", name = "R", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!kh", name = "T", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!kh", name = "Q", descriptor = "Z")
    public static boolean field73;

    @OriginalMember(owner = "client!kh", name = "S", descriptor = "[[B")
    public static byte[][] field75;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIIILmh;)V")
    public static final void method36(int arg0, int arg1, int arg2, int arg3, class263 arg4) {
        ++field76;
        if (~class201.field2963 > -4) {
            ((class148) class5.field44).method867(arg3, arg1, arg4.field4215, arg4.field4046, class5.field44.field1585 / 2, class5.field44.field1586 / 2, (int) class102.field1736, 256, arg4.field4220, arg4.field4168);
        } else {
            class130.method990(arg3, arg1, 0, arg4.field4220, arg4.field4168);
        }
        if (arg2 != 5027) {
            field75 = null;
        }
        class91.field1468[arg0] = true;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IZ)[I")
    public final int[] method37(int arg0, boolean arg1) {
        int[] var3 = super.field1378.method319(arg0, arg1);
        if (arg1) {
            method38(false, (String) null);
        }
        if (super.field1378.field733) {
            for (int var4 = 0; var4 < class206.field3032; ++var4) {
                int var5 = (class140.field2272[arg0] << 12) / this.field64 + this.field69;
                int var6 = (class138.field2254[var4] << 12) / this.field64 - -this.field68;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = var5;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field77 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = -var11 + var12 + var7;
                    ++var13;
                    var11 = var10 * var10 >> 12;
                    var12 = var9 * var9 >> 12;
                }
                var3[var4] = this.field77 + -1 > var13 ? (var13 << 12) / this.field77 : 0;
            }
        }
        ++field74;
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/String;)I")
    public static final int method38(boolean arg0, String arg1) {
        ++field63;
        if (arg1 == null) {
            return -1;
        } else {
            int var2 = 0;
            if (arg0) {
                field75 = null;
            }
            while (class110.field1832 > var2) {
                if (arg1.equalsIgnoreCase(class223.field3268[var2])) {
                    return var2;
                }
                ++var2;
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method39(int arg0) {
        if (arg0 != 14073) {
            field75 = null;
        }
        field75 = null;
        field66 = null;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lhc;II)V")
    public final void method40(class53 arg0, int arg1, int arg2) {
        ++field71;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field69 = arg0.method331(-40);
                    }
                } else {
                    this.field68 = arg0.method331(-92);
                }
            } else {
                this.field77 = arg0.method331(-106);
            }
        } else {
            this.field64 = arg0.method331(-96);
        }
        if (arg2 != 25645) {
            this.field64 = -68;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BI)V")
    public static final void method41(byte arg0, int arg1) {
        ++field70;
        if (arg1 >= 0) {
            int var2 = class141.field2277[arg1];
            int var3 = class131.field2173[arg1];
            int var4 = class204.field3009[arg1];
            if (~var4 <= -2001) {
                var4 -= 2000;
            }
            int var5 = (int) class303.field4910[arg1];
            long var6 = class303.field4910[arg1];
            if (~var4 == -13) {
                class84.field1329 = 0;
                ++class254.field3840;
                class11.field131 = class13.field153;
                class110.field1840 = 2;
                class151.field2393 = class17.field187;
                class144.field2338.method683(true, 119);
                class144.field2338.method341(121, class128.field2149);
                class144.field2338.method376(class149.field2390 + var3, false);
                class144.field2338.method365(class293.field4653, (byte) 59);
                class144.field2338.method328(class294.field4712, (byte) 92);
                class144.field2338.method358(8117, var5);
                class144.field2338.method328(class163.field2520 + var2, (byte) 123);
                class144.field2338.method369((byte) -125, class82.field1326[82] ? 1 : 0);
                class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
            }
            if (~var4 == -38) {
                class11.field131 = class13.field153;
                class110.field1840 = 2;
                class151.field2393 = class17.field187;
                ++class19.field210;
                class84.field1329 = 0;
                class144.field2338.method683(true, 3);
                class144.field2338.method383(arg0 ^ 2, class82.field1326[82] ? 1 : 0);
                class144.field2338.method328(class149.field2390 + var3, (byte) 89);
                class144.field2338.method328(var5, (byte) 101);
                class144.field2338.method365(class163.field2520 + var2, (byte) 59);
                class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
            }
            if (var4 == 44) {
                class84.field1329 = 0;
                class11.field131 = class13.field153;
                ++class260.field4025;
                class110.field1840 = 2;
                class151.field2393 = class17.field187;
                class144.field2338.method683(true, 92);
                class144.field2338.method369((byte) -128, !class82.field1326[82] ? 0 : 1);
                class144.field2338.method328((int) (var6 >>> 32) & Integer.MAX_VALUE, (byte) 124);
                class144.field2338.method365(class163.field2520 + var2, (byte) 59);
                class144.field2338.method365(class149.field2390 + var3, (byte) 59);
                class81.method611(var2, var3, var6, (byte) -31);
            }
            if (var4 == 46) {
                class263 var8 = class144.method1078(var3, 8534);
                boolean var9 = true;
                if (~var8.field4179 < -1) {
                    var9 = class229.method1592(var8, (byte) 93);
                }
                if (var9) {
                    class144.field2338.method683(true, 158);
                    class144.field2338.method385(var3, 455748840);
                    ++class66.field1010;
                }
            }
            if (var4 == 26) {
                class207 var10 = class92.field1475[var5];
                if (var10 != null) {
                    ++class197.field2897;
                    class110.field1840 = 2;
                    class84.field1329 = 0;
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    class144.field2338.method683(true, 96);
                    class144.field2338.method339(!class82.field1326[82] ? 0 : 1, -2065);
                    class144.field2338.method376(var5, false);
                    class52.method314(false, var10.method1467(0), class213.field3139.field3686[0], var2, var10.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (var4 == 43) {
                class110.field1840 = 2;
                class11.field131 = class13.field153;
                ++class5.field50;
                class84.field1329 = 0;
                class151.field2393 = class17.field187;
                class144.field2338.method683(true, 116);
                class144.field2338.method376(class294.field4712, false);
                class144.field2338.method358(8117, class163.field2520 + var2);
                class144.field2338.method358(8117, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                class144.field2338.method379(class128.field2149, true);
                class144.field2338.method383(-111, !class82.field1326[82] ? 0 : 1);
                class144.field2338.method328(class149.field2390 + var3, (byte) 122);
                class144.field2338.method328(class293.field4653, (byte) 91);
                class81.method611(var2, var3, var6, (byte) 96);
            }
            if (arg0 != -29) {
                method41((byte) 87, -59);
            }
            if (var4 == 1010) {
                class110.field1840 = 2;
                ++class273.field4417;
                class151.field2393 = class17.field187;
                class84.field1329 = 0;
                class11.field131 = class13.field153;
                class144.field2338.method683(true, 60);
                class144.field2338.method365(class149.field2390 + var3, (byte) 59);
                class144.field2338.method328(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 87);
                class144.field2338.method360(!class82.field1326[82] ? 0 : 1, arg0 + 25788);
                class144.field2338.method328(class163.field2520 + var2, (byte) 127);
                class81.method611(var2, var3, var6, (byte) -15);
            }
            if (var4 == 60) {
                class12 var11 = class255.field3856[var5];
                if (var11 != null) {
                    ++class230.field3381;
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class110.field1840 = 2;
                    class144.field2338.method683(true, 37);
                    class144.field2338.method360(!class82.field1326[82] ? 0 : 1, 25759);
                    class144.field2338.method358(8117, var5);
                    class52.method314(false, var11.method1467(0), class213.field3139.field3686[0], var2, var11.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -11) {
                ++class230.field3385;
                class144.field2338.method683(true, 242);
                class144.field2338.method358(8117, var2);
                class144.field2338.method358(8117, var5);
                class144.field2338.method348(var3, (byte) -116);
                class213.field3141 = 0;
                class155.field2415 = class144.method1078(var3, 8534);
                class140.field2271 = var2;
            }
            if (~var4 == -31) {
                class144.field2338.method683(true, 40);
                class144.field2338.method348(var3, (byte) -70);
                ++class155.field2426;
                class144.field2338.method376(class309.field4981, false);
                class144.field2338.method328(var2, (byte) 92);
                class144.field2338.method385(class295.field4741, arg0 + 455748869);
            }
            if (var4 == 11) {
                if (var5 == 0) {
                    class259.method1782(class37.field474, var2, var3);
                } else if (var5 == 1) {
                    if (~class228.field3349 < -1 && class82.field1326[82] && class82.field1326[81]) {
                        class212.method1492(class149.field2390 + var3, class37.field474, arg0 + 16975, class163.field2520 + var2);
                    } else {
                        class264.method1823(-23330, 1, var3, var2);
                        class144.field2338.method360(class308.field4960, 25759);
                        class144.field2338.method360(class240.field3528, 25759);
                        class144.field2338.method376((int) class102.field1736, false);
                        class144.field2338.method360(57, 25759);
                        class144.field2338.method360(class267.field4279, 25759);
                        class144.field2338.method360(class131.field2168, 25759);
                        class144.field2338.method360(89, 25759);
                        class144.field2338.method376(class213.field3139.field3660, false);
                        class144.field2338.method376(class213.field3139.field3753, false);
                        class144.field2338.method360(class139.field2267, 25759);
                        class144.field2338.method360(63, 25759);
                        class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                }
            }
            if (var4 == 13) {
                class11.field131 = class13.field153;
                ++class286.field4593;
                class110.field1840 = 2;
                class151.field2393 = class17.field187;
                class84.field1329 = 0;
                class144.field2338.method683(true, 134);
                class144.field2338.method369((byte) -127, class82.field1326[82] ? 1 : 0);
                class144.field2338.method365(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 59);
                class144.field2338.method365(var3 - -class149.field2390, (byte) 59);
                class144.field2338.method358(8117, var2 - -class163.field2520);
                class81.method611(var2, var3, var6, (byte) 117);
            }
            if (~var4 == -1006) {
                class263 var12 = class144.method1078(var3, 8534);
                if (var12 != null && ~var12.field4214[var2] <= -100001) {
                    class258.method1777(-1, 0, "", var12.field4214[var2] + " x " + class12.method88(var5, 27838).field349);
                } else {
                    class144.field2338.method683(true, 72);
                    class144.field2338.method376(var5, false);
                    ++class268.field4301;
                }
                class213.field3141 = 0;
                class155.field2415 = class144.method1078(var3, arg0 + 8563);
                class140.field2271 = var2;
            }
            if (~var4 == -1003 || var4 == 1001 || var4 == 1011 || ~var4 == -1007 || var4 == 1003) {
                class86.method637(var4, var5, var2, true);
            }
            if (~var4 == -20) {
                class12 var13 = class255.field3856[var5];
                if (var13 != null) {
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    ++class231.field3402;
                    class84.field1329 = 0;
                    class110.field1840 = 2;
                    class144.field2338.method683(true, 160);
                    class144.field2338.method383(-84, class82.field1326[82] ? 1 : 0);
                    class144.field2338.method379(class128.field2149, true);
                    class144.field2338.method328(var5, (byte) 121);
                    class144.field2338.method376(class294.field4712, false);
                    class144.field2338.method358(8117, class293.field4653);
                    class52.method314(false, var13.method1467(0), class213.field3139.field3686[0], var2, var13.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (var4 == 47) {
                class207 var14 = class92.field1475[var5];
                if (var14 != null) {
                    ++class276.field4470;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class151.field2393 = class17.field187;
                    class110.field1840 = 2;
                    class144.field2338.method683(true, 224);
                    class144.field2338.method365(var5, (byte) 59);
                    class144.field2338.method376(class309.field4981, false);
                    class144.field2338.method379(class295.field4741, true);
                    class144.field2338.method369((byte) -123, class82.field1326[82] ? 1 : 0);
                    class52.method314(false, var14.method1467(0), class213.field3139.field3686[0], var2, var14.method1467(arg0 ^ -29), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (var4 == 2) {
                class207 var15 = class92.field1475[var5];
                if (var15 != null) {
                    ++class283.field4555;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class151.field2393 = class17.field187;
                    class110.field1840 = 2;
                    class144.field2338.method683(true, 123);
                    class144.field2338.method358(8117, var5);
                    class144.field2338.method385(class128.field2149, 455748840);
                    class144.field2338.method365(class294.field4712, (byte) 59);
                    class144.field2338.method369((byte) -120, class82.field1326[82] ? 1 : 0);
                    class144.field2338.method358(8117, class293.field4653);
                    class52.method314(false, var15.method1467(0), class213.field3139.field3686[0], var2, var15.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -59) {
                class207 var16 = class92.field1475[var5];
                if (var16 != null) {
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class110.field1840 = 2;
                    ++class254.field3828;
                    class144.field2338.method683(true, 4);
                    class144.field2338.method360(!class82.field1326[82] ? 0 : 1, 25759);
                    class144.field2338.method365(var5, (byte) 59);
                    class52.method314(false, var16.method1467(0), class213.field3139.field3686[0], var2, var16.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (var4 == 17) {
                class207 var17 = class92.field1475[var5];
                if (var17 != null) {
                    class11.field131 = class13.field153;
                    class110.field1840 = 2;
                    ++class280.field4509;
                    class151.field2393 = class17.field187;
                    class84.field1329 = 0;
                    class144.field2338.method683(true, 212);
                    class144.field2338.method365(var5, (byte) 59);
                    class144.field2338.method339(class82.field1326[82] ? 1 : 0, -2065);
                    class52.method314(false, var17.method1467(0), class213.field3139.field3686[0], var2, var17.method1467(arg0 ^ -29), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -2) {
                class207 var18 = class92.field1475[var5];
                if (var18 != null) {
                    ++class305.field4928;
                    class110.field1840 = 2;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class151.field2393 = class17.field187;
                    class144.field2338.method683(true, 77);
                    class144.field2338.method328(var5, (byte) 103);
                    class144.field2338.method369((byte) -121, !class82.field1326[82] ? 0 : 1);
                    class52.method314(false, var18.method1467(0), class213.field3139.field3686[0], var2, var18.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -43) {
                class12 var19 = class255.field3856[var5];
                if (var19 != null) {
                    class11.field131 = class13.field153;
                    class151.field2393 = class17.field187;
                    class110.field1840 = 2;
                    ++class277.field4476;
                    class84.field1329 = 0;
                    class144.field2338.method683(true, 155);
                    class144.field2338.method365(var5, (byte) 59);
                    class144.field2338.method383(-109, class82.field1326[82] ? 1 : 0);
                    class144.field2338.method376(class309.field4981, false);
                    class144.field2338.method341(125, class295.field4741);
                    class52.method314(false, var19.method1467(0), class213.field3139.field3686[0], var2, var19.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -8) {
                ++class44.field576;
                class144.field2338.method683(true, 177);
                class144.field2338.method348(var3, (byte) -49);
                class144.field2338.method376(var5, false);
                class144.field2338.method379(class295.field4741, true);
                class144.field2338.method328(var2, (byte) 95);
                class144.field2338.method328(class309.field4981, (byte) 109);
                class213.field3141 = 0;
                class155.field2415 = class144.method1078(var3, 8534);
                class140.field2271 = var2;
            }
            if (~var4 == -17) {
                class151.field2393 = class17.field187;
                class110.field1840 = 2;
                class11.field131 = class13.field153;
                class84.field1329 = 0;
                class144.field2338.method683(true, 28);
                class144.field2338.method358(8117, class149.field2390 + var3);
                ++class76.field1207;
                class144.field2338.method385(class295.field4741, arg0 ^ -455748853);
                class144.field2338.method328(class309.field4981, (byte) 104);
                class144.field2338.method376(var5, false);
                class144.field2338.method328(class163.field2520 + var2, (byte) 114);
                class144.field2338.method369((byte) -126, !class82.field1326[82] ? 0 : 1);
                class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
            }
            if (~var4 == -60) {
                class12 var20 = class255.field3856[var5];
                if (var20 != null) {
                    class110.field1840 = 2;
                    ++class222.field3244;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class151.field2393 = class17.field187;
                    class144.field2338.method683(true, 33);
                    class144.field2338.method358(8117, var5);
                    class144.field2338.method339(!class82.field1326[82] ? 0 : 1, -2065);
                    class52.method314(false, var20.method1467(0), class213.field3139.field3686[0], var2, var20.method1467(arg0 + 29), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -16) {
                class110.field1840 = 2;
                ++class84.field1334;
                class84.field1329 = 0;
                class151.field2393 = class17.field187;
                class11.field131 = class13.field153;
                class144.field2338.method683(true, 89);
                class144.field2338.method376(Integer.MAX_VALUE & (int) (var6 >>> 32), false);
                class144.field2338.method383(arg0 + 17, !class82.field1326[82] ? 0 : 1);
                class144.field2338.method358(8117, var2 - -class163.field2520);
                class144.field2338.method328(class309.field4981, (byte) 103);
                class144.field2338.method376(class149.field2390 + var3, false);
                class144.field2338.method341(arg0 ^ 102, class295.field4741);
                class81.method611(var2, var3, var6, (byte) -4);
            }
            if (var4 == 36) {
                ++class229.field3370;
                class110.field1840 = 2;
                class151.field2393 = class17.field187;
                class11.field131 = class13.field153;
                class84.field1329 = 0;
                class144.field2338.method683(true, 232);
                class144.field2338.method328(class149.field2390 + var3, (byte) 106);
                class144.field2338.method358(8117, var5);
                class144.field2338.method339(class82.field1326[82] ? 1 : 0, -2065);
                class144.field2338.method328(class163.field2520 + var2, (byte) 99);
                class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
            }
            if (var4 == 22) {
                class207 var21 = class92.field1475[var5];
                if (var21 != null) {
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    class110.field1840 = 2;
                    class84.field1329 = 0;
                    class144.field2338.method683(true, 148);
                    ++class165.field2531;
                    class144.field2338.method365(var5, (byte) 59);
                    class144.field2338.method339(class82.field1326[82] ? 1 : 0, -2065);
                    class52.method314(false, var21.method1467(0), class213.field3139.field3686[0], var2, var21.method1467(arg0 ^ -29), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
            }
            if (~var4 == -1008) {
                ++class41.field542;
                class151.field2393 = class17.field187;
                class11.field131 = class13.field153;
                class84.field1329 = 0;
                class110.field1840 = 2;
                class144.field2338.method683(true, 176);
                class144.field2338.method376(var5, false);
            }
            if (~var4 == -49) {
                class263 var22 = class34.method219(var3, 99, var2);
                if (var22 != null) {
                    class308.method2088(-1);
                    class250 var23 = client.method903(var22);
                    class75.method560(var3, var23.method1724((byte) 118), var22.field4205, arg0 ^ 117, var23.field3781, var22.field4137, var2);
                    class165.field2539 = 0;
                    class169.field2567 = class298.method2031(-16872, var22);
                    if (var22.field4167) {
                        class136.field2220 = var22.field4111 + "<col=ffffff>";
                    } else {
                        class136.field2220 = "<col=00ff00>" + var22.field4197 + "<col=ffffff>";
                    }
                    if (class169.field2567 == null) {
                        class169.field2567 = "Null";
                    }
                }
            } else {
                if (var4 == 49) {
                    class207 var24 = class92.field1475[var5];
                    if (var24 != null) {
                        class151.field2393 = class17.field187;
                        class11.field131 = class13.field153;
                        ++class34.field429;
                        class110.field1840 = 2;
                        class84.field1329 = 0;
                        class144.field2338.method683(true, 52);
                        class144.field2338.method376(var5, false);
                        class144.field2338.method360(class82.field1326[82] ? 1 : 0, arg0 + 25788);
                        class52.method314(false, var24.method1467(0), class213.field3139.field3686[0], var2, var24.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                }
                if (~var4 == -5) {
                    class12 var25 = class255.field3856[var5];
                    if (var25 != null) {
                        class151.field2393 = class17.field187;
                        class110.field1840 = 2;
                        class11.field131 = class13.field153;
                        class84.field1329 = 0;
                        ++class133.field2188;
                        class144.field2338.method683(true, 245);
                        class144.field2338.method376(var5, false);
                        class144.field2338.method369((byte) -127, !class82.field1326[82] ? 0 : 1);
                        class52.method314(false, var25.method1467(0), class213.field3139.field3686[0], var2, var25.method1467(arg0 + 29), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                }
                if (~var4 == -19) {
                    class110.field1840 = 2;
                    class151.field2393 = class17.field187;
                    ++class94.field1576;
                    class84.field1329 = 0;
                    class11.field131 = class13.field153;
                    class144.field2338.method683(true, 54);
                    class144.field2338.method360(!class82.field1326[82] ? 0 : 1, arg0 + 25788);
                    class144.field2338.method328(class149.field2390 + var3, (byte) 122);
                    class144.field2338.method376(var5, false);
                    class144.field2338.method376(class163.field2520 + var2, false);
                    class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
                if (var4 == 32) {
                    ++class220.field3211;
                    class144.field2338.method683(true, 103);
                    class144.field2338.method348(var3, (byte) 73);
                    class144.field2338.method328(var2, (byte) 102);
                    class144.field2338.method376(var5, false);
                    class213.field3141 = 0;
                    class155.field2415 = class144.method1078(var3, 8534);
                    class140.field2271 = var2;
                }
                if (~var4 == -21) {
                    class207 var26 = class92.field1475[var5];
                    if (var26 != null) {
                        class11.field131 = class13.field153;
                        class151.field2393 = class17.field187;
                        class110.field1840 = 2;
                        class84.field1329 = 0;
                        class144.field2338.method683(true, 105);
                        class144.field2338.method376(var5, false);
                        class144.field2338.method360(!class82.field1326[82] ? 0 : 1, 25759);
                        class52.method314(false, var26.method1467(0), class213.field3139.field3686[0], var2, var26.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                        ++class309.field4984;
                    }
                }
                if (~var4 == -41) {
                    ++class34.field433;
                    class144.field2338.method683(true, 95);
                    class144.field2338.method376(var5, false);
                    class144.field2338.method341(arg0 + 58, var3);
                    class144.field2338.method358(arg0 + 8146, var2);
                    class213.field3141 = 0;
                    class155.field2415 = class144.method1078(var3, arg0 ^ -8523);
                    class140.field2271 = var2;
                }
                if (~var4 == -30) {
                    ++class16.field171;
                    class144.field2338.method683(true, 145);
                    class144.field2338.method365(var2, (byte) 59);
                    class144.field2338.method341(75, var3);
                    class144.field2338.method365(var5, (byte) 59);
                    class213.field3141 = 0;
                    class155.field2415 = class144.method1078(var3, 8534);
                    class140.field2271 = var2;
                }
                if (~var4 == -1013) {
                    class84.field1329 = 0;
                    class151.field2393 = class17.field187;
                    class110.field1840 = 2;
                    class11.field131 = class13.field153;
                    class12 var27 = class255.field3856[var5];
                    if (var27 != null) {
                        class102 var28 = var27.field137;
                        if (var28.field1752 != null) {
                            var28 = var28.method795(arg0 + 65564);
                        }
                        if (var28 != null) {
                            class144.field2338.method683(true, 65);
                            class144.field2338.method328(var28.field1719, (byte) 108);
                            ++class181.field2725;
                        }
                    }
                }
                if (~var4 == -39) {
                    class110.field1840 = 2;
                    class151.field2393 = class17.field187;
                    ++class167.field2554;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class144.field2338.method683(true, 48);
                    class144.field2338.method376(class163.field2520 + var2, false);
                    class144.field2338.method365(Integer.MAX_VALUE & (int) (var6 >>> 32), (byte) 59);
                    class144.field2338.method369((byte) -122, !class82.field1326[82] ? 0 : 1);
                    class144.field2338.method376(var3 - -class149.field2390, false);
                    class81.method611(var2, var3, var6, (byte) -97);
                }
                if (var4 == 39) {
                    class12 var29 = class255.field3856[var5];
                    if (var29 != null) {
                        class84.field1329 = 0;
                        class151.field2393 = class17.field187;
                        class110.field1840 = 2;
                        class11.field131 = class13.field153;
                        class144.field2338.method683(true, 53);
                        class144.field2338.method358(8117, var5);
                        ++class306.field4943;
                        class144.field2338.method369((byte) -127, class82.field1326[82] ? 1 : 0);
                        class52.method314(false, var29.method1467(0), class213.field3139.field3686[0], var2, var29.method1467(arg0 + 29), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                }
                if (~var4 == -6 && class195.field2880 == null) {
                    class125.method962(var3, -116, var2);
                    class195.field2880 = class34.method219(var3, 85, var2);
                    class63.method476(class195.field2880, 14105);
                }
                if (var4 == 9) {
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    class84.field1329 = 0;
                    class110.field1840 = 2;
                    class144.field2338.method683(true, 8);
                    ++class165.field2532;
                    class144.field2338.method358(arg0 + 8146, var5);
                    class144.field2338.method376(class149.field2390 + var3, false);
                    class144.field2338.method376(class163.field2520 + var2, false);
                    class144.field2338.method339(class82.field1326[82] ? 1 : 0, -2065);
                    class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
                }
                if (var4 == 51 || ~var4 == -1005) {
                    class242.method1654(var5, var2, class221.field3219[arg1], var3, 16730);
                }
                if (var4 == 50) {
                    ++class133.field2186;
                    class144.field2338.method683(true, 81);
                    class144.field2338.method328(var2, (byte) 96);
                    class144.field2338.method358(8117, var5);
                    class144.field2338.method379(var3, true);
                    class213.field3141 = 0;
                    class155.field2415 = class144.method1078(var3, 8534);
                    class140.field2271 = var2;
                }
                if (var4 == 6) {
                    class144.field2338.method683(true, 102);
                    ++class250.field3787;
                    class144.field2338.method385(var3, arg0 ^ -455748853);
                    class144.field2338.method365(var2, (byte) 59);
                    class144.field2338.method376(var5, false);
                    class213.field3141 = 0;
                    class155.field2415 = class144.method1078(var3, 8534);
                    class140.field2271 = var2;
                }
                if (var4 == 35) {
                    class84.field1329 = 0;
                    ++class260.field4023;
                    class151.field2393 = class17.field187;
                    class11.field131 = class13.field153;
                    class110.field1840 = 2;
                    class144.field2338.method683(true, 159);
                    class144.field2338.method358(8117, class163.field2520 + var2);
                    class144.field2338.method376(var3 - -class149.field2390, false);
                    class144.field2338.method360(!class82.field1326[82] ? 0 : 1, 25759);
                    class144.field2338.method358(8117, (int) (var6 >>> 32) & Integer.MAX_VALUE);
                    class81.method611(var2, var3, var6, (byte) -67);
                }
                if (var4 == 21) {
                    class161.method1170((byte) 73);
                }
                if (~var4 == -42) {
                    ++class147.field2366;
                    class144.field2338.method683(true, 124);
                    class144.field2338.method358(8117, var2);
                    class144.field2338.method358(8117, var5);
                    class144.field2338.method379(var3, true);
                    class213.field3141 = 0;
                    class155.field2415 = class144.method1078(var3, 8534);
                    class140.field2271 = var2;
                }
                if (var4 == 28) {
                    class207 var30 = class92.field1475[var5];
                    if (var30 != null) {
                        ++class119.field1926;
                        class151.field2393 = class17.field187;
                        class110.field1840 = 2;
                        class11.field131 = class13.field153;
                        class84.field1329 = 0;
                        class144.field2338.method683(true, 223);
                        class144.field2338.method360(!class82.field1326[82] ? 0 : 1, 25759);
                        class144.field2338.method358(8117, var5);
                        class52.method314(false, var30.method1467(0), class213.field3139.field3686[0], var2, var30.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                }
                if (~var4 == -26) {
                    class12 var31 = class255.field3856[var5];
                    if (var31 != null) {
                        ++class223.field3266;
                        class110.field1840 = 2;
                        class84.field1329 = 0;
                        class151.field2393 = class17.field187;
                        class11.field131 = class13.field153;
                        class144.field2338.method683(true, 12);
                        class144.field2338.method328(var5, (byte) 98);
                        class144.field2338.method360(!class82.field1326[82] ? 0 : 1, arg0 ^ -25732);
                        class52.method314(false, var31.method1467(arg0 + 29), class213.field3139.field3686[0], var2, var31.method1467(0), class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                }
                if (~var4 == -24) {
                    class144.field2338.method683(true, 158);
                    class144.field2338.method385(var3, 455748840);
                    class263 var32 = class144.method1078(var3, 8534);
                    if (var32.field4226 != null && var32.field4226[0][0] == 5) {
                        int var33 = var32.field4226[0][1];
                        class303.field4900[var33] = 1 - class303.field4900[var33];
                        class276.method1918(var33, (byte) -76);
                    }
                    ++class66.field1010;
                }
                if (var4 == 31) {
                    if (~var5 == -1) {
                        class293.field4669 = 1;
                        class259.method1782(class37.field474, var2, var3);
                    } else if (~class228.field3349 < -1 && class82.field1326[82] && class82.field1326[81]) {
                        class212.method1492(class149.field2390 + var3, class37.field474, arg0 ^ -16943, class163.field2520 + var2);
                    } else {
                        ++class31.field346;
                        class144.field2338.method683(true, 85);
                        class144.field2338.method358(8117, class163.field2520 + var2);
                        class144.field2338.method328(class149.field2390 + var3, (byte) 97);
                    }
                }
                if (~var4 == -58) {
                    class308.method2088(-1);
                    class263 var34 = class144.method1078(var3, 8534);
                    class128.field2149 = var3;
                    class165.field2539 = 1;
                    class294.field4712 = var2;
                    class293.field4653 = var5;
                    class63.method476(var34, 14105);
                    class221.field3221 = "<col=ff9040>" + class12.method88(var5, 27838).field349 + "<col=ffffff>";
                    if (class221.field3221 == null) {
                        class221.field3221 = "null";
                    }
                } else {
                    if (var4 == 1009) {
                        ++class268.field4301;
                        class84.field1329 = 0;
                        class151.field2393 = class17.field187;
                        class11.field131 = class13.field153;
                        class110.field1840 = 2;
                        class144.field2338.method683(true, 72);
                        class144.field2338.method376(var5, false);
                    }
                    if (~var4 == -25) {
                        class144.field2338.method683(true, 58);
                        class144.field2338.method376(var5, false);
                        ++class187.field2789;
                        class144.field2338.method341(-118, var3);
                        class144.field2338.method376(class294.field4712, false);
                        class144.field2338.method376(var2, false);
                        class144.field2338.method365(class293.field4653, (byte) 59);
                        class144.field2338.method341(arg0 + 153, class128.field2149);
                        class213.field3141 = 0;
                        class155.field2415 = class144.method1078(var3, 8534);
                        class140.field2271 = var2;
                    }
                    if (var4 == 3) {
                        class144.field2338.method683(true, 205);
                        ++class89.field1435;
                        class144.field2338.method348(var3, (byte) -34);
                        class144.field2338.method328(var2, (byte) 113);
                        class144.field2338.method365(var5, (byte) 59);
                        class213.field3141 = 0;
                        class155.field2415 = class144.method1078(var3, 8534);
                        class140.field2271 = var2;
                    }
                    if (~var4 == -15) {
                        class151.field2393 = class17.field187;
                        class110.field1840 = 2;
                        class84.field1329 = 0;
                        class11.field131 = class13.field153;
                        ++class166.field2550;
                        class144.field2338.method683(true, 227);
                        class144.field2338.method376(class163.field2520 + var2, false);
                        class144.field2338.method360(class82.field1326[82] ? 1 : 0, arg0 ^ -25732);
                        class144.field2338.method376(class149.field2390 + var3, false);
                        class144.field2338.method358(8117, var5);
                        class52.method314(false, 0, class213.field3139.field3686[0], var2, 0, class213.field3139.field3761[0], 0, true, 0, var3, 0);
                    }
                    if (~var4 == -46) {
                        if (~var5 == -1) {
                            class267.field4277 = 1;
                            class259.method1782(class37.field474, var2, var3);
                        } else if (~var5 == -2) {
                            class144.field2338.method683(true, 204);
                            class144.field2338.method365(class149.field2390 + var3, (byte) 59);
                            ++class214.field3147;
                            class144.field2338.method365(class309.field4981, (byte) 59);
                            class144.field2338.method341(-121, class295.field4741);
                            class144.field2338.method328(class163.field2520 + var2, (byte) 87);
                        }
                    }
                    if (~var4 == -9) {
                        ++class66.field1010;
                        class144.field2338.method683(true, 158);
                        class144.field2338.method385(var3, arg0 ^ -455748853);
                        class263 var35 = class144.method1078(var3, 8534);
                        if (var35.field4226 != null && var35.field4226[0][0] == 5) {
                            int var36 = var35.field4226[0][1];
                            if (class303.field4900[var36] != var35.field4151[0]) {
                                class303.field4900[var36] = var35.field4151[0];
                                class276.method1918(var36, (byte) -94);
                            }
                        }
                    }
                    if (var4 == 33) {
                        ++class56.field822;
                        class144.field2338.method683(true, 214);
                        class144.field2338.method358(8117, var2);
                        class144.field2338.method365(var5, (byte) 59);
                        class144.field2338.method385(var3, 455748840);
                        class213.field3141 = 0;
                        class155.field2415 = class144.method1078(var3, arg0 + 8563);
                        class140.field2271 = var2;
                    }
                    if (var4 == 34) {
                        ++class142.field2294;
                        class144.field2338.method683(true, 88);
                        class144.field2338.method358(8117, var5);
                        class144.field2338.method348(var3, (byte) -50);
                        class144.field2338.method358(8117, var2);
                        class213.field3141 = 0;
                        class155.field2415 = class144.method1078(var3, 8534);
                        class140.field2271 = var2;
                    }
                    if (class165.field2539 != 0) {
                        class165.field2539 = 0;
                        class63.method476(class144.method1078(class128.field2149, 8534), 14105);
                    }
                    if (class6.field57) {
                        class308.method2088(-1);
                    }
                    if (class155.field2415 != null && ~class213.field3141 == -1) {
                        class63.method476(class155.field2415, arg0 + 14134);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class7() {
        super(0, true);
    }
}
