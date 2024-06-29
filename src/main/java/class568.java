import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public class class568 {

    @OriginalMember(owner = "client!iq", name = "r", descriptor = "I")
    public int field7549 = -1;

    @OriginalMember(owner = "client!iq", name = "o", descriptor = "I")
    public static int field7546 = 0;

    @OriginalMember(owner = "client!iq", name = "l", descriptor = "F")
    public static float field7543;

    @OriginalMember(owner = "client!iq", name = "c", descriptor = "I")
    public static int field7534;

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "I")
    public static int field7536;

    @OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
    public static int field7544;

    @OriginalMember(owner = "client!iq", name = "q", descriptor = "I")
    public static int field7548;

    @OriginalMember(owner = "client!iq", name = "s", descriptor = "I")
    public static int field7550;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field7554;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field7555;

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "Lnb;")
    public static class278 field7553;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Ljw;")
    private class520 field7552;

    @OriginalMember(owner = "client!iq", name = "i", descriptor = "Ljava/lang/String;")
    private String field7540;

    @OriginalMember(owner = "client!iq", name = "n", descriptor = "Ljava/lang/String;")
    private String field7545;

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "[I")
    private int[] field7533;

    @OriginalMember(owner = "client!iq", name = "d", descriptor = "[I")
    private int[] field7535;

    @OriginalMember(owner = "client!iq", name = "g", descriptor = "[I")
    private int[] field7538;

    @OriginalMember(owner = "client!iq", name = "j", descriptor = "[I")
    private int[] field7541;

    @OriginalMember(owner = "client!iq", name = "k", descriptor = "[I")
    private int[] field7542;

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "[I")
    private int[] field7551;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "[I")
    private int[] field7556;

    @OriginalMember(owner = "client!iq", name = "A", descriptor = "[I")
    private int[] field7558;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "[Ljava/lang/String;")
    private String[] field7532;

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field7537;

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "[[I")
    private int[][] field7539;

    @OriginalMember(owner = "client!iq", name = "p", descriptor = "[[I")
    private int[][] field7547;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "[[I")
    private int[][] field7557;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Z)V")
    public static final void method3125(boolean arg0) {
        field7544++;
        if (arg0) {
            method3125(false);
        }
        for (class117 var1 = (class117) class480.field6411.method3257(-110); var1 != null; var1 = (class117) class480.field6411.method3263((byte) -88)) {
            if (class399.method2287(var1.field1993, arg0)) {
                class388.method2246(19, var1);
            }
        }
        if (class398.field5290 == 1) {
            class619.method3386(-99);
            return;
        }
        class221.method1395(class259.field3566, class483.field6540, class342.field4707, class340.field4703, arg0);
        int var2 = class193.field2823.method2847(class72.field1088.method546(class516.field6892, (byte) -35), (byte) -122);
        for (class117 var3 = (class117) class480.field6411.method3257(-121); var3 != null; var3 = (class117) class480.field6411.method3263((byte) -86)) {
            int var4 = class578.method3173(14, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class342.field4707 = class398.field5290 * 16 + (class664.field9427 ? 26 : 22);
        class483.field6540 = var2 + 8;
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "([SI[Ljava/lang/String;II)V")
    public static final void method3126(short[] arg0, int arg1, String[] arg2, int arg3, int arg4) {
        if (arg4 < arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg4;
            String var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var8;
            for (int var9 = arg4; var9 < arg1; var9++) {
                if (var7 == null || arg2[var9] != null && arg2[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var8;
            method3126(arg0, var6 - 1, arg2, -128, arg4);
            method3126(arg0, arg1, arg2, -85, var6 + 1);
        }
        field7550++;
        if (arg3 > -43) {
            method3127(83);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
    public static void method3127(int arg0) {
        if (arg0 == 0) {
            field7553 = null;
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Leh;B)V")
    public final void method3128(class335 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                if (arg1 != 61) {
                    method3127(95);
                }
                field7555++;
                return;
            }
            this.method3129((byte) -121, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(BLeh;I)V")
    private final void method3129(byte arg0, class335 arg1, int arg2) {
        field7554++;
        if (arg0 != -121) {
            this.field7540 = null;
        }
        if (arg2 == 1) {
            this.field7545 = arg1.method1987(-1);
        } else if (arg2 == 2) {
            this.field7540 = arg1.method1987(-1);
        } else if (arg2 == 3) {
            int var22 = arg1.method2034(255);
            this.field7557 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field7557[var23][0] = arg1.method2001((byte) -83);
                this.field7557[var23][1] = arg1.method2045(-98);
                this.field7557[var23][2] = arg1.method2045(-98);
            }
        } else if (arg2 == 4) {
            int var20 = arg1.method2034(255);
            this.field7547 = new int[var20][3];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field7547[var21][0] = arg1.method2001((byte) -83);
                this.field7547[var21][1] = arg1.method2045(-98);
                this.field7547[var21][2] = arg1.method2045(arg0 + 23);
            }
        } else if (arg2 == 5) {
            arg1.method2001((byte) -83);
        } else if (arg2 == 6) {
            arg1.method2034(255);
        } else if (arg2 == 7) {
            arg1.method2034(255);
        } else if (arg2 != 8) {
            if (arg2 == 9) {
                arg1.method2034(255);
                return;
            }
            if (arg2 != 10) {
                if (arg2 == 12) {
                    arg1.method2045(arg0 + 23);
                    return;
                }
                if (arg2 != 13) {
                    if (arg2 != 14) {
                        if (arg2 == 15) {
                            arg1.method2001((byte) -83);
                        } else if (arg2 == 17) {
                            this.field7549 = arg1.method2001((byte) -83);
                            return;
                        } else if (arg2 == 18) {
                            int var4 = arg1.method2034(255);
                            this.field7533 = new int[var4];
                            this.field7541 = new int[var4];
                            this.field7538 = new int[var4];
                            this.field7537 = new String[var4];
                            for (int var5 = 0; var5 < var4; var5++) {
                                this.field7538[var5] = arg1.method2045(-98);
                                this.field7541[var5] = arg1.method2045(-98);
                                this.field7533[var5] = arg1.method2045(-98);
                                this.field7537[var5] = arg1.method2029((byte) -77);
                            }
                            return;
                        } else if (arg2 == 19) {
                            int var6 = arg1.method2034(255);
                            this.field7535 = new int[var6];
                            this.field7558 = new int[var6];
                            this.field7532 = new String[var6];
                            this.field7542 = new int[var6];
                            for (int var7 = 0; var7 < var6; var7++) {
                                this.field7558[var7] = arg1.method2045(class217.method1381(arg0, 25));
                                this.field7535[var7] = arg1.method2045(-98);
                                this.field7542[var7] = arg1.method2045(-98);
                                this.field7532[var7] = arg1.method2029((byte) -94);
                            }
                            return;
                        } else if (arg2 == 249) {
                            int var8 = arg1.method2034(255);
                            if (this.field7552 == null) {
                                int var9 = class587.method3231(true, var8);
                                this.field7552 = new class520(var9);
                            }
                            for (int var10 = 0; var10 < var8; var10++) {
                                boolean var11 = arg1.method2034(255) == 1;
                                int var12 = arg1.method2042((byte) 53);
                                class504 var13;
                                if (var11) {
                                    var13 = new class319(arg1.method2029((byte) -92));
                                } else {
                                    var13 = new class704(arg1.method2045(-98));
                                }
                                this.field7552.method2911((long) var12, var13, (byte) -28);
                            }
                            return;
                        }
                        return;
                    }
                    int var14 = arg1.method2034(arg0 ^ 0xFFFFFF78);
                    this.field7539 = new int[var14][2];
                    for (int var15 = 0; var15 < var14; var15++) {
                        this.field7539[var15][0] = arg1.method2034(arg0 + 376);
                        this.field7539[var15][1] = arg1.method2034(255);
                    }
                    return;
                }
                int var16 = arg1.method2034(arg0 + 376);
                this.field7556 = new int[var16];
                for (int var17 = 0; var17 < var16; var17++) {
                    this.field7556[var17] = arg1.method2001((byte) -83);
                }
                return;
            }
            int var18 = arg1.method2034(arg0 + 376);
            this.field7551 = new int[var18];
            for (int var19 = 0; var19 < var18; var19++) {
                this.field7551[var19] = arg1.method2045(-98);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!iq", name = "b", descriptor = "(Z)V")
    public final void method3130(boolean arg0) {
        if (this.field7540 == null) {
            this.field7540 = this.field7545;
        }
        field7536++;
        if (arg0) {
            method3127(-6);
        }
    }
}
