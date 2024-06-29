import java.awt.Canvas;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class258 {

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "J")
    private long field4500 = -1L;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    private int field4486 = 0;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "J")
    private long field4497 = -1L;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Ltk;")
    private class159 field4490;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "J")
    private long field4501;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "J")
    private long field4493;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "[B")
    private byte[] field4511;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[B")
    private byte[] field4492;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "J")
    private long field4514;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lha;")
    public static class46 field4494 = class271.method1828("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", -46);

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field4506 = 2;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "Lha;")
    public static class46 field4509 = class271.method1828("welle:", -46);

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "[I")
    public static int[] field4498 = new int[5];

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "Lha;")
    public static class46 field4513 = class271.method1828("leuchten2:", -46);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    private int field4488;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "J")
    private long field4502;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field4508;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "[[[I")
    public static int[][][] field4491;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)Lhh;")
    public static final class263 method1724(int arg0) {
        field4489++;
        int var1 = class219.field3858[0] * class118.field2209[arg0];
        byte[] var2 = class273.field4765[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class107.field1980[class50.method369(var2[var4], 255)];
        }
        class21 var5 = new class21(class222.field3911, class3.field45, class56.field939[0], class215.field3816[0], class219.field3858[0], class118.field2209[0], var3);
        class242.method1661(arg0 ^ 0x7418);
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)J")
    public final long method1725(int arg0) {
        field4510++;
        if (arg0 != 12742) {
            method1730((byte) -110);
        }
        return this.field4493;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[B)V")
    public final void method1726(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -20667) {
            return;
        }
        field4505++;
        try {
            if (arg1 + arg2 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg3.length);
            }
            if (this.field4500 != -1L && this.field4500 <= this.field4514 && ((long) arg2 + this.field4514) <= ((long) this.field4486 + this.field4500)) {
                class104.method782(this.field4492, (int) (this.field4514 - this.field4500), arg3, arg1, arg2);
                this.field4514 += (long) arg2;
                return;
            }
            long var5 = this.field4514;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field4497 <= this.field4514 && this.field4514 < ((long) this.field4488 + this.field4497)) {
                int var9 = (int) (this.field4497 + (long) this.field4488 - this.field4514);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class104.method782(this.field4511, (int) (this.field4514 - this.field4497), arg3, arg1, var9);
                arg1 += var9;
                this.field4514 += (long) var9;
            }
            if (this.field4511.length < arg2) {
                this.field4490.method1165(arg0 + 5809, this.field4514);
                this.field4502 = this.field4514;
                while (arg2 > 0) {
                    int var10 = this.field4490.method1167(-30019, arg3, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4514 += (long) var10;
                    arg2 -= var10;
                    arg1 += var10;
                    this.field4502 += (long) var10;
                }
            } else if (arg2 > 0) {
                this.method1729(28284);
                int var11 = arg2;
                if (this.field4488 < arg2) {
                    var11 = this.field4488;
                }
                class104.method782(this.field4511, 0, arg3, arg1, var11);
                this.field4514 += (long) var11;
                arg2 -= var11;
                arg1 += var11;
            }
            if (this.field4500 != -1L) {
                if (this.field4514 < this.field4500 && arg2 > 0) {
                    int var12 = (int) (this.field4500 - this.field4514) + arg1;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (arg1 < var12) {
                        arg2--;
                        arg3[arg1++] = 0;
                        this.field4514++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < (long) this.field4486 + this.field4500 && ((long) this.field4486 + this.field4500) <= ((long) var7 + var5)) {
                    var13 = (long) this.field4486 + this.field4500;
                } else if (this.field4500 < (long) var7 + var5 && ((long) this.field4486 + this.field4500) >= ((long) var7 + var5)) {
                    var13 = (long) var7 + var5;
                }
                if (var5 <= this.field4500 && this.field4500 < (var5 + ((long) var7))) {
                    var15 = this.field4500;
                } else if (this.field4500 <= var5 && ((long) this.field4486 + this.field4500) > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class104.method782(this.field4492, (int) (var15 - this.field4500), arg3, (int) (var15 - var5) + var8, var17);
                    if (this.field4514 < var13) {
                        arg2 = (int) ((long) arg2 - (var13 - this.field4514));
                        this.field4514 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4502 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method1727(int arg0) {
        field4507++;
        return arg0 == -27315 ? this.field4490.method1168(-8616) : null;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)V")
    private final void method1728(int arg0) throws IOException {
        field4487++;
        if (arg0 < 77 || this.field4500 == -1L) {
            return;
        }
        if (this.field4502 != this.field4500) {
            this.field4490.method1165(-14858, this.field4500);
            this.field4502 = this.field4500;
        }
        this.field4490.method1164(this.field4486, 0, -28438, this.field4492);
        this.field4502 += (long) this.field4486;
        if (this.field4502 > this.field4501) {
            this.field4501 = this.field4502;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (((long) this.field4486 + this.field4500) > this.field4497 && this.field4497 + ((long) this.field4488) >= (long) this.field4486 + this.field4500) {
            var2 = (long) this.field4486 + this.field4500;
        } else if (this.field4500 < (long) this.field4488 + this.field4497 && this.field4500 + ((long) this.field4486) >= (long) this.field4488 + this.field4497) {
            var2 = (long) this.field4488 + this.field4497;
        }
        if (this.field4500 >= this.field4497 && (long) this.field4488 + this.field4497 > this.field4500) {
            var4 = this.field4500;
        } else if (this.field4500 <= this.field4497 && ((long) this.field4486 + this.field4500) > this.field4497) {
            var4 = this.field4497;
        }
        if (var4 > -1L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class104.method782(this.field4492, (int) (var4 - this.field4500), this.field4511, (int) (var4 - this.field4497), var6);
        }
        this.field4500 = -1L;
        this.field4486 = 0;
    }

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "(I)V")
    private final void method1729(int arg0) throws IOException {
        field4496++;
        this.field4488 = 0;
        if (this.field4514 != this.field4502) {
            this.field4490.method1165(-14858, this.field4514);
            this.field4502 = this.field4514;
        }
        this.field4497 = this.field4514;
        while (this.field4511.length > this.field4488) {
            int var2 = this.field4511.length - this.field4488;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4490.method1167(arg0 - 58303, this.field4511, this.field4488, var2);
            if (var3 == -1) {
                break;
            }
            this.field4488 += var3;
            this.field4502 += (long) var3;
        }
        if (arg0 != 28284) {
            method1732(101);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)V")
    public static void method1730(byte arg0) {
        field4491 = null;
        field4513 = null;
        field4508 = null;
        field4509 = null;
        int var1 = 47 % ((arg0 + 57) / 40);
        field4494 = null;
        field4498 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class249 var7 = new class249();
        var7.field4395 = arg1 / 128;
        var7.field4410 = arg2 / 128;
        var7.field4402 = arg3 / 128;
        var7.field4407 = arg4 / 128;
        var7.field4413 = arg0;
        var7.field4408 = arg1;
        var7.field4409 = arg2;
        var7.field4397 = arg3;
        var7.field4394 = arg4;
        var7.field4406 = arg5;
        var7.field4405 = arg6;
        class138.field2480[class54.field924++] = var7;
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(I)V")
    public static final void method1732(int arg0) {
        class173.field3093 = arg0;
        for (int var1 = 0; var1 < class173.field3076; var1++) {
            for (int var2 = 0; var2 < class128.field2359; var2++) {
                if (class111.field2080[arg0][var1][var2] == null) {
                    class111.field2080[arg0][var1][var2] = new class201(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(I)V")
    public final void method1733(int arg0) throws IOException {
        this.method1728(arg0 ^ 0x54);
        this.field4490.method1163(false);
        if (arg0 != 0) {
            this.field4497 = -2L;
        }
        field4512++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "([BI)V")
    public final void method1734(byte[] arg0, int arg1) throws IOException {
        field4499++;
        this.method1726(-20667, arg1, arg0.length, arg0);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II[BZ)V")
    public final void method1735(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field4495++;
        try {
            if (this.field4493 < (long) arg0 + this.field4514) {
                this.field4493 = (long) arg0 + this.field4514;
            }
            if (this.field4500 != -1L && (this.field4500 > this.field4514 || (long) this.field4486 + this.field4500 < this.field4514)) {
                this.method1728(83);
            }
            if (this.field4500 != -1L && ((long) this.field4492.length + this.field4500) < ((long) arg0 + this.field4514)) {
                int var5 = (int) ((long) this.field4492.length + this.field4500 - this.field4514);
                arg0 -= var5;
                class104.method782(arg2, arg1, this.field4492, (int) (this.field4514 - this.field4500), var5);
                this.field4514 += (long) var5;
                arg1 += var5;
                this.field4486 = this.field4492.length;
                this.method1728(80);
            }
            if (!arg3) {
                if (this.field4492.length < arg0) {
                    if (this.field4514 != this.field4502) {
                        this.field4490.method1165(-14858, this.field4514);
                        this.field4502 = this.field4514;
                    }
                    this.field4490.method1164(arg0, arg1, -28438, arg2);
                    this.field4502 += (long) arg0;
                    if (this.field4501 < this.field4502) {
                        this.field4501 = this.field4502;
                    }
                    long var6 = -1L;
                    if ((long) arg0 + this.field4514 > this.field4497 && (this.field4514 + ((long) arg0)) <= ((long) this.field4488 + this.field4497)) {
                        var6 = (long) arg0 + this.field4514;
                    } else if (this.field4514 < (long) this.field4488 + this.field4497 && (long) arg0 + this.field4514 >= (long) this.field4488 + this.field4497) {
                        var6 = (long) this.field4488 + this.field4497;
                    }
                    long var8 = -1L;
                    if (this.field4514 >= this.field4497 && ((long) this.field4488 + this.field4497) > this.field4514) {
                        var8 = this.field4514;
                    } else if (this.field4514 <= this.field4497 && (long) arg0 + this.field4514 > this.field4497) {
                        var8 = this.field4497;
                    }
                    if (var8 > -1L && var6 > var8) {
                        int var10 = (int) (var6 - var8);
                        class104.method782(arg2, (int) ((long) arg1 + var8 - this.field4514), this.field4511, (int) (var8 - this.field4497), var10);
                    }
                    this.field4514 += (long) arg0;
                } else if (arg0 > 0) {
                    if (this.field4500 == -1L) {
                        this.field4500 = this.field4514;
                    }
                    class104.method782(arg2, arg1, this.field4492, (int) (this.field4514 - this.field4500), arg0);
                    this.field4514 += (long) arg0;
                    if (((long) this.field4486) < (this.field4514 - this.field4500)) {
                        this.field4486 = (int) (this.field4514 - this.field4500);
                    }
                }
            }
        } catch (IOException var12) {
            this.field4502 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IJ)V")
    public final void method1736(int arg0, long arg1) throws IOException {
        field4504++;
        if (arg0 < 83) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1727(-27315));
        }
        this.field4514 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "(I)I")
    public static final int method1737(int arg0) {
        field4485++;
        if (class154.field2732) {
            return 0;
        } else if (arg0 != 3) {
            return 15;
        } else if (class180.method1291(2047)) {
            return class217.field3840 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Ltk;II)V")
    public class258(class159 arg0, int arg1, int arg2) throws IOException {
        this.field4490 = arg0;
        this.field4493 = this.field4501 = arg0.method1166(44);
        this.field4511 = new byte[arg1];
        this.field4492 = new byte[arg2];
        this.field4514 = 0L;
    }
}
