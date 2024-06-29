import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class344 {

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "Z")
    public static boolean field4419 = false;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "[J")
    public static long[] field4421 = new long[32];

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lwp;")
    public static class453 field4420 = new class453(20, -1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "[I")
    public static int[] field4422;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1915(int arg0) {
        field4414++;
        class360.field4584 = class298.field3671.method3514((byte) -18);
        int var1 = class298.field3671.method3470(13111);
        int var2 = class298.field3671.method3470(arg0 + 510131028);
        boolean var3 = class298.field3671.method3501(arg0 ^ 0x1E67EC2F) == 1;
        int var4 = class298.field3671.method3514((byte) -18);
        if (arg0 != -510117917) {
            return;
        }
        class632.method3540(arg0 + 510117916);
        class592.method3251(71, var4);
        class298.field3671.method207(8);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class431.field5395 >> 3; var20++) {
                for (int var21 = 0; var21 < (class452.field5802 >> 3); var21++) {
                    int var22 = class298.field3671.method200(false, 1);
                    if (var22 == 1) {
                        class74.field1018[var5][var20][var21] = class298.field3671.method200(false, 26);
                    } else {
                        class74.field1018[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class298.field3671.method206((byte) -45);
        int var6 = (class8.field162 - class298.field3671.field8812) / 16;
        class500.field6598 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class500.field6598[var7][var19] = class298.field3671.method3483(89);
            }
        }
        class277.field3474 = null;
        class564.field7842 = new int[var6];
        class633.field8884 = new int[var6];
        class137.field1782 = new byte[var6][];
        class638.field8956 = new int[var6];
        class511.field6945 = new int[var6];
        class209.field2635 = new byte[var6][];
        class442.field5599 = new int[var6];
        class565.field7887 = null;
        class496.field6546 = new byte[var6][];
        class169.field2212 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < class431.field5395 >> 3; var10++) {
                for (int var11 = 0; var11 < class452.field5802 >> 3; var11++) {
                    int var12 = class74.field1018[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFC792) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class564.field7842[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class564.field7842[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class442.field5599[var8] = class600.field8416.method3341("m" + var17 + "_" + var18, 61);
                            class511.field6945[var8] = class600.field8416.method3341("l" + var17 + "_" + var18, arg0 + 510117847);
                            class633.field8884[var8] = class600.field8416.method3341("um" + var17 + "_" + var18, 72);
                            class638.field8956[var8] = class600.field8416.method3341("ul" + var17 + "_" + var18, -65);
                            var8++;
                        }
                    }
                }
            }
        }
        class560.method3075(11, 512, var3, var1, var2);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IZ)V", line = 162)
    public static final void method1916(int arg0, boolean arg1) {
        field4416++;
        if (!arg1) {
            method1919(90, -68, null, -96, 68, (byte) -114, 89);
        }
        class592 var2 = class61.method371(14, arg0, (byte) 113);
        var2.method3253(0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V", line = 180)
    public static void method1917(byte arg0) {
        field4421 = null;
        field4420 = null;
        if (arg0 != 126) {
            field4422 = null;
        }
        field4422 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BC)Z", line = 200)
    public static final boolean method1918(byte arg0, char arg1) {
        field4418++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        }
        if (arg0 != -53) {
            method1915(-89);
        }
        if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II[BIIBI)Z", line = 223)
    public static final boolean method1919(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte arg5, int arg6) {
        field4415++;
        if (arg5 != -69) {
            method1916(-92, true);
        }
        int var7 = arg3 % arg4;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg4 - var7;
        }
        int var9 = -((arg4 + arg1 - 1) / arg4);
        int var10 = -((arg4 + arg3 - 1) / arg4);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg6] == 0) {
                    return true;
                }
                arg6 += arg4;
            }
            int var13 = arg6 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg6 = arg0 + var13;
        }
        return false;
    }
}
