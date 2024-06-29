import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class335 {

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field4542 = 0;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "I")
    public static int field4535 = 0;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4538 = "glow3:";

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "I")
    public static int field4543 = -1;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field4545 = 0;

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[I")
    public static int[] field4546 = new int[1000];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field4540;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "Lpe;")
    public static class391 field4541;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z")
    public static final boolean method2118(int arg0, int arg1) {
        field4539++;
        if (arg0 == 41 || arg0 == 35 || arg0 == 7 || arg0 == 22 || arg0 == 23) {
            return true;
        } else if (arg0 == 11 || arg0 == 32 || arg0 == 1008) {
            return true;
        } else {
            if (arg1 != -14607) {
                method2118(108, -33);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V")
    public static void method2119(int arg0) {
        field4546 = null;
        if (arg0 != 2) {
            field4535 = 41;
        }
        field4541 = null;
        field4538 = null;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public static final void method2120(int arg0) {
        class243 var1 = class127.field1799;
        synchronized (class127.field1799) {
            class262.field3525 = class130.field1849;
            class404.field5625++;
            class391.field5490 = class228.field3177;
            class312.field4220 = class272.field3653;
            class52.field844 = class8.field72;
            class94.field1365 = class360.field4885;
            class177.field2609 = class169.field2500;
            class94.field1368 = class436.field6207;
            if (arg0 != 128) {
                method2119(-17);
            }
            class8.field72 = 0;
        }
        field4544++;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(II)I")
    public static final int method2121(int arg0, int arg1) {
        field4537++;
        int var2 = arg0 & 0x3F;
        if (arg1 != 3) {
            method2121(-117, 24);
        }
        int var3 = (arg0 & 0xD0) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(II)Laf;")
    public static final class102 method2122(int arg0, int arg1) {
        field4540++;
        class102 var2 = (class102) class430.field6126.method361((long) arg0, (byte) 114);
        if (var2 != null) {
            return var2;
        }
        if (arg1 <= 78) {
            field4542 = -33;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class266.field3581.method2633(arg0, -1, 1);
        } else {
            var3 = class126.field1765.method2633(arg0 & 0x7FFF, -1, 1);
        }
        class102 var4 = new class102();
        if (var3 != null) {
            var4.method878(new class289(var3), (byte) -126);
        }
        if (arg0 >= 32768) {
            var4.method876((byte) -109);
        }
        class430.field6126.method360(false, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BLpe;I)V")
    public static final void method2123(byte arg0, class391 arg1, int arg2) {
        field4536++;
        class316.method2017(arg1);
        int var3 = -31 / ((arg0 + 18) / 59);
        if (arg2 > 1) {
            for (int var4 = 0; var4 < class116.field1621; var4++) {
                for (int var5 = 0; var5 < class385.field5425; var5++) {
                    if ((class7.field57[1][var4][var5] & 0x2) == 2) {
                        class123.method963(var4, var5);
                    }
                }
            }
        }
        for (int var6 = 0; var6 < arg2; var6++) {
            for (int var7 = 0; var7 <= class385.field5425; var7++) {
                for (int var8 = 0; var8 <= class116.field1621; var8++) {
                    if ((class277.field3734[var6][var8][var7] & 0x1) != 0) {
                        int var9 = var7;
                        int var10 = var7;
                        int var11 = var6;
                        while (class385.field5425 > var10 && (class277.field3734[var6][var8][var10 + 1] & 0x1) != 0) {
                            var10++;
                        }
                        while (var9 > 0 && (class277.field3734[var6][var8][var9 - 1] & 0x1) != 0) {
                            var9--;
                        }
                        int var12 = var6;
                        label167: while (var11 > 0) {
                            for (int var13 = var9; var13 <= var10; var13++) {
                                if ((class277.field3734[var11 - 1][var8][var13] & 0x1) == 0) {
                                    break label167;
                                }
                            }
                            var11--;
                        }
                        label156: while (var12 < 3) {
                            for (int var14 = var9; var14 <= var10; var14++) {
                                if ((class277.field3734[var12 + 1][var8][var14] & 0x1) == 0) {
                                    break label156;
                                }
                            }
                            var12++;
                        }
                        int var15 = (var10 + 1 - var9) * (var12 + 1 - var11);
                        if (var15 >= 2) {
                            short var16 = 240;
                            int var17 = class44.field703[var12][var8][var9] - var16;
                            int var18 = class44.field703[var11][var8][var9];
                            class375.method2341(1, var8 * 128, var8 * 128, var9 * 128, var10 * 128 + 128, var17, var18);
                            for (int var19 = var11; var19 <= var12; var19++) {
                                for (int var20 = var9; var20 <= var10; var20++) {
                                    class277.field3734[var19][var8][var20] = (byte) class323.method2059(class277.field3734[var19][var8][var20], -2);
                                }
                            }
                        }
                    }
                    if ((class277.field3734[var6][var8][var7] & 0x2) != 0) {
                        int var21 = var8;
                        int var22 = var8;
                        int var23 = var6;
                        int var24 = var6;
                        while (var22 < class116.field1621 && (class277.field3734[var6][var22 + 1][var7] & 0x2) != 0) {
                            var22++;
                        }
                        while (var21 > 0 && (class277.field3734[var6][var21 - 1][var7] & 0x2) != 0) {
                            var21--;
                        }
                        label221: while (var23 > 0) {
                            for (int var25 = var21; var25 <= var22; var25++) {
                                if ((class277.field3734[var23 - 1][var25][var7] & 0x2) == 0) {
                                    break label221;
                                }
                            }
                            var23--;
                        }
                        label210: while (var24 < 3) {
                            for (int var26 = var21; var26 <= var22; var26++) {
                                if ((class277.field3734[var24 + 1][var26][var7] & 0x2) == 0) {
                                    break label210;
                                }
                            }
                            var24++;
                        }
                        int var27 = (var22 + 1 - var21) * (var24 + 1 - var23);
                        if (var27 >= 2) {
                            short var28 = 240;
                            int var29 = class44.field703[var24][var21][var7] - var28;
                            int var30 = class44.field703[var23][var21][var7];
                            class375.method2341(2, var21 * 128, var22 * 128 + 128, var7 * 128, var7 * 128, var29, var30);
                            for (int var31 = var23; var31 <= var24; var31++) {
                                for (int var32 = var21; var32 <= var22; var32++) {
                                    class277.field3734[var31][var32][var7] = (byte) class323.method2059(class277.field3734[var31][var32][var7], -3);
                                }
                            }
                        }
                    }
                    if ((class277.field3734[var6][var8][var7] & 0x4) != 0) {
                        int var33 = var8;
                        int var34 = var8;
                        int var35;
                        for (var35 = var7; var35 > 0 && (class277.field3734[var6][var8][var35 - 1] & 0x4) != 0; var35--) {
                        }
                        int var36;
                        for (var36 = var7; var36 < class385.field5425 && (class277.field3734[var6][var8][var36 + 1] & 0x4) != 0; var36++) {
                        }
                        label274: while (var33 > 0) {
                            for (int var37 = var35; var37 <= var36; var37++) {
                                if ((class277.field3734[var6][var33 - 1][var37] & 0x4) == 0) {
                                    break label274;
                                }
                            }
                            var33--;
                        }
                        label263: while (var34 < class116.field1621) {
                            for (int var38 = var35; var38 <= var36; var38++) {
                                if ((class277.field3734[var6][var34 + 1][var38] & 0x4) == 0) {
                                    break label263;
                                }
                            }
                            var34++;
                        }
                        if ((var34 + 1 - var33) * (var36 + 1 - var35) >= 4) {
                            int var39 = class44.field703[var6][var33][var35];
                            class375.method2341(4, var33 * 128, var34 * 128 + 128, var35 * 128, var36 * 128 + 128, var39, var39);
                            for (int var40 = var33; var40 <= var34; var40++) {
                                for (int var41 = var35; var41 <= var36; var41++) {
                                    class277.field3734[var6][var40][var41] = (byte) class323.method2059(class277.field3734[var6][var40][var41], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
