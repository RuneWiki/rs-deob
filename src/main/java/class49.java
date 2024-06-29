import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class49 extends class60 {

    @OriginalMember(owner = "client!ul", name = "w", descriptor = "[Lrk;")
    public class187[] field750;

    @OriginalMember(owner = "client!ul", name = "C", descriptor = "[B")
    public byte[] field756;

    @OriginalMember(owner = "client!ul", name = "z", descriptor = "[S")
    public short[] field753;

    @OriginalMember(owner = "client!ul", name = "n", descriptor = "[B")
    public byte[] field741;

    @OriginalMember(owner = "client!ul", name = "A", descriptor = "[Ljh;")
    public class284[] field754;

    @OriginalMember(owner = "client!ul", name = "u", descriptor = "[B")
    public byte[] field748;

    @OriginalMember(owner = "client!ul", name = "s", descriptor = "[I")
    private int[] field746;

    @OriginalMember(owner = "client!ul", name = "t", descriptor = "I")
    public int field747;

    @OriginalMember(owner = "client!ul", name = "q", descriptor = "I")
    public static int field744 = 0;

    @OriginalMember(owner = "client!ul", name = "y", descriptor = "Z")
    public static volatile boolean field752 = true;

    @OriginalMember(owner = "client!ul", name = "D", descriptor = "Ltk;")
    public static class266 field757 = null;

    @OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
    public static int field745;

    @OriginalMember(owner = "client!ul", name = "v", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!ul", name = "x", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ul", name = "B", descriptor = "Ljf;")
    public static class242 field755;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)Lrd;", line = 9)
    public static final class183 method411(int arg0, boolean arg1) {
        field751++;
        class183 var2 = (class183) class307.field4873.method2288((long) arg0, (byte) 91);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class4.field114.method967(4, arg0, 65280);
        class183 var4 = new class183();
        if (var3 != null) {
            var4.method1331(arg0, (byte) -119, new class1(var3));
        }
        if (arg1) {
            return (class183) null;
        } else {
            class307.field4873.method2281(0, (long) arg0, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V", line = 41)
    public static final void method412(int arg0, int arg1) {
        class137.field2225--;
        field749++;
        if (class137.field2225 == arg0) {
            return;
        }
        class330.method2308(class301.field4800, arg0 + 1, class301.field4800, arg0, class137.field2225 - arg0);
        if (arg1 != 2) {
            field744 = 5;
        }
        class330.method2308(class285.field4441, arg0 + 1, class285.field4441, arg0, class137.field2225 - arg0);
        class330.method2307(class179.field2856, arg0 + 1, class179.field2856, arg0, class137.field2225 - arg0);
        class330.method2312(class120.field1960, arg0 + 1, class120.field1960, arg0, class137.field2225 - arg0);
        class330.method2311(class319.field5002, arg0 + 1, class319.field5002, arg0, class137.field2225 - arg0);
        class330.method2307(class304.field4847, arg0 + 1, class304.field4847, arg0, class137.field2225 - arg0);
        class330.method2307(class247.field3683, arg0 + 1, class247.field3683, arg0, class137.field2225 - arg0);
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(BLke;[I[B)Z", line = 65)
    public final boolean method413(byte arg0, class122 arg1, int[] arg2, byte[] arg3) {
        boolean var5 = true;
        field742++;
        int var6 = 0;
        class187 var7 = null;
        if (arg0 <= 30) {
            this.field753 = (short[]) null;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field746[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method976(var9 >> 2, -62, arg2);
                        } else {
                            var7 = arg1.method975(false, arg2, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field750[var8] = var7;
                        this.field746[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I", line = 121)
    public static final int method414(int arg0) {
        field743++;
        if (arg0 >= -24) {
            method414(86);
        }
        return 2;
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V", line = 132)
    public final void method415(byte arg0) {
        if (arg0 != 38) {
            method411(6, true);
        }
        field745++;
        this.field746 = null;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V", line = 153)
    public class49() {
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V", line = 157)
    public static void method416(int arg0) {
        field755 = null;
        field757 = null;
        if (arg0 != -23071) {
            method412(-123, 7);
        }
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "([B)V", line = 166)
    public class49(byte[] arg0) {
        this.field750 = new class187[128];
        this.field756 = new byte[128];
        int var2 = 0;
        this.field753 = new short[128];
        this.field741 = new byte[128];
        this.field754 = new class284[128];
        this.field748 = new byte[128];
        this.field746 = new int[128];
        class1 var3 = new class1(arg0);
        while (var3.field34[var3.field48 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method55(4);
        }
        var2++;
        var3.field48++;
        int var6 = var3.field48;
        var3.field48 += var2;
        int var7;
        for (var7 = 0; var3.field34[var3.field48 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method55(4);
        }
        var3.field48++;
        var7++;
        int var10 = var3.field48;
        var3.field48 += var7;
        int var11;
        for (var11 = 0; var3.field34[var3.field48 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method55(4);
        }
        var3.field48++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            int var15 = 1;
            var16 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method15((byte) 92);
                if (var18 == 0) {
                    var15 = var16++;
                } else {
                    if (var18 <= var15) {
                        var18--;
                    }
                    var15 = var18;
                }
                var14[var17] = (byte) var15;
            }
        } else {
            var16 = var11;
        }
        class284[] var19 = new class284[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class284 var21 = var19[var20] = new class284();
            int var22 = var3.method15((byte) 99);
            if (var22 > 0) {
                var21.field4426 = new byte[var22 * 2];
            }
            int var23 = var3.method15((byte) 121);
            if (var23 > 0) {
                var21.field4434 = new byte[var23 * 2 + 2];
                var21.field4434[1] = 64;
            }
        }
        int var24 = var3.method15((byte) 125);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method15((byte) 76);
        int var27;
        for (var27 = 0; var3.field34[var3.field48 + var27] != 0; var27++) {
        }
        byte[] var28 = new byte[var27];
        for (int var29 = 0; var29 < var27; var29++) {
            var28[var29] = var3.method55(4);
        }
        var27++;
        var3.field48++;
        byte[] var30 = var26 > 0 ? new byte[var26 * 2] : null;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method15((byte) -63);
            this.field753[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method15((byte) 74);
            this.field753[var34] = (short) (this.field753[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var36 == 0) {
                if (var35 >= var28.length) {
                    var36 = -1;
                } else {
                    var36 = var28[var35++];
                }
                var37 = var3.method34(-1005610576);
            }
            var36--;
            this.field753[var38] = (short) (this.field753[var38] + class164.method1234(32768, var37 - 1 << 14));
            this.field746[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field746[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field34[var6++] - 1;
                    if (var4.length <= var41) {
                        var39 = -1;
                    } else {
                        var39 = var4[var41++];
                    }
                }
                var39--;
                this.field748[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field746[var46] != 0) {
                if (var43 == 0) {
                    var45 = var3.field34[var10++] + 16 << 2;
                    if (var8.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var8[var44++];
                    }
                }
                this.field741[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class284 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field746[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var47 < var12.length) {
                        var48 = var12[var47++];
                    } else {
                        var48 = -1;
                    }
                }
                this.field754[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var28.length > var52) {
                    var51 = var28[var52++];
                } else {
                    var51 = -1;
                }
                if (this.field746[var54] > 0) {
                    var53 = var3.method15((byte) 76) + 1;
                }
            }
            var51--;
            this.field756[var54] = (byte) var53;
        }
        this.field747 = var3.method15((byte) -99) + 1;
        for (int var55 = 0; var55 < var16; var55++) {
            class284 var56 = var19[var55];
            if (var56.field4426 != null) {
                for (int var57 = 1; var57 < var56.field4426.length; var57 += 2) {
                    var56.field4426[var57] = var3.method55(4);
                }
            }
            if (var56.field4434 != null) {
                for (int var58 = 3; var58 < var56.field4434.length - 2; var58 += 2) {
                    var56.field4434[var58] = var3.method55(4);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method55(4);
            }
        }
        if (var30 != null) {
            for (int var60 = 1; var60 < var30.length; var60 += 2) {
                var30[var60] = var3.method55(4);
            }
        }
        for (int var61 = 0; var61 < var16; var61++) {
            class284 var62 = var19[var61];
            if (var62.field4434 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field4434.length; var64 += 2) {
                    var63 = var63 + var3.method15((byte) -35) + 1;
                    var62.field4434[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var16; var65++) {
            class284 var66 = var19[var65];
            if (var66.field4426 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field4426.length; var68 += 2) {
                    var67 += var3.method15((byte) -20) + 1;
                    var66.field4426[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method15((byte) 83);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var3.method15((byte) 85) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field756[var73] = (byte) (this.field756[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                var74 += 2;
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class232.method1679(var77, var75 - var71, (byte) 99);
                    var77 += var76 - var72;
                    this.field756[var78] = (byte) (this.field756[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var72 = var76;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field756[var81] = (byte) (this.field756[var81] * var72 + 32 >> 6);
            }
        }
        if (var30 != null) {
            int var82 = var3.method15((byte) 79);
            var30[0] = (byte) var82;
            for (int var83 = 2; var83 < var30.length; var83 += 2) {
                var82 = var3.method15((byte) -92) + var82 + 1;
                var30[var83] = (byte) var82;
            }
            byte var84 = var30[0];
            int var85 = var30[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field741[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field741[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var30.length) {
                byte var89 = var30[var88];
                int var90 = var30[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var84) * var85 + ((var89 - var84) / 2);
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class232.method1679(var91, var89 - var84, (byte) 101);
                    var91 += var90 - var85;
                    int var94 = (this.field741[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field741[var92] = (byte) var94;
                }
                var84 = var89;
                var85 = var90;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field741[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field741[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var16; var98++) {
            var19[var98].field4439 = var3.method15((byte) -21);
        }
        for (int var99 = 0; var99 < var16; var99++) {
            class284 var100 = var19[var99];
            if (var100.field4426 != null) {
                var100.field4423 = var3.method15((byte) -86);
            }
            if (var100.field4434 != null) {
                var100.field4430 = var3.method15((byte) -67);
            }
            if (var100.field4439 > 0) {
                var100.field4427 = var3.method15((byte) 79);
            }
        }
        for (int var101 = 0; var101 < var16; var101++) {
            var19[var101].field4435 = var3.method15((byte) 97);
        }
        for (int var102 = 0; var102 < var16; var102++) {
            class284 var103 = var19[var102];
            if (var103.field4435 > 0) {
                var103.field4428 = var3.method15((byte) -120);
            }
        }
        for (int var104 = 0; var104 < var16; var104++) {
            class284 var105 = var19[var104];
            if (var105.field4428 > 0) {
                var105.field4429 = var3.method15((byte) -85);
            }
        }
    }
}
