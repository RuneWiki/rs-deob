import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class520 extends class71 {

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public int field7251;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "I")
    public int field7246;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Z")
    public static boolean field7248 = false;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Lip;")
    public static class306 field7247 = new class306();

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field7252 = 0;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field7253 = 1;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
    public static int field7249;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field7250;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
    public static void method3098(boolean arg0) {
        if (arg0) {
            field7252 = 57;
        }
        field7247 = null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    public static final void method3099(byte arg0) {
        field7250++;
        if (arg0 < 29) {
            field7248 = false;
        }
        if (class538.field7453 == 5) {
            class538.field7453 = 6;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(II)V")
    public class520(int arg0, int arg1) {
        this.field7251 = arg1;
        this.field7246 = arg0;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I[I[JII)V")
    public static final void method3100(int arg0, int[] arg1, long[] arg2, int arg3, int arg4) {
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg4; var11++) {
                if (var7 + ((long) (var10 & var11)) > arg2[var11]) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    int var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method3100(arg0, arg1, arg2, 0, var6 - 1);
            method3100(var6 + 1, arg1, arg2, 0, arg4);
        }
        field7249++;
        if (arg3 != 0) {
            field7247 = null;
        }
    }
}
