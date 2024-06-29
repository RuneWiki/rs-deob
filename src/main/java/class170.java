import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class170 {

    @OriginalMember(owner = "client!ok", name = "m", descriptor = "J")
    private long field2301 = -1L;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
    private int field2294 = 0;

    @OriginalMember(owner = "client!ok", name = "t", descriptor = "J")
    private long field2308 = -1L;

    @OriginalMember(owner = "client!ok", name = "p", descriptor = "Lsf;")
    private class368 field2304;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "J")
    private long field2295;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "J")
    private long field2290;

    @OriginalMember(owner = "client!ok", name = "r", descriptor = "J")
    private long field2306;

    @OriginalMember(owner = "client!ok", name = "s", descriptor = "[B")
    private byte[] field2307;

    @OriginalMember(owner = "client!ok", name = "u", descriptor = "[B")
    private byte[] field2309;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2293;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
    public static int field2296;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
    private int field2302;

    @OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ok", name = "q", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ok", name = "v", descriptor = "J")
    private long field2310;

    static {
        new class446("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)V", line = 14)
    public static final void method1152(int arg0, int arg1) {
        class499.method2972(-13669);
        field2303++;
        class405.method2503((byte) -122);
        int var2 = 105 % ((arg0 - 27) / 45);
        class503.method3015(0, true, arg1);
        client.method1335(class266.field3709, class381.field5811, class400.field6090, (byte) 0);
        class150.method985(13515, class400.field6090, class266.field3709);
        class330.method2126(0);
        class528.method3126(class434.field6586, (byte) 121);
        class141.method950(0);
        class201.method1360(false);
        if (class435.field6596 == 2) {
            class134.method908(3, 2);
        } else if (class435.field6596 == 6) {
            class134.method908(7, 2);
        } else if (class435.field6596 == 9) {
            class134.method908(10, 2);
            return;
        } else if (class435.field6596 == 1) {
            class348.method2249((byte) -110, class266.field3709, class400.field6090);
            return;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "([BIII)V", line = 51)
    public final void method1153(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2296++;
        try {
            if (this.field2290 < ((long) arg2 + this.field2306)) {
                this.field2290 = this.field2306 + ((long) arg2);
            }
            if (arg1 > 97) {
                if (this.field2308 != -1L && (this.field2306 < this.field2308 || this.field2306 > (this.field2308 + ((long) this.field2294)))) {
                    this.method1161(-1);
                }
                if (this.field2308 != -1L && ((long) this.field2307.length + this.field2308) < (this.field2306 + ((long) arg2))) {
                    int var5 = (int) (this.field2308 + (long) this.field2307.length - this.field2306);
                    class192.method1299(arg0, arg3, this.field2307, (int) (this.field2306 - this.field2308), var5);
                    arg3 += var5;
                    this.field2306 += var5;
                    arg2 -= var5;
                    this.field2294 = this.field2307.length;
                    this.method1161(-1);
                }
                if (arg2 > this.field2307.length) {
                    if (this.field2310 != this.field2306) {
                        this.field2304.method2342(this.field2306, true);
                        this.field2310 = this.field2306;
                    }
                    this.field2304.method2341(arg2, arg3, arg0, 127);
                    this.field2310 += arg2;
                    if (this.field2310 > this.field2295) {
                        this.field2295 = this.field2310;
                    }
                    long var6 = -1L;
                    if (this.field2306 >= this.field2301 && this.field2306 < (long) this.field2302 + this.field2301) {
                        var6 = this.field2306;
                    } else if (this.field2306 <= this.field2301 && this.field2301 < this.field2306 + ((long) arg2)) {
                        var6 = this.field2301;
                    }
                    long var8 = -1L;
                    if ((long) arg2 + this.field2306 > this.field2301 && (long) arg2 + this.field2306 <= (long) this.field2302 + this.field2301) {
                        var8 = (long) arg2 + this.field2306;
                    } else if (this.field2306 < (this.field2301 + ((long) this.field2302)) && ((long) arg2 + this.field2306) >= ((long) this.field2302 + this.field2301)) {
                        var8 = this.field2301 + ((long) this.field2302);
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class192.method1299(arg0, (int) (var6 + (long) arg3 - this.field2306), this.field2309, (int) (var6 - this.field2301), var10);
                    }
                    this.field2306 += arg2;
                } else if (arg2 > 0) {
                    if (this.field2308 == -1L) {
                        this.field2308 = this.field2306;
                    }
                    class192.method1299(arg0, arg3, this.field2307, (int) (this.field2306 - this.field2308), arg2);
                    this.field2306 += arg2;
                    if (((long) this.field2294) < (this.field2306 - this.field2308)) {
                        this.field2294 = (int) (this.field2306 - this.field2308);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2310 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V", line = 173)
    private final void method1154(int arg0) throws IOException {
        if (arg0 != -4201) {
            return;
        }
        field2297++;
        this.field2302 = 0;
        if (this.field2310 != this.field2306) {
            this.field2304.method2342(this.field2306, true);
            this.field2310 = this.field2306;
        }
        this.field2301 = this.field2306;
        while (this.field2309.length > this.field2302) {
            int var2 = this.field2309.length - this.field2302;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2304.method2340(var2, this.field2302, true, this.field2309);
            if (var3 == -1) {
                break;
            }
            this.field2310 += var3;
            this.field2302 += var3;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[BII)V", line = 234)
    public final void method1155(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2291++;
        try {
            if ((arg0 + arg2) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg1.length);
            }
            if (this.field2308 != -1L && this.field2308 <= this.field2306 && (long) this.field2294 + this.field2308 >= this.field2306 - -((long) arg2)) {
                class192.method1299(this.field2307, (int) (this.field2306 - this.field2308), arg1, arg0, arg2);
                this.field2306 += arg2;
                return;
            }
            long var5 = this.field2306;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field2301 <= this.field2306 && this.field2306 < this.field2301 + ((long) this.field2302)) {
                int var9 = (int) (this.field2301 + (long) this.field2302 - this.field2306);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class192.method1299(this.field2309, (int) (this.field2306 - this.field2301), arg1, arg0, var9);
                arg0 += var9;
                this.field2306 += var9;
                arg2 -= var9;
            }
            if (arg2 > this.field2309.length) {
                this.field2304.method2342(this.field2306, true);
                this.field2310 = this.field2306;
                while (arg2 > 0) {
                    int var10 = this.field2304.method2340(arg2, arg0, true, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2306 += var10;
                    arg2 -= var10;
                    this.field2310 += var10;
                    arg0 += var10;
                }
            } else if (arg2 > 0) {
                this.method1154(arg3 - 4200);
                int var11 = arg2;
                if (this.field2302 < arg2) {
                    var11 = this.field2302;
                }
                class192.method1299(this.field2309, 0, arg1, arg0, var11);
                arg0 += var11;
                arg2 -= var11;
                this.field2306 += var11;
            }
            if (this.field2308 != -1L) {
                if (this.field2306 < this.field2308 && arg2 > 0) {
                    int var12 = (int) (this.field2308 - this.field2306) + arg0;
                    if (var12 > (arg0 + arg2)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        arg2--;
                        this.field2306++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field2308 >= var5 && this.field2308 < var5 + ((long) var8)) {
                    var13 = this.field2308;
                } else if (this.field2308 <= var5 && (long) this.field2294 + this.field2308 > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field2294 + this.field2308 && ((long) this.field2294 + this.field2308) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field2294 + this.field2308;
                } else if ((var5 + ((long) var8)) > this.field2308 && (long) this.field2294 + this.field2308 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class192.method1299(this.field2307, (int) (var13 - this.field2308), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2306) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field2306));
                        this.field2306 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2310 = -1L;
            throw var19;
        }
        if (arg3 > ~arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)V", line = 416)
    public static final void method1156(boolean arg0) {
        field2292++;
        class368 var1 = null;
        try {
            class234 var2 = class312.field4572.method2975(arg0, 8, "3");
            while (var2.field3322 == 0) {
                class388.method2433(1L, -55);
            }
            if (var2.field3322 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class368) var2.field3324;
            byte[] var3 = new byte[(int) var1.method2343((byte) 31)];
            if (var3.length == 0) {
                class33.field512 = "";
                class109.field1537 = "";
            } else {
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2340(var3.length - var4, var4, true, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class164 var6 = new class164(var3);
                int var7 = var6.method1087(false);
                if (var7 > 50) {
                    throw new RuntimeException("Bad length");
                }
                var6.field2185 = var7 + 1;
                if (!var6.method1085(113)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field2185 = 1;
                int var8 = var6.method1087(false);
                if (var8 != 0) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class33.field512 = var6.method1095(18997);
                class109.field1537 = var6.method1095(18997);
            }
        } catch (Exception var10) {
            class109.field1537 = "";
            class33.field512 = "";
        }
        try {
            if (var1 != null) {
                var1.method2344((byte) -93);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I[B)V", line = 493)
    public final void method1157(int arg0, byte[] arg1) throws IOException {
        if (arg0 != 774074440) {
            method1156(false);
        }
        this.method1155(0, arg1, arg1.length, -1);
        field2300++;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Lsf;II)V", line = 664)
    public class170(class368 arg0, int arg1, int arg2) throws IOException {
        this.field2304 = arg0;
        this.field2290 = this.field2295 = arg0.method2343((byte) 31);
        this.field2306 = 0L;
        this.field2307 = new byte[arg2];
        this.field2309 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)Ljava/io/File;", line = 515)
    private final File method1158(int arg0) {
        if (arg0 != -24739) {
            this.field2304 = null;
        }
        field2305++;
        return this.field2304.method2339((byte) 89);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IJ)V", line = 526)
    public final void method1159(int arg0, long arg1) throws IOException {
        field2289++;
        int var4 = 81 / ((56 - arg0) / 44);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1158(-24739));
        }
        this.field2306 = arg1;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILwk;)I", line = 543)
    public static final int method1160(int arg0, class96 arg1) {
        field2298++;
        int var2 = -42 / ((arg0 + 44) / 41);
        int var3 = arg1.field1421;
        class485 var4 = arg1.method1759(100);
        if (arg1.field3829) {
            var3 = arg1.field1420;
        } else if (arg1.field3839 == var4.field7140 || arg1.field3839 == var4.field7172 || arg1.field3839 == var4.field7144 || arg1.field3839 == var4.field7182) {
            var3 = arg1.field1394;
        } else if (arg1.field3839 == var4.field7164 || arg1.field3839 == var4.field7166 || arg1.field3839 == var4.field7171 || arg1.field3839 == var4.field7186) {
            var3 = arg1.field1407;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)V", line = 570)
    private final void method1161(int arg0) throws IOException {
        if ((long) arg0 != this.field2308) {
            if (this.field2310 != this.field2308) {
                this.field2304.method2342(this.field2308, true);
                this.field2310 = this.field2308;
            }
            this.field2304.method2341(this.field2294, 0, this.field2307, 127);
            this.field2310 += this.field2294;
            if (this.field2310 > this.field2295) {
                this.field2295 = this.field2310;
            }
            long var2 = -1L;
            if (this.field2308 >= this.field2301 && (long) this.field2302 + this.field2301 > this.field2308) {
                var2 = this.field2308;
            } else if (this.field2301 >= this.field2308 && ((long) this.field2294 + this.field2308) > this.field2301) {
                var2 = this.field2301;
            }
            long var4 = -1L;
            if ((this.field2308 + ((long) this.field2294)) > this.field2301 && (long) this.field2302 + this.field2301 >= (long) this.field2294 + this.field2308) {
                var4 = (long) this.field2294 + this.field2308;
            } else if (this.field2308 < ((long) this.field2302 + this.field2301) && (long) this.field2294 + this.field2308 >= this.field2301 - -((long) this.field2302)) {
                var4 = (long) this.field2302 + this.field2301;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class192.method1299(this.field2307, (int) (var2 - this.field2308), this.field2309, (int) (var2 - this.field2301), var6);
            }
            this.field2308 = -1L;
            this.field2294 = 0;
        }
        field2293++;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)J", line = 643)
    public final long method1162(byte arg0) {
        if (arg0 != 0) {
            this.field2310 = -93L;
        }
        field2299++;
        return this.field2290;
    }
}
