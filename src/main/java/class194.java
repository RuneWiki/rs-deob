import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class194 {

    @OriginalMember(owner = "client!da", name = "e", descriptor = "Z")
    public static boolean field3131 = false;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "[C")
    public static char[] field3129 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field3132;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[Lkl;")
    public static class68[] field3130;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(III)J", line = 10)
    public static final long method1239(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field969; var4++) {
            class271 var5 = var3.field974[var4];
            if ((var5.field4191 >> 29 & 0x3L) == 2L && var5.field4180 == arg1 && var5.field4187 == arg2) {
                return var5.field4191;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 38)
    public static void method1240(int arg0) {
        if (arg0 == 8222) {
            field3130 = null;
            field3129 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IZ)Lnc;", line = 54)
    public static final class101 method1241(int arg0, boolean arg1) {
        class101 var2 = (class101) class204.field3339.method1881(!arg1, (long) arg0);
        if (arg1) {
            return (class101) null;
        }
        field3132++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class165.field2673.method2036(4, arg0, (byte) 37);
        class101 var4 = new class101();
        if (var3 != null) {
            var4.method663(arg0, new class202(var3), -110);
        }
        class204.field3339.method1880(var4, (long) arg0, 115);
        return var4;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)Lbf;", line = 79)
    public static final class328 method1242(boolean arg0) {
        field3128++;
        if (arg0) {
            field3129 = (char[]) null;
        }
        return class104.field1803;
    }
}
