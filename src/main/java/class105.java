import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class105 extends class187 {

    @OriginalMember(owner = "client!si", name = "P", descriptor = "Ljp;")
    public static class55 field1616 = new class55(90, 1);

    @OriginalMember(owner = "client!si", name = "I", descriptor = "B")
    public byte field1609;

    @OriginalMember(owner = "client!si", name = "Q", descriptor = "F")
    public static float field1617;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!si", name = "L", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!si", name = "N", descriptor = "I")
    public int field1614;

    @OriginalMember(owner = "client!si", name = "O", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!si", name = "R", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!si", name = "M", descriptor = "Lfh;")
    public class194 field1613;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Lum;")
    public static class83 field1610;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IJLza;)V")
    public static final void method837(int arg0, long arg1, class299 arg2) {
        class499.field7271 = class285.field4447;
        class37.field473 = 0;
        ++field1615;
        class285.field4447 = 0;
        long var4 = class375.method2397((byte) -75);
        for (class382 var6 = (class382) class73.field1251.method1076((byte) 118); var6 != null; var6 = (class382) class73.field1251.method1077(-1)) {
            if (var6.method2425(arg2, arg1)) {
                ++class37.field473;
            }
        }
        int var7 = 71 % ((55 - arg0) / 45);
        if (class431.field6390 && ~(arg1 % 100L) == -1L) {
            System.out.println("Particle system count: " + class73.field1251.method1075(true) + ", running: " + class37.field473 + ". Particles: " + class285.field4447 + ". Time taken: " + (class375.method2397((byte) -75) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)V")
    public static final void method838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class231 var7 = new class231();
        var7.field3467 = arg1 >> class295.field4543;
        var7.field3462 = arg2 >> class295.field4543;
        var7.field3463 = arg3 >> class295.field4543;
        var7.field3481 = arg4 >> class295.field4543;
        var7.field3472 = arg0;
        var7.field3468 = arg1;
        var7.field3474 = arg2;
        var7.field3464 = arg3;
        var7.field3480 = arg4;
        var7.field3476 = arg5;
        var7.field3469 = arg6;
        class155.field2378[class259.field4155++] = var7;
    }

    @OriginalMember(owner = "client!si", name = "i", descriptor = "(I)V")
    public static void method839(int arg0) {
        field1616 = null;
        if (arg0 != 0) {
            method838(-51, 126, -82, 72, 127, -26, -58);
        }
        field1610 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Luu;Z)V")
    public static final void method840(class428 arg0, boolean arg1) {
        ++field1612;
        int var2 = 0;
        arg0.method2666(126);
        for (int var3 = 0; ~var3 > ~class422.field6205; ++var3) {
            int var15 = class506.field7363[var3];
            if (~(class441.field6560[var15] & 1) == -1) {
                if (var2 > 0) {
                    --var2;
                    class441.field6560[var15] = (byte) class19.method118(class441.field6560[var15], 2);
                } else {
                    int var16 = arg0.method2671(-121, 1);
                    if (var16 == 0) {
                        var2 = class411.method2586(arg0, -87);
                        class441.field6560[var15] = (byte) class19.method118(class441.field6560[var15], 2);
                    } else {
                        class149.method1061(arg0, 6892, var15);
                    }
                }
            }
        }
        arg0.method2673((byte) 112);
        if (~var2 != -1) {
            throw new RuntimeException("nsn0");
        } else {
            arg0.method2666(-105);
            for (int var4 = 0; ~class422.field6205 < ~var4; ++var4) {
                int var13 = class506.field7363[var4];
                if ((class441.field6560[var13] & 1) != 0) {
                    if (var2 > 0) {
                        class441.field6560[var13] = (byte) class19.method118(class441.field6560[var13], 2);
                        --var2;
                    } else {
                        int var14 = arg0.method2671(-117, 1);
                        if (~var14 == -1) {
                            var2 = class411.method2586(arg0, -63);
                            class441.field6560[var13] = (byte) class19.method118(class441.field6560[var13], 2);
                        } else {
                            class149.method1061(arg0, 6892, var13);
                        }
                    }
                }
            }
            if (arg1) {
                method840((class428) null, false);
            }
            arg0.method2673((byte) 112);
            if (var2 != 0) {
                throw new RuntimeException("nsn1");
            } else {
                arg0.method2666(-109);
                for (int var5 = 0; var5 < class110.field1648; ++var5) {
                    int var11 = class221.field3321[var5];
                    if (~(1 & class441.field6560[var11]) != -1) {
                        if (var2 > 0) {
                            --var2;
                            class441.field6560[var11] = (byte) class19.method118(class441.field6560[var11], 2);
                        } else {
                            int var12 = arg0.method2671(-123, 1);
                            if (~var12 == -1) {
                                var2 = class411.method2586(arg0, -47);
                                class441.field6560[var11] = (byte) class19.method118(class441.field6560[var11], 2);
                            } else if (class472.method2862(arg0, var11, true)) {
                                class441.field6560[var11] = (byte) class19.method118(class441.field6560[var11], 2);
                            }
                        }
                    }
                }
                arg0.method2673((byte) 112);
                if (~var2 != -1) {
                    throw new RuntimeException("nsn2");
                } else {
                    arg0.method2666(124);
                    for (int var6 = 0; class110.field1648 > var6; ++var6) {
                        int var9 = class221.field3321[var6];
                        if ((class441.field6560[var9] & 1) == 0) {
                            if (~var2 < -1) {
                                class441.field6560[var9] = (byte) class19.method118(class441.field6560[var9], 2);
                                --var2;
                            } else {
                                int var10 = arg0.method2671(-119, 1);
                                if (~var10 == -1) {
                                    var2 = class411.method2586(arg0, -43);
                                    class441.field6560[var9] = (byte) class19.method118(class441.field6560[var9], 2);
                                } else if (class472.method2862(arg0, var9, true)) {
                                    class441.field6560[var9] = (byte) class19.method118(class441.field6560[var9], 2);
                                }
                            }
                        }
                    }
                    arg0.method2673((byte) 112);
                    if (var2 != 0) {
                        throw new RuntimeException("nsn3");
                    } else {
                        class422.field6205 = 0;
                        class110.field1648 = 0;
                        for (int var7 = 1; ~var7 > -2049; ++var7) {
                            class441.field6560[var7] = (byte) (class441.field6560[var7] >> 1);
                            class511 var8 = class530.field7747[var7];
                            if (var8 != null) {
                                class506.field7363[class422.field6205++] = var7;
                            } else {
                                class221.field3321[class110.field1648++] = var7;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "g", descriptor = "(I)[B")
    public final byte[] method841(int arg0) {
        if (arg0 != 9267) {
            this.method841(0);
        }
        ++field1618;
        if (!super.field2870 && ~this.field1613.field2982 <= ~(this.field1613.field2973.length + -this.field1609)) {
            return this.field1613.field2973;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!si", name = "h", descriptor = "(I)I")
    public final int method842(int arg0) {
        ++field1611;
        if (arg0 != 8030) {
            field1617 = 1.0954936F;
        }
        return this.field1613 == null ? 0 : this.field1613.field2982 * 100 / (this.field1613.field2973.length - this.field1609);
    }
}
