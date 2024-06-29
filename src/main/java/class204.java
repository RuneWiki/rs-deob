import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class204 extends class758 {

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "Lffa;")
    private class197 field3157;

    @OriginalMember(owner = "client!ru", name = "p", descriptor = "Lod;")
    private class532 field3167;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3169 = new String[] { method1819(method1818("S:*Iu")), method1819(method1818("S:*Nu")), method1819(method1818("Za*! ")), method1819(method1818("S:*34O&p1u")), method1819(method1818("O:hc")), method1819(method1818("S:*Eu")), method1819(method1818("S:*Ju")), method1819(method1818("S:*Hu")), method1819(method1818("S:*Gu")), method1819(method1818("S:*Fu")) };

    @OriginalMember(owner = "client!ru", name = "n", descriptor = "[I")
    public static int[] field3164 = new int[13];

    @OriginalMember(owner = "client!ru", name = "l", descriptor = "I")
    public static int field3165 = -1;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field3166 = 0;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Z")
    public static boolean field3168 = false;

    @OriginalMember(owner = "client!ru", name = "k", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!ru", name = "m", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!ru", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!ru", name = "q", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field3162;

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field3163;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lod;BFLod;)Z")
    public final boolean method1811(class532 arg0, byte arg1, float arg2, class532 arg3) {
        try {
            field3163++;
            boolean var5 = true;
            class156 var6 = this.field3157.field2933;
            this.field3157.method543(class39.field458);
            this.field3157.method553();
            this.field3157.method1685(-78);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, this.field3167.field7805, this.field3167.field7805);
            this.field3157.method1698(arg1 ^ 0xFFFFFFAA, false);
            this.field3157.method1706(105, false);
            this.field3157.method1681(false, true);
            this.field3157.method1680(false, -32);
            this.field3157.method1729((byte) -101, -2);
            this.field3157.method1716(33984, 1);
            this.field3157.method1723(0.0F, arg2, (byte) 53, 0.0F, 0.0F);
            this.field3157.method1684((byte) -61, 34165, 34165);
            this.field3157.method1733(arg3, arg1 + 17125);
            this.field3157.method1716(33984, 0);
            this.field3157.method1753(arg1 - 112, 1);
            this.field3157.method1733(arg0, 17237);
            this.field3157.method1755(var6, 0);
            for (int var7 = 0; var7 < 6; var7++) {
                int var8 = var7 + 34069;
                var6.method1306(0, var8, -3, this.field3167);
                var6.method1303(0, -4356);
                if (!var6.method1309((byte) 37)) {
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
            var6.method1300((byte) 41, 0);
            if (arg1 != 112) {
                this.field3157 = null;
            }
            this.field3157.method1746(var6, (byte) 120);
            this.field3157.method1716(arg1 + 33872, 1);
            this.field3157.method1733(null, 17237);
            this.field3157.method1684((byte) -61, 8448, 8448);
            this.field3157.method1716(33984, 0);
            this.field3157.method1733(null, arg1 ^ 0x4325);
            OpenGL.glPopAttrib();
            this.field3157.method489(class39.field458[0], class39.field458[1], class39.field458[2], class39.field458[3]);
            if (var5 && !this.field3157.field2914) {
                this.field3167.method3928(-46);
            }
            return var5;
        } catch (RuntimeException var11) {
            throw class759.method5498(var11, field3169[7] + (arg0 == null ? field3169[4] : field3169[2]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field3169[4] : field3169[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)V")
    public static final void method1812(int arg0) {
        try {
            field3161++;
            class313 var1 = class196.method1670((long) arg0, 15, arg0 + 120);
            var1.method2635(true);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field3169[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "(I)V")
    public static void method1813(int arg0) {
        try {
            field3164 = null;
            if (arg0 != 6408) {
                field3164 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3169[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Lod;")
    public final class532 method1814(int arg0) {
        try {
            field3162++;
            int var2 = -7 / ((arg0 + 67) / 39);
            return this.field3167;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3169[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)I")
    public final int method1815(byte arg0) {
        try {
            field3160++;
            int var2 = 98 / ((arg0 + 9) / 50);
            return this.field3167.field7805;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3169[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V")
    public static final void method1816(byte arg0) {
        try {
            class601.field8821.method1569(10574);
            field3158++;
            class417.field6157.method1569(10574);
            class38.field446.method1569(10574);
            if (arg0 <= 14) {
                field3164 = null;
            }
            class356.field5473.method1569(10574);
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field3169[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1817(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            int var10 = arg2 & 0x3;
            field3159++;
            if ((arg5 & 0x1) == 1) {
                int var7 = arg0;
                arg0 = arg1;
                arg1 = var7;
            }
            if (var10 == 0) {
                return arg3;
            } else if (var10 == 1) {
                return arg6;
            } else if (var10 == 2) {
                return 7 - arg3 - (arg0 + -1);
            } else {
                if (arg4 != 15) {
                    field3166 = -51;
                }
                return 1 + 7 - arg1 - arg6;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field3169[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lffa;I)V")
    public class204(class197 arg0, int arg1) {
        try {
            this.field3157 = arg0;
            this.field3167 = new class532(arg0, 6408, arg1);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field3169[3] + (arg0 == null ? field3169[4] : field3169[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1818(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1819(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 33;
                    break;
                case 1:
                    var10005 = 79;
                    break;
                case 2:
                    var10005 = 4;
                    break;
                case 3:
                    var10005 = 15;
                    break;
                default:
                    var10005 = 93;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
