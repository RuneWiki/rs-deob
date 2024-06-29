import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class77 {

    @OriginalMember(owner = "client!bi", name = "d", descriptor = "[I")
    private int[] field1444;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "[I")
    private int[] field1442;

    @OriginalMember(owner = "client!bi", name = "l", descriptor = "Lmd;")
    private class240 field1452;

    @OriginalMember(owner = "client!bi", name = "i", descriptor = "Lmd;")
    private class240 field1449;

    @OriginalMember(owner = "client!bi", name = "j", descriptor = "[Lmd;")
    private class240[] field1450;

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "Lig;")
    public static class168 field1447 = new class168(64);

    @OriginalMember(owner = "client!bi", name = "m", descriptor = "I")
    public static int field1453 = 0;

    @OriginalMember(owner = "client!bi", name = "n", descriptor = "Lcd;")
    public static class64 field1454 = class44.method335((byte) 71, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!bi", name = "p", descriptor = "[I")
    public static int[] field1456 = new int[25];

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "Lcd;")
    public static class64 field1457 = class44.method335((byte) 71, "Wordpack geladen)3");

    @OriginalMember(owner = "client!bi", name = "o", descriptor = "Lcc;")
    public static class237 field1455 = new class237();

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
    public static int field1459 = 128;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Z")
    public static boolean field1458;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZDLuk;BLqm;I)[B", line = 7)
    public final byte[] method607(int arg0, boolean arg1, double arg2, class86 arg3, byte arg4, class222 arg5, int arg6) {
        field1443++;
        byte[] var9 = new byte[arg6 * 4 * arg0];
        class97.method732(-122, arg2);
        class296.field5097 = arg3;
        class47.field773 = arg5;
        class54.method408(arg0, -105, arg6);
        for (int var10 = 0; var10 < this.field1450.length; var10++) {
            this.field1450[var10].method1747(arg6, arg0, -256);
        }
        int var11 = 0;
        if (arg4 > -66) {
            this.method607(93, false, -1.1409936800347393D, (class86) null, (byte) -78, (class222) null, -13);
        }
        for (int var12 = 0; var12 < arg6; var12++) {
            if (arg1) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field1452.field4113) {
                int[] var13 = this.field1452.method12(64, var12);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field1452.method286((byte) 58, var12);
                var14 = var17[0];
                var15 = var17[2];
                var16 = var17[1];
            }
            int[] var18;
            if (this.field1449.field4113) {
                var18 = this.field1449.method12(64, var12);
            } else {
                var18 = this.field1449.method286((byte) 70, var12)[0];
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = var16[var19] >> 4;
                int var21 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = class244.field4250[var20];
                if (var21 < 0) {
                    var21 = 0;
                }
                int var23 = class244.field4250[var21];
                int var24 = var15[var19] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = class244.field4250[var24];
                int var26;
                if (var23 == 0 && var22 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var22;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg1) {
                    var11 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field1450.length; var27++) {
            this.field1450[var27].method1012((byte) -126);
        }
        return var9;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Luk;Lqm;I)Z", line = 149)
    public final boolean method608(class86 arg0, class222 arg1, int arg2) {
        field1445++;
        for (int var4 = 0; var4 < this.field1442.length; var4++) {
            if (!arg1.method1585(this.field1442[var4], 1)) {
                return false;
            }
        }
        int var5 = 45 % ((19 - arg2) / 55);
        for (int var6 = 0; var6 < this.field1444.length; var6++) {
            if (!arg0.method659(this.field1444[var6], 1)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V", line = 187)
    public static void method609(int arg0) {
        if (arg0 != 255) {
            field1459 = 11;
        }
        field1447 = null;
        field1457 = null;
        field1455 = null;
        field1454 = null;
        field1456 = null;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(DLqm;IZIIZLuk;)[I", line = 204)
    public final int[] method610(double arg0, class222 arg1, int arg2, boolean arg3, int arg4, int arg5, boolean arg6, class86 arg7) {
        class97.method732(arg4 - 376, arg0);
        class296.field5097 = arg7;
        field1441++;
        if (arg4 != 255) {
            method613(-32, (byte) 10, 76, (byte[]) null);
        }
        class47.field773 = arg1;
        int[] var10 = new int[arg2 * arg5];
        class54.method408(arg5, 93, arg2);
        for (int var11 = 0; var11 < this.field1450.length; var11++) {
            this.field1450[var11].method1747(arg2, arg5, -256);
        }
        byte var12;
        int var13;
        int var14;
        if (arg6) {
            var12 = -1;
            var13 = arg5 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg5;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field1452.field4113) {
                int[] var21 = this.field1452.method12(arg4 ^ 0xBF, var16);
                var19 = var21;
                var20 = var21;
                var18 = var21;
            } else {
                int[][] var17 = this.field1452.method286((byte) 44, var16);
                var18 = var17[2];
                var19 = var17[1];
                var20 = var17[0];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var20[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = var19[var22] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class244.field4250[var23];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var26 = class244.field4250[var24];
                int var27 = var18[var22] >> 4;
                if (var27 > 255) {
                    var27 = 255;
                }
                if (var27 < 0) {
                    var27 = 0;
                }
                int var28 = class244.field4250[var27];
                var10[var15++] = (var25 << 16) + (var26 << 8) + var28;
                if (arg3) {
                    var15 += arg5 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field1450.length; var29++) {
            this.field1450[var29].method1012((byte) -75);
        }
        return var10;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIB)I", line = 347)
    public static final int method611(int arg0, int arg1, int arg2, byte arg3) {
        field1451++;
        if ((class82.field1508[arg1][arg0][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg1 <= 0 || (class82.field1508[1][arg0][arg2] & 0x2) == 0) {
            return arg3 > -28 ? 95 : arg1;
        } else {
            return arg1 - 1;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)Lwh;", line = 367)
    public static final class9 method612(boolean arg0) {
        field1446++;
        class83.field1533 = 0;
        return arg0 ? class164.method1177((byte) -3) : (class9) null;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V", line = 386)
    public class77() {
        this.field1444 = new int[0];
        this.field1442 = new int[0];
        this.field1452 = new class156();
        this.field1452.field4117 = 1;
        this.field1449 = new class156();
        this.field1450 = new class240[] { this.field1452, this.field1449 };
        this.field1449.field4117 = 1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI[B)Z", line = 408)
    public static final boolean method613(int arg0, byte arg1, int arg2, byte[] arg3) {
        boolean var4 = true;
        int var5 = -1;
        field1448++;
        class13 var6 = new class13(arg3);
        if (arg1 != -67) {
            return false;
        }
        label61: while (true) {
            int var7 = var6.method156(arg1 + 67);
            if (var7 == 0) {
                return var4;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var6.method163(255);
                    if (var11 == 0) {
                        continue label61;
                    }
                    var8 += var11 - 1;
                    int var12 = (var8 & 0xFCC) >> 6;
                    int var13 = var8 & 0x3F;
                    int var14 = var6.method152((byte) -123) >> 2;
                    int var15 = arg2 + var13;
                    int var16 = arg0 + var12;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class290 var17 = class172.method1207(var5, -128);
                        if (var14 != 22 || class222.field3762 || var17.field4967 != 0 || var17.field4966 == 1 || var17.field5022) {
                            if (!var17.method2006((byte) 115)) {
                                class9.field187++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var6.method163(255);
                if (var10 == 0) {
                    break;
                }
                var6.method152((byte) -78);
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lkh;)V", line = 497)
    public class77(class13 arg0) {
        int var2 = arg0.method152((byte) -100);
        int var3 = 0;
        int[][] var4 = new int[var2][];
        int var5 = 0;
        this.field1450 = new class240[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class240 var7 = class134.method956((byte) -89, arg0);
            if (var7.method1019((byte) -127) >= 0) {
                var3++;
            }
            if (var7.method1038(1000) >= 0) {
                var5++;
            }
            int var8 = var7.field4116.length;
            var4[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var4[var6][var9] = arg0.method152((byte) -122);
            }
            this.field1450[var6] = var7;
        }
        this.field1444 = new int[var5];
        this.field1442 = new int[var3];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class240 var13 = this.field1450[var12];
            int var14 = var13.field4116.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4116[var15] = this.field1450[var4[var12][var15]];
            }
            int var16 = var13.method1019((byte) -127);
            int var17 = var13.method1038(1000);
            if (var16 > 0) {
                this.field1442[var11++] = var16;
            }
            if (var17 > 0) {
                this.field1444[var10++] = var17;
            }
            var4[var12] = null;
        }
        this.field1452 = this.field1450[arg0.method152((byte) -101)];
        this.field1449 = this.field1450[arg0.method152((byte) -102)];
        int[][] var18 = (int[][]) null;
    }
}
