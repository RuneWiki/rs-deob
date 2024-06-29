import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class9 {

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "J")
    private long field184 = -1L;

    @OriginalMember(owner = "client!ba", name = "q", descriptor = "J")
    private long field194 = -1L;

    @OriginalMember(owner = "client!ba", name = "K", descriptor = "I")
    private int field214 = 0;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "Loe;")
    private class102 field203;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "J")
    private long field198;

    @OriginalMember(owner = "client!ba", name = "J", descriptor = "J")
    private long field213;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "J")
    private long field204;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "[B")
    private byte[] field191;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "[B")
    private byte[] field209;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field181 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "Lr;")
    public static class118 field179 = class153.method1136(126, "Die Verbindung konnte");

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "Lr;")
    private static class118 field189 = class153.method1136(126, "and choose the (Wcreate account(W");

    @OriginalMember(owner = "client!ba", name = "r", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public static int field193 = 0;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    public static int field205 = 0;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!ba", name = "I", descriptor = "I")
    public static int field212 = 0;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "Lr;")
    public static class118 field192 = field189;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Lr;")
    public static class118 field211 = class153.method1136(100, "titlebox");

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "Lr;")
    public static class118 field210 = class153.method1136(112, "(Y");

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lr;")
    private static class118 field186 = class153.method1136(81, "Error connecting to server)3");

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "Lr;")
    public static class118 field199 = field186;

    @OriginalMember(owner = "client!ba", name = "L", descriptor = "[I")
    public static int[] field215 = new int[128];

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "J")
    private long field188;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B[B)V")
    public final void method63(byte arg0, byte[] arg1) throws IOException {
        this.method73(arg1.length, arg1, -15769, 0);
        field180++;
        if (arg0 != -27) {
            method64(8, -106, 76);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)I")
    public static final int method64(int arg0, int arg1, int arg2) {
        int var3 = -60 % ((-arg1 - 13) / 35);
        field187++;
        int var4 = 0;
        while (arg2 > 0) {
            var4 = var4 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
            arg2--;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "([BIIZ)V")
    public final void method65(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        field183++;
        try {
            if (arg3) {
                method66(-43, 38);
            }
            if (this.field213 < (long) arg1 + this.field204) {
                this.field213 = (long) arg1 + this.field204;
            }
            if (this.field184 != -1L && (this.field204 < this.field184 || (long) this.field214 + this.field184 < this.field204)) {
                this.method71(0);
            }
            if (this.field184 != -1L && (long) arg1 + this.field204 > (long) this.field191.length + this.field184) {
                int var5 = (int) ((long) this.field191.length + this.field184 - this.field204);
                class57.method504(arg0, arg2, this.field191, (int) (this.field204 - this.field184), var5);
                arg2 += var5;
                arg1 -= var5;
                this.field204 += var5;
                this.field214 = this.field191.length;
                this.method71(0);
            }
            if (arg1 > this.field191.length) {
                if (this.field204 != this.field188) {
                    this.field203.method783(this.field204, (byte) -104);
                    this.field188 = this.field204;
                }
                this.field203.method784(arg2, -125, arg0, arg1);
                this.field188 += arg1;
                if (this.field188 > this.field198) {
                    this.field198 = this.field188;
                }
                long var6 = -1L;
                if (this.field194 <= this.field204 && this.field204 < (long) this.field190 + this.field194) {
                    var6 = this.field204;
                } else if (this.field194 >= this.field204 && this.field204 + (long) arg1 > this.field194) {
                    var6 = this.field194;
                }
                long var8 = -1L;
                if (this.field194 < (long) arg1 + this.field204 && (long) arg1 + this.field204 <= (long) this.field190 + this.field194) {
                    var8 = (long) arg1 + this.field204;
                } else if ((long) this.field190 + this.field194 > this.field204 && this.field194 + (long) this.field190 <= this.field204 - -((long) arg1)) {
                    var8 = this.field194 + (long) this.field190;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class57.method504(arg0, (int) ((long) arg2 + var6 - this.field204), this.field209, (int) (var6 - this.field194), var10);
                }
                this.field204 += arg1;
            } else if (arg1 > 0) {
                if (this.field184 == -1L) {
                    this.field184 = this.field204;
                }
                class57.method504(arg0, arg2, this.field191, (int) (this.field204 - this.field184), arg1);
                this.field204 += arg1;
                if ((long) this.field214 < this.field204 - this.field184) {
                    this.field214 = (int) (this.field204 - this.field184);
                }
            }
        } catch (IOException var12) {
            this.field188 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)Lsa;")
    public static final class126 method66(int arg0, int arg1) {
        field208++;
        class126 var2 = (class126) class1.field19.method395((byte) -21, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class81.field1961.method350(arg0, -59, arg1);
        class126 var4 = new class126();
        if (var3 != null) {
            var4.method980(new class105(var3), 65);
        }
        class1.field19.method391(var4, (long) arg1, true);
        return var4;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IJ)V")
    public final void method67(int arg0, long arg1) throws IOException {
        field200++;
        if (arg0 != -1) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method68(true));
        }
        this.field204 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method68(boolean arg0) {
        if (!arg0) {
            field186 = null;
        }
        field201++;
        return this.field203.method779((byte) -98);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    private final void method69(byte arg0) throws IOException {
        int var2 = 30 / ((-arg0 - 82) / 35);
        field182++;
        this.field190 = 0;
        if (this.field204 != this.field188) {
            this.field203.method783(this.field204, (byte) -104);
            this.field188 = this.field204;
        }
        this.field194 = this.field204;
        while (this.field209.length > this.field190) {
            int var3 = this.field203.method781(this.field209.length - this.field190, this.field190, this.field209, (byte) -126);
            if (var3 == -1) {
                break;
            }
            this.field188 += var3;
            this.field190 += var3;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IB)V")
    public static final void method70(int arg0, byte arg1) {
        field207++;
        if (arg1 >= 86) {
            class69.field1614 = arg0;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    private final void method71(int arg0) throws IOException {
        if (this.field184 != -1L) {
            long var2 = -1L;
            if (this.field188 != this.field184) {
                this.field203.method783(this.field184, (byte) -104);
                this.field188 = this.field184;
            }
            this.field203.method784(0, -115, this.field191, this.field214);
            long var4 = -1L;
            this.field188 += this.field214;
            if (this.field198 < this.field188) {
                this.field198 = this.field188;
            }
            if (this.field184 >= this.field194 && this.field184 < (long) this.field190 + this.field194) {
                var4 = this.field184;
            } else if (this.field184 <= this.field194 && this.field194 < (long) this.field214 + this.field184) {
                var4 = this.field194;
            }
            if ((long) this.field214 + this.field184 > this.field194 && (long) this.field214 + this.field184 <= (long) this.field190 + this.field194) {
                var2 = (long) this.field214 + this.field184;
            } else if ((long) this.field190 + this.field194 > this.field184 && (long) this.field214 + this.field184 >= (long) this.field190 + this.field194) {
                var2 = this.field194 + (long) this.field190;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class57.method504(this.field191, (int) (var4 - this.field184), this.field209, (int) (var4 - this.field194), var6);
            }
            this.field214 = 0;
            this.field184 = -1L;
        }
        if (arg0 == 0) {
            field202++;
        }
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)J")
    public final long method72(int arg0) {
        field178++;
        if (arg0 != 0) {
            method70(50, (byte) -85);
        }
        return this.field213;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[BII)V")
    public final void method73(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field185++;
        try {
            if (arg3 + arg0 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field184 != -1L && this.field184 <= this.field204 && (long) arg0 + this.field204 <= this.field184 - -((long) this.field214)) {
                class57.method504(this.field191, (int) (this.field204 - this.field184), arg1, arg3, arg0);
                this.field204 += arg0;
                return;
            }
            int var5 = arg3;
            long var6 = this.field204;
            int var8 = arg0;
            if (this.field204 >= this.field194 && this.field194 + (long) this.field190 > this.field204) {
                int var9 = (int) (this.field194 + (long) this.field190 - this.field204);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class57.method504(this.field209, (int) (this.field204 - this.field194), arg1, arg3, var9);
                this.field204 += var9;
                arg3 += var9;
            }
            if (arg2 != -15769) {
                return;
            }
            if (this.field209.length < arg0) {
                this.field203.method783(this.field204, (byte) -104);
                this.field188 = this.field204;
                while (arg0 > 0) {
                    int var11 = this.field203.method781(arg0, arg3, arg1, (byte) -99);
                    if (var11 == -1) {
                        break;
                    }
                    arg0 -= var11;
                    arg3 += var11;
                    this.field204 += var11;
                    this.field188 += var11;
                }
            } else if (arg0 > 0) {
                this.method69((byte) -119);
                int var10 = arg0;
                if (this.field190 < arg0) {
                    var10 = this.field190;
                }
                arg0 -= var10;
                class57.method504(this.field209, 0, arg1, arg3, var10);
                arg3 += var10;
                this.field204 += var10;
            }
            if (this.field184 != -1L) {
                if (this.field184 > this.field204 && arg0 > 0) {
                    int var12 = (int) (this.field184 - this.field204) + arg3;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0--;
                        arg1[arg3++] = 0;
                        this.field204++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field184 >= var6 && this.field184 < (long) var8 + var6) {
                    var13 = this.field184;
                } else if (this.field184 <= var6 && (long) this.field214 + this.field184 > var6) {
                    var13 = var6;
                }
                if (this.field184 + (long) this.field214 > var6 && (long) this.field214 + this.field184 <= (long) var8 + var6) {
                    var15 = this.field184 + (long) this.field214;
                } else if (var6 + (long) var8 > this.field184 && var6 + (long) var8 <= (long) this.field214 + this.field184) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class57.method504(this.field191, (int) (var13 - this.field184), arg1, (int) (var13 - var6) + var5, var17);
                    if (this.field204 < var15) {
                        arg0 = (int) ((long) arg0 + this.field204 - var15);
                        this.field204 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field188 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)V")
    public final void method74(int arg0) throws IOException {
        int var2 = -111 / ((arg0 + 32) / 45);
        field206++;
        this.method71(0);
        this.field203.method782((byte) -128);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILff;I)Z")
    public static final boolean method75(int arg0, int arg1, class42 arg2, int arg3) {
        if (arg1 != 1286850920) {
            method64(97, -17, 58);
        }
        field196++;
        byte[] var4 = arg2.method350(arg0, -115, arg3);
        if (var4 == null) {
            return false;
        } else {
            class153.method1142(var4, -23279);
            return true;
        }
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method76(int arg0) {
        field192 = null;
        field186 = null;
        field215 = null;
        field199 = null;
        field189 = null;
        field211 = null;
        field210 = null;
        field179 = null;
        if (arg0 != 0) {
            method76(-73);
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(Loe;II)V")
    public class9(class102 arg0, int arg1, int arg2) throws IOException {
        this.field203 = arg0;
        this.field213 = this.field198 = arg0.method780((byte) 119);
        this.field204 = 0L;
        this.field191 = new byte[arg2];
        this.field209 = new byte[arg1];
    }
}
