import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class211 {

    @OriginalMember(owner = "client!rb", name = "q", descriptor = "J")
    private long field3554 = -1L;

    @OriginalMember(owner = "client!rb", name = "F", descriptor = "J")
    private long field3569 = -1L;

    @OriginalMember(owner = "client!rb", name = "D", descriptor = "I")
    private int field3567 = 0;

    @OriginalMember(owner = "client!rb", name = "m", descriptor = "Lqk;")
    private class57 field3550;

    @OriginalMember(owner = "client!rb", name = "v", descriptor = "J")
    private long field3559;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "J")
    private long field3539;

    @OriginalMember(owner = "client!rb", name = "y", descriptor = "[B")
    private byte[] field3562;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "[B")
    private byte[] field3542;

    @OriginalMember(owner = "client!rb", name = "r", descriptor = "J")
    private long field3555;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "Z")
    public static boolean field3541 = false;

    @OriginalMember(owner = "client!rb", name = "p", descriptor = "Lcd;")
    public static class64 field3553 = class44.method335((byte) 71, "Opened titlescreen)3");

    @OriginalMember(owner = "client!rb", name = "C", descriptor = "Lcd;")
    private static class64 field3566 = class44.method335((byte) 71, "Loaded textures");

    @OriginalMember(owner = "client!rb", name = "E", descriptor = "[I")
    public static int[] field3568 = new int[2];

    @OriginalMember(owner = "client!rb", name = "x", descriptor = "Lcd;")
    public static class64 field3561 = field3566;

    @OriginalMember(owner = "client!rb", name = "u", descriptor = "Lig;")
    public static class168 field3558 = new class168(500);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!rb", name = "j", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!rb", name = "l", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!rb", name = "n", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!rb", name = "o", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!rb", name = "s", descriptor = "I")
    private int field3556;

    @OriginalMember(owner = "client!rb", name = "t", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!rb", name = "w", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!rb", name = "z", descriptor = "I")
    public static int field3563;

    @OriginalMember(owner = "client!rb", name = "A", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!rb", name = "B", descriptor = "J")
    private long field3565;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "[I")
    public static int[] field3540;

    @OriginalMember(owner = "client!rb", name = "i", descriptor = "[Lqd;")
    public static class40[] field3546;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B)J", line = 6)
    public final long method1480(byte arg0) {
        if (arg0 != -110) {
            this.field3542 = (byte[]) null;
        }
        field3545++;
        return this.field3539;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V", line = 25)
    public static final void method1481(int arg0) {
        if (!class101.field1828) {
            class289.field4934[0] = 1006;
            class220.field3736 = 1;
            class153.field2715[0] = class53.field852;
            class69.field1334[0] = class188.field3240;
            if (class200.field3425 != 0) {
                class278.field4789 = class306.field5219;
                class245.field4259 = class36.field581;
            } else if (class232.field3916 == 0) {
                class278.field4789 = class281.field4835;
                class245.field4259 = class188.field3213;
            } else {
                class278.field4789 = class268.field4609;
                class245.field4259 = class238.field4061;
            }
        }
        field3548++;
        if (class83.field1524 != -1) {
            class120.method846(class83.field1524, -105);
        }
        for (int var1 = 0; var1 < class241.field4161; var1++) {
            if (class249.field4328[var1]) {
                class267.field4582[var1] = true;
            }
            class117.field2137[var1] = class249.field4328[var1];
            class249.field4328[var1] = false;
        }
        class304.field5201 = -1;
        class69.field1328 = null;
        class49.field810 = -1;
        if (class123.field2216) {
            class149.field2617 = true;
        }
        class66.field1308 = class29.field482;
        if (class83.field1524 != -1) {
            class241.field4161 = 0;
            class264.method1854(0, class58.field960, 0, -1, 15706, class13.field290, class83.field1524, 0, 0);
        }
        if (class123.field2216) {
            class21.method203();
        } else {
            class210.method1458();
        }
        class137.method985((byte) -125);
        if (class101.field1828) {
            class236.method1691(112);
        } else if (class304.field5201 != -1) {
            class275.method1907(class49.field810, 114, class304.field5201);
        }
        if (class126.field2264 == 3) {
            for (int var2 = 0; var2 < class241.field4161; var2++) {
                if (class117.field2137[var2]) {
                    if (class123.field2216) {
                        class21.method206(class194.field3300[var2], class230.field3900[var2], class134.field2379[var2], class47.field771[var2], 16711935, 128);
                    } else {
                        class210.method1464(class194.field3300[var2], class230.field3900[var2], class134.field2379[var2], class47.field771[var2], 16711935, 128);
                    }
                } else if (class267.field4582[var2]) {
                    if (class123.field2216) {
                        class21.method206(class194.field3300[var2], class230.field3900[var2], class134.field2379[var2], class47.field771[var2], 16711680, 128);
                    } else {
                        class210.method1464(class194.field3300[var2], class230.field3900[var2], class134.field2379[var2], class47.field771[var2], 16711680, 128);
                    }
                }
            }
        }
        class44.method337(class20.field364, class139.field2472.field1865, (byte) 115, class139.field2472.field1859, class249.field4327);
        if (arg0 < 101) {
            field3553 = (class64) null;
        }
        class249.field4327 = 0;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IIIIZIZ)V", line = 144)
    public static final void method1482(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg1 != -1) {
            method1491(-56, -77, (class64) null);
        }
        if (arg2 > arg0) {
            int var7 = (arg0 + arg2) / 2;
            int var8 = arg0;
            class9 var9 = class297.field5122[var7];
            class297.field5122[var7] = class297.field5122[arg2];
            class297.field5122[arg2] = var9;
            for (int var10 = arg0; var10 < arg2; var10++) {
                if (class289.method1994(arg4, var9, arg6, arg5, (byte) -121, arg3, class297.field5122[var10]) <= 0) {
                    class9 var11 = class297.field5122[var10];
                    class297.field5122[var10] = class297.field5122[var8];
                    class297.field5122[var8++] = var11;
                }
            }
            class297.field5122[arg2] = class297.field5122[var8];
            class297.field5122[var8] = var9;
            method1482(arg0, -1, var8 - 1, arg3, arg4, arg5, arg6);
            method1482(var8 + 1, -1, arg2, arg3, arg4, arg5, arg6);
        }
        field3551++;
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(B)V", line = 195)
    private final void method1483(byte arg0) throws IOException {
        this.field3556 = 0;
        field3563++;
        if (arg0 != -65) {
            this.field3542 = (byte[]) null;
        }
        if (this.field3565 != this.field3555) {
            this.field3550.method438(-125, this.field3555);
            this.field3565 = this.field3555;
        }
        this.field3554 = this.field3555;
        while (this.field3556 < this.field3542.length) {
            int var2 = this.field3542.length - this.field3556;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field3550.method440(var2, this.field3542, true, this.field3556);
            if (var3 == -1) {
                break;
            }
            this.field3556 += var3;
            this.field3565 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)V", line = 238)
    public static void method1484(int arg0) {
        field3566 = null;
        field3553 = null;
        field3558 = null;
        field3546 = null;
        field3568 = null;
        field3540 = null;
        field3561 = null;
        if (arg0 != 9109) {
            field3541 = false;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(B[B)V", line = 254)
    public final void method1485(byte arg0, byte[] arg1) throws IOException {
        this.method1487(0, 200000000, arg1, arg1.length);
        if (arg0 < 67) {
            method1481(-14);
        }
        field3549++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[BI)V", line = 281)
    public final void method1486(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3543++;
        try {
            if (this.field3539 < ((long) arg3 + this.field3555)) {
                this.field3539 = (long) arg3 + this.field3555;
            }
            if ((long) arg1 != this.field3569 && (this.field3555 < this.field3569 || (long) this.field3567 + this.field3569 < this.field3555)) {
                this.method1488(255);
            }
            if (this.field3569 != -1L && ((long) this.field3562.length + this.field3569) < ((long) arg3 + this.field3555)) {
                int var5 = (int) (this.field3569 + (long) this.field3562.length - this.field3555);
                class95.method721(arg2, arg0, this.field3562, (int) (this.field3555 - this.field3569), var5);
                this.field3555 += (long) var5;
                arg3 -= var5;
                arg0 += var5;
                this.field3567 = this.field3562.length;
                this.method1488(255);
            }
            if (arg3 > this.field3562.length) {
                if (this.field3565 != this.field3555) {
                    this.field3550.method438(-116, this.field3555);
                    this.field3565 = this.field3555;
                }
                this.field3550.method436(arg0, 119, arg3, arg2);
                long var6 = -1L;
                this.field3565 += (long) arg3;
                long var8 = -1L;
                if (this.field3565 > this.field3559) {
                    this.field3559 = this.field3565;
                }
                if (this.field3555 >= this.field3554 && this.field3555 < ((long) this.field3556 + this.field3554)) {
                    var6 = this.field3555;
                } else if (this.field3554 >= this.field3555 && ((long) arg3 + this.field3555) > this.field3554) {
                    var6 = this.field3554;
                }
                if (this.field3554 < (long) arg3 + this.field3555 && ((long) arg3 + this.field3555) <= ((long) this.field3556 + this.field3554)) {
                    var8 = this.field3555 + ((long) arg3);
                } else if (this.field3555 < (long) this.field3556 + this.field3554 && (long) this.field3556 + this.field3554 <= this.field3555 - -((long) arg3)) {
                    var8 = (long) this.field3556 + this.field3554;
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class95.method721(arg2, (int) ((long) arg0 + var6 - this.field3555), this.field3542, (int) (var6 - this.field3554), var10);
                }
                this.field3555 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field3569 == -1L) {
                    this.field3569 = this.field3555;
                }
                class95.method721(arg2, arg0, this.field3562, (int) (this.field3555 - this.field3569), arg3);
                this.field3555 += (long) arg3;
                if (((long) this.field3567) < (this.field3555 - this.field3569)) {
                    this.field3567 = (int) (this.field3555 - this.field3569);
                }
            }
        } catch (IOException var12) {
            this.field3565 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "(II[BI)V", line = 403)
    public final void method1487(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3544++;
        try {
            if (arg2.length < (arg0 + arg3)) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg3 - arg2.length);
            }
            if (this.field3569 != -1L && this.field3555 >= this.field3569 && (long) arg3 + this.field3555 <= (long) this.field3567 + this.field3569) {
                class95.method721(this.field3562, (int) (this.field3555 - this.field3569), arg2, arg0, arg3);
                this.field3555 += (long) arg3;
                return;
            }
            long var5 = this.field3555;
            int var7 = arg0;
            if (arg1 != 200000000) {
                this.field3556 = -32;
            }
            int var8 = arg3;
            if (this.field3554 <= this.field3555 && ((long) this.field3556 + this.field3554) > this.field3555) {
                int var9 = (int) (this.field3554 + (long) this.field3556 - this.field3555);
                if (var9 > arg3) {
                    var9 = arg3;
                }
                class95.method721(this.field3542, (int) (this.field3555 - this.field3554), arg2, arg0, var9);
                this.field3555 += (long) var9;
                arg0 += var9;
                arg3 -= var9;
            }
            if (this.field3542.length < arg3) {
                this.field3550.method438(arg1 - 200000118, this.field3555);
                this.field3565 = this.field3555;
                while (arg3 > 0) {
                    int var10 = this.field3550.method440(arg3, arg2, true, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field3565 += (long) var10;
                    arg3 -= var10;
                    arg0 += var10;
                    this.field3555 += (long) var10;
                }
            } else if (arg3 > 0) {
                this.method1483((byte) -65);
                int var11 = arg3;
                if (this.field3556 < arg3) {
                    var11 = this.field3556;
                }
                class95.method721(this.field3542, 0, arg2, arg0, var11);
                arg0 += var11;
                this.field3555 += (long) var11;
                arg3 -= var11;
            }
            if (this.field3569 != -1L) {
                if (this.field3569 > this.field3555 && arg3 > 0) {
                    int var12 = (int) (this.field3569 - this.field3555) + arg0;
                    if (var12 > (arg0 + arg3)) {
                        var12 = arg0 + arg3;
                    }
                    while (arg0 < var12) {
                        arg3--;
                        arg2[arg0++] = 0;
                        this.field3555++;
                    }
                }
                long var13 = -1L;
                long var15 = -1L;
                if (var5 <= this.field3569 && ((long) var8 + var5) > this.field3569) {
                    var13 = this.field3569;
                } else if (var5 >= this.field3569 && ((long) this.field3567 + this.field3569) > var5) {
                    var13 = var5;
                }
                if (var5 < ((long) this.field3567 + this.field3569) && ((long) var8 + var5) >= ((long) this.field3567 + this.field3569)) {
                    var15 = (long) this.field3567 + this.field3569;
                } else if (this.field3569 < (long) var8 + var5 && ((long) this.field3567 + this.field3569) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class95.method721(this.field3562, (int) (var13 - this.field3569), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field3555) {
                        arg3 = (int) ((long) arg3 - (var15 - this.field3555));
                        this.field3555 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3565 = -1L;
            throw var19;
        }
        if (arg3 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(I)V", line = 587)
    private final void method1488(int arg0) throws IOException {
        field3547++;
        if (arg0 != 255 || this.field3569 == -1L) {
            return;
        }
        if (this.field3569 != this.field3565) {
            this.field3550.method438(arg0 - 383, this.field3569);
            this.field3565 = this.field3569;
        }
        this.field3550.method436(0, 118, this.field3567, this.field3562);
        this.field3565 += (long) this.field3567;
        long var2 = -1L;
        if (this.field3559 < this.field3565) {
            this.field3559 = this.field3565;
        }
        if ((this.field3569 + ((long) this.field3567)) > this.field3554 && (long) this.field3567 + this.field3569 <= (long) this.field3556 + this.field3554) {
            var2 = (long) this.field3567 + this.field3569;
        } else if ((this.field3554 + ((long) this.field3556)) > this.field3569 && this.field3554 + ((long) this.field3556) <= (long) this.field3567 + this.field3569) {
            var2 = (long) this.field3556 + this.field3554;
        }
        long var4 = -1L;
        if (this.field3569 >= this.field3554 && this.field3569 < ((long) this.field3556 + this.field3554)) {
            var4 = this.field3569;
        } else if (this.field3569 <= this.field3554 && this.field3569 + ((long) this.field3567) > this.field3554) {
            var4 = this.field3554;
        }
        if (var4 > -1L && var4 < var2) {
            int var6 = (int) (var2 - var4);
            class95.method721(this.field3562, (int) (var4 - this.field3569), this.field3542, (int) (var4 - this.field3554), var6);
        }
        this.field3567 = 0;
        this.field3569 = -1L;
    }

    @OriginalMember(owner = "client!rb", name = "<init>", descriptor = "(Lqk;II)V", line = 766)
    public class211(class57 arg0, int arg1, int arg2) throws IOException {
        this.field3550 = arg0;
        this.field3539 = this.field3559 = arg0.method439(-5);
        this.field3562 = new byte[arg2];
        this.field3542 = new byte[arg1];
        this.field3555 = 0L;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)Ljava/io/File;", line = 681)
    private final File method1489(boolean arg0) {
        if (arg0) {
            return (File) null;
        } else {
            field3557++;
            return this.field3550.method437(-24053);
        }
    }

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "(B)V", line = 693)
    public final void method1490(byte arg0) throws IOException {
        field3560++;
        this.method1488(arg0 ^ 0x94);
        if (arg0 != 107) {
            this.field3565 = -81L;
        }
        this.field3550.method441(66);
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILcd;)V", line = 706)
    public static final void method1491(int arg0, int arg1, class64 arg2) {
        class17.field353.method1214(-96, 222);
        class17.field353.method161((byte) 99, arg2.method509(31492));
        class232.field3913++;
        class17.field353.method123(arg1, (byte) 95);
        if (arg0 != 4626) {
            field3546 = (class40[]) null;
        }
        field3552++;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(JZ)V", line = 723)
    public final void method1492(long arg0, boolean arg1) throws IOException {
        field3538++;
        if (!arg1) {
            this.field3539 = 24L;
        }
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method1489(false));
        }
        this.field3555 = arg0;
    }
}
