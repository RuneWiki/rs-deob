import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nda")
public abstract class class581 {

    @OriginalMember(owner = "client!nda", name = "f", descriptor = "Ljo;")
    public static class351 field8248 = new class351(61, 7);

    @OriginalMember(owner = "client!nda", name = "g", descriptor = "[J")
    public static long[] field8249 = new long[32];

    @OriginalMember(owner = "client!nda", name = "h", descriptor = "[Lts;")
    public static class559[] field8250 = new class559[2048];

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "I")
    public static int field8244;

    @OriginalMember(owner = "client!nda", name = "c", descriptor = "I")
    public static int field8245;

    @OriginalMember(owner = "client!nda", name = "d", descriptor = "I")
    public static int field8246;

    @OriginalMember(owner = "client!nda", name = "e", descriptor = "I")
    public static int field8247;

    @OriginalMember(owner = "client!nda", name = "i", descriptor = "J")
    public static long field8251;

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Luo;", line = 7)
    public static final class600 method3378(Throwable arg0, String arg1) {
        field8246++;
        class600 var2;
        if (arg0 instanceof class600) {
            var2 = (class600) arg0;
            var2.field8459 = var2.field8459 + ' ' + arg1;
        } else {
            var2 = new class600(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(B)V", line = 24)
    public static void method3379(byte arg0) {
        field8248 = null;
        field8250 = null;
        field8249 = null;
        if (arg0 <= 21) {
            method3378(null, null);
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIIIIIIII)V", line = 37)
    public static final void method3380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field8243++;
        if (class420.method2512((byte) 43, arg4)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = arg8;
            int var13 = 0;
            int var14 = 0;
            if (class607.field8578) {
                var14 = class502.field7180;
                var12 = class293.field4432;
                var11 = class432.field6152;
                var13 = class490.field6968;
                var10 = class396.field5621;
                class502.field7180 = 1;
            }
            if (class222.field3192[arg4] == null) {
                class235.method1621(arg7, class110.field1382[arg4], arg0 < 0, -1, arg3, 12, arg0, arg1, arg6, arg2, arg5);
            } else {
                class235.method1621(arg7, class222.field3192[arg4], arg0 < 0, -1, arg3, 12, arg0, arg1, arg6, arg2, arg5);
            }
            if (class607.field8578) {
                if (arg0 >= 0 && class502.field7180 == 2) {
                    class651.method3726(class432.field6152, 21, class490.field6968, class396.field5621, class293.field4432);
                }
                class293.field4432 = var12;
                class502.field7180 = var14;
                class490.field6968 = var13;
                class396.field5621 = var10;
                class432.field6152 = var11;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class397.field5653[var9] = true;
            }
        } else {
            class397.field5653[arg0] = true;
        }
    }

    @OriginalMember(owner = "client!nda", name = "b", descriptor = "(III)Z", line = 111)
    public static final boolean method3381(int arg0, int arg1, int arg2) {
        int var3 = 26 / ((35 - arg0) / 41);
        field8247++;
        return (class627.method3590(-127, arg2, arg1) | (arg1 & 0x2000) != 0 | class697.method3930(arg2, 0, arg1)) & class713.method4034(-7, arg2, arg1);
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(IIB)Z", line = 122)
    public static final boolean method3382(int arg0, int arg1, byte arg2) {
        field8245++;
        if (arg2 == 19) {
            return (arg1 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I)[B")
    public abstract byte[] method284(int arg0);

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(III)[B")
    public abstract byte[] method283(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!nda", name = "a", descriptor = "(I[B)V")
    public abstract void method285(int arg0, byte[] arg1);
}
