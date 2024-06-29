import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class61 extends class18 {

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Lne;")
    public class52 field1049;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Luk;")
    public static class100 field1050 = new class100(64);

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public static int field1052 = 1;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "[I")
    public static int[] field1055 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public static int field1046;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field1047;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field1048;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "Lhc;")
    public static class235 field1054;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Lclient;")
    public static client field1053;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(II)I")
    public static final int method461(int arg0, int arg1) {
        field1047++;
        if (arg1 <= 119) {
            field1051 = 40;
        }
        return arg0 & 0x3FF;
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Z")
    public static final boolean method462(int arg0) {
        field1045++;
        if (class253.field4061 == 0) {
            if (arg0 != 1) {
                method464(false);
            }
            return class6.field122.method35((byte) -18);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "(I)V")
    public static final void method463(int arg0) {
        field1048++;
        int var1 = class157.field2446;
        int var2 = class286.field4520;
        int var3 = class141.field2150;
        int var4 = class190.field2951;
        int var5 = 6116423;
        class211.method1424(var2, var1, var3, var4, var5);
        class211.method1424(var2 + 1, var1 - -1, var3 - 2, 16, 0);
        class211.method1411(var2 + 1, var1 + 18, var3 - 2, var4 - 19, 0);
        class228.field3517.method1676(class89.field1563, var2 + 3, var1 + 14, var5, -1);
        int var6 = class115.field1883;
        int var7 = class79.field1323;
        for (int var8 = arg0; var8 < class128.field2018; var8++) {
            int var9 = (class128.field2018 - var8 - 1) * 15 + (var1 + 31);
            int var10 = 16777215;
            if (var7 > var2 && var2 + var3 > var7 && (var9 - 13) < var6 && var6 < var9 + 3) {
                var10 = 16776960;
            }
            class228.field3517.method1676(class179.method1214(var8, -1), var2 + 3, var9, var10, 0);
        }
        class186.method1257(class157.field2446, class190.field2951, class141.field2150, class286.field4520, 0);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method464(boolean arg0) {
        field1050 = null;
        field1055 = null;
        if (arg0) {
            method463(-58);
        }
        field1054 = null;
        field1053 = null;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lne;)V")
    public class61(class52 arg0) {
        this.field1049 = arg0;
    }
}
