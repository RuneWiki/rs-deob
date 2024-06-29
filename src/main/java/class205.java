import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class205 extends class274 {

    @OriginalMember(owner = "client!p", name = "U", descriptor = "Lgh;")
    public class514 field2964;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "Ldb;")
    public static class298 field2963 = new class298(23, 8);

    @OriginalMember(owner = "client!p", name = "W", descriptor = "F")
    public static float field2966;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V", line = 4)
    public static void method1333(int arg0) {
        field2963 = null;
        if (arg0 >= -103) {
            field2966 = -0.6959905F;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 14)
    public final void method1334(byte arg0) {
        this.field2964 = new class514((class667) super.field3800);
        if (arg0 < -39) {
            ++field2967;
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "(Lega;)V", line = 28)
    public class205(class667 arg0) {
        super(arg0);
        this.field2964 = new class514(arg0);
        super.field3839 = new class320(super.field3800);
        super.field3829 = new class320(super.field3800);
        super.field3827 = new class320(super.field3800);
        super.field3835 = new class320(super.field3800);
        super.field3836 = new class320(super.field3800);
        super.field3826 = new class320(super.field3800);
        super.field3837 = new class320(super.field3800);
        super.field3833 = new class320(super.field3800);
        super.field3817 = new class320(super.field3800);
        super.field3824 = new class320(super.field3800);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)V", line = 46)
    public static final void method1335(int arg0) {
        class439.field6039.method1311(958520326);
        ++field2965;
        int var1 = class439.field6039.method1318(-20, 8);
        if (class92.field1396 > var1) {
            for (int var2 = var1; ~class92.field1396 < ~var2; ++var2) {
                class190.field2800[class136.field2217++] = class415.field5681[var2];
            }
        }
        if (~var1 < ~class92.field1396) {
            throw new RuntimeException("gnpov1");
        } else {
            class92.field1396 = 0;
            if (arg0 > 73) {
                for (int var3 = 0; var3 < var1; ++var3) {
                    int var4 = class415.field5681[var3];
                    class287 var5 = ((class280) class616.field8143.method2918((long) var4, (byte) -126)).field3983;
                    int var6 = class439.field6039.method1318(119, 1);
                    if (~var6 == -1) {
                        class415.field5681[class92.field1396++] = var4;
                        var5.field5595 = class642.field8626;
                    } else {
                        int var7 = class439.field6039.method1318(-120, 2);
                        if (~var7 == -1) {
                            class415.field5681[class92.field1396++] = var4;
                            var5.field5595 = class642.field8626;
                            class329.field4530[class360.field4868++] = var4;
                        } else if (~var7 == -2) {
                            class415.field5681[class92.field1396++] = var4;
                            var5.field5595 = class642.field8626;
                            int var8 = class439.field6039.method1318(-43, 3);
                            var5.method1776(-1, var8, 1);
                            int var9 = class439.field6039.method1318(108, 1);
                            if (var9 == 1) {
                                class329.field4530[class360.field4868++] = var4;
                            }
                        } else if (var7 == 2) {
                            class415.field5681[class92.field1396++] = var4;
                            var5.field5595 = class642.field8626;
                            if (~class439.field6039.method1318(106, 1) != -2) {
                                int var10 = class439.field6039.method1318(-114, 3);
                                var5.method1776(-1, var10, 0);
                            } else {
                                int var11 = class439.field6039.method1318(113, 3);
                                var5.method1776(-1, var11, 2);
                                int var12 = class439.field6039.method1318(-114, 3);
                                var5.method1776(-1, var12, 2);
                            }
                            int var13 = class439.field6039.method1318(118, 1);
                            if (var13 == 1) {
                                class329.field4530[class360.field4868++] = var4;
                            }
                        } else if (var7 == 3) {
                            class190.field2800[class136.field2217++] = var4;
                        }
                    }
                }
            }
        }
    }
}
