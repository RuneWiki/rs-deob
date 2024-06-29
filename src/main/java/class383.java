import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class383 {

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lus;")
    public static class328 field5333 = new class328(17, 4);

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lmq;")
    public static class78 field5334 = new class78(52, 2);

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "[I")
    public static int[] field5335;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(CI)C")
    public static final char method2303(char arg0, int arg1) {
        field5331++;
        if ((char) arg1 == arg0) {
            return 'E';
        } else if (arg0 == 'æ') {
            return 'e';
        } else if (arg0 == 'ß') {
            return 's';
        } else if (arg0 == 'Œ') {
            return 'E';
        } else {
            return (char) (arg0 == 'œ' ? 'e' : '\u0000');
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ldfa;IB)V")
    public static final void method2304(class757 arg0, int arg1, byte arg2) {
        field5332++;
        boolean var3 = arg0.method4206(1, -75) == 1;
        if (var3) {
            class199.field2549[class2.field8++] = arg1;
        }
        int var4 = -67 / ((arg2 - 47) / 36);
        int var5 = arg0.method4206(2, 121);
        class546 var6 = class447.field6287[arg1];
        if (var5 == 0) {
            if (var3) {
                var6.field7673 = false;
            } else if (class456.field6387 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class53 var7 = class16.field225[arg1] = new class53();
                var7.field777 = (var6.field5779 << 28) - (-(var6.field435[0] + class63.field851 >> 6 << 14) - (var6.field426[0] + class753.field10509 >> 6));
                if (var6.field7703 == -1) {
                    var7.field776 = var6.field336.method2948(25160);
                } else {
                    var7.field776 = var6.field7703;
                }
                var7.field774 = var6.field407;
                var7.field778 = var6.field7677;
                if (var6.field7676 > 0) {
                    class680.method3652(false, var6);
                }
                class447.field6287[arg1] = null;
                if (arg0.method4206(1, -7) != 0) {
                    class553.method3149(arg0, -105, arg1);
                }
            }
        } else if (var5 == 1) {
            int var8 = arg0.method4206(3, -79);
            int var9 = var6.field435[0];
            int var10 = var6.field426[0];
            if (var8 == 0) {
                var9--;
                var10--;
            } else if (var8 == 1) {
                var10--;
            } else if (var8 == 2) {
                var9++;
                var10--;
            } else if (var8 == 3) {
                var9--;
            } else if (var8 == 4) {
                var9++;
            } else if (var8 == 5) {
                var9--;
                var10++;
            } else if (var8 == 6) {
                var10++;
            } else if (var8 == 7) {
                var9++;
                var10++;
            }
            if (var3) {
                var6.field7694 = var9;
                var6.field7673 = true;
                var6.field7669 = var10;
            } else {
                var6.method3097(125, var10, class664.field9089[arg1], var9);
            }
        } else if (var5 == 2) {
            int var11 = arg0.method4206(4, -46);
            int var12 = var6.field435[0];
            int var13 = var6.field426[0];
            if (var11 == 0) {
                var12 -= 2;
                var13 -= 2;
            } else if (var11 == 1) {
                var12--;
                var13 -= 2;
            } else if (var11 == 2) {
                var13 -= 2;
            } else if (var11 == 3) {
                var13 -= 2;
                var12++;
            } else if (var11 == 4) {
                var12 += 2;
                var13 -= 2;
            } else if (var11 == 5) {
                var13--;
                var12 -= 2;
            } else if (var11 == 6) {
                var13--;
                var12 += 2;
            } else if (var11 == 7) {
                var12 -= 2;
            } else if (var11 == 8) {
                var12 += 2;
            } else if (var11 == 9) {
                var12 -= 2;
                var13++;
            } else if (var11 == 10) {
                var12 += 2;
                var13++;
            } else if (var11 == 11) {
                var12 -= 2;
                var13 += 2;
            } else if (var11 == 12) {
                var12--;
                var13 += 2;
            } else if (var11 == 13) {
                var13 += 2;
            } else if (var11 == 14) {
                var12++;
                var13 += 2;
            } else if (var11 == 15) {
                var12 += 2;
                var13 += 2;
            }
            if (var3) {
                var6.field7673 = true;
                var6.field7694 = var12;
                var6.field7669 = var13;
            } else {
                var6.method3097(91, var13, class664.field9089[arg1], var12);
            }
        } else {
            int var14 = arg0.method4206(1, -100);
            if (var14 == 0) {
                int var15 = arg0.method4206(12, -111);
                int var16 = var15 >> 10;
                int var17 = (var15 & 0x3F7) >> 5;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var15 & 0x1F;
                if (var18 > 15) {
                    var18 -= 32;
                }
                int var19 = var6.field435[0] + var17;
                int var20 = var6.field426[0] + var18;
                if (var3) {
                    var6.field7694 = var19;
                    var6.field7669 = var20;
                    var6.field7673 = true;
                } else {
                    var6.method3097(115, var20, class664.field9089[arg1], var19);
                }
                var6.field5779 = var6.field5792 = (byte) (var6.field5779 + var16 & 0x3);
                if (class739.method4140((byte) 84, var20, var19)) {
                    var6.field5792++;
                }
                if (class456.field6387 == arg1) {
                    if (class223.field2946 != var6.field5779) {
                        class571.field7967 = true;
                    }
                    class223.field2946 = var6.field5779;
                }
            } else {
                int var21 = arg0.method4206(30, -128);
                int var22 = var21 >> 28;
                int var23 = var21 >> 14 & 0x3FFF;
                int var24 = var21 & 0x3FFF;
                int var25 = (var6.field435[0] + class63.field851 + var23 & 0x3FFF) - class63.field851;
                int var26 = (var6.field426[0] + class753.field10509 + var24 & 0x3FFF) - class753.field10509;
                if (var3) {
                    var6.field7694 = var25;
                    var6.field7669 = var26;
                    var6.field7673 = true;
                } else {
                    var6.method3097(111, var26, class664.field9089[arg1], var25);
                }
                var6.field5779 = var6.field5792 = (byte) (var6.field5779 + var22 & 0x3);
                if (class739.method4140((byte) 100, var26, var25)) {
                    var6.field5792++;
                }
                if (class456.field6387 == arg1) {
                    class223.field2946 = var6.field5779;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Z)V")
    public static void method2305(boolean arg0) {
        if (arg0) {
            field5335 = null;
        }
        field5333 = null;
        field5335 = null;
        field5334 = null;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)I")
    public static final int method2306(int arg0) {
        field5330++;
        class454 var1 = class458.field6407;
        boolean var2 = false;
        if (class223.field2944.field633.method4191((byte) -126) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class522.method3004(null, (byte) 32, null, 0, var3, 0);
            var2 = true;
        }
        if (arg0 != -7304) {
            field5333 = null;
        }
        long var4 = class97.method654((byte) 87);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method67(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class97.method654((byte) 66) - var4);
        var1.method2668(0, false, 100, 100, 0, -16777216);
        if (var2) {
            var1.method2658(-127);
        }
        return var7;
    }
}
