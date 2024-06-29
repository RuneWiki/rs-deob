import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class203 extends class12 {

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field3630 = 0;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "Z")
    public static boolean field3632 = false;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lvf;")
    public static class265 field3629 = class87.method582(-46, "Kampfstufe: ");

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field3634 = 0;

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "Lvf;")
    public static class265 field3637 = class87.method582(-46, "Abbrechen");

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "I")
    public static int field3636;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public static int field3638;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field3641;

    @OriginalMember(owner = "client!fj", name = "B", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!fj", name = "C", descriptor = "I")
    public static int field3643;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(I)V")
    public static void method1392(int arg0) {
        field3637 = null;
        if (arg0 == 0) {
            field3629 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)V")
    public static final void method1393(byte arg0) {
        int var1 = -126 % ((arg0 + 41) / 47);
        for (int var2 = 0; var2 < class183.field3279; var2++) {
            class189 var3 = class238.method1589(-8318, var2);
            if (var3 != null && var3.field3402 == 0) {
                class182.field3228[var2] = 0;
                class256.field4385[var2] = 0;
            }
        }
        field3635++;
        class150.field2779 = new class269(16);
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "([IIIII)V")
    public static final void method1394(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg1--;
        field3638++;
        int var8 = arg2 - 1;
        int var5 = var8 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg4;
            int var7 = var6 + 1;
            arg0[var7] = arg4;
            int var9 = var7 + 1;
            arg0[var9] = arg4;
            int var10 = var9 + 1;
            arg0[var10] = arg4;
            int var11 = var10 + 1;
            arg0[var11] = arg4;
            int var12 = var11 + 1;
            arg0[var12] = arg4;
            int var13 = var12 + 1;
            arg0[var13] = arg4;
            arg1 = var13 + 1;
            arg0[arg1] = arg4;
        }
        if (arg3 == -7249) {
            while (arg1 < var8) {
                arg1++;
                arg0[arg1] = arg4;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)I")
    public static int method1395(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IB)Lfk;")
    public static final class36 method1396(int arg0, byte arg1) {
        field3639++;
        class36 var2 = (class36) class12.field392.method1424((long) arg0, (byte) 98);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class211.field3797.method1332(true, class144.method995(arg0, 89), class113.method744((byte) -94, arg0));
        class36 var4 = new class36();
        if (var3 != null) {
            var4.method305(new class135(var3), 2);
        }
        if (arg1 <= 78) {
            field3633 = 53;
        }
        class12.field392.method1419(0, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "()V")
    public class203() {
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(I)V")
    public class203(int arg0) {
        this.field3640 = arg0;
    }
}
