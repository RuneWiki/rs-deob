import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class235 {

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field3195 = new String[100];

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "[C")
    public static char[] field3197 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Z")
    public static boolean field3198 = false;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Lqj;")
    public static class296 field3192;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "Ldi;")
    public static class65 field3194;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 11)
    public static void method1482(byte arg0) {
        field3194 = null;
        field3197 = null;
        field3195 = null;
        if (arg0 != -99) {
            field3192 = null;
        }
        field3192 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(BII)V", line = 24)
    public static final void method1483(byte arg0, int arg1, int arg2) {
        if (arg0 >= -23) {
            return;
        }
        field3193++;
        int var3 = class204.field2769.method448((byte) -95, class344.field4815);
        for (class207 var4 = (class207) class167.field2393.method1312((byte) 25); var4 != null; var4 = (class207) class167.field2393.method1304(-90)) {
            int var8 = class319.method2029(var4, (byte) -76);
            if (var3 < var8) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class390.field5740 * 16 + 21;
        int var6 = arg2 - (var3 / 2);
        if (var3 + var6 > class194.field2696) {
            var6 = class194.field2696 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg1;
        if (class243.field3359 < (var5 + arg1)) {
            var7 = class243.field3359 - var5;
        }
        class377.field5380 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class349.field4882 = true;
        class396.field5781 = class390.field5740 * 16 + (field3198 ? 26 : 22);
        class156.field2206 = var7;
        class340.field4753 = var3;
    }
}
