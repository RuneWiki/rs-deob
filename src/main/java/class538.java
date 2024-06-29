import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class538 {

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field7468 = 0;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "I")
    public int field7463;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "I")
    public int field7465;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public int field7467;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IILha;IIIBI)V")
    public static final void method3090(int arg0, int arg1, class60 arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        arg2.method544(arg0, arg4, arg5, 18553, arg1, arg7);
        field7466++;
        arg2.method544(arg3, 16, arg5 + 1, 18553, arg1 - 2, arg7 + 1);
        if (arg6 < 16) {
            method3090(-98, -75, null, 104, 117, 105, (byte) 52, -38);
        }
        arg2.method532(arg4 - 19, arg1 + -2, arg5 + 1, arg7 + 18, true, arg3);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(ZI)V")
    public static final void method3091(boolean arg0, int arg1) {
        field7462++;
        if (class482.field6539.length() == 0) {
            return;
        }
        class320.method1883((byte) -60, "--> " + class482.field6539);
        class747.method4158(class482.field6539, arg1 ^ 0xFFFFAD9D, false, arg0);
        class298.field3915 = arg1;
        class665.field9359 = 0;
        class482.field6539 = "";
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIB)V")
    public static final void method3092(int arg0, int arg1, byte arg2) {
        field7464++;
        class210 var3 = class203.field2718[arg0][arg1];
        if (var3 != null) {
            class154.field2098 = var3.field2777;
            class699.field9723 = var3.field2778;
            class534.field7407 = var3.field2770;
        }
        if (arg2 != -63) {
            method3090(-62, 15, null, 95, -104, -35, (byte) 14, -12);
        }
        class726.method4052((byte) -113);
    }
}
