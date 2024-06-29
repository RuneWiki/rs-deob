import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class441 extends class35 {

    @OriginalMember(owner = "client!up", name = "l", descriptor = "I")
    public int field6397;

    @OriginalMember(owner = "client!up", name = "q", descriptor = "I")
    public int field6402;

    @OriginalMember(owner = "client!up", name = "n", descriptor = "Z")
    public boolean field6399;

    @OriginalMember(owner = "client!up", name = "u", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!up", name = "j", descriptor = "I")
    public int field6395;

    @OriginalMember(owner = "client!up", name = "p", descriptor = "I")
    public int field6401;

    @OriginalMember(owner = "client!up", name = "r", descriptor = "Lfg;")
    public static class18 field6403 = new class18(8);

    @OriginalMember(owner = "client!up", name = "t", descriptor = "[I")
    public static int[] field6405 = new int[128];

    @OriginalMember(owner = "client!up", name = "w", descriptor = "Ljava/lang/String;")
    public static String field6408 = "Opened title screen";

    @OriginalMember(owner = "client!up", name = "x", descriptor = "Ljava/lang/String;")
    public static String field6409 = "";

    @OriginalMember(owner = "client!up", name = "s", descriptor = "[[I")
    public static int[][] field6404 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 }, { 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 }, { 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };

    @OriginalMember(owner = "client!up", name = "z", descriptor = "I")
    public static int field6411 = -1;

    @OriginalMember(owner = "client!up", name = "B", descriptor = "F")
    public static float field6413;

    @OriginalMember(owner = "client!up", name = "i", descriptor = "I")
    public static int field6394;

    @OriginalMember(owner = "client!up", name = "k", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!up", name = "m", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!up", name = "o", descriptor = "I")
    public static int field6400;

    @OriginalMember(owner = "client!up", name = "v", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!up", name = "y", descriptor = "I")
    public static int field6410;

    @OriginalMember(owner = "client!up", name = "A", descriptor = "Ldp;")
    public static class174 field6412;

    @OriginalMember(owner = "client!up", name = "c", descriptor = "(I)V")
    public static final void method2746(int arg0) {
        class268.field4020.method2782((byte) -75);
        field6410++;
        int var1 = class268.field4020.method2778(8, (byte) -95);
        if (class156.field2376 > var1) {
            for (int var2 = var1; var2 < class156.field2376; var2++) {
                class336.field4806[class371.field5247++] = class416.field6027[var2];
            }
        }
        if (class156.field2376 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class156.field2376 = 0;
        for (int var3 = arg0; var3 < var1; var3++) {
            int var4 = class416.field6027[var3];
            class98 var5 = class447.field6512[var4];
            int var6 = class268.field4020.method2778(1, (byte) -95);
            if (var6 == 0) {
                class416.field6027[class156.field2376++] = var4;
                var5.field5627 = class267.field4002;
            } else {
                int var7 = class268.field4020.method2778(2, (byte) -95);
                if (var7 == 0) {
                    class416.field6027[class156.field2376++] = var4;
                    var5.field5627 = class267.field4002;
                    class218.field3229[class176.field2619++] = var4;
                } else if (var7 == 1) {
                    class416.field6027[class156.field2376++] = var4;
                    var5.field5627 = class267.field4002;
                    int var8 = class268.field4020.method2778(3, (byte) -95);
                    var5.method2468(arg0 ^ 0x2050, var8, 1);
                    int var9 = class268.field4020.method2778(1, (byte) -95);
                    if (var9 == 1) {
                        class218.field3229[class176.field2619++] = var4;
                    }
                } else if (var7 == 2) {
                    class416.field6027[class156.field2376++] = var4;
                    var5.field5627 = class267.field4002;
                    if (class268.field4020.method2778(1, (byte) -95) == 1) {
                        int var10 = class268.field4020.method2778(3, (byte) -95);
                        var5.method2468(8272, var10, 2);
                        int var11 = class268.field4020.method2778(3, (byte) -95);
                        var5.method2468(8272, var11, 2);
                    } else {
                        int var12 = class268.field4020.method2778(3, (byte) -95);
                        var5.method2468(8272, var12, 0);
                    }
                    int var13 = class268.field4020.method2778(1, (byte) -95);
                    if (var13 == 1) {
                        class218.field3229[class176.field2619++] = var4;
                    }
                } else if (var7 == 3) {
                    class336.field4806[class371.field5247++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIZ)V")
    public static final void method2747(int arg0, int arg1, boolean arg2) {
        field6394++;
        class221 var3 = class447.method2795(14, (byte) -49, arg0);
        var3.method1692(0);
        var3.field3297 = arg1;
        if (!arg2) {
            method2746(-73);
        }
    }

    @OriginalMember(owner = "client!up", name = "d", descriptor = "(I)V")
    public static final void method2748(int arg0) {
        if (class110.field1797 < 0) {
            class110.field1797 = 0;
            class270.field4049 = -1;
            class243.field3541 = -1;
        }
        if (arg0 >= -14) {
            method2748(29);
        }
        field6398++;
        if (class110.field1797 > class272.field4099) {
            class110.field1797 = class272.field4099;
            class270.field4049 = -1;
            class243.field3541 = -1;
        }
        if (class373.field5295 < 0) {
            class243.field3541 = -1;
            class270.field4049 = -1;
            class373.field5295 = 0;
        }
        if (class373.field5295 > class272.field4093) {
            class270.field4049 = -1;
            class373.field5295 = class272.field4093;
            class243.field3541 = -1;
        }
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(ILdp;Lja;Ldp;)V")
    public static final void method2749(int arg0, class174 arg1, class90 arg2, class174 arg3) {
        class221.field3294 = class110.method961(66, class375.field5314, arg1, arg0);
        field6400++;
        class273.field4110 = arg2.method765(class221.field3294, class344.method2211(arg3, class375.field5314, 0), true);
        class269.field4041 = class110.method961(112, class228.field3346, arg1, 0);
        class107.field1763 = arg2.method765(class269.field4041, class344.method2211(arg3, class228.field3346, 0), true);
        class150.field2295 = class110.method961(81, class197.field2879, arg1, 0);
        class250.field3620 = arg2.method765(class150.field2295, class344.method2211(arg3, class197.field2879, 0), true);
    }

    @OriginalMember(owner = "client!up", name = "<init>", descriptor = "(IIIIIZ)V")
    public class441(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field6397 = arg1;
        this.field6402 = arg2;
        this.field6399 = arg5;
        this.field6406 = arg3;
        this.field6395 = arg4;
        this.field6401 = arg0;
    }

    @OriginalMember(owner = "client!up", name = "e", descriptor = "(I)V")
    public static void method2750(int arg0) {
        field6404 = null;
        field6412 = null;
        field6403 = null;
        if (arg0 != 17213) {
            method2750(-63);
        }
        field6405 = null;
        field6409 = null;
        field6408 = null;
    }

    @OriginalMember(owner = "client!up", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 53 % ((33 - arg6) / 44);
        field6396++;
        if (arg1 == arg5) {
            class294.method2056(arg2, arg0, arg7, arg3, arg4, arg1, -1996488705);
        } else if ((arg0 - arg1) >= class185.field2727 && arg0 + arg1 <= class278.field4184 && class308.field4507 <= (arg4 - arg5) && (arg4 + arg5) <= class383.field5497) {
            class328.method2160(arg3, false, arg5, arg1, arg4, arg0, arg2, arg7);
        } else {
            class378.method2402(arg4, arg2, arg7, arg0, arg1, (byte) 87, arg5, arg3);
        }
    }
}
