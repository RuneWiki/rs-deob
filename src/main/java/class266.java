import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class266 {

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "J")
    private long field3973 = -1L;

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    private int field3977 = 0;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "J")
    private long field3972 = -1L;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "La;")
    private class275 field3976;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "J")
    private long field3982;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "J")
    private long field3987;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "J")
    private long field3986;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "[B")
    private byte[] field3985;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "[B")
    private byte[] field3969;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "Lta;")
    public static class197 field3983 = new class197(50);

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "[I")
    public static int[] field3990 = new int[100];

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    private int field3975;

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "J")
    private long field3979;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JI)V", line = 5)
    public final void method1837(long arg0, int arg1) throws IOException {
        field3980++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1844(-1));
        }
        this.field3986 = arg0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II[BI)V", line = 17)
    public final void method1838(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3978++;
        try {
            if (this.field3987 < (this.field3986 + ((long) arg0))) {
                this.field3987 = this.field3986 + ((long) arg0);
            }
            if (this.field3972 != -1L && (this.field3972 > this.field3986 || (long) this.field3977 + this.field3972 < this.field3986)) {
                this.method1842((byte) -52);
            }
            if (this.field3972 != -1L && (long) this.field3985.length + this.field3972 < (long) arg0 + this.field3986) {
                int var5 = (int) ((long) this.field3985.length + this.field3972 - this.field3986);
                class151.method1117(arg2, arg1, this.field3985, (int) (this.field3986 - this.field3972), var5);
                this.field3986 += (long) var5;
                this.field3977 = this.field3985.length;
                arg1 += var5;
                this.method1842((byte) -77);
                arg0 -= var5;
            }
            if (arg0 > this.field3985.length) {
                if (this.field3986 != this.field3979) {
                    this.field3976.method1922(this.field3986, (byte) 108);
                    this.field3979 = this.field3986;
                }
                long var6 = -1L;
                long var8 = -1L;
                this.field3976.method1920(1709, arg0, arg1, arg2);
                if (this.field3973 < (this.field3986 + ((long) arg0)) && (long) arg0 + this.field3986 <= this.field3973 - -((long) this.field3975)) {
                    var8 = (long) arg0 + this.field3986;
                } else if (this.field3986 < (long) this.field3975 + this.field3973 && (this.field3973 + ((long) this.field3975)) <= ((long) arg0 + this.field3986)) {
                    var8 = this.field3973 + ((long) this.field3975);
                }
                this.field3979 += (long) arg0;
                if (this.field3973 <= this.field3986 && (long) this.field3975 + this.field3973 > this.field3986) {
                    var6 = this.field3986;
                } else if (this.field3973 >= this.field3986 && (this.field3986 + ((long) arg0)) > this.field3973) {
                    var6 = this.field3973;
                }
                if (this.field3982 < this.field3979) {
                    this.field3982 = this.field3979;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class151.method1117(arg2, (int) ((long) arg1 - (this.field3986 - var6)), this.field3969, (int) (var6 - this.field3973), var10);
                }
                this.field3986 += (long) arg0;
                return;
            }
            if (arg0 > 0) {
                if (this.field3972 == -1L) {
                    this.field3972 = this.field3986;
                }
                class151.method1117(arg2, arg1, this.field3985, (int) (this.field3986 - this.field3972), arg0);
                this.field3986 += (long) arg0;
                if ((long) this.field3977 < this.field3986 - this.field3972) {
                    this.field3977 = (int) (this.field3986 - this.field3972);
                }
                return;
            }
        } catch (IOException var12) {
            this.field3979 = -1L;
            throw var12;
        }
        if (arg3 != -1) {
            method1841((byte) 96);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I[BII)V", line = 137)
    public final void method1839(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field3984++;
        try {
            if (arg1.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg1.length);
            }
            if (this.field3972 != -1L && this.field3986 >= this.field3972 && (this.field3986 + ((long) arg2)) <= ((long) this.field3977 + this.field3972)) {
                class151.method1117(this.field3985, (int) (this.field3986 - this.field3972), arg1, arg3, arg2);
                this.field3986 += (long) arg2;
                return;
            }
            int var5 = arg3;
            long var6 = this.field3986;
            int var8 = arg2;
            if (this.field3973 <= this.field3986 && (long) this.field3975 + this.field3973 > this.field3986) {
                int var9 = (int) ((long) this.field3975 + this.field3973 - this.field3986);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class151.method1117(this.field3969, (int) (this.field3986 - this.field3973), arg1, arg3, var9);
                arg2 -= var9;
                arg3 += var9;
                this.field3986 += (long) var9;
            }
            if (this.field3969.length < arg2) {
                this.field3976.method1922(this.field3986, (byte) 122);
                this.field3979 = this.field3986;
                while (arg2 > 0) {
                    int var11 = this.field3976.method1919(arg1, 0, arg2, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    arg3 += var11;
                    this.field3986 += (long) var11;
                    this.field3979 += (long) var11;
                }
            } else if (arg2 > 0) {
                this.method1840(-112);
                int var10 = arg2;
                if (this.field3975 < arg2) {
                    var10 = this.field3975;
                }
                arg2 -= var10;
                class151.method1117(this.field3969, 0, arg1, arg3, var10);
                this.field3986 += (long) var10;
                arg3 += var10;
            }
            if (this.field3972 != -1L) {
                if (this.field3972 > this.field3986 && arg2 > 0) {
                    int var12 = arg3 + ((int) (this.field3972 - this.field3986));
                    if (var12 > (arg3 + arg2)) {
                        var12 = arg2 + arg3;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg1[arg3++] = 0;
                        this.field3986++;
                    }
                }
                long var13 = -1L;
                if (this.field3972 >= var6 && ((long) var8 + var6) > this.field3972) {
                    var13 = this.field3972;
                } else if (this.field3972 <= var6 && (long) this.field3977 + this.field3972 > var6) {
                    var13 = var6;
                }
                long var15 = -1L;
                if (var6 < ((long) this.field3977 + this.field3972) && (long) var8 + var6 >= this.field3972 - -((long) this.field3977)) {
                    var15 = (long) this.field3977 + this.field3972;
                } else if (this.field3972 < (long) var8 + var6 && ((long) this.field3977 + this.field3972) >= ((long) var8 + var6)) {
                    var15 = var6 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class151.method1117(this.field3985, (int) (var13 - this.field3972), arg1, (int) (var13 - var6) + var5, var17);
                    if (this.field3986 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field3986));
                        this.field3986 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3979 = -1L;
            throw var19;
        }
        if (arg0 > ~arg2) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V", line = 326)
    private final void method1840(int arg0) throws IOException {
        field3967++;
        this.field3975 = 0;
        if (this.field3986 != this.field3979) {
            this.field3976.method1922(this.field3986, (byte) 125);
            this.field3979 = this.field3986;
        }
        this.field3973 = this.field3986;
        if (arg0 >= -90) {
            return;
        }
        while (this.field3975 < this.field3969.length) {
            int var2 = this.field3969.length - this.field3975;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3976.method1919(this.field3969, 0, var2, this.field3975);
            if (var3 == -1) {
                break;
            }
            this.field3979 += (long) var3;
            this.field3975 += var3;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V", line = 379)
    public static void method1841(byte arg0) {
        field3983 = null;
        field3990 = null;
        if (arg0 >= -16) {
            method1845(1);
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V", line = 392)
    private final void method1842(byte arg0) throws IOException {
        field3974++;
        if (this.field3972 != -1L) {
            long var2 = -1L;
            if (this.field3979 != this.field3972) {
                this.field3976.method1922(this.field3972, (byte) 114);
                this.field3979 = this.field3972;
            }
            this.field3976.method1920(1709, this.field3977, 0, this.field3985);
            this.field3979 += (long) this.field3977;
            if (this.field3979 > this.field3982) {
                this.field3982 = this.field3979;
            }
            if (this.field3973 <= this.field3972 && this.field3972 < (long) this.field3975 + this.field3973) {
                var2 = this.field3972;
            } else if (this.field3973 >= this.field3972 && this.field3973 < (long) this.field3977 + this.field3972) {
                var2 = this.field3973;
            }
            long var4 = -1L;
            if (this.field3973 < (long) this.field3977 + this.field3972 && ((long) this.field3977 + this.field3972) <= ((long) this.field3975 + this.field3973)) {
                var4 = (long) this.field3977 + this.field3972;
            } else if (this.field3972 < this.field3973 + ((long) this.field3975) && (long) this.field3975 + this.field3973 <= (long) this.field3977 + this.field3972) {
                var4 = (long) this.field3975 + this.field3973;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class151.method1117(this.field3985, (int) (var2 - this.field3972), this.field3969, (int) (var2 - this.field3973), var6);
            }
            this.field3972 = -1L;
            this.field3977 = 0;
        }
        if (arg0 > -46) {
            field3983 = (class197) null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)J", line = 469)
    public final long method1843(boolean arg0) {
        if (arg0) {
            this.field3985 = (byte[]) null;
        }
        field3971++;
        return this.field3987;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Ljava/io/File;", line = 484)
    private final File method1844(int arg0) {
        if (arg0 != -1) {
            method1841((byte) 96);
        }
        field3970++;
        return this.field3976.method1924((byte) 118);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(La;II)V", line = 628)
    public class266(class275 arg0, int arg1, int arg2) throws IOException {
        this.field3976 = arg0;
        this.field3987 = this.field3982 = arg0.method1923(69);
        this.field3986 = 0L;
        this.field3985 = new byte[arg2];
        this.field3969 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V", line = 498)
    public static final void method1845(int arg0) {
        field3981++;
        int var1 = class64.field956.method426(class272.field4119);
        for (int var2 = 0; var2 < class6.field62; var2++) {
            int var3 = class64.field956.method426(class189.method1365(false, var2));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class6.field62 * 15 + 21;
        int var5 = class199.field3151;
        int var6 = class322.field5002 - (var1 / 2);
        if (class210.field3314 < var4 + var5) {
            var5 = class210.field3314 - var4;
        }
        if (var1 + var6 > class125.field1972) {
            var6 = class125.field1972 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class278.field4265 == 1) {
            if (class322.field5002 == class187.field2982 && class273.field4138 == class199.field3151) {
                class67.field982 = true;
                class62.field936 = class6.field62 * 15 + (class285.field4395 ? 26 : 22);
                class327.field5074 = var1;
                class143.field2208 = var5;
                class278.field4265 = 0;
                class253.field3776 = var6;
            }
        } else if (class97.field1446 == class322.field5002 && class38.field573 == class199.field3151) {
            class62.field936 = class6.field62 * 15 + (class285.field4395 ? 26 : 22);
            class67.field982 = true;
            class278.field4265 = 0;
            class327.field5074 = var1;
            class143.field2208 = var5;
            class253.field3776 = var6;
        } else {
            class273.field4138 = class38.field573;
            class278.field4265 = 1;
            class187.field2982 = class97.field1446;
        }
        int var7 = -82 / ((arg0 + 39) / 54);
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V", line = 603)
    public final void method1846(byte arg0) throws IOException {
        this.method1842((byte) -125);
        int var2 = -80 / ((arg0 + 12) / 60);
        this.field3976.method1921(0);
        field3989++;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B[B)V", line = 617)
    public final void method1847(byte arg0, byte[] arg1) throws IOException {
        this.method1839(-1, arg1, arg1.length, 0);
        field3968++;
        if (arg0 != -49) {
            this.field3979 = 127L;
        }
    }
}
