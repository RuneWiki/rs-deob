import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class533 {

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lau;")
    private class692 field7834 = new class692(64);

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "Lmv;")
    private class295 field7836;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "Lvg;")
    public static class622 field7837 = new class622(25, 3);

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field7838 = -1;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "Lvg;")
    public static class622 field7840 = new class622(89, 5);

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "[F")
    public static float[] field7841 = new float[16384];

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "[F")
    public static float[] field7843 = new float[16384];

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lid;")
    public static class388 field7844;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field7835;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field7842;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7841[var2] = (float) Math.sin((double) var2 * var0);
            field7843[var2] = (float) Math.cos((double) var2 * var0);
        }
        field7844 = new class388();
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 13)
    public static void method3086(int arg0) {
        field7841 = null;
        field7840 = null;
        field7837 = null;
        if (arg0 != 64) {
            field7844 = null;
        }
        field7844 = null;
        field7843 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)Lrr;", line = 27)
    public final class369 method3087(int arg0, int arg1) {
        if (arg0 != 25) {
            return null;
        }
        field7833++;
        class692 var3 = this.field7834;
        class369 var4;
        synchronized (this.field7834) {
            var4 = (class369) this.field7834.method3901((long) arg1, arg0 - 107);
        }
        if (var4 != null) {
            return var4;
        }
        class295 var5 = this.field7836;
        byte[] var6;
        synchronized (this.field7836) {
            var6 = this.field7836.method1844(5, arg0 + 31305, arg1);
        }
        class369 var7 = new class369();
        if (var6 != null) {
            var7.method2284(-6490, new class540(var6));
        }
        class692 var8 = this.field7834;
        synchronized (this.field7834) {
            this.field7834.method3894(var7, (byte) 60, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 59)
    public static final void method3088(int arg0) {
        field7835++;
        class211.field2855.method3891(13747);
        if (arg0 != 16384) {
            method3086(-28);
        }
        class475.field6813.method3891(13747);
        class634.field9147.method3891(arg0 - 2637);
        class549.field8078.method3891(arg0 - 2637);
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lsea;ILmv;)V", line = 94)
    public class533(class373 arg0, int arg1, class295 arg2) {
        this.field7836 = arg2;
        this.field7836.method1845(5, true);
    }
}
