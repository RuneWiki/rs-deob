import java.awt.Canvas;
import java.awt.Component;
import java.awt.Rectangle;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class544 {

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "Ld;")
    public class267 field7764;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public int field7769;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "Lqg;")
    public static class266 field7759 = new class266();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "[[I")
    public static int[][] field7773 = new int[6][];

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public static int field7775 = 500;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "Lcb;")
    public static class631 field7772 = new class631(58, 8);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "Ltm;")
    public static class334 field7776 = new class334(28, 4);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "F")
    public static float field7777;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field7751;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field7752;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field7753;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field7754;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field7755;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field7756;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field7757;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field7758;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field7760;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field7761;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field7762;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field7763;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field7765;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
    public static int field7766;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "I")
    public static int field7767;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field7768;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field7770;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public static int field7774;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "Lfc;")
    public static class731 field7771;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ha", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field7778;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public static void method3178(boolean arg0) {
        if (arg0) {
            return;
        }
        field7773 = null;
        field7776 = null;
        field7771 = null;
        field7772 = null;
        field7759 = null;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method1278(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
    public abstract void method1258();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method285(class254 arg0);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method410(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
    public abstract void method248();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()Z")
    public abstract boolean method268();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method1272(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class556;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method370();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method379();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public abstract void method423(int arg0);

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method352(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIZ)V")
    public final void method3179(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.method224(arg0, arg3, arg4, arg2, arg1, 1);
        if (arg5) {
            field7761++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
    public final void method3180(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 77) {
            field7775 = -47;
        }
        this.method316(arg0, arg4, arg2, arg3, 1);
        field7751++;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()I")
    public abstract int method356();

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method264(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
    public final void method3181(Rectangle[] arg0, int arg1, int arg2) throws class556 {
        this.method1272(arg0, arg2, 0, 0);
        field7753++;
        if (arg1 <= 49) {
            this.method1268(1.6881664F, 0.51184577F, -0.18428463F);
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    public abstract void method1265();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method280(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method218();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)V")
    public static final void method3182(int arg0, int arg1) {
        field7765++;
        class12.field110 = 1000000000L / (long) arg1;
        if (arg0 != 1) {
            method3178(false);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V")
    public final void method3183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7758++;
        this.method410(arg5, arg3, arg0, arg1, arg2, 1);
        int var7 = 65 % ((-arg4 - 67) / 37);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public abstract void method261(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lit;B)V")
    public final void method3184(class34 arg0, byte arg1) {
        int var3 = -114 % ((arg1 + 53) / 60);
        field7760++;
        this.method1340(this.method1344(arg0, this.method1276(arg0.method175(), arg0.method179())));
    }

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public abstract boolean method400();

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method223(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method259(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpia;[Lgu;Z)Lda;")
    public abstract class400 method424(class54 arg0, class726[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lb;IIII)Lka;")
    public abstract class282 method301(class352 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method1287();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvm;)V")
    public abstract void method238(class72 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lit;")
    public abstract class34 method270(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method355(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method1328(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lvm;Lvm;FLvm;)Lvm;")
    public abstract class72 method1242(class72 arg0, class72 arg1, float arg2, class72 arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[IZIII)Lit;")
    public final class34 method3185(int arg0, int[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            return null;
        } else {
            field7755++;
            return this.method231(arg1, arg0, arg5, arg4, arg3, true);
        }
    }

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method332();

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Ltc;")
    public abstract class73 method343();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method275(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class570 method282(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method322(int arg0);

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method295(int arg0);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method298(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
    public abstract void method1274();

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()V")
    public abstract void method1338();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ltc;)V")
    public abstract void method244(class73 arg0);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()Z")
    public abstract boolean method220();

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method1290(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)Lhu;")
    public abstract class224 method1288(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method283(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method416(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method308(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method337(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method316(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public abstract void method1301(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Ltc;")
    public abstract class73 method414();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method361(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class339 method419(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method229(int arg0);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method377();

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method3190((byte) 89);
        field7756++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILjava/awt/Canvas;ZLd;ILla;)Lha;")
    public static final synchronized class544 method3186(int arg0, int arg1, int arg2, Canvas arg3, boolean arg4, class267 arg5, int arg6, class422 arg7) {
        field7762++;
        if (arg0 == 0) {
            return class634.method3590(arg6, arg3, (byte) 37, arg5, arg2);
        } else if (arg0 == 2) {
            return class649.method3656(arg5, arg6, arg3, 3, arg2);
        } else {
            if (arg4) {
                field7773 = null;
            }
            if (arg0 == 1) {
                return class423.method2643((byte) 98, arg1, arg5, arg3);
            } else if (arg0 == 5) {
                return class196.method1475(arg3, 5111, arg7, arg1, arg5);
            } else if (arg0 == 3) {
                return class533.method3152(arg7, arg3, 28110, arg1, arg5);
            } else {
                throw new IllegalArgumentException("UM");
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Lqm;")
    public abstract class429 method1308();

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method1262(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)V")
    public abstract void method1261(int arg0, int arg1) throws class556;

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method297(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()Z")
    public abstract boolean method320();

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method1273();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method1281(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public final void method3187(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method315(arg2, arg0, arg1, arg5, arg3, 1);
        field7757++;
        if (arg4 <= 89) {
            field7776 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method328(float arg0);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method305();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lvt;)V")
    public abstract void method339(int arg0, class759[] arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBI)V")
    public final void method3188(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field7766++;
        this.method264(arg4, arg2, arg0, arg1, 1);
        int var6 = 116 / ((arg3 + 22) / 32);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhu;Lwm;)Lpea;")
    public abstract class456 method1344(class224 arg0, class28 arg1);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public abstract void method246(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method288(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lit;")
    public abstract class34 method406(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method317(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method240(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    public abstract int method273(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lvt;")
    public abstract class759 method409(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;ZZ)Lab;")
    public static final class651 method3189(Component arg0, boolean arg1, boolean arg2) {
        field7763++;
        try {
            if (!arg2) {
                field7773 = null;
            }
            Constructor var3 = Class.forName("gt").getDeclaredConstructor(field7778 == null ? (field7778 = method3195("java.awt.Component")) : field7778, Boolean.TYPE);
            return (class651) var3.newInstance(arg0, Boolean.valueOf(arg1));
        } catch (Throwable var4) {
            return new class483(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public final void method3190(byte arg0) {
        if (arg0 <= 68) {
            field7773 = null;
        }
        class602.field8518[this.field7769] = false;
        field7770++;
        this.method248();
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method351(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lgu;Z)Lit;")
    public abstract class34 method310(class726 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method326(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()V")
    public abstract void method427();

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method388(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method287(int arg0, class570 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Ltc;")
    public abstract class73 method236();

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)Lza;")
    public abstract class254 method260(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[F)[F")
    public static final float[] method3191(int arg0, int arg1, float[] arg2) {
        field7752++;
        if (arg1 != -22824) {
            method3178(false);
        }
        float[] var3 = new float[arg0];
        class571.method3308(arg2, 0, var3, 0, arg0);
        return var3;
    }

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method292(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method253(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmp;I)V")
    public abstract void method380(class315 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method390(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public abstract void method315(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method1285();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(CI)I")
    public static final int method3192(char arg0, int arg1) {
        if (arg1 > -112) {
            method3182(-35, 82);
        }
        field7774++;
        return arg0 >= '\u0000' && arg0 < class494.field7162.length ? class494.field7162[arg0] : -1;
    }

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method350(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method290(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class570 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmp;)V")
    public abstract void method420(class315 arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method216(int arg0);

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()Z")
    public abstract boolean method1292();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method254();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lit;")
    public abstract class34 method231(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(II)Lwm;")
    public abstract class28 method1276(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method249(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method239();

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method381();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public final void method3193(int arg0) throws class556 {
        field7767++;
        this.method1261(0, arg0);
    }

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method392();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method374();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(IIIIII)Lvm;")
    public abstract class72 method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class544(class267 arg0) {
        this.field7764 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class602.field8518[var3]) {
                class602.field8518[var3] = true;
                var2 = var3;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field7769 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method217();

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method294();

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()Z")
    public abstract boolean method1237();

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method300();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method3194(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method292(arg2, arg1, arg4, arg3, 1);
        if (arg0 == -21151) {
            field7754++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method331(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method395(int arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method1268(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lpea;)V")
    public abstract void method1340(class456 arg0);

    // $FF: synthetic method
    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3195(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
