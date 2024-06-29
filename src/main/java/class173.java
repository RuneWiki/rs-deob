import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class173 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "[Lph;")
    public static class143[] field3572 = new class143[6];

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3571 = 0;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Lgg;")
    public static class63 field3567 = class116.method911(43, " loggt sich aus)3");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field3569;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "([IIIIIII)V")
    public static final void method1156(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class98.field2329 = arg5;
        class139.field2985 = new boolean[8][32][class98.field2329 + class98.field2329 + 1][class98.field2329 + class98.field2329 + 1];
        class135.field2919 = 0;
        class37.field887 = 0;
        class64.field1643 = arg3;
        class85.field2017 = arg4;
        class104.field2387 = arg3 / 2;
        class13.field311 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class98.field2329 + class98.field2329 + 3][class98.field2329 + class98.field2329 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class123.field2720 = class25.field571[var8];
                class195.field3915 = class25.field576[var8];
                class22.field511 = class25.field571[var16];
                class68.field1705 = class25.field576[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class98.field2329 + 1); var19 <= class98.field2329 + 1; var19++) {
                    for (int var20 = -(class98.field2329 + 1); var20 <= class98.field2329 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class52.method515(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class98.field2329 + var19 + 1][class98.field2329 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class98.field2329; var11 < class98.field2329; var11++) {
                    for (int var12 = -class98.field2329; var12 < class98.field2329; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class98.field2329 + 1][var12 + var15 + class98.field2329 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class98.field2329 + 1][var12 + var15 + class98.field2329 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class98.field2329 + 1][var12 + var15 + class98.field2329 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class98.field2329 + 1][var12 + var15 + class98.field2329 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class139.field2985[var9][var10][class98.field2329 + var11][class98.field2329 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1157(byte arg0) {
        field3572 = null;
        field3567 = null;
        if (arg0 != -18) {
            method1159(true, null);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZII)V")
    public static final void method1158(boolean arg0, int arg1, int arg2) {
        field3573++;
        if (!arg0) {
            method1156(null, 70, -42, -7, -66, 58, 66);
        }
        if (class54.field1430 != arg1) {
            class35.field825 = new int[arg1];
            for (int var3 = 0; var3 < arg1; var3++) {
                class35.field825[var3] = (var3 << 12) / arg1;
            }
            class75.field1867 = arg1 - 1;
            class54.field1430 = arg1;
        }
        if (class12.field287 == arg2) {
            return;
        }
        class21.field496 = new int[arg2];
        for (int var4 = 0; var4 < arg2; var4++) {
            class21.field496[var4] = (var4 << 12) / arg2;
        }
        class12.field287 = arg2;
        class1.field4 = arg2 - 1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZLab;)Lgg;")
    public static final class63 method1159(boolean arg0, class3 arg1) {
        field3568++;
        return arg0 ? null : class121.method933((byte) 102, arg1, 32767);
    }
}
