import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public class class446 extends class486 {

    @OriginalMember(owner = "client!or", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field6163;

    @OriginalMember(owner = "client!or", name = "J", descriptor = "I")
    public static int field6162 = 0;

    @OriginalMember(owner = "client!or", name = "H", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!or", name = "I", descriptor = "I")
    public static int field6161;

    @OriginalMember(owner = "client!or", name = "L", descriptor = "I")
    public static int field6164;

    @OriginalMember(owner = "client!or", name = "M", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!or", name = "N", descriptor = "I")
    public static int field6166;

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method2642(byte arg0) {
        field6161++;
        return arg0 < 86 ? null : this.field6163;
    }

    @OriginalMember(owner = "client!or", name = "h", descriptor = "(I)Z")
    public final boolean method2643(int arg0) {
        field6166++;
        int var2 = 69 % ((arg0 + 26) / 40);
        return false;
    }

    @OriginalMember(owner = "client!or", name = "i", descriptor = "(I)V")
    public static final void method2644(int arg0) {
        field6164++;
        class271[] var1 = class648.field9193;
        synchronized (class648.field9193) {
            for (int var2 = arg0; var2 < class648.field9193.length; var2++) {
                class648.field9193[var2] = new class271();
                class697.field9797[var2] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2645(String arg0, int arg1, int arg2) {
        field6165++;
        class437.method2608("", arg0, arg2, "", (byte) 120, "", arg1);
    }

    @OriginalMember(owner = "client!or", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6160++;
        if (!class83.field1263 || !class317.field4537) {
            return false;
        } else if (class414.field5685 < 100) {
            return false;
        } else if (class291.method1845(arg4, (byte) -53, arg2, arg1)) {
            int var5 = arg2 << class679.field9600;
            int var6 = arg4 << class679.field9600;
            if (class372.method2219(arg0, class678.field9594[arg1].method2476(arg4, arg2, -1), class253.field3624, arg3, class253.field3624, var6, var5)) {
                class222.field3263++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class446(Object arg0, int arg1) {
        super(arg1);
        this.field6163 = arg0;
    }
}
