import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public abstract class class387 extends class209 {

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field4956;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public int field4957;

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "I")
    public int field4959;

    @OriginalMember(owner = "client!mf", name = "i", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!mf", name = "j", descriptor = "I")
    public int field4961;

    @OriginalMember(owner = "client!mf", name = "l", descriptor = "I")
    public static int field4963;

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!mf", name = "k", descriptor = "Z")
    public boolean field4962;

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(B)V")
    public final void method140(byte arg0) {
        field4963++;
        int var2 = 6 % ((-arg0 - 16) / 40);
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        if (arg0 >= -30) {
            this.method137(106);
        }
        field4964++;
        return false;
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZLoa;Lnt;IIII)V")
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        field4956++;
        if (arg6 != 12137) {
            this.field4962 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/lang/String;II)V")
    public static final void method2213(String arg0, int arg1, int arg2) {
        class694.field9620++;
        field4960++;
        class124 var3 = class336.method1924(class555.field6932, class636.field8620, (byte) -73);
        var3.field1516.method3090(class680.method3757((byte) 60, arg0) + arg1, arg1 ^ 0x2);
        var3.field1516.method3050(false, arg0);
        var3.field1516.method3052(true, arg2);
        class197.method1156((byte) 95, var3);
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZZ)Z")
    public static boolean method2214(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }
}
