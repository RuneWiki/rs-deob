import java.awt.event.KeyEvent;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class155 {

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "J")
    private long field3534 = -1L;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "J")
    private long field3522 = -1L;

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
    private int field3535 = 0;

    @OriginalMember(owner = "client!wb", name = "C", descriptor = "Lv;")
    private class146 field3548;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "J")
    private long field3525;

    @OriginalMember(owner = "client!wb", name = "z", descriptor = "J")
    private long field3545;

    @OriginalMember(owner = "client!wb", name = "F", descriptor = "[B")
    private byte[] field3551;

    @OriginalMember(owner = "client!wb", name = "A", descriptor = "J")
    private long field3546;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "[B")
    private byte[] field3530;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "I")
    public static int field3527 = 500;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Z")
    public static boolean field3526 = false;

    @OriginalMember(owner = "client!wb", name = "t", descriptor = "Lje;")
    public static class67 field3539 = class85.method592(255, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!wb", name = "w", descriptor = "Lje;")
    private static class67 field3542 = class85.method592(255, "wishes to duel with you)3");

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "Lje;")
    public static class67 field3521 = field3542;

    @OriginalMember(owner = "client!wb", name = "u", descriptor = "I")
    public static int field3540 = 0;

    @OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
    public static int field3544 = 0;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "Lje;")
    public static class67 field3523 = class85.method592(255, "b12_full");

    @OriginalMember(owner = "client!wb", name = "G", descriptor = "Lje;")
    public static class67 field3552 = class85.method592(255, "Verbinde mit Server)3)3)3");

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    private int field3532;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!wb", name = "r", descriptor = "I")
    public static int field3537;

    @OriginalMember(owner = "client!wb", name = "s", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!wb", name = "B", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!wb", name = "D", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!wb", name = "E", descriptor = "I")
    public static int field3550;

    @OriginalMember(owner = "client!wb", name = "v", descriptor = "J")
    private long field3541;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lfd;")
    public static class40 field3524;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)J")
    public final long method1172(int arg0) {
        field3543++;
        return arg0 == 29922 ? this.field3545 : -56L;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(III[B)V")
    public final void method1173(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field3533++;
        try {
            if (this.field3545 < (long) arg0 + this.field3546) {
                this.field3545 = (long) arg0 + this.field3546;
            }
            if (this.field3534 != -1L && (this.field3546 < this.field3534 || (long) this.field3535 + this.field3534 < this.field3546)) {
                this.method1178(-40);
            }
            if ((long) arg1 != this.field3534 && (long) this.field3530.length + this.field3534 < (long) arg0 + this.field3546) {
                int var5 = (int) ((long) this.field3530.length + this.field3534 - this.field3546);
                class139.method1051(arg3, arg2, this.field3530, (int) (this.field3546 - this.field3534), var5);
                arg0 -= var5;
                arg2 += var5;
                this.field3546 += var5;
                this.field3535 = this.field3530.length;
                this.method1178(arg1 ^ 0x36);
            }
            if (arg0 > this.field3530.length) {
                long var6 = -1L;
                if (this.field3546 != this.field3541) {
                    this.field3548.method1130(this.field3546, (byte) -88);
                    this.field3541 = this.field3546;
                }
                this.field3548.method1127(arg3, true, arg0, arg2);
                this.field3541 += arg0;
                if (this.field3541 > this.field3525) {
                    this.field3525 = this.field3541;
                }
                if (this.field3546 >= this.field3522 && (long) this.field3532 + this.field3522 > this.field3546) {
                    var6 = this.field3546;
                } else if (this.field3546 <= this.field3522 && (long) arg0 + this.field3546 > this.field3522) {
                    var6 = this.field3522;
                }
                long var8 = -1L;
                if ((long) arg0 + this.field3546 > this.field3522 && (long) this.field3532 + this.field3522 >= this.field3546 - -((long) arg0)) {
                    var8 = (long) arg0 + this.field3546;
                } else if (this.field3546 < (long) this.field3532 + this.field3522 && (long) arg0 + this.field3546 >= (long) this.field3532 + this.field3522) {
                    var8 = (long) this.field3532 + this.field3522;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class139.method1051(arg3, (int) ((long) arg2 + var6 - this.field3546), this.field3551, (int) (var6 - this.field3522), var10);
                }
                this.field3546 += arg0;
            } else if (arg0 > 0) {
                if (this.field3534 == -1L) {
                    this.field3534 = this.field3546;
                }
                class139.method1051(arg3, arg2, this.field3530, (int) (this.field3546 - this.field3534), arg0);
                this.field3546 += arg0;
                if (this.field3546 - this.field3534 > (long) this.field3535) {
                    this.field3535 = (int) (this.field3546 - this.field3534);
                }
            }
        } catch (IOException var12) {
            this.field3541 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZJ)V")
    public final void method1174(boolean arg0, long arg1) throws IOException {
        field3549++;
        if (arg0) {
            this.field3525 = -101L;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1175(true));
        }
        this.field3546 = arg1;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method1175(boolean arg0) {
        if (!arg0) {
            field3524 = null;
        }
        field3536++;
        return this.field3548.method1131(0);
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    private final void method1176(byte arg0) throws IOException {
        int var2 = -42 / ((arg0 + 3) / 54);
        this.field3532 = 0;
        field3547++;
        if (this.field3546 != this.field3541) {
            this.field3548.method1130(this.field3546, (byte) -128);
            this.field3541 = this.field3546;
        }
        this.field3522 = this.field3546;
        while (this.field3551.length > this.field3532) {
            int var3 = this.field3548.method1129((byte) 34, this.field3551.length - this.field3532, this.field3532, this.field3551);
            if (var3 == -1) {
                break;
            }
            this.field3532 += var3;
            this.field3541 += var3;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
    public final void method1177(int arg0) throws IOException {
        this.method1178(-85);
        this.field3548.method1126((byte) -116);
        if (arg0 == -1) {
            field3529++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
    private final void method1178(int arg0) throws IOException {
        if (this.field3534 != -1L) {
            if (this.field3541 != this.field3534) {
                this.field3548.method1130(this.field3534, (byte) -60);
                this.field3541 = this.field3534;
            }
            this.field3548.method1127(this.field3530, true, this.field3535, 0);
            this.field3541 += this.field3535;
            if (this.field3525 < this.field3541) {
                this.field3525 = this.field3541;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field3534 >= this.field3522 && this.field3534 < (long) this.field3532 + this.field3522) {
                var2 = this.field3534;
            } else if (this.field3522 >= this.field3534 && this.field3522 < this.field3534 + (long) this.field3535) {
                var2 = this.field3522;
            }
            if (this.field3534 + (long) this.field3535 > this.field3522 && (long) this.field3535 + this.field3534 <= (long) this.field3532 + this.field3522) {
                var4 = (long) this.field3535 + this.field3534;
            } else if ((long) this.field3532 + this.field3522 > this.field3534 && (long) this.field3532 + this.field3522 <= (long) this.field3535 + this.field3534) {
                var4 = (long) this.field3532 + this.field3522;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class139.method1051(this.field3530, (int) (var2 - this.field3534), this.field3551, (int) (var2 - this.field3522), var6);
            }
            this.field3534 = -1L;
            this.field3535 = 0;
        }
        field3550++;
        if (arg0 >= -18) {
            field3537 = 56;
        }
    }

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "(Z)V")
    public static void method1179(boolean arg0) {
        field3524 = null;
        field3539 = null;
        field3521 = null;
        field3552 = null;
        field3523 = null;
        if (arg0) {
            field3542 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[BI)V")
    public final void method1180(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3531++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field3534 != -1L && this.field3534 <= this.field3546 && (long) arg1 + this.field3546 <= (long) this.field3535 + this.field3534) {
                class139.method1051(this.field3530, (int) (this.field3546 - this.field3534), arg2, arg0, arg1);
                this.field3546 += arg1;
                return;
            }
            long var5 = this.field3546;
            if (arg3 != 28965) {
                return;
            }
            int var7 = arg1;
            int var8 = arg0;
            if (this.field3546 >= this.field3522 && this.field3546 < this.field3522 + (long) this.field3532) {
                int var9 = (int) (this.field3522 + (long) this.field3532 - this.field3546);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class139.method1051(this.field3551, (int) (this.field3546 - this.field3522), arg2, arg0, var9);
                this.field3546 += var9;
                arg0 += var9;
            }
            if (this.field3551.length < arg1) {
                this.field3548.method1130(this.field3546, (byte) 90);
                this.field3541 = this.field3546;
                while (arg1 > 0) {
                    int var10 = this.field3548.method1129((byte) 66, arg1, arg0, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg1 -= var10;
                    this.field3541 += var10;
                    this.field3546 += var10;
                }
            } else if (arg1 > 0) {
                this.method1176((byte) -68);
                int var11 = arg1;
                if (arg1 > this.field3532) {
                    var11 = this.field3532;
                }
                arg1 -= var11;
                class139.method1051(this.field3551, 0, arg2, arg0, var11);
                this.field3546 += var11;
                arg0 += var11;
            }
            if (this.field3534 != -1L) {
                if (this.field3534 > this.field3546 && arg1 > 0) {
                    int var12 = (int) (this.field3534 - this.field3546) + arg0;
                    if (var12 > arg0 + arg1) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg2[arg0++] = 0;
                        this.field3546++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 < this.field3534 + (long) this.field3535 && var5 + (long) var7 >= this.field3534 - -((long) this.field3535)) {
                    var15 = (long) this.field3535 + this.field3534;
                } else if (this.field3534 < (long) var7 + var5 && (long) var7 + var5 <= (long) this.field3535 + this.field3534) {
                    var15 = (long) var7 + var5;
                }
                if (this.field3534 >= var5 && (long) var7 + var5 > this.field3534) {
                    var13 = this.field3534;
                } else if (var5 >= this.field3534 && var5 < (long) this.field3535 + this.field3534) {
                    var13 = var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class139.method1051(this.field3530, (int) (var13 - this.field3534), arg2, (int) (var13 - var5) + var8, var17);
                    if (this.field3546 < var15) {
                        arg1 = (int) ((long) arg1 + this.field3546 - var15);
                        this.field3546 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3541 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
    public static final int method1181(KeyEvent arg0, byte arg1) {
        field3538++;
        int var2 = arg0.getKeyChar();
        if (arg1 <= 28) {
            field3552 = null;
        }
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lv;II)V")
    public class155(class146 arg0, int arg1, int arg2) throws IOException {
        this.field3548 = arg0;
        this.field3545 = this.field3525 = arg0.method1128(1);
        this.field3551 = new byte[arg1];
        this.field3546 = 0L;
        this.field3530 = new byte[arg2];
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z[B)V")
    public final void method1182(boolean arg0, byte[] arg1) throws IOException {
        if (arg0) {
            method1181(null, (byte) -113);
        }
        this.method1180(0, arg1.length, arg1, 28965);
        field3528++;
    }
}
