import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class435 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "[Z")
    public boolean[] field6450 = new boolean[16];

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "[Z")
    public boolean[] field6454 = new boolean[256];

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "[I")
    public int[] field6452 = new int[256];

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "[I")
    public int[] field6460 = new int[16];

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "[[B")
    public byte[][] field6467 = new byte[6][258];

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "[[I")
    public int[][] field6465 = new int[6][258];

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
    public int[] field6471 = new int[6];

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "[B")
    public byte[] field6461 = new byte[18002];

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "[B")
    public byte[] field6474 = new byte[18002];

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "[I")
    public int[] field6470 = new int[257];

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "[[I")
    public int[][] field6480 = new int[6][258];

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "[B")
    public byte[] field6468 = new byte[4096];

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public int field6479 = 0;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public int field6482 = 0;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "[B")
    public byte[] field6481 = new byte[256];

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "[[I")
    public int[][] field6477 = new int[6][258];

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "B")
    public byte field6459;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public int field6451;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public int field6453;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public int field6456;

    @OriginalMember(owner = "client!ve", name = "j", descriptor = "I")
    public int field6457;

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public int field6458;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "I")
    public int field6462;

    @OriginalMember(owner = "client!ve", name = "p", descriptor = "I")
    public int field6463;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "I")
    public int field6464;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public int field6469;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field6472;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public int field6473;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public int field6475;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public int field6478;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "[B")
    public byte[] field6466;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "[B")
    public byte[] field6476;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "[Ld;")
    public static class132[] field6449;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;ZI)V")
    public static final void method2715(String arg0, boolean arg1, int arg2) {
        field6448++;
        String var3 = arg0.toLowerCase();
        if (arg2 != -18633) {
            field6449 = null;
        }
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class498.field7255.field8409 : class498.field7255.field8408);
        for (int var8 = var6; var8 < var7; var8++) {
            class102 var11 = class498.field7255.method3401(arg2 + 18632, var8);
            if (var11.field1211 && var11.method624(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class571.field8241 = null;
                    class289.field3995 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class571.field8241 = var4;
        class289.field3995 = var5;
        class257.field3661 = 0;
        String[] var9 = new String[class289.field3995];
        for (int var10 = 0; var10 < class289.field3995; var10++) {
            var9[var10] = class498.field7255.method3401(-1, var4[var10]).method624(false);
        }
        class245.method1629(var9, (byte) 109, class571.field8241);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lpt;Luaa;)V")
    public static final void method2716(class460 arg0, class99 arg1) {
        if (!arg1.field1181) {
            return;
        }
        short var2 = arg1.field1165;
        short var3 = arg1.field1164;
        byte var4 = arg1.field1166;
        byte var5 = arg1.field1178;
        int var6 = (var2 << class465.field6917) + class170.field2095;
        int var7 = (var3 << class465.field6917) + class170.field2095;
        class99[][] var8 = class431.field6408[var4];
        if (class492.field7164 == field6449) {
            class103.field1228.method319(class544.field7780[0].method249(var6, var7), class655.method3738(var2, var3), class49.method272(var2, var3), class36.method197(var2, var3));
        }
        if (arg1.field1172) {
            if (class274.field3837) {
                if (var4 > 0) {
                    class99 var9 = class431.field6408[var4 - 1][var2][var3];
                    if (var9 != null && var9.field1181) {
                        return;
                    }
                }
                if (var2 <= class550.field7844 && var2 > class371.field5674) {
                    class99 var10 = var8[var2 - 1][var3];
                    if (var10 != null && var10.field1181 && (var10.field1172 || (arg1.field1163 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class550.field7844 && var2 < class38.field420 - 1) {
                    class99 var11 = var8[var2 + 1][var3];
                    if (var11 != null && var11.field1181 && (var11.field1172 || (arg1.field1163 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class650.field9385 && var3 > class82.field926) {
                    class99 var12 = var8[var2][var3 - 1];
                    if (var12 != null && var12.field1181 && (var12.field1172 || (arg1.field1163 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class650.field9385 && var3 < class465.field6912 - 1) {
                    class99 var13 = var8[var2][var3 + 1];
                    if (var13 != null && var13.field1181 && (var13.field1172 || (arg1.field1163 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class274.field3837 = true;
            }
            arg1.field1172 = false;
            if (arg1.field1162 != null) {
                class99 var14 = arg1.field1162;
                if (!class571.method3315(var14.field1178, var2, var3)) {
                    field6449[var14.field1178].method254(var2, var3);
                }
                class599 var15 = var14.field1168;
                if (var15 != null) {
                    if (class59.field681) {
                        if ((var15.field8750 & arg1.field1169) == 0) {
                            class430.method2677(arg0, var4, var2, var3);
                        } else {
                            class635.method3621(arg0, var15.field8750, var5, var2, var3);
                        }
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    var15.method88(class103.field1228, (byte) -128);
                }
                for (class104 var16 = var14.field1167; var16 != null; var16 = var16.field1251) {
                    class144 var17 = var16.field1253;
                    if (var17 != null) {
                        if (class59.field681) {
                            class430.method2677(arg0, var4, var2, var3);
                            class103.field1228.method340(arg0.field6869, arg0.field6871);
                        }
                        var17.method88(class103.field1228, (byte) -128);
                    }
                }
            }
            boolean var18 = !class571.method3315(var5, var2, var3);
            if (var18) {
                field6449[var5].method254(var2, var3);
                class111 var19 = arg1.field1174;
                if (var19 != null && var19.field1360) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var20 = var19.method88(class103.field1228, (byte) -128);
                    if (var20 != null) {
                        var20.field9090 = var19;
                        var20.field9087 = var4;
                        var20.field9092 = var2;
                        var20.field9088 = var3;
                        class24.field266.method3293(var20, (byte) 74);
                    }
                }
            }
            int var21 = 0;
            int var22 = 0;
            class599 var23 = arg1.field1168;
            class356 var24 = arg1.field1175;
            if (var23 != null || var24 != null) {
                if (class550.field7844 == var2) {
                    var21++;
                } else if (class550.field7844 < var2) {
                    var21 += 2;
                }
                if (class650.field9385 == var3) {
                    var21 += 3;
                } else if (class650.field9385 > var3) {
                    var21 += 6;
                }
                var22 = class289.field4006[var21];
                arg1.field1169 = class481.field7062[var21];
            }
            if (var23 != null) {
                if ((var23.field8750 & class378.field5758[var21]) == 0) {
                    arg1.field1182 = 0;
                } else if (var23.field8750 == 16) {
                    arg1.field1182 = 3;
                    arg1.field1184 = class237.field3388[var21];
                    arg1.field1180 = (byte) (3 - arg1.field1184);
                } else if (var23.field8750 == 32) {
                    arg1.field1182 = 6;
                    arg1.field1184 = class233.field3266[var21];
                    arg1.field1180 = (byte) (6 - arg1.field1184);
                } else if (var23.field8750 == 64) {
                    arg1.field1182 = 12;
                    arg1.field1184 = class637.field9165[var21];
                    arg1.field1180 = (byte) (12 - arg1.field1184);
                } else {
                    arg1.field1182 = 9;
                    arg1.field1184 = class118.field1461[var21];
                    arg1.field1180 = (byte) (9 - arg1.field1184);
                }
                if ((var23.field8750 & var22) != 0 && !class313.method2064(var5, var2, var3, var23.field8750)) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var25 = var23.method88(class103.field1228, (byte) -128);
                    if (var25 != null) {
                        var25.field9090 = var23;
                        var25.field9087 = var4;
                        var25.field9092 = var2;
                        var25.field9088 = var3;
                        class24.field266.method3293(var25, (byte) 112);
                    }
                }
                class599 var26 = arg1.field1176;
                if (var26 != null && (var26.field8750 & var22) != 0 && !class313.method2064(var5, var2, var3, var26.field8750)) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var27 = var26.method88(class103.field1228, (byte) -128);
                    if (var27 != null) {
                        var27.field9090 = var26;
                        var27.field9087 = var4;
                        var27.field9092 = var2;
                        var27.field9088 = var3;
                        class24.field266.method3293(var27, (byte) 122);
                    }
                }
            }
            if (var24 != null && !class218.method1432(var5, var2, var3, var24.method548(262144))) {
                class356 var28 = arg1.field1161;
                if ((var24.field5074 & var22) != 0) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var29 = var24.method88(class103.field1228, (byte) -128);
                    if (var29 != null) {
                        var29.field9090 = var24;
                        var29.field9087 = var4;
                        var29.field9092 = var2;
                        var29.field9088 = var3;
                        class24.field266.method3293(var29, (byte) 68);
                    }
                } else if (var24.field5074 == 256) {
                    int var30 = var24.field5065 - class625.field9043;
                    int var31 = var24.field5071 - class560.field7982;
                    int var32 = var24.field5073;
                    int var33;
                    if (var32 == 1 || var32 == 2) {
                        var33 = -var30;
                    } else {
                        var33 = var30;
                    }
                    int var34;
                    if (var32 == 2 || var32 == 3) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    if (var34 < var33) {
                        class630 var35 = var24.method88(class103.field1228, (byte) -128);
                        if (var35 != null) {
                            var35.field9090 = var24;
                            var35.field9087 = var4;
                            var35.field9092 = var2;
                            var35.field9088 = var3;
                            class24.field266.method3293(var35, (byte) 119);
                        }
                    } else if (var28 != null) {
                        class630 var36 = var28.method88(class103.field1228, (byte) -128);
                        if (var36 != null) {
                            var36.field9090 = var28;
                            var36.field9087 = var4;
                            var36.field9092 = var2;
                            var36.field9088 = var3;
                            class24.field266.method3293(var36, (byte) 86);
                        }
                    }
                }
            }
            if (var18) {
                class111 var37 = arg1.field1174;
                if (var37 != null && !var37.field1360) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var38 = var37.method88(class103.field1228, (byte) -128);
                    if (var38 != null) {
                        var38.field9090 = var37;
                        var38.field9087 = var4;
                        var38.field9092 = var2;
                        var38.field9088 = var3;
                        class24.field266.method3293(var38, (byte) 98);
                    }
                }
                class247 var39 = arg1.field1177;
                if (var39 != null && !var39.field3505) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var40 = var39.method88(class103.field1228, (byte) -128);
                    if (var40 != null) {
                        var40.field9090 = var39;
                        var40.field9087 = var4;
                        var40.field9092 = var2;
                        var40.field9088 = var3;
                        class24.field266.method3293(var40, (byte) 82);
                    }
                }
            }
            byte var41 = arg1.field1163;
            if (var41 != 0) {
                if (var2 < class550.field7844 && (var41 & 0x4) != 0) {
                    class99 var42 = var8[var2 + 1][var3];
                    if (var42 != null && var42.field1181) {
                        class453.field6777.method736(false, var42);
                    }
                }
                if (var3 < class650.field9385 && (var41 & 0x2) != 0) {
                    class99 var43 = var8[var2][var3 + 1];
                    if (var43 != null && var43.field1181) {
                        class453.field6777.method736(false, var43);
                    }
                }
                if (var2 > class550.field7844 && (var41 & 0x1) != 0) {
                    class99 var44 = var8[var2 - 1][var3];
                    if (var44 != null && var44.field1181) {
                        class453.field6777.method736(false, var44);
                    }
                }
                if (var3 > class650.field9385 && (var41 & 0x8) != 0) {
                    class99 var45 = var8[var2][var3 - 1];
                    if (var45 != null && var45.field1181) {
                        class453.field6777.method736(false, var45);
                    }
                }
            }
        }
        if (arg1.field1182 != 0) {
            boolean var46 = true;
            for (class104 var47 = arg1.field1167; var47 != null; var47 = var47.field1251) {
                if (class348.field4982 != var47.field1253.field1767 && (var47.field1249 & arg1.field1182) == arg1.field1184) {
                    var46 = false;
                    break;
                }
            }
            if (var46) {
                class599 var48 = arg1.field1168;
                if (!class313.method2064(var5, var2, var3, var48.field8750)) {
                    if (class59.field681) {
                        label663: {
                            if (var48.field8750 >= 16) {
                                int var49 = var2 - class550.field7844;
                                int var50 = var3 - class650.field9385;
                                if (var48.field8750 == 16) {
                                    int var51 = var49 - class170.field2095;
                                    int var52 = class170.field2095 + var50;
                                    if (var52 < var51 && var2 > 0 && var3 <= class91.field1047) {
                                        class430.method2677(arg0, var4, var2 - 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field8750 == 32) {
                                    int var53 = class170.field2095 + var49;
                                    int var54 = class170.field2095 + var50;
                                    if (var54 < -var53 && var2 < class588.field8441 && var3 < class91.field1047) {
                                        class430.method2677(arg0, var4, var2 + 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field8750 == 64) {
                                    int var55 = class170.field2095 + var49;
                                    int var56 = var50 - class170.field2095;
                                    if (var56 > var55 && var2 < class588.field8441 && var3 > 0) {
                                        class430.method2677(arg0, var4, var2 + 1, var3 - 1);
                                        break label663;
                                    }
                                } else if (var48.field8750 == 128) {
                                    int var57 = var49 - class170.field2095;
                                    int var58 = var50 - class170.field2095;
                                    if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                        class430.method2677(arg0, var4, var2 - 1, var3 - 1);
                                        break label663;
                                    }
                                }
                            }
                            class430.method2677(arg0, var4, var2, var3);
                        }
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var59 = var48.method88(class103.field1228, (byte) -128);
                    if (var59 != null) {
                        var59.field9090 = var48;
                        var59.field9087 = var4;
                        var59.field9092 = var2;
                        var59.field9088 = var3;
                        class24.field266.method3293(var59, (byte) 116);
                    }
                }
                arg1.field1182 = 0;
            }
        }
        if (arg1.field1170) {
            try {
                arg1.field1170 = false;
                int var60 = 0;
                label606: for (class104 var61 = arg1.field1167; var61 != null; var61 = var61.field1251) {
                    class144 var62 = var61.field1253;
                    if (class348.field4982 != var62.field1767) {
                        for (int var63 = var62.field1773; var63 <= var62.field1762; var63++) {
                            for (int var64 = var62.field1758; var64 <= var62.field1761; var64++) {
                                class99 var65 = var8[var63][var64];
                                if (var65.field1172) {
                                    arg1.field1170 = true;
                                    continue label606;
                                }
                                if (var65.field1182 != 0) {
                                    int var66 = 0;
                                    if (var63 > var62.field1773) {
                                        var66++;
                                    }
                                    if (var63 < var62.field1762) {
                                        var66 += 4;
                                    }
                                    if (var64 > var62.field1758) {
                                        var66 += 8;
                                    }
                                    if (var64 < var62.field1761) {
                                        var66 += 2;
                                    }
                                    if ((var66 & var65.field1182) == arg1.field1180) {
                                        arg1.field1170 = true;
                                        continue label606;
                                    }
                                }
                            }
                        }
                        int var67 = class550.field7844 - var62.field1773;
                        int var68 = var62.field1762 - class550.field7844;
                        if (var68 > var67) {
                            var67 = var68;
                        }
                        int var69 = class650.field9385 - var62.field1758;
                        int var70 = var62.field1761 - class650.field9385;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        arg0.field6866[var60] = var62;
                        arg0.field6861[var60++] = var67 + var69;
                    }
                }
                while (var60 > 0) {
                    int var71 = -50;
                    int var72 = -1;
                    for (int var73 = 0; var73 < var60; var73++) {
                        class144 var74 = arg0.field6866[var73];
                        if (class348.field4982 != var74.field1767) {
                            int var75 = arg0.field6861[var73];
                            if (var75 > var71) {
                                var71 = var75;
                                var72 = var73;
                            } else if (var71 == var75) {
                                int var76 = var74.field1764 - class625.field9043;
                                int var77 = var74.field1768 - class560.field7982;
                                int var78 = arg0.field6866[var72].field1764 - class625.field9043;
                                int var79 = arg0.field6866[var72].field1768 - class560.field7982;
                                if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                    var72 = var73;
                                }
                            }
                        }
                    }
                    if (var72 == -1) {
                        break;
                    }
                    class144 var80 = arg0.field6866[var72];
                    var80.field1767 = class348.field4982;
                    if (!class128.method791(var5, var80.field1773, var80.field1762, var80.field1758, var80.field1761, var80.method413((byte) 58))) {
                        if (class59.field681) {
                            if (var80.field1766 == 0) {
                                class32.method184(arg0, var4, var80.field1773, var80.field1758, var80.field1762, var80.field1761);
                            } else {
                                class430.method2677(arg0, var4, var2, var3);
                                int var81 = var2 - class550.field7844;
                                int var82 = var3 - class650.field9385;
                                if (var80.field1766 == 2) {
                                    if (var82 > -var81) {
                                        class232.method1494(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class232.method1494(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var82 > var81) {
                                    class232.method1494(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class232.method1494(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class103.field1228.method340(arg0.field6869, arg0.field6871);
                        }
                        class630 var83 = var80.method88(class103.field1228, (byte) -128);
                        if (var83 != null) {
                            var83.field9090 = var80;
                            var83.field9087 = var4;
                            var83.field9092 = var80.field1773;
                            var83.field9088 = var80.field1758;
                            class24.field266.method3293(var83, (byte) 114);
                        }
                    }
                    for (int var84 = var80.field1773; var84 <= var80.field1762; var84++) {
                        for (int var85 = var80.field1758; var85 <= var80.field1761; var85++) {
                            class99 var86 = var8[var84][var85];
                            if (var86.field1182 != 0) {
                                class453.field6777.method736(false, var86);
                            } else if ((var2 != var84 || var3 != var85) && var86.field1181) {
                                class453.field6777.method736(false, var86);
                            }
                        }
                    }
                }
                if (arg1.field1170) {
                    return;
                }
            } catch (Exception var121) {
                arg1.field1170 = false;
            }
        }
        if (arg1.field1171 != null && (byte) (class452.field6741 & 0xFF) == arg1.field1179) {
            class33 var87 = arg1.field1171;
            int var88 = field6449[var4].method259(var2, var3);
            int var89;
            if (var4 < class637.field9161 - 1) {
                var89 = field6449[var4].method259(var2, var3) - field6449[var4 + 1].method259(var2, var3);
            } else {
                var89 = 0x8 << class465.field6917;
            }
            class59.field678.method2018(var6, var88, var7, arg0.field6865);
            int var90 = arg0.field6865[2];
            class59.field678.method2018(var6, var88 - var89, var7, arg0.field6865);
            int var91 = arg0.field6865[2];
            int var92 = var90;
            int var93 = var91;
            if (var90 > var91) {
                var92 = var91;
                var93 = var90;
            }
            int var94 = var92 - class582.field8384;
            int var95 = class582.field8384 + var93;
            var87.field384 = var94;
            var87.field382 = var95;
            var87.field381 = true;
            class103.field1228.method396(var87);
        }
        if (!arg1.field1181) {
            return;
        }
        if (arg1.field1182 != 0) {
            return;
        }
        if (var2 <= class550.field7844 && var2 > class371.field5674) {
            class99 var96 = var8[var2 - 1][var3];
            if (var96 != null && var96.field1181) {
                return;
            }
        }
        if (var2 >= class550.field7844 && var2 < class38.field420 - 1) {
            class99 var97 = var8[var2 + 1][var3];
            if (var97 != null && var97.field1181) {
                return;
            }
        }
        if (var3 <= class650.field9385 && var3 > class82.field926) {
            class99 var98 = var8[var2][var3 - 1];
            if (var98 != null && var98.field1181) {
                return;
            }
        }
        if (var3 >= class650.field9385 && var3 < class465.field6912 - 1) {
            class99 var99 = var8[var2][var3 + 1];
            if (var99 != null && var99.field1181) {
                return;
            }
        }
        arg1.field1181 = false;
        class477.field7042--;
        class247 var100 = arg1.field1177;
        if (var100 != null && var100.field3505) {
            if (class59.field681) {
                class430.method2677(arg0, var4, var2, var3);
                class103.field1228.method340(arg0.field6869, arg0.field6871);
            }
            class630 var101 = var100.method88(class103.field1228, (byte) -128);
            if (var101 != null) {
                var101.field9090 = var100;
                var101.field9087 = var4;
                var101.field9092 = var2;
                var101.field9088 = var3;
                class24.field266.method3293(var101, (byte) 104);
            }
        }
        if (arg1.field1169 != 0) {
            class356 var102 = arg1.field1175;
            if (var102 != null && !class218.method1432(var5, var2, var3, var102.method548(262144))) {
                if ((var102.field5074 & arg1.field1169) != 0) {
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class630 var103 = var102.method88(class103.field1228, (byte) -128);
                    if (var103 != null) {
                        var103.field9090 = var102;
                        var103.field9087 = var4;
                        var103.field9092 = var2;
                        var103.field9088 = var3;
                        class24.field266.method3293(var103, (byte) 75);
                    }
                } else if (var102.field5074 == 256) {
                    int var104 = var102.field5065 - class625.field9043;
                    int var105 = var102.field5071 - class560.field7982;
                    int var106 = var102.field5073;
                    int var107;
                    if (var106 == 1 || var106 == 2) {
                        var107 = -var104;
                    } else {
                        var107 = var104;
                    }
                    int var108;
                    if (var106 == 2 || var106 == 3) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    if (class59.field681) {
                        class430.method2677(arg0, var4, var2, var3);
                        class103.field1228.method340(arg0.field6869, arg0.field6871);
                    }
                    class356 var109 = arg1.field1161;
                    if (var108 > var107) {
                        class630 var110 = var102.method88(class103.field1228, (byte) -128);
                        if (var110 != null) {
                            var110.field9090 = var102;
                            var110.field9087 = var4;
                            var110.field9092 = var2;
                            var110.field9088 = var3;
                            class24.field266.method3293(var110, (byte) 127);
                        }
                    } else if (var109 != null) {
                        class630 var111 = var109.method88(class103.field1228, (byte) -128);
                        if (var111 != null) {
                            var111.field9090 = var109;
                            var111.field9087 = var4;
                            var111.field9092 = var2;
                            var111.field9088 = var3;
                            class24.field266.method3293(var111, (byte) 122);
                        }
                    }
                }
            }
            class599 var112 = arg1.field1168;
            class599 var113 = arg1.field1176;
            if (var113 != null && (var113.field8750 & arg1.field1169) != 0 && !class313.method2064(var5, var2, var3, var113.field8750)) {
                if (class59.field681) {
                    class635.method3621(arg0, var113.field8750, var4, var2, var3);
                    class103.field1228.method340(arg0.field6869, arg0.field6871);
                }
                class630 var114 = var113.method88(class103.field1228, (byte) -128);
                if (var114 != null) {
                    var114.field9090 = var113;
                    var114.field9087 = var4;
                    var114.field9092 = var2;
                    var114.field9088 = var3;
                    class24.field266.method3293(var114, (byte) 65);
                }
            }
            if (var112 != null && (var112.field8750 & arg1.field1169) != 0 && !class313.method2064(var5, var2, var3, var112.field8750)) {
                if (class59.field681) {
                    class635.method3621(arg0, var112.field8750, var4, var2, var3);
                    class103.field1228.method340(arg0.field6869, arg0.field6871);
                }
                class630 var115 = var112.method88(class103.field1228, (byte) -128);
                if (var115 != null) {
                    var115.field9090 = var112;
                    var115.field9087 = var4;
                    var115.field9092 = var2;
                    var115.field9088 = var3;
                    class24.field266.method3293(var115, (byte) 80);
                }
            }
        }
        if (var4 < class637.field9161 - 1) {
            class99 var116 = class431.field6408[var4 + 1][var2][var3];
            if (var116 != null && var116.field1181) {
                class453.field6777.method742(var116, false);
            }
        }
        if (var2 < class550.field7844) {
            class99 var117 = var8[var2 + 1][var3];
            if (var117 != null && var117.field1181) {
                class453.field6777.method736(false, var117);
            }
        }
        if (var3 < class650.field9385) {
            class99 var118 = var8[var2][var3 + 1];
            if (var118 != null && var118.field1181) {
                class453.field6777.method736(false, var118);
            }
        }
        if (var2 > class550.field7844) {
            class99 var119 = var8[var2 - 1][var3];
            if (var119 != null && var119.field1181) {
                class453.field6777.method736(false, var119);
            }
        }
        if (var3 > class650.field9385) {
            class99 var120 = var8[var2][var3 - 1];
            if (var120 != null && var120.field1181) {
                class453.field6777.method736(false, var120);
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
    public static void method2717(int arg0) {
        if (arg0 <= 81) {
            method2715(null, true, -82);
        }
        field6449 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)V")
    public static final void method2718(boolean arg0, int arg1) {
        class277 var2 = class229.field3231;
        synchronized (class229.field3231) {
            class229.field3231.method1811((byte) -108, arg1);
            if (arg0) {
                field6449 = null;
            }
        }
        field6472++;
    }
}
