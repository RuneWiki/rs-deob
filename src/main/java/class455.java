import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public abstract class class455 {

    @OriginalMember(owner = "client!la", name = "a", descriptor = "I")
    public static int field6073 = 0;

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field6074 = new String[100];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(BLni;)Lni;")
    public abstract class524 method679(byte arg0, class524 arg1);

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(B)V")
    public static void method2550(byte arg0) {
        field6074 = null;
        int var1 = 104 / ((-arg0 - 14) / 56);
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;BI)I")
    public static final int method2551(String arg0, byte arg1, int arg2) {
        if (arg1 != -35) {
            field6073 = 103;
        }
        field6075++;
        return class243.method1520(arg0, 36, true, arg2);
    }
}
