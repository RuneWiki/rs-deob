import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class151 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field2051 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Lvba;")
    public static class45 field2048 = new class45();

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field2054 = -1;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "[F")
    public static float[] field2057 = new float[16];

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "F")
    public static float field2055;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2053;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "[Lfq;")
    public static class214[] field2056;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)I", line = 3)
    public static final int method1059(int arg0) {
        field2050++;
        if (class677.field9075) {
            return 6;
        } else if (arg0 != 23540) {
            return -23;
        } else if (class191.field2474 == null) {
            return 0;
        } else {
            int var1 = class191.field2474.field6718;
            if (class341.method2166(var1, 17)) {
                return 1;
            } else if (class235.method1492(var1, 29470)) {
                return 2;
            } else if (class480.method2830(var1, true)) {
                return 3;
            } else if (class450.method2678(-49, var1)) {
                return 4;
            } else {
                return 5;
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V", line = 38)
    public static final void method1060(boolean arg0) {
        if (class640.field8634 != null) {
            try {
                class640.field8634.close();
            } catch (IOException var1) {
            }
        }
        field2053++;
        if (!arg0) {
            method1060(true);
        }
        class640.field8634 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([JIII[I)V", line = 62)
    public static final void method1061(long[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field2049++;
        if (arg3 != 1 || arg2 >= arg1) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg2;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var9 = arg4[var5];
        arg4[var5] = arg4[arg1];
        arg4[arg1] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg2; var11 < arg1; var11++) {
            if (arg0[var11] < ((long) (var11 & var10) + var7)) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6++] = var14;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg4[arg1] = arg4[var6];
        arg4[var6] = var9;
        method1061(arg0, var6 - 1, arg2, 1, arg4);
        method1061(arg0, arg1, var6 + 1, arg3, arg4);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLofa;)V", line = 122)
    public static final void method1062(byte arg0, class347 arg1) {
        if (class535.field7423 == arg1.field5029) {
            class753.field10199[arg1.field4973] = true;
        }
        if (arg0 >= -96) {
            field2048 = null;
        }
        field2052++;
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V", line = 140)
    public static void method1063(int arg0) {
        field2056 = null;
        field2057 = null;
        field2048 = null;
        if (arg0 != 25584) {
            method1059(-124);
        }
    }
}
