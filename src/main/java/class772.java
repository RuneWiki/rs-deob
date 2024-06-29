import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class772 implements class753 {

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lni;")
    private class545 field10643;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public int field10650;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "[I")
    public int[] field10647;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public int field10651;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "Ljp;")
    private class372 field10642;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "[F")
    public float[] field10652;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[[[I")
    public static int[][][] field10648 = new int[2][][];

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "Ljo;")
    public static class351 field10649 = new class351(74, -1);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lpa;")
    public static class387 field10654 = new class387(20);

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "Z")
    public static boolean field10655 = false;

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "I")
    public static int field10657 = 500;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "Lpg;")
    public static class762 field10656 = new class762();

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field10658 = 0;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "I")
    public static int field10644;

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field10645;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field10646;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field10653;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
    public static void method4242(int arg0) {
        field10648 = null;
        if (arg0 <= 91) {
            method4242(-127);
        }
        field10649 = null;
        field10654 = null;
        field10656 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIZZ)V")
    public final void method3617(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class329.method2128(arg0, arg4, arg3, this.field10651, arg7 ? this.field10652 : null, arg6 ? this.field10643.field7656.field9631 : null, true, arg1, arg5, arg7 ? this.field10643.field7683 : null, this.field10643.field7656.field9635, arg2, this.field10647);
        field10653++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method4243(boolean arg0) {
        class544.field7651 = 1;
        field10646++;
        class222.field3160 = -1;
        long var1 = 0L;
        if (class669.field9400 == null) {
            class399.method2423(201, 35);
        } else {
            class120 var3 = new class120(class130.method939((byte) 99, class266.method1750(-30703, class669.field9400)));
            long var4 = var3.method834(-8616);
            class530.field7517 = var3.method834(-8616);
            class731.method4097("", 31533, arg0, class520.method3030((byte) 65, var4));
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIIIIIZZ)V")
    public final void method3618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7) {
        class329.method2128(arg0, arg4, arg3, this.field10643.field7656.field9635, arg7 ? this.field10643.field7683 : null, arg6 ? this.field10647 : null, true, arg1, arg5, arg7 ? this.field10652 : null, this.field10651, arg2, this.field10643.field7656.field9631);
        field10644++;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lni;Lqda;Ljp;)V")
    public class772(class545 arg0, class112 arg1, class372 arg2) {
        this.field10643 = arg0;
        if (arg1 instanceof class589) {
            class589 var4 = (class589) arg1;
            this.field10650 = var4.field10335;
            this.field10647 = var4.field8323;
            this.field10651 = var4.field10343;
        } else if ((arg1 instanceof class629)) {
            class629 var5 = (class629) arg1;
            this.field10647 = var5.field8898;
            this.field10651 = var5.field10343;
            this.field10650 = var5.field10335;
        } else {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            this.field10642 = arg2;
            if (this.field10642.field5366 != this.field10651 || this.field10642.field5367 != this.field10650) {
                throw new RuntimeException();
            }
            this.field10652 = this.field10642.field5358;
        }
    }
}
