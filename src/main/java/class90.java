import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class90 {

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "J")
    private long field1108 = -1L;

    @OriginalMember(owner = "client!wh", name = "p", descriptor = "J")
    private long field1119 = -1L;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    private int field1111 = 0;

    @OriginalMember(owner = "client!wh", name = "s", descriptor = "Lia;")
    private class383 field1122;

    @OriginalMember(owner = "client!wh", name = "r", descriptor = "J")
    private long field1121;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "J")
    private long field1107;

    @OriginalMember(owner = "client!wh", name = "m", descriptor = "J")
    private long field1116;

    @OriginalMember(owner = "client!wh", name = "n", descriptor = "[B")
    private byte[] field1117;

    @OriginalMember(owner = "client!wh", name = "o", descriptor = "[B")
    private byte[] field1118;

    @OriginalMember(owner = "client!wh", name = "v", descriptor = "Lus;")
    public static class1 field1125 = new class1(48, 8);

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!wh", name = "l", descriptor = "I")
    public static int field1115;

    @OriginalMember(owner = "client!wh", name = "q", descriptor = "I")
    private int field1120;

    @OriginalMember(owner = "client!wh", name = "t", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!wh", name = "u", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "J")
    private long field1106;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BJ)V")
    public final void method506(byte arg0, long arg1) throws IOException {
        field1105++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method508(200000000));
        }
        this.field1116 = arg1;
        int var4 = -92 % ((arg0 - 29) / 42);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)J")
    public final long method507(boolean arg0) {
        if (!arg0) {
            field1125 = null;
        }
        field1112++;
        return this.field1107;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method508(int arg0) {
        field1110++;
        if (arg0 != 200000000) {
            method515(80);
        }
        return this.field1122.method2312(arg0 ^ 0xBEBC23E);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I[BII)V")
    public final void method509(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field1109++;
        try {
            if (this.field1107 < (long) arg0 + this.field1116) {
                this.field1107 = (long) arg0 + this.field1116;
            }
            if (this.field1119 != -1L && (this.field1116 < this.field1119 || this.field1119 + ((long) this.field1111) < this.field1116)) {
                this.method511((byte) 20);
            }
            if (this.field1119 != -1L && (long) arg0 + this.field1116 > (long) this.field1117.length + this.field1119) {
                int var5 = (int) (this.field1119 - (this.field1116 - (long) this.field1117.length));
                class415.method2448(arg1, arg3, this.field1117, (int) (this.field1116 - this.field1119), var5);
                this.field1116 += (long) var5;
                arg3 += var5;
                arg0 -= var5;
                this.field1111 = this.field1117.length;
                this.method511((byte) 20);
            }
            if (arg0 > this.field1117.length) {
                if (this.field1116 != this.field1106) {
                    this.field1122.method2314(this.field1116, 0);
                    this.field1106 = this.field1116;
                }
                this.field1122.method2310(arg0, 401, arg3, arg1);
                this.field1106 += (long) arg0;
                if (this.field1121 < this.field1106) {
                    this.field1121 = this.field1106;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1116 >= this.field1108 && this.field1116 < (long) this.field1120 + this.field1108) {
                    var6 = this.field1116;
                } else if (this.field1108 >= this.field1116 && (long) arg0 + this.field1116 > this.field1108) {
                    var6 = this.field1108;
                }
                if (this.field1108 < ((long) arg0 + this.field1116) && (long) this.field1120 + this.field1108 >= (long) arg0 + this.field1116) {
                    var8 = this.field1116 + ((long) arg0);
                } else if ((long) this.field1120 + this.field1108 > this.field1116 && (this.field1108 + ((long) this.field1120)) <= ((long) arg0 + this.field1116)) {
                    var8 = (long) this.field1120 + this.field1108;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class415.method2448(arg1, (int) (var6 + (long) arg3 - this.field1116), this.field1118, (int) (var6 - this.field1108), var10);
                }
                this.field1116 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field1119 == -1L) {
                    this.field1119 = this.field1116;
                }
                class415.method2448(arg1, arg3, this.field1117, (int) (this.field1116 - this.field1119), arg0);
                this.field1116 += (long) arg0;
                if (((long) this.field1111) < (this.field1116 - this.field1119)) {
                    this.field1111 = (int) (this.field1116 - this.field1119);
                }
            } else if (arg2 != -30916) {
                this.field1111 = 45;
            }
        } catch (IOException var12) {
            this.field1106 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BI)V")
    public final void method510(byte[] arg0, int arg1) throws IOException {
        this.method513(arg0.length, arg1 - 22019, 0, arg0);
        if (arg1 == 18856) {
            field1113++;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    private final void method511(byte arg0) throws IOException {
        if (this.field1119 != -1L) {
            if (this.field1119 != this.field1106) {
                this.field1122.method2314(this.field1119, 0);
                this.field1106 = this.field1119;
            }
            this.field1122.method2310(this.field1111, 401, 0, this.field1117);
            this.field1106 += (long) this.field1111;
            if (this.field1121 < this.field1106) {
                this.field1121 = this.field1106;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field1119 >= this.field1108 && this.field1119 < (long) this.field1120 + this.field1108) {
                var2 = this.field1119;
            } else if (this.field1108 >= this.field1119 && ((long) this.field1111 + this.field1119) > this.field1108) {
                var2 = this.field1108;
            }
            if (this.field1119 + ((long) this.field1111) > this.field1108 && (this.field1119 + ((long) this.field1111)) <= ((long) this.field1120 + this.field1108)) {
                var4 = (long) this.field1111 + this.field1119;
            } else if (((long) this.field1120 + this.field1108) > this.field1119 && (long) this.field1120 + this.field1108 <= this.field1119 - -((long) this.field1111)) {
                var4 = (long) this.field1120 + this.field1108;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class415.method2448(this.field1117, (int) (var2 - this.field1119), this.field1118, (int) (var2 - this.field1108), var6);
            }
            this.field1111 = 0;
            this.field1119 = -1L;
        }
        field1114++;
        if (arg0 != 20) {
            this.field1120 = 70;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)V")
    public static void method512(int arg0) {
        field1125 = null;
        if (arg0 < 14) {
            field1125 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(III[B)V")
    public final void method513(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1115++;
        try {
            if (arg0 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field1119 != -1L && this.field1119 <= this.field1116 && ((long) this.field1111 + this.field1119) >= ((long) arg0 + this.field1116)) {
                class415.method2448(this.field1117, (int) (this.field1116 - this.field1119), arg3, arg2, arg0);
                this.field1116 += (long) arg0;
                return;
            }
            long var5 = this.field1116;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field1108 <= this.field1116 && ((long) this.field1120 + this.field1108) > this.field1116) {
                int var9 = (int) (-this.field1116 - (-this.field1108 - (long) this.field1120));
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class415.method2448(this.field1118, (int) (this.field1116 - this.field1108), arg3, arg2, var9);
                arg2 += var9;
                this.field1116 += (long) var9;
                arg0 -= var9;
            }
            if (arg0 > this.field1118.length) {
                this.field1122.method2314(this.field1116, arg1 + 3163);
                this.field1106 = this.field1116;
                while (arg0 > 0) {
                    int var10 = this.field1122.method2309((byte) 46, arg0, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field1106 += (long) var10;
                    arg0 -= var10;
                    arg2 += var10;
                    this.field1116 += (long) var10;
                }
            } else if (arg0 > 0) {
                this.method514((byte) 99);
                int var11 = arg0;
                if (arg0 > this.field1120) {
                    var11 = this.field1120;
                }
                class415.method2448(this.field1118, 0, arg3, arg2, var11);
                this.field1116 += (long) var11;
                arg0 -= var11;
                arg2 += var11;
            }
            if (arg1 != -3163) {
                this.method507(false);
            }
            if (this.field1119 != -1L) {
                if (this.field1116 < this.field1119 && arg0 > 0) {
                    int var12 = (int) (this.field1119 - this.field1116) + arg2;
                    if (var12 > arg0 + arg2) {
                        var12 = arg2 + arg0;
                    }
                    while (arg2 < var12) {
                        arg0--;
                        arg3[arg2++] = 0;
                        this.field1116++;
                    }
                }
                long var13 = -1L;
                if (this.field1119 >= var5 && ((long) var8 + var5) > this.field1119) {
                    var13 = this.field1119;
                } else if (this.field1119 <= var5 && ((long) this.field1111 + this.field1119) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field1111 + this.field1119 > var5 && (long) var8 + var5 >= this.field1119 - -((long) this.field1111)) {
                    var15 = (long) this.field1111 + this.field1119;
                } else if (this.field1119 < ((long) var8 + var5) && this.field1119 + ((long) this.field1111) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class415.method2448(this.field1117, (int) (var13 - this.field1119), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1116) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field1116));
                        this.field1116 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1106 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(B)V")
    private final void method514(byte arg0) throws IOException {
        field1123++;
        this.field1120 = 0;
        if (arg0 < 75) {
            field1124 = 34;
        }
        if (this.field1116 != this.field1106) {
            this.field1122.method2314(this.field1116, 0);
            this.field1106 = this.field1116;
        }
        this.field1108 = this.field1116;
        while (this.field1120 < this.field1118.length) {
            int var2 = this.field1118.length - this.field1120;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1122.method2309((byte) 46, var2, this.field1120, this.field1118);
            if (var3 == -1) {
                break;
            }
            this.field1106 += (long) var3;
            this.field1120 += var3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "(I)V")
    public static final void method515(int arg0) {
        if (class51.method325(2)) {
            if (class118.field1487 == null) {
                class273.method1675(true);
            }
            class255.field3740 = new int[100];
            class184.field2715 = new int[100];
            class248.field3673 = 0;
            class103.field1318 = true;
            class23.field309 = new int[100];
            class95.field1228 = new int[100];
            for (int var1 = 0; var1 < 100; var1++) {
                class95.field1228[var1] = (int) ((double) class144.field1900 * Math.random()) << 4;
                class184.field2715[var1] = (int) (Math.random() * 350.0D) << 4;
                class23.field309[var1] = (int) (Math.random() * 102.0D) + 51;
                class255.field3740[var1] = (int) (Math.random() * 48.0D) + 8;
            }
            try {
                class27.field366 = class76.field936.getToolkit().getSystemClipboard();
            } catch (Exception var2) {
            }
        }
        field1104++;
        if (arg0 != 4) {
            field1124 = -3;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lia;II)V")
    public class90(class383 arg0, int arg1, int arg2) throws IOException {
        this.field1122 = arg0;
        this.field1107 = this.field1121 = arg0.method2313(0);
        this.field1116 = 0L;
        this.field1117 = new byte[arg2];
        this.field1118 = new byte[arg1];
    }
}
