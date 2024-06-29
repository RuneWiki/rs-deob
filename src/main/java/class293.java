import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class293 extends class66 {

    @OriginalMember(owner = "client!en", name = "r", descriptor = "[B")
    public byte[] field4611;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "Lrl;")
    public static class672 field4610 = new class672(61, 2);

    @OriginalMember(owner = "client!en", name = "s", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4612 = new BigInteger("8fcaee351c9ddeee89e83539cb900251ccfabaf9bdb60114b0ebab659cff00e51217be80c6d80a5e382f52073ecff27e4c701b9508edb909ca2474d92514acc7", 16);

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V", line = 8)
    public static void method2056(int arg0) {
        field4612 = null;
        field4610 = null;
        int var1 = 93 / ((arg0 + 6) / 37);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "([B)V", line = 21)
    public class293(byte[] arg0) {
        this.field4611 = arg0;
    }
}
