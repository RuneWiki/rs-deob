import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class157 {

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "I")
    private int field2143 = 0;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "[I")
    private int[] field2150 = new int[64];

    @OriginalMember(owner = "client!faa", name = "n", descriptor = "[I")
    private int[] field2154 = new int[8191];

    @OriginalMember(owner = "client!faa", name = "q", descriptor = "[[Ll;")
    private class18[][] field2157 = new class18[1600][64];

    @OriginalMember(owner = "client!faa", name = "s", descriptor = "[[Ll;")
    private class18[][] field2159 = new class18[64][768];

    @OriginalMember(owner = "client!faa", name = "t", descriptor = "[I")
    private int[] field2160 = new int[1600];

    @OriginalMember(owner = "client!faa", name = "o", descriptor = "Lri;")
    private class114 field2155;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "Lia;")
    private class591 field2147;

    @OriginalMember(owner = "client!faa", name = "r", descriptor = "Lia;")
    private class591 field2158;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "Liaa;")
    private class497 field2151;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "F")
    private static float field2144;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!faa", name = "m", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!faa", name = "p", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V", line = 3)
    public final void method1095(boolean arg0) {
        this.field2147.method294((byte) 44);
        field2149++;
        if (arg0) {
            method1096((byte) 0, -115);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BI)V", line = 16)
    public static final void method1096(byte arg0, int arg1) {
        if (arg0 != -36) {
            method1096((byte) -36, -3);
        }
        field2145++;
        class37 var2 = class636.method3571(16, arg1, -122);
        var2.method230(-95);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ILij;)V", line = 29)
    private final void method1097(int arg0, class424 arg1) {
        field2142++;
        if (arg0 < 31) {
            this.field2160 = null;
        }
        arg1.method2385(-30, true);
        arg1.method2388((byte) -128, true);
        if (field2144 != arg1.field5650) {
            arg1.method511(field2144);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lij;II)V", line = 45)
    private final void method1098(class424 arg0, int arg1, int arg2) {
        field2148++;
        int var4 = arg2;
        class477 var5 = arg0.method2429(11);
        float var6 = var5.field6457;
        float var7 = var5.field6488;
        float var8 = var5.field6464;
        float var9 = var5.field6473;
        float var10 = var5.field6491;
        float var11 = var5.field6470;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field2147.method295(true, -32022);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method2409((byte) 93, var21);
        if (Stream.method3798()) {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field2160[var48] <= 64 ? this.field2160[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class18 var63 = this.field2157[var48][var50];
                        int var64 = var63.field337;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field333 >> 12);
                        float var70 = (float) (var63.field339 >> 12);
                        float var71 = (float) (var63.field338 >> 12);
                        int var72 = var63.field330 >> 12;
                        var22.method3796((float) (-var72) * var12 + var69);
                        var22.method3796((float) (-var72) * var13 + var70);
                        var22.method3796((float) (-var72) * var14 + var71);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var65, var66, var67, var68);
                        } else {
                            var22.method3786(var65, var66, var67, var68);
                        }
                        var22.method3796(0.0F);
                        var22.method3796(0.0F);
                        var22.method3796((float) var72 * var15 + var69);
                        var22.method3796((float) var72 * var16 + var70);
                        var22.method3796((float) var72 * var17 + var71);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var65, var66, var67, var68);
                        } else {
                            var22.method3786(var65, var66, var67, var68);
                        }
                        var22.method3796(1.0F);
                        var22.method3796(0.0F);
                        var22.method3796((float) var72 * var12 + var69);
                        var22.method3796((float) var72 * var13 + var70);
                        var22.method3796((float) var72 * var14 + var71);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var65, var66, var67, var68);
                        } else {
                            var22.method3786(var65, var66, var67, var68);
                        }
                        var22.method3796(1.0F);
                        var22.method3796(1.0F);
                        var22.method3796((float) var72 * var18 + var69);
                        var22.method3796((float) var72 * var19 + var70);
                        var22.method3796((float) var72 * var20 + var71);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var65, var66, var67, var68);
                        } else {
                            var22.method3786(var65, var66, var67, var68);
                        }
                        var22.method3796(0.0F);
                        var4++;
                        var22.method3796(1.0F);
                    }
                    if (this.field2160[var48] > 64) {
                        int var51 = this.field2160[var48] - 64 - 1;
                        for (int var52 = this.field2150[var51] - 1; var52 >= 0; var52--) {
                            class18 var53 = this.field2159[var51][var52];
                            int var54 = var53.field337;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field333 >> 12);
                            float var60 = (float) (var53.field339 >> 12);
                            float var61 = (float) (var53.field338 >> 12);
                            int var62 = var53.field330 >> 12;
                            var22.method3796((float) (-var62) * var12 + var59);
                            var22.method3796((float) (-var62) * var13 + var60);
                            var22.method3796((float) (-var62) * var14 + var61);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var55, var56, var57, var58);
                            } else {
                                var22.method3786(var55, var56, var57, var58);
                            }
                            var22.method3796(0.0F);
                            var22.method3796(0.0F);
                            var22.method3796((float) var62 * var15 + var59);
                            var22.method3796((float) var62 * var16 + var60);
                            var22.method3796((float) var62 * var17 + var61);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var55, var56, var57, var58);
                            } else {
                                var22.method3786(var55, var56, var57, var58);
                            }
                            var22.method3796(1.0F);
                            var22.method3796(0.0F);
                            var22.method3796((float) var62 * var12 + var59);
                            var22.method3796((float) var62 * var13 + var60);
                            var22.method3796((float) var62 * var14 + var61);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var55, var56, var57, var58);
                            } else {
                                var22.method3786(var55, var56, var57, var58);
                            }
                            var22.method3796(1.0F);
                            var22.method3796(1.0F);
                            var22.method3796((float) var62 * var18 + var59);
                            var22.method3796((float) var62 * var19 + var60);
                            var22.method3796((float) var62 * var20 + var61);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var55, var56, var57, var58);
                            } else {
                                var22.method3786(var55, var56, var57, var58);
                            }
                            var22.method3796(0.0F);
                            var4++;
                            var22.method3796(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field2160[var23] > 64 ? 64 : this.field2160[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class18 var38 = this.field2157[var23][var25];
                        int var39 = var38.field337;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field333 >> 12);
                        float var45 = (float) (var38.field339 >> 12);
                        float var46 = (float) (var38.field338 >> 12);
                        int var47 = var38.field330 >> 12;
                        var22.method3794((float) (-var47) * var12 + var44);
                        var22.method3794((float) (-var47) * var13 + var45);
                        var22.method3794((float) (-var47) * var14 + var46);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var40, var41, var42, var43);
                        } else {
                            var22.method3786(var40, var41, var42, var43);
                        }
                        var22.method3794(0.0F);
                        var22.method3794(0.0F);
                        var22.method3794((float) var47 * var15 + var44);
                        var22.method3794((float) var47 * var16 + var45);
                        var22.method3794((float) var47 * var17 + var46);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var40, var41, var42, var43);
                        } else {
                            var22.method3786(var40, var41, var42, var43);
                        }
                        var22.method3794(1.0F);
                        var22.method3794(0.0F);
                        var22.method3794((float) var47 * var12 + var44);
                        var22.method3794((float) var47 * var13 + var45);
                        var22.method3794((float) var47 * var14 + var46);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var40, var41, var42, var43);
                        } else {
                            var22.method3786(var40, var41, var42, var43);
                        }
                        var22.method3794(1.0F);
                        var22.method3794(1.0F);
                        var22.method3794((float) var47 * var18 + var44);
                        var22.method3794((float) var47 * var19 + var45);
                        var22.method3794((float) var47 * var20 + var46);
                        if (arg0.field5682 == 0) {
                            var22.method3788(var40, var41, var42, var43);
                        } else {
                            var22.method3786(var40, var41, var42, var43);
                        }
                        var22.method3794(0.0F);
                        var4++;
                        var22.method3794(1.0F);
                    }
                    if (this.field2160[var23] > 64) {
                        int var26 = this.field2160[var23] - 64 - 1;
                        for (int var27 = this.field2150[var26] - 1; var27 >= 0; var27--) {
                            class18 var28 = this.field2159[var26][var27];
                            int var29 = var28.field337;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field333 >> 12);
                            float var35 = (float) (var28.field339 >> 12);
                            float var36 = (float) (var28.field338 >> 12);
                            int var37 = var28.field330 >> 12;
                            var22.method3794((float) (-var37) * var12 + var34);
                            var22.method3794((float) (-var37) * var13 + var35);
                            var22.method3794((float) (-var37) * var14 + var36);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var30, var31, var32, var33);
                            } else {
                                var22.method3786(var30, var31, var32, var33);
                            }
                            var22.method3794(0.0F);
                            var22.method3794(0.0F);
                            var22.method3794((float) var37 * var15 + var34);
                            var22.method3794((float) var37 * var16 + var35);
                            var22.method3794((float) var37 * var17 + var36);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var30, var31, var32, var33);
                            } else {
                                var22.method3786(var30, var31, var32, var33);
                            }
                            var22.method3794(1.0F);
                            var22.method3794(0.0F);
                            var22.method3794((float) var37 * var12 + var34);
                            var22.method3794((float) var37 * var13 + var35);
                            var22.method3794((float) var37 * var14 + var36);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var30, var31, var32, var33);
                            } else {
                                var22.method3786(var30, var31, var32, var33);
                            }
                            var22.method3794(1.0F);
                            var22.method3794(1.0F);
                            var22.method3794((float) var37 * var18 + var34);
                            var22.method3794((float) var37 * var19 + var35);
                            var22.method3794((float) var37 * var20 + var36);
                            if (arg0.field5682 == 0) {
                                var22.method3788(var30, var31, var32, var33);
                            } else {
                                var22.method3786(var30, var31, var32, var33);
                            }
                            var22.method3794(0.0F);
                            var22.method3794(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3793();
        if (this.field2147.method299(arg2 + 2581)) {
            arg0.method2041(0, this.field2147, (byte) 73);
            arg0.method2041(1, this.field2158, (byte) 73);
            arg0.method2033(17069, this.field2155);
            arg0.method2030(0, var4 * 4, class662.field9281, this.field2151, false, var4 * 2, 0);
        }
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lij;)V", line = 672)
    public class157(class424 arg0) {
        this.field2155 = arg0.method2001(16018, new class655[] { new class655(new class307[] { class307.field4043, class307.field4049, class307.field4051 }), new class655(class307.field4048) });
        this.field2147 = arg0.method2042(true, false);
        this.field2158 = arg0.method2042(false, false);
        this.field2158.method296(12, 393168, 20442);
        this.field2151 = arg0.method1995(false, (byte) -121);
        this.field2151.method1008(49146, 23833);
        Buffer var2 = this.field2151.method1369(-25053, true);
        if (var2 != null) {
            Stream var3 = arg0.method2409((byte) 77, var2);
            if (Stream.method3798()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3785(var7);
                    var3.method3785(var7 + 1);
                    var3.method3785(var7 + 2);
                    var3.method3785(var7 + 2);
                    var3.method3785(var7 + 3);
                    var3.method3785(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3795(var5);
                    var3.method3795(var5 + 1);
                    var3.method3795(var5 + 2);
                    var3.method3795(var5 + 2);
                    var3.method3795(var5 + 3);
                    var3.method3795(var5);
                }
            }
            var3.method3793();
            this.field2151.method1368(true);
        }
        Buffer var8 = this.field2158.method295(true, -32022);
        if (var8 != null) {
            Stream var9 = arg0.method2409((byte) 107, var8);
            if (Stream.method3798()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3796(0.0F);
                    var9.method3796(-1.0F);
                    var9.method3796(0.0F);
                    var9.method3796(0.0F);
                    var9.method3796(-1.0F);
                    var9.method3796(0.0F);
                    var9.method3796(0.0F);
                    var9.method3796(-1.0F);
                    var9.method3796(0.0F);
                    var9.method3796(0.0F);
                    var9.method3796(-1.0F);
                    var9.method3796(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3794(0.0F);
                    var9.method3794(-1.0F);
                    var9.method3794(0.0F);
                    var9.method3794(0.0F);
                    var9.method3794(-1.0F);
                    var9.method3794(0.0F);
                    var9.method3794(0.0F);
                    var9.method3794(-1.0F);
                    var9.method3794(0.0F);
                    var9.method3794(0.0F);
                    var9.method3794(-1.0F);
                    var9.method3794(0.0F);
                }
            }
            var9.method3793();
            this.field2158.method299(2581);
        }
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(Z)V", line = 432)
    public static final void method1099(boolean arg0) {
        field2152++;
        if (!arg0) {
            method1099(true);
        }
        class660.field9187 = new class653();
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(BLij;)V", line = 445)
    private final void method1100(byte arg0, class424 arg1) {
        field2144 = arg1.field5650;
        field2141++;
        int var3 = -125 / ((arg0 + 33) / 55);
        arg1.method2390(9406);
        arg1.method2388((byte) -128, false);
        arg1.method2385(-108, false);
        arg1.method2400(0);
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(ILij;)V", line = 460)
    public final void method1101(int arg0, class424 arg1) {
        if (arg0 >= -2) {
            this.field2143 = 39;
        }
        this.field2147.method296(24, 786336, 20442);
        field2146++;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lij;ILfl;B)V", line = 480)
    public final void method1102(class424 arg0, int arg1, class741 arg2, byte arg3) {
        field2153++;
        if (arg0.field5578 == null) {
            return;
        }
        if (arg1 < 0) {
            this.method1100((byte) 99, arg0);
        } else {
            this.method1103(arg0, (byte) -21, arg1);
        }
        float var5 = arg0.field5578.field6482;
        float var6 = arg0.field5578.field6481;
        float var7 = arg0.field5578.field6495;
        float var8 = arg0.field5578.field6502;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class112 var12 = arg2.field10344.field7154;
            for (class112 var13 = var12.field1623; var13 != var12; var13 = var13.field1623) {
                class18 var14 = (class18) var13;
                int var15 = (int) ((float) (var14.field338 >> 12) * var7 + (float) (var14.field339 >> 12) * var6 + (float) (var14.field333 >> 12) * var5 + var8);
                this.field2154[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            if (arg3 != -22) {
                this.method1101(34, null);
            }
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = class423.method2356(var16, 1) + 1 - class267.field3363;
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            class112 var18 = var12.field1623;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field2143 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2160[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2150[var24] = 0;
                }
                while (var12 != var18) {
                    class18 var25 = (class18) var18;
                    if (var22) {
                        var21 = var25.field334;
                        var20 = var25.field335;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field335 != var20 || var21 != var25.field334)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2154[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2160[var26] < 64) {
                            this.field2157[var26][this.field2160[var26]++] = var25;
                        } else {
                            label110: {
                                if (this.field2160[var26] == 64) {
                                    if (this.field2143 == 64) {
                                        break label110;
                                    }
                                    this.field2160[var26] += this.field2143++ + 1;
                                }
                                class18[] var10000 = this.field2159[this.field2160[var26] - 64 - 1];
                                int var10002 = this.field2160[var26] - 65;
                                int var10004 = this.field2150[this.field2160[var26] - 65];
                                this.field2150[var10002] = this.field2150[this.field2160[var26] - 65] + 1;
                                var10000[var10004] = var25;
                            }
                        }
                    }
                    var18 = var18.field1623;
                }
                arg0.method2410(false, false, (byte) 87, var20 < 0 ? -1 : var20);
                if (var21 && field2144 != arg0.field5650) {
                    arg0.method511(field2144);
                } else if (arg0.field5650 != 1.0F) {
                    arg0.method511(1.0F);
                }
                this.method1098(arg0, var16, 0);
            }
        } catch (Exception var27) {
        }
        this.method1097(arg3 ^ 0xFFFFFFD0, arg0);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lij;BI)V", line = 645)
    private final void method1103(class424 arg0, byte arg1, int arg2) {
        field2156++;
        int var4 = 57 % ((51 - arg1) / 63);
        field2144 = arg0.field5650;
        arg0.method2412((float) arg2, (byte) 123);
        arg0.method2433(-12218);
        arg0.method2388((byte) 101, false);
        arg0.method2385(-62, false);
        arg0.method2400(0);
    }
}
