import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class280 extends class29 {

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Z")
    public boolean field4399 = true;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field4403 = 0;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "Lpm;")
    public static class111 field4409 = new class111(16);

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "I")
    public static int field4414 = -1;

    @OriginalMember(owner = "client!ui", name = "U", descriptor = "I")
    public static int field4415 = 0;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4411;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "[I")
    public int[] field4400;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "[I")
    private int[] field4406;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "[Ljava/lang/String;")
    private String[] field4405;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "[[I")
    private int[][] field4410;

    @OriginalMember(owner = "client!ui", name = "V", descriptor = "[[[B")
    public static byte[][][] field4416;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)Ljava/lang/String;", line = 5)
    public final String method1976(int arg0) {
        if (arg0 != -1) {
            this.field4410 = (int[][]) ((int[][]) null);
        }
        field4402++;
        StringBuffer var2 = new StringBuffer(80);
        if (this.field4405 == null) {
            return "";
        }
        var2.append(this.field4405[0]);
        for (int var3 = 1; var3 < this.field4405.length; var3++) {
            var2.append("...");
            var2.append(this.field4405[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V", line = 33)
    public final void method1977(byte arg0) {
        field4407++;
        if (this.field4400 != null) {
            for (int var2 = 0; var2 < this.field4400.length; var2++) {
                this.field4400[var2] = class24.method149(this.field4400[var2], 32768);
            }
        }
        int var3 = -43 / ((arg0 - 10) / 58);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILim;Z)V", line = 52)
    private final void method1978(int arg0, class192 arg1, boolean arg2) {
        if (arg2) {
            this.method1982((class192) null, -76);
        }
        if (arg0 == 1) {
            this.field4405 = class334.method2306('<', arg1.method1355((byte) 113), -3);
        } else if (arg0 == 2) {
            int var8 = arg1.method1399(-1172389784);
            this.field4400 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4400[var9] = arg1.method1396(-115);
            }
        } else if (arg0 == 3) {
            int var4 = arg1.method1399(-1172389784);
            this.field4410 = new int[var4][];
            this.field4406 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1396(-67);
                this.field4406[var5] = var6;
                this.field4410[var5] = new int[class240.field3828[var6]];
                for (int var7 = 0; var7 < class240.field3828[var6]; var7++) {
                    this.field4410[var5][var7] = arg1.method1396(-40);
                }
            }
        } else if (arg0 == 4) {
            this.field4399 = false;
        }
        field4411++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[ILim;)V", line = 117)
    public final void method1979(int arg0, int[] arg1, class192 arg2) {
        field4395++;
        if (this.field4406 == null) {
            return;
        }
        int var4 = 83 / ((-arg0 - 58) / 44);
        for (int var5 = 0; var5 < this.field4406.length && arg1.length > var5; var5++) {
            int var6 = class229.field3661[this.method1981(var5, (byte) -101)];
            if (var6 > 0) {
                arg2.method1363((long) arg1[var5], var6, 18231);
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIZIII)V", line = 147)
    public static final void method1980(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        if (class186.field2991) {
            int var6 = arg5 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class250.field3982 - class270.field4263) * var6 / 100 + class270.field4263;
            if (class253.field4021 > var7) {
                var7 = class253.field4021;
            } else if (class170.field2716 < var7) {
                var7 = class170.field2716;
            }
            int var8 = arg5 * 512 * var7 / (arg4 * 334);
            if (var8 < class232.field3709) {
                short var9 = class232.field3709;
                var7 = var9 * 334 * arg4 / (arg5 * 512);
                if (class170.field2716 < var7) {
                    var7 = class170.field2716;
                    int var10 = var7 * 512 * arg5 / (var9 * 334);
                    int var11 = (arg4 - var10) / 2;
                    if (arg2) {
                        class344.method2372();
                        class344.method2375(arg1, arg0, var11, arg5, 0);
                        class344.method2375(arg1 + arg4 - var11, arg0, var11, arg5, 0);
                    }
                    arg4 -= var11 * 2;
                    arg1 += var11;
                }
            } else if (class282.field4454 < var8) {
                short var12 = class282.field4454;
                var7 = var12 * 334 * arg4 / (arg5 * 512);
                if (class253.field4021 > var7) {
                    var7 = class253.field4021;
                    int var13 = arg4 * var12 * 334 / (var7 * 512);
                    int var14 = (arg5 - var13) / 2;
                    if (arg2) {
                        class344.method2372();
                        class344.method2375(arg1, arg0, arg4, var14, 0);
                        class344.method2375(arg1, arg5 + arg0 - var14, arg4, var14, 0);
                    }
                    arg0 += var14;
                    arg5 -= var14 * 2;
                }
            }
            class343.field5354 = arg5 * var7 / 334;
        }
        class234.field3729 = (short) arg4;
        class230.field3667 = arg0;
        class339.field5267 = arg1;
        if (arg3 == 2) {
            field4404++;
            class321.field5026 = (short) arg5;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)I", line = 244)
    public final int method1981(int arg0, byte arg1) {
        if (arg1 != -101) {
            method1980(4, 92, true, -127, -39, 25);
        }
        field4401++;
        return this.field4406 == null || arg0 < 0 || this.field4406.length < arg0 ? -1 : this.field4406[arg0];
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lim;I)Ljava/lang/String;", line = 271)
    public final String method1982(class192 arg0, int arg1) {
        StringBuffer var3 = new StringBuffer(80);
        if (this.field4406 != null) {
            for (int var4 = 0; var4 < this.field4406.length; var4++) {
                var3.append(this.field4405[var4]);
                var3.append(class256.method1813(this.field4410[var4], arg0.method1369(class36.field477[this.field4406[var4]], 8), this.field4406[var4], false));
            }
        }
        var3.append(this.field4405[this.field4405.length + arg1]);
        field4413++;
        return var3.toString();
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIB)I", line = 296)
    public final int method1983(int arg0, int arg1, byte arg2) {
        field4398++;
        if (this.field4406 == null || arg1 < 0 || arg1 > this.field4406.length) {
            return -1;
        } else if (this.field4410[arg1] == null || arg0 < 0 || arg0 > this.field4410[arg1].length) {
            return -1;
        } else {
            if (arg2 <= 22) {
                method1980(-106, 45, false, 1, 30, 75);
            }
            return this.field4410[arg1][arg0];
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 315)
    public static final void method1984(String arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1984((String) null, 63, -64);
        }
        field4394++;
        class179 var3 = class319.method2220(arg2, (byte) -32, 2);
        var3.method1242((byte) 125);
        var3.field2898 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(B)V", line = 336)
    public static void method1985(byte arg0) {
        field4409 = null;
        field4416 = (byte[][][]) null;
        if (arg0 < 122) {
            field4415 = -89;
        }
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)I", line = 352)
    public final int method1986(int arg0) {
        field4396++;
        if (arg0 == 100) {
            return this.field4406 == null ? 0 : this.field4406.length;
        } else {
            return 80;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIIIII)V", line = 373)
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class157 var7 = new class157();
        var7.field2402 = arg1 / 128;
        var7.field2407 = arg2 / 128;
        var7.field2413 = arg3 / 128;
        var7.field2404 = arg4 / 128;
        var7.field2414 = arg0;
        var7.field2419 = arg1;
        var7.field2406 = arg2;
        var7.field2417 = arg3;
        var7.field2408 = arg4;
        var7.field2405 = arg5;
        var7.field2420 = arg6;
        class294.field4626[class181.field2918++] = var7;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lim;Z)V", line = 395)
    public final void method1988(class192 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        field4408++;
        while (true) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 == 0) {
                return;
            }
            this.method1978(var3, arg0, false);
        }
    }
}
