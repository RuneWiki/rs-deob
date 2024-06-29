import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class192 extends class480 {

    @OriginalMember(owner = "client!tf", name = "K", descriptor = "Lvg;")
    public static class38 field2814 = null;

    @OriginalMember(owner = "client!tf", name = "M", descriptor = "B")
    public byte field2816;

    @OriginalMember(owner = "client!tf", name = "J", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!tf", name = "N", descriptor = "I")
    public int field2817;

    @OriginalMember(owner = "client!tf", name = "O", descriptor = "I")
    public static int field2818;

    @OriginalMember(owner = "client!tf", name = "P", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!tf", name = "Q", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!tf", name = "I", descriptor = "Ldh;")
    public class209 field2812;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "(I)V", line = 4)
    public static final void method1301(int arg0) {
        ++field2813;
        if (arg0 != 2) {
            method1301(73);
        }
        class440.method2650();
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)I", line = 16)
    public final int method1293(int arg0) {
        ++field2820;
        if (arg0 != 100) {
            this.field2817 = -94;
        }
        return this.field2812 == null ? 0 : this.field2812.field3037 * 100 / (this.field2812.field3036.length - this.field2816);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lmv;I)V", line = 38)
    public static final void method1302(class252 arg0, int arg1) {
        ++field2818;
        int var2 = 0;
        arg0.method1695(88);
        for (int var3 = 0; class74.field1105 > var3; ++var3) {
            int var15 = class272.field3948[var3];
            if ((1 & class182.field2659[var15]) == 0) {
                if (~var2 < -1) {
                    class182.field2659[var15] = (byte) class18.method119(class182.field2659[var15], 2);
                    --var2;
                } else {
                    int var16 = arg0.method1690((byte) 1, 1);
                    if (~var16 == -1) {
                        var2 = class104.method644(-1, arg0);
                        class182.field2659[var15] = (byte) class18.method119(class182.field2659[var15], 2);
                    } else {
                        class154.method993(-106, var15, arg0);
                    }
                }
            }
        }
        arg0.method1691(false);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method1695(58);
            for (int var4 = 0; ~var4 > ~class74.field1105; ++var4) {
                int var13 = class272.field3948[var4];
                if (~(1 & class182.field2659[var13]) != -1) {
                    if (~var2 < -1) {
                        --var2;
                        class182.field2659[var13] = (byte) class18.method119(class182.field2659[var13], 2);
                    } else {
                        int var14 = arg0.method1690((byte) 1, 1);
                        if (var14 == 0) {
                            var2 = class104.method644(-1, arg0);
                            class182.field2659[var13] = (byte) class18.method119(class182.field2659[var13], 2);
                        } else {
                            class154.method993(-102, var13, arg0);
                        }
                    }
                }
            }
            arg0.method1691(false);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method1695(56);
                for (int var5 = 0; var5 < class338.field4760; ++var5) {
                    int var11 = class208.field2972[var5];
                    if (~(class182.field2659[var11] & 1) != -1) {
                        if (~var2 < -1) {
                            class182.field2659[var11] = (byte) class18.method119(class182.field2659[var11], 2);
                            --var2;
                        } else {
                            int var12 = arg0.method1690((byte) 1, 1);
                            if (~var12 == -1) {
                                var2 = class104.method644(-1, arg0);
                                class182.field2659[var11] = (byte) class18.method119(class182.field2659[var11], 2);
                            } else if (class528.method3120(arg0, var11, -78)) {
                                class182.field2659[var11] = (byte) class18.method119(class182.field2659[var11], 2);
                            }
                        }
                    }
                }
                arg0.method1691(false);
                if (var2 != 0) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method1695(17);
                    if (arg1 != -23000) {
                        method1303(71);
                    }
                    for (int var6 = 0; ~class338.field4760 < ~var6; ++var6) {
                        int var9 = class208.field2972[var6];
                        if ((1 & class182.field2659[var9]) == 0) {
                            if (~var2 < -1) {
                                class182.field2659[var9] = (byte) class18.method119(class182.field2659[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg0.method1690((byte) 1, 1);
                                if (~var10 == -1) {
                                    var2 = class104.method644(-1, arg0);
                                    class182.field2659[var9] = (byte) class18.method119(class182.field2659[var9], 2);
                                } else if (class528.method3120(arg0, var9, -71)) {
                                    class182.field2659[var9] = (byte) class18.method119(class182.field2659[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method1691(false);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class338.field4760 = 0;
                        class74.field1105 = 0;
                        for (int var7 = 1; var7 < 2048; ++var7) {
                            class182.field2659[var7] = (byte) (class182.field2659[var7] >> 1);
                            class239 var8 = class44.field707[var7];
                            if (var8 != null) {
                                class272.field3948[class74.field1105++] = var7;
                            } else {
                                class208.field2972[class338.field4760++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "(I)V", line = 243)
    public static void method1303(int arg0) {
        field2814 = null;
        if (arg0 != -1) {
            field2814 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)[B", line = 261)
    public final byte[] method1291(int arg0) {
        ++field2819;
        if (arg0 != 0) {
            return null;
        } else if (!super.field7045 && this.field2812.field3037 >= this.field2812.field3036.length - this.field2816) {
            return this.field2812.field3036;
        } else {
            throw new RuntimeException();
        }
    }
}
