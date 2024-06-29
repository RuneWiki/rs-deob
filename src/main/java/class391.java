import java.awt.Canvas;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public abstract class class391 {

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public int field5484 = -1;

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "Ljava/lang/String;")
    public static String field5481 = "Close";

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "Ljava/lang/String;")
    public static String field5483 = "Face here";

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field5485 = -1;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
    public static int field5490 = 0;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public abstract void method103(Rectangle[] arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
    public final void method2406(int arg0) {
        if (arg0 > -116) {
            this.method219(47, -91, -66, -52, 7, -120);
        }
        class199.field2836[this.field5484] = false;
        field5487++;
        this.method217();
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "()I")
    public abstract int method234();

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)Li;")
    public abstract class83 method206(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lsj;Lbg;Lmk;Lmo;I)V")
    public abstract void method166(class73 arg0, class374 arg1, class156 arg2, class197 arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIILvj;II)V")
    public abstract void method220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class179 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "()V")
    public abstract void method246();

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "()Z")
    public abstract boolean method172();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII[BII)V")
    public abstract void method153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "()Z")
    public abstract boolean method173();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lk;)V")
    public abstract void method170(class293 arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Z)V")
    public abstract void method236(boolean arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIII)V")
    public final void method2407(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 <= 60) {
            field5490 = -99;
        }
        this.method219(arg0, arg4, arg2, arg1, arg3, 1);
        field5489++;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public abstract int method183(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)V")
    public abstract void method98(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIIIIII)V")
    public abstract void method232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9);

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "()Z")
    public abstract boolean method99();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZIIII)V")
    public final void method2408(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            this.field5484 = -43;
        }
        field5480++;
        this.method191(arg4, arg3, arg2, arg1, 1);
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)V")
    public static void method2409(int arg0) {
        field5483 = null;
        field5481 = null;
        if (arg0 < 28) {
            method2409(59);
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public abstract void method104(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIII)[I")
    public abstract int[] method197(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public abstract void method92(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIII)V")
    public abstract void method259(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIIII)Lkb;")
    public abstract class80 method188(int[] arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "()V")
    public abstract void method177();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ldr;Z)Lkb;")
    public abstract class80 method213(class214 arg0, boolean arg1);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIIII)Lk;")
    public abstract class293 method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(IIIIII)Z")
    public abstract boolean method228(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIBI)V")
    public final void method2410(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = -98 % ((55 - arg3) / 53);
        this.method192(arg1, arg4, arg2, arg0, 1);
        field5491++;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIII)V")
    public abstract void method142(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)V")
    public abstract void method129(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "()Z")
    public abstract boolean method227();

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "()I")
    public abstract int method199();

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(I)V")
    public abstract void method210(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([I)V")
    public abstract void method90(int[] arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lbg;)V")
    public abstract void method182(class374 arg0);

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "()I")
    public abstract int method200();

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "()F")
    public abstract float method114();

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "()V")
    public abstract void method122();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[[I[[IIII)Lsa;")
    public abstract class411 method105(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "()Lmk;")
    public abstract class156 method226();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lsj;Lbg;Lmk;[Lmo;I)V")
    public abstract void method212(class73[] arg0, class374 arg1, class156 arg2, class197[] arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIII)V")
    public abstract void method191(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "()Z")
    public abstract boolean method106();

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(IIII)V")
    public abstract void method111(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "()V")
    public abstract void method181();

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "()V")
    public abstract void method101();

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "()V")
    public abstract void method174();

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(II)I")
    public abstract int method163(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILvj;II)V")
    public abstract void method154(int arg0, class179 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "()Z")
    public abstract boolean method133();

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "()Lmk;")
    public abstract class156 method239();

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(IIIIII)V")
    public abstract void method95(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "()I")
    public abstract int method116();

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "()Z")
    public abstract boolean method250();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(FFF)V")
    public abstract void method254(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "()V")
    public abstract void method217();

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "()I")
    public abstract int method147();

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "()Z")
    public abstract boolean method203();

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(Z)V")
    public abstract void method152(boolean arg0);

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "()Z")
    public abstract boolean method91();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZ)V")
    public final void method2411(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            this.method203();
        }
        field5488++;
        this.method259(arg0, arg2, arg1, arg3, 1);
    }

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "(I)V")
    public static final void method2412(int arg0) {
        class410 var1 = class244.field3375;
        synchronized (class244.field3375) {
            class244.field3375.method2539(59);
        }
        if (arg0 != 1) {
            method2412(28);
        }
        field5486++;
    }

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "()V")
    public abstract void method235();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lk;Lk;FLk;)Lk;")
    public abstract class293 method229(class293 arg0, class293 arg1, float arg2, class293 arg3);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(III)V")
    public abstract void method137(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(IIII)V")
    public abstract void method218(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(IIIIII)V")
    public final void method2413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method167(arg0, arg2, arg5, arg4, arg3, 1);
        if (arg1 == -15084) {
            field5492++;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[I[I)Lvj;")
    public abstract class179 method221(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(F)V")
    public abstract void method211(float arg0);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(II)V")
    public abstract void method124(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "()Z")
    public abstract boolean method115();

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(IIII)V")
    public abstract void method186(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(Z)V")
    public abstract void method120(boolean arg0);

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "(I)V")
    public abstract void method248(int arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IFFFFF)V")
    public abstract void method151(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(FF)V")
    public abstract void method108(float arg0, float arg1);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Li;)V")
    public abstract void method256(class83 arg0);

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "()Z")
    public abstract boolean method168();

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "()I")
    public abstract int method224();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lmk;)V")
    public abstract void method189(class156 arg0);

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(IIIIZ)Lkb;")
    public abstract class80 method178(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(IIIIII)V")
    public abstract void method219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lj;)V")
    public abstract void method141(int arg0, class269[] arg1);

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(IIIII)V")
    public abstract void method192(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "([Lsj;Lmk;[Lmo;I)V")
    public abstract void method245(class73[] arg0, class156 arg1, class197[] arg2, int arg3);

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "()Z")
    public abstract boolean method202();

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "()V")
    public abstract void method148();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lmr;IIII)Lsj;")
    public abstract class73 method237(class84 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "()Z")
    public abstract boolean method231();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIZII)V")
    public final void method2414(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        this.method95(arg1, arg0, arg4, arg2, arg5, 1);
        field5479++;
        if (!arg3) {
            this.method211(1.7976512F);
        }
    }

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "()F")
    public abstract float method208();

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(II)V")
    public abstract void method100(int arg0, int arg1);

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "()V")
    public abstract void method110();

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "(IIIIII)V")
    public abstract void method167(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method194(Canvas arg0);

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lvm;[Ldr;Z)Lhq;")
    public abstract class175 method89(class323 arg0, class214[] arg1, boolean arg2);

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "()Z")
    public abstract boolean method258();

    @OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        this.method2406(-123);
        field5482++;
    }

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "()Z")
    public abstract boolean method146();

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[I)V")
    public abstract void method171(int arg0, int arg1, int arg2, int[] arg3);
}
