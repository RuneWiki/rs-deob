import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class392 {

    @OriginalMember(owner = "client!rs", name = "l", descriptor = "I")
    private int field5524 = 0;

    @OriginalMember(owner = "client!rs", name = "j", descriptor = "J")
    private long field5522 = -1L;

    @OriginalMember(owner = "client!rs", name = "z", descriptor = "J")
    private long field5538 = -1L;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "Lmi;")
    private class287 field5514;

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "J")
    private long field5518;

    @OriginalMember(owner = "client!rs", name = "r", descriptor = "J")
    private long field5530;

    @OriginalMember(owner = "client!rs", name = "q", descriptor = "J")
    private long field5529;

    @OriginalMember(owner = "client!rs", name = "h", descriptor = "[B")
    private byte[] field5520;

    @OriginalMember(owner = "client!rs", name = "p", descriptor = "[B")
    private byte[] field5528;

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "I")
    public static int field5516 = 0;

    @OriginalMember(owner = "client!rs", name = "i", descriptor = "Llg;")
    public static class237 field5521 = new class237(2);

    @OriginalMember(owner = "client!rs", name = "x", descriptor = "[B")
    public static byte[] field5536 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!rs", name = "A", descriptor = "Liq;")
    public static class362 field5539 = new class362("Connection lost.", "Verbindung abgebrochen.", "Connexion perdue.", "Conexão perdida.");

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "I")
    public static int field5513;

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "I")
    public static int field5515;

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
    private int field5517;

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "I")
    public static int field5519;

    @OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
    public static int field5523;

    @OriginalMember(owner = "client!rs", name = "m", descriptor = "I")
    public static int field5525;

    @OriginalMember(owner = "client!rs", name = "n", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!rs", name = "o", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!rs", name = "s", descriptor = "I")
    public static int field5531;

    @OriginalMember(owner = "client!rs", name = "t", descriptor = "I")
    public static int field5532;

    @OriginalMember(owner = "client!rs", name = "w", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!rs", name = "u", descriptor = "J")
    private long field5533;

    @OriginalMember(owner = "client!rs", name = "y", descriptor = "Z")
    public static boolean field5537;

    @OriginalMember(owner = "client!rs", name = "v", descriptor = "[Lsl;")
    public static class265[] field5534;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)J", line = 14)
    public final long method2496(int arg0) {
        field5513++;
        if (arg0 > -52) {
            method2501(48);
        }
        return this.field5530;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(B)V", line = 36)
    private final void method2497(byte arg0) throws IOException {
        if (arg0 != -122) {
            this.method2496(-117);
        }
        if (this.field5522 != -1L) {
            if (this.field5533 != this.field5522) {
                this.field5514.method1872((byte) 127, this.field5522);
                this.field5533 = this.field5522;
            }
            this.field5514.method1873(this.field5528, this.field5524, -16644, 0);
            this.field5533 += (long) this.field5524;
            if (this.field5518 < this.field5533) {
                this.field5518 = this.field5533;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field5522 >= this.field5538 && this.field5522 < this.field5538 + ((long) this.field5517)) {
                var2 = this.field5522;
            } else if (this.field5538 >= this.field5522 && ((long) this.field5524 + this.field5522) > this.field5538) {
                var2 = this.field5538;
            }
            if ((this.field5522 + ((long) this.field5524)) > this.field5538 && ((long) this.field5524 + this.field5522) <= ((long) this.field5517 + this.field5538)) {
                var4 = (long) this.field5524 + this.field5522;
            } else if ((long) this.field5517 + this.field5538 > this.field5522 && (long) this.field5524 + this.field5522 >= (long) this.field5517 + this.field5538) {
                var4 = this.field5538 + ((long) this.field5517);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class316.method2075(this.field5528, (int) (var2 - this.field5522), this.field5520, (int) (var2 - this.field5538), var6);
            }
            this.field5524 = 0;
            this.field5522 = -1L;
        }
        field5523++;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(I)V", line = 112)
    public static final void method2498(int arg0) {
        class186.method1283(arg0 + 119);
        field5519++;
        class129.method801(arg0);
        class258.method1734(-1);
        class21.method158((byte) -128);
        class235.method1552(1023);
        class243.method1653(arg0 - 60);
        class311.method2051((byte) 8);
        if (arg0 != 2) {
            return;
        }
        class211.method1430(-6);
        class202.method1339(true);
        class45.method265((byte) 6);
        class75.method416((byte) -64);
        class76.method421(arg0 ^ 0xFFFFFFFD);
        class275.method1820((byte) -64);
        class292.method1937(0);
        class119.method739((byte) 98);
        class324.method2109(arg0 + 30);
        class98.method544((byte) -116);
        class141.method863(arg0 ^ 0xFFFF8638);
        class293.method1939(-20907);
        class360.method2321(124);
        class309.method2044((byte) -107);
        class153.method925(-2);
        class450.method2789(-10941);
        class28.field349.method1626((byte) 106);
        class36.field413.method1626((byte) 106);
        class340.field4820.method1626((byte) 106);
        class118.field1442.method1626((byte) 106);
        class201.field2881.method1626((byte) 106);
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z[BII)V", line = 150)
    public final void method2499(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field5515++;
        try {
            if (this.field5530 < (long) arg2 + this.field5529) {
                this.field5530 = this.field5529 + ((long) arg2);
            }
            if (this.field5522 != -1L && (this.field5522 > this.field5529 || ((long) this.field5524 + this.field5522) < this.field5529)) {
                this.method2497((byte) -122);
            }
            if (!arg0) {
                if (this.field5522 != -1L && (long) this.field5528.length + this.field5522 < (long) arg2 + this.field5529) {
                    int var5 = (int) ((long) this.field5528.length - (this.field5529 - this.field5522));
                    class316.method2075(arg1, arg3, this.field5528, (int) (this.field5529 - this.field5522), var5);
                    arg3 += var5;
                    this.field5529 += (long) var5;
                    arg2 -= var5;
                    this.field5524 = this.field5528.length;
                    this.method2497((byte) -122);
                }
                if (arg2 > this.field5528.length) {
                    if (this.field5533 != this.field5529) {
                        this.field5514.method1872((byte) 89, this.field5529);
                        this.field5533 = this.field5529;
                    }
                    this.field5514.method1873(arg1, arg2, -16644, arg3);
                    this.field5533 += (long) arg2;
                    if (this.field5518 < this.field5533) {
                        this.field5518 = this.field5533;
                    }
                    long var6 = -1L;
                    if (this.field5538 <= this.field5529 && (long) this.field5517 + this.field5538 > this.field5529) {
                        var6 = this.field5529;
                    } else if (this.field5529 <= this.field5538 && (long) arg2 + this.field5529 > this.field5538) {
                        var6 = this.field5538;
                    }
                    long var8 = -1L;
                    if (this.field5538 < this.field5529 + ((long) arg2) && (long) this.field5517 + this.field5538 >= (long) arg2 + this.field5529) {
                        var8 = (long) arg2 + this.field5529;
                    } else if (this.field5529 < this.field5538 + ((long) this.field5517) && ((long) arg2 + this.field5529) >= (this.field5538 + ((long) this.field5517))) {
                        var8 = (long) this.field5517 + this.field5538;
                    }
                    if (var6 > -1L && var6 < var8) {
                        int var10 = (int) (var8 - var6);
                        class316.method2075(arg1, (int) ((long) arg3 + var6 - this.field5529), this.field5520, (int) (var6 - this.field5538), var10);
                    }
                    this.field5529 += (long) arg2;
                } else if (arg2 > 0) {
                    if (this.field5522 == -1L) {
                        this.field5522 = this.field5529;
                    }
                    class316.method2075(arg1, arg3, this.field5528, (int) (this.field5529 - this.field5522), arg2);
                    this.field5529 += (long) arg2;
                    if ((long) this.field5524 < this.field5529 - this.field5522) {
                        this.field5524 = (int) (this.field5529 - this.field5522);
                    }
                }
            }
        } catch (IOException var12) {
            this.field5533 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZI[BI)V", line = 273)
    public final void method2500(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field5531++;
        try {
            if (arg2.length < (arg1 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field5522 != -1L && this.field5529 >= this.field5522 && ((long) arg1 + this.field5529) <= ((long) this.field5524 + this.field5522)) {
                class316.method2075(this.field5528, (int) (this.field5529 - this.field5522), arg2, arg3, arg1);
                this.field5529 += (long) arg1;
                return;
            }
            long var5 = this.field5529;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field5529 >= this.field5538 && (this.field5538 + ((long) this.field5517)) > this.field5529) {
                int var9 = (int) (-this.field5529 - (-this.field5538 - (long) this.field5517));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class316.method2075(this.field5520, (int) (this.field5529 - this.field5538), arg2, arg3, var9);
                this.field5529 += (long) var9;
                arg3 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field5520.length) {
                this.field5514.method1872((byte) -106, this.field5529);
                this.field5533 = this.field5529;
                while (arg1 > 0) {
                    int var10 = this.field5514.method1875(arg1, -10022, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    this.field5529 += (long) var10;
                    arg1 -= var10;
                    this.field5533 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method2504((byte) -13);
                int var11 = arg1;
                if (this.field5517 < arg1) {
                    var11 = this.field5517;
                }
                class316.method2075(this.field5520, 0, arg2, arg3, var11);
                arg1 -= var11;
                arg3 += var11;
                this.field5529 += (long) var11;
            }
            if (!arg0) {
                return;
            }
            if (this.field5522 != -1L) {
                if (this.field5529 < this.field5522 && arg1 > 0) {
                    int var12 = (int) (this.field5522 - this.field5529) + arg3;
                    if ((arg1 + arg3) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field5529++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field5522 && var5 + ((long) var8) > this.field5522) {
                    var13 = this.field5522;
                } else if (this.field5522 <= var5 && ((long) this.field5524 + this.field5522) > var5) {
                    var13 = var5;
                }
                if (var5 < (long) this.field5524 + this.field5522 && var5 + ((long) var8) >= (long) this.field5524 + this.field5522) {
                    var15 = (long) this.field5524 + this.field5522;
                } else if (this.field5522 < (var5 + ((long) var8)) && ((long) this.field5524 + this.field5522) >= ((long) var8 + var5)) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class316.method2075(this.field5528, (int) (var13 - this.field5522), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field5529) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field5529));
                        this.field5529 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5533 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rs", name = "c", descriptor = "(I)V", line = 461)
    public static void method2501(int arg0) {
        field5539 = null;
        if (arg0 == 1) {
            field5534 = null;
            field5536 = null;
            field5521 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lmi;II)V", line = 601)
    public class392(class287 arg0, int arg1, int arg2) throws IOException {
        this.field5514 = arg0;
        this.field5530 = this.field5518 = arg0.method1876(13136);
        this.field5529 = 0L;
        this.field5520 = new byte[arg1];
        this.field5528 = new byte[arg2];
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(JB)V", line = 485)
    public final void method2502(long arg0, byte arg1) throws IOException {
        field5535++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2503(-111));
        }
        this.field5529 = arg0;
        if (arg1 <= 65) {
            field5521 = null;
        }
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)Ljava/io/File;", line = 500)
    private final File method2503(int arg0) {
        field5527++;
        return arg0 >= -4 ? null : this.field5514.method1874((byte) -117);
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V", line = 527)
    private final void method2504(byte arg0) throws IOException {
        if (arg0 != -13) {
            field5537 = false;
        }
        this.field5517 = 0;
        field5525++;
        if (this.field5533 != this.field5529) {
            this.field5514.method1872((byte) -33, this.field5529);
            this.field5533 = this.field5529;
        }
        this.field5538 = this.field5529;
        while (this.field5517 < this.field5520.length) {
            int var2 = this.field5520.length - this.field5517;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5514.method1875(var2, -10022, this.field5520, this.field5517);
            if (var3 == -1) {
                break;
            }
            this.field5517 += var3;
            this.field5533 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([BB)V", line = 583)
    public final void method2505(byte[] arg0, byte arg1) throws IOException {
        if (arg1 > -106) {
            field5521 = null;
        }
        field5526++;
        this.method2500(true, arg0.length, arg0, 0);
    }
}
