import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class58 {

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "Ld;")
    public class149 field715;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "[F")
    public static float[] field711 = new float[4];

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field704;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field716;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lza;")
    public abstract class413 method371(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lwi;)V")
    public abstract void method372(int arg0, class465[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method373(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method374();

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field716++;
        this.method474(1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method375(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class76;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public abstract void method376();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method377();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method378(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldm;I)V")
    public abstract void method379(class50 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Loia;")
    public abstract class88 method380(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldm;)V")
    public abstract void method381(class50 arg0);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method382();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
    public final void method384(Rectangle[] arg0, int arg1, int arg2) throws class76 {
        if (arg1 != 14629) {
            field710 = -72;
        }
        field706++;
        this.method375(arg0, arg2, 0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method385(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Loia;")
    public abstract class88 method386(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method387();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static void method388(byte arg0) {
        if (arg0 <= 39) {
            field711 = null;
        }
        field711 = null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
    public abstract void method389();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method391(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method392();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public final void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= 42) {
            this.method377();
        }
        this.method445(arg5, arg0, arg3, arg2, arg1, 1);
        field709++;
    }

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method395();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method396();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lie;IIII)Lka;")
    public abstract class471 method397(class6 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method398(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method399(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method400(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method430(arg1, arg2, arg3, arg4, 1);
        if (arg0 <= 117) {
            this.method469(-75, -80, -32, 112);
        }
        field714++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLoia;)V")
    public final void method401(byte arg0, class88 arg1) {
        if (arg0 == 26) {
            this.method478(this.method467(arg1, this.method473(arg1.method657(), arg1.method663())));
            field712++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method402(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method403(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()I")
    public abstract int method404();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmf;)V")
    public abstract void method405(class418 arg0);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method406(float arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method407();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method408(int arg0);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public final void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field707++;
        this.method378(arg5, arg1, arg3, arg2, arg4, 1);
        if (arg0 < 49) {
            this.method446(101, 93, 116, null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Z)V")
    public static final void method411(String arg0, int arg1, int arg2, String arg3, boolean arg4) {
        class101.method728(arg1, arg3, true, -1, arg4, true, arg0);
        if (arg2 == 7059) {
            field702++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
    public abstract void method412();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method413();

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method414();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Ldw;")
    public abstract class717 method415(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method416(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBII)V")
    public final void method417(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field703++;
        this.method431(arg1, arg2, arg5, arg4, arg0, 1);
        if (arg3 < 51) {
            this.field700 = -115;
        }
    }

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class278 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method420(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Loia;")
    public abstract class88 method421(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method422(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method423(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method424();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V")
    public final void method425(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 >= 90) {
            field701++;
            this.method461(arg1, arg4, arg2, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIII)Loia;")
    public final class88 method426(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5) {
        field708++;
        if (arg3 != -1) {
            this.field700 = -39;
        }
        return this.method421(arg2, arg5, arg0, arg4, arg1, true);
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Lnga;")
    public abstract class513 method427();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method428(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method429(int arg0);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method430(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method431(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
    public abstract void method432();

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method433(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method434();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public abstract void method435(int arg0, int arg1) throws class76;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lnga;")
    public abstract class513 method436();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method438();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lnga;")
    public abstract class513 method439();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method440();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method441();

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method442(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method443(int arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method444(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method446(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method447(int arg0, class486 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Lmf;")
    public abstract class418 method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method449(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method450(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Lcf;")
    public abstract class603 method451();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public final void method452(int arg0) throws class76 {
        this.method435(0, arg0);
        field713++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmf;Lmf;FLmf;)Lmf;")
    public abstract class418 method453(class418 arg0, class418 arg1, float arg2, class418 arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method455(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class486 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method457(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public final void method458(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method433(arg0, arg1, arg3, arg4, 1);
        if (arg2 == 8985) {
            field705++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqm;[Ldga;Z)Lda;")
    public abstract class59 method459(class143 arg0, class204[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method460(class413 arg0);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method461(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method462();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method463();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method464(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method465();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method466(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldw;Lgba;)Lgd;")
    public abstract class339 method467(class717 arg0, class666 arg1);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
    public abstract boolean method468();

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method469(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method470(int arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method471();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()V")
    public abstract void method472();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lgba;")
    public abstract class666 method473(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public final void method474(int arg0) {
        if (arg0 == 1) {
            class459.field6468[this.field700] = false;
            field717++;
            this.method389();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lwi;")
    public abstract class465 method475(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method476();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method477(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgd;)V")
    public abstract void method478(class339 arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method479(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method480(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()V")
    public abstract void method481();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method482(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnga;)V")
    public abstract void method483(class513 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldga;Z)Loia;")
    public abstract class88 method484(class204 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILfp;ILjava/awt/Canvas;IILd;I)Lha;")
    public static final synchronized class58 method485(int arg0, class323 arg1, int arg2, Canvas arg3, int arg4, int arg5, class149 arg6, int arg7) {
        field704++;
        if (arg5 == 0) {
            return class374.method2354(arg2, arg6, arg7, (byte) 76, arg3);
        } else if (arg5 == 2) {
            return class453.method2701(arg6, arg2, -14883, arg3, arg7);
        } else if (arg5 == 1) {
            return class130.method873(arg4, arg6, arg3, 18785);
        } else if (arg5 == 5) {
            return class718.method4035(arg4, arg6, arg3, -31955, arg1);
        } else if (arg5 == 3) {
            return class410.method2533(arg6, arg3, arg1, arg4, -18090);
        } else if (arg0 == -1346) {
            throw new IllegalArgumentException("UM");
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method486(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method487();

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class58(class149 arg0) {
        this.field715 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class459.field6468[var3]) {
                var2 = var3;
                class459.field6468[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field700 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class486 method489(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method490(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method491();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method492(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method493(int arg0, int arg1, int arg2, int arg3, double arg4);
}
