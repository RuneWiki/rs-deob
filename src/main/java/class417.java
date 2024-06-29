import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class417 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "Liu;")
    public static class517 field6139 = new class517(8, 2);

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field6142 = 0;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field6144 = 0;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "Lro;")
    public static class161 field6143 = new class161();

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "I")
    public static int field6141;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field6145;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BC)Z")
    public static final boolean method2512(byte arg0, char arg1) {
        field6145++;
        if (arg0 <= 79) {
            method2513((byte) 122, -116, 77);
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(BII)Z")
    public static final boolean method2513(byte arg0, int arg1, int arg2) {
        if (arg0 >= -66) {
            return true;
        } else {
            field6140++;
            return (arg1 & 0x70000) != 0 | class265.method1683(arg1, arg2, false) || class343.method2094(arg1, arg2, (byte) 56);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V")
    public static final void method2514(int arg0) {
        for (int var1 = 0; var1 < class128.field2098; var1++) {
            int var3 = class591.field8401[var1];
            class181 var4 = (class181) class432.field6368.method740(0, (long) var3);
            if (var4 != null) {
                class170 var5 = var4.field2623;
                class139.method1044(var5, var5.field2492.field6337, -26587);
            }
        }
        field6141++;
        int var2 = 57 / ((28 - arg0) / 49);
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(I)V")
    public static void method2515(int arg0) {
        if (arg0 != -46) {
            method2516();
        }
        field6143 = null;
        field6139 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "()V")
    public static final void method2516() {
        class330.method2044(1, class146.field2246);
    }
}
