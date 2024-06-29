import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class213 extends class70 {

    @OriginalMember(owner = "client!es", name = "D", descriptor = "I")
    private int field3425 = 0;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "Lkk;")
    private class102 field3422 = new class102();

    @OriginalMember(owner = "client!es", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3420 = "glow1:";

    @OriginalMember(owner = "client!es", name = "s", descriptor = "Ljava/lang/String;")
    public static String field3414 = null;

    @OriginalMember(owner = "client!es", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3412 = "";

    @OriginalMember(owner = "client!es", name = "u", descriptor = "I")
    public static int field3416 = 0;

    @OriginalMember(owner = "client!es", name = "F", descriptor = "I")
    public static int field3427 = 127;

    @OriginalMember(owner = "client!es", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!es", name = "r", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!es", name = "t", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!es", name = "x", descriptor = "I")
    public static int field3419;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "I")
    public static int field3421;

    @OriginalMember(owner = "client!es", name = "B", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!es", name = "C", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!es", name = "E", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!es", name = "G", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!es", name = "H", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BI)V")
    public final void method435(byte arg0, int arg1) {
        if (arg0 < -45) {
            ++field3426;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lwe;I)V")
    public final void method434(class232 arg0, int arg1) {
        ++field3429;
        super.field875[super.field870] = 21;
        if (arg1 != -29009) {
            field3414 = null;
        }
        super.field872[super.field870] = arg0;
        ++super.field870;
        if (super.field870 >= 5000) {
            super.field870 = 0;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
    private final void method1496(byte arg0) {
        ++field3415;
        int var2 = super.field867++;
        if (super.field867 >= 5000) {
            super.field867 = 0;
        }
        this.field3425 = super.field875[var2];
        Object var3 = super.field872[var2];
        super.field872[var2] = null;
        if (this.field3425 != 21) {
            if (this.field3425 != 20) {
                if (this.field3425 >= 30 && ~this.field3425 >= -34) {
                    class67.field847.method619(3000.0F, super.field874[var2] * 1.5F);
                    ((class129) var3).method784(class235.field3937, class181.field2959, class374.field5649, class241.field3991, this.field3425 - 30 == 0);
                } else if (this.field3425 >= 40 && this.field3425 <= 43) {
                    class67.field847.method619(3000.0F, super.field874[var2] * 1.5F);
                    ((class129) var3).method784(class235.field3937, class181.field2959, class374.field5649, class56.field706, ~(this.field3425 + -40) == -1);
                } else if (this.field3425 == 22) {
                    class67.field847.method575(-1, 1583160, 40);
                } else if (~this.field3425 == -24) {
                    class67.field847.method673();
                } else if (~this.field3425 == -25) {
                    class67.field847.method613(0, (class62[]) null);
                }
            } else {
                class232 var4 = (class232) var3;
                if (var4.field3873 != null) {
                    var4.field3873.method196(class67.field847, (byte) -107);
                }
                if (var4.field3872 != null) {
                    var4.field3872.method196(class67.field847, (byte) -73);
                }
                if (var4.field3878 != null) {
                    var4.field3878.method196(class67.field847, (byte) -77);
                }
                if (var4.field3889 != null) {
                    var4.field3889.method196(class67.field847, (byte) -123);
                }
                if (var4.field3864 != null) {
                    var4.field3864.method196(class67.field847, (byte) -83);
                }
                for (class247 var5 = var4.field3866; var5 != null; var5 = var5.field4054) {
                    var5.field4052.method196(class67.field847, (byte) -72);
                }
            }
        } else {
            class9.method98(this.field3422, (class232) var3);
        }
        if (arg0 != -118) {
            field3416 = 64;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
    public final void method433(int arg0) {
        if (arg0 != 8) {
            method1501(-76);
        }
        ++field3421;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Llf;ZFIZ)V")
    public final void method437(class129 arg0, boolean arg1, float arg2, int arg3, boolean arg4) {
        ++field3411;
        super.field875[super.field870] = (byte) (arg4 ? arg3 + 40 : arg3 + 30);
        super.field872[super.field870] = arg0;
        super.field874[super.field870] = arg2;
        ++super.field870;
        if (arg1) {
            if (super.field870 >= 5000) {
                super.field870 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Lne;I)Lne;")
    public static final class172 method1497(class172 arg0, int arg1) {
        ++field3419;
        if (arg0.field2735 != -1) {
            return class196.method1375(arg0.field2735, (byte) -56);
        } else {
            int var2 = arg0.field2865 >>> 16;
            if (arg1 != 18758) {
                field3412 = null;
            }
            class56 var3 = new class56(class392.field5891);
            for (class196 var4 = (class196) var3.method368(false); var4 != null; var4 = (class196) var3.method367(true)) {
                if (~var4.field3171 == ~var2) {
                    return class196.method1375((int) var4.field2539, (byte) -56);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(IZZ)V")
    public static final void method1498(int arg0, boolean arg1, boolean arg2) {
        ++field3423;
        if (arg0 != 0) {
            field3412 = null;
        }
        if (arg2) {
            ++class292.field4662;
            class199.method1390(false);
        }
        if (arg1) {
            ++class70.field864;
            class91.method541(-99);
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(Lwe;I)V")
    public final void method440(class232 arg0, int arg1) {
        super.field875[super.field870] = 20;
        ++field3417;
        super.field872[super.field870] = arg0;
        if (arg1 >= 119) {
            ++super.field870;
            if (~super.field870 <= -5001) {
                super.field870 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Le;)V")
    public static final void method1499(class312 arg0) {
        for (int var1 = class198.field3193; var1 < class81.field1006; ++var1) {
            for (int var2 = 0; var2 < class156.field2449; ++var2) {
                for (int var3 = 0; var3 < class361.field5513; ++var3) {
                    class232 var4 = class423.field6252[var1][var2][var3];
                    if (var4 != null) {
                        class89 var5 = var4.field3873;
                        class89 var6 = var4.field3872;
                        if (var5 != null && var5.method186(0)) {
                            class239.method1694(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method186(0)) {
                                class239.method1694(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method184(0, arg0, 0, 0, false, var5, 0);
                                var6.method193(0);
                            }
                            var5.method193(0);
                        }
                        for (class247 var7 = var4.field3866; var7 != null; var7 = var7.field4054) {
                            class57 var9 = var7.field4052;
                            if (var9 != null && var9.method186(0)) {
                                class239.method1694(arg0, var9, var1, var2, var3, var9.field710 - var9.field726 + 1, var9.field711 - var9.field720 + 1);
                                var9.method193(0);
                            }
                        }
                        class191 var8 = var4.field3864;
                        if (var8 != null && var8.method186(0)) {
                            class249.method1721(arg0, var8, var1, var2, var3);
                            var8.method193(0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(Z)V")
    public static final void method1500(boolean arg0) {
        class11.field139.field3044 = 0;
        ++field3428;
        class158.field2514.field3044 = 0;
        class85.field1050 = 0;
        class112.field1556 = -1;
        class433.field6397 = -1;
        class345.field5331 = 0;
        class140.field2165 = 0;
        class208.field3345 = -1;
        class281.field4507 = -1;
        class436.method2685(-118);
        class300.method2021(arg0);
        for (int var1 = 0; var1 < class216.field3517.length; ++var1) {
            if (class216.field3517[var1] != null) {
                class216.field3517[var1].field1832 = -1;
            }
        }
        for (int var2 = 0; class39.field499.length > var2; ++var2) {
            if (class39.field499[var2] != null) {
                class39.field499[var2].field1832 = -1;
            }
        }
        class58.method383((byte) -122);
        class13.field194 = 1;
        class128.method953(16205, 30);
        for (int var3 = 0; ~var3 > -101; ++var3) {
            class267.field4296[var3] = true;
        }
        class277.method1865((byte) -103);
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(BLwe;)V")
    public final void method438(byte arg0, class232 arg1) {
        if (arg0 != -9) {
            field3427 = -68;
        }
        --super.field867;
        ++field3424;
        if (~super.field867 > -1) {
            super.field867 = 4999;
        }
        super.field875[super.field867] = 21;
        super.field872[super.field867] = arg1;
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
    public final void method432(int arg0, int arg1) {
        ++field3413;
        if (arg1 != 32) {
            field3412 = null;
        }
        super.field875[super.field870] = (byte) arg0;
        ++super.field870;
        if (super.field870 >= 5000) {
            super.field870 = 0;
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V")
    public final void method436(int arg0) {
        if (arg0 >= -102) {
            this.field3422 = null;
        }
        ++field3418;
        while (~super.field870 != ~super.field867) {
            this.method1496((byte) -118);
        }
    }

    @OriginalMember(owner = "client!es", name = "d", descriptor = "(I)V")
    public static void method1501(int arg0) {
        field3420 = null;
        field3412 = null;
        int var1 = 125 % ((arg0 - -57) / 40);
        field3414 = null;
    }
}
