import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class182 implements class246 {

    @OriginalMember(owner = "client!en", name = "e", descriptor = "[F")
    private float[] field2741 = new float[4];

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field2743 = 0;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field2747 = -1;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "[I")
    public static int[] field2740 = new int[4];

    @OriginalMember(owner = "client!en", name = "l", descriptor = "Lmc;")
    public static class160 field2748 = new class160(0, -1);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field2738;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field2742;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    private int field2745;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "Ll;")
    public static class133 field2737;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V", line = 7)
    public static void method1300(byte arg0) {
        field2740 = null;
        field2737 = null;
        int var1 = 25 % ((-arg0 - 2) / 62);
        field2748 = null;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V", line = 18)
    public static final void method1301(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class325 var20 = new class325(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class256.field4013[var21][arg1][arg2] == null) {
                    class256.field4013[var21][arg1][arg2] = new class142(var21, arg1, arg2);
                }
            }
            class256.field4013[arg0][arg1][arg2].field2211 = var20;
        } else if (arg3 == 1) {
            class325 var22 = new class325(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class256.field4013[var23][arg1][arg2] == null) {
                    class256.field4013[var23][arg1][arg2] = new class142(var23, arg1, arg2);
                }
            }
            class256.field4013[arg0][arg1][arg2].field2211 = var22;
        } else {
            class157 var24 = new class157(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class256.field4013[var25][arg1][arg2] == null) {
                    class256.field4013[var25][arg1][arg2] = new class142(var25, arg1, arg2);
                }
            }
            class256.field4013[arg0][arg1][arg2].field2200 = var24;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 68)
    public final void method457(int arg0) {
        field2744++;
        GL var2 = class94.field1473;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var4 = (arg0 & 0x80) != 0;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var6 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        if (var4) {
            this.field2741[2] = 0.0F;
            this.field2741[0] = var5;
            this.field2741[3] = 0.0F;
            this.field2741[1] = 0.0F;
        } else {
            this.field2741[3] = 0.0F;
            this.field2741[2] = var5;
            this.field2741[0] = 0.0F;
            this.field2741[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class40.field607 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class77.field1239 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class300.field4683), (float) (-class285.field4469), (float) (-class22.field344));
        var2.glTexGenfv(8192, 9474, this.field2741, 0);
        this.field2741[2] = 0.0F;
        this.field2741[0] = 0.0F;
        this.field2741[1] = var5;
        this.field2741[3] = (float) class94.field1499 * var3;
        var2.glTexGenfv(8193, 9474, this.field2741, 0);
        var2.glPopMatrix();
        if (class334.field5229) {
            this.field2741[0] = 0.0F;
            this.field2741[3] = (float) class94.field1499 * var6;
            this.field2741[2] = 0.0F;
            this.field2741[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field2741, 0);
        } else {
            int var7 = (int) ((float) class94.field1499 * var6 * 64.0F);
            var2.glBindTexture(3553, class334.field5227[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "()V", line = 132)
    public final void method458() {
        field2742++;
        GL var1 = class94.field1473;
        var1.glCallList(this.field2745);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "()I", line = 142)
    public final int method452() {
        field2739++;
        return 0;
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V", line = 177)
    public class182() {
        this.method1302(4);
    }

    @OriginalMember(owner = "client!en", name = "c", descriptor = "()V", line = 161)
    public final void method454() {
        field2746++;
        GL var1 = class94.field1473;
        var1.glCallList(this.field2745 + 1);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V", line = 192)
    private final void method1302(int arg0) {
        GL var2 = class94.field1473;
        field2738++;
        this.field2745 = var2.glGenLists(2);
        if (arg0 != 4) {
            return;
        }
        var2.glNewList(this.field2745, 4864);
        var2.glActiveTexture(33985);
        if (class334.field5229) {
            var2.glBindTexture(32879, class334.field5225);
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
        var2.glNewList(this.field2745 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class334.field5229) {
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
}
