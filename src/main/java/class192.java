import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class192 {

    @OriginalMember(owner = "client!rt", name = "n", descriptor = "Lml;")
    private class325 field2320;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "Lbda;")
    private class428 field2307;

    @OriginalMember(owner = "client!rt", name = "f", descriptor = "I")
    public int field2312;

    @OriginalMember(owner = "client!rt", name = "l", descriptor = "I")
    private int field2318;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "[B")
    public byte[] field2310;

    @OriginalMember(owner = "client!rt", name = "k", descriptor = "I")
    private int field2317;

    @OriginalMember(owner = "client!rt", name = "m", descriptor = "I")
    private int field2319;

    @OriginalMember(owner = "client!rt", name = "o", descriptor = "I")
    private int field2321;

    @OriginalMember(owner = "client!rt", name = "r", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!rt", name = "g", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!rt", name = "h", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!rt", name = "i", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!rt", name = "p", descriptor = "I")
    public static int field2322;

    @OriginalMember(owner = "client!rt", name = "q", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "[[Lhi;")
    private class175[][] field2309;

    static {
        new class180("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
        field2324 = 0;
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIIIB)V", line = 7)
    private final void method1033(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2323++;
        if (this.field2309 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        int var8 = arg0 - 1 >> 7;
        int var9 = arg0 + arg2 - 2 >> 7;
        if (arg4 != 62) {
            return;
        }
        for (int var10 = var6; var10 <= var7; var10++) {
            class175[] var11 = this.field2309[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field2132 = true;
            }
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 45)
    public final void method1034(boolean arg0) {
        field2314++;
        this.field2309 = new class175[this.field2319][this.field2321];
        for (int var2 = 0; var2 < this.field2321; var2++) {
            for (int var3 = 0; var3 < this.field2319; var3++) {
                this.field2309[var3][var2] = new class175(this.field2307, this, this.field2320, var3, var2, this.field2317, var3 * 128 + 1, var2 * 128 - -1);
            }
        }
        if (arg0) {
            this.field2312 = 3;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Lwt;ILqa;Ldi;)V", line = 75)
    public static final void method1035(class258 arg0, int arg1, class206 arg2, class107 arg3) {
        field2322++;
        class52 var4 = arg3.method625(arg2, -2420);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method291();
        if (var5 < var4.method290()) {
            var5 = var4.method290();
        }
        byte var6 = 10;
        int var7 = arg0.field3314;
        int var8 = arg0.field3319;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field1335 != null) {
            var9 = class330.field4307.method1242(arg3.field1335, class308.field3919, null, (byte) 106, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class308.field3919[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class461.field6362.method1616(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class461.field6362.method1610() + class461.field6362.method1612() / 2;
        }
        int var15 = var5 / 2 + arg0.field3314;
        int var16 = arg0.field3319;
        if (class353.field4625 + var5 > var7) {
            var7 = class353.field4625;
            var15 = var6 + (var10 / 2) + var5 / 2 + class353.field4625 + 5;
        } else if (var7 > class353.field4614 - var5) {
            var15 = class353.field4614 - (var5 / 2) - var6 - (var10 / 2) - 5;
            var7 = class353.field4614 - var5;
        }
        if (var8 < class353.field4622 + var5) {
            var16 = var5 / 2 + var6 + class353.field4622;
            var8 = class353.field4622;
        } else if ((class353.field4626 - var5) < var8) {
            var8 = class353.field4626 - var5;
            var16 = class353.field4626 - (var5 / 2) - var11 - var6;
        }
        int var17 = (int) ((Math.atan2((double) (var7 - arg0.field3314), (double) (var8 - arg0.field3319)) / 3.141592653589793D) * 32767.0D) & 0xFFFF;
        var4.method295((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field1335 != null) {
            var19 = var16;
            var18 = var15 - (var10 / 2) - 5;
            var21 = var16 + var9 * class461.field6362.method1610() + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field1330 != 0) {
                arg2.method1118(arg3.field1330, (byte) 62, var20 - var18, var18, var16, var21 - var16);
            }
            if (arg3.field1308 != 0) {
                arg2.method1151(var16, var20 - var18, arg3.field1308, var21 - var16, (byte) 119, var18);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class308.field3919[var22];
                if (var22 < (var9 - 1)) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class461.field6362.method1614(arg2, var23, var15, var16, arg3.field1327, true);
                var16 += class461.field6362.method1610();
            }
        }
        if (arg3.field1317 == arg1 && arg3.field1335 == null) {
            return;
        }
        class261 var24 = new class261(arg0);
        int var25 = var5 >> 1;
        var24.field3371 = var21;
        var24.field3378 = var18;
        var24.field3377 = var8 - var25;
        var24.field3379 = var20;
        var24.field3375 = var19;
        var24.field3370 = var7 + var25;
        var24.field3376 = var7 - var25;
        var24.field3374 = var8 + var25;
        class22.field146.method1040(var24, -92);
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILk;II)V", line = 223)
    public final void method1036(int arg0, class483 arg1, int arg2, int arg3) {
        field2316++;
        class34 var5 = (class34) arg1;
        int var6 = var5.field264 + arg3 + 1;
        int var7 = var5.field268 + arg0 + 1;
        int var8 = this.field2312 * var7 + var6;
        int var9 = 0;
        if (arg2 > -35) {
            return;
        }
        int var10 = var5.field260;
        int var11 = var5.field263;
        int var12 = this.field2312 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var9 += var11 * var13;
            var8 += this.field2312 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field2318) {
            int var15 = var7 + var10 + 1 - this.field2318;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var12 += var16;
            var8 += var16;
            var9 += var16;
            var6 = 1;
            var14 += var16;
        }
        if (var6 + var11 >= this.field2312) {
            int var17 = var11 + var6 + 1 - this.field2312;
            var14 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class349.method1945(this.field2310, var8, (byte) -128, var14, var9, var11, var10, var12, var5.field261);
            this.method1033(var7, var6, var10, var11, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "(ILk;II)V", line = 297)
    public final void method1037(int arg0, class483 arg1, int arg2, int arg3) {
        field2308++;
        class34 var5 = (class34) arg1;
        int var6 = var5.field264 + arg2 + 1;
        int var7 = var5.field268 + arg0 + 1;
        int var8 = var6 + (this.field2312 * var7);
        int var9 = 0;
        if (arg3 != -23716) {
            method1035(null, -102, null, null);
        }
        int var10 = var5.field260;
        int var11 = var5.field263;
        int var12 = this.field2312 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var8 += this.field2312 * var14;
            var9 += var11 * var14;
            var10 -= var14;
            var7 = 1;
        }
        if (var7 + var10 >= this.field2318) {
            int var15 = var10 + var7 + 1 - this.field2318;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var9 += var16;
            var6 = 1;
            var12 += var16;
            var11 -= var16;
            var13 += var16;
            var8 += var16;
        }
        if ((var6 + var11) >= this.field2312) {
            int var17 = var11 + var6 + 1 - this.field2312;
            var13 += var17;
            var12 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class61.method351(var12, var11, var13, var10, var9, this.field2310, var5.field261, 65535, var8);
            this.method1033(var7, var6, var10, var11, (byte) 62);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(IIILk;)Z", line = 371)
    public final boolean method1038(int arg0, int arg1, int arg2, class483 arg3) {
        field2313++;
        class34 var5 = (class34) arg3;
        int var6 = var5.field264 + arg2 + 1;
        int var7 = var5.field268 + arg0 + 1;
        int var8 = var6 + (this.field2312 * var7);
        if (arg1 < 16) {
            this.field2307 = null;
        }
        int var9 = var5.field260;
        int var10 = var5.field263;
        int var11 = this.field2312 - var10;
        if (var7 <= 0) {
            int var12 = 1 - var7;
            var7 = 1;
            var9 -= var12;
            var8 += this.field2312 * var12;
        }
        if (this.field2318 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field2318;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var11 += var14;
            var10 -= var14;
        }
        if (this.field2312 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field2312;
            var11 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2312 + var11;
            return class272.method1525(var10, var9, var17, this.field2310, var16, false, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(BZII[[ZI)V", line = 451)
    public final void method1039(byte arg0, boolean arg1, int arg2, int arg3, boolean[][] arg4, int arg5) {
        field2315++;
        this.field2307.method2452(false, (byte) -94);
        this.field2307.method2478((byte) 66, false);
        this.field2307.method2405(1, -18001);
        this.field2307.method2437(1, -3);
        this.field2307.method2439(-2, false, false, (byte) 125);
        float var7 = 1.0F / (float) (this.field2307.field5713 * 128);
        if (arg0 < 48) {
            method1035(null, 26, null, null);
        }
        if (arg1) {
            for (int var8 = 0; var8 < this.field2321; var8++) {
                int var9 = var8 << this.field2317;
                int var10 = var8 + 1 << this.field2317;
                label139: for (int var11 = 0; var11 < this.field2319; var11++) {
                    int var12 = var11 << this.field2317;
                    int var13 = var11 + 1 << this.field2317;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if ((-arg5) <= (var14 - arg2) && var14 - arg2 <= arg5) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg3) >= (-arg5) && (var15 - arg3) <= arg5 && arg4[var14 + arg5 - arg2][arg5 + var15 - arg3]) {
                                    class335 var16 = this.field2307.method2479((byte) 86);
                                    var16.method1878(var7, (byte) -44, 1.0F, var7);
                                    var16.method655(-var11, -var8, 0);
                                    this.field2307.method2431((byte) -77, class187.field2256);
                                    this.field2309[var11][var8].method976((byte) -18);
                                    continue label139;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field2321; var17++) {
                int var18 = var17 << this.field2317;
                int var19 = var17 + 1 << this.field2317;
                for (int var20 = 0; var20 < this.field2319; var20++) {
                    class175 var21 = this.field2309[var20][var17];
                    class419 var22 = this.field2307.method2425(var21.field2118 * 3, -22571);
                    Buffer var23 = var22.method440(-98, true);
                    if (var23 != null) {
                        Stream var24 = this.field2307.method2426(var23, (byte) 11);
                        int var25 = 0;
                        int var26 = var20 << this.field2317;
                        int var27 = var20 + 1 << this.field2317;
                        for (int var28 = var18; var28 < var19; var28++) {
                            if (-arg5 <= var28 - arg3 && arg5 >= (var28 - arg3)) {
                                int var30 = this.field2320.field2116 * var28 + var26;
                                for (int var31 = var26; var31 < var27; var31++) {
                                    if (var31 - arg2 >= -arg5 && arg5 >= (var31 - arg2) && arg4[arg5 + var31 - arg2][var28 + arg5 - arg3]) {
                                        short[] var32 = this.field2320.field4124[var30];
                                        if (var32 != null) {
                                            if (Stream.method3340()) {
                                                for (int var34 = 0; var34 < var32.length; var34++) {
                                                    var25++;
                                                    var24.method3339(var32[var34] & 0xFFFF);
                                                }
                                            } else {
                                                for (int var33 = 0; var33 < var32.length; var33++) {
                                                    var24.method3341(var32[var33] & 0xFFFF);
                                                    var25++;
                                                }
                                            }
                                        }
                                    }
                                    var30++;
                                }
                            }
                        }
                        var24.method3342();
                        if (var22.method442(-74) && var25 > 0) {
                            class335 var29 = this.field2307.method2479((byte) 91);
                            var29.method1878(var7, (byte) -113, 1.0F, var7);
                            var29.method655(-var20, -var17, 0);
                            this.field2307.method2431((byte) -124, class187.field2256);
                            var21.method972(var25 / 3, var22, (byte) -113);
                        }
                    }
                }
            }
        }
        this.field2307.method2447(true);
    }

    @OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(Lbda;Lml;)V", line = 645)
    public class192(class428 arg0, class325 arg1) {
        this.field2320 = arg1;
        this.field2307 = arg0;
        this.field2312 = (this.field2320.field2116 * this.field2320.field2115 >> this.field2307.field5699) + 2;
        this.field2318 = (this.field2320.field2115 * this.field2320.field2114 >> this.field2307.field5699) + 2;
        this.field2310 = new byte[this.field2318 * this.field2312];
        this.field2317 = this.field2307.field5699 + 7 - this.field2320.field2111;
        this.field2319 = this.field2320.field2116 >> this.field2317;
        this.field2321 = this.field2320.field2114 >> this.field2317;
    }
}
