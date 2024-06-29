import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class118 extends class115 {

    @OriginalMember(owner = "client!oh", name = "S", descriptor = "Z")
    private boolean field1916 = true;

    @OriginalMember(owner = "client!oh", name = "T", descriptor = "I")
    private int field1917 = 4;

    @OriginalMember(owner = "client!oh", name = "gb", descriptor = "[B")
    private byte[] field1930 = new byte[512];

    @OriginalMember(owner = "client!oh", name = "U", descriptor = "I")
    private int field1918 = 4;

    @OriginalMember(owner = "client!oh", name = "V", descriptor = "I")
    private int field1919 = 1638;

    @OriginalMember(owner = "client!oh", name = "eb", descriptor = "I")
    private int field1928 = 0;

    @OriginalMember(owner = "client!oh", name = "ib", descriptor = "I")
    private int field1932 = 4;

    @OriginalMember(owner = "client!oh", name = "Y", descriptor = "I")
    public static int field1922 = 0;

    @OriginalMember(owner = "client!oh", name = "ab", descriptor = "I")
    public static int field1924 = 0;

    @OriginalMember(owner = "client!oh", name = "jb", descriptor = "Lqe;")
    public static class168 field1933 = class66.method448("Wordpack geladen)3", -113);

    @OriginalMember(owner = "client!oh", name = "nb", descriptor = "Lhe;")
    public static class47 field1937 = new class47();

    @OriginalMember(owner = "client!oh", name = "ob", descriptor = "I")
    public static int field1938 = 0;

    @OriginalMember(owner = "client!oh", name = "R", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!oh", name = "bb", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!oh", name = "cb", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!oh", name = "db", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!oh", name = "fb", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!oh", name = "hb", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!oh", name = "kb", descriptor = "I")
    public static int field1934;

    @OriginalMember(owner = "client!oh", name = "lb", descriptor = "I")
    public static int field1935;

    @OriginalMember(owner = "client!oh", name = "mb", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!oh", name = "X", descriptor = "[S")
    private short[] field1921;

    @OriginalMember(owner = "client!oh", name = "Z", descriptor = "[S")
    private short[] field1923;

    @OriginalMember(owner = "client!oh", name = "Q", descriptor = "[[B")
    public static byte[][] field1914;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)V")
    private final void method804(int arg0) {
        if (this.field1919 <= 0) {
            if (this.field1921 != null && ~this.field1921.length == ~this.field1917) {
                this.field1923 = new short[this.field1917];
                for (int var2 = 0; this.field1917 > var2; ++var2) {
                    this.field1923[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field1921 = new short[this.field1917];
            this.field1923 = new short[this.field1917];
            for (int var3 = 0; this.field1917 > var3; ++var3) {
                this.field1921[var3] = (short) ((int) (Math.pow((double) ((float) this.field1919 / 4096.0F), (double) var3) * 4096.0D));
                this.field1923[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 < 117) {
            this.field1930 = null;
        }
        ++field1929;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Loe;I)I")
    public static final int method805(class256 arg0, int arg1) {
        ++field1934;
        int var2 = 0;
        int var3 = 70 / ((-56 - arg1) / 49);
        if (arg0.method1692(class69.field984, 0)) {
            ++var2;
        }
        if (arg0.method1692(class253.field4379, 0)) {
            ++var2;
        }
        if (arg0.method1692(class128.field2119, 0)) {
            ++var2;
        }
        if (arg0.method1692(class148.field2579, 0)) {
            ++var2;
        }
        if (arg0.method1692(class246.field4266, 0)) {
            ++var2;
        }
        if (arg0.method1692(class119.field1947, 0)) {
            ++var2;
        }
        if (arg0.method1692(class86.field1344, 0)) {
            ++var2;
        }
        if (arg0.method1692(class74.field1128, 0)) {
            ++var2;
        }
        if (arg0.method1692(class104.field1675, 0)) {
            ++var2;
        }
        if (arg0.method1692(class55.field766, 0)) {
            ++var2;
        }
        if (arg0.method1692(class66.field930, 0)) {
            ++var2;
        }
        if (arg0.method1692(class254.field4386, 0)) {
            ++var2;
        }
        if (arg0.method1692(class59.field814, 0)) {
            ++var2;
        }
        ++var2;
        if (arg0.method1692(class70.field1072, 0)) {
            ++var2;
        }
        if (arg0.method1692(class101.field1605, 0)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class118() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "(I)V")
    public final void method170(int arg0) {
        ++field1935;
        this.field1930 = class98.method641(-78, this.field1928);
        this.method804(121);
        if (arg0 != 395462996) {
            method811(true, 79);
        }
        for (int var2 = this.field1917 + -1; ~var2 <= -2; --var2) {
            short var3 = this.field1921[var2];
            if (~var3 < -9) {
                return;
            }
            if (var3 < -8) {
                return;
            }
            --this.field1917;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIIIII)I")
    private final int method806(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1926;
        int var8 = arg6 + -4096;
        int var9 = arg3 >> 12;
        int var10 = arg3 & 4095;
        int var11 = class175.field3063[var10];
        int var12 = var9 + 1;
        int var13 = var9 & 255;
        int var14 = 3 & this.field1930[arg4 + var13];
        int var15 = var10 - 4096;
        if (!arg1) {
            method808(4);
        }
        int var16;
        if (~var14 >= -2) {
            var16 = ~var14 != -1 ? arg6 - var10 : arg6 + var10;
        } else {
            var16 = ~var14 != -3 ? -arg6 + -var10 : var10 - arg6;
        }
        if (var12 >= arg5) {
            var12 = 0;
        }
        int var17 = var12 & 255;
        int var18 = this.field1930[arg4 + var17] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 == -1 ? arg6 + var15 : -var15 + arg6;
        } else {
            var19 = var18 == 2 ? -arg6 + var15 : -arg6 + -var15;
        }
        int var20 = ((-var16 + var19) * var11 >> 12) + var16;
        int var21 = 3 & this.field1930[arg0 + var13];
        int var22;
        if (var21 <= 1) {
            var22 = var21 != 0 ? -var10 + var8 : var10 - -var8;
        } else {
            var22 = ~var21 == -3 ? -var8 + var10 : -var8 + -var10;
        }
        int var23 = this.field1930[arg0 + var17] & 3;
        int var24;
        if (var23 <= 1) {
            var24 = ~var23 == -1 ? var8 + var15 : var8 - var15;
        } else {
            var24 = var23 != 2 ? -var8 + -var15 : -var8 + var15;
        }
        int var25 = var22 - -((-var22 + var24) * var11 >> 12);
        return ((var25 - var20) * arg2 >> 12) + var20;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BI[I)V")
    private final void method807(byte arg0, int arg1, int[] arg2) {
        if (arg0 != -26) {
            method810((class249) null, -6);
        }
        ++field1920;
        int var4 = class170.field2963[arg1] * this.field1932;
        if (this.field1917 == 1) {
            short var5 = this.field1921[0];
            int var6 = this.field1923[0] << 12;
            int var7 = var4 * var6 >> 12;
            int var8 = this.field1918 * var6 >> 12;
            int var9 = this.field1932 * var6 >> 12;
            int var10 = var7 >> 12;
            int var11 = var10 + 1;
            int var12 = var7 & 4095;
            int var13 = 255 & this.field1930[255 & var10];
            int var14 = class175.field3063[var12];
            if (var11 >= var9) {
                var11 = 0;
            }
            int var15 = this.field1930[var11 & 255] & 255;
            if (this.field1916) {
                for (int var16 = 0; class130.field2297 > var16; ++var16) {
                    int var17 = class193.field3367[var16] * this.field1918;
                    int var18 = this.method806(var15, true, var14, var6 * var17 >> 12, var13, var8, var12);
                    int var19 = var5 * var18 >> 12;
                    arg2[var16] = (var19 >> 1) + 2048;
                }
            } else {
                for (int var20 = 0; ~var20 > ~class130.field2297; ++var20) {
                    int var21 = class193.field3367[var20] * this.field1918;
                    int var22 = this.method806(var15, true, var14, var6 * var21 >> 12, var13, var8, var12);
                    arg2[var20] = var5 * var22 >> 12;
                }
            }
        } else {
            short var23 = this.field1921[0];
            if (var23 > 8 || var23 < -8) {
                int var24 = this.field1923[0] << 12;
                int var25 = this.field1918 * var24 >> 12;
                int var26 = this.field1932 * var24 >> 12;
                int var27 = var4 * var24 >> 12;
                int var28 = var27 >> 12;
                int var29 = var28 + 1;
                int var30 = 255 & this.field1930[var28 & 255];
                if (var29 >= var26) {
                    var29 = 0;
                }
                int var31 = var27 & 4095;
                int var32 = this.field1930[var29 & 255] & 255;
                int var33 = class175.field3063[var31];
                for (int var34 = 0; class130.field2297 > var34; ++var34) {
                    int var54 = class193.field3367[var34] * this.field1918;
                    int var55 = this.method806(var32, true, var33, var24 * var54 >> 12, var30, var25, var31);
                    arg2[var34] = var23 * var55 >> 12;
                }
            }
            for (int var35 = 1; var35 < this.field1917; ++var35) {
                short var36 = this.field1921[var35];
                if (~var36 < -9 || var36 < -8) {
                    int var37 = this.field1923[var35] << 12;
                    int var38 = var4 * var37 >> 12;
                    int var39 = this.field1932 * var37 >> 12;
                    int var40 = this.field1918 * var37 >> 12;
                    int var41 = var38 >> 12;
                    int var42 = var41 + 1;
                    int var43 = this.field1930[255 & var41] & 255;
                    int var44 = var38 & 4095;
                    if (var42 >= var39) {
                        var42 = 0;
                    }
                    int var45 = this.field1930[var42 & 255] & 255;
                    int var46 = class175.field3063[var44];
                    if (this.field1916 && this.field1917 + -1 == var35) {
                        for (int var47 = 0; class130.field2297 > var47; ++var47) {
                            int var48 = class193.field3367[var47] * this.field1918;
                            int var49 = this.method806(var45, true, var46, var37 * var48 >> 12, var43, var40, var44);
                            int var50 = (var36 * var49 >> 12) + arg2[var47];
                            arg2[var47] = (var50 >> 1) + 2048;
                        }
                    } else {
                        for (int var51 = 0; ~class130.field2297 < ~var51; ++var51) {
                            int var52 = class193.field3367[var51] * this.field1918;
                            int var53 = this.method806(var45, true, var46, var37 * var52 >> 12, var43, var40, var44);
                            arg2[var51] += var36 * var53 >> 12;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "(I)V")
    public static void method808(int arg0) {
        field1937 = null;
        field1914 = null;
        if (arg0 == -722533812) {
            field1933 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)[I")
    public final int[] method5(int arg0, byte arg1) {
        int[] var3 = super.field1872.method182((byte) -126, arg0);
        ++field1925;
        if (arg1 < 37) {
            this.method807((byte) -71, -23, (int[]) null);
        }
        if (super.field1872.field341) {
            this.method807((byte) -26, arg0, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)V")
    public static final void method809(byte arg0) {
        class44.field578 = 0;
        class36.field452 = -1;
        int var1 = -60 % ((arg0 - -67) / 40);
        class147.field2558 = 0;
        class109.field1748 = 0;
        class31.field377 = 0;
        class56.field773 = -1;
        ++field1931;
        class242.field4198 = 0;
        class209.field3630 = -1;
        class87.field1348.field1821 = 0;
        class112.field1815.field1821 = 0;
        class169.field2956 = false;
        class108.field1740 = -1;
        class163.field2803 = 0;
        for (int var2 = 0; var2 < class104.field1677.length; ++var2) {
            if (class104.field1677[var2] != null) {
                class104.field1677[var2].field181 = -1;
            }
        }
        for (int var3 = 0; ~class229.field3898.length < ~var3; ++var3) {
            if (class229.field3898[var3] != null) {
                class229.field3898[var3].field181 = -1;
            }
        }
        class63.method418(-15308);
        class31.field379 = 1;
        class84.method555(5, 30);
        for (int var4 = 0; ~var4 > -101; ++var4) {
            class194.field3372[var4] = true;
        }
        class32.field385.method318((byte) -120);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lje;I)V")
    public static final void method810(class249 arg0, int arg1) {
        class254.field4398 = arg0;
        ++field1915;
        if (arg1 != -1697) {
            field1924 = -119;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLnh;I)V")
    public final void method3(byte arg0, class112 arg1, int arg2) {
        if (arg0 == 107) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (arg2 == 6) {
                                        this.field1932 = arg1.method758(true);
                                    }
                                } else {
                                    this.field1918 = arg1.method758(true);
                                }
                            } else {
                                this.field1928 = arg1.method758(true);
                            }
                        } else {
                            this.field1918 = this.field1932 = arg1.method758(true);
                        }
                    } else {
                        this.field1919 = arg1.method740(arg0 ^ 16711787);
                        if (~this.field1919 > -1) {
                            this.field1921 = new short[this.field1917];
                            for (int var5 = 0; var5 < this.field1917; ++var5) {
                                this.field1921[var5] = (short) arg1.method740(16711680);
                            }
                        }
                    }
                } else {
                    this.field1917 = arg1.method758(true);
                }
            } else {
                this.field1916 = ~arg1.method758(true) == -2;
            }
            ++field1927;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZI)V")
    public static final void method811(boolean arg0, int arg1) {
        ++field1936;
        if (arg0) {
            for (class172 var2 = (class172) class70.field1040.method1536(81); var2 != null; var2 = (class172) class70.field1040.method1534(-21389)) {
                if (~(var2.field3308 >> 48 & 65535L) == ~((long) arg1)) {
                    var2.method1234(17216);
                }
            }
        }
    }
}
