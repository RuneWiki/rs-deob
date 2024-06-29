import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class51 extends class254 {

    @OriginalMember(owner = "client!ne", name = "B", descriptor = "Lsb;")
    public class224 field835;

    @OriginalMember(owner = "client!ne", name = "E", descriptor = "Lcf;")
    public static class93 field838 = class147.method1066("clignotant1:", -48);

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Lvg;")
    public static class73 field843 = null;

    @OriginalMember(owner = "client!ne", name = "H", descriptor = "I")
    public static int field841 = 0;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "Lcf;")
    private static class93 field847 = class147.method1066("shake:", -48);

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
    public static int field844 = -1;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "Lcf;")
    public static class93 field846 = field847;

    @OriginalMember(owner = "client!ne", name = "I", descriptor = "Lcf;")
    public static class93 field842 = field847;

    @OriginalMember(owner = "client!ne", name = "A", descriptor = "Lnh;")
    public static class54 field834 = new class54(64);

    @OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ne", name = "C", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!ne", name = "D", descriptor = "Lqi;")
    public static class129 field837;

    @OriginalMember(owner = "client!ne", name = "G", descriptor = "Ldc;")
    public static class235 field840;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)V")
    public static final void method281(byte arg0) {
        class196.field3585.method294(0);
        class283.field5073.method294(0);
        class94.field1697.method294(0);
        field845++;
        int var1 = 46 % ((-arg0 - 28) / 62);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)Lej;")
    public static final class50 method282(int arg0, int arg1) {
        if (arg0 < 55) {
            method282(49, -125);
        }
        class50 var2 = (class50) class45.field733.method302((long) arg1, 0);
        field839++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class78.field1450.method1271(32, -2154, arg1);
        class50 var4 = new class50();
        if (var3 != null) {
            var4.method275(new class280(var3), (byte) 84);
        }
        var4.method278(-33);
        class45.field733.method297((long) arg1, var4, 10414);
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lsb;)V")
    public class51(class224 arg0) {
        this.field835 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Z")
    public static final boolean method283(int arg0) {
        field833++;
        if (arg0 <= 7) {
            method283(51);
        }
        return class120.field2138 == 0 ? class234.field4175.method832(32563) : true;
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static void method284(int arg0) {
        field842 = null;
        if (arg0 < 95) {
            field840 = null;
        }
        field837 = null;
        field847 = null;
        field834 = null;
        field838 = null;
        field846 = null;
        field840 = null;
    }
}
