import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class74 {

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[I")
    private int[] field1167;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field1173 = 2;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field1172 = -1;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field1176 = -1;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II[Lmh;)V")
    public static final void method553(int arg0, int arg1, class263[] arg2) {
        field1175++;
        for (int var3 = arg0; var3 < arg2.length; var3++) {
            class263 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4129 == 0) {
                    if (var4.field4143 != null) {
                        method553(arg0, arg1, var4.field4143);
                    }
                    class133 var5 = (class133) class251.field3793.method1073(-1, (long) var4.field4083);
                    if (var5 != null) {
                        class16.method108(arg0 - 93, var5.field2187, arg1);
                    }
                }
                if (arg1 == 0 && var4.field4080 != null) {
                    class234 var6 = new class234();
                    var6.field3419 = var4.field4080;
                    var6.field3423 = var4;
                    class224.method1557((byte) 96, var6);
                }
                if (arg1 == 1 && var4.field4138 != null) {
                    if (var4.field4145 >= 0) {
                        class263 var7 = class144.method1078(var4.field4083, arg0 ^ 0x2156);
                        if (var7 == null || var7.field4143 == null || var7.field4143.length <= var4.field4145 || var7.field4143[var4.field4145] != var4) {
                            continue;
                        }
                    }
                    class234 var8 = new class234();
                    var8.field3423 = var4;
                    var8.field3419 = var4.field4138;
                    class224.method1557((byte) 74, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Laf;")
    public static final class176 method554(boolean arg0) {
        field1164++;
        if (arg0) {
            return null;
        } else {
            class176 var1 = new class176(class250.field3792, class19.field202, class32.field399[0], class297.field4765[0], class165.field2534[0], class283.field4559[0], class280.field4506[0], class53.field748);
            class137.method1032(-102);
            return var1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static final void method555(int arg0) {
        field1166++;
        while (class102.field1736 >= 2048.0F) {
            class102.field1736 -= 2048.0F;
        }
        if (class180.field2705 < 128.0F) {
            class180.field2705 = 128.0F;
        }
        while (class102.field1736 < 0.0F) {
            class102.field1736 += 2048.0F;
        }
        int var1 = class160.field2487 >> 7;
        if (class180.field2705 > 383.0F) {
            class180.field2705 = 383.0F;
        }
        int var2 = class276.field4466 >> 7;
        int var3 = class113.method851(class37.field474, arg0 + 105, class276.field4466, class160.field2487);
        int var4 = 0;
        if (arg0 != -1) {
            field1165 = 87;
        }
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= var2 + 4; var6++) {
                    int var7 = class37.field474;
                    if (var7 < 3 && (class253.field3806[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class26.field286[var7][var5][var6] & 0xFF) * 8 + var3 - class103.field1792[var7][var5][var6];
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class298.field4777) {
            class298.field4777 += (var9 - class298.field4777) / 24;
        } else if (var9 < class298.field4777) {
            class298.field4777 += (var9 - class298.field4777) / 80;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "([I)V")
    public class74(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field1167 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field1167[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field1167[var5 - (-var5 - 1)] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field1167[var5 + var5] = arg0[var4];
            this.field1167[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)I")
    public final int method556(int arg0, byte arg1) {
        int var3 = (this.field1167.length >> 1) - 1;
        if (arg1 != 10) {
            return -34;
        }
        field1171++;
        int var4 = arg0 & var3;
        while (true) {
            int var5 = this.field1167[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field1167[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)Lle;")
    public static final class123 method557(int arg0, int arg1) {
        field1168++;
        class123 var2 = (class123) class305.field4930.method2099((byte) 125, (long) arg1);
        if (arg0 != 3) {
            field1172 = -76;
        }
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class135.field2207.method1868(arg1, 26, 1);
        class123 var4 = new class123();
        if (var3 != null) {
            var4.method949(-25329, new class53(var3));
        }
        class305.field4930.method2103(var4, -1, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
    public static final void method558(boolean arg0, boolean arg1) {
        field1170++;
        byte var2 = 4;
        byte[][] var3 = class170.field2576;
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class52.method316((byte) -104);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    int var8 = class49.field683[var5][var6][var7];
                    boolean var9 = false;
                    if (var8 != -1) {
                        int var10 = var8 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var8 & 0x7) >> 1;
                            int var12 = var8 >> 14 & 0x3FF;
                            int var13 = var8 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class53.field768.length; var15++) {
                                if (class53.field768[var15] == var14 && var3[var15] != null) {
                                    int[] var16 = class91.method685(var7 * 8, var13, var6 * 8, arg0, var5, var12, var10, var11, var3[var15], 8, class235.field3431);
                                    var9 = true;
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var9) {
                        class295.method2007(false, var5, var6 * 8, 8, var7 * 8, 8);
                    }
                }
            }
        }
        if (!arg1) {
            return;
        }
        if (var4 == null) {
            class247.field3654 = -1;
            return;
        }
        class158.field2462 = var4[4];
        class82.field1325 = var4[1];
        class73.field1144 = var4[3];
        class247.field3654 = var4[0];
        field1165 = var4[2];
    }
}
