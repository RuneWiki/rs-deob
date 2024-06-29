import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class386 {

    @OriginalMember(owner = "client!es", name = "a", descriptor = "Lav;")
    public static class641 field4923;

    @OriginalMember(owner = "client!es", name = "b", descriptor = "Lav;")
    public static class641 field4924 = field4923 = new class641(false);

    @OriginalMember(owner = "client!es", name = "e", descriptor = "Lhm;")
    public static class223 field4927 = new class223(1, 2);

    @OriginalMember(owner = "client!es", name = "g", descriptor = "F")
    public static float field4929 = 1.0F;

    @OriginalMember(owner = "client!es", name = "i", descriptor = "[I")
    public static int[] field4931 = new int[32];

    @OriginalMember(owner = "client!es", name = "j", descriptor = "I")
    public static int field4932 = 0;

    @OriginalMember(owner = "client!es", name = "c", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!es", name = "d", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!es", name = "f", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!es", name = "h", descriptor = "Lha;")
    public static class60 field4930;

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V", line = 11)
    public static final void method2194(int arg0, int arg1) {
        field4926++;
        class375 var2 = (class375) class297.field3910.method1160((long) arg0, 126);
        if (var2 != null) {
            var2.field4807.method2924(50);
            class618.method3452((byte) 126, var2.field4808, var2.field4810);
            var2.method1175(-2);
        }
        if (arg1 < 111) {
            field4932 = 23;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V", line = 34)
    public static final void method2195(int arg0) {
        field4928++;
        client var1 = class654.field9104;
        synchronized (class654.field9104) {
            if (arg0 >= -24) {
                field4931 = null;
            }
            if (class353.field4533 == null) {
                Container var2;
                if (class731.field10179 != null) {
                    var2 = class731.field10179;
                } else if (class64.field900 == null) {
                    var2 = class319.field4123;
                } else {
                    var2 = class64.field900;
                }
                class754.field10526 = var2.getSize().width;
                class317.field4108 = var2.getSize().height;
                if (class731.field10179 == var2) {
                    Insets var3 = class731.field10179.getInsets();
                    class754.field10526 -= var3.right + var3.left;
                    class317.field4108 -= var3.top + var3.bottom;
                }
                if (class120.method926(15492) == 1) {
                    class489.field6951 = (class754.field10526 - class482.field6548) / 2;
                    class288.field3772 = 0;
                    class466.field6263 = class478.field6509;
                    class356.field4586 = class482.field6548;
                } else {
                    class179.method1227(-1);
                }
                if (class7.field75 != class225.field2991) {
                    boolean var10000;
                    if (class356.field4586 < 1024 && class466.field6263 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class262.field3311.setSize(class356.field4586, class466.field6263);
                if (field4930 != null) {
                    if (class676.field9448) {
                        class649.method3642(class262.field3311, (byte) -31);
                    } else {
                        field4930.method495(class262.field3311, class356.field4586, class466.field6263);
                    }
                }
                if (class731.field10179 == var2) {
                    Insets var4 = class731.field10179.getInsets();
                    class262.field3311.setLocation(class489.field6951 + var4.left, var4.top - -class288.field3772);
                } else {
                    class262.field3311.setLocation(class489.field6951, class288.field3772);
                }
                if (class540.field7482 != -1) {
                    class203.method1317(false, true);
                }
                class759.method4224(0);
            }
        }
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(I)V", line = 121)
    public static void method2196(int arg0) {
        field4923 = null;
        field4931 = null;
        field4930 = null;
        field4927 = null;
        if (arg0 != -2) {
            method2197(91);
        }
        field4924 = null;
    }

    @OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Z", line = 138)
    public static final boolean method2197(int arg0) {
        if (arg0 >= -58) {
            field4930 = null;
        }
        class332.field4238++;
        class652.field9071 = true;
        field4925++;
        return true;
    }

    @OriginalMember(owner = "client!es", name = "b", descriptor = "(II)I", line = 151)
    public static int method2198(int arg0, int arg1) {
        return arg0 ^ arg1;
    }
}
