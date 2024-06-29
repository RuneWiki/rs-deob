import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public class class259 extends class45 {

    @OriginalMember(owner = "client!hb", name = "s", descriptor = "I")
    public static int field4360 = -1;

    @OriginalMember(owner = "client!hb", name = "p", descriptor = "F")
    public static float field4357 = 0.0F;

    @OriginalMember(owner = "client!hb", name = "u", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
    public int field4358;

    @OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)I", line = 17)
    public static final int method1982(int arg0, int arg1, int arg2) {
        field4359++;
        int var3 = class125.method978(arg0 - 23566, arg1 + -1, arg2 - 1) - (-class125.method978(arg0 ^ 0x5C3F, arg1 - 1, arg2 - -1) - class125.method978(93, arg1 + 1, arg2 + -1) - class125.method978(58, arg1 + 1, arg2 + 1));
        int var4 = class125.method978(127, arg1, arg2 - 1) - (-class125.method978(58, arg1, arg2 + 1) - class125.method978(arg0 ^ 0x5C05, arg1 - 1, arg2)) + class125.method978(120, arg1 - -1, arg2);
        int var5 = class125.method978(arg0 - 23510, arg1, arg2);
        if (arg0 != 23633) {
            method1982(-12, -104, 85);
        }
        return var3 / 16 + var4 / 8 + var5 / 4;
    }
}
