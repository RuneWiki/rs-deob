import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class118 extends class104 {

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Le;")
    public class191 field1942;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "Le;")
    private static class191 field1945 = class54.method368("red:", 2047);

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Le;")
    private static class191 field1944 = class54.method368("Please remove ", 2047);

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field1941 = 0;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "Le;")
    public static class191 field1946 = field1944;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "Le;")
    public static class191 field1948 = field1945;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "Le;")
    public static class191 field1951 = field1945;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Le;")
    public static class191 field1947 = field1944;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lwd;")
    public static class97 field1940 = new class97(16);

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    public static int field1953 = 0;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "Le;")
    public static class191 field1954 = class54.method368("Gegenstand f-Ur Mitglieder", 2047);

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static void method782(int arg0) {
        field1946 = null;
        field1940 = null;
        if (arg0 != 27557) {
            field1947 = null;
        }
        field1948 = null;
        field1945 = null;
        field1947 = null;
        field1951 = null;
        field1954 = null;
        field1944 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public static final void method783(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class242.field4327 == 1) {
            class74.field1272[class162.field2749 / 100].method598(class126.field2091 - 8, class199.field3546 + -8);
        }
        if (class242.field4327 == 2) {
            class74.field1272[class162.field2749 / 100 + 4].method598(class126.field2091 - 8, class199.field3546 + -8);
        }
        class110.method706(3);
        field1949++;
        if (arg2 != 4) {
            method784((byte) -74);
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)V")
    public static final void method784(byte arg0) {
        class183 var1 = class17.field226;
        synchronized (class17.field226) {
            class185.field3232++;
            class51.field929 = class127.field2108;
            class189.field3325 = class261.field4596;
            class133.field2229 = class99.field1586;
            class33.field520 = class168.field2829;
            class104.field1709 = class245.field4358;
            class50.field897 = class269.field4753;
            class87.field1430 = class25.field363;
            class168.field2829 = 0;
            if (arg0 != 11) {
                method785(-105, 45, -9);
            }
        }
        field1943++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(III)V")
    public static final void method785(int arg0, int arg1, int arg2) {
        if (arg0 == -1957) {
            field1950++;
            class241 var3 = class14.method97(7, arg2, -64);
            var3.method1694((byte) -90);
            var3.field4301 = arg1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class118() {
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Le;I)V")
    public class118(class191 arg0, int arg1) {
        this.field1942 = arg0;
    }
}
