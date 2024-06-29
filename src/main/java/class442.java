import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class442 extends class636 {

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "Luca;")
    private class287 field6423;

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Leg;")
    private class364 field6425;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "[I")
    public static int[] field6422 = new int[1000];

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field6424;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(I)I", line = 4)
    public final int method2610(int arg0) {
        field6418++;
        if (arg0 != -5043) {
            this.method2613(null, -1.1762979F, null, (byte) 101);
        }
        return this.field6425.field5338;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BB)Z", line = 18)
    public static final boolean method2611(byte arg0, byte arg1) {
        field6421++;
        int var2 = arg0 & 0xFF;
        if (arg1 != 92) {
            field6422 = null;
        }
        if (var2 == 0) {
            return false;
        } else {
            return var2 < 128 || var2 >= 160 || class330.field4795[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "(I)V", line = 44)
    public static void method2612(int arg0) {
        if (arg0 != -13094) {
            field6422 = null;
        }
        field6422 = null;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Leg;FLeg;B)Z", line = 54)
    public final boolean method2613(class364 arg0, float arg1, class364 arg2, byte arg3) {
        field6420++;
        boolean var5 = true;
        class559 var6 = this.field6423.field4130;
        this.field6423.method628(class623.field9014);
        if (arg3 < 53) {
            field6422 = null;
        }
        this.field6423.method699();
        this.field6423.method1703((byte) -114);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field6425.field5338, this.field6425.field5338);
        this.field6423.method1770(false, (byte) -84);
        this.field6423.method1705(false, (byte) 86);
        this.field6423.method1693(false, false);
        this.field6423.method1694((byte) 79, false);
        this.field6423.method1761(-2, 260);
        this.field6423.method1745(true, 1);
        this.field6423.method1750(0.0F, 114, 0.0F, arg1, 0.0F);
        this.field6423.method1701(34165, 1, 34165);
        this.field6423.method1709((byte) -116, arg2);
        this.field6423.method1745(true, 0);
        this.field6423.method1751(1, 21575);
        this.field6423.method1709((byte) -113, arg0);
        this.field6423.method1740(var6, (byte) 122);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method3236(16795, this.field6425, var8, 0);
            var6.method3245(0, -75);
            if (!var6.method3238(107)) {
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
        var6.method3244(0, 36009);
        this.field6423.method1695(var6, 255);
        this.field6423.method1745(true, 1);
        this.field6423.method1709((byte) -57, null);
        this.field6423.method1701(8448, 1, 8448);
        this.field6423.method1745(true, 0);
        this.field6423.method1709((byte) -50, null);
        OpenGL.glPopAttrib();
        this.field6423.method652(class623.field9014[0], class623.field9014[1], class623.field9014[2], class623.field9014[3]);
        if (var5 && !this.field6423.field4164) {
            this.field6425.method2926((byte) -69);
        }
        return var5;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(ZII)Z", line = 254)
    public static final boolean method2614(boolean arg0, int arg1, int arg2) {
        field6424++;
        if (!arg0) {
            method2612(-127);
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BII)Z", line = 267)
    public static final boolean method2615(byte arg0, int arg1, int arg2) {
        field6417++;
        if (arg0 > -73) {
            field6422 = null;
        }
        return (arg2 & 0x70000) != 0 | class454.method2663(arg2, arg1, (byte) -107) || class334.method2047(arg1, arg2, 0);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)Leg;", line = 283)
    public final class364 method1498(int arg0) {
        if (arg0 > -35) {
            return null;
        } else {
            field6419++;
            return this.field6425;
        }
    }

    @OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Luca;I)V", line = 295)
    public class442(class287 arg0, int arg1) {
        this.field6423 = arg0;
        this.field6425 = new class364(arg0, 6408, arg1);
    }
}
