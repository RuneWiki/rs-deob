import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class162 {

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lm;")
    public class126 field2501;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lan;")
    public static class20 field2507 = new class20(8);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lmq;")
    public static class350 field2513 = null;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lpi;")
    public static class342 field2514 = new class342("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lbm;")
    public static class74 field2506;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "[I")
    public static int[] field2515;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method1193(byte arg0, int arg1) {
        if (arg0 >= -80) {
            field2499 = 42;
        }
        field2510++;
        class54 var2 = class442.method2651(arg1, 10, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 60)
    protected void finalize() {
        this.method1203(-30);
        field2509++;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V", line = 69)
    public static void method1194(int arg0) {
        field2515 = null;
        field2514 = null;
        field2513 = null;
        field2507 = null;
        field2506 = null;
        if (arg0 >= -33) {
            field2506 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 88)
    public final void method1195(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 30 / ((-arg0 - 31) / 58);
        this.method271(arg1, arg3, arg4, arg2, 1);
        field2511++;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(ILm;)V", line = 102)
    public class162(int arg0, class126 arg1) {
        this.field2502 = arg0;
        this.field2501 = arg1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIBIII)V", line = 122)
    public final void method1196(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 >= -28) {
            field2499 = 84;
        }
        field2512++;
        this.method239(arg1, arg5, arg0, arg3, arg4, 1);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V", line = 134)
    public final void method1197(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2500++;
        this.method216(arg1, arg3, arg0, arg4, 1);
        if (arg2 < 115) {
            this.method259(-37, 95, 48, 108);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(III)I", line = 145)
    public static final int method1198(int arg0, int arg1, int arg2) {
        field2498++;
        if (arg2 == 1 || arg2 == 3) {
            return class420.field6280[arg1 & 0x3];
        } else {
            if (arg0 < 30) {
                method1193((byte) 99, -31);
            }
            return class442.field6612[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIILm;Lli;Ljava/awt/Canvas;)Lqa;", line = 159)
    public static final synchronized class162 method1199(int arg0, int arg1, int arg2, class126 arg3, class293 arg4, Canvas arg5) {
        field2505++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class13.field212[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg2 != 1) {
            field2514 = null;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class162 var9;
        if (arg1 == 0) {
            var9 = class516.method3078(arg3, -99, arg5, var6);
        } else if (arg1 == 1) {
            var9 = class116.method855(arg5, var6, arg3, 126, arg0, arg4);
        } else if (arg1 == 2) {
            var9 = class8.method45(-104, arg3, arg4, arg5, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class13.field212[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V", line = 203)
    public final void method1200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method253(arg2, arg3, arg4, arg1, arg0, 1);
        field2504++;
        if (arg5 != 10) {
            field2515 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZI)V", line = 227)
    public final void method1201(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2508++;
        if (!arg4) {
            this.method267(-54, -58, 81, -108, 19, 0.13008045F);
        }
        this.method282(arg0, arg1, arg5, arg3, arg2, 1);
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIII)V", line = 247)
    public final void method1202(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2497++;
        this.method288(arg0, arg3, arg4, arg1, arg2);
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V", line = 294)
    public final void method1203(int arg0) {
        field2503++;
        class13.field212[this.field2502] = false;
        this.method297();
        int var2 = -16 % ((24 - arg0) / 42);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V")
    public abstract void method206();

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(IIII)V")
    public abstract void method198(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "(FF)V")
    public abstract void method300(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lsh;)V")
    public abstract void method268(class49 arg0);

    @OriginalMember(owner = "client!qa", name = "SA", descriptor = "(IIIIII)Z")
    public abstract boolean method274(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()Z")
    public abstract boolean method232();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()I")
    public abstract int method252();

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(II)V")
    public abstract void method296(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method227(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()Z")
    public abstract boolean method223();

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()Z")
    public abstract boolean method285();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()V")
    public abstract void method303();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()V")
    public abstract void method278();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class529 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "()F")
    public abstract float method221();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method207(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "([I)V")
    public abstract void method251(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class529 method218(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Z")
    public abstract boolean method202();

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "(III)V")
    public abstract void method243(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public abstract boolean method224();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "GA", descriptor = "(IIII)V")
    public abstract void method230(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Lfk;)V")
    public abstract void method289(int arg0, class462[] arg1);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method219();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)Ll;")
    public abstract class16 method238(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method211(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "da", descriptor = "(IIIII)V")
    public abstract void method216(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method215(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()Z")
    public abstract boolean method299();

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "()F")
    public abstract float method276();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method280(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(I)V")
    public abstract void method241(int arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method286();

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()Lia;")
    public abstract class414 method240();

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()Z")
    public abstract boolean method208();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method256(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILea;II)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lea;")
    public abstract class381 method294(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method261(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method255(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method269();

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()I")
    public abstract int method228();

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "(IIIII)V")
    public abstract void method271(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public abstract boolean method283();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lia;[Llc;I)V")
    public abstract void method263(class121[] arg0, class414 arg1, class456[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)V")
    public abstract void method245(int arg0);

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "()I")
    public abstract int method275();

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "(IIII)V")
    public abstract void method214(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "ua", descriptor = "(F)V")
    public abstract void method281(float arg0);

    @OriginalMember(owner = "client!qa", name = "fa", descriptor = "(IIII)V")
    public abstract void method266(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()Z")
    public abstract boolean method226();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method248(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()V")
    public abstract void method203();

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()Z")
    public abstract boolean method305();

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(IIII)[I")
    public abstract int[] method259(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
    public abstract void method291();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lna;")
    public abstract class35 method273(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lc;Lsh;Lia;Llc;I)V")
    public abstract void method249(class121 arg0, class49 arg1, class414 arg2, class456 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V")
    public abstract void method277(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lc;Lsh;Lia;[Llc;I)V")
    public abstract void method272(class121[] arg0, class49 arg1, class414 arg2, class456[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public abstract void method212(int arg0);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Lia;")
    public abstract class414 method231();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbi;Lbi;FLbi;)Lbi;")
    public abstract class333 method295(class333 arg0, class333 arg1, float arg2, class333 arg3);

    @OriginalMember(owner = "client!qa", name = "ia", descriptor = "(III[I)V")
    public abstract void method279(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "na", descriptor = "(I)V")
    public abstract void method307(int arg0);

    @OriginalMember(owner = "client!qa", name = "NA", descriptor = "(IIIIII)V")
    public abstract void method253(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ll;)V")
    public abstract void method301(class16 arg0);

    @OriginalMember(owner = "client!qa", name = "pa", descriptor = "(IIII)V")
    public abstract void method298(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method220(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method282(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()V")
    public abstract void method297();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbi;)V")
    public abstract void method284(class333 arg0);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()I")
    public abstract int method293();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method250(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method287();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Lfk;")
    public abstract class462 method267(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "XA", descriptor = "(IFFFFF)V")
    public abstract void method233(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(IIIIII)Lbi;")
    public abstract class333 method204(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "FA", descriptor = "()I")
    public abstract int method217();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lnd;IIII)Lc;")
    public abstract class121 method265(class380 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method264();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method225(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "va", descriptor = "()V")
    public abstract void method258();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method210(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "aa", descriptor = "(IIIIII[BII)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(ILea;II)V")
    public abstract void method270(int arg0, class381 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lwe;Z)Lf;")
    public abstract class529 method304(class279 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()V")
    public abstract void method247();

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public abstract void method213(int arg0);

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "(IIIII)V")
    public abstract void method288(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Leu;[Lwe;Z)Loa;")
    public abstract class489 method260(class332 arg0, class279[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "()V")
    public abstract void method222();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(Lia;)V")
    public abstract void method302(class414 arg0);
}
