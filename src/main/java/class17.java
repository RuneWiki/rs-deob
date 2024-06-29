import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class17 extends class124 {

    @OriginalMember(owner = "client!vd", name = "T", descriptor = "Lqj;")
    public static class183 field226 = new class183();

    @OriginalMember(owner = "client!vd", name = "Z", descriptor = "I")
    public static int field232 = 0;

    @OriginalMember(owner = "client!vd", name = "W", descriptor = "Le;")
    public static class191 field229 = class54.method368("_labels", 2047);

    @OriginalMember(owner = "client!vd", name = "bb", descriptor = "[I")
    public static int[] field234 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!vd", name = "P", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!vd", name = "Q", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!vd", name = "R", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!vd", name = "S", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!vd", name = "U", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!vd", name = "V", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!vd", name = "X", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!vd", name = "Y", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!vd", name = "ab", descriptor = "Lng;")
    public static class121 field233;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(III)V")
    public static final void method130(int arg0, int arg1, int arg2) {
        int var3 = arg0--;
        if (~var3 < -26) {
            var3 = 25;
        }
        int var4 = class19.field256[arg0];
        int var5 = class196.field3502[arg0];
        if (~arg1 == -1) {
            ++class53.field964;
            class53.field963.method1096(213, 0);
            class53.field963.method1613(var3 + var3 - -3, arg2 ^ 71);
        }
        ++field222;
        if (arg1 == 1) {
            ++class218.field3838;
            class53.field963.method1096(24, 0);
            class53.field963.method1613(var3 + 3 - -14 + var3, 21);
        }
        if (~arg1 == -3) {
            ++class209.field3706;
            class53.field963.method1096(23, 0);
            class53.field963.method1613(var3 + var3 + 3, 21);
        }
        class53.field963.method1604(9945, class88.field1438[arg2] ? 1 : 0);
        class53.field963.method1602(class193.field3474 + var5, false);
        class53.field963.method1602(class225.field4061 + var4, false);
        class146.field2459 = class19.field256[0];
        class22.field317 = class196.field3502[0];
        for (int var6 = 1; var6 < var3; ++var6) {
            --arg0;
            class53.field963.method1604(arg2 + 9863, class19.field256[arg0] + -var4);
            class53.field963.method1597(true, class196.field3502[arg0] + -var5);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 <= 68) {
            method134(-19, (class182) null);
        }
        int[] var3 = super.field2064.method378(arg1, 0);
        ++field227;
        if (super.field2064.field1035) {
            int var4 = class236.field4202[arg1];
            for (int var5 = 0; ~class64.field1132 < ~var5; ++var5) {
                var3[var5] = this.method135(var4, (byte) -104, class257.field4559[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lji;IZ)Le;")
    public static final class191 method132(class225 arg0, int arg1, boolean arg2) {
        ++field231;
        try {
            class191 var3 = new class191();
            var3.field3379 = arg0.method1577(!arg2);
            if (!arg2) {
                method132((class225) null, -89, true);
            }
            if (~arg1 > ~var3.field3379) {
                var3.field3379 = arg1;
            }
            var3.field3392 = new byte[var3.field3379];
            arg0.field3996 += class97.field1556.method1230(var3.field3379, -78, arg0.field3996, 0, arg0.field3995, var3.field3392);
            return var3;
        } catch (Exception var4) {
            return class83.field1388;
        }
    }

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "(I)V")
    public static void method133(int arg0) {
        field229 = null;
        field233 = null;
        field226 = null;
        field234 = null;
        if (arg0 != -30164) {
            method130(-38, 61, -119);
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILek;)V")
    public static final void method134(int arg0, class182 arg1) {
        ++field228;
        if (arg0 != 0) {
            method134(67, (class182) null);
        }
        class97.field1556 = arg1;
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
    public class17() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBI)I")
    private final int method135(int arg0, byte arg1, int arg2) {
        int var4 = arg0 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        ++field225;
        if (arg1 >= -10) {
            method133(119);
        }
        return 4096 - (Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144;
    }
}
