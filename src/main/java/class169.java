import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class169 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lqd;")
    public static class148 field3485 = new class148();

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3488 = 500;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Lgg;")
    public static class63 field3490 = class116.method911(43, "sl_flags");

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "Lgg;")
    public static class63 field3489 = class116.method911(43, "");

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "Lch;")
    public static class29 field3487 = new class29(20);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static void method1139(byte arg0) {
        field3489 = null;
        int var1 = 85 / ((arg0 + 36) / 34);
        field3487 = null;
        field3490 = null;
        field3485 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
    public static final void method1140(boolean arg0) {
        field3486++;
        if (!arg0) {
            method1142(null, -86);
        }
        while (true) {
            class148 var1 = class69.field1729;
            class34 var2;
            synchronized (class69.field1729) {
                var2 = (class34) field3485.method1036(-31644);
            }
            if (var2 == null) {
                return;
            }
            var2.field809.method890((byte) -108, false, var2.field808, var2.field807, (int) var2.field3612);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLgg;)Z")
    public static final boolean method1141(byte arg0, class63 arg1) {
        field3484++;
        if (arg1 == null) {
            return false;
        }
        if (arg0 != 117) {
            method1139((byte) 99);
        }
        for (int var2 = 0; var2 < class99.field2338; var2++) {
            if (arg1.method601(arg0 ^ 0x3348, class140.field3001[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lgg;I)I")
    public static final int method1142(class63 arg0, int arg1) {
        if (arg1 > -3) {
            field3485 = null;
        }
        field3482++;
        if (class22.field512 == 1) {
            return 7;
        } else if (arg0.method593(class138.field2972, -22331)) {
            return 1;
        } else if (arg0.method593(class9.field192, -22331)) {
            return 1;
        } else if (arg0.method593(class71.field1799, -22331)) {
            return 2;
        } else if (arg0.method593(class100.field2364, -22331)) {
            return 2;
        } else if (arg0.method593(class138.field2957, -22331)) {
            return 3;
        } else if (arg0.method593(class166.field3403, -22331)) {
            return 4;
        } else if (arg0.method593(class192.field3894, -22331)) {
            return 4;
        } else if (arg0.method593(class47.field1102, -22331)) {
            return 5;
        } else if (arg0.method593(class13.field308, -22331)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ZI)I")
    public static final int method1143(boolean arg0, int arg1) {
        if (arg0) {
            method1140(true);
        }
        field3483++;
        return arg1 >> 17 & 0x7;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "()V")
    public static final void method1144() {
        for (int var0 = 0; var0 < class168.field3469; var0++) {
            for (int var5 = 0; var5 < class199.field3979; var5++) {
                for (int var6 = 0; var6 < class13.field298; var6++) {
                    class148.field3117[var0][var5][var6] = null;
                }
            }
        }
        for (int var1 = 0; var1 < class165.field3389; var1++) {
            for (int var4 = 0; var4 < class165.field3390[var1]; var4++) {
                class165.field3394[var1][var4] = null;
            }
            class165.field3390[var1] = 0;
        }
        for (int var2 = 0; var2 < class90.field2116; var2++) {
            class59.field1515[var2] = null;
        }
        class90.field2116 = 0;
        for (int var3 = 0; var3 < class176.field3618.length; var3++) {
            class176.field3618[var3] = null;
        }
    }
}
