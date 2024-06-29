import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class379 extends class443 {

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public int field5540 = -1;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    public int field5533 = 0;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public int field5541 = 12800;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "Z")
    public boolean field5539 = true;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    public int field5538 = 12800;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "I")
    public int field5536 = -1;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "I")
    public int field5551 = 0;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public int field5537;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "Ljava/lang/String;")
    public String field5542;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "Ljava/lang/String;")
    public String field5535;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public int field5547;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lm;")
    public class242 field5534;

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "Luc;")
    public static class51 field5550 = new class51(500);

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "I")
    public static int field5552 = 0;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Z")
    public static boolean field5553 = false;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field5544;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "I")
    public static int field5548;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "I")
    public static int field5549;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIB[I)Z", line = 7)
    public final boolean method2469(int arg0, int arg1, byte arg2, int[] arg3) {
        field5548++;
        if (arg2 != -99) {
            field5553 = false;
        }
        for (class14 var5 = (class14) this.field5534.method1575(arg2 ^ 0xFFFFFF9D); var5 != null; var5 = (class14) this.field5534.method1573((byte) -128)) {
            if (var5.method103(arg0, (byte) -111, arg1)) {
                var5.method104(arg2 + 101, arg0, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(B)V", line = 33)
    public static void method2470(byte arg0) {
        int var1 = 83 / ((29 - arg0) / 50);
        field5550 = null;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II[III)Z", line = 44)
    public final boolean method2471(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field5544++;
        for (class14 var6 = (class14) this.field5534.method1575(arg4); var6 != null; var6 = (class14) this.field5534.method1573((byte) -128)) {
            if (var6.method99(1, arg1, arg3, arg0)) {
                var6.method100(arg1, -126, arg2, arg0);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z", line = 70)
    public final boolean method2472(int arg0, int arg1, int arg2) {
        field5549++;
        if (arg2 >= -78) {
            method2473((class193) null, (class298) null, false, -36, (class280[]) null, 79);
        }
        for (class14 var4 = (class14) this.field5534.method1575(0); var4 != null; var4 = (class14) this.field5534.method1573((byte) -128)) {
            if (var4.method98(-613, arg1, arg0)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lda;Ltj;ZI[Lao;I)V", line = 93)
    public static final void method2473(class193 arg0, class298 arg1, boolean arg2, int arg3, class280[] arg4, int arg5) {
        if (!arg2) {
            for (int var6 = 0; var6 < 4; var6++) {
                for (int var7 = 0; var7 < class351.field5217; var7++) {
                    for (int var8 = 0; var8 < class143.field1815; var8++) {
                        if ((class406.field5912[var6][var7][var8] & 0x1) != 0) {
                            int var9 = var6;
                            if ((class406.field5912[1][var7][var8] & 0x2) != 0) {
                                var9 = var6 - 1;
                            }
                            if (var9 >= 0) {
                                arg4[var9].method1856(var8, (byte) 105, var7);
                            }
                        }
                    }
                }
            }
        }
        field5546++;
        int[][] var10 = new int[class351.field5217][class143.field1815];
        for (int var11 = arg5; var11 < arg3; var11++) {
            for (int var13 = 0; var13 < class143.field1815; var13++) {
                class1.field1[var13] = 0;
                class255.field3723[var13] = 0;
                class249.field3679[var13] = 0;
                class48.field735[var13] = 0;
                class359.field5323[var13] = 0;
            }
            for (int var14 = -5; var14 < class351.field5217; var14++) {
                for (int var15 = 0; var15 < class143.field1815; var15++) {
                    int var24 = var14 + 5;
                    int var10002;
                    if (var24 < class351.field5217) {
                        int var25 = class112.field1452[var11][var24][var15] & 0xFF;
                        if (var25 > 0) {
                            class149 var26 = class15.method115(var25 - 1, (byte) -98);
                            class1.field1[var15] += var26.field1899;
                            class255.field3723[var15] += var26.field1901;
                            class249.field3679[var15] += var26.field1900;
                            class48.field735[var15] += var26.field1888;
                            var10002 = class359.field5323[var15]++;
                        }
                    }
                    int var27 = var14 - 5;
                    if (var27 >= 0) {
                        int var28 = class112.field1452[var11][var27][var15] & 0xFF;
                        if (var28 > 0) {
                            class149 var29 = class15.method115(var28 - 1, (byte) -98);
                            class1.field1[var15] -= var29.field1899;
                            class255.field3723[var15] -= var29.field1901;
                            class249.field3679[var15] -= var29.field1900;
                            class48.field735[var15] -= var29.field1888;
                            var10002 = class359.field5323[var15]--;
                        }
                    }
                }
                if (var14 >= 0) {
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    int var20 = 0;
                    for (int var21 = -5; var21 < class143.field1815; var21++) {
                        int var22 = var21 + 5;
                        if (var22 < class143.field1815) {
                            var16 += class1.field1[var22];
                            var19 += class48.field735[var22];
                            var20 += class359.field5323[var22];
                            var18 += class249.field3679[var22];
                            var17 += class255.field3723[var22];
                        }
                        int var23 = var21 - 5;
                        if (var23 >= 0) {
                            var18 -= class249.field3679[var23];
                            var17 -= class255.field3723[var23];
                            var19 -= class48.field735[var23];
                            var20 -= class359.field5323[var23];
                            var16 -= class1.field1[var23];
                        }
                        if (var21 >= 0 && var19 > 0 && var20 > 0) {
                            var10[var14][var21] = class399.method2565(class294.method1993(arg5, 31826), var16 * 256 / var19, var17 / var20, var18 / var20);
                        }
                    }
                }
            }
            class77.method613(var10, class428.field6220[var11], class263.field3853[var11], class143.field1815, arg0, class50.field760[var11], true, var11, arg2, class351.field5217, arg1, class266.field3950[var11], class112.field1452[var11]);
            class112.field1452[var11] = null;
            class50.field760[var11] = null;
            class263.field3853[var11] = null;
            class428.field6220[var11] = null;
        }
        if (!arg2) {
            if (class273.field4015) {
                class176.method1168();
            }
            if (class330.field4863 != 0) {
                class436.method2734();
            }
        }
        for (int var12 = 0; var12 < arg3; var12++) {
            class266.field3950[var12].method731();
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V", line = 457)
    public class379(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field5536 = arg4;
        this.field5537 = arg3;
        this.field5542 = arg2;
        this.field5540 = arg6;
        this.field5535 = arg1;
        this.field5547 = arg0;
        this.field5539 = arg5;
        if (this.field5540 == 255) {
            this.field5540 = 0;
        }
        this.field5534 = new class242();
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[III)Z", line = 312)
    public final boolean method2474(int arg0, int[] arg1, int arg2, int arg3) {
        field5543++;
        for (class14 var5 = (class14) this.field5534.method1575(arg2); var5 != null; var5 = (class14) this.field5534.method1573((byte) -128)) {
            if (var5.method98(-613, arg0, arg3)) {
                var5.method100(arg0, -115, arg1, arg3);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(Z)V", line = 344)
    public final void method2475(boolean arg0) {
        this.field5541 = 12800;
        this.field5551 = 0;
        this.field5533 = 0;
        this.field5538 = 12800;
        field5532++;
        for (class14 var2 = (class14) this.field5534.method1575(0); var2 != null; var2 = (class14) this.field5534.method1573((byte) -128)) {
            if (var2.field224 > this.field5533) {
                this.field5533 = var2.field224;
            }
            if (this.field5541 > var2.field220) {
                this.field5541 = var2.field220;
            }
            if (var2.field225 > this.field5551) {
                this.field5551 = var2.field225;
            }
            if (var2.field214 < this.field5538) {
                this.field5538 = var2.field214;
            }
        }
        if (arg0) {
            this.method2469(56, -75, (byte) -28, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZZILmd;I)V", line = 393)
    public static final void method2476(int arg0, boolean arg1, boolean arg2, int arg3, class233 arg4, int arg5) {
        field5545++;
        if (arg1 || class236.field3301 >= 50 || arg4 == null || arg4.field3256 == null || arg0 >= arg4.field3256.length || arg4.field3256[arg0] == null) {
            return;
        }
        int var6 = arg4.field3256[arg0][0];
        int var7 = var6 >> 8;
        int var8 = (var6 & 0xFD) >> 5;
        if (arg4.field3256[arg0].length > 1) {
            int var9 = (int) ((double) arg4.field3256[arg0].length * Math.random());
            if (var9 > 0) {
                var7 = arg4.field3256[arg0][var9];
            }
        }
        int var10 = var6 & 0x1F;
        if (var10 == 0) {
            if (arg2) {
                class230.method1494(255, var7, var8, true, 0);
            }
        } else if (class389.field5692 != 0) {
            class195.field2704[class236.field3301] = var7;
            class388.field5674[class236.field3301] = var8;
            class329.field4850[class236.field3301] = 0;
            class337.field4985[class236.field3301] = null;
            class129.field1683[class236.field3301] = 255;
            int var11 = (arg5 - 64) / 128;
            int var12 = (arg3 - 64) / 128;
            class163.field2224[class236.field3301] = (var11 << 16) + (var12 << 8) + var10;
            class236.field3301++;
        }
    }
}
