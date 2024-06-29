import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ya")
public abstract class class38 {

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "Lga;")
    public class278 field502;

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "Lap;")
    public static class335 field499 = new class335("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "Lbr;")
    public static class270 field503;

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "[[Z")
    public static boolean[][] field501;

    @OriginalMember(owner = "client!ya", name = "s", descriptor = "[[[Lev;")
    public static class490[][][] field506;

    @OriginalMember(owner = "client!ya", name = "da", descriptor = "([I)V")
    public abstract void method267(int[] arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "()I")
    public abstract int method268();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIII)V")
    public abstract void method269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "X", descriptor = "(III[I)V")
    public abstract void method270(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method271(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "()V")
    public abstract void method272();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lkc;Lkc;FLkc;)Lkc;")
    public abstract class87 method273(class87 arg0, class87 arg1, float arg2, class87 arg3);

    @OriginalMember(owner = "client!ya", name = "ia", descriptor = "(II)V")
    public abstract void method274(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(B)V")
    public final void method275(byte arg0) {
        field492++;
        if (arg0 != -126) {
            field496 = -25;
        }
        class360.field4653[this.field497] = false;
        this.method309();
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lu;)V")
    public abstract void method276(class53 arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method277(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "W", descriptor = "()F")
    public abstract float method278();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I)V")
    public abstract void method279(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Z)V")
    public abstract void method280(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "()Z")
    public abstract boolean method281();

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "(F)V")
    public abstract void method282(float arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(BILpc;Ljava/awt/Canvas;ILga;)Lya;")
    public static final synchronized class38 method283(byte arg0, int arg1, class476 arg2, Canvas arg3, int arg4, class278 arg5) {
        field500++;
        int var6 = -1;
        int var7 = 0;
        if (arg0 != -19) {
            method291((byte) -23);
        }
        while (var7 < 8) {
            if (!class360.field4653[var7]) {
                var6 = var7;
                break;
            }
            var7++;
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class38 var9;
        if (arg4 == 0) {
            var9 = class451.method2693(arg5, arg0 - 8269, var6, arg3);
        } else if (arg4 == 1) {
            var9 = class409.method2430(arg5, (byte) -100, arg3, arg1, arg2, var6);
        } else if (arg4 == 2) {
            var9 = class391.method2219(arg2, (byte) 64, arg5, var6, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class360.field4653[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(Z)V")
    public abstract void method284(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(I)V")
    public abstract void method285(int arg0);

    @OriginalMember(owner = "client!ya", name = "IA", descriptor = "()I")
    public abstract int method286();

    @OriginalMember(owner = "client!ya", name = "ea", descriptor = "(Lc;)V")
    public abstract void method287(class123 arg0);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "()V")
    public abstract void method288();

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "()Z")
    public abstract boolean method289();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[I[I)Lma;")
    public abstract class10 method290(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(B)V")
    public static void method291(byte arg0) {
        field501 = null;
        field506 = null;
        if (arg0 == -115) {
            field499 = null;
            field503 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIIII)Lkc;")
    public abstract class87 method292(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "()Z")
    public abstract boolean method293();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lkc;)V")
    public abstract void method294(class87 arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIF)Lku;")
    public abstract class256 method295(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZ)Ll;")
    public abstract class16 method296(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ya", name = "h", descriptor = "()Z")
    public abstract boolean method297();

    @OriginalMember(owner = "client!ya", name = "w", descriptor = "()I")
    public abstract int method298();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([IIIII)Ll;")
    public abstract class16 method299(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lli;[Lqv;Z)Lla;")
    public abstract class316 method300(class297 arg0, class311[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(IIIII)V")
    public abstract void method301(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "i", descriptor = "()V")
    public abstract void method302();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIIII)V")
    public abstract void method303(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "j", descriptor = "()Z")
    public abstract boolean method304();

    @OriginalMember(owner = "client!ya", name = "MA", descriptor = "(I)V")
    public abstract void method305(int arg0);

    @OriginalMember(owner = "client!ya", name = "YA", descriptor = "()I")
    public abstract int method306();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II)I")
    public abstract int method307(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "O", descriptor = "(IIIIII)V")
    public abstract void method308(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "k", descriptor = "()V")
    public abstract void method309();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lfm;Lc;[Lvs;I)V")
    public abstract void method310(class474[] arg0, class517 arg1, class123 arg2, class419[] arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(I[Lku;)V")
    public abstract void method311(int arg0, class256[] arg1);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method312(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ya", name = "m", descriptor = "()V")
    public abstract void method313();

    @OriginalMember(owner = "client!ya", name = "n", descriptor = "()I")
    public abstract int method314();

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method315(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "o", descriptor = "()Z")
    public abstract boolean method316();

    @OriginalMember(owner = "client!ya", name = "AA", descriptor = "(IIII)V")
    public abstract void method317(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "()V")
    public abstract void method318();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method319(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(B)V")
    public static final void method320(byte arg0) {
        field490++;
        for (class67 var1 = (class67) class46.field563.method2097((byte) 86); var1 != null; var1 = (class67) class46.field563.method2091(-1)) {
            var1.method591();
        }
        int var2 = 55 / ((arg0 - 58) / 46);
    }

    @OriginalMember(owner = "client!ya", name = "TA", descriptor = "(IIIII)V")
    public abstract void method321(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "()Z")
    public abstract boolean method322();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIII)V")
    public final void method323(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field505++;
        this.method321(arg2, arg3, arg0, arg4, arg1);
    }

    @OriginalMember(owner = "client!ya", name = "ca", descriptor = "(ILma;II)V")
    public abstract void method324(int arg0, class10 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "p", descriptor = "(I)V")
    public abstract void method325(int arg0);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIIII)V")
    public final void method326(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field488++;
        this.method303(arg1, arg5, arg2, arg4, arg3, arg0);
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIILma;II)V")
    public abstract void method327(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class10 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "T", descriptor = "(IFFFFF)V")
    public abstract void method328(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ya", name = "l", descriptor = "()V")
    public abstract void method329();

    @OriginalMember(owner = "client!ya", name = "OA", descriptor = "(IIII)V")
    public abstract void method330(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "NA", descriptor = "(IIIII)V")
    public abstract void method331(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(I)V")
    public abstract void method332(int arg0);

    @OriginalMember(owner = "client!ya", name = "xa", descriptor = "()F")
    public abstract float method333();

    @OriginalMember(owner = "client!ya", name = "fa", descriptor = "(IIII)V")
    public abstract void method334(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method275((byte) -126);
        field495++;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "([Lt;Lc;[Lvs;I)V")
    public abstract void method335(class474[] arg0, class123 arg1, class419[] arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(I)V")
    public abstract void method336(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method337(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(FF)V")
    public abstract void method338(float arg0, float arg1);

    @OriginalMember(owner = "client!ya", name = "q", descriptor = "()Z")
    public abstract boolean method339();

    @OriginalMember(owner = "client!ya", name = "e", descriptor = "(I)V")
    public static final void method340(int arg0) {
        if (arg0 != -21936) {
            method340(66);
        }
        field494++;
        class382.field5037 = true;
    }

    @OriginalMember(owner = "client!ya", name = "F", descriptor = "(IIII)[I")
    public abstract int[] method341(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method342(Canvas arg0);

    @OriginalMember(owner = "client!ya", name = "UA", descriptor = "(III)V")
    public abstract void method343(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(II[[I[[IIII)Lta;")
    public abstract class143 method344(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lqv;Z)Ll;")
    public abstract class16 method345(class311 arg0, boolean arg1);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(Z)V")
    public abstract void method346(boolean arg0);

    @OriginalMember(owner = "client!ya", name = "f", descriptor = "(I)Lu;")
    public abstract class53 method347(int arg0);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(FFF)V")
    public abstract void method348(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ya", name = "DA", descriptor = "(IIIIII[BII)V")
    public abstract void method349(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ya", name = "c", descriptor = "(IIIII)V")
    public final void method350(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method331(arg1, arg0, arg2, arg3, 1);
        if (arg4 >= -99) {
            this.method286();
        }
        field504++;
    }

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lfm;)V")
    public abstract void method351(class517 arg0);

    @OriginalMember(owner = "client!ya", name = "r", descriptor = "()V")
    public abstract void method352();

    @OriginalMember(owner = "client!ya", name = "JA", descriptor = "(IIIIII)Z")
    public abstract boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ya", name = "s", descriptor = "()Z")
    public abstract boolean method354();

    @OriginalMember(owner = "client!ya", name = "H", descriptor = "(IIII)V")
    public abstract void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "t", descriptor = "()Z")
    public abstract boolean method356();

    @OriginalMember(owner = "client!ya", name = "GA", descriptor = "(IIII)V")
    public abstract void method357(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIZI)V")
    public final void method358(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field493++;
        if (arg4) {
            this.method269(arg2, arg3, arg5, arg1, arg0, 1);
        }
    }

    @OriginalMember(owner = "client!ya", name = "g", descriptor = "(I)V")
    public abstract void method359(int arg0);

    @OriginalMember(owner = "client!ya", name = "u", descriptor = "()Z")
    public abstract boolean method360();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lmb;IIII)Lt;")
    public abstract class474 method361(class173 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "v", descriptor = "()Z")
    public abstract boolean method362();

    @OriginalMember(owner = "client!ya", name = "x", descriptor = "()Z")
    public abstract boolean method363();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIIIBI)V")
    public final void method364(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method308(arg1, arg3, arg0, arg2, arg5, 1);
        field498++;
        if (arg4 != -48) {
            this.method328(-26, 0.27338022F, 0.37746385F, 1.0981563F, 2.079407F, -0.65275556F);
        }
    }

    @OriginalMember(owner = "client!ya", name = "y", descriptor = "()V")
    public abstract void method365();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(Lt;Lfm;Lc;Lvs;I)V")
    public abstract void method366(class474 arg0, class517 arg1, class123 arg2, class419 arg3, int arg4);

    @OriginalMember(owner = "client!ya", name = "ZA", descriptor = "()I")
    public abstract int method367();

    @OriginalMember(owner = "client!ya", name = "z", descriptor = "()Z")
    public abstract boolean method368();

    @OriginalMember(owner = "client!ya", name = "<init>", descriptor = "(ILga;)V")
    public class38(int arg0, class278 arg1) {
        this.field497 = arg0;
        this.field502 = arg1;
    }

    @OriginalMember(owner = "client!ya", name = "A", descriptor = "()Lc;")
    public abstract class123 method369();

    @OriginalMember(owner = "client!ya", name = "b", descriptor = "(II)I")
    public abstract int method370(int arg0, int arg1);

    @OriginalMember(owner = "client!ya", name = "B", descriptor = "()Lc;")
    public abstract class123 method371();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IZ)V")
    public static final void method372(int arg0, boolean arg1) {
        class282.method1669(class28.field396, false);
        field489++;
        class261.field3287++;
        for (class175 var2 = (class175) class397.field5684.method2021(84); var2 != null; var2 = (class175) class397.field5684.method2017(-94)) {
            if (!var2.method2166(0)) {
                var2 = (class175) class397.field5684.method2021(75);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2273 == 0) {
                class290.method1706(var2, 113, true, arg1);
            }
        }
        if (class466.field6723 != null) {
            class136.method935(class466.field6723, -127);
            class466.field6723 = null;
        }
        if (arg0 >= -26) {
            field506 = null;
        }
    }

    @OriginalMember(owner = "client!ya", name = "d", descriptor = "(IIIII)V")
    public final void method373(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field491++;
        this.method301(arg1, arg4, arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!ya", name = "C", descriptor = "()Z")
    public abstract boolean method374();

    @OriginalMember(owner = "client!ya", name = "a", descriptor = "(IIII)V")
    public abstract void method375(int arg0, int arg1, int arg2, int arg3);
}
