import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class296 {

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "Lko;")
    public static class347 field4205 = new class347("LIVE", 0);

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public static int field4207 = 0;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "Lrn;")
    public static class174 field4208 = new class174(31, 8);

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field4203;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!gr", name = "g", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "([SI[Ljava/lang/String;IB)V", line = 9)
    public static final void method1879(short[] arg0, int arg1, String[] arg2, int arg3, byte arg4) {
        if (arg1 < arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg1;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var8;
            for (int var9 = arg1; var9 < arg3; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg3] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg3] = arg0[var6];
            arg0[var6] = var8;
            method1879(arg0, arg1, arg2, var6 - 1, (byte) 32);
            method1879(arg0, var6 + 1, arg2, arg3, (byte) 106);
        }
        if (arg4 <= 26) {
            field4207 = 74;
        }
        field4203++;
    }

    @OriginalMember(owner = "client!gr", name = "toString", descriptor = "()Ljava/lang/String;", line = 64)
    public final String toString() {
        field4206++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V", line = 75)
    public static void method1880(int arg0) {
        field4208 = null;
        if (arg0 >= 33) {
            field4205 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(II)V", line = 94)
    public class296(int arg0, int arg1) {
    }
}
