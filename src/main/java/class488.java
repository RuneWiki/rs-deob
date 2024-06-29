import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class488 {

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "Lpaa;")
    public static class317 field6796 = new class317(12, 19);

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "[F")
    public static float[] field6799 = new float[16];

    @OriginalMember(owner = "client!nj", name = "c", descriptor = "I")
    public static int field6798;

    @OriginalMember(owner = "client!nj", name = "b", descriptor = "Lgw;")
    public static class140 field6797;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(I)V")
    public static void method2746(int arg0) {
        field6796 = null;
        field6799 = null;
        field6797 = null;
        if (arg0 != 8192) {
            method2746(-95);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(B)V")
    public static final void method2747(byte arg0) {
        field6798++;
        if (arg0 != -4) {
            field6797 = null;
        }
        int var1 = class174.field2248 * 512 + 256;
        int var2 = class344.field4771 * 512 + 256;
        int var3 = class341.method2147(class187.field2407, var1, 0, var2) - class34.field518;
        if (class408.field5601 >= 100) {
            class434.field5901 = class344.field4771 * 512 + 256;
            class196.field2555 = class174.field2248 * 512 + 256;
            class186.field2364 = class341.method2147(class187.field2407, class196.field2555, arg0 + 4, class434.field5901) - class34.field518;
        } else {
            if (class196.field2555 < var1) {
                class196.field2555 += (var1 - class196.field2555) * class408.field5601 / 1000 + class194.field2511;
                if (class196.field2555 > var1) {
                    class196.field2555 = var1;
                }
            }
            if (var1 < class196.field2555) {
                class196.field2555 -= class194.field2511 + ((class196.field2555 - var1) * class408.field5601 / 1000);
                if (var1 > class196.field2555) {
                    class196.field2555 = var1;
                }
            }
            if (class186.field2364 < var3) {
                class186.field2364 += (var3 - class186.field2364) * class408.field5601 / 1000 + class194.field2511;
                if (class186.field2364 > var3) {
                    class186.field2364 = var3;
                }
            }
            if (class434.field5901 < var2) {
                class434.field5901 += class194.field2511 + ((var2 - class434.field5901) * class408.field5601 / 1000);
                if (var2 < class434.field5901) {
                    class434.field5901 = var2;
                }
            }
            if (var3 < class186.field2364) {
                class186.field2364 -= class194.field2511 + ((class186.field2364 - var3) * class408.field5601 / 1000);
                if (var3 > class186.field2364) {
                    class186.field2364 = var3;
                }
            }
            if (var2 < class434.field5901) {
                class434.field5901 -= (class434.field5901 - var2) * class408.field5601 / 1000 + class194.field2511;
                if (var2 > class434.field5901) {
                    class434.field5901 = var2;
                }
            }
        }
        int var4 = class351.field4941 * 512 + 256;
        int var5 = class6.field58 * 512 + 256;
        int var6 = class341.method2147(class187.field2407, var4, 0, var5) - class84.field1139;
        int var7 = var4 - class196.field2555;
        int var8 = var6 - class186.field2364;
        int var9 = var5 - class434.field5901;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var8, (double) var10) * 2607.5945876176133D) & 0x3FFF;
        if (var11 < 1024) {
            var11 = 1024;
        }
        int var12 = (int) (Math.atan2((double) var7, (double) var9) * -2607.5945876176133D) & 0x3FFF;
        if (var11 > 3072) {
            var11 = 3072;
        }
        if (class627.field9131 < var11) {
            class627.field9131 += (var11 - class627.field9131 >> 3) * class520.field7247 / 1000 + class345.field4781 << 3;
            if (class627.field9131 > var11) {
                class627.field9131 = var11;
            }
        }
        if (var11 < class627.field9131) {
            class627.field9131 -= (class627.field9131 - var11 >> 3) * class520.field7247 / 1000 + class345.field4781 << 3;
            if (class627.field9131 < var11) {
                class627.field9131 = var11;
            }
        }
        int var13 = var12 - class60.field838;
        if (var13 > 8192) {
            var13 -= 16384;
        }
        if (var13 < -8192) {
            var13 += 16384;
        }
        int var14 = var13 >> 3;
        if (var14 > 0) {
            class60.field838 += class520.field7247 * var14 / 1000 + class345.field4781 << 3;
            class60.field838 &= 0x3FFF;
        }
        if (var14 < 0) {
            class60.field838 -= class345.field4781 + (-var14 * class520.field7247 / 1000) << 3;
            class60.field838 &= 0x3FFF;
        }
        int var15 = var12 - class60.field838;
        if (var15 > 8192) {
            var15 -= 16384;
        }
        if (var15 < -8192) {
            var15 += 16384;
        }
        class392.field5439 = 0;
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            class60.field838 = var12;
        }
    }
}
