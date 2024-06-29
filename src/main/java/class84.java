import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class84 extends class213 {

    @OriginalMember(owner = "client!id", name = "y", descriptor = "[I")
    private int[] field1676;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "[B")
    public byte[] field1678;

    @OriginalMember(owner = "client!id", name = "H", descriptor = "[Lfi;")
    public class60[] field1685;

    @OriginalMember(owner = "client!id", name = "G", descriptor = "[Loa;")
    public class140[] field1684;

    @OriginalMember(owner = "client!id", name = "J", descriptor = "[B")
    public byte[] field1687;

    @OriginalMember(owner = "client!id", name = "F", descriptor = "[S")
    public short[] field1683;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "[B")
    public byte[] field1686;

    @OriginalMember(owner = "client!id", name = "D", descriptor = "I")
    public int field1681;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field1670 = 0;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "Lob;")
    private static class141 field1671 = class175.method1195(40, "Loading title screen )2 ");

    @OriginalMember(owner = "client!id", name = "u", descriptor = "Lob;")
    public static class141 field1672 = class175.method1195(40, "Lade)3)3)3");

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Lob;")
    public static class141 field1668 = field1671;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "[I")
    public static int[] field1677 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Z")
    public static boolean field1667 = false;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "Lob;")
    private static class141 field1673 = class175.method1195(40, "Account locked as we suspect it has been stolen)3");

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lob;")
    public static class141 field1669 = class175.method1195(40, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!id", name = "B", descriptor = "Lob;")
    private static class141 field1679 = class175.method1195(40, "Invalid loginserver requested)3");

    @OriginalMember(owner = "client!id", name = "E", descriptor = "Lob;")
    public static class141 field1682 = field1673;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "Lob;")
    public static class141 field1675 = field1679;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1666;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field1674;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "(I)V")
    public final void method575(int arg0) {
        if (arg0 != 11071) {
            this.field1678 = null;
        }
        this.field1676 = null;
        field1680++;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V")
    public static void method576(byte arg0) {
        field1677 = null;
        field1682 = null;
        if (arg0 > -47) {
            field1668 = null;
        }
        field1675 = null;
        field1671 = null;
        field1668 = null;
        field1669 = null;
        field1679 = null;
        field1673 = null;
        field1672 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BILoe;[I)Z")
    public final boolean method577(byte[] arg0, int arg1, class144 arg2, int[] arg3) {
        field1666++;
        boolean var5 = true;
        int var6 = 0;
        class140 var7 = null;
        int var8 = 0;
        int var9 = 66 % ((15 - arg1) / 39);
        while (var8 < 128) {
            if (arg0 == null || arg0[var8] != 0) {
                int var10 = this.field1676[var8];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var7 = arg2.method953(arg3, (byte) -105, var10 >> 2);
                        } else {
                            var7 = arg2.method950(arg3, (byte) -73, var10 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1684[var8] = var7;
                        this.field1676[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Log;IILt;)V")
    public static final void method578(class146 arg0, int arg1, int arg2, class189 arg3) {
        class218 var4 = new class218();
        field1674++;
        var4.field4133 = arg0.method991(255);
        var4.field4142 = arg0.method979(arg2 + 1029103610);
        var4.field4131 = new int[var4.field4133];
        if (arg2 != 6358) {
            method576((byte) 82);
        }
        var4.field4141 = new int[var4.field4133];
        var4.field4140 = new int[var4.field4133];
        var4.field4134 = new byte[var4.field4133][][];
        var4.field4137 = new class55[var4.field4133];
        var4.field4144 = new class55[var4.field4133];
        for (int var5 = 0; var5 < var4.field4133; var5++) {
            try {
                int var6 = arg0.method991(255);
                if (var6 == 0 || var6 == 1 || var6 == 2) {
                    String var17 = new String(arg0.method1013(-19405).method909(-35));
                    String var18 = new String(arg0.method1013(arg2 - 25763).method909(-35));
                    int var19 = 0;
                    if (var6 == 1) {
                        var19 = arg0.method979(1029109968);
                    }
                    var4.field4140[var5] = var6;
                    var4.field4131[var5] = var19;
                    var4.field4137[var5] = arg3.method1260(var18, class32.method234(var17, class157.method1091(arg2, 6358)), false);
                } else if (var6 == 3 || var6 == 4) {
                    String var7 = new String(arg0.method1013(arg2 - 25763).method909(arg2 - 6393));
                    String var8 = new String(arg0.method1013(-19405).method909(-35));
                    int var9 = arg0.method991(arg2 ^ 0x1829);
                    String[] var10 = new String[var9];
                    for (int var11 = 0; var11 < var9; var11++) {
                        var10[var11] = new String(arg0.method1013(-19405).method909(arg2 - 6393));
                    }
                    byte[][] var12 = new byte[var9][];
                    if (var6 == 3) {
                        for (int var13 = 0; var13 < var9; var13++) {
                            int var14 = arg0.method979(1029109968);
                            var12[var13] = new byte[var14];
                            arg0.method1001(var14, 0, 106, var12[var13]);
                        }
                    }
                    Class[] var15 = new Class[var9];
                    var4.field4140[var5] = var6;
                    for (int var16 = 0; var16 < var9; var16++) {
                        var15[var16] = class32.method234(var10[var16], 0);
                    }
                    var4.field4144[var5] = arg3.method1257((byte) -117, var8, class32.method234(var7, 0), var15);
                    var4.field4134[var5] = var12;
                }
            } catch (ClassNotFoundException var20) {
                var4.field4141[var5] = -1;
            } catch (SecurityException var21) {
                var4.field4141[var5] = -2;
            } catch (NullPointerException var22) {
                var4.field4141[var5] = -3;
            } catch (Exception var23) {
                var4.field4141[var5] = -4;
            } catch (Throwable var24) {
                var4.field4141[var5] = -5;
            }
        }
        class49.field916.method1098(0, var4);
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class84() {
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "([B)V")
    public class84(byte[] arg0) {
        this.field1676 = new int[128];
        this.field1678 = new byte[128];
        this.field1685 = new class60[128];
        this.field1684 = new class140[128];
        int var2 = 0;
        this.field1687 = new byte[128];
        this.field1683 = new short[128];
        this.field1686 = new byte[128];
        class146 var3 = new class146(arg0);
        while (var3.field2859[var3.field2865 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1000(1064893128);
        }
        var3.field2865++;
        int var6 = 0;
        var2++;
        int var7 = var3.field2865;
        var3.field2865 += var2;
        while (var3.field2859[var3.field2865 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1000(1064893128);
        }
        var6++;
        var3.field2865++;
        int var10 = var3.field2865;
        var3.field2865 += var6;
        int var11;
        for (var11 = 0; var3.field2859[var3.field2865 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1000(1064893128);
        }
        var11++;
        var3.field2865++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method991(255);
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
        class60[] var18 = new class60[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class60 var102 = var18[var19] = new class60();
            int var103 = var3.method991(255);
            if (var103 > 0) {
                var102.field1181 = new byte[var103 * 2];
            }
            int var104 = var3.method991(255);
            if (var104 > 0) {
                var102.field1182 = new byte[var104 * 2 + 2];
                var102.field1182[1] = 64;
            }
        }
        int var20 = var3.method991(255);
        int var21 = 0;
        byte[] var22 = var20 <= 0 ? null : new byte[var20 * 2];
        int var23 = var3.method991(255);
        while (var3.field2859[var3.field2865 + var21] != 0) {
            var21++;
        }
        byte[] var24 = new byte[var21];
        for (int var25 = 0; var25 < var21; var25++) {
            var24[var25] = var3.method1000(1064893128);
        }
        byte[] var26 = var23 <= 0 ? null : new byte[var23 * 2];
        var3.field2865++;
        var21++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method991(255);
            this.field1683[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method991(255);
            this.field1683[var30] = (short) (this.field1683[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var24.length) {
                    var31 = -1;
                } else {
                    var31 = var24[var32++];
                }
                var33 = var3.method983(false);
            }
            this.field1683[var34] = (short) (this.field1683[var34] + (class15.method94(var33 - 1, 2) << 14));
            this.field1676[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1676[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var3.field2859[var7++] - 1;
                }
                this.field1678[var38] = (byte) var37;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1676[var42] != 0) {
                if (var41 == 0) {
                    if (var39 < var8.length) {
                        var41 = var8[var39++];
                    } else {
                        var41 = -1;
                    }
                    var40 = var3.field2859[var10++] + 16 << 2;
                }
                var41--;
                this.field1687[var42] = (byte) var40;
            }
        }
        int var43 = 0;
        class60 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1676[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var45 < var12.length) {
                        var43 = var12[var45++];
                    } else {
                        var43 = -1;
                    }
                }
                this.field1685[var46] = var44;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 < var24.length) {
                    var48 = var24[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field1676[var50] > 0) {
                    var49 = var3.method991(255) + 1;
                }
            }
            this.field1686[var50] = (byte) var49;
            var48--;
        }
        this.field1681 = var3.method991(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class60 var99 = var18[var51];
            if (var99.field1181 != null) {
                for (int var100 = 1; var100 < var99.field1181.length; var100 += 2) {
                    var99.field1181[var100] = var3.method1000(1064893128);
                }
            }
            if (var99.field1182 != null) {
                for (int var101 = 3; var101 < var99.field1182.length - 2; var101 += 2) {
                    var99.field1182[var101] = var3.method1000(1064893128);
                }
            }
        }
        if (var22 != null) {
            for (int var52 = 1; var52 < var22.length; var52 += 2) {
                var22[var52] = var3.method1000(1064893128);
            }
        }
        if (var26 != null) {
            for (int var53 = 1; var53 < var26.length; var53 += 2) {
                var26[var53] = var3.method1000(1064893128);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class60 var96 = var18[var54];
            if (var96.field1182 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1182.length; var98 += 2) {
                    var97 = var3.method991(255) + var97 + 1;
                    var96.field1182[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class60 var93 = var18[var55];
            if (var93.field1181 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1181.length; var95 += 2) {
                    var94 = var3.method991(255) + var94 + 1;
                    var93.field1181[var95] = (byte) var94;
                }
            }
        }
        if (var22 != null) {
            int var56 = var3.method991(255);
            var22[0] = (byte) var56;
            for (int var57 = 2; var57 < var22.length; var57 += 2) {
                var56 = var56 + var3.method991(255) + 1;
                var22[var57] = (byte) var56;
            }
            byte var58 = var22[0];
            byte var59 = var22[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1686[var60] = (byte) (this.field1686[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var22.length) {
                byte var64 = var22[var61 + 1];
                byte var65 = var22[var61];
                int var66 = (var65 - var58) / 2 + (var65 - var58) * var59;
                for (int var67 = var58; var67 < var65; var67++) {
                    int var68 = class93.method637(var65 - var58, -30453, var66);
                    var66 += var64 - var59;
                    this.field1686[var67] = (byte) (this.field1686[var67] * var68 + 32 >> 6);
                }
                var61 += 2;
                var58 = var65;
                var59 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1686[var63] = (byte) (this.field1686[var63] * var59 + 32 >> 6);
            }
        }
        if (var26 != null) {
            int var69 = var3.method991(255);
            var26[0] = (byte) var69;
            for (int var70 = 2; var70 < var26.length; var70 += 2) {
                var69 += var3.method991(255) + 1;
                var26[var70] = (byte) var69;
            }
            byte var71 = var26[0];
            int var72 = var26[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1687[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1687[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var26.length; var74 += 2) {
                int var78 = var26[var74 + 1] << 1;
                byte var79 = var26[var74];
                int var80 = (var79 - var71) / 2 + (var79 - var71) * var72;
                for (int var81 = var71; var81 < var79; var81++) {
                    int var82 = class93.method637(var79 - var71, -30453, var80);
                    int var83 = (this.field1687[var81] & 0xFF) + var82;
                    var80 += var78 - var72;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1687[var81] = (byte) var83;
                }
                var72 = var78;
                var71 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1687[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1687[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1160 = var3.method991(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class60 var92 = var18[var86];
            if (var92.field1181 != null) {
                var92.field1183 = var3.method991(255);
            }
            if (var92.field1182 != null) {
                var92.field1162 = var3.method991(255);
            }
            if (var92.field1160 > 0) {
                var92.field1165 = var3.method991(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1172 = var3.method991(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class60 var91 = var18[var88];
            if (var91.field1172 > 0) {
                var91.field1167 = var3.method991(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class60 var90 = var18[var89];
            if (var90.field1167 > 0) {
                var90.field1168 = var3.method991(255);
            }
        }
    }
}
