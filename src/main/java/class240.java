import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class240 extends class205 {

    @OriginalMember(owner = "client!jc", name = "Q", descriptor = "Ljava/lang/Object;")
    private Object field3888;

    @OriginalMember(owner = "client!jc", name = "O", descriptor = "I")
    public static int field3886 = 0;

    @OriginalMember(owner = "client!jc", name = "P", descriptor = "Lvj;")
    public static class115 field3887 = new class115();

    @OriginalMember(owner = "client!jc", name = "U", descriptor = "Z")
    public static boolean field3892 = false;

    @OriginalMember(owner = "client!jc", name = "M", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!jc", name = "R", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!jc", name = "S", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!jc", name = "T", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!jc", name = "V", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)Z")
    public final boolean method1415(boolean arg0) {
        field3890++;
        if (!arg0) {
            this.method1416((byte) -83);
        }
        return false;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIILik;Lik;IIJ)V")
    public static final void method1658(int arg0, int arg1, int arg2, int arg3, class260 arg4, class260 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class229 var10 = new class229();
        var10.field3779 = arg8;
        var10.field3788 = arg1 * 128 + 64;
        var10.field3774 = arg2 * 128 + 64;
        var10.field3781 = arg3;
        var10.field3775 = arg4;
        var10.field3784 = arg5;
        var10.field3772 = arg6;
        var10.field3778 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class288.field4563[var11][arg1][arg2] == null) {
                class288.field4563[var11][arg1][arg2] = new class134(var11, arg1, arg2);
            }
        }
        class288.field4563[arg0][arg1][arg2].field2133 = var10;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1416(byte arg0) {
        field3889++;
        int var2 = -24 % ((arg0 + 44) / 50);
        return this.field3888;
    }

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "(B)V")
    public static void method1659(byte arg0) {
        field3887 = null;
        if (arg0 != 62) {
            field3887 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class240(Object arg0) {
        this.field3888 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIZ)I")
    public static final int method1660(int arg0, int arg1, boolean arg2) {
        field3893++;
        if (!arg2) {
            method1659((byte) -114);
        }
        int var3 = arg1 - 1 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIII)Lwa;")
    public static final class258 method1661(int arg0, int arg1, int arg2, int arg3) {
        field3884++;
        class258 var4 = new class258();
        var4.field4100 = arg3;
        var4.field4109 = arg2;
        class128.field2062.method1399(7292, var4, (long) arg0);
        if (arg1 < 115) {
            field3885 = 90;
        }
        class136.method956(arg3, -122);
        class36 var5 = class64.method455(arg0, 592427152);
        if (var5 != null) {
            class280.method1886(var5, 32);
        }
        if (class207.field3333 != null) {
            class280.method1886(class207.field3333, 32);
            class207.field3333 = null;
        }
        int var6 = class205.field3291;
        for (int var7 = 0; var7 < var6; var7++) {
            if (class244.method1679(31, class279.field4427[var7])) {
                class56.method419(127, var7);
            }
        }
        if (class205.field3291 == 1) {
            class199.field3181 = false;
            class154.method1072(class23.field386, class145.field2322, class68.field1134, class279.field4404, (byte) 37);
        } else {
            class154.method1072(class23.field386, class145.field2322, class68.field1134, class279.field4404, (byte) -102);
            int var8 = class262.field4165.method1822(class47.field849);
            for (int var9 = 0; var9 < class205.field3291; var9++) {
                int var10 = class262.field4165.method1822(class141.method978(-127, var9));
                if (var10 > var8) {
                    var8 = var10;
                }
            }
            class68.field1134 = var8 + 8;
            class145.field2322 = (field3892 ? 26 : 22) + class205.field3291 * 15;
        }
        if (var5 != null) {
            class195.method1330(var5, -1104623792, false);
        }
        class183.method1242(arg3, 0);
        if (class157.field2548 != -1) {
            class241.method1665(1, class157.field2548, 0);
        }
        return var4;
    }
}
