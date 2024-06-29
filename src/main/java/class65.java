import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class65 {

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "Ld;")
    public class160 field774;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public int field784;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lbu;")
    public static class21 field780 = new class21(55, 3);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "[Ljm;")
    public static class717[] field792 = null;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lsaa;")
    public static class345 field793 = new class345(1, 2);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field795 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field785;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field789;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Lgu;")
    public static class605 field783;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lwia;")
    public static class791 field790;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZI)V", line = 10)
    public final void method436(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg4) {
            this.method495(arg0, arg3, arg1, arg5, arg2, 1);
            field776++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBII)V", line = 34)
    public final void method445(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field786++;
        if (arg2 != -17) {
            this.method468();
        }
        this.method500(arg1, arg0, arg3, arg4, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 45)
    public final void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 < -117) {
            this.method487(arg5, arg3, arg4, arg1, arg0, 1);
            field781++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLjd;)V", line = 69)
    public final void method456(boolean arg0, class241 arg1) {
        field789++;
        if (arg0) {
            this.method554(true);
        }
        this.method528(this.method443(arg1, this.method532(arg1.method1508(), arg1.method1502())));
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BII[III)Ljd;", line = 81)
    public final class241 method458(byte arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        int var7 = 39 % ((7 - arg0) / 60);
        field778++;
        return this.method536(arg3, arg5, arg4, arg2, arg1, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 97)
    public final void method465(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method529(arg4, arg2, arg0, arg3, arg1);
        field794++;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 110)
    protected void finalize() {
        this.method533(94);
        field779++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLjava/awt/Canvas;IILwia;IILd;)Lha;", line = 123)
    public static final synchronized class65 method472(boolean arg0, Canvas arg1, int arg2, int arg3, class791 arg4, int arg5, int arg6, class160 arg7) {
        field788++;
        if (arg3 == 0) {
            return class33.method274(-74, arg1, arg5, arg7, arg2);
        }
        if (arg0) {
            method496(-103, 111, -4);
        }
        if (arg3 == 2) {
            return class88.method660(arg2, arg7, (byte) 107, arg5, arg1);
        } else if (arg3 == 1) {
            return class249.method1644(arg6, arg1, 11549, arg7);
        } else if (arg3 == 5) {
            return class209.method1443(arg4, arg7, arg6, (byte) 37, arg1);
        } else if (arg3 == 3) {
            return class73.method584(arg4, arg6, true, arg7, arg1);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 170)
    public static void method482(byte arg0) {
        field790 = null;
        if (arg0 != 3) {
            field783 = null;
        }
        field780 = null;
        field783 = null;
        field793 = null;
        field795 = null;
        field792 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)Z", line = 207)
    public static final boolean method496(int arg0, int arg1, int arg2) {
        if (arg0 == 32768) {
            field777++;
            return (arg2 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 231)
    public final void method508(int arg0) throws class736 {
        this.method463(0, 0);
        field785++;
        if (arg0 <= 120) {
            this.method544(true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V", line = 277)
    public final void method533(int arg0) {
        class596.field8375[this.field784] = false;
        field787++;
        if (arg0 >= 37) {
            this.method484();
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 291)
    public class65(class160 arg0) {
        this.field774 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class596.field8375[var3]) {
                var2 = var3;
                class596.field8375[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field784 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)V", line = 323)
    public final void method540(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method520(arg1, arg4, arg5, arg0, arg3, 1);
        field791++;
        if (arg2 != 25951) {
            this.method507(null, -13, 121);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;ZI)V", line = 338)
    public final void method543(Rectangle[] arg0, boolean arg1, int arg2) throws class736 {
        this.method498(arg0, arg2, 0, 0);
        field782++;
        if (arg1) {
            field783 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 350)
    public static final boolean method545(String arg0, int arg1) {
        if (arg1 != -21613) {
            field790 = null;
        }
        field773++;
        return class123.field1921.containsKey(arg0);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 363)
    public final void method547(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method478(arg0, arg3, arg2, arg4, 1);
        field775++;
        if (arg1 < 23) {
            this.field774 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method431();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method432();

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method433();

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method434(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method435(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lie;[Lus;Z)Lda;")
    public abstract class66 method437(class6 arg0, class1[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lqm;")
    public abstract class154 method439(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Lqja;")
    public abstract class326 method440();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method441();

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method442(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkfa;Lts;)Lpt;")
    public abstract class555 method443(class627 arg0, class560 arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lza;")
    public abstract class434 method444(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    public abstract void method447();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method449(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method450(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method451();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method452();

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method454(int arg0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method455();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method457();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method459(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method460(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lqm;)V")
    public abstract void method461(int arg0, class154[] arg1);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method462();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public abstract void method463(int arg0, int arg1) throws class736;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqaa;)V")
    public abstract void method464(class29 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method467(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()V")
    public abstract void method468();

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method469(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqaa;Lqaa;FLqaa;)Lqaa;")
    public abstract class29 method470(class29 arg0, class29 arg1, float arg2, class29 arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method471(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method473(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method474(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method475(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method476();

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method477();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method478(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Ljd;")
    public abstract class241 method479(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldba;IIII)Lka;")
    public abstract class496 method480(class100 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lkfa;")
    public abstract class627 method481(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method483();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method484();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method485(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method486();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method487(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class294 method488(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method489();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method490(int arg0, class511 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method492();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method493(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method494();

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method495(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method497(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method498(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class736;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method499(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method500(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method501(class434 arg0);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method502(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method503(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkd;)V")
    public abstract void method504(class296 arg0);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Lqja;")
    public abstract class326 method505();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method506();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method507(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method509(int arg0);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method510();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method511();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method512(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method513();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Lqja;")
    public abstract class326 method514();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method515(float arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method516();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Ljd;")
    public abstract class241 method517(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method518();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method519(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method520(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Lqaa;")
    public abstract class29 method521(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method523(int arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method524(int arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method525(int arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method526(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpt;)V")
    public abstract void method528(class555 arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method529(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method530(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lts;")
    public abstract class560 method532(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method534();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()I")
    public abstract int method535();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Ljd;")
    public abstract class241 method536(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method537(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method538();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class511 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkd;I)V")
    public abstract void method541(class296 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method542(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method544(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()V")
    public abstract void method546();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()V")
    public abstract void method548();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method549(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqja;)V")
    public abstract void method550(class326 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lus;Z)Ljd;")
    public abstract class241 method551(class1 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class511 method552(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Lcq;")
    public abstract class491 method553();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method554(boolean arg0);
}
