import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class481 extends class467 {

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "Lvr;")
    public class306 field7021 = new class306();

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "[[I")
    public static int[][] field7017 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "Lcm;")
    public static class449 field7015 = new class449(22, -1);

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field7016;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field7018;

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "I")
    public static int field7019;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field7020;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V", line = 5)
    public static void method2875(byte arg0) {
        if (arg0 < 110) {
            field7015 = null;
        }
        field7017 = null;
        field7015 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V", line = 16)
    public static final void method2876(int arg0, short[] arg1, String[] arg2, int arg3, int arg4) {
        if (arg3 != 2) {
            return;
        }
        if (arg0 < arg4) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            short var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            for (int var9 = arg0; var9 < arg4; var9++) {
                if (var7 == null || arg2[var9] != null && (var9 & 0x1) > arg2[var9].compareTo(var7)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg1[var9];
                    arg1[var9] = arg1[var6];
                    arg1[var6++] = var11;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method2876(arg0, arg1, arg2, arg3, var6 - 1);
            method2876(var6 + 1, arg1, arg2, arg3, arg4);
        }
        field7016++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(III)V", line = 70)
    public static final void method2877(int arg0, int arg1, int arg2) {
        field7018++;
        class377 var3 = class99.method672(arg2, false, 16);
        var3.method2340((byte) 127);
        if (arg1 == 2) {
            var3.field5763 = arg0;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(B)I", line = 84)
    public static final int method2878(byte arg0) {
        if (arg0 < 29) {
            return -53;
        } else {
            field7020++;
            return 2;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 100)
    public static final void method2879(int arg0) {
        class51.field683 = class486.field7134.method583(false);
        field7019++;
        if (arg0 != 1) {
            field7015 = null;
        }
        int var1 = class486.field7134.method636(arg0 - 3);
        int var2 = class486.field7134.method631(10494);
        boolean var3 = class486.field7134.method618((byte) 100) == 1;
        int var4 = class486.field7134.method631(10494);
        class38.method272(var1, (byte) 77);
        class486.field7134.method2077(8);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class96.field1403 >> 3); var20++) {
                for (int var21 = 0; var21 < class485.field7122 >> 3; var21++) {
                    int var22 = class486.field7134.method2084((byte) -118, 1);
                    if (var22 == 1) {
                        class501.field7483[var5][var20][var21] = class486.field7134.method2084((byte) -118, 26);
                    } else {
                        class501.field7483[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class486.field7134.method2085(7);
        int var6 = (class461.field6755 - class486.field7134.field1292) / 16;
        class215.field2992 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class215.field2992[var7][var19] = class486.field7134.method626((byte) 100);
            }
        }
        class219.field3077 = new byte[var6][];
        class471.field6894 = new int[var6];
        class334.field5157 = new int[var6];
        class253.field3509 = new int[var6];
        class38.field612 = new int[var6];
        class65.field901 = new int[var6];
        class270.field3763 = null;
        class107.field1508 = new byte[var6][];
        class287.field4285 = null;
        class388.field5893 = new byte[var6][];
        class310.field4643 = new byte[var6][];
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class96.field1403 >> 3); var10++) {
                for (int var11 = 0; var11 < class485.field7122 >> 3; var11++) {
                    int var12 = class501.field7483[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFF328) >> 14;
                        int var14 = (var12 & 0x3FFF) >> 3;
                        int var15 = (var13 / 8 << 8) + var14 / 8;
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class253.field3509[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class253.field3509[var8] = var15;
                            int var17 = (var15 & 0xFFCE) >> 8;
                            int var18 = var15 & 0xFF;
                            class471.field6894[var8] = class255.field3538.method2652("m" + var17 + "_" + var18, -114);
                            class65.field901[var8] = class255.field3538.method2652("l" + var17 + "_" + var18, arg0 + 80);
                            class38.field612[var8] = class255.field3538.method2652("um" + var17 + "_" + var18, 86);
                            class334.field5157[var8] = class255.field3538.method2652("ul" + var17 + "_" + var18, class41.method323(arg0, -60));
                            var8++;
                        }
                    }
                }
            }
        }
        class190.method1327((byte) -62, var2, false, var3, var4);
    }
}
