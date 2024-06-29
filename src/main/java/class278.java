import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class278 {

    @OriginalMember(owner = "client!al", name = "h", descriptor = "Z")
    public boolean field4914 = true;

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public int field4917;

    @OriginalMember(owner = "client!al", name = "m", descriptor = "I")
    public int field4919;

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public int field4910;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "I")
    public int field4909;

    @OriginalMember(owner = "client!al", name = "o", descriptor = "I")
    public int field4921;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "I")
    public int field4923;

    @OriginalMember(owner = "client!al", name = "i", descriptor = "I")
    public static int field4915 = 0;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "Lvf;")
    public static class265 field4907 = class87.method582(-46, "Chargement des fichiers config )2 ");

    @OriginalMember(owner = "client!al", name = "f", descriptor = "Lgk;")
    public static class6 field4912 = null;

    @OriginalMember(owner = "client!al", name = "j", descriptor = "Lvf;")
    public static class265 field4916 = class87.method582(-46, "rot:");

    @OriginalMember(owner = "client!al", name = "b", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!al", name = "g", descriptor = "Lmh;")
    public static class114 field4913;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIBZZZII)Loe;")
    public static final class108 method1898(int arg0, int arg1, byte arg2, boolean arg3, boolean arg4, boolean arg5, int arg6, int arg7) {
        if (arg2 != 36) {
            return null;
        }
        field4922++;
        class261 var8 = class54.method418(arg7, 0);
        if (arg6 > 1 && var8.field4566 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (arg6 >= var8.field4490[var10] && var8.field4490[var10] != 0) {
                    var9 = var8.field4566[var10];
                }
            }
            if (var9 != -1) {
                var8 = class54.method418(var9, 0);
            }
        }
        class185 var11 = var8.method1747(arg2 ^ 0x7A);
        if (var11 == null) {
            return null;
        }
        class88 var12 = null;
        if (var8.field4505 != -1) {
            var12 = (class88) method1898(1, 0, (byte) 36, true, false, true, 10, var8.field4568);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field4518 != -1) {
            var12 = (class88) method1898(arg0, arg1, (byte) 36, false, false, true, arg6, var8.field4509);
            if (var12 == null) {
                return null;
            }
        }
        int[] var13 = class35.field822;
        int var14 = class35.field824;
        int[] var15 = new int[4];
        int var16 = class35.field821;
        class35.method288(var15);
        class88 var17 = new class88(36, 32);
        class35.method281(var17.field1592, 36, 32);
        class247.method1639();
        class247.method1638(16, 16);
        int var18 = var8.field4526;
        class247.field4288 = false;
        if (arg3) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg0 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class247.field4298[var8.field4514] * var18 >> 16;
        int var20 = class247.field4289[var8.field4514] * var18 >> 16;
        var11.method1269(0, var8.field4511, var8.field4569, var8.field4514, var8.field4501, var20 - (var11.method141() / 2 - var8.field4549), var19 - -var8.field4549, -1L);
        if (arg0 >= 1) {
            var17.method606(1);
            if (arg0 >= 2) {
                var17.method606(16777215);
            }
            class35.method281(var17.field1592, 36, 32);
        }
        if (arg1 != 0) {
            var17.method584(arg1);
        }
        if (var8.field4505 != -1) {
            var12.method585(0, 0);
        } else if (var8.field4518 != -1) {
            class35.method281(var12.field1592, 36, 32);
            var17.method585(0, 0);
            var17 = var12;
        }
        if (arg4 && (var8.field4565 == 1 || arg6 != 1) && arg6 != -1) {
            class169.field3065.method763(class44.method368(true, arg6), 0, 9, 16776960, 1);
        }
        class35.method281(var13, var14, var16);
        class35.method298(var15);
        class247.method1639();
        class247.field4288 = true;
        return var17;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Z)V")
    public static void method1899(boolean arg0) {
        field4912 = null;
        field4913 = null;
        if (!arg0) {
            field4912 = null;
        }
        field4916 = null;
        field4907 = null;
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4917 = arg3;
        this.field4919 = arg0;
        this.field4914 = arg6;
        this.field4910 = arg4;
        this.field4909 = arg1;
        this.field4921 = arg5;
        this.field4923 = arg2;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Lgk;BI)I")
    public static final int method1900(class6 arg0, byte arg1, int arg2) {
        field4918++;
        int var3 = 25 / ((-arg1 - 61) / 43);
        if (!class236.method1577(110, arg2, client.method1474(arg0)) && arg0.field166 == null) {
            return -1;
        } else if (arg0.field145 == null || arg0.field145.length <= arg2) {
            return -1;
        } else {
            return arg0.field145[arg2];
        }
    }
}
