import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class549 extends class303 {

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "Ljda;")
    public static class239 field7422 = new class239(8);

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "Lnaa;")
    public static class78 field7441 = new class78();

    @OriginalMember(owner = "client!ni", name = "P", descriptor = "I")
    public static int field7446 = 0;

    @OriginalMember(owner = "client!ni", name = "Q", descriptor = "I")
    public static int field7447 = 0;

    @OriginalMember(owner = "client!ni", name = "R", descriptor = "S")
    public static short field7448 = 256;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "F")
    public float field7416;

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "F")
    public float field7417;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "F")
    public float field7418;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "F")
    public float field7419;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "F")
    public float field7421;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "F")
    public float field7424;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "F")
    public float field7426;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "F")
    public float field7427;

    @OriginalMember(owner = "client!ni", name = "A", descriptor = "F")
    public float field7431;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "F")
    public float field7433;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "F")
    public float field7437;

    @OriginalMember(owner = "client!ni", name = "I", descriptor = "F")
    public float field7439;

    @OriginalMember(owner = "client!ni", name = "j", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "I")
    public static int field7415;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field7428;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "I")
    public static int field7429;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field7430;

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    public static int field7432;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field7435;

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field7438;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!ni", name = "L", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!ni", name = "M", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!ni", name = "N", descriptor = "I")
    public static int field7444;

    @OriginalMember(owner = "client!ni", name = "O", descriptor = "Laj;")
    public static class333 field7445;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([I)V")
    public final void method982(int[] arg0) {
        field7444++;
        float var2 = (float) arg0[0] - this.field7427;
        float var3 = (float) arg0[1] - this.field7424;
        float var4 = (float) arg0[2] - this.field7431;
        arg0[1] = (int) (this.field7421 * var4 + this.field7439 * var3 + this.field7426 * var2);
        arg0[2] = (int) (this.field7417 * var4 + this.field7437 * var3 + this.field7433 * var2);
        arg0[0] = (int) (this.field7416 * var4 + this.field7419 * var2 + this.field7418 * var3);
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III[I)V")
    public final void method974(int arg0, int arg1, int arg2, int[] arg3) {
        field7423++;
        arg3[1] = (int) ((float) arg2 * this.field7437 + (float) arg0 * this.field7418 + (float) arg1 * this.field7439);
        arg3[0] = (int) ((float) arg2 * this.field7433 + (float) arg0 * this.field7419 + (float) arg1 * this.field7426);
        arg3[2] = (int) ((float) arg2 * this.field7417 + (float) arg0 * this.field7416 + (float) arg1 * this.field7421);
    }

    @OriginalMember(owner = "client!ni", name = "h", descriptor = "(I)V")
    public static void method3113(int arg0) {
        field7422 = null;
        field7445 = null;
        if (arg0 != 15) {
            field7446 = -77;
        }
        field7441 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;ILqn;I)Lgw;")
    public static final class182 method3114(int arg0, Component arg1, int arg2, class70 arg3, int arg4) {
        field7428++;
        if (class386.field5629 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg4 < 256) {
                arg4 = 256;
            }
            try {
                class182 var5 = (class182) Class.forName("rk").getDeclaredConstructor().newInstance();
                var5.field2436 = arg4;
                var5.field2417 = new int[(class418.field6010 ? 2 : 1) * 256];
                var5.method244(arg1);
                var5.field2423 = (arg4 & 0xFFFFFC00) + 1024;
                if (var5.field2423 > 16384) {
                    var5.field2423 = 16384;
                }
                var5.method246(var5.field2423);
                if (class269.field3962 > 0 && class474.field6606 == null) {
                    class474.field6606 = new class421();
                    class474.field6606.field6034 = arg3;
                    arg3.method623(class474.field6606, class269.field3962, -5697);
                }
                if (class474.field6606 != null) {
                    if (class474.field6606.field6030[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class474.field6606.field6030[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class144 var6 = new class144(arg3, arg2);
                    var6.field2417 = new int[(class418.field6010 ? 2 : 1) * 256];
                    var6.field2436 = arg4;
                    var6.method244(arg1);
                    var6.field2423 = 16384;
                    if (arg0 != 16036) {
                        return null;
                    }
                    var6.method246(var6.field2423);
                    if (class269.field3962 > 0 && class474.field6606 == null) {
                        class474.field6606 = new class421();
                        class474.field6606.field6034 = arg3;
                        arg3.method623(class474.field6606, class269.field3962, -5697);
                    }
                    if (class474.field6606 != null) {
                        if (class474.field6606.field6030[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class474.field6606.field6030[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class182();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ni", name = "e", descriptor = "(I)V")
    public final void method968(int arg0) {
        field7425++;
        float var2 = class232.field3153[arg0 & 0x3FFF];
        float var3 = class232.field3161[arg0 & 0x3FFF];
        float var4 = this.field7419;
        float var5 = this.field7426;
        float var6 = this.field7433;
        float var7 = this.field7427;
        this.field7419 = var2 * var4 - (this.field7418 * var3);
        this.field7426 = var2 * var5 - this.field7439 * var3;
        this.field7418 = this.field7418 * var2 + var3 * var4;
        this.field7439 = this.field7439 * var2 + var3 * var5;
        this.field7433 = var2 * var6 - (this.field7437 * var3);
        this.field7437 = this.field7437 * var2 + var3 * var6;
        this.field7427 = var2 * var7 - this.field7424 * var3;
        this.field7424 = this.field7424 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "()Luu;")
    public final class303 method963() {
        field7443++;
        class549 var1 = new class549();
        var1.field7439 = this.field7439;
        var1.field7426 = this.field7426;
        var1.field7437 = this.field7437;
        var1.field7421 = this.field7421;
        var1.field7433 = this.field7433;
        var1.field7424 = this.field7424;
        var1.field7419 = this.field7419;
        var1.field7417 = this.field7417;
        var1.field7416 = this.field7416;
        var1.field7427 = this.field7427;
        var1.field7418 = this.field7418;
        var1.field7431 = this.field7431;
        return var1;
    }

    @OriginalMember(owner = "client!ni", name = "g", descriptor = "(I)V")
    public final void method972(int arg0) {
        field7429++;
        this.field7419 = 1.0F;
        this.field7439 = this.field7417 = class232.field3153[arg0 & 0x3FFF];
        this.field7421 = class232.field3161[arg0 & 0x3FFF];
        this.field7437 = -this.field7421;
        this.field7426 = this.field7433 = this.field7427 = this.field7418 = this.field7424 = this.field7416 = this.field7431 = 0.0F;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(I)V")
    public final void method978(int arg0) {
        field7420++;
        float var2 = class232.field3153[arg0 & 0x3FFF];
        float var3 = class232.field3161[arg0 & 0x3FFF];
        float var4 = this.field7418;
        float var5 = this.field7439;
        float var6 = this.field7437;
        this.field7418 = var2 * var4 - this.field7416 * var3;
        float var7 = this.field7424;
        this.field7439 = var2 * var5 - this.field7421 * var3;
        this.field7416 = this.field7416 * var2 + var3 * var4;
        this.field7437 = var2 * var6 - this.field7417 * var3;
        this.field7421 = this.field7421 * var2 + var3 * var5;
        this.field7417 = this.field7417 * var2 + var3 * var6;
        this.field7424 = var2 * var7 - this.field7431 * var3;
        this.field7431 = this.field7431 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!ni", name = "f", descriptor = "(I)V")
    public final void method976(int arg0) {
        field7415++;
        this.field7417 = 1.0F;
        this.field7419 = this.field7439 = class232.field3153[arg0 & 0x3FFF];
        this.field7418 = class232.field3161[arg0 & 0x3FFF];
        this.field7433 = this.field7427 = this.field7437 = this.field7424 = this.field7416 = this.field7421 = this.field7431 = 0.0F;
        this.field7426 = -this.field7418;
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public final void method969(int arg0) {
        field7435++;
        float var2 = class232.field3153[arg0 & 0x3FFF];
        float var3 = class232.field3161[arg0 & 0x3FFF];
        float var4 = this.field7419;
        float var5 = this.field7426;
        float var6 = this.field7433;
        this.field7419 = this.field7416 * var3 + var2 * var4;
        float var7 = this.field7427;
        this.field7416 = this.field7416 * var2 - var3 * var4;
        this.field7426 = this.field7421 * var3 + var2 * var5;
        this.field7433 = this.field7417 * var3 + var2 * var6;
        this.field7421 = this.field7421 * var2 - var3 * var5;
        this.field7417 = this.field7417 * var2 - var3 * var6;
        this.field7427 = this.field7431 * var3 + var2 * var7;
        this.field7431 = this.field7431 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III[I)V")
    public final void method975(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field7417 + (float) arg0 * this.field7416 + (float) arg1 * this.field7421 + this.field7431);
        arg3[0] = (int) ((float) arg2 * this.field7433 + (float) arg0 * this.field7419 + (float) arg1 * this.field7426 + this.field7427);
        arg3[1] = (int) ((float) arg2 * this.field7437 + (float) arg0 * this.field7418 + (float) arg1 * this.field7439 + this.field7424);
        field7442++;
    }

    @OriginalMember(owner = "client!ni", name = "c", descriptor = "(III[I)V")
    public final void method979(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg1 - this.field7424);
        field7430++;
        int var6 = (int) ((float) arg0 - this.field7427);
        int var7 = (int) ((float) arg2 - this.field7431);
        arg3[2] = (int) ((float) var7 * this.field7417 + (float) var5 * this.field7437 + (float) var6 * this.field7433);
        arg3[1] = (int) ((float) var7 * this.field7421 + (float) var5 * this.field7439 + (float) var6 * this.field7426);
        arg3[0] = (int) ((float) var7 * this.field7416 + (float) var5 * this.field7418 + (float) var6 * this.field7419);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method985(int arg0) {
        this.field7439 = 1.0F;
        field7436++;
        this.field7419 = this.field7417 = class232.field3153[arg0 & 0x3FFF];
        this.field7433 = class232.field3161[arg0 & 0x3FFF];
        this.field7416 = -this.field7433;
        this.field7426 = this.field7427 = this.field7418 = this.field7437 = this.field7424 = this.field7421 = this.field7431 = 0.0F;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIIII)V")
    public final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7434++;
        float var7 = class232.field3153[arg3 & 0x3FFF];
        float var8 = class232.field3161[arg3 & 0x3FFF];
        float var9 = class232.field3153[arg4 & 0x3FFF];
        float var10 = class232.field3161[arg4 & 0x3FFF];
        float var11 = class232.field3153[arg5 & 0x3FFF];
        float var12 = class232.field3161[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7439 = var7 * var11;
        this.field7418 = -var9 * var12 + var10 * var13;
        this.field7421 = -var8;
        this.field7437 = var9 * var13 + var10 * var12;
        this.field7419 = var9 * var11 + var10 * var14;
        this.field7417 = var7 * var9;
        this.field7416 = var7 * var10;
        this.field7426 = var7 * var12;
        this.field7433 = -var10 * var11 + var9 * var14;
        this.field7424 = (float) (-arg0) * this.field7418 - (float) arg1 * this.field7439 - ((float) arg2 * this.field7437);
        this.field7427 = (float) (-arg0) * this.field7419 - ((float) arg1 * this.field7426) - ((float) arg2 * this.field7433);
        this.field7431 = (float) (-arg0) * this.field7416 - (float) arg1 * this.field7421 - (float) arg2 * this.field7417;
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "()V")
    public final void method967() {
        field7440++;
        this.field7418 = this.field7416 = this.field7426 = this.field7421 = this.field7433 = this.field7437 = this.field7427 = this.field7424 = this.field7431 = 0.0F;
        this.field7419 = this.field7439 = this.field7417 = 1.0F;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)V")
    public final void method981(int arg0, int arg1, int arg2) {
        this.field7419 = this.field7439 = this.field7417 = 1.0F;
        this.field7418 = this.field7416 = this.field7426 = this.field7421 = this.field7433 = this.field7437 = 0.0F;
        this.field7431 = arg2;
        this.field7427 = arg0;
        this.field7424 = arg1;
        field7432++;
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class549() {
        this.method967();
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(III)V")
    public final void method970(int arg0, int arg1, int arg2) {
        this.field7424 += arg1;
        field7414++;
        this.field7427 += arg0;
        this.field7431 += arg2;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Luu;)V")
    public final void method986(class303 arg0) {
        field7438++;
        class549 var2 = (class549) arg0;
        this.field7418 = var2.field7418;
        this.field7426 = var2.field7426;
        this.field7437 = var2.field7437;
        this.field7417 = var2.field7417;
        this.field7439 = var2.field7439;
        this.field7421 = var2.field7421;
        this.field7419 = var2.field7419;
        this.field7424 = var2.field7424;
        this.field7416 = var2.field7416;
        this.field7431 = var2.field7431;
        this.field7427 = var2.field7427;
        this.field7433 = var2.field7433;
    }
}
