import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 {

    @OriginalMember(owner = "client!af", name = "g", descriptor = "I")
    private int field191 = 0;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "J")
    private long field190 = -1L;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "J")
    private long field202 = -1L;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "Lnc;")
    private class92 field201;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "J")
    private long field185;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "J")
    private long field188;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "[B")
    private byte[] field189;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "[B")
    private byte[] field203;

    @OriginalMember(owner = "client!af", name = "l", descriptor = "J")
    private long field196;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Loc;")
    public static class99 field199 = class48.method402((byte) -104, "Bitte laden Sie die Seite neu)3");

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field206 = 0;

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Lrd;")
    public static class119 field205 = new class119(32);

    @OriginalMember(owner = "client!af", name = "y", descriptor = "Loc;")
    public static class99 field209 = class48.method402((byte) -104, "und haben es deaktiviert)3 Klicken Sie auf der");

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field211 = 2;

    @OriginalMember(owner = "client!af", name = "z", descriptor = "[I")
    public static int[] field210 = new int[5];

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field194;

    @OriginalMember(owner = "client!af", name = "k", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!af", name = "w", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client!af", name = "x", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "J")
    private long field192;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "Lpc;")
    public static class105 field212;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "([BIBI)V")
    public final void method86(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field194++;
        if (arg2 != -82) {
            return;
        }
        try {
            if (arg1 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field190 != -1L && this.field196 >= this.field190 && this.field196 + (long) arg3 <= (long) this.field191 + this.field190) {
                class116.method990(this.field203, (int) (this.field196 - this.field190), arg0, arg1, arg3);
                this.field196 += arg3;
                return;
            }
            long var5 = this.field196;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field196 >= this.field202 && this.field196 < this.field202 + (long) this.field207) {
                int var9 = (int) ((long) this.field207 + this.field202 - this.field196);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class116.method990(this.field189, (int) (this.field196 - this.field202), arg0, arg1, var9);
                arg1 += var9;
                this.field196 += var9;
            }
            if (arg3 > this.field189.length) {
                this.field201.method761(this.field196, (byte) 108);
                this.field192 = this.field196;
                while (arg3 > 0) {
                    int var10 = this.field201.method760(arg3, arg0, arg2 ^ 0xFFFF9BB6, arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    arg1 += var10;
                    this.field192 += var10;
                    this.field196 += var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method92((byte) 102);
                if (this.field207 < arg3) {
                    var11 = this.field207;
                }
                arg3 -= var11;
                class116.method990(this.field189, 0, arg0, arg1, var11);
                this.field196 += var11;
                arg1 += var11;
            }
            if (this.field190 != -1L) {
                if (this.field190 > this.field196 && arg3 > 0) {
                    int var12 = (int) (this.field190 - this.field196) + arg1;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg3--;
                        arg0[arg1++] = 0;
                        this.field196++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field190 >= var5 && this.field190 < (long) var8 + var5) {
                    var13 = this.field190;
                } else if (var5 >= this.field190 && var5 < this.field190 + (long) this.field191) {
                    var13 = var5;
                }
                if ((long) this.field191 + this.field190 > var5 && this.field190 + (long) this.field191 <= var5 - -((long) var8)) {
                    var15 = (long) this.field191 + this.field190;
                } else if (this.field190 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field191 + this.field190) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class116.method990(this.field203, (int) (var13 - this.field190), arg0, (int) (var13 - var5) + var7, var17);
                    if (this.field196 < var15) {
                        arg3 = (int) ((long) arg3 + this.field196 - var15);
                        this.field196 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field192 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method87(int arg0) {
        field210 = null;
        field209 = null;
        field199 = null;
        int var1 = -82 % ((arg0 + 14) / 58);
        field212 = null;
        field205 = null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BII)V")
    public final void method88(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 19102) {
            return;
        }
        field187++;
        try {
            if (this.field196 + (long) arg0 > this.field188) {
                this.field188 = (long) arg0 + this.field196;
            }
            if (this.field190 != -1L && (this.field196 < this.field190 || (long) this.field191 + this.field190 < this.field196)) {
                this.method91(arg2 - 19103);
            }
            if (this.field190 != -1L && (long) this.field203.length + this.field190 < (long) arg0 + this.field196) {
                int var5 = (int) ((long) this.field203.length + this.field190 - this.field196);
                class116.method990(arg1, arg3, this.field203, (int) (this.field196 - this.field190), var5);
                arg0 -= var5;
                arg3 += var5;
                this.field196 += var5;
                this.field191 = this.field203.length;
                this.method91(arg2 - 19103);
            }
            if (arg0 > this.field203.length) {
                if (this.field196 != this.field192) {
                    this.field201.method761(this.field196, (byte) 99);
                    this.field192 = this.field196;
                }
                long var6 = -1L;
                this.field201.method763(arg1, (byte) 107, arg0, arg3);
                this.field192 += arg0;
                long var8 = -1L;
                if (this.field192 > this.field185) {
                    this.field185 = this.field192;
                }
                if (this.field196 >= this.field202 && this.field196 < (long) this.field207 + this.field202) {
                    var6 = this.field196;
                } else if (this.field196 <= this.field202 && this.field202 < (long) arg0 + this.field196) {
                    var6 = this.field202;
                }
                if ((long) arg0 + this.field196 > this.field202 && (long) arg0 + this.field196 <= (long) this.field207 + this.field202) {
                    var8 = (long) arg0 + this.field196;
                } else if (this.field196 < (long) this.field207 + this.field202 && (long) arg0 + this.field196 >= this.field202 - -((long) this.field207)) {
                    var8 = (long) this.field207 + this.field202;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class116.method990(arg1, (int) ((long) arg3 + var6 - this.field196), this.field189, (int) (var6 - this.field202), var10);
                }
                this.field196 += arg0;
            } else if (arg0 > 0) {
                if (this.field190 == -1L) {
                    this.field190 = this.field196;
                }
                class116.method990(arg1, arg3, this.field203, (int) (this.field196 - this.field190), arg0);
                this.field196 += arg0;
                if ((long) this.field191 < this.field196 - this.field190) {
                    this.field191 = (int) (this.field196 - this.field190);
                }
            }
        } catch (IOException var12) {
            this.field192 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BJ)V")
    public final void method89(byte arg0, long arg1) {
        field198++;
        if (arg1 >= 0L) {
            if (arg0 != 54) {
                this.field185 = -88L;
            }
            this.field196 = arg1;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLjava/lang/Throwable;)Ljava/lang/String;")
    public static final String method90(boolean arg0, Throwable arg1) throws IOException {
        field193++;
        if (!arg0) {
            field197 = 29;
        }
        String var3;
        if (arg1 instanceof class4) {
            class4 var2 = (class4) arg1;
            var3 = var2.field76 + " | ";
            arg1 = var2.field86;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)V")
    private final void method91(int arg0) throws IOException {
        field200++;
        if (arg0 != -1 || this.field190 == -1L) {
            return;
        }
        if (this.field192 != this.field190) {
            this.field201.method761(this.field190, (byte) 113);
            this.field192 = this.field190;
        }
        this.field201.method763(this.field203, (byte) 105, this.field191, 0);
        long var2 = -1L;
        if (this.field190 >= this.field202 && this.field190 < (long) this.field207 + this.field202) {
            var2 = this.field190;
        } else if (this.field202 >= this.field190 && this.field202 < this.field190 + (long) this.field191) {
            var2 = this.field202;
        }
        this.field192 += this.field191;
        if (this.field185 < this.field192) {
            this.field185 = this.field192;
        }
        long var4 = -1L;
        if (this.field202 < (long) this.field191 + this.field190 && this.field202 + (long) this.field207 >= (long) this.field191 + this.field190) {
            var4 = (long) this.field191 + this.field190;
        } else if (this.field190 < (long) this.field207 + this.field202 && (long) this.field207 + this.field202 <= (long) this.field191 + this.field190) {
            var4 = (long) this.field207 + this.field202;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class116.method990(this.field203, (int) (var2 - this.field190), this.field189, (int) (var2 - this.field202), var6);
        }
        this.field191 = 0;
        this.field190 = -1L;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    private final void method92(byte arg0) throws IOException {
        this.field207 = 0;
        if (this.field196 != this.field192) {
            this.field201.method761(this.field196, (byte) 120);
            this.field192 = this.field196;
        }
        field208++;
        this.field202 = this.field196;
        while (this.field189.length > this.field207) {
            int var2 = this.field201.method760(this.field189.length - this.field207, this.field189, 25624, this.field207);
            if (var2 == -1) {
                break;
            }
            this.field192 += var2;
            this.field207 += var2;
        }
        int var3 = 29 % ((47 - arg0) / 41);
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)J")
    public final long method93(byte arg0) {
        field195++;
        return arg0 == -66 ? this.field188 : 121L;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public final void method94(int arg0) throws IOException {
        field186++;
        if (arg0 < 49) {
            this.method89((byte) 117, 41L);
        }
        this.method91(-1);
        this.field201.method759(1);
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lnc;II)V")
    public class7(class92 arg0, int arg1, int arg2) throws IOException {
        this.field201 = arg0;
        this.field188 = this.field185 = arg0.method758(117);
        this.field189 = new byte[arg1];
        this.field203 = new byte[arg2];
        this.field196 = 0L;
    }
}
