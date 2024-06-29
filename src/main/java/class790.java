import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class790 extends class337 {

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "[B")
    public byte[] field10814;

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "[Lnga;")
    public class701[] field10821;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "[Luda;")
    public class459[] field10817;

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "[B")
    public byte[] field10825;

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "[S")
    public short[] field10828;

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "[I")
    private int[] field10826;

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "[B")
    public byte[] field10824;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "I")
    public int field10820;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "[[[I")
    public static int[][][] field10811 = new int[2][][];

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "Lwu;")
    public static class582 field10819 = new class582("", 11);

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "Lvha;")
    public static class71 field10827 = new class71("LIVE", 0);

    @OriginalMember(owner = "client!kca", name = "D", descriptor = "D")
    public static double field10829 = -1.0D;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "I")
    public static int field10815;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field10816;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public static int field10818;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "I")
    public static int field10822;

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "I")
    public static int field10823;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "Lwm;")
    public static class30 field10813;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "[Lpu;")
    public static class772[] field10812;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "()V", line = 6)
    public static final void method4321() {
        if (class137.field1810 != null) {
            for (int var0 = 0; var0 < class137.field1810.length; var0++) {
                for (int var1 = 0; var1 < class330.field4039; var1++) {
                    for (int var2 = 0; var2 < class559.field7102; var2++) {
                        if (class137.field1810[var0][var1][var2] != null) {
                            class137.field1810[var0][var1][var2].method4163(true);
                        }
                        class137.field1810[var0][var1][var2] = null;
                    }
                }
            }
        }
        class137.field1810 = null;
        class383.field4790 = null;
        if (class324.field4002 != null) {
            for (int var3 = 0; var3 < class324.field4002.length; var3++) {
                for (int var4 = 0; var4 < class330.field4039; var4++) {
                    for (int var5 = 0; var5 < class559.field7102; var5++) {
                        if (class324.field4002[var3][var4][var5] != null) {
                            class324.field4002[var3][var4][var5].method4163(true);
                        }
                        class324.field4002[var3][var4][var5] = null;
                    }
                }
            }
        }
        class324.field4002 = null;
        class735.field9973 = null;
        class28.field252 = null;
        class116.field1542 = null;
        class145.field1873 = null;
        class56.field726 = null;
        class19.field176 = null;
        class301.field3804 = null;
        class787.field10783 = null;
        class734.method3992((byte) -114);
        if (class757.field10327 != null) {
            for (int var6 = 0; var6 < class100.field1332; var6++) {
                class757.field10327[var6] = null;
            }
            class100.field1332 = 0;
        }
        class177.field2327 = null;
        class336.field4089 = null;
        class640.field8187 = null;
        if (class486.field6263 != null) {
            for (int var7 = 0; var7 < class486.field6263.length; var7++) {
                class486.field6263[var7] = null;
            }
            class304.field3830 = 0;
        }
        if (class166.field2215 != null) {
            for (int var8 = 0; var8 < class166.field2215.length; var8++) {
                class166.field2215[var8] = null;
            }
            class418.field5516 = 0;
        }
        if (class491.field6306 != null) {
            for (int var9 = 0; var9 < class451.field5892; var9++) {
                class491.field6306[var9] = null;
            }
            for (int var10 = 0; var10 < class78.field1121; var10++) {
                for (int var11 = 0; var11 < class330.field4039; var11++) {
                    for (int var12 = 0; var12 < class559.field7102; var12++) {
                        class412.field5464[var10][var11][var12] = 0L;
                    }
                }
            }
            class451.field5892 = 0;
        }
        class651.method3509((byte) 62);
        class108.field1468 = class108.field1466;
        class108.field1468.method4275(0);
        class329.field4032 = null;
        class656.field8465 = null;
        class490.field6303 = null;
        if (class166.field2206 != null) {
            class17.method74();
            class398.field5275.method939(1);
            class398.field5275.method995(0);
        }
        if (class520.field6609 != null) {
            class520.field6609 = null;
        }
        class398.field5275 = null;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([BLqj;I[I)Z", line = 177)
    public final boolean method4322(byte[] arg0, class628 arg1, int arg2, int[] arg3) {
        field10822++;
        boolean var5 = true;
        int var6 = 0;
        class701 var7 = null;
        int var8 = 0;
        if (arg2 >= -96) {
            return false;
        }
        while (var8 < 128) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field10826[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method3361(0, var9 >> 2, arg3);
                        } else {
                            var7 = arg1.method3363(arg3, 8, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field10821[var8] = var7;
                        this.field10826[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(II)Z", line = 238)
    public static final boolean method4323(int arg0, int arg1) {
        field10818++;
        if (arg1 != -4) {
            field10823 = 34;
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(B)V", line = 259)
    public final void method4324(byte arg0) {
        if (arg0 >= 39) {
            field10815++;
            this.field10826 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 272)
    public static void method4325(int arg0) {
        field10819 = null;
        field10813 = null;
        field10812 = null;
        field10827 = null;
        if (arg0 < -79) {
            field10811 = null;
        }
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(II)I", line = 294)
    public static final int method4326(int arg0, int arg1) {
        if (arg0 < 5) {
            return -94;
        } else {
            field10816++;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "()V", line = 312)
    public class790() {
    }

    @OriginalMember(owner = "client!kca", name = "<init>", descriptor = "([B)V", line = 317)
    public class790(byte[] arg0) {
        this.field10814 = new byte[128];
        this.field10821 = new class701[128];
        this.field10817 = new class459[128];
        this.field10825 = new byte[128];
        this.field10828 = new short[128];
        this.field10826 = new int[128];
        this.field10824 = new byte[128];
        class234 var2 = new class234(arg0);
        int var3;
        for (var3 = 0; var2.field3193[var2.field3133 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1554(27806);
        }
        var3++;
        var2.field3133++;
        int var6 = var2.field3133;
        var2.field3133 += var3;
        int var7;
        for (var7 = 0; var2.field3193[var2.field3133 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1554(27806);
        }
        var2.field3133++;
        var7++;
        int var10 = var2.field3133;
        var2.field3133 += var7;
        int var11;
        for (var11 = 0; var2.field3193[var2.field3133 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1554(27806);
        }
        var11++;
        var2.field3133++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var2.method1509(true);
                if (var18 == 0) {
                    var16 = var15++;
                } else {
                    if (var18 <= var16) {
                        var18--;
                    }
                    var16 = var18;
                }
                var14[var17] = (byte) var16;
            }
        } else {
            var15 = var11;
        }
        class459[] var19 = new class459[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class459 var103 = var19[var20] = new class459();
            int var104 = var2.method1509(true);
            if (var104 > 0) {
                var103.field5988 = new byte[var104 * 2];
            }
            int var105 = var2.method1509(true);
            if (var105 > 0) {
                var103.field5996 = new byte[var105 * 2 + 2];
                var103.field5996[1] = 64;
            }
        }
        int var21 = var2.method1509(true);
        byte[] var22 = var21 <= 0 ? null : new byte[var21 * 2];
        int var23 = var2.method1509(true);
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        int var25;
        for (var25 = 0; var2.field3193[var2.field3133 + var25] != 0; var25++) {
        }
        byte[] var26 = new byte[var25];
        for (int var27 = 0; var27 < var25; var27++) {
            var26[var27] = var2.method1554(27806);
        }
        var2.field3133++;
        var25++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var2.method1509(true);
            this.field10828[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var2.method1509(true);
            this.field10828[var31] = (short) (this.field10828[var31] + (var30 << 8));
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
                var34 = var2.method1525(false);
            }
            this.field10828[var35] = (short) (this.field10828[var35] + class249.method1625(32768, var34 - 1 << 14));
            var32--;
            this.field10826[var35] = var34;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field10826[var39] != 0) {
                if (var37 == 0) {
                    var38 = var2.field3193[var6++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field10825[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field10826[var43] != 0) {
                if (var41 == 0) {
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                    var42 = var2.field3193[var10++] + 16 << 2;
                }
                var41--;
                this.field10824[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class459 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field10826[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field10817[var47] = var46;
                var44--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length > var48) {
                    var49 = var26[var48++];
                } else {
                    var49 = -1;
                }
                if (this.field10826[var51] > 0) {
                    var50 = var2.method1509(true) + 1;
                }
            }
            this.field10814[var51] = (byte) var50;
            var49--;
        }
        this.field10820 = var2.method1509(true) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class459 var100 = var19[var52];
            if (var100.field5988 != null) {
                for (int var101 = 1; var101 < var100.field5988.length; var101 += 2) {
                    var100.field5988[var101] = var2.method1554(27806);
                }
            }
            if (var100.field5996 != null) {
                for (int var102 = 3; var102 < (var100.field5996.length - 2); var102 += 2) {
                    var100.field5996[var102] = var2.method1554(27806);
                }
            }
        }
        if (var22 != null) {
            for (int var53 = 1; var53 < var22.length; var53 += 2) {
                var22[var53] = var2.method1554(27806);
            }
        }
        if (var24 != null) {
            for (int var54 = 1; var54 < var24.length; var54 += 2) {
                var24[var54] = var2.method1554(27806);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class459 var97 = var19[var55];
            if (var97.field5996 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field5996.length; var99 += 2) {
                    var98 = var2.method1509(true) + var98 + 1;
                    var97.field5996[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class459 var94 = var19[var56];
            if (var94.field5988 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field5988.length; var96 += 2) {
                    var95 = var2.method1509(true) + var95 + 1;
                    var94.field5988[var96] = (byte) var95;
                }
            }
        }
        if (var22 != null) {
            int var57 = var2.method1509(true);
            var22[0] = (byte) var57;
            for (int var58 = 2; var58 < var22.length; var58 += 2) {
                var57 = var2.method1509(true) + (var57 + 1);
                var22[var58] = (byte) var57;
            }
            byte var59 = var22[0];
            byte var60 = var22[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field10814[var61] = (byte) (this.field10814[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var22.length > var62) {
                byte var65 = var22[var62];
                byte var66 = var22[var62 + 1];
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class714.method3843(var65 - var59, var67, 124);
                    var67 += var66 - var60;
                    this.field10814[var68] = (byte) (this.field10814[var68] * var69 + 32 >> 6);
                }
                var62 += 2;
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field10814[var63] = (byte) (this.field10814[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var24 != null) {
            int var70 = var2.method1509(true);
            var24[0] = (byte) var70;
            for (int var71 = 2; var71 < var24.length; var71 += 2) {
                var70 = var70 + var2.method1509(true) + 1;
                var24[var71] = (byte) var70;
            }
            byte var72 = var24[0];
            int var73 = var24[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field10824[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field10824[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var24.length > var75) {
                byte var79 = var24[var75];
                int var80 = var24[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class714.method3843(var79 - var72, var81, 112);
                    int var84 = (this.field10824[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    var81 += var80 - var73;
                    this.field10824[var82] = (byte) var84;
                }
                var75 += 2;
                var73 = var80;
                var72 = var79;
            }
            Object var76 = null;
            for (int var77 = var72; var77 < 128; var77++) {
                int var78 = (this.field10824[var77] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field10824[var77] = (byte) var78;
            }
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field6001 = var2.method1509(true);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class459 var93 = var19[var87];
            if (var93.field5988 != null) {
                var93.field5991 = var2.method1509(true);
            }
            if (var93.field5996 != null) {
                var93.field5999 = var2.method1509(true);
            }
            if (var93.field6001 > 0) {
                var93.field6000 = var2.method1509(true);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field5985 = var2.method1509(true);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class459 var92 = var19[var89];
            if (var92.field5985 > 0) {
                var92.field5986 = var2.method1509(true);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class459 var91 = var19[var90];
            if (var91.field5986 > 0) {
                var91.field5989 = var2.method1509(true);
            }
        }
    }
}
