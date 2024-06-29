import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class65 {

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "Ld;")
    public class161 field912;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field913;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "[I")
    public static int[] field924 = new int[200];

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 23)
    public final void method462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 92 % ((arg0 + 76) / 34);
        field914++;
        this.method563(arg4, arg2, arg1, arg3, arg5, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILjava/awt/Canvas;BILd;ILaj;)Lha;", line = 33)
    public static final synchronized class65 method463(int arg0, int arg1, Canvas arg2, byte arg3, int arg4, class161 arg5, int arg6, class333 arg7) {
        field927++;
        if (arg4 == 0) {
            return class631.method3542(arg6, arg5, 3, arg1, arg2);
        } else if (arg4 == 2) {
            return class788.method4358(arg1, arg5, arg2, (byte) -64, arg6);
        } else if (arg4 == 1) {
            return class485.method2811(arg5, false, arg0, arg2);
        } else if (arg4 == 5) {
            return class226.method1493(arg0, arg7, 0, arg5, arg2);
        } else if (arg4 == 3) {
            return class175.method1240(arg7, arg2, -8992, arg0, arg5);
        } else {
            if (arg3 <= 99) {
                method463(120, 115, null, (byte) -128, -101, null, 90, null);
            }
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 71)
    public static void method464(byte arg0) {
        if (arg0 == -122) {
            field924 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 90)
    public final void method470(byte arg0) {
        field925++;
        int var2 = 38 / ((-arg0 - 24) / 40);
        class162.field2201[this.field913] = false;
        this.method465();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIIII)V", line = 103)
    public final void method471(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method538(arg4, arg0, arg5, arg2, arg3, 1);
        if (arg1 != 40) {
            this.method473(null);
        }
        field916++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IBIIII)V", line = 124)
    public final void method479(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field921++;
        this.method559(arg5, arg2, arg3, arg4, arg0, 1);
        if (arg1 >= -20) {
            this.field913 = -94;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZLvr;)V", line = 157)
    public final void method495(boolean arg0, class147 arg1) {
        if (arg0) {
            field915++;
            this.method549(this.method566(arg1, this.method536(arg1.method1107(), arg1.method1110())));
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IZIII)Lvr;", line = 171)
    public final class147 method499(int arg0, int[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field923++;
        if (!arg2) {
            this.method518(124, null, 124, 75);
        }
        return this.method544(arg1, arg3, arg0, arg5, arg4, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 189)
    public final void method502(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method520(arg2, arg3, arg0, arg4, 1);
        int var6 = -33 / ((-arg1 - 23) / 53);
        field928++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;IZ)V", line = 210)
    public final void method509(Rectangle[] arg0, int arg1, boolean arg2) throws class566 {
        field926++;
        if (arg2) {
            field918 = -66;
        }
        this.method487(arg0, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)V", line = 227)
    public final void method514(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 > -46) {
            field918 = -48;
        }
        this.method488(arg1, arg0, arg3, arg2, 1);
        field920++;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 243)
    protected void finalize() {
        this.method470((byte) 105);
        field919++;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(B)V", line = 290)
    public final void method548(byte arg0) throws class566 {
        field917++;
        if (arg0 < -60) {
            this.method504(0, 0);
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 306)
    public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field922++;
        this.method515(arg4, arg0, arg1, arg3, arg2);
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 319)
    public class65(class161 arg0) {
        this.field912 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class162.field2201[var3]) {
                class162.field2201[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field913 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method447(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method448(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method449(class437 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Luu;")
    public abstract class303 method450();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()I")
    public abstract int method451();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method452(float arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method453();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method454(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method455(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method457();

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method458(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method459(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method460(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method461();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
    public abstract void method465();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method466(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)Ldn;")
    public abstract class544 method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    public abstract void method468();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method469(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Luu;")
    public abstract class303 method472();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldn;)V")
    public abstract void method473(class544 arg0);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method474(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method476(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leu;Z)Lvr;")
    public abstract class147 method477(class508 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method478();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method480(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method481(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Lza;")
    public abstract class437 method482(int arg0);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method483();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method484();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method485();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Luca;)V")
    public abstract void method486(int arg0, class540[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method487(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class566;

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method488(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method489(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method490();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method491();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method492(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method493(int arg0);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method494(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method496();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public abstract class544 method497(class544 arg0, class544 arg1, float arg2, class544 arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public abstract int method498(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
    public abstract void method500();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method501();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method503();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public abstract void method504(int arg0, int arg1) throws class566;

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method505(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method506(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method507(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lvr;")
    public abstract class147 method508(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgfa;IIII)Lka;")
    public abstract class500 method510(class782 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method511();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method512(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method513();

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method515(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method516(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method517(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method518(int arg0, class514 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method519();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method520(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method521(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method522();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class514 method523(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lef;)V")
    public abstract void method524(class515 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method525(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luu;)V")
    public abstract void method526(class303 arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method527(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lbfa;")
    public abstract class390 method528(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method529();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Luca;")
    public abstract class540 method530(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method531(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lef;I)V")
    public abstract void method532(class515 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method533(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
    public abstract boolean method534();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method535();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Ltq;")
    public abstract class656 method536(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method539();

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method540(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method541(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method542();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method543();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lvr;")
    public abstract class147 method544(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leia;[Leu;Z)Lda;")
    public abstract class66 method545(class255 arg0, class508[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method546(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class296 method547(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvv;)V")
    public abstract void method549(class345 arg0);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method550(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method551(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method552(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method554(int arg0);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method555();

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method556(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method557(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Lcja;")
    public abstract class45 method558();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method559(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method560();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method561(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lvr;")
    public abstract class147 method562(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Luu;")
    public abstract class303 method565();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbfa;Ltq;)Lvv;")
    public abstract class345 method566(class390 arg0, class656 arg1);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method567();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method568();
}
