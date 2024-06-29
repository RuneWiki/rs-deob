import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class322 {

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "[[I")
    public static int[][] field4390 = new int[6][];

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Ldi;")
    public static class83 field4392 = new class83(56, 7);

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field4389;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "[[B")
    public static byte[][] field4391;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method1864(int arg0) {
        if (arg0 >= -1) {
            method1865((byte) -87, -3, null);
        }
        field4392 = null;
        field4390 = null;
        field4391 = null;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(BILvc;)V")
    public static final void method1865(byte arg0, int arg1, class207 arg2) {
        field4393++;
        boolean var3 = arg2.method1282(-26364, 1) == 1;
        if (var3) {
            class421.field6159[class292.field4039++] = arg1;
        }
        int var4 = arg2.method1282(-26364, 2);
        class438 var5 = class12.field182[arg1];
        if (arg0 != -83) {
            return;
        }
        if (var4 == 0) {
            if (var3) {
                var5.field6409 = false;
            } else if (class152.field2335 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class186 var6 = class455.field6688[arg1] = new class186();
                var6.field2697 = (var5.field1117[0] + class14.field204 >> 6) + (var5.field1127[0] + class510.field7566 >> 6 << 14) + (var5.field1738 << 28);
                if (var5.field6403 == -1) {
                    var6.field2705 = var5.field1085.method701((byte) 17);
                } else {
                    var6.field2705 = var5.field6403;
                }
                var6.field2699 = var5.field1069;
                var6.field2701 = var5.field6413;
                if (var5.field6427 > 0) {
                    class61.method506(var5, 16);
                }
                class12.field182[arg1] = null;
                if (arg2.method1282(-26364, 1) != 0) {
                    class289.method1722(arg2, 32402, arg1);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1282(-26364, 3);
            int var8 = var5.field1127[0];
            int var9 = var5.field1117[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
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
                var8++;
                var9++;
            }
            if (var3) {
                var5.field6423 = var8;
                var5.field6408 = var9;
                var5.field6409 = true;
            } else {
                var5.method2576(var9, var8, class413.field6033[arg1], (byte) -111);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1282(arg0 ^ 0x66A9, 4);
            int var11 = var5.field1127[0];
            int var12 = var5.field1117[0];
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
                var12 -= 2;
                var11 += 2;
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
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var12 += 2;
                var11++;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field6408 = var12;
                var5.field6423 = var11;
                var5.field6409 = true;
            } else {
                var5.method2576(var12, var11, class413.field6033[arg1], (byte) 102);
            }
        } else {
            int var13 = arg2.method1282(-26364, 1);
            if (var13 == 0) {
                int var14 = arg2.method1282(-26364, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3E9) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1127[0] + var16;
                int var19 = var5.field1117[0] + var17;
                if (var3) {
                    var5.field6408 = var19;
                    var5.field6423 = var18;
                    var5.field6409 = true;
                } else {
                    var5.method2576(var19, var18, class413.field6033[arg1], (byte) -111);
                }
                var5.field1738 = (byte) (var5.field1738 + var15 & 0x3);
                if (class152.field2335 == arg1) {
                    class436.field6379 = var5.field1738;
                }
            } else {
                int var20 = arg2.method1282(-26364, 30);
                int var21 = var20 >> 28;
                int var22 = var20 >> 14 & 0x3FFF;
                int var23 = var20 & 0x3FFF;
                int var24 = (var5.field1127[0] + var22 + class510.field7566 & 0x3FFF) - class510.field7566;
                int var25 = (var5.field1117[0] + class14.field204 + var23 & 0x3FFF) - class14.field204;
                if (var3) {
                    var5.field6408 = var25;
                    var5.field6423 = var24;
                    var5.field6409 = true;
                } else {
                    var5.method2576(var25, var24, class413.field6033[arg1], (byte) 2);
                }
                var5.field1738 = (byte) (var5.field1738 + var21 & 0x3);
                if (class152.field2335 == arg1) {
                    class436.field6379 = var5.field1738;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(ILem;II)V")
    public static final void method1866(int arg0, class150 arg1, int arg2, int arg3) {
        field4389++;
        class147.field2135 = arg3;
        class441.field6515 = arg1;
        class531.field7825 = arg0;
        if (arg2 != -5386) {
            method1864(36);
        }
    }
}
