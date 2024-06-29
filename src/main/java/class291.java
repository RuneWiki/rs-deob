import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class291 extends class62 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "Leg;")
    public static class37 field5121 = class174.method1167("k", -88);

    @OriginalMember(owner = "client!f", name = "C", descriptor = "Leg;")
    private static class37 field5122 = class174.method1167("Checking for updates )2 ", 64);

    @OriginalMember(owner = "client!f", name = "D", descriptor = "Leg;")
    public static class37 field5123 = field5122;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "I")
    public static int field5120;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "J")
    public long field5125;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "Lni;")
    public static class195 field5128;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "Lf;")
    public class291 field5124;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "Lf;")
    public class291 field5129;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "Luh;")
    public static class59 field5117;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(III)I")
    public static final int method1946(int arg0, int arg1, int arg2) {
        field5116++;
        int var3 = class197.method1369(1, arg1 + 45365, 4, arg0 + 91923) + (class197.method1369(1, arg1 + 10294, 2, arg0 + 37821) - 128 >> 1) + (class197.method1369(1, arg1, 1, arg0) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg2 != 5962) {
            return 7;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static void method1947(int arg0) {
        field5122 = null;
        field5123 = null;
        field5117 = null;
        if (arg0 == 2) {
            field5121 = null;
            field5128 = null;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
    public final boolean method1948(boolean arg0) {
        if (arg0) {
            field5120++;
            return this.field5124 != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public static final void method1949(int arg0) {
        field5115++;
        class210.field3614.method1403(45);
        if (arg0 < 69) {
            field5117 = null;
        }
        class74.field1166.method1403(45);
        class107.field1662.method1403(45);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1950(int arg0, int arg1, int arg2, long arg3) {
        class111 var5 = class286.field5048[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1868 != null && var5.field1868.field1222 == arg3) {
            return true;
        } else if (var5.field1875 != null && var5.field1875.field4781 == arg3) {
            return true;
        } else if (var5.field1876 != null && var5.field1876.field4244 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1880; var6++) {
                if (var5.field1858[var6].field381 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Lcf;")
    public static final class235 method1951(int arg0) {
        field5131++;
        if (arg0 != -22738) {
            return null;
        }
        try {
            return (class235) Class.forName("pk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class88();
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIZI)V")
    public static final void method1952(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        if (class217.field3734 == 1) {
            class120.field2025[class201.field3423 / 100].method702(class51.field798 - 8, class200.field3396 - 8);
        }
        field5119++;
        if (class217.field3734 == 2) {
            class120.field2025[(class201.field3423 / 100) + 4].method702(class51.field798 - 8, class200.field3396 + -8);
        }
        class237.method1626(2975);
        if (!arg3) {
            method1952(-85, 14, 13, false, -26);
        }
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public final void method1953(int arg0) {
        if (arg0 != 91923) {
            method1946(-93, 83, 51);
        }
        field5126++;
        if (this.field5124 != null) {
            this.field5124.field5129 = this.field5129;
            this.field5129.field5124 = this.field5124;
            this.field5124 = null;
            this.field5129 = null;
        }
    }
}
