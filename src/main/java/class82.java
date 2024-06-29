import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class82 extends class297 {

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "Lqj;")
    private class548 field1092;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "Lwaa;")
    private class33 field1095;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "F")
    public static float field1099;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Ljda;")
    public static class300 field1091;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "Lcp;")
    public static class684 field1096;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)I")
    public final int method472(int arg0) {
        if (arg0 != 30576) {
            field1097 = -93;
        }
        field1098++;
        return this.field1095.field463;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLwaa;Lwaa;F)Z")
    public final boolean method473(boolean arg0, class33 arg1, class33 arg2, float arg3) {
        if (!arg0) {
            return false;
        }
        field1094++;
        boolean var5 = true;
        class12 var6 = this.field1092.field7538;
        this.field1092.method1060(class474.field6018);
        this.field1092.method1017();
        this.field1092.method3016(-13);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field1095.field463, this.field1095.field463);
        this.field1092.method2971(false, (byte) -114);
        this.field1092.method3010((byte) 103, false);
        this.field1092.method3007(122, false);
        this.field1092.method2953(false, 127);
        this.field1092.method2961(-2, (byte) -58);
        this.field1092.method3027(1, true);
        this.field1092.method2982(0.0F, 0.0F, arg3, -23119, 0.0F);
        this.field1092.method2983(34165, -465309136, 34165);
        this.field1092.method2960(arg1, -2);
        this.field1092.method3027(0, true);
        this.field1092.method3005(false, 1);
        this.field1092.method2960(arg2, -2);
        this.field1092.method3026(255, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method102(0, (byte) -64, this.field1095, var8);
            var6.method95(0, true);
            if (!var6.method96(false)) {
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
        var6.method89(0, 1);
        this.field1092.method2981(-109, var6);
        this.field1092.method3027(1, true);
        this.field1092.method2960(null, -2);
        this.field1092.method2983(8448, -465309136, 8448);
        this.field1092.method3027(0, arg0);
        this.field1092.method2960(null, -2);
        OpenGL.glPopAttrib();
        this.field1092.method1083(class474.field6018[0], class474.field6018[1], class474.field6018[2], class474.field6018[3]);
        if (var5 && !this.field1092.field7527) {
            this.field1095.method3394(9566);
        }
        return var5;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    public static void method474(int arg0) {
        if (arg0 == 0) {
            field1091 = null;
            field1096 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)Lwaa;")
    public final class33 method266(byte arg0) {
        field1093++;
        if (arg0 != 37) {
            field1099 = -0.4473071F;
        }
        return this.field1095;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lqj;I)V")
    public class82(class548 arg0, int arg1) {
        this.field1092 = arg0;
        this.field1095 = new class33(arg0, 6408, arg1);
    }
}
