import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class560 {

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    public int field8322 = -1;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field8314;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field8321;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    private int field8325;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "J")
    private long field8323;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "J")
    private long field8327;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "Liaa;")
    public static class423 field8329;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "Z")
    public boolean field8324;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "[I")
    public int[] field8313;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[I")
    private int[] field8318;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "[[I")
    private int[][] field8331;

    static {
        new class572("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
        field8328 = 0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZB)V", line = 7)
    public final void method3367(boolean arg0, byte arg1) {
        field8330++;
        if (arg1 < 111) {
            method3370(null, null, 44);
        }
        this.field8324 = arg0;
        this.method3372(-18675);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(III)V", line = 19)
    public final void method3368(int arg0, int arg1, int arg2) {
        this.field8313[arg1] = arg2;
        field8311++;
        this.method3372(-18675);
        if (arg0 != 11691) {
            this.field8323 = -110L;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lop;Lnc;Ltt;I[Laea;IIIZIILqa;Ltt;Las;Ljn;Lbo;Lht;BI)Lr;", line = 41)
    public final class159 method3369(class163 arg0, class23 arg1, class78 arg2, int arg3, class46[] arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, class208 arg11, class78 arg12, class134 arg13, class614 arg14, class623 arg15, class499 arg16, byte arg17, int arg18) {
        field8326++;
        if (this.field8322 != -1) {
            return arg0.method1177(this.field8322, false).method647(arg9, arg7, arg4, arg10, arg2, arg6, arg13, arg18, arg12, arg3, -17811, arg16, arg11, arg5, arg1);
        }
        int var20 = arg9;
        long var21 = this.field8323;
        int[] var23 = this.field8318;
        if (arg17 < 1) {
            this.method3368(23, 83, 7);
        }
        if (arg2 != null && (arg2.field1038 >= 0 || arg2.field1051 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field8318[var24];
            }
            if (arg2.field1038 >= 0) {
                if (arg2.field1038 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class473.method2847(arg2.field1038, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg2.field1051 >= 0) {
                if (arg2.field1051 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class473.method2847(1073741824, arg2.field1051);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg2 != null || arg12 != null;
        int var29 = arg4 == null ? 0 : arg4.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class102.field1478[var30] = null;
            if (arg4[var30] != null) {
                class78 var31 = arg16.method2983(arg4[var30].field554, -119);
                if (var31.field1035 != null) {
                    class66.field808[var30] = var31;
                    var28 = true;
                    int var32 = arg4[var30].field551;
                    int var33 = arg4[var30].field547;
                    int var34 = var31.field1035[var32];
                    class102.field1478[var30] = arg16.method2982(var34 >>> 16, -118);
                    int var35 = var34 & 0xFFFF;
                    class506.field7157[var30] = var35;
                    if (class102.field1478[var30] != null) {
                        var26 |= class102.field1478[var30].method786(true, var35);
                        var25 |= class102.field1478[var30].method782(var35, -126);
                        var27 |= class102.field1478[var30].method780(var35, true);
                    }
                    if ((var31.field1048 || class638.field9309) && var33 != -1 && var33 < var31.field1035.length) {
                        class480.field6816[var30] = var31.field1049[var32];
                        class239.field3444[var30] = arg4[var30].field558;
                        int var36 = var31.field1035[var33];
                        class600.field8857[var30] = arg16.method2982(var36 >>> 16, -115);
                        int var37 = var36 & 0xFFFF;
                        class44.field529[var30] = var37;
                        if (class600.field8857[var30] != null) {
                            var26 |= class600.field8857[var30].method786(true, var37);
                            var25 |= class600.field8857[var30].method782(var37, 16);
                            var27 |= class600.field8857[var30].method780(var37, true);
                        }
                    } else {
                        class480.field6816[var30] = 0;
                        class239.field3444[var30] = 0;
                        class600.field8857[var30] = null;
                        class44.field529[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class106 var41 = null;
        class106 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class106 var46 = null;
        class106 var47 = null;
        if (var28) {
            var20 = arg9 | 0x20;
            if (arg2 != null) {
                int var48 = arg2.field1035[arg3];
                int var49 = var48 >>> 16;
                var41 = arg16.method2982(var49, -112);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method786(true, var38);
                    var25 |= var41.method782(var38, -128);
                    var27 |= var41.method780(var38, true);
                }
                if ((arg2.field1048 || class638.field9309) && arg18 != -1 && arg18 < arg2.field1035.length) {
                    var40 = arg2.field1049[arg3];
                    int var50 = arg2.field1035[arg18];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg16.method2982(var51, 114);
                    if (var42 != null) {
                        var26 |= var42.method786(true, var39);
                        var25 |= var42.method782(var39, -125);
                        var27 |= var42.method780(var39, true);
                    }
                }
            }
            if (arg12 != null) {
                int var52 = arg12.field1035[arg7];
                int var53 = var52 >>> 16;
                var46 = arg16.method2982(var53, -112);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method786(true, var43);
                    var25 |= var46.method782(var43, 32);
                    var27 |= var46.method780(var43, true);
                }
                if ((arg12.field1048 || class638.field9309) && arg6 != -1 && arg6 < arg12.field1035.length) {
                    var45 = arg12.field1049[arg7];
                    int var54 = arg12.field1035[arg6];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg16.method2982(var55, -31);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method786(true, var44);
                        var25 |= var47.method782(var44, -125);
                        var27 |= var47.method780(var44, true);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class117 var56 = class236.field3411;
        class159 var57;
        synchronized (class236.field3411) {
            var57 = (class159) class236.field3411.method842(0, var21);
        }
        class226 var58 = null;
        if (this.field8325 != -1) {
            var58 = arg13.method921(32, this.field8325);
        }
        if (var57 == null || arg11.method528(var57.method90(), var20) != 0 || var58 != null && var58.field3306 != null && this.field8331 == null) {
            if (var57 != null) {
                var20 = arg11.method478(var20, var57.method90());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg15.method3639((byte) 106, var62 & 0x3FFFFFFF).method1909((byte) 87)) {
                        var60 = true;
                    }
                } else if (!arg14.method3606((byte) -99, var62 & 0x3FFFFFFF).method3275((byte) -102, this.field8324)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field8327 != -1L) {
                    class117 var88 = class236.field3411;
                    synchronized (class236.field3411) {
                        var57 = (class159) class236.field3411.method842(0, this.field8327);
                    }
                }
                if (var57 == null || arg11.method528(var57.method90(), var20) != 0 || var58 != null && var58.field3306 != null && this.field8331 == null) {
                    return null;
                }
            } else {
                class451[] var63 = new class451[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class451 var67 = arg14.method3606((byte) -100, var65 & 0x3FFFFFFF).method3273(this.field8324, 2);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    } else if ((var65 & Integer.MIN_VALUE) != 0) {
                        class451 var66 = arg15.method3639((byte) 106, var65 & 0x3FFFFFFF).method1904((byte) 107);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    }
                }
                if (var58 != null && var58.field3306 != null) {
                    for (int var68 = 0; var68 < var58.field3306.length; var68++) {
                        if (var58.field3306[var68] != null && var63[var68] != null) {
                            int var69 = var58.field3306[var68][0];
                            int var70 = var58.field3306[var68][1];
                            int var71 = var58.field3306[var68][2];
                            int var72 = var58.field3306[var68][3] << 3;
                            int var73 = var58.field3306[var68][4] << 3;
                            int var74 = var58.field3306[var68][5] << 3;
                            if (this.field8331 == null) {
                                this.field8331 = new int[var58.field3306.length][];
                            }
                            if (this.field8331[var68] == null) {
                                int[] var75 = this.field8331[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[13] = -var70;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[14] = -var71;
                                    var75[12] = -var69;
                                } else {
                                    int var76 = class589.field8735[var72];
                                    int var77 = class589.field8742[var72];
                                    int var78 = class589.field8735[var73];
                                    int var79 = class589.field8742[var73];
                                    int var80 = class589.field8735[var74];
                                    int var81 = class589.field8742[var74];
                                    int var82 = var77 * var80 + 16384 >> 15;
                                    int var83 = var77 * var81 + 16384 >> 15;
                                    var75[6] = -var79 * var80 + (var78 * var83) + 16384 >> 15;
                                    var75[7] = -var79 * -var81 + var78 * var82 + 16384 >> 15;
                                    var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                    var75[8] = var76 * var78 + 16384 >> 15;
                                    var75[2] = var76 * var79 + 16384 >> 15;
                                    var75[4] = var76 * var80 + 16384 >> 15;
                                    var75[3] = var76 * var81 + 16384 >> 15;
                                    var75[5] = -var77;
                                    var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                    var75[12] = var75[3] * -var70 + var75[0] * -var69 + (var75[6] * -var71) + 16384 >> 15;
                                    var75[13] = var75[7] * -var71 + var75[1] * -var69 + var75[4] * -var70 + 16384 >> 15;
                                    var75[14] = var75[2] * -var69 + var75[5] * -var70 + (var75[8] * -var71) + 16384 >> 15;
                                }
                                var75[10] = var70;
                                var75[9] = var69;
                                var75[11] = var71;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method2732(var72, var74, -30260, var73);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method2727(var69, var71, (byte) 44, var70);
                            }
                        }
                    }
                }
                class451 var84 = new class451(var63, var63.length);
                int var85 = var20 | 0x4000;
                var57 = arg11.method491(var84, var85, class55.field655, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    if (this.field8313[var86] < class80.field1072[var86].length) {
                        var57.method95(class230.field3372[var86], class80.field1072[var86][this.field8313[var86]]);
                    }
                    if (this.field8313[var86] < class388.field5347[var86].length) {
                        var57.method95(class102.field1474[var86], class388.field5347[var86][this.field8313[var86]]);
                    }
                }
                if (arg8) {
                    var57.method79(var20);
                    class117 var87 = class236.field3411;
                    synchronized (class236.field3411) {
                        class236.field3411.method835((byte) 120, var21, var57);
                    }
                    this.field8327 = var21;
                }
            }
        }
        class159 var89 = var57.method94((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class102.field1478[var90] != null) {
                var89.method1143(var91, class102.field1478[var90], class44.field529[var90], this.field8331 == null ? null : this.field8331[var90], 0, class239.field3444[var90] - 1, class600.field8857[var90], class480.field6816[var90], false, true, class506.field7157[var90]);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method1139(var42, var41, var38, var46, false, var43, -128, arg5 - 1, var40, arg2.field1034, var39, var45, var47, arg10 - 1, var44);
        } else if (var41 != null) {
            var89.method1142(var41, var42, var40, var39, 0, var38, -32238, arg10 - 1, false);
        } else if (var46 != null) {
            var89.method1142(var46, var47, var45, var44, 0, var43, -32238, arg5 - 1, false);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class102.field1478[var92] = null;
            class600.field8857[var92] = null;
            class66.field808[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lte;[Lwe;I)Lgda;", line = 547)
    public static final class49 method3370(class527 arg0, class346[] arg1, int arg2) {
        field8315++;
        int var3 = 0;
        if (arg2 > -28) {
            return null;
        }
        while (var3 < arg1.length) {
            if (arg1[var3] == null || arg1[var3].field4752 <= 0L) {
                return null;
            }
            var3++;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field4752);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class361.field4903, 0);
        if (class361.field4903[0] == 0) {
            if (class361.field4903[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class361.field4903, 1);
            if (class361.field4903[1] > 1) {
                byte[] var7 = new byte[class361.field4903[1]];
                OpenGL.glGetInfoLogARB(var4, class361.field4903[1], class361.field4903, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class361.field4903[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field4752);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class49(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([I[IIZII)V", line = 615)
    public final void method3371(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.field8324 = arg3;
        this.field8313 = arg0;
        this.field8318 = arg1;
        field8314++;
        if (this.field8325 != arg4) {
            this.field8331 = null;
            this.field8325 = arg4;
        }
        this.field8322 = arg2;
        this.method3372(-18675);
        if (arg5 >= -80) {
            method3375(-101, (byte) 42, -114);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)V", line = 641)
    private final void method3372(int arg0) {
        field8316++;
        long[] var2 = class599.field8835;
        this.field8323 = -1L;
        if (arg0 != -18675) {
            this.method3372(-126);
        }
        this.field8323 = this.field8323 >>> 8 ^ var2[(int) (((long) (this.field8325 >> 8) ^ this.field8323) & 0xFFL)];
        this.field8323 = var2[(int) (((long) this.field8325 ^ this.field8323) & 0xFFL)] ^ this.field8323 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field8323 = this.field8323 >>> 8 ^ var2[(int) ((this.field8323 ^ (long) (this.field8318[var3] >> 24)) & 0xFFL)];
            this.field8323 = var2[(int) (((long) (this.field8318[var3] >> 16) ^ this.field8323) & 0xFFL)] ^ this.field8323 >>> 8;
            this.field8323 = var2[(int) (((long) (this.field8318[var3] >> 8) ^ this.field8323) & 0xFFL)] ^ this.field8323 >>> 8;
            this.field8323 = this.field8323 >>> 8 ^ var2[(int) (((long) this.field8318[var3] ^ this.field8323) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field8323 = var2[(int) ((this.field8323 ^ (long) this.field8313[var4]) & 0xFFL)] ^ this.field8323 >>> 8;
        }
        this.field8323 = this.field8323 >>> 8 ^ var2[(int) (((long) (this.field8324 ? 1 : 0) ^ this.field8323) & 0xFFL)];
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IIILht;ILtt;ILqa;Lbo;III)Lr;", line = 678)
    public final class159 method3373(int arg0, int arg1, int arg2, class499 arg3, int arg4, class78 arg5, int arg6, class208 arg7, class623 arg8, int arg9, int arg10, int arg11) {
        field8317++;
        if (arg1 != -1) {
            this.field8318 = null;
        }
        int var13 = arg9;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg5.field1035[arg6];
            Object var22 = null;
            var13 = arg9 | 0x20;
            int var23 = var21 >>> 16;
            class106 var24 = arg3.method2982(var23, 114);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method786(true, var25);
                var14 |= var24.method782(var25, arg1 + 94);
                var17 |= var24.method780(var25, true);
                var16 |= arg5.field1052;
            }
            if ((arg5.field1048 || class638.field9309) && arg10 != -1 && arg5.field1035.length > arg10) {
                int var26 = arg5.field1035[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class106 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg3.method2982(var28 >>> 16, arg1 ^ 0x7A);
                }
                if (var29 != null) {
                    var15 |= var29.method786(true, var28);
                    var14 |= var29.method782(var28, arg1 + 19);
                    var17 |= var29.method780(var28, true);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) (arg11 << 16) | (long) arg4 << 32 | (long) arg2;
        class117 var32 = class120.field1690;
        class159 var33;
        synchronized (class120.field1690) {
            var33 = (class159) class120.field1690.method842(arg1 + 1, var30);
        }
        if (var33 == null || arg7.method528(var33.method90(), var13) != 0) {
            if (var33 != null) {
                var13 = arg7.method478(var13, var33.method90());
            }
            class451[] var35 = new class451[3];
            int var36 = 0;
            if (!arg8.method3639((byte) 106, arg2).method1910(~arg1) || !arg8.method3639((byte) 106, arg11).method1910(0) || !arg8.method3639((byte) 106, arg4).method1910(0)) {
                return null;
            }
            class451 var37 = arg8.method3639((byte) 106, arg2).method1905(true);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class451 var38 = arg8.method3639((byte) 106, arg11).method1905(true);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class451 var39 = arg8.method3639((byte) 106, arg4).method1905(true);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class451 var41 = new class451(var35, var36);
            var33 = arg7.method491(var41, var40, class55.field655, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class80.field1072[var42].length > this.field8313[var42]) {
                    var33.method95(class230.field3372[var42], class80.field1072[var42][this.field8313[var42]]);
                }
                if (this.field8313[var42] < class388.field5347[var42].length) {
                    var33.method95(class102.field1474[var42], class388.field5347[var42][this.field8313[var42]]);
                }
            }
            var33.method79(var13);
            class117 var43 = class120.field1690;
            synchronized (class120.field1690) {
                class120.field1690.method835((byte) 124, var30, var33);
            }
        }
        if (arg5 == null) {
            return var33;
        } else {
            class159 var44 = var33.method94((byte) 4, var13, true);
            return arg5.method597(arg10, arg9, var44, arg6, 119, arg0);
        }
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 835)
    public static void method3374(int arg0) {
        field8329 = null;
        if (arg0 != 26755) {
            field8329 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IBI)Z", line = 849)
    public static final boolean method3375(int arg0, byte arg1, int arg2) {
        if (arg1 > -70) {
            method3375(-121, (byte) 117, 58);
        }
        field8319++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lop;ILjn;Lqa;Lbo;Lht;Lnc;IIILtt;I)Lr;", line = 861)
    public final class159 method3376(class163 arg0, int arg1, class614 arg2, class208 arg3, class623 arg4, class499 arg5, class23 arg6, int arg7, int arg8, int arg9, class78 arg10, int arg11) {
        field8320++;
        if (this.field8322 != -1) {
            return arg0.method1177(this.field8322, false).method648(arg1, 0, arg6, arg7, arg11, arg5, arg3, arg8, arg10);
        }
        int var13 = arg1;
        if (arg10 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg1 | 0x20;
            int var21 = arg10.field1035[arg7];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class106 var24 = arg5.method2982(var23, -128);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method786(true, var25);
                var14 |= var24.method782(var25, 6);
                var17 |= var24.method780(var25, true);
                var16 |= arg10.field1052;
            }
            if ((arg10.field1048 || class638.field9309) && arg11 != -1 && arg11 < arg10.field1035.length) {
                int var26 = arg10.field1035[arg11];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class106 var29 = var23 == var27 ? var24 : arg5.method2982(var27, 6);
                if (var29 != null) {
                    var15 |= var29.method786(true, var28);
                    var14 |= var29.method782(var28, -128);
                    var17 |= var29.method780(var28, true);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
            if (var17) {
                var13 |= 0x400;
            }
        }
        class117 var30 = class120.field1690;
        class159 var31;
        synchronized (class120.field1690) {
            var31 = (class159) class120.field1690.method842(0, this.field8323);
        }
        if (arg9 > -20) {
            return null;
        }
        if (var31 == null || arg3.method528(var31.method90(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method478(var13, var31.method90());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field8318[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg4.method3639((byte) 106, var35 & 0x3FFFFFFF).method1910(0)) {
                        var33 = true;
                    }
                } else if (!arg2.method3606((byte) -8, var35 & 0x3FFFFFFF).method3271(true, this.field8324)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class451[] var36 = new class451[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field8318[var38];
                if ((var39 & 0x40000000) != 0) {
                    class451 var40 = arg2.method3606((byte) -7, var39 & 0x3FFFFFFF).method3274(0, this.field8324);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class451 var41 = arg4.method3639((byte) 106, var39 & 0x3FFFFFFF).method1905(true);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class451 var42 = new class451(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg3.method491(var42, var43, class55.field655, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field8313[var44] < class80.field1072[var44].length) {
                    var31.method95(class230.field3372[var44], class80.field1072[var44][this.field8313[var44]]);
                }
                if (this.field8313[var44] < class388.field5347[var44].length) {
                    var31.method95(class102.field1474[var44], class388.field5347[var44][this.field8313[var44]]);
                }
            }
            var31.method79(var13);
            class117 var45 = class120.field1690;
            synchronized (class120.field1690) {
                class120.field1690.method835((byte) 119, this.field8323, var31);
            }
        }
        if (arg10 == null) {
            return var31;
        } else {
            var31.method94((byte) 4, var13, true);
            return arg10.method597(arg11, arg1, var31, arg7, 68, arg8);
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lbo;III)V", line = 1058)
    public final void method3377(class623 arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= -20) {
            this.method3373(-64, 94, -81, null, 92, null, 33, null, null, 66, 15, 83);
        }
        field8321++;
        int var5 = class395.field5427[arg1];
        if (this.field8318[var5] != 0 && arg0.method3639((byte) 106, arg2) != null) {
            this.field8318[var5] = class473.method2847(Integer.MIN_VALUE, arg2);
            this.method3372(-18675);
        }
    }
}
