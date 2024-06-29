import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public abstract class class174 {

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    public int field2424 = -1;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "[I")
    public static int[] field2421 = new int[5];

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field2425 = 0;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2417 = new String[100];

    @OriginalMember(owner = "client!en", name = "d", descriptor = "Z")
    public static boolean field2418 = true;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2428 = "flash2:";

    @OriginalMember(owner = "client!en", name = "e", descriptor = "F")
    public static float field2419;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!en", name = "b", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBIII)V", line = 18)
    public final void method1146(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        this.method972(arg4, arg2, arg3, arg0, 1);
        field2416++;
        if (arg1 != 60) {
            this.method936();
        }
    }

    @OriginalMember(owner = "client!en", name = "finalize", descriptor = "()V", line = 35)
    protected final void finalize() {
        field2422++;
        this.method1153(-9980);
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)V", line = 68)
    public static void method1147(boolean arg0) {
        field2428 = null;
        field2417 = null;
        field2421 = null;
        if (!arg0) {
            method1151(true);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIII)V", line = 81)
    public final void method1148(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method990(arg0, arg4, arg3, arg2, arg1);
        field2420++;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IBIIII)V", line = 102)
    public final void method1149(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method958(arg3, arg2, arg5, arg4, arg0, 1);
        field2427++;
        int var7 = -25 / ((4 - arg1) / 61);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(BIIIII)V", line = 116)
    public final void method1150(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 101) {
            field2418 = true;
        }
        this.method995(arg2, arg1, arg4, arg3, arg5, 1);
        field2426++;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(Z)I", line = 141)
    public static final int method1151(boolean arg0) {
        if (!arg0) {
            field2418 = true;
        }
        field2430++;
        return 2;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(IIIII)V", line = 163)
    public final void method1152(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method962(arg1, arg0, arg4, arg2, arg3);
        field2423++;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V", line = 172)
    public final void method1153(int arg0) {
        class164.field2290[this.field2424] = false;
        field2429++;
        this.method942();
        if (arg0 != -9980) {
            field2419 = 0.47883457F;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIZ)V", line = 213)
    public final void method1154(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            field2418 = false;
        }
        this.method973(arg3, arg1, arg4, arg2, arg0, 1);
        field2415++;
    }

    @OriginalMember(owner = "client!en", name = "d", descriptor = "()Z")
    public abstract boolean method935();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lvr;)V")
    public abstract void method949(class71 arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lbd;)V")
    public abstract void method1024(class38 arg0);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "()Lvr;")
    public abstract class71 method922();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)V")
    public abstract void method933(int arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(F)V")
    public abstract void method999(float arg0);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(II)I")
    public abstract int method1016(int arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method1018(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIZ)Lkh;")
    public abstract class11 method983(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIII)V")
    public abstract void method968(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "f", descriptor = "()I")
    public abstract int method994();

    @OriginalMember(owner = "client!en", name = "g", descriptor = "()Lvr;")
    public abstract class71 method1015();

    @OriginalMember(owner = "client!en", name = "h", descriptor = "()Z")
    public abstract boolean method979();

    @OriginalMember(owner = "client!en", name = "i", descriptor = "()I")
    public abstract int method1021();

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIII)[I")
    public abstract int[] method932(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method953(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILhm;II)V")
    public abstract void method980(int arg0, class121 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Loq;IIII)Lmj;")
    public abstract class393 method991(class200 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "j", descriptor = "()Z")
    public abstract boolean method974();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[I[I)Lhm;")
    public abstract class121 method1003(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method978(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "k", descriptor = "()F")
    public abstract float method936();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIILhm;II)V")
    public abstract void method982(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class121 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!en", name = "l", descriptor = "()V")
    public abstract void method957();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lmj;Lbg;Lvr;Lue;I)V")
    public abstract void method964(class393 arg0, class271 arg1, class71 arg2, class127 arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)V")
    public abstract void method944(boolean arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lnm;[Lcl;Z)Ltc;")
    public abstract class196 method966(class277 arg0, class145[] arg1, boolean arg2);

    @OriginalMember(owner = "client!en", name = "m", descriptor = "()F")
    public abstract float method1019();

    @OriginalMember(owner = "client!en", name = "n", descriptor = "()V")
    public abstract void method947();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public abstract void method952(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([I)V")
    public abstract void method1004(int[] arg0);

    @OriginalMember(owner = "client!en", name = "o", descriptor = "()Z")
    public abstract boolean method951();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III)V")
    public abstract void method961(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public abstract void method929(int arg0);

    @OriginalMember(owner = "client!en", name = "p", descriptor = "()Z")
    public abstract boolean method975();

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(Z)V")
    public abstract void method956(boolean arg0);

    @OriginalMember(owner = "client!en", name = "q", descriptor = "()Z")
    public abstract boolean method960();

    @OriginalMember(owner = "client!en", name = "r", descriptor = "()Z")
    public abstract boolean method988();

    @OriginalMember(owner = "client!en", name = "s", descriptor = "()V")
    public abstract void method942();

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(IIII)V")
    public abstract void method1010(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIII)V")
    public abstract void method962(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "t", descriptor = "()Z")
    public abstract boolean method937();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII)Z")
    public abstract boolean method1023(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IIIII)Lkh;")
    public abstract class11 method1008(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lbd;Lbd;FLbd;)Lbd;")
    public abstract class38 method1002(class38 arg0, class38 arg1, float arg2, class38 arg3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method950(Canvas arg0);

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIII)V")
    public abstract void method972(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "u", descriptor = "()I")
    public abstract int method992();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Lmj;Lvr;[Lue;I)V")
    public abstract void method984(class393[] arg0, class71 arg1, class127[] arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "v", descriptor = "()Z")
    public abstract boolean method940();

    @OriginalMember(owner = "client!en", name = "w", descriptor = "()Z")
    public abstract boolean method963();

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(II)I")
    public abstract int method1013(int arg0, int arg1);

    @OriginalMember(owner = "client!en", name = "x", descriptor = "()Z")
    public abstract boolean method925();

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
    public abstract void method1007(int arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lfn;)V")
    public abstract void method997(class73 arg0);

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(I)V")
    public abstract void method985(int arg0);

    @OriginalMember(owner = "client!en", name = "y", descriptor = "()V")
    public abstract void method1022();

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(IIIIII)V")
    public abstract void method973(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!en", name = "c", descriptor = "(IIIIII)V")
    public abstract void method958(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(I)V")
    public abstract void method998(int arg0);

    @OriginalMember(owner = "client!en", name = "z", descriptor = "()I")
    public abstract int method954();

    @OriginalMember(owner = "client!en", name = "A", descriptor = "()Z")
    public abstract boolean method931();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([Lmj;Lbg;Lvr;[Lue;I)V")
    public abstract void method943(class393[] arg0, class271 arg1, class71 arg2, class127[] arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "B", descriptor = "()V")
    public abstract void method924();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FF)V")
    public abstract void method1017(float arg0, float arg1);

    @OriginalMember(owner = "client!en", name = "C", descriptor = "()V")
    public abstract void method934();

    @OriginalMember(owner = "client!en", name = "g", descriptor = "(I)Lfn;")
    public abstract class73 method1001(int arg0);

    @OriginalMember(owner = "client!en", name = "D", descriptor = "()Z")
    public abstract boolean method996();

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(III)V")
    public abstract void method928(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!en", name = "E", descriptor = "()Z")
    public abstract boolean method969();

    @OriginalMember(owner = "client!en", name = "F", descriptor = "()Z")
    public abstract boolean method927();

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(IIII)V")
    public abstract void method948(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIII)V")
    public abstract void method990(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lbg;)V")
    public abstract void method921(class271 arg0);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(IIII)V")
    public abstract void method971(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(III[I)V")
    public abstract void method1020(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!en", name = "G", descriptor = "()V")
    public abstract void method930();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lcl;Z)Lkh;")
    public abstract class11 method955(class145 arg0, boolean arg1);

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(Z)V")
    public abstract void method945(boolean arg0);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II[[I[[IIII)Lac;")
    public abstract class319 method941(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(FFF)V")
    public abstract void method987(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(IIIIII)V")
    public abstract void method995(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!en", name = "H", descriptor = "()I")
    public abstract int method959();

    @OriginalMember(owner = "client!en", name = "e", descriptor = "(IIIIII)Lbd;")
    public abstract class38 method981(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!en", name = "I", descriptor = "()I")
    public abstract int method989();

    @OriginalMember(owner = "client!en", name = "J", descriptor = "()V")
    public abstract void method977();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method939(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!en", name = "K", descriptor = "()V")
    public abstract void method970();

    @OriginalMember(owner = "client!en", name = "L", descriptor = "()V")
    public abstract void method1006();

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[Lvg;)V")
    public abstract void method926(int arg0, class33[] arg1);

    @OriginalMember(owner = "client!en", name = "d", descriptor = "(II)V")
    public abstract void method1011(int arg0, int arg1);
}
