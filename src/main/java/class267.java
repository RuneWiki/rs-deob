import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public abstract class class267 {

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3665 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "S")
    public static short field3666 = 205;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "[I")
    public static int[] field3667;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I", line = 4)
    public static int method1701(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BIILij;)Lri;", line = 12)
    public static final class98 method1702(byte arg0, int arg1, int arg2, class316 arg3) {
        field3663++;
        if (arg0 >= -38) {
            method1702((byte) -72, 52, -54, (class316) null);
        }
        byte[] var4 = arg3.method1926(0, arg2, arg1);
        return var4 == null ? null : new class98(var4);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 29)
    public static void method1703(int arg0) {
        field3667 = null;
        if (arg0 == 205) {
            field3665 = null;
        }
    }
}
