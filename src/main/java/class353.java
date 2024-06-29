import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class353 extends class343 {

    @OriginalMember(owner = "client!ob", name = "P", descriptor = "Ljava/lang/Object;")
    private Object field5619;

    @OriginalMember(owner = "client!ob", name = "N", descriptor = "[I")
    public static int[] field5617 = new int[2500];

    @OriginalMember(owner = "client!ob", name = "U", descriptor = "Ljava/lang/String;")
    public static String field5622 = "Drop";

    @OriginalMember(owner = "client!ob", name = "O", descriptor = "I")
    public static int field5618 = 10;

    @OriginalMember(owner = "client!ob", name = "L", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ob", name = "S", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ob", name = "W", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ob", name = "X", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ob", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field5623;

    @OriginalMember(owner = "client!ob", name = "Q", descriptor = "[[[Ljj;")
    public static class50[][][] field5620;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 7)
    public static void method2464(byte arg0) {
        field5622 = null;
        int var1 = -40 / ((6 - arg0) / 60);
        field5623 = null;
        field5620 = (class50[][][]) null;
        field5617 = null;
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)I", line = 20)
    public static final int method2465(int arg0) {
        if (arg0 == 81) {
            field5624++;
            return class148.field2397 && class294.field4896[81] && class117.field1701 > 2 ? class109.field1622[class117.field1701 - 2] : class109.field1622[class117.field1701 - 1];
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BLfh;)Lmh;", line = 35)
    public static final class302 method2466(byte arg0, class313 arg1) {
        field5625++;
        return arg0 == -35 ? new class302(arg1.method2214(0), arg1.method2214(arg0 ^ 0xFFFFFFDD), arg1.method2214(0), arg1.method2214(0), arg1.method2249(-41), arg1.method2224(arg0 - 92)) : (class302) null;
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 46)
    public final Object method328(int arg0) {
        if (arg0 != 2718) {
            field5623 = (String[]) null;
        }
        field5616++;
        return this.field5619;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 67)
    public class353(Object arg0) {
        this.field5619 = arg0;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(III)Z", line = 78)
    public static final boolean method2467(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class143.field2299; var3++) {
            class186 var4 = class28.field433[var3];
            if (var4.field2904 == 1) {
                int var5 = var4.field2881 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2879 * var5 >> 8) + var4.field2894;
                    int var7 = (var4.field2891 * var5 >> 8) + var4.field2889;
                    int var8 = (var4.field2883 * var5 >> 8) + var4.field2901;
                    int var9 = (var4.field2888 * var5 >> 8) + var4.field2878;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2904 == 2) {
                int var10 = arg0 - var4.field2881;
                if (var10 > 0) {
                    int var11 = (var4.field2879 * var10 >> 8) + var4.field2894;
                    int var12 = (var4.field2891 * var10 >> 8) + var4.field2889;
                    int var13 = (var4.field2883 * var10 >> 8) + var4.field2901;
                    int var14 = (var4.field2888 * var10 >> 8) + var4.field2878;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2904 == 3) {
                int var15 = var4.field2894 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2897 * var15 >> 8) + var4.field2881;
                    int var17 = (var4.field2885 * var15 >> 8) + var4.field2902;
                    int var18 = (var4.field2883 * var15 >> 8) + var4.field2901;
                    int var19 = (var4.field2888 * var15 >> 8) + var4.field2878;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2904 == 4) {
                int var20 = arg2 - var4.field2894;
                if (var20 > 0) {
                    int var21 = (var4.field2897 * var20 >> 8) + var4.field2881;
                    int var22 = (var4.field2885 * var20 >> 8) + var4.field2902;
                    int var23 = (var4.field2883 * var20 >> 8) + var4.field2901;
                    int var24 = (var4.field2888 * var20 >> 8) + var4.field2878;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2904 == 5) {
                int var25 = arg1 - var4.field2901;
                if (var25 > 0) {
                    int var26 = (var4.field2897 * var25 >> 8) + var4.field2881;
                    int var27 = (var4.field2885 * var25 >> 8) + var4.field2902;
                    int var28 = (var4.field2879 * var25 >> 8) + var4.field2894;
                    int var29 = (var4.field2891 * var25 >> 8) + var4.field2889;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(III)Loe;", line = 200)
    public static final class86 method2468(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class86 var4 = var3.field733;
            var3.field733 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)Z", line = 215)
    public final boolean method329(int arg0) {
        field5621++;
        if (arg0 != 21764) {
            method2465(12);
        }
        return false;
    }
}
