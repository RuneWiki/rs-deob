import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public abstract class class325 extends class295 {

    @OriginalMember(owner = "client!ug", name = "G", descriptor = "[I")
    public static int[] field4413 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field4411 = 0;

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!ug", name = "H", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ug", name = "E", descriptor = "Lrk;")
    public static class427 field4412;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(III)V", line = 10)
    public static final void method2066(int arg0, int arg1, int arg2) {
        if (arg2 > -103) {
            method2069((byte) -28);
        }
        field4417++;
        class450 var3 = class59.method540(13, arg0, 1000);
        var3.method2800(256);
        var3.field6498 = arg1;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V", line = 28)
    public static final void method2067(int arg0) {
        class430.field6116.method2533(0);
        field4414++;
        class89.field1330.method2533(0);
        if (arg0 >= -44) {
            method2067(-104);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)I", line = 41)
    public static final int method2068(int arg0, int arg1) {
        field4415++;
        if (arg1 != 23059) {
            field4416 = 66;
        }
        return arg0 >>> 7;
    }

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "(B)V", line = 52)
    public static void method2069(byte arg0) {
        if (arg0 != 122) {
            method2069((byte) -37);
        }
        field4413 = null;
        field4412 = null;
    }

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "(B)V", line = 69)
    public static final void method2070(byte arg0) {
        class118 var1 = class446.field6419;
        synchronized (class446.field6419) {
            class30.field501++;
            class68.field1017 = class280.field3752;
            int var2 = -66 / ((arg0 + 32) / 44);
            if (class151.field2324 >= 0) {
                while (class176.field2602 != class151.field2324) {
                    int var4 = class91.field1353[class176.field2602];
                    class176.field2602 = class176.field2602 + 1 & 0x7F;
                    if (var4 >= 0) {
                        class234.field3242[var4] = true;
                    } else {
                        class234.field3242[~var4] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class234.field3242[var3] = false;
                }
                class151.field2324 = class176.field2602;
            }
            class280.field3752 = class264.field3541;
        }
        field4410++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lqf;IIII)V", line = 111)
    public static final void method2071(class390 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class286.method1799(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class368.field5054) {
            class286.method1799(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class286.method1799(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class16.field190) {
            class286.method1799(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class16.field190) {
            class286.method1799(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class368.field5054 && arg4 <= class16.field190) {
            class286.method1799(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class286.method1799(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class368.field5054 && arg4 > 0) {
            class286.method1799(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }
}
