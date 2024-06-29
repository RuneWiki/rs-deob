import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class153 extends class105 {

    @OriginalMember(owner = "client!r", name = "bb", descriptor = "[I")
    public static int[] field3007 = new int[1000];

    @OriginalMember(owner = "client!r", name = "ab", descriptor = "Leh;")
    private static class47 field3006 = class195.method1282((byte) -4, "Please contact customer support)3");

    @OriginalMember(owner = "client!r", name = "eb", descriptor = "Leh;")
    public static class47 field3010 = field3006;

    @OriginalMember(owner = "client!r", name = "cb", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!r", name = "gb", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!r", name = "Y", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!r", name = "Z", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!r", name = "db", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!r", name = "fb", descriptor = "Lah;")
    public static class9 field3011;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(B)[Lfb;")
    public static final class50[] method1065(byte arg0) {
        ++field3009;
        if (arg0 < 4) {
            return null;
        } else {
            class50[] var1 = new class50[class98.field2085];
            for (int var2 = 0; ~var2 > ~class98.field2085; ++var2) {
                class50 var3 = new class50();
                var3.field980 = class197.field3834;
                var3.field979 = class132.field2604;
                var3.field981 = class69.field1516[var2];
                var3.field983 = class198.field3850[var2];
                var3.field982 = class96.field1979[var2];
                var3.field977 = class109.field2270[var2];
                byte[] var4 = class69.field1511[var2];
                int var5 = var3.field982 * var3.field977;
                var3.field978 = new int[var5];
                for (int var6 = 0; var5 > var6; ++var6) {
                    var3.field978[var6] = class64.field1390[class142.method1018(var4[var6], 255)];
                }
                var1[var2] = var3;
            }
            class95.method755(-59);
            return var1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        ++field3004;
        if (arg1 < 78) {
            method1067(true);
        }
        int[] var3 = super.field2192.method336(-101, arg0);
        if (super.field2192.field770) {
            int var4 = class26.field500[arg0];
            for (int var5 = 0; ~var5 > ~class149.field2928; ++var5) {
                var3[var5] = this.method1066(var4, 0, class167.field3237[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(III)I")
    private final int method1066(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return -89;
        } else {
            int var4 = arg0 * 57 + arg2;
            ++field3005;
            int var5 = var4 ^ var4 << 1;
            return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(Z)V")
    public static void method1067(boolean arg0) {
        field3010 = null;
        field3006 = null;
        if (arg0) {
            method1067(true);
        }
        field3011 = null;
        field3007 = null;
    }
}
