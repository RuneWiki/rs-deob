import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class104 extends class243 {

    @OriginalMember(owner = "client!gf", name = "Y", descriptor = "I")
    public static int field1813 = -16 + (int) (33.0D * Math.random());

    @OriginalMember(owner = "client!gf", name = "Z", descriptor = "Lub;")
    public static class227 field1814 = class257.method1749(":duelstake:", 17263);

    @OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!gf", name = "eb", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!gf", name = "fb", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!gf", name = "hb", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!gf", name = "ib", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field1819;
        int[] var3 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var4 = class148.field2582[arg1];
            for (int var5 = 0; ~var5 > ~class212.field3586; ++var5) {
                var3[var5] = this.method637((byte) -98, var4, class212.field3585[var5]) % 4096;
            }
        }
        int var6 = 2 / ((arg0 - -15) / 51);
        return var3;
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIII)V")
    public static final void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1815;
        if (~arg3 == ~arg4) {
            class214.method1359((byte) 71, arg4, arg5, arg0, arg2);
        } else if (arg1 == 0) {
            if (class125.field2234 <= -arg4 + arg5 && ~class19.field331 <= ~(arg5 - -arg4) && -arg3 + arg2 >= class161.field2718 && arg2 + arg3 <= class46.field817) {
                class46.method256(arg3, arg2, arg5, (byte) 127, arg4, arg0);
            } else {
                class229.method1546(arg4, arg2, arg3, arg0, arg5, 103);
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "g", descriptor = "(I)V")
    public static final void method634(int arg0) {
        if (arg0 > 55) {
            class5.field115.method1723(-4173);
            ++field1817;
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IILpd;IILpd;Lta;I)V")
    public static final void method635(int arg0, int arg1, class196 arg2, int arg3, int arg4, class196 arg5, class105 arg6, int arg7) {
        class221.field3755 = arg6;
        class25.field425 = arg4;
        class186.field3158 = arg3;
        ++field1823;
        class51.field890 = arg7;
        class50.field884 = arg0;
        if (arg1 != 10301) {
            field1822 = 20;
        }
        if (class116.field2129 == null) {
            class153.field2662 = true;
            if (class29.field473 == null) {
                class29.field473 = class72.method434(45, class32.field517, 0, class94.field1639);
            }
            if (class2.field31 == null) {
                class2.field31 = class212.method1348(class252.field4368, class94.field1639, 0, arg1 + -10294);
            }
            if (class245.field4272 == null) {
                class245.field4272 = class212.method1348(class212.field3576, class94.field1639, 0, arg1 + -10294);
            }
            if (class186.field3173 == null) {
                class186.field3173 = class212.method1348(class179.field3082, class94.field1639, 0, 7);
            }
            int var8 = class25.field425 / 5;
            int var9 = class25.field425 / 5 * 4;
            class111.method692(class51.field890, class50.field884, class25.field425, class186.field3158, 0, 168);
            class111.method702(class51.field890, class50.field884, var8, 23, 12425273, 9135624);
            class111.method702(class51.field890 + var8, class50.field884, var9, 23, 5197647, 2697513);
            arg5.method1243(class186.field3167, var8 / 2 + class51.field890, class50.field884 - -15, 0, -1);
            if (class186.field3173 != null) {
                class186.field3173[1].method258(var8 + 2 + class51.field890, class50.field884 + 1);
                arg2.method1262(class169.field2833, var8 + 12 + class51.field890, class50.field884 - -10, 16777215, -1);
                class186.field3173[0].method258(class51.field890 + 2 - -var8, class50.field884 - -12);
                arg2.method1262(class70.field1229, class51.field890 - -var8 - -12, class50.field884 + 21, 16777215, -1);
            }
            if (class245.field4272 != null) {
                int var10 = class51.field890 + var8 + 140;
                if (~class32.field525[0] == -1 && class168.field2808[0] == 0) {
                    class245.field4272[2].method258(var10, class50.field884 + 4);
                } else {
                    class245.field4272[0].method258(var10, class50.field884 - -4);
                }
                if (~class32.field525[0] == -1 && ~class168.field2808[0] == -2) {
                    class245.field4272[3].method258(var10 + 15, class50.field884 + 4);
                } else {
                    class245.field4272[1].method258(var10 + 15, class50.field884 + 4);
                }
                arg5.method1262(class213.field3599, var10 + 32, class50.field884 + 17, 16777215, -1);
                int var11 = class51.field890 - -250 + var8;
                if (~class32.field525[0] == -2 && class168.field2808[0] == 0) {
                    class245.field4272[2].method258(var11, class50.field884 - -4);
                } else {
                    class245.field4272[0].method258(var11, class50.field884 + 4);
                }
                if (class32.field525[0] == 1 && ~class168.field2808[0] == -2) {
                    class245.field4272[3].method258(var11 + 15, class50.field884 + 4);
                } else {
                    class245.field4272[1].method258(var11 - -15, class50.field884 + 4);
                }
                arg5.method1262(class70.field1233, var11 - -32, class50.field884 - -17, 16777215, -1);
                int var12 = class51.field890 + var8 + 360;
                if (~class32.field525[0] == -3 && class168.field2808[0] == 0) {
                    class245.field4272[2].method258(var12, class50.field884 + 4);
                } else {
                    class245.field4272[0].method258(var12, class50.field884 + 4);
                }
                if (~class32.field525[0] == -3 && ~class168.field2808[0] == -2) {
                    class245.field4272[3].method258(var12 + 15, class50.field884 + 4);
                } else {
                    class245.field4272[1].method258(var12 + 15, class50.field884 + 4);
                }
                arg5.method1262(class191.field3253, var12 + 32, class50.field884 + 17, 16777215, -1);
                int var13 = var8 + 470 + class51.field890;
                if (class32.field525[0] == 3 && class168.field2808[0] == 0) {
                    class245.field4272[2].method258(var13, class50.field884 - -4);
                } else {
                    class245.field4272[0].method258(var13, class50.field884 + 4);
                }
                if (~class32.field525[0] == -4 && ~class168.field2808[0] == -2) {
                    class245.field4272[3].method258(var13 + 15, class50.field884 + 4);
                } else {
                    class245.field4272[1].method258(var13 + 15, class50.field884 + 4);
                }
                arg5.method1262(class225.field3834, var13 + 32, class50.field884 + 17, 16777215, -1);
            }
            class111.method694(class25.field425 + -68, class50.field884 + 4, 58, 16, 0);
            class218.field3671 = -1;
            if (class29.field473 != null) {
                byte var14 = 88;
                byte var15 = 19;
                int var16 = class25.field425 / (var14 + 1);
                int var17 = (class186.field3158 + -23) / (var15 + 1);
                int var18;
                int var19;
                do {
                    var18 = var17;
                    var19 = var16;
                    if (class242.field4202 <= (var16 + -1) * var17) {
                        --var16;
                    }
                    if (~((var17 + -1) * var16) <= ~class242.field4202) {
                        --var17;
                    }
                    if (~class242.field4202 >= ~((var17 + -1) * var16)) {
                        --var17;
                    }
                } while (var17 != var18 || ~var16 != ~var19);
                int var20 = (class186.field3158 + -23 + -(var15 * var17)) / (var17 + 1);
                if (~var20 < -6) {
                    var20 = 5;
                }
                int var21 = (-(var14 * var16) + class25.field425) / (var16 + 1);
                if (var21 > 5) {
                    var21 = 5;
                }
                int var22 = (-(var14 * var16) + class25.field425 + -((var16 + -1) * var21)) / 2;
                int var23 = (-((var17 + -1) * var20) + class186.field3158 - (23 - -(var15 * var17))) / 2;
                int var24 = var22;
                int var25 = var23 + 23;
                int var26 = 0;
                for (int var27 = 0; var27 < class242.field4202; ++var27) {
                    class139 var28 = class182.field3104[var27];
                    boolean var29 = true;
                    class227 var30 = class204.method1303(var28.field2410, 1);
                    if (~var28.field2410 == 0) {
                        var29 = false;
                        var30 = class203.field3464;
                    } else if (~var28.field2410 < -1981) {
                        var30 = class18.field314;
                        var29 = false;
                    }
                    if (class100.field1752 >= var24 && client.field1451 >= var25 && ~class100.field1752 > ~(var14 + var24) && ~(var15 + var25) < ~client.field1451 && var29) {
                        class218.field3671 = var27;
                        class29.field473[var28.field2408 ? 1 : 0].method1004(class51.field890 + var24, class50.field884 + var25, 128, 16777215);
                    } else {
                        class29.field473[!var28.field2408 ? 0 : 1].method787(class51.field890 + var24, class50.field884 - -var25);
                    }
                    if (class2.field31 != null) {
                        class2.field31[var28.field2414 + (!var28.field2408 ? 0 : 8)].method258(var24 + 29 + class51.field890, class50.field884 + var25);
                    }
                    arg5.method1243(class204.method1303(var28.field2409, 1), class51.field890 + var24 + 15, var15 / 2 + class50.field884 + var25 + 5, 0, -1);
                    arg2.method1243(var30, class51.field890 + var24 + 60, var15 / 2 + var25 + class50.field884 + 5, 268435455, -1);
                    var25 += var20 - -var15;
                    ++var26;
                    if (~var26 <= ~var17) {
                        var24 += var14 + var21;
                        var26 = 0;
                        var25 = var23 + 23;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIIILta;B)V")
    public static final void method636(int arg0, int arg1, int arg2, int arg3, int arg4, class105 arg5, byte arg6) {
        ++field1821;
        int var7 = arg0 * arg0 + arg2 * arg2;
        if (~var7 >= -360001) {
            int var8 = Math.min(arg5.field1977 / 2, arg5.field1952 / 2);
            if (arg6 <= -87) {
                if (~(var8 * var8) > ~var7) {
                    var8 -= 10;
                    int var9 = 2047 & class29.field476 + class254.field4462;
                    int var10 = class62.field1136[var9];
                    int var11 = var10 * 256 / (class91.field1559 + 256);
                    int var12 = class62.field1143[var9];
                    int var13 = var12 * 256 / (class91.field1559 + 256);
                    int var14 = arg0 * var13 + arg2 * var11 >> 16;
                    int var15 = arg2 * var13 + -(arg0 * var11) >> 16;
                    double var16 = Math.atan2((double) var14, (double) var15);
                    int var18 = (int) (Math.sin(var16) * (double) var8);
                    int var19 = (int) (Math.cos(var16) * (double) var8);
                    ((class163) class102.field1797[arg4]).method782(arg1 - -(arg5.field1977 / 2) + var18 + -10, arg5.field1952 / 2 + -var19 + arg3 + -10, 20, 20, 15, 15, var16, 256);
                } else {
                    class60.method364(arg1, 127, arg0, arg2, arg3, class199.field3419[arg4], arg5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(BII)I")
    private final int method637(byte arg0, int arg1, int arg2) {
        int var4 = -101 / ((arg0 - -26) / 62);
        ++field1818;
        int var5 = arg1 * 57 + arg2;
        int var6 = var5 ^ var5 << 1;
        return -((Integer.MAX_VALUE & (var6 * var6 * 15731 + 789221) * var6 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!gf", name = "<init>", descriptor = "()V")
    public class104() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBIILnh;IZ)V")
    public static final void method638(int arg0, byte arg1, int arg2, int arg3, class57 arg4, int arg5, boolean arg6) {
        ++field1820;
        long var7 = (long) ((arg2 << 16) - -arg0);
        class214 var9 = (class214) class176.field2930.method1298(-118, var7);
        if (var9 == null) {
            class214 var10 = (class214) class236.field4093.method1298(-128, var7);
            if (var10 == null) {
                class214 var11 = (class214) class140.field2420.method1298(-116, var7);
                if (var11 != null) {
                    if (arg6) {
                        var11.method727((byte) 2);
                        class176.field2930.method1300(var11, var7, -2875);
                        ++class56.field1014;
                        --class254.field4471;
                    }
                } else {
                    if (arg3 != 1941235504) {
                        field1814 = null;
                    }
                    if (!arg6) {
                        class214 var12 = (class214) class99.field1728.method1298(-109, var7);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class214 var13 = new class214();
                    var13.field3618 = arg5;
                    var13.field3609 = arg4;
                    var13.field3617 = arg1;
                    if (arg6) {
                        class176.field2930.method1300(var13, var7, -2875);
                        ++class56.field1014;
                    } else {
                        class100.field1750.method217(29, var13);
                        class140.field2420.method1300(var13, var7, -2875);
                        ++class254.field4471;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "(II)I")
    public static final int method639(int arg0, int arg1) {
        if (arg1 > -14) {
            method635(-51, -27, (class196) null, -112, -126, (class196) null, (class105) null, 9);
        }
        ++field1816;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!gf", name = "h", descriptor = "(I)V")
    public static void method640(int arg0) {
        field1814 = null;
        int var1 = 101 % ((18 - arg0) / 33);
    }
}
