import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class44 {

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
    public static int field543 = 1;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "Lnf;")
    public static class251 field534 = new class251();

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "[I")
    public static int[] field561 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public int field533;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public int field535;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
    public int field536;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
    public int field537;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "I")
    public int field538;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "I")
    public int field540;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public int field542;

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "I")
    public int field544;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "I")
    public int field545;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field547;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public int field548;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
    public int field550;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public int field551;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public int field552;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public int field557;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "I")
    public int field559;

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
    public int field562;

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "[Z")
    public static boolean[] field560;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(BI)V", line = 6)
    public static final void method287(byte arg0, int arg1) {
        class204.field3070 = -1;
        field549++;
        if (arg0 != -11) {
            field534 = (class251) null;
        }
        class203.field3037 = arg1;
        class204.field3070 = -1;
        class162.method1150((byte) 24);
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(BI)V", line = 22)
    public static final void method288(byte arg0, int arg1) {
        field546++;
        class228.field3471.method2174(-12634, arg1);
        class42.field507.method2174(-12634, arg1);
        if (arg0 >= -27) {
            method289(-43, 97, -34, -5, (byte) -43, 102, -26, -8, -9, -18, 112);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIBIIIIII)V", line = 40)
    public static final void method289(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg10 - arg5;
        field553++;
        int var12 = arg0 - arg7;
        int var13 = -1;
        int var14 = 983040 / arg6;
        int var15 = 983040 / arg2;
        if (class155.field2329 > 0) {
            if (class142.field2141 > 10) {
                var13 = 100 - class142.field2141 * 5;
            } else {
                var13 = class142.field2141 * 5;
            }
        }
        for (int var16 = -var14; var16 < (var11 + var14); var16++) {
            int var17 = (var16 + 1) * arg6 + arg3 >> 16;
            int var18 = arg3 + (arg6 * var16) >> 16;
            int var19 = var17 - var18;
            if (var19 > 0) {
                int var20 = arg8 + var18;
                int var10000 = arg8 + var17;
                int var22 = arg5 + var16 >> 6;
                if (var22 >= 0 && class255.field3854.length - 1 >= var22) {
                    int[][] var23 = class255.field3854[var22];
                    for (int var24 = -var15; var24 < var12 + var15; var24++) {
                        int var25 = arg9 + (arg2 * var24) >> 16;
                        int var26 = (var24 + 1) * arg2 + arg9 >> 16;
                        int var27 = var26 - var25;
                        if (var27 > 0) {
                            int var28 = arg1 + var25;
                            var10000 = arg1 + var26;
                            int var30 = arg7 + var24 >> 6;
                            if (var30 >= 0 && var30 <= (var23.length - 1) && var23[var30] != null) {
                                int var31 = ((arg7 + var24 & 0x3F) << 6) + (arg5 + var16 & 0x3F);
                                int var32 = var23[var30][var31];
                                if (var32 != 0) {
                                    class22 var33 = class284.method1980(var32 - 1, (byte) 75);
                                    if (!class301.field4601[var33.field318]) {
                                        if (var13 != -1 && class255.field3874 == var33.field318) {
                                            class186 var34 = new class186();
                                            var34.field2774 = var33.field318;
                                            var34.field2778 = var28;
                                            var34.field2772 = var20;
                                            class92.field1366.method1108(var34, 65280);
                                        } else {
                                            class234.field3510[var33.field318].method935(var20 - 7, var28 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        class186 var35 = (class186) class92.field1366.method1109(111);
        int var36 = -13 / ((48 - arg4) / 35);
        while (var35 != null) {
            class46.method305(var35.field2772, var35.field2778, 15, 16776960, var13);
            class46.method305(var35.field2772, var35.field2778, 13, 16776960, var13);
            class46.method305(var35.field2772, var35.field2778, 11, 16776960, var13);
            class46.method305(var35.field2772, var35.field2778, 9, 16776960, var13);
            class234.field3510[var35.field2774].method935(var35.field2772 - 7, var35.field2778 - 7);
            var35 = (class186) class92.field1366.method1115((byte) 114);
        }
        class92.field1366.method1113((byte) 115);
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 181)
    public static void method290(int arg0) {
        if (arg0 >= -83) {
            field556 = -53;
        }
        field560 = null;
        field534 = null;
        field561 = null;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILlm;Ljava/lang/String;)Laj;", line = 197)
    public static final class129 method291(int arg0, class210 arg1, String arg2) {
        field547++;
        int var3 = arg1.method1448((byte) 10, arg2);
        if (var3 == -1) {
            return new class129(0);
        } else if (arg0 == 31336) {
            int[] var4 = arg1.method1442(var3, (byte) 104);
            class129 var5 = new class129(var4.length);
            for (int var6 = 0; var6 < var5.field1996; var6++) {
                class263 var7 = new class263(arg1.method1441(var4[var6], (byte) -44, var3));
                var5.field2007[var6] = var7.method1801(class206.method1421(arg0, -3854));
                var5.field1998[var6] = var7.method1810((byte) 111);
                var5.field2004[var6] = (short) var7.method1830((byte) -77);
                var5.field2006[var6] = (short) var7.method1830((byte) -77);
                var5.field2000[var6] = var7.method1826(-206227536);
            }
            return var5;
        } else {
            return (class129) null;
        }
    }
}
