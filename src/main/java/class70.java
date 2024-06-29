import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class70 extends class104 {

    @OriginalMember(owner = "client!gj", name = "T", descriptor = "[Ljava/lang/String;")
    private static final String[] field1034 = new String[] { method745(method744("j\b&n~")), method745(method744("c\u0017dF")), method745(method744("j\b&}~")), method745(method744("vL&\u0004+")), method745(method744("j\b&m\u0017%")), method745(method744("j\b&g~")), method745(method744("j\b&i~")), method745(method744("j\b&n\u0017%")), method745(method744("j\b&x~")), method745(method744("j\b&c~")), method745(method744("j\b&h\u0017%")), method745(method744("j\b&l~")), method745(method744("j\b&b~")), method745(method744("j\b&|~")), method745(method744("j\b&o\u0017%")), method745(method744("j\b&~~")), method745(method744("j\b&h~")), method745(method744("j\b&f~")), method745(method744("j\b&k~")), method745(method744("j\b&y~")), method745(method744("j\b&m~")), method745(method744("j\b&d~")), method745(method744("j\b&\u007f~")), method745(method744("j\b&a~")), method745(method744("j\b&i\u0017%")), method745(method744("j\b&e~")), method745(method744("j\b&\u0016?c\u000b|\u0014~")), method745(method744("j\b&{~")), method745(method744("j\b&o~")) };

    @OriginalMember(owner = "client!gj", name = "x", descriptor = "F")
    public float field1000;

    @OriginalMember(owner = "client!gj", name = "y", descriptor = "F")
    public float field1001;

    @OriginalMember(owner = "client!gj", name = "F", descriptor = "F")
    public float field1002;

    @OriginalMember(owner = "client!gj", name = "B", descriptor = "F")
    public float field1005;

    @OriginalMember(owner = "client!gj", name = "O", descriptor = "F")
    public float field1010;

    @OriginalMember(owner = "client!gj", name = "n", descriptor = "F")
    public float field1018;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "F")
    public float field1027;

    @OriginalMember(owner = "client!gj", name = "S", descriptor = "F")
    public float field1028;

    @OriginalMember(owner = "client!gj", name = "v", descriptor = "F")
    public float field1030;

    @OriginalMember(owner = "client!gj", name = "A", descriptor = "F")
    public float field1032;

    @OriginalMember(owner = "client!gj", name = "t", descriptor = "F")
    public float field995;

    @OriginalMember(owner = "client!gj", name = "o", descriptor = "F")
    public float field996;

    @OriginalMember(owner = "client!gj", name = "q", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!gj", name = "w", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!gj", name = "R", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!gj", name = "M", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!gj", name = "H", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!gj", name = "p", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!gj", name = "D", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!gj", name = "I", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!gj", name = "r", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!gj", name = "P", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!gj", name = "G", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!gj", name = "s", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!gj", name = "N", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!gj", name = "u", descriptor = "I")
    public static int field1020;

    @OriginalMember(owner = "client!gj", name = "E", descriptor = "I")
    public static int field1021;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!gj", name = "K", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!gj", name = "m", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!gj", name = "J", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!gj", name = "C", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!gj", name = "L", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!gj", name = "Q", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(III[I)V")
    public final void method718(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            field1025++;
            arg3[2] = (int) ((float) arg2 * this.field1001 + (float) arg0 * this.field1000 + (float) arg1 * this.field1032);
            arg3[0] = (int) ((float) arg2 * this.field1030 + (float) arg0 * this.field1010 + (float) arg1 * this.field1005);
            arg3[1] = (int) ((float) arg2 * this.field1002 + (float) arg0 * this.field1018 + (float) arg1 * this.field1027);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1034[27] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "(I)V")
    public final void method719(int arg0) {
        try {
            this.field1027 = 1.0F;
            field1031++;
            this.field1010 = this.field1001 = class615.field8782[arg0 & 0x3FFF];
            this.field1030 = class615.field8783[arg0 & 0x3FFF];
            this.field1000 = -this.field1030;
            this.field1005 = this.field996 = this.field1018 = this.field1002 = this.field1028 = this.field1032 = this.field995 = 0.0F;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[20] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)[F")
    public final float[] method720(byte arg0) {
        try {
            if (arg0 != -22) {
                return null;
            }
            class200.field2959[1] = this.field1018;
            class200.field2959[2] = this.field1000;
            class200.field2959[4] = this.field1005;
            class200.field2959[0] = this.field1010;
            class200.field2959[12] = 0.0F;
            class200.field2959[6] = this.field1032;
            class200.field2959[13] = 0.0F;
            class200.field2959[8] = this.field1030;
            class200.field2959[9] = this.field1002;
            class200.field2959[10] = this.field1001;
            class200.field2959[5] = this.field1027;
            class200.field2959[14] = 0.0F;
            field1006++;
            return class200.field2959;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(III)V")
    public final void method721(int arg0, int arg1, int arg2) {
        try {
            this.field1028 += arg1;
            this.field996 += arg0;
            this.field995 += arg2;
            field1033++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1034[19] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIII)V")
    public final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        try {
            field1020++;
            float var7 = class615.field8782[arg3 & 0x3FFF];
            float var8 = class615.field8783[arg3 & 0x3FFF];
            float var9 = class615.field8782[arg4 & 0x3FFF];
            float var10 = class615.field8783[arg4 & 0x3FFF];
            float var11 = class615.field8782[arg5 & 0x3FFF];
            float var12 = class615.field8783[arg5 & 0x3FFF];
            float var13 = var8 * var11;
            float var14 = var8 * var12;
            this.field1000 = var7 * var10;
            this.field1001 = var7 * var9;
            this.field1005 = var7 * var12;
            this.field1032 = -var8;
            this.field1027 = var7 * var11;
            this.field1030 = -var10 * var11 + var9 * var14;
            this.field1010 = var9 * var11 + var10 * var14;
            this.field1002 = var9 * var13 + var10 * var12;
            this.field1018 = -var9 * var12 + var10 * var13;
            this.field995 = (float) (-arg0) * this.field1000 - ((float) arg1 * this.field1032) - (float) arg2 * this.field1001;
            this.field996 = (float) (-arg0) * this.field1010 - ((float) arg1 * this.field1005) - ((float) arg2 * this.field1030);
            this.field1028 = (float) (-arg0) * this.field1018 - (float) arg1 * this.field1027 - (float) arg2 * this.field1002;
        } catch (RuntimeException var16) {
            throw class665.method4799(var16, field1034[14] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ljava/util/Random;IB)I")
    public static final int method723(Random arg0, int arg1, byte arg2) {
        try {
            field1023++;
            if (arg2 != 58) {
                method734(null, -89, -42, -10, null, 82, true, null, -97, 98, null, null);
            }
            if (arg1 <= 0) {
                throw new IllegalArgumentException();
            } else if (class357.method2858(arg1, false)) {
                return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
            } else {
                int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
                int var4;
                do {
                    var4 = arg0.nextInt();
                } while (var4 >= var3);
                return class80.method793(true, arg1, var4);
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1034[7] + (arg0 == null ? field1034[1] : field1034[3]) + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "(I)V")
    public final void method724(int arg0) {
        try {
            field1026++;
            float var2 = class615.field8782[arg0 & 0x3FFF];
            float var3 = class615.field8783[arg0 & 0x3FFF];
            float var4 = this.field1010;
            float var5 = this.field1005;
            float var6 = this.field1030;
            this.field1010 = var2 * var4 - (this.field1018 * var3);
            float var7 = this.field996;
            this.field1018 = this.field1018 * var2 + var3 * var4;
            this.field1005 = var2 * var5 - (this.field1027 * var3);
            this.field1030 = var2 * var6 - this.field1002 * var3;
            this.field1027 = this.field1027 * var2 + var3 * var5;
            this.field996 = var2 * var7 - (this.field1028 * var3);
            this.field1002 = this.field1002 * var2 + var3 * var6;
            this.field1028 = this.field1028 * var2 + var3 * var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1034[24] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(FF[FFFI)V")
    public final void method725(float arg0, float arg1, float[] arg2, float arg3, float arg4, int arg5) {
        try {
            field1011++;
            if (arg5 <= -105) {
                arg2[0] = this.field1030 * arg4 + this.field1010 * arg1 + this.field1005 * arg0;
                float var8;
                float var9;
                float var10;
                if ((arg1 > 0.00390625F) || (arg1 < -0.00390625F)) {
                    float var7 = -arg3 / arg1;
                    var8 = this.field1010 * var7 + this.field996;
                    var9 = this.field1018 * var7 + this.field1028;
                    var10 = this.field1000 * var7 + this.field995;
                } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
                    float var12 = -arg3 / arg0;
                    var9 = this.field1027 * var12 + this.field1028;
                    var10 = this.field1032 * var12 + this.field995;
                    var8 = this.field1005 * var12 + this.field996;
                } else {
                    float var11 = -arg3 / arg4;
                    var10 = this.field1001 * var11 + this.field995;
                    var9 = this.field1002 * var11 + this.field1028;
                    var8 = this.field1030 * var11 + this.field996;
                }
                arg2[2] = this.field1001 * arg4 + this.field1032 * arg0 + this.field1000 * arg1;
                arg2[1] = this.field1002 * arg4 + this.field1027 * arg0 + this.field1018 * arg1;
                arg2[3] = -(arg2[2] * var10 + arg2[0] * var8 + arg2[1] * var9);
            }
        } catch (RuntimeException var14) {
            throw class665.method4799(var14, field1034[13] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1034[1] : field1034[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "(I)V")
    public final void method726(int arg0) {
        try {
            this.field1028 = -this.field1028;
            this.field1001 = -this.field1001;
            field1016++;
            this.field1002 = -this.field1002;
            this.field1000 = -this.field1000;
            this.field1027 = -this.field1027;
            if (arg0 != 0) {
                this.field1018 = -0.53186864F;
            }
            this.field1032 = -this.field1032;
            this.field995 = -this.field995;
            this.field1018 = -this.field1018;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[25] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "(I)[F")
    public final float[] method727(int arg0) {
        try {
            class200.field2959[6] = this.field1032;
            class200.field2959[13] = this.field1028;
            class200.field2959[4] = this.field1005;
            class200.field2959[5] = this.field1027;
            field1003++;
            class200.field2959[12] = this.field996;
            class200.field2959[9] = this.field1002;
            class200.field2959[0] = this.field1010;
            class200.field2959[8] = this.field1030;
            class200.field2959[1] = this.field1018;
            class200.field2959[14] = this.field995;
            class200.field2959[10] = this.field1001;
            class200.field2959[arg0] = this.field1000;
            return class200.field2959;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lqa;B)V")
    public final void method728(class104 arg0, byte arg1) {
        try {
            field1008++;
            if (arg1 < 47) {
                this.method720((byte) -128);
            }
            class70 var3 = (class70) arg0;
            this.field1005 = var3.field1018;
            this.field1010 = var3.field1010;
            this.field1030 = var3.field1000;
            this.field1018 = var3.field1005;
            this.field1002 = var3.field1032;
            this.field1000 = var3.field1030;
            this.field1027 = var3.field1027;
            this.field1032 = var3.field1002;
            this.field996 = -(this.field1030 * var3.field995 + this.field1010 * var3.field996 + this.field1005 * var3.field1028);
            this.field1001 = var3.field1001;
            this.field1028 = -(this.field1002 * var3.field995 + this.field1027 * var3.field1028 + this.field1018 * var3.field996);
            this.field995 = -(this.field1001 * var3.field995 + this.field1032 * var3.field1028 + this.field1000 * var3.field996);
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1034[22] + (arg0 == null ? field1034[1] : field1034[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "(I)V")
    public final void method729(int arg0) {
        try {
            field999++;
            this.field1001 = 1.0F;
            this.field1010 = this.field1027 = class615.field8782[arg0 & 0x3FFF];
            this.field1018 = class615.field8783[arg0 & 0x3FFF];
            this.field1030 = this.field996 = this.field1002 = this.field1028 = this.field1000 = this.field1032 = this.field995 = 0.0F;
            this.field1005 = -this.field1018;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
    public static final void method730(int arg0, int arg1, Rectangle[] arg2) throws class142 {
        try {
            field1015++;
            if (arg1 != 14) {
                method738(-115, 94, null);
            }
            if (class101.field1360 == 1) {
                class349.field5060.method224(arg2, arg0, class224.field3263, class615.field8779);
            } else {
                class349.field5060.method224(arg2, arg0, 0, 0);
            }
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1034[2] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIFFIF)V")
    public final void method731(int arg0, byte arg1, int arg2, float arg3, float arg4, int arg5, float arg6) {
        try {
            if (arg2 == 0) {
                this.field1001 = 1.0F;
                this.field1010 = arg5;
                this.field1027 = arg0;
                this.field1018 = this.field1000 = this.field1005 = this.field1032 = this.field1030 = this.field1002 = 0.0F;
            } else {
                float var8 = class615.field8782[arg2 & 0x3FFF];
                float var9 = class615.field8783[arg2 & 0x3FFF];
                this.field1005 = (float) arg0 * -var9;
                this.field1018 = (float) arg5 * var9;
                this.field1027 = (float) arg0 * var8;
                this.field1010 = (float) arg5 * var8;
                this.field1001 = 1.0F;
                this.field1000 = this.field1032 = this.field1030 = this.field1002 = 0.0F;
            }
            field997++;
            this.field995 = arg4;
            this.field1028 = arg3;
            this.field996 = arg6;
            int var10 = -61 % ((arg1 + 43) / 49);
        } catch (RuntimeException var12) {
            throw class665.method4799(var12, field1034[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(III[I)V")
    public final void method732(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            int var7 = (int) ((float) arg0 - this.field996);
            int var9 = (int) ((float) arg2 - this.field995);
            field1009++;
            int var8 = (int) ((float) arg1 - this.field1028);
            arg3[1] = (int) ((float) var9 * this.field1032 + (float) var7 * this.field1005 + (float) var8 * this.field1027);
            arg3[2] = (int) ((float) var9 * this.field1001 + (float) var7 * this.field1030 + (float) var8 * this.field1002);
            arg3[0] = (int) ((float) var9 * this.field1000 + (float) var7 * this.field1010 + (float) var8 * this.field1018);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1034[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lqa;)V")
    public final void method733(class104 arg0) {
        try {
            field1021++;
            class70 var2 = (class70) arg0;
            this.field1027 = var2.field1027;
            this.field996 = var2.field996;
            this.field1010 = var2.field1010;
            this.field1000 = var2.field1000;
            this.field1028 = var2.field1028;
            this.field1032 = var2.field1032;
            this.field1030 = var2.field1030;
            this.field1005 = var2.field1005;
            this.field1001 = var2.field1001;
            this.field1018 = var2.field1018;
            this.field995 = var2.field995;
            this.field1002 = var2.field1002;
        } catch (RuntimeException var4) {
            throw class665.method4799(var4, field1034[9] + (arg0 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Laa;IIILcd;IZLjava/lang/String;IILvo;Lda;)V")
    public static final void method734(class685 arg0, int arg1, int arg2, int arg3, class161 arg4, int arg5, boolean arg6, String arg7, int arg8, int arg9, class782 arg10, class216 arg11) {
        try {
            field1014++;
            int var12;
            if (class596.field8579 == 4) {
                var12 = (int) class349.field5057 & 0x3FFF;
            } else {
                var12 = (int) class349.field5057 + class801.field11658 & 0x3FFF;
            }
            if (!arg6) {
                method734(null, 21, -99, -64, null, 42, false, null, 98, 84, null, null);
            }
            int var13 = Math.max(arg10.field11295 / 2, arg10.field11244 / 2) + 10;
            int var14 = arg1 * arg1 + arg8 * arg8;
            if (var14 <= (var13 * var13)) {
                int var15 = class487.field7151[var12];
                int var16 = class487.field7150[var12];
                if (class596.field8579 != 4) {
                    var16 = var16 * 256 / (class398.field5794 + 256);
                    var15 = var15 * 256 / (class398.field5794 + 256);
                }
                int var17 = arg1 * var16 + arg8 * var15 >> 14;
                int var18 = arg8 * var16 - (arg1 * var15) >> 14;
                int var19 = arg4.method1358(100, 93, arg7, null);
                int var20 = arg4.method1359(null, 100, (byte) 116, arg7, 0);
                int var21 = var17 - var19 / 2;
                if (var21 >= -arg10.field11295 && arg10.field11295 >= var21 && (-arg10.field11244) <= var18 && var18 <= arg10.field11244) {
                    arg11.method1815(arg9 + arg10.field11244 / 2 - var20 - var18 - arg2, arg5, arg10.field11295 / 2 + (var21 + arg3), null, 1, 50, arg9, 0, 0, arg3, null, 126, 0, arg0, var19, arg7);
                }
            }
        } catch (RuntimeException var23) {
            throw class665.method4799(var23, field1034[12] + (arg0 == null ? field1034[1] : field1034[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field1034[1] : field1034[3]) + ',' + arg5 + ',' + arg6 + ',' + (arg7 == null ? field1034[1] : field1034[3]) + ',' + arg8 + ',' + arg9 + ',' + (arg10 == null ? field1034[1] : field1034[3]) + ',' + (arg11 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "()V")
    public final void method735() {
        try {
            this.field1018 = this.field1000 = this.field1005 = this.field1032 = this.field1030 = this.field1002 = this.field996 = this.field1028 = this.field995 = 0.0F;
            field1019++;
            this.field1010 = this.field1027 = this.field1001 = 1.0F;
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1034[18] + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V")
    public final void method736(int arg0) {
        try {
            field1007++;
            float var2 = class615.field8782[arg0 & 0x3FFF];
            float var3 = class615.field8783[arg0 & 0x3FFF];
            float var4 = this.field1010;
            float var5 = this.field1005;
            float var6 = this.field1030;
            float var7 = this.field996;
            this.field1010 = this.field1000 * var3 + var2 * var4;
            this.field1005 = this.field1032 * var3 + var2 * var5;
            this.field1000 = this.field1000 * var2 - var3 * var4;
            this.field1032 = this.field1032 * var2 - (var3 * var5);
            this.field1030 = this.field1001 * var3 + var2 * var6;
            this.field996 = this.field995 * var3 + var2 * var7;
            this.field1001 = this.field1001 * var2 - var3 * var6;
            this.field995 = this.field995 * var2 - var3 * var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1034[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "()Lqa;")
    public final class104 method737() {
        try {
            field1022++;
            class70 var1 = new class70();
            var1.field1018 = this.field1018;
            var1.field1027 = this.field1027;
            var1.field1002 = this.field1002;
            var1.field1028 = this.field1028;
            var1.field1010 = this.field1010;
            var1.field1030 = this.field1030;
            var1.field995 = this.field995;
            var1.field1000 = this.field1000;
            var1.field996 = this.field996;
            var1.field1032 = this.field1032;
            var1.field1005 = this.field1005;
            var1.field1001 = this.field1001;
            return var1;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[0] + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method738(int arg0, int arg1, String arg2) {
        try {
            field1017++;
            int var3 = class689.field9642;
            int[] var4 = class599.field8595;
            boolean var5 = false;
            if (arg0 == 9) {
                for (int var6 = 0; var6 < var3; var6++) {
                    class339 var7 = class748.field10666[var4[var6]];
                    if (var7 != null && class203.field2988 != var7 && var7.field4905 != null && var7.field4905.equalsIgnoreCase(arg2)) {
                        class125 var8 = null;
                        if (arg1 == 1) {
                            var8 = class135.field1749;
                        } else if (arg1 == 4) {
                            var8 = class580.field8391;
                        } else if (arg1 == 5) {
                            var8 = class470.field6884;
                        } else if (arg1 == 6) {
                            var8 = class646.field9181;
                        } else if (arg1 == 7) {
                            var8 = class321.field4375;
                        } else if (arg1 == 9) {
                            var8 = class561.field8157;
                        }
                        var5 = true;
                        if (var8 != null) {
                            class147.field1893++;
                            class274 var9 = class375.method2969((byte) 1, var8, class60.field916.field11100);
                            var9.field3885.method5082(arg0 ^ 0xFFFFFF89, var4[var6]);
                            var9.field3885.method5114(255, 0);
                            class60.field916.method5608(var9, arg0 ^ 0x74A2);
                        }
                        break;
                    }
                }
                if (!var5) {
                    class756.method5485(4, (byte) 8, class537.field7851.method4068((byte) -49, class405.field5883) + arg2);
                }
            }
        } catch (RuntimeException var11) {
            throw class665.method4799(var11, field1034[21] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public final void method739(int arg0, int arg1, int arg2) {
        try {
            this.field996 = arg0;
            field998++;
            this.field1018 = this.field1000 = this.field1005 = this.field1032 = this.field1030 = this.field1002 = 0.0F;
            this.field995 = arg2;
            this.field1010 = this.field1027 = this.field1001 = 1.0F;
            this.field1028 = arg1;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field1034[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III[I)V")
    public final void method740(int arg0, int arg1, int arg2, int[] arg3) {
        try {
            arg3[2] = (int) ((float) arg2 * this.field1001 + (float) arg0 * this.field1000 + (float) arg1 * this.field1032 + this.field995);
            arg3[1] = (int) ((float) arg2 * this.field1002 + (float) arg0 * this.field1018 + (float) arg1 * this.field1027 + this.field1028);
            arg3[0] = (int) ((float) arg2 * this.field1030 + (float) arg0 * this.field1010 + (float) arg1 * this.field1005 + this.field996);
            field1012++;
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1034[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V")
    public final void method741(int arg0) {
        try {
            field1013++;
            float var2 = class615.field8782[arg0 & 0x3FFF];
            float var3 = class615.field8783[arg0 & 0x3FFF];
            float var4 = this.field1018;
            float var5 = this.field1027;
            float var6 = this.field1002;
            this.field1018 = var2 * var4 - (this.field1000 * var3);
            float var7 = this.field1028;
            this.field1027 = var2 * var5 - (this.field1032 * var3);
            this.field1000 = this.field1000 * var2 + var3 * var4;
            this.field1002 = var2 * var6 - this.field1001 * var3;
            this.field1032 = this.field1032 * var2 + var3 * var5;
            this.field1028 = var2 * var7 - this.field995 * var3;
            this.field1001 = this.field1001 * var2 + var3 * var6;
            this.field995 = this.field995 * var2 + var3 * var7;
        } catch (RuntimeException var9) {
            throw class665.method4799(var9, field1034[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V")
    public class70() {
        try {
            this.method735();
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field1034[26] + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V")
    public final void method742(int arg0) {
        try {
            field1024++;
            this.field1010 = 1.0F;
            this.field1027 = this.field1001 = class615.field8782[arg0 & 0x3FFF];
            this.field1032 = class615.field8783[arg0 & 0x3FFF];
            this.field1005 = this.field1030 = this.field996 = this.field1018 = this.field1028 = this.field1000 = this.field995 = 0.0F;
            this.field1002 = -this.field1032;
        } catch (RuntimeException var3) {
            throw class665.method4799(var3, field1034[28] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "([I)V")
    public final void method743(int[] arg0) {
        try {
            field1029++;
            float var2 = (float) arg0[0] - this.field996;
            float var3 = (float) arg0[1] - this.field1028;
            float var4 = (float) arg0[2] - this.field995;
            arg0[0] = (int) (this.field1000 * var4 + this.field1018 * var3 + this.field1010 * var2);
            arg0[1] = (int) (this.field1032 * var4 + this.field1027 * var3 + this.field1005 * var2);
            arg0[2] = (int) (this.field1001 * var4 + this.field1030 * var2 + this.field1002 * var3);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field1034[4] + (arg0 == null ? field1034[1] : field1034[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method744(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x56);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!gj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method745(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 13;
                    break;
                case 1:
                    var10005 = 98;
                    break;
                case 2:
                    var10005 = 8;
                    break;
                case 3:
                    var10005 = 42;
                    break;
                default:
                    var10005 = 86;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
