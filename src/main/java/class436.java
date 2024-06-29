import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class436 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field6413;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field6414;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field6415;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field6416;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field6420;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "[I")
    public static int[] field6417;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZZZ)V")
    public static final void method2683(boolean arg0, boolean arg1, boolean arg2) {
        if (arg2) {
            field6419 = 19;
        }
        if (arg1) {
            class70.field864--;
            if (class70.field864 == 0) {
                class36.field441 = null;
            }
        }
        field6413++;
        if (!arg0) {
            return;
        }
        class292.field4662--;
        if (class292.field4662 == 0) {
            class62.field814 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)I")
    public static final int method2684(byte arg0, int arg1) {
        if (class421.field6216 != null) {
            class421.field6216.method1098((byte) 58);
            class421.field6216 = null;
        }
        field6416++;
        class342.field5281++;
        if (arg0 != -74) {
            field6419 = 79;
        }
        if (class342.field5281 > 4) {
            class448.field6540 = 0;
            class342.field5281 = 0;
            return arg1;
        }
        class448.field6540 = 0;
        if (class382.field5769 == class11.field153) {
            class11.field153 = class424.field6264;
        } else {
            class11.field153 = class382.field5769;
        }
        return -1;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static final void method2685(int arg0) {
        field6418++;
        class144.field2267 = 0;
        class86.field1089.method255(-20994);
        int var1 = -104 / ((arg0 + 77) / 39);
        class262.field4214 = false;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Llk;")
    public static final class349 method2686(int arg0, int arg1) {
        field6421++;
        class52 var2 = class216.field3527;
        class349 var3;
        synchronized (class216.field3527) {
            var3 = (class349) class216.field3527.method331((byte) 69, (long) arg1);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class180.field2946.method2771(32, arg1, 3);
        class349 var5 = new class349();
        if (var4 != null) {
            var5.method2279((byte) 65, new class186(var4));
        }
        if (arg0 <= 26) {
            method2683(true, true, false);
        }
        var5.method2277(-1);
        class52 var6 = class216.field3527;
        synchronized (class216.field3527) {
            class216.field3527.method341(48, (long) arg1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V")
    public static final void method2687(boolean arg0) {
        field6415++;
        class413.field6110 = 0;
        if (!arg0) {
            method2689(29);
        }
        int var1 = (class261.field4201.field724 >> 7) + class409.field6048;
        int var2 = (class261.field4201.field722 >> 7) + class444.field6481;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class413.field6110 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class413.field6110 = 1;
        }
        if (class413.field6110 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class413.field6110 = 0;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static void method2688(byte arg0) {
        if (arg0 != -125) {
            method2684((byte) -78, 116);
        }
        field6417 = null;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)Z")
    public static final boolean method2689(int arg0) {
        if (arg0 != -1) {
            method2689(-56);
        }
        field6420++;
        if (class115.field1599) {
            try {
                class169.method1180(class63.field822.field4464, "showVideoAd", false);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
