import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class261 {

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "I")
    private int field333 = 0;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    private int field329 = 1;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    private int field326 = 0;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "Lve;")
    public static class255 field322 = class87.method607(68, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "F")
    public static float field323;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "[I")
    public static int[] field324;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "[I")
    public static int[] field336;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "[Ldm;")
    public static class273[] field335;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lpb;BI)V", line = 4)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 >= -115) {
            method112(-73, -100, -5, -105, 52, -73, false, -70, -80, 103, 78, -49);
        }
        if (arg2 == 0) {
            this.field333 = arg0.method481(0);
        } else if (arg2 == 1) {
            this.field326 = arg0.method481(0);
        } else if (arg2 == 3) {
            this.field329 = arg0.method481(0);
        }
        field327++;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V", line = 48)
    public static final void method109(int arg0) {
        field328++;
        int var1 = 108 / ((-arg0 - 46) / 59);
        class310.field5288.method553(-16);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ZZ)V", line = 69)
    public static final void method110(boolean arg0, boolean arg1) {
        field334++;
        class47.field723 = arg1;
        class154.field2628 = !class96.method761(arg0);
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 78)
    public class20() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(B)V", line = 82)
    public final void method111(byte arg0) {
        if (arg0 == -57) {
            field330++;
            class254.method1735(62);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)[I", line = 93)
    public final int[] method21(byte arg0, int arg1) {
        field337++;
        int var3 = -14 / ((arg0 + 49) / 33);
        int[] var4 = this.field4425.method906(arg1, 8251);
        if (this.field4425.field2043) {
            int var5 = field324[arg1];
            int var6 = var5 - 2048 >> 1;
            for (int var7 = 0; var7 < class92.field1576; var7++) {
                int var8 = class245.field4120[var7];
                int var9 = var8 - 2048 >> 1;
                int var12;
                if (this.field333 == 0) {
                    var12 = (var8 - var5) * this.field329;
                } else {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field329 * var11) * 3.141592653589793D);
                }
                int var13 = var12 - (var12 & 0xFFFFF000);
                if (this.field326 == 0) {
                    var13 = class107.field1800[(var13 & 0xFF5) >> 4] + 4096 >> 1;
                } else if (this.field326 == 2) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIZIIIII)Z", line = 164)
    public static final boolean method112(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class198.field3418[var12][var13] = 0;
                class239.field3983[var12][var13] = 99999999;
            }
        }
        class198.field3418[arg11][arg5] = 99;
        field338++;
        if (arg3 != 1) {
            method114((byte) 29);
        }
        class239.field3983[arg11][arg5] = 0;
        int var14 = arg11;
        int var15 = arg5;
        byte var16 = 0;
        int var17 = 0;
        class212.field3617[var16] = arg11;
        boolean var18 = false;
        int var32 = var16 + 1;
        class90.field1535[var16] = arg5;
        int[][] var19 = class310.field5292[client.field4039].field2743;
        while (var32 != var17) {
            var15 = class90.field1535[var17];
            var14 = class212.field3617[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg4 == var14 && arg7 == var15) {
                var18 = true;
                break;
            }
            if (arg9 != 0) {
                if ((arg9 < 5 || arg9 == 10) && class310.field5292[client.field4039].method1175(arg10, var14, 1, arg4, arg9 - 1, arg7, (byte) -40, var15)) {
                    var18 = true;
                    break;
                }
                if (arg9 < 10 && class310.field5292[client.field4039].method1182(arg10, 1, arg4, arg7, arg9 - 1, false, var14, var15)) {
                    var18 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg1 != 0 && class310.field5292[client.field4039].method1184(arg1, (byte) -114, var15, arg4, arg8, var14, arg7, arg0, 1)) {
                var18 = true;
                break;
            }
            int var20 = class239.field3983[var14][var15] + 1;
            if (var14 > 0 && class198.field3418[var14 - 1][var15] == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0) {
                class212.field3617[var32] = var14 - 1;
                class90.field1535[var32] = var15;
                class198.field3418[var14 - 1][var15] = 2;
                var32 = var32 + 1 & 0xFFF;
                class239.field3983[var14 - 1][var15] = var20;
            }
            if (var14 < 103 && class198.field3418[var14 + 1][var15] == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0) {
                class212.field3617[var32] = var14 + 1;
                class90.field1535[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 + 1][var15] = 8;
                class239.field3983[var14 + 1][var15] = var20;
            }
            if (var15 > 0 && class198.field3418[var14][var15 - 1] == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class212.field3617[var32] = var14;
                class90.field1535[var32] = var15 - 1;
                class198.field3418[var14][var15 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class239.field3983[var14][var15 - 1] = var20;
            }
            if (var15 < 103 && class198.field3418[var14][var15 + 1] == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class212.field3617[var32] = var14;
                class90.field1535[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14][var15 + 1] = 4;
                class239.field3983[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class198.field3418[var14 - 1][var15 - 1] == 0 && (var19[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class212.field3617[var32] = var14 - 1;
                class90.field1535[var32] = var15 - 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 - 1][var15 - 1] = 3;
                class239.field3983[var14 - 1][var15 - 1] = var20;
            }
            if (var14 < 103 && var15 > 0 && class198.field3418[var14 + 1][var15 - 1] == 0 && (var19[var14 + 1][var15 - 1] & 0x12C0183) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 - 1] & 0x12C0102) == 0) {
                class212.field3617[var32] = var14 + 1;
                class90.field1535[var32] = var15 - 1;
                class198.field3418[var14 + 1][var15 - 1] = 9;
                class239.field3983[var14 + 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 > 0 && var15 < 103 && class198.field3418[var14 - 1][var15 + 1] == 0 && (var19[var14 - 1][var15 + 1] & 0x12C0138) == 0 && (var19[var14 - 1][var15] & 0x12C0108) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class212.field3617[var32] = var14 - 1;
                class90.field1535[var32] = var15 + 1;
                class198.field3418[var14 - 1][var15 + 1] = 6;
                class239.field3983[var14 - 1][var15 + 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 103 && var15 < 103 && class198.field3418[var14 + 1][var15 + 1] == 0 && (var19[var14 + 1][var15 + 1] & 0x12C01E0) == 0 && (var19[var14 + 1][var15] & 0x12C0180) == 0 && (var19[var14][var15 + 1] & 0x12C0120) == 0) {
                class212.field3617[var32] = var14 + 1;
                class90.field1535[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class198.field3418[var14 + 1][var15 + 1] = 12;
                class239.field3983[var14 + 1][var15 + 1] = var20;
            }
        }
        class160.field2701 = 0;
        if (!var18) {
            if (!arg6) {
                return false;
            }
            int var21 = 1000;
            byte var22 = 10;
            int var23 = 100;
            for (int var24 = arg4 - var22; var24 <= arg4 + var22; var24++) {
                for (int var25 = arg7 - var22; var25 <= arg7 + var22; var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class239.field3983[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg4 > var24) {
                            var26 = arg4 - var24;
                        } else if (var24 > (arg0 + arg4 - 1)) {
                            var26 = -arg0 - (-var24 - 1) - arg4;
                        }
                        int var27 = 0;
                        if (var25 < arg7) {
                            var27 = arg7 - var25;
                        } else if (var25 > arg1 + arg7 - 1) {
                            var27 = var25 + 1 - arg7 - arg1;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var21 > var28 || var21 == var28 && class239.field3983[var24][var25] < var23) {
                            var15 = var25;
                            var14 = var24;
                            var23 = class239.field3983[var24][var25];
                            var21 = var28;
                        }
                    }
                }
            }
            if (var21 == 1000) {
                return false;
            }
            if (arg11 == var14 && arg5 == var15) {
                return false;
            }
            class160.field2701 = 1;
        }
        byte var29 = 0;
        class212.field3617[var29] = var14;
        int var33 = var29 + 1;
        class90.field1535[var29] = var15;
        int var30;
        int var31 = var30 = class198.field3418[var14][var15];
        while (arg11 != var14 || arg5 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class212.field3617[var33] = var14;
                class90.field1535[var33++] = var15;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            var31 = class198.field3418[var14][var15];
        }
        if (var33 > 0) {
            class124.method920(arg3 ^ 0xFFFF8414, arg2, var33);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lrg;I)V", line = 459)
    public static final void method113(class88 arg0, int arg1) {
        class15.field220 = class223.method1564(arg0, 0, true, class124.field2061);
        field321++;
        class252.field4245 = new class273[class15.field220.length];
        class115.field1954 = new class273[class15.field220.length];
        class172.field2847 = new class273[class15.field220.length];
        for (int var2 = 0; var2 < class15.field220.length; var2++) {
            class15.field220[var2].method1910();
            class252.field4245[var2] = class15.field220[var2].method1914();
            class15.field220[var2].method1910();
            class115.field1954[var2] = class15.field220[var2].method1914();
            class15.field220[var2].method1910();
            class172.field2847[var2] = class15.field220[var2].method1914();
            class15.field220[var2].method1910();
        }
        class271.field4681 = class82.method567((byte) 110, 0, arg0, class128.field2111);
        class7.field103 = class274.method1926(-30884, arg0, 0, class191.field3052);
        class59.field894 = class274.method1926(-30884, arg0, 0, class208.field3564);
        class81.field1313 = class274.method1926(-30884, arg0, 0, class96.field1650);
        class24.field368 = class274.method1926(-30884, arg0, 0, class280.field4790);
        class127.field2095 = class59.method362(arg1 ^ 0x312F, class24.field361, arg0, 0);
        class187.field3007 = class59.method362(-200, class58.field888, arg0, 0);
        class314.field5317 = class194.method1391(-112, class56.field875, arg0, 0);
        class37.field569 = class59.method362(-200, class30.field490, arg0, 0);
        class43.field671 = class59.method362(-200, class190.field3037, arg0, 0);
        class194.field3200 = class262.method1830(arg0, class268.field4595, 13035, 0);
        class44.field681 = class262.method1830(arg0, class123.field2048, 13035, 0);
        if (arg1 != -12777) {
            return;
        }
        class6.field82.method503(class44.field681, (int[]) null);
        class102.field1719.method503(class44.field681, (int[]) null);
        class277.field4761.method503(class44.field681, (int[]) null);
        if (class281.field4827) {
            class35.field559 = class223.method1564(arg0, 0, true, class287.field4924);
            for (int var3 = 0; var3 < class35.field559.length; var3++) {
                class35.field559[var3].method1915();
            }
        }
        class83 var4 = class60.method366(class90.field1538, arg0, 0, (byte) -45);
        var4.method583();
        if (class281.field4827) {
            class59.field899 = new class98(var4);
        } else {
            class59.field899 = var4;
        }
        class83[] var5 = class82.method567((byte) 97, 0, arg0, class295.field5069);
        for (int var6 = 0; var6 < var5.length; var6++) {
            var5[var6].method583();
        }
        if (class281.field4827) {
            class275.field4733 = new class269[var5.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class275.field4733[var7] = new class98(var5[var7]);
            }
        } else {
            class275.field4733 = var5;
        }
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 21.0D) - 10;
        int var11 = (int) (Math.random() * 41.0D) - 20;
        for (int var12 = 0; var12 < class271.field4681.length; var12++) {
            class271.field4681[var12].method576(var9 + var11, var8 + var11, var10 + var11);
        }
        class15.field220[0].method1911(var9 + var11, var8 + var11, var10 + var11);
        if (class281.field4827) {
            class60.field928 = new class269[class271.field4681.length];
            for (int var13 = 0; var13 < class271.field4681.length; var13++) {
                class60.field928[var13] = new class98(class271.field4681[var13]);
            }
        } else {
            class60.field928 = class271.field4681;
        }
    }

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "(B)V", line = 587)
    public static void method114(byte arg0) {
        field324 = null;
        field335 = null;
        field322 = null;
        if (arg0 > -19) {
            field323 = -1.5932817F;
        }
        field336 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIII)V", line = 604)
    public static final void method115(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class85.field1369 = class282.field4846 * arg1 / arg3;
        field331++;
        class314.field5334 = -1;
        class59.field897 = -1;
        if (arg0 <= -105) {
            class149.field2520 = class41.field636 * arg4 / arg2;
            class301.method2099(111);
        }
    }
}
