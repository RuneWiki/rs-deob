import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class532 extends class765 {

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "F")
    public float field7401;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "F")
    public float field7402;

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "F")
    public float field7403;

    @OriginalMember(owner = "client!wga", name = "k", descriptor = "F")
    public float field7407;

    @OriginalMember(owner = "client!wga", name = "n", descriptor = "F")
    public float field7410;

    @OriginalMember(owner = "client!wga", name = "p", descriptor = "F")
    public float field7412;

    @OriginalMember(owner = "client!wga", name = "s", descriptor = "F")
    public float field7415;

    @OriginalMember(owner = "client!wga", name = "y", descriptor = "F")
    public float field7421;

    @OriginalMember(owner = "client!wga", name = "E", descriptor = "F")
    public float field7427;

    @OriginalMember(owner = "client!wga", name = "F", descriptor = "F")
    public float field7428;

    @OriginalMember(owner = "client!wga", name = "G", descriptor = "F")
    public float field7429;

    @OriginalMember(owner = "client!wga", name = "H", descriptor = "F")
    public float field7430;

    @OriginalMember(owner = "client!wga", name = "h", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!wga", name = "i", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!wga", name = "j", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!wga", name = "l", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!wga", name = "m", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!wga", name = "o", descriptor = "I")
    public static int field7411;

    @OriginalMember(owner = "client!wga", name = "q", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!wga", name = "r", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!wga", name = "t", descriptor = "I")
    public static int field7416;

    @OriginalMember(owner = "client!wga", name = "u", descriptor = "I")
    public static int field7417;

    @OriginalMember(owner = "client!wga", name = "v", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!wga", name = "w", descriptor = "I")
    public static int field7419;

    @OriginalMember(owner = "client!wga", name = "x", descriptor = "I")
    public static int field7420;

    @OriginalMember(owner = "client!wga", name = "z", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!wga", name = "A", descriptor = "I")
    public static int field7423;

    @OriginalMember(owner = "client!wga", name = "B", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!wga", name = "C", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!wga", name = "D", descriptor = "I")
    public static int field7426;

    @OriginalMember(owner = "client!wga", name = "f", descriptor = "(I)V", line = 3)
    public final void method1562(int arg0) {
        this.field7430 = 1.0F;
        field7422++;
        this.field7429 = this.field7407 = class640.field9014[arg0 & 0x3FFF];
        this.field7402 = class640.field9015[arg0 & 0x3FFF];
        this.field7401 = this.field7412 = this.field7415 = this.field7427 = this.field7421 = this.field7403 = this.field7428 = 0.0F;
        this.field7410 = -this.field7402;
    }

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "(I)V", line = 15)
    public final void method1566(int arg0) {
        field7419++;
        float var2 = class640.field9014[arg0 & 0x3FFF];
        float var3 = class640.field9015[arg0 & 0x3FFF];
        float var4 = this.field7430;
        float var5 = this.field7401;
        float var6 = this.field7412;
        this.field7430 = this.field7403 * var3 + var2 * var4;
        float var7 = this.field7415;
        this.field7403 = this.field7403 * var2 - (var3 * var4);
        this.field7401 = this.field7402 * var3 + var2 * var5;
        this.field7412 = this.field7407 * var3 + var2 * var6;
        this.field7402 = this.field7402 * var2 - var3 * var5;
        this.field7407 = this.field7407 * var2 - var3 * var6;
        this.field7415 = this.field7428 * var3 + var2 * var7;
        this.field7428 = this.field7428 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(I)V", line = 44)
    public final void method1560(int arg0) {
        this.field7407 = 1.0F;
        field7418++;
        this.field7430 = this.field7429 = class640.field9014[arg0 & 0x3FFF];
        this.field7427 = class640.field9015[arg0 & 0x3FFF];
        this.field7412 = this.field7415 = this.field7410 = this.field7421 = this.field7403 = this.field7402 = this.field7428 = 0.0F;
        this.field7401 = -this.field7427;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III[I)V", line = 60)
    public final void method1549(int arg0, int arg1, int arg2, int[] arg3) {
        field7405++;
        arg3[0] = (int) ((float) arg2 * this.field7412 + (float) arg0 * this.field7430 + (float) arg1 * this.field7401);
        arg3[2] = (int) ((float) arg2 * this.field7407 + (float) arg0 * this.field7403 + (float) arg1 * this.field7402);
        arg3[1] = (int) ((float) arg2 * this.field7410 + (float) arg0 * this.field7427 + (float) arg1 * this.field7429);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(Ldm;)V", line = 74)
    public final void method1552(class765 arg0) {
        field7416++;
        class532 var2 = (class532) arg0;
        this.field7429 = var2.field7429;
        this.field7415 = var2.field7415;
        this.field7412 = var2.field7412;
        this.field7407 = var2.field7407;
        this.field7410 = var2.field7410;
        this.field7427 = var2.field7427;
        this.field7430 = var2.field7430;
        this.field7428 = var2.field7428;
        this.field7403 = var2.field7403;
        this.field7401 = var2.field7401;
        this.field7402 = var2.field7402;
        this.field7421 = var2.field7421;
    }

    @OriginalMember(owner = "client!wga", name = "g", descriptor = "(I)V", line = 98)
    public static final void method3098(int arg0) {
        if (arg0 >= -98) {
            method3098(78);
        }
        class492.method2871(true);
        field7426++;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)V", line = 111)
    public final void method1568(int arg0, int arg1, int arg2) {
        this.field7430 = this.field7429 = this.field7407 = 1.0F;
        this.field7427 = this.field7403 = this.field7401 = this.field7402 = this.field7412 = this.field7410 = 0.0F;
        field7413++;
        this.field7428 = arg2;
        this.field7415 = arg0;
        this.field7421 = arg1;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "([I)V", line = 129)
    public final void method1555(int[] arg0) {
        field7404++;
        float var2 = (float) arg0[0] - this.field7415;
        float var3 = (float) arg0[1] - this.field7421;
        float var4 = (float) arg0[2] - this.field7428;
        arg0[2] = (int) (this.field7407 * var4 + this.field7412 * var2 + this.field7410 * var3);
        arg0[1] = (int) (this.field7402 * var4 + this.field7429 * var3 + this.field7401 * var2);
        arg0[0] = (int) (this.field7403 * var4 + this.field7430 * var2 + this.field7427 * var3);
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "()Ldm;", line = 157)
    public final class765 method1556() {
        field7425++;
        class532 var1 = new class532();
        var1.field7429 = this.field7429;
        var1.field7401 = this.field7401;
        var1.field7430 = this.field7430;
        var1.field7407 = this.field7407;
        var1.field7415 = this.field7415;
        var1.field7410 = this.field7410;
        var1.field7421 = this.field7421;
        var1.field7403 = this.field7403;
        var1.field7427 = this.field7427;
        var1.field7402 = this.field7402;
        var1.field7428 = this.field7428;
        var1.field7412 = this.field7412;
        return var1;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(I)V", line = 188)
    public final void method1551(int arg0) {
        field7423++;
        float var2 = class640.field9014[arg0 & 0x3FFF];
        float var3 = class640.field9015[arg0 & 0x3FFF];
        float var4 = this.field7430;
        float var5 = this.field7401;
        float var6 = this.field7412;
        this.field7430 = var2 * var4 - this.field7427 * var3;
        float var7 = this.field7415;
        this.field7427 = this.field7427 * var2 + var3 * var4;
        this.field7401 = var2 * var5 - (this.field7429 * var3);
        this.field7412 = var2 * var6 - this.field7410 * var3;
        this.field7429 = this.field7429 * var2 + var3 * var5;
        this.field7415 = var2 * var7 - (this.field7421 * var3);
        this.field7410 = this.field7410 * var2 + var3 * var6;
        this.field7421 = this.field7421 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIII)V", line = 215)
    public final void method1567(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7420++;
        float var7 = class640.field9014[arg3 & 0x3FFF];
        float var8 = class640.field9015[arg3 & 0x3FFF];
        float var9 = class640.field9014[arg4 & 0x3FFF];
        float var10 = class640.field9015[arg4 & 0x3FFF];
        float var11 = class640.field9014[arg5 & 0x3FFF];
        float var12 = class640.field9015[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7427 = -var9 * var12 + var10 * var13;
        this.field7407 = var7 * var9;
        this.field7402 = -var8;
        this.field7401 = var7 * var12;
        this.field7410 = var9 * var13 + var10 * var12;
        this.field7412 = -var10 * var11 + var9 * var14;
        this.field7429 = var7 * var11;
        this.field7430 = var9 * var11 + var10 * var14;
        this.field7403 = var7 * var10;
        this.field7428 = (float) (-arg0) * this.field7403 - (float) arg1 * this.field7402 - ((float) arg2 * this.field7407);
        this.field7415 = (float) (-arg0) * this.field7430 - ((float) arg1 * this.field7401) - (float) arg2 * this.field7412;
        this.field7421 = (float) (-arg0) * this.field7427 - ((float) arg1 * this.field7429) - ((float) arg2 * this.field7410);
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(II)Z", line = 254)
    public static final boolean method3099(int arg0, int arg1) {
        field7417++;
        if (arg1 == 0) {
            return arg0 == 4 || arg0 == 8 || arg0 == 11;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(I)V", line = 269)
    public final void method1553(int arg0) {
        field7414++;
        float var2 = class640.field9014[arg0 & 0x3FFF];
        float var3 = class640.field9015[arg0 & 0x3FFF];
        float var4 = this.field7427;
        float var5 = this.field7429;
        float var6 = this.field7410;
        this.field7427 = var2 * var4 - this.field7403 * var3;
        float var7 = this.field7421;
        this.field7429 = var2 * var5 - this.field7402 * var3;
        this.field7403 = this.field7403 * var2 + var3 * var4;
        this.field7410 = var2 * var6 - this.field7407 * var3;
        this.field7402 = this.field7402 * var2 + var3 * var5;
        this.field7421 = var2 * var7 - (this.field7428 * var3);
        this.field7407 = this.field7407 * var2 + var3 * var6;
        this.field7428 = this.field7428 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "(III[I)V", line = 296)
    public final void method1559(int arg0, int arg1, int arg2, int[] arg3) {
        field7424++;
        int var5 = (int) ((float) arg1 - this.field7421);
        int var6 = (int) ((float) arg0 - this.field7415);
        int var7 = (int) ((float) arg2 - this.field7428);
        arg3[0] = (int) ((float) var7 * this.field7403 + (float) var5 * this.field7427 + (float) var6 * this.field7430);
        arg3[1] = (int) ((float) var7 * this.field7402 + (float) var5 * this.field7429 + (float) var6 * this.field7401);
        arg3[2] = (int) ((float) var7 * this.field7407 + (float) var5 * this.field7410 + (float) var6 * this.field7412);
    }

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "(I)V", line = 310)
    public final void method1561(int arg0) {
        this.field7429 = 1.0F;
        field7411++;
        this.field7430 = this.field7407 = class640.field9014[arg0 & 0x3FFF];
        this.field7412 = class640.field9015[arg0 & 0x3FFF];
        this.field7403 = -this.field7412;
        this.field7401 = this.field7415 = this.field7427 = this.field7410 = this.field7421 = this.field7402 = this.field7428 = 0.0F;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "()V", line = 324)
    public final void method1569() {
        this.field7427 = this.field7403 = this.field7401 = this.field7402 = this.field7412 = this.field7410 = this.field7415 = this.field7421 = this.field7428 = 0.0F;
        field7406++;
        this.field7430 = this.field7429 = this.field7407 = 1.0F;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(III)V", line = 333)
    public final void method1558(int arg0, int arg1, int arg2) {
        field7409++;
        this.field7415 += arg0;
        this.field7428 += arg2;
        this.field7421 += arg1;
    }

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "(III[I)V", line = 344)
    public final void method1571(int arg0, int arg1, int arg2, int[] arg3) {
        field7408++;
        arg3[2] = (int) ((float) arg2 * this.field7407 + (float) arg0 * this.field7403 + (float) arg1 * this.field7402 + this.field7428);
        arg3[0] = (int) ((float) arg2 * this.field7412 + (float) arg0 * this.field7430 + (float) arg1 * this.field7401 + this.field7415);
        arg3[1] = (int) ((float) arg2 * this.field7410 + (float) arg0 * this.field7427 + (float) arg1 * this.field7429 + this.field7421);
    }

    @OriginalMember(owner = "client!wga", name = "<init>", descriptor = "()V", line = 356)
    public class532() {
        this.method1569();
    }
}
