import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class188 extends class107 {

    @OriginalMember(owner = "client!am", name = "G", descriptor = "[I")
    public static int[] field3082 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!am", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3083 = new String[500];

    @OriginalMember(owner = "client!am", name = "K", descriptor = "[S")
    public static short[] field3086 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!am", name = "J", descriptor = "[I")
    public static int[] field3085 = new int[50];

    @OriginalMember(owner = "client!am", name = "S", descriptor = "Ljava/lang/String;")
    public static String field3094 = "Prepared sound engine";

    @OriginalMember(owner = "client!am", name = "R", descriptor = "I")
    public static int field3093 = 2;

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field3095 = 0;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    private int field3080;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!am", name = "I", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    private int field3087;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILrk;IILrg;II)V")
    public static final void method1325(int arg0, class292 arg1, int arg2, int arg3, class248 arg4, int arg5, int arg6) {
        ++field3079;
        if (arg1 != null) {
            if (arg5 != 155) {
                field3093 = 11;
            }
            int var7 = 2047 & (int) class114.field1742 + class278.field4540;
            int var8 = 10 + Math.max(arg4.field4016 / 2, arg4.field4057 / 2);
            int var9 = arg2 * arg2 + arg3 * arg3;
            if (~(var8 * var8) <= ~var9) {
                int var10 = class136.field2191[var7];
                int var11 = class136.field2193[var7];
                int var12 = var11 * 256 / (class150.field2394 + 256);
                int var13 = var10 * 256 / (class150.field2394 - -256);
                int var14 = arg2 * var12 + -(arg3 * var13) >> 16;
                int var15 = arg2 * var13 + arg3 * var12 >> 16;
                ((class67) arg1).method449(arg4.field4016 / 2 + var15 + arg0 - arg1.field4781 / 2, arg4.field4057 / 2 + (arg6 - var14) + -(arg1.field4778 / 2), arg4.field3993, arg4.field3934);
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field3084;
        if (arg0 == 0) {
            this.method1326(arg1.method1812(true), 12);
        }
        if (arg2 != 28) {
            field3093 = 104;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(II)V")
    private final void method1326(int arg0, int arg1) {
        if (arg1 != 12) {
            method1328(-63);
        }
        this.field3081 = arg0 >> 12 & 4080;
        ++field3088;
        this.field3087 = 4080 & arg0 >> 4;
        this.field3080 = arg0 << 4 & 4080;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)[[I")
    public final int[][] method190(int arg0, byte arg1) {
        if (arg1 != -117) {
            method1328(122);
        }
        int[][] var3 = super.field1662.method1302(arg0, (byte) 26);
        ++field3091;
        if (super.field1662.field3063) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; ~class24.field443 < ~var7; ++var7) {
                var4[var7] = this.field3081;
                var6[var7] = this.field3087;
                var5[var7] = this.field3080;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(I)V")
    private class188(int arg0) {
        super(0, false);
        this.method1326(arg0, 12);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILrg;)I")
    public static final int method1327(int arg0, int arg1, class248 arg2) {
        ++field3092;
        if (arg2.field3899 != null && ~arg1 > ~arg2.field3899.length) {
            if (arg0 != 1110088615) {
                field3094 = null;
            }
            try {
                int[] var3 = arg2.field3899[arg1];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = 0;
                    int var8 = var3[var5++];
                    byte var9 = 0;
                    if (var8 == 0) {
                        return var4;
                    }
                    if (var8 == 15) {
                        var9 = 1;
                    }
                    if (~var8 == -17) {
                        var9 = 2;
                    }
                    if (~var8 == -2) {
                        var7 = class72.field1147[var3[var5++]];
                    }
                    if (var8 == 17) {
                        var9 = 3;
                    }
                    if (~var8 == -3) {
                        var7 = class89.field1382[var3[var5++]];
                    }
                    if (var8 == 3) {
                        var7 = class139.field2243[var3[var5++]];
                    }
                    if (var8 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class248 var12 = class281.method1913(var11, (byte) -122);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class107.method754(-20563, var13).field2576 || class213.field3383)) {
                            for (int var14 = 0; var12.field4041.length > var14; ++var14) {
                                if (~(var13 + 1) == ~var12.field4041[var14]) {
                                    var7 += var12.field4054[var14];
                                }
                            }
                        }
                    }
                    if (~var8 == -6) {
                        var7 = class68.field1090[var3[var5++]];
                    }
                    if (~var8 == -7) {
                        var7 = class117.field1799[class89.field1382[var3[var5++]] - 1];
                    }
                    if (~var8 == -8) {
                        var7 = 100 * class68.field1090[var3[var5++]] / 46875;
                    }
                    if (~var8 == -9) {
                        var7 = class217.field3408.field224;
                    }
                    if (~var8 == -10) {
                        for (int var15 = 0; ~var15 > -26; ++var15) {
                            if (class112.field1723[var15]) {
                                var7 += class89.field1382[var15];
                            }
                        }
                    }
                    if (~var8 == -11) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class248 var18 = class281.method1913(var17, (byte) -93);
                        int var19 = var3[var5++];
                        if (var19 != -1 && (!class107.method754(arg0 + -1110109178, var19).field2576 || class213.field3383)) {
                            for (int var20 = 0; ~var18.field4041.length < ~var20; ++var20) {
                                if (~(var19 - -1) == ~var18.field4041[var20]) {
                                    var7 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var8 == -12) {
                        var7 = class217.field3410;
                    }
                    if (var8 == 12) {
                        var7 = class64.field1039;
                    }
                    if (~var8 == -14) {
                        int var21 = class68.field1090[var3[var5++]];
                        int var22 = var3[var5++];
                        var7 = ~(1 << var22 & var21) == -1 ? 0 : 1;
                    }
                    if (~var8 == -15) {
                        int var23 = var3[var5++];
                        var7 = class119.method821(var23, arg0 ^ 1110088750);
                    }
                    if (~var8 == -19) {
                        var7 = (class217.field3408.field994 >> 7) + class75.field1211;
                    }
                    if (var8 == 19) {
                        var7 = (class217.field3408.field929 >> 7) + class145.field2327;
                    }
                    if (var8 == 20) {
                        var7 = var3[var5++];
                    }
                    if (var9 != 0) {
                        var6 = var9;
                    } else {
                        if (~var6 == -1) {
                            var4 += var7;
                        }
                        if (var6 == 1) {
                            var4 -= var7;
                        }
                        if (var6 == 2 && var7 != 0) {
                            var4 /= var7;
                        }
                        if (~var6 == -4) {
                            var4 *= var7;
                        }
                        var6 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(I)V")
    public static void method1328(int arg0) {
        field3083 = null;
        field3094 = null;
        if (arg0 == 3) {
            field3085 = null;
            field3086 = null;
            field3082 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BC)Z")
    public static final boolean method1329(byte arg0, char arg1) {
        int var2 = -33 % ((arg0 - -73) / 50);
        ++field3090;
        return ~arg1 <= -49 && ~arg1 >= -58;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class188() {
        this(0);
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(II)V")
    public static final void method1330(int arg0, int arg1) {
        --class291.field4776;
        ++field3089;
        if (~class291.field4776 != ~arg0) {
            class282.method1919(field3083, arg0 + 1, field3083, arg0, class291.field4776 - arg0);
            class282.method1919(class226.field3550, arg0 + 1, class226.field3550, arg0, class291.field4776 - arg0);
            class282.method1923(class275.field4502, arg0 + 1, class275.field4502, arg0, -arg0 + class291.field4776);
            class282.method1918(class26.field478, arg0 + 1, class26.field478, arg0, -arg0 + class291.field4776);
            class282.method1924(class215.field3392, arg0 + 1, class215.field3392, arg0, -arg0 + class291.field4776);
            class282.method1923(class242.field3840, arg0 + 1, class242.field3840, arg0, -arg0 + class291.field4776);
            class282.method1923(class144.field2320, arg0 + 1, class144.field2320, arg0, -arg0 + class291.field4776);
            if (arg1 != -8302) {
                field3082 = null;
            }
        }
    }
}
