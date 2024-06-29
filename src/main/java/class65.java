import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class65 {

    @OriginalMember(owner = "client!le", name = "f", descriptor = "I")
    public int field918 = 0;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "I")
    public int field916 = 0;

    @OriginalMember(owner = "client!le", name = "g", descriptor = "Z")
    private boolean field919 = false;

    @OriginalMember(owner = "client!le", name = "j", descriptor = "Ljava/lang/String;")
    public static String field922 = "glow3:";

    @OriginalMember(owner = "client!le", name = "s", descriptor = "[I")
    public static int[] field931 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!le", name = "a", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!le", name = "b", descriptor = "I")
    public int field914;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!le", name = "e", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!le", name = "k", descriptor = "I")
    public int field923;

    @OriginalMember(owner = "client!le", name = "l", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!le", name = "m", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!le", name = "n", descriptor = "I")
    public int field926;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!le", name = "p", descriptor = "I")
    public int field928;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "I")
    public int field930;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!le", name = "h", descriptor = "J")
    public long field920;

    @OriginalMember(owner = "client!le", name = "i", descriptor = "[I")
    public static int[] field921;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V", line = 8)
    public static void method424(int arg0) {
        field921 = null;
        if (arg0 != 32) {
            method427(97, -112, -5, (class249) null);
        }
        field931 = null;
        field922 = null;
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V", line = 20)
    public final void method425(int arg0) {
        field927++;
        this.field933 = class190.field2635[this.field924 << 3];
        if (arg0 != 8) {
            return;
        }
        this.field926 = (int) Math.sqrt((double) (this.field914 * this.field914 + (this.field930 * this.field930 + (this.field923 * this.field923))));
        if (this.field925 == 0) {
            this.field925 = 1;
        }
        if (this.field917 == 0) {
            this.field920 = 2147483647L;
        } else if (this.field917 == 1) {
            this.field920 = (long) (this.field926 * 8 / this.field925);
            this.field920 *= this.field920;
        } else if (this.field917 == 2) {
            this.field920 = (long) (this.field926 * 8 / this.field925);
        }
        if (this.field919) {
            this.field926 *= -1;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IILil;)V", line = 57)
    private final void method426(int arg0, int arg1, class265 arg2) {
        field932++;
        if (arg1 == 1) {
            this.field924 = arg2.method1685(8104);
        } else if (arg1 == 2) {
            arg2.method1697(-17);
        } else if (arg1 == 3) {
            this.field930 = arg2.method1666(-2);
            this.field914 = arg2.method1666(-2);
            this.field923 = arg2.method1666(-2);
        } else if (arg1 == 4) {
            this.field917 = arg2.method1697(-115);
            this.field925 = arg2.method1666(arg0 ^ 0x1983);
        } else if (arg1 == 6) {
            this.field928 = arg2.method1697(arg0 + 6492);
        } else if (arg1 == 8) {
            this.field918 = 1;
        } else if (arg1 == 9) {
            this.field916 = 1;
        } else if (arg1 == 10) {
            this.field919 = true;
        }
        if (arg0 != -6531) {
            this.method425(81);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(IIILro;)V", line = 130)
    public static final void method427(int arg0, int arg1, int arg2, class249 arg3) {
        field929++;
        if (arg3.field3491 == 1) {
            class169.method1048(-1, 0L, arg3.field3496, arg0 ^ 0xFFFFFFFD, 0, "", arg3.field3622, 29);
            class60.field868++;
        }
        if (arg3.field3491 == 2 && !class95.field1307) {
            String var4 = class360.method2364(arg3, (byte) 90);
            if (var4 != null) {
                class169.method1048(-1, 0L, var4, -1, -1, "<col=00ff00>" + arg3.field3540, arg3.field3622, 4);
                class370.field5504++;
            }
        }
        if (arg3.field3491 == 3) {
            class122.field1632++;
            class169.method1048(-1, 0L, class126.field1685, -1, 0, "", arg3.field3622, 40);
        }
        if (arg3.field3491 == 4) {
            class281.field4130++;
            class169.method1048(-1, 0L, arg3.field3496, -1, 0, "", arg3.field3622, 34);
        }
        if (arg3.field3491 == 5) {
            class169.method1048(-1, 0L, arg3.field3496, arg0 ^ 0xFFFFFFFD, 0, "", arg3.field3622, 38);
            class276.field4050++;
        }
        if (arg3.field3491 == 6 && class371.field5518 == null) {
            class169.method1048(-1, 0L, arg3.field3496, -1, -1, "", arg3.field3622, 24);
            class152.field1985++;
        }
        if (arg0 != 2) {
            field922 = null;
        }
        if (arg3.field3637 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field3489; var6++) {
                for (int var7 = 0; var7 < arg3.field3607; var7++) {
                    int var8 = (arg3.field3499 + 32) * var7;
                    int var9 = (arg3.field3581 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg3.field3490[var5];
                        var9 += arg3.field3504[var5];
                    }
                    if (arg2 >= var8 && var9 <= arg1 && (var8 + 32) > arg2 && (var9 + 32) > arg1) {
                        class363.field5308 = arg3;
                        class376.field5681 = var5;
                        if (arg3.field3567[var5] > 0) {
                            class185 var10 = client.method1572(arg3);
                            class193 var11 = class166.method1031(arg3.field3567[var5] - 1, false);
                            if (class394.field5921 == 1 && var10.method1142(-1)) {
                                if (class73.field990 != arg3.field3622 || class91.field1248 != var5) {
                                    class117.field1580++;
                                    class169.method1048(class274.field4033, (long) var11.field2737, class238.field3341, -1, var5, class66.field939 + " -> <col=ff9040>" + var11.field2729, arg3.field3622, 35);
                                }
                            } else if (class95.field1307 && var10.method1142(-1)) {
                                class85 var12 = class86.field1206 == -1 ? null : class391.method2555(class86.field1206, true);
                                if ((class168.field2212 & 0x10) != 0 && (var12 == null || var11.method1208(126, var12.field1181, class86.field1206) != var12.field1181)) {
                                    class169.method1048(class369.field5488, (long) var11.field2737, class191.field2667, -1, var5, class333.field4927 + " -> <col=ff9040>" + var11.field2729, arg3.field3622, 18);
                                    class120.field1619++;
                                }
                            } else {
                                String[] var13 = var11.field2699;
                                if (var10.method1142(arg0 - 3)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            int var15 = -1;
                                            byte var16;
                                            if (var14 == 3) {
                                                var16 = 31;
                                            } else {
                                                var16 = 2;
                                            }
                                            if (var11.field2710 == var14) {
                                                var15 = var11.field2736;
                                            }
                                            if (var11.field2742 == var14) {
                                                var15 = var11.field2690;
                                            }
                                            class169.method1048(var15, (long) var11.field2737, var13[var14], -1, var5, "<col=ff9040>" + var11.field2729, arg3.field3622, var16);
                                            class189.field2569++;
                                        }
                                    }
                                }
                                if (var10.method1144((byte) 47)) {
                                    class259.field3778++;
                                    class169.method1048(class274.field4033, (long) var11.field2737, class238.field3341, -1, var5, "<col=ff9040>" + var11.field2729, arg3.field3622, 11);
                                }
                                if (var10.method1142(-1) && var13 != null) {
                                    for (int var17 = 2; var17 >= 0; var17--) {
                                        if (var13[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 30;
                                            }
                                            int var19 = -1;
                                            if (var17 == 1) {
                                                var18 = 26;
                                            }
                                            if (var17 == 2) {
                                                var18 = 42;
                                            }
                                            if (var11.field2710 == var17) {
                                                var19 = var11.field2736;
                                            }
                                            if (var11.field2742 == var17) {
                                                var19 = var11.field2690;
                                            }
                                            class169.method1048(var19, (long) var11.field2737, var13[var17], -1, var5, "<col=ff9040>" + var11.field2729, arg3.field3622, var18);
                                            class126.field1681++;
                                        }
                                    }
                                }
                                String[] var20 = arg3.field3530;
                                if (var20 != null) {
                                    for (int var21 = 4; var21 >= 0; var21--) {
                                        if (var20[var21] != null) {
                                            byte var22 = 0;
                                            int var23 = -1;
                                            if (var21 == 0) {
                                                var22 = 6;
                                            }
                                            if (var21 == 1) {
                                                var22 = 3;
                                            }
                                            if (var21 == 2) {
                                                var22 = 48;
                                            }
                                            if (var21 == 3) {
                                                var22 = 15;
                                            }
                                            if (var21 == 4) {
                                                var22 = 19;
                                            }
                                            if (var11.field2710 == var21) {
                                                var23 = var11.field2736;
                                            }
                                            if (var11.field2742 == var21) {
                                                var23 = var11.field2690;
                                            }
                                            class169.method1048(var23, (long) var11.field2737, var20[var21], -1, var5, "<col=ff9040>" + var11.field2729, arg3.field3622, var22);
                                            class129.field1728++;
                                        }
                                    }
                                }
                                class169.method1048(class196.field2803, (long) var11.field2737, class166.field2173, -1, var5, "<col=ff9040>" + var11.field2729, arg3.field3622, 1012);
                                class88.field1224++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg3.field3522) {
            return;
        }
        if (!class95.field1307) {
            for (int var24 = 9; var24 >= 5; var24--) {
                String var28 = class314.method1962((byte) 19, arg3, var24);
                if (var28 != null) {
                    class169.method1048(class49.method340(arg3, (byte) -95, var24), (long) (var24 + 1), var28, -1, arg3.field3517, arg3.field3558, arg3.field3622, 1006);
                    class86.field1203++;
                }
            }
            String var25 = class360.method2364(arg3, (byte) 90);
            if (var25 != null) {
                class370.field5504++;
                class169.method1048(-1, 0L, var25, -1, arg3.field3517, arg3.field3558, arg3.field3622, 4);
            }
            for (int var26 = 4; var26 >= 0; var26--) {
                String var27 = class314.method1962((byte) 19, arg3, var26);
                if (var27 != null) {
                    class169.method1048(class49.method340(arg3, (byte) 115, var26), (long) (var26 + 1), var27, -1, arg3.field3517, arg3.field3558, arg3.field3622, 36);
                    class86.field1203++;
                }
            }
            if (!client.method1572(arg3).method1145(-1)) {
                return;
            }
            class152.field1985++;
            if (arg3.field3497 != null) {
                class169.method1048(-1, 0L, arg3.field3497, -1, arg3.field3517, "", arg3.field3622, 24);
                return;
            }
            class169.method1048(-1, 0L, class307.field4388, -1, arg3.field3517, "", arg3.field3622, 24);
        } else if (client.method1572(arg3).method1146((byte) -108) && (class168.field2212 & 0x20) != 0) {
            class169.method1048(class369.field5488, 0L, class191.field2667, -1, arg3.field3517, class333.field4927 + " -> " + arg3.field3558, arg3.field3622, 22);
            class19.field324++;
            return;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(ILil;)V", line = 485)
    public final void method428(int arg0, class265 arg1) {
        while (true) {
            int var3 = arg1.method1697(-22);
            if (var3 == 0) {
                if (arg0 != -1) {
                    this.field924 = 76;
                }
                field915++;
                return;
            }
            this.method426(-6531, var3, arg1);
        }
    }
}
