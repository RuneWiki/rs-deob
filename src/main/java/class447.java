import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class447 extends class305 {

    @OriginalMember(owner = "client!at", name = "F", descriptor = "Ljava/lang/String;")
    public static String field6638 = null;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "I")
    public static int field6641 = 0;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "[Lfh;")
    public static class194[] field6645 = new class194[2048];

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public static int field6637;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    public static int field6639;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!at", name = "J", descriptor = "I")
    public static int field6642;

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    public static int field6644;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "Lap;")
    public static class29 field6643;

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ILtt;BI[BZII)Lf;", line = 3)
    public static final class412 method2751(int arg0, class249 arg1, byte arg2, int arg3, byte[] arg4, boolean arg5, int arg6, int arg7) {
        ++field6637;
        if (arg2 <= 61) {
            method2753((byte) -14);
        }
        if (!arg1.field3967 && (!class380.method2416(-1, arg6) || !class380.method2416(-1, arg3))) {
            return !arg1.field3987 ? new class412(arg1, arg7, arg6, arg3, class46.method307((byte) 116, arg6), class46.method307((byte) -111, arg3), arg4, arg0) : new class412(arg1, 34037, arg7, arg6, arg3, arg5, arg4, arg0);
        } else {
            return new class412(arg1, 3553, arg7, arg6, arg3, arg5, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Ljava/lang/String;", line = 22)
    public static final String method2752(boolean arg0) {
        ++field6639;
        String var1 = "www";
        if (class354.field5244 != class287.field4471) {
            if (class287.field4471 != class238.field3584) {
                if (class463.field6858 == class287.field4471) {
                    var1 = "www-wtwip";
                }
            } else {
                var1 = "www-wtqa";
            }
        } else {
            var1 = "www-wtrc";
        }
        if (!arg0) {
            method2755((String) null, (byte) 1);
        }
        String var2 = "";
        if (class229.field3461 != null) {
            var2 = "/p=" + class229.field3461;
        }
        return "http://" + var1 + "." + class401.field5923.field4702 + ".com/l=" + class345.field5141 + "/a=" + class516.field7505 + var2 + "/";
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(B)V", line = 52)
    public static void method2753(byte arg0) {
        int var1 = 62 / ((arg0 - -35) / 37);
        field6645 = null;
        field6643 = null;
        field6638 = null;
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(III)I", line = 64)
    private final int method2754(int arg0, int arg1, int arg2) {
        ++field6642;
        int var4 = arg0 * arg2 + arg1;
        int var5 = var4 ^ var4 << 1;
        return -((Integer.MAX_VALUE & (var5 * 15731 * var5 - -789221) * var5 + 1376312589) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 75)
    public static final int method2755(String arg0, byte arg1) {
        int var2 = 28 / ((-48 - arg1) / 42);
        ++field6644;
        return arg0.length() + 1;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[I", line = 90)
    public final int[] method15(int arg0, int arg1) {
        ++field6640;
        if (arg1 != 4688) {
            return null;
        } else {
            int[] var3 = super.field4677.method2174(arg0, arg1 ^ 4621);
            if (super.field4677.field5040) {
                int var4 = class301.field4614[arg0];
                for (int var5 = 0; class91.field1471 > var5; ++var5) {
                    var3[var5] = this.method2754(57, class78.field1298[var5], var4) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V", line = 127)
    public class447() {
        super(0, true);
    }
}
