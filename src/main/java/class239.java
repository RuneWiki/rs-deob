import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class239 extends class45 {

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[B")
    public byte[] field3944;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[Lh;")
    public class110[] field3935;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "[I")
    private int[] field3949;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "[B")
    public byte[] field3947;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "[B")
    public byte[] field3945;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "[S")
    public short[] field3941;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[Lbj;")
    public class211[] field3940;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3934 = 0;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field3946 = new String[100];

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3936;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "I")
    public static int field3937;

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    public static int field3938;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field3942;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3950;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 14)
    public static final void method1819(int arg0) {
        class335.field5305 = 0;
        class241.field3988 = 0;
        field3951++;
        class338.field5387 = arg0;
        class277.field4565 = 0;
        class326.field5182 = false;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([B[IBLjo;)Z", line = 26)
    public final boolean method1820(byte[] arg0, int[] arg1, byte arg2, class175 arg3) {
        if (arg2 != -63) {
            this.field3941 = (short[]) null;
        }
        field3936++;
        class110 var5 = null;
        boolean var6 = true;
        int var7 = 0;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field3949[var8];
                if (var9 != 0) {
                    if (var7 != var9) {
                        var7 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var5 = arg3.method1380((byte) 5, var9 >> 2, arg1);
                        } else {
                            var5 = arg3.method1382(9376, arg1, var9 >> 2);
                        }
                        if (var5 == null) {
                            var6 = false;
                        }
                    }
                    if (var5 != null) {
                        this.field3935[var8] = var5;
                        this.field3949[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 82)
    public static void method1821(boolean arg0) {
        field3946 = null;
        if (arg0) {
            field3934 = -68;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljh;I)I", line = 92)
    public static final int method1822(class258 arg0, int arg1) {
        if (arg1 >= -22) {
            method1823(123);
        }
        int var2 = arg0.field4325;
        class106 var3 = arg0.method1641(0);
        if (arg0.field3544 == var3.field1737) {
            var2 = arg0.field4336;
        } else if (arg0.field3544 == var3.field1723 || arg0.field3544 == var3.field1729 || arg0.field3544 == var3.field1731 || arg0.field3544 == var3.field1754) {
            var2 = arg0.field4326;
        } else if (arg0.field3544 == var3.field1733 || arg0.field3544 == var3.field1730 || arg0.field3544 == var3.field1746 || arg0.field3544 == var3.field1747) {
            var2 = arg0.field4337;
        }
        field3942++;
        return var2;
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 123)
    public static final void method1823(int arg0) {
        if (arg0 < 115) {
            method1819(-13);
        }
        field3950++;
        class169.field2676.method2327(1);
        class59.field1010.method2327(1);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Ljn;Lwg;ZIILmf;BI)V", line = 147)
    public static final void method1824(class59 arg0, class267 arg1, boolean arg2, int arg3, int arg4, class213 arg5, byte arg6, int arg7) {
        if (arg6 < 9) {
            method1821(true);
        }
        field3938++;
        class147 var8 = null;
        if (arg5.field3417 == 0) {
            if ((double) class174.field2774 == 3.0D) {
                var8 = class353.field5608;
            }
            if ((double) class174.field2774 == 4.0D) {
                var8 = class222.field3651;
            }
            if ((double) class174.field2774 == 6.0D) {
                var8 = class109.field1796;
            }
            if ((double) class174.field2774 >= 8.0D) {
                var8 = class213.field3409;
            }
        } else if (arg5.field3417 == 1) {
            if ((double) class174.field2774 == 3.0D) {
                var8 = class109.field1796;
            }
            if ((double) class174.field2774 == 4.0D) {
                var8 = class213.field3409;
            }
            if ((double) class174.field2774 == 6.0D) {
                var8 = class172.field2744;
            }
            if ((double) class174.field2774 >= 8.0D) {
                var8 = class311.field4963;
            }
        } else if (arg5.field3417 == 2) {
            if ((double) class174.field2774 == 3.0D) {
                var8 = class172.field2744;
            }
            if ((double) class174.field2774 == 4.0D) {
                var8 = class311.field4963;
            }
            if ((double) class174.field2774 == 6.0D) {
                var8 = class109.field1801;
            }
            if ((double) class174.field2774 >= 8.0D) {
                var8 = class138.field2280;
            }
        }
        if (var8 == null) {
            return;
        }
        int var9 = 0;
        int var10 = arg5.field3399;
        if (arg0.field1021 && arg5.field3431 != -1) {
            var10 = arg5.field3431;
        }
        int var11 = class286.field4663.method1343(arg5.field3401, (int[]) null, class84.field1432);
        int var12 = arg0.field1017;
        int var13;
        if (arg2) {
            var13 = var12 - var8.method1145() * var11 / 2;
        } else {
            var13 = var12 - (arg7 - (-((var11 - 1) * var8.method1147()) - var8.method1145() / 2));
        }
        int var14 = var13 - var8.method1145();
        int var15 = var13 + var8.method1145() / 2;
        for (int var16 = 0; var16 < var11; var16++) {
            String var17 = class84.field1432[var16];
            if ((var11 - 1) > var16) {
                var17 = var17.substring(0, var17.length() - 4);
            }
            int var18 = var8.method1138(var17);
            if (var9 < var18) {
                var9 = var18;
            }
        }
        arg1.field4484 = arg3 + var14;
        arg1.field4463 = arg0.field1014 + arg4 - (var9 / 2);
        arg1.field4466 = var9 / 2 + arg0.field1014 + arg4;
        arg1.field4469 = var14 - (-(var11 * var8.method1147()) - arg3);
        int var19 = var14 + 2;
        int var20 = arg0.field1014 - (var9 / 2) - 5;
        if (arg5.field3390 != 0) {
            class246.method1905(var20, var19, var9 + 10, var14 + 1 - (-(var11 * var8.method1147()) + var19), arg5.field3390, arg5.field3390 >>> 24);
        }
        if (arg5.field3394 != 0) {
            class246.method1878(var20, var19, var9 + 10, -var19 + var14 + 1 - -(var11 * var8.method1147()), arg5.field3394, arg5.field3394 >>> 24);
        }
        for (int var21 = 0; var21 < var11; var21++) {
            String var22 = class84.field1432[var21];
            if (var21 < (var11 - 1)) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method1138(var22);
            var8.method1142(var22, arg0.field1014, var15, var10, true);
            if (var23 > var9) {
                var9 = var23;
            }
            var15 += var8.method1147();
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 299)
    public class239() {
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "([B)V", line = 301)
    public class239(byte[] arg0) {
        this.field3944 = new byte[128];
        this.field3935 = new class110[128];
        this.field3949 = new int[128];
        this.field3947 = new byte[128];
        this.field3945 = new byte[128];
        this.field3941 = new short[128];
        this.field3940 = new class211[128];
        int var2 = 0;
        class227 var3 = new class227(arg0);
        while (var3.field3793[var3.field3760 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1733(0);
        }
        var3.field3760++;
        var2++;
        int var6 = var3.field3760;
        int var7 = 0;
        var3.field3760 += var2;
        while (var3.field3793[var3.field3760 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1733(0);
        }
        var7++;
        var3.field3760++;
        int var10 = 0;
        int var11 = var3.field3760;
        var3.field3760 += var7;
        while (var3.field3793[var3.field3760 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1733(0);
        }
        var10++;
        var3.field3760++;
        byte[] var14 = new byte[var10];
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method1720((byte) -118);
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
        }
        class211[] var19 = new class211[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class211 var21 = var19[var20] = new class211();
            int var22 = var3.method1720((byte) -32);
            if (var22 > 0) {
                var21.field3378 = new byte[var22 * 2];
            }
            int var23 = var3.method1720((byte) -89);
            if (var23 > 0) {
                var21.field3382 = new byte[var23 * 2 + 2];
                var21.field3382[1] = 64;
            }
        }
        int var24 = var3.method1720((byte) -88);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        int var26 = var3.method1720((byte) -110);
        byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
        int var28;
        for (var28 = 0; var3.field3793[var3.field3760 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method1733(0);
        }
        var3.field3760++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1720((byte) -32);
            this.field3941[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1720((byte) -48);
            this.field3941[var34] = (short) (this.field3941[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 < var29.length) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method1711(true);
            }
            this.field3941[var38] = (short) (this.field3941[var38] + class343.method2418(var37 - 1 << 14, 32768));
            var35--;
            this.field3949[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3949[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field3793[var6++] - 1;
                    if (var39 >= var4.length) {
                        var40 = -1;
                    } else {
                        var40 = var4[var39++];
                    }
                }
                this.field3947[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3949[var46] != 0) {
                if (var43 == 0) {
                    if (var8.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var8[var44++];
                    }
                    var45 = var3.field3793[var11++] + 16 << 2;
                }
                this.field3945[var46] = (byte) var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class211 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3949[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length <= var47) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                this.field3940[var50] = var49;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var53 == 0) {
                if (var29.length <= var51) {
                    var53 = -1;
                } else {
                    var53 = var29[var51++];
                }
                if (this.field3949[var54] > 0) {
                    var52 = var3.method1720((byte) -22) + 1;
                }
            }
            this.field3944[var54] = (byte) var52;
            var53--;
        }
        this.field3948 = var3.method1720((byte) -52) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class211 var56 = var19[var55];
            if (var56.field3378 != null) {
                for (int var57 = 1; var57 < var56.field3378.length; var57 += 2) {
                    var56.field3378[var57] = var3.method1733(0);
                }
            }
            if (var56.field3382 != null) {
                for (int var58 = 3; var58 < var56.field3382.length - 2; var58 += 2) {
                    var56.field3382[var58] = var3.method1733(0);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1733(0);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method1733(0);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class211 var62 = var19[var61];
            if (var62.field3382 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3382.length; var64 += 2) {
                    var63 = var3.method1720((byte) -33) + (var63 + 1);
                    var62.field3382[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class211 var66 = var19[var65];
            if (var66.field3378 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3378.length; var68 += 2) {
                    var67 = var3.method1720((byte) -127) + var67 + 1;
                    var66.field3378[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1720((byte) -112);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method1720((byte) -17) + (var69 + 1);
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3944[var73] = (byte) (this.field3944[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var74 < var25.length) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                var74 += 2;
                int var77 = (var76 - var71) * var72 + ((var76 - var71) / 2);
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class234.method1803(var77, (byte) -83, var76 - var71);
                    this.field3944[var78] = (byte) (this.field3944[var78] * var79 + 32 >> 6);
                    var77 += var75 - var72;
                }
                var72 = var75;
                var71 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3944[var80] = (byte) (this.field3944[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method1720((byte) -53);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var3.method1720((byte) -27) + var82 + 1;
                var27[var83] = (byte) var82;
            }
            byte var84 = var27[0];
            int var85 = var27[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3945[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3945[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var88 < var27.length) {
                byte var89 = var27[var88];
                int var90 = (var89 - var84) / 2 + (var89 - var84) * var85;
                int var91 = var27[var88 + 1] << 1;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class234.method1803(var90, (byte) -58, var89 - var84);
                    var90 += var91 - var85;
                    int var94 = (this.field3945[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3945[var92] = (byte) var94;
                }
                var85 = var91;
                var88 += 2;
                var84 = var89;
            }
            for (int var95 = var84; var95 < 128; var95++) {
                int var96 = (this.field3945[var95] & 0xFF) + var85;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3945[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field3381 = var3.method1720((byte) -100);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class211 var100 = var19[var99];
            if (var100.field3378 != null) {
                var100.field3380 = var3.method1720((byte) -49);
            }
            if (var100.field3382 != null) {
                var100.field3377 = var3.method1720((byte) -23);
            }
            if (var100.field3381 > 0) {
                var100.field3370 = var3.method1720((byte) -126);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field3375 = var3.method1720((byte) -31);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class211 var103 = var19[var102];
            if (var103.field3375 > 0) {
                var103.field3376 = var3.method1720((byte) -45);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class211 var105 = var19[var104];
            if (var105.field3376 > 0) {
                var105.field3384 = var3.method1720((byte) -73);
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 944)
    public final void method1825(int arg0) {
        this.field3949 = null;
        field3943++;
        if (arg0 != 0) {
            field3934 = 65;
        }
    }
}
