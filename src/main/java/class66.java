import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class66 {

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "Ld;")
    public class159 field883;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public int field884;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Z")
    public static boolean field876 = false;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field869;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field877;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field881;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field885;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method392();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method393(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public abstract void method395();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method396(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method397();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method398(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Lag;")
    public abstract class710 method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method400(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method401(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILjava/awt/Canvas;ILcb;ZLd;)Lha;")
    public static final synchronized class66 method402(int arg0, int arg1, int arg2, Canvas arg3, int arg4, class544 arg5, boolean arg6, class159 arg7) {
        field871++;
        if (arg2 == 0) {
            return class451.method2718((byte) 13, arg7, arg0, arg3, arg1);
        } else if (arg2 == 2) {
            return class192.method1406(-201, arg3, arg7, arg1, arg0);
        } else if (arg2 == 1) {
            return class2.method12(arg7, arg4, arg3, -73);
        } else if (arg2 == 5) {
            return class314.method2041(arg5, (byte) 60, arg7, arg3, arg4);
        } else if (arg2 == 3) {
            return class105.method715(arg7, arg3, arg4, arg5, (byte) -120);
        } else {
            if (!arg6) {
                method491(null, false);
            }
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkf;[Lre;Z)Lda;")
    public abstract class67 method403(class263 arg0, class625[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method404();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method405(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public abstract void method406(int arg0, int arg1) throws class138;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method407(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method408(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method410(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method411(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method412(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
    public abstract void method413();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method414(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public final void method416(byte arg0) throws class138 {
        field872++;
        this.method406(0, 0);
        if (arg0 != -63) {
            this.field883 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method417(int arg0);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method418();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V")
    public final void method419(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 != 34) {
            this.field883 = null;
        }
        this.method438(arg2, arg5, arg0, arg3, arg1, 1);
        field880++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhm;IIII)Lka;")
    public abstract class495 method420(class229 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method421(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method422();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method423();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method424();

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method425();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method426();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method428(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljw;)V")
    public abstract void method429(int arg0, class578[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class510 method430(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method431(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method432();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Leh;")
    public abstract class378 method433();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method434();

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method435(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method436();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhea;)V")
    public abstract void method437(class443 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method438(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method439(class432 arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method440(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method441(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lvu;")
    public abstract class354 method442(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
    public abstract void method443();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method444();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Leh;)V")
    public abstract void method445(class378 arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method446(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()V")
    public abstract void method447();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method448();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method449();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public final void method450(int arg0) {
        class672.field9422[this.field884] = false;
        field881++;
        this.method447();
        if (arg0 != 1) {
            this.method395();
        }
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method451(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method452(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method453(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method454();

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method455(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lnea;Lvu;)Lcp;")
    public abstract class753 method456(class742 arg0, class354 arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method458(int arg0);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method459(int arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method460();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method461();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Leh;")
    public abstract class378 method462();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method463();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhea;I)V")
    public abstract void method464(class443 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Z")
    public abstract boolean method465();

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method466();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBIII)V")
    public final void method467(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field874++;
        if (arg2 > 113) {
            this.method457(arg5, arg0, arg1, arg3, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method468(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method469();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method470(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field882++;
        this.method450(1);
    }

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()I")
    public abstract int method471();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method472(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class138;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method473(int arg0);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method474(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method475();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIZI[I)Lqda;")
    public final class112 method476(int arg0, int arg1, int arg2, boolean arg3, int arg4, int[] arg5) {
        field877++;
        if (!arg3) {
            this.method455(-94, -23, -92, 85);
        }
        return this.method481(arg5, arg0, arg2, arg4, arg1, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class292 method477(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIII)V")
    public final void method478(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field870++;
        if (arg1) {
            this.method440(arg0, arg4, arg3, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method479(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method480(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field878++;
        this.method431(arg4, arg3, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lqda;")
    public abstract class112 method481(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lre;Z)Lqda;")
    public abstract class112 method482(class625 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Lrda;")
    public abstract class689 method483();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lag;)V")
    public abstract void method484(class710 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcp;)V")
    public abstract void method485(class753 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
    public final void method486(int arg0, Rectangle[] arg1, int arg2) throws class138 {
        this.method472(arg1, arg0, arg2, 0);
        field875++;
    }

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method487(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public final void method488(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field869++;
        this.method474(arg1, arg0, arg5, arg3, arg2, arg4);
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method489(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method490(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method491(String arg0, boolean arg1) {
        field879++;
        int var2 = arg0.length();
        long var3 = 0L;
        if (arg1) {
            method491(null, true);
        }
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Ljw;")
    public abstract class578 method492(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Leh;")
    public abstract class378 method493();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method494(int arg0, class510 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method495(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLqda;)V")
    public final void method496(byte arg0, class112 arg1) {
        field873++;
        this.method485(this.method456(arg1, this.method442(arg1.method777(), arg1.method789())));
        if (arg0 <= 74) {
            this.method469();
        }
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method497();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method498(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method499(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method500(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Lnea;")
    public abstract class742 method501(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lqda;")
    public abstract class112 method502(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class66(class159 arg0) {
        this.field883 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class672.field9422[var3]) {
                var2 = var3;
                class672.field9422[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field884 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)V")
    public final void method503(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.method394(-72, 15, 91, -46, -36, -112);
        }
        field885++;
        this.method487(arg2, arg1, arg3, arg0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIZ)Lqda;")
    public abstract class112 method504(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method505(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method506(float arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lag;Lag;FLag;)Lag;")
    public abstract class710 method507(class710 arg0, class710 arg1, float arg2, class710 arg3);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)Lza;")
    public abstract class432 method508(int arg0);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method509();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method510(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method511(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method512(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method513(int arg0, int arg1, int arg2, int arg3, int[] arg4);
}
