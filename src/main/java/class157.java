import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class157 extends class626 {

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "[B")
    public byte[] field2353;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[B")
    public byte[] field2347;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "[S")
    public short[] field2341;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[Lkm;")
    public class353[] field2345;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "[B")
    public byte[] field2344;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "[I")
    private int[] field2343;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "[Lcj;")
    public class690[] field2352;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public static int field2349 = 0;

    @OriginalMember(owner = "client!hq", name = "v", descriptor = "Lnga;")
    public static class510 field2355 = new class510(4);

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method1190(int arg0, boolean arg1) {
        field2354++;
        for (class235 var2 = (class235) class152.field2292.method1522(true); var2 != null; var2 = (class235) class152.field2292.method1527((byte) 49)) {
            if (var2.field3338 != null) {
                class484.field6848.method4051(var2.field3338);
                var2.field3338 = null;
            }
            if (var2.field3319 != null) {
                class484.field6848.method4051(var2.field3319);
                var2.field3319 = null;
            }
            var2.method3617(1);
        }
        int var3 = 81 / ((arg0 + 7) / 62);
        if (!arg1) {
            return;
        }
        for (class235 var4 = (class235) class240.field3372.method1522(true); var4 != null; var4 = (class235) class240.field3372.method1527((byte) 63)) {
            if (var4.field3338 != null) {
                class484.field6848.method4051(var4.field3338);
                var4.field3338 = null;
            }
            var4.method3617(1);
        }
        for (class235 var5 = (class235) class720.field10084.method4209(false); var5 != null; var5 = (class235) class720.field10084.method4207(9356)) {
            if (var5.field3338 != null) {
                class484.field6848.method4051(var5.field3338);
                var5.field3338 = null;
            }
            var5.method3617(1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V", line = 80)
    public static void method1191(int arg0) {
        if (arg0 != 1) {
            field2349 = -52;
        }
        field2355 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)Lgba;", line = 90)
    public static final class664 method1192(int arg0, int arg1) {
        field2342++;
        if (arg1 == 0) {
            if ((double) class542.field7623 == 3.0D) {
                return class500.field7106;
            }
            if ((double) class542.field7623 == 4.0D) {
                return class592.field8313;
            }
            if ((double) class542.field7623 == 6.0D) {
                return class508.field7235;
            }
            if ((double) class542.field7623 >= 8.0D) {
                return class693.field9749;
            }
        } else if (arg1 == 1) {
            if ((double) class542.field7623 == 3.0D) {
                return class508.field7235;
            }
            if ((double) class542.field7623 == 4.0D) {
                return class693.field9749;
            }
            if ((double) class542.field7623 == 6.0D) {
                return class18.field241;
            }
            if ((double) class542.field7623 >= 8.0D) {
                return class375.field5256;
            }
        } else if (arg1 == 2) {
            if ((double) class542.field7623 == 3.0D) {
                return class18.field241;
            }
            if ((double) class542.field7623 == 4.0D) {
                return class375.field5256;
            }
            if ((double) class542.field7623 == 6.0D) {
                return class554.field7752;
            }
            if ((double) class542.field7623 >= 8.0D) {
                return class462.field6660;
            }
        }
        if (arg0 != 28340) {
            field2349 = 51;
        }
        return null;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V", line = 158)
    public final void method1193(int arg0) {
        this.field2343 = null;
        field2351++;
        if (arg0 != 0) {
            this.field2347 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B[ILfca;[I[I)V", line = 171)
    public static final void method1194(byte arg0, int[] arg1, class84 arg2, int[] arg3, int[] arg4) {
        for (int var5 = 0; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg3[var5];
            int var8 = arg1[var5];
            int var9 = 0;
            while (var7 != 0 && arg2.field937.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg2.field937[var9] = null;
                    } else {
                        class718 var10 = class698.field9806.method851(var6, -2);
                        int var11 = var10.field10061;
                        class114 var12 = arg2.field937[var9];
                        if (var12 != null) {
                            if (var12.field1824 == var6) {
                                if (var11 == 0) {
                                    var12 = arg2.field937[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1831 = 1;
                                    var12.field1822 = 0;
                                    var12.field1823 = var8;
                                    var12.field1825 = 0;
                                    var12.field1827 = 0;
                                    if (!arg2.field892) {
                                        class749.method4165(0, (byte) 51, var10, arg2);
                                    }
                                } else if (var11 == 2) {
                                    var12.field1825 = 0;
                                }
                            } else if (var10.field10064 >= class698.field9806.method851(var12.field1824, -2).field10064) {
                                var12 = arg2.field937[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class114 var13 = arg2.field937[var9] = new class114();
                            var13.field1825 = 0;
                            var13.field1822 = 0;
                            var13.field1831 = 1;
                            var13.field1827 = 0;
                            var13.field1823 = var8;
                            var13.field1824 = var6;
                            if (!arg2.field892) {
                                class749.method4165(0, (byte) 121, var10, arg2);
                            }
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field2350++;
        if (arg0 < 20) {
            field2349 = 74;
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V", line = 277)
    public class157() {
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "([B)V", line = 286)
    public class157(byte[] arg0) {
        this.field2353 = new byte[128];
        this.field2347 = new byte[128];
        this.field2341 = new short[128];
        this.field2345 = new class353[128];
        this.field2344 = new byte[128];
        this.field2343 = new int[128];
        this.field2352 = new class690[128];
        class35 var2 = new class35(arg0);
        int var3;
        for (var3 = 0; var2.field483[var2.field469 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method277((byte) -120);
        }
        var3++;
        var2.field469++;
        int var6 = var2.field469;
        var2.field469 += var3;
        int var7;
        for (var7 = 0; var2.field483[var2.field469 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method277((byte) -116);
        }
        var2.field469++;
        var7++;
        int var10 = var2.field469;
        var2.field469 += var7;
        int var11;
        for (var11 = 0; var2.field483[var2.field469 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method277((byte) -118);
        }
        var11++;
        var2.field469++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method273(255);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var18) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class353[] var19 = new class353[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class353 var103 = var19[var20] = new class353();
            int var104 = var2.method273(255);
            if (var104 > 0) {
                var103.field4974 = new byte[var104 * 2];
            }
            int var105 = var2.method273(255);
            if (var105 > 0) {
                var103.field4971 = new byte[var105 * 2 + 2];
                var103.field4971[1] = 64;
            }
        }
        int var21 = var2.method273(255);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method273(255);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field483[var2.field469 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method277((byte) 19);
        }
        var25++;
        var2.field469++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method273(255);
            this.field2341[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method273(255);
            this.field2341[var31] = (short) (this.field2341[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var2.method282(-2);
            }
            this.field2341[var35] = (short) (this.field2341[var35] + class555.method3246(32768, var34 - 1 << 14));
            this.field2343[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2343[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field483[var6++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field2347[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2343[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var2.field483[var10++] + 16 << 2;
                }
                var41--;
                this.field2344[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class353 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2343[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field2345[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 >= var26.length) {
                    var49 = -1;
                } else {
                    var49 = var26[var48++];
                }
                if (this.field2343[var51] > 0) {
                    var50 = var2.method273(255) + 1;
                }
            }
            var49--;
            this.field2353[var51] = (byte) var50;
        }
        this.field2346 = var2.method273(255) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class353 var100 = var19[var52];
            if (var100.field4974 != null) {
                for (int var101 = 1; var101 < var100.field4974.length; var101 += 2) {
                    var100.field4974[var101] = var2.method277((byte) 14);
                }
            }
            if (var100.field4971 != null) {
                for (int var102 = 3; var102 < (var100.field4971.length - 2); var102 += 2) {
                    var100.field4971[var102] = var2.method277((byte) -122);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method277((byte) 81);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method277((byte) 16);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class353 var97 = var19[var55];
            if (var97.field4971 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field4971.length; var99 += 2) {
                    var98 = var2.method273(255) + var98 + 1;
                    var97.field4971[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class353 var94 = var19[var56];
            if (var94.field4974 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field4974.length; var96 += 2) {
                    var95 = var2.method273(255) + var95 + 1;
                    var94.field4974[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method273(255);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method273(255) + var57 + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2353[var61] = (byte) (this.field2353[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class606.method3509(51, var65 - var59, var67);
                    var67 += var66 - var60;
                    this.field2353[var68] = (byte) (this.field2353[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var62 += 2;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2353[var63] = (byte) (this.field2353[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method273(255);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 += var2.method273(255) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2344[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2344[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class606.method3509(84, var79 - var72, var81);
                    int var84 = (this.field2344[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2344[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var72 = var79;
                var75 += 2;
                var73 = var80;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2344[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2344[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field4967 = var2.method273(255);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class353 var93 = var19[var87];
            if (var93.field4974 != null) {
                var93.field4976 = var2.method273(255);
            }
            if (var93.field4971 != null) {
                var93.field4973 = var2.method273(255);
            }
            if (var93.field4967 > 0) {
                var93.field4977 = var2.method273(255);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field4975 = var2.method273(255);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class353 var92 = var19[var89];
            if (var92.field4975 > 0) {
                var92.field4970 = var2.method273(255);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class353 var91 = var19[var90];
            if (var91.field4970 > 0) {
                var91.field4968 = var2.method273(255);
            }
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lnc;I[B[I)Z", line = 930)
    public final boolean method1195(class24 arg0, int arg1, byte[] arg2, int[] arg3) {
        field2348++;
        boolean var5 = true;
        int var6 = 0;
        if (arg1 != 2) {
            method1192(-58, -107);
        }
        class690 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field2343[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method144((byte) 103, var9 >> 2, arg3);
                        } else {
                            var7 = arg0.method147((byte) -119, var9 >> 2, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2352[var8] = var7;
                        this.field2343[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }
}
