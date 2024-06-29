import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class504 extends class405 {

    @OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
    public volatile boolean field7421 = true;

    @OriginalMember(owner = "client!hh", name = "s", descriptor = "I")
    public static int field7420 = 2;

    @OriginalMember(owner = "client!hh", name = "v", descriptor = "I")
    public static int field7423 = -1;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!hh", name = "u", descriptor = "I")
    public static int field7422;

    @OriginalMember(owner = "client!hh", name = "w", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Z")
    public boolean field7417;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Z")
    public boolean field7419;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ILbs;)V", line = 21)
    public static final void method2980(int arg0, class160 arg1) {
        if (arg1.field2400 != null) {
            arg1.field2400.field5133 = 0;
        }
        field7424++;
        arg1.field2399 = false;
        if (arg0 != 0) {
            field7420 = 3;
        }
        for (class160 var2 = arg1.method1131(); var2 != null; var2 = arg1.method1137()) {
            method2980(arg0, var2);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(III)I", line = 49)
    public static final int method2981(int arg0, int arg1, int arg2) {
        if (arg2 > -61) {
            field7420 = -49;
        }
        field7422++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)[B")
    public abstract byte[] method682(int arg0);

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)I")
    public abstract int method680(int arg0);
}
