import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class561 extends class417 {

    @OriginalMember(owner = "client!fk", name = "p", descriptor = "I")
    public int field8339 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
    public int field8335 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "I")
    public int field8340 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public int field8333 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public int field8345 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
    public int field8343 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public int field8332 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "I")
    public int field8344 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Ljj;")
    public class101 field8334;

    @OriginalMember(owner = "client!fk", name = "m", descriptor = "I")
    public static int field8336;

    @OriginalMember(owner = "client!fk", name = "n", descriptor = "I")
    public static int field8337;

    @OriginalMember(owner = "client!fk", name = "o", descriptor = "I")
    public static int field8338;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "I")
    public static int field8342;

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "[Lha;")
    public static class53[] field8341;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V", line = 6)
    public static void method3378(byte arg0) {
        field8341 = null;
        if (arg0 != 109) {
            method3378((byte) 87);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIILica;)V", line = 19)
    public static final void method3379(int arg0, int arg1, int arg2, class571 arg3) {
        field8342++;
        if (arg3.field1872 == arg1 && arg1 != -1) {
            class78 var4 = class463.field6521.method2983(arg1, -122);
            int var5 = var4.field1056;
            if (var5 == 1) {
                arg3.field1882 = arg0;
                arg3.field1939 = 1;
                arg3.field1858 = 0;
                arg3.field1926 = 0;
                arg3.field1938 = 0;
                class163.method1179(-1721201176, arg3.field8496, var4, false, arg3.field8501, arg3.field8500, arg3.field1858);
            }
            if (var5 == 2) {
                arg3.field1938 = 0;
            }
        } else if (arg1 == -1 || arg3.field1872 == -1 || class463.field6521.method2983(arg1, -110).field1042 >= class463.field6521.method2983(arg3.field1872, -108).field1042) {
            arg3.field1947 = arg3.field1953;
            arg3.field1926 = 0;
            arg3.field1872 = arg1;
            arg3.field1858 = 0;
            arg3.field1882 = arg0;
            arg3.field1938 = 0;
            arg3.field1939 = 1;
            if (arg3.field1872 != -1) {
                class163.method1179(-1721201176, arg3.field8496, class463.field6521.method2983(arg3.field1872, -108), false, arg3.field8501, arg3.field8500, arg3.field1858);
            }
        }
        if (arg2 <= 18) {
            field8337 = 83;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Ljj;)V", line = 127)
    public class561(class101 arg0) {
        this.field8334 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(III)Z", line = 87)
    public final boolean method3380(int arg0, int arg1, int arg2) {
        int var4 = -119 / ((-arg2 - 23) / 36);
        field8338++;
        if (arg0 >= this.field8345 && arg0 <= this.field8340 && this.field8332 <= arg1 && arg1 <= this.field8339) {
            return true;
        } else {
            return this.field8344 <= arg0 && this.field8335 >= arg0 && arg1 >= this.field8343 && this.field8333 >= arg1;
        }
    }
}
