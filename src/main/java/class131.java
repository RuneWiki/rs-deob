import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class131 extends class104 {

    @OriginalMember(owner = "client!vk", name = "y", descriptor = "[B")
    public byte[] field2175;

    @OriginalMember(owner = "client!vk", name = "B", descriptor = "[B")
    public byte[] field2178;

    @OriginalMember(owner = "client!vk", name = "D", descriptor = "[S")
    public short[] field2180;

    @OriginalMember(owner = "client!vk", name = "C", descriptor = "[B")
    public byte[] field2179;

    @OriginalMember(owner = "client!vk", name = "A", descriptor = "[Lte;")
    public class227[] field2177;

    @OriginalMember(owner = "client!vk", name = "M", descriptor = "[Ltf;")
    public class103[] field2189;

    @OriginalMember(owner = "client!vk", name = "G", descriptor = "[I")
    private int[] field2183;

    @OriginalMember(owner = "client!vk", name = "N", descriptor = "I")
    public int field2190;

    @OriginalMember(owner = "client!vk", name = "z", descriptor = "Le;")
    public static class191 field2176 = class54.method368("Eingabeprozedur geladen)3", 2047);

    @OriginalMember(owner = "client!vk", name = "L", descriptor = "Le;")
    public static class191 field2188 = class54.method368("", 2047);

    @OriginalMember(owner = "client!vk", name = "x", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!vk", name = "F", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!vk", name = "H", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!vk", name = "I", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!vk", name = "J", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!vk", name = "E", descriptor = "Z")
    public static boolean field2181;

    @OriginalMember(owner = "client!vk", name = "K", descriptor = "[Le;")
    public static class191[] field2187;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
    public static final void method884(int arg0, boolean arg1) {
        field2182++;
        class34 var2 = (class34) class91.field1475.method612((long) arg0, !arg1);
        if (var2 == null) {
            return;
        }
        int var3 = 0;
        if (arg1) {
            method884(118, true);
        }
        while (var3 < var2.field634.length) {
            var2.field634[var3] = -1;
            var2.field638[var3] = 0;
            var3++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)I")
    private static final int method885(int arg0, int arg1, int arg2) {
        if (arg1 != -140499585) {
            field2181 = true;
        }
        field2184++;
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg0 - var3;
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V")
    public static void method886(int arg0) {
        field2188 = null;
        field2176 = null;
        field2187 = null;
        int var1 = 92 / ((arg0 + 1) / 47);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(B)V")
    public final void method887(byte arg0) {
        this.field2183 = null;
        if (arg0 != -7) {
            field2188 = null;
        }
        field2174++;
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(B)V")
    public static final void method888(byte arg0) {
        field2186++;
        if (arg0 <= 47) {
            method888((byte) -84);
        }
        class273.field4822.method985(0);
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I[BLqd;[I)Z")
    public final boolean method889(int arg0, byte[] arg1, class161 arg2, int[] arg3) {
        field2185++;
        int var5 = 0;
        boolean var6 = true;
        class103 var7 = null;
        if (arg0 >= -18) {
            this.field2175 = null;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field2183[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1087(arg3, var9 >> 2, 101);
                        } else {
                            var7 = arg2.method1085(var9 >> 2, arg3, -72);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2189[var8] = var7;
                        this.field2183[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class131() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "([B)V")
    public class131(byte[] arg0) {
        this.field2175 = new byte[128];
        this.field2178 = new byte[128];
        this.field2180 = new short[128];
        int var2 = 0;
        this.field2179 = new byte[128];
        this.field2177 = new class227[128];
        this.field2189 = new class103[128];
        this.field2183 = new int[128];
        class225 var3 = new class225(arg0);
        while (var3.field3995[var3.field3996 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1575(false);
        }
        var2++;
        var3.field3996++;
        int var6 = 0;
        int var7 = var3.field3996;
        var3.field3996 += var2;
        while (var3.field3995[var3.field3996 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1575(false);
        }
        var6++;
        var3.field3996++;
        int var10 = var3.field3996;
        var3.field3996 += var6;
        int var11;
        for (var11 = 0; var3.field3995[var3.field3996 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1575(false);
        }
        var11++;
        var3.field3996++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1580(-27);
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
        class227[] var19 = new class227[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class227 var103 = var19[var20] = new class227();
            int var104 = var3.method1580(-99);
            if (var104 > 0) {
                var103.field4097 = new byte[var104 * 2];
            }
            int var105 = var3.method1580(-39);
            if (var105 > 0) {
                var103.field4096 = new byte[var105 * 2 + 2];
                var103.field4096[1] = 64;
            }
        }
        int var21 = var3.method1580(-15);
        int var22 = 0;
        byte[] var23 = var21 > 0 ? new byte[var21 * 2] : null;
        int var24 = var3.method1580(-118);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        while (var3.field3995[var3.field3996 + var22] != 0) {
            var22++;
        }
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method1575(false);
        }
        int var28 = 0;
        var22++;
        var3.field3996++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1580(-114);
            this.field2180[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1580(-21);
            this.field2180[var31] = (short) (this.field2180[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var26.length > var33) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var3.method1581(-1);
            }
            var32--;
            this.field2180[var35] = (short) (this.field2180[var35] + (class167.method1128(2, var34 - 1) << 14));
            this.field2183[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2183[var39] != 0) {
                if (var38 == 0) {
                    var37 = var3.field3995[var7++] - 1;
                    if (var36 < var4.length) {
                        var38 = var4[var36++];
                    } else {
                        var38 = -1;
                    }
                }
                var38--;
                this.field2178[var39] = (byte) var37;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2183[var43] != 0) {
                if (var42 == 0) {
                    if (var8.length > var40) {
                        var42 = var8[var40++];
                    } else {
                        var42 = -1;
                    }
                    var41 = var3.field3995[var10++] + 16 << 2;
                }
                this.field2175[var43] = (byte) var41;
                var42--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class227 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2183[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var45++];
                    }
                }
                var44--;
                this.field2177[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var48 < var26.length) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field2183[var51] > 0) {
                    var50 = var3.method1580(-16) + 1;
                }
            }
            this.field2179[var51] = (byte) var50;
            var49--;
        }
        this.field2190 = var3.method1580(-41) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class227 var100 = var19[var52];
            if (var100.field4097 != null) {
                for (int var101 = 1; var101 < var100.field4097.length; var101 += 2) {
                    var100.field4097[var101] = var3.method1575(false);
                }
            }
            if (var100.field4096 != null) {
                for (int var102 = 3; var102 < (var100.field4096.length - 2); var102 += 2) {
                    var100.field4096[var102] = var3.method1575(false);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1575(false);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1575(false);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class227 var97 = var19[var55];
            if (var97.field4096 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field4096.length; var99 += 2) {
                    var98 = var98 + var3.method1580(-100) + 1;
                    var97.field4096[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class227 var94 = var19[var56];
            if (var94.field4097 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field4097.length; var96 += 2) {
                    var95 = var95 + var3.method1580(-37) + 1;
                    var94.field4097[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method1580(-38);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = (var57 + var3.method1580(-13)) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2179[var61] = (byte) (this.field2179[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = method885(var65 - var59, -140499585, var67);
                    this.field2179[var68] = (byte) (this.field2179[var68] * var69 + 32 >> 6);
                    var67 += var66 - var60;
                }
                var59 = var65;
                var60 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2179[var63] = (byte) (this.field2179[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method1580(-122);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = (var70 + var3.method1580(-32)) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field2175[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2175[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                int var79 = var25[var75 + 1] << 1;
                byte var80 = var25[var75];
                var75 += 2;
                int var81 = (var80 - var72) / 2 + (var80 - var72) * var73;
                for (int var82 = var72; var82 < var80; var82++) {
                    int var83 = method885(var80 - var72, -140499585, var81);
                    int var84 = (this.field2175[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    var81 += var79 - var73;
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2175[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field2175[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2175[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field4098 = var3.method1580(-26);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class227 var93 = var19[var87];
            if (var93.field4097 != null) {
                var93.field4094 = var3.method1580(-5);
            }
            if (var93.field4096 != null) {
                var93.field4086 = var3.method1580(-12);
            }
            if (var93.field4098 > 0) {
                var93.field4083 = var3.method1580(-61);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field4087 = var3.method1580(-48);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class227 var92 = var19[var89];
            if (var92.field4087 > 0) {
                var92.field4092 = var3.method1580(-62);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class227 var91 = var19[var90];
            if (var91.field4092 > 0) {
                var91.field4085 = var3.method1580(-71);
            }
        }
    }
}
