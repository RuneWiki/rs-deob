import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class504 extends class577 {

    @OriginalMember(owner = "client!eu", name = "C", descriptor = "S")
    public static short field7155 = 205;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "F")
    public static float field7152;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
    public int field7138;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public int field7139;

    @OriginalMember(owner = "client!eu", name = "n", descriptor = "I")
    public static int field7140;

    @OriginalMember(owner = "client!eu", name = "o", descriptor = "I")
    public int field7141;

    @OriginalMember(owner = "client!eu", name = "p", descriptor = "I")
    public int field7142;

    @OriginalMember(owner = "client!eu", name = "q", descriptor = "I")
    public int field7143;

    @OriginalMember(owner = "client!eu", name = "s", descriptor = "I")
    public int field7145;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public int field7146;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "I")
    public static int field7147;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public int field7148;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public static int field7149;

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "I")
    public int field7150;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public int field7151;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public int field7153;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public int field7154;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public int field7156;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public int field7158;

    @OriginalMember(owner = "client!eu", name = "G", descriptor = "I")
    public int field7159;

    @OriginalMember(owner = "client!eu", name = "J", descriptor = "I")
    public int field7162;

    @OriginalMember(owner = "client!eu", name = "K", descriptor = "I")
    public int field7163;

    @OriginalMember(owner = "client!eu", name = "H", descriptor = "Lqk;")
    public class18 field7160;

    @OriginalMember(owner = "client!eu", name = "I", descriptor = "Ldga;")
    public class218 field7161;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "Lvu;")
    public class356 field7157;

    @OriginalMember(owner = "client!eu", name = "r", descriptor = "Lvm;")
    public class714 field7144;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(BIIIIII)J", line = 3)
    public static final long method3044(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field7149++;
        if (arg0 == 37) {
            class4.field31.clear();
            class4.field31.set(arg1, arg5, arg6, arg4, arg3, arg2);
            return class4.field31.getTime().getTime();
        } else {
            return 56L;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 18)
    public final void method3045(int arg0) {
        this.field7157 = null;
        this.field7160 = null;
        this.field7144 = null;
        this.field7161 = null;
        field7147++;
        if (arg0 <= 32) {
            this.method3045(117);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IZI)V", line = 46)
    public static final void method3046(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method3046(54, false, 99);
        }
        field7140++;
        class313 var3 = class312.method1998((long) arg2, 12, -1);
        var3.method2001((byte) -81);
        var3.field4464 = arg0;
    }
}
