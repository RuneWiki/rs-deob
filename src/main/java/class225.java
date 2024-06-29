import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class225 {

    @OriginalMember(owner = "client!td", name = "q", descriptor = "Lhd;")
    private class128 field3528 = new class128();

    @OriginalMember(owner = "client!td", name = "s", descriptor = "Lsc;")
    private class166 field3530 = new class166();

    @OriginalMember(owner = "client!td", name = "t", descriptor = "I")
    private int field3531;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!td", name = "u", descriptor = "Lue;")
    private class222 field3532;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public static int field3513 = 0;

    @OriginalMember(owner = "client!td", name = "p", descriptor = "Z")
    public static boolean field3527 = false;

    @OriginalMember(owner = "client!td", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3526 = null;

    @OriginalMember(owner = "client!td", name = "r", descriptor = "Z")
    public static boolean field3529 = false;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!td", name = "i", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!td", name = "j", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!td", name = "k", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!td", name = "l", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!td", name = "m", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!td", name = "n", descriptor = "[I")
    public static int[] field3525;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3515;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public final void method1485(boolean arg0) {
        field3514++;
        this.field3530.method1065(0);
        this.field3532.method1456(0);
        if (!arg0) {
            field3513 = 0;
        }
        this.field3528 = new class128();
        this.field3531 = this.field3533;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(JI)Lhd;")
    public final class128 method1486(long arg0, int arg1) {
        field3517++;
        if (arg1 != -19212) {
            this.field3530 = null;
        }
        class128 var4 = (class128) this.field3532.method1453(true, arg0);
        if (var4 != null) {
            this.field3530.method1068(var4, (byte) -45);
        }
        return var4;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1487(String arg0, byte arg1) {
        field3523++;
        if (arg0 == null) {
            return false;
        }
        if (arg1 > -101) {
            field3513 = -19;
        }
        for (int var2 = 0; var2 < class256.field4092; var2++) {
            if (arg0.equalsIgnoreCase(class16.field286[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class161.field2243[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method1488(int arg0, int arg1) {
        field3518++;
        int var2 = class27.field423;
        int var3 = class178.field2603;
        int var4 = class188.field2848;
        int var5 = (int) class160.field2239;
        if (var5 < (class161.field2251 / 256)) {
            var5 = class161.field2251 / 256;
        }
        if (class72.field1040[4] && class307.field4937[4] + 128 > var5) {
            var5 = class307.field4937[4] + 128;
        }
        int var6 = class246.field3870;
        int var7 = (int) class123.field1743 + class302.field4805 & 0x7FF;
        int var8 = class277.field4407;
        class105.method669(arg0 ^ 0xFFFFBA63, arg1, class58.method360(class250.field3905.field4140, class250.field3905.field4081, false, class166.field2364) - 50, class250.field3906, var5, class21.field341, var5 * 3 + 600, var7);
        if (class178.field2603 == var3 && class27.field423 == var2 && class188.field2848 == var4 && class277.field4407 == var8 && class246.field3870 == var6) {
            class12.field203 = 1;
            return;
        }
        class105.field1513 = 10;
        class180.field2739 = 10;
        class292.field4670 = arg0;
        if (var8 < class277.field4407) {
            var8 += (class277.field4407 - var8) * class105.field1513 / 1000 + class292.field4670;
            if (class277.field4407 > var8) {
                class277.field4407 = var8;
            }
        }
        if (class277.field4407 < var8) {
            int var9 = var8 - ((var8 - class277.field4407) * class105.field1513 / 1000 + class292.field4670);
            if (class277.field4407 < var9) {
                class277.field4407 = var9;
            }
        }
        class38.field577 = 10;
        if (class188.field2848 > var4) {
            var4 += (class188.field2848 - var4) * class180.field2739 / 1000 + class38.field577;
            if (var4 < class188.field2848) {
                class188.field2848 = var4;
            }
        }
        if (var2 < class27.field423) {
            var2 += (class27.field423 - var2) * class180.field2739 / 1000 + class38.field577;
            if (class27.field423 > var2) {
                class27.field423 = var2;
            }
        }
        if (class178.field2603 > var3) {
            var3 += (class178.field2603 - var3) * class180.field2739 / 1000 + class38.field577;
            if (class178.field2603 > var3) {
                class178.field2603 = var3;
            }
        }
        if (class27.field423 < var2) {
            int var10 = var2 - ((var2 - class27.field423) * class180.field2739 / 1000 + class38.field577);
            if (class27.field423 < var10) {
                class27.field423 = var10;
            }
        }
        if (class178.field2603 < var3) {
            int var11 = var3 - (class38.field577 + ((var3 - class178.field2603) * class180.field2739 / 1000));
            if (class178.field2603 < var11) {
                class178.field2603 = var11;
            }
        }
        int var12 = class246.field3870 - var6;
        if (class188.field2848 < var4) {
            int var13 = var4 - ((var4 - class188.field2848) * class180.field2739 / 1000 + class38.field577);
            if (class188.field2848 < var13) {
                class188.field2848 = var13;
            }
        }
        if (var12 > 1024) {
            var12 -= 2048;
        }
        if (var12 < -1024) {
            var12 += 2048;
        }
        if (var12 > 0) {
            int var14 = class105.field1513 * var12 / 1000 + class292.field4670 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var12 < 0) {
            int var15 = var6 - (class292.field4670 + (-var12 * class105.field1513 / 1000));
            var6 = var15 & 0x7FF;
        }
        int var16 = class246.field3870 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var12 <= 0 || var16 > 0 && var12 < 0) {
            class246.field3870 = var6;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(JILhd;)V")
    public final void method1489(long arg0, int arg1, class128 arg2) {
        if (arg1 < 99) {
            return;
        }
        field3519++;
        if (this.field3531 == 0) {
            class128 var5 = this.field3530.method1063((byte) -62);
            var5.method962(128);
            var5.method819((byte) -12);
            if (this.field3528 == var5) {
                class128 var6 = this.field3530.method1063((byte) -119);
                var6.method962(128);
                var6.method819((byte) -12);
            }
        } else {
            this.field3531--;
        }
        this.field3532.method1452(arg0, arg2, 0);
        this.field3530.method1068(arg2, (byte) -45);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1490(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0) {
            method1490(false, -3, -59, -116, -85, 50);
        }
        field3516++;
        int var6 = arg4 - arg5;
        int var7 = arg3 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class192.method1219(arg3, arg2, arg5, -1, arg1);
            }
        } else if (var7 == 0) {
            class263.method1708(arg1, arg2, arg4, -902108468, arg5);
        } else {
            if (var7 < 0) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = var7 > var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg1;
                arg1 = var9;
                int var10 = arg4;
                arg4 = arg3;
                arg3 = var10;
            }
            if (arg5 > arg4) {
                int var11 = arg1;
                arg1 = arg3;
                arg3 = var11;
                int var12 = arg5;
                arg5 = arg4;
                arg4 = var12;
            }
            int var13 = arg3 <= arg1 ? -1 : 1;
            int var14 = arg4 - arg5;
            int var15 = arg1;
            int var16 = arg3 - arg1;
            if (var16 < 0) {
                var16 = -var16;
            }
            int var17 = -(var14 >> 1);
            if (var8) {
                for (int var19 = arg5; var19 <= arg4; var19++) {
                    class247.field3876[var19][var15] = arg2;
                    var17 += var16;
                    if (var17 > 0) {
                        var15 += var13;
                        var17 -= var14;
                    }
                }
            } else {
                for (int var18 = arg5; var18 <= arg4; var18++) {
                    class247.field3876[var15][var18] = arg2;
                    var17 += var16;
                    if (var17 > 0) {
                        var17 -= var14;
                        var15 += var13;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILaa;I)V")
    public static final void method1491(int arg0, class43 arg1, int arg2) {
        int var3 = 0;
        class112.field1614 = 0;
        field3520++;
        int var4 = -1;
        int[] var5 = arg1.field650;
        if (arg2 != 28670) {
            return;
        }
        int var6 = 0;
        byte var7 = -1;
        int[] var8 = arg1.field652;
        try {
            int var9 = 0;
            label4119: while (true) {
                var9++;
                if (arg0 < var9) {
                    throw new RuntimeException("slow");
                }
                var4++;
                int var538 = var5[var4];
                if (var538 < 100) {
                    if (var538 == 0) {
                        class13.field212[var3++] = var8[var4];
                        continue;
                    }
                    if (var538 == 1) {
                        int var10 = var8[var4];
                        class13.field212[var3++] = class189.field2864[var10];
                        continue;
                    }
                    if (var538 == 2) {
                        int var11 = var8[var4];
                        var3--;
                        class233.method1529(0, var11, class13.field212[var3]);
                        continue;
                    }
                    if (var538 == 3) {
                        class309.field4963[var6++] = arg1.field636[var4];
                        continue;
                    }
                    if (var538 == 6) {
                        var4 += var8[var4];
                        continue;
                    }
                    if (var538 == 7) {
                        var3 -= 2;
                        if (class13.field212[var3 + 1] != class13.field212[var3]) {
                            var4 += var8[var4];
                        }
                        continue;
                    }
                    if (var538 == 8) {
                        var3 -= 2;
                        if (class13.field212[var3 + 1] == class13.field212[var3]) {
                            var4 += var8[var4];
                        }
                        continue;
                    }
                    if (var538 == 9) {
                        var3 -= 2;
                        if (class13.field212[var3] < class13.field212[var3 + 1]) {
                            var4 += var8[var4];
                        }
                        continue;
                    }
                    if (var538 == 10) {
                        var3 -= 2;
                        if (class13.field212[var3 + 1] < class13.field212[var3]) {
                            var4 += var8[var4];
                        }
                        continue;
                    }
                    if (var538 == 21) {
                        if (class112.field1614 == 0) {
                            return;
                        }
                        class47 var12 = class236.field3671[--class112.field1614];
                        var4 = var12.field680;
                        class211.field3148 = var12.field676;
                        class131.field1823 = var12.field679;
                        arg1 = var12.field674;
                        var8 = arg1.field652;
                        var5 = arg1.field650;
                        continue;
                    }
                    if (var538 == 25) {
                        int var13 = var8[var4];
                        class13.field212[var3++] = class194.method1226(var13, false);
                        continue;
                    }
                    if (var538 == 27) {
                        int var14 = var8[var4];
                        var3--;
                        class284.method1865(class13.field212[var3], var14, 0);
                        continue;
                    }
                    if (var538 == 31) {
                        var3 -= 2;
                        if (class13.field212[var3 + 1] >= class13.field212[var3]) {
                            var4 += var8[var4];
                        }
                        continue;
                    }
                    if (var538 == 32) {
                        var3 -= 2;
                        if (class13.field212[var3 + 1] <= class13.field212[var3]) {
                            var4 += var8[var4];
                        }
                        continue;
                    }
                    if (var538 == 33) {
                        class13.field212[var3++] = class211.field3148[var8[var4]];
                        continue;
                    }
                    int var10001;
                    if (var538 == 34) {
                        var10001 = var8[var4];
                        var3--;
                        class211.field3148[var10001] = class13.field212[var3];
                        continue;
                    }
                    if (var538 == 35) {
                        class309.field4963[var6++] = class131.field1823[var8[var4]];
                        continue;
                    }
                    if (var538 == 36) {
                        var10001 = var8[var4];
                        var6--;
                        class131.field1823[var10001] = class309.field4963[var6];
                        continue;
                    }
                    if (var538 == 37) {
                        int var15 = var8[var4];
                        var6 -= var15;
                        String var16 = class283.method1864(arg2 ^ 0x6FFE, var15, class309.field4963, var6);
                        class309.field4963[var6++] = var16;
                        continue;
                    }
                    if (var538 == 38) {
                        var3--;
                        continue;
                    }
                    if (var538 == 39) {
                        var6--;
                        continue;
                    }
                    if (var538 == 40) {
                        int var17 = var8[var4];
                        class43 var18 = class119.method775(var17, -18331);
                        int[] var19 = new int[var18.field648];
                        String[] var20 = new String[var18.field642];
                        for (int var21 = 0; var21 < var18.field656; var21++) {
                            var19[var21] = class13.field212[var3 - (var18.field656 - var21)];
                        }
                        for (int var22 = 0; var22 < var18.field644; var22++) {
                            var20[var22] = class309.field4963[var22 + var6 - var18.field644];
                        }
                        var6 -= var18.field644;
                        var3 -= var18.field656;
                        class47 var23 = new class47();
                        var23.field680 = var4;
                        var23.field674 = arg1;
                        var23.field676 = class211.field3148;
                        var23.field679 = class131.field1823;
                        if (class236.field3671.length <= class112.field1614) {
                            throw new RuntimeException();
                        }
                        class236.field3671[class112.field1614++] = var23;
                        class211.field3148 = var19;
                        var4 = -1;
                        class131.field1823 = var20;
                        arg1 = var18;
                        var5 = var18.field650;
                        var8 = var18.field652;
                        continue;
                    }
                    if (var538 == 42) {
                        class13.field212[var3++] = class301.field4791[var8[var4]];
                        continue;
                    }
                    if (var538 == 43) {
                        int var24 = var8[var4];
                        var3--;
                        class301.field4791[var24] = class13.field212[var3];
                        class93.method600(83, var24);
                        continue;
                    }
                    if (var538 == 44) {
                        int var25 = var8[var4] >> 16;
                        int var26 = var8[var4] & 0xFFFF;
                        var3--;
                        int var27 = class13.field212[var3];
                        if (var27 >= 0 && var27 <= 5000) {
                            class258.field4176[var25] = var27;
                            byte var28 = -1;
                            if (var26 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var27) {
                                    continue label4119;
                                }
                                class124.field1752[var25][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 45) {
                        int var30 = var8[var4];
                        var3--;
                        int var31 = class13.field212[var3];
                        if (var31 >= 0 && var31 < class258.field4176[var30]) {
                            class13.field212[var3++] = class124.field1752[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 46) {
                        var3 -= 2;
                        int var32 = class13.field212[var3];
                        int var33 = var8[var4];
                        if (var32 >= 0 && var32 < class258.field4176[var33]) {
                            class124.field1752[var33][var32] = class13.field212[var3 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var538 == 47) {
                        String var34 = class15.field282[var8[var4]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class309.field4963[var6++] = var34;
                        continue;
                    }
                    if (var538 == 48) {
                        int var35 = var8[var4];
                        var6--;
                        class15.field282[var35] = class309.field4963[var6];
                        class295.method1979(var35, arg2 - 28798);
                        continue;
                    }
                    if (var538 == 51) {
                        class222 var36 = arg1.field655[var8[var4]];
                        var3--;
                        class313 var37 = (class313) var36.method1453(true, (long) class13.field212[var3]);
                        if (var37 != null) {
                            var4 += var37.field5027;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var8[var4] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                int var10000;
                if (var538 < 300) {
                    if (var538 == 100) {
                        var3 -= 3;
                        int var39 = class13.field212[var3 + 1];
                        int var40 = class13.field212[var3];
                        int var41 = class13.field212[var3 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class178 var42 = class166.method1057(-122, var40);
                        if (var42.field2642 == null) {
                            var42.field2642 = new class178[var41 + 1];
                        }
                        if (var41 >= var42.field2642.length) {
                            class178[] var43 = new class178[var41 + 1];
                            for (int var44 = 0; var44 < var42.field2642.length; var44++) {
                                var43[var44] = var42.field2642[var44];
                            }
                            var42.field2642 = var43;
                        }
                        if (var41 > 0 && var42.field2642[var41 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var41 - 1));
                        }
                        class178 var45 = new class178();
                        var45.field2608 = var39;
                        var45.field2576 = var41;
                        var45.field2675 = var45.field2545 = var42.field2545;
                        var45.field2611 = true;
                        var42.field2642[var41] = var45;
                        if (var38) {
                            class224.field3487 = var45;
                        } else {
                            class313.field5028 = var45;
                        }
                        class312.method2108(false, var42);
                        continue;
                    }
                    if (var538 == 101) {
                        class178 var46 = var38 ? class224.field3487 : class313.field5028;
                        if (var46.field2576 == -1) {
                            if (var38) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class178 var47 = class166.method1057(arg2 ^ 0xFFFF906A, var46.field2545);
                        var47.field2642[var46.field2576] = null;
                        class312.method2108(false, var47);
                        continue;
                    }
                    if (var538 == 102) {
                        var10000 = arg2 - 28764;
                        var3--;
                        class178 var48 = class166.method1057(var10000, class13.field212[var3]);
                        var48.field2642 = null;
                        class312.method2108(false, var48);
                        continue;
                    }
                    if (var538 == 200) {
                        var3 -= 2;
                        int var49 = class13.field212[var3 + 1];
                        int var50 = class13.field212[var3];
                        class178 var51 = class14.method96(-1, var50, var49);
                        if (var51 != null && var49 != -1) {
                            class13.field212[var3++] = 1;
                            if (var38) {
                                class224.field3487 = var51;
                            } else {
                                class313.field5028 = var51;
                            }
                            continue;
                        }
                        class13.field212[var3++] = 0;
                        continue;
                    }
                    if (var538 == 201) {
                        var3--;
                        int var52 = class13.field212[var3];
                        class178 var53 = class166.method1057(arg2 - 28771, var52);
                        if (var53 == null) {
                            class13.field212[var3++] = 0;
                        } else {
                            class13.field212[var3++] = 1;
                            if (var38) {
                                class224.field3487 = var53;
                            } else {
                                class313.field5028 = var53;
                            }
                        }
                        continue;
                    }
                } else if (var538 < 500) {
                    if (var538 == 403) {
                        var3 -= 2;
                        int var54 = class13.field212[var3];
                        int var55 = class13.field212[var3 + 1];
                        for (int var56 = 0; var56 < class91.field1321.length; var56++) {
                            if (class91.field1321[var56] == var54) {
                                class250.field3905.field5066.method453(arg2 - 28798, var56, var55);
                                continue label4119;
                            }
                        }
                        int var57 = 0;
                        while (true) {
                            if (class81.field1120.length <= var57) {
                                continue label4119;
                            }
                            if (class81.field1120[var57] == var54) {
                                class250.field3905.field5066.method453(-128, var57, var55);
                                continue label4119;
                            }
                            var57++;
                        }
                    }
                    if (var538 == 404) {
                        var3 -= 2;
                        int var58 = class13.field212[var3];
                        int var59 = class13.field212[var3 + 1];
                        class250.field3905.field5066.method459(var58, (byte) -54, var59);
                        continue;
                    }
                    if (var538 == 410) {
                        var3--;
                        boolean var60 = class13.field212[var3] != 0;
                        class250.field3905.field5066.method458((byte) -38, var60);
                        continue;
                    }
                } else if (!(var538 < 1000 || var538 >= 1100) || !(var538 < 2000 || var538 >= 2100)) {
                    class178 var61;
                    if (var538 < 2000) {
                        var61 = var38 ? class224.field3487 : class313.field5028;
                    } else {
                        var3--;
                        var61 = class166.method1057(116, class13.field212[var3]);
                        var538 -= 1000;
                    }
                    if (var538 == 1000) {
                        var3 -= 4;
                        var61.field2677 = class13.field212[var3];
                        var61.field2598 = class13.field212[var3 + 1];
                        int var62 = class13.field212[var3 + 3];
                        int var63 = class13.field212[var3 + 2];
                        if (var62 < 0) {
                            var62 = 0;
                        } else if (var62 > 5) {
                            var62 = 5;
                        }
                        if (var63 < 0) {
                            var63 = 0;
                        } else if (var63 > 5) {
                            var63 = 5;
                        }
                        var61.field2636 = (byte) var62;
                        var61.field2657 = (byte) var63;
                        class312.method2108(false, var61);
                        class8.method44(var61, false);
                        if (var61.field2576 == -1) {
                            class101.method647(arg2 ^ 0xFFFFA8C9, var61.field2545);
                        }
                        continue;
                    }
                    if (var538 == 1001) {
                        var3 -= 4;
                        var61.field2530 = class13.field212[var3];
                        var61.field2660 = class13.field212[var3 + 1];
                        var61.field2646 = 0;
                        var61.field2589 = 0;
                        int var64 = class13.field212[var3 + 3];
                        int var65 = class13.field212[var3 + 2];
                        if (var64 < 0) {
                            var64 = 0;
                        } else if (var64 > 4) {
                            var64 = 4;
                        }
                        if (var65 < 0) {
                            var65 = 0;
                        } else if (var65 > 4) {
                            var65 = 4;
                        }
                        var61.field2537 = (byte) var64;
                        var61.field2621 = (byte) var65;
                        class312.method2108(false, var61);
                        class8.method44(var61, false);
                        if (var61.field2608 == 0) {
                            class141.method890(false, (byte) 112, var61);
                        }
                        continue;
                    }
                    if (var538 == 1003) {
                        var3--;
                        boolean var66 = class13.field212[var3] == 1;
                        if (var66 != var61.field2648) {
                            var61.field2648 = var66;
                            class312.method2108(false, var61);
                        }
                        if (var61.field2576 == -1) {
                            class308.method2095(var61.field2545, 1);
                        }
                        continue;
                    }
                    if (var538 == 1004) {
                        var3 -= 2;
                        var61.field2706 = class13.field212[var3];
                        var61.field2606 = class13.field212[var3 + 1];
                        class312.method2108(false, var61);
                        class8.method44(var61, false);
                        if (var61.field2608 == 0) {
                            class141.method890(false, (byte) 117, var61);
                        }
                        continue;
                    }
                    if (var538 == 1005) {
                        var3--;
                        var61.field2689 = class13.field212[var3] == 1;
                        continue;
                    }
                } else if (var538 >= 1100 && var538 < 1200 || var538 >= 2100 && var538 < 2200) {
                    class178 var528;
                    if (var538 < 2000) {
                        var528 = var38 ? class224.field3487 : class313.field5028;
                    } else {
                        var538 -= 1000;
                        var10000 = arg2 - 28780;
                        var3--;
                        var528 = class166.method1057(var10000, class13.field212[var3]);
                    }
                    if (var538 == 1100) {
                        var3 -= 2;
                        var528.field2644 = class13.field212[var3];
                        if (var528.field2644 > (var528.field2556 - var528.field2529)) {
                            var528.field2644 = var528.field2556 - var528.field2529;
                        }
                        if (var528.field2644 < 0) {
                            var528.field2644 = 0;
                        }
                        var528.field2701 = class13.field212[var3 + 1];
                        if (var528.field2701 > var528.field2579 - var528.field2571) {
                            var528.field2701 = var528.field2579 - var528.field2571;
                        }
                        if (var528.field2701 < 0) {
                            var528.field2701 = 0;
                        }
                        class312.method2108(false, var528);
                        if (var528.field2576 == -1) {
                            class157.method971(var528.field2545, true);
                        }
                        continue;
                    }
                    if (var538 == 1101) {
                        var3--;
                        var528.field2544 = class13.field212[var3];
                        class312.method2108(false, var528);
                        if (var528.field2576 == -1) {
                            class277.method1803(var528.field2545, 30153);
                        }
                        continue;
                    }
                    if (var538 == 1102) {
                        var3--;
                        var528.field2676 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1103) {
                        var3--;
                        var528.field2695 = class13.field212[var3];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1104) {
                        var3--;
                        var528.field2668 = class13.field212[var3];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1105) {
                        var3--;
                        int var529 = class13.field212[var3];
                        if (var528.field2649 != var529) {
                            var528.field2649 = var529;
                            class312.method2108(false, var528);
                        }
                        if (var528.field2576 == -1) {
                            class223.method1467(var528.field2545, -103);
                        }
                        continue;
                    }
                    if (var538 == 1106) {
                        var3--;
                        var528.field2584 = class13.field212[var3];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1107) {
                        var3--;
                        var528.field2551 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1108) {
                        var528.field2581 = 1;
                        var3--;
                        var528.field2693 = class13.field212[var3];
                        class312.method2108(false, var528);
                        if (var528.field2576 == -1) {
                            class18.method125(var528.field2545, 4);
                        }
                        continue;
                    }
                    if (var538 == 1109) {
                        var3 -= 6;
                        var528.field2577 = class13.field212[var3];
                        var528.field2613 = class13.field212[var3 + 1];
                        var528.field2627 = class13.field212[var3 + 2];
                        var528.field2569 = class13.field212[var3 + 3];
                        var528.field2625 = class13.field212[var3 + 4];
                        var528.field2682 = class13.field212[var3 + 5];
                        class312.method2108(false, var528);
                        if (var528.field2576 == -1) {
                            class120.method776(false, var528.field2545);
                            class263.method1711(var528.field2545, 79);
                        }
                        continue;
                    }
                    if (var538 == 1110) {
                        var3--;
                        int var530 = class13.field212[var3];
                        if (var528.field2558 != var530) {
                            var528.field2566 = 0;
                            var528.field2558 = var530;
                            var528.field2681 = 1;
                            var528.field2562 = 0;
                            class312.method2108(false, var528);
                        }
                        if (var528.field2576 == -1) {
                            class312.method2110(var528.field2545, 5);
                        }
                        continue;
                    }
                    if (var538 == 1111) {
                        var3--;
                        var528.field2628 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1112) {
                        var6--;
                        String var531 = class309.field4963[var6];
                        if (!var531.equals(var528.field2630)) {
                            var528.field2630 = var531;
                            class312.method2108(false, var528);
                        }
                        if (var528.field2576 == -1) {
                            class254.method1654(var528.field2545, -58);
                        }
                        continue;
                    }
                    if (var538 == 1113) {
                        var3--;
                        var528.field2623 = class13.field212[var3];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1114) {
                        var3 -= 3;
                        var528.field2595 = class13.field212[var3];
                        var528.field2536 = class13.field212[var3 + 1];
                        var528.field2575 = class13.field212[var3 + 2];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1115) {
                        var3--;
                        var528.field2645 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1116) {
                        var3--;
                        var528.field2650 = class13.field212[var3];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1117) {
                        var3--;
                        var528.field2640 = class13.field212[var3];
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1118) {
                        var3--;
                        var528.field2643 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1119) {
                        var3--;
                        var528.field2659 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1120) {
                        var3 -= 2;
                        var528.field2556 = class13.field212[var3];
                        var528.field2579 = class13.field212[var3 + 1];
                        class312.method2108(false, var528);
                        if (var528.field2608 == 0) {
                            class141.method890(false, (byte) 120, var528);
                        }
                        continue;
                    }
                    if (var538 == 1121) {
                        var3 -= 2;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1122) {
                        var3--;
                        var528.field2616 = class13.field212[var3] == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                    if (var538 == 1123) {
                        var3--;
                        var528.field2682 = class13.field212[var3];
                        class312.method2108(false, var528);
                        if (var528.field2576 == -1) {
                            class120.method776(false, var528.field2545);
                        }
                        continue;
                    }
                    if (var538 == 1124) {
                        var3--;
                        int var532 = class13.field212[var3];
                        var528.field2622 = var532 == 1;
                        class312.method2108(false, var528);
                        continue;
                    }
                } else if (!(var538 < 1200 || var538 >= 1300) || !(var538 < 2200 || var538 >= 2300)) {
                    class178 var67;
                    if (var538 < 2000) {
                        var67 = var38 ? class224.field3487 : class313.field5028;
                    } else {
                        var3--;
                        var67 = class166.method1057(63, class13.field212[var3]);
                        var538 -= 1000;
                    }
                    class312.method2108(false, var67);
                    if (var538 == 1200 || var538 == 1205 || var538 == 1208 || var538 == 1209) {
                        var3 -= 2;
                        int var68 = class13.field212[var3];
                        int var69 = class13.field212[var3 + 1];
                        if (var67.field2576 == -1) {
                            class14.method97(var67.field2545, -75);
                            class120.method776(false, var67.field2545);
                            class263.method1711(var67.field2545, -70);
                        }
                        if (var68 == -1) {
                            var67.field2581 = 1;
                            var67.field2560 = -1;
                            var67.field2693 = -1;
                            continue;
                        }
                        if (var538 == 1208 || var538 == 1209) {
                            var67.field2639 = true;
                        } else {
                            var67.field2639 = false;
                        }
                        var67.field2560 = var68;
                        var67.field2629 = var69;
                        class10 var70 = class281.method1822((byte) -108, var68);
                        var67.field2613 = var70.field126;
                        var67.field2577 = var70.field133;
                        var67.field2625 = var70.field176;
                        if (var538 == 1205) {
                            var67.field2563 = false;
                        } else {
                            var67.field2563 = true;
                        }
                        var67.field2682 = var70.field123;
                        if (var67.field2589 > 0) {
                            var67.field2682 = var67.field2682 * 32 / var67.field2589;
                        } else if (var67.field2530 > 0) {
                            var67.field2682 = var67.field2682 * 32 / var67.field2530;
                        }
                        var67.field2569 = var70.field149;
                        var67.field2627 = var70.field110;
                        continue;
                    }
                    if (var538 == 1201) {
                        var67.field2581 = 2;
                        var3--;
                        var67.field2693 = class13.field212[var3];
                        if (var67.field2576 == -1) {
                            class18.method125(var67.field2545, 4);
                        }
                        continue;
                    }
                    if (var538 == 1202) {
                        var67.field2581 = 3;
                        var67.field2693 = class250.field3905.field5066.method456((byte) -123);
                        if (var67.field2576 == -1) {
                            class18.method125(var67.field2545, 4);
                        }
                        continue;
                    }
                    if (var538 == 1203) {
                        var67.field2581 = 6;
                        var3--;
                        var67.field2693 = class13.field212[var3];
                        if (var67.field2576 == -1) {
                            class18.method125(var67.field2545, 4);
                        }
                        continue;
                    }
                    if (var538 == 1204) {
                        var67.field2581 = 5;
                        var3--;
                        var67.field2693 = class13.field212[var3];
                        if (var67.field2576 == -1) {
                            class18.method125(var67.field2545, arg2 - 28666);
                        }
                        continue;
                    }
                    if (var538 == 1206) {
                        var3 -= 4;
                        var67.field2663 = class13.field212[var3];
                        var67.field2604 = class13.field212[var3 + 1];
                        var67.field2619 = class13.field212[var3 + 2];
                        var67.field2588 = class13.field212[var3 + 3];
                        class312.method2108(false, var67);
                        continue;
                    }
                    if (var538 == 1207) {
                        var3 -= 2;
                        var67.field2703 = class13.field212[var3];
                        var67.field2600 = class13.field212[var3 + 1];
                        class312.method2108(false, var67);
                        continue;
                    }
                    if (var538 == 1211) {
                        var67.field2693 = 2047;
                        var67.field2581 = 5;
                        var67.field2635 = 0;
                        if (var67.field2576 == -1) {
                            class18.method125(var67.field2545, arg2 ^ 0x6FFA);
                        }
                        continue;
                    }
                } else if (var538 >= 1300 && var538 < 1400 || var538 >= 2300 && var538 < 2400) {
                    class178 var71;
                    if (var538 >= 2000) {
                        var538 -= 1000;
                        var3--;
                        var71 = class166.method1057(-100, class13.field212[var3]);
                    } else {
                        var71 = var38 ? class224.field3487 : class313.field5028;
                    }
                    if (var538 == 1300) {
                        var3--;
                        int var72 = class13.field212[var3] - 1;
                        if (var72 >= 0 && var72 <= 9) {
                            var6--;
                            var71.method1128(class309.field4963[var6], (byte) 19, var72);
                            continue;
                        }
                        var6--;
                        continue;
                    }
                    if (var538 == 1301) {
                        var3 -= 2;
                        int var73 = class13.field212[var3 + 1];
                        int var74 = class13.field212[var3];
                        var71.field2666 = class14.method96(-1, var74, var73);
                        continue;
                    }
                    if (var538 == 1302) {
                        var3--;
                        var71.field2658 = class13.field212[var3] == 1;
                        continue;
                    }
                    if (var538 == 1303) {
                        var3--;
                        var71.field2700 = class13.field212[var3];
                        continue;
                    }
                    if (var538 == 1304) {
                        var3--;
                        var71.field2687 = class13.field212[var3];
                        continue;
                    }
                    if (var538 == 1305) {
                        var6--;
                        var71.field2533 = class309.field4963[var6];
                        continue;
                    }
                    if (var538 == 1306) {
                        var6--;
                        var71.field2685 = class309.field4963[var6];
                        continue;
                    }
                    if (var538 == 1307) {
                        var71.field2580 = null;
                        continue;
                    }
                    if (var538 == 1308) {
                        var3--;
                        var71.field2653 = class13.field212[var3];
                        var3--;
                        var71.field2697 = class13.field212[var3];
                        continue;
                    }
                    if (var538 == 1309) {
                        var3--;
                        int var75 = class13.field212[var3];
                        var3--;
                        int var76 = class13.field212[var3];
                        if (var76 >= 1 && var76 <= 10) {
                            var71.method1129(-99, var76 - 1, var75);
                        }
                        continue;
                    }
                    if (var538 == 1310) {
                        var6--;
                        var71.field2705 = class309.field4963[var6];
                        continue;
                    }
                } else {
                    if (var538 >= 1400 && var538 < 1500 || var538 >= 2400 && var538 < 2500) {
                        class178 var521;
                        if (var538 < 2000) {
                            var521 = var38 ? class224.field3487 : class313.field5028;
                        } else {
                            var3--;
                            var521 = class166.method1057(-118, class13.field212[var3]);
                            var538 -= 1000;
                        }
                        var6--;
                        String var522 = class309.field4963[var6];
                        int[] var523 = null;
                        if (var522.length() > 0 && var522.charAt(var522.length() - 1) == 'Y') {
                            var3--;
                            int var524 = class13.field212[var3];
                            if (var524 > 0) {
                                var523 = new int[var524];
                                while ((var524--) > 0) {
                                    var3--;
                                    var523[var524] = class13.field212[var3];
                                }
                            }
                            var522 = var522.substring(0, var522.length() - 1);
                        }
                        Object[] var525 = new Object[var522.length() + 1];
                        for (int var526 = var525.length - 1; var526 >= 1; var526--) {
                            if (var522.charAt(var526 - 1) == 's') {
                                var6--;
                                var525[var526] = class309.field4963[var6];
                            } else {
                                var3--;
                                var525[var526] = Integer.valueOf(class13.field212[var3]);
                            }
                        }
                        var3--;
                        int var527 = class13.field212[var3];
                        if (var527 == -1) {
                            var525 = null;
                        } else {
                            var525[0] = Integer.valueOf(var527);
                        }
                        if (var538 == 1400) {
                            var521.field2553 = var525;
                        } else if (var538 == 1401) {
                            var521.field2546 = var525;
                        } else if (var538 == 1402) {
                            var521.field2662 = var525;
                        } else if (var538 == 1403) {
                            var521.field2698 = var525;
                        } else if (var538 == 1404) {
                            var521.field2683 = var525;
                        } else if (var538 == 1405) {
                            var521.field2655 = var525;
                        } else if (var538 == 1406) {
                            var521.field2684 = var525;
                        } else if (var538 == 1407) {
                            var521.field2614 = var523;
                            var521.field2525 = var525;
                        } else if (var538 == 1408) {
                            var521.field2656 = var525;
                        } else if (var538 == 1409) {
                            var521.field2641 = var525;
                        } else if (var538 == 1410) {
                            var521.field2670 = var525;
                        } else if (var538 == 1411) {
                            var521.field2615 = var525;
                        } else if (var538 == 1412) {
                            var521.field2612 = var525;
                        } else if (var538 == 1414) {
                            var521.field2585 = var525;
                            var521.field2557 = var523;
                        } else if (var538 == 1415) {
                            var521.field2686 = var523;
                            var521.field2647 = var525;
                        } else if (var538 == 1416) {
                            var521.field2690 = var525;
                        } else if (var538 == 1417) {
                            var521.field2567 = var525;
                        } else if (var538 == 1418) {
                            var521.field2620 = var525;
                        } else if (var538 == 1419) {
                            var521.field2582 = var525;
                        } else if (var538 == 1420) {
                            var521.field2602 = var525;
                        } else if (var538 == 1421) {
                            var521.field2664 = var525;
                        } else if (var538 == 1422) {
                            var521.field2561 = var525;
                        } else if (var538 == 1423) {
                            var521.field2671 = var525;
                        } else if (var538 == 1424) {
                            var521.field2539 = var525;
                        } else if (var538 == 1425) {
                            var521.field2652 = var525;
                        } else if (var538 == 1426) {
                            var521.field2599 = var525;
                        } else if (var538 == 1427) {
                            var521.field2548 = var525;
                        } else if (var538 == 1428) {
                            var521.field2591 = var525;
                            var521.field2638 = var523;
                        } else if (var538 == 1429) {
                            var521.field2637 = var525;
                            var521.field2538 = var523;
                        }
                        var521.field2574 = true;
                        continue;
                    }
                    if (var538 < 1600) {
                        class178 var520 = var38 ? class224.field3487 : class313.field5028;
                        if (var538 == 1500) {
                            class13.field212[var3++] = var520.field2667;
                            continue;
                        }
                        if (var538 == 1501) {
                            class13.field212[var3++] = var520.field2554;
                            continue;
                        }
                        if (var538 == 1502) {
                            class13.field212[var3++] = var520.field2529;
                            continue;
                        }
                        if (var538 == 1503) {
                            class13.field212[var3++] = var520.field2571;
                            continue;
                        }
                        if (var538 == 1504) {
                            class13.field212[var3++] = var520.field2648 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 1505) {
                            class13.field212[var3++] = var520.field2675;
                            continue;
                        }
                    } else if (var538 < 1700) {
                        class178 var77 = var38 ? class224.field3487 : class313.field5028;
                        if (var538 == 1600) {
                            class13.field212[var3++] = var77.field2644;
                            continue;
                        }
                        if (var538 == 1601) {
                            class13.field212[var3++] = var77.field2701;
                            continue;
                        }
                        if (var538 == 1602) {
                            class309.field4963[var6++] = var77.field2630;
                            continue;
                        }
                        if (var538 == 1603) {
                            class13.field212[var3++] = var77.field2556;
                            continue;
                        }
                        if (var538 == 1604) {
                            class13.field212[var3++] = var77.field2579;
                            continue;
                        }
                        if (var538 == 1605) {
                            class13.field212[var3++] = var77.field2682;
                            continue;
                        }
                        if (var538 == 1606) {
                            class13.field212[var3++] = var77.field2627;
                            continue;
                        }
                        if (var538 == 1607) {
                            class13.field212[var3++] = var77.field2625;
                            continue;
                        }
                        if (var538 == 1608) {
                            class13.field212[var3++] = var77.field2569;
                            continue;
                        }
                        if (var538 == 1609) {
                            class13.field212[var3++] = var77.field2695;
                            continue;
                        }
                        if (var538 == 1610) {
                            class13.field212[var3++] = var77.field2577;
                            continue;
                        }
                        if (var538 == 1611) {
                            class13.field212[var3++] = var77.field2613;
                            continue;
                        }
                        if (var538 == 1612) {
                            class13.field212[var3++] = var77.field2649;
                            continue;
                        }
                    } else if (var538 < 1800) {
                        class178 var78 = var38 ? class224.field3487 : class313.field5028;
                        if (var538 == 1700) {
                            class13.field212[var3++] = var78.field2560;
                            continue;
                        }
                        if (var538 == 1701) {
                            if (var78.field2560 == -1) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = var78.field2629;
                            }
                            continue;
                        }
                        if (var538 == 1702) {
                            class13.field212[var3++] = var78.field2576;
                            continue;
                        }
                    } else if (var538 < 1900) {
                        class178 var518 = var38 ? class224.field3487 : class313.field5028;
                        if (var538 == 1800) {
                            class13.field212[var3++] = client.method2028(var518).method1996(-11);
                            continue;
                        }
                        if (var538 == 1801) {
                            var3--;
                            int var519 = class13.field212[var3];
                            int var540 = var519 - 1;
                            if (var518.field2580 != null && var540 < var518.field2580.length && var518.field2580[var540] != null) {
                                class309.field4963[var6++] = var518.field2580[var540];
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 1802) {
                            if (var518.field2533 == null) {
                                class309.field4963[var6++] = "";
                            } else {
                                class309.field4963[var6++] = var518.field2533;
                            }
                            continue;
                        }
                    } else if (var538 < 2600) {
                        var10000 = arg2 ^ 0xFFFF9074;
                        var3--;
                        class178 var517 = class166.method1057(var10000, class13.field212[var3]);
                        if (var538 == 2500) {
                            class13.field212[var3++] = var517.field2667;
                            continue;
                        }
                        if (var538 == 2501) {
                            class13.field212[var3++] = var517.field2554;
                            continue;
                        }
                        if (var538 == 2502) {
                            class13.field212[var3++] = var517.field2529;
                            continue;
                        }
                        if (var538 == 2503) {
                            class13.field212[var3++] = var517.field2571;
                            continue;
                        }
                        if (var538 == 2504) {
                            class13.field212[var3++] = var517.field2648 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 2505) {
                            class13.field212[var3++] = var517.field2675;
                            continue;
                        }
                    } else if (var538 < 2700) {
                        var3--;
                        class178 var516 = class166.method1057(78, class13.field212[var3]);
                        if (var538 == 2600) {
                            class13.field212[var3++] = var516.field2644;
                            continue;
                        }
                        if (var538 == 2601) {
                            class13.field212[var3++] = var516.field2701;
                            continue;
                        }
                        if (var538 == 2602) {
                            class309.field4963[var6++] = var516.field2630;
                            continue;
                        }
                        if (var538 == 2603) {
                            class13.field212[var3++] = var516.field2556;
                            continue;
                        }
                        if (var538 == 2604) {
                            class13.field212[var3++] = var516.field2579;
                            continue;
                        }
                        if (var538 == 2605) {
                            class13.field212[var3++] = var516.field2682;
                            continue;
                        }
                        if (var538 == 2606) {
                            class13.field212[var3++] = var516.field2627;
                            continue;
                        }
                        if (var538 == 2607) {
                            class13.field212[var3++] = var516.field2625;
                            continue;
                        }
                        if (var538 == 2608) {
                            class13.field212[var3++] = var516.field2569;
                            continue;
                        }
                        if (var538 == 2609) {
                            class13.field212[var3++] = var516.field2695;
                            continue;
                        }
                        if (var538 == 2610) {
                            class13.field212[var3++] = var516.field2577;
                            continue;
                        }
                        if (var538 == 2611) {
                            class13.field212[var3++] = var516.field2613;
                            continue;
                        }
                        if (var538 == 2612) {
                            class13.field212[var3++] = var516.field2649;
                            continue;
                        }
                    } else if (var538 < 2800) {
                        if (var538 == 2700) {
                            var3--;
                            class178 var506 = class166.method1057(88, class13.field212[var3]);
                            class13.field212[var3++] = var506.field2560;
                            continue;
                        }
                        if (var538 == 2701) {
                            var3--;
                            class178 var507 = class166.method1057(59, class13.field212[var3]);
                            if (var507.field2560 == -1) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = var507.field2629;
                            }
                            continue;
                        }
                        if (var538 == 2702) {
                            var3--;
                            int var508 = class13.field212[var3];
                            class60 var509 = (class60) class186.field2821.method1453(true, (long) var508);
                            if (var509 == null) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = 1;
                            }
                            continue;
                        }
                        if (var538 == 2703) {
                            var3--;
                            class178 var510 = class166.method1057(-91, class13.field212[var3]);
                            if (var510.field2642 == null) {
                                class13.field212[var3++] = 0;
                                continue;
                            }
                            int var511 = var510.field2642.length;
                            for (int var512 = 0; var512 < var510.field2642.length; var512++) {
                                if (var510.field2642[var512] == null) {
                                    var511 = var512;
                                    break;
                                }
                            }
                            class13.field212[var3++] = var511;
                            continue;
                        }
                        if (var538 == 2704 || var538 == 2705) {
                            var3 -= 2;
                            int var513 = class13.field212[var3];
                            int var514 = class13.field212[var3 + 1];
                            class60 var515 = (class60) class186.field2821.method1453(true, (long) var513);
                            if (var515 != null && var515.field831 == var514) {
                                class13.field212[var3++] = 1;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                    } else if (var538 < 2900) {
                        var3--;
                        class178 var79 = class166.method1057(-95, class13.field212[var3]);
                        if (var538 == 2800) {
                            class13.field212[var3++] = client.method2028(var79).method1996(-11);
                            continue;
                        }
                        if (var538 == 2801) {
                            var3--;
                            int var80 = class13.field212[var3];
                            int var539 = var80 - 1;
                            if (var79.field2580 != null && var539 < var79.field2580.length && var79.field2580[var539] != null) {
                                class309.field4963[var6++] = var79.field2580[var539];
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 2802) {
                            if (var79.field2533 == null) {
                                class309.field4963[var6++] = "";
                            } else {
                                class309.field4963[var6++] = var79.field2533;
                            }
                            continue;
                        }
                    } else if (var538 < 3200) {
                        if (var538 == 3100) {
                            var6--;
                            String var491 = class309.field4963[var6];
                            class89.method573(var491, (byte) -125);
                            continue;
                        }
                        if (var538 == 3101) {
                            var3 -= 2;
                            class69.method465(class250.field3905, class13.field212[var3 + 1], -2, class13.field212[var3]);
                            continue;
                        }
                        if (var538 == 3103) {
                            class144.method900(arg2 - 28668);
                            continue;
                        }
                        if (var538 == 3104) {
                            class48.field686++;
                            var6--;
                            String var492 = class309.field4963[var6];
                            int var493 = 0;
                            if (class262.method1702(var492, -66)) {
                                var493 = class18.method124(var492, true);
                            }
                            class231.field3614.method809(170, 0);
                            class231.field3614.method1398(true, var493);
                            continue;
                        }
                        if (var538 == 3105) {
                            class71.field1026++;
                            var6--;
                            String var494 = class309.field4963[var6];
                            class231.field3614.method809(220, 0);
                            class231.field3614.method1363(var494.length() + 1, 99);
                            class231.field3614.method1384(var494, -595448376);
                            continue;
                        }
                        if (var538 == 3106) {
                            class78.field1083++;
                            var6--;
                            String var495 = class309.field4963[var6];
                            class231.field3614.method809(143, 0);
                            class231.field3614.method1363(var495.length() + 1, -23);
                            class231.field3614.method1384(var495, -595448376);
                            continue;
                        }
                        if (var538 == 3107) {
                            var3--;
                            int var496 = class13.field212[var3];
                            var6--;
                            String var497 = class309.field4963[var6];
                            class198.method1247((byte) 125, var496, var497);
                            continue;
                        }
                        if (var538 == 3108) {
                            var3 -= 3;
                            int var498 = class13.field212[var3];
                            int var499 = class13.field212[var3 + 1];
                            int var500 = class13.field212[var3 + 2];
                            class178 var501 = class166.method1057(-92, var500);
                            class59.method372(var499, var501, var498, 0);
                            continue;
                        }
                        if (var538 == 3109) {
                            var3 -= 2;
                            int var502 = class13.field212[var3];
                            int var503 = class13.field212[var3 + 1];
                            class178 var504 = var38 ? class224.field3487 : class313.field5028;
                            class59.method372(var503, var504, var502, 0);
                            continue;
                        }
                        if (var538 == 3110) {
                            class24.field387++;
                            var3--;
                            int var505 = class13.field212[var3];
                            class231.field3614.method809(166, 0);
                            class231.field3614.method1385(var505, true);
                            continue;
                        }
                    } else if (var538 < 3300) {
                        if (var538 == 3200) {
                            var3 -= 3;
                            class291.method1955(class13.field212[var3 + 1], class13.field212[var3], 20683, class13.field212[var3 + 2], 255);
                            continue;
                        }
                        if (var538 == 3201) {
                            var3--;
                            class78.method501(class13.field212[var3], (byte) -124, 255);
                            continue;
                        }
                        if (var538 == 3202) {
                            var3 -= 2;
                            class312.method2109(class13.field212[var3 + 1], 0, class13.field212[var3], 255);
                            continue;
                        }
                    } else if (var538 < 3400) {
                        if (var538 == 3300) {
                            class13.field212[var3++] = class35.field533;
                            continue;
                        }
                        if (var538 == 3301) {
                            var3 -= 2;
                            int var457 = class13.field212[var3 + 1];
                            int var458 = class13.field212[var3];
                            class13.field212[var3++] = class12.method77(var457, (byte) 107, var458);
                            continue;
                        }
                        if (var538 == 3302) {
                            var3 -= 2;
                            int var459 = class13.field212[var3];
                            int var460 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class90.method579(var460, var459, (byte) -122);
                            continue;
                        }
                        if (var538 == 3303) {
                            var3 -= 2;
                            int var461 = class13.field212[var3];
                            int var462 = class13.field212[var3 + 1];
                            class13.field212[var3++] = method1493(var462, 0, var461);
                            continue;
                        }
                        if (var538 == 3304) {
                            var3--;
                            int var463 = class13.field212[var3];
                            class13.field212[var3++] = class277.method1798((byte) -40, var463).field208;
                            continue;
                        }
                        if (var538 == 3305) {
                            var3--;
                            int var464 = class13.field212[var3];
                            class13.field212[var3++] = class247.field3872[var464];
                            continue;
                        }
                        if (var538 == 3306) {
                            var3--;
                            int var465 = class13.field212[var3];
                            class13.field212[var3++] = class246.field3863[var465];
                            continue;
                        }
                        if (var538 == 3307) {
                            var3--;
                            int var466 = class13.field212[var3];
                            class13.field212[var3++] = class262.field4213[var466];
                            continue;
                        }
                        if (var538 == 3308) {
                            int var467 = class166.field2364;
                            int var468 = (class250.field3905.field4081 >> 7) + class228.field3570;
                            int var469 = (class250.field3905.field4140 >> 7) + class170.field2421;
                            class13.field212[var3++] = (var467 << 28) + (var468 << 14) + var469;
                            continue;
                        }
                        if (var538 == 3309) {
                            var3--;
                            int var470 = class13.field212[var3];
                            class13.field212[var3++] = class32.method199(268429171, var470) >> 14;
                            continue;
                        }
                        if (var538 == 3310) {
                            var3--;
                            int var471 = class13.field212[var3];
                            class13.field212[var3++] = var471 >> 28;
                            continue;
                        }
                        if (var538 == 3311) {
                            var3--;
                            int var472 = class13.field212[var3];
                            class13.field212[var3++] = class32.method199(16383, var472);
                            continue;
                        }
                        if (var538 == 3312) {
                            class13.field212[var3++] = class252.field3939 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3313) {
                            var3 -= 2;
                            int var473 = class13.field212[var3] + 32768;
                            int var474 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class12.method77(var474, (byte) 93, var473);
                            continue;
                        }
                        if (var538 == 3314) {
                            var3 -= 2;
                            int var475 = class13.field212[var3] + 32768;
                            int var476 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class90.method579(var476, var475, (byte) -91);
                            continue;
                        }
                        if (var538 == 3315) {
                            var3 -= 2;
                            int var477 = class13.field212[var3] + 32768;
                            int var478 = class13.field212[var3 + 1];
                            class13.field212[var3++] = method1493(var478, 0, var477);
                            continue;
                        }
                        if (var538 == 3316) {
                            if (class245.field3846 < 2) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = class245.field3846;
                            }
                            continue;
                        }
                        if (var538 == 3317) {
                            class13.field212[var3++] = class271.field4318;
                            continue;
                        }
                        if (var538 == 3318) {
                            class13.field212[var3++] = class211.field3178;
                            continue;
                        }
                        if (var538 == 3321) {
                            class13.field212[var3++] = class271.field4319;
                            continue;
                        }
                        if (var538 == 3322) {
                            class13.field212[var3++] = class42.field635;
                            continue;
                        }
                        if (var538 == 3323) {
                            if (class205.field3065 >= 5 && class205.field3065 <= 9) {
                                class13.field212[var3++] = 1;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3324) {
                            if (class205.field3065 >= 5 && class205.field3065 <= 9) {
                                class13.field212[var3++] = class205.field3065;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3325) {
                            class13.field212[var3++] = class134.field1846 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3326) {
                            class13.field212[var3++] = class250.field3905.field5059;
                            continue;
                        }
                        if (var538 == 3327) {
                            class13.field212[var3++] = class250.field3905.field5066.field968 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3328) {
                            class13.field212[var3++] = field3527 && !class103.field1477 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3329) {
                            class13.field212[var3++] = class164.field2322 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3330) {
                            var3--;
                            int var479 = class13.field212[var3];
                            class13.field212[var3++] = class4.method18(var479, (byte) 91);
                            continue;
                        }
                        if (var538 == 3331) {
                            var3 -= 2;
                            int var480 = class13.field212[var3];
                            int var481 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class300.method2010(0, false, var481, var480);
                            continue;
                        }
                        if (var538 == 3332) {
                            var3 -= 2;
                            int var482 = class13.field212[var3];
                            int var483 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class300.method2010(0, true, var483, var482);
                            continue;
                        }
                        if (var538 == 3333) {
                            class13.field212[var3++] = class308.field4948;
                            continue;
                        }
                        if (var538 == 3335) {
                            class13.field212[var3++] = class129.field1799;
                            continue;
                        }
                        if (var538 == 3336) {
                            var3 -= 4;
                            int var484 = class13.field212[var3 + 1];
                            int var485 = class13.field212[var3];
                            int var486 = class13.field212[var3 + 2];
                            int var487 = (var484 << 14) + var485;
                            int var488 = class13.field212[var3 + 3];
                            int var489 = (var486 << 28) + var487;
                            int var490 = var488 + var489;
                            class13.field212[var3++] = var490;
                            continue;
                        }
                        if (var538 == 3337) {
                            class13.field212[var3++] = class148.field2026;
                            continue;
                        }
                    } else if (var538 < 3500) {
                        if (var538 == 3400) {
                            var3 -= 2;
                            int var440 = class13.field212[var3];
                            int var441 = class13.field212[var3 + 1];
                            class36 var442 = class148.method927(var440, true);
                            class309.field4963[var6++] = var442.method246(var441, false);
                            continue;
                        }
                        if (var538 == 3408) {
                            var3 -= 4;
                            int var443 = class13.field212[var3];
                            int var444 = class13.field212[var3 + 2];
                            int var445 = class13.field212[var3 + 3];
                            int var446 = class13.field212[var3 + 1];
                            class36 var447 = class148.method927(var444, true);
                            if (var447.field538 == var443 && var447.field548 == var446) {
                                if (var446 == 115) {
                                    class309.field4963[var6++] = var447.method246(var445, false);
                                } else {
                                    class13.field212[var3++] = var447.method243(false, var445);
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var538 == 3409) {
                            var3 -= 3;
                            int var448 = class13.field212[var3];
                            int var449 = class13.field212[var3 + 2];
                            int var450 = class13.field212[var3 + 1];
                            if (var450 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class36 var451 = class148.method927(var450, true);
                            if (var451.field548 != var448) {
                                throw new RuntimeException("C3409-1");
                            }
                            class13.field212[var3++] = var451.method244(-102, var449) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3410) {
                            var3--;
                            int var452 = class13.field212[var3];
                            var6--;
                            String var453 = class309.field4963[var6];
                            if (var452 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class36 var454 = class148.method927(var452, true);
                            if (var454.field548 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class13.field212[var3++] = var454.method239(var453, (byte) -91) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3411) {
                            var3--;
                            int var455 = class13.field212[var3];
                            class36 var456 = class148.method927(var455, true);
                            class13.field212[var3++] = var456.field542.method1451(2173);
                            continue;
                        }
                    } else if (var538 < 3700) {
                        if (var538 == 3600) {
                            if (class181.field2751 == 0) {
                                class13.field212[var3++] = -2;
                            } else if (class181.field2751 == 1) {
                                class13.field212[var3++] = -1;
                            } else {
                                class13.field212[var3++] = class43.field643;
                            }
                            continue;
                        }
                        if (var538 == 3601) {
                            var3--;
                            int var81 = class13.field212[var3];
                            if (class181.field2751 == 2 && class43.field643 > var81) {
                                class309.field4963[var6++] = class206.field3081[var81];
                                if (class151.field2095[var81] == null) {
                                    class309.field4963[var6++] = "";
                                } else {
                                    class309.field4963[var6++] = class151.field2095[var81];
                                }
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 3602) {
                            var3--;
                            int var82 = class13.field212[var3];
                            if (class181.field2751 == 2 && var82 < class43.field643) {
                                class13.field212[var3++] = class188.field2846[var82];
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3603) {
                            var3--;
                            int var83 = class13.field212[var3];
                            if (class181.field2751 == 2 && class43.field643 > var83) {
                                class13.field212[var3++] = class188.field2852[var83];
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3604) {
                            var3--;
                            int var84 = class13.field212[var3];
                            var6--;
                            String var85 = class309.field4963[var6];
                            class42.method284(var84, var85, (byte) -85);
                            continue;
                        }
                        if (var538 == 3605) {
                            var6--;
                            String var86 = class309.field4963[var6];
                            class75.method494(var86, -66);
                            continue;
                        }
                        if (var538 == 3606) {
                            var6--;
                            String var87 = class309.field4963[var6];
                            class181.method1151(-1697, var87);
                            continue;
                        }
                        if (var538 == 3607) {
                            var6--;
                            String var88 = class309.field4963[var6];
                            class275.method1788(false, var88, true);
                            continue;
                        }
                        if (var538 == 3608) {
                            var6--;
                            String var89 = class309.field4963[var6];
                            class244.method1604(var89, -11224);
                            continue;
                        }
                        if (var538 == 3609) {
                            var6--;
                            String var90 = class309.field4963[var6];
                            if (var90.startsWith("<img=0>") || var90.startsWith("<img=1>")) {
                                var90 = var90.substring(7);
                            }
                            class13.field212[var3++] = class90.method586(true, var90) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3610) {
                            var3--;
                            int var91 = class13.field212[var3];
                            if (class181.field2751 == 2 && var91 < class43.field643) {
                                class309.field4963[var6++] = class76.field1068[var91];
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 3611) {
                            if (class39.field587 == null) {
                                class309.field4963[var6++] = "";
                            } else {
                                class309.field4963[var6++] = class14.method88(class39.field587, -35);
                            }
                            continue;
                        }
                        if (var538 == 3612) {
                            if (class39.field587 == null) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = class193.field2948;
                            }
                            continue;
                        }
                        if (var538 == 3613) {
                            var3--;
                            int var92 = class13.field212[var3];
                            if (class39.field587 != null && var92 < class193.field2948) {
                                class309.field4963[var6++] = class290.field4633[var92].field4462;
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 3614) {
                            var3--;
                            int var93 = class13.field212[var3];
                            if (class39.field587 != null && var93 < class193.field2948) {
                                class13.field212[var3++] = class290.field4633[var93].field4458;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3615) {
                            var3--;
                            int var94 = class13.field212[var3];
                            if (class39.field587 != null && class193.field2948 > var94) {
                                class13.field212[var3++] = class290.field4633[var94].field4470;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3616) {
                            class13.field212[var3++] = class111.field1587;
                            continue;
                        }
                        if (var538 == 3617) {
                            var6--;
                            String var95 = class309.field4963[var6];
                            class297.method1998(1448, var95);
                            continue;
                        }
                        if (var538 == 3618) {
                            class13.field212[var3++] = class158.field2191;
                            continue;
                        }
                        if (var538 == 3619) {
                            var6--;
                            String var96 = class309.field4963[var6];
                            class120.method779((byte) 45, var96);
                            continue;
                        }
                        if (var538 == 3620) {
                            class70.method466(arg2 - 48506);
                            continue;
                        }
                        if (var538 == 3621) {
                            if (class181.field2751 == 0) {
                                class13.field212[var3++] = -1;
                            } else {
                                class13.field212[var3++] = class256.field4092;
                            }
                            continue;
                        }
                        if (var538 == 3622) {
                            var3--;
                            int var97 = class13.field212[var3];
                            if (class181.field2751 != 0 && var97 < class256.field4092) {
                                class309.field4963[var6++] = class195.field2970[var97];
                                if (class228.field3573[var97] == null) {
                                    class309.field4963[var6++] = "";
                                } else {
                                    class309.field4963[var6++] = class228.field3573[var97];
                                }
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 3623) {
                            var6--;
                            String var98 = class309.field4963[var6];
                            if (var98.startsWith("<img=0>") || var98.startsWith("<img=1>")) {
                                var98 = var98.substring(7);
                            }
                            class13.field212[var3++] = method1487(var98, (byte) -119) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3624) {
                            var3--;
                            int var99 = class13.field212[var3];
                            if (class290.field4633 != null && var99 < class193.field2948 && class290.field4633[var99].field4466.equalsIgnoreCase(class250.field3905.field5053)) {
                                class13.field212[var3++] = 1;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3625) {
                            if (class308.field4954 == null) {
                                class309.field4963[var6++] = "";
                            } else {
                                class309.field4963[var6++] = class308.field4954;
                            }
                            continue;
                        }
                        if (var538 == 3626) {
                            var3--;
                            int var100 = class13.field212[var3];
                            if (class39.field587 != null && var100 < class193.field2948) {
                                class309.field4963[var6++] = class290.field4633[var100].field4468;
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 3627) {
                            var3--;
                            int var101 = class13.field212[var3];
                            if (class181.field2751 == 2 && var101 >= 0 && class43.field643 > var101) {
                                class13.field212[var3++] = class192.field2937[var101] ? 1 : 0;
                                continue;
                            }
                            class13.field212[var3++] = 0;
                            continue;
                        }
                        if (var538 == 3628) {
                            var6--;
                            String var102 = class309.field4963[var6];
                            if (var102.startsWith("<img=0>") || var102.startsWith("<img=1>")) {
                                var102 = var102.substring(7);
                            }
                            class13.field212[var3++] = class98.method638((byte) -43, var102);
                            continue;
                        }
                        if (var538 == 3629) {
                            class13.field212[var3++] = class280.field4454;
                            continue;
                        }
                        if (var538 == 3630) {
                            var6--;
                            String var103 = class309.field4963[var6];
                            class275.method1788(true, var103, true);
                            continue;
                        }
                        if (var538 == 3631) {
                            var3--;
                            int var104 = class13.field212[var3];
                            class13.field212[var3++] = class26.field418[var104] ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3632) {
                            var3--;
                            int var105 = class13.field212[var3];
                            if (class39.field587 != null && var105 < class193.field2948) {
                                class309.field4963[var6++] = class290.field4633[var105].field4466;
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 3633) {
                            var3--;
                            int var106 = class13.field212[var3];
                            if (class181.field2751 != 0 && var106 < class256.field4092) {
                                class309.field4963[var6++] = class16.field286[var106];
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                    } else if (var538 < 4000) {
                        if (var538 == 3903) {
                            var3--;
                            int var426 = class13.field212[var3];
                            class13.field212[var3++] = class297.field4745[var426].method342((byte) 103);
                            continue;
                        }
                        if (var538 == 3904) {
                            var3--;
                            int var427 = class13.field212[var3];
                            class13.field212[var3++] = class297.field4745[var427].field752;
                            continue;
                        }
                        if (var538 == 3905) {
                            var3--;
                            int var428 = class13.field212[var3];
                            class13.field212[var3++] = class297.field4745[var428].field753;
                            continue;
                        }
                        if (var538 == 3906) {
                            var3--;
                            int var429 = class13.field212[var3];
                            class13.field212[var3++] = class297.field4745[var429].field762;
                            continue;
                        }
                        if (var538 == 3907) {
                            var3--;
                            int var430 = class13.field212[var3];
                            class13.field212[var3++] = class297.field4745[var430].field765;
                            continue;
                        }
                        if (var538 == 3908) {
                            var3--;
                            int var431 = class13.field212[var3];
                            class13.field212[var3++] = class297.field4745[var431].field761;
                            continue;
                        }
                        if (var538 == 3910) {
                            var3--;
                            int var432 = class13.field212[var3];
                            int var433 = class297.field4745[var432].method339(-124);
                            class13.field212[var3++] = var433 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3911) {
                            var3--;
                            int var434 = class13.field212[var3];
                            int var435 = class297.field4745[var434].method339(-123);
                            class13.field212[var3++] = var435 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3912) {
                            var3--;
                            int var436 = class13.field212[var3];
                            int var437 = class297.field4745[var436].method339(arg2 - 28794);
                            class13.field212[var3++] = var437 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 3913) {
                            var3--;
                            int var438 = class13.field212[var3];
                            int var439 = class297.field4745[var438].method339(-121);
                            class13.field212[var3++] = var439 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var538 < 4100) {
                        if (var538 == 4000) {
                            var3 -= 2;
                            int var107 = class13.field212[var3];
                            int var108 = class13.field212[var3 + 1];
                            class13.field212[var3++] = var107 + var108;
                            continue;
                        }
                        if (var538 == 4001) {
                            var3 -= 2;
                            int var109 = class13.field212[var3 + 1];
                            int var110 = class13.field212[var3];
                            class13.field212[var3++] = var110 - var109;
                            continue;
                        }
                        if (var538 == 4002) {
                            var3 -= 2;
                            int var111 = class13.field212[var3];
                            int var112 = class13.field212[var3 + 1];
                            class13.field212[var3++] = var111 * var112;
                            continue;
                        }
                        if (var538 == 4003) {
                            var3 -= 2;
                            int var113 = class13.field212[var3];
                            int var114 = class13.field212[var3 + 1];
                            class13.field212[var3++] = var113 / var114;
                            continue;
                        }
                        if (var538 == 4004) {
                            var3--;
                            int var115 = class13.field212[var3];
                            class13.field212[var3++] = (int) (Math.random() * (double) var115);
                            continue;
                        }
                        if (var538 == 4005) {
                            var3--;
                            int var116 = class13.field212[var3];
                            class13.field212[var3++] = (int) (Math.random() * (double) (var116 + 1));
                            continue;
                        }
                        if (var538 == 4006) {
                            var3 -= 5;
                            int var117 = class13.field212[var3];
                            int var118 = class13.field212[var3 + 1];
                            int var119 = class13.field212[var3 + 4];
                            int var120 = class13.field212[var3 + 2];
                            int var121 = class13.field212[var3 + 3];
                            class13.field212[var3++] = (var118 - var117) * (var119 - var120) / (var121 - var120) + var117;
                            continue;
                        }
                        if (var538 == 4007) {
                            var3 -= 2;
                            long var122 = (long) class13.field212[var3 + 1];
                            long var124 = (long) class13.field212[var3];
                            class13.field212[var3++] = (int) (var122 * var124 / 100L + var124);
                            continue;
                        }
                        if (var538 == 4008) {
                            var3 -= 2;
                            int var126 = class13.field212[var3];
                            int var127 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class161.method1003(0x1 << var127, var126);
                            continue;
                        }
                        if (var538 == 4009) {
                            var3 -= 2;
                            int var128 = class13.field212[var3 + 1];
                            int var129 = class13.field212[var3];
                            class13.field212[var3++] = class32.method199(var129, -(0x1 << var128) - 1);
                            continue;
                        }
                        if (var538 == 4010) {
                            var3 -= 2;
                            int var130 = class13.field212[var3];
                            int var131 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class32.method199(var130, 0x1 << var131) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var538 == 4011) {
                            var3 -= 2;
                            int var132 = class13.field212[var3 + 1];
                            int var133 = class13.field212[var3];
                            class13.field212[var3++] = var133 % var132;
                            continue;
                        }
                        if (var538 == 4012) {
                            var3 -= 2;
                            int var134 = class13.field212[var3 + 1];
                            int var135 = class13.field212[var3];
                            if (var135 == 0) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = (int) Math.pow((double) var135, (double) var134);
                            }
                            continue;
                        }
                        if (var538 == 4013) {
                            var3 -= 2;
                            int var136 = class13.field212[var3];
                            int var137 = class13.field212[var3 + 1];
                            if (var136 == 0) {
                                class13.field212[var3++] = 0;
                            } else if (var137 == 0) {
                                class13.field212[var3++] = Integer.MAX_VALUE;
                            } else {
                                class13.field212[var3++] = (int) Math.pow((double) var136, 1.0D / (double) var137);
                            }
                            continue;
                        }
                        if (var538 == 4014) {
                            var3 -= 2;
                            int var138 = class13.field212[var3 + 1];
                            int var139 = class13.field212[var3];
                            class13.field212[var3++] = class32.method199(var139, var138);
                            continue;
                        }
                        if (var538 == 4015) {
                            var3 -= 2;
                            int var140 = class13.field212[var3];
                            int var141 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class161.method1003(var141, var140);
                            continue;
                        }
                        if (var538 == 4016) {
                            var3 -= 2;
                            int var142 = class13.field212[var3];
                            int var143 = class13.field212[var3 + 1];
                            class13.field212[var3++] = var143 <= var142 ? var143 : var142;
                            continue;
                        }
                        if (var538 == 4017) {
                            var3 -= 2;
                            int var144 = class13.field212[var3 + 1];
                            int var145 = class13.field212[var3];
                            class13.field212[var3++] = var145 > var144 ? var145 : var144;
                            continue;
                        }
                        if (var538 == 4018) {
                            var3 -= 3;
                            long var146 = (long) class13.field212[var3];
                            long var148 = (long) class13.field212[var3 + 1];
                            long var150 = (long) class13.field212[var3 + 2];
                            class13.field212[var3++] = (int) (var146 * var150 / var148);
                            continue;
                        }
                    } else if (var538 < 4200) {
                        if (var538 == 4100) {
                            var6--;
                            String var376 = class309.field4963[var6];
                            var3--;
                            int var377 = class13.field212[var3];
                            class309.field4963[var6++] = var376 + var377;
                            continue;
                        }
                        if (var538 == 4101) {
                            var6 -= 2;
                            String var378 = class309.field4963[var6];
                            String var379 = class309.field4963[var6 + 1];
                            class309.field4963[var6++] = var378 + var379;
                            continue;
                        }
                        if (var538 == 4102) {
                            var3--;
                            int var380 = class13.field212[var3];
                            var6--;
                            String var381 = class309.field4963[var6];
                            class309.field4963[var6++] = var381 + class194.method1229(true, var380, (byte) -118);
                            continue;
                        }
                        if (var538 == 4103) {
                            var6--;
                            String var382 = class309.field4963[var6];
                            class309.field4963[var6++] = var382.toLowerCase();
                            continue;
                        }
                        if (var538 == 4104) {
                            var3--;
                            int var383 = class13.field212[var3];
                            long var384 = (long) var383 * 86400000L + 1014768000000L;
                            class104.field1495.setTime(new Date(var384));
                            int var386 = class104.field1495.get(5);
                            int var387 = class104.field1495.get(2);
                            int var388 = class104.field1495.get(1);
                            class309.field4963[var6++] = var386 + "-" + class142.field1956[var387] + "-" + var388;
                            continue;
                        }
                        if (var538 == 4105) {
                            var6 -= 2;
                            String var389 = class309.field4963[var6];
                            String var390 = class309.field4963[var6 + 1];
                            if (class250.field3905.field5066 != null && class250.field3905.field5066.field968) {
                                class309.field4963[var6++] = var390;
                                continue;
                            }
                            class309.field4963[var6++] = var389;
                            continue;
                        }
                        if (var538 == 4106) {
                            var3--;
                            int var391 = class13.field212[var3];
                            class309.field4963[var6++] = Integer.toString(var391);
                            continue;
                        }
                        if (var538 == 4107) {
                            var6 -= 2;
                            class13.field212[var3++] = class20.method131((byte) 70, class39.method263(class129.field1799, (byte) 93, class309.field4963[var6 + 1], class309.field4963[var6]));
                            continue;
                        }
                        if (var538 == 4108) {
                            var3 -= 2;
                            int var392 = class13.field212[var3];
                            var6--;
                            String var393 = class309.field4963[var6];
                            int var394 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class195.method1236(var394, -27867).method215(var393, var392);
                            continue;
                        }
                        if (var538 == 4109) {
                            var3 -= 2;
                            var6--;
                            String var395 = class309.field4963[var6];
                            int var396 = class13.field212[var3];
                            int var397 = class13.field212[var3 + 1];
                            class13.field212[var3++] = class195.method1236(var397, -27867).method224(var395, var396);
                            continue;
                        }
                        if (var538 == 4110) {
                            var6 -= 2;
                            String var398 = class309.field4963[var6 + 1];
                            String var399 = class309.field4963[var6];
                            var3--;
                            if (class13.field212[var3] == 1) {
                                class309.field4963[var6++] = var399;
                            } else {
                                class309.field4963[var6++] = var398;
                            }
                            continue;
                        }
                        if (var538 == 4111) {
                            var6--;
                            String var400 = class309.field4963[var6];
                            class309.field4963[var6++] = class33.method226(var400);
                            continue;
                        }
                        if (var538 == 4112) {
                            var6--;
                            String var401 = class309.field4963[var6];
                            var3--;
                            int var402 = class13.field212[var3];
                            if (var402 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class309.field4963[var6++] = var401 + (char) var402;
                            continue;
                        }
                        if (var538 == 4113) {
                            var3--;
                            int var403 = class13.field212[var3];
                            class13.field212[var3++] = class284.method1872(class207.method1290(arg2, -20459), (char) var403) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4114) {
                            var3--;
                            int var404 = class13.field212[var3];
                            class13.field212[var3++] = class311.method2106((char) var404, -30) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4115) {
                            var3--;
                            int var405 = class13.field212[var3];
                            class13.field212[var3++] = class108.method690((char) var405, 231) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4116) {
                            var3--;
                            int var406 = class13.field212[var3];
                            class13.field212[var3++] = class106.method674((char) var406, (byte) -113) ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4117) {
                            var6--;
                            String var407 = class309.field4963[var6];
                            if (var407 == null) {
                                class13.field212[var3++] = 0;
                            } else {
                                class13.field212[var3++] = var407.length();
                            }
                            continue;
                        }
                        if (var538 == 4118) {
                            var3 -= 2;
                            int var408 = class13.field212[var3];
                            var6--;
                            String var409 = class309.field4963[var6];
                            int var410 = class13.field212[var3 + 1];
                            class309.field4963[var6++] = var409.substring(var408, var410);
                            continue;
                        }
                        if (var538 == 4119) {
                            var6--;
                            String var411 = class309.field4963[var6];
                            boolean var412 = false;
                            StringBuffer var413 = new StringBuffer(var411.length());
                            for (int var414 = 0; var411.length() > var414; var414++) {
                                char var415 = var411.charAt(var414);
                                if (var415 == '<') {
                                    var412 = true;
                                } else if (var415 == '>') {
                                    var412 = false;
                                } else if (!var412) {
                                    var413.append(var415);
                                }
                            }
                            class309.field4963[var6++] = var413.toString();
                            continue;
                        }
                        if (var538 == 4120) {
                            var3 -= 2;
                            int var416 = class13.field212[var3];
                            int var417 = class13.field212[var3 + 1];
                            var6--;
                            String var418 = class309.field4963[var6];
                            class13.field212[var3++] = var418.indexOf(var416, var417);
                            continue;
                        }
                        if (var538 == 4121) {
                            var3--;
                            int var419 = class13.field212[var3];
                            var6 -= 2;
                            String var420 = class309.field4963[var6];
                            String var421 = class309.field4963[var6 + 1];
                            class13.field212[var3++] = var420.indexOf(var421, var419);
                            continue;
                        }
                        if (var538 == 4122) {
                            var3--;
                            int var422 = class13.field212[var3];
                            class13.field212[var3++] = Character.toLowerCase((char) var422);
                            continue;
                        }
                        if (var538 == 4123) {
                            var3--;
                            int var423 = class13.field212[var3];
                            class13.field212[var3++] = Character.toUpperCase((char) var423);
                            continue;
                        }
                        if (var538 == 4124) {
                            var3--;
                            boolean var424 = class13.field212[var3] != 0;
                            var3--;
                            int var425 = class13.field212[var3];
                            class309.field4963[var6++] = class190.method1200(44, (long) var425, 0, class129.field1799, var424);
                            continue;
                        }
                    } else if (var538 < 4300) {
                        if (var538 == 4200) {
                            var3--;
                            int var357 = class13.field212[var3];
                            class309.field4963[var6++] = class281.method1822((byte) -119, var357).field147;
                            continue;
                        }
                        if (var538 == 4201) {
                            var3 -= 2;
                            int var358 = class13.field212[var3 + 1];
                            int var359 = class13.field212[var3];
                            class10 var360 = class281.method1822((byte) -101, var359);
                            if (var358 >= 1 && var358 <= 5 && var360.field179[var358 - 1] != null) {
                                class309.field4963[var6++] = var360.field179[var358 - 1];
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 4202) {
                            var3 -= 2;
                            int var361 = class13.field212[var3];
                            int var362 = class13.field212[var3 + 1];
                            class10 var363 = class281.method1822((byte) -115, var361);
                            if (var362 >= 1 && var362 <= 5 && var363.field134[var362 - 1] != null) {
                                class309.field4963[var6++] = var363.field134[var362 - 1];
                                continue;
                            }
                            class309.field4963[var6++] = "";
                            continue;
                        }
                        if (var538 == 4203) {
                            var3--;
                            int var364 = class13.field212[var3];
                            class13.field212[var3++] = class281.method1822((byte) -94, var364).field153;
                            continue;
                        }
                        if (var538 == 4204) {
                            var3--;
                            int var365 = class13.field212[var3];
                            class13.field212[var3++] = class281.method1822((byte) -113, var365).field150 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4205) {
                            var3--;
                            int var366 = class13.field212[var3];
                            class10 var367 = class281.method1822((byte) -106, var366);
                            if (var367.field112 == -1 && var367.field120 >= 0) {
                                class13.field212[var3++] = var367.field120;
                                continue;
                            }
                            class13.field212[var3++] = var366;
                            continue;
                        }
                        if (var538 == 4206) {
                            var3--;
                            int var368 = class13.field212[var3];
                            class10 var369 = class281.method1822((byte) -124, var368);
                            if (var369.field112 >= 0 && var369.field120 >= 0) {
                                class13.field212[var3++] = var369.field120;
                                continue;
                            }
                            class13.field212[var3++] = var368;
                            continue;
                        }
                        if (var538 == 4207) {
                            var3--;
                            int var370 = class13.field212[var3];
                            class13.field212[var3++] = class281.method1822((byte) -113, var370).field113 ? 1 : 0;
                            continue;
                        }
                        if (var538 == 4208) {
                            var3 -= 2;
                            int var371 = class13.field212[var3];
                            int var372 = class13.field212[var3 + 1];
                            class267 var373 = class218.method1422((byte) 107, var372);
                            if (var373.method1751(true)) {
                                class309.field4963[var6++] = class281.method1822((byte) -115, var371).method63(var372, var373.field4293, (byte) -50);
                            } else {
                                class13.field212[var3++] = class281.method1822((byte) -106, var371).method53(var373.field4294, var372, (byte) -116);
                            }
                            continue;
                        }
                        if (var538 == 4210) {
                            var6--;
                            String var374 = class309.field4963[var6];
                            var3--;
                            int var375 = class13.field212[var3];
                            class163.method1042(var375 == 1, (byte) -52, var374);
                            class13.field212[var3++] = class21.field346;
                            continue;
                        }
                        if (var538 == 4211) {
                            if (class34.field512 != null && class101.field1456 < class21.field346) {
                                class13.field212[var3++] = class32.method199(65535, class34.field512[class101.field1456++]);
                                continue;
                            }
                            class13.field212[var3++] = -1;
                            continue;
                        }
                        if (var538 == 4212) {
                            class101.field1456 = 0;
                            continue;
                        }
                    } else if (var538 >= 4400) {
                        if (var538 >= 4500) {
                            if (var538 >= 4600) {
                                if (var538 < 5100) {
                                    if (var538 == 5000) {
                                        class13.field212[var3++] = class126.field1771;
                                        continue;
                                    }
                                    if (var538 == 5001) {
                                        var3 -= 3;
                                        class57.field788++;
                                        class126.field1771 = class13.field212[var3];
                                        class111.field1596 = class13.field212[var3 + 1];
                                        class88.field1275 = class13.field212[var3 + 2];
                                        class231.field3614.method809(36, 0);
                                        class231.field3614.method1363(class126.field1771, arg2 ^ 0x6F8D);
                                        class231.field3614.method1363(class111.field1596, 110);
                                        class231.field3614.method1363(class88.field1275, 92);
                                        continue;
                                    }
                                    if (var538 == 5002) {
                                        var3 -= 2;
                                        class149.field2040++;
                                        var6--;
                                        String var279 = class309.field4963[var6];
                                        int var280 = class13.field212[var3];
                                        int var281 = class13.field212[var3 + 1];
                                        class231.field3614.method809(217, 0);
                                        class231.field3614.method1363(class231.method1518(var279, 83) + 2, arg2 ^ 0xFFFF9042);
                                        class231.field3614.method1384(var279, arg2 ^ 0xDC824236);
                                        class231.field3614.method1363(var280 - 1, -102);
                                        class231.field3614.method1363(var281, -67);
                                        continue;
                                    }
                                    if (var538 == 5003) {
                                        var3--;
                                        int var282 = class13.field212[var3];
                                        String var283 = null;
                                        if (var282 < 100) {
                                            var283 = class113.field1615[var282];
                                        }
                                        if (var283 == null) {
                                            var283 = "";
                                        }
                                        class309.field4963[var6++] = var283;
                                        continue;
                                    }
                                    if (var538 == 5004) {
                                        var3--;
                                        int var284 = class13.field212[var3];
                                        int var285 = -1;
                                        if (var284 < 100 && class113.field1615[var284] != null) {
                                            var285 = class35.field537[var284];
                                        }
                                        class13.field212[var3++] = var285;
                                        continue;
                                    }
                                    if (var538 == 5005) {
                                        class13.field212[var3++] = class111.field1596;
                                        continue;
                                    }
                                    if (var538 == 5008) {
                                        var6--;
                                        String var286 = class309.field4963[var6];
                                        if (var286.startsWith("::")) {
                                            class208.method1297(var286, arg2 ^ 0xFFFF9000);
                                            continue;
                                        }
                                        if (class245.field3846 == 0 && (field3527 && !class103.field1477 || class164.field2322)) {
                                            continue;
                                        }
                                        String var287 = var286.toLowerCase();
                                        byte var288 = 0;
                                        class224.field3488++;
                                        byte var289 = 0;
                                        if (var287.startsWith(class290.field4628)) {
                                            var288 = 0;
                                            var286 = var286.substring(class290.field4628.length());
                                        } else if (var287.startsWith(class98.field1427)) {
                                            var286 = var286.substring(class98.field1427.length());
                                            var288 = 1;
                                        } else if (var287.startsWith(class102.field1464)) {
                                            var288 = 2;
                                            var286 = var286.substring(class102.field1464.length());
                                        } else if (var287.startsWith(class211.field3172)) {
                                            var286 = var286.substring(class211.field3172.length());
                                            var288 = 3;
                                        } else if (var287.startsWith(class68.field963)) {
                                            var286 = var286.substring(class68.field963.length());
                                            var288 = 4;
                                        } else if (var287.startsWith(class255.field4026)) {
                                            var286 = var286.substring(class255.field4026.length());
                                            var288 = 5;
                                        } else if (var287.startsWith(class27.field422)) {
                                            var288 = 6;
                                            var286 = var286.substring(class27.field422.length());
                                        } else if (var287.startsWith(class126.field1776)) {
                                            var288 = 7;
                                            var286 = var286.substring(class126.field1776.length());
                                        } else if (var287.startsWith(class81.field1122)) {
                                            var286 = var286.substring(class81.field1122.length());
                                            var288 = 8;
                                        } else if (var287.startsWith(class124.field1750)) {
                                            var286 = var286.substring(class124.field1750.length());
                                            var288 = 9;
                                        } else if (var287.startsWith(class109.field1559)) {
                                            var286 = var286.substring(class109.field1559.length());
                                            var288 = 10;
                                        } else if (var287.startsWith(class184.field2792)) {
                                            var286 = var286.substring(class184.field2792.length());
                                            var288 = 11;
                                        } else if (class129.field1799 != 0) {
                                            if (var287.startsWith(class39.field597)) {
                                                var288 = 0;
                                                var286 = var286.substring(class39.field597.length());
                                            } else if (var287.startsWith(class107.field1527)) {
                                                var288 = 1;
                                                var286 = var286.substring(class107.field1527.length());
                                            } else if (var287.startsWith(class96.field1392)) {
                                                var286 = var286.substring(class96.field1392.length());
                                                var288 = 2;
                                            } else if (var287.startsWith(class166.field2359)) {
                                                var286 = var286.substring(class166.field2359.length());
                                                var288 = 3;
                                            } else if (var287.startsWith(class15.field261)) {
                                                var288 = 4;
                                                var286 = var286.substring(class15.field261.length());
                                            } else if (var287.startsWith(class65.field862)) {
                                                var288 = 5;
                                                var286 = var286.substring(class65.field862.length());
                                            } else if (var287.startsWith(class24.field381)) {
                                                var288 = 6;
                                                var286 = var286.substring(class24.field381.length());
                                            } else if (var287.startsWith(class169.field2413)) {
                                                var286 = var286.substring(class169.field2413.length());
                                                var288 = 7;
                                            } else if (var287.startsWith(class260.field4195)) {
                                                var288 = 8;
                                                var286 = var286.substring(class260.field4195.length());
                                            } else if (var287.startsWith(class57.field797)) {
                                                var286 = var286.substring(class57.field797.length());
                                                var288 = 9;
                                            } else if (var287.startsWith(class218.field3360)) {
                                                var286 = var286.substring(class218.field3360.length());
                                                var288 = 10;
                                            } else if (var287.startsWith(class35.field530)) {
                                                var286 = var286.substring(class35.field530.length());
                                                var288 = 11;
                                            }
                                        }
                                        String var290 = var286.toLowerCase();
                                        if (var290.startsWith(class186.field2826)) {
                                            var289 = 1;
                                            var286 = var286.substring(class186.field2826.length());
                                        } else if (var290.startsWith(class188.field2844)) {
                                            var286 = var286.substring(class188.field2844.length());
                                            var289 = 2;
                                        } else if (var290.startsWith(class232.field3639)) {
                                            var286 = var286.substring(class232.field3639.length());
                                            var289 = 3;
                                        } else if (var290.startsWith(class254.field3967)) {
                                            var286 = var286.substring(class254.field3967.length());
                                            var289 = 4;
                                        } else if (var290.startsWith(class215.field3292)) {
                                            var286 = var286.substring(class215.field3292.length());
                                            var289 = 5;
                                        } else if (class129.field1799 != 0) {
                                            if (var290.startsWith(class234.field3660)) {
                                                var289 = 1;
                                                var286 = var286.substring(class234.field3660.length());
                                            } else if (var290.startsWith(class292.field4652)) {
                                                var289 = 2;
                                                var286 = var286.substring(class292.field4652.length());
                                            } else if (var290.startsWith(class142.field1954)) {
                                                var289 = 3;
                                                var286 = var286.substring(class142.field1954.length());
                                            } else if (var290.startsWith(class82.field1131)) {
                                                var286 = var286.substring(class82.field1131.length());
                                                var289 = 4;
                                            } else if (var290.startsWith(class250.field3913)) {
                                                var289 = 5;
                                                var286 = var286.substring(class250.field3913.length());
                                            }
                                        }
                                        class231.field3614.method809(104, 0);
                                        class231.field3614.method1363(0, 113);
                                        int var291 = class231.field3614.field3280;
                                        class231.field3614.method1363(var288, -41);
                                        class231.field3614.method1363(var289, 102);
                                        class195.method1239(-2, class231.field3614, var286);
                                        class231.field3614.method1404(-1, class231.field3614.field3280 - var291);
                                        continue;
                                    }
                                    if (var538 == 5009) {
                                        var6 -= 2;
                                        String var292 = class309.field4963[var6];
                                        String var293 = class309.field4963[var6 + 1];
                                        if (class245.field3846 != 0 || (!field3527 || class103.field1477) && !class164.field2322) {
                                            class231.field3614.method809(13, arg2 - 28670);
                                            class231.field3614.method1363(0, 124);
                                            int var294 = class231.field3614.field3280;
                                            class292.field4650++;
                                            class231.field3614.method1384(var292, -595448376);
                                            class195.method1239(-2, class231.field3614, var293);
                                            class231.field3614.method1404(-1, class231.field3614.field3280 - var294);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5010) {
                                        var3--;
                                        int var295 = class13.field212[var3];
                                        String var296 = null;
                                        if (var295 < 100) {
                                            var296 = class126.field1778[var295];
                                        }
                                        if (var296 == null) {
                                            var296 = "";
                                        }
                                        class309.field4963[var6++] = var296;
                                        continue;
                                    }
                                    if (var538 == 5011) {
                                        var3--;
                                        int var297 = class13.field212[var3];
                                        String var298 = null;
                                        if (var297 < 100) {
                                            var298 = class245.field3850[var297];
                                        }
                                        if (var298 == null) {
                                            var298 = "";
                                        }
                                        class309.field4963[var6++] = var298;
                                        continue;
                                    }
                                    if (var538 == 5012) {
                                        var3--;
                                        int var299 = class13.field212[var3];
                                        int var300 = -1;
                                        if (var299 < 100) {
                                            var300 = class124.field1745[var299];
                                        }
                                        class13.field212[var3++] = var300;
                                        continue;
                                    }
                                    if (var538 == 5015) {
                                        String var301;
                                        if (class250.field3905 == null || class250.field3905.field5067 == null) {
                                            var301 = class171.field2435;
                                        } else {
                                            var301 = class250.field3905.method2117(102400, true);
                                        }
                                        class309.field4963[var6++] = var301;
                                        continue;
                                    }
                                    if (var538 == 5018) {
                                        var3--;
                                        int var302 = class13.field212[var3];
                                        int var303 = 0;
                                        if (var302 < 100 && class113.field1615[var302] != null) {
                                            var303 = class35.field537[var302];
                                        }
                                        class13.field212[var3++] = var303;
                                        continue;
                                    }
                                    if (var538 == 5019) {
                                        String var304 = null;
                                        var3--;
                                        int var305 = class13.field212[var3];
                                        if (var305 < 100) {
                                            var304 = class84.field1189[var305];
                                        }
                                        if (var304 == null) {
                                            var304 = "";
                                        }
                                        class309.field4963[var6++] = var304;
                                        continue;
                                    }
                                    if (var538 == 5016) {
                                        class13.field212[var3++] = class88.field1275;
                                        continue;
                                    }
                                    if (var538 == 5017) {
                                        class13.field212[var3++] = class148.field2025;
                                        continue;
                                    }
                                    if (var538 == 5050) {
                                        var3--;
                                        int var306 = class13.field212[var3];
                                        class309.field4963[var6++] = class92.method595(var306, 100).field4455;
                                        continue;
                                    }
                                    if (var538 == 5051) {
                                        var3--;
                                        int var307 = class13.field212[var3];
                                        class280 var308 = class92.method595(var307, 125);
                                        if (var308.field4451 == null) {
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var308.field4451.length;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5052) {
                                        var3 -= 2;
                                        int var309 = class13.field212[var3];
                                        int var310 = class13.field212[var3 + 1];
                                        class280 var311 = class92.method595(var309, arg2 ^ 0x6FA5);
                                        int var312 = var311.field4451[var310];
                                        class13.field212[var3++] = var312;
                                        continue;
                                    }
                                    if (var538 == 5053) {
                                        var3--;
                                        int var313 = class13.field212[var3];
                                        class280 var314 = class92.method595(var313, 93);
                                        if (var314.field4439 == null) {
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var314.field4439.length;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5054) {
                                        var3 -= 2;
                                        int var315 = class13.field212[var3];
                                        int var316 = class13.field212[var3 + 1];
                                        class13.field212[var3++] = class92.method595(var315, arg2 - 28552).field4439[var316];
                                        continue;
                                    }
                                    if (var538 == 5055) {
                                        var3--;
                                        int var317 = class13.field212[var3];
                                        class309.field4963[var6++] = class158.method984((byte) -62, var317).method31(false);
                                        continue;
                                    }
                                    if (var538 == 5056) {
                                        var3--;
                                        int var318 = class13.field212[var3];
                                        class6 var319 = class158.method984((byte) -62, var318);
                                        if (var319.field60 == null) {
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var319.field60.length;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5057) {
                                        var3 -= 2;
                                        int var320 = class13.field212[var3 + 1];
                                        int var321 = class13.field212[var3];
                                        class13.field212[var3++] = class158.method984((byte) -62, var321).field60[var320];
                                        continue;
                                    }
                                    if (var538 == 5058) {
                                        class63.field849 = new class98();
                                        var3--;
                                        class63.field849.field1428 = class13.field212[var3];
                                        class63.field849.field1424 = class158.method984((byte) -62, class63.field849.field1428);
                                        class63.field849.field1426 = new int[class63.field849.field1424.method38(0)];
                                        continue;
                                    }
                                    if (var538 == 5059) {
                                        class137.field1870++;
                                        class231.field3614.method809(40, 0);
                                        class231.field3614.method1363(0, 100);
                                        int var322 = class231.field3614.field3280;
                                        class231.field3614.method1363(0, arg2 ^ 0xFFFF900E);
                                        class231.field3614.method1385(class63.field849.field1428, true);
                                        class63.field849.field1424.method35(class231.field3614, 0, class63.field849.field1426);
                                        class231.field3614.method1404(arg2 - 28671, -var322 + class231.field3614.field3280);
                                        continue;
                                    }
                                    if (var538 == 5060) {
                                        class177.field2495++;
                                        var6--;
                                        String var323 = class309.field4963[var6];
                                        class231.field3614.method809(159, 0);
                                        class231.field3614.method1363(0, 104);
                                        int var324 = class231.field3614.field3280;
                                        class231.field3614.method1384(var323, -595448376);
                                        class231.field3614.method1385(class63.field849.field1428, true);
                                        class63.field849.field1424.method35(class231.field3614, 0, class63.field849.field1426);
                                        class231.field3614.method1404(-1, class231.field3614.field3280 - var324);
                                        continue;
                                    }
                                    if (var538 == 5061) {
                                        class137.field1870++;
                                        class231.field3614.method809(40, arg2 ^ 0x6FFE);
                                        class231.field3614.method1363(0, arg2 ^ 0xFFFF9049);
                                        int var325 = class231.field3614.field3280;
                                        class231.field3614.method1363(1, 115);
                                        class231.field3614.method1385(class63.field849.field1428, true);
                                        class63.field849.field1424.method35(class231.field3614, 0, class63.field849.field1426);
                                        class231.field3614.method1404(-1, class231.field3614.field3280 - var325);
                                        continue;
                                    }
                                    if (var538 == 5062) {
                                        var3 -= 2;
                                        int var326 = class13.field212[var3];
                                        int var327 = class13.field212[var3 + 1];
                                        class13.field212[var3++] = class92.method595(var326, 114).field4444[var327];
                                        continue;
                                    }
                                    if (var538 == 5063) {
                                        var3 -= 2;
                                        int var328 = class13.field212[var3];
                                        int var329 = class13.field212[var3 + 1];
                                        class13.field212[var3++] = class92.method595(var328, 108).field4447[var329];
                                        continue;
                                    }
                                    if (var538 == 5064) {
                                        var3 -= 2;
                                        int var330 = class13.field212[var3 + 1];
                                        int var331 = class13.field212[var3];
                                        if (var330 == -1) {
                                            class13.field212[var3++] = -1;
                                        } else {
                                            class13.field212[var3++] = class92.method595(var331, 117).method1817(0, (char) var330);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5065) {
                                        var3 -= 2;
                                        int var332 = class13.field212[var3];
                                        int var333 = class13.field212[var3 + 1];
                                        if (var333 == -1) {
                                            class13.field212[var3++] = -1;
                                        } else {
                                            class13.field212[var3++] = class92.method595(var332, 99).method1818((char) var333, -111);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5066) {
                                        var3--;
                                        int var334 = class13.field212[var3];
                                        class13.field212[var3++] = class158.method984((byte) -62, var334).method38(0);
                                        continue;
                                    }
                                    if (var538 == 5067) {
                                        var3 -= 2;
                                        int var335 = class13.field212[var3];
                                        int var336 = class13.field212[var3 + 1];
                                        int var337 = class158.method984((byte) -62, var335).method34(false, var336);
                                        class13.field212[var3++] = var337;
                                        continue;
                                    }
                                    if (var538 == 5068) {
                                        var3 -= 2;
                                        int var338 = class13.field212[var3 + 1];
                                        int var339 = class13.field212[var3];
                                        class63.field849.field1426[var339] = var338;
                                        continue;
                                    }
                                    if (var538 == 5069) {
                                        var3 -= 2;
                                        int var340 = class13.field212[var3];
                                        int var341 = class13.field212[var3 + 1];
                                        class63.field849.field1426[var340] = var341;
                                        continue;
                                    }
                                    if (var538 == 5070) {
                                        var3 -= 3;
                                        int var342 = class13.field212[var3];
                                        int var343 = class13.field212[var3 + 2];
                                        int var344 = class13.field212[var3 + 1];
                                        class6 var345 = class158.method984((byte) -62, var342);
                                        if (var345.method34(false, var344) != 0) {
                                            throw new RuntimeException("bad command");
                                        }
                                        class13.field212[var3++] = var345.method37(var343, var344, (byte) 110);
                                        continue;
                                    }
                                    if (var538 == 5071) {
                                        var6--;
                                        String var346 = class309.field4963[var6];
                                        var3--;
                                        boolean var347 = class13.field212[var3] == 1;
                                        class294.method1975(var347, var346, -118);
                                        class13.field212[var3++] = class21.field346;
                                        continue;
                                    }
                                    if (var538 == 5072) {
                                        if (class34.field512 != null && class21.field346 > class101.field1456) {
                                            class13.field212[var3++] = class32.method199(class34.field512[class101.field1456++], 65535);
                                            continue;
                                        }
                                        class13.field212[var3++] = -1;
                                        continue;
                                    }
                                    if (var538 == 5073) {
                                        class101.field1456 = 0;
                                        continue;
                                    }
                                } else if (var538 < 5200) {
                                    if (var538 == 5100) {
                                        if (class233.field3651[86]) {
                                            class13.field212[var3++] = 1;
                                        } else {
                                            class13.field212[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5101) {
                                        if (class233.field3651[82]) {
                                            class13.field212[var3++] = 1;
                                        } else {
                                            class13.field212[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5102) {
                                        if (class233.field3651[81]) {
                                            class13.field212[var3++] = 1;
                                        } else {
                                            class13.field212[var3++] = 0;
                                        }
                                        continue;
                                    }
                                } else if (var538 < 5300) {
                                    if (var538 == 5200) {
                                        var10000 = arg2 ^ 0x6F87;
                                        var3--;
                                        class298.method2003(var10000, class13.field212[var3]);
                                        continue;
                                    }
                                    if (var538 == 5201) {
                                        class13.field212[var3++] = class236.method1548(107);
                                        continue;
                                    }
                                    if (var538 == 5205) {
                                        var3--;
                                        class144.method902(class13.field212[var3], -1, false, false, -1);
                                        continue;
                                    }
                                    if (var538 == 5206) {
                                        var3--;
                                        int var152 = class13.field212[var3];
                                        class301 var153 = class97.method619(var152 >> 14 & 0x3FFF, var152 & 0x3FFF);
                                        if (var153 == null) {
                                            class13.field212[var3++] = -1;
                                        } else {
                                            class13.field212[var3++] = var153.field4778;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5207) {
                                        var3--;
                                        class301 var154 = class97.method627(class13.field212[var3]);
                                        if (var154 != null && var154.field4796 != null) {
                                            class309.field4963[var6++] = var154.field4796;
                                            continue;
                                        }
                                        class309.field4963[var6++] = "";
                                        continue;
                                    }
                                    if (var538 == 5208) {
                                        class13.field212[var3++] = class105.field1507;
                                        class13.field212[var3++] = class107.field1532;
                                        continue;
                                    }
                                    if (var538 == 5209) {
                                        class13.field212[var3++] = class97.field1400 + class223.field3477;
                                        class13.field212[var3++] = class97.field1406 - (class311.field5005 - class97.field1397) - 1;
                                        continue;
                                    }
                                    if (var538 == 5210) {
                                        var3--;
                                        int var155 = class13.field212[var3];
                                        class301 var156 = class97.method627(var155);
                                        if (var156 == null) {
                                            class13.field212[var3++] = 0;
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = class32.method199(268434918, var156.field4780) >> 14;
                                            class13.field212[var3++] = class32.method199(16383, var156.field4780);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5211) {
                                        var3--;
                                        int var157 = class13.field212[var3];
                                        class301 var158 = class97.method627(var157);
                                        if (var158 == null) {
                                            class13.field212[var3++] = 0;
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var158.field4783 - var158.field4775;
                                            class13.field212[var3++] = var158.field4782 - var158.field4798;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5212) {
                                        class238 var159 = class303.method2025(0);
                                        if (var159 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = -1;
                                        } else {
                                            class13.field212[var3++] = var159.field3688;
                                            int var160 = var159.field3692 << 28 | var159.field3689 + class97.field1400 << 14 | class97.field1397 + class97.field1406 - var159.field3691 - 1;
                                            class13.field212[var3++] = var160;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5213) {
                                        class238 var161 = class260.method1696(24910);
                                        if (var161 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = -1;
                                        } else {
                                            class13.field212[var3++] = var161.field3688;
                                            int var162 = var161.field3692 << 28 | class97.field1400 + var161.field3689 << 14 | class97.field1406 + class97.field1397 - var161.field3691 - 1;
                                            class13.field212[var3++] = var162;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5214) {
                                        var3--;
                                        int var163 = class13.field212[var3];
                                        class301 var164 = class247.method1616((byte) 99);
                                        if (var164 != null) {
                                            boolean var165 = var164.method2016(var163 & 0x3FFF, (var163 & 0x35C2E910) >> 28, class187.field2836, var163 >> 14 & 0x3FFF, (byte) -111);
                                            if (var165) {
                                                class208.method1294((byte) -121, class187.field2836[2], class187.field2836[1]);
                                            }
                                        }
                                        continue;
                                    }
                                    if (var538 == 5215) {
                                        var3 -= 2;
                                        int var166 = class13.field212[var3];
                                        int var167 = class13.field212[var3 + 1];
                                        boolean var168 = false;
                                        class166 var169 = class97.method629((var166 & 0xFFFFD7B) >> 14, var166 & 0x3FFF);
                                        for (class301 var170 = (class301) var169.method1059((byte) -106); var170 != null; var170 = (class301) var169.method1064((byte) -71)) {
                                            if (var170.field4778 == var167) {
                                                var168 = true;
                                                break;
                                            }
                                        }
                                        if (var168) {
                                            class13.field212[var3++] = 1;
                                        } else {
                                            class13.field212[var3++] = 0;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5218) {
                                        var3--;
                                        int var171 = class13.field212[var3];
                                        class301 var172 = class97.method627(var171);
                                        if (var172 == null) {
                                            class13.field212[var3++] = -1;
                                        } else {
                                            class13.field212[var3++] = var172.field4785;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5220) {
                                        class13.field212[var3++] = class302.field4800 == 100 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 5221) {
                                        var3--;
                                        int var173 = class13.field212[var3];
                                        class208.method1294((byte) -121, var173 & 0x3FFF, var173 >> 14 & 0x3FFF);
                                        continue;
                                    }
                                    if (var538 == 5222) {
                                        class301 var174 = class247.method1616((byte) 99);
                                        if (var174 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = -1;
                                        } else {
                                            boolean var175 = var174.method2011(class97.field1400 + class223.field3477, class187.field2836, class97.field1406 + class97.field1397 - class311.field5005 - 1, (byte) 59);
                                            if (var175) {
                                                class13.field212[var3++] = class187.field2836[1];
                                                class13.field212[var3++] = class187.field2836[2];
                                            } else {
                                                class13.field212[var3++] = -1;
                                                class13.field212[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var538 == 5223) {
                                        var3 -= 2;
                                        int var176 = class13.field212[var3];
                                        int var177 = class13.field212[var3 + 1];
                                        class144.method902(var176, var177 & 0x3FFF, false, false, var177 >> 14 & 0x3FFF);
                                        continue;
                                    }
                                    if (var538 == 5224) {
                                        var3--;
                                        int var178 = class13.field212[var3];
                                        class301 var179 = class247.method1616((byte) 99);
                                        if (var179 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = -1;
                                        } else {
                                            boolean var180 = var179.method2016(var178 & 0x3FFF, (var178 & 0x346F34D9) >> 28, class187.field2836, (var178 & 0xFFFCC10) >> 14, (byte) -103);
                                            if (var180) {
                                                class13.field212[var3++] = class187.field2836[1];
                                                class13.field212[var3++] = class187.field2836[2];
                                            } else {
                                                class13.field212[var3++] = -1;
                                                class13.field212[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var538 == 5225) {
                                        var3--;
                                        int var181 = class13.field212[var3];
                                        class301 var182 = class247.method1616((byte) 99);
                                        if (var182 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = -1;
                                        } else {
                                            boolean var183 = var182.method2011(var181 >> 14 & 0x3FFF, class187.field2836, var181 & 0x3FFF, (byte) -116);
                                            if (var183) {
                                                class13.field212[var3++] = class187.field2836[1];
                                                class13.field212[var3++] = class187.field2836[2];
                                            } else {
                                                class13.field212[var3++] = -1;
                                                class13.field212[var3++] = -1;
                                            }
                                        }
                                        continue;
                                    }
                                    if (var538 == 5226) {
                                        var3--;
                                        class34.method236(class13.field212[var3], 1542);
                                        continue;
                                    }
                                    if (var538 == 5227) {
                                        var3 -= 2;
                                        int var184 = class13.field212[var3];
                                        int var185 = class13.field212[var3 + 1];
                                        class144.method902(var184, var185 & 0x3FFF, false, true, var185 >> 14 & 0x3FFF);
                                        continue;
                                    }
                                    if (var538 == 5228) {
                                        var3--;
                                        class38.field582 = class13.field212[var3] == 1;
                                        continue;
                                    }
                                    if (var538 == 5229) {
                                        class13.field212[var3++] = class38.field582 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 5230) {
                                        var3--;
                                        int var186 = class13.field212[var3];
                                        class255.method1660(var186, -102);
                                        continue;
                                    }
                                    if (var538 == 5231) {
                                        var3 -= 2;
                                        boolean var187 = class13.field212[var3 + 1] == 1;
                                        int var188 = class13.field212[var3];
                                        if (class307.field4942 == null) {
                                            continue;
                                        }
                                        class154 var189 = class307.field4942.method1453(true, (long) var188);
                                        if (var189 != null && !var187) {
                                            var189.method962(128);
                                            continue;
                                        }
                                        if (var189 == null && var187) {
                                            class154 var190 = new class154();
                                            class307.field4942.method1452((long) var188, var190, 0);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5232) {
                                        var3--;
                                        int var191 = class13.field212[var3];
                                        if (class307.field4942 == null) {
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class154 var192 = class307.field4942.method1453(true, (long) var191);
                                            class13.field212[var3++] = var192 == null ? 0 : 1;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5233) {
                                        var3 -= 2;
                                        int var193 = class13.field212[var3];
                                        boolean var194 = class13.field212[var3 + 1] == 1;
                                        if (class53.field750 == null) {
                                            continue;
                                        }
                                        class154 var195 = class53.field750.method1453(true, (long) var193);
                                        if (var195 != null && !var194) {
                                            var195.method962(128);
                                            continue;
                                        }
                                        if (var195 == null && var194) {
                                            class154 var196 = new class154();
                                            class53.field750.method1452((long) var193, var196, 0);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5234) {
                                        var3--;
                                        int var197 = class13.field212[var3];
                                        if (class53.field750 == null) {
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class154 var198 = class53.field750.method1453(true, (long) var197);
                                            class13.field212[var3++] = var198 == null ? 0 : 1;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5235) {
                                        class13.field212[var3++] = class97.field1404 == null ? -1 : class97.field1404.field4778;
                                        continue;
                                    }
                                } else if (var538 < 5400) {
                                    if (var538 == 5300) {
                                        var3 -= 2;
                                        class13.field212[var3++] = 0;
                                        continue;
                                    }
                                    if (var538 == 5301) {
                                        continue;
                                    }
                                    if (var538 == 5302) {
                                        class13.field212[var3++] = 0;
                                        continue;
                                    }
                                    if (var538 == 5303) {
                                        var3--;
                                        class13.field212[var3++] = 0;
                                        class13.field212[var3++] = 0;
                                        continue;
                                    }
                                    if (var538 == 5305) {
                                        byte var199 = -1;
                                        class13.field212[var3++] = var199;
                                        continue;
                                    }
                                    if (var538 == 5306) {
                                        class13.field212[var3++] = class246.method1611(100);
                                        continue;
                                    }
                                    if (var538 == 5307) {
                                        var3--;
                                        int var200 = class13.field212[var3];
                                        if (var200 < 0 || var200 > 2) {
                                            var200 = 0;
                                        }
                                        class275.method1790(-1, false, (byte) 93, -1, var200);
                                        continue;
                                    }
                                    if (var538 == 5308) {
                                        class13.field212[var3++] = class288.field4610;
                                        continue;
                                    }
                                    if (var538 == 5309) {
                                        var3--;
                                        int var201 = class13.field212[var3];
                                        if (var201 < 0 || var201 > 2) {
                                            var201 = 0;
                                        }
                                        class288.field4610 = var201;
                                        class149.method929(class45.field667, -1);
                                        continue;
                                    }
                                } else if (var538 < 5500) {
                                    if (var538 == 5400) {
                                        var6 -= 2;
                                        class81.field1117++;
                                        String var257 = class309.field4963[var6];
                                        String var258 = class309.field4963[var6 + 1];
                                        var3--;
                                        int var259 = class13.field212[var3];
                                        class231.field3614.method809(185, 0);
                                        class231.field3614.method1363(class231.method1518(var257, arg2 - 28640) + class231.method1518(var258, 103) + 1, -102);
                                        class231.field3614.method1384(var257, arg2 ^ 0xDC824236);
                                        class231.field3614.method1384(var258, -595448376);
                                        class231.field3614.method1363(var259, arg2 ^ 0x6FA2);
                                        continue;
                                    }
                                    if (var538 == 5401) {
                                        var3 -= 2;
                                        class144.field1965[class13.field212[var3]] = (short) class13.method79(0, class13.field212[var3 + 1]);
                                        class84.method547((byte) -108);
                                        class194.method1224((byte) -79);
                                        class96.method615(12288);
                                        class279.method1808((byte) -93);
                                        class139.method887((byte) 70);
                                        continue;
                                    }
                                    if (var538 == 5405) {
                                        var3 -= 2;
                                        int var260 = class13.field212[var3 + 1];
                                        int var261 = class13.field212[var3];
                                        if (var261 >= 0 && var261 < 2) {
                                            class228.field3568[var261] = new int[var260 << 1][4];
                                        }
                                        continue;
                                    }
                                    if (var538 == 5406) {
                                        var3 -= 7;
                                        int var262 = class13.field212[var3];
                                        int var263 = class13.field212[var3 + 1] << 1;
                                        int var264 = class13.field212[var3 + 2];
                                        int var265 = class13.field212[var3 + 3];
                                        int var266 = class13.field212[var3 + 4];
                                        int var267 = class13.field212[var3 + 6];
                                        int var268 = class13.field212[var3 + 5];
                                        if (var262 >= 0 && var262 < 2 && class228.field3568[var262] != null && var263 >= 0 && var263 < class228.field3568[var262].length) {
                                            class228.field3568[var262][var263] = new int[] { (class32.method199(268421724, var264) >> 14) * 128, var265, class32.method199(var264, 16383) * 128, var267 };
                                            class228.field3568[var262][var263 + 1] = new int[] { class32.method199(var266 >> 14, 16383) * 128, var268, class32.method199(16383, var266) * 128 };
                                        }
                                        continue;
                                    }
                                    if (var538 == 5407) {
                                        var3--;
                                        int var269 = class228.field3568[class13.field212[var3]].length >> 1;
                                        class13.field212[var3++] = var269;
                                        continue;
                                    }
                                    if (var538 == 5411) {
                                        if (class31.field469 == null) {
                                            class60.method378(false, class213.method1331((byte) -58), (byte) 115);
                                        } else {
                                            System.exit(0);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5419) {
                                        String var270 = "";
                                        if (class2.field16 != null) {
                                            if (class2.field16.field4567 == null) {
                                                var270 = class59.method374(class2.field16.field4569, true);
                                            } else {
                                                var270 = (String) class2.field16.field4567;
                                            }
                                        }
                                        class309.field4963[var6++] = var270;
                                        continue;
                                    }
                                    if (var538 == 5420) {
                                        class13.field212[var3++] = class52.field745 == 3 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 5421) {
                                        var3--;
                                        boolean var271 = class13.field212[var3] == 1;
                                        var6--;
                                        String var272 = class309.field4963[var6];
                                        String var273 = class213.method1331((byte) -58) + var272;
                                        if (class31.field469 != null || var271 && class52.field745 != 3 && class52.field736.startsWith("win") && !class228.field3574) {
                                            class141.field1942 = var271;
                                            class298.field4746 = var273;
                                            class205.field3072 = class45.field667.method326(23521, var273);
                                            continue;
                                        }
                                        class60.method378(var271, var273, (byte) -51);
                                        continue;
                                    }
                                    if (var538 == 5422) {
                                        var6 -= 2;
                                        String var274 = class309.field4963[var6];
                                        String var275 = class309.field4963[var6 + 1];
                                        var3--;
                                        int var276 = class13.field212[var3];
                                        if (var274.length() > 0) {
                                            if (class305.field4900 == null) {
                                                class305.field4900 = new String[class92.field1349[class188.field2856]];
                                            }
                                            class305.field4900[var276] = var274;
                                        }
                                        if (var275.length() > 0) {
                                            if (field3515 == null) {
                                                field3515 = new String[class92.field1349[class188.field2856]];
                                            }
                                            field3515[var276] = var275;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5423) {
                                        var6--;
                                        System.out.println(class309.field4963[var6]);
                                        continue;
                                    }
                                    if (var538 == 5424) {
                                        var3 -= 11;
                                        class104.field1506 = class13.field212[var3];
                                        class53.field757 = class13.field212[var3 + 1];
                                        class218.field3388 = class13.field212[var3 + 2];
                                        class88.field1268 = class13.field212[var3 + 3];
                                        class142.field1949 = class13.field212[var3 + 4];
                                        class249.field3898 = class13.field212[var3 + 5];
                                        class154.field2139 = class13.field212[var3 + 6];
                                        class108.field1544 = class13.field212[var3 + 7];
                                        class111.field1588 = class13.field212[var3 + 8];
                                        class190.field2882 = class13.field212[var3 + 9];
                                        class198.field3030 = class13.field212[var3 + 10];
                                        class311.field5009.method2056(true, class142.field1949);
                                        class311.field5009.method2056(true, class249.field3898);
                                        class311.field5009.method2056(true, class154.field2139);
                                        class311.field5009.method2056(true, class108.field1544);
                                        class311.field5009.method2056(true, class111.field1588);
                                        class158.field2193 = true;
                                        continue;
                                    }
                                    if (var538 == 5425) {
                                        class193.method1222(0);
                                        class158.field2193 = false;
                                        continue;
                                    }
                                    if (var538 == 5426) {
                                        var3--;
                                        class75.field1054 = class13.field212[var3];
                                        continue;
                                    }
                                    if (var538 == 5427) {
                                        var3 -= 2;
                                        class256.field4085 = class13.field212[var3];
                                        class228.field3569 = class13.field212[var3 + 1];
                                        continue;
                                    }
                                    if (var538 == 5428) {
                                        var3 -= 2;
                                        int var277 = class13.field212[var3];
                                        int var278 = class13.field212[var3 + 1];
                                        class13.field212[var3++] = class138.method872(var277, true, var278) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var538 < 5600) {
                                    if (var538 == 5500) {
                                        var3 -= 4;
                                        int var202 = class13.field212[var3 + 1];
                                        int var203 = class13.field212[var3 + 2];
                                        int var204 = class13.field212[var3];
                                        int var205 = class13.field212[var3 + 3];
                                        class71.method475(false, ((var204 & 0xFFFD759) >> 14) - class228.field3570, var205, var202, arg2 - 44258, var203, (var204 & 0x3FFF) - class170.field2421);
                                        continue;
                                    }
                                    if (var538 == 5501) {
                                        var3 -= 4;
                                        int var206 = class13.field212[var3];
                                        int var207 = class13.field212[var3 + 1];
                                        int var208 = class13.field212[var3 + 3];
                                        int var209 = class13.field212[var3 + 2];
                                        class182.method1162((var206 & 0x3FFF) - class170.field2421, var208, var207, false, var209, (var206 >> 14 & 0x3FFF) - class228.field3570);
                                        continue;
                                    }
                                    if (var538 == 5502) {
                                        var3 -= 6;
                                        int var210 = class13.field212[var3];
                                        if (var210 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class300.field4766 = var210;
                                        int var211 = class13.field212[var3 + 1];
                                        if (var211 + 1 >= class228.field3568[class300.field4766].length >> 1) {
                                            throw new RuntimeException();
                                        }
                                        class305.field4912 = 0;
                                        class178.field2572 = var211;
                                        class267.field4287 = class13.field212[var3 + 2];
                                        class82.field1124 = class13.field212[var3 + 3];
                                        int var212 = class13.field212[var3 + 4];
                                        if (var212 >= 2) {
                                            throw new RuntimeException();
                                        }
                                        class80.field1107 = var212;
                                        int var213 = class13.field212[var3 + 5];
                                        if ((class228.field3568[class80.field1107].length >> 1) <= (var213 + 1)) {
                                            throw new RuntimeException();
                                        }
                                        class21.field347 = var213;
                                        class12.field203 = 3;
                                        continue;
                                    }
                                    if (var538 == 5503) {
                                        class167.method1074((byte) 25);
                                        continue;
                                    }
                                    if (var538 == 5504) {
                                        var3 -= 2;
                                        class99.method641(class13.field212[var3 + 1], -1506, class13.field212[var3]);
                                        continue;
                                    }
                                    if (var538 == 5505) {
                                        class13.field212[var3++] = (int) class160.field2239;
                                        continue;
                                    }
                                    if (var538 == 5506) {
                                        class13.field212[var3++] = (int) class123.field1743;
                                        continue;
                                    }
                                    if (var538 == 5507) {
                                        class159.method991(false);
                                        continue;
                                    }
                                    if (var538 == 5508) {
                                        class184.method1174(57);
                                        continue;
                                    }
                                    if (var538 == 5509) {
                                        class223.method1468(arg2 ^ 0xFFFFB6C0);
                                        continue;
                                    }
                                    if (var538 == 5510) {
                                        class243.method1597(arg2 - 28592);
                                        continue;
                                    }
                                    if (var538 == 5511) {
                                        var3--;
                                        int var214 = class13.field212[var3];
                                        class12.field203 = 4;
                                        int var215 = (var214 & 0xFFFF5B5) >> 14;
                                        int var216 = var215 - class228.field3570;
                                        int var217 = var214 & 0x3FFF;
                                        if (var216 < 0) {
                                            var216 = 0;
                                        } else if (var216 >= 104) {
                                            var216 = 104;
                                        }
                                        class249.field3894 = var216 * 128 + 64;
                                        int var218 = var217 - class170.field2421;
                                        if (var218 < 0) {
                                            var218 = 0;
                                        } else if (var218 >= 104) {
                                            var218 = 104;
                                        }
                                        class50.field711 = var218 * 128 + 64;
                                        continue;
                                    }
                                    if (var538 == 5512) {
                                        class216.method1407(94);
                                        continue;
                                    }
                                } else if (var538 < 5700) {
                                    if (var538 == 5600) {
                                        var6 -= 2;
                                        String var253 = class309.field4963[var6 + 1];
                                        var3--;
                                        int var254 = class13.field212[var3];
                                        String var255 = class309.field4963[var6];
                                        if (class142.field1961 == 10 && class84.field1180 == 0 && class110.field1584 == 0 && class179.field2714 == 0 && class223.field3480 == 0) {
                                            class59.method373(var253, var255, (byte) 22, var254);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5601) {
                                        class26.method173(false);
                                        continue;
                                    }
                                    if (var538 == 5602) {
                                        if (class110.field1584 == 0) {
                                            class174.field2457 = -2;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5603) {
                                        var3 -= 4;
                                        if (class142.field1961 == 10 && class84.field1180 == 0 && class110.field1584 == 0 && class179.field2714 == 0 && class223.field3480 == 0) {
                                            class195.method1231(class13.field212[var3 + 1], class13.field212[var3 + 3], (byte) -76, class13.field212[var3], class13.field212[var3 + 2]);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5604) {
                                        var6--;
                                        if (class142.field1961 == 10 && class84.field1180 == 0 && class110.field1584 == 0 && class179.field2714 == 0 && class223.field3480 == 0) {
                                            class228.method1512(arg2 ^ 0x6FFE, class92.method594(-15250, class309.field4963[var6]));
                                        }
                                        continue;
                                    }
                                    if (var538 == 5605) {
                                        var3 -= 7;
                                        var6 -= 3;
                                        if (class142.field1961 == 10 && class84.field1180 == 0 && class110.field1584 == 0 && class179.field2714 == 0 && class223.field3480 == 0) {
                                            class246.method1610(class309.field4963[var6 + 1], class13.field212[var3 + 6] == 1, (byte) -68, class13.field212[var3 + 1], class92.method594(-15250, class309.field4963[var6]), class13.field212[var3 + 2], class13.field212[var3 + 4] == 1, class309.field4963[var6 + 2], class13.field212[var3 + 3], class13.field212[var3], class13.field212[var3 + 5] == 1);
                                        }
                                        continue;
                                    }
                                    if (var538 == 5606) {
                                        if (class179.field2714 == 0) {
                                            class168.field2405 = -2;
                                        }
                                        continue;
                                    }
                                    if (var538 == 5607) {
                                        class13.field212[var3++] = class174.field2457;
                                        continue;
                                    }
                                    if (var538 == 5608) {
                                        class13.field212[var3++] = class80.field1105;
                                        continue;
                                    }
                                    if (var538 == 5609) {
                                        class13.field212[var3++] = class168.field2405;
                                        continue;
                                    }
                                    if (var538 == 5610) {
                                        for (int var256 = 0; var256 < 5; var256++) {
                                            class309.field4963[var6++] = class298.field4755.length > var256 ? class14.method88(class298.field4755[var256], 97) : "";
                                        }
                                        class298.field4755 = null;
                                        continue;
                                    }
                                    if (var538 == 5611) {
                                        class13.field212[var3++] = class138.field1909;
                                        continue;
                                    }
                                } else if (var538 < 6100) {
                                    if (var538 == 6001) {
                                        var3--;
                                        int var219 = class13.field212[var3];
                                        if (var219 < 1) {
                                            var219 = 1;
                                        }
                                        if (var219 > 4) {
                                            var219 = 4;
                                        }
                                        class270.field4310 = var219;
                                        if (class270.field4310 == 1) {
                                            class118.method770(0.9F);
                                        }
                                        if (class270.field4310 == 2) {
                                            class118.method770(0.8F);
                                        }
                                        if (class270.field4310 == 3) {
                                            class118.method770(0.7F);
                                        }
                                        if (class270.field4310 == 4) {
                                            class118.method770(0.6F);
                                        }
                                        class194.method1224((byte) -107);
                                        class149.method929(class45.field667, arg2 - 28671);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6002) {
                                        var3--;
                                        class150.method949((byte) 56, class13.field212[var3] == 1);
                                        class186.method1179(4);
                                        class47.method293(arg2 ^ 0x6FFE);
                                        class182.method1164((byte) 118);
                                        class149.method929(class45.field667, arg2 - 28671);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6003) {
                                        var3--;
                                        class281.field4464 = class13.field212[var3] == 1;
                                        class182.method1164((byte) 65);
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6005) {
                                        var3--;
                                        class38.field583 = class13.field212[var3] == 1;
                                        class47.method293(0);
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6006) {
                                        var3--;
                                        class116.field1677 = class13.field212[var3] == 1;
                                        ((class88) class118.field1696).method570(!class116.field1677, -106);
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6007) {
                                        var3--;
                                        class288.field4598 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6008) {
                                        var3--;
                                        class103.field1483 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6009) {
                                        var3--;
                                        class78.field1087 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6010) {
                                        var3--;
                                        class68.field959 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, arg2 ^ 0xFFFF9001);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6011) {
                                        var3--;
                                        int var220 = class13.field212[var3];
                                        if (var220 < 0 || var220 > 2) {
                                            var220 = 0;
                                        }
                                        class56.field782 = var220;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6012) {
                                        var3--;
                                        class202.field3054 = class13.field212[var3] == 1;
                                        if (class270.field4310 == 1) {
                                            class118.method770(0.9F);
                                        }
                                        if (class270.field4310 == 2) {
                                            class118.method770(0.8F);
                                        }
                                        if (class270.field4310 == 3) {
                                            class118.method770(0.7F);
                                        }
                                        if (class270.field4310 == 4) {
                                            class118.method770(0.6F);
                                        }
                                        class47.method293(0);
                                        class149.method929(class45.field667, arg2 - 28671);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6014) {
                                        var3--;
                                        class314.field5048 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6015) {
                                        var3--;
                                        class108.field1548 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6016) {
                                        var3--;
                                        int var221 = class13.field212[var3];
                                        if (var221 < 0 || var221 > 2) {
                                            var221 = 0;
                                        }
                                        class179.field2716 = var221;
                                        continue;
                                    }
                                    if (var538 == 6017) {
                                        var3--;
                                        class37.field570 = class13.field212[var3] == 1;
                                        class271.method1769((byte) -50);
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6018) {
                                        var3--;
                                        int var222 = class13.field212[var3];
                                        if (var222 < 0) {
                                            var222 = 0;
                                        }
                                        if (var222 > 127) {
                                            var222 = 127;
                                        }
                                        class221.field3440 = var222;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6019) {
                                        var3--;
                                        int var223 = class13.field212[var3];
                                        if (var223 < 0) {
                                            var223 = 0;
                                        }
                                        if (var223 > 255) {
                                            var223 = 255;
                                        }
                                        if (class51.field716 != var223) {
                                            if (class51.field716 == 0 && class102.field1457 != -1) {
                                                class80.method510(class240.field3737, true, false, 0, var223, class102.field1457);
                                                class137.field1876 = false;
                                            } else if (var223 == 0) {
                                                class117.method748(-118);
                                                class137.field1876 = false;
                                            } else {
                                                class119.method773(115, var223);
                                            }
                                            class51.field716 = var223;
                                        }
                                        class149.method929(class45.field667, arg2 - 28671);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6020) {
                                        var3--;
                                        int var224 = class13.field212[var3];
                                        if (var224 < 0) {
                                            var224 = 0;
                                        }
                                        if (var224 > 127) {
                                            var224 = 127;
                                        }
                                        class209.field3110 = var224;
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        continue;
                                    }
                                    if (var538 == 6021) {
                                        var3--;
                                        class175.field2471 = class13.field212[var3] == 1;
                                        class182.method1164((byte) 121);
                                        continue;
                                    }
                                    if (var538 == 6023) {
                                        boolean var225 = false;
                                        var3--;
                                        int var226 = class13.field212[var3];
                                        if (var226 < 0) {
                                            var226 = 0;
                                        }
                                        if (var226 > 2) {
                                            var226 = 2;
                                        }
                                        if (class42.field632 < 96) {
                                            var225 = true;
                                            var226 = 0;
                                        }
                                        class220.method1445(var226);
                                        class149.method929(class45.field667, -1);
                                        class25.field402 = false;
                                        class13.field212[var3++] = var225 ? 0 : 1;
                                        continue;
                                    }
                                    if (var538 == 6024) {
                                        var3--;
                                        int var227 = class13.field212[var3];
                                        if (var227 < 0 || var227 > 2) {
                                            var227 = 0;
                                        }
                                        class181.field2741 = var227;
                                        class149.method929(class45.field667, -1);
                                        continue;
                                    }
                                    if (var538 == 6027) {
                                        var3--;
                                        continue;
                                    }
                                    if (var538 == 6028) {
                                        var3--;
                                        class175.field2470 = class13.field212[var3] != 0;
                                        class149.method929(class45.field667, arg2 - 28671);
                                        continue;
                                    }
                                } else if (var538 < 6200) {
                                    if (var538 == 6101) {
                                        class13.field212[var3++] = class270.field4310;
                                        continue;
                                    }
                                    if (var538 == 6102) {
                                        class13.field212[var3++] = class294.method1973(2) ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6103) {
                                        class13.field212[var3++] = class281.field4464 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6105) {
                                        class13.field212[var3++] = class38.field583 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6106) {
                                        class13.field212[var3++] = class116.field1677 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6107) {
                                        class13.field212[var3++] = class288.field4598 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6108) {
                                        class13.field212[var3++] = class103.field1483 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6109) {
                                        class13.field212[var3++] = class78.field1087 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6110) {
                                        class13.field212[var3++] = class68.field959 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6111) {
                                        class13.field212[var3++] = class56.field782;
                                        continue;
                                    }
                                    if (var538 == 6112) {
                                        class13.field212[var3++] = class202.field3054 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6114) {
                                        class13.field212[var3++] = class314.field5048 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6115) {
                                        class13.field212[var3++] = class108.field1548 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6116) {
                                        class13.field212[var3++] = class179.field2716;
                                        continue;
                                    }
                                    if (var538 == 6117) {
                                        class13.field212[var3++] = class37.field570 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6118) {
                                        class13.field212[var3++] = class221.field3440;
                                        continue;
                                    }
                                    if (var538 == 6119) {
                                        class13.field212[var3++] = class51.field716;
                                        continue;
                                    }
                                    if (var538 == 6120) {
                                        class13.field212[var3++] = class209.field3110;
                                        continue;
                                    }
                                    if (var538 == 6121) {
                                        class13.field212[var3++] = 0;
                                        continue;
                                    }
                                    if (var538 == 6123) {
                                        class13.field212[var3++] = class220.method1441();
                                        continue;
                                    }
                                    if (var538 == 6124) {
                                        class13.field212[var3++] = class181.field2741;
                                        continue;
                                    }
                                    if (var538 == 6126) {
                                        class13.field212[var3++] = 0;
                                        continue;
                                    }
                                    if (var538 == 6127) {
                                        class13.field212[var3++] = class139.field1929 ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6128) {
                                        class13.field212[var3++] = class175.field2470 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var538 < 6300) {
                                    if (var538 == 6200) {
                                        var3 -= 2;
                                        class104.field1500 = (short) class13.field212[var3];
                                        if (class104.field1500 <= 0) {
                                            class104.field1500 = 256;
                                        }
                                        class48.field691 = (short) class13.field212[var3 + 1];
                                        if (class48.field691 <= 0) {
                                            class48.field691 = 205;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6201) {
                                        var3 -= 2;
                                        class310.field4986 = (short) class13.field212[var3];
                                        if (class310.field4986 <= 0) {
                                            class310.field4986 = 256;
                                        }
                                        class190.field2886 = (short) class13.field212[var3 + 1];
                                        if (class190.field2886 <= 0) {
                                            class190.field2886 = 320;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6202) {
                                        var3 -= 4;
                                        class292.field4655 = (short) class13.field212[var3];
                                        if (class292.field4655 <= 0) {
                                            class292.field4655 = 1;
                                        }
                                        class123.field1742 = (short) class13.field212[var3 + 1];
                                        if (class123.field1742 <= 0) {
                                            class123.field1742 = 32767;
                                        } else if (class123.field1742 < class292.field4655) {
                                            class123.field1742 = class292.field4655;
                                        }
                                        class102.field1458 = (short) class13.field212[var3 + 2];
                                        if (class102.field1458 <= 0) {
                                            class102.field1458 = 1;
                                        }
                                        class54.field779 = (short) class13.field212[var3 + 3];
                                        if (class54.field779 <= 0) {
                                            class54.field779 = 32767;
                                        } else if (class102.field1458 > class54.field779) {
                                            class54.field779 = class102.field1458;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6203) {
                                        class90.method583(false, -9474, class215.field3250.field2529, class215.field3250.field2571, 0, 0);
                                        class13.field212[var3++] = class167.field2377;
                                        class13.field212[var3++] = class260.field4185;
                                        continue;
                                    }
                                    if (var538 == 6204) {
                                        class13.field212[var3++] = class310.field4986;
                                        class13.field212[var3++] = class190.field2886;
                                        continue;
                                    }
                                    if (var538 == 6205) {
                                        class13.field212[var3++] = class104.field1500;
                                        class13.field212[var3++] = class48.field691;
                                        continue;
                                    }
                                } else if (var538 < 6400) {
                                    if (var538 == 6300) {
                                        class13.field212[var3++] = (int) (class299.method2006(9594) / 60000L);
                                        continue;
                                    }
                                    if (var538 == 6301) {
                                        class13.field212[var3++] = (int) (class299.method2006(arg2 - 19076) / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var538 == 6302) {
                                        var3 -= 3;
                                        int var228 = class13.field212[var3];
                                        int var229 = class13.field212[var3 + 2];
                                        int var230 = class13.field212[var3 + 1];
                                        class104.field1495.clear();
                                        class104.field1495.set(11, 12);
                                        class104.field1495.set(var229, var230, var228);
                                        class13.field212[var3++] = (int) (class104.field1495.getTime().getTime() / 86400000L) - 11745;
                                        continue;
                                    }
                                    if (var538 == 6303) {
                                        class104.field1495.clear();
                                        class104.field1495.setTime(new Date(class299.method2006(9594)));
                                        class13.field212[var3++] = class104.field1495.get(1);
                                        continue;
                                    }
                                    if (var538 == 6304) {
                                        var3--;
                                        int var231 = class13.field212[var3];
                                        boolean var232 = true;
                                        if (var231 < 0) {
                                            var232 = (var231 + 1) % 4 == 0;
                                        } else if (var231 < 1582) {
                                            var232 = (var231 % 4) == 0;
                                        } else if ((var231 % 4) != 0) {
                                            var232 = false;
                                        } else if (var231 % 100 != 0) {
                                            var232 = true;
                                        } else if ((var231 % 400) != 0) {
                                            var232 = false;
                                        }
                                        class13.field212[var3++] = var232 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var538 < 6500) {
                                    if (var538 == 6405) {
                                        class13.field212[var3++] = class234.method1540((byte) -86) ? 1 : 0;
                                        continue;
                                    }
                                    if (var538 == 6406) {
                                        class13.field212[var3++] = class132.method839(-9463) ? 1 : 0;
                                        continue;
                                    }
                                } else if (var538 < 6600) {
                                    if (var538 == 6500) {
                                        if (class142.field1961 == 10 && class84.field1180 == 0 && class110.field1584 == 0 && class179.field2714 == 0) {
                                            class13.field212[var3++] = class85.method555(96) == -1 ? 0 : 1;
                                            continue;
                                        }
                                        class13.field212[var3++] = 1;
                                        continue;
                                    }
                                    if (var538 == 6501) {
                                        class248 var241 = class138.method883((byte) -66);
                                        if (var241 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = 0;
                                            class309.field4963[var6++] = "";
                                            class13.field212[var3++] = 0;
                                            class309.field4963[var6++] = "";
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var241.field3878;
                                            class13.field212[var3++] = var241.field3941;
                                            class309.field4963[var6++] = var241.field3881;
                                            class250 var242 = var241.method1619((byte) -123);
                                            class13.field212[var3++] = var242.field3903;
                                            class309.field4963[var6++] = var242.field3902;
                                            class13.field212[var3++] = var241.field3931;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6502) {
                                        class248 var243 = class65.method400(-72);
                                        if (var243 == null) {
                                            class13.field212[var3++] = -1;
                                            class13.field212[var3++] = 0;
                                            class309.field4963[var6++] = "";
                                            class13.field212[var3++] = 0;
                                            class309.field4963[var6++] = "";
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var243.field3878;
                                            class13.field212[var3++] = var243.field3941;
                                            class309.field4963[var6++] = var243.field3881;
                                            class250 var244 = var243.method1619((byte) -120);
                                            class13.field212[var3++] = var244.field3903;
                                            class309.field4963[var6++] = var244.field3902;
                                            class13.field212[var3++] = var243.field3931;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6503) {
                                        var3--;
                                        int var245 = class13.field212[var3];
                                        if (class142.field1961 == 10 && class84.field1180 == 0 && class110.field1584 == 0 && class179.field2714 == 0) {
                                            class13.field212[var3++] = class221.method1449(0, var245) ? 1 : 0;
                                            continue;
                                        }
                                        class13.field212[var3++] = 0;
                                        continue;
                                    }
                                    if (var538 == 6504) {
                                        var3--;
                                        class71.field1028 = class13.field212[var3];
                                        class149.method929(class45.field667, -1);
                                        continue;
                                    }
                                    if (var538 == 6505) {
                                        class13.field212[var3++] = class71.field1028;
                                        continue;
                                    }
                                    if (var538 == 6506) {
                                        var3--;
                                        int var246 = class13.field212[var3];
                                        class248 var247 = class202.method1261(20006, var246);
                                        if (var247 == null) {
                                            class13.field212[var3++] = -1;
                                            class309.field4963[var6++] = "";
                                            class13.field212[var3++] = 0;
                                            class309.field4963[var6++] = "";
                                            class13.field212[var3++] = 0;
                                        } else {
                                            class13.field212[var3++] = var247.field3941;
                                            class309.field4963[var6++] = var247.field3881;
                                            class250 var248 = var247.method1619((byte) 32);
                                            class13.field212[var3++] = var248.field3903;
                                            class309.field4963[var6++] = var248.field3902;
                                            class13.field212[var3++] = var247.field3931;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6507) {
                                        var3 -= 4;
                                        int var249 = class13.field212[var3];
                                        boolean var250 = class13.field212[var3 + 1] == 1;
                                        int var251 = class13.field212[var3 + 2];
                                        boolean var252 = class13.field212[var3 + 3] == 1;
                                        class148.method926(var252, var251, var249, var250, arg2 ^ 0xFFFF9001);
                                        continue;
                                    }
                                } else if (var538 < 6700) {
                                    if (var538 == 6600) {
                                        var3--;
                                        class78.field1085 = class13.field212[var3] == 1;
                                        class149.method929(class45.field667, arg2 ^ 0xFFFF9001);
                                        continue;
                                    }
                                    if (var538 == 6601) {
                                        class13.field212[var3++] = class78.field1085 ? 1 : 0;
                                        continue;
                                    }
                                } else if (var538 < 6900) {
                                    if (var538 == 6800) {
                                        var3--;
                                        int var233 = class13.field212[var3];
                                        class149 var234 = class121.method784(-88, var233);
                                        if (var234.field2068 == null) {
                                            class309.field4963[var6++] = "";
                                        } else {
                                            class309.field4963[var6++] = var234.field2068;
                                        }
                                        continue;
                                    }
                                    if (var538 == 6801) {
                                        var3--;
                                        int var235 = class13.field212[var3];
                                        class149 var236 = class121.method784(91, var235);
                                        class13.field212[var3++] = var236.field2072;
                                        continue;
                                    }
                                    if (var538 == 6802) {
                                        var3--;
                                        int var237 = class13.field212[var3];
                                        class149 var238 = class121.method784(86, var237);
                                        class13.field212[var3++] = var238.field2044;
                                        continue;
                                    }
                                    if (var538 == 6803) {
                                        var3--;
                                        int var239 = class13.field212[var3];
                                        class149 var240 = class121.method784(-62, var239);
                                        class13.field212[var3++] = var240.field2059;
                                        continue;
                                    }
                                }
                            } else if (var538 == 4500) {
                                var3 -= 2;
                                int var348 = class13.field212[var3];
                                int var349 = class13.field212[var3 + 1];
                                class267 var350 = class218.method1422((byte) 117, var349);
                                if (var350.method1751(true)) {
                                    class309.field4963[var6++] = class26.method172(var348, arg2 - 28612).method1155((byte) -87, var350.field4293, var349);
                                } else {
                                    class13.field212[var3++] = class26.method172(var348, class207.method1290(arg2, 28616)).method1154(148, var349, var350.field4294);
                                }
                                continue;
                            }
                        } else if (var538 == 4400) {
                            var3 -= 2;
                            int var351 = class13.field212[var3 + 1];
                            int var352 = class13.field212[var3];
                            class267 var353 = class218.method1422((byte) 114, var351);
                            if (var353.method1751(true)) {
                                class309.field4963[var6++] = class265.method1717(-98, var352).method1575(var353.field4293, -18661, var351);
                            } else {
                                class13.field212[var3++] = class265.method1717(class207.method1290(arg2, 28614), var352).method1569(var353.field4294, var351, 7016);
                            }
                            continue;
                        }
                    } else if (var538 == 4300) {
                        var3 -= 2;
                        int var354 = class13.field212[var3];
                        int var355 = class13.field212[var3 + 1];
                        class267 var356 = class218.method1422((byte) 125, var355);
                        if (var356.method1751(true)) {
                            class309.field4963[var6++] = class76.method499((byte) 44, var354).method1307(var355, var356.field4293, 4);
                        } else {
                            class13.field212[var3++] = class76.method499((byte) 118, var354).method1315(var356.field4294, arg2 - 28547, var355);
                        }
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var537) {
            if (arg1.field640 == null) {
                if (class241.field3789 != 0) {
                    class89.method573("Clientscript error - check log for details", (byte) -123);
                }
                class121.method780(arg2 - 28510, "CS2 - scr:" + arg1.field2141 + " op:" + var7, var537);
            } else {
                StringBuffer var534 = new StringBuffer(30);
                var534.append("%0a - in: ").append(arg1.field640);
                for (int var535 = class112.field1614 - 1; var535 >= 0; var535--) {
                    var534.append("%0a - via: ").append(class236.field3671[var535].field674.field640);
                }
                if (var7 == 40) {
                    int var536 = var8[var4];
                    var534.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var536));
                }
                if (class241.field3789 != 0) {
                    class89.method573("Clientscript error in: " + arg1.field640, (byte) -117);
                }
                class121.method780(160, "CS2 - scr:" + arg1.field2141 + " op:" + var7 + var534.toString(), var537);
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)Lhb;")
    public final class154 method1492(int arg0) {
        field3522++;
        if (arg0 != -1) {
            method1493(91, 98, -84);
        }
        return this.field3532.method1458(0);
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
    private static final int method1493(int arg0, int arg1, int arg2) {
        class205 var3 = (class205) class278.field4412.method1453(true, (long) arg2);
        field3512++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = arg1;
            for (int var5 = 0; var5 < var3.field3061.length; var5++) {
                if (var3.field3069[var5] == arg0) {
                    var4 += var3.field3061[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(ILnh;)I")
    public static final int method1494(int arg0, class305 arg1) {
        field3524++;
        int var2 = arg0;
        if (arg1.method2056(true, class314.field5029)) {
            var2 = arg0 + 1;
        }
        if (arg1.method2056(true, class126.field1774)) {
            var2++;
        }
        if (arg1.method2056(true, class194.field2965)) {
            var2++;
        }
        if (arg1.method2056(true, class258.field4177)) {
            var2++;
        }
        if (arg1.method2056(true, class121.field1725)) {
            var2++;
        }
        if (arg1.method2056(true, class38.field576)) {
            var2++;
        }
        if (arg1.method2056(true, class230.field3604)) {
            var2++;
        }
        if (arg1.method2056(true, class72.field1039)) {
            var2++;
        }
        if (arg1.method2056(true, class278.field4413)) {
            var2++;
        }
        if (arg1.method2056(true, class291.field4643)) {
            var2++;
        }
        if (arg1.method2056(true, class170.field2419)) {
            var2++;
        }
        if (arg1.method2056(true, class243.field3824)) {
            var2++;
        }
        if (arg1.method2056(true, class15.field264)) {
            var2++;
        }
        if (arg1.method2056(true, class48.field696)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lhb;")
    public final class154 method1495(byte arg0) {
        if (arg0 != 95) {
            this.method1492(-18);
        }
        field3521++;
        return this.field3532.method1462(-10000001);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)V")
    public static void method1496(boolean arg0) {
        field3526 = null;
        field3515 = null;
        field3525 = null;
        if (arg0) {
            method1490(false, 7, -124, -59, 81, -33);
        }
    }

    @OriginalMember(owner = "client!td", name = "<init>", descriptor = "(I)V")
    public class225(int arg0) {
        this.field3531 = arg0;
        this.field3533 = arg0;
        int var2;
        for (var2 = 1; var2 + var2 < arg0; var2 += var2) {
        }
        this.field3532 = new class222(var2);
    }
}
