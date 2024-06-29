import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class381 extends class45 {

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field5038 = 16777215;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "F")
    public static float field5040;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "I")
    public static int field5042;

    // $FF: synthetic field
    @OriginalMember(owner = "client!e", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field5043;

    // $FF: synthetic method
    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2185(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lr;IIIIILfa;)V", line = 5)
    public static final void method2182(class562 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class522 arg6) {
        if (class630.field8726 < 100) {
            class180.method1210(-252, arg6, arg0);
        }
        field5042++;
        arg0.method1042(arg4, arg1, arg4 + arg5, arg1 + arg3);
        if (class630.field8726 < 100) {
            byte var7 = 20;
            int var8 = arg4 + (arg5 / 2);
            int var9 = arg1 + (arg3 / 2) - var7 - 18;
            arg0.method1113(arg4, arg1, arg5, arg3, -16777216, 0);
            arg0.method1121(var8 - 152, var9, 304, 34, class258.field3382[class482.field6705].getRGB(), 0);
            arg0.method1113(var8 - 150, var9 - -2, class630.field8726 * 3, 30, class390.field5226[class482.field6705].getRGB(), 0);
            class622.field8625.method2323(54, -1, var8, class325.field4378[class482.field6705].getRGB(), class371.field4897.method2141(class422.field5539, true), var7 + var9);
            return;
        }
        int var10 = class698.field9854 - ((int) ((float) arg5 / class672.field9558));
        int var11 = class424.field5722 + ((int) ((float) arg3 / class672.field9558));
        int var12 = -8 / ((arg2 - 38) / 50);
        int var13 = (int) ((float) arg5 / class672.field9558) + class698.field9854;
        class9.field87 = (int) ((float) (arg5 * 2) / class672.field9558);
        int var14 = class424.field5722 - ((int) ((float) arg3 / class672.field9558));
        class410.field5394 = (int) ((float) (arg3 * 2) / class672.field9558);
        class327.field4396 = class424.field5722 - ((int) ((float) arg3 / class672.field9558));
        class338.field4556 = class698.field9854 - ((int) ((float) arg5 / class672.field9558));
        class672.method3837(class672.field9567 + var10, var11 - -class672.field9587, class672.field9567 + var13, class672.field9587 + var14, arg4, arg1, arg4 + arg5, arg1 - -arg3 + 1);
        class672.method3816(arg0);
        class445 var15 = class672.method3827(arg0);
        class569.method3151(0, 0, (byte) 83, var15, arg0);
        if (class158.field2276 > 0) {
            class321.field4289--;
            if (class321.field4289 == 0) {
                class321.field4289 = 20;
                class158.field2276--;
            }
        }
        if (!class559.field7627) {
            return;
        }
        int var16 = arg4 + arg5 - 5;
        int var17 = arg1 + arg3 - 8;
        class401.field5319.method2324(16776960, -1, (byte) 115, "Fps:" + class91.field1119, var17, var16);
        int var21 = var17 - 15;
        Runtime var18 = Runtime.getRuntime();
        int var19 = (int) ((var18.totalMemory() - var18.freeMemory()) / 1024L);
        int var20 = 16776960;
        if (var19 > 65536) {
            var20 = 16711680;
        }
        class401.field5319.method2324(var20, -1, (byte) 115, "Mem:" + var19 + "k", var21, var16);
        var17 = var21 - 15;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 89)
    public static final void method2183(int arg0) {
        class262.field3411 = class274.method1652(35, 4, 2048, arg0 ^ 0xFFFF9367, true, 8, 8, 0.4F);
        field5039++;
        if (arg0 != -1) {
            method2184(false, false, null);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZZLjava/awt/Component;)Lti;", line = 100)
    public static final class325 method2184(boolean arg0, boolean arg1, Component arg2) {
        field5041++;
        try {
            if (arg1) {
                return null;
            } else {
                Constructor var3 = Class.forName("vn").getDeclaredConstructor(field5043 == null ? (field5043 = method2185("java.awt.Component")) : field5043, Boolean.TYPE);
                return (class325) var3.newInstance(arg2, Boolean.valueOf(arg0));
            }
        } catch (Throwable var4) {
            return new class461(arg2, arg0);
        }
    }
}
