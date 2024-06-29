import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class255 {

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field4364 = -1;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "[Lke;")
    public static class256[] field4361 = new class256[1000];

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Lke;")
    public static class256 field4362 = class316.method2202("<col=00ff00>", 27626);

    @OriginalMember(owner = "client!th", name = "j", descriptor = "I")
    public static int field4369 = 0;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "Z")
    public static boolean field4368 = true;

    @OriginalMember(owner = "client!th", name = "g", descriptor = "[I")
    public static int[] field4366 = new int[100];

    @OriginalMember(owner = "client!th", name = "n", descriptor = "I")
    public static int field4373 = 0;

    @OriginalMember(owner = "client!th", name = "q", descriptor = "Lke;")
    private static class256 field4376 = class316.method2202("Your ignore list is full)3 Max of 100 users)3", 27626);

    @OriginalMember(owner = "client!th", name = "p", descriptor = "Lke;")
    public static class256 field4375 = class316.method2202("Bitte warten Sie)3)3)3", 27626);

    @OriginalMember(owner = "client!th", name = "f", descriptor = "Lke;")
    public static class256 field4365 = field4376;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "I")
    public static int field4360;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!th", name = "o", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!th", name = "r", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1755(boolean arg0) {
        if (arg0) {
            field4376 = (class256) null;
        }
        field4366 = null;
        field4375 = null;
        field4362 = null;
        field4376 = null;
        field4361 = null;
        field4365 = null;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 46)
    public static final void method1756(int arg0, int arg1) {
        if (arg0 != 3) {
            field4372 = 60;
        }
        field4370++;
        class209.field3775.method2075(arg1, arg0 ^ 0x2);
        class254.field4357.method2075(arg1, 1);
        class111.field1939.method2075(arg1, 1);
        class132.field2286.method2075(arg1, 1);
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)V", line = 64)
    public static final void method1757(boolean arg0) {
        field4360++;
        boolean var1 = false;
        if (!arg0) {
            return;
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class17.field244 - 1; var2++) {
                if (class303.field5243[var2] < 1000 && class303.field5243[var2 + 1] > 1000) {
                    var1 = false;
                    class256 var3 = class130.field2271[var2];
                    class130.field2271[var2] = class130.field2271[var2 + 1];
                    class130.field2271[var2 + 1] = var3;
                    class256 var4 = class261.field4510[var2];
                    class261.field4510[var2] = class261.field4510[var2 + 1];
                    class261.field4510[var2 + 1] = var4;
                    int var5 = class285.field4948[var2];
                    class285.field4948[var2] = class285.field4948[var2 + 1];
                    class285.field4948[var2 + 1] = var5;
                    int var6 = class189.field3470[var2];
                    class189.field3470[var2] = class189.field3470[var2 + 1];
                    class189.field3470[var2 + 1] = var6;
                    int var7 = class310.field5352[var2];
                    class310.field5352[var2] = class310.field5352[var2 + 1];
                    class310.field5352[var2 + 1] = var7;
                    short var8 = class303.field5243[var2];
                    class303.field5243[var2] = class303.field5243[var2 + 1];
                    class303.field5243[var2 + 1] = var8;
                    long var9 = class159.field2842[var2];
                    class159.field2842[var2] = class159.field2842[var2 + 1];
                    class159.field2842[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(B)V", line = 139)
    public static final void method1758(byte arg0) {
        field4371++;
        int[] var1 = new int[class137.field2383];
        if (arg0 < 107) {
            field4362 = (class256) null;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class137.field2383; var3++) {
            class36 var4 = class254.method1753(var3, true);
            if (var4.field640 >= 0 || var4.field573 >= 0) {
                var1[var2++] = var3;
            }
        }
        class148.field2597 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class148.field2597[var5] = var1[var5];
        }
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "()V", line = 301)
    public class255() {
        new class85();
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIII)V", line = 181)
    public static final void method1759(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class50.field908 < 100) {
            class188.method1366(98);
        }
        if (arg2 != 9179409) {
            field4373 = -66;
        }
        if (class253.field4323) {
            class60.method470(arg1, arg0, arg1 + arg3, arg0 + arg4);
        } else {
            class178.method1302(arg1, arg0, arg1 + arg3, arg0 + arg4);
        }
        field4363++;
        if (class50.field908 < 100) {
            byte var14 = 20;
            int var15 = arg3 / 2 + arg1;
            int var16 = arg0 - (var14 + 18 - (arg4 / 2));
            if (class253.field4323) {
                class60.method482(arg1, arg0, arg3, arg4, 0);
                class60.method474(var15 - 152, var16, 304, 34, 9179409);
                class60.method474(var15 - 151, var16 + 1, 302, 32, 0);
                class60.method482(var15 - 150, var16 + 2, class50.field908 * 3, 30, 9179409);
                class60.method482(class50.field908 * 3 + var15 - 150, var16 + 2, 300 - (class50.field908 * 3), 30, 0);
            } else {
                class178.method1299(arg1, arg0, arg3, arg4, 0);
                class178.method1301(var15 - 152, var16, 304, 34, 9179409);
                class178.method1301(var15 - 151, var16 - -1, 302, 32, 0);
                class178.method1299(var15 - 150, var16 - -2, class50.field908 * 3, 30, 9179409);
                class178.method1299(var15 + (class50.field908 * 3) - 150, var16 + 2, 300 - (class50.field908 * 3), 30, 0);
            }
            class17.field215.method2056(class86.field1555, var15, var14 + var16, 16777215, -1);
            return;
        }
        class280.field4870 = class311.field5360 - ((int) ((float) arg3 / class213.field3816));
        class159.field2840 = class271.field4645 - ((int) ((float) arg4 / class213.field3816));
        class310.field5348 = (int) ((float) (arg4 * 2) / class213.field3816);
        class39.field717 = (int) ((float) (arg3 * 2) / class213.field3816);
        int var5 = class271.field4645 - ((int) ((float) arg4 / class213.field3816));
        int var6 = class311.field5360 - ((int) ((float) arg3 / class213.field3816));
        int var7 = (int) ((float) arg3 / class213.field3816) + class311.field5360;
        int var8 = class271.field4645 + ((int) ((float) arg4 / class213.field3816));
        if (class253.field4323) {
            if (class269.field4584 == null || class269.field4584.field2343 != arg3 || class269.field4584.field2348 != arg4) {
                class269.field4584 = null;
                class269.field4584 = new class227(arg3, arg4);
            }
            class178.method1287(class269.field4584.field3921, arg3, arg4);
            class94.method685(var8, var6, var5, var7, 0, arg3, arg4, 109, 0);
            class132.method899(0, arg4, arg3, var5, var8, 0, false, var7, var6);
            class44.method373(0, arg3, arg4, var7, -29405, 0, var8, var5, var6);
            class60.method476(class269.field4584.field3921, arg1, arg0, arg3, arg4);
        } else {
            class94.method685(var8, var6, var5, var7, arg0, arg1 + arg3, arg0 + arg4, 95, arg1);
            class132.method899(arg1, arg0 + arg4, arg1 + arg3, var5, var8, arg0, false, var7, var6);
            class44.method373(arg0, arg1 + arg3, arg0 + arg4, var7, -29405, arg1, var8, var5, var6);
        }
        if (class288.field4986 > 0) {
            class288.field4986--;
        }
        if (!class40.field728) {
            return;
        }
        int var9 = arg1 + arg3 - 5;
        int var10 = arg0 + arg4 - 8;
        int var11 = 16776960;
        class280.field4875.method2035(class30.method214(new class256[] { class58.field1055, class305.method2125((byte) 88, field4373) }, 29784), var9, var10, 16776960, -1);
        Runtime var12 = Runtime.getRuntime();
        int var13 = (int) ((var12.totalMemory() - var12.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var11 = 16711680;
        }
        var10 -= 15;
        class280.field4875.method2035(class30.method214(new class256[] { class297.field5134, class305.method2125((byte) 82, var13), class308.field5324 }, 29784), var9, var10, var11, -1);
        var10 -= 15;
    }
}
