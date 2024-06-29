import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class397 {

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "Lvp;")
    public static class123 field5831 = new class123(48, -1);

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Ldq;")
    public static class489 field5835 = new class489(4, 5);

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "Luu;")
    public static class187 field5830;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "Lhh;")
    public static class84 field5832;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method2471(int arg0) {
        field5832 = null;
        field5830 = null;
        if (arg0 < 14) {
            method2472(-48, -13, null);
        }
        field5835 = null;
        field5831 = null;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILqf;)V")
    public static final void method2472(int arg0, int arg1, class477 arg2) {
        field5833++;
        if (arg0 != 32) {
            field5832 = null;
        }
        boolean var3 = arg2.method2847(-75, 1) == 1;
        if (var3) {
            class515.field7572[class165.field2467++] = arg1;
        }
        int var4 = arg2.method2847(6, 2);
        class62 var5 = class390.field5783[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field1066 = false;
            } else if (class64.field1128 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class417 var6 = class518.field7618[arg1] = new class417();
                var6.field6166 = (var5.field5538 << 28) + (var5.field409[0] + class483.field7082 >> 6 << 14) + (class465.field6840 - -var5.field416[0] >> 6);
                if (var5.field1084 == -1) {
                    var6.field6160 = var5.field338.method2890((byte) -9);
                } else {
                    var6.field6160 = var5.field1084;
                }
                var6.field6162 = var5.field1102;
                var6.field6158 = var5.field355;
                if (var5.field1085 > 0) {
                    class224.method1486(var5, 97);
                }
                class390.field5783[arg1] = null;
                if (arg2.method2847(112, 1) != 0) {
                    class377.method2396((byte) -89, arg1, arg2);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method2847(arg0 - 31, 3);
            int var8 = var5.field409[0];
            int var9 = var5.field416[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var8++;
                var9--;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field1066 = true;
                var5.field1080 = var9;
                var5.field1070 = var8;
            } else {
                var5.method550(var9, -5039, var8, class133.field2063[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method2847(-59, 4);
            int var11 = var5.field409[0];
            int var12 = var5.field416[0];
            if (var10 == 0) {
                var11 -= 2;
                var12 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var11 -= 2;
                var12++;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var12 += 2;
                var11--;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var11 += 2;
                var12 += 2;
            }
            if (var3) {
                var5.field1070 = var11;
                var5.field1066 = true;
                var5.field1080 = var12;
            } else {
                var5.method550(var12, -5039, var11, class133.field2063[arg1]);
            }
        } else {
            int var13 = arg2.method2847(-91, 1);
            if (var13 == 0) {
                int var14 = arg2.method2847(104, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F3) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field409[0] + var16;
                int var19 = var5.field416[0] + var17;
                if (var3) {
                    var5.field1070 = var18;
                    var5.field1066 = true;
                    var5.field1080 = var19;
                } else {
                    var5.method550(var19, -5039, var18, class133.field2063[arg1]);
                }
                var5.field5538 = (byte) (var5.field5538 + var15 & 0x3);
                if (class64.field1128 == arg1) {
                    class434.field6317 = var5.field5538;
                }
            } else {
                int var20 = arg2.method2847(112, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field409[0] + class483.field7082 + var22 & 0x3FFF) - class483.field7082;
                int var25 = (var5.field416[0] + class465.field6840 + var23 & 0x3FFF) - class465.field6840;
                if (var3) {
                    var5.field1070 = var24;
                    var5.field1080 = var25;
                    var5.field1066 = true;
                } else {
                    var5.method550(var25, arg0 ^ 0xFFFFEC71, var24, class133.field2063[arg1]);
                }
                var5.field5538 = (byte) (var5.field5538 + var21 & 0x3);
                if (class64.field1128 == arg1) {
                    class434.field6317 = var5.field5538;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ltn;I)V")
    public static final void method2473(class58 arg0, int arg1) {
        if (arg1 <= -127) {
            field5834++;
            if (arg0.field843 == 5 && arg0.field946 != -1) {
                class68.method591((byte) 97, class394.field5821, arg0);
            }
        }
    }
}
