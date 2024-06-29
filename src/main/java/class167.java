import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public abstract class class167 {

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Ln;")
    public class472 field2443;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public int field2441;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Liu;")
    public static class517 field2434 = new class517(92, 12);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Liu;")
    public static class517 field2444 = new class517(46, -1);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Liu;")
    public static class517 field2445 = new class517(82, 7);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Liu;")
    public static class517 field2447 = new class517(77, 12);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lae;")
    public static class40 field2446;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lae;")
    public static class40 field2448;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIBI)V", line = 7)
    public final void method1155(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2437++;
        if (arg4 != -8) {
            this.method1156(true, -92, -77, -24, -75, 67);
        }
        this.method628(arg2, arg3, arg1, arg5, arg0, 1);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIIIII)V", line = 54)
    public final void method1156(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2435++;
        this.method638(arg4, arg1, arg5, arg2, arg3, 1);
        if (!arg0) {
            this.method405(91, 108, null, null, 49, -112, 35);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIB)V", line = 89)
    public final void method1157(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field2430++;
        this.method652(arg3, arg0, arg1, arg2, 1);
        if (arg4 != -37) {
            field2442 = 109;
        }
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(I)V", line = 106)
    public static void method1158(int arg0) {
        field2445 = null;
        field2434 = null;
        field2446 = null;
        if (arg0 != -8670) {
            method1162(-99, -66, null, 42, null, null);
        }
        field2447 = null;
        field2444 = null;
        field2448 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIBI)V", line = 134)
    public final void method1159(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method653(arg3, arg2, arg5, arg1, arg0, 1);
        int var7 = 126 / ((arg4 - 22) / 60);
        field2440++;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIII)V", line = 147)
    public final void method1160(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2431++;
        this.method589(arg2, arg1, arg0, arg4, 1);
        if (arg3 != -3) {
            field2448 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V", line = 161)
    public static final void method1161(int arg0) {
        field2439++;
        class480.field6825 = 0;
        class432.field6356.method425(arg0 - 13450);
        class432.field6356.method414(class541.field7534, (byte) 59);
        class480.field6825++;
        if (arg0 != 13361) {
            method1161(-90);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILn;ILjava/awt/Canvas;Lgp;)Lqa;", line = 204)
    public static final synchronized class167 method1162(int arg0, int arg1, class472 arg2, int arg3, Canvas arg4, class561 arg5) {
        field2432++;
        if (arg3 == 0) {
            return class497.method2835(false, arg2, (byte) 121, arg4);
        } else if (arg3 == 2) {
            return class582.method3337((byte) 118, arg4, arg2);
        } else if (arg3 == 4) {
            return class497.method2835(true, arg2, (byte) 106, arg4);
        } else if (arg3 == 1) {
            return class52.method442(arg1, 0, arg4, arg2);
        } else if (arg3 == 5) {
            return class314.method1943(arg1, -22960, arg5, arg2, arg4);
        } else {
            if (arg0 != 0) {
                field2448 = null;
            }
            if (arg3 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class375.method2281(arg5, true, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "(I)V", line = 257)
    public final void method1163(int arg0) {
        field2436++;
        class130.field2117[this.field2441] = false;
        if (arg0 == 6510) {
            this.method95();
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIII)V", line = 273)
    public final void method1164(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method573(arg1, arg3, arg0, arg4, arg2);
        field2433++;
    }

    @OriginalMember(owner = "client!qa", name = "finalize", descriptor = "()V", line = 288)
    protected void finalize() {
        this.method1163(6510);
        field2438++;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Ln;)V", line = 297)
    public class167(class472 arg0) {
        this.field2443 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class130.field2117[var3]) {
                var2 = var3;
                class130.field2117[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2441 = var2;
    }

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "(F)V")
    public abstract void method569(float arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lu;)V")
    public abstract void method593(class424 arg0);

    @OriginalMember(owner = "client!qa", name = "ta", descriptor = "(II)V")
    public abstract void method557(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "(I)V")
    public abstract void method642(int arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIF)Luca;")
    public abstract class637 method601(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "JA", descriptor = "(IIII)V")
    public abstract void method572(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()Lm;")
    public abstract class105 method637();

    @OriginalMember(owner = "client!qa", name = "UA", descriptor = "(IIIII)V")
    public abstract void method589(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)V")
    public abstract void method521(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(I)V")
    public abstract void method403(int arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIII)V")
    public abstract void method519(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lfba;Z)Lha;")
    public abstract class116 method548(class518 arg0, boolean arg1);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "()V")
    public abstract void method142();

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "()Z")
    public abstract boolean method650();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)V")
    public abstract void method398(int arg0);

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "(I)V")
    public abstract void method121(int arg0);

    @OriginalMember(owner = "client!qa", name = "xa", descriptor = "()V")
    public abstract void method585();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lsh;)V")
    public abstract void method563(class616 arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIZ)Lha;")
    public abstract class116 method580(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "()V")
    public abstract void method124();

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "()Z")
    public abstract boolean method559();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[I[I)Lpa;")
    public abstract class593 method582(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "()Z")
    public abstract boolean method618();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lsh;Lm;[Lpaa;I)V")
    public abstract void method397(class519[] arg0, class616 arg1, class105 arg2, class315[] arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method638(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(I)Lu;")
    public abstract class424 method614(int arg0);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "()Lm;")
    public abstract class105 method623();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lld;IIII)Lr;")
    public abstract class519 method400(class560 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method605(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method394(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "()Ldp;")
    public abstract class425 method85();

    @OriginalMember(owner = "client!qa", name = "ba", descriptor = "()I")
    public abstract int method604();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II)I")
    public abstract int method560(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIII)V")
    public abstract void method99(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lr;Lm;[Lpaa;I)V")
    public abstract void method406(class519[] arg0, class105 arg1, class315[] arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "(III)V")
    public abstract void method562(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qa", name = "za", descriptor = "(IIIIII[BII)V")
    public abstract void method661(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "()Z")
    public abstract boolean method660();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([IIIII)Lha;")
    public abstract class116 method528(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V")
    public abstract void method621(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "()Z")
    public abstract boolean method645();

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)I")
    public abstract int method649(int arg0, int arg1);

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "()V")
    public abstract void method567();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method624(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)V")
    public abstract void method131(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "()Z")
    public abstract boolean method629();

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "()V")
    public abstract void method94() throws class354;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "()Z")
    public abstract boolean method157();

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "(IIIIII)Z")
    public abstract boolean method558(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "()Z")
    public abstract boolean method141();

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "()I")
    public abstract int method612();

    @OriginalMember(owner = "client!qa", name = "YA", descriptor = "()I")
    public abstract int method120();

    @OriginalMember(owner = "client!qa", name = "CA", descriptor = "()I")
    public abstract int method531();

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "()V")
    public abstract void method83();

    @OriginalMember(owner = "client!qa", name = "IA", descriptor = "(III[I)V")
    public abstract void method568(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(IIIIII)V")
    public abstract void method628(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "(IIII)V")
    public abstract void method658(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "()V")
    public abstract void method95();

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "(IIII)V")
    public abstract void method615(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method402(Canvas arg0);

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "()V")
    public abstract void method153();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(FFF)V")
    public abstract void method139(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "()Z")
    public abstract boolean method529();

    @OriginalMember(owner = "client!qa", name = "la", descriptor = "(FF)V")
    public abstract void method517(float arg0, float arg1);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method393(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(IIIIII)Lkk;")
    public abstract class149 method515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "([I)V")
    public abstract void method640(int[] arg0);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(IIIII)V")
    public abstract void method573(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(IIIIII)V")
    public abstract void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "()Z")
    public abstract boolean method594();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "()I")
    public abstract int method537();

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "()I")
    public abstract int method565();

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "()Z")
    public abstract boolean method635();

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "()Z")
    public abstract boolean method595();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class542 method405(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkk;Lkk;FLkk;)Lkk;")
    public abstract class149 method104(class149 arg0, class149 arg1, float arg2, class149 arg3);

    @OriginalMember(owner = "client!qa", name = "ra", descriptor = "()F")
    public abstract float method613();

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "()Z")
    public abstract boolean method524();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lrl;[Lfba;Z)Lra;")
    public abstract class259 method626(class633 arg0, class518[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method158(Rectangle[] arg0, int arg1) throws class354;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "(IIII)V")
    public abstract void method581(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIIIIILpa;II)V")
    public abstract void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class593 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "()V")
    public abstract void method657();

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V")
    public abstract void method525(boolean arg0);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I[Luca;)V")
    public abstract void method586(int arg0, class637[] arg1);

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public abstract void method399(int arg0);

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "(IFFFFF)V")
    public abstract void method600(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "(IIII)[I")
    public abstract int[] method103(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "()Z")
    public abstract boolean method407();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "()Z")
    public abstract boolean method555();

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "()V")
    public abstract void method122();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lr;Lsh;Lm;Lpaa;I)V")
    public abstract void method553(class519 arg0, class616 arg1, class105 arg2, class315 arg3, int arg4);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "(ILpa;II)V")
    public abstract void method592(int arg0, class593 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkk;)V")
    public abstract void method556(class149 arg0);

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "()F")
    public abstract float method542();

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lm;)V")
    public abstract void method587(class105 arg0);

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "(IIIII)V")
    public abstract void method652(int arg0, int arg1, int arg2, int arg3, int arg4);
}
