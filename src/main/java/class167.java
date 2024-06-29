import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class167 extends class86 {

    @OriginalMember(owner = "client!j", name = "v", descriptor = "Ljava/lang/String;")
    public String field2524;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lta;")
    public static class262 field2523 = new class262(260);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2529 = "";

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field2518;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!j", name = "y", descriptor = "I")
    public static int field2527;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "([[II)V")
    public static final void method1103(int[][] arg0, int arg1) {
        class156.field2379 = arg0;
        int var2 = -31 / (arg1 / 50);
        field2525++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IBLjava/util/Random;)I")
    public static final int method1104(int arg0, byte arg1, Random arg2) {
        field2522++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class47.method391(arg0, (byte) 97)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
        } else {
            if (arg1 >= -79) {
                method1109((class176) null, 111);
            }
            int var3 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class72.method561(var4, arg0, -221806177);
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static void method1105(int arg0) {
        field2529 = null;
        if (arg0 != 4) {
            field2526 = -58;
        }
        field2523 = null;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public static final void method1106(int arg0) {
        class92.field1465.method1783(arg0 + 11512);
        if (arg0 != -11512) {
            field2528 = 106;
        }
        field2527++;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)I")
    public static final int method1107(int arg0, int arg1) {
        field2517++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xDA) >> 6;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg1 == 1 ? 0 : 53;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1108(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        class189.field3014 = arg3;
        class278.field4379 = arg1;
        class123.field1895 = arg2;
        class180.field2685 = arg4;
        field2520++;
        if (arg5 != -54) {
            method1106(-91);
        }
        class283.field4473 = arg0;
        if (class189.field3014 >= 100) {
            int var6 = class278.field4379 * 128 + 64;
            int var7 = class180.field2685 * 128 + 64;
            int var8 = class224.method1502((byte) -126, class274.field4318, var7, var6) - class283.field4473;
            int var9 = var6 - class266.field4245;
            int var10 = var8 - class295.field4631;
            int var11 = var7 - class69.field1100;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + (var11 * var11)));
            class25.field373 = (int) (Math.atan2((double) var10, (double) var12) * 325.949D) & 0x7FF;
            class142.field2182 = (int) (-325.949D * Math.atan2((double) var9, (double) var11)) & 0x7FF;
            if (class25.field373 < 128) {
                class25.field373 = 128;
            }
            if (class25.field373 > 383) {
                class25.field373 = 383;
            }
        }
        class6.field111 = 2;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Luf;I)V")
    public static final void method1109(class176 arg0, int arg1) {
        class98.field1569 = arg0;
        field2521++;
        if (arg1 != -384) {
            field2523 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "()V")
    public class167() {
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1110(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (arg4) {
            method1110(-65, -8, 98, 78, false);
        }
        field2518++;
        if (class75.field1265 <= arg3 && class261.field4025 >= arg3) {
            int var5 = class68.method533(class271.field4289, class113.field1779, arg1, (byte) 51);
            int var6 = class68.method533(class271.field4289, class113.field1779, arg0, (byte) 71);
            class64.method505(arg2, var6, var5, arg3, (byte) 0);
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class167(String arg0, int arg1) {
        this.field2524 = arg0;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1111(Component arg0, int arg1) {
        field2519++;
        arg0.removeKeyListener(class258.field3955);
        arg0.removeFocusListener(class258.field3955);
        class259.field3961 = -1;
        if (arg1 <= 47) {
            field2526 = -89;
        }
    }
}
