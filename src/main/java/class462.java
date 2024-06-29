import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class462 extends class731 {

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field6459;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "Lqk;")
    public static class1 field6461 = new class1(50, 8);

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "[Loj;")
    public static class659[] field6462 = new class659[128];

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "F")
    public static float field6463;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field6457;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "I")
    public static int field6458;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "I")
    public static int field6460;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIII)I")
    public static final int method2778(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > -107) {
            method2779((byte) -121);
        }
        int var4 = arg3 & 0x3;
        field6458++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg0;
        } else if (var4 == 2) {
            return 4095 - arg1;
        } else {
            return 4095 - arg0;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    public static final void method2779(byte arg0) {
        field6460++;
        int var1 = -110 % ((arg0 + 28) / 49);
        int var2 = 0;
        if (class688.field9602 != null) {
            var2 = class688.field9602.field8523.method1283((byte) -98);
        }
        if (var2 == 2) {
            int var3 = class20.field163 <= 800 ? class20.field163 : 800;
            class742.field10226 = var3;
            int var4 = class277.field3991 <= 600 ? class277.field3991 : 600;
            class339.field4915 = (class20.field163 - var3) / 2;
            class249.field3700 = var4;
            class424.field5890 = 0;
        } else if (var2 == 1) {
            int var5 = class20.field163 <= 1024 ? class20.field163 : 1024;
            class339.field4915 = (class20.field163 - var5) / 2;
            class742.field10226 = var5;
            int var6 = class277.field3991 > 768 ? 768 : class277.field3991;
            class249.field3700 = var6;
            class424.field5890 = 0;
        } else {
            class339.field4915 = 0;
            class742.field10226 = class20.field163;
            class424.field5890 = 0;
            class249.field3700 = class277.field3991;
        }
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(I)V")
    public static void method2780(int arg0) {
        field6461 = null;
        field6462 = null;
        if (arg0 != 600) {
            method2778(90, -120, 120, 11);
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
    public final void method2781(int arg0) {
        if (arg0 < 38) {
            this.method2781(26);
        }
        field6455++;
        this.field6459.method2334();
    }

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "(I)V")
    public static final void method2782(int arg0) {
        if (class428.field5974 != null) {
            for (int var1 = 0; var1 < class752.field10378; var1++) {
                class428.field5974[var1] = null;
            }
            class428.field5974 = null;
        }
        field6456++;
        if (class381.field5451 != null) {
            for (int var2 = 0; var2 < class293.field4304; var2++) {
                class381.field5451[var2] = null;
            }
            class381.field5451 = null;
        }
        if (class758.field10425 != null) {
            for (int var3 = 0; var3 < class141.field1793; var3++) {
                class758.field10425[var3] = null;
            }
            class758.field10425 = null;
        }
        class665.field9352 = null;
        if (arg0 != 4273) {
            field6463 = -1.0495507F;
        }
        class258.field3793 = -1;
        class516.field7079 = -1;
        class356.field5133 = null;
        class130.field1683 = null;
    }

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "(I)V")
    public static final void method2783(int arg0) {
        class274.field3958.method4219(false);
        field6457++;
        class128.method881((byte) -38);
        class637.field8958 = 0;
        class499.field6844 = null;
        class315.field4517.field6962 = 0;
        class434.field6026 = null;
        if (arg0 != -25912) {
            method2782(-35);
        }
        class29.field239 = 0;
        class501.field6853 = null;
        class115.method835(-28);
        class706.field9820 = null;
        class165.field2117 = 0;
        class688.field9600 = 0;
        class471.field6533 = null;
        class706.field9819 = null;
        class456.field6371 = null;
        class45.field474 = 0;
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(I)V")
    public class462(int arg0) {
        this.field6459 = new NativeHeap(arg0);
    }
}
