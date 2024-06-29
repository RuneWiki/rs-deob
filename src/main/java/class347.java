import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class347 extends class633 {

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "Lap;")
    private class435 field4522;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "Lng;")
    private class310 field4523;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "Lpr;")
    public static class407 field4518 = new class407(56, -2);

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "I")
    public static int field4526 = -1;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "[Z")
    public static boolean[] field4528 = new boolean[5];

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "F")
    public static float field4527;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    public static int field4519;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field4521;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Ljo;")
    public static class303 field4525;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lng;")
    public final class310 method1631(int arg0) {
        field4524++;
        if (arg0 >= -12) {
            this.method1925(-92);
        }
        return this.field4523;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V")
    public static final void method1924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4519++;
        if (arg0 >= arg4) {
            for (int var5 = arg4; var5 < arg0; var5++) {
                class156.field1755[var5][arg2] = arg1;
            }
        } else {
            for (int var6 = arg0; var6 < arg4; var6++) {
                class156.field1755[var6][arg2] = arg1;
            }
        }
        if (arg3 != -22269) {
            method1927(64);
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)I")
    public final int method1925(int arg0) {
        field4520++;
        if (arg0 != -32480) {
            this.method1631(5);
        }
        return this.field4523.field4018;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZLjava/lang/String;)V")
    public static final void method1926(boolean arg0, String arg1) {
        class68.field738 = arg1;
        field4517++;
        if (!arg0 || class485.field7068 == null) {
            return;
        }
        try {
            String var2 = class485.field7068.getParameter("cookieprefix");
            String var3 = class485.field7068.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg1 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg1.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class40.method208(-75, class641.method3604(!arg0) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class432.method2309("document.cookie=\"" + var5 + "\"", class485.field7068, false);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(I)V")
    public static void method1927(int arg0) {
        field4518 = null;
        if (arg0 != 0) {
            method1927(111);
        }
        field4525 = null;
        field4528 = null;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(BFLng;Lng;)Z")
    public final boolean method1928(byte arg0, float arg1, class310 arg2, class310 arg3) {
        field4521++;
        boolean var5 = true;
        class162 var6 = this.field4522.field6053;
        this.field4522.method274(class549.field7846);
        this.field4522.method378();
        this.field4522.method2375(-32);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field4523.field4018, this.field4523.field4018);
        this.field4522.method2377(false, false);
        this.field4522.method2400((byte) 101, false);
        this.field4522.method2386(false, -54);
        this.field4522.method2382(false, -32);
        this.field4522.method2321(-2, (byte) 95);
        this.field4522.method2380(1, (byte) -100);
        this.field4522.method2369(0.0F, -21409, arg1, 0.0F, 0.0F);
        if (arg0 <= 2) {
            return true;
        }
        this.field4522.method2371(34165, 34165, -110);
        this.field4522.method2388((byte) 78, arg2);
        this.field4522.method2380(0, (byte) -121);
        this.field4522.method2396(1, -1);
        this.field4522.method2388((byte) 120, arg3);
        this.field4522.method2395(true, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method985(var8, this.field4523, 0, false);
            var6.method982(0, 30862);
            if (!var6.method976((byte) 45)) {
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
        var6.method988(0, 512);
        this.field4522.method2341(var6, (byte) -91);
        this.field4522.method2380(1, (byte) -125);
        this.field4522.method2388((byte) 103, null);
        this.field4522.method2371(8448, 8448, -119);
        this.field4522.method2380(0, (byte) -117);
        this.field4522.method2388((byte) 121, null);
        OpenGL.glPopAttrib();
        this.field4522.method314(class549.field7846[0], class549.field7846[1], class549.field7846[2], class549.field7846[3]);
        if (var5 && !this.field4522.field5971) {
            this.field4523.method2229((byte) -114);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lap;I)V")
    public class347(class435 arg0, int arg1) {
        this.field4522 = arg0;
        this.field4523 = new class310(arg0, 6408, arg1);
    }
}
