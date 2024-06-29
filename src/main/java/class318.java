import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public abstract class class318 {

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public int field4787;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "Lvl;")
    public class11 field4784;

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "I")
    public static int field4790 = 4;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "Ldg;")
    public static class273 field4791;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIII)V", line = 5)
    public final void method1889(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -4) {
            this.method1957(null, -42);
        }
        field4778++;
        this.method1963(arg4, arg0, arg3, arg1, 1);
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(Z)V", line = 34)
    public static void method1906(boolean arg0) {
        if (arg0) {
            method1950(false);
        }
        field4791 = null;
    }

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIIIII)V", line = 64)
    public final void method1920(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1918(arg2, arg5, arg0, arg3, arg1, 1);
        if (arg4 == 22437) {
            field4783++;
        }
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIIII)V", line = 90)
    public final void method1935(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1991(arg5, arg0, arg1, arg3, arg4, arg2);
        field4781++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BIIII)V", line = 100)
    public final void method1938(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1980(arg1, arg4, arg2, arg3, 1);
        field4782++;
        if (arg0 != -77) {
            this.method1966();
        }
    }

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(IIIIII)V", line = 118)
    public final void method1943(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4792++;
        this.method1971(arg0, arg2, arg5, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIII)V", line = 129)
    public final void method1946(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = -41 % ((arg3 - 32) / 52);
        this.method1959(arg0, arg1, arg4, arg2, 1);
        field4785++;
    }

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(Z)V", line = 145)
    public static final void method1950(boolean arg0) {
        class348.method2122((byte) 127);
        field4788++;
        class207.field3250 = null;
        class295.field4487 = null;
        class329.field4937 = null;
        if (!arg0) {
            method1950(true);
        }
        class152.field2427 = null;
        class212.field3291 = null;
    }

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(II)I", line = 195)
    public static int method1973(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(I)V", line = 202)
    public final void method1974(int arg0) {
        class75.field1344[this.field4787] = false;
        field4779++;
        this.method1990();
        if (arg0 != -25261) {
            field4790 = 43;
        }
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(ILvl;)V", line = 223)
    public class318(int arg0, class11 arg1) {
        this.field4787 = arg0;
        this.field4784 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILvl;Lhf;Ljava/awt/Canvas;)Lqq;", line = 247)
    public static final synchronized class318 method1989(int arg0, int arg1, int arg2, class11 arg3, class260 arg4, Canvas arg5) {
        field4786++;
        int var6 = -1;
        for (int var7 = 0; var7 < 8; var7++) {
            if (!class75.field1344[var7]) {
                var6 = var7;
                break;
            }
        }
        if (arg0 != 1) {
            method1989(57, 45, 64, null, null, null);
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var8 = null;
        class318 var9;
        if (arg2 == 0) {
            var9 = class442.method2608(-7758, var6, arg5, arg3);
        } else if (arg2 == 1) {
            var9 = class165.method1043(arg1, (byte) -112, arg4, var6, arg5, arg3);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class75.field1344[var6] = true;
        return var9;
    }

    @OriginalMember(owner = "client!qq", name = "finalize", descriptor = "()V", line = 299)
    protected final void finalize() {
        this.method1974(-25261);
        field4780++;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lpm;[Lfd;Z)Lwn;")
    public abstract class488 method1888(class396 arg0, class351[] arg1, boolean arg2);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "()I")
    public abstract int method1890();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
    public abstract void method1891(int arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)V")
    public abstract void method1892(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "()Z")
    public abstract boolean method1893();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIF)Lki;")
    public abstract class480 method1894(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Z)V")
    public abstract void method1895(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIILbe;II)V")
    public abstract void method1896(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class28 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "()I")
    public abstract int method1897();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIII)Llf;")
    public abstract class151 method1898(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method1899(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lii;)V")
    public abstract void method1900(class372 arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1901(Canvas arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public abstract void method1902(int arg0);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "()Z")
    public abstract boolean method1903();

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1904(Canvas arg0);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "()Z")
    public abstract boolean method1905();

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)V")
    public abstract void method1907(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lwr;IIII)Lcd;")
    public abstract class198 method1908(class303 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "()V")
    public abstract void method1909();

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(I)V")
    public abstract void method1910(int arg0);

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "()Z")
    public abstract boolean method1911();

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(I)V")
    public abstract void method1912(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([Lcd;Lii;Lql;[Lni;I)V")
    public abstract void method1913(class198[] arg0, class372 arg1, class496 arg2, class346[] arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Llf;)V")
    public abstract void method1914(class151 arg0);

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "()V")
    public abstract void method1915();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[Lki;)V")
    public abstract void method1916(int arg0, class480[] arg1);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(Z)V")
    public abstract void method1917(boolean arg0);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIIIII)V")
    public abstract void method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[[I[[IIII)Lfo;")
    public abstract class343 method1919(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lql;)V")
    public abstract void method1921(class496 arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1922(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(IIIIII)Z")
    public abstract boolean method1923(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([IIIII)Lig;")
    public abstract class154 method1924(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "()Lql;")
    public abstract class496 method1925();

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "()Z")
    public abstract boolean method1926();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[I[I)Lbe;")
    public abstract class28 method1927(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(I)Lpt;")
    public abstract class353 method1928(int arg0);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "()I")
    public abstract int method1929();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIZ)Lig;")
    public abstract class154 method1930(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(IIII)V")
    public abstract void method1931(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III[I)V")
    public abstract void method1932(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FFF)V")
    public abstract void method1933(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "()Z")
    public abstract boolean method1934();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([I)V")
    public abstract void method1936(int[] arg0);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1937(Canvas arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method1939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIII)V")
    public abstract void method1940(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method1941(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!qq", name = "m", descriptor = "()Z")
    public abstract boolean method1942();

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(II)I")
    public abstract int method1944(int arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "n", descriptor = "()V")
    public abstract void method1945();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)V")
    public abstract void method1947(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(IIII)V")
    public abstract void method1948(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "o", descriptor = "()Z")
    public abstract boolean method1949();

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(II)I")
    public abstract int method1951(int arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lfd;Z)Lig;")
    public abstract class154 method1952(class351 arg0, boolean arg1);

    @OriginalMember(owner = "client!qq", name = "p", descriptor = "()Z")
    public abstract boolean method1953();

    @OriginalMember(owner = "client!qq", name = "q", descriptor = "()V")
    public abstract void method1954();

    @OriginalMember(owner = "client!qq", name = "r", descriptor = "()I")
    public abstract int method1955();

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(I)V")
    public abstract void method1956(int arg0);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1957(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!qq", name = "s", descriptor = "()V")
    public abstract void method1958();

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "(IIIII)V")
    public abstract void method1959(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "t", descriptor = "()I")
    public abstract int method1960();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lpt;)V")
    public abstract void method1961(class353 arg0);

    @OriginalMember(owner = "client!qq", name = "u", descriptor = "()Z")
    public abstract boolean method1962();

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(IIIII)V")
    public abstract void method1963(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "v", descriptor = "()V")
    public abstract void method1964();

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(I)V")
    public abstract void method1965(int arg0);

    @OriginalMember(owner = "client!qq", name = "w", descriptor = "()V")
    public abstract void method1966();

    @OriginalMember(owner = "client!qq", name = "x", descriptor = "()Z")
    public abstract boolean method1967();

    @OriginalMember(owner = "client!qq", name = "y", descriptor = "()F")
    public abstract float method1968();

    @OriginalMember(owner = "client!qq", name = "z", descriptor = "()Z")
    public abstract boolean method1969();

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method1970(Canvas arg0);

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(IIIIII)V")
    public abstract void method1971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1972(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!qq", name = "A", descriptor = "()Z")
    public abstract boolean method1975();

    @OriginalMember(owner = "client!qq", name = "B", descriptor = "()Lql;")
    public abstract class496 method1976();

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIII)V")
    public abstract void method1977(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "([Lcd;Lql;[Lni;I)V")
    public abstract void method1978(class198[] arg0, class496 arg1, class346[] arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "(I)V")
    public abstract void method1979(int arg0);

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "(IIIII)V")
    public abstract void method1980(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "C", descriptor = "()Z")
    public abstract boolean method1981();

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "(IIII)V")
    public abstract void method1982(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lcd;Lii;Lql;Lni;I)V")
    public abstract void method1983(class198 arg0, class372 arg1, class496 arg2, class346 arg3, int arg4);

    @OriginalMember(owner = "client!qq", name = "D", descriptor = "()F")
    public abstract float method1984();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Llf;Llf;FLlf;)Llf;")
    public abstract class151 method1985(class151 arg0, class151 arg1, float arg2, class151 arg3);

    @OriginalMember(owner = "client!qq", name = "E", descriptor = "()I")
    public abstract int method1986();

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "(IIII)V")
    public abstract void method1987(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "F", descriptor = "()Z")
    public abstract boolean method1988();

    @OriginalMember(owner = "client!qq", name = "G", descriptor = "()V")
    public abstract void method1990();

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "(IIIIII)V")
    public abstract void method1991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!qq", name = "H", descriptor = "()V")
    public abstract void method1992();

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(FF)V")
    public abstract void method1993(float arg0, float arg1);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILbe;II)V")
    public abstract void method1994(int arg0, class28 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(F)V")
    public abstract void method1995(float arg0);
}
