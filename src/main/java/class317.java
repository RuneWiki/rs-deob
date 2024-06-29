import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class317 {

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Lwm;")
    public static class152 field5499 = class157.method1048("Continuer", 118);

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public static volatile int field5498 = -1;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    public static int field5496 = 0;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "Z")
    public static boolean field5495 = false;

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[J")
    public static long[] field5504 = new long[200];

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field5502 = 0;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "Ldc;")
    public static class109 field5506;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "[[[I")
    public static int[][][] field5497;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIII)V", line = 13)
    public static final void method2214(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5501++;
        if (class37.field616 < 100) {
            class33.method244(arg1 ^ 0x2A);
        }
        if (class217.field3516) {
            class13.method76(arg0, arg3, arg0 + arg2, arg3 + arg4);
        } else {
            class96.method634(arg0, arg3, arg0 + arg2, arg3 + arg4);
        }
        if (class37.field616 < 100) {
            int var5 = arg2 / 2 + arg0;
            byte var6 = 20;
            int var7 = arg3 - var6 - (-(arg4 / 2) - -18);
            if (class217.field3516) {
                class13.method78(arg0, arg3, arg2, arg4, 0);
                class13.method68(var5 - 152, var7, 304, 34, 9179409);
                class13.method68(var5 - 151, var7 + 1, 302, 32, 0);
                class13.method78(var5 - 150, var7 - -2, class37.field616 * 3, 30, 9179409);
                class13.method78(var5 + (class37.field616 * 3) - 150, var7 + 2, 300 - (class37.field616 * 3), 30, 0);
            } else {
                class96.method635(arg0, arg3, arg2, arg4, 0);
                class96.method648(var5 - 152, var7, 304, 34, 9179409);
                class96.method648(var5 - 151, var7 + 1, 302, 32, 0);
                class96.method635(var5 - 150, var7 + 2, class37.field616 * 3, 30, 9179409);
                class96.method635(var5 + (class37.field616 * 3) - 150, var7 + 2, 300 - (class37.field616 * 3), 30, 0);
            }
            class316.field5485.method1122(class290.field4913, var5, var6 + var7, 16777215, -1);
            return;
        }
        class173.field2775 = class146.field2244 - ((int) ((float) arg2 / class41.field660));
        class313.field5435 = class84.field1158 - ((int) ((float) arg4 / class41.field660));
        class82.field1149 = (int) ((float) (arg4 * 2) / class41.field660);
        class148.field2292 = (int) ((float) (arg2 * 2) / class41.field660);
        if (arg1 != 32) {
            return;
        }
        int var8 = class84.field1158 - ((int) ((float) arg4 / class41.field660));
        int var9 = class146.field2244 - ((int) ((float) arg2 / class41.field660));
        int var10 = (int) ((float) arg2 / class41.field660) + class146.field2244;
        int var11 = (int) ((float) arg4 / class41.field660) + class84.field1158;
        if (class217.field3516) {
            if (field5506 == null || field5506.field3281 != arg2 || field5506.field3284 != arg4) {
                field5506 = null;
                field5506 = new class109(arg2, arg4);
            }
            class96.method638(field5506.field1552, arg2, arg4);
            class163.method1089(arg1 - 31, var10, 0, 0, arg2, var8, arg4, var9, var11);
            class65.method417(var9, arg2, arg4, 0, var10, 0, 0, var11, var8);
            class251.method1736(0, var11, arg2, var8, var9, true, arg4, 0, var10);
            class13.method73(field5506.field1552, arg0, arg3, arg2, arg4);
            class96.field1376 = null;
        } else {
            class163.method1089(arg1 ^ 0x21, var10, arg0, arg3, arg0 + arg2, var8, arg3 + arg4, var9, var11);
            class65.method417(var9, arg0 + arg2, arg3 - -arg4, 0, var10, arg3, arg0, var11, var8);
            class251.method1736(arg3, var11, arg0 + arg2, var8, var9, true, arg3 + arg4, arg0, var10);
        }
        if (class302.field5206 > 0) {
            class41.field665--;
            if (class41.field665 == 0) {
                class41.field665 = 20;
                class302.field5206--;
            }
        }
        if (!class50.field776) {
            return;
        }
        int var12 = arg3 + arg4 - 8;
        int var13 = 16776960;
        int var14 = arg0 + arg2 - 5;
        class305.field5238.method1135(class195.method1307(new class152[] { class77.field1097, class38.method280(99, class160.field2555) }, (byte) 29), var14, var12, 16776960, -1);
        int var17 = var12 - 15;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var13 = 16711680;
        }
        class305.field5238.method1135(class195.method1307(new class152[] { class277.field4742, class38.method280(127, var16), class70.field1013 }, (byte) 29), var14, var17, var13, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 132)
    public static final void method2215(byte arg0) {
        class85.field1194.method1619(11300);
        class205.field3320.method1619(11300);
        int var1 = 97 / ((68 - arg0) / 58);
        field5503++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 147)
    public static void method2216(int arg0) {
        if (arg0 == -31598) {
            field5497 = (int[][][]) null;
            field5504 = null;
            field5499 = null;
            field5506 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "(I)V", line = 181)
    public static final void method2217(int arg0) {
        for (int var1 = arg0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class226.field3674[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class194.field3114; var3++) {
            class12 var4 = class22.field380[class325.field5670[var3]];
            if (var4 != null) {
                var4.field4207 = false;
            }
        }
        for (int var5 = 0; var5 < class233.field3826; var5++) {
            class4 var6 = class40.field649[class97.field1403[var5]];
            if (var6 != null) {
                var6.field4207 = false;
            }
        }
        field5500++;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lah;B)V", line = 231)
    public static final void method2218(class205 arg0, byte arg1) {
        if (arg1 <= 120) {
            field5495 = true;
        }
        field5505++;
        class176.field2840 = arg0.method1374(class258.field4425, (byte) -52);
        class80.field1118 = arg0.method1374(class320.field5589, (byte) -52);
        class169.field2654 = arg0.method1374(class164.field2603, (byte) -52);
        class83.field1154 = arg0.method1374(class267.field4499, (byte) -52);
        class80.field1125 = arg0.method1374(class18.field259, (byte) -52);
        class289.field4894 = arg0.method1374(class189.field2994, (byte) -52);
        class113.field1610 = arg0.method1374(class94.field1333, (byte) -52);
        class235.field3858 = arg0.method1374(class215.field3498, (byte) -52);
        class4.field67 = arg0.method1374(class265.field4467, (byte) -52);
        class27.field459 = arg0.method1374(class48.field740, (byte) -52);
        class44.field704 = arg0.method1374(class193.field3079, (byte) -52);
        class260.field4453 = arg0.method1374(class12.field168, (byte) -52);
        class195.field3126 = arg0.method1374(class65.field979, (byte) -52);
        class48.field745 = arg0.method1374(class289.field4883, (byte) -52);
        class172.field2726 = arg0.method1374(class70.field1028, (byte) -52);
        class63.field953 = arg0.method1374(class141.field2178, (byte) -52);
        class80.field1121 = arg0.method1374(class142.field2189, (byte) -52);
        class101.field1468 = arg0.method1374(class251.field4319, (byte) -52);
    }
}
