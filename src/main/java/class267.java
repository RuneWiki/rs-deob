import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class267 implements class173 {

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "[F")
    private float[] field4164 = new float[4];

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lqf;")
    public static class311 field4161 = new class311(32);

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lkm;")
    public static class156 field4163 = new class156();

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4167 = "glow1:";

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "[I")
    public static int[] field4168 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    private int field4155;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "I")
    public static int field4165;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "[I")
    public static int[] field4166;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "()V", line = 13)
    public final void method355() {
        field4157++;
        GL var1 = class109.field1456;
        var1.glCallList(this.field4155 + 1);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIIIZI)V", line = 22)
    public static final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class92.field1230 = arg3;
        if (arg4 < 85) {
            method1900(-44, 111, 80, -4, -91);
        }
        class21.field313 = arg1;
        field4154++;
        class132.field1950 = arg0;
        class78.field1047 = arg6;
        class171.field2815 = arg2;
        if (arg5 && class92.field1230 >= 100) {
            class295.field4572 = class21.field313 * 128 + 64;
            class317.field5018 = class78.field1047 * 128 + 64;
            class43.field588 = class320.method2245((byte) -83, class317.field5018, class154.field2392, class295.field4572) - class171.field2815;
        }
        class166.field2715 = 2;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIIII)V", line = 55)
    public static final void method1900(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4158++;
        if (arg4 != 3) {
            field4166 = (int[]) null;
        }
        if (arg3 <= arg2) {
            class256.method1853(class284.field4402[arg0], arg3, arg1, arg2, 0);
        } else {
            class256.method1853(class284.field4402[arg0], arg2, arg1, arg3, 0);
        }
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "()I", line = 74)
    public final int method352() {
        field4159++;
        return 0;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 84)
    public final void method353(int arg0) {
        GL var2 = class109.field1456;
        field4156++;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        boolean var4 = (arg0 & 0x80) != 0;
        float var5 = (float) (((arg0 & 0x1E) >> 3) + 1) * 0.01F;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var4) {
            this.field4164[1] = 0.0F;
            this.field4164[3] = 0.0F;
            this.field4164[2] = 0.0F;
            this.field4164[0] = var6;
        } else {
            this.field4164[2] = var6;
            this.field4164[0] = 0.0F;
            this.field4164[3] = 0.0F;
            this.field4164[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class339.field5296 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class179.field2918 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class327.field5129), (float) (-class15.field258), (float) (-class235.field3668));
        var2.glTexGenfv(8192, 9474, this.field4164, 0);
        this.field4164[0] = 0.0F;
        this.field4164[1] = var6;
        this.field4164[2] = 0.0F;
        this.field4164[3] = (float) class109.field1472 * var3;
        var2.glTexGenfv(8193, 9474, this.field4164, 0);
        var2.glPopMatrix();
        if (class148.field2325) {
            this.field4164[3] = (float) class109.field1472 * var5;
            this.field4164[2] = 0.0F;
            this.field4164[0] = 0.0F;
            this.field4164[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4164, 0);
        } else {
            int var7 = (int) ((float) class109.field1472 * var5 * 64.0F);
            var2.glBindTexture(3553, class148.field2328[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "()V", line = 145)
    public final void method354() {
        field4162++;
        GL var1 = class109.field1456;
        var1.glCallList(this.field4155);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)V", line = 163)
    public static void method1901(int arg0) {
        if (arg0 < 13) {
            return;
        }
        field4166 = null;
        field4167 = null;
        field4163 = null;
        field4168 = null;
        field4161 = null;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V", line = 177)
    private final void method1902(int arg0) {
        field4160++;
        GL var2 = class109.field1456;
        this.field4155 = var2.glGenLists(2);
        var2.glNewList(this.field4155, 4864);
        var2.glActiveTexture(33985);
        if (class148.field2325) {
            var2.glBindTexture(32879, class148.field2329);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        if (arg0 != -27663) {
            return;
        }
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field4155 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class148.field2325) {
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

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 231)
    public class267() {
        this.method1902(-27663);
    }
}
