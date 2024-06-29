import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public class class428 extends class152 {

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "[Lkr;")
    public static class105[] field6114 = new class105[50];

    @OriginalMember(owner = "client!jw", name = "f", descriptor = "F")
    public float field6097;

    @OriginalMember(owner = "client!jw", name = "i", descriptor = "F")
    public float field6100;

    @OriginalMember(owner = "client!jw", name = "j", descriptor = "F")
    public float field6101;

    @OriginalMember(owner = "client!jw", name = "n", descriptor = "F")
    public float field6105;

    @OriginalMember(owner = "client!jw", name = "p", descriptor = "F")
    public float field6107;

    @OriginalMember(owner = "client!jw", name = "z", descriptor = "F")
    public float field6117;

    @OriginalMember(owner = "client!jw", name = "B", descriptor = "F")
    public float field6119;

    @OriginalMember(owner = "client!jw", name = "F", descriptor = "F")
    public float field6123;

    @OriginalMember(owner = "client!jw", name = "G", descriptor = "F")
    public float field6124;

    @OriginalMember(owner = "client!jw", name = "H", descriptor = "F")
    public float field6125;

    @OriginalMember(owner = "client!jw", name = "I", descriptor = "F")
    public float field6126;

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "F")
    public float field6127;

    @OriginalMember(owner = "client!jw", name = "g", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!jw", name = "h", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!jw", name = "k", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!jw", name = "l", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!jw", name = "m", descriptor = "I")
    public static int field6104;

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!jw", name = "q", descriptor = "I")
    public static int field6108;

    @OriginalMember(owner = "client!jw", name = "r", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!jw", name = "s", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!jw", name = "t", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!jw", name = "u", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!jw", name = "v", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!jw", name = "x", descriptor = "I")
    public static int field6115;

    @OriginalMember(owner = "client!jw", name = "y", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!jw", name = "A", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!jw", name = "C", descriptor = "I")
    public static int field6120;

    @OriginalMember(owner = "client!jw", name = "D", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!jw", name = "E", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!jw", name = "K", descriptor = "I")
    public static int field6128;

    @OriginalMember(owner = "client!jw", name = "BA", descriptor = "(III[I)V")
    public final void method178(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field6123);
        int var6 = (int) ((float) arg1 - this.field6097);
        int var7 = (int) ((float) arg0 - this.field6124);
        field6115++;
        arg3[2] = (int) ((float) var5 * this.field6100 + (float) var6 * this.field6105 + (float) var7 * this.field6107);
        arg3[0] = (int) ((float) var5 * this.field6127 + (float) var6 * this.field6126 + (float) var7 * this.field6119);
        arg3[1] = (int) ((float) var5 * this.field6117 + (float) var6 * this.field6125 + (float) var7 * this.field6101);
    }

    @OriginalMember(owner = "client!jw", name = "oa", descriptor = "(I)V")
    public final void method165(int arg0) {
        field6108++;
        this.field6119 = 1.0F;
        this.field6125 = this.field6100 = class355.field4975[arg0 & 0x3FFF];
        this.field6117 = class355.field4977[arg0 & 0x3FFF];
        this.field6101 = this.field6107 = this.field6124 = this.field6126 = this.field6097 = this.field6127 = this.field6123 = 0.0F;
        this.field6105 = -this.field6117;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(Lhw;II[I)V")
    public static final void method2515(class270 arg0, int arg1, int arg2, int[] arg3) {
        if (arg0.field2438 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg0.field2438.length; var5++) {
                if (arg0.field2438[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg0.field2371 != -1) {
                class606 var6 = class480.field6871.method1417(-3585, arg0.field2371);
                int var7 = var6.field8710;
                if (var7 == 1) {
                    arg0.field2378 = arg1;
                    arg0.field2358 = 0;
                    arg0.field2423 = 0;
                    arg0.field2444 = 0;
                    arg0.field2428 = 1;
                    if (!arg0.field2389) {
                        class150.method1144(arg0.field2444, (byte) 104, arg0, var6);
                    }
                }
                if (var7 == 2) {
                    arg0.field2358 = 0;
                }
            }
        }
        field6098++;
        boolean var8 = true;
        for (int var9 = 0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg0.field2438 == null || arg0.field2438[var9] == -1 || class480.field6871.method1417(-3585, arg3[var9]).field8716 >= class480.field6871.method1417(arg2 - 7337, arg0.field2438[var9]).field8716) {
                arg0.field2438 = arg3;
                arg0.field2378 = arg1;
                break;
            }
        }
        if (arg2 != 3752) {
            field6114 = null;
        }
        if (var8) {
            arg0.field2438 = arg3;
            arg0.field2378 = arg1;
        }
    }

    @OriginalMember(owner = "client!jw", name = "AA", descriptor = "(I)V")
    public final void method171(int arg0) {
        field6122++;
        float var2 = class355.field4975[arg0 & 0x3FFF];
        float var3 = class355.field4977[arg0 & 0x3FFF];
        float var4 = this.field6119;
        float var5 = this.field6101;
        float var6 = this.field6107;
        float var7 = this.field6124;
        this.field6119 = var2 * var4 - (this.field6126 * var3);
        this.field6101 = var2 * var5 - this.field6125 * var3;
        this.field6126 = this.field6126 * var2 + var3 * var4;
        this.field6107 = var2 * var6 - this.field6105 * var3;
        this.field6125 = this.field6125 * var2 + var3 * var5;
        this.field6124 = var2 * var7 - (this.field6097 * var3);
        this.field6105 = this.field6105 * var2 + var3 * var6;
        this.field6097 = this.field6097 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!jw", name = "M", descriptor = "(Lq;)V")
    public final void method163(class152 arg0) {
        field6103++;
        class428 var2 = (class428) arg0;
        this.field6105 = var2.field6105;
        this.field6100 = var2.field6100;
        this.field6107 = var2.field6107;
        this.field6126 = var2.field6126;
        this.field6123 = var2.field6123;
        this.field6101 = var2.field6101;
        this.field6127 = var2.field6127;
        this.field6124 = var2.field6124;
        this.field6097 = var2.field6097;
        this.field6119 = var2.field6119;
        this.field6117 = var2.field6117;
        this.field6125 = var2.field6125;
    }

    @OriginalMember(owner = "client!jw", name = "w", descriptor = "(I)V")
    public final void method152(int arg0) {
        field6121++;
        float var2 = class355.field4975[arg0 & 0x3FFF];
        float var3 = class355.field4977[arg0 & 0x3FFF];
        float var4 = this.field6126;
        float var5 = this.field6125;
        float var6 = this.field6105;
        this.field6126 = var2 * var4 - (this.field6127 * var3);
        float var7 = this.field6097;
        this.field6125 = var2 * var5 - this.field6117 * var3;
        this.field6127 = this.field6127 * var2 + var3 * var4;
        this.field6117 = this.field6117 * var2 + var3 * var5;
        this.field6105 = var2 * var6 - (this.field6100 * var3);
        this.field6100 = this.field6100 * var2 + var3 * var6;
        this.field6097 = var2 * var7 - this.field6123 * var3;
        this.field6123 = this.field6123 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!jw", name = "J", descriptor = "(I)V")
    public final void method164(int arg0) {
        this.field6100 = 1.0F;
        field6113++;
        this.field6119 = this.field6125 = class355.field4975[arg0 & 0x3FFF];
        this.field6126 = class355.field4977[arg0 & 0x3FFF];
        this.field6107 = this.field6124 = this.field6105 = this.field6097 = this.field6127 = this.field6117 = this.field6123 = 0.0F;
        this.field6101 = -this.field6126;
    }

    @OriginalMember(owner = "client!jw", name = "o", descriptor = "(I)V")
    public final void method176(int arg0) {
        field6128++;
        this.field6125 = 1.0F;
        this.field6119 = this.field6100 = class355.field4975[arg0 & 0x3FFF];
        this.field6107 = class355.field4977[arg0 & 0x3FFF];
        this.field6127 = -this.field6107;
        this.field6101 = this.field6124 = this.field6126 = this.field6105 = this.field6097 = this.field6117 = this.field6123 = 0.0F;
    }

    @OriginalMember(owner = "client!jw", name = "ZA", descriptor = "(I)V")
    public final void method170(int arg0) {
        field6116++;
        float var2 = class355.field4975[arg0 & 0x3FFF];
        float var3 = class355.field4977[arg0 & 0x3FFF];
        float var4 = this.field6119;
        float var5 = this.field6101;
        float var6 = this.field6107;
        this.field6119 = this.field6127 * var3 + var2 * var4;
        float var7 = this.field6124;
        this.field6127 = this.field6127 * var2 - (var3 * var4);
        this.field6101 = this.field6117 * var3 + var2 * var5;
        this.field6107 = this.field6100 * var3 + var2 * var6;
        this.field6117 = this.field6117 * var2 - var3 * var5;
        this.field6124 = this.field6123 * var3 + var2 * var7;
        this.field6100 = this.field6100 * var2 - (var3 * var6);
        this.field6123 = this.field6123 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(IIIILnf;)V")
    public static final void method2516(int arg0, int arg1, int arg2, int arg3, class119 arg4) {
        field6118++;
        for (class693 var5 = (class693) class33.field477.method3905(-112); var5 != null; var5 = (class693) class33.field477.method3899(0)) {
            if (var5.field9817 == arg0 && arg2 << 9 == var5.field9841 && (arg1 << 9) == var5.field9827 && var5.field9826.field1953 == arg4.field1953) {
                if (var5.field9843 != null) {
                    class387.field5675.method3092(var5.field9843);
                    var5.field9843 = null;
                }
                if (var5.field9818 != null) {
                    class387.field5675.method3092(var5.field9818);
                    var5.field9818 = null;
                }
                var5.method2549((byte) -72);
                return;
            }
        }
        if (arg3 != 1) {
            method2515(null, 18, 31, null);
        }
    }

    @OriginalMember(owner = "client!jw", name = "c", descriptor = "(I)V")
    public static void method2517(int arg0) {
        if (arg0 == 2) {
            field6114 = null;
        }
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(III[I)V")
    public final void method169(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field6100 + (float) arg0 * this.field6127 + (float) arg1 * this.field6117 + this.field6123);
        field6109++;
        arg3[0] = (int) ((float) arg2 * this.field6107 + (float) arg0 * this.field6119 + (float) arg1 * this.field6101 + this.field6124);
        arg3[1] = (int) ((float) arg2 * this.field6105 + (float) arg0 * this.field6126 + (float) arg1 * this.field6125 + this.field6097);
    }

    @OriginalMember(owner = "client!jw", name = "YA", descriptor = "([I)V")
    public final void method156(int[] arg0) {
        field6106++;
        float var2 = (float) arg0[0] - this.field6124;
        float var3 = (float) arg0[1] - this.field6097;
        float var4 = (float) arg0[2] - this.field6123;
        arg0[2] = (int) (this.field6100 * var4 + this.field6107 * var2 + this.field6105 * var3);
        arg0[0] = (int) (this.field6127 * var4 + this.field6126 * var3 + this.field6119 * var2);
        arg0[1] = (int) (this.field6117 * var4 + this.field6125 * var3 + this.field6101 * var2);
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "()Lq;")
    public final class152 method180() {
        field6099++;
        class428 var1 = new class428();
        var1.field6119 = this.field6119;
        var1.field6117 = this.field6117;
        var1.field6125 = this.field6125;
        var1.field6105 = this.field6105;
        var1.field6097 = this.field6097;
        var1.field6123 = this.field6123;
        var1.field6107 = this.field6107;
        var1.field6100 = this.field6100;
        var1.field6101 = this.field6101;
        var1.field6124 = this.field6124;
        var1.field6127 = this.field6127;
        var1.field6126 = this.field6126;
        return var1;
    }

    @OriginalMember(owner = "client!jw", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method2518(byte arg0, String arg1) {
        field6120++;
        return arg0 == -30 ? class451.method2629(arg0 ^ 0xFFFFFFE0, arg1, 10, true) : false;
    }

    @OriginalMember(owner = "client!jw", name = "U", descriptor = "(III)V")
    public final void method158(int arg0, int arg1, int arg2) {
        this.field6097 += arg1;
        this.field6123 += arg2;
        this.field6124 += arg0;
        field6110++;
    }

    @OriginalMember(owner = "client!jw", name = "na", descriptor = "(IIIIII)V")
    public final void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6111++;
        float var7 = class355.field4975[arg3 & 0x3FFF];
        float var8 = class355.field4977[arg3 & 0x3FFF];
        float var9 = class355.field4975[arg4 & 0x3FFF];
        float var10 = class355.field4977[arg4 & 0x3FFF];
        float var11 = class355.field4975[arg5 & 0x3FFF];
        float var12 = class355.field4977[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field6126 = -var9 * var12 + var10 * var13;
        this.field6127 = var7 * var10;
        this.field6117 = -var8;
        this.field6119 = var9 * var11 + var10 * var14;
        this.field6105 = var9 * var13 + var10 * var12;
        this.field6107 = -var10 * var11 + var9 * var14;
        this.field6101 = var7 * var12;
        this.field6100 = var7 * var9;
        this.field6125 = var7 * var11;
        this.field6097 = (float) (-arg0) * this.field6126 - ((float) arg1 * this.field6125) - (float) arg2 * this.field6105;
        this.field6124 = (float) (-arg0) * this.field6119 - ((float) arg1 * this.field6101) - ((float) arg2 * this.field6107);
        this.field6123 = (float) (-arg0) * this.field6127 - (float) arg1 * this.field6117 - ((float) arg2 * this.field6100);
    }

    @OriginalMember(owner = "client!jw", name = "wa", descriptor = "(III[I)V")
    public final void method183(int arg0, int arg1, int arg2, int[] arg3) {
        field6102++;
        arg3[0] = (int) ((float) arg2 * this.field6107 + (float) arg0 * this.field6119 + (float) arg1 * this.field6101);
        arg3[2] = (int) ((float) arg2 * this.field6100 + (float) arg0 * this.field6127 + (float) arg1 * this.field6117);
        arg3[1] = (int) ((float) arg2 * this.field6105 + (float) arg0 * this.field6126 + (float) arg1 * this.field6125);
    }

    @OriginalMember(owner = "client!jw", name = "Y", descriptor = "()V")
    public final void method167() {
        this.field6119 = this.field6125 = this.field6100 = 1.0F;
        field6104++;
        this.field6126 = this.field6127 = this.field6101 = this.field6117 = this.field6107 = this.field6105 = this.field6124 = this.field6097 = this.field6123 = 0.0F;
    }

    @OriginalMember(owner = "client!jw", name = "NA", descriptor = "(III)V")
    public final void method166(int arg0, int arg1, int arg2) {
        this.field6097 = arg1;
        this.field6124 = arg0;
        this.field6126 = this.field6127 = this.field6101 = this.field6117 = this.field6107 = this.field6105 = 0.0F;
        field6112++;
        this.field6119 = this.field6125 = this.field6100 = 1.0F;
        this.field6123 = arg2;
    }

    @OriginalMember(owner = "client!jw", name = "<init>", descriptor = "()V")
    public class428() {
        this.method167();
    }
}
