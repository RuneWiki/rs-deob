import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class238 {

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "J")
    public long field3381;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "Lbv;")
    private class282 field3379;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "[B")
    public static byte[] field3378 = new byte[16384];

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "[S")
    public static short[] field3380 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
    public static int[] field3383 = new int[2];

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field3382;

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field3382++;
        this.field3379.method1820(897494512, this.field3381);
        super.finalize();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V", line = 35)
    public static void method1607(int arg0) {
        if (arg0 >= -98) {
            method1607(42);
        }
        field3378 = null;
        field3383 = null;
        field3380 = null;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lbv;JI)V", line = 47)
    public class238(class282 arg0, long arg1, int arg2) {
        this.field3381 = arg1;
        this.field3379 = arg0;
    }
}
