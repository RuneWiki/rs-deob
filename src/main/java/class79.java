import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class79 {

    @OriginalMember(owner = "client!na", name = "f", descriptor = "I")
    private int field1984 = 0;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "J")
    private long field1985 = -1L;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "J")
    private long field1983 = -1L;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "Lk;")
    private class60 field1995;

    @OriginalMember(owner = "client!na", name = "t", descriptor = "J")
    private long field1998;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "J")
    private long field1992;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "J")
    private long field1980;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "[B")
    private byte[] field1996;

    @OriginalMember(owner = "client!na", name = "h", descriptor = "[B")
    private byte[] field1986;

    @OriginalMember(owner = "client!na", name = "p", descriptor = "I")
    public static int field1994 = 0;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "I")
    public static int field1993 = 0;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Lmc;")
    public static class75 field1979 = class30.method234(true, "sch-Utteln:");

    @OriginalMember(owner = "client!na", name = "A", descriptor = "Lmc;")
    private static class75 field2005 = class30.method234(true, "Drop");

    @OriginalMember(owner = "client!na", name = "w", descriptor = "Lmc;")
    public static class75 field2001 = field2005;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1990 = new CRC32();

    @OriginalMember(owner = "client!na", name = "D", descriptor = "Lmc;")
    private static class75 field2008 = class30.method234(true, "You are standing in a members)2only area)3");

    @OriginalMember(owner = "client!na", name = "E", descriptor = "Lmc;")
    public static class75 field2009 = field2008;

    @OriginalMember(owner = "client!na", name = "C", descriptor = "I")
    public static int field2007 = 2301979;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "I")
    private int field1982;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!na", name = "s", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!na", name = "u", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!na", name = "v", descriptor = "I")
    public static int field2000;

    @OriginalMember(owner = "client!na", name = "x", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!na", name = "y", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!na", name = "z", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!na", name = "B", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "J")
    private long field1987;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "Lnc;")
    public static class81 field1991;

    @OriginalMember(owner = "client!na", name = "F", descriptor = "[I")
    public static int[] field2010;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 8)
    public static void method669(int arg0) {
        field1990 = null;
        field1991 = null;
        field1979 = null;
        field2005 = null;
        field2010 = null;
        field2009 = null;
        if (arg0 == 6210) {
            field2008 = null;
            field2001 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([BIII)V", line = 30)
    public final void method670(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2006++;
        try {
            if (arg2 + arg3 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field1985 != -1L && this.field1980 >= this.field1985 && (long) arg3 + this.field1980 <= (long) this.field1984 + this.field1985) {
                class53.method407(this.field1986, (int) (this.field1980 - this.field1985), arg0, arg2, arg3);
                this.field1980 += arg3;
                return;
            }
            long var5 = this.field1980;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field1980 >= this.field1983 && this.field1980 < (long) this.field1982 + this.field1983) {
                int var9 = (int) (this.field1983 + (long) this.field1982 - this.field1980);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                arg3 -= var9;
                class53.method407(this.field1996, (int) (this.field1980 - this.field1983), arg0, arg2, var9);
                this.field1980 += var9;
                arg2 += var9;
            }
            if (this.field1996.length < arg3) {
                this.field1995.method485(117, this.field1980);
                this.field1987 = this.field1980;
                while (arg3 > 0) {
                    int var11 = this.field1995.method486(arg3, arg2, arg0, 126);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 += var11;
                    arg3 -= var11;
                    this.field1987 += var11;
                    this.field1980 += var11;
                }
            } else if (arg3 > 0) {
                this.method671(77);
                int var10 = arg3;
                if (this.field1982 < arg3) {
                    var10 = this.field1982;
                }
                arg3 -= var10;
                class53.method407(this.field1996, 0, arg0, arg2, var10);
                arg2 += var10;
                this.field1980 += var10;
            }
            int var12 = 62 % ((arg1 - 29) / 53);
            if (this.field1985 != -1L) {
                if (this.field1980 < this.field1985 && arg3 > 0) {
                    int var13 = (int) (this.field1985 - this.field1980) + arg2;
                    if (arg2 + arg3 < var13) {
                        var13 = arg2 + arg3;
                    }
                    while (var13 > arg2) {
                        arg0[arg2++] = 0;
                        arg3--;
                        this.field1980++;
                    }
                }
                long var14 = -1L;
                long var16 = -1L;
                if (var5 <= this.field1985 && this.field1985 < (long) var8 + var5) {
                    var16 = this.field1985;
                } else if (var5 >= this.field1985 && var5 < (long) this.field1984 + this.field1985) {
                    var16 = var5;
                }
                if ((long) this.field1984 + this.field1985 > var5 && var5 + (long) var8 >= (long) this.field1984 + this.field1985) {
                    var14 = (long) this.field1984 + this.field1985;
                } else if ((long) var8 + var5 > this.field1985 && (long) var8 + var5 <= (long) this.field1984 + this.field1985) {
                    var14 = var5 + (long) var8;
                }
                if (var16 > -1L && var14 > var16) {
                    int var18 = (int) (var14 - var16);
                    class53.method407(this.field1986, (int) (var16 - this.field1985), arg0, (int) (var16 - var5) + var7, var18);
                    if (this.field1980 < var14) {
                        arg3 = (int) ((long) arg3 + this.field1980 - var14);
                        this.field1980 = var14;
                    }
                }
            }
        } catch (IOException var20) {
            this.field1987 = -1L;
            throw var20;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "(Lk;II)V", line = 574)
    public class79(class60 arg0, int arg1, int arg2) throws IOException {
        this.field1995 = arg0;
        this.field1992 = this.field1998 = arg0.method483(-6351);
        this.field1980 = 0L;
        this.field1996 = new byte[arg1];
        this.field1986 = new byte[arg2];
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V", line = 226)
    private final void method671(int arg0) throws IOException {
        field2002++;
        this.field1982 = 0;
        if (this.field1987 != this.field1980) {
            this.field1995.method485(119, this.field1980);
            this.field1987 = this.field1980;
        }
        if (arg0 <= 42) {
            return;
        }
        this.field1983 = this.field1980;
        while (this.field1982 < this.field1996.length) {
            int var2 = this.field1995.method486(this.field1996.length - this.field1982, this.field1982, this.field1996, -108);
            if (var2 == -1) {
                break;
            }
            this.field1982 += var2;
            this.field1987 += var2;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(JI)V", line = 264)
    public final void method672(long arg0, int arg1) {
        field2000++;
        if (arg0 >= (long) arg1) {
            this.field1980 = arg0;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 295)
    public final void method673(byte arg0) throws IOException {
        int var2 = 108 % ((-arg0 - 52) / 37);
        this.method675(true);
        this.field1995.method482(-29352);
        field1989++;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(II[BI)V", line = 311)
    public final void method674(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1988++;
        try {
            if (arg3 != -1523) {
                this.method672(41L, -124);
            }
            if (this.field1992 < (long) arg0 + this.field1980) {
                this.field1992 = (long) arg0 + this.field1980;
            }
            if (this.field1985 != -1L && (this.field1980 < this.field1985 || this.field1985 + (long) this.field1984 < this.field1980)) {
                this.method675(true);
            }
            if (this.field1985 != -1L && (long) arg0 + this.field1980 > (long) this.field1986.length + this.field1985) {
                int var5 = (int) ((long) this.field1986.length + this.field1985 - this.field1980);
                class53.method407(arg2, arg1, this.field1986, (int) (this.field1980 - this.field1985), var5);
                arg1 += var5;
                this.field1980 += var5;
                arg0 -= var5;
                this.field1984 = this.field1986.length;
                this.method675(true);
            }
            if (arg0 > this.field1986.length) {
                long var6 = -1L;
                if (this.field1987 != this.field1980) {
                    this.field1995.method485(116, this.field1980);
                    this.field1987 = this.field1980;
                }
                long var8 = -1L;
                this.field1995.method487((byte) -12, arg2, arg0, arg1);
                if (this.field1983 <= this.field1980 && this.field1980 < (long) this.field1982 + this.field1983) {
                    var6 = this.field1980;
                } else if (this.field1983 >= this.field1980 && this.field1980 + (long) arg0 > this.field1983) {
                    var6 = this.field1983;
                }
                this.field1987 += arg0;
                if (this.field1983 < (long) arg0 + this.field1980 && (long) arg0 + this.field1980 <= (long) this.field1982 + this.field1983) {
                    var8 = this.field1980 + (long) arg0;
                } else if (this.field1980 < (long) this.field1982 + this.field1983 && (long) this.field1982 + this.field1983 <= (long) arg0 + this.field1980) {
                    var8 = (long) this.field1982 + this.field1983;
                }
                if (this.field1987 > this.field1998) {
                    this.field1998 = this.field1987;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class53.method407(arg2, (int) (var6 + (long) arg1 - this.field1980), this.field1996, (int) (var6 - this.field1983), var10);
                }
                this.field1980 += arg0;
            } else if (arg0 > 0) {
                if (this.field1985 == -1L) {
                    this.field1985 = this.field1980;
                }
                class53.method407(arg2, arg1, this.field1986, (int) (this.field1980 - this.field1985), arg0);
                this.field1980 += arg0;
                if ((long) this.field1984 < this.field1980 - this.field1985) {
                    this.field1984 = (int) (this.field1980 - this.field1985);
                }
            }
        } catch (IOException var12) {
            this.field1987 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V", line = 465)
    private final void method675(boolean arg0) throws IOException {
        field2003++;
        if (this.field1985 != -1L) {
            if (this.field1987 != this.field1985) {
                this.field1995.method485(127, this.field1985);
                this.field1987 = this.field1985;
            }
            this.field1995.method487((byte) -27, this.field1986, this.field1984, 0);
            long var2 = -1L;
            this.field1987 += this.field1984;
            long var4 = -1L;
            if (this.field1987 > this.field1998) {
                this.field1998 = this.field1987;
            }
            if (this.field1985 + (long) this.field1984 > this.field1983 && this.field1985 + (long) this.field1984 <= (long) this.field1982 + this.field1983) {
                var4 = (long) this.field1984 + this.field1985;
            } else if (this.field1985 < (long) this.field1982 + this.field1983 && this.field1983 + (long) this.field1982 <= (long) this.field1984 + this.field1985) {
                var4 = (long) this.field1982 + this.field1983;
            }
            if (this.field1983 <= this.field1985 && this.field1985 < (long) this.field1982 + this.field1983) {
                var2 = this.field1985;
            } else if (this.field1985 <= this.field1983 && this.field1983 < this.field1985 + (long) this.field1984) {
                var2 = this.field1983;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class53.method407(this.field1986, (int) (var2 - this.field1985), this.field1996, (int) (var2 - this.field1983), var6);
            }
            this.field1984 = 0;
            this.field1985 = -1L;
        }
        if (!arg0) {
            this.field1985 = -96L;
        }
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(Z)J", line = 541)
    public final long method676(boolean arg0) {
        if (arg0) {
            this.method672(33L, -55);
        }
        field1997++;
        return this.field1992;
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V", line = 563)
    public static final void method677(byte arg0) {
        class1.method1(false, (byte) -80, 0, null);
        field1999++;
        if (arg0 > -35) {
            field2008 = null;
        }
    }
}
