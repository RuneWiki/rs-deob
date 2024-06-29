import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class85 {

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "Lgaa;")
    public static class460 field1090 = null;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!iga", name = "c", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "([[BILtha;)V", line = 6)
    public static final void method598(byte[][] arg0, int arg1, class486 arg2) {
        field1089++;
        int[] var3 = new int[] { arg1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg2.field1743; var4++) {
            class384.method2308(-94);
            for (int var9 = 0; var9 < (class613.field8591 >> 3); var9++) {
                for (int var10 = 0; var10 < (class1.field3 >> 3); var10++) {
                    int var11 = class269.field3399[var4][var9][var10];
                    if (var11 != -1) {
                        int var12 = (var11 & 0x3A1E268) >> 24;
                        if (!arg2.field1740 || var12 == 0) {
                            int var13 = var11 >> 1 & 0x3;
                            int var14 = (var11 & 0xFFFA5D) >> 14;
                            int var15 = var11 >> 3 & 0x7FF;
                            int var16 = (var14 / 8 << 8) + var15 / 8;
                            for (int var17 = 0; var17 < class248.field3162.length; var17++) {
                                if (class248.field3162[var17] == var16 && arg0[var17] != null) {
                                    class179 var18 = new class179(arg0[var17]);
                                    arg2.method893(var14, var12, var13, var10 * 8, class410.field5786, 22270, var4, var15, var18, var9 * 8);
                                    arg2.method2839(var10 * 8, var18, var14, class458.field6407, var15, var3[0] == -1 ? var3 : null, -117, var12, var9 * 8, var4, var13);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int var5 = 0; var5 < arg2.field1743; var5++) {
            class384.method2308(-124);
            for (int var6 = 0; var6 < class613.field8591 >> 3; var6++) {
                for (int var7 = 0; var7 < (class1.field3 >> 3); var7++) {
                    int var8 = class269.field3399[var5][var6][var7];
                    if (var8 == -1) {
                        arg2.method895(8, var7 * 8, 25200, var6 * 8, var5, 8);
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class219.field2786 = class182.field2384.method2999(var3[2], var3[3], arg1 + 1, var3[0], var3[1], class696.field9859);
            class638.field8829 = var3[4];
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIILgaa;)V", line = 124)
    public static final void method599(int arg0, int arg1, int arg2, class460 arg3) {
        if (class138.field1656) {
            class49 var4 = class652.field8984 == -1 ? null : class188.field2466.method3449(2529, class652.field8984);
            if (client.method715(arg3).method289(true) && (class337.field4352 & 0x20) != 0 && (var4 == null || arg3.method2703(var4.field720, class652.field8984, (byte) -110) != var4.field720)) {
                class425.method2528(11, class741.field10370 + " -> " + arg3.field6576, arg3.field6556, true, -113, (long) (arg3.field6524 | arg3.field6601 << 0), class556.field7800, 0L, false, arg3.field6601, arg3.field6524, false, class586.field8192);
                class335.field4303++;
            }
        }
        field1091++;
        for (int var5 = 9; var5 >= 5; var5--) {
            String var9 = class42.method356(var5, -1, arg3);
            if (var9 != null) {
                class425.method2528(1011, arg3.field6576, arg3.field6556, true, -124, (long) (arg3.field6524 | arg3.field6601 << 0), var9, (long) (var5 + 1), false, arg3.field6601, arg3.field6524, false, class670.method3621(1, var5, arg3));
                class611.field8451++;
            }
        }
        String var6 = class58.method456(5, arg3);
        if (var6 != null) {
            class304.field3913++;
            class425.method2528(30, arg3.field6576, arg3.field6556, true, -105, (long) (arg3.field6601 << 0 | arg3.field6524), var6, 0L, false, arg3.field6601, arg3.field6524, false, arg3.field6530);
        }
        if (arg1 > -111) {
            return;
        }
        for (int var7 = 4; var7 >= 0; var7--) {
            String var8 = class42.method356(var7, -1, arg3);
            if (var8 != null) {
                class425.method2528(21, arg3.field6576, arg3.field6556, true, 33, (long) (arg3.field6601 << 0 | arg3.field6524), var8, (long) (var7 + 1), false, arg3.field6601, arg3.field6524, false, class670.method3621(1, var7, arg3));
                class611.field8451++;
            }
        }
        if (!client.method715(arg3).method286(-119)) {
            return;
        }
        class201.field2571++;
        if (arg3.field6560 == null) {
            class425.method2528(59, "", arg3.field6556, true, 11, (long) (arg3.field6601 << 0 | arg3.field6524), class586.field8134.method3261(class416.field5920, (byte) 82), 0L, false, arg3.field6601, arg3.field6524, false, -1);
        } else {
            class425.method2528(59, "", arg3.field6556, true, -119, (long) (arg3.field6601 << 0 | arg3.field6524), arg3.field6560, 0L, false, arg3.field6601, arg3.field6524, false, -1);
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)V", line = 201)
    public static void method600(boolean arg0) {
        field1090 = null;
        if (!arg0) {
            method598(null, -22, null);
        }
    }
}
