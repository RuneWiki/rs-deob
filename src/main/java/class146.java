import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class146 extends class268 {

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field2548 = 0;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
    public static boolean field2551 = true;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "Lda;")
    public static class275 field2550 = class255.method1672(104, "gr-Un:");

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Lda;")
    private static class275 field2554 = class255.method1672(102, "Loaded title screen");

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "Lda;")
    public static class275 field2552 = class255.method1672(124, "::breakcon");

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Lda;")
    public static class275 field2556 = field2554;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)Lgi;")
    public static final class34 method1040(int arg0, int arg1) {
        class34 var2 = (class34) class34.field536.method990((long) arg1, (byte) 11);
        field2555++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class25.field410.method775(class225.method1458((byte) 4, arg1), class1.method2(false, arg1), -24799);
        class34 var4 = new class34();
        var4.field508 = arg1;
        int var5 = 117 / ((arg0 + 19) / 46);
        if (var3 != null) {
            var4.method196(new class85(var3), 81);
        }
        var4.method192(1);
        if (var4.field524) {
            var4.field553 = false;
            var4.field551 = 0;
        }
        if (!class99.field1669 && var4.field522) {
            var4.field557 = null;
        }
        class34.field536.method986(0, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(I)V")
    public static void method1041(int arg0) {
        field2556 = null;
        field2550 = null;
        field2554 = null;
        field2552 = null;
        if (arg0 != 14399) {
            method1041(127);
        }
    }

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "(II)V")
    public static final void method1042(int arg0, int arg1) {
        field2553++;
        if (arg0 == -1 || !class267.method1755(0, arg0)) {
            return;
        }
        class229[] var2 = class173.field3005[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class229 var4 = var2[var3];
            if (var4.field4017 != null) {
                class99 var5 = new class99();
                var5.field1677 = var4;
                var5.field1678 = var4.field4017;
                class139.method1002(-11704, 2000000, var5);
            }
        }
        if (arg1 <= 96) {
            method1041(46);
        }
    }
}
