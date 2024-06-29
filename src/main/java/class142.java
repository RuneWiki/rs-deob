import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class142 extends class164 {

    @OriginalMember(owner = "client!hb", name = "F", descriptor = "I")
    public static int field2248 = 0;

    @OriginalMember(owner = "client!hb", name = "G", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!hb", name = "I", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!hb", name = "K", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!hb", name = "N", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!hb", name = "O", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!hb", name = "P", descriptor = "I")
    public int field2258;

    @OriginalMember(owner = "client!hb", name = "Q", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!hb", name = "H", descriptor = "Lwf;")
    public static class306 field2250;

    @OriginalMember(owner = "client!hb", name = "J", descriptor = "Lch;")
    public class33 field2252;

    @OriginalMember(owner = "client!hb", name = "L", descriptor = "[B")
    public byte[] field2254;

    @OriginalMember(owner = "client!hb", name = "M", descriptor = "[[I")
    public static int[][] field2255;

    @OriginalMember(owner = "client!hb", name = "d", descriptor = "(I)V", line = 4)
    public static final void method990(int arg0) {
        field2257++;
        class122.field1906++;
        if (arg0 != -1) {
            field2250 = (class306) null;
        }
    }

    @OriginalMember(owner = "client!hb", name = "e", descriptor = "(Z)I", line = 15)
    public final int method991(boolean arg0) {
        field2251++;
        if (this.field2528) {
            return 0;
        } else {
            if (!arg0) {
                this.method992(-24);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)[B", line = 43)
    public final byte[] method992(int arg0) {
        int var2 = -14 % ((arg0 + 48) / 45);
        field2259++;
        if (this.field2528) {
            throw new RuntimeException();
        }
        return this.field2254;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V", line = 59)
    public static final void method993(int arg0, byte arg1) {
        field2256++;
        int var2 = class175.field2678;
        if (arg0 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class82 var4;
            if (arg0 == 0) {
                var4 = class79.field1173;
            } else {
                var4 = class64.field966[class174.field2645[var3]];
            }
            if (var4 != null && var4.method281(0)) {
                int var5 = var4.method271((byte) 82);
                if (arg0 == 0 || arg0 == var5) {
                    if (var5 == 1) {
                        if ((var4.field537 & 0x7F) == 64 && (var4.field519 & 0x7F) == 64) {
                            int var12 = var4.field537 >> 7;
                            int var13 = var4.field519 >> 7;
                            if (var12 >= 0 && var12 < 104 && var13 >= 0 && var13 < 104) {
                                var10002 = class200.field3011[var12][var13]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field537 & 0x7F) == 0 && (var4.field519 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field537 & 0x7F) == 64 && (var4.field519 & 0x7F) == 64)) {
                        int var6 = var4.field537 - (var5 * 64) >> 7;
                        int var7 = var4.field519 - (var5 * 64) >> 7;
                        int var8 = var4.method271((byte) 71) + var6;
                        if (var6 < 0) {
                            var6 = 0;
                        }
                        if (var8 > 104) {
                            var8 = 104;
                        }
                        int var9 = var7 + var4.method271((byte) 59);
                        if (var9 > 104) {
                            var9 = 104;
                        }
                        if (var7 < 0) {
                            var7 = 0;
                        }
                        for (int var10 = var6; var10 < var8; var10++) {
                            for (int var11 = var7; var11 < var9; var11++) {
                                var10002 = class200.field3011[var10][var11]++;
                            }
                        }
                    }
                }
            }
        }
        int var14 = 94 % ((-arg1 - 29) / 52);
        label221: for (int var15 = 0; var15 < var2; var15++) {
            class82 var16;
            long var17;
            if (arg0 == 0) {
                var16 = class79.field1173;
                var17 = 8791798054912L;
            } else {
                var16 = class64.field966[class174.field2645[var15]];
                var17 = (long) class174.field2645[var15] << 32;
            }
            if (var16 != null && var16.method281(0)) {
                int var19 = var16.method271((byte) 73);
                if (arg0 == 0 || arg0 == var19) {
                    var16.field563 = true;
                    var16.field1221 = false;
                    if ((class188.field2856 && class175.field2678 > 200 || class175.field2678 > 50) && arg0 != 0 && var16.field474 == var16.method280(-76).field4876) {
                        var16.field1221 = true;
                    }
                    if (var19 == 1) {
                        if ((var16.field537 & 0x7F) == 64 && (var16.field519 & 0x7F) == 64) {
                            int var29 = var16.field537 >> 7;
                            int var30 = var16.field519 >> 7;
                            if (var29 < 0 || var29 >= 104 || var30 < 0 || var30 >= 104) {
                                continue;
                            }
                            if (class200.field3011[var29][var30] > 1) {
                                var10002 = class200.field3011[var29][var30]--;
                                continue;
                            }
                        }
                    } else if ((var19 & 0x1) == 0 && (var16.field537 & 0x7F) == 0 && (var16.field519 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field537 & 0x7F) == 64 && (var16.field519 & 0x7F) == 0) {
                        int var20 = var16.field537 - (var19 * 64) >> 7;
                        int var21 = var19 + var20;
                        if (var21 > 104) {
                            var21 = 104;
                        }
                        if (var20 < 0) {
                            var20 = 0;
                        }
                        int var22 = var16.field519 - (var19 * 64) >> 7;
                        int var23 = var19 + var22;
                        boolean var24 = true;
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        for (int var25 = var20; var25 < var21; var25++) {
                            for (int var26 = var22; var26 < var23; var26++) {
                                if (class200.field3011[var25][var26] <= 1) {
                                    var24 = false;
                                    break;
                                }
                            }
                        }
                        if (var24) {
                            int var27 = var20;
                            while (true) {
                                if (var27 >= var21) {
                                    continue label221;
                                }
                                for (int var28 = var22; var28 < var23; var28++) {
                                    var10002 = class200.field3011[var27][var28]--;
                                }
                                var27++;
                            }
                        }
                    }
                    if (var16.field463 == null || var16.field514 > class343.field5341 || var16.field532 <= class343.field5341) {
                        var16.field563 = false;
                        var16.field493 = class39.method286(class77.field1154, (byte) 82, var16.field537, var16.field519);
                        class226.method1543(class77.field1154, var16.field537, var16.field519, var16.field493, (var19 - 1) * 64 + 60, var16, var16.field564, var17, var16.field542);
                    } else {
                        var16.field1221 = false;
                        var16.field563 = false;
                        var16.field493 = class39.method286(class77.field1154, (byte) 82, var16.field537, var16.field519);
                        class93.method637(class77.field1154, var16.field537, var16.field519, var16.field493, var16, var16.field564, var17, var16.field566, var16.field488, var16.field511, var16.field552);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "([IIIIII)V", line = 323)
    public static final void method994(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class174 var6 = class90.field1375[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class212 var7 = var6.field2648;
        if (var7 != null) {
            int var8 = var7.field3360;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class62 var10 = var6.field2657;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field868;
        int var12 = var10.field867;
        int var13 = var10.field864;
        int var14 = var10.field866;
        int[] var15 = class4.field43[var11];
        int[] var16 = class22.field280[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V", line = 424)
    public static void method995(byte arg0) {
        field2255 = (int[][]) null;
        if (arg0 == -124) {
            field2250 = null;
        }
    }
}
