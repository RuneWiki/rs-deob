import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class110 extends class255 {

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "Lpj;")
    public static class237 field1934 = class33.method353("Verbindung abgebrochen)3", 64);

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "I")
    public static int field1938 = 1;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1935 = 0;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field1941 = 0;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1937;

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "[I")
    public static int[] field1932;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(III)V")
    public static final void method817(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            field1941 = -70;
        }
        if (class113.field1983 != 0 && arg1 != -1) {
            class144.method991(0, false, arg1, class113.field1983, class44.field969, -50);
            class140.field2406 = true;
        }
        field1933++;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static final void method818(int arg0) {
        field1936++;
        if (class84.field1573 != -1) {
            class226.method1509(class84.field1573, 46);
        }
        for (int var1 = 0; var1 < class68.field1348; var1++) {
            if (class166.field2941[var1]) {
                class114.field2008[var1] = true;
            }
            class70.field1381[var1] = class166.field2941[var1];
            class166.field2941[var1] = false;
        }
        if (arg0 < 110) {
            field1941 = -54;
        }
        class36.field808 = class241.field4246;
        class149.field2645 = null;
        class243.field4263 = -1;
        class131.field2307 = -1;
        if (class84.field1573 != -1) {
            class68.field1348 = 0;
            class166.method1159(class84.field1573, 0, class119.field2087, 0, -58, 0, 0, class142.field2585, -1);
        }
        class192.method1295();
        class59.field1204 = 0;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static void method819(int arg0) {
        field1934 = null;
        if (arg0 != 23816) {
            method817(7, 57, -92);
        }
        field1932 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIII)V")
    public static final void method820(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 >= class89.field1637 && class94.field1676 >= arg1 && arg0 >= class13.field215 && arg2 <= class34.field727) {
            class167.method1169(97, arg4, arg0, arg1, arg5, arg2);
        } else {
            class52.method466(arg5, arg0, (byte) 66, arg4, arg1, arg2);
        }
        field1939++;
        int var6 = 50 % ((14 - arg3) / 44);
    }
}
