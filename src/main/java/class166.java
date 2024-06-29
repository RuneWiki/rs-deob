import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class166 {

    @OriginalMember(owner = "client!r", name = "k", descriptor = "Lfa;")
    public class209 field2384;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public int field2374;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "[I")
    public static int[] field2387 = new int[2];

    @OriginalMember(owner = "client!r", name = "i", descriptor = "Ldg;")
    public static class376 field2382 = new class376(78, 8);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "I")
    public static int field2377;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field2379;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIII)V", line = 3)
    public final void method1147(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == -28854) {
            this.method202(arg3, arg1, arg4, arg2, 1);
            field2376++;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIZ)V", line = 77)
    public final void method1148(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            this.method181(-106, -16, 113, -29, 38, 0.98135984F);
        }
        this.method118(arg0, arg1, arg3, arg2, 1);
        field2380++;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIIII)V", line = 88)
    public final void method1149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method219(arg5, arg3, arg0, arg4, arg2, 1);
        field2379++;
        if (arg1 != -4) {
            this.field2374 = -30;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(IIIIII)V", line = 100)
    public final void method1150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method114(arg2, arg1, arg0, arg5, arg4, 1);
        if (arg3 != -1) {
            this.field2374 = -71;
        }
        field2383++;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIBI)V", line = 118)
    public final void method1151(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 <= -106) {
            this.method149(arg0, arg3, arg5, arg1, arg2, 1);
            field2377++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ILf;)V", line = 134)
    public final void method1152(int arg0, class702 arg1) {
        field2386++;
        this.method188(arg1, true);
        if (arg0 >= -20) {
            this.method181(-77, 36, 113, 29, 77, -1.0011714F);
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 147)
    public static void method1153(int arg0) {
        field2387 = null;
        field2382 = null;
        if (arg0 != 1) {
            field2387 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Z)V", line = 158)
    public final void method1154(boolean arg0) {
        class20.field239[this.field2374] = arg0;
        field2378++;
        this.method158();
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(IIIII)V", line = 183)
    public final void method1155(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 8) {
            this.method109();
        }
        field2381++;
        this.method103(arg2, arg3, arg0, arg4, 1);
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lfa;)V", line = 214)
    public class166(class209 arg0) {
        this.field2384 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class20.field239[var3]) {
                class20.field239[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field2374 = var2;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfa;Ljava/awt/Canvas;Lpu;BII)Lr;", line = 244)
    public static final synchronized class166 method1156(class209 arg0, Canvas arg1, class522 arg2, byte arg3, int arg4, int arg5) {
        field2385++;
        if (arg5 == 0) {
            return class85.method750(arg1, arg0, (byte) 76);
        } else if (arg5 == 2) {
            return class554.method3143(16, arg1, arg0);
        } else {
            if (arg3 != 20) {
                method1153(-25);
            }
            if (arg5 == 1) {
                return class78.method718((byte) -60, arg1, arg4, arg0);
            } else if (arg5 == 5) {
                return class98.method802(arg3 - 12, arg0, arg1, arg4, arg2);
            } else if (arg5 == 3) {
                return class610.method3415(6908, arg2, arg0, arg1, arg4);
            } else {
                throw new IllegalArgumentException("UM");
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V", line = 284)
    protected void finalize() {
        this.method1154(false);
        field2375++;
    }

    @OriginalMember(owner = "client!r", name = "la", descriptor = "(IIII)V")
    public abstract void method184(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljba;Ljba;FLjba;)Ljba;")
    public abstract class363 method190(class363 arg0, class363 arg1, float arg2, class363 arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lfg;Z)Lf;")
    public abstract class702 method138(class113 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()Z")
    public abstract boolean method106();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIII)V")
    public abstract void method118(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "()V")
    public abstract void method174();

    @OriginalMember(owner = "client!r", name = "L", descriptor = "()V")
    public abstract void method121();

    @OriginalMember(owner = "client!r", name = "J", descriptor = "(IIIIII)V")
    public abstract void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "pa", descriptor = "(III)V")
    public abstract void method122(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!r", name = "oa", descriptor = "([I)V")
    public abstract void method204(int[] arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Luq;[Lfg;Z)Lla;")
    public abstract class416 method128(class146 arg0, class113[] arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "()Z")
    public abstract boolean method161();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method111(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[[I[[IIII)Li;")
    public abstract class37 method215(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V")
    public abstract void method179(boolean arg0);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "()V")
    public abstract void method210();

    @OriginalMember(owner = "client!r", name = "IA", descriptor = "(IIIIII[BII)V")
    public abstract void method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "ZA", descriptor = "(Z)V")
    public abstract void method178(boolean arg0);

    @OriginalMember(owner = "client!r", name = "ra", descriptor = "(F)V")
    public abstract void method132(float arg0);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "()Z")
    public abstract boolean method104();

    @OriginalMember(owner = "client!r", name = "g", descriptor = "()Z")
    public abstract boolean method186();

    @OriginalMember(owner = "client!r", name = "DA", descriptor = "()I")
    public abstract int method192();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "()V")
    public abstract void method213();

    @OriginalMember(owner = "client!r", name = "i", descriptor = "()Z")
    public abstract boolean method216();

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method182(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Llm;IIII)Lda;")
    public abstract class55 method171(class461 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIII)Ljba;")
    public abstract class363 method117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "j", descriptor = "()Z")
    public abstract boolean method129();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Ljba;)V")
    public abstract void method116(class363 arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method198(Rectangle[] arg0, int arg1) throws class621;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II)I")
    public abstract int method172(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Le;)V")
    public abstract void method196(class492 arg0);

    @OriginalMember(owner = "client!r", name = "k", descriptor = "()Z")
    public abstract boolean method127();

    @OriginalMember(owner = "client!r", name = "h", descriptor = "(IIII)[I")
    public abstract int[] method193(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "GA", descriptor = "(II)V")
    public abstract void method142(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "()I")
    public abstract int method147();

    @OriginalMember(owner = "client!r", name = "v", descriptor = "()[I")
    public abstract int[] method145();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIZ)Lf;")
    public abstract class702 method136(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "(IIIII)V")
    public abstract void method103(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lq;)V")
    public abstract void method155(class391 arg0);

    @OriginalMember(owner = "client!r", name = "U", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!r", name = "l", descriptor = "()Lq;")
    public abstract class391 method153();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIILua;II)V")
    public abstract void method144(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class617 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([I)V")
    public abstract void method208(int[] arg0);

    @OriginalMember(owner = "client!r", name = "O", descriptor = "(IIIIII)Z")
    public abstract boolean method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "()V")
    public abstract void method158();

    @OriginalMember(owner = "client!r", name = "n", descriptor = "()Lq;")
    public abstract class391 method100();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public abstract void method151(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIF)Lrc;")
    public abstract class498 method181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lf;Z)V")
    public abstract void method188(class702 arg0, boolean arg1);

    @OriginalMember(owner = "client!r", name = "o", descriptor = "()Z")
    public abstract boolean method148();

    @OriginalMember(owner = "client!r", name = "ja", descriptor = "(I)V")
    public abstract void method139(int arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!r", name = "p", descriptor = "()V")
    public abstract void method150();

    @OriginalMember(owner = "client!r", name = "BA", descriptor = "()I")
    public abstract int method110();

    @OriginalMember(owner = "client!r", name = "q", descriptor = "()Z")
    public abstract boolean method167();

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method143(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvi;)V")
    public abstract void method156(class499 arg0);

    @OriginalMember(owner = "client!r", name = "XA", descriptor = "(IIIII)V")
    public abstract void method202(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(FFF)V")
    public abstract void method205(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public abstract void method125(boolean arg0);

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)V")
    public abstract void method135(int arg0);

    @OriginalMember(owner = "client!r", name = "T", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!r", name = "CA", descriptor = "(IIII)V")
    public abstract void method133(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "r", descriptor = "()V")
    public abstract void method203() throws class621;

    @OriginalMember(owner = "client!r", name = "YA", descriptor = "(IIII)V")
    public abstract void method195(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[I[I)Lua;")
    public abstract class617 method164(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method124(Canvas arg0);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lvi;I)V")
    public abstract void method165(class499 arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIZ)Lf;")
    public abstract class702 method175(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!r", name = "s", descriptor = "()Z")
    public abstract boolean method166();

    @OriginalMember(owner = "client!r", name = "VA", descriptor = "(IFFFFF)V")
    public abstract void method185(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!r", name = "t", descriptor = "()Z")
    public abstract boolean method109();

    @OriginalMember(owner = "client!r", name = "va", descriptor = "(I)V")
    public abstract void method154(int arg0);

    @OriginalMember(owner = "client!r", name = "MA", descriptor = "(III[I)V")
    public abstract void method214(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I[Lrc;)V")
    public abstract void method134(int arg0, class498[] arg1);

    @OriginalMember(owner = "client!r", name = "da", descriptor = "(IIII)V")
    public abstract void method168(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "u", descriptor = "()Z")
    public abstract boolean method162();

    @OriginalMember(owner = "client!r", name = "ya", descriptor = "()V")
    public abstract void method194();

    @OriginalMember(owner = "client!r", name = "w", descriptor = "()I")
    public abstract int method173();

    @OriginalMember(owner = "client!r", name = "x", descriptor = "()Z")
    public abstract boolean method123();

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
    public abstract void method176(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(IIIIII)V")
    public abstract void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(IIIIII)V")
    public abstract void method149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!r", name = "JA", descriptor = "()V")
    public abstract void method152();

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V")
    public abstract void method163(int arg0);

    @OriginalMember(owner = "client!r", name = "y", descriptor = "()Lis;")
    public abstract class463 method140();

    @OriginalMember(owner = "client!r", name = "FA", descriptor = "(ILua;II)V")
    public abstract void method169(int arg0, class617 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "z", descriptor = "()Lq;")
    public abstract class391 method130();

    @OriginalMember(owner = "client!r", name = "e", descriptor = "(I)Le;")
    public abstract class492 method120(int arg0);

    @OriginalMember(owner = "client!r", name = "V", descriptor = "(IIII)V")
    public abstract void method107(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!r", name = "f", descriptor = "(I)V")
    public abstract void method101(int arg0);

    @OriginalMember(owner = "client!r", name = "g", descriptor = "(I)V")
    public abstract void method113(int arg0);

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(II)I")
    public abstract int method160(int arg0, int arg1);

    @OriginalMember(owner = "client!r", name = "A", descriptor = "()Z")
    public abstract boolean method108();

    @OriginalMember(owner = "client!r", name = "B", descriptor = "()V")
    public abstract void method183();

    @OriginalMember(owner = "client!r", name = "AA", descriptor = "(III[I)V")
    public abstract void method197(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([IIIII)Lf;")
    public abstract class702 method209(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!r", name = "C", descriptor = "()V")
    public abstract void method157();
}
