import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class159 extends RuntimeException {

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field3649;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "Ljava/lang/String;")
    public String field3645;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Lwd;")
    public static class157 field3651 = new class157();

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Lec;")
    public static class32 field3654 = class73.method594("", true);

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "Lec;")
    public static class32 field3652 = class73.method594("Standort", true);

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[[S")
    public static short[][] field3655 = new short[][] { { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 7622, 7384, 8412, 7496, 86, 123, 111, 99, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 12, 24, 37, 49, 61, 74, 86, -25437, -26445, -27450, 9694, 21824, 123, 111, 99, 17814, 16801, 17837, 16697, 7341, 7496, 5330, 7384, 5268, 3230, 2223, 72, 10277, 8377, 8394, 7384, -22370, -22221, -22196, -22314, -29637, -27434, -29604, -25491, 662, 796, 933, 819, 10258, 6430, 5425, 5314, 10917, 10925, 10935, 10471, 10258, 10524, 10415, 10301, -11108, -11093, -11203, -8034, -5839, -6836, -5934, -32674, -14444, -15455, -15697, -15557, -15424, -11622, -11601, -11450, 7054, 7079, 5056, 6988, 8481, -30054, -30159, -30019, -21734, -21845, -21707, -21690, -21564, -24921, -24775, -24640, 662, 794, 811, 945, 827, 957, 5425, 5314, 11032, 10921, 11183, 11069, 11200, 4775, 3891, 3904, -18792, -19799, -20807, -20677, -20534, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 20366, 21274, 21415, 20401, 6569, 7613, 7630, 6364, 4300, 8412, 3294, 4193, 3303, 123, 111, 99, 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, 14990, 14746, 15779, 15795, 15944, 662, 796, 941, 951, 148, 6936, 5675, 5440, 10014, 11179, 11197, 10894, 10776, 10661, 10795, 10419, -10984, -11095, -11072, 12998, 12731, 11718, -6838, -32318, 4, 12, 24, 37, 49, 61, 74, 86 }, { 18322, 17304, 16289, 15929, 6569, 7613, 7630, 6364, 7054, 7079, 5056, 6988, 8481, 7475, 7364, 8412, -21990, -21969, -21952, -22182, -27211, -27198, -27186, -27302, 542, 555, 941, 951, 8076, 6936, 5675, 5440, 10014, 11179, 11197, 11096, 10258, 10776, 10661, 10419, -10984, -11095, -11072, -6630, -5467, -6473, -6838, -32318, -26069, -25925, -25669, 11202, 22193, 123, 111, 99, 4, 12, 24, 37, 49, 61, 74, 86, 22461, -21571, 11200, 957, -10317, 5056, -31808, 123, 22453, -21579, 11191, 949, -10325, 4023, -31817, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 20366, 20401, 662, 827, 7054, 5056, -21734, -21564, -14444, -15424, 11032, 11200, 4, 123, 61, -18792, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4300, 3294, 3303, 3264, 4506, 4382, 4387, 5293, 8412, 8301, 8076, 6936, 5675, 941, 5056, 15795, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "Lec;")
    private static class32 field3653 = class73.method594("Hidden", true);

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lec;")
    public static class32 field3658 = class73.method594("Regeln versto-8en hat)3", true);

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "Lec;")
    public static class32 field3657 = field3653;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "I")
    public static int field3660 = 0;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public static int field3648;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "Lvd;")
    public static class150 field3659;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "Ljf;")
    public static class68 field3646;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static void method1227(int arg0) {
        field3659 = null;
        field3658 = null;
        field3646 = null;
        field3651 = null;
        field3657 = null;
        field3652 = null;
        if (arg0 == 5056) {
            field3653 = null;
            field3654 = null;
            field3655 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Lnf;ILnf;)V")
    public static final void method1228(class96 arg0, int arg1, class96 arg2) {
        field3650++;
        if (class117.field2794) {
            class50.method394(arg2, false, arg0);
            return;
        }
        if (class134.field3116 == 0 || class134.field3116 == 5) {
            byte var3 = 20;
            arg2.method795(class158.field3644, 382, 245 - var3, 16777215, -1);
            int var4 = 253 - var3;
            class141.method1060(230, var4, 304, 34, 9179409);
            class141.method1060(231, var4 + 1, 302, 32, 0);
            class141.method1055(232, var4 + 2, class8.field142 * 3, 30, 9179409);
            class141.method1055(class8.field142 * 3 + 232, var4 + 2, 300 - class8.field142 * 3, 30, 0);
            arg2.method795(class74.field1744, 382, 276 - var3, 16777215, -1);
        }
        if (class134.field3116 == 20) {
            short var5 = 211;
            class4.field71.method400(382 - class4.field71.field1168 / 2, 271 - class4.field71.field1172 / 2);
            arg2.method795(class74.field1755, 382, var5, 16776960, 0);
            int var23 = var5 + 15;
            arg2.method795(class74.field1743, 382, var23, 16776960, 0);
            int var24 = var23 + 15;
            arg2.method795(class74.field1741, 382, var24, 16776960, 0);
            int var25 = var24 + 15;
            int var26 = var25 + 10;
            arg2.method793(class52.method403(new class32[] { class65.field1507, class99.method773(class74.field1752) }, (byte) -20), 272, var26, 16777215, 0);
            int var28 = var26 + 15;
            arg2.method793(class52.method403(new class32[] { class37.field890, class74.field1739.method248(-7726) }, (byte) -20), 274, var28, 16777215, 0);
            int var30 = var28 + 15;
        }
        if (class134.field3116 == 10) {
            class4.field71.method400(202, 171);
            if (class11.field189 == 0) {
                short var13 = 302;
                short var14 = 251;
                short var15 = 291;
                arg2.method795(class32.field626, 382, var14, 16776960, 0);
                class80.field1852.method400(var13 - 73, var15 + -20);
                arg2.method771(class4.field73, var13 - 73, var15 + -20, 144, 40, 16777215, 0, 1, 1, 0);
                int var39 = var14 + 30;
                short var16 = 462;
                class80.field1852.method400(var16 - 73, var15 + -20);
                arg2.method771(class105.field2494, var16 - 73, var15 + -20, 144, 40, 16777215, 0, 1, 1, 0);
            } else if (class11.field189 == 2) {
                short var9 = 211;
                arg2.method795(class74.field1755, 382, var9, 16776960, 0);
                int var33 = var9 + 15;
                short var10 = 321;
                arg2.method795(class74.field1743, 382, var33, 16776960, 0);
                int var34 = var33 + 15;
                arg2.method795(class74.field1741, 382, var34, 16776960, 0);
                int var35 = var34 + 15;
                int var36 = var35 + 10;
                arg2.method793(class52.method403(new class32[] { class65.field1507, class99.method773(class74.field1752), class135.field3136 == 0 & class140.field3219 % 40 < 20 ? class92.field2106 : class74.field1749 }, (byte) -20), 272, var36, 16777215, 0);
                int var37 = var36 + 15;
                arg2.method793(class52.method403(new class32[] { class37.field890, class74.field1739.method248(-7726), class140.field3219 % 40 < 20 & class135.field3136 == 1 ? class92.field2106 : class74.field1749 }, (byte) -20), 274, var37, 16777215, 0);
                int var38 = var37 + 15;
                short var11 = 302;
                class80.field1852.method400(var11 - 73, var10 + -20);
                arg2.method795(class37.field894, var11, var10 + 5, 16777215, 0);
                short var12 = 462;
                class80.field1852.method400(var12 - 73, var10 - 20);
                arg2.method795(class92.field2116, var12, var10 + 5, 16777215, 0);
            } else if (class11.field189 == 3) {
                short var6 = 236;
                arg2.method795(class86.field2021, 382, 211, 16776960, 0);
                short var7 = 321;
                short var8 = 382;
                arg2.method795(class23.field421, 382, var6, 16777215, 0);
                int var27 = var6 + 15;
                arg2.method795(class98.field2279, 382, var27, 16777215, 0);
                int var29 = var27 + 15;
                arg2.method795(class43.field1004, 382, var29, 16777215, 0);
                int var31 = var29 + 15;
                arg2.method795(class105.field2491, 382, var31, 16777215, 0);
                class80.field1852.method400(var8 - 73, var7 + -20);
                arg2.method795(class92.field2116, var8, var7 + 5, 16777215, 0);
                int var32 = var31 + 15;
            }
        }
        if (class154.field3528 != 1) {
            if (class66.field1571 > 0) {
                class72.method590(class66.field1571, true);
                class66.field1571 = 0;
            }
            class125.method979(true);
        }
        class14.field237[class30.field551 ? 1 : 0].method400(725, 463);
        if (class134.field3116 > 5 && class107.field2534 != 2 && class20.field371 == 0) {
            if (class156.field3567 == null) {
                class156.field3567 = class136.method1035(class74.field1749, class30.field572, false, class117.field2817);
            } else {
                short var17 = 463;
                byte var18 = 100;
                byte var19 = 5;
                class156.field3567.method400(var19, var17);
                byte var20 = 35;
                arg2.method795(class52.method403(new class32[] { class15.field260, class77.field1802, method1230(class86.field2015, 0) }, (byte) -20), var18 / 2 + var19, var20 / 2 + var17 + -2, 16777215, 0);
                if (class81.field1873 == null) {
                    arg0.method795(class71.field1667, var18 / 2 + var19, var20 / 2 + 12 + var17, 16777215, 0);
                } else {
                    arg0.method795(class72.field1709, var18 / 2 + var19, var20 / 2 + var17 + 12, 16777215, 0);
                }
            }
        }
        try {
            if (arg1 != 462) {
                field3653 = null;
            }
            Graphics var21 = class107.field2541.getGraphics();
            class50.field1158.method122(var21, 29504, 0, 0);
        } catch (Exception var22) {
            class107.field2541.repaint();
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IBI)V")
    public static final void method1229(int arg0, byte arg1, int arg2) {
        field3656++;
        class4 var3 = class80.method637(arg2, (byte) -115);
        int var4 = var3.field75;
        if (arg1 >= -64) {
            return;
        }
        int var5 = var3.field78;
        int var6 = var3.field66;
        int var7 = class117.field2781[var5 - var6];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var6;
        class27.field504[var4] = class107.method864(class41.method326(var8, arg0 << var6), class41.method326(class27.field504[var4], ~var8));
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)Lec;")
    public static final class32 method1230(int arg0, int arg1) {
        field3647++;
        if (arg1 != 0) {
            field3654 = null;
        }
        return class124.method977(10, 0, arg0, false);
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class159(Throwable arg0, String arg1) {
        this.field3649 = arg0;
        this.field3645 = arg1;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILf;I)V")
    public static final void method1231(boolean arg0, int arg1, class36 arg2, int arg3) {
        field3648++;
        if (arg2.field791 == 1) {
            class158.field3619++;
            class56.method443(0, arg2.field792, 3231, arg2.field744, 26, class77.field1787, 0);
        }
        if (arg2.field791 == 2 && !class151.field3470) {
            class32 var4 = class61.method460((byte) -52, arg2);
            if (var4 != null) {
                class56.method443(0, var4, 3231, arg2.field744, 8, class52.method403(new class32[] { class134.field3130, arg2.field834 }, (byte) -20), -1);
                class63.field1459++;
            }
        }
        if (arg2.field791 == 3) {
            class56.method443(0, class70.field1657, 3231, arg2.field744, 4, class77.field1787, 0);
            class48.field1131++;
        }
        if (arg2.field791 == 4) {
            class56.method443(0, arg2.field792, 3231, arg2.field744, 40, class77.field1787, 0);
            class111.field2598++;
        }
        if (arg2.field791 == 5) {
            class56.method443(0, arg2.field792, 3231, arg2.field744, 34, class77.field1787, 0);
            class136.field3157++;
        }
        if (arg2.field791 == 6 && class50.field1159 == null) {
            class37.field885++;
            class56.method443(0, arg2.field792, 3231, arg2.field744, 39, class77.field1787, -1);
        }
        if (arg2.field756 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field774; var6++) {
                for (int var7 = 0; var7 < arg2.field811; var7++) {
                    int var8 = (arg2.field819 + 32) * var7;
                    int var9 = (arg2.field785 + 32) * var6;
                    if (var5 < 20) {
                        var8 += arg2.field810[var5];
                        var9 += arg2.field746[var5];
                    }
                    if (var8 <= arg3 && var9 <= arg1 && var8 + 32 > arg3 && arg1 < var9 + 32) {
                        class48.field1124 = arg2;
                        class81.field1857 = var5;
                        if (arg2.field835[var5] > 0) {
                            class62 var10 = class146.method1094(arg2.field835[var5] - 1, 68);
                            if (class125.field2915 == 1 && class103.method832(class147.method1102(-115, arg2), 31278)) {
                                if (class44.field1039 != arg2.field744 || class41.field967 != var5) {
                                    class27.field498++;
                                    class56.method443(var10.field1400, class41.field966, 3231, arg2.field744, 25, class52.method403(new class32[] { class50.field1149, class48.field1133, var10.field1430 }, (byte) -20), var5);
                                }
                            } else if (!class151.field3470 || !class103.method832(class147.method1102(-124, arg2), 31278)) {
                                class75.field1772++;
                                class32[] var11 = var10.field1429;
                                if (class94.field2166) {
                                    var11 = class125.method986(var11, 3);
                                }
                                if (class103.method832(class147.method1102(-101, arg2), 31278)) {
                                    for (int var12 = 4; var12 >= 3; var12--) {
                                        if (var11 != null && var11[var12] != null) {
                                            class26.field471++;
                                            byte var13;
                                            if (var12 == 3) {
                                                var13 = 19;
                                            } else {
                                                var13 = 35;
                                            }
                                            class56.method443(var10.field1400, var11[var12], 3231, arg2.field744, var13, class52.method403(new class32[] { class38.field903, var10.field1430 }, (byte) -20), var5);
                                        } else if (var12 == 4) {
                                            class139.field3206++;
                                            class56.method443(var10.field1400, class115.field2741, 3231, arg2.field744, 35, class52.method403(new class32[] { class38.field903, var10.field1430 }, (byte) -20), var5);
                                        }
                                    }
                                }
                                if (class157.method1212(class147.method1102(-99, arg2), -8956)) {
                                    class11.field185++;
                                    class56.method443(var10.field1400, class41.field966, 3231, arg2.field744, 21, class52.method403(new class32[] { class38.field903, var10.field1430 }, (byte) -20), var5);
                                }
                                if (class103.method832(class147.method1102(-124, arg2), 31278) && var11 != null) {
                                    for (int var14 = 2; var14 >= 0; var14--) {
                                        if (var11[var14] != null) {
                                            class39.field940++;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 17;
                                            }
                                            if (var14 == 1) {
                                                var15 = 30;
                                            }
                                            if (var14 == 2) {
                                                var15 = 7;
                                            }
                                            class56.method443(var10.field1400, var11[var14], 3231, arg2.field744, var15, class52.method403(new class32[] { class38.field903, var10.field1430 }, (byte) -20), var5);
                                        }
                                    }
                                }
                                class32[] var16 = arg2.field757;
                                if (class94.field2166) {
                                    var16 = class125.method986(var16, 3);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; var17 >= 0; var17--) {
                                        if (var16[var17] != null) {
                                            byte var18 = 0;
                                            if (var17 == 0) {
                                                var18 = 38;
                                            }
                                            if (var17 == 1) {
                                                var18 = 15;
                                            }
                                            if (var17 == 2) {
                                                var18 = 51;
                                            }
                                            if (var17 == 3) {
                                                var18 = 18;
                                            }
                                            class39.field935++;
                                            if (var17 == 4) {
                                                var18 = 41;
                                            }
                                            class56.method443(var10.field1400, var16[var17], 3231, arg2.field744, var18, class52.method403(new class32[] { class38.field903, var10.field1430 }, (byte) -20), var5);
                                        }
                                    }
                                }
                                class56.method443(var10.field1400, class135.field3142, 3231, arg2.field744, 1004, class52.method403(new class32[] { class38.field903, var10.field1430 }, (byte) -20), var5);
                            } else if ((class88.field2047 & 0x10) == 16) {
                                class56.method443(var10.field1400, class147.field3355, 3231, arg2.field744, 43, class52.method403(new class32[] { class14.field234, class48.field1133, var10.field1430 }, (byte) -20), var5);
                                class146.field3316++;
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (arg2.field849) {
            if (!class151.field3470) {
                for (int var19 = 9; var19 >= 5; var19--) {
                    class32 var23 = class71.method585(arg2, var19, 12874);
                    if (var23 != null) {
                        class131.field3016++;
                        class56.method443(var19 + 1, var23, 3231, arg2.field744, 1005, arg2.field814, arg2.field829);
                    }
                }
                class32 var20 = class61.method460((byte) -76, arg2);
                if (var20 != null) {
                    class63.field1459++;
                    class56.method443(0, var20, 3231, arg2.field744, 8, arg2.field814, arg2.field829);
                }
                for (int var21 = 4; var21 >= 0; var21--) {
                    class32 var22 = class71.method585(arg2, var21, 12874);
                    if (var22 != null) {
                        class131.field3016++;
                        class56.method443(var21 + 1, var22, 3231, arg2.field744, 46, arg2.field814, arg2.field829);
                    }
                }
                if (class71.method584(class147.method1102(-95, arg2), 0)) {
                    class37.field885++;
                    class56.method443(0, class86.field2003, 3231, arg2.field744, 39, class77.field1787, arg2.field829);
                }
            } else if (class94.method744(class147.method1102(-101, arg2), (byte) -96) && (class88.field2047 & 0x20) == 32) {
                class14.field232++;
                class56.method443(0, class147.field3355, 3231, arg2.field744, 42, class52.method403(new class32[] { class14.field234, class1.field1, arg2.field814 }, (byte) -20), arg2.field829);
            }
        }
        if (!arg0) {
            field3655 = null;
        }
    }
}
