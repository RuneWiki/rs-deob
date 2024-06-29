import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public abstract class class334 extends class219 {

    @OriginalMember(owner = "client!ne", name = "w", descriptor = "Z")
    public volatile boolean field4984 = true;

    @OriginalMember(owner = "client!ne", name = "t", descriptor = "Z")
    public static boolean field4981 = true;

    @OriginalMember(owner = "client!ne", name = "y", descriptor = "J")
    public static long field4986 = -1L;

    @OriginalMember(owner = "client!ne", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4982 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ne", name = "v", descriptor = "Z")
    public boolean field4983;

    @OriginalMember(owner = "client!ne", name = "x", descriptor = "Z")
    public boolean field4985;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
    public static void method2158(int arg0) {
        field4982 = null;
        if (arg0 != 16) {
            field4986 = -101L;
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)I")
    public abstract int method2159(int arg0);

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)[B")
    public abstract byte[] method2160(int arg0);
}
