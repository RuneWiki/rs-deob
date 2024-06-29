import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class200 extends class381 {

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lcc;")
    public static class165 field2717 = null;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field2718;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field2719;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field2720;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field2721;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2723;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Lf;")
    public static class256 field2722;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 6)
    public static final void method1298(String arg0, int arg1) {
        field2720++;
        if (arg0 == null) {
            return;
        }
        if (arg0.startsWith("*")) {
            arg0 = arg0.substring(1);
        }
        String var2 = class247.method1506(arg0, false);
        if (var2 == null) {
            return;
        }
        if (arg1 != 1) {
            field2717 = null;
        }
        for (int var3 = 0; var3 < class564.field8248; var3++) {
            String var4 = class115.field1722[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class247.method1506(var4, false);
            if (var5 != null && var5.equals(var2)) {
                class564.field8248--;
                for (int var6 = var3; var6 < class564.field8248; var6++) {
                    class115.field1722[var6] = class115.field1722[var6 + 1];
                    class268.field3501[var6] = class268.field3501[var6 + 1];
                    class203.field2774[var6] = class203.field2774[var6 + 1];
                    class656.field9378[var6] = class656.field9378[var6 + 1];
                    class185.field2520[var6] = class185.field2520[var6 + 1];
                }
                class516.field7245 = class351.field5215;
                class97.field1485++;
                class654 var7 = class631.method3628(class220.field2919, (byte) -51, class357.field5280);
                var7.field9358.method3110(class420.method2543(1, arg0), 93);
                var7.field9358.method3132(arg0, arg1 ^ 0x2);
                class444.method2623(126, var7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V", line = 82)
    public static void method1299(byte arg0) {
        field2722 = null;
        if (arg0 <= 8) {
            field2722 = null;
        }
        field2717 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lmv;Lmv;Lmv;Lmv;I)V", line = 93)
    public static final void method1300(class295 arg0, class295 arg1, class295 arg2, class295 arg3, int arg4) {
        class300.field4453 = arg3;
        class509.field7194 = arg1;
        if (arg4 != 0) {
            field2717 = null;
        }
        field2719++;
        class591.field8592 = arg0;
        class220.field2917 = new class5[class509.field7194.method1816(arg4 ^ 0xFFFFFFA2)][];
        class422.field6201 = new boolean[class509.field7194.method1816(arg4 + 43)];
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 111)
    public static final void method1301(boolean arg0) {
        if (!arg0) {
            field2724++;
            if (class61.field978.field3004 && class116.field1739.field1522 != -1) {
                class127.method910(class116.field1739.field1527, -63, class116.field1739.field1522);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lfn;Lcv;Lmv;Lmv;ILmv;)Z", line = 124)
    public static final boolean method1302(class617 arg0, class22 arg1, class295 arg2, class295 arg3, int arg4, class295 arg5) {
        class380.field5733 = arg3;
        class44.field658 = arg1;
        class175.field2460 = arg5;
        if (arg4 != 20711) {
            field2717 = null;
        }
        class245.field3247 = arg2;
        class58.field952 = new int[16];
        field2723++;
        class416.field6148 = arg0;
        for (int var6 = 0; var6 < 16; var6++) {
            class58.field952[var6] = 255;
        }
        return true;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BII)V", line = 157)
    public static final void method1303(byte arg0, int arg1, int arg2) {
        field2718++;
        class489 var3 = class704.method3942(arg1, 5, 0);
        var3.method2797(arg0 ^ 0xFFFFFF8B);
        if (arg0 == 116) {
            var3.field6952 = arg2;
        }
    }
}
