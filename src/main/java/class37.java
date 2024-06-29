import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class37 {

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "Ler;")
    private class157 field593 = new class157(64);

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "Lns;")
    private class438 field591;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "[I")
    public static int[] field589 = new int[14];

    @OriginalMember(owner = "client!mm", name = "h", descriptor = "D")
    public static double field595 = -1.0D;

    @OriginalMember(owner = "client!mm", name = "j", descriptor = "I")
    public static int field597 = 0;

    @OriginalMember(owner = "client!mm", name = "k", descriptor = "Z")
    public static boolean field598 = false;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public final void method266(boolean arg0) {
        field592++;
        class157 var2 = this.field593;
        synchronized (this.field593) {
            if (arg0) {
                this.method270(true, 64);
            }
            this.field593.method1015((byte) 117);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static void method267(byte arg0) {
        int var1 = 4 / ((arg0 - 43) / 51);
        field589 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IB)Lqr;")
    public final class494 method268(int arg0, byte arg1) {
        field588++;
        class157 var3 = this.field593;
        class494 var4;
        synchronized (this.field593) {
            var4 = (class494) this.field593.method1013((long) arg0, (byte) -106);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field591.method2650(arg0, -67, 35);
        class494 var6 = new class494();
        if (arg1 != -20) {
            this.field593 = null;
        }
        if (var5 != null) {
            var6.method2934(-32153, new class91(var5));
        }
        var6.method2936((byte) 115);
        class157 var7 = this.field593;
        synchronized (this.field593) {
            this.field593.method1012(arg1 - 46, (long) arg0, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
    public final void method269(int arg0) {
        field596++;
        class157 var2 = this.field593;
        synchronized (this.field593) {
            this.field593.method1022((byte) -34);
        }
        if (arg0 != 64) {
            this.method270(true, 114);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ZI)V")
    public final void method270(boolean arg0, int arg1) {
        field594++;
        if (arg0) {
            field595 = -0.047228469478784674D;
        }
        class157 var3 = this.field593;
        synchronized (this.field593) {
            this.field593.method1016(arg1, (byte) 120);
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lgo;ILns;)V")
    public class37(class331 arg0, int arg1, class438 arg2) {
        this.field591 = arg2;
        if (this.field591 != null) {
            this.field591.method2645(1, 35);
        }
    }
}
