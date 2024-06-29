import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class287 {

    @OriginalMember(owner = "client!iw", name = "d", descriptor = "I")
    public static int field3877 = 328;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!iw", name = "e", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "J")
    public static long field3874;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "Lkb;")
    public static class640 field3876;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 5)
    public static final void method1710(int arg0) {
        class611.field8763 = 1;
        field3878++;
        class168.field2054 = -1;
        long var1 = (long) arg0;
        if (class424.field6102 == null) {
            class676.method3841(35, -94);
        } else {
            class389 var3 = new class389(class534.method3139(class297.method1763(class424.field6102, (byte) 14), 128));
            long var4 = var3.method2227(-26276);
            class236.field3182 = var3.method2227(arg0 - 26276);
            class256.method1559("", true, (byte) 23, class437.method2613((byte) -125, var4));
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIB)Z", line = 30)
    public static final boolean method1711(int arg0, int arg1, byte arg2) {
        field3875++;
        if (arg2 == 12) {
            return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "(I)V", line = 49)
    public static void method1712(int arg0) {
        field3876 = null;
        if (arg0 != 328) {
            method1710(120);
        }
    }
}
