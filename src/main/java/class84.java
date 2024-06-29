import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class84 implements class25 {

    @OriginalMember(owner = "client!qb", name = "j", descriptor = "[F")
    private float[] field1284 = new float[4];

    @OriginalMember(owner = "client!qb", name = "m", descriptor = "I")
    public static int field1287 = 0;

    @OriginalMember(owner = "client!qb", name = "n", descriptor = "Ltj;")
    public static class73 field1288 = new class73(4);

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    private int field1280;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!qb", name = "i", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!qb", name = "k", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!qb", name = "l", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "()V", line = 7)
    public final void method19() {
        field1279++;
        GL var1 = class45.field688;
        var1.glCallList(this.field1280 + 1);
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "()V", line = 19)
    public final void method15() {
        GL var1 = class45.field688;
        var1.glCallList(this.field1280);
        field1282++;
    }

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)V", line = 34)
    private final void method562(int arg0) {
        field1278++;
        GL var2 = class45.field688;
        this.field1280 = var2.glGenLists(arg0);
        var2.glNewList(this.field1280, 4864);
        var2.glActiveTexture(33985);
        if (class224.field3693) {
            var2.glBindTexture(32879, class224.field3695);
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
        var2.glNewList(this.field1280 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class224.field3693) {
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

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)V", line = 78)
    public static void method563(byte arg0) {
        if (arg0 >= -6) {
            method566(46, 92, -52, 38, -14);
        }
        field1288 = null;
    }

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V", line = 98)
    public static final void method564(int arg0) {
        int var1 = 103 % ((78 - arg0) / 37);
        field1285++;
        class106.field1568.method523(126);
        class193.field2995.method523(123);
        class210.field3352.method523(124);
        class252.field4177.method523(122);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)I", line = 113)
    public static final int method565(int arg0, boolean arg1) {
        field1275++;
        return arg1 ? arg0 & 0xFF : -89;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "()I", line = 130)
    public final int method17() {
        field1281++;
        return 0;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V", line = 143)
    public static final void method566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1286++;
        int var5 = 104 % ((arg0 + 49) / 37);
        for (int var6 = 0; var6 < class188.field2947; var6++) {
            if ((class218.field3510[var6] + class177.field2701[var6]) > arg3 && class218.field3510[var6] < arg3 + arg4 && class14.field257[var6] + class102.field1523[var6] > arg2 && (arg2 + arg1) > class14.field257[var6]) {
                class296.field4975[var6] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "<init>", descriptor = "()V", line = 258)
    public class84() {
        this.method562(2);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 171)
    public final void method16(int arg0) {
        field1283++;
        GL var2 = class45.field688;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) (((arg0 & 0x1D) >> 3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field1284[1] = 0.0F;
            this.field1284[0] = var5;
            this.field1284[2] = 0.0F;
            this.field1284[3] = 0.0F;
        } else {
            this.field1284[0] = 0.0F;
            this.field1284[1] = 0.0F;
            this.field1284[3] = 0.0F;
            this.field1284[2] = var5;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class86.field1303 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class89.field1332 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class282.field4789), (float) (-class223.field3687), (float) (-class150.field2167));
        var2.glTexGenfv(8192, 9474, this.field1284, 0);
        this.field1284[3] = (float) class45.field660 * var3;
        this.field1284[0] = 0.0F;
        this.field1284[1] = var5;
        this.field1284[2] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field1284, 0);
        var2.glPopMatrix();
        if (class224.field3693) {
            this.field1284[1] = 0.0F;
            this.field1284[3] = (float) class45.field660 * var4;
            this.field1284[0] = 0.0F;
            this.field1284[2] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field1284, 0);
        } else {
            int var7 = (int) ((float) class45.field660 * var4 * 64.0F);
            var2.glBindTexture(3553, class224.field3699[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lje;BI)V", line = 233)
    public static final void method567(class158 arg0, byte arg1, int arg2) {
        field1277++;
        if (class244.field4045 != null) {
            class244.field4045.field3610 = arg2 * 8 + 5;
            int var3 = class244.field4045.method1517((byte) -127);
            int var4 = class244.field4045.method1517((byte) -117);
            arg0.method1011(var4, 2, var3);
            return;
        }
        class255.method1783(true, 255, (byte) 0, 255, 0, 63, (class158) null);
        class275.field4697[arg2] = arg0;
        if (arg1 < 63) {
            method564(126);
        }
    }
}
