import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class18 {

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    private int field278 = 0;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "J")
    private long field283 = -1L;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "J")
    private long field285 = -1L;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lso;")
    private class470 field276;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "J")
    private long field281;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "J")
    private long field287;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "[B")
    private byte[] field269;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[B")
    private byte[] field275;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "J")
    private long field288;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "J")
    private long field279;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lin;")
    public static class91 field286;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIZ[B)V", line = 3)
    public final void method133(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        field274++;
        try {
            if (this.field287 < (this.field288 + ((long) arg1))) {
                this.field287 = (long) arg1 + this.field288;
            }
            if (this.field285 != -1L && (this.field288 < this.field285 || ((long) this.field278 + this.field285) < this.field288)) {
                this.method141(-1);
            }
            if (this.field285 != -1L && (long) arg1 + this.field288 > (long) this.field269.length + this.field285) {
                int var5 = (int) (this.field285 + (long) this.field269.length - this.field288);
                class363.method2319(arg3, arg0, this.field269, (int) (this.field288 - this.field285), var5);
                arg0 += var5;
                arg1 -= var5;
                this.field288 += var5;
                this.field278 = this.field269.length;
                this.method141(-1);
            }
            if (arg1 > this.field269.length) {
                if (this.field288 != this.field279) {
                    this.field276.method2773(-18968, this.field288);
                    this.field279 = this.field288;
                }
                this.field276.method2770((byte) 115, arg0, arg1, arg3);
                this.field279 += arg1;
                if (this.field279 > this.field281) {
                    this.field281 = this.field279;
                }
                long var6 = -1L;
                if (this.field288 >= this.field283 && this.field288 < ((long) this.field284 + this.field283)) {
                    var6 = this.field288;
                } else if (this.field283 >= this.field288 && this.field283 < this.field288 + ((long) arg1)) {
                    var6 = this.field283;
                }
                long var8 = -1L;
                if ((long) arg1 + this.field288 > this.field283 && (long) this.field284 + this.field283 >= (long) arg1 + this.field288) {
                    var8 = (long) arg1 + this.field288;
                } else if (((long) this.field284 + this.field283) > this.field288 && (long) arg1 + this.field288 >= (long) this.field284 + this.field283) {
                    var8 = (long) this.field284 + this.field283;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class363.method2319(arg3, (int) (var6 + (long) arg0 - this.field288), this.field275, (int) (var6 - this.field283), var10);
                }
                this.field288 += arg1;
                return;
            }
            if (arg1 > 0) {
                if (this.field285 == -1L) {
                    this.field285 = this.field288;
                }
                class363.method2319(arg3, arg0, this.field269, (int) (this.field288 - this.field285), arg1);
                this.field288 += arg1;
                if (this.field288 - this.field285 > (long) this.field278) {
                    this.field278 = (int) (this.field288 - this.field285);
                }
                return;
            }
        } catch (IOException var12) {
            this.field279 = -1L;
            throw var12;
        }
        if (!arg2) {
            this.field278 = -69;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[B)V", line = 133)
    public final void method134(int arg0, byte[] arg1) throws IOException {
        int var3 = -98 % ((1 - arg0) / 40);
        this.method138(0, arg1, arg1.length, -16717);
        field277++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Ljava/io/File;", line = 143)
    private final File method135(int arg0) {
        field280++;
        if (arg0 != -8659) {
            this.method135(-88);
        }
        return this.field276.method2772(arg0 ^ 0xFFFFDE67);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 155)
    public static void method136(byte arg0) {
        if (arg0 != 0) {
            field286 = null;
        }
        field286 = null;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)J", line = 171)
    public final long method137(int arg0) {
        if (arg0 == 0) {
            field282++;
            return this.field287;
        } else {
            return 26L;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[BII)V", line = 190)
    public final void method138(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field271++;
        try {
            if (arg0 + arg2 > arg1.length) {
                throw new ArrayIndexOutOfBoundsException(arg2 + arg0 - arg1.length);
            }
            if (arg3 != -16717) {
                return;
            }
            if (this.field285 != -1L && this.field285 <= this.field288 && ((long) this.field278 + this.field285) >= (this.field288 + ((long) arg2))) {
                class363.method2319(this.field269, (int) (this.field288 - this.field285), arg1, arg0, arg2);
                this.field288 += arg2;
                return;
            }
            long var5 = this.field288;
            int var7 = arg0;
            int var8 = arg2;
            if (this.field288 >= this.field283 && this.field288 < (this.field283 + ((long) this.field284))) {
                int var9 = (int) ((long) this.field284 - (this.field288 - this.field283));
                if (arg2 < var9) {
                    var9 = arg2;
                }
                class363.method2319(this.field275, (int) (this.field288 - this.field283), arg1, arg0, var9);
                this.field288 += var9;
                arg2 -= var9;
                arg0 += var9;
            }
            if (arg2 > this.field275.length) {
                this.field276.method2773(arg3 - 2251, this.field288);
                this.field279 = this.field288;
                while (arg2 > 0) {
                    int var10 = this.field276.method2768(arg1, arg0, (byte) 8, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    this.field279 += var10;
                    this.field288 += var10;
                    arg2 -= var10;
                }
            } else if (arg2 > 0) {
                this.method142((byte) -46);
                int var11 = arg2;
                if (arg2 > this.field284) {
                    var11 = this.field284;
                }
                class363.method2319(this.field275, 0, arg1, arg0, var11);
                arg0 += var11;
                this.field288 += var11;
                arg2 -= var11;
            }
            if (this.field285 != -1L) {
                if (this.field285 > this.field288 && arg2 > 0) {
                    int var12 = (int) (this.field285 - this.field288) + arg0;
                    if (var12 > (arg0 + arg2)) {
                        var12 = arg0 + arg2;
                    }
                    while (arg0 < var12) {
                        arg1[arg0++] = 0;
                        arg2--;
                        this.field288++;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field285 && this.field285 < (var5 + ((long) var8))) {
                    var13 = this.field285;
                } else if (var5 >= this.field285 && (this.field285 + ((long) this.field278)) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field278 + this.field285) && ((long) this.field278 + this.field285) <= ((long) var8 + var5)) {
                    var15 = this.field285 + ((long) this.field278);
                } else if ((var5 + ((long) var8)) > this.field285 && (var5 + ((long) var8)) <= ((long) this.field278 + this.field285)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class363.method2319(this.field269, (int) (var13 - this.field285), arg1, var7 + ((int) (var13 - var5)), var17);
                    if (this.field288 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field288));
                        this.field288 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field279 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(JB)V", line = 384)
    public final void method139(long arg0, byte arg1) throws IOException {
        field273++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method135(-8659));
        }
        int var4 = -67 / ((arg1 + 49) / 34);
        this.field288 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lso;II)V", line = 546)
    public class18(class470 arg0, int arg1, int arg2) throws IOException {
        this.field276 = arg0;
        this.field287 = this.field281 = arg0.method2774((byte) -46);
        this.field269 = new byte[arg2];
        this.field275 = new byte[arg1];
        this.field288 = 0L;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 400)
    public final void method140(byte arg0) throws IOException {
        field268++;
        this.method141(-1);
        this.field276.method2769(false);
        int var2 = -26 % ((arg0 + 7) / 51);
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)V", line = 413)
    private final void method141(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field285 = 47L;
        }
        if (this.field285 != -1L) {
            if (this.field285 != this.field279) {
                this.field276.method2773(-18968, this.field285);
                this.field279 = this.field285;
            }
            this.field276.method2770((byte) 120, 0, this.field278, this.field269);
            this.field279 += this.field278;
            if (this.field281 < this.field279) {
                this.field281 = this.field279;
            }
            long var2 = -1L;
            long var4 = -1L;
            if (this.field285 >= this.field283 && ((long) this.field284 + this.field283) > this.field285) {
                var2 = this.field285;
            } else if (this.field285 <= this.field283 && (this.field285 + ((long) this.field278)) > this.field283) {
                var2 = this.field283;
            }
            if (this.field283 < ((long) this.field278 + this.field285) && (long) this.field278 + this.field285 <= (long) this.field284 + this.field283) {
                var4 = this.field285 + ((long) this.field278);
            } else if (((long) this.field284 + this.field283) > this.field285 && (long) this.field284 + this.field283 <= (long) this.field278 + this.field285) {
                var4 = (long) this.field284 + this.field283;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class363.method2319(this.field269, (int) (var2 - this.field285), this.field275, (int) (var2 - this.field283), var6);
            }
            this.field285 = -1L;
            this.field278 = 0;
        }
        field272++;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V", line = 490)
    private final void method142(byte arg0) throws IOException {
        this.field284 = 0;
        field270++;
        if (arg0 != -46) {
            this.method135(111);
        }
        if (this.field288 != this.field279) {
            this.field276.method2773(-18968, this.field288);
            this.field279 = this.field288;
        }
        this.field283 = this.field288;
        while (this.field275.length > this.field284) {
            int var2 = this.field275.length - this.field284;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field276.method2768(this.field275, this.field284, (byte) 125, var2);
            if (var3 == -1) {
                break;
            }
            this.field284 += var3;
            this.field279 += var3;
        }
    }
}
