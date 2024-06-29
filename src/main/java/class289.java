import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class289 extends class68 {

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "Ljava/lang/String;")
    public static String field4565 = "glow1:";

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "Lvd;")
    public static class4 field4559 = new class4(8);

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field4558;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public static int field4563;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BII)I")
    private final int method1943(byte arg0, int arg1, int arg2) {
        ++field4563;
        int var4 = arg2 * 57 + arg1;
        if (arg0 != 52) {
            this.method32(-16, -29);
        }
        int var5 = var4 << 1 ^ var4;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLhc;)V")
    public static final void method1944(byte arg0, class235 arg1) {
        ++field4561;
        class296.field4665 = arg1;
        class94.field1317 = class296.field4665.method1577(16, -6339);
        if (arg0 <= 18) {
            field4562 = 58;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method1945(String arg0, byte arg1) {
        ++field4558;
        for (int var2 = 0; ~class23.field329.length < ~var2; ++var2) {
            if (class23.field329[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        int var3 = 125 / ((arg1 - -12) / 50);
        return -1;
    }

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "(B)V")
    public static void method1946(byte arg0) {
        int var1 = -86 / ((arg0 - 40) / 51);
        field4565 = null;
        field4559 = null;
    }

    @OriginalMember(owner = "client!rf", name = "<init>", descriptor = "()V")
    public class289() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(IB)V")
    public static final void method1947(int arg0, byte arg1) {
        ++field4560;
        if (arg1 != -40) {
            method1947(57, (byte) 126);
        }
        class280 var2 = class181.method1180(arg0, 0, 5);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            return null;
        } else {
            ++field4564;
            int[] var3 = super.field917.method1920(arg0, true);
            if (super.field917.field4474) {
                int var4 = class127.field1794[arg0];
                for (int var5 = 0; var5 < class89.field1248; ++var5) {
                    var3[var5] = this.method1943((byte) 52, class215.field3231[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }
}
