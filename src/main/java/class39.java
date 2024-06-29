import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class39 extends class56 {

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "Lhj;")
    public static class596 field563 = new class596(88, 10);

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!ud", name = "H", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "Lbt;")
    public static class48 field571;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "Lrf;")
    public static class92 field569;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "[Ljava/lang/String;")
    public static String[] field568;

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class39() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(III)I")
    private final int method332(int arg0, int arg1, int arg2) {
        int var4 = 110 % ((15 - arg2) / 54);
        ++field564;
        int var5 = arg0 - -(arg1 * 57);
        int var6 = var5 << 1 ^ var5;
        return -(((var6 * 15731 * var6 + 789221) * var6 - -1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)[I")
    public final int[] method145(int arg0, int arg1) {
        ++field566;
        int[] var3 = super.field752.method1308(false, arg1);
        if (arg0 != 0) {
            return null;
        } else {
            if (super.field752.field2441) {
                int var4 = class349.field4354[arg1];
                for (int var5 = 0; ~class642.field8759 < ~var5; ++var5) {
                    var3[var5] = this.method332(class648.field8837[var5], var4, 89) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(III)Z")
    public static final boolean method333(int arg0, int arg1, int arg2) {
        if (arg1 != 789221) {
            field568 = null;
        }
        ++field567;
        boolean var3 = ~(arg0 & 55) == -1 ? class217.method1352(arg0, arg2, -119) : class37.method325((byte) -76, arg0, arg2);
        return class226.method1386(arg2, arg0, true) | (65536 & arg2) != 0 | var3;
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(Z)I")
    public static final int method334(boolean arg0) {
        if (arg0) {
            return -7;
        } else {
            ++field565;
            int var1 = class757.field10482.method256(79);
            if (~var1 > ~(class425.field5638.length + -1)) {
                class757.field10482 = class425.field5638[var1 + 1];
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V")
    public static void method335(byte arg0) {
        field563 = null;
        field569 = null;
        field571 = null;
        int var1 = 95 % ((arg0 - -32) / 63);
        field568 = null;
    }
}
