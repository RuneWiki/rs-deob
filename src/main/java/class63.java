import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class63 {

    @OriginalMember(owner = "client!r", name = "s", descriptor = "J")
    private long field1028 = -1L;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "J")
    private long field1026 = -1L;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    private int field1012 = 0;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "Lum;")
    private class184 field1021;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "J")
    private long field1020;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "J")
    private long field1010;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "J")
    private long field1014;

    @OriginalMember(owner = "client!r", name = "w", descriptor = "[B")
    private byte[] field1032;

    @OriginalMember(owner = "client!r", name = "u", descriptor = "[B")
    private byte[] field1030;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Lfg;")
    public static class18 field1013 = new class18(64);

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1022 = "Drop";

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "I")
    private int field1023;

    @OriginalMember(owner = "client!r", name = "o", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!r", name = "t", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!r", name = "v", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!r", name = "x", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "J")
    private long field1025;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BI)V", line = 8)
    public final void method479(byte[] arg0, int arg1) throws IOException {
        if (arg1 < -55) {
            this.method487(84, arg0.length, 0, arg0);
            field1018++;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)V", line = 22)
    private final void method480(boolean arg0) throws IOException {
        this.field1023 = 0;
        field1027++;
        if (this.field1025 != this.field1014) {
            this.field1021.method1433(this.field1014, (byte) -128);
            this.field1025 = this.field1014;
        }
        this.field1028 = this.field1014;
        if (arg0) {
            this.field1026 = 104L;
        }
        while (this.field1023 < this.field1030.length) {
            int var2 = this.field1030.length - this.field1023;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1021.method1434(var2, 90, this.field1030, this.field1023);
            if (var3 == -1) {
                break;
            }
            this.field1023 += var3;
            this.field1025 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)Ljava/io/File;", line = 70)
    private final File method481(int arg0) {
        field1019++;
        return arg0 == 0 ? this.field1021.method1432((byte) 94) : null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(JB)V", line = 82)
    public final void method482(long arg0, byte arg1) throws IOException {
        field1033++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method481(0));
        }
        this.field1014 = arg0;
        if (arg1 <= 9) {
            this.field1014 = -56L;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lja;)V", line = 100)
    public static final void method483(class90 arg0) {
        for (int var1 = class406.field5909; var1 < class13.field218; var1++) {
            for (int var2 = 0; var2 < class139.field2209; var2++) {
                for (int var3 = 0; var3 < class436.field6353; var3++) {
                    class168 var4 = class443.field6447[var1][var2][var3];
                    if (var4 != null) {
                        class148 var5 = var4.field2505;
                        class148 var6 = var4.field2510;
                        if (var5 != null && var5.method53((byte) 87)) {
                            class218.method1649(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method53((byte) 59)) {
                                class218.method1649(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method47(0, (byte) 47, false, 0, 0, var5, arg0);
                                var6.method54(0);
                            }
                            var5.method54(0);
                        }
                        for (class36 var7 = var4.field2488; var7 != null; var7 = var7.field505) {
                            class447 var9 = var7.field511;
                            if (var9 != null && var9.method53((byte) 115)) {
                                class218.method1649(arg0, var9, var1, var2, var3, var9.field6504 + 1 - var9.field6526, var9.field6508 - var9.field6513 + 1);
                                var9.method54(0);
                            }
                        }
                        class49 var8 = var4.field2501;
                        if (var8 != null && var8.method53((byte) 106)) {
                            class13.method88(arg0, var8, var1, var2, var3);
                            var8.method54(0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "([BIII)V", line = 177)
    public final void method484(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1034++;
        try {
            if (((long) arg1 + this.field1014) > this.field1010) {
                this.field1010 = (long) arg1 + this.field1014;
            }
            if (arg3 != 64) {
                field1024 = -63;
            }
            if (this.field1026 != -1L && (this.field1014 < this.field1026 || (long) this.field1012 + this.field1026 < this.field1014)) {
                this.method490(arg3 ^ 0x20);
            }
            if (this.field1026 != -1L && ((long) this.field1032.length + this.field1026) < (this.field1014 + ((long) arg1))) {
                int var5 = (int) (this.field1026 + (long) this.field1032.length - this.field1014);
                class82.method637(arg0, arg2, this.field1032, (int) (this.field1014 - this.field1026), var5);
                arg2 += var5;
                arg1 -= var5;
                this.field1014 += (long) var5;
                this.field1012 = this.field1032.length;
                this.method490(69);
            }
            if (arg1 > this.field1032.length) {
                if (this.field1025 != this.field1014) {
                    this.field1021.method1433(this.field1014, (byte) -128);
                    this.field1025 = this.field1014;
                }
                this.field1021.method1436(arg1, arg2, arg0, 1);
                this.field1025 += (long) arg1;
                if (this.field1025 > this.field1020) {
                    this.field1020 = this.field1025;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field1014 >= this.field1028 && (this.field1028 + ((long) this.field1023)) > this.field1014) {
                    var6 = this.field1014;
                } else if (this.field1028 >= this.field1014 && this.field1028 < ((long) arg1 + this.field1014)) {
                    var6 = this.field1028;
                }
                if ((long) arg1 + this.field1014 > this.field1028 && (long) arg1 + this.field1014 <= (long) this.field1023 + this.field1028) {
                    var8 = this.field1014 + ((long) arg1);
                } else if (this.field1028 + ((long) this.field1023) > this.field1014 && (long) this.field1023 + this.field1028 <= (long) arg1 + this.field1014) {
                    var8 = this.field1028 + ((long) this.field1023);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class82.method637(arg0, (int) ((long) arg2 + var6 - this.field1014), this.field1030, (int) (var6 - this.field1028), var10);
                }
                this.field1014 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field1026 == -1L) {
                    this.field1026 = this.field1014;
                }
                class82.method637(arg0, arg2, this.field1032, (int) (this.field1014 - this.field1026), arg1);
                this.field1014 += (long) arg1;
                if ((long) this.field1012 < this.field1014 - this.field1026) {
                    this.field1012 = (int) (this.field1014 - this.field1026);
                }
            }
        } catch (IOException var12) {
            this.field1025 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)V", line = 310)
    public static void method485(int arg0) {
        field1013 = null;
        if (arg0 != -13158) {
            method488((byte) -73);
        }
        field1022 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IIB)I", line = 323)
    public static final int method486(int arg0, int arg1, byte arg2) {
        field1015++;
        if (arg0 == 1 || arg0 == 3) {
            return class36.field506[arg1 & 0x3];
        } else {
            int var3 = -19 / ((-arg2 - 3) / 61);
            return class182.field2692[arg1 & 0x3];
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III[B)V", line = 341)
    public final void method487(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field1029++;
        try {
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg3.length);
            }
            if (this.field1026 != -1L && this.field1026 <= this.field1014 && ((long) this.field1012 + this.field1026) >= ((long) arg1 + this.field1014)) {
                class82.method637(this.field1032, (int) (this.field1014 - this.field1026), arg3, arg2, arg1);
                this.field1014 += (long) arg1;
                return;
            }
            long var5 = this.field1014;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field1014 >= this.field1028 && (long) this.field1023 + this.field1028 > this.field1014) {
                int var9 = (int) ((long) this.field1023 + this.field1028 - this.field1014);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class82.method637(this.field1030, (int) (this.field1014 - this.field1028), arg3, arg2, var9);
                this.field1014 += (long) var9;
                arg1 -= var9;
                arg2 += var9;
            }
            if (this.field1030.length < arg1) {
                this.field1021.method1433(this.field1014, (byte) -128);
                this.field1025 = this.field1014;
                while (arg1 > 0) {
                    int var11 = this.field1021.method1434(arg1, 113, arg3, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    this.field1014 += (long) var11;
                    arg2 += var11;
                    arg1 -= var11;
                    this.field1025 += (long) var11;
                }
            } else if (arg1 > 0) {
                this.method480(false);
                int var10 = arg1;
                if (this.field1023 < arg1) {
                    var10 = this.field1023;
                }
                class82.method637(this.field1030, 0, arg3, arg2, var10);
                arg2 += var10;
                arg1 -= var10;
                this.field1014 += (long) var10;
            }
            if (this.field1026 != -1L) {
                if (this.field1014 < this.field1026 && arg1 > 0) {
                    int var12 = (int) (this.field1026 - this.field1014) + arg2;
                    if (var12 > (arg2 + arg1)) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg2) {
                        arg3[arg2++] = 0;
                        arg1--;
                        this.field1014++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field1026 >= var5 && this.field1026 < (long) var8 + var5) {
                    var13 = this.field1026;
                } else if (this.field1026 <= var5 && this.field1026 + ((long) this.field1012) > var5) {
                    var13 = var5;
                }
                if (var5 < this.field1026 + ((long) this.field1012) && ((long) var8 + var5) >= ((long) this.field1012 + this.field1026)) {
                    var15 = (long) this.field1012 + this.field1026;
                } else if ((long) var8 + var5 > this.field1026 && ((long) this.field1012 + this.field1026) >= ((long) var8 + var5)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class82.method637(this.field1032, (int) (var13 - this.field1026), arg3, (int) (var13 - var5) + var7, var17);
                    if (this.field1014 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field1014));
                        this.field1014 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1025 = -1L;
            throw var19;
        }
        if (arg0 <= 5) {
            method486(-62, -43, (byte) 88);
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)Lln;", line = 527)
    public static final class252 method488(byte arg0) {
        field1017++;
        try {
            return arg0 < 122 ? null : (class252) Class.forName("ni").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "c", descriptor = "(I)J", line = 551)
    public final long method489(int arg0) {
        if (arg0 == 255) {
            field1031++;
            return this.field1010;
        } else {
            return -56L;
        }
    }

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "(Lum;II)V", line = 658)
    public class63(class184 arg0, int arg1, int arg2) throws IOException {
        this.field1021 = arg0;
        this.field1010 = this.field1020 = arg0.method1435(-1);
        this.field1014 = 0L;
        this.field1032 = new byte[arg2];
        this.field1030 = new byte[arg1];
    }

    @OriginalMember(owner = "client!r", name = "d", descriptor = "(I)V", line = 573)
    private final void method490(int arg0) throws IOException {
        field1016++;
        if (arg0 <= 68 || this.field1026 == -1L) {
            return;
        }
        if (this.field1026 != this.field1025) {
            this.field1021.method1433(this.field1026, (byte) -128);
            this.field1025 = this.field1026;
        }
        this.field1021.method1436(this.field1012, 0, this.field1032, 1);
        this.field1025 += (long) this.field1012;
        if (this.field1025 > this.field1020) {
            this.field1020 = this.field1025;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field1026 >= this.field1028 && this.field1028 + ((long) this.field1023) > this.field1026) {
            var2 = this.field1026;
        } else if (this.field1028 >= this.field1026 && ((long) this.field1012 + this.field1026) > this.field1028) {
            var2 = this.field1028;
        }
        if (this.field1028 < (long) this.field1012 + this.field1026 && (long) this.field1012 + this.field1026 <= (long) this.field1023 + this.field1028) {
            var4 = this.field1026 + ((long) this.field1012);
        } else if (this.field1026 < (long) this.field1023 + this.field1028 && this.field1026 + ((long) this.field1012) >= this.field1028 - -((long) this.field1023)) {
            var4 = this.field1028 + ((long) this.field1023);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class82.method637(this.field1032, (int) (var2 - this.field1026), this.field1030, (int) (var2 - this.field1028), var6);
        }
        this.field1026 = -1L;
        this.field1012 = 0;
    }
}
