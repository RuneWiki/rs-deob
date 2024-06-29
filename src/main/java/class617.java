import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class617 {

    @OriginalMember(owner = "client!ot", name = "i", descriptor = "I")
    public int field8914 = 0;

    @OriginalMember(owner = "client!ot", name = "w", descriptor = "I")
    public int field8901 = 0;

    @OriginalMember(owner = "client!ot", name = "q", descriptor = "Z")
    private boolean field8908 = false;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field8921 = new String[] { method4510(method4509("\u0011r+S6")), method4510(method4509("\u0010si}")), method4510(method4509("\u0005(+?c")), method4510(method4509("\u0011r+P6")), method4510(method4509("\u0011r+T6")), method4510(method4509("\u0011r+U6")), method4510(method4509("\u0011r+W6")), method4510(method4509("\u0011r+R6")) };

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "Lvn;")
    public static class330 field8915 = new class330(5, -1);

    @OriginalMember(owner = "client!ot", name = "j", descriptor = "I")
    public int field8898;

    @OriginalMember(owner = "client!ot", name = "t", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!ot", name = "k", descriptor = "I")
    public static int field8900;

    @OriginalMember(owner = "client!ot", name = "l", descriptor = "I")
    public int field8902;

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!ot", name = "o", descriptor = "I")
    private int field8904;

    @OriginalMember(owner = "client!ot", name = "g", descriptor = "I")
    public int field8905;

    @OriginalMember(owner = "client!ot", name = "u", descriptor = "I")
    public static int field8906;

    @OriginalMember(owner = "client!ot", name = "v", descriptor = "I")
    public int field8907;

    @OriginalMember(owner = "client!ot", name = "d", descriptor = "I")
    public int field8911;

    @OriginalMember(owner = "client!ot", name = "s", descriptor = "I")
    public int field8912;

    @OriginalMember(owner = "client!ot", name = "f", descriptor = "I")
    public int field8913;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!ot", name = "h", descriptor = "I")
    public static int field8918;

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "I")
    public int field8919;

    @OriginalMember(owner = "client!ot", name = "e", descriptor = "I")
    public int field8920;

    @OriginalMember(owner = "client!ot", name = "p", descriptor = "J")
    public long field8909;

    @OriginalMember(owner = "client!ot", name = "n", descriptor = "Leea;")
    public static class140 field8917;

    @OriginalMember(owner = "client!ot", name = "r", descriptor = "Lha;")
    public static class63 field8910;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)V", line = 7)
    public final void method4503(boolean arg0) {
        try {
            field8918++;
            this.field8913 = class763.field11200[this.field8904 << 3];
            long var2 = (long) this.field8905;
            long var4 = (long) this.field8920;
            if (arg0) {
                this.field8908 = false;
            }
            long var6 = (long) this.field8919;
            this.field8907 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
            if (this.field8912 == 0) {
                this.field8912 = 1;
            }
            if (this.field8911 == 0) {
                this.field8909 = 2147483647L;
            } else if (this.field8911 == 1) {
                this.field8909 = (this.field8907 * 8 / this.field8912);
                this.field8909 *= this.field8909;
            } else if (this.field8911 == 2) {
                this.field8909 = (this.field8907 * 8 / this.field8912);
            }
            if (this.field8908) {
                this.field8907 *= -1;
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field8921[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IBLjava/io/File;)[B", line = 49)
    public static final byte[] method4504(int arg0, byte arg1, File arg2) {
        try {
            field8903++;
            try {
                int var3 = 41 % ((arg1 + 16) / 50);
                byte[] var4 = new byte[arg0];
                class514.method3858(var4, -12, arg2, arg0);
                return var4;
            } catch (IOException var6) {
                return null;
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field8921[3] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field8921[1] : field8921[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)V", line = 69)
    public static void method4505(int arg0) {
        try {
            field8917 = null;
            if (arg0 == -4) {
                field8915 = null;
                field8910 = null;
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field8921[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lwq;II)V", line = 83)
    private final void method4506(class176 arg0, int arg1, int arg2) {
        try {
            if (arg1 != -128433181) {
                this.field8913 = -1;
            }
            if (arg2 == 1) {
                this.field8904 = arg0.method1687((byte) -50);
            } else if (arg2 == 2) {
                arg0.method1645((byte) -103);
            } else if (arg2 == 3) {
                this.field8905 = arg0.method1622(-18712);
                this.field8920 = arg0.method1622(-18712);
                this.field8919 = arg0.method1622(-18712);
            } else if (arg2 == 4) {
                this.field8911 = arg0.method1645((byte) -116);
                this.field8912 = arg0.method1622(-18712);
            } else if (arg2 == 6) {
                this.field8902 = arg0.method1645((byte) -75);
            } else if (arg2 == 8) {
                this.field8914 = 1;
            } else if (arg2 == 9) {
                this.field8901 = 1;
            } else if (arg2 == 10) {
                this.field8908 = true;
            }
            field8906++;
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8921[5] + (arg0 == null ? field8921[1] : field8921[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(BLwq;)V", line = 146)
    public final void method4507(byte arg0, class176 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1645((byte) -127);
                if (var3 == 0) {
                    field8899++;
                    if (arg0 != 79) {
                        this.method4506(null, -110, -54);
                        return;
                    }
                    return;
                }
                this.method4506(arg1, -128433181, var3);
            }
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8921[0] + arg0 + ',' + (arg1 == null ? field8921[1] : field8921[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIB)Z", line = 169)
    public static final boolean method4508(int arg0, int arg1, byte arg2) {
        try {
            field8900++;
            int var3 = -110 % ((-arg2 - 35) / 32);
            return class309.method2653(-89, arg1, arg0) || class69.method736(arg1, arg0, -127);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field8921[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4509(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x1E);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4510(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 126;
                    break;
                case 1:
                    var10005 = 6;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 17;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
