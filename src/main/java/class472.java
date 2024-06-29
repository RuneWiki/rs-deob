import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class472 extends class11 {

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    private int field6896 = -1;

    @OriginalMember(owner = "client!ab", name = "K", descriptor = "[I")
    public static int[] field6890 = new int[14];

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field6893 = 4;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "I")
    public static int field6897 = 0;

    @OriginalMember(owner = "client!ab", name = "G", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!ab", name = "H", descriptor = "I")
    public static int field6887;

    @OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
    public static int field6888;

    @OriginalMember(owner = "client!ab", name = "J", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public static int field6891;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    private int field6895;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    private int field6901;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "[I")
    private int[] field6894;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIB)Z")
    public static final boolean method2778(int arg0, int arg1, byte arg2) {
        if (arg2 >= -85) {
            field6897 = -48;
        }
        ++field6891;
        return (arg0 & 540800) != 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(II)[[I")
    public final int[][] method41(int arg0, int arg1) {
        ++field6892;
        int[][] var3 = super.field156.method1719(arg1, 3);
        int var4 = 115 / ((-75 - arg0) / 49);
        if (super.field156.field4001) {
            int var5 = (class508.field7537 != this.field6895 ? this.field6895 * arg1 / class508.field7537 : arg1) * this.field6901;
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            if (~class90.field1316 != ~this.field6901) {
                for (int var9 = 0; ~class90.field1316 < ~var9; ++var9) {
                    int var10 = this.field6901 * var9 / class90.field1316;
                    int var11 = this.field6894[var5 - -var10];
                    var8[var9] = class251.method1501(var11 << 4, 4080);
                    var7[var9] = class251.method1501(65280, var11) >> 4;
                    var6[var9] = class251.method1501(4080, var11 >> 12);
                }
            } else {
                for (int var12 = 0; var12 < class90.field1316; ++var12) {
                    int var13 = this.field6894[var5++];
                    var8[var12] = class251.method1501(var13, 255) << 4;
                    var7[var12] = class251.method1501(var13 >> 4, 4080);
                    var6[var12] = class251.method1501(16711680, var13) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)I")
    public final int method50(int arg0) {
        ++field6888;
        if (arg0 != -1) {
            method2778(93, 40, (byte) 44);
        }
        return this.field6896;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZZLjava/lang/String;)V")
    public static final void method2779(boolean arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        ++field6898;
        short[] var4 = new short[16];
        int var5 = 0;
        if (!arg0) {
            int var6 = arg1 ? 32768 : 0;
            int var7 = (arg1 ? class224.field3195.field3600 : class224.field3195.field3606) + var6;
            for (int var8 = var6; var8 < var7; ++var8) {
                class361 var11 = class224.field3195.method1560(var8, -2621);
                if (var11.field5283 && ~var11.method2168(0).toLowerCase().indexOf(var3) != 0) {
                    if (var5 >= 50) {
                        class170.field2530 = null;
                        class525.field7763 = -1;
                        return;
                    }
                    if (~var5 <= ~var4.length) {
                        short[] var12 = new short[var4.length * 2];
                        for (int var13 = 0; ~var5 < ~var13; ++var13) {
                            var12[var13] = var4[var13];
                        }
                        var4 = var12;
                    }
                    var4[var5++] = (short) var8;
                }
            }
            class131.field1924 = 0;
            class525.field7763 = var5;
            class170.field2530 = var4;
            String[] var9 = new String[class525.field7763];
            for (int var10 = 0; class525.field7763 > var10; ++var10) {
                var9[var10] = class224.field3195.method1560(var4[var10], -2621).method2168(0);
            }
            class231.method1427(125, var9, class170.field2530);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V")
    public class472() {
        super(0, false);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        ++field6899;
        if (arg2 == 0) {
            this.field6896 = arg0.method2353((byte) 108);
        }
        if (arg1 > -40) {
            field6897 = 119;
        }
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(II)V")
    public static final void method2780(int arg0, int arg1) {
        class263 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class142 var4 = class385.field5608[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class371.field5427; ++var5) {
                    for (int var6 = 0; var6 < class206.field2881; ++var6) {
                        var2 = var4.method359(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class523.field7736;
                            int var8 = var5 << class523.field7736;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class142 var10 = class385.field5608[var9];
                                if (var10 != null) {
                                    int var11 = var4.method351(var6, var5) - var10.method351(var6, var5);
                                    int var12 = var4.method351(var6 + 1, var5) - var10.method351(var6 + 1, var5);
                                    int var13 = var4.method351(var6 + 1, var5 + 1) - var10.method351(var6 + 1, var5 + 1);
                                    int var14 = var4.method351(var6, var5 + 1) - var10.method351(var6, var5 + 1);
                                    var10.method352(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "(I)V")
    public static final void method2781(int arg0) {
        ++field6889;
        class377.method2246(true);
        class367.method2214(22050, 84, 2, class20.field269.field7646);
        class118.field1759 = class127.method881(0, class426.field6248, 117, 22050, class202.field2840);
        class118.field1759.method2605((byte) -13, class402.field5902);
        class102.field1544 = class127.method881(1, class426.field6248, 122, 2048, class202.field2840);
        class102.field1544.method2605((byte) -13, class361.field5267);
        int var1 = -39 / ((6 - arg0) / 61);
    }

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "(I)V")
    public static final void method2782(int arg0) {
        ++field6887;
        if (arg0 != 20728) {
            method2781(-96);
        }
        if (~class504.field7417 != -4) {
            class316.field4329 = -1;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method51(byte arg0) {
        super.method51(arg0);
        ++field6900;
        this.field6894 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(III)V")
    public final void method55(int arg0, int arg1, int arg2) {
        ++field6886;
        super.method55(arg0, arg1, arg2);
        if (this.field6896 >= 0 && class172.field2556 != null) {
            int var4 = class172.field2556.method1654(22, this.field6896).field2480 ? 64 : 128;
            this.field6894 = class172.field2556.method1650(var4, this.field6896, true, 1.0F, false, var4);
            this.field6895 = var4;
            this.field6901 = var4;
        }
    }

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "(I)V")
    public static void method2783(int arg0) {
        if (arg0 != 64) {
            field6897 = 58;
        }
        field6890 = null;
    }
}
