import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class460 extends class642 {

    @OriginalMember(owner = "client!gga", name = "G", descriptor = "Lmh;")
    public static class139 field6627 = new class139(8, 1);

    @OriginalMember(owner = "client!gga", name = "B", descriptor = "I")
    public static int field6622;

    @OriginalMember(owner = "client!gga", name = "C", descriptor = "I")
    public static int field6623;

    @OriginalMember(owner = "client!gga", name = "D", descriptor = "I")
    public static int field6624;

    @OriginalMember(owner = "client!gga", name = "E", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!gga", name = "F", descriptor = "I")
    public static int field6626;

    @OriginalMember(owner = "client!gga", name = "I", descriptor = "I")
    public static int field6628;

    @OriginalMember(owner = "client!gga", name = "J", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(ILgk;B)V", line = 3)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        if (arg2 < 29) {
            method2681(85, -105, false, -98, -93);
        }
        if (~arg0 == -1) {
            super.field9207 = ~arg1.method3115(29871) == -2;
        }
        ++field6623;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Z)V", line = 17)
    public static void method2679(boolean arg0) {
        field6627 = null;
        if (arg0) {
            method2681(99, -110, true, 9, -127);
        }
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "([BIB)[B", line = 28)
    public static final byte[] method2680(byte[] arg0, int arg1, byte arg2) {
        ++field6626;
        byte[] var3 = new byte[arg1];
        class667.method3739(arg0, 0, var3, 0, arg1);
        if (arg2 > -30) {
            method2683(-127, 37, -83);
        }
        return var3;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZII)Lnc;", line = 42)
    public static final class200 method2681(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field6628;
        class200 var5 = new class200();
        var5.field2721 = arg3;
        var5.field2716 = arg4;
        class318.field4623.method2001(55, var5, (long) arg1);
        class417.method2533(arg4, arg0 ^ arg0);
        class5 var6 = class705.method3944(arg1, (byte) 124);
        if (var6 != null) {
            class284.method1679(var6, -51);
        }
        if (class246.field3254 != null) {
            class284.method1679(class246.field3254, -109);
            class246.field3254 = null;
        }
        class653.method3696(28623);
        if (var6 != null) {
            class319.method1976(!arg2, (byte) 79, var6);
        }
        if (!arg2) {
            class195.method1273(arg4);
        }
        if (!arg2 && class567.field8270 != -1) {
            class572.method3283((byte) -118, 1, class567.field8270);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(II)[[I", line = 81)
    public final int[][] method138(int arg0, int arg1) {
        ++field6622;
        int[][] var3 = super.field9211.method1068(arg0 + -21402, arg1);
        if (arg0 != 21402) {
            this.method3(-124, -60);
        }
        if (super.field9211.field2131) {
            int[][] var4 = this.method3657(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class338.field4909 < ~var11; ++var11) {
                var8[var11] = 4096 - var5[var11];
                var9[var11] = 4096 - var6[var11];
                var10[var11] = -var7[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(III)V", line = 131)
    public static final void method2682(int arg0, int arg1, int arg2) {
        ++field6624;
        class489 var3 = class704.method3942(arg0, 6, arg2);
        var3.method2797(-1);
        var3.field6952 = arg1;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "()V", line = 143)
    public class460() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(II)[I", line = 147)
    public final int[] method3(int arg0, int arg1) {
        ++field6625;
        int[] var3 = super.field9216.method1185(arg0, -109);
        if (arg1 != -9) {
            field6627 = null;
        }
        if (super.field9216.field2418) {
            int[] var4 = this.method3658((byte) 120, arg0, 0);
            for (int var5 = 0; ~var5 > ~class338.field4909; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(III)Z", line = 186)
    public static final boolean method2683(int arg0, int arg1, int arg2) {
        if (arg2 != 262144) {
            return true;
        } else {
            ++field6629;
            return ~(arg1 & 262144) != -1 | class211.method1337(arg0, arg1, 16500) || class115.method855(arg0, arg1, -1148);
        }
    }
}
