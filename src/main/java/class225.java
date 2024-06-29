import jaggl.OpenGL;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class225 extends class42 {

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lvf;")
    private class159 field3528;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "Ldka;")
    private class12 field3531;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3536 = new String[] { method1984(method1983("f$\u0018\u0014\u001d")), method1984(method1983("h7[>L")), method1984(method1983("b7Z?")), method1984(method1983("wl\u0018}H")), method1984(method1983("f$\u0018\u0011\u001d")), method1984(method1983("f$\u0018\u0017\u001d")), method1984(method1983("f$\u0018\u0016\u001d")), method1984(method1983("f$\u0018\u0012\u001d")), method1984(method1983("f$\u0018o\\b+Bm\u001d")), method1984(method1983("f$\u0018\u0015\u001d")), method1984(method1983("f$\u0018\u0010\u001d")) };

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lua;")
    public static class696 field3529 = new class696(2);

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field3534 = -50;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
    public static int field3535 = 1408;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
    public static void method1977(boolean arg0) {
        try {
            field3529 = null;
            if (arg0) {
                field3529 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3536[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IB)V")
    public static final void method1978(int arg0, byte arg1) {
        try {
            field3530++;
            class467.field7178 = arg0;
            class29 var2 = class159.field2287;
            synchronized (class159.field2287) {
                class159.field2287.method304(1);
                if (arg1 < 59) {
                    field3534 = 45;
                }
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3536[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1979(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        try {
            if (arg2 != -2172) {
                field3529 = null;
            }
            if (class546.field8030 <= arg4 && arg0 <= class779.field11374 && arg6 >= class310.field5088 && arg7 <= class478.field7264) {
                class277.method2375(arg5, arg6, arg4, arg1, arg3, arg7, 1, arg0);
            } else {
                class204.method1841(arg1, arg6, 30548, arg0, arg7, arg3, arg4, arg5);
            }
            field3533++;
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3536[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ltga;Ljava/lang/Object;I)V")
    public static final void method1980(class61 arg0, Object arg1, int arg2) {
        try {
            field3526++;
            if (arg0.field800 != null) {
                for (int var3 = 0; var3 < 50 && arg0.field800.peekEvent() != null; var3++) {
                    class524.method3918(-4, 1L);
                }
                try {
                    if (arg1 != null) {
                        arg0.field800.postEvent(new ActionEvent(arg1, 1001, field3536[1]));
                    }
                    if (arg2 > -21) {
                        field3535 = 88;
                    }
                } catch (Exception var5) {
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3536[4] + (arg0 == null ? field3536[2] : field3536[3]) + ',' + (arg1 == null ? field3536[2] : field3536[3]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)I")
    public final int method1981(int arg0) {
        try {
            if (arg0 == 0) {
                field3527++;
                return this.field3531.field141;
            } else {
                return 28;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3536[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZLdka;Ldka;F)Z")
    public final boolean method1982(boolean arg0, class12 arg1, class12 arg2, float arg3) {
        try {
            field3525++;
            boolean var5 = true;
            class639 var6 = this.field3528.field2525;
            this.field3528.method201(class379.field6114);
            this.field3528.method227();
            this.field3528.method1434(-80);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, this.field3531.field141, this.field3531.field141);
            this.field3528.method1446(false, -32);
            this.field3528.method1474(false, (byte) 91);
            this.field3528.method1463(false, 1);
            this.field3528.method1489(-19225, false);
            this.field3528.method1447(-2, 20014);
            this.field3528.method1432((byte) 3, 1);
            this.field3528.method1455(0.0F, 0.0F, 0, arg3, 0.0F);
            this.field3528.method1492(34165, 34165, (byte) 17);
            this.field3528.method1497(arg1, true);
            this.field3528.method1432((byte) 3, 0);
            this.field3528.method1425((byte) 35, 1);
            this.field3528.method1497(arg2, arg0);
            this.field3528.method1424(var6, (byte) -29);
            for (int var7 = 0; var7 < 6; var7++) {
                int var8 = var7 + 34069;
                var6.method4619(0, this.field3531, -128, var8);
                var6.method4616(-1, 0);
                if (!var6.method4624(-36054)) {
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
            var6.method4627(0, -20878);
            this.field3528.method1502(var6, -118);
            this.field3528.method1432((byte) 3, 1);
            this.field3528.method1497(null, true);
            this.field3528.method1492(8448, 8448, (byte) 17);
            this.field3528.method1432((byte) 3, 0);
            this.field3528.method1497(null, arg0);
            OpenGL.glPopAttrib();
            this.field3528.method221(class379.field6114[0], class379.field6114[1], class379.field6114[2], class379.field6114[3]);
            if (var5 && !this.field3528.field2496) {
                this.field3531.method1971(9984);
            }
            return var5;
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field3536[7] + arg0 + ',' + (arg1 == null ? field3536[2] : field3536[3]) + ',' + (arg2 == null ? field3536[2] : field3536[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)Ldka;")
    public final class12 method439(int arg0) {
        try {
            field3532++;
            int var2 = 58 % ((arg0 - 38) / 33);
            return this.field3531;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3536[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lvf;I)V")
    public class225(class159 arg0, int arg1) {
        try {
            this.field3528 = arg0;
            this.field3531 = new class12(arg0, 6408, arg1);
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3536[8] + (arg0 == null ? field3536[2] : field3536[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1983(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x35);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1984(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 66;
                    break;
                case 2:
                    var10005 = 54;
                    break;
                case 3:
                    var10005 = 83;
                    break;
                default:
                    var10005 = 53;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
