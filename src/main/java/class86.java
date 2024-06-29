import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class86 {

    @OriginalMember(owner = "client!ps", name = "r", descriptor = "I")
    private int field1112 = 0;

    @OriginalMember(owner = "client!ps", name = "o", descriptor = "J")
    private long field1109 = -1L;

    @OriginalMember(owner = "client!ps", name = "u", descriptor = "J")
    private long field1115 = -1L;

    @OriginalMember(owner = "client!ps", name = "h", descriptor = "Lbi;")
    private class448 field1102;

    @OriginalMember(owner = "client!ps", name = "s", descriptor = "J")
    private long field1113;

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "J")
    private long field1098;

    @OriginalMember(owner = "client!ps", name = "m", descriptor = "[B")
    private byte[] field1107;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "[B")
    private byte[] field1100;

    @OriginalMember(owner = "client!ps", name = "i", descriptor = "J")
    private long field1103;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!ps", name = "j", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!ps", name = "k", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!ps", name = "l", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ps", name = "p", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!ps", name = "q", descriptor = "I")
    private int field1111;

    @OriginalMember(owner = "client!ps", name = "t", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!ps", name = "v", descriptor = "I")
    public static int field1116;

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "J")
    private long field1097;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
    public final void method647(byte arg0) throws IOException {
        this.method655(arg0 ^ 0xFFFFFFE1);
        if (arg0 != 30) {
            this.method652(-41);
        }
        field1095++;
        this.field1102.method2451(true);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method648(int arg0) {
        field1108++;
        return arg0 <= 24 ? null : this.field1102.method2452(17);
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIII)V")
    public final void method649(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field1106++;
        try {
            if ((arg1 + arg3) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (arg2 != 8) {
                this.field1115 = 76L;
            }
            if (this.field1115 != -1L && this.field1103 >= this.field1115 && ((long) arg3 + this.field1103) <= ((long) this.field1112 + this.field1115)) {
                class70.method557(this.field1100, (int) (this.field1103 - this.field1115), arg0, arg1, arg3);
                this.field1103 += arg3;
                return;
            }
            long var5 = this.field1103;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field1103 >= this.field1109 && ((long) this.field1111 + this.field1109) > this.field1103) {
                int var9 = (int) ((long) this.field1111 + this.field1109 - this.field1103);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class70.method557(this.field1107, (int) (this.field1103 - this.field1109), arg0, arg1, var9);
                arg1 += var9;
                this.field1103 += var9;
                arg3 -= var9;
            }
            if (arg3 > this.field1107.length) {
                this.field1102.method2445(1, this.field1103);
                this.field1097 = this.field1103;
                while (arg3 > 0) {
                    int var11 = this.field1102.method2448((byte) 122, arg1, arg0, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 -= var11;
                    arg1 += var11;
                    this.field1103 += var11;
                    this.field1097 += var11;
                }
            } else if (arg3 > 0) {
                this.method651(200000000);
                int var10 = arg3;
                if (this.field1111 < arg3) {
                    var10 = this.field1111;
                }
                class70.method557(this.field1107, 0, arg0, arg1, var10);
                this.field1103 += var10;
                arg1 += var10;
                arg3 -= var10;
            }
            if (this.field1115 != -1L) {
                if (this.field1103 < this.field1115 && arg3 > 0) {
                    int var12 = (int) (this.field1115 - this.field1103) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg1 < var12) {
                        arg0[arg1++] = 0;
                        arg3--;
                        this.field1103++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field1115 >= var5 && (long) var8 + var5 > this.field1115) {
                    var13 = this.field1115;
                } else if (this.field1115 <= var5 && (long) this.field1112 + this.field1115 > var5) {
                    var13 = var5;
                }
                if (var5 < ((long) this.field1112 + this.field1115) && var5 + ((long) var8) >= (long) this.field1112 + this.field1115) {
                    var15 = (long) this.field1112 + this.field1115;
                } else if (this.field1115 < (long) var8 + var5 && ((long) var8 + var5) <= ((long) this.field1112 + this.field1115)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class70.method557(this.field1100, (int) (var13 - this.field1115), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field1103) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field1103));
                        this.field1103 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1097 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BI)V")
    public final void method650(byte[] arg0, int arg1) throws IOException {
        if (arg1 < 74) {
            this.method648(110);
        }
        field1104++;
        this.method649(arg0, 0, 8, arg0.length);
    }

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)V")
    private final void method651(int arg0) throws IOException {
        this.field1111 = 0;
        field1105++;
        if (this.field1103 != this.field1097) {
            this.field1102.method2445(1, this.field1103);
            this.field1097 = this.field1103;
        }
        this.field1109 = this.field1103;
        if (arg0 != 200000000) {
            this.field1112 = 124;
        }
        while (this.field1111 < this.field1107.length) {
            int var2 = this.field1107.length - this.field1111;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1102.method2448((byte) 122, this.field1111, this.field1107, var2);
            if (var3 == -1) {
                break;
            }
            this.field1097 += var3;
            this.field1111 += var3;
        }
    }

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)J")
    public final long method652(int arg0) {
        field1096++;
        if (arg0 != 0) {
            this.method652(20);
        }
        return this.field1098;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lqf;I)V")
    public static final void method653(class638 arg0, int arg1) {
        field1110++;
        for (int var2 = 0; var2 < class262.field3314; var2++) {
            int var3 = class311.field3919[var2];
            class365 var4 = class132.field1601[var3];
            int var5 = arg0.method3097((byte) 12);
            if ((var5 & 0x2) != 0) {
                var5 += arg0.method3097((byte) 12) << 8;
            }
            if ((var5 & 0x4000) != 0) {
                var5 += arg0.method3097((byte) 12) << 16;
            }
            class568.method3010(var5, var4, (byte) 119, var3, arg0);
        }
        if (arg1 != -1) {
            method653(null, -68);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "([BIBI)V")
    public final void method654(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field1116++;
        try {
            if (((long) arg1 + this.field1103) > this.field1098) {
                this.field1098 = (long) arg1 + this.field1103;
            }
            if (this.field1115 != -1L && (this.field1115 > this.field1103 || this.field1103 > (long) this.field1112 + this.field1115)) {
                this.method655(-1);
            }
            if (this.field1115 != -1L && ((long) arg1 + this.field1103) > ((long) this.field1100.length + this.field1115)) {
                int var5 = (int) (this.field1115 + (long) this.field1100.length - this.field1103);
                class70.method557(arg0, arg3, this.field1100, (int) (this.field1103 - this.field1115), var5);
                arg3 += var5;
                arg1 -= var5;
                this.field1103 += var5;
                this.field1112 = this.field1100.length;
                this.method655(-1);
            }
            if (arg1 > this.field1100.length) {
                if (this.field1103 != this.field1097) {
                    this.field1102.method2445(1, this.field1103);
                    this.field1097 = this.field1103;
                }
                this.field1102.method2449(arg0, arg1, (byte) 82, arg3);
                this.field1097 += arg1;
                if (this.field1097 > this.field1113) {
                    this.field1113 = this.field1097;
                }
                long var6 = -1L;
                if (this.field1103 >= this.field1109 && ((long) this.field1111 + this.field1109) > this.field1103) {
                    var6 = this.field1103;
                } else if (this.field1109 >= this.field1103 && this.field1109 < ((long) arg1 + this.field1103)) {
                    var6 = this.field1109;
                }
                long var8 = -1L;
                if (this.field1109 < (long) arg1 + this.field1103 && this.field1109 + ((long) this.field1111) >= (long) arg1 + this.field1103) {
                    var8 = this.field1103 + ((long) arg1);
                } else if (this.field1109 + ((long) this.field1111) > this.field1103 && ((long) this.field1111 + this.field1109) <= ((long) arg1 + this.field1103)) {
                    var8 = (long) this.field1111 + this.field1109;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class70.method557(arg0, (int) ((long) arg3 + var6 - this.field1103), this.field1107, (int) (var6 - this.field1109), var10);
                }
                this.field1103 += arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field1115 == -1L) {
                    this.field1115 = this.field1103;
                }
                class70.method557(arg0, arg3, this.field1100, (int) (this.field1103 - this.field1115), arg1);
                this.field1103 += arg1;
                if (this.field1103 - this.field1115 > (long) this.field1112) {
                    this.field1112 = (int) (this.field1103 - this.field1115);
                }
                return;
            }
        } catch (IOException var12) {
            this.field1097 = -1L;
            throw var12;
        }
        if (arg2 >= -75) {
            this.field1103 = 92L;
        }
    }

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)V")
    private final void method655(int arg0) throws IOException {
        field1114++;
        if ((long) arg0 == this.field1115) {
            return;
        }
        if (this.field1115 != this.field1097) {
            this.field1102.method2445(1, this.field1115);
            this.field1097 = this.field1115;
        }
        this.field1102.method2449(this.field1100, this.field1112, (byte) 74, 0);
        this.field1097 += this.field1112;
        if (this.field1113 < this.field1097) {
            this.field1113 = this.field1097;
        }
        long var2 = -1L;
        if (this.field1109 <= this.field1115 && (this.field1109 + ((long) this.field1111)) > this.field1115) {
            var2 = this.field1115;
        } else if (this.field1115 <= this.field1109 && ((long) this.field1112 + this.field1115) > this.field1109) {
            var2 = this.field1109;
        }
        long var4 = -1L;
        if ((long) this.field1112 + this.field1115 > this.field1109 && ((long) this.field1111 + this.field1109) >= (this.field1115 + ((long) this.field1112))) {
            var4 = (long) this.field1112 + this.field1115;
        } else if ((long) this.field1111 + this.field1109 > this.field1115 && ((long) this.field1111 + this.field1109) <= (this.field1115 + ((long) this.field1112))) {
            var4 = this.field1109 + ((long) this.field1111);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class70.method557(this.field1100, (int) (var2 - this.field1115), this.field1107, (int) (var2 - this.field1109), var6);
        }
        this.field1115 = -1L;
        this.field1112 = 0;
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(IJ)V")
    public final void method656(int arg0, long arg1) throws IOException {
        field1099++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method648(115));
        }
        this.field1103 = arg1;
        if (arg0 != -553161560) {
            this.method652(-82);
        }
    }

    @OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(Lbi;II)V")
    public class86(class448 arg0, int arg1, int arg2) throws IOException {
        this.field1102 = arg0;
        this.field1098 = this.field1113 = arg0.method2447(1);
        this.field1107 = new byte[arg1];
        this.field1100 = new byte[arg2];
        this.field1103 = 0L;
    }
}
