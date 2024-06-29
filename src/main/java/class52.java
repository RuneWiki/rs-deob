import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class52 {

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field599 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lbc;")
    public static class282 field593;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[I")
    public static int[] field594;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method311(int arg0, long arg1) {
        field596++;
        return arg0 == -31248 ? class200.method1287(false, arg1) : null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)I")
    public static final int method312(int arg0, int arg1) {
        field600++;
        return arg0 == -11392 ? arg1 >>> 8 : 117;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method313(int arg0) {
        field594 = null;
        field593 = null;
        int var1 = 100 / ((arg0 - 21) / 63);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIILoe;)V")
    public static final void method314(int arg0, int arg1, int arg2, class54 arg3) {
        if (arg0 != 0) {
            return;
        }
        if (arg3.field4592 == arg2 && arg2 != -1) {
            class274 var4 = class27.method165(arg2, (byte) 94);
            int var5 = var4.field4090;
            if (var5 == 1) {
                arg3.field4567 = 0;
                arg3.field4580 = 1;
                arg3.field4503 = 0;
                arg3.field4565 = 0;
                arg3.field4518 = arg1;
                class270.method1730(arg3.field4567, arg3.field4563, arg3.field4553, (byte) 57, var4, false);
            }
            if (var5 == 2) {
                arg3.field4565 = 0;
            }
        } else if (arg2 == -1 || arg3.field4592 == -1 || class27.method165(arg2, (byte) -128).field4071 >= class27.method165(arg3.field4592, (byte) 53).field4071) {
            arg3.field4518 = arg1;
            arg3.field4554 = arg3.field4603;
            arg3.field4503 = 0;
            arg3.field4592 = arg2;
            arg3.field4565 = 0;
            arg3.field4567 = 0;
            arg3.field4580 = 1;
            if (arg3.field4592 != -1) {
                class270.method1730(arg3.field4567, arg3.field4563, arg3.field4553, (byte) 100, class27.method165(arg3.field4592, (byte) -118), false);
            }
        }
        field597++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)I")
    public static final int method315(int arg0, int arg1, int arg2, int arg3) {
        field595++;
        if (arg3 != 12439) {
            return -63;
        }
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            return 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIBIII)V")
    public static final void method316(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7) {
        field592++;
        int var8 = class22.method134(class286.field4431, 14949, arg2, class230.field3302);
        int var9 = class22.method134(class286.field4431, 14949, arg6, class230.field3302);
        int var10 = class22.method134(class177.field2514, 14949, arg1, class279.field4238);
        int var11 = class22.method134(class177.field2514, 14949, arg0, class279.field4238);
        int var12 = class22.method134(class286.field4431, 14949, arg2 + arg5, class230.field3302);
        int var13 = class22.method134(class286.field4431, 14949, arg6 - arg5, class230.field3302);
        for (int var14 = var8; var14 < var12; var14++) {
            class76.method463(var10, 0, arg7, var11, class268.field3919[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class76.method463(var10, 0, arg7, var11, class268.field3919[var15]);
        }
        int var16 = -53 % ((arg4 + 11) / 39);
        int var17 = class22.method134(class177.field2514, 14949, arg1 + arg5, class279.field4238);
        int var18 = class22.method134(class177.field2514, 14949, arg0 - arg5, class279.field4238);
        for (int var19 = var12; var19 <= var13; var19++) {
            int[] var20 = class268.field3919[var19];
            class76.method463(var10, 0, arg7, var17, var20);
            class76.method463(var17, 0, arg3, var18, var20);
            class76.method463(var18, 0, arg7, var11, var20);
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Z")
    public static final boolean method317(int arg0) {
        field598++;
        class289 var1 = class280.field4251;
        synchronized (class280.field4251) {
            if (class91.field1237 == class109.field1465) {
                return false;
            }
            if (arg0 <= 36) {
                field593 = null;
            }
            class224.field3165 = class196.field2791[class109.field1465];
            class101.field1392 = class123.field1774[class109.field1465];
            class109.field1465 = class109.field1465 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
    public static final void method318(int arg0, int arg1) {
        class260.field3786.method62(-20, arg1);
        field591++;
        if (arg0 != 0) {
            method312(93, -22);
        }
    }
}
