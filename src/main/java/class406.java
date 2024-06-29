import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class406 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Luw;")
    public static class208 field5384 = new class208(62, 0);

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "[I")
    public static int[] field5385 = new int[256];

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "Lgp;")
    public static class576 field5386;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field5388;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Llf;")
    public static class280 field5387;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field5385[var0] = var1;
        }
        field5386 = new class576(9, 2);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 6)
    public static void method2362(int arg0) {
        field5384 = null;
        if (arg0 != -32001) {
            method2363(13, 76);
        }
        field5386 = null;
        field5387 = null;
        field5385 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 19)
    public static final void method2363(int arg0, int arg1) {
        if (arg0 > -32) {
            return;
        }
        field5383++;
        class536 var2 = class240.field3253;
        synchronized (class240.field3253) {
            class240.field3253.method2928(true, arg1);
        }
        class536 var3 = class155.field1979;
        synchronized (class155.field1979) {
            class155.field1979.method2928(true, arg1);
        }
    }
}
