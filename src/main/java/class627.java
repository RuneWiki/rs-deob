import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class627 {

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "I")
    public int field8892;

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "Lmr;")
    public static class611 field8893 = new class611();

    @OriginalMember(owner = "client!nca", name = "c", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!nca", name = "d", descriptor = "I")
    public static int field8895;

    @OriginalMember(owner = "client!nca", name = "e", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!nca", name = "f", descriptor = "I")
    public static int field8897;

    @OriginalMember(owner = "client!nca", name = "g", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!nca", name = "h", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!nca", name = "i", descriptor = "I")
    public static int field8900;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nca", name = "j", descriptor = "Ljava/lang/Class;")
    public static Class field8901;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/io/File;IZ)V")
    public static final void method3610(File arg0, int arg1, boolean arg2) {
        field8895++;
        if (class284.field3964 == null) {
            class625.method3606(-103);
        }
        try {
            if (arg1 >= 54) {
                Class var3 = Class.forName("com.sun.management.HotSpotDiagnosticMXBean");
                Method var4 = var3.getDeclaredMethod("dumpHeap", field8901 == null ? (field8901 = method3617("java.lang.String")) : field8901, Boolean.TYPE);
                var4.invoke(class284.field3964, arg0.getAbsolutePath(), Boolean.valueOf(arg2));
            }
        } catch (Exception var6) {
            System.out.println("HeapDump error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(BI)I")
    public static final int method3611(byte arg0, int arg1) {
        field8897++;
        if (arg0 > -3) {
            method3612(null, null, (byte) 79, -90, 30);
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([J[IBII)V")
    public static final void method3612(long[] arg0, int[] arg1, byte arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg3];
            arg0[arg3] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg3; var11++) {
                if (var7 + ((long) (var10 & var11)) > arg0[var11]) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    int var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg3] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg3] = arg1[var6];
            arg1[var6] = var9;
            method3612(arg0, arg1, (byte) 85, var6 - 1, arg4);
            method3612(arg0, arg1, (byte) 85, arg3, var6 + 1);
        }
        field8896++;
        if (arg2 != 85) {
            field8893 = null;
        }
    }

    @OriginalMember(owner = "client!nca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8899++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)I")
    public final int method3613(boolean arg0) {
        field8900++;
        return arg0 ? 26 : this.field8892;
    }

    @OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class627(String arg0, int arg1) {
        this.field8892 = arg1;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(I)V")
    public static void method3614(int arg0) {
        int var1 = -115 % ((arg0 + 8) / 58);
        field8893 = null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lal;III)V")
    public static final void method3615(class123 arg0, int arg1, int arg2, int arg3) {
        class680.field9653[arg2][arg3] = arg0;
        if (arg1 != -23395) {
            method3612(null, null, (byte) 93, 43, 116);
        }
        field8894++;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(CI)Z")
    public static final boolean method3616(char arg0, int arg1) {
        field8898++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else {
            return ~arg0 == arg1 || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ';
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method3617(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
