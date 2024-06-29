import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class222 extends class286 {

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    private int field3736 = 4096;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    private int field3739 = 409;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "[I")
    private int[] field3746 = new int[3];

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "I")
    private int field3747 = 4096;

    @OriginalMember(owner = "client!ne", name = "kb", descriptor = "I")
    private int field3748 = 4096;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field3735 = 0;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Lbe;")
    private static class283 field3741 = class153.method941(125, "M");

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field3731 = 0;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field3727 = 0;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "Lbe;")
    public static class283 field3745 = null;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lbe;")
    public static class283 field3738 = class153.method941(2, "Ablegen");

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Lbe;")
    public static class283 field3730 = field3741;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field3732 = 0;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "Lbe;")
    public static class283 field3734 = field3741;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field3740;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field3742;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "[I")
    public static int[] field3737;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI[[[Lrd;IIZ)Z", line = 8)
    public static final boolean method1455(boolean arg0, int arg1, class160[][][] arg2, int arg3, int arg4, boolean arg5) {
        field3728++;
        byte var6 = arg0 ? 1 : (byte) (class309.field5285 & 0xFF);
        if (class208.field3567[class61.field850][arg1][arg3] == var6) {
            return false;
        } else if ((class252.field4282[class61.field850][arg1][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class126.field2082[var7] = arg1;
            if (!arg5) {
                return true;
            }
            int var31 = var7 + 1;
            class298.field5046[var7] = arg3;
            int var8 = 0;
            class208.field3567[class61.field850][arg1][arg3] = var6;
            while (var31 != var8) {
                int var9 = (class126.field2082[var8] & 0xFF1AD8) >> 16;
                int var10 = class298.field5046[var8] & 0xFFFF;
                int var11 = class126.field2082[var8] & 0xFFFF;
                int var12 = class126.field2082[var8] >> 24 & 0xFF;
                int var13 = class298.field5046[var8] >> 16 & 0xFF;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class252.field4282[class61.field850][var11][var10] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label240: for (int var16 = class61.field850 + 1; var16 <= 3; var16++) {
                    if ((class252.field4282[var16][var11][var10] & 0x8) == 0) {
                        if (var14 && arg2[var16][var11][var10] != null) {
                            if (arg2[var16][var11][var10].field2632 != null) {
                                int var17 = class231.method1563(-126, var9);
                                if (arg2[var16][var11][var10].field2632.field3366 == var17 || arg2[var16][var11][var10].field2632.field3377 == var17) {
                                    continue;
                                }
                                if (var12 != 0) {
                                    int var18 = class231.method1563(37, var12);
                                    if (arg2[var16][var11][var10].field2632.field3366 == var18 || arg2[var16][var11][var10].field2632.field3377 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class231.method1563(74, var13);
                                    if (arg2[var16][var11][var10].field2632.field3366 == var19 || arg2[var16][var11][var10].field2632.field3377 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var11][var10].field2623 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var11][var10].field2627; var20++) {
                                    int var21 = (int) (arg2[var16][var11][var10].field2623[var20].field379 >> 14 & 0x3FL);
                                    int var22 = (int) (arg2[var16][var11][var10].field2623[var20].field379 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var9 == var23 || var12 != 0 && var12 == var23 || var13 != 0 && var13 == var23) {
                                        continue label240;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class160 var24 = arg2[var16][var11][var10];
                        if (var24 != null && var24.field2627 > 0) {
                            for (int var25 = 0; var25 < var24.field2627; var25++) {
                                class26 var26 = var24.field2623[var25];
                                if (var26.field398 != var26.field395 || var26.field394 != var26.field378) {
                                    for (int var27 = var26.field398; var27 <= var26.field395; var27++) {
                                        for (int var28 = var26.field394; var28 <= var26.field378; var28++) {
                                            class208.field3567[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class208.field3567[var16][var11][var10] = var6;
                    }
                }
                if (var15) {
                    if (class169.field2843[arg4] < class65.field890[class61.field850 + 1][var11][var10]) {
                        class169.field2843[arg4] = class65.field890[class61.field850 + 1][var11][var10];
                    }
                    int var29 = var11 << 7;
                    if (class2.field24[arg4] > var29) {
                        class2.field24[arg4] = var29;
                    } else if (class34.field517[arg4] < var29) {
                        class34.field517[arg4] = var29;
                    }
                    int var30 = var10 << 7;
                    if (var30 < class264.field4499[arg4]) {
                        class264.field4499[arg4] = var30;
                    } else if (var30 > class130.field2206[arg4]) {
                        class130.field2206[arg4] = var30;
                    }
                }
                if (!var14) {
                    if (var11 >= 1 && class208.field3567[class61.field850][var11 - 1][var10] != var6) {
                        class126.field2082[var31] = class53.method337(class53.method337(var11 - 1, 1179648), -754974720);
                        class298.field5046[var31] = class53.method337(1245184, var10);
                        class208.field3567[class61.field850][var11 - 1][var10] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var10++;
                    if (var10 < 104) {
                        if ((var11 - 1) >= 0 && class208.field3567[class61.field850][var11 - 1][var10] != var6 && (class252.field4282[class61.field850][var11][var10] & 0x4) == 0 && (class252.field4282[class61.field850][var11 - 1][var10 - 1] & 0x4) == 0) {
                            class126.field2082[var31] = class53.method337(class53.method337(1179648, var11 - 1), 1375731712);
                            class298.field5046[var31] = class53.method337(var10, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class208.field3567[class61.field850][var11 - 1][var10] = var6;
                        }
                        if (class208.field3567[class61.field850][var11][var10] != var6) {
                            class126.field2082[var31] = class53.method337(class53.method337(var11, 5373952), 318767104);
                            class298.field5046[var31] = class53.method337(5439488, var10);
                            class208.field3567[class61.field850][var11][var10] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class208.field3567[class61.field850][var11 + 1][var10] != var6 && (class252.field4282[class61.field850][var11][var10] & 0x4) == 0 && (class252.field4282[class61.field850][var11 + 1][var10 - 1] & 0x4) == 0) {
                            class126.field2082[var31] = class53.method337(class53.method337(5373952, var11 + 1), -1845493760);
                            class298.field5046[var31] = class53.method337(5439488, var10);
                            var31 = var31 + 1 & 0xFFF;
                            class208.field3567[class61.field850][var11 + 1][var10] = var6;
                        }
                    }
                    var10--;
                    if (var11 + 1 < 104 && class208.field3567[class61.field850][var11 + 1][var10] != var6) {
                        class126.field2082[var31] = class53.method337(class53.method337(9568256, var11 + 1), 1392508928);
                        class298.field5046[var31] = class53.method337(var10, 9633792);
                        class208.field3567[class61.field850][var11 + 1][var10] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var10--;
                    if (var10 >= 0) {
                        if (var11 - 1 >= 0 && class208.field3567[class61.field850][var11 - 1][var10] != var6 && (class252.field4282[class61.field850][var11][var10] & 0x4) == 0 && (class252.field4282[class61.field850][var11 - 1][var10 + 1] & 0x4) == 0) {
                            class126.field2082[var31] = class53.method337(class53.method337(var11 - 1, 13762560), 301989888);
                            class298.field5046[var31] = class53.method337(13828096, var10);
                            var31 = var31 + 1 & 0xFFF;
                            class208.field3567[class61.field850][var11 - 1][var10] = var6;
                        }
                        if (class208.field3567[class61.field850][var11][var10] != var6) {
                            class126.field2082[var31] = class53.method337(class53.method337(13762560, var11), -1828716544);
                            class298.field5046[var31] = class53.method337(var10, 13828096);
                            var31 = var31 + 1 & 0xFFF;
                            class208.field3567[class61.field850][var11][var10] = var6;
                        }
                        if (var11 + 1 < 104 && class208.field3567[class61.field850][var11 + 1][var10] != var6 && (class252.field4282[class61.field850][var11][var10] & 0x4) == 0 && (class252.field4282[class61.field850][var11 + 1][var10 + 1] & 0x4) == 0) {
                            class126.field2082[var31] = class53.method337(-771751936, class53.method337(var11 + 1, 9568256));
                            class298.field5046[var31] = class53.method337(9633792, var10);
                            var31 = var31 + 1 & 0xFFF;
                            class208.field3567[class61.field850][var11 + 1][var10] = var6;
                        }
                    }
                }
            }
            if (class169.field2843[arg4] != -1000000) {
                class169.field2843[arg4] += 10;
                class2.field24[arg4] -= 50;
                class34.field517[arg4] += 50;
                class130.field2206[arg4] += 50;
                class264.field4499[arg4] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I", line = 313)
    public final int[][] method16(int arg0, byte arg1) {
        field3740++;
        int[][] var3 = this.field4878.method938((byte) -6, arg0);
        if (arg1 != -19) {
            this.field3736 = 19;
        }
        if (this.field4878.field2524) {
            int[][] var4 = this.method1964(arg0, 0, false);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class27.field410; var11++) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3746[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (var13 <= this.field3739) {
                    int var14 = var6[var11];
                    int var15 = var14 - this.field3746[1];
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var15 > this.field3739) {
                        var10[var11] = var12;
                        var7[var11] = var14;
                        var8[var11] = var9[var11];
                    } else {
                        int var16 = var9[var11];
                        int var17 = var16 - this.field3746[2];
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field3739 >= var17) {
                            var10[var11] = this.field3748 * var12 >> 12;
                            var7[var11] = this.field3747 * var14 >> 12;
                            var8[var11] = this.field3736 * var16 >> 12;
                        } else {
                            var10[var11] = var12;
                            var7[var11] = var14;
                            var8[var11] = var16;
                        }
                    }
                } else {
                    var10[var11] = var12;
                    var7[var11] = var6[var11];
                    var8[var11] = var9[var11];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)V", line = 405)
    public static final void method1456(byte arg0) {
        field3725++;
        try {
            int var1 = -24 / ((arg0 + 45) / 62);
            if (class237.field3965 == 1) {
                int var2 = class254.field4298.method149((byte) 109);
                if (var2 > 0 && class254.field4298.method159((byte) 98)) {
                    int var3 = var2 - class107.field1818;
                    if (var3 < 0) {
                        var3 = 0;
                    }
                    class254.field4298.method153(false, var3);
                    return;
                }
                class254.field4298.method125((byte) -83);
                class254.field4298.method135((byte) 91);
                class246.field4175 = null;
                class44.field607 = null;
                if (class220.field3709 == null) {
                    class237.field3965 = 0;
                } else {
                    class237.field3965 = 2;
                }
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class254.field4298.method125((byte) -83);
            class220.field3709 = null;
            class44.field607 = null;
            class246.field4175 = null;
            class237.field3965 = 0;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V", line = 448)
    public static final void method1457(byte arg0) {
        field3742++;
        if (arg0 >= 125) {
            class261.field4431.method1636(112);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLfe;)V", line = 461)
    public static final void method1458(byte arg0, class229 arg1) {
        field3729++;
        int var2 = class307.field5266 >> 2 << 10;
        if (arg0 != -75) {
            field3741 = (class283) null;
        }
        int var3 = class113.field1905 >> 1;
        byte[][] var4 = new byte[class77.field1345][class134.field2254];
        while (arg1.field3879.length > arg1.field3905) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method1535((byte) 92) == 1) {
                var5 = true;
                var6 = arg1.method1535((byte) 78);
                var7 = arg1.method1535((byte) 118);
            }
            int var8 = arg1.method1535((byte) 120);
            int var9 = arg1.method1535((byte) 100);
            int var10 = class110.field1865 + class134.field2254 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class123.field2045;
            if (var11 >= 0 && (var10 - 63) >= 0 && class77.field1345 > (var11 + 63) && class134.field2254 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && (var6 * 8 + 8) > var12 && (var7 * 8) <= var14 && var14 < (var7 * 8 + 8)) {
                            var13[var10 - var14] = arg1.method1497(false);
                        }
                    }
                }
            } else if (var5) {
                arg1.field3905 += 64;
            } else {
                arg1.field3905 += 4096;
            }
        }
        int var15 = class77.field1345;
        int var16 = class134.field2254;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class196 var26 = class151.method931(77, var25 - 1);
                        var18[var23] += var26.field3349;
                        var19[var23] += var26.field3340;
                        var17[var23] += var26.field3350;
                        var20[var23] += var26.field3335;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class196 var29 = class151.method931(127, var28 - 1);
                        var18[var23] -= var29.field3349;
                        var19[var23] -= var29.field3340;
                        var17[var23] -= var29.field3350;
                        var20[var23] -= var29.field3335;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class38.field551[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var16 > var38) {
                        var35 += var21[var38];
                        var31 += var18[var38];
                        var32 += var19[var38];
                        var33 += var17[var38];
                        var34 += var20[var38];
                    }
                    if (var37 >= 0) {
                        var32 -= var19[var37];
                        var35 -= var21[var37];
                        var33 -= var17[var37];
                        var31 -= var18[var37];
                        var34 -= var20[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class14.method75(var33 / var35, 4626, var32 / var35, var31 * 256 / var34);
                        if (var4[var22][var36] != 0) {
                            int var41 = (var40 & 0x7F) + var3;
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[(class178.method1174(63, var36) << 6) + class178.method1174(var22, 63)] = class139.field2317[class64.method411(96, var42, (byte) 79)];
                        } else if (var39 != null) {
                            var39[class178.method1174(4032, var36 << 6) + class178.method1174(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 692)
    public class222() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lfe;ZI)V", line = 699)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field3733++;
        if (arg2 == 0) {
            this.field3739 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field3736 = arg0.method1496(true);
        } else if (arg2 == 2) {
            this.field3747 = arg0.method1496(true);
        } else if (arg2 == 3) {
            this.field3748 = arg0.method1496(!arg1);
        } else if (arg2 == 4) {
            int var5 = arg0.method1551(-118);
            this.field3746[1] = class178.method1174(65280, var5) >> 4;
            this.field3746[2] = class178.method1174(255, var5) >> 12;
            this.field3746[0] = class178.method1174(16711680, var5) << 4;
        }
        if (arg1) {
            this.method16(35, (byte) -86);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)V", line = 763)
    public static final void method1459(byte arg0, int arg1) {
        field3744++;
        if (arg0 == 34) {
            class297.field5036.method1637(true, arg1);
        }
    }

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "(I)V", line = 799)
    public static void method1460(int arg0) {
        if (arg0 != 6607) {
            field3735 = 53;
        }
        field3737 = null;
        field3741 = null;
        field3734 = null;
        field3745 = null;
        field3730 = null;
        field3738 = null;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V", line = 818)
    public static final void method1461(byte arg0) {
        int var1 = 39 % ((-arg0 - 8) / 48);
        field3743++;
        if (class163.field2688 == 248) {
            int var2 = class262.field4462.method1535((byte) 124);
            int var3 = var2 & 0x3;
            int var4 = var2 >> 2;
            int var5 = class177.field3040[var4];
            int var6 = class262.field4462.method1543(255);
            int var7 = ((var6 & 0x72) >> 4) + class89.field1513;
            int var8 = (var6 & 0x7) + class57.field774;
            if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                class141.method886(0, var5, (byte) 73, -1, class61.field850, var8, var7, var4, -1, var3);
            }
        } else if (class163.field2688 == 196) {
            int var9 = class262.field4462.method1545(-128);
            int var10 = var9 & 0x3;
            int var11 = var9 >> 2;
            int var12 = class177.field3040[var11];
            int var13 = class262.field4462.method1545(-128);
            int var14 = (var13 & 0x7) + class57.field774;
            int var15 = class89.field1513 + (var13 >> 4 & 0x7);
            int var16 = class262.field4462.method1537(2);
            if (var15 >= 0 && var14 >= 0 && var15 < 104 && var14 < 104) {
                class141.method886(0, var12, (byte) 67, var16, class61.field850, var14, var15, var11, -1, var10);
            }
        } else if (class163.field2688 == 89) {
            int var100 = class262.field4462.method1535((byte) 118);
            int var101 = var100 & 0x3;
            int var102 = var100 >> 2;
            int var103 = class177.field3040[var102];
            int var104 = class262.field4462.method1543(255);
            int var105 = class89.field1513 + (var104 >> 4 & 0x7);
            int var106 = (var104 & 0x7) + class57.field774;
            int var107 = class262.field4462.method1522((byte) 43);
            if (var107 == 65535) {
                var107 = -1;
            }
            class107.method709(var101, var107, var106, var102, class61.field850, var103, (byte) -127, var105);
        } else if (class163.field2688 == 175) {
            int var17 = class262.field4462.method1535((byte) 107);
            int var18 = class89.field1513 + (var17 >> 4 & 0x7);
            int var19 = (var17 & 0x7) + class57.field774;
            int var20 = class262.field4462.method1496(true);
            int var21 = class262.field4462.method1535((byte) 112);
            int var22 = class262.field4462.method1535((byte) 99);
            if (var20 == 65535) {
                var20 = -1;
            }
            int var23 = var21 & 0x7;
            int var24 = (var21 & 0xFE) >> 4;
            if (var18 >= 0 && var19 >= 0 && var18 < 104 && var19 < 104) {
                int var25 = var24 + 1;
                if ((var18 - var25) <= class213.field3624.field1178[0] && (var18 + var25) >= class213.field3624.field1178[0] && var19 - var25 <= class213.field3624.field1150[0] && (var19 + var25) >= class213.field3624.field1150[0] && class33.field500 != 0 && var23 > 0 && class127.field2103 < 50 && var20 != -1) {
                    class30.field460[class127.field2103] = var20;
                    class280.field4679[class127.field2103] = var23;
                    class225.field3788[class127.field2103] = var22;
                    class168.field2815[class127.field2103] = null;
                    class187.field3200[class127.field2103] = (var18 << 16) - (-(var19 << 8) - var24);
                    class127.field2103++;
                }
            }
        } else {
            if (class163.field2688 == 118) {
                class262.field4462.method1497(false);
                class262.field4462.method1527(0);
                class262.field4462.method1543(255);
                class262.field4462.method1541((byte) -128);
                class262.field4462.method1496(true);
                class262.field4462.method1545(-128);
                int var26 = class262.field4462.method1541((byte) -127);
                class262.field4462.method1555(true);
                class262.field4462.method1522((byte) 43);
                class262.field4462.method1538(-2);
                if (class213.field3622 == var26) {
                }
            }
            if (class163.field2688 == 106) {
                int var82 = class262.field4462.method1535((byte) 104);
                int var83 = class89.field1513 + (var82 >> 4 & 0x7);
                int var84 = (var82 & 0x7) + class57.field774;
                int var85 = var83 + class262.field4462.method1497(false);
                int var86 = var84 + class262.field4462.method1497(false);
                int var87 = class262.field4462.method1507(111);
                int var88 = class262.field4462.method1496(true);
                int var89 = class262.field4462.method1535((byte) 81) * 4;
                int var90 = class262.field4462.method1535((byte) 88) * 4;
                int var91 = class262.field4462.method1496(true);
                int var92 = class262.field4462.method1496(true);
                int var93 = class262.field4462.method1535((byte) 73);
                int var94 = class262.field4462.method1535((byte) 110);
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104 && var85 >= 0 && var86 >= 0 && var85 < 104 && var86 < 104 && var88 != 65535) {
                    int var95 = var84 * 128 + 64;
                    int var96 = var85 * 128 + 64;
                    int var97 = var86 * 128 + 64;
                    int var98 = var83 * 128 + 64;
                    class247 var99 = new class247(var88, class61.field850, var98, var95, class42.method254(class61.field850, var95, var98, -20341) - var89, class75.field1309 + var91, class75.field1309 + var92, var93, var94, var87, var90);
                    var99.method1683(var97, var96, class75.field1309 + var91, false, class42.method254(class61.field850, var97, var96, -20341) - var90);
                    class205.field3496.method1809(new class6(var99), (byte) -125);
                }
            } else if (class163.field2688 == 85) {
                int var27 = class262.field4462.method1496(true);
                int var28 = class262.field4462.method1545(-128);
                int var29 = class89.field1513 + ((var28 & 0x7B) >> 4);
                int var30 = (var28 & 0x7) + class57.field774;
                int var31 = class262.field4462.method1496(true);
                if (var29 >= 0 && var30 >= 0 && var29 < 104 && var30 < 104) {
                    class57 var32 = new class57();
                    var32.field784 = var31;
                    var32.field789 = var27;
                    if (class177.field3046[class61.field850][var29][var30] == null) {
                        class177.field3046[class61.field850][var29][var30] = new class269();
                    }
                    class177.field3046[class61.field850][var29][var30].method1809(new class215(var32), (byte) -125);
                    class172.method1091(var29, var30, 64);
                }
            } else if (class163.field2688 == 160) {
                int var64 = class262.field4462.method1535((byte) 113);
                int var65 = (var64 & 0xF) + class57.field774 * 2;
                int var66 = class89.field1513 * 2 + (var64 >> 4 & 0xF);
                int var67 = class262.field4462.method1497(false) + var66;
                int var68 = class262.field4462.method1497(false) + var65;
                int var69 = class262.field4462.method1507(105);
                int var70 = class262.field4462.method1496(true);
                int var71 = class262.field4462.method1535((byte) 100) * 4;
                int var72 = class262.field4462.method1535((byte) 126) * 4;
                int var73 = class262.field4462.method1496(true);
                int var74 = class262.field4462.method1496(true);
                int var75 = class262.field4462.method1535((byte) 109);
                int var76 = class262.field4462.method1535((byte) 123);
                if (var66 >= 0 && var65 >= 0 && var66 < 208 && var65 < 208 && var67 >= 0 && var68 >= 0 && var67 < 208 && var68 < 208 && var70 != 65535) {
                    int var77 = var68 * 64;
                    int var78 = var65 * 64;
                    int var79 = var67 * 64;
                    int var80 = var66 * 64;
                    class247 var81 = new class247(var70, class61.field850, var80, var78, class42.method254(class61.field850, var78, var80, -20341) - var71, class75.field1309 + var73, var74 + class75.field1309, var75, var76, var69, var72);
                    var81.method1683(var77, var79, class75.field1309 + var73, false, class42.method254(class61.field850, var77, var79, -20341) - var72);
                    class205.field3496.method1809(new class6(var81), (byte) -119);
                }
            } else if (class163.field2688 == 99) {
                int var58 = class262.field4462.method1545(-128);
                int var59 = (var58 >> 4 & 0x7) + class89.field1513;
                int var60 = (var58 & 0x7) + class57.field774;
                int var61 = class262.field4462.method1541((byte) -127);
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    class269 var62 = class177.field3046[class61.field850][var59][var60];
                    if (var62 != null) {
                        for (class215 var63 = (class215) var62.method1812((byte) -102); var63 != null; var63 = (class215) var62.method1813((byte) 72)) {
                            if ((var61 & 0x7FFF) == var63.field3641.field789) {
                                var63.method557((byte) -89);
                                break;
                            }
                        }
                        if (var62.method1812((byte) -97) == null) {
                            class177.field3046[class61.field850][var59][var60] = null;
                        }
                        class172.method1091(var59, var60, 64);
                    }
                }
            } else if (class163.field2688 == 252) {
                int var33 = class262.field4462.method1535((byte) 98);
                int var34 = class57.field774 + (var33 & 0x7);
                int var35 = ((var33 & 0x70) >> 4) + class89.field1513;
                int var36 = class262.field4462.method1496(true);
                int var37 = class262.field4462.method1496(true);
                int var38 = class262.field4462.method1496(true);
                if (var35 >= 0 && var34 >= 0 && var35 < 104 && var34 < 104) {
                    class269 var39 = class177.field3046[class61.field850][var35][var34];
                    if (var39 != null) {
                        for (class215 var40 = (class215) var39.method1812((byte) -114); var40 != null; var40 = (class215) var39.method1813((byte) 79)) {
                            class57 var41 = var40.field3641;
                            if ((var36 & 0x7FFF) == var41.field789 && var41.field784 == var37) {
                                var41.field784 = var38;
                                break;
                            }
                        }
                        class172.method1091(var35, var34, 64);
                    }
                }
            } else if (class163.field2688 == 60) {
                int var49 = class262.field4462.method1535((byte) 85);
                int var50 = (var49 >> 4 & 0x7) + class89.field1513;
                int var51 = (var49 & 0x7) + class57.field774;
                int var52 = class262.field4462.method1496(true);
                int var53 = class262.field4462.method1535((byte) 83);
                int var54 = class262.field4462.method1496(true);
                if (var50 >= 0 && var51 >= 0 && var50 < 104 && var51 < 104) {
                    int var55 = var50 * 128 + 64;
                    int var56 = var51 * 128 + 64;
                    class301 var57 = new class301(var52, class61.field850, var55, var56, class42.method254(class61.field850, var56, var55, -20341) - var53, var54, class75.field1309);
                    class259.field4412.method1809(new class296(var57), (byte) -122);
                }
            } else if (class163.field2688 == 30) {
                int var42 = class262.field4462.method1537(2);
                int var43 = class262.field4462.method1496(true);
                int var44 = class262.field4462.method1522((byte) 43);
                int var45 = class262.field4462.method1545(-128);
                int var46 = class57.field774 + (var45 & 0x7);
                int var47 = class89.field1513 + ((var45 & 0x72) >> 4);
                if (var47 >= 0 && var46 >= 0 && var47 < 104 && var46 < 104 && class213.field3622 != var44) {
                    class57 var48 = new class57();
                    var48.field789 = var42;
                    var48.field784 = var43;
                    if (class177.field3046[class61.field850][var47][var46] == null) {
                        class177.field3046[class61.field850][var47][var46] = new class269();
                    }
                    class177.field3046[class61.field850][var47][var46].method1809(new class215(var48), (byte) -125);
                    class172.method1091(var47, var46, 64);
                }
            }
        }
    }
}
