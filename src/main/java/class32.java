import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class32 {

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "J")
    private long field513 = -1L;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    private int field511 = 0;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "J")
    private long field506 = -1L;

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Luj;")
    private class137 field518;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "J")
    private long field522;

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "J")
    private long field519;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "[B")
    private byte[] field526;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "J")
    private long field505;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "[B")
    private byte[] field521;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "Lub;")
    public static class227 field515 = class257.method1749("mapdots", 17263);

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field517 = -1;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "[I")
    public static int[] field525 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "Lub;")
    public static class227 field527 = class257.method1749(":clan:", 17263);

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "Lgh;")
    public static class106 field512 = new class106(5000);

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "[I")
    public static int[] field529 = new int[128];

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    public static int field523;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "J")
    private long field520;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)J")
    public final long method159(int arg0) {
        if (arg0 > -72) {
            field525 = null;
        }
        field528++;
        return this.field519;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method160(byte arg0) throws IOException {
        if (arg0 >= 115) {
            field510++;
            this.method165(-14805);
            this.field518.method856((byte) -127);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(JZ)V")
    public final void method161(long arg0, boolean arg1) throws IOException {
        field523++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method164(true));
        }
        this.field505 = arg0;
        if (arg1) {
            this.field522 = 7L;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[BI)V")
    public final void method162(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field503++;
        try {
            if (arg0 > -106) {
                this.field513 = 55L;
            }
            if (arg2.length < arg3 + arg1) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field513 != -1L && this.field513 <= this.field505 && ((long) arg1 + this.field505) <= (this.field513 + ((long) this.field511))) {
                class68.method422(this.field526, (int) (this.field505 - this.field513), arg2, arg3, arg1);
                this.field505 += (long) arg1;
                return;
            }
            long var5 = this.field505;
            int var7 = arg3;
            int var8 = arg1;
            if (this.field505 >= this.field506 && (long) this.field514 + this.field506 > this.field505) {
                int var9 = (int) (this.field506 + (long) this.field514 - this.field505);
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class68.method422(this.field521, (int) (this.field505 - this.field506), arg2, arg3, var9);
                this.field505 += (long) var9;
                arg1 -= var9;
                arg3 += var9;
            }
            if (this.field521.length < arg1) {
                this.field518.method854(-103, this.field505);
                this.field520 = this.field505;
                while (arg1 > 0) {
                    int var10 = this.field518.method858(arg1, arg3, arg2, -1);
                    if (var10 == -1) {
                        break;
                    }
                    this.field505 += (long) var10;
                    arg3 += var10;
                    arg1 -= var10;
                    this.field520 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method168((byte) -111);
                int var11 = arg1;
                if (this.field514 < arg1) {
                    var11 = this.field514;
                }
                class68.method422(this.field521, 0, arg2, arg3, var11);
                arg1 -= var11;
                this.field505 += (long) var11;
                arg3 += var11;
            }
            if (this.field513 != -1L) {
                if (this.field513 > this.field505 && arg1 > 0) {
                    int var12 = arg3 + ((int) (this.field513 - this.field505));
                    if (arg3 + arg1 < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (arg3 < var12) {
                        arg1--;
                        arg2[arg3++] = 0;
                        this.field505++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field513 && this.field513 < ((long) var8 + var5)) {
                    var13 = this.field513;
                } else if (var5 >= this.field513 && (long) this.field511 + this.field513 > var5) {
                    var13 = var5;
                }
                if ((long) this.field511 + this.field513 > var5 && ((long) var8 + var5) >= (this.field513 + ((long) this.field511))) {
                    var15 = (long) this.field511 + this.field513;
                } else if (this.field513 < ((long) var8 + var5) && ((long) this.field511 + this.field513) >= ((long) var8 + var5)) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class68.method422(this.field526, (int) (var13 - this.field513), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field505) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field505));
                        this.field505 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field520 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method163(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 0;
        int var9 = arg1;
        int var10 = 0;
        field508++;
        int var11 = arg1 - arg5;
        int var12 = arg3 * arg3;
        int var13 = arg1 * arg1;
        int var14 = arg3 - arg5;
        int var15 = var11 * var11;
        int var16 = var14 * var14;
        int var17 = var12 << 1;
        int var18 = var13 << 1;
        if (arg2) {
            return;
        }
        int var19 = var15 << 1;
        int var20 = var11 << 1;
        int var21 = var16 << 1;
        int var22 = arg1 << 1;
        int var23 = (1 - var20) * var16 + var19;
        int var24 = var13 - ((var22 - 1) * var17);
        int var25 = (1 - var22) * var12 + var18;
        int var26 = var13 << 2;
        int var27 = var16 << 2;
        int var28 = var12 << 2;
        int var29 = var15 << 2;
        int var30 = var18 * 3;
        int var31 = var15 - (var20 - 1) * var21;
        int var32 = var19 * 3;
        int var33 = (var22 - 3) * var17;
        int var34 = (var20 - 3) * var21;
        int var35 = var26;
        int var36 = var29;
        int var37 = (arg1 - 1) * var28;
        int var38 = (var11 - 1) * var27;
        if (class161.field2718 <= arg4 && arg4 <= class46.field817) {
            int[] var39 = class59.field1094[arg4];
            int var40 = class23.method111(arg7 - arg3, class125.field2234, class19.field331, 0);
            int var41 = class23.method111(arg3 + arg7, class125.field2234, class19.field331, 0);
            int var42 = class23.method111(arg7 - var14, class125.field2234, class19.field331, 0);
            int var43 = class23.method111(arg7 + var14, class125.field2234, class19.field331, 0);
            class246.method1644(arg6, var39, var42, var40, 1);
            class246.method1644(arg0, var39, var43, var42, 1);
            class246.method1644(arg6, var39, var41, var43, 1);
        }
        while (var9 > 0) {
            boolean var44 = var9 <= var11;
            if (var25 < 0) {
                while (var25 < 0) {
                    var25 += var30;
                    var24 += var35;
                    var8++;
                    var35 += var26;
                    var30 += var26;
                }
            }
            var9--;
            int var45 = arg4 + var9;
            if (var44) {
                if (var23 < 0) {
                    while (var23 < 0) {
                        var10++;
                        var23 += var32;
                        var31 += var36;
                        var36 += var29;
                        var32 += var29;
                    }
                }
                if (var31 < 0) {
                    var10++;
                    var23 += var32;
                    var31 += var36;
                    var36 += var29;
                    var32 += var29;
                }
                var31 += -var34;
                var23 += -var38;
                var38 -= var27;
                var34 -= var27;
            }
            if (var24 < 0) {
                var25 += var30;
                var30 += var26;
                var24 += var35;
                var8++;
                var35 += var26;
            }
            int var46 = arg4 - var9;
            if (var45 >= class161.field2718 && class46.field817 >= var46) {
                int var47 = class23.method111(arg7 + var8, class125.field2234, class19.field331, 0);
                int var48 = class23.method111(arg7 - var8, class125.field2234, class19.field331, 0);
                if (var44) {
                    int var49 = class23.method111(arg7 + var10, class125.field2234, class19.field331, 0);
                    int var50 = class23.method111(arg7 - var10, class125.field2234, class19.field331, 0);
                    if (var46 >= class161.field2718) {
                        int[] var51 = class59.field1094[var46];
                        class246.method1644(arg6, var51, var50, var48, 1);
                        class246.method1644(arg0, var51, var49, var50, 1);
                        class246.method1644(arg6, var51, var47, var49, 1);
                    }
                    if (class46.field817 >= var45) {
                        int[] var52 = class59.field1094[var45];
                        class246.method1644(arg6, var52, var50, var48, 1);
                        class246.method1644(arg0, var52, var49, var50, 1);
                        class246.method1644(arg6, var52, var47, var49, 1);
                    }
                } else {
                    if (class161.field2718 <= var46) {
                        class246.method1644(arg6, class59.field1094[var46], var47, var48, 1);
                    }
                    if (class46.field817 >= var45) {
                        class246.method1644(arg6, class59.field1094[var45], var47, var48, 1);
                    }
                }
            }
            var25 += -var37;
            var24 += -var33;
            var37 -= var28;
            var33 -= var28;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)Ljava/io/File;")
    private final File method164(boolean arg0) {
        field516++;
        if (!arg0) {
            field512 = null;
        }
        return this.field518.method853(1);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V")
    private final void method165(int arg0) throws IOException {
        if (this.field513 != -1L) {
            if (this.field520 != this.field513) {
                this.field518.method854(-98, this.field513);
                this.field520 = this.field513;
            }
            this.field518.method855(this.field511, this.field526, 0, -78);
            this.field520 += (long) this.field511;
            if (this.field520 > this.field522) {
                this.field522 = this.field520;
            }
            long var2 = -1L;
            if (this.field506 < (long) this.field511 + this.field513 && (long) this.field511 + this.field513 <= (long) this.field514 + this.field506) {
                var2 = this.field513 + ((long) this.field511);
            } else if (this.field513 < ((long) this.field514 + this.field506) && (long) this.field514 + this.field506 <= (long) this.field511 + this.field513) {
                var2 = this.field506 + ((long) this.field514);
            }
            long var4 = -1L;
            if (this.field506 <= this.field513 && this.field513 < ((long) this.field514 + this.field506)) {
                var4 = this.field513;
            } else if (this.field506 >= this.field513 && this.field506 < (long) this.field511 + this.field513) {
                var4 = this.field506;
            }
            if (var4 > -1L && var2 > var4) {
                int var6 = (int) (var2 - var4);
                class68.method422(this.field526, (int) (var4 - this.field513), this.field521, (int) (var4 - this.field506), var6);
            }
            this.field513 = -1L;
            this.field511 = 0;
        }
        if (arg0 != -14805) {
            this.method164(true);
        }
        field524++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([BB)V")
    public final void method166(byte[] arg0, byte arg1) throws IOException {
        if (arg1 < 111) {
            this.field505 = -31L;
        }
        this.method162(-114, arg0.length, arg0, 0);
        field504++;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public static void method167(int arg0) {
        field512 = null;
        field527 = null;
        field529 = null;
        field515 = null;
        if (arg0 >= -54) {
            method167(-9);
        }
        field525 = null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)V")
    private final void method168(byte arg0) throws IOException {
        if (arg0 >= -12) {
            this.field520 = -126L;
        }
        this.field514 = 0;
        field509++;
        if (this.field520 != this.field505) {
            this.field518.method854(-33, this.field505);
            this.field520 = this.field505;
        }
        this.field506 = this.field505;
        while (this.field514 < this.field521.length) {
            int var2 = this.field521.length - this.field514;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field518.method858(var2, this.field514, this.field521, -1);
            if (var3 == -1) {
                break;
            }
            this.field520 += (long) var3;
            this.field514 += var3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II[BI)V")
    public final void method169(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field507++;
        if (arg0 != -30001) {
            return;
        }
        try {
            if ((long) arg3 + this.field505 > this.field519) {
                this.field519 = (long) arg3 + this.field505;
            }
            if (this.field513 != -1L && (this.field505 < this.field513 || this.field505 > ((long) this.field511 + this.field513))) {
                this.method165(-14805);
            }
            if (this.field513 != -1L && (this.field513 + ((long) this.field526.length)) < ((long) arg3 + this.field505)) {
                int var5 = (int) (this.field513 + (long) this.field526.length - this.field505);
                class68.method422(arg2, arg1, this.field526, (int) (this.field505 - this.field513), var5);
                arg3 -= var5;
                this.field505 += (long) var5;
                this.field511 = this.field526.length;
                arg1 += var5;
                this.method165(-14805);
            }
            if (this.field526.length < arg3) {
                long var6 = -1L;
                if (this.field520 != this.field505) {
                    this.field518.method854(-108, this.field505);
                    this.field520 = this.field505;
                }
                long var8 = -1L;
                this.field518.method855(arg3, arg2, arg1, -95);
                this.field520 += (long) arg3;
                if ((long) arg3 + this.field505 > this.field506 && ((long) arg3 + this.field505) <= ((long) this.field514 + this.field506)) {
                    var8 = (long) arg3 + this.field505;
                } else if (this.field505 < ((long) this.field514 + this.field506) && ((long) arg3 + this.field505) >= ((long) this.field514 + this.field506)) {
                    var8 = (long) this.field514 + this.field506;
                }
                if (this.field520 > this.field522) {
                    this.field522 = this.field520;
                }
                if (this.field505 >= this.field506 && this.field505 < (this.field506 + ((long) this.field514))) {
                    var6 = this.field505;
                } else if (this.field506 >= this.field505 && this.field506 < (long) arg3 + this.field505) {
                    var6 = this.field506;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class68.method422(arg2, (int) ((long) arg1 + var6 - this.field505), this.field521, (int) (var6 - this.field506), var10);
                }
                this.field505 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field513 == -1L) {
                    this.field513 = this.field505;
                }
                class68.method422(arg2, arg1, this.field526, (int) (this.field505 - this.field513), arg3);
                this.field505 += (long) arg3;
                if ((this.field505 - this.field513) > ((long) this.field511)) {
                    this.field511 = (int) (this.field505 - this.field513);
                }
            }
        } catch (IOException var12) {
            this.field520 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Luj;II)V")
    public class32(class137 arg0, int arg1, int arg2) throws IOException {
        this.field518 = arg0;
        this.field519 = this.field522 = arg0.method857(108);
        this.field526 = new byte[arg2];
        this.field505 = 0L;
        this.field521 = new byte[arg1];
    }
}
