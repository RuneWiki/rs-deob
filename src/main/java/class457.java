import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class457 {

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method2624(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6499++;
        if ((class16.field131[0][arg1][arg4] & 0x2) != 0) {
            return true;
        } else if ((class16.field131[arg2][arg1][arg4] & 0x10) != 0) {
            return false;
        } else if (arg3 == class162.method878(arg2, arg4, arg1, 1)) {
            return true;
        } else if (arg0 == -25097) {
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IILce;)V")
    public static final void method2625(int arg0, int arg1, class445 arg2) {
        field6497++;
        boolean var3 = arg2.method2574(296813219, 1) == 1;
        if (arg1 > -4) {
            return;
        }
        if (var3) {
            class624.field8805[class293.field3662++] = arg0;
        }
        int var4 = arg2.method2574(296813219, 2);
        class236 var5 = class139.field1540[arg0];
        if (var4 == 0) {
            if (var3) {
                var5.field2932 = false;
            } else if (class392.field5314 == arg0) {
                throw new RuntimeException("s:lr");
            } else {
                class432 var6 = class186.field2112[arg0] = new class432();
                var6.field6117 = (class26.field245 + var5.field9517[0] >> 6 << 14) + (var5.field5166 << 28) + (var5.field9513[0] + class231.field2860 >> 6);
                if (var5.field2918 == -1) {
                    var6.field6121 = var5.field9446.method3391(97);
                } else {
                    var6.field6121 = var5.field2918;
                }
                var6.field6114 = var5.field9448;
                var6.field6115 = var5.field2895;
                if (var5.field2934 > 0) {
                    class689.method3809(true, var5);
                }
                class139.field1540[arg0] = null;
                if (arg2.method2574(296813219, 1) != 0) {
                    class181.method1100(arg2, (byte) -126, arg0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method2574(296813219, 3);
            int var8 = var5.field9517[0];
            int var9 = var5.field9513[0];
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
                var8--;
                var9++;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field2889 = var8;
                var5.field2932 = true;
                var5.field2906 = var9;
            } else {
                var5.method1413(var8, var9, 0, class649.field9141[arg0]);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method2574(296813219, 4);
            int var11 = var5.field9517[0];
            int var12 = var5.field9513[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var11--;
                var12 -= 2;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var12 -= 2;
                var11 += 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var12--;
                var11 += 2;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var12 += 2;
                var11 -= 2;
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
                var5.field2889 = var11;
                var5.field2932 = true;
                var5.field2906 = var12;
            } else {
                var5.method1413(var11, var12, 0, class649.field9141[arg0]);
            }
        } else {
            int var13 = arg2.method2574(296813219, 1);
            if (var13 == 0) {
                int var14 = arg2.method2574(296813219, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E0) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field9517[0] + var16;
                int var19 = var5.field9513[0] + var17;
                if (var3) {
                    var5.field2889 = var18;
                    var5.field2932 = true;
                    var5.field2906 = var19;
                } else {
                    var5.method1413(var18, var19, 0, class649.field9141[arg0]);
                }
                var5.field5166 = var5.field5169 = (byte) (var5.field5166 + var15 & 0x3);
                if (class568.method3221(var19, var18, 0)) {
                    var5.field5169++;
                }
                if (class392.field5314 == arg0) {
                    class169.field1888 = var5.field5166;
                }
            } else {
                int var20 = arg2.method2574(296813219, 30);
                int var21 = var20 >> 28;
                int var22 = (var20 & 0xFFFC856) >> 14;
                int var23 = var20 & 0x3FFF;
                int var24 = (class26.field245 + var22 + var5.field9517[0] & 0x3FFF) - class26.field245;
                int var25 = (var5.field9513[0] - (-class231.field2860 - var23) & 0x3FFF) - class231.field2860;
                if (var3) {
                    var5.field2889 = var24;
                    var5.field2932 = true;
                    var5.field2906 = var25;
                } else {
                    var5.method1413(var24, var25, 0, class649.field9141[arg0]);
                }
                var5.field5166 = var5.field5169 = (byte) (var5.field5166 + var21 & 0x3);
                if (class568.method3221(var25, var24, 0)) {
                    var5.field5169++;
                }
                if (class392.field5314 == arg0) {
                    class169.field1888 = var5.field5166;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(BI[F)[F")
    public static final float[] method2626(byte arg0, int arg1, float[] arg2) {
        int var3 = -26 / ((arg0 + 39) / 40);
        field6498++;
        float[] var4 = new float[arg1];
        class567.method3214(arg2, 0, var4, 0, arg1);
        return var4;
    }
}
