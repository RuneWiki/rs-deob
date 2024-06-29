import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class384 {

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4841 = new BigInteger("a9ef8d9b9a57ae01e455deaa04bf8b2cec7bb5fe55b0f9613440ce793c1e1a35573cc8634a5a8748065e0fa72700b18d669bdb958ed4dd985c14b675f4e98c8b", 16);

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field4844 = 1;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field4837;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field4843;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "[B")
    public byte[] field4839;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "[S")
    public short[] field4838;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "[S")
    public short[] field4840;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[S")
    public short[] field4842;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public static void method2071(int arg0) {
        field4841 = null;
        int var1 = 89 % ((arg0 + 4) / 33);
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method2072(String arg0, int arg1) {
        field4837++;
        int var2 = arg0.length();
        if (arg1 != 16) {
            return null;
        } else if (var2 == 0) {
            return new byte[0];
        } else {
            int var3 = var2 + 3 & 0xFFFFFFFC;
            int var4 = var3 / 4 * 3;
            if (var3 - 2 >= var2 || class502.method2702(-1, arg0.charAt(var3 - 2)) == -1) {
                var4 -= 2;
            } else if (var2 <= (var3 - 1) || class502.method2702(arg1 ^ 0xFFFFFFEF, arg0.charAt(var3 - 1)) == -1) {
                var4--;
            }
            byte[] var5 = new byte[var4];
            class670.method3765(arg1 - 17, arg0, 0, var5);
            return var5;
        }
    }
}
