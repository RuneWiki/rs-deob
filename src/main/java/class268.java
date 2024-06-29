import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class268 extends class194 {

    @OriginalMember(owner = "client!sd", name = "Fb", descriptor = "I")
    public static int field4260 = 2;

    @OriginalMember(owner = "client!sd", name = "J", descriptor = "Lpt;")
    public static class308 field4258 = new class308("stellardawn", 1);

    @OriginalMember(owner = "client!sd", name = "Jb", descriptor = "[I")
    public static int[] field4264 = new int[32];

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!sd", name = "Gb", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!sd", name = "Hb", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!sd", name = "Ib", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "(B)V")
    public static final void method1856(byte arg0) {
        ++field4261;
        if (arg0 != 33) {
            method1858(-27, (byte) 122);
        }
        for (int var1 = 0; var1 < class510.field7414; ++var1) {
            class128 var2 = class258.field4135[var1];
            boolean var3 = false;
            if (var2.field1909 != null) {
                if (!var2.field1909.method949(1767)) {
                    var3 = true;
                }
            } else {
                --var2.field1906;
                if ((var2.field1904 == 2 ? -1500 : -10) <= var2.field1906) {
                    if (~var2.field1904 == -2 && var2.field1912 == null) {
                        var2.field1912 = class102.method828(class365.field5379, var2.field1907, 0);
                        if (var2.field1912 == null) {
                            continue;
                        }
                        var2.field1906 += var2.field1912.method827();
                    } else if (~var2.field1904 == -3 && (var2.field1908 == null || var2.field1910 == null)) {
                        if (var2.field1908 == null) {
                            var2.field1908 = class135.method991(class144.field2122, var2.field1907);
                        }
                        if (var2.field1908 == null) {
                            continue;
                        }
                        if (var2.field1910 == null) {
                            var2.field1910 = var2.field1908.method987(new int[] { 22050 });
                            if (var2.field1910 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field1906 < 0) {
                        int var4;
                        if (var2.field1905 == 0) {
                            var4 = class40.field667.field4199 * var2.field1914 >> 8;
                        } else {
                            int var5 = var2.field1905 >> 24 & 3;
                            if (class116.field1781.field1274 != var5) {
                                var4 = 0;
                            } else {
                                int var6 = var2.field1905 << 7 & 32640;
                                int var7 = var2.field1905 >> 16 & 255;
                                int var8 = (var7 << 7) + 64 - class116.field1781.field1275;
                                if (~var8 > -1) {
                                    var8 = -var8;
                                }
                                int var9 = var2.field1905 >> 8 & 255;
                                int var10 = (var9 << 7) + 64 + -class116.field1781.field1279;
                                if (~var10 > -1) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field1906 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * class40.field667.field4222 * var2.field1914 / var6 >> 8;
                            }
                        }
                        if (var4 > 0) {
                            class79 var12 = null;
                            if (var2.field1904 == 1) {
                                var12 = var2.field1912.method825().method706(class411.field6072);
                            } else if (~var2.field1904 == -3) {
                                var12 = var2.field1910;
                            }
                            class248 var13 = var2.field1909 = class248.method1672(var12, 100, var4);
                            var13.method1697(var2.field1913 + -1);
                            class503.field7313.method1807(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            }
            if (var3) {
                --class510.field7414;
                for (int var14 = var1; var14 < class510.field7414; ++var14) {
                    class258.field4135[var14] = class258.field4135[var14 + 1];
                }
                --var1;
            }
        }
        if (class326.field4938 && !class444.method2741(2730)) {
            if (class40.field667.field4192 != 0 && class235.field3548 != -1) {
                class15.method87(class235.field3548, class40.field667.field4192, 0, class417.field6135, false, 19900);
            }
            class326.field4938 = false;
        } else if (class40.field667.field4192 != 0 && class235.field3548 != -1 && !class444.method2741(2730)) {
            class110.method857(arg0 + 4062, class434.field6445);
            ++class467.field6882;
            class312.field4752.method1348((byte) -65, class235.field3548);
            class235.field3548 = -1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ZF)V")
    public final void method1857(boolean arg0, float arg1) {
        ++field4262;
        if (arg0) {
            field4260 = -42;
        }
        int var3 = NativeStream.floatToRawIntBits(arg1);
        super.field2973[super.field2982++] = (byte) (var3 >> 24);
        super.field2973[super.field2982++] = (byte) (var3 >> 16);
        super.field2973[super.field2982++] = (byte) (var3 >> 8);
        super.field2973[super.field2982++] = (byte) var3;
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(IB)I")
    public static final int method1858(int arg0, byte arg1) {
        ++field4263;
        if (arg1 > -127) {
            method1858(40, (byte) -47);
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(FI)V")
    public final void method1859(float arg0, int arg1) {
        ++field4259;
        if (arg1 == 0) {
            int var3 = NativeStream.floatToRawIntBits(arg0);
            super.field2973[super.field2982++] = (byte) var3;
            super.field2973[super.field2982++] = (byte) (var3 >> 8);
            super.field2973[super.field2982++] = (byte) (var3 >> 16);
            super.field2973[super.field2982++] = (byte) (var3 >> 24);
        }
    }

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "(I)V")
    public static void method1860(int arg0) {
        if (arg0 == 0) {
            field4264 = null;
            field4258 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "(I)V")
    public class268(int arg0) {
        super(arg0);
    }
}
