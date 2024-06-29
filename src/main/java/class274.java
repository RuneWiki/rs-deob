import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class274 {

    @OriginalMember(owner = "client!tea", name = "e", descriptor = "[C")
    public static char[] field3712 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!tea", name = "c", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!tea", name = "d", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "I")
    public int field3713;

    @OriginalMember(owner = "client!tea", name = "g", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "[J")
    public static long[] field3708;

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
    public static void method1671(int arg0) {
        field3712 = null;
        if (arg0 != 23408) {
            method1671(88);
        }
        field3708 = null;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Luw;")
    public static final class175 method1672(int arg0, int arg1) {
        field3711++;
        class175 var2 = (class175) class101.field1229.method3026(-128, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class314.field4517.method1087(arg1, 0, 1);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else if (arg0 >= -117) {
            return null;
        } else {
            class175 var4 = class285.method1710(var3, false);
            class101.field1229.method3027((long) arg1, var4, (byte) 111);
            return var4;
        }
    }
}
