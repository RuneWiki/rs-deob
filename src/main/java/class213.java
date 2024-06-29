import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class213 extends class32 {

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[B")
    public byte[] field3522;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "[B")
    public byte[] field3533;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "[I")
    private int[] field3534;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "[Lwb;")
    public class170[] field3530;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "[Lbj;")
    public class107[] field3536;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "[B")
    public byte[] field3524;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[S")
    public short[] field3529;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field3523 = 0;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Z")
    public static boolean field3520 = false;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "S")
    public static short field3527 = 32767;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "Lij;")
    public static class50 field3537 = class78.method578(121, "null");

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "Lkj;")
    public static class56 field3528 = new class56(16);

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "Lij;")
    public static class50 field3538 = class78.method578(126, "mapflag");

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Lij;")
    public static class50 field3539 = class78.method578(124, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field3540 = 2301979;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field3541 = 0;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method1415(int arg0) {
        field3539 = null;
        field3538 = null;
        if (arg0 != 32767) {
            method1416((class50) null, (class50) null, true);
        }
        field3528 = null;
        field3537 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lij;Lij;Z)V")
    public static final void method1416(class50 arg0, class50 arg1, boolean arg2) {
        class245.field4276 = arg1;
        class65.field1231 = 0;
        class245.field4275 = arg0;
        field3521++;
        class122.field2149 = false;
        if (class245.field4276.method367(class245.field4271, 1) || class245.field4275.method367(class245.field4271, 1)) {
            class178.field2970 = 0;
            class91.field1719 = 3;
            return;
        }
        if (!arg2) {
            method1418((byte) -126, (Component) null);
        }
        class178.field2970 = 1;
        class91.field1719 = -3;
        class238.field4044 = 0;
        class34.field671 = 0;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public final void method1417(byte arg0) {
        this.field3534 = null;
        field3531++;
        int var2 = 94 % ((-arg0 - 61) / 44);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method1418(byte arg0, Component arg1) {
        int var2 = 50 % ((arg0 + 4) / 49);
        field3526++;
        Method var3 = class138.field2401;
        if (var3 != null) {
            try {
                var3.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg1.addKeyListener(class89.field1696);
        arg1.addFocusListener(class89.field1696);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIII)I")
    public static final int method1419(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg0 & 0x3;
        if (arg2 >= -58) {
            return -46;
        }
        field3525++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILte;[I[B)Z")
    public final boolean method1420(int arg0, class118 arg1, int[] arg2, byte[] arg3) {
        field3535++;
        if (arg0 > -114) {
            this.field3530 = null;
        }
        int var5 = 0;
        boolean var6 = true;
        class107 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field3534[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method853(arg2, (byte) 95, var9 >> 2);
                        } else {
                            var7 = arg1.method855(var9 >> 2, arg2, 0);
                        }
                        if (var7 == null) {
                            var6 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field3536[var8] = var7;
                        this.field3534[var8] = 0;
                    }
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class213() {
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "([B)V")
    public class213(byte[] arg0) {
        this.field3522 = new byte[128];
        this.field3533 = new byte[128];
        this.field3534 = new int[128];
        this.field3530 = new class170[128];
        this.field3536 = new class107[128];
        this.field3524 = new byte[128];
        this.field3529 = new short[128];
        class217 var2 = new class217(arg0);
        int var3;
        for (var3 = 0; var2.field3633[var2.field3581 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1444((byte) -108);
        }
        var3++;
        int var6 = 0;
        var2.field3581++;
        int var7 = var2.field3581;
        var2.field3581 += var3;
        while (var2.field3633[var2.field3581 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var2.method1444((byte) -52);
        }
        var2.field3581++;
        var6++;
        int var10 = var2.field3581;
        var2.field3581 += var6;
        int var11;
        for (var11 = 0; var2.field3633[var2.field3581 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1444((byte) -78);
        }
        var11++;
        var2.field3581++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            int var16 = 1;
            var14[1] = 1;
            var15 = 2;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1487(255);
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
        class170[] var18 = new class170[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class170 var102 = var18[var19] = new class170();
            int var103 = var2.method1487(255);
            if (var103 > 0) {
                var102.field2846 = new byte[var103 * 2];
            }
            int var104 = var2.method1487(255);
            if (var104 > 0) {
                var102.field2850 = new byte[var104 * 2 + 2];
                var102.field2850[1] = 64;
            }
        }
        int var20 = var2.method1487(255);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = 0;
        int var23 = var2.method1487(255);
        byte[] var24 = var23 > 0 ? new byte[var23 * 2] : null;
        while (var2.field3633[var2.field3581 + var22] != 0) {
            var22++;
        }
        byte[] var25 = new byte[var22];
        for (int var26 = 0; var26 < var22; var26++) {
            var25[var26] = var2.method1444((byte) -32);
        }
        var2.field3581++;
        var22++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1487(255);
            this.field3529[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1487(255);
            this.field3529[var30] = (short) (this.field3529[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var25.length > var33) {
                    var31 = var25[var33++];
                } else {
                    var31 = -1;
                }
                var32 = var2.method1468((byte) -85);
            }
            var31--;
            this.field3529[var34] = (short) (this.field3529[var34] + (class51.method413(2, var32 - 1) << 14));
            this.field3534[var34] = var32;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field3534[var38] != 0) {
                if (var36 == 0) {
                    if (var35 >= var4.length) {
                        var36 = -1;
                    } else {
                        var36 = var4[var35++];
                    }
                    var37 = var2.field3633[var7++] - 1;
                }
                var36--;
                this.field3522[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field3534[var42] != 0) {
                if (var39 == 0) {
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                    var41 = var2.field3633[var10++] + 16 << 2;
                }
                this.field3533[var42] = (byte) var41;
                var39--;
            }
        }
        class170 var43 = null;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field3534[var46] != 0) {
                if (var45 == 0) {
                    var43 = var18[var14[var44]];
                    if (var44 >= var12.length) {
                        var45 = -1;
                    } else {
                        var45 = var12[var44++];
                    }
                }
                var45--;
                this.field3530[var46] = var43;
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
                if (this.field3534[var50] > 0) {
                    var49 = var2.method1487(255) + 1;
                }
            }
            this.field3524[var50] = (byte) var49;
            var47--;
        }
        this.field3532 = var2.method1487(255) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class170 var99 = var18[var51];
            if (var99.field2846 != null) {
                for (int var100 = 1; var100 < var99.field2846.length; var100 += 2) {
                    var99.field2846[var100] = var2.method1444((byte) -96);
                }
            }
            if (var99.field2850 != null) {
                for (int var101 = 3; var101 < var99.field2850.length - 2; var101 += 2) {
                    var99.field2850[var101] = var2.method1444((byte) -33);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1444((byte) -38);
            }
        }
        if (var24 != null) {
            for (int var53 = 1; var53 < var24.length; var53 += 2) {
                var24[var53] = var2.method1444((byte) -56);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class170 var96 = var18[var54];
            if (var96.field2850 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2850.length; var98 += 2) {
                    var97 = var97 + var2.method1487(255) + 1;
                    var96.field2850[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class170 var93 = var18[var55];
            if (var93.field2846 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2846.length; var95 += 2) {
                    var94 = var94 + var2.method1487(255) + 1;
                    var93.field2846[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1487(255);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1487(255) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field3524[var60] = (byte) (this.field3524[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                var61 += 2;
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class91.method706(var66, var64 - var58, -53);
                    var66 += var65 - var59;
                    this.field3524[var67] = (byte) (this.field3524[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var58 = var64;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field3524[var63] = (byte) (this.field3524[var63] * var59 + 32 >> 6);
            }
        }
        if (var24 != null) {
            int var69 = var2.method1487(255);
            var24[0] = (byte) var69;
            for (int var70 = 2; var70 < var24.length; var70 += 2) {
                var69 = var69 + var2.method1487(255) + 1;
                var24[var70] = (byte) var69;
            }
            byte var71 = var24[0];
            int var72 = var24[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field3533[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field3533[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var24.length > var74) {
                byte var78 = var24[var74];
                int var79 = (var78 - var71) / 2 + (var78 - var71) * var72;
                int var80 = var24[var74 + 1] << 1;
                var74 += 2;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class91.method706(var79, var78 - var71, -69);
                    int var83 = (this.field3533[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field3533[var81] = (byte) var83;
                    var79 += var80 - var72;
                }
                var71 = var78;
                var72 = var80;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field3533[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field3533[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2843 = var2.method1487(255);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class170 var92 = var18[var86];
            if (var92.field2846 != null) {
                var92.field2845 = var2.method1487(255);
            }
            if (var92.field2850 != null) {
                var92.field2854 = var2.method1487(255);
            }
            if (var92.field2843 > 0) {
                var92.field2839 = var2.method1487(255);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2844 = var2.method1487(255);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class170 var91 = var18[var88];
            if (var91.field2844 > 0) {
                var91.field2847 = var2.method1487(255);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class170 var90 = var18[var89];
            if (var90.field2847 > 0) {
                var90.field2837 = var2.method1487(255);
            }
        }
    }
}
