import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class43 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Le;")
    public class702 field598;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public int field604;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field606;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Z")
    public static boolean field599;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Law;Z)Lxa;")
    public abstract class511 method325(class506 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()V")
    public abstract void method180();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lqu;)V")
    public abstract void method326(class282 arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Log;")
    public abstract class463 method189();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public abstract boolean method327();

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method328(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public abstract boolean method329();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method330(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public final void method331(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method347(arg4, arg0, arg2, arg3, arg1);
        field601++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public abstract void method332(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field595++;
        this.method392((byte) -39);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpe;ILjava/awt/Canvas;Le;II)Loa;")
    public static final synchronized class43 method333(class615 arg0, int arg1, Canvas arg2, class702 arg3, int arg4, int arg5) {
        field606++;
        if (arg5 == 0) {
            return class219.method1398((byte) -85, arg3, arg2, false);
        } else if (arg5 == 2) {
            return class214.method1374(arg2, 1, arg3);
        } else if (arg5 == 4) {
            return class219.method1398((byte) -18, arg3, arg2, true);
        } else if (arg5 == 1) {
            return class626.method3480(true, arg4, arg3, arg2);
        } else if (arg5 == 5) {
            return class432.method2473(arg4, arg3, arg2, 4, arg0);
        } else if (arg1 < 111) {
            return null;
        } else if (arg5 == 3) {
            return class271.method1656(arg3, arg2, arg0, 13169, arg4);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public abstract boolean method334();

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method335(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()V")
    public abstract void method194();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method336(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public final void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field593++;
        int var7 = 125 % ((-arg5 - 69) / 48);
        this.method406(arg0, arg4, arg1, arg2, arg3, 1);
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
    public abstract boolean method338();

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method339(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
    public abstract boolean method340();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class511 method341(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method342(class151 arg0);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method343();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
    public abstract boolean method344();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method345(class686 arg0);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Lq;")
    public abstract class151 method346();

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
    public abstract void method179();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method347(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method348(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lqu;Lq;[Lht;I)V")
    public abstract void method349(class107[] arg0, class282 arg1, class151 arg2, class108[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkn;Lkn;FLkn;)Lkn;")
    public abstract class307 method188(class307 arg0, class307 arg1, float arg2, class307 arg3);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method350(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method351();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method388(arg3, arg5, arg0, arg4, arg1, 1);
        field594++;
        if (arg2 > -63) {
            field599 = true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public abstract boolean method355();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method356(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lxa;Z)V")
    public abstract void method234(class511 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
    public abstract void method173();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method357(int arg0, class619 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method358(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method359(int arg0);

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method360(float arg0);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public abstract void method225();

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method361();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZII)V")
    public final void method362(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.method411(arg0, arg1, arg3, arg4, 1);
        field597++;
        if (!arg2) {
            this.method173();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class619 method363(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lxa;")
    public abstract class511 method364(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Lqu;Lq;Lht;I)V")
    public abstract void method365(class107 arg0, class282 arg1, class151 arg2, class108 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method168();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lht;I)V")
    public abstract void method366(class107[] arg0, class151 arg1, class108[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method367(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)Li;")
    public abstract class686 method369(int arg0);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
    public abstract boolean method231();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method370(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method371(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
    public final void method372(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method378(arg4, arg3, arg0, arg2, arg1);
        field605++;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method373(int arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public abstract void method224(int arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method374(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([ILji;IIIZ)Lch;")
    public static final class219 method375(int[] arg0, class622 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field596++;
        if (arg3 != 34037) {
            method375(null, null, -28, 5, 61, true);
        }
        if (!arg1.field8694 && (!class386.method2202(-86, arg4) || !class386.method2202(-128, arg2))) {
            return arg1.field8650 ? new class219(arg1, 34037, arg4, arg2, arg5, arg0) : new class219(arg1, arg4, arg2, class426.method2447(arg4, 250), class426.method2447(arg2, 250), arg0);
        } else {
            return new class219(arg1, 3553, arg4, arg2, arg5, arg0);
        }
    }

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method376(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method377(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method378(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public abstract boolean method379();

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public abstract boolean method380();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class511 method381(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public abstract boolean method211();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method201(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public abstract boolean method382();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Lkn;")
    public abstract class307 method383(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()I")
    public abstract int method384();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lpn;")
    public abstract class296 method385(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public abstract boolean method386();

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public abstract boolean method387();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public abstract void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public abstract boolean method389();

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method390(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public abstract void method391(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public final void method392(byte arg0) {
        field600++;
        class197.field2594[this.field604] = false;
        if (arg0 == -39) {
            this.method225();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method219(Rectangle[] arg0, int arg1) throws class381;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method393(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method394(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method396();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lxa;I)V")
    public final void method397(class511 arg0, int arg1) {
        if (arg1 == 3) {
            this.method234(arg0, true);
            field602++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public abstract void method398(int arg0);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method399();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBII)V")
    public final void method400(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        this.method353(arg1, arg5, arg4, arg2, arg0, 1);
        field603++;
        if (arg3 <= 23) {
            this.field598 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public abstract void method205();

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method401();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Lq;")
    public abstract class151 method402();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkn;)V")
    public abstract void method403(class307 arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public abstract void method167(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method404(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lsga;[Law;Z)Lta;")
    public abstract class597 method405(class547 arg0, class506[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V")
    public abstract void method406(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method162(int arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method407(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
    public abstract void method408();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()V")
    public abstract void method208();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class619 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lfca;IIII)Lba;")
    public abstract class107 method410(class645 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method157(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method411(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lpn;)V")
    public abstract void method412(int arg0, class296[] arg1);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V")
    public class43(class702 arg0) {
        this.field598 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class197.field2594[var3]) {
                class197.field2594[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field604 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class88 method413(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()V")
    public abstract void method216() throws class381;
}
