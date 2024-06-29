import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class74 extends class220 {

    @OriginalMember(owner = "client!ej", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1000 = "";

    @OriginalMember(owner = "client!ej", name = "V", descriptor = "[I")
    public static int[] field1002 = new int[13];

    @OriginalMember(owner = "client!ej", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1001 = "M";

    @OriginalMember(owner = "client!ej", name = "X", descriptor = "Ljava/lang/String;")
    public static String field1004 = "M";

    @OriginalMember(owner = "client!ej", name = "W", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!ej", name = "Y", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ej", name = "P", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ej", name = "R", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!ej", name = "S", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ej", name = "Q", descriptor = "[Lnd;")
    public static class413[] field997;

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "(B)V", line = 4)
    public static final void method455(byte arg0) {
        ++field999;
        class361.field5287 = null;
        class184.method1136(0, class404.field6020, -1, (byte) -35, 0, class345.field5120, class274.field4034, 0, 0);
        if (class361.field5287 != null) {
            class135.method906(class274.field4034, class220.field3127, 0, class194.field2785.field3488, 0, class361.field5287, class345.field5120, 35, -1412584499, class180.field2391);
            class361.field5287 = null;
        }
        if (arg0 > -126) {
            method456(-104, -125, 62);
        }
    }

    @OriginalMember(owner = "client!ej", name = "<init>", descriptor = "()V", line = 26)
    public class74() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(II)[I", line = 32)
    public final int[] method43(int arg0, int arg1) {
        ++field996;
        int[] var3 = super.field3125.method2005(arg1, (byte) 126);
        if (super.field3125.field4676) {
            int var4 = class58.field831[arg1];
            for (int var5 = 0; var5 < class344.field5043; ++var5) {
                var3[var5] = this.method458(var4, class160.field2096[var5], 60) % 4096;
            }
        }
        if (arg0 != -11543) {
            method455((byte) -34);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)I", line = 67)
    public static final int method456(int arg0, int arg1, int arg2) {
        if (arg1 > arg2) {
            int var3 = arg2;
            arg2 = arg1;
            arg1 = var3;
        }
        ++field998;
        if (arg0 != -1) {
            method457(-12);
        }
        while (~arg1 != -1) {
            int var4 = arg2 % arg1;
            arg2 = arg1;
            arg1 = var4;
        }
        return arg2;
    }

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "(I)V", line = 97)
    public static void method457(int arg0) {
        int var1 = 82 / ((-57 - arg0) / 34);
        field1001 = null;
        field1004 = null;
        field997 = null;
        field1002 = null;
        field1000 = null;
    }

    @OriginalMember(owner = "client!ej", name = "c", descriptor = "(III)I", line = 116)
    private final int method458(int arg0, int arg1, int arg2) {
        ++field1003;
        int var4 = arg0 * 57 + arg1;
        if (arg2 < 6) {
            field997 = null;
        }
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * var5 * 15731 + 789221) * var5 - -1376312589) / 262144) + 4096;
    }
}
