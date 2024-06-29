import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class91 extends class305 {

    @OriginalMember(owner = "client!in", name = "n", descriptor = "[I")
    public static int[] field1276 = new int[25];

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "Log;")
    public static class651 field1278;

    @OriginalMember(owner = "client!in", name = "i", descriptor = "Lega;")
    public static class713 field1271;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)I", line = 4)
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -121;
        } else {
            ++field1275;
            return 0;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 19)
    public static void method723(int arg0) {
        field1276 = null;
        field1278 = null;
        if (arg0 < 101) {
            field1278 = null;
        }
        field1271 = null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)V", line = 36)
    public final void method308(byte arg0) {
        if (arg0 > -40) {
            this.method725(119);
        }
        ++field1279;
        if (super.field4320 != 1 && super.field4320 != 0) {
            super.field4320 = this.method305((byte) 68);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lvs;[Lraa;)V", line = 51)
    public static final void method724(class593 arg0, class609[] arg1) {
        if (class94.field1347) {
            int var2 = arg0.method84(70, arg1);
            class118.field1620.method501(var2, arg1);
        }
        if (class582.field8287 == class46.field568) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class119) {
                var5 = ((class119) arg0).field1628;
                var6 = ((class119) arg0).field1626;
            } else {
                var5 = arg0.field8423 >> class459.field6769;
                var6 = arg0.field8428 >> class459.field6769;
            }
            class118.field1620.method439(class531.field7566[0].method1786(arg0.field8428, (byte) 113, arg0.field8423), class303.method1912(var5, var6), class311.method1966(var5, var6), class466.method2829(var5, var6));
        }
        class187 var7 = arg0.method319(class118.field1620, (byte) 68);
        if (var7 != null) {
            if (arg0.field8422) {
                class102[] var8 = var7.field2851;
                for (int var9 = 0; var9 < var8.length; ++var9) {
                    class102 var10 = var8[var9];
                    if (var10.field1430) {
                        class497.method2963(var10.field1434 + var10.field1429, var10.field1433 + var10.field1429, (byte) -1, var10.field1431 - var10.field1429, var10.field1432 - var10.field1429);
                    }
                }
            }
            if (var7.field2849) {
                var7.field2848 = arg0;
                if (class413.field6206) {
                    class127 var11 = class177.field2736;
                    synchronized (class177.field2736) {
                        class177.field2736.method889((byte) 52, var7);
                        return;
                    }
                }
                class177.field2736.method889((byte) 52, var7);
                return;
            }
            class387.method2494(2780, var7);
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V", line = 120)
    public final void method303(int arg0, int arg1) {
        ++field1272;
        if (arg0 != -27751) {
            this.method303(118, -105);
        }
        super.field4320 = arg1;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lhb;)V", line = 136)
    public class91(class728 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ILhb;)V", line = 139)
    public class91(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)I", line = 143)
    public final int method306(int arg0, int arg1) {
        ++field1274;
        return arg0 != 31401 ? 26 : 1;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)I", line = 154)
    public final int method725(int arg0) {
        ++field1273;
        if (arg0 != 17503) {
            field1277 = -42;
        }
        return super.field4320;
    }
}
