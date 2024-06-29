import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class131 extends class183 {

    @OriginalMember(owner = "client!cf", name = "T", descriptor = "Ljf;")
    public static class229 field2310 = class212.method1457((byte) 67, ",Mcran)2titre charg-B");

    @OriginalMember(owner = "client!cf", name = "W", descriptor = "I")
    public static int field2313 = 0;

    @OriginalMember(owner = "client!cf", name = "ab", descriptor = "Z")
    public static boolean field2317 = false;

    @OriginalMember(owner = "client!cf", name = "db", descriptor = "Ljf;")
    public static class229 field2320 = class212.method1457((byte) 122, "0");

    @OriginalMember(owner = "client!cf", name = "X", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!cf", name = "Y", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!cf", name = "Z", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!cf", name = "bb", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!cf", name = "V", descriptor = "Lek;")
    public static class185 field2312;

    @OriginalMember(owner = "client!cf", name = "cb", descriptor = "[Ljf;")
    public static class229[] field2319;

    @OriginalMember(owner = "client!cf", name = "U", descriptor = "[S")
    public static short[] field2311;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V", line = 12)
    public class131() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZZ)V", line = 19)
    public static final void method913(boolean arg0, boolean arg1) {
        if ((class301.field5124.field1983 >> 7) == class23.field418 && (class301.field5124.field2028 >> 7) == class73.field1395) {
            class23.field418 = 0;
        }
        int var2 = class132.field2323;
        if (arg0) {
            var2 = 1;
        }
        field2318++;
        if (arg1) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class33 var4;
            long var5;
            if (arg0) {
                var4 = class301.field5124;
                var5 = 8791798054912L;
            } else {
                var5 = (long) class90.field1652[var3] << 32;
                var4 = class192.field3334[class90.field1652[var3]];
            }
            if (var4 != null && var4.method302(0)) {
                var4.field645 = false;
                int var7 = var4.field2028 >> 7;
                int var8 = var4.field1983 >> 7;
                if ((class308.field5212 && class132.field2323 > 200 || class132.field2323 > 50) && !arg0 && var4.field2025 == var4.field1986) {
                    var4.field645 = true;
                }
                if (var8 >= 0 && var8 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field612 == null || class199.field3475 < var4.field643 || var4.field639 <= class199.field3475) {
                        if (var4.method299(true) == 1 && (var4.field1983 & 0x7F) == 64 && (var4.field2028 & 0x7F) == 64) {
                            if (class26.field474[var8][var7] == class295.field5049) {
                                continue;
                            }
                            class26.field474[var8][var7] = class295.field5049;
                        }
                        var4.field1973 = class282.method1984((byte) -117, var4.field2028, var4.field1983, class16.field254);
                        class106.method719(class16.field254, var4.field1983, var4.field2028, var4.field1973, var4.method299(true) * 64 + 60 - 64, var4, var4.field1987, var5, var4.field2034);
                    } else {
                        var4.field645 = false;
                        var4.field1973 = class282.method1984((byte) -95, var4.field2028, var4.field1983, class16.field254);
                        class125.method884(class16.field254, var4.field1983, var4.field2028, var4.field1973, var4, var4.field1987, var5, var4.field629, var4.field608, var4.field615, var4.field619);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(B)V", line = 105)
    public static void method914(byte arg0) {
        field2319 = null;
        field2320 = null;
        int var1 = 118 / ((58 - arg0) / 53);
        field2311 = null;
        field2310 = null;
        field2312 = null;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(II)[I", line = 121)
    public final int[] method10(int arg0, int arg1) {
        field2316++;
        if (arg1 != -1) {
            this.method10(-110, -122);
        }
        return class97.field1737;
    }
}
