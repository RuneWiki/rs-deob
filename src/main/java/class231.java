import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class231 extends class457 {

    @OriginalMember(owner = "client!tu", name = "s", descriptor = "Z")
    private boolean field3261 = false;

    @OriginalMember(owner = "client!tu", name = "l", descriptor = "Lih;")
    private class492 field3254;

    @OriginalMember(owner = "client!tu", name = "p", descriptor = "J")
    public static long field3258 = 0L;

    @OriginalMember(owner = "client!tu", name = "t", descriptor = "Lwj;")
    public static class270 field3262 = new class270(88, 10);

    @OriginalMember(owner = "client!tu", name = "y", descriptor = "Ldi;")
    public static class83 field3267 = new class83(54, 7);

    @OriginalMember(owner = "client!tu", name = "m", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!tu", name = "o", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!tu", name = "q", descriptor = "I")
    public static int field3259;

    @OriginalMember(owner = "client!tu", name = "r", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!tu", name = "u", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!tu", name = "v", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!tu", name = "w", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!tu", name = "x", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!tu", name = "z", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!tu", name = "A", descriptor = "Lja;")
    public static class182 field3269;

    @OriginalMember(owner = "client!tu", name = "n", descriptor = "Ljava/lang/String;")
    public static String field3256;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZB)V", line = 4)
    public final void method435(boolean arg0, byte arg1) {
        if (arg1 <= 32) {
            this.field3254 = null;
        }
        ++field3260;
        super.field6706.method1963(true, 8448, 7681);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IIZ)V", line = 15)
    public final void method430(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            field3258 = 19L;
        }
        ++field3257;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z", line = 25)
    public final boolean method429(int arg0) {
        ++field3266;
        if (arg0 != 0) {
            field3258 = -74L;
        }
        return true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V", line = 36)
    public final void method433(byte arg0) {
        ++field3263;
        if (this.field3261) {
            this.field3254.method2881(0, '\u0001');
            super.field6706.method1950(arg0 + -29855, 1);
            super.field6706.method1996(2, (class40) null);
            super.field6706.method1950(-29847, 0);
        } else {
            super.field6706.method1973(5890, 0, 0, 770);
        }
        super.field6706.method1963(true, 8448, 8448);
        if (arg0 != 8) {
            this.method434(105, true);
        }
        this.field3261 = false;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)[B", line = 60)
    public static final byte[] method1425(int arg0, int arg1) {
        ++field3264;
        int var2 = -15 % ((-21 - arg1) / 60);
        class106 var3 = (class106) class104.field1562.method3117((long) arg0, 70);
        if (var3 == null) {
            byte[] var4 = new byte[512];
            Random var5 = new Random((long) arg0);
            for (int var6 = 0; var6 < 255; ++var6) {
                var4[var6] = (byte) var6;
            }
            for (int var7 = 0; ~var7 > -256; ++var7) {
                int var8 = -var7 + 255;
                int var9 = class367.method2213(-837693600, var8, var5);
                byte var10 = var4[var9];
                var4[var9] = var4[var8];
                var4[var8] = var4[-var7 + 511] = var10;
            }
            var3 = new class106(var4);
            class104.field1562.method3113(var3, (byte) -47, (long) arg0);
        }
        return var3.field1591;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Lmk;II)V", line = 107)
    public final void method431(class40 arg0, int arg1, int arg2) {
        ++field3259;
        super.field6706.method1996(arg1 + -382, arg0);
        if (arg1 != 384) {
            field3268 = 117;
        }
        super.field6706.method1974(arg2, 4609);
    }

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "(I)V", line = 120)
    public static void method1426(int arg0) {
        field3267 = null;
        if (arg0 == 34168) {
            field3269 = null;
            field3262 = null;
            field3256 = null;
        }
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Lef;)V", line = 135)
    public class231(class338 arg0) {
        super(arg0);
        if (arg0.field4854) {
            this.field3254 = new class492(arg0, 2);
            this.field3254.method2884(4864, 0);
            super.field6706.method1950(-29847, 1);
            super.field6706.method1963(true, 34165, 7681);
            super.field6706.method1975(34176, 34168, 770, 2);
            super.field6706.method1973(34167, 0, 0, 770);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field6706.method1950(-29847, 0);
            this.field3254.method2883(-30137);
            this.field3254.method2884(4864, 1);
            super.field6706.method1950(-29847, 1);
            super.field6706.method1963(true, 8448, 8448);
            super.field6706.method1975(34176, 34166, 770, 2);
            super.field6706.method1973(5890, 0, 0, 770);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field6706.method1950(-29847, 0);
            this.field3254.method2883(-30137);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Ljava/lang/String;[S)V", line = 176)
    public static final void method1427(int arg0, String[] arg1, short[] arg2) {
        ++field3265;
        if (arg0 < 116) {
            field3268 = 74;
        }
        class5.method32(0, arg1, (byte) 48, arg2, arg1.length + -1);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(IZ)V", line = 200)
    public final void method434(int arg0, boolean arg1) {
        ++field3255;
        class39 var3 = super.field6706.method1959(34018);
        if (arg0 != 28037) {
            this.method429(-94);
        }
        if (this.field3254 != null && var3 != null && arg1) {
            this.field3254.method2881(0, '\u0000');
            super.field6706.method1950(-29847, 1);
            super.field6706.method1996(2, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field6706.field4819.method1444(127), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field6706.method1950(-29847, 0);
            this.field3261 = true;
        } else {
            super.field6706.method1973(34168, 0, 0, 770);
        }
    }
}
