import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class146 extends class1 {

    @OriginalMember(owner = "client!w", name = "I", descriptor = "Lal;")
    public class237 field2128;

    @OriginalMember(owner = "client!w", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2132 = "cyan:";

    @OriginalMember(owner = "client!w", name = "N", descriptor = "Lik;")
    public static class267 field2133 = new class267(16);

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    public static int field2137 = -1;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "Z")
    public static boolean field2136 = false;

    @OriginalMember(owner = "client!w", name = "P", descriptor = "Ljava/lang/String;")
    public static String field2135 = "Loaded title screen";

    @OriginalMember(owner = "client!w", name = "G", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!w", name = "H", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!w", name = "J", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(B)V")
    public static final void method886(byte arg0) {
        for (int var1 = -1; var1 < class141.field2069; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class58.field918[var1];
            }
            class107 var3 = class96.field1521[var2];
            if (var3 != null) {
                class118.method751(var3.method676(-30217), var3, 64);
            }
        }
        field2131++;
        if (arg0 != -27) {
            field2135 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "f", descriptor = "(B)V")
    public static void method887(byte arg0) {
        field2135 = null;
        if (arg0 != 12) {
            field2132 = null;
        }
        field2133 = null;
        field2132 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IZLpf;III)V")
    public static final void method888(int arg0, boolean arg1, class294 arg2, int arg3, int arg4, int arg5) {
        class45.field708 = arg5;
        field2130++;
        class282.field4211 = 1;
        class98.field1549 = 10000;
        if (arg4 == 0) {
            class110.field1705 = arg2;
            class152.field2199 = arg1;
            class272.field4095 = arg3;
            class236.field3565 = arg0;
        }
    }

    @OriginalMember(owner = "client!w", name = "g", descriptor = "(B)[Lsb;")
    public static final class230[] method889(byte arg0) {
        class230[] var1 = new class230[class215.field3224];
        field2134++;
        if (arg0 != -115) {
            return null;
        }
        for (int var2 = 0; var2 < class215.field3224; var2++) {
            byte[] var3 = class10.field129[var2];
            int var4 = class82.field1312[var2] * class220.field3315[var2];
            if (class101.field1587[var2]) {
                byte[] var7 = class198.field3011[var2];
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class63.method428(class183.field2775[class94.method598(255, var3[var9])], class94.method598(-16777216, var7[var9] << 24));
                }
                var1[var2] = new class279(class162.field2494, class256.field3915, class10.field139[var2], class273.field4104[var2], class220.field3315[var2], class82.field1312[var2], var8);
            } else {
                int[] var5 = new int[var4];
                for (int var6 = 0; var6 < var4; var6++) {
                    var5[var6] = class183.field2775[class94.method598(255, var3[var6])];
                }
                var1[var2] = new class201(class162.field2494, class256.field3915, class10.field139[var2], class273.field4104[var2], class220.field3315[var2], class82.field1312[var2], var5);
            }
        }
        class82.method537(0);
        return var1;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lqa;I)V")
    public static final void method890(class153 arg0, int arg1) {
        field2127++;
        if (class270.field4058 == arg0.field2289 || arg0.field2260 == -1 || arg0.field2204 != 0 || arg0.field2237 + 1 > class276.method1829(arg0.field2260, arg1 + 29095).field3219[arg0.field2207]) {
            int var2 = arg0.field2289 - arg0.field2262;
            int var3 = class270.field4058 - arg0.field2262;
            int var4 = arg0.field2224 * 128 + (arg0.method676(-30217) * 64);
            int var5 = arg0.field2252 * 128 + (arg0.method676(-30217) * 64);
            int var6 = arg0.field2284 * 128 + (arg0.method676(-30217) * 64);
            int var7 = arg0.field2256 * 128 + (arg0.method676(-30217) * 64);
            arg0.field2234 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
            arg0.field2251 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        arg0.field2219 = 0;
        if (arg1 != 128) {
            method886((byte) 6);
        }
        if (arg0.field2293 == 0) {
            arg0.field2233 = 1024;
        }
        if (arg0.field2293 == 1) {
            arg0.field2233 = 1536;
        }
        if (arg0.field2293 == 2) {
            arg0.field2233 = 0;
        }
        if (arg0.field2293 == 3) {
            arg0.field2233 = 512;
        }
        arg0.field2273 = arg0.field2233;
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Lal;)V")
    public class146(class237 arg0) {
        this.field2128 = arg0;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
    public static final void method891(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2126++;
        int var6 = arg1 - arg5;
        int var7 = arg2 - arg0;
        if (~var6 == arg3) {
            if (var7 != 0) {
                class35.method220(arg4, arg0, (byte) 24, arg2, arg5);
            }
        } else if (var7 == 0) {
            class255.method1678(arg4, arg0, arg1, false, arg5);
        } else {
            int var8 = (var7 << 12) / var6;
            int var9 = arg0 - (arg5 * var8 >> 12);
            int var10;
            int var11;
            if (class248.field3765 > arg1) {
                var10 = class248.field3765;
                var11 = (class248.field3765 * var8 >> 12) + var9;
            } else if (arg1 <= class163.field2505) {
                var11 = arg2;
                var10 = arg1;
            } else {
                var10 = class163.field2505;
                var11 = (class163.field2505 * var8 >> 12) + var9;
            }
            int var12;
            int var13;
            if (class248.field3765 > arg5) {
                var12 = class248.field3765;
                var13 = (class248.field3765 * var8 >> 12) + var9;
            } else if (arg5 > class163.field2505) {
                var12 = class163.field2505;
                var13 = (class163.field2505 * var8 >> 12) + var9;
            } else {
                var13 = arg0;
                var12 = arg5;
            }
            if (var13 < class243.field3635) {
                var13 = class243.field3635;
                var12 = (class243.field3635 - var9 << 12) / var8;
            } else if (var13 > class118.field1782) {
                var13 = class118.field1782;
                var12 = (class118.field1782 - var9 << 12) / var8;
            }
            if (class243.field3635 > var11) {
                var10 = (class243.field3635 - var9 << 12) / var8;
                var11 = class243.field3635;
            } else if (class118.field1782 < var11) {
                var11 = class118.field1782;
                var10 = (class118.field1782 - var9 << 12) / var8;
            }
            class33.method218((byte) 116, var13, var10, var12, arg4, var11);
        }
    }
}
