import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class138 {

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Lhj;")
    public static class596 field1726 = new class596(116, -1);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
    public static final void method1010(int arg0, byte arg1) {
        if (arg1 != 50) {
            field1726 = null;
        }
        field1727++;
        if (class268.field3168 == 1) {
            class343.field4302 = arg0;
        } else if (class268.field3168 == 2) {
            class324.field4023 = arg0;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)I")
    public static final int method1011(int arg0, int arg1, int arg2) {
        field1725++;
        if (class792.field10888 == -1) {
            return 1;
        }
        if (class118.field1503.field10665.method1903(0) != arg1) {
            class462.method2784(true, class637.field8688.method3584(class770.field10592, true), arg1, (byte) -10);
            if (arg1 != class118.field1503.field10665.method1903(0)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class109.field1370.getSize();
            class671.method3764(-67, class637.field8688.method3584(class770.field10592, true), class466.field6523, class363.field4526, true, class708.field9946);
            class496 var4 = class748.method4177(class792.field10888, 0, class733.field10257, 4);
            long var5 = class349.method2069(true);
            class363.field4526.method634();
            class93.field1234.method130(0, class343.field4301, 0);
            class363.field4526.method628(class93.field1234);
            class363.field4526.method565(var3.width / 2, var3.height / 2, 512, 512);
            class363.field4526.method626(1.0F);
            class363.field4526.method578(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class498 var7 = class363.field4526.method567(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class363.field4526.method13(0);
                class363.field4526.method6();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class203.field2438.method130((int) (((float) var11 - (float) var10 / 2.0F) * (float) class327.field4047), 0, (var10 + 1) * class327.field4047);
                        var7.method355(class203.field2438, null, 0);
                        var8++;
                        if ((long) arg0 <= class349.method2069(true) - var5) {
                            break label45;
                        }
                    }
                }
            }
            if (arg2 >= -127) {
                field1726 = null;
            }
            class363.field4526.method36();
            long var12 = (long) (var8 * 1000) / (class349.method2069(true) - var5);
            class363.field4526.method13(0);
            class363.field4526.method6();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V")
    public static void method1012(int arg0) {
        field1726 = null;
        if (arg0 != 0) {
            field1726 = null;
        }
    }
}
