import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class182 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field3340 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public static int field3344 = 0;

    @OriginalMember(owner = "client!ec", name = "v", descriptor = "Loj;")
    public static class17 field3358 = new class17(50);

    @OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
    public static int field3359 = 0;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field3338;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3341;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field3343;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "I")
    public static int field3348;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!ec", name = "u", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "J")
    private long field3346;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "J")
    private long field3352;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Z")
    public boolean field3337;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    private int[] field3342;

    @OriginalMember(owner = "client!ec", name = "r", descriptor = "[I")
    private int[] field3354;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
    public final void method1336(int arg0, int arg1, int arg2) {
        field3345++;
        int var4 = class151.field2831[arg2];
        if (this.field3354[var4] != 0 && class28.method173(3, arg1) != null) {
            this.field3354[var4] = class3.method27(arg1, arg0);
            this.method1340(arg0 + 88470024);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)V")
    public static final void method1337(boolean arg0) {
        if (arg0) {
            field3340 = 106;
        }
        field3349++;
        int var1 = class205.method1455(0);
        if (var1 == 0) {
            class125.field2411 = null;
            class235.method1635(0, 32);
        } else if (var1 == 1) {
            class11.method71((byte) 0, 114);
            class235.method1635(512, 32);
            class90.method695(-28512);
        } else {
            class11.method71((byte) (class114.field2145 - 4 & 0xFF), 123);
            class235.method1635(2, 32);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILtc;Ltc;)Lra;")
    public final class70 method1338(int arg0, int arg1, int arg2, class18 arg3, class18 arg4) {
        field3343++;
        if (this.field3353 != -1) {
            return class220.method1556(this.field3353, true).method1325(arg1, arg4, true, arg0, arg3);
        }
        int[] var6 = this.field3354;
        long var7 = this.field3352;
        if (arg3 != null && (arg3.field280 >= 0 || arg3.field269 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field3354[var9];
            }
            if (arg3.field280 >= 0) {
                if (arg3.field280 == 65535) {
                    var7 ^= 0xFFFFFFFF00000000L;
                    var6[5] = 0;
                } else {
                    var6[5] = class3.method27(arg3.field280, 1073741824);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg3.field269 >= 0) {
                if (arg3.field269 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class3.method27(1073741824, arg3.field269);
                    var7 ^= (long) var6[3];
                }
            }
        }
        class70 var10 = (class70) class169.field3096.method114(var7, arg2);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var6[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((var30 & Integer.MIN_VALUE) != 0 && !class28.method173(3, var30 & 0x3FFFFFFF).method1277(arg2 - 50)) {
                        var11 = true;
                    }
                } else if (!class120.method939(22952, var30 & 0x3FFFFFFF).method801((byte) -124, this.field3337)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field3346 != -1L) {
                    var10 = (class70) class169.field3096.method114(this.field3346, arg2);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class41[] var13 = new class41[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var6[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class41 var28 = class120.method939(22952, var27 & 0x3FFFFFFF).method797(this.field3337, 20718);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class41 var29 = class28.method173(3, var27 & 0x3FFFFFFF).method1270(0);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var6[0];
                if ((var16 & 0x40000000) != 0) {
                    class99 var17 = class120.method939(arg2 + 22952, var16 & 0x3FFFFFFF);
                    if (var17.field1894 != null) {
                        for (int var18 = 0; var18 < var17.field1894.length; var18++) {
                            if (var17.field1894[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field1894[var18][0];
                                int var20 = var17.field1894[var18][1];
                                int var21 = var17.field1894[var18][3];
                                int var22 = var17.field1894[var18][4];
                                int var23 = var17.field1894[var18][2];
                                int var24 = var17.field1894[var18][5];
                                var13[var18 + 1].method314(var19, var20, var23);
                                var13[var18 + 1].method313(var21, var22, var24);
                            }
                        }
                    }
                }
                class41 var25 = new class41(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field3342[var26] < class24.field391[var26].length) {
                        var25.method293(class16.field237[var26], class24.field391[var26][this.field3342[var26]]);
                    }
                    if (class38.field636[var26].length > this.field3342[var26]) {
                        var25.method293(class135.field2621[var26], class38.field636[var26][this.field3342[var26]]);
                    }
                }
                var10 = var25.method289(64, 850, -30, -50, -30);
                class169.field3096.method117(var10, false, var7);
                this.field3346 = var7;
            }
        }
        if (arg3 == null && arg4 == null) {
            return var10;
        }
        class70 var31;
        if (arg3 != null && arg4 != null) {
            var31 = arg3.method122(var10, arg4, arg1, arg2 ^ 0xFFFFFD5E, arg0);
        } else if (arg3 == null) {
            var31 = arg4.method121(arg0, 10, var10);
        } else {
            var31 = arg3.method121(arg1, 10, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static final void method1339(int arg0) {
        field3357++;
        if (class193.field3521 != -1) {
            class96.method763(class193.field3521, (byte) 46);
        }
        int var1 = 0;
        if (arg0 != 12468) {
            return;
        }
        while (class52.field880 > var1) {
            if (class110.field2086[var1]) {
                class91.field1671[var1] = true;
            }
            class87.field1619[var1] = class110.field2086[var1];
            class110.field2086[var1] = false;
            var1++;
        }
        class165.field3043 = null;
        class164.field3030 = class227.field4092;
        class26.field411 = -1;
        class125.field2404 = -1;
        if (class193.field3521 != -1) {
            class52.field880 = 0;
            class17.method118(class233.field4160, 0, 0, 0, class193.field3521, class205.field3706, -1, 0, (byte) 120);
        }
        class206.method1480();
        class52.field877 = 0;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
    private final void method1340(int arg0) {
        long var2 = this.field3352;
        field3350++;
        this.field3352 = -1L;
        long[] var4 = class209.field3796;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3352 = var4[(int) (((long) (this.field3354[var5] >> 24) ^ this.field3352) & 0xFFL)] ^ this.field3352 >>> 8;
            this.field3352 = var4[(int) ((this.field3352 ^ (long) (this.field3354[var5] >> 16)) & 0xFFL)] ^ this.field3352 >>> 8;
            this.field3352 = var4[(int) (((long) (this.field3354[var5] >> 8) ^ this.field3352) & 0xFFL)] ^ this.field3352 >>> 8;
            this.field3352 = var4[(int) ((this.field3352 ^ (long) this.field3354[var5]) & 0xFFL)] ^ this.field3352 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3352 = var4[(int) ((this.field3352 ^ (long) this.field3342[var6]) & 0xFFL)] ^ this.field3352 >>> 8;
        }
        if (arg0 != -2059013624) {
            this.field3342 = null;
        }
        this.field3352 = this.field3352 >>> 8 ^ var4[(int) ((this.field3352 ^ (long) (this.field3337 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field3352 != var2) {
            class169.field3096.method116(-23114, var2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBLtc;)Lra;")
    public final class70 method1341(int arg0, byte arg1, class18 arg2) {
        field3341++;
        if (this.field3353 != -1) {
            return class220.method1556(this.field3353, true).method1322(arg0, true, arg2);
        } else if (arg1 == 116) {
            class70 var4 = (class70) class115.field2190.method114(this.field3352, arg1 ^ 0x74);
            if (var4 == null) {
                boolean var5 = false;
                for (int var6 = 0; var6 < 12; var6++) {
                    int var15 = this.field3354[var6];
                    if ((var15 & 0x40000000) == 0) {
                        if ((Integer.MIN_VALUE & var15) != 0 && !class28.method173(3, var15 & 0x3FFFFFFF).method1273(0)) {
                            var5 = true;
                        }
                    } else if (!class120.method939(22952, var15 & 0x3FFFFFFF).method798(18537, this.field3337)) {
                        var5 = true;
                    }
                }
                if (var5) {
                    return null;
                }
                class41[] var7 = new class41[12];
                int var8 = 0;
                for (int var9 = 0; var9 < 12; var9++) {
                    int var12 = this.field3354[var9];
                    if ((var12 & 0x40000000) != 0) {
                        class41 var13 = class120.method939(arg1 + 22836, var12 & 0x3FFFFFFF).method806((byte) 8, this.field3337);
                        if (var13 != null) {
                            var7[var8++] = var13;
                        }
                    } else if ((Integer.MIN_VALUE & var12) != 0) {
                        class41 var14 = class28.method173(3, var12 & 0x3FFFFFFF).method1275(-1);
                        if (var14 != null) {
                            var7[var8++] = var14;
                        }
                    }
                }
                class41 var10 = new class41(var7, var8);
                for (int var11 = 0; var11 < 5; var11++) {
                    if (this.field3342[var11] < class24.field391[var11].length) {
                        var10.method293(class16.field237[var11], class24.field391[var11][this.field3342[var11]]);
                    }
                    if (class38.field636[var11].length > this.field3342[var11]) {
                        var10.method293(class135.field2621[var11], class38.field636[var11][this.field3342[var11]]);
                    }
                }
                var4 = var10.method289(64, 768, -50, -10, -50);
                class115.field2190.method117(var4, false, this.field3352);
            }
            if (arg2 != null) {
                var4 = arg2.method130(arg0, 99, var4);
            }
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)V")
    public final void method1342(int arg0, boolean arg1) {
        field3347++;
        if (arg0 != 2172) {
            method1344(false);
        }
        this.field3337 = arg1;
        this.method1340(arg0 ^ 0x8545FA74);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZB[I[II)V")
    public final void method1343(boolean arg0, byte arg1, int[] arg2, int[] arg3, int arg4) {
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class130.field2521; var7++) {
                    class171 var8 = class28.method173(3, var7);
                    if (var8 != null && !var8.field3136 && var8.field3129 == ((arg0 ? 7 : 0) + var6)) {
                        arg3[class151.field2831[var6]] = class3.method27(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field3353 = arg4;
        if (arg1 > -101) {
            this.field3346 = -16L;
        }
        this.field3342 = arg2;
        field3348++;
        this.field3337 = arg0;
        this.field3354 = arg3;
        this.method1340(-2059013624);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method1344(boolean arg0) {
        field3358 = null;
        if (arg0) {
            field3358 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
    public final void method1345(int arg0, int arg1, int arg2) {
        this.field3342[arg0] = arg2;
        this.method1340(-2059013624);
        field3355++;
        if (arg1 != 11) {
            this.field3352 = 110L;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(Z)I")
    public final int method1346(boolean arg0) {
        if (arg0) {
            return 61;
        } else {
            field3338++;
            return this.field3353 == -1 ? (this.field3354[11] << 5) + this.field3354[1] + (this.field3342[4] << 20) + (this.field3354[8] << 10) + (this.field3354[0] << 15) + (this.field3342[0] << 25) : 305419896 - -class220.method1556(this.field3353, !arg0).field3322;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lpa;B)V")
    public static final void method1347(class123 arg0, byte arg1) {
        class159.field2922 = arg0;
        if (arg1 == -64) {
            field3351++;
            class40.field664 = class159.field2922.method971(4, 0);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILtc;BI)Lra;")
    public final class70 method1348(int arg0, int arg1, class18 arg2, byte arg3, int arg4) {
        if (arg3 >= -38) {
            this.field3342 = null;
        }
        long var6 = (long) arg4 << 32 | (long) (arg0 << 16) | (long) arg4;
        class70 var8 = (class70) class115.field2190.method114(var6, 0);
        field3356++;
        if (var8 == null) {
            class41[] var9 = new class41[2];
            int var10 = 0;
            if (!class28.method173(3, arg4).method1273(0) || !class28.method173(3, arg0).method1273(0)) {
                return null;
            }
            class41 var11 = class28.method173(3, arg4).method1275(-1);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class41 var12 = class28.method173(3, arg0).method1275(-1);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class41 var13 = new class41(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field3342[var14] < class24.field391[var14].length) {
                    var13.method293(class16.field237[var14], class24.field391[var14][this.field3342[var14]]);
                }
                if (class38.field636[var14].length > this.field3342[var14]) {
                    var13.method293(class135.field2621[var14], class38.field636[var14][this.field3342[var14]]);
                }
            }
            var8 = var13.method289(64, 768, -50, -10, -50);
            class115.field2190.method117(var8, false, var6);
        }
        if (arg2 != null) {
            var8 = arg2.method130(arg1, 99, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[Lhh;II)Lhh;")
    public static final class163 method1349(int arg0, class163[] arg1, int arg2, int arg3) {
        field3339++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg1[arg0 + var5] == null) {
                arg1[arg0 + var5] = class265.field4599;
            }
            var4 += arg1[arg0 + var5].field2990;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class163 var10 = arg1[arg0 + var8];
            class241.method1667(var10.field3020, 0, var6, var7, var10.field2990);
            var7 += var10.field2990;
        }
        if (arg2 >= -79) {
            return null;
        } else {
            class163 var9 = new class163();
            var9.field2990 = var4;
            var9.field3020 = var6;
            return var9;
        }
    }
}
