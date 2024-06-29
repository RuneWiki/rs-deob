import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class498 extends class270 {

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "S")
    public short field7187;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field7186;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field7188;

    @OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
    public static int field7191;

    @OriginalMember(owner = "client!ea", name = "q", descriptor = "Llq;")
    public static class504 field7190;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    public static int[] field7189;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[B", line = 5)
    public static final byte[] method2863(int arg0, int arg1) {
        field7191++;
        class415 var2 = (class415) class343.field4455.method2134(arg1 - 719, (long) arg0);
        if (arg1 != 0) {
            return null;
        }
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class252.method1448(var4, var7, (byte) 50);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class415(var3);
            class343.field4455.method2129((byte) 105, var2, (long) arg0);
        }
        return var2.field5510;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)Z", line = 62)
    public static final boolean method2864(int arg0, int arg1, int arg2) {
        if (arg1 != -256) {
            field7189 = null;
        }
        field7188++;
        return class431.method2307(arg0, arg2, (byte) 97) | (arg2 & 0x40000) != 0 || class270.method1523(arg0, arg2, -4);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V", line = 73)
    public static void method2865(int arg0) {
        field7190 = null;
        field7189 = null;
        int var1 = -23 / ((44 - arg0) / 40);
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V", line = 84)
    public class498() {
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(S)V", line = 86)
    public class498(short arg0) {
        this.field7187 = arg0;
    }
}
