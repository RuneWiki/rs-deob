import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 extends class286 {

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    private int field31 = 4096;

    @OriginalMember(owner = "client!pd", name = "V", descriptor = "I")
    private int field36 = 0;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field29 = -1;

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "[I")
    public static int[] field32 = new int[100];

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!pd", name = "S", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!pd", name = "T", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!pd", name = "W", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!pd", name = "X", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!pd", name = "U", descriptor = "[[Lsf;")
    public static class100[][] field35;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method14(int arg0, int arg1) {
        field28++;
        if (arg0 > -52) {
            this.method16(33, (byte) 82);
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 0, -1);
            for (int var5 = 0; var5 < class27.field410; var5++) {
                int var6 = var4[var5];
                if (this.field36 > var6) {
                    var3[var5] = this.field36;
                } else if (this.field31 < var6) {
                    var3[var5] = this.field31;
                } else {
                    var3[var5] = var6;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "()V", line = 46)
    public class3() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V", line = 57)
    public static void method15(boolean arg0) {
        field35 = (class100[][]) null;
        if (arg0) {
            method18((byte) 122);
        }
        field32 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)[[I", line = 69)
    public final int[][] method16(int arg0, byte arg1) {
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (arg1 != -19) {
            return (int[][]) ((int[][]) null);
        }
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(arg0, 0, false);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var4[0];
            for (int var11 = 0; var11 < class27.field410; var11++) {
                int var12 = var5[var11];
                int var13 = var10[var11];
                int var14 = var6[var11];
                if (this.field36 > var13) {
                    var8[var11] = this.field36;
                } else if (this.field31 < var13) {
                    var8[var11] = this.field31;
                } else {
                    var8[var11] = var13;
                }
                if (this.field36 > var14) {
                    var7[var11] = this.field36;
                } else if (this.field31 < var14) {
                    var7[var11] = this.field31;
                } else {
                    var7[var11] = var14;
                }
                if (var12 < this.field36) {
                    var9[var11] = this.field36;
                } else if (var12 > this.field31) {
                    var9[var11] = this.field31;
                } else {
                    var9[var11] = var12;
                }
            }
        }
        field37++;
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)Lic;", line = 147)
    public static final class109 method17(int arg0, boolean arg1) {
        class109 var2 = (class109) class94.field1578.method77((long) arg0, 12);
        field33++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class227.field3821.method1107(arg0, 0, 119);
        if (var3 == null) {
            return null;
        }
        class109 var4 = new class109();
        class229 var5 = new class229(var3);
        var5.field3905 = var5.field3879.length - 2;
        int var6 = var5.method1496(true);
        int var7 = var5.field3879.length - var6 - 2 - 12;
        var5.field3905 = var7;
        int var8 = var5.method1528(true);
        var4.field1837 = var5.method1496(true);
        var4.field1847 = var5.method1496(true);
        var4.field1839 = var5.method1496(arg1);
        var4.field1844 = var5.method1496(arg1);
        int var9 = var5.method1535((byte) 113);
        if (var9 > 0) {
            var4.field1850 = new class239[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1496(true);
                class239 var12 = new class239(class53.method336(-1753429918, var11));
                var4.field1850[var10] = var12;
                while (var11-- > 0) {
                    int var13 = var5.method1528(true);
                    int var14 = var5.method1528(true);
                    var12.method1611(new class119(var14), -1, (long) var13);
                }
            }
        }
        var5.field3905 = 0;
        int var15 = 0;
        var4.field1836 = var5.method1554(-1);
        var4.field1841 = new int[var8];
        var4.field1846 = new int[var8];
        var4.field1834 = new class283[var8];
        while (var5.field3905 < var7) {
            int var16 = var5.method1496(true);
            if (var16 == 3) {
                var4.field1834[var15] = var5.method1549(true);
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field1841[var15] = var5.method1535((byte) 85);
            } else {
                var4.field1841[var15] = var5.method1528(arg1);
            }
            var4.field1846[var15++] = var16;
        }
        class94.field1578.method85(var4, (long) arg0, (byte) -107);
        return var4;
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)Z", line = 257)
    public static final boolean method18(byte arg0) {
        field30++;
        int var1 = -60 / ((70 - arg0) / 51);
        if (class33.field497 != 0) {
            try {
                class89.field1516.method1908(class150.field2460.field4272, (byte) -107);
                return true;
            } catch (Throwable var3) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lfe;ZI)V", line = 276)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field34++;
        if (arg1) {
            return;
        }
        if (arg2 == 0) {
            this.field36 = arg0.method1496(!arg1);
        } else if (arg2 == 1) {
            this.field31 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field4876 = arg0.method1535((byte) 74) == 1;
        }
    }
}
