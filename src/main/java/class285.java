import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class285 extends class316 {

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "I")
    public static int field4200;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "I")
    public static int field4202;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
    private int field4204;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    private int field4205;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(II)Lne;", line = 6)
    public static final class336 method1849(int arg0, int arg1) {
        field4200++;
        if (arg1 != 8) {
            return null;
        }
        class336[] var2 = class751.method4181((byte) 86);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class336 var4 = var2[var3];
            if (var4.field4723 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BLmda;)V", line = 38)
    public final void method152(byte arg0, class276 arg1) {
        arg1.method1801((byte) -119, this.field4205, this.field4204);
        if (arg0 > 80) {
            field4203++;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILso;)V", line = 53)
    public final void method148(int arg0, class494 arg1) {
        field4201++;
        if (arg0 != -1001) {
            this.field4205 = 88;
        }
        this.field4205 = arg1.method2976(-127);
        this.field4204 = arg1.method2976(-126);
    }
}
