import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class271 extends class10 {

    @OriginalMember(owner = "client!br", name = "n", descriptor = "Lda;")
    private class44 field4107;

    @OriginalMember(owner = "client!br", name = "x", descriptor = "Ldl;")
    private class46 field4117;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Ls;")
    public static class186 field4106 = new class186(90, -2);

    @OriginalMember(owner = "client!br", name = "s", descriptor = "Ls;")
    public static class186 field4112 = new class186(64, 10);

    @OriginalMember(owner = "client!br", name = "w", descriptor = "I")
    public static int field4116 = -1;

    @OriginalMember(owner = "client!br", name = "t", descriptor = "Lje;")
    public static class278 field4113 = new class278(10, 2, 2, 0);

    @OriginalMember(owner = "client!br", name = "v", descriptor = "F")
    public static float field4115;

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!br", name = "o", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!br", name = "p", descriptor = "I")
    public static int field4109;

    @OriginalMember(owner = "client!br", name = "q", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!br", name = "r", descriptor = "I")
    public static int field4111;

    @OriginalMember(owner = "client!br", name = "u", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!br", name = "z", descriptor = "Lo;")
    public static class24 field4119;

    // $FF: synthetic field
    @OriginalMember(owner = "client!br", name = "A", descriptor = "Ljava/lang/Class;")
    public static Class field4120;

    @OriginalMember(owner = "client!br", name = "y", descriptor = "[I")
    public static int[] field4118;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ZLok;)V")
    public static final void method1713(boolean arg0, class169 arg1) {
        field4109++;
        if (class518.field7511 == null) {
            return;
        }
        class425 var2 = null;
        if (arg1.field2745 == 0) {
            var2 = (class425) class211.method1435(arg1.field2758, arg1.field2747, arg1.field2756);
        }
        if (arg0) {
            method1714(-75, 29, true);
        }
        if (arg1.field2745 == 1) {
            var2 = (class425) class498.method3008(arg1.field2758, arg1.field2747, arg1.field2756);
        }
        if (arg1.field2745 == 2) {
            var2 = (class425) class479.method2859(arg1.field2758, arg1.field2747, arg1.field2756, field4120 == null ? (field4120 = method1719("rj")) : field4120);
        }
        if (arg1.field2745 == 3) {
            var2 = (class425) class296.method1911(arg1.field2758, arg1.field2747, arg1.field2756);
        }
        if (var2 == null) {
            arg1.field2748 = -1;
            arg1.field2746 = 0;
            arg1.field2751 = 0;
        } else {
            arg1.field2748 = var2.method224(-10848);
            arg1.field2746 = var2.method225(false);
            arg1.field2751 = var2.method231(11);
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(IIZ)Lvl;")
    public static final class11 method1714(int arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            field4108++;
            long var3 = (long) ((arg2 ? Integer.MIN_VALUE : 0) | arg0);
            return (class11) class12.field165.method1622(var3, -115);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(I)V")
    public static void method1715(int arg0) {
        field4112 = null;
        field4118 = null;
        field4106 = null;
        field4119 = null;
        field4113 = null;
        if (arg0 >= -87) {
            field4113 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(II)Lgh;")
    public static final class388 method1716(int arg0, int arg1) {
        field4105++;
        int var2 = arg1 >> 16;
        if (arg0 != 27411) {
            field4115 = -0.6097776F;
        }
        int var3 = arg1 & 0xFFFF;
        if (class419.field6326[var2] == null || class419.field6326[var2][var3] == null) {
            boolean var4 = class1.method16(var2, 1465669104);
            if (!var4) {
                return null;
            }
        }
        return class419.field6326[var2][var3];
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(B)Ldl;")
    public final class46 method59(byte arg0) {
        if (arg0 > -103) {
            this.field4117 = null;
        }
        field4111++;
        return this.field4117;
    }

    @OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)I")
    public final int method1717(boolean arg0) {
        if (arg0) {
            method1714(-18, -69, true);
        }
        field4110++;
        return this.field4117.field957;
    }

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(ILdl;Ldl;F)Z")
    public final boolean method1718(int arg0, class46 arg1, class46 arg2, float arg3) {
        field4104++;
        boolean var5 = true;
        class206 var6 = this.field4107.field930;
        this.field4107.method387(class80.field1604);
        this.field4107.method321();
        this.field4107.method437(-127);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4117.field957, this.field4117.field957);
        this.field4107.method322(false, (byte) -104);
        if (arg0 >= -54) {
            this.method1717(false);
        }
        this.field4107.method386(false, -8);
        this.field4107.method379(-28710, false);
        this.field4107.method447((byte) 46, false);
        this.field4107.method430(-2, (byte) -85);
        this.field4107.method392((byte) 106, 1);
        this.field4107.method411(0.0F, 0.0F, 19390, arg3, 0.0F);
        this.field4107.method426(34165, 34165, -24610);
        this.field4107.method381((byte) 28, arg1);
        this.field4107.method392((byte) 106, 0);
        this.field4107.method288((byte) -91, 1);
        this.field4107.method381((byte) 28, arg2);
        this.field4107.method434(10902, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1417(0, var8, this.field4117, true);
            var6.method1408(-1, 0);
            if (!var6.method1413(false)) {
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
        var6.method1409(0, -41);
        this.field4107.method354(var6, true);
        this.field4107.method392((byte) 106, 1);
        this.field4107.method381((byte) 28, null);
        this.field4107.method426(8448, 8448, -24610);
        this.field4107.method392((byte) 106, 0);
        this.field4107.method381((byte) 28, null);
        OpenGL.glPopAttrib();
        this.field4107.method371(class80.field1604[0], class80.field1604[1], class80.field1604[2], class80.field1604[3]);
        if (var5 && !this.field4107.field866) {
            this.field4117.method2349((byte) 18);
        }
        return var5;
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lda;I)V")
    public class271(class44 arg0, int arg1) {
        this.field4107 = arg0;
        this.field4117 = new class46(arg0, 6408, arg1);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1719(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
