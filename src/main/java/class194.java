import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class194 {

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "I")
    public static int field3103;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    public static int field3108;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "I")
    public static int field3111;

    @OriginalMember(owner = "client!cl", name = "k", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "Lsk;")
    public static class112 field3104;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "Lqh;")
    public static class201 field3102;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "Z")
    public static boolean field3107;

    @OriginalMember(owner = "client!cl", name = "l", descriptor = "[I")
    public static int[] field3113;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public static void method1319(byte arg0) {
        if (arg0 != 35) {
            field3106 = -9;
        }
        field3104 = null;
        field3113 = null;
        field3102 = null;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZI)V")
    private static final void method1320(boolean arg0, int arg1) {
        class72.field1185.method476(false, arg1);
        field3112++;
        if (!arg0) {
            method1321(86, (class221) null);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ILog;)V")
    public static final void method1321(int arg0, class221 arg1) {
        field3103++;
        if (arg0 > -113) {
            method1326((byte) 82);
        }
        while (true) {
            while (arg1.field3655 < arg1.field3653.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1517((byte) -96) == 1) {
                    var3 = arg1.method1517((byte) -96);
                    var2 = true;
                    var4 = arg1.method1517((byte) -96);
                }
                int var5 = arg1.method1517((byte) -96);
                int var6 = arg1.method1517((byte) -96);
                int var7 = var5 * 64 - class161.field2568;
                int var8 = class223.field3692 - (var6 * 64 - (class210.field3428 - 1));
                if (var7 >= 0 && var8 - 63 >= 0 && var7 + 63 < class1.field17 && class210.field3428 > var8) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < (var4 * 8 + 8)) {
                                byte var13 = arg1.method1535((byte) -107);
                                if (var13 != 0) {
                                    if (class195.field3115[var10][var9] == null) {
                                        class195.field3115[var10][var9] = new byte[4096];
                                    }
                                    class195.field3115[var10][var9][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1535((byte) -112);
                                    if (class196.field3131[var10][var9] == null) {
                                        class196.field3131[var10][var9] = new byte[4096];
                                    }
                                    class196.field3131[var10][var9][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1535((byte) -101);
                        if (var16 != 0) {
                            arg1.field3655++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(ZI)V")
    public static final void method1322(boolean arg0, int arg1) {
        field3108++;
        if (arg1 == -1 || !class10.field147[arg1]) {
            return;
        }
        class234.field3819.method1379((byte) -13, arg1);
        if (class136.field2250[arg1] == null) {
            return;
        }
        boolean var2 = arg0;
        for (int var3 = 0; var3 < class136.field2250[arg1].length; var3++) {
            if (class136.field2250[arg1][var3] != null) {
                if (class136.field2250[arg1][var3].field709 == 2) {
                    var2 = false;
                } else {
                    class136.field2250[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class136.field2250[arg1] = null;
        }
        class10.field147[arg1] = false;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
    public static final void method1323(int arg0) {
        field3110++;
        method1320(true, 5);
        class253.method1724(0, 5);
        class146.method995(5, 6);
        class101.method739((byte) -25, 5);
        class17.method135(1, 5);
        class75.method526((byte) -56, 5);
        class177.method1210(5, 111);
        class200.method1350((byte) -98, 5);
        class223.method1574(arg0, -26234);
        class274.method1853(5, (byte) 92);
        class201.method1370(5, true);
        class170.method1171((byte) 101, 5);
        class84.method608(arg0 - 128, 5);
        class149.method1021(5, (byte) 59);
        class1.method10(5, (byte) -127);
        class91.method684(4733, 50);
        class279.method1878(5463, 5);
        class121.method874((byte) 67, 5);
        class70.field1158.method476(false, 5);
        class40.field747.method476(false, 5);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Log;Z)V")
    public static final void method1324(class221 arg0, boolean arg1) {
        field3109++;
        int var2 = class23.field390 >> 2 << 10;
        int var3 = class141.field2290 >> 1;
        byte[][] var4 = new byte[class1.field17][class210.field3428];
        while (arg0.field3653.length > arg0.field3655) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1517((byte) -96) == 1) {
                var33 = true;
                var35 = arg0.method1517((byte) -96);
                var34 = arg0.method1517((byte) -96);
            }
            int var36 = arg0.method1517((byte) -96);
            int var37 = arg0.method1517((byte) -96);
            int var38 = var36 * 64 - class161.field2568;
            int var39 = class210.field3428 + class223.field3692 - var37 * 64 - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && (var38 + 63) < class1.field17 && var39 < class210.field3428) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= (var35 * 8) && var40 < var35 * 8 + 8 && var34 * 8 <= var42 && var34 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg0.method1535((byte) -106);
                        }
                    }
                }
            } else if (var33) {
                arg0.field3655 += 64;
            } else {
                arg0.field3655 += 4096;
            }
        }
        int var5 = class1.field17;
        int var6 = class210.field3428;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        int var12 = -5;
        if (!arg1) {
            method1320(false, -79);
        }
        while (var12 < var5) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class236 var29 = class205.method1418(var28 - 1, true);
                        var8[var13] += var29.field3854;
                        var7[var13] += var29.field3849;
                        var9[var13] += var29.field3841;
                        var10[var13] += var29.field3844;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class236 var32 = class205.method1418(var31 - 1, true);
                        var8[var13] -= var32.field3854;
                        var7[var13] -= var32.field3849;
                        var9[var13] -= var32.field3841;
                        var10[var13] -= var32.field3844;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class118.field1938[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var22 < var6) {
                        var18 += var10[var22];
                        var17 += var7[var22];
                        var15 += var8[var22];
                        var19 += var11[var22];
                        var16 += var9[var22];
                    }
                    if (var21 >= 0) {
                        var18 -= var10[var21];
                        var16 -= var9[var21];
                        var17 -= var7[var21];
                        var15 -= var8[var21];
                        var19 -= var11[var21];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class15.method121(var17 / var19, var16 / var19, (byte) -74, var15 * 256 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 & 0x380) + (var24 + var2 & 0xFC00) + var25;
                            var23[class202.method1393(63, var12) + (class202.method1393(63, var20) << 6)] = class69.field1149[class144.method987(var26, 96, false)];
                        } else if (var23 != null) {
                            var23[class202.method1393(63, var12) + (class202.method1393(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([Ljava/lang/String;[SIII)V")
    public static final void method1325(String[] arg0, short[] arg1, int arg2, int arg3, int arg4) {
        if (arg2 > arg3) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg2] = arg1[var6];
            arg1[var6] = var8;
            method1325(arg0, arg1, var6 - 1, arg3, 122);
            method1325(arg0, arg1, arg2, var6 + 1, 59);
        }
        if (arg4 >= 2) {
            field3111++;
        }
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)V")
    public static final void method1326(byte arg0) {
        field3105++;
        for (int var1 = 0; var1 < class221.field3623; var1++) {
            int var10002 = class161.field2562[var1]--;
            if (class161.field2562[var1] >= -10) {
                class192 var3 = class56.field962[var1];
                if (var3 == null) {
                    var3 = class192.method1307(class44.field806, class204.field3276[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class161.field2562[var1] += var3.method1310();
                    class56.field962[var1] = var3;
                }
                if (class161.field2562[var1] < 0) {
                    int var4;
                    if (class154.field2493[var1] == 0) {
                        var4 = class94.field1550;
                    } else {
                        int var5 = (class154.field2493[var1] & 0xFF5735) >> 16;
                        int var6 = (class154.field2493[var1] & 0xFF) * 128;
                        int var7 = var5 * 128 + 64 - class167.field2655.field3389;
                        int var8 = class154.field2493[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + (64 - class167.field2655.field3341);
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var6 < var10) {
                            class161.field2562[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var6 - var10) * class107.field1745 / var6;
                    }
                    if (var4 > 0) {
                        class93 var11 = var3.method1308().method699(class168.field2668);
                        class18 var12 = class18.method157(var11, 100, var4);
                        var12.method174(class43.field798[var1] - 1);
                        class195.field3123.method1708(var12);
                    }
                    class161.field2562[var1] = -100;
                }
            } else {
                class221.field3623--;
                for (int var2 = var1; var2 < class221.field3623; var2++) {
                    class204.field3276[var2] = class204.field3276[var2 + 1];
                    class56.field962[var2] = class56.field962[var2 + 1];
                    class43.field798[var2] = class43.field798[var2 + 1];
                    class161.field2562[var2] = class161.field2562[var2 + 1];
                    class154.field2493[var2] = class154.field2493[var2 + 1];
                }
                var1--;
            }
        }
        if (arg0 >= -26) {
            field3113 = null;
        }
        if (class98.field1601 && !class60.method432((byte) -122)) {
            if (class284.field4480 != 0 && class148.field2389 != -1) {
                class254.method1727(0, false, class284.field4480, class148.field2389, class168.field2665, 10905);
            }
            class98.field1601 = false;
        } else if (class284.field4480 != 0 && class148.field2389 != -1 && !class60.method432((byte) 121)) {
            class68.field1113.method534((byte) -124, 106);
            class68.field1113.method1529((byte) 117, class148.field2389);
            class148.field2389 = -1;
            class199.field3171++;
        }
    }
}
