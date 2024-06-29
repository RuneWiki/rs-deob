import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 extends class116 {

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field305 = 0;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "Lic;")
    public static class59 field307 = class59.method433(0, "rect_debug=");

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "[I")
    public static int[] field315 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ca", name = "H", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lic;")
    public static class59 field306 = class59.method433(0, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ca", name = "L", descriptor = "Lic;")
    public static class59 field323 = class59.method433(0, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!ca", name = "K", descriptor = "Llf;")
    public static class82 field322 = new class82(200);

    @OriginalMember(owner = "client!ca", name = "M", descriptor = "Lic;")
    public static class59 field324 = class59.method433(0, "headicons_pk");

    @OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
    public static int field325 = 0;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!ca", name = "F", descriptor = "I")
    public static int field317;

    @OriginalMember(owner = "client!ca", name = "I", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Ldd;")
    public static class26 field310;

    @OriginalMember(owner = "client!ca", name = "G", descriptor = "Ldd;")
    public static class26 field318;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[I")
    public int[] field308;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "[I")
    public int[] field313;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "[I")
    public int[] field316;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "[Lbe;")
    public class13[] field304;

    @OriginalMember(owner = "client!ca", name = "J", descriptor = "[Lbe;")
    public class13[] field321;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "[[[B")
    public byte[][][] field309;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(B)V")
    public static void method85(byte arg0) {
        field306 = null;
        field307 = null;
        field310 = null;
        field324 = null;
        field318 = null;
        field323 = null;
        if (arg0 != 9) {
            field322 = null;
        }
        field322 = null;
        field315 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(II)Leb;")
    public static final class31 method86(int arg0, int arg1) {
        class31 var2 = (class31) class125.field2823.method675((long) arg0, 26431);
        field312++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class22.field532.method193(false, arg0, arg1);
        class31 var4 = new class31();
        if (var3 != null) {
            var4.method244(128, new class157(var3));
        }
        class125.field2823.method672(arg1 - 30467, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(II)Lda;")
    public static final class23 method87(int arg0, int arg1) {
        field311++;
        class23 var2 = (class23) class134.field2964.method675((long) arg1, 26431);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class125.field2828.method193(false, arg1, 13);
        class23 var4 = new class23();
        if (arg0 != 16) {
            method88(84);
        }
        var4.field551 = arg1;
        if (var3 != null) {
            var4.method147((byte) -128, new class157(var3));
        }
        class134.field2964.method672(-30464, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)I")
    public static final int method88(int arg0) {
        field317++;
        if (arg0 != 128) {
            method86(72, -49);
        }
        int var1 = class147.method1095((byte) 30, class15.field295, class44.field1127, class51.field1271);
        return var1 - class134.field2989 >= 800 || (class121.field2785[class44.field1127][class51.field1271 >> 7][class15.field295 >> 7] & 0x4) == 0 ? 3 : class44.field1127;
    }
}
