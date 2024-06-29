import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class201 extends class242 {

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "[S")
    public short[] field3516;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "[B")
    public byte[] field3522;

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "[Ltg;")
    public class316[] field3525;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "[B")
    public byte[] field3526;

    @OriginalMember(owner = "client!fh", name = "q", descriptor = "[B")
    public byte[] field3512;

    @OriginalMember(owner = "client!fh", name = "t", descriptor = "[Lhi;")
    public class295[] field3515;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "[I")
    private int[] field3518;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public int field3519;

    @OriginalMember(owner = "client!fh", name = "o", descriptor = "[Z")
    public static boolean[] field3510 = new boolean[100];

    @OriginalMember(owner = "client!fh", name = "p", descriptor = "Ljf;")
    public static class229 field3511 = class212.method1457((byte) 83, "Attaquer");

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "Lqd;")
    public static class44 field3517 = new class44();

    @OriginalMember(owner = "client!fh", name = "G", descriptor = "Ljf;")
    public static class229 field3528 = class212.method1457((byte) 122, "vert:");

    @OriginalMember(owner = "client!fh", name = "H", descriptor = "[I")
    public static int[] field3529 = new int[2048];

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "Ljf;")
    public static class229 field3524 = class212.method1457((byte) 105, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!fh", name = "F", descriptor = "Z")
    public static boolean field3527 = true;

    @OriginalMember(owner = "client!fh", name = "r", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!fh", name = "s", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 9)
    public static void method1406(int arg0) {
        field3517 = null;
        field3528 = null;
        field3524 = null;
        field3510 = null;
        if (arg0 == -1) {
            field3529 = null;
            field3511 = null;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Throwable;)V", line = 28)
    public static final void method1407(int arg0, String arg1, Throwable arg2) {
        if (arg0 != 1) {
            method1407(43, (String) null, (Throwable) null);
        }
        field3523++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class206.method1440((byte) 64, arg2);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class27.field485.field3461 == null) {
                return;
            }
            class231 var8 = class27.field485.method1382(new URL(class27.field485.field3461.getCodeBase(), "clienterror.ws?c=" + class183.field3163 + "&u=" + class328.field5556 + "&v1=" + class198.field3454 + "&v2=" + class198.field3457 + "&e=" + var7), arg0 ^ 0xFFFFFFFE);
            while (var8.field4011 == 0) {
                class235.method1675((byte) -22, 1L);
            }
            if (var8.field4011 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field4009;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIBI)V", line = 85)
    public static final void method1408(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        for (class165 var5 = (class165) class83.field1589.method2078(-127); var5 != null; var5 = (class165) class83.field1589.method2080(5)) {
            class275.method1935(var5, arg1, arg4, arg0, 0, arg2);
        }
        for (class165 var6 = (class165) class125.field2203.method2078(-104); var6 != null; var6 = (class165) class125.field2203.method2080(5)) {
            byte var7 = 1;
            if (var6.field2830.field2025 == var6.field2830.field1986) {
                var7 = 0;
            } else if (var6.field2830.field2025 == var6.field2830.field2019) {
                var7 = 2;
            }
            if (var6.field2840 != var7) {
                int var8 = class132.method915(var6.field2830, (byte) -106);
                if (var6.field2845 != var8) {
                    if (var6.field2834 != null) {
                        class104.field1816.method613(var6.field2834);
                        var6.field2834 = null;
                    }
                    var6.field2845 = var8;
                }
                var6.field2840 = var7;
            }
            var6.field2829 = var6.field2830.field1983;
            var6.field2841 = var6.field2830.field1983 + var6.field2830.method299(true) * 64;
            var6.field2824 = var6.field2830.field2028;
            var6.field2823 = var6.field2830.field2028 + (var6.field2830.method299(true) * 64);
            class275.method1935(var6, arg1, arg4, arg0, 0, arg2);
        }
        field3514++;
        int var9 = -40 % ((-arg3 - 10) / 51);
        for (class165 var10 = (class165) class115.field2069.method1884((byte) -126); var10 != null; var10 = (class165) class115.field2069.method1886(-120)) {
            byte var11 = 1;
            if (var10.field2846.field2025 == var10.field2846.field1986) {
                var11 = 0;
            } else if (var10.field2846.field2025 == var10.field2846.field2019) {
                var11 = 2;
            }
            if (var10.field2840 != var11) {
                int var12 = class331.method2258(var10.field2846, 0);
                if (var10.field2845 != var12) {
                    if (var10.field2834 != null) {
                        class104.field1816.method613(var10.field2834);
                        var10.field2834 = null;
                    }
                    var10.field2845 = var12;
                }
                var10.field2840 = var11;
            }
            var10.field2829 = var10.field2846.field1983;
            var10.field2841 = var10.field2846.field1983 + (var10.field2846.method299(true) * 64);
            var10.field2824 = var10.field2846.field2028;
            var10.field2823 = var10.field2846.field2028 + (var10.field2846.method299(true) * 64);
            class275.method1935(var10, arg1, arg4, arg0, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "(I)V", line = 193)
    public final void method1409(int arg0) {
        field3521++;
        this.field3518 = null;
        if (arg0 >= -97) {
            method1407(-110, (String) null, (Throwable) null);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([I[BLi;I)Z", line = 205)
    public final boolean method1410(int[] arg0, byte[] arg1, class217 arg2, int arg3) {
        field3513++;
        boolean var5 = true;
        int var6 = 0;
        class316 var7 = null;
        if (arg3 >= -31) {
            method1407(10, (String) null, (Throwable) null);
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field3518[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method1501(var9 >> 2, 119, arg0);
                        } else {
                            var7 = arg2.method1497(-4598, arg0, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3525[var8] = var7;
                        this.field3518[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "()V", line = 274)
    public class201() {
    }

    @OriginalMember(owner = "client!fh", name = "<init>", descriptor = "([B)V", line = 281)
    public class201(byte[] arg0) {
        this.field3516 = new short[128];
        this.field3522 = new byte[128];
        this.field3525 = new class316[128];
        this.field3526 = new byte[128];
        this.field3512 = new byte[128];
        this.field3515 = new class295[128];
        this.field3518 = new int[128];
        int var2 = 0;
        class14 var3 = new class14(arg0);
        while (var3.field174[var3.field195 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method98(true);
        }
        var3.field195++;
        int var6 = var3.field195;
        var2++;
        int var7 = 0;
        var3.field195 += var2;
        while (var3.field174[var3.field195 + var7] != 0) {
            var7++;
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var3.method98(true);
        }
        var7++;
        var3.field195++;
        int var10 = var3.field195;
        var3.field195 += var7;
        int var11;
        for (var11 = 0; var3.field174[var3.field195 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method98(true);
        }
        var11++;
        var3.field195++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            int var16 = 1;
            var15 = 2;
            var14[1] = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method93(false);
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
        }
        class295[] var19 = new class295[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class295 var21 = var19[var20] = new class295();
            int var22 = var3.method93(false);
            if (var22 > 0) {
                var21.field5052 = new byte[var22 * 2];
            }
            int var23 = var3.method93(false);
            if (var23 > 0) {
                var21.field5056 = new byte[var23 * 2 + 2];
                var21.field5056[1] = 64;
            }
        }
        int var24 = var3.method93(false);
        byte[] var25 = var24 > 0 ? new byte[var24 * 2] : null;
        int var26 = var3.method93(false);
        byte[] var27 = var26 > 0 ? new byte[var26 * 2] : null;
        int var28;
        for (var28 = 0; var3.field174[var3.field195 + var28] != 0; var28++) {
        }
        byte[] var29 = new byte[var28];
        for (int var30 = 0; var30 < var28; var30++) {
            var29[var30] = var3.method98(true);
        }
        var3.field195++;
        var28++;
        int var31 = 0;
        for (int var32 = 0; var32 < 128; var32++) {
            var31 += var3.method93(false);
            this.field3516[var32] = (short) var31;
        }
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            var33 += var3.method93(false);
            this.field3516[var34] = (short) (this.field3516[var34] + (var33 << 8));
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (var35 == 0) {
                if (var36 < var29.length) {
                    var35 = var29[var36++];
                } else {
                    var35 = -1;
                }
                var37 = var3.method141((byte) 120);
            }
            this.field3516[var38] = (short) (this.field3516[var38] + class305.method2086(32768, var37 - 1 << 14));
            this.field3518[var38] = var37;
            var35--;
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3518[var42] != 0) {
                if (var40 == 0) {
                    var41 = var3.field174[var6++] - 1;
                    if (var4.length > var39) {
                        var40 = var4[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                this.field3512[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3518[var46] != 0) {
                if (var44 == 0) {
                    var45 = var3.field174[var10++] + 16 << 2;
                    if (var8.length > var43) {
                        var44 = var8[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field3526[var46] = (byte) var45;
                var44--;
            }
        }
        class295 var47 = null;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (this.field3518[var50] != 0) {
                if (var48 == 0) {
                    var47 = var19[var14[var49]];
                    if (var49 < var12.length) {
                        var48 = var12[var49++];
                    } else {
                        var48 = -1;
                    }
                }
                this.field3515[var50] = var47;
                var48--;
            }
        }
        int var51 = 0;
        int var52 = 0;
        int var53 = 0;
        for (int var54 = 0; var54 < 128; var54++) {
            if (var51 == 0) {
                if (var29.length > var53) {
                    var51 = var29[var53++];
                } else {
                    var51 = -1;
                }
                if (this.field3518[var54] > 0) {
                    var52 = var3.method93(false) + 1;
                }
            }
            this.field3522[var54] = (byte) var52;
            var51--;
        }
        this.field3519 = var3.method93(false) + 1;
        for (int var55 = 0; var55 < var15; var55++) {
            class295 var56 = var19[var55];
            if (var56.field5052 != null) {
                for (int var57 = 1; var57 < var56.field5052.length; var57 += 2) {
                    var56.field5052[var57] = var3.method98(true);
                }
            }
            if (var56.field5056 != null) {
                for (int var58 = 3; var58 < var56.field5056.length - 2; var58 += 2) {
                    var56.field5056[var58] = var3.method98(true);
                }
            }
        }
        if (var25 != null) {
            for (int var59 = 1; var59 < var25.length; var59 += 2) {
                var25[var59] = var3.method98(true);
            }
        }
        if (var27 != null) {
            for (int var60 = 1; var60 < var27.length; var60 += 2) {
                var27[var60] = var3.method98(true);
            }
        }
        for (int var61 = 0; var61 < var15; var61++) {
            class295 var62 = var19[var61];
            if (var62.field5056 != null) {
                int var63 = 0;
                for (int var64 = 2; var64 < var62.field5056.length; var64 += 2) {
                    var63 = var3.method93(false) + var63 + 1;
                    var62.field5056[var64] = (byte) var63;
                }
            }
        }
        for (int var65 = 0; var65 < var15; var65++) {
            class295 var66 = var19[var65];
            if (var66.field5052 != null) {
                int var67 = 0;
                for (int var68 = 2; var68 < var66.field5052.length; var68 += 2) {
                    var67 = (var67 + var3.method93(false)) + 1;
                    var66.field5052[var68] = (byte) var67;
                }
            }
        }
        if (var25 != null) {
            int var69 = var3.method93(false);
            var25[0] = (byte) var69;
            for (int var70 = 2; var70 < var25.length; var70 += 2) {
                var69 = var3.method93(false) + (var69 + 1);
                var25[var70] = (byte) var69;
            }
            byte var71 = var25[0];
            byte var72 = var25[1];
            for (int var73 = 0; var73 < var71; var73++) {
                this.field3522[var73] = (byte) (this.field3522[var73] * var72 + 32 >> 6);
            }
            int var74 = 2;
            while (var25.length > var74) {
                byte var75 = var25[var74 + 1];
                byte var76 = var25[var74];
                int var77 = (var76 - var71) / 2 + (var76 - var71) * var72;
                var74 += 2;
                for (int var78 = var71; var78 < var76; var78++) {
                    int var79 = class294.method2038(var77, var76 - var71, (byte) -48);
                    this.field3522[var78] = (byte) (this.field3522[var78] * var79 + 32 >> 6);
                    var77 += var75 - var72;
                }
                var72 = var75;
                var71 = var76;
            }
            for (int var80 = var71; var80 < 128; var80++) {
                this.field3522[var80] = (byte) (this.field3522[var80] * var72 + 32 >> 6);
            }
            Object var81 = null;
        }
        if (var27 != null) {
            int var82 = var3.method93(false);
            var27[0] = (byte) var82;
            for (int var83 = 2; var83 < var27.length; var83 += 2) {
                var82 = var3.method93(false) + var82 + 1;
                var27[var83] = (byte) var82;
            }
            int var84 = var27[1] << 1;
            byte var85 = var27[0];
            for (int var86 = 0; var86 < var85; var86++) {
                int var87 = (this.field3526[var86] & 0xFF) + var84;
                if (var87 < 0) {
                    var87 = 0;
                }
                if (var87 > 128) {
                    var87 = 128;
                }
                this.field3526[var86] = (byte) var87;
            }
            int var88 = 2;
            while (var27.length > var88) {
                byte var89 = var27[var88];
                int var90 = var27[var88 + 1] << 1;
                var88 += 2;
                int var91 = (var89 - var85) / 2 + (var89 - var85) * var84;
                for (int var92 = var85; var92 < var89; var92++) {
                    int var93 = class294.method2038(var91, var89 - var85, (byte) -48);
                    var91 += var90 - var84;
                    int var94 = (this.field3526[var92] & 0xFF) + var93;
                    if (var94 < 0) {
                        var94 = 0;
                    }
                    if (var94 > 128) {
                        var94 = 128;
                    }
                    this.field3526[var92] = (byte) var94;
                }
                var85 = var89;
                var84 = var90;
            }
            for (int var95 = var85; var95 < 128; var95++) {
                int var96 = (this.field3526[var95] & 0xFF) + var84;
                if (var96 < 0) {
                    var96 = 0;
                }
                if (var96 > 128) {
                    var96 = 128;
                }
                this.field3526[var95] = (byte) var96;
            }
            Object var97 = null;
        }
        for (int var98 = 0; var98 < var15; var98++) {
            var19[var98].field5041 = var3.method93(false);
        }
        for (int var99 = 0; var99 < var15; var99++) {
            class295 var100 = var19[var99];
            if (var100.field5052 != null) {
                var100.field5055 = var3.method93(false);
            }
            if (var100.field5056 != null) {
                var100.field5051 = var3.method93(false);
            }
            if (var100.field5041 > 0) {
                var100.field5047 = var3.method93(false);
            }
        }
        for (int var101 = 0; var101 < var15; var101++) {
            var19[var101].field5050 = var3.method93(false);
        }
        for (int var102 = 0; var102 < var15; var102++) {
            class295 var103 = var19[var102];
            if (var103.field5050 > 0) {
                var103.field5054 = var3.method93(false);
            }
        }
        for (int var104 = 0; var104 < var15; var104++) {
            class295 var105 = var19[var104];
            if (var105.field5054 > 0) {
                var105.field5045 = var3.method93(false);
            }
        }
    }
}
