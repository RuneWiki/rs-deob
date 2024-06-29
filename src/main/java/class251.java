import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class251 {

    @OriginalMember(owner = "client!cc", name = "s", descriptor = "J")
    private long field4446 = -1L;

    @OriginalMember(owner = "client!cc", name = "q", descriptor = "I")
    private int field4444 = 0;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "J")
    private long field4440 = -1L;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "Lqc;")
    private class254 field4428;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "J")
    private long field4441;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "J")
    private long field4438;

    @OriginalMember(owner = "client!cc", name = "p", descriptor = "[B")
    private byte[] field4443;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "[B")
    private byte[] field4430;

    @OriginalMember(owner = "client!cc", name = "t", descriptor = "J")
    private long field4447;

    @OriginalMember(owner = "client!cc", name = "z", descriptor = "Lda;")
    public static class275 field4453 = class255.method1672(114, "Weiter");

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "Lrg;")
    public static class84 field4431 = new class84();

    @OriginalMember(owner = "client!cc", name = "B", descriptor = "Lda;")
    public static class275 field4455 = class255.method1672(101, "blinken3:");

    @OriginalMember(owner = "client!cc", name = "E", descriptor = "Lda;")
    public static class275 field4458 = class255.method1672(111, "Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

    @OriginalMember(owner = "client!cc", name = "C", descriptor = "[J")
    public static long[] field4456 = new long[32];

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
    public static int field4435;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field4436;

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field4437;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
    public static int field4439;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field4442;

    @OriginalMember(owner = "client!cc", name = "v", descriptor = "I")
    private int field4449;

    @OriginalMember(owner = "client!cc", name = "w", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!cc", name = "x", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!cc", name = "y", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!cc", name = "A", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!cc", name = "u", descriptor = "J")
    private long field4448;

    @OriginalMember(owner = "client!cc", name = "r", descriptor = "Llb;")
    public static class274 field4445;

    @OriginalMember(owner = "client!cc", name = "D", descriptor = "[Lwb;")
    public static class179[] field4457;

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "([BIIB)V")
    public final void method1645(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field4442++;
        try {
            if ((arg1 + arg2) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field4446 != -1L && this.field4446 <= this.field4447 && (this.field4447 + ((long) arg2)) <= ((long) this.field4444 + this.field4446)) {
                class154.method1085(this.field4430, (int) (this.field4447 - this.field4446), arg0, arg1, arg2);
                this.field4447 += (long) arg2;
                return;
            }
            if (arg3 <= 13) {
                method1655(-52, (byte) -109);
            }
            long var5 = this.field4447;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field4440 <= this.field4447 && this.field4447 < ((long) this.field4449 + this.field4440)) {
                int var9 = (int) (-this.field4447 - (-this.field4440 - (long) this.field4449));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class154.method1085(this.field4443, (int) (this.field4447 - this.field4440), arg0, arg1, var9);
                arg1 += var9;
                this.field4447 += (long) var9;
            }
            if (this.field4443.length < arg2) {
                this.field4428.method1669(this.field4447, false);
                this.field4448 = this.field4447;
                while (arg2 > 0) {
                    int var10 = this.field4428.method1666(arg1, arg2, arg0, true);
                    if (var10 == -1) {
                        break;
                    }
                    this.field4447 += (long) var10;
                    this.field4448 += (long) var10;
                    arg2 -= var10;
                    arg1 += var10;
                }
            } else if (arg2 > 0) {
                this.method1656(0);
                int var11 = arg2;
                if (this.field4449 < arg2) {
                    var11 = this.field4449;
                }
                arg2 -= var11;
                class154.method1085(this.field4443, 0, arg0, arg1, var11);
                arg1 += var11;
                this.field4447 += (long) var11;
            }
            if (this.field4446 != -1L) {
                if (this.field4447 < this.field4446 && arg2 > 0) {
                    int var12 = arg1 + ((int) (this.field4446 - this.field4447));
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (arg1 < var12) {
                        arg2--;
                        arg0[arg1++] = 0;
                        this.field4447++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if ((long) this.field4444 + this.field4446 > var5 && this.field4446 + ((long) this.field4444) <= (long) var8 + var5) {
                    var13 = (long) this.field4444 + this.field4446;
                } else if ((long) var8 + var5 > this.field4446 && (long) var8 + var5 <= (long) this.field4444 + this.field4446) {
                    var13 = (long) var8 + var5;
                }
                if (var5 <= this.field4446 && this.field4446 < (long) var8 + var5) {
                    var15 = this.field4446;
                } else if (var5 >= this.field4446 && var5 < (long) this.field4444 + this.field4446) {
                    var15 = var5;
                }
                if (var15 > -1L && var13 > var15) {
                    int var17 = (int) (var13 - var15);
                    class154.method1085(this.field4430, (int) (var15 - this.field4446), arg0, (int) (var15 - var5) + var7, var17);
                    if (var13 > this.field4447) {
                        arg2 = (int) ((long) arg2 - (var13 - this.field4447));
                        this.field4447 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field4448 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[BII)V")
    public final void method1646(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field4452++;
        try {
            if ((long) arg2 + this.field4447 > this.field4438) {
                this.field4438 = (long) arg2 + this.field4447;
            }
            if (arg3 > 115) {
                if (this.field4446 != -1L && (this.field4446 > this.field4447 || this.field4447 > (long) this.field4444 + this.field4446)) {
                    this.method1649(true);
                }
                if (this.field4446 != -1L && (long) arg2 + this.field4447 > (long) this.field4430.length + this.field4446) {
                    int var5 = (int) ((long) this.field4430.length + this.field4446 - this.field4447);
                    class154.method1085(arg1, arg0, this.field4430, (int) (this.field4447 - this.field4446), var5);
                    arg2 -= var5;
                    this.field4447 += (long) var5;
                    this.field4444 = this.field4430.length;
                    arg0 += var5;
                    this.method1649(true);
                }
                if (this.field4430.length < arg2) {
                    long var6 = -1L;
                    if (this.field4448 != this.field4447) {
                        this.field4428.method1669(this.field4447, false);
                        this.field4448 = this.field4447;
                    }
                    this.field4428.method1668(arg0, false, arg2, arg1);
                    if (this.field4447 >= this.field4440 && this.field4447 < ((long) this.field4449 + this.field4440)) {
                        var6 = this.field4447;
                    } else if (this.field4440 >= this.field4447 && ((long) arg2 + this.field4447) > this.field4440) {
                        var6 = this.field4440;
                    }
                    this.field4448 += (long) arg2;
                    long var8 = -1L;
                    if (this.field4448 > this.field4441) {
                        this.field4441 = this.field4448;
                    }
                    if (((long) arg2 + this.field4447) > this.field4440 && (this.field4440 + ((long) this.field4449)) >= ((long) arg2 + this.field4447)) {
                        var8 = (long) arg2 + this.field4447;
                    } else if (this.field4447 < (long) this.field4449 + this.field4440 && (this.field4440 + ((long) this.field4449)) <= ((long) arg2 + this.field4447)) {
                        var8 = (long) this.field4449 + this.field4440;
                    }
                    if (var6 > -1L && var8 > var6) {
                        int var10 = (int) (var8 - var6);
                        class154.method1085(arg1, (int) ((long) arg0 + var6 - this.field4447), this.field4443, (int) (var6 - this.field4440), var10);
                    }
                    this.field4447 += (long) arg2;
                } else if (arg2 > 0) {
                    if (this.field4446 == -1L) {
                        this.field4446 = this.field4447;
                    }
                    class154.method1085(arg1, arg0, this.field4430, (int) (this.field4447 - this.field4446), arg2);
                    this.field4447 += (long) arg2;
                    if ((this.field4447 - this.field4446) > ((long) this.field4444)) {
                        this.field4444 = (int) (this.field4447 - this.field4446);
                    }
                }
            }
        } catch (IOException var12) {
            this.field4448 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method1647(int arg0) {
        if (arg0 != 26994) {
            method1653((byte) 76);
        }
        field4436++;
        return this.field4428.method1670(1);
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)J")
    public final long method1648(int arg0) {
        if (arg0 != 2) {
            method1655(-55, (byte) -1);
        }
        field4429++;
        return this.field4438;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(Z)V")
    private final void method1649(boolean arg0) throws IOException {
        field4434++;
        if (this.field4446 != -1L) {
            if (this.field4448 != this.field4446) {
                this.field4428.method1669(this.field4446, false);
                this.field4448 = this.field4446;
            }
            this.field4428.method1668(0, !arg0, this.field4444, this.field4430);
            this.field4448 += (long) this.field4444;
            long var2 = -1L;
            long var4 = -1L;
            if (this.field4440 < ((long) this.field4444 + this.field4446) && ((long) this.field4449 + this.field4440) >= ((long) this.field4444 + this.field4446)) {
                var2 = (long) this.field4444 + this.field4446;
            } else if (this.field4440 + ((long) this.field4449) > this.field4446 && (long) this.field4444 + this.field4446 >= (long) this.field4449 + this.field4440) {
                var2 = this.field4440 + ((long) this.field4449);
            }
            if (this.field4441 < this.field4448) {
                this.field4441 = this.field4448;
            }
            if (this.field4446 >= this.field4440 && this.field4446 < ((long) this.field4449 + this.field4440)) {
                var4 = this.field4446;
            } else if (this.field4446 <= this.field4440 && (this.field4446 + ((long) this.field4444)) > this.field4440) {
                var4 = this.field4440;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class154.method1085(this.field4430, (int) (var4 - this.field4446), this.field4443, (int) (var4 - this.field4440), var6);
            }
            this.field4446 = -1L;
            this.field4444 = 0;
        }
        if (!arg0) {
            this.method1648(78);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(BJ)V")
    public final void method1650(byte arg0, long arg1) throws IOException {
        field4439++;
        if (arg0 < 23) {
            method1655(30, (byte) 74);
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1647(26994));
        }
        this.field4447 = arg1;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[B)V")
    public final void method1651(int arg0, byte[] arg1) throws IOException {
        this.method1645(arg1, arg0, arg1.length, (byte) 124);
        field4433++;
    }

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "(I)V")
    public static final void method1652(int arg0) {
        field4451++;
        if (arg0 == 9818) {
            class160.field2804.method993(116);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)Lsa;")
    public static final class262 method1653(byte arg0) {
        field4432++;
        try {
            int var1 = 29 % ((arg0 - 57) / 49);
            return (class262) Class.forName("ej").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class46();
        }
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method1654(byte arg0) {
        if (arg0 > -47) {
            method1653((byte) -31);
        }
        field4431 = null;
        field4453 = null;
        field4457 = null;
        field4445 = null;
        field4456 = null;
        field4455 = null;
        field4458 = null;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lve;")
    public static final class174 method1655(int arg0, byte arg1) {
        class174 var2 = (class174) class171.field2981.method990((long) arg0, (byte) 71);
        field4435++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class65.field1064.method775(16, arg0, -24799);
        class174 var4 = new class174();
        if (var3 != null) {
            var4.method1180(new class85(var3), 0);
        }
        class171.field2981.method986(0, (long) arg0, var4);
        if (arg1 <= 27) {
            method1653((byte) 100);
        }
        return var4;
    }

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "(I)V")
    private final void method1656(int arg0) throws IOException {
        this.field4449 = arg0;
        field4450++;
        if (this.field4448 != this.field4447) {
            this.field4428.method1669(this.field4447, false);
            this.field4448 = this.field4447;
        }
        this.field4440 = this.field4447;
        while (this.field4449 < this.field4443.length) {
            int var2 = this.field4443.length - this.field4449;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field4428.method1666(this.field4449, var2, this.field4443, true);
            if (var3 == -1) {
                break;
            }
            this.field4449 += var3;
            this.field4448 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lqc;II)V")
    public class251(class254 arg0, int arg1, int arg2) throws IOException {
        this.field4428 = arg0;
        this.field4438 = this.field4441 = arg0.method1667(1);
        this.field4443 = new byte[arg1];
        this.field4430 = new byte[arg2];
        this.field4447 = 0L;
    }

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "(I)V")
    public final void method1657(int arg0) throws IOException {
        field4437++;
        this.method1649(true);
        this.field4428.method1665(true);
        if (arg0 > -117) {
            method1653((byte) 76);
        }
    }
}
