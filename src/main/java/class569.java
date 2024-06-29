import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public class class569 extends class627 {

    @OriginalMember(owner = "client!cv", name = "o", descriptor = "Lac;")
    private class541 field8017;

    @OriginalMember(owner = "client!cv", name = "l", descriptor = "Lhw;")
    private class132 field8014;

    @OriginalMember(owner = "client!cv", name = "q", descriptor = "[I")
    public static int[] field8019 = new int[2];

    @OriginalMember(owner = "client!cv", name = "j", descriptor = "Lbi;")
    public static class481 field8012 = new class481(7500);

    @OriginalMember(owner = "client!cv", name = "u", descriptor = "Lea;")
    public static class547 field8023 = new class547(21, 3);

    @OriginalMember(owner = "client!cv", name = "k", descriptor = "F")
    public static float field8013;

    @OriginalMember(owner = "client!cv", name = "m", descriptor = "I")
    public static int field8015;

    @OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
    public static int field8016;

    @OriginalMember(owner = "client!cv", name = "p", descriptor = "I")
    public static int field8018;

    @OriginalMember(owner = "client!cv", name = "r", descriptor = "I")
    public static int field8020;

    @OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
    public static int field8021;

    @OriginalMember(owner = "client!cv", name = "t", descriptor = "I")
    public static int field8022;

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Lhw;", line = 5)
    public final class132 method145(byte arg0) {
        if (arg0 <= 119) {
            method3200(false);
        }
        field8016++;
        return this.field8014;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(BLhw;FLhw;)Z", line = 18)
    public final boolean method3198(byte arg0, class132 arg1, float arg2, class132 arg3) {
        field8020++;
        boolean var5 = true;
        class365 var6 = this.field8017.field7574;
        this.field8017.method398(class245.field3177);
        this.field8017.method406();
        this.field8017.method3010(arg0 + 29479);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field8014.field1696, this.field8014.field1696);
        this.field8017.method2999(false, arg0 ^ 0xFFFFE4E9);
        this.field8017.method2994(false, false);
        this.field8017.method3024(false, false);
        this.field8017.method3018((byte) -123, false);
        this.field8017.method2977(69, -2);
        this.field8017.method2988(1, arg0 ^ 0xCD767C83);
        this.field8017.method3001(0.0F, 0.0F, 0.0F, arg2, -77);
        this.field8017.method3042(34165, 8960, 34165);
        this.field8017.method3006(1, arg3);
        this.field8017.method2988(0, 847872872);
        this.field8017.method3039(260, 1);
        this.field8017.method3006(1, arg1);
        this.field8017.method3041(true, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method2095(var8, arg0 + 21, 0, this.field8014);
            var6.method2098(0, 0);
            if (!var6.method2097((byte) 74)) {
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
        var6.method2094(0, true);
        this.field8017.method3050(var6, arg0 ^ 0x14);
        this.field8017.method2988(1, 847872872);
        this.field8017.method3006(1, null);
        this.field8017.method3042(8448, arg0 ^ 0xFFFFDCEB, 8448);
        this.field8017.method2988(0, 847872872);
        this.field8017.method3006(1, null);
        if (arg0 != -21) {
            method3200(true);
        }
        OpenGL.glPopAttrib();
        this.field8017.method426(class245.field3177[0], class245.field3177[1], class245.field3177[2], class245.field3177[3]);
        if (var5 && !this.field8017.field7617) {
            this.field8014.method1257(69);
        }
        return var5;
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)I", line = 218)
    public final int method3199(int arg0) {
        field8015++;
        if (arg0 != -65534) {
            method3201(-59);
        }
        return this.field8014.field1696;
    }

    @OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(Lac;I)V", line = 231)
    public class569(class541 arg0, int arg1) {
        this.field8017 = arg0;
        this.field8014 = new class132(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(Z)V", line = 240)
    public static final void method3200(boolean arg0) {
        class215.field2600 = null;
        if (!arg0) {
            return;
        }
        class559.field7871 = null;
        class71.field770 = null;
        class120.field1576 = null;
        class677.field9448 = null;
        class513.field6946 = null;
        field8022++;
        class704.field9880 = null;
        class144.field1860 = null;
        class587.field8211 = null;
    }

    @OriginalMember(owner = "client!cv", name = "b", descriptor = "(I)V", line = 259)
    public static void method3201(int arg0) {
        field8019 = null;
        if (arg0 == 1) {
            field8012 = null;
            field8023 = null;
        }
    }

    @OriginalMember(owner = "client!cv", name = "a", descriptor = "(ZIILjava/lang/String;)Z", line = 280)
    public static final boolean method3202(boolean arg0, int arg1, int arg2, String arg3) {
        field8018++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        } else if (arg1 == 30883) {
            boolean var4 = false;
            boolean var5 = false;
            int var6 = 0;
            int var7 = arg3.length();
            for (int var8 = 0; var8 < var7; var8++) {
                char var9 = arg3.charAt(var8);
                if (var8 == 0) {
                    if (var9 == '-') {
                        var4 = true;
                        continue;
                    }
                    if (var9 == '+' && arg0) {
                        continue;
                    }
                }
                int var11;
                if (var9 >= '0' && var9 <= '9') {
                    var11 = var9 - '0';
                } else if (var9 >= 'A' && var9 <= 'Z') {
                    var11 = var9 - '7';
                } else if (var9 >= 'a' && var9 <= 'z') {
                    var11 = var9 - 'W';
                } else {
                    return false;
                }
                if (var11 >= arg2) {
                    return false;
                }
                if (var4) {
                    var11 = -var11;
                }
                int var10 = arg2 * var6 + var11;
                if (var10 / arg2 != var6) {
                    return false;
                }
                var6 = var10;
                var5 = true;
            }
            return var5;
        } else {
            return false;
        }
    }
}
