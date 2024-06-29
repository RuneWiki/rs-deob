import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class569 extends class130 {

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "Lte;")
    private class527 field8389;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "Lci;")
    private class384 field8391;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "Lvp;")
    public static class162 field8395 = null;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "Lada;")
    public static class144 field8392 = new class144(51, 2);

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "Lgf;")
    public static class232 field8396 = new class232();

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "[B")
    public static byte[] field8399 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "Ljava/lang/String;")
    public static String field8400 = "";

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    public static int field8388;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "Ln;")
    public static class17 field8397;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field8398;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZLci;Lci;F)Z")
    public final boolean method3394(boolean arg0, class384 arg1, class384 arg2, float arg3) {
        field8388++;
        boolean var5 = true;
        class266 var6 = this.field8389.field7817;
        this.field8389.method431(class201.field2973);
        this.field8389.method479();
        this.field8389.method3141(arg0);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field8391.field5280, this.field8391.field5280);
        this.field8389.method3106(false, -113);
        this.field8389.method3184(true, false);
        this.field8389.method3156(false, true);
        this.field8389.method3142(false, (byte) 122);
        this.field8389.method3123(-2, false);
        this.field8389.method3111(33984, 1);
        this.field8389.method3160(0.0F, 0.0F, arg3, 0.0F, (byte) 26);
        this.field8389.method3183(34165, -125, 34165);
        this.field8389.method3152(-2, arg1);
        this.field8389.method3111(33984, 0);
        this.field8389.method3121(-27745, 1);
        this.field8389.method3152(-2, arg2);
        this.field8389.method3149(1, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1670(this.field8391, 0, var8, (byte) -115);
            var6.method1671(-1, 0);
            if (!var6.method1677((byte) 81)) {
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
        var6.method1678(0, true);
        this.field8389.method3158(255, var6);
        this.field8389.method3111(33984, 1);
        this.field8389.method3152(-2, null);
        this.field8389.method3183(8448, -127, 8448);
        this.field8389.method3111(33984, 0);
        this.field8389.method3152(-2, null);
        OpenGL.glPopAttrib();
        this.field8389.method510(class201.field2973[0], class201.field2973[1], class201.field2973[2], class201.field2973[3]);
        if (var5 && !this.field8389.field7877) {
            this.field8391.method1461(0);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Lci;")
    public final class384 method909(int arg0) {
        if (arg0 != 18511) {
            method3397(-123, -30, -91, 102, 20, 88, null, 77, 29, false, -6, null, -76);
        }
        field8390++;
        return this.field8391;
    }

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "(B)V")
    public static void method3395(byte arg0) {
        field8396 = null;
        field8397 = null;
        field8398 = null;
        field8400 = null;
        field8392 = null;
        field8399 = null;
        field8395 = null;
        if (arg0 > -58) {
            method3397(119, 39, 120, 104, 94, 11, null, 36, 35, false, -127, null, -127);
        }
    }

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "(B)I")
    public final int method3396(byte arg0) {
        if (arg0 != 18) {
            this.field8391 = null;
        }
        field8394++;
        return this.field8391.field5280;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IIIIIILqa;IIZI[[[BI)V")
    public static final void method3397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class208 arg6, int arg7, int arg8, boolean arg9, int arg10, byte[][][] arg11, int arg12) {
        field8393++;
        if (arg4 == 0 || arg1 == 0) {
            return;
        }
        if (arg4 == 9) {
            arg4 = 1;
            arg10 = arg10 + 1 & 0x3;
        }
        if (arg4 == 10) {
            arg4 = 1;
            arg10 = arg10 + 3 & 0x3;
        }
        if (arg4 == 11) {
            arg4 = 8;
            arg10 = arg10 + 3 & 0x3;
        }
        arg6.method517(arg2, arg12, arg5, arg0, arg8, arg3, arg11[arg4 - 1][arg10], arg1, arg7);
        if (!arg9) {
            method3395((byte) -8);
        }
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lte;I)V")
    public class569(class527 arg0, int arg1) {
        this.field8389 = arg0;
        this.field8391 = new class384(arg0, 6408, arg1);
    }
}
