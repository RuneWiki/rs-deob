import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class439 {

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "[I")
    public static int[] field6456 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Laa;")
    public static class76 field6457 = new class76(73, 2);

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field6459 = 0;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "I")
    public int field6455;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Ljava/lang/String;")
    public String field6450;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(FBFF)I", line = 5)
    public static final int method2571(float arg0, byte arg1, float arg2, float arg3) {
        if (arg1 < 55) {
            method2574(false, -86);
        }
        field6458++;
        float var4 = arg3 < 0.0F ? -arg3 : arg3;
        float var5 = arg0 < 0.0F ? -arg0 : arg0;
        float var6 = arg2 < 0.0F ? -arg2 : arg2;
        if (var4 < var5 && var6 < var5) {
            return arg0 > 0.0F ? 0 : 1;
        } else if (var6 > var4 && var6 > var5) {
            return arg2 > 0.0F ? 2 : 3;
        } else if ((arg3 > 0.0F)) {
            return 4;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "([IB[I[ILvi;)V", line = 49)
    public static final void method2572(int[] arg0, byte arg1, int[] arg2, int[] arg3, class480 arg4) {
        field6453++;
        if (arg1 != -54) {
            field6457 = null;
        }
        for (int var5 = 0; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg3[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg4.field6029.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field6029[var9] = null;
                    } else {
                        class520 var10 = class510.field7490.method575(var6, -106);
                        int var11 = var10.field7618;
                        class357 var12 = arg4.field6029[var9];
                        if (var12 != null) {
                            if (var12.field5474 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field6029[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field5467 = 0;
                                    var12.field5472 = var8;
                                    var12.field5470 = 1;
                                    var12.field5468 = 0;
                                    var12.field5473 = 0;
                                    class283.method1761(var10, class410.field6198 == arg4, arg4.field7671, -79, arg4.field7686, arg4.field7681, 0);
                                } else if (var11 == 2) {
                                    var12.field5473 = 0;
                                }
                            } else if (var10.field7644 >= class510.field7490.method575(var12.field5474, arg1 ^ 0x41).field7644) {
                                var12 = arg4.field6029[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class357 var13 = arg4.field6029[var9] = new class357();
                            var13.field5472 = var8;
                            var13.field5474 = var6;
                            var13.field5467 = 0;
                            var13.field5468 = 0;
                            var13.field5473 = 0;
                            var13.field5470 = 1;
                            class283.method1761(var10, class410.field6198 == arg4, arg4.field7671, arg1 ^ 0x77, arg4.field7686, arg4.field7681, 0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I)J", line = 147)
    public static final long method2573(int arg0) {
        field6454++;
        if (arg0 != -1) {
            field6456 = null;
        }
        return class222.field3158.method2(true);
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(ZI)Z", line = 159)
    public static final boolean method2574(boolean arg0, int arg1) {
        field6452++;
        if (arg1 <= 104) {
            field6459 = -115;
        }
        boolean var2 = class407.field6147.method124();
        if (var2 == arg0) {
            return true;
        }
        if (!arg0) {
            class407.field6147.method64();
        } else if (!class407.field6147.method113()) {
            arg0 = false;
        }
        if (arg0 == var2) {
            return false;
        } else {
            class454.field6661.field997 = arg0;
            class454.field6661.method1532(class25.field375, 2);
            return true;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(I[BBI)I", line = 199)
    public static final int method2575(int arg0, byte[] arg1, byte arg2, int arg3) {
        field6451++;
        int var4 = -1;
        int var5 = arg3;
        if (arg2 != 97) {
            field6457 = null;
        }
        while (arg0 > var5) {
            var4 = var4 >>> 8 ^ class227.field3202[(var4 ^ arg1[var5]) & 0xFF];
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)V", line = 224)
    public static void method2576(byte arg0) {
        if (arg0 != 56) {
            field6459 = 118;
        }
        field6456 = null;
        field6457 = null;
    }
}
