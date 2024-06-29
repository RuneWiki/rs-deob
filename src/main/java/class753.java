import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class class753 {

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field10525;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field10526;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZI)I", line = 7)
    public static final int method4193(boolean arg0, int arg1) {
        field10525++;
        return arg0 ? arg1 & 0x7F : 25;
    }
}
