import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class187 extends class261 {

    @OriginalMember(owner = "client!fa", name = "Q", descriptor = "I")
    private int field3018 = 4;

    @OriginalMember(owner = "client!fa", name = "P", descriptor = "I")
    private int field3017 = 4;

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!fa", name = "O", descriptor = "[I")
    public static int[] field3016 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "[Z")
    public static boolean[] field3008 = new boolean[100];

    @OriginalMember(owner = "client!fa", name = "R", descriptor = "[[B")
    public static byte[][] field3019 = new byte[250][];

    @OriginalMember(owner = "client!fa", name = "M", descriptor = "Lve;")
    private static class255 field3014 = class87.method607(80, "M");

    @OriginalMember(owner = "client!fa", name = "L", descriptor = "Lve;")
    public static class255 field3013 = field3014;

    @OriginalMember(owner = "client!fa", name = "W", descriptor = "[Lga;")
    public static class18[] field3024 = new class18[27];

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "Lve;")
    public static class255 field3009 = field3014;

    @OriginalMember(owner = "client!fa", name = "X", descriptor = "Lve;")
    public static class255 field3025 = class87.method607(115, "scrollbar");

    @OriginalMember(owner = "client!fa", name = "Y", descriptor = "[B")
    public static byte[] field3026 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!fa", name = "U", descriptor = "Lff;")
    public static class47 field3022 = new class47(16);

    @OriginalMember(owner = "client!fa", name = "ab", descriptor = "S")
    public static short field3028 = 256;

    @OriginalMember(owner = "client!fa", name = "bb", descriptor = "[I")
    public static int[] field3029 = new int[32];

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!fa", name = "N", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!fa", name = "S", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!fa", name = "T", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!fa", name = "V", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!fa", name = "Z", descriptor = "[I")
    public static int[] field3027;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[Lud;")
    public static class269[] field3007;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 12)
    public static void method1303(int arg0) {
        field3009 = null;
        field3007 = null;
        if (arg0 != -18951) {
            field3028 = 4;
        }
        field3027 = null;
        field3008 = null;
        field3025 = null;
        field3014 = null;
        field3022 = null;
        field3013 = null;
        field3026 = null;
        field3029 = null;
        field3024 = null;
        field3016 = null;
        field3019 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)[I", line = 51)
    public final int[] method21(byte arg0, int arg1) {
        field3010++;
        int[] var3 = this.field4425.method906(arg1, 8251);
        int var4 = 39 / ((-arg0 - 49) / 33);
        if (this.field4425.field2043) {
            int var5 = class92.field1576 / this.field3018;
            int var6 = class210.field3590 / this.field3017;
            int[] var8;
            if (var6 > 0) {
                int var7 = arg1 % var6;
                var8 = this.method1822(0, 125, class210.field3590 * var7 / var6);
            } else {
                var8 = this.method1822(0, 61, 0);
            }
            for (int var9 = 0; var9 < class92.field1576; var9++) {
                if (var5 > 0) {
                    int var10 = var9 % var5;
                    var3[var9] = var8[class92.field1576 * var10 / var5];
                } else {
                    var3[var9] = var8[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lve;Z)I", line = 104)
    public static final int method1304(class255 arg0, boolean arg1) {
        field3015++;
        if (class266.field4506 == null || arg0.method1774(-41) == 0) {
            return -1;
        } else if (arg1) {
            return 24;
        } else {
            for (int var2 = 0; var2 < class266.field4506.field846; var2++) {
                if (class266.field4506.field854[var2].method1775(class279.field4782, class148.field2506, -1).method1737(19655, arg0)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V", line = 133)
    public class187() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lci;Z)V", line = 137)
    public static final void method1305(class189 arg0, boolean arg1) {
        arg0.field3031 = false;
        field3020++;
        if (arg0.field3032 != null) {
            arg0.field3032.field4909 = 0;
        }
        if (!arg1) {
            field3011 = -14;
        }
        for (class189 var2 = arg0.method374(); var2 != null; var2 = arg0.method365()) {
            method1305(var2, true);
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lrg;B)V", line = 164)
    public static final void method1306(class88 arg0, byte arg1) {
        field3023++;
        if (class46.field692) {
            return;
        }
        if (class281.field4827) {
            class126.method933();
        } else {
            class175.method1250();
        }
        class157.field2665 = class51.method300(116, arg0, class256.field4372);
        int var2 = class201.field3479;
        int var3 = var2 * 956 / 503;
        class157.field2665.method572((class210.field3589 - var3) / 2, 0, var3, var2);
        class54.field859 = class195.method1395(class308.field5249, 26773, arg0);
        class54.field859.method28(class210.field3589 / 2 - (class54.field859.field70 / 2), 18);
        class46.field692 = true;
        if (arg1 != -98) {
            field3016 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(ZI)[[I", line = 197)
    public final int[][] method13(boolean arg0, int arg1) {
        if (!arg0) {
            method1306((class88) null, (byte) -75);
        }
        int[][] var3 = this.field4418.method35(arg1, 108);
        if (this.field4418.field94) {
            int var4 = class210.field3590 / this.field3017;
            int var5 = class92.field1576 / this.field3018;
            int[][] var7;
            if (var4 > 0) {
                int var6 = arg1 % var4;
                var7 = this.method1819(-116, 0, class210.field3590 * var6 / var4);
            } else {
                var7 = this.method1819(70, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[0];
            int[] var12 = var3[2];
            int[] var13 = var3[1];
            for (int var14 = 0; var14 < class92.field1576; var14++) {
                int var16;
                if (var5 > 0) {
                    int var15 = var14 % var5;
                    var16 = class92.field1576 * var15 / var5;
                } else {
                    var16 = 0;
                }
                var11[var14] = var8[var16];
                var13[var14] = var9[var16];
                var12[var14] = var10[var16];
            }
        }
        field3021++;
        return var3;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lpb;BI)V", line = 274)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        field3012++;
        if (arg1 >= -115) {
            return;
        }
        if (arg2 == 0) {
            this.field3018 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field3017 = arg0.method481(0);
        }
    }
}
