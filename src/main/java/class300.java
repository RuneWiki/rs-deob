import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class300 {

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lfea;")
    private class47 field4337;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "J")
    public static long field4334 = 0L;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
    public static int[] field4331 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!d", name = "i", descriptor = "[I")
    public static int[] field4339 = new int[32];

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field4332;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lum;")
    private class108 field4338;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "Lco;")
    public static class268 field4333;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lfea;B)V", line = 3)
    public final void method1875(class47 arg0, byte arg1) {
        this.field4337 = arg0;
        if (arg1 != 29) {
            this.method1875(null, (byte) 7);
        }
        field4336++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Lum;", line = 16)
    public final class108 method1876(int arg0) {
        field4335++;
        class108 var2 = this.field4338;
        if (arg0 != 0) {
            this.method1875(null, (byte) -29);
        }
        if (this.field4337.field659 == var2) {
            this.field4338 = null;
            return null;
        } else {
            this.field4338 = var2.field1802;
            return var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)Lum;", line = 39)
    public final class108 method1877(int arg0) {
        if (arg0 != -19613) {
            return null;
        }
        field4332++;
        class108 var2 = this.field4337.field659.field1802;
        if (this.field4337.field659 == var2) {
            this.field4338 = null;
            return null;
        } else {
            this.field4338 = var2.field1802;
            return var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 69)
    public static void method1878(int arg0) {
        field4331 = null;
        field4333 = null;
        field4339 = null;
        if (arg0 != 32) {
            field4331 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "()V", line = 85)
    public class300() {
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lfea;)V", line = 87)
    public class300(class47 arg0) {
        this.field4337 = arg0;
    }
}
