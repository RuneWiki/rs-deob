import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class499 {

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lvp;")
    public static class123 field7355 = new class123();

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field7356;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field7357;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BII)Z")
    public static final boolean method2988(byte arg0, int arg1, int arg2) {
        field7354++;
        if (arg0 <= 45) {
            method2990(-30);
        }
        return (arg2 & 0x70000) != 0 | class26.method163(arg1, (byte) -95, arg2) || class163.method1134(arg2, (byte) -116, arg1);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZIIIZ)V")
    public static final void method2989(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (class82.field1255 != null && (arg2 != 3 || class426.field6401.field1026 != arg0 || class426.field6401.field1000 != arg3)) {
            class498.method2984(100, class483.field7077, class82.field1255);
            class82.field1255 = null;
        }
        field7356++;
        if (arg2 == 3 && class82.field1255 == null) {
            class82.field1255 = class52.method318(arg3, arg0, 22140, 0, class483.field7077, 0);
            if (class82.field1255 != null) {
                class426.field6401.field1000 = arg3;
                class426.field6401.field1026 = arg0;
                class426.field6401.method2523(class483.field7077, -21);
            }
        }
        if (arg2 == 3 && class82.field1255 == null) {
            method2989(-1, true, class426.field6401.field991, -1, arg4, true);
            return;
        }
        Container var7;
        if (class82.field1255 != null) {
            class293.field4195 = arg0;
            class453.field6721 = arg3;
            var7 = class82.field1255;
        } else if (class214.field3119 == null) {
            var7 = class483.field7077.field6462;
            class293.field4195 = var7.getSize().width;
            class453.field6721 = var7.getSize().height;
        } else {
            Insets var6 = class214.field3119.getInsets();
            int var10001 = -var6.right;
            class293.field4195 = class214.field3119.getSize().width + var10001 - var6.left;
            int var12 = -var6.top;
            class453.field6721 = class214.field3119.getSize().height + var12 - var6.bottom;
            var7 = class214.field3119;
        }
        if (arg2 == 1) {
            class116.field1743 = class149.field2204;
            class4.field57 = class365.field5579;
            class320.field4580 = (class293.field4195 - class365.field5579) / 2;
            class500.field7363 = 0;
        } else if (class34.field363 < 96 && class170.field2529 == 0) {
            int var8 = class293.field4195 > 1024 ? 1024 : class293.field4195;
            class4.field57 = var8;
            class320.field4580 = (class293.field4195 - var8) / 2;
            int var9 = class453.field6721 > 768 ? 768 : class453.field6721;
            class500.field7363 = 0;
            class116.field1743 = var9;
        } else {
            class116.field1743 = class453.field6721;
            class320.field4580 = 0;
            class4.field57 = class293.field4195;
            class500.field7363 = 0;
        }
        if (class447.field6662 != class125.field1890) {
            boolean var10000;
            if (class4.field57 < 1024 && class116.field1743 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        if (arg1) {
            class195.method1311(42);
        } else {
            class364.field5570.setSize(class4.field57, class116.field1743);
            class348.field5015.method1042(class364.field5570);
            if (class214.field3119 == var7) {
                Insets var10 = class214.field3119.getInsets();
                class364.field5570.setLocation(class320.field4580 + var10.left, class500.field7363 + var10.top);
            } else {
                class364.field5570.setLocation(class320.field4580, class500.field7363);
            }
        }
        if (arg2 < 2) {
            class306.field4402 = false;
        } else {
            class306.field4402 = true;
        }
        if (class6.field79 != -1) {
            class159.method1015(true, (byte) 64);
        }
        if (class90.field1361 != null && (class193.field2832 == 30 || class193.field2832 == 25)) {
            class321.method1992(52);
        }
        for (int var11 = 0; var11 < 100; var11++) {
            class315.field4503[var11] = true;
        }
        class155.field2286 = arg5;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method2990(int arg0) {
        if (arg0 < 17) {
            field7355 = null;
        }
        field7355 = null;
    }
}
