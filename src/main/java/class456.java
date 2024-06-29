import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class456 {

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field6219 = -1;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field6217 = -1;

    @OriginalMember(owner = "client!la", name = "q", descriptor = "Z")
    public boolean field6228 = false;

    @OriginalMember(owner = "client!la", name = "p", descriptor = "Z")
    public boolean field6227 = false;

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field6214 = 2;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "I")
    public int field6213 = 5;

    @OriginalMember(owner = "client!la", name = "m", descriptor = "I")
    public int field6224 = -1;

    @OriginalMember(owner = "client!la", name = "w", descriptor = "I")
    public int field6234 = 99;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "I")
    public int field6242 = -1;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "Z")
    public boolean field6239 = false;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "Z")
    public boolean field6247 = false;

    @OriginalMember(owner = "client!la", name = "I", descriptor = "I")
    public int field6246 = -1;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field6220 = 0;

    @OriginalMember(owner = "client!la", name = "o", descriptor = "[Lkb;")
    public static class691[] field6226 = new class691[4];

    @OriginalMember(owner = "client!la", name = "z", descriptor = "I")
    public static int field6237 = -1;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6212 = 0;

    @OriginalMember(owner = "client!la", name = "x", descriptor = "I")
    public static int field6235 = -1;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public static int field6218;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "I")
    public static int field6223;

    @OriginalMember(owner = "client!la", name = "t", descriptor = "I")
    public static int field6231;

    @OriginalMember(owner = "client!la", name = "u", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!la", name = "v", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "Lwu;")
    public static class376 field6215;

    @OriginalMember(owner = "client!la", name = "y", descriptor = "Lvga;")
    public class86 field6236;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "[I")
    public int[] field6221;

    @OriginalMember(owner = "client!la", name = "n", descriptor = "[I")
    public int[] field6225;

    @OriginalMember(owner = "client!la", name = "r", descriptor = "[I")
    public int[] field6229;

    @OriginalMember(owner = "client!la", name = "s", descriptor = "[I")
    public int[] field6230;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "[I")
    private int[] field6240;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "[I")
    public int[] field6241;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "[Z")
    public boolean[] field6245;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[[I")
    public int[][] field6243;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILka;ZI)Lka;", line = 7)
    public final class475 method2591(int arg0, int arg1, int arg2, class475 arg3, boolean arg4, int arg5) {
        field6244++;
        int var7 = this.field6225[arg2];
        int var8 = this.field6229[arg2];
        class37 var9 = this.field6236.method661(-38, var8 >> 16);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg3.method171((byte) 1, arg0, true);
        }
        class37 var11 = null;
        if ((this.field6227 || class37.field529) && arg5 != -1 && arg5 < this.field6229.length) {
            int var12 = this.field6229[arg5];
            var11 = this.field6236.method661(-27, var12 >> 16);
            arg5 = var12 & 0xFFFF;
        }
        class37 var13 = null;
        class37 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field6240 != null) {
            if (this.field6240.length > arg2) {
                var15 = this.field6240[arg2];
                if (var15 != 65535) {
                    var13 = this.field6236.method661(-113, var15 >> 16);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field6227 || class37.field529) && arg5 != -1 && arg5 < this.field6240.length) {
                var16 = this.field6240[arg5];
                if (var16 != 65535) {
                    var14 = this.field6236.method661(-126, var16 >> 16);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field6228) {
            arg0 |= 0x200;
        }
        if (var9.method296(var10, -55)) {
            arg0 |= 0x80;
        }
        if (var9.method301(1, var10)) {
            arg0 |= 0x100;
        }
        if (var9.method298(1, var10)) {
            arg0 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method296(var15, -61)) {
                arg0 |= 0x80;
            }
            if (var13.method301(1, var15)) {
                arg0 |= 0x100;
            }
            if (var13.method298(1, var15)) {
                arg0 |= 0x400;
            }
        }
        if (var11 != null) {
            if (var11.method296(arg5, -109)) {
                arg0 |= 0x80;
            }
            if (var11.method301(1, arg5)) {
                arg0 |= 0x100;
            }
            if (var11.method298(1, arg5)) {
                arg0 |= 0x400;
            }
        }
        if (var14 != null) {
            if (var14.method296(var16, -68)) {
                arg0 |= 0x80;
            }
            if (var14.method301(1, var16)) {
                arg0 |= 0x100;
            }
            if (var14.method298(1, var16)) {
                arg0 |= 0x400;
            }
        }
        int var17 = arg0 | 0x20;
        if (arg4) {
            return null;
        }
        class475 var18 = arg3.method171((byte) 1, var17, true);
        var18.method2675(-89, var9, this.field6228, arg5, var7, var10, 0, arg1 - 1, var11);
        if (var13 != null) {
            var18.method2675(-84, var13, this.field6228, var16, var7, var15, 0, arg1 - 1, var14);
        }
        return var18;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lee;I)V", line = 144)
    public final void method2592(class677 arg0, int arg1) {
        if (arg1 != 0) {
            this.method2593((byte) 78);
        }
        while (true) {
            int var3 = arg0.method3821((byte) 116);
            if (var3 == 0) {
                field6222++;
                return;
            }
            this.method2597(arg0, var3, 3);
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V", line = 165)
    public final void method2593(byte arg0) {
        int var2 = -81 / ((-arg0 - 41) / 50);
        if (this.field6217 == -1) {
            if (this.field6245 == null) {
                this.field6217 = 0;
            } else {
                this.field6217 = 2;
            }
        }
        field6233++;
        if (this.field6219 != -1) {
            return;
        }
        if (this.field6245 == null) {
            this.field6219 = 0;
        } else {
            this.field6219 = 2;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BII)V", line = 196)
    public static final void method2594(byte arg0, int arg1, int arg2) {
        if (arg0 != 19) {
            return;
        }
        if ((class744.field10350 > class744.field10349)) {
            class744.field10349 = (float) ((double) class744.field10349 / 30.0D + (double) class744.field10349);
            if (class744.field10350 < class744.field10349) {
                class744.field10349 = class744.field10350;
            }
            class229.method1457((byte) -7);
            class744.field10348 = (int) class744.field10349 >> 1;
            class744.field10344 = class94.method699(arg0 ^ 0x13, class744.field10348);
        } else if (class744.field10350 < class744.field10349) {
            class744.field10349 = (float) ((double) class744.field10349 - (double) class744.field10349 / 30.0D);
            if (class744.field10349 < class744.field10350) {
                class744.field10349 = class744.field10350;
            }
            class229.method1457((byte) -7);
            class744.field10348 = (int) class744.field10349 >> 1;
            class744.field10344 = class94.method699(0, class744.field10348);
        }
        field6238++;
        if (class347.field4871 != -1 && class663.field8853 != -1) {
            int var3 = class347.field4871 - class194.field2929;
            if (var3 < 2 || var3 > 2) {
                var3 /= 8;
            }
            int var4 = class663.field8853 - class432.field5949;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            class194.field2929 += var3;
            if (var3 == 0 && var4 == 0) {
                class347.field4871 = -1;
                class663.field8853 = -1;
            }
            class432.field5949 += var4;
            class229.method1457((byte) -7);
        }
        if (class11.field181 > 0) {
            class440.field6076--;
            if (class440.field6076 == 0) {
                class11.field181--;
                class440.field6076 = 100;
            }
        } else {
            class507.field6768 = -1;
            class208.field3086 = -1;
        }
        if (!class591.field7696 || class668.field9127 == null) {
            return;
        }
        for (class621 var5 = (class621) class668.field9127.method21(2); var5 != null; var5 = (class621) class668.field9127.method9(-128)) {
            class325 var6 = class744.field10338.method3192((byte) 54, var5.field8275.field8387);
            if (var5.method3420(arg2, arg1, 109)) {
                if (var6.field4646 != null) {
                    if (var6.field4646[4] != null) {
                        class586.method3203(true, (long) var5.field8275.field8387, (long) var5.field8275.field8387, false, 0, 1012, false, -1, -1, var6.field4646[4], (byte) 87, var6.field4656, var6.field4622);
                    }
                    if (var6.field4646[3] != null) {
                        class586.method3203(true, (long) var5.field8275.field8387, (long) var5.field8275.field8387, false, 0, 1001, false, -1, -1, var6.field4646[3], (byte) 87, var6.field4656, var6.field4622);
                    }
                    if (var6.field4646[2] != null) {
                        class586.method3203(true, (long) var5.field8275.field8387, (long) var5.field8275.field8387, false, 0, 1007, false, -1, -1, var6.field4646[2], (byte) 87, var6.field4656, var6.field4622);
                    }
                    if (var6.field4646[1] != null) {
                        class586.method3203(true, (long) var5.field8275.field8387, (long) var5.field8275.field8387, false, 0, 1004, false, -1, -1, var6.field4646[1], (byte) 87, var6.field4656, var6.field4622);
                    }
                    if (var6.field4646[0] != null) {
                        class586.method3203(true, (long) var5.field8275.field8387, (long) var5.field8275.field8387, false, 0, 1006, false, -1, -1, var6.field4646[0], (byte) 87, var6.field4656, var6.field4622);
                    }
                }
                if (!var5.field8275.field8386) {
                    var5.field8275.field8386 = true;
                    class182.method1258(class519.field6921, var5.field8275.field8387, var6.field4622);
                }
                if (var5.field8275.field8386) {
                    class182.method1258(class532.field7033, var5.field8275.field8387, var6.field4622);
                }
            } else if (var5.field8275.field8386) {
                var5.field8275.field8386 = false;
                class182.method1258(class131.field2140, var5.field8275.field8387, var6.field4622);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(B)V", line = 347)
    public static void method2595(byte arg0) {
        field6226 = null;
        if (arg0 < 59) {
            field6218 = -123;
        }
        field6215 = null;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BZII)I", line = 361)
    public final int method2596(byte arg0, boolean arg1, int arg2, int arg3) {
        field6223++;
        int var5 = 0;
        int var6 = 0;
        int var7 = this.field6229[arg2];
        class37 var8 = null;
        class37 var9 = this.field6236.method661(-72, var7 >> 16);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field6227 || class37.field529) && arg3 != -1 && arg3 < this.field6229.length) {
            int var11 = this.field6229[arg3];
            var8 = this.field6236.method661(-113, var11 >> 16);
            var6 = var11 & 0xFFFF;
        }
        if (this.field6228) {
            var5 |= 0x200;
        }
        if (var9.method296(var10, -94)) {
            var5 |= 0x80;
        }
        if (var9.method301(1, var10)) {
            var5 |= 0x100;
        }
        if (var9.method298(1, var10)) {
            var5 |= 0x400;
        }
        if (arg0 > -27) {
            this.field6232 = 27;
        }
        if (var8 != null) {
            if (var8.method296(var6, -127)) {
                var5 |= 0x80;
            }
            if (var8.method301(1, var6)) {
                var5 |= 0x100;
            }
            if (var8.method298(1, var6)) {
                var5 |= 0x400;
            }
        }
        if (this.field6240 != null && arg1) {
            if (arg2 < this.field6240.length) {
                int var12 = this.field6240[arg2];
                if (var12 != 65535) {
                    class37 var13 = this.field6236.method661(-108, var12 >> 16);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method296(var14, -16)) {
                            var5 |= 0x80;
                        }
                        if (var13.method301(1, var14)) {
                            var5 |= 0x100;
                        }
                        if (var13.method298(1, var14)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
            if ((this.field6227 || class37.field529) && arg3 != -1 && arg3 < this.field6240.length) {
                int var15 = this.field6240[arg3];
                if (var15 != 65535) {
                    class37 var16 = this.field6236.method661(-115, var15 >> 16);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method296(var17, -43)) {
                            var5 |= 0x80;
                        }
                        if (var16.method301(1, var17)) {
                            var5 |= 0x100;
                        }
                        if (var16.method298(1, var17)) {
                            var5 |= 0x400;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lee;II)V", line = 492)
    private final void method2597(class677 arg0, int arg1, int arg2) {
        field6216++;
        if (arg2 != 3) {
            return;
        }
        if (arg1 == 1) {
            int var16 = arg0.method3807(-1);
            this.field6225 = new int[var16];
            for (int var17 = 0; var17 < var16; var17++) {
                this.field6225[var17] = arg0.method3807(-1);
            }
            this.field6229 = new int[var16];
            for (int var18 = 0; var18 < var16; var18++) {
                this.field6229[var18] = arg0.method3807(-1);
            }
            for (int var19 = 0; var19 < var16; var19++) {
                this.field6229[var19] = (arg0.method3807(arg2 - 4) << 16) + this.field6229[var19];
            }
        } else if (arg1 == 2) {
            this.field6242 = arg0.method3807(arg2 - 4);
        } else if (arg1 == 3) {
            this.field6245 = new boolean[256];
            int var14 = arg0.method3821((byte) -83);
            for (int var15 = 0; var15 < var14; var15++) {
                this.field6245[arg0.method3821((byte) 78)] = true;
            }
        } else if (arg1 == 5) {
            this.field6213 = arg0.method3821((byte) 117);
        } else if (arg1 == 6) {
            this.field6246 = arg0.method3807(arg2 - 4);
        } else if (arg1 == 7) {
            this.field6224 = arg0.method3807(-1);
        } else if (arg1 == 8) {
            this.field6234 = arg0.method3821((byte) -38);
        } else if (arg1 == 9) {
            this.field6219 = arg0.method3821((byte) -31);
        } else if (arg1 == 10) {
            this.field6217 = arg0.method3821((byte) -83);
        } else if (arg1 == 11) {
            this.field6214 = arg0.method3821((byte) -81);
        } else if (arg1 == 12) {
            int var11 = arg0.method3821((byte) -19);
            this.field6240 = new int[var11];
            for (int var12 = 0; var12 < var11; var12++) {
                this.field6240[var12] = arg0.method3807(class712.method4000(arg2, -4));
            }
            for (int var13 = 0; var13 < var11; var13++) {
                this.field6240[var13] += arg0.method3807(-1) << 16;
            }
        } else if (arg1 == 13) {
            int var4 = arg0.method3807(-1);
            this.field6243 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method3821((byte) -16);
                if (var6 > 0) {
                    this.field6243[var5] = new int[var6];
                    this.field6243[var5][0] = arg0.method3833(255);
                    for (int var7 = 1; var7 < var6; var7++) {
                        this.field6243[var5][var7] = arg0.method3807(-1);
                    }
                }
            }
        } else if (arg1 == 14) {
            this.field6228 = true;
        } else if (arg1 == 15) {
            this.field6227 = true;
        } else if (arg1 == 16) {
            this.field6239 = true;
        } else if (arg1 == 18) {
            this.field6247 = true;
        } else if (arg1 == 19) {
            if (this.field6241 == null) {
                this.field6241 = new int[this.field6243.length];
                for (int var10 = 0; var10 < this.field6243.length; var10++) {
                    this.field6241[var10] = 255;
                }
            }
            this.field6241[arg0.method3821((byte) 89)] = arg0.method3821((byte) -63);
        } else if (arg1 == 20) {
            if (this.field6221 == null || this.field6230 == null) {
                this.field6221 = new int[this.field6243.length];
                this.field6230 = new int[this.field6243.length];
                for (int var8 = 0; var8 < this.field6243.length; var8++) {
                    this.field6221[var8] = 256;
                    this.field6230[var8] = 256;
                }
            }
            int var9 = arg0.method3821((byte) 84);
            this.field6221[var9] = arg0.method3807(class712.method4000(arg2, -4));
            this.field6230[var9] = arg0.method3807(-1);
            return;
        }
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BIIILka;IIB)Lka;", line = 708)
    public final class475 method2598(byte arg0, int arg1, int arg2, int arg3, class475 arg4, int arg5, int arg6, byte arg7) {
        field6231++;
        int var9 = this.field6225[arg2];
        int var10 = this.field6229[arg2];
        class37 var11 = this.field6236.method661(arg0 + 12, var10 >> 16);
        if (arg0 != -107) {
            method2595((byte) -71);
        }
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg4.method171(arg7, arg5, true);
        }
        class37 var13 = null;
        if ((this.field6227 || class37.field529) && arg6 != -1 && this.field6229.length > arg6) {
            int var14 = this.field6229[arg6];
            var13 = this.field6236.method661(arg0 + 58, var14 >> 16);
            arg6 = var14 & 0xFFFF;
        }
        if (this.field6228) {
            arg5 |= 0x200;
        }
        if (var11.method296(var12, -118)) {
            arg5 |= 0x80;
        }
        if (var11.method301(1, var12)) {
            arg5 |= 0x100;
        }
        if (var11.method298(1, var12)) {
            arg5 |= 0x400;
        }
        if (var13 != null) {
            if (var13.method296(arg6, -96)) {
                arg5 |= 0x80;
            }
            if (var13.method301(arg0 + 108, arg6)) {
                arg5 |= 0x100;
            }
            if (var13.method298(1, arg6)) {
                arg5 |= 0x400;
            }
        }
        int var15 = arg5 | 0x20;
        class475 var16 = arg4.method171(arg7, var15, true);
        var16.method2675(-110, var11, this.field6228, arg6, var9, var12, arg3, arg1 - 1, var13);
        return var16;
    }
}
