import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class299 implements class62 {

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "[F")
    private float[] field4940 = new float[4];

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field4936 = 0;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "[I")
    public static int[] field4939 = new int[32];

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4932 = null;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field4941 = 0;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    private int field4935;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "Lnm;")
    public static class221 field4933;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "()V", line = 6)
    public final void method120() {
        GL var1 = class245.field3884;
        field4934++;
        var1.glCallList(this.field4935);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Z)V", line = 23)
    private final void method2108(boolean arg0) {
        field4942++;
        GL var2 = class245.field3884;
        this.field4935 = var2.glGenLists(2);
        var2.glNewList(this.field4935, 4864);
        var2.glActiveTexture(33985);
        if (class43.field635) {
            var2.glBindTexture(32879, class43.field638);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        if (arg0) {
            method2109((byte) 99);
        }
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field4935 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class43.field635) {
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

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "()I", line = 71)
    public final int method121() {
        field4943++;
        return 0;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(B)V", line = 83)
    public static void method2109(byte arg0) {
        field4932 = null;
        field4939 = null;
        if (arg0 != 104) {
            method2109((byte) 14);
        }
        field4933 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 103)
    public final void method119(int arg0) {
        field4931++;
        GL var2 = class245.field3884;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var5 = (float) (((arg0 & 0x1C) >> 3) + 1) * 0.01F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field4940[0] = var4;
            this.field4940[1] = 0.0F;
            this.field4940[3] = 0.0F;
            this.field4940[2] = 0.0F;
        } else {
            this.field4940[1] = 0.0F;
            this.field4940[2] = var4;
            this.field4940[3] = 0.0F;
            this.field4940[0] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class98.field1427 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class125.field1871 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class60.field919), (float) (-class182.field2833), (float) (-class218.field3353));
        var2.glTexGenfv(8192, 9474, this.field4940, 0);
        this.field4940[3] = (float) class245.field3882 * var3;
        this.field4940[1] = var4;
        this.field4940[2] = 0.0F;
        this.field4940[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field4940, 0);
        var2.glPopMatrix();
        if (class43.field635) {
            this.field4940[1] = 0.0F;
            this.field4940[0] = 0.0F;
            this.field4940[3] = (float) class245.field3882 * var5;
            this.field4940[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4940, 0);
        } else {
            int var7 = (int) ((float) class245.field3882 * var5 * 64.0F);
            var2.glBindTexture(3553, class43.field637[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "()V", line = 168)
    public final void method117() {
        field4938++;
        GL var1 = class245.field3884;
        var1.glCallList(this.field4935 + 1);
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V", line = 185)
    public class299() {
        this.method2108(false);
    }
}
