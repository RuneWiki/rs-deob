import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ga")
public class ByteArrayCopier {

    @OriginalMember(owner = "mapview!sa", name = "b", descriptor = "Z")
    public static boolean directBuffersUnsupported;

    @OriginalMember(owner = "mapview!ga", name = "a", descriptor = "([BI[BII)V", line = 4)
    public static final void copy(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg0 == arg2) {
            if (arg1 == arg3) {
                return;
            }
            if (arg3 > arg1 && arg3 < arg1 + arg4) {
                int var9 = arg4 - 1;
                int var5 = arg1 + var9;
                int var6 = arg3 + var9;
                int var7 = var5 - var9;
                int var10 = var7 + 7;
                while (var5 >= var10) {
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                    arg2[var6--] = arg0[var5--];
                }
                var7 = var10 - 7;
                while (var5 >= var7) {
                    arg2[var6--] = arg0[var5--];
                }
                return;
            }
        }
        int var8 = arg1 + arg4;
        int var11 = var8 - 7;
        while (arg1 < var11) {
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
            arg2[arg3++] = arg0[arg1++];
        }
        var8 = var11 + 7;
        while (arg1 < var8) {
            arg2[arg3++] = arg0[arg1++];
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Z[BZ)Ljava/lang/Object;", line = 31)
    public static final Object wrap(boolean arg0, byte[] arg1, boolean arg2) {
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !directBuffersUnsupported) {
            try {
                ByteArray var3 = (ByteArray) Class.forName("da").getDeclaredConstructor().newInstance();
                var3.set(arg1, (byte) -71);
                return var3;
            } catch (Throwable var5) {
                directBuffersUnsupported = true;
            }
        }
        if (arg2) {
            return (Object) null;
        } else if (arg0) {
            return PreciseSleep.copy(arg1, 0);
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "mapview!sa", name = "a", descriptor = "([BI)[B", line = 58)
    public static final byte[] copy(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        copy(arg0, 0, var3, arg1, var2);
        return var3;
    }
}
