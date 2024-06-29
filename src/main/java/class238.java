import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class238 {

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "Lji;")
    private class622 field3202;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "J")
    public long field3207;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "Lra;")
    public static class361 field3203 = new class361(20, 8);

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        field3203 = null;
        if (arg0 > -76) {
            field3206 = 81;
        }
    }

    @OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field3205++;
        this.field3202.method3457(this.field3207, 0);
        super.finalize();
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Ltc;I)V")
    public static final void method1501(class477 arg0, int arg1) {
        field3204++;
        if (arg0.field6312 == 5 && arg0.field6321 != -1) {
            class640.method3525(arg0, class520.field6799, (byte) -47);
        }
        int var2 = -103 / ((-arg1 - 35) / 57);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lji;JI)V")
    public class238(class622 arg0, long arg1, int arg2) {
        this.field3202 = arg0;
        this.field3207 = arg1;
    }
}
