import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class238 implements class220 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[F")
    private float[] field3762 = new float[4];

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field3764 = 0;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
    public static boolean field3766 = true;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field3763;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field3765;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field3768;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
    private int field3770;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "Ldg;")
    public static class335 field3771;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lgn;")
    public static class6 field3759;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "()V", line = 6)
    public final void method303() {
        field3769++;
        GL var1 = class186.field2990;
        var1.glCallList(this.field3770 + 1);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 21)
    private final void method1691(int arg0) {
        field3758++;
        GL var2 = class186.field2990;
        this.field3770 = var2.glGenLists(2);
        var2.glNewList(this.field3770, 4864);
        var2.glActiveTexture(33985);
        if (class212.field3461) {
            var2.glBindTexture(32879, class212.field3457);
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
        if (arg0 > -5) {
            field3766 = false;
        }
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field3770 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class212.field3461) {
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

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 81)
    public static void method1692(byte arg0) {
        field3771 = null;
        if (arg0 >= -124) {
            method1692((byte) 10);
        }
        field3759 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "()V", line = 93)
    public final void method300() {
        field3765++;
        GL var1 = class186.field2990;
        var1.glCallList(this.field3770);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V", line = 103)
    public final void method301(int arg0) {
        GL var2 = class186.field2990;
        field3761++;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3762[1] = 0.0F;
            this.field3762[0] = var5;
            this.field3762[2] = 0.0F;
            this.field3762[3] = 0.0F;
        } else {
            this.field3762[0] = 0.0F;
            this.field3762[1] = 0.0F;
            this.field3762[3] = 0.0F;
            this.field3762[2] = var5;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class114.field1723 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class92.field1419 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class271.field4299), (float) (-class210.field3440), (float) (-class330.field5149));
        var2.glTexGenfv(8192, 9474, this.field3762, 0);
        this.field3762[0] = 0.0F;
        this.field3762[2] = 0.0F;
        this.field3762[1] = var5;
        this.field3762[3] = (float) class186.field2993 * var4;
        var2.glTexGenfv(8193, 9474, this.field3762, 0);
        var2.glPopMatrix();
        if (class212.field3461) {
            this.field3762[2] = 0.0F;
            this.field3762[0] = 0.0F;
            this.field3762[1] = 0.0F;
            this.field3762[3] = (float) class186.field2993 * var3;
            var2.glTexGenfv(8194, 9473, this.field3762, 0);
        } else {
            int var7 = (int) ((float) class186.field2993 * var3 * 64.0F);
            var2.glBindTexture(3553, class212.field3460[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "()I", line = 166)
    public final int method304() {
        field3763++;
        return 0;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 184)
    public class238() {
        this.method1691(-75);
    }
}
