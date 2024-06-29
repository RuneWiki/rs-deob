import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class289 {

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[I")
    public static int[] field3996 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Z")
    public static volatile boolean field3995 = true;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "[I")
    public static int[] field3999 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[I")
    public static int[] field4000;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 8)
    public static final void method1863(byte arg0) {
        if (arg0 <= 16) {
            field3993 = 88;
        }
        class173.field2458 = new String[500];
        class395.field5773 = class235.field3194.field1025 + class235.field3194.field1015 + 2;
        field3998++;
        class216.field2869 = class204.field2769.field1025 + class204.field2769.field1015 + 2;
        for (int var1 = 0; var1 < class173.field2458.length; var1++) {
            class173.field2458[var1] = "";
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqj;ZIIIIB)V", line = 28)
    public static final void method1864(class296 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class395.field5780 = arg5;
        class399.field5832 = 1;
        field3994++;
        class410.field5952 = arg1;
        class155.field2186 = arg3;
        class227.field3031 = arg4;
        class2.field28 = arg2;
        if (arg6 != -35) {
            field3999 = null;
        }
        class202.field2761 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "(B)V", line = 51)
    public static void method1865(byte arg0) {
        if (arg0 < -126) {
            field3999 = null;
            field4000 = null;
            field3996 = null;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqj;I)V", line = 68)
    public static final void method1866(class296 arg0, int arg1) {
        field4001++;
        if (arg1 != -19253) {
            field3996 = null;
        }
        class235.field3192 = arg0;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 80)
    public static final void method1867(int arg0) {
        field3997++;
        int var1 = class389.field5658 * 128 + 64;
        int var2 = class208.field2809 * 128 + 64;
        int var3 = class279.method1698(var1, var2, class265.field3617, (byte) 3) - class235.field3196;
        if (class336.field4534 >= 100) {
            class368.field5158 = class389.field5658 * 128 + 64;
            class336.field4561 = class208.field2809 * 128 + 64;
            class34.field528 = class279.method1698(class368.field5158, class336.field4561, class265.field3617, (byte) 3) - class235.field3196;
        } else {
            if (class368.field5158 < var1) {
                class368.field5158 += (var1 - class368.field5158) * class336.field4534 / 1000 + class267.field3661;
                if (class368.field5158 > var1) {
                    class368.field5158 = var1;
                }
            }
            if (class368.field5158 > var1) {
                class368.field5158 -= (class368.field5158 - var1) * class336.field4534 / 1000 + class267.field3661;
                if (var1 > class368.field5158) {
                    class368.field5158 = var1;
                }
            }
            if (var3 > class34.field528) {
                class34.field528 += (var3 - class34.field528) * class336.field4534 / 1000 + class267.field3661;
                if (class34.field528 > var3) {
                    class34.field528 = var3;
                }
            }
            if (var3 < class34.field528) {
                class34.field528 -= (class34.field528 - var3) * class336.field4534 / 1000 + class267.field3661;
                if (var3 > class34.field528) {
                    class34.field528 = var3;
                }
            }
            if (var2 > class336.field4561) {
                class336.field4561 += class267.field3661 + ((var2 - class336.field4561) * class336.field4534 / 1000);
                if (var2 < class336.field4561) {
                    class336.field4561 = var2;
                }
            }
            if (class336.field4561 > var2) {
                class336.field4561 -= class267.field3661 + ((class336.field4561 - var2) * class336.field4534 / 1000);
                if (var2 > class336.field4561) {
                    class336.field4561 = var2;
                }
            }
        }
        int var4 = class403.field5874 * 128 + 64;
        int var5 = class350.field4886 * 128 + 64;
        int var6 = class279.method1698(var4, var5, class265.field3617, (byte) 3) - class406.field5905;
        int var7 = var4 - class368.field5158;
        int var8 = var6 - class34.field528;
        int var9 = var5 - class336.field4561;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + (var9 * var9)));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        int var12 = (int) (-2607.5945876176133D * Math.atan2((double) var7, (double) var9)) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (var11 > class356.field5020) {
            class356.field5020 += (var11 - class356.field5020 >> 3) * class405.field5890 / 1000 + class89.field1359 << 3;
            if (var11 < class356.field5020) {
                class356.field5020 = var11;
            }
        }
        if (var11 < class356.field5020) {
            class356.field5020 -= (class356.field5020 - var11 >> 3) * class405.field5890 / 1000 + class89.field1359 << 3;
            if (var11 > class356.field5020) {
                class356.field5020 = var11;
            }
        }
        int var13 = var12 - class244.field3377;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class244.field3377 += class405.field5890 * var14 / 1000 + class89.field1359 << 3;
            class244.field3377 &= 0x3FFF;
        }
        if (var14 < 0) {
            class244.field3377 -= -var14 * class405.field5890 / 1000 + class89.field1359 << 3;
            class244.field3377 &= 0x3FFF;
        }
        int var15 = var12 - class244.field3377;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (arg0 != 10526) {
            method1865((byte) -1);
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class244.field3377 = var12;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZZ)Z", line = 246)
    public static boolean method1868(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
