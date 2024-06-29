import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class301 {

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "I")
    public static int field4602 = -1;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "[C")
    public static char[] field4603 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field4604 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field4600;

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "I")
    public static int field4605;

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!vm", name = "h", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "[Z")
    public static boolean[] field4601;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 4)
    public static void method2092(byte arg0) {
        field4603 = null;
        field4601 = null;
        if (arg0 != -93) {
            method2093(116);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 23)
    public static final void method2093(int arg0) {
        field4606++;
        for (int var1 = -1; var1 < class56.field706; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class20.field239[var1];
            }
            class195 var3 = class241.field3592[var2];
            if (var3 != null && var3.field1511 > 0) {
                var3.field1511--;
                if (var3.field1511 == 0) {
                    var3.field1526 = null;
                }
            }
        }
        if (arg0 != 0) {
            return;
        }
        for (int var4 = 0; var4 < class172.field2577; var4++) {
            int var5 = class56.field711[var4];
            class69 var6 = class187.field2788[var5];
            if (var6 != null && var6.field1511 > 0) {
                var6.field1511--;
                if (var6.field1511 == 0) {
                    var6.field1526 = null;
                }
            }
        }
    }
}
