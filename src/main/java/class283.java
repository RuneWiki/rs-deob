import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class283 {

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4554 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field4556 = 0;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lpi;")
    public static class201 field4558 = new class201(64);

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field4560 = -1;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field4555;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "[I")
    public static int[] field4559;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[[S")
    public static short[][] field4557;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Z)V")
    public static void method1954(boolean arg0) {
        field4559 = null;
        if (!arg0) {
            field4556 = 24;
        }
        field4557 = null;
        field4558 = null;
        field4554 = null;
    }
}
