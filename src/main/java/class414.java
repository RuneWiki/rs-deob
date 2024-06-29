import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class414 {

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Lqk;")
    private class16 field5285;

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "[I")
    public static int[] field5284 = new int[250];

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "I")
    public static int field5281;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!fr", name = "g", descriptor = "I")
    public static int field5287;

    @OriginalMember(owner = "client!fr", name = "h", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "Lrg;")
    private class644 field5282;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V", line = 4)
    public static void method2322(byte arg0) {
        int var1 = -53 / ((arg0 + 43) / 40);
        field5284 = null;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)Lrg;", line = 20)
    public final class644 method2323(byte arg0) {
        field5283++;
        class644 var2 = this.field5285.field313.field8921;
        if (arg0 >= -43) {
            this.field5282 = null;
        }
        if (this.field5285.field313 == var2) {
            this.field5282 = null;
            return null;
        } else {
            this.field5282 = var2.field8921;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)Lrg;", line = 43)
    public final class644 method2324(int arg0) {
        field5286++;
        if (arg0 != 0) {
            this.field5282 = null;
        }
        class644 var2 = this.field5282;
        if (this.field5285.field313 == var2) {
            this.field5282 = null;
            return null;
        } else {
            this.field5282 = var2.field8921;
            return var2;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(I[Ljava/lang/String;)V", line = 64)
    public static final void method2325(int arg0, String[] arg1) {
        if (arg0 != 48000) {
            field5284 = null;
        }
        field5288++;
        if (arg1.length <= 1) {
            class482.field6539 = class482.field6539 + arg1[0];
            class298.field3915 += arg1[0].length();
            return;
        }
        for (int var2 = 0; var2 < arg1.length; var2++) {
            if (arg1[var2].startsWith("pause")) {
                int var3 = 5;
                try {
                    var3 = Integer.parseInt(arg1[var2].substring(6));
                } catch (Exception var4) {
                }
                class320.method1883((byte) -60, "Pausing for " + var3 + " seconds...");
                class216.field2925 = arg1;
                class354.field4550 = var2 + 1;
                class532.field7384 = class446.method2525(arg0 - 47500) + ((long) (var3 * 1000));
                return;
            }
            class482.field6539 = arg1[var2];
            class538.method3091(false, arg0 - 48000);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IZZI)V", line = 111)
    public static final void method2326(int arg0, boolean arg1, boolean arg2, int arg3) {
        field5281++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class147.field2052 = arg3;
        class541.field7490 = arg0;
        if (!arg2) {
            method2325(-26, null);
        }
        class360.field4662 = arg1;
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "()V", line = 130)
    public class414() {
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lqk;)V", line = 133)
    public class414(class16 arg0) {
        this.field5285 = arg0;
    }
}
