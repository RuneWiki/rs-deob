import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class190 {

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "J")
    public long field2374;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "Lpq;")
    private class194 field2372;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "Lbt;")
    public static class519 field2376 = new class519();

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "[J")
    public static long[] field2377 = new long[10];

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
    public static void method1186(byte arg0) {
        field2377 = null;
        int var1 = -22 / ((arg0 - 36) / 44);
        field2376 = null;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)Z")
    public static final boolean method1187(int arg0, int arg1, int arg2) {
        field2373++;
        if (arg1 < 52) {
            return false;
        } else {
            return (arg2 & 0x10000) != 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field2372.method1203(23920, this.field2374);
        field2375++;
        super.finalize();
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lpq;JI)V")
    public class190(class194 arg0, long arg1, int arg2) {
        this.field2374 = arg1;
        this.field2372 = arg0;
    }
}
