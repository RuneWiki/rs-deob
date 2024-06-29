import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class55 {

    @OriginalMember(owner = "client!bj", name = "e", descriptor = "J")
    private long field966 = -1L;

    @OriginalMember(owner = "client!bj", name = "v", descriptor = "J")
    private long field983 = -1L;

    @OriginalMember(owner = "client!bj", name = "l", descriptor = "I")
    private int field973 = 0;

    @OriginalMember(owner = "client!bj", name = "u", descriptor = "Lum;")
    private class145 field982;

    @OriginalMember(owner = "client!bj", name = "j", descriptor = "J")
    private long field971;

    @OriginalMember(owner = "client!bj", name = "i", descriptor = "J")
    private long field970;

    @OriginalMember(owner = "client!bj", name = "x", descriptor = "J")
    private long field985;

    @OriginalMember(owner = "client!bj", name = "q", descriptor = "[B")
    private byte[] field978;

    @OriginalMember(owner = "client!bj", name = "m", descriptor = "[B")
    private byte[] field974;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Ljf;")
    public static class229 field963 = class212.method1457((byte) 96, " est d-Bj-9 dans votre liste d(Wamis)3");

    @OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
    public static int field969 = 0;

    @OriginalMember(owner = "client!bj", name = "t", descriptor = "Ljf;")
    public static class229 field981 = class212.method1457((byte) 66, "Abbrechen");

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "I")
    public static int field962;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "I")
    public static int field968;

    @OriginalMember(owner = "client!bj", name = "k", descriptor = "I")
    private int field972;

    @OriginalMember(owner = "client!bj", name = "n", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!bj", name = "o", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!bj", name = "p", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!bj", name = "r", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!bj", name = "s", descriptor = "I")
    public static int field980;

    @OriginalMember(owner = "client!bj", name = "w", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!bj", name = "y", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!bj", name = "f", descriptor = "J")
    private long field967;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lek;Z)V", line = 5)
    public static final void method431(class185 arg0, boolean arg1) {
        field975++;
        if (!arg1) {
            field963 = (class229) null;
        }
        class320.field5413 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(B)V", line = 34)
    public static void method432(byte arg0) {
        if (arg0 != 39) {
            method431((class185) null, true);
        }
        field981 = null;
        field963 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 47)
    private final void method433(int arg0) throws IOException {
        this.field972 = arg0;
        field977++;
        if (this.field985 != this.field967) {
            this.field982.method1006(0, this.field985);
            this.field967 = this.field985;
        }
        this.field983 = this.field985;
        while (this.field972 < this.field974.length) {
            int var2 = this.field974.length - this.field972;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field982.method1007(0, var2, this.field974, this.field972);
            if (var3 == -1) {
                break;
            }
            this.field967 += (long) var3;
            this.field972 += var3;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V", line = 91)
    public final void method434(int arg0) throws IOException {
        if (arg0 == -1) {
            this.method440(-2244);
            field964++;
            this.field982.method1009(0);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BI)V", line = 109)
    public final void method435(byte[] arg0, int arg1) throws IOException {
        if (arg1 != 8) {
            this.field970 = 22L;
        }
        this.method439(0, arg0, arg0.length, false);
        field968++;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lum;II)V", line = 580)
    public class55(class145 arg0, int arg1, int arg2) throws IOException {
        this.field982 = arg0;
        this.field970 = this.field971 = arg0.method1010(0);
        this.field985 = 0L;
        this.field978 = new byte[arg2];
        this.field974 = new byte[arg1];
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II[BI)V", line = 126)
    public final void method436(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field980++;
        try {
            if ((this.field985 + ((long) arg0)) > this.field970) {
                this.field970 = (long) arg0 + this.field985;
            }
            if (this.field966 != -1L && (this.field985 < this.field966 || ((long) this.field973 + this.field966) < this.field985)) {
                this.method440(-2244);
            }
            if ((long) arg1 != this.field966 && this.field985 + ((long) arg0) > this.field966 - -((long) this.field978.length)) {
                int var5 = (int) (-this.field985 - (-this.field966 - (long) this.field978.length));
                arg0 -= var5;
                class36.method321(arg2, arg3, this.field978, (int) (this.field985 - this.field966), var5);
                arg3 += var5;
                this.field985 += (long) var5;
                this.field973 = this.field978.length;
                this.method440(-2244);
            }
            if (this.field978.length < arg0) {
                if (this.field985 != this.field967) {
                    this.field982.method1006(~arg1, this.field985);
                    this.field967 = this.field985;
                }
                this.field982.method1005(arg3, arg1 - 125, arg0, arg2);
                this.field967 += (long) arg0;
                if (this.field967 > this.field971) {
                    this.field971 = this.field967;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field983 < (this.field985 + ((long) arg0)) && (long) arg0 + this.field985 <= (long) this.field972 + this.field983) {
                    var6 = this.field985 + ((long) arg0);
                } else if ((this.field983 + ((long) this.field972)) > this.field985 && ((long) this.field972 + this.field983) <= (this.field985 + ((long) arg0))) {
                    var6 = (long) this.field972 + this.field983;
                }
                if (this.field983 <= this.field985 && this.field985 < (long) this.field972 + this.field983) {
                    var8 = this.field985;
                } else if (this.field983 >= this.field985 && this.field983 < ((long) arg0 + this.field985)) {
                    var8 = this.field983;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class36.method321(arg2, (int) ((long) arg3 + var8 - this.field985), this.field974, (int) (var8 - this.field983), var10);
                }
                this.field985 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field966 == -1L) {
                    this.field966 = this.field985;
                }
                class36.method321(arg2, arg3, this.field978, (int) (this.field985 - this.field966), arg0);
                this.field985 += (long) arg0;
                if ((this.field985 - this.field966) > ((long) this.field973)) {
                    this.field973 = (int) (this.field985 - this.field966);
                }
            }
        } catch (IOException var12) {
            this.field967 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)J", line = 252)
    public final long method437(int arg0) {
        field965++;
        if (arg0 != 21191) {
            this.method437(-25);
        }
        return this.field970;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(JI)V", line = 266)
    public final void method438(long arg0, int arg1) throws IOException {
        field976++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method441((byte) 120));
        }
        if (arg1 >= -79) {
            this.field971 = -104L;
        }
        this.field985 = arg0;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BIZ)V", line = 285)
    public final void method439(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        field986++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg2 - arg1.length);
            }
            if (this.field966 != -1L && this.field985 >= this.field966 && (this.field985 + ((long) arg2)) <= (this.field966 + ((long) this.field973))) {
                class36.method321(this.field978, (int) (this.field985 - this.field966), arg1, arg0, arg2);
                this.field985 += (long) arg2;
                return;
            }
            if (arg3) {
                method432((byte) 82);
            }
            int var5 = arg0;
            long var6 = this.field985;
            int var8 = arg2;
            if (this.field983 <= this.field985 && ((long) this.field972 + this.field983) > this.field985) {
                int var9 = (int) (this.field983 + (long) this.field972 - this.field985);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class36.method321(this.field974, (int) (this.field985 - this.field983), arg1, arg0, var9);
                this.field985 += (long) var9;
                arg0 += var9;
            }
            if (arg2 > this.field974.length) {
                this.field982.method1006(0, this.field985);
                this.field967 = this.field985;
                while (arg2 > 0) {
                    int var10 = this.field982.method1007(0, arg2, arg1, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    this.field967 += (long) var10;
                    this.field985 += (long) var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                int var11 = arg2;
                this.method433(0);
                if (this.field972 < arg2) {
                    var11 = this.field972;
                }
                class36.method321(this.field974, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field985 += (long) var11;
                arg2 -= var11;
            }
            if (this.field966 != -1L) {
                if (this.field966 > this.field985 && arg2 > 0) {
                    int var12 = (int) (this.field966 - this.field985) + arg0;
                    if (arg0 + arg2 < var12) {
                        var12 = arg0 + arg2;
                    }
                    while (var12 > arg0) {
                        arg1[arg0++] = 0;
                        arg2--;
                        this.field985++;
                    }
                }
                long var13 = -1L;
                if ((long) this.field973 + this.field966 > var6 && (long) var8 + var6 >= (long) this.field973 + this.field966) {
                    var13 = (long) this.field973 + this.field966;
                } else if (((long) var8 + var6) > this.field966 && ((long) this.field973 + this.field966) >= ((long) var8 + var6)) {
                    var13 = (long) var8 + var6;
                }
                long var15 = -1L;
                if (this.field966 >= var6 && this.field966 < ((long) var8 + var6)) {
                    var15 = this.field966;
                } else if (this.field966 <= var6 && ((long) this.field973 + this.field966) > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class36.method321(this.field978, (int) (var15 - this.field966), arg1, (int) (var15 - var6) + var5, var17);
                    if (var13 > this.field985) {
                        arg2 = (int) ((long) arg2 - (var13 - this.field985));
                        this.field985 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field967 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V", line = 471)
    private final void method440(int arg0) throws IOException {
        field979++;
        if (arg0 != -2244 || this.field966 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field967 != this.field966) {
            this.field982.method1006(0, this.field966);
            this.field967 = this.field966;
        }
        long var4 = -1L;
        this.field982.method1005(0, -72, this.field973, this.field978);
        if (this.field983 <= this.field966 && (this.field983 + ((long) this.field972)) > this.field966) {
            var2 = this.field966;
        } else if (this.field966 <= this.field983 && this.field983 < (long) this.field973 + this.field966) {
            var2 = this.field983;
        }
        this.field967 += (long) this.field973;
        if (this.field967 > this.field971) {
            this.field971 = this.field967;
        }
        if (this.field983 < (this.field966 + ((long) this.field973)) && (long) this.field972 + this.field983 >= (long) this.field973 + this.field966) {
            var4 = (long) this.field973 + this.field966;
        } else if (this.field966 < this.field983 + ((long) this.field972) && (this.field966 + ((long) this.field973)) >= ((long) this.field972 + this.field983)) {
            var4 = (long) this.field972 + this.field983;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class36.method321(this.field978, (int) (var2 - this.field966), this.field974, (int) (var2 - this.field983), var6);
        }
        this.field973 = 0;
        this.field966 = -1L;
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(B)Ljava/io/File;", line = 549)
    private final File method441(byte arg0) {
        if (arg0 <= 7) {
            method432((byte) 72);
        }
        field984++;
        return this.field982.method1008(22173);
    }
}
