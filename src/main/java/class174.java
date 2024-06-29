import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class174 extends class71 {

    @OriginalMember(owner = "client!kj", name = "X", descriptor = "I")
    private int field3141 = 4096;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    private int field3133 = 0;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "[S")
    public static short[] field3127 = new short[256];

    @OriginalMember(owner = "client!kj", name = "V", descriptor = "I")
    public static int field3139 = 0;

    @OriginalMember(owner = "client!kj", name = "T", descriptor = "I")
    public static int field3137 = 0;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field3132 = 0;

    @OriginalMember(owner = "client!kj", name = "W", descriptor = "[I")
    public static int[] field3140 = new int[5];

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!kj", name = "U", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!kj", name = "Y", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!kj", name = "S", descriptor = "[[Lvk;")
    public static class168[][] field3136;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIB)I", line = 8)
    public static final int method1350(int arg0, int arg1, byte arg2) {
        if (arg2 != 5) {
            field3139 = 118;
        }
        field3130++;
        if (arg1 < arg0) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(II)V", line = 35)
    public static final void method1351(int arg0, int arg1) {
        field3134++;
        class111.field2046.method1339(arg0, arg1 + 19298);
        class265.field4774.method1339(arg0, 19326);
        if (arg1 != 28) {
            method1352(75, 104);
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V", line = 46)
    public class174() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(II)V", line = 54)
    public static final void method1352(int arg0, int arg1) {
        class189.field3414 = 20;
        class69.field1369 = arg1;
        field3129++;
        class192.field3470 = arg0;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(II)V", line = 76)
    public static final void method1353(int arg0, int arg1) {
        field3135++;
        if (arg0 != 222) {
            method1353(21, -124);
        }
        class246.field4376.method1339(arg1, 19326);
        class132.field2409.method1339(arg1, 19326);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZLvh;)V", line = 94)
    public final void method77(int arg0, boolean arg1, class53 arg2) {
        field3131++;
        if (!arg1) {
            method1353(34, -97);
        }
        if (arg0 == 0) {
            this.field3133 = arg2.method468(28214);
        } else if (arg0 == 1) {
            this.field3141 = arg2.method468(28214);
        } else if (arg0 == 2) {
            this.field1389 = arg2.method483(-118) == 1;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[[I", line = 138)
    public final int[][] method86(int arg0, int arg1) {
        field3142++;
        int[][] var3 = this.field1400.method1746((byte) -122, arg0);
        if (this.field1400.field4363) {
            int[][] var4 = this.method619(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var4[2];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class215.field3787; var11++) {
                int var12 = var5[var11];
                int var13 = var9[var11];
                int var14 = var6[var11];
                if (var12 < this.field3133) {
                    var7[var11] = this.field3133;
                } else if (this.field3141 < var12) {
                    var7[var11] = this.field3141;
                } else {
                    var7[var11] = var12;
                }
                if (var14 < this.field3133) {
                    var8[var11] = this.field3133;
                } else if (this.field3141 < var14) {
                    var8[var11] = this.field3141;
                } else {
                    var8[var11] = var14;
                }
                if (this.field3133 > var13) {
                    var10[var11] = this.field3133;
                } else if (this.field3141 < var13) {
                    var10[var11] = this.field3141;
                } else {
                    var10[var11] = var13;
                }
            }
        }
        int var15 = 123 / ((arg1 + 70) / 54);
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(IB)[I", line = 229)
    public final int[] method199(int arg0, byte arg1) {
        if (arg1 >= -69) {
            return (int[]) null;
        }
        field3138++;
        int[] var3 = this.field1390.method549(arg0, true);
        if (this.field1390.field1304) {
            int[] var4 = this.method624(arg0, -3, 0);
            for (int var5 = 0; var5 < class215.field3787; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field3133) {
                    var3[var5] = this.field3133;
                } else if (this.field3141 >= var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field3141;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "(I)V", line = 275)
    public static final void method1354(int arg0) {
        if (class305.field5424.toLowerCase().indexOf("microsoft") == -1) {
            class16.field514[59] = 57;
            class16.field514[45] = 26;
            if (class305.field5427 == null) {
                class16.field514[192] = 58;
                class16.field514[222] = 59;
            } else {
                class16.field514[222] = 58;
                class16.field514[520] = 59;
                class16.field514[192] = 28;
            }
            class16.field514[93] = 43;
            class16.field514[47] = 73;
            class16.field514[92] = 74;
            class16.field514[46] = 72;
            class16.field514[91] = 42;
            class16.field514[61] = 27;
            class16.field514[44] = 71;
        } else {
            class16.field514[188] = 71;
            class16.field514[192] = 58;
            class16.field514[221] = 43;
            class16.field514[223] = 28;
            class16.field514[219] = 42;
            class16.field514[190] = 72;
            class16.field514[191] = 73;
            class16.field514[222] = 59;
            class16.field514[220] = 74;
            class16.field514[187] = 27;
            class16.field514[186] = 57;
            class16.field514[189] = 26;
        }
        if (arg0 > -118) {
            method1352(25, -53);
        }
        field3128++;
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)V", line = 331)
    public static void method1355(byte arg0) {
        field3136 = (class168[][]) null;
        if (arg0 < 118) {
            field3139 = 114;
        }
        field3140 = null;
        field3127 = null;
    }
}
