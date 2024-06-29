import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class167 extends class34 {

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field3003;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public int field3009;

    @OriginalMember(owner = "client!jg", name = "C", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public int field3010;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "Lcc;")
    private static class209 field3006 = class95.method669(107, "Take");

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "Lcc;")
    public static class209 field3007 = field3006;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "Lcc;")
    public static class209 field3011 = class95.method669(105, "null");

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field3005 = 0;

    @OriginalMember(owner = "client!jg", name = "A", descriptor = "Lcc;")
    public static class209 field3016 = class95.method669(104, "ul");

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!jg", name = "x", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!jg", name = "y", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!jg", name = "z", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILsj;Lsj;Lsj;Lsj;)V")
    public static final void method1148(int arg0, class49 arg1, class49 arg2, class49 arg3, class49 arg4) {
        field3008++;
        class34.field600 = arg3;
        class265.field4758 = arg1;
        class142.field2625 = arg2;
        class118.field2367 = arg4;
        if (arg0 != 0) {
            field3011 = null;
        }
        class50.field984 = new class42[class142.field2625.method359(91)][];
        class59.field1189 = new boolean[class142.field2625.method359(arg0 ^ 0xFFFFFFA5)];
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Z)V")
    public static void method1149(boolean arg0) {
        field3007 = null;
        field3016 = null;
        field3011 = null;
        field3006 = null;
        if (arg0) {
            method1149(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(B)V")
    public static final void method1150(byte arg0) {
        if (arg0 <= 74) {
            return;
        }
        for (class97 var1 = (class97) class114.field2288.method1759((byte) 43); var1 != null; var1 = (class97) class114.field2288.method1767((byte) 41)) {
            int var2 = var1.field1895;
            if (class161.method1111((byte) 21, var2)) {
                boolean var3 = true;
                class42[] var4 = class50.field984[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field795;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field596;
                    class42 var7 = class247.method1719(var6, -8667);
                    if (var7 != null) {
                        class126.method907(var7, 0);
                    }
                }
            }
        }
        field3012++;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "(IIII)V")
    public class167(int arg0, int arg1, int arg2, int arg3) {
        this.field3003 = arg2;
        this.field3009 = arg1;
        this.field3017 = arg0;
        this.field3010 = arg3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(III)Z")
    public final boolean method1151(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field3004++;
            return this.field3017 <= arg0 && this.field3003 >= arg0 && arg2 >= this.field3009 && this.field3010 >= arg2;
        } else {
            return true;
        }
    }
}
