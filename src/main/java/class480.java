import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class480 extends class608 {

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "Lnv;")
    private class417 field6869;

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "Ltc;")
    private class351 field6872;

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "S")
    public static short field6868 = 256;

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "[B")
    public static byte[] field6871 = new byte[2048];

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "D")
    public static double field6865;

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "I")
    public static int field6870;

    @OriginalMember(owner = "client!cga", name = "w", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "(I)I")
    public final int method2886(int arg0) {
        if (arg0 != 2048) {
            field6868 = -16;
        }
        field6867++;
        return this.field6872.field4518;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILtc;FLtc;)Z")
    public final boolean method2887(int arg0, class351 arg1, float arg2, class351 arg3) {
        field6870++;
        boolean var5 = true;
        class106 var6 = this.field6869.field6054;
        this.field6869.method354(class634.field9127);
        this.field6869.method393();
        this.field6869.method2611(30814);
        if (arg0 != -30757) {
            field6868 = 90;
        }
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6872.field4518, this.field6872.field4518);
        this.field6869.method2597((byte) 56, false);
        this.field6869.method2625((byte) 112, false);
        this.field6869.method2551((byte) -60, false);
        this.field6869.method2556(false, -71);
        this.field6869.method2624(-2, 2);
        this.field6869.method2545(arg0 ^ 0xFFFF07AD, 1);
        this.field6869.method2575(0.0F, 6294, 0.0F, 0.0F, arg2);
        this.field6869.method2558(34165, 0, 34165);
        this.field6869.method2621(-2, arg1);
        this.field6869.method2545(32886, 0);
        this.field6869.method2573(1, false);
        this.field6869.method2621(arg0 ^ 0x7825, arg3);
        this.field6869.method2615(var6, true);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method732(this.field6872, -54, 0, var8);
            var6.method728((byte) 7, 0);
            if (!var6.method727(36053)) {
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
        var6.method737(0, (byte) -118);
        this.field6869.method2617((byte) -61, var6);
        this.field6869.method2545(32886, 1);
        this.field6869.method2621(arg0 ^ 0x7825, null);
        this.field6869.method2558(8448, 0, 8448);
        this.field6869.method2545(arg0 + 63643, 0);
        this.field6869.method2621(-2, null);
        OpenGL.glPopAttrib();
        this.field6869.method432(class634.field9127[0], class634.field9127[1], class634.field9127[2], class634.field9127[3]);
        if (var5 && !this.field6869.field5983) {
            this.field6872.method1741((byte) 123);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "()V")
    public static final void method2888() {
        class655.method3721(1, class723.field10134);
    }

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "(I)Ltc;")
    public final class351 method2889(int arg0) {
        if (arg0 >= -38) {
            return null;
        } else {
            field6866++;
            return this.field6872;
        }
    }

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "(I)V")
    public static void method2890(int arg0) {
        field6871 = null;
        if (arg0 != -65534) {
            field6868 = -79;
        }
    }

    @OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lnv;I)V")
    public class480(class417 arg0, int arg1) {
        this.field6869 = arg0;
        this.field6872 = new class351(arg0, 6408, arg1);
    }
}
