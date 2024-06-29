import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class569 {

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lat;")
    public static class378 field7820 = null;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field7822 = -50;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field7818;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field7821;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field7824;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lha;")
    public static class59 field7823;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "Lin;")
    public static class91 field7819;

    @OriginalMember(owner = "client!hj", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field7824++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V", line = 16)
    public static void method3289(byte arg0) {
        field7819 = null;
        if (arg0 > 93) {
            field7823 = null;
            field7820 = null;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V", line = 37)
    public static final void method3290(int arg0, int arg1, int arg2, int arg3) {
        field7821++;
        if (class15.field251 == arg3 && class67.field1267 == arg1 && class581.field7961 == arg2) {
            return;
        }
        class15.field251 = arg3;
        class30.field778 = true;
        class581.field7961 = arg2;
        class67.field1267 = arg1;
        double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / 16384.0D;
        double var6 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class34.field856 = var8;
        class7.field53 = var14;
        class67.field1268 = var12;
        class30.field777 = var8 * var12;
        if (arg0 != -15902) {
            method3289((byte) -120);
        }
        class749.field10378 = -var8 * var14;
        class384.field5575 = var10;
        class516.field7186 = 0.0D;
        class356.field5062 = -var10 * var12;
        class72.field1314 = var10 * var14;
    }
}
