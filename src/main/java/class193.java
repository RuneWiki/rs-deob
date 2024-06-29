import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class193 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "I")
    private int field2473 = 0;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "J")
    private long field2490 = -1L;

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "J")
    private long field2480 = -1L;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "Lhh;")
    private class86 field2482;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "J")
    private long field2496;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "J")
    private long field2493;

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "[B")
    private byte[] field2481;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "[B")
    private byte[] field2485;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "J")
    private long field2486;

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lsr;")
    public static class167 field2491 = new class167();

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "Z")
    public static boolean field2495 = false;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    private int field2474;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2477;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public static int field2478;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "J")
    private long field2497;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[Lo;")
    public static class24[] field2498;

    static {
        new class305("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)V", line = 9)
    public final void method1094(int arg0, long arg1) throws IOException {
        field2488++;
        int var4 = -69 % ((8 - arg0) / 61);
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1104((byte) -112));
        }
        this.field2486 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "(Lhh;II)V", line = 628)
    public class193(class86 arg0, int arg1, int arg2) throws IOException {
        this.field2482 = arg0;
        this.field2493 = this.field2496 = arg0.method473((byte) 86);
        this.field2481 = new byte[arg2];
        this.field2485 = new byte[arg1];
        this.field2486 = 0L;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "([BIBI)V", line = 32)
    public final void method1095(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field2487++;
        try {
            if (arg3 + arg1 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field2480 != -1L && this.field2480 <= this.field2486 && (long) this.field2473 + this.field2480 >= (long) arg1 + this.field2486) {
                class438.method2687(this.field2481, (int) (this.field2486 - this.field2480), arg0, arg3, arg1);
                this.field2486 += arg1;
                return;
            }
            long var5 = this.field2486;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field2486 >= this.field2490 && this.field2486 < ((long) this.field2474 + this.field2490)) {
                int var9 = (int) (this.field2490 - (this.field2486 - (long) this.field2474));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class438.method2687(this.field2485, (int) (this.field2486 - this.field2490), arg0, arg3, var9);
                arg3 += var9;
                this.field2486 += var9;
                arg1 -= var9;
            }
            if (arg2 != 28) {
                return;
            }
            if (arg1 > this.field2485.length) {
                this.field2482.method474(arg2 - 21032, this.field2486);
                this.field2497 = this.field2486;
                while (arg1 > 0) {
                    int var10 = this.field2482.method471(0, arg1, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2486 += var10;
                    arg1 -= var10;
                    arg3 += var10;
                    this.field2497 += var10;
                }
            } else if (arg1 > 0) {
                this.method1096(-200000001);
                int var11 = arg1;
                if (this.field2474 < arg1) {
                    var11 = this.field2474;
                }
                class438.method2687(this.field2485, 0, arg0, arg3, var11);
                arg1 -= var11;
                arg3 += var11;
                this.field2486 += var11;
            }
            if (this.field2480 != -1L) {
                if (this.field2486 < this.field2480 && arg1 > 0) {
                    int var12 = (int) (this.field2480 - this.field2486) + arg3;
                    if (var12 > arg1 + arg3) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0[arg3++] = 0;
                        arg1--;
                        this.field2486++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field2480 && (long) var8 + var5 > this.field2480) {
                    var13 = this.field2480;
                } else if (this.field2480 <= var5 && var5 < (long) this.field2473 + this.field2480) {
                    var13 = var5;
                }
                if (var5 < (long) this.field2473 + this.field2480 && (long) this.field2473 + this.field2480 <= var5 - -((long) var8)) {
                    var15 = (long) this.field2473 + this.field2480;
                } else if (this.field2480 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field2473 + this.field2480) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class438.method2687(this.field2481, (int) (var13 - this.field2480), arg0, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field2486) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2486));
                        this.field2486 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2497 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 217)
    private final void method1096(int arg0) throws IOException {
        if (arg0 != -200000001) {
            return;
        }
        field2476++;
        this.field2474 = 0;
        if (this.field2497 != this.field2486) {
            this.field2482.method474(-21004, this.field2486);
            this.field2497 = this.field2486;
        }
        this.field2490 = this.field2486;
        while (this.field2474 < this.field2485.length) {
            int var2 = this.field2485.length - this.field2474;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2482.method471(0, var2, this.field2474, this.field2485);
            if (var3 == -1) {
                break;
            }
            this.field2497 += var3;
            this.field2474 += var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V", line = 262)
    public static void method1097(int arg0) {
        field2498 = null;
        if (arg0 == -14047) {
            field2491 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZII)I", line = 273)
    public static final int method1098(int arg0, boolean arg1, int arg2, int arg3) {
        field2492++;
        if ((class252.field3358[arg3][arg0][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class252.field3358[1][arg0][arg2] & 0x2) == 0) {
            return arg1 ? -43 : arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(I)J", line = 293)
    public final long method1099(int arg0) {
        field2479++;
        return arg0 == 1 ? this.field2493 : -22L;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljk;B)V", line = 308)
    public static final void method1100(class450 arg0, byte arg1) {
        field2477++;
        if (!class323.field4302) {
            return;
        }
        if (arg1 != 0) {
            field2498 = null;
        }
        if (arg0.field6626 != null) {
            class450 var2 = class19.method108(true, class519.field7656, class235.field3143);
            if (var2 != null) {
                class293 var3 = new class293();
                var3.field3866 = arg0.field6626;
                var3.field3877 = arg0;
                var3.field3875 = var2;
                class432.method2657(var3);
            }
        }
        class520.field7658++;
        class492.method2979(class287.field3780, arg1 + 25);
        class106.field1443.method2398(121, arg0.field6558);
        class106.field1443.method2398(123, class519.field7656);
        class106.field1443.method2401(128, class273.field3644);
        class106.field1443.method2401(128, class235.field3143);
        class106.field1443.method2444((byte) 65, arg0.field6661);
        class106.field1443.method2410(false, arg0.field6703);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lbu;Z)Z", line = 355)
    public static final boolean method1101(class17 arg0, boolean arg1) {
        field2489++;
        if (!arg1) {
            method1098(39, false, -60, -124);
        }
        return class255.field3396 == arg0 || class168.field2175 == arg0 || class202.field2683 == arg0 || class50.field574 == arg0;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)V", line = 367)
    private final void method1102(byte arg0) throws IOException {
        if (arg0 != 37) {
            this.method1099(90);
        }
        field2484++;
        if (this.field2480 == -1L) {
            return;
        }
        if (this.field2497 != this.field2480) {
            this.field2482.method474(-21004, this.field2480);
            this.field2497 = this.field2480;
        }
        this.field2482.method469(0, this.field2473, 23609, this.field2481);
        this.field2497 += this.field2473;
        if (this.field2496 < this.field2497) {
            this.field2496 = this.field2497;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field2490 <= this.field2480 && ((long) this.field2474 + this.field2490) > this.field2480) {
            var2 = this.field2480;
        } else if (this.field2480 <= this.field2490 && ((long) this.field2473 + this.field2480) > this.field2490) {
            var2 = this.field2490;
        }
        if (this.field2490 < (long) this.field2473 + this.field2480 && this.field2490 + ((long) this.field2474) >= this.field2480 - -((long) this.field2473)) {
            var4 = (long) this.field2473 + this.field2480;
        } else if (this.field2480 < ((long) this.field2474 + this.field2490) && (long) this.field2474 + this.field2490 <= (long) this.field2473 + this.field2480) {
            var4 = (long) this.field2474 + this.field2490;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class438.method2687(this.field2481, (int) (var2 - this.field2480), this.field2485, (int) (var2 - this.field2490), var6);
        }
        this.field2473 = 0;
        this.field2480 = -1L;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)V", line = 444)
    public final void method1103(int arg0, byte[] arg1) throws IOException {
        field2494++;
        this.method1095(arg1, arg1.length, (byte) 28, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)Ljava/io/File;", line = 453)
    private final File method1104(byte arg0) {
        if (arg0 >= -32) {
            return null;
        } else {
            field2478++;
            return this.field2482.method470(-1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI[BI)V", line = 469)
    public final void method1105(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field2483++;
        if (arg0) {
            this.field2481 = null;
        }
        try {
            if (this.field2493 < ((long) arg1 + this.field2486)) {
                this.field2493 = (long) arg1 + this.field2486;
            }
            if (this.field2480 != -1L && (this.field2480 > this.field2486 || ((long) this.field2473 + this.field2480) < this.field2486)) {
                this.method1102((byte) 37);
            }
            if (this.field2480 != -1L && ((long) this.field2481.length + this.field2480) < ((long) arg1 + this.field2486)) {
                int var5 = (int) ((long) this.field2481.length + this.field2480 - this.field2486);
                class438.method2687(arg2, arg3, this.field2481, (int) (this.field2486 - this.field2480), var5);
                arg1 -= var5;
                this.field2486 += var5;
                arg3 += var5;
                this.field2473 = this.field2481.length;
                this.method1102((byte) 37);
            }
            if (this.field2481.length < arg1) {
                if (this.field2497 != this.field2486) {
                    this.field2482.method474(-21004, this.field2486);
                    this.field2497 = this.field2486;
                }
                this.field2482.method469(arg3, arg1, 23609, arg2);
                this.field2497 += arg1;
                if (this.field2497 > this.field2496) {
                    this.field2496 = this.field2497;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field2486 >= this.field2490 && this.field2486 < (this.field2490 + ((long) this.field2474))) {
                    var6 = this.field2486;
                } else if (this.field2490 >= this.field2486 && (this.field2486 + ((long) arg1)) > this.field2490) {
                    var6 = this.field2490;
                }
                if ((long) arg1 + this.field2486 > this.field2490 && this.field2486 + ((long) arg1) <= (long) this.field2474 + this.field2490) {
                    var8 = this.field2486 + ((long) arg1);
                } else if (((long) this.field2474 + this.field2490) > this.field2486 && (long) this.field2474 + this.field2490 <= this.field2486 - -((long) arg1)) {
                    var8 = (long) this.field2474 + this.field2490;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class438.method2687(arg2, (int) (var6 + (long) arg3 - this.field2486), this.field2485, (int) (var6 - this.field2490), var10);
                }
                this.field2486 += arg1;
            } else if (arg1 > 0) {
                if (this.field2480 == -1L) {
                    this.field2480 = this.field2486;
                }
                class438.method2687(arg2, arg3, this.field2481, (int) (this.field2486 - this.field2480), arg1);
                this.field2486 += arg1;
                if (((long) this.field2473) < (this.field2486 - this.field2480)) {
                    this.field2473 = (int) (this.field2486 - this.field2480);
                }
            }
        } catch (IOException var12) {
            this.field2497 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljk;IIB)V", line = 608)
    public static final void method1106(class450 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 != -83) {
            field2498 = null;
        }
        class22.field212 = arg2;
        class374.field5074 = arg1;
        class382.field5530 = arg0;
        field2475++;
    }
}
