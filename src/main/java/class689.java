import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class class689 {

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Le;")
    public class479 field9731;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
    public int field9733;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "[B")
    public static byte[] field9728;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "Ljv;")
    public static class606 field9732;

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "I")
    public static int field9736;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "I")
    public static int field9718;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public static int field9719;

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
    public static int field9720;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "I")
    public static int field9721;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "I")
    public static int field9722;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
    public static int field9723;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "I")
    public static int field9724;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field9725;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public static int field9726;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "I")
    public static int field9727;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "I")
    public static int field9729;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public static int field9735;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "Lpq;")
    public static class159 field9734;

    static {
        int var0 = 0;
        field9728 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field9728[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field9732 = new class606(7, 1);
        field9736 = 52;
        field9737 = 0;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)V", line = 28)
    public static void method3808(boolean arg0) {
        if (arg0) {
            field9736 = 104;
        }
        field9728 = null;
        field9734 = null;
        field9732 = null;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BI)V", line = 42)
    public static final void method3809(byte arg0, int arg1) {
        field9723++;
        class560 var2 = class372.field5329;
        synchronized (class372.field5329) {
            if (arg0 <= 102) {
                method3812((byte) -31, 100, null);
            }
            class372.field5329.method3129(arg1, 14583);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIII)V", line = 70)
    public final void method3810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2008(arg1, arg2, arg4, arg0, 1);
        if (arg3 != 5) {
            field9737 = 41;
        }
        field9719++;
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIIII)V", line = 85)
    public final void method3811(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field9725++;
        if (arg5 <= 18) {
            this.method2000(-105, 2, 34, -44, 125, 2, null, 32, -126);
        }
        this.method1926(arg3, arg0, arg1, arg2, arg4, 1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILhc;)Ldh;", line = 102)
    public static final class82 method3812(byte arg0, int arg1, class293 arg2) {
        field9718++;
        class82 var3;
        if (class40.field530 == null) {
            var3 = new class82();
        } else {
            var3 = class40.field530;
            class40.field530 = class40.field530.field1024;
            var3.field1024 = null;
            class672.field9529--;
        }
        if (arg0 != 27) {
            method3818(-107, 16);
        }
        var3.field1025 = arg1;
        var3.field1027 = arg2;
        return var3;
    }

    @OriginalMember(owner = "client!oa", name = "finalize", descriptor = "()V", line = 126)
    protected void finalize() {
        this.method3813(false);
        field9727++;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Z)V", line = 143)
    public final void method3813(boolean arg0) {
        field9724++;
        class449.field6146[this.field9733] = arg0;
        this.method843();
    }

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(IIIII)V", line = 187)
    public final void method3814(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1879(arg4, arg2, arg1, arg3, arg0);
        field9721++;
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIII)V", line = 200)
    public final void method3815(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= -42) {
            this.method1922();
        }
        field9730++;
        this.method1876(arg0, arg2, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(BILpq;ILjava/awt/Canvas;Le;)Loa;", line = 217)
    public static final synchronized class689 method3816(byte arg0, int arg1, class159 arg2, int arg3, Canvas arg4, class479 arg5) {
        field9722++;
        if (arg3 == 0) {
            return class690.method3824(false, arg5, -109, arg4);
        } else if (arg3 == 2) {
            return class187.method1197(arg4, arg5, 4092);
        } else if (arg3 == 4) {
            return class690.method3824(true, arg5, -109, arg4);
        } else if (arg3 == 1) {
            return class70.method418(arg1, (byte) -94, arg4, arg5);
        } else if (arg3 == 5) {
            return class308.method1847(arg1, arg4, 1678548140, arg5, arg2);
        } else if (arg3 == 3) {
            return class362.method2227(20831, arg2, arg4, arg1, arg5);
        } else {
            int var6 = -14 / ((-arg0 - 43) / 38);
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIII)V", line = 269)
    public final void method3817(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!arg0) {
            this.field9731 = null;
        }
        field9720++;
        this.method2010(arg5, arg4, arg2, arg3, arg1, 1);
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(II)V", line = 311)
    public static final void method3818(int arg0, int arg1) {
        if (class168.field2105 == 1) {
            class309.field4145 = arg0;
        } else if (class168.field2105 == 2 || class168.field2105 == 3) {
            class309.field4139 = arg0;
        }
        if (arg1 <= 73) {
            method3816((byte) -75, -31, null, 64, null, null);
        }
        field9726++;
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Le;)V", line = 341)
    public class689(class479 arg0) {
        this.field9731 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class449.field6146[var3]) {
                var2 = var3;
                class449.field6146[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field9733 = var2;
    }

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIIII)V", line = 379)
    public final void method3819(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -4) {
            this.method1962();
        }
        this.method1975(arg4, arg2, arg0, arg5, arg3, 1);
        field9729++;
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "()Z")
    public abstract boolean method1942();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIF)Lhj;")
    public abstract class329 method1940(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[I[I)Lfa;")
    public abstract class185 method1982(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "(IIII)V")
    public abstract void method1875(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "sa", descriptor = "(II)V")
    public abstract void method1885(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "()V")
    public abstract void method821();

    @OriginalMember(owner = "client!oa", name = "ya", descriptor = "(IIIII)V")
    public abstract void method1876(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "YA", descriptor = "(IFFFFF)V")
    public abstract void method1991(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "()I")
    public abstract int method1962();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
    public abstract void method1983(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lob;)V")
    public abstract void method1961(class309 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lrf;IIII)Lba;")
    public abstract class629 method1784(class238 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
    public abstract void method1794(int arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "()V")
    public abstract void method827();

    @OriginalMember(owner = "client!oa", name = "LA", descriptor = "(IIII)V")
    public abstract void method1888(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIZ)Lxa;")
    public abstract class424 method1939(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!oa", name = "SA", descriptor = "()I")
    public abstract int method791();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "()Z")
    public abstract boolean method1989();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIII)V")
    public abstract void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "()Lq;")
    public abstract class111 method1972();

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "()Z")
    public abstract boolean method1899();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIILfa;II)V")
    public abstract void method2000(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class185 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II)I")
    public abstract int method1987(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "()I")
    public abstract int method1990();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
    public abstract void method785(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1786(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
    public abstract void method1897(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "FA", descriptor = "(IIIIII)Z")
    public abstract boolean method1932(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "()Z")
    public abstract boolean method1930();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laq;Laq;FLaq;)Laq;")
    public abstract class108 method796(class108 arg0, class108 arg1, float arg2, class108 arg3);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(I)V")
    public abstract void method1797(int arg0);

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "(I)Li;")
    public abstract class173 method1918(int arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Laq;)V")
    public abstract void method1952(class108 arg0);

    @OriginalMember(owner = "client!oa", name = "v", descriptor = "()I")
    public abstract int method1950();

    @OriginalMember(owner = "client!oa", name = "KA", descriptor = "(IIII)[I")
    public abstract int[] method797(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([IIIII)Lxa;")
    public abstract class424 method1894(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lq;)V")
    public abstract void method1887(class111 arg0);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(IIIIII)Laq;")
    public abstract class108 method1954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "()V")
    public abstract void method801();

    @OriginalMember(owner = "client!oa", name = "X", descriptor = "(III)V")
    public abstract void method2001(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1792(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Li;)V")
    public abstract void method1877(class173 arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lba;Lob;Lq;Lqn;I)V")
    public abstract void method1892(class629 arg0, class309 arg1, class111 arg2, class455 arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "(I)V")
    public abstract void method1793(int arg0);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1907(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(II[[I[[IIII)Ld;")
    public abstract class176 method1787(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "(I)V")
    public abstract void method806(int arg0);

    @OriginalMember(owner = "client!oa", name = "aa", descriptor = "()I")
    public abstract int method1889();

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "()Z")
    public abstract boolean method1992();

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "(ILfa;II)V")
    public abstract void method1956(int arg0, class185 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lil;[Lme;Z)Lta;")
    public abstract class301 method2020(class598 arg0, class366[] arg1, boolean arg2);

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "()Lru;")
    public abstract class276 method794();

    @OriginalMember(owner = "client!oa", name = "ha", descriptor = "(F)V")
    public abstract void method1986(float arg0);

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "()V")
    public abstract void method843();

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "()Z")
    public abstract boolean method1976();

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(IIIIII)V")
    public abstract void method1975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "()V")
    public abstract void method805() throws class352;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Z)V")
    public abstract void method1798(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "()V")
    public abstract void method829();

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "()Z")
    public abstract boolean method1903();

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1938(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method803(Rectangle[] arg0, int arg1) throws class352;

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "()Z")
    public abstract boolean method1933();

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(Z)V")
    public abstract void method778(boolean arg0);

    @OriginalMember(owner = "client!oa", name = "IA", descriptor = "()I")
    public abstract int method1924();

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lq;[Lqn;I)V")
    public abstract void method1799(class629[] arg0, class111 arg1, class455[] arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(FFF)V")
    public abstract void method851(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!oa", name = "na", descriptor = "(III[I)V")
    public abstract void method1891(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "()Z")
    public abstract boolean method842();

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "(IIII)V")
    public abstract void method1970(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "()Z")
    public abstract boolean method811();

    @OriginalMember(owner = "client!oa", name = "w", descriptor = "()Z")
    public abstract boolean method1791();

    @OriginalMember(owner = "client!oa", name = "x", descriptor = "()Z")
    public abstract boolean method1945();

    @OriginalMember(owner = "client!oa", name = "y", descriptor = "()Z")
    public abstract boolean method1973();

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "([I)V")
    public abstract void method1910(int[] arg0);

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "()V")
    public abstract void method1953();

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "()Lq;")
    public abstract class111 method1922();

    @OriginalMember(owner = "client!oa", name = "AA", descriptor = "(IIII)V")
    public abstract void method1878(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "()V")
    public abstract void method839();

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "()Z")
    public abstract boolean method1988();

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "(IIIII)V")
    public abstract void method2008(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(II)I")
    public abstract int method2007(int arg0, int arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "([Lba;Lob;Lq;[Lqn;I)V")
    public abstract void method1796(class629[] arg0, class309 arg1, class111 arg2, class455[] arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "ca", descriptor = "(IIII)V")
    public abstract void method1908(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "(IIIII)V")
    public abstract void method1879(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIII)V")
    public abstract void method834(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "()V")
    public abstract void method1929();

    @OriginalMember(owner = "client!oa", name = "JA", descriptor = "(I)V")
    public abstract void method1905(int arg0);

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1790(Canvas arg0);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lme;Z)Lxa;")
    public abstract class424 method1951(class366 arg0, boolean arg1);

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "()V")
    public abstract void method1984();

    @OriginalMember(owner = "client!oa", name = "ka", descriptor = "(FF)V")
    public abstract void method1957(float arg0, float arg1);

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[Lhj;)V")
    public abstract void method2016(int arg0, class329[] arg1);

    @OriginalMember(owner = "client!oa", name = "ma", descriptor = "(IIIIII[BII)V")
    public abstract void method2006(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "()Z")
    public abstract boolean method1901();

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "(IIIIII)V")
    public abstract void method1926(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);
}
