import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public class class10 implements class401 {

    @OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
    public int field149;

    @OriginalMember(owner = "client!hba", name = "f", descriptor = "I")
    public static int field150 = 1405;

    @OriginalMember(owner = "client!hba", name = "g", descriptor = "Ljg;")
    public static class340 field151 = new class340();

    @OriginalMember(owner = "client!hba", name = "h", descriptor = "Llf;")
    public static class238 field152 = new class238();

    @OriginalMember(owner = "client!hba", name = "i", descriptor = "Lmia;")
    public static class63 field153 = new class63(52, 8);

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
    public static int field145;

    @OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
    public static int field146;

    @OriginalMember(owner = "client!hba", name = "c", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!hba", name = "d", descriptor = "I")
    public static int field148;

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)Lio;")
    public final class439 method69(byte arg0) {
        int var2 = -125 % ((-arg0 - 69) / 39);
        field147++;
        return class189.field2867;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(ILns;B)V")
    public static final void method70(int arg0, class405 arg1, byte arg2) {
        field145++;
        int var3 = -1;
        int var4 = 0;
        if (class357.field5189 < arg1.field6052) {
            class494.method2946(88, arg1);
        } else if (class357.field5189 > arg1.field6100) {
            class50.method365(false, 23467, arg1);
            var3 = class164.field2591;
            var4 = class13.field177;
        } else {
            class548.method3206(28005, arg1);
        }
        if (arg2 > -27) {
            method72(83, 50, -83, -4, -45, 22, (byte) 122, -89, 82);
        }
        if (arg1.field8423 < 512 || arg1.field8428 < 512 || arg1.field8423 >= (class194.field2946 * 512 - 512) || (class255.field3656 * 512 - 512) <= arg1.field8428) {
            arg1.field6094 = -1;
            arg1.field6039 = null;
            arg1.field6052 = 0;
            var3 = -1;
            var4 = 0;
            arg1.field6107 = -1;
            arg1.field6061 = -1;
            arg1.field6100 = 0;
            arg1.field8423 = arg1.field6133[0] * 512 + arg1.method2579(false) * 256;
            arg1.field8428 = arg1.field6139[0] * 512 + (arg1.method2579(false) * 256);
            arg1.method2572((byte) 28);
        }
        if (class130.field1749 == arg1 && (arg1.field8423 < 6144 || arg1.field8428 < 6144 || ((class194.field2946 - 12) * 512) <= arg1.field8423 || (class255.field3656 * 512 - 6144) <= arg1.field8428)) {
            arg1.field6107 = -1;
            var4 = 0;
            arg1.field6039 = null;
            arg1.field6094 = -1;
            arg1.field6052 = 0;
            arg1.field6061 = -1;
            var3 = -1;
            arg1.field6100 = 0;
            arg1.field8423 = arg1.field6133[0] * 512 + arg1.method2579(false) * 256;
            arg1.field8428 = arg1.field6139[0] * 512 + (arg1.method2579(false) * 256);
            arg1.method2572((byte) 28);
        }
        int var5 = class705.method4007(0, arg1);
        class618.method3560(arg1, (byte) -117);
        class647.method3765(arg1, var5, var3, var4, 14336);
        class94.method742((byte) 114, var3, arg1);
        class96.method747((byte) -97, arg1);
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(JJ)J")
    public static long method71(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIIIBII)V")
    public static final void method72(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field146++;
        if (class245.method1632(816183856, arg8)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 63 / ((arg6 - 5) / 53);
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (class419.field6265) {
                var14 = class85.field1220;
                var10 = class435.field6466;
                var15 = class566.field8046;
                var13 = class657.field9205;
                var11 = class322.field4595;
                class566.field8046 = 1;
            }
            if (class365.field5282[arg8] == null) {
                class455.method2788(arg2, arg4, arg3, -1, arg5, arg0, 100, arg4 < 0, class86.field1229[arg8], arg1, arg7);
            } else {
                class455.method2788(arg2, arg4, arg3, -1, arg5, arg0, 100, arg4 < 0, class365.field5282[arg8], arg1, arg7);
            }
            if (class419.field6265) {
                if (arg4 >= 0 && class566.field8046 == 2) {
                    class497.method2963(class85.field1220, class657.field9205, (byte) -119, class322.field4595, class435.field6466);
                }
                class566.field8046 = var15;
                class322.field4595 = var11;
                class435.field6466 = var10;
                class657.field9205 = var13;
                class85.field1220 = var14;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class228.field3352[var9] = true;
            }
        } else {
            class228.field3352[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(I)V")
    public class10(int arg0) {
        this.field149 = arg0;
    }

    @OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)V")
    public static void method73(int arg0) {
        field151 = null;
        if (arg0 == 2) {
            field153 = null;
            field152 = null;
        }
    }
}
