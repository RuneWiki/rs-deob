import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class237 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field3717 = 50;

    @OriginalMember(owner = "client!e", name = "o", descriptor = "Lcd;")
    public static class136 field3723 = null;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "[I")
    public static int[] field3725 = new int[50];

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public int field3709;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public int field3710;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field3712;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public int field3714;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public int field3721;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    public int field3722;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public int field3724;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public int field3726;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "J")
    public static long field3718;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lug;")
    public static class253 field3716;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "Lug;")
    public static class253 field3719;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "[B")
    public byte[] field3713;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "[B")
    public byte[] field3720;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIILug;)[Luj;", line = 7)
    public static final class169[] method1699(int arg0, int arg1, int arg2, class253 arg3) {
        field3715++;
        int var4 = 89 / ((-arg1 - 63) / 38);
        return class287.method2029(arg3, arg0, 2, arg2) ? class316.method2204((byte) 124) : null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 41)
    public static final String method1700(String arg0, int arg1) {
        field3712++;
        int var2 = arg0.length();
        int var3 = arg1;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg0.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class192.method1422(181, var6);
            }
            if (Character.isLetter(var6)) {
                var3 = 0;
            } else if (var6 == '.' || var6 == '?' || var6 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var6)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var5] = var6;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 91)
    public static void method1701(int arg0) {
        field3725 = null;
        field3716 = null;
        if (arg0 <= 31) {
            field3718 = -29L;
        }
        field3723 = null;
        field3719 = null;
    }
}
