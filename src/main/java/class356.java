import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class356 {

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Lvv;")
    public static class313 field5546 = new class313(109, -1);

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Lnk;")
    public static class326 field5552 = new class326(9, 8);

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lla;Lza;ZIIII)V", line = 3)
    public static final void method2283(class296 arg0, class491 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg2) {
            class322.field5058.method1039((class358.field5581 - class322.field5058.method200()) / 2, (class49.field825 - class322.field5058.method198()) / 2);
            class328.field5172.method1039((class358.field5581 - class328.field5172.method200()) / 2, 18);
        }
        field5549++;
        String var7 = "";
        if (class271.field4501 == class251.field4283) {
            var7 = class140.field2327.method1954(class300.field4813, -30366);
        } else if (class271.field4501 == class131.field2246) {
            var7 = class402.field6118.method1954(class300.field4813, -30366);
        }
        arg0.method1897(class358.field5581 / 2, class49.field825 / 2 - 26, arg6, var7, 24244, -1);
        if (arg4 <= 86) {
            return;
        }
        int var8 = class49.field825 / 2 - 18;
        arg1.method915(class358.field5581 / 2 - 152, var8, 304, 34, arg3, 0);
        arg1.method915(class358.field5581 / 2 - 151, var8 - -1, 302, 32, 0, 0);
        arg1.method914(class358.field5581 / 2 - 150, var8 + 2, class10.field109 * 3, 30, arg5, 0);
        arg1.method914(class358.field5581 / 2 + class10.field109 * 3 - 150, var8 + 2, 300 - (class10.field109 * 3), 30, 0, 0);
        arg0.method1897(class358.field5581 / 2, class49.field825 / 2 + 4, arg6, class91.field1518, 24244, -1);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lnv;Ll;IILjava/awt/Canvas;I)Lza;", line = 45)
    public static final class491 method2284(class493 arg0, class196 arg1, int arg2, int arg3, Canvas arg4, int arg5) {
        field5547++;
        if (arg5 != -33) {
            field5546 = null;
        }
        return new class214(arg2, arg4, arg1, arg3, arg0);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)I", line = 56)
    public static final int method2285(int arg0) {
        field5545++;
        if (arg0 != 0) {
            field5546 = null;
        }
        if (class164.field2598 == null) {
            if (!class387.field5967 && class480.field7080 > 0) {
                if (class529.field7782 && class468.field6955.method1369(81, 26) && class480.field7080 > 2) {
                    return ((class162) class108.field1934.field6207.field4530.field4530).field2568;
                }
                return ((class162) class108.field1934.field6207.field4530).field2568;
            }
            int var1 = class333.field5233.method1660(2766);
            int var2 = class333.field5233.method1655(-121);
            int var3 = class508.field7390;
            int var4 = class265.field4428;
            int var5 = class134.field2262;
            if (var1 > var3 && var1 < (var3 + var5)) {
                int var6 = -1;
                for (int var7 = 0; var7 < class480.field7080; var7++) {
                    if (class331.field5216) {
                        int var11 = (class480.field7080 - var7 - 1) * 16 + (var4 + 33);
                        if (var2 > var11 - 13 && var11 + 3 >= var2) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class480.field7080 - var7 - 1) * 16 + var4 + 31;
                        if (var2 > var12 - 13 && var2 <= (var12 + 3)) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class182 var9 = new class182(class108.field1934);
                    for (class162 var10 = (class162) var9.method1235(arg0); var10 != null; var10 = (class162) var9.method1233((byte) -1)) {
                        if (var6 == (var8++)) {
                            return var10.field2568;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;", line = 146)
    public final String toString() {
        field5548++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V", line = 156)
    public static final void method2286(int arg0) {
        class77.method552((byte) -2);
        field5550++;
        if (arg0 != 3) {
            method2284(null, null, 66, 94, null, -57);
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(II)V", line = 169)
    public class356(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 185)
    public static void method2287(byte arg0) {
        field5552 = null;
        field5546 = null;
        int var1 = -91 / ((-arg0 - 68) / 38);
    }
}
