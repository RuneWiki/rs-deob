import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class103 extends class27 {

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "I")
    private int field1898 = 2048;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    private int field1902 = 3072;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    private int field1893 = 1024;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "[I")
    public static int[] field1890 = new int[50];

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field1897 = 0;

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "[I")
    public static int[] field1900 = new int[2000];

    @OriginalMember(owner = "client!lc", name = "db", descriptor = "Z")
    public static boolean field1905 = false;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field1892;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public static int field1899;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "I")
    public static int field1904;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "[I")
    public static int[] field1895;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lle;I)V")
    public static final void method571(class105 arg0, int arg1) {
        ++field1903;
        if (arg0.field1928 != null) {
            arg0.field1928.field924 = 0;
        }
        int var2 = 103 / ((arg1 - -12) / 45);
        arg0.field1925 = false;
        for (class105 var3 = arg0.method117(); var3 != null; var3 = arg0.method109()) {
            method571(var3, -95);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        ++field1891;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field435 = arg2.method1054(128) == 1;
                }
            } else {
                this.field1902 = arg2.method1071(28101);
            }
        } else {
            this.field1893 = arg2.method1071(28101);
        }
        if (arg0 < 106) {
            field1895 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        if (arg1) {
            this.method15((byte) 92, -24, (class158) null);
        }
        ++field1889;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 125, arg0);
            for (int var5 = 0; ~var5 > ~class159.field3209; ++var5) {
                var3[var5] = (var4[var5] * this.field1898 >> 12) + this.field1893;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZIBLme;I)V")
    public static final void method572(int arg0, int arg1, boolean arg2, int arg3, byte arg4, class114 arg5, int arg6) {
        ++field1904;
        long var7 = (long) ((arg3 << 16) - -arg1);
        class161 var9 = (class161) class207.field4045.method616(var7, -1);
        if (var9 == null) {
            class161 var10 = (class161) class9.field142.method616(var7, -1);
            if (var10 == null) {
                class161 var11 = (class161) class46.field733.method616(var7, -1);
                if (var11 != null) {
                    if (arg2) {
                        var11.method60((byte) -93);
                        class207.field4045.method617(arg0, var7, var11);
                        --class85.field1549;
                        ++class155.field3054;
                    }
                } else {
                    if (!arg2) {
                        class161 var12 = (class161) class126.field2368.method616(var7, -1);
                        if (var12 != null) {
                            return;
                        }
                    }
                    class161 var13 = new class161();
                    var13.field3228 = arg5;
                    var13.field3226 = arg6;
                    var13.field3218 = arg4;
                    if (arg0 == 0) {
                        if (arg2) {
                            class207.field4045.method617(arg0, var7, var13);
                            ++class155.field3054;
                        } else {
                            class92.field1678.method81(arg0 + 108, var13);
                            class46.field733.method617(0, var7, var13);
                            ++class85.field1549;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        ++field1892;
        int[][] var3 = super.field436.method537(0, arg1);
        int var4 = 13 / ((42 - arg0) / 54);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(arg1, 0, 119);
            int[] var6 = var5[1];
            int[] var7 = var5[2];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var3[0];
            int[] var11 = var3[2];
            for (int var12 = 0; class159.field3209 > var12; ++var12) {
                var10[var12] = (var9[var12] * this.field1898 >> 12) + this.field1893;
                var8[var12] = (var6[var12] * this.field1898 >> 12) + this.field1893;
                var11[var12] = this.field1893 - -(var7[var12] * this.field1898 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)I")
    public static final int method573(int arg0, int arg1, int arg2) {
        if (arg1 < 25) {
            field1905 = true;
        }
        ++field1901;
        int var3 = arg2 >> 31 & arg0 + -1;
        return ((arg2 >>> 31) + arg2) % arg0 + var3;
    }

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "(I)V")
    public static void method574(int arg0) {
        if (arg0 != 26567) {
            method571((class105) null, -9);
        }
        field1900 = null;
        field1895 = null;
        field1890 = null;
    }

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        ++field1894;
        this.field1898 = -this.field1893 + this.field1902;
        if (arg0 < 77) {
            method573(-74, 9, 42);
        }
    }
}
