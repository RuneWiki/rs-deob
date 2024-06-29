import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public class class435 {

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "Ljd;")
    public static class216 field5476 = new class216(4, 1);

    @OriginalMember(owner = "client!cq", name = "c", descriptor = "Z")
    public static boolean field5478 = true;

    @OriginalMember(owner = "client!cq", name = "f", descriptor = "[S")
    public static short[] field5481 = new short[256];

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!cq", name = "d", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!cq", name = "e", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(ILji;)Lpb;", line = 13)
    public static final class613 method2393(int arg0, class572 arg1) {
        if (arg0 == 1) {
            field5480++;
            return new class613(arg1.method3086(65280), arg1.method3086(65280), arg1.method3086(arg0 + 65279), arg1.method3086(65280), arg1.method3059(1), arg1.method3059(1), arg1.method3097((byte) 12));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)V", line = 26)
    public static void method2394(byte arg0) {
        field5481 = null;
        int var1 = -25 % ((55 - arg0) / 59);
        field5476 = null;
    }

    @OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)[I", line = 37)
    public static final int[] method2395(byte arg0) {
        field5477++;
        if (arg0 >= -2) {
            field5478 = true;
        }
        return new int[] { class354.field4576, client.field3562, class303.field3837 };
    }

    @OriginalMember(owner = "client!cq", name = "a", descriptor = "(B[B)V", line = 53)
    public static final void method2396(byte arg0, byte[] arg1) {
        int var2 = -102 % ((34 - arg0) / 35);
        field5479++;
        class572 var3 = new class572(arg1);
        while (true) {
            int var4;
            label45: do {
                while (true) {
                    while (true) {
                        var4 = var3.method3097((byte) 12);
                        if (var4 == 0) {
                            return;
                        }
                        if (var4 == 1) {
                            int[] var9 = class157.field1843 = new int[6];
                            var9[0] = var3.method3031(-1);
                            var9[1] = var3.method3031(-1);
                            var9[2] = var3.method3031(-1);
                            var9[3] = var3.method3031(-1);
                            var9[4] = var3.method3031(-1);
                            var9[5] = var3.method3031(-1);
                        } else {
                            if (var4 != 4) {
                                continue label45;
                            }
                            int var7 = var3.method3097((byte) 12);
                            class440.field5536 = new int[var7];
                            for (int var8 = 0; var8 < var7; var8++) {
                                class440.field5536[var8] = var3.method3031(-1);
                                if (class440.field5536[var8] == 65535) {
                                    class440.field5536[var8] = -1;
                                }
                            }
                        }
                    }
                }
            } while (var4 != 5);
            int var5 = var3.method3097((byte) 12);
            class236.field3050 = new int[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                class236.field3050[var6] = var3.method3031(-1);
                if (class236.field3050[var6] == 65535) {
                    class236.field3050[var6] = -1;
                }
            }
        }
    }
}
