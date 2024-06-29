import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class454 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ld;")
    public class96 field6364;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public int field6368;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "[I")
    public static int[] field6365 = new int[13];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field6369;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field6375;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field6376;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILac;)V", line = 4)
    public final void method2657(int arg0, class712 arg1) {
        this.method111(this.method154(arg1, this.method148(arg1.method1895(), arg1.method1893())));
        if (arg0 > 125) {
            field6361++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 15)
    public final void method2658(int arg0) {
        int var2 = 38 % ((-arg0 - 82) / 34);
        class751.field10505[this.field6368] = false;
        field6362++;
        this.method84();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 31)
    public final void method2659(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg3 == 0) {
            this.method136(arg1, arg5, arg0, arg2, arg4, 1);
            field6378++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V", line = 55)
    public final void method2660(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method160(arg4, arg2, arg0, arg3, 1);
        if (arg1 >= 8) {
            field6377++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V", line = 68)
    public static final void method2661(boolean arg0) {
        field6370++;
        int[] var1 = new int[class190.field2488.field10026];
        int var2 = 0;
        if (!arg0) {
            method2665(null, true, -126, true, -51, 31);
        }
        for (int var3 = 0; var3 < class190.field2488.field10026; var3++) {
            class167 var5 = class190.field2488.method3944(256, var3);
            if (var5.field2130 >= 0 || var5.field2194 >= 0) {
                var1[var2++] = var3;
            }
        }
        class4.field30 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class4.field30[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 116)
    public final void method2662(byte arg0) throws class510 {
        field6374++;
        this.method89(0, 0);
        if (arg0 <= 126) {
            this.field6368 = 4;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V", line = 141)
    public static void method2663(byte arg0) {
        if (arg0 != 127) {
            field6365 = null;
        }
        field6365 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkha;Ld;Ljava/awt/Canvas;IIIIB)Lha;", line = 153)
    public static final synchronized class454 method2664(class687 arg0, class96 arg1, Canvas arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field6373++;
        if (arg6 == 0) {
            return class266.method1601(3262, arg1, arg5, arg2, arg4);
        } else if (arg6 == 2) {
            return class492.method2867(arg1, true, arg2, arg4, arg5);
        } else if (arg6 == 1) {
            return class394.method2346(arg2, arg1, arg3, -100);
        } else if (arg6 == 5) {
            return class270.method1621(arg0, false, arg3, arg2, arg1);
        } else if (arg7 <= 91) {
            return null;
        } else if (arg6 == 3) {
            return class232.method1467(arg1, arg3, arg2, arg0, -2212);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lkha;ZIZII)V", line = 209)
    public static final void method2665(class687 arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class545.method3095(arg4, arg0, arg3, 13842, arg5, 0L, arg2);
        if (arg1) {
            method2664(null, null, null, -31, 44, 58, -118, (byte) -1);
        }
        field6371++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB[III)Lac;", line = 252)
    public final class712 method2666(int arg0, int arg1, byte arg2, int[] arg3, int arg4, int arg5) {
        if (arg2 == -48) {
            field6375++;
            return this.method75(arg3, arg4, arg5, arg1, arg0, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V", line = 263)
    public class454(class96 arg0) {
        this.field6364 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class751.field10505[var3]) {
                class751.field10505[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field6368 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V", line = 299)
    public final void method2667(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6376++;
        if (arg1 != 113) {
            this.method141(null);
        }
        this.method128(arg0, arg2, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIIII)V", line = 313)
    public final void method2668(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method167(arg4, arg0, arg2, arg3, arg5, 1);
        if (arg1) {
            field6365 = null;
        }
        field6369++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZIII)V", line = 324)
    public final void method2669(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field6372++;
        if (arg1) {
            this.method153(arg3, arg0, arg4, arg2, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V", line = 345)
    protected void finalize() {
        this.method2658(-122);
        field6366++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V", line = 390)
    public final void method2670(Rectangle[] arg0, int arg1, int arg2) throws class510 {
        int var4 = -59 % ((arg1 - 48) / 58);
        field6363++;
        this.method122(arg0, arg2, 0, 0);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIB)V", line = 402)
    public final void method2671(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        this.method134(arg4, arg2, arg1, arg0, arg3, 1);
        if (arg5 > -105) {
            this.field6364 = null;
        }
        field6367++;
    }

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method129(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lpk;")
    public abstract class621 method90(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lac;")
    public abstract class712 method157(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method81(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method112(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method107();

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method76(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method99();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lid;IIII)Lka;")
    public abstract class219 method150(class415 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)Lza;")
    public abstract class702 method161(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method95(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcd;)V")
    public abstract void method102(class603 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lbe;Z)Lac;")
    public abstract class712 method60(class196 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method67(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method121(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Z")
    public abstract boolean method113();

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method178();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method172();

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method162(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method134(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method104(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lst;")
    public abstract class675 method148(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method145(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method88();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()V")
    public abstract void method93();

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method160(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method143(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method136(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method96(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method139(float arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method100(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    public abstract void method175();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method118(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method62();

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method117(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method168(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()V")
    public abstract void method116();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method163(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)Ltj;")
    public abstract class662 method137(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method82(int arg0);

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method57();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method152();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method140(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lac;")
    public abstract class712 method70(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method151(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class81 method87(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method128(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()Z")
    public abstract boolean method91();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lac;")
    public abstract class712 method75(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method179();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmk;)V")
    public abstract void method111(class344 arg0);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method109(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method63(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method85(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method83(int arg0, class81 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method124(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method133(class702 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method65(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method66();

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method142();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Lwc;")
    public abstract class376 method94();

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method97(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltba;[Lbe;Z)Lda;")
    public abstract class423 method156(class56 arg0, class196[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lpk;)V")
    public abstract void method146(int arg0, class621[] arg1);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method176();

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class402 method101(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method181(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class81 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method105(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method130(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpea;Lst;)Lmk;")
    public abstract class344 method154(class594 arg0, class675 arg1);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method164(int arg0);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lpea;")
    public abstract class594 method174(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcd;I)V")
    public abstract void method155(class603 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method141(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method78(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method86();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method89(int arg0, int arg1) throws class510;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method171();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltj;)V")
    public abstract void method170(class662 arg0);

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method71();

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method131(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method147();

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method173(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method135(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method59();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Z")
    public abstract boolean method149();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltj;Ltj;FLtj;)Ltj;")
    public abstract class662 method119(class662 arg0, class662 arg1, float arg2, class662 arg3);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method64(int arg0);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method108();

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()Lwc;")
    public abstract class376 method125();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
    public abstract void method84();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Lwc;")
    public abstract class376 method114();

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()I")
    public abstract int method115();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method98(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public abstract void method169(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method126();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method122(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class510;

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Loj;")
    public abstract class633 method79();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method127();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method68(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lwc;)V")
    public abstract void method77(class376 arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method120(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method73();

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method123();
}
