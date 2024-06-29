import java.awt.Graphics;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class157 {

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    private int field2527 = 0;

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "J")
    private long field2532 = -1L;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "J")
    private long field2525 = -1L;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "Loh;")
    private class14 field2530;

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "J")
    private long field2510;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "J")
    private long field2521;

    @OriginalMember(owner = "client!wk", name = "g", descriptor = "[B")
    private byte[] field2515;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "[B")
    private byte[] field2533;

    @OriginalMember(owner = "client!wk", name = "h", descriptor = "J")
    private long field2516;

    @OriginalMember(owner = "client!wk", name = "d", descriptor = "Z")
    public static boolean field2512 = false;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field2522 = new String[100];

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "I")
    public static int field2523 = -2;

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "I")
    private int field2511;

    @OriginalMember(owner = "client!wk", name = "e", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!wk", name = "f", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!wk", name = "i", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "J")
    private long field2529;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "Leb;")
    public static class103 field2509;

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "Lcg;")
    public static class36 field2518;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BBII)V")
    public final void method1050(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field2531++;
        try {
            if ((this.field2516 + ((long) arg2)) > this.field2521) {
                this.field2521 = this.field2516 + ((long) arg2);
            }
            if (this.field2525 != -1L && (this.field2525 > this.field2516 || (long) this.field2527 + this.field2525 < this.field2516)) {
                this.method1052(-38);
            }
            if (this.field2525 != -1L && (long) this.field2533.length + this.field2525 < (long) arg2 + this.field2516) {
                int var5 = (int) ((long) this.field2533.length + this.field2525 - this.field2516);
                class56.method432(arg0, arg3, this.field2533, (int) (this.field2516 - this.field2525), var5);
                arg3 += var5;
                arg2 -= var5;
                this.field2516 += (long) var5;
                this.field2527 = this.field2533.length;
                this.method1052(104);
            }
            if (arg1 != 45) {
                this.field2533 = null;
            }
            if (arg2 > this.field2533.length) {
                long var6 = -1L;
                if (this.field2529 != this.field2516) {
                    this.field2530.method107((byte) -43, this.field2516);
                    this.field2529 = this.field2516;
                }
                this.field2530.method111(arg2, arg0, 1, arg3);
                if (this.field2516 >= this.field2532 && (long) this.field2511 + this.field2532 > this.field2516) {
                    var6 = this.field2516;
                } else if (this.field2516 <= this.field2532 && this.field2532 < ((long) arg2 + this.field2516)) {
                    var6 = this.field2532;
                }
                this.field2529 += (long) arg2;
                if (this.field2529 > this.field2510) {
                    this.field2510 = this.field2529;
                }
                long var8 = -1L;
                if (this.field2532 < this.field2516 + ((long) arg2) && this.field2532 + ((long) this.field2511) >= (long) arg2 + this.field2516) {
                    var8 = (long) arg2 + this.field2516;
                } else if (this.field2516 < (long) this.field2511 + this.field2532 && (long) this.field2511 + this.field2532 <= (long) arg2 + this.field2516) {
                    var8 = (long) this.field2511 + this.field2532;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class56.method432(arg0, (int) (var6 + (long) arg3 - this.field2516), this.field2515, (int) (var6 - this.field2532), var10);
                }
                this.field2516 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field2525 == -1L) {
                    this.field2525 = this.field2516;
                }
                class56.method432(arg0, arg3, this.field2533, (int) (this.field2516 - this.field2525), arg2);
                this.field2516 += (long) arg2;
                if ((long) this.field2527 < this.field2516 - this.field2525) {
                    this.field2527 = (int) (this.field2516 - this.field2525);
                }
            }
        } catch (IOException var12) {
            this.field2529 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1051(int arg0) {
        field2524++;
        return arg0 > -60 ? null : this.field2530.method106(false);
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    private final void method1052(int arg0) throws IOException {
        if (this.field2525 != -1L) {
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2529 != this.field2525) {
                this.field2530.method107((byte) -86, this.field2525);
                this.field2529 = this.field2525;
            }
            this.field2530.method111(this.field2527, this.field2533, 1, 0);
            if (this.field2532 <= this.field2525 && ((long) this.field2511 + this.field2532) > this.field2525) {
                var2 = this.field2525;
            } else if (this.field2525 <= this.field2532 && this.field2532 < (long) this.field2527 + this.field2525) {
                var2 = this.field2532;
            }
            if (this.field2532 < this.field2525 + ((long) this.field2527) && (long) this.field2511 + this.field2532 >= (long) this.field2527 + this.field2525) {
                var4 = this.field2525 + ((long) this.field2527);
            } else if (((long) this.field2511 + this.field2532) > this.field2525 && (this.field2532 + ((long) this.field2511)) <= ((long) this.field2527 + this.field2525)) {
                var4 = this.field2532 + ((long) this.field2511);
            }
            this.field2529 += (long) this.field2527;
            if (this.field2529 > this.field2510) {
                this.field2510 = this.field2529;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class56.method432(this.field2533, (int) (var2 - this.field2525), this.field2515, (int) (var2 - this.field2532), var6);
            }
            this.field2527 = 0;
            this.field2525 = -1L;
        }
        int var7 = -82 % ((-arg0 - 5) / 32);
        field2526++;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(IIIIIB)V")
    public static final void method1053(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field2528++;
        if (arg2 >= class58.field817 && class121.field2042 >= arg4 && class156.field2507 <= arg1 && client.field3617 >= arg3) {
            class249.method1647(0, arg2, arg3, arg4, arg1, arg0);
        } else {
            class30.method208(arg4, arg3, arg1, arg0, 98, arg2);
        }
        if (arg5 >= -103) {
            method1059(58, (String) null, true);
        }
    }

    @OriginalMember(owner = "client!wk", name = "c", descriptor = "(I)V")
    private final void method1054(int arg0) throws IOException {
        this.field2511 = 0;
        field2513++;
        if (this.field2529 != this.field2516) {
            this.field2530.method107((byte) -113, this.field2516);
            this.field2529 = this.field2516;
        }
        if (arg0 < 56) {
            this.field2527 = 22;
        }
        this.field2532 = this.field2516;
        while (this.field2515.length > this.field2511) {
            int var2 = this.field2515.length - this.field2511;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2530.method108(var2, this.field2515, this.field2511, -120);
            if (var3 == -1) {
                break;
            }
            this.field2511 += var3;
            this.field2529 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(B)J")
    public final long method1055(byte arg0) {
        if (arg0 >= -59) {
            this.field2529 = 73L;
        }
        field2519++;
        return this.field2521;
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(B)V")
    public static void method1056(byte arg0) {
        field2522 = null;
        int var1 = 112 % ((-arg0 - 10) / 49);
        field2509 = null;
        field2518 = null;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(BJ)V")
    public final void method1057(byte arg0, long arg1) throws IOException {
        field2517++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1051(-82));
        }
        this.field2516 = arg1;
        int var4 = -76 / ((-arg0 - 36) / 45);
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III[B)V")
    public final void method1058(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2534++;
        try {
            if ((arg1 + arg2) > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field2525 != -1L && this.field2516 >= this.field2525 && this.field2525 + ((long) this.field2527) >= this.field2516 - -((long) arg2)) {
                class56.method432(this.field2533, (int) (this.field2516 - this.field2525), arg3, arg1, arg2);
                this.field2516 += (long) arg2;
                return;
            }
            int var5 = arg1;
            long var6 = this.field2516;
            int var8 = arg2;
            if (this.field2516 >= this.field2532 && this.field2516 < ((long) this.field2511 + this.field2532)) {
                int var9 = (int) (this.field2532 + (long) this.field2511 - this.field2516);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class56.method432(this.field2515, (int) (this.field2516 - this.field2532), arg3, arg1, var9);
                arg1 += var9;
                this.field2516 += (long) var9;
            }
            if (this.field2515.length < arg2) {
                this.field2530.method107((byte) -47, this.field2516);
                this.field2529 = this.field2516;
                while (arg2 > 0) {
                    int var11 = this.field2530.method108(arg2, arg3, arg1, -118);
                    if (var11 == -1) {
                        break;
                    }
                    this.field2529 += (long) var11;
                    arg1 += var11;
                    this.field2516 += (long) var11;
                    arg2 -= var11;
                }
            } else if (arg2 > 0) {
                this.method1054(118);
                int var10 = arg2;
                if (arg2 > this.field2511) {
                    var10 = this.field2511;
                }
                class56.method432(this.field2515, 0, arg3, arg1, var10);
                this.field2516 += (long) var10;
                arg2 -= var10;
                arg1 += var10;
            }
            if (this.field2525 != -1L) {
                if (this.field2525 > this.field2516 && arg2 > 0) {
                    int var12 = (int) (this.field2525 - this.field2516) + arg1;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg2--;
                        arg3[arg1++] = 0;
                        this.field2516++;
                    }
                }
                long var13 = -1L;
                if (this.field2525 >= var6 && ((long) var8 + var6) > this.field2525) {
                    var13 = this.field2525;
                } else if (var6 >= this.field2525 && var6 < (long) this.field2527 + this.field2525) {
                    var13 = var6;
                }
                long var15 = -1L;
                if ((long) this.field2527 + this.field2525 > var6 && this.field2525 + ((long) this.field2527) <= var6 - -((long) var8)) {
                    var15 = (long) this.field2527 + this.field2525;
                } else if ((long) var8 + var6 > this.field2525 && (var6 + ((long) var8)) <= ((long) this.field2527 + this.field2525)) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class56.method432(this.field2533, (int) (var13 - this.field2525), arg3, (int) (var13 - var6) + var5, var17);
                    if (var15 > this.field2516) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field2516));
                        this.field2516 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2529 = -1L;
            throw var19;
        }
        if (arg0 == 0 && arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public static final void method1059(int arg0, String arg1, boolean arg2) {
        field2535++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class58.field809.method1143(arg1, 250);
        int var6 = class58.field809.method1134(arg1, 250) * 13;
        int var7 = var3 + 6;
        class63.method507(var4 - var3, -var3 + var7, var3 + var5 + var3, var3 + var3 + var6, 0);
        class63.method510(var4 - var3, -var3 + var7, var5 + var3 + var3, var6 - (-var3 + -var3), 16777215);
        class58.field809.method1123(arg1, var4, var7, var5, var6, 16777215, -1, 1, 1, arg0);
        class134.method944(var6 + var3 + var3, -var3 + var7, var3 + var5 + var3, var4 - var3, false);
        if (!arg2) {
            class296.method1976(15527, var4, var5, var7, var6);
            return;
        }
        try {
            Graphics var8 = class38.field458.getGraphics();
            class217.field3478.method427(0, var8, 0, arg0 ^ 0xFFFFF1DB);
        } catch (Exception var9) {
            class38.field458.repaint();
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1060(String arg0, int arg1) {
        field2514++;
        return arg1 == -4850 ? arg0.length() + 1 : 107;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "([BZ)V")
    public final void method1061(byte[] arg0, boolean arg1) throws IOException {
        if (!arg1) {
            this.method1051(-65);
        }
        this.method1058(0, 0, arg0.length, arg0);
        field2520++;
    }

    @OriginalMember(owner = "client!wk", name = "<init>", descriptor = "(Loh;II)V")
    public class157(class14 arg0, int arg1, int arg2) throws IOException {
        this.field2530 = arg0;
        this.field2521 = this.field2510 = arg0.method110((byte) -117);
        this.field2515 = new byte[arg1];
        this.field2533 = new byte[arg2];
        this.field2516 = 0L;
    }
}
