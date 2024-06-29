import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public abstract class class335 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lgda;")
    public static class53 field4669 = new class53(70, 4);

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field4670 = -1;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "I")
    public static int field4672 = 1;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "Lqfa;")
    public static class98 field4671 = new class98(58, 8);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(JI)I")
    public final int method2180(long arg0, int arg1) {
        field4668++;
        if (arg1 != 4) {
            this.method160((byte) 127);
        }
        long var4 = this.method164(arg1 - 9880);
        if (var4 > 0L) {
            class756.method4205(var4, 0);
        }
        return this.method163(70, arg0);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(B)J")
    public abstract long method160(byte arg0);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IJ)I")
    public abstract int method163(int arg0, long arg1);

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)J")
    public abstract long method164(int arg0);

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
    public static void method2181(byte arg0) {
        field4669 = null;
        if (arg0 <= 96) {
            method2181((byte) -68);
        }
        field4671 = null;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public abstract void method161(int arg0);
}
