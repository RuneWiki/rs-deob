import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class67 extends class58 {

    @OriginalMember(owner = "client!la", name = "ib", descriptor = "Lo;")
    public static class84 field1457 = class15.method124("Try again in 60 secs)3)3)3", 255);

    @OriginalMember(owner = "client!la", name = "hb", descriptor = "Lo;")
    public static class84 field1456 = class15.method124(" from your friend list first", 255);

    @OriginalMember(owner = "client!la", name = "pb", descriptor = "Lo;")
    public static class84 field1464 = class15.method124("@yel@ days of*6nmember credit remaining)3*6n*6n@lre@Credit low(Q Renew now*6n@lre@to avoid losing members)3", 255);

    @OriginalMember(owner = "client!la", name = "tb", descriptor = "Z")
    public static boolean field1468 = false;

    @OriginalMember(owner = "client!la", name = "ob", descriptor = "Lo;")
    public static class84 field1463 = class15.method124("null", 255);

    @OriginalMember(owner = "client!la", name = "mb", descriptor = "Z")
    public static boolean field1461 = false;

    @OriginalMember(owner = "client!la", name = "rb", descriptor = "I")
    public static int field1466 = 0;

    @OriginalMember(owner = "client!la", name = "xb", descriptor = "I")
    public static volatile int field1472 = 0;

    @OriginalMember(owner = "client!la", name = "wb", descriptor = "I")
    public static int field1471 = -1;

    @OriginalMember(owner = "client!la", name = "fb", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!la", name = "gb", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!la", name = "jb", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!la", name = "kb", descriptor = "I")
    public int field1459;

    @OriginalMember(owner = "client!la", name = "lb", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!la", name = "nb", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!la", name = "ub", descriptor = "I")
    public int field1469;

    @OriginalMember(owner = "client!la", name = "vb", descriptor = "[I")
    public static int[] field1470;

    @OriginalMember(owner = "client!la", name = "qb", descriptor = "[Lvb;")
    public static class121[] field1465;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(ILo;Lo;Z)V", line = 17)
    public static final void method514(int arg0, class84 arg1, class84 arg2, boolean arg3) {
        field1460++;
        if (arg0 == 0 && class45.field962 != -1) {
            class19.field339 = arg2;
            class105.field2225 = 0;
        }
        if (class104.field2202 == -1) {
            class85.field1927 = true;
        }
        if (!arg3) {
            method515(-125, 11, 64, -64, null, 5, (byte) 95, -46);
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class89.field2007[var4] = class89.field2007[var4 - 1];
            class127.field2803[var4] = class127.field2803[var4 - 1];
            class75.field1597[var4] = class75.field1597[var4 - 1];
        }
        class89.field2007[0] = arg0;
        class127.field2803[0] = arg1;
        class75.field1597[0] = arg2;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(IIIILeb;IBI)V", line = 72)
    public static final void method515(int arg0, int arg1, int arg2, int arg3, class27 arg4, int arg5, byte arg6, int arg7) {
        int var8 = 42 % ((arg6 - 18) / 55);
        field1455++;
        if (arg7 < 0 || arg7 >= 104 || arg0 < 0 || arg0 >= 104) {
            while (true) {
                int var11 = arg4.method231(255);
                if (var11 == 0) {
                    return;
                }
                if (var11 == 1) {
                    arg4.method231(255);
                    return;
                }
                if (var11 <= 49) {
                    arg4.method231(255);
                }
            }
        }
        class73.field1544[arg1][arg7][arg0] = 0;
        while (true) {
            int var9 = arg4.method231(255);
            if (var9 == 0) {
                if (arg1 == 0) {
                    class110.field2377[0][arg7][arg0] = -class5.method20(35, arg0 + arg3 + 556238, arg7 + 932731 + arg5) * 8;
                    return;
                } else {
                    class110.field2377[arg1][arg7][arg0] = class110.field2377[arg1 - 1][arg7][arg0] - 240;
                    return;
                }
            }
            if (var9 == 1) {
                int var10 = arg4.method231(255);
                if (var10 == 1) {
                    var10 = 0;
                }
                if (arg1 == 0) {
                    class110.field2377[0][arg7][arg0] = -var10 * 8;
                    return;
                }
                class110.field2377[arg1][arg7][arg0] = class110.field2377[arg1 - 1][arg7][arg0] - var10 * 8;
                return;
            }
            if (var9 <= 49) {
                class88.field1978[arg1][arg7][arg0] = arg4.method219(26669);
                class17.field319[arg1][arg7][arg0] = (byte) ((var9 - 2) / 4);
                class86.field1964[arg1][arg7][arg0] = (byte) class61.method486(var9 + arg2 - 2, 3);
            } else if (var9 <= 81) {
                class73.field1544[arg1][arg7][arg0] = (byte) (var9 - 49);
            } else {
                class44.field879[arg1][arg7][arg0] = (byte) (var9 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Lne;", line = 168)
    public final class83 method471(byte arg0) {
        if (arg0 != 3) {
            field1466 = -117;
        }
        field1458++;
        return class126.method970(-57, this.field1459).method378(-10, this.field1469, true);
    }

    @OriginalMember(owner = "client!la", name = "b", descriptor = "(Z)V", line = 188)
    public static void method516(boolean arg0) {
        field1465 = null;
        if (!arg0) {
            field1466 = -50;
        }
        field1464 = null;
        field1456 = null;
        field1463 = null;
        field1470 = null;
        field1457 = null;
    }

    @OriginalMember(owner = "client!la", name = "h", descriptor = "(I)V", line = 220)
    public static final void method517(int arg0) {
        Object var1 = class118.field2597;
        synchronized (class118.field2597) {
            if (class85.field1935 == 0) {
                class118.field2627.method83(5, new class104(), (byte) 31);
            }
            class85.field1935 = 600;
        }
        field1462++;
        int var2 = -74 % ((49 - arg0) / 59);
    }
}
