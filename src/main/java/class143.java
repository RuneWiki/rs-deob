import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class143 {

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Ljava/lang/String;")
    public static String field2143 = " from your ignore list first.";

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "[I")
    public static int[] field2139 = new int[200];

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field2141;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "Lpi;")
    public class143 field2134;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "Lpi;")
    public class143 field2138;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Lta;")
    public static class272 field2140;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)Lba;")
    public static final class172 method1040(int arg0, int arg1) {
        field2137++;
        class172 var2 = (class172) class138.field2069.method1173((long) arg0, true);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class246.field3920.method721((byte) -117, 0, arg0);
        class172 var4 = new class172();
        if (var3 != null) {
            var4.method1237(new class31(var3), -101);
        }
        var4.method1232(-177665656);
        if (arg1 != 5154) {
            field2143 = null;
        }
        class138.field2069.method1167((byte) 99, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
    public static final void method1041(int arg0) {
        field2135++;
        if (arg0 <= 79) {
            field2139 = null;
        }
        class8.field144 = new class222[class125.field1878.method704(0)][];
        class153.field2257 = new boolean[class125.field1878.method704(0)];
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1042(String arg0, int arg1) {
        int var2 = class260.method1747((byte) 127, arg0);
        field2142++;
        if (var2 != -1) {
            int[] var3 = class92.field1467.method2033((class183.field2895.field4796[var2] & 0xFFFE292) >> 14, arg1 ^ arg1, class183.field2895.field4796[var2] & 0x3FFF, (class183.field2895.field4796[var2] & 0x305AF9DB) >> 28);
            class61.method496(var3[1], var3[2], arg1 - 22107);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V")
    public final void method1043(int arg0) {
        field2144++;
        if (this.field2134 == null) {
            return;
        }
        this.field2134.field2138 = this.field2138;
        if (arg0 != 268427922) {
            field2140 = null;
        }
        this.field2138.field2134 = this.field2134;
        this.field2138 = null;
        this.field2134 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2141++;
        if (arg1 == arg6) {
            class91.method694(arg5, arg6, arg2, arg3, arg0, -14078, arg7);
        } else if (arg4 == 268427922) {
            if (class184.field2914 <= arg2 - arg6 && class2.field42 >= arg2 + arg6 && (arg0 - arg1) >= class112.field1727 && class278.field4410 >= (arg0 + arg1)) {
                class255.method1724(arg1, arg6, arg5, arg3, arg7, arg0, arg2, false);
            } else {
                class283.method1910(arg7, arg3, arg5, arg2, (byte) 126, arg1, arg6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public static void method1045(int arg0) {
        int var1 = 77 / ((arg0 - 75) / 37);
        field2139 = null;
        field2140 = null;
        field2143 = null;
    }
}
