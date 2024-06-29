import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class11 extends class110 {

    @OriginalMember(owner = "client!bc", name = "Z", descriptor = "Z")
    public boolean field185 = true;

    @OriginalMember(owner = "client!bc", name = "db", descriptor = "I")
    public int field189 = 0;

    @OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
    public int field203 = -1;

    @OriginalMember(owner = "client!bc", name = "hb", descriptor = "I")
    public int field193 = -1;

    @OriginalMember(owner = "client!bc", name = "T", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!bc", name = "gb", descriptor = "I")
    public static int field192 = 1;

    @OriginalMember(owner = "client!bc", name = "bb", descriptor = "Lmb;")
    private static class84 field187 = class79.method672(true, "This world is running a closed Beta)3");

    @OriginalMember(owner = "client!bc", name = "mb", descriptor = "[Z")
    public static boolean[] field198 = new boolean[112];

    @OriginalMember(owner = "client!bc", name = "eb", descriptor = "I")
    public static int field190 = 0;

    @OriginalMember(owner = "client!bc", name = "lb", descriptor = "Lmb;")
    public static class84 field197 = field187;

    @OriginalMember(owner = "client!bc", name = "vb", descriptor = "Lmb;")
    private static class84 field207 = class79.method672(true, "Welcome to RuneScape");

    @OriginalMember(owner = "client!bc", name = "ib", descriptor = "Lmb;")
    public static class84 field194 = field207;

    @OriginalMember(owner = "client!bc", name = "wb", descriptor = "Lmb;")
    public static class84 field208 = class79.method672(true, "Titelbild geladen)3");

    @OriginalMember(owner = "client!bc", name = "S", descriptor = "I")
    public int field178;

    @OriginalMember(owner = "client!bc", name = "U", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!bc", name = "W", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!bc", name = "X", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!bc", name = "Y", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!bc", name = "ab", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!bc", name = "cb", descriptor = "I")
    public int field188;

    @OriginalMember(owner = "client!bc", name = "fb", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!bc", name = "jb", descriptor = "I")
    public int field195;

    @OriginalMember(owner = "client!bc", name = "kb", descriptor = "I")
    public int field196;

    @OriginalMember(owner = "client!bc", name = "nb", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!bc", name = "pb", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!bc", name = "qb", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!bc", name = "sb", descriptor = "I")
    public int field204;

    @OriginalMember(owner = "client!bc", name = "tb", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!bc", name = "ub", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!bc", name = "ob", descriptor = "Laa;")
    public static class2 field200;

    @OriginalMember(owner = "client!bc", name = "V", descriptor = "[I")
    public static int[] field181;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "(I)V")
    public static final void method59(int arg0) {
        field180++;
        class84 var1 = null;
        for (int var2 = 0; var2 < class20.field429; var2++) {
            if (class46.field994[var2].method729(65, class84.field2106) != -1) {
                var1 = class46.field994[var2].method697(71, class46.field994[var2].method729(65, class84.field2106));
                break;
            }
        }
        if (var1 == null) {
            class20.method131((byte) -106);
            return;
        }
        int var3 = class108.field2611;
        if (var3 < 0) {
            var3 = 0;
        }
        int var4 = class91.field2276;
        int var5 = class123.field2960;
        int var6 = class52.field1184;
        int var7 = 6116423;
        if (var5 > 190) {
            var5 = 190;
        }
        class142.method1151(var3, var6, var5, var4, var7);
        class142.method1151(var3 + 1, var6 + 1, var5 - 2, 16, 0);
        class142.method1160(var3 + 1, var6 + 18, var5 - 2, var4 + -19, arg0);
        class13.field239.method223(var1, var3 + 3, var6 + 14, var7, false);
        int var8 = class20.field427;
        int var9 = class60.field1498;
        if (class117.field2784 == 0) {
            var9 -= 4;
            var8 -= 4;
        }
        if (class117.field2784 == 1) {
            var9 -= 205;
            var8 -= 553;
        }
        if (class117.field2784 == 2) {
            var9 -= 357;
            var8 -= 17;
        }
        for (int var10 = 0; var10 < class20.field429; var10++) {
            int var11 = (class20.field429 - var10 - 1) * 15 + var6 + 31;
            int var12 = 16777215;
            if (var8 > var3 && var3 + var5 > var8 && var11 - 13 < var9 && var11 + 3 > var9) {
                var12 = 16776960;
            }
            class84 var13 = class46.field994[var10];
            if (var13.method722(var1, (byte) -121)) {
                var13 = var13.method723(false, var13.method718(105) - var1.method718(-91), 0);
                if (var13.method722(class91.field2280, (byte) -125)) {
                    var13 = var13.method723(false, var13.method718(88) - class91.field2280.method718(-111), 0);
                }
            }
            class13.field239.method223(var13, var3 + 3, var11, var12, true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "(I)V")
    public static void method60(int arg0) {
        field181 = null;
        field200 = null;
        field187 = null;
        if (arg0 >= -64) {
            field197 = null;
        }
        field198 = null;
        field197 = null;
        field208 = null;
        field207 = null;
        field194 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lia;Lmb;I)Lmb;")
    public static final class84 method61(class57 arg0, class84 arg1, int arg2) {
        if (arg2 != arg1.method729(arg2 + 66, class119.field2845)) {
            label58: while (true) {
                int var3 = arg1.method729(65, class90.field2262);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg1.method729(arg2 + 66, class146.field3594);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg1.method729(65, class95.field2349);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg1.method729(65, class96.field2387);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg1.method729(arg2 + 66, class117.field2802);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg1.method729(65, class30.field700);
                                                        if (var8 == -1) {
                                                            break label58;
                                                        }
                                                        class84 var9 = class95.field2361;
                                                        if (class69.field1692 != null) {
                                                            var9 = class86.method736((byte) -115, class69.field1692.field2113);
                                                            try {
                                                                if (class69.field1692.field2118 != null) {
                                                                    byte[] var10 = ((String) class69.field1692.field2118).getBytes("ISO-8859-1");
                                                                    var9 = class134.method1074(var10.length, 0, true, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg1 = class51.method408(new class84[] { arg1.method723(false, var8, 0), var9, arg1.method697(114, var8 + 4) }, arg2 ^ 0xFFFFFF9A);
                                                    }
                                                }
                                                arg1 = class51.method408(new class84[] { arg1.method723(false, var7, 0), class22.method152(11284, class111.method904(arg0, true, 4)), arg1.method697(31, var7 + 2) }, arg2 + 109);
                                            }
                                        }
                                        arg1 = class51.method408(new class84[] { arg1.method723(false, var6, 0), class22.method152(11284, class111.method904(arg0, true, 3)), arg1.method697(arg2 ^ 0xFFFFFF81, var6 + 2) }, 111);
                                    }
                                }
                                arg1 = class51.method408(new class84[] { arg1.method723(false, var5, 0), class22.method152(arg2 + 11285, class111.method904(arg0, true, 2)), arg1.method697(62, var5 + 2) }, 115);
                            }
                        }
                        arg1 = class51.method408(new class84[] { arg1.method723(false, var4, 0), class22.method152(11284, class111.method904(arg0, true, 1)), arg1.method697(arg2 + 102, var4 + 2) }, -108);
                    }
                }
                arg1 = class51.method408(new class84[] { arg1.method723(false, var3, 0), class22.method152(11284, class111.method904(arg0, true, 0)), arg1.method697(72, var3 + 2) }, arg2 ^ 0x20);
            }
        }
        field191++;
        return arg1;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILmb;)V")
    public static final void method62(int arg0, class84 arg1) {
        field182++;
        if (arg1 == null || arg1.method718(86) == 0) {
            class106.field2572 = 0;
            return;
        }
        class84 var2 = arg1;
        class84[] var3 = new class84[100];
        int var4 = 0;
        while (true) {
            int var5 = var2.method726(0, 32);
            if (var5 == -1) {
                class84 var7 = var2.method698(83);
                if (var7.method718(-94) > 0) {
                    var3[var4++] = var7.method728((byte) 93);
                }
                class106.field2572 = 0;
                if (arg0 <= 23) {
                    method64(null, null, 30, -77);
                }
                label51: for (int var8 = 0; var8 < class87.field2156; var8++) {
                    class13 var9 = class98.method813(-1, var8);
                    if (var9.field266 == -1 && var9.field215 != null) {
                        class84 var10 = var9.field215.method728((byte) 115);
                        for (int var11 = 0; var11 < var4; var11++) {
                            if (var10.method729(65, var3[var11]) == -1) {
                                continue label51;
                            }
                        }
                        client.field475[class106.field2572] = var10;
                        class68.field1656[class106.field2572] = var8;
                        class106.field2572++;
                        if (class106.field2572 >= client.field475.length) {
                            return;
                        }
                    }
                }
                return;
            }
            class84 var6 = var2.method723(false, var5, 0).method698(-53);
            if (var6.method718(62) > 0) {
                var3[var4++] = var6.method728((byte) 108);
            }
            var2 = var2.method697(64, var5 + 1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lhb;BII)V")
    private final void method63(class51 arg0, byte arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field189 = arg0.method374((byte) -79);
        } else if (arg2 == 2) {
            this.field193 = arg0.method373(25094);
        } else if (arg2 == 5) {
            this.field185 = false;
        } else if (arg2 == 7) {
            this.field203 = arg0.method374((byte) -49);
        }
        field184++;
        if (arg1 <= 23) {
            field207 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lmb;Lmb;II)V")
    public static final void method64(class84 arg0, class84 arg1, int arg2, int arg3) {
        field205++;
        if (class83.field2038 == -1) {
            class65.field1615 = true;
        }
        if (arg3 == 0 && class120.field2880 != -1) {
            class37.field831 = 0;
            class68.field1658 = arg0;
        }
        for (int var4 = 99; var4 > 0; var4--) {
            class17.field377[var4] = class17.field377[var4 - 1];
            class49.field1048[var4] = class49.field1048[var4 - 1];
            class74.field1792[var4] = class74.field1792[var4 - 1];
        }
        class49.field1048[0] = arg1;
        class17.field377[0] = arg3;
        if (arg2 > -50) {
            field181 = null;
        }
        class74.field1792[0] = arg0;
    }

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "(I)V")
    public final void method65(int arg0) {
        if (this.field203 != -1) {
            this.method66(false, this.field203);
            this.field178 = this.field204;
            this.field196 = this.field195;
            this.field199 = this.field188;
        }
        if (arg0 < 23) {
            method67(-106, 21, true, 19, -91, -112, 53);
        }
        this.method66(false, this.field189);
        field183++;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
    private final void method66(boolean arg0, int arg1) {
        field206++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var3 < var5) {
            var11 = var5;
        }
        if (arg0) {
            return;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var15 = (var5 - var7) / (-var9 + var11);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (-var9 + var11) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (-var9 + var11) + 4.0D;
            }
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 + -var9);
            }
        }
        double var19 = var15 / 6.0D;
        this.field195 = (int) (var13 * 256.0D);
        if (this.field195 < 0) {
            this.field195 = 0;
        } else if (this.field195 > 255) {
            this.field195 = 255;
        }
        this.field188 = (int) (var19 * 256.0D);
        this.field204 = (int) (var17 * 256.0D);
        if (this.field204 < 0) {
            this.field204 = 0;
        } else if (this.field204 > 255) {
            this.field204 = 255;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIZIIII)V")
    public static final void method67(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field201++;
        if (class47.method338(63, arg3)) {
            class89.method766(class24.field557[arg3], arg6, (byte) -117, -1, arg1, 0, arg0, arg5, arg4, 0);
            if (!arg2) {
                field192 = -78;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IILhb;)V")
    public final void method68(int arg0, int arg1, class51 arg2) {
        field202++;
        while (true) {
            int var4 = arg2.method373(25094);
            if (var4 == 0) {
                if (arg1 >= -76) {
                    method61(null, null, -4);
                    return;
                } else {
                    return;
                }
            }
            this.method63(arg2, (byte) 72, var4, arg0);
        }
    }
}
