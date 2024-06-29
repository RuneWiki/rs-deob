import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class412 {

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public int field5915 = -1;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public int field5917 = -1;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
    public boolean field5921 = false;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field5910 = 2;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public int field5922 = -1;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public int field5930 = 99;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
    public boolean field5927 = false;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
    public int field5931 = 5;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
    public int field5920 = -1;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    public int field5934 = -1;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "Z")
    public boolean field5935 = false;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "Z")
    public boolean field5926 = false;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
    public static int field5928 = 0;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public static int field5924 = 0;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Lwq;")
    public static class92 field5908 = new class92();

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field5912;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field5914;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field5916;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public int field5929;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field5932;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field5936;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ltq;")
    public static class376 field5909;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "[I")
    private int[] field5913;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
    public int[] field5918;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "[I")
    public int[] field5925;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[Z")
    public boolean[] field5911;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[[I")
    public int[][] field5907;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIZ)I")
    public final int method2625(int arg0, int arg1, int arg2, boolean arg3) {
        field5932++;
        int var5 = 0;
        int var6 = 0;
        if (arg2 < 6) {
            return 100;
        }
        int var7 = this.field5925[arg1];
        class64 var8 = null;
        class64 var9 = class229.method1526(var7 >> 16, -16026);
        int var10 = var7 & 0xFFFF;
        if (var9 == null) {
            return var5;
        }
        if ((this.field5935 || class404.field5818) && arg0 != -1 && arg0 < this.field5925.length) {
            int var11 = this.field5925[arg0];
            var8 = class229.method1526(var11 >> 16, -16026);
            var6 = var11 & 0xFFFF;
        }
        if (this.field5926) {
            var5 |= 0x200;
        }
        if (var9.method362((byte) -85, var10)) {
            var5 |= 0x80;
        }
        if (var9.method366(255, var10)) {
            var5 |= 0x100;
        }
        if (var8 != null) {
            if (var8.method362((byte) -85, var6)) {
                var5 |= 0x80;
            }
            if (var8.method366(255, var6)) {
                var5 |= 0x100;
            }
        }
        if (this.field5913 != null && arg3) {
            if (arg1 < this.field5913.length) {
                int var12 = this.field5913[arg1];
                if (var12 != 65535) {
                    class64 var13 = class229.method1526(var12 >> 16, -16026);
                    int var14 = var12 & 0xFFFF;
                    if (var13 != null) {
                        if (var13.method362((byte) -85, var14)) {
                            var5 |= 0x80;
                        }
                        if (var13.method366(255, var14)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
            if ((this.field5935 || class404.field5818) && arg0 != -1 && this.field5913.length > arg0) {
                int var15 = this.field5913[arg0];
                if (var15 != 65535) {
                    class64 var16 = class229.method1526(var15 >> 16, -16026);
                    int var17 = var15 & 0xFFFF;
                    if (var16 != null) {
                        if (var16.method362((byte) -85, var17)) {
                            var5 |= 0x80;
                        }
                        if (var16.method366(255, var17)) {
                            var5 |= 0x100;
                        }
                    }
                }
            }
        }
        return var5 | 0x20;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILae;IIII)V")
    public static final void method2626(int arg0, class134 arg1, int arg2, int arg3, int arg4, int arg5) {
        arg1.method660(arg3, arg5, arg0 + arg3, arg4 + arg5);
        field5916++;
        arg1.method827(arg5, arg3, arg4, -109, arg0, -16777216);
        if (class310.field4383 < 100) {
            return;
        }
        float var6 = (float) class308.field4364 / (float) class308.field4359;
        int var7 = arg0;
        int var8 = arg4;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg4 / var6);
        }
        int var9 = (arg4 - var8) / 2 + arg5;
        int var10 = (arg0 - var7) / 2 + arg3;
        if (class376.field5308 == null || class376.field5308.method765() != arg0 || arg4 != class376.field5308.method759()) {
            class308.method2036(class308.field4368, class308.field4367 + class308.field4364, class308.field4368 + class308.field4359, class308.field4367, var10, var9, var10 + var7, var9 - -var8);
            class308.method2021(arg1);
            class376.field5308 = arg1.method614(var10, var9, var7, var8, false);
        }
        class376.field5308.method2446(var10, var9);
        int var11 = class447.field6412 * var7 / class308.field4359;
        int var12 = class262.field3743 * var8 / class308.field4364;
        int var13 = class366.field5199 * var7 / class308.field4359 + var10;
        int var14 = var9 + var8 - (class68.field765 * var8 / class308.field4364) - var12;
        int var15 = -1996554240;
        if (class384.field5425 == 1) {
            var15 = -1996488705;
        }
        arg1.method653(var13, var14, var11, var12, var15, 1);
        int var16 = 19 % ((-arg2 - 28) / 60);
        arg1.method594(var13, var14, var11, var12, var15, 0);
        if (class327.field4643 <= 0) {
            return;
        }
        int var17;
        if (class152.field1877 > 50) {
            var17 = 500 - (class152.field1877 * 5);
        } else {
            var17 = class152.field1877 * 5;
        }
        for (class324 var18 = (class324) class308.field4346.method506((byte) -128); var18 != null; var18 = (class324) class308.field4346.method514(true)) {
            class246 var19 = class153.method927(0, var18.field4613);
            if (class366.method2340((byte) -113, var19)) {
                if (class3.field27 == var18.field4613) {
                    int var22 = var18.field4615 * var7 / class308.field4359 + var10;
                    int var23 = var9 + ((class308.field4364 - var18.field4609) * var8 / class308.field4364);
                    arg1.method827(var23 - 2, var22 + -2, 4, -106, 4, var17 << 24 | 0xFFFF00);
                } else if (class204.field2928 != -1 && class204.field2928 == var19.field3481) {
                    int var20 = var10 + (var18.field4615 * var7 / class308.field4359);
                    int var21 = (class308.field4364 - var18.field4609) * var8 / class308.field4364 + var9;
                    arg1.method827(var21 - 2, var20 + -2, 4, -84, 4, var17 << 24 | 0xFFFF00);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILbk;I)Lbk;")
    public final class210 method2627(int arg0, int arg1, int arg2, int arg3, class210 arg4, int arg5) {
        field5923++;
        int var7 = this.field5918[arg1];
        if (arg0 > -31) {
            this.field5913 = null;
        }
        int var8 = this.field5925[arg1];
        class64 var9 = class229.method1526(var8 >> 16, -16026);
        int var10 = var8 & 0xFFFF;
        if (var9 == null) {
            return arg4.method1411((byte) 1, arg2, true);
        }
        class64 var11 = null;
        if ((this.field5935 || class404.field5818) && arg3 != -1 && arg3 < this.field5925.length) {
            int var12 = this.field5925[arg3];
            var11 = class229.method1526(var12 >> 16, -16026);
            arg3 = var12 & 0xFFFF;
        }
        class64 var13 = null;
        class64 var14 = null;
        int var15 = 0;
        int var16 = 0;
        if (this.field5913 != null) {
            if (arg1 < this.field5913.length) {
                var15 = this.field5913[arg1];
                if (var15 != 65535) {
                    var13 = class229.method1526(var15 >> 16, -16026);
                    var15 &= 0xFFFF;
                }
            }
            if ((this.field5935 || class404.field5818) && arg3 != -1 && this.field5913.length > arg3) {
                var16 = this.field5913[arg3];
                if (var16 != 65535) {
                    var14 = class229.method1526(var16 >> 16, -16026);
                    var16 &= 0xFFFF;
                }
            }
        }
        if (this.field5926) {
            arg2 |= 0x200;
        }
        if (var9.method362((byte) -85, var10)) {
            arg2 |= 0x80;
        }
        if (var9.method366(255, var10)) {
            arg2 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method362((byte) -85, var15)) {
                arg2 |= 0x80;
            }
            if (var13.method366(255, var15)) {
                arg2 |= 0x100;
            }
        }
        if (var11 != null) {
            if (var11.method362((byte) -85, arg3)) {
                arg2 |= 0x80;
            }
            if (var11.method366(255, arg3)) {
                arg2 |= 0x100;
            }
        }
        if (var14 != null) {
            if (var14.method362((byte) -85, var16)) {
                arg2 |= 0x80;
            }
            if (var14.method366(255, var16)) {
                arg2 |= 0x100;
            }
        }
        int var17 = arg2 | 0x20;
        class210 var18 = arg4.method1411((byte) 1, var17, true);
        var18.method1384(var9, this.field5926, var11, arg5 - 1, 0, 0, arg3, var10, var7);
        if (var13 != null) {
            var18.method1384(var13, this.field5926, var14, arg5 - 1, 0, 0, var16, var15, var7);
        }
        return var18;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public final void method2628(int arg0) {
        if (arg0 <= 85) {
            this.field5918 = null;
        }
        field5933++;
        if (this.field5920 == -1) {
            if (this.field5911 == null) {
                this.field5920 = 0;
            } else {
                this.field5920 = 2;
            }
        }
        if (this.field5934 != -1) {
            return;
        }
        if (this.field5911 == null) {
            this.field5934 = 0;
        } else {
            this.field5934 = 2;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLdg;)V")
    public final void method2629(byte arg0, class236 arg1) {
        while (true) {
            int var3 = arg1.method1574(-92);
            if (var3 == 0) {
                if (arg0 <= 115) {
                    this.method2629((byte) 39, (class236) null);
                }
                field5914++;
                return;
            }
            this.method2632(var3, (byte) 32, arg1);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static void method2630(byte arg0) {
        if (arg0 >= 18) {
            field5908 = null;
            field5909 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIBILbk;)Lbk;")
    public final class210 method2631(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class210 arg7) {
        field5919++;
        int var9 = this.field5918[arg0];
        int var10 = this.field5925[arg0];
        class64 var11 = class229.method1526(var10 >> 16, -16026);
        int var12 = var10 & 0xFFFF;
        if (var11 == null) {
            return arg7.method1411(arg5, arg4, true);
        }
        class64 var13 = null;
        if (arg6 != 1527433072) {
            return null;
        }
        if ((this.field5935 || class404.field5818) && arg1 != -1 && this.field5925.length > arg1) {
            int var14 = this.field5925[arg1];
            var13 = class229.method1526(var14 >> 16, -16026);
            arg1 = var14 & 0xFFFF;
        }
        if (this.field5926) {
            arg4 |= 0x200;
        }
        if (var11.method362((byte) -85, var12)) {
            arg4 |= 0x80;
        }
        if (var11.method366(255, var12)) {
            arg4 |= 0x100;
        }
        if (var13 != null) {
            if (var13.method362((byte) -85, arg1)) {
                arg4 |= 0x80;
            }
            if (var13.method366(255, arg1)) {
                arg4 |= 0x100;
            }
        }
        int var15 = arg4 | 0x20;
        class210 var16 = arg7.method1411(arg5, var15, true);
        var16.method1384(var11, this.field5926, var13, arg3 - 1, arg2, arg6 - 1527433072, arg1, var12, var9);
        return var16;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBLdg;)V")
    private final void method2632(int arg0, byte arg1, class236 arg2) {
        if (arg1 < 11) {
            this.field5930 = -60;
        }
        if (arg0 == 1) {
            int var4 = arg2.method1617((byte) 48);
            this.field5918 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5918[var5] = arg2.method1617((byte) 48);
            }
            this.field5925 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field5925[var6] = arg2.method1617((byte) 48);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field5925[var7] += arg2.method1617((byte) 48) << 16;
            }
        } else if (arg0 == 2) {
            this.field5915 = arg2.method1617((byte) 48);
        } else if (arg0 == 3) {
            this.field5911 = new boolean[256];
            int var15 = arg2.method1574(-59);
            for (int var16 = 0; var16 < var15; var16++) {
                this.field5911[arg2.method1574(-85)] = true;
            }
        } else if (arg0 == 4) {
            this.field5921 = true;
        } else if (arg0 == 5) {
            this.field5931 = arg2.method1574(-51);
        } else if (arg0 == 6) {
            this.field5917 = arg2.method1617((byte) 48);
        } else if (arg0 == 7) {
            this.field5922 = arg2.method1617((byte) 48);
        } else if (arg0 == 8) {
            this.field5930 = arg2.method1574(-26);
        } else if (arg0 == 9) {
            this.field5934 = arg2.method1574(-10);
        } else if (arg0 == 10) {
            this.field5920 = arg2.method1574(-62);
        } else if (arg0 == 11) {
            this.field5910 = arg2.method1574(-54);
        } else if (arg0 == 12) {
            int var12 = arg2.method1574(-27);
            this.field5913 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field5913[var13] = arg2.method1617((byte) 48);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field5913[var14] += arg2.method1617((byte) 48) << 16;
            }
        } else if (arg0 == 13) {
            int var8 = arg2.method1617((byte) 48);
            this.field5907 = new int[var8][];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = arg2.method1574(-25);
                if (var10 > 0) {
                    this.field5907[var9] = new int[var10];
                    this.field5907[var9][0] = arg2.method1616(false);
                    for (int var11 = 1; var11 < var10; var11++) {
                        this.field5907[var9][var11] = arg2.method1617((byte) 48);
                    }
                }
            }
        } else if (arg0 == 14) {
            this.field5926 = true;
        } else if (arg0 == 15) {
            this.field5935 = true;
        } else if (arg0 == 16) {
            this.field5927 = true;
        }
        field5912++;
    }
}
