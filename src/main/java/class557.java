import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class557 extends InputStream {

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[[B")
    public static byte[][] field7806 = new byte[50][];

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
    public static int[] field7804 = new int[500];

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "Lmq;")
    public static class78 field7807 = new class78(80, -1);

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "Lfq;")
    public static class141 field7808 = new class141(9, 0, 4, 1);

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "I")
    public static int field7803;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field7805;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field7809;

    @OriginalMember(owner = "client!pt", name = "read", descriptor = "()I")
    public final int read() {
        class517.method2965(30000L, -120);
        field7803++;
        return -1;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method3160(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (arg5) {
            method3160(45, -78, 23, 96, 122, false, -5, 43);
        }
        field7805++;
        if (arg3 < 0 || arg1 < 0 || class613.field8591 - 1 <= arg3 || arg1 >= (class1.field3 - 1)) {
            return;
        }
        if (class495.field7002 == null) {
            return;
        }
        if (arg2 == 0) {
            class559 var8 = (class559) class548.method3123(arg6, arg3, arg1);
            class559 var9 = (class559) class237.method1484(arg6, arg3, arg1);
            if (var8 != null && arg7 != 2) {
                if (var8 instanceof class604) {
                    ((class604) var8).field8388.method4119(arg4, (byte) 67);
                } else {
                    class272.method1636(arg0, arg7, arg1, arg3, arg4, false, arg2, arg6, var8.method735(24123));
                }
            }
            if (var9 != null) {
                if (var9 instanceof class604) {
                    ((class604) var9).field8388.method4119(arg4, (byte) 57);
                    return;
                }
                class272.method1636(arg0, arg7, arg1, arg3, arg4, arg5, arg2, arg6, var9.method735(24123));
                return;
            }
            return;
        }
        if (arg2 != 1) {
            if (arg2 == 2) {
                class559 var10 = (class559) class730.method4079(arg6, arg3, arg1, field7809 == null ? (field7809 = method3162("op")) : field7809);
                if (var10 != null) {
                    if (arg7 == 11) {
                        arg7 = 10;
                    }
                    if (var10 instanceof class107) {
                        ((class107) var10).field1313.method4119(arg4, (byte) 24);
                        return;
                    }
                    class272.method1636(arg0, arg7, arg1, arg3, arg4, false, arg2, arg6, var10.method735(24123));
                    return;
                }
            } else if (arg2 == 3) {
                class559 var11 = (class559) class315.method1848(arg6, arg3, arg1);
                if (var11 == null) {
                    return;
                }
                if (!(var11 instanceof class223)) {
                    class272.method1636(arg0, arg7, arg1, arg3, arg4, false, arg2, arg6, var11.method735(24123));
                    return;
                }
                ((class223) var11).field2929.method4119(arg4, (byte) 17);
            } else {
                return;
            }
            return;
        }
        class559 var12 = (class559) class457.method2676(arg6, arg3, arg1);
        if (var12 == null) {
            return;
        }
        if (var12 instanceof class135) {
            ((class135) var12).field1601.method4119(arg4, (byte) 40);
            return;
        }
        int var13 = var12.method735(24123);
        if (arg7 == 4 || arg7 == 5) {
            class272.method1636(arg0, 4, arg1, arg3, arg4, false, arg2, arg6, var13);
        } else if (arg7 == 6) {
            class272.method1636(arg0 + 4, 4, arg1, arg3, arg4, false, arg2, arg6, var13);
            return;
        } else if (arg7 == 7) {
            class272.method1636((arg0 + 2 & 0x3) + 4, 4, arg1, arg3, arg4, false, arg2, arg6, var13);
            return;
        } else if (arg7 == 8) {
            class272.method1636(arg0 + 4, 4, arg1, arg3, arg4, false, arg2, arg6, var13);
            class272.method1636((arg0 + 2 & 0x3) + 4, 4, arg1, arg3, arg4, false, arg2, arg6, var13);
            return;
        }
        return;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Z)V")
    public static void method3161(boolean arg0) {
        if (arg0) {
            field7806 = null;
        }
        field7808 = null;
        field7807 = null;
        field7804 = null;
        field7806 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3162(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
