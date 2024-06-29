import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class364 extends class431 {

    @OriginalMember(owner = "client!ni", name = "m", descriptor = "Ljava/lang/String;")
    public String field5381;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field5387 = 1339;

    @OriginalMember(owner = "client!ni", name = "p", descriptor = "I")
    public static int field5384 = 0;

    @OriginalMember(owner = "client!ni", name = "n", descriptor = "I")
    public static int field5382 = 0;

    @OriginalMember(owner = "client!ni", name = "l", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!ni", name = "o", descriptor = "I")
    public static int field5383;

    @OriginalMember(owner = "client!ni", name = "q", descriptor = "I")
    public static int field5385;

    @OriginalMember(owner = "client!ni", name = "r", descriptor = "I")
    public static int field5386;

    @OriginalMember(owner = "client!ni", name = "k", descriptor = "Lhs;")
    public static class216 field5379;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(II)I")
    public static final int method2279(int arg0, int arg1) {
        if (arg1 != -1545518168) {
            method2281(127);
        }
        field5386++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static void method2280(byte arg0) {
        if (arg0 < 77) {
            field5382 = -78;
        }
        field5379 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public static final void method2281(int arg0) {
        class181.field2717.method271(((float) class193.field3258.field7253 * 0.1F + 0.7F) * 1.1523438F);
        field5383++;
        class181.field2717.method324(class524.field7676, 0.69921875F, 1.2F, -50.0F, (float) arg0, -50.0F);
        class181.field2717.method371(class333.field4982, -1, 256);
        class181.field2717.method370(class516.field7505);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IIIII)I")
    public static final int method2282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5385++;
        int var5 = arg3 & 0xF;
        int var6 = var5 >= 8 ? arg2 : arg0;
        int var7 = var5 < 4 ? arg2 : (var5 == 12 || var5 == 14 ? arg0 : arg1);
        if (arg4 >= -83) {
            method2280((byte) -14);
        }
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
    public class364() {
    }

    @OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class364(String arg0, int arg1) {
        this.field5381 = arg0;
    }
}
