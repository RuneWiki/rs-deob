import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public abstract class class474 extends class374 {

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "Lde;")
    public static class533 field6892 = new class533();

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Ljt;")
    public static class106 field6896 = new class106(128, 4);

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field6894;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "[I")
    public static int[] field6893;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "[Lpga;")
    public static class536[] field6895;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)Lnc;")
    public abstract class24 method2860(byte arg0);

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lwe;Lwe;B)V")
    public static final void method2861(class408 arg0, class408 arg1, byte arg2) {
        if (arg1.field6157 != null) {
            arg1.method2597(-81);
        }
        field6894++;
        arg1.field6157 = arg0.field6157;
        arg1.field6156 = arg0;
        if (arg2 <= 90) {
            method2862((byte) -74);
        }
        arg1.field6157.field6156 = arg1;
        arg1.field6156.field6157 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
    public static void method2862(byte arg0) {
        field6892 = null;
        if (arg0 >= 97) {
            field6896 = null;
            field6895 = null;
            field6893 = null;
        }
    }
}
