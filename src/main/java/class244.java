import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class244 {

    @OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
    public static int[] field3956 = new int[4096];

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
    public static boolean field3964;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lph;")
    public static class80 field3958;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
    public static void method1739(boolean arg0) {
        if (!arg0) {
            field3956 = null;
        }
        field3958 = null;
        field3956 = null;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(Z)Lvj;")
    public static final class117 method1740(boolean arg0) {
        field3959++;
        try {
            return arg0 ? null : (class117) Class.forName("wf").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)I")
    public static final int method1741(int arg0) {
        field3963++;
        if (arg0 != -21400) {
            field3956 = null;
        }
        if (class63.field940 == null) {
            return -1;
        }
        while (class63.field940.field1150 > class190.field3067) {
            if (class63.field940.method583(126, class190.field3067)) {
                return class190.field3067++;
            }
            class190.field3067++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZZ)V")
    public static final void method1742(boolean arg0, boolean arg1) {
        class100.field1467 = arg1;
        field3957++;
        if (class100.field1467) {
            int var16 = class50.field732.method1085(-124);
            int var17 = class50.field732.method1126(false);
            class50.field732.method563(-108);
            for (int var18 = 0; var18 < 4; var18++) {
                for (int var37 = 0; var37 < 13; var37++) {
                    for (int var38 = 0; var38 < 13; var38++) {
                        int var39 = class50.field732.method554(1, -63);
                        if (var39 == 1) {
                            class121.field1771[var18][var37][var38] = class50.field732.method554(26, -54);
                        } else {
                            class121.field1771[var18][var37][var38] = -1;
                        }
                    }
                }
            }
            class50.field732.method560(false);
            int var19 = (class221.field3534 - class50.field732.field2511) / 16;
            class218.field3483 = new int[var19][4];
            for (int var20 = 0; var20 < var19; var20++) {
                for (int var36 = 0; var36 < 4; var36++) {
                    class218.field3483[var20][var36] = class50.field732.method1079(16711680);
                }
            }
            int var21 = class50.field732.method1071((byte) 118);
            boolean var22 = class85.method615(28962, class50.field732.method1085(-69));
            int var23 = class50.field732.method1126(false);
            int var24 = class50.field732.method1071((byte) 9);
            class118.field1706 = new int[var19];
            class195.field3167 = new int[var19];
            class206.field3311 = new byte[var19][];
            class200.field3214 = null;
            class67.field980 = new int[var19];
            class283.field4500 = new byte[var19][];
            class85.field1233 = null;
            class286.field4548 = new int[var19];
            class16.field183 = new int[var19];
            int var25 = 0;
            for (int var26 = 0; var26 < 4; var26++) {
                for (int var27 = 0; var27 < 13; var27++) {
                    for (int var28 = 0; var28 < 13; var28++) {
                        int var29 = class121.field1771[var26][var27][var28];
                        if (var29 != -1) {
                            int var30 = var29 >> 14 & 0x3FF;
                            int var31 = var29 >> 3 & 0x7FF;
                            int var32 = (var30 / 8 << 8) + var31 / 8;
                            for (int var33 = 0; var33 < var25; var33++) {
                                if (class286.field4548[var33] == var32) {
                                    var32 = -1;
                                    break;
                                }
                            }
                            if (var32 != -1) {
                                class286.field4548[var25] = var32;
                                int var34 = var32 >> 8 & 0xFF;
                                int var35 = var32 & 0xFF;
                                class16.field183[var25] = class159.field2599.method619(-1, "m" + var34 + "_" + var35);
                                class195.field3167[var25] = class159.field2599.method619(-1, "l" + var34 + "_" + var35);
                                class67.field980[var25] = class159.field2599.method619(-1, "um" + var34 + "_" + var35);
                                class118.field1706[var25] = class159.field2599.method619(-1, "ul" + var34 + "_" + var35);
                                var25++;
                            }
                        }
                    }
                }
            }
            class189.method1409(var21, var22, false, var17, var24, var16, (byte) -25, var23);
        } else {
            int var2 = class50.field732.method1085(-89);
            int var3 = class50.field732.method1113(19226);
            int var4 = (class221.field3534 - class50.field732.field2511) / 16;
            class218.field3483 = new int[var4][4];
            for (int var5 = 0; var5 < var4; var5++) {
                for (int var15 = 0; var15 < 4; var15++) {
                    class218.field3483[var5][var15] = class50.field732.method1132(-15432);
                }
            }
            int var6 = class50.field732.method1126(!arg0);
            boolean var7 = false;
            int var8 = class50.field732.method1113(19226);
            boolean var9 = class85.method615(28962, class50.field732.method1111(255));
            int var10 = class50.field732.method1072(-107);
            class283.field4500 = new byte[var4][];
            class85.field1233 = null;
            class200.field3214 = null;
            class67.field980 = new int[var4];
            class16.field183 = new int[var4];
            class195.field3167 = new int[var4];
            class118.field1706 = new int[var4];
            if ((var6 / 8 == 48 || var6 / 8 == 49) && (var10 / 8) == 48) {
                var7 = true;
            }
            class286.field4548 = new int[var4];
            class206.field3311 = new byte[var4][];
            int var11 = 0;
            if (var6 / 8 == 48 && (var10 / 8) == 148) {
                var7 = true;
            }
            for (int var12 = (var6 - 6) / 8; var12 <= ((var6 + 6) / 8); var12++) {
                for (int var13 = (var10 - 6) / 8; var13 <= ((var10 + 6) / 8); var13++) {
                    int var14 = (var12 << 8) + var13;
                    if (var7 && var13 == 49 || var13 == 149 || var13 == 147 || var12 == 50 || !(var12 != 49 || var13 != 47)) {
                        class286.field4548[var11] = var14;
                        class16.field183[var11] = -1;
                        class195.field3167[var11] = -1;
                        class67.field980[var11] = -1;
                        class118.field1706[var11] = -1;
                    } else {
                        class286.field4548[var11] = var14;
                        class16.field183[var11] = class159.field2599.method619(-1, "m" + var12 + "_" + var13);
                        class195.field3167[var11] = class159.field2599.method619(-1, "l" + var12 + "_" + var13);
                        class67.field980[var11] = class159.field2599.method619(-1, "um" + var12 + "_" + var13);
                        class118.field1706[var11] = class159.field2599.method619(-1, "ul" + var12 + "_" + var13);
                    }
                    var11++;
                }
            }
            class189.method1409(var3, var9, false, var10, var6, var2, (byte) -25, var8);
        }
        if (!arg0) {
            field3960 = 121;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIII)V")
    public static final void method1743(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field3965++;
        class83 var5 = (class83) class67.field991.method1034((long) arg1, (byte) 21);
        if (arg0 != -124) {
            field3956 = null;
        }
        if (var5 == null) {
            var5 = new class83();
            class67.field991.method1032(false, var5, (long) arg1);
        }
        if (arg4 >= var5.field1206.length) {
            int[] var6 = new int[arg4 + 1];
            int[] var7 = new int[arg4 + 1];
            for (int var8 = 0; var8 < var5.field1206.length; var8++) {
                var6[var8] = var5.field1206[var8];
                var7[var8] = var5.field1197[var8];
            }
            for (int var9 = var5.field1206.length; var9 < arg4; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1206 = var6;
            var5.field1197 = var7;
        }
        var5.field1206[arg4] = arg2;
        var5.field1197[arg4] = arg3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIBI)V")
    public static final void method1744(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field3961++;
        class177.method1330(class240.field3831[arg4], arg0 - arg1, arg2, 32232, arg0 + arg1);
        int var5 = arg1;
        int var6 = -arg1;
        int var7 = -1;
        int var8 = 0;
        while (var8 < var5) {
            var7 += 2;
            var8++;
            var6 += var7;
            if (var6 >= 0) {
                var5--;
                var6 -= var5 << 1;
                int[] var9 = class240.field3831[arg4 + var5];
                int var10 = arg0 + var8;
                int[] var11 = class240.field3831[arg4 - var5];
                int var12 = arg0 - var8;
                class177.method1330(var9, var12, arg2, arg3 ^ 0xFFFF820C, var10);
                class177.method1330(var11, var12, arg2, 32232, var10);
            }
            int var13 = arg0 + var5;
            int var14 = arg0 - var5;
            int[] var15 = class240.field3831[arg4 + var8];
            int[] var16 = class240.field3831[arg4 - var8];
            class177.method1330(var15, var14, arg2, arg3 + 32260, var13);
            class177.method1330(var16, var14, arg2, 32232, var13);
        }
        if (arg3 != -28) {
            field3956 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ls;IIII)V")
    public static final void method1745(class245 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3955++;
        if (class243.field3890 >= 400) {
            return;
        }
        if (arg0.field3972 != null) {
            arg0 = arg0.method1758(true);
        }
        if (arg1 != 30) {
            field3956 = null;
        }
        if (arg0 == null || !arg0.field4026) {
            return;
        }
        String var5 = arg0.field4005;
        if (arg0.field3985 != 0) {
            String var6 = class175.field2850 == 1 ? class109.field1574 : class171.field2764;
            var5 = var5 + class239.method1673(-23253, arg0.field3985, class186.field2993.field355) + " (" + var6 + arg0.field3985 + ")";
        }
        if (class63.field941 == 1) {
            class42.method321(class146.field2391, (byte) 72, class239.field3818, arg3, (short) 21, (long) arg4, class297.field4709 + " -> <col=ffff00>" + var5, arg2);
            class131.field2084++;
        } else if (class131.field2131) {
            class150 var7 = class135.field2209 == -1 ? null : class153.method1140(11, class135.field2209);
            if ((class111.field1599 & 0x2) != 0) {
                if (var7 == null || arg0.method1755((byte) 18, var7.field2440, class135.field2209) != var7.field2440) {
                    class42.method321(class293.field4659, (byte) 72, class161.field2636, arg3, (short) 43, (long) arg4, class77.field1117 + " -> <col=ffff00>" + var5, arg2);
                    field3962++;
                }
                return;
            }
        } else {
            String[] var8 = arg0.field3991;
            class200.field3207++;
            if (class23.field273) {
                var8 = class149.method1056(var8, (byte) -128);
            }
            if (var8 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var8[var9] != null && (class175.field2850 != 0 || !var8[var9].equalsIgnoreCase(class191.field3079))) {
                        byte var10 = 0;
                        class34.field437++;
                        if (var9 == 0) {
                            var10 = 30;
                        }
                        if (var9 == 1) {
                            var10 = 22;
                        }
                        if (var9 == 2) {
                            var10 = 58;
                        }
                        if (var9 == 3) {
                            var10 = 16;
                        }
                        int var11 = -1;
                        if (var9 == 4) {
                            var10 = 17;
                        }
                        if (arg0.field4027 == var9) {
                            var11 = arg0.field3994;
                        }
                        if (arg0.field3988 == var9) {
                            var11 = arg0.field4016;
                        }
                        class42.method321(var8[var9], (byte) 72, var11, arg3, var10, (long) arg4, "<col=ffff00>" + var5, arg2);
                    }
                }
            }
            if (class175.field2850 == 0 && var8 != null) {
                for (int var12 = 4; var12 >= 0; var12--) {
                    if (var8[var12] != null && var8[var12].equalsIgnoreCase(class191.field3079)) {
                        short var13 = 0;
                        short var14 = 0;
                        if (arg0.field3985 > class186.field2993.field355) {
                            var13 = 2000;
                        }
                        if (var12 == 0) {
                            var14 = 30;
                        }
                        class97.field1427++;
                        if (var12 == 1) {
                            var14 = 22;
                        }
                        if (var12 == 2) {
                            var14 = 58;
                        }
                        if (var12 == 3) {
                            var14 = 16;
                        }
                        if (var12 == 4) {
                            var14 = 17;
                        }
                        if (var14 != 0) {
                            var14 += var13;
                        }
                        class42.method321(var8[var12], (byte) 72, arg0.field4021, arg3, var14, (long) arg4, "<col=ffff00>" + var5, arg2);
                    }
                }
            }
            class42.method321(class109.field1575, (byte) 72, class276.field4433, arg3, (short) 1003, (long) arg4, "<col=ffff00>" + var5, arg2);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1746(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3966++;
        class131 var7 = class161.method1200((byte) 74, arg1, arg6);
        if (arg2 != -9750) {
            method1742(false, true);
        }
        if (var7 != null && var7.field2117 != null) {
            class294 var8 = new class294();
            var8.field4668 = var7;
            var8.field4664 = var7.field2117;
            class266.method1852(var8, arg2 + 9751);
        }
        class111.field1599 = arg0;
        class221.field3536 = arg4;
        class126.field1862 = arg1;
        class34.field436 = arg6;
        class161.field2636 = arg5;
        class135.field2209 = arg3;
        class131.field2131 = true;
        class274.method1896(var7, 10);
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)I")
    public static int method1747(int arg0, int arg1) {
        return arg0 | arg1;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field3956[var0] = class229.method1633(79, var0);
        }
        field3964 = false;
    }
}
