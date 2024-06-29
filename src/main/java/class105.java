import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qda")
public class class105 extends class3 {

    @OriginalMember(owner = "client!qda", name = "q", descriptor = "Lqo;")
    private class22 field1857;

    @OriginalMember(owner = "client!qda", name = "k", descriptor = "Lq;")
    private class429 field1851;

    @OriginalMember(owner = "client!qda", name = "p", descriptor = "Lej;")
    public static class124 field1856 = new class124(79, 3);

    @OriginalMember(owner = "client!qda", name = "i", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!qda", name = "j", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!qda", name = "m", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!qda", name = "o", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!qda", name = "h", descriptor = "Lcea;")
    public static class215 field1848;

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lq;FILq;)Z")
    public final boolean method954(class429 arg0, float arg1, int arg2, class429 arg3) {
        field1853++;
        boolean var5 = true;
        class643 var6 = this.field1857.field600;
        this.field1857.method206(class667.field9107);
        this.field1857.method305();
        this.field1857.method224(-32);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1851.field6155, this.field1851.field6155);
        this.field1857.method357(false, arg2 - 65532);
        this.field1857.method173(false, arg2 - 65411);
        this.field1857.method215(114, false);
        this.field1857.method205(arg2 - 65534, false);
        this.field1857.method229(-2, -91);
        this.field1857.method190(-15039, 1);
        this.field1857.method209(arg1, 0.0F, 0.0F, (byte) 110, 0.0F);
        this.field1857.method175(34165, (byte) -115, 34165);
        this.field1857.method256((byte) -95, arg3);
        this.field1857.method190(-15039, 0);
        this.field1857.method237(0, 1);
        this.field1857.method256((byte) -90, arg0);
        this.field1857.method264(arg2 ^ 0xFFFF0001, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3644(0, arg2 - 65591, var8, this.field1851);
            var6.method3649(0, (byte) 3);
            if (!var6.method3653(-116)) {
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
        var6.method3646(2983, 0);
        this.field1857.method255(-422613672, var6);
        this.field1857.method190(arg2 - 80573, 1);
        if (arg2 != 65534) {
            return true;
        }
        this.field1857.method256((byte) -95, null);
        this.field1857.method175(8448, (byte) 121, 8448);
        this.field1857.method190(-15039, 0);
        this.field1857.method256((byte) -88, null);
        OpenGL.glPopAttrib();
        this.field1857.method303(class667.field9107[0], class667.field9107[1], class667.field9107[2], class667.field9107[3]);
        if (var5 && !this.field1857.field669) {
            this.field1851.method449(69);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)Lq;")
    public final class429 method9(byte arg0) {
        field1850++;
        return arg0 == -121 ? this.field1851 : null;
    }

    @OriginalMember(owner = "client!qda", name = "b", descriptor = "(I)I")
    public final int method955(int arg0) {
        if (arg0 != 65534) {
            this.field1857 = null;
        }
        field1849++;
        return this.field1851.field6155;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lha;II)Lmi;")
    public static final class496 method956(class59 arg0, int arg1, int arg2) {
        field1855++;
        class7 var3 = (class7) class581.field7954.method1465((long) arg2, -6008);
        if (var3 != null) {
            class72 var4 = var3.field47.method1900(false);
            var3.field51 = true;
            if (var4 != null) {
                return var4.method688(arg0, 0);
            }
        }
        if (arg1 != 0) {
            field1856 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!qda", name = "a", descriptor = "(Z)V")
    public static final void method957(boolean arg0) {
        if (arg0) {
            field1848 = null;
        }
        field1854++;
        class594 var1 = class692.method3869(0, (byte) 105, 15);
        var1.method3383(-16058);
    }

    @OriginalMember(owner = "client!qda", name = "c", descriptor = "(I)V")
    public static void method958(int arg0) {
        field1848 = null;
        if (arg0 != -10794) {
            field1856 = null;
        }
        field1856 = null;
    }

    @OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lqo;I)V")
    public class105(class22 arg0, int arg1) {
        this.field1857 = arg0;
        this.field1851 = new class429(arg0, 6408, arg1);
    }
}
