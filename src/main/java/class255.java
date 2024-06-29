import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class255 extends class172 {

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field3925 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public int field3927 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public int field3926 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field3923 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "I")
    public int field3922 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "y", descriptor = "I")
    public int field3930 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field3934 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public int field3919 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "Lvo;")
    public class22 field3928;

    @OriginalMember(owner = "client!el", name = "C", descriptor = "Ljava/lang/String;")
    public static String field3933 = "Loading textures - ";

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!el", name = "z", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(IB)Ldl;", line = 8)
    public static final class321 method1887(int arg0, byte arg1) {
        class321 var2 = (class321) class332.field5095.method654(-69, (long) arg0);
        field3929++;
        if (var2 != null) {
            return var2;
        }
        if (arg1 >= -107) {
            field3933 = (String) null;
        }
        byte[] var3 = class210.field3234.method187(33, arg0, -1);
        class321 var4 = new class321();
        if (var3 != null) {
            var4.method2264(arg0, new class25(var3), -117);
        }
        class332.field5095.method652(102, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Lvo;)V", line = 145)
    public class255(class22 arg0) {
        this.field3928 = arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V", line = 39)
    public static void method1888(boolean arg0) {
        field3933 = null;
        if (!arg0) {
            field3933 = (String) null;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(Z)V", line = 50)
    public static final void method1889(boolean arg0) {
        field3931++;
        for (int var1 = 0; var1 < class120.field1861; var1++) {
            int var2 = class326.field5010[var1];
            class171 var3 = class177.field2795[var2];
            int var4 = class244.field3803.method281(-127);
            if ((var4 & 0x40) != 0) {
                var4 += class244.field3803.method281(-128) << 8;
            }
            class123.method1065(var4, -13289, var3, var2);
        }
        if (!arg0) {
            method1889(true);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(III)V", line = 79)
    public static final void method1890(int arg0, int arg1, int arg2) {
        if (arg2 < -49) {
            field3920++;
            class326.field5007 = new class66(arg0);
            class353.field5639 = new class66(arg1);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIB)Z", line = 95)
    public final boolean method1891(int arg0, int arg1, byte arg2) {
        if (arg2 >= -85) {
            this.field3923 = 116;
        }
        field3921++;
        if (this.field3919 <= arg1 && arg1 <= this.field3930 && this.field3934 <= arg0 && arg0 <= this.field3922) {
            return true;
        } else {
            return arg1 >= this.field3927 && arg1 <= this.field3925 && this.field3926 <= arg0 && this.field3923 >= arg0;
        }
    }
}
