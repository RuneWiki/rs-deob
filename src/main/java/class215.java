import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class215 extends class141 {

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "[B")
    public byte[] field3746;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "[Lnm;")
    public class202[] field3742;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "[B")
    public byte[] field3747;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "[I")
    private int[] field3741;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "[B")
    public byte[] field3740;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "[Lvk;")
    public class154[] field3751;

    @OriginalMember(owner = "client!qj", name = "z", descriptor = "[S")
    public short[] field3753;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Lam;")
    public static class277 field3743 = new class277();

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "Lhi;")
    public static class82 field3750 = class95.method664((byte) -31, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!qj", name = "B", descriptor = "Lhi;")
    public static class82 field3755 = class95.method664((byte) -83, "::noclip");

    @OriginalMember(owner = "client!qj", name = "F", descriptor = "Lhi;")
    public static class82 field3759 = class95.method664((byte) -36, "Hierhin gehen");

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3752;

    @OriginalMember(owner = "client!qj", name = "A", descriptor = "I")
    public static int field3754;

    @OriginalMember(owner = "client!qj", name = "C", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!qj", name = "D", descriptor = "I")
    public static int field3757;

    @OriginalMember(owner = "client!qj", name = "E", descriptor = "I")
    public static int field3758;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)Le;", line = 4)
    public static final class227 method1531(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            method1537((byte[]) null, 59);
        }
        field3754++;
        class227 var3 = (class227) class119.field2101.method507((long) arg1 << 32 | (long) arg2, arg0 ^ 0xDC17B81F);
        if (var3 == null) {
            var3 = new class227(arg1, arg2);
            class119.field2101.method503(var3.field2418, -96, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BILbc;Lsm;)V", line = 27)
    public static final void method1532(byte arg0, int arg1, class153 arg2, class120 arg3) {
        class291 var4 = new class291();
        field3749++;
        var4.field4890 = arg2.method1082(-90);
        var4.field4882 = arg2.method1097((byte) -98);
        var4.field4891 = new class301[var4.field4890];
        var4.field4895 = new class301[var4.field4890];
        var4.field4887 = new byte[var4.field4890][][];
        if (arg0 != -42) {
            field3743 = (class277) null;
        }
        var4.field4894 = new int[var4.field4890];
        var4.field4886 = new int[var4.field4890];
        var4.field4885 = new int[var4.field4890];
        for (int var5 = 0; var5 < var4.field4890; var5++) {
            try {
                int var6 = arg2.method1082(-37);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var7 = new String(arg2.method1092((byte) 118).method552(false));
                    int var8 = 0;
                    String var9 = new String(arg2.method1092((byte) 118).method552(false));
                    if (var6 == 1) {
                        var8 = arg2.method1097((byte) -76);
                    }
                    var4.field4894[var5] = var6;
                    var4.field4886[var5] = var8;
                    var4.field4891[var5] = arg3.method827((byte) 103, var9, class171.method1208(var7, -108));
                } else if (var6 == 3 || var6 == 4) {
                    String var10 = new String(arg2.method1092((byte) 118).method552(false));
                    String var11 = new String(arg2.method1092((byte) 118).method552(false));
                    int var12 = arg2.method1082(-94);
                    String[] var13 = new String[var12];
                    for (int var14 = 0; var14 < var12; var14++) {
                        var13[var14] = new String(arg2.method1092((byte) 118).method552(false));
                    }
                    byte[][] var15 = new byte[var12][];
                    if (var6 == 3) {
                        for (int var16 = 0; var16 < var12; var16++) {
                            int var17 = arg2.method1097((byte) -84);
                            var15[var16] = new byte[var17];
                            arg2.method1093(0, var17, 106, var15[var16]);
                        }
                    }
                    Class[] var18 = new Class[var12];
                    var4.field4894[var5] = var6;
                    for (int var19 = 0; var19 < var12; var19++) {
                        var18[var19] = class171.method1208(var13[var19], 75);
                    }
                    var4.field4895[var5] = arg3.method824(var11, class171.method1208(var10, -81), 9526, var18);
                    var4.field4887[var5] = var15;
                }
            } catch (ClassNotFoundException var25) {
                var4.field4885[var5] = -1;
            } catch (SecurityException var26) {
                var4.field4885[var5] = -2;
            } catch (NullPointerException var27) {
                var4.field4885[var5] = -3;
            } catch (Exception var28) {
                var4.field4885[var5] = -4;
            } catch (Throwable var29) {
                var4.field4885[var5] = -5;
            }
        }
        class104.field1840.method1940((byte) 18, var4);
    }

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)V", line = 137)
    public static void method1533(int arg0) {
        field3755 = null;
        field3750 = null;
        field3759 = null;
        if (arg0 == 1) {
            field3743 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(ILum;B)Lqj;", line = 155)
    public static final class215 method1534(int arg0, class222 arg1, byte arg2) {
        field3745++;
        byte[] var3 = arg1.method1579(arg0, false);
        if (arg2 == -29) {
            return var3 == null ? null : new class215(var3);
        } else {
            return (class215) null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IZI)Z", line = 176)
    public static final boolean method1535(int arg0, boolean arg1, int arg2) {
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg1) {
            method1531(42, 66, 70);
        }
        class157 var3 = class99.method682(arg2, (byte) -82);
        field3756++;
        return var3.method1125(-120, arg0);
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BILqi;[I)Z", line = 207)
    public final boolean method1536(byte[] arg0, int arg1, class247 arg2, int[] arg3) {
        field3748++;
        boolean var5 = true;
        int var6 = 0;
        int var7 = 105 % ((arg1 + 23) / 63);
        class154 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field3741[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg2.method1773(arg3, 0, var10 >> 2);
                        } else {
                            var8 = arg2.method1766(0, var10 >> 2, arg3);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field3751[var9] = var8;
                        this.field3741[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)Lsc;", line = 270)
    public static final class145 method1537(byte[] arg0, int arg1) {
        field3758++;
        if (arg0 == null) {
            return null;
        }
        class145 var2 = new class145(arg0, class86.field1536, class20.field262, class107.field1897, class42.field747, class260.field4453);
        if (arg1 != 128) {
            method1535(81, false, -51);
        }
        class3.method23(286013516);
        return var2;
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V", line = 298)
    public final void method1538(byte arg0) {
        if (arg0 == 39) {
            field3757++;
            this.field3741 = null;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "()V", line = 307)
    public class215() {
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "([B)V", line = 314)
    private class215(byte[] arg0) {
        this.field3746 = new byte[128];
        this.field3742 = new class202[128];
        this.field3747 = new byte[128];
        int var2 = 0;
        this.field3741 = new int[128];
        this.field3740 = new byte[128];
        this.field3751 = new class154[128];
        this.field3753 = new short[128];
        class153 var3 = new class153(arg0);
        while (var3.field2598[var3.field2611 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1104(-1);
        }
        var3.field2611++;
        var2++;
        int var6 = var3.field2611;
        int var7 = 0;
        var3.field2611 += var2;
        while (var3.field2598[var3.field2611 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1104(-1);
        }
        var7++;
        var3.field2611++;
        int var10 = var3.field2611;
        var3.field2611 += var7;
        int var11;
        for (var11 = 0; var3.field2598[var3.field2611 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1104(-1);
        }
        var11++;
        var3.field2611++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1082(-51);
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
        }
        class202[] var19 = new class202[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class202 var21 = var19[var20] = new class202();
            int var22 = var3.method1082(-74);
            if (var22 > 0) {
                var21.field3474 = new byte[var22 * 2];
            }
            int var23 = var3.method1082(-67);
            if (var23 > 0) {
                var21.field3472 = new byte[var23 * 2 + 2];
                var21.field3472[1] = 64;
            }
        }
        int var24 = var3.method1082(-80);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method1082(-90);
        int var27 = 0;
        byte[] var28 = var26 <= 0 ? null : new byte[var26 * 2];
        while (var3.field2598[var3.field2611 + var27] != 0) {
            var27++;
        }
        byte[] var29 = new byte[var27];
        for (int var30 = 0; var30 < var27; var30++) {
            var29[var30] = var3.method1104(-1);
        }
        var3.field2611++;
        var27++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method1082(-90);
            this.field3753[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method1082(-53);
            this.field3753[var34] = (short) (this.field3753[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var36 == 0) {
                if (var35 >= var29.length) {
                    var36 = -1;
                } else {
                    var36 = var29[var35++];
                }
                var37 = var3.method1080(-84);
            }
            this.field3753[var38] = (short) (this.field3753[var38] + (class277.method1935(2, var37 - 1) << 14));
            var36--;
            this.field3741[var38] = var37;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3741[var42] != 0) {
                if (var39 == 0) {
                    var40 = var3.field2598[var6++] - 1;
                    if (var4.length > var41) {
                        var39 = var4[var41++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field3747[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3741[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field2598[var10++] + 16 << 2;
                    if (var43 < var8.length) {
                        var44 = var8[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field3740[var46] = (byte) var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        class202 var49 = null;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3741[var50] != 0) {
                if (var48 == 0) {
                    var49 = var19[var14[var47]];
                    if (var12.length <= var47) {
                        var48 = -1;
                    } else {
                        var48 = var12[var47++];
                    }
                }
                var48--;
                this.field3742[var50] = var49;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var53 >= var29.length) {
                    var51 = -1;
                } else {
                    var51 = var29[var53++];
                }
                if (this.field3741[var54] > 0) {
                    var52 = var3.method1082(-50) + 1;
                }
            }
            this.field3746[var54] = (byte) var52;
            var51--;
        }
        this.field3744 = var3.method1082(-92) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class202 var56 = var19[var55];
            if (var56.field3474 != null) {
                for (int var57 = 1; var57 < var56.field3474.length; var57 += 2) {
                    var56.field3474[var57] = var3.method1104(-1);
                }
            }
            if (var56.field3472 != null) {
                for (int var58 = 3; var58 < var56.field3472.length - 2; var58 += 2) {
                    var56.field3472[var58] = var3.method1104(-1);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method1104(-1);
            }
        }
        if (var28 != null) {
            for (int var60 = 1; var60 < var28.length; var60 += 2) {
                var28[var60] = var3.method1104(-1);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class202 var62 = var19[var61];
            if (var62.field3472 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field3472.length; var64 += 2) {
                    var63 = (var63 + var3.method1082(-31)) + 1;
                    var62.field3472[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class202 var66 = var19[var65];
            if (var66.field3474 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field3474.length; var68 += 2) {
                    var67 = var3.method1082(-122) + (var67 + 1);
                    var66.field3474[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method1082(-86);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var69 + var3.method1082(-112) + 1;
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3746[var73] = (byte) (this.field3746[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74];
                byte var76 = var25[var74 + 1];
                int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                for (int var78 = var71; var78 < var75; var78++) {
                    int var79 = class247.method1770(var75 - var71, -1771353473, var77);
                    var77 += var76 - var72;
                    this.field3746[var78] = (byte) (this.field3746[var78] * var79 + 32 >> 6);
                }
                var71 = var75;
                var74 += 2;
                var72 = var76;
            }
            Object var80 = null;
            for (int var81 = var71; var81 < 128; var81++) {
                this.field3746[var81] = (byte) (this.field3746[var81] * var72 + 32 >> 6);
            }
        }
        if (var28 != null) {
            int var82 = var3.method1082(-67);
            var28[0] = (byte) var82;
            for (int var83 = 2; var83 < var28.length; var83 += 2) {
                var82 = var3.method1082(-30) + var82 + 1;
                var28[var83] = (byte) var82;
            }
            byte var84 = var28[0];
            int var85 = var28[1] << 1;
            for (int var86 = 0; var86 < var84; var86++) {
                int var87 = (this.field3740[var86] & 0xFF) + var85;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3740[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var28.length > var88) {
                byte var89 = var28[var88];
                int var90 = var28[var88 + 1] << 1;
                int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                for (int var92 = var84; var92 < var89; var92++) {
                    int var93 = class247.method1770(var89 - var84, -1771353473, var91);
                    int var94 = (this.field3740[var92] & 0xFF) + var93;
                    var91 += var90 - var85;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3740[var92] = (byte) var94;
                }
                var88 += 2;
                var85 = var90;
                var84 = var89;
            }
            Object var95 = null;
            for (int var96 = var84; var96 < 128; var96++) {
                int var97 = (this.field3740[var96] & 0xFF) + var85;
                if (var97 < 0) {
                    var97 = 0;
                }
                if (var97 > 128) {
                    var97 = 128;
                }
                this.field3740[var96] = (byte) var97;
            }
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field3484 = var3.method1082(-97);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class202 var100 = var19[var99];
            if (var100.field3474 != null) {
                var100.field3480 = var3.method1082(-59);
            }
            if (var100.field3472 != null) {
                var100.field3486 = var3.method1082(-46);
            }
            if (var100.field3484 > 0) {
                var100.field3469 = var3.method1082(-55);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field3487 = var3.method1082(-66);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class202 var103 = var19[var102];
            if (var103.field3487 > 0) {
                var103.field3478 = var3.method1082(-67);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class202 var105 = var19[var104];
            if (var105.field3478 > 0) {
                var105.field3477 = var3.method1082(-30);
            }
        }
    }
}
