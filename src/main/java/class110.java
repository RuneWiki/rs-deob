import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class110 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1798 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1802 = "Loaded input handler";

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public int field1809;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "Lwl;")
    public class171 field1801;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lhc;")
    public static class235 field1807;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[I")
    public int[] field1799;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "[Lpl;")
    public static class293[] field1803;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method782(int arg0) {
        field1805++;
        if (arg0 != 128) {
            field1802 = null;
        }
        class267.field4252++;
        client.field2435.method536((byte) -104, 237);
        client.field2435.method634(class221.field3401, 95);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method783(int arg0, int arg1, int arg2, long arg3) {
        class6 var5 = class269.field4298[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field147 != null && var5.field147.field159 == arg3) {
            return true;
        } else if (var5.field123 != null && var5.field123.field3217 == arg3) {
            return true;
        } else if (var5.field144 != null && var5.field144.field2146 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field125; var6++) {
                if (var5.field134[var6].field4618 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lji;IIIII)V")
    public static final void method784(class43 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class217.field3352 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class142.field2166) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class280.field4424 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class6 var14 = class269.field4298[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class66.field1107[var11][var12 + 1][var13] + class66.field1107[var11][var12][var13] + class66.field1107[var11][var12][var13 + 1] + class66.field1107[var11][var12 + 1][var13 + 1]) / 4 - (class66.field1107[arg1][arg2 + 1][arg3] + class66.field1107[arg1][arg2][arg3] + class66.field1107[arg1][arg2][arg3 + 1] + class66.field1107[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class7 var16 = var14.field147;
                                    if (var16 != null) {
                                        if (var16.field149.method315()) {
                                            arg0.method319(var16.field149, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field156 != null && var16.field156.method315()) {
                                            arg0.method319(var16.field156, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field125; var17++) {
                                        class293 var18 = var14.field134[var17];
                                        if (var18 != null && var18.field4619.method315() && (var18.field4616 == var12 || var7 == var12) && (var18.field4612 == var13 || var9 == var13)) {
                                            int var19 = var18.field4623 + 1 - var18.field4616;
                                            int var20 = var18.field4615 + 1 - var18.field4612;
                                            arg0.method319(var18.field4619, (var18.field4616 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field4612 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static void method785(int arg0) {
        field1807 = null;
        if (arg0 == 64) {
            field1803 = null;
            field1802 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Lpj;")
    public static final class255 method786(int arg0, int arg1) {
        class255 var2 = (class255) class244.field3966.method1887(arg1 ^ arg1, (long) arg0);
        field1808++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class186.field2872.method1590(arg0, (byte) -25, 29);
        class255 var4 = new class255();
        if (var3 != null) {
            var4.method1735(new class88(var3), arg0, arg1 ^ 0xFFFFB8F3);
        }
        class244.field3966.method1886(-64, (long) arg0, var4);
        return var4;
    }
}
