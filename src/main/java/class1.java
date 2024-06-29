import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class155 {

    @OriginalMember(owner = "client!us", name = "o", descriptor = "I")
    private int field9;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!us", name = "r", descriptor = "I")
    private int field12;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "I")
    private int field4;

    @OriginalMember(owner = "client!us", name = "l", descriptor = "I")
    private int field6;

    @OriginalMember(owner = "client!us", name = "p", descriptor = "I")
    private int field10;

    @OriginalMember(owner = "client!us", name = "i", descriptor = "I")
    private int field3;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!us", name = "s", descriptor = "Lqe;")
    public static class465 field13 = new class465(61, 10);

    @OriginalMember(owner = "client!us", name = "t", descriptor = "I")
    public static int field14 = -1;

    @OriginalMember(owner = "client!us", name = "q", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "k", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "m", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "n", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 4)
    public static void method1(int arg0) {
        field13 = null;
        if (arg0 != -1) {
            method2(15);
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V", line = 16)
    public static final void method2(int arg0) {
        class166.field2454.method3050(false);
        if (arg0 != 148928876) {
            field14 = -80;
        }
        ++field5;
        class467.field6734.method3050(false);
        class309.field4361.method3050(false);
        class157.field2355.method3050(false);
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 33)
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9 = arg0;
        this.field1 = arg6;
        this.field12 = arg5;
        this.field4 = arg7;
        this.field6 = arg2;
        this.field10 = arg1;
        this.field3 = arg3;
        this.field2 = arg4;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)V", line = 49)
    public final void method3(int arg0, int arg1, byte arg2) {
        ++field11;
        int var4 = this.field9 * arg0 >> 12;
        int var5 = this.field10 * arg1 >> 12;
        if (arg2 == -30) {
            int var6 = this.field6 * arg0 >> 12;
            int var7 = this.field3 * arg1 >> 12;
            int var8 = this.field2 * arg0 >> 12;
            int var9 = this.field12 * arg1 >> 12;
            int var10 = this.field1 * arg0 >> 12;
            int var11 = this.field4 * arg1 >> 12;
            class348.method2183(var6, var4, false, var9, var11, super.field2329, var7, var5, var8, var10);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IZI)V", line = 80)
    public final void method4(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            this.field6 = 91;
        }
        ++field7;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)V", line = 93)
    public final void method5(int arg0, int arg1, int arg2) {
        ++field8;
        if (arg1 >= -107) {
            method1(58);
        }
    }
}
