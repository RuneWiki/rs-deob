import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class153 extends class211 {

    @OriginalMember(owner = "client!wk", name = "M", descriptor = "I")
    private int field1884 = 3216;

    @OriginalMember(owner = "client!wk", name = "F", descriptor = "I")
    private int field1885 = 4096;

    @OriginalMember(owner = "client!wk", name = "Q", descriptor = "[I")
    private int[] field1886 = new int[3];

    @OriginalMember(owner = "client!wk", name = "D", descriptor = "I")
    private int field1889 = 3216;

    @OriginalMember(owner = "client!wk", name = "H", descriptor = "[Ljava/lang/String;")
    private static final String[] field1895 = new String[] { method1285(method1284("G\u0019e*J")), method1285(method1284("G\u0019e J")), method1285(method1284("G\u0019e$J")), method1285(method1284("G\u0019e#J")), method1285(method1284("G\u0019e%J")), method1285(method1284("G\u0019e\"J")), method1285(method1284("^\u0007'\r")), method1285(method1284("K\\eO\u001f")) };

    @OriginalMember(owner = "client!wk", name = "C", descriptor = "Lwia;")
    public static class790 field1883 = new class790(87, 8);

    @OriginalMember(owner = "client!wk", name = "G", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!wk", name = "I", descriptor = "I")
    public static int field1893 = -1;

    @OriginalMember(owner = "client!wk", name = "J", descriptor = "I")
    public static int field1894 = -1;

    @OriginalMember(owner = "client!wk", name = "E", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!wk", name = "O", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!wk", name = "N", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!wk", name = "P", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!wk", name = "K", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IZZ)V")
    public static final void method1281(int arg0, boolean arg1, boolean arg2) {
        try {
            if (!arg2) {
                field1892 = 32;
            }
            ++field1882;
            class495 var3 = class668.method4916(arg0, arg1, 3);
            if (var3 != null) {
                var3.method1824(1);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field1895[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public final void method437(int arg0) {
        try {
            ++field1890;
            if (arg0 == 27132) {
                this.method1283(-1);
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field1895[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field1884 = arg2.method1445((byte) 125);
                    }
                } else {
                    this.field1889 = arg2.method1445((byte) 122);
                }
            } else {
                this.field1885 = arg2.method1445((byte) 121);
            }
            if (arg0 <= 67) {
                method1281(-20, false, false);
            }
            ++field1888;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1895[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1895[7] : field1895[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(II)[I")
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field1887;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int var4 = class264.field4044 * this.field1885 >> 12;
                int[] var5 = this.method1856(0, class484.field6992 & arg1 + -1, 47);
                int[] var6 = this.method1856(0, arg1, 107);
                int[] var7 = this.method1856(0, arg1 - -1 & class484.field6992, arg0 ^ 8192);
                for (int var8 = 0; class343.field5332 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[class3.field28 & var8 + -1] + -var6[class3.field28 & var8 + 1]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (var11 < 0) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = class215.field3278[((var12 - -1) * var12 >> 1) + var11] & 255;
                    int var14 = var10 * var13 >> 8;
                    int var15 = var13 * 4096 >> 8;
                    int var16 = var9 * var13 >> 8;
                    int var17 = this.field1886[2] * var15 >> 12;
                    int var18 = this.field1886[1] * var16 >> 12;
                    int var19 = this.field1886[0] * var14 >> 12;
                    var3[var8] = var19 - (-var17 + -var18);
                }
            }
            if (arg0 != 8217) {
                this.field1889 = 51;
            }
            return var3;
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field1895[3] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "()V")
    public class153() {
        super(1, true);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(Z)V")
    public static void method1282(boolean arg0) {
        try {
            field1883 = null;
            if (arg0) {
                field1893 = -113;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1895[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    private final void method1283(int arg0) {
        try {
            ++field1891;
            double var2 = Math.cos((double) ((float) this.field1884 / 4096.0F));
            this.field1886[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field1889 / 4096.0F)));
            this.field1886[1] = (int) (Math.cos((double) ((float) this.field1889 / 4096.0F)) * var2 * 4096.0D);
            this.field1886[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1884 / 4096.0F)));
            int var4 = this.field1886[0] * this.field1886[0] >> 12;
            int var5 = this.field1886[1] * this.field1886[1] >> 12;
            int var6 = this.field1886[2] * this.field1886[2] >> 12;
            int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
            if (~var7 != arg0) {
                this.field1886[0] = (this.field1886[0] << 12) / var7;
                this.field1886[1] = (this.field1886[1] << 12) / var7;
                this.field1886[2] = (this.field1886[2] << 12) / var7;
            }
        } catch (RuntimeException var9) {
            throw class759.method5498(var9, field1895[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1284(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 98);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1285(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 48;
                    break;
                case 1:
                    var10005 = 114;
                    break;
                case 2:
                    var10005 = 75;
                    break;
                case 3:
                    var10005 = 97;
                    break;
                default:
                    var10005 = 98;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
