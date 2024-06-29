import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class105 {

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "Lta;")
    private class123 field2451 = new class123();

    @OriginalMember(owner = "client!qa", name = "C", descriptor = "Lb;")
    private class8 field2453 = new class8();

    @OriginalMember(owner = "client!qa", name = "D", descriptor = "I")
    private int field2454;

    @OriginalMember(owner = "client!qa", name = "E", descriptor = "I")
    private int field2455;

    @OriginalMember(owner = "client!qa", name = "B", descriptor = "Lrb;")
    private class112 field2452;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "[Lua;")
    public static class129[] field2437 = new class129[50];

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "[I")
    public static int[] field2426 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "J")
    public static long field2443 = 0L;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "I")
    public static int field2433 = -1;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2444 = 0;

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "Lvc;")
    private static class137 field2441 = class45.method325("slide:", -46);

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "Lvc;")
    public static class137 field2434 = field2441;

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "Lqa;")
    public static class105 field2446 = new class105(64);

    @OriginalMember(owner = "client!qa", name = "G", descriptor = "Lvc;")
    public static class137 field2457 = class45.method325("::clientdrop", -46);

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2442;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lfc;")
    public static class39 field2431;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "Lfc;")
    public static class39 field2450;

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "Lia;")
    public static class57 field2427;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "Lnb;")
    public static class88 field2425;

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lnb;")
    public static class88 field2440;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Loa;")
    public static class93 field2428;

    @OriginalMember(owner = "client!qa", name = "F", descriptor = "Ljava/awt/Font;")
    public static Font field2456;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IJ)Lvc;")
    public static final class137 method757(int arg0, long arg1) {
        field2435++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if (arg1 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var8 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class58.field1229[(int) (var8 - arg1 * 37L)];
            }
            class137 var7 = new class137();
            var7.field3176 = var6;
            var7.field3182 = var6.length;
            return arg0 == 126 ? var7 : null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JB)Lta;")
    public final class123 method758(long arg0, byte arg1) {
        class123 var4 = (class123) this.field2452.method867(arg0, false);
        if (arg1 >= -82) {
            field2434 = null;
        }
        if (var4 != null) {
            this.field2453.method54(var4, 768);
        }
        field2429++;
        return var4;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLnb;Lnb;BI)Ldc;")
    public static final class25 method759(boolean arg0, class88 arg1, class88 arg2, byte arg3, int arg4) {
        field2449++;
        boolean var5 = true;
        if (arg3 > -40) {
            return null;
        }
        int[] var6 = arg1.method659(arg4, -3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg1.method644(0, arg4, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = (var8[0] & 0xFF) << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg0) {
                    var10 = arg2.method644(0, 0, var9);
                } else {
                    var10 = arg2.method644(0, var9, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class25(arg1, arg2, arg4, arg0);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lta;IJ)V")
    public final void method760(class123 arg0, int arg1, long arg2) {
        if (this.field2455 == arg1) {
            class123 var5 = this.field2453.method52((byte) -4);
            var5.method776(0);
            var5.method923(10);
            if (this.field2451 == var5) {
                class123 var6 = this.field2453.method52((byte) -4);
                var6.method776(arg1);
                var6.method923(10);
            }
        } else {
            this.field2455--;
        }
        this.field2452.method873(arg2, 126, arg0);
        field2448++;
        this.field2453.method54(arg0, 768);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lme;Lme;IIIIIIBIII)Lme;")
    public static final class85 method761(class85[] arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        field2445++;
        if (arg8 >= -106) {
            field2425 = null;
        }
        if (arg3 > arg6 || arg7 > arg4 || arg5 <= arg6 || arg10 <= arg4) {
            return null;
        }
        for (int var12 = 0; var12 < arg0.length; var12++) {
            class85 var13 = arg0[var12];
            if (var13 != null && var13.field1945 == arg11 && !class8.method58(var13, 1792) && arg1 != var13) {
                int var14 = var13.field1985 + arg3 - arg9;
                int var15 = var13.field2007 + arg7 - arg2;
                if (var13.field1952 == 0) {
                    class85 var16 = method761(arg0, arg1, var13.field1927, var14, arg4, var13.field1929 + var14, arg6, var15, (byte) -111, var13.field1932, var15 + var13.field1975, var13.field1910);
                    if (var16 != null) {
                        return var16;
                    }
                    if (var13.field1980 != null) {
                        class85 var17 = method761(var13.field1980, arg1, var13.field1927, var14, arg4, var13.field1929 + var14, arg6, var15, (byte) -109, var13.field1932, var13.field1975 + var15, var13.field1910);
                        if (var17 != null) {
                            return var17;
                        }
                    }
                }
                if (class71.method497(class28.method218(14485, var13), false) && arg6 >= var14 && arg4 >= var15 && var13.field1929 + var14 > arg6 && var13.field1975 + var15 > arg4) {
                    return var13;
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILeb;I)V")
    public static final void method762(int arg0, class31 arg1, int arg2) {
        field2430++;
        int var3 = arg2 >> 5;
        class31 var4 = class106.field2475[var3];
        if (var4 == null) {
            class128.field3013[var3] = arg1;
        } else {
            var4.field676 = arg1;
        }
        if (arg0 != -15506) {
            method765(-106, -22, (byte) 71);
        }
        class106.field2475[var3] = arg1;
        arg1.field677 = arg2;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(B)V")
    public final void method763(byte arg0) {
        int var2 = -69 / ((-arg0 - 82) / 36);
        field2439++;
        while (true) {
            class123 var3 = this.field2453.method52((byte) -4);
            if (var3 == null) {
                this.field2455 = this.field2454;
                return;
            }
            var3.method776(0);
            var3.method923(10);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(JI)V")
    public final void method764(long arg0, int arg1) {
        if (arg1 != 0) {
            return;
        }
        field2438++;
        class123 var4 = (class123) this.field2452.method867(arg0, false);
        if (var4 != null) {
            var4.method776(0);
            var4.method923(arg1 + 10);
            this.field2455++;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIB)I")
    public static final int method765(int arg0, int arg1, byte arg2) {
        field2442++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 0) {
                arg1 = 0;
            } else if (arg1 > 127) {
                arg1 = 127;
            }
            return 127 - arg1;
        } else {
            if (arg2 >= -108) {
                field2441 = null;
            }
            int var4 = (arg0 & 0x7F) * arg1 / 128;
            if (var4 < 2) {
                var4 = 2;
            } else if (var4 > 126) {
                var4 = 126;
            }
            return (arg0 & 0xFF80) + var4;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static void method766(byte arg0) {
        field2426 = null;
        field2427 = null;
        field2428 = null;
        field2457 = null;
        field2441 = null;
        field2440 = null;
        field2450 = null;
        field2456 = null;
        field2446 = null;
        if (arg0 != -100) {
            method765(102, -123, (byte) -96);
        }
        field2437 = null;
        field2425 = null;
        field2431 = null;
        field2434 = null;
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(I)V")
    public class105(int arg0) {
        int var2 = 1;
        this.field2454 = arg0;
        this.field2455 = arg0;
        while (arg0 > var2 + var2) {
            var2 += var2;
        }
        this.field2452 = new class112(var2);
    }
}
