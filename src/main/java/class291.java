import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class291 extends class55 {

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Lef;")
    public static class489 field4160 = new class489();

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field4165 = 765;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Lhe;")
    public static class372 field4168 = new class372(8);

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public int field4157;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field4158;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public int field4159;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public int field4161;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public int field4163;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "I")
    public static int field4164;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field4166;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field4167;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public int field4169;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "I")
    public static int field4170;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "Ljava/lang/String;")
    public String field4162;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IBI)I", line = 7)
    public static final int method1859(int arg0, byte arg1, int arg2) {
        if (arg1 == -97) {
            field4164++;
            int var3 = arg0 - 1 & arg2 >> 31;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        } else {
            return 124;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 27)
    public static final void method1860(byte arg0) {
        field4167++;
        int var1 = class469.field6851.method3693(80);
        class9.field132 = class469.field6851.method3717(true);
        int var2 = class469.field6851.method3714((byte) 19);
        boolean var3 = class469.field6851.method3714((byte) 19) == 1;
        int var4 = class469.field6851.method3755(128);
        class70.method606((byte) -55);
        class389.method2499((byte) -3, var2);
        class469.field6851.method1913((byte) -127);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class194.field2946 >> 3; var20++) {
                for (int var21 = 0; var21 < (class255.field3656 >> 3); var21++) {
                    int var22 = class469.field6851.method1914(11356, 1);
                    if (var22 == 1) {
                        class504.field7161[var5][var20][var21] = class469.field6851.method1914(11356, 26);
                    } else {
                        class504.field7161[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class469.field6851.method1926((byte) 44);
        int var6 = (class228.field3361 - class469.field6851.field9084) / 16;
        class724.field10107 = new int[var6][4];
        int var7 = 0;
        if (arg0 >= -71) {
            field4165 = -49;
        }
        while (var6 > var7) {
            for (int var19 = 0; var19 < 4; var19++) {
                class724.field10107[var7][var19] = class469.field6851.method3720(-19541);
            }
            var7++;
        }
        class46.field666 = new byte[var6][];
        class324.field4628 = new byte[var6][];
        class140.field1857 = null;
        class298.field4233 = new int[var6];
        class446.field6617 = new int[var6];
        class468.field6842 = null;
        class146.field1945 = new byte[var6][];
        class642.field9002 = new int[var6];
        class434.field6462 = new int[var6];
        class606.field8557 = new int[var6];
        class502.field7147 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class194.field2946 >> 3); var10++) {
                for (int var11 = 0; var11 < (class255.field3656 >> 3); var11++) {
                    int var12 = class504.field7161[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFC9F7) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class434.field6462[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class434.field6462[var8] = var15;
                            int var17 = (var15 & 0xFF90) >> 8;
                            int var18 = var15 & 0xFF;
                            class642.field9002[var8] = class111.field1553.method217("m" + var17 + "_" + var18, (byte) -93);
                            class606.field8557[var8] = class111.field1553.method217("l" + var17 + "_" + var18, (byte) -93);
                            class298.field4233[var8] = class111.field1553.method217("um" + var17 + "_" + var18, (byte) -93);
                            class446.field6617[var8] = class111.field1553.method217("ul" + var17 + "_" + var18, (byte) -93);
                            var8++;
                        }
                    }
                }
            }
        }
        class756.method4220(var3, -26510, var4, var1, 11);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V", line = 185)
    public static void method1861(byte arg0) {
        field4168 = null;
        field4160 = null;
        if (arg0 > -23) {
            method1860((byte) 42);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)V", line = 196)
    public static final void method1862(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1012) {
            class709.method4032(class145.field1932, arg1, arg0);
        } else if (arg2 == 1007) {
            class709.method4032(class12.field175, arg1, arg0);
        } else if (arg2 == 1002) {
            class709.method4032(class144.field1909, arg1, arg0);
        } else if (arg2 == 1006) {
            class709.method4032(class131.field1761, arg1, arg0);
        } else if (arg2 == 1010) {
            class709.method4032(class63.field913, arg1, arg0);
        }
        if (arg3 >= -29) {
            method1862(30, -40, -37, 16);
        }
        field4155++;
    }
}
