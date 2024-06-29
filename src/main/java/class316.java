import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class316 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lhi;")
    public static class82 field5430 = class95.method664((byte) -124, "::clientjs5drop");

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "Lhi;")
    public static class82 field5432 = class95.method664((byte) -110, ")1");

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field5433 = -1;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "F")
    public static float field5435;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field5429;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Ljm;")
    public static class303 field5431;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIII)V", line = 5)
    public static final void method2165(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5429++;
        if (class245.field4257 < 100) {
            class95.method662(1);
        }
        if (class147.field2485) {
            class116.method789(arg2, arg0, arg2 + arg4, arg0 + arg1);
        } else {
            class320.method2220(arg2, arg0, arg2 + arg4, arg0 + arg1);
        }
        if (class245.field4257 < 100) {
            byte var14 = 20;
            int var15 = arg4 / 2 + arg2;
            int var16 = arg1 / 2 + arg0 - var14 - 18;
            if (class147.field2485) {
                class116.method784(arg2, arg0, arg4, arg1, 0);
                class116.method786(var15 - 152, var16, 304, 34, 9179409);
                class116.method786(var15 - 151, var16 + 1, 302, 32, 0);
                class116.method784(var15 - 150, var16 + 2, class245.field4257 * 3, 30, 9179409);
                class116.method784(var15 + (class245.field4257 * 3) - 150, var16 + 2, 300 - class245.field4257 * 3, 30, 0);
            } else {
                class320.method2217(arg2, arg0, arg4, arg1, 0);
                class320.method2207(var15 - 152, var16, 304, 34, 9179409);
                class320.method2207(var15 - 151, var16 - -1, 302, 32, 0);
                class320.method2217(var15 - 150, var16 + 2, class245.field4257 * 3, 30, 9179409);
                class320.method2217(var15 - (150 - (class245.field4257 * 3)), var16 + 2, 300 - (class245.field4257 * 3), 30, 0);
            }
            class253.field4354.method120(class217.field3775, var15, var14 + var16, 16777215, -1);
            return;
        }
        class127.field2228 = class82.field1445 - ((int) ((float) arg4 / class69.field1065));
        class255.field4386 = (int) ((float) (arg1 * 2) / class69.field1065);
        class22.field309 = class315.field5426 - (int) ((float) arg1 / class69.field1065);
        class324.field5567 = (int) ((float) (arg4 * 2) / class69.field1065);
        int var5 = class82.field1445 - ((int) ((float) arg4 / class69.field1065));
        int var6 = class315.field5426 - ((int) ((float) arg1 / class69.field1065));
        if (arg3 != -20236) {
            return;
        }
        int var7 = (int) ((float) arg4 / class69.field1065) + class82.field1445;
        int var8 = (int) ((float) arg1 / class69.field1065) + class315.field5426;
        if (class147.field2485) {
            if (class135.field2329 == null || class135.field2329.field1543 != arg4 || class135.field2329.field1533 != arg1) {
                class135.field2329 = null;
                class135.field2329 = new class169(arg4, arg1);
            }
            class320.method2221(class135.field2329.field5160, arg4, arg1);
            class109.method747(0, var6, var8, arg1, 0, 0, var5, arg4, var7);
            class81.method515(0, var6, var7, var5, arg4, arg1, var8, -1, 0);
            class34.method260(arg1, var8, (byte) 1, var6, arg4, var7, 0, 0, var5);
            class135.field2329.method606(arg2, arg0);
        } else {
            class109.method747(arg2, var6, var8, arg0 + arg1, 0, arg0, var5, arg2 + arg4, var7);
            class81.method515(arg2, var6, var7, var5, arg2 + arg4, arg0 - -arg1, var8, -1, arg0);
            class34.method260(arg0 + arg1, var8, (byte) 1, var6, arg2 + arg4, var7, arg2, arg0, var5);
        }
        if (class205.field3592 > 0) {
            class205.field3592--;
        }
        if (!class52.field841) {
            return;
        }
        int var9 = arg2 + arg4 - 5;
        int var10 = arg0 + arg1 - 8;
        class138.field2364.method105(class29.method182(-6039, new class82[] { class220.field3814, class327.method2240((byte) -74, class219.field3796) }), var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = 16776960;
        int var13 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        if (var13 > 65536) {
            var12 = 16711680;
        }
        class138.field2364.method105(class29.method182(arg3 + 14197, new class82[] { class255.field4391, class327.method2240((byte) -74, var13), class77.field1316 }), var9, var17, var12, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 146)
    public static void method2166(boolean arg0) {
        field5430 = null;
        field5431 = null;
        if (!arg0) {
            field5435 = 2.0015523F;
        }
        field5432 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)I", line = 158)
    public static final int method2167(int arg0, int arg1, int arg2) {
        field5434++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (~var3 > arg0) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }
}
