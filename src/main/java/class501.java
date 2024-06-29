import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mt")
public class class501 extends class96 {

    @OriginalMember(owner = "client!mt", name = "o", descriptor = "Z")
    private boolean field7315 = false;

    @OriginalMember(owner = "client!mt", name = "p", descriptor = "Lkca;")
    private class13 field7317;

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7327 = new String[] { method3840(method3839("HY6r\u000fKDlpN")), method3840(method3839("KXt\"")), method3840(method3839("^\u00036`\u001b")), method3840(method3839("HY6\fN")), method3840(method3839("HY6\rN")), method3840(method3839("HY6\u000bN")), method3840(method3839("HY6\nN")), method3840(method3839("HY6\u0006N")), method3840(method3839("HY6\u000fN")), method3840(method3839("HY6\tN")) };

    @OriginalMember(owner = "client!mt", name = "h", descriptor = "I")
    public static int field7326 = -1;

    @OriginalMember(owner = "client!mt", name = "j", descriptor = "I")
    public static int field7316;

    @OriginalMember(owner = "client!mt", name = "k", descriptor = "I")
    public static int field7318;

    @OriginalMember(owner = "client!mt", name = "i", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!mt", name = "r", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!mt", name = "n", descriptor = "I")
    public static int field7321;

    @OriginalMember(owner = "client!mt", name = "g", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!mt", name = "q", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!mt", name = "l", descriptor = "I")
    public static int field7325;

    @OriginalMember(owner = "client!mt", name = "m", descriptor = "Ltb;")
    public static class392 field7322;

    @OriginalMember(owner = "client!mt", name = "<init>", descriptor = "(Lml;)V")
    public class501(class194 arg0) {
        super(arg0);
        try {
            if (arg0.field2860) {
                this.field7317 = new class13(arg0, 2);
                this.field7317.method90(0, (byte) 126);
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1628(7681, 34165, 34162);
                super.field1301.method1669(770, 2, 34168, (byte) -126);
                super.field1301.method1650(0, (byte) -109, 770, 34167);
                OpenGL.glTexGeni(8192, 9472, 34066);
                OpenGL.glTexGeni(8193, 9472, 34066);
                OpenGL.glTexGeni(8194, 9472, 34066);
                OpenGL.glEnable(3168);
                OpenGL.glEnable(3169);
                OpenGL.glEnable(3170);
                super.field1301.method1619(0, (byte) 125);
                this.field7317.method87((byte) 103);
                this.field7317.method90(1, (byte) 68);
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1628(8448, 8448, 34162);
                super.field1301.method1669(770, 2, 34166, (byte) -118);
                super.field1301.method1650(0, (byte) -109, 770, 5890);
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                super.field1301.method1619(0, (byte) 125);
                this.field7317.method87((byte) 103);
            }
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7327[0] + (arg0 != null ? field7327[2] : field7327[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(Z)Z")
    public final boolean method677(boolean arg0) {
        try {
            if (!arg0) {
                method3838(11, 79, -52);
            }
            ++field7324;
            return true;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7327[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(IZLica;)V")
    public final void method679(int arg0, boolean arg1, class469 arg2) {
        try {
            if (arg1) {
                this.method681(false, -103, 5);
            }
            super.field1301.method1618((byte) 99, arg2);
            ++field7318;
            super.field1301.method1631(arg0, 7681);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7327[7] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field7327[2] : field7327[1]) + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZB)V")
    public final void method683(boolean arg0, byte arg1) {
        try {
            super.field1301.method1628(7681, 8448, 34162);
            if (arg1 == -54) {
                ++field7321;
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field7327[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZI)V")
    public final void method673(boolean arg0, int arg1) {
        try {
            ++field7325;
            class112 var3 = super.field1301.method1651((byte) -118);
            int var4 = 22 / ((36 - arg1) / 55);
            if (this.field7317 != null && var3 != null && arg0) {
                this.field7317.method88('\u0000', (byte) -112);
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) 122, var3);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field1301.field2795.method720((byte) -22), 0);
                OpenGL.glMatrixMode(5888);
                super.field1301.method1619(0, (byte) 125);
                this.field7315 = true;
            } else {
                super.field1301.method1650(0, (byte) -109, 770, 34168);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field7327[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(I)V")
    public final void method675(int arg0) {
        try {
            if (arg0 != -16265) {
                this.field7315 = true;
            }
            ++field7320;
            if (this.field7315) {
                this.field7317.method88('\u0001', (byte) -112);
                super.field1301.method1619(1, (byte) 125);
                super.field1301.method1618((byte) -1, (class469) null);
                super.field1301.method1619(0, (byte) 125);
            } else {
                super.field1301.method1650(0, (byte) -109, 770, 5890);
            }
            super.field1301.method1628(8448, 8448, 34162);
            this.field7315 = false;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field7327[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "c", descriptor = "(I)V")
    public static void method3837(int arg0) {
        try {
            field7322 = null;
            if (arg0 != 770) {
                method3838(-47, -86, 31);
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field7327[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(III)Llg;")
    public static final class656 method3838(int arg0, int arg1, int arg2) {
        class621 var3 = class608.field8715[arg0][arg1][arg2];
        return var3 == null ? null : var3.field8847;
    }

    @OriginalMember(owner = "client!mt", name = "a", descriptor = "(ZII)V")
    public final void method681(boolean arg0, int arg1, int arg2) {
        try {
            if (!arg0) {
                ++field7323;
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field7327[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3839(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 102);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mt", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3840(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 45;
                    break;
                case 2:
                    var10005 = 24;
                    break;
                case 3:
                    var10005 = 78;
                    break;
                default:
                    var10005 = 102;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
