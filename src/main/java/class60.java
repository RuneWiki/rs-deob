import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class60 {

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Ld;")
    public class152 field636;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field632;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Llga;")
    public static class712 field640 = new class712(50, 18);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Z")
    public static boolean field647 = false;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "Lhaa;")
    public static class82 field648 = new class82();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "[I")
    public static int[] field651 = new int[2];

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field652 = 0;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field634;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field635;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field637;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field642;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lufa;")
    public abstract class680 method338(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqp;)V")
    public abstract void method339(class657 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method340(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILjava/awt/Canvas;Ld;ILni;II)Lha;")
    public static final synchronized class60 method341(byte arg0, int arg1, Canvas arg2, class152 arg3, int arg4, class522 arg5, int arg6, int arg7) {
        field641++;
        if (arg6 == 0) {
            return class414.method2389(arg3, arg7, arg4, arg2, 500);
        } else if (arg6 == 2) {
            return class581.method3246(arg4, (byte) 81, arg7, arg2, arg3);
        } else if (arg6 == 1) {
            return class82.method605(arg2, 2, arg1, arg3);
        } else if (arg6 == 5) {
            return class589.method3281(arg1, arg5, arg3, 0, arg2);
        } else {
            if (arg0 <= 35) {
                field647 = true;
            }
            if (arg6 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class59.method337(54, arg1, arg2, arg3, arg5);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public final void method342(int arg0) {
        class124.field1625[this.field632] = false;
        field630++;
        this.method383();
        if (arg0 != -1) {
            this.method451(24, 39, 35, null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lku;")
    public abstract class379 method343(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class281 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method345(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method346();

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method347(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method348(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method349(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method350(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII[II)Lufa;")
    public final class680 method351(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5) {
        if (arg0 == -7962) {
            field650++;
            return this.method379(arg4, arg1, arg2, arg5, arg3, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method352(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method353(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method354(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method356();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lhba;")
    public abstract class10 method357();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method358(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method359(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == 22294) {
            this.method347(arg4, arg3, arg1, arg2, 1);
            field645++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public final void method360(int arg0) throws class353 {
        this.method373(0, 0);
        int var2 = 60 / ((arg0 + 67) / 59);
        field634++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V")
    public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method386(arg2, arg1, arg4, arg3, 1);
        if (arg0 == 8479) {
            field646++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method362();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIII)V")
    public final void method364(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= 19) {
            this.method380(-128, 0.4222986F, -0.8555362F, 0.64319474F, 0.16042754F, -0.00591929F);
        }
        field649++;
        this.method421(arg4, arg1, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method365(int arg0, class487 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltw;Z)Lufa;")
    public abstract class680 method366(class204 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhba;)V")
    public abstract void method367(class10 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V")
    public final void method368(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field643++;
        this.method447(arg5, arg2, arg0, arg1, arg3, 1);
        if (arg4 != -66) {
            field640 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method369(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method370();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Lza;")
    public abstract class416 method371(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILufa;)V")
    public final void method372(int arg0, class680 arg1) {
        if (arg0 > -56) {
            this.method398(null);
        }
        this.method339(this.method443(arg1, this.method343(arg1.method674(), arg1.method676())));
        field642++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    public abstract void method373(int arg0, int arg1) throws class353;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lcba;")
    public abstract class551 method374(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method342(-1);
        field635++;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method375();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method376();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method377();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldi;Ldi;FLdi;)Ldi;")
    public abstract class128 method378(class128 arg0, class128 arg1, float arg2, class128 arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lufa;")
    public abstract class680 method379(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method380(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method381();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class487 method382(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
    public abstract void method383();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method384(int arg0);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method385(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method386(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldi;)V")
    public abstract void method387(class128 arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()V")
    public abstract void method388();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    public abstract int method389(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method390(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method392();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIIIII)V")
    public final void method393(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method391(arg4, arg5, arg2, arg1, arg3, 1);
        if (arg0) {
            field633++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method394(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method395(int arg0);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method396(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpf;I)V")
    public abstract void method397(class583 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method398(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class60(class152 arg0) {
        this.field636 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class124.field1625[var3]) {
                class124.field1625[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field632 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method399(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method400();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public static void method401(boolean arg0) {
        field648 = null;
        field651 = null;
        if (arg0) {
            field640 = null;
        }
        field640 = null;
    }

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method402(int arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method404();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public final void method405(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field637++;
        if (arg4 != -10550) {
            this.method458();
        }
        this.method412(arg5, arg0, arg3, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method406();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Llv;IIII)Lka;")
    public abstract class472 method407(class446 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method408(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Lhba;")
    public abstract class10 method410();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
    public final void method411(Rectangle[] arg0, int arg1, int arg2) throws class353 {
        if (arg2 != 27179) {
            field648 = null;
        }
        field638++;
        this.method429(arg0, arg1, 0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILji;)Luk;")
    public static final class263 method413(int arg0, class611 arg1) {
        field644++;
        int var2 = arg1.method3402((byte) 127);
        class676 var3 = class216.method1203(112)[arg1.method3428((byte) 123)];
        if (arg0 != 9342) {
            field631 = -127;
        }
        class82 var4 = class449.method2516(256)[arg1.method3428((byte) -127)];
        int var5 = arg1.method3413(false);
        int var6 = arg1.method3413(false);
        return new class263(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lufa;")
    public abstract class680 method414(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method415();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method416(int arg0);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method417();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Leca;")
    public abstract class758 method418();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
    public abstract boolean method419();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method420(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method421(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method422(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method423();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Ldi;")
    public abstract class128 method424(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmv;[Ltw;Z)Lda;")
    public abstract class61 method425(class377 arg0, class204[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method426(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method427(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method428(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method429(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class353;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method430(int arg0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V")
    public abstract void method431(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method432(class416 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method433(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class487 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method434(float arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method435();

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method436(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method438(int arg0);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()V")
    public abstract void method439();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)Lci;")
    public abstract class451 method440(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()V")
    public abstract void method441();

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method442(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lci;Lku;)Lqp;")
    public abstract class657 method443(class451 arg0, class379 arg1);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method445(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method446();

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method448();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lcba;)V")
    public abstract void method449(int arg0, class551[] arg1);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method450();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method451(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpf;)V")
    public abstract void method452(class583 arg0);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method453();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Lhba;")
    public abstract class10 method454();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()I")
    public abstract int method455();

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method456();

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method457();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method458();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method459();

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method460(int arg0, int arg1, int arg2, int arg3);
}
