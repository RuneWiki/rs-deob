import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class132 extends class157 {

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "I")
    private int field2518 = 4096;

    @OriginalMember(owner = "client!dd", name = "Z", descriptor = "I")
    private int field2528 = 409;

    @OriginalMember(owner = "client!dd", name = "W", descriptor = "[I")
    private int[] field2525 = new int[3];

    @OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
    private int field2536 = 4096;

    @OriginalMember(owner = "client!dd", name = "fb", descriptor = "I")
    private int field2534 = 4096;

    @OriginalMember(owner = "client!dd", name = "U", descriptor = "I")
    public static int field2523 = 0;

    @OriginalMember(owner = "client!dd", name = "bb", descriptor = "Lcc;")
    public static class209 field2530 = class95.method669(84, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!dd", name = "ab", descriptor = "[[B")
    public static byte[][] field2529 = new byte[50][];

    @OriginalMember(owner = "client!dd", name = "S", descriptor = "Lcc;")
    private static class209 field2521 = class95.method669(96, "Connection lost)3");

    @OriginalMember(owner = "client!dd", name = "Y", descriptor = "[I")
    public static int[] field2527 = new int[50];

    @OriginalMember(owner = "client!dd", name = "db", descriptor = "Z")
    public static boolean field2532 = false;

    @OriginalMember(owner = "client!dd", name = "gb", descriptor = "I")
    public static volatile int field2535 = 0;

    @OriginalMember(owner = "client!dd", name = "ib", descriptor = "Lcc;")
    public static class209 field2537 = field2521;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!dd", name = "Q", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!dd", name = "R", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!dd", name = "T", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!dd", name = "V", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!dd", name = "X", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!dd", name = "cb", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!dd", name = "eb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!dd", name = "jb", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "(I)V")
    public static void method930(int arg0) {
        field2529 = null;
        field2527 = null;
        field2530 = null;
        field2521 = null;
        if (arg0 < 15) {
            field2530 = null;
        }
        field2537 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)I")
    public static final int method931(int arg0, int arg1) {
        if (arg0 != 10500) {
            field2535 = 64;
        }
        ++field2522;
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        ++field2524;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            int var5 = arg2.method776(126);
                            this.field2525[0] = class27.method220(16711680, var5) << 4;
                            this.field2525[2] = class27.method220(var5, 255) >> 12;
                            this.field2525[1] = class27.method220(65280, var5) >> 4;
                        }
                    } else {
                        this.field2536 = arg2.method736(121);
                    }
                } else {
                    this.field2534 = arg2.method736(121);
                }
            } else {
                this.field2518 = arg2.method736(126);
            }
        } else {
            this.field2528 = arg2.method736(127);
        }
        if (arg1 >= -29) {
            field2527 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static final void method932(byte arg0) {
        if (arg0 != -51) {
            method930(-34);
        }
        ++field2517;
        for (int var1 = 0; class244.field4423 > var1; ++var1) {
            int var2 = class211.field3840[var1];
            class108 var3 = class103.field1993[var2];
            int var4 = client.field2818.method774((byte) 80);
            if (~(var4 & 64) != -1) {
                var4 += client.field2818.method774((byte) 96) << 8;
            }
            class246.method1716(var2, 0, var4, var3);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[[I")
    public final int[][] method250(int arg0, int arg1) {
        if (arg0 != 1) {
            this.field2525 = null;
        }
        ++field2520;
        int[][] var3 = super.field2872.method533(arg1, 3);
        if (super.field2872.field1434) {
            int[][] var4 = this.method1093(arg1, 0, 64);
            int[] var5 = var4[0];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class226.field4124; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field2525[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field2528 < var13) {
                    var7[var11] = var12;
                    var6[var11] = var9[var11];
                    var10[var11] = var8[var11];
                } else {
                    int var14 = var9[var11];
                    int var15 = var14 - this.field2525[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field2528 > ~var15) {
                        var7[var11] = var12;
                        var6[var11] = var14;
                        var10[var11] = var8[var11];
                    } else {
                        int var16 = var8[var11];
                        int var17 = var16 - this.field2525[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field2528) {
                            var7[var11] = var12;
                            var6[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var7[var11] = this.field2536 * var12 >> 12;
                            var6[var11] = this.field2534 * var14 >> 12;
                            var10[var11] = this.field2518 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)Loa;")
    public static final class98 method933(int arg0, byte arg1) {
        ++field2526;
        int var2 = -55 % ((53 - arg1) / 39);
        class98 var3 = (class98) class98.field1908.method1257((long) arg0, -111);
        if (var3 != null) {
            return var3;
        } else {
            byte[] var4 = class93.field1847.method353(arg0, -53, 26);
            class98 var5 = new class98();
            if (var4 != null) {
                var5.method687(-1, new class106(var4));
            }
            class98.field1908.method1259((long) arg0, var5, false);
            return var5;
        }
    }
}
