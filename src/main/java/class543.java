import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class543 extends class45 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "Lwo;")
    public class445 field7435 = new class445();

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "Z")
    public static boolean field7438 = false;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field7434;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field7436;

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "Lga;")
    public static class332 field7433;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "[[[Lse;")
    public static class207[][][] field7437;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BIII)V")
    public static final void method3044(byte arg0, int arg1, int arg2, int arg3) {
        field7436++;
        if (arg0 > -50) {
            method3044((byte) 111, 46, 90, 38);
        }
        int var4 = arg1 << 3;
        int var5 = arg2 << 3;
        int var6 = arg3 << 3;
        class475.field6610 = var5;
        if (class311.field4200 == 2) {
            class660.field9416 = var4;
            class558.field7615 = var5;
            class604.field8440 = var6;
        }
        class565.field7707 = var6;
        class401.method2296((byte) 57);
        class634.field8770 = true;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(II)Z")
    public static final boolean method3045(int arg0, int arg1) {
        field7434++;
        if (arg0 == -13661) {
            return arg1 == 7 || arg1 == 9;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)V")
    public static void method3046(int arg0) {
        field7433 = null;
        int var1 = -89 / ((16 - arg0) / 43);
        field7437 = null;
    }
}
