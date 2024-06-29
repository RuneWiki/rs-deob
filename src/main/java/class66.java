import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class66 {

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "Ld;")
    public class162 field970;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public int field952;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lju;")
    public static class137 field956 = new class137(1, 4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field955;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field957;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field958;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 3)
    public final void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 != 25692) {
            this.field970 = null;
        }
        this.method537(arg2, arg5, arg3, arg1, arg4, 1);
        field954++;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 26)
    public final void method483(int arg0) throws class789 {
        this.method561(0, 0);
        if (arg0 != -2) {
            this.method582(-33, 86, 126, 55, 4, 113, null, -1, 27);
        }
        field963++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[IIIZ)Lnf;", line = 50)
    public final class604 method495(int arg0, int arg1, int[] arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            this.method507(false);
        }
        field957++;
        return this.method587(arg2, arg0, arg1, arg4, arg3, true);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILd;Lgj;IILjava/awt/Canvas;I)Lha;", line = 71)
    public static final synchronized class66 method504(int arg0, int arg1, class162 arg2, class662 arg3, int arg4, int arg5, Canvas arg6, int arg7) {
        field965++;
        if (arg4 == 0) {
            return class281.method1814((byte) -94, arg6, arg2, arg5, arg1);
        } else if (arg4 == 2) {
            return method544(arg5, arg2, arg1, arg6, 17371);
        } else if (arg4 == 1) {
            return class666.method3765(arg2, arg7, arg6, -1);
        } else if (arg4 == 5) {
            return class156.method1212(arg3, true, arg7, arg6, arg2);
        } else if (arg4 == 3) {
            return class131.method1104(arg2, arg6, 26360, arg3, arg7);
        } else {
            if (arg0 != 6343) {
                method513(-73, -33, -59, 66, false);
            }
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V", line = 115)
    public final void method510(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field968++;
        this.method508(arg3, arg2, arg1, arg0, arg5, 1);
        if (arg4 <= 38) {
            this.method529(-128, -107, 106, 33, 33, -7, 55);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)V", line = 133)
    public static final void method513(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg1 <= 120) {
            return;
        }
        class185.method1374(103);
        field964++;
        class603.field8443 = 0L;
        int var5 = class586.method3369(2);
        if (arg2 == 3 || var5 == 3) {
            arg4 = true;
        }
        if (!class95.field1472.method584()) {
            arg4 = true;
        }
        class69.method625(arg0, arg3, arg2, var5, arg4, (byte) -126);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 177)
    public final void method525(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method567(arg1, arg4, arg0, arg2, 1);
        if (arg3 < 13) {
            this.field970 = null;
        }
        field961++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIII)V", line = 188)
    public final void method526(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field955++;
        this.method551(arg0, arg3, arg1, arg2, arg4);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIII)V", line = 198)
    public final void method528(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = 5 / ((arg0 + 56) / 60);
        this.method591(arg4, arg3, arg1, arg2, 1);
        field951++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILnf;)V", line = 212)
    public final void method532(int arg0, class604 arg1) {
        field960++;
        this.method527(this.method546(arg1, this.method540(arg1.method220(), arg1.method214())));
        if (arg0 != 1) {
            this.method588();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILd;ILjava/awt/Canvas;I)Lha;", line = 239)
    private static final class66 method544(int arg0, class162 arg1, int arg2, Canvas arg3, int arg4) {
        field959++;
        if (arg4 != 17371) {
            field956 = null;
        }
        return new class723(arg3, arg1, arg2, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V", line = 266)
    public static void method555(boolean arg0) {
        if (!arg0) {
            method504(83, 77, null, null, -4, 67, null, -18);
        }
        field956 = null;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(IIIIII)V", line = 295)
    public final void method568(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method519(arg1, arg5, arg2, arg4, arg0, 1);
        field969++;
        if (arg3 > -57) {
            this.field970 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 311)
    public final void method571(Rectangle[] arg0, int arg1, int arg2) throws class789 {
        this.method560(arg0, arg1, 0, 0);
        if (arg2 < 57) {
            field967 = 21;
        }
        field953++;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I", line = 327)
    public static final int method576(int arg0, int arg1) {
        if (arg0 != 1) {
            field956 = null;
        }
        field958++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 356)
    protected void finalize() {
        this.method594(0);
        field966++;
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)V", line = 369)
    public final void method594(int arg0) {
        class333.field4504[this.field952] = false;
        field962++;
        if (arg0 != 0) {
            this.method476(null, null, false);
        }
        this.method543();
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 382)
    public class66(class162 arg0) {
        this.field970 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class333.field4504[var3]) {
                class333.field4504[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field952 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method473(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmf;I)V")
    public abstract void method474(class442 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method475(class437 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkc;[Lgs;Z)Lda;")
    public abstract class67 method476(class145 arg0, class49[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method477(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmf;)V")
    public abstract void method478(class442 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method479();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method480(float arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method481(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public abstract int method482(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method484(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method485();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method486(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method487(int arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method488(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method489();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method490(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method491(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method492(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()I")
    public abstract int method493();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method494();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method496();

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method497();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgs;Z)Lnf;")
    public abstract class604 method498(class49 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method500(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method501(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method502(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lsk;)V")
    public abstract void method503(class650 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ldc;IIII)Lka;")
    public abstract class499 method505(class5 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    public abstract void method506();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method507(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method508(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method509(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method511(int arg0, class514 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method512(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method514(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method515(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method516(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class514 method517(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method518(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method520(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method521(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method522(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIZ)Lnf;")
    public abstract class604 method523(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method524();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lel;)V")
    public abstract void method527(class574 arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method530(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lbq;")
    public abstract class307 method531(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Lsk;")
    public abstract class650 method533();

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method534();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Len;Len;FLen;)Len;")
    public abstract class339 method535(class339 arg0, class339 arg1, float arg2, class339 arg3);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method536(int arg0);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method537(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method538();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Lsk;")
    public abstract class650 method539();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Loq;")
    public abstract class380 method540(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()V")
    public abstract void method541();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lbq;)V")
    public abstract void method542(int arg0, class307[] arg1);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
    public abstract void method543();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method545(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgh;Loq;)Lel;")
    public abstract class574 method546(class575 arg0, class380 arg1);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method547(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
    public abstract void method548();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lnf;")
    public abstract class604 method549(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method550(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method551(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method552();

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method553();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class514 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method556(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method557(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method558();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method559(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method560(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class789;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
    public abstract void method561(int arg0, int arg1) throws class789;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)Lgh;")
    public abstract class575 method562(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method563();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Len;")
    public abstract class339 method564(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lsk;")
    public abstract class650 method565();

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method566();

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method567(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method569(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method570();

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method572();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method573(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method574(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method575();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method577();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method578();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)Lza;")
    public abstract class437 method579(int arg0);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method580(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method581();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method582(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method583(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method584();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method585();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Laja;")
    public abstract class100 method586();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lnf;")
    public abstract class604 method587(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method588();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class296 method589(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method590(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method591(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method592();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(II)I")
    public abstract int method593(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method595();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Len;)V")
    public abstract void method596(class339 arg0);
}
