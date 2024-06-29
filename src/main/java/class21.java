import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class21 extends class435 {

    @OriginalMember(owner = "client!uv", name = "y", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "[[I")
    public int[][] field287;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "[I")
    public int[] field280;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "[Z")
    public boolean[] field283;

    @OriginalMember(owner = "client!uv", name = "A", descriptor = "[I")
    public int[] field290;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "Z")
    public static boolean field284 = false;

    @OriginalMember(owner = "client!uv", name = "z", descriptor = "Lvh;")
    public static class125 field289 = new class125(13, 7);

    @OriginalMember(owner = "client!uv", name = "C", descriptor = "Lvh;")
    public static class125 field292 = new class125(10, 8);

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!uv", name = "B", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(Ljb;I)I", line = 5)
    public static final int method211(class666 arg0, int arg1) {
        field281++;
        if (class556.field8138 == arg0) {
            return 6407;
        } else if (class297.field4191 == arg0) {
            return 6408;
        } else if (class665.field9353 == arg0) {
            return 6406;
        } else if (class682.field9712 == arg0) {
            return 6409;
        } else if (class694.field9862 == arg0) {
            return 6410;
        } else if (class609.field8746 == arg0) {
            return 6145;
        } else {
            if (arg1 != 49) {
                method214((byte) 12);
            }
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZLd;I)V", line = 40)
    public static final void method212(boolean arg0, class88 arg1, int arg2) {
        field286++;
        if (class400.field5784 >= 400) {
            return;
        }
        class528 var3 = arg1.field1309;
        if (var3.field7758 != null) {
            var3 = var3.method3110(class230.field3404, false);
            if (var3 == null) {
                return;
            }
        }
        if (!var3.field7780) {
            return;
        }
        String var4 = var3.field7761;
        if (arg2 > -23) {
            return;
        }
        if (var3.field7795 != 0) {
            String var5 = class486.field6942 == class302.field4235 ? class343.field4779.method2059(class238.field3511, true) : class343.field4777.method2059(class238.field3511, true);
            var4 = var4 + class213.method1452(-99, var3.field7795, class103.field1708.field3838) + " (" + var5 + var3.field7795 + ")";
        }
        if (class41.field555 && !arg0) {
            class349 var6 = class510.field7581 == -1 ? null : class237.field3504.method1554(false, class510.field7581);
            if ((class700.field9918 & 0x2) != 0 && (var6 == null || var3.method3102(class510.field7581, (byte) 0, var6.field4922) != var6.field4922)) {
                class476.method2787(0, (long) arg1.field2427, -1, 0, true, (byte) -26, class584.field8560, 11, class252.field3651 + " -> <col=ffff00>" + var4, false, class25.field346);
                class548.field8040++;
            }
        }
        if (!arg0) {
            String[] var7 = var3.field7752;
            if (class323.field4495) {
                var7 = class221.method1476(var7, -24360);
            }
            if (var7 != null) {
                for (int var8 = 4; var8 >= 0; var8--) {
                    if (var7[var8] != null && (var3.field7727 == 0 || !var7[var8].equalsIgnoreCase(class343.field4772.method2059(class238.field3511, true)))) {
                        byte var9 = 0;
                        if (var8 == 0) {
                            var9 = 49;
                        }
                        int var10 = class333.field4640;
                        if (var8 == 1) {
                            var9 = 25;
                        }
                        if (var8 == 2) {
                            var9 = 60;
                        }
                        if (var8 == 3) {
                            var9 = 18;
                        }
                        if (var3.field7768 == var8) {
                            var10 = var3.field7740;
                        }
                        if (var8 == 4) {
                            var9 = 51;
                        }
                        if (var3.field7796 == var8) {
                            var10 = var3.field7743;
                        }
                        class476.method2787(0, (long) arg1.field2427, -1, 0, true, (byte) -26, var7[var8], var9, "<col=ffff00>" + var4, false, var7[var8].equalsIgnoreCase(class343.field4772.method2059(class238.field3511, true)) ? var3.field7741 : var10);
                        class163.field2705++;
                    }
                }
            }
            if (var3.field7727 == 1 && var7 != null) {
                for (int var11 = 4; var11 >= 0; var11--) {
                    if (var7[var11] != null && var7[var11].equalsIgnoreCase(class343.field4772.method2059(class238.field3511, true))) {
                        short var12 = 0;
                        if (var3.field7795 > class103.field1708.field3838) {
                            var12 = 2000;
                        }
                        short var13 = 0;
                        if (var11 == 0) {
                            var13 = 49;
                        }
                        if (var11 == 1) {
                            var13 = 25;
                        }
                        if (var11 == 2) {
                            var13 = 60;
                        }
                        if (var11 == 3) {
                            var13 = 18;
                        }
                        if (var11 == 4) {
                            var13 = 51;
                        }
                        if (var13 != 0) {
                            var13 += var12;
                        }
                        class476.method2787(0, (long) arg1.field2427, -1, 0, true, (byte) -26, var7[var11], var13, "<col=ffff00>" + var4, false, var3.field7741);
                        class77.field1191++;
                    }
                }
            }
        }
        class80.field1211++;
        class476.method2787(0, (long) arg1.field2427, -1, 0, true, (byte) -26, class343.field4771.method2059(class238.field3511, true), 1004, "<col=ffff00>" + var4, arg0, class254.field3673);
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(ZI)I", line = 207)
    public static final int method213(boolean arg0, int arg1) {
        if (arg0) {
            field291++;
            return arg1 >>> 10;
        } else {
            return 14;
        }
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(B)V", line = 219)
    public static void method214(byte arg0) {
        field292 = null;
        if (arg0 == -1) {
            field289 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(I[B)V", line = 239)
    public class21(int arg0, byte[] arg1) {
        this.field288 = arg0;
        class465 var3 = new class465(arg1);
        this.field282 = var3.method2705(-39);
        this.field287 = new int[this.field282][];
        this.field280 = new int[this.field282];
        this.field283 = new boolean[this.field282];
        this.field290 = new int[this.field282];
        for (int var4 = 0; var4 < this.field282; var4++) {
            this.field280[var4] = var3.method2705(-28);
            if (this.field280[var4] == 6) {
                this.field280[var4] = 2;
            }
        }
        for (int var5 = 0; var5 < this.field282; var5++) {
            this.field283[var5] = var3.method2705(-33) == 1;
        }
        for (int var6 = 0; var6 < this.field282; var6++) {
            this.field290[var6] = var3.method2755((byte) -78);
        }
        for (int var7 = 0; var7 < this.field282; var7++) {
            this.field287[var7] = new int[var3.method2705(-96)];
        }
        for (int var8 = 0; var8 < this.field282; var8++) {
            for (int var9 = 0; var9 < this.field287[var8].length; var9++) {
                this.field287[var8][var9] = var3.method2705(-34);
            }
        }
    }
}
