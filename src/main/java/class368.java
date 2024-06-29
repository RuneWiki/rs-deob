import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class368 extends class449 {

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "[I")
    private int[] field5064;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "[B")
    public byte[] field5059;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "[B")
    public byte[] field5063;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "[B")
    public byte[] field5060;

    @OriginalMember(owner = "client!gn", name = "J", descriptor = "[Lqq;")
    public class44[] field5070;

    @OriginalMember(owner = "client!gn", name = "C", descriptor = "[Lig;")
    public class83[] field5066;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "[S")
    public short[] field5055;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "I")
    public int field5061;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "I")
    public static int field5057 = 0;

    @OriginalMember(owner = "client!gn", name = "B", descriptor = "Lrc;")
    public static class108 field5065 = new class108(85, 0);

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    public static int field5075 = 0;

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "S")
    public static short field5074 = 32767;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!gn", name = "E", descriptor = "I")
    public static int field5067;

    @OriginalMember(owner = "client!gn", name = "G", descriptor = "I")
    public static int field5068;

    @OriginalMember(owner = "client!gn", name = "H", descriptor = "I")
    public static int field5069;

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "Lrc;")
    public static class108 field5073;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V", line = 12)
    public final void method2251(int arg0) {
        field5067++;
        this.field5064 = null;
        int var2 = 106 / ((10 - arg0) / 51);
    }

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "(I)V", line = 22)
    public static final void method2252(int arg0) {
        if (arg0 != 0) {
            field5075 = -116;
        }
        class336.method2111(class294.field4145, arg0 ^ 0x59);
        client.field872++;
        field5056++;
        class311.field4403.method1173(class162.field2361, (byte) 122);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIIII)V", line = 39)
    public static final void method2253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field5068++;
        class399 var10 = null;
        for (class399 var11 = (class399) class236.field3436.method775(1); var11 != null; var11 = (class399) class236.field3436.method763(0)) {
            if (var11.field5475 == arg7 && var11.field5474 == arg0 && var11.field5482 == arg6 && var11.field5478 == arg8) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class399();
            var10.field5475 = arg7;
            var10.field5482 = arg6;
            var10.field5478 = arg8;
            var10.field5474 = arg0;
            class217.method1496(var10, (byte) -126);
            class236.field3436.method766(var10, -1);
        }
        var10.field5476 = arg4;
        var10.field5467 = arg2;
        var10.field5477 = arg9;
        int var12 = 89 / ((arg3 + 58) / 51);
        var10.field5479 = arg1;
        var10.field5470 = arg5;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)V", line = 83)
    public static void method2254(byte arg0) {
        field5073 = null;
        if (arg0 >= -102) {
            method2254((byte) 62);
        }
        field5065 = null;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ltb;[II[B)Z", line = 101)
    public final boolean method2255(class312 arg0, int[] arg1, int arg2, byte[] arg3) {
        field5058++;
        if (arg2 != -11685) {
            return true;
        }
        boolean var5 = true;
        int var6 = 0;
        class44 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg3 == null || arg3[var8] != 0) {
                int var9 = this.field5064[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg0.method1986(var9 >> 2, -55, arg1);
                        } else {
                            var7 = arg0.method1985(arg2 + 11683, arg1, var9 >> 2);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field5070[var8] = var7;
                        this.field5064[var8] = 0;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 160)
    public static final void method2256(String arg0, boolean arg1) {
        field5071++;
        if (class311.field4405 == null) {
            return;
        }
        class336.method2111(class18.field192, 91);
        class300.field4250++;
        if (arg1) {
            class311.field4403.method1180((byte) -110, class345.method2147(arg0, (byte) 110));
            class311.field4403.method1184((byte) 67, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 177)
    public class368() {
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "([B)V", line = 182)
    public class368(byte[] arg0) {
        this.field5064 = new int[128];
        this.field5059 = new byte[128];
        this.field5063 = new byte[128];
        this.field5060 = new byte[128];
        this.field5070 = new class44[128];
        this.field5066 = new class83[128];
        this.field5055 = new short[128];
        class161 var2 = new class161(arg0);
        int var3;
        for (var3 = 0; var2.field2262[var2.field2298 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1152(-1910700904);
        }
        var2.field2298++;
        var3++;
        int var6 = var2.field2298;
        var2.field2298 += var3;
        int var7;
        for (var7 = 0; var2.field2262[var2.field2298 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1152(-1910700904);
        }
        var2.field2298++;
        var7++;
        int var10 = var2.field2298;
        var2.field2298 += var7;
        int var11;
        for (var11 = 0; var2.field2262[var2.field2298 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1152(-1910700904);
        }
        var11++;
        var2.field2298++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method1172((byte) -122);
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
        class83[] var18 = new class83[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class83 var102 = var18[var19] = new class83();
            int var103 = var2.method1172((byte) 2);
            if (var103 > 0) {
                var102.field1185 = new byte[var103 * 2];
            }
            int var104 = var2.method1172((byte) -27);
            if (var104 > 0) {
                var102.field1189 = new byte[var104 * 2 + 2];
                var102.field1189[1] = 64;
            }
        }
        int var20 = var2.method1172((byte) -125);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1172((byte) -122);
        byte[] var23 = var22 <= 0 ? null : new byte[var22 * 2];
        int var24;
        for (var24 = 0; var2.field2262[var2.field2298 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1152(-1910700904);
        }
        var24++;
        var2.field2298++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1172((byte) -110);
            this.field5055[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1172((byte) -115);
            this.field5055[var30] = (short) (this.field5055[var30] + (var29 << 8));
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
                var33 = var2.method1151((byte) -76);
            }
            this.field5055[var34] = (short) (this.field5055[var34] + (class88.method739(2, var33 - 1) << 14));
            this.field5064[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field5064[var38] != 0) {
                if (var36 == 0) {
                    var37 = var2.field2262[var6++] - 1;
                    if (var4.length > var35) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                }
                var36--;
                this.field5060[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field5064[var42] != 0) {
                if (var40 == 0) {
                    if (var39 < var8.length) {
                        var40 = var8[var39++];
                    } else {
                        var40 = -1;
                    }
                    var41 = var2.field2262[var10++] + 16 << 2;
                }
                var40--;
                this.field5063[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class83 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field5064[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var43 >= var12.length) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                this.field5066[var46] = var45;
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
                if (this.field5064[var50] > 0) {
                    var49 = var2.method1172((byte) -117) + 1;
                }
            }
            this.field5059[var50] = (byte) var49;
            var48--;
        }
        this.field5061 = var2.method1172((byte) -125) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class83 var99 = var18[var51];
            if (var99.field1185 != null) {
                for (int var100 = 1; var100 < var99.field1185.length; var100 += 2) {
                    var99.field1185[var100] = var2.method1152(-1910700904);
                }
            }
            if (var99.field1189 != null) {
                for (int var101 = 3; var101 < (var99.field1189.length - 2); var101 += 2) {
                    var99.field1189[var101] = var2.method1152(-1910700904);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1152(-1910700904);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1152(-1910700904);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class83 var96 = var18[var54];
            if (var96.field1189 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1189.length; var98 += 2) {
                    var97 = var2.method1172((byte) -6) + var97 + 1;
                    var96.field1189[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class83 var93 = var18[var55];
            if (var93.field1185 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1185.length; var95 += 2) {
                    var94 += var2.method1172((byte) 30) + 1;
                    var93.field1185[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1172((byte) -125);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var2.method1172((byte) 78) + var56 + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field5059[var60] = (byte) (this.field5059[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var21.length > var61) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class377.method2304(var64 - var58, var66, false);
                    var66 += var65 - var59;
                    this.field5059[var67] = (byte) (this.field5059[var67] * var68 + 32 >> 6);
                }
                var59 = var65;
                var61 += 2;
                var58 = var64;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field5059[var62] = (byte) (this.field5059[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1172((byte) -114);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var69 + var2.method1172((byte) 68) + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field5063[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field5063[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var74 < var23.length) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class377.method2304(var78 - var71, var80, false);
                    int var83 = (this.field5063[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field5063[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var74 += 2;
                var71 = var78;
                var72 = var79;
            }
            for (int var75 = var71; var75 < 128; var75++) {
                int var77 = (this.field5063[var75] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field5063[var75] = (byte) var77;
            }
            Object var76 = null;
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1184 = var2.method1172((byte) -124);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class83 var92 = var18[var86];
            if (var92.field1185 != null) {
                var92.field1190 = var2.method1172((byte) -120);
            }
            if (var92.field1189 != null) {
                var92.field1187 = var2.method1172((byte) 96);
            }
            if (var92.field1184 > 0) {
                var92.field1191 = var2.method1172((byte) 54);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1197 = var2.method1172((byte) -126);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class83 var91 = var18[var88];
            if (var91.field1197 > 0) {
                var91.field1193 = var2.method1172((byte) 36);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class83 var90 = var18[var89];
            if (var90.field1193 > 0) {
                var90.field1188 = var2.method1172((byte) -107);
            }
        }
    }
}
