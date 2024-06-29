import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class358 extends class261 {

    @OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
    public int field5254 = 0;

    @OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
    public int field5245;

    @OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
    public int field5246;

    @OriginalMember(owner = "client!jq", name = "m", descriptor = "I")
    public int field5247;

    @OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!jq", name = "q", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!jq", name = "v", descriptor = "I")
    public int field5256;

    @OriginalMember(owner = "client!jq", name = "w", descriptor = "I")
    public int field5257;

    @OriginalMember(owner = "client!jq", name = "x", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!jq", name = "y", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!jq", name = "z", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!jq", name = "A", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!jq", name = "B", descriptor = "I")
    public int field5262;

    @OriginalMember(owner = "client!jq", name = "D", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!jq", name = "E", descriptor = "I")
    public int field5265;

    @OriginalMember(owner = "client!jq", name = "G", descriptor = "I")
    public int field5267;

    @OriginalMember(owner = "client!jq", name = "s", descriptor = "Lig;")
    public class163 field5253;

    @OriginalMember(owner = "client!jq", name = "r", descriptor = "Ljc;")
    public class306 field5252;

    @OriginalMember(owner = "client!jq", name = "C", descriptor = "Lsf;")
    public class366 field5263;

    @OriginalMember(owner = "client!jq", name = "n", descriptor = "Lbs;")
    public class487 field5248;

    @OriginalMember(owner = "client!jq", name = "F", descriptor = "Lbs;")
    public class487 field5266;

    @OriginalMember(owner = "client!jq", name = "I", descriptor = "Z")
    public boolean field5268;

    @OriginalMember(owner = "client!jq", name = "o", descriptor = "[I")
    public int[] field5249;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 3)
    public static final void method2205(int arg0) {
        field5260++;
        int var1 = class87.field1782.length;
        if (arg0 <= 60) {
            method2209(94, -44, -57);
        }
        for (int var2 = 0; var2 < var1; var2++) {
            if (class87.field1782[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class145.field2441; var4++) {
                    if (class58.field1227[var2] == class372.field5458[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class372.field5458[class145.field2441] = class58.field1227[var2];
                    var3 = class145.field2441++;
                }
                class289 var5 = new class289(class87.field1782[var2]);
                int var6 = 0;
                while (class87.field1782[var2].length > var5.field4399 && var6 < 511 && class341.field5128 < 1023) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method1841((byte) -121);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class58.field1227[var2] >> 8) * 64 + var10 - class496.field7292;
                    int var13 = (class58.field1227[var2] & 0xFF) * 64 + var11 - class212.field3378;
                    class51 var14 = class102.field1942.method847(var5.method1841((byte) 88), 0);
                    class435 var15 = (class435) class209.field3337.method1622((long) var7, 61);
                    if (var15 == null && (var14.field1047 & 0x1) > 0 && class419.field6303 == var9 && var12 >= 0 && class339.field5099 > (var12 + var14.field1050) && var13 >= 0 && class484.field7129 > var14.field1050 + var13) {
                        class163 var16 = new class163();
                        var16.field7789 = var7;
                        class435 var17 = new class435(var16);
                        class209.field3337.method1618(var17, (long) var7, -1);
                        class525.field7636[class334.field5054++] = var17;
                        class515.field7477[class341.field5128++] = var7;
                        var16.field7796 = class62.field1268;
                        var16.method1159(0, var14);
                        var16.method3164(var16.field2613.field1050, -1);
                        var16.field7778 = var16.field2613.field1065 << 3;
                        var16.method3156(true, 125, var16.field2613.field1077 + 4 << 11 & 0x38F2);
                        var16.method1153(true, (byte) 95, var12, var16.method2241(-70), var13, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lgh;IIBIILo;Lta;)V", line = 108)
    public static final void method2206(class388 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, class24 arg6, class144 arg7) {
        field5261++;
        if (arg6 == null || arg3 != -54) {
            return;
        }
        int var8;
        if (class510.field7435 == 4) {
            var8 = (int) class525.field7631 & 0x3FFF;
        } else {
            var8 = (int) class525.field7631 + class1.field49 & 0x3FFF;
        }
        int var9 = Math.max(arg0.field5745 / 2, arg0.field5712 / 2) + 10;
        int var10 = arg5 * arg5 + (arg4 * arg4);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class407.field6169[var8];
        int var12 = class407.field6168[var8];
        if (class510.field7435 != 4) {
            var11 = var11 * 256 / (class60.field1242 + 256);
            var12 = var12 * 256 / (class60.field1242 + 256);
        }
        int var13 = arg4 * var11 + arg5 * var12 >> 15;
        int var14 = arg4 * var12 - (arg5 * var11) >> 15;
        arg6.method166(arg0.field5745 / 2 + arg2 + var13 - arg6.method147() / 2, arg0.field5712 / 2 + arg1 + -var14 + -(arg6.method165() / 2), arg7, arg2, arg1);
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I", line = 154)
    public static final int method2207(int arg0) {
        field5251++;
        return arg0 == 0 ? class5.field96 : -3;
    }

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "(I)V", line = 173)
    public final void method2208(int arg0) {
        field5258++;
        int var2 = this.field5256;
        if (arg0 < 28) {
            this.method2208(-55);
        }
        if (this.field5252 != null) {
            class306 var3 = this.field5252.method1951(class402.field6080, 0);
            if (var3 == null) {
                this.field5264 = 0;
                this.field5246 = 0;
                this.field5265 = 0;
                this.field5256 = -1;
                this.field5249 = null;
                this.field5247 = 0;
            } else {
                this.field5256 = var3.field4562;
                this.field5249 = var3.field4607;
                this.field5265 = var3.field4577;
                this.field5246 = var3.field4646;
                this.field5264 = var3.field4585;
                this.field5247 = var3.field4565 << 7;
            }
        } else if (this.field5253 != null) {
            int var4 = class405.method2518(this.field5253, -5662);
            if (var2 != var4) {
                this.field5256 = var4;
                class51 var5 = this.field5253.field2613;
                if (var5.field1038 != null) {
                    var5 = var5.method475(class402.field6080, -1);
                }
                if (var5 == null) {
                    this.field5264 = this.field5247 = 0;
                } else {
                    this.field5264 = var5.field1056;
                    this.field5247 = var5.field1043 << 7;
                }
            }
        } else if (this.field5263 != null) {
            this.field5256 = class268.method1705((byte) -82, this.field5263);
            this.field5264 = this.field5263.field5347;
            this.field5247 = this.field5263.field5380 << 7;
        }
        if (this.field5256 != var2 && this.field5248 != null) {
            class288.field4357.method2157(this.field5248);
            this.field5248 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)I", line = 263)
    public static final int method2209(int arg0, int arg1, int arg2) {
        if (arg2 > -55) {
            return 123;
        }
        field5259++;
        int var3 = class137.method1033((byte) 122, arg0 - 1, arg1 + -1) + class137.method1033((byte) -77, arg0 + 1, arg1 + -1) + class137.method1033((byte) -125, arg0 - 1, arg1 - -1) + class137.method1033((byte) -118, arg0 + 1, arg1 + 1);
        int var4 = class137.method1033((byte) -41, arg0 - 1, arg1) + class137.method1033((byte) 106, arg0 + 1, arg1) + class137.method1033((byte) 85, arg0, arg1 - 1) + class137.method1033((byte) -48, arg0, arg1 - -1);
        int var5 = class137.method1033((byte) -124, arg0, arg1);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
