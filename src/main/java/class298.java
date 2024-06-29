import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class298 extends class259 {

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "Lsi;")
    public class349 field4679;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "[S")
    public static short[] field4680 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field4681 = 0;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field4672;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field4676;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field4677;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field4678;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BI)V", line = 4)
    public static final void method2106(byte arg0, int arg1) {
        field4673++;
        if (!class296.method2104((byte) -64, arg1)) {
            return;
        }
        class323[] var2 = class232.field3512[arg1];
        int var3 = -85 % ((-arg0 - 36) / 49);
        for (int var4 = 0; var4 < var2.length; var4++) {
            class323 var5 = var2[var4];
            if (var5 != null) {
                var5.field5021 = 0;
                var5.field5122 = 1;
                var5.field5064 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "(II)I", line = 39)
    public static final int method2107(int arg0, int arg1) {
        field4675++;
        return arg0 == 0 ? arg1 >>> 7 : 61;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IZ)V", line = 52)
    public static final void method2108(int arg0, boolean arg1) {
        class16.field199.method387(arg0, arg1);
        field4674++;
        class289.field4553.method387(arg0, arg1);
        class223.field3374.method387(arg0, false);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V", line = 66)
    public static void method2109(int arg0) {
        if (arg0 == -3419) {
            field4680 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III)V", line = 80)
    public static final void method2110(int arg0, int arg1, int arg2) {
        class103.field1423 = (float) arg1;
        int var3 = 2 % ((arg0 + 50) / 51);
        field4676++;
        class190.field2855 = (float) arg2;
        if (class120.field1667 == 2) {
            class283.field4508 = arg1;
            class257.field4067 = arg2;
        }
        client.method2009(true);
        class234.field3560 = true;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lsi;)V", line = 101)
    public class298(class349 arg0) {
        this.field4679 = arg0;
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(IZ)Z", line = 110)
    public static final boolean method2111(int arg0, boolean arg1) {
        field4672++;
        if (class166.field2564 == arg0) {
            return false;
        }
        class227.field3428 = new int[104][104];
        class184.field2766 = new int[4][13][13];
        if (arg1) {
            field4680 = (short[]) null;
        }
        class312.field4888 = new int[104][104];
        class171.field2606 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class247.field3914[var2] = new class262(104, 104);
        }
        class225.field3398 = new byte[4][104][104];
        class349.field5569 = new byte[4][104][104];
        class345.field5472 = new class257[4][104][104];
        if (class272.field4317) {
            class195.method1362(4, 104, 104);
            class358.method2476(104, 104);
            class296.field4652 = new class322[13][13];
        }
        class166.field2564 = arg0;
        return true;
    }
}
