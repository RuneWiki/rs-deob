import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class138 {

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Z")
    public boolean field1929 = false;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "[I")
    public static int[] field1936 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Z")
    public static boolean field1931 = true;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "Lhk;")
    public static class319 field1928 = new class319();

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "F")
    public static float field1939;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public int field1927;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public int field1932;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "I")
    public int field1933;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "J")
    public long field1937;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Len;")
    public class47 field1935;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "[I")
    public static int[] field1934;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "()V", line = 6)
    public static final void method920() {
        for (int var0 = 0; var0 < class318.field4894; var0++) {
            class80 var1 = class176.field2563[var0];
            class149.method1002(var1);
            class176.field2563[var0] = null;
        }
        class318.field4894 = 0;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V", line = 27)
    public static final void method921(byte arg0) {
        field1930++;
        class239.method1712(0, class116.field1649);
        class22.field303++;
        if (class121.field1697 && class62.field762) {
            int var1 = class211.field2987;
            int var2 = var1 - class247.field3742;
            int var3 = class161.field2216;
            int var4 = var3 - class242.field3651;
            if (var4 < class331.field5058) {
                var4 = class331.field5058;
            }
            if (var2 < class157.field2169) {
                var2 = class157.field2169;
            }
            if (class331.field5058 + class110.field1540.field4096 < var4 - -class116.field1649.field4096) {
                var4 = class331.field5058 + class110.field1540.field4096 - class116.field1649.field4096;
            }
            int var5 = var4 - class270.field4258;
            int var6 = class116.field1649.field4048;
            if (class116.field1649.field3989 + var2 > class157.field2169 + class110.field1540.field3989) {
                var2 = class157.field2169 + class110.field1540.field3989 - class116.field1649.field3989;
            }
            int var7 = var2 - (class157.field2169 - class110.field1540.field4068);
            int var8 = var4 + class110.field1540.field3990 - class331.field5058;
            int var9 = var2 - class118.field1665;
            if (class22.field303 > class116.field1649.field4091 && (var6 < var9 || (-var6) > var9 || var5 > var6 || var5 < (-var6))) {
                class117.field1662 = true;
            }
            if (class116.field1649.field4067 != null && class117.field1662) {
                class176 var10 = new class176();
                var10.field2551 = class116.field1649.field4067;
                var10.field2562 = var8;
                var10.field2550 = var7;
                var10.field2552 = class116.field1649;
                class283.method2027(arg0 + 199901, var10);
            }
            if (class261.field3953 == 0) {
                if (class117.field1662) {
                    if (class116.field1649.field4109 != null) {
                        class176 var11 = new class176();
                        var11.field2562 = var8;
                        var11.field2557 = class127.field1745;
                        var11.field2550 = var7;
                        var11.field2551 = class116.field1649.field4109;
                        var11.field2552 = class116.field1649;
                        class283.method2027(200000, var11);
                    }
                    if (class127.field1745 != null && client.method1950(class116.field1649) != null) {
                        class113.field1606++;
                        class140.field1954.method573(116, 27);
                        class140.field1954.method663(class116.field1649.field4012, 128);
                        class140.field1954.method630((byte) 81, class116.field1649.field4083);
                        class140.field1954.method680(class127.field1745.field4083, (byte) -106);
                        class140.field1954.method642(arg0 ^ 0xFFFFFFE7, class127.field1745.field4012);
                    }
                } else if ((class58.field698 == 1 || class9.method43(class310.field4794 - 1, 119)) && class310.field4794 > 2) {
                    class311.method2183((byte) 123);
                } else if (class310.field4794 > 0) {
                    class312.method2190(-3);
                }
                class116.field1649 = null;
            }
            if (arg0 != 99) {
                field1931 = false;
            }
        } else if (class22.field303 > 1) {
            class116.field1649 = null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V", line = 167)
    public static void method922(byte arg0) {
        field1928 = null;
        field1936 = null;
        if (arg0 < -3) {
            field1934 = null;
        }
    }
}
