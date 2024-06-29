import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class246 extends class344 {

    @OriginalMember(owner = "client!ida", name = "k", descriptor = "Z")
    private boolean field3805 = false;

    @OriginalMember(owner = "client!ida", name = "o", descriptor = "Lfga;")
    private class266 field3797;

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3809 = new String[] { method2117(method2116("h@B\u0001t)")), method2117(method2116("z\n\r\u0001O")), method2117(method2116("oQOC")), method2117(method2116("h@B\u0001v)")), method2117(method2116("h@B\u0001\u000ehJJ[\f)")), method2117(method2116("h@B\u0001s)")), method2117(method2116("h@B\u0001w)")), method2117(method2116("h@B\u0001u)")), method2117(method2116("h@B\u0001q)")), method2117(method2116("h@B\u0001z)")), method2117(method2116("h@B\u0001p)")) };

    @OriginalMember(owner = "client!ida", name = "r", descriptor = "[[I")
    public static int[][] field3801 = new int[128][128];

    @OriginalMember(owner = "client!ida", name = "m", descriptor = "B")
    public static byte field3803 = -6;

    @OriginalMember(owner = "client!ida", name = "l", descriptor = "Lhl;")
    public static class556 field3798 = new class556(65, 3);

    @OriginalMember(owner = "client!ida", name = "p", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!ida", name = "n", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!ida", name = "q", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!ida", name = "j", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Z)Z", line = 3)
    public final boolean method831(boolean arg0) {
        try {
            if (arg0) {
                this.method831(false);
            }
            ++field3804;
            return true;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3809[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(Z)V", line = 14)
    public static void method2114(boolean arg0) {
        try {
            field3801 = null;
            field3798 = null;
            if (!arg0) {
                field3798 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3809[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(ILvf;III)Lub;", line = 27)
    public static final class20 method2115(int arg0, class159 arg1, int arg2, int arg3, int arg4) {
        try {
            ++field3800;
            if (arg0 != 34037) {
                field3803 = 92;
            }
            if (arg1.field2513 || class46.method469(arg4, 1010) && class46.method469(arg3, 1010)) {
                return new class20(arg1, 3553, arg2, arg4, arg3);
            } else {
                return arg1.field2481 ? new class20(arg1, 34037, arg2, arg4, arg3) : new class20(arg1, arg2, arg4, arg3, class90.method883((byte) 118, arg4), class90.method883((byte) 111, arg3));
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3809[3] + arg0 + ',' + (arg1 != null ? field3809[1] : field3809[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(IZ)V", line = 52)
    public final void method834(int arg0, boolean arg1) {
        try {
            if (arg0 != 16) {
                this.method835(32, -120, 38);
            }
            ++field3807;
            class12 var3 = super.field5595.method1468((byte) 33);
            if (this.field3797 != null && var3 != null && arg1) {
                this.field3797.method2307(-1, '\u0000');
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497(var3, true);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadMatrixf(super.field5595.field2426.method4950(-89), 0);
                OpenGL.glMatrixMode(5888);
                super.field5595.method1432((byte) 3, 0);
                this.field3805 = true;
            } else {
                super.field5595.method1427(2, 34168, 770, 0);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3809[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(III)V", line = 80)
    public final void method835(int arg0, int arg1, int arg2) {
        try {
            ++field3799;
            if (arg1 != 16) {
                this.field3805 = true;
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3809[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V", line = 96)
    public final void method833(int arg0) {
        try {
            ++field3808;
            if (arg0 < 38) {
                this.method837((byte) 13, false);
            }
            if (!this.field3805) {
                super.field5595.method1427(2, 5890, 770, 0);
            } else {
                this.field3797.method2307(-1, '\u0001');
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1497((class224) null, true);
                super.field5595.method1432((byte) 3, 0);
            }
            super.field5595.method1492(8448, 8448, (byte) 17);
            this.field3805 = false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3809[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lgb;II)V", line = 119)
    public final void method836(class224 arg0, int arg1, int arg2) {
        try {
            if (arg2 == 16) {
                super.field5595.method1497(arg0, true);
                ++field3802;
                super.field5595.method1425((byte) 35, arg1);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3809[6] + (arg0 != null ? field3809[1] : field3809[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BZ)V", line = 134)
    public final void method837(byte arg0, boolean arg1) {
        try {
            ++field3806;
            super.field5595.method1492(7681, 8448, (byte) 17);
            if (arg0 >= -64) {
                this.method836((class224) null, 54, 112);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3809[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "<init>", descriptor = "(Lvf;)V", line = 146)
    public class246(class159 arg0) {
        super(arg0);
        try {
            if (arg0.field2450) {
                this.field3797 = new class266(arg0, 2);
                this.field3797.method2303(0, 8334);
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1492(7681, 34165, (byte) 17);
                super.field5595.method1456((byte) -101, 770, 34168, 2);
                super.field5595.method1427(2, 34167, 770, 0);
                OpenGL.glTexGeni(8192, 9472, 34066);
                OpenGL.glTexGeni(8193, 9472, 34066);
                OpenGL.glTexGeni(8194, 9472, 34066);
                OpenGL.glEnable(3168);
                OpenGL.glEnable(3169);
                OpenGL.glEnable(3170);
                super.field5595.method1432((byte) 3, 0);
                this.field3797.method2304(false);
                this.field3797.method2303(1, 8334);
                super.field5595.method1432((byte) 3, 1);
                super.field5595.method1492(8448, 8448, (byte) 17);
                super.field5595.method1456((byte) -101, 770, 34166, 2);
                super.field5595.method1427(2, 5890, 770, 0);
                OpenGL.glDisable(3168);
                OpenGL.glDisable(3169);
                OpenGL.glDisable(3170);
                OpenGL.glMatrixMode(5890);
                OpenGL.glLoadIdentity();
                OpenGL.glMatrixMode(5888);
                super.field5595.method1432((byte) 3, 0);
                this.field3797.method2304(false);
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3809[4] + (arg0 != null ? field3809[1] : field3809[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2116(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 50);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ida", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2117(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 1;
                    break;
                case 1:
                    var10005 = 36;
                    break;
                case 2:
                    var10005 = 35;
                    break;
                case 3:
                    var10005 = 47;
                    break;
                default:
                    var10005 = 50;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
