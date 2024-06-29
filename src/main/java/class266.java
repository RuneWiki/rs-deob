import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class266 {

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "B")
    public byte field4268;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "B")
    public byte field4270;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "B")
    public byte field4271;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "B")
    public byte field4279;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "B")
    public byte field4281;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "B")
    public byte field4283;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "B")
    public byte field4285;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field4286;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "S")
    public short field4284;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
    public boolean field4267;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "Z")
    public boolean field4269;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "Z")
    public boolean field4273;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "Z")
    public boolean field4274;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "Z")
    public boolean field4275;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "Z")
    public boolean field4277;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "Z")
    public boolean field4278;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "Z")
    public boolean field4280;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
    public boolean field4282;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ICI)I")
    public static final int method1814(int arg0, char arg1, int arg2) {
        field4272++;
        if (arg0 != -14775) {
            return -97;
        }
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg1 == 'ñ' && arg2 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
    public static final int method1815(int arg0, int arg1, int arg2) {
        field4276++;
        int var3 = class62.method403(8897, arg1 - 1, arg2 + -1) + class62.method403(arg0 + 8898, arg1 + 1, arg2 - 1) + (class62.method403(8897, arg1 + -1, arg2 + 1) - -class62.method403(8897, arg1 + 1, arg2 + 1));
        int var4 = class62.method403(arg0 ^ 0xFFFFDD3E, arg1 - 1, arg2) + class62.method403(8897, arg1 + 1, arg2) + class62.method403(8897, arg1, arg2 - 1) + class62.method403(8897, arg1, arg2 - arg0);
        int var5 = class62.method403(arg0 + 8898, arg1, arg2);
        return var5 / 4 + var3 / 16 + var4 / 8;
    }
}
