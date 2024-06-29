import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class28 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lij;")
    public static class50 field596 = class78.method578(122, "blaugr-Un:");

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Z")
    public static volatile boolean field599 = true;

    @OriginalMember(owner = "client!cj", name = "m", descriptor = "[I")
    public static int[] field602 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lij;")
    public static class50 field592 = class78.method578(123, " loggt sich aus)3");

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public int field593;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "I")
    public int field597;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "[Lea;")
    public static class67[] field601;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field600++;
        int var9 = arg7 - arg0;
        int var10 = arg5 - arg3;
        int var11 = (arg1 - arg2 << 16) / var10;
        boolean var12;
        if (class126.field2205 > 0 && (class126.field2205 % 10) < 5) {
            var12 = true;
        } else {
            var12 = false;
        }
        int var13 = (arg6 - arg8 << 16) / var9;
        for (int var14 = 0; var14 < var10; var14++) {
            int var31 = (var14 + 1) * var11 >> 16;
            int var32 = var11 * var14 >> 16;
            int var33 = var31 - var32;
            if (var33 > 0) {
                int[][] var34 = class210.field3483[arg3 + var14 >> 6];
                int var10000 = arg2 + var31;
                int var36 = arg2 + var32;
                for (int var37 = 0; var37 < var9; var37++) {
                    int var38 = var13 * var37 >> 16;
                    int var39 = (var37 + 1) * var13 >> 16;
                    int var40 = var39 - var38;
                    if (var40 > 0) {
                        var10000 = arg8 + var39;
                        int var42 = arg8 + var38;
                        int var43 = arg0 + var37 >> 6;
                        if (var34[var43] != null) {
                            int var44 = ((arg0 + var37 & 0x3F) << 6) + (arg3 + var14 & 0x3F);
                            int var45 = var34[var43][var44];
                            if (var45 != 0) {
                                class243 var46 = class53.method426((byte) -90, var45 - 1);
                                if (var12 && class206.field3410 == var46.field4179) {
                                    class1 var47 = new class1();
                                    var47.field9 = var36;
                                    var47.field4 = var46.field4179;
                                    var47.field8 = var42;
                                    class219.field3660.method684(var47, (byte) 109);
                                }
                                class109.field1967[var46.field4179].method673(var36 - 7, var42 + -7);
                            }
                        }
                    }
                }
            }
        }
        if (class252.field4369 == class2.field20) {
            for (class129 var15 = (class129) class172.field2858.method689(1001); var15 != null; var15 = (class129) class172.field2858.method688(arg4 + 469890469)) {
                int var16 = var15.field2258;
                int var17 = var15.field2265;
                int var18 = class46.field847 + class140.field2460 - var16;
                int var19 = 16777215;
                int var20 = (var18 - arg0) * (arg6 - arg8) / (arg7 - arg0) + arg8;
                int var21 = var17 - class90.field1714;
                int var22 = arg2 + ((arg1 - arg2) * (var21 - arg3) / (arg5 - arg3));
                class143 var23 = null;
                int var24 = var15.field2266;
                if (var24 == 0) {
                    if (class2.field20 == 3.0D) {
                        var23 = class25.field546;
                    }
                    if (class2.field20 == 4.0D) {
                        var23 = class206.field3422;
                    }
                    if (class2.field20 == 6.0D) {
                        var23 = class24.field531;
                    }
                    if (class2.field20 == 8.0D) {
                        var23 = class221.field3707;
                    }
                }
                if (var24 == 1) {
                    if (class2.field20 == 3.0D) {
                        var23 = class24.field531;
                    }
                    if (class2.field20 == 4.0D) {
                        var23 = class221.field3707;
                    }
                    if (class2.field20 == 6.0D) {
                        var23 = class41.field750;
                    }
                    if (class2.field20 == 8.0D) {
                        var23 = class199.field3285;
                    }
                }
                if (var24 == 2) {
                    var19 = 16755200;
                    if (class2.field20 == 3.0D) {
                        var23 = class41.field750;
                    }
                    if (class2.field20 == 4.0D) {
                        var23 = class199.field3285;
                    }
                    if (class2.field20 == 6.0D) {
                        var23 = class236.field3964;
                    }
                    if (class2.field20 == 8.0D) {
                        var23 = class209.field3468;
                    }
                }
                if (var23 != null) {
                    class50[] var25 = var15.field2256;
                    int var26 = var25.length;
                    int var27 = var20 - var23.method999() * (var26 - 1) / 2;
                    int var28 = var27 + var23.method1002() / 2;
                    for (int var29 = 0; var29 < var26; var29++) {
                        var23.method1004(var25[var29], var22, var28, var19, true);
                        var28 += var23.method999();
                    }
                }
            }
        }
        class1 var30 = (class1) class219.field3660.method689(1001);
        if (arg4 != -469890544) {
            return;
        }
        while (var30 != null) {
            class109.field1967[var30.field4].method673(var30.field9 - 7, var30.field8 + -7);
            class158.method1116(var30.field9, var30.field8, 15, 16776960, 128);
            class158.method1116(var30.field9, var30.field8, 7, 16777215, 256);
            var30 = (class1) class219.field3660.method688(-65);
        }
        class219.field3660.method680((byte) -68);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(B)V")
    public static void method252(byte arg0) {
        field602 = null;
        field596 = null;
        field592 = null;
        int var1 = -117 % ((arg0 - 57) / 51);
        field601 = null;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLce;)V")
    public static final void method253(byte arg0, class10 arg1) {
        if (arg0 <= 99) {
            field602 = null;
        }
        field594++;
        class10 var2 = class49.method360((byte) 93, arg1);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class136.field2370;
            var4 = class1.field1;
        } else {
            var4 = var2.field243;
            var3 = var2.field242;
        }
        class108.method801(var3, var4, false, arg1, (byte) 102);
        class5.method31(var3, arg1, var4, (byte) 6);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILwd;I)V")
    private final void method254(int arg0, class217 arg1, int arg2) {
        if (arg0 == 1) {
            this.field591 = arg1.method1441(-55);
            this.field597 = arg1.method1487(255);
            this.field593 = arg1.method1487(255);
        }
        field590++;
        if (arg2 != 2) {
            this.method254(-26, (class217) null, -39);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILwd;)V")
    public final void method255(int arg0, class217 arg1) {
        if (arg0 >= -81) {
            field596 = null;
        }
        field598++;
        while (true) {
            int var3 = arg1.method1487(255);
            if (var3 == 0) {
                return;
            }
            this.method254(var3, arg1, 2);
        }
    }
}
