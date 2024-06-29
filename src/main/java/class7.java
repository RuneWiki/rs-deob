import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class7 extends class89 {

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "Z")
    public static boolean field152 = true;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "Lrb;")
    public static class254 field150 = new class254(64);

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "Lub;")
    private static class227 field155 = class257.method1749("", 17263);

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "Lub;")
    public static class227 field153 = field155;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Lub;")
    public static class227 field156 = class257.method1749("<col=ff0000>", 17263);

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "[Lph;")
    public static class32[] field157 = new class32[27];

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public static int field149;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "Lnh;")
    public static class57 field154;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "[I")
    public static int[] field151;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V")
    public static final void method27(int arg0, int arg1, boolean arg2) {
        field148++;
        if (!arg2 && class195.method1234(arg1, (byte) -8)) {
            class248.method1663((byte) -30, arg0, class102.field1792[arg1]);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(B)V")
    public static void method28(byte arg0) {
        field153 = null;
        field151 = null;
        if (arg0 >= -75) {
            field151 = null;
        }
        field154 = null;
        field156 = null;
        field157 = null;
        field150 = null;
        field155 = null;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V")
    public static final void method29(int arg0) {
        class165.field2771.method1723(-4173);
        int var1 = 107 / ((-arg0 - 1) / 33);
        field149++;
        class31.field499.method1723(-4173);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static final void method30(boolean arg0) {
        field147++;
        class198.method1268(110, class10.field194);
        class212.field3584++;
        if (class229.field4000 && class184.field3125) {
            if (arg0) {
                int var1 = class100.field1752;
                int var2 = var1 - class94.field1632;
                int var3 = client.field1451;
                if (class69.field1223 > var2) {
                    var2 = class69.field1223;
                }
                if (class69.field1223 + class232.field4044.field1977 < var2 - -class10.field194.field1977) {
                    var2 = class69.field1223 + class232.field4044.field1977 - class10.field194.field1977;
                }
                int var4 = var3 - class186.field3177;
                int var5 = var2 - class38.field625;
                if (class119.field2176 > var4) {
                    var4 = class119.field2176;
                }
                int var6 = class10.field194.field1830;
                if ((class119.field2176 + class232.field4044.field1952) < (class10.field194.field1952 + var4)) {
                    var4 = class119.field2176 + class232.field4044.field1952 - class10.field194.field1952;
                }
                int var7 = var2 + class232.field4044.field1925 - class69.field1223;
                int var8 = var4 - class45.field781;
                int var9 = var4 + class232.field4044.field1986 - class119.field2176;
                if (class10.field194.field1965 < class212.field3584 && (var5 > var6 || var5 < -var6 || var8 > var6 || (-var6) > var8)) {
                    class192.field3273 = true;
                }
                if (class10.field194.field1953 != null && class192.field3273) {
                    class34 var10 = new class34();
                    var10.field570 = var7;
                    var10.field583 = class10.field194;
                    var10.field568 = class10.field194.field1953;
                    var10.field555 = var9;
                    class218.method1377(var10, !arg0);
                }
                if (class122.field2197 == 0) {
                    if (class192.field3273) {
                        if (class10.field194.field1877 != null) {
                            class34 var11 = new class34();
                            var11.field555 = var9;
                            var11.field583 = class10.field194;
                            var11.field582 = class255.field4475;
                            var11.field570 = var7;
                            var11.field568 = class10.field194.field1877;
                            class218.method1377(var11, false);
                        }
                        if (class255.field4475 != null && client.method501(class10.field194) != null) {
                            class176.field2935.method664((byte) 66, 150);
                            class176.field2935.method1451(class255.field4475.field1884, (byte) -112);
                            class176.field2935.method1427(class10.field194.field1861, (byte) -108);
                            class176.field2935.method1451(class10.field194.field1884, (byte) -125);
                            class194.field3310++;
                            class176.field2935.method1445(class255.field4475.field1861, -718520472);
                        }
                    } else if ((class241.field4191 == 1 || class186.method1187(class94.field1631 - 1, 27651)) && class94.field1631 > 2) {
                        class105.method650(-6416);
                    } else if (class94.field1631 > 0) {
                        class80.method468(class94.field1631 - 1, (byte) 119);
                    }
                    class10.field194 = null;
                }
            }
        } else if (class212.field3584 > 1) {
            class10.field194 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZI)V")
    public static final void method31(int arg0, boolean arg1, int arg2) {
        field146++;
        class10.field189[arg0] = arg2;
        if (!arg1) {
            method29(-99);
        }
        class94 var3 = (class94) class177.field2942.method1298(-102, (long) arg0);
        if (var3 == null) {
            class94 var4 = new class94(4611686018427387905L);
            class177.field2942.method1300(var4, (long) arg0, -2875);
        } else if (var3.field1640 != 4611686018427387905L) {
            var3.field1640 = class12.method57(-112) + 500L | 0x4000000000000000L;
            return;
        }
    }
}
