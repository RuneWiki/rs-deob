import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wea")
public class class141 extends class328 {

    @OriginalMember(owner = "client!wea", name = "p", descriptor = "Llj;")
    private class565 field2004;

    @OriginalMember(owner = "client!wea", name = "s", descriptor = "Lhda;")
    private class696 field2007;

    @OriginalMember(owner = "client!wea", name = "n", descriptor = "[F")
    public static float[] field2002 = new float[16384];

    @OriginalMember(owner = "client!wea", name = "o", descriptor = "[F")
    public static float[] field2003 = new float[16384];

    @OriginalMember(owner = "client!wea", name = "t", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!wea", name = "l", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!wea", name = "m", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!wea", name = "q", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!wea", name = "r", descriptor = "I")
    public static int field2006;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field2002[var2] = (float) Math.sin((double) var2 * var0);
            field2003[var2] = (float) Math.cos((double) var2 * var0);
        }
        field2008 = 0;
    }

    @OriginalMember(owner = "client!wea", name = "f", descriptor = "(I)I", line = 4)
    public final int method986(int arg0) {
        if (arg0 != 7203) {
            field2002 = null;
        }
        field2006++;
        return this.field2007.field9889;
    }

    @OriginalMember(owner = "client!wea", name = "g", descriptor = "(I)V", line = 21)
    public static void method987(int arg0) {
        if (arg0 != 5888) {
            field2002 = null;
        }
        field2002 = null;
        field2003 = null;
    }

    @OriginalMember(owner = "client!wea", name = "c", descriptor = "(I)Lhda;", line = 33)
    public final class696 method988(int arg0) {
        field2001++;
        if (arg0 != 11) {
            this.method989(null, 0.87845004F, -103, null);
        }
        return this.field2007;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(Lhda;FILhda;)Z", line = 44)
    public final boolean method989(class696 arg0, float arg1, int arg2, class696 arg3) {
        field2005++;
        boolean var5 = true;
        class254 var6 = this.field2004.field7889;
        this.field2004.method174(class208.field2927);
        this.field2004.method193();
        this.field2004.method3224(1);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field2007.field9889, this.field2007.field9889);
        this.field2004.method3177(false, 54);
        this.field2004.method3195((byte) 42, false);
        this.field2004.method3218(false, (byte) -116);
        this.field2004.method3213(false, -95);
        this.field2004.method3238(-7056, -2);
        this.field2004.method3220(0, 1);
        this.field2004.method3171(0.0F, (byte) 89, arg1, 0.0F, 0.0F);
        this.field2004.method3210(34165, 21, 34165);
        this.field2004.method3206(arg0, (byte) 26);
        this.field2004.method3220(0, 0);
        this.field2004.method3205(arg2 ^ 0xFFFF1401, 1);
        this.field2004.method3206(arg3, (byte) 26);
        this.field2004.method3200((byte) -47, var6);
        if (arg2 != -65534) {
            return false;
        }
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1561(var8, 6682, this.field2007, 0);
            var6.method1557(false, 0);
            if (!var6.method1563(-6236)) {
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
        var6.method1565(125, 0);
        this.field2004.method3166(var6, (byte) -126);
        this.field2004.method3220(0, 1);
        this.field2004.method3206(null, (byte) 26);
        this.field2004.method3210(8448, -83, 8448);
        this.field2004.method3220(0, 0);
        this.field2004.method3206(null, (byte) 26);
        OpenGL.glPopAttrib();
        this.field2004.method200(class208.field2927[0], class208.field2927[1], class208.field2927[2], class208.field2927[3]);
        if (var5 && !this.field2004.field7974) {
            this.field2007.method948((byte) 112);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wea", name = "a", descriptor = "(III)Z", line = 244)
    public static final boolean method990(int arg0, int arg1, int arg2) {
        if (arg2 != -27160) {
            method987(-122);
        }
        field2000++;
        return (arg1 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!wea", name = "<init>", descriptor = "(Llj;I)V", line = 255)
    public class141(class565 arg0, int arg1) {
        this.field2004 = arg0;
        this.field2007 = new class696(arg0, 6408, arg1);
    }
}
