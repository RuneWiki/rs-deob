import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class377 {

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "[I")
    private int[] field5197;

    @OriginalMember(owner = "client!ws", name = "o", descriptor = "[I")
    private int[] field5208;

    @OriginalMember(owner = "client!ws", name = "f", descriptor = "I")
    public static int field5199 = -1;

    @OriginalMember(owner = "client!ws", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field5210 = new String[200];

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "I")
    private int field5194;

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "I")
    private int field5195;

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "I")
    private int field5196;

    @OriginalMember(owner = "client!ws", name = "e", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!ws", name = "g", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!ws", name = "h", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!ws", name = "i", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!ws", name = "j", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!ws", name = "k", descriptor = "I")
    private int field5204;

    @OriginalMember(owner = "client!ws", name = "l", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!ws", name = "m", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!ws", name = "n", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!ws", name = "p", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)V")
    private final void method2332(byte arg0) {
        field5202++;
        if (arg0 > -26) {
            return;
        }
        this.field5194 += ++this.field5204;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field5197[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5196 ^= this.field5196 << 13;
                } else {
                    this.field5196 ^= this.field5196 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5196 ^= this.field5196 << 2;
            } else {
                this.field5196 ^= this.field5196 >>> 16;
            }
            this.field5196 += this.field5197[var2 + 128 & 0xFF];
            int var4;
            this.field5197[var2] = var4 = this.field5197[class702.method3977(255, var3 >> 2)] + this.field5196 + this.field5194;
            this.field5208[var2] = this.field5194 = this.field5197[class702.method3977(261306, var4) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IZI)V")
    public static final void method2333(int arg0, boolean arg1, int arg2) {
        field5198++;
        class344 var3 = arg1 ? class673.field9377 : class259.field3811;
        if (var3 == null || arg0 < 0 || arg0 >= var3.field4797) {
            return;
        }
        class310 var4 = var3.field4799[arg0];
        if (var4.field4427 != -1) {
            return;
        }
        if (arg2 != 5) {
            field5210 = null;
        }
        String var5 = var4.field4428;
        class312 var6 = class353.method2245(class87.field971, class257.field3774, (byte) 20);
        var6.field4445.method2952(0, class348.method2204((byte) -55, var5) + 3);
        var6.field4445.method2952(arg2 - 5, arg1 ? 1 : 0);
        var6.field4445.method2957(arg0, 1267307848);
        var6.field4445.method2953(var5, arg2 ^ 0xFFFF921D);
        class208.method1440(var6, 104);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(I)I")
    public final int method2334(int arg0) {
        if (this.field5195 == 0) {
            this.method2332((byte) -40);
            this.field5195 = 256;
        }
        field5206++;
        if (arg0 > -31) {
            method2333(-12, false, -6);
        }
        return this.field5208[--this.field5195];
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)V")
    public static final void method2335(int arg0) {
        field5201++;
        class5.field40.method3996(true, 5);
        class207.field3200.method3920(5, -22893);
        class386.field5352.method1223(5, (byte) -77);
        class277.field4038.method3914((byte) 27, 5);
        class575.field8103.method2438(15745, 5);
        class313.field4456.method1671(118, 5);
        class563.field7993.method649(5, -89);
        class456.field6385.method2387(5, 64);
        class95.field1084.method1420(5, 1);
        if (arg0 > -117) {
            return;
        }
        class653.field9128.method21(5, 15361);
        class564.field7999.method2466(5, 0);
        class541.field7792.method1721((byte) 117, 5);
        class53.field669.method1235(-98, 5);
        class618.field8642.method4325(5, -127);
        class184.field2832.method4115(5, 11);
        class240.field3602.method3426(16384, 5);
        class107.field1602.method1932((byte) 117, 5);
        class316.field4491.method2607(0, 5);
        class518.field7313.method32(490, 5);
        class186.field2845.method3248(true, 5);
        class89.field1002.method2825(5, (byte) 79);
        class532.field7690.method1453(5, 20);
        class503.method3043(5, 8128);
        class575.method3379((byte) -72, 50);
        class353.method2247(50, 0);
        class189.method1320(5, (byte) -112);
        class543.method3244((byte) -104, 5);
        class386.field5353.method3741(5, 0);
        class284.field4192.method3741(5, 0);
        class354.field4977.method3741(5, 0);
        class483.field6802.method3741(5, 0);
        class379.field5225.method3741(5, 0);
    }

    @OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)I")
    public final int method2336(int arg0) {
        if (arg0 != 2015625216) {
            this.field5196 = 86;
        }
        field5200++;
        if (this.field5195 == 0) {
            this.method2332((byte) -74);
            this.field5195 = 256;
        }
        return this.field5208[this.field5195 - 1];
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V")
    public static void method2337(int arg0) {
        if (arg0 != 12) {
            field5207 = -118;
        }
        field5210 = null;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lso;I)Lwo;")
    public static final class775 method2338(class494 arg0, int arg1) {
        if (arg1 >= -98) {
            field5207 = -118;
        }
        field5209++;
        return new class775(arg0.method2988(-3), arg0.method2988(-3), arg0.method2988(-3), arg0.method2988(-3), arg0.method2960((byte) 94), arg0.method2960((byte) 94), arg0.method2964((byte) 48));
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "()V")
    private class377() {
    }

    @OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
    private final void method2339(byte arg0) {
        field5205++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var63;
            int var67 = var66 ^ var63 << 8;
            int var68 = var4 + var67;
            int var69 = var63 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            int var71 = var3 + var6;
            var5 = var70 ^ var68 << 10;
            int var72 = var68 + var71;
            int var73 = var2 + var5;
            var4 = var72 ^ var71 >>> 4;
            int var74 = var71 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var75;
        }
        int var11 = 0;
        if (arg0 >= -72) {
            return;
        }
        while (var11 < 256) {
            int var37 = this.field5208[var11 + 4] + var5;
            int var38 = this.field5208[var11 + 6] + var3;
            int var39 = this.field5208[var11 + 7] + var2;
            int var40 = this.field5208[var11 + 5] + var4;
            int var41 = this.field5208[var11 + 2] + var7;
            int var42 = this.field5208[var11 + 3] + var6;
            int var43 = this.field5208[var11 + 1] + var8;
            int var44 = this.field5208[var11] + var9;
            int var45 = var44 ^ var43 << 11;
            int var46 = var42 + var45;
            int var47 = var41 + var43;
            int var48 = var47 ^ var41 >>> 2;
            int var49 = var37 + var48;
            int var50 = var41 + var46;
            int var51 = var50 ^ var46 << 8;
            int var52 = var40 + var51;
            int var53 = var46 + var49;
            var6 = var53 ^ var49 >>> 16;
            int var54 = var49 + var52;
            int var55 = var6 + var38;
            var5 = var54 ^ var52 << 10;
            int var56 = var5 + var39;
            int var57 = var52 + var55;
            var4 = var57 ^ var55 >>> 4;
            int var58 = var4 + var45;
            int var59 = var55 + var56;
            var3 = var59 ^ var56 << 8;
            int var60 = var56 + var58;
            var8 = var3 + var48;
            var2 = var60 ^ var58 >>> 9;
            var7 = var2 + var51;
            var9 = var8 + var58;
            this.field5197[var11] = var9;
            this.field5197[var11 + 1] = var8;
            this.field5197[var11 + 2] = var7;
            this.field5197[var11 + 3] = var6;
            this.field5197[var11 + 4] = var5;
            this.field5197[var11 + 5] = var4;
            this.field5197[var11 + 6] = var3;
            this.field5197[var11 + 7] = var2;
            var11 += 8;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field5197[var12 + 2] + var7;
            int var14 = this.field5197[var12] + var9;
            int var15 = this.field5197[var12 + 3] + var6;
            int var16 = this.field5197[var12 + 6] + var3;
            int var17 = this.field5197[var12 + 4] + var5;
            int var18 = this.field5197[var12 + 1] + var8;
            int var19 = this.field5197[var12 + 5] + var4;
            int var20 = this.field5197[var12 + 7] + var2;
            int var21 = var14 ^ var18 << 11;
            int var22 = var15 + var21;
            int var23 = var13 + var18;
            int var24 = var23 ^ var13 >>> 2;
            int var25 = var13 + var22;
            int var26 = var17 + var24;
            int var27 = var25 ^ var22 << 8;
            int var28 = var22 + var26;
            int var29 = var19 + var27;
            var6 = var28 ^ var26 >>> 16;
            int var30 = var6 + var16;
            int var31 = var26 + var29;
            var5 = var31 ^ var29 << 10;
            int var32 = var29 + var30;
            int var33 = var5 + var20;
            var4 = var32 ^ var30 >>> 4;
            int var34 = var4 + var21;
            int var35 = var30 + var33;
            var3 = var35 ^ var33 << 8;
            var8 = var3 + var24;
            int var36 = var33 + var34;
            var2 = var36 ^ var34 >>> 9;
            var9 = var8 + var34;
            var7 = var2 + var27;
            this.field5197[var12] = var9;
            this.field5197[var12 + 1] = var8;
            this.field5197[var12 + 2] = var7;
            this.field5197[var12 + 3] = var6;
            this.field5197[var12 + 4] = var5;
            this.field5197[var12 + 5] = var4;
            this.field5197[var12 + 6] = var3;
            this.field5197[var12 + 7] = var2;
        }
        this.method2332((byte) -71);
        this.field5195 = 256;
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(IIIIIIIIIILmb;I)Z")
    public static final boolean method2340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class274 arg10, int arg11) {
        field5203++;
        int var12 = arg1;
        int var13 = arg2;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg1 - var14;
        class228.field3495[var14][var15] = 99;
        int var17 = arg2 - var15;
        class673.field9380[var14][var15] = 0;
        if (arg4 != -1362) {
            return false;
        }
        byte var18 = 0;
        class753.field10404[var18] = arg1;
        int var19 = 0;
        int var35 = var18 + 1;
        class511.field7231[var18] = arg2;
        int[][] var20 = arg10.field3974;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class506.field7193 = var13;
                                    class666.field9268 = var12;
                                    return false;
                                }
                                var13 = class511.field7231[var19];
                                var12 = class753.field10404[var19];
                                var19 = var19 + 1 & 0xFFF;
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var23 = var12 - arg10.field3968;
                                var24 = var13 - arg10.field3978;
                                if (arg0 == -4) {
                                    if (arg8 == var12 && arg9 == var13) {
                                        class666.field9268 = var12;
                                        class506.field7193 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class12.method133(var12, (byte) 64, arg3, arg9, var13, arg3, arg8, arg11, arg7)) {
                                        class506.field7193 = var13;
                                        class666.field9268 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg10.method1779(var13, arg3, arg7, arg8, arg6, var12, arg9, arg11, arg3, (byte) 76)) {
                                        class506.field7193 = var13;
                                        class666.field9268 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg10.method1771(arg9, arg7, arg3, arg11, var12, (byte) 64, var13, arg8, arg6)) {
                                        class666.field9268 = var12;
                                        class506.field7193 = var13;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg10.method1769(arg3, var13, arg9, 29514, var12, arg5, arg8, arg0)) {
                                        class506.field7193 = var13;
                                        class666.field9268 = var12;
                                        return true;
                                    }
                                } else if (arg10.method1776((byte) 45, arg3, arg9, arg0, var13, var12, arg8, arg5)) {
                                    class666.field9268 = var12;
                                    class506.field7193 = var13;
                                    return true;
                                }
                                var26 = class673.field9380[var22][var21] + 1;
                                if (var22 > 0 && class228.field3495[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg3 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var27) {
                                            class753.field10404[var35] = var12 - 1;
                                            class511.field7231[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class228.field3495[var22 - 1][var21] = 2;
                                            class673.field9380[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg3 && class228.field3495[var22 + 1][var21] == 0 && (var20[arg3 + var23][var24] & 0x60E40000) == 0 && (var20[var23 + arg3][arg3 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var28) {
                                            class753.field10404[var35] = var12 + 1;
                                            class511.field7231[var35] = var13;
                                            class228.field3495[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class673.field9380[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg3 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class228.field3495[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg3 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= arg3 - 1) {
                                            class753.field10404[var35] = var12;
                                            class511.field7231[var35] = var13 - 1;
                                            class228.field3495[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class673.field9380[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var21 < 128 - arg3 && class228.field3495[var22][var21 + 1] == 0 && (var20[var23][var24 + arg3] & 0x4E240000) == 0 && (var20[var23 + arg3 - 1][var24 + arg3] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg3 - 1) <= var30) {
                                            class753.field10404[var35] = var12;
                                            class511.field7231[var35] = var13 + 1;
                                            class228.field3495[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class673.field9380[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg3 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class228.field3495[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg3 <= var31) {
                                            class753.field10404[var35] = var12 - 1;
                                            class511.field7231[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class228.field3495[var22 - 1][var21 - 1] = 3;
                                            class673.field9380[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < (128 - arg3) && var21 > 0 && class228.field3495[var22 + 1][var21 - 1] == 0 && (var20[arg3 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg3) {
                                            class753.field10404[var35] = var12 + 1;
                                            class511.field7231[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class228.field3495[var22 + 1][var21 - 1] = 9;
                                            class673.field9380[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg3 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < 128 - arg3 && class228.field3495[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg3 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg3; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg3 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class753.field10404[var35] = var12 - 1;
                                    class511.field7231[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class228.field3495[var22 - 1][var21 + 1] = 6;
                                    class673.field9380[var22 - 1][var21 + 1] = var26;
                                }
                            } while ((128 - arg3) <= var22);
                        } while (var21 >= 128 - arg3);
                    } while (class228.field3495[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg3][var24 + arg3] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg3; var34++) {
                    if ((var20[var23 + var34][var24 + arg3] & 0x7E240000) != 0 || (var20[var23 + arg3][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class753.field10404[var35] = var12 + 1;
                class511.field7231[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class228.field3495[var22 + 1][var21 + 1] = 12;
                class673.field9380[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "([I)V")
    public class377(int[] arg0) {
        this.field5197 = new int[256];
        this.field5208 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field5208[var2] = arg0[var2];
        }
        this.method2339((byte) -77);
    }
}
