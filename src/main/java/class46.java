import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class46 extends class58 {

    @OriginalMember(owner = "client!lm", name = "v", descriptor = "Lml;")
    private class194 field651;

    @OriginalMember(owner = "client!lm", name = "t", descriptor = "Lgfa;")
    private class112 field656;

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field658 = new String[] { method497(method496("\u0019TK!z")), method497(method496("\u001bL\t\t")), method497(method496("\u000e\u0017KK/")), method497(method496("\u0019TK#z")), method497(method496("\u0019TK&z")), method497(method496("\u0019TK z")), method497(method496("\u0019TKY;\u001bP\u0011[z")), method497(method496("\u0019TK$z")), method497(method496("\u0019TK'z")) };

    @OriginalMember(owner = "client!lm", name = "s", descriptor = "Lu;")
    public static class741 field648 = new class741(method497(method496("\"m2,\u0002")), method497(method496("\u001a_\u0003\f1\u0010")), method497(method496("*N\f\u0015")), 3);

    @OriginalMember(owner = "client!lm", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field657 = new String[100];

    @OriginalMember(owner = "client!lm", name = "o", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!lm", name = "r", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!lm", name = "q", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!lm", name = "p", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)V", line = 3)
    public static void method490(int arg0) {
        try {
            field648 = null;
            if (arg0 > -62) {
                method492(48, null, 51, 73, 36, null, (byte) -25, -102, 97L);
            }
            field657 = null;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field658[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)Lgfa;", line = 17)
    public final class112 method491(byte arg0) {
        try {
            field649++;
            if (arg0 >= -95) {
                field657 = null;
            }
            return this.field656;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field658[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILaa;IIILvo;BIJ)V", line = 30)
    public static final void method492(int arg0, class685 arg1, int arg2, int arg3, int arg4, class782 arg5, byte arg6, int arg7, long arg8) {
        try {
            field650++;
            int var10 = arg4 * arg4 + (arg3 * arg3);
            if (arg8 >= (long) var10) {
                int var11 = Math.min(arg5.field11295 / 2, arg5.field11244 / 2);
                if (arg6 != 68) {
                    field657 = null;
                }
                if ((var11 * var11) < var10) {
                    var11 -= 10;
                    int var12;
                    if (class596.field8579 == 4) {
                        var12 = (int) class349.field5057 & 0x3FFF;
                    } else {
                        var12 = (int) class349.field5057 + class801.field11658 & 0x3FFF;
                    }
                    int var13 = class487.field7151[var12];
                    int var14 = class487.field7150[var12];
                    if (class596.field8579 != 4) {
                        var14 = var14 * 256 / (class398.field5794 + 256);
                        var13 = var13 * 256 / (class398.field5794 + 256);
                    }
                    int var15 = arg3 * var13 + arg4 * var14 >> 14;
                    int var16 = arg3 * var14 - (arg4 * var13) >> 14;
                    double var17 = Math.atan2((double) var15, (double) var16);
                    int var19 = (int) ((double) var11 * Math.sin(var17));
                    int var20 = (int) (Math.cos(var17) * (double) var11);
                    class565.field8251[arg2].method3076((float) arg5.field11295 / 2.0F + (float) arg7 + (float) var19, (float) arg5.field11244 / 2.0F + (float) arg0 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
                } else {
                    class620.method4560(arg1, arg5, class383.field5602[arg2], arg6 ^ 0x3FBB, arg0, arg4, arg7, arg3);
                }
            }
        } catch (RuntimeException var22) {
            throw class665.method4799(var22, field658[0] + arg0 + ',' + (arg1 == null ? field658[1] : field658[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field658[1] : field658[2]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I", line = 88)
    public final int method493(int arg0) {
        try {
            field652++;
            return arg0 == -546 ? this.field656.field1448 : 31;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field658[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Lml;I)V", line = 98)
    public class46(class194 arg0, int arg1) {
        try {
            this.field651 = arg0;
            this.field656 = new class112(arg0, 6408, arg1);
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field658[6] + (arg0 == null ? field658[1] : field658[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(IJB)Ljava/lang/String;", line = 107)
    public static final String method494(int arg0, long arg1, byte arg2) {
        try {
            class635.method4635(true, arg1);
            field653++;
            int var4 = class267.field3785.get(5);
            if (arg2 == -22) {
                int var5 = class267.field3785.get(2);
                int var6 = class267.field3785.get(1);
                return arg0 == 3 ? class40.method461(-21905, arg0, arg1) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class604.field8670[arg0][var5] + "-" + var6;
            } else {
                return null;
            }
        } catch (RuntimeException var8) {
            throw class665.method4799(var8, field658[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(FILgfa;Lgfa;)Z", line = 128)
    public final boolean method495(float arg0, int arg1, class112 arg2, class112 arg3) {
        try {
            if (arg1 != -15829) {
                this.method491((byte) 79);
            }
            field655++;
            boolean var5 = true;
            class513 var6 = this.field651.field2841;
            this.field651.method229(class507.field7446);
            this.field651.method240();
            this.field651.method1616((byte) 61);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glPushAttrib(2048);
            OpenGL.glViewport(0, 0, this.field656.field1448, this.field656.field1448);
            this.field651.method1673(8, false);
            this.field651.method1684(false, (byte) -17);
            this.field651.method1640(false, (byte) 127);
            this.field651.method1632(false, true);
            this.field651.method1625(arg1 ^ 0xFFFFC267, -2);
            this.field651.method1619(1, (byte) 125);
            this.field651.method1659(false, 0.0F, arg0, 0.0F, 0.0F);
            this.field651.method1628(34165, 34165, 34162);
            this.field651.method1618((byte) -124, arg2);
            this.field651.method1619(0, (byte) 125);
            this.field651.method1631(1, 7681);
            this.field651.method1618((byte) -117, arg3);
            this.field651.method1613((byte) 77, var6);
            for (int var7 = 0; var7 < 6; var7++) {
                int var8 = var7 + 34069;
                var6.method3918(this.field656, var8, -60, 0);
                var6.method3924(arg1 ^ 0xFFFFC22A, 0);
                if (!var6.method3923(true)) {
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
            var6.method3926(0, (byte) 78);
            this.field651.method1635(112, var6);
            this.field651.method1619(1, (byte) 125);
            this.field651.method1618((byte) -108, null);
            this.field651.method1628(8448, 8448, 34162);
            this.field651.method1619(0, (byte) 125);
            this.field651.method1618((byte) -111, null);
            OpenGL.glPopAttrib();
            this.field651.method208(class507.field7446[0], class507.field7446[1], class507.field7446[2], class507.field7446[3]);
            if (var5 && !this.field651.field2861) {
                this.field656.method3601(-1);
            }
            return var5;
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field658[4] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field658[1] : field658[2]) + ',' + (arg3 == null ? field658[1] : field658[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method496(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x52);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!lm", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method497(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 117;
                    break;
                case 1:
                    var10005 = 57;
                    break;
                case 2:
                    var10005 = 101;
                    break;
                case 3:
                    var10005 = 101;
                    break;
                default:
                    var10005 = 82;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
