import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jca")
public class class582 {

    @OriginalMember(owner = "client!jca", name = "c", descriptor = "Lvg;")
    public static class622 field8463 = new class622(68, 12);

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "I")
    public static int field8461;

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "I")
    public static int field8462;

    @OriginalMember(owner = "client!jca", name = "d", descriptor = "I")
    public static int field8464;

    @OriginalMember(owner = "client!jca", name = "e", descriptor = "I")
    public static int field8465;

    @OriginalMember(owner = "client!jca", name = "f", descriptor = "Lae;")
    public static class254 field8466;

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method3338(int arg0, int arg1, int arg2) {
        field8462++;
        if (arg1 == 13419) {
            return (arg0 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(IBLrg;)V", line = 20)
    public static final void method3339(int arg0, byte arg1, class523 arg2) {
        field8464++;
        if (arg2.field7328 != null) {
            int var3 = arg2.field7328[arg0 + 1];
            if (arg2.field7389 != var3) {
                arg2.field7419 = 0;
                arg2.field7389 = var3;
                arg2.field7371 = 1;
                arg2.field7434 = arg2.field7436;
                arg2.field7342 = 0;
                arg2.field7391 = 0;
                if (arg2.field7389 != -1) {
                    class620.method3567(arg2, arg2.field7419, class203.field2769.method2971(arg1 ^ 0x4E, arg2.field7389), (byte) -122);
                }
            }
        }
        if (arg1 != -57) {
            method3340((byte) 40);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(B)V", line = 53)
    public static void method3340(byte arg0) {
        field8466 = null;
        field8463 = null;
        if (arg0 != -102) {
            method3340((byte) -55);
        }
    }

    @OriginalMember(owner = "client!jca", name = "a", descriptor = "(FFFIIIIIBII[FI)V", line = 68)
    public static final void method3341(float arg0, float arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, float[] arg11, int arg12) {
        int var13 = arg12 - arg7;
        field8461++;
        int var14 = arg10 - arg5;
        int var15 = arg9 - arg6;
        float var16 = arg11[2] * (float) var13 + arg11[0] * (float) var15 + arg11[1] * (float) var14;
        float var17 = arg11[5] * (float) var13 + arg11[4] * (float) var14 + arg11[3] * (float) var15;
        float var18 = arg11[8] * (float) var13 + arg11[7] * (float) var14 + arg11[6] * (float) var15;
        float var19;
        float var20;
        if (arg3 == 0) {
            var20 = arg2 + var16 + 0.5F;
            var19 = arg0 + 0.5F - var18;
        } else if (arg3 == 1) {
            var19 = arg0 + var18 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg3 == 2) {
            var19 = arg1 + 0.5F - var17;
            var20 = arg2 + 0.5F - var16;
        } else if (arg3 == 3) {
            var20 = arg2 + var16 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else if (arg3 == 4) {
            var20 = arg0 + var18 + 0.5F;
            var19 = arg1 + 0.5F - var17;
        } else {
            var20 = arg0 + 0.5F - var18;
            var19 = arg1 + 0.5F - var17;
        }
        if (arg4 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg4 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg4 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        if (arg8 > -7) {
            field8463 = null;
        }
        class334.field4850 = var19;
        class258.field3350 = var20;
    }

    @OriginalMember(owner = "client!jca", name = "b", descriptor = "(B)V", line = 154)
    public static final void method3342(byte arg0) {
        field8465++;
        int var1 = class389.field5816.method3169(26488);
        int var2 = class389.field5816.method3168(65536);
        class57.field938 = class389.field5816.method3139(119);
        int var3 = class389.field5816.method3166((byte) -83);
        boolean var4 = class389.field5816.method3166((byte) -56) == 1;
        class684.method3832(0);
        class293.method1804(var3, (byte) 70);
        class389.field5816.method1941(-105);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class72.field1144 >> 3); var20++) {
                for (int var21 = 0; var21 < (class668.field9444 >> 3); var21++) {
                    int var22 = class389.field5816.method1946(1, (byte) 120);
                    if (var22 == 1) {
                        class81.field1310[var5][var20][var21] = class389.field5816.method1946(26, (byte) 124);
                    } else {
                        class81.field1310[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class389.field5816.method1935((byte) 114);
        int var6 = (class297.field4376 - class389.field5816.field7956) / 16;
        class654.field9367 = new int[var6][4];
        if (arg0 < 90) {
            return;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class654.field9367[var7][var19] = class389.field5816.method3160(false);
            }
        }
        class47.field751 = new byte[var6][];
        class480.field6863 = null;
        class476.field6823 = new byte[var6][];
        class505.field7147 = new int[var6];
        class443.field6438 = new int[var6];
        class221.field2933 = new int[var6];
        class108.field1609 = null;
        class246.field3253 = new byte[var6][];
        class299.field4396 = new int[var6];
        class372.field5505 = new int[var6];
        class51.field801 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class72.field1144 >> 3; var10++) {
                for (int var11 = 0; var11 < class668.field9444 >> 3; var11++) {
                    int var12 = class81.field1310[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class505.field7147[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class505.field7147[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class221.field2933[var8] = class43.field625.method1819("m" + var17 + "_" + var18, (byte) 109);
                            class372.field5505[var8] = class43.field625.method1819("l" + var17 + "_" + var18, (byte) 37);
                            class299.field4396[var8] = class43.field625.method1819("um" + var17 + "_" + var18, (byte) 51);
                            class443.field6438[var8] = class43.field625.method1819("ul" + var17 + "_" + var18, (byte) 95);
                            var8++;
                        }
                    }
                }
            }
        }
        class699.method3924(var2, 123, 11, var1, var4);
    }
}
