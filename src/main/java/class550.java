import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eba")
public class class550 {

    @OriginalMember(owner = "client!eba", name = "h", descriptor = "I")
    public int field7518;

    @OriginalMember(owner = "client!eba", name = "d", descriptor = "I")
    private int field7514;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "Leba;")
    public static class550 field7511 = new class550(15, 3);

    @OriginalMember(owner = "client!eba", name = "b", descriptor = "I")
    public static int field7512;

    @OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
    public static int field7513;

    @OriginalMember(owner = "client!eba", name = "e", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!eba", name = "g", descriptor = "I")
    public static int field7517;

    @OriginalMember(owner = "client!eba", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7516;

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)V")
    public static void method3078(byte arg0) {
        field7511 = null;
        if (arg0 <= 104) {
            method3080((byte) 1, -52, 12, 108, -76, true, -62);
        }
        field7516 = null;
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)I")
    public final int method3079(int arg0) {
        field7515++;
        int var2 = -73 % ((-arg0 - 11) / 59);
        return this.field7514;
    }

    @OriginalMember(owner = "client!eba", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7512++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eba", name = "a", descriptor = "(BIIIIZI)V")
    public static final void method3080(byte arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6) {
        class452.field5970 = arg4;
        class482.field6720 = arg1;
        class252.field3316 = arg6;
        class174.field2462 = arg3;
        if (arg0 != 127) {
            return;
        }
        field7513++;
        class495.field6821 = arg2;
        if (arg5 && class452.field5970 >= 100) {
            class82.field946 = class174.field2462 * 512 + 256;
            class147.field1980 = class252.field3316 * 512 + 256;
            class148.field1986 = class180.method1211(class298.field3942, true, class82.field946, class147.field1980) - class495.field6821;
        }
        class311.field4200 = 2;
        class83.field1004 = -1;
        class342.field4585 = -1;
    }

    @OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(II)V")
    public class550(int arg0, int arg1) {
        this.field7518 = arg1;
        this.field7514 = arg0;
    }
}
