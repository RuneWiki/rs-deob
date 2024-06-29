import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class635 extends class28 {

    @OriginalMember(owner = "client!hfa", name = "q", descriptor = "[B")
    public byte[] field8658;

    @OriginalMember(owner = "client!hfa", name = "v", descriptor = "[S")
    public short[] field8663;

    @OriginalMember(owner = "client!hfa", name = "o", descriptor = "[B")
    public byte[] field8656;

    @OriginalMember(owner = "client!hfa", name = "s", descriptor = "[B")
    public byte[] field8660;

    @OriginalMember(owner = "client!hfa", name = "x", descriptor = "[I")
    private int[] field8665;

    @OriginalMember(owner = "client!hfa", name = "u", descriptor = "[Lvj;")
    public class227[] field8662;

    @OriginalMember(owner = "client!hfa", name = "t", descriptor = "[Lmda;")
    public class53[] field8661;

    @OriginalMember(owner = "client!hfa", name = "r", descriptor = "I")
    public int field8659;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "[I")
    public static int[] field8651 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
    public static int field8652 = -1;

    @OriginalMember(owner = "client!hfa", name = "l", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!hfa", name = "m", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!hfa", name = "n", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!hfa", name = "p", descriptor = "I")
    public static int field8657;

    @OriginalMember(owner = "client!hfa", name = "w", descriptor = "I")
    public static int field8664;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "([BLiu;B[I)Z", line = 3)
    public final boolean method3461(byte[] arg0, class501 arg1, byte arg2, int[] arg3) {
        field8653++;
        boolean var5 = true;
        int var6 = 0;
        class53 var7 = null;
        if (arg2 != -2) {
            return false;
        }
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field8665[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method2824(var9 >> 2, arg2 - 85, arg3);
                        } else {
                            var7 = arg1.method2823(var9 >> 2, arg2 - 82, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field8661[var8] = var7;
                        this.field8665[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IZ)V", line = 58)
    public static final void method3462(int arg0, boolean arg1) {
        field8664++;
        if (!arg1) {
            return;
        }
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        class353.field5149 = arg0;
        class104.field1269 = new class117[class127.field1625[class353.field5149] + 1];
        class645.field9135 = 0;
        class314.field4520 = 0;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method3463(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class9 var5 = (class9) class638.field8704.method374((byte) 112); var5 != null; var5 = (class9) class638.field8704.method372(-20740)) {
            class333.method2131(arg4, 25, arg2, arg0, arg1, var5);
        }
        field8654++;
        if (arg3 != 31777) {
            method3463(-2, -109, -19, -13, 100);
        }
        for (class9 var6 = (class9) class612.field8352.method374((byte) 70); var6 != null; var6 = (class9) class612.field8352.method372(arg3 ^ 0xFFFFD2DD)) {
            byte var11 = 1;
            class334 var12 = var6.field84.method242(5832);
            if (var6.field84.field456) {
                var11 = 0;
            } else if (var6.field84.field454 == var12.field4880 || var6.field84.field454 == var12.field4915 || var6.field84.field454 == var12.field4914 || var6.field84.field454 == var12.field4888) {
                var11 = 2;
            } else if (var6.field84.field454 == var12.field4920 || var6.field84.field454 == var12.field4871 || var6.field84.field454 == var12.field4875 || var6.field84.field454 == var12.field4912) {
                var11 = 3;
            }
            if (var6.field78 != var11) {
                int var13 = class118.method723(120, var6.field84);
                class195 var14 = var6.field84.field9594;
                if (var14.field2557 != null) {
                    var14 = var14.method1242(class327.field4771, (byte) -32);
                }
                if (var14 == null || var13 == -1) {
                    var6.field83 = -1;
                    var6.field101 = false;
                } else if (var6.field83 != var13 || var14.field2545 != var6.field101) {
                    if (var6.field106 != null) {
                        class285.field3866.method3203(var6.field106);
                        var6.field106 = null;
                    }
                    var6.field101 = var14.field2545;
                    var6.field88 = null;
                    var6.field83 = var13;
                    var6.field93 = null;
                }
                var6.field78 = var11;
            }
            var6.field89 = var6.field84.field3929;
            var6.field100 = var6.field84.field3929 + (var6.field84.method241(arg3 ^ 0xFFFFE74C) << 8);
            var6.field102 = var6.field84.field3917;
            var6.field94 = var6.field84.field3917 + (var6.field84.method241(-25747) << 8);
            class333.method2131(arg4, arg3 ^ 0x7C10, arg2, arg0, arg1, var6);
        }
        for (class9 var7 = (class9) class288.field3881.method2499(arg3 - 31846); var7 != null; var7 = (class9) class288.field3881.method2503(0)) {
            byte var8 = 1;
            class334 var9 = var7.field74.method242(5832);
            if (var7.field74.field456) {
                var8 = 0;
            } else if (var7.field74.field454 == var9.field4880 || var7.field74.field454 == var9.field4915 || var7.field74.field454 == var9.field4914 || var7.field74.field454 == var9.field4888) {
                var8 = 2;
            } else if (var7.field74.field454 == var9.field4920 || var7.field74.field454 == var9.field4871 || var7.field74.field454 == var9.field4875 || var7.field74.field454 == var9.field4912) {
                var8 = 3;
            }
            if (var7.field78 != var8) {
                int var10 = class238.method1481(var7.field74, arg3 ^ 0x7C2E);
                if (var7.field83 != var10 || var7.field101 != var7.field74.field7192) {
                    if (var7.field106 != null) {
                        class285.field3866.method3203(var7.field106);
                        var7.field106 = null;
                    }
                    var7.field101 = var7.field74.field7192;
                    var7.field93 = null;
                    var7.field88 = null;
                    var7.field83 = var10;
                }
                var7.field78 = var8;
            }
            var7.field89 = var7.field74.field3929;
            var7.field100 = var7.field74.field3929 + (var7.field74.method241(-25747) << 8);
            var7.field102 = var7.field74.field3917;
            var7.field94 = var7.field74.field3917 + (var7.field74.method241(arg3 - 57524) << 8);
            class333.method2131(arg4, 97, arg2, arg0, arg1, var7);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)I", line = 219)
    public static final int method3464(int arg0) {
        if (arg0 != -15195) {
            field8652 = -104;
        }
        field8655++;
        return 46;
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(B)V", line = 236)
    public static void method3465(byte arg0) {
        field8651 = null;
        if (arg0 != -122) {
            field8652 = 68;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "(I)V", line = 254)
    public final void method3466(int arg0) {
        field8657++;
        if (arg0 >= 47) {
            this.field8665 = null;
        }
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V", line = 271)
    public class635() {
    }

    @OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "([B)V", line = 273)
    public class635(byte[] arg0) {
        this.field8658 = new byte[128];
        this.field8663 = new short[128];
        this.field8656 = new byte[128];
        this.field8660 = new byte[128];
        this.field8665 = new int[128];
        this.field8662 = new class227[128];
        this.field8661 = new class53[128];
        class138 var2 = new class138(arg0);
        int var3;
        for (var3 = 0; var2.field1712[var2.field1745 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method950(false);
        }
        var3++;
        var2.field1745++;
        int var6 = var2.field1745;
        var2.field1745 += var3;
        int var7;
        for (var7 = 0; var2.field1712[var2.field1745 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method950(false);
        }
        var7++;
        var2.field1745++;
        int var10 = var2.field1745;
        var2.field1745 += var7;
        int var11;
        for (var11 = 0; var2.field1712[var2.field1745 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method950(false);
        }
        var2.field1745++;
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
                int var105 = var2.method957((byte) -62);
                if (var105 == 0) {
                    var16 = var15++;
                } else {
                    if (var105 <= var16) {
                        var105--;
                    }
                    var16 = var105;
                }
                var14[var17] = (byte) var16;
            }
        }
        class227[] var18 = new class227[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class227 var102 = var18[var19] = new class227();
            int var103 = var2.method957((byte) -83);
            if (var103 > 0) {
                var102.field2967 = new byte[var103 * 2];
            }
            int var104 = var2.method957((byte) -72);
            if (var104 > 0) {
                var102.field2974 = new byte[var104 * 2 + 2];
                var102.field2974[1] = 64;
            }
        }
        int var20 = var2.method957((byte) -68);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method957((byte) -74);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field1712[var2.field1745 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method950(false);
        }
        var2.field1745++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method957((byte) -95);
            this.field8663[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method957((byte) -119);
            this.field8663[var30] = (short) (this.field8663[var30] + (var29 << 8));
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
                var33 = var2.method900(1514965415);
            }
            this.field8663[var34] = (short) (this.field8663[var34] + class230.method1424(32768, var33 - 1 << 14));
            this.field8665[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field8665[var38] != 0) {
                if (var35 == 0) {
                    if (var36 < var4.length) {
                        var35 = var4[var36++];
                    } else {
                        var35 = -1;
                    }
                    var37 = var2.field1712[var6++] - 1;
                }
                this.field8660[var38] = (byte) var37;
                var35--;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field8665[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field1712[var10++] + 16 << 2;
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                }
                var40--;
                this.field8658[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class227 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field8665[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 < var12.length) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field8662[var46] = var45;
                var44--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length > var47) {
                    var48 = var25[var47++];
                } else {
                    var48 = -1;
                }
                if (this.field8665[var50] > 0) {
                    var49 = var2.method957((byte) -87) + 1;
                }
            }
            var48--;
            this.field8656[var50] = (byte) var49;
        }
        this.field8659 = var2.method957((byte) -71) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class227 var99 = var18[var51];
            if (var99.field2967 != null) {
                for (int var100 = 1; var100 < var99.field2967.length; var100 += 2) {
                    var99.field2967[var100] = var2.method950(false);
                }
            }
            if (var99.field2974 != null) {
                for (int var101 = 3; var101 < (var99.field2974.length - 2); var101 += 2) {
                    var99.field2974[var101] = var2.method950(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method950(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method950(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class227 var96 = var18[var54];
            if (var96.field2974 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field2974.length; var98 += 2) {
                    var97 = var2.method957((byte) -76) + var97 + 1;
                    var96.field2974[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class227 var93 = var18[var55];
            if (var93.field2967 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field2967.length; var95 += 2) {
                    var94 += var2.method957((byte) -69) + 1;
                    var93.field2967[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method957((byte) -123);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method957((byte) -126) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field8656[var60] = (byte) (this.field8656[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class92.method514(var64 - var58, (byte) 102, var66);
                    this.field8656[var67] = (byte) (this.field8656[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field8656[var63] = (byte) (this.field8656[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method957((byte) -111);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method957((byte) -75) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field8658[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field8658[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class92.method514(var78 - var71, (byte) 102, var80);
                    int var83 = (this.field8658[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field8658[var81] = (byte) var83;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field8658[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field8658[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field2964 = var2.method957((byte) -101);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class227 var92 = var18[var86];
            if (var92.field2967 != null) {
                var92.field2960 = var2.method957((byte) -105);
            }
            if (var92.field2974 != null) {
                var92.field2971 = var2.method957((byte) -111);
            }
            if (var92.field2964 > 0) {
                var92.field2968 = var2.method957((byte) -104);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field2962 = var2.method957((byte) -115);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class227 var91 = var18[var88];
            if (var91.field2962 > 0) {
                var91.field2975 = var2.method957((byte) -114);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class227 var90 = var18[var89];
            if (var90.field2975 > 0) {
                var90.field2956 = var2.method957((byte) -111);
            }
        }
    }
}
