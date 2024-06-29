import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class48 extends class55 {

    @OriginalMember(owner = "client!i", name = "R", descriptor = "Lo;")
    public static class84 field1001 = class15.method124("Enter your username (V password)3", 255);

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field1003 = -1;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Lqc;")
    public static class97 field998 = new class97(10);

    @OriginalMember(owner = "client!i", name = "Y", descriptor = "Lqc;")
    public static class97 field1008 = new class97(64);

    @OriginalMember(owner = "client!i", name = "ab", descriptor = "Lo;")
    public static class84 field1010 = class15.method124(")3", 255);

    @OriginalMember(owner = "client!i", name = "bb", descriptor = "Lo;")
    public static class84 field1011 = class15.method124("compass", 255);

    @OriginalMember(owner = "client!i", name = "S", descriptor = "B")
    public byte field1002;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!i", name = "W", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!i", name = "Z", descriptor = "Lud;")
    public static class118 field1009;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "Lad;")
    public class5 field1004;

    @OriginalMember(owner = "client!i", name = "X", descriptor = "Lp;")
    public static class89 field1007;

    @OriginalMember(owner = "client!i", name = "cb", descriptor = "Lbb;")
    public static class9 field1012;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIZIIII)V", line = 4)
    public static final void method410(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field999++;
        int var7 = 2048 - arg1 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg4 & 0x7FF;
        int var10 = 0;
        if (!arg2) {
            method411(-40);
        }
        int var11 = arg6;
        if (var9 != 0) {
            int var12 = class83.field1835[var9];
            int var13 = class83.field1857[var9];
            int var14 = var10 * var13 - arg6 * var12 >> 16;
            var11 = var10 * var12 + arg6 * var13 >> 16;
            var10 = var14;
        }
        if (var7 != 0) {
            int var15 = class83.field1835[var7];
            int var16 = class83.field1857[var7];
            int var17 = var8 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var8 * var15 >> 16;
            var8 = var17;
        }
        class41.field836 = arg4;
        class99.field2103 = arg5 - var10;
        class17.field313 = arg0 - var11;
        class57.field1176 = arg3 - var8;
        class33.field655 = arg1;
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V", line = 64)
    public static void method411(int arg0) {
        field1011 = null;
        field1010 = null;
        field1012 = null;
        field1007 = null;
        field1009 = null;
        field998 = null;
        field1008 = null;
        field1001 = null;
        if (arg0 != -5361) {
            method411(-54);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lsb;", line = 81)
    public static final class106 method412(int arg0, int arg1) {
        int var2 = -117 / ((10 - arg0) / 57);
        class106 var3 = (class106) class4.field53.method737((long) arg1, (byte) -92);
        field1000++;
        if (var3 != null) {
            return var3;
        }
        class106 var4 = class127.method987(false, class44.field877, 32214, class104.field2203, arg1);
        if (var4 != null) {
            class4.field53.method744(-123, (long) arg1, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!i", name = "g", descriptor = "(I)V", line = 121)
    public static final void method413(int arg0) {
        short var1 = 256;
        for (int var2 = 10; var2 < 117; var2++) {
            int var17 = (int) (Math.random() * 100.0D);
            if (var17 < 50) {
                class123.field2761[var2 + (var1 - 2 << 7)] = 255;
            }
        }
        for (int var3 = 0; var3 < 100; var3++) {
            int var14 = (int) (Math.random() * 128.0D) + 128;
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = var15 + (var14 << 7);
            class123.field2761[var16] = 192;
        }
        for (int var4 = 1; var4 < var1 - 1; var4++) {
            for (int var12 = 1; var12 < 127; var12++) {
                int var13 = (var4 << 7) + var12;
                class1.field1[var13] = (class123.field2761[var13 + 1] + class123.field2761[var13 - 1] + class123.field2761[var13 - 128] + class123.field2761[var13 + 128]) / 4;
            }
        }
        if (arg0 < 41) {
            method413(-38);
        }
        class4.field59 += 128;
        if (class17.field299.length < class4.field59) {
            class4.field59 -= class17.field299.length;
            int var5 = (int) (Math.random() * 12.0D);
            class30.method265(true, class58.field1199[var5]);
        }
        field1006++;
        for (int var6 = 1; var6 < var1 - 1; var6++) {
            for (int var9 = 1; var9 < 127; var9++) {
                int var10 = (var6 << 7) + var9;
                int var11 = class1.field1[var10 + 128] - class17.field299[class17.field299.length - 1 & var10 - -class4.field59] / 5;
                if (var11 < 0) {
                    var11 = 0;
                }
                class123.field2761[var10] = var11;
            }
        }
        for (int var7 = 0; var7 < var1 - 1; var7++) {
            class39.field755[var7] = class39.field755[var7 + 1];
        }
        class39.field755[var1 - 1] = (int) (Math.sin((double) class128.field2837 / 14.0D) * 16.0D + Math.sin((double) class128.field2837 / 15.0D) * 14.0D + Math.sin((double) class128.field2837 / 16.0D) * 12.0D);
        if (class106.field2247 > 0) {
            class106.field2247 -= 4;
        }
        if (class58.field1193 > 0) {
            class58.field1193 -= 4;
        }
        if (class106.field2247 != 0 || class58.field1193 != 0) {
            return;
        }
        int var8 = (int) (Math.random() * 2000.0D);
        if (var8 == 0) {
            class106.field2247 = 1024;
        }
        if (var8 == 1) {
            class58.field1193 = 1024;
            return;
        }
    }
}
