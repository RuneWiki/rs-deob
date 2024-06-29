import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class711 extends class650 {

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field9781 = -1;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "Z")
    public static volatile boolean field9797 = true;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Lwg;")
    public static class450 field9786 = new class450(6, 0, 4, 2);

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "[Ljo;")
    public static class355[] field9798 = new class355[4];

    @OriginalMember(owner = "client!ar", name = "T", descriptor = "[Lija;")
    public static class366[] field9799 = new class366[14];

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "F")
    public float field9762;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "F")
    public float field9764;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "F")
    public float field9765;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "F")
    public float field9767;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "F")
    public float field9768;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "F")
    public float field9770;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "F")
    public float field9771;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "F")
    public float field9780;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "F")
    public float field9783;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "F")
    public float field9785;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "F")
    public float field9794;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "F")
    public float field9795;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field9760;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field9761;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9763;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field9766;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field9769;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field9772;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field9773;

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "I")
    public static int field9774;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field9775;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field9776;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "I")
    public static int field9777;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "I")
    public static int field9778;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "I")
    public static int field9779;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field9782;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field9787;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field9789;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field9791;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "I")
    public static int field9796;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)V", line = 5)
    public final void method1877(int arg0) {
        field9784++;
        float var2 = class677.field9434[arg0 & 0x3FFF];
        float var3 = class677.field9433[arg0 & 0x3FFF];
        float var4 = this.field9780;
        float var5 = this.field9764;
        float var6 = this.field9767;
        float var7 = this.field9768;
        this.field9780 = var2 * var4 - this.field9770 * var3;
        this.field9770 = this.field9770 * var2 + var3 * var4;
        this.field9764 = var2 * var5 - (this.field9762 * var3);
        this.field9767 = var2 * var6 - (this.field9783 * var3);
        this.field9762 = this.field9762 * var2 + var3 * var5;
        this.field9768 = var2 * var7 - (this.field9765 * var3);
        this.field9783 = this.field9783 * var2 + var3 * var6;
        this.field9765 = this.field9765 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lsk;)V", line = 34)
    public final void method1874(class650 arg0) {
        field9760++;
        class711 var2 = (class711) arg0;
        this.field9783 = var2.field9783;
        this.field9764 = var2.field9764;
        this.field9770 = var2.field9770;
        this.field9768 = var2.field9768;
        this.field9795 = var2.field9795;
        this.field9767 = var2.field9767;
        this.field9794 = var2.field9794;
        this.field9780 = var2.field9780;
        this.field9765 = var2.field9765;
        this.field9771 = var2.field9771;
        this.field9785 = var2.field9785;
        this.field9762 = var2.field9762;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(III)V", line = 56)
    public final void method1868(int arg0, int arg1, int arg2) {
        this.field9771 = arg0;
        this.field9768 = arg1;
        this.field9765 = arg2;
        this.field9780 = this.field9770 = this.field9794 = this.field9762 = this.field9785 = this.field9767 = 0.0F;
        this.field9795 = this.field9764 = this.field9783 = 1.0F;
        field9766++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([I)V", line = 68)
    public final void method1885(int[] arg0) {
        field9776++;
        float var2 = (float) arg0[0] - this.field9771;
        float var3 = (float) arg0[1] - this.field9768;
        float var4 = (float) arg0[2] - this.field9765;
        arg0[2] = (int) (this.field9783 * var4 + this.field9785 * var2 + this.field9767 * var3);
        arg0[1] = (int) (this.field9762 * var4 + this.field9794 * var2 + this.field9764 * var3);
        arg0[0] = (int) (this.field9770 * var4 + this.field9795 * var2 + this.field9780 * var3);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIIII)V", line = 85)
    public final void method1882(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9790++;
        float var7 = class677.field9434[arg3 & 0x3FFF];
        float var8 = class677.field9433[arg3 & 0x3FFF];
        float var9 = class677.field9434[arg4 & 0x3FFF];
        float var10 = class677.field9433[arg4 & 0x3FFF];
        float var11 = class677.field9434[arg5 & 0x3FFF];
        float var12 = class677.field9433[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field9794 = var7 * var12;
        this.field9795 = var9 * var11 + var10 * var14;
        this.field9762 = -var8;
        this.field9785 = -var10 * var11 + var9 * var14;
        this.field9780 = -var9 * var12 + var10 * var13;
        this.field9767 = var9 * var13 + var10 * var12;
        this.field9770 = var7 * var10;
        this.field9783 = var7 * var9;
        this.field9764 = var7 * var11;
        this.field9765 = (float) (-arg0) * this.field9770 - (float) arg1 * this.field9762 - (float) arg2 * this.field9783;
        this.field9768 = (float) (-arg0) * this.field9780 - ((float) arg1 * this.field9764) - ((float) arg2 * this.field9767);
        this.field9771 = (float) (-arg0) * this.field9795 - (float) arg1 * this.field9794 - ((float) arg2 * this.field9785);
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(III[I)V", line = 121)
    public final void method1876(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field9783 + (float) arg0 * this.field9770 + (float) arg1 * this.field9762);
        field9789++;
        arg3[1] = (int) ((float) arg2 * this.field9767 + (float) arg0 * this.field9780 + (float) arg1 * this.field9764);
        arg3[0] = (int) ((float) arg2 * this.field9785 + (float) arg0 * this.field9795 + (float) arg1 * this.field9794);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILjava/lang/String;)I", line = 135)
    public static final int method3957(int arg0, String arg1) {
        field9793++;
        if (arg1 == null) {
            return -1;
        }
        int var2 = 0;
        if (arg0 != -18884) {
            return 96;
        }
        while (class749.field10345 > var2) {
            if (arg1.equalsIgnoreCase(class463.field6303[var2])) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "(I)[F", line = 163)
    public final float[] method3958(int arg0) {
        class562.field7970[0] = this.field9795;
        class562.field7970[4] = this.field9794;
        class562.field7970[6] = this.field9762;
        class562.field7970[12] = 0.0F;
        class562.field7970[1] = this.field9780;
        class562.field7970[13] = 0.0F;
        class562.field7970[5] = this.field9764;
        field9787++;
        class562.field7970[14] = 0.0F;
        class562.field7970[8] = this.field9785;
        class562.field7970[9] = this.field9767;
        class562.field7970[10] = this.field9783;
        if (arg0 <= 88) {
            return null;
        } else {
            class562.field7970[2] = this.field9770;
            return class562.field7970;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III[I)V", line = 190)
    public final void method1878(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field9783 + (float) arg0 * this.field9770 + (float) arg1 * this.field9762 + this.field9765);
        arg3[1] = (int) ((float) arg2 * this.field9767 + (float) arg0 * this.field9780 + (float) arg1 * this.field9764 + this.field9768);
        arg3[0] = (int) ((float) arg2 * this.field9785 + (float) arg0 * this.field9795 + (float) arg1 * this.field9794 + this.field9771);
        field9779++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(FIIFFII)V", line = 201)
    public final void method3959(float arg0, int arg1, int arg2, float arg3, float arg4, int arg5, int arg6) {
        field9778++;
        if (arg5 == 0) {
            this.field9795 = arg1;
            this.field9764 = arg6;
            this.field9783 = 1.0F;
            this.field9780 = this.field9770 = this.field9794 = this.field9762 = this.field9785 = this.field9767 = 0.0F;
        } else {
            float var8 = class677.field9434[arg5 & 0x3FFF];
            float var9 = class677.field9433[arg5 & 0x3FFF];
            this.field9770 = this.field9762 = this.field9785 = this.field9767 = 0.0F;
            this.field9783 = 1.0F;
            this.field9764 = (float) arg6 * var8;
            this.field9795 = (float) arg1 * var8;
            this.field9794 = (float) arg6 * -var9;
            this.field9780 = (float) arg1 * var9;
        }
        this.field9771 = arg0;
        this.field9768 = arg4;
        this.field9765 = arg3;
        if (arg2 != 28420) {
            this.method3962(29);
        }
    }

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "(I)V", line = 235)
    public static void method3960(int arg0) {
        if (arg0 < 97) {
            method3957(-56, null);
        }
        field9798 = null;
        field9786 = null;
        field9799 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "()V", line = 253)
    public final void method1862() {
        this.field9780 = this.field9770 = this.field9794 = this.field9762 = this.field9785 = this.field9767 = this.field9771 = this.field9768 = this.field9765 = 0.0F;
        this.field9795 = this.field9764 = this.field9783 = 1.0F;
        field9777++;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILsk;)V", line = 263)
    public final void method3961(int arg0, class650 arg1) {
        field9791++;
        if (arg0 != 1) {
            this.field9785 = -0.41272515F;
        }
        class711 var3 = (class711) arg1;
        this.field9785 = var3.field9770;
        this.field9795 = var3.field9795;
        this.field9794 = var3.field9780;
        this.field9764 = var3.field9764;
        this.field9780 = var3.field9794;
        this.field9767 = var3.field9762;
        this.field9770 = var3.field9785;
        this.field9762 = var3.field9767;
        this.field9783 = var3.field9783;
        this.field9771 = -(this.field9785 * var3.field9765 + this.field9795 * var3.field9771 + this.field9794 * var3.field9768);
        this.field9768 = -(this.field9767 * var3.field9765 + this.field9780 * var3.field9771 + this.field9764 * var3.field9768);
        this.field9765 = -(this.field9783 * var3.field9765 + this.field9770 * var3.field9771 + this.field9762 * var3.field9768);
    }

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "(I)[F", line = 287)
    public final float[] method3962(int arg0) {
        class562.field7970[5] = this.field9764;
        class562.field7970[4] = this.field9794;
        class562.field7970[0] = this.field9795;
        class562.field7970[8] = this.field9785;
        field9775++;
        class562.field7970[1] = this.field9780;
        class562.field7970[6] = this.field9762;
        class562.field7970[9] = this.field9767;
        class562.field7970[10] = this.field9783;
        class562.field7970[13] = this.field9768;
        if (arg0 > -49) {
            this.field9794 = 1.0205975F;
        }
        class562.field7970[12] = this.field9771;
        class562.field7970[2] = this.field9770;
        class562.field7970[14] = this.field9765;
        return class562.field7970;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V", line = 311)
    public final void method1860(int arg0, int arg1, int arg2) {
        field9761++;
        this.field9765 += arg2;
        this.field9768 += arg1;
        this.field9771 += arg0;
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V", line = 323)
    public final void method1890(int arg0) {
        this.field9783 = 1.0F;
        field9773++;
        this.field9795 = this.field9764 = class677.field9434[arg0 & 0x3FFF];
        this.field9780 = class677.field9433[arg0 & 0x3FFF];
        this.field9785 = this.field9771 = this.field9767 = this.field9768 = this.field9770 = this.field9762 = this.field9765 = 0.0F;
        this.field9794 = -this.field9780;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "()Lsk;", line = 337)
    public final class650 method1867() {
        field9792++;
        class711 var1 = new class711();
        var1.field9765 = this.field9765;
        var1.field9764 = this.field9764;
        var1.field9762 = this.field9762;
        var1.field9795 = this.field9795;
        var1.field9771 = this.field9771;
        var1.field9770 = this.field9770;
        var1.field9783 = this.field9783;
        var1.field9768 = this.field9768;
        var1.field9780 = this.field9780;
        var1.field9785 = this.field9785;
        var1.field9767 = this.field9767;
        var1.field9794 = this.field9794;
        return var1;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V", line = 361)
    public final void method1879(int arg0) {
        this.field9764 = 1.0F;
        field9788++;
        this.field9795 = this.field9783 = class677.field9434[arg0 & 0x3FFF];
        this.field9785 = class677.field9433[arg0 & 0x3FFF];
        this.field9770 = -this.field9785;
        this.field9794 = this.field9771 = this.field9780 = this.field9767 = this.field9768 = this.field9762 = this.field9765 = 0.0F;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V", line = 373)
    public final void method1884(int arg0) {
        field9796++;
        this.field9795 = 1.0F;
        this.field9764 = this.field9783 = class677.field9434[arg0 & 0x3FFF];
        this.field9762 = class677.field9433[arg0 & 0x3FFF];
        this.field9767 = -this.field9762;
        this.field9794 = this.field9785 = this.field9771 = this.field9780 = this.field9768 = this.field9770 = this.field9765 = 0.0F;
    }

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "(I)V", line = 393)
    public final void method1869(int arg0) {
        field9774++;
        float var2 = class677.field9434[arg0 & 0x3FFF];
        float var3 = class677.field9433[arg0 & 0x3FFF];
        float var4 = this.field9795;
        float var5 = this.field9794;
        float var6 = this.field9785;
        this.field9795 = var2 * var4 - (this.field9780 * var3);
        float var7 = this.field9771;
        this.field9794 = var2 * var5 - (this.field9764 * var3);
        this.field9780 = this.field9780 * var2 + var3 * var4;
        this.field9764 = this.field9764 * var2 + var3 * var5;
        this.field9785 = var2 * var6 - this.field9767 * var3;
        this.field9767 = this.field9767 * var2 + var3 * var6;
        this.field9771 = var2 * var7 - (this.field9768 * var3);
        this.field9768 = this.field9768 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "(I)V", line = 421)
    public final void method3963(int arg0) {
        this.field9765 = -this.field9765;
        this.field9768 = -this.field9768;
        this.field9762 = -this.field9762;
        this.field9770 = -this.field9770;
        this.field9780 = -this.field9780;
        this.field9767 = -this.field9767;
        field9772++;
        this.field9783 = -this.field9783;
        if (arg0 == 6) {
            this.field9764 = -this.field9764;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "([FFFFFI)V", line = 443)
    public final void method3964(float[] arg0, float arg1, float arg2, float arg3, float arg4, int arg5) {
        field9769++;
        arg0[0] = this.field9785 * arg1 + this.field9795 * arg3 + this.field9794 * arg2;
        arg0[1] = this.field9767 * arg1 + this.field9780 * arg3 + this.field9764 * arg2;
        arg0[arg5] = this.field9783 * arg1 + this.field9770 * arg3 + this.field9762 * arg2;
        float var8;
        float var9;
        float var10;
        if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var12 = -arg4 / arg3;
            var10 = this.field9795 * var12 + this.field9771;
            var9 = this.field9770 * var12 + this.field9765;
            var8 = this.field9780 * var12 + this.field9768;
        } else if ((arg2 > 0.00390625F) || (arg2 < -0.00390625F)) {
            float var11 = -arg4 / arg2;
            var10 = this.field9794 * var11 + this.field9771;
            var8 = this.field9764 * var11 + this.field9768;
            var9 = this.field9762 * var11 + this.field9765;
        } else {
            float var7 = -arg4 / arg1;
            var8 = this.field9767 * var7 + this.field9768;
            var9 = this.field9783 * var7 + this.field9765;
            var10 = this.field9785 * var7 + this.field9771;
        }
        arg0[3] = -(arg0[2] * var9 + arg0[0] * var10 + arg0[1] * var8);
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)V", line = 485)
    public final void method1875(int arg0) {
        field9782++;
        float var2 = class677.field9434[arg0 & 0x3FFF];
        float var3 = class677.field9433[arg0 & 0x3FFF];
        float var4 = this.field9795;
        float var5 = this.field9794;
        float var6 = this.field9785;
        this.field9795 = this.field9770 * var3 + var2 * var4;
        float var7 = this.field9771;
        this.field9794 = this.field9762 * var3 + var2 * var5;
        this.field9770 = this.field9770 * var2 - var3 * var4;
        this.field9785 = this.field9783 * var3 + var2 * var6;
        this.field9762 = this.field9762 * var2 - (var3 * var5);
        this.field9771 = this.field9765 * var3 + var2 * var7;
        this.field9783 = this.field9783 * var2 - (var3 * var6);
        this.field9765 = this.field9765 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(III[I)V", line = 514)
    public final void method1870(int arg0, int arg1, int arg2, int[] arg3) {
        field9763++;
        int var5 = (int) ((float) arg0 - this.field9771);
        int var6 = (int) ((float) arg1 - this.field9768);
        int var7 = (int) ((float) arg2 - this.field9765);
        arg3[0] = (int) ((float) var7 * this.field9770 + (float) var5 * this.field9795 + (float) var6 * this.field9780);
        arg3[1] = (int) ((float) var7 * this.field9762 + (float) var5 * this.field9794 + (float) var6 * this.field9764);
        arg3[2] = (int) ((float) var7 * this.field9783 + (float) var5 * this.field9785 + (float) var6 * this.field9767);
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V", line = 527)
    public class711() {
        this.method1862();
    }
}
