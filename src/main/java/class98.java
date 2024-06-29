import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class98 {

    @OriginalMember(owner = "client!r", name = "c", descriptor = "Lfa;")
    public class615 field1491;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public int field1500;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "Lvg;")
    public static class622 field1498 = new class622(80, 8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field1489;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1494;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1495;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1497;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)V", line = 25)
    public final void method623(byte arg0) {
        class486.field6918[this.field1500] = false;
        field1499++;
        int var2 = 125 / ((-arg0 - 31) / 37);
        this.method697();
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)Z", line = 44)
    public static final boolean method632(int arg0, int arg1) {
        field1503++;
        if (arg1 == 1) {
            return arg0 == 0 || arg0 == 1 || arg0 == 2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)V", line = 70)
    public final void method644(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1493++;
        this.method635(arg3, arg2, arg1, arg0, 1);
        if (!arg4) {
            this.method648(null);
        }
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V", line = 105)
    public final void method664(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method609(arg0, arg3, arg4, arg1, arg5, arg2);
        field1490++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 137)
    public final void method678(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method621(arg2, arg0, arg1, arg4, arg3);
        field1496++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JJ)J", line = 169)
    public static long method693(long arg0, long arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIB)V", line = 177)
    public final void method695(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field1489++;
        if (arg4 <= 85) {
            method698((byte) -90);
        }
        this.method691(arg2, arg1, arg3, arg0, 1);
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(B)V", line = 192)
    public static void method698(byte arg0) {
        if (arg0 == -116) {
            field1498 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lmv;Lfa;Ljava/awt/Canvas;III)Lr;", line = 204)
    public static final synchronized class98 method701(class295 arg0, class615 arg1, Canvas arg2, int arg3, int arg4, int arg5) {
        field1502++;
        if (arg3 == 0) {
            return class705.method3946(arg2, arg1, true);
        } else if (arg3 == 2) {
            return class422.method2553(6402, arg2, arg1);
        } else if (arg3 == 1) {
            return class505.method2877(arg2, 16, arg5, arg1);
        } else {
            if (arg4 != 1) {
                field1497 = -90;
            }
            if (arg3 == 5) {
                return class258.method1544(arg5, arg1, arg2, 100, arg0);
            } else if (arg3 == 3) {
                return class312.method1947(arg2, arg0, arg5, -9533, arg1);
            } else {
                throw new IllegalArgumentException("UM");
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V", line = 248)
    public final void method710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1501++;
        this.method700(arg4, arg0, arg3, arg5, arg2, 1);
        if (arg1 != 22339) {
            this.field1500 = 121;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 258)
    public class98(class615 arg0) {
        this.field1491 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class486.field6918[var3]) {
                var2 = var3;
                class486.field6918[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field1500 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;B)V", line = 288)
    public final void method712(class256 arg0, byte arg1) {
        field1494++;
        if (arg1 == -65) {
            this.method673(arg0, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)V", line = 301)
    public final void method714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method633(arg5, arg4, arg3, arg2, arg0, 1);
        if (arg1 != 12844) {
            this.method712(null, (byte) -65);
        }
        field1492++;
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 316)
    protected void finalize() {
        field1495++;
        this.method623((byte) -99);
    }

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method607(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method608();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method609(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method610(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lrs;)V")
    public abstract void method611(class649 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method612(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method613(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)Lrs;")
    public abstract class649 method614(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method615();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method616(class151 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class591 method617(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
    public abstract boolean method618();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method619(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method620(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method621(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Le;")
    public abstract class698 method622(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public abstract boolean method624();

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method625();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method626(int arg0);

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method627();

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method628(int[] arg0);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method629(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
    public abstract boolean method630();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class256 method631(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V")
    public abstract void method633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method634(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method635(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method636(boolean arg0);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method637(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method638();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public abstract void method639(int arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method640(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method641(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    public abstract void method642();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class591 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method645();

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method646(int arg0);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method647();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method648(class698 arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
    public abstract boolean method649();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
    public abstract boolean method650();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lak;IIII)Lda;")
    public abstract class395 method651(class677 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method652(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()V")
    public abstract void method653();

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
    public abstract boolean method654();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()V")
    public abstract void method655() throws class232;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()V")
    public abstract void method656();

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method657(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()Lq;")
    public abstract class151 method658();

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method659(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lut;Z)Lf;")
    public abstract class256 method660(class616 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method661(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()V")
    public abstract void method662();

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
    public abstract boolean method663();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method665(int arg0);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method666();

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method667(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method668();

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()I")
    public abstract int method669();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method670(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
    public abstract boolean method671();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method672(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method673(class256 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Z")
    public abstract boolean method674();

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method675(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
    public abstract void method676();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class682 method677(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Luo;)V")
    public abstract void method679(class620 arg0);

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method680(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()V")
    public abstract void method681();

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()Lq;")
    public abstract class151 method682();

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Lpg;")
    public abstract class658 method683();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfo;[Lut;Z)Lla;")
    public abstract class393 method684(class606 arg0, class616[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()Z")
    public abstract boolean method685();

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
    public abstract boolean method686();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Ltg;")
    public abstract class334 method687(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIZ)Lf;")
    public abstract class256 method688(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method689(Rectangle[] arg0, int arg1) throws class232;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public abstract void method690(int arg0);

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method691(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method692(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()Z")
    public abstract boolean method694();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Ltg;)V")
    public abstract void method696(int arg0, class334[] arg1);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()V")
    public abstract void method697();

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method699();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method700(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method702(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class256 method704(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method705();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(II)I")
    public abstract int method706(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lrs;Lrs;FLrs;)Lrs;")
    public abstract class649 method707(class649 arg0, class649 arg1, float arg2, class649 arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Luo;I)V")
    public abstract void method708(class620 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method709(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method711(float arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method713(boolean arg0);

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method715(int arg0, class591 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method716(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Lq;")
    public abstract class151 method717();

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method718(int arg0, int arg1, int arg2);
}
