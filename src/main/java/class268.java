import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class268 extends class235 {

    @OriginalMember(owner = "client!eo", name = "A", descriptor = "Ljl;")
    public class392 field3927;

    @OriginalMember(owner = "client!eo", name = "B", descriptor = "I")
    public static int field3928 = -1;

    @OriginalMember(owner = "client!eo", name = "D", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1730(int arg0, String arg1) {
        field3929++;
        if (arg0 != 17923 || arg1 == null) {
            return;
        }
        if (!(class26.field463 < 100 || class122.field1640) || class26.field463 >= 200) {
            class135.method908(class6.field60, (byte) 53);
            return;
        }
        String var2 = class295.method1881((byte) 106, arg1);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class26.field463; var3++) {
            String var7 = class295.method1881((byte) 96, class164.field2128[var3]);
            if (var7 != null && var7.equals(var2)) {
                class135.method908(arg1 + class151.field1976, (byte) 53);
                return;
            }
            if (class124.field1654[var3] != null) {
                String var8 = class295.method1881((byte) 82, class124.field1654[var3]);
                if (var8 != null && var8.equals(var2)) {
                    class135.method908(arg1 + class151.field1976, (byte) 53);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class244.field3409; var4++) {
            String var5 = class295.method1881((byte) 118, class272.field3982[var4]);
            if (var5 != null && var5.equals(var2)) {
                class135.method908(class403.field5983 + arg1 + class420.field6248, (byte) 53);
                return;
            }
            if (class155.field2035[var4] != null) {
                String var6 = class295.method1881((byte) 47, class155.field2035[var4]);
                if (var6 != null && var6.equals(var2)) {
                    class135.method908(class403.field5983 + arg1 + class420.field6248, (byte) 53);
                    return;
                }
            }
        }
        if (class295.method1881((byte) 109, class100.field1350.field2756).equals(var2)) {
            class135.method908(class45.field672, (byte) 53);
        } else {
            class84.field1168++;
            class232.field3279.method756(arg0 - 17923, 226);
            class232.field3279.method1707(arg0 - 17853, class410.method2668((byte) -115, arg1));
            class232.field3279.method1662(arg1, (byte) 40);
        }
    }

    @OriginalMember(owner = "client!eo", name = "<init>", descriptor = "(Ljl;)V")
    public class268(class392 arg0) {
        this.field3927 = arg0;
    }
}
