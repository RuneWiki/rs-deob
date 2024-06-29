import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class485 {

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field6991;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "Lwd;")
    public static class357 field6990 = new class357(2, 4, 4, 0);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field6985;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field6986;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field6987;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field6989;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[Lf;")
    public static class534[] field6988;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 14)
    public static void method2797(byte arg0) {
        field6990 = null;
        field6988 = null;
        int var1 = 31 % ((arg0 - 20) / 34);
    }

    @OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;", line = 24)
    public final String toString() {
        field6987++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(I)V", line = 32)
    public class485(int arg0) {
        this.field6991 = arg0;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IB)Z", line = 43)
    public static final boolean method2798(int arg0, byte arg1) {
        field6985++;
        if (arg1 <= 43) {
            return true;
        } else {
            return arg0 == 3 || arg0 == 4;
        }
    }
}
