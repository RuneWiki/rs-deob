import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public abstract class class149 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "[I")
    public static int[] field2165 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Z")
    public static boolean field2169 = true;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2166 = 0;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Z")
    public static boolean field2171 = false;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2174 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Lwe;")
    public static class82 field2172;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static final void method979(int arg0) {
        field2168++;
        class72.field857.method71(-88);
        if (arg0 >= -25) {
            field2169 = true;
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
    public static final void method980(int arg0) {
        while (true) {
            if (class163.field2332.method595(class230.field3314, -115) >= 11) {
                int var1 = class163.field2332.method594((byte) 96, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class253.field3656[var1] == null) {
                        class253.field3656[var1] = new class240();
                        if (class167.field2404[var1] != null) {
                            class253.field3656[var1].method1563(class167.field2404[var1], true);
                        }
                        var2 = true;
                    }
                    class46.field540[class238.field3432++] = var1;
                    class240 var3 = class253.field3656[var1];
                    var3.field4546 = class198.field2819;
                    int var4 = class228.field3220[class163.field2332.method594((byte) 117, 3)];
                    if (var2) {
                        var3.field4534 = var3.field4512 = var4;
                    }
                    int var5 = class163.field2332.method594((byte) 120, 1);
                    if (var5 == 1) {
                        class286.field4423[class272.field3986++] = var1;
                    }
                    int var6 = class163.field2332.method594((byte) 115, 1);
                    int var7 = class163.field2332.method594((byte) 91, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class163.field2332.method594((byte) 120, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1561(var6 == 1, class177.field2507.field4585[0] + var8, (byte) -117, class177.field2507.field4597[0] + var7);
                    continue;
                }
            }
            if (arg0 != -2886) {
                method981(70, 100, 99, (byte) -93, 3, 86);
            }
            class163.field2332.method587((byte) -110);
            field2167++;
            return;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIBII)V")
    public static final void method981(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        class204.field2903[0].method3(arg2, arg5);
        class204.field2903[1].method3(arg2, arg1 + arg5 - 16);
        field2173++;
        int var6 = (arg1 - 32) * arg1 / arg4;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg0 / (arg4 - arg1);
        class155.method1018(arg2, arg5 + 16, 16, arg1 - 32, class228.field3217);
        class155.method1018(arg2, arg5 + var7 + 16, 16, var6, class1.field22);
        class155.method1015(arg2, var7 + arg5 + 16, var6, class170.field2437);
        if (arg3 != -57) {
            field2165 = null;
        }
        class155.method1015(arg2 + 1, arg5 + 16 + var7, var6, class170.field2437);
        class155.method1014(arg2, var7 + arg5 + 16, 16, class170.field2437);
        class155.method1014(arg2, arg5 + var7 + 17, 16, class170.field2437);
        class155.method1015(arg2 + 15, arg5 + 16 + var7, var6, class217.field3072);
        class155.method1015(arg2 + 14, arg5 - -var7 + 17, var6 - 1, class217.field3072);
        class155.method1014(arg2, var7 + var6 + arg5 + 15, 16, class217.field3072);
        class155.method1014(arg2 + 1, arg5 + 14 + var6 + var7, 15, class217.field3072);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method982(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
    public static void method983(int arg0) {
        field2172 = null;
        field2165 = null;
        if (arg0 != 32) {
            method980(67);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method984(String arg0, int arg1, int arg2) {
        field2170++;
        class66 var3 = class6.method34(2, true, arg2);
        if (arg1 < -44) {
            var3.method408(0);
            var3.field785 = arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)I")
    public abstract int method985(int arg0);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method986(boolean arg0, Component arg1);
}
