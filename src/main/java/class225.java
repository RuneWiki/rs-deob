import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class225 extends class200 {

    @OriginalMember(owner = "client!mda", name = "o", descriptor = "Lad;")
    private class362 field3173;

    @OriginalMember(owner = "client!mda", name = "j", descriptor = "Lvda;")
    private class158 field3168;

    @OriginalMember(owner = "client!mda", name = "q", descriptor = "Lkca;")
    public static class73 field3175 = new class73(22, 0);

    @OriginalMember(owner = "client!mda", name = "s", descriptor = "Lig;")
    public static class206 field3177 = new class206(63, 6);

    @OriginalMember(owner = "client!mda", name = "i", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!mda", name = "k", descriptor = "I")
    public static int field3169;

    @OriginalMember(owner = "client!mda", name = "l", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!mda", name = "n", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!mda", name = "r", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIZII)V", line = 3)
    public static final void method1465(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        class167.field2045 = 0L;
        field3170++;
        int var5 = class562.method3250(-32068);
        if (arg1 == 3 || var5 == 3) {
            arg2 = true;
        }
        if (arg3 > -9) {
            method1468(-19, (byte) -95, -9, 92, 66);
        }
        if (!class413.field6264.method390()) {
            arg2 = true;
        }
        class270.method1769(arg1, var5, arg0, arg2, arg4, 21317);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)V", line = 26)
    public static void method1466(byte arg0) {
        if (arg0 <= 114) {
            method1467(null, -69);
        }
        field3175 = null;
        field3177 = null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 39)
    public static final void method1467(String arg0, int arg1) {
        class651.field9388 = arg0;
        field3176++;
        if (class635.field9135 == null) {
            return;
        }
        if (arg1 >= -64) {
            field3177 = null;
        }
        try {
            String var2 = class635.field9135.getParameter("cookieprefix");
            String var3 = class635.field9135.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class599.method3482(-12605, class84.method550((byte) -107) + 94608000000L) + "; Max-Age=" + 94608000L;
            }
            class314.method2068("document.cookie=\"" + var5 + "\"", false, class635.field9135);
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IBIII)V", line = 76)
    public static final void method1468(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (class30.field343 == 1) {
            class168.field2052[class613.field8923 / 100].method2706(class289.field3991 - 8, class464.field6908 + -8);
        }
        if (arg1 != 100) {
            method1466((byte) 37);
        }
        field3172++;
        if (class30.field343 == 2) {
            class168.field2052[class613.field8923 / 100 + 4].method2706(class289.field3991 - 8, class464.field6908 + -8);
        }
        class102.method634(-9493);
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(IZ)V", line = 99)
    public static final void method1469(int arg0, boolean arg1) {
        field3171++;
        int var2 = class287.field3982 - class281.field3924;
        if (var2 >= 100) {
            class236.field3384 = 1;
            return;
        }
        if (!arg1) {
            field3177 = null;
        }
        int var3 = (int) class639.field9187;
        if (class289.field4003 >> 8 > var3) {
            var3 = class289.field4003 >> 8;
        }
        if (class126.field1553[4] && (class481.field7066[4] + 128) > var3) {
            var3 = class481.field7066[4] + 128;
        }
        int var4 = (int) class388.field5967 + class51.field543 & 0x3FFF;
        class563.method3258((byte) 15, class620.field8987, (var3 >> 3) * 3 + 600 << 2, var3, var4, class399.method2547(class439.field6548.field1768, class439.field6548.field1764, (byte) 17, class226.field3179) - 200, class325.field4695, arg0);
        float var5 = 1.0F - (float) ((100 - var2) * (100 - var2) * (100 - var2)) / 1000000.0F;
        class207.field2781 = (int) ((float) (class207.field2781 - class277.field3870) * var5 + (float) class277.field3870);
        class309.field4550 = (int) ((float) (class309.field4550 - class118.field1474) * var5 + (float) class118.field1474);
        class337.field4821 = (int) ((float) (class337.field4821 - class341.field4861) * var5 + (float) class341.field4861);
        class100.field1192 = (int) ((float) (class100.field1192 - class531.field7668) * var5 + (float) class531.field7668);
        int var6 = class17.field177 - class280.field3905;
        if (var6 > 8192) {
            var6 -= 16384;
        } else if (var6 < -8192) {
            var6 += 16384;
        }
        class17.field177 = (int) ((float) var6 * var5 + (float) class280.field3905);
        class17.field177 &= 0x3FFF;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)Lvda;", line = 147)
    public final class158 method1269(boolean arg0) {
        field3174++;
        if (arg0) {
            field3177 = null;
        }
        return this.field3168;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lvda;FILvda;)Z", line = 161)
    public final boolean method1470(class158 arg0, float arg1, int arg2, class158 arg3) {
        field3167++;
        boolean var5 = true;
        class535 var6 = this.field3173.field5398;
        this.field3173.method403(class643.field9254);
        this.field3173.method404();
        this.field3173.method2284((byte) 85);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field3168.field1952, this.field3168.field1952);
        this.field3173.method2278(false, -32);
        this.field3173.method2326(-1254361672, false);
        this.field3173.method2260(2144, false);
        this.field3173.method2285(-32, false);
        this.field3173.method2286(-2, (byte) -111);
        this.field3173.method2269((byte) -118, 1);
        this.field3173.method2322((byte) -50, 0.0F, 0.0F, arg1, 0.0F);
        this.field3173.method2320(34165, 34165, 0);
        this.field3173.method2295(-101, arg0);
        this.field3173.method2269((byte) 108, 0);
        this.field3173.method2288(1, 7681);
        this.field3173.method2295(-99, arg3);
        this.field3173.method2266(var6, true);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3122(true, this.field3168, var8, 0);
            var6.method3124(0, (byte) -63);
            if (!var6.method3126((byte) -92)) {
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
        var6.method3127(0, arg2);
        this.field3173.method2261(false, var6);
        this.field3173.method2269((byte) 62, 1);
        this.field3173.method2295(-80, null);
        this.field3173.method2320(8448, 8448, 0);
        this.field3173.method2269((byte) -128, arg2);
        this.field3173.method2295(-71, null);
        OpenGL.glPopAttrib();
        this.field3173.method368(class643.field9254[0], class643.field9254[1], class643.field9254[2], class643.field9254[3]);
        if (var5 && !this.field3173.field5421) {
            this.field3168.method3026(-127);
        }
        return var5;
    }

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "(I)I", line = 357)
    public final int method1471(int arg0) {
        if (arg0 != 65535) {
            this.field3173 = null;
        }
        field3169++;
        return this.field3168.field1952;
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lad;I)V", line = 375)
    public class225(class362 arg0, int arg1) {
        this.field3173 = arg0;
        this.field3168 = new class158(arg0, 6408, arg1);
    }
}
