import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class19 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    private int field343 = 0;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "J")
    private long field341 = -1L;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "J")
    private long field346 = -1L;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Ldc;")
    private class22 field373;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "J")
    private long field368;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "J")
    private long field359;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "J")
    private long field340;

    @OriginalMember(owner = "client!d", name = "C", descriptor = "[B")
    private byte[] field367;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[B")
    private byte[] field348;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "Lo;")
    public static class84 field349 = class15.method124("Unknown", 255);

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lo;")
    public static class84 field344 = class15.method124("Enter name of player to add to list", 255);

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lo;")
    public static class84 field351 = class15.method124("(Z", 255);

    @OriginalMember(owner = "client!d", name = "y", descriptor = "Lo;")
    public static class84 field363 = class15.method124("@yel@ days of*6nmember credit remaining)3", 255);

    @OriginalMember(owner = "client!d", name = "B", descriptor = "[Lo;")
    public static class84[] field366 = new class84[100];

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lo;")
    public static class84 field352 = class15.method124("Invalid username or password)3", 255);

    @OriginalMember(owner = "client!d", name = "w", descriptor = "Lo;")
    public static class84 field361 = class15.method124("Password: ", 255);

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lo;")
    public static class84 field347 = class15.method124("Loaded gamescreen", 255);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lo;")
    public static class84 field339 = null;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "[I")
    public static int[] field360 = new int[] { 0, 0, 0, -1, 0, 0, 0, 8, 0, 0, 0, 5, 0, 0, 0, 8, 0, 0, 0, 0, 0, 14, 0, 0, 8, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 6, 0, 2, 0, 0, 0, 0, 0, 0, -2, 7, 0, 0, 0, 0, 0, 0, -2, -2, 0, 5, 0, 10, 0, 0, 0, 5, 7, 0, 0, 1, 0, 0, 15, 2, -1, 0, 0, 1, 0, 0, 0, 0, 0, 6, 0, 0, 0, 4, -1, 0, 0, 0, 0, 6, 0, 0, 0, 2, 0, 0, 4, 0, 0, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 6, 0, 4, 0, 2, 0, -2, 0, 0, 0, -2, 0, -2, 4, 0, 0, 6, 6, 0, 6, 4, 0, 0, 0, 0, 0, -2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 23, 0, 10, 0, -2, 0, 0, 0, 0, 6, 4, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 0, 0, 0, 0, 0, 0, 6, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 6, 1, 0, 0, 0, 0, 3, 0, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 6, 0, 0, 4, 0, 0, 0, 0, 2, 5, 0, 3, 0, 0, 4 };

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lo;")
    public static class84 field372 = class15.method124("Connecting to server)3)3)3", 255);

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    public static int field370 = -1;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "I")
    public static int field357;

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!d", name = "E", descriptor = "I")
    public static int field369;

    @OriginalMember(owner = "client!d", name = "p", descriptor = "J")
    private long field354;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "Lqb;")
    public static class96 field371;

    // $FF: synthetic field
    @OriginalMember(owner = "client!d", name = "J", descriptor = "Ljava/lang/Class;")
    public static Class field374;

    // $FF: synthetic method
    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method164(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 4)
    public static void method155(byte arg0) {
        field360 = null;
        field344 = null;
        field339 = null;
        field349 = null;
        field351 = null;
        field347 = null;
        field366 = null;
        if (arg0 >= -62) {
            method157((byte) 91);
        }
        field372 = null;
        field363 = null;
        field361 = null;
        field371 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)V", line = 36)
    public final void method156(long arg0, int arg1) {
        field358++;
        if (arg0 >= 0L) {
            this.field340 = arg0;
            if (arg1 != -22121) {
                field361 = null;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(B)V", line = 53)
    public static final void method157(byte arg0) {
        field342++;
        if (arg0 != 21 || class97.field2071 == null) {
            return;
        }
        long var1 = System.currentTimeMillis();
        if (class120.field2684 >= var1) {
            return;
        }
        class97.field2071.method407(var1);
        int var3 = (int) (var1 - class120.field2684);
        class120.field2684 = var1;
        synchronized (field374 == null ? (field374 = method164("wd")) : field374) {
            class6.field105 += class14.field251 * var3;
            int var5 = (class6.field105 - class14.field251 * 2000) / 1000;
            if (var5 > 0) {
                if (class26.field440 != null) {
                    class26.field440.method544(var5);
                }
                class6.field105 -= var5 * 1000;
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Ldc;II)V", line = 641)
    public class19(class22 arg0, int arg1, int arg2) throws IOException {
        this.field373 = arg0;
        this.field359 = this.field368 = arg0.method176(1);
        this.field340 = 0L;
        this.field367 = new byte[arg2];
        this.field348 = new byte[arg1];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BIII)V", line = 120)
    public final void method158(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field345++;
        try {
            if (arg3 < 17) {
                field360 = null;
            }
            if (this.field359 < (long) arg1 + this.field340) {
                this.field359 = (long) arg1 + this.field340;
            }
            if (this.field341 != -1L && (this.field341 > this.field340 || this.field340 > (long) this.field343 + this.field341)) {
                this.method162(111);
            }
            if (this.field341 != -1L && this.field340 + (long) arg1 > (long) this.field367.length + this.field341) {
                int var5 = (int) (this.field341 + (long) this.field367.length - this.field340);
                arg1 -= var5;
                class68.method518(arg0, arg2, this.field367, (int) (this.field340 - this.field341), var5);
                arg2 += var5;
                this.field340 += var5;
                this.field343 = this.field367.length;
                this.method162(103);
            }
            if (arg1 > this.field367.length) {
                if (this.field354 != this.field340) {
                    this.field373.method178(0, this.field340);
                    this.field354 = this.field340;
                }
                long var6 = -1L;
                this.field373.method174((byte) 15, arg2, arg1, arg0);
                long var8 = -1L;
                if (this.field346 <= this.field340 && (long) this.field353 + this.field346 > this.field340) {
                    var8 = this.field340;
                } else if (this.field346 >= this.field340 && this.field340 + (long) arg1 > this.field346) {
                    var8 = this.field346;
                }
                this.field354 += arg1;
                if (this.field346 < this.field340 + (long) arg1 && (long) this.field353 + this.field346 >= (long) arg1 + this.field340) {
                    var6 = this.field340 + (long) arg1;
                } else if (this.field340 < this.field346 + (long) this.field353 && (long) this.field353 + this.field346 <= this.field340 - -((long) arg1)) {
                    var6 = (long) this.field353 + this.field346;
                }
                if (this.field354 > this.field368) {
                    this.field368 = this.field354;
                }
                if (var8 > -1L && var8 < var6) {
                    int var10 = (int) (var6 - var8);
                    class68.method518(arg0, (int) ((long) arg2 + var8 - this.field340), this.field348, (int) (var8 - this.field346), var10);
                }
                this.field340 += arg1;
            } else if (arg1 > 0) {
                if (this.field341 == -1L) {
                    this.field341 = this.field340;
                }
                class68.method518(arg0, arg2, this.field367, (int) (this.field340 - this.field341), arg1);
                this.field340 += arg1;
                if (this.field340 - this.field341 > (long) this.field343) {
                    this.field343 = (int) (this.field340 - this.field341);
                }
            }
        } catch (IOException var12) {
            this.field354 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(B)V", line = 246)
    private final void method159(byte arg0) throws IOException {
        this.field353 = 0;
        if (arg0 != -36) {
            field351 = null;
        }
        if (this.field354 != this.field340) {
            this.field373.method178(arg0 ^ 0xFFFFFFDC, this.field340);
            this.field354 = this.field340;
        }
        field362++;
        this.field346 = this.field340;
        while (this.field353 < this.field348.length) {
            int var2 = this.field373.method175(this.field348, this.field348.length - this.field353, this.field353, 74);
            if (var2 == -1) {
                break;
            }
            this.field354 += var2;
            this.field353 += var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[B)V", line = 314)
    public final void method160(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field369++;
        try {
            if (arg0 != 27487) {
                return;
            }
            if (arg3.length < arg1 + arg2) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg3.length);
            }
            if (this.field341 != -1L && this.field340 >= this.field341 && (long) arg2 + this.field340 <= (long) this.field343 + this.field341) {
                class68.method518(this.field367, (int) (this.field340 - this.field341), arg3, arg1, arg2);
                this.field340 += arg2;
                return;
            }
            int var5 = arg1;
            long var6 = this.field340;
            int var8 = arg2;
            if (this.field340 >= this.field346 && this.field340 < (long) this.field353 + this.field346) {
                int var9 = (int) ((long) this.field353 + this.field346 - this.field340);
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class68.method518(this.field348, (int) (this.field340 - this.field346), arg3, arg1, var9);
                this.field340 += var9;
                arg1 += var9;
            }
            if (this.field348.length < arg2) {
                this.field373.method178(arg0 ^ 0x6B5F, this.field340);
                this.field354 = this.field340;
                while (arg2 > 0) {
                    int var10 = this.field373.method175(arg3, arg2, arg1, arg0 - 27423);
                    if (var10 == -1) {
                        break;
                    }
                    this.field340 += var10;
                    arg2 -= var10;
                    this.field354 += var10;
                    arg1 += var10;
                }
            } else if (arg2 > 0) {
                this.method159((byte) -36);
                int var11 = arg2;
                if (arg2 > this.field353) {
                    var11 = this.field353;
                }
                arg2 -= var11;
                class68.method518(this.field348, 0, arg3, arg1, var11);
                this.field340 += var11;
                arg1 += var11;
            }
            if (this.field341 != -1L) {
                if (this.field341 > this.field340 && arg2 > 0) {
                    int var12 = (int) (this.field341 - this.field340) + arg1;
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (arg1 < var12) {
                        arg3[arg1++] = 0;
                        arg2--;
                        this.field340++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (this.field341 >= var6 && (long) var8 + var6 > this.field341) {
                    var13 = this.field341;
                } else if (var6 >= this.field341 && var6 < this.field341 + (long) this.field343) {
                    var13 = var6;
                }
                if (var6 < (long) this.field343 + this.field341 && (long) var8 + var6 >= this.field341 - -((long) this.field343)) {
                    var15 = (long) this.field343 + this.field341;
                } else if (this.field341 < (long) var8 + var6 && (long) var8 + var6 <= (long) this.field343 + this.field341) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class68.method518(this.field367, (int) (var13 - this.field341), arg3, var5 + (int) (var13 - var6), var17);
                    if (var15 > this.field340) {
                        arg2 = (int) ((long) arg2 + this.field340 - var15);
                        this.field340 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field354 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)J", line = 500)
    public final long method161(int arg0) {
        field357++;
        if (arg0 <= 48) {
            field339 = null;
        }
        return this.field359;
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 535)
    private final void method162(int arg0) throws IOException {
        if (this.field341 != -1L) {
            if (this.field354 != this.field341) {
                this.field373.method178(0, this.field341);
                this.field354 = this.field341;
            }
            this.field373.method174((byte) 23, 0, this.field343, this.field367);
            this.field354 += this.field343;
            long var2 = -1L;
            long var4 = -1L;
            if (this.field354 > this.field368) {
                this.field368 = this.field354;
            }
            if (this.field346 < (long) this.field343 + this.field341 && (long) this.field343 + this.field341 <= (long) this.field353 + this.field346) {
                var2 = (long) this.field343 + this.field341;
            } else if (this.field341 < (long) this.field353 + this.field346 && this.field341 + (long) this.field343 >= (long) this.field353 + this.field346) {
                var2 = (long) this.field353 + this.field346;
            }
            if (this.field346 <= this.field341 && (long) this.field353 + this.field346 > this.field341) {
                var4 = this.field341;
            } else if (this.field346 >= this.field341 && this.field346 < (long) this.field343 + this.field341) {
                var4 = this.field346;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class68.method518(this.field367, (int) (var4 - this.field341), this.field348, (int) (var4 - this.field346), var6);
            }
            this.field343 = 0;
            this.field341 = -1L;
        }
        if (arg0 < 81) {
            this.method156(-121L, 81);
        }
        field350++;
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V", line = 611)
    public final void method163(int arg0) throws IOException {
        this.method162(97);
        this.field373.method173(-1);
        field355++;
        if (arg0 < 36) {
            this.method156(-85L, 31);
        }
    }
}
