import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class524 {

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "J")
    private long field7631 = -1L;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "J")
    private long field7623 = -1L;

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    private int field7642 = 0;

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Lqq;")
    private class441 field7640;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "J")
    private long field7641;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "J")
    private long field7644;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "[B")
    private byte[] field7643;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "[B")
    private byte[] field7630;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "J")
    private long field7627;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "Lrl;")
    public static class672 field7629 = new class672(79, -1);

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Leu;")
    public static class444 field7646 = new class444(6, 1);

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "Lvg;")
    public static class49 field7648 = new class49(8);

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field7621;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public static int field7622;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public static int field7624;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field7625;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field7626;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field7628;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "I")
    public static int field7632;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!wm", name = "o", descriptor = "I")
    private int field7635;

    @OriginalMember(owner = "client!wm", name = "p", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!wm", name = "q", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!wm", name = "r", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!wm", name = "s", descriptor = "I")
    public static int field7639;

    @OriginalMember(owner = "client!wm", name = "C", descriptor = "I")
    public static int field7649;

    @OriginalMember(owner = "client!wm", name = "n", descriptor = "J")
    private long field7634;

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "[I")
    public static int[] field7647;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "[[[Lup;")
    public static class252[][][] field7645;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "([BI)V")
    public final void method3153(byte[] arg0, int arg1) throws IOException {
        this.method3163((byte) -106, 0, arg0.length, arg0);
        if (arg1 != -6724) {
            this.field7640 = null;
        }
        field7622++;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BJ)V")
    public final void method3154(byte arg0, long arg1) throws IOException {
        field7638++;
        if (arg0 != -75) {
            return;
        }
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3159(79));
        }
        this.field7627 = arg1;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)J")
    public final long method3155(boolean arg0) {
        field7624++;
        if (!arg0) {
            method3157((byte) -51);
        }
        return this.field7644;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)V")
    public static final void method3156(int arg0, int arg1, int arg2) {
        field7633++;
        class9.method191(arg0, arg1, arg2 ^ 0x13FF);
        if (arg2 != 847) {
            method3160((byte) 59, null);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(B)V")
    public static void method3157(byte arg0) {
        field7648 = null;
        field7646 = null;
        field7645 = null;
        field7647 = null;
        int var1 = -30 / ((15 - arg0) / 60);
        field7629 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ZII[B)V")
    public final void method3158(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7625++;
        try {
            if (this.field7644 < (this.field7627 + ((long) arg1))) {
                this.field7644 = this.field7627 + ((long) arg1);
            }
            if (this.field7631 != -1L && (this.field7631 > this.field7627 || (long) this.field7642 + this.field7631 < this.field7627)) {
                this.method3162((byte) -111);
            }
            if (this.field7631 != -1L && (long) this.field7630.length + this.field7631 < (long) arg1 + this.field7627) {
                int var5 = (int) ((long) this.field7630.length - (this.field7627 - this.field7631));
                class398.method2566(arg3, arg2, this.field7630, (int) (this.field7627 - this.field7631), var5);
                arg1 -= var5;
                this.field7627 += var5;
                arg2 += var5;
                this.field7642 = this.field7630.length;
                this.method3162((byte) -110);
            }
            if (this.field7630.length < arg1) {
                if (this.field7634 != this.field7627) {
                    this.field7640.method2788(this.field7627, 32087);
                    this.field7634 = this.field7627;
                }
                this.field7640.method2783(arg3, arg2, arg1, 124);
                this.field7634 += arg1;
                if (this.field7641 < this.field7634) {
                    this.field7641 = this.field7634;
                }
                long var6 = -1L;
                if (this.field7623 <= this.field7627 && this.field7627 < this.field7623 + ((long) this.field7635)) {
                    var6 = this.field7627;
                } else if (this.field7623 >= this.field7627 && ((long) arg1 + this.field7627) > this.field7623) {
                    var6 = this.field7623;
                }
                long var8 = -1L;
                if ((long) arg1 + this.field7627 > this.field7623 && this.field7627 + ((long) arg1) <= (long) this.field7635 + this.field7623) {
                    var8 = (long) arg1 + this.field7627;
                } else if (this.field7627 < (long) this.field7635 + this.field7623 && this.field7627 + ((long) arg1) >= this.field7623 - -((long) this.field7635)) {
                    var8 = this.field7623 + ((long) this.field7635);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class398.method2566(arg3, (int) ((long) arg2 + var6 - this.field7627), this.field7643, (int) (var6 - this.field7623), var10);
                }
                this.field7627 += arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field7631 == -1L) {
                    this.field7631 = this.field7627;
                }
                class398.method2566(arg3, arg2, this.field7630, (int) (this.field7627 - this.field7631), arg1);
                this.field7627 += arg1;
                if (this.field7627 - this.field7631 > (long) this.field7642) {
                    this.field7642 = (int) (this.field7627 - this.field7631);
                }
                return;
            }
        } catch (IOException var12) {
            this.field7634 = -1L;
            throw var12;
        }
        if (arg0) {
            this.method3155(false);
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method3159(int arg0) {
        if (arg0 != 79) {
            this.method3159(-8);
        }
        field7639++;
        return this.field7640.method2787((byte) -101);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLol;)V")
    public static final void method3160(byte arg0, class260 arg1) {
        field7626++;
        if (arg1.field4199 == null && arg1.field4192 == null) {
            return;
        }
        boolean var2 = true;
        int var3 = 0;
        if (arg0 > -117) {
            field7646 = null;
        }
        while (var3 < arg1.field4199.length) {
            int var4 = -1;
            if (arg1.field4199 != null) {
                var4 = arg1.field4199[var3];
            }
            if (var4 != -1) {
                label61: {
                    var2 = false;
                    boolean var5 = false;
                    boolean var6 = false;
                    int var9;
                    int var10;
                    if ((var4 & 0xC0000000) == -1073741824) {
                        int var13 = var4 & 0xFFFFFFF;
                        int var14 = var13 >> 14;
                        int var15 = var13 & 0x3FFF;
                        var10 = arg1.field9696 - ((var14 - class612.field8702) * 512) - 256;
                        var9 = arg1.field9705 - ((var15 - class626.field8855) * 512) - 256;
                    } else if ((var4 & 0x8000) == 0) {
                        class348 var11 = (class348) class592.field8395.method1558((long) var4, (byte) -93);
                        if (var11 == null) {
                            arg1.method1853(var3, -7361, -1);
                            break label61;
                        }
                        class589 var12 = var11.field5577;
                        var9 = arg1.field9705 - var12.field9705;
                        var10 = arg1.field9696 - var12.field9696;
                    } else {
                        int var7 = var4 & 0x7FFF;
                        class304 var8 = class597.field8465[var7];
                        if (var8 == null) {
                            arg1.method1853(var3, -7361, -1);
                            break label61;
                        }
                        var9 = arg1.field9705 - var8.field9705;
                        var10 = arg1.field9696 - var8.field9696;
                    }
                    if (var10 != 0 || var9 != 0) {
                        arg1.method1853(var3, -7361, (int) (Math.atan2((double) var10, (double) var9) * 2607.5945876176133D) & 0x3FFF);
                    }
                }
            } else if (!arg1.method1853(var3, -7361, -1)) {
                var2 = false;
            }
            var3++;
        }
        if (var2) {
            arg1.field4199 = null;
            arg1.field4192 = null;
        }
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(I)V")
    public final void method3161(int arg0) throws IOException {
        if (arg0 <= 113) {
            this.field7642 = -72;
        }
        this.method3162((byte) -113);
        field7632++;
        this.field7640.method2785(-1856);
    }

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "(B)V")
    private final void method3162(byte arg0) throws IOException {
        field7637++;
        if (arg0 >= -97) {
            this.method3155(false);
        }
        if (this.field7631 == -1L) {
            return;
        }
        if (this.field7634 != this.field7631) {
            this.field7640.method2788(this.field7631, 32087);
            this.field7634 = this.field7631;
        }
        this.field7640.method2783(this.field7630, 0, this.field7642, 110);
        this.field7634 += this.field7642;
        if (this.field7634 > this.field7641) {
            this.field7641 = this.field7634;
        }
        long var2 = -1L;
        if (this.field7631 >= this.field7623 && ((long) this.field7635 + this.field7623) > this.field7631) {
            var2 = this.field7631;
        } else if (this.field7623 >= this.field7631 && ((long) this.field7642 + this.field7631) > this.field7623) {
            var2 = this.field7623;
        }
        long var4 = -1L;
        if (this.field7623 < ((long) this.field7642 + this.field7631) && (this.field7631 + ((long) this.field7642)) <= ((long) this.field7635 + this.field7623)) {
            var4 = this.field7631 + ((long) this.field7642);
        } else if ((this.field7623 + ((long) this.field7635)) > this.field7631 && ((long) this.field7635 + this.field7623) <= ((long) this.field7642 + this.field7631)) {
            var4 = this.field7623 + ((long) this.field7635);
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class398.method2566(this.field7630, (int) (var2 - this.field7631), this.field7643, (int) (var2 - this.field7623), var6);
        }
        this.field7631 = -1L;
        this.field7642 = 0;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BII[B)V")
    public final void method3163(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field7636++;
        try {
            if (arg3.length < (arg1 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg3.length);
            }
            if (this.field7631 != -1L && this.field7631 <= this.field7627 && ((long) arg2 + this.field7627) <= ((long) this.field7642 + this.field7631)) {
                class398.method2566(this.field7630, (int) (this.field7627 - this.field7631), arg3, arg1, arg2);
                this.field7627 += arg2;
                return;
            }
            long var5 = this.field7627;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field7627 >= this.field7623 && this.field7627 < (long) this.field7635 + this.field7623) {
                int var9 = (int) ((long) this.field7635 + this.field7623 - this.field7627);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                class398.method2566(this.field7643, (int) (this.field7627 - this.field7623), arg3, arg1, var9);
                arg1 += var9;
                arg2 -= var9;
                this.field7627 += var9;
            }
            if (this.field7643.length < arg2) {
                this.field7640.method2788(this.field7627, arg0 + 32193);
                this.field7634 = this.field7627;
                while (arg2 > 0) {
                    int var11 = this.field7640.method2790(arg1, -1, arg2, arg3);
                    if (var11 == -1) {
                        break;
                    }
                    this.field7634 += var11;
                    arg2 -= var11;
                    this.field7627 += var11;
                    arg1 += var11;
                }
            } else if (arg2 > 0) {
                this.method3164((byte) 115);
                int var10 = arg2;
                if (arg2 > this.field7635) {
                    var10 = this.field7635;
                }
                class398.method2566(this.field7643, 0, arg3, arg1, var10);
                arg1 += var10;
                arg2 -= var10;
                this.field7627 += var10;
            }
            if (this.field7631 != -1L) {
                if (this.field7631 > this.field7627 && arg2 > 0) {
                    int var12 = arg1 + ((int) (this.field7631 - this.field7627));
                    if (var12 > arg1 + arg2) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg3[arg1++] = 0;
                        arg2--;
                        this.field7627++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field7631 && var5 + ((long) var8) > this.field7631) {
                    var13 = this.field7631;
                } else if (this.field7631 <= var5 && var5 < ((long) this.field7642 + this.field7631)) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < this.field7631 + ((long) this.field7642) && (this.field7631 + ((long) this.field7642)) <= ((long) var8 + var5)) {
                    var15 = (long) this.field7642 + this.field7631;
                } else if (this.field7631 < var5 + ((long) var8) && this.field7631 + ((long) this.field7642) >= (long) var8 + var5) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class398.method2566(this.field7630, (int) (var13 - this.field7631), arg3, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field7627) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field7627));
                        this.field7627 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field7634 = -1L;
            throw var19;
        }
        if (arg0 != -106) {
            field7621 = -124;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "(B)V")
    private final void method3164(byte arg0) throws IOException {
        field7628++;
        this.field7635 = 0;
        if (arg0 <= 91) {
            method3160((byte) 114, null);
        }
        if (this.field7634 != this.field7627) {
            this.field7640.method2788(this.field7627, 32087);
            this.field7634 = this.field7627;
        }
        this.field7623 = this.field7627;
        while (this.field7635 < this.field7643.length) {
            int var2 = this.field7643.length - this.field7635;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field7640.method2790(this.field7635, -1, var2, this.field7643);
            if (var3 == -1) {
                break;
            }
            this.field7634 += var3;
            this.field7635 += var3;
        }
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lqq;II)V")
    public class524(class441 arg0, int arg1, int arg2) throws IOException {
        this.field7640 = arg0;
        this.field7644 = this.field7641 = arg0.method2789(0);
        this.field7643 = new byte[arg1];
        this.field7630 = new byte[arg2];
        this.field7627 = 0L;
    }
}
