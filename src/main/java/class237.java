import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class237 extends class123 {

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public static int field3019 = 100;

    @OriginalMember(owner = "client!km", name = "g", descriptor = "F")
    public float field3011;

    @OriginalMember(owner = "client!km", name = "h", descriptor = "F")
    public float field3012;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "F")
    public float field3013;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "F")
    public float field3016;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "F")
    public float field3018;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "F")
    public float field3022;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "F")
    public float field3032;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "F")
    public float field3035;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "F")
    public float field3037;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "F")
    public float field3038;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "F")
    public float field3040;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "F")
    public float field3042;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public static int field3024;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public static int field3041;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "(III)V", line = 5)
    public final void method229(int arg0, int arg1, int arg2) {
        field3043++;
        this.field3042 = arg1;
        this.field3040 = this.field3013 = this.field3012 = 1.0F;
        this.field3037 = this.field3038 = this.field3022 = this.field3035 = this.field3011 = this.field3018 = 0.0F;
        this.field3032 = arg0;
        this.field3016 = arg2;
    }

    @OriginalMember(owner = "client!km", name = "ja", descriptor = "(I)V", line = 17)
    public final void method226(int arg0) {
        field3026++;
        float var2 = class295.field3776[arg0 & 0x3FFF];
        float var3 = class295.field3769[arg0 & 0x3FFF];
        float var4 = this.field3040;
        float var5 = this.field3022;
        float var6 = this.field3011;
        float var7 = this.field3032;
        this.field3040 = this.field3038 * var3 + var2 * var4;
        this.field3022 = this.field3035 * var3 + var2 * var5;
        this.field3038 = this.field3038 * var2 - var3 * var4;
        this.field3011 = this.field3012 * var3 + var2 * var6;
        this.field3035 = this.field3035 * var2 - var3 * var5;
        this.field3032 = this.field3016 * var3 + var2 * var7;
        this.field3012 = this.field3012 * var2 - var3 * var6;
        this.field3016 = this.field3016 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)[F", line = 44)
    public final float[] method1423(int arg0) {
        class528.field7789[12] = 0.0F;
        field3020++;
        class528.field7789[2] = this.field3038;
        class528.field7789[10] = this.field3012;
        class528.field7789[4] = this.field3022;
        class528.field7789[6] = this.field3035;
        class528.field7789[8] = this.field3011;
        class528.field7789[13] = 0.0F;
        class528.field7789[5] = this.field3013;
        class528.field7789[1] = this.field3037;
        if (arg0 != -26552) {
            this.field3011 = -0.5445163F;
        }
        class528.field7789[9] = this.field3018;
        class528.field7789[0] = this.field3040;
        class528.field7789[14] = 0.0F;
        return class528.field7789;
    }

    @OriginalMember(owner = "client!km", name = "o", descriptor = "(III)V", line = 67)
    public final void method231(int arg0, int arg1, int arg2) {
        this.field3032 += arg0;
        field3028++;
        this.field3016 += arg2;
        this.field3042 += arg1;
    }

    @OriginalMember(owner = "client!km", name = "xa", descriptor = "()V", line = 83)
    public final void method223() {
        this.field3040 = this.field3013 = this.field3012 = 1.0F;
        field3014++;
        this.field3037 = this.field3038 = this.field3022 = this.field3035 = this.field3011 = this.field3018 = this.field3032 = this.field3042 = this.field3016 = 0.0F;
    }

    @OriginalMember(owner = "client!km", name = "s", descriptor = "(IIIIII)V", line = 96)
    public final void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3044++;
        float var7 = class295.field3776[arg3 & 0x3FFF];
        float var8 = class295.field3769[arg3 & 0x3FFF];
        float var9 = class295.field3776[arg4 & 0x3FFF];
        float var10 = class295.field3769[arg4 & 0x3FFF];
        float var11 = class295.field3776[arg5 & 0x3FFF];
        float var12 = class295.field3769[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field3038 = var7 * var10;
        this.field3037 = -var9 * var12 + var10 * var13;
        this.field3040 = var9 * var11 + var10 * var14;
        this.field3012 = var7 * var9;
        this.field3018 = var9 * var13 + var10 * var12;
        this.field3011 = -var10 * var11 + var9 * var14;
        this.field3013 = var7 * var11;
        this.field3022 = var7 * var12;
        this.field3035 = -var8;
        this.field3032 = (float) (-arg0) * this.field3040 - (float) arg1 * this.field3022 - ((float) arg2 * this.field3011);
        this.field3042 = (float) (-arg0) * this.field3037 - (float) arg1 * this.field3013 - ((float) arg2 * this.field3018);
        this.field3016 = (float) (-arg0) * this.field3038 - ((float) arg1 * this.field3035) - (float) arg2 * this.field3012;
    }

    @OriginalMember(owner = "client!km", name = "m", descriptor = "([I)V", line = 132)
    public final void method238(int[] arg0) {
        field3017++;
        float var2 = (float) arg0[0] - this.field3032;
        float var3 = (float) arg0[1] - this.field3042;
        float var4 = (float) arg0[2] - this.field3016;
        arg0[1] = (int) (this.field3035 * var4 + this.field3022 * var2 + this.field3013 * var3);
        arg0[2] = (int) (this.field3012 * var4 + this.field3018 * var3 + this.field3011 * var2);
        arg0[0] = (int) (this.field3038 * var4 + this.field3040 * var2 + this.field3037 * var3);
    }

    @OriginalMember(owner = "client!km", name = "ka", descriptor = "(I)V", line = 148)
    public final void method234(int arg0) {
        field3039++;
        float var2 = class295.field3776[arg0 & 0x3FFF];
        float var3 = class295.field3769[arg0 & 0x3FFF];
        float var4 = this.field3037;
        float var5 = this.field3013;
        float var6 = this.field3018;
        this.field3037 = var2 * var4 - (this.field3038 * var3);
        float var7 = this.field3042;
        this.field3038 = this.field3038 * var2 + var3 * var4;
        this.field3013 = var2 * var5 - (this.field3035 * var3);
        this.field3018 = var2 * var6 - (this.field3012 * var3);
        this.field3035 = this.field3035 * var2 + var3 * var5;
        this.field3042 = var2 * var7 - this.field3016 * var3;
        this.field3012 = this.field3012 * var2 + var3 * var6;
        this.field3016 = this.field3016 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BIIFIFF)V", line = 176)
    public final void method1424(byte arg0, int arg1, int arg2, float arg3, int arg4, float arg5, float arg6) {
        if (arg0 != -13) {
            this.method231(-15, 95, 99);
        }
        if (arg1 == 0) {
            this.field3012 = 1.0F;
            this.field3037 = this.field3038 = this.field3022 = this.field3035 = this.field3011 = this.field3018 = 0.0F;
            this.field3040 = arg2;
            this.field3013 = arg4;
        } else {
            float var8 = class295.field3776[arg1 & 0x3FFF];
            float var9 = class295.field3769[arg1 & 0x3FFF];
            this.field3013 = (float) arg4 * var8;
            this.field3040 = (float) arg2 * var8;
            this.field3038 = this.field3035 = this.field3011 = this.field3018 = 0.0F;
            this.field3037 = (float) arg2 * var9;
            this.field3012 = 1.0F;
            this.field3022 = (float) arg4 * -var9;
        }
        field3021++;
        this.field3042 = arg5;
        this.field3032 = arg6;
        this.field3016 = arg3;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V", line = 211)
    public static final void method1425(int arg0, int arg1, int arg2) {
        field3033++;
        class153 var3 = class75.method656(arg0, 255, arg1);
        var3.method1003((byte) -49);
        var3.field1933 = arg2;
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V", line = 224)
    public static final void method1426(int arg0) {
        field3025++;
        int var1 = 0;
        if (class407.field5817.method1684(-2, class377.field4959)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class407.field5817.field3625) {
            var1 |= 0x40;
        }
        class429.method2512(11, var1);
        class315.field4017.method1955(var1, (byte) 94);
        class376.field4949.method617((byte) 27, var1);
        class390.field5244.method1330((byte) -7, var1);
        class120.field1624.method1839(0, var1);
        class415.method2449((byte) -11, var1);
        if (arg0 == 1) {
            class5.method27((byte) -58, var1);
            class26.method210(27030, var1);
            class382.method2163(var1, (byte) -57);
            class384.method2171(-113);
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III[I)V", line = 260)
    public final void method236(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field3018 + (float) arg0 * this.field3037 + (float) arg1 * this.field3013 + this.field3042);
        arg3[2] = (int) ((float) arg2 * this.field3012 + (float) arg0 * this.field3038 + (float) arg1 * this.field3035 + this.field3016);
        arg3[0] = (int) ((float) arg2 * this.field3011 + (float) arg0 * this.field3040 + (float) arg1 * this.field3022 + this.field3032);
        field3036++;
    }

    @OriginalMember(owner = "client!km", name = "za", descriptor = "(Lc;)V", line = 271)
    public final void method237(class123 arg0) {
        field3024++;
        class237 var2 = (class237) arg0;
        this.field3037 = var2.field3037;
        this.field3022 = var2.field3022;
        this.field3042 = var2.field3042;
        this.field3012 = var2.field3012;
        this.field3032 = var2.field3032;
        this.field3013 = var2.field3013;
        this.field3038 = var2.field3038;
        this.field3035 = var2.field3035;
        this.field3018 = var2.field3018;
        this.field3016 = var2.field3016;
        this.field3011 = var2.field3011;
        this.field3040 = var2.field3040;
    }

    @OriginalMember(owner = "client!km", name = "N", descriptor = "(I)V", line = 296)
    public final void method232(int arg0) {
        field3034++;
        this.field3040 = 1.0F;
        this.field3013 = this.field3012 = class295.field3776[arg0 & 0x3FFF];
        this.field3035 = class295.field3769[arg0 & 0x3FFF];
        this.field3018 = -this.field3035;
        this.field3022 = this.field3011 = this.field3032 = this.field3037 = this.field3042 = this.field3038 = this.field3016 = 0.0F;
    }

    @OriginalMember(owner = "client!km", name = "ra", descriptor = "(I)V", line = 311)
    public final void method233(int arg0) {
        field3023++;
        this.field3013 = 1.0F;
        this.field3040 = this.field3012 = class295.field3776[arg0 & 0x3FFF];
        this.field3011 = class295.field3769[arg0 & 0x3FFF];
        this.field3038 = -this.field3011;
        this.field3022 = this.field3032 = this.field3037 = this.field3018 = this.field3042 = this.field3035 = this.field3016 = 0.0F;
    }

    @OriginalMember(owner = "client!km", name = "c", descriptor = "(I)[F", line = 324)
    public final float[] method1427(int arg0) {
        class528.field7789[12] = this.field3032;
        class528.field7789[9] = this.field3018;
        int var2 = -5 % ((-arg0 - 66) / 41);
        class528.field7789[0] = this.field3040;
        class528.field7789[8] = this.field3011;
        class528.field7789[2] = this.field3038;
        field3030++;
        class528.field7789[4] = this.field3022;
        class528.field7789[5] = this.field3013;
        class528.field7789[14] = this.field3016;
        class528.field7789[13] = this.field3042;
        class528.field7789[1] = this.field3037;
        class528.field7789[10] = this.field3012;
        class528.field7789[6] = this.field3035;
        return class528.field7789;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)Lmm;", line = 347)
    public static final class184 method1428(int arg0, int arg1) {
        field3027++;
        if (arg1 <= 29) {
            method1426(-59);
        }
        if (arg0 == 0) {
            return new class157();
        } else if (arg0 == 1) {
            return new class516();
        } else if (arg0 == 2) {
            return new class142();
        } else if (arg0 == 3) {
            return new class268();
        } else if (arg0 == 4) {
            return new class154();
        } else if (arg0 == 5) {
            return new class515();
        } else if (arg0 == 6) {
            return new class120();
        } else if (arg0 == 7) {
            return new class54();
        } else if (arg0 == 8) {
            return new class232();
        } else if (arg0 == 9) {
            return new class525();
        } else if (arg0 == 10) {
            return new class90();
        } else if (arg0 == 11) {
            return new class273();
        } else if (arg0 == 12) {
            return new class69();
        } else if (arg0 == 13) {
            return new class133();
        } else if (arg0 == 14) {
            return new class451();
        } else if (arg0 == 15) {
            return new class21();
        } else if (arg0 == 16) {
            return new class420();
        } else if (arg0 == 17) {
            return new class115();
        } else if (arg0 == 18) {
            return new class252();
        } else if (arg0 == 19) {
            return new class178();
        } else if (arg0 == 20) {
            return new class368();
        } else if (arg0 == 21) {
            return new class512();
        } else if (arg0 == 22) {
            return new class240();
        } else if (arg0 == 23) {
            return new class414();
        } else if (arg0 == 24) {
            return new class124();
        } else if (arg0 == 25) {
            return new class198();
        } else if (arg0 == 26) {
            return new class248();
        } else if (arg0 == 27) {
            return new class321();
        } else if (arg0 == 28) {
            return new class397();
        } else if (arg0 == 29) {
            return new class2();
        } else if (arg0 == 30) {
            return new class455();
        } else if (arg0 == 31) {
            return new class62();
        } else if (arg0 == 32) {
            return new class23();
        } else if (arg0 == 33) {
            return new class208();
        } else if (arg0 == 34) {
            return new class468();
        } else if (arg0 == 35) {
            return new class33();
        } else if (arg0 == 36) {
            return new class111();
        } else if (arg0 == 37) {
            return new class14();
        } else if (arg0 == 38) {
            return new class189();
        } else if (arg0 == 39) {
            return new class59();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLc;)V", line = 665)
    public final void method1429(byte arg0, class123 arg1) {
        field3015++;
        class237 var3 = (class237) arg1;
        this.field3040 = var3.field3040;
        this.field3011 = var3.field3038;
        this.field3022 = var3.field3037;
        this.field3037 = var3.field3022;
        this.field3013 = var3.field3013;
        this.field3018 = var3.field3035;
        this.field3038 = var3.field3011;
        this.field3032 = -(this.field3011 * var3.field3016 + this.field3040 * var3.field3032 + this.field3022 * var3.field3042);
        if (arg0 == -100) {
            this.field3012 = var3.field3012;
            this.field3035 = var3.field3018;
            this.field3042 = -(this.field3018 * var3.field3016 + this.field3037 * var3.field3032 + this.field3013 * var3.field3042);
            this.field3016 = -(this.field3012 * var3.field3016 + this.field3038 * var3.field3032 + this.field3035 * var3.field3042);
        }
    }

    @OriginalMember(owner = "client!km", name = "p", descriptor = "(III[I)V", line = 694)
    public final void method228(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field3012 + (float) arg0 * this.field3038 + (float) arg1 * this.field3035);
        field3029++;
        arg3[0] = (int) ((float) arg2 * this.field3011 + (float) arg0 * this.field3040 + (float) arg1 * this.field3022);
        arg3[1] = (int) ((float) arg2 * this.field3018 + (float) arg0 * this.field3037 + (float) arg1 * this.field3013);
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "()Lc;", line = 704)
    public final class123 method230() {
        field3041++;
        class237 var1 = new class237();
        var1.field3016 = this.field3016;
        var1.field3042 = this.field3042;
        var1.field3032 = this.field3032;
        var1.field3040 = this.field3040;
        var1.field3035 = this.field3035;
        var1.field3018 = this.field3018;
        var1.field3011 = this.field3011;
        var1.field3022 = this.field3022;
        var1.field3013 = this.field3013;
        var1.field3012 = this.field3012;
        var1.field3037 = this.field3037;
        var1.field3038 = this.field3038;
        return var1;
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 731)
    public class237() {
        this.method223();
    }

    @OriginalMember(owner = "client!km", name = "O", descriptor = "(I)V", line = 739)
    public final void method225(int arg0) {
        this.field3012 = 1.0F;
        field3031++;
        this.field3040 = this.field3013 = class295.field3776[arg0 & 0x3FFF];
        this.field3037 = class295.field3769[arg0 & 0x3FFF];
        this.field3011 = this.field3032 = this.field3018 = this.field3042 = this.field3038 = this.field3035 = this.field3016 = 0.0F;
        this.field3022 = -this.field3037;
    }
}
