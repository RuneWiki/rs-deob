import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class202 {

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "Z")
    public static boolean field3366 = false;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "Lok;")
    public static class146 field3367 = class235.method1724(-12908, "(U(Y");

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lhd;")
    public static class117 field3361 = new class117(64);

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "Lok;")
    public static class146 field3371 = class235.method1724(-12908, "ondulation:");

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "[I")
    public static int[] field3372 = new int[2500];

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field3369 = 0;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field3373 = 128;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "Lok;")
    public static class146 field3376 = class235.method1724(-12908, "event_opbase");

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[I")
    public static int[] field3374 = new int[128];

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Li;")
    public static class209 field3370;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "Lbn;")
    public static class62 field3375;

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "[[Z")
    public static boolean[][] field3364;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 18)
    public static void method1542(int arg0) {
        field3361 = null;
        field3371 = null;
        if (arg0 != 2834) {
            method1543(24);
        }
        field3364 = (boolean[][]) null;
        field3367 = null;
        field3374 = null;
        field3370 = null;
        field3376 = null;
        field3372 = null;
        field3375 = null;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)V", line = 37)
    public static final void method1543(int arg0) {
        if (class147.field2500 != null) {
            class119.method815(-3, class147.field2500);
            class147.field2500 = null;
        }
        int var1 = 52 % ((-arg0 - 49) / 32);
        field3363++;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lwe;I)V", line = 60)
    public static final void method1544(class47 arg0, int arg1) {
        field3362++;
        if (arg1 < 43) {
            method1542(-121);
        }
        while (true) {
            while (arg0.field857 < arg0.field860.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method368(-117) == 1) {
                    var3 = arg0.method368(49);
                    var4 = arg0.method368(-117);
                    var2 = true;
                }
                int var5 = arg0.method368(-121);
                int var6 = arg0.method368(-127);
                int var7 = var5 * 64 - class277.field4764;
                int var8 = class33.field639 + class191.field3152 - var6 * 64 - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class118.field1916 && var8 < class33.field639) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var11 < (var3 * 8 + 8) && var12 >= (var4 * 8) && (var4 * 8 + 8) > var12) {
                                int var13 = arg0.method368(-108);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg0.method368(-127);
                                        if (class298.field5067[var9][var10] == null) {
                                            class298.field5067[var9][var10] = new byte[4096];
                                        }
                                        class298.field5067[var9][var10][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg0.method379(-2);
                                        if (class39.field693[var9][var10] == null) {
                                            class39.field693[var9][var10] = new short[4096];
                                        }
                                        class39.field693[var9][var10][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg0.method368(97) & 0xFF << 16) - (-(arg0.method368(-127) & 0xFF << 8) - (arg0.method368(33) & 0xFF));
                                        if (class318.field5401[var9][var10] == null) {
                                            class318.field5401[var9][var10] = new int[4096];
                                        }
                                        var16--;
                                        class5 var17 = class112.method756((byte) 69, var16);
                                        if (var17.field105 != null) {
                                            var17 = var17.method36((byte) -86);
                                            if (var17 == null || var17.field100 == -1) {
                                                continue;
                                            }
                                        }
                                        class318.field5401[var9][var10][(63 - var12 << 6) + var11] = var17.field68 + 1;
                                        class2 var18 = new class2();
                                        var18.field9 = var17.field100;
                                        var18.field8 = var8;
                                        var18.field11 = var7;
                                        class215.field3547.method1258(0, var18);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg0.method368(-118);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg0.field857++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg0.field857 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg0.field857 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }
}
