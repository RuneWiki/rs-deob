import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class141 extends class5 {

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "[Lq;")
    public class111[] field3222;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "[B")
    public byte[] field3219;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "[I")
    private int[] field3223;

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "[S")
    public short[] field3225;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "[B")
    public byte[] field3205;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "[Lnb;")
    public class92[] field3229;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "[B")
    public byte[] field3215;

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "I")
    public int field3226;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field3207 = 0;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "Lhe;")
    public static class54 field3212 = class6.method58("Suche nach Updates )2 ", false);

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field3210 = 0;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "Z")
    public static boolean field3214 = false;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "Lhe;")
    public static class54 field3218 = class6.method58("Lade Eingabe)2Steuerungsprogramm)3)3)3", false);

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "Lhe;")
    private static class54 field3224 = class6.method58("Loaded update list", false);

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "Z")
    public static boolean field3216 = false;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "[I")
    public static int[] field3227 = new int[2048];

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "Lhe;")
    public static class54 field3228 = field3224;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "[[[I")
    public static int[][][] field3211 = new int[4][105][105];

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "[I")
    public static int[] field3206;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "[[B")
    public static byte[][] field3221;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "([BLwc;[IZ)Z")
    public final boolean method1087(byte[] arg0, class156 arg1, int[] arg2, boolean arg3) {
        boolean var5 = true;
        field3213++;
        if (arg3) {
            this.field3222 = null;
        }
        int var6 = 0;
        class92 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field3223[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method1202(var9 >> 2, -17993, arg2);
                        } else {
                            var7 = arg1.method1201(arg2, -109, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3229[var8] = var7;
                        this.field3223[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IB)Lje;")
    public static final class67 method1088(int arg0, byte arg1) {
        field3209++;
        class67 var2 = (class67) class28.field753.method991((long) arg0, true);
        if (arg1 >= -103) {
            field3210 = -49;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class114.field2710.method266(10, (byte) 110, arg0);
        class67 var4 = new class67();
        var4.field1615 = arg0;
        if (var3 != null) {
            var4.method524(122, new class83(var3));
        }
        var4.method521(4065);
        if (var4.field1647 != -1) {
            var4.method530(99, method1088(var4.field1638, (byte) -107), method1088(var4.field1647, (byte) -124));
        }
        if (!class68.field1704 && var4.field1663) {
            var4.field1661 = 0;
            var4.field1649 = null;
            var4.field1652 = class85.field2127;
            var4.field1669 = null;
        }
        class28.field753.method990(true, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V")
    public final void method1089(int arg0) {
        this.field3223 = null;
        field3220++;
        if (arg0 != 0) {
            this.field3219 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V")
    public static void method1090(boolean arg0) {
        field3206 = null;
        field3227 = null;
        field3221 = null;
        field3218 = null;
        field3212 = null;
        field3224 = null;
        field3211 = null;
        if (arg0) {
            method1090(true);
        }
        field3228 = null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public static final void method1091(int arg0) {
        field3217++;
        if (arg0 != 0) {
            method1088(31, (byte) 65);
        }
        while (true) {
            class130 var1 = class71.field1771;
            class86 var2;
            synchronized (class71.field1771) {
                var2 = (class86) class26.field704.method980(-2);
            }
            if (var2 == null) {
                return;
            }
            var2.field2131.method228(var2.field2128, (int) var2.field154, var2.field2133, false, false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V")
    public class141() {
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "([B)V")
    public class141(byte[] arg0) {
        this.field3222 = new class111[128];
        this.field3219 = new byte[128];
        this.field3223 = new int[128];
        this.field3225 = new short[128];
        this.field3205 = new byte[128];
        this.field3229 = new class92[128];
        int var2 = 0;
        this.field3215 = new byte[128];
        class83 var3 = new class83(arg0);
        while (var3.field2055[var3.field2076 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method651(-118);
        }
        var3.field2076++;
        int var6 = var3.field2076;
        var2++;
        int var7 = 0;
        var3.field2076 += var2;
        while (var3.field2055[var3.field2076 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method651(18);
        }
        var7++;
        var3.field2076++;
        int var10 = 0;
        int var11 = var3.field2076;
        var3.field2076 += var7;
        while (var3.field2055[var3.field2076 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method651(-117);
        }
        var10++;
        var3.field2076++;
        byte[] var14 = new byte[var10];
        int var16;
        if (var10 > 1) {
            int var15 = 1;
            var16 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var18 = var3.method638(0);
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
            var16 = var10;
        }
        class111[] var19 = new class111[var16];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class111 var103 = var19[var20] = new class111();
            int var104 = var3.method638(0);
            if (var104 > 0) {
                var103.field2672 = new byte[var104 * 2];
            }
            int var105 = var3.method638(0);
            if (var105 > 0) {
                var103.field2671 = new byte[var105 * 2 + 2];
                var103.field2671[1] = 64;
            }
        }
        int var21 = 0;
        int var22 = var3.method638(0);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24 = var3.method638(0);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        while (var3.field2055[var3.field2076 + var21] != 0) {
            var21++;
        }
        byte[] var26 = new byte[var21];
        for (int var27 = 0; var27 < var21; var27++) {
            var26[var27] = var3.method651(14);
        }
        var3.field2076++;
        var21++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method638(0);
            this.field3225[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method638(0);
            this.field3225[var31] = (short) (this.field3225[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var34 < var26.length) {
                    var32 = var26[var34++];
                } else {
                    var32 = -1;
                }
                var33 = var3.method650(0);
            }
            var32--;
            this.field3225[var35] = (short) (this.field3225[var35] + (class118.method887(var33 - 1, 2) << 14));
            this.field3223[var35] = var33;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field3223[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var3.field2055[var6++] - 1;
                }
                this.field3215[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field3223[var43] != 0) {
                if (var41 == 0) {
                    var42 = var3.field2055[var11++] + 16 << 2;
                    if (var8.length <= var40) {
                        var41 = -1;
                    } else {
                        var41 = var8[var40++];
                    }
                }
                var41--;
                this.field3219[var43] = (byte) var42;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class111 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field3223[var47] != 0) {
                if (var44 == 0) {
                    var46 = var19[var14[var45]];
                    if (var12.length > var45) {
                        var44 = var12[var45++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field3222[var47] = var46;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var48 == 0) {
                if (var26.length > var49) {
                    var48 = var26[var49++];
                } else {
                    var48 = -1;
                }
                if (this.field3223[var51] > 0) {
                    var50 = var3.method638(0) + 1;
                }
            }
            this.field3205[var51] = (byte) var50;
            var48--;
        }
        this.field3226 = var3.method638(0) + 1;
        for (int var52 = 0; var52 < var16; var52++) {
            class111 var100 = var19[var52];
            if (var100.field2672 != null) {
                for (int var101 = 1; var101 < var100.field2672.length; var101 += 2) {
                    var100.field2672[var101] = var3.method651(20);
                }
            }
            if (var100.field2671 != null) {
                for (int var102 = 3; var102 < var100.field2671.length - 2; var102 += 2) {
                    var100.field2671[var102] = var3.method651(-116);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method651(18);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method651(-118);
            }
        }
        for (int var55 = 0; var55 < var16; var55++) {
            class111 var97 = var19[var55];
            if (var97.field2671 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field2671.length; var99 += 2) {
                    var98 = var3.method638(0) + var98 + 1;
                    var97.field2671[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var16; var56++) {
            class111 var94 = var19[var56];
            if (var94.field2672 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field2672.length; var96 += 2) {
                    var95 = var95 + var3.method638(0) + 1;
                    var94.field2672[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method638(0);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var57 + var3.method638(0) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field3205[var61] = (byte) (this.field3205[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) / 2 + (var65 - var59) * var60;
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class157.method1208(var67, -61, var65 - var59);
                    var67 += var66 - var60;
                    this.field3205[var68] = (byte) (this.field3205[var68] * var69 + 32 >> 6);
                }
                var59 = var65;
                var60 = var66;
            }
            Object var63 = null;
            for (int var64 = var59; var64 < 128; var64++) {
                this.field3205[var64] = (byte) (this.field3205[var64] * var60 + 32 >> 6);
            }
        }
        if (var25 != null) {
            int var70 = var3.method638(0);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var3.method638(0) + var70 + 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field3219[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field3219[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var25.length > var75) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) / 2 + (var79 - var73) * var72;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class157.method1208(var81, -31, var79 - var73);
                    int var84 = (this.field3219[var82] & 0xFF) + var83;
                    var81 += var80 - var72;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field3219[var82] = (byte) var84;
                }
                var73 = var79;
                var72 = var80;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field3219[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field3219[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var16; var86++) {
            var19[var86].field2677 = var3.method638(0);
        }
        for (int var87 = 0; var87 < var16; var87++) {
            class111 var93 = var19[var87];
            if (var93.field2672 != null) {
                var93.field2676 = var3.method638(0);
            }
            if (var93.field2671 != null) {
                var93.field2657 = var3.method638(0);
            }
            if (var93.field2677 > 0) {
                var93.field2668 = var3.method638(0);
            }
        }
        for (int var88 = 0; var88 < var16; var88++) {
            var19[var88].field2665 = var3.method638(0);
        }
        for (int var89 = 0; var89 < var16; var89++) {
            class111 var92 = var19[var89];
            if (var92.field2665 > 0) {
                var92.field2653 = var3.method638(0);
            }
        }
        for (int var90 = 0; var90 < var16; var90++) {
            class111 var91 = var19[var90];
            if (var91.field2653 > 0) {
                var91.field2651 = var3.method638(0);
            }
        }
    }
}
