import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class150 extends class161 {

    @OriginalMember(owner = "client!gf", name = "o", descriptor = "Z")
    public static boolean field2338 = true;

    @OriginalMember(owner = "client!gf", name = "m", descriptor = "Z")
    public static boolean field2336 = true;

    @OriginalMember(owner = "client!gf", name = "n", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!gf", name = "p", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!gf", name = "q", descriptor = "I")
    public int field2340;

    @OriginalMember(owner = "client!gf", name = "s", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!gf", name = "t", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!gf", name = "u", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!gf", name = "v", descriptor = "I")
    public static int field2345;

    @OriginalMember(owner = "client!gf", name = "x", descriptor = "I")
    public int field2347;

    @OriginalMember(owner = "client!gf", name = "B", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!gf", name = "y", descriptor = "Lne;")
    public class172 field2348;

    @OriginalMember(owner = "client!gf", name = "z", descriptor = "Lne;")
    public class172 field2349;

    @OriginalMember(owner = "client!gf", name = "l", descriptor = "Lmo;")
    public static class447 field2335;

    @OriginalMember(owner = "client!gf", name = "w", descriptor = "Ljava/lang/String;")
    public String field2346;

    @OriginalMember(owner = "client!gf", name = "r", descriptor = "Z")
    public boolean field2341;

    @OriginalMember(owner = "client!gf", name = "A", descriptor = "Z")
    public static boolean field2350;

    @OriginalMember(owner = "client!gf", name = "C", descriptor = "[Ljava/lang/Object;")
    public Object[] field2352;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIZIIIIII)V")
    public static final void method1061(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2342++;
        if (arg6 >= 1 && arg1 >= 1 && class80.field1003 - 2 >= arg6 && class380.field5751 - 2 >= arg1) {
            if (!class117.method852(true) && !class396.method2495(arg6, (byte) 59, class81.field1007, arg7, arg1)) {
                return;
            }
            if (class423.field6252 == null) {
                return;
            }
            int var9 = arg7;
            if (arg7 < 3 && class406.method2545(arg1, (byte) -124, arg6)) {
                var9 = arg7 + 1;
            }
            class203.method1445(class162.field2547[arg7], arg6, class284.field4547, var9, arg1, -24909, arg7, arg0);
            if (arg5 >= 0) {
                boolean var10 = class341.field5267;
                class341.field5267 = true;
                class250.method1732(false, class162.field2547[arg7], arg6, class284.field4547, arg1, false, arg4, arg3, arg8, arg5, arg7, 1, var9);
                class341.field5267 = var10;
            }
        }
        if (!arg2) {
            method1063(23, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(B)V")
    public static void method1062(byte arg0) {
        field2335 = null;
        int var1 = -71 % ((-arg0 - 73) / 53);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IB)I")
    public static final int method1063(int arg0, byte arg1) {
        int var2 = 75 % ((-arg1 - 74) / 46);
        field2343++;
        return arg0 & 0x7F;
    }
}
