import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class221 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    private int field4014 = 0;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "J")
    private long field4018 = -1L;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "J")
    private long field4015 = -1L;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "Lfg;")
    private class230 field4038;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "J")
    private long field4026;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "J")
    private long field4035;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "J")
    private long field4028;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "[B")
    private byte[] field4016;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "[B")
    private byte[] field4013;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field4017 = 0;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "Lhh;")
    public static class163 field4019 = class137.method1065("scrollen:", 17);

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    public static int field4022;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    private int field4024;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
    public static int field4025;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "J")
    private long field4021;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "Lhk;")
    public static class105 field4037;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lv;")
    public static class22 field4012;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "Lv;")
    public static class22 field4031;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Z")
    public static boolean field4030;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    private final void method1560(byte arg0) throws IOException {
        field4033++;
        if (arg0 >= -64) {
            method1561(88, (byte) -107, -29, 42);
        }
        if (this.field4018 == -1L) {
            return;
        }
        if (this.field4021 != this.field4018) {
            this.field4038.method1599(this.field4018, (byte) 124);
            this.field4021 = this.field4018;
        }
        this.field4038.method1600(this.field4014, this.field4016, 90, 0);
        this.field4021 += (long) this.field4014;
        if (this.field4021 > this.field4026) {
            this.field4026 = this.field4021;
        }
        long var2 = -1L;
        if (this.field4018 >= this.field4015 && this.field4018 < (long) this.field4024 + this.field4015) {
            var2 = this.field4018;
        } else if (this.field4018 <= this.field4015 && (long) this.field4014 + this.field4018 > this.field4015) {
            var2 = this.field4015;
        }
        long var4 = -1L;
        if ((long) this.field4014 + this.field4018 > this.field4015 && (long) this.field4014 + this.field4018 <= (long) this.field4024 + this.field4015) {
            var4 = (long) this.field4014 + this.field4018;
        } else if (this.field4018 < (long) this.field4024 + this.field4015 && ((long) this.field4014 + this.field4018) >= ((long) this.field4024 + this.field4015)) {
            var4 = (long) this.field4024 + this.field4015;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class241.method1667(this.field4016, (int) (var2 - this.field4018), this.field4013, (int) (var2 - this.field4015), var6);
        }
        this.field4014 = 0;
        this.field4018 = -1L;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBII)I")
    public static final int method1561(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -42) {
            field4037 = null;
        }
        field4029++;
        if (arg2 >= arg0) {
            return arg3 < arg2 ? arg3 : arg2;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public final void method1562(int arg0) throws IOException {
        this.method1560((byte) -116);
        this.field4038.method1603(arg0);
        field4027++;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BZII)V")
    public final void method1563(byte[] arg0, boolean arg1, int arg2, int arg3) throws IOException {
        field4034++;
        if (!arg1) {
            return;
        }
        try {
            if (arg0.length < (arg3 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg2 - arg0.length);
            }
            if (this.field4018 != -1L && this.field4018 <= this.field4028 && this.field4028 + ((long) arg2) <= (long) this.field4014 + this.field4018) {
                class241.method1667(this.field4016, (int) (this.field4028 - this.field4018), arg0, arg3, arg2);
                this.field4028 += (long) arg2;
                return;
            }
            long var5 = this.field4028;
            int var7 = arg3;
            int var8 = arg2;
            if (this.field4028 >= this.field4015 && this.field4028 < ((long) this.field4024 + this.field4015)) {
                int var9 = (int) (this.field4015 + (long) this.field4024 - this.field4028);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class241.method1667(this.field4013, (int) (this.field4028 - this.field4015), arg0, arg3, var9);
                arg2 -= var9;
                arg3 += var9;
                this.field4028 += (long) var9;
            }
            if (this.field4013.length < arg2) {
                this.field4038.method1599(this.field4028, (byte) 8);
                this.field4021 = this.field4028;
                while (arg2 > 0) {
                    int var11 = this.field4038.method1598(arg0, 1, arg3, arg2);
                    if (var11 == -1) {
                        break;
                    }
                    arg2 -= var11;
                    this.field4021 += (long) var11;
                    this.field4028 += (long) var11;
                    arg3 += var11;
                }
            } else if (arg2 > 0) {
                this.method1564(false);
                int var10 = arg2;
                if (this.field4024 < arg2) {
                    var10 = this.field4024;
                }
                class241.method1667(this.field4013, 0, arg0, arg3, var10);
                arg2 -= var10;
                this.field4028 += (long) var10;
                arg3 += var10;
            }
            if (this.field4018 != -1L) {
                if (this.field4028 < this.field4018 && arg2 > 0) {
                    int var12 = (int) (this.field4018 - this.field4028) + arg3;
                    if (var12 > (arg3 + arg2)) {
                        var12 = arg3 + arg2;
                    }
                    while (arg3 < var12) {
                        arg2--;
                        arg0[arg3++] = 0;
                        this.field4028++;
                    }
                }
                long var13 = -1L;
                if (((long) this.field4014 + this.field4018) > var5 && this.field4018 + ((long) this.field4014) <= (long) var8 + var5) {
                    var13 = (long) this.field4014 + this.field4018;
                } else if (this.field4018 < var5 + ((long) var8) && ((long) this.field4014 + this.field4018) >= (var5 + ((long) var8))) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field4018 >= var5 && this.field4018 < (var5 + ((long) var8))) {
                    var15 = this.field4018;
                } else if (this.field4018 <= var5 && var5 < (long) this.field4014 + this.field4018) {
                    var15 = var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class241.method1667(this.field4016, (int) (var15 - this.field4018), arg0, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field4028) {
                        arg2 = (int) ((long) arg2 - (var13 - this.field4028));
                        this.field4028 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4021 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z)V")
    private final void method1564(boolean arg0) throws IOException {
        field4020++;
        if (arg0) {
            method1566((byte) 21);
        }
        this.field4024 = 0;
        if (this.field4028 != this.field4021) {
            this.field4038.method1599(this.field4028, (byte) -113);
            this.field4021 = this.field4028;
        }
        this.field4015 = this.field4028;
        while (this.field4013.length > this.field4024) {
            int var2 = this.field4013.length - this.field4024;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4038.method1598(this.field4013, 1, this.field4024, var2);
            if (var3 == -1) {
                break;
            }
            this.field4024 += var3;
            this.field4021 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)J")
    public final long method1565(byte arg0) {
        if (arg0 != -75) {
            this.method1567(true);
        }
        field4023++;
        return this.field4035;
    }

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(B)V")
    public static void method1566(byte arg0) {
        field4037 = null;
        field4012 = null;
        field4019 = null;
        if (arg0 <= 119) {
            method1566((byte) 25);
        }
        field4031 = null;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)Ljava/io/File;")
    private final File method1567(boolean arg0) {
        if (!arg0) {
            this.method1567(true);
        }
        field4036++;
        return this.field4038.method1601(-2);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BIII)V")
    public final void method1568(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field4022++;
        try {
            if (this.field4035 < (long) arg3 + this.field4028) {
                this.field4035 = (long) arg3 + this.field4028;
            }
            if (this.field4018 != -1L && (this.field4028 < this.field4018 || this.field4028 > (long) this.field4014 + this.field4018)) {
                this.method1560((byte) -69);
            }
            if (this.field4018 != -1L && this.field4028 + ((long) arg3) > (long) this.field4016.length + this.field4018) {
                int var5 = (int) ((long) this.field4016.length + this.field4018 - this.field4028);
                class241.method1667(arg0, arg1, this.field4016, (int) (this.field4028 - this.field4018), var5);
                this.field4028 += (long) var5;
                arg1 += var5;
                arg3 -= var5;
                this.field4014 = this.field4016.length;
                this.method1560((byte) -114);
            }
            if (arg3 > this.field4016.length) {
                long var6 = -1L;
                if (this.field4028 != this.field4021) {
                    this.field4038.method1599(this.field4028, (byte) 124);
                    this.field4021 = this.field4028;
                }
                this.field4038.method1600(arg3, arg0, 67, arg1);
                this.field4021 += (long) arg3;
                if (this.field4028 >= this.field4015 && this.field4028 < (this.field4015 + ((long) this.field4024))) {
                    var6 = this.field4028;
                } else if (this.field4028 <= this.field4015 && this.field4015 < (long) arg3 + this.field4028) {
                    var6 = this.field4015;
                }
                if (this.field4026 < this.field4021) {
                    this.field4026 = this.field4021;
                }
                long var8 = -1L;
                if ((long) arg3 + this.field4028 > this.field4015 && (long) this.field4024 + this.field4015 >= this.field4028 - -((long) arg3)) {
                    var8 = (long) arg3 + this.field4028;
                } else if ((long) this.field4024 + this.field4015 > this.field4028 && this.field4028 + ((long) arg3) >= (long) this.field4024 + this.field4015) {
                    var8 = this.field4015 + ((long) this.field4024);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class241.method1667(arg0, (int) ((long) arg1 + var6 - this.field4028), this.field4013, (int) (var6 - this.field4015), var10);
                }
                this.field4028 += (long) arg3;
                return;
            }
            if (arg3 > 0) {
                if (this.field4018 == -1L) {
                    this.field4018 = this.field4028;
                }
                class241.method1667(arg0, arg1, this.field4016, (int) (this.field4028 - this.field4018), arg3);
                this.field4028 += (long) arg3;
                if (this.field4028 - this.field4018 > (long) this.field4014) {
                    this.field4014 = (int) (this.field4028 - this.field4018);
                }
                return;
            }
        } catch (IOException var12) {
            this.field4021 = -1L;
            throw var12;
        }
        if (arg2 > -63) {
            this.field4028 = 19L;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(JB)V")
    public final void method1569(long arg0, byte arg1) throws IOException {
        field4025++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1567(true));
        }
        this.field4028 = arg0;
        if (arg1 != 79) {
            this.field4014 = 77;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([BI)V")
    public final void method1570(byte[] arg0, int arg1) throws IOException {
        field4032++;
        this.method1563(arg0, true, arg0.length, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lfg;II)V")
    public class221(class230 arg0, int arg1, int arg2) throws IOException {
        this.field4038 = arg0;
        this.field4035 = this.field4026 = arg0.method1602(95);
        this.field4028 = 0L;
        this.field4016 = new byte[arg2];
        this.field4013 = new byte[arg1];
    }
}
