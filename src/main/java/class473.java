import java.awt.Canvas;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class class473 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Ld;")
    public class101 field6556;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public int field6555;

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "[I")
    public static int[] field6568 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "[I")
    public static int[] field6554 = new int[2];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field6553;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field6558;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "I")
    public static int field6564;

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "J")
    public static long field6569;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIBII)V")
    public final void method2811(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field6559++;
        this.method207(arg0, arg1, arg3, arg4, 1);
        int var6 = -6 % ((arg2 - 59) / 63);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()Z")
    public abstract boolean method222();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method2812(int arg0) {
        if (arg0 == 2885) {
            field6554 = null;
            field6568 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZIII)V")
    public final void method2813(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6570++;
        if (arg2) {
            this.method134(null, -15);
        }
        this.method139(arg1, arg5, arg0, arg4, arg3, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Lcn;")
    public abstract class621 method236(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[[I[[IIII)Ls;")
    public abstract class418 method204(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIII)V")
    public abstract void method197(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lrb;")
    public abstract class260 method172();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIILae;Ljava/awt/Canvas;Ld;I)Lha;")
    public static final synchronized class473 method2814(int arg0, int arg1, int arg2, int arg3, class283 arg4, Canvas arg5, class101 arg6, int arg7) {
        field6564++;
        if (arg2 == arg7) {
            return class583.method3430(arg5, arg0, arg6, arg3, (byte) -115);
        } else if (arg7 == 2) {
            return class617.method3562(arg5, arg6, arg0, arg3, arg2 ^ 0xFFFFFFE5);
        } else if (arg7 == 1) {
            return class151.method998(10000, arg1, arg5, arg6);
        } else if (arg7 == 5) {
            return class96.method694((byte) 127, arg6, arg5, arg4, arg1);
        } else if (arg7 == 3) {
            return class264.method1733(arg1, arg6, -4219, arg5, arg4);
        } else {
            throw new IllegalArgumentException("UM");
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;IIIII)V")
    public abstract void method249(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8, int arg9, int arg10, int arg11);

    @OriginalMember(owner = "client!ha", name = "X", descriptor = "(I)V")
    public abstract void method166(int arg0);

    @OriginalMember(owner = "client!ha", name = "na", descriptor = "(IIII)[I")
    public abstract int[] method243(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "DA", descriptor = "(IIII)V")
    public abstract void method242(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
    public abstract void method167();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)Lok;")
    public abstract class255 method151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IBIIII)Lho;")
    public final class318 method2815(int[] arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field6563++;
        if (arg1 != -39) {
            this.field6556 = null;
        }
        return this.method182(arg0, arg5, arg2, arg4, arg3, true);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Z")
    public abstract boolean method162();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([Ljava/awt/Rectangle;III)V")
    public abstract void method254(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class357;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public abstract boolean method175();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)I")
    public abstract int method198(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IBIII)V")
    public final void method2816(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field6562++;
        if (arg1 == -83) {
            this.method152(arg2, arg3, arg0, arg4, 1);
        }
    }

    @OriginalMember(owner = "client!ha", name = "KA", descriptor = "(IIII)V")
    public abstract void method225(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public abstract void method203(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([I)V")
    public abstract void method218(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "xa", descriptor = "(F)V")
    public abstract void method202(float arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lok;)V")
    public abstract void method173(class255 arg0);

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "(III)V")
    public abstract void method255(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)Lza;")
    public abstract class731 method178(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    public abstract void method184();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhda;)V")
    public abstract void method253(class714 arg0);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()Loo;")
    public abstract class12 method153();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lok;Lok;FLok;)Lok;")
    public abstract class255 method209(class255 arg0, class255 arg1, float arg2, class255 arg3);

    @OriginalMember(owner = "client!ha", name = "ZA", descriptor = "(IFFFFF)V")
    public abstract void method154(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    public abstract void method232(int arg0);

    @OriginalMember(owner = "client!ha", name = "EA", descriptor = "(IIII)V")
    public abstract void method217(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)Lrca;")
    public abstract class36 method246(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method168(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "aa", descriptor = "(IIIIII)V")
    public abstract void method233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "(IIIIIII)I")
    public abstract int method164(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Z)V")
    public final void method2817(boolean arg0) throws class357 {
        this.method157(0, 0);
        if (!arg0) {
            field6573++;
        }
    }

    @OriginalMember(owner = "client!ha", name = "GA", descriptor = "(I)V")
    public abstract void method230(int arg0);

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "(II)V")
    public abstract void method146(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIBII)V")
    public final void method2818(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field6571++;
        int var7 = 1 / ((arg3 - 9) / 32);
        this.method171(arg2, arg4, arg1, arg5, arg0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lcn;Lrca;)Lmia;")
    public abstract class684 method247(class621 arg0, class36 arg1);

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)V")
    public abstract void method157(int arg0, int arg1) throws class357;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "()I")
    public abstract int method136();

    @OriginalMember(owner = "client!ha", name = "ya", descriptor = "()V")
    public abstract void method226();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[I[I)Laa;")
    public abstract class87 method248(int arg0, int arg1, int[] arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()Z")
    public abstract boolean method147();

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Loo;")
    public abstract class12 method159();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method141(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhda;I)V")
    public abstract void method134(class714 arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()Z")
    public abstract boolean method223();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(FFF)V")
    public abstract void method186(float arg0, float arg1, float arg2);

    @OriginalMember(owner = "client!ha", name = "m", descriptor = "()V")
    public abstract void method145();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIIII)V")
    public abstract void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(II)V")
    public abstract void method140(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "n", descriptor = "()Z")
    public abstract boolean method161();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lao;IIII)Lka;")
    public abstract class231 method231(class534 arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIZ)Lho;")
    public abstract class318 method228(int arg0, int arg1, int arg2, int arg3, boolean arg4);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "(ILaa;II)V")
    public abstract void method176(int arg0, class87 arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "o", descriptor = "()V")
    public abstract void method250();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIII)V")
    public final void method2819(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 16) {
            this.field6556 = null;
        }
        field6572++;
        this.method148(arg2, arg3, arg4, arg0, 1);
    }

    @OriginalMember(owner = "client!ha", name = "za", descriptor = "(IIIII)V")
    public abstract void method148(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "Q", descriptor = "(IIIIII[BII)V")
    public abstract void method224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIII)V")
    public abstract void method189(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "T", descriptor = "(IIII)V")
    public abstract void method252(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "()I")
    public abstract int method214();

    @OriginalMember(owner = "client!ha", name = "p", descriptor = "()Z")
    public abstract boolean method206();

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(IIIIII)V")
    public abstract void method171(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZ)Lho;")
    public abstract class318 method183(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lza;)V")
    public abstract void method165(class731 arg0);

    @OriginalMember(owner = "client!ha", name = "P", descriptor = "(IIIII)V")
    public abstract void method207(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "XA", descriptor = "()I")
    public abstract int method177();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public abstract void method237(int arg0);

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public abstract void method185(int arg0);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public abstract void method195(int arg0);

    @OriginalMember(owner = "client!ha", name = "q", descriptor = "()Z")
    public abstract boolean method135();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lfm;Z)Lho;")
    public abstract class318 method192(class279 arg0, boolean arg1);

    @OriginalMember(owner = "client!ha", name = "da", descriptor = "(III[I)V")
    public abstract void method142(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lmia;)V")
    public abstract void method229(class684 arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Ljava/awt/Rectangle;I)V")
    public final void method2820(int arg0, Rectangle[] arg1, int arg2) throws class357 {
        this.method254(arg1, arg2, 0, arg0);
        field6567++;
    }

    @OriginalMember(owner = "client!ha", name = "HA", descriptor = "(IIII[I)V")
    public abstract void method251(int arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public final void method2821(byte arg0) {
        class601.field8408[this.field6555] = false;
        field6566++;
        if (arg0 < 61) {
            this.finalize();
        }
        this.method205();
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIILaa;II)V")
    public abstract void method212(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class87 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!ha", name = "r", descriptor = "()V")
    public abstract void method210();

    @OriginalMember(owner = "client!ha", name = "finalize", descriptor = "()V")
    protected void finalize() {
        this.method2821((byte) 98);
        field6560++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method221(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "s", descriptor = "()Z")
    public abstract boolean method201();

    @OriginalMember(owner = "client!ha", name = "t", descriptor = "()Loo;")
    public abstract class12 method187();

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public abstract void method170(int arg0);

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "(III[I)V")
    public abstract void method196(int arg0, int arg1, int arg2, int[] arg3);

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "()I")
    public abstract int method181();

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Ld;)V")
    public class473(class101 arg0) {
        this.field6556 = arg0;
        int var2 = -1;
        for (int var3 = 0; var3 < 8; var3++) {
            if (!class601.field8408[var3]) {
                var2 = var3;
                class601.field8408[var3] = true;
                break;
            }
        }
        if (var2 == -1) {
            throw new IllegalStateException("NFTI");
        }
        this.field6555 = var2;
    }

    @OriginalMember(owner = "client!ha", name = "u", descriptor = "()V")
    public abstract void method205();

    @OriginalMember(owner = "client!ha", name = "Y", descriptor = "()[I")
    public abstract int[] method238();

    @OriginalMember(owner = "client!ha", name = "v", descriptor = "()V")
    public abstract void method227();

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "()Z")
    public abstract boolean method199();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIF)Lsca;")
    public abstract class251 method138(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public abstract int method241();

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(IIIID)V")
    public abstract void method235(int arg0, int arg1, int arg2, int arg3, double arg4);

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(Z)V")
    public abstract void method239(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "JA", descriptor = "(IIIIII)I")
    public abstract int method258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "()Z")
    public abstract boolean method193();

    @OriginalMember(owner = "client!ha", name = "la", descriptor = "()V")
    public abstract void method208();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[Lsca;)V")
    public abstract void method163(int arg0, class251[] arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;)V")
    public abstract void method155(Canvas arg0);

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "(Z)V")
    public abstract void method211(boolean arg0);

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "()Z")
    public abstract boolean method200();

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIIIZ)Lho;")
    public abstract class318 method182(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "()Z")
    public abstract boolean method156();

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)I")
    public abstract int method188(int arg0, int arg1);

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(Ljava/awt/Canvas;II)V")
    public abstract void method190(Canvas arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "()I")
    public abstract int method143();

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(IIIIII)V")
    public final void method2822(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method233(arg2, arg4, arg1, arg0, arg5, arg3);
        field6565++;
    }

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "([I)V")
    public abstract void method160(int[] arg0);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IB)V")
    public static final void method2823(int arg0, byte arg1) {
        field6557++;
        if (arg0 != -24022) {
            method2812(-6);
        }
        if (class244.field3608 == null) {
            class244.field3608 = new byte[4][class741.field10208][class525.field7224];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < class741.field10208; var3++) {
                for (int var4 = 0; var4 < class525.field7224; var4++) {
                    class244.field3608[var2][var3][var4] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "ra", descriptor = "(IIII)V")
    public abstract void method245(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/lang/Object;Lvt;)V")
    public static final void method2824(int arg0, Object arg1, class768 arg2) {
        field6558++;
        if (arg2.field10560 == null) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg2.field10560.peekEvent() != null; var3++) {
            class730.method4066((byte) -45, 1L);
        }
        try {
            int var4 = 118 % ((24 - arg0) / 42);
            if (arg1 != null) {
                arg2.field10560.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIIIIIIIIII)V")
    public abstract void method215(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILho;)V")
    public final void method2825(int arg0, class318 arg1) {
        this.method229(this.method247(arg1, this.method246(arg1.method737(), arg1.method738())));
        field6561++;
        if (arg0 != -24127) {
            this.field6555 = -126;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Loo;)V")
    public abstract void method194(class12 arg0);

    @OriginalMember(owner = "client!ha", name = "U", descriptor = "(IIIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lhw;[Lfm;Z)Lda;")
    public abstract class442 method179(class300 arg0, class279[] arg1, boolean arg2);

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "(I)V")
    public abstract void method180(int arg0);

    @OriginalMember(owner = "client!ha", name = "pa", descriptor = "()V")
    public abstract void method244();
}
