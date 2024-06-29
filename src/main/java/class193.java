import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class193 extends class248 {

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public static int field3200 = 0;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lij;")
    private static class50 field3204 = class78.method578(126, "Prepared sound engine");

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "Lij;")
    public static class50 field3199 = field3204;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "Z")
    public static boolean field3208 = true;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "Lij;")
    private static class50 field3212 = class78.method578(121, "Players");

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "Lij;")
    public static class50 field3205 = class78.method578(121, " )2> ");

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "Z")
    public static boolean field3211 = true;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "Lij;")
    public static class50 field3202 = field3212;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public int field3206;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "Lij;")
    public class50 field3198;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public static void method1305(int arg0) {
        field3204 = null;
        field3212 = null;
        field3199 = null;
        field3205 = null;
        field3202 = null;
        int var1 = 58 / ((arg0 + 56) / 58);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZILwd;)V")
    private final void method1306(boolean arg0, int arg1, class217 arg2) {
        field3207++;
        if (arg1 == 1) {
            this.field3201 = arg2.method1487(255);
        } else if (arg1 == 2) {
            this.field3206 = arg2.method1466((byte) -15);
        } else if (arg1 == 5) {
            this.field3198 = arg2.method1469((byte) -107);
        }
        if (!arg0) {
            this.method1306(true, -27, (class217) null);
        }
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)Z")
    public final boolean method1307(int arg0) {
        field3210++;
        if (arg0 != 1427) {
            this.method1307(-86);
        }
        return this.field3201 == 115;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)Z")
    public static final boolean method1308(boolean arg0) {
        if (arg0) {
            method1308(true);
        }
        field3209++;
        return class139.field2411 == 0 ? class161.field2761.method637(33) : true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lwd;I)V")
    public final void method1309(class217 arg0, int arg1) {
        if (arg1 != 0) {
            field3200 = -53;
        }
        field3213++;
        while (true) {
            int var3 = arg0.method1487(255);
            if (var3 == 0) {
                return;
            }
            this.method1306(true, var3, arg0);
        }
    }
}
