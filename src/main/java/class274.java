import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class274 extends class280 {

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public int field4393 = 0;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public int field4396 = -1;

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljava/lang/String;")
    public static String field4395 = "green:";

    @OriginalMember(owner = "client!of", name = "D", descriptor = "[I")
    public static int[] field4406 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!of", name = "F", descriptor = "I")
    public static int field4408 = 0;

    @OriginalMember(owner = "client!of", name = "H", descriptor = "I")
    public static int field4410 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "I")
    public int field4391;

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field4392;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "I")
    public int field4394;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!of", name = "w", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "I")
    public int field4402;

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public int field4403;

    @OriginalMember(owner = "client!of", name = "B", descriptor = "I")
    public int field4404;

    @OriginalMember(owner = "client!of", name = "C", descriptor = "I")
    public int field4405;

    @OriginalMember(owner = "client!of", name = "E", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!of", name = "G", descriptor = "I")
    public int field4409;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "Llc;")
    public static class86 field4401;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lqi;I)V")
    public static final void method1896(class131 arg0, int arg1) {
        if (class59.field837 == arg0.field2160) {
            class190.field3070[arg0.field2037] = true;
        }
        if (arg1 != 10) {
            field4395 = null;
        }
        field4407++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)V")
    public static final void method1897(int arg0, int arg1) {
        field4400++;
        int var2 = class185.field2986;
        int var3 = class50.field736;
        int var4 = class196.field3177;
        int var5 = class67.field988;
        int var6 = (int) class190.field3068 + class296.field4679 & 0x7FF;
        int var7 = (int) class123.field1799;
        if (var7 < class177.field2866 / 256) {
            var7 = class177.field2866 / 256;
        }
        if (class156.field2574[4] && (class45.field648[4] + 128) > var7) {
            var7 = class45.field648[4] + 128;
        }
        int var8 = class218.field3485;
        class276.method1910(class210.field3370, arg1, class129.method930(class186.field2993.field1910, class186.field2993.field1979, 122, class58.field826) - 50, false, var7, var6, class25.field290, var7 * 3 + 600);
        if (class50.field736 == var3 && class185.field2986 == var2 && class196.field3177 == var4 && class67.field988 == var5 && class218.field3485 == var8) {
            class176.field2853 = 1;
            return;
        }
        class187.field3007 = 10;
        class196.field3181 = 10;
        class84.field1223 = 10;
        int var9 = class218.field3485 - var8;
        class241.field3839 = 10;
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (arg0 != 1000) {
            method1899(94, -92, 102, 127, -38);
        }
        if (class185.field2986 > var2) {
            var2 += (class185.field2986 - var2) * class84.field1223 / 1000 + class196.field3181;
            if (class185.field2986 > var2) {
                class185.field2986 = var2;
            }
        }
        if (var2 > class185.field2986) {
            int var10 = var2 - (class196.field3181 + ((var2 - class185.field2986) * class84.field1223 / 1000));
            if (var10 > class185.field2986) {
                class185.field2986 = var10;
            }
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (var3 < class50.field736) {
            var3 += class196.field3181 + ((class50.field736 - var3) * class84.field1223 / 1000);
            if (class50.field736 > var3) {
                class50.field736 = var3;
            }
        }
        if (var3 > class50.field736) {
            int var11 = var3 - ((var3 - class50.field736) * class84.field1223 / 1000 + class196.field3181);
            if (class50.field736 < var11) {
                class50.field736 = var11;
            }
        }
        if (var9 > 0) {
            int var12 = class187.field3007 + (class241.field3839 * var9 / 1000) + var8;
            var8 = var12 & 0x7FF;
        }
        if (var4 < class196.field3177) {
            var4 += (class196.field3177 - var4) * class84.field1223 / 1000 + class196.field3181;
            if (class196.field3177 > var4) {
                class196.field3177 = var4;
            }
        }
        if (var9 < 0) {
            int var13 = var8 - (-var9 * class241.field3839 / 1000 + class187.field3007);
            var8 = var13 & 0x7FF;
        }
        int var14 = class218.field3485 - var8;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (class67.field988 > var5) {
            var5 += (class67.field988 - var5) * class241.field3839 / 1000 + class187.field3007;
            if (var5 < class67.field988) {
                class67.field988 = var5;
            }
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 >= 0 || var9 <= 0 || var14 > 0 && var9 < 0) {
            class218.field3485 = var8;
        }
        if (var5 > class67.field988) {
            int var15 = var5 - ((var5 - class67.field988) * class241.field3839 / 1000 + class187.field3007);
            if (class67.field988 < var15) {
                class67.field988 = var15;
            }
        }
        if (var4 <= class196.field3177) {
            return;
        }
        int var16 = var4 - (class196.field3181 + ((var4 - class196.field3177) * class84.field1223 / 1000));
        if (class196.field3177 < var16) {
            class196.field3177 = var16;
            return;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(III)J")
    public static final long method1898(int arg0, int arg1, int arg2) {
        class286 var3 = class220.field3525[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field4541; var4++) {
            class166 var5 = var3.field4530[var4];
            if ((var5.field2683 >> 29 & 0x3L) == 2L && var5.field2678 == arg1 && var5.field2684 == arg2) {
                return var5.field2683;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIII)V")
    public static final void method1899(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class220.field3532.field2511 = 0;
        class220.field3532.method1074(20, 100);
        class220.field3532.method1074(arg3, 78);
        field4392++;
        class220.field3532.method1074(arg1, 69);
        class220.field3532.method1094(arg4 - 700885636, arg2);
        class220.field3532.method1094(-700861976, arg0);
        if (arg4 == 23660) {
            class64.field950 = -3;
            class216.field3434 = 0;
            class179.field2890 = 1;
            class213.field3409 = 0;
        }
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(B)V")
    public static void method1900(byte arg0) {
        field4395 = null;
        field4406 = null;
        if (arg0 != -95) {
            field4401 = null;
        }
        field4401 = null;
    }
}
