import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class311 extends class143 {

    @OriginalMember(owner = "client!lh", name = "V", descriptor = "I")
    public static int field5026 = -1;

    @OriginalMember(owner = "client!lh", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field5031 = "M";

    @OriginalMember(owner = "client!lh", name = "W", descriptor = "Lch;")
    public static class306 field5027 = new class306(5000);

    @OriginalMember(owner = "client!lh", name = "bb", descriptor = "I")
    public static int field5032 = -2;

    @OriginalMember(owner = "client!lh", name = "cb", descriptor = "[C")
    public static char[] field5033 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!lh", name = "Y", descriptor = "B")
    public static byte field5029;

    @OriginalMember(owner = "client!lh", name = "U", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!lh", name = "X", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!lh", name = "Z", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZZIBZ)Lgi;")
    public static final class164 method2105(boolean arg0, boolean arg1, int arg2, byte arg3, boolean arg4) {
        if (arg3 > -66) {
            field5033 = null;
        }
        class64 var5 = null;
        ++field5028;
        if (class246.field3878 != null) {
            var5 = new class64(arg2, class246.field3878, class17.field308[arg2], 1000000);
        }
        class79.field1273[arg2] = class123.field1963.method968(true, var5, class169.field2775, arg2);
        if (arg1) {
            class79.field1273[arg2].method911((byte) -35);
        }
        return new class164(class79.field1273[arg2], arg0, arg4);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        ++field5025;
        if (super.field1662.field3063 && this.method985(40)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int var7 = arg0 % super.field2301 * super.field2301;
            for (int var8 = 0; ~class24.field443 < ~var8; ++var8) {
                int var9 = super.field2305[var8 % super.field2311 + var7];
                var5[var8] = class233.method1609(var9 << 4, 4080);
                var6[var8] = class233.method1609(var9, 65280) >> 4;
                var4[var8] = class233.method1609(var9 >> 12, 4080);
            }
        }
        return arg1 != -117 ? null : var3;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)V")
    public static void method2106(byte arg0) {
        field5033 = null;
        if (arg0 == -97) {
            field5031 = null;
            field5027 = null;
        }
    }
}
