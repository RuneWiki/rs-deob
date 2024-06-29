import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class485 extends class708 {

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lkw;")
    private class346 field6987;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "Ldm;")
    private class96 field6989;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field6988;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public static int field6990;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "I")
    public static int field6991;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field6992;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field6993;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Ldm;", line = 3)
    public final class96 method469(byte arg0) {
        field6986++;
        int var2 = -53 % ((83 - arg0) / 33);
        return this.field6989;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)Z", line = 14)
    public static final boolean method2960(int arg0, int arg1, int arg2) {
        field6991++;
        if (arg2 == 1) {
            boolean var3 = (arg0 & 0x37) == 0 ? class26.method116(30, arg1, arg0) : class258.method1716(arg0, arg1, -17051);
            return class275.method1780(arg0, arg1, 83) | (arg1 & 0x10000) != 0 | var3;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lkw;I)V", line = 34)
    public class485(class346 arg0, int arg1) {
        this.field6987 = arg0;
        this.field6989 = new class96(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I", line = 43)
    public final int method2961(int arg0) {
        if (arg0 <= 125) {
            return -19;
        } else {
            field6988++;
            return this.field6989.field1391;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Ldm;Ldm;FB)Z", line = 55)
    public final boolean method2962(class96 arg0, class96 arg1, float arg2, byte arg3) {
        field6990++;
        boolean var5 = true;
        class604 var6 = this.field6987.field5061;
        this.field6987.method358(class593.field8432);
        this.field6987.method328();
        this.field6987.method2137(-71);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6989.field1391, this.field6989.field1391);
        this.field6987.method2190(true, false);
        this.field6987.method2142(false, (byte) -111);
        this.field6987.method2180((byte) -86, false);
        this.field6987.method2160(false, 30);
        this.field6987.method2176(-2, -99);
        this.field6987.method2171(123, 1);
        this.field6987.method2140(-1, 0.0F, 0.0F, 0.0F, arg2);
        this.field6987.method2149(-11771, 34165, 34165);
        this.field6987.method2164(6, arg1);
        this.field6987.method2171(111, 0);
        this.field6987.method2120(1, 74);
        this.field6987.method2164(6, arg0);
        this.field6987.method2195(var6, 42);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3523(this.field6989, 0, var8, 0);
            var6.method3521(0, -23712);
            if (!var6.method3522((byte) -80)) {
                var5 = false;
                break;
            }
            OpenGL.glBegin(7);
            if (var8 == 34069) {
                OpenGL.glTexCoord3i(65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34070) {
                OpenGL.glTexCoord3i(-65535, 65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, 65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65535, -65534, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65535, -65534, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34071) {
                OpenGL.glTexCoord3i(-65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, 65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34072) {
                OpenGL.glTexCoord3i(-65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, 65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65535, -65534);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34073) {
                OpenGL.glTexCoord3i(-65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, 65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(-65534, -65534, 65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            } else if (var8 == 34074) {
                OpenGL.glTexCoord3i(65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
                OpenGL.glVertex2f(0.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, 65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
                OpenGL.glVertex2f(1.0F, 0.0F);
                OpenGL.glTexCoord3i(-65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
                OpenGL.glVertex2f(1.0F, 1.0F);
                OpenGL.glTexCoord3i(65534, -65534, -65535);
                OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
                OpenGL.glVertex2f(0.0F, 1.0F);
            }
            OpenGL.glEnd();
        }
        var6.method3519(0, 112);
        this.field6987.method2193(29, var6);
        int var9 = -106 % ((85 - arg3) / 34);
        this.field6987.method2171(126, 1);
        this.field6987.method2164(6, null);
        this.field6987.method2149(-11771, 8448, 8448);
        this.field6987.method2171(110, 0);
        this.field6987.method2164(6, null);
        OpenGL.glPopAttrib();
        this.field6987.method297(class593.field8432[0], class593.field8432[1], class593.field8432[2], class593.field8432[3]);
        if (var5 && !this.field6987.field5026) {
            this.field6989.method1126((byte) -61);
        }
        return var5;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZZILg;BLg;I)I", line = 253)
    public static final int method2963(boolean arg0, boolean arg1, int arg2, class592 arg3, byte arg4, class592 arg5, int arg6) {
        field6993++;
        int var7 = -111 % ((arg4 + 18) / 52);
        int var8 = class59.method553(arg2, arg5, 80, arg0, arg3);
        if (var8 != 0) {
            return arg0 ? -var8 : var8;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var9 = class59.method553(arg6, arg5, 103, arg1, arg3);
            return arg1 ? -var9 : var9;
        }
    }
}
