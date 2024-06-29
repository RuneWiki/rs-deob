import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class214 extends class326 {

    @OriginalMember(owner = "client!tc", name = "O", descriptor = "I")
    private int field2873 = 3072;

    @OriginalMember(owner = "client!tc", name = "R", descriptor = "I")
    private int field2876 = 1024;

    @OriginalMember(owner = "client!tc", name = "S", descriptor = "I")
    private int field2877 = 2048;

    @OriginalMember(owner = "client!tc", name = "T", descriptor = "[I")
    public static int[] field2878 = new int[50];

    @OriginalMember(owner = "client!tc", name = "W", descriptor = "[[Z")
    public static boolean[][] field2881 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!tc", name = "Q", descriptor = "Loj;")
    public static class235 field2875 = new class235(1);

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lad;")
    public static class268 field2883 = new class268(8);

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "[I")
    public static int[] field2885 = new int[3];

    @OriginalMember(owner = "client!tc", name = "N", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!tc", name = "P", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!tc", name = "U", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!tc", name = "V", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(IB)[[I", line = 5)
    public final int[][] method48(int arg0, byte arg1) {
        ++field2882;
        int[][] var3 = super.field4343.method2356(arg0, 86);
        if (super.field4343.field5336) {
            int[][] var4 = this.method1828(0, true, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class181.field2495; ++var11) {
                var8[var11] = (var5[var11] * this.field2877 >> 12) + this.field2876;
                var9[var11] = (var6[var11] * this.field2877 >> 12) + this.field2876;
                var10[var11] = (var7[var11] * this.field2877 >> 12) + this.field2876;
            }
        }
        if (arg1 >= -52) {
            field2881 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V", line = 51)
    public class214() {
        super(1, false);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ILbt;I)V", line = 58)
    public final void method33(int arg0, class32 arg1, int arg2) {
        ++field2884;
        if (arg2 > -3) {
            this.method33(21, (class32) null, 99);
        }
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    super.field4358 = ~arg1.method201((byte) -128) == -2;
                }
            } else {
                this.field2873 = arg1.method215((byte) 118);
            }
        } else {
            this.field2876 = arg1.method215((byte) 124);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IZIIIIZ)V", line = 101)
    public static final void method1211(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        int var7 = 38 % ((arg0 - -59) / 35);
        if (~arg3 > ~arg5) {
            int var8 = (arg3 + arg5) / 2;
            int var9 = arg3;
            class348 var10 = class159.field2195[var8];
            class159.field2195[var8] = class159.field2195[arg5];
            class159.field2195[arg5] = var10;
            for (int var11 = arg3; ~arg5 < ~var11; ++var11) {
                if (class314.method1728(arg2, arg1, class159.field2195[var11], var10, arg4, (byte) 113, arg6) <= 0) {
                    class348 var12 = class159.field2195[var11];
                    class159.field2195[var11] = class159.field2195[var9];
                    class159.field2195[var9++] = var12;
                }
            }
            class159.field2195[arg5] = class159.field2195[var9];
            class159.field2195[var9] = var10;
            method1211(121, arg1, arg2, arg3, arg4, var9 - 1, arg6);
            method1211(-107, arg1, arg2, var9 + 1, arg4, arg5, arg6);
        }
        ++field2874;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lhb;Z)Z", line = 159)
    public static final boolean method1212(class471 arg0, boolean arg1) {
        boolean var2 = class312.field4112 == class221.field2945;
        int var3 = 0;
        byte var4 = 0;
        byte var5 = 0;
        arg0.method538((byte) 127);
        if (arg0.field6500 >= 0 && arg0.field6491 >= 0 && arg0.field6505 < class143.field2058 && arg0.field6497 < class91.field1344) {
            for (int var6 = arg0.field6500; var6 <= arg0.field6505; ++var6) {
                for (int var9 = arg0.field6491; var9 <= arg0.field6497; ++var9) {
                    class491 var10 = class398.method2420(arg0.field6502, var6, var9);
                    if (var10 != null) {
                        int var11 = 0;
                        if (var6 > arg0.field6500) {
                            ++var11;
                        }
                        if (var6 < arg0.field6505) {
                            var11 += 4;
                        }
                        if (var9 > arg0.field6491) {
                            var11 += 8;
                        }
                        if (var9 < arg0.field6497) {
                            var11 += 2;
                        }
                        class309 var12 = class448.method2632(var11, (byte) -127, arg0);
                        class309 var13 = var10.field6845;
                        if (var13 == null) {
                            var10.field6845 = var12;
                        } else {
                            while (var13.field4084 != null) {
                                var13 = var13.field4084;
                            }
                            var13.field4084 = var12;
                        }
                        var10.field6843 = (byte) (var10.field6843 | var11);
                        if (var2 && (class136.field1977[var6][var9] & -16777216) != 0) {
                            var3 = class136.field1977[var6][var9];
                            var4 = class246.field3284[var6][var9];
                            var5 = class56.field768[var6][var9];
                        }
                    }
                }
            }
            if (var2 && (var3 & -16777216) != 0) {
                for (int var7 = arg0.field6500; var7 <= arg0.field6505; ++var7) {
                    for (int var8 = arg0.field6491; var8 <= arg0.field6497; ++var8) {
                        if ((class136.field1977[var7][var8] & -16777216) == 0) {
                            class136.field1977[var7][var8] = var3;
                            class246.field3284[var7][var8] = var4;
                            class56.field768[var7][var8] = var5;
                        }
                    }
                }
            }
            if (arg1) {
                class480.field6635[class400.field5504++] = arg0;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(I)V", line = 261)
    public final void method65(int arg0) {
        if (arg0 <= -100) {
            ++field2872;
            this.field2877 = -this.field2876 + this.field2873;
        }
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(Z)V", line = 284)
    public static void method1213(boolean arg0) {
        field2875 = null;
        field2881 = null;
        if (!arg0) {
            method1212((class471) null, false);
        }
        field2878 = null;
        field2883 = null;
        field2885 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BI)[I", line = 299)
    public final int[] method30(byte arg0, int arg1) {
        ++field2880;
        int[] var3 = super.field4344.method130(arg1, -123);
        if (super.field4344.field286) {
            int[] var4 = this.method1824(0, false, arg1);
            for (int var5 = 0; var5 < class181.field2495; ++var5) {
                var3[var5] = (var4[var5] * this.field2877 >> 12) + this.field2876;
            }
        }
        if (arg0 >= -6) {
            field2881 = null;
        }
        return var3;
    }
}
