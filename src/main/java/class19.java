import java.awt.Component;
import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class19 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    private int field474 = 0;

    @OriginalMember(owner = "client!d", name = "x", descriptor = "J")
    private long field493 = -1L;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "J")
    private long field481 = -1L;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "Lbe;")
    private class12 field503;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "J")
    private long field507;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "J")
    private long field480;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "J")
    private long field484;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "[B")
    private byte[] field470;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "[B")
    private byte[] field510;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "Lv;")
    public static class122 field471 = class55.method425(-113, " Sekunde(Xn(Y \u001c1bertragen)3");

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!d", name = "q", descriptor = "Lv;")
    public static class122 field486 = class55.method425(-69, "Ihre Ignorieren)2Liste ist voll)1 Sie k\u001c1nnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!d", name = "A", descriptor = "I")
    public static int field496 = 0;

    @OriginalMember(owner = "client!d", name = "u", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
    public static boolean field479 = false;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "I")
    public static int field508 = 0;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lv;")
    private static class122 field478 = class55.method425(-96, "Checking for updates )2 ");

    @OriginalMember(owner = "client!d", name = "C", descriptor = "Lv;")
    public static class122 field498 = class55.method425(-115, "Handel akzeptieren");

    @OriginalMember(owner = "client!d", name = "E", descriptor = "Lv;")
    public static class122 field500 = field478;

    @OriginalMember(owner = "client!d", name = "B", descriptor = "J")
    public static long field497 = 0L;

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lv;")
    public static class122 field511 = class55.method425(-59, "(WSpielkonto wiederherstellen(W Option auf der Hauptseite)3");

    @OriginalMember(owner = "client!d", name = "p", descriptor = "Lv;")
    public static class122 field485 = class55.method425(-83, "::noclip");

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Lv;")
    public static class122 field512 = class55.method425(-112, "Unerwartete Antwort vom Anmelde)2Server: ");

    @OriginalMember(owner = "client!d", name = "S", descriptor = "Lv;")
    private static class122 field514 = class55.method425(-114, "M");

    @OriginalMember(owner = "client!d", name = "T", descriptor = "Lv;")
    private static class122 field515 = class55.method425(-119, "Too many connections from your address)3");

    @OriginalMember(owner = "client!d", name = "R", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!d", name = "D", descriptor = "I")
    public static int field499 = -1;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lv;")
    public static class122 field477 = field514;

    @OriginalMember(owner = "client!d", name = "s", descriptor = "Lv;")
    public static class122 field488 = field515;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "Lv;")
    private static class122 field509 = class55.method425(-103, "Remove");

    @OriginalMember(owner = "client!d", name = "t", descriptor = "I")
    public static int field489 = 0;

    @OriginalMember(owner = "client!d", name = "U", descriptor = "Lv;")
    public static class122 field516 = field509;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "I")
    public static int field483;

    @OriginalMember(owner = "client!d", name = "v", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!d", name = "w", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!d", name = "y", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!d", name = "z", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!d", name = "F", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!d", name = "r", descriptor = "J")
    private long field487;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lhe;")
    public static class47 field482;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "[I")
    public static int[] field506;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V", line = 10)
    private final void method188(byte arg0) throws IOException {
        field475++;
        if (arg0 != -22) {
            method195(-125, null, null);
        }
        if (this.field493 == -1L) {
            return;
        }
        if (this.field493 != this.field487) {
            this.field503.method119(11255, this.field493);
            this.field487 = this.field493;
        }
        long var2 = -1L;
        this.field503.method121(0, this.field474, true, this.field470);
        this.field487 += this.field474;
        if (this.field493 >= this.field481 && this.field493 < (long) this.field501 + this.field481) {
            var2 = this.field493;
        } else if (this.field493 <= this.field481 && this.field493 + (long) this.field474 > this.field481) {
            var2 = this.field481;
        }
        long var4 = -1L;
        if ((long) this.field474 + this.field493 > this.field481 && (long) this.field501 + this.field481 >= this.field493 - -((long) this.field474)) {
            var4 = (long) this.field474 + this.field493;
        } else if ((long) this.field501 + this.field481 > this.field493 && this.field493 + (long) this.field474 >= (long) this.field501 + this.field481) {
            var4 = (long) this.field501 + this.field481;
        }
        if (this.field487 > this.field507) {
            this.field507 = this.field487;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class27.method268(this.field470, (int) (var2 - this.field493), this.field510, (int) (var2 - this.field481), var6);
        }
        this.field493 = -1L;
        this.field474 = 0;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 90)
    public static final void method189(int arg0) {
        field505++;
        class54.field1383.method434((byte) -76);
        class11.field293.method434((byte) -76);
        class18.field434.method434((byte) -76);
        class46.field1182.method434((byte) -76);
        if (arg0 >= -104) {
            field499 = 48;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 105)
    public final void method190(int arg0) throws IOException {
        if (arg0 < -60) {
            this.method188((byte) -22);
            this.field503.method120((byte) -123);
            field483++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B[BII)V", line = 117)
    public final void method191(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field502++;
        try {
            if ((long) arg2 + this.field484 > this.field480) {
                this.field480 = (long) arg2 + this.field484;
            }
            if (this.field493 != -1L && (this.field484 < this.field493 || this.field484 > (long) this.field474 + this.field493)) {
                this.method188((byte) -22);
            }
            if (this.field493 != -1L && (long) arg2 + this.field484 > (long) this.field470.length + this.field493) {
                int var5 = (int) (this.field493 + (long) this.field470.length - this.field484);
                arg2 -= var5;
                class27.method268(arg1, arg3, this.field470, (int) (this.field484 - this.field493), var5);
                arg3 += var5;
                this.field484 += var5;
                this.field474 = this.field470.length;
                this.method188((byte) -22);
            }
            if (this.field470.length < arg2) {
                if (this.field487 != this.field484) {
                    this.field503.method119(11255, this.field484);
                    this.field487 = this.field484;
                }
                long var6 = -1L;
                this.field503.method121(arg3, arg2, true, arg1);
                if (this.field481 <= this.field484 && this.field481 + (long) this.field501 > this.field484) {
                    var6 = this.field484;
                } else if (this.field484 <= this.field481 && this.field481 < (long) arg2 + this.field484) {
                    var6 = this.field481;
                }
                this.field487 += arg2;
                if (this.field507 < this.field487) {
                    this.field507 = this.field487;
                }
                long var8 = -1L;
                if (this.field481 < (long) arg2 + this.field484 && (long) this.field501 + this.field481 >= (long) arg2 + this.field484) {
                    var8 = (long) arg2 + this.field484;
                } else if ((long) this.field501 + this.field481 > this.field484 && (long) arg2 + this.field484 >= this.field481 - -((long) this.field501)) {
                    var8 = (long) this.field501 + this.field481;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class27.method268(arg1, (int) ((long) arg3 + var6 - this.field484), this.field510, (int) (var6 - this.field481), var10);
                }
                this.field484 += arg2;
            } else if (arg0 == -113 && arg2 > 0) {
                if (this.field493 == -1L) {
                    this.field493 = this.field484;
                }
                class27.method268(arg1, arg3, this.field470, (int) (this.field484 - this.field493), arg2);
                this.field484 += arg2;
                if (this.field484 - this.field493 > (long) this.field474) {
                    this.field474 = (int) (this.field484 - this.field493);
                }
            }
        } catch (IOException var12) {
            this.field487 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(I)J", line = 263)
    public final long method192(int arg0) {
        if (arg0 > -81) {
            field497 = -44L;
        }
        field494++;
        return this.field480;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Ljava/awt/Component;B)V", line = 283)
    public static final void method193(Component arg0, byte arg1) {
        if (arg1 < 25) {
            method197(-51);
        }
        field473++;
        arg0.addMouseListener(class125.field3039);
        arg0.addMouseMotionListener(class125.field3039);
    }

    @OriginalMember(owner = "client!d", name = "d", descriptor = "(I)V", line = 342)
    private final void method194(int arg0) throws IOException {
        this.field501 = 0;
        field492++;
        if (this.field487 != this.field484) {
            this.field503.method119(arg0 ^ 0xFFFF8CBF, this.field484);
            this.field487 = this.field484;
        }
        if (arg0 != -22712) {
            return;
        }
        this.field481 = this.field484;
        while (this.field510.length > this.field501) {
            int var2 = this.field503.method116(this.field510.length - this.field501, this.field501, this.field510, arg0 + 22711);
            if (var2 == -1) {
                break;
            }
            this.field501 += var2;
            this.field487 += var2;
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lbe;II)V", line = 715)
    public class19(class12 arg0, int arg1, int arg2) throws IOException {
        this.field503 = arg0;
        this.field480 = this.field507 = arg0.method118(true);
        this.field484 = 0L;
        this.field470 = new byte[arg2];
        this.field510 = new byte[arg1];
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ILjava/awt/Component;Ljc;)V", line = 417)
    public static final void method195(int arg0, Component arg1, class57 arg2) {
        field495++;
        try {
            class79 var3 = (class79) Class.forName("qc").getDeclaredConstructor().newInstance();
            var3.method660(arg2, 2048);
            if (arg0 == 9016) {
                class103.field2543 = var3;
            }
        } catch (Throwable var6) {
            try {
                class103.field2543 = new class71(arg2, arg1);
            } catch (Throwable var5) {
                if (class57.field1506.toLowerCase().indexOf("microsoft") >= 0) {
                    try {
                        class103.field2543 = new class130();
                        return;
                    } catch (Throwable var4) {
                    }
                }
                class103.field2543 = new class22(8000);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZII[B)V", line = 464)
    public final void method196(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field504++;
        try {
            if (arg2 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field493 != -1L && this.field493 <= this.field484 && (long) this.field474 + this.field493 >= this.field484 - -((long) arg1)) {
                class27.method268(this.field470, (int) (this.field484 - this.field493), arg3, arg2, arg1);
                this.field484 += arg1;
                return;
            }
            long var5 = this.field484;
            int var7 = arg2;
            int var8 = arg1;
            if (this.field484 >= this.field481 && this.field481 + (long) this.field501 > this.field484) {
                int var9 = (int) (this.field481 + (long) this.field501 - this.field484);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class27.method268(this.field510, (int) (this.field484 - this.field481), arg3, arg2, var9);
                this.field484 += var9;
                arg2 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field510.length) {
                this.field503.method119(11255, this.field484);
                this.field487 = this.field484;
                while (arg1 > 0) {
                    int var11 = this.field503.method116(arg1, arg2, arg3, -1);
                    if (var11 == -1) {
                        break;
                    }
                    arg1 -= var11;
                    this.field487 += var11;
                    arg2 += var11;
                    this.field484 += var11;
                }
            } else if (arg1 > 0) {
                this.method194(-22712);
                int var10 = arg1;
                if (this.field501 < arg1) {
                    var10 = this.field501;
                }
                class27.method268(this.field510, 0, arg3, arg2, var10);
                this.field484 += var10;
                arg1 -= var10;
                arg2 += var10;
            }
            if (this.field493 != -1L) {
                if (this.field484 < this.field493 && arg1 > 0) {
                    int var12 = (int) (this.field493 - this.field484) + arg2;
                    if (arg1 + arg2 < var12) {
                        var12 = arg2 + arg1;
                    }
                    while (arg2 < var12) {
                        arg1--;
                        arg3[arg2++] = 0;
                        this.field484++;
                    }
                }
                long var13 = -1L;
                if (this.field493 >= var5 && this.field493 < var5 + (long) var8) {
                    var13 = this.field493;
                } else if (var5 >= this.field493 && (long) this.field474 + this.field493 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (this.field493 + (long) this.field474 > var5 && (long) var8 + var5 >= (long) this.field474 + this.field493) {
                    var15 = (long) this.field474 + this.field493;
                } else if ((long) var8 + var5 > this.field493 && (long) var8 + var5 <= (long) this.field474 + this.field493) {
                    var15 = var5 + (long) var8;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class27.method268(this.field470, (int) (var13 - this.field493), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field484) {
                        arg1 = (int) ((long) arg1 + this.field484 - var15);
                        this.field484 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field487 = -1L;
            throw var19;
        }
        if (!arg0) {
            field496 = 67;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!d", name = "e", descriptor = "(I)V", line = 677)
    public static void method197(int arg0) {
        field506 = null;
        field478 = null;
        field488 = null;
        field482 = null;
        field511 = null;
        field485 = null;
        field516 = null;
        field471 = null;
        field514 = null;
        field477 = null;
        field498 = null;
        field500 = null;
        field512 = null;
        field515 = null;
        if (arg0 == -20941) {
            field509 = null;
            field486 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZJ)V", line = 749)
    public final void method198(boolean arg0, long arg1) {
        field491++;
        if (arg1 >= 0L && arg0) {
            this.field484 = arg1;
        }
    }
}
