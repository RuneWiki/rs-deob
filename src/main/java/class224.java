import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public abstract class class224 implements class736 {

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "Z")
    private boolean field3514 = false;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "Z")
    private boolean field3520;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "Lvf;")
    public class159 field3517;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field3507;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field3516;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public int field3515;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field3524 = new String[] { method1976(method1975("{a\u0003:v")), method1976(method1975("{a\u0003;v")), method1976(method1975("{a\u0003%v")), method1976(method1975("{a\u00038v")), method1976(method1975("{a\u0003&v")), method1976(method1975("{a\u0003\u00117rbA\u001e$y+")), method1976(method1975("{a\u00039v")), method1976(method1975("{a\u0003#v")), method1976(method1975("{a\u0003$v")), method1976(method1975("{a\u0003K7rjYIv")), method1976(method1975("rvA\u001b")), method1976(method1975("g-\u0003Y#")), method1976(method1975("{a\u0003'v")) };

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "F")
    public static float field3511;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "[[[B")
    public static byte[][][] field3519;

    @OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            this.method1970((byte) -54);
            field3508++;
            super.finalize();
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3524[5] + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    private final void method1966(int arg0, int arg1) {
        try {
            if (arg1 == 0) {
                this.field3517.field2406 -= arg0;
                field3523++;
                this.field3517.field2406 += this.method1968(false);
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3524[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZ)V")
    public final void method1967(int arg0, boolean arg1) {
        try {
            field3509++;
            int var3 = -79 % ((arg0 + 62) / 57);
            if (this.field3514 != arg1) {
                this.field3514 = arg1;
                this.method1972((byte) -83);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3524[4] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)I")
    private final int method1968(boolean arg0) {
        try {
            field3506++;
            if (arg0) {
                this.field3516 = 123;
            }
            int var2 = this.field3517.method1480((byte) -70, this.field3516) * this.field3513;
            return this.field3520 ? var2 * 4 / 3 : var2;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3524[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
    public static void method1969(int arg0) {
        try {
            if (arg0 == 30499) {
                field3519 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3524[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
    public final void method1970(byte arg0) {
        try {
            field3521++;
            if (arg0 != -54) {
                this.method1974(true, true);
            }
            if (this.field3515 > 0) {
                this.field3517.method1466(6407, this.method1968(false), this.field3515);
                this.field3515 = 0;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3524[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)Z")
    public final boolean method1971(int arg0) {
        try {
            if (arg0 != 9984) {
                return false;
            }
            field3518++;
            if (!this.field3517.field2532) {
                return false;
            }
            int var2 = this.method1968(false);
            this.field3517.method1497(this, true);
            OpenGL.glGenerateMipmapEXT(this.field3507);
            this.field3520 = true;
            this.method1972((byte) -115);
            this.method1966(var2, 0);
            return true;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3524[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
    private final void method1972(byte arg0) {
        try {
            field3512++;
            this.field3517.method1497(this, true);
            if (arg0 < -67) {
                if (this.field3514) {
                    OpenGL.glTexParameteri(this.field3507, 10241, this.field3520 ? 9987 : 9729);
                    OpenGL.glTexParameteri(this.field3507, 10240, 9729);
                } else {
                    OpenGL.glTexParameteri(this.field3507, 10241, this.field3520 ? 9984 : 9728);
                    OpenGL.glTexParameteri(this.field3507, 10240, 9728);
                }
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3524[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "(I)I")
    public final int method1973(int arg0) {
        try {
            field3510++;
            return arg0 == 9728 ? this.field3515 : 51;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3524[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lvf;IIIZ)V")
    public class224(class159 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            this.field3520 = arg4;
            this.field3517 = arg0;
            this.field3507 = arg1;
            this.field3513 = arg3;
            this.field3516 = arg2;
            OpenGL.glGenTextures(1, class173.field2770, 0);
            this.field3515 = class173.field2770[0];
            this.method1966(0, 0);
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3524[9] + (arg0 == null ? field3524[10] : field3524[11]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZZ)V")
    public final void method1974(boolean arg0, boolean arg1) {
        try {
            if (!arg1) {
                this.field3514 = true;
            }
            if (arg0 != this.field3520) {
                int var3 = this.method1968(false);
                this.field3520 = true;
                this.method1972((byte) -127);
                this.method1966(var3, 0);
            }
            field3522++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field3524[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public abstract void method86(int arg0);

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1975(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x5E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1976(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 28;
                    break;
                case 1:
                    var10005 = 3;
                    break;
                case 2:
                    var10005 = 45;
                    break;
                case 3:
                    var10005 = 119;
                    break;
                default:
                    var10005 = 94;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
