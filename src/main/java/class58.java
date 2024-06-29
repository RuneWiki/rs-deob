import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class58 {

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "I")
    public static int field886 = -50;

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "[I")
    public static int[] field889 = new int[16384];

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "[I")
    public static int[] field891 = new int[16384];

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "[I")
    public static int[] field892;

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "I")
    public static int field888;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "[Lo;")
    public static class363[] field893;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field891[var2] = (int) (Math.sin((double) var2 * var0) * 32768.0D);
            field889[var2] = (int) (Math.cos((double) var2 * var0) * 32768.0D);
        }
        field892 = new int[13];
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V", line = 7)
    public static void method377(int arg0) {
        field893 = null;
        field892 = null;
        field889 = null;
        field891 = null;
        if (arg0 > -81) {
            field891 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZILjava/util/Random;)I", line = 20)
    public static final int method378(boolean arg0, int arg1, Random arg2) {
        field888++;
        if (arg0) {
            field891 = null;
        }
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class380.method2416(-1, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class184.method1285(var4, (byte) 66, arg1);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)V", line = 50)
    public static final void method379(byte arg0, int arg1, int arg2) {
        field890++;
        if (arg0 <= -86) {
            class188 var3 = class10.method48((byte) 98, 13, arg1);
            var3.method1308(false);
            var3.field2873 = arg2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;I)V", line = 73)
    public static final void method380(String arg0, String arg1, int arg2, int arg3, String arg4, int arg5) {
        class167.method1191(63, arg0, arg3, null, arg1, arg4, -1, arg2);
        if (arg5 > 57) {
            field887++;
        }
    }
}
