import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class42 extends class285 {

    @OriginalMember(owner = "client!mf", name = "P", descriptor = "[Lh;")
    public class207[] field664;

    @OriginalMember(owner = "client!mf", name = "K", descriptor = "Lve;")
    private static class255 field659 = class87.method607(126, ")3de");

    @OriginalMember(owner = "client!mf", name = "D", descriptor = "Z")
    public static boolean field653 = false;

    @OriginalMember(owner = "client!mf", name = "M", descriptor = "Lve;")
    private static class255 field661 = class87.method607(83, ")3en");

    @OriginalMember(owner = "client!mf", name = "I", descriptor = "Lve;")
    public static class255 field657 = null;

    @OriginalMember(owner = "client!mf", name = "J", descriptor = "Lve;")
    public static class255 field658 = class87.method607(65, "Ablegen");

    @OriginalMember(owner = "client!mf", name = "z", descriptor = "Lve;")
    private static class255 field649 = class87.method607(49, "de");

    @OriginalMember(owner = "client!mf", name = "B", descriptor = "Lve;")
    private static class255 field651 = class87.method607(79, "en");

    @OriginalMember(owner = "client!mf", name = "L", descriptor = "[I")
    public static int[] field660 = new int[100];

    @OriginalMember(owner = "client!mf", name = "N", descriptor = "Lve;")
    public static class255 field662 = class87.method607(52, "welle:");

    @OriginalMember(owner = "client!mf", name = "G", descriptor = "Lve;")
    private static class255 field656 = class87.method607(95, ")3fr");

    @OriginalMember(owner = "client!mf", name = "R", descriptor = "Lve;")
    private static class255 field666 = class87.method607(38, "fr");

    @OriginalMember(owner = "client!mf", name = "O", descriptor = "[Lve;")
    public static class255[] field663 = new class255[] { field651, field649, field666 };

    @OriginalMember(owner = "client!mf", name = "E", descriptor = "[Lve;")
    private static class255[] field654 = new class255[] { field661, field659, field656 };

    @OriginalMember(owner = "client!mf", name = "A", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!mf", name = "C", descriptor = "I")
    public static int field652;

    @OriginalMember(owner = "client!mf", name = "F", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!mf", name = "Q", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(III)V", line = 14)
    public static final void method257(int arg0, int arg1, int arg2) {
        field655++;
        if (class92.field1576 != arg0) {
            class245.field4120 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class245.field4120[var3] = (var3 << 12) / arg0;
            }
            class154.field2619 = arg0 == 64 ? 2048 : 4096;
            class77.field1260 = arg0 - 1;
            class92.field1576 = arg0;
        }
        if (class210.field3590 != arg1) {
            if (class92.field1576 == arg1) {
                class20.field324 = class245.field4120;
            } else {
                class20.field324 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class20.field324[var4] = (var4 << 12) / arg1;
                }
            }
            class210.field3590 = arg1;
            class250.field4205 = arg1 - 1;
        }
        int var5 = -65 / ((-arg2 - 55) / 52);
    }

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V", line = 61)
    public static void method258(int arg0) {
        if (arg0 != -31239) {
            return;
        }
        field657 = null;
        field649 = null;
        field654 = null;
        field661 = null;
        field660 = null;
        field662 = null;
        field656 = null;
        field659 = null;
        field651 = null;
        field658 = null;
        field663 = null;
        field666 = null;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(JB)V", line = 93)
    public static final void method259(long arg0, byte arg1) {
        field665++;
        if (arg0 == 0L) {
            return;
        }
        class255.field4318.method1523(22260, 13);
        if (arg1 <= 122) {
            field654 = (class255[]) null;
        }
        class255.field4318.method449(16711680, arg0);
        class82.field1336++;
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lrg;Lrg;IZ)V", line = 137)
    public class42(class88 arg0, class88 arg1, int arg2, boolean arg3) {
        class203 var5 = new class203();
        int var6 = arg0.method617(17374, arg2);
        this.field664 = new class207[var6];
        int[] var7 = arg0.method613(0, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method636(arg2, (byte) 109, var7[var8]);
            class25 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class25 var12 = (class25) var5.method1471((byte) 24); var12 != null; var12 = (class25) var5.method1475((byte) 83)) {
                if (var12.field384 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method615((byte) -113, 0, var11);
                } else {
                    var13 = arg1.method615((byte) -116, var11, 0);
                }
                var10 = new class25(var11, var13);
                var5.method1472(true, var10);
            }
            this.field664[var7[var8]] = new class207(var9, var10);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)Z", line = 207)
    public final boolean method260(int arg0, int arg1) {
        field652++;
        if (arg1 < 112) {
            method261(false, (byte) -101);
        }
        return this.field664[arg0].field3554;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V", line = 218)
    public static final void method261(boolean arg0, byte arg1) {
        field650++;
        class250.field4221 = arg0;
        if (arg1 <= 15) {
            method259(-80L, (byte) 120);
        }
        if (!class250.field4221) {
            int var2 = class160.field2692.method473(-16350);
            int var3 = class160.field2692.method476((byte) 72);
            int var4 = class160.field2692.method476((byte) 72);
            int var5 = class160.field2692.method426((byte) -23);
            int var6 = (class125.field2084 - class160.field2692.field1068) / 16;
            class229.field3799 = new int[var6][4];
            for (int var7 = 0; var7 < var6; var7++) {
                for (int var8 = 0; var8 < 4; var8++) {
                    class229.field3799[var7][var8] = class160.field2692.method434(-1584014312);
                }
            }
            int var9 = class160.field2692.method439(-32768);
            class53.field836 = null;
            class288.field4957 = new int[var6];
            class244.field4113 = new byte[var6][];
            class72.field1192 = new int[var6];
            class236.field3923 = (byte[][]) null;
            class249.field4164 = new byte[var6][];
            class222.field3737 = new byte[var6][];
            class50.field756 = new int[var6];
            class223.field3747 = new int[var6];
            boolean var10 = false;
            class116.field1976 = new int[var6];
            if (((var9 / 8) == 48 || (var9 / 8) == 49) && var5 / 8 == 48) {
                var10 = true;
            }
            class149.field2511 = new byte[var6][];
            int var11 = 0;
            if (var9 / 8 == 48 && var5 / 8 == 148) {
                var10 = true;
            }
            for (int var12 = (var9 - 6) / 8; var12 <= ((var9 + 6) / 8); var12++) {
                for (int var13 = (var5 - 6) / 8; var13 <= (var5 + 6) / 8; var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var10 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class116.field1976[var11] = var14;
                        class223.field3747[var11] = -1;
                        class72.field1192[var11] = -1;
                        class50.field756[var11] = -1;
                        class288.field4957[var11] = -1;
                    } else {
                        class116.field1976[var11] = var14;
                        class223.field3747[var11] = class174.field2883.method619(class3.method14(new class255[] { class76.field1250, class215.method1532(var12, true), class255.field4360, class215.method1532(var13, true) }, (byte) -52), 20053);
                        class72.field1192[var11] = class174.field2883.method619(class3.method14(new class255[] { class95.field1636, class215.method1532(var12, true), class255.field4360, class215.method1532(var13, true) }, (byte) -58), 20053);
                        class50.field756[var11] = class174.field2883.method619(class3.method14(new class255[] { class137.field2288, class215.method1532(var12, true), class255.field4360, class215.method1532(var13, true) }, (byte) -98), 20053);
                        class288.field4957[var11] = class174.field2883.method619(class3.method14(new class255[] { class162.field2720, class215.method1532(var12, true), class255.field4360, class215.method1532(var13, true) }, (byte) -76), 20053);
                    }
                    var11++;
                }
            }
            class282.method1991(var5, var4, var3, (byte) -14, false, var2, var9);
            return;
        }
        int var15 = class160.field2692.method482(6205);
        int var16 = class160.field2692.method426((byte) -23);
        int var17 = class160.field2692.method476((byte) 72);
        class160.field2692.method1515(7);
        for (int var18 = 0; var18 < 4; var18++) {
            for (int var19 = 0; var19 < 13; var19++) {
                for (int var20 = 0; var20 < 13; var20++) {
                    int var21 = class160.field2692.method1513((byte) 45, 1);
                    if (var21 == 1) {
                        class248.field4152[var18][var19][var20] = class160.field2692.method1513((byte) 45, 26);
                    } else {
                        class248.field4152[var18][var19][var20] = -1;
                    }
                }
            }
        }
        class160.field2692.method1514(true);
        int var22 = (class125.field2084 - class160.field2692.field1068) / 16;
        class229.field3799 = new int[var22][4];
        for (int var23 = 0; var23 < var22; var23++) {
            for (int var24 = 0; var24 < 4; var24++) {
                class229.field3799[var23][var24] = class160.field2692.method469(82);
            }
        }
        int var25 = class160.field2692.method426((byte) -23);
        int var26 = class160.field2692.method476((byte) 72);
        class249.field4164 = new byte[var22][];
        class149.field2511 = new byte[var22][];
        class288.field4957 = new int[var22];
        class223.field3747 = new int[var22];
        class236.field3923 = (byte[][]) null;
        class222.field3737 = new byte[var22][];
        class72.field1192 = new int[var22];
        class50.field756 = new int[var22];
        class244.field4113 = new byte[var22][];
        class116.field1976 = new int[var22];
        int var27 = 0;
        class53.field836 = null;
        for (int var28 = 0; var28 < 4; var28++) {
            for (int var29 = 0; var29 < 13; var29++) {
                for (int var30 = 0; var30 < 13; var30++) {
                    int var31 = class248.field4152[var28][var29][var30];
                    if (var31 != -1) {
                        int var32 = (var31 & 0xFFEEBA) >> 14;
                        int var33 = var31 >> 3 & 0x7FF;
                        int var34 = (var32 / 8 << 8) + var33 / 8;
                        for (int var35 = 0; var35 < var27; var35++) {
                            if (class116.field1976[var35] == var34) {
                                var34 = -1;
                                break;
                            }
                        }
                        if (var34 != -1) {
                            int var36 = (var34 & 0xFFC7) >> 8;
                            class116.field1976[var27] = var34;
                            int var37 = var34 & 0xFF;
                            class223.field3747[var27] = class174.field2883.method619(class3.method14(new class255[] { class76.field1250, class215.method1532(var36, true), class255.field4360, class215.method1532(var37, true) }, (byte) -76), 20053);
                            class72.field1192[var27] = class174.field2883.method619(class3.method14(new class255[] { class95.field1636, class215.method1532(var36, true), class255.field4360, class215.method1532(var37, true) }, (byte) -120), 20053);
                            class50.field756[var27] = class174.field2883.method619(class3.method14(new class255[] { class137.field2288, class215.method1532(var36, true), class255.field4360, class215.method1532(var37, true) }, (byte) -63), 20053);
                            class288.field4957[var27] = class174.field2883.method619(class3.method14(new class255[] { class162.field2720, class215.method1532(var36, true), class255.field4360, class215.method1532(var37, true) }, (byte) -61), 20053);
                            var27++;
                        }
                    }
                }
            }
        }
        class282.method1991(var16, var25, var17, (byte) 60, false, var15, var26);
    }
}
