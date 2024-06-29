import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class554 extends class648 {

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "Lde;")
    private class454 field7634;

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "Lud;")
    private class31 field7632;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "Lej;")
    public static class104 field7639 = new class104("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field7641 = 0;

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "I")
    public static int field7635;

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public static int field7642;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Lqc;")
    public static class633 field7640;

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V")
    public static void method3140(int arg0) {
        field7640 = null;
        if (arg0 == 0) {
            field7639 = null;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLmw;I)V")
    public final void method942(byte arg0, class418 arg1, int arg2) {
        ++field7635;
        if (arg0 != -30) {
            this.method947(64, true);
        }
        super.field9395.method3358(32886, arg1);
        super.field9395.method3396((byte) -43, arg2);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BZ)V")
    public final void method944(byte arg0, boolean arg1) {
        if (arg0 > -111) {
            method3140(26);
        }
        ++field7638;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Z")
    public final boolean method946(int arg0) {
        if (arg0 < 122) {
            return true;
        } else {
            ++field7642;
            return true;
        }
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lgi;Lde;)V")
    public class554(class583 arg0, class454 arg1) {
        super(arg0);
        this.field7634 = arg1;
        this.field7632 = new class31(arg0, 2);
        this.field7632.method320(-28457, 0);
        super.field9395.method3398(-81, 1);
        if (this.field7634.field6411) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field9395.method3398(-102, 0);
        this.field7632.method321(2);
        this.field7632.method320(-28457, 1);
        super.field9395.method3398(-119, 1);
        if (this.field7634.field6411) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field9395.method3398(-85, 0);
        this.field7632.method321(2);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZ)V")
    public final void method947(int arg0, boolean arg1) {
        if (arg0 == 17729) {
            ++field7637;
            this.field7632.method317('\u0000', true);
            if (this.field7634.field6411) {
                super.field9395.method3398(-116, 1);
                super.field9395.method3358(32886, this.field7634.field6415);
                super.field9395.method3398(-65, 0);
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V")
    public final void method941(int arg0) {
        ++field7633;
        this.field7632.method317('\u0001', true);
        super.field9395.method3398(-61, arg0);
        super.field9395.method3358(32886, (class418) null);
        super.field9395.method3398(-51, 0);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V")
    public final void method945(int arg0, int arg1, int arg2) {
        ++field7636;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) ((3 & arg1 >> 3) - -1) * 5.0E-4F;
        float var6 = ~(arg1 & 64) == -1 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var7 = ~(arg1 & 128) != -1;
        int var8 = 28 / ((30 - arg2) / 56);
        super.field9395.method3398(-57, 1);
        if (!var7) {
            class610.field8773[0] = 0.0F;
            class610.field8773[1] = 0.0F;
            class610.field8773[2] = var6;
            class610.field8773[3] = 0.0F;
        } else {
            class610.field8773[1] = 0.0F;
            class610.field8773[2] = 0.0F;
            class610.field8773[3] = 0.0F;
            class610.field8773[0] = var6;
        }
        OpenGL.glTexGenfv(8192, 9474, class610.field8773, 0);
        class610.field8773[1] = var6;
        class610.field8773[2] = 0.0F;
        class610.field8773[3] = (float) super.field9395.field8202 * var4 % 1.0F;
        class610.field8773[0] = 0.0F;
        OpenGL.glTexGenfv(8193, 9474, class610.field8773, 0);
        if (!this.field7634.field6411) {
            int var9 = (int) ((float) super.field9395.field8202 * var5 * 16.0F);
            super.field9395.method3358(32886, this.field7634.field6412[var9 % 16]);
        } else {
            class610.field8773[1] = 0.0F;
            class610.field8773[0] = 0.0F;
            class610.field8773[2] = 0.0F;
            class610.field8773[3] = (float) super.field9395.field8202 * var5 % 1.0F;
            OpenGL.glTexGenfv(8194, 9473, class610.field8773, 0);
        }
        super.field9395.method3398(-69, 0);
    }
}
