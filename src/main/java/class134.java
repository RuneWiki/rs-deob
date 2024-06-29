import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public abstract class class134 {

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public int field1620 = -1;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "Lfk;")
    public static class393 field1615 = new class393();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field1612;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "[Z")
    public static boolean[] field1621;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II)V")
    public abstract void method633(int arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
    public abstract void method627(int arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIII)V")
    public abstract void method663(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "()V")
    public abstract void method631();

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "()V")
    public abstract void method680();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)V")
    public abstract void method679(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "()Z")
    public abstract boolean method678();

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIII)[I")
    public abstract int[] method635(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "()Z")
    public abstract boolean method641();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lgo;Z)Lgj;")
    public abstract class381 method596(class375 arg0, boolean arg1);

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "()I")
    public abstract int method629();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(F)V")
    public abstract void method644(float arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
    public abstract void method618(int arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Z)V")
    public abstract void method637(boolean arg0);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V")
    public abstract void method684(int arg0);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIII)V")
    public final void method821(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1613++;
        this.method643(arg2, arg1, arg3, arg4, 1);
        if (arg0 >= -47) {
            field1615 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III[I)V")
    public abstract void method687(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(IIII)V")
    public abstract void method622(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method640(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[[I[[IIII)Lgh;")
    public abstract class327 method655(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "()V")
    public abstract void method600();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII)Z")
    public abstract boolean method636(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([IIIII)Lgj;")
    public abstract class381 method610(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "()Z")
    public abstract boolean method599();

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(Z)V")
    public abstract void method654(boolean arg0);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(IIIIII)V")
    public final void method822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = 18 % ((arg4 - 73) / 46);
        field1624++;
        this.method593(arg3, arg2, arg0, arg1, arg5, 1);
    }

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "()Z")
    public abstract boolean method606();

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)V")
    public abstract void method604(int arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lnc;)V")
    public abstract void method628(class18 arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIBI)V")
    public final void method823(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        this.method663(arg4, arg0, arg1, arg2, 1);
        field1625++;
        if (arg3 < 125) {
            this.field1620 = 91;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([I)V")
    public abstract void method659(int[] arg0);

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(IIIIII)Lbm;")
    public abstract class59 method686(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ltr;IIII)Lbk;")
    public abstract class210 method605(class160 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public final void method824(int arg0) {
        field1623++;
        int var2 = -102 % ((3 - arg0) / 52);
        class418.field5985[this.field1620] = false;
        this.method620();
    }

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "()I")
    public abstract int method621();

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "()Z")
    public abstract boolean method647();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILul;Lrd;ILjava/awt/Canvas;I)Lae;")
    public static final synchronized class134 method825(int arg0, class343 arg1, class185 arg2, int arg3, Canvas arg4, int arg5) {
        field1616++;
        int var6 = -1;
        if (arg0 < 21) {
            method829((byte) -97);
        }
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class418.field5985[var7]) {
                var6 = var7;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class134 var9;
        if (arg5 == 0) {
            var9 = class71.method406((byte) 69, arg4, var6, arg1);
        } else if (arg5 == 1) {
            var9 = class311.method2055(arg4, arg1, arg3, var6, (byte) 53, arg2);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class418.field5985[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(II[I[I)Lhb;")
    public abstract class433 method676(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lbm;)V")
    public abstract void method688(class59 arg0);

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "()Lnc;")
    public abstract class18 method649();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lbk;Lgm;Lnc;Lkf;I)V")
    public abstract void method588(class210 arg0, class63 arg1, class18 arg2, class136 arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(IIIIII)V")
    public abstract void method653(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "()F")
    public abstract float method674();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FFF)V")
    public abstract void method591(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIILhb;II)V")
    public abstract void method666(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class433 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(IIIII)V")
    public abstract void method643(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(IIII)V")
    public abstract void method660(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "()I")
    public abstract int method648();

    @OriginalMember(owner = "client!ae", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field1618++;
        this.method824(83);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)V")
    public abstract void method619(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "()V")
    public abstract void method620();

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)I")
    public abstract int method625(int arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method685(Canvas arg0);

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "()Z")
    public abstract boolean method590();

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(IIIIII)V")
    public abstract void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIII)V")
    public final void method826(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -82) {
            field1619 = -60;
        }
        field1622++;
        this.method658(arg2, arg3, arg1, arg4, 1);
    }

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(IIIIII)V")
    public final void method827(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method653(arg1, arg0, arg4, arg2, arg5, 1);
        field1617++;
        if (arg3 > -81) {
            field1621 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lem;)V")
    public abstract void method668(class122 arg0);

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "()I")
    public abstract int method602();

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "()V")
    public abstract void method623();

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "()I")
    public abstract int method646();

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(IIII)V")
    public abstract void method652(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "(I)V")
    public abstract void method607(int arg0);

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)V")
    public abstract void method617(boolean arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILhb;II)V")
    public abstract void method597(int arg0, class433 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(III)V")
    public abstract void method690(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "()V")
    public abstract void method626();

    @OriginalMember(owner = "client!ae", name = "w", descriptor = "()Z")
    public abstract boolean method657();

    @OriginalMember(owner = "client!ae", name = "x", descriptor = "()Lnc;")
    public abstract class18 method639();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ae", name = "y", descriptor = "()Z")
    public abstract boolean method667();

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(II)I")
    public abstract int method689(int arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([Lbk;Lgm;Lnc;[Lkf;I)V")
    public abstract void method642(class210[] arg0, class63 arg1, class18 arg2, class136[] arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "z", descriptor = "()Z")
    public abstract boolean method589();

    @OriginalMember(owner = "client!ae", name = "A", descriptor = "()Z")
    public abstract boolean method615();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([Lbk;Lnc;[Lkf;I)V")
    public abstract void method682(class210[] arg0, class18 arg1, class136[] arg2, int arg3);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method671(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!ae", name = "B", descriptor = "()Z")
    public abstract boolean method650();

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "(I)V")
    public abstract void method601(int arg0);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I[Lqp;)V")
    public abstract void method677(int arg0, class397[] arg1);

    @OriginalMember(owner = "client!ae", name = "C", descriptor = "()V")
    public abstract void method595();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method673(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(IIIIII)V")
    public abstract void method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ae", name = "D", descriptor = "()F")
    public abstract float method662();

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(IIIII)V")
    public abstract void method658(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ae", name = "E", descriptor = "()Z")
    public abstract boolean method598();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIZ)Lgj;")
    public abstract class381 method614(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
    public static void method828(byte arg0) {
        field1621 = null;
        field1615 = null;
        if (arg0 != 30) {
            method828((byte) 116);
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)Lem;")
    public abstract class122 method656(int arg0);

    @OriginalMember(owner = "client!ae", name = "F", descriptor = "()Z")
    public abstract boolean method672();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lbm;Lbm;FLbm;)Lbm;")
    public abstract class59 method603(class59 arg0, class59 arg1, float arg2, class59 arg3);

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method829(byte arg0) {
        field1614++;
        if (class248.field3548 == -1) {
            return;
        }
        int var1 = class306.field4306.method17(20417);
        int var2 = class306.field4306.method18(1);
        if (arg0 > -6) {
            field1619 = -76;
        }
        if (class203.field2927 != null) {
            var1 = class203.field2927.method1823((byte) 127);
            var2 = class203.field2927.method1830(32431);
        }
        class148.method894(class248.field3548, class105.field1259, -31574, var2, class330.field4671, 0, var1, 0, 0, 0);
        if (class337.field4795 != null) {
            class223.method1493(var2, var1, -9762);
        }
    }

    @OriginalMember(owner = "client!ae", name = "G", descriptor = "()Z")
    public abstract boolean method609();

    @OriginalMember(owner = "client!ae", name = "H", descriptor = "()V")
    public abstract void method664();

    @OriginalMember(owner = "client!ae", name = "I", descriptor = "()V")
    public abstract void method624();

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(IIIIII)V")
    public final void method830(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method594(arg5, arg4, arg3, arg2, arg0, arg1);
        field1612++;
    }

    @OriginalMember(owner = "client!ae", name = "J", descriptor = "()Z")
    public abstract boolean method669();

    @OriginalMember(owner = "client!ae", name = "K", descriptor = "()I")
    public abstract int method670();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lgm;)V")
    public abstract void method630(class63 arg0);

    @OriginalMember(owner = "client!ae", name = "L", descriptor = "()V")
    public abstract void method634();

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lth;[Lgo;Z)Lsj;")
    public abstract class266 method613(class355 arg0, class375[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(FF)V")
    public abstract void method691(float arg0, float arg1);
}
