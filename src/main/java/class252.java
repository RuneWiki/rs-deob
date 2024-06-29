import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sr")
public class class252 {

    @OriginalMember(owner = "client!sr", name = "c", descriptor = "I")
    public static int field3041 = -1;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "Lwd;")
    public static class272 field3039 = new class272(1);

    @OriginalMember(owner = "client!sr", name = "d", descriptor = "F")
    public static float field3042;

    @OriginalMember(owner = "client!sr", name = "b", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!sr", name = "e", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(IZIIII)V", line = 3)
    public static final void method1504(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class370.field4740 != null && (arg2 != 3 || class97.field1019 != arg4 || class249.field3017 != arg0)) {
            class66.method491((byte) -128, class289.field3549, class370.field4740);
            class370.field4740 = null;
        }
        field3040++;
        if (arg5 != 315) {
            method1504(-5, true, -126, -89, -71, 107);
        }
        if (arg2 == 3 && class370.field4740 == null) {
            class370.field4740 = class4.method14(class289.field3549, arg0, arg4, arg5 - 318, 0, 0);
            if (class370.field4740 != null) {
                class97.field1019 = arg4;
                class249.field3017 = arg0;
                class37.method168((byte) 114);
            }
        }
        if (arg2 == 3 && class370.field4740 == null) {
            method1504(-1, true, class654.field9334.field9843.method2453(-120), arg3, -1, 315);
            return;
        }
        Container var6;
        if (class370.field4740 != null) {
            class71.field758 = arg4;
            var6 = class370.field4740;
            class217.field2523 = arg0;
        } else if (class537.field7761 == null) {
            if (class255.field3123 == null) {
                var6 = class471.field6735;
            } else {
                var6 = class255.field3123;
            }
            class71.field758 = var6.getSize().width;
            class217.field2523 = var6.getSize().height;
        } else {
            Insets var7 = class537.field7761.getInsets();
            class71.field758 = class537.field7761.getSize().width - var7.left - var7.right;
            int var10001 = -var7.top;
            class217.field2523 = class537.field7761.getSize().height + var10001 - var7.bottom;
            var6 = class537.field7761;
        }
        if (arg2 == 1) {
            class705.field9926 = class12.field92;
            class504.field7104 = 0;
            class476.field6777 = class181.field2143;
            class93.field979 = (class71.field758 - class12.field92) / 2;
        } else {
            class211.method1254(0);
        }
        if (class342.field4425 != class237.field2829) {
            boolean var10000;
            if (class705.field9926 < 1024 && class476.field6777 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class606.method3439(512);
        } else {
            class618.field8849.setSize(class705.field9926, class476.field6777);
            if (class397.field5443) {
                class578.method3335(class618.field8849, true);
            } else {
                class275.field3370.method427(class618.field8849, class705.field9926, class476.field6777);
            }
            if (class537.field7761 == var6) {
                Insets var8 = class537.field7761.getInsets();
                class618.field8849.setLocation(class93.field979 + var8.left, class504.field7104 + var8.top);
            } else {
                class618.field8849.setLocation(class93.field979, class504.field7104);
            }
        }
        if (arg2 >= 2) {
            class67.field683 = true;
        } else {
            class67.field683 = false;
        }
        if (class327.field4245 != -1) {
            class296.method1762(arg5 - 209, true);
        }
        if (class751.field10504 != null && class28.method135(-752, class392.field5397)) {
            class227.method1309(arg5 - 232);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class272.field3360[var9] = true;
        }
        class237.field2828 = true;
    }

    @OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)V", line = 138)
    public static void method1505(int arg0) {
        int var1 = -65 / (arg0 / 56);
        field3039 = null;
    }
}
