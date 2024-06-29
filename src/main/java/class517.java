import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public abstract class class517 implements class482 {

    @OriginalMember(owner = "client!mw", name = "i", descriptor = "Z")
    private boolean field7480 = false;

    @OriginalMember(owner = "client!mw", name = "t", descriptor = "I")
    public int field7473;

    @OriginalMember(owner = "client!mw", name = "m", descriptor = "Z")
    private boolean field7470;

    @OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
    private int field7479;

    @OriginalMember(owner = "client!mw", name = "s", descriptor = "I")
    public int field7464;

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "Lffa;")
    public class197 field7474;

    @OriginalMember(owner = "client!mw", name = "k", descriptor = "I")
    public int field7463;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field7485 = new String[] { method3933(method3932("u\"\")\u0014v<x+U")), method3933(method3932("c{\";\u0000")), method3933(method3932("v `y")), method3933(method3932("u\"\"@U")), method3933(method3932("u\"\"XU")), method3933(method3932("u\"\"AU")), method3933(method3932("u\"\"^U")), method3933(method3932("u\"\"EU")), method3933(method3932("u\"\"DU")), method3933(method3932("u\"\"GU")), method3933(method3932("u\"\"FU")), method3933(method3932("u\"\"[U")), method3933(method3932("u\"\"YU")), method3933(method3932("u\"\"s\u0014v4`|\u0007}}")), method3933(method3932("u\"\"ZU")) };

    @OriginalMember(owner = "client!mw", name = "q", descriptor = "Lwia;")
    public static class790 field7478 = new class790(72, 3);

    @OriginalMember(owner = "client!mw", name = "h", descriptor = "I")
    public static int field7482 = 0;

    @OriginalMember(owner = "client!mw", name = "j", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!mw", name = "g", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
    public static int field7467;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "I")
    public static int field7469;

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "I")
    public static int field7471;

    @OriginalMember(owner = "client!mw", name = "o", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!mw", name = "r", descriptor = "I")
    public static int field7475;

    @OriginalMember(owner = "client!mw", name = "l", descriptor = "I")
    public static int field7476;

    @OriginalMember(owner = "client!mw", name = "f", descriptor = "I")
    public static int field7477;

    @OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!mw", name = "v", descriptor = "I")
    public static int field7483;

    @OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(B)I")
    public final int method3921(byte arg0) {
        try {
            if (arg0 < 71) {
                this.method3928(-76);
            }
            field7469++;
            return this.field7463;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7485[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        try {
            field7466++;
            this.method3922(123);
            super.finalize();
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7485[13] + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V")
    public final void method3922(int arg0) {
        try {
            field7467++;
            if (this.field7463 > 0) {
                this.field7474.method1751(2, this.method3927((byte) -127), this.field7463);
                this.field7463 = 0;
            }
            if (arg0 <= 73) {
                method3924(43);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7485[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(IZ)V")
    public final void method3923(int arg0, boolean arg1) {
        try {
            if (arg0 == 25768) {
                field7472++;
                if (this.field7480 != arg1) {
                    this.field7480 = arg1;
                    this.method3926((byte) 53);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7485[14] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
    public static void method3924(int arg0) {
        try {
            field7478 = null;
            if (arg0 <= 3) {
                method3930(null, (byte) 3);
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field7485[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(BI)Laha;")
    public static final class400 method3925(byte arg0, int arg1) {
        try {
            field7468++;
            if (arg1 >= 0 && arg1 < 100) {
                if (arg0 != 87) {
                    method3925((byte) 99, 124);
                }
                return class418.field6164[arg1];
            } else {
                return null;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7485[10] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "b", descriptor = "(B)V")
    private final void method3926(byte arg0) {
        try {
            field7481++;
            this.field7474.method1733(this, 17237);
            if (arg0 != 53) {
                field7482 = 55;
            }
            if (this.field7480) {
                OpenGL.glTexParameteri(this.field7473, 10241, this.field7470 ? 9987 : 9729);
                OpenGL.glTexParameteri(this.field7473, 10240, 9729);
            } else {
                OpenGL.glTexParameteri(this.field7473, 10241, this.field7470 ? 9984 : 9728);
                OpenGL.glTexParameteri(this.field7473, 10240, 9728);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field7485[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)I")
    private final int method3927(byte arg0) {
        try {
            field7477++;
            int var2 = this.field7474.method1709(this.field7464, -6403) * this.field7479;
            if (arg0 > -125) {
                field7482 = 86;
            }
            return this.field7470 ? var2 * 4 / 3 : var2;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7485[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)Z")
    public final boolean method3928(int arg0) {
        try {
            if (arg0 > -5) {
                return true;
            }
            field7465++;
            if (!this.field7474.field2983) {
                return false;
            }
            int var2 = this.method3927((byte) -128);
            this.field7474.method1733(this, 17237);
            OpenGL.glGenerateMipmapEXT(this.field7473);
            this.field7470 = true;
            this.method3926((byte) 53);
            this.method3931(var2, -68);
            return true;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7485[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IZ)V")
    public final void method3929(int arg0, boolean arg1) {
        try {
            field7475++;
            if (arg1 != this.field7470) {
                int var3 = this.method3927((byte) -127);
                this.field7470 = true;
                this.method3926((byte) 53);
                this.method3931(var3, -86);
            }
            if (arg0 != -1) {
                this.method3926((byte) 120);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field7485[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method3930(String arg0, byte arg1) {
        try {
            int var2 = 51 % ((68 - arg1) / 48);
            field7476++;
            return class343.field5324.containsKey(arg0);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7485[4] + (arg0 == null ? field7485[2] : field7485[1]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(II)V")
    private final void method3931(int arg0, int arg1) {
        try {
            field7471++;
            this.field7474.field2866 -= arg0;
            this.field7474.field2866 += this.method3927((byte) -128);
            if (arg1 > -64) {
                this.field7464 = -58;
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field7485[9] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lffa;IIIZ)V")
    public class517(class197 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        try {
            this.field7473 = arg1;
            this.field7470 = arg4;
            this.field7479 = arg3;
            this.field7464 = arg2;
            this.field7474 = arg0;
            OpenGL.glGenTextures(1, class523.field7644, 0);
            this.field7463 = class523.field7644[0];
            this.method3931(0, -102);
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field7485[0] + (arg0 == null ? field7485[2] : field7485[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public abstract void method705(int arg0);

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3932(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x7D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3933(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 24;
                    break;
                case 1:
                    var10005 = 85;
                    break;
                case 2:
                    var10005 = 12;
                    break;
                case 3:
                    var10005 = 21;
                    break;
                default:
                    var10005 = 125;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
