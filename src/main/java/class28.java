import java.awt.Component;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class28 {

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "J")
    private long field513 = -1L;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "J")
    private long field507 = -1L;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    private int field493 = 0;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "Lnh;")
    private class56 field491;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "J")
    private long field516;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "J")
    private long field506;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "[B")
    private byte[] field498;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "[B")
    private byte[] field509;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "J")
    private long field520;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "[Lhd;")
    public static class12[] field494 = new class12[2048];

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "I")
    public static int field515 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "J")
    private long field500;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[[I")
    public static int[][] field499;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)V")
    public final void method213(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field490++;
        try {
            if (((long) arg0 + this.field520) > this.field506) {
                this.field506 = (long) arg0 + this.field520;
            }
            if (this.field513 != -1L && (this.field520 < this.field513 || ((long) this.field493 + this.field513) < this.field520)) {
                this.method222(false);
            }
            if (this.field513 != -1L && ((long) arg0 + this.field520) > ((long) this.field509.length + this.field513)) {
                int var5 = (int) ((long) this.field509.length + this.field513 - this.field520);
                class282.method1921(arg3, arg1, this.field509, (int) (this.field520 - this.field513), var5);
                arg0 -= var5;
                arg1 += var5;
                this.field520 += (long) var5;
                this.field493 = this.field509.length;
                this.method222(false);
            }
            if (arg2 != -6722) {
                this.field500 = 29L;
            }
            if (this.field509.length < arg0) {
                if (this.field520 != this.field500) {
                    this.field491.method362(true, this.field520);
                    this.field500 = this.field520;
                }
                this.field491.method363(arg1, -1, arg0, arg3);
                this.field500 += (long) arg0;
                long var6 = -1L;
                long var8 = -1L;
                if (this.field507 <= this.field520 && ((long) this.field492 + this.field507) > this.field520) {
                    var6 = this.field520;
                } else if (this.field520 <= this.field507 && this.field507 < ((long) arg0 + this.field520)) {
                    var6 = this.field507;
                }
                if (this.field500 > this.field516) {
                    this.field516 = this.field500;
                }
                if (this.field507 < ((long) arg0 + this.field520) && ((long) arg0 + this.field520) <= ((long) this.field492 + this.field507)) {
                    var8 = (long) arg0 + this.field520;
                } else if (this.field520 < ((long) this.field492 + this.field507) && this.field507 + ((long) this.field492) <= (long) arg0 + this.field520) {
                    var8 = (long) this.field492 + this.field507;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class282.method1921(arg3, (int) ((long) arg1 + var6 - this.field520), this.field498, (int) (var6 - this.field507), var10);
                }
                this.field520 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field513 == -1L) {
                    this.field513 = this.field520;
                }
                class282.method1921(arg3, arg1, this.field509, (int) (this.field520 - this.field513), arg0);
                this.field520 += (long) arg0;
                if (this.field520 - this.field513 > (long) this.field493) {
                    this.field493 = (int) (this.field520 - this.field513);
                }
            }
        } catch (IOException var12) {
            this.field500 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)J")
    public final long method214(boolean arg0) {
        field495++;
        if (!arg0) {
            this.field493 = 63;
        }
        return this.field506;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)I")
    public static final int method215(int arg0) {
        if (arg0 != 15174) {
            field499 = null;
        }
        field503++;
        return 0;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lrg;III)V")
    public static final void method216(class248 arg0, int arg1, int arg2, int arg3) {
        if (arg0.field3894 == 0) {
            arg0.field3916 = arg0.field4026;
        } else if (arg0.field3894 == 1) {
            arg0.field3916 = (arg1 - arg0.field4057) / 2 + arg0.field4026;
        } else if (arg0.field3894 == 2) {
            arg0.field3916 = arg1 - arg0.field4057 - arg0.field4026;
        } else if (arg0.field3894 == 3) {
            arg0.field3916 = arg0.field4026 * arg1 >> 14;
        } else if (arg0.field3894 == 4) {
            arg0.field3916 = (arg0.field4026 * arg1 >> 14) + (arg1 - arg0.field4057) / 2;
        } else {
            arg0.field3916 = arg1 - arg0.field4057 - (arg0.field4026 * arg1 >> 14);
        }
        if (arg0.field3972 == 0) {
            arg0.field4037 = arg0.field4003;
        } else if (arg0.field3972 == 1) {
            arg0.field4037 = (arg2 - arg0.field4016) / 2 + arg0.field4003;
        } else if (arg0.field3972 == 2) {
            arg0.field4037 = arg2 - arg0.field4016 - arg0.field4003;
        } else if (arg0.field3972 == 3) {
            arg0.field4037 = arg0.field4003 * arg2 >> 14;
        } else if (arg0.field3972 == 4) {
            arg0.field4037 = (arg0.field4003 * arg2 >> 14) + (arg2 - arg0.field4016) / 2;
        } else {
            arg0.field4037 = arg2 - (arg0.field4003 * arg2 >> 14) - arg0.field4016;
        }
        field502++;
        if (arg3 >= -105 || !class61.field881) {
            return;
        }
        if (client.method1126(arg0).field427 == 0 && arg0.field4038 != 0) {
            return;
        }
        if (arg0.field3916 < 0) {
            arg0.field3916 = 0;
        } else if (arg0.field4057 + arg0.field3916 > arg1) {
            arg0.field3916 = arg1 - arg0.field4057;
        }
        if (arg0.field4037 < 0) {
            arg0.field4037 = 0;
            return;
        }
        if (arg2 < arg0.field4037 + arg0.field4016) {
            arg0.field4037 = arg2 - arg0.field4016;
            return;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    private final void method217(int arg0) throws IOException {
        this.field492 = 0;
        field501++;
        if (this.field520 != this.field500) {
            this.field491.method362(true, this.field520);
            this.field500 = this.field520;
        }
        if (arg0 != 200000000) {
            this.field516 = -76L;
        }
        this.field507 = this.field520;
        while (this.field498.length > this.field492) {
            int var2 = this.field498.length - this.field492;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field491.method361(this.field492, this.field498, var2, (byte) -38);
            if (var3 == -1) {
                break;
            }
            this.field492 += var3;
            this.field500 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "([BIII)V")
    public final void method218(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field508++;
        try {
            if (arg0.length < arg2 + arg3) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg3 - arg0.length);
            }
            if (this.field513 != -1L && this.field513 <= this.field520 && this.field513 + ((long) this.field493) >= (long) arg3 + this.field520) {
                class282.method1921(this.field509, (int) (this.field520 - this.field513), arg0, arg2, arg3);
                this.field520 += (long) arg3;
                return;
            }
            if (arg1 > -51) {
                this.field492 = 69;
            }
            int var5 = arg2;
            int var6 = arg3;
            long var7 = this.field520;
            if (this.field507 <= this.field520 && (this.field507 + ((long) this.field492)) > this.field520) {
                int var9 = (int) ((long) this.field492 + this.field507 - this.field520);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class282.method1921(this.field498, (int) (this.field520 - this.field507), arg0, arg2, var9);
                arg3 -= var9;
                this.field520 += (long) var9;
                arg2 += var9;
            }
            if (this.field498.length < arg3) {
                this.field491.method362(true, this.field520);
                this.field500 = this.field520;
                while (arg3 > 0) {
                    int var10 = this.field491.method361(arg2, arg0, arg3, (byte) -38);
                    if (var10 == -1) {
                        break;
                    }
                    this.field520 += (long) var10;
                    this.field500 += (long) var10;
                    arg2 += var10;
                    arg3 -= var10;
                }
            } else if (arg3 > 0) {
                this.method217(200000000);
                int var11 = arg3;
                if (arg3 > this.field492) {
                    var11 = this.field492;
                }
                class282.method1921(this.field498, 0, arg0, arg2, var11);
                arg2 += var11;
                arg3 -= var11;
                this.field520 += (long) var11;
            }
            if (this.field513 != -1L) {
                if (this.field520 < this.field513 && arg3 > 0) {
                    int var12 = arg2 + ((int) (this.field513 - this.field520));
                    if (arg2 + arg3 < var12) {
                        var12 = arg2 + arg3;
                    }
                    while (arg2 < var12) {
                        arg0[arg2++] = 0;
                        this.field520++;
                        arg3--;
                    }
                }
                long var13 = -1L;
                if (var7 <= this.field513 && (long) var6 + var7 > this.field513) {
                    var13 = this.field513;
                } else if (var7 >= this.field513 && (this.field513 + ((long) this.field493)) > var7) {
                    var13 = var7;
                }
                long var15 = -1L;
                if ((long) this.field493 + this.field513 > var7 && ((long) this.field493 + this.field513) <= (var7 + ((long) var6))) {
                    var15 = (long) this.field493 + this.field513;
                } else if ((long) var6 + var7 > this.field513 && ((long) this.field493 + this.field513) >= ((long) var6 + var7)) {
                    var15 = (long) var6 + var7;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class282.method1921(this.field509, (int) (var13 - this.field513), arg0, (int) (var13 - var7) + var5, var17);
                    if (this.field520 < var15) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field520));
                        this.field520 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field500 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    public static final void method219(int arg0) {
        class229.field3584.method2085(arg0 ^ 0x77);
        field519++;
        int var1 = class229.field3584.method2087(8, (byte) -29);
        if (class91.field1439 > var1) {
            for (int var2 = var1; var2 < class91.field1439; var2++) {
                class75.field1214[class97.field1538++] = class34.field556[var2];
            }
        }
        if (var1 > class91.field1439) {
            throw new RuntimeException("gnpov1");
        } else if (arg0 == 1) {
            class91.field1439 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class34.field556[var3];
                class104 var5 = class131.field2113[var4];
                int var6 = class229.field3584.method2087(1, (byte) 7);
                if (var6 == 0) {
                    class34.field556[class91.field1439++] = var4;
                    var5.field907 = class274.field4472;
                } else {
                    int var7 = class229.field3584.method2087(2, (byte) 124);
                    if (var7 == 0) {
                        class34.field556[class91.field1439++] = var4;
                        var5.field907 = class274.field4472;
                        class189.field3100[class57.field830++] = var4;
                    } else if (var7 == 1) {
                        class34.field556[class91.field1439++] = var4;
                        var5.field907 = class274.field4472;
                        int var8 = class229.field3584.method2087(3, (byte) 122);
                        var5.method400(1, 32, var8);
                        int var9 = class229.field3584.method2087(1, (byte) -83);
                        if (var9 == 1) {
                            class189.field3100[class57.field830++] = var4;
                        }
                    } else if (var7 == 2) {
                        class34.field556[class91.field1439++] = var4;
                        var5.field907 = class274.field4472;
                        if (class229.field3584.method2087(1, (byte) 126) == 1) {
                            int var10 = class229.field3584.method2087(3, (byte) 125);
                            var5.method400(2, 32, var10);
                            int var11 = class229.field3584.method2087(3, (byte) 123);
                            var5.method400(2, 32, var11);
                        } else {
                            int var12 = class229.field3584.method2087(3, (byte) 125);
                            var5.method400(0, 32, var12);
                        }
                        int var13 = class229.field3584.method2087(1, (byte) -98);
                        if (var13 == 1) {
                            class189.field3100[class57.field830++] = var4;
                        }
                    } else if (var7 == 3) {
                        class75.field1214[class97.field1538++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method220(byte arg0) {
        int var1 = 0 / ((arg0 + 45) / 49);
        if (class76.field1233 == null || class144.field2323 == null) {
            class76.field1233 = new int[256];
            class144.field2323 = new int[256];
            for (int var2 = 0; var2 < 256; var2++) {
                double var3 = (double) var2 / 255.0D * 6.283185307179586D;
                class76.field1233[var2] = (int) (Math.sin(var3) * 4096.0D);
                class144.field2323[var2] = (int) (Math.cos(var3) * 4096.0D);
            }
        }
        field511++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BD)V")
    public static final void method221(byte arg0, double arg1) {
        field489++;
        if (class302.field4946 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class89.field1386[var3] = var4 > 255 ? 255 : var4;
            }
            class302.field4946 = arg1;
        }
        int var5 = -41 / ((arg0 + 70) / 53);
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    private final void method222(boolean arg0) throws IOException {
        if (this.field513 != -1L) {
            if (this.field513 != this.field500) {
                this.field491.method362(!arg0, this.field513);
                this.field500 = this.field513;
            }
            long var2 = -1L;
            this.field491.method363(0, -1, this.field493, this.field509);
            if (((long) this.field493 + this.field513) > this.field507 && this.field513 + ((long) this.field493) <= (long) this.field492 + this.field507) {
                var2 = (long) this.field493 + this.field513;
            } else if (this.field513 < this.field507 + ((long) this.field492) && ((long) this.field492 + this.field507) <= ((long) this.field493 + this.field513)) {
                var2 = (long) this.field492 + this.field507;
            }
            this.field500 += (long) this.field493;
            long var4 = -1L;
            if (this.field500 > this.field516) {
                this.field516 = this.field500;
            }
            if (this.field513 >= this.field507 && this.field513 < (long) this.field492 + this.field507) {
                var4 = this.field513;
            } else if (this.field513 <= this.field507 && ((long) this.field493 + this.field513) > this.field507) {
                var4 = this.field507;
            }
            if (var4 > -1L && var4 < var2) {
                int var6 = (int) (var2 - var4);
                class282.method1921(this.field509, (int) (var4 - this.field513), this.field498, (int) (var4 - this.field507), var6);
            }
            this.field513 = -1L;
            this.field493 = 0;
        }
        field517++;
        if (arg0) {
            method228(true);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B[B)V")
    public final void method223(byte arg0, byte[] arg1) throws IOException {
        field510++;
        if (arg0 == -43) {
            this.method218(arg1, -88, 0, arg1.length);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method224(Component arg0, int arg1) {
        field504++;
        arg0.removeMouseListener(class149.field2381);
        arg0.removeMouseMotionListener(class149.field2381);
        arg0.removeFocusListener(class149.field2381);
        if (arg1 >= -108) {
            field515 = 103;
        }
        class265.field4316 = 0;
    }

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method225(int arg0) {
        if (arg0 <= 55) {
            return null;
        } else {
            field505++;
            return this.field491.method364((byte) 93);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BJ)V")
    public final void method226(byte arg0, long arg1) throws IOException {
        if (arg0 >= -59) {
            this.field492 = 90;
        }
        field514++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method225(65));
        }
        this.field520 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "(I)V")
    public static void method227(int arg0) {
        if (arg0 == 15283) {
            field494 = null;
            field499 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)Lnf;")
    public static final class166 method228(boolean arg0) {
        if (arg0) {
            method229((class164) null, 1);
        }
        field497++;
        return class262.field4273;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lgi;I)V")
    public static final void method229(class164 arg0, int arg1) {
        field518++;
        if (class48.field715) {
            return;
        }
        class94.method678();
        class148.field2373 = class93.method648(arg1 + 129, arg0, class49.field721);
        int var2 = class195.field3161;
        int var3 = var2 * 956 / 503;
        class148.field2373.method450((class154.field2463 - var3) / 2, 0, var3, var2);
        class287.field4641 = class65.method431(arg0, class34.field560, 120);
        class287.field4641.method13(class154.field2463 / 2 - (class287.field4641.field3179 / 2), 18);
        if (arg1 != -1) {
            field496 = -92;
        }
        class48.field715 = true;
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lnh;II)V")
    public class28(class56 arg0, int arg1, int arg2) throws IOException {
        this.field491 = arg0;
        this.field506 = this.field516 = arg0.method365(110);
        this.field498 = new byte[arg1];
        this.field509 = new byte[arg2];
        this.field520 = 0L;
    }
}
