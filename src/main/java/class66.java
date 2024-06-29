import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class66 extends class12 {

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    private int field1255 = 0;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    private int field1261 = 0;

    @OriginalMember(owner = "client!gg", name = "cb", descriptor = "I")
    private int field1266 = 16;

    @OriginalMember(owner = "client!gg", name = "Z", descriptor = "I")
    private int field1263 = 4096;

    @OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
    private int field1269 = 2000;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "Ltg;")
    public static class184 field1253 = class135.method812("Begeben Sie sich in ein freies Gebiet)1 um", 3);

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "Ltg;")
    public static class184 field1257 = class135.method812("weiss:", 3);

    @OriginalMember(owner = "client!gg", name = "bb", descriptor = "Ltg;")
    public static class184 field1265 = class135.method812("VOLL", 3);

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "Lnh;")
    public static class131 field1262 = new class131();

    @OriginalMember(owner = "client!gg", name = "hb", descriptor = "Ltg;")
    private static class184 field1271 = class135.method812("Too many connections from your address)3", 3);

    @OriginalMember(owner = "client!gg", name = "gb", descriptor = "Ltg;")
    public static class184 field1270 = field1271;

    @OriginalMember(owner = "client!gg", name = "ib", descriptor = "Ltg;")
    public static class184 field1272 = class135.method812("und haben es deaktiviert)3 Klicken Sie auf der", 3);

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!gg", name = "ab", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!gg", name = "db", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!gg", name = "eb", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!gg", name = "jb", descriptor = "J")
    public static long field1273;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (arg0 != 57) {
            this.field1269 = 55;
        }
        ++field1267;
        class90.method527((byte) 28);
    }

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
    public static final void method385(int arg0) {
        if (arg0 > -60) {
            method391(-114, (Component) null);
        }
        ++field1259;
        try {
            if (~class101.field1875 == -2) {
                int var1 = class130.field2362.method480(-21159);
                if (~var1 < -1 && class130.field2362.method493((byte) 45)) {
                    int var2 = var1 - class113.field2045;
                    if (~var2 > -1) {
                        var2 = 0;
                    }
                    class130.field2362.method484(-157, var2);
                } else {
                    class130.field2362.method486(true);
                    class130.field2362.method473(-88);
                    if (class122.field2177 == null) {
                        class101.field1875 = 0;
                    } else {
                        class101.field1875 = 2;
                    }
                    class21.field406 = null;
                    class88.field1654 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class130.field2362.method486(true);
            class122.field2177 = null;
            class21.field406 = null;
            class101.field1875 = 0;
            class88.field1654 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(JB)V")
    public static final void method386(long arg0, byte arg1) {
        ++field1256;
        if (arg0 != 0L) {
            if ((~class64.field1212 > -101 || ~class151.field2706 == -2) && class64.field1212 < 200) {
                class184 var3 = class119.method719(arg0, 37).method1147(true);
                for (int var4 = 0; ~class64.field1212 < ~var4; ++var4) {
                    if (~class136.field2481[var4] == ~arg0) {
                        class149.method914(0, class144.method884(0, new class184[] { var3, class118.field2134 }), class170.field3242, 61);
                        return;
                    }
                }
                for (int var5 = 0; var5 < class9.field170; ++var5) {
                    if (~class103.field1878[var5] == ~arg0) {
                        class149.method914(0, class144.method884(0, new class184[] { class204.field3919, var3, class8.field141 }), class170.field3242, 106);
                        return;
                    }
                }
                if (var3.method1139(class46.field872.field1299, (byte) -77)) {
                    class149.method914(0, class45.field852, class170.field3242, 47);
                } else {
                    class202.field3895[class64.field1212] = var3;
                    class136.field2481[class64.field1212] = arg0;
                    class204.field3931[class64.field1212] = 0;
                    class126.field2271[class64.field1212] = 0;
                    class158.field2825 = class136.field2471;
                    ++class64.field1212;
                    ++class24.field441;
                    class117.field2122.method106(137, -121);
                    class117.field2122.method607(arg0, 82);
                    if (arg1 <= 121) {
                        field1257 = null;
                    }
                }
            } else {
                class149.method914(0, class64.field1223, class170.field3242, -120);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(III)V")
    public static final void method387(int arg0, int arg1, int arg2) {
        ++field1252;
        if (arg2 == -21040) {
            if (~class133.field2404 <= -3 || class187.field3610 != 0 || class209.field4013) {
                class184 var3;
                if (~class187.field3610 == -2 && ~class133.field2404 > -3) {
                    var3 = class144.method884(0, new class184[] { class7.field127, class78.field1417, class150.field2689, class168.field3159 });
                } else if (class209.field4013 && class133.field2404 < 2) {
                    var3 = class144.method884(arg2 + 21040, new class184[] { class14.field270, class78.field1417, class84.field1553, class168.field3159 });
                } else {
                    var3 = class210.method1333(false, class133.field2404 - 1);
                }
                if (~class133.field2404 < -3) {
                    var3 = class144.method884(0, new class184[] { var3, class128.field2317, class170.method1060(class133.field2404 + -2, -109), class15.field295 });
                }
                int var4 = class125.field2261.method1359(var3, arg1 - -4, arg0 + 15, 16777215, 0, class155.field2781, class36.field672);
                class74.method439(31094, 15, arg0, var4 + class125.field2261.method1353(var3), arg1 + 4);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([Lrh;II)V")
    public static final void method388(class167[] arg0, int arg1, int arg2) {
        int var3 = 0;
        if (arg1 != -2) {
            method389((byte) -17);
        }
        while (~arg0.length < ~var3) {
            class167 var4 = arg0[var3];
            if (var4 != null && var4.field3001 == arg2 && (!var4.field3106 || !class173.method1071(arg1 + 2, var4))) {
                label99: {
                    if (~var4.field3061 == -1) {
                        if (!var4.field3106 && class173.method1071(0, var4) && class68.field1305 != var4) {
                            break label99;
                        }
                        method388(arg0, -2, var4.field3069);
                        if (var4.field3097 != null) {
                            method388(var4.field3097, arg1, var4.field3069);
                        }
                        class7 var5 = (class7) class134.field2436.method51((long) var4.field3069, 127);
                        if (var5 != null) {
                            class168.method1047(var5.field119, true);
                        }
                    }
                    if (~var4.field3061 == -7) {
                        if (var4.field3035 != -1 || var4.field3041 != -1) {
                            boolean var6 = class51.method281(var4, -115);
                            int var7;
                            if (var6) {
                                var7 = var4.field3041;
                            } else {
                                var7 = var4.field3035;
                            }
                            if (~var7 != 0) {
                                class188 var8 = class83.method465(var7, arg1 ^ 1);
                                var4.field3092 += class170.field3231;
                                while (var8.field3638[var4.field3043] < var4.field3092) {
                                    var4.field3092 -= var8.field3638[var4.field3043];
                                    ++var4.field3043;
                                    if (var8.field3645.length <= var4.field3043) {
                                        var4.field3043 -= var8.field3627;
                                        if (var4.field3043 < 0 || var8.field3645.length <= var4.field3043) {
                                            var4.field3043 = 0;
                                        }
                                    }
                                    class57.method305(-112, var4);
                                }
                            }
                        }
                        if (var4.field3016 != 0 && !var4.field3106) {
                            int var9 = var4.field3016 >> 16;
                            int var10 = var4.field3016 << 16 >> 16;
                            int var11 = class170.field3231 * var10;
                            int var12 = class170.field3231 * var9;
                            var4.field3039 = 2047 & var4.field3039 + var12;
                            var4.field3033 = var4.field3033 + var11 & 2047;
                            class57.method305(-113, var4);
                        }
                    }
                }
            }
            ++var3;
        }
        ++field1254;
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "(B)V")
    public static void method389(byte arg0) {
        field1253 = null;
        field1272 = null;
        field1265 = null;
        field1271 = null;
        field1257 = null;
        field1262 = null;
        field1270 = null;
        int var1 = -29 % ((39 - arg0) / 57);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        ++field1268;
        int[] var3 = super.field224.method7((byte) 117, arg0);
        if (arg1 != 17) {
            field1273 = -8L;
        }
        if (super.field224.field53) {
            int var4 = this.field1263 >> 1;
            int[][] var5 = super.field224.method6(11083);
            Random var6 = new Random((long) this.field1261);
            for (int var7 = 0; var7 < this.field1269; ++var7) {
                int var8 = this.field1263 <= 0 ? this.field1255 : -var4 + this.field1255 + class116.method712(this.field1263, false, var6);
                int var9 = class116.method712(class201.field3889, false, var6);
                int var10 = var8 >> 4 & 255;
                int var11 = class116.method712(class114.field2074, false, var6);
                int var12 = (class67.field1304[var10] * this.field1266 >> 12) + var9;
                int var13 = (class136.field2474[var10] * this.field1266 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var9 + var12;
                if (~var15 != -1 || var14 != 0) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var14 < ~var15;
                    if (var16) {
                        int var17 = var9;
                        int var18 = var12;
                        var9 = var11;
                        var12 = var13;
                        var13 = var18;
                        var11 = var17;
                    }
                    if (~var9 < ~var12) {
                        int var19 = var9;
                        var9 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var9 + var12;
                    int var23 = -var22 / 2;
                    int var24 = 1024 + -(class116.method712(4096, false, var6) >> 2);
                    int var25 = -var11 + var13;
                    int var26 = var11 >= var13 ? -1 : 1;
                    int var27 = 2048 / var22;
                    if (var25 < 0) {
                        var25 = -var25;
                    }
                    for (int var28 = var9; var28 < var12; ++var28) {
                        var23 += var25;
                        int var29 = var28 & class51.field937;
                        int var30 = var24 + 1024 - -((-var9 + var28) * var27);
                        int var31 = class173.field3274 & var21;
                        if (!var16) {
                            var5[var29][var31] = var30;
                        } else {
                            var5[var31][var29] = var30;
                        }
                        if (~var23 < -1) {
                            var21 += var26;
                            var23 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lka;IZ)V")
    public final void method59(class97 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 == -5) {
                            this.field1263 = arg0.method611(false);
                        }
                    } else {
                        this.field1255 = arg0.method611(arg2);
                    }
                } else {
                    this.field1266 = arg0.method588((byte) -72);
                }
            } else {
                this.field1269 = arg0.method611(false);
            }
        } else {
            this.field1261 = arg0.method588((byte) -71);
        }
        if (arg2) {
            this.field1266 = 56;
        }
        ++field1264;
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V")
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILtg;)Z")
    public static final boolean method390(int arg0, class184 arg1) {
        ++field1258;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = arg0; class9.field170 > var2; ++var2) {
                if (arg1.method1150(class118.field2129[var2], -104)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public static final void method391(int arg0, Component arg1) {
        Method var2 = class147.field2645;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class46.field866);
        arg1.addFocusListener(class46.field866);
        if (arg0 >= -32) {
            method385(-42);
        }
        ++field1251;
    }
}
