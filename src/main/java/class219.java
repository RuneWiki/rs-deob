import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public abstract class class219 extends class697 {

    @OriginalMember(owner = "client!tea", name = "A", descriptor = "S")
    public short field3319;

    @OriginalMember(owner = "client!tea", name = "z", descriptor = "Lsb;")
    public static class266 field3318 = new class266(82, -1);

    @OriginalMember(owner = "client!tea", name = "F", descriptor = "I")
    public static int field3324 = 0;

    @OriginalMember(owner = "client!tea", name = "G", descriptor = "Lqfa;")
    public static class85 field3325 = new class85(72, 3);

    @OriginalMember(owner = "client!tea", name = "H", descriptor = "J")
    public static long field3326 = 0L;

    @OriginalMember(owner = "client!tea", name = "y", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!tea", name = "B", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!tea", name = "C", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!tea", name = "D", descriptor = "I")
    public static int field3322;

    @OriginalMember(owner = "client!tea", name = "E", descriptor = "I")
    public static int field3323;

    @OriginalMember(owner = "client!tea", name = "i", descriptor = "(I)V")
    public static void method1521(int arg0) {
        if (arg0 != 3) {
            method1521(0);
        }
        field3318 = null;
        field3325 = null;
    }

    @OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(IIIIII)V")
    public class219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9815 = arg2;
        super.field9809 = arg1;
        super.field9804 = (byte) arg4;
        super.field9814 = (byte) arg3;
        this.field3319 = (short) arg5;
        super.field9806 = arg0;
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "([Lff;B)I")
    public final int method835(class9[] arg0, byte arg1) {
        if (arg1 < 102) {
            this.method836(false);
        }
        ++field3323;
        return this.method3896(super.field9815 >> class30.field940, arg0, 48, super.field9806 >> class30.field940);
    }

    @OriginalMember(owner = "client!tea", name = "f", descriptor = "(B)Z")
    public final boolean method838(byte arg0) {
        ++field3320;
        if (arg0 < 4) {
            this.field3319 = -49;
        }
        return class649.method3708(super.field9806 >> class30.field940, -127, super.field9804, super.field9815 >> class30.field940);
    }

    @OriginalMember(owner = "client!tea", name = "b", descriptor = "(Z)Z")
    public final boolean method836(boolean arg0) {
        if (!arg0) {
            field3325 = null;
        }
        ++field3322;
        return class224.field3361[(super.field9806 >> class30.field940) + -class547.field7768 + class643.field9239][(super.field9815 >> class30.field940) + -class318.field4685 + class643.field9239];
    }

    @OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)Z")
    public static final boolean method1522(int arg0, int arg1) {
        ++field3321;
        if (~arg1 != -23 && arg1 != 60 && arg1 != 48 && arg1 != 59 && arg1 != 25) {
            if (arg0 != 72) {
                method1522(55, 42);
            }
            return ~arg1 == -21 || arg1 == 1011;
        } else {
            return true;
        }
    }
}
