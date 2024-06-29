import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class309 {

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "I")
    public static int field5295 = 0;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "Lmh;")
    public static class62 field5293 = class201.method1405(true, "");

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field5296 = 0;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Lmh;")
    public static class62 field5302 = class201.method1405(true, "hint_headicons");

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field5299;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V", line = 5)
    public static final void method2102(int arg0) {
        class238.field4075 = (short[][][]) null;
        class14.field118 = (byte[][][]) null;
        class287.field4904 = 0;
        class226.field3941 = (byte[][][]) null;
        field5299++;
        class32.field445 = (int[][][]) null;
        class152.field2399 = null;
        class41.field619 = (byte[][][]) null;
        class304.field5235 = null;
        class177.field2841 = (int[][][]) null;
        class266.field4497 = (byte[][][]) null;
        if (arg0 > 0) {
            method2106(50, -43);
        }
        class192.field3234 = null;
        class271.field4609 = (byte[][][]) null;
        class192.field3223.method328(false);
        class252.field4270 = null;
        class208.field3528 = null;
        class218.field3742 = null;
        class20.field192 = null;
        class241.field4107 = null;
        class56.field830 = null;
        class198.field3341 = null;
        class148.field2333 = null;
        class97.field1595 = null;
        class156.field2509 = null;
        class24.field271 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 40)
    public static void method2103(byte arg0) {
        field5293 = null;
        if (arg0 < 104) {
            field5302 = (class62) null;
        }
        field5302 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V", line = 69)
    public static final void method2104(int arg0, int arg1) {
        class116.field1937 = 50;
        class36.field479 = arg0;
        field5298++;
        int var2 = 105 / ((arg1 - 89) / 34);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)V", line = 92)
    public static final void method2105(int arg0, boolean arg1) {
        field5300++;
        if (arg0 == -1 || !class20.method95(arg1, arg0)) {
            return;
        }
        class191[] var2 = class275.field4713[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class191 var4 = var2[var3];
            if (var4.field3173 != null) {
                class161 var5 = new class161();
                var5.field2597 = var4;
                var5.field2598 = var4.field3173;
                class174.method1236(arg1, var5, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)V", line = 135)
    public static final void method2106(int arg0, int arg1) {
        class195.field3293--;
        field5301++;
        if (class195.field3293 == arg0) {
            return;
        }
        class231.method1631(class146.field2317, arg0 + 1, class146.field2317, arg0, class195.field3293 - arg0);
        class231.method1631(class244.field4151, arg0 + 1, class244.field4151, arg0, class195.field3293 - arg0);
        class231.method1638(class286.field4892, arg0 + 1, class286.field4892, arg0, class195.field3293 - arg0);
        class231.method1633(class144.field2297, arg0 + arg1, class144.field2297, arg0, class195.field3293 - arg0);
        class231.method1637(class212.field3557, arg0 + 1, class212.field3557, arg0, class195.field3293 - arg0);
        class231.method1637(class109.field1766, arg0 + 1, class109.field1766, arg0, class195.field3293 - arg0);
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(I)V")
    public abstract void method40(int arg0);

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IIB)I")
    public abstract int method41(int arg0, int arg1, byte arg2);
}
