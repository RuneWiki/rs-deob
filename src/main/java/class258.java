import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class258 extends class154 {

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "[B")
    public byte[] field4169;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "[S")
    public short[] field4173;

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "[I")
    private int[] field4171;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "[B")
    public byte[] field4172;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "[B")
    public byte[] field4170;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[Ldj;")
    public class90[] field4167;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "[Lqm;")
    public class173[] field4164;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public int field4174;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "Ljava/lang/String;")
    public static String field4165 = null;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4163 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "[I")
    public static int[] field4176 = new int[5];

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field4178 = 0;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "Lnh;")
    public static class305 field4175;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method1690(int arg0) {
        field4176 = null;
        field4165 = null;
        field4175 = null;
        field4163 = null;
        if (arg0 != 29) {
            field4178 = 24;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Z)V")
    public final void method1691(boolean arg0) {
        this.field4171 = null;
        field4168++;
        if (arg0) {
            field4163 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILsd;[I[B)Z")
    public final boolean method1692(int arg0, class164 arg1, int[] arg2, byte[] arg3) {
        field4166++;
        if (arg0 != -5614) {
            field4176 = null;
        }
        int var5 = 0;
        class173 var6 = null;
        boolean var7 = true;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field4171[var8];
                if (var9 != 0) {
                    if (var5 != var9) {
                        var5 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var6 = arg1.method1045(var9 >> 2, arg2, (byte) 84);
                        } else {
                            var6 = arg1.method1044(var9 >> 2, arg2, false);
                        }
                        if (var6 == null) {
                            var7 = false;
                        }
                    }
                    if (var6 != null) {
                        this.field4164[var8] = var6;
                        this.field4171[var8] = 0;
                    }
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Lvd;")
    public static final class160 method1693(int arg0, int arg1, int arg2) {
        class91 var3 = class246.field3856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1343; var4++) {
            class160 var5 = var3.field1339[var4];
            if ((var5.field2225 >> 29 & 0x3L) == 2L && var5.field2234 == arg1 && var5.field2229 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class258() {
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "([B)V")
    public class258(byte[] arg0) {
        this.field4169 = new byte[128];
        this.field4173 = new short[128];
        this.field4171 = new int[128];
        this.field4172 = new byte[128];
        this.field4170 = new byte[128];
        this.field4167 = new class90[128];
        this.field4164 = new class173[128];
        int var2 = 0;
        class215 var3 = new class215(arg0);
        while (var3.field3287[var3.field3280 + var2] != 0) {
            var2++;
        }
        byte[] var4 = new byte[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            var4[var5] = var3.method1350((byte) -67);
        }
        var2++;
        var3.field3280++;
        int var6 = 0;
        int var7 = var3.field3280;
        var3.field3280 += var2;
        while (var3.field3287[var3.field3280 + var6] != 0) {
            var6++;
        }
        byte[] var8 = new byte[var6];
        for (int var9 = 0; var9 < var6; var9++) {
            var8[var9] = var3.method1350((byte) 104);
        }
        var3.field3280++;
        var6++;
        int var10 = var3.field3280;
        int var11 = 0;
        var3.field3280 += var6;
        while (var3.field3287[var3.field3280 + var11] != 0) {
            var11++;
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var3.method1350((byte) -58);
        }
        var3.field3280++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 > 1) {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var18 = var3.method1374((byte) -60);
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
        } else {
            var15 = var11;
        }
        class90[] var19 = new class90[var15];
        for (int var20 = 0; var20 < var19.length; var20++) {
            class90 var103 = var19[var20] = new class90();
            int var104 = var3.method1374((byte) -60);
            if (var104 > 0) {
                var103.field1306 = new byte[var104 * 2];
            }
            int var105 = var3.method1374((byte) -60);
            if (var105 > 0) {
                var103.field1312 = new byte[var105 * 2 + 2];
                var103.field1312[1] = 64;
            }
        }
        int var21 = var3.method1374((byte) -60);
        int var22 = 0;
        byte[] var23 = var21 > 0 ? new byte[var21 * 2] : null;
        int var24 = var3.method1374((byte) -60);
        byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
        while (var3.field3287[var3.field3280 + var22] != 0) {
            var22++;
        }
        byte[] var26 = new byte[var22];
        for (int var27 = 0; var27 < var22; var27++) {
            var26[var27] = var3.method1350((byte) -16);
        }
        var22++;
        var3.field3280++;
        int var28 = 0;
        for (int var29 = 0; var29 < 128; var29++) {
            var28 += var3.method1374((byte) -60);
            this.field4173[var29] = (short) var28;
        }
        int var30 = 0;
        for (int var31 = 0; var31 < 128; var31++) {
            var30 += var3.method1374((byte) -60);
            this.field4173[var31] = (short) (this.field4173[var31] + (var30 << 8));
        }
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        for (int var35 = 0; var35 < 128; var35++) {
            if (var32 == 0) {
                if (var33 >= var26.length) {
                    var32 = -1;
                } else {
                    var32 = var26[var33++];
                }
                var34 = var3.method1395(127);
            }
            this.field4173[var35] = (short) (this.field4173[var35] + class32.method199(32768, var34 - 1 << 14));
            this.field4171[var35] = var34;
            var32--;
        }
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        for (int var39 = 0; var39 < 128; var39++) {
            if (this.field4171[var39] != 0) {
                if (var37 == 0) {
                    var38 = var3.field3287[var7++] - 1;
                    if (var36 < var4.length) {
                        var37 = var4[var36++];
                    } else {
                        var37 = -1;
                    }
                }
                this.field4172[var39] = (byte) var38;
                var37--;
            }
        }
        int var40 = 0;
        int var41 = 0;
        int var42 = 0;
        for (int var43 = 0; var43 < 128; var43++) {
            if (this.field4171[var43] != 0) {
                if (var40 == 0) {
                    if (var41 >= var8.length) {
                        var40 = -1;
                    } else {
                        var40 = var8[var41++];
                    }
                    var42 = var3.field3287[var10++] + 16 << 2;
                }
                this.field4169[var43] = (byte) var42;
                var40--;
            }
        }
        int var44 = 0;
        int var45 = 0;
        class90 var46 = null;
        for (int var47 = 0; var47 < 128; var47++) {
            if (this.field4171[var47] != 0) {
                if (var45 == 0) {
                    var46 = var19[var14[var44]];
                    if (var44 < var12.length) {
                        var45 = var12[var44++];
                    } else {
                        var45 = -1;
                    }
                }
                this.field4167[var47] = var46;
                var45--;
            }
        }
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        for (int var51 = 0; var51 < 128; var51++) {
            if (var50 == 0) {
                if (var48 >= var26.length) {
                    var50 = -1;
                } else {
                    var50 = var26[var48++];
                }
                if (this.field4171[var51] > 0) {
                    var49 = var3.method1374((byte) -60) + 1;
                }
            }
            var50--;
            this.field4170[var51] = (byte) var49;
        }
        this.field4174 = var3.method1374((byte) -60) + 1;
        for (int var52 = 0; var52 < var15; var52++) {
            class90 var100 = var19[var52];
            if (var100.field1306 != null) {
                for (int var101 = 1; var101 < var100.field1306.length; var101 += 2) {
                    var100.field1306[var101] = var3.method1350((byte) 118);
                }
            }
            if (var100.field1312 != null) {
                for (int var102 = 3; var102 < var100.field1312.length - 2; var102 += 2) {
                    var100.field1312[var102] = var3.method1350((byte) -31);
                }
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var3.method1350((byte) 84);
            }
        }
        if (var25 != null) {
            for (int var54 = 1; var54 < var25.length; var54 += 2) {
                var25[var54] = var3.method1350((byte) -112);
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class90 var97 = var19[var55];
            if (var97.field1312 != null) {
                int var98 = 0;
                for (int var99 = 2; var99 < var97.field1312.length; var99 += 2) {
                    var98 = var3.method1374((byte) -60) + var98 + 1;
                    var97.field1312[var99] = (byte) var98;
                }
            }
        }
        for (int var56 = 0; var56 < var15; var56++) {
            class90 var94 = var19[var56];
            if (var94.field1306 != null) {
                int var95 = 0;
                for (int var96 = 2; var96 < var94.field1306.length; var96 += 2) {
                    var95 = var95 + var3.method1374((byte) -60) + 1;
                    var94.field1306[var96] = (byte) var95;
                }
            }
        }
        if (var23 != null) {
            int var57 = var3.method1374((byte) -60);
            var23[0] = (byte) var57;
            for (int var58 = 2; var58 < var23.length; var58 += 2) {
                var57 = var57 + var3.method1374((byte) -60) + 1;
                var23[var58] = (byte) var57;
            }
            byte var59 = var23[1];
            byte var60 = var23[0];
            for (int var61 = 0; var61 < var60; var61++) {
                this.field4170[var61] = (byte) (this.field4170[var61] * var59 + 32 >> 6);
            }
            int var62 = 2;
            while (var23.length > var62) {
                byte var65 = var23[var62 + 1];
                byte var66 = var23[var62];
                int var67 = (var66 - var60) / 2 + (var66 - var60) * var59;
                var62 += 2;
                for (int var68 = var60; var68 < var66; var68++) {
                    int var69 = class185.method1177(var66 - var60, var67, 799753471);
                    var67 += var65 - var59;
                    this.field4170[var68] = (byte) (this.field4170[var68] * var69 + 32 >> 6);
                }
                var60 = var66;
                var59 = var65;
            }
            for (int var63 = var60; var63 < 128; var63++) {
                this.field4170[var63] = (byte) (this.field4170[var63] * var59 + 32 >> 6);
            }
            Object var64 = null;
        }
        if (var25 != null) {
            int var70 = var3.method1374((byte) -60);
            var25[0] = (byte) var70;
            for (int var71 = 2; var71 < var25.length; var71 += 2) {
                var70 = var70 + var3.method1374((byte) -60) + 1;
                var25[var71] = (byte) var70;
            }
            byte var72 = var25[0];
            int var73 = var25[1] << 1;
            for (int var74 = 0; var74 < var72; var74++) {
                int var85 = (this.field4169[var74] & 0xFF) + var73;
                if (var85 < 0) {
                    var85 = 0;
                }
                if (var85 > 128) {
                    var85 = 128;
                }
                this.field4169[var74] = (byte) var85;
            }
            int var75 = 2;
            while (var75 < var25.length) {
                byte var79 = var25[var75];
                int var80 = var25[var75 + 1] << 1;
                int var81 = (var79 - var72) / 2 + (var79 - var72) * var73;
                for (int var82 = var72; var82 < var79; var82++) {
                    int var83 = class185.method1177(var79 - var72, var81, 799753471);
                    var81 += var80 - var73;
                    int var84 = (this.field4169[var82] & 0xFF) + var83;
                    if (var84 < 0) {
                        var84 = 0;
                    }
                    if (var84 > 128) {
                        var84 = 128;
                    }
                    this.field4169[var82] = (byte) var84;
                }
                var73 = var80;
                var75 += 2;
                var72 = var79;
            }
            for (int var76 = var72; var76 < 128; var76++) {
                int var78 = (this.field4169[var76] & 0xFF) + var73;
                if (var78 < 0) {
                    var78 = 0;
                }
                if (var78 > 128) {
                    var78 = 128;
                }
                this.field4169[var76] = (byte) var78;
            }
            Object var77 = null;
        }
        for (int var86 = 0; var86 < var15; var86++) {
            var19[var86].field1316 = var3.method1374((byte) -60);
        }
        for (int var87 = 0; var87 < var15; var87++) {
            class90 var93 = var19[var87];
            if (var93.field1306 != null) {
                var93.field1311 = var3.method1374((byte) -60);
            }
            if (var93.field1312 != null) {
                var93.field1299 = var3.method1374((byte) -60);
            }
            if (var93.field1316 > 0) {
                var93.field1302 = var3.method1374((byte) -60);
            }
        }
        for (int var88 = 0; var88 < var15; var88++) {
            var19[var88].field1308 = var3.method1374((byte) -60);
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class90 var92 = var19[var89];
            if (var92.field1308 > 0) {
                var92.field1313 = var3.method1374((byte) -60);
            }
        }
        for (int var90 = 0; var90 < var15; var90++) {
            class90 var91 = var19[var90];
            if (var91.field1313 > 0) {
                var91.field1310 = var3.method1374((byte) -60);
            }
        }
    }
}
