import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class127 extends class350 {

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field1885 = -1;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
    public static boolean field1891 = true;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "Lmg;")
    public static class101 field1888;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V", line = 4)
    public static void method880(int arg0) {
        if (arg0 == -1) {
            field1888 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;IILdr;)Leb;", line = 14)
    public static final class439 method881(int arg0, Component arg1, int arg2, int arg3, class504 arg4) {
        field1886++;
        if (arg2 < 114) {
            return null;
        } else if (class188.field2724 == 0) {
            throw new IllegalStateException();
        } else if (arg0 >= 0 && arg0 < 2) {
            if (arg3 < 256) {
                arg3 = 256;
            }
            try {
                class439 var5 = (class439) Class.forName("aw").getDeclaredConstructor().newInstance();
                var5.field6486 = new int[(class295.field4060 ? 2 : 1) * 256];
                var5.field6496 = arg3;
                var5.method464(arg1);
                var5.field6499 = (arg3 & 0xFFFFFC00) + 1024;
                if (var5.field6499 > 16384) {
                    var5.field6499 = 16384;
                }
                var5.method461(var5.field6499);
                if (class512.field7596 > 0 && class143.field2051 == null) {
                    class143.field2051 = new class275();
                    class143.field2051.field3770 = arg4;
                    arg4.method2971(class143.field2051, class512.field7596, 0);
                }
                if (class143.field2051 != null) {
                    if (class143.field2051.field3775[arg0] != null) {
                        throw new IllegalArgumentException();
                    }
                    class143.field2051.field3775[arg0] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class198 var6 = new class198(arg4, arg0);
                    var6.field6496 = arg3;
                    var6.field6486 = new int[(class295.field4060 ? 2 : 1) * 256];
                    var6.method464(arg1);
                    var6.field6499 = 16384;
                    var6.method461(var6.field6499);
                    if (class512.field7596 > 0 && class143.field2051 == null) {
                        class143.field2051 = new class275();
                        class143.field2051.field3770 = arg4;
                        arg4.method2971(class143.field2051, class512.field7596, 0);
                    }
                    if (class143.field2051 != null) {
                        if (class143.field2051.field3775[arg0] != null) {
                            throw new IllegalArgumentException();
                        }
                        class143.field2051.field3775[arg0] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class439();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[I[IZ)V", line = 101)
    public static final void method882(int arg0, int arg1, int[] arg2, int[] arg3, boolean arg4) {
        if (arg1 < arg0) {
            int var5 = (arg1 + arg0) / 2;
            int var6 = arg1;
            int var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if (arg3[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg3[arg0] = arg3[var6];
            arg3[var6] = var7;
            arg2[arg0] = arg2[var6];
            arg2[var6] = var8;
            method882(var6 - 1, arg1, arg2, arg3, true);
            method882(arg0, var6 + 1, arg2, arg3, true);
        }
        if (arg4) {
            field1889++;
        }
    }
}
