import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class461 extends class13 {

    @OriginalMember(owner = "client!de", name = "X", descriptor = "Lig;")
    public static class206 field6872 = new class206(17, 2);

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "[C")
    public static char[] field6874 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "[I")
    public static int[] field6875 = new int[8];

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    public static int field6877 = 100;

    @OriginalMember(owner = "client!de", name = "db", descriptor = "[I")
    public static int[] field6878 = new int[6];

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    public static int field6873;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "Lwh;")
    public static class129 field6876;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)[[I")
    public final int[][] method75(byte arg0, int arg1) {
        ++field6873;
        int[][] var3 = super.field1792.method1826(arg1, -16486);
        if (arg0 >= -28) {
            field6877 = 21;
        }
        if (super.field1792.field3917 && this.method80((byte) 16)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field100 * super.field100;
            for (int var8 = 0; ~class647.field9368 < ~var8; ++var8) {
                int var9 = super.field111[var7 - -(var8 % super.field104)];
                var6[var8] = class643.method3659(4080, var9 << 4);
                var5[var8] = class643.method3659(var9 >> 4, 4080);
                var4[var8] = class643.method3659(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(Z)V")
    public static void method2835(boolean arg0) {
        if (!arg0) {
            field6876 = null;
        }
        field6874 = null;
        field6876 = null;
        field6875 = null;
        field6872 = null;
        field6878 = null;
    }
}
