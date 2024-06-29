import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class6 implements class159 {

    @OriginalMember(owner = "client!j", name = "b", descriptor = "[F")
    private float[] field42 = new float[4];

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
    public static int[] field47 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lbd;")
    public static class162 field44 = null;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lbd;")
    public static class162 field45 = class17.method142(0, "http:)4)4");

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lbd;")
    public static class162 field52 = class17.method142(0, "Benutzen");

    @OriginalMember(owner = "client!j", name = "o", descriptor = "[S")
    public static short[] field55 = new short[] { 1, 16, 42, 17, 50, 46, 2, 48 };

    @OriginalMember(owner = "client!j", name = "m", descriptor = "Lbd;")
    public static class162 field53 = class17.method142(0, "Mem:");

    @OriginalMember(owner = "client!j", name = "q", descriptor = "Lbd;")
    public static class162 field57 = class17.method142(0, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lda;")
    public static class143 field50;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 7)
    private final void method27(int arg0) {
        GL var2 = class117.field2143;
        this.field56 = var2.glGenLists(2);
        if (arg0 != 0) {
            method33((class143) null, (class143) null, -4);
        }
        field54++;
        var2.glNewList(this.field56, 4864);
        var2.glActiveTexture(33985);
        if (class210.field3548) {
            var2.glBindTexture(32879, class210.field3545);
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
        var2.glNewList(this.field56 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class210.field3548) {
            var2.glDisable(32879);
            var2.glDisable(3170);
        } else {
            var2.glDisable(3553);
        }
        var2.glDisable(3168);
        var2.glDisable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)V", line = 69)
    public static final void method28(int arg0, int arg1, int arg2) {
        class187.field3229.method338(239, (byte) 8);
        if (arg1 >= -115) {
            field50 = (class143) null;
        }
        field46++;
        class225.field3774++;
        class187.field3229.method731(-4, arg2);
        class187.field3229.method704(false, arg0);
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V", line = 173)
    public class6() {
        this.method27(0);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 93)
    public final void method29(int arg0) {
        field51++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        GL var4 = class117.field2143;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field42[0] = var5;
            this.field42[2] = 0.0F;
            this.field42[1] = 0.0F;
            this.field42[3] = 0.0F;
        } else {
            this.field42[2] = var5;
            this.field42[3] = 0.0F;
            this.field42[1] = 0.0F;
            this.field42[0] = 0.0F;
        }
        var4.glActiveTexture(33985);
        var4.glMatrixMode(5888);
        var4.glPushMatrix();
        var4.glLoadIdentity();
        var4.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var4.glRotatef((float) class279.field4703 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var4.glRotatef((float) class61.field951 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var4.glTranslatef((float) (-class190.field3256), (float) (-class43.field698), (float) (-class212.field3568));
        var4.glTexGenfv(8192, 9474, this.field42, 0);
        this.field42[3] = (float) class117.field2127 * var2;
        this.field42[1] = var5;
        this.field42[2] = 0.0F;
        this.field42[0] = 0.0F;
        var4.glTexGenfv(8193, 9474, this.field42, 0);
        var4.glPopMatrix();
        if (class210.field3548) {
            this.field42[3] = (float) class117.field2127 * var3;
            this.field42[0] = 0.0F;
            this.field42[2] = 0.0F;
            this.field42[1] = 0.0F;
            var4.glTexGenfv(8194, 9473, this.field42, 0);
        } else {
            int var7 = (int) ((float) class117.field2127 * var3 * 64.0F);
            var4.glBindTexture(3553, class210.field3544[var7 % 64]);
        }
        var4.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "()I", line = 165)
    public final int method30() {
        field41++;
        return 0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)V", line = 182)
    public static void method31(byte arg0) {
        if (arg0 != 97) {
            field58 = 65;
        }
        field52 = null;
        field45 = null;
        field57 = null;
        field47 = null;
        field50 = null;
        field44 = null;
        field55 = null;
        field53 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "()V", line = 213)
    public final void method32() {
        GL var1 = class117.field2143;
        var1.glCallList(this.field56);
        field43++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Lda;Lda;I)V", line = 233)
    public static final void method33(class143 arg0, class143 arg1, int arg2) {
        field48++;
        class268.field4487 = class194.method1435(class43.field714, arg0, 0, -115, arg1);
        if (class117.field2159) {
            class147.field2663 = class187.method1407(3, arg0, 0, arg1, class43.field714);
        } else {
            class147.field2663 = (class189) class268.field4487;
        }
        class286.field4831 = class194.method1435(class173.field3001, arg0, 0, -72, arg1);
        if (arg2 != -147) {
            method28(46, 30, 24);
        }
        class207.field3507 = class194.method1435(class136.field2428, arg0, 0, arg2 + 57, arg1);
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "()V", line = 252)
    public final void method34() {
        field49++;
        GL var1 = class117.field2143;
        var1.glCallList(this.field56 + 1);
    }
}
