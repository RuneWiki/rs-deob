import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class238 extends class86 {

    @OriginalMember(owner = "client!g", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3680 = "Started 3d Library";

    @OriginalMember(owner = "client!g", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3688 = "M";

    @OriginalMember(owner = "client!g", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field3692 = new String[100];

    @OriginalMember(owner = "client!g", name = "Z", descriptor = "[J")
    public static long[] field3694 = new long[1000];

    @OriginalMember(owner = "client!g", name = "bb", descriptor = "I")
    public static int field3696 = 0;

    @OriginalMember(owner = "client!g", name = "ab", descriptor = "I")
    public static int field3695 = 0;

    @OriginalMember(owner = "client!g", name = "W", descriptor = "Z")
    public static boolean field3691 = false;

    @OriginalMember(owner = "client!g", name = "M", descriptor = "F")
    public static float field3682;

    @OriginalMember(owner = "client!g", name = "L", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!g", name = "N", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!g", name = "O", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!g", name = "R", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!g", name = "S", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!g", name = "V", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!g", name = "Q", descriptor = "Lrg;")
    public static class342 field3685;

    @OriginalMember(owner = "client!g", name = "U", descriptor = "Lpl;")
    public static class344 field3689;

    @OriginalMember(owner = "client!g", name = "Y", descriptor = "[Lvh;")
    private class154[] field3693;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IZLug;)V", line = 6)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field3690++;
        if (arg1) {
            field3680 = (String) null;
        }
        if (arg0 == 0) {
            this.field3693 = new class154[arg2.method281(87)];
            for (int var4 = 0; var4 < this.field3693.length; var4++) {
                int var5 = arg2.method281(31);
                if (var5 == 0) {
                    this.field3693[var4] = class115.method989(arg2, (byte) -101);
                } else if (var5 == 1) {
                    this.field3693[var4] = class338.method2376(arg2, -19396);
                } else if (var5 == 2) {
                    this.field3693[var4] = class79.method723(arg2, (byte) 27);
                } else if (var5 == 3) {
                    this.field3693[var4] = class253.method1881(arg2, (byte) 21);
                }
            }
        } else if (arg0 == 1) {
            this.field1228 = arg2.method281(-128) == 1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I[[I)V", line = 86)
    private final void method1765(int arg0, int[][] arg1) {
        field3681++;
        if (arg0 != -16222) {
            field3688 = (String) null;
        }
        int var3 = class93.field1424;
        int var4 = class181.field2836;
        class151.method1256(false, arg1);
        class192.method1467(class313.field4848, 0, 0, 5, class280.field4324);
        if (this.field3693 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3693.length; var5++) {
            class154 var6 = this.field3693[var5];
            int var7 = var6.field2496;
            int var8 = var6.field2498;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method1268(var3, 124, var4);
                }
            } else if (var8 < 0) {
                var6.method1265(var3, (byte) -95, var4);
            } else {
                var6.method1269(var3, (byte) 69, var4);
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(II)Ljava/lang/String;", line = 136)
    public static final String method1766(int arg0, int arg1) {
        field3684++;
        return arg1 <= arg0 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(IB)[[I", line = 151)
    public final int[][] method156(int arg0, byte arg1) {
        int[][] var3 = this.field1227.method2025(false, arg0);
        if (this.field1227.field4277) {
            int var4 = class93.field1424;
            int var5 = class181.field2836;
            int[][][] var6 = this.field1227.method2023((byte) -107);
            int[][] var7 = new int[var5][var4];
            this.method1765(-16222, var7);
            for (int var8 = 0; var8 < class181.field2836; var8++) {
                int[][] var9 = var6[var8];
                int[] var10 = var9[0];
                int[] var11 = var9[1];
                int[] var12 = var7[var8];
                int[] var13 = var9[2];
                for (int var14 = 0; var14 < class93.field1424; var14++) {
                    int var15 = var12[var14];
                    var13[var14] = class301.method2169(255, var15) << 4;
                    var11[var14] = class301.method2169(65280, var15) >> 4;
                    var10[var14] = class301.method2169(16711680, var15) >> 12;
                }
            }
        }
        field3683++;
        if (arg1 >= -126) {
            field3695 = -82;
        }
        return var3;
    }

    @OriginalMember(owner = "client!g", name = "g", descriptor = "(I)V", line = 210)
    public static void method1767(int arg0) {
        field3694 = null;
        field3685 = null;
        if (arg0 != 2217) {
            method1768((byte) -74, 20, 27);
        }
        field3680 = null;
        field3689 = null;
        field3692 = null;
        field3688 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(BII)V", line = 239)
    public static final void method1768(byte arg0, int arg1, int arg2) {
        field3686++;
        if (class328.method2321(arg0 ^ 0x1C, arg2)) {
            if (arg0 != 28) {
                method1766(89, 96);
            }
            class38.method381(arg1, -2, class334.field5108[arg2]);
        }
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "()V", line = 255)
    public class238() {
        super(0, true);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(II)[I", line = 268)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            method1766(-105, -67);
        }
        int[] var3 = this.field1225.method1914(arg0, 109);
        if (this.field1225.field3995) {
            this.method1765(-16222, this.field1225.method1909((byte) 84));
        }
        field3687++;
        return var3;
    }
}
