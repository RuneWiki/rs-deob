import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!efa")
public class class167 {

    @OriginalMember(owner = "client!efa", name = "e", descriptor = "I")
    public int field2392 = 0;

    @OriginalMember(owner = "client!efa", name = "g", descriptor = "I")
    public int field2394 = 0;

    @OriginalMember(owner = "client!efa", name = "l", descriptor = "[[B")
    public byte[][] field2399 = new byte[6][258];

    @OriginalMember(owner = "client!efa", name = "r", descriptor = "[[I")
    public int[][] field2405 = new int[6][258];

    @OriginalMember(owner = "client!efa", name = "f", descriptor = "[B")
    public byte[] field2393 = new byte[18002];

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "[Z")
    public boolean[] field2388 = new boolean[16];

    @OriginalMember(owner = "client!efa", name = "u", descriptor = "[B")
    public byte[] field2408 = new byte[4096];

    @OriginalMember(owner = "client!efa", name = "s", descriptor = "[B")
    public byte[] field2406 = new byte[256];

    @OriginalMember(owner = "client!efa", name = "t", descriptor = "[Z")
    public boolean[] field2407 = new boolean[256];

    @OriginalMember(owner = "client!efa", name = "q", descriptor = "[I")
    public int[] field2404 = new int[257];

    @OriginalMember(owner = "client!efa", name = "z", descriptor = "[B")
    public byte[] field2413 = new byte[18002];

    @OriginalMember(owner = "client!efa", name = "p", descriptor = "[[I")
    public int[][] field2403 = new int[6][258];

    @OriginalMember(owner = "client!efa", name = "D", descriptor = "[I")
    public int[] field2417 = new int[16];

    @OriginalMember(owner = "client!efa", name = "H", descriptor = "[I")
    public int[] field2420 = new int[6];

    @OriginalMember(owner = "client!efa", name = "L", descriptor = "[I")
    public int[] field2424 = new int[256];

    @OriginalMember(owner = "client!efa", name = "N", descriptor = "[[I")
    public int[][] field2426 = new int[6][258];

    @OriginalMember(owner = "client!efa", name = "w", descriptor = "[Ljava/lang/String;")
    public static String[] field2410 = new String[100];

    @OriginalMember(owner = "client!efa", name = "K", descriptor = "[I")
    public static int[] field2423 = new int[14];

    @OriginalMember(owner = "client!efa", name = "I", descriptor = "[I")
    public static int[] field2421 = new int[3];

    @OriginalMember(owner = "client!efa", name = "v", descriptor = "B")
    public byte field2409;

    @OriginalMember(owner = "client!efa", name = "F", descriptor = "F")
    public static float field2419;

    @OriginalMember(owner = "client!efa", name = "b", descriptor = "I")
    public int field2389;

    @OriginalMember(owner = "client!efa", name = "c", descriptor = "I")
    public int field2390;

    @OriginalMember(owner = "client!efa", name = "d", descriptor = "I")
    public int field2391;

    @OriginalMember(owner = "client!efa", name = "h", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!efa", name = "j", descriptor = "I")
    public int field2397;

    @OriginalMember(owner = "client!efa", name = "k", descriptor = "I")
    public int field2398;

    @OriginalMember(owner = "client!efa", name = "m", descriptor = "I")
    public int field2400;

    @OriginalMember(owner = "client!efa", name = "n", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!efa", name = "o", descriptor = "I")
    public int field2402;

    @OriginalMember(owner = "client!efa", name = "y", descriptor = "I")
    public int field2412;

    @OriginalMember(owner = "client!efa", name = "A", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!efa", name = "B", descriptor = "I")
    public int field2415;

    @OriginalMember(owner = "client!efa", name = "C", descriptor = "I")
    public int field2416;

    @OriginalMember(owner = "client!efa", name = "J", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!efa", name = "M", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!efa", name = "E", descriptor = "Lpga;")
    public static class494 field2418;

    @OriginalMember(owner = "client!efa", name = "i", descriptor = "[B")
    public byte[] field2396;

    @OriginalMember(owner = "client!efa", name = "x", descriptor = "[B")
    public byte[] field2411;

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(ILr;)V")
    public static final void method1157(int arg0, class166 arg1) {
        field2422++;
        int var2 = class352.field5079;
        int var3 = class101.field1573;
        int var4 = class70.field1246;
        int var5 = class450.field6490 - 3;
        byte var6 = 20;
        if (class123.field1862 == null || class70.field1252 == null) {
            if (class703.field9909.method2997((byte) -95, class106.field1639) && class703.field9909.method2997((byte) -95, class630.field8807)) {
                class123.field1862 = arg1.method138(class113.method875(class703.field9909, class106.field1639, 0), true);
                class113 var7 = class113.method875(class703.field9909, class630.field8807, 0);
                class70.field1252 = arg1.method138(var7, true);
                var7.method878();
                class44.field706 = arg1.method138(var7, true);
            } else {
                arg1.method114(var2, var3, var4, var6, 255 - class596.field8426 << 24 | class377.field5361, 1);
            }
        }
        if (class123.field1862 != null && class70.field1252 != null) {
            int var8 = (var4 - (class70.field1252.method927() * 2)) / class123.field1862.method927();
            for (int var9 = 0; var9 < var8; var9++) {
                class123.field1862.method3916(var2 + class70.field1252.method927() + (class123.field1862.method927() * var9), var3);
            }
            class70.field1252.method3916(var2, var3);
            class44.field706.method3916(var2 + var4 - class44.field706.method927(), var3);
        }
        class26.field391.method2492(class272.field4098 | 0xFF000000, class274.field4140.method1804(7175, class512.field7203), var2 + 3, -1, (byte) -115, var3 + 14);
        arg1.method114(var2, var3 + var6, var4, var5 - var6, -class596.field8426 + 255 << 24 | class377.field5361, arg0);
        int var10 = class508.field7171.method2090(-7249);
        int var11 = class508.field7171.method2093(22302);
        int var12 = 0;
        for (class279 var13 = (class279) class663.field9367.method472((byte) -28); var13 != null; var13 = (class279) class663.field9367.method482(-10)) {
            int var31 = (class340.field5002 - var12 - 1) * 16 + var3 + var6 + 13;
            var12++;
            if (var2 < var10 && (var2 + var4) > var10 && var11 > var31 - 13 && var11 < (var31 + 4) && var13.field4214) {
                arg1.method114(var2, var31 - 12, var4, 16, 255 - class142.field2109 << 24 | class55.field1075, 1);
            }
        }
        if ((class7.field66 == null || class307.field4549 == null || class296.field4352 == null) && class703.field9909.method2997((byte) -95, class592.field8338) && class703.field9909.method2997((byte) -95, class683.field9633) && class703.field9909.method2997((byte) -95, class640.field9037)) {
            class113 var14 = class113.method875(class703.field9909, class683.field9633, 0);
            class307.field4549 = arg1.method138(var14, true);
            var14.method878();
            class554.field7854 = arg1.method138(var14, true);
            class7.field66 = arg1.method138(class113.method875(class703.field9909, class592.field8338, 0), true);
            class113 var15 = class113.method875(class703.field9909, class640.field9037, 0);
            class296.field4352 = arg1.method138(var15, true);
            var15.method878();
            class641.field9045 = arg1.method138(var15, true);
        }
        int var16 = 0;
        if (class7.field66 != null && class307.field4549 != null && class296.field4352 != null) {
            int var17 = (var4 - (class296.field4352.method927() * 2)) / class7.field66.method927();
            for (int var18 = 0; var18 < var17; var18++) {
                class7.field66.method3916(var2 + class296.field4352.method927() + class7.field66.method927() * var18, -class7.field66.method939() + var5 + var3);
            }
            int var19 = (var5 - class296.field4352.method939() - var6) / class307.field4549.method939();
            for (int var20 = 0; var20 < var19; var20++) {
                class307.field4549.method3916(var2, var20 * class307.field4549.method939() + var3 + var6);
                class554.field7854.method3916(var2 + var4 - class554.field7854.method927(), var20 * class307.field4549.method939() + var3 + var6);
            }
            class296.field4352.method3916(var2, var3 + var5 - class296.field4352.method939());
            class641.field9045.method3916(var2 + var4 - class296.field4352.method927(), -class296.field4352.method939() + (var3 - -var5));
        }
        for (class279 var21 = (class279) class663.field9367.method472((byte) -66); var21 != null; var21 = (class279) class663.field9367.method482(arg0 + 119)) {
            int var22 = (class340.field5002 - var16 - 1) * 16 + (var3 + var6) + 13;
            int var23 = class272.field4098 | 0xFF000000;
            if (var2 < var10 && var10 < var2 + var4 && var11 > (var22 - 13) && (var22 + 4) > var11 && var21.field4214) {
                var23 = class492.field7006 | 0xFF000000;
            }
            int[] var24 = null;
            if (class488.method2833(var21.field4213, (byte) 110)) {
                var24 = class41.field682.method2228((int) var21.field4208, 0).field2687;
            } else if (var21.field4221 != -1) {
                var24 = class41.field682.method2228(var21.field4221, arg0 ^ 0x1).field2687;
            } else if (class656.method3612(var21.field4213, (byte) -93)) {
                class16 var25 = (class16) class189.field2723.method1405((long) ((int) var21.field4208), (byte) -98);
                if (var25 != null) {
                    class577 var26 = var25.field174;
                    class592 var27 = var26.field8121;
                    if (var27.field8315 != null) {
                        var27 = var27.method3356(111, class61.field1163);
                    }
                    if (var27 != null) {
                        var24 = var27.field8288;
                    }
                }
            } else if (class15.method90((byte) -127, var21.field4213)) {
                Object var28 = null;
                class550 var29;
                if (var21.field4213 == 1001) {
                    var29 = class101.field1572.method2617((byte) -127, (int) var21.field4208);
                } else {
                    var29 = class101.field1572.method2617((byte) -121, (int) (var21.field4208 >>> 32 & 0x7FFFFFFFL));
                }
                if (var29.field7781 != null) {
                    var29 = var29.method3124((byte) 95, class61.field1163);
                }
                if (var29 != null) {
                    var24 = var29.field7764;
                }
            }
            String var30 = class666.method3680(false, var21);
            if (var24 != null) {
                var30 = var30 + class56.method614(var24, 0);
            }
            class26.field391.method2490(var2 + 3, 0, var30, var23, var22, class165.field2372, (byte) -2, class210.field2948);
            if (var21.field4212) {
                class143.field2110.method3916(var2 + class467.field6721.method1039(0, var30) + 5, var22 + -12);
            }
            var16++;
        }
        class236.method1614(class450.field6490, arg0 + 125, class101.field1573, class352.field5079, class70.field1246);
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(I)V")
    public static void method1158(int arg0) {
        if (arg0 != 1) {
            method1158(39);
        }
        field2423 = null;
        field2418 = null;
        field2421 = null;
        field2410 = null;
    }

    @OriginalMember(owner = "client!efa", name = "a", descriptor = "(B)V")
    public static final void method1159(byte arg0) {
        if (arg0 != -33) {
            method1158(64);
        }
        if (class199.field2808 < 0) {
            class9.field89 = -1;
            class319.field4698 = -1;
            class199.field2808 = 0;
        }
        field2414++;
        if (class25.field359 < class199.field2808) {
            class9.field89 = -1;
            class319.field4698 = -1;
            class199.field2808 = class25.field359;
        }
        if (class671.field9481 < 0) {
            class319.field4698 = -1;
            class671.field9481 = 0;
            class9.field89 = -1;
        }
        if (class25.field360 < class671.field9481) {
            class319.field4698 = -1;
            class9.field89 = -1;
            class671.field9481 = class25.field360;
        }
    }
}
