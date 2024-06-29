import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class52 {

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "I")
    public int field59;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field61;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public static int field65;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public static int field66;

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Lud;")
    public static class190 field62;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "(I)V")
    public static final void method13(int arg0) {
        field61++;
        if (arg0 != 1) {
            return;
        }
        for (class14 var1 = (class14) class2.field51.method404(false); var1 != null; var1 = (class14) class2.field51.method414(-120)) {
            if (var1.field269 != null) {
                class26.field467.method141(var1.field269);
                var1.field269 = null;
            }
            if (var1.field264 != null) {
                class26.field467.method141(var1.field264);
                var1.field264 = null;
            }
        }
        class2.field51.method407(2);
    }

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
    public static void method14(int arg0) {
        int var1 = 123 % ((arg0 + 27) / 50);
        field62 = null;
    }

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)Loh;")
    public final class140 method15(int arg0) {
        field64++;
        return arg0 == 7 ? class60.method336(this.field59, 10).method744(115, this.field60, 0, null) : null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lre;)V")
    public static final void method16(class164 arg0) {
        for (int var1 = arg0.field2954; var1 <= arg0.field2949; var1++) {
            for (int var2 = arg0.field2945; var2 <= arg0.field2957; var2++) {
                class90 var3 = class190.field3704[arg0.field2941][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1680; var4++) {
                        if (var3.field1686[var4] == arg0) {
                            var3.field1680--;
                            for (int var5 = var4; var5 < var3.field1680; var5++) {
                                var3.field1686[var5] = var3.field1686[var5 + 1];
                                var3.field1692[var5] = var3.field1692[var5 + 1];
                            }
                            var3.field1686[var3.field1680] = null;
                            break;
                        }
                    }
                    var3.field1682 = 0;
                    for (int var6 = 0; var6 < var3.field1680; var6++) {
                        var3.field1682 |= var3.field1692[var6];
                    }
                }
            }
        }
    }
}
