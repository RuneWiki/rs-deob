import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 {

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field154 = 0;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Leh;")
    public static class47 field157 = class195.method1282((byte) -4, "<)4col>");

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Leh;")
    public static class47 field156 = class195.method1282((byte) -4, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ag", name = "j", descriptor = "Leh;")
    private static class47 field163 = class195.method1282((byte) -4, "Login limit exceeded)3");

    @OriginalMember(owner = "client!ag", name = "m", descriptor = "J")
    public static long field166 = 0L;

    @OriginalMember(owner = "client!ag", name = "l", descriptor = "Leh;")
    public static class47 field165 = class195.method1282((byte) -4, "Clientscript error )2 check log for details");

    @OriginalMember(owner = "client!ag", name = "k", descriptor = "Leh;")
    public static class47 field164 = field163;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[I")
    public static int[] field161 = new int[5];

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lfd;")
    public static class52 field155;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)I")
    public static final int method52(int arg0, int arg1) {
        int var2 = (arg0 & 0x7F) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 0xFF80) + var2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILah;Lah;Lah;Lkf;)Z")
    public static final boolean method53(int arg0, class9 arg1, class9 arg2, class9 arg3, class96 arg4) {
        field159++;
        if (arg0 != 772486855) {
            return true;
        }
        class107.field2232 = arg3;
        class76.field1654 = arg1;
        class181.field3468 = arg4;
        class140.field2751 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIILgf;)V")
    public static final void method54(int arg0, int arg1, int arg2, class61 arg3) {
        if (arg0 != 126) {
            field156 = null;
        }
        field158++;
        if (class20.field385 != 0 && class20.field385 != 3) {
            return;
        }
        int var4 = arg1 - arg3.field1303 / 2;
        int var5 = arg2 - arg3.field1187 / 2;
        int var6 = class195.field3793 + class160.field3116 & 0x7FF;
        int var7 = class17.field341[var6];
        int var8 = class17.field350[var6];
        int var9 = (class60.field1167 + 256) * var7 >> 8;
        int var10 = (class60.field1167 + 256) * var8 >> 8;
        int var11 = var4 * var10 - var5 * var9 >> 11;
        int var12 = var4 * var9 + var5 * var10 >> 11;
        int var13 = class123.field2489.field3281 - var11 >> 7;
        int var14 = class123.field2489.field3291 + var12 >> 7;
        boolean var15 = class204.method1337(0, class123.field2489.field3310[0], 0, 0, true, var14, class123.field2489.field3317[0], 0, 1, var13, (byte) 56, 0);
        if (!var15) {
            return;
        }
        class60.field1174.method609(var5, (byte) -103);
        class60.field1174.method609(var4, (byte) -122);
        class60.field1174.method590(class160.field3116, -1848441912);
        class60.field1174.method609(57, (byte) -115);
        class60.field1174.method609(class195.field3793, (byte) -127);
        class60.field1174.method609(class60.field1167, (byte) -124);
        class60.field1174.method609(89, (byte) -126);
        class60.field1174.method590(class123.field2489.field3291, -1848441912);
        class60.field1174.method590(class123.field2489.field3281, -1848441912);
        class60.field1174.method609(class180.field3461, (byte) -106);
        class60.field1174.method609(63, (byte) -112);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
    public static final void method55(byte arg0, long arg1) {
        field162++;
        if (arg1 == 0L) {
            return;
        }
        if (class77.field1679 >= 100 && class26.field510 != 1 || class77.field1679 >= 200) {
            class60.method506(-127, class181.field3472, 0, class194.field3782);
            return;
        }
        class47 var3 = class173.method1166(arg1, 1).method387(false);
        for (int var4 = 0; var4 < class77.field1679; var4++) {
            if (class31.field593[var4] == arg1) {
                class60.method506(-125, class181.field3472, 0, class5.method24(new class47[] { var3, class189.field3658 }, (byte) 66));
                return;
            }
        }
        for (int var5 = 0; var5 < class5.field88; var5++) {
            if (class25.field487[var5] == arg1) {
                class60.method506(-126, class181.field3472, 0, class5.method24(new class47[] { class177.field3388, var3, class193.field3741 }, (byte) 77));
                return;
            }
        }
        if (var3.method409(127, class123.field2489.field598)) {
            class60.method506(-128, class181.field3472, 0, class119.field2411);
            return;
        }
        class183.field3509++;
        class43.field864[class77.field1679] = var3;
        if (arg0 >= -18) {
            field167 = -23;
        }
        class31.field593[class77.field1679] = arg1;
        class132.field2608[class77.field1679] = 0;
        class190.field3680[class77.field1679] = 0;
        class36.field713 = class103.field2162;
        class77.field1679++;
        class60.field1174.method657(28182, 53);
        class60.field1174.method600(32601, arg1);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z)V")
    public static void method56(boolean arg0) {
        field161 = null;
        field156 = null;
        field163 = null;
        field157 = null;
        field164 = null;
        field165 = null;
        if (arg0) {
            method52(-61, 99);
        }
        field155 = null;
    }
}
