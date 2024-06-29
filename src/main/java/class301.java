import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class301 extends class71 {

    @OriginalMember(owner = "client!bha", name = "w", descriptor = "[B")
    public byte[] field4266;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "[B")
    public byte[] field4257;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "[S")
    public short[] field4253;

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "[I")
    private int[] field4259;

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "[B")
    public byte[] field4262;

    @OriginalMember(owner = "client!bha", name = "v", descriptor = "[Ldv;")
    public class88[] field4265;

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "[Lwo;")
    public class695[] field4256;

    @OriginalMember(owner = "client!bha", name = "u", descriptor = "I")
    public int field4264;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "Lgw;")
    public static class690 field4258 = new class690(260);

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "Z")
    public static boolean field4261 = false;

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(ZLeia;[B[I)Z", line = 6)
    public final boolean method1981(boolean arg0, class752 arg1, byte[] arg2, int[] arg3) {
        field4255++;
        boolean var5 = true;
        int var6 = 0;
        class695 var7 = null;
        for (int var8 = 0; var8 < 128; var8++) {
            if (arg2 == null || arg2[var8] != 0) {
                int var9 = this.field4259[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg1.method4177(arg3, var9 >> 2, (byte) -63);
                        } else {
                            var7 = arg1.method4173(var9 >> 2, (byte) 100, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field4256[var8] = var7;
                        this.field4259[var8] = 0;
                    }
                }
            }
        }
        if (arg0) {
            this.method1983(-94);
        }
        return var5;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(IIII)V", line = 66)
    public static final void method1982(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 * class332.field4707.field4766.method1140(arg2) >> 8;
        field4254++;
        if (arg0 == -1 && !class350.field4966) {
            class280.method1872(13155);
        } else if (arg0 != -1 && (class61.field883 != arg0 || !class77.method571(arg2 - 1)) && var4 != 0 && !class350.field4966) {
            class355.method2276(class477.field6645, false, arg1, arg0, var4, 0, -29366);
            class512.method3059(-1);
        }
        if (class61.field883 != arg0) {
            class627.field8436 = null;
        }
        class61.field883 = arg0;
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V", line = 99)
    public final void method1983(int arg0) {
        if (arg0 != 0) {
            this.field4253 = null;
        }
        this.field4259 = null;
        field4260++;
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)Z", line = 110)
    public static final boolean method1984(int arg0) {
        if (arg0 < 109) {
            method1982(57, -118, 43, 17);
        }
        field4263++;
        if (class498.field6967 == null) {
            return false;
        } else {
            if (class498.field6967.field7754 >= 2000) {
                class498.field6967.field7754 -= 2000;
            }
            return class498.field6967.field7754 == 1002;
        }
    }

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)V", line = 140)
    public static void method1985(int arg0) {
        if (arg0 != 0) {
            field4258 = null;
        }
        field4258 = null;
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V", line = 153)
    public class301() {
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "([B)V", line = 159)
    public class301(byte[] arg0) {
        this.field4266 = new byte[128];
        this.field4257 = new byte[128];
        this.field4253 = new short[128];
        this.field4259 = new int[128];
        this.field4262 = new byte[128];
        this.field4265 = new class88[128];
        this.field4256 = new class695[128];
        class63 var2 = new class63(arg0);
        int var3;
        for (var3 = 0; var2.field954[var2.field956 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method491(false);
        }
        var3++;
        var2.field956++;
        int var6 = var2.field956;
        var2.field956 += var3;
        int var7;
        for (var7 = 0; var2.field954[var2.field956 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method491(false);
        }
        var7++;
        var2.field956++;
        int var10 = var2.field956;
        var2.field956 += var7;
        int var11;
        for (var11 = 0; var2.field954[var2.field956 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method491(false);
        }
        var2.field956++;
        var11++;
        byte[] var14 = new byte[var11];
        int var15;
        if (var11 <= 1) {
            var15 = var11;
        } else {
            var14[1] = 1;
            var15 = 2;
            int var16 = 1;
            for (int var17 = 2; var17 < var11; var17++) {
                int var105 = var2.method505((byte) -119);
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
        class88[] var18 = new class88[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class88 var102 = var18[var19] = new class88();
            int var103 = var2.method505((byte) -119);
            if (var103 > 0) {
                var102.field1253 = new byte[var103 * 2];
            }
            int var104 = var2.method505((byte) -119);
            if (var104 > 0) {
                var102.field1245 = new byte[var104 * 2 + 2];
                var102.field1245[1] = 64;
            }
        }
        int var20 = var2.method505((byte) -119);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method505((byte) -119);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field954[var2.field956 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method491(false);
        }
        var24++;
        var2.field956++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method505((byte) -119);
            this.field4253[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method505((byte) -119);
            this.field4253[var30] = (short) (this.field4253[var30] + (var29 << 8));
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
                var33 = var2.method495(true);
            }
            this.field4253[var34] = (short) (this.field4253[var34] + class665.method3759(var33 - 1 << 14, 32768));
            this.field4259[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field4259[var38] != 0) {
                if (var36 == 0) {
                    if (var35 < var4.length) {
                        var36 = var4[var35++];
                    } else {
                        var36 = -1;
                    }
                    var37 = var2.field954[var6++] - 1;
                }
                var36--;
                this.field4257[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field4259[var42] != 0) {
                if (var40 == 0) {
                    if (var8.length <= var39) {
                        var40 = -1;
                    } else {
                        var40 = var8[var39++];
                    }
                    var41 = var2.field954[var10++] + 16 << 2;
                }
                var40--;
                this.field4262[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class88 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field4259[var46] != 0) {
                if (var43 == 0) {
                    var45 = var18[var14[var44]];
                    if (var12.length <= var44) {
                        var43 = -1;
                    } else {
                        var43 = var12[var44++];
                    }
                }
                this.field4265[var46] = var45;
                var43--;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var47 >= var25.length) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field4259[var50] > 0) {
                    var49 = var2.method505((byte) -119) + 1;
                }
            }
            this.field4266[var50] = (byte) var49;
            var48--;
        }
        this.field4264 = var2.method505((byte) -119) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class88 var99 = var18[var51];
            if (var99.field1253 != null) {
                for (int var100 = 1; var100 < var99.field1253.length; var100 += 2) {
                    var99.field1253[var100] = var2.method491(false);
                }
            }
            if (var99.field1245 != null) {
                for (int var101 = 3; var101 < (var99.field1245.length - 2); var101 += 2) {
                    var99.field1245[var101] = var2.method491(false);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method491(false);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method491(false);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class88 var96 = var18[var54];
            if (var96.field1245 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field1245.length; var98 += 2) {
                    var97 = var97 + var2.method505((byte) -119) + 1;
                    var96.field1245[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class88 var93 = var18[var55];
            if (var93.field1253 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field1253.length; var95 += 2) {
                    var94 = var94 + var2.method505((byte) -119) + 1;
                    var93.field1253[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method505((byte) -119);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 += var2.method505((byte) -119) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field4266[var60] = (byte) (this.field4266[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) * var59 + ((var64 - var58) / 2);
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class282.method1883(var64 - var58, (byte) -105, var66);
                    var66 += var65 - var59;
                    this.field4266[var67] = (byte) (this.field4266[var67] * var68 + 32 >> 6);
                }
                var58 = var64;
                var61 += 2;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field4266[var62] = (byte) (this.field4266[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method505((byte) -119);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 = var2.method505((byte) -119) + var69 + 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field4262[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field4262[var73] = (byte) var84;
            }
            for (int var74 = 2; var74 < var23.length; var74 += 2) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) * var72 + ((var78 - var71) / 2);
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class282.method1883(var78 - var71, (byte) -73, var80);
                    int var83 = (this.field4262[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    this.field4262[var81] = (byte) var83;
                    var80 += var79 - var72;
                }
                var72 = var79;
                var71 = var78;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field4262[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field4262[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field1250 = var2.method505((byte) -119);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class88 var92 = var18[var86];
            if (var92.field1253 != null) {
                var92.field1247 = var2.method505((byte) -119);
            }
            if (var92.field1245 != null) {
                var92.field1252 = var2.method505((byte) -119);
            }
            if (var92.field1250 > 0) {
                var92.field1254 = var2.method505((byte) -119);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field1251 = var2.method505((byte) -119);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class88 var91 = var18[var88];
            if (var91.field1251 > 0) {
                var91.field1243 = var2.method505((byte) -119);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class88 var90 = var18[var89];
            if (var90.field1243 > 0) {
                var90.field1248 = var2.method505((byte) -119);
            }
        }
    }
}
