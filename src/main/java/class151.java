import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class151 extends class211 {

    @OriginalMember(owner = "client!ls", name = "K", descriptor = "Z")
    private boolean field1861 = true;

    @OriginalMember(owner = "client!ls", name = "H", descriptor = "Z")
    private boolean field1865 = true;

    @OriginalMember(owner = "client!ls", name = "M", descriptor = "[Ljava/lang/String;")
    private static final String[] field1870 = new String[] { method1272(method1271("5\u0012tqp")), method1272(method1271("5\u0012tzp")), method1272(method1271("5\u0012trp")), method1272(method1271("5\u0012twp")), method1272(method1271("\"Ot\u001d%")), method1272(method1271("5\u0012tpp")), method1272(method1271("7\u00146_")) };

    @OriginalMember(owner = "client!ls", name = "E", descriptor = "[I")
    public static int[] field1867 = null;

    @OriginalMember(owner = "client!ls", name = "D", descriptor = "[I")
    public static int[] field1864 = new int[32];

    @OriginalMember(owner = "client!ls", name = "C", descriptor = "[I")
    public static int[] field1869 = new int[8];

    @OriginalMember(owner = "client!ls", name = "G", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!ls", name = "I", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ls", name = "F", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ls", name = "J", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ls", name = "L", descriptor = "[I")
    public static int[] field1862;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZJ)V", line = 3)
    public static final void method1269(boolean arg0, long arg1) {
        try {
            ++field1866;
            if (arg1 > 0L) {
                if (arg0) {
                    field1867 = null;
                }
                if (arg1 % 10L == 0L) {
                    class772.method5589(arg1 + -1L, (byte) 120);
                    class772.method5589(1L, (byte) 120);
                } else {
                    class772.method5589(arg1, (byte) 120);
                }
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field1870[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(II)[I", line = 26)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field1863;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (super.field3231.field57) {
                int[] var4 = this.method1856(0, !this.field1865 ? arg1 : -arg1 + class484.field6992, 97);
                if (this.field1861) {
                    for (int var5 = 0; ~var5 > ~class343.field5332; ++var5) {
                        var3[var5] = var4[-var5 + class3.field28];
                    }
                } else {
                    class467.method3553(var4, 0, var3, 0, class343.field5332);
                }
            }
            if (arg0 != 8217) {
                field1862 = null;
            }
            return var3;
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field1870[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "<init>", descriptor = "()V", line = 67)
    public class151() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(II)[[I", line = 71)
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 > -38) {
                field1867 = null;
            }
            ++field1868;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[][] var4 = this.method1853(0, 0, !this.field1865 ? arg0 : class484.field6992 - arg0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                if (!this.field1861) {
                    for (int var11 = 0; ~class343.field5332 < ~var11; ++var11) {
                        var8[var11] = var5[var11];
                        var9[var11] = var6[var11];
                        var10[var11] = var7[var11];
                    }
                } else {
                    for (int var12 = 0; ~var12 > ~class343.field5332; ++var12) {
                        var8[var12] = var5[class3.field28 - var12];
                        var9[var12] = var6[-var12 + class3.field28];
                        var10[var12] = var7[-var12 + class3.field28];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field1870[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V", line = 141)
    public static void method1270(int arg0) {
        try {
            field1867 = null;
            field1864 = null;
            field1869 = null;
            field1862 = null;
            if (arg0 != 0) {
                field1869 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field1870[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BILib;)V", line = 168)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 <= 67) {
                this.method197(-98, 11);
            }
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        super.field3235 = ~arg2.method1455((byte) 62) == -2;
                    }
                } else {
                    this.field1865 = arg2.method1455((byte) 62) == 1;
                }
            } else {
                this.field1861 = ~arg2.method1455((byte) 62) == -2;
            }
            ++field1860;
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field1870[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field1870[4] : field1870[6]) + ')');
        }
    }

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1271(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 88);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ls", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1272(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 97;
                    break;
                case 2:
                    var10005 = 90;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 88;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
