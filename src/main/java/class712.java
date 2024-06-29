import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class712 extends class378 {

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "F")
    public float field10018;

    @OriginalMember(owner = "client!vha", name = "m", descriptor = "F")
    public float field10023;

    @OriginalMember(owner = "client!vha", name = "n", descriptor = "F")
    public float field10024;

    @OriginalMember(owner = "client!vha", name = "t", descriptor = "F")
    public float field10030;

    @OriginalMember(owner = "client!vha", name = "u", descriptor = "F")
    public float field10031;

    @OriginalMember(owner = "client!vha", name = "v", descriptor = "F")
    public float field10032;

    @OriginalMember(owner = "client!vha", name = "A", descriptor = "F")
    public float field10037;

    @OriginalMember(owner = "client!vha", name = "C", descriptor = "F")
    public float field10039;

    @OriginalMember(owner = "client!vha", name = "E", descriptor = "F")
    public float field10041;

    @OriginalMember(owner = "client!vha", name = "F", descriptor = "F")
    public float field10042;

    @OriginalMember(owner = "client!vha", name = "G", descriptor = "F")
    public float field10043;

    @OriginalMember(owner = "client!vha", name = "H", descriptor = "F")
    public float field10044;

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "I")
    public static int field10014;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field10015;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "I")
    public static int field10016;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "I")
    public static int field10017;

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "I")
    public static int field10019;

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "I")
    public static int field10020;

    @OriginalMember(owner = "client!vha", name = "k", descriptor = "I")
    public static int field10021;

    @OriginalMember(owner = "client!vha", name = "l", descriptor = "I")
    public static int field10022;

    @OriginalMember(owner = "client!vha", name = "o", descriptor = "I")
    public static int field10025;

    @OriginalMember(owner = "client!vha", name = "q", descriptor = "I")
    public static int field10027;

    @OriginalMember(owner = "client!vha", name = "r", descriptor = "I")
    public static int field10028;

    @OriginalMember(owner = "client!vha", name = "s", descriptor = "I")
    public static int field10029;

    @OriginalMember(owner = "client!vha", name = "w", descriptor = "I")
    public static int field10033;

    @OriginalMember(owner = "client!vha", name = "x", descriptor = "I")
    public static int field10034;

    @OriginalMember(owner = "client!vha", name = "y", descriptor = "I")
    public static int field10035;

    @OriginalMember(owner = "client!vha", name = "z", descriptor = "I")
    public static int field10036;

    @OriginalMember(owner = "client!vha", name = "B", descriptor = "I")
    public static int field10038;

    @OriginalMember(owner = "client!vha", name = "D", descriptor = "I")
    public static int field10040;

    @OriginalMember(owner = "client!vha", name = "I", descriptor = "I")
    public static int field10045;

    @OriginalMember(owner = "client!vha", name = "K", descriptor = "I")
    public static int field10046;

    @OriginalMember(owner = "client!vha", name = "L", descriptor = "I")
    public static int field10047;

    @OriginalMember(owner = "client!vha", name = "M", descriptor = "I")
    public static int field10048;

    @OriginalMember(owner = "client!vha", name = "N", descriptor = "I")
    public static int field10049;

    @OriginalMember(owner = "client!vha", name = "p", descriptor = "Ljava/lang/Object;")
    public static Object field10026;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "(I)V", line = 5)
    public final void method1939(int arg0) {
        field10022++;
        this.field10039 = 1.0F;
        this.field10031 = this.field10044 = class453.field6514[arg0 & 0x3FFF];
        this.field10043 = class453.field6517[arg0 & 0x3FFF];
        this.field10018 = this.field10041 = this.field10023 = this.field10024 = this.field10042 = this.field10032 = this.field10037 = 0.0F;
        this.field10030 = -this.field10043;
    }

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "(I)V", line = 26)
    public final void method1966(int arg0) {
        field10034++;
        this.field10031 = 1.0F;
        this.field10039 = this.field10044 = class453.field6514[arg0 & 0x3FFF];
        this.field10032 = class453.field6517[arg0 & 0x3FFF];
        this.field10024 = -this.field10032;
        this.field10018 = this.field10043 = this.field10041 = this.field10023 = this.field10042 = this.field10030 = this.field10037 = 0.0F;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(I)V", line = 38)
    public final void method1942(int arg0) {
        field10035++;
        float var2 = class453.field6514[arg0 & 0x3FFF];
        float var3 = class453.field6517[arg0 & 0x3FFF];
        float var4 = this.field10031;
        float var5 = this.field10018;
        float var6 = this.field10043;
        this.field10031 = var2 * var4 - this.field10023 * var3;
        float var7 = this.field10041;
        this.field10018 = var2 * var5 - this.field10039 * var3;
        this.field10023 = this.field10023 * var2 + var3 * var4;
        this.field10039 = this.field10039 * var2 + var3 * var5;
        this.field10043 = var2 * var6 - this.field10024 * var3;
        this.field10024 = this.field10024 * var2 + var3 * var6;
        this.field10041 = var2 * var7 - (this.field10042 * var3);
        this.field10042 = this.field10042 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "()Leh;", line = 67)
    public final class378 method1951() {
        field10046++;
        class712 var1 = new class712();
        var1.field10032 = this.field10032;
        var1.field10030 = this.field10030;
        var1.field10044 = this.field10044;
        var1.field10039 = this.field10039;
        var1.field10023 = this.field10023;
        var1.field10042 = this.field10042;
        var1.field10024 = this.field10024;
        var1.field10018 = this.field10018;
        var1.field10031 = this.field10031;
        var1.field10037 = this.field10037;
        var1.field10043 = this.field10043;
        var1.field10041 = this.field10041;
        return var1;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)V", line = 96)
    public static final void method4026(byte arg0) {
        field10021++;
        if (class679.field9654 != null) {
            for (int var1 = 0; var1 < class395.field5607; var1++) {
                class679.field9654[var1] = null;
            }
            class679.field9654 = null;
        }
        if (class498.field7080 != null) {
            for (int var2 = 0; var2 < class115.field1451; var2++) {
                class498.field7080[var2] = null;
            }
            class498.field7080 = null;
        }
        if (class359.field5221 != null) {
            for (int var3 = 0; var3 < class445.field6329; var3++) {
                class359.field5221[var3] = null;
            }
            class359.field5221 = null;
        }
        class12.field248 = null;
        class718.field10099 = -1;
        class286.field4384 = -1;
        int var4 = -120 % ((-arg0 - 67) / 59);
        class728.field10187 = null;
        class487.field6897 = null;
    }

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "(I)V", line = 148)
    public final void method1940(int arg0) {
        this.field10044 = 1.0F;
        field10040++;
        this.field10031 = this.field10039 = class453.field6514[arg0 & 0x3FFF];
        this.field10023 = class453.field6517[arg0 & 0x3FFF];
        this.field10043 = this.field10041 = this.field10024 = this.field10042 = this.field10030 = this.field10032 = this.field10037 = 0.0F;
        this.field10018 = -this.field10023;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III)V", line = 161)
    public final void method1952(int arg0, int arg1, int arg2) {
        field10020++;
        this.field10041 += arg0;
        this.field10042 += arg1;
        this.field10037 += arg2;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(III)V", line = 171)
    public final void method1959(int arg0, int arg1, int arg2) {
        field10036++;
        this.field10041 = arg0;
        this.field10031 = this.field10039 = this.field10044 = 1.0F;
        this.field10023 = this.field10030 = this.field10018 = this.field10032 = this.field10043 = this.field10024 = 0.0F;
        this.field10042 = arg1;
        this.field10037 = arg2;
    }

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "(I)[F", line = 185)
    public final float[] method4027(int arg0) {
        class697.field9847[1] = this.field10023;
        class697.field9847[0] = this.field10031;
        field10049++;
        class697.field9847[9] = this.field10024;
        class697.field9847[6] = this.field10032;
        class697.field9847[4] = this.field10018;
        if (arg0 > -110) {
            return null;
        }
        class697.field9847[10] = this.field10044;
        class697.field9847[2] = this.field10030;
        class697.field9847[13] = 0.0F;
        class697.field9847[8] = this.field10043;
        class697.field9847[5] = this.field10039;
        class697.field9847[12] = 0.0F;
        class697.field9847[14] = 0.0F;
        return class697.field9847;
    }

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "(I)V", line = 208)
    public final void method1957(int arg0) {
        field10016++;
        float var2 = class453.field6514[arg0 & 0x3FFF];
        float var3 = class453.field6517[arg0 & 0x3FFF];
        float var4 = this.field10023;
        float var5 = this.field10039;
        float var6 = this.field10024;
        this.field10023 = var2 * var4 - (this.field10030 * var3);
        float var7 = this.field10042;
        this.field10030 = this.field10030 * var2 + var3 * var4;
        this.field10039 = var2 * var5 - (this.field10032 * var3);
        this.field10032 = this.field10032 * var2 + var3 * var5;
        this.field10024 = var2 * var6 - this.field10044 * var3;
        this.field10042 = var2 * var7 - this.field10037 * var3;
        this.field10044 = this.field10044 * var2 + var3 * var6;
        this.field10037 = this.field10037 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIII)V", line = 237)
    public final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10029++;
        float var7 = class453.field6514[arg3 & 0x3FFF];
        float var8 = class453.field6517[arg3 & 0x3FFF];
        float var9 = class453.field6514[arg4 & 0x3FFF];
        float var10 = class453.field6517[arg4 & 0x3FFF];
        float var11 = class453.field6514[arg5 & 0x3FFF];
        float var12 = class453.field6517[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field10018 = var7 * var12;
        this.field10030 = var7 * var10;
        this.field10044 = var7 * var9;
        this.field10039 = var7 * var11;
        this.field10023 = -var9 * var12 + var10 * var13;
        this.field10024 = var9 * var13 + var10 * var12;
        this.field10032 = -var8;
        this.field10031 = var9 * var11 + var10 * var14;
        this.field10043 = -var10 * var11 + var9 * var14;
        this.field10037 = (float) (-arg0) * this.field10030 - (float) arg1 * this.field10032 - ((float) arg2 * this.field10044);
        this.field10041 = (float) (-arg0) * this.field10031 - ((float) arg1 * this.field10018) - (float) arg2 * this.field10043;
        this.field10042 = (float) (-arg0) * this.field10023 - (float) arg1 * this.field10039 - (float) arg2 * this.field10024;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Leh;B)V", line = 272)
    public final void method4028(class378 arg0, byte arg1) {
        field10047++;
        class712 var3 = (class712) arg0;
        this.field10031 = var3.field10031;
        this.field10043 = var3.field10030;
        this.field10018 = var3.field10023;
        this.field10024 = var3.field10032;
        this.field10030 = var3.field10043;
        this.field10039 = var3.field10039;
        this.field10023 = var3.field10018;
        if (arg1 != 49) {
            this.field10023 = -0.95484877F;
        }
        this.field10032 = var3.field10024;
        this.field10041 = -(this.field10043 * var3.field10037 + this.field10031 * var3.field10041 + this.field10018 * var3.field10042);
        this.field10044 = var3.field10044;
        this.field10042 = -(this.field10024 * var3.field10037 + this.field10039 * var3.field10042 + this.field10023 * var3.field10041);
        this.field10037 = -(this.field10044 * var3.field10037 + this.field10032 * var3.field10042 + this.field10030 * var3.field10041);
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(III[I)V", line = 297)
    public final void method1961(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg0 - this.field10041);
        field10028++;
        int var6 = (int) ((float) arg2 - this.field10037);
        int var7 = (int) ((float) arg1 - this.field10042);
        arg3[1] = (int) ((float) var6 * this.field10032 + (float) var5 * this.field10018 + (float) var7 * this.field10039);
        arg3[0] = (int) ((float) var6 * this.field10030 + (float) var5 * this.field10031 + (float) var7 * this.field10023);
        arg3[2] = (int) ((float) var6 * this.field10044 + (float) var5 * this.field10043 + (float) var7 * this.field10024);
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "()V", line = 311)
    public final void method1956() {
        this.field10023 = this.field10030 = this.field10018 = this.field10032 = this.field10043 = this.field10024 = this.field10041 = this.field10042 = this.field10037 = 0.0F;
        this.field10031 = this.field10039 = this.field10044 = 1.0F;
        field10019++;
    }

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "(I)V", line = 320)
    public static void method4029(int arg0) {
        field10026 = null;
        if (arg0 != 8066) {
            field10026 = null;
        }
    }

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(I)V", line = 332)
    public final void method1937(int arg0) {
        field10027++;
        float var2 = class453.field6514[arg0 & 0x3FFF];
        float var3 = class453.field6517[arg0 & 0x3FFF];
        float var4 = this.field10031;
        float var5 = this.field10018;
        float var6 = this.field10043;
        this.field10031 = this.field10030 * var3 + var2 * var4;
        float var7 = this.field10041;
        this.field10030 = this.field10030 * var2 - (var3 * var4);
        this.field10018 = this.field10032 * var3 + var2 * var5;
        this.field10043 = this.field10044 * var3 + var2 * var6;
        this.field10032 = this.field10032 * var2 - var3 * var5;
        this.field10041 = this.field10037 * var3 + var2 * var7;
        this.field10044 = this.field10044 * var2 - var3 * var6;
        this.field10037 = this.field10037 * var2 - (var3 * var7);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(BFIIIFF)V", line = 360)
    public final void method4030(byte arg0, float arg1, int arg2, int arg3, int arg4, float arg5, float arg6) {
        if (arg3 == 0) {
            this.field10039 = arg2;
            this.field10023 = this.field10030 = this.field10018 = this.field10032 = this.field10043 = this.field10024 = 0.0F;
            this.field10031 = arg4;
            this.field10044 = 1.0F;
        } else {
            float var8 = class453.field6514[arg3 & 0x3FFF];
            float var9 = class453.field6517[arg3 & 0x3FFF];
            this.field10018 = (float) arg2 * -var9;
            this.field10023 = (float) arg4 * var9;
            this.field10044 = 1.0F;
            this.field10030 = this.field10032 = this.field10043 = this.field10024 = 0.0F;
            this.field10031 = (float) arg4 * var8;
            this.field10039 = (float) arg2 * var8;
        }
        field10015++;
        if (arg0 != -13) {
            this.field10030 = -1.3436235F;
        }
        this.field10042 = arg6;
        this.field10041 = arg5;
        this.field10037 = arg1;
    }

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "(III[I)V", line = 395)
    public final void method1965(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field10043 + (float) arg0 * this.field10031 + (float) arg1 * this.field10018);
        arg3[1] = (int) ((float) arg2 * this.field10024 + (float) arg0 * this.field10023 + (float) arg1 * this.field10039);
        arg3[2] = (int) ((float) arg2 * this.field10044 + (float) arg0 * this.field10030 + (float) arg1 * this.field10032);
        field10014++;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(III[I)V", line = 405)
    public final void method1968(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field10043 + (float) arg0 * this.field10031 + (float) arg1 * this.field10018 + this.field10041);
        arg3[1] = (int) ((float) arg2 * this.field10024 + (float) arg0 * this.field10023 + (float) arg1 * this.field10039 + this.field10042);
        field10017++;
        arg3[2] = (int) ((float) arg2 * this.field10044 + (float) arg0 * this.field10030 + (float) arg1 * this.field10032 + this.field10037);
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(FBFF[FF)V", line = 415)
    public final void method4031(float arg0, byte arg1, float arg2, float arg3, float[] arg4, float arg5) {
        field10048++;
        if (arg1 != -23) {
            this.method1939(6);
        }
        arg4[2] = this.field10044 * arg2 + this.field10032 * arg0 + this.field10030 * arg3;
        arg4[0] = this.field10043 * arg2 + this.field10031 * arg3 + this.field10018 * arg0;
        float var8;
        float var9;
        float var10;
        if ((arg3 > 0.00390625F) || (arg3 < -0.00390625F)) {
            float var12 = -arg5 / arg3;
            var9 = this.field10031 * var12 + this.field10041;
            var10 = this.field10023 * var12 + this.field10042;
            var8 = this.field10030 * var12 + this.field10037;
        } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var11 = -arg5 / arg0;
            var8 = this.field10032 * var11 + this.field10037;
            var10 = this.field10039 * var11 + this.field10042;
            var9 = this.field10018 * var11 + this.field10041;
        } else {
            float var7 = -arg5 / arg2;
            var8 = this.field10044 * var7 + this.field10037;
            var9 = this.field10043 * var7 + this.field10041;
            var10 = this.field10024 * var7 + this.field10042;
        }
        arg4[1] = this.field10024 * arg2 + this.field10039 * arg0 + this.field10023 * arg3;
        arg4[3] = -(arg4[2] * var8 + arg4[0] * var9 + arg4[1] * var10);
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V", line = 460)
    public final void method4032(byte arg0) {
        field10045++;
        this.field10042 = -this.field10042;
        this.field10039 = -this.field10039;
        this.field10024 = -this.field10024;
        this.field10023 = -this.field10023;
        this.field10032 = -this.field10032;
        this.field10037 = -this.field10037;
        if (arg0 != -78) {
            this.method4028(null, (byte) -71);
        }
        this.field10030 = -this.field10030;
        this.field10044 = -this.field10044;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Leh;)V", line = 480)
    public final void method1950(class378 arg0) {
        field10038++;
        class712 var2 = (class712) arg0;
        this.field10039 = var2.field10039;
        this.field10030 = var2.field10030;
        this.field10044 = var2.field10044;
        this.field10041 = var2.field10041;
        this.field10018 = var2.field10018;
        this.field10032 = var2.field10032;
        this.field10042 = var2.field10042;
        this.field10024 = var2.field10024;
        this.field10031 = var2.field10031;
        this.field10023 = var2.field10023;
        this.field10037 = var2.field10037;
        this.field10043 = var2.field10043;
    }

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "(I)[F", line = 502)
    public final float[] method4033(int arg0) {
        class697.field9847[9] = this.field10024;
        class697.field9847[0] = this.field10031;
        class697.field9847[12] = this.field10041;
        class697.field9847[10] = this.field10044;
        class697.field9847[5] = this.field10039;
        class697.field9847[13] = this.field10042;
        class697.field9847[4] = this.field10018;
        class697.field9847[6] = this.field10032;
        field10025++;
        class697.field9847[14] = this.field10037;
        class697.field9847[2] = this.field10030;
        class697.field9847[8] = this.field10043;
        class697.field9847[1] = this.field10023;
        return arg0 == -8826 ? class697.field9847 : null;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "([I)V", line = 532)
    public final void method1962(int[] arg0) {
        field10033++;
        float var2 = (float) arg0[0] - this.field10041;
        float var3 = (float) arg0[1] - this.field10042;
        float var4 = (float) arg0[2] - this.field10037;
        arg0[0] = (int) (this.field10030 * var4 + this.field10031 * var2 + this.field10023 * var3);
        arg0[2] = (int) (this.field10044 * var4 + this.field10043 * var2 + this.field10024 * var3);
        arg0[1] = (int) (this.field10032 * var4 + this.field10039 * var3 + this.field10018 * var2);
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "()V", line = 549)
    public class712() {
        this.method1956();
    }
}
