import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class361 {

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lsea;")
    private class648 field4762;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public int field4761;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field4766 = -1;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Z")
    public static boolean field4765;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIIII)V", line = 9)
    public static final void method2062(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class280.field3834 = arg0;
        class366.field4864 = arg2;
        class314.field4337 = arg4;
        class133.field1902 = arg3;
        class50.field591 = arg5;
        field4764++;
        if (arg1) {
            field4766 = 112;
        }
        if (class133.field1902 >= 100) {
            int var6 = class314.field4337 * 512 + 256;
            int var7 = class280.field3834 * 512 + 256;
            int var8 = class249.method1533(class367.field4944, var7, var6, 20) - class50.field591;
            int var9 = var6 - class666.field9335;
            int var10 = var8 - class441.field6102;
            int var11 = var7 - class11.field114;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class685.field9771 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class41.field475 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class685.field9771 < 1024) {
                class685.field9771 = 1024;
            }
            class164.field2363 = 0;
            if (class685.field9771 > 3072) {
                class685.field9771 = 3072;
            }
        }
        class203.field2863 = 2;
        class560.field7547 = -1;
        class199.field2832 = -1;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lci;ILsea;)V", line = 67)
    public class361(class414 arg0, int arg1, class648 arg2) {
        new class663(64);
        this.field4762 = arg2;
        this.field4761 = this.field4762.method3653(15, true);
    }
}
