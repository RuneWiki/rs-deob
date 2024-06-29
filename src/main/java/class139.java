import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class139 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "Lvl;")
    public static class73 field1997;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Lvl;")
    public static class73 field1998;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZI)V")
    public static final void method876(int arg0, boolean arg1, int arg2) {
        field1999++;
        if (class180.field2826 != arg2) {
            class5.field73 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class5.field73[var3] = (var3 << 12) / arg2;
            }
            class180.field2826 = arg2;
            class232.field3751 = arg2 * 32;
            class277.field4503 = arg2 - 1;
        }
        if (!arg1 || class4.field61 == arg0) {
            return;
        }
        if (class180.field2826 == arg0) {
            class235.field3797 = class5.field73;
        } else {
            class235.field3797 = new int[arg0];
            for (int var4 = 0; var4 < arg0; var4++) {
                class235.field3797[var4] = (var4 << 12) / arg0;
            }
        }
        class285.field4611 = arg0 - 1;
        class4.field61 = arg0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
    public static void method877(int arg0) {
        if (arg0 < 42) {
            method876(64, false, -71);
        }
        field1998 = null;
        field1997 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Ldh;)V")
    public static final void method878(class158 arg0) {
        for (int var1 = arg0.field2352; var1 <= arg0.field2368; var1++) {
            for (int var2 = arg0.field2359; var2 <= arg0.field2363; var2++) {
                class113 var3 = class184.field2892[arg0.field2366][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1646; var4++) {
                        if (var3.field1634[var4] == arg0) {
                            var3.field1646--;
                            for (int var5 = var4; var5 < var3.field1646; var5++) {
                                var3.field1634[var5] = var3.field1634[var5 + 1];
                                var3.field1638[var5] = var3.field1638[var5 + 1];
                            }
                            var3.field1634[var3.field1646] = null;
                            break;
                        }
                    }
                    var3.field1637 = 0;
                    for (int var6 = 0; var6 < var3.field1646; var6++) {
                        var3.field1637 |= var3.field1638[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)Lnh;")
    public static final class108 method879(byte arg0, int arg1) {
        field2001++;
        if (arg0 != 57) {
            return null;
        }
        class108 var2 = (class108) class274.field4457.method1517((long) arg1, (byte) 43);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class66.field981.method501(arg0 - 59, arg1, 4);
        class108 var4 = new class108();
        if (var3 != null) {
            var4.method721(new class170(var3), (byte) -77, arg1);
        }
        class274.field4457.method1518(var4, (long) arg1, (byte) 75);
        return var4;
    }
}
