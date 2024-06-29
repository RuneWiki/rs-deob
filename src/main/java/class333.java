import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class333 {

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "J")
    public long field4375;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "Lbo;")
    private class511 field4371;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lcu;")
    public static class145 field4372 = new class145(27, 8);

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "[I")
    public static int[] field4373 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Lsl;")
    public static class317 field4374 = new class317("", 10);

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!eu", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field4371.method2970(this.field4375, 1);
        field4376++;
        super.finalize();
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B)V", line = 14)
    public static void method1913(byte arg0) {
        int var1 = -83 % ((arg0 + 79) / 32);
        field4372 = null;
        field4374 = null;
        field4373 = null;
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lbo;J[Ltr;)V", line = 33)
    public class333(class511 arg0, long arg1, class191[] arg2) {
        this.field4375 = arg1;
        this.field4371 = arg0;
    }
}
