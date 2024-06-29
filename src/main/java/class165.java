import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class165 extends class308 {

    @OriginalMember(owner = "client!up", name = "N", descriptor = "Ljava/lang/Object;")
    private Object field2284;

    @OriginalMember(owner = "client!up", name = "P", descriptor = "Z")
    public static boolean field2286 = false;

    @OriginalMember(owner = "client!up", name = "R", descriptor = "[I")
    public static int[] field2288 = new int[14];

    @OriginalMember(owner = "client!up", name = "C", descriptor = "Lcm;")
    public static class472 field2281 = new class472();

    @OriginalMember(owner = "client!up", name = "K", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!up", name = "M", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!up", name = "O", descriptor = "I")
    public static int field2285;

    @OriginalMember(owner = "client!up", name = "Q", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!up", name = "T", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!up", name = "S", descriptor = "[I")
    public static int[] field2289;

    @OriginalMember(owner = "client!up", name = "b", descriptor = "(I)V")
    public static void method960(int arg0) {
        field2281 = null;
        field2289 = null;
        field2288 = null;
        if (arg0 != 1) {
            field2288 = null;
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(B)Ljava/lang/Object;")
    public final Object method961(byte arg0) {
        field2283++;
        if (arg0 < 96) {
            this.method961((byte) 97);
        }
        return this.field2284;
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(B)Z")
    public final boolean method962(byte arg0) {
        field2282++;
        return arg0 == -120 ? false : false;
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class165(Object arg0, int arg1) {
        super(arg1);
        this.field2284 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IBI)B")
    public static final byte method963(int arg0, byte arg1, int arg2) {
        field2287++;
        if (arg2 == 9) {
            if (arg1 != -18) {
                field2285 = 87;
            }
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }
}
