import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class141 {

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "Lfba;")
    public static class348 field1924 = new class348(10);

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!cga", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1926++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIB)I")
    public final int method995(int arg0, int arg1, byte arg2) {
        if (arg2 <= 39) {
            method996(116);
        }
        field1922++;
        int var4 = class565.field8187 <= arg1 ? arg1 : class565.field8187;
        if (class22.field208 == this) {
            return 0;
        } else if (class209.field3154 == this) {
            return var4 - arg0;
        } else if (class118.field1624 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static void method996(int arg0) {
        field1924 = null;
        if (arg0 != 1) {
            field1924 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILcs;)V")
    public static final void method997(int arg0, class335 arg1) {
        field1925++;
        int var2 = arg1.field4628 - class703.field9918;
        if (arg0 != -24023) {
            field1924 = null;
        }
        int var3 = arg1.field4582 * 512 + arg1.method2053(true) * 256;
        int var4 = arg1.field4559 * 512 + (arg1.method2053(true) * 256);
        arg1.field4643 = 0;
        arg1.field3923 += (var3 - arg1.field3923) / var2;
        arg1.field3916 += (var4 - arg1.field3916) / var2;
        if (arg1.field4590 == 0) {
            arg1.method2059(8192, false);
        }
        if (arg1.field4590 == 1) {
            arg1.method2059(12288, false);
        }
        if (arg1.field4590 == 2) {
            arg1.method2059(0, false);
        }
        if (arg1.field4590 == 3) {
            arg1.method2059(4096, false);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IIII)Z")
    public static final boolean method998(int arg0, int arg1, int arg2, int arg3) {
        field1923++;
        if (!class522.field7591 || !class511.field7403) {
            return false;
        } else if (class163.field2324 < 100) {
            return false;
        } else {
            int var4 = class694.field9823[arg3][arg0][arg2];
            if (-class119.field1636 == var4) {
                return false;
            } else if (class119.field1636 == var4) {
                return true;
            } else if (class95.field1372 == class25.field221) {
                return false;
            } else {
                int var5 = 117 / ((arg1 - 22) / 59);
                int var6 = arg0 << class639.field9095;
                int var7 = arg2 << class639.field9095;
                if (class403.method2446(var6 + 1, class95.field1372[arg3].method2087(59, arg0, arg2 + 1), var6 + class150.field2190 - 1, class150.field2190 + var7 + -1, 30, var7 + class150.field2190 - 1, class95.field1372[arg3].method2087(126, arg0, arg2), var7 + 1, class95.field1372[arg3].method2087(81, arg0 + 1, arg2 - -1), var6 + 1) && class403.method2446(class150.field2190 + var6 - 1, class95.field1372[arg3].method2087(108, arg0 + 1, arg2 + 1), class150.field2190 + var6 - 1, var7 - 1 + class150.field2190, 22, var7 + 1, class95.field1372[arg3].method2087(54, arg0, arg2), var7 + 1, class95.field1372[arg3].method2087(104, arg0 + 1, arg2), var6 + 1)) {
                    class661.field9448++;
                    class694.field9823[arg3][arg0][arg2] = class119.field1636;
                    return true;
                } else {
                    class694.field9823[arg3][arg0][arg2] = -class119.field1636;
                    return false;
                }
            }
        }
    }
}
