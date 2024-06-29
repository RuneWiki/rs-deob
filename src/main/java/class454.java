import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class class454 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field6261 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIIILqt;IIIII)Z")
    public static final boolean method2647(int arg0, int arg1, int arg2, int arg3, int arg4, class542 arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        field6262++;
        int var11 = arg3;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        class303.field3871[var13][var14] = 99;
        int var16 = arg2 - var14;
        class585.field8491[var13][var14] = 0;
        byte var17 = 0;
        int var18 = -19 / ((arg10 - 25) / 47);
        class104.field1271[var17] = arg3;
        int var19 = 0;
        byte var10001 = var17;
        int var27 = var17 + 1;
        class468.field6544[var10001] = arg2;
        int[][] var20 = arg5.field7922;
        while (var27 != var19) {
            var12 = class468.field6544[var19];
            var11 = class104.field1271[var19];
            int var21 = var11 - var15;
            int var22 = var12 - arg5.field7915;
            int var23 = var11 - arg5.field7939;
            var19 = var19 + 1 & 0xFFF;
            int var24 = var12 - var16;
            if (arg1 == -4) {
                if (arg9 == var11 && arg8 == var12) {
                    class152.field1855 = var11;
                    class348.field4484 = var12;
                    return true;
                }
            } else if (arg1 == -3) {
                if (class320.method1765(arg0, 1, -123, arg9, var11, arg8, var12, 1, arg7)) {
                    class348.field4484 = var12;
                    class152.field1855 = var11;
                    return true;
                }
            } else if (arg1 == -2) {
                if (arg5.method3158(arg6, arg7, -55, arg8, arg9, var12, 1, 1, var11, arg0)) {
                    class152.field1855 = var11;
                    class348.field4484 = var12;
                    return true;
                }
            } else if (arg1 == -1) {
                if (arg5.method3157(1, var11, arg8, arg0, arg9, arg7, -123, var12, arg6)) {
                    class348.field4484 = var12;
                    class152.field1855 = var11;
                    return true;
                }
            } else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
                if (arg5.method3154(arg4, arg8, arg1, arg9, var11, 1, (byte) -10, var12)) {
                    class348.field4484 = var12;
                    class152.field1855 = var11;
                    return true;
                }
            } else if (arg5.method3156(arg4, arg9, var12, var11, arg1, (byte) 101, 1, arg8)) {
                class348.field4484 = var12;
                class152.field1855 = var11;
                return true;
            }
            int var26 = class585.field8491[var21][var24] + 1;
            if (var21 > 0 && class303.field3871[var21 - 1][var24] == 0 && (var20[var23 - 1][var22] & 0x42240000) == 0) {
                class104.field1271[var27] = var11 - 1;
                class468.field6544[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21 - 1][var24] = 2;
                class585.field8491[var21 - 1][var24] = var26;
            }
            if (var21 < 127 && class303.field3871[var21 + 1][var24] == 0 && (var20[var23 + 1][var22] & 0x60240000) == 0) {
                class104.field1271[var27] = var11 + 1;
                class468.field6544[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21 + 1][var24] = 8;
                class585.field8491[var21 + 1][var24] = var26;
            }
            if (var24 > 0 && class303.field3871[var21][var24 - 1] == 0 && (var20[var23][var22 - 1] & 0x40A40000) == 0) {
                class104.field1271[var27] = var11;
                class468.field6544[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21][var24 - 1] = 1;
                class585.field8491[var21][var24 - 1] = var26;
            }
            if (var24 < 127 && class303.field3871[var21][var24 + 1] == 0 && (var20[var23][var22 + 1] & 0x48240000) == 0) {
                class104.field1271[var27] = var11;
                class468.field6544[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21][var24 + 1] = 4;
                class585.field8491[var21][var24 + 1] = var26;
            }
            if (var21 > 0 && var24 > 0 && class303.field3871[var21 - 1][var24 - 1] == 0 && (var20[var23 - 1][var22 - 1] & 0x43A40000) == 0 && (var20[var23 - 1][var22] & 0x42240000) == 0 && (var20[var23][var22 - 1] & 0x40A40000) == 0) {
                class104.field1271[var27] = var11 - 1;
                class468.field6544[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21 - 1][var24 - 1] = 3;
                class585.field8491[var21 - 1][var24 - 1] = var26;
            }
            if (var21 < 127 && var24 > 0 && class303.field3871[var21 + 1][var24 - 1] == 0 && (var20[var23 + 1][var22 - 1] & 0x60E40000) == 0 && (var20[var23 + 1][var22] & 0x60240000) == 0 && (var20[var23][var22 - 1] & 0x40A40000) == 0) {
                class104.field1271[var27] = var11 + 1;
                class468.field6544[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21 + 1][var24 - 1] = 9;
                class585.field8491[var21 + 1][var24 - 1] = var26;
            }
            if (var21 > 0 && var24 < 127 && class303.field3871[var21 - 1][var24 + 1] == 0 && (var20[var23 - 1][var22 + 1] & 0x4E240000) == 0 && (var20[var23 - 1][var22] & 0x42240000) == 0 && (var20[var23][var22 + 1] & 0x48240000) == 0) {
                class104.field1271[var27] = var11 - 1;
                class468.field6544[var27] = var12 + 1;
                class303.field3871[var21 - 1][var24 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class585.field8491[var21 - 1][var24 + 1] = var26;
            }
            if (var21 < 127 && var24 < 127 && class303.field3871[var21 + 1][var24 + 1] == 0 && (var20[var23 + 1][var22 + 1] & 0x78240000) == 0 && (var20[var23 + 1][var22] & 0x60240000) == 0 && (var20[var23][var22 + 1] & 0x48240000) == 0) {
                class104.field1271[var27] = var11 + 1;
                class468.field6544[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class303.field3871[var21 + 1][var24 + 1] = 12;
                class585.field8491[var21 + 1][var24 + 1] = var26;
            }
        }
        class152.field1855 = var11;
        class348.field4484 = var12;
        return false;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZ)V")
    public static final void method2648(byte arg0, boolean arg1) {
        int var2 = 52 / ((-arg0 - 10) / 55);
        field6260++;
        class594.field8624 = 0;
        class530.field7450 = 0;
        class510.method2933((byte) -99);
        class163.method890((byte) -116, arg1);
        class344.method1921(1023);
        boolean var3 = false;
        for (int var4 = 0; var4 < class530.field7450; var4++) {
            int var6 = class250.field3225[var4];
            class415 var7 = (class415) class309.field3938.method2645((long) var6, (byte) -104);
            class459 var8 = var7.field5390;
            if (class473.field6634 && class601.method3462(var6, (byte) -22)) {
                class19.method123(2169);
            }
            if (class335.field4358 != var8.field6417) {
                if (var8.field6334.method428(16384)) {
                    class279.method1590(var8, -13416);
                }
                var8.method2674(null, 0);
                var7.method3187(true);
                var3 = true;
            }
        }
        if (var3) {
            class98.field1215 = class309.field3938.method2639(117);
            class309.field3938.method2644(class393.field5189, 4923);
        }
        if (class445.field6138 != class532.field7483.field4966) {
            throw new RuntimeException("gnp1 pos:" + class532.field7483.field4966 + " psize:" + class445.field6138);
        }
        for (int var5 = 0; var5 < class474.field6637; var5++) {
            if (class309.field3938.method2645((long) class194.field2345[var5], (byte) -86) == null) {
                throw new RuntimeException("gnp2 pos:" + var5 + " size:" + class474.field6637);
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIFFIIFIIF[F)V")
    public abstract void method503(int arg0, int arg1, float arg2, float arg3, int arg4, int arg5, float arg6, int arg7, int arg8, float arg9, float[] arg10);
}
