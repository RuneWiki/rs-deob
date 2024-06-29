import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class316 extends class405 {

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
    private int field4507;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    private int field4505;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    private int field4504;

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field4506 = new String[100];

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "Lvfa;")
    public static class672 field4503 = null;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "Lhda;")
    public static class752 field4512 = new class752(123, 6);

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "[I")
    public static int[] field4514 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(III)V", line = 4)
    public final void method1403(int arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            ++field4513;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V", line = 14)
    public static final void method1925(int arg0, int arg1) {
        if (arg0 != 15) {
            method1925(81, 60);
        }
        ++field4510;
        class127 var2 = class760.method4231(arg1, -874792672, 7);
        var2.method1002(-117);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V", line = 30)
    public final void method1405(int arg0, int arg1, int arg2) {
        ++field4511;
        int var4 = -108 % ((arg0 - -71) / 53);
        int var5 = this.field4504 * arg2 >> 12;
        int var6 = this.field4505 * arg2 >> 12;
        int var7 = this.field4507 * arg1 >> 12;
        int var8 = this.field4509 * arg1 >> 12;
        class495.method2793(var6, super.field5641, var7, (byte) 120, var8, var5);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 50)
    public static void method1926(byte arg0) {
        field4514 = null;
        int var1 = 63 / ((arg0 - 50) / 52);
        field4512 = null;
        field4506 = null;
        field4503 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V", line = 65)
    public final void method1404(int arg0, byte arg1, int arg2) {
        if (arg1 != -72) {
            this.field4505 = -124;
        }
        ++field4508;
    }

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIII)V", line = 86)
    public class316(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4507 = arg1;
        this.field4509 = arg3;
        this.field4505 = arg2;
        this.field4504 = arg0;
    }
}
