import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class26 implements class236 {

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "[F")
    private float[] field356 = new float[4];

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "Lpc;")
    public static class102 field365 = new class102();

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field368 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field367;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Lcg;")
    public static class49 field366;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "Z")
    public static boolean field360;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "()I", line = 5)
    public final int method237() {
        field364++;
        return 0;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(JI)V", line = 17)
    public static final void method238(long arg0, int arg1) {
        field357++;
        if (arg0 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class352.field5570; var3++) {
            if (class339.field5414[var3] == arg0) {
                class168.field2935++;
                class352.field5570--;
                for (int var4 = var3; var4 < class352.field5570; var4++) {
                    class98.field1601[var4] = class98.field1601[var4 + 1];
                    class67.field1077[var4] = class67.field1077[var4 + 1];
                    class269.field4300[var4] = class269.field4300[var4 + 1];
                    class339.field5414[var4] = class339.field5414[var4 + 1];
                    class259.field4199[var4] = class259.field4199[var4 + 1];
                    class344.field5477[var4] = class344.field5477[var4 + 1];
                }
                class51.field809 = class99.field1606;
                class341.field5443.method26(233, 7);
                class341.field5443.method2333(arg0, 110);
                break;
            }
        }
        if (arg1 <= 108) {
            field368 = 49;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V", line = 66)
    public final void method239(int arg0) {
        field355++;
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var3 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        float var4 = (float) (((arg0 & 0x19) >> 3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        if (var5) {
            this.field356[1] = 0.0F;
            this.field356[2] = 0.0F;
            this.field356[0] = var3;
            this.field356[3] = 0.0F;
        } else {
            this.field356[0] = 0.0F;
            this.field356[2] = var3;
            this.field356[1] = 0.0F;
            this.field356[3] = 0.0F;
        }
        GL var6 = class43.field651;
        var6.glActiveTexture(33985);
        var6.glMatrixMode(5888);
        var6.glPushMatrix();
        var6.glLoadIdentity();
        var6.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var6.glRotatef((float) class90.field1423 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var6.glRotatef((float) class142.field2598 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var6.glTranslatef((float) (-class180.field3041), (float) (-class51.field808), (float) (-class160.field2838));
        var6.glTexGenfv(8192, 9474, this.field356, 0);
        this.field356[2] = 0.0F;
        this.field356[1] = var3;
        this.field356[3] = (float) class43.field675 * var2;
        this.field356[0] = 0.0F;
        var6.glTexGenfv(8193, 9474, this.field356, 0);
        var6.glPopMatrix();
        if (class6.field85) {
            this.field356[3] = (float) class43.field675 * var4;
            this.field356[1] = 0.0F;
            this.field356[2] = 0.0F;
            this.field356[0] = 0.0F;
            var6.glTexGenfv(8194, 9473, this.field356, 0);
        } else {
            int var7 = (int) ((float) class43.field675 * var4 * 64.0F);
            var6.glBindTexture(3553, class6.field82[var7 % 64]);
        }
        var6.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)V", line = 128)
    public static void method240(int arg0) {
        field365 = null;
        if (arg0 != 0) {
            field366 = (class49) null;
        }
        field366 = null;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 143)
    private final void method241(int arg0) {
        field362++;
        GL var2 = class43.field651;
        this.field359 = var2.glGenLists(2);
        var2.glNewList(this.field359, 4864);
        var2.glActiveTexture(33985);
        if (class6.field85) {
            var2.glBindTexture(32879, class6.field87);
            var2.glTexGeni(8194, 9472, 9217);
            var2.glEnable(3170);
            var2.glEnable(32879);
        } else {
            var2.glEnable(3553);
        }
        if (arg0 != 64) {
            return;
        }
        var2.glTexGeni(8192, 9472, 9216);
        var2.glTexGeni(8193, 9472, 9216);
        var2.glEnable(3168);
        var2.glEnable(3169);
        var2.glActiveTexture(33984);
        var2.glEndList();
        var2.glNewList(this.field359 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class6.field85) {
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

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIII)Lin;", line = 188)
    public static final class167 method242(int arg0, int arg1, int arg2, int arg3, int arg4) {
        long var5 = (long) arg4 & 0xFFFFL << 16 | ((long) arg2 & 0xFFFFL) << 48 | (long) arg1 & 0xFFFFL << 32 | (long) arg3 & 0xFFFFL;
        class167 var7 = (class167) class17.field259.method467(true, var5);
        if (arg0 < 46) {
            field368 = 39;
        }
        field367++;
        if (var7 != null) {
            return var7;
        }
        class196[] var8 = null;
        class56 var9 = class253.method1763(29, arg3);
        if (var9.field855 != null) {
            var8 = new class196[var9.field855.length];
            for (int var10 = 0; var10 < var8.length; var10++) {
                class127 var11 = class158.method1268(-128, var9.field855[var10]);
                var8[var10] = new class196(var11.field2200, var11.field2191, var11.field2202, var11.field2207, var11.field2197, var11.field2192, var11.field2204, var11.field2205);
            }
        }
        class167 var12 = new class167(var9.field854, var8, var9.field856, arg2, arg1, arg4);
        class17.field259.method465(var12, var5, (byte) 75);
        return var12;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "()V", line = 231)
    public final void method243() {
        field361++;
        GL var1 = class43.field651;
        var1.glCallList(this.field359 + 1);
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "()V", line = 244)
    public class26() {
        this.method241(64);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 255)
    public static final String method244(int arg0, long arg1) {
        field358++;
        if (arg0 != 1) {
            field368 = -81;
        }
        return class195.method1467(arg1, -11026);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "()V", line = 266)
    public final void method245() {
        field363++;
        GL var1 = class43.field651;
        var1.glCallList(this.field359);
    }
}
