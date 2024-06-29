import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class680 {

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "J")
    private long field9580 = -1L;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "J")
    private long field9583 = -1L;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    private int field9586 = 0;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "Lmca;")
    private class5 field9582;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "J")
    private long field9591;

    @OriginalMember(owner = "client!nh", name = "v", descriptor = "J")
    private long field9594;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "[B")
    private byte[] field9581;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "J")
    private long field9576;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[B")
    private byte[] field9590;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "Lad;")
    public static class19 field9579 = new class19(10);

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lcq;")
    public static class110 field9588 = new class110(12, 12);

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "I")
    public static int field9593 = 0;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field9577;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "I")
    public static int field9578;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public static int field9584;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
    public static int field9585;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    public static int field9587;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field9589;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    private int field9592;

    @OriginalMember(owner = "client!nh", name = "w", descriptor = "J")
    private long field9595;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Ljava/io/File;", line = 17)
    private final File method3768(byte arg0) {
        int var2 = -3 % ((arg0 - 9) / 46);
        field9585++;
        return this.field9582.method40(102);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(II[BI)V", line = 32)
    public final void method3769(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field9574++;
        try {
            if (arg2.length < arg0 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg2.length);
            }
            if (this.field9583 != -1L && this.field9576 >= this.field9583 && ((long) this.field9586 + this.field9583) >= ((long) arg1 + this.field9576)) {
                class567.method3213(this.field9590, (int) (this.field9576 - this.field9583), arg2, arg0, arg1);
                this.field9576 += arg1;
                return;
            }
            long var5 = this.field9576;
            int var7 = arg0;
            int var8 = arg1;
            if (this.field9576 >= this.field9580 && this.field9576 < this.field9580 + ((long) this.field9592)) {
                int var9 = (int) (this.field9580 + (long) this.field9592 - this.field9576);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class567.method3213(this.field9581, (int) (this.field9576 - this.field9580), arg2, arg0, var9);
                arg0 += var9;
                this.field9576 += var9;
                arg1 -= var9;
            }
            if (arg1 > this.field9581.length) {
                this.field9582.method39(this.field9576, (byte) 15);
                this.field9595 = this.field9576;
                while (arg1 > 0) {
                    int var10 = this.field9582.method41(arg2, arg0, arg1, arg3 + 31559);
                    if (var10 == -1) {
                        break;
                    }
                    arg1 -= var10;
                    this.field9576 += var10;
                    this.field9595 += var10;
                    arg0 += var10;
                }
            } else if (arg1 > 0) {
                this.method3770((byte) -58);
                int var11 = arg1;
                if (this.field9592 < arg1) {
                    var11 = this.field9592;
                }
                class567.method3213(this.field9581, 0, arg2, arg0, var11);
                arg1 -= var11;
                arg0 += var11;
                this.field9576 += var11;
            }
            if (this.field9583 != -1L) {
                if (this.field9576 < this.field9583 && arg1 > 0) {
                    int var12 = (int) (this.field9583 - this.field9576) + arg0;
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg1--;
                        arg2[arg0++] = 0;
                        this.field9576++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field9583 && this.field9583 < var5 + ((long) var8)) {
                    var13 = this.field9583;
                } else if (var5 >= this.field9583 && (this.field9583 + ((long) this.field9586)) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field9586 + this.field9583 > var5 && ((long) this.field9586 + this.field9583) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field9586 + this.field9583;
                } else if (((long) var8 + var5) > this.field9583 && ((long) var8 + var5) <= ((long) this.field9586 + this.field9583)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class567.method3213(this.field9590, (int) (var13 - this.field9583), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field9576 < var15) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field9576));
                        this.field9576 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field9595 = -1L;
            throw var19;
        }
        if (~arg1 < arg3) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lmca;II)V", line = 552)
    public class680(class5 arg0, int arg1, int arg2) throws IOException {
        this.field9582 = arg0;
        this.field9594 = this.field9591 = arg0.method36(false);
        this.field9581 = new byte[arg1];
        this.field9576 = 0L;
        this.field9590 = new byte[arg2];
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 226)
    private final void method3770(byte arg0) throws IOException {
        if (arg0 != -58) {
            this.field9590 = null;
        }
        this.field9592 = 0;
        field9573++;
        if (this.field9595 != this.field9576) {
            this.field9582.method39(this.field9576, (byte) 15);
            this.field9595 = this.field9576;
        }
        this.field9580 = this.field9576;
        while (this.field9592 < this.field9581.length) {
            int var2 = this.field9581.length - this.field9592;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field9582.method41(this.field9581, this.field9592, var2, 31558);
            if (var3 == -1) {
                break;
            }
            this.field9592 += var3;
            this.field9595 += var3;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 274)
    public static void method3771(int arg0) {
        field9579 = null;
        field9588 = null;
        int var1 = 16 / ((-arg0 - 15) / 63);
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)V", line = 288)
    private final void method3772(byte arg0) throws IOException {
        field9584++;
        if (this.field9583 != -1L) {
            if (this.field9595 != this.field9583) {
                this.field9582.method39(this.field9583, (byte) 15);
                this.field9595 = this.field9583;
            }
            this.field9582.method38(33, this.field9586, 0, this.field9590);
            this.field9595 += this.field9586;
            if (this.field9591 < this.field9595) {
                this.field9591 = this.field9595;
            }
            long var2 = -1L;
            if (this.field9583 >= this.field9580 && this.field9583 < (this.field9580 + ((long) this.field9592))) {
                var2 = this.field9583;
            } else if (this.field9583 <= this.field9580 && ((long) this.field9586 + this.field9583) > this.field9580) {
                var2 = this.field9580;
            }
            long var4 = -1L;
            if (this.field9580 < ((long) this.field9586 + this.field9583) && (long) this.field9592 + this.field9580 >= (long) this.field9586 + this.field9583) {
                var4 = (long) this.field9586 + this.field9583;
            } else if (this.field9583 < ((long) this.field9592 + this.field9580) && ((long) this.field9586 + this.field9583) >= ((long) this.field9592 + this.field9580)) {
                var4 = this.field9580 + ((long) this.field9592);
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class567.method3213(this.field9590, (int) (var2 - this.field9583), this.field9581, (int) (var2 - this.field9580), var6);
            }
            this.field9586 = 0;
            this.field9583 = -1L;
        }
        if (arg0 > -107) {
            this.field9590 = null;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I[BII)V", line = 367)
    public final void method3773(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field9578++;
        try {
            int var5 = 47 % ((32 - arg3) / 32);
            if ((long) arg2 + this.field9576 > this.field9594) {
                this.field9594 = (long) arg2 + this.field9576;
            }
            if (this.field9583 != -1L && (this.field9583 > this.field9576 || ((long) this.field9586 + this.field9583) < this.field9576)) {
                this.method3772((byte) -109);
            }
            if (this.field9583 != -1L && (long) this.field9590.length + this.field9583 < (long) arg2 + this.field9576) {
                int var6 = (int) (this.field9583 + (long) this.field9590.length - this.field9576);
                class567.method3213(arg1, arg0, this.field9590, (int) (this.field9576 - this.field9583), var6);
                this.field9576 += var6;
                arg0 += var6;
                arg2 -= var6;
                this.field9586 = this.field9590.length;
                this.method3772((byte) -122);
            }
            if (this.field9590.length < arg2) {
                if (this.field9595 != this.field9576) {
                    this.field9582.method39(this.field9576, (byte) 15);
                    this.field9595 = this.field9576;
                }
                this.field9582.method38(118, arg2, arg0, arg1);
                this.field9595 += arg2;
                if (this.field9595 > this.field9591) {
                    this.field9591 = this.field9595;
                }
                long var7 = -1L;
                if (this.field9580 <= this.field9576 && (long) this.field9592 + this.field9580 > this.field9576) {
                    var7 = this.field9576;
                } else if (this.field9580 >= this.field9576 && this.field9580 < ((long) arg2 + this.field9576)) {
                    var7 = this.field9580;
                }
                long var9 = -1L;
                if (this.field9580 < (long) arg2 + this.field9576 && (long) this.field9592 + this.field9580 >= this.field9576 - -((long) arg2)) {
                    var9 = (long) arg2 + this.field9576;
                } else if ((this.field9580 + ((long) this.field9592)) > this.field9576 && ((long) this.field9592 + this.field9580) <= ((long) arg2 + this.field9576)) {
                    var9 = (long) this.field9592 + this.field9580;
                }
                if (var7 > -1L && var9 > var7) {
                    int var11 = (int) (var9 - var7);
                    class567.method3213(arg1, (int) ((long) arg0 + var7 - this.field9576), this.field9581, (int) (var7 - this.field9580), var11);
                }
                this.field9576 += arg2;
            } else if (arg2 > 0) {
                if (this.field9583 == -1L) {
                    this.field9583 = this.field9576;
                }
                class567.method3213(arg1, arg0, this.field9590, (int) (this.field9576 - this.field9583), arg2);
                this.field9576 += arg2;
                if (this.field9576 - this.field9583 > (long) this.field9586) {
                    this.field9586 = (int) (this.field9576 - this.field9583);
                }
            }
        } catch (IOException var13) {
            this.field9595 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "(B)V", line = 490)
    public final void method3774(byte arg0) throws IOException {
        this.method3772((byte) -120);
        if (arg0 != 1) {
            field9593 = 32;
        }
        field9575++;
        this.field9582.method37(-1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)J", line = 502)
    public final long method3775(boolean arg0) {
        field9587++;
        if (arg0) {
            this.field9594 = -66L;
        }
        return this.field9594;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BJ)V", line = 517)
    public final void method3776(byte arg0, long arg1) throws IOException {
        if (arg0 != 106) {
            this.field9586 = -94;
        }
        field9589++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method3768((byte) -87));
        }
        this.field9576 = arg1;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "([BZ)V", line = 536)
    public final void method3777(byte[] arg0, boolean arg1) throws IOException {
        field9577++;
        this.method3769(0, arg0.length, arg0, -1);
        if (arg1) {
            this.field9580 = -84L;
        }
    }
}
