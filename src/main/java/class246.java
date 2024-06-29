import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class246 implements class177 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "[F")
    private float[] field3541 = new float[4];

    @OriginalMember(owner = "client!ri", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3550 = "red:";

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!ri", name = "f", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!ri", name = "h", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ri", name = "i", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "[[[Lhi;")
    public static class192[][][] field3544;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 8)
    public static final void method1686(int arg0) {
        field3543++;
        class266.field3875 = null;
        class163.field2243 = null;
        if (arg0 != 12677) {
            method1686(-91);
        }
        class175.field2384 = null;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 135)
    public class246() {
        this.method1687(956);
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "(I)V", line = 25)
    private final void method1687(int arg0) {
        if (arg0 != 956) {
            this.method30();
        }
        field3551++;
        GL var2 = class67.field899;
        this.field3549 = var2.glGenLists(2);
        var2.glNewList(this.field3549, 4864);
        var2.glActiveTexture(33985);
        if (class69.field943) {
            var2.glBindTexture(32879, class69.field942);
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
        var2.glNewList(this.field3549 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class69.field943) {
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

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "()I", line = 72)
    public final int method25() {
        field3545++;
        return 0;
    }

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "()V", line = 81)
    public final void method30() {
        field3553++;
        GL var1 = class67.field899;
        var1.glCallList(this.field3549 + 1);
    }

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "(I)Lpn;", line = 93)
    public static final class170 method1688(int arg0) {
        if (arg0 >= -13) {
            return (class170) null;
        }
        byte[] var1 = class209.field3012[0];
        int var2 = class323.field4903[0] * class288.field4281[0];
        field3542++;
        int[] var3 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class235.field3331[class47.method303(var1[var4], 255)];
        }
        class170 var5;
        if (class67.field908) {
            var5 = new class328(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], var3);
        } else {
            var5 = new class178(class154.field2136, class194.field2674, class209.field3002[0], class274.field4115[0], class323.field4903[0], class288.field4281[0], var3);
        }
        class236.method1624(44);
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "()V", line = 123)
    public final void method26() {
        field3554++;
        GL var1 = class67.field899;
        var1.glCallList(this.field3549);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BZLrk;)V", line = 146)
    public static final void method1689(byte arg0, boolean arg1, class277 arg2) {
        if (class67.field908 || arg1) {
            int var3 = class64.field836;
            int var4 = var3 * 956 / 503;
            class290.field4336.method837((class187.field2592 - var4) / 2, 0, var4, var3);
            class103.field1405.method8(class187.field2592 / 2 - (class103.field1405.field28 / 2), 18);
        }
        arg2.method1909(class193.field2656, class187.field2592 / 2, class64.field836 / 2 - 26, 16777215, -1);
        if (arg0 >= -50) {
            method1686(-125);
        }
        field3547++;
        int var5 = class64.field836 / 2 - 18;
        if (class67.field908) {
            class102.method750(class187.field2592 / 2 - 152, var5, 304, 34, 9179409);
            class102.method750(class187.field2592 / 2 - 151, var5 - -1, 302, 32, 0);
            class102.method738(class187.field2592 / 2 - 150, var5 + 2, class271.field4052 * 3, 30, 9179409);
            class102.method738(class271.field4052 * 3 + (class187.field2592 / 2 - 150), var5 + 2, 300 - class271.field4052 * 3, 30, 0);
        } else {
            class38.method216(class187.field2592 / 2 - 152, var5, 304, 34, 9179409);
            class38.method216(class187.field2592 / 2 - 151, var5 + 1, 302, 32, 0);
            class38.method224(class187.field2592 / 2 - 150, var5 + 2, class271.field4052 * 3, 30, 9179409);
            class38.method224(class271.field4052 * 3 + (class187.field2592 / 2 - 150), var5 - -2, 300 - (class271.field4052 * 3), 30, 0);
        }
        arg2.method1909(class124.field1680, class187.field2592 / 2, class64.field836 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 195)
    public final void method29(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class67.field899;
        field3546++;
        float var4 = (float) (((arg0 & 0x1E) >> 3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field3541[3] = 0.0F;
            this.field3541[0] = var5;
            this.field3541[1] = 0.0F;
            this.field3541[2] = 0.0F;
        } else {
            this.field3541[2] = var5;
            this.field3541[3] = 0.0F;
            this.field3541[1] = 0.0F;
            this.field3541[0] = 0.0F;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class150.field2069 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class259.field3820 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class271.field4059), (float) (-class189.field2610), (float) (-class236.field3351));
        var3.glTexGenfv(8192, 9474, this.field3541, 0);
        this.field3541[1] = var5;
        this.field3541[3] = (float) class67.field900 * var2;
        this.field3541[0] = 0.0F;
        this.field3541[2] = 0.0F;
        var3.glTexGenfv(8193, 9474, this.field3541, 0);
        var3.glPopMatrix();
        if (class69.field943) {
            this.field3541[1] = 0.0F;
            this.field3541[0] = 0.0F;
            this.field3541[2] = 0.0F;
            this.field3541[3] = (float) class67.field900 * var4;
            var3.glTexGenfv(8194, 9473, this.field3541, 0);
        } else {
            int var7 = (int) ((float) class67.field900 * var4 * 64.0F);
            var3.glBindTexture(3553, class69.field946[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)V", line = 256)
    public static void method1690(byte arg0) {
        field3550 = null;
        int var1 = 86 % ((-arg0 - 6) / 60);
        field3544 = (class192[][][]) null;
    }
}
