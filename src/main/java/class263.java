import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class263 extends class161 {

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "[B")
    public byte[] field4639;

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "[I")
    public static int[] field4640 = new int[64];

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "[S")
    public static short[] field4641 = new short[256];

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lp;")
    public static class280 field4644 = class18.method140((byte) -127, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Z")
    public static boolean field4647 = false;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "Lp;")
    public static class280 field4642 = class18.method140((byte) -125, "rouge:");

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field4643;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field4646;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "I")
    public static int field4648;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "Ltg;")
    public static class180 field4645;

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "([B)V")
    public class263(byte[] arg0) {
        this.field4639 = arg0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ZI)V")
    public static final void method1779(boolean arg0, int arg1) {
        field4646++;
        class253.field4441 = 1;
        class115.field2092 = -1;
        class268.field4707 = null;
        class102.field1654 = arg0;
        class222.field3849 = 0;
        class181.field3168 = -1;
        class275.field4780 = arg1;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(BII)I")
    public static final int method1780(byte arg0, int arg1, int arg2) {
        field4643++;
        int var3 = 113 % ((arg0 + 33) / 41);
        int var4 = class180.method1245(arg1 - 1, arg2 + -1, false) - (-class180.method1245(arg1 + 1, arg2 + -1, false) - class180.method1245(arg1 - 1, arg2 + 1, false) - class180.method1245(arg1 + 1, arg2 + 1, false));
        int var5 = class180.method1245(arg1 - 1, arg2, false) + (class180.method1245(arg1 + 1, arg2, false) + class180.method1245(arg1, arg2 - 1, false) + class180.method1245(arg1, arg2 + 1, false));
        int var6 = class180.method1245(arg1, arg2, false);
        return var6 / 4 + var4 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)I")
    public static final int method1781(byte arg0) {
        field4648++;
        try {
            if (class94.field1525 == 0) {
                if (class2.field90 > class77.method569((byte) 39) - 5000L) {
                    return 0;
                }
                class83.field1372 = class118.field2117.method1358(class86.field1426, -118, class208.field3592);
                class192.field3373 = class77.method569((byte) -123);
                class94.field1525 = 1;
            }
            if (class192.field3373 + 30000L < class77.method569((byte) 93)) {
                return class222.method1492(1000, -1);
            }
            if (class94.field1525 == 1) {
                if (class83.field1372.field3025 == 2) {
                    return class222.method1492(1001, -1);
                }
                if (class83.field1372.field3025 != 1) {
                    return -1;
                }
                class44.field727 = new class227((Socket) class83.field1372.field3028, class118.field2117);
                class83.field1372 = null;
                class34.field627.field481 = 0;
                int var1 = 0;
                if (class36.field655) {
                    var1 = class89.field1439;
                }
                class34.field627.method227(-20435, 93);
                class34.field627.method231(11510, var1);
                class44.field727.method1526(class34.field627.field481, -104, 0, class34.field627.field475);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                int var2 = class44.field727.method1529(0);
                if (class4.field118 != null) {
                    class4.field118.method85(7);
                }
                if (class250.field4391 != null) {
                    class250.field4391.method85(7);
                }
                if (var2 != 0) {
                    return class222.method1492(var2, -1);
                }
                class94.field1525 = 2;
            }
            if (class94.field1525 == 2) {
                if (class44.field727.method1525(5000) < 2) {
                    return -1;
                }
                class215.field3703 = class44.field727.method1529(0);
                class215.field3703 <<= 0x8;
                class215.field3703 += class44.field727.method1529(0);
                class62.field1017 = new byte[class215.field3703];
                class76.field1247 = 0;
                class94.field1525 = 3;
            }
            int var3 = 116 / ((arg0 - 64) / 50);
            if (class94.field1525 != 3) {
                return -1;
            }
            int var4 = class44.field727.method1525(5000);
            if (var4 < 1) {
                return -1;
            }
            if (var4 > class215.field3703 - class76.field1247) {
                var4 = class215.field3703 - class76.field1247;
            }
            class44.field727.method1528(class76.field1247, var4, (byte) 99, class62.field1017);
            class76.field1247 += var4;
            if (class76.field1247 < class215.field3703) {
                return -1;
            } else if (class116.method839(113, class62.field1017)) {
                class96.field1534 = new class2[class60.field976];
                int var5 = 0;
                for (int var6 = class248.field4348; var6 <= class51.field833; var6++) {
                    class2 var7 = class180.method1242(var6, 93);
                    if (var7 != null) {
                        class96.field1534[var5++] = var7;
                    }
                }
                class44.field727.method1532(75);
                class62.field1017 = null;
                class94.field1525 = 0;
                class44.field727 = null;
                class254.field4450 = 0;
                class2.field90 = class77.method569((byte) 17);
                return 0;
            } else {
                return class222.method1492(1002, -1);
            }
        } catch (IOException var8) {
            return class222.method1492(1003, -1);
        }
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(I)V")
    public static void method1782(int arg0) {
        field4644 = null;
        field4642 = null;
        field4645 = null;
        field4641 = null;
        field4640 = null;
        int var1 = 123 % ((arg0 - 81) / 41);
    }
}
