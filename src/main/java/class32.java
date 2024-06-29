import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class32 extends class638 {

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "Lwk;")
    public static class430 field302 = new class430(13, 5);

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "Z")
    public static boolean field304 = false;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public static final void method164(int arg0) {
        field301++;
        class703 var1 = (class703) client.field6492.method3463((byte) -50);
        boolean var2 = class146.field2298 != null || class510.field7401 > 0;
        if (arg0 != -29861) {
            method166(-77);
        }
        int var3 = var1.method3020(-4);
        int var4 = var1.method3017((byte) 61);
        if (var2) {
            class274.field4187 = 1;
        }
        if (var2) {
            class469.field6822 = class237.field3813;
        } else {
            class370.method2364(true, var4, var3, class237.field3813);
        }
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZB)V")
    public static final void method165(boolean arg0, byte arg1) {
        field303++;
        if (arg1 != -108) {
            return;
        }
        class418.field6153.method673(class13.field119.method236());
        int[] var2 = class13.field119.method217();
        class328.field4848 = var2[3];
        class665.field9440 = var2[0];
        class650.field9234 = var2[1];
        class304.field4628 = var2[2];
        if (arg0) {
            class13.field119.method288(class391.field5841, class259.field4049, class118.field1816, class59.field928);
            class475.method2886(true, class293.field4498);
        } else {
            class13.field119.method288(class369.field5617, class171.field2940, class173.field2958, class436.field6374);
            class475.method2886(true, class602.field8517);
        }
    }

    @OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(I)V")
    public class32(int arg0) {
        this.field300 = arg0;
    }

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
    public static void method166(int arg0) {
        if (arg0 != -16677) {
            field302 = null;
        }
        field302 = null;
    }
}
