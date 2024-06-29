import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class122 {

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "I")
    private int field2993 = 0;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "J")
    private long field2992 = -1L;

    @OriginalMember(owner = "client!ub", name = "A", descriptor = "J")
    private long field3007 = -1L;

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "Lid;")
    private class52 field3014;

    @OriginalMember(owner = "client!ub", name = "D", descriptor = "J")
    private long field3009;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "J")
    private long field2996;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "J")
    private long field2998;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "[B")
    private byte[] field2984;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "[B")
    private byte[] field2990;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field2986 = 10;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "[I")
    public static int[] field2994 = new int[200];

    @OriginalMember(owner = "client!ub", name = "C", descriptor = "I")
    public static int field3008 = 0;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lrc;")
    public static class105 field2981 = class43.method374("Lade Konfiguration )2 ", 0);

    @OriginalMember(owner = "client!ub", name = "E", descriptor = "Lrc;")
    private static class105 field3010 = class43.method374("Too many connections from your address)3", 0);

    @OriginalMember(owner = "client!ub", name = "u", descriptor = "[I")
    public static int[] field3001 = new int[2048];

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "[I")
    public static int[] field3000 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
    public static int field3003 = 0;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Lrc;")
    private static class105 field2995 = class43.method374("Ok", 0);

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lrc;")
    public static class105 field2999 = field2995;

    @OriginalMember(owner = "client!ub", name = "F", descriptor = "Lrc;")
    public static class105 field3011 = class43.method374("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 0);

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "Lrc;")
    public static class105 field3017 = field3010;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "Lrc;")
    public static class105 field3019 = class43.method374("Ignorieren", 0);

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field2985;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!ub", name = "v", descriptor = "I")
    private int field3002;

    @OriginalMember(owner = "client!ub", name = "x", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!ub", name = "y", descriptor = "I")
    public static int field3005;

    @OriginalMember(owner = "client!ub", name = "z", descriptor = "I")
    public static int field3006;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "J")
    private long field3013;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "Lfb;")
    public static class33 field2991;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "Lfc;")
    public static class34 field2983;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)J", line = 6)
    public final long method990(byte arg0) {
        field3006++;
        int var2 = -31 % ((arg0 + 38) / 37);
        return this.field2996;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lid;II)V", line = 652)
    public class122(class52 arg0, int arg1, int arg2) throws IOException {
        this.field3014 = arg0;
        this.field2996 = this.field3009 = arg0.method403(1);
        this.field2998 = 0L;
        this.field2984 = new byte[arg1];
        this.field2990 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(JI)V", line = 43)
    public final void method991(long arg0, int arg1) {
        field3015++;
        if (arg0 >= 0L) {
            this.field2998 = arg0;
            int var4 = -99 % ((arg1 - 15) / 37);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IZIIII)Leb;", line = 92)
    public static final class27 method992(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field3012++;
        long var6 = ((long) arg2 << 16) + ((long) arg4 - (-((long) arg3 << 40) - ((long) arg5 << 38)));
        if (arg0 != 7945) {
            field2982 = 4;
        }
        if (!arg1) {
            class27 var8 = (class27) class75.field1659.method601(var6, (byte) 118);
            if (var8 != null) {
                return var8;
            }
        }
        class31 var9 = class75.method636(arg4, arg0 - 7945);
        if (arg2 > 1 && var9.field732 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg2 >= var9.field726[var11] && var9.field726[var11] != 0) {
                    var10 = var9.field732[var11];
                }
            }
            if (var10 != -1) {
                var9 = class75.method636(var10, 0);
            }
        }
        class56 var12 = var9.method291((byte) 114, 1, true);
        if (var12 == null) {
            return null;
        }
        class27 var13 = null;
        if (var9.field736 != -1) {
            var13 = method992(7945, true, 10, 0, var9.field722, 1);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class69.field1548;
        int var15 = class69.field1552;
        int var16 = class69.field1550;
        int var17 = class69.field1549;
        int var18 = class69.field1546;
        int var19 = class69.field1547;
        int var20 = class69.field1551;
        int[] var21 = class38.method356();
        int var22 = class38.field881;
        int var23 = class38.field869;
        class27 var24 = new class27(36, 32);
        class69.method582(var24.field613, 36, 32);
        class136.field3324 = class38.method355(class136.field3324);
        class69.method580(0, 0, 36, 32, 0);
        class38.field872 = false;
        class38.method347(16, 16);
        int var25 = var9.field754;
        if (arg1) {
            var25 = (int) ((double) var25 * 1.5D);
        } else if (arg5 == 2) {
            var25 = (int) ((double) var25 * 1.04D);
        }
        int var26 = class38.field876[var9.field758] * var25 >> 16;
        int var27 = class38.field885[var9.field758] * var25 >> 16;
        var12.method444();
        var12.method425(0, var9.field756, var9.field701, var9.field758, var9.field705, var12.field1328 / 2 + var9.field700 + var27, var9.field700 + var26);
        if (arg5 >= 1) {
            var24.method254(1);
        }
        if (arg5 >= 2) {
            var24.method254(16777215);
        }
        if (arg3 != 0) {
            var24.method256(arg3);
        }
        class69.method582(var24.field613, 36, 32);
        if (var9.field736 != -1) {
            var13.method265(0, 0);
        }
        if (!arg1 && (var9.field725 == 1 || arg2 != 1)) {
            class89.field2045.method664(class24.method237(1000, arg2), 1, 10, 1);
            class89.field2045.method664(class24.method237(1000, arg2), 0, 9, 16776960);
        }
        if (!arg1) {
            class75.field1659.method608(var6, var24, (byte) 122);
        }
        class69.method582(var14, var15, var16);
        class69.method581(var18, var17, var20, var19);
        class38.method355(var21);
        class38.field869 = var23;
        class38.field881 = var22;
        class38.method353();
        class38.field872 = true;
        return var24;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 236)
    private final void method993(boolean arg0) throws IOException {
        field3018++;
        if (!arg0) {
            method999((byte) 12);
        }
        this.field3002 = 0;
        if (this.field3013 != this.field2998) {
            this.field3014.method402(this.field2998, (byte) 123);
            this.field3013 = this.field2998;
        }
        this.field3007 = this.field2998;
        while (this.field3002 < this.field2984.length) {
            int var2 = this.field3014.method404(this.field2984.length - this.field3002, this.field2984, (byte) 116, this.field3002);
            if (var2 == -1) {
                break;
            }
            this.field3002 += var2;
            this.field3013 += var2;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II[BI)V", line = 281)
    public final void method994(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2988++;
        try {
            if (this.field2996 < (long) arg1 + this.field2998) {
                this.field2996 = (long) arg1 + this.field2998;
            }
            if (this.field2992 != -1L && (this.field2992 > this.field2998 || this.field2998 > (long) this.field2993 + this.field2992)) {
                this.method998(true);
            }
            if (arg3 != -3291) {
                this.field3009 = 121L;
            }
            if (this.field2992 != -1L && (long) this.field2990.length + this.field2992 < (long) arg1 + this.field2998) {
                int var5 = (int) ((long) this.field2990.length + this.field2992 - this.field2998);
                arg1 -= var5;
                class82.method697(arg2, arg0, this.field2990, (int) (this.field2998 - this.field2992), var5);
                this.field2998 += var5;
                this.field2993 = this.field2990.length;
                this.method998(true);
                arg0 += var5;
            }
            if (arg1 > this.field2990.length) {
                if (this.field3013 != this.field2998) {
                    this.field3014.method402(this.field2998, (byte) 125);
                    this.field3013 = this.field2998;
                }
                this.field3014.method407(arg2, arg0, -80, arg1);
                this.field3013 += arg1;
                if (this.field3013 > this.field3009) {
                    this.field3009 = this.field3013;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3007 <= this.field2998 && (long) this.field3002 + this.field3007 > this.field2998) {
                    var8 = this.field2998;
                } else if (this.field3007 >= this.field2998 && this.field3007 < this.field2998 + (long) arg1) {
                    var8 = this.field3007;
                }
                if (this.field3007 < (long) arg1 + this.field2998 && (long) arg1 + this.field2998 <= (long) this.field3002 + this.field3007) {
                    var6 = (long) arg1 + this.field2998;
                } else if ((long) this.field3002 + this.field3007 > this.field2998 && this.field3007 + (long) this.field3002 <= (long) arg1 + this.field2998) {
                    var6 = (long) this.field3002 + this.field3007;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class82.method697(arg2, (int) ((long) arg0 + var8 - this.field2998), this.field2984, (int) (var8 - this.field3007), var10);
                }
                this.field2998 += arg1;
            } else if (arg1 > 0) {
                if (this.field2992 == -1L) {
                    this.field2992 = this.field2998;
                }
                class82.method697(arg2, arg0, this.field2990, (int) (this.field2998 - this.field2992), arg1);
                this.field2998 += arg1;
                if (this.field2998 - this.field2992 > (long) this.field2993) {
                    this.field2993 = (int) (this.field2998 - this.field2992);
                }
            }
        } catch (IOException var12) {
            this.field3013 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I[BII)V", line = 405)
    public final void method995(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2989++;
        try {
            if (arg1.length < arg2 + arg0) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field2992 != -1L && this.field2998 >= this.field2992 && this.field2992 + (long) this.field2993 >= this.field2998 - -((long) arg0)) {
                class82.method697(this.field2990, (int) (this.field2998 - this.field2992), arg1, arg2, arg0);
                this.field2998 += arg0;
                return;
            }
            int var5 = arg0;
            long var6 = this.field2998;
            int var8 = arg2;
            if (this.field2998 >= this.field3007 && this.field2998 < (long) this.field3002 + this.field3007) {
                int var9 = (int) ((long) this.field3002 + this.field3007 - this.field2998);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class82.method697(this.field2984, (int) (this.field2998 - this.field3007), arg1, arg2, var9);
                arg2 += var9;
                this.field2998 += var9;
                arg0 -= var9;
            }
            if (arg3 <= 2) {
                method999((byte) 54);
            }
            if (arg0 > this.field2984.length) {
                this.field3014.method402(this.field2998, (byte) 122);
                this.field3013 = this.field2998;
                while (arg0 > 0) {
                    int var10 = this.field3014.method404(arg0, arg1, (byte) 116, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    this.field2998 += var10;
                    this.field3013 += var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method993(true);
                int var11 = arg0;
                if (arg0 > this.field3002) {
                    var11 = this.field3002;
                }
                class82.method697(this.field2984, 0, arg1, arg2, var11);
                this.field2998 += var11;
                arg2 += var11;
                arg0 -= var11;
            }
            if (this.field2992 != -1L) {
                if (this.field2998 < this.field2992 && arg0 > 0) {
                    int var12 = (int) (this.field2992 - this.field2998) + arg2;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (arg2 < var12) {
                        arg1[arg2++] = 0;
                        this.field2998++;
                        arg0--;
                    }
                }
                long var13 = -1L;
                if (var6 < this.field2992 + (long) this.field2993 && this.field2992 + (long) this.field2993 <= (long) var5 + var6) {
                    var13 = (long) this.field2993 + this.field2992;
                } else if ((long) var5 + var6 > this.field2992 && (long) var5 + var6 <= (long) this.field2993 + this.field2992) {
                    var13 = (long) var5 + var6;
                }
                long var15 = -1L;
                if (var6 <= this.field2992 && this.field2992 < var6 + (long) var5) {
                    var15 = this.field2992;
                } else if (var6 >= this.field2992 && var6 < this.field2992 + (long) this.field2993) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class82.method697(this.field2990, (int) (var15 - this.field2992), arg1, (int) (var15 - var6) + var8, var17);
                    if (var13 > this.field2998) {
                        arg0 = (int) ((long) arg0 + this.field2998 - var13);
                        this.field2998 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3013 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V", line = 588)
    public static final void method996(byte arg0) {
        class18.field410 = null;
        class14.field285 = null;
        class26.field596 = null;
        class132.field3195 = null;
        if (arg0 != 54) {
            return;
        }
        client.field425 = null;
        class71.field1553 = null;
        field3005++;
        class39.field903 = null;
        class45.field1017 = null;
        class26.field602 = null;
        class121.field2963 = null;
        class66.field1495 = null;
        class127.field3100 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)V", line = 629)
    public final void method997(boolean arg0) throws IOException {
        this.method998(!arg0);
        if (arg0) {
            field2994 = null;
        }
        field2987++;
        this.field3014.method406((byte) 26);
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(Z)V", line = 670)
    private final void method998(boolean arg0) throws IOException {
        if (this.field2992 != -1L) {
            if (this.field3013 != this.field2992) {
                this.field3014.method402(this.field2992, (byte) 127);
                this.field3013 = this.field2992;
            }
            long var2 = -1L;
            this.field3014.method407(this.field2990, 0, -103, this.field2993);
            if ((long) this.field2993 + this.field2992 > this.field3007 && (long) this.field2993 + this.field2992 <= (long) this.field3002 + this.field3007) {
                var2 = (long) this.field2993 + this.field2992;
            } else if ((long) this.field3002 + this.field3007 > this.field2992 && (long) this.field2993 + this.field2992 >= (long) this.field3002 + this.field3007) {
                var2 = (long) this.field3002 + this.field3007;
            }
            this.field3013 += this.field2993;
            long var4 = -1L;
            if (this.field3009 < this.field3013) {
                this.field3009 = this.field3013;
            }
            if (this.field3007 <= this.field2992 && this.field3007 + (long) this.field3002 > this.field2992) {
                var4 = this.field2992;
            } else if (this.field3007 >= this.field2992 && this.field3007 < this.field2992 + (long) this.field2993) {
                var4 = this.field3007;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class82.method697(this.field2990, (int) (var4 - this.field2992), this.field2984, (int) (var4 - this.field3007), var6);
            }
            this.field2992 = -1L;
            this.field2993 = 0;
        }
        field3004++;
        if (!arg0) {
            field2999 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(B)V", line = 748)
    public static void method999(byte arg0) {
        field3001 = null;
        field3011 = null;
        field2995 = null;
        field3017 = null;
        field2983 = null;
        field3019 = null;
        field2991 = null;
        field2981 = null;
        field2999 = null;
        field3000 = null;
        field3010 = null;
        if (arg0 > -83) {
            method992(41, false, -87, 83, -128, 56);
        }
        field2994 = null;
    }
}
