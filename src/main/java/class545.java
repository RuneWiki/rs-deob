import java.awt.Canvas;
import java.awt.Rectangle;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class545 {

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "Ld;")
    public class268 field7694;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public int field7688;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field7697 = new String[100];

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "Lju;")
    public static class102 field7689 = new class102(14, 7);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lqk;")
    public static class148 field7704 = new class148(72, 0);

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field7706 = -1;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field7684;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field7685;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field7696;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field7698;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field7703;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field7705;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "Lqk;")
    public static class148 field7701;

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method572(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method2186(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method639(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method2086();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method2110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method574(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lkb;")
    public abstract class757 method2225(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public final void method3253(int arg0) {
        class407.field5651[this.field7688] = false;
        field7690++;
        if (arg0 != -6102) {
            this.method2085(null, null, false);
        }
        this.method587();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;IB)V")
    public final void method3254(Rectangle[] arg0, int arg1, byte arg2) throws class425 {
        this.method622(arg0, arg1, 0, 0);
        if (arg2 <= 79) {
            field7704 = null;
        }
        field7691++;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method2079();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method2203();

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method2123(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class339 method2213(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method2098(int arg0);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method2151(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIBI)V")
    public final void method3255(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method2194(arg2, arg5, arg1, arg0, arg3, 1);
        int var7 = 72 / ((arg4 - 51) / 56);
        field7696++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public abstract void method2168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method614(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkda;IIII)Lka;")
    public abstract class283 method2222(class64 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcd;)V")
    public abstract void method2136(class22 arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method2189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method2188(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Luha;)V")
    public abstract void method2068(class723 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method2201(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method622(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class425;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method2174();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method2140();

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method2132(float arg0);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method2156(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()Z")
    public abstract boolean method608();

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method2194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIB)V")
    public final void method3256(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var6 = -60 / ((-arg4 - 10) / 46);
        field7695++;
        this.method2091(arg3, arg2, arg0, arg1, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)[B")
    public static final byte[] method3257(boolean arg0, int arg1) {
        field7703++;
        class612 var2 = (class612) class177.field2398.method2761((byte) 93, (long) arg1);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class99.method676(var7, var4, -80);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class612(var3);
            class177.field2398.method2764((long) arg1, var2, -4900);
        }
        return arg0 ? null : var2.field8704;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method2073(int arg0);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method2097(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method2224(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Z")
    public abstract boolean method569();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lcw;")
    public abstract class21 method2113(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIII)Lcw;")
    public final class21 method3258(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7687++;
        return arg1 == 1 ? this.method2070(arg0, arg2, arg4, arg3, arg5, true) : null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)Lcd;")
    public abstract class22 method2134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIBI)V")
    public final void method3259(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        this.method2168(arg2, arg0, arg3, arg1, arg5, 1);
        field7700++;
        if (arg4 != -91) {
            this.method2106(-122, null);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loq;[Ltba;Z)Lda;")
    public abstract class400 method2085(class742 arg0, class320[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method2230();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method570(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method2148(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method2214();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhs;Lmp;)Lcha;")
    public abstract class279 method584(class358 arg0, class315 arg1);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method2173(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method2090(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method2160();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lev;)V")
    public abstract void method2122(class347 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method2072(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method2100();

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method590(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)I")
    public abstract int method2105(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method2200();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method2170();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method3260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method2191(arg1, arg4, arg3, arg2, 1);
        field7686++;
        int var6 = -111 % ((23 - arg0) / 50);
    }

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method2161(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
    public abstract void method587();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method2093(int arg0, class571 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Luha;")
    public abstract class723 method2087();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method593();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method2143(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lhs;")
    public abstract class358 method600(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method2195(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method2127(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class571 method2092(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method2147(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lcw;")
    public abstract class21 method2119(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcw;I)V")
    public final void method3261(class21 arg0, int arg1) {
        if (arg1 != 1) {
            this.method3255(117, 63, 122, -91, (byte) -26, -45);
        }
        field7702++;
        this.method595(this.method584(arg0, this.method628(arg0.method115(), arg0.method117())));
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcd;Lcd;FLcd;)Lcd;")
    public abstract class22 method631(class22 arg0, class22 arg1, float arg2, class22 arg3);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public final void method3262(int arg0) throws class425 {
        field7693++;
        this.method632(arg0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method589();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lev;I)V")
    public abstract void method2112(class347 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method2211(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Luha;")
    public abstract class723 method2135();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltba;Z)Lcw;")
    public abstract class21 method2126(class320 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method2178(int arg0);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method2069(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method2071(int arg0);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method2091(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lmp;")
    public abstract class315 method628(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method2137(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "(I)Lza;")
    public abstract class256 method2226(int arg0);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()V")
    public abstract void method556();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method2177(class256 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method559(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBIII)V")
    public final void method3263(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        this.method2166(arg0, arg4, arg5, arg3, arg1, 1);
        field7698++;
        int var7 = 40 / (-arg2 / 39);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
    public final void method3264(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field7685++;
        if (arg1 < 30) {
            field7697 = null;
        }
        this.method2173(arg3, arg0, arg4, arg2, 1);
    }

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
    public abstract void method617();

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method2157();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method2099();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()I")
    public abstract int method2124();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method2131(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method2081(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method2162();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method632(int arg0, int arg1) throws class425;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method2166(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method2221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class571 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method2163(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILjava/awt/Canvas;Ld;IIILwu;)Lha;")
    public static final synchronized class545 method3265(int arg0, int arg1, Canvas arg2, class268 arg3, int arg4, int arg5, int arg6, class557 arg7) {
        field7692++;
        if (arg0 == 0) {
            return class668.method3824(arg6, arg3, (byte) 126, arg2, arg1);
        } else if (arg0 == 2) {
            return class179.method1173((byte) -116, arg2, arg1, arg3, arg6);
        } else if (arg5 != -30084) {
            return null;
        } else if (arg0 == 1) {
            return class724.method4057(0, arg2, arg4, arg3);
        } else if (arg0 == 5) {
            return class362.method2038(arg2, arg7, (byte) 68, arg4, arg3);
        } else if (arg0 == 3) {
            return class726.method4061(-126, arg3, arg4, arg2, arg7);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method2223();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()V")
    public abstract void method635();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Luha;")
    public abstract class723 method2141();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method2095(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method563(int arg0);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method2180();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method2115(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lkb;)V")
    public abstract void method2106(int arg0, class757[] arg1);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method2101(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method2149(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method2179();

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method2191(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method2104(int arg0);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method610();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "(I)V")
    public static void method3266(int arg0) {
        field7704 = null;
        field7689 = null;
        if (arg0 != 19792) {
            field7697 = null;
        }
        field7701 = null;
        field7697 = null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class545(class268 arg0) {
        this.field7694 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class407.field5651[var3]) {
                class407.field5651[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7688 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Lgba;")
    public abstract class702 method568();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)I")
    public static final int method3267(int arg0, int arg1, int arg2) {
        if (arg1 != 8) {
            method3267(-97, 26, 125);
        }
        field7699++;
        int var3 = class375.method2267(arg0 - 1, (byte) -72, arg2 - 1) + class375.method2267(arg0 + 1, (byte) -128, arg2 - 1) + class375.method2267(arg0 + -1, (byte) -36, arg2 + 1) + class375.method2267(arg0 - -1, (byte) -47, arg2 - -1);
        int var4 = class375.method2267(arg0 - 1, (byte) -101, arg2) + (class375.method2267(arg0 + 1, (byte) -25, arg2) + class375.method2267(arg0, (byte) -91, arg2 - 1) + class375.method2267(arg0, (byte) -121, arg2 - -1));
        int var5 = class375.method2267(arg0, (byte) -71, arg2);
        return var4 / 8 + var3 / 16 + var5 / 4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcha;)V")
    public abstract void method595(class279 arg0);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()V")
    public abstract void method625();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method2107();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lcw;")
    public abstract class21 method2070(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method3253(-6102);
        field7684++;
    }

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method2198();
}
