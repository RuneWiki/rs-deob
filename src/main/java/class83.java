import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class83 implements class243 {

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "[F")
    private float[] field1380 = new float[4];

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    public static int[] field1377 = new int[1000];

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lwa;")
    public static class75 field1385 = class66.method560(":allyreq:", false);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Lwa;")
    public static class75 field1388 = class66.method560(")4a=", false);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lwa;")
    public static class75 field1381 = class66.method560("Art", false);

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field1390 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1379;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field1383;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    private int field1387;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Lsh;")
    public static class273 field1389;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()I", line = 11)
    public final int method163() {
        field1379++;
        return 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()V", line = 42)
    public final void method164() {
        GL var1 = class47.field739;
        var1.glCallList(this.field1387 + 1);
        field1378++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V", line = 51)
    public static void method685(int arg0) {
        field1377 = null;
        field1385 = null;
        if (arg0 != 64) {
            method685(-11);
        }
        field1381 = null;
        field1389 = null;
        field1388 = null;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 78)
    public class83() {
        this.method687((byte) -128);
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V", line = 89)
    public static final void method686(int arg0) {
        class310.field5269 = new class126(32);
        field1383++;
        if (arg0 != 2048) {
            method686(13);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 106)
    private final void method687(byte arg0) {
        field1382++;
        GL var2 = class47.field739;
        this.field1387 = var2.glGenLists(2);
        var2.glNewList(this.field1387, 4864);
        var2.glActiveTexture(33985);
        if (class225.field3801) {
            var2.glBindTexture(32879, class225.field3800);
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
        if (arg0 > -127) {
            field1385 = (class75) null;
        }
        var2.glNewList(this.field1387 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class225.field3801) {
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

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()V", line = 162)
    public final void method162() {
        GL var1 = class47.field739;
        field1384++;
        var1.glCallList(this.field1387);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 173)
    public final void method161(int arg0) {
        float var2 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        GL var3 = class47.field739;
        field1386++;
        float var4 = (float) ((arg0 >> 3 & 0x3) + 1) * 0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field1380[0] = var5;
            this.field1380[1] = 0.0F;
            this.field1380[3] = 0.0F;
            this.field1380[2] = 0.0F;
        } else {
            this.field1380[3] = 0.0F;
            this.field1380[0] = 0.0F;
            this.field1380[1] = 0.0F;
            this.field1380[2] = var5;
        }
        var3.glActiveTexture(33985);
        var3.glMatrixMode(5888);
        var3.glPushMatrix();
        var3.glLoadIdentity();
        var3.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class155.field2651 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var3.glRotatef((float) class69.field1182 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var3.glTranslatef((float) (-class82.field1368), (float) (-class287.field4934), (float) (-class145.field2502));
        var3.glTexGenfv(8192, 9474, this.field1380, 0);
        this.field1380[2] = 0.0F;
        this.field1380[0] = 0.0F;
        this.field1380[3] = (float) class47.field743 * var2;
        this.field1380[1] = var5;
        var3.glTexGenfv(8193, 9474, this.field1380, 0);
        var3.glPopMatrix();
        if (class225.field3801) {
            this.field1380[0] = 0.0F;
            this.field1380[3] = (float) class47.field743 * var4;
            this.field1380[2] = 0.0F;
            this.field1380[1] = 0.0F;
            var3.glTexGenfv(8194, 9473, this.field1380, 0);
        } else {
            int var7 = (int) ((float) class47.field743 * var4 * 64.0F);
            var3.glBindTexture(3553, class225.field3806[var7 % 64]);
        }
        var3.glActiveTexture(33984);
    }
}
