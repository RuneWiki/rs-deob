import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class71 extends class104 {

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "Z")
    public static boolean field1241 = false;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "Le;")
    public static class191 field1251 = class54.method368("Clientscript error in: ", 2047);

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "I")
    public int field1243;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public int field1250;

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "[I")
    public int[] field1242;

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "[I")
    public int[] field1248;

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[I")
    public int[] field1252;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "[Lfa;")
    public class80[] field1246;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "[Lfa;")
    public class80[] field1254;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "[[[B")
    public byte[][][] field1249;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIII)V")
    public static final void method469(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1245++;
        if (arg0 >= -88) {
            field1251 = null;
        }
        for (int var5 = 0; var5 < class239.field4257; var5++) {
            if (class86.field1420[var5] + class97.field1570[var5] > arg3 && class86.field1420[var5] < (arg3 + arg4) && arg2 < (class61.field1108[var5] + class181.field3101[var5]) && (arg1 + arg2) > class181.field3101[var5]) {
                class189.field3324[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(IIII)V")
    public static final void method470(int arg0, int arg1, int arg2, int arg3) {
        class199 var4 = class201.field3608[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class9 var5 = var4.field3541;
        if (var5 != null) {
            var5.field97 = var5.field97 * arg3 / 16;
            var5.field104 = var5.field104 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIIZBII)V")
    public static final void method471(int arg0, int arg1, int arg2, boolean arg3, byte arg4, int arg5, int arg6) {
        field1253++;
        if (class14.field165 == arg5 && class79.field1339 == arg0 && class252.field4461 == arg1 || class188.method1298(10)) {
            return;
        }
        class14.field165 = arg5;
        class79.field1339 = arg0;
        class252.field4461 = arg1;
        if (class188.method1298(10)) {
            class252.field4461 = 0;
        }
        if (arg4 != 76) {
            field1251 = null;
        }
        if (arg3) {
            class188.method1293(28, arg4 ^ 0xFFFF89B1);
        } else {
            class188.method1293(25, -30211);
        }
        class40.method270(true, 0, class233.field4163);
        int var7 = class193.field3474;
        int var8 = class225.field4061;
        class225.field4061 = (arg5 - 6) * 8;
        class193.field3474 = arg0 * 8 - 48;
        class35.field648 = class57.method383(class14.field165 * 8, class79.field1339 * 8, 28908);
        int var9 = class225.field4061 - var8;
        int var10 = class193.field3474 - var7;
        int var11 = class193.field3474;
        int var12 = class225.field4061;
        if (arg3) {
            class197.field3514 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class156 var14 = class115.field1901[var13];
                if (var14 != null) {
                    var14.field2972 -= var10 * 128;
                    var14.field3003 -= var9 * 128;
                    if (var14.field3003 >= 0 && var14.field3003 <= 13184 && var14.field2972 >= 0 && var14.field2972 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field2953[var15] -= var9;
                            var14.field3014[var15] -= var10;
                        }
                        class256.field4542[class197.field3514++] = var13;
                    } else {
                        class115.field1901[var13].field2663 = null;
                        class115.field1901[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class156 var32 = class115.field1901[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field2953[var33] -= var9;
                        var32.field3014[var33] -= var10;
                    }
                    var32.field3003 -= var9 * 128;
                    var32.field2972 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class76 var30 = class245.field4357[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field2953[var31] -= var9;
                    var30.field3014[var31] -= var10;
                }
                var30.field3003 -= var9 * 128;
                var30.field2972 -= var10 * 128;
            }
        }
        class261.field4598 = arg1;
        class175.field2946.method492(arg6, arg2, (byte) -33, false);
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        if (var9 < 0) {
            var18 = 103;
            var19 = -1;
            var20 = -1;
        }
        byte var21 = 104;
        byte var22 = 1;
        byte var23 = 0;
        if (var10 < 0) {
            var23 = 103;
            var22 = -1;
            var21 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var23; var26 != var21; var26 += var22) {
                int var27 = var9 + var24;
                int var28 = var10 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class75.field1281[var29][var24][var26] = class75.field1281[var29][var27][var28];
                    } else {
                        class75.field1281[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class213 var25 = (class213) class129.field2154.method1173(arg4 + 27); var25 != null; var25 = (class213) class129.field2154.method1175(-1)) {
            var25.field3770 -= var9;
            var25.field3767 -= var10;
            if (var25.field3770 < 0 || var25.field3767 < 0 || var25.field3770 >= 104 || var25.field3767 >= 104) {
                var25.method655(arg4 - 13);
            }
        }
        class242.field4303 = -1;
        class249.field4422 = 0;
        if (arg3) {
            class5.field48 -= var9;
            class97.field1550 -= var9;
            class67.field1168 -= var10;
            class164.field2774 -= var10;
        } else {
            class243.field4345 = 1;
        }
        if (class146.field2459 != 0) {
            class22.field317 -= var10;
            class146.field2459 -= var9;
        }
        class149.field2578.method1178(true);
        class91.field1494.method1178(true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V")
    public static final void method472(int arg0, int arg1, int arg2) {
        class35 var3 = class256.method1767(arg2, (byte) -109);
        field1247++;
        int var4 = var3.field646;
        int var5 = var3.field652;
        int var6 = var3.field644;
        int var7 = class161.field2718[var4 - var6];
        if (arg0 > arg1 || arg1 > var7) {
            arg1 = 0;
        }
        int var8 = var7 << var6;
        class53.method357(class158.field2680[var5] & ~var8 | var8 & arg1 << var6, (byte) -95, var5);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(B)V")
    public static void method473(byte arg0) {
        if (arg0 > -8) {
            method472(120, -63, 32);
        }
        field1251 = null;
    }
}
