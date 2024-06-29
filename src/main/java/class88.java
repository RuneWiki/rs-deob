import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class88 {

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "[J")
    public static long[] field1146 = new long[10];

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "B")
    public byte field1147;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public int field1145;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Ljava/lang/String;")
    public String field1148;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "[B")
    public static byte[] field1149;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V", line = 7)
    public static void method627(int arg0) {
        field1146 = null;
        if (arg0 != -7152) {
            field1146 = null;
        }
        field1149 = null;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(III)V", line = 21)
    public static final void method628(int arg0, int arg1, int arg2) {
        if (arg0 != -10452) {
            field1149 = null;
        }
        field1144++;
        if (class673.field9452 != arg2) {
            class179.field2708 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class179.field2708[var3] = (var3 << 12) / arg2;
            }
            class787.field10820 = arg2 * 32;
            class407.field5754 = arg2 - 1;
            class673.field9452 = arg2;
        }
        if (class152.field2253 == arg1) {
            return;
        }
        if (class673.field9452 == arg1) {
            class619.field8728 = class179.field2708;
        } else {
            class619.field8728 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class619.field8728[var4] = (var4 << 12) / arg1;
            }
        }
        class348.field5094 = arg1 - 1;
        class152.field2253 = arg1;
    }
}
