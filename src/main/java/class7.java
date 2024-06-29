import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class7 {

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "J")
    private long field49 = -1L;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "J")
    private long field62 = -1L;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    private int field66 = 0;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "Lvk;")
    private class56 field44;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "J")
    private long field52;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "J")
    private long field53;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "[B")
    private byte[] field67;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "[B")
    private byte[] field65;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "J")
    private long field69;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "S")
    public static short field54 = 320;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "F")
    public static float field68;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field46;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    private int field56;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    public static int field59;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field64;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "J")
    private long field61;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "Lrk;")
    public static class427 field45;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "[[[B")
    public static byte[][][] field57;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 4)
    private final void method37(byte arg0) throws IOException {
        this.field56 = 0;
        field63++;
        if (arg0 != -86) {
            field57 = null;
        }
        if (this.field69 != this.field61) {
            this.field44.method525(this.field69, 19);
            this.field61 = this.field69;
        }
        this.field62 = this.field69;
        while (this.field67.length > this.field56) {
            int var2 = this.field67.length - this.field56;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field44.method523(this.field67, var2, (byte) -78, this.field56);
            if (var3 == -1) {
                break;
            }
            this.field56 += var3;
            this.field61 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I", line = 51)
    public static final int method38(boolean arg0, int arg1) {
        field55++;
        return arg0 ? 108 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([SI)[S", line = 62)
    public static final short[] method39(short[] arg0, int arg1) {
        field47++;
        if (arg0 == null) {
            return null;
        } else {
            short[] var2 = new short[arg0.length];
            class152.method1174(arg0, 0, var2, arg1, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(JI)V", line = 77)
    public final void method40(long arg0, int arg1) throws IOException {
        field60++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method45(true));
        }
        if (arg1 != 31788) {
            method39((short[]) null, -128);
        }
        this.field69 = arg0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 95)
    private final void method41(int arg0) throws IOException {
        field51++;
        if (this.field49 != -1L) {
            if (this.field61 != this.field49) {
                this.field44.method525(this.field49, 100);
                this.field61 = this.field49;
            }
            this.field44.method527(this.field65, (byte) -108, 0, this.field66);
            this.field61 += (long) this.field66;
            if (this.field52 < this.field61) {
                this.field52 = this.field61;
            }
            long var2 = -1L;
            if (this.field62 <= this.field49 && (long) this.field56 + this.field62 > this.field49) {
                var2 = this.field49;
            } else if (this.field49 <= this.field62 && this.field62 < this.field49 + ((long) this.field66)) {
                var2 = this.field62;
            }
            long var4 = -1L;
            if (this.field62 < ((long) this.field66 + this.field49) && ((long) this.field66 + this.field49) <= ((long) this.field56 + this.field62)) {
                var4 = this.field49 + ((long) this.field66);
            } else if (this.field49 < (long) this.field56 + this.field62 && (long) this.field66 + this.field49 >= (long) this.field56 + this.field62) {
                var4 = (long) this.field56 + this.field62;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class152.method1170(this.field65, (int) (var2 - this.field49), this.field67, (int) (var2 - this.field62), var6);
            }
            this.field66 = 0;
            this.field49 = -1L;
        }
        if (arg0 <= 3) {
            this.method45(true);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[BBI)V", line = 172)
    public final void method42(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        field59++;
        try {
            if ((arg0 + arg3) > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg1.length);
            }
            if (this.field49 != -1L && this.field69 >= this.field49 && ((long) this.field66 + this.field49) >= (this.field69 + ((long) arg3))) {
                class152.method1170(this.field65, (int) (this.field69 - this.field49), arg1, arg0, arg3);
                this.field69 += (long) arg3;
                return;
            }
            long var5 = this.field69;
            int var7 = arg0;
            int var8 = arg3;
            if (this.field62 <= this.field69 && this.field69 < (long) this.field56 + this.field62) {
                int var9 = (int) (this.field62 + (long) this.field56 - this.field69);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class152.method1170(this.field67, (int) (this.field69 - this.field62), arg1, arg0, var9);
                arg0 += var9;
                this.field69 += (long) var9;
                arg3 -= var9;
            }
            if (arg3 > this.field67.length) {
                this.field44.method525(this.field69, 122);
                this.field61 = this.field69;
                while (arg3 > 0) {
                    int var10 = this.field44.method523(arg1, arg3, (byte) -65, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field69 += (long) var10;
                    arg3 -= var10;
                    this.field61 += (long) var10;
                    arg0 += var10;
                }
            } else if (arg3 > 0) {
                this.method37((byte) -86);
                int var11 = arg3;
                if (arg3 > this.field56) {
                    var11 = this.field56;
                }
                class152.method1170(this.field67, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field69 += (long) var11;
                arg3 -= var11;
            }
            if (this.field49 != -1L) {
                if (this.field69 < this.field49 && arg3 > 0) {
                    int var12 = (int) (this.field49 - this.field69) + arg0;
                    if ((arg0 + arg3) < var12) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg3--;
                        arg1[arg0++] = 0;
                        this.field69++;
                    }
                }
                long var13 = -1L;
                if (this.field49 >= var5 && this.field49 < (long) var8 + var5) {
                    var13 = this.field49;
                } else if (var5 >= this.field49 && (long) this.field66 + this.field49 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (((long) this.field66 + this.field49) > var5 && (long) this.field66 + this.field49 <= var5 - -((long) var8)) {
                    var15 = (long) this.field66 + this.field49;
                } else if ((long) var8 + var5 > this.field49 && (long) this.field66 + this.field49 >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class152.method1170(this.field65, (int) (var13 - this.field49), arg1, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field69) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field69));
                        this.field69 = var15;
                    }
                }
            }
            if (arg2 != -17) {
                method46(-98);
            }
        } catch (IOException var19) {
            this.field61 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[B)V", line = 364)
    public final void method43(int arg0, byte[] arg1) throws IOException {
        field58++;
        if (arg0 == -15413) {
            this.method42(0, arg1, (byte) -17, arg1.length);
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lvk;II)V", line = 575)
    public class7(class56 arg0, int arg1, int arg2) throws IOException {
        this.field44 = arg0;
        this.field53 = this.field52 = arg0.method522(-1);
        this.field67 = new byte[arg1];
        this.field65 = new byte[arg2];
        this.field69 = 0L;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([BIII)V", line = 388)
    public final void method44(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg1 > -47) {
            return;
        }
        field50++;
        try {
            if (this.field53 < (this.field69 + ((long) arg3))) {
                this.field53 = (long) arg3 + this.field69;
            }
            if (this.field49 != -1L && (this.field49 > this.field69 || this.field69 > (long) this.field66 + this.field49)) {
                this.method41(55);
            }
            if (this.field49 != -1L && (long) arg3 + this.field69 > this.field49 - -((long) this.field65.length)) {
                int var5 = (int) (this.field49 + (long) this.field65.length - this.field69);
                class152.method1170(arg0, arg2, this.field65, (int) (this.field69 - this.field49), var5);
                arg2 += var5;
                this.field69 += (long) var5;
                arg3 -= var5;
                this.field66 = this.field65.length;
                this.method41(46);
            }
            if (arg3 > this.field65.length) {
                if (this.field69 != this.field61) {
                    this.field44.method525(this.field69, 114);
                    this.field61 = this.field69;
                }
                this.field44.method527(arg0, (byte) -85, arg2, arg3);
                this.field61 += (long) arg3;
                if (this.field52 < this.field61) {
                    this.field52 = this.field61;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field69 >= this.field62 && this.field69 < (this.field62 + ((long) this.field56))) {
                    var6 = this.field69;
                } else if (this.field69 <= this.field62 && this.field62 < (long) arg3 + this.field69) {
                    var6 = this.field62;
                }
                if (this.field62 < this.field69 + ((long) arg3) && (long) arg3 + this.field69 <= this.field62 - -((long) this.field56)) {
                    var8 = (long) arg3 + this.field69;
                } else if (((long) this.field56 + this.field62) > this.field69 && (long) this.field56 + this.field62 <= (long) arg3 + this.field69) {
                    var8 = (long) this.field56 + this.field62;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class152.method1170(arg0, (int) ((long) arg2 + var6 - this.field69), this.field67, (int) (var6 - this.field62), var10);
                }
                this.field69 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field49 == -1L) {
                    this.field49 = this.field69;
                }
                class152.method1170(arg0, arg2, this.field65, (int) (this.field69 - this.field49), arg3);
                this.field69 += (long) arg3;
                if (((long) this.field66) < (this.field69 - this.field49)) {
                    this.field66 = (int) (this.field69 - this.field49);
                }
            }
        } catch (IOException var12) {
            this.field61 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)Ljava/io/File;", line = 526)
    private final File method45(boolean arg0) {
        field46++;
        if (!arg0) {
            field45 = null;
        }
        return this.field44.method524((byte) 120);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V", line = 539)
    public static void method46(int arg0) {
        field57 = null;
        if (arg0 < 27) {
            method39((short[]) null, -59);
        }
        field45 = null;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)J", line = 550)
    public final long method47(byte arg0) {
        field48++;
        int var2 = -6 % ((-arg0 - 22) / 52);
        return this.field53;
    }
}
