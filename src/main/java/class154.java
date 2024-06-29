import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!faa")
public class class154 {

    @OriginalMember(owner = "client!faa", name = "l", descriptor = "I")
    public static int field1701 = -1;

    @OriginalMember(owner = "client!faa", name = "d", descriptor = "Lbq;")
    public static class289 field1693 = new class289();

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!faa", name = "b", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!faa", name = "e", descriptor = "I")
    public int field1694;

    @OriginalMember(owner = "client!faa", name = "f", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!faa", name = "g", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!faa", name = "h", descriptor = "I")
    public int field1697;

    @OriginalMember(owner = "client!faa", name = "i", descriptor = "I")
    public int field1698;

    @OriginalMember(owner = "client!faa", name = "j", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!faa", name = "k", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!faa", name = "c", descriptor = "Loh;")
    public static class404 field1692;

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(ZII)I")
    public static final int method942(boolean arg0, int arg1, int arg2) {
        field1691++;
        if (arg0) {
            return 0;
        }
        class755 var3 = class149.method926(arg2 ^ Integer.MIN_VALUE, arg0, arg1);
        if (var3 == null) {
            return class740.field10336.method2876((byte) -54, arg1).field2204;
        }
        int var4 = arg2;
        for (int var5 = 0; var5 < var3.field10531.length; var5++) {
            if (var3.field10531[var5] == -1) {
                var4++;
            }
        }
        return var4 + (class740.field10336.method2876((byte) -54, arg1).field2204 - var3.field10531.length);
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
    public static void method943(int arg0) {
        int var1 = -25 % ((arg0 + 42) / 57);
        field1692 = null;
        field1693 = null;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
    public static final void method944(boolean arg0) {
        field1695++;
        int var1 = class654.field9334.field9834.method549(-127);
        if (var1 == 0) {
            class637.field9155 = null;
            class745.method4145(false, 0);
        } else if (var1 == 1) {
            class603.method3423((byte) 0, -24);
            class745.method4145(false, 512);
            if (class100.field1043 != null) {
                class467.method2831(-127);
            }
        } else {
            class603.method3423((byte) (class188.field2231 - 4 & 0xFF), -45);
            class745.method4145(false, 2);
        }
        if (!arg0) {
            field1693 = null;
        }
        class552.field7920 = class122.field1278;
    }

    @OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIIIII)V")
    public static final void method945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1696++;
        if (arg2 != 0) {
            method943(30);
        }
        if (arg3 >= class338.field4355 && arg5 <= class744.field10385 && class224.field2571 <= arg4 && class578.field8182 >= arg0) {
            class59.method444(arg1, arg4, 32, arg3, arg0, arg5);
        } else {
            class392.method2408(arg2 ^ 0x2, arg5, arg0, arg3, arg4, arg1);
        }
    }
}
