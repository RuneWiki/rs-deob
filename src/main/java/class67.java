import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class67 extends class151 {

    @OriginalMember(owner = "client!v", name = "N", descriptor = "[I")
    private final int[] field1175 = new int[this.field2587];

    @OriginalMember(owner = "client!v", name = "G", descriptor = "Lgb;")
    public static class158 field1168 = new class158(64);

    @OriginalMember(owner = "client!v", name = "O", descriptor = "Lwa;")
    private static class75 field1176 = class66.method560("Please wait)3)3)3", false);

    @OriginalMember(owner = "client!v", name = "P", descriptor = "Lwa;")
    public static class75 field1177 = field1176;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "Lmc;")
    public static class170 field1173 = new class170();

    @OriginalMember(owner = "client!v", name = "v", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!v", name = "w", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!v", name = "x", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!v", name = "y", descriptor = "I")
    private int field1160;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field1162;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field1164;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "I")
    public static int field1165;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field1167;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    private int field1169;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!v", name = "I", descriptor = "[B")
    private byte[] field1170;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "[I")
    public static int[] field1178;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V", line = 4)
    public static void method563(byte arg0) {
        field1173 = null;
        if (arg0 != -12) {
            method572(-91, (byte) -107);
        }
        field1178 = null;
        field1177 = null;
        field1176 = null;
        field1168 = null;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V", line = 18)
    public final void method564(byte arg0) {
        this.field1169 = 0;
        if (arg0 == -31) {
            field1162++;
            this.field1160 = 0;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II)Lwa;", line = 35)
    public static final class75 method565(int arg0, int arg1) {
        field1158++;
        if (arg0 <= 29) {
            method569(46, -81);
        }
        return class205.method1521(false, 10, (byte) 45, arg1);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIZ)Lwa;", line = 56)
    public static final class75 method566(int arg0, int arg1, boolean arg2) {
        field1163++;
        if (arg1 > 0) {
            field1178 = (int[]) null;
        }
        return class205.method1521(arg2, 10, (byte) 45, arg0);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)Lwa;", line = 69)
    public static final class75 method567(int arg0, byte arg1) {
        field1161++;
        if (arg1 > -31) {
            return (class75) null;
        } else if (arg0 < 999999999) {
            return method565(69, arg0);
        } else {
            return class300.field5130;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IBI)V", line = 91)
    public static final void method568(int arg0, byte arg1, int arg2) {
        class52.field859++;
        class89.field1470.method87(65280, 60);
        if (arg1 != 59) {
            method566(93, 79, true);
        }
        class89.field1470.method510(arg0, 57);
        field1159++;
        class89.field1470.method503(arg1 ^ 0xDC5D1AF3, arg2);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V", line = 112)
    public static final void method569(int arg0, int arg1) {
        if (arg0 > -14) {
            method574((byte) 32);
        }
        field1172++;
        class66.field1145.method1199(arg1, 127);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI)V", line = 123)
    public final void method570(int arg0, byte arg1, int arg2) {
        this.field1160 += this.field1175[arg2] * arg0 >> 12;
        if (arg1 != -109) {
            field1177 = (class75) null;
        }
        field1166++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZB)V", line = 138)
    public static final void method571(boolean arg0, byte arg1) {
        field1165++;
        byte[][] var2;
        byte var3;
        if (arg0) {
            var2 = class294.field5055;
            var3 = 1;
        } else {
            var2 = class109.field1876;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class54.method393((byte) 43);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class259.field4338[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = var7 >> 24 & 0x3;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 3 & 0x7FF;
                            int var11 = (var7 & 0xFFC75C) >> 14;
                            int var12 = (var11 / 8 << 8) + var10 / 8;
                            for (int var13 = 0; var13 < class288.field4952.length; var13++) {
                                if (class288.field4952[var13] == var12 && var2[var13] != null) {
                                    class108.method848(var9, var6 * 8, var2[var13], var8, class286.field4931, arg0, (var11 & 0x7) * 8, (var10 & 0x7) * 8, var5 * 8, var4, 0);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 86) {
            field1176 = (class75) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IB)V", line = 220)
    public static final void method572(int arg0, byte arg1) {
        class41.field655.method1199(arg0, 120);
        field1167++;
        if (arg1 >= -60) {
            method568(5, (byte) 93, 15);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(I)V", line = 231)
    public final void method573(int arg0) {
        field1157++;
        this.field1160 = Math.abs(this.field1160);
        if (this.field1160 >= 4096) {
            this.field1160 = 4095;
        }
        this.method575(this.field1169++, (byte) (this.field1160 >> 4));
        this.field1160 = arg0;
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V", line = 245)
    public static final void method574(byte arg0) {
        if (class35.field513 != null) {
            class35.field513.method2048((byte) -85);
            class35.field513 = null;
        }
        field1164++;
        class182.method1342(-123);
        class301.method2069();
        for (int var1 = 0; var1 < 4; var1++) {
            class286.field4931[var1].method815(64);
        }
        class115.method881(0);
        System.gc();
        class39.method266((byte) -120, 2);
        class163.field2780 = -1;
        class283.field4886 = false;
        class31.method211((byte) 44, true);
        class275.field4737 = 0;
        class175.field2939 = 0;
        class151.field2605 = false;
        for (int var2 = 0; var2 < class219.field3747.length; var2++) {
            class219.field3747[var2] = null;
        }
        class229.field3894 = 0;
        class121.field2031 = 0;
        int var3 = 0;
        if (arg0 < 118) {
            return;
        }
        while (var3 < 2048) {
            class169.field2842[var3] = null;
            class48.field786[var3] = null;
            var3++;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class35.field521[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class130.field2245[var5][var6][var7] = null;
                }
            }
        }
        class89.method707(16384);
        class260.field4354 = 0;
        class199.method1489(-1914002714);
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(IIIIIF)V", line = 339)
    public class67(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2587; var7++) {
            this.field1175[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(IB)V", line = 360)
    public void method575(int arg0, byte arg1) {
        this.field1170[this.field1169++] = (byte) ((class235.method1710(arg1, 255) >> 1) + 127);
        field1171++;
    }
}
