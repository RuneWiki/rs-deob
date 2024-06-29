import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vha")
public class class71 {

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "I")
    public int field962;

    @OriginalMember(owner = "client!vha", name = "c", descriptor = "Lrn;")
    public static class633 field963 = new class633(50, 2);

    @OriginalMember(owner = "client!vha", name = "d", descriptor = "Luw;")
    public static class208 field964 = new class208(29, 4);

    @OriginalMember(owner = "client!vha", name = "i", descriptor = "Ljava/lang/String;")
    public static String field969 = null;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "I")
    public static int field961;

    @OriginalMember(owner = "client!vha", name = "e", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!vha", name = "f", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!vha", name = "g", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!vha", name = "h", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!vha", name = "j", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(II[II[I)V")
    public static final void method423(int arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field970++;
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            int var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            int var9 = var7 == Integer.MAX_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg3; var10++) {
                if ((var10 & var9) + var7 > arg4[var10]) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    int var12 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6++] = var12;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method423(29708, arg1, arg2, var6 - 1, arg4);
            method423(arg0, var6 + 1, arg2, arg3, arg4);
        }
        if (arg0 != 29708) {
            field968 = 72;
        }
    }

    @OriginalMember(owner = "client!vha", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field965++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(B)I")
    public final int method424(byte arg0) {
        int var2 = -69 % ((arg0 - 58) / 53);
        field966++;
        return this.field962;
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "([BIII)I")
    public static final int method425(byte[] arg0, int arg1, int arg2, int arg3) {
        field961++;
        int var4 = -1;
        int var5 = arg3;
        if (arg1 != 2) {
            field964 = null;
        }
        while (var5 < arg2) {
            var4 = class406.field5385[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
            var5++;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!vha", name = "b", descriptor = "(B)V")
    public static void method426(byte arg0) {
        field969 = null;
        field963 = null;
        field964 = null;
        if (arg0 >= -109) {
            method425(null, 24, 57, -105);
        }
    }

    @OriginalMember(owner = "client!vha", name = "a", descriptor = "(Lfda;I)V")
    public static final void method427(class381 arg0, int arg1) {
        field967++;
        int var2 = arg0.field4675 - class693.field8900;
        int var3 = arg0.field4736 * 512 + arg0.method190((byte) 68) * 256;
        int var4 = arg0.field4745 * 512 + arg0.method190((byte) -107) * 256;
        arg0.field4759 = 0;
        arg0.field2900 += (var4 - arg0.field2900) / var2;
        arg0.field2896 += (var3 - arg0.field2896) / var2;
        if (arg0.field4693 == 0) {
            arg0.method2171(8192, false);
        }
        if (arg0.field4693 == 1) {
            arg0.method2171(12288, false);
        }
        if (arg0.field4693 == arg1) {
            arg0.method2171(0, false);
        }
        if (arg0.field4693 == 3) {
            arg0.method2171(4096, false);
        }
    }

    @OriginalMember(owner = "client!vha", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class71(String arg0, int arg1) {
        this.field962 = arg1;
    }
}
