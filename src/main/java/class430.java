import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class430 extends class359 {

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "[B")
    public byte[] field6234;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "[Lqm;")
    public class78[] field6228;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "[B")
    public byte[] field6232;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "[B")
    public byte[] field6230;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "[Lfp;")
    public class177[] field6226;

    @OriginalMember(owner = "client!cp", name = "w", descriptor = "[I")
    private int[] field6239;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "[S")
    public short[] field6229;

    @OriginalMember(owner = "client!cp", name = "x", descriptor = "I")
    public int field6240;

    @OriginalMember(owner = "client!cp", name = "v", descriptor = "I")
    public static int field6238 = -2;

    @OriginalMember(owner = "client!cp", name = "s", descriptor = "I")
    public static int field6235 = 0;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!cp", name = "t", descriptor = "I")
    public static int field6236;

    @OriginalMember(owner = "client!cp", name = "u", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V", line = 3)
    public final void method2675(int arg0) {
        field6231++;
        this.field6239 = null;
        if (arg0 != 18181) {
            this.field6234 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IBI)V", line = 22)
    public static final void method2676(int arg0, byte arg1, int arg2) {
        field6237++;
        class348 var3 = class385.method2464(13, 1302, arg2);
        var3.method2216((byte) 23);
        var3.field5093 = arg0;
        if (arg1 != 20) {
            field6235 = 9;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B[BLdm;[I)Z", line = 46)
    public final boolean method2677(byte arg0, byte[] arg1, class32 arg2, int[] arg3) {
        field6233++;
        boolean var5 = true;
        int var6 = 0;
        class177 var7 = null;
        int var8 = 0;
        if (arg0 >= -115) {
            method2679(-65, -114);
        }
        while (var8 < 128) {
            if (arg1 == null || arg1[var8] != 0) {
                int var9 = this.field6239[var8];
                if (var9 != 0) {
                    if (var6 != var9) {
                        var6 = var9--;
                        if ((var9 & 0x1) == 0) {
                            var7 = arg2.method184(arg3, var9 >> 2, 0);
                        } else {
                            var7 = arg2.method190(var9 >> 2, (byte) -113, arg3);
                        }
                        if (var7 == null) {
                            var5 = false;
                        }
                    }
                    if (var7 != null) {
                        this.field6226[var8] = var7;
                        this.field6239[var8] = 0;
                    }
                }
            }
            var8++;
        }
        return var5;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILbk;)Lcc;", line = 105)
    public static final class434 method2678(int arg0, class211 arg1) {
        field6225++;
        int var2 = -23 % ((-arg0 - 9) / 51);
        return new class434(arg1.method1344((byte) -4), arg1.method1344((byte) -4), arg1.method1344((byte) -4), arg1.method1344((byte) -4), arg1.method1353(83), arg1.method1342((byte) -127));
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V", line = 122)
    public class430() {
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)Lpn;", line = 125)
    public static final class444 method2679(int arg0, int arg1) {
        field6227++;
        class444 var2 = (class444) class440.field6447.method410((byte) -78, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field2872.method361(5, 92, arg1);
        class444 var4 = new class444();
        if (var3 != null) {
            var4.method2750(new class211(var3), -122);
        }
        if (arg0 >= -95) {
            method2676(-33, (byte) -83, 96);
        }
        class440.field6447.method414(var4, (byte) 66, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "([B)V", line = 148)
    public class430(byte[] arg0) {
        this.field6234 = new byte[128];
        this.field6228 = new class78[128];
        this.field6232 = new byte[128];
        this.field6230 = new byte[128];
        this.field6226 = new class177[128];
        this.field6239 = new int[128];
        this.field6229 = new short[128];
        class211 var2 = new class211(arg0);
        int var3;
        for (var3 = 0; var2.field2867[var2.field2888 + var3] != 0; var3++) {
        }
        byte[] var4 = new byte[var3];
        for (int var5 = 0; var5 < var3; var5++) {
            var4[var5] = var2.method1373((byte) 30);
        }
        var2.field2888++;
        var3++;
        int var6 = var2.field2888;
        var2.field2888 += var3;
        int var7;
        for (var7 = 0; var2.field2867[var2.field2888 + var7] != 0; var7++) {
        }
        byte[] var8 = new byte[var7];
        for (int var9 = 0; var9 < var7; var9++) {
            var8[var9] = var2.method1373((byte) 30);
        }
        var2.field2888++;
        var7++;
        int var10 = var2.field2888;
        var2.field2888 += var7;
        int var11;
        for (var11 = 0; var2.field2867[var2.field2888 + var11] != 0; var11++) {
        }
        byte[] var12 = new byte[var11];
        for (int var13 = 0; var13 < var11; var13++) {
            var12[var13] = var2.method1373((byte) 30);
        }
        var2.field2888++;
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
                int var105 = var2.method1342((byte) -128);
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
        class78[] var18 = new class78[var15];
        for (int var19 = 0; var19 < var18.length; var19++) {
            class78 var102 = var18[var19] = new class78();
            int var103 = var2.method1342((byte) -126);
            if (var103 > 0) {
                var102.field879 = new byte[var103 * 2];
            }
            int var104 = var2.method1342((byte) -126);
            if (var104 > 0) {
                var102.field877 = new byte[var104 * 2 + 2];
                var102.field877[1] = 64;
            }
        }
        int var20 = var2.method1342((byte) -126);
        byte[] var21 = var20 <= 0 ? null : new byte[var20 * 2];
        int var22 = var2.method1342((byte) -127);
        byte[] var23 = var22 > 0 ? new byte[var22 * 2] : null;
        int var24;
        for (var24 = 0; var2.field2867[var2.field2888 + var24] != 0; var24++) {
        }
        byte[] var25 = new byte[var24];
        for (int var26 = 0; var26 < var24; var26++) {
            var25[var26] = var2.method1373((byte) 30);
        }
        var2.field2888++;
        var24++;
        int var27 = 0;
        for (int var28 = 0; var28 < 128; var28++) {
            var27 += var2.method1342((byte) -128);
            this.field6229[var28] = (short) var27;
        }
        int var29 = 0;
        for (int var30 = 0; var30 < 128; var30++) {
            var29 += var2.method1342((byte) -128);
            this.field6229[var30] = (short) (this.field6229[var30] + (var29 << 8));
        }
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        for (int var34 = 0; var34 < 128; var34++) {
            if (var31 == 0) {
                if (var32 < var25.length) {
                    var31 = var25[var32++];
                } else {
                    var31 = -1;
                }
                var33 = var2.method1391(117);
            }
            this.field6229[var34] = (short) (this.field6229[var34] + class40.method253(32768, var33 - 1 << 14));
            this.field6239[var34] = var33;
            var31--;
        }
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        for (int var38 = 0; var38 < 128; var38++) {
            if (this.field6239[var38] != 0) {
                if (var35 == 0) {
                    var37 = var2.field2867[var6++] - 1;
                    if (var4.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var4[var36++];
                    }
                }
                var35--;
                this.field6232[var38] = (byte) var37;
            }
        }
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        for (int var42 = 0; var42 < 128; var42++) {
            if (this.field6239[var42] != 0) {
                if (var39 == 0) {
                    var41 = var2.field2867[var10++] + 16 << 2;
                    if (var40 < var8.length) {
                        var39 = var8[var40++];
                    } else {
                        var39 = -1;
                    }
                }
                var39--;
                this.field6234[var42] = (byte) var41;
            }
        }
        int var43 = 0;
        int var44 = 0;
        class78 var45 = null;
        for (int var46 = 0; var46 < 128; var46++) {
            if (this.field6239[var46] != 0) {
                if (var44 == 0) {
                    var45 = var18[var14[var43]];
                    if (var12.length <= var43) {
                        var44 = -1;
                    } else {
                        var44 = var12[var43++];
                    }
                }
                var44--;
                this.field6228[var46] = var45;
            }
        }
        int var47 = 0;
        int var48 = 0;
        int var49 = 0;
        for (int var50 = 0; var50 < 128; var50++) {
            if (var48 == 0) {
                if (var25.length <= var47) {
                    var48 = -1;
                } else {
                    var48 = var25[var47++];
                }
                if (this.field6239[var50] > 0) {
                    var49 = var2.method1342((byte) -127) + 1;
                }
            }
            var48--;
            this.field6230[var50] = (byte) var49;
        }
        this.field6240 = var2.method1342((byte) -128) + 1;
        for (int var51 = 0; var51 < var15; var51++) {
            class78 var99 = var18[var51];
            if (var99.field879 != null) {
                for (int var100 = 1; var100 < var99.field879.length; var100 += 2) {
                    var99.field879[var100] = var2.method1373((byte) 30);
                }
            }
            if (var99.field877 != null) {
                for (int var101 = 3; var101 < (var99.field877.length - 2); var101 += 2) {
                    var99.field877[var101] = var2.method1373((byte) 30);
                }
            }
        }
        if (var21 != null) {
            for (int var52 = 1; var52 < var21.length; var52 += 2) {
                var21[var52] = var2.method1373((byte) 30);
            }
        }
        if (var23 != null) {
            for (int var53 = 1; var53 < var23.length; var53 += 2) {
                var23[var53] = var2.method1373((byte) 30);
            }
        }
        for (int var54 = 0; var54 < var15; var54++) {
            class78 var96 = var18[var54];
            if (var96.field877 != null) {
                int var97 = 0;
                for (int var98 = 2; var98 < var96.field877.length; var98 += 2) {
                    var97 += var2.method1342((byte) -128) + 1;
                    var96.field877[var98] = (byte) var97;
                }
            }
        }
        for (int var55 = 0; var55 < var15; var55++) {
            class78 var93 = var18[var55];
            if (var93.field879 != null) {
                int var94 = 0;
                for (int var95 = 2; var95 < var93.field879.length; var95 += 2) {
                    var94 += var2.method1342((byte) -128) + 1;
                    var93.field879[var95] = (byte) var94;
                }
            }
        }
        if (var21 != null) {
            int var56 = var2.method1342((byte) -127);
            var21[0] = (byte) var56;
            for (int var57 = 2; var57 < var21.length; var57 += 2) {
                var56 = var56 + var2.method1342((byte) -128) + 1;
                var21[var57] = (byte) var56;
            }
            byte var58 = var21[0];
            byte var59 = var21[1];
            for (int var60 = 0; var60 < var58; var60++) {
                this.field6230[var60] = (byte) (this.field6230[var60] * var59 + 32 >> 6);
            }
            int var61 = 2;
            while (var61 < var21.length) {
                byte var64 = var21[var61];
                byte var65 = var21[var61 + 1];
                int var66 = (var64 - var58) / 2 + (var64 - var58) * var59;
                for (int var67 = var58; var67 < var64; var67++) {
                    int var68 = class95.method514(12800, var66, var64 - var58);
                    this.field6230[var67] = (byte) (this.field6230[var67] * var68 + 32 >> 6);
                    var66 += var65 - var59;
                }
                var61 += 2;
                var58 = var64;
                var59 = var65;
            }
            for (int var62 = var58; var62 < 128; var62++) {
                this.field6230[var62] = (byte) (this.field6230[var62] * var59 + 32 >> 6);
            }
            Object var63 = null;
        }
        if (var23 != null) {
            int var69 = var2.method1342((byte) -126);
            var23[0] = (byte) var69;
            for (int var70 = 2; var70 < var23.length; var70 += 2) {
                var69 -= -var2.method1342((byte) -126) - 1;
                var23[var70] = (byte) var69;
            }
            byte var71 = var23[0];
            int var72 = var23[1] << 1;
            for (int var73 = 0; var73 < var71; var73++) {
                int var84 = (this.field6234[var73] & 0xFF) + var72;
                if (var84 < 0) {
                    var84 = 0;
                }
                if (var84 > 128) {
                    var84 = 128;
                }
                this.field6234[var73] = (byte) var84;
            }
            int var74 = 2;
            while (var23.length > var74) {
                byte var78 = var23[var74];
                int var79 = var23[var74 + 1] << 1;
                int var80 = (var78 - var71) / 2 + (var78 - var71) * var72;
                for (int var81 = var71; var81 < var78; var81++) {
                    int var82 = class95.method514(12800, var80, var78 - var71);
                    int var83 = (this.field6234[var81] & 0xFF) + var82;
                    if (var83 < 0) {
                        var83 = 0;
                    }
                    if (var83 > 128) {
                        var83 = 128;
                    }
                    var80 += var79 - var72;
                    this.field6234[var81] = (byte) var83;
                }
                var71 = var78;
                var74 += 2;
                var72 = var79;
            }
            Object var75 = null;
            for (int var76 = var71; var76 < 128; var76++) {
                int var77 = (this.field6234[var76] & 0xFF) + var72;
                if (var77 < 0) {
                    var77 = 0;
                }
                if (var77 > 128) {
                    var77 = 128;
                }
                this.field6234[var76] = (byte) var77;
            }
        }
        for (int var85 = 0; var85 < var15; var85++) {
            var18[var85].field884 = var2.method1342((byte) -127);
        }
        for (int var86 = 0; var86 < var15; var86++) {
            class78 var92 = var18[var86];
            if (var92.field879 != null) {
                var92.field886 = var2.method1342((byte) -127);
            }
            if (var92.field877 != null) {
                var92.field888 = var2.method1342((byte) -128);
            }
            if (var92.field884 > 0) {
                var92.field881 = var2.method1342((byte) -128);
            }
        }
        for (int var87 = 0; var87 < var15; var87++) {
            var18[var87].field878 = var2.method1342((byte) -127);
        }
        for (int var88 = 0; var88 < var15; var88++) {
            class78 var91 = var18[var88];
            if (var91.field878 > 0) {
                var91.field882 = var2.method1342((byte) -128);
            }
        }
        for (int var89 = 0; var89 < var15; var89++) {
            class78 var90 = var18[var89];
            if (var90.field882 > 0) {
                var90.field871 = var2.method1342((byte) -127);
            }
        }
    }
}
