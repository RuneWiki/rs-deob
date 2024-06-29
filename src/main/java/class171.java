import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class171 {

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "Lhc;")
    private class43 field3011 = null;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "Lhc;")
    private class43 field3010 = null;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    private int field3018 = 65000;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    private int field3023;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "Lsb;")
    public static class98 field3006 = class47.method368("; Expires=", 0);

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "Ljf;")
    public static class70 field3016 = new class70(5000);

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[Lbe;")
    public static class14[] field3019 = new class14[100];

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field3022 = -1;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public static int field3007;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field3013;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "Ltg;")
    public static class75 field3021;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "[[Z")
    public static boolean[][] field3020;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II[BI)Z")
    public final boolean method1207(int arg0, int arg1, byte[] arg2, int arg3) {
        field3007++;
        class43 var5 = this.field3010;
        synchronized (this.field3010) {
            if (arg0 < ~arg1 || this.field3018 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1210(true, 88, arg1, arg3, arg2);
            if (!var6) {
                var6 = this.method1210(false, arg0 ^ 0x26, arg1, arg3, arg2);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!mi", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3014++;
        return "Cache:" + this.field3023;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
    public static void method1208(int arg0) {
        field3020 = null;
        field3006 = null;
        field3019 = null;
        field3021 = null;
        field3016 = null;
        if (arg0 != 2) {
            field3019 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lnd;IIII)V")
    public static final void method1209(class192 arg0, int arg1, int arg2, int arg3, int arg4) {
        field3009++;
        if (class163.field2943 == arg0 || class226.field3894 >= 400) {
            return;
        }
        class98 var5;
        if (arg0.field3321 == 0) {
            var5 = class186.method1288(new class98[] { arg0.method1329(arg3 - 2513), class157.method1135(9637, class163.field2943.field3324, arg0.field3324), class108.field1938, class158.field2870, class125.method930(arg3 ^ 0x62E0, arg0.field3324), class197.field3398 }, arg3 + 29618);
        } else {
            var5 = class186.method1288(new class98[] { arg0.method1329(-513), class108.field1938, class135.field2393, class125.method930(arg3 ^ 0x62E0, arg0.field3321), class197.field3398 }, 31618);
        }
        if (class111.field1975 == 1) {
            class226.method1560(class186.method1288(new class98[] { class55.field879, class33.field577, var5 }, 31618), class210.field3603, (short) 38, (byte) 120, arg2, arg1, (long) arg4);
            class107.field1918++;
        } else if (!class56.field892) {
            for (int var6 = 7; var6 >= 0; var6--) {
                if (class214.field3648[var6] != null) {
                    class68.field1092++;
                    boolean var7 = false;
                    short var8 = 0;
                    if (class245.field4315 == 0 && class214.field3648[var6].method731((byte) 119, class110.field1966)) {
                        if (class163.field2943.field3324 < arg0.field3324) {
                            var8 = 2000;
                        }
                        if (class163.field2943.field3330 != 0 && arg0.field3330 != 0) {
                            if (class163.field2943.field3330 == arg0.field3330) {
                                var8 = 2000;
                            } else {
                                var8 = 0;
                            }
                        }
                    } else if (class234.field4036[var6]) {
                        var8 = 2000;
                    }
                    short var9 = class170.field3003[var6];
                    short var10 = (short) (var8 + var9);
                    class226.method1560(class186.method1288(new class98[] { class244.field4247, var5 }, arg3 + 29618), class214.field3648[var6], var10, (byte) -3, arg2, arg1, (long) arg4);
                }
            }
        } else if ((class12.field236 & 0x8) == 8) {
            class56.field896++;
            class226.method1560(class186.method1288(new class98[] { class91.field1609, class33.field577, var5 }, 31618), class67.field1080, (short) 31, (byte) -1, arg2, arg1, (long) arg4);
        }
        if (arg3 != 2000) {
            return;
        }
        for (int var11 = 0; var11 < class226.field3894; var11++) {
            if (class212.field3630[var11] == 21) {
                class217.field3751[var11] = class186.method1288(new class98[] { class244.field4247, var5 }, 31618);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZIII[B)Z")
    private final boolean method1210(boolean arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field3008++;
        class43 var6 = this.field3010;
        synchronized (this.field3010) {
            try {
                int var8;
                if (arg0) {
                    if (((long) (arg3 * 6 + 6)) > this.field3011.method348(-57)) {
                        return false;
                    }
                    this.field3011.method342(4, (long) (arg3 * 6));
                    this.field3011.method343(6, 0, class183.field3146, 113);
                    var8 = ((class183.field3146[3] & 0xFF) << 16) - (-((class183.field3146[4] & 0xFF) << 8) - (class183.field3146[5] & 0xFF));
                    if (var8 <= 0 || (long) var8 > this.field3010.method348(-95) / 520L) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field3010.method348(-108) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class183.field3146[0] = (byte) (arg2 >> 16);
                int var10 = 19 % ((arg1 - 13) / 51);
                class183.field3146[2] = (byte) arg2;
                class183.field3146[1] = (byte) (arg2 >> 8);
                class183.field3146[4] = (byte) (var8 >> 8);
                class183.field3146[3] = (byte) (var8 >> 16);
                class183.field3146[5] = (byte) var8;
                int var11 = 0;
                this.field3011.method342(4, (long) (arg3 * 6));
                int var12 = 0;
                this.field3011.method340(0, 7559, class183.field3146, 6);
                while (arg2 > var12) {
                    int var13 = 0;
                    if (arg0) {
                        label104: {
                            this.field3010.method342(4, (long) (var8 * 520));
                            try {
                                this.field3010.method343(8, 0, class183.field3146, 74);
                            } catch (EOFException var34) {
                                return true;
                            }
                            var13 = (class183.field3146[6] & 0xFF) + ((class183.field3146[4] & 0xFF) << 16) + (class183.field3146[5] & 0xFF << 8);
                            int var14 = (class183.field3146[0] & 0xFF << 8) + (class183.field3146[1] & 0xFF);
                            int var15 = (class183.field3146[2] & 0xFF << 8) + (class183.field3146[3] & 0xFF);
                            int var16 = class183.field3146[7] & 0xFF;
                            if (arg3 == var14 && var11 == var15 && this.field3023 == var16) {
                                if (var13 >= 0 && (this.field3010.method348(-100) / 520L) >= ((long) var13)) {
                                    break label104;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var13 == 0) {
                        arg0 = false;
                        var13 = (int) ((this.field3010.method348(-23) + 519L) / 520L);
                        if (var13 == 0) {
                            var13++;
                        }
                        if (var8 == var13) {
                            var13++;
                        }
                    }
                    class183.field3146[1] = (byte) arg3;
                    if (arg2 - var12 <= 512) {
                        var13 = 0;
                    }
                    class183.field3146[5] = (byte) (var13 >> 8);
                    class183.field3146[7] = (byte) this.field3023;
                    int var19 = arg2 - var12;
                    class183.field3146[2] = (byte) (var11 >> 8);
                    class183.field3146[6] = (byte) var13;
                    class183.field3146[4] = (byte) (var13 >> 16);
                    class183.field3146[3] = (byte) var11;
                    var11++;
                    if (var19 > 512) {
                        var19 = 512;
                    }
                    class183.field3146[0] = (byte) (arg3 >> 8);
                    this.field3010.method342(4, (long) (var8 * 520));
                    this.field3010.method340(0, 7559, class183.field3146, 8);
                    this.field3010.method340(var12, 7559, arg4, var19);
                    var8 = var13;
                    var12 += var19;
                }
                return true;
            } catch (IOException var35) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IB)[B")
    public final byte[] method1211(int arg0, byte arg1) {
        if (arg1 > -116) {
            return null;
        }
        field3013++;
        class43 var3 = this.field3010;
        synchronized (this.field3010) {
            try {
                if (this.field3011.method348(-122) < ((long) (arg0 * 6 + 6))) {
                    return null;
                }
                this.field3011.method342(4, (long) (arg0 * 6));
                this.field3011.method343(6, 0, class183.field3146, 117);
                int var5 = (class183.field3146[5] & 0xFF) + ((class183.field3146[3] & 0xFF) << 16) + (class183.field3146[4] & 0xFF << 8);
                int var6 = (class183.field3146[2] & 0xFF) + (((class183.field3146[0] & 0xFF) << 16) + (class183.field3146[1] & 0xFF << 8));
                if (var6 < 0 || this.field3018 < var6) {
                    return null;
                } else if (var5 > 0 && this.field3010.method348(-64) / 520L >= (long) var5) {
                    byte[] var9 = new byte[var6];
                    int var10 = 0;
                    int var11 = 0;
                    while (var6 > var10) {
                        if (var5 == 0) {
                            return null;
                        }
                        this.field3010.method342(4, (long) (var5 * 520));
                        int var13 = var6 - var10;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3010.method343(var13 + 8, 0, class183.field3146, 97);
                        int var14 = ((class183.field3146[0] & 0xFF) << 8) + (class183.field3146[1] & 0xFF);
                        int var15 = (class183.field3146[2] & 0xFF << 8) + (class183.field3146[3] & 0xFF);
                        int var16 = (class183.field3146[6] & 0xFF) + ((class183.field3146[4] & 0xFF) << 16) + (class183.field3146[5] & 0xFF << 8);
                        int var17 = class183.field3146[7] & 0xFF;
                        if (arg0 == var14 && var11 == var15 && this.field3023 == var17) {
                            if (var16 >= 0 && (this.field3010.method348(-72) / 520L) >= ((long) var16)) {
                                var11++;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var9[var10++] = class183.field3146[var20 + 8];
                                }
                                var5 = var16;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var9;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILhc;Lhc;I)V")
    public class171(int arg0, class43 arg1, class43 arg2, int arg3) {
        this.field3010 = arg1;
        this.field3011 = arg2;
        this.field3018 = arg3;
        this.field3023 = arg0;
    }
}
