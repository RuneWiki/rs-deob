import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class42 extends class116 {

    @OriginalMember(owner = "client!ff", name = "E", descriptor = "[S")
    public short[] field1078;

    @OriginalMember(owner = "client!ff", name = "z", descriptor = "[I")
    private int[] field1073;

    @OriginalMember(owner = "client!ff", name = "C", descriptor = "[Lp;")
    public class104[] field1076;

    @OriginalMember(owner = "client!ff", name = "I", descriptor = "[B")
    public byte[] field1082;

    @OriginalMember(owner = "client!ff", name = "t", descriptor = "[B")
    public byte[] field1067;

    @OriginalMember(owner = "client!ff", name = "u", descriptor = "[B")
    public byte[] field1068;

    @OriginalMember(owner = "client!ff", name = "H", descriptor = "[Ltf;")
    public class138[] field1081;

    @OriginalMember(owner = "client!ff", name = "G", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!ff", name = "v", descriptor = "I")
    public static volatile int field1069 = 0;

    @OriginalMember(owner = "client!ff", name = "F", descriptor = "I")
    public static int field1079 = 0;

    @OriginalMember(owner = "client!ff", name = "A", descriptor = "Lic;")
    public static class59 field1074 = class59.method433(0, "jolt");

    @OriginalMember(owner = "client!ff", name = "w", descriptor = "Lic;")
    public static class59 field1070 = class59.method433(0, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!ff", name = "y", descriptor = "Lic;")
    public static class59 field1072 = class59.method433(0, "null");

    @OriginalMember(owner = "client!ff", name = "B", descriptor = "Llf;")
    public static class82 field1075 = new class82(50);

    @OriginalMember(owner = "client!ff", name = "N", descriptor = "Lic;")
    public static class59 field1087 = class59.method433(0, "(U1");

    @OriginalMember(owner = "client!ff", name = "O", descriptor = "[Z")
    public static boolean[] field1088 = new boolean[8];

    @OriginalMember(owner = "client!ff", name = "Q", descriptor = "I")
    public static int field1089 = 0;

    @OriginalMember(owner = "client!ff", name = "s", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!ff", name = "x", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ff", name = "J", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!ff", name = "K", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!ff", name = "L", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!ff", name = "M", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ldd;B)V")
    public static final void method316(class26 arg0, byte arg1) {
        if (arg1 != 105) {
            field1075 = null;
        }
        class32.field854 = arg0;
        field1086++;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)V")
    public final void method317(boolean arg0) {
        if (arg0) {
            field1069 = -33;
        }
        field1083++;
        this.field1073 = null;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IZIIII)Lt;")
    public static final class132 method318(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field1085++;
        long var6 = (long) arg5 + ((long) arg3 << 38) + ((long) arg0 << 40) + ((long) arg4 << 16);
        if (!arg1) {
            class132 var8 = (class132) class51.field1277.method675(var6, 26431);
            if (var8 != null) {
                return var8;
            }
        }
        class79 var9 = class7.method39(30996, arg5);
        if (arg4 > 1 && var9.field1962 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field1953[var11] <= arg4 && var9.field1953[var11] != 0) {
                    var10 = var9.field1962[var11];
                }
            }
            if (var10 != -1) {
                var9 = class7.method39(30996, var10);
            }
        }
        class92 var12 = var9.method647(1, arg2);
        if (var12 == null) {
            return null;
        }
        class132 var13 = null;
        if (var9.field1934 != -1) {
            var13 = method318(0, true, arg2, 1, 10, var9.field1935);
            if (var13 == null) {
                return null;
            }
        }
        int var14 = class129.field2911;
        int var15 = class129.field2908;
        int[] var16 = class129.field2906;
        int[] var17 = new int[4];
        class129.method990(var17);
        class132 var18 = new class132(36, 32);
        class129.method979(var18.field2953, 36, 32);
        class129.method982();
        class11.method59();
        class11.method62(16, 16);
        class11.field231 = false;
        int var19 = var9.field1920;
        if (arg1) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg3 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class11.field249[var9.field1927] * var19 >> 16;
        int var21 = class11.field244[var9.field1927] * var19 >> 16;
        var12.method756();
        var12.method766(0, var9.field1971, var9.field1972, var9.field1927, var9.field1959, var12.field1775 / 2 + var21 + var9.field1958, var20 - -var9.field1958);
        if (arg3 >= 1) {
            var18.method1025(1);
        }
        if (arg3 >= 2) {
            var18.method1025(16777215);
        }
        if (arg0 != 0) {
            var18.method1007(arg0);
        }
        class129.method979(var18.field2953, 36, 32);
        if (var9.field1934 != -1) {
            var13.method1023(0, 0);
        }
        if (!arg1 && (var9.field1951 == 1 || arg4 != 1) && arg4 != -1) {
            class154.field3329.method1134(class49.method376(arg4, -1354307609), 0, 9, 16776960, 1);
        }
        if (!arg1) {
            class51.field1277.method672(-30464, var18, var6);
        }
        class129.method979(var16, var14, var15);
        class129.method989(var17);
        class11.method59();
        class11.field231 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Ldd;I)V")
    public static final void method319(class26 arg0, int arg1) {
        field1071++;
        int var2 = -72 % ((arg1 - 72) / 36);
        class32.field869 = arg0;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZLwf;)V")
    public static final void method320(boolean arg0, class159 arg1) {
        if (class89.field2259 == arg1.field3666) {
            class25.field628[arg1.field3635] = true;
        }
        field1066++;
        if (arg0) {
            method316(null, (byte) 59);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([B[IZLed;)Z")
    public final boolean method321(byte[] arg0, int[] arg1, boolean arg2, class33 arg3) {
        field1084++;
        boolean var5 = arg2;
        int var6 = 0;
        class104 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field1073[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg3.method261(arg1, var9 >> 2, 0);
                        } else {
                            var7 = arg3.method258(arg1, var9 >> 2, 256);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field1076[var8] = var7;
                        this.field1073[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "()V")
    public class42() {
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)V")
    public static void method322(byte arg0) {
        field1087 = null;
        field1075 = null;
        int var1 = 48 % ((arg0 + 54) / 63);
        field1070 = null;
        field1074 = null;
        field1072 = null;
        field1088 = null;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "([B)V")
    public class42(byte[] arg0) {
        this.field1078 = new short[128];
        this.field1073 = new int[128];
        this.field1076 = new class104[128];
        this.field1082 = new byte[128];
        this.field1067 = new byte[128];
        this.field1068 = new byte[128];
        this.field1081 = new class138[128];
        int var2 = 0;
        class157 var3 = new class157(arg0);
        while (var3.field3473[var3.field3457 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1169((byte) 102);
        }
        var2++;
        var3.field3457++;
        int var6 = 0;
        int var7 = var3.field3457;
        var3.field3457 += var2;
        while (var3.field3473[var3.field3457 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1169((byte) -48);
        }
        var3.field3457++;
        var6++;
        int var10 = 0;
        int var11 = var3.field3457;
        var3.field3457 += var6;
        while (var3.field3473[var3.field3457 + var10] != 0) {
            var10++;
        }
        byte[] var12 = new byte[var10];
        for (int var13 = 0; var13 < var10; var13++) {
            var12[var13] = var3.method1169((byte) -80);
        }
        var10++;
        byte[] var14 = new byte[var10];
        var3.field3457++;
        int var15;
        if (var10 <= 1) {
            var15 = var10;
        } else {
            var15 = 2;
            var14[1] = 1;
            int var16 = 1;
            for (int var17 = 2; var17 < var10; var17++) {
                int var105 = var3.method1194(false);
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
        class138[] var18 = new class138[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class138 var102 = var18[var19] = new class138();
            int var103 = var3.method1194(false);
            if (var103 > 0) {
                var102.field3074 = new byte[var103 * 2];
            }
            int var104 = var3.method1194(false);
            if (var104 > 0) {
                var102.field3089 = new byte[var104 * 2 + 2];
                var102.field3089[1] = 64;
            }
        }
        int var20 = var3.method1194(false);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method1194(false);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var3.field3473[var3.field3457 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var3.method1169((byte) -80);
        }
        var3.field3457++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1194(false);
            this.field1078[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1194(false);
            this.field1078[var30] = (short) (this.field1078[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var32) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var3.method1179(-35);
            }
            var31--;
            this.field1078[var34] = (short) (this.field1078[var34] + class24.method156(32768, var33 - 1 << 14));
            this.field1073[var34] = var33;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field1073[var38] != 0) {
                if (var36 == 0) {
                    var35 = var3.field3473[var7++] - 1;
                    if (var37 < var4.length) {
                        var36 = var4[var37++];
                    } else {
                        var36 = -1;
                    }
                }
                this.field1068[var38] = (byte) var35;
                var36--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field1073[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var3.field3473[var11++] + 16 << 2;
                }
                this.field1082[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        class138 var44 = null;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field1073[var46] != 0) {
                if (var43 == 0) {
                    var44 = var18[var14[var45]];
                    if (var12.length <= var45) {
                        var43 = -1;
                    } else {
                        var43 = var12[var45++];
                    }
                }
                var43--;
                this.field1081[var46] = var44;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var47 == 0) {
                if (var25.length > var48) {
                    var47 = var25[var48++];
                } else {
                    var47 = -1;
                }
                if (this.field1073[var50] > 0) {
                    var49 = var3.method1194(false) + 1;
                }
            }
            this.field1067[var50] = (byte) var49;
            var47--;
        }
        this.field1080 = var3.method1194(false) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class138 var99 = var18[var51];
            if (var99.field3074 != null) {
                for (int var100 = 1; var100 < var99.field3074.length; var100 += 2) {
                    var99.field3074[var100] = var3.method1169((byte) 90);
                }
            }
            if (var99.field3089 != null) {
                for (int var101 = 3; var101 < var99.field3089.length - 2; var101 += 2) {
                    var99.field3089[var101] = var3.method1169((byte) -35);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1169((byte) -79);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1169((byte) -123);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class138 var96 = var18[var54];
            if (var96.field3089 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field3089.length; var98 += 2) {
                    var97 = var3.method1194(false) + var97 + 1;
                    var96.field3089[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class138 var93 = var18[var55];
            if (var93.field3074 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field3074.length; var95 += 2) {
                    var94 = var94 + var3.method1194(false) + 1;
                    var93.field3074[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1194(false);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var3.method1194(false) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[1];
            byte var59 = var21[0];
            for (int var60 = 0; var60 < var59; var60++) {
                this.field1067[var60] = (byte) (this.field1067[var60] * var58 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                int var65 = (var64 - var59) * var58 + (var64 - var59) / 2;
                byte var66 = var21[var61 + 1];
                var61 += 2;
                for (int var67 = var59; var67 < var64; var67++) {
                    int var68 = class70.method552(true, var65, var64 - var59);
                    this.field1067[var67] = (byte) (this.field1067[var67] * var68 + 32 >> 6);
                    var65 += var66 - var58;
                }
                var58 = var66;
                var59 = var64;
            }
            for (int var62 = var59; var62 < 128; var62++) {
                this.field1067[var62] = (byte) (this.field1067[var62] * var58 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var3.method1194(false);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var3.method1194(false) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field1082[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field1082[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                var74 += 2;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class70.method552(true, var80, var78 - var71);
                    int var83 = (this.field1082[var81] & 0xFF) + var82;
                    var80 += var79 - var72;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field1082[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field1082[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field1082[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field3073 = var3.method1194(false);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class138 var92 = var18[var86];
            if (var92.field3074 != null) {
                var92.field3088 = var3.method1194(false);
            }
            if (var92.field3089 != null) {
                var92.field3087 = var3.method1194(false);
            }
            if (var92.field3073 > 0) {
                var92.field3082 = var3.method1194(false);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field3075 = var3.method1194(false);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class138 var91 = var18[var88];
            if (var91.field3075 > 0) {
                var91.field3079 = var3.method1194(false);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class138 var90 = var18[var89];
            if (var90.field3079 > 0) {
                var90.field3085 = var3.method1194(false);
            }
        }
        if (class107.field2598) {
        }
    }
}
