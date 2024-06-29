import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class81 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "Lta;")
    public static class197 field1127 = new class197(30);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "[J")
    public static long[] field1135 = new long[256];

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "Z")
    public static boolean field1136;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[B")
    public static byte[] field1133;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "[I")
    public static int[] field1131;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)I", line = 16)
    public static final int method632(int arg0, int arg1, int arg2) {
        field1134++;
        class278 var3 = (class278) class171.field2547.method203(1710, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg0 >= arg2 && var3.field4272.length > arg0) {
            return var3.field4272[arg0];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(III)V", line = 34)
    public static final void method633(int arg0, int arg1, int arg2) {
        if (arg2 != 18) {
            return;
        }
        if (class190.field3020 > 0) {
            class236.method1654(class190.field3020, -67);
            class190.field3020 = 0;
        }
        short var3 = 256;
        field1128++;
        int var4 = 0;
        int var5 = class168.field2527 * arg1;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class137.field2140[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class168.field2525[arg0 + var5++];
                int var11 = class329.field5088[var4++];
                if (var11 == 0) {
                    class290.field4567.field2101[var6++] = var10;
                } else {
                    int var12 = 238 - var11;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = var11 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var14 = class29.field340[var11];
                    class290.field4567.field2101[var6++] = class142.method1078(-16711936, class142.method1078(var14, 16711935) * var13 + (class142.method1078(16711935, var10) * var12)) + class142.method1078(16711680, class142.method1078(var10, 65280) * var12 + class142.method1078(var14, 65280) * var13) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class290.field4567.field2101[var6++] = class168.field2525[arg0 + var5++];
            }
            var5 += class168.field2527 - 128;
        }
        if (class36.field534) {
            class194.method1415(class290.field4567.field2101, arg0, arg1, class290.field4567.field312, class290.field4567.field315);
        } else {
            class290.field4567.method189(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 123)
    public static void method634(int arg0) {
        field1131 = null;
        field1135 = null;
        field1127 = null;
        field1133 = null;
        if (arg0 != 8) {
            method635(false, false);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZZ)V", line = 140)
    public static final void method635(boolean arg0, boolean arg1) {
        class235.field3596 = arg0;
        field1126++;
        if (class235.field3596) {
            int var2 = class88.field1293.method286(-866);
            int var3 = class88.field1293.method245(-14);
            int var4 = class88.field1293.method245(-124);
            int var5 = class88.field1293.method300(-1394191632);
            int var6 = class88.field1293.method300(-1394191632);
            class88.field1293.method69((byte) 21);
            for (int var7 = 0; var7 < 4; var7++) {
                for (int var8 = 0; var8 < 13; var8++) {
                    for (int var9 = 0; var9 < 13; var9++) {
                        int var10 = class88.field1293.method63(121, 1);
                        if (var10 == 1) {
                            class176.field2636[var7][var8][var9] = class88.field1293.method63(116, 26);
                        } else {
                            class176.field2636[var7][var8][var9] = -1;
                        }
                    }
                }
            }
            class88.field1293.method64(-128);
            int var11 = (class79.field1112 - class88.field1293.field455) / 16;
            class53.field809 = new int[var11][4];
            for (int var12 = 0; var12 < var11; var12++) {
                for (int var13 = 0; var13 < 4; var13++) {
                    class53.field809[var12][var13] = class88.field1293.method299(-112);
                }
            }
            class60.field892 = new byte[var11][];
            class255.field3808 = new int[var11];
            class154.field2326 = null;
            class99.field1470 = new byte[var11][];
            class324.field5049 = new int[var11];
            class210.field3302 = new int[var11];
            class150.field2276 = new int[var11];
            class95.field1367 = new byte[var11][];
            class86.field1259 = new byte[var11][];
            class180.field2710 = new int[var11];
            class22.field239 = (byte[][]) null;
            int var14 = 0;
            for (int var15 = 0; var15 < 4; var15++) {
                for (int var16 = 0; var16 < 13; var16++) {
                    for (int var17 = 0; var17 < 13; var17++) {
                        int var18 = class176.field2636[var15][var16][var17];
                        if (var18 != -1) {
                            int var19 = var18 >> 3 & 0x7FF;
                            int var20 = var18 >> 14 & 0x3FF;
                            int var21 = (var20 / 8 << 8) + var19 / 8;
                            for (int var22 = 0; var22 < var14; var22++) {
                                if (class324.field5049[var22] == var21) {
                                    var21 = -1;
                                    break;
                                }
                            }
                            if (var21 != -1) {
                                int var23 = var21 & 0xFF;
                                int var24 = var21 >> 8 & 0xFF;
                                class324.field5049[var14] = var21;
                                class180.field2710[var14] = class246.field3710.method1519((byte) 16, "m" + var24 + "_" + var23);
                                class150.field2276[var14] = class246.field3710.method1519((byte) 16, "l" + var24 + "_" + var23);
                                class255.field3808[var14] = class246.field3710.method1519((byte) 16, "um" + var24 + "_" + var23);
                                class210.field3302[var14] = class246.field3710.method1519((byte) 16, "ul" + var24 + "_" + var23);
                                var14++;
                            }
                        }
                    }
                }
            }
            class55.method485((byte) -90, false, var2, var3, var6, var5, var4);
        } else {
            int var25 = class88.field1293.method252((byte) 117);
            int var26 = class88.field1293.method300(-1394191632);
            int var27 = class88.field1293.method240((byte) -123);
            int var28 = class88.field1293.method252((byte) 115);
            int var29 = (class79.field1112 - class88.field1293.field455) / 16;
            class53.field809 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var31 = 0; var31 < 4; var31++) {
                    class53.field809[var30][var31] = class88.field1293.method288(-119);
                }
            }
            int var32 = class88.field1293.method258(437);
            class255.field3808 = new int[var29];
            class60.field892 = new byte[var29][];
            class99.field1470 = new byte[var29][];
            class154.field2326 = null;
            class210.field3302 = new int[var29];
            class22.field239 = (byte[][]) null;
            class324.field5049 = new int[var29];
            class86.field1259 = new byte[var29][];
            class95.field1367 = new byte[var29][];
            boolean var33 = false;
            class180.field2710 = new int[var29];
            if ((var32 / 8 == 48 || var32 / 8 == 49) && var25 / 8 == 48) {
                var33 = true;
            }
            if (var32 / 8 == 48 && var25 / 8 == 148) {
                var33 = true;
            }
            class150.field2276 = new int[var29];
            int var34 = 0;
            for (int var35 = (var32 - 6) / 8; var35 <= (var32 + 6) / 8; var35++) {
                for (int var36 = (var25 - 6) / 8; var36 <= (var25 + 6) / 8; var36++) {
                    int var37 = (var35 << 8) + var36;
                    if (var33 && var36 == 49 || var36 == 149 || var36 == 147 || var35 == 50 || !(var35 != 49 || var36 != 47)) {
                        class324.field5049[var34] = var37;
                        class180.field2710[var34] = -1;
                        class150.field2276[var34] = -1;
                        class255.field3808[var34] = -1;
                        class210.field3302[var34] = -1;
                    } else {
                        class324.field5049[var34] = var37;
                        class180.field2710[var34] = class246.field3710.method1519((byte) 16, "m" + var35 + "_" + var36);
                        class150.field2276[var34] = class246.field3710.method1519((byte) 16, "l" + var35 + "_" + var36);
                        class255.field3808[var34] = class246.field3710.method1519((byte) 16, "um" + var35 + "_" + var36);
                        class210.field3302[var34] = class246.field3710.method1519((byte) 16, "ul" + var35 + "_" + var36);
                    }
                    var34++;
                }
            }
            class55.method485((byte) -90, false, var27, var32, var28, var26, var25);
        }
        if (!arg1) {
            field1136 = false;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIILek;ILsd;)V", line = 385)
    public static final void method636(int arg0, int arg1, int arg2, int arg3, class184 arg4, int arg5, class27 arg6) {
        field1132++;
        if (arg6 == null) {
            return;
        }
        int var7 = arg1 * arg1 + arg5 * arg5;
        int var8 = class99.field1459 + class136.field2125 & 0x7FF;
        int var9 = Math.max(arg4.field2890 / 2, arg4.field2904 / 2) + 10;
        if (var7 > var9 * var9) {
            return;
        }
        int var10 = class56.field838[var8];
        int var11 = var10 * 256 / (class317.field4929 + 256);
        if (arg2 != -2067) {
            method634(47);
        }
        int var12 = class56.field830[var8];
        int var13 = var12 * 256 / (class317.field4929 + 256);
        int var14 = arg5 * var13 - (arg1 * var11) >> 16;
        int var15 = arg1 * var13 + arg5 * var11 >> 16;
        if (class36.field534) {
            ((class221) arg6).method1578(arg4.field2890 / 2 + var15 + arg0 - (arg6.field311 / 2), arg4.field2904 / 2 + arg3 - (var14 - -(arg6.field316 / 2)), (class221) arg4.method1342(arg2 ^ 0xFFFFF7EC, false));
        } else {
            ((class134) arg6).method1027(arg4.field2890 / 2 + arg0 + var15 - (arg6.field311 / 2), -var14 - arg6.field316 / 2 + (arg3 - -(arg4.field2904 / 2)), arg4.field2929, arg4.field2836);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIB)V", line = 424)
    public static final void method637(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1130++;
        class159.field2372.field455 = 0;
        class159.field2372.method262((byte) 81, 20);
        class159.field2372.method262((byte) 81, arg1);
        class159.field2372.method262((byte) 81, arg0);
        class159.field2372.method263(arg3, (byte) 98);
        class159.field2372.method263(arg2, (byte) 108);
        class324.field5044 = 0;
        if (arg4 >= -28) {
            field1127 = (class197) null;
        }
        class179.field2685 = -3;
        class4.field26 = 0;
        class204.field3240 = 1;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field1135[var0] = var1;
        }
        field1136 = false;
        field1137 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([IIII[Ljava/lang/Object;)V", line = 448)
    public static final void method638(int[] arg0, int arg1, int arg2, int arg3, Object[] arg4) {
        if (arg2 < arg1) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            Object var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (arg0[var9] < ((var9 & 0x1) + var7)) {
                    int var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    Object var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method638(arg0, var6 - 1, arg2, arg3 ^ 0x0, arg4);
            method638(arg0, arg1, var6 + 1, 8, arg4);
        }
        if (arg3 != 8) {
            method632(-105, -100, -53);
        }
        field1129++;
    }
}
