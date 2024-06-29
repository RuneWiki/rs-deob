import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class55 {

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    private int field902 = 0;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "J")
    private long field904 = -1L;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "J")
    private long field907 = -1L;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lfd;")
    private class124 field910;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "J")
    private long field906;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "J")
    private long field916;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "[B")
    private byte[] field920;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "J")
    private long field914;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "[B")
    private byte[] field908;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Z")
    public static boolean field911 = false;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field915 = null;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field898;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field899;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field903;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field912;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "I")
    private int field919;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "J")
    private long field913;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BI)V")
    public final void method415(byte[] arg0, int arg1) throws IOException {
        field900++;
        this.method416(0, (byte) 35, arg0.length, arg0);
        if (arg1 != -1) {
            this.field904 = 24L;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IBI[B)V")
    public final void method416(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        field905++;
        try {
            if (arg3.length < (arg0 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg3.length);
            }
            if (this.field904 != -1L && this.field904 <= this.field914 && (long) this.field902 + this.field904 >= this.field914 - -((long) arg2)) {
                class175.method1187(this.field908, (int) (this.field914 - this.field904), arg3, arg0, arg2);
                this.field914 += (long) arg2;
                return;
            }
            long var5 = this.field914;
            int var7 = arg2;
            int var8 = arg0;
            if (this.field914 >= this.field907 && this.field914 < (long) this.field919 + this.field907) {
                int var9 = (int) (this.field907 + (long) this.field919 - this.field914);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class175.method1187(this.field920, (int) (this.field914 - this.field907), arg3, arg0, var9);
                arg0 += var9;
                this.field914 += (long) var9;
            }
            if (arg2 > this.field920.length) {
                this.field910.method865(this.field914, arg1 ^ 0xFFFFFFDC);
                this.field913 = this.field914;
                while (arg2 > 0) {
                    int var10 = this.field910.method861(arg2, arg3, -98, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg2 -= var10;
                    this.field913 += (long) var10;
                    this.field914 += (long) var10;
                }
            } else if (arg2 > 0) {
                this.method419(200000000);
                int var11 = arg2;
                if (arg2 > this.field919) {
                    var11 = this.field919;
                }
                class175.method1187(this.field920, 0, arg3, arg0, var11);
                this.field914 += (long) var11;
                arg0 += var11;
                arg2 -= var11;
            }
            if (this.field904 != -1L) {
                if (this.field914 < this.field904 && arg2 > 0) {
                    int var12 = (int) (this.field904 - this.field914) + arg0;
                    if (var12 > arg0 + arg2) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg3[arg0++] = 0;
                        arg2--;
                        this.field914++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field904 >= var5 && this.field904 < (long) var7 + var5) {
                    var13 = this.field904;
                } else if (this.field904 <= var5 && (this.field904 + ((long) this.field902)) > var5) {
                    var13 = var5;
                }
                if (var5 < (this.field904 + ((long) this.field902)) && ((long) var7 + var5) >= (this.field904 + ((long) this.field902))) {
                    var15 = this.field904 + ((long) this.field902);
                } else if (((long) var7 + var5) > this.field904 && ((long) var7 + var5) <= ((long) this.field902 + this.field904)) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class175.method1187(this.field908, (int) (var13 - this.field904), arg3, (int) (var13 - var5) + var8, var17);
                    if (var15 > this.field914) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field914));
                        this.field914 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field913 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        } else if (arg1 != 35) {
            method417(-119);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
    public static void method417(int arg0) {
        if (arg0 > 103) {
            field915 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
    private final void method418(byte arg0) throws IOException {
        if (this.field904 != -1L) {
            if (this.field913 != this.field904) {
                this.field910.method865(this.field904, -1);
                this.field913 = this.field904;
            }
            this.field910.method864(false, this.field902, this.field908, 0);
            this.field913 += (long) this.field902;
            if (this.field913 > this.field906) {
                this.field906 = this.field913;
            }
            long var2 = -1L;
            if (this.field904 >= this.field907 && this.field904 < (long) this.field919 + this.field907) {
                var2 = this.field904;
            } else if (this.field904 <= this.field907 && this.field907 < (long) this.field902 + this.field904) {
                var2 = this.field907;
            }
            long var4 = -1L;
            if (this.field907 < ((long) this.field902 + this.field904) && (this.field904 + ((long) this.field902)) <= ((long) this.field919 + this.field907)) {
                var4 = (long) this.field902 + this.field904;
            } else if (((long) this.field919 + this.field907) > this.field904 && this.field904 + ((long) this.field902) >= (long) this.field919 + this.field907) {
                var4 = this.field907 + ((long) this.field919);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class175.method1187(this.field908, (int) (var2 - this.field904), this.field920, (int) (var2 - this.field907), var6);
            }
            this.field902 = 0;
            this.field904 = -1L;
        }
        field909++;
        if (arg0 < 57) {
            this.field914 = 89L;
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
    private final void method419(int arg0) throws IOException {
        if (arg0 != 200000000) {
            method425(55, (byte) 50);
        }
        this.field919 = 0;
        if (this.field914 != this.field913) {
            this.field910.method865(this.field914, arg0 ^ 0xF4143DFF);
            this.field913 = this.field914;
        }
        this.field907 = this.field914;
        field899++;
        while (this.field919 < this.field920.length) {
            int var2 = this.field920.length - this.field919;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field910.method861(var2, this.field920, -72, this.field919);
            if (var3 == -1) {
                break;
            }
            this.field913 += (long) var3;
            this.field919 += var3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)I")
    public static int method420(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BII)V")
    public final void method421(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field901++;
        try {
            if (this.field916 < (long) arg2 + this.field914) {
                this.field916 = (long) arg2 + this.field914;
            }
            if ((long) arg0 != this.field904 && (this.field914 < this.field904 || this.field914 > this.field904 + ((long) this.field902))) {
                this.method418((byte) 68);
            }
            if (this.field904 != -1L && (long) arg2 + this.field914 > (long) this.field908.length + this.field904) {
                int var5 = (int) (this.field904 + (long) this.field908.length - this.field914);
                class175.method1187(arg1, arg3, this.field908, (int) (this.field914 - this.field904), var5);
                arg3 += var5;
                this.field914 += (long) var5;
                arg2 -= var5;
                this.field902 = this.field908.length;
                this.method418((byte) 100);
            }
            if (arg2 > this.field908.length) {
                long var6 = -1L;
                if (this.field914 != this.field913) {
                    this.field910.method865(this.field914, -1);
                    this.field913 = this.field914;
                }
                this.field910.method864(false, arg2, arg1, arg3);
                long var8 = -1L;
                this.field913 += (long) arg2;
                if (this.field913 > this.field906) {
                    this.field906 = this.field913;
                }
                if (this.field907 < this.field914 + ((long) arg2) && (long) this.field919 + this.field907 >= (long) arg2 + this.field914) {
                    var6 = (long) arg2 + this.field914;
                } else if (this.field914 < (long) this.field919 + this.field907 && ((long) arg2 + this.field914) >= ((long) this.field919 + this.field907)) {
                    var6 = (long) this.field919 + this.field907;
                }
                if (this.field914 >= this.field907 && (long) this.field919 + this.field907 > this.field914) {
                    var8 = this.field914;
                } else if (this.field914 <= this.field907 && ((long) arg2 + this.field914) > this.field907) {
                    var8 = this.field907;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class175.method1187(arg1, (int) ((long) arg3 + var8 - this.field914), this.field920, (int) (var8 - this.field907), var10);
                }
                this.field914 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field904 == -1L) {
                    this.field904 = this.field914;
                }
                class175.method1187(arg1, arg3, this.field908, (int) (this.field914 - this.field904), arg2);
                this.field914 += (long) arg2;
                if ((long) this.field902 < this.field914 - this.field904) {
                    this.field902 = (int) (this.field914 - this.field904);
                }
            }
        } catch (IOException var12) {
            this.field913 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method422(int arg0) {
        field898++;
        return arg0 == 16711680 ? this.field910.method860(1) : null;
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)J")
    public final long method423(int arg0) {
        int var2 = -92 % ((50 - arg0) / 41);
        field903++;
        return this.field916;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(JI)V")
    public final void method424(long arg0, int arg1) throws IOException {
        field917++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method422(16711680));
        }
        this.field914 = arg0;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(IB)V")
    public static final void method425(int arg0, byte arg1) {
        field912++;
        if (arg1 < 75) {
            method417(15);
        }
        class41 var2 = class221.method1492((byte) -42, arg0, 2);
        var2.method303(23981);
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lfd;II)V")
    public class55(class124 arg0, int arg1, int arg2) throws IOException {
        this.field910 = arg0;
        this.field916 = this.field906 = arg0.method862(14718);
        this.field920 = new byte[arg1];
        this.field914 = 0L;
        this.field908 = new byte[arg2];
    }
}
