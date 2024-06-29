import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class57 extends class99 {

    @OriginalMember(owner = "client!ia", name = "fb", descriptor = "I")
    public int field1367 = 0;

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "[I")
    public static int[] field1354 = new int[99];

    @OriginalMember(owner = "client!ia", name = "eb", descriptor = "Laf;")
    public static class7 field1366;

    @OriginalMember(owner = "client!ia", name = "bb", descriptor = "[I")
    public static int[] field1363;

    @OriginalMember(owner = "client!ia", name = "ab", descriptor = "Lgd;")
    public static class46 field1362;

    @OriginalMember(owner = "client!ia", name = "gb", descriptor = "Laf;")
    public static class7 field1368;

    @OriginalMember(owner = "client!ia", name = "hb", descriptor = "Laf;")
    public static class7 field1369;

    @OriginalMember(owner = "client!ia", name = "jb", descriptor = "I")
    public static int field1371;

    @OriginalMember(owner = "client!ia", name = "ib", descriptor = "[I")
    public static int[] field1370;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "I")
    public static int field1355;

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "I")
    public static int field1356;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field1357;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!ia", name = "Y", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!ia", name = "Z", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!ia", name = "cb", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!ia", name = "db", descriptor = "Lr;")
    public static class118 field1365;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI)Z")
    public static final boolean method462(boolean arg0, int arg1) {
        field1356++;
        if (arg0) {
            method468(null, 48, null, null);
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(ILrd;)V")
    public final void method463(int arg0, class122 arg1) {
        while (true) {
            int var3 = arg1.method931((byte) 124);
            if (var3 == 0) {
                field1359++;
                if (arg0 != -1025) {
                    this.method465(null, 122, -111);
                    return;
                }
                return;
            }
            this.method465(arg1, var3, arg0 ^ 0x448);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lrd;Loc;ZI)V")
    public static final void method464(class122 arg0, class100 arg1, boolean arg2, int arg3) {
        field1353++;
        class67 var4 = new class67();
        var4.field1460 = arg0.method931((byte) 124);
        if (arg2) {
            return;
        }
        var4.field1469 = arg0.method972(-115);
        var4.field1464 = new class90[var4.field1460];
        var4.field1468 = new class90[var4.field1460];
        var4.field1474 = new int[var4.field1460];
        var4.field1465 = new int[var4.field1460];
        var4.field1473 = new int[var4.field1460];
        var4.field1472 = new byte[var4.field1460][][];
        for (int var5 = 0; var5 < var4.field1460; var5++) {
            try {
                int var6 = arg0.method931((byte) 124);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg0.method979(26250).method97(63));
                    String var8 = new String(arg0.method979(26250).method97(-110));
                    int var9 = 0;
                    if (var6 == 1) {
                        var9 = arg0.method972(-104);
                    }
                    var4.field1473[var5] = var6;
                    var4.field1465[var5] = var9;
                    var4.field1468[var5] = arg1.method826(var8, 0, class4.method25(var7, 1));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg0.method979(26250).method97(82));
                    String var11 = new String(arg0.method979(26250).method97(49));
                    int var12 = arg0.method931((byte) 124);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg0.method979(26250).method97(124));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg0.method972(111);
                            var15[var16] = new byte[var17];
                            arg0.method955(true, var17, 0, var15[var16]);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field1473[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class4.method25(var13[var19], 1);
                    }
                    var4.field1464[var5] = arg1.method825(var11, var18, (byte) -80, class4.method25(var10, 1));
                    var4.field1472[var5] = var15;
                }
            } catch (ClassNotFoundException var20) {
                var4.field1474[var5] = -1;
            } catch (SecurityException var21) {
                var4.field1474[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field1474[var5] = -3;
            } catch (Exception var23) {
                var4.field1474[var5] = -4;
            } catch (Throwable var24) {
                var4.field1474[var5] = -5;
            }
        }
        class121.field2856.method765(var4, 0);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lrd;II)V")
    private final void method465(class122 arg0, int arg1, int arg2) {
        field1361++;
        if (arg1 == 2) {
            this.field1367 = arg0.method965(false);
        }
        if (arg2 >= -37) {
            method466((byte) -92);
        }
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(B)V")
    public static void method466(byte arg0) {
        field1369 = null;
        field1370 = null;
        field1363 = null;
        field1362 = null;
        field1365 = null;
        field1368 = null;
        field1366 = null;
        field1354 = null;
        int var1 = -115 % ((arg0 + 80) / 32);
    }

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "(B)V")
    public static final void method467(byte arg0) {
        field1357++;
        if (!class155.field3605) {
            return;
        }
        class6.field107 = null;
        class106.field2612 = null;
        class116.field2765 = null;
        class80.field1851 = null;
        class66.field1435 = null;
        class67.field1471 = null;
        class106.field2619 = null;
        class47.field1152 = null;
        class58.field1377 = null;
        class18.field423 = null;
        class4.field42 = null;
        class9.field249 = null;
        class25.field671 = null;
        class11.field279 = null;
        class123.field2939 = null;
        class12.field321 = null;
        class109.field2664 = null;
        class155.field3594 = null;
        class144.field3403 = null;
        class115.field2750 = null;
        class2.method15(false, 2);
        if (arg0 != 87) {
            method469(-7, 59, 88, 3, -24, 98, 10, -23, false, -43, -122, 90);
        }
        class54.method435(123, true);
        class155.field3605 = false;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lkb;ILjava/awt/Component;Lkb;)V")
    public static final void method468(class71 arg0, int arg1, Component arg2, class71 arg3) {
        field1358++;
        if (class155.field3605) {
            return;
        }
        class33.method300();
        byte[] var4 = arg3.method573(true, class106.field2614, class93.field2156);
        class144.field3403 = new class40(var4, arg2);
        int var5 = 88 % ((arg1 - 53) / 33);
        class58.field1377 = class144.field3403.method343();
        class155.field3594 = class102.method837(class96.field2274, -40, class106.field2614, arg0);
        class67.field1471 = class102.method837(class4.field43, -111, class106.field2614, arg0);
        class11.field279 = class102.method837(class141.field3318, -47, class106.field2614, arg0);
        class106.field2619 = class24.method230(class106.field2614, -16125, class75.field1751, arg0);
        class106.field2612 = class24.method230(class106.field2614, -16125, class73.field1678, arg0);
        class80.field1851 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            class80.field1851[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class80.field1851[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class80.field1851[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            class80.field1851[var9 + 192] = 16777215;
        }
        class115.field2750 = new int[256];
        for (int var10 = 0; var10 < 64; var10++) {
            class115.field2750[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class115.field2750[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class115.field2750[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class115.field2750[var13 + 192] = 16777215;
        }
        class4.field42 = new int[256];
        for (int var14 = 0; var14 < 64; var14++) {
            class4.field42[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class4.field42[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class4.field42[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class4.field42[var17 + 192] = 16777215;
        }
        class47.field1152 = new int[256];
        class18.field423 = new int[32768];
        class25.field671 = new int[32768];
        class120.method927((byte) -127, null);
        class106.field2618 = class106.field2614;
        class123.field2939 = new int[32768];
        class12.field321 = new int[32768];
        class106.field2608 = class106.field2614;
        class89.field2078 = 0;
        class96.field2269 = false;
        if (class94.field2205 == 0) {
            class111.field2683 = true;
        } else {
            class111.field2683 = false;
        }
        if (class111.field2683) {
            class2.method15(false, 2);
        } else {
            class126.method1041(2, false, class113.field2710, (byte) 0, class106.field2614, class24.field656, 255);
        }
        class54.method435(122, false);
        class155.field3605 = true;
        class144.field3403.method366(0, 0);
        class58.field1377.method366(382, 0);
        class155.field3594.method896(382 - class155.field3594.field2723 / 2, 18);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method469(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var36 = 0; var36 < 104; var36++) {
                class50.field1205[var12][var36] = 0;
                class130.field3095[var12][var36] = 99999999;
            }
        }
        int var13 = arg4;
        class50.field1205[arg4][arg11] = 99;
        class130.field3095[arg4][arg11] = 0;
        byte var14 = 0;
        field1364++;
        int var15 = arg11;
        class103.field2509[var14] = arg4;
        int var16 = 0;
        int var37 = var14 + 1;
        class111.field2670[var14] = arg11;
        boolean var17 = false;
        int var18 = class103.field2509.length;
        int[][] var19 = class155.field3609[class8.field186].field2047;
        while (var37 != var16) {
            var13 = class103.field2509[var16];
            var15 = class111.field2670[var16];
            var16 = (var16 + 1) % var18;
            if (arg0 == var13 && arg1 == var15) {
                var17 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && class155.field3609[class8.field186].method718(arg3 - 1, var15, arg10, arg1, var13, false, arg0)) {
                    var17 = true;
                    break;
                }
                if (arg3 < 10 && class155.field3609[class8.field186].method717(var15, arg1, arg10, 85, var13, arg0, arg3 - 1)) {
                    var17 = true;
                    break;
                }
            }
            if (arg7 != 0 && arg6 != 0 && class155.field3609[class8.field186].method724(var13, arg6, arg2 ^ 0xFFFFFFD3, arg1, arg0, arg5, var15, arg7)) {
                var17 = true;
                break;
            }
            int var35 = class130.field3095[var13][var15] + 1;
            if (var13 > 0 && class50.field1205[var13 - 1][var15] == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0) {
                class103.field2509[var37] = var13 - 1;
                class111.field2670[var37] = var15;
                var37 = (var37 + 1) % var18;
                class50.field1205[var13 - 1][var15] = 2;
                class130.field3095[var13 - 1][var15] = var35;
            }
            if (var13 < 103 && class50.field1205[var13 + 1][var15] == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0) {
                class103.field2509[var37] = var13 + 1;
                class111.field2670[var37] = var15;
                var37 = (var37 + 1) % var18;
                class50.field1205[var13 + 1][var15] = 8;
                class130.field3095[var13 + 1][var15] = var35;
            }
            if (var15 > 0 && class50.field1205[var13][var15 - 1] == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class103.field2509[var37] = var13;
                class111.field2670[var37] = var15 - 1;
                class50.field1205[var13][var15 - 1] = 1;
                var37 = (var37 + 1) % var18;
                class130.field3095[var13][var15 - 1] = var35;
            }
            if (var15 < 103 && class50.field1205[var13][var15 + 1] == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class103.field2509[var37] = var13;
                class111.field2670[var37] = var15 + 1;
                class50.field1205[var13][var15 + 1] = 4;
                class130.field3095[var13][var15 + 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var15 > 0 && class50.field1205[var13 - 1][var15 - 1] == 0 && (var19[var13 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class103.field2509[var37] = var13 - 1;
                class111.field2670[var37] = var15 - 1;
                class50.field1205[var13 - 1][var15 - 1] = 3;
                class130.field3095[var13 - 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 < 103 && var15 > 0 && class50.field1205[var13 + 1][var15 - 1] == 0 && (var19[var13 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 - 1] & 0x12C0102) == 0) {
                class103.field2509[var37] = var13 + 1;
                class111.field2670[var37] = var15 - 1;
                class50.field1205[var13 + 1][var15 - 1] = 9;
                class130.field3095[var13 + 1][var15 - 1] = var35;
                var37 = (var37 + 1) % var18;
            }
            if (var13 > 0 && var15 < 103 && class50.field1205[var13 - 1][var15 + 1] == 0 && (var19[var13 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var13 - 1][var15] & 0x12C0108) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class103.field2509[var37] = var13 - 1;
                class111.field2670[var37] = var15 + 1;
                var37 = (var37 + 1) % var18;
                class50.field1205[var13 - 1][var15 + 1] = 6;
                class130.field3095[var13 - 1][var15 + 1] = var35;
            }
            if (var13 < 103 && var15 < 103 && class50.field1205[var13 + 1][var15 + 1] == 0 && (var19[var13 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var13 + 1][var15] & 0x12C0180) == 0 && (var19[var13][var15 + 1] & 0x12C0120) == 0) {
                class103.field2509[var37] = var13 + 1;
                class111.field2670[var37] = var15 + 1;
                var37 = (var37 + 1) % var18;
                class50.field1205[var13 + 1][var15 + 1] = 12;
                class130.field3095[var13 + 1][var15 + 1] = var35;
            }
        }
        class139.field3286 = 0;
        if (!var17) {
            if (!arg8) {
                return false;
            }
            int var20 = 100;
            byte var21 = 10;
            int var22 = 1000;
            for (int var23 = arg0 - var21; var23 <= arg0 + var21; var23++) {
                for (int var24 = arg1 - var21; var24 <= arg1 + var21; var24++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104 && class130.field3095[var23][var24] < 100) {
                        int var25 = 0;
                        if (arg0 > var23) {
                            var25 = arg0 - var23;
                        } else if (arg0 + arg7 - 1 < var23) {
                            var25 = var23 + 1 - arg0 - arg7;
                        }
                        int var26 = 0;
                        if (arg1 > var24) {
                            var26 = arg1 - var24;
                        } else if (arg1 + arg6 - 1 < var24) {
                            var26 = var24 + 1 - arg1 - arg6;
                        }
                        int var27 = var25 * var25 + var26 * var26;
                        if (var22 > var27 || var22 == var27 && var20 > class130.field3095[var23][var24]) {
                            var22 = var27;
                            var15 = var24;
                            var13 = var23;
                            var20 = class130.field3095[var23][var24];
                        }
                    }
                }
            }
            if (var22 == 1000) {
                return false;
            }
            if (arg4 == var13 && arg11 == var15) {
                return false;
            }
            class139.field3286 = 1;
        }
        if (arg2 != 10) {
            return false;
        }
        byte var28 = 0;
        class103.field2509[var28] = var13;
        int var38 = var28 + 1;
        class111.field2670[var28] = var15;
        int var29;
        int var30 = var29 = class50.field1205[var13][var15];
        while (arg4 != var13 || arg11 != var15) {
            if (var29 != var30) {
                class103.field2509[var38] = var13;
                class111.field2670[var38++] = var15;
                var29 = var30;
            }
            if ((var30 & 0x1) != 0) {
                var15++;
            } else if ((var30 & 0x4) != 0) {
                var15--;
            }
            if ((var30 & 0x2) != 0) {
                var13++;
            } else if ((var30 & 0x8) != 0) {
                var13--;
            }
            var30 = class50.field1205[var13][var15];
        }
        if (var38 > 0) {
            int var31 = var38;
            if (var38 > 25) {
                var31 = 25;
            }
            var38--;
            int var32 = class103.field2509[var38];
            int var33 = class111.field2670[var38];
            if (arg9 == 0) {
                class137.field3258++;
                class47.field1150.method1131(53, 2027385224);
                class47.field1150.method959(var31 + var31 + 3, (byte) -120);
            }
            if (arg9 == 1) {
                class145.field3432++;
                class47.field1150.method1131(111, 2027385224);
                class47.field1150.method959(var31 + var31 + 3 + 14, (byte) -120);
            }
            if (arg9 == 2) {
                class142.field3374++;
                class47.field1150.method1131(110, 2027385224);
                class47.field1150.method959(var31 + var31 + 3, (byte) -120);
            }
            class47.field1150.method964(class119.field2818[82] ? 1 : 0, (byte) -45);
            class47.field1150.method939(466050456, class32.field843 + var33);
            class47.field1150.method942(arg2 ^ 0x9FA, class153.field3585 + var32);
            class84.field1984 = class111.field2670[0];
            class42.field1012 = class103.field2509[0];
            for (int var34 = 1; var34 < var31; var34++) {
                var38--;
                class47.field1150.method960(class103.field2509[var38] - var32, arg2 ^ 0xAF04F3D2);
                class47.field1150.method936(class111.field2670[var38] - var33, arg2 ^ 0xFFFFFFCA);
            }
            return true;
        } else if (arg9 == 1) {
            return false;
        } else {
            return true;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field1354[var1] = var0 / 4;
        }
        field1366 = class48.method406(40, "sich mit einer anderen Welt zu verbinden)3");
        field1363 = new int[200];
        field1362 = new class46(500);
        field1368 = class48.method406(40, "<col=40ff00>");
        field1369 = class48.method406(40, "Lade)3)3)3");
        field1371 = 1;
        field1370 = new int[32];
    }
}
