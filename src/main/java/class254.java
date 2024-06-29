import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class254 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4383 = 0;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "Ljd;")
    public static class85 field4384 = class221.method1499("settings", (byte) -90);

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Ljd;")
    public static class85 field4391 = class221.method1499("www)2wtrc", (byte) -90);

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "Ljd;")
    public static class85 field4390 = class221.method1499(")3)3)3", (byte) -116);

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "Ljd;")
    private static class85 field4386 = class221.method1499("Select", (byte) 122);

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "Z")
    public static boolean field4388 = false;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Ljd;")
    public static class85 field4381 = field4386;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "I")
    public static int field4387;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4389;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIILrh;)V")
    public static final void method1754(int arg0, int arg1, int arg2, class44 arg3) {
        if (arg3.field1056 == arg2 && arg2 != -1) {
            class106 var4 = class101.method704(1, arg2);
            int var5 = var4.field1852;
            if (var5 == 1) {
                arg3.field1061 = 0;
                arg3.field1053 = arg1;
                arg3.field1069 = 0;
                arg3.field1044 = 0;
                class163.method1080(var4, arg3.field1042, arg3.field1027, arg3.field1044, 21983, class22.field308 == arg3);
            }
            if (var5 == 2) {
                arg3.field1061 = 0;
            }
        } else if (arg2 == -1 || arg3.field1056 == -1 || class101.method704(1, arg2).field1876 >= class101.method704(1, arg3.field1056).field1876) {
            arg3.field1063 = arg3.field1030;
            arg3.field1061 = 0;
            arg3.field1069 = 0;
            arg3.field1044 = 0;
            arg3.field1056 = arg2;
            arg3.field1053 = arg1;
            if (arg3.field1056 != -1) {
                class163.method1080(class101.method704(1, arg3.field1056), arg3.field1042, arg3.field1027, arg3.field1044, 21983, class22.field308 == arg3);
            }
        }
        int var6 = 110 / ((13 - arg0) / 56);
        field4380++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1755(int arg0) {
        if (arg0 != -1) {
            method1755(-116);
        }
        field4391 = null;
        field4386 = null;
        field4389 = null;
        field4384 = null;
        field4381 = null;
        field4390 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lc;B)V")
    public static final void method1756(class103 arg0, byte arg1) {
        field4385++;
        for (int var2 = 0; var2 < class30.field453.length; var2++) {
            class30.field453[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class30.field453[var16] = (int) (Math.random() * 284.0D);
        }
        if (arg1 <= 47) {
            return;
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class85.field1567[var15] = (class30.field453[var15 + 1] + class30.field453[var15 - 1] + class30.field453[var15 - -128] + class30.field453[var15 - 128]) / 4;
                }
            }
            int[] var13 = class30.field453;
            class30.field453 = class85.field1567;
            class85.field1567 = var13;
        }
        if (arg0 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg0.field3994; var7++) {
            for (int var8 = 0; var8 < arg0.field4003; var8++) {
                if (arg0.field1830[var6++] != 0) {
                    int var9 = var8 + arg0.field4004 + 16;
                    int var10 = var7 + arg0.field4001 + 16;
                    int var11 = var9 + (var10 << 7);
                    class30.field453[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method1757(String arg0, int arg1) throws ClassNotFoundException {
        field4387++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        }
        int var2 = -74 % ((arg1 + 12) / 54);
        if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIII)V")
    public static final void method1758(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4382++;
        class207.field3618.field4224 = 0;
        class207.field3618.method1714(47, arg4 - 714048120);
        class207.field3618.method1714(arg2, arg4 - 714048120);
        class207.field3618.method1714(arg1, arg4 - 714048120);
        class207.field3618.method1703(arg3, arg4 ^ 0xFFFFEC01);
        class207.field3618.method1703(arg0, -119);
        class177.field3032 = 0;
        class112.field1965 = -3;
        class86.field1616 = 0;
        if (arg4 != 5000) {
            method1756((class103) null, (byte) -2);
        }
        class115.field2056 = 1;
    }
}
