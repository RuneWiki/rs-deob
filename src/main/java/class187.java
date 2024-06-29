import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class187 {

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "[Lmh;")
    public static class454[] field2691 = new class454[14];

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field2693 = 0;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!mm", name = "g", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIILza;)V", line = 4)
    public static final void method1187(int arg0, int arg1, int arg2, int arg3, int arg4, class290 arg5) {
        arg5.method301(arg4, arg2, arg4 + arg0, arg2 + arg3);
        field2694++;
        arg5.method1794(arg0, arg2, -16777216, arg3, 97, arg4);
        if (arg1 != 5578) {
            field2691 = null;
        }
        if (class433.field6100 < 100) {
            return;
        }
        float var6 = (float) class245.field3571 / (float) class245.field3582;
        int var7 = arg0;
        int var8 = arg3;
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg0 * var6);
        } else {
            var7 = (int) ((float) arg3 / var6);
        }
        int var9 = (arg3 - var8) / 2 + arg2;
        int var10 = (arg0 - var7) / 2 + arg4;
        if (class179.field2572 == null || arg0 != class179.field2572.method146() || class179.field2572.method155() != arg3) {
            class245.method1551(class245.field3574, class245.field3586 + class245.field3571, class245.field3582 + class245.field3574, class245.field3586, var10, var9, var10 + var7, var8 + var9);
            class245.method1553(arg5);
            class179.field2572 = arg5.method307(var10, var9, var7, var8, false);
        }
        class179.field2572.method151(var10, var9);
        int var11 = class476.field6634 * var7 / class245.field3582;
        int var12 = class97.field1276 * var8 / class245.field3571;
        int var13 = class540.field7898 * var7 / class245.field3582 + var10;
        int var14 = var8 + var9 - (class108.field1486 * var8 / class245.field3571) - var12;
        int var15 = -1996554240;
        if (class71.field886 == class246.field3594) {
            var15 = -1996488705;
        }
        arg5.method325(var13, var14, var11, var12, var15, 1);
        arg5.method288(var13, var14, var11, var12, var15, 0);
        if (class367.field5246 <= 0) {
            return;
        }
        int var16;
        if (class515.field7594 > 50) {
            var16 = 500 - (class515.field7594 * 5);
        } else {
            var16 = class515.field7594 * 5;
        }
        for (class216 var17 = (class216) class245.field3560.method2655(15152); var17 != null; var17 = (class216) class245.field3560.method2660((byte) 67)) {
            class156 var18 = class245.field3553.method1316((byte) -68, var17.field3126);
            if (class511.method3050(var18, (byte) 54)) {
                if (class205.field2969 == var17.field3126) {
                    int var19 = var17.field3122 * var7 / class245.field3582 + var10;
                    int var20 = (class245.field3571 - var17.field3121) * var8 / class245.field3571 + var9;
                    arg5.method1794(4, var20 - 2, var16 << 24 | 0xFFFF00, 4, 92, var19 - 2);
                } else if (class163.field2416 != -1 && class163.field2416 == var18.field2332) {
                    int var21 = var17.field3122 * var7 / class245.field3582 + var10;
                    int var22 = var9 + ((class245.field3571 - var17.field3121) * var8 / class245.field3571);
                    arg5.method1794(4, var22 - 2, var16 << 24 | 0xFFFF00, 4, arg1 ^ 0x15A7, var21 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V", line = 99)
    public static void method1188(byte arg0) {
        field2691 = null;
        if (arg0 <= 51) {
            method1187(-68, 69, 3, -95, -119, null);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V", line = 112)
    public static final void method1189(int arg0, int arg1) {
        field2695++;
        class45 var2 = class354.method2094(arg1, (byte) -42, 14);
        int var3 = -95 % ((-arg0 - 34) / 38);
        var2.method261(4);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lhm;I)V", line = 126)
    public static final void method1190(class150 arg0, int arg1) {
        field2690++;
        if (class323.field4722 == arg0.field1987) {
            class306.field4450[arg0.field2145] = true;
        }
        if (arg1 <= 95) {
            field2692 = 28;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V", line = 147)
    public static final void method1191(int arg0) {
        field2689++;
        int var1 = class264.field3874.method2380(199752600);
        class279.field4128 = class264.field3874.method2357((byte) 126);
        int var2 = class264.field3874.method2361(arg0 + 4867);
        boolean var3 = class264.field3874.method2370((byte) 41) == 1;
        int var4 = class264.field3874.method2380(arg0 ^ 0xF4181664);
        class9.method57(-39);
        class54.method458((byte) -77, var2);
        class264.field3874.method1515(-2044015643);
        if (arg0 != -4612) {
            field2691 = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class43.field494 >> 3; var20++) {
                for (int var21 = 0; var21 < class500.field7068 >> 3; var21++) {
                    int var22 = class264.field3874.method1520(-12494, 1);
                    if (var22 == 1) {
                        class292.field4265[var5][var20][var21] = class264.field3874.method1520(-12494, 26);
                    } else {
                        class292.field4265[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class264.field3874.method1514(false);
        int var6 = (class190.field2715 - class264.field3874.field5665) / 16;
        class326.field4755 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class326.field4755[var7][var19] = class264.field3874.method2319((byte) 113);
            }
        }
        class498.field7054 = null;
        class104.field1371 = new byte[var6][];
        class85.field1066 = null;
        class422.field5944 = new int[var6];
        class236.field3434 = new int[var6];
        class45.field519 = new int[var6];
        class518.field7630 = new byte[var6][];
        class502.field7100 = new byte[var6][];
        class332.field4827 = new int[var6];
        class196.field2778 = new byte[var6][];
        class414.field5848 = new int[var6];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class43.field494 >> 3); var10++) {
                for (int var11 = 0; var11 < class500.field7068 >> 3; var11++) {
                    int var12 = class292.field4265[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = var12 >> 14 & 0x3FF;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class332.field4827[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class332.field4827[var8] = var15;
                            int var17 = (var15 & 0xFF38) >> 8;
                            int var18 = var15 & 0xFF;
                            class422.field5944[var8] = class189.field2710.method429("m" + var17 + "_" + var18, -1);
                            class45.field519[var8] = class189.field2710.method429("l" + var17 + "_" + var18, arg0 + 4611);
                            class414.field5848[var8] = class189.field2710.method429("um" + var17 + "_" + var18, -1);
                            class236.field3434[var8] = class189.field2710.method429("ul" + var17 + "_" + var18, -1);
                            var8++;
                        }
                    }
                }
            }
        }
        class335.method2003(10, -11, var4, var3, var1);
    }
}
