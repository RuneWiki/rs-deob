import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class73 extends class68 {

    @OriginalMember(owner = "client!hj", name = "W", descriptor = "I")
    private int field1007 = 2048;

    @OriginalMember(owner = "client!hj", name = "cb", descriptor = "I")
    private int field1013 = 2048;

    @OriginalMember(owner = "client!hj", name = "Q", descriptor = "I")
    private int field1002 = 0;

    @OriginalMember(owner = "client!hj", name = "ab", descriptor = "I")
    private int field1011 = 12288;

    @OriginalMember(owner = "client!hj", name = "fb", descriptor = "I")
    private int field1016 = 0;

    @OriginalMember(owner = "client!hj", name = "S", descriptor = "I")
    private int field1004 = 8192;

    @OriginalMember(owner = "client!hj", name = "jb", descriptor = "I")
    private int field1020 = 4096;

    @OriginalMember(owner = "client!hj", name = "R", descriptor = "Ljava/lang/String;")
    public static String field1003 = "Connection lost.";

    @OriginalMember(owner = "client!hj", name = "N", descriptor = "[Z")
    public static boolean[] field999 = new boolean[100];

    @OriginalMember(owner = "client!hj", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1005 = null;

    @OriginalMember(owner = "client!hj", name = "P", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!hj", name = "V", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!hj", name = "X", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!hj", name = "Y", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!hj", name = "Z", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!hj", name = "bb", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!hj", name = "db", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!hj", name = "eb", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!hj", name = "gb", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!hj", name = "hb", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!hj", name = "ib", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!hj", name = "O", descriptor = "[I")
    public static int[] field1000;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 >= -118) {
            return null;
        } else {
            ++field1014;
            int[] var3 = super.field917.method1920(arg0, true);
            if (super.field917.field4474) {
                int var4 = class127.field1794[arg0] + -2048;
                for (int var5 = 0; var5 < class89.field1248; ++var5) {
                    int var6 = this.field1016 + var4;
                    int var7 = class215.field3231[var5] + -2048;
                    int var8 = this.field1007 + var4;
                    int var9 = this.field1013 + var7;
                    int var10 = ~var9 <= 2047 ? var9 : var9 - -4096;
                    int var11 = ~var10 >= -2049 ? var10 : var10 + -4096;
                    int var12 = var8 < -2048 ? var8 + 4096 : var8;
                    int var13 = var6 < -2048 ? var6 - -4096 : var6;
                    int var14 = this.field1002 + var7;
                    int var15 = ~var13 >= -2049 ? var13 : var13 + -4096;
                    int var16 = ~var12 >= -2049 ? var12 : var12 - 4096;
                    int var17 = ~var14 > 2047 ? var14 + 4096 : var14;
                    int var18 = ~var17 >= -2049 ? var17 : var17 + -4096;
                    var3[var5] = !this.method459(255, var11, var15) && !this.method458(var16, var18, 4096) ? 0 : 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(III)Z")
    private final boolean method458(int arg0, int arg1, int arg2) {
        int var4 = (arg0 + arg1) * this.field1011 >> 12;
        ++field1010;
        int var5 = class54.field778[(var4 * 255 & 1047734) >> 12];
        int var6 = (var5 << 12) / this.field1011;
        int var7 = (var6 << 12) / this.field1004;
        if (arg2 != 4096) {
            method460((byte) -96, (class88) null);
        }
        int var8 = this.field1020 * var7 >> 12;
        return arg0 - arg1 < var8 && -var8 < arg0 - arg1;
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(III)Z")
    private final boolean method459(int arg0, int arg1, int arg2) {
        int var4 = (-arg1 + arg2) * this.field1011 >> 12;
        ++field1008;
        int var5 = class54.field778[255 & arg0 * var4 >> 12];
        int var6 = (var5 << 12) / this.field1011;
        int var7 = (var6 << 12) / this.field1004;
        int var8 = this.field1020 * var7 >> 12;
        return arg1 - -arg2 < var8 && -var8 < arg1 - -arg2;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(BLai;)V")
    public static final void method460(byte arg0, class88 arg1) {
        ++field1018;
        if (arg0 < 70) {
            field1000 = null;
        }
        class71 var2 = (class71) class95.field1343.method23(216, method465((byte) -98, arg1.field1217));
        if (var2 != null) {
            if (var2.field989 != null) {
                class21.field298.method360(var2.field989);
                var2.field989 = null;
            }
            var2.method1115(-128);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field1019;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field1004 = arg0.method1445(false);
                                }
                            } else {
                                this.field1020 = arg0.method1445(!arg2);
                            }
                        } else {
                            this.field1011 = arg0.method1445(!arg2);
                        }
                    } else {
                        this.field1007 = arg0.method1445(false);
                    }
                } else {
                    this.field1002 = arg0.method1445(false);
                }
            } else {
                this.field1016 = arg0.method1445(false);
            }
        } else {
            this.field1013 = arg0.method1445(!arg2);
        }
        if (!arg2) {
            this.field1016 = -113;
        }
    }

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "(B)V")
    public static final void method461(byte arg0) {
        class221.field3312.method544(false);
        ++field1017;
        class227.field3445.method544(false);
        if (arg0 != 53) {
            method462((byte) -26);
        }
    }

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "(B)V")
    public static void method462(byte arg0) {
        field1005 = null;
        if (arg0 != 27) {
            method462((byte) -24);
        }
        field1003 = null;
        field999 = null;
        field1000 = null;
    }

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        ++field1012;
        if (arg0 > -18) {
            this.method28((class224) null, -83, true);
        }
        class250.method1674(true);
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class73() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)Lna;")
    public static final class32 method463(int arg0, int arg1) {
        ++field1001;
        class32 var2 = (class32) class181.field2533.method540((byte) -117, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class278.field4319.method1576(-104, class75.method480(arg0, 111), class5.method30(arg0, 23974));
            class32 var4 = new class32();
            var4.field448 = arg0;
            if (var3 != null) {
                var4.method200((byte) -122, new class224(var3));
            }
            var4.method201((byte) 126);
            if (~var4.field494 != 0) {
                var4.method215(method463(var4.field494, arg1), method463(var4.field424, -31104), arg1 + 31105);
            }
            if (var4.field430 != -1) {
                var4.method202(31666, method463(var4.field430, -31104), method463(var4.field456, arg1));
            }
            if (!class125.field1749 && var4.field481) {
                var4.field475 = 0;
                var4.field490 = class200.field2781;
                var4.field438 = class173.field2416;
                var4.field437 = class140.field1941;
                var4.field431 = false;
            }
            class181.field2533.method543(var4, (long) arg0, 858993459);
            if (arg1 != -31104) {
                method462((byte) -110);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IC)Z")
    public static final boolean method464(int arg0, char arg1) {
        ++field1006;
        if (arg1 >= ' ' && ~arg1 >= -127) {
            return true;
        } else {
            if (arg0 != 255) {
                field1005 = null;
            }
            if (arg1 >= 160 && arg1 <= 255) {
                return true;
            } else {
                return arg1 == 8364 || ~arg1 == -339 || ~arg1 == -8213 || ~arg1 == -340 || ~arg1 == -377;
            }
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(BLjava/lang/String;)J")
    public static final long method465(byte arg0, String arg1) {
        int var2 = arg1.length();
        ++field1009;
        long var3 = 0L;
        if (arg0 > -55) {
            method463(75, 111);
        }
        for (int var5 = 0; ~var5 > ~var2; ++var5) {
            var3 *= 37L;
            char var6 = arg1.charAt(var5);
            if (~var6 <= -66 && var6 <= 'Z') {
                var3 += (long) (var6 + -64);
            } else if (~var6 <= -98 && var6 <= 'z') {
                var3 += (long) (1 - (-var6 - -97));
            } else if (~var6 <= -49 && ~var6 >= -58) {
                var3 += (long) (var6 + 27 + -48);
            }
            if (~var3 <= -177917621779460414L) {
                break;
            }
        }
        while (var3 % 37L == 0L && ~var3 != -1L) {
            var3 /= 37L;
        }
        return var3;
    }
}
