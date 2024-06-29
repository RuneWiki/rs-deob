import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public abstract class class432 extends class498 {

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field6097 = -1;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field6098;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILoi;II)Lti;", line = 11)
    public static final class309 method2554(int arg0, class53 arg1, int arg2, int arg3) {
        if (arg2 != 27374) {
            method2554(-53, null, 93, 115);
        }
        field6096++;
        class403 var4 = new class403(arg1.method426(arg3, (byte) 9, arg0));
        class309 var5 = new class309(arg0, var4.method2356(arg2 - 52552), var4.method2356(-25178), var4.method2319((byte) 82), var4.method2319((byte) 116), var4.method2357((byte) 127) == 1, var4.method2357((byte) 125), var4.method2357((byte) 112));
        int var6 = var4.method2357((byte) 115);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field4504.method2657(arg2 ^ 0x4BC2, new class163(var4.method2357((byte) 121), var4.method2338(0), var4.method2338(0), var4.method2338(arg2 - 27374), var4.method2338(arg2 ^ 0x6AEE), var4.method2338(0), var4.method2338(0), var4.method2338(0), var4.method2338(0)));
        }
        var5.method1876(12800);
        return var5;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(B)V", line = 38)
    public static final void method2555(byte arg0) {
        field6098++;
        if (class258.field3835 != null) {
            return;
        }
        Container var1;
        if (class81.field1052 == null) {
            var1 = class268.field3914.field2165;
        } else {
            var1 = class81.field1052;
        }
        class47.field542 = var1.getSize().width;
        if (arg0 != -3) {
            return;
        }
        class285.field4177 = var1.getSize().height;
        if (class81.field1052 == var1) {
            Insets var2 = class81.field1052.getInsets();
            class285.field4177 -= var2.top + var2.bottom;
            class47.field542 -= var2.right + var2.left;
        }
        if (class334.method1996((byte) -78) == 1) {
            class205.field2971 = (class47.field542 - class196.field2793) / 2;
            class273.field4048 = class423.field5964;
            class226.field3256 = 0;
            class147.field1956 = class196.field2793;
        } else if (class494.field6991 < 96 && class405.field5737 == 0) {
            int var3 = class47.field542 <= 1024 ? class47.field542 : 1024;
            int var4 = class285.field4177 > 768 ? 768 : class285.field4177;
            class147.field1956 = var3;
            class205.field2971 = (class47.field542 - var3) / 2;
            class226.field3256 = 0;
            class273.field4048 = var4;
        } else {
            class226.field3256 = 0;
            class273.field4048 = class285.field4177;
            class205.field2971 = 0;
            class147.field1956 = class47.field542;
        }
        if (class293.field4292 != class257.field3825) {
            boolean var10000;
            if (class147.field1956 < 1024 && class273.field4048 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class487.field6799.setSize(class147.field1956, class273.field4048);
        if (class385.field5414 != null) {
            class385.field5414.method289(class487.field6799);
        }
        if (class81.field1052 == var1) {
            Insets var5 = class81.field1052.getInsets();
            class487.field6799.setLocation(class205.field2971 + var5.left, class226.field3256 + var5.top);
        } else {
            class487.field6799.setLocation(class205.field2971, class226.field3256);
        }
        if (class472.field6578 != -1) {
            class106.method719(~arg0, true);
        }
        class26.method166((byte) 116);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)I")
    public abstract int method1080(byte arg0);

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)J")
    public abstract long method1081(int arg0);

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "(I)I")
    public abstract int method1083(int arg0);

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "(I)I")
    public abstract int method1082(int arg0);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "(B)I")
    public abstract int method1084(byte arg0);
}
