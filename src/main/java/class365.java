import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public abstract class class365 extends class47 {

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field5017;

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "Z")
    public static boolean field5013 = false;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "Lmo;")
    public static class336 field5015 = new class336(4);

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lch;")
    public static class151 field5018 = new class151("K", "T", "K", "K");

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field5020 = 20;

    @OriginalMember(owner = "client!rg", name = "M", descriptor = "[I")
    public static int[] field5022 = new int[500];

    @OriginalMember(owner = "client!rg", name = "N", descriptor = "[I")
    public static int[] field5023 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field5012;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public static int field5016;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public static int field5019;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "Lnl;")
    public static class435 field5021;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
    public static void method2239(int arg0) {
        field5018 = null;
        if (arg0 != -9999) {
            field5018 = null;
        }
        field5015 = null;
        field5023 = null;
        field5022 = null;
        field5021 = null;
    }

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method42(int arg0);

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)Z")
    public abstract boolean method39(int arg0);

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lra;IZZ)V")
    public static final void method2240(class249 arg0, int arg1, boolean arg2, boolean arg3) {
        field5016++;
        int var4 = arg0.field3593;
        int var5 = (int) arg0.field6382;
        arg0.method2714(-88);
        if (arg3) {
            class372.method2273(var4, 7);
        }
        class318.method2026(-1360172240, var4);
        class172 var6 = class361.method2217(var5, arg1 - 1060829710);
        if (var6 != null) {
            class184.method1314(var6, arg1 ^ 0x25DA);
        }
        class257.method1739(arg1 - 9565);
        if (!arg2 && class238.field3475 != -1) {
            class225.method1533(arg1 - 9646, 1, class238.field3475);
        }
        if (arg1 != 9662) {
            field5022 = null;
        }
        class428 var7 = new class428(class310.field4399);
        for (class249 var8 = (class249) var7.method2556(126); var8 != null; var8 = (class249) var7.method2559((byte) 125)) {
            if (!var8.method2715(-121)) {
                var8 = (class249) var7.method2556(-80);
                if (var8 == null) {
                    return;
                }
            }
            if (var8.field3591 == 3) {
                int var9 = (int) var8.field6382;
                if (var9 >>> 16 == var4) {
                    method2240(var8, 9662, arg2, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII)V")
    public static final void method2241(int arg0, int arg1, int arg2, int arg3) {
        field5014++;
        if (arg3 != 20) {
            method2239(107);
        }
        class372.field5120 = new byte[arg2][arg1][arg0];
    }

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "(I)V")
    public static final void method2242(int arg0) {
        field5012++;
        if (arg0 == 0) {
            class264.field3811.method2613((byte) 103);
            class26.field278 = null;
            class347.field4785 = 1;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(I)V")
    public class365(int arg0) {
        this.field5017 = arg0;
    }
}
