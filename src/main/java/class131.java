import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class131 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "I")
    public static volatile int field1615 = -1;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "Lhj;")
    public static class596 field1618 = new class596(29, 8);

    @OriginalMember(owner = "client!co", name = "e", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIZB)V", line = 16)
    public static final void method977(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        field1616++;
        if (class260.field3075 != null && (arg0 != 3 || class390.field5041 != arg2 || class596.field8092 != arg1)) {
            class328.method1947(class521.field7389, arg5 ^ 0x51, class260.field3075);
            class260.field3075 = null;
        }
        if (arg0 == 3 && class260.field3075 == null) {
            class260.field3075 = class659.method3709(arg2, 0, 0, (byte) -124, class521.field7389, arg1);
            if (class260.field3075 != null) {
                class596.field8092 = arg1;
                class390.field5041 = arg2;
                class14.method194(true);
            }
        }
        if (arg0 == 3 && class260.field3075 == null) {
            method977(class118.field1503.field10674.method3823(arg5 + 60), -1, -1, arg3, true, (byte) -60);
            return;
        }
        Container var6;
        if (class260.field3075 != null) {
            class39.field570 = arg1;
            var6 = class260.field3075;
            class484.field6751 = arg2;
        } else if (class645.field8790 == null) {
            if (class345.field4331 == null) {
                var6 = class672.field9220;
            } else {
                var6 = class345.field4331;
            }
            class484.field6751 = var6.getSize().width;
            class39.field570 = var6.getSize().height;
        } else {
            Insets var7 = class645.field8790.getInsets();
            int var10001 = -var7.left;
            class484.field6751 = class645.field8790.getSize().width + (var10001 - var7.right);
            class39.field570 = class645.field8790.getSize().height - var7.top - var7.bottom;
            var6 = class645.field8790;
        }
        if (arg0 == 1) {
            class449.field6100 = (class484.field6751 - class243.field2870) / 2;
            class705.field9921 = class412.field5381;
            class701.field9880 = class243.field2870;
            class269.field3181 = 0;
        } else {
            class445.method2619(800);
        }
        if (class737.field10285 != class446.field6003) {
            boolean var10000;
            if (class701.field9880 < 1024 && class705.field9921 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg4) {
            class137.method1008(0);
        } else {
            class109.field1370.setSize(class701.field9880, class705.field9921);
            if (class769.field10572) {
                class5.method104(-9626, class109.field1370);
            } else {
                class363.field4526.method595(class109.field1370, class701.field9880, class705.field9921);
            }
            if (class645.field8790 == var6) {
                Insets var8 = class645.field8790.getInsets();
                class109.field1370.setLocation(var8.left + class449.field6100, var8.top - -class269.field3181);
            } else {
                class109.field1370.setLocation(class449.field6100, class269.field3181);
            }
        }
        if (arg0 < 2) {
            class31.field499 = false;
        } else {
            class31.field499 = true;
        }
        if (field1615 != -1) {
            class413.method2462(true, arg5 ^ 0xFFFFB31E);
        }
        if (class436.field5748 != null && class17.method211(class289.field3493, -25658)) {
            class74.method694(105);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class255.field2977[var9] = true;
        }
        if (arg5 != -60) {
            method978(56);
        }
        class4.field45 = true;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 149)
    public static void method978(int arg0) {
        field1618 = null;
        if (arg0 > -20) {
            field1615 = 64;
        }
    }
}
