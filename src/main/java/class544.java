import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class544 implements class563 {

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "Lga;")
    private class332 field7441;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "[I")
    public static int[] field7439 = new int[2];

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field7440;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field7442;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field7443;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
    public final int method184(int arg0) {
        field7443++;
        if (this.field7441.method1953(126)) {
            return 100;
        } else {
            int var2 = 32 % ((arg0 - 47) / 54);
            return this.field7441.method1935(100);
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lga;)V")
    public class544(class332 arg0) {
        this.field7441 = arg0;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
    public static void method3047(boolean arg0) {
        field7439 = null;
        if (arg0) {
            method3047(true);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Lrba;")
    public final class67 method179(int arg0) {
        field7440++;
        if (arg0 != -24832) {
            this.method179(-9);
        }
        return class67.field820;
    }
}
