import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class124 extends class265 {

    @OriginalMember(owner = "client!km", name = "h", descriptor = "[I")
    private int[] field1386 = new int[512];

    @OriginalMember(owner = "client!km", name = "f", descriptor = "[[S")
    private static short[][] field1384 = new short[][] { new short[0], new short[0], new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[[S")
    private static short[][] field1388 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019, 7072, 3990, 309, 910, 9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462, -14833, -22386, 8, -22468, -27479, -11237, 21664, 45, -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232, -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331, -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638, 8466, -25537 }, { 25485, 9105, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019, 7072, 3990, 309, 910, 9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462, -14833, -22386, 8, -22468, -27479, -11237, 21664, 45, -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232, -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331, -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638, 8466, -25537 }, { 4620, 11140, 6433, 6, 4752, 10264, 7072, 3990, 309, 910, 9509, 9117, 3600, 16442, -32601, 22020, 2694, -22264, 10281, 3869, -28007, 10764, 8974, 3745, 10269, 914, 8629, -26438, 26779, -15208, 8728, 2982, -25718, 918, 6842, -25030, -5462, -14833, -22386, 8, -22468, -27479, -11237, 21664, 45, -24054, -27207, -22887, -30051, 20003, 21584, -31426, 28990, -11219, 6353, -25560, -25458, -14182, -11006, -27365, 3241, 7457, 8899, 13760, 4565, 11711, 10436, 8103, 2604, 13740, -28232, -26333, -23910, -31403, -32352, -29812, -29909, -24137, 925, 1181, 3865, 6049, 8582, 1804, 4887, -5372, 15011, 20785, 7591, 9528, 21770, 14094, 6930, 14635, 5911, 6463, 10124, 17935, 3218, 262, 5413, -27579, -25189, -26331, -28236, -28144, -23804, -23261, -23013, -19045, 5419, 6332, 5665, 2450, 3617, 8638, 5178, 10374, 6819, 7434, 150, 2446, 9647, -27504, -27586, -31695, 11142, 18704, 10775, 21898, 10554, 9492, 11811, 11140, -15978, -24180, -32498, -29288, 29084, -9579, -18799, -27122, 913, 6024, 2966, -5238, 6542, 15240, 10, 39, 3986, 2324, 6030, -31709, 512, 33, 9394, -4833, 28967, -25290, 30866, 13466, -28403, -24022, -14042, -22472, -18166, 20493, -27626, -22266, -1784, -31473, 9612, 7324, 646, 778, 786, 800, -624, -3198, -8164, 1678, 29068, 22412, -32253, 29075, 22404, -22006, 3974, 7054, 10376, 3222, 8070, 12, 1930, 2, -22481, 4884, 5797, 5900, 6, 40, 1932, 5638, 8466, -25537 }, { 4540, 4529, 5674, 5667, 5785, 6802, 8072, 4562, 4437, 4317, 5896, 4488 } };

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[[S")
    private static short[][] field1383 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, 7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570, -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010, 7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570, -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 }, { 4626, 11146, 6439, 12, 4758, 10270, 7085, 4001, 317, 918, 9517, 9125, 3608, 16450, -32593, 22026, 2700, -22256, 10289, 3877, -27999, 10770, 8982, 3753, 10275, 924, 8637, -26428, 26785, -15202, 8736, 2994, -25710, 928, 6859, -25016, -5449, -14823, -23401, 12, -22456, -27471, -11229, 21673, 57, -24046, -27190, -22877, -30041, 20013, 21596, -31414, 29000, -11209, 6361, -25552, -25450, -14174, -10998, -27357, 3249, 7465, 8913, 13774, 4584, 11728, 10454, 8123, 2619, 13756, -28220, -26323, -23901, -31385, -32342, -29806, -29902, -24128, 933, 1189, 3873, 6057, 8590, 1812, 4895, -5366, 15019, 20793, 7599, 9536, 21778, 14102, 6938, 14648, 5919, 6472, 10128, 17940, 3226, 267, 5421, -27570, -25177, -26319, -28217, -28132, -23792, -23249, -23001, -19033, 5427, 6340, 5673, 2458, 3625, 8646, 5186, 10382, 6826, 7442, 158, 2454, 9655, -27496, -27578, -31687, 11146, 18712, 10785, 21902, 10566, 9500, 11819, 11144, -15965, -24170, -32488, -29277, 29097, -9567, -18794, -27116, 921, 6028, 2974, -5230, 6550, 15244, 14, 49, 3994, 2332, 6038, -31701, 520, 41, 9402, -4825, 28978, -25278, 30876, 13475, -28395, -24010, -14027, -22454, -18158, 20503, -27618, -22258, -1776, -31468, 9616, 7333, 650, 784, 796, 813, -616, -3194, -8152, 1686, 29074, 22422, -32245, 29084, 22411, -22000, 3982, 7062, 10382, 3230, 8076, 20, 1936, 10, -22473, 4892, 5805, 5904, 10, 48, 1936, 5640, 8472, -25529 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574, 4444, 4328, 7052, 4490 } };

    @OriginalMember(owner = "client!km", name = "k", descriptor = "S")
    public static short field1389 = 256;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[[[S")
    public static short[][][] field1391 = new short[][][] { field1383, field1388, field1384 };

    @OriginalMember(owner = "client!km", name = "n", descriptor = "[[F")
    public static float[][] field1392 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field1382;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field1387;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IIFIIF[FIFFI)V", line = 6)
    public final void method711(int arg0, int arg1, float arg2, int arg3, int arg4, float arg5, float[] arg6, int arg7, float arg8, float arg9, int arg10) {
        field1385++;
        int var12 = (int) ((float) arg1 * arg2 - 1.0F);
        int var13 = var12 & 0xFF;
        int var14 = (int) ((float) arg4 * arg5 - 1.0F);
        int var15 = var14 & 0xFF;
        int var16 = (int) ((float) arg3 * arg8 - 1.0F);
        int var17 = var16 & 0xFF;
        float var18 = (float) arg10 * arg8;
        int var19 = (int) var18;
        int var20 = var19 + 1;
        float var21 = (float) (-var19) + var18;
        if (arg7 != 10913) {
            return;
        }
        float var22 = 1.0F - var21;
        int var23 = var19 & var17;
        float var24 = class226.method1364(var21, (byte) 109);
        int var25 = var20 & var17;
        int var26 = this.field1386[var23];
        int var27 = this.field1386[var25];
        for (int var28 = 0; var28 < arg4; var28++) {
            float var29 = (float) var28 * arg5;
            int var30 = (int) var29;
            int var31 = var30 + 1;
            float var32 = (float) (-var30) + var29;
            float var33 = 1.0F - var32;
            float var34 = class226.method1364(var32, (byte) 71);
            int var35 = var30 & var15;
            int var36 = var31 & var15;
            int var37 = this.field1386[var26 + var35];
            int var38 = this.field1386[var36 + var26];
            int var39 = this.field1386[var27 + var35];
            int var40 = this.field1386[var36 + var27];
            for (int var41 = 0; var41 < arg1; var41++) {
                float var42 = (float) var41 * arg2;
                int var43 = (int) var42;
                int var44 = var43 + 1;
                float var45 = var42 - (float) var43;
                float var46 = 1.0F - var45;
                float var47 = class226.method1364(var45, (byte) 73);
                int var48 = var44 & var13;
                int var49 = var43 & var13;
                arg6[arg0++] = class260.method1536(true, var24, class260.method1536(true, var34, class260.method1536(true, var47, class557.method3158(arg7 - 10912, var32, class105.method572(7, this.field1386[var40 + var48]), var21, var45), class557.method3158(1, var32, class105.method572(7, this.field1386[var40 + var49]), var21, var46)), class260.method1536(true, var47, class557.method3158(1, var33, class105.method572(this.field1386[var39 + var48], 7), var21, var45), class557.method3158(1, var33, class105.method572(this.field1386[var49 + var39], 7), var21, var46))), class260.method1536(true, var34, class260.method1536(true, var47, class557.method3158(1, var32, class105.method572(this.field1386[var48 + var38], 7), var22, var45), class557.method3158(1, var32, class105.method572(this.field1386[var38 + var49], 7), var22, var46)), class260.method1536(true, var47, class557.method3158(1, var33, class105.method572(this.field1386[var37 + var48], 7), var22, var45), class557.method3158(1, var33, class105.method572(7, this.field1386[var49 + var37]), var22, var46)))) * arg9;
            }
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 104)
    public static void method712(int arg0) {
        field1392 = null;
        field1384 = null;
        field1383 = null;
        if (arg0 > 4) {
            field1388 = null;
            field1391 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(I)V", line = 121)
    public class124(int arg0) {
        Random var2 = new Random((long) arg0);
        for (int var3 = 0; var3 < 256; var3++) {
            this.field1386[var3] = this.field1386[var3 + 256] = var3;
        }
        for (int var4 = 0; var4 < 256; var4++) {
            int var5 = var2.nextInt() & 0xFF;
            int var6 = this.field1386[var5];
            this.field1386[var5] = this.field1386[var5 + 256] = this.field1386[var4];
            this.field1386[var4] = this.field1386[var4 + 256] = var6;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IFILvaa;IFFIIFF)[B", line = 168)
    public static final byte[] method713(int arg0, float arg1, int arg2, class265 arg3, int arg4, float arg5, float arg6, int arg7, int arg8, float arg9, float arg10) {
        field1382++;
        byte[] var11 = new byte[arg0 * arg7 * arg8];
        class422.method2423(arg8, 0, 79, arg6, arg7, arg9, arg10, arg2, var11, arg1, arg5, arg3, arg0);
        if (arg4 != 1341) {
            field1389 = 13;
        }
        return var11;
    }
}
