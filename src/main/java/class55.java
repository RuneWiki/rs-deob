import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wba")
public class class55 extends class235 {

    @OriginalMember(owner = "client!wba", name = "o", descriptor = "Lpc;")
    private class700 field734;

    @OriginalMember(owner = "client!wba", name = "m", descriptor = "Lhfa;")
    private class331 field732;

    @OriginalMember(owner = "client!wba", name = "q", descriptor = "Lol;")
    public static class301 field736 = class4.method101(0);

    @OriginalMember(owner = "client!wba", name = "s", descriptor = "Ltja;")
    public static class288 field738 = new class288(64);

    @OriginalMember(owner = "client!wba", name = "v", descriptor = "I")
    public static int field741 = 1;

    @OriginalMember(owner = "client!wba", name = "u", descriptor = "Llja;")
    public static class744 field740 = new class744(30, -1);

    @OriginalMember(owner = "client!wba", name = "l", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!wba", name = "n", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!wba", name = "p", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!wba", name = "r", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!wba", name = "t", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!wba", name = "w", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!wba", name = "x", descriptor = "Lwb;")
    public static class350 field743;

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(I)Lhfa;", line = 3)
    public final class331 method483(int arg0) {
        if (arg0 != 0) {
            this.field734 = null;
        }
        field739++;
        return this.field732;
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(IBIIIIIIIIII)V", line = 14)
    public static final void method484(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field737++;
        if (!class647.method3652(arg9, 0) || arg1 >= -30) {
            return;
        }
        if (class642.field8762[arg9] == null) {
            client.method1895(class316.field3880[arg9], -1, arg6, arg8, arg10, arg5, arg4, arg2, arg0, arg11, arg3, arg7);
        } else {
            client.method1895(class642.field8762[arg9], -1, arg6, arg8, arg10, arg5, arg4, arg2, arg0, arg11, arg3, arg7);
        }
    }

    @OriginalMember(owner = "client!wba", name = "<init>", descriptor = "(Lpc;I)V", line = 43)
    public class55(class700 arg0, int arg1) {
        this.field734 = arg0;
        this.field732 = new class331(arg0, 6408, arg1);
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(B)I", line = 53)
    public final int method485(byte arg0) {
        int var2 = -25 / ((-arg0 - 71) / 47);
        field735++;
        return this.field732.field4101;
    }

    @OriginalMember(owner = "client!wba", name = "d", descriptor = "(I)I", line = 64)
    public static final int method486(int arg0) {
        if (arg0 != -21201) {
            field740 = null;
        }
        field731++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class521.field7389.field9271 && !class521.field7389.field9260) {
            var1 = true;
            if (class174.field2151.field1067 < 512 && class174.field2151.field1067 != 0) {
                var1 = false;
            }
            if (class675.field9263.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class500.field7015) {
            var3 = false;
        }
        if (class522.field7408) {
            var2 = false;
        }
        if (class705.field9915) {
            var1 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class642.method3596((byte) 119);
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = -1;
        if (var1) {
            try {
                var4 = class138.method1011(1000, 2, -128);
            } catch (Exception var15) {
            }
        }
        if (var3) {
            try {
                var6 = class138.method1011(1000, 3, -128);
                if (class118.field1503.field10665.method1903(0) == 3) {
                    class22 var7 = class363.field4526.method60();
                    long var8 = var7.field353 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field355;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class138.method1011(1000, 1, -128);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class642.method3596((byte) 119);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var11 < var4 && var12 < var4) {
            return class444.method2615(var4, 14961);
        } else if (var12 < var11) {
            return class305.method1764(3, arg0 - 1940, var11);
        } else {
            return class305.method1764(1, -23141, var12);
        }
    }

    @OriginalMember(owner = "client!wba", name = "b", descriptor = "(B)V", line = 235)
    public static void method487(byte arg0) {
        field736 = null;
        field743 = null;
        field738 = null;
        if (arg0 == -103) {
            field740 = null;
        }
    }

    @OriginalMember(owner = "client!wba", name = "a", descriptor = "(FLhfa;Lhfa;I)Z", line = 248)
    public final boolean method488(float arg0, class331 arg1, class331 arg2, int arg3) {
        field733++;
        boolean var5 = true;
        class195 var6 = this.field734.field9828;
        this.field734.method566(class115.field1459);
        this.field734.method634();
        this.field734.method3912(-9014);
        OpenGL.glMatrixMode(5889);
        OpenGL.glLoadIdentity();
        OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
        OpenGL.glMatrixMode(5888);
        OpenGL.glLoadIdentity();
        OpenGL.glPushAttrib(2048);
        OpenGL.glViewport(0, 0, this.field732.field4101, this.field732.field4101);
        this.field734.method3913(-9373, false);
        this.field734.method3892(false, 1);
        this.field734.method3906(false, 32884);
        this.field734.method3908(false, (byte) 127);
        this.field734.method3901(-2, false);
        this.field734.method3925((byte) 89, 1);
        this.field734.method3960(0.0F, 0.0F, arg0, 0.0F, -90);
        this.field734.method3961(34165, 34165, 16127);
        this.field734.method3936(false, arg2);
        this.field734.method3925((byte) 19, 0);
        this.field734.method3932(1, (byte) -76);
        this.field734.method3936(false, arg1);
        this.field734.method3956(false, var6);
        for (int var7 = 0; var7 < 6; var7++) {
            int var8 = var7 + 34069;
            var6.method1268(this.field732, 0, 0, var8);
            var6.method1272(0, 18636);
            if (!var6.method1276((byte) 24)) {
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
        if (arg3 >= -127) {
            return true;
        }
        var6.method1284(21450, 0);
        this.field734.method3964(var6, -1);
        this.field734.method3925((byte) 34, 1);
        this.field734.method3936(false, null);
        this.field734.method3961(8448, 8448, 16127);
        this.field734.method3925((byte) -108, 0);
        this.field734.method3936(false, null);
        OpenGL.glPopAttrib();
        this.field734.method556(class115.field1459[0], class115.field1459[1], class115.field1459[2], class115.field1459[3]);
        if (var5 && !this.field734.field9843) {
            this.field732.method2344(1);
        }
        return var5;
    }
}
