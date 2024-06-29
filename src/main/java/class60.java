import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class60 {

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field963 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "Lqp;")
    public static class438 field965;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "[[[Z")
    public static boolean[][][] field964;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)J", line = 4)
    public static final synchronized long method371(boolean arg0) {
        field962++;
        if (arg0) {
            method371(false);
        }
        long var1 = System.currentTimeMillis();
        if (class618.field8953 > var1) {
            class78.field1280 += class618.field8953 - var1;
        }
        class618.field8953 = var1;
        return var1 + class78.field1280;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V", line = 28)
    public static void method372(byte arg0) {
        int var1 = -96 / ((arg0 - 44) / 54);
        field963 = null;
        field964 = null;
        field965 = null;
    }
}
