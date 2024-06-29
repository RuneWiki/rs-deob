import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class593 {

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field8376 = 0;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field8373 = 0;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "Lad;")
    public static class19 field8375 = new class19(32);

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "Lwp;")
    public static class452 field8377 = null;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field8370;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field8372;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "I")
    public static int field8374;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method3334(int arg0) {
        if (arg0 != 127) {
            method3338(72, -36, null, 96, null);
        }
        field8377 = null;
        field8375 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)I")
    public static final int method3335(int arg0, int arg1, int arg2, int arg3) {
        field8372++;
        if (class156.field1743 == null) {
            return 0;
        }
        int var4 = arg3 >> 9;
        int var5 = arg0 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class142.field1574 - 1) || var5 > class140.field1550 - 1) {
            return 0;
        }
        if (arg2 != 27648) {
            method3337(7, 14, -24, -87);
        }
        int var6 = arg1;
        if (arg1 < 3 && (class16.field131[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return class156.field1743[var6].method1610(arg3, 120, arg0);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method3336(String arg0, byte arg1) {
        field8374++;
        if (arg1 >= -65) {
            method3335(1, 1, 73, -105);
        }
        for (int var2 = 0; var2 < class184.field2062.length; var2++) {
            if (class184.field2062[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(IIII)I")
    public static final int method3337(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 10991) {
            return 1;
        }
        field8370++;
        if (arg0 == arg2) {
            return arg2;
        }
        int var4 = 128 - arg1;
        int var5 = (arg0 & 0x7F) * arg1 + (arg2 & 0x7F) * var4 >> 7;
        int var6 = (arg2 & 0x380) * var4 + ((arg0 & 0x380) * arg1) >> 7;
        int var7 = (arg2 & 0xFC00) * var4 + ((arg0 & 0xFC00) * arg1) >> 7;
        return var7 & 0xFC00 | var6 & 0x380 | var5 & 0x7F;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II[II[J)V")
    public static final void method3338(int arg0, int arg1, int[] arg2, int arg3, long[] arg4) {
        if (arg0 <= 119) {
            method3336(null, (byte) 106);
        }
        field8371++;
        if (arg3 <= arg1) {
            return;
        }
        int var5 = (arg1 + arg3) / 2;
        int var6 = arg1;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg3];
        arg4[arg3] = var7;
        int var9 = arg2[var5];
        arg2[var5] = arg2[arg3];
        arg2[arg3] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg3; var11++) {
            if (arg4[var11] < ((long) (var10 & var11) + var7)) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                int var14 = arg2[var11];
                arg2[var11] = arg2[var6];
                arg2[var6++] = var14;
            }
        }
        arg4[arg3] = arg4[var6];
        arg4[var6] = var7;
        arg2[arg3] = arg2[var6];
        arg2[var6] = var9;
        method3338(124, arg1, arg2, var6 - 1, arg4);
        method3338(120, var6 + 1, arg2, arg3, arg4);
    }
}
