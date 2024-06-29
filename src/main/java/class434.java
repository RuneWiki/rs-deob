import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class434 extends class577 {

    @OriginalMember(owner = "client!za", name = "n", descriptor = "Lbu;")
    public static class21 field5872 = new class21(4, 12);

    @OriginalMember(owner = "client!za", name = "s", descriptor = "Lpha;")
    public static class174 field5877 = new class174("", 11);

    @OriginalMember(owner = "client!za", name = "l", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!za", name = "m", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!za", name = "o", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!za", name = "p", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!za", name = "q", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!za", name = "r", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!za", name = "t", descriptor = "I")
    public static int field5878;

    @OriginalMember(owner = "client!za", name = "u", descriptor = "Z")
    public static boolean field5879;

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V", line = 4)
    public static final void method2597(boolean arg0) {
        class754.field10412++;
        field5878++;
        class312 var1 = class353.method2245(class87.field971, class21.field354, (byte) 102);
        var1.field4445.method2952(0, 0);
        if (arg0) {
            field5877 = null;
        }
        class208.method1440(var1, 46);
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(I)V", line = 24)
    public static void method2598(int arg0) {
        field5872 = null;
        if (arg0 == 100) {
            field5877 = null;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IIIIIII)V", line = 35)
    public static final void method2599(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class21.field353.field10061.method2896(-39) != 0 && arg2 != 0 && class565.field8020 < 50 && arg4 != -1) {
            class262.field3842[class565.field8020++] = new class481((byte) 1, arg4, arg2, arg6, arg3, arg5, arg1, null);
        }
        int var7 = -30 % ((-arg0 - 48) / 40);
        field5875++;
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(II)I", line = 52)
    public static final int method2600(int arg0, int arg1) {
        field5870++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (~arg1 == arg0 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "([IIIBI)V", line = 88)
    public static final void method2601(int[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        arg1--;
        if (arg3 != -62) {
            field5877 = null;
        }
        field5874++;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg1 < var5) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            arg1 = var12 + 1;
            arg0[arg1] = arg2;
        }
        while (arg1 < var13) {
            arg1++;
            arg0[arg1] = arg2;
        }
    }

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(IBI)Z", line = 116)
    public static final boolean method2602(int arg0, byte arg1, int arg2) {
        int var3 = -98 % ((-arg1 - 64) / 54);
        field5871++;
        return (arg2 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!za", name = "b", descriptor = "(I)I", line = 129)
    public static final int method2603(int arg0) {
        if (arg0 != -29106) {
            method2597(true);
        }
        field5876++;
        int var1 = class433.field5869.method369((byte) 80);
        if (var1 < (class242.field3617.length - 1)) {
            class433.field5869 = class242.field3617[var1 + 1];
        }
        return 100;
    }
}
