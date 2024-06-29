import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class191 extends class513 {

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "[B")
    public byte[] field2780;

    @OriginalMember(owner = "client!ue", name = "k", descriptor = "[Lgh;")
    public class49[] field2766;

    @OriginalMember(owner = "client!ue", name = "t", descriptor = "[B")
    public byte[] field2775;

    @OriginalMember(owner = "client!ue", name = "p", descriptor = "[S")
    public short[] field2771;

    @OriginalMember(owner = "client!ue", name = "w", descriptor = "[I")
    private int[] field2778;

    @OriginalMember(owner = "client!ue", name = "v", descriptor = "[B")
    public byte[] field2777;

    @OriginalMember(owner = "client!ue", name = "r", descriptor = "[Laaa;")
    public class25[] field2773;

    @OriginalMember(owner = "client!ue", name = "o", descriptor = "I")
    public int field2770;

    @OriginalMember(owner = "client!ue", name = "n", descriptor = "Z")
    public static boolean field2769 = false;

    @OriginalMember(owner = "client!ue", name = "l", descriptor = "I")
    public static int field2767;

    @OriginalMember(owner = "client!ue", name = "q", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ue", name = "s", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!ue", name = "u", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ue", name = "m", descriptor = "[I")
    public static int[] field2768;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([BILkm;[I)Z", line = 3)
    public final boolean method1265(byte[] arg0, int arg1, class455 arg2, int[] arg3) {
        field2779++;
        if (arg1 != -1) {
            return false;
        }
        boolean var5 = true;
        int var6 = 0;
        class25 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field2778[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method2735((byte) -88, var9 >> 2, arg3);
                        } else {
                            var7 = arg2.method2734(var9 >> 2, arg3, 0);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field2773[var8] = var7;
                        this.field2778[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 60)
    public static void method1266(int arg0) {
        int var1 = 119 % ((arg0 + 21) / 35);
        field2768 = null;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)V", line = 74)
    public final void method1267(int arg0) {
        field2776++;
        this.field2778 = null;
        if (arg0 != 0) {
            method1270(72, -68, 42);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(BIII)I", line = 85)
    public static final int method1268(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        if (arg0 != -88) {
            return -107;
        }
        field2781++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return 4095 - arg2;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IZ)Z", line = 120)
    public static final boolean method1269(int arg0, boolean arg1) {
        field2774++;
        boolean var2 = class96.field1401.method569();
        if (arg0 != -1) {
            return false;
        } else if (var2 == arg1) {
            return true;
        } else {
            if (!arg1) {
                class96.field1401.method625();
            } else if (!class96.field1401.method608()) {
                arg1 = false;
            }
            if (var2 == arg1) {
                return false;
            } else {
                class674.field9500.method2250((byte) 107, arg1 ? 1 : 0, class674.field9500.field5132);
                class199.method1350(arg0 ^ 0x662E);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(III)Z", line = 160)
    public static final boolean method1270(int arg0, int arg1, int arg2) {
        field2767++;
        if (arg1 != 128) {
            field2768 = null;
        }
        return (arg0 & 0x70000) != 0 | class175.method1102(arg0, 0, arg2) || class731.method4068(arg2, -210571632, arg0);
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "()V", line = 174)
    public class191() {
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB)V", line = 177)
    public static final void method1271(int arg0, byte arg1) {
        field2772++;
        if (!class393.method2393(arg0, -1) || arg1 >= -63) {
            return;
        }
        class712[] var2 = class491.field6599[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class712 var4 = var2[var3];
            if (var4 != null) {
                var4.field10040 = 1;
                var4.field9947 = 0;
                var4.field9970 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "<init>", descriptor = "([B)V", line = 211)
    public class191(byte[] arg0) {
        this.field2780 = new byte[128];
        this.field2766 = new class49[128];
        this.field2775 = new byte[128];
        this.field2771 = new short[128];
        this.field2778 = new int[128];
        this.field2777 = new byte[128];
        this.field2773 = new class25[128];
        class26 var2 = new class26(arg0);
        int var3;
        for (var3 = 0; var2.field279[var2.field330 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method195(128);
        }
        var3++;
        var2.field330++;
        int var6 = var2.field330;
        var2.field330 += var3;
        int var7;
        for (var7 = 0; var2.field279[var2.field330 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method195(128);
        }
        var2.field330++;
        var7++;
        int var10 = var2.field330;
        var2.field330 += var7;
        int var11;
        for (var11 = 0; var2.field279[var2.field330 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method195(128);
        }
        var11++;
        var2.field330++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method194((byte) 119);
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
        class49[] var18 = new class49[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class49 var102 = var18[var19] = new class49();
            int var103 = var2.method194((byte) 119);
            if (var103 > 0) {
                var102.field716 = new byte[var103 * 2];
            }
            int var104 = var2.method194((byte) 119);
            if (var104 > 0) {
                var102.field729 = new byte[var104 * 2 + 2];
                var102.field729[1] = 64;
            }
        }
        int var20 = var2.method194((byte) 119);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method194((byte) 119);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field279[var2.field330 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method195(128);
        }
        var24++;
        var2.field330++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method194((byte) 119);
            this.field2771[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method194((byte) 119);
            this.field2771[var30] = (short) (this.field2771[var30] + (var29 << 8));
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
                var33 = var2.method170((byte) -108);
            }
            this.field2771[var34] = (short) (this.field2771[var34] + class136.method878(32768, var33 - 1 << 14));
            this.field2778[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field2778[var38] != 0) {
                if (var35 == 0) {
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                    var37 = var2.field279[var6++] - 1;
                }
                var35--;
                this.field2780[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field2778[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field279[var10++] + 16 << 2;
                    if (var8.length > var40) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field2775[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class49 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field2778[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length > var43) {
                        var44 = var12[var43++];
                    } else {
                        var44 = -1;
                    }
                }
                this.field2766[var46] = var45;
                var44--;
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
                if (this.field2778[var50] > 0) {
                    var49 = var2.method194((byte) 119) + 1;
                }
            }
            this.field2777[var50] = (byte) var49;
            var47--;
        }
        this.field2770 = var2.method194((byte) 119) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class49 var99 = var18[var51];
            if (var99.field716 != null) {
                for (int var100 = 1; var100 < var99.field716.length; var100 += 2) {
                    var99.field716[var100] = var2.method195(128);
                }
            }
            if (var99.field729 != null) {
                for (int var101 = 3; var101 < var99.field729.length - 2; var101 += 2) {
                    var99.field729[var101] = var2.method195(128);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method195(128);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method195(128);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class49 var96 = var18[var54];
            if (var96.field729 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field729.length; var98 += 2) {
                    var97 = var2.method194((byte) 119) + var97 + 1;
                    var96.field729[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class49 var93 = var18[var55];
            if (var93.field716 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field716.length; var95 += 2) {
                    var94 += var2.method194((byte) 119) + 1;
                    var93.field716[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method194((byte) 119);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method194((byte) 119) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field2777[var60] = (byte) (this.field2777[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class65.method426(25787, var66, var64 - var58);
                    this.field2777[var67] = (byte) (this.field2777[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field2777[var63] = (byte) (this.field2777[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method194((byte) 119);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method194((byte) 119) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field2775[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field2775[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class65.method426(25787, var80, var78 - var71);
                    int var83 = (this.field2775[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field2775[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field2775[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field2775[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field717 = var2.method194((byte) 119);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class49 var92 = var18[var86];
            if (var92.field716 != null) {
                var92.field723 = var2.method194((byte) 119);
            }
            if (var92.field729 != null) {
                var92.field719 = var2.method194((byte) 119);
            }
            if (var92.field717 > 0) {
                var92.field722 = var2.method194((byte) 119);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field715 = var2.method194((byte) 119);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class49 var91 = var18[var88];
            if (var91.field715 > 0) {
                var91.field718 = var2.method194((byte) 119);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class49 var90 = var18[var89];
            if (var90.field718 > 0) {
                var90.field714 = var2.method194((byte) 119);
            }
        }
    }
}
