import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class676 extends class173 {

    @OriginalMember(owner = "client!pia", name = "m", descriptor = "Lpq;")
    private class194 field9476;

    @OriginalMember(owner = "client!pia", name = "i", descriptor = "Ljka;")
    private class734 field9472;

    @OriginalMember(owner = "client!pia", name = "o", descriptor = "Ljn;")
    public static class134 field9478 = new class134(76, 2);

    @OriginalMember(owner = "client!pia", name = "j", descriptor = "I")
    public static int field9473;

    @OriginalMember(owner = "client!pia", name = "k", descriptor = "I")
    public static int field9474;

    @OriginalMember(owner = "client!pia", name = "l", descriptor = "I")
    public static int field9475;

    @OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
    public static int field9477;

    @OriginalMember(owner = "client!pia", name = "p", descriptor = "I")
    public static int field9479;

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Ljka;ILjka;F)Z", line = 3)
    public final boolean method3850(class734 arg0, int arg1, class734 arg2, float arg3) {
        field9475++;
        boolean var5 = true;
        class772 var6 = this.field9476.field2703;
        this.field9476.method160(class360.field5186);
        this.field9476.method208();
        this.field9476.method1225((byte) 90);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field9472.field10118, this.field9472.field10118);
        this.field9476.method1234(false, 122);
        this.field9476.method1202(-103, false);
        this.field9476.method1224(arg1 ^ 0xFFFFC8C2, false);
        this.field9476.method1247(false, (byte) 112);
        this.field9476.method1232(-2, 1);
        this.field9476.method1262(1, 0);
        this.field9476.method1206(0.0F, 0.0F, (byte) 122, 0.0F, arg3);
        this.field9476.method1230(34165, 34165, false);
        this.field9476.method1219((byte) 120, arg2);
        this.field9476.method1262(0, 0);
        this.field9476.method1263(1, arg1 ^ 0xFFFFC3D7);
        this.field9476.method1219((byte) 106, arg0);
        this.field9476.method1274(arg1 ^ 0xFFFFC3B1, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method4267(var8, this.field9472, 0, (byte) -82);
            var6.method4259((byte) 127, 0);
            if (!var6.method4266((byte) 101)) {
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
        var6.method4268((byte) 41, 0);
        this.field9476.method1259((byte) 63, var6);
        this.field9476.method1262(1, 0);
        this.field9476.method1219((byte) 82, null);
        this.field9476.method1230(8448, 8448, false);
        this.field9476.method1262(0, 0);
        this.field9476.method1219((byte) 118, null);
        OpenGL.glPopAttrib();
        if (arg1 != -15437) {
            return false;
        }
        this.field9476.method225(class360.field5186[0], class360.field5186[1], class360.field5186[2], class360.field5186[3]);
        if (var5 && !this.field9476.field2670) {
            this.field9472.method3202((byte) -83);
        }
        return var5;
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(ILsda;)Z", line = 202)
    public static final boolean method3851(int arg0, class547 arg1) {
        field9479++;
        if (arg0 != 33985) {
            method3853(71);
        }
        if (arg1 == null) {
            return false;
        } else if (!arg1.field7603) {
            return false;
        } else if (!arg1.method3238(-2, class46.field481)) {
            return false;
        } else if (class453.field6317.method3669(false, (long) arg1.field7614) == null) {
            return class604.field8477.method3669(false, (long) arg1.field7604) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)I", line = 231)
    public final int method3852(int arg0) {
        field9474++;
        if (arg0 != -23915) {
            method3854(-45);
        }
        return this.field9472.field10118;
    }

    @OriginalMember(owner = "client!pia", name = "c", descriptor = "(I)V", line = 242)
    public static void method3853(int arg0) {
        if (arg0 != 3063) {
            method3854(-95);
        }
        field9478 = null;
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lpq;I)V", line = 258)
    public class676(class194 arg0, int arg1) {
        this.field9476 = arg0;
        this.field9472 = new class734(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)Ljka;", line = 267)
    public final class734 method1105(int arg0) {
        if (arg0 != -1) {
            method3853(54);
        }
        field9473++;
        return this.field9472;
    }

    @OriginalMember(owner = "client!pia", name = "d", descriptor = "(I)V", line = 279)
    public static final void method3854(int arg0) {
        field9477++;
        class531.field7316 = 1;
        class284.field4094 = -1;
        long var1 = 0L;
        if (class766.field10546 == null) {
            class349.method2198(13609, 35);
            return;
        }
        class511 var3 = new class511(class688.method3910(arg0 + 19128, class467.method2794(-48, class766.field10546)));
        long var4 = var3.method3020(true);
        class602.field8444 = var3.method3020(true);
        class115.method837(class425.method2564(var4, 0), true, "", -3);
        if (arg0 != -19252) {
            method3854(-29);
        }
    }
}
