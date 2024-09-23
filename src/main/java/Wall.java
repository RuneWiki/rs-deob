import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("q")
public class Wall {

    @OriginalMember(owner = "q", name = "i", descriptor = "B")
    public byte field210;

    @OriginalMember(owner = "q", name = "a", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "q", name = "b", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "q", name = "c", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "q", name = "d", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "q", name = "e", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "q", name = "h", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "q", name = "f", descriptor = "Leb;")
    public Model field207;

    @OriginalMember(owner = "q", name = "g", descriptor = "Leb;")
    public Model field208;
}
