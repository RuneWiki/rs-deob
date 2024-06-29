import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class271 {

    @OriginalMember(owner = "client!va", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4343 = "wave2:";

    @OriginalMember(owner = "client!va", name = "c", descriptor = "[I")
    public static int[] field4344 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!va", name = "d", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!va", name = "e", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!va", name = "f", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "Lsb;")
    public static class124 field4342;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1843(int arg0) {
        field4345++;
        if (arg0 != 11673) {
            method1845(-39);
        }
        String var1;
        if (class219.field3514 == 1 && class42.field776 < 2) {
            var1 = class131.field2169 + class185.field3041 + class236.field3730 + " ->";
        } else if (class239.field3761 && class42.field776 < 2) {
            var1 = class135.field2226 + class185.field3041 + class20.field314 + " ->";
        } else if (class232.field3678 && class13.field184[81] && class42.field776 > 2) {
            var1 = class55.method447(-67, class42.field776 - 2);
        } else {
            var1 = class55.method447(-103, class42.field776 - 1);
        }
        if (class42.field776 > 2) {
            var1 = var1 + "<col=ffffff> / " + (class42.field776 - 2) + class91.field1440;
        }
        return var1;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method1844(boolean arg0) {
        if (arg0) {
            field4343 = null;
            field4342 = null;
            field4344 = null;
        }
    }

    @OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
    public static final void method1845(int arg0) {
        for (int var1 = -1; var1 < class144.field2386; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class279.field4431[var1];
            }
            class213 var6 = class191.field3129[var5];
            if (var6 != null && var6.field2864 > 0) {
                var6.field2864--;
                if (var6.field2864 == 0) {
                    var6.field2840 = null;
                }
            }
        }
        field4347++;
        int var2 = 0;
        if (arg0 <= 55) {
            method1843(-87);
        }
        while (class7.field88 > var2) {
            int var3 = class287.field4587[var2];
            class139 var4 = class3.field45[var3];
            if (var4 != null && var4.field2864 > 0) {
                var4.field2864--;
                if (var4.field2864 == 0) {
                    var4.field2840 = null;
                }
            }
            var2++;
        }
    }
}
