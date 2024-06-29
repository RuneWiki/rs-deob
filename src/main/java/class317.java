import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class317 extends class578 {

    @OriginalMember(owner = "client!hea", name = "s", descriptor = "[I")
    private int[] field4345;

    @OriginalMember(owner = "client!hea", name = "i", descriptor = "[B")
    public byte[] field4336;

    @OriginalMember(owner = "client!hea", name = "u", descriptor = "[Lvfa;")
    public class313[] field4337;

    @OriginalMember(owner = "client!hea", name = "j", descriptor = "[Lq;")
    public class235[] field4341;

    @OriginalMember(owner = "client!hea", name = "n", descriptor = "[B")
    public byte[] field4334;

    @OriginalMember(owner = "client!hea", name = "k", descriptor = "[S")
    public short[] field4340;

    @OriginalMember(owner = "client!hea", name = "q", descriptor = "[B")
    public byte[] field4339;

    @OriginalMember(owner = "client!hea", name = "v", descriptor = "I")
    public int field4343;

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4348 = new String[] { method2523(method2522("\u0001Y+\u001dU")), method2523(method2522("\u0012\u0012d\u001djR")), method2523(method2522("\u0014\u0002i_")), method2523(method2522("\u0012\u0012d\u001dkR")), method2523(method2522("\u0012\u0012d\u001d\u0014\u0013\u0019lG\u0016R")), method2523(method2522("\u0012\u0012d\u001diR")) };

    @OriginalMember(owner = "client!hea", name = "p", descriptor = "Lmv;")
    public static class125 field4342 = new class125(64, -1);

    @OriginalMember(owner = "client!hea", name = "r", descriptor = "Lvs;")
    public static class470 field4344 = new class470();

    @OriginalMember(owner = "client!hea", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4346 = new BigInteger(method2523(method2522("BN6UN\u001b\u0011<\u0005\u0018JEd\u0001K\u001eO2\u0003LLB=\u0001\u001cJA7UMI\u00144\u0003N\u0018\u0012=QIID3U\u001d\u001c\u00126\u0002\u001f\u001e\u0014d\u000b\u0011\u0018\u0012a\u0001NC\u0012g\u0005\u001dJ\u0014=R\u0019BD1\u0003KIA0\u0003MCN4\u0005I\u0019N`PJJG3\u0005IMD0\nKKO=\u0004\u001dINd\u0004\u0018IOg\u0007\u001fOC0UN\u001cO7Q\u001d\u0019Dg")), 16);

    @OriginalMember(owner = "client!hea", name = "l", descriptor = "Lmv;")
    public static class125 field4347 = new class125(16, 11);

    @OriginalMember(owner = "client!hea", name = "m", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!hea", name = "t", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "(I)V", line = 3)
    public final void method2519(int arg0) {
        try {
            if (arg0 > -18) {
                this.field4341 = null;
            }
            field4338++;
            this.field4345 = null;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field4348[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V", line = 16)
    public static void method2520(int arg0) {
        try {
            field4347 = null;
            field4342 = null;
            field4346 = null;
            if (arg0 == 2) {
                field4344 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4348[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "([I[BBLiv;)Z", line = 43)
    public final boolean method2521(int[] arg0, byte[] arg1, byte arg2, class204 arg3) {
        try {
            field4335++;
            boolean var5 = true;
            int var6 = -103 % ((arg2 + 23) / 59);
            int var7 = 0;
            class313 var8 = null;
            for (int var9 = 0; var9 < 128; var9++) {
                if (arg1 == null || arg1[var9] != 0) {
                    int var10 = this.field4345[var9];
                    if (var10 != 0) {
                        if (var7 != var10) {
                            var7 = var10--;
                            if ((var10 & 0x1) == 0) {
                                var8 = arg3.method1749(arg0, (byte) -97, var10 >> 2);
                            } else {
                                var8 = arg3.method1746(var10 >> 2, arg0, 0);
                            }
                            if (var8 == null) {
                                var5 = false;
                            }
                        }
                        if (var8 != null) {
                            this.field4337[var9] = var8;
                            this.field4345[var9] = 0;
                        }
                    }
                }
            }
            return var5;
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field4348[1] + (arg0 == null ? field4348[2] : field4348[0]) + ',' + (arg1 == null ? field4348[2] : field4348[0]) + ',' + arg2 + ',' + (arg3 == null ? field4348[2] : field4348[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "()V", line = 106)
    public class317() {
    }

    @OriginalMember(owner = "client!hea", name = "<init>", descriptor = "([B)V", line = 108)
    public class317(byte[] arg0) {
        try {
            this.field4345 = new int[128];
            this.field4336 = new byte[128];
            this.field4337 = new class313[128];
            this.field4341 = new class235[128];
            this.field4334 = new byte[128];
            this.field4340 = new short[128];
            this.field4339 = new byte[128];
            class711 var2 = new class711(arg0);
            int var3;
            for (var3 = 0; var2.field9996[var2.field9945 + var3] != 0; var3++) {
            }
            byte[] var4 = new byte[var3];
            for (int var5 = 0; var5 < var3; var5++) {
                var4[var5] = var2.method5125((byte) 121);
            }
            var2.field9945++;
            var3++;
            int var6 = var2.field9945;
            var2.field9945 += var3;
            int var7;
            for (var7 = 0; var2.field9996[var2.field9945 + var7] != 0; var7++) {
            }
            byte[] var8 = new byte[var7];
            for (int var9 = 0; var9 < var7; var9++) {
                var8[var9] = var2.method5125((byte) -43);
            }
            var7++;
            var2.field9945++;
            int var10 = var2.field9945;
            var2.field9945 += var7;
            int var11;
            for (var11 = 0; var2.field9996[var2.field9945 + var11] != 0; var11++) {
            }
            byte[] var12 = new byte[var11];
            for (int var13 = 0; var13 < var11; var13++) {
                var12[var13] = var2.method5125((byte) -105);
            }
            var2.field9945++;
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
                    int var18 = var2.method5128(0);
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
            class235[] var19 = new class235[var15];
            for (int var20 = 0; var20 < var19.length; var20++) {
                class235 var21 = var19[var20] = new class235();
                int var22 = var2.method5128(0);
                if (var22 > 0) {
                    var21.field3388 = new byte[var22 * 2];
                }
                int var23 = var2.method5128(0);
                if (var23 > 0) {
                    var21.field3386 = new byte[var23 * 2 + 2];
                    var21.field3386[1] = 64;
                }
            }
            int var24 = var2.method5128(0);
            byte[] var25 = var24 <= 0 ? null : new byte[var24 * 2];
            int var26 = var2.method5128(0);
            byte[] var27 = var26 <= 0 ? null : new byte[var26 * 2];
            int var28;
            for (var28 = 0; var2.field9996[var2.field9945 + var28] != 0; var28++) {
            }
            byte[] var29 = new byte[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                var29[var30] = var2.method5125((byte) -21);
            }
            var28++;
            var2.field9945++;
            int var31 = 0;
            for (int var32 = 0; var32 < 128; var32++) {
                var31 += var2.method5128(0);
                this.field4340[var32] = (short) var31;
            }
            int var33 = 0;
            for (int var34 = 0; var34 < 128; var34++) {
                var33 += var2.method5128(0);
                this.field4340[var34] = (short) (this.field4340[var34] + (var33 << 8));
            }
            int var35 = 0;
            int var36 = 0;
            int var37 = 0;
            for (int var38 = 0; var38 < 128; var38++) {
                if (var35 == 0) {
                    if (var29.length <= var36) {
                        var35 = -1;
                    } else {
                        var35 = var29[var36++];
                    }
                    var37 = var2.method5139(false);
                }
                this.field4340[var38] = (short) (this.field4340[var38] + class434.method3377(32768, var37 - 1 << 14));
                this.field4345[var38] = var37;
                var35--;
            }
            int var39 = 0;
            int var40 = 0;
            int var41 = 0;
            for (int var42 = 0; var42 < 128; var42++) {
                if (this.field4345[var42] != 0) {
                    if (var39 == 0) {
                        if (var40 >= var4.length) {
                            var39 = -1;
                        } else {
                            var39 = var4[var40++];
                        }
                        var41 = var2.field9996[var6++] - 1;
                    }
                    this.field4339[var42] = (byte) var41;
                    var39--;
                }
            }
            int var43 = 0;
            int var44 = 0;
            int var45 = 0;
            for (int var46 = 0; var46 < 128; var46++) {
                if (this.field4345[var46] != 0) {
                    if (var44 == 0) {
                        if (var8.length <= var43) {
                            var44 = -1;
                        } else {
                            var44 = var8[var43++];
                        }
                        var45 = var2.field9996[var10++] + 16 << 2;
                    }
                    this.field4336[var46] = (byte) var45;
                    var44--;
                }
            }
            int var47 = 0;
            int var48 = 0;
            class235 var49 = null;
            for (int var50 = 0; var50 < 128; var50++) {
                if (this.field4345[var50] != 0) {
                    if (var48 == 0) {
                        var49 = var19[var14[var47]];
                        if (var47 < var12.length) {
                            var48 = var12[var47++];
                        } else {
                            var48 = -1;
                        }
                    }
                    this.field4341[var50] = var49;
                    var48--;
                }
            }
            int var51 = 0;
            int var52 = 0;
            int var53 = 0;
            for (int var54 = 0; var54 < 128; var54++) {
                if (var51 == 0) {
                    if (var52 < var29.length) {
                        var51 = var29[var52++];
                    } else {
                        var51 = -1;
                    }
                    if (this.field4345[var54] > 0) {
                        var53 = var2.method5128(0) + 1;
                    }
                }
                this.field4334[var54] = (byte) var53;
                var51--;
            }
            this.field4343 = var2.method5128(0) + 1;
            for (int var55 = 0; var55 < var15; var55++) {
                class235 var56 = var19[var55];
                if (var56.field3388 != null) {
                    for (int var57 = 1; var57 < var56.field3388.length; var57 += 2) {
                        var56.field3388[var57] = var2.method5125((byte) -91);
                    }
                }
                if (var56.field3386 != null) {
                    for (int var58 = 3; var58 < var56.field3386.length - 2; var58 += 2) {
                        var56.field3386[var58] = var2.method5125((byte) -88);
                    }
                }
            }
            if (var25 != null) {
                for (int var59 = 1; var59 < var25.length; var59 += 2) {
                    var25[var59] = var2.method5125((byte) 103);
                }
            }
            if (var27 != null) {
                for (int var60 = 1; var60 < var27.length; var60 += 2) {
                    var27[var60] = var2.method5125((byte) -58);
                }
            }
            for (int var61 = 0; var61 < var15; var61++) {
                class235 var62 = var19[var61];
                if (var62.field3386 != null) {
                    int var63 = 0;
                    for (int var64 = 2; var64 < var62.field3386.length; var64 += 2) {
                        var63 = var2.method5128(0) + var63 + 1;
                        var62.field3386[var64] = (byte) var63;
                    }
                }
            }
            for (int var65 = 0; var65 < var15; var65++) {
                class235 var66 = var19[var65];
                if (var66.field3388 != null) {
                    int var67 = 0;
                    for (int var68 = 2; var68 < var66.field3388.length; var68 += 2) {
                        var67 = (var67 + var2.method5128(0)) + 1;
                        var66.field3388[var68] = (byte) var67;
                    }
                }
            }
            if (var25 != null) {
                int var69 = var2.method5128(0);
                var25[0] = (byte) var69;
                for (int var70 = 2; var70 < var25.length; var70 += 2) {
                    var69 = var2.method5128(0) + var69 + 1;
                    var25[var70] = (byte) var69;
                }
                byte var71 = var25[0];
                byte var72 = var25[1];
                for (int var73 = 0; var73 < var71; var73++) {
                    this.field4334[var73] = (byte) (this.field4334[var73] * var72 + 32 >> 6);
                }
                for (int var74 = 2; var74 < var25.length; var74 += 2) {
                    byte var75 = var25[var74];
                    byte var76 = var25[var74 + 1];
                    int var77 = (var75 - var71) / 2 + (var75 - var71) * var72;
                    for (int var78 = var71; var78 < var75; var78++) {
                        int var79 = class655.method4756(var77, var75 - var71, 28);
                        this.field4334[var78] = (byte) (this.field4334[var78] * var79 + 32 >> 6);
                        var77 += var76 - var72;
                    }
                    var72 = var76;
                    var71 = var75;
                }
                Object var80 = null;
                for (int var81 = var71; var81 < 128; var81++) {
                    this.field4334[var81] = (byte) (this.field4334[var81] * var72 + 32 >> 6);
                }
            }
            if (var27 != null) {
                int var82 = var2.method5128(0);
                var27[0] = (byte) var82;
                for (int var83 = 2; var83 < var27.length; var83 += 2) {
                    var82 += var2.method5128(0) + 1;
                    var27[var83] = (byte) var82;
                }
                byte var84 = var27[0];
                int var85 = var27[1] << 1;
                for (int var86 = 0; var86 < var84; var86++) {
                    int var87 = (this.field4336[var86] & 0xFF) + var85;
                    if (var87 < 0) {
                        var87 = 0;
                    }
                    if (var87 > 128) {
                        var87 = 128;
                    }
                    this.field4336[var86] = (byte) var87;
                }
                int var88 = 2;
                while (var88 < var27.length) {
                    byte var89 = var27[var88];
                    int var90 = var27[var88 + 1] << 1;
                    int var91 = (var89 - var84) / 2 + (var89 - var84) * var85;
                    for (int var92 = var84; var92 < var89; var92++) {
                        int var93 = class655.method4756(var91, var89 - var84, -117);
                        int var94 = (this.field4336[var92] & 0xFF) + var93;
                        if (var94 < 0) {
                            var94 = 0;
                        }
                        if (var94 > 128) {
                            var94 = 128;
                        }
                        var91 += var90 - var85;
                        this.field4336[var92] = (byte) var94;
                    }
                    var88 += 2;
                    var84 = var89;
                    var85 = var90;
                }
                Object var95 = null;
                for (int var96 = var84; var96 < 128; var96++) {
                    int var97 = (this.field4336[var96] & 0xFF) + var85;
                    if (var97 < 0) {
                        var97 = 0;
                    }
                    if (var97 > 128) {
                        var97 = 128;
                    }
                    this.field4336[var96] = (byte) var97;
                }
            }
            for (int var98 = 0; var98 < var15; var98++) {
                var19[var98].field3392 = var2.method5128(0);
            }
            for (int var99 = 0; var99 < var15; var99++) {
                class235 var100 = var19[var99];
                if (var100.field3388 != null) {
                    var100.field3390 = var2.method5128(0);
                }
                if (var100.field3386 != null) {
                    var100.field3394 = var2.method5128(0);
                }
                if (var100.field3392 > 0) {
                    var100.field3397 = var2.method5128(0);
                }
            }
            for (int var101 = 0; var101 < var15; var101++) {
                var19[var101].field3393 = var2.method5128(0);
            }
            for (int var102 = 0; var102 < var15; var102++) {
                class235 var103 = var19[var102];
                if (var103.field3393 > 0) {
                    var103.field3387 = var2.method5128(0);
                }
            }
            for (int var104 = 0; var104 < var15; var104++) {
                class235 var105 = var19[var104];
                if (var105.field3387 > 0) {
                    var105.field3395 = var2.method5128(0);
                }
            }
        } catch (RuntimeException var107) {
            throw class665.method4799(var107, field4348[4] + (arg0 == null ? field4348[2] : field4348[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2522(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x28);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hea", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2523(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 122;
                    break;
                case 1:
                    var10005 = 119;
                    break;
                case 2:
                    var10005 = 5;
                    break;
                case 3:
                    var10005 = 51;
                    break;
                default:
                    var10005 = 40;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
