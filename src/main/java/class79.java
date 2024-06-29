import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class79 {

    @OriginalMember(owner = "client!fv", name = "g", descriptor = "Lhn;")
    private class509 field972 = new class509(64);

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "Lfo;")
    private class361 field970;

    @OriginalMember(owner = "client!fv", name = "h", descriptor = "[I")
    public static int[] field973 = new int[1];

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field967 = 1;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!fv", name = "i", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!fv", name = "k", descriptor = "Lla;")
    public static class316 field976;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
    public final void method447(int arg0, int arg1) {
        if (arg1 <= 43) {
            field967 = 74;
        }
        field968++;
        class509 var3 = this.field972;
        synchronized (this.field972) {
            this.field972.method3036(arg0, (byte) -50);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)V")
    public final void method448(boolean arg0) {
        field974++;
        class509 var2 = this.field972;
        synchronized (this.field972) {
            this.field972.method3034((byte) 82);
        }
        if (arg0) {
            this.method448(true);
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(BI)Lhu;")
    public final class87 method449(byte arg0, int arg1) {
        field971++;
        int var3 = -73 % ((65 - arg0) / 47);
        class509 var4 = this.field972;
        class87 var5;
        synchronized (this.field972) {
            var5 = (class87) this.field972.method3032(3589, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        class361 var6 = this.field970;
        byte[] var7;
        synchronized (this.field970) {
            var7 = this.field970.method2130(11, arg1, -116);
        }
        class87 var8 = new class87();
        if (var7 != null) {
            var8.method476(new class396(var7), (byte) 68);
        }
        class509 var9 = this.field972;
        synchronized (this.field972) {
            this.field972.method3046((long) arg1, var8, 1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
    public static void method450(int arg0) {
        field973 = null;
        if (arg0 == 11) {
            field976 = null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Ld;ILfo;)V")
    public class79(class104 arg0, int arg1, class361 arg2) {
        this.field970 = arg2;
        if (this.field970 != null) {
            this.field970.method2136(-81, 11);
        }
    }

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
    public final void method451(int arg0) {
        if (arg0 <= 0) {
            return;
        }
        field975++;
        class509 var2 = this.field972;
        synchronized (this.field972) {
            this.field972.method3045(48);
        }
    }
}
