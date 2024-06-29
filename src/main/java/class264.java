import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class264 {

    @OriginalMember(owner = "client!i", name = "b", descriptor = "Lhh;")
    public static class163 field4589 = class137.method1065("Verbindung mit Update)2Server)3)3)3", 17);

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lhh;")
    public static class163 field4590 = class137.method1065(":duelfriend:", 17);

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field4591 = 0;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "[I")
    public static int[] field4588 = new int[99];

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "[[B")
    public static byte[][] field4593;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(ILqh;)V")
    public static final void method1781(int arg0, class69 arg1) {
        if (arg0 != 99) {
            method1781(-5, (class69) null);
        }
        class69 var2 = class67.method470(arg1, 4223);
        field4592++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class233.field4160;
            var4 = class205.field3706;
        } else {
            var4 = var2.field1220;
            var3 = var2.field1183;
        }
        class31.method187(var4, false, arg1, -2, var3);
        class217.method1539(arg1, var4, 93, var3);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Lhh;Lhh;Lhh;II)V")
    public static final void method1782(class163 arg0, class163 arg1, class163 arg2, int arg3, int arg4) {
        field4594++;
        class260.method1758(arg0, arg3, arg2, false, arg4, arg1);
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method1783(int arg0) {
        field4588 = null;
        field4593 = null;
        field4589 = null;
        if (arg0 <= 56) {
            field4590 = null;
        }
        field4590 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Z")
    public static final boolean method1784(int arg0, int arg1) {
        if (arg0 != 0) {
            method1784(98, -34);
        }
        field4595++;
        return (arg1 >> 28 & 0x1) != 0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4588[var1] = var0 / 4;
        }
    }
}
