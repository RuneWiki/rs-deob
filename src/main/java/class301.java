import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dm")
public class class301 extends class374 {

    @OriginalMember(owner = "client!dm", name = "h", descriptor = "Z")
    private boolean field4473 = false;

    @OriginalMember(owner = "client!dm", name = "d", descriptor = "Lce;")
    private class328 field4469;

    @OriginalMember(owner = "client!dm", name = "g", descriptor = "I")
    public static int field4472 = 0;

    @OriginalMember(owner = "client!dm", name = "p", descriptor = "Ldp;")
    public static class347 field4481 = new class347("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!dm", name = "r", descriptor = "I")
    public static int field4483 = 0;

    @OriginalMember(owner = "client!dm", name = "s", descriptor = "[[I")
    public static int[][] field4484 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!dm", name = "e", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!dm", name = "f", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!dm", name = "i", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!dm", name = "j", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!dm", name = "l", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!dm", name = "m", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!dm", name = "n", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!dm", name = "o", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!dm", name = "q", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZLew;I)V", line = 5)
    public final void method18(boolean arg0, class271 arg1, int arg2) {
        ++field4477;
        super.field5646.method1546(-2, arg1);
        super.field5646.method1582(arg2, arg0);
    }

    @OriginalMember(owner = "client!dm", name = "<init>", descriptor = "(Lvd;)V", line = 15)
    public class301(class258 arg0) {
        super(arg0);
        if (arg0.field3810) {
            this.field4469 = new class328(arg0, 2);
            this.field4469.method2036((byte) -107, 0);
            super.field5646.method1553(1, -8156);
            super.field5646.method1576(34165, 7681, (byte) 62);
            super.field5646.method1590(770, 34168, true, 2);
            super.field5646.method1556(770, 34167, 0, 34184);
            OpenGL.glTexGeni(8192, 9472, 34066);
            OpenGL.glTexGeni(8193, 9472, 34066);
            OpenGL.glTexGeni(8194, 9472, 34066);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            super.field5646.method1553(0, -8156);
            this.field4469.method2041((byte) 33);
            this.field4469.method2036((byte) -107, 1);
            super.field5646.method1553(1, -8156);
            super.field5646.method1576(8448, 8448, (byte) -95);
            super.field5646.method1590(770, 34166, true, 2);
            super.field5646.method1556(770, 5890, 0, 34184);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            super.field5646.method1553(0, -8156);
            this.field4469.method2041((byte) 33);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZI)V", line = 54)
    public final void method19(boolean arg0, int arg1) {
        if (arg1 <= -2) {
            super.field5646.method1576(8448, 7681, (byte) -69);
            ++field4482;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(III)V", line = 65)
    public final void method20(int arg0, int arg1, int arg2) {
        ++field4474;
        if (arg1 != -20857) {
            this.field4473 = false;
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(IIIIIII)V", line = 75)
    public static final void method1872(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4471;
        for (class336 var7 = (class336) class295.field4411.method3089(-117); var7 != null; var7 = (class336) class295.field4411.method3088((byte) -65)) {
            if (class86.field1350 >= var7.field5183) {
                var7.method2096((byte) 103);
            } else {
                class406.method2444((var7.field5190 << 7) + 64, arg1 >> 1, (byte) 110, arg4, var7.field5188, arg6 >> 1, var7.field5182 * 2, arg5, (var7.field5180 << 7) + 64);
                class345.field5325.method1922(arg0 + 345786966, 0, -16777216 | var7.field5179, var7.field5187, class142.field2140[0] + arg3, class142.field2140[1] + arg2);
            }
        }
        if (arg0 != -345763903) {
            method1872(49, -13, 62, 54, -124, 76, 27);
        }
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V", line = 102)
    public final void method24(int arg0) {
        if (!this.field4473) {
            super.field5646.method1556(770, 5890, 0, 34184);
        } else {
            this.field4469.method2035(-105, '\u0001');
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, (class271) null);
            super.field5646.method1553(0, -8156);
        }
        ++field4470;
        super.field5646.method1576(8448, 8448, (byte) -113);
        if (arg0 < 74) {
            field4483 = 68;
        }
        this.field4473 = false;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Z", line = 128)
    public final boolean method21(byte arg0) {
        if (arg0 < 85) {
            return true;
        } else {
            ++field4480;
            return true;
        }
    }

    @OriginalMember(owner = "client!dm", name = "b", descriptor = "(B)V", line = 149)
    public static void method1873(byte arg0) {
        field4484 = null;
        if (arg0 != -122) {
            method1872(-24, -101, -110, -96, -125, -67, -25);
        }
        field4481 = null;
    }

    @OriginalMember(owner = "client!dm", name = "a", descriptor = "(ZZ)V", line = 160)
    public final void method25(boolean arg0, boolean arg1) {
        if (!arg1) {
            field4475 = 22;
        }
        ++field4476;
        class487 var3 = super.field5646.method1589((byte) -83);
        if (this.field4469 != null && var3 != null && arg0) {
            this.field4469.method2035(42, '\u0000');
            super.field5646.method1553(1, -8156);
            super.field5646.method1546(-2, var3);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadMatrixf(super.field5646.field3816.method2615(31685), 0);
            OpenGL.glRotatef(-180.0F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            super.field5646.method1553(0, -8156);
            this.field4473 = true;
        } else {
            super.field5646.method1556(770, 34168, 0, 34184);
        }
    }
}
