import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public abstract class class364 {

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field4999;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "Lci;")
    public class287 field4988;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field4993 = 0;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "[I")
    public static int[] field4994 = new int[16384];

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "[I")
    public static int[] field4992 = new int[16384];

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "Lmc;")
    public static class78 field5001;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "Lh;")
    public static class434 field5003;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field4987;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field5002;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4994[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field4992[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field5001 = new class78(13, 16);
        field5003 = new class434(20, 6);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIB)V", line = 14)
    public final void method2215(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        this.method2052(arg1, arg2, arg3, arg0, 1);
        if (arg4 > -78) {
            this.method1968();
        }
        field5000++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IILml;Lci;Ljava/awt/Canvas;I)Lwm;", line = 43)
    public static final synchronized class364 method2216(int arg0, int arg1, class241 arg2, class287 arg3, Canvas arg4, int arg5) {
        field5002++;
        int var6 = -1;
        int var7 = -76 % ((arg0 - 10) / 57);
        for (int var8 = 0; var8 < 8; var8++) {
            if (!class326.field4353[var8]) {
                var6 = var8;
                break;
            }
        }
        if (var6 == -1) {
            throw new IllegalStateException("NFTI");
        }
        Object var9 = null;
        class364 var10;
        if (arg5 == 0) {
            var10 = class469.method2754(arg3, var6, (byte) -41, arg4);
        } else if (arg5 == 1) {
            var10 = class130.method797(arg4, arg2, 30226, arg3, arg1, var6);
        } else {
            throw new IllegalArgumentException("UM");
        }
        class326.field4353[var6] = true;
        return var10;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 85)
    public final void method2217(int arg0) {
        if (arg0 != 16384) {
            this.method1982((int[]) null, -93, 6, -51, -2);
        }
        field4989++;
        class326.field4353[this.field4999] = false;
        this.method2111();
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIII)V", line = 110)
    public static final void method2218(int arg0, int arg1, int arg2, int arg3) {
        field4987++;
        class27 var4 = class177.field2408[arg1][arg3];
        class445.method2616(var4 == null ? class274.field3630 : var4, arg0, true);
        if (arg2 != 27496) {
            method2218(119, -86, 14, 123);
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIIIII)V", line = 125)
    public final void method2219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4996++;
        this.method1973(arg2, arg1, arg5, arg3, arg4, 1);
        if (arg0 != -16385) {
            this.field4999 = 58;
        }
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(IIIIII)V", line = 152)
    public final void method2220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 8040) {
            this.method1965();
        }
        field4995++;
        this.method2031(arg2, arg0, arg1, arg5, arg4, 1);
    }

    @OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V", line = 178)
    protected final void finalize() {
        field4990++;
        this.method2217(16384);
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(IIIII)V", line = 190)
    public final void method2221(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4991++;
        this.method2059(arg0, arg4, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(IIIIII)V", line = 207)
    public final void method2222(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2003(arg1, arg2, arg5, arg0, arg3, 1);
        field4998++;
        if (arg4 < 92) {
            this.method2085();
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V", line = 254)
    public static void method2223(byte arg0) {
        field5001 = null;
        field4992 = null;
        field5003 = null;
        field4994 = null;
        if (arg0 < 101) {
            method2218(106, 48, 45, -92);
        }
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(IIIII)V", line = 271)
    public final void method2224(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 16384) {
            field4997++;
            this.method2073(arg0, arg3, arg2, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(ILci;)V", line = 293)
    public class364(int arg0, class287 arg1) {
        this.field4999 = arg0;
        this.field4988 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "()F")
    public abstract float method2009();

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "()V")
    public abstract void method1988();

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "()V")
    public abstract void method2019();

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "()Z")
    public abstract boolean method1991();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II)I")
    public abstract int method1979(int arg0, int arg1);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[[I[[IIII)Ltf;")
    public abstract class177 method2089(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "()Lon;")
    public abstract class203 method1960();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII)V")
    public abstract void method2031(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILkf;II)V")
    public abstract void method2029(int arg0, class152 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "()Z")
    public abstract boolean method2079();

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "()Z")
    public abstract boolean method1992();

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "()I")
    public abstract int method1998();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIILkf;II)V")
    public abstract void method1985(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class152 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIII)V")
    public abstract void method2059(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIII)V")
    public abstract void method1969(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIZ)Ljd;")
    public abstract class139 method2026(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "()V")
    public abstract void method2005();

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "()I")
    public abstract int method2046();

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIII)V")
    public abstract void method1975(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(FF)V")
    public abstract void method1997(float arg0, float arg1);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lgn;Ltp;Lon;Lau;I)V")
    public abstract void method2051(class456 arg0, class342 arg1, class203 arg2, class478 arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(II[I[I)Lkf;")
    public abstract class152 method2017(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lrc;Lrc;FLrc;)Lrc;")
    public abstract class346 method2098(class346 arg0, class346 arg1, float arg2, class346 arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method2110(Canvas arg0);

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "()Z")
    public abstract boolean method2043();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([Lgn;Ltp;Lon;[Lau;I)V")
    public abstract void method2081(class456[] arg0, class342 arg1, class203 arg2, class478[] arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "()V")
    public abstract void method1964();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method2075(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ltp;)V")
    public abstract void method1993(class342 arg0);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I[Lof;)V")
    public abstract void method1978(int arg0, class404[] arg1);

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIIIII)V")
    public abstract void method1973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(F)V")
    public abstract void method2087(float arg0);

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "()V")
    public abstract void method2111();

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "()Z")
    public abstract boolean method2085();

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(IIIIII)Z")
    public abstract boolean method2099(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method1952(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "()I")
    public abstract int method2047();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method2010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lkg;)V")
    public abstract void method2100(class163 arg0);

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "()Z")
    public abstract boolean method1968();

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public abstract void method2002(int arg0);

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "()Z")
    public abstract boolean method2007();

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(IIII)[I")
    public abstract int[] method2104(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([I)V")
    public abstract void method2074(int[] arg0);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
    public abstract void method2069(boolean arg0);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1970(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(I)V")
    public abstract void method2062(int arg0);

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(Z)V")
    public abstract void method2023(boolean arg0);

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(IIIII)V")
    public abstract void method2073(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lvi;[Ldk;Z)Lur;")
    public abstract class345 method2084(class347 arg0, class325[] arg1, boolean arg2);

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "()Z")
    public abstract boolean method1995();

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "()Z")
    public abstract boolean method1951();

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "()F")
    public abstract float method2107();

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(IIII)V")
    public abstract void method2091(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(II)I")
    public abstract int method2103(int arg0, int arg1);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lpr;IIII)Lgn;")
    public abstract class456 method2094(class284 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(I)V")
    public abstract void method2015(int arg0);

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(IIII)V")
    public abstract void method2066(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(I)V")
    public abstract void method2064(int arg0);

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "()Z")
    public abstract boolean method2080();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lrc;)V")
    public abstract void method2112(class346 arg0);

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "()Z")
    public abstract boolean method1999();

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(II)V")
    public abstract void method2022(int arg0, int arg1);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(FFF)V")
    public abstract void method2113(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(Z)V")
    public abstract void method2093(boolean arg0);

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "()I")
    public abstract int method1950();

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "(I)Lkg;")
    public abstract class163 method1954(int arg0);

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(IIIIII)Lrc;")
    public abstract class346 method2039(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "()Z")
    public abstract boolean method2011();

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(II)V")
    public abstract void method2108(int arg0, int arg1);

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(IIII)V")
    public abstract void method1989(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([Lgn;Lon;[Lau;I)V")
    public abstract void method2102(class456[] arg0, class203 arg1, class478[] arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "()V")
    public abstract void method1965();

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "()V")
    public abstract void method1966();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([IIIII)Ljd;")
    public abstract class139 method1982(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "D", descriptor = "()I")
    public abstract int method1977();

    @OriginalMember(owner = "client!wm", name = "E", descriptor = "()V")
    public abstract void method2083();

    @OriginalMember(owner = "client!wm", name = "F", descriptor = "()Z")
    public abstract boolean method1996();

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(IIIII)V")
    public abstract void method2052(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Ldk;Z)Ljd;")
    public abstract class139 method2050(class325 arg0, boolean arg1);

    @OriginalMember(owner = "client!wm", name = "G", descriptor = "()Z")
    public abstract boolean method2109();

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "(I)V")
    public abstract void method2041(int arg0);

    @OriginalMember(owner = "client!wm", name = "H", descriptor = "()Z")
    public abstract boolean method2097();

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "(IIII)V")
    public abstract void method1981(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Lon;)V")
    public abstract void method1956(class203 arg0);

    @OriginalMember(owner = "client!wm", name = "I", descriptor = "()Lon;")
    public abstract class203 method2012();

    @OriginalMember(owner = "client!wm", name = "J", descriptor = "()V")
    public abstract void method2006();

    @OriginalMember(owner = "client!wm", name = "K", descriptor = "()I")
    public abstract int method2086();

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method2048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "(IIIIII)V")
    public abstract void method2003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III[I)V")
    public abstract void method1986(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!wm", name = "L", descriptor = "()V")
    public abstract void method1987();
}
