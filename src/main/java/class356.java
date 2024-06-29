import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class356 {

    @OriginalMember(owner = "client!pp", name = "h", descriptor = "Z")
    public boolean field5396 = false;

    @OriginalMember(owner = "client!pp", name = "k", descriptor = "Z")
    public boolean field5399 = false;

    @OriginalMember(owner = "client!pp", name = "j", descriptor = "Z")
    public boolean field5398 = false;

    @OriginalMember(owner = "client!pp", name = "n", descriptor = "I")
    public int field5402 = 99;

    @OriginalMember(owner = "client!pp", name = "i", descriptor = "I")
    public int field5397 = -1;

    @OriginalMember(owner = "client!pp", name = "o", descriptor = "I")
    public int field5403 = -1;

    @OriginalMember(owner = "client!pp", name = "z", descriptor = "I")
    public int field5414 = -1;

    @OriginalMember(owner = "client!pp", name = "A", descriptor = "I")
    public int field5415 = 2;

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Z")
    public boolean field5394 = false;

    @OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
    public int field5418 = -1;

    @OriginalMember(owner = "client!pp", name = "u", descriptor = "I")
    public int field5409 = -1;

    @OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
    public int field5419 = 5;

    @OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
    public static int field5401 = 765;

    @OriginalMember(owner = "client!pp", name = "q", descriptor = "[I")
    public static int[] field5405 = new int[2];

    @OriginalMember(owner = "client!pp", name = "v", descriptor = "I")
    public static int field5410 = -1;

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field5390;

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "I")
    public static int field5391;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field5392;

    @OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
    public static int field5400;

    @OriginalMember(owner = "client!pp", name = "p", descriptor = "I")
    public static int field5404;

    @OriginalMember(owner = "client!pp", name = "r", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
    public static int field5407;

    @OriginalMember(owner = "client!pp", name = "t", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
    public static int field5412;

    @OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
    public static int field5413;

    @OriginalMember(owner = "client!pp", name = "B", descriptor = "I")
    public int field5416;

    @OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!pp", name = "w", descriptor = "Lei;")
    public class247 field5411;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "[I")
    public int[] field5389;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "[I")
    private int[] field5395;

    @OriginalMember(owner = "client!pp", name = "G", descriptor = "[I")
    public int[] field5421;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "[Z")
    public boolean[] field5393;

    @OriginalMember(owner = "client!pp", name = "C", descriptor = "[[I")
    public int[][] field5417;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
    public static void method2189(int arg0) {
        field5405 = null;
        if (arg0 != 27740) {
            field5410 = -98;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BLre;)V")
    public final void method2190(byte arg0, class446 arg1) {
        while (true) {
            int var3 = arg1.method2628(49152);
            if (var3 == 0) {
                field5400++;
                if (arg0 < 18) {
                    this.field5409 = -43;
                    return;
                }
                return;
            }
            this.method2195(arg1, 2070150800, var3);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIILns;I)Lns;")
    public final class57 method2191(int arg0, int arg1, int arg2, int arg3, class57 arg4, int arg5) {
        field5404++;
        int var7 = this.field5421[arg1];
        int var8 = this.field5389[arg1];
        class110 var9 = this.field5411.method1580(1, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method437((byte) 1, arg0, true);
        }
        class110 var11 = null;
        if ((this.field5396 || class155.field2162) && arg3 != -1 && arg3 < this.field5389.length) {
            int var12 = this.field5389[arg3];
            var11 = this.field5411.method1580(arg5 + 65537, var12 >> 16);
            arg3 = var12 & 0xFFFF;
        }
        class110 var13 = null;
        class110 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5395 != null) {
            if (this.field5395.length > arg1) {
                var15 = this.field5395[arg1];
                if (var15 != 65535) {
                    var13 = this.field5411.method1580(1, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5396 || class155.field2162) && arg3 != -1 && arg3 < this.field5395.length) {
                var16 = this.field5395[arg3];
                if (var16 != 65535) {
                    var14 = this.field5411.method1580(1, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (arg5 != -65536) {
            this.method2194((byte) 52, -99, -49, true);
        }
        if (this.field5398) {
            arg0 |= 0x200;
        }
        if (var9.method808(-41, var10)) {
            arg0 |= 0x80;
        }
        if (var9.method807(true, var10)) {
            arg0 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method808(122, var15)) {
                arg0 |= 0x80;
            }
            if (var13.method807(true, var15)) {
                arg0 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method808(-40, arg3)) {
                arg0 |= 0x80;
            }
            if (var11.method807(true, arg3)) {
                arg0 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method808(-74, var16)) {
                arg0 |= 0x80;
            }
            if (var14.method807(true, var16)) {
                arg0 |= 0x100;
            }
        }
        int var17 = arg0 | 0x20;
        class57 var18 = arg4.method437((byte) 1, var17, true);
        var18.method410(var9, 0, var11, arg3, -4222, this.field5398, var10, var7, arg2 - 1);
        if (var13 != null) {
            var18.method410(var13, 0, var14, var16, -4222, this.field5398, var15, var7, arg2 - 1);
        }
        return var18;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lvc;Lbg;ILh;IIIB)V")
    public static final void method2192(class271 arg0, class257 arg1, int arg2, class349 arg3, int arg4, int arg5, int arg6, byte arg7) {
        field5390++;
        if (arg7 > -40) {
            method2189(-57);
        }
        class43 var8 = new class43();
        var8.field583 = arg6 * 128;
        var8.field585 = arg5 * 128;
        var8.field575 = arg2;
        if (arg0 != null) {
            var8.field579 = arg0;
            int var9 = arg0.field4014;
            int var10 = arg0.field4048;
            if (arg4 == 1 || arg4 == 3) {
                var10 = arg0.field4014;
                var9 = arg0.field4048;
            }
            var8.field574 = arg0.field4021 * 128;
            var8.field594 = (arg6 + var9) * 128;
            var8.field581 = arg0.field4085;
            var8.field597 = arg0.field4050;
            var8.field592 = arg0.field4051;
            var8.field577 = (arg5 + var10) * 128;
            var8.field589 = arg0.field4018;
            var8.field578 = arg0.field4071;
            if (arg0.field4015 != null) {
                var8.field591 = true;
                var8.method316(false);
            }
            if (var8.field597 != null) {
                var8.field587 = (int) ((double) (var8.field578 - var8.field581) * Math.random()) + var8.field581;
            }
            class390.field5742.method2453((byte) -110, var8);
        } else if (arg3 != null) {
            var8.field582 = arg3;
            class273 var11 = arg3.field5309;
            if (var11.field4107 != null) {
                var8.field591 = true;
                var11 = var11.method1781(class315.field4736, true);
            }
            if (var11 != null) {
                var8.field594 = (var11.field4147 + arg6) * 128;
                var8.field577 = (arg5 + var11.field4147) * 128;
                var8.field589 = class50.method366(arg3, -1);
                var8.field592 = var11.field4158;
                var8.field574 = var11.field4151 * 128;
            }
            class131.field1825.method2453((byte) -109, var8);
        } else if (arg1 != null) {
            var8.field576 = arg1;
            var8.field594 = (arg6 + arg1.method1705((byte) 65)) * 128;
            var8.field577 = (arg5 + arg1.method1705((byte) 65)) * 128;
            var8.field589 = class182.method1252(arg1, -1);
            var8.field574 = arg1.field3808 * 128;
            var8.field592 = arg1.field3844;
            class4.field82.method2307((long) arg1.field4609, var8, (byte) -63);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIIBLns;)Lns;")
    public final class57 method2193(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class57 arg7) {
        field5408++;
        int var9 = this.field5421[arg1];
        int var10 = this.field5389[arg1];
        class110 var11 = this.field5411.method1580(1, var10 >> 16);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method437(arg6, arg0, true);
        }
        class110 var13 = null;
        if ((this.field5396 || class155.field2162) && arg2 != -1 && this.field5389.length > arg2) {
            int var14 = this.field5389[arg2];
            var13 = this.field5411.method1580(arg3 ^ 0xFFFF9D74, var14 >> 16);
            arg2 = var14 & 0xFFFF;
        }
        if (this.field5398) {
            arg0 |= 0x200;
        }
        if (arg3 != -25227) {
            field5405 = null;
        }
        if (var11.method808(-64, var12)) {
            arg0 |= 0x80;
        }
        if (var11.method807(true, var12)) {
            arg0 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method808(-98, arg2)) {
                arg0 |= 0x80;
            }
            if (var13.method807(true, arg2)) {
                arg0 |= 0x100;
            }
        }
        int var15 = arg0 | 0x20;
        class57 var16 = arg7.method437(arg6, var15, true);
        var16.method410(var11, arg5, var13, arg2, arg3 ^ 0x72F7, this.field5398, var12, var9, arg4 - 1);
        return var16;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BIIZ)I")
    public final int method2194(byte arg0, int arg1, int arg2, boolean arg3) {
        field5391++;
        if (arg0 > -127) {
            this.method2193(61, 53, -53, -18, 76, -80, (byte) -40, (class57) null);
        }
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field5389[arg1];
        class110 var8 = null;
        class110 var9 = this.field5411.method1580(1, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5396 || class155.field2162) && arg2 != -1 && this.field5389.length > arg2) {
            int var11 = this.field5389[arg2];
            var8 = this.field5411.method1580(1, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field5398) {
            var5 |= 0x200;
        }
        if (var9.method808(104, var10)) {
            var5 |= 0x80;
        }
        if (var9.method807(true, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method808(-121, var6)) {
                var5 |= 0x80;
            }
            if (var8.method807(true, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field5395 != null && arg3) {
            if (this.field5395.length > arg1) {
                int var12 = this.field5395[arg1];
                if (var12 != 65535) {
                    class110 var13 = this.field5411.method1580(1, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method808(111, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method807(true, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field5396 || class155.field2162) && arg2 != -1 && arg2 < this.field5395.length) {
                int var15 = this.field5395[arg2];
                if (var15 != 65535) {
                    class110 var16 = this.field5411.method1580(1, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method808(-120, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method807(true, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lre;II)V")
    private final void method2195(class446 arg0, int arg1, int arg2) {
        if (arg1 != 2070150800) {
            return;
        }
        if (arg2 == 1) {
            int var4 = arg0.method2631(arg1 ^ 0x7B63F772);
            this.field5421 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5421[var5] = arg0.method2631(2530);
            }
            this.field5389 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field5389[var6] = arg0.method2631(2530);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field5389[var7] = (arg0.method2631(2530) << 16) + this.field5389[var7];
            }
        } else if (arg2 == 2) {
            this.field5414 = arg0.method2631(2530);
        } else if (arg2 == 3) {
            this.field5393 = new boolean[256];
            int var15 = arg0.method2628(49152);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field5393[arg0.method2628(49152)] = true;
            }
        } else if (arg2 == 4) {
            this.field5394 = true;
        } else if (arg2 == 5) {
            this.field5419 = arg0.method2628(49152);
        } else if (arg2 == 6) {
            this.field5397 = arg0.method2631(2530);
        } else if (arg2 == 7) {
            this.field5403 = arg0.method2631(2530);
        } else if (arg2 == 8) {
            this.field5402 = arg0.method2628(49152);
        } else if (arg2 == 9) {
            this.field5409 = arg0.method2628(arg1 ^ 0x7B633E90);
        } else if (arg2 == 10) {
            this.field5418 = arg0.method2628(49152);
        } else if (arg2 == 11) {
            this.field5415 = arg0.method2628(49152);
        } else if (arg2 == 12) {
            int var12 = arg0.method2628(49152);
            this.field5395 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field5395[var13] = arg0.method2631(arg1 - 2070148270);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field5395[var14] = (arg0.method2631(2530) << 16) + this.field5395[var14];
            }
        } else if (arg2 == 13) {
            int var8 = arg0.method2631(arg1 - 2070148270);
            this.field5417 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg0.method2628(49152);
                if (var10 > 0) {
                    this.field5417[var9] = new int[var10];
                    this.field5417[var9][0] = arg0.method2613(-25778);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field5417[var9][var11] = arg0.method2631(class76.method648(arg1, 2070148978));
                    }
                }
            }
        } else if (arg2 == 14) {
            this.field5398 = true;
        } else if (arg2 == 15) {
            this.field5396 = true;
        } else if (arg2 == 16) {
            this.field5399 = true;
        }
        field5407++;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lvg;Z)V")
    public static final void method2196(class51 arg0, boolean arg1) {
        arg0.method378((byte) 93);
        field5420++;
        int var2 = class263.field3910;
        class257 var3 = class472.field6622 = class40.field565[var2] = new class257();
        var3.field4609 = var2;
        int var4 = arg0.method369((byte) 126, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field4675[0] = var6 - class68.field922;
        var3.field4543 = (var3.field4675[0] << 7) + (var3.method1705((byte) 65) << 6);
        var3.field4674[0] = var7 - class468.field6588;
        var3.field4538 = (var3.field4674[0] << 7) + (var3.method1705((byte) 65) << 6);
        class486.field6836 = var3.field4545 = var5;
        if (class98.field1400[var2] != null) {
            var3.method1704(class98.field1400[var2], (byte) -128);
        }
        class299.field4466 = 0;
        class161.field2218[class299.field4466++] = var2;
        class52.field748[var2] = 0;
        class371.field5585 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method369((byte) 126, 18);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class492.field6923[var8] = (var10 << 28) + (var11 << 14) + var12;
                class236.field3440[var8] = 0;
                class69.field942[var8] = -1;
                class83.field1169[class371.field5585++] = var8;
                class52.field748[var8] = 0;
            }
        }
        arg0.method371(arg1);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)Lfo;")
    public static final class12 method2197(byte arg0) {
        if (arg0 <= 9) {
            method2189(-20);
        }
        field5406++;
        return class189.field2880;
    }

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V")
    public final void method2198(int arg0) {
        if (this.field5409 == -1) {
            if (this.field5393 == null) {
                this.field5409 = 0;
            } else {
                this.field5409 = 2;
            }
        }
        if (this.field5418 == -1) {
            if (this.field5393 == null) {
                this.field5418 = 0;
            } else {
                this.field5418 = 2;
            }
        }
        field5392++;
        if (arg0 != 0) {
            this.field5421 = null;
        }
    }
}
