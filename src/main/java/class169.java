import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class169 extends class53 {

    @OriginalMember(owner = "client!im", name = "Y", descriptor = "I")
    private int field2849 = 0;

    @OriginalMember(owner = "client!im", name = "X", descriptor = "I")
    private int field2848 = 0;

    @OriginalMember(owner = "client!im", name = "db", descriptor = "I")
    private int field2854 = 0;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "[Z")
    public static boolean[] field2841 = new boolean[5];

    @OriginalMember(owner = "client!im", name = "R", descriptor = "[Lwc;")
    public static class96[] field2842 = new class96[2048];

    @OriginalMember(owner = "client!im", name = "Z", descriptor = "S")
    public static short field2850 = 205;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "I")
    private int field2837;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!im", name = "O", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    private int field2840;

    @OriginalMember(owner = "client!im", name = "S", descriptor = "I")
    private int field2843;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    private int field2844;

    @OriginalMember(owner = "client!im", name = "V", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!im", name = "W", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!im", name = "ab", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!im", name = "bb", descriptor = "I")
    private int field2852;

    @OriginalMember(owner = "client!im", name = "cb", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "[Lje;")
    public static class68[] field2845;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(IIII)V", line = 5)
    private final void method1246(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 > 2048 ? arg1 + arg3 - (arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (arg2 != 4) {
            this.method1246(-14, 61, -113, -128);
        }
        field2838++;
        if (var5 <= 0) {
            this.field2844 = this.field2840 = this.field2847 = arg1;
            return;
        }
        int var6 = arg0 * 6;
        int var7 = arg1 + arg1 - var5;
        int var8 = var6 >> 12;
        int var9 = (var5 - var7 << 12) / var5;
        int var11 = var6 - (var8 << 12);
        int var12 = var9 * var5 >> 12;
        int var13 = var11 * var12 >> 12;
        int var14 = var5 - var13;
        int var15 = var7 + var13;
        if (var8 == 0) {
            this.field2847 = var7;
            this.field2840 = var15;
            this.field2844 = var5;
        } else if (var8 == 1) {
            this.field2847 = var7;
            this.field2844 = var14;
            this.field2840 = var5;
        } else if (var8 == 2) {
            this.field2847 = var15;
            this.field2840 = var5;
            this.field2844 = var7;
        } else if (var8 == 3) {
            this.field2840 = var14;
            this.field2847 = var5;
            this.field2844 = var7;
        } else if (var8 == 4) {
            this.field2844 = var15;
            this.field2840 = var7;
            this.field2847 = var5;
        } else if (var8 == 5) {
            this.field2847 = var14;
            this.field2844 = var5;
            this.field2840 = var7;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILja;Z)V", line = 124)
    public final void method54(int arg0, class60 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2854 = arg1.method487((byte) -112);
        } else if (arg0 == 1) {
            this.field2848 = (arg1.method511(-119) << 12) / 100;
        } else if (arg0 == 2) {
            this.field2849 = (arg1.method511(-127) << 12) / 100;
        }
        if (!arg2) {
            this.method54(-25, (class60) null, false);
        }
        field2853++;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "()V", line = 185)
    public class169() {
        super(1, false);
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(IIII)V", line = 190)
    private final void method1247(int arg0, int arg1, int arg2, int arg3) {
        field2851++;
        int var5 = arg3 <= arg2 ? arg2 : arg3;
        int var6 = var5 < arg1 ? arg1 : var5;
        int var7 = arg3 >= arg2 ? arg2 : arg3;
        if (arg0 != -21397) {
            method1248(false);
        }
        int var8 = var7 <= arg1 ? var7 : arg1;
        int var9 = var6 - var8;
        this.field2837 = (var6 + var8) / 2;
        if (this.field2837 > 0 && this.field2837 < 4096) {
            this.field2843 = (var9 << 12) / (this.field2837 <= 2048 ? this.field2837 * 2 : 8192 - (this.field2837 * 2));
        } else {
            this.field2843 = 0;
        }
        if (var9 <= 0) {
            this.field2852 = 0;
            return;
        }
        int var10 = (var6 - arg3 << 12) / var9;
        int var11 = (var6 - arg1 << 12) / var9;
        int var12 = (var6 - arg2 << 12) / var9;
        if (arg3 == var6) {
            this.field2852 = arg2 == var8 ? var11 + 20480 : -var12 + 4096;
        } else if (arg2 == var6) {
            this.field2852 = arg1 == var8 ? var10 + 4096 : -var11 + 12288;
        } else {
            this.field2852 = arg3 == var8 ? var12 + 12288 : -var10 + 20480;
        }
        this.field2852 /= 6;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[[I", line = 253)
    public final int[][] method66(int arg0, int arg1) {
        int var3 = -105 % ((76 - arg1) / 42);
        field2839++;
        int[][] var4 = this.field882.method874(false, arg0);
        if (this.field882.field1935) {
            int[][] var5 = this.method388(102, 0, arg0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var5[2];
            int[] var11 = var4[2];
            for (int var12 = 0; var12 < class269.field4644; var12++) {
                this.method1247(-21397, var10[var12], var7[var12], var6[var12]);
                this.field2843 += this.field2848;
                for (this.field2852 += this.field2854; this.field2852 < 0; this.field2852 += 4096) {
                }
                while (this.field2852 > 4096) {
                    this.field2852 -= 4096;
                }
                this.field2837 += this.field2849;
                if (this.field2843 < 0) {
                    this.field2843 = 0;
                }
                if (this.field2843 > 4096) {
                    this.field2843 = 4096;
                }
                if (this.field2837 < 0) {
                    this.field2837 = 0;
                }
                if (this.field2837 > 4096) {
                    this.field2837 = 4096;
                }
                this.method1246(this.field2852, this.field2837, 4, this.field2843);
                var8[var12] = this.field2844;
                var9[var12] = this.field2840;
                var11[var12] = this.field2847;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V", line = 326)
    public static void method1248(boolean arg0) {
        field2841 = null;
        field2842 = null;
        field2845 = null;
        if (!arg0) {
            field2845 = (class68[]) null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "([Ljava/lang/Object;I[I)V", line = 345)
    public static final void method1249(Object[] arg0, int arg1, int[] arg2) {
        field2846++;
        class270.method1934(arg0, 0, 109, arg2, arg2.length - 1);
        int var3 = -44 / ((arg1 + 91) / 33);
    }
}
