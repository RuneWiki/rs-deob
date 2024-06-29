import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class115 extends class170 {

    @OriginalMember(owner = "client!ja", name = "M", descriptor = "I")
    public static int field1859 = -1;

    @OriginalMember(owner = "client!ja", name = "Y", descriptor = "Ljd;")
    public static class265 field1871 = new class265(260);

    @OriginalMember(owner = "client!ja", name = "db", descriptor = "Ljd;")
    public static class265 field1876 = new class265(100);

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "I")
    public static int field1880 = 0;

    @OriginalMember(owner = "client!ja", name = "O", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!ja", name = "Q", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!ja", name = "R", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!ja", name = "S", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!ja", name = "T", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ja", name = "U", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!ja", name = "X", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ja", name = "ab", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ja", name = "bb", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!ja", name = "eb", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ja", name = "fb", descriptor = "J")
    public static long field1878;

    @OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lsc;")
    public class181 field1872;

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "Lth;")
    public static class258 field1879;

    @OriginalMember(owner = "client!ja", name = "N", descriptor = "[I")
    public int[] field1860;

    @OriginalMember(owner = "client!ja", name = "V", descriptor = "[I")
    public int[] field1868;

    @OriginalMember(owner = "client!ja", name = "W", descriptor = "[I")
    public int[] field1869;

    @OriginalMember(owner = "client!ja", name = "cb", descriptor = "[I")
    public int[] field1875;

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "[Lka;")
    public static class134[] field1862;

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public final void method756(byte arg0) {
        if (arg0 >= -91) {
            return;
        }
        field1861++;
        if (this.field1869 != null) {
            for (int var2 = 0; var2 < this.field1869.length; var2++) {
                this.field1869[var2] = class185.method1291(this.field1869[var2], 32768);
            }
        }
        if (this.field1860 != null) {
            for (int var3 = 0; var3 < this.field1860.length; var3++) {
                this.field1860[var3] = class185.method1291(this.field1860[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIII)V")
    public static final void method757(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg1;
        int var6 = 0;
        field1870++;
        class171.method1133(class149.field2507[arg2], arg3 - arg1, arg0, arg1 + arg3, (byte) 125);
        int var7 = -arg1;
        int var8 = arg4;
        while (var5 > var6) {
            var6++;
            var8 += 2;
            var7 += var8;
            if (var7 >= 0) {
                var5--;
                var7 -= var5 << 1;
                int[] var9 = class149.field2507[arg2 + var5];
                int var10 = arg3 + var6;
                int[] var11 = class149.field2507[arg2 - var5];
                int var12 = arg3 - var6;
                class171.method1133(var9, var12, arg0, var10, (byte) 125);
                class171.method1133(var11, var12, arg0, var10, (byte) 126);
            }
            int var13 = arg3 + var5;
            int[] var14 = class149.field2507[arg2 + var6];
            int[] var15 = class149.field2507[arg2 - var6];
            int var16 = arg3 - var5;
            class171.method1133(var14, var16, arg0, var13, (byte) 126);
            class171.method1133(var15, var16, arg0, var13, (byte) 125);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILvf;)V")
    public final void method758(int arg0, class230 arg1) {
        if (arg0 != -29708) {
            return;
        }
        field1874++;
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                return;
            }
            this.method760(arg1, var3, arg0 + 29708);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public static final void method759(int arg0, int arg1, int arg2) {
        class165 var3 = class244.method1652(-126, arg1);
        int var4 = var3.field2810;
        int var5 = var3.field2811;
        int var6 = var3.field2806;
        int var7 = class131.field2170[var5 - var6];
        field1867++;
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        class162.method1084(arg0 << var6 & var8 | ~var8 & class107.field1751[var4], var4, -27);
        if (arg2 > -99) {
            field1879 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lvf;II)V")
    private final void method760(class230 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method762(17, -82);
        }
        if (arg1 == 1) {
            this.field1872 = arg0.method1549(14);
        } else if (arg1 == 2) {
            int var4 = arg0.method1516((byte) 82);
            this.field1875 = new int[var4];
            this.field1860 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1860[var5] = arg0.method1535(arg2 + 2);
                int var6 = arg0.method1516((byte) 82);
                if (var6 == 0) {
                    this.field1875[var5] = -1;
                } else {
                    this.field1875[var5] = var6;
                }
            }
        } else if (arg1 == 3) {
            int var7 = arg0.method1516((byte) 82);
            this.field1868 = new int[var7];
            this.field1869 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field1869[var8] = arg0.method1535(2);
                int var9 = arg0.method1516((byte) 82);
                if (var9 == 0) {
                    this.field1868[var8] = -1;
                } else {
                    this.field1868[var8] = var9;
                }
            }
        }
        field1865++;
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public static void method761(int arg0) {
        field1871 = null;
        if (arg0 == -1) {
            field1876 = null;
            field1879 = null;
            field1862 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(II)V")
    public static final void method762(int arg0, int arg1) {
        field1864++;
        if (!class77.method537(-1, arg1)) {
            return;
        }
        class175[] var2 = class208.field3563[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class175 var4 = var2[var3];
            if (var4 != null) {
                var4.field2998 = 0;
                var4.field3038 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(B)V")
    public static final void method763(byte arg0) {
        class258.field4509 = 0L;
        if (arg0 == 102) {
            field1866++;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)I")
    public final int method764(byte arg0, int arg1) {
        field1873++;
        if (this.field1860 == null) {
            return -1;
        }
        if (arg0 < 89) {
            field1879 = null;
        }
        for (int var3 = 0; var3 < this.field1860.length; var3++) {
            if (this.field1875[var3] == arg1) {
                return this.field1860[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)I")
    public final int method765(int arg0, int arg1) {
        field1863++;
        if (this.field1869 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field1869.length; var3++) {
            if (this.field1868[var3] == arg0) {
                return this.field1869[var3];
            }
        }
        int var4 = -42 % ((arg1 - 35) / 46);
        return -1;
    }
}
