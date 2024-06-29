import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class3 {

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "[I")
    public static int[] field33 = new int[1000];

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field32 = 0;

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "I")
    public static int field37 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/lang/String;")
    public static String field31 = "Loaded sprites";

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)J")
    public static final long method15(byte arg0) {
        if (arg0 < 41) {
            return -78L;
        } else {
            field36++;
            return class256.field4177.method425((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
    public static void method16(byte arg0) {
        if (arg0 != -98) {
            method17(39, 44, -3, -73, true);
        }
        field31 = null;
        field33 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIZ)V")
    public static final void method17(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class213.field3583 = class83.field1514 * arg0 / arg1;
        if (!arg4) {
            return;
        }
        field30++;
        class248.field4084 = -1;
        class167.field2728 = -1;
        class294.field4681 = class203.field3318 * arg3 / arg2;
        class27.method180((byte) -113);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method18(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        int var9 = arg1 + 1;
        class93.method598(-7, arg4, arg2, class167.field2735[arg1], arg3);
        int var8 = arg0 - 1;
        class93.method598(-7, arg4, arg2, class167.field2735[arg0], arg3);
        field35++;
        if (!arg5) {
            field33 = null;
        }
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class167.field2735[var6];
            var7[arg2] = var7[arg4] = arg3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)V")
    public static final void method19(byte arg0) {
        field34++;
        if (class52.field917 == 0) {
            return;
        }
        try {
            if (++class95.field1646 > 1500) {
                if (class194.field3131 != null) {
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                }
                if (class176.field2895 >= 1) {
                    class52.field917 = 0;
                    class6.field73 = -5;
                    return;
                }
                class176.field2895++;
                class95.field1646 = 0;
                class52.field917 = 1;
                if (class56.field978 == class153.field2556) {
                    class153.field2556 = class83.field1504;
                } else {
                    class153.field2556 = class56.field978;
                }
            }
            if (class52.field917 == 1) {
                class88.field1572 = class127.field2238.method910((byte) 100, class80.field1382, class153.field2556);
                class52.field917 = 2;
            }
            if (class52.field917 == 2) {
                if (class88.field1572.field2857 == 2) {
                    throw new IOException();
                }
                if (class88.field1572.field2857 != 1) {
                    return;
                }
                class194.field3131 = new class207((Socket) class88.field1572.field2859, class127.field2238);
                class88.field1572 = null;
                class194.field3131.method1382(class168.field2778.field1730, class168.field2778.field1762, 0, (byte) -73);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                int var1 = class194.field3131.method1377(6);
                if (class154.field2576 != null) {
                    class154.field2576.method1712((byte) 32);
                }
                if (class259.field4243 != null) {
                    class259.field4243.method1712((byte) 32);
                }
                if (var1 != 101) {
                    class52.field917 = 0;
                    class6.field73 = var1;
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                    return;
                }
                class52.field917 = 3;
            }
            if (class52.field917 == 3) {
                if (class194.field3131.method1386(true) < 2) {
                    return;
                }
                int var2 = class194.field3131.method1377(119) << 8 | class194.field3131.method1377(109);
                class275.method1802(var2, (byte) 116);
                if (class146.field2489 == -1) {
                    class6.field73 = 6;
                    class52.field917 = 0;
                    class194.field3131.method1380(true);
                    class194.field3131 = null;
                    return;
                }
                class52.field917 = 0;
                class194.field3131.method1380(true);
                class194.field3131 = null;
                class204.method1347(1);
                return;
            }
        } catch (IOException var3) {
            if (class194.field3131 != null) {
                class194.field3131.method1380(true);
                class194.field3131 = null;
            }
            if (class176.field2895 < 1) {
                if (class56.field978 == class153.field2556) {
                    class153.field2556 = class83.field1504;
                } else {
                    class153.field2556 = class56.field978;
                }
                class176.field2895++;
                class52.field917 = 1;
                class95.field1646 = 0;
            } else {
                class6.field73 = -4;
                class52.field917 = 0;
            }
        }
        if (arg0 > 0) {
            field37 = 87;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIIIB)V")
    public static final void method20(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 <= 89) {
            method17(42, 46, 33, 43, false);
        }
        if (class126.field2222 <= (arg0 - arg3) && class118.field2098 >= arg0 + arg3 && class118.field2094 <= arg1 - arg3 && arg1 + arg3 <= class89.field1582) {
            class155.method1067(arg0, arg3, arg2, arg1, (byte) -105);
        } else {
            class294.method1983(arg0, arg2, arg1, (byte) 43, arg3);
        }
        field28++;
    }
}
