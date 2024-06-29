import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class194 extends class601 {

    @OriginalMember(owner = "client!ru", name = "G", descriptor = "Z")
    public static boolean field2927 = false;

    @OriginalMember(owner = "client!ru", name = "H", descriptor = "Z")
    public static volatile boolean field2928 = true;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    public static int field2924;

    @OriginalMember(owner = "client!ru", name = "E", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!ru", name = "F", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!ru", name = "I", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "Lofa;")
    public static class333 field2930;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIZ)I")
    private final int method1326(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            return -5;
        } else {
            ++field2924;
            int var4 = arg1 * 57 + arg0;
            int var5 = var4 ^ var4 << 1;
            return -(((var5 * var5 * 15731 - -789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(Z)V")
    public static void method1327(boolean arg0) {
        if (arg0) {
            field2928 = false;
        }
        field2930 = null;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "()V")
    public class194() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field2926;
        if (arg0 != -40) {
            this.method1326(-28, 109, true);
        }
        int[] var3 = super.field7902.method382(arg1, true);
        if (super.field7902.field704) {
            int var4 = class250.field3446[arg1];
            for (int var5 = 0; ~class171.field2624 < ~var5; ++var5) {
                var3[var5] = this.method1326(class453.field6186[var5], var4, true) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(I)[Lnha;")
    public static final class326[] method1328(int arg0) {
        if (arg0 != 1376312589) {
            return null;
        } else {
            ++field2931;
            return new class326[] { class86.field1038, class86.field1041, class86.field1042, class86.field1043, class86.field1044, class86.field1045, class86.field1046, class86.field1047, class86.field1048, class86.field1049, class86.field1050, class86.field1051 };
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "([Ljava/lang/String;III[S)V")
    public static final void method1329(String[] arg0, int arg1, int arg2, int arg3, short[] arg4) {
        if (arg3 < arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var8;
            for (int var9 = arg3; ~var9 > ~arg1; ++var9) {
                if (var7 == null || arg0[var9] != null && ~(1 & var9) < ~arg0[var9].compareTo(var7)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg1] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var8;
            method1329(arg0, var6 + -1, -117, arg3, arg4);
            method1329(arg0, arg1, -73, var6 + 1, arg4);
        }
        if (arg2 > -25) {
            field2930 = null;
        }
        ++field2923;
    }
}
