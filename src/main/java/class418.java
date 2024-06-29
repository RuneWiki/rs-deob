import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class418 extends class115 {

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "J")
    public long field6264;

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Z")
    public static boolean field6266 = false;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "Z")
    public static boolean field6270 = false;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "Lmh;")
    public static class112 field6268;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILya;ILga;II)V", line = 5)
    public static final void method2491(int arg0, int arg1, class11 arg2, int arg3, class243 arg4, int arg5, int arg6) {
        field6269++;
        if (class507.field7449 < 100) {
            class111.method862(-24333, arg2, arg4);
        }
        arg2.method84(arg6, arg1, arg6 + arg0, arg1 - -arg3);
        if (class507.field7449 < 100) {
            byte var7 = 20;
            int var8 = arg6 + (arg0 / 2);
            arg2.method162(arg6, arg1, arg0, arg3, -16777216, 0);
            int var9 = arg3 / 2 + (arg1 - 18) - var7;
            arg2.method69(var8 - 152, var9, 304, 34, class238.field3333[class444.field6529].getRGB(), 0);
            arg2.method162(var8 - 150, var9 - -2, class507.field7449 * 3, 30, class288.field4305[class444.field6529].getRGB(), 0);
            class345.field5325.method1922(23063, -1, class90.field1408[class444.field6529].getRGB(), class143.field2156.method2103(class30.field430, (byte) 34), var8, var7 + var9);
            return;
        }
        int var10 = class170.field2508 - (int) ((float) arg0 / class137.field2026);
        int var11 = class473.field6977 + ((int) ((float) arg3 / class137.field2026));
        int var12 = (int) ((float) arg0 / class137.field2026) + class170.field2508;
        class315.field4860 = class473.field6977 - ((int) ((float) arg3 / class137.field2026));
        int var13 = class473.field6977 - (int) ((float) arg3 / class137.field2026);
        class519.field7608 = (int) ((float) (arg0 * 2) / class137.field2026);
        class504.field7418 = (int) ((float) (arg3 * arg5) / class137.field2026);
        class30.field434 = class170.field2508 - (int) ((float) arg0 / class137.field2026);
        class137.method1005(class137.field2035 + var10, class137.field2036 + var11, var12 + class137.field2035, class137.field2036 + var13, arg6, arg1, arg0 + arg6, arg1 + arg3 + 1);
        class137.method998(arg2);
        class497 var14 = class137.method997(arg2);
        class370.method2210(arg2, -29770, 0, 0, var14);
        if (class341.field5244 > 0) {
            class197.field2888--;
            if (class197.field2888 == 0) {
                class197.field2888 = 20;
                class341.field5244--;
            }
        }
        if (!class425.field6333) {
            return;
        }
        int var15 = arg6 + arg0 - 5;
        int var16 = arg1 + arg3 - 8;
        class164.field2445.method1921(var16, var15, 16776960, arg5 - 2, -1, "Fps:" + class41.field537);
        int var20 = var16 - 15;
        Runtime var17 = Runtime.getRuntime();
        int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
        int var19 = 16776960;
        if (var18 > 65536) {
            var19 = 16711680;
        }
        class164.field2445.method1921(var20, var15, var19, 0, -1, "Mem:" + var18 + "k");
        var16 = var20 - 15;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V", line = 84)
    public class418() {
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)I", line = 91)
    public static final int method2492(int arg0, byte arg1) {
        field6267++;
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg0 & 0xFF5D) >> 8) / 256.0D;
        double var6 = (double) (arg0 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var8 > var6) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        int var14 = 15 % ((arg1 + 13) / 36);
        double var15 = 0.0D;
        double var17 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var17 < 0.5D) {
                var15 = (var10 - var8) / (var8 + var10);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var10 - var8) / (2.0D - var10 - var8);
            }
        }
        double var19 = var12 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return ((var21 & 0xFF) >> 2 << 10) + (var23 >> 1) + (var22 >> 5 << 7);
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(J)V", line = 194)
    public class418(long arg0) {
        this.field6264 = arg0;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ldr;Z)V", line = 202)
    public static final void method2493(class293 arg0, boolean arg1) {
        if (!arg1) {
            field6270 = false;
        }
        arg0.method1826(30273);
        field6265++;
        int var2 = class449.field6615;
        class480 var3 = class410.field6198 = class83.field1327[var2] = new class480();
        var3.field6015 = var2;
        int var4 = arg0.method1823(30, 13255);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFD1AB) >> 14;
        int var7 = var4 & 0x3FFF;
        var3.field6065[0] = var6 - class267.field3979;
        var3.field7681 = (var3.field6065[0] << 7) + (var3.method2419((byte) 101) << 6);
        var3.field6068[0] = var7 - class241.field3358;
        var3.field7671 = (var3.field6068[0] << 7) + (var3.method2419((byte) 122) << 6);
        class521.field7651 = var3.field7686 = var5;
        if (class448.field6609[var2] != null) {
            var3.method2862(class448.field6609[var2], false);
        }
        class146.field2203 = 0;
        class457.field6694[class146.field2203++] = var2;
        class225.field3184[var2] = 0;
        class42.field550 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method1823(18, 13255);
                int var10 = var9 >> 16;
                int var11 = var9 >> 8 & 0xFF;
                int var12 = var9 & 0xFF;
                class525 var13 = class490.field7297[var8] = new class525();
                var13.field7764 = false;
                var13.field7770 = (var10 << 28) + var12 + (var11 << 14);
                var13.field7765 = 0;
                var13.field7769 = -1;
                class42.field552[class42.field550++] = var8;
                class225.field3184[var8] = 0;
            }
        }
        arg0.method1818(-119);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V", line = 274)
    public static void method2494(byte arg0) {
        int var1 = 71 % ((57 - arg0) / 45);
        field6268 = null;
    }
}
