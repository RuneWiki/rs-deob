import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public abstract class class224 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "[S")
    public static short[] field4077 = new short[] { 4, 60, 44, 41, 21, 29, 42, 46 };

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "Lcc;")
    private static class209 field4088 = class95.method669(119, "cyan:");

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field4090 = 0;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "Z")
    public static boolean field4080 = false;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Lcc;")
    public static class209 field4079 = field4088;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public static int field4084 = 0;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "Lcc;")
    public static class209 field4087 = field4088;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Lcc;")
    public static class209 field4092 = class95.method669(87, "::noclip");

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    public int field4076;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public int field4078;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field4081;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field4082;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public int field4083;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public int field4085;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field4089;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
    public abstract void method1329(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILfl;IIIZ)V")
    public static final void method1577(int arg0, class241 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field4093++;
        if (class88.field1748 >= 50 || arg1.field4358 == null || arg1.field4358.length <= arg0 || arg1.field4358[arg0] == null) {
            return;
        }
        int var6 = arg1.field4358[arg0][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 4 & 0x7;
        if (arg1.field4358[arg0].length > 1) {
            int var9 = (int) (Math.random() * (double) arg1.field4358[arg0].length);
            if (var9 > 0) {
                var7 = arg1.field4358[arg0][var9];
            }
        }
        int var10 = var6 & 0xF;
        if (var10 == 0) {
            if (arg5) {
                class228.method1600(52, var7, var8, 0);
            }
        } else if (class176.field3202 != 0) {
            int var11 = (arg3 - 64) / 128;
            class153.field2790[class88.field1748] = var7;
            int var12 = (arg2 - 64) / arg4;
            class126.field2439[class88.field1748] = var8;
            class238.field4313[class88.field1748] = 0;
            class165.field2988[class88.field1748] = null;
            class132.field2527[class88.field1748] = (var11 << 16) + ((var12 << 8) + var10);
            class88.field1748++;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILsj;I)Ljb;")
    public static final class269 method1578(int arg0, int arg1, class49 arg2, int arg3) {
        field4091++;
        if (class117.method833(arg3, arg2, 896, arg0)) {
            int var4 = 101 % ((arg1 - 32) / 59);
            return class88.method632((byte) 55);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)Z")
    public static final boolean method1579(int arg0, int arg1, int arg2) {
        int var3 = class162.field2940[arg0][arg1][arg2];
        if (-class261.field4695 == var3) {
            return false;
        } else if (class261.field4695 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class187.method1276(var4 + 1, class271.field4803[arg0][arg1][arg2], var5 + 1) && class187.method1276(var4 + 128 - 1, class271.field4803[arg0][arg1 + 1][arg2], var5 + 1) && class187.method1276(var4 + 128 - 1, class271.field4803[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class187.method1276(var4 + 1, class271.field4803[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class162.field2940[arg0][arg1][arg2] = class261.field4695;
                return true;
            } else {
                class162.field2940[arg0][arg1][arg2] = -class261.field4695;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
    public abstract void method1330(int arg0, int arg1);

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZLji;)V")
    public static final void method1580(int arg0, boolean arg1, class42 arg2) {
        field4089++;
        if (arg0 != -19451) {
            method1579(6, -83, 63);
        }
        int var3 = arg2.field733 == 0 ? arg2.field789 : arg2.field733;
        int var4 = arg2.field782 == 0 ? arg2.field758 : arg2.field782;
        class85.method612(var3, (byte) 74, arg1, arg2.field779, class50.field984[arg2.field779 >> 16], var4);
        if (arg2.field762 != null) {
            class85.method612(var3, (byte) 87, arg1, arg2.field779, arg2.field762, var4);
        }
        class97 var5 = (class97) class114.field2288.method1755((long) arg2.field779, (byte) -76);
        if (var5 != null) {
            class191.method1315((byte) -50, arg1, var5.field1895, var4, var3);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
    public static final void method1581(int arg0) {
        field4094++;
        if (arg0 != -1714010812) {
            field4092 = null;
        }
        class62.field1230.method665(1);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
    public static void method1582(int arg0) {
        if (arg0 < 11) {
            field4084 = -106;
        }
        field4077 = null;
        field4079 = null;
        field4087 = null;
        field4092 = null;
        field4088 = null;
    }
}
