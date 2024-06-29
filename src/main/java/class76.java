import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class76 {

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    private int field1849;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "[[I")
    private int[][] field1843;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "I")
    private int field1840;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field1841 = 0;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lpd;")
    private static class94 field1839 = class28.method249(-60, "red:");

    @OriginalMember(owner = "client!md", name = "l", descriptor = "Lpd;")
    public static class94 field1850 = field1839;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "Lpd;")
    private static class94 field1858 = class28.method249(-98, "wave:");

    @OriginalMember(owner = "client!md", name = "u", descriptor = "Lpd;")
    public static class94 field1859 = class28.method249(40, " ");

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lpd;")
    public static class94 field1855 = null;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "Lpd;")
    public static class94 field1848 = field1858;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!md", name = "f", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!md", name = "h", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "Ls;")
    public static class111 field1845;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "Ls;")
    public static class111 field1853;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "[I")
    public static int[] field1852;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V", line = 21)
    public static final void method564(boolean arg0) {
        field1846++;
        if (class1.field47 != null) {
            class1.field47.method636(1);
            class1.field47 = null;
        }
        class101.method758((byte) -123);
        class64.field1585.method190();
        for (int var1 = 0; var1 < 4; var1++) {
            class12.field311[var1].method653((byte) 126);
        }
        System.gc();
        class123.method971(19405, 10);
        class36.field946 = -1;
        if (!arg0) {
            class103.field2595 = 0;
            class122.method951(-6983);
            class1.method6(false, 10);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BI)[B", line = 58)
    public final byte[] method565(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            this.field1849 = -26;
        }
        if (this.field1843 != null) {
            int var3 = (int) ((long) arg0.length * (long) this.field1840 / (long) this.field1849) + 14;
            int[] var4 = new int[var3];
            int var5 = 0;
            int var6 = 0;
            for (int var7 = 0; var7 < arg0.length; var7++) {
                byte var10 = arg0[var7];
                int[] var11 = this.field1843[var6];
                for (int var12 = 0; var12 < 14; var12++) {
                    var4[var5 + var12] += var11[var12] * var10;
                }
                int var13 = this.field1840 + var6;
                int var14 = var13 / this.field1849;
                var5 += var14;
                var6 = var13 - this.field1849 * var14;
            }
            arg0 = new byte[var3];
            for (int var8 = 0; var8 < var3; var8++) {
                int var9 = var4[var8] + 32768 >> 16;
                if (var9 < -128) {
                    arg0[var8] = -128;
                } else if (var9 > 127) {
                    arg0[var8] = 127;
                } else {
                    arg0[var8] = (byte) var9;
                }
            }
        }
        field1844++;
        return arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IB)I", line = 132)
    public final int method566(int arg0, byte arg1) {
        if (arg1 != 102) {
            method568(0);
        }
        field1854++;
        if (this.field1843 != null) {
            arg0 = (int) ((long) this.field1840 * (long) arg0 / (long) this.field1849);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)Lc;", line = 147)
    public static final class16 method567(byte arg0) {
        if (arg0 == -13) {
            class16 var1 = new class16(class21.field585, class17.field442, class100.field2543, class13.field331, class63.field1561);
            field1856++;
            class1.method3(71);
            return var1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V", line = 162)
    public static final void method568(int arg0) {
        class50.field1261.method1013(-1);
        if (arg0 < 57) {
            method568(-68);
        }
        field1857++;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(IB)I", line = 173)
    public final int method569(int arg0, byte arg1) {
        if (arg1 != -23) {
            field1839 = null;
        }
        if (this.field1843 != null) {
            arg0 = (int) ((long) this.field1840 * (long) arg0 / (long) this.field1849) + 6;
        }
        field1847++;
        return arg0;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)V", line = 193)
    public static void method570(int arg0) {
        field1853 = null;
        field1858 = null;
        field1855 = null;
        field1848 = null;
        field1845 = null;
        if (arg0 < -49) {
            field1859 = null;
            field1839 = null;
            field1850 = null;
            field1852 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILpd;)V", line = 216)
    public static final void method571(int arg0, class94 arg1) {
        if (arg0 != -1) {
            return;
        }
        field1842++;
        if (arg1 == null || arg1.method710(-123) == 0) {
            class126.field3162 = 0;
            return;
        }
        class94[] var2 = new class94[100];
        class94 var3 = arg1;
        int var4 = 0;
        while (true) {
            int var5 = var3.method702(32, arg0 ^ 0xFFFFF21A);
            if (var5 == -1) {
                class94 var6 = var3.method718(11083);
                if (var6.method710(arg0 - 122) > 0) {
                    var2[var4++] = var6.method723((byte) 46);
                }
                class126.field3162 = 0;
                label50: for (int var7 = 0; var7 < class80.field2034; var7++) {
                    class110 var8 = class39.method295(var7, arg0 ^ 0xFFFFFFFE);
                    if (var8.field2710 == -1 && var8.field2713 != null) {
                        class94 var9 = var8.field2713.method723((byte) 46);
                        for (int var10 = 0; var10 < var4; var10++) {
                            if (var9.method711(-34, var2[var10]) == -1) {
                                continue label50;
                            }
                        }
                        class13.field322[class126.field3162] = var9;
                        class63.field1548[class126.field3162] = var7;
                        class126.field3162++;
                        if (class13.field322.length <= class126.field3162) {
                            return;
                        }
                    }
                }
                return;
            }
            class94 var11 = var3.method706(var5, (byte) 116, 0).method718(arg0 ^ 0xFFFFD4B4);
            if (var11.method710(-123) > 0) {
                var2[var4++] = var11.method723((byte) 46);
            }
            var3 = var3.method687(var5 + 1, -123);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(II)V", line = 309)
    public class76(int arg0, int arg1) {
        if (arg0 != arg1) {
            int var3 = class63.method467(arg1, arg0, true);
            int var4 = arg0 / var3;
            this.field1849 = var4;
            this.field1843 = new int[var4][14];
            int var5 = arg1 / var3;
            this.field1840 = var5;
            for (int var6 = 0; var6 < var4; var6++) {
                int[] var7 = this.field1843[var6];
                double var8 = (double) var6 / (double) var4 + 6.0D;
                int var10 = (int) Math.floor(var8 + 1.0D - 7.0D);
                if (var10 < 0) {
                    var10 = 0;
                }
                int var11 = (int) Math.ceil(var8 + 7.0D);
                if (var11 > 14) {
                    var11 = 14;
                }
                double var12 = (double) var5 / (double) var4;
                while (var11 > var10) {
                    double var14 = var12;
                    double var16 = ((double) var10 - var8) * 3.141592653589793D;
                    if (var16 < -1.0E-4D || var16 > 1.0E-4D) {
                        var14 = var12 * (Math.sin(var16) / var16);
                    }
                    double var18 = var14 * (Math.cos(((double) var10 - var8) * 0.2243994752564138D) * 0.46D + 0.54D);
                    var7[var10] = (int) Math.floor(var18 * 65536.0D + 0.5D);
                    var10++;
                }
            }
        }
    }
}
