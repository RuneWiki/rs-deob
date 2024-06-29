import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class555 {

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Z")
    public static boolean field7483 = false;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field7480;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field7481;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field7482;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field7484;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljava/lang/String;")
    public String field7479;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 8)
    public static final String method3112(int arg0, int arg1, boolean arg2) {
        field7482++;
        if (arg2 && arg0 >= 0) {
            return arg1 == 1024 ? class284.method1746(48, arg2, arg0, 10) : null;
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIZI)V", line = 24)
    public static final void method3113(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (class54.field613 != null && (arg1 != 3 || class366.field4875.field9355 != arg5 || class366.field4875.field9374 != arg0)) {
            class242.method1503(class54.field613, class543.field7374, (byte) -98);
            class54.field613 = null;
        }
        field7484++;
        if (arg1 == 3 && class54.field613 == null) {
            class54.field613 = class183.method1257(arg5, (byte) 110, 0, arg0, 0, class543.field7374);
            if (class54.field613 != null) {
                class366.field4875.field9374 = arg0;
                class366.field4875.field9355 = arg5;
                class366.field4875.method543(class543.field7374, (byte) 41);
            }
        }
        if (arg1 == 3 && class54.field613 == null) {
            method3113(-1, class366.field4875.field9370, arg2, 24779, true, -1);
            return;
        }
        Container var6;
        if (class54.field613 != null) {
            class148.field2192 = arg5;
            class595.field8319 = arg0;
            var6 = class54.field613;
        } else if (class130.field1868 == null) {
            if (class59.field668 == null) {
                var6 = class356.field4728;
            } else {
                var6 = class59.field668;
            }
            class148.field2192 = var6.getSize().width;
            class595.field8319 = var6.getSize().height;
        } else {
            Insets var7 = class130.field1868.getInsets();
            class148.field2192 = class130.field1868.getSize().width - var7.right - var7.left;
            int var10001 = -var7.top;
            class595.field8319 = class130.field1868.getSize().height + (var10001 - var7.bottom);
            var6 = class130.field1868;
        }
        if (arg1 == 1) {
            class703.field9949 = 0;
            class340.field4553 = class157.field2277;
            class222.field3096 = class178.field2581;
            class323.field4401 = (class148.field2192 - class178.field2581) / 2;
        } else {
            class13.method63(arg3 ^ 0x609F);
        }
        if (class603.field8404 != class164.field2358) {
            boolean var10000;
            if (class222.field3096 < 1024 && class340.field4553 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class234.method1475((byte) 41);
        } else {
            class611.field8473.setSize(class222.field3096, class340.field4553);
            class334.field4506.method197(class611.field8473);
            if (class130.field1868 == var6) {
                Insets var8 = class130.field1868.getInsets();
                class611.field8473.setLocation(var8.left + class323.field4401, var8.top - -class703.field9949);
            } else {
                class611.field8473.setLocation(class323.field4401, class703.field9949);
            }
        }
        if (arg1 >= 2) {
            class279.field3824 = true;
        } else {
            class279.field3824 = false;
        }
        if (class631.field8758 != -1) {
            class546.method3075(true, arg3 ^ 0x60CB);
        }
        if (class589.field8272 != null && class689.method3882(class285.field3921, -12)) {
            class468.method2645((byte) 87);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class130.field1872[var9] = true;
        }
        if (arg3 != 24779) {
            field7483 = true;
        }
        class262.field3554 = true;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lba;", line = 159)
    public static final class352 method3114(int arg0) {
        field7481++;
        if (arg0 != -1) {
            field7483 = false;
        }
        class352 var1 = class125.method900(0);
        var1.field4685 = null;
        var1.field4682 = 0;
        var1.field4686 = new class455(5000);
        return var1;
    }
}
