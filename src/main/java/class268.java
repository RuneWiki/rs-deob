import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class268 extends class181 {

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[C")
    public static char[] field4176 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public int field4171;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field4172;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public int field4175;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIBI)I")
    public static final int method1810(int arg0, int arg1, byte arg2, int arg3) {
        field4174++;
        if (class166.field2451 == null) {
            return 0;
        }
        if (arg2 != 118) {
            field4176 = null;
        }
        int var4 = arg1 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg0;
        int var7 = arg1 & 0x7F;
        if (arg0 < 3 && (class247.field3844[1][var4][var5] & 0x2) == 2) {
            var6 = arg0 + 1;
        }
        int var8 = (128 - var7) * class166.field2451[var6][var4][var5] + class166.field2451[var6][var4 + 1][var5] * var7 >> 7;
        int var9 = (128 - var7) * class166.field2451[var6][var4][var5 + 1] + class166.field2451[var6][var4 + 1][var5 + 1] * var7 >> 7;
        int var10 = arg3 & 0x7F;
        return (128 - var10) * var8 + var9 * var10 >> 7;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(B)V")
    public static void method1811(byte arg0) {
        if (arg0 <= 60) {
            method1810(25, 36, (byte) -52, -21);
        }
        field4176 = null;
    }
}
