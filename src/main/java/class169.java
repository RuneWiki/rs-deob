import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class169 extends class393 {

    @OriginalMember(owner = "client!sk", name = "w", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "I")
    public static int field2214 = 0;

    @OriginalMember(owner = "client!sk", name = "z", descriptor = "I")
    public static int field2227 = 1;

    @OriginalMember(owner = "client!sk", name = "x", descriptor = "I")
    public static int field2225 = 50;

    @OriginalMember(owner = "client!sk", name = "C", descriptor = "[I")
    public static int[] field2230 = new int[field2225];

    @OriginalMember(owner = "client!sk", name = "y", descriptor = "[I")
    public static int[] field2226 = new int[field2225];

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "[I")
    public static int[] field2220 = new int[field2225];

    @OriginalMember(owner = "client!sk", name = "A", descriptor = "[Ljava/lang/String;")
    public static String[] field2228 = new String[field2225];

    @OriginalMember(owner = "client!sk", name = "B", descriptor = "[I")
    public static int[] field2229 = new int[field2225];

    @OriginalMember(owner = "client!sk", name = "t", descriptor = "[I")
    public static int[] field2221 = new int[field2225];

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "[I")
    public static int[] field2233 = new int[field2225];

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "Lwe;")
    public static class24 field2232 = new class24(4);

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Lwe;")
    public static class24 field2235 = new class24(5);

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!sk", name = "u", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!sk", name = "v", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!sk", name = "D", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!sk", name = "G", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IJLjava/lang/String;IILjava/lang/String;II)V")
    public static final void method1048(int arg0, long arg1, String arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field2215++;
        if (!class229.field3230 && class10.field97 < 500) {
            int var9 = arg0 == arg3 ? class19.field314 : arg0;
            class259 var10 = new class259(arg2, arg5, var9, arg7, arg1, arg4, arg6);
            class373.field5574.method2660((byte) -128, var10);
            class10.field97++;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public static final void method1049(int arg0, String arg1, int arg2, String arg3) {
        field2231++;
        class401.field5967 = arg2;
        class74.field1000 = arg1;
        class38.field611 = arg3;
        if (class38.field611.equals("") || class74.field1000.equals("")) {
            class276.field4043 = 3;
        } else if (class163.field2123 == -1) {
            class328.field4709 = 0;
            class276.field4043 = -3;
            class442.field6455 = 0;
            class384.field5748 = 1;
            class265 var4 = new class265(128);
            var4.method1707(61, 10);
            var4.method1704((int) (Math.random() * 9.9999999E7D), (byte) 126);
            var4.method1689((byte) 121, class249.method1535(class38.field611, 65535));
            var4.method1704((int) (Math.random() * 9.9999999E7D), (byte) 125);
            var4.method1662(class74.field1000, (byte) -126);
            var4.method1704((int) (Math.random() * 9.9999999E7D), (byte) 125);
            var4.method1703(class139.field1861, (byte) -114, class280.field4122);
            class232.field3279.field3915 = 0;
            class232.field3279.method1707(arg0 - 23794, 24);
            class232.field3279.method1707(75, var4.field3915 + 2);
            class232.field3279.method1693(562, (byte) 43);
            class232.field3279.method1676(0, arg0 - 23946, var4.field3879, var4.field3915);
            if (arg0 != 23820) {
                method1048(58, 67L, (String) null, 84, -75, (String) null, -38, -100);
            }
        } else {
            class86.method536((byte) 78);
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(I)V")
    public static void method1050(int arg0) {
        field2233 = null;
        field2228 = null;
        field2221 = null;
        field2230 = null;
        field2235 = null;
        field2232 = null;
        field2229 = null;
        field2226 = null;
        if (arg0 <= 88) {
            field2232 = null;
        }
        field2220 = null;
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(I)V")
    public static final void method1051(int arg0) {
        field2223++;
        if (arg0 != -7830) {
            field2222 = 70;
        }
        for (int var1 = 0; var1 < class191.field2662; var1++) {
            int var2 = class416.field6202[var1];
            class129 var3 = class23.field408[var2];
            if (var3 != null) {
                class256.method1619(var3.field1714.field5570, -104, var3);
            }
        }
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V")
    public static final void method1052(byte arg0) {
        if (class262.field3822 != -1) {
            class139.method939(-1, false, -1, -69, class262.field3822);
            class262.field3822 = -1;
        }
        field2218++;
        if (arg0 >= -14) {
            field2226 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(II)V")
    public class169(int arg0, int arg1) {
        this.field2224 = arg1;
        this.field2219 = arg0;
    }
}
