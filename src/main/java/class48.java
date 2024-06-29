import java.awt.Container;
import java.awt.Insets;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class48 {

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    private int field694 = 0;

    @OriginalMember(owner = "client!il", name = "G", descriptor = "J")
    private long field705 = -1L;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "J")
    private long field683 = -1L;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "Lqc;")
    private class4 field674;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "J")
    private long field699;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "J")
    private long field691;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "[B")
    private byte[] field689;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "[B")
    private byte[] field693;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "J")
    private long field700;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[Ldf;")
    public static class142[] field685 = new class142[50];

    @OriginalMember(owner = "client!il", name = "e", descriptor = "[I")
    public static int[] field677 = new int[5];

    @OriginalMember(owner = "client!il", name = "y", descriptor = "Ljava/lang/String;")
    public static String field697 = "Loaded sprites";

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
    public static boolean field695 = true;

    @OriginalMember(owner = "client!il", name = "F", descriptor = "I")
    public static int field704 = 10;

    @OriginalMember(owner = "client!il", name = "I", descriptor = "Ljava/lang/String;")
    public static String field707 = "Please remove ";

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Lqd;")
    public static class37 field682 = new class37(64);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    private int field673;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field692;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "I")
    public static int field702;

    @OriginalMember(owner = "client!il", name = "E", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!il", name = "H", descriptor = "I")
    public static int field706;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "J")
    private long field680;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "Lij;")
    public static class69 field678;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)J")
    public final long method314(int arg0) {
        if (arg0 != -27415) {
            method323(53, (String) null, (byte) -50);
        }
        field686++;
        return this.field691;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILha;III)V")
    public static final void method315(int arg0, class267 arg1, int arg2, int arg3, int arg4) {
        if (class30.field423 >= 3) {
            class144.method949(arg0, arg2, 0, arg1.field4163, arg1.field4136);
        } else {
            ((class244) class145.field2077).method1304(arg0, arg2, arg1.field4177, arg1.field4051, class145.field2077.field1075 / 2, class145.field2077.field1084 / 2, class245.field3667, 256, arg1.field4163, arg1.field4136);
        }
        if (arg4 != -2319) {
            field682 = null;
        }
        class119.field1753[arg3] = true;
        field692++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II[BZ)V")
    public final void method316(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        field688++;
        try {
            if (!arg3) {
                field697 = null;
            }
            if (((long) arg0 + this.field700) > this.field691) {
                this.field691 = (long) arg0 + this.field700;
            }
            if (this.field705 != -1L && (this.field700 < this.field705 || this.field700 > (long) this.field694 + this.field705)) {
                this.method321(true);
            }
            if (this.field705 != -1L && (this.field705 + ((long) this.field693.length)) < (this.field700 + ((long) arg0))) {
                int var5 = (int) (this.field705 + (long) this.field693.length - this.field700);
                arg0 -= var5;
                class164.method1098(arg2, arg1, this.field693, (int) (this.field700 - this.field705), var5);
                arg1 += var5;
                this.field700 += (long) var5;
                this.field694 = this.field693.length;
                this.method321(true);
            }
            if (this.field693.length < arg0) {
                if (this.field700 != this.field680) {
                    this.field674.method53(-26525, this.field700);
                    this.field680 = this.field700;
                }
                long var6 = -1L;
                this.field674.method52(1, arg1, arg2, arg0);
                if (this.field683 <= this.field700 && ((long) this.field673 + this.field683) > this.field700) {
                    var6 = this.field700;
                } else if (this.field683 >= this.field700 && ((long) arg0 + this.field700) > this.field683) {
                    var6 = this.field683;
                }
                long var8 = -1L;
                this.field680 += (long) arg0;
                if (this.field699 < this.field680) {
                    this.field699 = this.field680;
                }
                if (((long) arg0 + this.field700) > this.field683 && (long) arg0 + this.field700 <= (long) this.field673 + this.field683) {
                    var8 = (long) arg0 + this.field700;
                } else if (this.field683 + ((long) this.field673) > this.field700 && ((long) this.field673 + this.field683) <= ((long) arg0 + this.field700)) {
                    var8 = this.field683 + ((long) this.field673);
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class164.method1098(arg2, (int) ((long) arg1 + var6 - this.field700), this.field689, (int) (var6 - this.field683), var10);
                }
                this.field700 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field705 == -1L) {
                    this.field705 = this.field700;
                }
                class164.method1098(arg2, arg1, this.field693, (int) (this.field700 - this.field705), arg0);
                this.field700 += (long) arg0;
                if ((long) this.field694 < this.field700 - this.field705) {
                    this.field694 = (int) (this.field700 - this.field705);
                }
            }
        } catch (IOException var12) {
            this.field680 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I[B)V")
    public final void method317(int arg0, byte[] arg1) throws IOException {
        field701++;
        this.method324(arg1, arg1.length, arg0, -1);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method318(int arg0) {
        field676++;
        if (arg0 != 7208) {
            field682 = null;
        }
        return this.field674.method54((byte) -65);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)V")
    public final void method319(boolean arg0) throws IOException {
        this.method321(arg0);
        field684++;
        this.field674.method50(1);
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
    public static final void method320(int arg0) {
        field690++;
        Container var1;
        if (class166.field2415 != null) {
            var1 = class166.field2415;
        } else if (class282.field4503 == null) {
            var1 = class163.field2378.field1273;
        } else {
            var1 = class282.field4503;
        }
        int var2 = 86 / ((arg0 - 74) / 38);
        class286.field4545 = var1.getSize().width;
        class191.field2735 = var1.getSize().height;
        if (class282.field4503 == var1) {
            Insets var3 = class282.field4503.getInsets();
            class191.field2735 -= var3.top + var3.bottom;
            class286.field4545 -= var3.right + var3.left;
        }
        if (class24.method178(-16648) < 2) {
            class290.field4581 = (class286.field4545 - 765) / 2;
            class250.field3813 = 503;
            class23.field294 = 0;
            class214.field3080 = 765;
        } else {
            class290.field4581 = 0;
            class23.field294 = 0;
            class214.field3080 = class286.field4545;
            class250.field3813 = class191.field2735;
        }
        class80.field1247.setSize(class214.field3080, class250.field3813);
        if (class282.field4503 == var1) {
            Insets var4 = class282.field4503.getInsets();
            class80.field1247.setLocation(class290.field4581 + var4.left, var4.top - -class23.field294);
        } else {
            class80.field1247.setLocation(class290.field4581, class23.field294);
        }
        if (class193.field2774 != -1) {
            class38.method266(0, true);
        }
        client.method1441(true);
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(Z)V")
    private final void method321(boolean arg0) throws IOException {
        if (!arg0) {
            return;
        }
        if (this.field705 != -1L) {
            if (this.field705 != this.field680) {
                this.field674.method53(-26525, this.field705);
                this.field680 = this.field705;
            }
            long var2 = -1L;
            this.field674.method52(1, 0, this.field693, this.field694);
            this.field680 += (long) this.field694;
            if (this.field699 < this.field680) {
                this.field699 = this.field680;
            }
            long var4 = -1L;
            if (this.field705 >= this.field683 && this.field705 < ((long) this.field673 + this.field683)) {
                var2 = this.field705;
            } else if (this.field705 <= this.field683 && ((long) this.field694 + this.field705) > this.field683) {
                var2 = this.field683;
            }
            if (this.field683 < ((long) this.field694 + this.field705) && ((long) this.field673 + this.field683) >= ((long) this.field694 + this.field705)) {
                var4 = (long) this.field694 + this.field705;
            } else if (this.field705 < ((long) this.field673 + this.field683) && this.field705 + ((long) this.field694) >= (long) this.field673 + this.field683) {
                var4 = this.field683 + ((long) this.field673);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class164.method1098(this.field693, (int) (var2 - this.field705), this.field689, (int) (var2 - this.field683), var6);
            }
            this.field694 = 0;
            this.field705 = -1L;
        }
        field681++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    public static final void method322(int arg0, int arg1) {
        field698++;
        class270 var2 = class190.method1213(25702, arg0, arg1);
        var2.method1806(arg1 ^ 0xFFFFE01F);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method323(int arg0, String arg1, byte arg2) {
        if (arg2 != 16) {
            return;
        }
        class95.field1451.method522(88, 28727);
        field687++;
        class129.field1892++;
        class95.field1451.method765(arg2 + 532401296, class109.method712((byte) 74, arg1));
        class95.field1451.method766(123, arg0);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "([BIII)V")
    public final void method324(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field703++;
        try {
            if (arg1 + arg2 > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field705 != -1L && this.field705 <= this.field700 && ((long) arg1 + this.field700) <= ((long) this.field694 + this.field705)) {
                class164.method1098(this.field693, (int) (this.field700 - this.field705), arg0, arg2, arg1);
                this.field700 += (long) arg1;
                return;
            }
            int var5 = arg1;
            long var6 = this.field700;
            int var8 = arg2;
            if (this.field683 <= this.field700 && (long) this.field673 + this.field683 > this.field700) {
                int var9 = (int) ((long) this.field673 - (this.field700 - this.field683));
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class164.method1098(this.field689, (int) (this.field700 - this.field683), arg0, arg2, var9);
                this.field700 += (long) var9;
                arg2 += var9;
            }
            if (arg1 > this.field689.length) {
                this.field674.method53(-26525, this.field700);
                this.field680 = this.field700;
                while (arg1 > 0) {
                    int var11 = this.field674.method51(arg2, arg1, arg0, (byte) 90);
                    if (var11 == -1) {
                        break;
                    }
                    this.field680 += (long) var11;
                    arg2 += var11;
                    arg1 -= var11;
                    this.field700 += (long) var11;
                }
            } else if (arg1 > 0) {
                this.method328(-11092);
                int var10 = arg1;
                if (this.field673 < arg1) {
                    var10 = this.field673;
                }
                arg1 -= var10;
                class164.method1098(this.field689, 0, arg0, arg2, var10);
                arg2 += var10;
                this.field700 += (long) var10;
            }
            if ((long) arg3 != this.field705) {
                if (this.field700 < this.field705 && arg1 > 0) {
                    int var12 = (int) (this.field705 - this.field700) + arg2;
                    if (arg1 + arg2 < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg2) {
                        arg0[arg2++] = 0;
                        this.field700++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (this.field705 + ((long) this.field694) > var6 && (long) this.field694 + this.field705 <= (long) var5 + var6) {
                    var13 = (long) this.field694 + this.field705;
                } else if (this.field705 < ((long) var5 + var6) && (long) var5 + var6 <= (long) this.field694 + this.field705) {
                    var13 = (long) var5 + var6;
                }
                long var15 = -1L;
                if (this.field705 >= var6 && this.field705 < ((long) var5 + var6)) {
                    var15 = this.field705;
                } else if (var6 >= this.field705 && ((long) this.field694 + this.field705) > var6) {
                    var15 = var6;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class164.method1098(this.field693, (int) (var15 - this.field705), arg0, (int) (var15 - var6) + var8, var17);
                    if (this.field700 < var13) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field700));
                        this.field700 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field680 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IJ)V")
    public final void method325(int arg0, long arg1) throws IOException {
        field675++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method318(7208));
        }
        this.field700 = arg1;
        if (arg0 != -474049592) {
            this.field673 = -72;
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
    public static final void method326(int arg0, int arg1) {
        if (arg0 != -17331) {
            field697 = null;
        }
        class225.field3382.method258(arg1, (byte) 54);
        field706++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method327(byte arg0) {
        if (arg0 != 34) {
            field678 = null;
        }
        field677 = null;
        field678 = null;
        field707 = null;
        field682 = null;
        field697 = null;
        field685 = null;
    }

    @OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
    private final void method328(int arg0) throws IOException {
        this.field673 = 0;
        if (this.field700 != this.field680) {
            this.field674.method53(-26525, this.field700);
            this.field680 = this.field700;
        }
        this.field683 = this.field700;
        field696++;
        while (this.field689.length > this.field673) {
            int var2 = this.field689.length - this.field673;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field674.method51(this.field673, var2, this.field689, (byte) 90);
            if (var3 == -1) {
                break;
            }
            this.field673 += var3;
            this.field680 += (long) var3;
        }
        if (arg0 != -11092) {
            method323(22, (String) null, (byte) 44);
        }
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lqc;II)V")
    public class48(class4 arg0, int arg1, int arg2) throws IOException {
        this.field674 = arg0;
        this.field691 = this.field699 = arg0.method49(0);
        this.field689 = new byte[arg1];
        this.field693 = new byte[arg2];
        this.field700 = 0L;
    }
}
