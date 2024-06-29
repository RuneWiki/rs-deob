import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class266 extends class128 {

    @OriginalMember(owner = "client!tc", name = "D", descriptor = "[Lqj;")
    public class248[] field4291;

    @OriginalMember(owner = "client!tc", name = "F", descriptor = "[B")
    public byte[] field4292;

    @OriginalMember(owner = "client!tc", name = "B", descriptor = "[B")
    public byte[] field4289;

    @OriginalMember(owner = "client!tc", name = "u", descriptor = "[I")
    private int[] field4282;

    @OriginalMember(owner = "client!tc", name = "z", descriptor = "[Lrj;")
    public class290[] field4287;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "[B")
    public byte[] field4277;

    @OriginalMember(owner = "client!tc", name = "y", descriptor = "[S")
    public short[] field4286;

    @OriginalMember(owner = "client!tc", name = "A", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "Z")
    public static boolean field4275 = false;

    @OriginalMember(owner = "client!tc", name = "v", descriptor = "I")
    public static int field4283 = 0;

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "[I")
    public static int[] field4278 = new int[500];

    @OriginalMember(owner = "client!tc", name = "C", descriptor = "[C")
    public static char[] field4290 = new char[] { '-', ' ', ' ', '_', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!tc", name = "s", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!tc", name = "x", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!tc", name = "G", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!tc", name = "w", descriptor = "Lbl;")
    public static class146 field4284;

    @OriginalMember(owner = "client!tc", name = "t", descriptor = "[Ljava/lang/String;")
    public static String[] field4281;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "(I)V")
    public final void method1788(int arg0) {
        field4276++;
        if (arg0 != 0) {
            this.method1792((byte[]) null, -25, (int[]) null, (class65) null);
        }
        this.field4282 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;JIIS)V")
    public static final void method1789(String arg0, int arg1, int arg2, String arg3, long arg4, int arg5, int arg6, short arg7) {
        field4274++;
        if (class286.field4537) {
            return;
        }
        int var9 = 69 / ((56 - arg6) / 58);
        if (class83.field1384 >= 500) {
            return;
        }
        class249.field3948[class83.field1384] = arg3;
        class269.field4343[class83.field1384] = arg0;
        class177.field2904[class83.field1384] = arg5 == -1 ? class92.field1481 : arg5;
        class192.field3103[class83.field1384] = arg7;
        class77.field1288[class83.field1384] = arg4;
        class64.field1076[class83.field1384] = arg1;
        class255.field4124[class83.field1384] = arg2;
        class83.field1384++;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static final void method1790(byte arg0) {
        field4279++;
        if (arg0 <= 25) {
            field4293 = 52;
        }
        class211.field3332.method1255(-86);
    }

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(B)V")
    public static void method1791(byte arg0) {
        field4290 = null;
        if (arg0 != 29) {
            method1790((byte) 47);
        }
        field4284 = null;
        field4278 = null;
        field4281 = null;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "([BI[ILci;)Z")
    public final boolean method1792(byte[] arg0, int arg1, int[] arg2, class65 arg3) {
        field4285++;
        boolean var5 = true;
        int var6 = 0;
        int var7 = 117 / ((arg1 - 49) / 58);
        class248 var8 = null;
        for (int var9 = 0; var9 < 128; var9++) {
            if (arg0 == null || arg0[var9] != 0) {
                int var10 = this.field4282[var9];
                if (var10 != 0) {
                    if (var6 != var10) {
                        var6 = var10--;
                        if ((var10 & 0x1) == 0) {
                            var8 = arg3.method461(false, var10 >> 2, arg2);
                        } else {
                            var8 = arg3.method460(false, arg2, var10 >> 2);
                        }
                        if (var8 == null) {
                            var5 = false;
                        }
                    }
                    if (var8 != null) {
                        this.field4291[var9] = var8;
                        this.field4282[var9] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "(B)Ljh;")
    public static final class269 method1793(byte arg0) {
        field4280++;
        if (class275.field4411 == null) {
            return null;
        }
        class269 var1 = (class269) class313.field4985.method783(true);
        if (arg0 <= 59) {
            method1789((String) null, 27, -28, (String) null, -127L, 89, 8, (short) 17);
        }
        while (var1 != null) {
            class50 var2 = class49.method346(var1.field4333, (byte) 99);
            if (var2 != null && var2.field857 && var2.method356(1223)) {
                return var1;
            }
            var1 = (class269) class313.field4985.method783(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "()V")
    public class266() {
    }

    @OriginalMember(owner = "client!tc", name = "<init>", descriptor = "([B)V")
    public class266(byte[] arg0) {
        this.field4291 = new class248[128];
        this.field4292 = new byte[128];
        this.field4289 = new byte[128];
        this.field4282 = new int[128];
        this.field4287 = new class290[128];
        this.field4277 = new byte[128];
        int var2 = 0;
        this.field4286 = new short[128];
        class162 var3 = new class162(arg0);
        while (var3.field2573[var3.field2568 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1107((byte) -123);
        }
        var3.field2568++;
        int var6 = var3.field2568;
        var2++;
        var3.field2568 += var2;
        int var7;
        for (var7 = 0; var3.field2573[var3.field2568 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method1107((byte) -87);
        }
        var3.field2568++;
        var7++;
        int var10 = var3.field2568;
        int var11 = 0;
        var3.field2568 += var7;
        while (var3.field2573[var3.field2568 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1107((byte) -106);
        }
        var11++;
        var3.field2568++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var3.method1133((byte) 53);
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
        class290[] var18 = new class290[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class290 var102 = var18[var19] = new class290();
            int var103 = var3.method1133((byte) 53);
            if (var103 > 0) {
                var102.field4653 = new byte[var103 * 2];
            }
            int var104 = var3.method1133((byte) 53);
            if (var104 > 0) {
                var102.field4658 = new byte[var104 * 2 + 2];
                var102.field4658[1] = 64;
            }
        }
        int var20 = var3.method1133((byte) 53);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var3.method1133((byte) 53);
        int var23 = 0;
        byte[] var24 = var22 > 0 ? new byte[var22 * 2] : null;
        while (var3.field2573[var3.field2568 + var23] != 0) {
            var23++;
        }
        byte[] var25 = new byte[var23];
        for (int var26 = 0; var26 < var23; var26++) {
            var25[var26] = var3.method1107((byte) -110);
        }
        var23++;
        int var27 = 0;
        var3.field2568++;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var3.method1133((byte) 53);
            this.field4286[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var3.method1133((byte) 53);
            this.field4286[var30] = (short) (this.field4286[var30] + (var29 << 8));
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
                var33 = var3.method1164(875128648);
            }
            this.field4286[var34] = (short) (this.field4286[var34] + class51.method359(32768, var33 - 1 << 14));
            this.field4282[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field4282[var38] != 0) {
                if (var37 == 0) {
                    var36 = var3.field2573[var6++] - 1;
                    if (var4.length <= var35) {
                        var37 = -1;
                    } else {
                        var37 = var4[var35++];
                    }
                }
                var37--;
                this.field4289[var38] = (byte) var36;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4282[var42] != 0) {
                if (var41 == 0) {
                    var40 = var3.field2573[var10++] + 16 << 2;
                    if (var39 < var8.length) {
                        var41 = var8[var39++];
                    } else {
                        var41 = -1;
                    }
                }
                var41--;
                this.field4277[var42] = (byte) var40;
            }
        }
        class290 var43 = null;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4282[var46] != 0) {
                if (var45 == 0) {
                    var43 = var18[var14[var44]];
                    if (var12.length > var44) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                var45--;
                this.field4287[var46] = var43;
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
                if (this.field4282[var50] > 0) {
                    var49 = var3.method1133((byte) 53) + 1;
                }
            }
            this.field4292[var50] = (byte) var49;
            var47--;
        }
        this.field4288 = var3.method1133((byte) 53) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class290 var99 = var18[var51];
            if (var99.field4653 != null) {
                for (int var100 = 1; var100 < var99.field4653.length; var100 += 2) {
                    var99.field4653[var100] = var3.method1107((byte) -84);
                }
            }
            if (var99.field4658 != null) {
                for (int var101 = 3; var101 < var99.field4658.length - 2; var101 += 2) {
                    var99.field4658[var101] = var3.method1107((byte) -107);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var3.method1107((byte) -127);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var3.method1107((byte) -85);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class290 var96 = var18[var54];
            if (var96.field4658 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field4658.length; var98 += 2) {
                    var97 -= -var3.method1133((byte) 53) - 1;
                    var96.field4658[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class290 var93 = var18[var55];
            if (var93.field4653 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field4653.length; var95 += 2) {
                    var94 += var3.method1133((byte) 53) + 1;
                    var93.field4653[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var3.method1133((byte) 53);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var3.method1133((byte) 53) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field4292[var60] = (byte) (this.field4292[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61 + 1];
                byte var65 = var21[var61];
                int var66 = (var65 - var58) / 2 + (var65 - var58) * var59;
                for (int var67 = var58; var67 < var65; var67++) {
                    int var68 = class22.method122(var66, (byte) -37, var65 - var58);
                    var66 += var64 - var59;
                    this.field4292[var67] = (byte) (this.field4292[var67] * var68 + 32 >> 6);
                }
                var59 = var64;
                var58 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field4292[var63] = (byte) (this.field4292[var63] * var59 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var3.method1133((byte) 53);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var69 + var3.method1133((byte) 53) + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field4277[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field4277[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var24.length > var74) {
                byte var78 = var24[var74];
                int var79 = var24[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                var74 += 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class22.method122(var80, (byte) -37, var78 - var71);
                    var80 += var79 - var72;
                    int var83 = (this.field4277[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field4277[var81] = (byte) var83;
                }
                var72 = var79;
                var71 = var78;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field4277[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field4277[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field4659 = var3.method1133((byte) 53);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class290 var92 = var18[var86];
            if (var92.field4653 != null) {
                var92.field4660 = var3.method1133((byte) 53);
            }
            if (var92.field4658 != null) {
                var92.field4657 = var3.method1133((byte) 53);
            }
            if (var92.field4659 > 0) {
                var92.field4651 = var3.method1133((byte) 53);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field4655 = var3.method1133((byte) 53);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class290 var91 = var18[var88];
            if (var91.field4655 > 0) {
                var91.field4656 = var3.method1133((byte) 53);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class290 var90 = var18[var89];
            if (var90.field4656 > 0) {
                var90.field4652 = var3.method1133((byte) 53);
            }
        }
    }
}
