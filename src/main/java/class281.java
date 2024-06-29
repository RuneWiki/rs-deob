import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class281 {

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "Lij;")
    public class385 field3924 = new class385();

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "Z")
    public boolean field3930 = false;

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3927 = null;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "Lfc;")
    public static class235 field3923 = new class235(1, 0);

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "I")
    public static int field3929 = 0;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "I")
    public int field3926;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(IIIZ)Ljava/lang/String;", line = 5)
    public static final String method1701(int arg0, int arg1, int arg2, boolean arg3) {
        field3925++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg1 >= 0) {
            int var4 = 2;
            if (arg2 >= -93) {
                field3923 = null;
            }
            int var5 = arg1 / arg0;
            while (var5 != 0) {
                var5 /= arg0;
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg1;
                arg1 /= arg0;
                int var9 = var8 - (arg0 * arg1);
                if (var9 < 10) {
                    var6[var7] = (char) (var9 + 48);
                } else {
                    var6[var7] = (char) (var9 + 87);
                }
            }
            return new String(var6);
        } else {
            return Integer.toString(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(I)V", line = 66)
    public static void method1702(int arg0) {
        if (arg0 != 0) {
            method1702(89);
        }
        field3927 = null;
        field3923 = null;
    }
}
