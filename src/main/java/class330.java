import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class330 {

    @OriginalMember(owner = "client!js", name = "e", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4272;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "Ljava/math/BigInteger;")
    private BigInteger field4274;

    @OriginalMember(owner = "client!js", name = "m", descriptor = "Lgd;")
    private class339 field4280;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "Loj;")
    private class379 field4282;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "Loe;")
    private class200 field4269;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field4273;

    @OriginalMember(owner = "client!js", name = "i", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!js", name = "j", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!js", name = "k", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!js", name = "l", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!js", name = "n", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "Lig;")
    private class244 field4271;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "Loh;")
    public static class404 field4275;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "[Lmn;")
    private class366[] field4268;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(I)V", line = 3)
    public static void method1971(int arg0) {
        field4275 = null;
        if (arg0 != -5154) {
            method1977(120);
        }
    }

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(I)V", line = 14)
    public final void method1972(int arg0) {
        field4277++;
        if (arg0 != -14707) {
            this.field4271 = null;
        }
        if (this.field4268 == null) {
            return;
        }
        for (int var2 = 0; var2 < this.field4268.length; var2++) {
            if (this.field4268[var2] != null) {
                this.field4268[var2].method2138(arg0 + 45762);
            }
        }
        for (int var3 = 0; var3 < this.field4268.length; var3++) {
            if (this.field4268[var3] != null) {
                this.field4268[var3].method2129(arg0 ^ 0x3913);
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(II)I", line = 50)
    public static final int method1973(int arg0, int arg1) {
        if (arg1 != -517303320) {
            field4283 = -53;
        }
        field4270++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V", line = 61)
    public static final void method1974(int arg0) {
        field4281++;
        if (!class149.field1652) {
            class260.field3231 = class689.field9718 != -1 && class689.field9718 <= class343.field4449 || ((class644.field9214 ? 26 : 22) + class343.field4449 * 16) > class476.field6777;
        }
        class550.field7900.method1728(arg0 ^ 0x2995);
        class103.field1077.method1728(29632);
        if (arg0 != 23125) {
            return;
        }
        for (class649 var1 = (class649) class265.field3289.method1719(65280); var1 != null; var1 = (class649) class265.field3289.method1723(arg0 ^ 0xFFFFF512)) {
            int var39 = var1.field9270;
            if (var39 < 1000) {
                var1.method864(12983);
                if (var39 == 6 || var39 == 50 || var39 == 59 || var39 == 45 || var39 == 18 || var39 == 11 || var39 == 13) {
                    class103.field1077.method1721((byte) -35, var1);
                } else {
                    class550.field7900.method1721((byte) 108, var1);
                }
            }
        }
        class550.field7900.method1724(class265.field3289, 3);
        class103.field1077.method1724(class265.field3289, 3);
        if (class343.field4449 <= 1) {
            class646.field9232 = null;
            class10.field74 = null;
        } else {
            if (class296.field3651 && class375.field4818.method1657(81, (byte) -40) && class343.field4449 > 2) {
                class10.field74 = (class649) class265.field3289.field3563.field1520.field1520;
            } else {
                class10.field74 = (class649) class265.field3289.field3563.field1520;
            }
            class646.field9232 = (class649) class265.field3289.field3563.field1520;
        }
        int var2 = -1;
        class73 var3 = (class73) class578.field8170.method1719(65280);
        if (var3 != null) {
            var2 = var3.method532(arg0 ^ 0x5A2C);
        }
        if (!class149.field1652) {
            if (var2 == 0 && (class574.field8142 == 1 && class343.field4449 > 2 || class151.method935(121))) {
                var2 = 2;
            }
            if (var2 == 2 && class343.field4449 > 0 && var3 != null) {
                if (class344.field4474 == null && class92.field958 == 0) {
                    class439.method2740(var3.method530(-1), 0, var3.method535((byte) -25));
                } else {
                    class634.field9120 = 2;
                }
            }
            if (var2 == 0) {
                if (class10.field74 != null) {
                    class305.method1831((byte) 74);
                } else if (class568.field8075) {
                    class251.method1503((byte) 111);
                }
            }
            if (class344.field4474 == null && class92.field958 == 0) {
                class713.field10035 = null;
                class634.field9120 = 0;
            }
            return;
        }
        if (var2 == -1) {
            int var4 = class353.field4537.method694((byte) -100);
            int var5 = class353.field4537.method691((byte) -127);
            boolean var6 = false;
            if (class336.field4322 != null) {
                if ((field4283 - 10) <= var4 && (class750.field10484 + field4283 + 10) >= var4 && var5 >= (class210.field2484 - 10) && (class210.field2484 + class134.field1515 + 10) >= var5) {
                    var6 = true;
                } else {
                    class542.method3190((byte) -122);
                }
            }
            if (!var6) {
                if (var4 < class655.field9351 - 10 || var4 > class236.field2806 + class655.field9351 + 10 || class183.field2187 - 10 > var5 || (class183.field2187 + class542.field7804 + 10) < var5) {
                    class14.method70((byte) 99);
                } else if (class260.field3231) {
                    int var7 = -1;
                    int var8 = -1;
                    for (int var9 = 0; var9 < class736.field10289; var9++) {
                        if (class644.field9214) {
                            int var10 = var9 * 16 + (class183.field2187 + 33);
                            if (var10 - 13 < var5 && var10 + 4 > var5) {
                                var7 = var9;
                                var8 = var10 - 13;
                                break;
                            }
                        } else {
                            int var11 = var9 * 16 + class183.field2187 + 31;
                            if (var11 - 13 < var5 && var11 + 3 > var5) {
                                var8 = var11 - 13;
                                var7 = var9;
                                break;
                            }
                        }
                    }
                    if (var7 != -1) {
                        int var12 = 0;
                        class11 var13 = new class11(class331.field4291);
                        for (class177 var14 = (class177) var13.method46((byte) -68); var14 != null; var14 = (class177) var13.method49((byte) -52)) {
                            if (var7 == var12) {
                                if (var14.field2078 > 1) {
                                    class616.method3494(var8, (byte) -93, var14, var5);
                                }
                                break;
                            }
                            var12++;
                        }
                    }
                }
            }
        }
        if (var2 != 0) {
            return;
        }
        int var15 = var3.method530(-1);
        int var16 = var3.method535((byte) -25);
        if (class336.field4322 != null && var15 >= field4283 && (class750.field10484 + field4283) >= var15 && var16 >= class210.field2484 && class210.field2484 + class134.field1515 >= var16) {
            int var17 = -1;
            for (int var18 = 0; var18 < class336.field4322.field2078; var18++) {
                if (class644.field9214) {
                    int var23 = var18 * 16 + class210.field2484 + 33;
                    if (var16 > var23 - 13 && var16 < var23 + 4) {
                        var17 = var18;
                    }
                } else {
                    int var22 = var18 * 16 + class210.field2484 + 31;
                    if (var16 > var22 - 13 && var22 + 3 > var16) {
                        var17 = var18;
                    }
                }
            }
            if (var17 != -1) {
                int var19 = 0;
                class11 var20 = new class11(class336.field4322.field2081);
                for (class649 var21 = (class649) var20.method46((byte) -127); var21 != null; var21 = (class649) var20.method49((byte) -30)) {
                    if (var17 == var19) {
                        class229.method1326(var15, (byte) 68, var21, var16);
                        break;
                    }
                    var19++;
                }
            }
            class14.method70((byte) 97);
            return;
        }
        if (class655.field9351 > var15 || var15 > (class655.field9351 + class236.field2806) || class183.field2187 > var16 || class183.field2187 + class542.field7804 < var16) {
            return;
        }
        if (class260.field3231) {
            int var24 = -1;
            int var25 = -1;
            for (int var26 = 0; var26 < class736.field10289; var26++) {
                if (class644.field9214) {
                    int var27 = var26 * 16 + class183.field2187 + 33;
                    if ((var27 - 13) < var16 && var16 < var27 + 4) {
                        var25 = var27 - 13;
                        var24 = var26;
                        break;
                    }
                } else {
                    int var28 = var26 * 16 + class183.field2187 + 31;
                    if (var16 > var28 - 13 && var16 < (var28 + 3)) {
                        var24 = var26;
                        var25 = var28 - 13;
                        break;
                    }
                }
            }
            if (var24 != -1) {
                int var29 = 0;
                class11 var30 = new class11(class331.field4291);
                for (class177 var31 = (class177) var30.method46((byte) -83); var31 != null; var31 = (class177) var30.method49((byte) -114)) {
                    if (var24 == var29) {
                        if (var31.field2078 != 1) {
                            class616.method3494(var25, (byte) -108, var31, var16);
                            return;
                        }
                        class229.method1326(var15, (byte) 68, (class649) var31.field2081.field4488.field8923, var16);
                        class14.method70((byte) 112);
                        return;
                    }
                    var29++;
                }
                return;
            }
        } else {
            int var32 = -1;
            for (int var33 = 0; var33 < class343.field4449; var33++) {
                if (class644.field9214) {
                    int var37 = (class343.field4449 - var33 - 1) * 16 + (class183.field2187 + 33);
                    if ((var37 - 13) < var16 && var16 < (var37 + 4)) {
                        var32 = var33;
                    }
                } else {
                    int var38 = (class343.field4449 - var33 - 1) * 16 + class183.field2187 + 31;
                    if (var38 - 13 < var16 && var16 < (var38 + 3)) {
                        var32 = var33;
                    }
                }
            }
            if (var32 != -1) {
                int var34 = 0;
                class522 var35 = new class522(class265.field3289);
                for (class649 var36 = (class649) var35.method3068(25561); var36 != null; var36 = (class649) var35.method3070(true)) {
                    if (var32 == var34) {
                        class229.method1326(var15, (byte) 68, var36, var16);
                        break;
                    }
                    var34++;
                }
            }
            class14.method70((byte) 114);
        }
        return;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ILrfa;BLrfa;)Lmn;", line = 465)
    public final class366 method1975(int arg0, class199 arg1, byte arg2, class199 arg3) {
        field4279++;
        if (arg2 != 70) {
            this.method1976(52);
        }
        return this.method1978(true, arg0, arg3, 98, arg1);
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)Z", line = 479)
    public final boolean method1976(int arg0) {
        field4278++;
        if (this.field4271 != null) {
            return true;
        }
        if (this.field4269 == null) {
            if (this.field4280.method2013((byte) -70)) {
                return false;
            }
            this.field4269 = this.field4280.method2009(255, (byte) 0, 255, -1802914416, true);
        }
        if (this.field4269.field6563) {
            return false;
        }
        class244 var2 = new class244(this.field4269.method1206((byte) -122));
        var2.field2903 = 5;
        if (arg0 > -41) {
            method1973(-105, 127);
        }
        int var3 = var2.method1423(-18);
        var2.field2903 += var3 * 72;
        byte[] var4 = new byte[var2.field2912.length - var2.field2903];
        var2.method1461(824, 0, var4, var4.length);
        byte[] var7;
        if (this.field4274 == null || this.field4272 == null) {
            var7 = var4;
        } else {
            BigInteger var5 = new BigInteger(var4);
            BigInteger var6 = var5.modPow(this.field4274, this.field4272);
            var7 = var6.toByteArray();
        }
        if (var7.length != 65) {
            throw new RuntimeException();
        }
        byte[] var8 = class327.method1954(5, var2.field2903 - var4.length - 5, var2.field2912, 802);
        for (int var9 = 0; var9 < 64; var9++) {
            if (var7[var9 + 1] != var8[var9]) {
                throw new RuntimeException();
            }
        }
        this.field4271 = var2;
        this.field4268 = new class366[var3];
        return true;
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V", line = 557)
    public static final void method1977(int arg0) {
        class620 var1 = class326.field4231;
        synchronized (class326.field4231) {
            class326.field4231.method3549(0);
            if (arg0 != -1) {
                field4283 = 73;
            }
        }
        field4276++;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(ZILrfa;ILrfa;)Lmn;", line = 575)
    private final class366 method1978(boolean arg0, int arg1, class199 arg2, int arg3, class199 arg4) {
        field4273++;
        if (this.field4271 == null) {
            throw new RuntimeException();
        } else if (arg1 < 0 || this.field4268.length <= arg1) {
            throw new RuntimeException();
        } else if (this.field4268[arg1] == null) {
            if (arg3 <= 71) {
                field4283 = 119;
            }
            this.field4271.field2903 = arg1 * 72 + 6;
            int var6 = this.field4271.method1438(95);
            int var7 = this.field4271.method1438(89);
            byte[] var8 = new byte[64];
            this.field4271.method1461(824, 0, var8, 64);
            class366 var9 = new class366(arg1, arg4, arg2, this.field4280, this.field4282, var6, var8, var7, arg0);
            this.field4268[arg1] = var9;
            return var9;
        } else {
            return this.field4268[arg1];
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(Lgd;Loj;Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 619)
    public class330(class339 arg0, class379 arg1, BigInteger arg2, BigInteger arg3) {
        this.field4272 = arg3;
        this.field4274 = arg2;
        this.field4280 = arg0;
        this.field4282 = arg1;
        if (!this.field4280.method2013((byte) -70)) {
            this.field4269 = this.field4280.method2009(255, (byte) 0, 255, -1802914416, true);
        }
    }
}
