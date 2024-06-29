import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class443 extends class467 {

    @OriginalMember(owner = "client!jt", name = "n", descriptor = "[B")
    public byte[] field6587;

    @OriginalMember(owner = "client!jt", name = "y", descriptor = "[B")
    public byte[] field6598;

    @OriginalMember(owner = "client!jt", name = "s", descriptor = "[I")
    private int[] field6592;

    @OriginalMember(owner = "client!jt", name = "w", descriptor = "[Luq;")
    public class343[] field6596;

    @OriginalMember(owner = "client!jt", name = "v", descriptor = "[S")
    public short[] field6595;

    @OriginalMember(owner = "client!jt", name = "o", descriptor = "[Lqh;")
    public class51[] field6588;

    @OriginalMember(owner = "client!jt", name = "q", descriptor = "[B")
    public byte[] field6590;

    @OriginalMember(owner = "client!jt", name = "t", descriptor = "I")
    public int field6593;

    @OriginalMember(owner = "client!jt", name = "r", descriptor = "I")
    public static int field6591 = 100;

    @OriginalMember(owner = "client!jt", name = "z", descriptor = "Leb;")
    public static class7 field6599 = new class7();

    @OriginalMember(owner = "client!jt", name = "C", descriptor = "I")
    public static int field6602 = -2;

    @OriginalMember(owner = "client!jt", name = "B", descriptor = "Lvr;")
    public static class306 field6601 = new class306();

    @OriginalMember(owner = "client!jt", name = "p", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!jt", name = "u", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!jt", name = "x", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!jt", name = "A", descriptor = "I")
    public static int field6600;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "([B[ILen;B)Z", line = 5)
    public final boolean method2670(byte[] arg0, int[] arg1, class276 arg2, byte arg3) {
        field6597++;
        boolean var5 = true;
        int var6 = 0;
        if (arg3 < 59) {
            return false;
        }
        class343 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field6592[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1753(arg1, var9 >> 2, 0);
                        } else {
                            var7 = arg2.method1751(arg1, var9 >> 2, (byte) 122);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6596[var8] = var7;
                        this.field6592[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IB)V", line = 67)
    public static final void method2671(int arg0, byte arg1) {
        class157 var2 = class295.field4360;
        synchronized (class295.field4360) {
            class295.field4360.method1016(arg0, (byte) 127);
        }
        field6589++;
        if (arg1 == -60) {
            class157 var3 = class166.field2417;
            synchronized (class166.field2417) {
                class166.field2417.method1016(arg0, (byte) 124);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "(I)V", line = 89)
    public final void method2672(int arg0) {
        field6600++;
        if (arg0 != -19496) {
            this.method2672(33);
        }
        this.field6592 = null;
    }

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "(I)V", line = 101)
    public static void method2673(int arg0) {
        if (arg0 >= 98) {
            field6601 = null;
            field6599 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ZI)I", line = 114)
    public static final int method2674(boolean arg0, int arg1) {
        field6594++;
        return arg0 ? arg1 >>> 10 : 25;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 130)
    public class443() {
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "([B)V", line = 136)
    public class443(byte[] arg0) {
        this.field6587 = new byte[128];
        this.field6598 = new byte[128];
        this.field6592 = new int[128];
        this.field6596 = new class343[128];
        this.field6595 = new short[128];
        this.field6588 = new class51[128];
        this.field6590 = new byte[128];
        class91 var2 = new class91(arg0);
        int var3;
        for (var3 = 0; var2.field1277[var2.field1292 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method619((byte) -23);
        }
        var3++;
        var2.field1292++;
        int var6 = var2.field1292;
        var2.field1292 += var3;
        int var7;
        for (var7 = 0; var2.field1277[var2.field1292 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method619((byte) -23);
        }
        var2.field1292++;
        var7++;
        int var10 = var2.field1292;
        var2.field1292 += var7;
        int var11;
        for (var11 = 0; var2.field1277[var2.field1292 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method619((byte) -23);
        }
        var11++;
        var2.field1292++;
        byte[] var14 = new byte[var11];
        int var16;
        if (var11 > 1) {
            var14[1] = 1;
            int var15 = 1;
            var16 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method618((byte) 100);
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
        class51[] var19 = new class51[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class51 var103 = var19[var20] = new class51();
            int var104 = var2.method618((byte) 100);
            if (var104 > 0) {
                var103.field691 = new byte[var104 * 2];
            }
            int var105 = var2.method618((byte) 100);
            if (var105 > 0) {
                var103.field686 = new byte[var105 * 2 + 2];
                var103.field686[1] = 64;
            }
        }
        int var21 = var2.method618((byte) 100);
        byte[] var22 = var21 > 0 ? new byte[var21 * 2] : null;
        int var23 = var2.method618((byte) 100);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field1277[var2.field1292 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method619((byte) -23);
        }
        var2.field1292++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method618((byte) 100);
            this.field6595[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method618((byte) 100);
            this.field6595[var31] = (short) (this.field6595[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 < var26.length) {
                    var32 = var26[var33++];
                } else {
                    var32 = -1;
                }
                var34 = var2.method587((byte) -78);
            }
            this.field6595[var35] = (short) (this.field6595[var35] + (class494.method2942(2, var34 - 1) << 14));
            var32--;
            this.field6592[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field6592[var39] != 0) {
                if (var36 == 0) {
                    var38 = var2.field1277[var6++] - 1;
                    if (var4.length > var37) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field6587[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field6592[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var2.field1277[var10++] + 16 << 2;
                }
                this.field6598[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class51 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field6592[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var12.length <= var44) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                this.field6588[var47] = var46;
                var45--;
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
                if (this.field6592[var51] > 0) {
                    var50 = var2.method618((byte) 100) + 1;
                }
            }
            this.field6590[var51] = (byte) var50;
            var49--;
        }
        this.field6593 = var2.method618((byte) 100) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class51 var100 = var19[var52];
            if (var100.field691 != null) {
                for (int var101 = 1; var101 < var100.field691.length; var101 += 2) {
                    var100.field691[var101] = var2.method619((byte) -23);
                }
            }
            if (var100.field686 != null) {
                for (int var102 = 3; var102 < (var100.field686.length - 2); var102 += 2) {
                    var100.field686[var102] = var2.method619((byte) -23);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method619((byte) -23);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method619((byte) -23);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class51 var97 = var19[var55];
            if (var97.field686 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field686.length; var99 += 2) {
                    var98 -= -var2.method618((byte) 100) - 1;
                    var97.field686[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class51 var94 = var19[var56];
            if (var94.field691 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field691.length; var96 += 2) {
                    var95 += var2.method618((byte) 100) + 1;
                    var94.field691[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method618((byte) 100);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 -= -var2.method618((byte) 100) - 1;
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field6590[var61] = (byte) (this.field6590[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class406.method2480(var65 - var59, var67, -400678849);
                    var67 += var66 - var60;
                    this.field6590[var68] = (byte) (this.field6590[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var62 += 2;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field6590[var63] = (byte) (this.field6590[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method618((byte) 100);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var2.method618((byte) 100) + var70 + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field6598[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field6598[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class406.method2480(var79 - var72, var81, -400678849);
                    int var84 = (this.field6598[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field6598[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field6598[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field6598[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field685 = var2.method618((byte) 100);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class51 var93 = var19[var87];
            if (var93.field691 != null) {
                var93.field688 = var2.method618((byte) 100);
            }
            if (var93.field686 != null) {
                var93.field687 = var2.method618((byte) 100);
            }
            if (var93.field685 > 0) {
                var93.field693 = var2.method618((byte) 100);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field682 = var2.method618((byte) 100);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class51 var92 = var19[var89];
            if (var92.field682 > 0) {
                var92.field684 = var2.method618((byte) 100);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class51 var91 = var19[var90];
            if (var91.field684 > 0) {
                var91.field690 = var2.method618((byte) 100);
            }
        }
    }
}
