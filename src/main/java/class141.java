import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class141 {

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "J")
    private long field2012 = -1L;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "J")
    private long field2031 = -1L;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    private int field2033 = 0;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "Ljp;")
    private class199 field2015;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "J")
    private long field2014;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "J")
    private long field2009;

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "J")
    private long field2026;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[B")
    private byte[] field2016;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "[B")
    private byte[] field2032;

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[Z")
    public static boolean[] field2028 = new boolean[100];

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lbj;")
    public static class131 field2011 = new class131(50);

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2010;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    private int field2013;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field2020;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "J")
    private long field2021;

    static {
        new class442("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)Ljava/io/File;", line = 3)
    private final File method965(byte arg0) {
        field2025++;
        if (arg0 < 11) {
            field2011 = null;
        }
        return this.field2015.method1299(-1);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B[B)V", line = 16)
    public final void method966(byte arg0, byte[] arg1) throws IOException {
        this.method976(arg1, -1, 0, arg1.length);
        if (arg0 == 5) {
            field2027++;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BJ)V", line = 28)
    public final void method967(byte arg0, long arg1) throws IOException {
        if (arg0 >= -96) {
            method974(-105);
        }
        field2019++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method965((byte) 22));
        }
        this.field2026 = arg1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lpn;Lpn;I)V", line = 43)
    public static final void method968(class446 arg0, class446 arg1, int arg2) {
        if (arg0.field6251 != null) {
            arg0.method2783((byte) -122);
        }
        field2017++;
        arg0.field6254 = arg1.field6254;
        if (arg2 == -13755) {
            arg0.field6251 = arg1;
            arg0.field6251.field6254 = arg0;
            arg0.field6254.field6251 = arg0;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)J", line = 65)
    public final long method969(int arg0) {
        if (arg0 != 430) {
            method968((class446) null, (class446) null, -61);
        }
        field2022++;
        return this.field2009;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V", line = 84)
    public static final void method970(int arg0) {
        if (class99.field1378 != null) {
            class99.field1378.method2190(false);
            class117.field1679 = null;
            class99.field1378 = null;
        }
        if (arg0 != 255) {
            field2011 = null;
        }
        field2023++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljp;II)V", line = 600)
    public class141(class199 arg0, int arg1, int arg2) throws IOException {
        this.field2015 = arg0;
        this.field2009 = this.field2014 = arg0.method1303(-70);
        this.field2026 = 0L;
        this.field2016 = new byte[arg1];
        this.field2032 = new byte[arg2];
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V", line = 130)
    private final void method971(int arg0) throws IOException {
        field2010++;
        this.field2013 = arg0;
        if (this.field2026 != this.field2021) {
            this.field2015.method1300(this.field2026, (byte) 25);
            this.field2021 = this.field2026;
        }
        this.field2031 = this.field2026;
        while (this.field2016.length > this.field2013) {
            int var2 = this.field2016.length - this.field2013;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2015.method1302(this.field2013, this.field2016, var2, 0);
            if (var3 == -1) {
                break;
            }
            this.field2021 += (long) var3;
            this.field2013 += var3;
        }
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 172)
    public static void method972(int arg0) {
        int var1 = 82 / ((arg0 + 3) / 37);
        field2011 = null;
        field2028 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[BI)V", line = 185)
    public final void method973(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2030++;
        try {
            if (this.field2009 < ((long) arg0 + this.field2026)) {
                this.field2009 = this.field2026 + ((long) arg0);
            }
            if (this.field2012 != -1L && (this.field2026 < this.field2012 || (long) this.field2033 + this.field2012 < this.field2026)) {
                this.method975(3242);
            }
            if ((long) arg3 != this.field2012 && (this.field2026 + ((long) arg0)) > ((long) this.field2032.length + this.field2012)) {
                int var5 = (int) (this.field2012 + (long) this.field2032.length - this.field2026);
                class36.method344(arg2, arg1, this.field2032, (int) (this.field2026 - this.field2012), var5);
                arg0 -= var5;
                arg1 += var5;
                this.field2026 += (long) var5;
                this.field2033 = this.field2032.length;
                this.method975(3242);
            }
            if (this.field2032.length < arg0) {
                if (this.field2026 != this.field2021) {
                    this.field2015.method1300(this.field2026, (byte) 58);
                    this.field2021 = this.field2026;
                }
                this.field2015.method1301(arg1, arg2, 111, arg0);
                this.field2021 += (long) arg0;
                if (this.field2014 < this.field2021) {
                    this.field2014 = this.field2021;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2031 <= this.field2026 && (long) this.field2013 + this.field2031 > this.field2026) {
                    var6 = this.field2026;
                } else if (this.field2031 >= this.field2026 && ((long) arg0 + this.field2026) > this.field2031) {
                    var6 = this.field2031;
                }
                if ((long) arg0 + this.field2026 > this.field2031 && this.field2026 + ((long) arg0) <= (long) this.field2013 + this.field2031) {
                    var8 = (long) arg0 + this.field2026;
                } else if (this.field2026 < (long) this.field2013 + this.field2031 && (long) arg0 + this.field2026 >= this.field2031 - -((long) this.field2013)) {
                    var8 = (long) this.field2013 + this.field2031;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class36.method344(arg2, (int) ((long) arg1 + var6 - this.field2026), this.field2016, (int) (var6 - this.field2031), var10);
                }
                this.field2026 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field2012 == -1L) {
                    this.field2012 = this.field2026;
                }
                class36.method344(arg2, arg1, this.field2032, (int) (this.field2026 - this.field2012), arg0);
                this.field2026 += (long) arg0;
                if ((this.field2026 - this.field2012) > ((long) this.field2033)) {
                    this.field2033 = (int) (this.field2026 - this.field2012);
                }
            }
        } catch (IOException var12) {
            this.field2021 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 305)
    public static final void method974(int arg0) {
        class131 var1 = class251.field3543;
        synchronized (class251.field3543) {
            class251.field3543.method905((byte) 28);
        }
        if (arg0 != 0) {
            method972(-106);
        }
        field2020++;
    }

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)V", line = 326)
    private final void method975(int arg0) throws IOException {
        field2029++;
        if (this.field2012 != -1L) {
            if (this.field2021 != this.field2012) {
                this.field2015.method1300(this.field2012, (byte) 107);
                this.field2021 = this.field2012;
            }
            this.field2015.method1301(0, this.field2032, 67, this.field2033);
            this.field2021 += (long) this.field2033;
            if (this.field2021 > this.field2014) {
                this.field2014 = this.field2021;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2012 >= this.field2031 && this.field2012 < ((long) this.field2013 + this.field2031)) {
                var2 = this.field2012;
            } else if (this.field2012 <= this.field2031 && ((long) this.field2033 + this.field2012) > this.field2031) {
                var2 = this.field2031;
            }
            if (this.field2031 < (long) this.field2033 + this.field2012 && (long) this.field2013 + this.field2031 >= this.field2012 - -((long) this.field2033)) {
                var4 = (long) this.field2033 + this.field2012;
            } else if (this.field2012 < ((long) this.field2013 + this.field2031) && (long) this.field2013 + this.field2031 <= (long) this.field2033 + this.field2012) {
                var4 = (long) this.field2013 + this.field2031;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class36.method344(this.field2032, (int) (var2 - this.field2012), this.field2016, (int) (var2 - this.field2031), var6);
            }
            this.field2012 = -1L;
            this.field2033 = 0;
        }
        if (arg0 != 3242) {
            this.field2031 = 36L;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIII)V", line = 404)
    public final void method976(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2018++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field2012 != -1L && this.field2012 <= this.field2026 && (long) arg3 + this.field2026 <= (long) this.field2033 + this.field2012) {
                class36.method344(this.field2032, (int) (this.field2026 - this.field2012), arg0, arg2, arg3);
                this.field2026 += (long) arg3;
                return;
            }
            long var5 = this.field2026;
            int var7 = arg2;
            int var8 = arg3;
            if (this.field2031 <= this.field2026 && (long) this.field2013 + this.field2031 > this.field2026) {
                int var9 = (int) ((long) this.field2013 + this.field2031 - this.field2026);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class36.method344(this.field2016, (int) (this.field2026 - this.field2031), arg0, arg2, var9);
                arg2 += var9;
                arg3 -= var9;
                this.field2026 += (long) var9;
            }
            if (arg3 > this.field2016.length) {
                this.field2015.method1300(this.field2026, (byte) 27);
                this.field2021 = this.field2026;
                while (arg3 > 0) {
                    int var10 = this.field2015.method1302(arg2, arg0, arg3, ~arg1);
                    if (var10 == -1) {
                        break;
                    }
                    arg2 += var10;
                    arg3 -= var10;
                    this.field2026 += (long) var10;
                    this.field2021 += (long) var10;
                }
            } else if (arg3 > 0) {
                this.method971(0);
                int var11 = arg3;
                if (arg3 > this.field2013) {
                    var11 = this.field2013;
                }
                class36.method344(this.field2016, 0, arg0, arg2, var11);
                this.field2026 += (long) var11;
                arg2 += var11;
                arg3 -= var11;
            }
            if ((long) arg1 != this.field2012) {
                if (this.field2012 > this.field2026 && arg3 > 0) {
                    int var12 = arg2 + ((int) (this.field2012 - this.field2026));
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (var12 > arg2) {
                        arg3--;
                        arg0[arg2++] = 0;
                        this.field2026++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field2012 && var5 + ((long) var8) > this.field2012) {
                    var13 = this.field2012;
                } else if (var5 >= this.field2012 && var5 < (long) this.field2033 + this.field2012) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field2033 + this.field2012) && (long) var8 + var5 >= (long) this.field2033 + this.field2012) {
                    var15 = this.field2012 + ((long) this.field2033);
                } else if (((long) var8 + var5) > this.field2012 && this.field2012 + ((long) this.field2033) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class36.method344(this.field2032, (int) (var13 - this.field2012), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2026) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field2026));
                        this.field2026 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2021 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }
}
