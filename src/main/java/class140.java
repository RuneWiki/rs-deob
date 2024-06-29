import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class140 {

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lnv;")
    private class382 field1997;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lida;")
    private class214 field1986;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "I")
    public int field1999;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    private int field1984;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    private int field1996;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "[B")
    public byte[] field1988;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    private int field1985;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    private int field1998;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "[[Z")
    public static boolean[][] field1987 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field1994;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field1995;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "[[Lpo;")
    private class519[][] field1991;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lha;III)V", line = 4)
    public final void method978(class54 arg0, int arg1, int arg2, int arg3) {
        field1990++;
        class300 var5 = (class300) arg0;
        int var6 = var5.field4087 + arg1 + 1;
        int var7 = var5.field4083 + arg2 + 1;
        int var8 = this.field1999 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4084;
        int var11 = var5.field4085;
        int var12 = this.field1999 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var7 = 1;
            var8 += this.field1999 * var14;
        }
        if ((var7 + var10) >= this.field1984) {
            int var15 = var10 + var7 + 1 - this.field1984;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var13 += var16;
            var8 += var16;
            var12 += var16;
            var9 += var16;
            var6 = 1;
            var11 -= var16;
        }
        if (this.field1999 <= var6 + var11) {
            int var17 = var6 + var11 + 1 - this.field1999;
            var11 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (~var11 < arg3 && var10 > 0) {
            class423.method2444(var8, var13, this.field1988, var10, var12, var9, var5.field4090, var11, 3);
            this.method980(var6, var11, var7, arg3 ^ 0xFFFFFFFE, var10);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 74)
    public static void method979(int arg0) {
        if (arg0 == 128) {
            field1987 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V", line = 85)
    private final void method980(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1992++;
        if (this.field1991 == null) {
            return;
        }
        int var6 = arg0 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg4 + arg2 - arg3 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class519[] var11 = this.field1991[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                if (var11[var12] != null) {
                    var11[var12].field7070 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILha;IB)V", line = 124)
    public final void method981(int arg0, class54 arg1, int arg2, byte arg3) {
        field1993++;
        class300 var5 = (class300) arg1;
        int var6 = var5.field4087 + arg2 + 1;
        int var7 = var5.field4083 + arg0 + 1;
        int var8 = this.field1999 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4084;
        int var11 = var5.field4085;
        int var12 = this.field1999 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var10 -= var13;
            var8 += this.field1999 * var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (this.field1984 <= var7 + var10) {
            int var15 = var7 + var10 + 1 - this.field1984;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var9 += var16;
            var8 += var16;
            var11 -= var16;
            var6 = 1;
            var14 += var16;
        }
        if (arg3 < 70) {
            this.method981(-42, null, 105, (byte) -39);
        }
        if (this.field1999 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field1999;
            var11 -= var17;
            var14 += var17;
            var12 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class689.method3886(var9, var12, var10, var14, var5.field4090, this.field1988, var8, 3, var11);
            this.method980(var6, var11, var7, 1, var10);
        }
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(Lha;III)Z", line = 200)
    public final boolean method982(class54 arg0, int arg1, int arg2, int arg3) {
        field1995++;
        class300 var5 = (class300) arg0;
        int var6 = var5.field4087 + arg2 + 1;
        int var7 = var5.field4083 + arg1 + 1;
        int var8 = var6 + (this.field1999 * var7);
        int var9 = var5.field4084;
        int var10 = var5.field4085;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var9 -= var11;
            var8 += this.field1999 * var11;
        }
        int var12 = this.field1999 - var10;
        if (this.field1984 <= (var7 + var9)) {
            int var13 = var7 + var9 + 1 - this.field1984;
            var9 -= var13;
        }
        if (~var6 >= arg3) {
            int var14 = 1 - var6;
            var12 += var14;
            var6 = 1;
            var8 += var14;
            var10 -= var14;
        }
        if (this.field1999 <= var6 + var10) {
            int var15 = var6 + var10 + 1 - this.field1999;
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field1999 + var12;
            return class250.method1538(this.field1988, -456, var17, var10, var9, var16, var8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lrp;Lrp;I)V", line = 272)
    public static final void method983(class401 arg0, class401 arg1, int arg2) {
        if (arg1.field5621 != null) {
            arg1.method2340(-46);
        }
        field1989++;
        arg1.field5621 = arg0.field5621;
        if (arg2 == 30653) {
            arg1.field5625 = arg0;
            arg1.field5621.field5625 = arg1;
            arg1.field5625.field5621 = arg1;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 295)
    public final void method984(byte arg0) {
        field1983++;
        this.field1991 = new class519[this.field1985][this.field1998];
        for (int var2 = 0; var2 < this.field1998; var2++) {
            for (int var3 = 0; var3 < this.field1985; var3++) {
                this.field1991[var3][var2] = new class519(this.field1997, this, this.field1986, var3, var2, this.field1996, var3 * 128 + 1, var2 * 128 + 1);
                if (this.field1991[var3][var2].field7069 == 0) {
                    this.field1991[var3][var2] = null;
                }
            }
        }
        if (arg0 < 31) {
            method979(-12);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIZ[[Z)V", line = 331)
    public final void method985(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean[][] arg5) {
        field1994++;
        if (arg0 >= -90) {
            this.field1988 = null;
        }
        this.field1997.method2250(-8, false);
        this.field1997.method2254(false, (byte) -100);
        this.field1997.method2230(1, -24);
        this.field1997.method2246(1, 26770);
        this.field1997.method2249(false, false, -2, 0);
        float var7 = 1.0F / (float) (this.field1997.field5343 * 128);
        if (arg4) {
            for (int var8 = 0; var8 < this.field1998; var8++) {
                int var9 = var8 << this.field1996;
                int var10 = var8 + 1 << this.field1996;
                label145: for (int var11 = 0; var11 < this.field1985; var11++) {
                    if (this.field1991[var11][var8] != null) {
                        int var12 = var11 << this.field1996;
                        int var13 = var11 + 1 << this.field1996;
                        for (int var14 = var12; var14 < var13; var14++) {
                            if ((-arg2) <= (var14 - arg1) && arg2 >= (var14 - arg1)) {
                                for (int var15 = var9; var15 < var10; var15++) {
                                    if ((var15 - arg3) >= (-arg2) && var15 - arg3 <= arg2 && arg5[var14 + arg2 - arg1][var15 + arg2 - arg3]) {
                                        class274 var16 = this.field1997.method2235(2);
                                        var16.method1703(var7, var7, 1.0F, 6);
                                        var16.method687(-var11, -var8, 0);
                                        this.field1997.method2227(class41.field482, (byte) -128);
                                        this.field1991[var11][var8].method2957(113);
                                        continue label145;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < this.field1998; var17++) {
                int var18 = var17 << this.field1996;
                int var19 = var17 + 1 << this.field1996;
                for (int var20 = 0; var20 < this.field1985; var20++) {
                    class519 var21 = this.field1991[var20][var17];
                    if (var21 != null) {
                        class415 var22 = this.field1997.method2263(var21.field7069 * 3, 2);
                        Buffer var23 = var22.method1119(71, true);
                        if (var23 != null) {
                            Stream var24 = this.field1997.method2238(var23, -127);
                            int var25 = 0;
                            int var26 = var20 << this.field1996;
                            int var27 = var20 + 1 << this.field1996;
                            for (int var28 = var18; var28 < var19; var28++) {
                                if ((var28 - arg3) >= (-arg2) && (var28 - arg3) <= arg2) {
                                    int var30 = this.field1986.field446 * var28 + var26;
                                    for (int var31 = var26; var31 < var27; var31++) {
                                        if ((-arg2) <= (var31 - arg1) && var31 - arg1 <= arg2 && arg5[arg2 + var31 - arg1][var28 + arg2 - arg3]) {
                                            short[] var32 = this.field1986.field2998[var30];
                                            if (var32 != null) {
                                                if (Stream.method3484()) {
                                                    for (int var34 = 0; var34 < var32.length; var34++) {
                                                        var25++;
                                                        var24.method3476(var32[var34] & 0xFFFF);
                                                    }
                                                } else {
                                                    for (int var33 = 0; var33 < var32.length; var33++) {
                                                        var25++;
                                                        var24.method3479(var32[var33] & 0xFFFF);
                                                    }
                                                }
                                            }
                                        }
                                        var30++;
                                    }
                                }
                            }
                            var24.method3477();
                            if (var22.method1121(false) && var25 > 0) {
                                class274 var29 = this.field1997.method2235(2);
                                var29.method1703(var7, var7, 1.0F, 6);
                                var29.method687(-var20, -var17, 0);
                                this.field1997.method2227(class41.field482, (byte) -128);
                                var21.method2956(74, var22, var25 / 3);
                            }
                        }
                    }
                }
            }
        }
        this.field1997.method2234(-112);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lnv;Lida;)V", line = 533)
    public class140(class382 arg0, class214 arg1) {
        this.field1997 = arg0;
        this.field1986 = arg1;
        this.field1999 = (this.field1986.field446 * this.field1986.field441 >> this.field1997.field5300) + 2;
        this.field1984 = (this.field1986.field441 * this.field1986.field438 >> this.field1997.field5300) + 2;
        this.field1996 = this.field1997.field5300 + 7 - this.field1986.field447;
        this.field1988 = new byte[this.field1999 * this.field1984];
        this.field1985 = this.field1986.field446 >> this.field1996;
        this.field1998 = this.field1986.field438 >> this.field1996;
    }
}
