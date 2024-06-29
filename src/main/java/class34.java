import java.awt.Frame;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class34 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    private int field648 = 0;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "J")
    private long field664 = -1L;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "J")
    private long field652 = -1L;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "Lkc;")
    private class93 field661;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
    private long field651;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "J")
    private long field671;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "J")
    private long field662;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "[B")
    private byte[] field668;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "[B")
    private byte[] field656;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "Z")
    public static boolean field663 = false;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "Leh;")
    public static class47 field667 = class195.method1282((byte) -4, "<col=ff9040>");

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field672;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "J")
    private long field657;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/awt/Frame;")
    public static Frame field655;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method289(byte arg0) {
        field655 = null;
        if (arg0 > 20) {
            field667 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lhd;I)V")
    public static final void method290(class68 arg0, int arg1) {
        field654++;
        if (arg1 != 0) {
            return;
        }
        if (class126.field2532 != null) {
            try {
                class126.field2532.method294(0L, -77);
                class126.field2532.method291(-1, arg0.field1495, arg0.field1454, 24);
            } catch (Exception var2) {
            }
        }
        arg0.field1454 += 24;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BII)V")
    public final void method291(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field659++;
        try {
            if (this.field671 < (long) arg3 + this.field662) {
                this.field671 = (long) arg3 + this.field662;
            }
            if ((long) arg0 != this.field664 && (this.field662 < this.field664 || this.field662 > (long) this.field648 + this.field664)) {
                this.method293((byte) -117);
            }
            if (this.field664 != -1L && (long) arg3 + this.field662 > this.field664 - -((long) this.field656.length)) {
                int var5 = (int) ((long) this.field656.length + this.field664 - this.field662);
                arg3 -= var5;
                class128.method958(arg1, arg2, this.field656, (int) (this.field662 - this.field664), var5);
                this.field662 += var5;
                arg2 += var5;
                this.field648 = this.field656.length;
                this.method293((byte) -118);
            }
            if (arg3 > this.field656.length) {
                if (this.field662 != this.field657) {
                    this.field661.method749(this.field662, (byte) 70);
                    this.field657 = this.field662;
                }
                this.field661.method748(arg1, arg3, (byte) 90, arg2);
                this.field657 += arg3;
                long var6 = -1L;
                if (this.field651 < this.field657) {
                    this.field651 = this.field657;
                }
                long var8 = -1L;
                if ((long) arg3 + this.field662 > this.field652 && (long) arg3 + this.field662 <= (long) this.field670 + this.field652) {
                    var8 = (long) arg3 + this.field662;
                } else if (this.field662 < (long) this.field670 + this.field652 && (long) arg3 + this.field662 >= (long) this.field670 + this.field652) {
                    var8 = (long) this.field670 + this.field652;
                }
                if (this.field662 >= this.field652 && this.field662 < (long) this.field670 + this.field652) {
                    var6 = this.field662;
                } else if (this.field652 >= this.field662 && this.field662 + (long) arg3 > this.field652) {
                    var6 = this.field652;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class128.method958(arg1, (int) ((long) arg2 + var6 - this.field662), this.field668, (int) (var6 - this.field652), var10);
                }
                this.field662 += arg3;
            } else if (arg3 > 0) {
                if (this.field664 == -1L) {
                    this.field664 = this.field662;
                }
                class128.method958(arg1, arg2, this.field656, (int) (this.field662 - this.field664), arg3);
                this.field662 += arg3;
                if ((long) this.field648 < this.field662 - this.field664) {
                    this.field648 = (int) (this.field662 - this.field664);
                }
            }
        } catch (IOException var12) {
            this.field657 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method292(int arg0) {
        if (arg0 != 1) {
            this.field664 = -25L;
        }
        field669++;
        return this.field661.method745((byte) 120);
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)V")
    private final void method293(byte arg0) throws IOException {
        if (this.field664 != -1L) {
            long var2 = -1L;
            long var4 = -1L;
            if (this.field664 != this.field657) {
                this.field661.method749(this.field664, (byte) 44);
                this.field657 = this.field664;
            }
            this.field661.method748(this.field656, this.field648, (byte) 90, 0);
            this.field657 += this.field648;
            if (this.field657 > this.field651) {
                this.field651 = this.field657;
            }
            if (this.field652 < (long) this.field648 + this.field664 && (long) this.field670 + this.field652 >= (long) this.field648 + this.field664) {
                var4 = (long) this.field648 + this.field664;
            } else if (this.field664 < (long) this.field670 + this.field652 && (long) this.field648 + this.field664 >= (long) this.field670 + this.field652) {
                var4 = this.field652 + (long) this.field670;
            }
            if (this.field664 >= this.field652 && this.field664 < this.field652 + (long) this.field670) {
                var2 = this.field664;
            } else if (this.field652 >= this.field664 && this.field664 + (long) this.field648 > this.field652) {
                var2 = this.field652;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class128.method958(this.field656, (int) (var2 - this.field664), this.field668, (int) (var2 - this.field652), var6);
            }
            this.field648 = 0;
            this.field664 = -1L;
        }
        if (arg0 >= -112) {
            field667 = null;
        }
        field672++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JI)V")
    public final void method294(long arg0, int arg1) throws IOException {
        if (arg1 >= -43) {
            this.method295(false);
        }
        field653++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method292(1));
        }
        this.field662 = arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)J")
    public final long method295(boolean arg0) {
        if (arg0) {
            method290(null, -83);
        }
        field660++;
        return this.field671;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II[BZ)V")
    public final void method296(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field665++;
        try {
            if (!arg3) {
                return;
            }
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field664 != -1L && this.field664 <= this.field662 && (long) arg0 + this.field662 <= (long) this.field648 + this.field664) {
                class128.method958(this.field656, (int) (this.field662 - this.field664), arg2, arg1, arg0);
                this.field662 += arg0;
                return;
            }
            int var5 = arg1;
            long var6 = this.field662;
            int var8 = arg0;
            if (this.field652 <= this.field662 && (long) this.field670 + this.field652 > this.field662) {
                int var9 = (int) (this.field652 + (long) this.field670 - this.field662);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class128.method958(this.field668, (int) (this.field662 - this.field652), arg2, arg1, var9);
                this.field662 += var9;
                arg1 += var9;
            }
            if (arg0 > this.field668.length) {
                this.field661.method749(this.field662, (byte) 76);
                this.field657 = this.field662;
                while (arg0 > 0) {
                    int var11 = this.field661.method747(arg0, arg1, arg2, -1);
                    if (var11 == -1) {
                        break;
                    }
                    this.field657 += var11;
                    arg1 += var11;
                    arg0 -= var11;
                    this.field662 += var11;
                }
            } else if (arg0 > 0) {
                this.method299((byte) 41);
                int var10 = arg0;
                if (this.field670 < arg0) {
                    var10 = this.field670;
                }
                class128.method958(this.field668, 0, arg2, arg1, var10);
                arg0 -= var10;
                arg1 += var10;
                this.field662 += var10;
            }
            if (this.field664 != -1L) {
                if (this.field664 > this.field662 && arg0 > 0) {
                    int var12 = (int) (this.field664 - this.field662) + arg1;
                    if (arg1 + arg0 < var12) {
                        var12 = arg0 + arg1;
                    }
                    while (arg1 < var12) {
                        arg0--;
                        arg2[arg1++] = 0;
                        this.field662++;
                    }
                }
                long var13 = -1L;
                if (var6 < (long) this.field648 + this.field664 && var6 + (long) var8 >= (long) this.field648 + this.field664) {
                    var13 = (long) this.field648 + this.field664;
                } else if ((long) var8 + var6 > this.field664 && (long) var8 + var6 <= (long) this.field648 + this.field664) {
                    var13 = (long) var8 + var6;
                }
                long var15 = -1L;
                if (var6 <= this.field664 && (long) var8 + var6 > this.field664) {
                    var15 = this.field664;
                } else if (this.field664 <= var6 && (long) this.field648 + this.field664 > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class128.method958(this.field656, (int) (var15 - this.field664), arg2, (int) (var15 - var6) + var5, var17);
                    if (var13 > this.field662) {
                        arg0 = (int) ((long) arg0 + this.field662 - var13);
                        this.field662 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field657 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public final void method297(byte arg0) throws IOException {
        this.method293((byte) -123);
        this.field661.method746(-105);
        if (arg0 > 110) {
            field666++;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([BB)V")
    public final void method298(byte[] arg0, byte arg1) throws IOException {
        field650++;
        if (arg1 <= 7) {
            this.method292(17);
        }
        this.method296(arg0.length, 0, arg0, true);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(B)V")
    private final void method299(byte arg0) throws IOException {
        field658++;
        if (arg0 != 41) {
            return;
        }
        this.field670 = 0;
        if (this.field662 != this.field657) {
            this.field661.method749(this.field662, (byte) -102);
            this.field657 = this.field662;
        }
        this.field652 = this.field662;
        while (this.field670 < this.field668.length) {
            int var2 = this.field661.method747(this.field668.length - this.field670, this.field670, this.field668, -1);
            if (var2 == -1) {
                break;
            }
            this.field657 += var2;
            this.field670 += var2;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lkc;II)V")
    public class34(class93 arg0, int arg1, int arg2) throws IOException {
        this.field661 = arg0;
        this.field671 = this.field651 = arg0.method750(1);
        this.field662 = 0L;
        this.field668 = new byte[arg1];
        this.field656 = new byte[arg2];
    }
}
