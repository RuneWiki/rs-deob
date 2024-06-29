import java.math.BigInteger;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class178 implements class39 {

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "[F")
    private float[] field3061 = new float[4];

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3064 = new BigInteger("111425062890301051365206642964372080941130087045221691750738418203817739415579");

    @OriginalMember(owner = "client!uc", name = "m", descriptor = "Z")
    public static boolean field3068 = true;

    @OriginalMember(owner = "client!uc", name = "l", descriptor = "Lj;")
    public static class269 field3067 = new class269();

    @OriginalMember(owner = "client!uc", name = "n", descriptor = "Lbe;")
    public static class283 field3069 = class153.method941(125, "<col=ffb000>");

    @OriginalMember(owner = "client!uc", name = "o", descriptor = "Lbe;")
    public static class283 field3070 = class153.method941(126, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "I")
    private int field3062;

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!uc", name = "j", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!uc", name = "k", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "Lqc;")
    public static class4 field3072;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)I", line = 6)
    public static final int method1171(int arg0, int arg1) {
        if (arg0 < 100) {
            return -66;
        } else {
            field3066++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()V", line = 19)
    public final void method245() {
        field3056++;
        GL var1 = class167.field2806;
        var1.glCallList(this.field3062 + 1);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V", line = 29)
    public static void method1172(int arg0) {
        field3067 = null;
        field3064 = null;
        if (arg0 != -5933) {
            field3067 = (class269) null;
        }
        field3070 = null;
        field3069 = null;
        field3072 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)Lbe;", line = 47)
    public static final class283 method1173(byte arg0, long arg1) {
        field3058++;
        if (arg0 != -123) {
            field3068 = true;
        }
        return class215.method1422(true, false, arg1, 10);
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)I", line = 64)
    public static int method1174(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()I", line = 77)
    public final int method244() {
        field3059++;
        return 0;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V", line = 86)
    public final void method246(int arg0) {
        GL var2 = class167.field2806;
        field3057++;
        float var3 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var4 = (float) (((arg0 & 0x18) >> 3) + 1) * 0.01F;
        boolean var5 = (arg0 & 0x80) != 0;
        float var6 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        if (var5) {
            this.field3061[1] = 0.0F;
            this.field3061[0] = var6;
            this.field3061[3] = 0.0F;
            this.field3061[2] = 0.0F;
        } else {
            this.field3061[0] = 0.0F;
            this.field3061[2] = var6;
            this.field3061[3] = 0.0F;
            this.field3061[1] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class75.field1316 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class45.field615 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class128.field2134), (float) (-class36.field533), (float) (-class277.field4629));
        var2.glTexGenfv(8192, 9474, this.field3061, 0);
        this.field3061[1] = var6;
        this.field3061[3] = (float) class167.field2803 * var3;
        this.field3061[2] = 0.0F;
        this.field3061[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field3061, 0);
        var2.glPopMatrix();
        if (class73.field1283) {
            this.field3061[0] = 0.0F;
            this.field3061[1] = 0.0F;
            this.field3061[2] = 0.0F;
            this.field3061[3] = (float) class167.field2803 * var4;
            var2.glTexGenfv(8194, 9473, this.field3061, 0);
        } else {
            int var7 = (int) ((float) class167.field2803 * var4 * 64.0F);
            var2.glBindTexture(3553, class73.field1279[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)V", line = 150)
    private final void method1175(int arg0) {
        if (arg0 != 3) {
            method1172(42);
        }
        field3060++;
        GL var2 = class167.field2806;
        this.field3062 = var2.glGenLists(2);
        var2.glNewList(this.field3062, 4864);
        var2.glActiveTexture(33985);
        if (class73.field1283) {
            var2.glBindTexture(32879, class73.field1284);
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
        var2.glNewList(this.field3062 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class73.field1283) {
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

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 199)
    public class178() {
        this.method1175(3);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()V", line = 209)
    public final void method247() {
        GL var1 = class167.field2806;
        field3065++;
        var1.glCallList(this.field3062);
    }
}
