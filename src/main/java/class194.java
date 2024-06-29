import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class194 extends class283 {

    @OriginalMember(owner = "client!rl", name = "P", descriptor = "Ln;")
    public static class282 field3016 = new class282(64);

    @OriginalMember(owner = "client!rl", name = "T", descriptor = "Lna;")
    private static class26 field3020 = class69.method505("Sat", (byte) -126);

    @OriginalMember(owner = "client!rl", name = "S", descriptor = "Lna;")
    public static class26 field3019 = class69.method505("hitmarks", (byte) -128);

    @OriginalMember(owner = "client!rl", name = "X", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!rl", name = "U", descriptor = "Lna;")
    private static class26 field3021 = class69.method505("Mon", (byte) -124);

    @OriginalMember(owner = "client!rl", name = "W", descriptor = "Lna;")
    private static class26 field3023 = class69.method505("Fri", (byte) -124);

    @OriginalMember(owner = "client!rl", name = "Z", descriptor = "I")
    public static int field3026 = 7759444;

    @OriginalMember(owner = "client!rl", name = "ab", descriptor = "Lna;")
    private static class26 field3027 = class69.method505("Wed", (byte) -118);

    @OriginalMember(owner = "client!rl", name = "cb", descriptor = "Lna;")
    private static class26 field3029 = class69.method505("Tue", (byte) -117);

    @OriginalMember(owner = "client!rl", name = "bb", descriptor = "Lna;")
    private static class26 field3028 = class69.method505("Thu", (byte) -117);

    @OriginalMember(owner = "client!rl", name = "eb", descriptor = "Lna;")
    public static class26 field3031 = class69.method505("(U0a )2 in: ", (byte) -125);

    @OriginalMember(owner = "client!rl", name = "db", descriptor = "Lna;")
    private static class26 field3030 = class69.method505("Sun", (byte) -123);

    @OriginalMember(owner = "client!rl", name = "Y", descriptor = "[Lna;")
    public static class26[] field3025 = new class26[] { field3030, field3021, field3029, field3027, field3028, field3023, field3020 };

    @OriginalMember(owner = "client!rl", name = "Q", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!rl", name = "R", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!rl", name = "V", descriptor = "[Lqf;")
    public static class148[] field3022;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "(I)V", line = 6)
    public static void method1306(int arg0) {
        field3025 = null;
        field3027 = null;
        field3023 = null;
        field3031 = null;
        field3030 = null;
        field3021 = null;
        field3029 = null;
        if (arg0 != 7759444) {
            method1306(72);
        }
        field3016 = null;
        field3028 = null;
        field3022 = null;
        field3019 = null;
        field3020 = null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IB)[I", line = 39)
    public final int[] method8(int arg0, byte arg1) {
        int var3 = -96 / ((arg1 - 30) / 36);
        field3017++;
        return class13.field184;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 48)
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "(I)V", line = 52)
    public static final void method1307(int arg0) {
        field3018++;
        class69 var1 = (class69) class98.field1595.method264(-70);
        if (arg0 != 7759444) {
            field3028 = (class26) null;
        }
        while (var1 != null) {
            if (var1.field1077 == -1) {
                var1.field1079 = 0;
                class108.method765(56, var1);
            } else {
                var1.method1006(-1024);
            }
            var1 = (class69) class98.field1595.method263(4);
        }
    }
}
