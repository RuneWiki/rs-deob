import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class162 extends class212 {

    @OriginalMember(owner = "client!a", name = "db", descriptor = "Lsc;")
    public static class181 field2766 = class149.method967(255, "mapdots");

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!a", name = "mb", descriptor = "I")
    public static int field2775 = 0;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    public static int field2759;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    private int field2762;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "I")
    private int field2771;

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "I")
    private int field2772;

    @OriginalMember(owner = "client!a", name = "lb", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!a", name = "kb", descriptor = "Ldg;")
    public static class90 field2773;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "[I")
    public static int[] field2757;

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "[[I")
    public static int[][] field2767;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IZLo;BI)V")
    public static final void method1081(int arg0, boolean arg1, class175 arg2, byte arg3, int arg4) {
        ++field2770;
        int var5 = arg2.field3057;
        if (~arg2.field3083 != -1) {
            if (~arg2.field3083 != -2) {
                if (~arg2.field3083 == -3) {
                    arg2.field3057 = arg2.field3072 * arg0 >> 14;
                } else if (~arg2.field3083 == -4) {
                    if (~arg2.field3069 == -3) {
                        arg2.field3057 = arg2.field3072 * 32 - -((arg2.field3072 - 1) * arg2.field2999);
                    } else if (~arg2.field3069 == -8) {
                        arg2.field3057 = arg2.field3072 * 115 - -((arg2.field3072 + -1) * arg2.field2999);
                    }
                }
            } else {
                arg2.field3057 = -arg2.field3072 + arg0;
            }
        } else {
            arg2.field3057 = arg2.field3072;
        }
        int var6 = arg2.field3041;
        if (arg2.field3084 == 0) {
            arg2.field3041 = arg2.field2996;
        } else if (arg2.field3084 == 1) {
            arg2.field3041 = -arg2.field2996 + arg4;
        } else if (~arg2.field3084 != -3) {
            if (arg2.field3084 == 3) {
                if (arg2.field3069 != 2) {
                    if (~arg2.field3069 == -8) {
                        arg2.field3041 = (arg2.field2996 + -1) * arg2.field2985 + arg2.field2996 * 12;
                    }
                } else {
                    arg2.field3041 = (arg2.field2996 + -1) * arg2.field2985 + arg2.field2996 * 32;
                }
            }
        } else {
            arg2.field3041 = arg2.field2996 * arg4 >> 14;
        }
        if (~arg2.field3083 == -5) {
            arg2.field3057 = arg2.field3060 * arg2.field3041 / arg2.field2926;
        }
        if (arg2.field3084 == 4) {
            arg2.field3041 = arg2.field3057 * arg2.field2926 / arg2.field3060;
        }
        if (class166.field2826 && (~client.method1058(arg2) != -1 || ~arg2.field3069 == -1)) {
            if (arg2.field3041 < 5 && ~arg2.field3057 > -6) {
                arg2.field3041 = 5;
                arg2.field3057 = 5;
            } else {
                if (~arg2.field3041 >= -1) {
                    arg2.field3041 = 5;
                }
                if (arg2.field3057 <= 0) {
                    arg2.field3057 = 5;
                }
            }
        }
        if (arg3 < -51) {
            if (arg2.field3067 == 1337) {
                class143.field2323 = arg2;
            }
            if (arg1 && arg2.field3026 != null) {
                if (arg2.field3057 != var5 || arg2.field3041 != var6) {
                    class94 var7 = new class94();
                    var7.field1488 = arg2;
                    var7.field1489 = arg2.field3026;
                    class46.field724.method1689(var7, 107);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "f", descriptor = "(I)V")
    public static void method1082(int arg0) {
        field2757 = null;
        field2766 = null;
        field2767 = null;
        field2773 = null;
        if (arg0 < 120) {
            field2769 = 104;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(II)[[I")
    public final int[][] method260(int arg0, int arg1) {
        ++field2765;
        int[][] var3 = super.field3645.method1352(arg0, arg1 ^ -16268);
        if (arg1 != 16383) {
            return null;
        } else {
            if (super.field3645.field3477) {
                int[] var4 = var3[1];
                int[] var5 = var3[0];
                int[] var6 = var3[2];
                for (int var7 = 0; ~var7 > ~class26.field452; ++var7) {
                    var5[var7] = this.field2771;
                    var4[var7] = this.field2762;
                    var6[var7] = this.field2772;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvf;I)Lik;")
    public static final class85 method1083(class230 arg0, int arg1) {
        if (arg1 != 5660) {
            return null;
        } else {
            ++field2764;
            return new class85(arg0.method1515(arg1 ^ 5721), arg0.method1515(arg1 + -5764), arg0.method1515(-24), arg0.method1515(75), arg0.method1508(true), arg0.method1508(true), arg0.method1516((byte) 82));
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(I)V")
    private class162(int arg0) {
        super(0, false);
        this.method1087(arg0, -91);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.method260(-125, 99);
        }
        if (arg1 == 0) {
            this.method1087(arg0.method1508(true), arg2 ^ 126);
        }
        ++field2763;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(III)V")
    public static final void method1084(int arg0, int arg1, int arg2) {
        class107.field1751[arg1] = arg0;
        ++field2768;
        if (arg2 < -14) {
            class236 var3 = (class236) class143.field2314.method1424(true, (long) arg1);
            if (var3 != null) {
                if (~var3.field4105 != -4611686018427387906L) {
                    var3.field4105 = 4611686018427387904L | class213.method1414(-9292) - -500L;
                    return;
                }
            } else {
                class236 var4 = new class236(4611686018427387905L);
                class143.field2314.method1422((long) arg1, var4, -1);
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class162() {
        this(0);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(IB)I")
    public static final int method1085(int arg0, byte arg1) {
        ++field2760;
        if (~class196.field3431 == -2) {
            return 7;
        } else if (~class196.field3431 == -3) {
            return 20;
        } else if (arg0 != 15) {
            if (arg0 != 16) {
                if (arg0 != 22) {
                    if (~arg0 != -32) {
                        if (~arg0 != -39) {
                            if (~arg0 != -44) {
                                if (~arg0 != -49) {
                                    if (~arg0 != -59) {
                                        if (~arg0 != -70) {
                                            if (arg0 != 74) {
                                                if (~arg0 != -78) {
                                                    if (arg0 != 101) {
                                                        if (arg0 != 103) {
                                                            if (~arg0 != -153) {
                                                                if (~arg0 != -162) {
                                                                    if (~arg0 != -163) {
                                                                        if (~arg0 != -167) {
                                                                            if (arg0 != 179) {
                                                                                if (arg0 == 191) {
                                                                                    return 5;
                                                                                } else {
                                                                                    if (arg1 > -86) {
                                                                                        field2769 = 11;
                                                                                    }
                                                                                    return 0;
                                                                                }
                                                                            } else {
                                                                                return 18;
                                                                            }
                                                                        } else {
                                                                            return 10;
                                                                        }
                                                                    } else {
                                                                        return 9;
                                                                    }
                                                                } else {
                                                                    return 4;
                                                                }
                                                            } else {
                                                                return 16;
                                                            }
                                                        } else {
                                                            return 19;
                                                        }
                                                    } else {
                                                        return 12;
                                                    }
                                                } else {
                                                    return 1;
                                                }
                                            } else {
                                                return 20;
                                            }
                                        } else {
                                            return 6;
                                        }
                                    } else {
                                        return 11;
                                    }
                                } else {
                                    return 17;
                                }
                            } else {
                                return 15;
                            }
                        } else {
                            return 2;
                        }
                    } else {
                        return 14;
                    }
                } else {
                    return 8;
                }
            } else {
                return 3;
            }
        } else {
            return 13;
        }
    }

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
    public static final void method1086(int arg0) {
        if (arg0 != 30481) {
            field2769 = 53;
        }
        ++field2761;
        class224.method1481((byte) 24, 5);
        class67.method473((byte) -119, 5);
        class149.method968((byte) 123, 5);
        class120.method785((byte) -119, 5);
        class196.method1336((byte) 124, 5);
        class149.method970(5, true);
        class91.method607((byte) -109, 5);
        class195.method1330(5, arg0 ^ 30702);
        class257.method1750(-123, 5);
        class33.method258(5, false);
        class108.method723(true, 5);
        class246.method1679((byte) -25, 50);
        class20.method185((byte) 3, 5);
        class164.method1094(5, 0);
        class148.field2473.method1796(20, 5);
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(II)V")
    private final void method1087(int arg0, int arg1) {
        if (arg1 >= -76) {
            field2767 = null;
        }
        this.field2762 = (65280 & arg0) >> 4;
        ++field2758;
        this.field2772 = (arg0 & 255) << 4;
        this.field2771 = 4080 & arg0 >> 12;
    }

    @OriginalMember(owner = "client!a", name = "h", descriptor = "(I)V")
    public static final void method1088(int arg0) {
        int var1 = class76.field1223.method548(arg0, (byte) 67);
        if (~var1 > ~class152.field2538) {
            for (int var2 = var1; var2 < class152.field2538; ++var2) {
                class148.field2480[class131.field2176++] = class218.field3750[var2];
            }
        }
        ++field2759;
        if (var1 > class152.field2538) {
            throw new RuntimeException("gppov1");
        } else {
            class152.field2538 = 0;
            for (int var3 = 0; ~var3 > ~var1; ++var3) {
                int var4 = class218.field3750[var3];
                class116 var5 = class39.field602[var4];
                int var6 = class76.field1223.method548(1, (byte) 67);
                if (~var6 == -1) {
                    class218.field3750[class152.field2538++] = var4;
                    var5.field2639 = class237.field4125;
                } else {
                    int var7 = class76.field1223.method548(2, (byte) 67);
                    if (~var7 == -1) {
                        class218.field3750[class152.field2538++] = var4;
                        var5.field2639 = class237.field4125;
                        class30.field498[class137.field2236++] = var4;
                    } else if (~var7 == -2) {
                        class218.field3750[class152.field2538++] = var4;
                        var5.field2639 = class237.field4125;
                        int var8 = class76.field1223.method548(3, (byte) 67);
                        var5.method1047(-1, false, var8);
                        int var9 = class76.field1223.method548(1, (byte) 67);
                        if (var9 == 1) {
                            class30.field498[class137.field2236++] = var4;
                        }
                    } else if (var7 == 2) {
                        class218.field3750[class152.field2538++] = var4;
                        var5.field2639 = class237.field4125;
                        int var10 = class76.field1223.method548(3, (byte) 67);
                        var5.method1047(arg0 ^ -9, true, var10);
                        int var11 = class76.field1223.method548(3, (byte) 67);
                        var5.method1047(arg0 ^ -9, true, var11);
                        int var12 = class76.field1223.method548(1, (byte) 67);
                        if (var12 == 1) {
                            class30.field498[class137.field2236++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class148.field2480[class131.field2176++] = var4;
                    }
                }
            }
        }
    }
}
