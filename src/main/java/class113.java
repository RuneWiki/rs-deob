import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class113 extends class329 {

    @OriginalMember(owner = "client!vp", name = "o", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!vp", name = "p", descriptor = "I")
    public int field1475;

    @OriginalMember(owner = "client!vp", name = "s", descriptor = "I")
    public int field1478;

    @OriginalMember(owner = "client!vp", name = "l", descriptor = "[I")
    public int[] field1471;

    @OriginalMember(owner = "client!vp", name = "n", descriptor = "[I")
    public int[] field1473;

    @OriginalMember(owner = "client!vp", name = "q", descriptor = "[I")
    public int[] field1476;

    @OriginalMember(owner = "client!vp", name = "k", descriptor = "[Lvfa;")
    public class264[] field1470;

    @OriginalMember(owner = "client!vp", name = "r", descriptor = "[Lvfa;")
    public class264[] field1477;

    @OriginalMember(owner = "client!vp", name = "m", descriptor = "[[[B")
    public byte[][][] field1472;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)V")
    public static final void method629(int arg0) {
        field1474++;
        class436.field5446 = -1;
        class309.field3946 = -1;
        class135.field1758 = arg0;
    }

    static {
        new class372("", 73);
    }
}
