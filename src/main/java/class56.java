import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class56 {

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "I")
    private int field722 = 0;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "J")
    private long field724 = -1L;

    @OriginalMember(owner = "client!jv", name = "t", descriptor = "J")
    private long field739 = -1L;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "Len;")
    private class210 field726;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "J")
    private long field728;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "J")
    private long field720;

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "J")
    private long field732;

    @OriginalMember(owner = "client!jv", name = "n", descriptor = "[B")
    private byte[] field733;

    @OriginalMember(owner = "client!jv", name = "s", descriptor = "[B")
    private byte[] field738;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "[B")
    public static byte[] field723;

    @OriginalMember(owner = "client!jv", name = "y", descriptor = "Z")
    public static boolean field744;

    @OriginalMember(owner = "client!jv", name = "x", descriptor = "Lap;")
    public static class335 field743;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "I")
    public static int field721;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
    private int field727;

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!jv", name = "o", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!jv", name = "p", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!jv", name = "q", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!jv", name = "r", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!jv", name = "v", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!jv", name = "w", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "J")
    private long field731;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    private final void method528(int arg0) throws IOException {
        if (this.field724 != -1L) {
            if (this.field731 != this.field724) {
                this.field726.method1304(this.field724, 0);
                this.field731 = this.field724;
            }
            this.field726.method1301(arg0 ^ 0xFFFFFFFE, this.field738, this.field722, 0);
            this.field731 += this.field722;
            if (this.field731 > this.field728) {
                this.field728 = this.field731;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field739 <= this.field724 && (long) this.field727 + this.field739 > this.field724) {
                var2 = this.field724;
            } else if (this.field739 >= this.field724 && this.field739 < (long) this.field722 + this.field724) {
                var2 = this.field739;
            }
            if (this.field739 < ((long) this.field722 + this.field724) && (long) this.field727 + this.field739 >= (long) this.field722 + this.field724) {
                var4 = (long) this.field722 + this.field724;
            } else if (this.field724 < (long) this.field727 + this.field739 && ((long) this.field722 + this.field724) >= ((long) this.field727 + this.field739)) {
                var4 = (long) this.field727 + this.field739;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class318.method1875(this.field738, (int) (var2 - this.field724), this.field733, (int) (var2 - this.field739), var6);
            }
            this.field722 = 0;
            this.field724 = -1L;
        }
        field725++;
        if (arg0 != -1) {
            this.field731 = -69L;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(Z)V")
    private final void method529(boolean arg0) throws IOException {
        field730++;
        this.field727 = 0;
        if (!arg0) {
            field740 = 44;
        }
        if (this.field732 != this.field731) {
            this.field726.method1304(this.field732, 0);
            this.field731 = this.field732;
        }
        this.field739 = this.field732;
        while (this.field727 < this.field733.length) {
            int var2 = this.field733.length - this.field727;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field726.method1305(0, this.field727, this.field733, var2);
            if (var3 == -1) {
                break;
            }
            this.field727 += var3;
            this.field731 += var3;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILhd;I)I")
    public static final int method530(int arg0, class523 arg1, int arg2) {
        field736++;
        if (arg2 >= -26) {
            return 65;
        } else if (!client.method1226(arg1).method642(1, arg0) && arg1.field7578 == null) {
            return -1;
        } else if (arg1.field7685 == null || arg0 >= arg1.field7685.length) {
            return -1;
        } else {
            return arg1.field7685[arg0];
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)J")
    public final long method531(byte arg0) {
        if (arg0 != -82) {
            this.method532((byte) 68);
        }
        field742++;
        return this.field720;
    }

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "(B)Ljava/io/File;")
    private final File method532(byte arg0) {
        if (arg0 != -114) {
            method536((byte) 30);
        }
        field734++;
        return this.field726.method1302(arg0 ^ 0xFFFFFF8E);
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IJ)V")
    public final void method533(int arg0, long arg1) throws IOException {
        field729++;
        if ((long) arg0 > arg1) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method532((byte) -114));
        }
        this.field732 = arg1;
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I[B)V")
    public final void method534(int arg0, byte[] arg1) throws IOException {
        this.method537(-1, 0, arg1, arg1.length);
        field721++;
        if (arg0 != -3) {
            field744 = false;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "([BBII)V")
    public final void method535(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field735++;
        try {
            if (this.field732 + ((long) arg2) > this.field720) {
                this.field720 = (long) arg2 + this.field732;
            }
            if (this.field724 != -1L && (this.field732 < this.field724 || (this.field724 + ((long) this.field722)) < this.field732)) {
                this.method528(-1);
            }
            if (this.field724 != -1L && (long) arg2 + this.field732 > this.field724 - -((long) this.field738.length)) {
                int var5 = (int) ((long) this.field738.length + this.field724 - this.field732);
                class318.method1875(arg0, arg3, this.field738, (int) (this.field732 - this.field724), var5);
                arg3 += var5;
                arg2 -= var5;
                this.field732 += var5;
                this.field722 = this.field738.length;
                this.method528(-1);
            }
            if (this.field738.length >= arg2) {
                int var11 = 96 % ((15 - arg1) / 51);
                if (arg2 > 0) {
                    if (this.field724 == -1L) {
                        this.field724 = this.field732;
                    }
                    class318.method1875(arg0, arg3, this.field738, (int) (this.field732 - this.field724), arg2);
                    this.field732 += arg2;
                    if ((long) this.field722 < this.field732 - this.field724) {
                        this.field722 = (int) (this.field732 - this.field724);
                    }
                }
            } else {
                if (this.field732 != this.field731) {
                    this.field726.method1304(this.field732, 0);
                    this.field731 = this.field732;
                }
                this.field726.method1301(1, arg0, arg2, arg3);
                this.field731 += arg2;
                if (this.field728 < this.field731) {
                    this.field728 = this.field731;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field732 >= this.field739 && this.field732 < (long) this.field727 + this.field739) {
                    var6 = this.field732;
                } else if (this.field739 >= this.field732 && this.field739 < (this.field732 + ((long) arg2))) {
                    var6 = this.field739;
                }
                if (this.field739 < ((long) arg2 + this.field732) && (this.field739 + ((long) this.field727)) >= ((long) arg2 + this.field732)) {
                    var8 = (long) arg2 + this.field732;
                } else if (this.field732 < ((long) this.field727 + this.field739) && ((long) arg2 + this.field732) >= (this.field739 + ((long) this.field727))) {
                    var8 = this.field739 + ((long) this.field727);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class318.method1875(arg0, (int) ((long) arg3 + var6 - this.field732), this.field733, (int) (var6 - this.field739), var10);
                }
                this.field732 += arg2;
            }
        } catch (IOException var13) {
            this.field731 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "(B)V")
    public static void method536(byte arg0) {
        field723 = null;
        field743 = null;
        if (arg0 > -11) {
            field740 = 108;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(II[BI)V")
    public final void method537(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field741++;
        try {
            if ((arg1 + arg3) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg1 - arg2.length);
            }
            if ((long) arg0 != this.field724 && this.field724 <= this.field732 && (long) this.field722 + this.field724 >= (long) arg3 + this.field732) {
                class318.method1875(this.field738, (int) (this.field732 - this.field724), arg2, arg1, arg3);
                this.field732 += arg3;
                return;
            }
            long var5 = this.field732;
            int var7 = arg1;
            int var8 = arg3;
            if (this.field739 <= this.field732 && this.field732 < this.field739 + ((long) this.field727)) {
                int var9 = (int) ((long) this.field727 + this.field739 - this.field732);
                if (arg3 < var9) {
                    var9 = arg3;
                }
                class318.method1875(this.field733, (int) (this.field732 - this.field739), arg2, arg1, var9);
                this.field732 += var9;
                arg3 -= var9;
                arg1 += var9;
            }
            if (arg3 > this.field733.length) {
                this.field726.method1304(this.field732, ~arg0);
                this.field731 = this.field732;
                while (arg3 > 0) {
                    int var10 = this.field726.method1305(arg0 + 1, arg1, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 -= var10;
                    this.field731 += var10;
                    arg1 += var10;
                    this.field732 += var10;
                }
            } else if (arg3 > 0) {
                this.method529(true);
                int var11 = arg3;
                if (arg3 > this.field727) {
                    var11 = this.field727;
                }
                class318.method1875(this.field733, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field732 += var11;
                arg3 -= var11;
            }
            if (this.field724 != -1L) {
                if (this.field724 > this.field732 && arg3 > 0) {
                    int var12 = arg1 + ((int) (this.field724 - this.field732));
                    if (var12 > (arg1 + arg3)) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg1) {
                        arg2[arg1++] = 0;
                        arg3--;
                        this.field732++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field724 && (long) var8 + var5 > this.field724) {
                    var13 = this.field724;
                } else if (var5 >= this.field724 && var5 < (this.field724 + ((long) this.field722))) {
                    var13 = var5;
                }
                if (((long) this.field722 + this.field724) > var5 && (this.field724 + ((long) this.field722)) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field722 + this.field724;
                } else if ((var5 + ((long) var8)) > this.field724 && ((long) var8 + var5) <= ((long) this.field722 + this.field724)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class318.method1875(this.field738, (int) (var13 - this.field724), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field732) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field732));
                        this.field732 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field731 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!jv", name = "<init>", descriptor = "(Len;II)V")
    public class56(class210 arg0, int arg1, int arg2) throws IOException {
        this.field726 = arg0;
        this.field720 = this.field728 = arg0.method1306(0);
        this.field732 = 0L;
        this.field733 = new byte[arg1];
        this.field738 = new byte[arg2];
    }

    static {
        int var0 = 0;
        field723 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field723[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field744 = false;
        field743 = new class335("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");
    }
}
