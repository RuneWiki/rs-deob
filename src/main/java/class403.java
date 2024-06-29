import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class403 {

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    private int field6069 = 0;

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "J")
    private long field6077 = -1L;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "J")
    private long field6076 = -1L;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "Lrh;")
    private class488 field6078;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "J")
    private long field6067;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "J")
    private long field6072;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "[B")
    private byte[] field6080;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "J")
    private long field6068;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "[B")
    private byte[] field6062;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "[I")
    public static int[] field6060 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "Llm;")
    public static class31 field6073;

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "Lbi;")
    public static class104 field6079;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "[Lfc;")
    public static class438[] field6081;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field6061;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field6063;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    public static int field6064;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    private int field6070;

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field6074;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "I")
    public static int field6075;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "J")
    private long field6059;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    private final void method2587(int arg0) throws IOException {
        if (this.field6077 != -1L) {
            if (this.field6077 != this.field6059) {
                this.field6078.method2998((byte) 122, this.field6077);
                this.field6059 = this.field6077;
            }
            this.field6078.method2995(true, this.field6069, this.field6080, 0);
            this.field6059 += this.field6069;
            if (this.field6067 < this.field6059) {
                this.field6067 = this.field6059;
            }
            long var2 = -1L;
            if (this.field6076 <= this.field6077 && this.field6077 < ((long) this.field6070 + this.field6076)) {
                var2 = this.field6077;
            } else if (this.field6077 <= this.field6076 && (long) this.field6069 + this.field6077 > this.field6076) {
                var2 = this.field6076;
            }
            long var4 = -1L;
            if (((long) this.field6069 + this.field6077) > this.field6076 && (long) this.field6070 + this.field6076 >= this.field6077 - -((long) this.field6069)) {
                var4 = (long) this.field6069 + this.field6077;
            } else if (this.field6077 < this.field6076 + ((long) this.field6070) && this.field6076 + ((long) this.field6070) <= (long) this.field6069 + this.field6077) {
                var4 = (long) this.field6070 + this.field6076;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class324.method2166(this.field6080, (int) (var2 - this.field6077), this.field6062, (int) (var2 - this.field6076), var6);
            }
            this.field6077 = -1L;
            this.field6069 = 0;
        }
        if (arg0 != 12688) {
            method2596((byte) 84);
        }
        field6064++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([BI)V")
    public final void method2588(byte[] arg0, int arg1) throws IOException {
        this.method2593(true, arg0.length, arg0, 0);
        field6065++;
        if (arg1 >= -79) {
            this.field6069 = -28;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(JI)V")
    public final void method2589(long arg0, int arg1) throws IOException {
        field6074++;
        if (arg0 < (long) arg1) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method2595((byte) 46));
        }
        this.field6068 = arg0;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "()V")
    public static final void method2590() {
        class280.method1883(1, class297.field4675);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    private final void method2591(byte arg0) throws IOException {
        field6071++;
        this.field6070 = 0;
        if (this.field6068 != this.field6059) {
            this.field6078.method2998((byte) 122, this.field6068);
            this.field6059 = this.field6068;
        }
        if (arg0 != 67) {
            return;
        }
        this.field6076 = this.field6068;
        while (this.field6070 < this.field6062.length) {
            int var2 = this.field6062.length - this.field6070;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field6078.method2993(this.field6062, (byte) -108, this.field6070, var2);
            if (var3 == -1) {
                break;
            }
            this.field6070 += var3;
            this.field6059 += var3;
        }
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)J")
    public final long method2592(byte arg0) {
        if (arg0 != 50) {
            method2590();
        }
        field6063++;
        return this.field6072;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI[BI)V")
    public final void method2593(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field6066++;
        try {
            if (!arg0) {
                this.field6062 = null;
            }
            if (arg3 + arg1 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if (this.field6077 != -1L && this.field6077 <= this.field6068 && (long) this.field6069 + this.field6077 >= (long) arg1 + this.field6068) {
                class324.method2166(this.field6080, (int) (this.field6068 - this.field6077), arg2, arg3, arg1);
                this.field6068 += arg1;
                return;
            }
            long var5 = this.field6068;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field6076 <= this.field6068 && (long) this.field6070 + this.field6076 > this.field6068) {
                int var9 = (int) ((long) this.field6070 + this.field6076 - this.field6068);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class324.method2166(this.field6062, (int) (this.field6068 - this.field6076), arg2, arg3, var9);
                this.field6068 += var9;
                arg3 += var9;
                arg1 -= var9;
            }
            if (this.field6062.length < arg1) {
                this.field6078.method2998((byte) 126, this.field6068);
                this.field6059 = this.field6068;
                while (arg1 > 0) {
                    int var10 = this.field6078.method2993(arg2, (byte) -108, arg3, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field6068 += var10;
                    this.field6059 += var10;
                    arg1 -= var10;
                    arg3 += var10;
                }
            } else if (arg1 > 0) {
                this.method2591((byte) 67);
                int var11 = arg1;
                if (arg1 > this.field6070) {
                    var11 = this.field6070;
                }
                class324.method2166(this.field6062, 0, arg2, arg3, var11);
                arg3 += var11;
                this.field6068 += var11;
                arg1 -= var11;
            }
            if (this.field6077 != -1L) {
                if (this.field6077 > this.field6068 && arg1 > 0) {
                    int var12 = (int) (this.field6077 - this.field6068) + arg3;
                    if (var12 > arg3 + arg1) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        arg1--;
                        this.field6068++;
                    }
                }
                long var13 = -1L;
                if (this.field6077 >= var5 && this.field6077 < (long) var8 + var5) {
                    var13 = this.field6077;
                } else if (this.field6077 <= var5 && this.field6077 + ((long) this.field6069) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field6077 + ((long) this.field6069) && (long) this.field6069 + this.field6077 <= (long) var8 + var5) {
                    var15 = (long) this.field6069 + this.field6077;
                } else if (this.field6077 < ((long) var8 + var5) && (long) var8 + var5 <= this.field6077 - -((long) this.field6069)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class324.method2166(this.field6080, (int) (var13 - this.field6077), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field6068) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field6068));
                        this.field6068 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field6059 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([BIII)V")
    public final void method2594(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field6075++;
        try {
            if (this.field6072 < (long) arg1 + this.field6068) {
                this.field6072 = this.field6068 + ((long) arg1);
            }
            if (this.field6077 != -1L && (this.field6068 < this.field6077 || this.field6068 > (long) this.field6069 + this.field6077)) {
                this.method2587(arg3 ^ 0xFFFFCE6F);
            }
            if (this.field6077 != -1L && this.field6077 + ((long) this.field6080.length) < (long) arg1 + this.field6068) {
                int var5 = (int) ((long) this.field6080.length + this.field6077 - this.field6068);
                class324.method2166(arg0, arg2, this.field6080, (int) (this.field6068 - this.field6077), var5);
                this.field6068 += var5;
                arg1 -= var5;
                arg2 += var5;
                this.field6069 = this.field6080.length;
                this.method2587(arg3 + 12689);
            }
            if (this.field6080.length < arg1) {
                if (this.field6068 != this.field6059) {
                    this.field6078.method2998((byte) 123, this.field6068);
                    this.field6059 = this.field6068;
                }
                this.field6078.method2995(true, arg1, arg0, arg2);
                this.field6059 += arg1;
                if (this.field6059 > this.field6067) {
                    this.field6067 = this.field6059;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field6076 <= this.field6068 && this.field6068 < (this.field6076 + ((long) this.field6070))) {
                    var6 = this.field6068;
                } else if (this.field6076 >= this.field6068 && this.field6076 < ((long) arg1 + this.field6068)) {
                    var6 = this.field6076;
                }
                if (this.field6076 < ((long) arg1 + this.field6068) && (long) this.field6070 + this.field6076 >= (long) arg1 + this.field6068) {
                    var8 = (long) arg1 + this.field6068;
                } else if (this.field6076 + ((long) this.field6070) > this.field6068 && this.field6076 + ((long) this.field6070) <= (long) arg1 + this.field6068) {
                    var8 = (long) this.field6070 + this.field6076;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class324.method2166(arg0, (int) ((long) arg2 + var6 - this.field6068), this.field6062, (int) (var6 - this.field6076), var10);
                }
                this.field6068 += arg1;
            } else if (~arg1 < arg3) {
                if (this.field6077 == -1L) {
                    this.field6077 = this.field6068;
                }
                class324.method2166(arg0, arg2, this.field6080, (int) (this.field6068 - this.field6077), arg1);
                this.field6068 += arg1;
                if ((long) this.field6069 < this.field6068 - this.field6077) {
                    this.field6069 = (int) (this.field6068 - this.field6077);
                }
            }
        } catch (IOException var12) {
            this.field6059 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method2595(byte arg0) {
        if (arg0 < 41) {
            this.method2595((byte) 102);
        }
        field6061++;
        return this.field6078.method2996(116);
    }

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "(B)V")
    public static void method2596(byte arg0) {
        field6081 = null;
        field6079 = null;
        if (arg0 != -116) {
            method2590();
        }
        field6060 = null;
        field6073 = null;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lrh;II)V")
    public class403(class488 arg0, int arg1, int arg2) throws IOException {
        this.field6078 = arg0;
        this.field6072 = this.field6067 = arg0.method2997((byte) -114);
        this.field6080 = new byte[arg2];
        this.field6068 = 0L;
        this.field6062 = new byte[arg1];
    }

    static {
        new class213("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field6073 = new class31(14, 4);
        field6079 = new class104(85, 8);
        field6081 = new class438[4];
    }
}
