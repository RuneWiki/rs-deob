import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class10 extends class406 {

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "[B")
    public byte[] field131;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "[Lvo;")
    public class27[] field128;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "[B")
    public byte[] field129;

    @OriginalMember(owner = "client!ds", name = "t", descriptor = "[I")
    private int[] field132;

    @OriginalMember(owner = "client!ds", name = "C", descriptor = "[B")
    public byte[] field141;

    @OriginalMember(owner = "client!ds", name = "x", descriptor = "[Lwd;")
    public class148[] field136;

    @OriginalMember(owner = "client!ds", name = "w", descriptor = "[S")
    public short[] field135;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public int field130;

    @OriginalMember(owner = "client!ds", name = "u", descriptor = "I")
    public static int field133;

    @OriginalMember(owner = "client!ds", name = "y", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ds", name = "B", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ds", name = "v", descriptor = "[I")
    public static int[] field134;

    @OriginalMember(owner = "client!ds", name = "z", descriptor = "[S")
    public static short[] field138;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZI)V", line = 8)
    public static final void method73(boolean arg0, int arg1) {
        if (!arg0) {
            method77(-41);
        }
        field137++;
        class12.field160.method1629(arg1, 78);
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B[S)[S", line = 24)
    public static final short[] method74(byte arg0, short[] arg1) {
        field133++;
        if (arg1 == null) {
            return null;
        } else {
            short[] var2 = new short[arg1.length];
            class316.method2078(arg1, 0, var2, 0, arg1.length);
            return arg0 == -39 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lil;[BI[I)Z", line = 50)
    public final boolean method75(class5 arg0, byte[] arg1, int arg2, int[] arg3) {
        field139++;
        boolean var5 = true;
        int var6 = 0;
        if (arg2 != -1) {
            return false;
        }
        class27 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field132[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method36(true, var9 >> 2, arg3);
                        } else {
                            var7 = arg0.method40(arg3, true, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field128[var8] = var7;
                        this.field132[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V", line = 108)
    public final void method76(int arg0) {
        this.field132 = null;
        field140++;
        if (arg0 != 0) {
            this.method75((class5) null, (byte[]) null, -31, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V", line = 121)
    public static void method77(int arg0) {
        field138 = null;
        if (arg0 == 0) {
            field134 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V", line = 133)
    public class10() {
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "([B)V", line = 135)
    public class10(byte[] arg0) {
        this.field131 = new byte[128];
        this.field128 = new class27[128];
        this.field129 = new byte[128];
        this.field132 = new int[128];
        this.field141 = new byte[128];
        this.field136 = new class148[128];
        this.field135 = new short[128];
        class236 var2 = new class236(arg0);
        int var3;
        for (var3 = 0; var2.field3364[var2.field3320 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1589(false);
        }
        var3++;
        var2.field3320++;
        int var6 = var2.field3320;
        var2.field3320 += var3;
        int var7;
        for (var7 = 0; var2.field3364[var2.field3320 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1589(false);
        }
        var7++;
        var2.field3320++;
        int var10 = var2.field3320;
        var2.field3320 += var7;
        int var11;
        for (var11 = 0; var2.field3364[var2.field3320 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1589(false);
        }
        var2.field3320++;
        var11++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1574(-8);
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
        class148[] var19 = new class148[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class148 var103 = var19[var20] = new class148();
            int var104 = var2.method1574(-101);
            if (var104 > 0) {
                var103.field1808 = new byte[var104 * 2];
            }
            int var105 = var2.method1574(-25);
            if (var105 > 0) {
                var103.field1814 = new byte[var105 * 2 + 2];
                var103.field1814[1] = 64;
            }
        }
        int var21 = var2.method1574(-118);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method1574(-80);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3364[var2.field3320 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1589(false);
        }
        var25++;
        var2.field3320++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1574(-74);
            this.field135[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1574(-26);
            this.field135[var31] = (short) (this.field135[var31] + (var30 << 8));
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
                var34 = var2.method1582(-7745);
            }
            this.field135[var35] = (short) (this.field135[var35] + (class33.method210(2, var34 - 1) << 14));
            var32--;
            this.field132[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field132[var39] != 0) {
                if (var37 == 0) {
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                    var38 = var2.field3364[var6++] - 1;
                }
                this.field131[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field132[var43] != 0) {
                if (var40 == 0) {
                    if (var8.length > var41) {
                        var40 = var8[var41++];
                    } else {
                        var40 = -1;
                    }
                    var42 = var2.field3364[var10++] + 16 << 2;
                }
                this.field129[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class148 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field132[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var45 < var12.length) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field136[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length <= var49) {
                    var48 = -1;
                } else {
                    var48 = var26[var49++];
                }
                if (this.field132[var51] > 0) {
                    var50 = var2.method1574(-101) + 1;
                }
            }
            this.field141[var51] = (byte) var50;
            var48--;
        }
        this.field130 = var2.method1574(-55) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class148 var100 = var19[var52];
            if (var100.field1808 != null) {
                for (int var101 = 1; var101 < var100.field1808.length; var101 += 2) {
                    var100.field1808[var101] = var2.method1589(false);
                }
            }
            if (var100.field1814 != null) {
                for (int var102 = 3; var102 < (var100.field1814.length - 2); var102 += 2) {
                    var100.field1814[var102] = var2.method1589(false);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1589(false);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1589(false);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class148 var97 = var19[var55];
            if (var97.field1814 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1814.length; var99 += 2) {
                    var98 = var2.method1574(-32) + var98 + 1;
                    var97.field1814[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class148 var94 = var19[var56];
            if (var94.field1808 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1808.length; var96 += 2) {
                    var95 += var2.method1574(-71) + 1;
                    var94.field1808[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1574(-92);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = (var57 + var2.method1574(-63)) + 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field141[var61] = (byte) (this.field141[var61] * var60 + 32 >> 6);
            }
            for (int var62 = 2; var62 < var22.length; var62 += 2) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class330.method2128((byte) 67, var67, var65 - var59);
                    var67 += var66 - var60;
                    this.field141[var68] = (byte) (this.field141[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field141[var63] = (byte) (this.field141[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1574(-44);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method1574(-107) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field129[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field129[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var24.length) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class330.method2128((byte) 59, var81, var79 - var72);
                    int var84 = (this.field129[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field129[var82] = (byte) var84;
                    var81 += var80 - var73;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field129[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field129[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field1806 = var2.method1574(-127);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class148 var93 = var19[var87];
            if (var93.field1808 != null) {
                var93.field1809 = var2.method1574(-99);
            }
            if (var93.field1814 != null) {
                var93.field1813 = var2.method1574(-123);
            }
            if (var93.field1806 > 0) {
                var93.field1810 = var2.method1574(-7);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field1817 = var2.method1574(-96);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class148 var92 = var19[var89];
            if (var92.field1817 > 0) {
                var92.field1812 = var2.method1574(-107);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class148 var91 = var19[var90];
            if (var91.field1812 > 0) {
                var91.field1818 = var2.method1574(-80);
            }
        }
    }
}
