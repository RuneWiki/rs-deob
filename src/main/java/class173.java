import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class173 extends class273 {

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[I")
    public static int[] field2629 = new int[14];

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public static int field2638 = 0;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field2634;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2639;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Lee;")
    public static class137 field2636;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "[[[B")
    public static byte[][][] field2641;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IB)[[I", line = 7)
    public final int[][] method170(int arg0, byte arg1) {
        field2630++;
        if (arg1 != 68) {
            this.method331(64, -62);
        }
        int[][] var3 = this.field4200.method539(152, arg0);
        if (this.field4200.field1147) {
            int[][] var4 = this.method1795(arg0, -124, 0);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; var11 < class27.field346; var11++) {
                var8[var11] = 4096 - var6[var11];
                var9[var11] = 4096 - var5[var11];
                var7[var11] = 4096 - var10[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljh;IIILng;II)V", line = 52)
    public static final void method1171(class207 arg0, int arg1, int arg2, int arg3, class245 arg4, int arg5, int arg6) {
        field2633++;
        if (arg4 == null) {
            return;
        }
        if (arg3 > -28) {
            method1171((class207) null, -63, -26, -65, (class245) null, -48, -103);
        }
        int var7 = (int) class123.field1922 + class138.field2133 & 0x7FF;
        int var8 = arg2 * arg2 + arg5 * arg5;
        int var9 = Math.max(arg0.field3169 / 2, arg0.field3239 / 2) + 10;
        if (var9 * var9 < var8) {
            return;
        }
        int var10 = class12.field127[var7];
        int var11 = class12.field121[var7];
        int var12 = var10 * 256 / (class14.field148 + 256);
        int var13 = var11 * 256 / (class14.field148 + 256);
        int var14 = arg5 * var12 - (arg2 * var13) >> 16;
        int var15 = arg2 * var12 + arg5 * var13 >> 16;
        if (class333.field5166) {
            ((class186) arg4).method1274(var15 + (arg1 + (arg0.field3169 / 2)) - arg4.field3849 / 2, arg0.field3239 / 2 + arg6 + -(arg4.field3842 / 2) + -var14, (class186) arg0.method1396(107, false));
        } else {
            ((class178) arg4).method1206(arg0.field3169 / 2 + arg1 + var15 - (arg4.field3849 / 2), -var14 - arg4.field3842 / 2 + arg0.field3239 / 2 + arg6, arg0.field3160, arg0.field3281);
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(II)Z", line = 91)
    public static final boolean method1172(int arg0, int arg1) {
        field2639++;
        class166.field2558 = arg0 + 1 & 0xFFFF;
        class205.field3107 = true;
        if (arg1 < 61) {
            method1172(57, -100);
        }
        return true;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lgn;B)V", line = 112)
    public static final void method1173(class303 arg0, byte arg1) {
        field2635++;
        while (true) {
            while (arg0.field4679 < arg0.field4716.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method2043((byte) -123) == 1) {
                    var4 = arg0.method2043((byte) -112);
                    var2 = true;
                    var3 = arg0.method2043((byte) -104);
                }
                int var5 = arg0.method2043((byte) -107);
                int var6 = arg0.method2043((byte) -121);
                int var7 = var5 * 64 - class78.field1161;
                int var8 = class338.field5233 - (var6 * 64 + 1 - class129.field2021);
                if (var7 >= 0 && var8 - 63 >= 0 && class204.field3088 > var7 + 63 && class129.field2021 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= var4 * 8 && var11 < (var4 * 8 + 8) && var12 >= var3 * 8 && var12 < (var3 * 8 + 8)) {
                                byte var13 = arg0.method2001(-3);
                                if (var13 != 0) {
                                    if (class338.field5234[var10][var9] == null) {
                                        class338.field5234[var10][var9] = new byte[4096];
                                    }
                                    class338.field5234[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method2001(-3);
                                    if (class94.field1445[var10][var9] == null) {
                                        class94.field1445[var10][var9] = new byte[4096];
                                    }
                                    class94.field1445[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method2001(-3);
                        if (var16 != 0) {
                            arg0.field4679++;
                        }
                    }
                }
            }
            if (arg1 != -40) {
                field2641 = (byte[][][]) ((byte[][][]) null);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IIIIIII)V", line = 207)
    public static final void method1174(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class75.method526(true, arg1);
        int var7 = 0;
        field2634++;
        int var8 = arg1 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = arg4;
        int var15 = arg2 - var8;
        int[] var16 = class175.field2675[arg0];
        class253.method1704(arg2 - arg1, var15, arg3, var16, arg4 ^ 0xFFFFFFF8);
        int var17 = arg2 + var8;
        class253.method1704(var15, var17, arg6, var16, 7);
        class253.method1704(var17, arg2 + arg1, arg3, var16, 7);
        while (var9 > var7) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class231.field3724[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            var10 += var13;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class175.field2675[arg0 + var9];
                    int[] var19 = class175.field2675[arg0 - var9];
                    int var20 = class231.field3724[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class253.method1704(var22, var24, arg3, var18, 7);
                    class253.method1704(var24, var23, arg6, var18, 7);
                    class253.method1704(var23, var21, arg3, var18, 7);
                    class253.method1704(var22, var24, arg3, var19, arg4 + 8);
                    class253.method1704(var24, var23, arg6, var19, arg4 + 8);
                    class253.method1704(var23, var21, arg3, var19, 7);
                } else {
                    int[] var25 = class175.field2675[arg0 + var9];
                    int[] var26 = class175.field2675[arg0 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class253.method1704(var28, var27, arg3, var25, arg4 + 8);
                    class253.method1704(var28, var27, arg3, var26, 7);
                }
            }
            int[] var29 = class175.field2675[arg0 + var7];
            int var30 = arg2 + var9;
            int var31 = arg2 - var9;
            int[] var32 = class175.field2675[arg0 - var7];
            if (var7 >= var8) {
                class253.method1704(var31, var30, arg3, var29, 7);
                class253.method1704(var31, var30, arg3, var32, 7);
            } else {
                int var33 = var11 < var7 ? class231.field3724[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class253.method1704(var31, var35, arg3, var29, arg4 ^ 0xFFFFFFF8);
                class253.method1704(var35, var34, arg6, var29, 7);
                class253.method1704(var34, var30, arg3, var29, 7);
                class253.method1704(var31, var35, arg3, var32, arg4 ^ 0xFFFFFFF8);
                class253.method1704(var35, var34, arg6, var32, 7);
                class253.method1704(var34, var30, arg3, var32, arg4 ^ 0xFFFFFFF8);
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V", line = 331)
    public class173() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I", line = 340)
    public final int[] method331(int arg0, int arg1) {
        int[] var3 = this.field4204.method365(arg0, 0);
        if (arg1 != -14650) {
            field2638 = 91;
        }
        field2631++;
        if (this.field4204.field792) {
            int[] var4 = this.method1790(0, arg0, 0);
            for (int var5 = 0; var5 < class27.field346; var5++) {
                var3[var5] = 4096 - var4[var5];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V", line = 371)
    public static void method1175(int arg0) {
        field2641 = (byte[][][]) null;
        field2636 = null;
        field2629 = null;
        if (arg0 != 31294) {
            field2641 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BILgn;)V", line = 383)
    public final void method167(byte arg0, int arg1, class303 arg2) {
        field2640++;
        if (arg1 == 0) {
            this.field4194 = arg2.method2043((byte) -121) == 1;
        }
        if (arg0 <= 27) {
            method1171((class207) null, 75, 89, 29, (class245) null, 70, -33);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ[B)Ljava/lang/Object;", line = 398)
    public static final Object method1176(int arg0, boolean arg1, byte[] arg2) {
        field2632++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 != -27928) {
            method1171((class207) null, 57, 96, 5, (class245) null, 119, 57);
        }
        if (arg2.length > 136 && !class68.field1016) {
            try {
                class318 var3 = (class318) Class.forName("dk").getDeclaredConstructor().newInstance();
                var3.method1309(1, arg2);
                return var3;
            } catch (Throwable var5) {
                class68.field1016 = true;
            }
        }
        return arg1 ? class297.method1948(0, arg2) : arg2;
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)V", line = 433)
    public static final void method1177(byte arg0) {
        field2637++;
        if (class308.field4851 != null) {
            class308.field4851.method596(false);
            class308.field4851 = null;
        }
        class205.method1376(0);
        class154.method1075();
        if (arg0 != -74) {
            return;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class33.field425[var1].method1921(-21761);
        }
        class43.method309(arg0 ^ 0x2359, false);
        System.gc();
        class40.method293(2, false);
        class58.field826 = false;
        class146.field2306 = -1;
        class113.method758(true, true);
        class30.field374 = 0;
        class133.field2098 = false;
        class240.field3815 = 0;
        class294.field4535 = 0;
        class144.field2288 = 0;
        for (int var2 = 0; var2 < class81.field1204.length; var2++) {
            class81.field1204[var2] = null;
        }
        class175.field2678 = 0;
        class155.field2439 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class64.field966[var3] = null;
            class70.field1050[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class208.field3313[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class274.field4221[var5][var6][var7] = null;
                }
            }
        }
        class311.method2137(126);
        class166.field2558 = 0;
        client.method891(-109);
        class345.method2395(true, true);
        try {
            class254.method1715("loggedout", (byte) -88, class89.field1359.field3569);
        } catch (Throwable var9) {
        }
    }
}
