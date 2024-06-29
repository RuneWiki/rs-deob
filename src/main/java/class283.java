import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class283 implements class182 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[F")
    private float[] field4375 = new float[4];

    @OriginalMember(owner = "client!re", name = "l", descriptor = "[I")
    public static int[] field4378 = new int[1000];

    @OriginalMember(owner = "client!re", name = "b", descriptor = "Ldf;")
    public static class177 field4368 = new class177(64);

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field4382 = 0;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    private int field4373;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4380;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "()I", line = 5)
    public final int method230() {
        field4367++;
        return 0;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "()V", line = 17)
    public final void method231() {
        GL var1 = class240.field3771;
        field4371++;
        var1.glCallList(this.field4373);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 28)
    public final void method229(int arg0) {
        field4369++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var3 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var4 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var5 = (arg0 & 0x80) != 0;
        if (var5) {
            this.field4375[3] = 0.0F;
            this.field4375[1] = 0.0F;
            this.field4375[2] = 0.0F;
            this.field4375[0] = var4;
        } else {
            this.field4375[3] = 0.0F;
            this.field4375[2] = var4;
            this.field4375[1] = 0.0F;
            this.field4375[0] = 0.0F;
        }
        GL var6 = class240.field3771;
        var6.glActiveTexture(33985);
        var6.glMatrixMode(5888);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var6.glRotatef((float) class290.field4516 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var6.glRotatef((float) class159.field2537 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var6.glTranslatef((float) (-class173.field2753), (float) (-class352.field5621), (float) (-class315.field4866));
        var6.glTexGenfv(8192, 9474, this.field4375, 0);
        this.field4375[3] = (float) class240.field3748 * var2;
        this.field4375[0] = 0.0F;
        this.field4375[1] = var4;
        this.field4375[2] = 0.0F;
        var6.glTexGenfv(8193, 9474, this.field4375, 0);
        var6.glPopMatrix();
        if (class333.field5106) {
            this.field4375[2] = 0.0F;
            this.field4375[1] = 0.0F;
            this.field4375[0] = 0.0F;
            this.field4375[3] = (float) class240.field3748 * var3;
            var6.glTexGenfv(8194, 9473, this.field4375, 0);
        } else {
            int var7 = (int) ((float) class240.field3748 * var3 * 64.0F);
            var6.glBindTexture(3553, class333.field5105[var7 % 64]);
        }
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V", line = 94)
    private final void method2058(byte arg0) {
        GL var2 = class240.field3771;
        field4374++;
        this.field4373 = var2.glGenLists(2);
        var2.glNewList(this.field4373, 4864);
        var2.glActiveTexture(33985);
        if (class333.field5106) {
            var2.glBindTexture(32879, class333.field5103);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        var2.glTexGeni(8192, 9472, 9216);
        if (arg0 < 99) {
            return;
        }
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field4373 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class333.field5106) {
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

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[IBII)V", line = 138)
    public static final void method2059(int arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        field4370++;
        if (arg2 < 87) {
            return;
        }
        arg4--;
        int var6 = arg3 - 1;
        int var5 = var6 - 7;
        while (var5 > arg4) {
            int var7 = arg4 + 1;
            arg1[var7] = arg0;
            int var8 = var7 + 1;
            arg1[var8] = arg0;
            int var9 = var8 + 1;
            arg1[var9] = arg0;
            int var10 = var9 + 1;
            arg1[var10] = arg0;
            int var11 = var10 + 1;
            arg1[var11] = arg0;
            int var12 = var11 + 1;
            arg1[var12] = arg0;
            int var13 = var12 + 1;
            arg1[var13] = arg0;
            arg4 = var13 + 1;
            arg1[arg4] = arg0;
        }
        while (var6 > arg4) {
            arg4++;
            arg1[arg4] = arg0;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IC)Z", line = 166)
    public static final boolean method2060(int arg0, char arg1) {
        field4372++;
        if (arg0 == 1) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I[Lrg;IZIB)V", line = 182)
    public static final void method2061(int arg0, class342[] arg1, int arg2, boolean arg3, int arg4, byte arg5) {
        field4377++;
        for (int var6 = 0; var6 < arg1.length; var6++) {
            class342 var7 = arg1[var6];
            if (var7 != null && var7.field5296 == arg0) {
                class287.method2075(-27006, arg2, var7, arg3, arg4);
                class146.method1223(arg4, true, var7, arg2);
                if (var7.field5278 - var7.field5374 < var7.field5351) {
                    var7.field5351 = var7.field5278 - var7.field5374;
                }
                if (var7.field5351 < 0) {
                    var7.field5351 = 0;
                }
                if (var7.field5264 - var7.field5339 < var7.field5334) {
                    var7.field5334 = var7.field5264 - var7.field5339;
                }
                if (var7.field5334 < 0) {
                    var7.field5334 = 0;
                }
                if (var7.field5279 == 0) {
                    class205.method1530(var7, arg3, 0);
                }
            }
        }
        if (arg5 > -127) {
            method2062((byte) 14);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "()V", line = 230)
    public final void method232() {
        GL var1 = class240.field3771;
        var1.glCallList(this.field4373 + 1);
        field4376++;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "()V", line = 256)
    public class283() {
        this.method2058((byte) 106);
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)V", line = 273)
    public static void method2062(byte arg0) {
        if (arg0 > -65) {
            field4383 = -87;
        }
        field4380 = null;
        field4378 = null;
        field4368 = null;
    }
}
