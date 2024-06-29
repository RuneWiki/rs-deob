import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class119 extends class252 {

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public int field1877 = -1;

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Z")
    public boolean field1884 = false;

    @OriginalMember(owner = "client!th", name = "Q", descriptor = "Z")
    public boolean field1893 = false;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "I")
    public static int field1873 = 0;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1885 = 0;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "I")
    public static int field1892 = 0;

    @OriginalMember(owner = "client!th", name = "w", descriptor = "I")
    public static int field1874;

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public int field1875;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!th", name = "A", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public int field1886;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!th", name = "L", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!th", name = "N", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!th", name = "R", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "[Lrk;")
    public static class292[] field1880;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "[Lud;")
    public static class2[] field1881;

    @OriginalMember(owner = "client!th", name = "u", descriptor = "[Lom;")
    public static class90[] field1872;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method817(int arg0, String arg1) {
        field1874++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class146.field2345; var2++) {
            if (arg1.equalsIgnoreCase(class240.field3748[var2])) {
                return true;
            }
        }
        if (arg0 != -12704) {
            field1872 = null;
        }
        return arg1.equalsIgnoreCase(class217.field3408.field222);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgi;B)V")
    public static final void method818(class164 arg0, byte arg1) {
        class288.field4663 = arg0.method1160("p11_full", -1);
        field1889++;
        class80.field1301 = arg0.method1160("p12_full", -1);
        if (arg1 <= 113) {
            method819((class164) null, 115);
        }
        class41.field620 = arg0.method1160("b12_full", -1);
        class205.field3304 = arg0.method1160("hitmarks", -1);
        class61.field878 = arg0.method1160("hitbar_default", -1);
        class229.field3591 = arg0.method1160("headicons_pk", -1);
        class29.field524 = arg0.method1160("headicons_prayer", -1);
        class23.field428 = arg0.method1160("hint_headicons", -1);
        class275.field4496 = arg0.method1160("hint_mapmarkers", -1);
        class58.field834 = arg0.method1160("mapflag", -1);
        class14.field291 = arg0.method1160("cross", -1);
        class210.field3340 = arg0.method1160("mapdots", -1);
        class250.field4113 = arg0.method1160("scrollbar", -1);
        class163.field2657 = arg0.method1160("name_icons", -1);
        class71.field1144 = arg0.method1160("floorshadows", -1);
        class163.field2652 = arg0.method1160("compass", -1);
        class99.field1566 = arg0.method1160("hint_mapedge", -1);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lgi;I)V")
    public static final void method819(class164 arg0, int arg1) {
        if (arg1 != 11869) {
            method820((byte) 21);
        }
        field1890++;
        class171.field2803 = arg0.method1160("runes", arg1 ^ 0xFFFFD1A2);
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(B)V")
    public static void method820(byte arg0) {
        field1880 = null;
        field1872 = null;
        field1881 = null;
        if (arg0 != -89) {
            method821(-47, -82);
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)I")
    public static final int method821(int arg0, int arg1) {
        field1894++;
        class92 var2 = class163.method1116((byte) 15, arg0);
        int var3 = var2.field1465;
        int var4 = var2.field1461;
        int var5 = var2.field1467;
        int var6 = class171.field2802[var5 - var4];
        return arg1 == 1929 ? var6 & class68.field1090[var3] >> var4 : 96;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIBIIIII)V")
    public static final void method822(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1891++;
        if (arg3 >= -57) {
            method819((class164) null, -107);
        }
        if (class118.method816(arg4, 0)) {
            class219.method1493(arg7, -1, arg0, class208.field3315[arg4], arg5, arg8, arg2, arg1, arg6, -121);
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class259.field4249[var9] = true;
            }
        } else {
            class259.field4249[arg0] = true;
        }
    }
}
