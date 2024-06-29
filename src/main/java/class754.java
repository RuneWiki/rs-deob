import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class754 extends class303 {

    @OriginalMember(owner = "client!wn", name = "X", descriptor = "I")
    public static int field10468 = 0;

    @OriginalMember(owner = "client!wn", name = "n", descriptor = "Ljda;")
    public static class239 field10432 = new class239(4);

    @OriginalMember(owner = "client!wn", name = "kb", descriptor = "Lmga;")
    public static class739 field10481 = new class739(88, -1);

    @OriginalMember(owner = "client!wn", name = "mb", descriptor = "Z")
    public static boolean field10483 = false;

    @OriginalMember(owner = "client!wn", name = "p", descriptor = "F")
    public float field10434;

    @OriginalMember(owner = "client!wn", name = "u", descriptor = "F")
    public float field10439;

    @OriginalMember(owner = "client!wn", name = "w", descriptor = "F")
    public float field10441;

    @OriginalMember(owner = "client!wn", name = "x", descriptor = "F")
    public float field10442;

    @OriginalMember(owner = "client!wn", name = "A", descriptor = "F")
    public float field10445;

    @OriginalMember(owner = "client!wn", name = "F", descriptor = "F")
    public float field10450;

    @OriginalMember(owner = "client!wn", name = "J", descriptor = "F")
    public float field10454;

    @OriginalMember(owner = "client!wn", name = "L", descriptor = "F")
    public float field10456;

    @OriginalMember(owner = "client!wn", name = "T", descriptor = "F")
    public float field10464;

    @OriginalMember(owner = "client!wn", name = "db", descriptor = "F")
    public float field10474;

    @OriginalMember(owner = "client!wn", name = "hb", descriptor = "F")
    public float field10478;

    @OriginalMember(owner = "client!wn", name = "ib", descriptor = "F")
    public float field10479;

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "I")
    public static int field10428;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public static int field10429;

    @OriginalMember(owner = "client!wn", name = "l", descriptor = "I")
    public static int field10430;

    @OriginalMember(owner = "client!wn", name = "m", descriptor = "I")
    public static int field10431;

    @OriginalMember(owner = "client!wn", name = "o", descriptor = "I")
    public static int field10433;

    @OriginalMember(owner = "client!wn", name = "q", descriptor = "I")
    public static int field10435;

    @OriginalMember(owner = "client!wn", name = "r", descriptor = "I")
    public static int field10436;

    @OriginalMember(owner = "client!wn", name = "s", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!wn", name = "t", descriptor = "I")
    public static int field10438;

    @OriginalMember(owner = "client!wn", name = "v", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!wn", name = "y", descriptor = "I")
    public static int field10443;

    @OriginalMember(owner = "client!wn", name = "z", descriptor = "I")
    public static int field10444;

    @OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
    public static int field10446;

    @OriginalMember(owner = "client!wn", name = "C", descriptor = "I")
    public static int field10447;

    @OriginalMember(owner = "client!wn", name = "D", descriptor = "I")
    public static int field10448;

    @OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
    public static int field10449;

    @OriginalMember(owner = "client!wn", name = "G", descriptor = "I")
    public static int field10451;

    @OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
    public static int field10452;

    @OriginalMember(owner = "client!wn", name = "I", descriptor = "I")
    public static int field10453;

    @OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
    public static int field10455;

    @OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!wn", name = "N", descriptor = "I")
    public static int field10458;

    @OriginalMember(owner = "client!wn", name = "O", descriptor = "I")
    public static int field10459;

    @OriginalMember(owner = "client!wn", name = "P", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!wn", name = "Q", descriptor = "I")
    public static int field10461;

    @OriginalMember(owner = "client!wn", name = "R", descriptor = "I")
    public static int field10462;

    @OriginalMember(owner = "client!wn", name = "S", descriptor = "I")
    public static int field10463;

    @OriginalMember(owner = "client!wn", name = "U", descriptor = "I")
    public static int field10465;

    @OriginalMember(owner = "client!wn", name = "V", descriptor = "I")
    public static int field10466;

    @OriginalMember(owner = "client!wn", name = "W", descriptor = "I")
    public static int field10467;

    @OriginalMember(owner = "client!wn", name = "Y", descriptor = "I")
    public static int field10469;

    @OriginalMember(owner = "client!wn", name = "Z", descriptor = "I")
    public static int field10470;

    @OriginalMember(owner = "client!wn", name = "ab", descriptor = "I")
    public static int field10471;

    @OriginalMember(owner = "client!wn", name = "bb", descriptor = "I")
    public static int field10472;

    @OriginalMember(owner = "client!wn", name = "cb", descriptor = "I")
    public static int field10473;

    @OriginalMember(owner = "client!wn", name = "eb", descriptor = "I")
    public static int field10475;

    @OriginalMember(owner = "client!wn", name = "fb", descriptor = "I")
    public static int field10476;

    @OriginalMember(owner = "client!wn", name = "gb", descriptor = "I")
    public static int field10477;

    @OriginalMember(owner = "client!wn", name = "jb", descriptor = "I")
    public static int field10480;

    @OriginalMember(owner = "client!wn", name = "lb", descriptor = "Lei;")
    public static class190 field10482;

    @OriginalMember(owner = "client!wn", name = "nb", descriptor = "Lsea;")
    public static class727 field10484;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIII)V", line = 4)
    public final void method984(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10480++;
        float var7 = class232.field3153[arg3 & 0x3FFF];
        float var8 = class232.field3161[arg3 & 0x3FFF];
        float var9 = class232.field3153[arg4 & 0x3FFF];
        float var10 = class232.field3161[arg4 & 0x3FFF];
        float var11 = class232.field3153[arg5 & 0x3FFF];
        float var12 = class232.field3161[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field10456 = var7 * var9;
        this.field10450 = var9 * var11 + var10 * var14;
        this.field10474 = -var9 * var12 + var10 * var13;
        this.field10439 = var9 * var13 + var10 * var12;
        this.field10434 = var7 * var11;
        this.field10441 = var7 * var12;
        this.field10479 = -var10 * var11 + var9 * var14;
        this.field10478 = -var8;
        this.field10464 = var7 * var10;
        this.field10442 = (float) (-arg0) * this.field10474 - (float) arg1 * this.field10434 - ((float) arg2 * this.field10439);
        this.field10445 = (float) (-arg0) * this.field10450 - ((float) arg1 * this.field10441) - ((float) arg2 * this.field10479);
        this.field10454 = (float) (-arg0) * this.field10464 - (float) arg1 * this.field10478 - (float) arg2 * this.field10456;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([FI)[F", line = 39)
    public final float[] method4188(float[] arg0, int arg1) {
        field10437++;
        arg0[1] = this.field10474;
        if (arg1 != -12847) {
            method4195(-125);
        }
        arg0[8] = this.field10445;
        arg0[7] = 0.0F;
        arg0[2] = 0.0F;
        arg0[9] = this.field10442;
        arg0[6] = 0.0F;
        arg0[11] = 0.0F;
        arg0[10] = this.field10454;
        arg0[5] = this.field10434;
        arg0[14] = 0.0F;
        arg0[4] = this.field10441;
        arg0[12] = 0.0F;
        arg0[3] = 0.0F;
        arg0[13] = 0.0F;
        arg0[0] = this.field10450;
        arg0[15] = 1.0F;
        return arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Luu;I)V", line = 66)
    public final void method4189(class303 arg0, int arg1) {
        field10462++;
        if (arg1 != 0) {
            this.field10474 = 1.6915945F;
        }
        class754 var3 = (class754) arg0;
        float var4 = this.field10450;
        float var5 = this.field10474;
        float var6 = this.field10441;
        float var7 = this.field10434;
        float var8 = this.field10479;
        float var9 = this.field10439;
        float var10 = this.field10445;
        this.field10450 = this.field10464 * var3.field10479 + var3.field10450 * var4 + var3.field10441 * var5;
        float var11 = this.field10442;
        this.field10474 = this.field10464 * var3.field10439 + var3.field10474 * var4 + var3.field10434 * var5;
        this.field10464 = this.field10464 * var3.field10456 + var3.field10478 * var5 + var3.field10464 * var4;
        this.field10434 = this.field10478 * var3.field10439 + var3.field10474 * var6 + var3.field10434 * var7;
        this.field10441 = this.field10478 * var3.field10479 + var3.field10450 * var6 + var3.field10441 * var7;
        this.field10478 = this.field10478 * var3.field10456 + var3.field10478 * var7 + var3.field10464 * var6;
        this.field10479 = this.field10456 * var3.field10479 + var3.field10450 * var8 + var3.field10441 * var9;
        this.field10439 = this.field10456 * var3.field10439 + var3.field10474 * var8 + var3.field10434 * var9;
        this.field10456 = this.field10456 * var3.field10456 + var3.field10478 * var9 + var3.field10464 * var8;
        this.field10445 = this.field10454 * var3.field10479 + var3.field10450 * var10 + var3.field10441 * var11 + var3.field10445;
        this.field10442 = this.field10454 * var3.field10439 + var3.field10474 * var10 + var3.field10434 * var11 + var3.field10442;
        this.field10454 = this.field10454 * var3.field10456 + var3.field10478 * var11 + var3.field10464 * var10 + var3.field10454;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFBF)F", line = 108)
    public final float method4190(float arg0, float arg1, byte arg2, float arg3) {
        if (arg2 != 120) {
            this.method976(43);
        }
        field10447++;
        return this.field10479 * arg3 + this.field10450 * arg0 + this.field10441 * arg1 + this.field10445;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(I)V", line = 119)
    public final void method978(int arg0) {
        field10465++;
        float var2 = class232.field3153[arg0 & 0x3FFF];
        float var3 = class232.field3161[arg0 & 0x3FFF];
        float var4 = this.field10474;
        float var5 = this.field10434;
        float var6 = this.field10439;
        this.field10474 = var2 * var4 - (this.field10464 * var3);
        float var7 = this.field10442;
        this.field10464 = this.field10464 * var2 + var3 * var4;
        this.field10434 = var2 * var5 - this.field10478 * var3;
        this.field10439 = var2 * var6 - this.field10456 * var3;
        this.field10478 = this.field10478 * var2 + var3 * var5;
        this.field10442 = var2 * var7 - this.field10454 * var3;
        this.field10456 = this.field10456 * var2 + var3 * var6;
        this.field10454 = this.field10454 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILuu;)V", line = 148)
    public final void method4191(int arg0, class303 arg1) {
        field10458++;
        class754 var3 = (class754) arg1;
        this.field10441 = var3.field10474;
        this.field10479 = var3.field10464;
        this.field10450 = var3.field10450;
        this.field10474 = var3.field10441;
        this.field10439 = var3.field10478;
        this.field10464 = var3.field10479;
        this.field10434 = var3.field10434;
        this.field10456 = var3.field10456;
        if (arg0 == 16383) {
            this.field10445 = -(this.field10479 * var3.field10454 + this.field10450 * var3.field10445 + this.field10441 * var3.field10442);
            this.field10478 = var3.field10439;
            this.field10442 = -(this.field10439 * var3.field10454 + this.field10474 * var3.field10445 + this.field10434 * var3.field10442);
            this.field10454 = -(this.field10456 * var3.field10454 + this.field10478 * var3.field10442 + this.field10464 * var3.field10445);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III[I)V", line = 173)
    public final void method975(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field10439 + (float) arg0 * this.field10474 + (float) arg1 * this.field10434 + this.field10442);
        arg3[0] = (int) ((float) arg2 * this.field10479 + (float) arg0 * this.field10450 + (float) arg1 * this.field10441 + this.field10445);
        field10449++;
        arg3[2] = (int) ((float) arg2 * this.field10456 + (float) arg0 * this.field10464 + (float) arg1 * this.field10478 + this.field10454);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Luu;B)V", line = 189)
    public final void method4192(class303 arg0, byte arg1) {
        field10428++;
        class754 var3 = (class754) arg0;
        this.field10445 = 0.0F;
        this.field10464 = var3.field10464;
        this.field10456 = var3.field10456;
        this.field10478 = var3.field10478;
        this.field10450 = var3.field10450;
        this.field10454 = 0.0F;
        this.field10479 = var3.field10479;
        this.field10442 = 0.0F;
        if (arg1 != 88) {
            this.method4209(true, 0.20010528F, 0.4409594F, -1.7829311F);
        }
        this.field10439 = var3.field10439;
        this.field10474 = var3.field10474;
        this.field10441 = var3.field10441;
        this.field10434 = var3.field10434;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IFFF)V", line = 214)
    public final void method4193(int arg0, float arg1, float arg2, float arg3) {
        this.field10454 *= arg1;
        this.field10474 *= arg2;
        this.field10478 *= arg1;
        if (arg0 > -86) {
            this.method976(105);
        }
        this.field10445 *= arg3;
        this.field10479 *= arg3;
        this.field10450 *= arg3;
        this.field10442 *= arg2;
        this.field10456 *= arg1;
        this.field10434 *= arg2;
        this.field10441 *= arg3;
        field10438++;
        this.field10464 *= arg1;
        this.field10439 *= arg2;
    }

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "(III[I)V", line = 236)
    public final void method979(int arg0, int arg1, int arg2, int[] arg3) {
        field10430++;
        int var5 = (int) ((float) arg1 - this.field10442);
        int var6 = (int) ((float) arg2 - this.field10454);
        int var7 = (int) ((float) arg0 - this.field10445);
        arg3[1] = (int) ((float) var6 * this.field10478 + (float) var5 * this.field10434 + (float) var7 * this.field10441);
        arg3[0] = (int) ((float) var6 * this.field10464 + (float) var5 * this.field10474 + (float) var7 * this.field10450);
        arg3[2] = (int) ((float) var6 * this.field10456 + (float) var5 * this.field10439 + (float) var7 * this.field10479);
    }

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "(I)V", line = 251)
    public final void method969(int arg0) {
        field10453++;
        float var2 = class232.field3153[arg0 & 0x3FFF];
        float var3 = class232.field3161[arg0 & 0x3FFF];
        float var4 = this.field10450;
        float var5 = this.field10441;
        float var6 = this.field10479;
        float var7 = this.field10445;
        this.field10450 = this.field10464 * var3 + var2 * var4;
        this.field10464 = this.field10464 * var2 - var3 * var4;
        this.field10441 = this.field10478 * var3 + var2 * var5;
        this.field10478 = this.field10478 * var2 - (var3 * var5);
        this.field10479 = this.field10456 * var3 + var2 * var6;
        this.field10445 = this.field10454 * var3 + var2 * var7;
        this.field10456 = this.field10456 * var2 - var3 * var6;
        this.field10454 = this.field10454 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(III)V", line = 282)
    public final void method970(int arg0, int arg1, int arg2) {
        field10469++;
        this.field10445 += arg0;
        this.field10442 += arg1;
        this.field10454 += arg2;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIF)F", line = 293)
    public final float method4194(float arg0, float arg1, int arg2, float arg3) {
        if (arg2 == 16383) {
            field10429++;
            return this.field10456 * arg3 + this.field10478 * arg0 + this.field10464 * arg1 + this.field10454;
        } else {
            return -1.4619739F;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V", line = 310)
    public final void method985(int arg0) {
        field10475++;
        this.field10434 = 1.0F;
        this.field10450 = this.field10456 = class232.field3153[arg0 & 0x3FFF];
        this.field10479 = class232.field3161[arg0 & 0x3FFF];
        this.field10441 = this.field10445 = this.field10474 = this.field10439 = this.field10442 = this.field10478 = this.field10454 = 0.0F;
        this.field10464 = -this.field10479;
    }

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "(I)V", line = 324)
    public static void method4195(int arg0) {
        if (arg0 != 0) {
            field10483 = true;
        }
        field10432 = null;
        field10484 = null;
        field10481 = null;
        field10482 = null;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(B[F)[F", line = 338)
    public final float[] method4196(byte arg0, float[] arg1) {
        arg1[4] = this.field10474;
        arg1[10] = this.field10456;
        if (arg0 <= 111) {
            this.method4192(null, (byte) 120);
        }
        field10455++;
        arg1[14] = 0.0F;
        arg1[5] = this.field10434;
        arg1[2] = this.field10479;
        arg1[12] = 0.0F;
        arg1[9] = this.field10478;
        arg1[1] = this.field10441;
        arg1[6] = this.field10439;
        arg1[13] = 0.0F;
        arg1[3] = 0.0F;
        arg1[7] = 0.0F;
        arg1[15] = 0.0F;
        arg1[0] = this.field10450;
        arg1[11] = 0.0F;
        arg1[8] = this.field10464;
        return arg1;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BFFF)V", line = 365)
    public final void method4197(byte arg0, float arg1, float arg2, float arg3) {
        this.field10450 = arg1;
        this.field10445 = 0.0F;
        this.field10479 = 0.0F;
        this.field10442 = 0.0F;
        this.field10441 = 0.0F;
        field10444++;
        int var5 = 25 / ((-arg0 - 17) / 58);
        this.field10434 = arg3;
        this.field10454 = 0.0F;
        this.field10464 = 0.0F;
        this.field10478 = 0.0F;
        this.field10439 = 0.0F;
        this.field10456 = arg2;
        this.field10474 = 0.0F;
    }

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "(I)V", line = 388)
    public final void method976(int arg0) {
        this.field10456 = 1.0F;
        field10461++;
        this.field10450 = this.field10434 = class232.field3153[arg0 & 0x3FFF];
        this.field10474 = class232.field3161[arg0 & 0x3FFF];
        this.field10441 = -this.field10474;
        this.field10479 = this.field10445 = this.field10439 = this.field10442 = this.field10464 = this.field10478 = this.field10454 = 0.0F;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "()V", line = 402)
    public final void method967() {
        this.field10450 = this.field10434 = this.field10456 = 1.0F;
        this.field10474 = this.field10464 = this.field10441 = this.field10478 = this.field10479 = this.field10439 = this.field10445 = this.field10442 = this.field10454 = 0.0F;
        field10431++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Luu;)V", line = 417)
    public final void method986(class303 arg0) {
        field10460++;
        class754 var2 = (class754) arg0;
        this.field10434 = var2.field10434;
        this.field10456 = var2.field10456;
        this.field10474 = var2.field10474;
        this.field10442 = var2.field10442;
        this.field10479 = var2.field10479;
        this.field10464 = var2.field10464;
        this.field10450 = var2.field10450;
        this.field10439 = var2.field10439;
        this.field10478 = var2.field10478;
        this.field10441 = var2.field10441;
        this.field10454 = var2.field10454;
        this.field10445 = var2.field10445;
    }

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "(I)V", line = 438)
    public final void method968(int arg0) {
        field10452++;
        float var2 = class232.field3153[arg0 & 0x3FFF];
        float var3 = class232.field3161[arg0 & 0x3FFF];
        float var4 = this.field10450;
        float var5 = this.field10441;
        float var6 = this.field10479;
        float var7 = this.field10445;
        this.field10450 = var2 * var4 - (this.field10474 * var3);
        this.field10474 = this.field10474 * var2 + var3 * var4;
        this.field10441 = var2 * var5 - (this.field10434 * var3);
        this.field10479 = var2 * var6 - this.field10439 * var3;
        this.field10434 = this.field10434 * var2 + var3 * var5;
        this.field10439 = this.field10439 * var2 + var3 * var6;
        this.field10445 = var2 * var7 - this.field10442 * var3;
        this.field10442 = this.field10442 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Luu;Luu;)V", line = 468)
    public final void method4198(class303 arg0, class303 arg1) {
        field10433++;
        class754 var3 = (class754) arg0;
        class754 var4 = (class754) arg1;
        this.field10450 = var3.field10479 * var4.field10464 + var3.field10450 * var4.field10450 + var3.field10441 * var4.field10474;
        this.field10474 = var3.field10439 * var4.field10464 + var3.field10474 * var4.field10450 + var3.field10434 * var4.field10474;
        this.field10441 = var3.field10479 * var4.field10478 + var3.field10450 * var4.field10441 + var3.field10441 * var4.field10434;
        this.field10464 = var3.field10456 * var4.field10464 + var3.field10478 * var4.field10474 + var3.field10464 * var4.field10450;
        this.field10434 = var3.field10439 * var4.field10478 + var3.field10474 * var4.field10441 + var3.field10434 * var4.field10434;
        this.field10478 = var3.field10456 * var4.field10478 + var3.field10478 * var4.field10434 + var3.field10464 * var4.field10441;
        this.field10479 = var3.field10479 * var4.field10456 + var3.field10450 * var4.field10479 + var3.field10441 * var4.field10439;
        this.field10439 = var3.field10439 * var4.field10456 + var3.field10474 * var4.field10479 + var3.field10434 * var4.field10439;
        this.field10445 = var3.field10479 * var4.field10454 + var3.field10450 * var4.field10445 + var3.field10441 * var4.field10442 + var3.field10445;
        this.field10456 = var3.field10456 * var4.field10456 + var3.field10478 * var4.field10439 + var3.field10464 * var4.field10479;
        this.field10442 = var3.field10439 * var4.field10454 + var3.field10474 * var4.field10445 + var3.field10434 * var4.field10442 + var3.field10442;
        this.field10454 = var3.field10456 * var4.field10454 + var3.field10478 * var4.field10442 + var3.field10464 * var4.field10445 + var3.field10454;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFIF[F)V", line = 491)
    public final void method4199(float arg0, float arg1, int arg2, float arg3, float[] arg4) {
        field10470++;
        arg4[arg2] = this.field10456 * arg1 + this.field10478 * arg0 + this.field10464 * arg3;
        arg4[0] = this.field10479 * arg1 + this.field10450 * arg3 + this.field10441 * arg0;
        arg4[1] = this.field10439 * arg1 + this.field10474 * arg3 + this.field10434 * arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([FB)[F", line = 505)
    public final float[] method4200(float[] arg0, byte arg1) {
        arg0[13] = 0.0F;
        arg0[12] = 0.0F;
        arg0[11] = this.field10454;
        arg0[15] = 1.0F;
        arg0[7] = this.field10442;
        if (arg1 >= -30) {
            this.field10474 = 0.70461696F;
        }
        field10476++;
        arg0[5] = this.field10434;
        arg0[3] = this.field10445;
        arg0[4] = this.field10474;
        arg0[2] = this.field10479;
        arg0[8] = this.field10464;
        arg0[1] = this.field10441;
        arg0[10] = this.field10456;
        arg0[14] = 0.0F;
        arg0[0] = this.field10450;
        arg0[9] = this.field10478;
        arg0[6] = this.field10439;
        return arg0;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(B[F)[F", line = 532)
    public final float[] method4201(byte arg0, float[] arg1) {
        arg1[1] = this.field10441;
        arg1[6] = this.field10439;
        arg1[2] = this.field10479;
        field10472++;
        arg1[3] = this.field10445;
        arg1[5] = this.field10434;
        arg1[7] = this.field10442;
        arg1[4] = this.field10474;
        if (arg0 > -21) {
            return null;
        } else {
            arg1[0] = this.field10450;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILjava/net/Socket;I)Lsea;", line = 556)
    public static final class727 method4202(int arg0, Socket arg1, int arg2) throws IOException {
        field10451++;
        int var3 = 48 % ((-arg0 - 39) / 47);
        return new class525(arg1, arg2);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "([FB)[F", line = 569)
    public final float[] method4203(float[] arg0, byte arg1) {
        arg0[12] = this.field10445;
        arg0[3] = 0.0F;
        field10467++;
        arg0[0] = this.field10450;
        arg0[13] = this.field10442;
        arg0[15] = 1.0F;
        arg0[5] = this.field10434;
        arg0[7] = 0.0F;
        arg0[14] = this.field10454;
        arg0[1] = this.field10474;
        arg0[9] = this.field10439;
        arg0[4] = this.field10441;
        if (arg1 >= -65) {
            this.method4207(0.098454036F, 65, -1.1113646F, 0.47105658F, 0.21841323F, null);
        }
        arg0[8] = this.field10479;
        arg0[6] = this.field10478;
        arg0[11] = 0.0F;
        arg0[2] = this.field10464;
        arg0[10] = this.field10456;
        return arg0;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "()Luu;", line = 596)
    public final class303 method963() {
        field10463++;
        class754 var1 = new class754();
        var1.field10456 = this.field10456;
        var1.field10434 = this.field10434;
        var1.field10439 = this.field10439;
        var1.field10478 = this.field10478;
        var1.field10479 = this.field10479;
        var1.field10464 = this.field10464;
        var1.field10454 = this.field10454;
        var1.field10441 = this.field10441;
        var1.field10450 = this.field10450;
        var1.field10442 = this.field10442;
        var1.field10474 = this.field10474;
        var1.field10445 = this.field10445;
        return var1;
    }

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "(I)V", line = 619)
    public final void method972(int arg0) {
        this.field10450 = 1.0F;
        field10446++;
        this.field10434 = this.field10456 = class232.field3153[arg0 & 0x3FFF];
        this.field10478 = class232.field3161[arg0 & 0x3FFF];
        this.field10441 = this.field10479 = this.field10445 = this.field10474 = this.field10442 = this.field10464 = this.field10454 = 0.0F;
        this.field10439 = -this.field10478;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFIFFFFFF)V", line = 634)
    public final void method4204(float arg0, float arg1, float arg2, int arg3, float arg4, float arg5, float arg6, float arg7, float arg8, float arg9) {
        this.field10442 = 0.0F;
        this.field10464 = arg7;
        this.field10454 = arg3;
        this.field10474 = arg2;
        this.field10479 = arg0;
        this.field10439 = arg4;
        field10443++;
        this.field10441 = arg1;
        this.field10478 = arg6;
        this.field10456 = arg9;
        this.field10450 = arg8;
        this.field10445 = 0.0F;
        this.field10434 = arg5;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IFZFFII)V", line = 653)
    public final void method4205(int arg0, float arg1, boolean arg2, float arg3, float arg4, int arg5, int arg6) {
        field10466++;
        if (!arg2) {
            return;
        }
        if (arg0 == 0) {
            this.field10434 = (arg6 * 2);
            this.field10445 = arg3 - (float) arg5;
            this.field10474 = this.field10464 = this.field10441 = this.field10478 = this.field10479 = this.field10439 = 0.0F;
            this.field10442 = arg1 - (float) arg6;
            this.field10456 = 1.0F;
            this.field10454 = arg4;
            this.field10450 = (arg5 * 2);
            return;
        }
        float var8 = class232.field3153[arg0 & 0x3FFF];
        float var9 = class232.field3161[arg0 & 0x3FFF];
        this.field10445 = (var9 * 0.5F - var8 * 0.5F) * (float) (arg5 * 2) + arg3;
        this.field10474 = var9 * 2.0F * (float) arg5;
        this.field10441 = var9 * -2.0F * (float) arg6;
        this.field10454 = arg4;
        this.field10464 = this.field10478 = this.field10479 = this.field10439 = 0.0F;
        this.field10442 = (var9 * -0.5F - var8 * 0.5F) * (float) (arg6 * 2) + arg1;
        this.field10450 = var8 * 2.0F * (float) arg5;
        this.field10456 = 1.0F;
        this.field10434 = var8 * 2.0F * (float) arg6;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(III)V", line = 690)
    public final void method981(int arg0, int arg1, int arg2) {
        this.field10450 = this.field10434 = this.field10456 = 1.0F;
        this.field10445 = arg0;
        this.field10442 = arg1;
        field10477++;
        this.field10454 = arg2;
        this.field10474 = this.field10464 = this.field10441 = this.field10478 = this.field10479 = this.field10439 = 0.0F;
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(III[I)V", line = 702)
    public final void method974(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field10456 + (float) arg0 * this.field10464 + (float) arg1 * this.field10478);
        arg3[1] = (int) ((float) arg2 * this.field10439 + (float) arg0 * this.field10474 + (float) arg1 * this.field10434);
        arg3[0] = (int) ((float) arg2 * this.field10479 + (float) arg0 * this.field10450 + (float) arg1 * this.field10441);
        field10436++;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([I)V", line = 712)
    public final void method982(int[] arg0) {
        field10471++;
        float var2 = (float) arg0[0] - this.field10445;
        float var3 = (float) arg0[1] - this.field10442;
        float var4 = (float) arg0[2] - this.field10454;
        arg0[1] = (int) (this.field10478 * var4 + this.field10441 * var2 + this.field10434 * var3);
        arg0[0] = (int) (this.field10464 * var4 + this.field10474 * var3 + this.field10450 * var2);
        arg0[2] = (int) (this.field10456 * var4 + this.field10479 * var2 + this.field10439 * var3);
    }

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "(I)V", line = 728)
    public final void method4206(int arg0) {
        this.field10439 = -this.field10439;
        if (arg0 != 31433) {
            field10484 = null;
        }
        this.field10434 = -this.field10434;
        this.field10442 = -this.field10442;
        this.field10456 = -this.field10456;
        this.field10474 = -this.field10474;
        this.field10454 = -this.field10454;
        field10473++;
        this.field10464 = -this.field10464;
        this.field10478 = -this.field10478;
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FIFFF[F)V", line = 746)
    public final void method4207(float arg0, int arg1, float arg2, float arg3, float arg4, float[] arg5) {
        field10457++;
        arg5[arg1] = this.field10439 * arg2 + this.field10474 * arg4 + this.field10434 * arg0;
        float var8;
        float var9;
        float var10;
        if ((arg4 > 0.00390625F) || (arg4 < -0.00390625F)) {
            float var12 = -arg3 / arg4;
            var8 = this.field10464 * var12 + this.field10454;
            var9 = this.field10450 * var12 + this.field10445;
            var10 = this.field10474 * var12 + this.field10442;
        } else if ((arg0 > 0.00390625F) || (arg0 < -0.00390625F)) {
            float var11 = -arg3 / arg0;
            var10 = this.field10434 * var11 + this.field10442;
            var9 = this.field10441 * var11 + this.field10445;
            var8 = this.field10478 * var11 + this.field10454;
        } else {
            float var7 = -arg3 / arg2;
            var8 = this.field10456 * var7 + this.field10454;
            var9 = this.field10479 * var7 + this.field10445;
            var10 = this.field10439 * var7 + this.field10442;
        }
        arg5[0] = this.field10479 * arg2 + this.field10450 * arg4 + this.field10441 * arg0;
        arg5[2] = this.field10456 * arg2 + this.field10478 * arg0 + this.field10464 * arg4;
        arg5[3] = -(arg5[2] * var8 + arg5[1] * var10 + arg5[0] * var9);
    }

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "(IFFF)V", line = 787)
    public final void method4208(int arg0, float arg1, float arg2, float arg3) {
        this.field10445 += arg3;
        this.field10454 += arg1;
        this.field10442 += arg2;
        if (arg0 == 18645) {
            field10440++;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZFFF)F", line = 801)
    public final float method4209(boolean arg0, float arg1, float arg2, float arg3) {
        field10448++;
        return arg0 ? -0.77011174F : this.field10439 * arg1 + this.field10474 * arg3 + this.field10434 * arg2 + this.field10442;
    }

    @OriginalMember(owner = "client!wn", name = "<init>", descriptor = "()V", line = 812)
    public class754() {
        this.method967();
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(FFFB)V", line = 825)
    public final void method4210(float arg0, float arg1, float arg2, byte arg3) {
        if (arg3 > -19) {
            this.field10454 = 0.20965295F;
        }
        this.field10474 = this.field10464 = this.field10441 = this.field10478 = this.field10479 = this.field10439 = 0.0F;
        this.field10450 = this.field10434 = this.field10456 = 1.0F;
        this.field10442 = arg2;
        this.field10454 = arg0;
        field10435++;
        this.field10445 = arg1;
    }
}
