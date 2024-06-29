import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class456 {

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lmga;")
    private class666 field6192 = new class666(64);

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lbi;")
    private class449 field6195;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "[[I")
    public static int[][] field6200 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "F")
    public static float field6196;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field6198;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field6199;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field6201;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public static int field6202;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Ldn;")
    public static class483 field6197;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V", line = 3)
    public final void method2600(byte arg0, int arg1) {
        class666 var3 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method3740((byte) 60, arg1);
            if (arg0 != -52) {
                field6200 = null;
            }
        }
        field6193++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 18)
    public final void method2601(int arg0) {
        if (arg0 >= -68) {
            this.method2605(1);
        }
        class666 var2 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method3748(6);
        }
        field6202++;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lpca;ILbi;)V", line = 83)
    public class456(class671 arg0, int arg1, class449 arg2) {
        this.field6195 = arg2;
        this.field6195.method2527(0, 31);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Lvw;", line = 45)
    public final class281 method2602(int arg0, int arg1) {
        field6194++;
        class666 var3 = this.field6192;
        class281 var4;
        synchronized (this.field6192) {
            var4 = (class281) this.field6192.method3750((long) arg0, false);
        }
        if (var4 != null) {
            return var4;
        }
        class449 var5 = this.field6195;
        byte[] var6;
        synchronized (this.field6195) {
            var6 = this.field6195.method2537(false, arg1, arg0);
        }
        class281 var7 = new class281();
        if (var6 != null) {
            var7.method1750(new class335(var6), 0);
        }
        class666 var8 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method3745(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 72)
    public static void method2603(byte arg0) {
        field6197 = null;
        field6200 = null;
        if (arg0 < 123) {
            field6196 = -1.3005767F;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)Lrba;", line = 100)
    public static final class402 method2604(int arg0) {
        field6198++;
        return ~class655.field8877 == arg0 ? new class402() : class501.field6703[--class655.field8877];
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V", line = 116)
    public final void method2605(int arg0) {
        if (arg0 >= -58) {
            return;
        }
        class666 var2 = this.field6192;
        synchronized (this.field6192) {
            this.field6192.method3739(0);
        }
        field6199++;
    }
}
