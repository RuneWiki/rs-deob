import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class255 {

    @OriginalMember(owner = "client!va", name = "e", descriptor = "J")
    public long field4464 = 0L;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "[Lih;")
    public static class63[] field4465 = new class63[6];

    @OriginalMember(owner = "client!va", name = "l", descriptor = "I")
    public static int field4471 = -1;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "I")
    public int field4460;

    @OriginalMember(owner = "client!va", name = "b", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!va", name = "i", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!va", name = "j", descriptor = "I")
    public int field4469;

    @OriginalMember(owner = "client!va", name = "k", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!va", name = "m", descriptor = "I")
    public int field4472;

    @OriginalMember(owner = "client!va", name = "n", descriptor = "I")
    public int field4473;

    @OriginalMember(owner = "client!va", name = "o", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!va", name = "d", descriptor = "Lj;")
    public class139 field4463;

    @OriginalMember(owner = "client!va", name = "g", descriptor = "Lj;")
    public class139 field4466;

    @OriginalMember(owner = "client!va", name = "c", descriptor = "Lpi;")
    public static class181 field4462;

    @OriginalMember(owner = "client!va", name = "h", descriptor = "Lbd;")
    public static class74 field4467;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIZI)V")
    public static final void method1715(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4461++;
        class28.field558 = 0L;
        int var5 = -47 % ((-arg2 - 38) / 48);
        int var6 = class221.method1533(24454);
        if (arg1 == 3 || var6 == 3) {
            arg3 = true;
        }
        boolean var7 = false;
        if (arg1 > 0 == var6 <= 0) {
            var7 = true;
        }
        if (class9.field150.startsWith("mac") && arg1 > 0) {
            arg3 = true;
        }
        if (arg3 && arg1 > 0) {
            var7 = true;
        }
        class261.method1744(var7, arg4, arg3, var6, arg0, -112, arg1);
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method1716(boolean arg0) {
        field4467 = null;
        field4465 = null;
        field4462 = null;
        if (arg0) {
            method1715(-123, -125, 55, true, 127);
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(Z)Lc;")
    public static final class267 method1717(boolean arg0) {
        field4470++;
        if (!arg0) {
            method1718(true, 72);
        }
        class179 var1 = new class179(class222.field3911, class3.field45, class56.field939[0], class215.field3816[0], class219.field3858[0], class118.field2209[0], class273.field4765[0], class107.field1980);
        class242.method1661(29720);
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(ZI)V")
    public static final void method1718(boolean arg0, int arg1) {
        field4474++;
        class213.field3790 = arg0;
        if (class213.field3790) {
            int var2 = class147.field2651.method567((byte) 127);
            int var3 = class147.field2651.method579(-123);
            class147.field2651.method287(8);
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var22 = 0; var22 < 13; var22++) {
                    for (int var23 = 0; var23 < 13; var23++) {
                        int var24 = class147.field2651.method283((byte) 0, 1);
                        if (var24 == 1) {
                            class189.field3380[var4][var22][var23] = class147.field2651.method283((byte) 0, 26);
                        } else {
                            class189.field3380[var4][var22][var23] = -1;
                        }
                    }
                }
            }
            class147.field2651.method289(-109);
            int var5 = (class219.field3861 - class147.field2651.field1380) / 16;
            class139.field2493 = new int[var5][4];
            for (int var6 = 0; var6 < var5; var6++) {
                for (int var21 = 0; var21 < 4; var21++) {
                    class139.field2493[var6][var21] = class147.field2651.method552((byte) -97);
                }
            }
            int var7 = class147.field2651.method545((byte) 59);
            int var8 = class147.field2651.method579(-122);
            int var9 = class147.field2651.method554((byte) 88);
            class235.field4082 = null;
            class194.field3491 = new int[var5];
            class247.field4373 = new int[var5];
            class119.field2231 = new byte[var5][];
            class92.field1717 = new int[var5];
            class190.field3393 = null;
            class269.field4664 = new int[var5];
            class269.field4646 = new int[var5];
            class131.field2398 = new byte[var5][];
            int var10 = 0;
            for (int var11 = 0; var11 < 4; var11++) {
                for (int var12 = 0; var12 < 13; var12++) {
                    for (int var13 = 0; var13 < 13; var13++) {
                        int var14 = class189.field3380[var11][var12][var13];
                        if (var14 != -1) {
                            int var15 = var14 >> 14 & 0x3FF;
                            int var16 = var14 >> 3 & 0x7FF;
                            int var17 = (var15 / 8 << 8) + (var16 / 8);
                            for (int var18 = 0; var18 < var10; var18++) {
                                if (class92.field1717[var18] == var17) {
                                    var17 = -1;
                                    break;
                                }
                            }
                            if (var17 != -1) {
                                class92.field1717[var10] = var17;
                                int var19 = (var17 & 0xFF2C) >> 8;
                                int var20 = var17 & 0xFF;
                                class194.field3491[var10] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class235.field4091, class115.method932(false, var19), class141.field2558, class115.method932(false, var20) }));
                                class269.field4664[var10] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class77.field1436, class115.method932(false, var19), class141.field2558, class115.method932(false, var20) }));
                                class269.field4646[var10] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class238.field4227, class115.method932(false, var19), class141.field2558, class115.method932(false, var20) }));
                                class247.field4373[var10] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class116.field2187, class115.method932(false, var19), class141.field2558, class115.method932(false, var20) }));
                                var10++;
                            }
                        }
                    }
                }
            }
            class81.method639(var3, var8, 0, false, var2, var7, var9);
        } else {
            int var25 = class147.field2651.method580(-80);
            int var26 = class147.field2651.method554((byte) 88);
            int var27 = class147.field2651.method545((byte) 71);
            int var28 = (class219.field3861 - class147.field2651.field1380) / 16;
            class139.field2493 = new int[var28][4];
            for (int var29 = 0; var29 < var28; var29++) {
                for (int var37 = 0; var37 < 4; var37++) {
                    class139.field2493[var29][var37] = class147.field2651.method589((byte) 0);
                }
            }
            int var30 = class147.field2651.method545((byte) -75);
            int var31 = class147.field2651.method567((byte) 127);
            class92.field1717 = new int[var28];
            class119.field2231 = new byte[var28][];
            class194.field3491 = new int[var28];
            class131.field2398 = new byte[var28][];
            class190.field3393 = null;
            boolean var32 = false;
            class247.field4373 = new int[var28];
            class269.field4664 = new int[var28];
            class269.field4646 = new int[var28];
            int var33 = 0;
            if (((var27 / 8) == 48 || (var27 / 8) == 49) && (var31 / 8) == 48) {
                var32 = true;
            }
            class235.field4082 = null;
            if ((var27 / 8) == 48 && var31 / 8 == 148) {
                var32 = true;
            }
            for (int var34 = (var27 - 6) / 8; var34 <= ((var27 + 6) / 8); var34++) {
                for (int var35 = (var31 - 6) / 8; var35 <= ((var31 + 6) / 8); var35++) {
                    int var36 = (var34 << 8) + var35;
                    if (var32 && var35 == 49 || var35 == 149 || var35 == 147 || var34 == 50 || !(var34 != 49 || var35 != 47)) {
                        class92.field1717[var33] = var36;
                        class194.field3491[var33] = -1;
                        class269.field4664[var33] = -1;
                        class269.field4646[var33] = -1;
                        class247.field4373[var33] = -1;
                    } else {
                        class92.field1717[var33] = var36;
                        class194.field3491[var33] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class235.field4091, class115.method932(false, var34), class141.field2558, class115.method932(false, var35) }));
                        class269.field4664[var33] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class77.field1436, class115.method932(false, var34), class141.field2558, class115.method932(false, var35) }));
                        class269.field4646[var33] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class238.field4227, class115.method932(false, var34), class141.field2558, class115.method932(false, var35) }));
                        class247.field4373[var33] = class232.field4018.method1320((byte) 63, class109.method855(0, new class46[] { class116.field2187, class115.method932(false, var34), class141.field2558, class115.method932(false, var35) }));
                    }
                    var33++;
                }
            }
            class81.method639(var25, var31, 0, false, var27, var30, var26);
        }
        if (arg1 >= 0) {
            method1716(false);
        }
    }
}
