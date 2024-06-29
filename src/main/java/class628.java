import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class628 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field8468 = 0;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field8466;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field8469;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field8470;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    private int field8471;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field8472;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field8473;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field8475;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "J")
    public static long field8467;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "Lxa;")
    public static class468 field8474;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lam;")
    public class591 field8465;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3455(int arg0) {
        field8472++;
        int var1 = class439.field6039.method1996(false);
        int var2 = class439.field6039.method1996(false);
        int var3 = class439.field6039.method2034(255);
        boolean var4 = class439.field6039.method2028(true) == 1;
        class409.field5528 = class439.field6039.method2046((byte) -121);
        class508.method2817(-18);
        class178.method1197((byte) 107, var3);
        class439.field6039.method1311(958520326);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < (class34.field530 >> 3); var20++) {
                for (int var21 = 0; var21 < (class34.field531 >> 3); var21++) {
                    int var22 = class439.field6039.method1318(122, 1);
                    if (var22 == 1) {
                        class242.field3381[var5][var20][var21] = class439.field6039.method1318(100, 26);
                    } else {
                        class242.field3381[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class439.field6039.method1308(arg0 + 8);
        int var6 = (class269.field3754 - class439.field6039.field4619) / 16;
        class559.field7419 = new int[var6][4];
        for (int var7 = arg0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class559.field7419[var7][var19] = class439.field6039.method2045(-98);
            }
        }
        class373.field5046 = new int[var6];
        class120.field2025 = new int[var6];
        class376.field5072 = new int[var6];
        class63.field965 = new byte[var6][];
        class91.field1386 = null;
        class454.field6186 = new int[var6];
        class214.field3061 = new byte[var6][];
        class3.field40 = new int[var6];
        class502.field6717 = new byte[var6][];
        class426.field5860 = new byte[var6][];
        class204.field2954 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class34.field530 >> 3); var10++) {
                for (int var11 = 0; var11 < (class34.field531 >> 3); var11++) {
                    int var12 = class242.field3381[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFE322) >> 14;
                        int var14 = (var12 & 0x3FF9) >> 3;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class376.field5072[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class376.field5072[var8] = var15;
                            int var17 = (var15 & 0xFF3C) >> 8;
                            int var18 = var15 & 0xFF;
                            class373.field5046[var8] = class243.field3403.method2523("m" + var17 + "_" + var18, (byte) 43);
                            class120.field2025[var8] = class243.field3403.method2523("l" + var17 + "_" + var18, (byte) 44);
                            class3.field40[var8] = class243.field3403.method2523("um" + var17 + "_" + var18, (byte) 105);
                            class454.field6186[var8] = class243.field3403.method2523("ul" + var17 + "_" + var18, (byte) 75);
                            var8++;
                        }
                    }
                }
            }
        }
        class659.method3691(11, var1, 512, var2, var4);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 154)
    public static void method3456(int arg0) {
        int var1 = 57 / ((-arg0 - 49) / 63);
        field8474 = null;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)Lpga;", line = 164)
    public final synchronized class500 method3457(int arg0) {
        if (arg0 != 2426) {
            return null;
        }
        field8473++;
        class500 var2 = (class500) this.field8465.field7823.method3750((long) this.field8471, false);
        if (var2 != null) {
            return var2;
        }
        class500 var3 = class500.method2770(this.field8465.field7817, this.field8471, 0);
        if (var3 != null) {
            this.field8465.field7823.method3745(1, (long) this.field8471, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILeh;)V", line = 188)
    private final void method3458(int arg0, int arg1, class335 arg2) {
        if (arg0 == 1) {
            this.field8471 = arg2.method2001((byte) -83);
        } else if (arg0 == 2) {
            this.field8469 = arg2.method2034(255);
            this.field8475 = arg2.method2034(255);
        }
        int var4 = -62 % ((arg1 + 17) / 38);
        field8470++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Leh;Z)V", line = 213)
    public final void method3459(class335 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                field8466++;
                return;
            }
            this.method3458(var3, 62, arg0);
        }
    }
}
