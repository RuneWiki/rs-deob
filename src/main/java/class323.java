import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class323 extends class333 {

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "I")
    public int field3967 = -1;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "I")
    public int field3972 = 0;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field3974 = 0;

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "Z")
    public static boolean field3980 = false;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "I")
    public int field3968;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public int field3969;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public int field3970;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    public int field3971;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public int field3973;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    public int field3975;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "I")
    public int field3976;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    public int field3977;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public int field3978;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public int field3979;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)I")
    public static final int method1826(int arg0, int arg1) {
        return class559.field7988 == null ? 0 : class559.field7988[arg0][arg1] & 0xFF;
    }
}
