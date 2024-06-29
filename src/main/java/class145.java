import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class145 implements class147 {

    @OriginalMember(owner = "client!va", name = "g", descriptor = "[F")
    private float[] field2628 = new float[4];

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field2623 = 0;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "Lud;")
    public static class279 field2626 = class130.method1024("Continuer", 255);

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Z")
    public static boolean field2624 = true;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    private int field2622;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field2625;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V", line = 12)
    private final void method1102(int arg0) {
        field2633++;
        GL var2 = class97.field1801;
        this.field2622 = var2.glGenLists(2);
        var2.glNewList(this.field2622, 4864);
        var2.glActiveTexture(33985);
        if (class129.field2358) {
            var2.glBindTexture(32879, class129.field2359);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field2622 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class129.field2358) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        if (arg0 < 12) {
            this.method73();
        }
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "()I", line = 57)
    public final int method72() {
        field2630++;
        return 0;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "()V", line = 71)
    public final void method76() {
        GL var1 = class97.field1801;
        field2631++;
        var1.glCallList(this.field2622);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V", line = 82)
    public final void method75(int arg0) {
        field2632++;
        GL var2 = class97.field1801;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field2628[3] = 0.0F;
            this.field2628[0] = var5;
            this.field2628[2] = 0.0F;
            this.field2628[1] = 0.0F;
        } else {
            this.field2628[0] = 0.0F;
            this.field2628[1] = 0.0F;
            this.field2628[2] = var5;
            this.field2628[3] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class260.field4627 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class268.field4810 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class143.field2601), (float) (-class101.field1891), (float) (-class170.field3077));
        var2.glTexGenfv(8192, 9474, this.field2628, 0);
        this.field2628[2] = 0.0F;
        this.field2628[0] = 0.0F;
        this.field2628[3] = (float) class97.field1816 * var3;
        this.field2628[1] = var5;
        var2.glTexGenfv(8193, 9474, this.field2628, 0);
        var2.glPopMatrix();
        if (class129.field2358) {
            this.field2628[1] = 0.0F;
            this.field2628[0] = 0.0F;
            this.field2628[2] = 0.0F;
            this.field2628[3] = (float) class97.field1816 * var4;
            var2.glTexGenfv(8194, 9473, this.field2628, 0);
        } else {
            int var7 = (int) ((float) class97.field1816 * var4 * 64.0F);
            var2.glBindTexture(3553, class129.field2360[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IZII)I", line = 145)
    public static final int method1103(int arg0, boolean arg1, int arg2, int arg3) {
        field2627++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else if (arg1) {
            return arg2;
        } else {
            return 69;
        }
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "()V", line = 178)
    public final void method73() {
        GL var1 = class97.field1801;
        field2625++;
        var1.glCallList(this.field2622 + 1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V", line = 189)
    public static final void method1104(int arg0, byte arg1) {
        class63.field1297.method1339(arg0, 19326);
        field2629++;
        if (arg1 <= 49) {
            field2624 = true;
        }
    }

    @OriginalMember(owner = "client!va", name = "<init>", descriptor = "()V", line = 215)
    public class145() {
        this.method1102(39);
    }

    @OriginalMember(owner = "client!va", name = "c", descriptor = "(I)V", line = 204)
    public static void method1105(int arg0) {
        if (arg0 <= 92) {
            field2623 = 48;
        }
        field2626 = null;
    }
}
