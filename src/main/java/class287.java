import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class287 extends class326 {

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    private int field3785;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    private int field3786;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    private int field3779;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "Lag;")
    private class469 field3793;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    private int field3788;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    private int field3782;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "[I")
    public static int[] field3780 = new int[4];

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field3789 = 0;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "F")
    public static float field3792;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "I")
    public static int field3791;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "Ld;")
    private class327 field3787;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V", line = 3)
    public static void method1699(int arg0) {
        field3780 = null;
        if (arg0 != 547857154) {
            field3789 = 32;
        }
    }

    @OriginalMember(owner = "client!md", name = "f", descriptor = "(I)V", line = 14)
    public static final void method1700(int arg0) {
        field3790++;
        class610.field8468.method1041(((float) class602.field8408.field4303 * 0.1F + 0.7F) * class640.field8827);
        class610.field8468.method1060(class115.field1480, class668.field9496, field3792, (float) (class498.field6847 << 2), (float) (class125.field1742 << 2), (float) (class180.field2531 << 2));
        class610.field8468.method1048(class494.field6810);
        if (arg0 != 1) {
            method1703(70, 87, -76, -21, -36, 85);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 40)
    public static final int method1701(String arg0, byte arg1) {
        field3784++;
        int var2 = arg0.length();
        int var3 = 0;
        if (arg1 != -7) {
            field3780 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + arg0.charAt(var4) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Ld;", line = 68)
    public final class327 method1702(int arg0) {
        field3783++;
        if (this.field3787 == null) {
            class479.field6663[4] = this.field3779;
            class522 var2 = this.field3793.field7682;
            class479.field6663[5] = this.field3785;
            class479.field6663[2] = this.field3782;
            class479.field6663[0] = this.field3786;
            class479.field6663[1] = this.field3781;
            class479.field6663[3] = this.field3788;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method2961(true, class479.field6663[var5])) {
                    return null;
                }
                class105 var7 = var2.method2959(74, class479.field6663[var5]);
                int var8 = var7.field1260 ? 64 : 128;
                if (var7.field1261 > 0) {
                    var3 = 1;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class76.field900[var6] = var2.method2964(class479.field6663[var6], (byte) 67, var4, false, 1.0F, var4);
            }
            this.field3787 = new class327(this.field3793, 6407, var4, var3 != 0, class76.field900);
        }
        if (arg0 != 4) {
            method1701(null, (byte) 57);
        }
        return this.field3787;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII)V", line = 130)
    public static final void method1703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3791++;
        int var6 = arg4 - arg3;
        int var7 = arg0 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class120.method704(arg3, arg0, arg1, 0, arg5);
            }
        } else if (var7 == 0) {
            class17.method108(arg4, arg1, arg3, 320, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg3 * var8 >> 12);
            int var10;
            int var11;
            if (class281.field3703 > arg3) {
                var10 = class281.field3703;
                var11 = (class281.field3703 * var8 >> 12) + var9;
            } else if (arg3 > class255.field3350) {
                var10 = class255.field3350;
                var11 = (class255.field3350 * var8 >> 12) + var9;
            } else {
                var11 = arg1;
                var10 = arg3;
            }
            int var12;
            int var13;
            if (arg4 < class281.field3703) {
                var13 = class281.field3703;
                var12 = var9 + (class281.field3703 * var8 >> 12);
            } else if (class255.field3350 >= arg4) {
                var12 = arg0;
                var13 = arg4;
            } else {
                var12 = (class255.field3350 * var8 >> 12) + var9;
                var13 = class255.field3350;
            }
            int var14 = -107 % ((38 - arg2) / 49);
            if (var11 < class6.field66) {
                var10 = (class6.field66 - var9 << 12) / var8;
                var11 = class6.field66;
            } else if (class151.field2071 < var11) {
                var11 = class151.field2071;
                var10 = (class151.field2071 - var9 << 12) / var8;
            }
            if (var12 < class6.field66) {
                var13 = (class6.field66 - var9 << 12) / var8;
                var12 = class6.field66;
            } else if (class151.field2071 < var12) {
                var13 = (class151.field2071 - var9 << 12) / var8;
                var12 = class151.field2071;
            }
            class193.method1264(var11, var13, arg5, var12, (byte) -34, var10);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lag;IIIIII)V", line = 234)
    public class287(class469 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3785 = arg6;
        this.field3786 = arg1;
        this.field3779 = arg5;
        this.field3793 = arg0;
        this.field3781 = arg2;
        this.field3788 = arg4;
        this.field3782 = arg3;
    }
}
