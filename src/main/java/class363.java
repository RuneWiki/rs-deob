import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public abstract class class363 extends class27 {

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "S")
    public short field4796;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "S")
    public short field4803;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "F")
    public static float field4794;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    public static int field4804;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "(I)Z", line = 5)
    public final boolean method164(int arg0) {
        int var2 = 39 / ((arg0 - -42) / 58);
        ++field4798;
        return class244.method1496(super.field398 >> class62.field762, this.method176((byte) -115), 100, super.field397 >> class62.field762, super.field386);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIJIILga;I)V", line = 16)
    public static final void method2119(int arg0, boolean arg1, int arg2, long arg3, int arg4, int arg5, class332 arg6, int arg7) {
        class253.field3319 = 10000;
        class542.field7429 = arg3;
        class110.field1302 = arg5;
        class285.field3762 = arg6;
        ++field4799;
        class111.field1339 = arg1;
        class574.field7844 = 1;
        class174.field2461 = arg0;
        class288.field3804 = arg2;
        class401.field5322 = arg7;
        if (arg4 <= 61) {
            field4794 = -0.056619406F;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILir;ZILr;IB)V", line = 39)
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        ++field4797;
        if (arg6 >= -117) {
            this.field4803 = 105;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "([Lqea;B)I", line = 51)
    public final int method170(class392[] arg0, byte arg1) {
        ++field4795;
        if (arg1 <= 9) {
            field4794 = -1.139994F;
        }
        return this.method178(super.field398 >> class62.field762, arg0, 1, super.field397 >> class62.field762);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Z", line = 64)
    public final boolean method171(boolean arg0) {
        ++field4802;
        if (arg0) {
            field4794 = -1.4111121F;
        }
        return class165.field2371[(super.field398 >> class62.field762) + -class501.field6888 + class312.field4204][(super.field397 >> class62.field762) + -class377.field4997 - -class312.field4204];
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z[[[Lse;)V", line = 75)
    public static final void method2120(boolean arg0, class207[][][] arg1) {
        ++field4804;
        int var2 = 0;
        if (arg0) {
            method2119(10, true, 19, 26L, -34, 108, (class332) null, 124);
        }
        while (var2 < arg1.length) {
            class207[][] var3 = arg1[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; var3[var4].length > var5; ++var5) {
                    class207 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field2765 instanceof class599) {
                            ((class599) var6.field2765).method703(6956);
                        }
                        if (var6.field2763 instanceof class599) {
                            ((class599) var6.field2763).method703(6956);
                        }
                        if (var6.field2764 instanceof class599) {
                            ((class599) var6.field2764).method703(6956);
                        }
                        if (var6.field2768 instanceof class599) {
                            ((class599) var6.field2768).method703(6956);
                        }
                        if (var6.field2767 instanceof class599) {
                            ((class599) var6.field2767).method703(6956);
                        }
                        for (class634 var7 = var6.field2774; var7 != null; var7 = var7.field8764) {
                            class29 var8 = var7.field8767;
                            if (var8 instanceof class599) {
                                ((class599) var8).method703(6956);
                            }
                        }
                    }
                }
            }
            ++var2;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lhe;I)V", line = 152)
    public static final void method2121(class231 arg0, int arg1) {
        ++field4793;
        boolean var2 = false;
        if (class327.field4404 != arg0.field2984 && ~arg0.field3048 != 0 && ~arg0.field3068 == -1) {
            class186 var3 = class423.field5620.method1707(arg0.field3048, arg1 + -9556);
            if (var3.field2585 || arg0.field3058 + 1 > var3.field2595[arg0.field2991]) {
                var2 = true;
            }
        } else {
            var2 = true;
        }
        if (var2) {
            int var4 = -arg0.field3036 + arg0.field2984;
            int var5 = -arg0.field3036 + class327.field4404;
            int var6 = arg0.field3050 * 512 + 256 * arg0.method1435((byte) 97);
            int var7 = arg0.field3060 * 512 + arg0.method1435((byte) 104) * 256;
            int var8 = arg0.field3033 * 512 + 256 * arg0.method1435((byte) 75);
            int var9 = arg0.field3039 * 512 + arg0.method1435((byte) 121) * 256;
            arg0.field397 = ((-var5 + var4) * var7 + var5 * var9) / var4;
            arg0.field398 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        if (arg1 != 9437) {
            field4794 = 0.35656503F;
        }
        arg0.field3087 = 0;
        if (arg0.field3069 == 0) {
            arg0.method1439(false, 13, 8192);
        }
        if (arg0.field3069 == 1) {
            arg0.method1439(false, arg1 ^ 9352, 12288);
        }
        if (arg0.field3069 == 2) {
            arg0.method1439(false, 12, 0);
        }
        if (~arg0.field3069 == -4) {
            arg0.method1439(false, arg1 ^ 9377, 4096);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(IIIIIII)V", line = 210)
    public class363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field385 = (byte) arg3;
        this.field4796 = (short) arg5;
        super.field397 = arg2;
        super.field388 = arg1;
        super.field386 = (byte) arg4;
        this.field4803 = (short) arg6;
        super.field398 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "(I)Z", line = 224)
    public final boolean method166(int arg0) {
        ++field4801;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 236)
    public final void method175(byte arg0) {
        if (arg0 >= 24) {
            ++field4800;
            throw new IllegalStateException();
        }
    }
}
