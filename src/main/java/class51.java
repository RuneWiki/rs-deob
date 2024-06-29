import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class51 {

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "Lug;")
    private class195 field1098 = null;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    private int field1105 = 65000;

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Lug;")
    private class195 field1107 = null;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    private int field1103;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "I")
    public static int field1092 = 2;

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
    public static int field1100 = 99;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Loh;")
    public static class263 field1094 = class253.method1681(-118, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "[I")
    public static int[] field1104;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "[[B")
    public static byte[][] field1091;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI)Z")
    public final boolean method325(int arg0, int arg1, byte[] arg2, int arg3) {
        field1095++;
        if (arg1 >= -51) {
            this.method328((byte[]) null, false, true, -104, -63);
        }
        class195 var5 = this.field1098;
        synchronized (this.field1098) {
            if (arg3 < 0 || arg3 > this.field1105) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method328(arg2, true, true, arg3, arg0);
            if (!var6) {
                var6 = this.method328(arg2, false, true, arg3, arg0);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)[B")
    public final byte[] method326(int arg0, boolean arg1) {
        field1106++;
        class195 var3 = this.field1098;
        synchronized (this.field1098) {
            try {
                if ((long) (arg0 * 6 + 6) > this.field1107.method1328(127)) {
                    return null;
                } else if (arg1) {
                    this.field1107.method1329((long) (arg0 * 6), 56);
                    this.field1107.method1333(class151.field2716, 6, 23881, 0);
                    int var6 = (class151.field2716[5] & 0xFF) + (class151.field2716[3] & 0xFF << 16) + (class151.field2716[4] & 0xFF << 8);
                    int var7 = (class151.field2716[2] & 0xFF) + ((class151.field2716[1] & 0xFF) << 8) + (class151.field2716[0] & 0xFF << 16);
                    if (var7 < 0 || this.field1105 < var7) {
                        return null;
                    } else if (var6 > 0 && (this.field1098.method1328(-51) / 520L) >= ((long) var6)) {
                        byte[] var10 = new byte[var7];
                        int var11 = 0;
                        int var12 = 0;
                        label74: while (var7 > var12) {
                            if (var6 == 0) {
                                return null;
                            }
                            this.field1098.method1329((long) (var6 * 520), 107);
                            int var14 = var7 - var12;
                            if (var14 > 512) {
                                var14 = 512;
                            }
                            this.field1098.method1333(class151.field2716, var14 + 8, 23881, 0);
                            int var15 = (class151.field2716[0] & 0xFF << 8) + (class151.field2716[1] & 0xFF);
                            int var16 = (class151.field2716[6] & 0xFF) + (class151.field2716[4] & 0xFF << 16) + (class151.field2716[5] & 0xFF << 8);
                            int var17 = ((class151.field2716[2] & 0xFF) << 8) + (class151.field2716[3] & 0xFF);
                            int var18 = class151.field2716[7] & 0xFF;
                            if (arg0 == var15 && var11 == var17 && this.field1103 == var18) {
                                if (var16 >= 0 && this.field1098.method1328(-5) / 520L >= (long) var16) {
                                    var6 = var16;
                                    var11++;
                                    int var21 = 0;
                                    while (true) {
                                        if (var21 >= var14) {
                                            continue label74;
                                        }
                                        var10[var12++] = class151.field2716[var21 + 8];
                                        var21++;
                                    }
                                }
                                return null;
                            }
                            return null;
                        }
                        return var10;
                    } else {
                        return null;
                    }
                } else {
                    return null;
                }
            } catch (IOException var42) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILdg;IIZ)V")
    public static final void method327(int arg0, class137 arg1, int arg2, int arg3, boolean arg4) {
        field1101++;
        if (class229.field4018 == arg1 || class252.field4384 >= 400) {
            return;
        }
        class263 var5;
        if (arg1.field2512 == 0) {
            boolean var6 = true;
            if (class229.field4018.field2528 != -1 && arg1.field2528 != -1) {
                int var7 = arg1.field2528 <= class229.field4018.field2528 ? arg1.field2528 : class229.field4018.field2528;
                int var8 = class229.field4018.field2522 > arg1.field2522 ? class229.field4018.field2522 : arg1.field2522;
                int var9 = var8 * 10 / 100 + var7 + 5;
                int var10 = class229.field4018.field2522 - arg1.field2522;
                if (var10 < 0) {
                    var10 = -var10;
                }
                if (var10 > var9) {
                    var6 = false;
                }
            }
            if (arg1.field2522 < arg1.field2511) {
                var5 = class124.method797(-85, new class263[] { arg1.method896((byte) -114), var6 ? class1.method1(-1674, class229.field4018.field2522, arg1.field2522) : class98.field1880, class101.field1919, class134.field2460, class136.method891(-95, arg1.field2522), class20.field467, class136.method891(-67, arg1.field2511 - arg1.field2522), class68.field1378 });
            } else {
                var5 = class124.method797(-91, new class263[] { arg1.method896((byte) -109), var6 ? class1.method1(-1674, class229.field4018.field2522, arg1.field2522) : class98.field1880, class101.field1919, class134.field2460, class136.method891(-89, arg1.field2522), class68.field1378 });
            }
        } else {
            var5 = class124.method797(-118, new class263[] { arg1.method896((byte) -81), class101.field1919, class144.field2636, class136.method891(-62, arg1.field2512), class68.field1378 });
        }
        if (class49.field1060 == 1) {
            class220.field3898++;
            class119.method769(arg0, (long) arg3, true, arg2, (short) 47, class124.method797(-41, new class263[] { class236.field4127, class260.field4518, var5 }), class152.field2739);
        } else if (!class130.field2387) {
            for (int var11 = 7; var11 >= 0; var11--) {
                if (class41.field922[var11] != null) {
                    short var13 = 0;
                    if (class136.field2475 == 0 && class41.field922[var11].method1766(-1, class141.field2575)) {
                        if (class229.field4018.field2522 < arg1.field2522) {
                            var13 = 2000;
                        }
                        if (class229.field4018.field2541 != 0 && arg1.field2541 != 0) {
                            if (class229.field4018.field2541 == arg1.field2541) {
                                var13 = 2000;
                            } else {
                                var13 = 0;
                            }
                        }
                    } else if (class205.field3732[var11]) {
                        var13 = 2000;
                    }
                    class244.field4301++;
                    boolean var14 = false;
                    short var15 = class83.field1653[var11];
                    short var16 = (short) (var13 + var15);
                    class119.method769(arg0, (long) arg3, true, arg2, var16, class124.method797(-121, new class263[] { class98.field1880, var5 }), class41.field922[var11]);
                }
            }
        } else if ((class5.field108 & 0x8) == 8) {
            class260.field4512++;
            class119.method769(arg0, (long) arg3, arg4, arg2, (short) 49, class124.method797(-118, new class263[] { class39.field875, class260.field4518, var5 }), class151.field2727);
        }
        int var12 = 0;
        if (!arg4) {
            return;
        }
        while (class252.field4384 > var12) {
            if (class202.field3645[var12] == 40) {
                class68.field1382[var12] = class124.method797(-65, new class263[] { class98.field1880, var5 });
                return;
            }
            var12++;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "([BZZII)Z")
    private final boolean method328(byte[] arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        field1096++;
        class195 var6 = this.field1098;
        synchronized (this.field1098) {
            try {
                int var8;
                if (arg1) {
                    if (((long) (arg4 * 6 + 6)) > this.field1107.method1328(1)) {
                        return false;
                    }
                    this.field1107.method1329((long) (arg4 * 6), 118);
                    this.field1107.method1333(class151.field2716, 6, 23881, 0);
                    var8 = (class151.field2716[5] & 0xFF) + ((class151.field2716[4] & 0xFF) << 8) + (class151.field2716[3] & 0xFF << 16);
                    if (var8 <= 0 || ((long) var8) > (this.field1098.method1328(-52) / 520L)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1098.method1328(127) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class151.field2716[2] = (byte) arg3;
                class151.field2716[3] = (byte) (var8 >> 16);
                class151.field2716[5] = (byte) var8;
                class151.field2716[1] = (byte) (arg3 >> 8);
                class151.field2716[0] = (byte) (arg3 >> 16);
                if (!arg2) {
                    this.field1098 = null;
                }
                class151.field2716[4] = (byte) (var8 >> 8);
                this.field1107.method1329((long) (arg4 * 6), -118);
                this.field1107.method1336(class151.field2716, 6, 0, 117);
                int var10 = 0;
                int var11 = 0;
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg1) {
                        label108: {
                            this.field1098.method1329((long) (var8 * 520), -99);
                            try {
                                this.field1098.method1333(class151.field2716, 8, 23881, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class151.field2716[6] & 0xFF) + (class151.field2716[4] & 0xFF << 16) + (class151.field2716[5] & 0xFF << 8);
                            int var13 = ((class151.field2716[0] & 0xFF) << 8) + (class151.field2716[1] & 0xFF);
                            int var14 = (class151.field2716[2] & 0xFF << 8) + (class151.field2716[3] & 0xFF);
                            int var15 = class151.field2716[7] & 0xFF;
                            if (arg4 == var13 && var11 == var14 && this.field1103 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1098.method1328(123) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    int var18 = arg3 - var10;
                    if (var12 == 0) {
                        var12 = (int) ((this.field1098.method1328(-68) + 519L) / 520L);
                        arg1 = false;
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    if ((arg3 - var10) <= 512) {
                        var12 = 0;
                    }
                    class151.field2716[5] = (byte) (var12 >> 8);
                    class151.field2716[7] = (byte) this.field1103;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class151.field2716[2] = (byte) (var11 >> 8);
                    class151.field2716[6] = (byte) var12;
                    class151.field2716[3] = (byte) var11;
                    var11++;
                    class151.field2716[0] = (byte) (arg4 >> 8);
                    class151.field2716[1] = (byte) arg4;
                    class151.field2716[4] = (byte) (var12 >> 16);
                    this.field1098.method1329((long) (var8 * 520), -127);
                    var8 = var12;
                    this.field1098.method1336(class151.field2716, 8, 0, -49);
                    this.field1098.method1336(arg0, var18, var10, -41);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1102++;
        return "Cache:" + this.field1103;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method329(int arg0) {
        field1091 = null;
        if (arg0 == 99) {
            field1094 = null;
            field1104 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
    public static final void method330(int arg0, int arg1) {
        field1093++;
        if (class166.method1090((byte) 64, arg1)) {
            if (arg0 != 1334339848) {
                method330(-87, 94);
            }
            class102.method691(6025, -1, class164.field2974[arg1]);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIIZI)V")
    public static final void method331(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var6 = 0;
        field1097++;
        int var7 = arg3;
        int var8 = arg0 * arg0;
        int var9 = arg3 * arg3;
        if (!arg4) {
            return;
        }
        int var10 = arg3 << 1;
        int var11 = var9 << 1;
        int var12 = var8 << 1;
        int var13 = (1 - var10) * var8 + var11;
        int var14 = var9 - ((var10 - 1) * var12);
        int var15 = var9 << 2;
        int var16 = ((arg3 << 1) - 3) * var12;
        int var17 = var8 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = (var6 + 1) * var15;
        if (arg2 >= class11.field249 && class276.field4831 >= arg2) {
            int var20 = class98.method672(-257, class198.field3587, arg0 + arg5, field1099);
            int var21 = class98.method672(-257, class198.field3587, arg5 - arg0, field1099);
            class191.method1255(var21, arg1, var20, 66, class38.field870[arg2]);
        }
        int var22 = (arg3 - 1) * var17;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var14 += var19;
                    var13 += var18;
                    var18 += var15;
                    var19 += var15;
                }
            }
            if (var14 < 0) {
                var13 += var18;
                var18 += var15;
                var6++;
                var14 += var19;
                var19 += var15;
            }
            var13 += -var22;
            var14 += -var16;
            var7--;
            int var23 = arg2 + var7;
            int var24 = arg2 - var7;
            var16 -= var17;
            var22 -= var17;
            if (class11.field249 <= var23 && var24 <= class276.field4831) {
                int var25 = class98.method672(-257, class198.field3587, arg5 + var6, field1099);
                int var26 = class98.method672(-257, class198.field3587, arg5 - var6, field1099);
                if (class11.field249 <= var24) {
                    class191.method1255(var26, arg1, var25, 109, class38.field870[var24]);
                }
                if (var23 <= class276.field4831) {
                    class191.method1255(var26, arg1, var25, 100, class38.field870[var23]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(ILug;Lug;I)V")
    public class51(int arg0, class195 arg1, class195 arg2, int arg3) {
        this.field1098 = arg1;
        this.field1103 = arg0;
        this.field1105 = arg3;
        this.field1107 = arg2;
    }
}
