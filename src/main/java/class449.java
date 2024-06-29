import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class449 {

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "I")
    public static int field5744;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "I")
    public static int field5746;

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2400(int arg0) {
        if (arg0 != 1) {
            method2400(-7);
        }
        for (int var1 = 0; var1 < class10.field190.length; var1++) {
            for (int var2 = 0; var2 < class10.field190[0].length; var2++) {
                for (int var3 = 0; var3 < class10.field190[0][0].length; var3++) {
                    class10.field190[var1][var2][var3] = 0;
                }
            }
        }
        field5744++;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(BILr;Z)Lbq;", line = 41)
    public static final class462 method2401(byte arg0, int arg1, class566 arg2, boolean arg3) {
        field5746++;
        int var4 = -18 % ((59 - arg0) / 41);
        if (arg1 == -1) {
            return null;
        }
        if (class286.field3558 != null) {
            for (int var5 = 0; var5 < class286.field3558.length; var5++) {
                if (class286.field3558[var5] == arg1) {
                    return class27.field402[var5];
                }
            }
        }
        class462 var6 = (class462) class236.field2951.method2418((long) arg1, (byte) 100);
        if (var6 != null) {
            if (arg3 && var6.field5884 == null) {
                class595 var7 = class280.method1588(class337.field4323, arg1, (byte) 32);
                if (var7 == null) {
                    return null;
                }
                var6.field5884 = var7;
            }
            return var6;
        }
        class661[] var8 = class661.method3716(class83.field1174, arg1);
        if (var8 == null) {
            return null;
        }
        class595 var9 = class280.method1588(class337.field4323, arg1, (byte) 32);
        if (var9 == null) {
            return null;
        }
        class462 var10;
        if (arg3) {
            var10 = new class462(arg2.method989(var9, var8, true), var9);
        } else {
            var10 = new class462(arg2.method989(var9, var8, true));
        }
        class236.field2951.method2409((long) arg1, var10, 1);
        return var10;
    }

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V", line = 107)
    public static final void method2402(int arg0) {
        if (class407.field5098 != null) {
            class407.field5098.method672(24551);
        }
        field5745++;
        if (class44.field581 != null) {
            while (true) {
                try {
                    class44.field581.join();
                    break;
                } catch (InterruptedException var1) {
                }
            }
        }
        if (arg0 == 21074) {
            ;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Llo;IIIII)V", line = 135)
    public static final void method2403(class488 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class391.field4927 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class429.field5383) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class37.field508 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class75 var14 = class270.field3423[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class491.field6485[var11].method1562(var13, (byte) 51, var12) + class491.field6485[var11].method1562(var13, (byte) 51, var12 + 1) + class491.field6485[var11].method1562(var13 + 1, (byte) 51, var12) + class491.field6485[var11].method1562(var13 + 1, (byte) 51, var12 + 1)) / 4 - (class491.field6485[arg1].method1562(arg3, (byte) 51, arg2) + class491.field6485[arg1].method1562(arg3, (byte) 51, arg2 + 1) + class491.field6485[arg1].method1562(arg3 + 1, (byte) 51, arg2) + class491.field6485[arg1].method1562(arg3 + 1, (byte) 51, arg2 + 1)) / 4;
                                    class597 var16 = var14.field1030;
                                    class597 var17 = var14.field1026;
                                    if (var16 != null && var16.method79((byte) -90)) {
                                        arg0.method77(var6, (var12 - arg2) * class702.field9928 + (1 - arg4) * class238.field2979, (byte) 47, class590.field8291, var16, var15, (var13 - arg3) * class702.field9928 + (1 - arg5) * class238.field2979);
                                    }
                                    if (var17 != null && var17.method79((byte) -81)) {
                                        arg0.method77(var6, (var12 - arg2) * class702.field9928 + (1 - arg4) * class238.field2979, (byte) -120, class590.field8291, var17, var15, (var13 - arg3) * class702.field9928 + (1 - arg5) * class238.field2979);
                                    }
                                    for (class138 var18 = var14.field1024; var18 != null; var18 = var18.field1789) {
                                        class172 var19 = var18.field1786;
                                        if (var19 != null && var19.method79((byte) -114) && (var19.field2247 == var12 || var7 == var12) && (var19.field2243 == var13 || var9 == var13)) {
                                            int var20 = var19.field2254 + 1 - var19.field2247;
                                            int var21 = var19.field2244 + 1 - var19.field2243;
                                            arg0.method77(var6, (var19.field2247 - arg2) * class702.field9928 + (var20 - arg4) * class238.field2979, (byte) 59, class590.field8291, var19, var15, (var19.field2243 - arg3) * class702.field9928 + (var21 - arg5) * class238.field2979);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }
}
