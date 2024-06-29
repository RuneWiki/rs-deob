import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public abstract class class420 extends class128 {

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "Luc;")
    public static class58 field6128 = new class58(16);

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "[I")
    public static int[] field6137 = new int[128];

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public int field6126;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public int field6127;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
    public static int field6131;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public int field6132;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field6134;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    public static int field6139;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "I")
    public static int field6140;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "Ljava/lang/String;")
    public static String field6136;

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "Z")
    public boolean field6133;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "[Lhd;")
    public static class17[] field6141;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(I)V", line = 5)
    public final void method346(int arg0) {
        field6131++;
        if (arg0 <= -13) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)Z", line = 19)
    public final boolean method345(byte arg0) {
        field6138++;
        if (arg0 != -72) {
            this.method345((byte) -42);
        }
        return false;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(BZLfd;)V", line = 30)
    public static final void method2615(byte arg0, boolean arg1, class194 arg2) {
        field6134++;
        int var3 = arg2.field2528 == 0 ? arg2.field2501 : arg2.field2528;
        int var4 = arg2.field2445 == 0 ? arg2.field2460 : arg2.field2445;
        class8.method38(var4, class235.field3227[arg2.field2502 >> 16], arg2.field2502, (byte) 86, var3, arg1);
        if (arg0 > -51) {
            method2615((byte) 69, true, (class194) null);
        }
        if (arg2.field2620 != null) {
            class8.method38(var4, arg2.field2620, arg2.field2502, (byte) 93, var3, arg1);
        }
        class141 var5 = (class141) class337.field4495.method308((long) arg2.field2502, (byte) -126);
        if (var5 != null) {
            class357.method2176(var3, var5.field1802, var4, arg1, 94);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(I)V", line = 56)
    public static final void method2616(int arg0) {
        field6130++;
        class114 var1 = class180.field2253;
        synchronized (class180.field2253) {
            class180.field2253.method613(true);
        }
        class114 var2 = class83.field912;
        synchronized (class83.field912) {
            class83.field912.method613(true);
            int var3 = -111 % ((-arg0 - 31) / 39);
        }
        class114 var4 = class272.field3672;
        synchronized (class272.field3672) {
            class272.field3672.method613(true);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V", line = 87)
    public static void method2617(byte arg0) {
        field6137 = null;
        field6128 = null;
        field6141 = null;
        field6136 = null;
        if (arg0 != 125) {
            field6137 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ZIIILai;ILvm;)V", line = 114)
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        field6135++;
        if (arg1 < 36) {
            field6137 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;ZJZIIIZ)V", line = 126)
    public static final void method2618(int arg0, String arg1, int arg2, String arg3, boolean arg4, long arg5, boolean arg6, int arg7, int arg8, int arg9, boolean arg10) {
        field6140++;
        int[] var12 = new int[4];
        for (int var13 = arg2; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class250 var14 = new class250(128);
        var14.method1386(-222840624, 10);
        var14.method1346(119, (arg4 ? 4 : 0) | (arg6 ? 1 : 0) | (arg10 ? 2 : 0));
        var14.method1355(arg5, (byte) -49);
        var14.method1357(var12[0], 1826838072);
        var14.method1343(arg1, 22608);
        var14.method1357(var12[1], 1826838072);
        var14.method1346(123, class156.field1980);
        var14.method1386(-222840624, arg0);
        var14.method1386(-222840624, arg8);
        var14.method1357(var12[2], 1826838072);
        var14.method1346(arg2 ^ 0x7F, arg7);
        var14.method1346(117, arg9);
        var14.method1357(var12[3], 1826838072);
        var14.method1339(arg2 ^ 0xFFFFFFA2, class77.field876, class267.field3644);
        class250 var15 = new class250(350);
        var15.method1343(arg3, 22608);
        int var16 = 8 - (class75.method426(28555, arg3) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method1386(-222840624, (int) (Math.random() * 255.0D));
        }
        var15.method1389(var12, true);
        class281.field3857.field3389 = 0;
        class281.field3857.method1386(arg2 ^ 0xF2B7B8D0, 22);
        class281.field3857.method1346(arg2 + 125, var15.field3389 + 2 + var14.field3389);
        class281.field3857.method1346(arg2 ^ 0x76, 559);
        class281.field3857.method1368(var14.field3389, -2008, 0, var14.field3406);
        class281.field3857.method1368(var15.field3389, -2008, 0, var15.field3406);
        class388.field5529 = -3;
        class428.field6286 = 0;
        class309.field4181 = 0;
        class351.field4913 = 1;
    }
}
