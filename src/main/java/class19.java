import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class19 extends class54 {

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "[B")
    public byte[] field306;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[Ljj;")
    public class107[] field312;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "[Lne;")
    public class146[] field313;

    @OriginalMember(owner = "client!bg", name = "B", descriptor = "[I")
    private int[] field316;

    @OriginalMember(owner = "client!bg", name = "O", descriptor = "[B")
    public byte[] field328;

    @OriginalMember(owner = "client!bg", name = "N", descriptor = "[B")
    public byte[] field327;

    @OriginalMember(owner = "client!bg", name = "D", descriptor = "[S")
    public short[] field317;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public int field307;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "Ldc;")
    private static class37 field310 = class185.method1233((byte) 86, "glow3:");

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field309 = 0;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Ldc;")
    public static class37 field304 = field310;

    @OriginalMember(owner = "client!bg", name = "G", descriptor = "Ldc;")
    public static class37 field320 = field310;

    @OriginalMember(owner = "client!bg", name = "J", descriptor = "Ldc;")
    public static class37 field323 = class185.method1233((byte) 86, "");

    @OriginalMember(owner = "client!bg", name = "K", descriptor = "Ldc;")
    public static class37 field324 = field323;

    @OriginalMember(owner = "client!bg", name = "F", descriptor = "J")
    public static long field319 = 0L;

    @OriginalMember(owner = "client!bg", name = "M", descriptor = "Ldc;")
    public static class37 field326 = field323;

    @OriginalMember(owner = "client!bg", name = "I", descriptor = "Ldc;")
    public static class37 field322 = field323;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Ldc;")
    public static class37 field311 = field323;

    @OriginalMember(owner = "client!bg", name = "H", descriptor = "Ldc;")
    public static class37 field321 = field323;

    @OriginalMember(owner = "client!bg", name = "L", descriptor = "Ldc;")
    public static class37 field325 = field323;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "Lbb;")
    public static class14 field314 = new class14(100);

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!bg", name = "P", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!bg", name = "A", descriptor = "[[I")
    public static int[][] field315;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)V")
    public static void method128(byte arg0) {
        field314 = null;
        field311 = null;
        if (arg0 < 52) {
            field304 = null;
        }
        field320 = null;
        field315 = null;
        field323 = null;
        field310 = null;
        field321 = null;
        field325 = null;
        field324 = null;
        field326 = null;
        field304 = null;
        field322 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(IZ)V")
    public static final void method129(int arg0, boolean arg1) {
        field305++;
        if (class166.field3172 == null) {
            return;
        }
        try {
            class28 var2 = new class28(4);
            var2.method214((byte) 107, arg1 ? 2 : 3);
            var2.method211(-483923896, arg0);
            class166.field3172.method558(30000, 4, 0, var2.field502);
        } catch (IOException var4) {
            try {
                class166.field3172.method557(false);
            } catch (Exception var3) {
            }
            class166.field3172 = null;
            class117.field2100++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public final void method130(int arg0) {
        this.field316 = null;
        if (arg0 == 0) {
            field318++;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(B)Ljc;")
    public static final class100 method131(byte arg0) {
        field308++;
        if (arg0 != -69) {
            method129(26, false);
        }
        class148 var1 = new class148(class67.field1207, class160.field3030, class166.field3162[0], class7.field77[0], class174.field3308[0], class238.field4336[0], class217.field4040[0], class5.field42);
        class97.method644(true);
        return var1;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "([ILda;[BI)Z")
    public final boolean method132(int[] arg0, class35 arg1, byte[] arg2, int arg3) {
        field303++;
        boolean var5 = true;
        int var6 = 0;
        class146 var7 = null;
        for (int var8 = arg3; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field316[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method288(-90, var9 >> 2, arg0);
                        } else {
                            var7 = arg1.method294(arg0, false, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field313[var8] = var7;
                        this.field316[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "()V")
    public class19() {
    }

    @OriginalMember(owner = "client!bg", name = "<init>", descriptor = "([B)V")
    public class19(byte[] arg0) {
        this.field306 = new byte[128];
        this.field312 = new class107[128];
        this.field313 = new class146[128];
        this.field316 = new int[128];
        this.field328 = new byte[128];
        this.field327 = new byte[128];
        this.field317 = new short[128];
        int var2 = 0;
        class28 var3 = new class28(arg0);
        while (var3.field502[var3.field526 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method206(-16933672);
        }
        var2++;
        var3.field526++;
        int var6 = var3.field526;
        var3.field526 += var2;
        int var7;
        for (var7 = 0; var3.field502[var3.field526 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method206(-16933672);
        }
        var7++;
        var3.field526++;
        int var10 = var3.field526;
        var3.field526 += var7;
        int var11;
        for (var11 = 0; var3.field502[var3.field526 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method206(-16933672);
        }
        var11++;
        var3.field526++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method215(-1797813752);
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
        class107[] var19 = new class107[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class107 var103 = var19[var20] = new class107();
            int var104 = var3.method215(-1797813752);
            if (var104 > 0) {
                var103.field1864 = new byte[var104 * 2];
            }
            int var105 = var3.method215(-1797813752);
            if (var105 > 0) {
                var103.field1866 = new byte[var105 * 2 + 2];
                var103.field1866[1] = 64;
            }
        }
        int var21 = var3.method215(-1797813752);
        int var22 = 0;
        byte[] var23 = var21 <= 0 ? null : new byte[var21 * 2];
        int var24 = var3.method215(-1797813752);
        while (var3.field502[var3.field526 + var22] != 0) {
            var22++;
        }
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method206(-16933672);
        }
        byte[] var27 = var24 <= 0 ? null : new byte[var24 * 2];
        var3.field526++;
        var22++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method215(-1797813752);
            this.field317[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method215(-1797813752);
            this.field317[var31] = (short) (this.field317[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var25.length > var33) {
                    var32 = var25[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var3.method191(false);
            }
            var32--;
            this.field317[var35] = (short) (this.field317[var35] + (class58.method449(var34 - 1, 2) << 14));
            this.field316[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field316[var39] != 0) {
                if (var36 == 0) {
                    var37 = var3.field502[var6++] - 1;
                    if (var38 < var4.length) {
                        var36 = var4[var38++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field306[var39] = (byte) var37;
                var36--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field316[var43] != 0) {
                if (var40 == 0) {
                    var42 = var3.field502[var10++] + 16 << 2;
                    if (var8.length <= var41) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                }
                var40--;
                this.field327[var43] = (byte) var42;
            }
        }
        class107 var44 = null;
        int var45 = 0;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field316[var47] != 0) {
                if (var45 == 0) {
                    var44 = var19[var14[var46]];
                    if (var46 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var46++];
                    }
                }
                var45--;
                this.field312[var47] = var44;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var50 >= var25.length) {
                    var48 = -1;
                } else {
                    var48 = var25[var50++];
                }
                if (this.field316[var51] > 0) {
                    var49 = var3.method215(-1797813752) + 1;
                }
            }
            var48--;
            this.field328[var51] = (byte) var49;
        }
        this.field307 = var3.method215(-1797813752) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class107 var100 = var19[var52];
            if (var100.field1864 != null) {
                for (int var101 = 1; var101 < var100.field1864.length; var101 += 2) {
                    var100.field1864[var101] = var3.method206(-16933672);
                }
            }
            if (var100.field1866 != null) {
                for (int var102 = 3; var102 < var100.field1866.length - 2; var102 += 2) {
                    var100.field1866[var102] = var3.method206(-16933672);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method206(-16933672);
            }
        }
        if (var27 != null) {
            for (int var54 = 1; var54 < var27.length; var54 += 2) {
                var27[var54] = var3.method206(-16933672);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class107 var97 = var19[var55];
            if (var97.field1866 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1866.length; var99 += 2) {
                    var98 = var3.method215(-1797813752) + var98 + 1;
                    var97.field1866[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class107 var94 = var19[var56];
            if (var94.field1864 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1864.length; var96 += 2) {
                    var95 = var3.method215(-1797813752) + var95 + 1;
                    var94.field1864[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method215(-1797813752);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 += var3.method215(-1797813752) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field328[var61] = (byte) (this.field328[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62 + 1];
                byte var66 = var23[var62];
                int var67 = (var66 - var59) / 2 + (var66 - var59) * var60;
                for (int var68 = var59; var68 < var66; var68++) {
                    int var69 = class7.method48(var66 - var59, var67, 90);
                    this.field328[var68] = (byte) (this.field328[var68] * var69 + 32 >> 6);
                    var67 += var65 - var60;
                }
                var62 += 2;
                var60 = var65;
                var59 = var66;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field328[var63] = (byte) (this.field328[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var27 != null) {
            int var70 = var3.method215(-1797813752);
            var27[0] = (byte) var70;
            for (int var71 = 2; var71 < var27.length; var71 += 2) {
                var70 += var3.method215(-1797813752) + 1;
                var27[var71] = (byte) var70;
            }
            int var72 = var27[1] << 1;
            byte var73 = var27[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field327[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field327[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var27.length > var75) {
                byte var79 = var27[var75];
                int var80 = (var79 - var73) / 2 + (var79 - var73) * var72;
                int var81 = var27[var75 + 1] << 1;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class7.method48(var79 - var73, var80, 85);
                    var80 += var81 - var72;
                    int var84 = (this.field327[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field327[var82] = (byte) var84;
                }
                var75 += 2;
                var72 = var81;
                var73 = var79;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field327[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field327[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1865 = var3.method215(-1797813752);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class107 var93 = var19[var87];
            if (var93.field1864 != null) {
                var93.field1863 = var3.method215(-1797813752);
            }
            if (var93.field1866 != null) {
                var93.field1855 = var3.method215(-1797813752);
            }
            if (var93.field1865 > 0) {
                var93.field1871 = var3.method215(-1797813752);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1860 = var3.method215(-1797813752);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class107 var92 = var19[var89];
            if (var92.field1860 > 0) {
                var92.field1859 = var3.method215(-1797813752);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class107 var91 = var19[var90];
            if (var91.field1859 > 0) {
                var91.field1867 = var3.method215(-1797813752);
            }
        }
    }
}
