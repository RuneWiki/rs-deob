import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class195 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2913 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2916 = "flash3:";

    @OriginalMember(owner = "client!da", name = "k", descriptor = "I")
    public static int field2920 = 0;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static int field2919 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "Ll;")
    public static class133 field2918;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Lad;")
    public static class326 field2911;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field2917;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 8)
    public static final String method1387(String arg0, byte arg1) {
        field2910++;
        int var2 = arg0.length();
        byte var3 = 2;
        char[] var4 = new char[var2];
        int var5 = -38 / ((arg1 - 64) / 33);
        for (int var6 = 0; var6 < var2; var6++) {
            char var7 = arg0.charAt(var6);
            if (var3 == 0) {
                var7 = Character.toLowerCase(var7);
            } else if (var3 == 2 || Character.isUpperCase(var7)) {
                var7 = class131.method938(var7, -1);
            }
            if (Character.isLetter(var7)) {
                var3 = 0;
            } else if (var7 == '.' || var7 == '?' || var7 == '!') {
                var3 = 2;
            } else if (!Character.isSpaceChar(var7)) {
                var3 = 1;
            } else if (var3 != 2) {
                var3 = 1;
            }
            var4[var6] = var7;
        }
        return new String(var4);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ll;ILl;II)Lte;", line = 68)
    public static final class124 method1388(class133 arg0, int arg1, class133 arg2, int arg3, int arg4) {
        field2912++;
        if (arg4 != 255) {
            field2917 = (Frame) null;
        }
        return class181.method1296(false, arg2, arg1, arg3) ? class247.method1696(arg4 ^ 0xFFFF8D39, arg0.method980(arg1, arg3, arg4 ^ 0xFA)) : null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Lqb;)V", line = 84)
    public static final void method1389(class26 arg0) {
        for (int var1 = arg0.field411; var1 <= arg0.field405; var1++) {
            for (int var2 = arg0.field410; var2 <= arg0.field396; var2++) {
                class142 var3 = class256.field4013[arg0.field400][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field2204; var4++) {
                        if (var3.field2197[var4] == arg0) {
                            var3.field2204--;
                            for (int var5 = var4; var5 < var3.field2204; var5++) {
                                var3.field2197[var5] = var3.field2197[var5 + 1];
                                var3.field2193[var5] = var3.field2193[var5 + 1];
                            }
                            var3.field2197[var3.field2204] = null;
                            break;
                        }
                    }
                    var3.field2208 = 0;
                    for (int var6 = 0; var6 < var3.field2204; var6++) {
                        var3.field2208 |= var3.field2193[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V", line = 169)
    public static void method1390(int arg0) {
        field2913 = null;
        field2918 = null;
        field2911 = null;
        field2917 = null;
        field2916 = null;
        if (arg0 <= 122) {
            field2919 = -44;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IBI)Lrj;", line = 191)
    public static final class338 method1391(int arg0, byte arg1, int arg2) {
        if (arg1 != -92) {
            method1390(-86);
        }
        field2914++;
        class338 var3 = (class338) class244.field3901.method1222(0, (long) arg0 << 32 | (long) arg2);
        if (var3 == null) {
            var3 = new class338(arg0, arg2);
            class244.field3901.method1227(var3, 0, var3.field758);
        }
        return var3;
    }
}
