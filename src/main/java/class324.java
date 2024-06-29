import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class324 {

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "[I")
    public static int[] field5000 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    public static int field5007 = 0;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field5004 = 0;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field5001 = 0;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field5002;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field5009;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "[[[B")
    public static byte[][][] field5005;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[B", line = 4)
    public static final synchronized byte[] method2247(int arg0, int arg1) {
        field5006++;
        if (arg1 == 100 && class277.field4306 > 0) {
            byte[] var2 = client.field1987[--class277.field4306];
            client.field1987[class277.field4306] = null;
            return var2;
        }
        if (arg0 <= 37) {
            field5007 = -78;
        }
        if (arg1 == 5000 && class161.field2501 > 0) {
            byte[] var3 = class111.field1671[--class161.field2501];
            class111.field1671[class161.field2501] = null;
            return var3;
        } else if (arg1 == 30000 && class39.field573 > 0) {
            byte[] var4 = class72.field1030[--class39.field573];
            class72.field1030[class39.field573] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Ljd;I)V", line = 56)
    public static final void method2248(class95 arg0, int arg1) {
        if (arg1 != 0) {
            field5000 = (int[]) null;
        }
        class303.field4634 = arg0;
        field5003++;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V", line = 68)
    public static void method2249(byte arg0) {
        if (arg0 != 59) {
            field5004 = -121;
        }
        field5005 = (byte[][][]) null;
        field5000 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Z", line = 79)
    public static final boolean method2250(int arg0) {
        field5009++;
        try {
            if (arg0 != -30552) {
                method2251(-78, (class305) null, 70);
            }
            return class305.method2095(false);
        } catch (IOException var5) {
            class299.method2061(0);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class101.field1450 + "," + class255.field3900 + "," + class51.field694 + " - " + class241.field3679 + "," + (class39.field575.field4676[0] + class327.field5054) + "," + (class39.field575.field4744[0] + class293.field4522) + " - ";
            for (int var4 = 0; var4 < class241.field3679 && var4 < 50; var4++) {
                var3 = var3 + class204.field3136.field3840[var4] + ",";
            }
            class189.method1401(true, var6, var3);
            class37.method284(0);
            return true;
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ILt;I)V", line = 112)
    public static final void method2251(int arg0, class305 arg1, int arg2) {
        field5008++;
        if (arg1.field4746 > class233.field3542) {
            class106.method791(arg1, (byte) -90);
        } else if (arg1.field4748 >= class233.field3542) {
            class13.method102(64, arg1);
        } else {
            class76.method595(false, arg1);
        }
        if (arg1.field4713 < 128 || arg1.field4731 < 128 || arg1.field4713 >= 13184 || arg1.field4731 >= 13184) {
            arg1.field4746 = 0;
            arg1.field4748 = 0;
            arg1.field4707 = -1;
            arg1.field4750 = -1;
            arg1.field4713 = arg1.field4676[0] * 128 + (arg1.method1897(8) * 64);
            arg1.field4731 = arg1.field4744[0] * 128 + (arg1.method1897(8) * 64);
            arg1.method2098(false);
        }
        if (class39.field575 == arg1 && (arg1.field4713 < 1536 || arg1.field4731 < 1536 || arg1.field4713 >= 11776 || arg1.field4731 >= 11776)) {
            arg1.field4750 = -1;
            arg1.field4748 = 0;
            arg1.field4707 = -1;
            arg1.field4746 = 0;
            arg1.field4713 = arg1.field4676[0] * 128 + (arg1.method1897(8) * 64);
            arg1.field4731 = arg1.field4744[0] * 128 + arg1.method1897(8) * 64;
            arg1.method2098(false);
        }
        class201.method1455((byte) -81, arg1);
        if (arg2 <= 54) {
            field5001 = 85;
        }
        class99.method748(106, arg1);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IJ)V", line = 163)
    public static final void method2252(int arg0, long arg1) {
        field5002++;
        if (arg0 != -24861) {
            method2249((byte) -56);
        }
        if (arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class312.method2137(arg0 ^ 0x612D, arg1 - 1L);
            class312.method2137(127, 1L);
        } else {
            class312.method2137(-118, arg1);
        }
    }
}
