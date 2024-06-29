import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class152 {

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "J")
    private long field3477 = -1L;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "J")
    private long field3485 = -1L;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    private int field3500 = 0;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "Llb;")
    private class78 field3504;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "J")
    private long field3503;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "J")
    private long field3498;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "J")
    private long field3484;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "[B")
    private byte[] field3479;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "[B")
    private byte[] field3490;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lec;")
    private static class32 field3480 = class73.method594(" from your ignore list first", true);

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lec;")
    public static class32 field3483 = class73.method594("Verbindung abgebrochen)3", true);

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lec;")
    public static class32 field3488 = field3480;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field3489 = 0;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "Lec;")
    public static class32 field3501 = class73.method594("Cabbage", true);

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field3499 = 0;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[[S")
    public static short[][] field3491 = new short[][] { new short[0], { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "Lec;")
    public static class32 field3510 = class73.method594(":", true);

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    private int field3482;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field3505;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field3506;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "J")
    private long field3486;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lvf;")
    public static class152 field3502;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)J")
    public final long method1176(int arg0) {
        if (arg0 != 31274) {
            method1179(57, -31);
        }
        field3481++;
        return this.field3498;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([BBII)V")
    public final void method1177(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        field3505++;
        try {
            if ((long) arg2 + this.field3484 > this.field3498) {
                this.field3498 = this.field3484 + (long) arg2;
            }
            if (arg1 != 90) {
                this.field3479 = null;
            }
            if (this.field3485 != -1L && (this.field3485 > this.field3484 || this.field3484 > (long) this.field3500 + this.field3485)) {
                this.method1183(123);
            }
            if (this.field3485 != -1L && (long) arg2 + this.field3484 > (long) this.field3479.length + this.field3485) {
                int var5 = (int) ((long) this.field3479.length + this.field3485 - this.field3484);
                arg2 -= var5;
                class60.method458(arg0, arg3, this.field3479, (int) (this.field3484 - this.field3485), var5);
                this.field3484 += var5;
                arg3 += var5;
                this.field3500 = this.field3479.length;
                this.method1183(arg1 + 24);
            }
            if (arg2 > this.field3479.length) {
                if (this.field3486 != this.field3484) {
                    this.field3504.method621((byte) 127, this.field3484);
                    this.field3486 = this.field3484;
                }
                this.field3504.method624(arg0, arg1 - 206, arg3, arg2);
                long var6 = -1L;
                this.field3486 += arg2;
                long var8 = -1L;
                if (this.field3484 >= this.field3477 && (long) this.field3482 + this.field3477 > this.field3484) {
                    var6 = this.field3484;
                } else if (this.field3477 >= this.field3484 && (long) arg2 + this.field3484 > this.field3477) {
                    var6 = this.field3477;
                }
                if (this.field3477 < this.field3484 + (long) arg2 && (long) this.field3482 + this.field3477 >= (long) arg2 + this.field3484) {
                    var8 = (long) arg2 + this.field3484;
                } else if ((long) this.field3482 + this.field3477 > this.field3484 && (long) this.field3482 + this.field3477 <= (long) arg2 + this.field3484) {
                    var8 = (long) this.field3482 + this.field3477;
                }
                if (this.field3503 < this.field3486) {
                    this.field3503 = this.field3486;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class60.method458(arg0, (int) ((long) arg3 + var6 - this.field3484), this.field3490, (int) (var6 - this.field3477), var10);
                }
                this.field3484 += arg2;
            } else if (arg2 > 0) {
                if (this.field3485 == -1L) {
                    this.field3485 = this.field3484;
                }
                class60.method458(arg0, arg3, this.field3479, (int) (this.field3484 - this.field3485), arg2);
                this.field3484 += arg2;
                if (this.field3484 - this.field3485 > (long) this.field3500) {
                    this.field3500 = (int) (this.field3484 - this.field3485);
                }
            }
        } catch (IOException var12) {
            this.field3486 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)V")
    public static final void method1178(int arg0, byte arg1) {
        class73.field1725 = arg0;
        if (arg1 != 55) {
            field3510 = null;
        }
        class157.field3608 = -1;
        class98.field2265 = 1;
        field3492++;
        class34.field719 = null;
        class57.field1322 = 0;
        class121.field2872 = false;
        class126.field2930 = -1;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)Lee;")
    public static final class34 method1179(int arg0, int arg1) {
        class34 var2 = (class34) class2.field24.method486(-28825, (long) arg1);
        field3496++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -1) {
            method1187(-42);
        }
        byte[] var3 = class91.field2088.method206(1, arg1, -128);
        class34 var4 = new class34();
        if (var3 != null) {
            var4.method292(false, arg1, new class66(var3));
        }
        var4.method293((byte) 116);
        class2.field24.method485((long) arg1, (byte) -122, var4);
        return var4;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Ljava/io/File;")
    private final File method1180(int arg0) {
        field3509++;
        return arg0 == 0 ? this.field3504.method620(-92) : null;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)V")
    public final void method1181(int arg0) throws IOException {
        field3476++;
        this.method1183(arg0 ^ 0xFFFFC022);
        this.field3504.method625(0);
        if (arg0 != -16279) {
            method1178(-81, (byte) 26);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II[BI)V")
    public final void method1182(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field3507++;
        try {
            if (arg0 + arg3 > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg2.length);
            }
            if (this.field3485 != -1L && this.field3484 >= this.field3485 && (long) this.field3500 + this.field3485 >= (long) arg0 + this.field3484) {
                class60.method458(this.field3479, (int) (this.field3484 - this.field3485), arg2, arg3, arg0);
                this.field3484 += arg0;
                return;
            }
            if (arg1 != 7975) {
                return;
            }
            long var5 = this.field3484;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field3484 >= this.field3477 && (long) this.field3482 + this.field3477 > this.field3484) {
                int var9 = (int) ((long) this.field3482 + this.field3477 - this.field3484);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                arg0 -= var9;
                class60.method458(this.field3490, (int) (this.field3484 - this.field3477), arg2, arg3, var9);
                arg3 += var9;
                this.field3484 += var9;
            }
            if (arg0 > this.field3490.length) {
                this.field3504.method621((byte) 127, this.field3484);
                this.field3486 = this.field3484;
                while (arg0 > 0) {
                    int var11 = this.field3504.method622(arg3, arg2, -19789, arg0);
                    if (var11 == -1) {
                        break;
                    }
                    arg3 += var11;
                    arg0 -= var11;
                    this.field3486 += var11;
                    this.field3484 += var11;
                }
            } else if (arg0 > 0) {
                this.method1185((byte) 79);
                int var10 = arg0;
                if (arg0 > this.field3482) {
                    var10 = this.field3482;
                }
                class60.method458(this.field3490, 0, arg2, arg3, var10);
                arg0 -= var10;
                this.field3484 += var10;
                arg3 += var10;
            }
            if (this.field3485 != -1L) {
                if (this.field3484 < this.field3485 && arg0 > 0) {
                    int var12 = (int) (this.field3485 - this.field3484) + arg3;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (arg3 < var12) {
                        arg0--;
                        arg2[arg3++] = 0;
                        this.field3484++;
                    }
                }
                long var13 = -1L;
                if (var5 < (long) this.field3500 + this.field3485 && (long) this.field3500 + this.field3485 <= (long) var8 + var5) {
                    var13 = (long) this.field3500 + this.field3485;
                } else if (this.field3485 < (long) var8 + var5 && (long) var8 + var5 <= (long) this.field3500 + this.field3485) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field3485 >= var5 && (long) var8 + var5 > this.field3485) {
                    var15 = this.field3485;
                } else if (this.field3485 <= var5 && this.field3485 + (long) this.field3500 > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class60.method458(this.field3479, (int) (var15 - this.field3485), arg2, var7 + (int) (var15 - var5), var17);
                    if (this.field3484 < var13) {
                        arg0 = (int) ((long) arg0 + this.field3484 - var13);
                        this.field3484 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field3486 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    private final void method1183(int arg0) throws IOException {
        if (this.field3485 != -1L) {
            long var2 = -1L;
            if (this.field3486 != this.field3485) {
                this.field3504.method621((byte) 123, this.field3485);
                this.field3486 = this.field3485;
            }
            this.field3504.method624(this.field3479, 122, 0, this.field3500);
            if (this.field3477 <= this.field3485 && this.field3485 < (long) this.field3482 + this.field3477) {
                var2 = this.field3485;
            } else if (this.field3477 >= this.field3485 && this.field3477 < this.field3485 + (long) this.field3500) {
                var2 = this.field3477;
            }
            this.field3486 += this.field3500;
            if (this.field3503 < this.field3486) {
                this.field3503 = this.field3486;
            }
            long var4 = -1L;
            if ((long) this.field3500 + this.field3485 > this.field3477 && (long) this.field3482 + this.field3477 >= (long) this.field3500 + this.field3485) {
                var4 = (long) this.field3500 + this.field3485;
            } else if (this.field3485 < this.field3477 + (long) this.field3482 && (long) this.field3482 + this.field3477 <= this.field3485 - -((long) this.field3500)) {
                var4 = (long) this.field3482 + this.field3477;
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class60.method458(this.field3479, (int) (var2 - this.field3485), this.field3490, (int) (var2 - this.field3477), var6);
            }
            this.field3485 = -1L;
            this.field3500 = 0;
        }
        field3495++;
        if (arg0 < 21) {
            method1179(-30, 94);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([BI)V")
    public final void method1184(byte[] arg0, int arg1) throws IOException {
        this.method1182(arg0.length, 7975, arg0, arg1);
        field3494++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    private final void method1185(byte arg0) throws IOException {
        field3487++;
        this.field3482 = 0;
        int var2 = -29 % ((-arg0 - 75) / 45);
        if (this.field3486 != this.field3484) {
            this.field3504.method621((byte) 126, this.field3484);
            this.field3486 = this.field3484;
        }
        this.field3477 = this.field3484;
        while (this.field3482 < this.field3490.length) {
            int var3 = this.field3504.method622(this.field3482, this.field3490, -19789, this.field3490.length - this.field3482);
            if (var3 == -1) {
                break;
            }
            this.field3482 += var3;
            this.field3486 += var3;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BJ)V")
    public final void method1186(byte arg0, long arg1) throws IOException {
        field3497++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method1180(0));
        }
        int var4 = -18 % ((arg0 - 25) / 60);
        this.field3484 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
    public static void method1187(int arg0) {
        field3502 = null;
        field3483 = null;
        field3501 = null;
        field3491 = null;
        field3488 = null;
        if (arg0 > 36) {
            field3510 = null;
            field3480 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lec;I)V")
    public static final void method1188(class32 arg0, int arg1) {
        field3506++;
        if (class145.field3303 >= 2) {
            if (arg0.method271((byte) 105, class2.field28)) {
                System.gc();
            }
            if (arg0.method271((byte) 126, class86.field2014)) {
                class65.method504(-121);
            }
            if (arg0.method271((byte) 117, class84.field1970)) {
                class157.field3607 = true;
            }
            if (arg0.method271((byte) 112, class68.field1594)) {
                class157.field3607 = false;
            }
            if (arg0.method271((byte) 126, class20.field372)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class105.field2484[var2].field2813[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg0.method271((byte) 119, class43.field1001) && class70.field1647 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method262(class140.field3225, true)) {
                class92.field2118 = arg0.method268((byte) -15, 12).method275(-91).method261(48);
                class79.method629((byte) 98, class52.method403(new class32[] { class63.field1442, class159.method1230(class92.field2118, 0) }, (byte) -20), 0, null);
            }
            if (arg0.method271((byte) 102, class143.field3278)) {
                class146.field3320 = true;
            }
        }
        class44.field1027.method357(89, -90);
        class53.field1261++;
        if (arg1 < -16) {
            class44.field1027.method515((byte) 116, arg0.method240((byte) 24) - 1);
            class44.field1027.method522(arg0.method268((byte) -58, 2), (byte) 115);
        }
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public static final void method1189(int arg0) {
        field3493++;
        if (arg0 != 7965) {
            method1179(-70, 120);
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class119.field2851 - 1; var2++) {
                if (class44.field1035[var2] < 1000 && class44.field1035[var2 + 1] > 1000) {
                    class32 var3 = class56.field1296[var2];
                    var1 = false;
                    class56.field1296[var2] = class56.field1296[var2 + 1];
                    class56.field1296[var2 + 1] = var3;
                    class32 var4 = class109.field2577[var2];
                    class109.field2577[var2] = class109.field2577[var2 + 1];
                    class109.field2577[var2 + 1] = var4;
                    int var5 = class44.field1035[var2];
                    class44.field1035[var2] = class44.field1035[var2 + 1];
                    class44.field1035[var2 + 1] = var5;
                    int var6 = class121.field2870[var2];
                    class121.field2870[var2] = class121.field2870[var2 + 1];
                    class121.field2870[var2 + 1] = var6;
                    int var7 = class158.field3622[var2];
                    class158.field3622[var2] = class158.field3622[var2 + 1];
                    class158.field3622[var2 + 1] = var7;
                    int var8 = class135.field3137[var2];
                    class135.field3137[var2] = class135.field3137[var2 + 1];
                    class135.field3137[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(Llb;II)V")
    public class152(class78 arg0, int arg1, int arg2) throws IOException {
        this.field3504 = arg0;
        this.field3498 = this.field3503 = arg0.method623(82);
        this.field3484 = 0L;
        this.field3479 = new byte[arg2];
        this.field3490 = new byte[arg1];
    }
}
