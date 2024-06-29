import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class278 extends class159 {

    @OriginalMember(owner = "client!le", name = "p", descriptor = "Len;")
    private class289 field3892;

    @OriginalMember(owner = "client!le", name = "q", descriptor = "Lwg;")
    private class389 field3893;

    @OriginalMember(owner = "client!le", name = "u", descriptor = "Loj;")
    public static class346 field3897 = new class346(8);

    @OriginalMember(owner = "client!le", name = "w", descriptor = "I")
    public static int field3899 = 0;

    @OriginalMember(owner = "client!le", name = "r", descriptor = "F")
    public static float field3894;

    @OriginalMember(owner = "client!le", name = "o", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!le", name = "s", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!le", name = "t", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!le", name = "v", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Lwg;")
    public final class389 method1099(byte arg0) {
        if (arg0 < 60) {
            method1685(false);
        }
        field3896++;
        return this.field3893;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Len;I)V")
    public class278(class289 arg0, int arg1) {
        this.field3892 = arg0;
        this.field3893 = new class389(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!le", name = "e", descriptor = "(B)I")
    public final int method1684(byte arg0) {
        if (arg0 == 49) {
            field3898++;
            return this.field3893.field5456;
        } else {
            return 83;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
    public static void method1685(boolean arg0) {
        if (!arg0) {
            field3894 = 0.8438697F;
        }
        field3897 = null;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Lwg;Lwg;IF)Z")
    public final boolean method1686(class389 arg0, class389 arg1, int arg2, float arg3) {
        field3895++;
        boolean var5 = true;
        class625 var6 = this.field3892.field4313;
        this.field3892.method416(class34.field404);
        this.field3892.method449();
        this.field3892.method1749(-1);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3893.field5456, this.field3893.field5456);
        this.field3892.method1778(false, (byte) 28);
        this.field3892.method1777(false, arg2 ^ 0x42);
        this.field3892.method1779(true, false);
        this.field3892.method1805(false, (byte) 58);
        this.field3892.method1789((byte) -51, -2);
        this.field3892.method1747(1, (byte) 108);
        this.field3892.method1812(0.0F, 0.0F, 0.0F, (byte) -48, arg3);
        this.field3892.method1798(false, 34165, 34165);
        this.field3892.method1804(false, arg1);
        this.field3892.method1747(0, (byte) 108);
        this.field3892.method1801(1, 34166);
        this.field3892.method1804(false, arg0);
        this.field3892.method1817(var6, false);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3470(this.field3893, var8, 0, (byte) -99);
            var6.method3480((byte) -126, 0);
            if (!var6.method3475(28296)) {
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
        var6.method3469((byte) 81, 0);
        this.field3892.method1785(var6, (byte) -1);
        this.field3892.method1747(1, (byte) 108);
        this.field3892.method1804(false, null);
        this.field3892.method1798(false, 8448, 8448);
        this.field3892.method1747(0, (byte) 108);
        this.field3892.method1804(false, null);
        OpenGL.glPopAttrib();
        this.field3892.method442(class34.field404[0], class34.field404[arg2], class34.field404[2], class34.field404[3]);
        if (var5 && !this.field3892.field4347) {
            this.field3893.method3287(-10286);
        }
        return var5;
    }
}
