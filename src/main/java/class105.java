import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class105 {

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    private int field1979 = 65000;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Lab;")
    private class142 field1985 = null;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "Lab;")
    private class142 field1989 = null;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    private int field1983;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "[Lhj;")
    public static class69[] field1977 = new class69[100];

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public static int field1982;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field1986;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    public static int field1987;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field1992;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "[Lqb;")
    public static class56[] field1976;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIIIZ)Lqb;")
    public static final class56 method790(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field1982++;
        int var7 = (arg1 << 17) + arg0 + (arg5 ? 65536 : 0) + (arg3 << 19);
        if (arg2 != 255) {
            method794(true, -125L);
        }
        long var8 = (long) arg4 * 3147483667L + (long) var7 * 3849834839L;
        class56 var10 = (class56) class193.field3497.method1714(var8, (byte) -127);
        if (var10 != null) {
            return var10;
        }
        class178.field3235 = false;
        class56 var11 = class73.method510(0, arg5, arg3, arg1, arg0, arg4, false, false);
        if (var11 != null && !class178.field3235) {
            class193.field3497.method1705((byte) 126, var11, var8);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ke", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1987++;
        return "Cache:" + this.field1983;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[BZII)Z")
    private final boolean method791(int arg0, byte[] arg1, boolean arg2, int arg3, int arg4) {
        field1988++;
        class142 var6 = this.field1985;
        synchronized (this.field1985) {
            try {
                int var8;
                if (arg2) {
                    if (((long) (arg0 * 6 + 6)) > this.field1989.method1087((byte) -123)) {
                        return false;
                    }
                    this.field1989.method1090(true, (long) (arg0 * 6));
                    this.field1989.method1092(class182.field3309, 0, 83, 6);
                    var8 = ((class182.field3309[3] & 0xFF) << 16) + ((class182.field3309[4] & 0xFF) << 8) + (class182.field3309[5] & 0xFF);
                    if (var8 <= 0 || (this.field1985.method1087((byte) 91) / 520L) < ((long) var8)) {
                        return false;
                    }
                } else {
                    var8 = (int) ((this.field1985.method1087((byte) 21) + 519L) / 520L);
                    if (var8 == 0) {
                        var8 = 1;
                    }
                }
                class182.field3309[3] = (byte) (var8 >> 16);
                class182.field3309[4] = (byte) (var8 >> 8);
                class182.field3309[0] = (byte) (arg3 >> 16);
                if (arg4 != 9085) {
                    this.field1989 = null;
                }
                int var10 = 0;
                class182.field3309[1] = (byte) (arg3 >> 8);
                class182.field3309[5] = (byte) var8;
                class182.field3309[2] = (byte) arg3;
                int var11 = 0;
                this.field1989.method1090(true, (long) (arg0 * 6));
                this.field1989.method1094((byte) 9, 0, class182.field3309, 6);
                while (arg3 > var10) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field1985.method1090(true, (long) (var8 * 520));
                            try {
                                this.field1985.method1092(class182.field3309, 0, 117, 8);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = ((class182.field3309[5] & 0xFF) << 8) + ((class182.field3309[4] & 0xFF) << 16) + (class182.field3309[6] & 0xFF);
                            int var13 = class182.field3309[7] & 0xFF;
                            int var14 = ((class182.field3309[0] & 0xFF) << 8) + (class182.field3309[1] & 0xFF);
                            int var15 = (class182.field3309[2] & 0xFF << 8) + (class182.field3309[3] & 0xFF);
                            if (arg0 == var14 && var11 == var15 && this.field1983 == var13) {
                                if (var12 >= 0 && ((long) var12) <= (this.field1985.method1087((byte) -125) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field1985.method1087((byte) -117) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var8 == var12) {
                            var12++;
                        }
                    }
                    int var18 = arg3 - var10;
                    class182.field3309[3] = (byte) var11;
                    class182.field3309[0] = (byte) (arg0 >> 8);
                    if (arg3 - var10 <= 512) {
                        var12 = 0;
                    }
                    class182.field3309[7] = (byte) this.field1983;
                    class182.field3309[4] = (byte) (var12 >> 16);
                    class182.field3309[6] = (byte) var12;
                    class182.field3309[1] = (byte) arg0;
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    class182.field3309[5] = (byte) (var12 >> 8);
                    class182.field3309[2] = (byte) (var11 >> 8);
                    this.field1985.method1090(true, (long) (var8 * 520));
                    this.field1985.method1094((byte) -80, 0, class182.field3309, 8);
                    var8 = var12;
                    var11++;
                    this.field1985.method1094((byte) 12, var10, arg1, var18);
                    var10 += var18;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIIII)V")
    public static final void method792(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1991++;
        class48.field692.field2379 = arg3;
        class48.field692.method933(137, -20946);
        class48.field692.method933(arg4, -20946);
        class48.field692.method933(arg1, -20946);
        class48.field692.method943((byte) 127, arg0);
        class48.field692.method943((byte) 127, arg2);
        class28.field407 = -3;
        class266.field4735 = 1;
        class73.field1404 = 0;
        class227.field4138 = 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V")
    public static void method793(byte arg0) {
        field1977 = null;
        field1976 = null;
        int var1 = -123 / ((55 - arg0) / 44);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZJ)V")
    public static final void method794(boolean arg0, long arg1) {
        field1978++;
        if (arg1 == 0L) {
            return;
        }
        if (class149.field2778 >= 100) {
            class122.method881(0, class209.field3816, class64.field1247, false);
            return;
        }
        if (!arg0) {
            method798((class69) null, (byte) -53, (class128) null);
        }
        class69 var3 = class101.method749(arg1, 25801).method452(122);
        for (int var4 = 0; var4 < class149.field2778; var4++) {
            if (class159.field2959[var4] == arg1) {
                class122.method881(0, class209.field3816, class9.method42(91, new class69[] { var3, class82.field1567 }), false);
                return;
            }
        }
        for (int var5 = 0; var5 < class273.field4828; var5++) {
            if (class141.field2642[var5] == arg1) {
                class122.method881(0, class209.field3816, class9.method42(-94, new class69[] { class243.field4463, var3, class111.field2107 }), !arg0);
                return;
            }
        }
        if (var3.method444((byte) -24, class156.field2904.field2045)) {
            class122.method881(0, class209.field3816, class43.field620, false);
            return;
        }
        class59.field1069++;
        class159.field2959[class149.field2778] = arg1;
        field1977[class149.field2778++] = class101.method749(arg1, 25801);
        class208.field3795 = class81.field1564;
        class48.field692.method301(121, -104);
        class48.field692.method918(arg1, 18820);
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIB[B)Z")
    public final boolean method795(int arg0, int arg1, byte arg2, byte[] arg3) {
        field1990++;
        class142 var5 = this.field1985;
        synchronized (this.field1985) {
            if (arg0 < 0 || arg0 > this.field1979) {
                throw new IllegalArgumentException();
            } else if (arg2 >= -73) {
                return true;
            } else {
                boolean var7 = this.method791(arg1, arg3, true, arg0, 9085);
                if (!var7) {
                    var7 = this.method791(arg1, arg3, false, arg0, 9085);
                }
                return var7;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method796(int arg0) {
        class172.field3147.method1709((byte) -79);
        class63.field1213.method1709((byte) -61);
        field1992++;
        if (arg0 != 15844) {
            field1984 = 112;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(BI)[B")
    public final byte[] method797(byte arg0, int arg1) {
        field1981++;
        class142 var3 = this.field1985;
        synchronized (this.field1985) {
            try {
                if (this.field1989.method1087((byte) 21) < (long) (arg1 * 6 + 6)) {
                    return null;
                }
                this.field1989.method1090(true, (long) (arg1 * 6));
                this.field1989.method1092(class182.field3309, 0, 126, 6);
                int var5 = (class182.field3309[0] & 0xFF << 16) + ((class182.field3309[1] & 0xFF << 8) + (class182.field3309[2] & 0xFF));
                int var6 = ((class182.field3309[4] & 0xFF) << 8) + ((class182.field3309[3] & 0xFF << 16) + (class182.field3309[5] & 0xFF));
                if (var5 < 0 || this.field1979 < var5) {
                    return null;
                } else if (var6 > 0 && this.field1985.method1087((byte) -128) / 520L >= (long) var6) {
                    int var9 = -2 % ((arg0 + 67) / 33);
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    int var12 = 0;
                    while (var5 > var11) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field1985.method1090(true, (long) (var6 * 520));
                        int var14 = var5 - var11;
                        if (var14 > 512) {
                            var14 = 512;
                        }
                        this.field1985.method1092(class182.field3309, 0, 108, var14 + 8);
                        int var15 = ((class182.field3309[0] & 0xFF) << 8) + (class182.field3309[1] & 0xFF);
                        int var16 = (class182.field3309[6] & 0xFF) + ((class182.field3309[4] & 0xFF << 16) + ((class182.field3309[5] & 0xFF) << 8));
                        int var17 = class182.field3309[7] & 0xFF;
                        int var18 = ((class182.field3309[2] & 0xFF) << 8) + (class182.field3309[3] & 0xFF);
                        if (arg1 == var15 && var12 == var18 && this.field1983 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field1985.method1087((byte) -114) / 520L) {
                                var6 = var16;
                                for (int var21 = 0; var21 < var14; var21++) {
                                    var10[var11++] = class182.field3309[var21 + 8];
                                }
                                var12++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var40) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lhj;BLfh;)I")
    public static final int method798(class69 arg0, byte arg1, class128 arg2) {
        if (arg1 >= -110) {
            field1993 = -74;
        }
        field1986++;
        int var3 = arg2.field2379;
        arg2.method954(arg0.field1331, (byte) 23);
        arg2.field2379 += class119.field2246.method847((byte) 91, arg2.field2385, arg0.field1351, arg2.field2379, arg0.field1331, 0);
        return arg2.field2379 - var3;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(ILab;Lab;I)V")
    public class105(int arg0, class142 arg1, class142 arg2, int arg3) {
        this.field1979 = arg3;
        this.field1985 = arg1;
        this.field1983 = arg0;
        this.field1989 = arg2;
    }
}
