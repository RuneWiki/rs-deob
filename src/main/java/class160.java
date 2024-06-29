import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class160 {

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    private int field2385 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Laj;")
    private class71 field2380;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "[I")
    public static int[] field2383 = new int[50];

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field2386 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Ls;")
    private class381 field2382;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method1203(int arg0) {
        field2383 = null;
        if (arg0 >= -80) {
            field2383 = null;
        }
    }

    @OriginalMember(owner = "client!c", name = "b", descriptor = "(I)V")
    public static final void method1204(int arg0) {
        field2384++;
        class24.field433 = 0;
        class338.field4605 = -1;
        class335.field4543 = -1;
        if (arg0 != -2968) {
            field2386 = 120;
        }
        class151.field2323 = -1;
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)Ls;")
    public final class381 method1205(int arg0) {
        field2388++;
        if (this.field2385 > arg0 && this.field2380.field1068[this.field2385 - 1] != this.field2382) {
            class381 var2 = this.field2382;
            this.field2382 = var2.field5346;
            return var2;
        }
        while (this.field2380.field1071 > this.field2385) {
            class381 var3 = this.field2380.field1068[this.field2385++].field5346;
            if (this.field2380.field1068[this.field2385 - 1] != var3) {
                this.field2382 = var3.field5346;
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(I)Ls;")
    public final class381 method1206(int arg0) {
        if (arg0 == 12274) {
            this.field2385 = 0;
            field2381++;
            return this.method1205(arg0 ^ 0x2FF2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "<init>", descriptor = "(Laj;)V")
    public class160(class71 arg0) {
        this.field2380 = arg0;
    }
}
