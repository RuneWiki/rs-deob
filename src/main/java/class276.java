import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class276 {

    @OriginalMember(owner = "client!g", name = "n", descriptor = "Lta;")
    private class254 field4947 = new class254();

    @OriginalMember(owner = "client!g", name = "t", descriptor = "Lj;")
    private class165 field4953 = new class165();

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    private int field4952;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "Llj;")
    private class25 field4951;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "[B")
    public static byte[] field4937 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4938 = 0;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field4943 = 0;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "Lcf;")
    private static class93 field4941 = class147.method1066("Connecting to update server", -48);

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lcf;")
    public static class93 field4942 = field4941;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lcf;")
    private static class93 field4936 = class147.method1066("", -48);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Lcf;")
    public static class93 field4934 = field4936;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "Lcf;")
    private static class93 field4948 = class147.method1066("Checking for updates )2 ", -48);

    @OriginalMember(owner = "client!g", name = "w", descriptor = "Lcf;")
    public static class93 field4956 = field4948;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field4940;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "I")
    public static int field4946;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public static int field4949;

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Ldh;")
    public static class120 field4950;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "Lhg;")
    public static class177 field4954;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lta;IJ)V")
    public final void method1847(class254 arg0, int arg1, long arg2) {
        field4945++;
        if (arg1 <= 50) {
            this.method1852(-95L, (byte) 83);
        }
        if (this.field4955 == 0) {
            class254 var5 = this.field4953.method1195((byte) 69);
            var5.method1544((byte) -110);
            var5.method1728(28169);
            if (this.field4947 == var5) {
                class254 var6 = this.field4953.method1195((byte) 69);
                var6.method1544((byte) -50);
                var6.method1728(28169);
            }
        } else {
            this.field4955--;
        }
        this.field4951.method137(arg2, arg0, -1);
        this.field4953.method1190(64, arg0);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
    public final void method1848(byte arg0) {
        field4935++;
        this.field4953.method1191(-27254);
        this.field4951.method139(0);
        this.field4947 = new class254();
        int var2 = 46 % ((16 - arg0) / 51);
        this.field4955 = this.field4952;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Lhg;ZLhg;)V")
    public static final void method1849(class177 arg0, boolean arg1, class177 arg2) {
        if (arg1) {
            method1851(121);
        }
        class6.field88 = arg0;
        field4946++;
        class130.field2299 = arg2;
        class103.field1793 = class6.field88.method1283(3, -5357);
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(B)Lre;")
    public final class222 method1850(byte arg0) {
        field4949++;
        int var2 = 112 % ((46 - arg0) / 63);
        return this.field4951.method132((byte) 103);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method1851(int arg0) {
        field4941 = null;
        field4942 = null;
        field4934 = null;
        field4954 = null;
        if (arg0 != 9276) {
            return;
        }
        field4950 = null;
        field4956 = null;
        field4937 = null;
        field4936 = null;
        field4948 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(JB)Lta;")
    public final class254 method1852(long arg0, byte arg1) {
        field4939++;
        if (arg1 != -105) {
            this.method1853((byte) 15);
        }
        class254 var4 = (class254) this.field4951.method135(arg0, true);
        if (var4 != null) {
            this.field4953.method1190(64, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(B)Lre;")
    public final class222 method1853(byte arg0) {
        field4940++;
        return arg0 >= -41 ? null : this.field4951.method136(-110);
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(I)V")
    public class276(int arg0) {
        this.field4952 = arg0;
        int var2 = 1;
        this.field4955 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field4951 = new class25(var2);
    }
}
