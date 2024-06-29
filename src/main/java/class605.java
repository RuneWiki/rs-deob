import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class605 {

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "Le;")
    public class462 field8852;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public int field8846;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Lraa;")
    public static class528 field8857 = new class528("WTQA", 2);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[I")
    public static int[] field8858 = new int[16384];

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "[I")
    public static int[] field8859 = new int[16384];

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Lig;")
    public static class206 field8860;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field8847;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field8848;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field8853;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field8854;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field8856;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lq;")
    public abstract class364 method337();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method387(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IZIII)V")
    public final void method3519(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            this.method371(null, null, 0.3112688F, null);
        }
        this.method327(arg3, arg4, arg2, arg0, 1);
        field8851++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public abstract void method323(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public abstract void method362();

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method375();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method344(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lcq;[Laf;Z)Lta;")
    public abstract class181 method329(class402 arg0, class372[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method333(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)Ldw;")
    public abstract class622 method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBII)V")
    public final void method3520(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field8848++;
        this.method320(arg1, arg2, arg4, arg0, arg5, 1);
        if (arg3 != 0) {
            this.field8852 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method373();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method383(Rectangle[] arg0, int arg1) throws class27;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method300(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V")
    public abstract void method320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()V")
    public abstract void method379();

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method305();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()Z")
    public abstract boolean method363();

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method369();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method361(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public abstract boolean method297();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method403(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method381();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method357(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method405(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laf;Z)Lxa;")
    public abstract class433 method388(class372 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public abstract boolean method341();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method400(int arg0);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()V")
    public abstract void method317();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lbe;)V")
    public abstract void method396(class33 arg0);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Lnl;")
    public abstract class479 method330();

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
    public abstract boolean method356();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class132 method304(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method332(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public final void method3521(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8849++;
        if (arg3 == 2) {
            this.method306(arg0, arg4, arg1, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method293(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public final void method3522(int arg0) {
        if (arg0 != 16384) {
            this.method379();
        }
        field8856++;
        class413.field6268[this.field8846] = false;
        this.method367();
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public abstract void method345(int arg0);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public abstract boolean method325();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V")
    public final void method3523(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field8855++;
        this.method299(arg5, arg2, arg3, arg1, arg4, 1);
        if (!arg0) {
            field8859 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method302(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public abstract boolean method359();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method347(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lor;IIII)Lba;")
    public abstract class327 method326(class557 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public abstract void method349();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public abstract boolean method390();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method365(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method406(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public abstract void method378(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public abstract void method367();

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Lq;")
    public abstract class364 method342();

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()V")
    public abstract void method338() throws class27;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldw;Ldw;FLdw;)Ldw;")
    public abstract class622 method371(class622 arg0, class622 arg1, float arg2, class622 arg3);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method298(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public abstract boolean method331();

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public abstract void method350();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method296(int arg0);

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method310(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public abstract void method402(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method364(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method393(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method314(class35 arg0);

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field8847++;
        this.method3522(16384);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class433 method389(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V")
    public class605(class462 arg0) {
        this.field8852 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class413.field6268[var3]) {
                class413.field6268[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field8846 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBIII)V")
    public final void method3524(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 92) {
            field8858 = null;
        }
        field8850++;
        this.method394(arg5, arg1, arg0, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Loj;)V")
    public abstract void method340(int arg0, class321[] arg1);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public abstract boolean method398();

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public abstract boolean method370();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)V")
    public abstract void method380(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Lbe;Lq;Lsda;I)V")
    public abstract void method307(class327 arg0, class33 arg1, class364 arg2, class219 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method384(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public abstract boolean method322();

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public abstract boolean method395();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method312(int arg0, class199 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class199 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lsda;I)V")
    public abstract void method385(class327[] arg0, class364 arg1, class219[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method374();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method382(class364 arg0);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)Li;")
    public abstract class35 method355(int arg0);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()V")
    public abstract void method354();

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method319(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method352(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()Z")
    public abstract boolean method335();

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method404();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
    public abstract boolean method399();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V")
    public abstract void method348(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Loj;")
    public abstract class321 method346(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
    public final void method3525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8854++;
        this.method384(arg1, arg2, arg4, arg0, arg3);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBILe;Ljava/awt/Canvas;Lkea;)Loa;")
    public static final synchronized class605 method3526(int arg0, byte arg1, int arg2, class462 arg3, Canvas arg4, class203 arg5) {
        field8853++;
        if (arg2 == 0) {
            return class363.method2339(false, arg3, -125, arg4);
        } else if (arg2 == 2) {
            return class399.method2544(arg4, true, arg3);
        } else if (arg2 == 4) {
            return class363.method2339(true, arg3, -125, arg4);
        } else if (arg2 == 1) {
            return class572.method3328(-128, arg0, arg4, arg3);
        } else if (arg2 == 5) {
            return class141.method853((byte) -71, arg0, arg4, arg5, arg3);
        } else {
            if (arg1 != -63) {
                method3526(-75, (byte) -60, -18, null, null, null);
            }
            if (arg2 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class539.method3141(false, arg3, arg4, arg0, arg5);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lbe;Lq;[Lsda;I)V")
    public abstract void method328(class327[] arg0, class33 arg1, class364 arg2, class219[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method368(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method401(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()I")
    public abstract int method324();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method306(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
    public abstract boolean method334();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class199 method301(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public static void method3527(int arg0) {
        if (arg0 == -2) {
            field8858 = null;
            field8857 = null;
            field8859 = null;
            field8860 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class433 method343(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method315(float arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldw;)V")
    public abstract void method392(class622 arg0);

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field8859[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field8858[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field8860 = new class206(43, -2);
    }
}
