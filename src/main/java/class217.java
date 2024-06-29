import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class217 {

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3453 = "";

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field3456 = 0;

    @OriginalMember(owner = "client!qh", name = "k", descriptor = "Lkf;")
    public static class193 field3459 = new class193(16);

    @OriginalMember(owner = "client!qh", name = "n", descriptor = "Z")
    public static boolean field3462 = true;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
    public int field3457;

    @OriginalMember(owner = "client!qh", name = "l", descriptor = "I")
    public int field3460;

    @OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
    public int field3461;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "Lkk;")
    public static class254 field3458;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILma;)V")
    public static final void method1514(int arg0, class202 arg1) {
        byte[] var2 = new byte[24];
        field3455++;
        if (class93.field1416 != null) {
            try {
                int var3 = 0;
                class93.field1416.method1679(0L, 0);
                class93.field1416.method1678(var2, -120);
                while (var3 < 24 && var2[var3] == 0) {
                    var3++;
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method1453(var2, arg0, 24, (byte) -12);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1515(int arg0, int arg1, int arg2, int arg3) {
        if (class147.method978(arg0, arg1, arg2)) {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            return class73.method469(var4 + 1, class242.field3842[arg0][arg1][arg2] + arg3, var5 + 1) && class73.method469(var4 + 128 - 1, class242.field3842[arg0][arg1 + 1][arg2] + arg3, var5 + 1) && class73.method469(var4 + 128 - 1, class242.field3842[arg0][arg1 + 1][arg2 + 1] + arg3, var5 + 128 - 1) && class73.method469(var4 + 1, class242.field3842[arg0][arg1][arg2 + 1] + arg3, var5 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
    public static final void method1516(byte arg0) {
        if (class67.field984 == null || class179.field2790 == null) {
            class179.field2790 = new int[256];
            class67.field984 = new int[256];
            for (int var1 = 0; var1 < 256; var1++) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class67.field984[var1] = (int) (Math.sin(var2) * 4096.0D);
                class179.field2790[var1] = (int) (Math.cos(var2) * 4096.0D);
            }
        }
        if (arg0 != 79) {
            field3456 = 46;
        }
        field3450++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(BJ)V")
    public static final void method1517(byte arg0, long arg1) {
        class276.field4572.field3272 = 0;
        field3449++;
        if (arg0 > -47) {
            field3453 = null;
        }
        class276.field4572.method1446((byte) 99, 21);
        class276.field4572.method1413(-349748560, arg1);
        class235.field3730 = 0;
        class248.field3947 = -3;
        class284.field4756 = 0;
        class52.field708 = 1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IJ[IB)Ljava/lang/String;")
    public static final String method1518(int arg0, long arg1, int[] arg2, byte arg3) {
        field3454++;
        if (arg3 != -1) {
            return null;
        }
        if (class157.field2492 != null) {
            String var5 = class157.field2492.method280(arg2, arg1, arg0, 6);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)I")
    public static final int method1519(int arg0, int arg1) {
        field3452++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAA) >>> 1);
        if (arg1 != 255) {
            method1516((byte) 25);
        }
        int var3 = ((var2 & 0xCCCCCCCE) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)V")
    public static void method1520(byte arg0) {
        if (arg0 >= -94) {
            field3453 = null;
        }
        field3458 = null;
        field3459 = null;
        field3453 = null;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static final void method1521(int arg0) {
        if (arg0 != 1) {
            method1521(35);
        }
        if (class60.field921 != null) {
            class60.field921.method1159(arg0 ^ 0x4431);
        }
        field3451++;
        if (class199.field3155 != null) {
            class199.field3155.method1159(17456);
        }
    }
}
