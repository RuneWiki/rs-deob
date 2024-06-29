import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class593 {

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "Lsw;")
    private class641 field8616 = new class641(64);

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Ldn;")
    private class438 field8619;

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[I")
    public static int[] field8617 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lpt;")
    public static class451 field8610 = new class451(16);

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field8620 = 0;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field8612;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "I")
    public static int field8613;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field8614;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "Ldn;")
    public static class438 field8621;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "[[[Ldg;")
    public static class349[][][] field8615;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 3)
    public final void method3440(int arg0) {
        int var2 = -112 % ((9 - arg0) / 44);
        field8618++;
        class641 var3 = this.field8616;
        synchronized (this.field8616) {
            this.field8616.method3694(0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V", line = 18)
    public final void method3441(int arg0) {
        field8613++;
        class641 var2 = this.field8616;
        synchronized (this.field8616) {
            int var3 = -52 / ((58 - arg0) / 47);
            this.field8616.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)I", line = 31)
    public static final int method3442(boolean arg0) {
        field8612++;
        return arg0 ? -82 : 42;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 47)
    public static void method3443(int arg0) {
        field8621 = null;
        field8610 = null;
        field8615 = null;
        field8617 = null;
        if (arg0 != 2) {
            field8621 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZI)Ldk;", line = 62)
    public final class433 method3444(boolean arg0, int arg1) {
        field8614++;
        class641 var3 = this.field8616;
        class433 var4;
        synchronized (this.field8616) {
            var4 = (class433) this.field8616.method3682(0, (long) arg1);
        }
        if (!arg0) {
            field8615 = null;
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field8619;
        byte[] var6;
        synchronized (this.field8619) {
            var6 = this.field8619.method2558(100, arg1, 35);
        }
        class433 var7 = new class433();
        if (var6 != null) {
            var7.method2502(new class374(var6), true);
        }
        var7.method2506(-7);
        class641 var8 = this.field8616;
        synchronized (this.field8616) {
            this.field8616.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)V", line = 101)
    public final void method3445(int arg0, int arg1) {
        field8611++;
        class641 var3 = this.field8616;
        synchronized (this.field8616) {
            this.field8616.method3686((byte) 53, arg1);
            if (arg0 != 2) {
                this.field8619 = null;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 119)
    public class593(class515 arg0, int arg1, class438 arg2) {
        this.field8619 = arg2;
        if (this.field8619 != null) {
            this.field8619.method2554(35, 124);
        }
    }
}
