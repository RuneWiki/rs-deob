import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class118 {

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field1900;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public int field1898;

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "I")
    public int field1899;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
    public abstract void method1(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(III)V")
    public abstract void method2(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(III)I")
    public static final int method839(int arg0, int arg1, int arg2) {
        int var3 = class218.method1504(arg0 + 45365, 4, (byte) -122, arg2 + 91923) + (class218.method1504(arg0 + 10294, 2, (byte) -122, arg2 + 37821) - 128 >> 1) + (class218.method1504(arg0, 1, (byte) -122, arg2) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        field1897++;
        if (arg1 != -1114) {
            return -20;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(III)V")
    public class118(int arg0, int arg1, int arg2) {
        this.field1900 = arg0;
        this.field1898 = arg1;
        this.field1899 = arg2;
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "(III)V")
    public abstract void method4(int arg0, int arg1, int arg2);
}
