import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class362 {

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "[Ljava/lang/String;")
    private String[] field5172;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "[I")
    public static int[] field5169 = new int[25];

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "I")
    public static int field5165;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "I")
    public static int field5170;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "Ltq;")
    public static class376 field5168;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "[Lgj;")
    public static class381[] field5167;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method2331(int arg0, int arg1) {
        if (arg0 != 25) {
            field5167 = null;
        }
        field5170++;
        return this.field5172[arg1];
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
    public static void method2332(byte arg0) {
        field5167 = null;
        field5169 = null;
        field5168 = null;
        if (arg0 < 36) {
            field5167 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZILdg;)Ljava/lang/String;")
    public static final String method2333(boolean arg0, int arg1, class236 arg2) {
        field5165++;
        try {
            int var3 = arg2.method1594(-110);
            if (!arg0) {
                method2332((byte) 2);
            }
            if (arg1 < var3) {
                var3 = arg1;
            }
            byte[] var4 = new byte[var3];
            arg2.field3320 += class240.field3417.method1440(var4, arg2.field3320, var3, 0, arg2.field3364, -126);
            return class180.method1218(15597, var3, 0, var4);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class362(String arg0, String arg1, String arg2, String arg3) {
        this.field5172 = new String[] { arg0, arg1, arg2, arg3 };
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ltq;Ltq;B)V")
    public static final void method2334(class376 arg0, class376 arg1, byte arg2) {
        field5171++;
        class351.field4969 = arg1;
        class291.field4078 = arg0;
        class291.field4078.method2415(34, (byte) 56);
        if (arg2 != 37) {
            field5168 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field5166++;
        throw new IllegalStateException();
    }
}
