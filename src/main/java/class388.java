import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class388 {

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field5740 = 0;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "[I")
    public static int[] field5743 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field5744 = 0;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "Z")
    public static boolean field5741 = false;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field5738;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field5739;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field5745;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field5742;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 4)
    public static void method2388(byte arg0) {
        if (arg0 == 54) {
            field5743 = null;
            field5742 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(CI)Z", line = 17)
    public static final boolean method2389(char arg0, int arg1) {
        field5739++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (arg1 <= 116) {
                field5741 = true;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)Z", line = 42)
    public static final boolean method2390(byte arg0) {
        field5738++;
        if (class372.field5534 == 0) {
            int var1 = -48 % ((arg0 + 48) / 34);
            return class77.field1041.method2804((byte) -105);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIBI)V", line = 66)
    public static final void method2391(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (class471.field6963 <= arg0 && arg0 <= class401.field5947) {
            int var5 = class332.method2034(class126.field1842, -24309, arg1, class72.field992);
            int var6 = class332.method2034(class126.field1842, -24309, arg4, class72.field992);
            class58.method530(var6, arg0, arg2, var5, 10);
        }
        field5745++;
        if (arg3 < 27) {
            method2389((char) 65461, -126);
        }
    }

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(I)V")
    public abstract void method29(int arg0);

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Lya;I)V")
    public abstract void method35(class38 arg0, int arg1);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILfi;BZLya;I)V")
    public abstract void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6);

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)Z")
    public abstract boolean method32(byte arg0);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(Lya;I)Lfk;")
    public abstract class462 method38(class38 arg0, int arg1);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IILya;I)Z")
    public abstract boolean method34(int arg0, int arg1, class38 arg2, int arg3);
}
