import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class30 {

    @OriginalMember(owner = "client!ih", name = "p", descriptor = "I")
    private int field515 = 65000;

    @OriginalMember(owner = "client!ih", name = "m", descriptor = "Lrb;")
    private class211 field512 = null;

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "Lrb;")
    private class211 field509 = null;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Lcd;")
    private static class64 field503 = class44.method335((byte) 71, "Hidden");

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lcd;")
    private static class64 field502 = class44.method335((byte) 71, " has logged in)3");

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Lcd;")
    public static class64 field501 = field502;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "Lcd;")
    public static class64 field508 = field503;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ih", name = "o", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ih", name = "q", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ih", name = "l", descriptor = "[[[B")
    public static byte[][][] field511;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IZII[B)Z", line = 4)
    private final boolean method258(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4) {
        field510++;
        class211 var6 = this.field509;
        synchronized (this.field509) {
            try {
                int var7;
                boolean var10000;
                if (arg1) {
                    if (this.field512.method1480((byte) -110) < (long) (arg3 * 6 + 6)) {
                        var10000 = false;
                        return var10000;
                    }
                    this.field512.method1492((long) (arg3 * 6), true);
                    this.field512.method1487(0, 200000000, class72.field1400, 6);
                    var7 = (class72.field1400[5] & 0xFF) + ((class72.field1400[3] & 0xFF << 16) + ((class72.field1400[4] & 0xFF) << 8));
                    if (var7 <= 0 || this.field509.method1480((byte) -110) / 520L < (long) var7) {
                        var10000 = false;
                        return var10000;
                    }
                } else {
                    var7 = (int) ((this.field509.method1480((byte) -110) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class72.field1400[2] = (byte) arg0;
                class72.field1400[4] = (byte) (var7 >> 8);
                class72.field1400[0] = (byte) (arg0 >> 16);
                class72.field1400[5] = (byte) var7;
                class72.field1400[1] = (byte) (arg0 >> 8);
                int var8 = arg2;
                class72.field1400[3] = (byte) (var7 >> 16);
                this.field512.method1492((long) (arg3 * 6), true);
                int var9 = 0;
                this.field512.method1486(0, -1, class72.field1400, 6);
                while (true) {
                    if (arg0 > var8) {
                        label139: {
                            int var10 = 0;
                            if (arg1) {
                                this.field509.method1492((long) (var7 * 520), true);
                                try {
                                    this.field509.method1487(0, arg2 + 200000000, class72.field1400, 8);
                                } catch (EOFException var18) {
                                    break label139;
                                }
                                var10 = (class72.field1400[6] & 0xFF) + ((class72.field1400[5] & 0xFF) << 8) + (class72.field1400[4] & 0xFF << 16);
                                int var12 = ((class72.field1400[0] & 0xFF) << 8) + (class72.field1400[1] & 0xFF);
                                int var13 = (class72.field1400[2] & 0xFF << 8) + (class72.field1400[3] & 0xFF);
                                int var14 = class72.field1400[7] & 0xFF;
                                if (arg3 != var12 || var9 != var13 || this.field506 != var14) {
                                    var10000 = false;
                                    return var10000;
                                }
                                if (var10 < 0 || (long) var10 > this.field509.method1480((byte) -110) / 520L) {
                                    var10000 = false;
                                    return var10000;
                                }
                            }
                            if (var10 == 0) {
                                var10 = (int) ((this.field509.method1480((byte) -110) + 519L) / 520L);
                                if (var10 == 0) {
                                    var10++;
                                }
                                if (var7 == var10) {
                                    var10++;
                                }
                                arg1 = false;
                            }
                            class72.field1400[1] = (byte) arg3;
                            if (arg0 - var8 <= 512) {
                                var10 = 0;
                            }
                            class72.field1400[6] = (byte) var10;
                            class72.field1400[0] = (byte) (arg3 >> 8);
                            class72.field1400[7] = (byte) this.field506;
                            class72.field1400[4] = (byte) (var10 >> 16);
                            class72.field1400[5] = (byte) (var10 >> 8);
                            class72.field1400[3] = (byte) var9;
                            int var15 = arg0 - var8;
                            if (var15 > 512) {
                                var15 = 512;
                            }
                            class72.field1400[2] = (byte) (var9 >> 8);
                            var9++;
                            this.field509.method1492((long) (var7 * 520), true);
                            var7 = var10;
                            this.field509.method1486(0, -1, class72.field1400, 8);
                            this.field509.method1486(var8, ~arg2, arg4, var15);
                            var8 += var15;
                            continue;
                        }
                    }
                    var10000 = true;
                    return var10000;
                }
            } catch (IOException var19) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(B)V", line = 124)
    public static final void method259(byte arg0) {
        int var1 = 0;
        field516++;
        int var2 = -55 % ((arg0 - 7) / 38);
        for (int var3 = 0; var3 < 104; var3++) {
            for (int var4 = 0; var4 < 104; var4++) {
                if (class118.method842(var4, 4095, var3, var1, class304.field5203, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "toString", descriptor = "()Ljava/lang/String;", line = 159)
    public final String toString() {
        field505++;
        return "Cache:" + this.field506;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "([BBII)Z", line = 196)
    public final boolean method260(byte[] arg0, byte arg1, int arg2, int arg3) {
        field500++;
        class211 var5 = this.field509;
        synchronized (this.field509) {
            if (arg3 < 0 || this.field515 < arg3) {
                throw new IllegalArgumentException();
            } else if (arg1 <= 28) {
                return true;
            } else {
                boolean var6 = this.method258(arg3, true, 0, arg2, arg0);
                if (!var6) {
                    var6 = this.method258(arg3, false, 0, arg2, arg0);
                }
                return var6;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(II)[B", line = 227)
    public final byte[] method261(int arg0, int arg1) {
        field504++;
        class211 var3 = this.field509;
        synchronized (this.field509) {
            try {
                Object var10000;
                if ((long) (arg1 * 6 + 6) > this.field512.method1480((byte) -110)) {
                    var10000 = null;
                    return (byte[]) var10000;
                }
                this.field512.method1492((long) (arg1 * 6), true);
                this.field512.method1487(0, 200000000, class72.field1400, 6);
                int var4 = (class72.field1400[1] & 0xFF << 8) + (((class72.field1400[arg0] & 0xFF) << 16) + (class72.field1400[2] & 0xFF));
                int var5 = ((class72.field1400[4] & 0xFF) << 8) + (class72.field1400[3] & 0xFF << 16) + (class72.field1400[5] & 0xFF);
                if (var4 < 0 || this.field515 < var4) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else if (var5 <= 0 || this.field509.method1480((byte) -110) / 520L < (long) var5) {
                    var10000 = null;
                    return (byte[]) var10000;
                } else {
                    byte[] var6 = new byte[var4];
                    int var7 = 0;
                    int var8 = 0;
                    while (var8 < var4) {
                        if (var5 == 0) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        this.field509.method1492((long) (var5 * 520), true);
                        int var9 = var4 - var8;
                        if (var9 > 512) {
                            var9 = 512;
                        }
                        this.field509.method1487(0, 200000000, class72.field1400, var9 + 8);
                        int var10 = (class72.field1400[2] & 0xFF << 8) + (class72.field1400[3] & 0xFF);
                        int var11 = (class72.field1400[4] & 0xFF << 16) + (class72.field1400[5] & 0xFF << 8) + (class72.field1400[6] & 0xFF);
                        int var12 = (class72.field1400[0] & 0xFF << 8) + (class72.field1400[1] & 0xFF);
                        int var13 = class72.field1400[7] & 0xFF;
                        if (arg1 != var12 || var7 != var10 || this.field506 != var13) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        if (var11 < 0 || (long) var11 > this.field509.method1480((byte) -110) / 520L) {
                            var10000 = null;
                            return (byte[]) var10000;
                        }
                        var7++;
                        for (int var14 = 0; var14 < var9; var14++) {
                            var6[var8++] = class72.field1400[var14 + 8];
                        }
                        var5 = var11;
                    }
                    byte[] var19 = var6;
                    return var19;
                }
            } catch (IOException var17) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(III[Lja;IBIIII)V", line = 309)
    public static final void method262(int arg0, int arg1, int arg2, class60[] arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        field513++;
        if (class123.field2216) {
            class21.method209(arg0, arg8, arg4, arg7);
        } else {
            class210.method1470(arg0, arg8, arg4, arg7);
            class50.method362();
        }
        if (arg5 != 120) {
            field503 = (class64) null;
        }
        for (int var10 = 0; var10 < arg3.length; var10++) {
            class60 var11 = arg3[var10];
            if (var11 != null && (var11.field1113 == arg1 || arg1 == -1412584499 && class263.field4511 == var11)) {
                int var12;
                if (arg2 == -1) {
                    class194.field3300[class241.field4161] = var11.field1040 + arg6;
                    class230.field3900[class241.field4161] = var11.field1032 + arg9;
                    class134.field2379[class241.field4161] = var11.field1163;
                    class47.field771[class241.field4161] = var11.field1016;
                    var12 = class241.field4161++;
                } else {
                    var12 = arg2;
                }
                var11.field1097 = var12;
                var11.field1143 = class29.field482;
                if (!var11.field1017 || !client.method1763(var11)) {
                    if (var11.field1013 > 0) {
                        class139.method991(-1, var11);
                    }
                    int var13 = var11.field1040 + arg6;
                    int var14 = var11.field1032 + arg9;
                    int var15 = var11.field1181;
                    if (class17.field346 && (client.method1762(var11) != 0 || var11.field1091 == 0) && var15 > 127) {
                        var15 = 127;
                    }
                    if (class263.field4511 == var11) {
                        if (arg1 != -1412584499 && !var11.field1158) {
                            class280.field4828 = arg6;
                            class181.field3118 = arg3;
                            class255.field4433 = arg9;
                            continue;
                        }
                        if (class163.field2872 && class175.field2999) {
                            int var16 = class281.field4835;
                            int var17 = var16 - class234.field3957;
                            if (var17 < class107.field1972) {
                                var17 = class107.field1972;
                            }
                            if ((var17 + var11.field1163) > (class107.field1972 + class183.field3133.field1163)) {
                                var17 = class107.field1972 + class183.field3133.field1163 - var11.field1163;
                            }
                            var13 = var17;
                            int var18 = class188.field3213;
                            int var19 = var18 - class115.field2116;
                            if (class48.field801 > var19) {
                                var19 = class48.field801;
                            }
                            if ((var19 + var11.field1016) > (class48.field801 + class183.field3133.field1016)) {
                                var19 = class48.field801 + class183.field3133.field1016 - var11.field1016;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1158) {
                            var15 = 128;
                        }
                    }
                    int var21;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field1091 == 2) {
                        var21 = arg0;
                        var22 = arg8;
                        var25 = arg4;
                        var24 = arg7;
                    } else {
                        int var20 = var11.field1016 + var14;
                        var21 = var13 > arg0 ? var13 : arg0;
                        var22 = arg8 < var14 ? var14 : arg8;
                        int var23 = var11.field1163 + var13;
                        if (var11.field1091 == 9) {
                            var23++;
                            var20++;
                        }
                        var24 = arg7 <= var20 ? arg7 : var20;
                        var25 = var23 >= arg4 ? arg4 : var23;
                    }
                    if (!var11.field1017 || var21 < var25 && var24 > var22) {
                        if (var11.field1013 != 0) {
                            if (var11.field1013 == 1337 || var11.field1013 == 1403 && class123.field2216) {
                                class304.field5201 = var13;
                                class49.field810 = var14;
                                class261.field4497 = var11;
                                class298.method2081(true, var11.field1163, var14, var11.field1013 == 1403, var11.field1016, var13);
                                if (class123.field2216) {
                                    class21.method209(arg0, arg8, arg4, arg7);
                                } else {
                                    class210.method1470(arg0, arg8, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field1013 == 1338) {
                                if (var11.method472(true)) {
                                    class309.method2145(false, var13, var11, var14, var12);
                                    if (class123.field2216) {
                                        class21.method209(arg0, arg8, arg4, arg7);
                                    } else {
                                        class210.method1470(arg0, arg8, arg4, arg7);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1013 == 1339) {
                                if (var11.method472(true)) {
                                    class72.method592(var14, 16375, var13, var11, var12);
                                    if (class123.field2216) {
                                        class21.method209(arg0, arg8, arg4, arg7);
                                    } else {
                                        class210.method1470(arg0, arg8, arg4, arg7);
                                    }
                                }
                                continue;
                            }
                            if (var11.field1013 == 1400) {
                                class297.method2074(var13, -87, var11.field1163, var14, var11.field1016);
                                class249.field4328[var12] = true;
                                class267.field4582[var12] = true;
                                if (class123.field2216) {
                                    class21.method209(arg0, arg8, arg4, arg7);
                                } else {
                                    class210.method1470(arg0, arg8, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field1013 == 1401) {
                                class160.method1157(var11.field1163, var13, var11.field1016, var14, (byte) -103);
                                class249.field4328[var12] = true;
                                class267.field4582[var12] = true;
                                if (class123.field2216) {
                                    class21.method209(arg0, arg8, arg4, arg7);
                                } else {
                                    class210.method1470(arg0, arg8, arg4, arg7);
                                }
                                continue;
                            }
                            if (var11.field1013 == 1402) {
                                if (!class123.field2216) {
                                    class166.method1184(var13, var14, false);
                                    class249.field4328[var12] = true;
                                    class267.field4582[var12] = true;
                                }
                                continue;
                            }
                            if (var11.field1013 == 1405) {
                                if (!class247.field4299) {
                                    continue;
                                }
                                int var26 = var14 + 15;
                                int var27 = var13 + var11.field1163;
                                class278.field4796.method1261(class104.method768(new class64[] { class301.field5170, class310.method2149(class104.field1928, (byte) 90) }, false), var27, var26, 16776960, -1);
                                int var28 = 16776960;
                                int var126 = var26 + 15;
                                Runtime var29 = Runtime.getRuntime();
                                int var30 = (int) ((var29.totalMemory() - var29.freeMemory()) / 1024L);
                                if (var30 > 65536) {
                                    var28 = 16711680;
                                }
                                class278.field4796.method1261(class104.method768(new class64[] { class161.field2832, class310.method2149(var30, (byte) 125), class264.field4547 }, false), var27, var126, var28, -1);
                                var26 = var126 + 15;
                                if (class123.field2216) {
                                    int var31 = (class285.field4891 + class285.field4889 + class285.field4890) / 1024;
                                    int var32 = 16776960;
                                    if (var31 > 65536) {
                                        var32 = 16711680;
                                    }
                                    class278.field4796.method1261(class104.method768(new class64[] { class56.field940, class310.method2149(var31, (byte) -97), class264.field4547 }, false), var27, var26, var32, -1);
                                    var26 += 15;
                                }
                                int var33 = 16776960;
                                int var34 = 0;
                                int var35 = 0;
                                int var36 = 0;
                                for (int var37 = 0; var37 < 27; var37++) {
                                    var36 += class158.field2781[var37].method255((byte) -111);
                                    var35 += class158.field2781[var37].method247(255);
                                    var34 += class158.field2781[var37].method254(0);
                                }
                                int var38 = var34 * 100 / var36;
                                int var39 = var35 * 10000 / var36;
                                class64 var40 = class104.method768(new class64[] { class169.field2941, class238.method1734(true, 0, 2, (long) var39, true), class180.field3093, class310.method2149(var38, (byte) 113), class280.field4826 }, false);
                                class180.field3091.method1261(var40, var27, var26, var33, -1);
                                var26 += 12;
                                class249.field4328[var12] = true;
                                class267.field4582[var12] = true;
                                continue;
                            }
                        }
                        if (!class101.field1828) {
                            if (var11.field1091 == 0 && var11.field1133 && var21 <= class278.field4789 && var22 <= class245.field4259 && var25 > class278.field4789 && var24 > class245.field4259 && !class17.field346) {
                                class220.field3736 = 1;
                                class289.field4934[0] = 1006;
                                class153.field2715[0] = class53.field852;
                                class69.field1334[0] = class188.field3240;
                            }
                            if (var21 <= class278.field4789 && class245.field4259 >= var22 && var25 > class278.field4789 && var24 > class245.field4259) {
                                class172.method1209(var11, class245.field4259 - var14, -var13 + class278.field4789, true);
                            }
                        }
                        if (var11.field1091 == 0) {
                            if (!var11.field1017 && client.method1763(var11) && class189.field3256 != var11) {
                                continue;
                            }
                            if (!var11.field1017) {
                                if (var11.field1171 - var11.field1016 < var11.field1022) {
                                    var11.field1022 = var11.field1171 - var11.field1016;
                                }
                                if (var11.field1022 < 0) {
                                    var11.field1022 = 0;
                                }
                            }
                            method262(var21, var11.field1080, var12, arg3, var25, (byte) 120, var13 - var11.field1175, var24, var22, var14 - var11.field1022);
                            if (var11.field1100 != null) {
                                method262(var21, var11.field1080, var12, var11.field1100, var25, (byte) 120, var13 - var11.field1175, var24, var22, var14 - var11.field1022);
                            }
                            class172 var41 = (class172) class159.field2805.method1151((long) var11.field1080, 0);
                            if (var41 != null) {
                                if (var41.field2972 == 0 && !class101.field1828 && var21 <= class278.field4789 && class245.field4259 >= var22 && class278.field4789 < var25 && class245.field4259 < var24 && !class17.field346) {
                                    class153.field2715[0] = class53.field852;
                                    class220.field3736 = 1;
                                    class69.field1334[0] = class188.field3240;
                                    class289.field4934[0] = 1006;
                                }
                                class264.method1854(var14, var24, var22, var12, 15706, var25, var41.field2967, var21, var13);
                            }
                            if (class123.field2216) {
                                class21.method209(arg0, arg8, arg4, arg7);
                            } else {
                                class210.method1470(arg0, arg8, arg4, arg7);
                                class50.method362();
                            }
                        }
                        if (class117.field2137[var12] || class126.field2264 > 1) {
                            if (var11.field1091 == 0 && !var11.field1017 && var11.field1171 > var11.field1016) {
                                class314.method2174(var14, arg5 - 104, var11.field1022, var11.field1171, var11.field1163 + var13, var11.field1016);
                            }
                            if (var11.field1091 != 1) {
                                if (var11.field1091 == 2) {
                                    int var42 = 0;
                                    for (int var43 = 0; var43 < var11.field1134; var43++) {
                                        for (int var44 = 0; var44 < var11.field1161; var44++) {
                                            int var45 = var13 + ((var11.field1074 + 32) * var44);
                                            int var46 = var14 + ((var11.field1098 + 32) * var43);
                                            if (var42 < 20) {
                                                var45 += var11.field1103[var42];
                                                var46 += var11.field1115[var42];
                                            }
                                            if (var11.field1117[var42] > 0) {
                                                boolean var48 = false;
                                                boolean var49 = false;
                                                int var50 = var11.field1117[var42] - 1;
                                                if (var45 + 32 > arg0 && var45 < arg4 && var46 + 32 > arg8 && arg7 > var46 || class265.field4561 == var11 && class71.field1377 == var42) {
                                                    class40 var51;
                                                    if (class77.field1453 == 1 && class107.field1976 == var42 && class108.field2001 == var11.field1080) {
                                                        var51 = class253.method1810(var50, 0, true, var11.field1110[var42], var11.field1165, 2);
                                                    } else {
                                                        var51 = class253.method1810(var50, 3153952, true, var11.field1110[var42], var11.field1165, 1);
                                                    }
                                                    if (class50.field815) {
                                                        class249.field4328[var12] = true;
                                                    }
                                                    if (var51 == null) {
                                                        class190.method1342(var11, 0);
                                                    } else if (class265.field4561 == var11 && class71.field1377 == var42) {
                                                        int var52 = class188.field3213 - class273.field4690;
                                                        if (var52 < 5 && var52 > -5) {
                                                            var52 = 0;
                                                        }
                                                        int var53 = class281.field4835 - class134.field2383;
                                                        if (var53 < 5 && var53 > -5) {
                                                            var53 = 0;
                                                        }
                                                        if (class81.field1504 < 5) {
                                                            var52 = 0;
                                                            var53 = 0;
                                                        }
                                                        var51.method312(var45 + var53, var46 - -var52, 128);
                                                        if (arg1 != -1) {
                                                            class60 var54 = arg3[arg1 & 0xFFFF];
                                                            int var55;
                                                            int var56;
                                                            if (class123.field2216) {
                                                                var55 = class21.field371;
                                                                var56 = class21.field368;
                                                            } else {
                                                                var55 = class210.field3530;
                                                                var56 = class210.field3534;
                                                            }
                                                            if (var55 > (var46 + var52) && var54.field1022 > 0) {
                                                                int var57 = (var55 - var46 - var52) * class249.field4327 / 3;
                                                                if (var57 > (class249.field4327 * 10)) {
                                                                    var57 = class249.field4327 * 10;
                                                                }
                                                                if (var54.field1022 < var57) {
                                                                    var57 = var54.field1022;
                                                                }
                                                                var54.field1022 -= var57;
                                                                class273.field4690 += var57;
                                                                class190.method1342(var54, arg5 - 120);
                                                            }
                                                            if ((var46 + var52 + 32) > var56 && var54.field1022 < (var54.field1171 - var54.field1016)) {
                                                                int var58 = (var52 + var46 + 32 - var56) * class249.field4327 / 3;
                                                                if (class249.field4327 * 10 < var58) {
                                                                    var58 = class249.field4327 * 10;
                                                                }
                                                                if (var58 > (var54.field1171 - (var54.field1016 + var54.field1022))) {
                                                                    var58 = var54.field1171 - var54.field1016 - var54.field1022;
                                                                }
                                                                class273.field4690 -= var58;
                                                                var54.field1022 += var58;
                                                                class190.method1342(var54, 0);
                                                            }
                                                        }
                                                    } else if (class8.field180 == var11 && class72.field1387 == var42) {
                                                        var51.method312(var45, var46, 128);
                                                    } else {
                                                        var51.method306(var45, var46);
                                                    }
                                                }
                                            } else if (var11.field1127 != null && var42 < 20) {
                                                class40 var47 = var11.method467(var42, (byte) 68);
                                                if (var47 != null) {
                                                    var47.method306(var45, var46);
                                                } else if (class26.field425) {
                                                    class190.method1342(var11, 0);
                                                }
                                            }
                                            var42++;
                                        }
                                    }
                                } else if (var11.field1091 == 3) {
                                    int var59;
                                    if (class48.method356(var11, (byte) -62)) {
                                        var59 = var11.field1120;
                                        if (class189.field3256 == var11 && var11.field1060 != 0) {
                                            var59 = var11.field1060;
                                        }
                                    } else {
                                        var59 = var11.field1024;
                                        if (class189.field3256 == var11 && var11.field1066 != 0) {
                                            var59 = var11.field1066;
                                        }
                                    }
                                    if (var15 == 0) {
                                        if (var11.field1089) {
                                            if (class123.field2216) {
                                                class21.method208(var13, var14, var11.field1163, var11.field1016, var59);
                                            } else {
                                                class210.method1469(var13, var14, var11.field1163, var11.field1016, var59);
                                            }
                                        } else if (class123.field2216) {
                                            class21.method212(var13, var14, var11.field1163, var11.field1016, var59);
                                        } else {
                                            class210.method1468(var13, var14, var11.field1163, var11.field1016, var59);
                                        }
                                    } else if (var11.field1089) {
                                        if (class123.field2216) {
                                            class21.method206(var13, var14, var11.field1163, var11.field1016, var59, 256 - (var15 & 0xFF));
                                        } else {
                                            class210.method1464(var13, var14, var11.field1163, var11.field1016, var59, 256 - (var15 & 0xFF));
                                        }
                                    } else if (class123.field2216) {
                                        class21.method205(var13, var14, var11.field1163, var11.field1016, var59, 256 - (var15 & 0xFF));
                                    } else {
                                        class210.method1477(var13, var14, var11.field1163, var11.field1016, var59, 256 - (var15 & 0xFF));
                                    }
                                } else if (var11.field1091 == 4) {
                                    class179 var60 = var11.method466(class99.field1796, (byte) 110);
                                    if (var60 != null) {
                                        class64 var61 = var11.field1053;
                                        int var62;
                                        if (class48.method356(var11, (byte) -63)) {
                                            var62 = var11.field1120;
                                            if (class189.field3256 == var11 && var11.field1060 != 0) {
                                                var62 = var11.field1060;
                                            }
                                            if (var11.field1180.method540(28981) > 0) {
                                                var61 = var11.field1180;
                                            }
                                        } else {
                                            var62 = var11.field1024;
                                            if (class189.field3256 == var11 && var11.field1066 != 0) {
                                                var62 = var11.field1066;
                                            }
                                        }
                                        if (var11.field1017 && var11.field1169 != -1) {
                                            class92 var63 = class132.method949(var11.field1169, false);
                                            var61 = var63.field1669;
                                            if (var61 == null) {
                                                var61 = class104.field1927;
                                            }
                                            if ((var63.field1704 == 1 || var11.field1088 != 1) && var11.field1088 != -1) {
                                                var61 = class104.method768(new class64[] { class190.field3261, var61, class105.field1937, class126.method911(var11.field1088, 0) }, false);
                                            }
                                        }
                                        if (class106.field1952 == var11) {
                                            var61 = class157.field2777;
                                            var62 = var11.field1024;
                                        }
                                        if (!var11.field1017) {
                                            var61 = class265.method1857(var11, -111, var61);
                                        }
                                        var60.method1257(var61, var13, var14, var11.field1163, var11.field1016, var62, var11.field1078 ? 0 : -1, var11.field1136, var11.field1118, var11.field1018);
                                    } else if (class26.field425) {
                                        class190.method1342(var11, arg5 ^ 0x78);
                                    }
                                } else if (var11.field1091 == 5) {
                                    if (var11.field1017) {
                                        class40 var65;
                                        if (var11.field1169 == -1) {
                                            var65 = var11.method463(false, 255);
                                        } else {
                                            var65 = class253.method1810(var11.field1169, var11.field1044, true, var11.field1088, var11.field1165, var11.field1028);
                                        }
                                        if (var65 != null) {
                                            int var66 = var65.field632;
                                            int var67 = var65.field622;
                                            if (var11.field1176) {
                                                int var68 = (var66 + var11.field1163 - 1) / var66;
                                                int var69 = (-(-var67 - var11.field1016) - 1) / var67;
                                                if (class123.field2216) {
                                                    class136 var70 = (class136) var65;
                                                    class21.method214(var13, var14, var11.field1163 + var13, var14 - -var11.field1016);
                                                    boolean var71 = class155.method1119((byte) -78, var65.field627);
                                                    boolean var72 = class155.method1119((byte) -78, var65.field629);
                                                    if (var71 && var72) {
                                                        if (var15 == 0) {
                                                            var70.method975(var13, var14, var68, var69);
                                                        } else {
                                                            var70.method972(var13, var14, 256 - (var15 & 0xFF), var68, var69);
                                                        }
                                                    } else if (var71) {
                                                        for (int var76 = 0; var76 < var69; var76++) {
                                                            if (var15 == 0) {
                                                                var70.method975(var13, var67 * var76 + var14, var68, 1);
                                                            } else {
                                                                var70.method972(var13, var14 + (var67 * var76), -(var15 & 0xFF) + 256, var68, 1);
                                                            }
                                                        }
                                                    } else if (var72) {
                                                        for (int var73 = 0; var73 < var68; var73++) {
                                                            if (var15 == 0) {
                                                                var70.method975(var13 + (var66 * var73), var14, 1, var69);
                                                            } else {
                                                                var70.method972(var13 + (var66 * var73), var14, 256 - (var15 & 0xFF), 1, var69);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var74 = 0; var74 < var68; var74++) {
                                                            for (int var75 = 0; var75 < var69; var75++) {
                                                                if (var15 == 0) {
                                                                    var65.method306(var13 + (var66 * var74), var67 * var75 + var14);
                                                                } else {
                                                                    var65.method312(var66 * var74 + var13, var67 * var75 + var14, 256 - (var15 & 0xFF));
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class21.method209(arg0, arg8, arg4, arg7);
                                                } else {
                                                    class210.method1465(var13, var14, var11.field1163 + var13, var14 - -var11.field1016);
                                                    for (int var77 = 0; var77 < var68; var77++) {
                                                        for (int var78 = 0; var78 < var69; var78++) {
                                                            if (var11.field1155 != 0) {
                                                                var65.method311(var67 * var78 + var67 / 2 + var14, 4096, var11.field1155, (byte) -90, var66 / 2 + var66 * var77 + var13);
                                                            } else if (var15 == 0) {
                                                                var65.method306(var66 * var77 + var13, var67 * var78 + var14);
                                                            } else {
                                                                var65.method312(var66 * var77 + var13, var14 - -(var67 * var78), 256 - (var15 & 0xFF));
                                                            }
                                                        }
                                                    }
                                                    class210.method1470(arg0, arg8, arg4, arg7);
                                                }
                                            } else {
                                                int var79 = var11.field1163 * 4096 / var66;
                                                if (var11.field1155 != 0) {
                                                    var65.method311(var14 + (var11.field1016 / 2), var79, var11.field1155, (byte) -90, var13 + (var11.field1163 / 2));
                                                } else if (var15 != 0) {
                                                    var65.method310(var13, var14, var11.field1163, var11.field1016, 256 - (var15 & 0xFF));
                                                } else if (var11.field1163 == var66 && var11.field1016 == var67) {
                                                    var65.method306(var13, var14);
                                                } else {
                                                    var65.method309(var13, var14, var11.field1163, var11.field1016);
                                                }
                                            }
                                        } else if (class26.field425) {
                                            class190.method1342(var11, 0);
                                        }
                                    } else {
                                        class40 var64 = var11.method463(class48.method356(var11, (byte) -88), 255);
                                        if (var64 != null) {
                                            var64.method306(var13, var14);
                                        } else if (class26.field425) {
                                            class190.method1342(var11, 0);
                                        }
                                    }
                                } else if (var11.field1091 == 6) {
                                    boolean var107 = class48.method356(var11, (byte) -123);
                                    int var108;
                                    if (var107) {
                                        var108 = var11.field1061;
                                    } else {
                                        var108 = var11.field1026;
                                    }
                                    int var109 = 0;
                                    class243 var110 = null;
                                    if (var11.field1169 != -1) {
                                        class92 var115 = class132.method949(var11.field1169, false);
                                        if (var115 != null) {
                                            class92 var116 = var115.method706(var11.field1088, (byte) -54);
                                            class199 var117 = var108 == -1 ? null : class281.method1944(var108, 0);
                                            var110 = var116.method704(var117, var11.field1082, 1, -98);
                                            if (var110 == null) {
                                                class190.method1342(var11, 0);
                                            } else {
                                                var109 = -var110.method48() / 2;
                                            }
                                        }
                                    } else if (var11.field1012 == 5) {
                                        if (var11.field1067 == -1) {
                                            var110 = class244.field4209.method2155((class199) null, (class199) null, -1, -1, false);
                                        } else {
                                            int var112 = var11.field1067 & 0x7FF;
                                            if (class149.field2632 == var112) {
                                                var112 = 2047;
                                            }
                                            class41 var113 = class284.field4888[var112];
                                            class199 var114 = var108 == -1 ? null : class281.method1944(var108, arg5 ^ 0x78);
                                            if (var113 != null && ((int) var113.field672.method509(31492) << 11) == (var11.field1067 & 0xFFFFF800)) {
                                                var110 = var113.field639.method2155(var114, (class199) null, 0, var11.field1082, false);
                                            }
                                        }
                                    } else if (var108 == -1) {
                                        var110 = var11.method469(var107, class139.field2472.field639, -1, (class199) null, true);
                                        if (var110 == null && class26.field425) {
                                            class190.method1342(var11, 0);
                                        }
                                    } else {
                                        class199 var111 = class281.method1944(var108, 0);
                                        var110 = var11.method469(var107, class139.field2472.field639, var11.field1082, var111, true);
                                        if (var110 == null && class26.field425) {
                                            class190.method1342(var11, 0);
                                        }
                                    }
                                    if (var110 != null) {
                                        int var118;
                                        if (var11.field1132 <= 0) {
                                            var118 = 256;
                                        } else {
                                            var118 = (var11.field1016 << 8) / var11.field1132;
                                        }
                                        int var119;
                                        if (var11.field1140 <= 0) {
                                            var119 = 256;
                                        } else {
                                            var119 = (var11.field1163 << 8) / var11.field1140;
                                        }
                                        int var120 = (var11.field1160 * var119 >> 8) + var11.field1163 / 2 + var13;
                                        int var121 = (var11.field1177 * var118 >> 8) + var11.field1016 / 2 + var14;
                                        if (class123.field2216) {
                                            if (var11.field1071) {
                                                class123.method893(var120, var121, var11.field1148, var11.field1054, var119, var118);
                                            } else {
                                                class123.method889(var120, var121, var119, var118);
                                                class123.method877((float) var11.field1037, (float) var11.field1054 * 1.5F);
                                            }
                                            class123.method888();
                                            class123.method865(true);
                                            class123.method895(false);
                                            class17.method176((byte) -105);
                                            if (class149.field2617) {
                                                class21.method203();
                                                class123.method870();
                                                class21.method209(arg0, arg8, arg4, arg7);
                                                class149.field2617 = false;
                                            }
                                            if (var11.field1166) {
                                                class123.method891();
                                            }
                                            int var122 = class50.field826[var11.field1146] * var11.field1148 >> 16;
                                            int var123 = class50.field820[var11.field1146] * var11.field1148 >> 16;
                                            if (var11.field1017) {
                                                var110.method22(0, var11.field1009, var11.field1105, var11.field1146, var11.field1173, var109 + var122 + var11.field1153, var11.field1153 + var123);
                                            } else {
                                                var110.method22(0, var11.field1009, 0, var11.field1146, 0, var122, var123);
                                            }
                                            if (var11.field1166) {
                                                class123.method872();
                                            }
                                        } else {
                                            class50.method365(var120, var121);
                                            int var124 = class50.field826[var11.field1146] * var11.field1148 >> 16;
                                            int var125 = class50.field820[var11.field1146] * var11.field1148 >> 16;
                                            if (!var11.field1017) {
                                                var110.method22(0, var11.field1009, 0, var11.field1146, 0, var124, var125);
                                            } else if (var11.field1071) {
                                                ((class5) var110).method28(0, var11.field1009, var11.field1105, var11.field1146, var11.field1173, var124 + var109 + var11.field1153, var11.field1153 + var125, var11.field1148);
                                            } else {
                                                var110.method22(0, var11.field1009, var11.field1105, var11.field1146, var11.field1173, var109 + var124 + var11.field1153, var11.field1153 + var125);
                                            }
                                            class50.method379();
                                        }
                                    }
                                } else {
                                    if (var11.field1091 == 7) {
                                        class179 var80 = var11.method466(class99.field1796, (byte) 115);
                                        if (var80 == null) {
                                            if (class26.field425) {
                                                class190.method1342(var11, 0);
                                            }
                                            continue;
                                        }
                                        int var81 = 0;
                                        for (int var82 = 0; var82 < var11.field1134; var82++) {
                                            for (int var83 = 0; var83 < var11.field1161; var83++) {
                                                if (var11.field1117[var81] > 0) {
                                                    class92 var84 = class132.method949(var11.field1117[var81] - 1, false);
                                                    class64 var85;
                                                    if (var84.field1704 != 1 && var11.field1110[var81] == 1) {
                                                        var85 = class104.method768(new class64[] { class190.field3261, var84.field1669, class99.field1801 }, false);
                                                    } else {
                                                        var85 = class104.method768(new class64[] { class190.field3261, var84.field1669, class105.field1937, class126.method911(var11.field1110[var81], 0) }, false);
                                                    }
                                                    int var86 = (var11.field1098 + 12) * var82 + var14;
                                                    int var87 = (var11.field1074 + 115) * var83 + var13;
                                                    if (var11.field1136 == 0) {
                                                        var80.method1269(var85, var87, var86, var11.field1024, var11.field1078 ? 0 : -1);
                                                    } else if (var11.field1136 == 1) {
                                                        var80.method1263(var85, var87 + 57, var86, var11.field1024, var11.field1078 ? 0 : -1);
                                                    } else {
                                                        var80.method1261(var85, var87 + 115 - 1, var86, var11.field1024, var11.field1078 ? 0 : -1);
                                                    }
                                                }
                                                var81++;
                                            }
                                        }
                                    }
                                    if (var11.field1091 == 8 && class297.field5116 == var11 && class270.field4664 == class131.field2328) {
                                        int var88 = 0;
                                        int var89 = 0;
                                        class64 var90 = var11.field1053;
                                        class179 var91 = class278.field4796;
                                        class64 var92 = class265.method1857(var11, -120, var90);
                                        while (var92.method540(28981) > 0) {
                                            int var93 = var92.method500(84, class162.field2847);
                                            class64 var94;
                                            if (var93 == -1) {
                                                var94 = var92;
                                                var92 = class188.field3240;
                                            } else {
                                                var94 = var92.method524(var93, (byte) 121, 0);
                                                var92 = var92.method508((byte) 99, var93 + 4);
                                            }
                                            int var95 = var91.method1276(var94);
                                            var88 += var91.field3032 + 1;
                                            if (var89 < var95) {
                                                var89 = var95;
                                            }
                                        }
                                        var88 += 7;
                                        var89 += 6;
                                        int var96 = var11.field1016 + var14 + 5;
                                        int var97 = var11.field1163 + var13 - var89 - 5;
                                        if (var97 < var13 + 5) {
                                            var97 = var13 + 5;
                                        }
                                        if ((var88 + var96) > arg7) {
                                            var96 = arg7 - var88;
                                        }
                                        if (var89 + var97 > arg4) {
                                            var97 = arg4 - var89;
                                        }
                                        if (class123.field2216) {
                                            class21.method208(var97, var96, var89, var88, 16777120);
                                            class21.method212(var97, var96, var89, var88, 0);
                                        } else {
                                            class210.method1469(var97, var96, var89, var88, 16777120);
                                            class210.method1468(var97, var96, var89, var88, 0);
                                        }
                                        class64 var98 = var11.field1053;
                                        int var99 = var91.field3032 + var96 + 2;
                                        class64 var100 = class265.method1857(var11, arg5 - 239, var98);
                                        while (var100.method540(arg5 + 28861) > 0) {
                                            int var101 = var100.method500(-19, class162.field2847);
                                            class64 var102;
                                            if (var101 == -1) {
                                                var102 = var100;
                                                var100 = class188.field3240;
                                            } else {
                                                var102 = var100.method524(var101, (byte) 92, 0);
                                                var100 = var100.method508((byte) 99, var101 + 4);
                                            }
                                            var91.method1269(var102, var97 + 3, var99, 0, -1);
                                            var99 += var91.field3032 + 1;
                                        }
                                    }
                                    if (var11.field1091 == 9) {
                                        int var103;
                                        int var104;
                                        int var105;
                                        int var106;
                                        if (var11.field1034) {
                                            var103 = var11.field1016 + var14;
                                            var106 = var14;
                                            var104 = var13;
                                            var105 = var11.field1163 + var13;
                                        } else {
                                            var103 = var14;
                                            var104 = var13;
                                            var105 = var11.field1163 + var13;
                                            var106 = var11.field1016 + var14;
                                        }
                                        if (var11.field1051 == 1) {
                                            if (class123.field2216) {
                                                class21.method211(var104, var103, var105, var106, var11.field1024);
                                            } else {
                                                class210.method1476(var104, var103, var105, var106, var11.field1024);
                                            }
                                        } else if (class123.field2216) {
                                            class21.method207(var104, var103, var105, var106, var11.field1024, var11.field1051);
                                        } else {
                                            class210.method1473(var104, var103, var105, var106, var11.field1024, var11.field1051);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ZLqm;)Z", line = 1516)
    public static final boolean method263(boolean arg0, class222 arg1) {
        field514++;
        if (arg1.method1585(class82.field1520, 1)) {
            return true;
        } else {
            if (!arg0) {
                field511 = (byte[][][]) ((byte[][][]) null);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V", line = 1531)
    public static void method264(int arg0) {
        field501 = null;
        if (arg0 != -31836) {
            method262(-37, -23, -91, (class60[]) null, -82, (byte) 28, 102, -111, 96, 79);
        }
        field511 = (byte[][][]) null;
        field502 = null;
        field508 = null;
        field503 = null;
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILrb;Lrb;I)V", line = 1568)
    public class30(int arg0, class211 arg1, class211 arg2, int arg3) {
        this.field509 = arg1;
        this.field506 = arg0;
        this.field515 = arg3;
        this.field512 = arg2;
    }
}
