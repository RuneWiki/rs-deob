import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class103 {

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field1399 = 0;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field1400 = -1;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!ve", name = "g", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ve", name = "h", descriptor = "Lb;")
    public static class262 field1406;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([Ljava/lang/String;B)[Ljava/lang/String;")
    public static final String[] method624(String[] arg0, byte arg1) {
        field1405++;
        String[] var2 = new String[5];
        int var3 = 0;
        if (arg1 != 102) {
            field1399 = 82;
        }
        while (var3 < 5) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)I")
    public static final int method625(int arg0, int arg1, int arg2) {
        field1401++;
        int var3 = arg1 * 57 + arg2;
        int var4 = var3 << 13 ^ var3;
        if (arg0 <= 65) {
            return -33;
        } else {
            int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
            return (var5 & 0x7FA95D1) >> 19;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILbc;Lbc;)V")
    public static final void method626(int arg0, class282 arg1, class282 arg2) {
        field1402++;
        if (arg0 != -15270) {
            method626(-115, (class282) null, (class282) null);
        }
        class197.field2801 = arg1;
        class52.field593 = arg2;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Z")
    public static final boolean method627(int arg0) {
        field1407++;
        if (arg0 != -8113) {
            method628(94);
        }
        if (class270.field3939) {
            try {
                if ((Boolean) class208.method1328(-24232, class115.field1592.field664, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1406 = null;
        if (arg0 >= -42) {
            field1399 = -8;
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)Lwj;")
    public static final class130 method629(int arg0) {
        field1404++;
        byte[] var1 = class277.field4210[0];
        int var2 = class91.field1236[0] * class296.field4677[0];
        int[] var3 = new int[var2];
        if (arg0 != 133862865) {
            return null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3[var4] = class165.field2367[class5.method26(255, var1[var4])];
        }
        class187 var5 = new class187(class238.field3435, class118.field1660, class233.field3367[0], class273.field4041[0], class296.field4677[0], class91.field1236[0], var3);
        class294.method1965(true);
        return var5;
    }
}
