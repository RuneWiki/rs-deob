import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class252 extends class148 {

    @OriginalMember(owner = "client!mk", name = "D", descriptor = "Lmi;")
    public class128 field4417 = new class128();

    @OriginalMember(owner = "client!mk", name = "L", descriptor = "Lfb;")
    public class80 field4425 = new class80();

    @OriginalMember(owner = "client!mk", name = "x", descriptor = "Lok;")
    private class92 field4411;

    @OriginalMember(owner = "client!mk", name = "y", descriptor = "Lhh;")
    public static class163 field4412 = class137.method1065("mapflag", 17);

    @OriginalMember(owner = "client!mk", name = "t", descriptor = "I")
    public static int field4407 = 100;

    @OriginalMember(owner = "client!mk", name = "C", descriptor = "[I")
    public static int[] field4416 = new int[100];

    @OriginalMember(owner = "client!mk", name = "I", descriptor = "Z")
    public static boolean field4422 = false;

    @OriginalMember(owner = "client!mk", name = "H", descriptor = "Lhh;")
    private static class163 field4421 = class137.method1065(" )2> ", 17);

    @OriginalMember(owner = "client!mk", name = "K", descriptor = "Lhh;")
    public static class163 field4424 = class137.method1065("Benutzen", 17);

    @OriginalMember(owner = "client!mk", name = "r", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!mk", name = "s", descriptor = "I")
    public static int field4406;

    @OriginalMember(owner = "client!mk", name = "u", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!mk", name = "v", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!mk", name = "w", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!mk", name = "z", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!mk", name = "A", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!mk", name = "B", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!mk", name = "E", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!mk", name = "F", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!mk", name = "G", descriptor = "I")
    public static int field4420;

    @OriginalMember(owner = "client!mk", name = "J", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!mk", name = "M", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!mk", name = "N", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([IILng;III)V")
    private final void method1713(int[] arg0, int arg1, class190 arg2, int arg3, int arg4, int arg5) {
        field4405++;
        if ((this.field4411.field1716[arg2.field3459] & 0x4) != 0 && arg2.field3474 < 0) {
            int var7 = this.field4411.field1699[arg2.field3459] / class255.field4454;
            while (true) {
                int var8 = (var7 + 1048575 - arg2.field3476) / var7;
                if (arg3 < var8) {
                    arg2.field3476 += arg3 * var7;
                    break;
                }
                arg2.field3486.method218(arg0, arg1, var8);
                arg2.field3476 += var7 * var8 - 1048576;
                int var9 = class255.field4454 / 100;
                arg1 += var8;
                arg3 -= var8;
                int var10 = 262144 / var7;
                class34 var11 = arg2.field3486;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field4411.field1717[arg2.field3459] == 0) {
                    arg2.field3486 = class34.method219(arg2.field3481, var11.method237(), var11.method203(), var11.method222());
                } else {
                    arg2.field3486 = class34.method219(arg2.field3481, var11.method237(), 0, var11.method222());
                    this.field4411.method729(arg2, (byte) 19, arg2.field3477.field73[arg2.field3469] < 0);
                    arg2.field3486.method228(var9, var11.method203());
                }
                if (arg2.field3477.field73[arg2.field3469] < 0) {
                    arg2.field3486.method200(-1);
                }
                var11.method244(var9);
                var11.method218(arg0, arg1, arg4 - arg1);
                if (var11.method232()) {
                    this.field4425.method595(var11);
                }
            }
        }
        if (arg5 != 1048575) {
            field4416 = null;
        }
        arg2.field3486.method218(arg0, arg1, arg3);
    }

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "()Lge;")
    public final class148 method212() {
        field4410++;
        class190 var1 = (class190) this.field4417.method1017(111);
        if (var1 == null) {
            return null;
        } else if (var1.field3486 == null) {
            return this.method229();
        } else {
            return var1.field3486;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Z)V")
    public static final void method1714(boolean arg0) {
        field4415++;
        for (class179 var1 = (class179) class130.field2525.method1017(82); var1 != null; var1 = (class179) class130.field2525.method1016((byte) -31)) {
            class106 var2 = var1.field3248;
            if (class20.field323 != var2.field2024 || var2.field2020) {
                var1.method1063(99);
            } else if (var2.field2030 <= class227.field4092) {
                var2.method861(class52.field877, 10);
                if (var2.field2020) {
                    var1.method1063(124);
                } else {
                    class174.method1287(var2.field2024, var2.field2015, var2.field2022, var2.field2014, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0) {
            field4421 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILqh;)V")
    public static final void method1715(int arg0, int arg1, int arg2, class69 arg3) {
        if (arg3.field1222 == 1) {
            class122.method955(class170.field3120, 0, 0L, -2, arg3.field1330, (short) 4, arg3.field1188);
            class253.field4429++;
        }
        field4408++;
        if (arg3.field1222 == 2 && !class187.field3426) {
            class163 var4 = class165.method1240(-1, arg3);
            if (var4 != null) {
                class222.field4045++;
                class122.method955(class145.method1101(0, new class163[] { class93.field1761, arg3.field1246 }), -1, 0L, arg2 ^ 0xFFFFFFF7, var4, (short) 47, arg3.field1188);
            }
        }
        if (arg3.field1222 == 3) {
            class102.field1963++;
            class122.method955(class170.field3120, 0, 0L, -2, class128.field2489, (short) 33, arg3.field1188);
        }
        if (arg3.field1222 == 4) {
            class122.method955(class170.field3120, 0, 0L, arg2 ^ 0xFFFFFFF7, arg3.field1330, (short) 16, arg3.field1188);
            class199.field3574++;
        }
        if (arg3.field1222 == 5) {
            class122.method955(class170.field3120, 0, 0L, -2, arg3.field1330, (short) 26, arg3.field1188);
            class122.field2316++;
        }
        if (arg3.field1222 == 6 && class18.field283 == null) {
            class59.field978++;
            class122.method955(class170.field3120, -1, 0L, -2, arg3.field1330, (short) 58, arg3.field1188);
        }
        if (arg3.field1294 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg3.field1259; var6++) {
                for (int var7 = 0; var7 < arg3.field1320; var7++) {
                    int var8 = (arg3.field1260 + 32) * var6;
                    int var9 = (arg3.field1293 + 32) * var7;
                    if (var5 < 20) {
                        var8 += arg3.field1281[var5];
                        var9 += arg3.field1169[var5];
                    }
                    if (var9 <= arg0 && var8 <= arg1 && arg0 < (var9 + 32) && arg1 < (var8 + 32)) {
                        class131.field2533 = var5;
                        class165.field3043 = arg3;
                        if (arg3.field1219[var5] > 0) {
                            class99 var10 = class120.method939(22952, arg3.field1219[var5] - 1);
                            if (class56.field928 == 1 && class97.method767(client.method826(arg3), (byte) 101)) {
                                if (class240.field4275 != arg3.field1188 || class81.field1524 != var5) {
                                    class122.method955(class145.method1101(0, new class163[] { class187.field3420, class123.field2346, var10.field1903 }), var5, (long) var10.field1882, arg2 - 11, class210.field3811, (short) 7, arg3.field1188);
                                    class58.field954++;
                                }
                            } else if (!class187.field3426 || !class97.method767(client.method826(arg3), (byte) 101)) {
                                class163[] var11 = var10.field1907;
                                if (class55.field913) {
                                    var11 = class89.method689(arg2 - 15, var11);
                                }
                                if (class97.method767(client.method826(arg3), (byte) 101)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class212.field3838++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 12;
                                            } else {
                                                var13 = 42;
                                            }
                                            class122.method955(class145.method1101(arg2 - 9, new class163[] { class222.field4041, var10.field1903 }), var5, (long) var10.field1882, -2, var11[var12], var13, arg3.field1188);
                                        } else if (var12 == 4) {
                                            class77.field1455++;
                                            class122.method955(class145.method1101(0, new class163[] { class222.field4041, var10.field1903 }), var5, (long) var10.field1882, arg2 ^ 0xFFFFFFF7, class157.field2913, (short) 42, arg3.field1188);
                                        }
                                    }
                                }
                                class257.field4497++;
                                if (class233.method1614(client.method826(arg3), (byte) -128)) {
                                    class7.field123++;
                                    class122.method955(class145.method1101(arg2 ^ 0x9, new class163[] { class222.field4041, var10.field1903 }), var5, (long) var10.field1882, -2, class210.field3811, (short) 17, arg3.field1188);
                                }
                                if (class97.method767(client.method826(arg3), (byte) 101) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class48.field802++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 36;
                                            }
                                            if (var14 == 1) {
                                                var15 = 30;
                                            }
                                            if (var14 == 2) {
                                                var15 = 9;
                                            }
                                            class122.method955(class145.method1101(arg2 ^ 0x9, new class163[] { class222.field4041, var10.field1903 }), var5, (long) var10.field1882, -2, var11[var14], var15, arg3.field1188);
                                        }
                                    }
                                }
                                class163[] var16 = arg3.field1292;
                                if (class55.field913) {
                                    var16 = class89.method689(-6, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 20;
                                            }
                                            class178.field3242++;
                                            if (var17 == 1) {
                                                var18 = 14;
                                            }
                                            if (var17 == 2) {
                                                var18 = 37;
                                            }
                                            if (var17 == 3) {
                                                var18 = 51;
                                            }
                                            if (var17 == 4) {
                                                var18 = 31;
                                            }
                                            class122.method955(class145.method1101(arg2 - 9, new class163[] { class222.field4041, var10.field1903 }), var5, (long) var10.field1882, arg2 ^ 0xFFFFFFF7, var16[var17], var18, arg3.field1188);
                                        }
                                    }
                                }
                                class122.method955(class145.method1101(0, new class163[] { class222.field4041, var10.field1903 }), var5, (long) var10.field1882, -2, class60.field1004, (short) 1004, arg3.field1188);
                            } else if ((class59.field968 & 0x10) == 16) {
                                class122.method955(class145.method1101(arg2 ^ 0x9, new class163[] { class223.field4060, class123.field2346, var10.field1903 }), var5, (long) var10.field1882, -2, class9.field151, (short) 24, arg3.field1188);
                                class102.field1967++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg3.field1240) {
            if (!class187.field3426) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class163 var23 = class13.method87((byte) -124, arg3, var19);
                    if (var23 != null) {
                        class122.method955(arg3.field1290, arg3.field1205, (long) (var19 + 1), -2, var23, (short) 1007, arg3.field1188);
                        class238.field4240++;
                    }
                }
                class163 var20 = class165.method1240(-1, arg3);
                if (var20 != null) {
                    class222.field4045++;
                    class122.method955(arg3.field1290, arg3.field1205, 0L, -2, var20, (short) 47, arg3.field1188);
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class163 var22 = class13.method87((byte) -126, arg3, var21);
                    if (var22 != null) {
                        class122.method955(arg3.field1290, arg3.field1205, (long) (var21 + 1), -2, var22, (short) 19, arg3.field1188);
                        class238.field4240++;
                    }
                }
                if (class260.method1761((byte) -101, client.method826(arg3))) {
                    class59.field978++;
                    class122.method955(class170.field3120, arg3.field1205, 0L, -2, class191.field3501, (short) 58, arg3.field1188);
                }
            } else if (class17.method110(client.method826(arg3), 16) && (class59.field968 & 0x20) == 32) {
                class122.method955(class145.method1101(arg2 ^ 0x9, new class163[] { class223.field4060, field4421, arg3.field1290 }), arg3.field1205, 0L, -2, class9.field151, (short) 44, arg3.field1188);
                class146.field2779++;
            }
        }
        if (arg2 != 9) {
            method1716((byte) 124);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "()I")
    public final int method208() {
        field4414++;
        return 0;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(B)V")
    public static void method1716(byte arg0) {
        field4416 = null;
        field4424 = null;
        field4421 = null;
        if (arg0 <= 111) {
            method1716((byte) 100);
        }
        field4412 = null;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(ILpa;IB)Lrh;")
    public static final class242 method1717(int arg0, class123 arg1, int arg2, byte arg3) {
        field4426++;
        if (arg3 != 40) {
            field4421 = null;
        }
        return class85.method677(arg0, arg1, 20888, arg2) ? class151.method1121(0) : null;
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "()Lge;")
    public final class148 method229() {
        field4406++;
        class190 var1;
        do {
            var1 = (class190) this.field4417.method1016((byte) -31);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3486 == null);
        return var1.field3486;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lng;BI)V")
    private final void method1718(class190 arg0, byte arg1, int arg2) {
        if (arg1 != -103) {
            field4412 = null;
        }
        field4413++;
        if ((this.field4411.field1716[arg0.field3459] & 0x4) != 0 && arg0.field3474 < 0) {
            int var4 = this.field4411.field1699[arg0.field3459] / class255.field4454;
            int var5 = (var4 + 1048575 - arg0.field3476) / var4;
            arg0.field3476 = arg2 * var4 + arg0.field3476 & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field4411.field1717[arg0.field3459] == 0) {
                    arg0.field3486 = class34.method219(arg0.field3481, arg0.field3486.method237(), arg0.field3486.method203(), arg0.field3486.method222());
                } else {
                    arg0.field3486 = class34.method219(arg0.field3481, arg0.field3486.method237(), 0, arg0.field3486.method222());
                    this.field4411.method729(arg0, (byte) 19, arg0.field3477.field73[arg0.field3469] < 0);
                }
                if (arg0.field3477.field73[arg0.field3469] < 0) {
                    arg0.field3486.method200(-1);
                }
                arg2 = arg0.field3476 / var4;
            }
        }
        arg0.field3486.method202(arg2);
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIILpa;)[Lvf;")
    public static final class71[] method1719(int arg0, int arg1, int arg2, class123 arg3) {
        field4418++;
        if (class85.method677(arg2, arg3, 20888, arg0)) {
            if (arg1 != -17) {
                field4416 = null;
            }
            return class163.method1186(108);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "(I)V")
    public final void method202(int arg0) {
        this.field4425.method202(arg0);
        for (class190 var2 = (class190) this.field4417.method1017(75); var2 != null; var2 = (class190) this.field4417.method1016((byte) -31)) {
            if (!this.field4411.method736(0, var2)) {
                int var3 = arg0;
                do {
                    if (var3 <= var2.field3465) {
                        this.method1718(var2, (byte) -103, var3);
                        var2.field3465 -= var3;
                        break;
                    }
                    this.method1718(var2, (byte) -103, var2.field3465);
                    var3 -= var2.field3465;
                } while (!this.field4411.method716((int[]) null, 7, var3, var2, 0));
            }
        }
        field4419++;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "([III)V")
    public final void method218(int[] arg0, int arg1, int arg2) {
        field4423++;
        this.field4425.method218(arg0, arg1, arg2);
        for (class190 var4 = (class190) this.field4417.method1017(62); var4 != null; var4 = (class190) this.field4417.method1016((byte) -31)) {
            if (!this.field4411.method736(0, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var4.field3465 >= var6) {
                        this.method1713(arg0, var5, var4, var6, var5 + var6, 1048575);
                        var4.field3465 -= var6;
                        break;
                    }
                    this.method1713(arg0, var5, var4, var4.field3465, var5 + var6, 1048575);
                    var5 += var4.field3465;
                    var6 -= var4.field3465;
                } while (!this.field4411.method716(arg0, 28, var6, var4, var5));
            }
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lok;)V")
    public class252(class92 arg0) {
        this.field4411 = arg0;
    }
}
