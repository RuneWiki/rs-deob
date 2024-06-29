import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class54 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "J")
    public long field787 = 0L;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lsk;")
    public static class199 field785 = new class199(50);

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "[I")
    public static int[] field791 = new int[2];

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "Lmh;")
    public static class62 field794 = class201.method1405(true, "Ausw-=hlen");

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field795 = 0;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "Lof;")
    public static class240 field797 = new class240(0, 0);

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "[I")
    public static int[] field799 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "Lmh;")
    public static class62 field801 = class201.method1405(true, "Mem:");

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public int field789;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public int field790;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public int field796;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field798;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Ljm;")
    public class123 field786;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Ljm;")
    public class123 field788;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "[I")
    public static int[] field800;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "[[B")
    public static byte[][] field802;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 4)
    public static final void method352(int arg0, int arg1) {
        class166 var2 = class256.field4320[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class166 var4 = class256.field4320[var3][arg0][arg1] = class256.field4320[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2717--;
                for (int var5 = 0; var5 < var4.field2724; var5++) {
                    class164 var6 = var4.field2713[var5];
                    if ((var6.field2668 >> 29 & 0x3L) == 2L && var6.field2651 == arg0 && var6.field2670 == arg1) {
                        var6.field2660--;
                    }
                }
            }
        }
        if (class256.field4320[0][arg0][arg1] == null) {
            class256.field4320[0][arg0][arg1] = new class166(0, arg0, arg1);
        }
        class256.field4320[0][arg0][arg1].field2707 = var2;
        class256.field4320[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIIIIII)V", line = 41)
    public static final void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg6 == arg9 && arg3 == arg7 && arg0 == arg5 && arg2 == arg8) {
            class101.method806(arg4, arg7, (byte) 66, arg0, arg8, arg6);
        } else {
            int var10 = arg6;
            int var11 = arg6 * 3;
            int var12 = arg9 * 3;
            int var13 = arg7;
            int var14 = arg7 * 3;
            int var15 = arg3 * 3;
            int var16 = arg5 * 3;
            int var17 = arg2 * 3;
            int var18 = arg0 + var12 - var16 - arg6;
            int var19 = var15 + arg8 - arg7 - var17;
            int var20 = var14 + var17 - var15 - var15;
            int var21 = var11 + (var16 - var12) - var12;
            int var22 = var12 - var11;
            int var23 = var15 - var14;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var21 * var25;
                int var29 = var20 * var25;
                int var30 = var22 * var24;
                int var31 = (var27 + var28 + var30 >> 12) + arg6;
                int var32 = var23 * var24;
                int var33 = var19 * var26;
                int var34 = (var33 + var29 + var32 >> 12) + arg7;
                class101.method806(arg4, var13, (byte) 121, var31, var34, var10);
                var13 = var34;
                var10 = var31;
            }
        }
        field783++;
        if (arg1 != -30281) {
            method353(88, -102, -52, -126, -20, 111, 63, 112, 89, 121);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "([BZ)V", line = 139)
    public static final void method354(byte[] arg0, boolean arg1) {
        class92 var2 = new class92(arg0);
        var2.field1476 = arg0.length - 2;
        class12.field100 = var2.method721(90);
        class183.field2931 = new int[class12.field100];
        field798++;
        class15.field132 = new int[class12.field100];
        class218.field3759 = new boolean[class12.field100];
        field802 = new byte[class12.field100][];
        class184.field2940 = new int[class12.field100];
        class42.field645 = new byte[class12.field100][];
        class113.field1878 = new int[class12.field100];
        var2.field1476 = arg0.length - (class12.field100 * 8) - 7;
        class41.field626 = var2.method721(40);
        class189.field3005 = var2.method721(104);
        int var3 = (var2.method702(-1) & 0xFF) + 1;
        if (!arg1) {
            return;
        }
        for (int var4 = 0; var4 < class12.field100; var4++) {
            class183.field2931[var4] = var2.method721(92);
        }
        for (int var5 = 0; var5 < class12.field100; var5++) {
            class113.field1878[var5] = var2.method721(73);
        }
        for (int var6 = 0; var6 < class12.field100; var6++) {
            class15.field132[var6] = var2.method721(32);
        }
        for (int var7 = 0; var7 < class12.field100; var7++) {
            class184.field2940[var7] = var2.method721(105);
        }
        var2.field1476 = arg0.length - (class12.field100 * 8) - ((var3 + -1) * 3) - 7;
        class235.field4048 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class235.field4048[var8] = var2.method737(-1);
            if (class235.field4048[var8] == 0) {
                class235.field4048[var8] = 1;
            }
        }
        var2.field1476 = 0;
        for (int var9 = 0; var9 < class12.field100; var9++) {
            int var10 = class15.field132[var9];
            int var11 = class184.field2940[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class42.field645[var9] = var13;
            boolean var15 = false;
            field802[var9] = var14;
            int var16 = var2.method702(-1);
            if ((var16 & 0x1) == 0) {
                for (int var22 = 0; var22 < var12; var22++) {
                    var13[var22] = var2.method743((byte) 125);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var23 = 0; var23 < var12; var23++) {
                        byte var24 = var14[var23] = var2.method743((byte) 42);
                        var15 |= var24 != -1;
                    }
                }
            } else {
                int var17 = 0;
                label91: while (true) {
                    if (var10 <= var17) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var19 = 0;
                        while (true) {
                            if (var19 >= var10) {
                                break label91;
                            }
                            for (int var20 = 0; var20 < var11; var20++) {
                                byte var21 = var14[var10 * var20 + var19] = var2.method743((byte) 30);
                                var15 |= var21 != -1;
                            }
                            var19++;
                        }
                    }
                    for (int var18 = 0; var18 < var11; var18++) {
                        var13[var17 + (var10 * var18)] = var2.method743((byte) 41);
                    }
                    var17++;
                }
            }
            class218.field3759[var9] = var15;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 306)
    public static void method355(int arg0) {
        field791 = null;
        field799 = null;
        field794 = null;
        field785 = null;
        field800 = null;
        if (arg0 != 0) {
            method354((byte[]) null, false);
        }
        field801 = null;
        field797 = null;
        field802 = (byte[][]) null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lmh;Lmh;IB)V", line = 340)
    public static final void method356(class62 arg0, class62 arg1, int arg2, byte arg3) {
        class309.field5295 = 0;
        class288.field4913 = false;
        if (arg3 > -115) {
            method353(12, 39, -86, -38, -97, -44, -54, 117, 37, -37);
        }
        field792++;
        class45.field679 = arg2;
        class275.field4689 = arg0;
        class275.field4698 = arg1;
        if (class275.field4689.method446((byte) 77, class275.field4694) || class275.field4698.method446((byte) -77, class275.field4694)) {
            class296.field5052 = 0;
            class114.field1922 = 3;
        } else {
            class80.field1337 = 0;
            class296.field5052 = 1;
            class247.field4193 = 0;
            class114.field1922 = -3;
        }
    }
}
