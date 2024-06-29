import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class52 extends class262 {

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "[[[I")
    public static int[][][] field944 = new int[4][13][13];

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "[I")
    public static int[] field952 = new int[100];

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "Lok;")
    private static class146 field953 = class235.method1724(-12908, "Hidden");

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "Lok;")
    public static class146 field943 = field953;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "Loh;")
    public static class15 field950;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[I", line = 5)
    public final int[] method38(int arg0, byte arg1) {
        if (arg1 >= -85) {
            field950 = (class15) null;
        }
        field951++;
        int[] var3 = this.field4350.method1532(arg0, (byte) 125);
        if (this.field4350.field3333) {
            int[] var4 = this.method1895(7, 0, arg0);
            int[] var5 = this.method1895(7, 1, arg0);
            int[] var6 = this.method1895(7, 2, arg0);
            for (int var7 = 0; var7 < class98.field1598; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(JI)V", line = 60)
    public static final void method420(long arg0, int arg1) {
        field940++;
        if (arg0 == 0L) {
            return;
        }
        class47.field820.method1656(97, 16);
        class258.field4294++;
        class47.field820.method359(arg0, 128);
        if (arg1 != 20366) {
            field944 = (int[][][]) ((int[][][]) null);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILvc;)V", line = 78)
    public static final void method421(int arg0, class185 arg1) {
        field939++;
        long var2 = 0L;
        int var4 = -1;
        if (arg1.field3085 == 0) {
            var2 = class296.method2106(arg1.field3075, arg1.field3095, arg1.field3087);
        }
        if (arg1.field3085 == 1) {
            var2 = class311.method2186(arg1.field3075, arg1.field3095, arg1.field3087);
        }
        if (arg1.field3085 == 2) {
            var2 = class248.method1820(arg1.field3075, arg1.field3095, arg1.field3087);
        }
        if (arg1.field3085 == 3) {
            var2 = class259.method1881(arg1.field3075, arg1.field3095, arg1.field3087);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7D4E2) >> 14;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var6 = (int) var2 >> 20 & 0x3;
        }
        arg1.field3080 = var4;
        if (arg0 != Integer.MAX_VALUE) {
            method421(24, (class185) null);
        }
        arg1.field3091 = var6;
        arg1.field3088 = var5;
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(II)[[I", line = 120)
    public final int[][] method87(int arg0, int arg1) {
        int[][] var3 = this.field4347.method536(arg1, 4096);
        if (arg0 != 7) {
            method421(126, (class185) null);
        }
        if (this.field4347.field1202) {
            int[] var4 = this.method1895(7, 2, arg1);
            int[][] var5 = this.method1893(0, arg1, -93);
            int[][] var6 = this.method1893(1, arg1, -59);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var5[0];
            int[] var10 = var5[2];
            int[] var11 = var5[1];
            int[] var12 = var6[0];
            int[] var13 = var3[2];
            int[] var14 = var6[2];
            int[] var15 = var6[1];
            for (int var16 = 0; var16 < class98.field1598; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var9[var16];
                    var8[var16] = var11[var16];
                    var13[var16] = var10[var16];
                } else if (var17 == 0) {
                    var7[var16] = var12[var16];
                    var8[var16] = var15[var16];
                    var13[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var9[var16] * var17 + var12[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var15[var16] * var18 >> 12;
                    var13[var16] = var10[var16] * var17 + (var14[var16] * var18) >> 12;
                }
            }
        }
        field942++;
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)V", line = 206)
    public static final void method422(byte arg0) {
        class202.field3361.method793((byte) -121);
        class58.field1017.method793((byte) -65);
        if (arg0 == 101) {
            field949++;
        }
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 217)
    public class52() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)V", line = 223)
    public static void method423(byte arg0) {
        int var1 = 83 % ((26 - arg0) / 60);
        field943 = null;
        field952 = null;
        field944 = (int[][][]) null;
        field950 = null;
        field953 = null;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)Z", line = 238)
    public static final boolean method424(byte arg0) {
        if (arg0 >= -56) {
            return true;
        }
        field948++;
        class305 var1 = class157.field2648;
        synchronized (class157.field2648) {
            if (class265.field4553 == class232.field3877) {
                return false;
            } else {
                class57.field1011 = class249.field4178[class265.field4553];
                class272.field4669 = class274.field4712[class265.field4553];
                class265.field4553 = class265.field4553 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(B)V", line = 260)
    public static final void method425(byte arg0) {
        class110.field1762++;
        field947++;
        class47.field820.method1656(69, 16);
        for (class142 var1 = (class142) class135.field2266.method807(-123); var1 != null; var1 = (class142) class135.field2266.method806(116)) {
            if (var1.field2367 == 0) {
                class73.method535(true, -7700, var1);
            }
        }
        int var2 = -55 % ((-arg0 - 74) / 39);
        if (class31.field575 != null) {
            class164.method1280(false, class31.field575);
            class31.field575 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lwe;II)V", line = 292)
    public final void method40(class47 arg0, int arg1, int arg2) {
        field946++;
        if (arg1 == 2048 && arg2 == 0) {
            this.field4365 = arg0.method368(-111) == 1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILoh;)Z", line = 307)
    public static final boolean method426(int arg0, int arg1, class15 arg2) {
        field945++;
        byte[] var3 = arg2.method119(arg0, arg1);
        if (var3 == null) {
            return false;
        } else {
            class196.method1518(var3, (byte) 18);
            return true;
        }
    }
}
