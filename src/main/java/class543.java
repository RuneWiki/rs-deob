import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class543 {

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Ld;")
    public class267 field7881;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public int field7874;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field7887 = 1337;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field7871;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field7872;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field7873;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field7875;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field7876;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field7877;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field7878;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field7879;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field7880;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field7882;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field7883;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field7884;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field7885;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field7886;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 4)
    public final void method3258(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7875++;
        if (arg3 <= 30) {
            this.field7874 = 118;
        }
        this.method268(arg4, arg1, arg2, arg0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BIIIII)V", line = 22)
    public final void method3259(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method380(arg3, arg5, arg4, arg1, arg2, 1);
        if (arg0 == -124) {
            field7879++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 53)
    protected void finalize() {
        this.method3266(1);
        field7883++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 80)
    public final void method3260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method357(arg3, arg0, arg1, arg4, 1);
        if (arg2 < -52) {
            field7885++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V", line = 97)
    public final void method3261(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 == -21307) {
            this.method305(arg0, arg1, arg4, arg3, arg5, 1);
            field7877++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V", line = 119)
    public static final void method3262(int arg0) {
        if (arg0 != 1) {
            field7887 = 42;
        }
        class751.field10467.method1246(class718.field10131, class369.field5393, class137.field1881);
        field7882++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(BIIIII)V", line = 148)
    public final void method3263(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 >= -77) {
            field7887 = -30;
        }
        field7886++;
        this.method397(arg1, arg4, arg3, arg2, arg5, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltd;I)V", line = 169)
    public final void method3264(class515 arg0, int arg1) {
        this.method1239(this.method1231(arg0, this.method1255(arg0.method777(), arg0.method787())));
        if (arg1 != 1337) {
            this.field7874 = -125;
        }
        field7872++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIB)Ltd;", line = 187)
    public final class515 method3265(int[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field7884++;
        return arg5 == 50 ? this.method339(arg0, arg4, arg2, arg3, arg1, true) : null;
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V", line = 223)
    public final void method3266(int arg0) {
        class600.field8525[this.field7874] = false;
        field7871++;
        if (arg0 != 1) {
            this.method332();
        }
        this.method195();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZII)V", line = 246)
    public final void method3267(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            this.method304();
        }
        field7878++;
        this.method199(arg1, arg0, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V", line = 263)
    public final void method3268(boolean arg0) throws class360 {
        if (!arg0) {
            this.method1230(true);
        }
        field7876++;
        this.method1257(0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZ[Ljava/awt/Rectangle;)V", line = 277)
    public final void method3269(int arg0, boolean arg1, Rectangle[] arg2) throws class360 {
        field7880++;
        this.method1225(arg2, arg0, 0, 0);
        if (arg1) {
            this.field7874 = -86;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 287)
    public class543(class267 arg0) {
        this.field7881 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class600.field8525[var3]) {
                var2 = var3;
                class600.field8525[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7874 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZLjava/awt/Canvas;Lla;ILd;I)Lha;", line = 327)
    public static final synchronized class543 method3270(int arg0, int arg1, boolean arg2, Canvas arg3, class423 arg4, int arg5, class267 arg6, int arg7) {
        field7873++;
        if (arg7 == 0) {
            return class28.method141(arg3, arg6, -113, arg0, arg5);
        } else if (arg7 == 2) {
            return class685.method3891(arg5, arg6, arg0, arg3, 127);
        } else {
            if (!arg2) {
                method3270(27, -29, true, null, null, -27, null, -73);
            }
            if (arg7 == 1) {
                return class593.method3478(arg1, arg3, arg6, 4);
            } else if (arg7 == 5) {
                return class123.method867(arg1, arg6, arg3, -114, arg4);
            } else if (arg7 == 3) {
                return class516.method3139(true, arg3, arg4, arg1, arg6);
            } else {
                throw new IllegalArgumentException("UM");
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method398(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Lss;")
    public abstract class506 method298(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method387();

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method199(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lrga;")
    public abstract class290 method1255(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method1244();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfu;IIII)Lka;")
    public abstract class282 method404(class637 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method274(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method1230(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public abstract void method195();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method365();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)Lza;")
    public abstract class254 method205(int arg0);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method335(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method204();

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method332();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method229(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method1254(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method268(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method296();

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method369(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lss;)V")
    public abstract void method353(class506 arg0);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method357(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method207();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method1237();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method374(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method235(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method383(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Lsk;")
    public abstract class121 method304();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsk;)V")
    public abstract void method364(class121 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class339 method311(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method328();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method375(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method250();

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method388(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method260(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method340(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lup;")
    public abstract class239 method1253(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lup;Lrga;)Ldv;")
    public abstract class86 method1231(class239 arg0, class290 arg1);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method1240(int arg0);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method293(int arg0, class569 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method1257(int arg0, int arg1) throws class360;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqt;[Lffa;Z)Lda;")
    public abstract class400 method322(class502 arg0, class676[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method1242();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()I")
    public abstract int method270();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method292();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method402(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method318(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lwh;)V")
    public abstract void method277(int arg0, class40[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class569 method219(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method393(class254 arg0);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method331();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Ltd;")
    public abstract class515 method377(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lffa;Z)Ltd;")
    public abstract class515 method202(class676 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method379(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldv;)V")
    public abstract void method1239(class86 arg0);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method407();

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method227();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method1249(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method281(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method206(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method390(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method267(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method247();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method217();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method234(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method1234();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method1224();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method297(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method324(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leea;)V")
    public abstract void method214(class458 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method378(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method1226(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method276(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class569 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method300(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method211();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method395();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method1246(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Ltd;")
    public abstract class515 method359(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Lsk;")
    public abstract class121 method342();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method239(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method343();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lwh;")
    public abstract class40 method309(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method271(float arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leea;I)V")
    public abstract void method216(class458 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method363(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method358(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Lsk;")
    public abstract class121 method348();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method314(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
    public abstract void method1232();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method251(int arg0);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method330(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method397(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method255();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()V")
    public abstract void method1227();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method279(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method1250(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Ltd;")
    public abstract class515 method339(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lss;Lss;FLss;)Lss;")
    public abstract class506 method1251(class506 arg0, class506 arg1, float arg2, class506 arg3);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method1235();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method1225(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class360;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()V")
    public abstract void method1222();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method412();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Lfc;")
    public abstract class729 method1229();
}
