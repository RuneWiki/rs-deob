import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class129 {

    @OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
    public int field2031 = 0;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field2026 = -1;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "[Lwl;")
    public static class304[] field2024 = new class304[14];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!gg", name = "g", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!gg", name = "h", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILwd;)V")
    public final void method914(int arg0, class162 arg1) {
        field2027++;
        while (true) {
            int var3 = arg1.method1133((byte) 53);
            if (var3 == 0) {
                int var4 = -117 / ((-arg0 - 73) / 46);
                return;
            }
            this.method916(arg1, (byte) 87, var3);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(J[IBI)Ljava/lang/String;")
    public static final String method915(long arg0, int[] arg1, byte arg2, int arg3) {
        int var5 = -87 / ((3 - arg2) / 47);
        field2025++;
        if (class46.field771 != null) {
            String var6 = class46.field771.method1029(arg0, arg3, 6, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lwd;BI)V")
    private final void method916(class162 arg0, byte arg1, int arg2) {
        if (arg2 == 5) {
            this.field2031 = arg0.method1142(-18970);
        }
        field2028++;
        if (arg1 != 87) {
            this.method916((class162) null, (byte) 34, 52);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method917(int arg0) {
        if (arg0 == 14) {
            field2024 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Z)Z")
    public static final boolean method918(boolean arg0) {
        if (arg0) {
            field2023 = 22;
        }
        field2030++;
        return class26.field328;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lnc;")
    public static final class259 method919(int arg0, int arg1, int arg2) {
        class151 var3 = class218.field3584[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2355;
    }
}
