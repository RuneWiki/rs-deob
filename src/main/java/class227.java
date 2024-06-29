import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class227 {

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "Lli;")
    public static class185 field4138 = class245.method1649("::clientdrop", -62);

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "Z")
    public static boolean field4137 = false;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "Lli;")
    public static class185 field4140 = class245.method1649("<col=ffb000>", 126);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4141;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    public static void method1566(boolean arg0) {
        field4138 = null;
        field4140 = null;
        if (!arg0) {
            field4137 = false;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)V")
    public static final void method1567(boolean arg0, int arg1) {
        if (!arg0) {
            method1568((byte) -75);
        }
        if (arg1 == -1 && !class134.field2405) {
            class156.method1106(-122);
        } else if (arg1 != -1 && (class38.field607 != arg1 || !class134.method952(-66)) && class193.field3568 != 0 && !class134.field2405) {
            class212.method1485(arg1, false, class193.field3568, 2, class181.field3325, 0, false);
        }
        field4141++;
        class38.field607 = arg1;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V")
    public static final void method1568(byte arg0) {
        class52.method332(121);
        field4135++;
        class197.method1419(-1);
        class126.method911(-1);
        class256.method1743((byte) 112);
        class176.method1247((byte) 78);
        class36.method230(true);
        class125.method906(false);
        class204.method1454(0);
        class144.method1033(0);
        class197.method1416(1006);
        class108.method761(true);
        class23.method158(true);
        if (arg0 >= -18) {
            method1568((byte) 47);
        }
        class201.method1435((byte) -56);
        class171.method1216((byte) -37);
        class182.method1283((byte) 106);
        class52.field901.method80(-14113);
        class194.field3581.method80(-14113);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IB)V")
    public static final void method1569(int arg0, byte arg1) {
        field4136++;
        if (!class127.method912(arg0, (byte) -110)) {
            return;
        }
        class82[] var2 = class136.field2557[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class82 var4 = var2[var3];
            if (var4 != null) {
                var4.field1607 = 0;
                var4.field1503 = 0;
            }
        }
        if (arg1 != 15) {
            method1568((byte) -22);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljd;B)V")
    public static final void method1570(class118 arg0, byte arg1) {
        if (arg1 >= -49) {
            field4138 = null;
        }
        field4139++;
        int var2 = class90.field1748 >> 2 << 10;
        int var3 = class63.field1106 >> 1;
        byte[][] var4 = new byte[class56.field971][class125.field2246];
        while (arg0.field2155 < arg0.field2115.length) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (arg0.method867(false) == 1) {
                var35 = arg0.method867(false);
                var34 = true;
                var33 = arg0.method867(false);
            }
            int var36 = arg0.method867(false);
            int var37 = arg0.method867(false);
            int var38 = var36 * 64 - class252.field4481;
            int var39 = class264.field4679 + class125.field2246 - (var37 * 64) - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && class56.field971 > var38 + 63 && var39 < class125.field2246) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var34 || var40 >= (var35 * 8) && (var35 * 8 + 8) > var40 && var33 * 8 <= var42 && (var33 * 8 + 8) > var42) {
                            var41[var39 - var42] = arg0.method838(1275919136);
                        }
                    }
                }
            } else if (var34) {
                arg0.field2155 += 64;
            } else {
                arg0.field2155 += 4096;
            }
        }
        int var5 = class56.field971;
        int var6 = class125.field2246;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class228 var29 = class163.method1170(var28 - 1, false);
                        var7[var13] += var29.field4148;
                        var10[var13] += var29.field4142;
                        var9[var13] += var29.field4147;
                        var8[var13] += var29.field4152;
                        var10002 = var11[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class228 var32 = class163.method1170(var31 - 1, false);
                        var7[var13] -= var32.field4148;
                        var10[var13] -= var32.field4142;
                        var9[var13] -= var32.field4147;
                        var8[var13] -= var32.field4152;
                        var10002 = var11[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class232.field4176[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var6 > var21) {
                        var15 += var7[var21];
                        var18 += var11[var21];
                        var19 += var8[var21];
                        var17 += var9[var21];
                        var16 += var10[var21];
                    }
                    if (var22 >= 0) {
                        var17 -= var9[var22];
                        var19 -= var8[var22];
                        var15 -= var7[var22];
                        var18 -= var11[var22];
                        var16 -= var10[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class255.method1723(var17 / var18, var16 / var18, var15 * 256 / var19, 192);
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
                            int var26 = (var24 + var2 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class220.method1526(var20 << 6, 4032) + class220.method1526(63, var12)] = class167.field3114[class81.method523(96, var26, -25864)];
                        } else if (var23 != null) {
                            var23[(class220.method1526(63, var20) << 6) + class220.method1526(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }
}
