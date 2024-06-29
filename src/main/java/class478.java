import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public abstract class class478 extends class304 {

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "Z")
    public static boolean field6865 = false;

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "D")
    public static double field6866 = -1.0D;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field6870 = 0;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field6872 = 0;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field6868;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field6869;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field6871;

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)Lmda;")
    public abstract class243 method1953(int arg0);

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)I")
    public static final int method2904(int arg0) {
        field6871++;
        int var1 = class30.field938.method2024((byte) 106);
        if (var1 < (class636.field9176.length + arg0)) {
            class30.field938 = class636.field9176[var1 + 1];
        }
        return 100;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
    public static final boolean method2905(int arg0, int arg1, int arg2) {
        if (arg0 != -7484) {
            field6866 = 1.043148275958645D;
        }
        field6869++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IBIIIIIIII)V")
    public static final void method2906(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field6868++;
        if (arg2 < 512 || arg4 < 512 || ((class675.field9604 - 2) * 512) < arg2 || (class218.field3316 * 512 - 1024) < arg4) {
            class559.field7906[0] = class559.field7906[1] = -1;
            return;
        }
        int var10 = class460.method2757(0, arg4, arg3, arg2) - arg7;
        class608.field8854.method891(arg9, 0, 0);
        class623.field9017.method145(class608.field8854);
        class623.field9017.method93(arg2, var10, arg4, class559.field7906);
        if (arg1 != 64) {
            field6866 = 1.1571202233841373D;
        }
        class608.field8854.method891(-arg9, 0, 0);
        class623.field9017.method145(class608.field8854);
    }
}
