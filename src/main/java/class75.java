import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class75 extends class427 {

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public int field1097 = (int) (class58.method427((byte) -19) / 1000L);

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "Ljava/lang/String;")
    public String field1104;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "S")
    public short field1100;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "I")
    public static int field1101 = -1;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field1103 = -1;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "F")
    public static float field1099;

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "[I")
    public static int[] field1096;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILl;Lqa;)V")
    public static final void method528(int arg0, class15 arg1, class165 arg2) {
        field1098++;
        if (class12.field209 == null) {
            return;
        }
        if (class357.field5502 < 10) {
            if (!class12.field212.method1285(class12.field209.field6644, 1)) {
                class357.field5502 = class502.field7409.method1278(class12.field209.field6644, 0) / 10;
                return;
            }
            class490.method2926((byte) -101);
            class357.field5502 = 10;
        }
        if (class357.field5502 == 10) {
            class12.field247 = class12.field209.field6650 >> 6 << 6;
            class12.field245 = class12.field209.field6646 >> 6 << 6;
            class12.field246 = (class12.field209.field6654 >> 6 << 6) + 64 - class12.field245;
            class12.field238 = (class12.field209.field6641 >> 6 << 6) + 64 - class12.field247;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class12.field209.method2666(var3, class56.field800.field1866, (class56.field800.field1862 >> 7) + class328.field5099, (byte) 42, (class56.field800.field1867 >> 7) + class331.field5162)) {
                var4 = var3[1] - class12.field247;
                var5 = var3[2] - class12.field245;
            }
            if (!class251.field3494 && var4 >= 0 && class12.field238 > var4 && var5 >= 0 && class12.field246 > var5) {
                int var6 = var5 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var4 + (int) (Math.random() * 10.0D) - 5;
                class253.field3514 = var6;
                class267.field3712 = var7;
            } else if (class501.field7398 == -1 || class194.field2596 == -1) {
                class12.field209.method2670(false, class12.field209.field6647 & 0x3FFF, class12.field209.field6647 >> 14 & 0x3FFF, var3);
                class253.field3514 = var3[2] - class12.field245;
                class267.field3712 = var3[1] - class12.field247;
            } else {
                class12.field209.method2670(false, class194.field2596, class501.field7398, var3);
                class251.field3494 = false;
                if (var3 != null) {
                    class267.field3712 = var3[1] - class12.field247;
                    class253.field3514 = var3[2] - class12.field245;
                }
                class194.field2596 = -1;
                class501.field7398 = -1;
            }
            if (class12.field209.field6653 == 37) {
                class12.field223 = 3.0F;
                class12.field224 = 3.0F;
            } else if (class12.field209.field6653 == 50) {
                class12.field223 = 4.0F;
                class12.field224 = 4.0F;
            } else if (class12.field209.field6653 == 75) {
                class12.field223 = 6.0F;
                class12.field224 = 6.0F;
            } else if (class12.field209.field6653 == 100) {
                class12.field223 = 8.0F;
                class12.field224 = 8.0F;
            } else if (class12.field209.field6653 == 200) {
                class12.field223 = 16.0F;
                class12.field224 = 16.0F;
            } else {
                class12.field223 = 8.0F;
                class12.field224 = 8.0F;
            }
            class12.field222 = (int) class12.field223 >> 1;
            class12.field217 = class384.method2405(class12.field222, (byte) -6);
            class194.method1311(0);
            class12.method132();
            class372.field5663 = new class63();
            class12.field218 += (int) (Math.random() * 5.0D) - 2;
            if (class12.field218 < -8) {
                class12.field218 = -8;
            }
            class12.field220 += (int) (Math.random() * 5.0D) - 2;
            if (class12.field218 > 8) {
                class12.field218 = 8;
            }
            if (class12.field220 < -16) {
                class12.field220 = -16;
            }
            if (class12.field220 > 16) {
                class12.field220 = 16;
            }
            class12.method117(arg1, class12.field218 >> 2 << 10, class12.field220 >> 1);
            class12.field210.method1850(1024, 256, 5);
            class12.field213.method974(256, 256, false);
            class12.field211.method1869((byte) -127, 4096);
            class102.field1481.method195(256, (byte) -112);
            class357.field5502 = 20;
        } else if (class357.field5502 == 20) {
            class316.method1986((byte) 74, true);
            class12.method133(arg2, class12.field218, class12.field220);
            class357.field5502 = 60;
            class316.method1986((byte) 74, true);
            class140.method937(98);
        } else {
            if (arg0 != 17020) {
                field1101 = -41;
            }
            if (class357.field5502 == 60) {
                if (class12.field212.method1286(0, class12.field209.field6644 + "_staticelements")) {
                    if (!class12.field212.method1285(class12.field209.field6644 + "_staticelements", 1)) {
                        return;
                    }
                    class12.field219 = class312.method1966((byte) -85, class12.field212, class414.field6307, class12.field209.field6644 + "_staticelements");
                } else {
                    class12.field219 = new class146(0);
                }
                class12.method112();
                class357.field5502 = 70;
                class316.method1986((byte) 74, true);
                class140.method937(115);
            } else if (class357.field5502 == 70) {
                class331.field5169 = new class117(arg2, 11, true, class85.field1245);
                class357.field5502 = 73;
                class316.method1986((byte) 74, true);
                class140.method937(99);
            } else if (class357.field5502 == 73) {
                class175.field2345 = new class117(arg2, 12, true, class85.field1245);
                class357.field5502 = 76;
                class316.method1986((byte) 74, true);
                class140.method937(122);
            } else if (class357.field5502 == 76) {
                class429.field6539 = new class117(arg2, 14, true, class85.field1245);
                class357.field5502 = 79;
                class316.method1986((byte) 74, true);
                class140.method937(102);
            } else if (class357.field5502 == 79) {
                class24.field354 = new class117(arg2, 17, true, class85.field1245);
                class357.field5502 = 82;
                class316.method1986((byte) 74, true);
                class140.method937(121);
            } else if (class357.field5502 == 82) {
                class370.field5640 = new class117(arg2, 19, true, class85.field1245);
                class357.field5502 = 85;
                class316.method1986((byte) 74, true);
                class140.method937(124);
            } else if (class357.field5502 == 85) {
                class323.field4676 = new class117(arg2, 22, true, class85.field1245);
                class357.field5502 = 88;
                class316.method1986((byte) 74, true);
                class140.method937(104);
            } else if (class357.field5502 == 88) {
                class112.field1564 = new class117(arg2, 26, true, class85.field1245);
                class357.field5502 = 91;
                class316.method1986((byte) 74, true);
                class140.method937(123);
            } else {
                class437.field6614 = new class117(arg2, 30, true, class85.field1245);
                class357.field5502 = 100;
                class316.method1986((byte) 74, true);
                class140.method937(123);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class75(String arg0, int arg1) {
        this.field1104 = arg0;
        this.field1100 = (short) arg1;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIB)V")
    public static final void method529(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
        field1102++;
        class362.method2311(0, arg4, arg0, arg7, arg5, true, arg2, arg6, arg3, arg1);
        if (arg8 <= 48) {
            method528(0, null, null);
        }
    }

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "(I)V")
    public static void method530(int arg0) {
        field1096 = null;
        if (arg0 != 7055) {
            field1096 = null;
        }
    }
}
