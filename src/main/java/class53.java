import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class53 {

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Z")
    public static boolean field737 = false;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method379(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if ((arg1 & 0x1) == 1) {
            int var7 = arg6;
            arg6 = arg0;
            arg0 = var7;
        }
        int var8 = arg3 & 0x3;
        if (arg5 > -3) {
            field737 = true;
        }
        field736++;
        if (var8 == 0) {
            return arg2;
        } else if (var8 == 1) {
            return arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg2 - arg6;
        } else {
            return 8 - arg0 - arg4;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(JIIILqe;IB)V")
    public static final void method380(long arg0, int arg1, int arg2, int arg3, class168 arg4, int arg5, byte arg6) {
        field735++;
        class180.method1191(-24193);
        class112 var8 = new class112(128);
        var8.method768(10, arg6 ^ 0xFFFFE3AC);
        if (arg6 != -45) {
            return;
        }
        var8.method753((int) (Math.random() * 99999.0D), -242005080);
        var8.method753(501, -242005080);
        var8.method739(arg0, -23147);
        var8.method770((int) (Math.random() * 9.9999999E7D), (byte) -10);
        var8.method721(arg4, true);
        var8.method770((int) (Math.random() * 9.9999999E7D), (byte) -10);
        var8.method753(class153.field2661, -242005080);
        var8.method768(arg3, 7295);
        var8.method768(arg2, arg6 + 7340);
        var8.method770((int) (Math.random() * 9.9999999E7D), (byte) -10);
        var8.method753(arg5, arg6 - 242005035);
        var8.method753(arg1, -242005080);
        var8.method770((int) (Math.random() * 9.9999999E7D), (byte) -10);
        var8.method749(2, class23.field267, class61.field834);
        class87.field1348.field1821 = 0;
        class87.field1348.method768(27, 7295);
        class87.field1348.method768(var8.field1821, 7295);
        class87.field1348.method725(0, var8.field1821, var8.field1780, 1926268184);
        class223.field3835 = 1;
        class2.field20 = 3;
    }
}
