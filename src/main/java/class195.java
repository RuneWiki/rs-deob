import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class195 {

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "J")
    private long field3524 = -1L;

    @OriginalMember(owner = "client!ug", name = "v", descriptor = "J")
    private long field3535 = -1L;

    @OriginalMember(owner = "client!ug", name = "x", descriptor = "I")
    private int field3537 = 0;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "Lpa;")
    private class206 field3521;

    @OriginalMember(owner = "client!ug", name = "p", descriptor = "J")
    private long field3529;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "J")
    private long field3516;

    @OriginalMember(owner = "client!ug", name = "q", descriptor = "J")
    private long field3530;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "[B")
    private byte[] field3515;

    @OriginalMember(owner = "client!ug", name = "w", descriptor = "[B")
    private byte[] field3536;

    @OriginalMember(owner = "client!ug", name = "r", descriptor = "Loh;")
    public static class263 field3531 = class253.method1681(-124, "underlay");

    @OriginalMember(owner = "client!ug", name = "y", descriptor = "[I")
    public static int[] field3538 = new int[128];

    @OriginalMember(owner = "client!ug", name = "A", descriptor = "I")
    public static int field3540 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ug", name = "s", descriptor = "Loh;")
    public static class263 field3532 = class253.method1681(-126, "<img=1>");

    @OriginalMember(owner = "client!ug", name = "B", descriptor = "Loh;")
    public static class263 field3541 = class253.method1681(-125, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!ug", name = "u", descriptor = "Lli;")
    public static class277 field3534 = new class277();

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3523;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ug", name = "o", descriptor = "I")
    private int field3528;

    @OriginalMember(owner = "client!ug", name = "t", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!ug", name = "C", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "J")
    private long field3517;

    @OriginalMember(owner = "client!ug", name = "D", descriptor = "[[B")
    public static byte[][] field3543;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
    private final void method1327(boolean arg0) throws IOException {
        field3523++;
        if (arg0) {
            this.field3528 = 88;
        }
        if (this.field3524 == -1L) {
            return;
        }
        long var2 = -1L;
        if (this.field3524 != this.field3517) {
            this.field3521.method1427(this.field3524, (byte) -116);
            this.field3517 = this.field3524;
        }
        this.field3521.method1422(this.field3537, this.field3515, -12996, 0);
        long var4 = -1L;
        if (this.field3535 < (long) this.field3537 + this.field3524 && (long) this.field3537 + this.field3524 <= (long) this.field3528 + this.field3535) {
            var4 = this.field3524 + ((long) this.field3537);
        } else if (this.field3524 < (this.field3535 + ((long) this.field3528)) && ((long) this.field3537 + this.field3524) >= ((long) this.field3528 + this.field3535)) {
            var4 = (long) this.field3528 + this.field3535;
        }
        if (this.field3524 >= this.field3535 && (long) this.field3528 + this.field3535 > this.field3524) {
            var2 = this.field3524;
        } else if (this.field3524 <= this.field3535 && (this.field3524 + ((long) this.field3537)) > this.field3535) {
            var2 = this.field3535;
        }
        this.field3517 += (long) this.field3537;
        if (this.field3529 < this.field3517) {
            this.field3529 = this.field3517;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class149.method977(this.field3515, (int) (var2 - this.field3524), this.field3536, (int) (var2 - this.field3535), var6);
        }
        this.field3524 = -1L;
        this.field3537 = 0;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)J")
    public final long method1328(int arg0) {
        int var2 = 59 % ((63 - arg0) / 60);
        field3514++;
        return this.field3516;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(JI)V")
    public final void method1329(long arg0, int arg1) throws IOException {
        field3522++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1337(-32065));
        }
        int var4 = -27 / ((arg1 + 44) / 48);
        this.field3530 = arg0;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
    public final void method1330(int arg0) throws IOException {
        this.method1327(false);
        field3539++;
        if (arg0 != -798145320) {
            this.method1337(-116);
        }
        this.field3521.method1426(-10272);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BI)V")
    public final void method1331(byte[] arg0, int arg1) throws IOException {
        this.method1333(arg0, arg0.length, 23881, 0);
        if (arg1 >= -5) {
            this.field3524 = -46L;
        }
        field3542++;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZI)V")
    public static final void method1332(int arg0, boolean arg1, int arg2) {
        field3520++;
        class59 var3 = class6.method41((byte) 118, arg0);
        int var4 = var3.field1228;
        int var5 = var3.field1230;
        int var6 = var3.field1224;
        int var7 = class277.field4852[var6 - var4];
        if (arg2 < 0 || arg2 > var7) {
            arg2 = 0;
        }
        if (arg1) {
            int var8 = var7 << var4;
            class161.method1060(var8 & arg2 << var4 | class154.field2787[var5] & ~var8, -101, var5);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BIII)V")
    public final void method1333(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3526++;
        try {
            if ((arg3 + arg1) > arg0.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg0.length);
            }
            if (this.field3524 != -1L && this.field3530 >= this.field3524 && ((long) arg1 + this.field3530) <= ((long) this.field3537 + this.field3524)) {
                class149.method977(this.field3515, (int) (this.field3530 - this.field3524), arg0, arg3, arg1);
                this.field3530 += (long) arg1;
                return;
            }
            long var5 = this.field3530;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field3535 <= this.field3530 && this.field3530 < ((long) this.field3528 + this.field3535)) {
                int var9 = (int) ((long) this.field3528 + this.field3535 - this.field3530);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class149.method977(this.field3536, (int) (this.field3530 - this.field3535), arg0, arg3, var9);
                arg3 += var9;
                this.field3530 += (long) var9;
            }
            if (this.field3536.length < arg1) {
                this.field3521.method1427(this.field3530, (byte) -120);
                this.field3517 = this.field3530;
                while (arg1 > 0) {
                    int var11 = this.field3521.method1423(arg3, arg1, 1, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    this.field3530 += (long) var11;
                    this.field3517 += (long) var11;
                    arg3 += var11;
                    arg1 -= var11;
                }
            } else if (arg1 > 0) {
                int var10 = arg1;
                this.method1335((byte) 116);
                if (this.field3528 < arg1) {
                    var10 = this.field3528;
                }
                class149.method977(this.field3536, 0, arg0, arg3, var10);
                arg3 += var10;
                this.field3530 += (long) var10;
                arg1 -= var10;
            }
            if (arg2 != 23881) {
                field3543 = null;
            }
            if (this.field3524 != -1L) {
                if (this.field3530 < this.field3524 && arg1 > 0) {
                    int var12 = arg3 + ((int) (this.field3524 - this.field3530));
                    if (var12 > (arg1 + arg3)) {
                        var12 = arg3 + arg1;
                    }
                    while (var12 > arg3) {
                        arg1--;
                        arg0[arg3++] = 0;
                        this.field3530++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field3524 && (long) var8 + var5 > this.field3524) {
                    var13 = this.field3524;
                } else if (var5 >= this.field3524 && (long) this.field3537 + this.field3524 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field3537 + this.field3524 && ((long) var8 + var5) >= ((long) this.field3537 + this.field3524)) {
                    var15 = this.field3524 + ((long) this.field3537);
                } else if (var5 + ((long) var8) > this.field3524 && (long) var8 + var5 <= (long) this.field3537 + this.field3524) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class149.method977(this.field3515, (int) (var13 - this.field3524), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field3530) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field3530));
                        this.field3530 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3517 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static void method1334(int arg0) {
        if (arg0 != -1) {
            field3538 = null;
        }
        field3531 = null;
        field3541 = null;
        field3532 = null;
        field3543 = null;
        field3538 = null;
        field3534 = null;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    private final void method1335(byte arg0) throws IOException {
        this.field3528 = 0;
        if (this.field3530 != this.field3517) {
            this.field3521.method1427(this.field3530, (byte) -119);
            this.field3517 = this.field3530;
        }
        if (arg0 < 44) {
            return;
        }
        field3518++;
        this.field3535 = this.field3530;
        while (this.field3536.length > this.field3528) {
            int var2 = this.field3536.length - this.field3528;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3521.method1423(this.field3528, var2, 1, this.field3536);
            if (var3 == -1) {
                break;
            }
            this.field3517 += (long) var3;
            this.field3528 += var3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "([BIII)V")
    public final void method1336(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field3533++;
        try {
            int var5 = 9 % ((50 - arg3) / 61);
            if ((this.field3530 + ((long) arg1)) > this.field3516) {
                this.field3516 = this.field3530 + ((long) arg1);
            }
            if (this.field3524 != -1L && (this.field3530 < this.field3524 || this.field3530 > ((long) this.field3537 + this.field3524))) {
                this.method1327(false);
            }
            if (this.field3524 != -1L && ((long) arg1 + this.field3530) > (this.field3524 + ((long) this.field3515.length))) {
                int var6 = (int) ((long) this.field3515.length + this.field3524 - this.field3530);
                class149.method977(arg0, arg2, this.field3515, (int) (this.field3530 - this.field3524), var6);
                this.field3530 += (long) var6;
                arg1 -= var6;
                arg2 += var6;
                this.field3537 = this.field3515.length;
                this.method1327(false);
            }
            if (this.field3515.length < arg1) {
                long var7 = -1L;
                if (this.field3530 != this.field3517) {
                    this.field3521.method1427(this.field3530, (byte) -110);
                    this.field3517 = this.field3530;
                }
                long var9 = -1L;
                this.field3521.method1422(arg1, arg0, -12996, arg2);
                if (this.field3535 <= this.field3530 && this.field3530 < this.field3535 + ((long) this.field3528)) {
                    var7 = this.field3530;
                } else if (this.field3530 <= this.field3535 && this.field3530 + ((long) arg1) > this.field3535) {
                    var7 = this.field3535;
                }
                this.field3517 += (long) arg1;
                if (this.field3517 > this.field3529) {
                    this.field3529 = this.field3517;
                }
                if (this.field3535 < this.field3530 + ((long) arg1) && ((long) this.field3528 + this.field3535) >= (this.field3530 + ((long) arg1))) {
                    var9 = (long) arg1 + this.field3530;
                } else if ((long) this.field3528 + this.field3535 > this.field3530 && (long) arg1 + this.field3530 >= (long) this.field3528 + this.field3535) {
                    var9 = (long) this.field3528 + this.field3535;
                }
                if (var7 > -1L && var7 < var9) {
                    int var11 = (int) (var9 - var7);
                    class149.method977(arg0, (int) (var7 + (long) arg2 - this.field3530), this.field3536, (int) (var7 - this.field3535), var11);
                }
                this.field3530 += (long) arg1;
            } else if (arg1 > 0) {
                if (this.field3524 == -1L) {
                    this.field3524 = this.field3530;
                }
                class149.method977(arg0, arg2, this.field3515, (int) (this.field3530 - this.field3524), arg1);
                this.field3530 += (long) arg1;
                if ((this.field3530 - this.field3524) > ((long) this.field3537)) {
                    this.field3537 = (int) (this.field3530 - this.field3524);
                }
            }
        } catch (IOException var13) {
            this.field3517 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method1337(int arg0) {
        if (arg0 != -32065) {
            method1332(-66, true, 8);
        }
        field3519++;
        return this.field3521.method1425((byte) 123);
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "(Lpa;II)V")
    public class195(class206 arg0, int arg1, int arg2) throws IOException {
        this.field3521 = arg0;
        this.field3516 = this.field3529 = arg0.method1424(58);
        this.field3530 = 0L;
        this.field3515 = new byte[arg2];
        this.field3536 = new byte[arg1];
    }
}
