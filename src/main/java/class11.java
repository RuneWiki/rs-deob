import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class11 {

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field107 = -1;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "Lpr;")
    public static class407 field110 = new class407(35, -1);

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "[B")
    public byte[] field109;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "[S")
    public short[] field106;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "[S")
    public short[] field108;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "[S")
    public short[] field112;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Z)V")
    public static void method58(boolean arg0) {
        field110 = null;
        if (arg0) {
            method58(true);
        }
    }
}
