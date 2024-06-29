import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class131 {

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field2099 = -1;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "Ldv;")
    public static class566 field2102 = new class566(23, 3);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)I")
    public static final int method890(byte arg0, int arg1, int arg2) {
        field2098++;
        if (arg2 == 4 || arg2 == 5) {
            return class3.field45[arg1 & 0x3];
        } else {
            if (arg0 <= 5) {
                method893((byte) 47);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!vf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2097++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([SII)[S")
    public static final short[] method891(short[] arg0, int arg1, int arg2) {
        field2101++;
        if (arg2 != -13032) {
            field2102 = null;
        }
        short[] var3 = new short[arg1];
        class416.method2501(arg0, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BIII[BI)V")
    public static final void method892(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field2100++;
        if (arg1 >= arg2) {
            return;
        }
        int var6 = arg1 + arg5;
        int var7 = -51 % ((arg0 + 23) / 52);
        int var8 = arg2 - arg1 >> 2;
        while (true) {
            var8--;
            if (var8 < 0) {
                int var9 = arg2 - arg1 & 0x3;
                while (true) {
                    var9--;
                    if (var9 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method893(byte arg0) {
        field2102 = null;
        if (arg0 != -61) {
            field2099 = 84;
        }
    }
}
