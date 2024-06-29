import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class138 extends class249 {

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "[B")
    public byte[] field2461;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[B")
    public byte[] field2458;

    @OriginalMember(owner = "client!oj", name = "v", descriptor = "[B")
    public byte[] field2464;

    @OriginalMember(owner = "client!oj", name = "z", descriptor = "[Lvh;")
    public class131[] field2468;

    @OriginalMember(owner = "client!oj", name = "w", descriptor = "[I")
    private int[] field2465;

    @OriginalMember(owner = "client!oj", name = "G", descriptor = "[Luh;")
    public class56[] field2475;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "[S")
    public short[] field2460;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public int field2457;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "Luc;")
    public static class11 field2459 = new class11(5);

    @OriginalMember(owner = "client!oj", name = "C", descriptor = "[I")
    public static int[] field2471 = new int[2];

    @OriginalMember(owner = "client!oj", name = "E", descriptor = "Lmb;")
    public static class96 field2473 = class243.method1708(" <col=ffff00>", (byte) 106);

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "Lmb;")
    public static class96 field2477 = class243.method1708("; version=1; path=)4; domain=", (byte) 111);

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "[I")
    public static int[] field2479 = new int[50];

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "Lmb;")
    public static class96 field2478 = null;

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "Lmb;")
    public static class96 field2480 = class243.method1708("M", (byte) 102);

    @OriginalMember(owner = "client!oj", name = "t", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!oj", name = "u", descriptor = "I")
    public static int field2463;

    @OriginalMember(owner = "client!oj", name = "x", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!oj", name = "y", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!oj", name = "A", descriptor = "I")
    public static int field2469;

    @OriginalMember(owner = "client!oj", name = "B", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!oj", name = "D", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!oj", name = "F", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!oj", name = "H", descriptor = "Lff;")
    public static class3 field2476;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)V")
    public static final void method1026(int arg0, int arg1, int arg2) {
        field2474++;
        class218 var3 = class33.method241(-112, arg0);
        int var4 = var3.field3734;
        if (arg1 != -24288) {
            field2476 = null;
        }
        int var5 = var3.field3731;
        int var6 = var3.field3738;
        int var7 = class19.field307[var6 - var5];
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class201.method1408(~var8 & class44.field758[var4] | var8 & arg2 << var5, var4, 59);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIIB)I")
    public static final int method1027(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg5 & 0x1) == 1) {
            int var7 = arg4;
            arg4 = arg1;
            arg1 = var7;
        }
        field2467++;
        int var8 = arg0 & 0x3;
        if (var8 == 0) {
            return arg2;
        }
        if (arg6 != -65) {
            field2477 = null;
        }
        if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 7 - (arg4 - 1) - arg2;
        } else {
            return 7 - arg3 - (arg1 + -1);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(IJ)V")
    public static final void method1028(int arg0, long arg1) {
        class140.field2505.field4124 = 0;
        field2463++;
        class140.field2505.method1652(87, (byte) 41);
        class140.field2505.method1668(arg1, arg0 + 32267);
        class106.field1800 = 1;
        class5.field107 = 0;
        if (arg0 != -32340) {
            method1031(91);
        }
        class77.field1322 = -3;
        class187.field3258 = 0;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public final void method1029(int arg0) {
        field2466++;
        this.field2465 = null;
        if (arg0 != 0) {
            method1027(-26, -68, 15, 83, 4, 97, (byte) 74);
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI)V")
    public static final void method1030(long arg0, int arg1) {
        field2469++;
        if (arg0 == 0L) {
            return;
        }
        if (class231.field3974 >= 100) {
            class226.method1540(class120.field2227, 0, (byte) 90, class20.field338);
            return;
        }
        class96 var3 = class57.method421((byte) -114, arg0).method706((byte) -117);
        for (int var4 = 0; var4 < class231.field3974; var4++) {
            if (class7.field132[var4] == arg0) {
                class226.method1540(class120.field2227, 0, (byte) -118, class36.method289(-5615, new class96[] { var3, class260.field4551 }));
                return;
            }
        }
        if (arg1 != 31491) {
            field2459 = null;
        }
        for (int var5 = 0; var5 < class76.field1306; var5++) {
            if (class250.field4317[var5] == arg0) {
                class226.method1540(class120.field2227, 0, (byte) -93, class36.method289(-5615, new class96[] { class121.field2233, var3, class52.field917 }));
                return;
            }
        }
        if (var3.method705(0, class236.field4047.field828)) {
            class226.method1540(class120.field2227, 0, (byte) 103, class206.field3532);
            return;
        }
        class181.field3151++;
        class7.field132[class231.field3974] = arg0;
        class106.field1804[class231.field3974++] = class57.method421((byte) -114, arg0);
        class208.field3588 = class67.field1137;
        class140.field2505.method1012((byte) 93, 120);
        class140.field2505.method1668(arg0, -65);
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public static void method1031(int arg0) {
        field2480 = null;
        field2473 = null;
        field2459 = null;
        field2476 = null;
        field2479 = null;
        field2478 = null;
        if (arg0 < -24) {
            field2477 = null;
            field2471 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([I[BBLd;)Z")
    public final boolean method1032(int[] arg0, byte[] arg1, byte arg2, class51 arg3) {
        field2462++;
        boolean var5 = true;
        int var6 = 0;
        if (arg2 >= -110) {
            return false;
        }
        class131 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field2465[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method387(arg0, var9 >> 2, (byte) -123);
                        } else {
                            var7 = arg3.method390(arg0, var9 >> 2, 125);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2468[var8] = var7;
                        this.field2465[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1033(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 != -15808) {
            field2478 = null;
        }
        class64[] var7 = class46.field790;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class64 var9 = var7[var8];
            if (var9 != null && var9.field1101 == 2) {
                class201.method1409((var9.field1094 - class225.field3832 << 7) + var9.field1103, arg6, arg3 >> 1, (var9.field1102 - class196.field3383 << 7) + var9.field1104, var9.field1096 * 2, arg1 >> 1, 8639, arg4);
                if (class179.field3093 > -1 && class236.field4053 % 20 < 10) {
                    class181.field3140[var9.field1091].method1057(arg0 - (12 - class179.field3093), class220.field3756 + arg2 + -28);
                }
            }
        }
        field2470++;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class138() {
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "([B)V")
    public class138(byte[] arg0) {
        this.field2461 = new byte[128];
        this.field2458 = new byte[128];
        this.field2464 = new byte[128];
        this.field2468 = new class131[128];
        this.field2465 = new int[128];
        this.field2475 = new class56[128];
        this.field2460 = new short[128];
        int var2 = 0;
        class239 var3 = new class239(arg0);
        while (var3.field4144[var3.field4124 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1656(-124);
        }
        var2++;
        var3.field4124++;
        int var6 = var3.field4124;
        int var7 = 0;
        var3.field4124 += var2;
        while (var3.field4144[var3.field4124 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1656(-119);
        }
        var7++;
        var3.field4124++;
        int var10 = var3.field4124;
        var3.field4124 += var7;
        int var11;
        for (var11 = 0; var3.field4144[var3.field4124 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1656(-63);
        }
        var11++;
        var3.field4124++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1651(4139);
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
        class56[] var19 = new class56[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class56 var103 = var19[var20] = new class56();
            int var104 = var3.method1651(4139);
            if (var104 > 0) {
                var103.field980 = new byte[var104 * 2];
            }
            int var105 = var3.method1651(4139);
            if (var105 > 0) {
                var103.field990 = new byte[var105 * 2 + 2];
                var103.field990[1] = 64;
            }
        }
        int var21 = var3.method1651(4139);
        int var22 = 0;
        byte[] var23 = var21 <= 0 ? null : new byte[var21 * 2];
        int var24 = var3.method1651(4139);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        while (var3.field4144[var3.field4124 + var22] != 0) {
            var22++;
        }
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method1656(-96);
        }
        var3.field4124++;
        int var28 = 0;
        var22++;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1651(4139);
            this.field2460[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1651(4139);
            this.field2460[var31] = (short) (this.field2460[var31] + (var30 << 8));
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
                var34 = var3.method1633((byte) -127);
            }
            this.field2460[var35] = (short) (this.field2460[var35] + class130.method985(32768, var34 - 1 << 14));
            this.field2465[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field2465[var39] != 0) {
                if (var37 == 0) {
                    if (var4.length <= var36) {
                        var37 = -1;
                    } else {
                        var37 = var4[var36++];
                    }
                    var38 = var3.field4144[var6++] - 1;
                }
                var37--;
                this.field2458[var39] = (byte) var38;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field2465[var43] != 0) {
                if (var41 == 0) {
                    if (var40 < var8.length) {
                        var41 = var8[var40++];
                    } else {
                        var41 = -1;
                    }
                    var42 = var3.field4144[var10++] + 16 << 2;
                }
                this.field2461[var43] = (byte) var42;
                var41--;
            }
        }
        int var44 = 0;
        class56 var45 = null;
        int var46 = 0;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field2465[var47] != 0) {
                if (var46 == 0) {
                    var45 = var19[var14[var44]];
                    if (var12.length > var44) {
                        var46 = var12[var44++];
                    } else {
                        var46 = -1;
                    }
                }
                var46--;
                this.field2475[var47] = var45;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var49 == 0) {
                if (var26.length <= var50) {
                    var49 = -1;
                } else {
                    var49 = var26[var50++];
                }
                if (this.field2465[var51] > 0) {
                    var48 = var3.method1651(4139) + 1;
                }
            }
            var49--;
            this.field2464[var51] = (byte) var48;
        }
        this.field2457 = var3.method1651(4139) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class56 var100 = var19[var52];
            if (var100.field980 != null) {
                for (int var101 = 1; var101 < var100.field980.length; var101 += 2) {
                    var100.field980[var101] = var3.method1656(77);
                }
            }
            if (var100.field990 != null) {
                for (int var102 = 3; var102 < (var100.field990.length - 2); var102 += 2) {
                    var100.field990[var102] = var3.method1656(-116);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1656(-50);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1656(114);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class56 var97 = var19[var55];
            if (var97.field990 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field990.length; var99 += 2) {
                    var98 += var3.method1651(4139) + 1;
                    var97.field990[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class56 var94 = var19[var56];
            if (var94.field980 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field980.length; var96 += 2) {
                    var95 = var3.method1651(4139) + var95 + 1;
                    var94.field980[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method1651(4139);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var3.method1651(4139) + var57 + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[0];
            byte var60 = var23[1];
            for (int var61 = 0; var61 < var59; var61++) {
                this.field2464[var61] = (byte) (this.field2464[var61] * var60 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62];
                byte var66 = var23[var62 + 1];
                var62 += 2;
                int var67 = (var65 - var59) * var60 + ((var65 - var59) / 2);
                for (int var68 = var59; var68 < var65; var68++) {
                    int var69 = class176.method1257((byte) 116, var67, var65 - var59);
                    var67 += var66 - var60;
                    this.field2464[var68] = (byte) (this.field2464[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var59; var63 < 128; var63++) {
                this.field2464[var63] = (byte) (this.field2464[var63] * var60 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method1651(4139);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method1651(4139) + 1;
                var25[var71] = (byte) var70;
            }
            int var72 = var25[1] << 1;
            byte var73 = var25[0];
            for (int var74 = 0; var74 < var73; var74++) {
                int var85 = (this.field2461[var74] & 0xFF) + var72;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field2461[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                var75 += 2;
                int var81 = (var79 - var73) / 2 + (var79 - var73) * var72;
                for (int var82 = var73; var82 < var79; var82++) {
                    int var83 = class176.method1257((byte) 117, var81, var79 - var73);
                    int var84 = (this.field2461[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    var81 += var80 - var72;
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field2461[var82] = (byte) var84;
                }
                var72 = var80;
                var73 = var79;
            }
            for (int var76 = var73; var76 < 128; var76++) {
                int var78 = (this.field2461[var76] & 0xFF) + var72;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field2461[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field988 = var3.method1651(4139);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class56 var93 = var19[var87];
            if (var93.field980 != null) {
                var93.field970 = var3.method1651(4139);
            }
            if (var93.field990 != null) {
                var93.field986 = var3.method1651(4139);
            }
            if (var93.field988 > 0) {
                var93.field982 = var3.method1651(4139);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field968 = var3.method1651(4139);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class56 var92 = var19[var89];
            if (var92.field968 > 0) {
                var92.field963 = var3.method1651(4139);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class56 var91 = var19[var90];
            if (var91.field963 > 0) {
                var91.field985 = var3.method1651(4139);
            }
        }
    }
}
