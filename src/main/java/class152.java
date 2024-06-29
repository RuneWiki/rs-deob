import java.awt.Container;
import java.awt.Insets;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class152 extends class108 {

    @OriginalMember(owner = "client!lg", name = "v", descriptor = "I")
    private int field2680 = -32768;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field2668 = 0;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Lmb;")
    public static class96 field2673 = class243.method1708(")2", (byte) 121);

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public int field2669;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "I")
    public static int field2676;

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!lg", name = "t", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
    public int field2679;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
    public static final void method1112(int arg0) {
        if (arg0 != 6270) {
            return;
        }
        field2676++;
        Container var1;
        if (class207.field3571 != null) {
            var1 = class207.field3571;
        } else if (class103.field1743 == null) {
            var1 = class234.field4017.field2277;
        } else {
            var1 = class103.field1743;
        }
        class5.field109 = var1.getSize().width;
        class162.field2880 = var1.getSize().height;
        if (class103.field1743 == var1) {
            Insets var2 = class103.field1743.getInsets();
            class5.field109 -= var2.right + var2.left;
            class162.field2880 -= var2.top + var2.bottom;
        }
        if (class159.method1157(-1) >= 2) {
            class168.field2954 = class162.field2880;
            class163.field2891 = 0;
            class232.field3979 = class5.field109;
            class215.field3697 = 0;
        } else {
            class168.field2954 = 503;
            class232.field3979 = 765;
            class215.field3697 = 0;
            class163.field2891 = (class5.field109 - 765) / 2;
        }
        class3.field28.setSize(class232.field3979, class168.field2954);
        if (class103.field1743 == var1) {
            Insets var3 = class103.field1743.getInsets();
            class3.field28.setLocation(class163.field2891 + var3.left, class215.field3697 + var3.top);
        } else {
            class3.field28.setLocation(class163.field2891, class215.field3697);
        }
        if (class107.field1825 != -1) {
            class94.method659(true, (byte) 123);
        }
        class135.method1008(0);
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
    public static void method1113(boolean arg0) {
        if (arg0) {
            field2673 = null;
        }
        field2673 = null;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZI)V")
    public static final void method1114(boolean arg0, int arg1) {
        class135.method1009((byte) 3);
        field2675++;
        if (class101.field1729 != 30 && class101.field1729 != 25) {
            return;
        }
        class147.field2611++;
        if (class147.field2611 < 50 && !arg0) {
            return;
        }
        class147.field2611 = arg1;
        if (!class10.field174 && class211.field3638 != null) {
            class121.field2235++;
            class140.field2505.method1012((byte) 19, 119);
            try {
                class211.field3638.method1599(true, class140.field2505.field4124, class140.field2505.field4144, 0);
                class140.field2505.field4124 = 0;
            } catch (IOException var2) {
                class10.field174 = true;
            }
        }
        class135.method1009((byte) 3);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "()I")
    public final int method50() {
        field2671++;
        return this.field2680;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    public static final void method1115(boolean arg0) {
        class251 var1 = (class251) class175.field3048.method1811(2);
        if (!arg0) {
            return;
        }
        while (var1 != null) {
            if (var1.field4353 > 0) {
                var1.field4353--;
            }
            if (var1.field4353 != 0) {
                if (var1.field4354 > 0) {
                    var1.field4354--;
                }
                if (var1.field4354 == 0 && var1.field4338 >= 1 && var1.field4341 >= 1 && var1.field4338 <= 102 && var1.field4341 <= 102 && (var1.field4350 < 0 || class29.method194((byte) 96, var1.field4335, var1.field4350))) {
                    class244.method1716(var1.field4352, var1.field4345, var1.field4338, 57, var1.field4341, var1.field4335, var1.field4357, var1.field4350);
                    var1.field4354 = -1;
                    if (var1.field4358 == var1.field4350 && var1.field4358 == -1) {
                        var1.method1743((byte) 51);
                    } else if (var1.field4358 == var1.field4350 && var1.field4357 == var1.field4346 && var1.field4340 == var1.field4335) {
                        var1.method1743((byte) 123);
                    }
                }
            } else if (var1.field4358 < 0 || class29.method194((byte) 78, var1.field4340, var1.field4358)) {
                class244.method1716(var1.field4352, var1.field4345, var1.field4338, 73, var1.field4341, var1.field4340, var1.field4346, var1.field4358);
                var1.method1743((byte) 110);
            }
            var1 = (class251) class175.field3048.method1810(false);
        }
        field2672++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method52(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2678++;
        class35 var11 = class269.method1845(this.field2679, (byte) 61).method1152((class67) null, (byte) -113, 0, this.field2669);
        if (var11 != null) {
            var11.method52(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2680 = var11.method50();
        }
    }
}
