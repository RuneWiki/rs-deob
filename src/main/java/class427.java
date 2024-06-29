import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class427 {

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "Lkl;")
    public static class338 field5837 = new class338(5000);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "Lwi;")
    public static class357 field5838 = new class357(0, -1);

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "Z")
    public static boolean field5841 = false;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field5843 = 0;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field5842 = 0;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field5845 = 1;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field5844 = 100;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Luo;")
    public static class118 field5840;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BLbg;)V", line = 9)
    public static final void method2606(byte arg0, class242 arg1) {
        field5835++;
        if ((arg1.field3188.length - arg1.field3211) < 1) {
            return;
        }
        int var2 = arg1.method1563(-128);
        if (var2 < 0 || var2 > 1) {
            return;
        }
        if (arg0 >= -72) {
            field5842 = -24;
        }
        if (arg1.field3188.length - arg1.field3211 < 2) {
            return;
        }
        int var3 = arg1.method1587((byte) -102);
        if (var3 * 6 != arg1.field3188.length - arg1.field3211) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field3211 >= arg1.field3188.length) {
                            return;
                        }
                        var4 = arg1.method1587((byte) -102);
                        var5 = arg1.method1576((byte) 127);
                    } while (class198.field2338.length <= var4);
                } while (!class53.field618[var4]);
            } while (class18.method104(var4, (byte) -122).field1401 == '1' && (var5 < -1 || var5 > 1));
            class198.field2338[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)Lml;", line = 52)
    public static final class23 method2607(int arg0) {
        field5836++;
        class23 var1 = (class23) class228.field2881.method1844(0);
        if (var1 == null) {
            return arg0 <= 69 ? null : new class23();
        } else {
            class299.field3985--;
            return var1;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V", line = 88)
    public static void method2608(byte arg0) {
        field5840 = null;
        if (arg0 >= -24) {
            field5843 = -79;
        }
        field5837 = null;
        field5838 = null;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(II)V", line = 102)
    public static final void method2609(int arg0, int arg1) {
        field5839++;
        class365 var2 = class121.field1383;
        synchronized (class121.field1383) {
            if (arg0 >= -119) {
                field5845 = -18;
            }
            class121.field1383.method2286(arg1, (byte) 36);
        }
    }
}
