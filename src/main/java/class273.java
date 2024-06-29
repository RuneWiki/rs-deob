import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class273 extends class335 {

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "[I")
    public static int[] field4233 = new int[2000];

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "I")
    public static int field4228 = -1;

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "Lql;")
    public static class87 field4229 = new class87();

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    public static int field4235 = -1;

    @OriginalMember(owner = "client!lk", name = "L", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!lk", name = "M", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "[I")
    public static int[] field4232;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)I", line = 4)
    private final int method1877(int arg0, int arg1, int arg2) {
        field4231++;
        int var4 = arg0 * 57 + arg1;
        int var5 = var4 << 1 ^ var4;
        if (arg2 != -1376312589) {
            this.method1877(84, 59, -70);
        }
        return 4096 - (((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)V", line = 20)
    public static void method1878(byte arg0) {
        field4233 = null;
        field4229 = null;
        if (arg0 >= -22) {
            method1880((class249[]) null, (class133) null, (byte) -30);
        }
        field4232 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)[I", line = 34)
    public final int[] method149(int arg0, int arg1) {
        field4230++;
        if (arg1 != 621) {
            return (int[]) null;
        }
        int[] var3 = this.field5233.method1110((byte) 108, arg0);
        if (this.field5233.field2467) {
            int var4 = class280.field4316[arg0];
            for (int var5 = 0; var5 < class105.field1630; var5++) {
                var3[var5] = this.method1877(var4, class90.field1437[var5], -1376312589) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILtb;IB)V", line = 66)
    public static final void method1879(int arg0, class220 arg1, int arg2, byte arg3) {
        field4234++;
        if (arg3 != 50) {
            method1880((class249[]) null, (class133) null, (byte) 119);
        }
        if (class301.field4706 < 2 && class313.field4858 == 0 && !class35.field545) {
            return;
        }
        String var4 = class274.method1883(14);
        if (arg1 == null) {
            int var6 = class344.field5343.method2233(var4, arg2 + 4, arg0 + 15, 16777215, 0, class191.field2858, class308.field4794);
            class55.method450(arg2 + 4, arg0, true, class344.field5343.method2228(var4) + var6, 15);
            return;
        }
        class329 var5 = arg1.method1560(class78.field1251, true);
        if (var5 == null) {
            var5 = class344.field5343;
        }
        var5.method2244(var4, arg2, arg0, arg1.field3526, arg1.field3458, arg1.field3487, arg1.field3402, arg1.field3512, arg1.field3374, class191.field2858, class308.field4794, class182.field2740);
        class55.method450(class182.field2740[0], class182.field2740[1], true, class182.field2740[2], class182.field2740[3]);
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 100)
    public class273() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "([Lgm;Ll;B)V", line = 108)
    public static final void method1880(class249[] arg0, class133 arg1, byte arg2) {
        if (arg2 != 48) {
            field4235 = 121;
        }
        class141.field2183 = arg0;
        class105.field1628 = arg1;
        class175.field2646 = new boolean[class141.field2183.length];
        class71.field1172.method1226(arg2 ^ 0x30);
        field4227++;
        int var3 = class105.field1628.method970("details", (byte) -10);
        int[] var4 = class105.field1628.method973(0, var3);
        for (int var5 = 0; var5 < var4.length; var5++) {
            class71.field1172.method1227(class327.method2221(arg2 ^ 0x19, new class166(class105.field1628.method980(var3, var4[var5], 5)), var4[var5]), 0, (long) var4[var5]);
        }
    }
}
