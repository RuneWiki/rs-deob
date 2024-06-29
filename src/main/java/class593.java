import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class593 extends class250 {

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "Luq;")
    private class313 field8569;

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Lsk;")
    private class415 field8566;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "I")
    public static int field8564;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field8565;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(I)I")
    public final int method3423(int arg0) {
        field8567++;
        return arg0 == -14418 ? this.field8566.field5706 : 126;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(FBLsk;Lsk;)Z")
    public final boolean method3424(float arg0, byte arg1, class415 arg2, class415 arg3) {
        field8565++;
        boolean var5 = true;
        class327 var6 = this.field8569.field4314;
        this.field8569.method980(class637.field9252);
        this.field8569.method962();
        this.field8569.method1915(-12648);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field8566.field5706, this.field8566.field5706);
        this.field8569.method1962(-32, false);
        this.field8569.method1930((byte) -86, false);
        this.field8569.method1950(false, -113);
        this.field8569.method1949(false, (byte) 120);
        this.field8569.method1960(-2, 2);
        this.field8569.method1966(3000, 1);
        this.field8569.method1921(0.0F, 0.0F, arg0, 0.0F, 61);
        this.field8569.method1887(-73, 34165, 34165);
        this.field8569.method1884(arg3, -2);
        this.field8569.method1966(3000, 0);
        this.field8569.method1909(-64, 1);
        this.field8569.method1884(arg2, -2);
        this.field8569.method1918(var6, 123);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2014(0, var8, (byte) 68, this.field8566);
            var6.method2016(true, 0);
            if (!var6.method2020(-68)) {
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
        var6.method2022(false, 0);
        this.field8569.method1917((byte) -109, var6);
        this.field8569.method1966(3000, 1);
        int var9 = 23 % ((arg1 - 70) / 32);
        this.field8569.method1884(null, -2);
        this.field8569.method1887(-64, 8448, 8448);
        this.field8569.method1966(3000, 0);
        this.field8569.method1884(null, -2);
        OpenGL.glPopAttrib();
        this.field8569.method977(class637.field9252[0], class637.field9252[1], class637.field9252[2], class637.field9252[3]);
        if (var5 && !this.field8569.field4253) {
            this.field8566.method810(true);
        }
        return var5;
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Luq;I)V")
    public class593(class313 arg0, int arg1) {
        this.field8569 = arg0;
        this.field8566 = new class415(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)Lsk;")
    public final class415 method1414(int arg0) {
        if (arg0 != 1) {
            this.method3424(-0.4311597F, (byte) -112, null, null);
        }
        field8568++;
        return this.field8566;
    }
}
