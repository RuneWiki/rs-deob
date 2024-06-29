import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class42 extends class134 {

    @OriginalMember(owner = "client!r", name = "B", descriptor = "[B")
    public byte[] field712;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[Ljd;")
    public class90[] field710;

    @OriginalMember(owner = "client!r", name = "s", descriptor = "[B")
    public byte[] field703;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "[I")
    private int[] field706;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[Lbh;")
    public class7[] field699;

    @OriginalMember(owner = "client!r", name = "A", descriptor = "[B")
    public byte[] field711;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "[S")
    public short[] field701;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "I")
    public int field707;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "Ljava/lang/String;")
    public static String field702 = "flash2:";

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field709 = 0;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!r", name = "D", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field698;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([ILuh;[BI)Z")
    public final boolean method367(int[] arg0, class104 arg1, byte[] arg2, int arg3) {
        field704++;
        boolean var5 = true;
        int var6 = 0;
        int var7 = 24 % ((50 - arg3) / 63);
        class90 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg2 == null || arg2[var9] != 0) {
                int var10 = this.field706[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg1.method790(arg0, 98, var10 >> 2);
                        } else {
                            var8 = arg1.method789(-26815, arg0, var10 >> 2);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field710[var9] = var8;
                        this.field706[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public static void method368(int arg0) {
        if (arg0 > -74) {
            field702 = null;
        }
        field698 = null;
        field702 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILub;I)Lel;")
    public static final class213 method369(int arg0, class92 arg1, int arg2) {
        field714++;
        if (client.method1155(arg2, 9, arg1)) {
            if (arg0 < 75) {
                field713 = 51;
            }
            return class30.method252(72);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public final void method370(int arg0) {
        this.field706 = null;
        field700++;
        int var2 = -83 % ((-arg0 - 42) / 60);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IZ)V")
    public static final void method371(int arg0, boolean arg1) {
        field708++;
        byte var2 = 4;
        byte[][] var3 = class268.field4248;
        int var4 = var3.length;
        for (int var5 = arg0; var5 < var4; var5++) {
            int[] var11 = null;
            byte[] var12 = var3[var5];
            int var13 = class174.field2691[var5] >> 8;
            int var14 = class174.field2691[var5] & 0xFF;
            int var15 = var13 * 64 - class138.field2072;
            int var16 = var14 * 64 - class159.field2379;
            if (var12 != null) {
                class102.method778(-9546);
                var11 = class56.method471(class138.field2072, var12, arg1, class159.field2379, var16, var15, false, class80.field1236);
            }
            if (!arg1 && (class303.field4870 / 8) == var13 && (class279.field4424 / 8) == var14) {
                if (var11 == null) {
                    class307.field4928 = -1;
                } else {
                    class37.field637 = var11[3];
                    class297.field4793 = var11[2];
                    class37.field636 = var11[4];
                    class50.field814 = var11[1];
                    class307.field4928 = var11[0];
                }
            }
        }
        for (int var6 = 0; var6 < var4; var6++) {
            int var7 = (class174.field2691[var6] >> 8) * 64 - class138.field2072;
            int var8 = (class174.field2691[var6] & 0xFF) * 64 - class159.field2379;
            byte[] var9 = var3[var6];
            if (var9 == null && class279.field4424 < 800) {
                class102.method778(-9546);
                for (int var10 = 0; var10 < var2; var10++) {
                    class78.method616(var10, 64, true, var8, 64, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class42() {
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "([B)V")
    public class42(byte[] arg0) {
        this.field712 = new byte[128];
        this.field710 = new class90[128];
        this.field703 = new byte[128];
        this.field706 = new int[128];
        int var2 = 0;
        this.field699 = new class7[128];
        this.field711 = new byte[128];
        this.field701 = new short[128];
        class31 var3 = new class31(arg0);
        while (var3.field560[var3.field541 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method266(-129);
        }
        var2++;
        var3.field541++;
        int var6 = var3.field541;
        var3.field541 += var2;
        int var7;
        for (var7 = 0; var3.field560[var3.field541 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method266(-129);
        }
        var3.field541++;
        int var10 = var3.field541;
        var7++;
        var3.field541 += var7;
        int var11;
        for (var11 = 0; var3.field560[var3.field541 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method266(-129);
        }
        var3.field541++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method265(-127);
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
        class7[] var18 = new class7[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class7 var102 = var18[var19] = new class7();
            int var103 = var3.method265(-106);
            if (var103 > 0) {
                var102.field106 = new byte[var103 * 2];
            }
            int var104 = var3.method265(-88);
            if (var104 > 0) {
                var102.field111 = new byte[var104 * 2 + 2];
                var102.field111[1] = 64;
            }
        }
        int var20 = var3.method265(-111);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = 0;
        int var23 = var3.method265(-126);
        while (var3.field560[var3.field541 + var22] != 0) {
            var22++;
        }
        byte[] var24 = var23 <= 0 ? null : new byte[var23 * 2];
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var3.method266(-129);
        }
        var22++;
        var3.field541++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method265(-126);
            this.field701[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method265(-125);
            this.field701[var30] = (short) (this.field701[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var32 == 0) {
                if (var33 < var25.length) {
                    var32 = var25[var33++];
                } else {
                    var32 = -1;
                }
                var31 = var3.method310(122);
            }
            this.field701[var34] = (short) (this.field701[var34] + (class118.method863(2, var31 - 1) << 14));
            this.field706[var34] = var31;
            var32--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field706[var38] != 0) {
                if (var35 == 0) {
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                    var37 = var3.field560[var6++] - 1;
                }
                var35--;
                this.field703[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field706[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field560[var10++] + 16 << 2;
                    if (var8.length > var39) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field712[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class7 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field706[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                var44--;
                this.field699[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var48 < var25.length) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field706[var50] > 0) {
                    var49 = var3.method265(-115) + 1;
                }
            }
            var47--;
            this.field711[var50] = (byte) var49;
        }
        this.field707 = var3.method265(-115) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class7 var99 = var18[var51];
            if (var99.field106 != null) {
                for (int var100 = 1; var100 < var99.field106.length; var100 += 2) {
                    var99.field106[var100] = var3.method266(-129);
                }
            }
            if (var99.field111 != null) {
                for (int var101 = 3; var101 < var99.field111.length - 2; var101 += 2) {
                    var99.field111[var101] = var3.method266(-129);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method266(-129);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method266(-129);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class7 var96 = var18[var54];
            if (var96.field111 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field111.length; var98 += 2) {
                    var97 = var3.method265(-116) + var97 + 1;
                    var96.field111[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class7 var93 = var18[var55];
            if (var93.field106 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field106.length; var95 += 2) {
                    var94 = var3.method265(-100) + var94 + 1;
                    var93.field106[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method265(-113);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var3.method265(-125) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field711[var60] = (byte) (this.field711[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                int var65 = (var64 - var58) / 2 + (var64 - var58) * var59;
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class150.method1092(var64 - var58, var65, -1610637441);
                    this.field711[var67] = (byte) (this.field711[var67] * var68 + 32 >> 6);
                    var65 += var66 - var59;
                }
                var58 = var64;
                var59 = var66;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field711[var62] = (byte) (this.field711[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var24 != null) {
            int var69 = var3.method265(-104);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 += var3.method265(-112) + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field712[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field712[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var24.length) {
                byte var78 = var24[var74];
                int var79 = var24[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class150.method1092(var78 - var71, var80, -1610637441);
                    var80 += var79 - var72;
                    int var83 = (this.field712[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field712[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field712[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field712[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field110 = var3.method265(-120);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class7 var92 = var18[var86];
            if (var92.field106 != null) {
                var92.field108 = var3.method265(-104);
            }
            if (var92.field111 != null) {
                var92.field112 = var3.method265(-101);
            }
            if (var92.field110 > 0) {
                var92.field113 = var3.method265(-97);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field117 = var3.method265(-89);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class7 var91 = var18[var88];
            if (var91.field117 > 0) {
                var91.field115 = var3.method265(-122);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class7 var90 = var18[var89];
            if (var90.field115 > 0) {
                var90.field114 = var3.method265(-107);
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V")
    public static final void method372(int arg0, int arg1, int arg2) {
        field705++;
        if (arg1 != 1) {
            method372(-30, -86, 24);
        }
        class250 var3 = class263.method1768(arg2, (byte) -46);
        int var4 = var3.field4005;
        int var5 = var3.field4001;
        int var6 = var3.field4004;
        int var7 = class64.field1006[var4 - var5];
        if (arg0 < 0 || arg0 > var7) {
            arg0 = 0;
        }
        int var8 = var7 << var5;
        class179.method1270(-129, arg0 << var5 & var8 | ~var8 & class168.field2529[var6], var6);
    }
}
