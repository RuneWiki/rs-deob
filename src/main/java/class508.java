import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class508 extends class55 {

    @OriginalMember(owner = "client!pw", name = "m", descriptor = "F")
    public static float field7354 = 0.0F;

    @OriginalMember(owner = "client!pw", name = "j", descriptor = "I")
    public static int field7351;

    @OriginalMember(owner = "client!pw", name = "k", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!pw", name = "l", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(Liu;IB)V", line = 5)
    public static final void method2962(class415 arg0, int arg1, byte arg2) {
        if (arg2 < 85) {
            field7354 = -0.531497F;
        }
        class168.field2522 = false;
        class177.field2636 = 0;
        field7351++;
        class27.method162(arg0, -1);
        class50.method448(-116, arg0);
        if (class168.field2522) {
            System.out.println("---endgpp---");
        }
        if (arg0.field7558 != arg1) {
            throw new RuntimeException("gpi1 pos:" + arg0.field7558 + " psize:" + arg1);
        }
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(III)Z", line = 27)
    public static final boolean method2963(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field7354 = -0.067001194F;
        }
        field7352++;
        return (arg2 & 0x800) != 0 && (arg0 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(IZI)V", line = 41)
    public static final void method2964(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field7353++;
            class275 var3 = class213.method1433((byte) 62, 12, arg2);
            var3.method1778(0);
            var3.field4113 = arg0;
        }
    }
}
