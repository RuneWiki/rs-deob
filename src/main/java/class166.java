import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class166 extends class182 {

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    public static int field2997 = 0;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field3005 = 0;

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "Z")
    public static boolean field3002 = true;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field3003 = -1;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field2999 = 0;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "B")
    public byte field2993;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public int field3004;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "Lvb;")
    public class232 field3001;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "Lah;")
    public static class9 field2994;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
    public static void method1174(int arg0) {
        if (arg0 != 23723) {
            field2999 = -80;
        }
        field2994 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BZI[BI[Lab;)V")
    public static final void method1175(byte arg0, boolean arg1, int arg2, byte[] arg3, int arg4, class3[] arg5) {
        class145 var6 = new class145(arg3);
        if (arg0 != 114) {
            method1178(20, null, null, 59);
        }
        int var7 = -1;
        field3006++;
        while (true) {
            int var8 = var6.method999((byte) -82);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method1003(-63);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 >> 6 & 0x3F;
                int var12 = var9 & 0x3F;
                int var13 = var6.method998(90);
                int var14 = arg2 + var12;
                int var15 = var11 + arg4;
                int var16 = var9 >> 12;
                int var17 = var13 & 0x3;
                int var18 = var13 >> 2;
                if (var15 > 0 && var14 > 0 && var15 < 103 && var14 < 103) {
                    class3 var19 = null;
                    if (!arg1) {
                        int var20 = var16;
                        if ((class233.field4200[1][var15][var14] & 0x2) == 2) {
                            var20 = var16 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg5[var20];
                        }
                    }
                    class54.method417(var19, arg0 - 27235, var16, var18, class167.field3021, var16, var15, arg1, var7, !arg1, var17, var14);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(I)V")
    public static final void method1176(int arg0) {
        if (arg0 != 28415) {
            return;
        }
        field2995++;
        try {
            if (class209.field3751 == 1) {
                int var1 = class39.field897.method1539((byte) -19);
                if (var1 > 0 && class39.field897.method1551(false)) {
                    int var2 = var1 - class39.field905;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class39.field897.method1567(var2, arg0 - 15320);
                } else {
                    class39.field897.method1545((byte) -75);
                    class39.field897.method1562((byte) -123);
                    class230.field4143 = null;
                    class12.field385 = null;
                    if (class213.field3879 == null) {
                        class209.field3751 = 0;
                    } else {
                        class209.field3751 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class39.field897.method1545((byte) 49);
            class12.field385 = null;
            class209.field3751 = 0;
            class230.field4143 = null;
            class213.field3879 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "([BI)V")
    public static final void method1177(byte[] arg0, int arg1) {
        field2996++;
        byte[][] var2 = new byte[class237.field4284][class33.field773];
        int var3 = 0;
        int var4 = class160.field2929 >> 2 << 10;
        int var5 = class21.field567 >> 1;
        while (true) {
            while (arg0.length > var3) {
                int var34 = (arg0[var3++] & 0xFF) * 64 - class80.field1501;
                int var35 = (arg0[var3++] & 0xFF) * 64 - class173.field3116;
                if (var34 > 0 && var35 > 0 && var34 + 64 < class237.field4284 && class33.field773 > var35 + 64) {
                    for (int var36 = 0; var36 < 64; var36++) {
                        byte[] var37 = var2[var36 + var34];
                        int var38 = class33.field773 - var35 - 1;
                        for (int var39 = -64; var39 < 0; var39++) {
                            var37[var38--] = arg0[var3++];
                        }
                    }
                } else {
                    var3 += 4096;
                }
            }
            int var6 = class237.field4284;
            int var7 = class33.field773;
            int[] var8 = new int[var7];
            if (arg1 != 2) {
                field2994 = null;
            }
            int[] var9 = new int[var7];
            int[] var10 = new int[var7];
            int[] var11 = new int[var7];
            int[] var12 = new int[var7];
            for (int var13 = -5; var13 < var6; var13++) {
                for (int var14 = 0; var14 < var7; var14++) {
                    int var28 = var13 + 5;
                    int var10002;
                    if (var6 > var28) {
                        int var29 = var2[var28][var14] & 0xFF;
                        if (var29 > 0) {
                            class215 var30 = class194.method1294((byte) -104, var29 - 1);
                            var8[var14] += var30.field3911;
                            var9[var14] += var30.field3915;
                            var11[var14] += var30.field3912;
                            var10[var14] += var30.field3909;
                            var10002 = var12[var14]++;
                        }
                    }
                    int var31 = var13 - 5;
                    if (var31 >= 0) {
                        int var32 = var2[var31][var14] & 0xFF;
                        if (var32 > 0) {
                            class215 var33 = class194.method1294((byte) -120, var32 - 1);
                            var8[var14] -= var33.field3911;
                            var9[var14] -= var33.field3915;
                            var11[var14] -= var33.field3912;
                            var10[var14] -= var33.field3909;
                            var10002 = var12[var14]--;
                        }
                    }
                }
                if (var13 >= 0) {
                    int[][] var15 = class175.field3166[var13 >> 6];
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < var7; var21++) {
                        int var22 = var21 + 5;
                        int var23 = var21 - 5;
                        if (var22 < var7) {
                            var20 += var10[var22];
                            var18 += var11[var22];
                            var17 += var8[var22];
                            var19 += var12[var22];
                            var16 += var9[var22];
                        }
                        if (var23 >= 0) {
                            var20 -= var10[var23];
                            var19 -= var12[var23];
                            var18 -= var11[var23];
                            var17 -= var8[var23];
                            var16 -= var9[var23];
                        }
                        if (var21 >= 0 && var19 > 0) {
                            int var24 = var21 >> 6;
                            int var25 = var20 == 0 ? 0 : class128.method877(arg1 - 85, var16 / var19, var17 * 256 / var20, var18 / var19);
                            if (var2[var13][var21] != 0) {
                                if (var15[var24] == null) {
                                    var15[var24] = class175.field3166[var13 >> 6][var24] = new int[4096];
                                }
                                int var26 = (var25 & 0x7F) + var5;
                                if (var26 < 0) {
                                    var26 = 0;
                                } else if (var26 > 127) {
                                    var26 = 127;
                                }
                                int var27 = (var4 + var25 & 0xFC00) + (var25 & 0x380) + var26;
                                var15[var24][class209.method1370(63, var13) + (class209.method1370(63, var21) << 6)] = class89.field1654[class207.method1366(var27, -125, 96)];
                            } else if (var15[var24] != null) {
                                var15[var24][class209.method1370(var13, 63) + (class209.method1370(var21, 63) << 6)] = 0;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILmc;Lnc;I)V")
    public static final void method1178(int arg0, class134 arg1, class145 arg2, int arg3) {
        if (arg0 != -25576) {
            return;
        }
        field3000++;
        class150 var4 = new class150();
        var4.field2724 = arg2.method998(95);
        var4.field2725 = arg2.method1018(-1068451600);
        var4.field2723 = new int[var4.field2724];
        var4.field2737 = new int[var4.field2724];
        var4.field2728 = new int[var4.field2724];
        var4.field2722 = new class65[var4.field2724];
        var4.field2735 = new byte[var4.field2724][][];
        var4.field2729 = new class65[var4.field2724];
        for (int var5 = 0; var5 < var4.field2724; var5++) {
            try {
                int var6 = arg2.method998(114);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg2.method1038(99).method815((byte) 80));
                    String var18 = new String(arg2.method1038(67).method815((byte) 127));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg2.method1018(arg0 ^ 0x3FAF24E8);
                    }
                    var4.field2723[var5] = var6;
                    var4.field2737[var5] = var19;
                    var4.field2729[var5] = arg1.method891(class180.method1244((byte) 95, var17), var18, (byte) -105);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg2.method1038(41).method815((byte) 116));
                    String var8 = new String(arg2.method1038(arg0 + 25617).method815((byte) 78));
                    int var9 = arg2.method998(69);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg2.method1038(64).method815((byte) 78));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg2.method1018(-1068451600);
                            var12[var13] = new byte[var14];
                            arg2.method1022(-15020, var14, 0, var12[var13]);
                        }
                    }
                    var4.field2723[var5] = var6;
                    Class[] var15 = new Class[var9];
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class180.method1244((byte) 117, var10[var16]);
                    }
                    var4.field2722[var5] = arg1.method895(var15, class180.method1244((byte) 115, var7), (byte) -126, var8);
                    var4.field2735[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field2728[var5] = -1;
            } catch (SecurityException var21) {
                var4.field2728[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field2728[var5] = -3;
            } catch (Exception var23) {
                var4.field2728[var5] = -4;
            } catch (Throwable var24) {
                var4.field2728[var5] = -5;
            }
        }
        class14.field435.method325(109, var4);
    }

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        if (class53.field1090[98]) {
            class161.field2952 += (12 - class161.field2952) / 2;
        } else if (class53.field1090[99]) {
            class161.field2952 += (-class161.field2952 - 12) / 2;
        } else {
            class161.field2952 /= 2;
        }
        if (arg0 != -4) {
            return;
        }
        class139.field2532 += class161.field2952 / 2;
        if (class53.field1090[96]) {
            class123.field2303 += (-class123.field2303 - 24) / 2;
        } else if (class53.field1090[97]) {
            class123.field2303 += (24 - class123.field2303) / 2;
        } else {
            class123.field2303 /= 2;
        }
        client.field776 += class123.field2303 / 2;
        field2998++;
        int var1 = class92.field1691 + class93.field1712.field4244;
        int var2 = class93.field1712.field4221 + class215.field3896;
        if (class48.field1010 - var1 < -500 || class48.field1010 - var1 > 500 || class246.field4536 - var2 < -500 || class246.field4536 - var2 > 500) {
            class48.field1010 = var1;
            class246.field4536 = var2;
        }
        if (class48.field1010 != var1) {
            class48.field1010 += (var1 - class48.field1010) / 16;
        }
        if (class246.field4536 != var2) {
            class246.field4536 += (var2 - class246.field4536) / 16;
        }
        class104.method699(arg0 ^ 0xFFFF00FC);
    }
}
