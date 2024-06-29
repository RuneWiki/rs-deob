import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class263 implements class87 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "[F")
    private float[] field4555 = new float[4];

    @OriginalMember(owner = "client!a", name = "l", descriptor = "[I")
    public static int[] field4565 = new int[4096];

    @OriginalMember(owner = "client!a", name = "o", descriptor = "Lmh;")
    public static class128 field4568;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    private int field4560;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field4566;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Lpj;")
    public static class173 field4567;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Ldj;")
    public static class314 field4563;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lca;")
    public static class91 field4554;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "()V", line = 5)
    public final void method501() {
        field4561++;
        GL var1 = class247.field4253;
        var1.glCallList(this.field4560);
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V", line = 210)
    public class263() {
        this.method1846(-86);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Ldj;III)Lqg;", line = 21)
    public static final class231 method1844(class314 arg0, int arg1, int arg2, int arg3) {
        field4566++;
        if (class118.method708(-2, arg1, arg0, arg2)) {
            if (arg3 > -42) {
                method1844((class314) null, -125, 11, 62);
            }
            return class118.method712(255);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 35)
    public static void method1845(byte arg0) {
        field4565 = null;
        field4567 = null;
        field4568 = null;
        if (arg0 > -15) {
            field4565 = (int[]) null;
        }
        field4563 = null;
        field4554 = null;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "()I", line = 49)
    public final int method499() {
        field4562++;
        return 0;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V", line = 71)
    private final void method1846(int arg0) {
        field4557++;
        GL var2 = class247.field4253;
        this.field4560 = var2.glGenLists(2);
        var2.glNewList(this.field4560, 4864);
        var2.glActiveTexture(33985);
        if (class179.field3142) {
            var2.glBindTexture(32879, class179.field3141);
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
        int var3 = 18 % ((arg0 - 51) / 43);
        var2.glNewList(this.field4560 + 1, 4864);
        var2.glActiveTexture(33985);
        if (class179.field3142) {
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

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 125)
    public final void method503(int arg0) {
        field4559++;
        GL var2 = class247.field4253;
        float var3 = (float) (((arg0 & 0x1B) >> 3) + 1) * 0.01F;
        float var4 = (float) ((arg0 & 0x3) + 1) * -0.01F;
        float var5 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
        boolean var6 = (arg0 & 0x80) != 0;
        if (var6) {
            this.field4555[1] = 0.0F;
            this.field4555[3] = 0.0F;
            this.field4555[0] = var5;
            this.field4555[2] = 0.0F;
        } else {
            this.field4555[1] = 0.0F;
            this.field4555[0] = 0.0F;
            this.field4555[2] = var5;
            this.field4555[3] = 0.0F;
        }
        var2.glActiveTexture(33985);
        var2.glMatrixMode(5888);
        var2.glPushMatrix();
        var2.glLoadIdentity();
        var2.glRotatef(180.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class6.field130 * 360.0F / 2048.0F, 1.0F, 0.0F, 0.0F);
        var2.glRotatef((float) class254.field4380 * 360.0F / 2048.0F, 0.0F, 1.0F, 0.0F);
        var2.glTranslatef((float) (-class57.field1099), (float) (-class146.field2508), (float) (-class245.field4176));
        var2.glTexGenfv(8192, 9474, this.field4555, 0);
        this.field4555[3] = (float) class247.field4243 * var4;
        this.field4555[1] = var5;
        this.field4555[2] = 0.0F;
        this.field4555[0] = 0.0F;
        var2.glTexGenfv(8193, 9474, this.field4555, 0);
        var2.glPopMatrix();
        if (class179.field3142) {
            this.field4555[3] = (float) class247.field4243 * var3;
            this.field4555[0] = 0.0F;
            this.field4555[2] = 0.0F;
            this.field4555[1] = 0.0F;
            var2.glTexGenfv(8194, 9473, this.field4555, 0);
        } else {
            int var7 = (int) ((float) class247.field4243 * var3 * 64.0F);
            var2.glBindTexture(3553, class179.field3144[var7 % 64]);
        }
        var2.glActiveTexture(33984);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BI)V", line = 188)
    public static final void method1847(byte arg0, int arg1) {
        class102.field1756 = -1;
        class102.field1756 = -1;
        int var2 = 11 % ((-arg0 - 29) / 47);
        field4556++;
        if (arg1 == 37) {
            class3.field64 = 3.0F;
        } else if (arg1 == 50) {
            class3.field64 = 4.0F;
        } else if (arg1 == 75) {
            class3.field64 = 6.0F;
        } else {
            class3.field64 = 8.0F;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "()V", line = 221)
    public final void method502() {
        GL var1 = class247.field4253;
        var1.glCallList(this.field4560 + 1);
        field4558++;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V", line = 230)
    public static final void method1848(byte arg0) {
        field4564++;
        if (class298.field5078 > 0) {
            class26.method170(-18794);
            return;
        }
        class183.field3214 = class121.field2041;
        if (arg0 != 88) {
            method1845((byte) -124);
        }
        class121.field2041 = null;
        class298.method2039((byte) -52, 40);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4565[var0] = class229.method1570(var0, 7283);
        }
        field4568 = class22.method156(124, "Fps:");
    }
}
