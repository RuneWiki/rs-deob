import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class34 {

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "[[I")
    public static int[][] field417 = new int[6][];

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "Z")
    public static boolean field421 = false;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method308(byte arg0) {
        if (arg0 != 32) {
            method308((byte) 4);
        }
        field417 = null;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BII)I")
    public static final int method309(byte arg0, int arg1, int arg2) {
        field422++;
        if (arg0 == -120) {
            int var3 = arg2 * 57 + arg1;
            int var4 = var3 ^ var3 << 13;
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return var5 >> 19 & 0xFF;
        } else {
            return 57;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BLac;)Lob;")
    public static final class687 method310(byte arg0, class501 arg1) {
        field418++;
        class282 var2 = class36.method314(-23765, arg1);
        int var3 = arg1.method2866(arg0 - 8131);
        if (arg0 != -23) {
            field421 = false;
        }
        return new class687(var2.field3853, var2.field3851, var2.field3850, var2.field3849, var2.field3857, var3);
    }
}
