import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class66 {

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Ld;")
    public class161 field913;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public int field906;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[S")
    public static short[] field905 = new short[256];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Lfea;")
    public static class152 field895 = new class152();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[Lbea;")
    public static class236[] field914 = new class236[14];

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "Lsw;")
    public static class786 field915 = new class786();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "Ljb;")
    public static class519 field916 = new class519(28, -2);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Luo;")
    public static class601 field918 = new class601();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field894;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field897;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field902;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field907;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field908;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field910;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "J")
    public static long field898;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "Luq;")
    public static class172 field917;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lth;")
    public static class621 field899;

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method436(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lrr;")
    public abstract class381 method437(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V")
    public final void method438(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = -79 / ((51 - arg4) / 35);
        field904++;
        this.method487(arg3, arg0, arg2, arg5, arg1, 1);
    }

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method439(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcj;)V")
    public abstract void method440(class720 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Lal;")
    public abstract class109 method444();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method445();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIII)Lhh;")
    public final class140 method446(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field902++;
        int var7 = -104 / ((arg1 - 30) / 51);
        return this.method462(arg0, arg5, arg4, arg2, arg3, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method447(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method448();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method449(int arg0, class512 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method450();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method451(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILhh;)V")
    public final void method452(int arg0, class140 arg1) {
        int var3 = -10 % ((41 - arg0) / 53);
        this.method554(this.method461(arg1, this.method437(arg1.method350(), arg1.method351())));
        field908++;
    }

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lhh;")
    public abstract class140 method454(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method455();

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method457(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            this.method541();
        }
        field900++;
        this.method451(arg0, arg3, arg4, arg1, 1);
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method458();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method459();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method460();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lio;Lrr;)Lhg;")
    public abstract class718 method461(class461 arg0, class381 arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lhh;")
    public abstract class140 method462(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method463(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public final void method464(byte arg0) {
        field909++;
        class502.field7054[this.field906] = false;
        this.method476();
        if (arg0 >= -58) {
            field917 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method465(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvf;Z)Lhh;")
    public abstract class140 method466(class162 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method467(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method468(float arg0);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method469();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method470(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public abstract void method471(int arg0, int arg1) throws class283;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method472();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method473(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method474(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Lal;")
    public abstract class109 method475();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()V")
    public abstract void method476();

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method477(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lza;")
    public abstract class434 method478(int arg0);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method479();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method480();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Luaa;)V")
    public abstract void method481(int arg0, class127[] arg1);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method482();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public final void method483(boolean arg0) throws class283 {
        if (arg0) {
            field895 = null;
        }
        field903++;
        this.method471(0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgl;IIII)Lka;")
    public abstract class497 method484(class625 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public abstract void method485(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method486(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method464((byte) -90);
        field912++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lhh;")
    public abstract class140 method488(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()I")
    public abstract int method489();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
    public abstract void method490();

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method491(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method492(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method493(int arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method494();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method495(int arg0);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method496();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method497(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lio;")
    public abstract class461 method498(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method499(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method500();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method501(class434 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leb;[Lvf;Z)Lda;")
    public abstract class67 method502(class651 arg0, class162[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method503();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class512 method504(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method505(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method507();

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method508(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lal;)V")
    public abstract void method509(class109 arg0);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method510();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method511();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method513(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method514();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)Lcj;")
    public abstract class720 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class295 method516(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(JB)V")
    public static final void method517(long arg0, byte arg1) {
        if (arg1 >= -29) {
            return;
        }
        field897++;
        int var3 = class46.field479;
        if (class439.field6328 != var3) {
            int var4 = var3 - class439.field6328;
            int var5 = (int) ((long) var4 * arg0 / 320L);
            if (var4 > 0) {
                if (var5 == 0) {
                    var5 = 1;
                } else if (var4 < var5) {
                    var5 = var4;
                }
            } else if (var5 == 0) {
                var5 = -1;
            } else if (var5 < var4) {
                var5 = var4;
            }
            class439.field6328 += var5;
        }
        int var6 = class265.field3902;
        if (class400.field5722 != var6) {
            int var7 = var6 - class400.field5722;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 > 0) {
                if (var8 == 0) {
                    var8 = 1;
                } else if (var8 > var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = -1;
            } else if (var7 > var8) {
                var8 = var7;
            }
            class400.field5722 += var8;
        }
        class514.field7144 += (float) arg0 * class495.field6971 / 40.0F * 8.0F;
        class294.field4169 += (float) arg0 * class49.field495 / 40.0F * 8.0F;
        class454.method2696(4);
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method518(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(Z)V")
    public static void method519(boolean arg0) {
        field895 = null;
        field916 = null;
        field899 = null;
        field905 = null;
        field917 = null;
        field915 = null;
        field918 = null;
        if (!arg0) {
            method517(-94L, (byte) -108);
        }
        field914 = null;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method520(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method521(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class283;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Canvas;IIILuq;ILd;)Lha;")
    public static final synchronized class66 method522(int arg0, Canvas arg1, int arg2, int arg3, int arg4, class172 arg5, int arg6, class161 arg7) {
        if (arg0 != -1) {
            return null;
        }
        field910++;
        if (arg4 == 0) {
            return class439.method2626(arg7, arg1, (byte) -69, arg2, arg6);
        } else if (arg4 == 2) {
            return class43.method241(arg1, arg2, arg7, arg6, (byte) 78);
        } else if (arg4 == 1) {
            return class782.method4293(arg3, arg1, (byte) -8, arg7);
        } else if (arg4 == 5) {
            return class325.method2105(arg7, (byte) 54, arg1, arg5, arg3);
        } else if (arg4 == 3) {
            return class556.method3189(arg3, arg1, arg7, 112, arg5);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public final void method523(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field893++;
        this.method465(arg4, arg3, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltv;I)V")
    public abstract void method524(class586 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method525(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method526();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
    public abstract void method527();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method528(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field896++;
        this.method434(arg3, arg1, arg2, arg0, arg4, arg5);
    }

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method530(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcj;Lcj;FLcj;)Lcj;")
    public abstract class720 method531(class720 arg0, class720 arg1, float arg2, class720 arg3);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method532();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method533(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltv;)V")
    public abstract void method534(class586 arg0);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()V")
    public abstract void method535();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method536();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method537(int arg0);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method538();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method540(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Lal;")
    public abstract class109 method541();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Ldca;")
    public abstract class189 method542();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method543(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)V")
    public final void method544(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.method474(arg0, arg2, arg1, arg3, 1);
        field894++;
        if (arg4 <= 124) {
            field898 = 7L;
        }
    }

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method546(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method547();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
    public final void method548(int arg0, Rectangle[] arg1, int arg2) throws class283 {
        this.method521(arg1, arg0, 0, 0);
        field901++;
        if (arg2 != 14091) {
            this.method536();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method549(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method550(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Luaa;")
    public abstract class127 method551(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method552(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V")
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field907++;
        this.method539(arg1, arg2, arg0, arg5, arg3, 1);
        if (arg4 <= 78) {
            field898 = 33L;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class66(class161 arg0) {
        this.field913 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class502.field7054[var3]) {
                class502.field7054[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field906 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhg;)V")
    public abstract void method554(class718 arg0);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method555(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method556(Canvas arg0);
}
