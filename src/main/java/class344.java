import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class344 {

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Z")
    public boolean field5342 = false;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public int field5348 = 5;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "Z")
    public boolean field5352 = false;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "I")
    public int field5345 = -1;

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "I")
    public int field5338 = -1;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public int field5355 = 99;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "Z")
    public boolean field5360 = false;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public int field5354 = -1;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    public int field5364 = 2;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public int field5365 = -1;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "Z")
    public boolean field5367 = false;

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "I")
    public int field5368 = -1;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "[Ljava/lang/String;")
    private static final String[] field5369 = new String[] { method2856(method2855("d@zcH")), method2856(method2855("d@zaH")), method2856(method2855("w\u001dz\b\u001d")), method2856(method2855("bF8J")), method2856(method2855("d@zdH")), method2856(method2855("d@zbH")), method2856(method2855("d@zeH")), method2856(method2855("d@znH")), method2856(method2855("d@zgH")), method2856(method2855("d@z`H")) };

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
    public static int field5337 = 0;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "I")
    public static int field5341;

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!hs", name = "g", descriptor = "I")
    public static int field5346;

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "I")
    public static int field5347;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!hs", name = "i", descriptor = "I")
    public static int field5357;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field5358;

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public int field5359;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    public static int field5362;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field5363;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "Lsda;")
    public class271 field5343;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "[I")
    public int[] field5340;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "[I")
    public int[] field5351;

    @OriginalMember(owner = "client!hs", name = "h", descriptor = "[I")
    private int[] field5353;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "[I")
    public int[] field5356;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "[I")
    public int[] field5361;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "[I")
    public int[] field5366;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "[Z")
    public boolean[] field5349;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "[[I")
    public int[][] field5339;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIZ)I", line = 5)
    public final int method2847(int arg0, int arg1, int arg2, boolean arg3) {
        try {
            if (arg0 != -1149698992) {
                method2848(85);
            }
            field5350++;
            int var5 = 0;
            int var6 = 0;
            int var7 = this.field5366[arg2];
            class87 var8 = null;
            class87 var9 = this.field5343.method2243(var7 >> 16, 64);
            int var10 = var7 & 0xFFFF;
            if (var9 == null) {
                return var5;
            }
            if ((this.field5342 || class341.field5310) && arg1 != -1 && this.field5366.length > arg1) {
                int var11 = this.field5366[arg1];
                var8 = this.field5343.method2243(var11 >> 16, 64);
                var6 = var11 & 0xFFFF;
            }
            if (this.field5367) {
                var5 |= 0x200;
            }
            if (var9.method737(var10, -25695)) {
                var5 |= 0x80;
            }
            if (var9.method733(var10, (byte) 93)) {
                var5 |= 0x100;
            }
            if (var9.method731(true, var10)) {
                var5 |= 0x400;
            }
            if (var8 != null) {
                if (var8.method737(var6, -25695)) {
                    var5 |= 0x80;
                }
                if (var8.method733(var6, (byte) 93)) {
                    var5 |= 0x100;
                }
                if (var8.method731(true, var6)) {
                    var5 |= 0x400;
                }
            }
            if (this.field5353 != null && arg3) {
                if (this.field5353.length > arg2) {
                    int var12 = this.field5353[arg2];
                    if (var12 != 65535) {
                        class87 var13 = this.field5343.method2243(var12 >> 16, 64);
                        int var14 = var12 & 0xFFFF;
                        if (var13 != null) {
                            if (var13.method737(var14, arg0 + 1149673297)) {
                                var5 |= 0x80;
                            }
                            if (var13.method733(var14, (byte) 93)) {
                                var5 |= 0x100;
                            }
                            if (var13.method731(true, var14)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
                if ((this.field5342 || class341.field5310) && arg1 != -1 && arg1 < this.field5353.length) {
                    int var15 = this.field5353[arg1];
                    if (var15 != 65535) {
                        class87 var16 = this.field5343.method2243(var15 >> 16, 64);
                        int var17 = var15 & 0xFFFF;
                        if (var16 != null) {
                            if (var16.method737(var17, -25695)) {
                                var5 |= 0x80;
                            }
                            if (var16.method733(var17, (byte) 93)) {
                                var5 |= 0x100;
                            }
                            if (var16.method731(true, var17)) {
                                var5 |= 0x400;
                            }
                        }
                    }
                }
            }
            return var5 | 0x20;
        } catch (RuntimeException var19) {
            throw class759.method5498(var19, field5369[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 135)
    public static final void method2848(int arg0) {
        try {
            field5363++;
            class546.field8157.method1671(arg0 + 6084);
            class224.field3429.method5417(123);
            class513.field7378.method4818(16115);
            class417.field6144.method3032(false);
            class262.field4035.method4249(0);
            class540.field7920.method5003((byte) -126);
            class272.field4122.method2246((byte) -99);
            class771.field11208.method2504((byte) -106);
            class369.field5638.method4266(arg0 ^ 0x184C);
            class289.field4303.method2898((byte) -25);
            class747.field10862.method4704(true);
            class496.field7116.method4849(arg0 ^ 0x185C);
            class617.field9073.method4600(0);
            class643.field9316.method620(-30398);
            class329.field5185.method2538((byte) -104);
            class566.field8395.method3411((byte) -41);
            class596.field8739.method941(arg0 + 3104);
            class13.field162.method73((byte) -117);
            class640.field9301.method352((byte) -95);
            class208.field3189.method3056((byte) -112);
            class496.field7133.method3419(arg0 + 6237);
            class81.field924.method4986((byte) 19);
            class758.method5494(arg0 + 16445);
            class349.method2867(arg0 + 6183);
            class166.method1478((byte) 18);
            class674.method4955((byte) 66);
            if (class64.field667 != class31.field364) {
                for (int var1 = 0; var1 < class98.field1100.length; var1++) {
                    class98.field1100[var1] = null;
                }
                class275.field4154 = 0;
            }
            class281.method2302(125);
            class531.method4016((byte) 82);
            class398.method3138(false);
            class719.method5243(true);
            class399.method3145(11966);
            class782.field11383.method1559(arg0 ^ arg0);
            class610.field8913.method574();
            class513.method3865(83);
            class756.method5486((byte) -7);
            class315.field4987.method3642((byte) 64);
            class95.field1072.method3642((byte) 25);
            class669.field9714.method3642((byte) -74);
            class72.field794.method3642((byte) -72);
            class227.field3474.method3642((byte) -78);
            class550.field8195.method3642((byte) 87);
            class232.field3503.method3642((byte) -87);
            class589.field8661.method3642((byte) 21);
            class383.field5798.method3642((byte) -69);
            class614.field8975.method3642((byte) 53);
            class107.field1239.method3642((byte) -70);
            class657.field9489.method3642((byte) 57);
            class743.field10810.method3642((byte) -123);
            class753.field10953.method3642((byte) -82);
            class571.field8452.method3642((byte) 108);
            class647.field9368.method3642((byte) -118);
            class234.field3531.method3642((byte) -73);
            class489.field7024.method3642((byte) 52);
            class137.field1631.method3642((byte) 36);
            class411.field6075.method3642((byte) 51);
            class604.field8851.method3642((byte) 120);
            class122.field1440.method3642((byte) -90);
            class304.field4754.method3642((byte) 113);
            class366.field5598.method3642((byte) 8);
            class85.field952.method3642((byte) -78);
            class729.field10586.method3642((byte) 124);
            class710.field10289.method3642((byte) 11);
            class630.field9209.method3642((byte) 28);
            class443.field6513.method3642((byte) 17);
            class523.field7639.method3642((byte) -119);
            class342.field5319.method3642((byte) -90);
            class426.field6273.method3642((byte) -98);
            class433.field6362.method3642((byte) 30);
            class608.field8892.method1559(0);
            class757.field10996.method1559(0);
            class83.field928.method1559(0);
            class269.field4096.method1559(arg0 + 6177);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field5369[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Z", line = 237)
    public static final boolean method2849(int arg0, int arg1, int arg2) {
        try {
            field5344++;
            if (arg0 > -117) {
                method2848(-26);
            }
            return false;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5369[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)V", line = 249)
    public final void method2850(int arg0) {
        try {
            if (this.field5354 == -1) {
                if (this.field5349 == null) {
                    this.field5354 = 0;
                } else {
                    this.field5354 = 2;
                }
            }
            field5357++;
            if (this.field5368 == -1) {
                if (this.field5349 == null) {
                    this.field5368 = 0;
                } else {
                    this.field5368 = 2;
                }
            }
            int var2 = -53 / ((56 - arg0) / 50);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5369[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILka;IIII)Lka;", line = 286)
    public final class497 method2851(int arg0, class497 arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field5346++;
            int var7 = this.field5361[arg2];
            int var8 = this.field5366[arg2];
            class87 var9 = this.field5343.method2243(var8 >> 16, 64);
            int var10 = var8 & arg5;
            if (var9 == null) {
                return arg1.method332((byte) 1, arg4, true);
            }
            class87 var11 = null;
            if ((this.field5342 || class341.field5310) && arg0 != -1 && arg0 < this.field5366.length) {
                int var19 = this.field5366[arg0];
                var11 = this.field5343.method2243(var19 >> 16, arg5 ^ 0xFFBF);
                arg0 = var19 & 0xFFFF;
            }
            class87 var12 = null;
            class87 var13 = null;
            int var14 = 0;
            int var15 = 0;
            if (this.field5353 != null) {
                if (arg2 < this.field5353.length) {
                    var14 = this.field5353[arg2];
                    if (var14 != 65535) {
                        var12 = this.field5343.method2243(var14 >> 16, 64);
                        var14 &= 0xFFFF;
                    }
                }
                if ((this.field5342 || class341.field5310) && arg0 != -1 && this.field5353.length > arg0) {
                    var15 = this.field5353[arg0];
                    if (var15 != 65535) {
                        var13 = this.field5343.method2243(var15 >> 16, 64);
                        var15 &= 0xFFFF;
                    }
                }
            }
            if (this.field5367) {
                arg4 |= 0x200;
            }
            if (var9.method737(var10, -25695)) {
                arg4 |= 0x80;
            }
            if (var9.method733(var10, (byte) 93)) {
                arg4 |= 0x100;
            }
            if (var9.method731(true, var10)) {
                arg4 |= 0x400;
            }
            if (var12 != null) {
                if (var12.method737(var14, -25695)) {
                    arg4 |= 0x80;
                }
                if (var12.method733(var14, (byte) 93)) {
                    arg4 |= 0x100;
                }
                if (var12.method731(true, var14)) {
                    arg4 |= 0x400;
                }
            }
            if (var11 != null) {
                if (var11.method737(arg0, -25695)) {
                    arg4 |= 0x80;
                }
                if (var11.method733(arg0, (byte) 93)) {
                    arg4 |= 0x100;
                }
                if (var11.method731(true, arg0)) {
                    arg4 |= 0x400;
                }
            }
            if (var13 != null) {
                if (var13.method737(var15, -25695)) {
                    arg4 |= 0x80;
                }
                if (var13.method733(var15, (byte) 93)) {
                    arg4 |= 0x100;
                }
                if (var13.method731(true, var15)) {
                    arg4 |= 0x400;
                }
            }
            arg4 |= 0x20;
            class497 var16 = arg1.method332((byte) 1, arg4, true);
            var16.method3764(var7, var11, arg0, var9, this.field5367, var10, arg5 - 65533, arg3 + -1, 0);
            if (var12 != null) {
                var16.method3764(var7, var13, var15, var12, this.field5367, var14, arg5 - 65533, arg3 - 1, 0);
            }
            return var16;
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field5369[5] + arg0 + ',' + (arg1 == null ? field5369[3] : field5369[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILib;)V", line = 423)
    public final void method2852(int arg0, class163 arg1) {
        try {
            while (true) {
                int var3 = arg1.method1455((byte) 62);
                if (var3 == 0) {
                    field5341++;
                    if (arg0 <= 84) {
                        this.method2852(68, null);
                        return;
                    }
                    return;
                }
                this.method2853(arg1, var3, (byte) -97);
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5369[8] + arg0 + ',' + (arg1 == null ? field5369[3] : field5369[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Lib;IB)V", line = 462)
    private final void method2853(class163 arg0, int arg1, byte arg2) {
        try {
            if (arg2 > -49) {
                this.field5367 = false;
            }
            if (arg1 == 1) {
                int var4 = arg0.method1445((byte) 122);
                this.field5361 = new int[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field5361[var5] = arg0.method1445((byte) 104);
                }
                this.field5366 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    this.field5366[var6] = arg0.method1445((byte) 101);
                }
                for (int var7 = 0; var7 < var4; var7++) {
                    this.field5366[var7] = (arg0.method1445((byte) 116) << 16) + this.field5366[var7];
                }
            } else if (arg1 == 2) {
                this.field5345 = arg0.method1445((byte) 106);
            } else if (arg1 == 3) {
                this.field5349 = new boolean[256];
                int var8 = arg0.method1455((byte) 62);
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5349[arg0.method1455((byte) 62)] = true;
                }
            } else if (arg1 == 5) {
                this.field5348 = arg0.method1455((byte) 62);
            } else if (arg1 == 6) {
                this.field5338 = arg0.method1445((byte) 119);
            } else if (arg1 == 7) {
                this.field5365 = arg0.method1445((byte) 112);
            } else if (arg1 == 8) {
                this.field5355 = arg0.method1455((byte) 62);
            } else if (arg1 == 9) {
                this.field5368 = arg0.method1455((byte) 62);
            } else if (arg1 == 10) {
                this.field5354 = arg0.method1455((byte) 62);
            } else if (arg1 == 11) {
                this.field5364 = arg0.method1455((byte) 62);
            } else if (arg1 == 12) {
                int var10 = arg0.method1455((byte) 62);
                this.field5353 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field5353[var11] = arg0.method1445((byte) 123);
                }
                for (int var12 = 0; var12 < var10; var12++) {
                    this.field5353[var12] += arg0.method1445((byte) 101) << 16;
                }
            } else if (arg1 == 13) {
                int var16 = arg0.method1445((byte) 113);
                this.field5339 = new int[var16][];
                for (int var17 = 0; var17 < var16; var17++) {
                    int var18 = arg0.method1455((byte) 62);
                    if (var18 > 0) {
                        this.field5339[var17] = new int[var18];
                        this.field5339[var17][0] = arg0.method1436((byte) 101);
                        for (int var19 = 1; var19 < var18; var19++) {
                            this.field5339[var17][var19] = arg0.method1445((byte) 114);
                        }
                    }
                }
            } else if (arg1 == 14) {
                this.field5367 = true;
            } else if (arg1 == 15) {
                this.field5342 = true;
            } else if (arg1 == 16) {
                this.field5352 = true;
            } else if (arg1 == 18) {
                this.field5360 = true;
            } else if (arg1 == 19) {
                if (this.field5340 == null) {
                    this.field5340 = new int[this.field5339.length];
                    for (int var13 = 0; var13 < this.field5339.length; var13++) {
                        this.field5340[var13] = 255;
                    }
                }
                this.field5340[arg0.method1455((byte) 62)] = arg0.method1455((byte) 62);
            } else if (arg1 == 20) {
                if (this.field5356 == null || this.field5351 == null) {
                    this.field5356 = new int[this.field5339.length];
                    this.field5351 = new int[this.field5339.length];
                    for (int var14 = 0; var14 < this.field5339.length; var14++) {
                        this.field5356[var14] = 256;
                        this.field5351[var14] = 256;
                    }
                }
                int var15 = arg0.method1455((byte) 62);
                this.field5356[var15] = arg0.method1445((byte) 101);
                this.field5351[var15] = arg0.method1445((byte) 116);
            }
            field5358++;
        } catch (RuntimeException var21) {
            throw class759.method5498(var21, field5369[6] + (arg0 == null ? field5369[3] : field5369[2]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIBIBILka;)Lka;", line = 664)
    public final class497 method2854(int arg0, int arg1, int arg2, byte arg3, int arg4, byte arg5, int arg6, class497 arg7) {
        try {
            if (arg5 <= 51) {
                this.field5368 = -94;
            }
            field5347++;
            int var9 = this.field5361[arg2];
            int var15 = this.field5366[arg2];
            class87 var10 = this.field5343.method2243(var15 >> 16, 64);
            int var16 = var15 & 0xFFFF;
            if (var10 == null) {
                return arg7.method332(arg3, arg6, true);
            }
            class87 var11 = null;
            if ((this.field5342 || class341.field5310) && arg4 != -1 && this.field5366.length > arg4) {
                int var17 = this.field5366[arg4];
                var11 = this.field5343.method2243(var17 >> 16, 64);
                arg4 = var17 & 0xFFFF;
            }
            if (this.field5367) {
                arg6 |= 0x200;
            }
            if (var10.method737(var16, -25695)) {
                arg6 |= 0x80;
            }
            if (var10.method733(var16, (byte) 93)) {
                arg6 |= 0x100;
            }
            if (var10.method731(true, var16)) {
                arg6 |= 0x400;
            }
            if (var11 != null) {
                if (var11.method737(arg4, -25695)) {
                    arg6 |= 0x80;
                }
                if (var11.method733(arg4, (byte) 93)) {
                    arg6 |= 0x100;
                }
                if (var11.method731(true, arg4)) {
                    arg6 |= 0x400;
                }
            }
            arg6 |= 0x20;
            class497 var12 = arg7.method332(arg3, arg6, true);
            var12.method3764(var9, var11, arg4, var10, this.field5367, var16, 2, arg1 - 1, arg0);
            return var12;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field5369[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field5369[3] : field5369[2]) + ')');
        }
    }

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2855(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x60);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2856(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 12;
                    break;
                case 1:
                    var10005 = 51;
                    break;
                case 2:
                    var10005 = 84;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 96;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
