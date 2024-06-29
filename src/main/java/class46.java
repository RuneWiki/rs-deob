import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class46 {

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "[I")
    public static int[] field764 = new int[25];

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "[I")
    public static int[] field752 = new int[14];

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public static int field762;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!sm", name = "h", descriptor = "J")
    public long field758;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "Lsm;")
    public class46 field754;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "Lsm;")
    public class46 field756;

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "[S")
    public static short[] field761;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 9)
    public final void method403(int arg0) {
        field755++;
        if (arg0 != 1) {
            method404(false);
        }
        if (this.field756 != null) {
            this.field756.field754 = this.field754;
            this.field754.field756 = this.field756;
            this.field754 = null;
            this.field756 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Z)V", line = 31)
    public static void method404(boolean arg0) {
        field761 = null;
        field764 = null;
        if (arg0) {
            field764 = (int[]) null;
        }
        field752 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 46)
    public static final void method405(Component arg0, int arg1) {
        field751++;
        if (arg1 != -1) {
            return;
        }
        Method var2 = class180.field2723;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        arg0.addKeyListener(class141.field2180);
        arg0.addFocusListener(class141.field2180);
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)Z", line = 72)
    public final boolean method406(int arg0) {
        field760++;
        if (arg0 != 2) {
            method404(true);
        }
        return this.field756 != null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)I", line = 90)
    public static final int method407(int arg0, int arg1) {
        if (class295.field4568 != null) {
            class295.field4568.method365(1);
            class295.field4568 = null;
        }
        field763++;
        class214.field3261++;
        if (arg1 != -1) {
            field762 = 127;
        }
        if (class214.field3261 > 4) {
            class214.field3261 = 0;
            class12.field190 = 0;
            return arg0;
        }
        class12.field190 = 0;
        if (class50.field813 == class106.field1648) {
            class106.field1648 = class258.field4045;
        } else {
            class106.field1648 = class50.field813;
        }
        return -1;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)Lqf;", line = 123)
    public static final class341 method408(int arg0) {
        if (arg0 <= 105) {
            method404(false);
        }
        field753++;
        return class119.field1825.length <= class20.field275 ? null : class119.field1825[class20.field275++];
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lkh;I)V", line = 143)
    public static final void method409(class166 arg0, int arg1) {
        field759++;
        if ((arg0.field2500.length - arg0.field2532) < 1) {
            return;
        }
        int var2 = arg0.method1178(0);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field2500.length - arg0.field2532)) {
            return;
        }
        class289.field4507 = arg0.method1178(0);
        if (class289.field4507 < 1) {
            class289.field4507 = 1;
        } else if (class289.field4507 > 4) {
            class289.field4507 = 4;
        }
        class188.method1341(false, arg0.method1178(0) == 1);
        class289.field4503 = arg0.method1178(0) == 1;
        class260.field4071 = arg0.method1178(0) == 1;
        class59.field962 = arg0.method1178(0) == 1;
        class170.field2565 = arg0.method1178(0) == 1;
        class274.field4244 = arg0.method1178(arg1 - 4) == 1;
        class232.field3674 = arg0.method1178(0) == 1;
        class217.field3303 = arg0.method1178(0) == 1;
        class289.field4509 = arg0.method1178(0);
        if (class289.field4509 > 2) {
            class289.field4509 = 2;
        }
        if (var2 < 2) {
            class208.field3191 = arg0.method1178(0) == 1;
            arg0.method1178(0);
        } else {
            class208.field3191 = arg0.method1178(0) == 1;
        }
        class300.field4691 = arg0.method1178(0) == 1;
        class152.field2291 = arg0.method1178(0) == 1;
        class89.field1422 = arg0.method1178(arg1 - 4);
        if (class89.field1422 > 2) {
            class89.field1422 = 2;
        }
        class181.field2734 = class89.field1422;
        class188.field2815 = arg0.method1178(0) == 1;
        class1.field20 = arg0.method1178(arg1 - 4);
        if (class1.field20 > 127) {
            class1.field20 = 127;
        }
        class289.field4502 = arg0.method1178(0);
        class201.field3016 = arg0.method1178(0);
        if (class201.field3016 > 127) {
            class201.field3016 = 127;
        }
        if (var2 >= 1) {
            class298.field4598 = arg0.method1151(arg1 ^ 0xFFFFFFB3);
            class259.field4057 = arg0.method1151(-86);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1178(arg1 ^ 0x4);
        }
        if (arg1 <= var2) {
            int var4 = arg0.method1178(0);
            if (class318.field4975 < 96) {
                var4 = 0;
            }
            class64.method490(var4);
        }
        if (var2 >= 5) {
            class270.field4209 = arg0.method1137(96);
        }
        if (var2 >= 6) {
            class322.field5029 = arg0.method1178(0);
        }
        if (var2 >= 7) {
            class55.field925 = arg0.method1178(0) == 1;
        }
        if (var2 >= 8) {
            class139.field2170 = arg0.method1178(0) == 1;
        }
        if (var2 >= 9) {
            class331.field5144 = arg0.method1178(0);
        }
        if (var2 >= 10) {
            class34.field512 = arg0.method1178(0) != 0;
        }
        if (var2 >= 11) {
            class210.field3208 = arg0.method1178(0) != 0;
        }
    }
}
