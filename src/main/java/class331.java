import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class331 {

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "Lsaa;")
    public static class331 field4717 = new class331();

    @OriginalMember(owner = "client!saa", name = "e", descriptor = "Lsaa;")
    public static class331 field4720 = new class331();

    @OriginalMember(owner = "client!saa", name = "f", descriptor = "Lsaa;")
    public static class331 field4721 = new class331();

    @OriginalMember(owner = "client!saa", name = "g", descriptor = "Lsaa;")
    public static class331 field4722 = new class331();

    @OriginalMember(owner = "client!saa", name = "h", descriptor = "[C")
    private static char[] field4723 = new char[64];

    @OriginalMember(owner = "client!saa", name = "i", descriptor = "Ldia;")
    public static class235 field4724;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "I")
    public static int field4716;

    @OriginalMember(owner = "client!saa", name = "c", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!saa", name = "d", descriptor = "I")
    public static int field4719;

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(Lee;I)Lta;")
    public static final class214 method1997(class677 arg0, int arg1) {
        field4718++;
        int var2 = 50 / ((arg1 + 88) / 32);
        return new class214(arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3771((byte) -10), arg0.method3833(255), arg0.method3821((byte) 72));
    }

    @OriginalMember(owner = "client!saa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4719++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(B)V")
    public static void method1998(byte arg0) {
        field4717 = null;
        field4720 = null;
        field4723 = null;
        field4724 = null;
        if (arg0 == 4) {
            field4722 = null;
            field4721 = null;
        }
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "([JII[II)V")
    public static final void method1999(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field4716++;
        if (arg2 != -25186) {
            method1997(null, -61);
        }
        if (arg1 <= arg4) {
            return;
        }
        int var5 = (arg1 + arg4) / 2;
        int var6 = arg4;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg4; var11 < arg1; var11++) {
            if (arg0[var11] < (long) (var11 & var10) + var7) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var9;
        method1999(arg0, var6 - 1, -25186, arg3, arg4);
        method1999(arg0, arg1, -25186, arg3, var6 + 1);
    }

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field4723[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field4723[var1] = (char) (var1 + 97 - 26);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field4723[var2] = (char) (var2 + 48 - 52);
        }
        field4723[63] = '-';
        field4723[62] = '*';
        field4724 = new class235("", 13);
    }
}
