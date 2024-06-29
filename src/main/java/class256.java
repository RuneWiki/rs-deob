import java.math.BigInteger;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class256 {

    @OriginalMember(owner = "client!u", name = "b", descriptor = "I")
    public int field3955 = 0;

    @OriginalMember(owner = "client!u", name = "d", descriptor = "I")
    public int field3957 = 0;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "Z")
    public boolean field3964 = false;

    @OriginalMember(owner = "client!u", name = "j", descriptor = "I")
    public static int field3963 = 0;

    @OriginalMember(owner = "client!u", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3958 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!u", name = "c", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!u", name = "f", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!u", name = "h", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "I")
    public static int field3965;

    @OriginalMember(owner = "client!u", name = "g", descriptor = "Lll;")
    public class158 field3960;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field3954;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)V", line = 23)
    public static final void method1812(int arg0, byte arg1) {
        if (class212.field3381 == null) {
            class212.field3381 = new byte[4][104][104];
        }
        field3962++;
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class212.field3381[var2][var3][var4] = arg1;
                }
            }
        }
        if (arg0 != 104) {
            field3961 = 42;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 60)
    public static void method1813(byte arg0) {
        field3958 = null;
        if (arg0 != -69) {
            method1813((byte) 80);
        }
    }
}
