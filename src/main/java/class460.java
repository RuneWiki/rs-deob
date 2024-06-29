import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eaa")
public class class460 {

    @OriginalMember(owner = "client!eaa", name = "h", descriptor = "[B")
    public static byte[] field6510 = new byte[2048];

    @OriginalMember(owner = "client!eaa", name = "f", descriptor = "Lfc;")
    public static class235 field6508 = new class235(7, 8);

    @OriginalMember(owner = "client!eaa", name = "k", descriptor = "Lfc;")
    public static class235 field6513 = new class235(30, -1);

    @OriginalMember(owner = "client!eaa", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field6515 = new String[200];

    @OriginalMember(owner = "client!eaa", name = "n", descriptor = "I")
    public static int field6516 = 0;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "I")
    public int field6503;

    @OriginalMember(owner = "client!eaa", name = "b", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!eaa", name = "c", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!eaa", name = "d", descriptor = "I")
    public int field6506;

    @OriginalMember(owner = "client!eaa", name = "e", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!eaa", name = "i", descriptor = "I")
    public int field6511;

    @OriginalMember(owner = "client!eaa", name = "j", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!eaa", name = "l", descriptor = "J")
    public static long field6514;

    @OriginalMember(owner = "client!eaa", name = "o", descriptor = "Lpj;")
    public static class132 field6517;

    @OriginalMember(owner = "client!eaa", name = "g", descriptor = "Z")
    public boolean field6509;

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(ILoa;B)Lmj;", line = 4)
    public static final class599 method2649(int arg0, class638 arg1, byte arg2) {
        field6504++;
        int var3 = -113 / ((5 - arg2) / 52);
        class158 var4 = class164.method1140(arg0, arg1, 0, true);
        return var4 == null ? null : var4.field2375;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(I)V", line = 20)
    public static void method2650(int arg0) {
        if (arg0 <= 103) {
            return;
        }
        field6517 = null;
        field6508 = null;
        field6513 = null;
        field6510 = null;
        field6515 = null;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 34)
    public static final int method2651(String arg0, byte arg1) {
        int var2 = -113 % ((arg1 + 21) / 52);
        field6505++;
        for (int var3 = 0; var3 < class414.field5862.length; var3++) {
            if (class414.field5862[var3].equalsIgnoreCase(arg0)) {
                return var3;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(IIIIIIIII)Z", line = 57)
    public static final boolean method2652(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg7 <= 122) {
            return true;
        }
        field6507++;
        if ((arg1 + arg6) > arg5 && arg6 < arg3 + arg5) {
            return arg8 < (arg0 + arg2) && arg2 < (arg4 + arg8);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eaa", name = "a", descriptor = "(II[J[Ljava/lang/Object;I)V", line = 86)
    public static final void method2653(int arg0, int arg1, long[] arg2, Object[] arg3, int arg4) {
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg0];
            arg2[arg0] = var7;
            Object var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if (arg2[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg2[arg0] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method2653(var6 - 1, arg1, arg2, arg3, 37);
            method2653(arg0, var6 + 1, arg2, arg3, 99);
        }
        if (arg4 < 24) {
            method2650(79);
        }
        field6512++;
    }
}
