import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class367 {

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lbda;I)V")
    public static final void method2143(class504 arg0, int arg1) {
        if (arg1 != -7139) {
            method2143(null, 36);
        }
        field4703++;
        int var2 = arg0.field7141 - class392.field5398;
        int var3 = arg0.field7172 * 512 + arg0.method1128(-1) * 256;
        int var4 = arg0.field7176 * 512 + (arg0.method1128(-1) * 256);
        arg0.field4629 += (var4 - arg0.field4629) / var2;
        arg0.field7185 = 0;
        arg0.field4635 += (var3 - arg0.field4635) / var2;
        if (arg0.field7119 == 0) {
            arg0.method3003((byte) 77, 8192);
        }
        if (arg0.field7119 == 1) {
            arg0.method3003((byte) -68, 12288);
        }
        if (arg0.field7119 == 2) {
            arg0.method3003((byte) -33, 0);
        }
        if (arg0.field7119 == 3) {
            arg0.method3003((byte) 113, 4096);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IZ)V")
    public static final void method2144(int arg0, boolean arg1) {
        field4702++;
        class227.field2589.method1028(class574.field8144.method414());
        int[] var2 = class574.field8144.method327();
        class470.field6713 = var2[3];
        class316.field4009 = var2[2];
        class471.field6746 = var2[1];
        class28.field314 = var2[0];
        if (arg1) {
            class574.field8144.method400(class42.field476, class334.field4315, class292.field3601, class114.field1197);
            class716.method3995(class92.field960, 22080);
        } else {
            class574.field8144.method400(class52.field545, class99.field1037, class110.field1167, class198.field2306);
            class716.method3995(class407.field5577, 22080);
        }
        if (arg0 != 512) {
            method2143(null, -110);
        }
    }
}
