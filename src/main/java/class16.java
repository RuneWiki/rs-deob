import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class16 extends class110 {

    @OriginalMember(owner = "client!be", name = "gb", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "client!be", name = "Qb", descriptor = "I")
    public int field322 = 0;

    @OriginalMember(owner = "client!be", name = "sb", descriptor = "I")
    public int field298 = 0;

    @OriginalMember(owner = "client!be", name = "ab", descriptor = "B")
    public byte field280 = 0;

    @OriginalMember(owner = "client!be", name = "Nb", descriptor = "I")
    public int field319;

    @OriginalMember(owner = "client!be", name = "bb", descriptor = "[I")
    public int[] field281;

    @OriginalMember(owner = "client!be", name = "Kb", descriptor = "[I")
    public int[] field316;

    @OriginalMember(owner = "client!be", name = "Lb", descriptor = "[I")
    public int[] field317;

    @OriginalMember(owner = "client!be", name = "Gb", descriptor = "[I")
    private int[] field312;

    @OriginalMember(owner = "client!be", name = "Tb", descriptor = "[I")
    public int[] field325;

    @OriginalMember(owner = "client!be", name = "jb", descriptor = "[I")
    public int[] field289;

    @OriginalMember(owner = "client!be", name = "Ob", descriptor = "[I")
    public int[] field320;

    @OriginalMember(owner = "client!be", name = "Fb", descriptor = "[B")
    public byte[] field311;

    @OriginalMember(owner = "client!be", name = "Db", descriptor = "[B")
    public byte[] field309;

    @OriginalMember(owner = "client!be", name = "Ib", descriptor = "[B")
    public byte[] field314;

    @OriginalMember(owner = "client!be", name = "ib", descriptor = "[I")
    private int[] field288;

    @OriginalMember(owner = "client!be", name = "Cb", descriptor = "[S")
    public short[] field308;

    @OriginalMember(owner = "client!be", name = "fb", descriptor = "[B")
    public byte[] field285;

    @OriginalMember(owner = "client!be", name = "Hb", descriptor = "[S")
    public short[] field313;

    @OriginalMember(owner = "client!be", name = "eb", descriptor = "[B")
    public byte[] field284;

    @OriginalMember(owner = "client!be", name = "Y", descriptor = "[S")
    public short[] field278;

    @OriginalMember(owner = "client!be", name = "xb", descriptor = "[S")
    public short[] field303;

    @OriginalMember(owner = "client!be", name = "Jb", descriptor = "[S")
    public short[] field315;

    @OriginalMember(owner = "client!be", name = "Mb", descriptor = "[S")
    private short[] field318;

    @OriginalMember(owner = "client!be", name = "ub", descriptor = "[S")
    private short[] field300;

    @OriginalMember(owner = "client!be", name = "nb", descriptor = "[S")
    private short[] field293;

    @OriginalMember(owner = "client!be", name = "tb", descriptor = "[B")
    private byte[] field299;

    @OriginalMember(owner = "client!be", name = "cb", descriptor = "[B")
    private byte[] field282;

    @OriginalMember(owner = "client!be", name = "Pb", descriptor = "[B")
    private byte[] field321;

    @OriginalMember(owner = "client!be", name = "vb", descriptor = "[B")
    private byte[] field301;

    @OriginalMember(owner = "client!be", name = "yb", descriptor = "[B")
    private byte[] field304;

    @OriginalMember(owner = "client!be", name = "rb", descriptor = "[[I")
    public int[][] field297;

    @OriginalMember(owner = "client!be", name = "zb", descriptor = "[[I")
    public int[][] field305;

    @OriginalMember(owner = "client!be", name = "Z", descriptor = "[Lva;")
    public class198[] field279;

    @OriginalMember(owner = "client!be", name = "Sb", descriptor = "[Lhc;")
    public class73[] field324;

    @OriginalMember(owner = "client!be", name = "qb", descriptor = "[Lva;")
    public class198[] field296;

    @OriginalMember(owner = "client!be", name = "kb", descriptor = "S")
    public short field290;

    @OriginalMember(owner = "client!be", name = "wb", descriptor = "S")
    public short field302;

    @OriginalMember(owner = "client!be", name = "lb", descriptor = "I")
    private static int field291 = 0;

    @OriginalMember(owner = "client!be", name = "hb", descriptor = "[I")
    private static int[] field287 = new int[10000];

    @OriginalMember(owner = "client!be", name = "Bb", descriptor = "[I")
    private static int[] field307 = class11.field201;

    @OriginalMember(owner = "client!be", name = "Ab", descriptor = "[I")
    private static int[] field306 = new int[10000];

    @OriginalMember(owner = "client!be", name = "ob", descriptor = "[I")
    private static int[] field294 = class11.field211;

    @OriginalMember(owner = "client!be", name = "db", descriptor = "S")
    private short field283;

    @OriginalMember(owner = "client!be", name = "mb", descriptor = "S")
    private short field292;

    @OriginalMember(owner = "client!be", name = "pb", descriptor = "S")
    private short field295;

    @OriginalMember(owner = "client!be", name = "Eb", descriptor = "S")
    private short field310;

    @OriginalMember(owner = "client!be", name = "Rb", descriptor = "S")
    private short field323;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lbe;Lbe;IIIZ)V")
    public static final void method126(class16 arg0, class16 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method135();
        arg0.method138();
        arg1.method135();
        arg1.method138();
        ++field291;
        int var6 = 0;
        int[] var7 = arg1.field281;
        int var8 = arg1.field298;
        for (int var9 = 0; var9 < arg0.field298; ++var9) {
            class198 var12 = arg0.field279[var9];
            if (var12.field3942 != 0) {
                int var13 = arg0.field316[var9] - arg3;
                if (var13 >= arg1.field2440 && var13 <= arg1.field292) {
                    int var14 = arg0.field281[var9] - arg2;
                    if (var14 >= arg1.field323 && var14 <= arg1.field295) {
                        int var15 = arg0.field317[var9] - arg4;
                        if (var15 >= arg1.field310 && var15 <= arg1.field283) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class198 var17 = arg1.field279[var16];
                                if (var7[var16] == var14 && arg1.field317[var16] == var15 && arg1.field316[var16] == var13 && var17.field3942 != 0) {
                                    if (arg0.field296 == null) {
                                        arg0.field296 = new class198[arg0.field298];
                                    }
                                    if (arg1.field296 == null) {
                                        arg1.field296 = new class198[var8];
                                    }
                                    class198 var18 = arg0.field296[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field296[var9] = new class198(var12);
                                    }
                                    class198 var19 = arg1.field296[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field296[var16] = new class198(var17);
                                    }
                                    var18.field3940 += var17.field3940;
                                    var18.field3945 += var17.field3945;
                                    var18.field3941 += var17.field3941;
                                    var18.field3942 += var17.field3942;
                                    var19.field3940 += var12.field3940;
                                    var19.field3945 += var12.field3945;
                                    var19.field3941 += var12.field3941;
                                    var19.field3942 += var12.field3942;
                                    ++var6;
                                    field287[var9] = field291;
                                    field306[var16] = field291;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field322; ++var10) {
                if (field287[arg0.field325[var10]] == field291 && field287[arg0.field289[var10]] == field291 && field287[arg0.field320[var10]] == field291) {
                    if (arg0.field311 == null) {
                        arg0.field311 = new byte[arg0.field322];
                    }
                    arg0.field311[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field322; ++var11) {
                if (field306[arg1.field325[var11]] == field291 && field306[arg1.field289[var11]] == field291 && field306[arg1.field320[var11]] == field291) {
                    if (arg1.field311 == null) {
                        arg1.field311 = new byte[arg1.field322];
                    }
                    arg1.field311[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()V")
    public final void method127() {
        for (int var1 = 0; var1 < this.field322; ++var1) {
            int var2 = this.field325[var1];
            this.field325[var1] = this.field320[var1];
            this.field320[var1] = var2;
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "()V")
    public final void method128() {
        for (int var1 = 0; var1 < this.field298; ++var1) {
            int var2 = this.field281[var1];
            this.field281[var1] = this.field317[var1];
            this.field317[var1] = -var2;
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([B)V")
    private final void method129(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class26 var4 = new class26(arg0);
        class26 var5 = new class26(arg0);
        class26 var6 = new class26(arg0);
        class26 var7 = new class26(arg0);
        class26 var8 = new class26(arg0);
        var4.field527 = arg0.length - 18;
        int var9 = var4.method256((byte) -78);
        int var10 = var4.method256((byte) -78);
        int var11 = var4.method221(-128);
        int var12 = var4.method221(-128);
        int var13 = var4.method221(-119);
        int var14 = var4.method221(-120);
        int var15 = var4.method221(-90);
        int var16 = var4.method221(-77);
        int var17 = var4.method256((byte) -78);
        int var18 = var4.method256((byte) -78);
        int var19 = var4.method256((byte) -78);
        int var20 = var4.method256((byte) -78);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field298 = var9;
        this.field322 = var10;
        this.field319 = var11;
        this.field281 = new int[var9];
        this.field316 = new int[var9];
        this.field317 = new int[var9];
        this.field325 = new int[var10];
        this.field289 = new int[var10];
        this.field320 = new int[var10];
        if (var11 > 0) {
            this.field284 = new byte[var11];
            this.field278 = new short[var11];
            this.field303 = new short[var11];
            this.field315 = new short[var11];
        }
        if (var16 == 1) {
            this.field312 = new int[var9];
        }
        if (var12 == 1) {
            this.field311 = new byte[var10];
            this.field285 = new byte[var10];
            this.field308 = new short[var10];
        }
        if (var13 == 255) {
            this.field309 = new byte[var10];
        } else {
            this.field280 = (byte) var13;
        }
        if (var14 == 1) {
            this.field314 = new byte[var10];
        }
        if (var15 == 1) {
            this.field288 = new int[var10];
        }
        this.field313 = new short[var10];
        var4.field527 = var21;
        var5.field527 = var36;
        var6.field527 = var38;
        var7.field527 = var40;
        var8.field527 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method221(-101);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method222(114);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method222(127);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method222(49);
            }
            this.field281[var46] = var43 + var63;
            this.field316[var46] = var44 + var64;
            this.field317[var46] = var45 + var65;
            var43 = this.field281[var46];
            var44 = this.field316[var46];
            var45 = this.field317[var46];
            if (var16 == 1) {
                this.field312[var46] = var8.method221(-94);
            }
        }
        var4.field527 = var32;
        var5.field527 = var28;
        var6.field527 = var26;
        var7.field527 = var30;
        var8.field527 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field313[var47] = (short) var4.method256((byte) -78);
            if (var12 == 1) {
                int var61 = var5.method221(-89);
                if ((var61 & 1) == 1) {
                    this.field311[var47] = 1;
                    var2 = true;
                } else {
                    this.field311[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field285[var47] = (byte) (var61 >> 2);
                    this.field308[var47] = this.field313[var47];
                    this.field313[var47] = 127;
                    if (this.field308[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field285[var47] = -1;
                    this.field308[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field309[var47] = var6.method225((byte) -109);
            }
            if (var14 == 1) {
                this.field314[var47] = var7.method225((byte) -127);
            }
            if (var15 == 1) {
                this.field288[var47] = var8.method221(-85);
            }
        }
        var4.field527 = var25;
        var5.field527 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method221(-118);
            if (var57 == 1) {
                var48 = var4.method222(116) + var51;
                var49 = var4.method222(67) + var48;
                var50 = var4.method222(91) + var49;
                var51 = var50;
                this.field325[var52] = var48;
                this.field289[var52] = var49;
                this.field320[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method222(97) + var51;
                var51 = var50;
                this.field325[var52] = var48;
                this.field289[var52] = var49;
                this.field320[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method222(57) + var51;
                var51 = var50;
                this.field325[var52] = var48;
                this.field289[var52] = var49;
                this.field320[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method222(50) + var51;
                var51 = var50;
                this.field325[var52] = var48;
                this.field289[var52] = var60;
                this.field320[var52] = var50;
            }
        }
        var4.field527 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field284[var53] = 0;
            this.field278[var53] = (short) var4.method256((byte) -78);
            this.field303[var53] = (short) var4.method256((byte) -78);
            this.field315[var53] = (short) var4.method256((byte) -78);
        }
        if (this.field285 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field285[var55] & 255;
                if (var56 != 255) {
                    if ((this.field278[var56] & 65535) == this.field325[var55] && (this.field303[var56] & 65535) == this.field289[var55] && (this.field315[var56] & 65535) == this.field320[var55]) {
                        this.field285[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field285 = null;
            }
        }
        if (!var3) {
            this.field308 = null;
        }
        if (!var2) {
            this.field311 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "()Lbe;")
    public final class16 method130() {
        class16 var1 = new class16();
        if (this.field311 != null) {
            var1.field311 = new byte[this.field322];
            for (int var2 = 0; var2 < this.field322; ++var2) {
                var1.field311[var2] = this.field311[var2];
            }
        }
        var1.field298 = this.field298;
        var1.field322 = this.field322;
        var1.field319 = this.field319;
        var1.field281 = this.field281;
        var1.field316 = this.field316;
        var1.field317 = this.field317;
        var1.field325 = this.field325;
        var1.field289 = this.field289;
        var1.field320 = this.field320;
        var1.field309 = this.field309;
        var1.field314 = this.field314;
        var1.field285 = this.field285;
        var1.field313 = this.field313;
        var1.field308 = this.field308;
        var1.field280 = this.field280;
        var1.field284 = this.field284;
        var1.field278 = this.field278;
        var1.field303 = this.field303;
        var1.field315 = this.field315;
        var1.field318 = this.field318;
        var1.field300 = this.field300;
        var1.field293 = this.field293;
        var1.field299 = this.field299;
        var1.field282 = this.field282;
        var1.field321 = this.field321;
        var1.field301 = this.field301;
        var1.field304 = this.field304;
        var1.field312 = this.field312;
        var1.field288 = this.field288;
        var1.field297 = this.field297;
        var1.field305 = this.field305;
        var1.field279 = this.field279;
        var1.field324 = this.field324;
        var1.field290 = this.field290;
        var1.field302 = this.field302;
        return var1;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "()V")
    public final void method131() {
        for (int var1 = 0; var1 < this.field298; ++var1) {
            this.field317[var1] = -this.field317[var1];
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "()V")
    public final void method132() {
        for (int var1 = 0; var1 < this.field298; ++var1) {
            this.field281[var1] = -this.field281[var1];
            this.field317[var1] = -this.field317[var1];
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "()V")
    public final void method133() {
        int var10002;
        if (this.field312 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field298; ++var3) {
                int var7 = this.field312[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field297 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field297[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field298) {
                int var6 = this.field312[var5];
                this.field297[var6][var1[var6]++] = var5++;
            }
            this.field312 = null;
        }
        if (this.field288 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field322; ++var10) {
                int var14 = this.field288[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field305 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field305[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field322) {
                int var13 = this.field288[var12];
                this.field305[var13][var8[var13]++] = var12++;
            }
            this.field288 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(SS)V")
    public final void method134(short arg0, short arg1) {
        if (this.field308 != null) {
            for (int var3 = 0; var3 < this.field322; ++var3) {
                if (this.field308[var3] == arg0) {
                    this.field308[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "()V")
    private final void method135() {
        if (!this.field286) {
            this.field286 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            for (int var7 = 0; var7 < this.field298; ++var7) {
                int var8 = this.field281[var7];
                int var9 = this.field316[var7];
                int var10 = this.field317[var7];
                if (var8 < var1) {
                    var1 = var8;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
                if (var9 < var2) {
                    var2 = var9;
                }
                if (var9 > var5) {
                    var5 = var9;
                }
                if (var10 < var3) {
                    var3 = var10;
                }
                if (var10 > var6) {
                    var6 = var10;
                }
            }
            this.field323 = (short) var1;
            this.field295 = (short) var4;
            super.field2440 = (short) var2;
            this.field292 = (short) var5;
            this.field310 = (short) var3;
            this.field283 = (short) var6;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lag;II)Lbe;")
    public static final class16 method136(class8 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method39(arg1, -1, arg2);
        return var3 == null ? null : new class16(var3);
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)V")
    public final void method137(int arg0) {
        int var2 = field294[arg0];
        int var3 = field307[arg0];
        for (int var4 = 0; var4 < this.field298; ++var4) {
            int var5 = this.field317[var4] * var2 + this.field281[var4] * var3 >> 16;
            this.field317[var4] = this.field317[var4] * var3 - this.field281[var4] * var2 >> 16;
            this.field281[var4] = var5;
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "h", descriptor = "()V")
    public final void method138() {
        if (this.field279 == null) {
            this.field279 = new class198[this.field298];
            for (int var1 = 0; var1 < this.field298; ++var1) {
                this.field279[var1] = new class198();
            }
            for (int var2 = 0; var2 < this.field322; ++var2) {
                int var3 = this.field325[var2];
                int var4 = this.field289[var2];
                int var5 = this.field320[var2];
                int var6 = this.field281[var4] - this.field281[var3];
                int var7 = this.field316[var4] - this.field316[var3];
                int var8 = this.field317[var4] - this.field317[var3];
                int var9 = this.field281[var5] - this.field281[var3];
                int var10 = this.field316[var5] - this.field316[var3];
                int var11 = this.field317[var5] - this.field317[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field311 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field311[var2];
                }
                if (var19 == 0) {
                    class198 var20 = this.field279[var3];
                    var20.field3940 += var16;
                    var20.field3945 += var17;
                    var20.field3941 += var18;
                    ++var20.field3942;
                    class198 var21 = this.field279[var4];
                    var21.field3940 += var16;
                    var21.field3945 += var17;
                    var21.field3941 += var18;
                    ++var21.field3942;
                    class198 var22 = this.field279[var5];
                    var22.field3940 += var16;
                    var22.field3945 += var17;
                    var22.field3941 += var18;
                    ++var22.field3942;
                } else if (var19 == 1) {
                    if (this.field324 == null) {
                        this.field324 = new class73[this.field322];
                    }
                    class73 var23 = this.field324[var2] = new class73();
                    var23.field1744 = var16;
                    var23.field1746 = var17;
                    var23.field1745 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)Lsg;")
    public final class177 method139(int arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class177(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(III)V")
    public final void method140(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field298; ++var4) {
            this.field281[var4] += arg0;
            this.field316[var4] += arg1;
            this.field317[var4] += arg2;
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "i", descriptor = "()V")
    public static void method141() {
        field287 = null;
        field306 = null;
        field294 = null;
        field307 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIZZ)Lia;")
    public final class81 method142(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        return new class177(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "([B)V")
    private final void method143(byte[] arg0) {
        class26 var2 = new class26(arg0);
        class26 var3 = new class26(arg0);
        class26 var4 = new class26(arg0);
        class26 var5 = new class26(arg0);
        class26 var6 = new class26(arg0);
        class26 var7 = new class26(arg0);
        class26 var8 = new class26(arg0);
        var2.field527 = arg0.length - 23;
        int var9 = var2.method256((byte) -78);
        int var10 = var2.method256((byte) -78);
        int var11 = var2.method221(-108);
        int var12 = var2.method221(-118);
        int var13 = var2.method221(-105);
        int var14 = var2.method221(-113);
        int var15 = var2.method221(-123);
        int var16 = var2.method221(-89);
        int var17 = var2.method221(-124);
        int var18 = var2.method256((byte) -78);
        int var19 = var2.method256((byte) -78);
        int var20 = var2.method256((byte) -78);
        int var21 = var2.method256((byte) -78);
        int var22 = var2.method256((byte) -78);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field284 = new byte[var11];
            var2.field527 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field284[var26] = var2.method225((byte) -121);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 + var56;
        int var60 = var24 + var58;
        int var62 = var25 * 2 + var24 + var60;
        this.field298 = var9;
        this.field322 = var10;
        this.field319 = var11;
        this.field281 = new int[var9];
        this.field316 = new int[var9];
        this.field317 = new int[var9];
        this.field325 = new int[var10];
        this.field289 = new int[var10];
        this.field320 = new int[var10];
        if (var17 == 1) {
            this.field312 = new int[var9];
        }
        if (var12 == 1) {
            this.field311 = new byte[var10];
        }
        if (var13 == 255) {
            this.field309 = new byte[var10];
        } else {
            this.field280 = (byte) var13;
        }
        if (var14 == 1) {
            this.field314 = new byte[var10];
        }
        if (var15 == 1) {
            this.field288 = new int[var10];
        }
        if (var16 == 1) {
            this.field308 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field285 = new byte[var10];
        }
        this.field313 = new short[var10];
        if (var11 > 0) {
            this.field278 = new short[var11];
            this.field303 = new short[var11];
            this.field315 = new short[var11];
            if (var24 > 0) {
                this.field318 = new short[var24];
                this.field300 = new short[var24];
                this.field293 = new short[var24];
                this.field299 = new byte[var24];
                this.field282 = new byte[var24];
                this.field321 = new byte[var24];
            }
            if (var25 > 0) {
                this.field301 = new byte[var25];
                this.field304 = new byte[var25];
            }
        }
        var2.field527 = var11;
        var3.field527 = var44;
        var4.field527 = var46;
        var5.field527 = var48;
        var6.field527 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method221(-108);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method222(38);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method222(89);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method222(94);
            }
            this.field281[var67] = var64 + var82;
            this.field316[var67] = var65 + var83;
            this.field317[var67] = var66 + var84;
            var64 = this.field281[var67];
            var65 = this.field316[var67];
            var66 = this.field317[var67];
            if (var17 == 1) {
                this.field312[var67] = var6.method221(-126);
            }
        }
        var2.field527 = var42;
        var3.field527 = var31;
        var4.field527 = var34;
        var5.field527 = var37;
        var6.field527 = var35;
        var7.field527 = var40;
        var8.field527 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field313[var68] = (short) var2.method256((byte) -78);
            if (var12 == 1) {
                this.field311[var68] = var3.method225((byte) -117);
            }
            if (var13 == 255) {
                this.field309[var68] = var4.method225((byte) -106);
            }
            if (var14 == 1) {
                this.field314[var68] = var5.method225((byte) -114);
            }
            if (var15 == 1) {
                this.field288[var68] = var6.method221(-112);
            }
            if (var16 == 1) {
                this.field308[var68] = (short) (var7.method256((byte) -78) - 1);
            }
            if (this.field285 != null) {
                if (this.field308[var68] != -1) {
                    this.field285[var68] = (byte) (var8.method221(-104) - 1);
                } else {
                    this.field285[var68] = -1;
                }
            }
        }
        var2.field527 = var33;
        var3.field527 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method221(-91);
            if (var77 == 1) {
                var69 = var2.method222(79) + var72;
                var70 = var2.method222(15) + var69;
                var71 = var2.method222(74) + var70;
                var72 = var71;
                this.field325[var73] = var69;
                this.field289[var73] = var70;
                this.field320[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method222(77) + var72;
                var72 = var71;
                this.field325[var73] = var69;
                this.field289[var73] = var70;
                this.field320[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method222(11) + var72;
                var72 = var71;
                this.field325[var73] = var69;
                this.field289[var73] = var70;
                this.field320[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method222(18) + var72;
                var72 = var71;
                this.field325[var73] = var69;
                this.field289[var73] = var80;
                this.field320[var73] = var71;
            }
        }
        var2.field527 = var50;
        var3.field527 = var52;
        var4.field527 = var54;
        var5.field527 = var56;
        var6.field527 = var58;
        var7.field527 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field284[var74] & 255;
            if (var76 == 0) {
                this.field278[var74] = (short) var2.method256((byte) -78);
                this.field303[var74] = (short) var2.method256((byte) -78);
                this.field315[var74] = (short) var2.method256((byte) -78);
            }
            if (var76 == 1) {
                this.field278[var74] = (short) var3.method256((byte) -78);
                this.field303[var74] = (short) var3.method256((byte) -78);
                this.field315[var74] = (short) var3.method256((byte) -78);
                this.field318[var74] = (short) var4.method256((byte) -78);
                this.field300[var74] = (short) var4.method256((byte) -78);
                this.field293[var74] = (short) var4.method256((byte) -78);
                this.field299[var74] = var5.method225((byte) -106);
                this.field282[var74] = var6.method225((byte) -122);
                this.field321[var74] = var7.method225((byte) -115);
            }
            if (var76 == 2) {
                this.field278[var74] = (short) var3.method256((byte) -78);
                this.field303[var74] = (short) var3.method256((byte) -78);
                this.field315[var74] = (short) var3.method256((byte) -78);
                this.field318[var74] = (short) var4.method256((byte) -78);
                this.field300[var74] = (short) var4.method256((byte) -78);
                this.field293[var74] = (short) var4.method256((byte) -78);
                this.field299[var74] = var5.method225((byte) -116);
                this.field282[var74] = var6.method225((byte) -105);
                this.field321[var74] = var7.method225((byte) -119);
                this.field301[var74] = var7.method225((byte) -106);
                this.field304[var74] = var7.method225((byte) -121);
            }
            if (var76 == 3) {
                this.field278[var74] = (short) var3.method256((byte) -78);
                this.field303[var74] = (short) var3.method256((byte) -78);
                this.field315[var74] = (short) var3.method256((byte) -78);
                this.field318[var74] = (short) var4.method256((byte) -78);
                this.field300[var74] = (short) var4.method256((byte) -78);
                this.field293[var74] = (short) var4.method256((byte) -78);
                this.field299[var74] = var5.method225((byte) -125);
                this.field282[var74] = var6.method225((byte) -109);
                this.field321[var74] = var7.method225((byte) -115);
            }
        }
        var2.field527 = var62;
        int var75 = var2.method221(-82);
        if (var75 != 0) {
            new class204();
            var2.method256((byte) -78);
            var2.method256((byte) -78);
            var2.method256((byte) -78);
            var2.method240(8);
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(SS)V")
    public final void method144(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field322; ++var3) {
            if (this.field313[var3] == arg0) {
                this.field313[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(III)V")
    public final void method145(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field298; ++var4) {
            this.field281[var4] = this.field281[var4] * arg0 / 128;
            this.field316[var4] = this.field316[var4] * arg1 / 128;
            this.field317[var4] = this.field317[var4] * arg2 / 128;
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([[IIIIZI)Lbe;")
    public final class16 method146(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method135();
        int var7 = this.field323 + arg1;
        int var8 = this.field295 + arg1;
        int var9 = this.field310 + arg3;
        int var10 = this.field283 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class16 var15;
                if (arg4) {
                    var15 = new class16();
                    var15.field298 = this.field298;
                    var15.field322 = this.field322;
                    var15.field319 = this.field319;
                    var15.field281 = this.field281;
                    var15.field317 = this.field317;
                    var15.field325 = this.field325;
                    var15.field289 = this.field289;
                    var15.field320 = this.field320;
                    var15.field311 = this.field311;
                    var15.field309 = this.field309;
                    var15.field314 = this.field314;
                    var15.field285 = this.field285;
                    var15.field313 = this.field313;
                    var15.field308 = this.field308;
                    var15.field280 = this.field280;
                    var15.field284 = this.field284;
                    var15.field278 = this.field278;
                    var15.field303 = this.field303;
                    var15.field315 = this.field315;
                    var15.field318 = this.field318;
                    var15.field300 = this.field300;
                    var15.field293 = this.field293;
                    var15.field299 = this.field299;
                    var15.field282 = this.field282;
                    var15.field321 = this.field321;
                    var15.field301 = this.field301;
                    var15.field304 = this.field304;
                    var15.field312 = this.field312;
                    var15.field288 = this.field288;
                    var15.field297 = this.field297;
                    var15.field305 = this.field305;
                    var15.field290 = this.field290;
                    var15.field302 = this.field302;
                    var15.field316 = new int[var15.field298];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field298; ++var16) {
                        int var17 = this.field281[var16] + arg1;
                        int var18 = this.field317[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field316[var16] = this.field316[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field298; ++var26) {
                        int var27 = (this.field316[var26] << 16) / super.field2440;
                        if (var27 < arg5) {
                            int var28 = this.field281[var26] + arg1;
                            int var29 = this.field317[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field316[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field316[var26];
                        } else {
                            var15.field316[var26] = this.field316[var26];
                        }
                    }
                }
                var15.method149();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lbe;I)I")
    private final int method147(class16 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field281[arg1];
        int var5 = arg0.field316[arg1];
        int var6 = arg0.field317[arg1];
        for (int var7 = 0; var7 < this.field298; ++var7) {
            if (this.field281[var7] == var4 && this.field316[var7] == var5 && this.field317[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field281[this.field298] = var4;
            this.field316[this.field298] = var5;
            this.field317[this.field298] = var6;
            if (arg0.field312 != null) {
                this.field312[this.field298] = arg0.field312[arg1];
            }
            var3 = this.field298++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!be", name = "j", descriptor = "()V")
    public final void method148() {
        for (int var1 = 0; var1 < this.field298; ++var1) {
            int var2 = this.field317[var1];
            this.field317[var1] = this.field281[var1];
            this.field281[var1] = -var2;
        }
        this.method149();
    }

    @OriginalMember(owner = "client!be", name = "k", descriptor = "()V")
    private final void method149() {
        this.field279 = null;
        this.field296 = null;
        this.field324 = null;
        this.field286 = false;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    private class16() {
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([B)V")
    private class16(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method143(arg0);
        } else {
            this.method129(arg0);
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "([Lbe;I)V")
    public class16(class16[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field298 = 0;
        this.field322 = 0;
        this.field319 = 0;
        this.field280 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class16 var15 = arg0[var9];
            if (var15 != null) {
                this.field298 += var15.field298;
                this.field322 += var15.field322;
                this.field319 += var15.field319;
                if (var15.field309 != null) {
                    var4 = true;
                } else {
                    if (this.field280 == -1) {
                        this.field280 = var15.field280;
                    }
                    if (this.field280 != var15.field280) {
                        var4 = true;
                    }
                }
                var3 |= var15.field311 != null;
                var5 |= var15.field314 != null;
                var6 |= var15.field288 != null;
                var7 |= var15.field308 != null;
                var8 |= var15.field285 != null;
            }
        }
        this.field281 = new int[this.field298];
        this.field316 = new int[this.field298];
        this.field317 = new int[this.field298];
        this.field312 = new int[this.field298];
        this.field325 = new int[this.field322];
        this.field289 = new int[this.field322];
        this.field320 = new int[this.field322];
        if (var3) {
            this.field311 = new byte[this.field322];
        }
        if (var4) {
            this.field309 = new byte[this.field322];
        }
        if (var5) {
            this.field314 = new byte[this.field322];
        }
        if (var6) {
            this.field288 = new int[this.field322];
        }
        if (var7) {
            this.field308 = new short[this.field322];
        }
        if (var8) {
            this.field285 = new byte[this.field322];
        }
        this.field313 = new short[this.field322];
        if (this.field319 > 0) {
            this.field284 = new byte[this.field319];
            this.field278 = new short[this.field319];
            this.field303 = new short[this.field319];
            this.field315 = new short[this.field319];
            this.field318 = new short[this.field319];
            this.field300 = new short[this.field319];
            this.field293 = new short[this.field319];
            this.field299 = new byte[this.field319];
            this.field282 = new byte[this.field319];
            this.field321 = new byte[this.field319];
            this.field301 = new byte[this.field319];
            this.field304 = new byte[this.field319];
        }
        this.field298 = 0;
        this.field322 = 0;
        this.field319 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class16 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field322; ++var12) {
                    if (var3 && var11.field311 != null) {
                        this.field311[this.field322] = var11.field311[var12];
                    }
                    if (var4) {
                        if (var11.field309 != null) {
                            this.field309[this.field322] = var11.field309[var12];
                        } else {
                            this.field309[this.field322] = var11.field280;
                        }
                    }
                    if (var5 && var11.field314 != null) {
                        this.field314[this.field322] = var11.field314[var12];
                    }
                    if (var6 && var11.field288 != null) {
                        this.field288[this.field322] = var11.field288[var12];
                    }
                    if (var7) {
                        if (var11.field308 != null) {
                            this.field308[this.field322] = var11.field308[var12];
                        } else {
                            this.field308[this.field322] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field285 != null && var11.field285[var12] != -1) {
                            this.field285[this.field322] = (byte) (var11.field285[var12] + this.field319);
                        } else {
                            this.field285[this.field322] = -1;
                        }
                    }
                    this.field313[this.field322] = var11.field313[var12];
                    this.field325[this.field322] = this.method147(var11, var11.field325[var12]);
                    this.field289[this.field322] = this.method147(var11, var11.field289[var12]);
                    this.field320[this.field322] = this.method147(var11, var11.field320[var12]);
                    ++this.field322;
                }
                for (int var13 = 0; var13 < var11.field319; ++var13) {
                    byte var14 = this.field284[this.field319] = var11.field284[var13];
                    if (var14 == 0) {
                        this.field278[this.field319] = (short) this.method147(var11, var11.field278[var13]);
                        this.field303[this.field319] = (short) this.method147(var11, var11.field303[var13]);
                        this.field315[this.field319] = (short) this.method147(var11, var11.field315[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field278[this.field319] = var11.field278[var13];
                        this.field303[this.field319] = var11.field303[var13];
                        this.field315[this.field319] = var11.field315[var13];
                        this.field318[this.field319] = var11.field318[var13];
                        this.field300[this.field319] = var11.field300[var13];
                        this.field293[this.field319] = var11.field293[var13];
                        this.field299[this.field319] = var11.field299[var13];
                        this.field282[this.field319] = var11.field282[var13];
                        this.field321[this.field319] = var11.field321[var13];
                    }
                    if (var14 == 2) {
                        this.field301[this.field319] = var11.field301[var13];
                        this.field304[this.field319] = var11.field304[var13];
                    }
                    ++this.field319;
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lbe;ZZZZ)V")
    public class16(class16 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field298 = arg0.field298;
        this.field322 = arg0.field322;
        this.field319 = arg0.field319;
        if (arg1) {
            this.field281 = arg0.field281;
            this.field316 = arg0.field316;
            this.field317 = arg0.field317;
        } else {
            this.field281 = new int[this.field298];
            this.field316 = new int[this.field298];
            this.field317 = new int[this.field298];
            for (int var6 = 0; var6 < this.field298; ++var6) {
                this.field281[var6] = arg0.field281[var6];
                this.field316[var6] = arg0.field316[var6];
                this.field317[var6] = arg0.field317[var6];
            }
        }
        if (arg2) {
            this.field313 = arg0.field313;
        } else {
            this.field313 = new short[this.field322];
            for (int var7 = 0; var7 < this.field322; ++var7) {
                this.field313[var7] = arg0.field313[var7];
            }
        }
        if (!arg3 && arg0.field308 != null) {
            this.field308 = new short[this.field322];
            for (int var8 = 0; var8 < this.field322; ++var8) {
                this.field308[var8] = arg0.field308[var8];
            }
        } else {
            this.field308 = arg0.field308;
        }
        if (arg4) {
            this.field314 = arg0.field314;
        } else {
            this.field314 = new byte[this.field322];
            if (arg0.field314 == null) {
                for (int var9 = 0; var9 < this.field322; ++var9) {
                    this.field314[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field322; ++var10) {
                    this.field314[var10] = arg0.field314[var10];
                }
            }
        }
        this.field325 = arg0.field325;
        this.field289 = arg0.field289;
        this.field320 = arg0.field320;
        this.field311 = arg0.field311;
        this.field309 = arg0.field309;
        this.field285 = arg0.field285;
        this.field280 = arg0.field280;
        this.field284 = arg0.field284;
        this.field278 = arg0.field278;
        this.field303 = arg0.field303;
        this.field315 = arg0.field315;
        this.field318 = arg0.field318;
        this.field300 = arg0.field300;
        this.field293 = arg0.field293;
        this.field299 = arg0.field299;
        this.field282 = arg0.field282;
        this.field321 = arg0.field321;
        this.field301 = arg0.field301;
        this.field304 = arg0.field304;
        this.field312 = arg0.field312;
        this.field288 = arg0.field288;
        this.field297 = arg0.field297;
        this.field305 = arg0.field305;
        this.field279 = arg0.field279;
        this.field324 = arg0.field324;
        this.field296 = arg0.field296;
        this.field290 = arg0.field290;
        this.field302 = arg0.field302;
    }
}
