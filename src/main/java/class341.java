import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class341 extends class293 {

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Ldia;")
    private class246 field4921;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lefa;")
    private class196 field4922;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field4924 = null;

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "Z")
    public static boolean field4919 = false;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "F")
    public static float field4925 = 0.25F;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "[Leu;")
    public static class508[] field4928;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IBI[Lor;IZ)V")
    public static final void method2160(int arg0, byte arg1, int arg2, class668[] arg3, int arg4, boolean arg5) {
        if (arg1 != -118) {
            method2163(-87);
        }
        field4923++;
        for (int var6 = 0; var6 < arg3.length; var6++) {
            class668 var7 = arg3[var6];
            if (var7 != null && var7.field9336 == arg0) {
                class121.method996(var7, (byte) -118, arg5, arg4, arg2);
                class251.method1682(var7, arg4, arg2, 2);
                if ((var7.field9237 - var7.field9282) < var7.field9374) {
                    var7.field9374 = var7.field9237 - var7.field9282;
                }
                if (var7.field9247 > (var7.field9296 - var7.field9297)) {
                    var7.field9247 = var7.field9296 - var7.field9297;
                }
                if (var7.field9374 < 0) {
                    var7.field9374 = 0;
                }
                if (var7.field9247 < 0) {
                    var7.field9247 = 0;
                }
                if (var7.field9353 == 0) {
                    class446.method2678(125, arg5, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)I")
    public final int method2161(int arg0) {
        field4920++;
        if (arg0 != 65534) {
            method2160(-48, (byte) -17, -8, null, 124, true);
        }
        return this.field4922.field2623;
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Ldia;I)V")
    public class341(class246 arg0, int arg1) {
        this.field4921 = arg0;
        this.field4922 = new class196(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILefa;Lefa;F)Z")
    public final boolean method2162(int arg0, class196 arg1, class196 arg2, float arg3) {
        field4926++;
        boolean var5 = true;
        class682 var6 = this.field4921.field3627;
        this.field4921.method494(class41.field644);
        this.field4921.method543();
        this.field4921.method1629((byte) -34);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        if (arg0 != -65534) {
            return true;
        }
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4922.field2623, this.field4922.field2623);
        this.field4921.method1642(3723, false);
        this.field4921.method1617(false, (byte) -110);
        this.field4921.method1587(false, false);
        this.field4921.method1583((byte) -68, false);
        this.field4921.method1640(-2, 73);
        this.field4921.method1637(33984, 1);
        this.field4921.method1612(0.0F, 0.0F, arg3, 114, 0.0F);
        this.field4921.method1622(34165, 34165, (byte) 124);
        this.field4921.method1653((byte) 124, arg1);
        this.field4921.method1637(33984, 0);
        this.field4921.method1589(arg0 + 65530, 1);
        this.field4921.method1653((byte) 123, arg2);
        this.field4921.method1638((byte) -105, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3790(this.field4922, 0, 23590, var8);
            var6.method3795(115, 0);
            if (!var6.method3787((byte) 11)) {
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
        var6.method3792(0, arg0 + 54930);
        this.field4921.method1621(var6, false);
        this.field4921.method1637(33984, 1);
        this.field4921.method1653((byte) 83, null);
        this.field4921.method1622(8448, 8448, (byte) 124);
        this.field4921.method1637(arg0 + 99518, 0);
        this.field4921.method1653((byte) 97, null);
        OpenGL.glPopAttrib();
        this.field4921.method456(class41.field644[0], class41.field644[1], class41.field644[2], class41.field644[3]);
        if (var5 && !this.field4921.field3674) {
            this.field4922.method55((byte) 46);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
    public static void method2163(int arg0) {
        field4924 = null;
        if (arg0 >= -51) {
            field4928 = null;
        }
        field4928 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Lefa;")
    public final class196 method1852(int arg0) {
        field4927++;
        if (arg0 != 16824) {
            this.method1852(-25);
        }
        return this.field4922;
    }
}
