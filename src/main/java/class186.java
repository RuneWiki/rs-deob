import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class186 implements class396 {

    @OriginalMember(owner = "client!cka", name = "g", descriptor = "Lqi;")
    private class593 field2441;

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "Z")
    public static boolean field2437 = false;

    @OriginalMember(owner = "client!cka", name = "f", descriptor = "Lofa;")
    public static class347 field2440 = null;

    @OriginalMember(owner = "client!cka", name = "h", descriptor = "[Lmha;")
    public static class435[] field2442 = new class435[37];

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!cka", name = "i", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!cka", name = "j", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZZB)V", line = 3)
    public static final void method1251(boolean arg0, boolean arg1, byte arg2) {
        field2443++;
        if (arg0) {
            class245.field3200--;
            if (class245.field3200 == 0) {
                class462.field6576 = null;
            }
        }
        if (arg2 > -63) {
            method1252(-33);
        }
        if (!arg1) {
            return;
        }
        class501.field7004--;
        if (class501.field7004 == 0) {
            class217.field2836 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)I", line = 32)
    public static final int method1252(int arg0) {
        field2438++;
        if (class206.field2664 == 1) {
            return class16.field155;
        } else {
            if (arg0 != 0) {
                field2442 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(ZI)V", line = 47)
    public final void method209(boolean arg0, int arg1) {
        if (arg0) {
            class375.field5490.method434(0, 0, class460.field6558, class693.field9222, this.field2441.field8100, 0);
        }
        field2439++;
        if (arg1 != 7582) {
            this.field2441 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "(I)V", line = 65)
    public static final void method1253(int arg0) {
        for (class116 var1 = (class116) class138.field1861.method1249((byte) -121); var1 != null; var1 = (class116) class138.field1861.method1246(true)) {
            if (var1.field1568) {
                var1.field1568 = false;
            } else {
                class384.method2389(0, var1.field1563);
            }
        }
        field2444++;
        if (arg0 != 0) {
            method1252(-78);
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)V", line = 100)
    public final void method211(byte arg0) {
        if (arg0 < -107) {
            field2436++;
        }
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)Z", line = 111)
    public final boolean method210(int arg0) {
        field2435++;
        return arg0 == 16125 ? true : true;
    }

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "(I)V", line = 122)
    public static void method1254(int arg0) {
        field2442 = null;
        field2440 = null;
        if (arg0 != 37) {
            field2442 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "<init>", descriptor = "(Lqi;)V", line = 132)
    public class186(class593 arg0) {
        this.field2441 = arg0;
    }
}
