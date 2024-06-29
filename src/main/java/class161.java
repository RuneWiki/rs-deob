import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class161 {

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "[I")
    public static int[] field2617;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "[[[B")
    public static byte[][][] field2621;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILlc;I)V")
    public static final void method1193(int arg0, class303 arg1, int arg2) {
        field2619++;
        Object[] var3 = arg1.field4935;
        int var4 = (Integer) var3[0];
        class87 var5 = class300.method2053(-23029, var4);
        if (var5 == null) {
            return;
        }
        class162.field2630 = new String[var5.field1446];
        int var6 = 0;
        class41.field607 = new int[var5.field1451];
        int var7 = 0;
        int var8 = 1;
        if (arg2 != 2147483640) {
            field2617 = null;
        }
        while (var8 < var3.length) {
            if ((var3[var8] instanceof Integer)) {
                int var10 = (Integer) var3[var8];
                if (var10 == -2147483647) {
                    var10 = arg1.field4940;
                }
                if (var10 == -2147483646) {
                    var10 = arg1.field4944;
                }
                if (var10 == -2147483645) {
                    var10 = arg1.field4931 == null ? -1 : arg1.field4931.field3405;
                }
                if (var10 == -2147483644) {
                    var10 = arg1.field4943;
                }
                if (var10 == -2147483643) {
                    var10 = arg1.field4931 == null ? -1 : arg1.field4931.field3369;
                }
                if (var10 == -2147483642) {
                    var10 = arg1.field4937 == null ? -1 : arg1.field4937.field3405;
                }
                if (var10 == -2147483641) {
                    var10 = arg1.field4937 == null ? -1 : arg1.field4937.field3369;
                }
                if (var10 == -2147483640) {
                    var10 = arg1.field4928;
                }
                if (var10 == -2147483639) {
                    var10 = arg1.field4938;
                }
                class41.field607[var6++] = var10;
            } else if (var3[var8] instanceof String) {
                String var9 = (String) var3[var8];
                if (var9.equals("event_opbase")) {
                    var9 = arg1.field4933;
                }
                class162.field2630[var7++] = var9;
            }
            var8++;
        }
        class186.method1345(var5, 0, arg0);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static void method1194(byte arg0) {
        field2617 = null;
        int var1 = -103 / ((arg0 + 30) / 32);
        field2621 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(III)V")
    public static final void method1195(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class107.field1759; var3++) {
            for (int var4 = 0; var4 < class21.field379; var4++) {
                for (int var5 = 0; var5 < class28.field479; var5++) {
                    class174 var6 = class90.field1498[var3][var4][var5];
                    if (var6 != null) {
                        class184 var7 = var6.field2800;
                        if (var7 != null && var7.field2935.method1634()) {
                            class49.method310(var7.field2935, var3, var4, var5, 1, 1);
                            if (var7.field2937 != null && var7.field2937.method1634()) {
                                class49.method310(var7.field2937, var3, var4, var5, 1, 1);
                                var7.field2935.method1635(var7.field2937, 0, 0, 0, false);
                                var7.field2937 = var7.field2937.method1630(arg0, arg1, arg2);
                            }
                            var7.field2935 = var7.field2935.method1630(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field2814; var8++) {
                            class73 var10 = var6.field2812[var8];
                            if (var10 != null && var10.field1262.method1634()) {
                                class49.method310(var10.field1262, var3, var4, var5, var10.field1269 + 1 - var10.field1270, var10.field1276 - var10.field1266 + 1);
                                var10.field1262 = var10.field1262.method1630(arg0, arg1, arg2);
                            }
                        }
                        class23 var9 = var6.field2805;
                        if (var9 != null && var9.field425.method1634()) {
                            class279.method1956(var9.field425, var3, var4, var5);
                            var9.field425 = var9.field425.method1630(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class207 var7 = class107.method798(arg6, arg1, (byte) -71);
        if (arg4 != 2147483645) {
            field2621 = null;
        }
        field2620++;
        if (var7 != null && var7.field3356 != null) {
            class303 var8 = new class303();
            var8.field4931 = var7;
            var8.field4935 = var7.field3356;
            class269.method1893(-3725, var8);
        }
        class173.field2785 = arg6;
        class42.field646 = arg1;
        class91.field1515 = arg5;
        class169.field2741 = arg3;
        class30.field497 = arg2;
        class221.field3718 = arg0;
        class302.field4918 = true;
        class206.method1441(0, var7);
    }
}
