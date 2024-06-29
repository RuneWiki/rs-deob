import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public abstract class class174 {

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2491 = new String[100];

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Ltk;")
    public static class228 field2494 = new class228(2, 4, 4, 0);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lqa;")
    public static class162 field2490;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "[I")
    public static int[] field2495;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILwv;)Lwv;")
    public abstract class26 method33(int arg0, class26 arg1);

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)Z")
    public static final boolean method1074(int arg0, int arg1, int arg2) {
        if (arg0 != 8192) {
            field2490 = null;
        }
        field2489++;
        return ((arg1 & 0x2000) != 0 | class435.method2594(arg1, -48, arg2) | class233.method1357(0, arg2, arg1)) & class200.method1234(arg0 ^ 0x2070, arg2, arg1);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lj;III[Z)V")
    public static final void method1075(class378 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class383.field5391 == class364.field5058) {
            return;
        }
        int var5 = class19.field195[arg1].method232(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class35 var7 = class19.field195[var6];
                if (var7 != null) {
                    var7.method226(arg0, arg2, var5 - var7.method232(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    public static void method1076(byte arg0) {
        field2494 = null;
        if (arg0 != 8) {
            method1076((byte) 65);
        }
        field2491 = null;
        field2490 = null;
        field2495 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "([[BLmi;I)V")
    public static final void method1077(byte[][] arg0, class341 arg1, int arg2) {
        field2493++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field7639; var4++) {
            class503.method2959(false);
            for (int var5 = 0; var5 < (class442.field6435 >> 3); var5++) {
                for (int var6 = 0; var6 < (class232.field3217 >> 3); var6++) {
                    boolean var7 = false;
                    int var8 = class530.field7811[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg1.field7626 || var9 == 0) {
                            int var10 = var8 >> 1 & 0x3;
                            int var11 = (var8 & 0xFFC9B7) >> 14;
                            int var12 = (var8 & 0x3FFC) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class101.field1378.length; var14++) {
                                if (class101.field1378[var14] == var13 && arg0[var14] != null) {
                                    class365 var15 = new class365(arg0[var14]);
                                    arg1.method3052(var12, var11, var4, var5 * 8, var15, var10, var9, var6 * 8, arg2 + 4, class6.field64);
                                    arg1.method1907(var11, var10, var3[0] == -1 ? var3 : null, class418.field6109, var6 * 8, (byte) -97, var9, var12, var15, var5 * 8, var4);
                                    var7 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        arg1.method3047(var5 * 8, 8, -1, var4, 8, var6 * 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class325.field4462 = class56.field771.method1628(class504.field7416, var3[1], var3[2], var3[3], var3[0], 0);
            class21.field267 = var3[4];
        }
        if (arg2 != 8) {
            field2490 = null;
        }
    }
}
