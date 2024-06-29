import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class365 {

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field5181;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public int field5182;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public int field5183;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)Z")
    public static final boolean method2195(int arg0) {
        if (arg0 != -6021) {
            method2195(-32);
        }
        field5181++;
        return class582.field8375 != 0;
    }
}
