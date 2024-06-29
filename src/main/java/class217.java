import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class217 {

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "J")
    private long field3486 = -1L;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "I")
    private int field3495 = 0;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "J")
    private long field3498 = -1L;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lme;")
    private class39 field3490;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "J")
    private long field3491;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "J")
    private long field3485;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "[B")
    private byte[] field3484;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "[B")
    private byte[] field3494;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "J")
    private long field3493;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "Z")
    public static boolean field3480 = false;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field3478 = 0;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "[I")
    public static int[] field3492 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field3488 = new String[500];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    private int field3481;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "J")
    private long field3479;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
    private final void method1436(byte arg0) throws IOException {
        if (arg0 > -6) {
            method1439(120);
        }
        field3499++;
        if (this.field3486 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field3486 != this.field3479) {
            this.field3490.method322(this.field3486, false);
            this.field3479 = this.field3486;
        }
        long var4 = -1L;
        this.field3490.method321(this.field3484, 0, -4938, this.field3495);
        if (this.field3498 < ((long) this.field3495 + this.field3486) && this.field3498 + ((long) this.field3481) >= (long) this.field3495 + this.field3486) {
            var2 = this.field3486 + ((long) this.field3495);
        } else if ((long) this.field3481 + this.field3498 > this.field3486 && (long) this.field3481 + this.field3498 <= (long) this.field3495 + this.field3486) {
            var2 = (long) this.field3481 + this.field3498;
        }
        if (this.field3486 >= this.field3498 && (long) this.field3481 + this.field3498 > this.field3486) {
            var4 = this.field3486;
        } else if (this.field3486 <= this.field3498 && this.field3498 < ((long) this.field3495 + this.field3486)) {
            var4 = this.field3498;
        }
        this.field3479 += (long) this.field3495;
        if (this.field3479 > this.field3491) {
            this.field3491 = this.field3479;
        }
        if (var4 > -1L && var2 > var4) {
            int var6 = (int) (var2 - var4);
            class68.method529(this.field3484, (int) (var4 - this.field3486), this.field3494, (int) (var4 - this.field3498), var6);
        }
        this.field3486 = -1L;
        this.field3495 = 0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IJ)V")
    public final void method1437(int arg0, long arg1) throws IOException {
        field3483++;
        if (arg0 < 71) {
            this.method1438(66);
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1443((byte) -3));
        }
        this.field3493 = arg1;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)J")
    public final long method1438(int arg0) {
        if (arg0 <= 43) {
            return 66L;
        } else {
            field3496++;
            return this.field3485;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static void method1439(int arg0) {
        field3492 = null;
        if (arg0 != -1) {
            field3480 = false;
        }
        field3488 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V")
    private final void method1440(byte arg0) throws IOException {
        this.field3481 = 0;
        if (arg0 <= 1) {
            this.field3481 = 14;
        }
        if (this.field3493 != this.field3479) {
            this.field3490.method322(this.field3493, false);
            this.field3479 = this.field3493;
        }
        field3497++;
        this.field3498 = this.field3493;
        while (this.field3494.length > this.field3481) {
            int var2 = this.field3494.length - this.field3481;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3490.method324(this.field3481, (byte) -81, this.field3494, var2);
            if (var3 == -1) {
                break;
            }
            this.field3479 += (long) var3;
            this.field3481 += var3;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lsb;B)V")
    public static final void method1441(class124 arg0, byte arg1) {
        class183.field3016 = arg0.method889("runes", -1);
        if (arg1 == -98) {
            field3482++;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IB[BI)V")
    public final void method1442(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field3487++;
        try {
            if (arg0 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (arg1 != 111) {
                this.method1443((byte) -28);
            }
            if (this.field3486 != -1L && this.field3493 >= this.field3486 && ((long) this.field3495 + this.field3486) >= ((long) arg3 + this.field3493)) {
                class68.method529(this.field3484, (int) (this.field3493 - this.field3486), arg2, arg0, arg3);
                this.field3493 += (long) arg3;
                return;
            }
            int var5 = arg0;
            long var6 = this.field3493;
            int var8 = arg3;
            if (this.field3493 >= this.field3498 && this.field3493 < (this.field3498 + ((long) this.field3481))) {
                int var9 = (int) ((long) this.field3481 + this.field3498 - this.field3493);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class68.method529(this.field3494, (int) (this.field3493 - this.field3498), arg2, arg0, var9);
                arg0 += var9;
                this.field3493 += (long) var9;
                arg3 -= var9;
            }
            if (arg3 > this.field3494.length) {
                this.field3490.method322(this.field3493, false);
                this.field3479 = this.field3493;
                while (arg3 > 0) {
                    int var10 = this.field3490.method324(arg0, (byte) -89, arg2, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3493 += (long) var10;
                    arg0 += var10;
                    this.field3479 += (long) var10;
                    arg3 -= var10;
                }
            } else if (arg3 > 0) {
                int var11 = arg3;
                this.method1440((byte) 23);
                if (this.field3481 < arg3) {
                    var11 = this.field3481;
                }
                class68.method529(this.field3494, 0, arg2, arg0, var11);
                arg0 += var11;
                arg3 -= var11;
                this.field3493 += (long) var11;
            }
            if (this.field3486 != -1L) {
                if (this.field3493 < this.field3486 && arg3 > 0) {
                    int var12 = (int) (this.field3486 - this.field3493) + arg0;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg0) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field3493++;
                    }
                }
                long var13 = -1L;
                if (this.field3486 >= var6 && this.field3486 < (long) var8 + var6) {
                    var13 = this.field3486;
                } else if (this.field3486 <= var6 && this.field3486 + ((long) this.field3495) > var6) {
                    var13 = var6;
                }
                long var15 = -1L;
                if (((long) this.field3495 + this.field3486) > var6 && (long) var8 + var6 >= (long) this.field3495 + this.field3486) {
                    var15 = (long) this.field3495 + this.field3486;
                } else if ((long) var8 + var6 > this.field3486 && ((long) this.field3495 + this.field3486) >= ((long) var8 + var6)) {
                    var15 = (long) var8 + var6;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class68.method529(this.field3484, (int) (var13 - this.field3486), arg2, (int) (var13 - var6) + var5, var17);
                    if (var15 > this.field3493) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field3493));
                        this.field3493 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3479 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)Ljava/io/File;")
    private final File method1443(byte arg0) {
        if (arg0 != -3) {
            method1441((class124) null, (byte) 12);
        }
        field3477++;
        return this.field3490.method326((byte) 99);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ[BI)V")
    public final void method1444(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        field3476++;
        try {
            if (this.field3485 < ((long) arg0 + this.field3493)) {
                this.field3485 = this.field3493 + ((long) arg0);
            }
            if (this.field3486 != -1L && (this.field3493 < this.field3486 || ((long) this.field3495 + this.field3486) < this.field3493)) {
                this.method1436((byte) -33);
            }
            if (arg1) {
                field3492 = null;
            }
            if (this.field3486 != -1L && (this.field3493 + ((long) arg0)) > ((long) this.field3484.length + this.field3486)) {
                int var5 = (int) (this.field3486 + (long) this.field3484.length - this.field3493);
                arg0 -= var5;
                class68.method529(arg2, arg3, this.field3484, (int) (this.field3493 - this.field3486), var5);
                arg3 += var5;
                this.field3493 += (long) var5;
                this.field3495 = this.field3484.length;
                this.method1436((byte) -127);
            }
            if (arg0 > this.field3484.length) {
                long var6 = -1L;
                if (this.field3493 != this.field3479) {
                    this.field3490.method322(this.field3493, arg1);
                    this.field3479 = this.field3493;
                }
                this.field3490.method321(arg2, arg3, -4938, arg0);
                if (this.field3498 <= this.field3493 && ((long) this.field3481 + this.field3498) > this.field3493) {
                    var6 = this.field3493;
                } else if (this.field3498 >= this.field3493 && ((long) arg0 + this.field3493) > this.field3498) {
                    var6 = this.field3498;
                }
                long var8 = -1L;
                if (this.field3498 < ((long) arg0 + this.field3493) && (long) arg0 + this.field3493 <= this.field3498 - -((long) this.field3481)) {
                    var8 = (long) arg0 + this.field3493;
                } else if ((long) this.field3481 + this.field3498 > this.field3493 && this.field3498 + ((long) this.field3481) <= (long) arg0 + this.field3493) {
                    var8 = (long) this.field3481 + this.field3498;
                }
                this.field3479 += (long) arg0;
                if (this.field3491 < this.field3479) {
                    this.field3491 = this.field3479;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class68.method529(arg2, (int) ((long) arg3 + var6 - this.field3493), this.field3494, (int) (var6 - this.field3498), var10);
                }
                this.field3493 += (long) arg0;
            } else if (arg0 > 0) {
                if (this.field3486 == -1L) {
                    this.field3486 = this.field3493;
                }
                class68.method529(arg2, arg3, this.field3484, (int) (this.field3493 - this.field3486), arg0);
                this.field3493 += (long) arg0;
                if (((long) this.field3495) < (this.field3493 - this.field3486)) {
                    this.field3495 = (int) (this.field3493 - this.field3486);
                }
            }
        } catch (IOException var12) {
            this.field3479 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I[B)V")
    public final void method1445(int arg0, byte[] arg1) throws IOException {
        field3475++;
        this.method1442(0, (byte) 111, arg1, arg1.length);
        int var3 = -13 / ((-arg0 - 80) / 44);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lme;II)V")
    public class217(class39 arg0, int arg1, int arg2) throws IOException {
        this.field3490 = arg0;
        this.field3485 = this.field3491 = arg0.method323((byte) 48);
        this.field3484 = new byte[arg2];
        this.field3494 = new byte[arg1];
        this.field3493 = 0L;
    }
}
