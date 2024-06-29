import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class397 extends class497 {

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "Lmha;")
    private class438 field5828;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "Lpba;")
    private class352 field5829;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "[Lvr;")
    public static class147[] field5832;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Z")
    public final boolean method157(int arg0) {
        ++field5831;
        return arg0 == -6808;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
    public static void method2494(int arg0) {
        field5832 = null;
        if (arg0 != 3) {
            field5832 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILil;I)V")
    public final void method158(int arg0, class7 arg1, int arg2) {
        ++field5834;
        super.field6867.method1653((byte) 90, arg1);
        super.field6867.method1589(arg0 ^ -11, arg2);
        if (arg0 != 9) {
            this.method164(2, true);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
    public final void method161(int arg0) {
        ++field5826;
        this.field5829.method2219('\u0001', (byte) -89);
        if (arg0 != -1756) {
            this.method158(117, (class7) null, -101);
        }
        super.field6867.method1637(arg0 + 35740, 1);
        super.field6867.method1653((byte) 87, (class7) null);
        super.field6867.method1637(33984, 0);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IZ)V")
    public final void method164(int arg0, boolean arg1) {
        if (arg0 == 0) {
            ++field5827;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(ZZ)V")
    public final void method163(boolean arg0, boolean arg1) {
        if (arg1) {
            field5832 = null;
        }
        this.field5829.method2219('\u0000', (byte) -89);
        ++field5833;
        if (this.field5828.field6164) {
            super.field6867.method1637(33984, 1);
            super.field6867.method1653((byte) 81, this.field5828.field6163);
            super.field6867.method1637(33984, 0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Ldia;Lmha;)V")
    public class397(class246 arg0, class438 arg1) {
        super(arg0);
        this.field5828 = arg1;
        this.field5829 = new class352(arg0, 2);
        this.field5829.method2218(0, false);
        super.field6867.method1637(33984, 1);
        if (this.field5828.field6164) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
        }
        OpenGL.glTexGeni(8192, 9472, 9216);
        OpenGL.glTexGeni(8193, 9472, 9216);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        super.field6867.method1637(33984, 0);
        this.field5829.method2220(27294);
        this.field5829.method2218(1, false);
        super.field6867.method1637(33984, 1);
        if (this.field5828.field6164) {
            OpenGL.glDisable(3170);
        }
        OpenGL.glDisable(3168);
        OpenGL.glDisable(3169);
        super.field6867.method1637(33984, 0);
        this.field5829.method2220(27294);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(III)V")
    public final void method162(int arg0, int arg1, int arg2) {
        ++field5835;
        float var4 = (float) ((3 & arg1) + 1) * -5.0E-4F;
        float var5 = (float) ((arg1 >> 3 & 3) + 1) * 5.0E-4F;
        float var6 = (64 & arg1) != 0 ? 9.765625E-4F : 4.8828125E-4F;
        super.field6867.method1637(33984, 1);
        boolean var7 = (arg1 & 128) != 0;
        if (!var7) {
            class130.field1933[1] = 0.0F;
            class130.field1933[0] = 0.0F;
            class130.field1933[2] = var6;
            class130.field1933[3] = 0.0F;
        } else {
            class130.field1933[0] = var6;
            class130.field1933[1] = 0.0F;
            class130.field1933[2] = 0.0F;
            class130.field1933[3] = 0.0F;
        }
        OpenGL.glTexGenfv(8192, 9474, class130.field1933, 0);
        class130.field1933[2] = 0.0F;
        class130.field1933[0] = 0.0F;
        class130.field1933[1] = var6;
        class130.field1933[3] = (float) super.field6867.field3532 * var4 % 1.0F;
        OpenGL.glTexGenfv(8193, 9474, class130.field1933, 0);
        if (arg0 <= 122) {
            this.field5829 = null;
        }
        if (this.field5828.field6164) {
            class130.field1933[3] = (float) super.field6867.field3532 * var5 % 1.0F;
            class130.field1933[0] = 0.0F;
            class130.field1933[2] = 0.0F;
            class130.field1933[1] = 0.0F;
            OpenGL.glTexGenfv(8194, 9473, class130.field1933, 0);
        } else {
            int var8 = (int) ((float) super.field6867.field3532 * var5 * 16.0F);
            super.field6867.method1653((byte) 91, this.field5828.field6162[var8 % 16]);
        }
        super.field6867.method1637(33984, 0);
    }
}
