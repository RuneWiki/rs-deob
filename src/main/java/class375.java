import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class375 {

    @OriginalMember(owner = "client!at", name = "b", descriptor = "[I")
    public static int[] field5252 = new int[14];

    @OriginalMember(owner = "client!at", name = "c", descriptor = "Ljw;")
    public static class551 field5253 = new class551(5, 1);

    @OriginalMember(owner = "client!at", name = "a", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!at", name = "d", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!at", name = "e", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!at", name = "f", descriptor = "Lgba;")
    public static class664 field5256;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Lha;IZIIII)V", line = 6)
    public static final void method2355(class58 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((class328.field4637 == null || class402.field5612 == null || class747.field10449 == null) && class501.field7161.method1472(-25711, class558.field7946) && class501.field7161.method1472(-25711, class675.field9480) && class501.field7161.method1472(-25711, class535.field7555)) {
            class55 var7 = class55.method502(class501.field7161, class675.field9480, 0);
            class402.field5612 = arg0.method637(var7, true);
            var7.method504();
            class562.field7970 = arg0.method637(var7, true);
            class328.field4637 = arg0.method637(class55.method502(class501.field7161, class558.field7946, 0), true);
            class55 var8 = class55.method502(class501.field7161, class535.field7555, 0);
            class747.field10449 = arg0.method637(var8, true);
            var8.method504();
            class609.field8821 = arg0.method637(var8, true);
        }
        field5254++;
        if (!arg2) {
            method2357(-57);
        }
        if (class328.field4637 == null || class402.field5612 == null || class747.field10449 == null) {
            return;
        }
        int var9 = (arg5 - (class747.field10449.method93() * 2)) / class328.field4637.method93();
        for (int var10 = 0; var10 < var9; var10++) {
            class328.field4637.method4135(arg6 + class747.field10449.method93() + (var10 * class328.field4637.method93()), -class328.field4637.method95() + arg1 + arg4);
        }
        int var11 = (arg1 - class747.field10449.method95() - arg3) / class402.field5612.method95();
        for (int var12 = 0; var12 < var11; var12++) {
            class402.field5612.method4135(arg6, var12 * class402.field5612.method95() + arg3 + arg4);
            class562.field7970.method4135(arg5 + arg6 - class562.field7970.method93(), class402.field5612.method95() * var12 + arg3 + arg4);
        }
        class747.field10449.method4135(arg6, (arg4 + arg1) - class747.field10449.method95());
        class609.field8821.method4135(arg5 + arg6 - class747.field10449.method93(), arg4 + (arg1 - class747.field10449.method95()));
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "([Ljava/awt/Rectangle;BI)V", line = 67)
    public static final void method2356(Rectangle[] arg0, byte arg1, int arg2) throws class701 {
        int var3 = -63 / ((-arg1 - 69) / 46);
        field5251++;
        if (class435.field6079 == 1) {
            class154.field2309.method628(arg0, arg2, class591.field8302, class269.field3879);
        } else {
            class154.field2309.method628(arg0, arg2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)V", line = 85)
    public static void method2357(int arg0) {
        field5256 = null;
        field5252 = null;
        if (arg0 <= 56) {
            field5253 = null;
        }
        field5253 = null;
    }
}
