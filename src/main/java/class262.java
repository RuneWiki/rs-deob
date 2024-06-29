import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class262 {

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "J")
    private long field3890 = -1L;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    private int field3891 = 0;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "J")
    private long field3893 = -1L;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "Lvl;")
    private class223 field3889;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "J")
    private long field3879;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "J")
    private long field3897;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "[B")
    private byte[] field3892;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "[B")
    private byte[] field3895;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "J")
    private long field3887;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field3888 = 0;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lo;")
    public static class332 field3881 = new class332("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Lj;")
    public static class240 field3900 = new class240(4, 3);

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
    private int field3885;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!qm", name = "z", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "J")
    private long field3896;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIZJ)Ljava/lang/String;", line = 7)
    public static final String method1719(int arg0, int arg1, int arg2, boolean arg3, long arg4) {
        field3898++;
        char var6 = ',';
        char var7 = '.';
        if (arg2 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg2 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg4 < 0L) {
            arg4 = -arg4;
            var8 = true;
        }
        if (arg1 < 72) {
            return null;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg4;
                arg4 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg4 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg4;
            arg4 /= 10L;
            var9.append((char) (48 - (((int) arg4 * 10) - var13)));
            if (arg4 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)J", line = 85)
    public final long method1720(int arg0) {
        field3883++;
        if (arg0 < 74) {
            method1730(-108);
        }
        return this.field3897;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI[BI)V", line = 100)
    public final void method1721(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3901++;
        try {
            if (this.field3897 < (long) arg1 + this.field3887) {
                this.field3897 = (long) arg1 + this.field3887;
            }
            if (this.field3890 != -1L && (this.field3890 > this.field3887 || ((long) this.field3891 + this.field3890) < this.field3887)) {
                this.method1725(arg0 + 2);
            }
            if (this.field3890 != -1L && ((long) arg1 + this.field3887) > ((long) this.field3895.length + this.field3890)) {
                int var5 = (int) (this.field3890 - (this.field3887 - (long) this.field3895.length));
                class149.method1007(arg2, arg3, this.field3895, (int) (this.field3887 - this.field3890), var5);
                this.field3887 += (long) var5;
                arg1 -= var5;
                arg3 += var5;
                this.field3891 = this.field3895.length;
                this.method1725(-1);
            }
            if (arg1 > this.field3895.length) {
                if (this.field3896 != this.field3887) {
                    this.field3889.method1456(true, this.field3887);
                    this.field3896 = this.field3887;
                }
                this.field3889.method1454((byte) 58, arg2, arg1, arg3);
                this.field3896 += (long) arg1;
                if (this.field3896 > this.field3879) {
                    this.field3879 = this.field3896;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field3893 <= this.field3887 && this.field3887 < (this.field3893 + ((long) this.field3885))) {
                    var6 = this.field3887;
                } else if (this.field3887 <= this.field3893 && this.field3893 < ((long) arg1 + this.field3887)) {
                    var6 = this.field3893;
                }
                if ((long) arg1 + this.field3887 > this.field3893 && (long) this.field3885 + this.field3893 >= (long) arg1 + this.field3887) {
                    var8 = (long) arg1 + this.field3887;
                } else if (this.field3887 < (this.field3893 + ((long) this.field3885)) && ((long) arg1 + this.field3887) >= ((long) this.field3885 + this.field3893)) {
                    var8 = (long) this.field3885 + this.field3893;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class149.method1007(arg2, (int) ((long) arg3 + var6 - this.field3887), this.field3892, (int) (var6 - this.field3893), var10);
                }
                this.field3887 += (long) arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field3890 == -1L) {
                    this.field3890 = this.field3887;
                }
                class149.method1007(arg2, arg3, this.field3895, (int) (this.field3887 - this.field3890), arg1);
                this.field3887 += (long) arg1;
                if ((this.field3887 - this.field3890) > ((long) this.field3891)) {
                    this.field3891 = (int) (this.field3887 - this.field3890);
                }
                return;
            }
        } catch (IOException var12) {
            this.field3896 = -1L;
            throw var12;
        }
        if (arg0 != -3) {
            this.field3890 = -21L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 224)
    private final void method1722(int arg0) throws IOException {
        this.field3885 = 0;
        field3878++;
        if (arg0 != -28158) {
            return;
        }
        if (this.field3896 != this.field3887) {
            this.field3889.method1456(true, this.field3887);
            this.field3896 = this.field3887;
        }
        this.field3893 = this.field3887;
        while (this.field3892.length > this.field3885) {
            int var2 = this.field3892.length - this.field3885;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3889.method1455(-128, this.field3892, var2, this.field3885);
            if (var3 == -1) {
                break;
            }
            this.field3896 += (long) var3;
            this.field3885 += var3;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)V", line = 274)
    public static final void method1723(int arg0) {
        class355.field5384 = null;
        class365.field5519 = null;
        class156.field2175 = null;
        class465.field6548 = null;
        class464.field6547 = null;
        class110.field1563 = null;
        class442.field6239 = null;
        if (arg0 != -1) {
            field3881 = null;
        }
        class219.field3233 = null;
        field3902++;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)V", line = 293)
    public static final void method1724(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 8) {
            method1723(70);
        }
        field3894++;
        if (arg0 >= class293.field4420 && class119.field1643 >= arg0) {
            int var5 = class352.method2172(arg4, class296.field4443, class176.field2503, 0);
            int var6 = class352.method2172(arg3, class296.field4443, class176.field2503, arg2 ^ 0x8);
            class280.method1804(1, arg0, arg1, var6, var5);
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 314)
    private final void method1725(int arg0) throws IOException {
        field3903++;
        if ((long) arg0 == this.field3890) {
            return;
        }
        if (this.field3896 != this.field3890) {
            this.field3889.method1456(true, this.field3890);
            this.field3896 = this.field3890;
        }
        this.field3889.method1454((byte) 61, this.field3895, this.field3891, 0);
        this.field3896 += (long) this.field3891;
        if (this.field3879 < this.field3896) {
            this.field3879 = this.field3896;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field3893 <= this.field3890 && this.field3890 < (this.field3893 + ((long) this.field3885))) {
            var2 = this.field3890;
        } else if (this.field3893 >= this.field3890 && this.field3893 < this.field3890 + ((long) this.field3891)) {
            var2 = this.field3893;
        }
        if (((long) this.field3891 + this.field3890) > this.field3893 && ((long) this.field3885 + this.field3893) >= ((long) this.field3891 + this.field3890)) {
            var4 = (long) this.field3891 + this.field3890;
        } else if (((long) this.field3885 + this.field3893) > this.field3890 && (long) this.field3885 + this.field3893 <= (long) this.field3891 + this.field3890) {
            var4 = (long) this.field3885 + this.field3893;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class149.method1007(this.field3895, (int) (var2 - this.field3890), this.field3892, (int) (var2 - this.field3893), var6);
        }
        this.field3891 = 0;
        this.field3890 = -1L;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Z)V", line = 395)
    public static void method1726(boolean arg0) {
        field3881 = null;
        field3900 = null;
        if (arg0) {
            method1724(124, -95, 68, -78, 57);
        }
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)Ljava/io/File;", line = 409)
    private final File method1727(int arg0) {
        field3886++;
        if (arg0 < 2) {
            this.field3895 = null;
        }
        return this.field3889.method1453((byte) 16);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II[BI)V", line = 423)
    public final void method1728(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3884++;
        try {
            if ((arg0 + arg1) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field3890 != -1L && this.field3890 <= this.field3887 && ((long) arg1 + this.field3887) <= ((long) this.field3891 + this.field3890)) {
                class149.method1007(this.field3895, (int) (this.field3887 - this.field3890), arg2, arg0, arg1);
                this.field3887 += (long) arg1;
                return;
            }
            long var5 = this.field3887;
            int var7 = arg0;
            if (arg3 >= -71) {
                this.field3895 = null;
            }
            int var8 = arg1;
            if (this.field3887 >= this.field3893 && this.field3887 < ((long) this.field3885 + this.field3893)) {
                int var9 = (int) (this.field3893 + (long) this.field3885 - this.field3887);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class149.method1007(this.field3892, (int) (this.field3887 - this.field3893), arg2, arg0, var9);
                arg0 += var9;
                this.field3887 += (long) var9;
                arg1 -= var9;
            }
            if (this.field3892.length < arg1) {
                this.field3889.method1456(true, this.field3887);
                this.field3896 = this.field3887;
                while (arg1 > 0) {
                    int var10 = this.field3889.method1455(-125, arg2, arg1, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3896 += (long) var10;
                    arg0 += var10;
                    arg1 -= var10;
                    this.field3887 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method1722(-28158);
                int var11 = arg1;
                if (arg1 > this.field3885) {
                    var11 = this.field3885;
                }
                class149.method1007(this.field3892, 0, arg2, arg0, var11);
                this.field3887 += (long) var11;
                arg0 += var11;
                arg1 -= var11;
            }
            if (this.field3890 != -1L) {
                if (this.field3887 < this.field3890 && arg1 > 0) {
                    int var12 = (int) (this.field3890 - this.field3887) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg2[arg0++] = 0;
                        arg1--;
                        this.field3887++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3890 && (long) var8 + var5 > this.field3890) {
                    var13 = this.field3890;
                } else if (this.field3890 <= var5 && ((long) this.field3891 + this.field3890) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field3891 + this.field3890) > var5 && (long) var8 + var5 >= this.field3890 - -((long) this.field3891)) {
                    var15 = this.field3890 + ((long) this.field3891);
                } else if (this.field3890 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field3891 + this.field3890) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class149.method1007(this.field3895, (int) (var13 - this.field3890), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field3887) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3887));
                        this.field3887 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3896 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lvl;II)V", line = 697)
    public class262(class223 arg0, int arg1, int arg2) throws IOException {
        this.field3889 = arg0;
        this.field3897 = this.field3879 = arg0.method1457((byte) -73);
        this.field3892 = new byte[arg1];
        this.field3895 = new byte[arg2];
        this.field3887 = 0L;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BJ)V", line = 618)
    public final void method1729(byte arg0, long arg1) throws IOException {
        field3880++;
        int var4 = -54 % ((62 - arg0) / 47);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1727(95));
        }
        this.field3887 = arg1;
    }

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "(I)V", line = 633)
    public static final void method1730(int arg0) {
        class124.method868(class138.field1976, false, (long) class452.field6418);
        field3882++;
        if (class279.field4220 != arg0) {
            class424.method2500(1, class279.field4220);
        }
        for (int var1 = 0; var1 < class267.field3959; var1++) {
            if (class103.field1442[var1]) {
                class225.field3270[var1] = true;
            }
            class100.field1424[var1] = class103.field1442[var1];
            class103.field1442[var1] = false;
        }
        class483.field6780 = class452.field6418;
        if (class138.field1976.method556()) {
            class2.field41 = true;
        }
        if (class279.field4220 != -1) {
            class267.field3959 = 0;
            class342.method2096(0);
        }
        class138.field1976.method493();
        class36.method289(false, class268.field3970);
        class269.field3987 = 0;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([BI)V", line = 685)
    public final void method1731(byte[] arg0, int arg1) throws IOException {
        field3899++;
        if (arg1 >= -35) {
            this.field3893 = 82L;
        }
        this.method1728(0, arg0.length, arg0, -76);
    }
}
