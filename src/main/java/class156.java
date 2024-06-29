import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class156 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "Ljd;")
    public static class86 field2946 = class122.method868("blinken2:", true);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Ljd;")
    public static class86 field2945 = class122.method868("; version=1; path=)4; domain=", true);

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "Ljd;")
    public static class86 field2950 = class122.method868("sch-Utteln:", true);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Z")
    public static final boolean method1137(int arg0, int arg1) {
        field2947++;
        if (arg1 < 0) {
            return false;
        }
        if (arg0 > -94) {
            method1141(false);
        }
        int var2 = class273.field4784[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1002;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public static final void method1138(int arg0) {
        class200.field3545 = arg0;
        int var1 = (class124.field2412.field676 >> 7) + class252.field4481;
        field2948++;
        int var2 = (class124.field2412.field685 >> 7) + class79.field1554;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class200.field3545 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class200.field3545 = 1;
        }
        if (class200.field3545 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class200.field3545 = 0;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)I")
    public static final int method1139(int arg0, int arg1) {
        field2949++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return arg1 >= -3 ? -39 : var6 + 1;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method1140(int arg0) {
        field2950 = null;
        if (arg0 <= 66) {
            method1140(71);
        }
        field2945 = null;
        field2946 = null;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)I")
    public static final int method1141(boolean arg0) {
        if (arg0) {
            field2950 = null;
        }
        field2951++;
        return 2;
    }
}
