import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class289 implements class321 {

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[F")
    private float[] field4404 = new float[4];

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lea;")
    public static class204 field4401 = new class204();

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
    public static int[] field4405 = new int[32];

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "Z")
    public static boolean field4406 = true;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "Lea;")
    public static class204 field4411 = new class204();

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "Z")
    public static boolean field4412 = false;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4399;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    private int field4407;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field4409;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lja;II)Z", line = 6)
    public static final boolean method2030(class64 arg0, int arg1, int arg2) {
        field4409++;
        byte[] var3 = arg0.method490(arg2, true);
        if (arg1 != 128) {
            return false;
        } else if (var3 == null) {
            return false;
        } else {
            class250.method1771(3, var3);
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "()V", line = 25)
    public final void method855() {
        field4403++;
        GL var1 = class265.field4099;
        var1.glCallList(this.field4407);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 36)
    private final void method2031(byte arg0) {
        field4408++;
        GL var2 = class265.field4099;
        this.field4407 = var2.glGenLists(2);
        var2.glNewList(this.field4407, 4864);
        var2.glActiveTexture(33985);
        if (class184.field2930) {
            var2.glBindTexture(32879, class184.field2933);
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
        if (arg0 != -74) {
            this.field4404 = (float[]) null;
        }
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field4407 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class184.field2930) {
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

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "()V", line = 85)
    public final void method857() {
        field4400++;
        GL var1 = class265.field4099;
        var1.glCallList(this.field4407 + 1);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lpe;I)Ljava/lang/String;", line = 98)
    public static final String method2032(class101 arg0, int arg1) {
        field4402++;
        return arg1 == 1 ? class31.method211(32767, 78, arg0) : (String) null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 109)
    public final void method854(int arg0) {
        field4399++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class265.field4099;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        if (var5) {
            this.field4404[0] = var4;
            this.field4404[1] = 0.0F;
            this.field4404[3] = 0.0F;
            this.field4404[2] = 0.0F;
        } else {
            this.field4404[3] = 0.0F;
            this.field4404[0] = 0.0F;
            this.field4404[2] = var4;
            this.field4404[1] = 0.0F;
        }
        float var6 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class231.field3670 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class48.field806 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class19.field358), (float) (-class228.field3643), (float) (-class125.field1995));
        var3.glTexGenfv(8192, 9474, this.field4404, 0);
        this.field4404[1] = var4;
        this.field4404[2] = 0.0F;
        this.field4404[3] = (float) class265.field4118 * var2;
        this.field4404[0] = 0.0F;
        var3.glTexGenfv(8193, 9474, this.field4404, 0);
        var3.glPopMatrix();
        if (class184.field2930) {
            this.field4404[3] = (float) class265.field4118 * var6;
            this.field4404[1] = 0.0F;
            this.field4404[0] = 0.0F;
            this.field4404[2] = 0.0F;
            var3.glTexGenfv(8194, 9473, this.field4404, 0);
        } else {
            int var7 = (int) ((float) class265.field4118 * var6 * 64.0F);
            var3.glBindTexture(3553, class184.field2936[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "()I", line = 173)
    public final int method852() {
        field4413++;
        return 0;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "()V", line = 225)
    public class289() {
        this.method2031((byte) -74);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)V", line = 202)
    public static void method2033(boolean arg0) {
        field4405 = null;
        field4411 = null;
        field4401 = null;
        if (arg0) {
            field4411 = (class204) null;
        }
    }
}
