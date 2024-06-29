import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public class class388 extends class28 {

    @OriginalMember(owner = "client!cr", name = "s", descriptor = "[I")
    public int[] field5622;

    @OriginalMember(owner = "client!cr", name = "o", descriptor = "[I")
    public int[] field5618;

    @OriginalMember(owner = "client!cr", name = "m", descriptor = "[[I")
    public static int[][] field5616 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!cr", name = "p", descriptor = "I")
    public static int field5619 = 0;

    @OriginalMember(owner = "client!cr", name = "q", descriptor = "I")
    public static int field5620 = 0;

    @OriginalMember(owner = "client!cr", name = "t", descriptor = "Z")
    public static boolean field5623 = true;

    @OriginalMember(owner = "client!cr", name = "l", descriptor = "[I")
    public static int[] field5615 = new int[4096];

    @OriginalMember(owner = "client!cr", name = "i", descriptor = "Lsk;")
    public static class423 field5612 = new class423("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!cr", name = "j", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!cr", name = "k", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!cr", name = "n", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!cr", name = "r", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IB)V")
    public static final void method2307(int arg0, byte arg1) {
        field5621++;
        int var2 = -71 % ((20 - arg1) / 59);
        if (class376.method2264((byte) -128, arg0)) {
            class131.method872((byte) 96, class409.field5933[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lft;IIILqq;)V")
    public static final void method2308(class4 arg0, int arg1, int arg2, int arg3, class318 arg4) {
        class177.field2772.method13(false);
        field5617++;
        if (class222.field3429) {
            return;
        }
        if (arg2 != 430399648) {
            method2309(-64, (byte) -13, 35);
        }
        for (class334 var5 = (class334) arg0.method8((byte) -98); var5 != null; var5 = (class334) arg0.method17((byte) 41)) {
            class173 var6 = class492.field7472.method1840((byte) 90, var5.field4985);
            if (class387.method2304(var6, (byte) 125)) {
                boolean var7 = class442.method2629(var5, arg3, arg4, arg1, var6, 28531);
                if (var7) {
                    class326.method2034((byte) 50, var6, var5, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(IBI)I")
    public static final int method2309(int arg0, byte arg1, int arg2) {
        if (arg1 <= 58) {
            return -51;
        } else {
            field5614++;
            return arg2 == 1 || arg2 == 3 ? class215.field3331[arg0 & 0x3] : class20.field255[arg0 & 0x3];
        }
    }

    @OriginalMember(owner = "client!cr", name = "a", descriptor = "(ILqq;)V")
    public static final void method2310(int arg0, class318 arg1) {
        field5613++;
        if (!(class330.field4948 >= 2 || class306.field4636) || class450.field6931 != null) {
            return;
        }
        int var2 = 87 / ((arg0 + 64) / 43);
        String var3;
        if (class306.field4636 && class330.field4948 < 2) {
            var3 = class28.field357 + class467.field7159.method2473(class406.field5898, -98) + class200.field3175 + " ->";
        } else if (class440.field6454 && class308.field4662.method1650(81, 27365) && class330.field4948 > 2) {
            var3 = class442.method2635((byte) 92, (class2) class329.field4932.field45.field2795.field2795);
        } else {
            class2 var4 = (class2) class329.field4932.field45.field2795;
            var3 = class442.method2635((byte) 92, var4);
            int[] var5 = null;
            if (class395.method2344(-14262, var4.field17)) {
                var5 = class288.field4362.method3030((byte) 51, (int) var4.field12).field2836;
            } else if (var4.field19 != -1) {
                var5 = class288.field4362.method3030((byte) 98, var4.field19).field2836;
            } else if (class448.method2681(23208, var4.field17)) {
                class249 var8 = class195.field3085[(int) var4.field12];
                if (var8 != null) {
                    class245 var9 = var8.field3819;
                    if (var9.field3703 != null) {
                        var9 = var9.method1477(class273.field4144, -12819);
                    }
                    if (var9 != null) {
                        var5 = var9.field3744;
                    }
                }
            } else if (class34.method200(var4.field17, -47)) {
                Object var6 = null;
                class56 var7;
                if (var4.field17 == 1009) {
                    var7 = class128.field2070.method916((byte) -15, (int) var4.field12);
                } else {
                    var7 = class128.field2070.method916((byte) -15, (int) (var4.field12 >>> 32 & 0x7FFFFFFFL));
                }
                if (var7.field892 != null) {
                    var7 = var7.method393(class273.field4144, (byte) -123);
                }
                if (var7 != null) {
                    var5 = var7.field879;
                }
            }
            if (var5 != null) {
                var3 = var3 + class99.method746(var5, (byte) 53);
            }
        }
        if (class330.field4948 > 2) {
            var3 = var3 + "<col=ffffff> / " + (class330.field4948 - 2) + class439.field6441.method2473(class406.field5898, -84);
        }
        if (class73.field1312 != null) {
            class488 var10 = class73.field1312.method2515(0, arg1);
            if (var10 == null) {
                var10 = class493.field7514;
            }
            var10.method2947(-61, class73.field1312.field6166, class73.field1312.field6202, class139.field2283, var3, class215.field3321, class73.field1312.field6175, class156.field2452, class73.field1312.field6151, class221.field3417, class496.field7529, class107.field1869, class73.field1312.field6126, class302.field4562, class73.field1312.field6162);
            class323.method2017(class139.field2283[1], class139.field2283[3], true, class139.field2283[2], class139.field2283[0]);
        } else if (class98.field1776 != null && class329.field4936 == class298.field4512) {
            int var11 = class493.field7514.method2937(16777215, 0, class156.field2452, class302.field4562, class158.field2492 + 16, class313.field4740 + 4, class107.field1869, var3, class215.field3321, -80);
            class323.method2017(class158.field2492, 16, true, var11 + class512.field7764.method2349(var3, 0), class313.field4740 - -4);
        }
    }

    @OriginalMember(owner = "client!cr", name = "b", descriptor = "(B)V")
    public static void method2311(byte arg0) {
        if (arg0 < -16) {
            field5616 = null;
            field5615 = null;
            field5612 = null;
        }
    }

    @OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(II[I[I)V")
    public class388(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5622 = arg2;
        this.field5618 = arg3;
    }
}
