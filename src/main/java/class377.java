import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ws")
public class class377 extends class659 {

    @OriginalMember(owner = "client!ws", name = "u", descriptor = "Lsn;")
    public class655 field5494;

    @OriginalMember(owner = "client!ws", name = "t", descriptor = "Ljg;")
    public static class357 field5493 = new class357(14, 0);

    @OriginalMember(owner = "client!ws", name = "w", descriptor = "Ljg;")
    public static class357 field5496 = new class357(15, 4);

    @OriginalMember(owner = "client!ws", name = "x", descriptor = "Ljg;")
    public static class357 field5497 = new class357(16, -2);

    @OriginalMember(owner = "client!ws", name = "y", descriptor = "Ljg;")
    public static class357 field5498 = new class357(17, 0);

    @OriginalMember(owner = "client!ws", name = "z", descriptor = "Ljg;")
    public static class357 field5499 = new class357(18, -2);

    @OriginalMember(owner = "client!ws", name = "B", descriptor = "Ljg;")
    public static class357 field5500 = new class357(19, -2);

    @OriginalMember(owner = "client!ws", name = "C", descriptor = "Ljg;")
    public static class357 field5501 = new class357(22, -2);

    @OriginalMember(owner = "client!ws", name = "D", descriptor = "Ljg;")
    public static class357 field5502 = new class357(23, 4);

    @OriginalMember(owner = "client!ws", name = "E", descriptor = "Ljg;")
    public static class357 field5503 = new class357(24, -1);

    @OriginalMember(owner = "client!ws", name = "F", descriptor = "Ljg;")
    public static class357 field5504 = new class357(26, 0);

    @OriginalMember(owner = "client!ws", name = "G", descriptor = "Ljg;")
    public static class357 field5505 = new class357(27, 0);

    @OriginalMember(owner = "client!ws", name = "H", descriptor = "Ljg;")
    public static class357 field5506 = new class357(28, -2);

    @OriginalMember(owner = "client!ws", name = "I", descriptor = "[Ljg;")
    private static class357[] field5507 = new class357[32];

    @OriginalMember(owner = "client!ws", name = "J", descriptor = "Z")
    public static boolean field5508;

    @OriginalMember(owner = "client!ws", name = "K", descriptor = "[J")
    public static long[] field5509;

    @OriginalMember(owner = "client!ws", name = "L", descriptor = "I")
    public static int field5510;

    @OriginalMember(owner = "client!ws", name = "M", descriptor = "Lqj;")
    public static class535 field5511;

    @OriginalMember(owner = "client!ws", name = "r", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ws", name = "s", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ws", name = "v", descriptor = "I")
    public static int field5495;

    static {
        class357[] var0 = class87.method697(3);
        for (int var1 = 0; var1 < var0.length; var1++) {
            field5507[var0[var1].field5208] = var0[var1];
        }
        field5508 = false;
        field5509 = new long[256];
        field5510 = 0;
        for (int var2 = 0; var2 < 256; var2++) {
            long var3 = (long) var2;
            for (int var5 = 0; var5 < 8; var5++) {
                if ((var3 & 0x1L) == 1L) {
                    var3 = var3 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var3 >>>= 0x1;
                }
            }
            field5509[var2] = var3;
        }
        field5511 = new class535(8);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(ILqba;Z)V", line = 4)
    public static final void method2361(int arg0, class425 arg1, boolean arg2) {
        field5495++;
        int var3 = -1;
        int var4 = 0;
        if (arg1.field6165 > class572.field7788) {
            class565.method3219(8192, arg1);
        } else if (arg1.field6104 >= class572.field7788) {
            class638.method3512(-127, arg1);
        } else {
            class747.method4090(false, arg1, (byte) -94);
            var4 = class605.field8206;
            var3 = class279.field4037;
        }
        if (arg1.field2802 < 512 || arg1.field2810 < 512 || (class102.field1467 - 1) * 512 <= arg1.field2802 || (class393.field5663 * 512 - 512) <= arg1.field2810) {
            var4 = 0;
            arg1.field6104 = 0;
            arg1.field6179 = null;
            arg1.field6138 = -1;
            var3 = -1;
            arg1.field6165 = 0;
            arg1.field2802 = arg1.field6198[0] * 512 + (arg1.method2563(-12840) * 256);
            arg1.field2810 = arg1.field6197[0] * 512 + arg1.method2563(-12840) * 256;
            arg1.method2565(50);
            for (int var5 = 0; var5 < arg1.field6110.length; var5++) {
                arg1.field6110[var5].field1549 = -1;
            }
        }
        if (class625.field8475 == arg1 && (arg1.field2802 < 6144 || arg1.field2810 < 6144 || (class102.field1467 * 512 - 6144) <= arg1.field2802 || arg1.field2810 >= ((class393.field5663 - 12) * 512))) {
            arg1.field6104 = 0;
            var3 = -1;
            arg1.field6165 = 0;
            var4 = 0;
            arg1.field6138 = -1;
            arg1.field6179 = null;
            arg1.field2802 = arg1.field6198[0] * 512 + arg1.method2563(-12840) * 256;
            arg1.field2810 = arg1.field6197[0] * 512 + arg1.method2563(-12840) * 256;
            arg1.method2565(119);
            for (int var6 = 0; var6 < arg1.field6110.length; var6++) {
                arg1.field6110[var6].field1549 = -1;
            }
        }
        int var7 = class265.method1779((byte) -123, arg1);
        class751.method4101(arg1, (byte) 50);
        class208.method1358(false, var4, var7, arg1, var3);
        class249.method1560(var3, arg2, arg1);
        class142.method991(arg1, -24118);
    }

    @OriginalMember(owner = "client!ws", name = "a", descriptor = "(BI)I", line = 86)
    public static final int method2362(byte arg0, int arg1) {
        if (arg0 != -54) {
            method2361(80, null, true);
        }
        field5492++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lsn;)V", line = 99)
    public class377(class655 arg0) {
        this.field5494 = arg0;
    }

    @OriginalMember(owner = "client!ws", name = "d", descriptor = "(B)V", line = 108)
    public static void method2363(byte arg0) {
        field5505 = null;
        field5498 = null;
        field5511 = null;
        field5502 = null;
        field5503 = null;
        field5496 = null;
        field5501 = null;
        int var1 = 73 % ((arg0 - 57) / 53);
        field5499 = null;
        field5506 = null;
        field5509 = null;
        field5493 = null;
        field5500 = null;
        field5507 = null;
        field5504 = null;
        field5497 = null;
    }
}
