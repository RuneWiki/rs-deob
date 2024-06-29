import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class53 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field1093 = 5063219;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lfc;")
    public static class54 field1095 = new class54(50);

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lrf;")
    public static class163 field1096 = method392(-122, "hitmarks");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lrf;")
    public static class163 field1099 = method392(-46, "Keine Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Ljava/util/Random;")
    public static Random field1097 = new Random();

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "Lrf;")
    public static class163 field1100 = method392(-58, "au");

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    public static int[] field1098;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILjava/lang/String;)Lrf;")
    public static final class163 method392(int arg0, String arg1) {
        field1092++;
        int var2 = 0;
        byte[] var3 = arg1.getBytes();
        int var4 = var3.length;
        int var5 = -91 % ((arg0 - 1) / 40);
        class163 var6 = new class163();
        var6.field3320 = new byte[var4];
        while (var2 < var4) {
            int var7 = var3[var2++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var4 <= var2) {
                    break;
                }
                int var8 = var3[var2++] & 0xFF;
                var6.field3320[var6.field3341++] = (byte) (var7 * 43 + var8 - 48 - 1720);
            } else if (var7 != 0) {
                var6.field3320[var6.field3341++] = (byte) var7;
            }
        }
        var6.method1026(true);
        return var6.method1051(5485);
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "([IIIIIII)V")
    public static final void method393(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class34.field669 = arg5;
        class155.field3212 = new boolean[8][32][class34.field669 + class34.field669 + 1][class34.field669 + class34.field669 + 1];
        class120.field2521 = 0;
        class7.field147 = 0;
        class8.field177 = arg3;
        class96.field2050 = arg4;
        class17.field287 = arg3 / 2;
        class131.field2740 = arg4 / 2;
        boolean[][][][] var7 = new boolean[9][32][class34.field669 + class34.field669 + 3][class34.field669 + class34.field669 + 3];
        for (int var8 = 128; var8 <= 384; var8 += 32) {
            for (int var16 = 0; var16 < 2048; var16 += 64) {
                class181.field3639 = class1.field21[var8];
                class194.field3827 = class1.field8[var8];
                class122.field2572 = class1.field21[var16];
                class71.field1501 = class1.field8[var16];
                int var17 = (var8 - 128) / 32;
                int var18 = var16 / 64;
                for (int var19 = -(class34.field669 + 1); var19 <= class34.field669 + 1; var19++) {
                    for (int var20 = -(class34.field669 + 1); var20 <= class34.field669 + 1; var20++) {
                        int var21 = var19 * 128;
                        int var22 = var20 * 128;
                        boolean var23 = false;
                        for (int var24 = -arg1; var24 <= arg2; var24 += 128) {
                            if (class147.method963(var21, arg0[var17] + var24, var22, arg6)) {
                                var23 = true;
                                break;
                            }
                        }
                        var7[var17][var18][class34.field669 + var19 + 1][class34.field669 + var20 + 1] = var23;
                    }
                }
            }
        }
        for (int var9 = 0; var9 < 8; var9++) {
            for (int var10 = 0; var10 < 32; var10++) {
                for (int var11 = -class34.field669; var11 < class34.field669; var11++) {
                    for (int var12 = -class34.field669; var12 < class34.field669; var12++) {
                        boolean var13 = false;
                        label78: for (int var14 = -1; var14 <= 1; var14++) {
                            for (int var15 = -1; var15 <= 1; var15++) {
                                if (var7[var9][var10][var11 + var14 + class34.field669 + 1][var12 + var15 + class34.field669 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9][(var10 + 1) % 31][var11 + var14 + class34.field669 + 1][var12 + var15 + class34.field669 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][var10][var11 + var14 + class34.field669 + 1][var12 + var15 + class34.field669 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                                if (var7[var9 + 1][(var10 + 1) % 31][var11 + var14 + class34.field669 + 1][var12 + var15 + class34.field669 + 1]) {
                                    var13 = true;
                                    break label78;
                                }
                            }
                        }
                        class155.field3212[var9][var10][class34.field669 + var11][class34.field669 + var12] = var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method394(int arg0) {
        field1095 = null;
        field1100 = null;
        if (arg0 == 1) {
            field1099 = null;
            field1098 = null;
            field1097 = null;
            field1096 = null;
        }
    }
}
