import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class46 {

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Z")
    public boolean field659 = false;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Ltl;")
    private class400 field666 = new class400(64);

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "Ltl;")
    public class400 field672 = new class400(500);

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Ltl;")
    public class400 field673 = new class400(30);

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "Ltl;")
    public class400 field674 = new class400(50);

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "Lui;")
    public class451 field670;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "Z")
    public boolean field658;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "Lui;")
    private class451 field669;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "Z")
    public static boolean field664 = false;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "[[I")
    public static int[][] field657 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public final void method336(byte arg0) {
        class400 var2 = this.field666;
        synchronized (this.field666) {
            this.field666.method2388(-26);
        }
        field667++;
        class400 var3 = this.field672;
        synchronized (this.field672) {
            this.field672.method2388(124);
        }
        class400 var4 = this.field673;
        synchronized (this.field673) {
            this.field673.method2388(-26);
        }
        if (arg0 == -19) {
            class400 var5 = this.field674;
            synchronized (this.field674) {
                this.field674.method2388(-88);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
    public final void method337(int arg0, int arg1) {
        field660++;
        int var3 = -120 % ((arg1 + 7) / 45);
        this.field675 = arg0;
        class400 var4 = this.field672;
        synchronized (this.field672) {
            this.field672.method2401((byte) -94);
        }
        class400 var5 = this.field673;
        synchronized (this.field673) {
            this.field673.method2401((byte) -38);
        }
        class400 var6 = this.field674;
        synchronized (this.field674) {
            this.field674.method2401((byte) -29);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(BI)Lvc;")
    public final class271 method338(byte arg0, int arg1) {
        field656++;
        class400 var3 = this.field666;
        class271 var4;
        synchronized (this.field666) {
            var4 = (class271) this.field666.method2393(-119, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field669.method2691(class200.method1354(arg1, (byte) 96), class136.method955(arg1, true), 0);
        class271 var6 = new class271();
        var6.field4043 = arg1;
        var6.field4032 = this;
        if (arg0 < 96) {
            return null;
        }
        if (var5 != null) {
            var6.method1768(new class446(var5), -1);
        }
        var6.method1758((byte) -125);
        if (var6.field4047) {
            var6.field4010 = false;
            var6.field4069 = 0;
        }
        if (!this.field658 && var6.field4077) {
            var6.field4005 = null;
            var6.field4029 = null;
        }
        class400 var7 = this.field666;
        synchronized (this.field666) {
            this.field666.method2395(0, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)V")
    public final void method339(int arg0, int arg1) {
        this.field666 = new class400(arg1);
        field661++;
        if (arg0 > -48) {
            field664 = true;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILje;IB)V")
    public static final void method340(int arg0, class178 arg1, int arg2, byte arg3) {
        field671++;
        if (class100.field1419 != null || class166.field2335 || arg1 == null || class428.method2518(14293, arg1) == null) {
            return;
        }
        class100.field1419 = arg1;
        class245.field3509 = class428.method2518(14293, arg1);
        class35.field433 = 0;
        class338.field5071 = arg2;
        class53.field756 = false;
        int var4 = 91 / ((-arg3 - 56) / 36);
        class382.field5658 = arg0;
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(II)V")
    public final void method341(int arg0, int arg1) {
        field665++;
        class400 var3 = this.field666;
        synchronized (this.field666) {
            this.field666.method2389(false, arg0);
        }
        class400 var4 = this.field672;
        synchronized (this.field672) {
            this.field672.method2389(false, arg0);
        }
        class400 var5 = this.field673;
        synchronized (this.field673) {
            this.field673.method2389(false, arg0);
        }
        if (arg1 == 0) {
            class400 var6 = this.field674;
            synchronized (this.field674) {
                this.field674.method2389(false, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
    public static void method342(int arg0) {
        field657 = null;
        if (arg0 != 4) {
            field657 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZB)V")
    public final void method343(boolean arg0, byte arg1) {
        field663++;
        if (arg1 >= 104 && this.field658 != arg0) {
            this.field658 = arg0;
            this.method345(116);
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)V")
    public final void method344(boolean arg0, boolean arg1) {
        field668++;
        if (this.field659 == arg1) {
            return;
        }
        if (!arg0) {
            this.field672 = null;
        }
        this.field659 = arg1;
        this.method345(116);
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(I)V")
    public final void method345(int arg0) {
        field662++;
        class400 var2 = this.field666;
        synchronized (this.field666) {
            if (arg0 < 115) {
                method340(107, (class178) null, -43, (byte) 113);
            }
            this.field666.method2401((byte) -127);
        }
        class400 var3 = this.field672;
        synchronized (this.field672) {
            this.field672.method2401((byte) -109);
        }
        class400 var4 = this.field673;
        synchronized (this.field673) {
            this.field673.method2401((byte) -112);
        }
        class400 var5 = this.field674;
        synchronized (this.field674) {
            this.field674.method2401((byte) -95);
        }
    }

    @OriginalMember(owner = "client!mf", name = "<init>", descriptor = "(Lgp;IZLui;Lui;)V")
    public class46(class430 arg0, int arg1, boolean arg2, class451 arg3, class451 arg4) {
        this.field670 = arg4;
        this.field658 = arg2;
        this.field669 = arg3;
        if (this.field669 != null) {
            int var6 = this.field669.method2675(false) - 1;
            this.field669.method2662(var6, (byte) -7);
        }
    }
}
