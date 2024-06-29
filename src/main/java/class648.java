import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class648 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field9134;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field9135;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field9136;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field9138;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "Ljava/lang/Thread;")
    public static Thread field9137;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIB[BII)Z")
    public static final boolean method3624(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5, int arg6) {
        field9134++;
        int var7 = arg6 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        if (arg3 != -110) {
            method3627(null, true, -76);
        }
        int var9 = -((arg1 + arg0 - 1) / arg1);
        int var10 = -((arg1 + arg6 - 1) / arg1);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg4[arg5] == 0) {
                    return true;
                }
                arg5 += arg1;
            }
            int var13 = arg5 - var8;
            if (arg4[var13 - 1] == 0) {
                return true;
            }
            arg5 = arg2 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I")
    public final int method3625(int arg0, int arg1, int arg2) {
        field9135++;
        int var4 = class338.field4244 <= arg1 ? arg1 : class338.field4244;
        if (arg2 != 0) {
            method3627(null, true, -100);
        }
        if (class369.field5051 == this) {
            return 0;
        } else if (class655.field9207 == this) {
            return var4 - arg0;
        } else if (class329.field4023 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9138++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method3626(int arg0) {
        field9137 = null;
        if (arg0 != 0) {
            method3627(null, false, -13);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lvc;ZI)V")
    public static final void method3627(class390 arg0, boolean arg1, int arg2) {
        if (class423.field5980) {
            arg2 = 0;
            class423.field5980 = false;
        }
        field9136++;
        if (class616.field8686 == null || !class616.field8686.method2217(arg0, 7142)) {
            class616.field8686 = arg0;
            class537.field7556 = class557.method3157(-60);
            class581.field8249 = arg2;
            class543.field7646 = arg2;
            if (class543.field7646 == 0) {
                class206.method1235((byte) 124);
            } else {
                class558.field7973 = class186.field2110;
                class212.field2570 = class16.field128;
                class599.field8431 = class465.field6639;
                class307.field3797 = class235.field2879;
                class518.field7377 = class656.field9237;
                class571.field8114 = class645.field9106;
                class272.field3388 = class108.field1172;
                class625.field8839 = class635.field8948;
                class252.field3144 = class117.field1289;
                class552.field7889 = class362.field4858;
            }
        }
        if (!arg1) {
            method3627(null, false, -10);
        }
    }
}
