import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class651 {

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "Le;")
    public class498 field8808;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field8804;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Los;")
    public static class412 field8811 = new class412(2, 2);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "F")
    public static float field8815;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field8800;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field8801;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field8802;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field8803;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field8805;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field8806;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field8807;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field8809;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field8810;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field8813;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field8814;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field8817;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "[Lxa;")
    public static class468[] field8812;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIBII)V", line = 5)
    public final void method3564(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < -104) {
            field8801++;
            this.method436(arg3, arg4, arg1, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V", line = 18)
    public final void method3565(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method384(arg4, arg2, arg3, arg1, arg5, 1);
        field8814++;
        if (arg0) {
            this.method390();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V", line = 33)
    public final void method3566(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8816++;
        this.method446(arg1, arg4, arg3, arg0, 1);
        int var6 = 12 % ((arg2 - 86) / 38);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIB)V", line = 71)
    public final void method3567(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg5 < 94) {
            field8815 = 0.7495633F;
        }
        this.method415(arg1, arg3, arg0, arg2, arg4, 1);
        field8800++;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)I", line = 83)
    public static final int method3568(int arg0) {
        field8803++;
        if ((double) class567.field7502 == 3.0D) {
            return 37;
        } else if ((double) class567.field7502 == 4.0D) {
            return 50;
        } else {
            if (arg0 != 1) {
                method3568(0);
            }
            if ((double) class567.field7502 == 6.0D) {
                return 75;
            } else if ((double) class567.field7502 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V", line = 130)
    public static void method3569(byte arg0) {
        field8812 = null;
        if (arg0 < 18) {
            method3571(-17, null, -128, 46, null, null);
        }
        field8811 = null;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V", line = 153)
    public final void method3570(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method379(arg0, arg3, arg4, arg2, arg1);
        field8809++;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 162)
    protected void finalize() {
        field8810++;
        this.method3574(8);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILjava/awt/Canvas;IILbi;Le;)Loa;", line = 170)
    public static final synchronized class651 method3571(int arg0, Canvas arg1, int arg2, int arg3, class449 arg4, class498 arg5) {
        field8805++;
        if (arg3 == 0) {
            return class11.method129((byte) -70, arg5, arg1, false);
        } else if (arg3 == 2) {
            return class100.method768(false, arg5, arg1);
        } else if (arg3 == 4) {
            return class11.method129((byte) -35, arg5, arg1, true);
        } else if (arg3 == 1) {
            return class405.method2331(2, arg5, arg1, arg0);
        } else if (arg3 == 5) {
            return class434.method2465(arg0, arg4, arg5, arg1, 24);
        } else {
            int var6 = 115 % ((55 - arg2) / 62);
            if (arg3 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class604.method3326(arg5, arg0, arg1, arg4, 106);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIII)V", line = 213)
    public final void method3572(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != -33) {
            this.field8808 = null;
        }
        this.method423(arg1, arg4, arg5, arg3, arg2, 1);
        field8813++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BLxa;)V", line = 232)
    public final void method3573(byte arg0, class468 arg1) {
        field8802++;
        int var3 = 85 % ((54 - arg0) / 44);
        this.method80(arg1, true);
    }

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(I)V", line = 265)
    public final void method3574(int arg0) {
        class643.field8628[this.field8804] = false;
        field8806++;
        int var2 = 88 % ((-arg0 - 56) / 61);
        this.method56();
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V", line = 278)
    public class651(class498 arg0) {
        this.field8808 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class643.field8628[var3]) {
                class643.field8628[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field8804 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/lang/String;[SB)V", line = 340)
    public static final void method3575(String[] arg0, short[] arg1, byte arg2) {
        field8807++;
        class568.method3126(arg1, arg0.length - 1, arg0, -74, 0);
        if (arg2 != -6) {
            field8817 = -118;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldn;Ldn;FLdn;)Ldn;")
    public abstract class483 method49(class483 arg0, class483 arg1, float arg2, class483 arg3);

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method422(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public abstract boolean method390();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpf;IIII)Lba;")
    public abstract class358 method443(class545 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public abstract void method107();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public abstract boolean method456();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
    public abstract void method444();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method377(int arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()V")
    public abstract void method76();

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method433(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method379(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lpv;)V")
    public abstract void method400(int arg0, class65[] arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method423(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method378(int arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lq;")
    public abstract class397 method466();

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
    public abstract boolean method404();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method387(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method106(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public abstract void method100();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lpv;")
    public abstract class65 method427(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method420(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()Z")
    public abstract boolean method452();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method87(int arg0);

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()V")
    public abstract void method38();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class139 method402(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lc;Lq;[Lot;I)V")
    public abstract void method429(class358[] arg0, class174 arg1, class397 arg2, class552[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lpga;Z)Lxa;")
    public abstract class468 method440(class500 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method439(class37 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method399(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class468 method426(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ldn;)V")
    public abstract void method432(class483 arg0);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Z")
    public abstract boolean method430();

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method414();

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method411();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method397(int arg0, class217 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method373(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method412();

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public abstract void method56();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method70(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Lc;Lq;Lot;I)V")
    public abstract void method392(class358 arg0, class174 arg1, class397 arg2, class552 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()V")
    public abstract void method29();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Ldn;")
    public abstract class483 method391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lxa;Z)V")
    public abstract void method80(class468 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method86(Rectangle[] arg0, int arg1) throws class26;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public abstract void method425(int arg0);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()Z")
    public abstract boolean method93();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method446(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method445(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method447(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method460(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
    public abstract boolean method416();

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public abstract boolean method458();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method405(class397 arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method52(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method51(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method384(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method436(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method421(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public abstract boolean method380();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lkga;[Lpga;Z)Lta;")
    public abstract class200 method389(class511 arg0, class500[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method459(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()V")
    public abstract void method30();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method376(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()I")
    public abstract int method454();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Li;")
    public abstract class37 method406(int arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public abstract boolean method396();

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public abstract void method409(int arg0);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lffa;")
    public abstract class173 method55();

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method104();

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method450(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public abstract boolean method428();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public abstract void method382(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "(I)V")
    public abstract void method457(int arg0);

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method371(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method442(float arg0);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method435();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class217 method413(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method403();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method438(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lq;")
    public abstract class397 method455();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class468 method374(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method437(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class217 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method385(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lot;I)V")
    public abstract void method418(class358[] arg0, class397 arg1, class552[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lc;)V")
    public abstract void method465(class174 arg0);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public abstract void method97() throws class26;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
    public abstract boolean method424();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()Z")
    public abstract boolean method431();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
    public abstract boolean method388();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public abstract void method33(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()Z")
    public abstract boolean method96();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method375(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method370(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lxa;")
    public abstract class468 method398(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public abstract void method407(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method464();
}
