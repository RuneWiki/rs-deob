import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class91 extends class508 {

    @OriginalMember(owner = "client!fk", name = "y", descriptor = "[I")
    private int[] field1269;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[B")
    public byte[] field1262;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "[B")
    public byte[] field1267;

    @OriginalMember(owner = "client!fk", name = "A", descriptor = "[Lbh;")
    public class414[] field1271;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "[Leb;")
    public class59[] field1264;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "[B")
    public byte[] field1261;

    @OriginalMember(owner = "client!fk", name = "B", descriptor = "[S")
    public short[] field1272;

    @OriginalMember(owner = "client!fk", name = "x", descriptor = "I")
    public int field1268;

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!fk", name = "z", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!fk", name = "C", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lqa;")
    public static class129 field1263;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static final void method626(int arg0) {
        class159.method1066(128);
        field1266++;
        class529.method3140(2, 22050, (byte) -66, class421.field5647.field7723);
        class254.field3207 = class203.method1335(arg0, 0, class272.field3454, class172.field2221, 179);
        class254.field3207.method2951(class508.field7461, arg0 - 22050);
        class531.field7820 = class203.method1335(2048, 1, class272.field3454, class172.field2221, arg0 ^ 0x5691);
        class531.field7820.method2951(class18.field313, arg0 - 22050);
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    public static void method627(int arg0) {
        if (arg0 <= -117) {
            field1263 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(BZ)Z")
    public static final boolean method628(byte arg0, boolean arg1) {
        field1265++;
        boolean var2 = class512.field7538.method879();
        if (arg0 < 52) {
            return false;
        } else if (arg1 == var2) {
            return true;
        } else {
            if (!arg1) {
                class512.field7538.method841();
            } else if (!class512.field7538.method924()) {
                arg1 = false;
            }
            if (arg1 == var2) {
                return false;
            } else {
                class421.field5647.field7726 = arg1;
                class421.field5647.method643(true, class172.field2221);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static final void method629(boolean arg0) {
        if (arg0) {
            field1263 = null;
        }
        field1270++;
        class355.field4566 = class480.method2878(8, 2048, 4, true, 0, 35, 8, 0.4F);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lwh;[B[IB)Z")
    public final boolean method630(class415 arg0, byte[] arg1, int[] arg2, byte arg3) {
        int var5 = 98 % ((arg3 + 12) / 37);
        field1260++;
        boolean var6 = true;
        int var7 = 0;
        class59 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg1 == null || arg1[var9] != 0) {
                int var10 = this.field1269[var9];
                if (var10 != 0) {
                    if (var7 != var10) {
                        var7 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg0.method2445(arg2, (byte) -102, var10 >> 2);
                        } else {
                            var8 = arg0.method2441(arg2, var10 >> 2, 6255);
                        }
                        if (var8 == null) {
                            var6 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field1264[var9] = var8;
                        this.field1269[var9] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)V")
    public final void method631(byte arg0) {
        if (arg0 >= -6) {
            method629(false);
        }
        this.field1269 = null;
        field1273++;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "()V")
    public class91() {
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "([B)V")
    public class91(byte[] arg0) {
        this.field1269 = new int[128];
        this.field1262 = new byte[128];
        this.field1267 = new byte[128];
        this.field1271 = new class414[128];
        this.field1264 = new class59[128];
        this.field1261 = new byte[128];
        this.field1272 = new short[128];
        class88 var2 = new class88(arg0);
        int var3;
        for (var3 = 0; var2.field1223[var2.field1176 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method575(-125);
        }
        var2.field1176++;
        var3++;
        int var6 = var2.field1176;
        var2.field1176 += var3;
        int var7;
        for (var7 = 0; var2.field1223[var2.field1176 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method575(-32);
        }
        var2.field1176++;
        var7++;
        int var10 = var2.field1176;
        var2.field1176 += var7;
        int var11;
        for (var11 = 0; var2.field1223[var2.field1176 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method575(-96);
        }
        var2.field1176++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            int var16 = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method617(2);
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
        class414[] var18 = new class414[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class414 var102 = var18[var19] = new class414();
            int var103 = var2.method617(2);
            if (var103 > 0) {
                var102.field5511 = new byte[var103 * 2];
            }
            int var104 = var2.method617(2);
            if (var104 > 0) {
                var102.field5505 = new byte[var104 * 2 + 2];
                var102.field5505[1] = 64;
            }
        }
        int var20 = var2.method617(2);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method617(2);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field1223[var2.field1176 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method575(-120);
        }
        var24++;
        var2.field1176++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method617(2);
            this.field1272[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method617(2);
            this.field1272[var30] = (short) (this.field1272[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 >= var25.length) {
                    var31 = -1;
                } else {
                    var31 = var25[var32++];
                }
                var33 = var2.method592(-30);
            }
            this.field1272[var34] = (short) (this.field1272[var34] + class60.method339(32768, var33 - 1 << 14));
            this.field1269[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1269[var38] != 0) {
                if (var35 == 0) {
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                    var37 = var2.field1223[var6++] - 1;
                }
                this.field1262[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1269[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field1223[var10++] + 16 << 2;
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                this.field1267[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class414 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1269[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field1271[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 >= var25.length) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field1269[var50] > 0) {
                    var49 = var2.method617(2) + 1;
                }
            }
            var48--;
            this.field1261[var50] = (byte) var49;
        }
        this.field1268 = var2.method617(2) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class414 var99 = var18[var51];
            if (var99.field5511 != null) {
                for (int var100 = 1; var100 < var99.field5511.length; var100 += 2) {
                    var99.field5511[var100] = var2.method575(-13);
                }
            }
            if (var99.field5505 != null) {
                for (int var101 = 3; var101 < var99.field5505.length - 2; var101 += 2) {
                    var99.field5505[var101] = var2.method575(-107);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method575(-124);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method575(-63);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class414 var96 = var18[var54];
            if (var96.field5505 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5505.length; var98 += 2) {
                    var97 = var2.method617(2) + var97 + 1;
                    var96.field5505[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class414 var93 = var18[var55];
            if (var93.field5511 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5511.length; var95 += 2) {
                    var94 = var94 + var2.method617(2) + 1;
                    var93.field5511[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method617(2);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method617(2) + (var56 + 1);
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field1261[var60] = (byte) (this.field1261[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class215.method1367(var66, 0, var64 - var58);
                    this.field1261[var67] = (byte) (this.field1261[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field1261[var63] = (byte) (this.field1261[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method617(2);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method617(2) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1267[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1267[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class215.method1367(var80, 0, var78 - var71);
                    int var83 = (this.field1267[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1267[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1267[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1267[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5501 = var2.method617(2);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class414 var92 = var18[var86];
            if (var92.field5511 != null) {
                var92.field5509 = var2.method617(2);
            }
            if (var92.field5505 != null) {
                var92.field5508 = var2.method617(2);
            }
            if (var92.field5501 > 0) {
                var92.field5503 = var2.method617(2);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5512 = var2.method617(2);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class414 var91 = var18[var88];
            if (var91.field5512 > 0) {
                var91.field5506 = var2.method617(2);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class414 var90 = var18[var89];
            if (var90.field5506 > 0) {
                var90.field5504 = var2.method617(2);
            }
        }
    }
}
