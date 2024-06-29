import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ega")
public class class738 extends class403 {

    @OriginalMember(owner = "client!ega", name = "u", descriptor = "Lkv;")
    private class280 field10302;

    @OriginalMember(owner = "client!ega", name = "o", descriptor = "Lmu;")
    private class314 field10296;

    @OriginalMember(owner = "client!ega", name = "p", descriptor = "I")
    public static int field10297 = 0;

    @OriginalMember(owner = "client!ega", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field10303 = new String[200];

    @OriginalMember(owner = "client!ega", name = "n", descriptor = "I")
    public static int field10295;

    @OriginalMember(owner = "client!ega", name = "q", descriptor = "I")
    public static int field10298;

    @OriginalMember(owner = "client!ega", name = "r", descriptor = "I")
    public static int field10299;

    @OriginalMember(owner = "client!ega", name = "s", descriptor = "I")
    public static int field10300;

    @OriginalMember(owner = "client!ega", name = "t", descriptor = "I")
    public static int field10301;

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(B)V")
    public static void method4132(byte arg0) {
        if (arg0 >= 79) {
            field10303 = null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)I")
    public final int method4133(int arg0) {
        if (arg0 >= -2) {
            field10303 = null;
        }
        field10295++;
        return this.field10296.field4652;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(FLmu;Lmu;Z)Z")
    public final boolean method4134(float arg0, class314 arg1, class314 arg2, boolean arg3) {
        field10299++;
        boolean var5 = arg3;
        class50 var6 = this.field10302.field4217;
        this.field10302.method428(class299.field4502);
        this.field10302.method463();
        this.field10302.method1887(63);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field10296.field4652, this.field10296.field4652);
        this.field10302.method1871(97, false);
        this.field10302.method1888(false, (byte) -110);
        this.field10302.method1892(false, 121);
        this.field10302.method1826(false, -95);
        this.field10302.method1873((byte) 23, -2);
        this.field10302.method1825(1, -79);
        this.field10302.method1879(0.0F, 0.0F, false, 0.0F, arg0);
        this.field10302.method1835(false, 34165, 34165);
        this.field10302.method1840(arg2, 2205);
        this.field10302.method1825(0, -20);
        this.field10302.method1889(false, 1);
        this.field10302.method1840(arg1, 2205);
        this.field10302.method1882(var6, !arg3);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method342(this.field10296, 0, 0, var8);
            var6.method333(0, 0);
            if (!var6.method336((byte) -7)) {
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
        var6.method332(0, (byte) 92);
        this.field10302.method1861(var6, (byte) 94);
        this.field10302.method1825(1, -8);
        this.field10302.method1840(null, 2205);
        this.field10302.method1835(!arg3, 8448, 8448);
        this.field10302.method1825(0, 108);
        this.field10302.method1840(null, 2205);
        OpenGL.glPopAttrib();
        this.field10302.method455(class299.field4502[0], class299.field4502[1], class299.field4502[2], class299.field4502[3]);
        if (var5 && !this.field10302.field4304) {
            this.field10296.method3462(-31064);
        }
        return var5;
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Ljava/lang/String;IILkv;)Liu;")
    public static final class602 method4135(String arg0, int arg1, int arg2, class280 arg3) {
        field10298++;
        if (arg1 != 65534) {
            method4132((byte) 118);
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class677.field9638, 0);
        if (class677.field9638[0] == -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return new class602(arg3, arg2, var4);
        } else {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
    }

    @OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lkv;I)V")
    public class738(class280 arg0, int arg1) {
        this.field10302 = arg0;
        this.field10296 = new class314(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!ega", name = "a", descriptor = "(Z[Ljava/lang/String;)V")
    public static final void method4136(boolean arg0, String[] arg1) {
        field10301++;
        if (arg0) {
            field10297 = -71;
        }
        if (arg1.length <= 1) {
            class230.field3350 = class230.field3350 + arg1[0];
            class109.field1317 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class561.method3260("Pausing for " + var3 + " seconds...", 91);
                class630.field8899 = arg1;
                class234.field3392 = var2 + 1;
                class238.field3433 = (long) (var3 * 1000) + class109.method731(30);
                return;
            }
            class230.field3350 = arg1[var2];
            class357.method2251(false, (byte) -107);
        }
    }

    @OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)Lmu;")
    public final class314 method2433(int arg0) {
        field10300++;
        int var2 = -123 % ((arg0 - 64) / 32);
        return this.field10296;
    }
}
