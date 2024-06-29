import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class340 {

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(BII)Z")
    public static final boolean method2188(byte arg0, int arg1, int arg2) {
        field4854++;
        if (arg0 > -116) {
            return true;
        } else {
            return class531.method3113(93, arg2, arg1) || class251.method1654(arg1, arg2, (byte) -39);
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)V")
    public static final void method2189(int arg0, int arg1, int arg2, int arg3) {
        field4852++;
        if (arg1 == 1002) {
            class604.method3513(class110.field1354, arg0, arg2);
        } else if (arg1 == 1001) {
            class604.method3513(class53.field563, arg0, arg2);
        } else if (arg1 == 1007) {
            class604.method3513(class570.field8223, arg0, arg2);
        } else if (arg1 == 1009) {
            class604.method3513(class387.field5961, arg0, arg2);
        } else if (arg1 == 1011) {
            class604.method3513(class626.field9063, arg0, arg2);
        }
        if (arg3 < -123) {
            ;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(III)Z")
    public static final boolean method2190(int arg0, int arg1, int arg2) {
        if (arg1 == 1011) {
            field4853++;
            return class40.method217(arg2, arg0, (byte) -101) | (arg2 & 0x70000) != 0 || class489.method2938(arg2, arg0, -20661);
        } else {
            return false;
        }
    }
}
