import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class49 {

    @OriginalMember(owner = "client!a", name = "a", descriptor = "[I")
    public static int[] field669 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field677 = 0;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field673;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "S")
    public short field670;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Z")
    public boolean field671;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Z")
    public boolean field675;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Z")
    public boolean field676;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Z")
    public boolean field678;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZZIILdj;I)V")
    public static final void method303(boolean arg0, boolean arg1, int arg2, int arg3, class200 arg4, int arg5) {
        field679++;
        if (class195.field3109 >= 50 || arg4 == null || arg4.field3166 == null || arg3 >= arg4.field3166.length || arg4.field3166[arg3] == null) {
            return;
        }
        int var6 = arg4.field3166[arg3][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xEE) >> 5;
        int var9 = var6 & 0x1F;
        if (arg4.field3166[arg3].length > 1) {
            int var10 = (int) (Math.random() * (double) arg4.field3166[arg3].length);
            if (var10 > 0) {
                var7 = arg4.field3166[arg3][var10];
            }
        }
        if (var9 == 0) {
            if (arg1) {
                class78.method520(-1, var8, var7, 0, 255);
            }
        } else if (class19.field257 != 0) {
            class71.field1031[class195.field3109] = var7;
            class275.field4553[class195.field3109] = var8;
            if (!arg0) {
                int var11 = (arg2 - 64) / 128;
                class166.field2608[class195.field3109] = 0;
                class276.field4575[class195.field3109] = null;
                int var12 = (arg5 - 64) / 128;
                class105.field1575[class195.field3109] = 255;
                class307.field4996[class195.field3109] = (var12 << 8) + (var11 << 16) + var9;
                class195.field3109++;
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lo;")
    public static final class270 method304(int arg0, int arg1) {
        field673++;
        class270 var2 = (class270) class100.field1502.method149((byte) -46, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        if (arg0 <= 64) {
            method305(78);
        }
        byte[] var3 = class310.field5014.method1877(class292.method2042((byte) 86, arg1), class55.method325((byte) -29, arg1), (byte) 54);
        class270 var4 = new class270();
        if (var3 != null) {
            var4.method1853(-1, new class202(var3));
        }
        class100.field1502.method152(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method305(int arg0) {
        if (arg0 != -1) {
            method304(-18, 45);
        }
        field672++;
        for (class309 var1 = (class309) class258.field4233.method1959(arg0 + 206); var1 != null; var1 = (class309) class258.field4233.method1956(82)) {
            class73 var2 = var1.field5004;
            if (class165.field2600 != var2.field1066 || var2.field1065) {
                var1.method900(71);
            } else if (var2.field1077 <= class4.field32) {
                var2.method468(class247.field3938, arg0 + 21396);
                if (var2.field1065) {
                    var1.method900(arg0 ^ 0xFFFFFFD1);
                } else {
                    class121.method786(var2.field1066, var2.field1074, var2.field1057, var2.field1062, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
    public static void method306(byte arg0) {
        field669 = null;
        if (arg0 <= 49) {
            field669 = null;
        }
    }
}
