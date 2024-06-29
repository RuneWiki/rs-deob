import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class53 extends class224 {

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "Llf;")
    public static class211 field729 = new class211(30);

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field735 = 5063219;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "Ljava/lang/String;")
    public static String field736 = null;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "[Lei;")
    public static class172[] field737 = new class172[50];

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Ltj;")
    public static class273 field733;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(Z)V")
    public static void method385(boolean arg0) {
        field737 = null;
        field736 = null;
        field729 = null;
        field733 = null;
        if (!arg0) {
            field735 = -102;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)Lil;")
    public static final class162 method386(int arg0, byte arg1, int arg2) {
        if (arg1 != -65) {
            method388(24, -19, -71, 84, true, 43);
        }
        ++field725;
        for (class162 var3 = (class162) class4.field63.method350(8240); var3 != null; var3 = (class162) class4.field63.method353((byte) -123)) {
            if (var3.field2511 && var3.method1113(-99, arg2, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method387(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = -arg3 + 2048 & 2047;
        int var9 = 0;
        int var10 = 0;
        ++field732;
        int var11 = 2047 & -arg5 + 2048;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class171.field2675[var8];
            var9 = -arg4 * var13 >> 16;
            int var14 = class171.field2680[var8];
            var12 = arg4 * var14 >> 16;
        }
        if (var11 != 0) {
            int var15 = class171.field2675[var11];
            var10 = var12 * var15 >> 16;
            int var16 = class171.field2680[var11];
            var12 = var12 * var16 >> 16;
        }
        class96.field1487 = -var9 + arg0;
        class54.field750 = -var12 + arg7;
        if (arg6 != 50) {
            field736 = null;
        }
        class66.field918 = -var10 + arg2;
        class215.field3516 = arg3;
        class77.field1092 = arg5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg1 == 0) {
            super.field3624 = arg0.method201(255) == 1;
        }
        if (arg2 >= -46) {
            method386(-32, (byte) -106, -33);
        }
        ++field730;
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class53() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIZI)V")
    public static final void method388(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (~arg0 > -2) {
            arg0 = 1;
        }
        class140.field2060 = (short) arg2;
        class34.field435 = (short) arg0;
        ++field734;
        int var6 = -108 / ((arg1 - 46) / 50);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        if (!arg1) {
            field729 = null;
        }
        ++field726;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int[] var4 = this.method1527(arg0, 0, (byte) 84);
            for (int var5 = 0; ~var5 > ~class78.field1108; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field728;
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (arg1 != 1) {
            this.method14(-76, true);
        }
        if (super.field3616.field3042) {
            int[][] var4 = this.method1532(61, 0, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class78.field1108; ++var11) {
                var7[var11] = 4096 - var8[var11];
                var10[var11] = -var6[var11] + 4096;
                var9[var11] = -var5[var11] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ljf;")
    public static final class64 method389(Throwable arg0, String arg1) {
        ++field731;
        class64 var2;
        if (arg0 instanceof class64) {
            var2 = (class64) arg0;
            var2.field895 = var2.field895 + ' ' + arg1;
        } else {
            var2 = new class64(arg0, arg1);
        }
        return var2;
    }
}
