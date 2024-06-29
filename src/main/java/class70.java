import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class70 extends class306 {

    @OriginalMember(owner = "client!qk", name = "J", descriptor = "Ljava/util/Random;")
    public static Random field873 = new Random();

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field877 = 0;

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "Ljava/lang/String;")
    public static String field878 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!qk", name = "G", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!qk", name = "H", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!qk", name = "I", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "I")
    public static int field874;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field875;

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "I")
    public static int field876;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != -1546337535) {
            return (int[]) null;
        }
        field874++;
        int[] var3 = this.field4757.method903(arg0, -118);
        if (this.field4757.field1898) {
            int[][] var4 = this.method2160(0, (byte) -6, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class31.field367; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(I)V", line = 45)
    public static void method435(int arg0) {
        field873 = null;
        field878 = null;
        if (arg0 != 255) {
            field870 = -121;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ZI)V", line = 60)
    public static final void method436(boolean arg0, int arg1) {
        class352.field5612.method387(arg1, arg0);
        field876++;
        class252.field3986.method387(arg1, arg0);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I[B)Lfg;", line = 69)
    public static final class240 method437(int arg0, byte[] arg1) {
        field872++;
        if (arg0 != 255) {
            field870 = 102;
        }
        if (arg1 == null) {
            return null;
        }
        class240 var2;
        if (class272.field4317) {
            var2 = new class288(arg1, class110.field1518, class33.field392, class245.field3855, class259.field4093, class14.field145);
        } else {
            var2 = new class299(arg1, class110.field1518, class33.field392, class245.field3855, class259.field4093, class14.field145);
        }
        class99.method627(3735);
        return var2;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V", line = 89)
    public class70() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(CI)Z", line = 93)
    public static final boolean method438(char arg0, int arg1) {
        field871++;
        if (arg1 != 0) {
            method435(-36);
        }
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)[F", line = 111)
    public static final float[] method439(byte arg0) {
        float var1 = class26.method195() + class26.method193();
        field875++;
        int var2 = class26.method191();
        float var3 = (float) (var2 >> 8 & 0xFF) / 255.0F;
        class140.field2112[3] = 1.0F;
        float var4 = (float) ((var2 & 0xFF6C82) >> 16) / 255.0F;
        int var5 = 38 % ((arg0 - 59) / 59);
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class140.field2112[2] = class353.field5617[2] * var6 * var7 * var1;
        class140.field2112[1] = class353.field5617[1] * var3 * var7 * var1;
        class140.field2112[0] = class353.field5617[0] * var4 * var7 * var1;
        return class140.field2112;
    }
}
