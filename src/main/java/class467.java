import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class467 extends class184 {

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "[Lfl;")
    public static class741[] field6836 = new class741[16];

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field6835;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "[Lak;")
    public static class351[] field6838;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IBI[Ljava/lang/Object;[I)V", line = 7)
    public static final void method2832(int arg0, byte arg1, int arg2, Object[] arg3, int[] arg4) {
        if (arg0 < arg2) {
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg0;
            int var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var8 = arg3[var5];
            arg3[var5] = arg3[arg2];
            arg3[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (((var9 & var10) + var7) > arg4[var10]) {
                    int var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg2] = arg3[var6];
            arg3[var6] = var8;
            method2832(arg0, (byte) 112, var6 - 1, arg3, arg4);
            method2832(var6 + 1, (byte) 118, arg2, arg3, arg4);
        }
        field6837++;
        if (arg1 < 110) {
            field6836 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lr;III[Z)Z", line = 66)
    public static final boolean method2833(class183 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class582.field8287 != class46.field568) {
            int var6 = class531.field7566[arg1].method1786(arg3, (byte) 113, arg2);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class280 var8 = class531.field7566[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1786(arg3, (byte) 113, arg2);
                    if (arg4 != null) {
                        arg4[var7] = var8.method964(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method976(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)Lffa;", line = 105)
    public static final class186 method2834(int arg0, int arg1, int arg2) {
        if (class80.field1136[arg0][arg1][arg2] == null) {
            boolean var3 = class80.field1136[0][arg1][arg2] != null && class80.field1136[0][arg1][arg2].field2842 != null;
            if (var3 && arg0 >= class409.field6165 - 1) {
                return null;
            }
            class252.method1660(arg0, arg1, arg2);
        }
        return class80.field1136[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lvd;ILvd;Lvd;Lvd;)V", line = 125)
    public static final void method2835(class39 arg0, int arg1, class39 arg2, class39 arg3, class39 arg4) {
        class118.field1608 = arg3;
        class673.field9387 = arg2;
        field6835++;
        class400.field5963 = arg4;
        class86.field1229 = new class46[class673.field9387.method222((byte) 126)][];
        class408.field6161 = new boolean[class673.field9387.method222((byte) -88)];
        if (arg1 < 1) {
            field6838 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "(B)V", line = 143)
    public static void method2836(byte arg0) {
        field6836 = null;
        if (arg0 >= 105) {
            field6838 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)J")
    public abstract long method1791(byte arg0);

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)I")
    public abstract int method1794(byte arg0);

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)I")
    public abstract int method1795(byte arg0);

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "(B)I")
    public abstract int method1793(byte arg0);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "(B)I")
    public abstract int method1792(byte arg0);
}
