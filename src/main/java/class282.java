import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class282 {

    @OriginalMember(owner = "client!k", name = "e", descriptor = "[[Z")
    public static boolean[][] field4023 = new boolean[][] { new boolean[0], { true, false, true }, { true, false, false, true }, { false, false, true, true }, { true, true, false }, { false, true, true }, { true, false, false, true }, { false, false, false, true, true }, { false, true, true }, { true, false, true, true, true }, { false, true, true, true, true }, { false, true, true, true, true, false } };

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!k", name = "f", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!k", name = "g", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!k", name = "h", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Lvn;")
    public static class11 field4020;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "Lkk;")
    public static class295 field4021;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V", line = 7)
    public static void method1920(byte arg0) {
        field4021 = null;
        field4023 = (boolean[][]) null;
        field4020 = null;
        if (arg0 >= -107) {
            method1924(true, 5);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)I", line = 28)
    public static final int method1921(int arg0, int arg1, int arg2, int arg3) {
        field4026++;
        int var4 = arg3 & arg1;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 1023 - arg2;
        } else if (var4 == 2) {
            return 1023 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 47)
    public static final void method1922(int arg0) {
        class240.field3490.method1301(arg0);
        int var1 = class240.field3490.method1311(1, 7);
        field4025++;
        if (var1 == 0) {
            return;
        }
        int var2 = class240.field3490.method1311(2, 7);
        if (var2 == 0) {
            class35.field430[class318.field4689++] = 2047;
        } else if (var2 == 1) {
            int var11 = class240.field3490.method1311(3, 7);
            class359.field5616.method2296(var11, arg0 - 24890, 1);
            int var12 = class240.field3490.method1311(1, 7);
            if (var12 == 1) {
                class35.field430[class318.field4689++] = 2047;
            }
        } else if (var2 == 2) {
            if (class240.field3490.method1311(1, 7) == 1) {
                int var3 = class240.field3490.method1311(3, 7);
                class359.field5616.method2296(var3, -24892, 2);
                int var4 = class240.field3490.method1311(3, 7);
                class359.field5616.method2296(var4, -24892, 2);
            } else {
                int var5 = class240.field3490.method1311(3, 7);
                class359.field5616.method2296(var5, -24892, 0);
            }
            int var6 = class240.field3490.method1311(1, 7);
            if (var6 == 1) {
                class35.field430[class318.field4689++] = 2047;
            }
        } else if (var2 == 3) {
            int var7 = class240.field3490.method1311(7, 7);
            int var8 = class240.field3490.method1311(1, 7);
            int var9 = class240.field3490.method1311(1, 7);
            if (var9 == 1) {
                class35.field430[class318.field4689++] = 2047;
            }
            class56.field724 = class240.field3490.method1311(2, 7);
            int var10 = class240.field3490.method1311(7, 7);
            class359.field5616.method1700(var7, var8 == 1, (byte) -42, var10);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIIBII)V", line = 133)
    public static final void method1923(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field4019++;
        int var8 = class289.method1984(class207.field2937, arg7, 1, class25.field292);
        if (arg5 < 60) {
            field4022 = -63;
        }
        int var9 = class289.method1984(class207.field2937, arg0, 1, class25.field292);
        int var10 = class289.method1984(class245.field3574, arg4, 1, class321.field4722);
        int var11 = class289.method1984(class245.field3574, arg6, 1, class321.field4722);
        int var12 = class289.method1984(class207.field2937, arg7 + arg1, 1, class25.field292);
        int var13 = class289.method1984(class207.field2937, arg0 - arg1, 1, class25.field292);
        for (int var14 = var8; var14 < var12; var14++) {
            class96.method697((byte) 115, class331.field4902[var14], arg3, var10, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class96.method697((byte) 115, class331.field4902[var15], arg3, var10, var11);
        }
        int var16 = class289.method1984(class245.field3574, arg4 + arg1, 1, class321.field4722);
        int var17 = class289.method1984(class245.field3574, arg6 - arg1, 1, class321.field4722);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class331.field4902[var18];
            class96.method697((byte) 115, var19, arg3, var10, var16);
            class96.method697((byte) 115, var19, arg2, var16, var17);
            class96.method697((byte) 115, var19, arg3, var17, var11);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ZI)Lho;", line = 186)
    public static final class287 method1924(boolean arg0, int arg1) {
        field4024++;
        class287 var2 = (class287) class268.field3861.method2265((long) arg1, (byte) 78);
        if (var2 != null) {
            return var2;
        } else if (arg0) {
            byte[] var3 = class16.field190.method1089(36, (byte) 118, arg1);
            class287 var4 = new class287();
            var4.field4148 = arg1;
            if (var3 != null) {
                var4.method1964(new class299(var3), 0);
            }
            class268.field3861.method2257(-125, var4, (long) arg1);
            return var4;
        } else {
            return (class287) null;
        }
    }
}
