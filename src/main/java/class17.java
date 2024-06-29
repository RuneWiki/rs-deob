import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class17 {

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "S")
    public static short field248 = 256;

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "Lha;")
    private static class46 field249 = class271.method1828("Members object", -46);

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "Lha;")
    public static class46 field247 = field249;

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "Z")
    public static boolean field252 = false;

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "Lha;")
    public static class46 field254 = class271.method1828("k", -46);

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "Lwf;")
    public static class16 field250 = new class16(5);

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "I")
    public static int field255 = 0;

    @OriginalMember(owner = "client!eg", name = "j", descriptor = "Lha;")
    public static class46 field256 = class271.method1828("::errortest", -46);

    @OriginalMember(owner = "client!eg", name = "e", descriptor = "I")
    public static int field251;

    @OriginalMember(owner = "client!eg", name = "g", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)V")
    public static final void method89(int arg0, int arg1) {
        class201 var2 = class111.field2080[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class201 var4 = class111.field2080[var3][arg0][arg1] = class111.field2080[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3586--;
                for (int var5 = 0; var5 < var4.field3585; var5++) {
                    class197 var6 = var4.field3600[var5];
                    if ((var6.field3523 >> 29 & 0x3L) == 2L && var6.field3541 == arg0 && var6.field3533 == arg1) {
                        var6.field3539--;
                    }
                }
            }
        }
        if (class111.field2080[0][arg0][arg1] == null) {
            class111.field2080[0][arg0][arg1] = new class201(0, arg0, arg1);
        }
        class111.field2080[0][arg0][arg1].field3595 = var2;
        class111.field2080[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IZ)I")
    public static final int method90(int arg0, boolean arg1) {
        field253++;
        long var2 = class223.method1537(-26619);
        if (arg0 != 256) {
            field250 = null;
        }
        for (class152 var4 = arg1 ? (class152) class15.field226.method1592(false) : (class152) class15.field226.method1591(arg0 - 152); var4 != null; var4 = (class152) class15.field226.method1591(62)) {
            if (var2 > (var4.field2699 & 0x3FFFFFFFFFFFFFFFL)) {
                if ((var4.field2699 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1195;
                    class29.field568[var5] = class234.field4064[var5];
                    var4.method501(0);
                    return var5;
                }
                var4.method501(0);
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(III)V")
    public static final void method91(int arg0, int arg1, int arg2) {
        if (arg0 != 6207) {
            field250 = null;
        }
        field251++;
        if (class205.field3685 != 0 && arg1 != -1) {
            class108.method840(arg1, arg0 ^ 0x183E, false, class205.field3685, 0, class112.field2125);
            class29.field572 = true;
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)V")
    public static void method92(byte arg0) {
        if (arg0 > -48) {
            field254 = null;
        }
        field250 = null;
        field249 = null;
        field254 = null;
        field256 = null;
        field247 = null;
    }
}
