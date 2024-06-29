import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class435 {

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    private int field6223;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field6222;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Lui;")
    public static class308 field6224 = new class308();

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Lfba;")
    public static class348 field6229 = new class348(64);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field6225;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field6226;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!lc", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field6227++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ll;Z)V", line = 11)
    public static final void method2669(class639 arg0, boolean arg1) {
        field6228++;
        class654 var2 = (class654) class675.field9602.method4020((long) arg0.field4592, (byte) -93);
        if (var2 != null) {
            if (var2.field9375 != null) {
                class593.field8429.method3652(var2.field9375);
                var2.field9375 = null;
            }
            var2.method2656((byte) 119);
        }
        if (arg1) {
            method2669(null, true);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 36)
    public static void method2670(int arg0) {
        field6229 = null;
        if (arg0 != -1) {
            field6229 = null;
        }
        field6224 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(II)V", line = 51)
    public class435(int arg0, int arg1) {
        this.field6223 = arg0;
        this.field6222 = arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)V", line = 61)
    public static final void method2671(int arg0, int arg1) {
        class78.field1135 = arg1;
        field6226++;
        class120.field1639 = arg0;
        class120.field1639 = -1;
        class91.method710(false);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)I", line = 73)
    public final int method2672(boolean arg0) {
        if (!arg0) {
            method2671(-32, -37);
        }
        field6225++;
        return this.field6223;
    }
}
