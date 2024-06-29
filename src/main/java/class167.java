import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class167 {

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lfa;")
    public class214 field2812;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field2804;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2801;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2806;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2807;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2808;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2809;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lor;")
    public static class594 field2803;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILf;)V", line = 14)
    public final void method1346(int arg0, class702 arg1) {
        field2814++;
        if (arg0 >= 95) {
            this.method158(arg1, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 40)
    public final void method1347(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2805++;
        this.method356(arg0, arg1, arg2, arg4, 1);
        if (arg3 <= 116) {
            this.method1354(126, 75, -118, 0, -57, 80);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V", line = 74)
    public final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method279(arg2, arg4, arg1, arg0, 1);
        field2802++;
        if (arg3 != 3) {
            this.method319();
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V", line = 108)
    public final void method1349(int arg0) {
        field2809++;
        class597.field8468[this.field2804] = false;
        if (arg0 == 1) {
            this.method132();
        }
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 138)
    protected void finalize() {
        this.method1349(1);
        field2810++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILjava/awt/Canvas;ILfa;Lri;I)Lr;", line = 147)
    public static final synchronized class167 method1350(int arg0, Canvas arg1, int arg2, class214 arg3, class97 arg4, int arg5) {
        field2813++;
        if (arg2 == 0) {
            return class377.method2471(0, arg1, arg3);
        } else if (arg2 == 2) {
            return class655.method3771(0, arg3, arg1);
        } else if (arg2 == 1) {
            return class134.method1163(arg1, (byte) -108, arg3, arg0);
        } else if (arg2 == 5) {
            return class272.method1922(-9653, arg4, arg1, arg0, arg3);
        } else if (arg2 == 3) {
            return class19.method357(arg4, 10080, arg1, arg0, arg3);
        } else {
            int var6 = -31 / ((45 - arg5) / 59);
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIII)V", line = 190)
    public final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method329(arg4, arg0, arg2, arg3, 1);
        int var6 = 111 % ((74 - arg1) / 37);
        field2811++;
    }

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V", line = 200)
    public static void method1352(int arg0) {
        if (arg0 != 6614) {
            field2803 = null;
        }
        field2803 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZI)V", line = 232)
    public final void method1353(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method344(arg3, arg5, arg2, arg1, arg0, 1);
        if (arg4) {
            field2800++;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 245)
    public class167(class214 arg0) {
        this.field2812 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class597.field8468[var3]) {
                class597.field8468[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2804 = var2;
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V", line = 274)
    public final void method1354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method345(arg4, arg1, arg5, arg2, arg0, 1);
        int var7 = 80 % ((arg3 - 16) / 37);
        field2801++;
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V", line = 293)
    public final void method1355(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method335(arg1, arg0, arg3, arg2, arg4, 1);
        field2807++;
        if (arg5 != 1) {
            this.method144(-0.4119071F, -0.3087606F, -1.874238F);
        }
    }

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method322();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
    public abstract boolean method266();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method297(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method330(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method334(boolean arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public abstract boolean method134();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public abstract void method182();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public abstract void method155(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method144(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()I")
    public abstract int method267();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lufa;[Lwt;Z)Lla;")
    public abstract class418 method347(class632 arg0, class284[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method261();

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method340();

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method296(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()V")
    public abstract void method143();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()Lq;")
    public abstract class393 method272();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method335(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
    public abstract void method308();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class702 method306(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()V")
    public abstract void method135();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method344(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Le;")
    public abstract class493 method290(int arg0);

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method284(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
    public abstract boolean method294();

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method332(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lcp;)V")
    public abstract void method327(int arg0, class674[] arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method286(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
    public abstract boolean method305();

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method315();

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()Lfe;")
    public abstract class530 method160();

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public abstract void method336(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method158(class702 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method300(boolean arg0);

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method342(float arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Luo;IIII)Lda;")
    public abstract class55 method287(class534 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()Z")
    public abstract boolean method319();

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method310(int arg0, class617 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method301(int arg0);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method328(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method291(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method356(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method323(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method341(int arg0);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Lq;")
    public abstract class393 method339();

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method121(int arg0);

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method136();

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()Z")
    public abstract boolean method307();

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method309(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method293(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method268(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class617 method317(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V")
    public abstract void method345(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method318(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method304(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method114(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method346(class393 arg0);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
    public abstract boolean method289();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method277(class493 arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method338();

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
    public abstract boolean method324();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
    public abstract void method170();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldd;)V")
    public abstract void method264(class654 arg0);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method262();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ltt;I)V")
    public abstract void method320(class79 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method103(Rectangle[] arg0, int arg1) throws class529;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method321(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()Z")
    public abstract boolean method288();

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method313(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Lq;")
    public abstract class393 method259();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method298(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method353();

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method271(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method343(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class37 method275(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method329(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method292(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lcp;")
    public abstract class674 method325(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method146(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
    public abstract void method132();

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method131();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class702 method350(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method299(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()V")
    public abstract void method122() throws class529;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)Ldd;")
    public abstract class654 method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method314();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
    public abstract boolean method168();

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method279(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lwt;Z)Lf;")
    public abstract class702 method265(class284 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
    public abstract void method176();

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method355();

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method281();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ltt;)V")
    public abstract void method354(class79 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class702 method282(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldd;Ldd;FLdd;)Ldd;")
    public abstract class654 method119(class654 arg0, class654 arg1, float arg2, class654 arg3);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
    public abstract boolean method326();
}
