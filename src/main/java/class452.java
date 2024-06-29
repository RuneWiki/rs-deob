import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class452 {

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "[Lvv;")
    public static class640[] field6395 = new class640[32];

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "[[I")
    public static int[][] field6397 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "Lim;")
    public static class353 field6402 = new class353(50, 1);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field6396;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field6398;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "I")
    public static int field6399;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lrw;")
    public static class128 field6400;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field6401;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "[[B")
    public static byte[][] field6403;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2628(int arg0, int arg1, byte arg2) {
        if (arg2 != 125) {
            field6395 = null;
        }
        field6396++;
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public static void method2629(int arg0) {
        if (arg0 != -18292) {
            method2631(21);
        }
        field6395 = null;
        field6400 = null;
        field6402 = null;
        field6401 = null;
        field6397 = null;
        field6403 = null;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public static final void method2630(int arg0) {
        class58 var1 = class255.field3171;
        synchronized (class255.field3171) {
            if (arg0 != 8) {
                field6403 = null;
            }
            class255.field3171.method317((byte) 21);
        }
        field6399++;
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static final void method2631(int arg0) {
        if (arg0 != -31790) {
            return;
        }
        field6398++;
        for (int var1 = 0; var1 < class369.field5138; var1++) {
            class201 var2 = class172.field2225[var1];
            boolean var3 = false;
            if (var2.field2628 == null) {
                var2.field2630--;
                if ((var2.field2625 == 2 ? -1500 : -10) <= var2.field2630) {
                    if (var2.field2625 == 1 && var2.field2635 == null) {
                        var2.field2635 = class490.method2753(class35.field547, var2.field2638, 0);
                        if (var2.field2635 == null) {
                            continue;
                        }
                        var2.field2630 += var2.field2635.method2755();
                    } else if (var2.field2625 == 2 && (var2.field2627 == null || var2.field2626 == null)) {
                        if (var2.field2627 == null) {
                            var2.field2627 = class572.method3224(class592.field8546, var2.field2638);
                        }
                        if (var2.field2627 == null) {
                            continue;
                        }
                        if (var2.field2626 == null) {
                            var2.field2626 = var2.field2627.method3223(new int[] { 22050 });
                            if (var2.field2626 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field2630 < 0) {
                        int var11;
                        if (var2.field2632 == 0) {
                            var11 = class501.field6954.field7856 * var2.field2639 >> 8;
                        } else {
                            int var4 = (var2.field2632 & 0x39E76F5) >> 24;
                            if (class147.field1899.field6358 == var4) {
                                int var5 = (var2.field2632 & 0xFF) << 9;
                                int var6 = var2.field2632 >> 16 & 0xFF;
                                int var7 = (var6 << 9) + 256 - class147.field1899.field6362;
                                if (var7 < 0) {
                                    var7 = -var7;
                                }
                                int var8 = var2.field2632 >> 8 & 0xFF;
                                int var9 = (var8 << 9) + (256 - class147.field1899.field6368);
                                if (var9 < 0) {
                                    var9 = -var9;
                                }
                                int var10 = var7 + var9 - 512;
                                if (var5 < var10) {
                                    var2.field2630 = -99999;
                                    continue;
                                }
                                if (var10 < 0) {
                                    var10 = 0;
                                }
                                var11 = class501.field6954.field7838 * var2.field2639 * (var5 - var10) / var5 >> 8;
                            } else {
                                var11 = 0;
                            }
                        }
                        if (var11 > 0) {
                            class300 var12 = null;
                            if (var2.field2625 == 1) {
                                var12 = var2.field2635.method2756().method1836(class90.field1220);
                            } else if (var2.field2625 == 2) {
                                var12 = var2.field2626;
                            }
                            class213 var13 = var2.field2628 = class213.method1358(var12, 100, var11);
                            var13.method1353(var2.field2636 - 1);
                            class92.field1224.method257(var13);
                        }
                    }
                } else {
                    var3 = true;
                }
            } else if (!var2.field2628.method591(arg0 ^ 0xFFFF83B9)) {
                var3 = true;
            }
            if (var3) {
                class369.field5138--;
                for (int var14 = var1; var14 < class369.field5138; var14++) {
                    class172.field2225[var14] = class172.field2225[var14 + 1];
                }
                var1--;
            }
        }
        if (class54.field726 && !class585.method3376(false)) {
            if (class501.field6954.field7851 != 0 && class325.field4460 != -1) {
                class628.method3636(0, class251.field3143, 16778, class501.field6954.field7851, class325.field4460, false);
            }
            class54.field726 = false;
        } else if (class501.field6954.field7851 != 0 && class325.field4460 != -1 && !class585.method3376(false)) {
            class118.method650(true, class127.field1576);
            class71.field927++;
            class272.field3457.method3071(-89, class325.field4460);
            class325.field4460 = -1;
        }
    }
}
