import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class77 {

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "J")
    private long field1072 = -1L;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "J")
    private long field1084 = -1L;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "I")
    private int field1081 = 0;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "Ln;")
    private class313 field1088;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "J")
    private long field1083;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "J")
    private long field1085;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "[B")
    private byte[] field1070;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "[B")
    private byte[] field1079;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "J")
    private long field1087;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Lgi;")
    public static class109 field1077 = new class109(64);

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "Ljava/lang/String;")
    public static String field1092 = "flash2:";

    @OriginalMember(owner = "client!gn", name = "z", descriptor = "I")
    public static volatile int field1093 = 0;

    @OriginalMember(owner = "client!gn", name = "A", descriptor = "I")
    public static int field1094 = -1;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "Lcd;")
    public static class69 field1091 = new class69(16);

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "I")
    private int field1068;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "J")
    private long field1086;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "[[B")
    public static byte[][] field1090;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 8)
    private final void method522(int arg0) throws IOException {
        field1089++;
        int var2 = -118 % ((arg0) / 53);
        if (this.field1084 == -1L) {
            return;
        }
        if (this.field1086 != this.field1084) {
            this.field1088.method2201(true, this.field1084);
            this.field1086 = this.field1084;
        }
        this.field1088.method2204(this.field1070, this.field1081, 0, (byte) 4);
        long var3 = -1L;
        long var5 = -1L;
        if (this.field1072 < (long) this.field1081 + this.field1084 && (long) this.field1081 + this.field1084 <= (long) this.field1068 + this.field1072) {
            var5 = (long) this.field1081 + this.field1084;
        } else if (this.field1084 < (long) this.field1068 + this.field1072 && ((long) this.field1068 + this.field1072) <= ((long) this.field1081 + this.field1084)) {
            var5 = (long) this.field1068 + this.field1072;
        }
        if (this.field1072 <= this.field1084 && ((long) this.field1068 + this.field1072) > this.field1084) {
            var3 = this.field1084;
        } else if (this.field1084 <= this.field1072 && this.field1072 < ((long) this.field1081 + this.field1084)) {
            var3 = this.field1072;
        }
        this.field1086 += (long) this.field1081;
        if (this.field1083 < this.field1086) {
            this.field1083 = this.field1086;
        }
        if (var3 > -1L && var3 < var5) {
            int var7 = (int) (var5 - var3);
            class9.method46(this.field1070, (int) (var3 - this.field1084), this.field1079, (int) (var3 - this.field1072), var7);
        }
        this.field1081 = 0;
        this.field1084 = -1L;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I[B)V", line = 83)
    public final void method523(int arg0, byte[] arg1) throws IOException {
        this.method525(arg1, 0, arg1.length, arg0);
        field1082++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(B)Ljava/io/File;", line = 91)
    private final File method524(byte arg0) {
        field1074++;
        int var2 = -64 % ((-arg0 - 22) / 41);
        return this.field1088.method2200(true);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "([BIII)V", line = 107)
    public final void method525(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1075++;
        try {
            if (arg0.length < arg3 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field1084 != -1L && this.field1084 <= this.field1087 && ((long) arg2 + this.field1087) <= ((long) this.field1081 + this.field1084)) {
                class9.method46(this.field1070, (int) (this.field1087 - this.field1084), arg0, arg3, arg2);
                this.field1087 += (long) arg2;
                return;
            }
            int var5 = arg2;
            long var6 = this.field1087;
            int var8 = arg3;
            if (this.field1087 >= this.field1072 && this.field1087 < this.field1072 + ((long) this.field1068)) {
                int var9 = (int) ((long) this.field1068 + this.field1072 - this.field1087);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class9.method46(this.field1079, (int) (this.field1087 - this.field1072), arg0, arg3, var9);
                arg3 += var9;
                this.field1087 += (long) var9;
                arg2 -= var9;
            }
            if (arg2 > this.field1079.length) {
                this.field1088.method2201(true, this.field1087);
                this.field1086 = this.field1087;
                while (arg2 > 0) {
                    int var10 = this.field1088.method2202(-94, arg3, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 -= var10;
                    this.field1086 += (long) var10;
                    this.field1087 += (long) var10;
                    arg3 += var10;
                }
            } else if (arg2 > 0) {
                this.method526(-7963);
                int var11 = arg2;
                if (arg2 > this.field1068) {
                    var11 = this.field1068;
                }
                arg2 -= var11;
                class9.method46(this.field1079, 0, arg0, arg3, var11);
                arg3 += var11;
                this.field1087 += (long) var11;
            }
            if (this.field1084 != -1L) {
                if (this.field1084 > this.field1087 && arg2 > 0) {
                    int var12 = arg3 + ((int) (this.field1084 - this.field1087));
                    if (var12 > arg2 + arg3) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg3) {
                        arg0[arg3++] = 0;
                        this.field1087++;
                        arg2--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var6 < ((long) this.field1081 + this.field1084) && (long) this.field1081 + this.field1084 <= (long) var5 + var6) {
                    var15 = (long) this.field1081 + this.field1084;
                } else if (this.field1084 < ((long) var5 + var6) && (long) var5 + var6 <= (long) this.field1081 + this.field1084) {
                    var15 = var6 + ((long) var5);
                }
                if (this.field1084 >= var6 && this.field1084 < (long) var5 + var6) {
                    var13 = this.field1084;
                } else if (this.field1084 <= var6 && var6 < (long) this.field1081 + this.field1084) {
                    var13 = var6;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class9.method46(this.field1070, (int) (var13 - this.field1084), arg0, var8 + ((int) (var13 - var6)), var17);
                    if (var15 > this.field1087) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field1087));
                        this.field1087 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1086 = -1L;
            throw var19;
        }
        if (arg1 < arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(I)V", line = 291)
    private final void method526(int arg0) throws IOException {
        this.field1068 = 0;
        if (arg0 != -7963) {
            field1091 = (class69) null;
        }
        if (this.field1087 != this.field1086) {
            this.field1088.method2201(true, this.field1087);
            this.field1086 = this.field1087;
        }
        this.field1072 = this.field1087;
        field1071++;
        while (this.field1068 < this.field1079.length) {
            int var2 = this.field1079.length - this.field1068;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1088.method2202(-128, this.field1068, this.field1079, var2);
            if (var3 == -1) {
                break;
            }
            this.field1068 += var3;
            this.field1086 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLjava/lang/String;)I", line = 341)
    public static final int method527(byte arg0, String arg1) {
        if (arg0 >= -2) {
            method527((byte) -81, (String) null);
        }
        field1076++;
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(JI)V", line = 353)
    public final void method528(long arg0, int arg1) throws IOException {
        field1080++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method524((byte) 55));
        }
        int var4 = -50 % ((30 - arg1) / 55);
        this.field1087 = arg0;
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "([BIII)V", line = 375)
    public final void method529(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1073++;
        try {
            if (this.field1085 < (long) arg3 + this.field1087) {
                this.field1085 = this.field1087 + ((long) arg3);
            }
            if (this.field1084 != -1L && (this.field1084 > this.field1087 || (long) this.field1081 + this.field1084 < this.field1087)) {
                this.method522(-82);
            }
            if ((long) arg2 != this.field1084 && ((long) this.field1070.length + this.field1084) < (this.field1087 + ((long) arg3))) {
                int var5 = (int) (this.field1084 + (long) this.field1070.length - this.field1087);
                class9.method46(arg0, arg1, this.field1070, (int) (this.field1087 - this.field1084), var5);
                arg1 += var5;
                arg3 -= var5;
                this.field1087 += (long) var5;
                this.field1081 = this.field1070.length;
                this.method522(102);
            }
            if (this.field1070.length < arg3) {
                long var6 = -1L;
                if (this.field1087 != this.field1086) {
                    this.field1088.method2201(true, this.field1087);
                    this.field1086 = this.field1087;
                }
                this.field1088.method2204(arg0, arg3, arg1, (byte) 4);
                this.field1086 += (long) arg3;
                if (this.field1086 > this.field1083) {
                    this.field1083 = this.field1086;
                }
                if (this.field1087 >= this.field1072 && (long) this.field1068 + this.field1072 > this.field1087) {
                    var6 = this.field1087;
                } else if (this.field1087 <= this.field1072 && (long) arg3 + this.field1087 > this.field1072) {
                    var6 = this.field1072;
                }
                long var8 = -1L;
                if ((this.field1087 + ((long) arg3)) > this.field1072 && ((long) arg3 + this.field1087) <= (this.field1072 + ((long) this.field1068))) {
                    var8 = (long) arg3 + this.field1087;
                } else if ((this.field1072 + ((long) this.field1068)) > this.field1087 && ((long) arg3 + this.field1087) >= (this.field1072 + ((long) this.field1068))) {
                    var8 = (long) this.field1068 + this.field1072;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class9.method46(arg0, (int) ((long) arg1 + var6 - this.field1087), this.field1079, (int) (var6 - this.field1072), var10);
                }
                this.field1087 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field1084 == -1L) {
                    this.field1084 = this.field1087;
                }
                class9.method46(arg0, arg1, this.field1070, (int) (this.field1087 - this.field1084), arg3);
                this.field1087 += (long) arg3;
                if ((this.field1087 - this.field1084) > ((long) this.field1081)) {
                    this.field1081 = (int) (this.field1087 - this.field1084);
                }
            }
        } catch (IOException var12) {
            this.field1086 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Ln;II)V", line = 555)
    public class77(class313 arg0, int arg1, int arg2) throws IOException {
        this.field1088 = arg0;
        this.field1085 = this.field1083 = arg0.method2199(-128);
        this.field1070 = new byte[arg2];
        this.field1079 = new byte[arg1];
        this.field1087 = 0L;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(I)J", line = 519)
    public final long method530(int arg0) {
        field1078++;
        int var2 = -106 / ((62 - arg0) / 50);
        return this.field1085;
    }

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "(I)V", line = 535)
    public static void method531(int arg0) {
        field1092 = null;
        field1077 = null;
        field1091 = null;
        field1090 = (byte[][]) null;
        if (arg0 != 0) {
            field1077 = (class109) null;
        }
    }
}
