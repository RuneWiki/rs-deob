import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class257 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field3205 = -1;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "Z")
    public boolean field3213 = false;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Z")
    public boolean field3222 = false;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public int field3224 = -1;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public int field3223 = 99;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "Z")
    public boolean field3219 = false;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "I")
    public int field3220 = 2;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "Z")
    public boolean field3221 = false;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public int field3231 = -1;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public int field3225 = 5;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public int field3229 = -1;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public int field3233 = -1;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
    public static int field3209 = 0;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[I")
    public static int[] field3216 = new int[1];

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "Z")
    public static boolean field3232 = false;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "Lcq;")
    public static class110 field3217 = new class110(91, 4);

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "Z")
    public static boolean field3237 = false;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public int field3207;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field3227;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Loj;")
    public class541 field3214;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Lrda;")
    public static class96 field3238;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[I")
    public int[] field3218;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "[I")
    private int[] field3234;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "[I")
    public int[] field3235;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "[Z")
    public boolean[] field3210;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "[[I")
    public int[][] field3208;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILce;)V", line = 5)
    public static final void method1518(int arg0, class445 arg1) {
        field3212++;
        arg1.method2575(0);
        int var2 = class392.field5314;
        class236 var3 = class362.field4859 = class139.field1540[var2] = new class236();
        var3.field9434 = var2;
        if (arg0 > -21) {
            field3237 = false;
        }
        int var4 = arg1.method2574(296813219, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        var3.field9517[0] = var6 - class26.field245;
        int var7 = var4 & 0x3FFF;
        var3.field5179 = (var3.field9517[0] << 9) + (var3.method1414(-31789) << 8);
        var3.field9513[0] = var7 - class231.field2860;
        var3.field5176 = (var3.field9513[0] << 9) + (var3.method1414(-31789) << 8);
        class169.field1888 = var3.field5166 = var3.field5169 = var5;
        if (class568.method3221(var3.field9513[0], var3.field9517[0], 0)) {
            var3.field5169++;
        }
        if (class304.field3766[var2] != null) {
            var3.method1405(20512, class304.field3766[var2]);
        }
        class306.field3786 = 0;
        class396.field5353[class306.field3786++] = var2;
        class194.field2249[var2] = 0;
        class342.field4326 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method2574(296813219, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFED) >> 8;
                int var12 = var9 & 0xFF;
                class432 var13 = class186.field2112[var8] = new class432();
                var13.field6114 = -1;
                var13.field6117 = (var10 << 28) + (var11 << 14) + var12;
                var13.field6115 = false;
                var13.field6121 = 0;
                class492.field7134[class342.field4326++] = var8;
                class194.field2249[var8] = 0;
            }
        }
        arg1.method2583((byte) -58);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lnp;B)V", line = 91)
    public final void method1519(class115 arg0, byte arg1) {
        field3226++;
        while (true) {
            int var3 = arg0.method620((byte) 51);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    field3232 = true;
                    return;
                }
            }
            this.method1522(8, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 112)
    public static final void method1520(int arg0) {
        class19 var1 = class593.field8375;
        synchronized (class593.field8375) {
            class593.field8375.method80((byte) -111);
        }
        field3215++;
        if (arg0 != 1765586576) {
            method1520(-34);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V", line = 143)
    public final void method1521(byte arg0) {
        if (this.field3231 == -1) {
            if (this.field3210 == null) {
                this.field3231 = 0;
            } else {
                this.field3231 = 2;
            }
        }
        int var2 = 89 % ((arg0 + 46) / 46);
        field3230++;
        if (this.field3229 != -1) {
            return;
        }
        if (this.field3210 == null) {
            this.field3229 = 0;
        } else {
            this.field3229 = 2;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILnp;)V", line = 170)
    private final void method1522(int arg0, int arg1, class115 arg2) {
        field3206++;
        if (arg0 != 8) {
            this.method1523(-51, -57, -5, false);
        }
        if (arg1 == 1) {
            int var13 = arg2.method643((byte) -77);
            this.field3235 = new int[var13];
            for (int var14 = 0; var14 < var13; var14++) {
                this.field3235[var14] = arg2.method643((byte) -77);
            }
            this.field3218 = new int[var13];
            for (int var15 = 0; var15 < var13; var15++) {
                this.field3218[var15] = arg2.method643((byte) -77);
            }
            for (int var16 = 0; var16 < var13; var16++) {
                this.field3218[var16] = (arg2.method643((byte) -77) << 16) + this.field3218[var16];
            }
        } else if (arg1 == 2) {
            this.field3205 = arg2.method643((byte) -77);
        } else if (arg1 == 3) {
            this.field3210 = new boolean[256];
            int var11 = arg2.method620((byte) -128);
            for (int var12 = 0; var12 < var11; var12++) {
                this.field3210[arg2.method620((byte) 47)] = true;
            }
        } else if (arg1 == 5) {
            this.field3225 = arg2.method620((byte) 79);
        } else if (arg1 == 6) {
            this.field3233 = arg2.method643((byte) -77);
        } else if (arg1 == 7) {
            this.field3224 = arg2.method643((byte) -77);
        } else if (arg1 == 8) {
            this.field3223 = arg2.method620((byte) 18);
        } else if (arg1 == 9) {
            this.field3231 = arg2.method620((byte) 35);
        } else if (arg1 == 10) {
            this.field3229 = arg2.method620((byte) -128);
        } else if (arg1 == 11) {
            this.field3220 = arg2.method620((byte) -15);
        } else if (arg1 == 12) {
            int var8 = arg2.method620((byte) -128);
            this.field3234 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field3234[var9] = arg2.method643((byte) -77);
            }
            for (int var10 = 0; var10 < var8; var10++) {
                this.field3234[var10] = (arg2.method643((byte) -77) << 16) + this.field3234[var10];
            }
        } else if (arg1 == 13) {
            int var4 = arg2.method643((byte) -77);
            this.field3208 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg2.method620((byte) -36);
                if (var6 > 0) {
                    this.field3208[var5] = new int[var6];
                    this.field3208[var5][0] = arg2.method675(-125);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field3208[var5][var7] = arg2.method643((byte) -77);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field3219 = true;
        } else if (arg1 == 15) {
            this.field3221 = true;
        } else if (arg1 == 16) {
            this.field3222 = true;
        } else if (arg1 == 18) {
            this.field3213 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIZ)I", line = 350)
    public final int method1523(int arg0, int arg1, int arg2, boolean arg3) {
        field3227++;
        if (arg1 <= 18) {
            method1520(-29);
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field3218[arg0];
        class479 var8 = null;
        class479 var9 = this.field3214.method3042(var7 >> 16, (byte) -21);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field3221 || class510.field7317) && arg2 != -1 && this.field3218.length > arg2) {
            int var11 = this.field3218[arg2];
            var8 = this.field3214.method3042(var11 >> 16, (byte) -21);
            var6 = var11 & 0xFFFF;
        }
        if (this.field3219) {
            var5 |= 0x200;
        }
        if (var9.method2756(var10, (byte) -43)) {
            var5 |= 0x80;
        }
        if (var9.method2758(var10, 7527)) {
            var5 |= 0x100;
        }
        if (var9.method2755(-64, var10)) {
            var5 |= 0x400;
        }
        if (var8 != null) {
            if (var8.method2756(var6, (byte) -59)) {
                var5 |= 0x80;
            }
            if (var8.method2758(var6, 7527)) {
                var5 |= 0x100;
            }
            if (var8.method2755(-87, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field3234 != null && arg3) {
            if (arg0 < this.field3234.length) {
                int var12 = this.field3234[arg0];
                if (var12 != 65535) {
                    class479 var13 = this.field3214.method3042(var12 >> 16, (byte) -21);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method2756(var14, (byte) -100)) {
                            var5 |= 0x80;
                        }
                        if (var13.method2758(var14, 7527)) {
                            var5 |= 0x100;
                        }
                        if (var13.method2755(-127, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field3221 || class510.field7317) && arg2 != -1 && arg2 < this.field3234.length) {
                int var15 = this.field3234[arg2];
                if (var15 != 65535) {
                    class479 var16 = this.field3214.method3042(var15 >> 16, (byte) -21);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method2756(var17, (byte) -81)) {
                            var5 |= 0x80;
                        }
                        if (var16.method2758(var17, 7527)) {
                            var5 |= 0x100;
                        }
                        if (var16.method2755(-87, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BBIILda;III)Lda;", line = 478)
    public final class473 method1524(byte arg0, byte arg1, int arg2, int arg3, class473 arg4, int arg5, int arg6, int arg7) {
        if (arg1 != -10) {
            this.method1521((byte) 2);
        }
        field3228++;
        int var9 = this.field3235[arg5];
        int var10 = this.field3218[arg5];
        class479 var11 = this.field3214.method3042(var10 >> 16, (byte) -21);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method1877(arg0, arg7, true);
        }
        class479 var13 = null;
        if ((this.field3221 || class510.field7317) && arg2 != -1 && arg2 < this.field3218.length) {
            int var14 = this.field3218[arg2];
            var13 = this.field3214.method3042(var14 >> 16, (byte) -21);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field3219) {
            arg7 |= 0x200;
        }
        if (var11.method2756(var12, (byte) -51)) {
            arg7 |= 0x80;
        }
        if (var11.method2758(var12, arg1 + 7537)) {
            arg7 |= 0x100;
        }
        if (var11.method2755(arg1 - 54, var12)) {
            arg7 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2756(arg2, (byte) -106)) {
                arg7 |= 0x80;
            }
            if (var13.method2758(arg2, 7527)) {
                arg7 |= 0x100;
            }
            if (var13.method2755(-65, arg2)) {
                arg7 |= 0x400;
            }
        }
        int var15 = arg7 | 0x20;
        class473 var16 = arg4.method1877(arg0, var15, true);
        var16.method2725(var12, this.field3219, var13, -3646, var11, arg6, arg2, arg3 - 1, var9);
        return var16;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IILda;IIB)Lda;", line = 559)
    public final class473 method1525(int arg0, int arg1, class473 arg2, int arg3, int arg4, byte arg5) {
        if (arg5 != -55) {
            this.field3235 = null;
        }
        field3211++;
        int var7 = this.field3235[arg1];
        int var8 = this.field3218[arg1];
        class479 var9 = this.field3214.method3042(var8 >> 16, (byte) -21);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg2.method1877((byte) 1, arg4, true);
        }
        class479 var11 = null;
        if ((this.field3221 || class510.field7317) && arg3 != -1 && this.field3218.length > arg3) {
            int var12 = this.field3218[arg3];
            var11 = this.field3214.method3042(var12 >> 16, (byte) -21);
            arg3 = var12 & 0xFFFF;
        }
        class479 var13 = null;
        class479 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field3234 != null) {
            if (arg1 < this.field3234.length) {
                var15 = this.field3234[arg1];
                if (var15 != 65535) {
                    var13 = this.field3214.method3042(var15 >> 16, (byte) -21);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field3221 || class510.field7317) && arg3 != -1 && arg3 < this.field3234.length) {
                var16 = this.field3234[arg3];
                if (var16 != 65535) {
                    var14 = this.field3214.method3042(var16 >> 16, (byte) -21);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field3219) {
            arg4 |= 0x200;
        }
        if (var9.method2756(var10, (byte) -105)) {
            arg4 |= 0x80;
        }
        if (var9.method2758(var10, 7527)) {
            arg4 |= 0x100;
        }
        if (var9.method2755(-106, var10)) {
            arg4 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method2756(var15, (byte) -46)) {
                arg4 |= 0x80;
            }
            if (var13.method2758(var15, 7527)) {
                arg4 |= 0x100;
            }
            if (var13.method2755(-64, var15)) {
                arg4 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method2756(arg3, (byte) -45)) {
                arg4 |= 0x80;
            }
            if (var11.method2758(arg3, 7527)) {
                arg4 |= 0x100;
            }
            if (var11.method2755(-108, arg3)) {
                arg4 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method2756(var16, (byte) -48)) {
                arg4 |= 0x80;
            }
            if (var14.method2758(var16, 7527)) {
                arg4 |= 0x100;
            }
            if (var14.method2755(-118, var16)) {
                arg4 |= 0x400;
            }
        }
        int var17 = arg4 | 0x20;
        class473 var18 = arg2.method1877((byte) 1, var17, true);
        var18.method2725(var10, this.field3219, var11, arg5 - 3591, var9, 0, arg3, arg0 - 1, var7);
        if (var13 != null) {
            var18.method2725(var15, this.field3219, var14, -3646, var13, 0, var16, arg0 - 1, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V", line = 703)
    public static void method1526(byte arg0) {
        field3216 = null;
        field3217 = null;
        if (arg0 != -49) {
            field3232 = true;
        }
        field3238 = null;
    }
}
