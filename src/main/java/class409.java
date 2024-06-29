import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class409 extends class598 {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "[I")
    public int[] field5466;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "[I")
    public int[] field5467;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field5469 = 0;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field5464;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lfg;")
    public static class174 field5465;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method2290(int arg0) {
        if (arg0 != 0) {
            method2291(-41);
        }
        field5465 = null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static final void method2291(int arg0) {
        field5464++;
        int var1 = class626.field8849.method649(255);
        int var2 = class626.field8849.method623(-99);
        int var3 = class626.field8849.method650((byte) -87);
        class247.field3061 = class626.field8849.method649(255);
        if (arg0 <= 54) {
            method2292(103, 98, (byte) 13);
        }
        boolean var4 = class626.field8849.method651((byte) -101) == 1;
        class660.method3665(-1);
        class531.method2980(var1, 4);
        class626.field8849.method2575(0);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class142.field1574 >> 3; var20++) {
                for (int var21 = 0; var21 < class140.field1550 >> 3; var21++) {
                    int var22 = class626.field8849.method2574(296813219, 1);
                    if (var22 == 1) {
                        class687.field9668[var5][var20][var21] = class626.field8849.method2574(296813219, 26);
                    } else {
                        class687.field9668[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class626.field8849.method2583((byte) -58);
        int var6 = (class257.field3209 - class626.field8849.field1218) / 16;
        class80.field835 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class80.field835[var7][var19] = class626.field8849.method631(false);
            }
        }
        class222.field2746 = new byte[var6][];
        class383.field5177 = new int[var6];
        class400.field5385 = new byte[var6][];
        class314.field3909 = null;
        class306.field3784 = new int[var6];
        class212.field2576 = new int[var6];
        class254.field3181 = null;
        class248.field3079 = new byte[var6][];
        class684.field9647 = new int[var6];
        class676.field9404 = new int[var6];
        class338.field4249 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class142.field1574 >> 3); var10++) {
                for (int var11 = 0; var11 < (class140.field1550 >> 3); var11++) {
                    int var12 = class687.field9668[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class306.field3784[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class306.field3784[var8] = var15;
                            int var17 = (var15 & 0xFFE3) >> 8;
                            int var18 = var15 & 0xFF;
                            class383.field5177[var8] = class280.field3475.method3875("m" + var17 + "_" + var18, (byte) -90);
                            class684.field9647[var8] = class280.field3475.method3875("l" + var17 + "_" + var18, (byte) -72);
                            class212.field2576[var8] = class280.field3475.method3875("um" + var17 + "_" + var18, (byte) -99);
                            class676.field9404[var8] = class280.field3475.method3875("ul" + var17 + "_" + var18, (byte) -100);
                            var8++;
                        }
                    }
                }
            }
        }
        class256.method1517((byte) 39, 11, var3, var4, var2);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2292(int arg0, int arg1, byte arg2) {
        if (arg2 != -98) {
            method2291(-52);
        }
        field5468++;
        return (arg1 & 0x800) != 0 | class691.method3813(arg1, -103, arg0) || class154.method835(arg1, arg0, 55);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(II[I[I)V")
    public class409(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field5466 = arg2;
        this.field5467 = arg3;
    }
}
