import java.awt.event.KeyEvent;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class147 {

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "J")
    private long field3008 = -1L;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "I")
    private int field3024 = 0;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "J")
    private long field3038 = -1L;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "Ltc;")
    private class178 field3035;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "J")
    private long field3023;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "J")
    private long field3022;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[B")
    private byte[] field3030;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "J")
    private long field3032;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "[B")
    private byte[] field3016;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lrf;")
    private static class163 field3010 = class53.method392(-119, "Prepared visibility map");

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field3009 = -1;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "[I")
    public static int[] field3013 = new int[100];

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "Lrf;")
    public static class163 field3033 = field3010;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Lrf;")
    public static class163 field3037 = class53.method392(81, "::errortest");

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    private int field3017;

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "J")
    private long field3031;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[Lrh;")
    public static class165[] field3026;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B[B)V")
    public final void method951(byte arg0, byte[] arg1) throws IOException {
        field3029++;
        if (arg0 == 106) {
            this.method962(-108, arg1.length, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method952(byte arg0) throws IOException {
        if (arg0 != 112) {
            this.field3023 = -55L;
        }
        field3020++;
        this.method953(-1);
        this.field3035.method1204((byte) 116);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
    private final void method953(int arg0) throws IOException {
        field3036++;
        if ((long) arg0 == this.field3008) {
            return;
        }
        if (this.field3031 != this.field3008) {
            this.field3035.method1209(this.field3008, false);
            this.field3031 = this.field3008;
        }
        long var2 = -1L;
        long var4 = -1L;
        this.field3035.method1205(0, this.field3030, (byte) -51, this.field3024);
        if (this.field3038 < (long) this.field3024 + this.field3008 && this.field3038 + (long) this.field3017 >= (long) this.field3024 + this.field3008) {
            var2 = (long) this.field3024 + this.field3008;
        } else if (this.field3008 < (long) this.field3017 + this.field3038 && (long) this.field3024 + this.field3008 >= (long) this.field3017 + this.field3038) {
            var2 = this.field3038 + (long) this.field3017;
        }
        this.field3031 += this.field3024;
        if (this.field3031 > this.field3023) {
            this.field3023 = this.field3031;
        }
        if (this.field3038 <= this.field3008 && this.field3008 < (long) this.field3017 + this.field3038) {
            var4 = this.field3008;
        } else if (this.field3008 <= this.field3038 && (long) this.field3024 + this.field3008 > this.field3038) {
            var4 = this.field3038;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class123.method830(this.field3030, (int) (var4 - this.field3008), this.field3016, (int) (var4 - this.field3038), var6);
        }
        this.field3008 = -1L;
        this.field3024 = 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lu;Z)V")
    public static final void method954(class184 arg0, boolean arg1) {
        field3011++;
        if (!arg1) {
            method958(77, -74, (byte) -43);
        }
        class49.field955 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    private final void method955(int arg0) throws IOException {
        if (arg0 != -13180) {
            field3033 = null;
        }
        this.field3017 = 0;
        if (this.field3032 != this.field3031) {
            this.field3035.method1209(this.field3032, false);
            this.field3031 = this.field3032;
        }
        field3025++;
        this.field3038 = this.field3032;
        while (this.field3017 < this.field3016.length) {
            int var2 = this.field3035.method1208(false, this.field3017, this.field3016.length - this.field3017, this.field3016);
            if (var2 == -1) {
                break;
            }
            this.field3017 += var2;
            this.field3031 += var2;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BIBI)V")
    public final void method956(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field3028++;
        try {
            if (this.field3022 < this.field3032 + (long) arg3) {
                this.field3022 = (long) arg3 + this.field3032;
            }
            if (arg2 == -86) {
                if (this.field3008 != -1L && (this.field3008 > this.field3032 || (long) this.field3024 + this.field3008 < this.field3032)) {
                    this.method953(-1);
                }
                if (this.field3008 != -1L && (long) arg3 + this.field3032 > this.field3008 - -((long) this.field3030.length)) {
                    int var5 = (int) ((long) this.field3030.length + this.field3008 - this.field3032);
                    arg3 -= var5;
                    class123.method830(arg0, arg1, this.field3030, (int) (this.field3032 - this.field3008), var5);
                    this.field3032 += var5;
                    this.field3024 = this.field3030.length;
                    arg1 += var5;
                    this.method953(-1);
                }
                if (arg3 > this.field3030.length) {
                    if (this.field3032 != this.field3031) {
                        this.field3035.method1209(this.field3032, false);
                        this.field3031 = this.field3032;
                    }
                    this.field3035.method1205(arg1, arg0, (byte) 94, arg3);
                    this.field3031 += arg3;
                    if (this.field3031 > this.field3023) {
                        this.field3023 = this.field3031;
                    }
                    long var6 = -1L;
                    if ((long) arg3 + this.field3032 > this.field3038 && this.field3032 + (long) arg3 <= this.field3038 - -((long) this.field3017)) {
                        var6 = (long) arg3 + this.field3032;
                    } else if ((long) this.field3017 + this.field3038 > this.field3032 && this.field3032 + (long) arg3 >= (long) this.field3017 + this.field3038) {
                        var6 = this.field3038 + (long) this.field3017;
                    }
                    long var8 = -1L;
                    if (this.field3038 <= this.field3032 && this.field3032 < (long) this.field3017 + this.field3038) {
                        var8 = this.field3032;
                    } else if (this.field3032 <= this.field3038 && (long) arg3 + this.field3032 > this.field3038) {
                        var8 = this.field3038;
                    }
                    if (var8 > -1L && var6 > var8) {
                        int var10 = (int) (var6 - var8);
                        class123.method830(arg0, (int) (var8 + (long) arg1 - this.field3032), this.field3016, (int) (var8 - this.field3038), var10);
                    }
                    this.field3032 += arg3;
                } else if (arg3 > 0) {
                    if (this.field3008 == -1L) {
                        this.field3008 = this.field3032;
                    }
                    class123.method830(arg0, arg1, this.field3030, (int) (this.field3032 - this.field3008), arg3);
                    this.field3032 += arg3;
                    if (this.field3032 - this.field3008 > (long) this.field3024) {
                        this.field3024 = (int) (this.field3032 - this.field3008);
                    }
                }
            }
        } catch (IOException var12) {
            this.field3031 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method957(int arg0) {
        if (arg0 > -27) {
            field3009 = -44;
        }
        field3010 = null;
        field3026 = null;
        field3013 = null;
        field3033 = null;
        field3037 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIB)V")
    public static final void method958(int arg0, int arg1, byte arg2) {
        if (arg2 < 14) {
            return;
        }
        field3034++;
        if (class184.field3678 < 2 && class62.field1326 == 0 && !class189.field3766) {
            return;
        }
        class163 var3;
        if (class62.field1326 == 1 && class184.field3678 < 2) {
            var3 = class180.method1216(new class163[] { class193.field3794, class4.field69, class119.field2516, class189.field3768 }, false);
        } else if (class189.field3766 && class184.field3678 < 2) {
            var3 = class180.method1216(new class163[] { class181.field3635, class4.field69, class6.field134, class189.field3768 }, false);
        } else {
            var3 = class177.method1203(class184.field3678 - 1, 22025);
        }
        if (class184.field3678 > 2) {
            var3 = class180.method1216(new class163[] { var3, class155.field3217, class34.method217(class184.field3678 - 2, -112), class27.field512 }, false);
        }
        int var4 = class134.field2772.method566(var3, arg1 + 4, arg0 + 15, 16777215, 0, class53.field1097, class72.field1518);
        class191.method1287(arg1 + 4, arg0, 15, var4 + class134.field2772.method560(var3), -7807);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method959(boolean arg0) {
        field3015++;
        if (arg0) {
            field3013 = null;
        }
        return this.field3035.method1206(-44);
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)J")
    public final long method960(int arg0) {
        if (arg0 != -3) {
            this.field3030 = null;
        }
        field3019++;
        return this.field3022;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method961(int arg0, KeyEvent arg1) {
        field3027++;
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else if (arg0 == -3) {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        } else {
            return -68;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III[B)V")
    public final void method962(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3012++;
        try {
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg3.length);
            }
            if (arg0 > -93) {
                this.field3030 = null;
            }
            if (this.field3008 != -1L && this.field3032 >= this.field3008 && (long) arg1 + this.field3032 <= (long) this.field3024 + this.field3008) {
                class123.method830(this.field3030, (int) (this.field3032 - this.field3008), arg3, arg2, arg1);
                this.field3032 += arg1;
                return;
            }
            long var5 = this.field3032;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field3038 <= this.field3032 && this.field3032 < (long) this.field3017 + this.field3038) {
                int var9 = (int) (this.field3038 + (long) this.field3017 - this.field3032);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class123.method830(this.field3016, (int) (this.field3032 - this.field3038), arg3, arg2, var9);
                arg2 += var9;
                this.field3032 += var9;
            }
            if (arg1 > this.field3016.length) {
                this.field3035.method1209(this.field3032, false);
                this.field3031 = this.field3032;
                while (arg1 > 0) {
                    int var10 = this.field3035.method1208(false, arg2, arg1, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    arg1 -= var10;
                    this.field3031 += var10;
                    this.field3032 += var10;
                }
            } else if (arg1 > 0) {
                this.method955(-13180);
                int var11 = arg1;
                if (arg1 > this.field3017) {
                    var11 = this.field3017;
                }
                arg1 -= var11;
                class123.method830(this.field3016, 0, arg3, arg2, var11);
                arg2 += var11;
                this.field3032 += var11;
            }
            if (this.field3008 != -1L) {
                if (this.field3032 < this.field3008 && arg1 > 0) {
                    int var12 = (int) (this.field3008 - this.field3032) + arg2;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg2) {
                        arg1--;
                        arg3[arg2++] = 0;
                        this.field3032++;
                    }
                }
                long var13 = -1L;
                if (this.field3008 >= var5 && this.field3008 < (long) var8 + var5) {
                    var13 = this.field3008;
                } else if (this.field3008 <= var5 && var5 < (long) this.field3024 + this.field3008) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field3024 + this.field3008 && (long) this.field3024 + this.field3008 <= var5 - -((long) var8)) {
                    var15 = (long) this.field3024 + this.field3008;
                } else if (this.field3008 < (long) var8 + var5 && this.field3008 + (long) this.field3024 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class123.method830(this.field3030, (int) (var13 - this.field3008), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field3032) {
                        arg1 = (int) ((long) arg1 + this.field3032 - var15);
                        this.field3032 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3031 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIII)Z")
    public static final boolean method963(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class71.field1501 * arg0 + class122.field2572 * arg2 >> 16;
        int var5 = class71.field1501 * arg2 - class122.field2572 * arg0 >> 16;
        int var6 = class194.field3827 * var5 + class181.field3639 * arg1 >> 16;
        int var7 = class194.field3827 * arg1 - class181.field3639 * var5 >> 16;
        if (var6 >= 50 && var6 <= arg3) {
            int var8 = (var4 << 9) / var6 + class17.field287;
            int var9 = (var7 << 9) / var6 + class131.field2740;
            return var8 >= class120.field2521 && var8 <= class8.field177 && var9 >= class7.field147 && var9 <= class96.field2050;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JI)V")
    public final void method964(long arg0, int arg1) throws IOException {
        field3021++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method959(false));
        }
        if (arg1 != 255) {
            this.field3016 = null;
        }
        this.field3032 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ltc;II)V")
    public class147(class178 arg0, int arg1, int arg2) throws IOException {
        this.field3035 = arg0;
        this.field3022 = this.field3023 = arg0.method1207(-31783);
        this.field3030 = new byte[arg2];
        this.field3032 = 0L;
        this.field3016 = new byte[arg1];
    }
}
