import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class295 extends class240 {

    @OriginalMember(owner = "client!te", name = "z", descriptor = "[B")
    public byte[] field4675;

    @OriginalMember(owner = "client!te", name = "C", descriptor = "[Lec;")
    public class39[] field4678;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "[Loc;")
    public class144[] field4669;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[I")
    private int[] field4668;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "[B")
    public byte[] field4664;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[B")
    public byte[] field4663;

    @OriginalMember(owner = "client!te", name = "D", descriptor = "[S")
    public short[] field4679;

    @OriginalMember(owner = "client!te", name = "B", descriptor = "I")
    public int field4677;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "Z")
    public static boolean field4672 = false;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "I")
    public static int field4670 = -1;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field4666;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!te", name = "A", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!te", name = "E", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[[[B")
    public static byte[][][] field4667;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BLjava/lang/String;Z)V", line = 4)
    public static final void method2071(byte arg0, String arg1, boolean arg2) {
        if (arg0 <= 56) {
            method2074(120, 105);
        }
        field4673++;
        if (!arg2) {
            try {
                class226.field3621.getAppletContext().showDocument(new URL(class226.field3621.getCodeBase(), arg1), "_top");
            } catch (Exception var7) {
            }
            return;
        }
        if (class265.field4126 && class181.field2903) {
            try {
                class49.method378(class83.field1235.field5052, -27286, "openjs", new Object[] { (new URL(class226.field3621.getCodeBase(), arg1)).toString() });
                return;
            } catch (Throwable var8) {
            }
        }
        try {
            class226.field3621.getAppletContext().showDocument(new URL(class226.field3621.getCodeBase(), arg1), "_blank");
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V", line = 45)
    public static void method2072(int arg0) {
        if (arg0 == 128) {
            field4667 = (byte[][][]) null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lja;ZILja;)V", line = 60)
    public static final void method2073(class64 arg0, boolean arg1, int arg2, class64 arg3) {
        class152.field2454 = arg3;
        field4666++;
        class136.field2160 = arg1;
        client.field3911 = arg0;
        if (arg2 != 22400) {
            field4670 = 93;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)V", line = 76)
    public static final void method2074(int arg0, int arg1) {
        field4676++;
        if (!class213.method1543(arg0 + 39896, arg1)) {
            return;
        }
        if (arg0 != -14255) {
            field4672 = true;
        }
        class292[] var2 = class207.field3269[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class292 var4 = var2[var3];
            if (var4 != null) {
                var4.field4484 = 1;
                var4.field4565 = 0;
                var4.field4479 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "([BLwc;[IB)Z", line = 114)
    public final boolean method2075(byte[] arg0, class104 arg1, int[] arg2, byte arg3) {
        field4665++;
        boolean var5 = true;
        int var6 = 0;
        class144 var7 = null;
        if (arg3 >= -10) {
            return true;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field4668[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method803(255, arg2, var9 >> 2);
                        } else {
                            var7 = arg1.method808(-65, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4669[var8] = var7;
                        this.field4668[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V", line = 176)
    public final void method2076(int arg0) {
        this.field4668 = null;
        field4680++;
        if (arg0 != 128) {
            field4672 = false;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IILob;B)V", line = 188)
    public static final void method2077(int arg0, int arg1, class292 arg2, byte arg3) {
        if (arg2.field4583 == 1) {
            class34.method236((short) 25, arg2.field4531, arg2.field4475, 0, -1, (byte) 40, "", 0L);
            class77.field1178++;
        }
        if (arg2.field4583 == 2 && !class219.field3514) {
            String var4 = class206.method1506(false, arg2);
            if (var4 != null) {
                class34.method236((short) 2, arg2.field4531, var4, -1, -1, (byte) 40, "<col=00ff00>" + arg2.field4550, 0L);
                class179.field2859++;
            }
        }
        if (arg3 >= -78) {
            field4670 = -40;
        }
        field4671++;
        if (arg2.field4583 == 3) {
            class196.field3115++;
            class34.method236((short) 15, arg2.field4531, class41.field733, 0, -1, (byte) 40, "", 0L);
        }
        if (arg2.field4583 == 4) {
            class99.field1638++;
            class34.method236((short) 7, arg2.field4531, arg2.field4475, 0, -1, (byte) 40, "", 0L);
        }
        if (arg2.field4583 == 5) {
            class163.field2550++;
            class34.method236((short) 3, arg2.field4531, arg2.field4475, 0, -1, (byte) 40, "", 0L);
        }
        if (arg2.field4583 == 6 && class168.field2612 == null) {
            class76.field1169++;
            class34.method236((short) 32, arg2.field4531, arg2.field4475, -1, -1, (byte) 40, "", 0L);
        }
        if (arg2.field4490 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg2.field4512; var6++) {
                for (int var7 = 0; var7 < arg2.field4432; var7++) {
                    int var8 = (arg2.field4568 + 32) * var7;
                    int var9 = (arg2.field4551 + 32) * var6;
                    if (var5 < 20) {
                        var9 += arg2.field4482[var5];
                        var8 += arg2.field4545[var5];
                    }
                    if (var8 <= arg0 && var9 <= arg1 && (var8 + 32) > arg0 && arg1 < (var9 + 32)) {
                        class107.field1789 = arg2;
                        class327.field5070 = var5;
                        if (arg2.field4439[var5] > 0) {
                            class42 var10 = client.method1786(arg2);
                            class179 var11 = class208.method1521(-1361, arg2.field4439[var5] - 1);
                            if (class152.field2451 == 1 && var10.method343(65)) {
                                if (class284.field4367 != arg2.field4531 || class326.field5058 != var5) {
                                    class260.field4043++;
                                    class34.method236((short) 21, arg2.field4531, class57.field917, var5, -1, (byte) 40, class258.field3979 + " -> <col=ff9040>" + var11.field2825, (long) var11.field2860);
                                }
                            } else if (class219.field3514 && var10.method343(121)) {
                                class37 var12 = class88.field1349 == -1 ? null : class185.method1392(class88.field1349, 11);
                                if ((class329.field5083 & 0x10) != 0 && (var12 == null || var11.method1336(class88.field1349, true, var12.field676) != var12.field676)) {
                                    class34.method236((short) 60, arg2.field4531, class239.field3722, var5, class306.field4820, (byte) 40, class82.field1232 + " -> <col=ff9040>" + var11.field2825, (long) var11.field2860);
                                    class6.field95++;
                                }
                            } else {
                                class219.field3494++;
                                String[] var13 = var11.field2797;
                                if (class107.field1779) {
                                    var13 = class173.method1282(var13, 24624);
                                }
                                if (var10.method343(87)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            class233.field3696++;
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 41;
                                            } else {
                                                var15 = 37;
                                            }
                                            class34.method236(var15, arg2.field4531, var13[var14], var5, -1, (byte) 40, "<col=ff9040>" + var11.field2825, (long) var11.field2860);
                                        }
                                    }
                                }
                                if (var10.method335((byte) -108)) {
                                    class37.field675++;
                                    class34.method236((short) 57, arg2.field4531, class57.field917, var5, class89.field1364, (byte) 40, "<col=ff9040>" + var11.field2825, (long) var11.field2860);
                                }
                                if (var10.method343(89) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class81.field1218++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 44;
                                            }
                                            if (var16 == 1) {
                                                var17 = 58;
                                            }
                                            if (var16 == 2) {
                                                var17 = 17;
                                            }
                                            class34.method236(var17, arg2.field4531, var13[var16], var5, -1, (byte) 40, "<col=ff9040>" + var11.field2825, (long) var11.field2860);
                                        }
                                    }
                                }
                                String[] var18 = arg2.field4570;
                                if (class107.field1779) {
                                    var18 = class173.method1282(var18, 24624);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            byte var20 = 0;
                                            class12.field223++;
                                            if (var19 == 0) {
                                                var20 = 1;
                                            }
                                            if (var19 == 1) {
                                                var20 = 28;
                                            }
                                            if (var19 == 2) {
                                                var20 = 24;
                                            }
                                            if (var19 == 3) {
                                                var20 = 30;
                                            }
                                            if (var19 == 4) {
                                                var20 = 31;
                                            }
                                            class34.method236(var20, arg2.field4531, var18[var19], var5, -1, (byte) 40, "<col=ff9040>" + var11.field2825, (long) var11.field2860);
                                        }
                                    }
                                }
                                class34.method236((short) 1005, arg2.field4531, class285.field4377, var5, class68.field1087, (byte) 40, "<col=ff9040>" + var11.field2825, (long) var11.field2860);
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg2.field4537) {
            return;
        }
        if (!class219.field3514) {
            for (int var21 = 9; var21 >= 5; var21--) {
                String var22 = class175.method1311(arg2, var21, (byte) 81);
                if (var22 != null) {
                    class68.field1091++;
                    class34.method236((short) 1006, arg2.field4531, var22, arg2.field4536, class200.method1451(var21, 3852, arg2), (byte) 40, arg2.field4435, (long) (var21 + 1));
                }
            }
            String var23 = class206.method1506(false, arg2);
            if (var23 != null) {
                class34.method236((short) 2, arg2.field4531, var23, arg2.field4536, -1, (byte) 40, arg2.field4435, 0L);
                class179.field2859++;
            }
            for (int var24 = 4; var24 >= 0; var24--) {
                String var25 = class175.method1311(arg2, var24, (byte) 81);
                if (var25 != null) {
                    class34.method236((short) 18, arg2.field4531, var25, arg2.field4536, class200.method1451(var24, 3852, arg2), (byte) 40, arg2.field4435, (long) (var24 + 1));
                    class68.field1091++;
                }
            }
            if (client.method1786(arg2).method341(281102591)) {
                class34.method236((short) 32, arg2.field4531, class11.field176, arg2.field4536, -1, (byte) 40, "", 0L);
                class76.field1169++;
            }
        } else if (client.method1786(arg2).method344((byte) 24) && (class329.field5083 & 0x20) != 0) {
            class254.field3938++;
            class34.method236((short) 4, arg2.field4531, class239.field3722, arg2.field4536, class306.field4820, (byte) 40, class82.field1232 + " -> " + arg2.field4435, 0L);
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V", line = 509)
    public class295() {
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "([B)V", line = 516)
    public class295(byte[] arg0) {
        this.field4675 = new byte[128];
        this.field4678 = new class39[128];
        this.field4669 = new class144[128];
        this.field4668 = new int[128];
        this.field4664 = new byte[128];
        this.field4663 = new byte[128];
        this.field4679 = new short[128];
        class101 var2 = new class101(arg0);
        int var3;
        for (var3 = 0; var2.field1661[var2.field1667 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method727((byte) 112);
        }
        var2.field1667++;
        var3++;
        int var6 = var2.field1667;
        var2.field1667 += var3;
        int var7;
        for (var7 = 0; var2.field1661[var2.field1667 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method727((byte) 112);
        }
        var7++;
        var2.field1667++;
        int var10 = var2.field1667;
        var2.field1667 += var7;
        int var11;
        for (var11 = 0; var2.field1661[var2.field1667 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method727((byte) 112);
        }
        var2.field1667++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method741(124);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        }
        class39[] var19 = new class39[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class39 var21 = var19[var20] = new class39();
            int var22 = var2.method741(59);
            if (var22 > 0) {
                var21.field697 = new byte[var22 * 2];
            }
            int var23 = var2.method741(73);
            if (var23 > 0) {
                var21.field700 = new byte[var23 * 2 + 2];
                var21.field700[1] = 64;
            }
        }
        int var24 = var2.method741(115);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var2.method741(24);
        int var27 = 0;
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        while (var2.field1661[var2.field1667 + var27] != 0) {
            var27++;
        }
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var2.method727((byte) 110);
        }
        var2.field1667++;
        var27++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var2.method741(96);
            this.field4679[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var2.method741(85);
            this.field4679[var34] = (short) (this.field4679[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 >= var29.length) {
                    var35 = -1;
                } else {
                    var35 = var29[var36++];
                }
                var37 = var2.method761(-1);
            }
            this.field4679[var38] = (short) (this.field4679[var38] + class280.method2001(var37 - 1 << 14, 32768));
            var35--;
            this.field4668[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4668[var42] != 0) {
                if (var39 == 0) {
                    if (var40 >= var4.length) {
                        var39 = -1;
                    } else {
                        var39 = var4[var40++];
                    }
                    var41 = var2.field1661[var6++] - 1;
                }
                var39--;
                this.field4663[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4668[var46] != 0) {
                if (var44 == 0) {
                    var43 = var2.field1661[var10++] + 16 << 2;
                    if (var8.length > var45) {
                        var44 = var8[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field4675[var46] = (byte) var43;
                var44--;
            }
        }
        int var47 = 0;
        class39 var48 = null;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field4668[var50] != 0) {
                if (var47 == 0) {
                    var48 = var19[var14[var49]];
                    if (var49 >= var12.length) {
                        var47 = -1;
                    } else {
                        var47 = var12[var49++];
                    }
                }
                var47--;
                this.field4678[var50] = var48;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var52 == 0) {
                if (var51 >= var29.length) {
                    var52 = -1;
                } else {
                    var52 = var29[var51++];
                }
                if (this.field4668[var54] > 0) {
                    var53 = var2.method741(86) + 1;
                }
            }
            this.field4664[var54] = (byte) var53;
            var52--;
        }
        this.field4677 = var2.method741(44) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class39 var56 = var19[var55];
            if (var56.field697 != null) {
                for (int var57 = 1; var57 < var56.field697.length; var57 += 2) {
                    var56.field697[var57] = var2.method727((byte) 110);
                }
            }
            if (var56.field700 != null) {
                for (int var58 = 3; var58 < var56.field700.length - 2; var58 += 2) {
                    var56.field700[var58] = var2.method727((byte) 118);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var2.method727((byte) 109);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var2.method727((byte) 124);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class39 var62 = var19[var61];
            if (var62.field700 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field700.length; var64 += 2) {
                    var63 = var63 + var2.method741(88) + 1;
                    var62.field700[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class39 var66 = var19[var65];
            if (var66.field697 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field697.length; var68 += 2) {
                    var67 = var2.method741(39) + var67 + 1;
                    var66.field697[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var2.method741(27);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = (var69 + var2.method741(77)) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field4664[var73] = (byte) (this.field4664[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                int var76 = (var75 - var71) * var72 + ((var75 - var71) / 2);
                byte var77 = var25[var74 + 1];
                var74 += 2;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class208.method1522(var75 - var71, var76, 105);
                    var76 += var77 - var72;
                    this.field4664[var78] = (byte) (this.field4664[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var77;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field4664[var80] = (byte) (this.field4664[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var28 != null) {
            int var82 = var2.method741(23);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 += var2.method741(104) + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field4675[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field4675[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var28.length > var88) {
                byte var89 = var28[var88];
                int var90 = (var89 - var84) / 2 + (var89 - var84) * var85;
                int var91 = var28[var88 + 1] << 1;
                var88 += 2;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class208.method1522(var89 - var84, var90, 110);
                    int var94 = (this.field4675[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    var90 += var91 - var85;
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field4675[var92] = (byte) var94;
                }
                var85 = var91;
                var84 = var89;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field4675[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field4675[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field699 = var2.method741(52);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class39 var100 = var19[var99];
            if (var100.field697 != null) {
                var100.field710 = var2.method741(58);
            }
            if (var100.field700 != null) {
                var100.field704 = var2.method741(24);
            }
            if (var100.field699 > 0) {
                var100.field701 = var2.method741(91);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field709 = var2.method741(71);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class39 var103 = var19[var102];
            if (var103.field709 > 0) {
                var103.field702 = var2.method741(53);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class39 var105 = var19[var104];
            if (var105.field702 > 0) {
                var105.field706 = var2.method741(45);
            }
        }
    }
}
