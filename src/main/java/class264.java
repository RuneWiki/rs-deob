import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class264 {

    @OriginalMember(owner = "client!rw", name = "f", descriptor = "[C")
    public static char[] field3516 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rw", name = "h", descriptor = "Lrn;")
    public static class633 field3518 = new class633(28, -1);

    @OriginalMember(owner = "client!rw", name = "k", descriptor = "Luaa;")
    public static class391 field3521 = null;

    @OriginalMember(owner = "client!rw", name = "b", descriptor = "I")
    public int field3512;

    @OriginalMember(owner = "client!rw", name = "c", descriptor = "I")
    public int field3513;

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!rw", name = "e", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!rw", name = "g", descriptor = "I")
    public int field3517;

    @OriginalMember(owner = "client!rw", name = "i", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!rw", name = "j", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "Lmd;")
    public static class649 field3511;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(Z)V", line = 4)
    public static void method1671(boolean arg0) {
        if (arg0) {
            method1671(false);
        }
        field3518 = null;
        field3521 = null;
        field3511 = null;
        field3516 = null;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(III)Z", line = 19)
    public static final boolean method1672(int arg0, int arg1, int arg2) {
        field3515++;
        if (arg1 != -32107) {
            field3511 = null;
        }
        return class678.method3642(false, arg0, arg2) & class208.method1400(arg2, arg0, 3938);
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(ILvba;)V", line = 32)
    public static final void method1673(int arg0, class765 arg1) {
        field3519++;
        if (arg1 == null) {
            return;
        }
        if (arg0 != 8212) {
            method1671(false);
        }
        class595.field7563.method3593(arg1, 15);
        class628.field7982++;
        Object var2 = null;
        class403 var5;
        if (arg1.field10407 || "".equals(arg1.field10408)) {
            var5 = new class403(arg1.field10408);
            class486.field6268++;
        } else {
            long var3 = arg1.field10409;
            for (var5 = (class403) class517.field6586.method2616(var3, (byte) -122); var5 != null && !var5.field5366.equals(arg1.field10408); var5 = (class403) class517.field6586.method2615(arg0 ^ 0x201C)) {
            }
            if (var5 == null) {
                var5 = (class403) class655.field8449.method2931(var3, (byte) -77);
                if (var5 != null && !var5.field5366.equals(arg1.field10408)) {
                    var5 = null;
                }
                if (var5 == null) {
                    var5 = new class403(arg1.field10408);
                }
                class517.field6586.method2619(var5, var3, -1);
                class486.field6268++;
            }
        }
        if (var5.method2355(arg1, 2015625216)) {
            class512.method2828(8113, var5);
        }
    }
}
