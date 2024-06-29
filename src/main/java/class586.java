import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class586 extends class168 {

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "Lqfa;")
    private class106 field8278;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "Lqba;")
    private class425 field8274;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field8275;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "I")
    public static int field8277;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field8279;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field8281;

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "[Lje;")
    public static class421[] field8280;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)Lqba;", line = 5)
    public final class425 method691(int arg0) {
        if (arg0 != 10002) {
            this.method691(-101);
        }
        field8277++;
        return this.field8274;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)I", line = 16)
    public final int method3419(byte arg0) {
        if (arg0 < 46) {
            this.field8274 = null;
        }
        field8281++;
        return this.field8274.field5802;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lqfa;I)V", line = 33)
    public class586(class106 arg0, int arg1) {
        this.field8278 = arg0;
        this.field8274 = new class425(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqba;Lqba;FI)Z", line = 42)
    public final boolean method3420(class425 arg0, class425 arg1, float arg2, int arg3) {
        field8275++;
        boolean var5 = true;
        class54 var6 = this.field8278.field1501;
        this.field8278.method449(class407.field5551);
        if (arg3 != 10835) {
            method3421((byte) 90);
        }
        this.field8278.method511();
        this.field8278.method805(arg3 - 10957);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field8274.field5802, this.field8274.field5802);
        this.field8278.method797((byte) 51, false);
        this.field8278.method756(false, 85);
        this.field8278.method785(false, (byte) 123);
        this.field8278.method791(false, true);
        this.field8278.method747(-2, -2142656808);
        this.field8278.method813((byte) 103, 1);
        this.field8278.method769(arg2, 0.0F, 0.0F, false, 0.0F);
        this.field8278.method802(34165, 11762, 34165);
        this.field8278.method808((byte) 34, arg1);
        this.field8278.method813((byte) 103, 0);
        this.field8278.method795(1, arg3 ^ 0xAEB4);
        this.field8278.method808((byte) 34, arg0);
        this.field8278.method776(var6, arg3 ^ 0x2BC8);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method374(this.field8274, 0, 120, var8);
            var6.method376(-1, 0);
            if (!var6.method375((byte) -100)) {
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
        var6.method372(0, -38);
        this.field8278.method755(var6, 0);
        this.field8278.method813((byte) 103, 1);
        this.field8278.method808((byte) 34, null);
        this.field8278.method802(8448, arg3 + 927, 8448);
        this.field8278.method813((byte) 103, 0);
        this.field8278.method808((byte) 34, null);
        OpenGL.glPopAttrib();
        this.field8278.method434(class407.field5551[0], class407.field5551[1], class407.field5551[2], class407.field5551[3]);
        if (var5 && !this.field8278.field1525) {
            this.field8274.method1318(43);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)Z", line = 242)
    public static final boolean method3421(byte arg0) {
        if (arg0 <= 122) {
            method3421((byte) -33);
        }
        field8276++;
        return class266.field3873 >= 1;
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)V", line = 257)
    public static void method3422(int arg0) {
        field8280 = null;
        if (arg0 >= -110) {
            field8280 = null;
        }
    }
}
