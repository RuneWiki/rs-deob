import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class246 extends class313 {

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    private int field3985 = -1;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field3988 = 0;

    @OriginalMember(owner = "client!fc", name = "T", descriptor = "Ljava/lang/String;")
    public static String field3993 = "Continue";

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "Z")
    public static boolean field3990 = false;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!fc", name = "U", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!fc", name = "V", descriptor = "I")
    public static int field3995;

    @OriginalMember(owner = "client!fc", name = "X", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!fc", name = "Y", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!fc", name = "ab", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!fc", name = "bb", descriptor = "I")
    public static int field4001;

    @OriginalMember(owner = "client!fc", name = "cb", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!fc", name = "R", descriptor = "Lvh;")
    public static class61 field3991;

    @OriginalMember(owner = "client!fc", name = "W", descriptor = "[I")
    private int[] field3996;

    @OriginalMember(owner = "client!fc", name = "Z", descriptor = "[I")
    public static int[] field3999;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILcg;II)[Lwb;", line = 5)
    public static final class171[] method1723(int arg0, class49 arg1, int arg2, int arg3) {
        if (arg2 != 0) {
            field3990 = true;
        }
        field3995++;
        return class325.method2262(arg3, (byte) -75, arg1, arg0) ? class293.method2005(-2055168936) : null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BC)Z", line = 24)
    public static final boolean method1724(byte arg0, char arg1) {
        field4002++;
        int var2 = -105 % ((-arg0 - 30) / 36);
        return arg1 >= '0' && arg1 <= '9' || arg1 >= 'A' && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)I", line = 34)
    public final int method1725(byte arg0) {
        field3992++;
        if (arg0 < 26) {
            method1724((byte) -25, 'q');
        }
        return this.field3985;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Z", line = 49)
    public static final boolean method1726(boolean arg0, int arg1) {
        class305.field4841 = arg0;
        field3987++;
        class227.field3818 = arg1 + 1 & 0xFFFF;
        return true;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V", line = 60)
    public class246() {
        super(0, false);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZZ)V", line = 71)
    public static final void method1727(int arg0, int arg1, boolean arg2, boolean arg3) {
        int var10002;
        for (int var4 = 0; var4 < class191.field3200; var4++) {
            class278 var5 = class320.field5071[class33.field468[var4]];
            if (var5 != null && var5.method981((byte) -90) && var5.field4413.method113((byte) -109)) {
                int var6 = var5.method987(3047);
                if (arg3) {
                    if (!var5.field4413.field181) {
                        continue;
                    }
                } else if (var5.field4413.field206 != arg2 || arg0 != 0 && arg0 != var6) {
                    continue;
                }
                if (var6 == 1) {
                    if ((var5.field2036 & 0x7F) == 64 && (var5.field1985 & 0x7F) == 64) {
                        int var7 = var5.field2036 >> 7;
                        int var8 = var5.field1985 >> 7;
                        if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                            var10002 = class332.field5284[var7][var8]++;
                        }
                    }
                } else if (((var6 & 0x1) != 0 || (var5.field2036 & 0x7F) == 0 && (var5.field1985 & 0x7F) == 0) && ((var6 & 0x1) != 1 || (var5.field2036 & 0x7F) == 64 && (var5.field1985 & 0x7F) == 64)) {
                    int var9 = var5.field2036 - (var6 * 64) >> 7;
                    int var10 = var5.field1985 - (var6 * 64) >> 7;
                    int var11 = var5.method987(arg1 ^ 0x5CF0) + var9;
                    if (var11 > 104) {
                        var11 = 104;
                    }
                    int var12 = var10 + var5.method987(3047);
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    if (var12 > 104) {
                        var12 = 104;
                    }
                    for (int var13 = var9; var13 < var11; var13++) {
                        for (int var14 = var10; var14 < var12; var14++) {
                            var10002 = class332.field5284[var13][var14]++;
                        }
                    }
                }
            }
        }
        if (arg1 != 22295) {
            method1723(-1, (class49) null, 43, 9);
        }
        label214: for (int var15 = 0; var15 < class191.field3200; var15++) {
            class278 var16 = class320.field5071[class33.field468[var15]];
            long var17 = (long) class33.field468[var15] << 32 | 0x20000000L;
            if (var16 != null && var16.method981((byte) -90) && var16.field4413.method113((byte) -88)) {
                int var19 = var16.method987(3047);
                if (arg3) {
                    if (!var16.field4413.field181) {
                        continue;
                    }
                } else if (var16.field4413.field206 != arg2 || arg0 != 0 && arg0 != var19) {
                    continue;
                }
                var16.field1982 = true;
                if (var19 == 1) {
                    if ((var16.field2036 & 0x7F) == 64 && (var16.field1985 & 0x7F) == 64) {
                        int var29 = var16.field1985 >> 7;
                        int var30 = var16.field2036 >> 7;
                        if (var30 < 0 || var30 >= 104 || var29 < 0 || var29 >= 104) {
                            continue;
                        }
                        if (class332.field5284[var30][var29] > 1) {
                            var10002 = class332.field5284[var30][var29]--;
                            continue;
                        }
                    }
                } else if ((var19 & 0x1) == 0 && (var16.field2036 & 0x7F) == 0 && (var16.field1985 & 0x7F) == 0 || (var19 & 0x1) == 1 && (var16.field2036 & 0x7F) == 64 && (var16.field1985 & 0x7F) == 64) {
                    int var20 = var16.field2036 - (var19 * 64) >> 7;
                    int var21 = var16.field1985 - (var19 * 64) >> 7;
                    int var22 = var20 + var19;
                    if (var20 < 0) {
                        var20 = 0;
                    }
                    if (var22 > 104) {
                        var22 = 104;
                    }
                    int var23 = var19 + var21;
                    if (var23 > 104) {
                        var23 = 104;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    boolean var24 = true;
                    for (int var25 = var20; var25 < var22; var25++) {
                        for (int var26 = var21; var26 < var23; var26++) {
                            if (class332.field5284[var25][var26] <= 1) {
                                var24 = false;
                                break;
                            }
                        }
                    }
                    if (var24) {
                        int var27 = var20;
                        while (true) {
                            if (var22 <= var27) {
                                continue label214;
                            }
                            for (int var28 = var21; var28 < var23; var28++) {
                                var10002 = class332.field5284[var27][var28]--;
                            }
                            var27++;
                        }
                    }
                }
                if (!var16.field4413.field197) {
                    var17 |= Long.MIN_VALUE;
                }
                var16.field1982 = false;
                var16.field2011 = class223.method1627((byte) -122, var16.field1985, var16.field2036, class205.field3497);
                class243.method1702(class205.field3497, var16.field2036, var16.field1985, var16.field2011, var19 * 64 + 60 - 64, var16, var16.field1946, var17, var16.field1984);
            }
        }
        field4001++;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 324)
    public final void method806(int arg0) {
        field3994++;
        super.method806(arg0);
        this.field3996 = null;
    }

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "(I)Z", line = 336)
    private final boolean method1728(int arg0) {
        if (arg0 != -1) {
            method1727(-115, 80, false, true);
        }
        field3998++;
        if (this.field3996 != null) {
            return true;
        } else if (this.field3985 >= 0) {
            int var2 = class77.field1247;
            int var3 = class133.field2269;
            int var4 = class133.field2275.method721(arg0 + 1, this.field3985).field4473 ? 64 : 128;
            this.field3996 = class133.field2275.method718((byte) -100, var4, false, this.field3985, 1.0F, var4);
            this.field3997 = var4;
            this.field3984 = var4;
            class74.method694(-44, var3, var2);
            return this.field3996 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILpi;)V", line = 366)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            field3988 = 63;
        }
        field3986++;
        if (arg0 == 0) {
            this.field3985 = arg2.method2339((byte) -46);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[[I", line = 384)
    public final int[][] method299(int arg0, int arg1) {
        field4000++;
        if (arg1 != 2) {
            field3990 = false;
        }
        int[][] var3 = this.field4958.method2404(arg0, (byte) 118);
        if (this.field4958.field5463 && this.method1728(-1)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int var6 = (class77.field1247 == this.field3984 ? arg0 : this.field3984 * arg0 / class77.field1247) * this.field3997;
            int[] var7 = var3[2];
            if (class133.field2269 == this.field3997) {
                for (int var8 = 0; var8 < class133.field2269; var8++) {
                    int var9 = this.field3996[var6++];
                    var7[var8] = class36.method319(var9, 255) << 4;
                    var5[var8] = class36.method319(65280, var9) >> 4;
                    var4[var8] = class36.method319(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; var10 < class133.field2269; var10++) {
                    int var11 = this.field3997 * var10 / class133.field2269;
                    int var12 = this.field3996[var6 + var11];
                    var7[var10] = class36.method319(var12, 255) << 4;
                    var5[var10] = class36.method319(4080, var12 >> 4);
                    var4[var10] = class36.method319(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "(I)V", line = 451)
    public static void method1729(int arg0) {
        field3993 = null;
        field3999 = null;
        if (arg0 > -5) {
            field3993 = (String) null;
        }
        field3991 = null;
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)Ln;", line = 470)
    public static final class309 method1730(byte arg0) {
        field3989++;
        int var1 = -58 / ((-arg0 - 52) / 53);
        int var2 = class39.field585[0] * class123.field2138[0];
        byte[] var3 = class191.field3205[0];
        class309 var6;
        if (class32.field452[0]) {
            byte[] var7 = class85.field1367[0];
            int[] var8 = new int[var2];
            for (int var9 = 0; var9 < var2; var9++) {
                var8[var9] = class144.method1159(class36.method319(255, var7[var9]) << 24, class40.field600[class36.method319(255, var3[var9])]);
            }
            var6 = new class273(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], var8);
        } else {
            int[] var4 = new int[var2];
            for (int var5 = 0; var5 < var2; var5++) {
                var4[var5] = class40.field600[class36.method319(var3[var5], 255)];
            }
            var6 = new class309(class308.field4901, class4.field58, class352.field5575[0], class104.field1743[0], class39.field585[0], class123.field2138[0], var4);
        }
        class15.method151(0);
        return var6;
    }
}
