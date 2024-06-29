import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class650 {

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "Le;")
    public class498 field8781;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public int field8780;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "Lhm;")
    public static class208 field8783 = new class208(4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field8776;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field8777;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field8778;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field8779;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field8782;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field8785;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public static int field8786;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field8787;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field8788;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "I")
    public static int field8789;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
    public static int field8790;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public static int field8791;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lxa;Z)V")
    public abstract void method369(class468 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method403(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method410();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method444(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method405(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public final void method3623(byte arg0) {
        field8785++;
        class68.field898[this.field8780] = false;
        if (arg0 <= -4) {
            this.method392();
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZII)B")
    public static final byte method3624(boolean arg0, int arg1, int arg2) {
        field8791++;
        if (!arg0) {
            field8783 = null;
        }
        if (arg2 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method460();

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method461();

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method429();

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method420(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public abstract boolean method471();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lbj;")
    public abstract class227 method436(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static void method3625(byte arg0) {
        if (arg0 != 39) {
            method3629(null, 81, null, 26, null, 111);
        }
        field8783 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method490(class396 arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()Z")
    public abstract boolean method422();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method391(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()Z")
    public abstract boolean method488();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lnj;IIII)Lba;")
    public abstract class359 method408(class229 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
    public abstract void method374();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lip;)V")
    public abstract void method458(class662 arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public abstract boolean method477();

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Z")
    public abstract boolean method432();

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method418(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
    public abstract boolean method481();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()V")
    public abstract void method392();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class219 method400(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method451(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()V")
    public abstract void method401();

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public abstract boolean method434();

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()V")
    public abstract void method325();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method417(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V")
    public final void method3626(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != 0) {
            this.method448(-67, 113, 94, 45, 115, -43, -12);
        }
        this.method437(arg3, arg4, arg1, arg2, 1);
        field8787++;
    }

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()Z")
    public abstract boolean method361();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()I")
    public abstract int method430();

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public abstract void method318() throws class202;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()Z")
    public abstract boolean method465();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method476(int arg0);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method453(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method445(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method406(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Lq;")
    public abstract class396 method470();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(III)Z")
    public static final boolean method3627(int arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            field8777++;
            return (arg0 & 0x10) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method484(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method456(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lxa;B)V")
    public final void method3628(class468 arg0, byte arg1) {
        field8778++;
        int var3 = -117 % ((-arg1 - 78) / 33);
        this.method369(arg0, true);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lub;[Liba;Z)Lta;")
    public abstract class201 method414(class20 arg0, class495[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method426(int arg0, class219 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Le;ILpfa;ILjava/awt/Canvas;I)Loa;")
    public static final synchronized class650 method3629(class498 arg0, int arg1, class275 arg2, int arg3, Canvas arg4, int arg5) {
        if (arg1 != 14200) {
            method3624(false, -107, -96);
        }
        field8789++;
        if (arg3 == 0) {
            return class440.method2415(false, arg0, arg4, (byte) 2);
        } else if (arg3 == 2) {
            return class580.method3206(arg4, (byte) -21, arg0);
        } else if (arg3 == 4) {
            return class440.method2415(true, arg0, arg4, (byte) 2);
        } else if (arg3 == 1) {
            return class81.method620(arg5, arg0, 1, arg4);
        } else if (arg3 == 5) {
            return class17.method98((byte) 116, arg2, arg0, arg4, arg5);
        } else if (arg3 == 3) {
            return class199.method1159(arg5, arg1 + 6163, arg4, arg2, arg0);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Lig;Lq;Lpo;I)V")
    public abstract void method427(class359 arg0, class228 arg1, class396 arg2, class524 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class140 method412(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()V")
    public abstract void method336();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BIIIII)V")
    public final void method3630(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method475(arg3, arg2, arg1, arg5, arg4, 1);
        field8788++;
        int var7 = 3 % ((arg0 + 28) / 52);
    }

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method475(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static final void method3631(byte arg0) {
        if (arg0 < 57) {
            field8783 = null;
        }
        field8782++;
        for (int var1 = 0; var1 < class141.field1697; var1++) {
            class175 var2 = class266.field3358[var1];
            if (var2.field2059 == 3) {
                if (var2.field2057 == null) {
                    var2.field2064 = Integer.MIN_VALUE;
                } else {
                    class314.field3941.method1489(var2.field2057);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V")
    public abstract void method482(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIZ)Lxa;")
    public abstract class468 method441(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class468 method428(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method379(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method345(Rectangle[] arg0, int arg1) throws class202;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZI)V")
    public final void method3632(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field8779++;
        this.method497(arg0, arg1, arg2, arg5, arg3, 1);
        if (arg4) {
            this.field8781 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIZI)V")
    public final void method3633(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field8790++;
        if (!arg3) {
            this.field8781 = null;
        }
        this.method453(arg4, arg1, arg0, arg2, 1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lbj;)V")
    public abstract void method473(int arg0, class227[] arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lip;Lip;FLip;)Lip;")
    public abstract class662 method351(class662 arg0, class662 arg1, float arg2, class662 arg3);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Ltaa;")
    public abstract class379 method317();

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method443(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method450(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lig;Lq;[Lpo;I)V")
    public abstract void method480(class359[] arg0, class228 arg1, class396 arg2, class524[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method442(int arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public abstract void method494(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class468 method433(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V")
    public class650(class498 arg0) {
        this.field8781 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class68.field898[var3]) {
                class68.field898[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field8780 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public abstract boolean method419();

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method409();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method447(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class219 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public abstract void method388(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method469(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V")
    public abstract void method455(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()V")
    public abstract void method327();

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method423();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method437(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Lq;")
    public abstract class396 method431();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)Lip;")
    public abstract class662 method483(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method493(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method315(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lpo;I)V")
    public abstract void method491(class359[] arg0, class396 arg1, class524[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public abstract boolean method466();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method478(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Z")
    public abstract boolean method393();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lig;)V")
    public abstract void method485(class228 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Liba;Z)Lxa;")
    public abstract class468 method402(class495 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public abstract void method312();

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method489(class37 arg0);

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method396(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method380();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()V")
    public abstract void method322();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method448(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)V")
    public abstract void method497(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()Z")
    public abstract boolean method424();

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
    public abstract boolean method492();

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method449(float arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method354(int arg0);

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method438(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Li;")
    public abstract class37 method468(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V")
    public final void method3634(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 45365) {
            field8792++;
            this.method454(arg2, arg3, arg1, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V")
    protected void finalize() {
        field8786++;
        this.method3623((byte) -60);
    }

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method411(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "()Z")
    public abstract boolean method404();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method439(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(III)I")
    public static final int method3635(int arg0, int arg1, int arg2) {
        field8784++;
        if (arg0 != 13871) {
            method3624(true, 32, 73);
        }
        int var3 = class268.method1590(arg1 + 45365, true, 4, arg2 + 91923) - (128 - (class268.method1590(arg1 + 10294, true, 2, arg2 + 37821) - 128 >> 1)) + (class268.method1590(arg1, true, 1, arg2) + -128 >> 2);
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIB)V")
    public final void method3636(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.method435(arg2, arg3, arg4, arg0, arg1, 1);
        if (arg5 <= -90) {
            field8776++;
        }
    }

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public abstract void method413(int arg0);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method454(int arg0, int arg1, int arg2, int arg3, int arg4);
}
