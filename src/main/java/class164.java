import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class164 extends class55 {

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "[I")
    private int[] field2056;

    @OriginalMember(owner = "client!tba", name = "u", descriptor = "[B")
    public byte[] field2062;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "[Lib;")
    public class155[] field2053;

    @OriginalMember(owner = "client!tba", name = "p", descriptor = "[B")
    public byte[] field2057;

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "[B")
    public byte[] field2065;

    @OriginalMember(owner = "client!tba", name = "s", descriptor = "[S")
    public short[] field2060;

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "[Lfm;")
    public class734[] field2064;

    @OriginalMember(owner = "client!tba", name = "t", descriptor = "I")
    public int field2061;

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "Lhda;")
    public static class750 field2054 = new class750(3, 2);

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!tba", name = "q", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!tba", name = "r", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!tba", name = "v", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V", line = 6)
    public static final void method964(boolean arg0) {
        field2059++;
        for (class396 var1 = (class396) class337.field4552.method115((byte) -72); var1 != null; var1 = (class396) class337.field4552.method115((byte) -72)) {
            class285.method1708(20, var1);
        }
        if (!arg0) {
            method964(false);
        }
        int var2;
        int var3;
        if (class11.field68.field5548.method186((byte) 120) == 1) {
            var2 = 3;
            var3 = 0;
        } else {
            var2 = class131.field1693;
            var3 = class131.field1693;
        }
        client.method1833();
        for (int var4 = var3; var4 <= var2; var4++) {
            client.method1820();
            client.method1824(var4);
            client.method1829(var4);
        }
        client.method1832();
        client.method1834();
    }

    @OriginalMember(owner = "client!tba", name = "c", descriptor = "(Z)V", line = 51)
    public final void method965(boolean arg0) {
        if (!arg0) {
            method967(-105);
        }
        field2058++;
        this.field2056 = null;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(II)Z", line = 67)
    public static final boolean method966(int arg0, int arg1) {
        field2055++;
        if (arg0 >= -127) {
            field2054 = null;
        }
        for (class227 var2 = (class227) class139.field1783.method724(32); var2 != null; var2 = (class227) class139.field1783.method723(96)) {
            if (class641.method3607(var2.field2948, (byte) -38) && ((long) arg1) == var2.field2945) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V", line = 91)
    public static final void method967(int arg0) {
        class728.method4089(16535);
        if (arg0 != 2) {
            method966(-31, -6);
        }
        field2063++;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V", line = 113)
    public class164() {
    }

    @OriginalMember(owner = "client!tba", name = "b", descriptor = "(I)V", line = 116)
    public static void method968(int arg0) {
        if (arg0 == 0) {
            field2054 = null;
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "([B)V", line = 125)
    public class164(byte[] arg0) {
        this.field2056 = new int[128];
        this.field2062 = new byte[128];
        this.field2053 = new class155[128];
        this.field2057 = new byte[128];
        this.field2065 = new byte[128];
        this.field2060 = new short[128];
        this.field2064 = new class734[128];
        class611 var2 = new class611(arg0);
        int var3;
        for (var3 = 0; var2.field8529[var2.field8520 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method3390((byte) -19);
        }
        var3++;
        var2.field8520++;
        int var6 = var2.field8520;
        var2.field8520 += var3;
        int var7;
        for (var7 = 0; var2.field8529[var2.field8520 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method3390((byte) -19);
        }
        var7++;
        var2.field8520++;
        int var10 = var2.field8520;
        var2.field8520 += var7;
        int var11;
        for (var11 = 0; var2.field8529[var2.field8520 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method3390((byte) -19);
        }
        var2.field8520++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method3428((byte) -110);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var16 >= var105) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class734[] var18 = new class734[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class734 var102 = var18[var19] = new class734();
            int var103 = var2.method3428((byte) 98);
            if (var103 > 0) {
                var102.field10235 = new byte[var103 * 2];
            }
            int var104 = var2.method3428((byte) 114);
            if (var104 > 0) {
                var102.field10234 = new byte[var104 * 2 + 2];
                var102.field10234[1] = 64;
            }
        }
        int var20 = var2.method3428((byte) -121);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method3428((byte) -108);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field8529[var2.field8520 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method3390((byte) -19);
        }
        var24++;
        var2.field8520++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method3428((byte) 26);
            this.field2060[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method3428((byte) -115);
            this.field2060[var30] = (short) (this.field2060[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length <= var32) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method3439((byte) -20);
            }
            this.field2060[var34] = (short) (this.field2060[var34] + class321.method1919(32768, var33 - 1 << 14));
            this.field2056[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2056[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field8529[var6++] - 1;
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                this.field2062[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2056[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field8529[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field2057[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class734 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2056[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                var43--;
                this.field2064[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field2056[var50] > 0) {
                    var49 = var2.method3428((byte) 52) + 1;
                }
            }
            this.field2065[var50] = (byte) var49;
            var48--;
        }
        this.field2061 = var2.method3428((byte) -108) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class734 var99 = var18[var51];
            if (var99.field10235 != null) {
                for (int var100 = 1; var100 < var99.field10235.length; var100 += 2) {
                    var99.field10235[var100] = var2.method3390((byte) -19);
                }
            }
            if (var99.field10234 != null) {
                for (int var101 = 3; var101 < (var99.field10234.length - 2); var101 += 2) {
                    var99.field10234[var101] = var2.method3390((byte) -19);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method3390((byte) -19);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method3390((byte) -19);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class734 var96 = var18[var54];
            if (var96.field10234 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field10234.length; var98 += 2) {
                    var97 = var2.method3428((byte) 16) + (var97 + 1);
                    var96.field10234[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class734 var93 = var18[var55];
            if (var93.field10235 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field10235.length; var95 += 2) {
                    var94 -= -var2.method3428((byte) -113) - 1;
                    var93.field10235[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method3428((byte) 81);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method3428((byte) 126) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2065[var60] = (byte) (this.field2065[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class39.method189(749908671, var66, var64 - var58);
                    this.field2065[var67] = (byte) (this.field2065[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field2065[var63] = (byte) (this.field2065[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method3428((byte) -108);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method3428((byte) 61) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2057[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2057[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class39.method189(749908671, var80, var78 - var71);
                    int var83 = (this.field2057[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2057[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2057[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2057[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field10228 = var2.method3428((byte) 121);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class734 var92 = var18[var86];
            if (var92.field10235 != null) {
                var92.field10232 = var2.method3428((byte) -120);
            }
            if (var92.field10234 != null) {
                var92.field10236 = var2.method3428((byte) -119);
            }
            if (var92.field10228 > 0) {
                var92.field10233 = var2.method3428((byte) 104);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field10231 = var2.method3428((byte) 19);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class734 var91 = var18[var88];
            if (var91.field10231 > 0) {
                var91.field10229 = var2.method3428((byte) 100);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class734 var90 = var18[var89];
            if (var90.field10229 > 0) {
                var90.field10239 = var2.method3428((byte) -102);
            }
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "([BLsv;B[I)Z", line = 761)
    public final boolean method969(byte[] arg0, class659 arg1, byte arg2, int[] arg3) {
        field2052++;
        boolean var5 = true;
        if (arg2 > -116) {
            return false;
        }
        int var6 = 0;
        class155 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2056[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method3727(-2, var9 >> 2, arg3);
                        } else {
                            var7 = arg1.method3729(var9 >> 2, true, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2053[var8] = var7;
                        this.field2056[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }
}
