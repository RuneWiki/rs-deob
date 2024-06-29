import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class206 {

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "[I")
    public static int[] field3271 = new int[64];

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "I")
    public static int field3282 = 0;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3281 = "Created gameworld";

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Lqd;")
    public static class173 field3273 = new class173(16);

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3272;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3278;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3280;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3283;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static final void method1438(byte arg0) {
        if (arg0 > 75) {
            class84.field1390.method1257(-118);
            field3277++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public static final void method1439(int arg0) {
        field3270++;
        for (int var1 = 0; var1 < 5; var1++) {
            class195.field3155[var1] = false;
        }
        class161.field2551 = arg0;
        class13.field139 = -1;
        class264.field4238 = -1;
        class120.field1919 = 1;
        class299.field4796 = 0;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V")
    public static final void method1440(int arg0, byte arg1) {
        field3283++;
        class175 var2 = class182.method1317(9, arg0, false);
        if (arg1 != 125) {
            field3271 = null;
        }
        var2.method1278((byte) 114);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)V")
    public static final void method1441(boolean arg0, int arg1) {
        field3280++;
        if (!arg0) {
            return;
        }
        for (class128 var2 = class143.field2269.method1063(-113); var2 != null; var2 = class143.field2269.method1055(18178)) {
            if ((long) arg1 == (var2.field2012 >> 48 & 0xFFFFL)) {
                var2.method913(-3542);
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(I)V")
    public static void method1442(int arg0) {
        field3271 = null;
        if (arg0 != 28355) {
            field3281 = null;
        }
        field3273 = null;
        field3281 = null;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public static final void method1443(int arg0) {
        field3272++;
        if (arg0 != 2568) {
            method1441(false, -51);
        }
        class84.field1392.method2119(-994449848);
        class22.field272 = 1;
        class62.field1026 = null;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(B)Lcf;")
    public static final class175 method1444(byte arg0) {
        field3279++;
        if (arg0 < 81) {
            field3274 = -79;
        }
        class175 var1 = (class175) class245.field3897.method389(0);
        if (var1 != null) {
            var1.method913(-3542);
            var1.method956(256);
            return var1;
        }
        class175 var2;
        do {
            var2 = (class175) class265.field4264.method389(0);
            if (var2 == null) {
                return null;
            }
            if (var2.method1285(-53) > class191.method1350((byte) 120)) {
                return null;
            }
            var2.method913(-3542);
            var2.method956(256);
        } while ((var2.field2169 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()V")
    public static final void method1445() {
        if (class243.field3862 != null) {
            for (int var0 = 0; var0 < class243.field3862.length; var0++) {
                for (int var1 = 0; var1 < class96.field1548; var1++) {
                    for (int var2 = 0; var2 < class59.field972; var2++) {
                        class243.field3862[var0][var1][var2] = null;
                    }
                }
            }
        }
        if (class267.field4301 != null) {
            for (int var3 = 0; var3 < class267.field4301.length; var3++) {
                for (int var4 = 0; var4 < class96.field1548; var4++) {
                    for (int var5 = 0; var5 < class59.field972; var5++) {
                        class267.field4301[var3][var4][var5] = null;
                    }
                }
            }
        }
        class261.field4200 = 0;
        if (class13.field133 != null) {
            for (int var6 = 0; var6 < class261.field4200; var6++) {
                class13.field133[var6] = null;
            }
        }
        if (class151.field2343 != null) {
            for (int var7 = 0; var7 < class18.field217; var7++) {
                class151.field2343[var7] = null;
            }
            class18.field217 = 0;
        }
        if (class136.field2155 != null) {
            for (int var8 = 0; var8 < class136.field2155.length; var8++) {
                class136.field2155[var8] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public static final String method1446(int arg0, byte arg1) {
        if (arg1 != -98) {
            field3274 = -19;
        }
        field3275++;
        return arg0 < 999999999 ? Integer.toString(arg0) : "*";
    }
}
