import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class587 {

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public int field8337;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Lap;")
    private class435 field8343;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field8339;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field8344;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "Lwm;")
    public static class515 field8341;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "[I")
    public static int[] field8340;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V", line = 4)
    public static final void method3293(byte arg0) {
        field8344++;
        if (class69.field747 == null) {
            class606 var1 = new class606();
            byte[] var2 = var1.method3379(true, 128, 128, 16);
            class69.field747 = class356.method1967(var2, -111, false);
        }
        if (arg0 > -56) {
            field8342 = 59;
        }
        if (class263.field3328 == null) {
            class19 var3 = new class19();
            byte[] var4 = var3.method76(16, 0, 128, 128);
            class263.field3328 = class356.method1967(var4, 120, false);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)Z", line = 33)
    public static final boolean method3294(int arg0, int arg1, byte arg2) {
        field8338++;
        int var3 = 40 % ((47 - arg2) / 33);
        return (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V", line = 48)
    public static void method3295(byte arg0) {
        field8341 = null;
        int var1 = -96 % ((-arg0 - 40) / 63);
        field8340 = null;
    }

    @OriginalMember(owner = "client!ph", name = "finalize", descriptor = "()V", line = 58)
    protected final void finalize() throws Throwable {
        this.field8343.method2387(this.field8337, (byte) 93);
        field8336++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lap;II)V", line = 70)
    public class587(class435 arg0, int arg1, int arg2) {
        this.field8337 = arg2;
        this.field8343 = arg0;
    }
}
