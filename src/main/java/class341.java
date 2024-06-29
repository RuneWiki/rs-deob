import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class341 {

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "I")
    public int field5121;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "Ljava/lang/String;")
    public String field5125;

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "Z")
    public static boolean field5122 = false;

    @OriginalMember(owner = "client!kp", name = "h", descriptor = "I")
    public static int field5128 = 0;

    @OriginalMember(owner = "client!kp", name = "i", descriptor = "[I")
    public static int[] field5129 = new int[1000];

    @OriginalMember(owner = "client!kp", name = "j", descriptor = "I")
    public static int field5130 = -1;

    @OriginalMember(owner = "client!kp", name = "l", descriptor = "[I")
    public static int[] field5132 = new int[14];

    @OriginalMember(owner = "client!kp", name = "c", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!kp", name = "d", descriptor = "I")
    public static int field5124;

    @OriginalMember(owner = "client!kp", name = "g", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "[Lo;")
    public static class24[] field5126;

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V", line = 4)
    public static void method2150(int arg0) {
        if (arg0 == 1) {
            field5126 = null;
            field5129 = null;
            field5132 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field5131++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 28)
    public static final int method2151(String arg0, int arg1) {
        field5124++;
        if (arg0 == null) {
            return -1;
        }
        if (arg1 != -29887) {
            field5128 = 28;
        }
        for (int var2 = 0; var2 < class513.field7453; var2++) {
            if (arg0.equalsIgnoreCase(class330.field5008[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(II[J[II)V", line = 64)
    public static final void method2152(int arg0, int arg1, long[] arg2, int[] arg3, int arg4) {
        if (arg0 != 1) {
            field5126 = null;
        }
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg1; var11++) {
                if (arg2[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var9;
            method2152(arg0, var6 - 1, arg2, arg3, arg4);
            method2152(1, arg1, arg2, arg3, var6 + 1);
        }
        field5123++;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(IB)I", line = 121)
    public static final int method2153(int arg0, byte arg1) {
        if (arg1 != 9) {
            field5122 = true;
        }
        field5127++;
        return arg0 >> 11 & 0x7F;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 134)
    public class341(String arg0, int arg1) {
        this.field5121 = arg1;
        this.field5125 = arg0;
    }
}
