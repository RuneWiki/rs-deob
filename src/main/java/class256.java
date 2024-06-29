import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class256 {

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "Lab;")
    public static class148 field3914 = new class148();

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3919 = "Connecting to update server";

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "[I")
    public static int[] field3920 = new int[32];

    @OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
    public static boolean field3922 = false;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "Lcj;")
    public static class119 field3921 = class84.method528(24161);

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method1709(byte arg0) {
        field3919 = null;
        field3920 = null;
        field3914 = null;
        int var1 = -118 % ((-arg0 - 23) / 46);
        field3921 = null;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lhc;Lhc;Z)V")
    public static final void method1710(class235 arg0, class235 arg1, boolean arg2) {
        if (arg2) {
            return;
        }
        class61.field852 = class84.method526(arg1, arg0, class199.field2769, 0, -6702);
        class7.field65 = (class182) class61.field852;
        class208.field2968 = class84.method526(arg1, arg0, class121.field1691, 0, -6702);
        class54.field787 = class84.method526(arg1, arg0, class284.field4403, 0, -6702);
        field3913++;
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(Lhc;Lhc;Z)V")
    public static final void method1711(class235 arg0, class235 arg1, boolean arg2) {
        class129.field1823 = arg1;
        field3916++;
        class228.field3456 = arg0;
        class43.field656 = class129.field1823.method1577(3, -6339);
        if (arg2) {
            method1713(-10);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1712(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3917++;
        if (class52.method328(19031, arg1)) {
            class94.method619(arg2, arg6, 28003, arg0, arg8, arg7, arg4, arg5, arg3, class158.field2208[arg1]);
        } else if (arg3 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class42.field640[var9] = true;
            }
        } else {
            class42.field640[arg3] = true;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
    public static final void method1713(int arg0) {
        if (arg0 != 0) {
            field3920 = null;
        }
        class221.field3312.method546(-90762264);
        field3915++;
        class227.field3445.method546(-90762264);
    }
}
