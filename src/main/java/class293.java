import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class293 {

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "[I")
    public static int[] field4358 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4362 = 0;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "J")
    public static long field4363 = 0L;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public static int field4361;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "J")
    public static long field4359;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "[Lpn;")
    public static class170[] field4360;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 22)
    public static final String method2001(byte arg0, String arg1) {
        if (arg0 != -97) {
            method2001((byte) -96, (String) null);
        }
        field4361++;
        int var2 = arg1.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            char var6 = arg1.charAt(var5);
            if (var3 == 0) {
                var6 = Character.toLowerCase(var6);
            } else if (var3 == 2 || Character.isUpperCase(var6)) {
                var6 = class196.method1385(var6, (byte) -20);
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

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 79)
    public static void method2002(int arg0) {
        field4358 = null;
        int var1 = -9 % ((arg0 + 55) / 48);
        field4360 = null;
    }
}
