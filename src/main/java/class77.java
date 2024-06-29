import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class77 {

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field1706 = 0;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lvc;")
    private static class137 field1709 = class45.method325("Please remove ", -46);

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Lvc;")
    public static class137 field1705 = field1709;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Lvc;")
    public static class137 field1710 = class45.method325("hitmarks", -46);

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lvc;")
    public static class137 field1707 = field1709;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "Lvc;")
    private static class137 field1714 = class45.method325("Account locked as we suspect it has been stolen)3", -46);

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "Z")
    public static boolean field1718 = false;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "Lvc;")
    public static class137 field1715 = field1714;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "I")
    public static int field1712 = 0;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lvc;")
    public static class137 field1719 = class45.method325("mapfunction", -46);

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "Lvc;")
    private static class137 field1720 = class45.method325(" is already on your ignore list", -46);

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lvc;")
    public static class137 field1716 = field1720;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field1713;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
    public static int method571(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
    public static void method572(int arg0) {
        field1716 = null;
        field1720 = null;
        if (arg0 >= -39) {
            method572(10);
        }
        field1715 = null;
        field1709 = null;
        field1707 = null;
        field1714 = null;
        field1705 = null;
        field1710 = null;
        field1719 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lnb;BLnb;Lnb;)V")
    public static final void method573(class88 arg0, byte arg1, class88 arg2, class88 arg3) {
        class127.field2995 = arg2;
        class122.field2843 = arg3;
        field1711++;
        class75.field1698 = arg0;
        if (arg1 != -90) {
            field1712 = 23;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
    public static final void method574(int arg0) {
        if (arg0 != 5997) {
            field1716 = null;
        }
        while (class103.field2391.method846(46, class68.field1399) >= 11) {
            int var1 = class103.field2391.method847(11, (byte) 60);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class102.field2358[var1] == null) {
                class102.field2358[var1] = new class125();
                var2 = true;
                if (class78.field1737[var1] != null) {
                    class102.field2358[var1].method938(class78.field1737[var1], (byte) 62);
                }
            }
            class139.field3237[class44.field973++] = var1;
            class125 var3 = class102.field2358[var1];
            var3.field1667 = class112.field2667;
            int var4 = class103.field2391.method847(1, (byte) 59);
            if (var4 == 1) {
                class85.field2036[class68.field1416++] = var1;
            }
            int var5 = class103.field2391.method847(5, (byte) 48);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class103.field2391.method847(1, (byte) 98);
            int var7 = class8.field189[class103.field2391.method847(3, (byte) 50)];
            if (var2) {
                var3.field1652 = var7;
            }
            int var8 = class103.field2391.method847(5, (byte) 79);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.method559(var6 == 1, (byte) -103, class104.field2412.field1624[0] + var8, class104.field2412.field1647[0] - -var5);
        }
        class103.field2391.method854(false);
        field1717++;
    }
}
