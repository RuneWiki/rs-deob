import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class38 {

    @OriginalMember(owner = "client!ud", name = "r", descriptor = "J")
    private long field515 = -1L;

    @OriginalMember(owner = "client!ud", name = "w", descriptor = "I")
    private int field520 = 0;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "J")
    private long field499 = -1L;

    @OriginalMember(owner = "client!ud", name = "l", descriptor = "Ltd;")
    private class222 field509;

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "J")
    private long field505;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "J")
    private long field498;

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "[B")
    private byte[] field525;

    @OriginalMember(owner = "client!ud", name = "n", descriptor = "J")
    private long field511;

    @OriginalMember(owner = "client!ud", name = "k", descriptor = "[B")
    private byte[] field508;

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "Loh;")
    public static class258 field501 = class153.method1046("event_opbase", 108);

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "[I")
    public static int[] field517 = new int[100];

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "Lmb;")
    public static class172 field504 = new class172(50);

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "[Lqj;")
    public static class231[] field527 = new class231[2048];

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ud", name = "i", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!ud", name = "j", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ud", name = "m", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ud", name = "o", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ud", name = "p", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ud", name = "q", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ud", name = "x", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!ud", name = "y", descriptor = "I")
    public static int field522;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "J")
    private long field524;

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "[[Lgd;")
    public static class157[][] field503;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I)V", line = 4)
    public final void method279(int arg0) throws IOException {
        this.method283(25444);
        if (arg0 <= 61) {
            field503 = (class157[][]) ((class157[][]) null);
        }
        this.field509.method1501(true);
        field510++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIBII)V", line = 26)
    public static final void method280(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field514++;
        if (class257.field4390) {
            class296.method2085(arg0, arg4, arg0 + arg3, arg1 + arg4);
            class296.method2096(arg0, arg4, arg3, arg1, 0);
        } else {
            class211.method1414(arg0, arg4, arg0 + arg3, arg1 + arg4);
            class211.method1398(arg0, arg4, arg3, arg1, 0);
        }
        if (class206.field3557 < 100) {
            return;
        }
        if (class23.field278 == null || class23.field278.field1141 != arg3 || class23.field278.field1148 != arg1) {
            class41 var5 = new class41(arg3, arg1);
            class211.method1413(var5.field573, arg3, arg1);
            class118.method871(0, arg1, class225.field3870, 0, true, class57.field907, arg3, 0, 0);
            if (class257.field4390) {
                class23.field278 = new class221(var5);
            } else {
                class23.field278 = var5;
            }
            if (class257.field4390) {
                class211.field3640 = null;
            } else {
                class83.field1407.method1836(6932);
            }
        }
        if (arg2 > -30) {
            return;
        }
        class23.field278.method321(arg0, arg4);
        int var6 = class122.field2153 * arg3 / class57.field907 + arg0;
        int var7 = class61.field1043 * arg3 / class57.field907;
        int var8 = class139.field2367 * arg1 / class225.field3870 + arg4;
        int var9 = class194.field3419 * arg1 / class225.field3870;
        if (class257.field4390) {
            class296.method2089(var6, var8, var7, var9, 16711680, 128);
            class296.method2084(var6, var8, var7, var9, 16711680);
        } else {
            class211.method1406(var6, var8, var7, var9, 16711680, 128);
            class211.method1404(var6, var8, var7, var9, 16711680);
        }
        if (class61.field1090 <= 0 || (class61.field1090 % 10) >= 5) {
            return;
        }
        for (class237 var10 = (class237) class15.field201.method83(-49); var10 != null; var10 = (class237) class15.field201.method87((byte) -80)) {
            if (class106.field1896 == var10.field4144) {
                int var11 = var10.field4150 * arg3 / class57.field907 + arg0;
                int var12 = var10.field4142 * arg1 / class225.field3870 + arg4;
                if (class257.field4390) {
                    class296.method2096(var11 - 2, var12 + -2, 4, 4, 16776960);
                } else {
                    class211.method1398(var11 - 2, var12 + -2, 4, 4, 16776960);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(I)J", line = 121)
    public final long method281(int arg0) {
        if (arg0 == 32) {
            field519++;
            return this.field498;
        } else {
            return -119L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(I)V", line = 140)
    public static final void method282(int arg0) {
        field513++;
        if (arg0 != 15277) {
            return;
        }
        if ((class121.field2139 < class313.field5302)) {
            class121.field2139 = (float) ((double) class121.field2139 / 30.0D + (double) class121.field2139);
            if (class313.field5302 < class121.field2139) {
                class121.field2139 = class313.field5302;
            }
            class178.method1222(false);
        } else if (class313.field5302 < class121.field2139) {
            class121.field2139 = (float) ((double) class121.field2139 - (double) class121.field2139 / 30.0D);
            if (class313.field5302 > class121.field2139) {
                class121.field2139 = class313.field5302;
            }
            class178.method1222(false);
        }
        if (class218.field3782 == -1 || class299.field5122 == -1) {
            return;
        }
        int var1 = class218.field3782 - class165.field2784;
        if (var1 < 2 || var1 > 2) {
            var1 >>= 0x4;
        }
        class165.field2784 += var1;
        int var2 = class299.field5122 - class176.field3163;
        if (var2 < 2 || var2 > 2) {
            var2 >>= 0x4;
        }
        class176.field3163 -= -var2;
        if (var1 == 0 && var2 == 0) {
            class299.field5122 = -1;
            class218.field3782 = -1;
        }
        class178.method1222(false);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V", line = 206)
    private final void method283(int arg0) throws IOException {
        if (arg0 != 25444) {
            method284(false, 115, (byte) 122, 105, -12, false, true, -83);
        }
        if (this.field499 != -1L) {
            if (this.field524 != this.field499) {
                this.field509.method1504((byte) 71, this.field499);
                this.field524 = this.field499;
            }
            this.field509.method1502(this.field520, 0, (byte) -93, this.field508);
            long var2 = -1L;
            if (this.field515 < ((long) this.field520 + this.field499) && ((long) this.field520 + this.field499) <= ((long) this.field500 + this.field515)) {
                var2 = (long) this.field520 + this.field499;
            } else if (this.field499 < (this.field515 + ((long) this.field500)) && (this.field515 + ((long) this.field500)) <= ((long) this.field520 + this.field499)) {
                var2 = (long) this.field500 + this.field515;
            }
            this.field524 += (long) this.field520;
            if (this.field524 > this.field505) {
                this.field505 = this.field524;
            }
            long var4 = -1L;
            if (this.field515 <= this.field499 && this.field499 < ((long) this.field500 + this.field515)) {
                var4 = this.field499;
            } else if (this.field515 >= this.field499 && this.field515 < (long) this.field520 + this.field499) {
                var4 = this.field515;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class275.method1932(this.field508, (int) (var4 - this.field499), this.field525, (int) (var4 - this.field515), var6);
            }
            this.field520 = 0;
            this.field499 = -1L;
        }
        field502++;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIBIIZZI)Lkl;", line = 283)
    public static final class65 method284(boolean arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6, int arg7) {
        field512++;
        if (arg2 != -23) {
            return (class65) null;
        }
        class61 var8 = class186.method1256((byte) 113, arg4);
        if (arg1 > 1 && var8.field1011 != null) {
            int var9 = -1;
            for (int var10 = 0; var10 < 10; var10++) {
                if (var8.field1087[var10] <= arg1 && var8.field1087[var10] != 0) {
                    var9 = var8.field1011[var10];
                }
            }
            if (var9 != -1) {
                var8 = class186.method1256((byte) 117, var9);
            }
        }
        class89 var11 = var8.method469((byte) -80);
        if (var11 == null) {
            return null;
        }
        class41 var12 = null;
        if (var8.field1027 != -1) {
            var12 = (class41) method284(true, 10, (byte) -23, 0, var8.field1018, true, false, 1);
            if (var12 == null) {
                return null;
            }
        } else if (var8.field1048 != -1) {
            var12 = (class41) method284(true, arg1, (byte) -23, arg3, var8.field1054, false, false, arg7);
            if (var12 == null) {
                return null;
            }
        }
        int var13 = class211.field3635;
        int[] var14 = class211.field3640;
        int var15 = class211.field3639;
        int[] var16 = new int[4];
        class211.method1396(var16);
        class41 var17 = new class41(36, 32);
        class211.method1413(var17.field573, 36, 32);
        class266.method1872();
        class266.method1862(16, 16);
        class266.field4628 = false;
        int var18 = var8.field1030;
        if (arg5) {
            var18 = (int) ((double) var18 * 1.5D);
        } else if (arg7 == 2) {
            var18 = (int) ((double) var18 * 1.04D);
        }
        int var19 = class266.field4642[var8.field1021] * var18 >> 16;
        int var20 = class266.field4636[var8.field1021] * var18 >> 16;
        var11.method657(0, var8.field1070, var8.field1075, var8.field1021, var8.field1034, (var19 + var8.field1088) - (var11.method361() / 2), var8.field1088 + var20);
        if (arg7 >= 1) {
            var17.method317(1);
            if (arg7 >= 2) {
                var17.method317(16777215);
            }
            class211.method1413(var17.field573, 36, 32);
        }
        if (arg3 != 0) {
            var17.method330(arg3);
        }
        if (var8.field1027 != -1) {
            var12.method327(0, 0);
        } else if (var8.field1048 != -1) {
            class211.method1413(var12.field573, 36, 32);
            var17.method327(0, 0);
            var17 = var12;
        }
        if (arg6 && (var8.field1049 == 1 || arg1 != 1) && arg1 != -1) {
            class281.field4829.method268(class86.method616(arg1, (byte) -85), 0, 9, 16776960, 1);
        }
        class211.method1413(var14, var13, var15);
        class211.method1412(var16);
        class266.method1872();
        class266.field4628 = true;
        return class257.field4390 && !arg0 ? new class221(var17) : var17;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BIII)V", line = 415)
    public final void method285(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field523++;
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if ((long) arg2 != this.field499 && this.field511 >= this.field499 && (long) this.field520 + this.field499 >= (long) arg1 + this.field511) {
                class275.method1932(this.field508, (int) (this.field511 - this.field499), arg0, arg3, arg1);
                this.field511 += (long) arg1;
                return;
            }
            long var5 = this.field511;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field515 <= this.field511 && ((long) this.field500 + this.field515) > this.field511) {
                int var9 = (int) (this.field515 - (this.field511 - (long) this.field500));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class275.method1932(this.field525, (int) (this.field511 - this.field515), arg0, arg3, var9);
                this.field511 += (long) var9;
                arg3 += var9;
                arg1 -= var9;
            }
            if (this.field525.length < arg1) {
                this.field509.method1504((byte) 108, this.field511);
                this.field524 = this.field511;
                while (arg1 > 0) {
                    int var10 = this.field509.method1500(arg0, arg3, false, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field524 += (long) var10;
                    arg1 -= var10;
                    arg3 += var10;
                    this.field511 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method287((byte) 101);
                int var11 = arg1;
                if (arg1 > this.field500) {
                    var11 = this.field500;
                }
                class275.method1932(this.field525, 0, arg0, arg3, var11);
                arg3 += var11;
                arg1 -= var11;
                this.field511 += (long) var11;
            }
            if (this.field499 != -1L) {
                if (this.field511 < this.field499 && arg1 > 0) {
                    int var12 = (int) (this.field499 - this.field511) + arg3;
                    if (arg1 + arg3 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field511++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < (long) this.field520 + this.field499 && var5 + ((long) var8) >= (long) this.field520 + this.field499) {
                    var13 = (long) this.field520 + this.field499;
                } else if ((long) var8 + var5 > this.field499 && (var5 + ((long) var8)) <= ((long) this.field520 + this.field499)) {
                    var13 = (long) var8 + var5;
                }
                if (var5 <= this.field499 && var5 + ((long) var8) > this.field499) {
                    var15 = this.field499;
                } else if (this.field499 <= var5 && var5 < (long) this.field520 + this.field499) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class275.method1932(this.field508, (int) (var15 - this.field499), arg0, var7 + ((int) (var15 - var5)), var17);
                    if (var13 > this.field511) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field511));
                        this.field511 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field524 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V", line = 598)
    public static void method286(int arg0) {
        field504 = null;
        if (arg0 != 65280) {
            method288(89);
        }
        field501 = null;
        field503 = (class157[][]) null;
        field527 = null;
        field517 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(B)V", line = 628)
    private final void method287(byte arg0) throws IOException {
        this.field500 = 0;
        field518++;
        if (this.field524 != this.field511) {
            this.field509.method1504((byte) 59, this.field511);
            this.field524 = this.field511;
        }
        int var2 = -67 % ((40 - arg0) / 54);
        this.field515 = this.field511;
        while (this.field525.length > this.field500) {
            int var3 = this.field525.length - this.field500;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field509.method1500(this.field525, this.field500, false, var3);
            if (var4 == -1) {
                break;
            }
            this.field524 += (long) var4;
            this.field500 += var4;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ltd;II)V", line = 878)
    public class38(class222 arg0, int arg1, int arg2) throws IOException {
        this.field509 = arg0;
        this.field498 = this.field505 = arg0.method1505(0);
        this.field525 = new byte[arg1];
        this.field511 = 0L;
        this.field508 = new byte[arg2];
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Lck;", line = 672)
    public static final class98 method288(int arg0) {
        field516++;
        if (class144.field2426.length > class43.field629) {
            return class144.field2426[class43.field629++];
        } else {
            if (arg0 != 1905) {
                method288(31);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([BB)V", line = 702)
    public final void method289(byte[] arg0, byte arg1) throws IOException {
        if (arg1 != -84) {
            this.field498 = -37L;
        }
        field506++;
        this.method285(arg0, arg0.length, -1, 0);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZJ)V", line = 727)
    public final void method290(boolean arg0, long arg1) throws IOException {
        field521++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method291((byte) -91));
        }
        this.field511 = arg1;
        if (arg0) {
            method280(117, -50, (byte) -45, 3, -11);
        }
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Ljava/io/File;", line = 743)
    private final File method291(byte arg0) {
        if (arg0 == -91) {
            field507++;
            return this.field509.method1503((byte) 97);
        } else {
            return (File) null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(I[BII)V", line = 755)
    public final void method292(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field526++;
        try {
            if (this.field498 < (long) arg3 + this.field511) {
                this.field498 = (long) arg3 + this.field511;
            }
            if (this.field499 != -1L && (this.field511 < this.field499 || ((long) this.field520 + this.field499) < this.field511)) {
                this.method283(25444);
            }
            if (this.field499 != -1L && (long) arg3 + this.field511 > (long) this.field508.length + this.field499) {
                int var5 = (int) (this.field499 + (long) this.field508.length - this.field511);
                arg3 -= var5;
                class275.method1932(arg1, arg2, this.field508, (int) (this.field511 - this.field499), var5);
                arg2 += var5;
                this.field511 += (long) var5;
                this.field520 = this.field508.length;
                this.method283(25444);
            }
            if (this.field508.length < arg3) {
                if (this.field524 != this.field511) {
                    this.field509.method1504((byte) 80, this.field511);
                    this.field524 = this.field511;
                }
                this.field509.method1502(arg3, arg2, (byte) 124, arg1);
                long var6 = -1L;
                this.field524 += (long) arg3;
                if ((long) arg3 + this.field511 > this.field515 && (this.field515 + ((long) this.field500)) >= (this.field511 + ((long) arg3))) {
                    var6 = (long) arg3 + this.field511;
                } else if (this.field511 < this.field515 + ((long) this.field500) && (this.field515 + ((long) this.field500)) <= ((long) arg3 + this.field511)) {
                    var6 = this.field515 + ((long) this.field500);
                }
                if (this.field524 > this.field505) {
                    this.field505 = this.field524;
                }
                long var8 = -1L;
                if (this.field515 <= this.field511 && this.field511 < this.field515 + ((long) this.field500)) {
                    var8 = this.field511;
                } else if (this.field511 <= this.field515 && (this.field511 + ((long) arg3)) > this.field515) {
                    var8 = this.field515;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class275.method1932(arg1, (int) ((long) arg2 + var8 - this.field511), this.field525, (int) (var8 - this.field515), var10);
                }
                this.field511 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field499 == -1L) {
                    this.field499 = this.field511;
                }
                class275.method1932(arg1, arg2, this.field508, (int) (this.field511 - this.field499), arg3);
                this.field511 += (long) arg3;
                if ((long) this.field520 < this.field511 - this.field499) {
                    this.field520 = (int) (this.field511 - this.field499);
                }
            } else if (arg0 < 54) {
                this.field505 = 44L;
            }
        } catch (IOException var12) {
            this.field524 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IILva;)Loh;", line = 903)
    public static final class258 method293(int arg0, int arg1, class235 arg2) {
        field522++;
        try {
            class258 var3 = new class258();
            var3.field4478 = arg2.method1613((byte) 91);
            if (var3.field4478 > arg0) {
                var3.field4478 = arg0;
            }
            var3.field4490 = new byte[var3.field4478];
            arg2.field4051 += class247.field4281.method615(var3.field4490, arg1, arg2.field4066, -20399, var3.field4478, arg2.field4051);
            return var3;
        } catch (Exception var5) {
            return class137.field2335;
        }
    }
}
