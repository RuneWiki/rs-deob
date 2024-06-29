import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class778 {

    @OriginalMember(owner = "client!il", name = "J", descriptor = "[I")
    public static int[] field123 = new int[250];

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Lhj;")
    public static class596 field112 = new class596(3, 6);

    @OriginalMember(owner = "client!il", name = "o", descriptor = "F")
    public float field102;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "F")
    public float field106;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "F")
    public float field109;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "F")
    public float field114;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "F")
    public float field116;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "F")
    public float field117;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "F")
    public float field121;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "F")
    public float field122;

    @OriginalMember(owner = "client!il", name = "L", descriptor = "F")
    public static float field125;

    @OriginalMember(owner = "client!il", name = "M", descriptor = "F")
    public float field126;

    @OriginalMember(owner = "client!il", name = "O", descriptor = "F")
    public float field128;

    @OriginalMember(owner = "client!il", name = "Q", descriptor = "F")
    public float field129;

    @OriginalMember(owner = "client!il", name = "R", descriptor = "F")
    public float field130;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field100;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field101;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!il", name = "K", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!il", name = "N", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!il", name = "S", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "(I)V", line = 4)
    public final void method122(int arg0) {
        this.field126 = 1.0F;
        field115++;
        this.field117 = this.field121 = class461.field6477[arg0 & 0x3FFF];
        this.field128 = class461.field6478[arg0 & 0x3FFF];
        this.field114 = -this.field128;
        this.field116 = this.field102 = this.field122 = this.field129 = this.field106 = this.field109 = this.field130 = 0.0F;
    }

    @OriginalMember(owner = "client!il", name = "g", descriptor = "(I)V", line = 16)
    public final void method123(int arg0) {
        field127++;
        float var2 = class461.field6477[arg0 & 0x3FFF];
        float var3 = class461.field6478[arg0 & 0x3FFF];
        float var4 = this.field128;
        float var5 = this.field121;
        float var6 = this.field122;
        this.field128 = var2 * var4 - this.field106 * var3;
        float var7 = this.field129;
        this.field121 = var2 * var5 - this.field109 * var3;
        this.field106 = this.field106 * var2 + var3 * var4;
        this.field122 = var2 * var6 - (this.field126 * var3);
        this.field109 = this.field109 * var2 + var3 * var5;
        this.field129 = var2 * var7 - this.field130 * var3;
        this.field126 = this.field126 * var2 + var3 * var6;
        this.field130 = this.field130 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([I)V", line = 45)
    public final void method124(int[] arg0) {
        field107++;
        float var2 = (float) arg0[0] - this.field102;
        float var3 = (float) arg0[1] - this.field129;
        float var4 = (float) arg0[2] - this.field130;
        arg0[1] = (int) (this.field109 * var4 + this.field121 * var3 + this.field114 * var2);
        arg0[2] = (int) (this.field126 * var4 + this.field122 * var3 + this.field116 * var2);
        arg0[0] = (int) (this.field106 * var4 + this.field128 * var3 + this.field117 * var2);
    }

    @OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V", line = 61)
    public final void method125(int arg0) {
        field111++;
        float var2 = class461.field6477[arg0 & 0x3FFF];
        float var3 = class461.field6478[arg0 & 0x3FFF];
        float var4 = this.field117;
        float var5 = this.field114;
        float var6 = this.field116;
        this.field117 = this.field106 * var3 + var2 * var4;
        float var7 = this.field102;
        this.field114 = this.field109 * var3 + var2 * var5;
        this.field106 = this.field106 * var2 - var3 * var4;
        this.field116 = this.field126 * var3 + var2 * var6;
        this.field109 = this.field109 * var2 - var3 * var5;
        this.field126 = this.field126 * var2 - var3 * var6;
        this.field102 = this.field130 * var3 + var2 * var7;
        this.field130 = this.field130 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V", line = 88)
    public final void method126(int arg0) {
        field119++;
        float var2 = class461.field6477[arg0 & 0x3FFF];
        float var3 = class461.field6478[arg0 & 0x3FFF];
        float var4 = this.field117;
        float var5 = this.field114;
        float var6 = this.field116;
        this.field117 = var2 * var4 - (this.field128 * var3);
        float var7 = this.field102;
        this.field114 = var2 * var5 - this.field121 * var3;
        this.field128 = this.field128 * var2 + var3 * var4;
        this.field121 = this.field121 * var2 + var3 * var5;
        this.field116 = var2 * var6 - (this.field122 * var3);
        this.field102 = var2 * var7 - this.field129 * var3;
        this.field122 = this.field122 * var2 + var3 * var6;
        this.field129 = this.field129 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!il", name = "i", descriptor = "(I)V", line = 116)
    public static final void method127(int arg0) {
        class369.field4590++;
        if (arg0 != 11892) {
            method127(-31);
        }
        field104++;
        class336 var1 = class512.method3076(class320.field3959, class591.field8030, (byte) 64);
        var1.field4150.method2353(73, 0);
        class578.method3334(arg0 - 11888, var1);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V", line = 139)
    public final void method128() {
        this.field128 = this.field106 = this.field114 = this.field109 = this.field116 = this.field122 = this.field102 = this.field129 = this.field130 = 0.0F;
        field98++;
        this.field117 = this.field121 = this.field126 = 1.0F;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V", line = 148)
    public static final void method129(byte arg0) {
        field101++;
        int var1 = -121 % ((57 - arg0) / 45);
        for (class318 var2 = (class318) class444.field5950.method2119(-67); var2 != null; var2 = (class318) class444.field5950.method2111((byte) 50)) {
            if (var2.field3917.method2249(48)) {
                class652.method3684(true, var2.field3915);
            } else {
                var2.field3917.method1490(10);
                try {
                    var2.field3917.method2245(-51);
                } catch (Exception var6) {
                    class705.method4008(var6, "TV: " + var2.field3915, -123);
                    class652.method3684(true, var2.field3915);
                }
                if (!var2.field3907 && !var2.field3911) {
                    class711 var4 = var2.field3917.method2236(123);
                    if (var4 != null) {
                        class720 var5 = var4.method4032((byte) -38);
                        if (var5 != null) {
                            var5.method4072((byte) -9, var2.field3909);
                            class783.field10811.method3258(var5);
                            var2.field3907 = true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)V", line = 209)
    public final void method130(int arg0, int arg1, int arg2) {
        this.field129 = arg1;
        this.field128 = this.field106 = this.field114 = this.field109 = this.field116 = this.field122 = 0.0F;
        this.field102 = arg0;
        this.field130 = arg2;
        this.field117 = this.field121 = this.field126 = 1.0F;
        field103++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V", line = 223)
    public final void method131(int arg0, int arg1, int arg2) {
        this.field129 += arg1;
        this.field102 += arg0;
        this.field130 += arg2;
        field118++;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III[I)V", line = 242)
    public final void method132(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field126 + (float) arg0 * this.field106 + (float) arg1 * this.field109 + this.field130);
        field124++;
        arg3[0] = (int) ((float) arg2 * this.field116 + (float) arg0 * this.field117 + (float) arg1 * this.field114 + this.field102);
        arg3[1] = (int) ((float) arg2 * this.field122 + (float) arg0 * this.field128 + (float) arg1 * this.field121 + this.field129);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIII)V", line = 252)
    public final void method133(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field120++;
        float var7 = class461.field6477[arg3 & 0x3FFF];
        float var8 = class461.field6478[arg3 & 0x3FFF];
        float var9 = class461.field6477[arg4 & 0x3FFF];
        float var10 = class461.field6478[arg4 & 0x3FFF];
        float var11 = class461.field6477[arg5 & 0x3FFF];
        float var12 = class461.field6478[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field114 = var7 * var12;
        this.field122 = var9 * var13 + var10 * var12;
        this.field121 = var7 * var11;
        this.field116 = -var10 * var11 + var9 * var14;
        this.field126 = var7 * var9;
        this.field117 = var9 * var11 + var10 * var14;
        this.field128 = -var9 * var12 + var10 * var13;
        this.field109 = -var8;
        this.field106 = var7 * var10;
        this.field102 = (float) (-arg0) * this.field117 - (float) arg1 * this.field114 - (float) arg2 * this.field116;
        this.field129 = (float) (-arg0) * this.field128 - (float) arg1 * this.field121 - ((float) arg2 * this.field122);
        this.field130 = (float) (-arg0) * this.field106 - (float) arg1 * this.field109 - (float) arg2 * this.field126;
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(III[I)V", line = 287)
    public final void method134(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field102);
        int var6 = (int) ((float) arg2 - this.field130);
        int var7 = (int) ((float) arg1 - this.field129);
        field113++;
        arg3[0] = (int) ((float) var6 * this.field106 + (float) var5 * this.field117 + (float) var7 * this.field128);
        arg3[1] = (int) ((float) var6 * this.field109 + (float) var5 * this.field114 + (float) var7 * this.field121);
        arg3[2] = (int) ((float) var6 * this.field126 + (float) var5 * this.field116 + (float) var7 * this.field122);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III[I)V", line = 301)
    public final void method135(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field126 + (float) arg0 * this.field106 + (float) arg1 * this.field109);
        field105++;
        arg3[1] = (int) ((float) arg2 * this.field122 + (float) arg0 * this.field128 + (float) arg1 * this.field121);
        arg3[0] = (int) ((float) arg2 * this.field116 + (float) arg0 * this.field117 + (float) arg1 * this.field114);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "()Lnh;", line = 312)
    public final class778 method136() {
        field131++;
        class7 var1 = new class7();
        var1.field102 = this.field102;
        var1.field122 = this.field122;
        var1.field117 = this.field117;
        var1.field129 = this.field129;
        var1.field130 = this.field130;
        var1.field128 = this.field128;
        var1.field114 = this.field114;
        var1.field106 = this.field106;
        var1.field121 = this.field121;
        var1.field116 = this.field116;
        var1.field109 = this.field109;
        var1.field126 = this.field126;
        return var1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IZILjava/lang/String;)I", line = 342)
    public static final int method137(int arg0, boolean arg1, int arg2, String arg3) {
        field97++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = arg3.length();
        for (int var8 = arg2; var8 < var7; var8++) {
            char var9 = arg3.charAt(var8);
            if (var8 == 0) {
                if (var9 == '-') {
                    var4 = true;
                    continue;
                }
                if (var9 == '+' && arg1) {
                    continue;
                }
            }
            int var11;
            if (var9 >= '0' && var9 <= '9') {
                var11 = var9 - '0';
            } else if (var9 >= 'A' && var9 <= 'Z') {
                var11 = var9 - '7';
            } else if (var9 >= 'a' && var9 <= 'z') {
                var11 = var9 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (var11 >= arg0) {
                throw new NumberFormatException();
            }
            if (var4) {
                var11 = -var11;
            }
            int var10 = arg0 * var6 + var11;
            if ((var10 / arg0) != var6) {
                throw new NumberFormatException();
            }
            var6 = var10;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 429)
    public final void method138(int arg0) {
        field99++;
        this.field117 = 1.0F;
        this.field121 = this.field126 = class461.field6477[arg0 & 0x3FFF];
        this.field109 = class461.field6478[arg0 & 0x3FFF];
        this.field114 = this.field116 = this.field102 = this.field128 = this.field129 = this.field106 = this.field130 = 0.0F;
        this.field122 = -this.field109;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V", line = 445)
    public final void method139(int arg0) {
        this.field121 = 1.0F;
        field110++;
        this.field117 = this.field126 = class461.field6477[arg0 & 0x3FFF];
        this.field116 = class461.field6478[arg0 & 0x3FFF];
        this.field106 = -this.field116;
        this.field114 = this.field102 = this.field128 = this.field122 = this.field129 = this.field109 = this.field130 = 0.0F;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(B)V", line = 462)
    public static void method140(byte arg0) {
        field112 = null;
        if (arg0 == -104) {
            field123 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 479)
    public class7() {
        this.method128();
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lnh;)V", line = 487)
    public final void method141(class778 arg0) {
        field108++;
        class7 var2 = (class7) arg0;
        this.field129 = var2.field129;
        this.field121 = var2.field121;
        this.field122 = var2.field122;
        this.field106 = var2.field106;
        this.field109 = var2.field109;
        this.field130 = var2.field130;
        this.field117 = var2.field117;
        this.field128 = var2.field128;
        this.field114 = var2.field114;
        this.field116 = var2.field116;
        this.field102 = var2.field102;
        this.field126 = var2.field126;
    }
}
