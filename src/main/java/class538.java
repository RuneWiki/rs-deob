import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class538 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIZB)V", line = 9)
    public static final void method3035(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (class463.field6333 != null && (arg2 != 3 || class72.field935.field6524 != arg3 || class72.field935.field6539 != arg1)) {
            class157.method1050(class495.field6687, class463.field6333, 28);
            class463.field6333 = null;
        }
        field7379++;
        if (arg2 == 3 && class463.field6333 == null) {
            class463.field6333 = class375.method2287(0, class495.field6687, -1, arg3, arg1, 0);
            if (class463.field6333 != null) {
                class72.field935.field6539 = arg1;
                class72.field935.field6524 = arg3;
                class72.field935.method1856(0, class495.field6687);
            }
        }
        if (arg2 == 3 && class463.field6333 == null) {
            method3035(arg0, -1, class72.field935.field6507, -1, true, (byte) -35);
            return;
        }
        Container var6;
        if (class463.field6333 != null) {
            class227.field2965 = arg3;
            class649.field9200 = arg1;
            var6 = class463.field6333;
        } else if (class250.field3376 == null) {
            if (class372.field5359 == null) {
                var6 = class575.field7958;
            } else {
                var6 = class372.field5359;
            }
            class227.field2965 = var6.getSize().width;
            class649.field9200 = var6.getSize().height;
        } else {
            Insets var7 = class250.field3376.getInsets();
            class227.field2965 = class250.field3376.getSize().width - var7.left - var7.right;
            class649.field9200 = class250.field3376.getSize().height - var7.bottom - var7.top;
            var6 = class250.field3376;
        }
        if (arg5 >= -8) {
            return;
        }
        if (arg2 == 1) {
            class243.field3276 = 0;
            class303.field4059 = class432.field5995;
            class407.field5739 = (class227.field2965 - class432.field5995) / 2;
            class211.field2763 = class384.field5582;
        } else {
            class650.method3612(81);
        }
        if (class375.field5396 != class333.field4859) {
            boolean var10000;
            if (class303.field4059 < 1024 && class211.field2763 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class449.method2568(false);
        } else {
            class249.field3351.setSize(class303.field4059, class211.field2763);
            class9.field103.method1790(class249.field3351);
            if (class250.field3376 == var6) {
                Insets var8 = class250.field3376.getInsets();
                class249.field3351.setLocation(var8.left + class407.field5739, var8.top - -class243.field3276);
            } else {
                class249.field3351.setLocation(class407.field5739, class243.field3276);
            }
        }
        if (arg2 >= 2) {
            class507.field6859 = true;
        } else {
            class507.field6859 = false;
        }
        if (class316.field4599 != -1) {
            class255.method1599(true, true);
        }
        if (class80.field1014 != null && class90.method500((byte) 107, class476.field6436)) {
            class252.method1579((byte) 103);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class200.field2630[var9] = true;
        }
        class569.field7877 = true;
    }
}
