import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class364 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "Luq;")
    private class313 field5089;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "J")
    public long field5093;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "[Ldg;")
    public static class20[] field5092 = new class20[2048];

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field5088;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "[I")
    public static int[] field5091;

    @OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5090++;
        this.field5089.method1963(this.field5093, (byte) 125);
        super.finalize();
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)V")
    public static final void method2246(int arg0, int arg1, int arg2, int arg3) {
        class310.field3971 = new byte[arg0][arg3][arg2];
        if (arg1 != 2048) {
            field5091 = null;
        }
        field5088++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
    public static void method2247(boolean arg0) {
        field5092 = null;
        field5091 = null;
        if (arg0) {
            method2246(-98, -41, -49, -128);
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Luq;JI)V")
    public class364(class313 arg0, long arg1, int arg2) {
        this.field5089 = arg0;
        this.field5093 = arg1;
    }
}
