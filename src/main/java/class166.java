import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class166 {

    @OriginalMember(owner = "client!r", name = "e", descriptor = "Lfa;")
    public class212 field2418;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    public int field2427;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Lvn;")
    public static class283 field2419;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Luf;")
    public static class412 field2417;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Lkl;")
    public static class70 field2421;

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V", line = 6)
    public final void method1166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method190(arg3, arg0, arg4, arg5, arg2, arg1);
        field2425++;
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 16)
    protected void finalize() {
        this.method1168(113);
        field2423++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 34)
    public static void method1167(int arg0) {
        field2417 = null;
        if (arg0 != 1) {
            method1169(-78, -42, 98, null, null, null);
        }
        field2421 = null;
        field2419 = null;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V", line = 47)
    public final void method1168(int arg0) {
        class96.field1339[this.field2427] = false;
        field2422++;
        this.method136();
        if (arg0 < 38) {
            this.method136();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIILjava/awt/Canvas;Lfa;Lsea;)Lr;", line = 60)
    public static final synchronized class166 method1169(int arg0, int arg1, int arg2, Canvas arg3, class212 arg4, class648 arg5) {
        field2429++;
        if (arg2 == 0) {
            return class260.method1596(false, arg3, arg4);
        } else if (arg2 == 2) {
            return class75.method585(arg4, arg3, (byte) -32);
        } else if (arg2 == 1) {
            return class230.method1452(arg3, (byte) 15, arg1, arg4);
        } else if (arg2 == 5) {
            return class396.method2328(arg1, true, arg3, arg4, arg5);
        } else {
            int var6 = -18 / ((arg0 - 25) / 56);
            if (arg2 != 3) {
                throw new IllegalArgumentException("UM");
            }
            return class459.method2611(arg4, arg3, 101, arg1, arg5);
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V", line = 114)
    public final void method1170(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method110(arg2, arg4, arg3, arg1, arg0, 1);
        field2430++;
        if (arg5 != -28207) {
            this.field2427 = -40;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZII)V", line = 128)
    public final void method1171(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        this.method205(arg0, arg3, arg1, arg4, 1);
        field2426++;
        if (!arg2) {
            this.method142();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 141)
    public final void method1172(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method118(arg3, arg2, arg0, arg4, 1);
        field2414++;
        if (arg1 <= 54) {
            this.method137(-26, 44, -74, -17);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILf;)V", line = 170)
    public final void method1173(int arg0, class702 arg1) {
        this.method164(arg1, true);
        field2428++;
        if (arg0 != 1) {
            field2420 = 87;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V", line = 217)
    public final void method1174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method181(arg3, arg2, arg1, arg0, arg4);
        field2415++;
    }

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(IIIIII)V", line = 233)
    public final void method1175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2424++;
        this.method113(arg2, arg0, arg3, arg4, arg1, 1);
        if (arg5 != 25821) {
            field2416 = -103;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 269)
    public class166(class212 arg0) {
        this.field2418 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class96.field1339[var3]) {
                class96.field1339[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2427 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()I")
    public abstract int method203();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)V")
    public abstract void method190(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method124();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method204(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lwn;)V")
    public abstract void method128(class674 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method114(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method103(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V")
    public abstract void method159(int arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()Z")
    public abstract boolean method116();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()V")
    public abstract void method136();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Ltw;")
    public abstract class186 method108(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class37 method195(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()Z")
    public abstract boolean method94();

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method174(int[] arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method191(int arg0);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method109();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method86(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldk;)V")
    public abstract void method163(class472 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class618 method180(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method111(class493 arg0);

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method133();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)V")
    public abstract void method194(int arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
    public abstract boolean method132();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()Z")
    public abstract boolean method120();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method148(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
    public abstract boolean method107();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method199(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class618 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method154(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method155(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method142();

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
    public abstract boolean method130();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method169();

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()V")
    public abstract void method125();

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Z")
    public abstract boolean method201();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lwn;Lwn;FLwn;)Lwn;")
    public abstract class674 method91(class674 arg0, class674 arg1, float arg2, class674 arg3);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method202(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method93(class392 arg0);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method131(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method126(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method112(int arg0, class618 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()V")
    public abstract void method196();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
    public abstract void method113(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method161(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method143();

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method97();

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()V")
    public abstract void method135();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lnba;IIII)Lda;")
    public abstract class55 method106(class270 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)Lwn;")
    public abstract class674 method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method134(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method139(int arg0);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()V")
    public abstract void method100() throws class39;

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method182(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method89();

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method92(Rectangle[] arg0, int arg1) throws class39;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method158(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class702 method156(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method99(boolean arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Ltw;)V")
    public abstract void method183(int arg0, class186[] arg1);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method123(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method184();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method147(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method164(class702 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()Z")
    public abstract boolean method87();

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method193();

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)Le;")
    public abstract class493 method185(int arg0);

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
    public abstract boolean method127();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class702 method170(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method118(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()Lq;")
    public abstract class392 method168();

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()V")
    public abstract void method98();

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method137(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvn;[Lqga;Z)Lla;")
    public abstract class417 method129(class283 arg0, class168[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lqga;Z)Lf;")
    public abstract class702 method146(class168 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method187(int arg0);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method189();

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()Lho;")
    public abstract class134 method151();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class702 method175(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()Lq;")
    public abstract class392 method144();

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()V")
    public abstract void method104();

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Z")
    public abstract boolean method178();

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()V")
    public abstract void method96();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method152(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()Lq;")
    public abstract class392 method166();

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method117(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(I)V")
    public abstract void method173(int arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method181(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ldk;I)V")
    public abstract void method167(class472 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method200(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()Z")
    public abstract boolean method88();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V")
    public abstract void method157(boolean arg0);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method197(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method105(float arg0);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method205(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()Z")
    public abstract boolean method192();
}
