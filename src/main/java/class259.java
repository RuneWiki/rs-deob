import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class259 extends class41 {

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "[B")
    public byte[] field4533;

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "[Lee;")
    public class150[] field4525;

    @OriginalMember(owner = "client!ib", name = "z", descriptor = "[B")
    public byte[] field4518;

    @OriginalMember(owner = "client!ib", name = "y", descriptor = "[S")
    public short[] field4517;

    @OriginalMember(owner = "client!ib", name = "C", descriptor = "[I")
    private int[] field4521;

    @OriginalMember(owner = "client!ib", name = "E", descriptor = "[B")
    public byte[] field4522;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "[Lgh;")
    public class135[] field4529;

    @OriginalMember(owner = "client!ib", name = "x", descriptor = "I")
    public int field4516;

    @OriginalMember(owner = "client!ib", name = "A", descriptor = "[I")
    public static int[] field4519 = new int[128];

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field4528 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "[I")
    public static int[] field4530 = new int[5];

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "Z")
    public static boolean field4527 = true;

    @OriginalMember(owner = "client!ib", name = "w", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ib", name = "B", descriptor = "I")
    public static int field4520;

    @OriginalMember(owner = "client!ib", name = "F", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!ib", name = "v", descriptor = "[S")
    public static short[] field4514;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)V")
    public final void method1756(int arg0) {
        this.field4521 = null;
        field4520++;
        if (arg0 != 2) {
            this.method1756(-74);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(II)Z")
    public static final boolean method1757(int arg0, int arg1) {
        field4532++;
        if (arg0 != 21543) {
            field4523 = -60;
        }
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)I")
    private static final int method1758(int arg0, int arg1, int arg2) {
        int var3 = arg1 >>> 31;
        field4524++;
        if (arg0 != -2220) {
            field4523 = 43;
        }
        return (arg1 + var3) / arg2 - var3;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
    public static void method1759(boolean arg0) {
        field4514 = null;
        field4519 = null;
        field4530 = null;
        if (!arg0) {
            field4519 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)Lkk;")
    public static final class97 method1760(int arg0, int arg1) {
        class97 var2 = (class97) class212.field3655.method1794(-1, (long) arg0);
        field4531++;
        if (arg1 != -18270) {
            method1758(-68, -67, -128);
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field1766.method89(class220.method1464((byte) 110, arg0), class27.method224(arg0, -123), 115);
        class97 var4 = new class97();
        var4.field1559 = arg0;
        if (var3 != null) {
            var4.method643(new class230(var3), -105);
        }
        class212.field3655.method1795(14177, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "([ILbd;[BI)Z")
    public final boolean method1761(int[] arg0, class45 arg1, byte[] arg2, int arg3) {
        field4526++;
        boolean var5 = true;
        class150 var6 = null;
        int var7 = arg3;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field4521[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method309(var9 >> 2, arg0, 6467);
                        } else {
                            var6 = arg1.method310(-2, var9 >> 2, arg0);
                        }
                        if (var6 == null) {
                            var5 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field4525[var8] = var6;
                        this.field4521[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V")
    public class259() {
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "([B)V")
    public class259(byte[] arg0) {
        this.field4533 = new byte[128];
        this.field4525 = new class150[128];
        this.field4518 = new byte[128];
        this.field4517 = new short[128];
        this.field4521 = new int[128];
        this.field4522 = new byte[128];
        this.field4529 = new class135[128];
        int var2 = 0;
        class230 var3 = new class230(arg0);
        while (var3.field3977[var3.field3933 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1563(-255688184);
        }
        var2++;
        var3.field3933++;
        int var6 = var3.field3933;
        var3.field3933 += var2;
        int var7;
        for (var7 = 0; var3.field3977[var3.field3933 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1563(-255688184);
        }
        var7++;
        int var10 = 0;
        var3.field3933++;
        int var11 = var3.field3933;
        var3.field3933 += var7;
        while (var3.field3977[var3.field3933 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1563(-255688184);
        }
        var10++;
        var3.field3933++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1516((byte) 82);
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
            var15 = var10;
        }
        class135[] var19 = new class135[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class135 var103 = var19[var20] = new class135();
            int var104 = var3.method1516((byte) 82);
            if (var104 > 0) {
                var103.field2200 = new byte[var104 * 2];
            }
            int var105 = var3.method1516((byte) 82);
            if (var105 > 0) {
                var103.field2210 = new byte[var105 * 2 + 2];
                var103.field2210[1] = 64;
            }
        }
        int var21 = var3.method1516((byte) 82);
        int var22 = 0;
        byte[] var23 = var21 <= 0 ? null : new byte[var21 * 2];
        int var24 = var3.method1516((byte) 82);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field3977[var3.field3933 + var22] != 0) {
            var22++;
        }
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method1563(-255688184);
        }
        var3.field3933++;
        var22++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1516((byte) 82);
            this.field4517[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1516((byte) 82);
            this.field4517[var31] = (short) (this.field4517[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var34++];
                }
                var33 = var3.method1526((byte) 103);
            }
            var32--;
            this.field4517[var35] = (short) (this.field4517[var35] + class5.method43(var33 - 1 << 14, 32768));
            this.field4521[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4521[var39] != 0) {
                if (var36 == 0) {
                    var38 = var3.field3977[var6++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field4533[var39] = (byte) var38;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4521[var43] != 0) {
                if (var40 == 0) {
                    if (var42 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var42++];
                    }
                    var41 = var3.field3977[var11++] + 16 << 2;
                }
                this.field4518[var43] = (byte) var41;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class135 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4521[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field4529[var47] = var46;
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
                if (this.field4521[var51] > 0) {
                    var50 = var3.method1516((byte) 82) + 1;
                }
            }
            var49--;
            this.field4522[var51] = (byte) var50;
        }
        this.field4516 = var3.method1516((byte) 82) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class135 var100 = var19[var52];
            if (var100.field2200 != null) {
                for (int var101 = 1; var101 < var100.field2200.length; var101 += 2) {
                    var100.field2200[var101] = var3.method1563(-255688184);
                }
            }
            if (var100.field2210 != null) {
                for (int var102 = 3; var102 < var100.field2210.length - 2; var102 += 2) {
                    var100.field2210[var102] = var3.method1563(-255688184);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1563(-255688184);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1563(-255688184);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class135 var97 = var19[var55];
            if (var97.field2210 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2210.length; var99 += 2) {
                    var98 = var3.method1516((byte) 82) + var98 + 1;
                    var97.field2210[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class135 var94 = var19[var56];
            if (var94.field2200 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2200.length; var96 += 2) {
                    var95 = var95 + var3.method1516((byte) 82) + 1;
                    var94.field2200[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method1516((byte) 82);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 -= -var3.method1516((byte) 82) - 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field4522[var61] = (byte) (this.field4522[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var62 < var23.length) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = method1758(-2220, var67, var65 - var59);
                    this.field4522[var68] = (byte) (this.field4522[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field4522[var63] = (byte) (this.field4522[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method1516((byte) 82);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 += var3.method1516((byte) 82) + 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field4518[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4518[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) / 2 + (var79 - var73) * var72;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = method1758(-2220, var81, var79 - var73);
                    var81 += var80 - var72;
                    int var84 = (this.field4518[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4518[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            Object var76 = null;
            for (int var77 = var73; var77 < 128; var77++) {
                int var78 = (this.field4518[var77] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4518[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field2208 = var3.method1516((byte) 82);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class135 var93 = var19[var87];
            if (var93.field2200 != null) {
                var93.field2199 = var3.method1516((byte) 82);
            }
            if (var93.field2210 != null) {
                var93.field2204 = var3.method1516((byte) 82);
            }
            if (var93.field2208 > 0) {
                var93.field2201 = var3.method1516((byte) 82);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field2192 = var3.method1516((byte) 82);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class135 var92 = var19[var89];
            if (var92.field2192 > 0) {
                var92.field2193 = var3.method1516((byte) 82);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class135 var91 = var19[var90];
            if (var91.field2193 > 0) {
                var91.field2194 = var3.method1516((byte) 82);
            }
        }
    }
}
