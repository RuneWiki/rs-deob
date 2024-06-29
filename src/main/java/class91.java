import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class class91 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "[I")
    public static int[] field1175 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field1179 = 0;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "[Lj;")
    public static class321[] field1173;

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "(I)V", line = 4)
    public static void method534(int arg0) {
        if (arg0 == 1) {
            field1173 = null;
            field1175 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ltj;I)V", line = 25)
    public static final void method538(class108 arg0, int arg1) {
        field1174++;
        class92.field1186 = arg0;
        if (arg1 != 1) {
            method534(9);
        }
    }

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "(I)Z", line = 41)
    public final boolean method540(int arg0) {
        if (arg0 != 4) {
            this.method535(104);
        }
        field1176++;
        return this.method537(-96) || this.method542(7) || this.method546(2);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIBZ)Lks;", line = 52)
    public static final class253 method541(int arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field1177++;
        class253 var5 = new class253();
        var5.field3746 = arg1;
        var5.field3748 = arg2;
        class318.field4662.method1376(var5, (long) arg0, 94);
        if (arg3 != 7) {
            return null;
        }
        class445.method2776((byte) 126, arg1);
        class223 var6 = class438.method2732(arg0, 0);
        if (var6 != null) {
            class245.method1701(var6, (byte) -94);
        }
        if (class85.field1096 != null) {
            class245.method1701(class85.field1096, (byte) -94);
            class85.field1096 = null;
        }
        class323.method2140(115);
        if (var6 != null) {
            class380.method2420(var6, !arg4, 0);
        }
        if (!arg4) {
            class424.method2657(arg1);
        }
        if (!arg4 && class265.field3898 != -1) {
            class23.method122(1, -27431, class265.field3898);
        }
        return var5;
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIII)Z", line = 99)
    public static final boolean method544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class309.field4490[arg0][var8][var14] == -class239.field3528) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class439.field6280[arg0].method359(arg1, arg3) + arg5;
            if (!class239.method1627(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class239.method1627(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class239.method1627(var9, var11, var13)) {
                return false;
            } else if (class239.method1627(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class254.method1764(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class239.method1627(var6 + 1, class439.field6280[arg0].method359(arg1, arg3) + arg5, var7 + 1) && class239.method1627(var6 + 128 - 1, class439.field6280[arg0].method359(arg1 + 1, arg3) + arg5, var7 + 1) && class239.method1627(var6 + 128 - 1, class439.field6280[arg0].method359(arg1 + 1, arg3 + 1) + arg5, var7 + 128 - 1) && class239.method1627(var6 + 1, class439.field6280[arg0].method359(arg1, arg3 + 1) + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IIIIIII)V", line = 161)
    public static final void method545(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class408.field5789 <= arg4 - arg5 && (arg4 + arg5) <= class231.field3415 && class245.field3659 <= arg3 - arg5 && (arg3 + arg5) <= class240.field3547) {
            class85.method501(arg3, arg0, arg4, arg6, arg1, 0, arg5);
        } else {
            class384.method2440(arg3, -17, arg6, arg1, arg0, arg5, arg4);
        }
        field1178++;
        if (arg2 != 2) {
            field1175 = null;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V")
    public abstract void method533(int arg0);

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)V")
    public abstract void method535(int arg0);

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "(I)I")
    public abstract int method536(int arg0);

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)Z")
    public abstract boolean method537(int arg0);

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "(I)Lmh;")
    public abstract class378 method539(int arg0);

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "(I)Z")
    public abstract boolean method542(int arg0);

    @OriginalMember(owner = "client!uq", name = "i", descriptor = "(I)I")
    public abstract int method543(int arg0);

    @OriginalMember(owner = "client!uq", name = "j", descriptor = "(I)Z")
    public abstract boolean method546(int arg0);
}
