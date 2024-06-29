import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lga")
public class class740 extends class60 {

    @OriginalMember(owner = "client!lga", name = "k", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!lga", name = "l", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!lga", name = "m", descriptor = "I")
    public static int field10302;

    @OriginalMember(owner = "client!lga", name = "o", descriptor = "I")
    public static int field10304;

    @OriginalMember(owner = "client!lga", name = "p", descriptor = "I")
    public static int field10305;

    @OriginalMember(owner = "client!lga", name = "q", descriptor = "I")
    public static int field10306;

    @OriginalMember(owner = "client!lga", name = "r", descriptor = "I")
    public static int field10307;

    @OriginalMember(owner = "client!lga", name = "s", descriptor = "I")
    public static int field10308;

    @OriginalMember(owner = "client!lga", name = "t", descriptor = "I")
    public static int field10309;

    @OriginalMember(owner = "client!lga", name = "n", descriptor = "Ltg;")
    public static class245 field10303;

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(I)V", line = 4)
    public static void method4153(int arg0) {
        field10303 = null;
        if (arg0 <= 48) {
            method4154(-75, -110, (byte) -114, -89, 25, -93);
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIBIII)V", line = 16)
    public static final void method4154(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field10307;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        if (arg2 < 14) {
            method4154(19, 46, (byte) 97, -113, -114, 10);
        }
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) + -3) * var11;
        int var19 = (var6 + 1) * var16;
        class455.method2755(arg4, class4.field49[arg3], (byte) 115, arg0 + arg1, -arg0 + arg1);
        int var20 = (arg5 + -1) * var15;
        while (~var7 < -1) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (~var14 > -1) {
                var14 += var19;
                var13 += var17;
                ++var6;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            --var7;
            int var21 = -var7 + arg3;
            int var22 = arg3 - -var7;
            int var23 = arg1 + var6;
            int var24 = -var6 + arg1;
            class455.method2755(arg4, class4.field49[var21], (byte) 90, var23, var24);
            class455.method2755(arg4, class4.field49[var22], (byte) 127, var23, var24);
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(II)I", line = 101)
    public final int method406(int arg0, int arg1) {
        ++field10301;
        if (super.field798.method4287((byte) 99)) {
            return 3;
        } else {
            if (arg0 != 0) {
                this.method405(false);
            }
            return ~arg1 != -1 && super.field798.field10677.method3451(0) != 1 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(ILhd;)V", line = 120)
    public class740(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(I)I", line = 123)
    public final int method4155(int arg0) {
        ++field10308;
        if (arg0 != 0) {
            method4154(70, -109, (byte) 101, -121, 83, -78);
        }
        return super.field799;
    }

    @OriginalMember(owner = "client!lga", name = "c", descriptor = "(B)Z", line = 134)
    public final boolean method4156(byte arg0) {
        ++field10305;
        if (super.field798.method4287((byte) 85)) {
            return false;
        } else {
            if (arg0 >= -61) {
                this.method4156((byte) 90);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(BI)V", line = 149)
    public final void method407(byte arg0, int arg1) {
        int var3 = 40 % ((arg0 - 28) / 50);
        ++field10300;
        super.field799 = arg1;
    }

    @OriginalMember(owner = "client!lga", name = "<init>", descriptor = "(Lhd;)V", line = 160)
    public class740(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lbn;I)V", line = 168)
    public static final void method4157(class468 arg0, int arg1) {
        ++field10302;
        arg0.method2800(8);
        int var2 = 0;
        for (int var3 = 0; ~class235.field2787 < ~var3; ++var3) {
            int var15 = class75.field1040[var3];
            if ((1 & class159.field1975[var15]) == 0) {
                if (var2 > 0) {
                    class159.field1975[var15] = (byte) class5.method105(class159.field1975[var15], 2);
                    --var2;
                } else {
                    int var16 = arg0.method2802(1, -20468);
                    if (~var16 == -1) {
                        var2 = class599.method3417(arg0, -125);
                        class159.field1975[var15] = (byte) class5.method105(class159.field1975[var15], 2);
                    } else {
                        class361.method2109(arg0, var15, -85);
                    }
                }
            }
        }
        arg0.method2806(-23187);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method2800(8);
            for (int var4 = 0; ~class235.field2787 < ~var4; ++var4) {
                int var13 = class75.field1040[var4];
                if (~(class159.field1975[var13] & 1) != -1) {
                    if (var2 > 0) {
                        --var2;
                        class159.field1975[var13] = (byte) class5.method105(class159.field1975[var13], 2);
                    } else {
                        int var14 = arg0.method2802(1, -20468);
                        if (~var14 == -1) {
                            var2 = class599.method3417(arg0, -122);
                            class159.field1975[var13] = (byte) class5.method105(class159.field1975[var13], 2);
                        } else {
                            class361.method2109(arg0, var13, -74);
                        }
                    }
                }
            }
            arg0.method2806(-23187);
            if (~var2 != -1) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method2800(8);
                for (int var5 = 0; ~var5 > ~class218.field2563; ++var5) {
                    int var11 = class486.field6775[var5];
                    if ((1 & class159.field1975[var11]) != 0) {
                        if (~var2 < -1) {
                            --var2;
                            class159.field1975[var11] = (byte) class5.method105(class159.field1975[var11], 2);
                        } else {
                            int var12 = arg0.method2802(1, -20468);
                            if (~var12 == -1) {
                                var2 = class599.method3417(arg0, -102);
                                class159.field1975[var11] = (byte) class5.method105(class159.field1975[var11], 2);
                            } else if (class779.method4324(var11, arg0, (byte) -89)) {
                                class159.field1975[var11] = (byte) class5.method105(class159.field1975[var11], 2);
                            }
                        }
                    }
                }
                arg0.method2806(-23187);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else if (arg1 <= -117) {
                    arg0.method2800(8);
                    for (int var6 = 0; ~class218.field2563 < ~var6; ++var6) {
                        int var9 = class486.field6775[var6];
                        if (~(class159.field1975[var9] & 1) == -1) {
                            if (var2 > 0) {
                                class159.field1975[var9] = (byte) class5.method105(class159.field1975[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg0.method2802(1, -20468);
                                if (~var10 == -1) {
                                    var2 = class599.method3417(arg0, 81);
                                    class159.field1975[var9] = (byte) class5.method105(class159.field1975[var9], 2);
                                } else if (class779.method4324(var9, arg0, (byte) -89)) {
                                    class159.field1975[var9] = (byte) class5.method105(class159.field1975[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method2806(-23187);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class235.field2787 = 0;
                        class218.field2563 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class159.field1975[var7] = (byte) (class159.field1975[var7] >> 1);
                            class521 var8 = class61.field825[var7];
                            if (var8 == null) {
                                class486.field6775[class218.field2563++] = var7;
                            } else {
                                class75.field1040[class235.field2787++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Z)I", line = 374)
    public final int method405(boolean arg0) {
        if (arg0) {
            this.method409((byte) -86);
        }
        ++field10306;
        return 1;
    }

    @OriginalMember(owner = "client!lga", name = "a", descriptor = "(Ljava/lang/String;ZI)V", line = 385)
    public static final void method4158(String arg0, boolean arg1, int arg2) {
        ++field10309;
        if (arg0 != null) {
            if (class60.field803 >= 100) {
                class619.method3512(class637.field8714.method3584(class770.field10592, true), 4, false);
            } else {
                String var3 = class87.method803(arg0, false);
                if (var3 != null) {
                    for (int var4 = 0; ~var4 > ~class60.field803; ++var4) {
                        String var9 = class87.method803(class86.field1151[var4], false);
                        if (var9 != null && var9.equals(var3)) {
                            class619.method3512(arg0 + class637.field8715.method3584(class770.field10592, true), 4, false);
                            return;
                        }
                        if (class115.field1457[var4] != null) {
                            String var10 = class87.method803(class115.field1457[var4], false);
                            if (var10 != null && var10.equals(var3)) {
                                class619.method3512(arg0 + class637.field8715.method3584(class770.field10592, true), 4, false);
                                return;
                            }
                        }
                    }
                    for (int var5 = arg2; ~var5 > ~class651.field8992; ++var5) {
                        String var7 = class87.method803(class375.field4702[var5], false);
                        if (var7 != null && var7.equals(var3)) {
                            class619.method3512(class637.field8720.method3584(class770.field10592, true) + arg0 + class637.field8721.method3584(class770.field10592, true), 4, false);
                            return;
                        }
                        if (class156.field1942[var5] != null) {
                            String var8 = class87.method803(class156.field1942[var5], false);
                            if (var8 != null && var8.equals(var3)) {
                                class619.method3512(class637.field8720.method3584(class770.field10592, true) + arg0 + class637.field8721.method3584(class770.field10592, true), 4, false);
                                return;
                            }
                        }
                    }
                    if (class87.method803(class300.field3596.field7399, false).equals(var3)) {
                        class619.method3512(class637.field8717.method3584(class770.field10592, true), 4, false);
                    } else {
                        ++class520.field7336;
                        class336 var6 = class512.method3076(class304.field3624, class591.field8030, (byte) 105);
                        var6.field4150.method2353(-112, 1 + class615.method3482(arg0, 1));
                        var6.field4150.method2388(255, arg0);
                        var6.field4150.method2353(61, !arg1 ? 0 : 1);
                        class578.method3334(4, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lga", name = "b", descriptor = "(B)V", line = 478)
    public final void method409(byte arg0) {
        if (super.field798.method4287((byte) 92)) {
            super.field799 = 0;
        }
        if (arg0 >= -27) {
            method4154(8, 75, (byte) -45, 39, -118, -36);
        }
        ++field10304;
        if (super.field799 < 0 && super.field799 > 2) {
            super.field799 = this.method405(false);
        }
    }
}
