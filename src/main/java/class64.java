import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class64 extends class251 {

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "Lsk;")
    public static class423 field1055 = new class423("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "[I")
    public static int[] field1060 = new int[1000];

    @OriginalMember(owner = "client!jt", name = "E", descriptor = "Lft;")
    public static class4 field1062 = new class4();

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "Lcm;")
    public static class491 field1064 = new class491("stellardawn", 1);

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "I")
    public int field1059;

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field1063;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field1065;

    // $FF: synthetic field
    @OriginalMember(owner = "client!jt", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field1066;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "Ljava/lang/String;")
    public String field1057;

    @OriginalMember(owner = "client!jt", name = "D", descriptor = "[[[B")
    public static byte[][][] field1061;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "(I)V")
    public static void method440(int arg0) {
        field1064 = null;
        field1062 = null;
        field1060 = null;
        field1061 = null;
        field1055 = null;
        if (arg0 != 4) {
            field1060 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(B)V")
    public final void method441(byte arg0) {
        ++field1056;
        if (arg0 == 58) {
            super.field3839 |= Long.MIN_VALUE;
            if (~this.method444(arg0 + 69) == -1L) {
                class268.field4040.method2256(this, 30978);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "(B)I")
    public final int method442(byte arg0) {
        int var2 = -65 % ((arg0 - -49) / 40);
        ++field1058;
        return (int) super.field2798;
    }

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)I")
    public final int method443(int arg0) {
        if (arg0 != 255) {
            this.field1054 = -67;
        }
        ++field1052;
        return (int) (255L & super.field2798 >>> 32);
    }

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "(I)J")
    public final long method444(int arg0) {
        if (arg0 < 125) {
            method445(-74, 72, (class318) null);
        }
        ++field1065;
        return super.field3839 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "(II)V")
    public class64(int arg0, int arg1) {
        super.field2798 = (long) arg1 | (long) arg0 << 32;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IILqq;)Z")
    public static final boolean method445(int arg0, int arg1, class318 arg2) {
        ++field1063;
        int var3 = (class150.field2422 + -104) / 2;
        int var4 = (class21.field272 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; var6 < var3 + 104; ++var6) {
            for (int var51 = var4; var4 + 104 > var51; ++var51) {
                for (int var52 = arg0; ~var52 >= -4; ++var52) {
                    if (class29.method153(var6, var51, var52, (byte) -124, arg0)) {
                        int var53 = var52;
                        if (class426.method2502(var6, var51, (byte) -72)) {
                            var53 = var52 - 1;
                        }
                        if (~var53 <= -1) {
                            var5 &= class112.method806(var53, arg1 + -2939, var6, var51);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var7.length > var8; ++var8) {
                var7[var8] = -16777216;
            }
            class23.field293 = arg2.method1924(var7, 0, 512, 512, 512);
            class4.method16((byte) 49);
            int var9 = -16777216 | 238 - (-((int) (20.0D * Math.random())) + 10 - ((-10 + (int) (Math.random() * 20.0D) + 238 << 16) - -(-10 + 238 + (int) (Math.random() * 20.0D) << 8)));
            int var10 = 228 + (int) (Math.random() * 20.0D) << 16 | -16777216;
            int var11 = (int) (Math.random() * 8.0D) | (int) (8.0D * Math.random()) << 16 | (int) (Math.random() * 8.0D) << 8;
            boolean[][] var12 = new boolean[class148.field2390][class148.field2390];
            int var13 = var3;
            if (arg1 != 2943) {
                method445(-3, 112, (class318) null);
            }
            while (var3 - -104 > var13) {
                for (int var36 = var4; ~(var4 + 104) < ~var36; var36 += class148.field2390) {
                    arg2.method1982(0, 0, class148.field2390 * 4, class148.field2390 * 4);
                    arg2.method1965(-16777216);
                    for (int var37 = arg0; var37 <= 3; ++var37) {
                        for (int var44 = 0; class148.field2390 > var44; ++var44) {
                            for (int var50 = 0; ~class148.field2390 < ~var50; ++var50) {
                                var12[var44][var50] = class29.method153(var13 + var44, var36 + var50, var37, (byte) 40, arg0);
                            }
                        }
                        class201.field3195[var37].method303(0, 0, 1024, var13, var36, class148.field2390 + var13, var36 - -class148.field2390, var12);
                        if (!class106.field1861) {
                            for (int var45 = -4; var45 < class148.field2390; ++var45) {
                                for (int var46 = -4; class148.field2390 > var46; ++var46) {
                                    int var47 = var13 + var45;
                                    int var48 = var36 + var46;
                                    if (var3 <= var47 && ~var4 >= ~var48 && class29.method153(var47, var48, var37, (byte) 108, arg0)) {
                                        int var49 = var37;
                                        if (class426.method2502(var47, var48, (byte) -120)) {
                                            var49 = var37 - 1;
                                        }
                                        if (~var49 <= -1) {
                                            class360.method2193(var48, var45 * 4, arg1 + -2835, arg2, var49, var47, var9, var10, (-var46 + class148.field2390) * 4 + -4);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class106.field1861) {
                        class367 var38 = class91.field1641[arg0];
                        for (int var39 = 0; var39 < class148.field2390; ++var39) {
                            for (int var40 = 0; ~class148.field2390 < ~var40; ++var40) {
                                int var41 = var13 + var39;
                                int var42 = var36 + var40;
                                int var43 = var38.field5398[-var38.field5389 + var41][-var38.field5384 + var42];
                                if ((var43 & 1076101120) == 0) {
                                    if (~(var43 & 8388608) == -1) {
                                        if ((var43 & 33554432) != 0) {
                                            arg2.method1946(var39 * 4 - -3, (-var40 + class148.field2390) * 4 + -4, -1713569622, arg1 + -2824, 4);
                                        } else if ((134217728 & var43) != 0) {
                                            arg2.method1889((-var40 + class148.field2390) * 4 + -4 - -3, -1713569622, -34, 4, var39 * 4);
                                        } else if ((536870912 & var43) != 0) {
                                            arg2.method1946(var39 * 4, (-var40 + class148.field2390) * 4 + -4, -1713569622, 126, 4);
                                        }
                                    } else {
                                        arg2.method1889((-var40 + class148.field2390) * 4 - 4, -1713569622, arg1 ^ -2849, 4, var39 * 4);
                                    }
                                } else {
                                    arg2.method1943(var39 * 4, -1713569622, (-var40 + class148.field2390) * 4 + -4, 4, 1, 4);
                                }
                            }
                        }
                    }
                    arg2.method1971(0, 0, class148.field2390 * 4, class148.field2390 * 4, var11, 2);
                    class23.field293.method576(48 - -((-var3 + var13) * 4), -(class148.field2390 * 4) + 464 + -((var36 - var4) * 4), class148.field2390 * 4, class148.field2390 * 4, 0, 0);
                }
                var13 += class148.field2390;
            }
            arg2.method1966();
            arg2.method1965(-16777215);
            class119.method831(0);
            class24.field315 = 0;
            field1062.method13(false);
            if (!class106.field1861) {
                for (int var14 = var3; var14 < var3 - -104; ++var14) {
                    for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                        for (int var21 = arg0; ~var21 >= ~(arg0 + 1) && ~var21 >= -4; ++var21) {
                            if (class29.method153(var14, var20, var21, (byte) 87, arg0)) {
                                class185 var22 = (class185) class368.method2232(var21, var14, var20);
                                if (var22 == null) {
                                    var22 = (class185) class86.method607(var21, var14, var20, field1066 != null ? field1066 : (field1066 = method447("tf")));
                                }
                                if (var22 == null) {
                                    var22 = (class185) class307.method1842(var21, var14, var20);
                                }
                                if (var22 == null) {
                                    var22 = (class185) class98.method741(var21, var14, var20);
                                }
                                if (var22 != null) {
                                    class56 var23 = class128.field2070.method916((byte) -15, var22.method174((byte) 119));
                                    if (!var23.field948 || class73.field1313) {
                                        int var24 = var23.field965;
                                        if (var23.field892 != null) {
                                            for (int var25 = 0; ~var23.field892.length < ~var25; ++var25) {
                                                if (~var23.field892[var25] != 0) {
                                                    class56 var26 = class128.field2070.method916((byte) -15, var23.field892[var25]);
                                                    if (~var26.field965 <= -1) {
                                                        var24 = var26.field965;
                                                    }
                                                }
                                            }
                                        }
                                        if (var24 >= 0) {
                                            boolean var27 = false;
                                            if (~var24 <= -1) {
                                                class173 var28 = class22.field281.method1840((byte) 85, var24);
                                                if (var28 != null && var28.field2699) {
                                                    var27 = true;
                                                }
                                            }
                                            int var29 = var14;
                                            int var30 = var20;
                                            if (var27) {
                                                int[][] var31 = class91.field1641[var21].field5398;
                                                int var32 = class91.field1641[var21].field5389;
                                                int var33 = class91.field1641[var21].field5384;
                                                for (int var34 = 0; ~var34 > -11; ++var34) {
                                                    int var35 = (int) (Math.random() * 4.0D);
                                                    if (var35 == 0 && ~var3 > ~var29 && var29 > var14 + -3 && ~(2883848 & var31[-var32 + var29 + -1][-var33 + var30]) == -1) {
                                                        --var29;
                                                    }
                                                    if (~var35 == -2 && ~(var3 + 104 + -1) < ~var29 && var14 + 3 > var29 && (var31[var29 + 1 + -var32][-var33 + var30] & 2883968) == 0) {
                                                        ++var29;
                                                    }
                                                    if (var35 == 2 && ~var30 < ~var4 && ~var30 < ~(var20 + -3) && (2883842 & var31[-var32 + var29][var30 + -1 + -var33]) == 0) {
                                                        --var30;
                                                    }
                                                    if (~var35 == -4 && ~(var4 + 104 + -1) < ~var30 && var20 + 3 > var30 && (2883872 & var31[var29 - var32][var30 + 1 + -var33]) == 0) {
                                                        ++var30;
                                                    }
                                                }
                                            }
                                            class193.field3049[class24.field315] = var23.field958;
                                            class128.field2068[class24.field315] = var29;
                                            field1060[class24.field315] = var30;
                                            ++class24.field315;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                if (class383.field5575 != null) {
                    class207.field3242.field7042 = 1;
                    class22.field281.method1848(64, -44, 1024);
                    for (int var15 = 0; ~var15 > ~class383.field5575.field3505; ++var15) {
                        int var16 = class383.field5575.field3503[var15];
                        if (var16 >> 28 == class286.field4329.field3217) {
                            int var17 = ((268419450 & var16) >> 14) - class381.field5550;
                            int var18 = (var16 & 16383) - class320.field4827;
                            if (~var17 <= -1 && class150.field2422 > var17 && ~var18 <= -1 && var18 < class21.field272) {
                                field1062.method4(1, new class361(var15));
                            } else {
                                class173 var19 = class22.field281.method1840((byte) 28, class383.field5575.field3506[var15]);
                                if (var19.field2670 != null && ~(var19.field2675 + var17) <= -1 && var19.field2667 + var17 < class150.field2422 && var19.field2697 + var18 >= 0 && ~class21.field272 < ~(var19.field2679 + var18)) {
                                    field1062.method4(arg1 ^ 2942, new class361(var15));
                                }
                            }
                        }
                    }
                    class22.field281.method1848(64, -109, 128);
                    class207.field3242.field7042 = 2;
                    class207.field3242.method2732((byte) 27);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jt", name = "i", descriptor = "(I)V")
    public final void method446(int arg0) {
        super.field3839 = class344.method2111((byte) -93) - -500L | super.field3839 & Long.MIN_VALUE;
        ++field1053;
        if (arg0 == -20033) {
            class16.field224.method2256(this, arg0 + 51011);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method447(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
