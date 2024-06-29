import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class207 extends class202 {

    @OriginalMember(owner = "client!em", name = "q", descriptor = "Ler;")
    private class92 field3460;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "Lqn;")
    private class58 field3454;

    @OriginalMember(owner = "client!em", name = "m", descriptor = "I")
    public static int field3456 = -1;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "Lrl;")
    public static class672 field3457 = new class672(10, 2);

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!em", name = "p", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!em", name = "s", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!em", name = "r", descriptor = "Lf;")
    public static class702 field3461;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "(I)Lqn;", line = 7)
    public final class58 method196(int arg0) {
        if (arg0 != 25270) {
            field3456 = -71;
        }
        field3458++;
        return this.field3454;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(B)I", line = 18)
    public final int method1586(byte arg0) {
        int var2 = -83 % ((arg0 - 43) / 44);
        field3459++;
        return this.field3454.field758;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILqn;Lqn;F)Z", line = 32)
    public final boolean method1587(int arg0, class58 arg1, class58 arg2, float arg3) {
        field3455++;
        boolean var5 = true;
        class276 var6 = this.field3460.field1387;
        this.field3460.method343(class268.field4365);
        this.field3460.method281();
        this.field3460.method868((byte) -124);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3454.field758, this.field3454.field758);
        this.field3460.method882((byte) -92, false);
        this.field3460.method866(false, arg0 ^ 0x270F);
        this.field3460.method869(false, arg0 + 12922);
        this.field3460.method877(false, -32);
        this.field3460.method887(2, -2);
        this.field3460.method834(true, 1);
        this.field3460.method845(0.0F, arg3, 0.0F, 34161, 0.0F);
        this.field3460.method857(8960, 34165, 34165);
        if (arg0 != -9993) {
            this.field3460 = null;
        }
        this.field3460.method856(false, arg1);
        this.field3460.method834(true, 0);
        this.field3460.method816(1, arg0 + 9877);
        this.field3460.method856(false, arg2);
        this.field3460.method881(false, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1978(this.field3454, 0, var8, (byte) 86);
            var6.method1967(0, arg0 ^ 0x270C);
            if (!var6.method1970((byte) -102)) {
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
        var6.method1965(79, 0);
        this.field3460.method828(var6, 0);
        this.field3460.method834(true, 1);
        this.field3460.method856(false, null);
        this.field3460.method857(8960, 8448, 8448);
        this.field3460.method834(true, 0);
        this.field3460.method856(false, null);
        OpenGL.glPopAttrib();
        this.field3460.method352(class268.field4365[0], class268.field4365[1], class268.field4365[2], class268.field4365[3]);
        if (var5 && !this.field3460.field1394) {
            this.field3454.method2508((byte) -10);
        }
        return var5;
    }

    @OriginalMember(owner = "client!em", name = "f", descriptor = "(I)V", line = 239)
    public static void method1588(int arg0) {
        field3461 = null;
        field3457 = null;
        if (arg0 != 31562) {
            method1588(16);
        }
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Ler;I)V", line = 249)
    public class207(class92 arg0, int arg1) {
        this.field3460 = arg0;
        this.field3454 = new class58(arg0, 6408, arg1);
    }
}
