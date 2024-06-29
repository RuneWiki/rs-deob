import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class192 extends class55 {

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lhe;")
    public class97 field2762;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field2761 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIII)V")
    public static final void method1248(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2763++;
        if (arg0 >= class286.field4431 && class230.field3302 >= arg0) {
            int var5 = class22.method134(class177.field2514, 14949, arg4, class279.field4238);
            int var6 = class22.method134(class177.field2514, 14949, arg2, class279.field4238);
            class139.method906(var5, var6, true, arg1, arg0);
        }
        if (arg3 < 26) {
            method1248(122, 116, -5, -83, 9);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)V")
    public static void method1249(byte arg0) {
        field2761 = null;
        if (arg0 != -102) {
            method1251(2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
    public static final void method1250(byte arg0) {
        field2764++;
        class234.field3376.method71(-99);
        if (arg0 != -9) {
            method1248(94, 86, 97, 39, 12);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lhe;)V")
    public class192(class97 arg0) {
        this.field2762 = arg0;
    }

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "(I)V")
    public static final void method1251(int arg0) {
        class255.method1632(16711680, class131.field1886);
        class199.field2837++;
        field2760++;
        if (class245.field3562 && class87.field1181) {
            int var1 = class104.field1417;
            int var2 = var1 - class213.field2984;
            if (var2 < class247.field3602) {
                var2 = class247.field3602;
            }
            if (class131.field1886.field1131 + var2 > class247.field3602 + class219.field3093.field1131) {
                var2 = class247.field3602 + class219.field3093.field1131 - class131.field1886.field1131;
            }
            int var3 = class37.field431;
            int var4 = var2 - class166.field2387;
            if (arg0 != 1) {
                method1249((byte) 100);
            }
            int var5 = class131.field1886.field1117;
            int var6 = var3 - class129.field1859;
            if (class249.field3618 > var6) {
                var6 = class249.field3618;
            }
            if ((class131.field1886.field1048 + var6) > (class249.field3618 + class219.field3093.field1048)) {
                var6 = class249.field3618 + class219.field3093.field1048 - class131.field1886.field1048;
            }
            int var7 = var6 - class228.field3209;
            if (class131.field1886.field1095 < class199.field2837 && (var5 < var4 || var4 < -var5 || var5 < var7 || (-var5) > var7)) {
                class152.field2205 = true;
            }
            int var8 = class219.field3093.field1018 + var6 - class249.field3618;
            int var9 = var2 + class219.field3093.field1125 - class247.field3602;
            if (class131.field1886.field1069 != null && class152.field2205) {
                class11 var10 = new class11();
                var10.field145 = class131.field1886;
                var10.field143 = class131.field1886.field1069;
                var10.field147 = var9;
                var10.field140 = var8;
                class110.method684(var10, false);
            }
            if (class151.field2193 == 0) {
                if (class152.field2205) {
                    if (class131.field1886.field1051 != null) {
                        class11 var11 = new class11();
                        var11.field153 = class251.field3638;
                        var11.field140 = var8;
                        var11.field147 = var9;
                        var11.field143 = class131.field1886.field1051;
                        var11.field145 = class131.field1886;
                        class110.method684(var11, false);
                    }
                    if (class251.field3638 != null && client.method1915(class131.field1886) != null) {
                        class94.field1259.method592(174, false);
                        class94.field1259.method1410(class131.field1886.field1025, (byte) 56);
                        class94.field1259.method1361(class251.field3638.field1025, (byte) 20);
                        class94.field1259.method1383((byte) 124, class131.field1886.field963);
                        class94.field1259.method1364(class251.field3638.field963, arg0 ^ 0x401);
                        class277.field4209++;
                    }
                } else if ((class59.field704 == 1 || class5.method29(class112.field1496 - 1, (byte) -37)) && class112.field1496 > 2) {
                    class255.method1631(arg0 + 255);
                } else if (class112.field1496 > 0) {
                    class292.method1957(127);
                }
                class131.field1886 = null;
            }
        } else if (class199.field2837 > 1) {
            class131.field1886 = null;
        }
    }
}
