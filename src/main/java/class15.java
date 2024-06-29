import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class15 extends class424 {

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[Ldaa;")
    public class406[] field164;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "[S")
    public short[] field166;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "[B")
    public byte[] field167;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[Lbp;")
    public class430[] field171;

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "[I")
    private int[] field174;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "[B")
    public byte[] field162;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "[B")
    public byte[] field170;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public int field173;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "S")
    public static short field163 = 32767;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "I")
    public static int field168 = 2;

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "I")
    public static int field176 = 0;

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "F")
    public static float field177;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "I")
    public static int field175;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Ljava/lang/Class;")
    public static Class field178;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BLpe;I)Lge;")
    public static final class15 method87(byte arg0, class615 arg1, int arg2) {
        field175++;
        int var3 = 19 % ((arg0 + 33) / 49);
        byte[] var4 = arg1.method3365(arg2, (byte) 98);
        return var4 == null ? null : new class15(var4);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBLhf;[I)Z")
    public final boolean method88(byte[] arg0, byte arg1, class649 arg2, int[] arg3) {
        field172++;
        if (arg1 != 51) {
            method87((byte) 0, null, 91);
        }
        boolean var5 = true;
        int var6 = 0;
        class430 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg0 == null || arg0[var8] != 0) {
                int var9 = this.field174[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method3569((byte) 92, var9 >> 2, arg3);
                        } else {
                            var7 = arg2.method3570(var9 >> 2, arg3, 2141299044);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field171[var8] = var7;
                        this.field174[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method89(int arg0) {
        field169++;
        try {
            Method var1 = (field178 == null ? (field178 = method91("java.lang.Runtime")) : field178).getMethod("availableProcessors");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                    class590.field8011 = var3;
                } catch (Throwable var4) {
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V")
    public class15() {
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public final void method90(int arg0) {
        field165++;
        int var2 = -50 % ((-arg0 - 4) / 58);
        this.field174 = null;
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V")
    private class15(byte[] arg0) {
        this.field164 = new class406[128];
        this.field166 = new short[128];
        this.field167 = new byte[128];
        this.field171 = new class430[128];
        this.field174 = new int[128];
        this.field162 = new byte[128];
        this.field170 = new byte[128];
        class418 var2 = new class418(arg0);
        int var3;
        for (var3 = 0; var2.field5393[var2.field5367 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method2387((byte) 125);
        }
        var3++;
        var2.field5367++;
        int var6 = var2.field5367;
        var2.field5367 += var3;
        int var7;
        for (var7 = 0; var2.field5393[var2.field5367 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method2387((byte) 112);
        }
        var2.field5367++;
        var7++;
        int var10 = var2.field5367;
        var2.field5367 += var7;
        int var11;
        for (var11 = 0; var2.field5393[var2.field5367 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method2387((byte) -86);
        }
        var11++;
        var2.field5367++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method2396(-126);
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
        class406[] var18 = new class406[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class406 var102 = var18[var19] = new class406();
            int var103 = var2.method2396(-122);
            if (var103 > 0) {
                var102.field5164 = new byte[var103 * 2];
            }
            int var104 = var2.method2396(-121);
            if (var104 > 0) {
                var102.field5161 = new byte[var104 * 2 + 2];
                var102.field5161[1] = 64;
            }
        }
        int var20 = var2.method2396(-32);
        byte[] var21 = var20 > 0 ? new byte[var20 * 2] : null;
        int var22 = var2.method2396(-111);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field5393[var2.field5367 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method2387((byte) -43);
        }
        var24++;
        var2.field5367++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method2396(-122);
            this.field166[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method2396(53);
            this.field166[var30] = (short) (this.field166[var30] + (var29 << 8));
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
                var33 = var2.method2382(126);
            }
            this.field166[var34] = (short) (this.field166[var34] + class597.method3238(32768, var33 - 1 << 14));
            this.field174[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field174[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field5393[var6++] - 1;
                    if (var36 >= var4.length) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                var35--;
                this.field162[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field174[var42] != 0) {
                if (var40 == 0) {
                    var41 = var2.field5393[var10++] + 16 << 2;
                    if (var39 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                }
                this.field167[var42] = (byte) var41;
                var40--;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class406 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field174[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field164[var46] = var45;
                var43--;
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
                if (this.field174[var50] > 0) {
                    var49 = var2.method2396(40) + 1;
                }
            }
            var47--;
            this.field170[var50] = (byte) var49;
        }
        this.field173 = var2.method2396(-112) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class406 var99 = var18[var51];
            if (var99.field5164 != null) {
                for (int var100 = 1; var100 < var99.field5164.length; var100 += 2) {
                    var99.field5164[var100] = var2.method2387((byte) -20);
                }
            }
            if (var99.field5161 != null) {
                for (int var101 = 3; var101 < var99.field5161.length - 2; var101 += 2) {
                    var99.field5161[var101] = var2.method2387((byte) -119);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method2387((byte) -105);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method2387((byte) 101);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class406 var96 = var18[var54];
            if (var96.field5161 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field5161.length; var98 += 2) {
                    var97 = var97 + var2.method2396(88) + 1;
                    var96.field5161[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class406 var93 = var18[var55];
            if (var93.field5164 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field5164.length; var95 += 2) {
                    var94 -= -var2.method2396(121) - 1;
                    var93.field5164[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method2396(53);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method2396(14) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field170[var60] = (byte) (this.field170[var60] * var59 + 32 >> 6);
            }
            for (int var61 = 2; var61 < var21.length; var61 += 2) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class650.method3577(var64 - var58, -913897729, var66);
                    this.field170[var67] = (byte) (this.field170[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var58 = var64;
                var59 = var65;
            }
            Object var62 = null;
            for (int var63 = var58; var63 < 128; var63++) {
                this.field170[var63] = (byte) (this.field170[var63] * var59 + 32 >> 6);
            }
        }
        if (var23 != null) {
            int var69 = var2.method2396(-125);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 += var2.method2396(93) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field167[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field167[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class650.method3577(var78 - var71, -913897729, var80);
                    int var83 = (this.field167[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field167[var81] = (byte) var83;
                }
                var71 = var78;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field167[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field167[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field5169 = var2.method2396(113);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class406 var92 = var18[var86];
            if (var92.field5164 != null) {
                var92.field5170 = var2.method2396(114);
            }
            if (var92.field5161 != null) {
                var92.field5168 = var2.method2396(-118);
            }
            if (var92.field5169 > 0) {
                var92.field5171 = var2.method2396(-128);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field5165 = var2.method2396(-111);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class406 var91 = var18[var88];
            if (var91.field5165 > 0) {
                var91.field5163 = var2.method2396(-121);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class406 var90 = var18[var89];
            if (var90.field5163 > 0) {
                var90.field5167 = var2.method2396(-113);
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method91(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
