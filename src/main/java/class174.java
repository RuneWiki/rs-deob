import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class174 extends class35 {

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public int field2792 = 0;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field2802 = 0;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field2794 = 0;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field2786;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "I")
    public int field2787;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public int field2791;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public int field2795;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public int field2797;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public int field2800;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!wc", name = "O", descriptor = "I")
    public int field2805;

    @OriginalMember(owner = "client!wc", name = "P", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Lrg;")
    public class255 field2790;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "Lve;")
    public class278 field2788;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "Ljl;")
    public class315 field2780;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Ljl;")
    public class315 field2789;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Lga;")
    public class31 field2799;

    @OriginalMember(owner = "client!wc", name = "Q", descriptor = "Z")
    public boolean field2807;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[I")
    public int[] field2781;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "[I")
    public static int[] field2793;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIII)I", line = 11)
    public static final int method1095(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 14327) {
            field2796 = -75;
        }
        int var4 = class284.field4387[class20.method152(arg0, arg1)];
        if (arg3 > 0) {
            int var5 = class284.field4393.method402(false, arg3 & 0xFFFF);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 <= 127) {
                    var6 = arg1 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00) * var5 + ((var4 & 0xFF00) * var8) & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class284.field4393.method390(true, arg3 & 0xFFFF);
            if (var9 != 0) {
                var9 += 256;
                int var10 = ((var4 & 0xFF0000) >> 16) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = (var4 >> 8 & 0xFF) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var12 >> 8) + ((var10 & 0xEC00FF00) << 8) + (var11 & 0xFF00);
            }
        }
        field2785++;
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V", line = 85)
    public static final void method1096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2784++;
        if (arg4 != -3061) {
            method1098(18);
        }
        int var6 = (arg0 - 32) * arg0 / arg1;
        class283.field4385[0].method717(arg5, arg3);
        class283.field4385[1].method717(arg5, arg0 + arg3 - 16);
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg2 / (arg1 - arg0);
        if (!class249.field3893) {
            class270.method1811(arg5, arg3 + 16, 16, arg0 - 32, class79.field1551);
            class270.method1811(arg5, var7 + arg3 + 16, 16, var6, class183.field2932);
            class270.method1804(arg5, arg3 + var7 + 16, var6, class166.field2678);
            class270.method1804(arg5 + 1, arg3 - (-var7 + -16), var6, class166.field2678);
            class270.method1812(arg5, arg3 + var7 + 16, 16, class166.field2678);
            class270.method1812(arg5, arg3 - (-var7 - 17), 16, class166.field2678);
            class270.method1804(arg5 + 15, var7 + 16 + arg3, var6, class185.field3016);
            class270.method1804(arg5 + 14, 17 - -var7 + arg3, var6 - 1, class185.field3016);
            class270.method1812(arg5, arg3 + var7 + var6 + 15, 16, class185.field3016);
            class270.method1812(arg5 + 1, arg3 + 14 - (-var7 - var6), 15, class185.field3016);
            return;
        }
        class115.method755(arg5, arg3 + 16, 16, arg0 - 32, class79.field1551);
        class115.method755(arg5, arg3 + var7 + 16, 16, var6, class183.field2932);
        class115.method759(arg5, arg3 + var7 + 16, var6, class166.field2678);
        class115.method759(arg5 + 1, arg3 + var7 + 16, var6, class166.field2678);
        class115.method750(arg5, arg3 + var7 + 16, 16, class166.field2678);
        class115.method750(arg5, var7 + arg3 + 17, 16, class166.field2678);
        class115.method759(arg5 + 15, arg3 - -16 - -var7, var6, class185.field3016);
        class115.method759(arg5 + 14, arg3 - -var7 + 17, var6 - 1, class185.field3016);
        class115.method750(arg5, var7 + var6 + arg3 + 15, 16, class185.field3016);
        class115.method750(arg5 + 1, arg3 + 14 + var7 - -var6, 15, class185.field3016);
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V", line = 134)
    public final void method1097(int arg0) {
        if (arg0 != 128) {
            this.field2787 = -115;
        }
        field2782++;
        int var2 = this.field2786;
        if (this.field2799 != null) {
            class31 var5 = this.field2799.method250((byte) -45);
            if (var5 == null) {
                this.field2805 = 0;
                this.field2800 = 0;
                this.field2781 = null;
                this.field2804 = 0;
                this.field2786 = -1;
                this.field2797 = 0;
            } else {
                this.field2781 = var5.field568;
                this.field2805 = var5.field590;
                this.field2804 = var5.field575;
                this.field2800 = var5.field617 * 128;
                this.field2797 = var5.field599;
                this.field2786 = var5.field567;
            }
        } else if (this.field2790 != null) {
            int var3 = class324.method2246(-1, this.field2790);
            if (var2 != var3) {
                this.field2786 = var3;
                class44 var4 = this.field2790.field3991;
                if (var4.field888 != null) {
                    var4 = var4.method338(arg0 ^ 0x4577);
                }
                if (var4 == null) {
                    this.field2805 = this.field2800 = 0;
                } else {
                    this.field2805 = var4.field886;
                    this.field2800 = var4.field829 * 128;
                }
            }
        } else if (this.field2788 != null) {
            this.field2786 = class188.method1199(this.field2788, 259336492);
            this.field2805 = this.field2788.field4280;
            this.field2800 = this.field2788.field4273 * 128;
        }
        if (this.field2786 != var2 && this.field2789 != null) {
            class11.field230.method1237(this.field2789);
            this.field2789 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V", line = 216)
    public static final void method1098(int arg0) {
        field2806++;
        if (!class86.field1617) {
            return;
        }
        class68 var1 = class233.method1548((byte) -16, class333.field5113, class6.field135);
        if (var1 != null && var1.field1345 != null) {
            class106 var2 = new class106();
            var2.field1841 = var1.field1345;
            var2.field1823 = var1;
            class156.method1008(true, var2);
        }
        class86.field1617 = false;
        class268.field4140 = arg0;
        class317.method2183((byte) -7, var1);
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)V", line = 264)
    public static void method1099(byte arg0) {
        field2793 = null;
        if (arg0 > -42) {
            method1098(-123);
        }
    }
}
