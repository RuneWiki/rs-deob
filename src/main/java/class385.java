import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class385 {

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "J")
    private long field5653 = -1L;

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "I")
    private int field5665 = 0;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "J")
    private long field5662 = -1L;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "Lrp;")
    private class300 field5654;

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "J")
    private long field5657;

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "J")
    private long field5666;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "J")
    private long field5648;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "[B")
    private byte[] field5661;

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[B")
    private byte[] field5669;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "I")
    public static int field5663 = 0;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Lbg;")
    public static class324 field5651 = new class324(8, -2);

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "I")
    private int field5668;

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!lq", name = "x", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "J")
    private long field5656;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([BI)V")
    public final void method2338(byte[] arg0, int arg1) throws IOException {
        this.method2347(arg0.length, (byte) 110, arg0, 0);
        int var3 = 69 / ((-arg1 - 2) / 41);
        field5650++;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Z)J")
    public final long method2339(boolean arg0) {
        if (!arg0) {
            this.method2349(-42);
        }
        field5667++;
        return this.field5666;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IB[BI)V")
    public final void method2340(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field5659++;
        try {
            if (arg1 <= 125) {
                method2341(null, -58, null);
            }
            if (this.field5666 < ((long) arg3 + this.field5648)) {
                this.field5666 = (long) arg3 + this.field5648;
            }
            if (this.field5653 != -1L && (this.field5653 > this.field5648 || this.field5648 > ((long) this.field5665 + this.field5653))) {
                this.method2348((byte) 48);
            }
            if (this.field5653 != -1L && ((long) arg3 + this.field5648) > ((long) this.field5661.length + this.field5653)) {
                int var5 = (int) (this.field5653 + (long) this.field5661.length - this.field5648);
                class201.method1412(arg2, arg0, this.field5661, (int) (this.field5648 - this.field5653), var5);
                arg0 += var5;
                this.field5648 += var5;
                arg3 -= var5;
                this.field5665 = this.field5661.length;
                this.method2348((byte) 48);
            }
            if (arg3 > this.field5661.length) {
                if (this.field5656 != this.field5648) {
                    this.field5654.method1889(this.field5648, 0);
                    this.field5656 = this.field5648;
                }
                this.field5654.method1885(arg0, arg3, arg2, 1);
                this.field5656 += arg3;
                if (this.field5656 > this.field5657) {
                    this.field5657 = this.field5656;
                }
                long var6 = -1L;
                long var8 = -1L;
                if (this.field5648 >= this.field5662 && ((long) this.field5668 + this.field5662) > this.field5648) {
                    var6 = this.field5648;
                } else if (this.field5662 >= this.field5648 && this.field5662 < ((long) arg3 + this.field5648)) {
                    var6 = this.field5662;
                }
                if (this.field5662 < ((long) arg3 + this.field5648) && (long) arg3 + this.field5648 <= (long) this.field5668 + this.field5662) {
                    var8 = (long) arg3 + this.field5648;
                } else if (((long) this.field5668 + this.field5662) > this.field5648 && this.field5648 + ((long) arg3) >= (long) this.field5668 + this.field5662) {
                    var8 = (long) this.field5668 + this.field5662;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class201.method1412(arg2, (int) ((long) arg0 + var6 - this.field5648), this.field5669, (int) (var6 - this.field5662), var10);
                }
                this.field5648 += arg3;
            } else if (arg3 > 0) {
                if (this.field5653 == -1L) {
                    this.field5653 = this.field5648;
                }
                class201.method1412(arg2, arg0, this.field5661, (int) (this.field5648 - this.field5653), arg3);
                this.field5648 += arg3;
                if (this.field5648 - this.field5653 > (long) this.field5665) {
                    this.field5665 = (int) (this.field5648 - this.field5653);
                }
            }
        } catch (IOException var12) {
            this.field5656 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lga;ILya;)V")
    public static final void method2341(class277 arg0, int arg1, class38 arg2) {
        field5649++;
        if (class399.field5889 == null) {
            return;
        }
        if (class228.field3318 < 10) {
            if (!class399.field5892.method2362(-1, class399.field5889.field4964)) {
                class228.field3318 = class161.field2270.method2372(class399.field5889.field4964, (byte) 33) / 10;
                return;
            }
            class305.method1899(false);
            class228.field3318 = 10;
        }
        if (class228.field3318 == 10) {
            class399.field5926 = class399.field5889.field4951 >> 6 << 6;
            class399.field5910 = class399.field5889.field4960 >> 6 << 6;
            class399.field5923 = (class399.field5889.field4956 >> 6 << 6) + 64 - class399.field5926;
            class399.field5927 = (class399.field5889.field4963 >> 6 << 6) + 64 - class399.field5910;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class399.field5889.method2146(false, var3, class435.field6375.field6328, (class435.field6375.field6334 >> 7) + class476.field7013, class340.field4713 - -(class435.field6375.field6335 >> 7))) {
                var4 = var3[1] - class399.field5926;
                var5 = var3[2] - class399.field5910;
            }
            if (!class403.field5973 && var4 >= 0 && class399.field5923 > var4 && var5 >= 0 && class399.field5927 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class63.field744 = var6;
                class512.field7555 = var7;
            } else if (class513.field7563 == -1 || class467.field6897 == -1) {
                class399.field5889.method2142(70, var3, class399.field5889.field4968 & 0x3FFF, (class399.field5889.field4968 & 0xFFFC7A6) >> 14);
                class512.field7555 = var3[2] - class399.field5910;
                class63.field744 = var3[1] - class399.field5926;
            } else {
                class399.field5889.method2142(61, var3, class467.field6897, class513.field7563);
                if (var3 != null) {
                    class63.field744 = var3[1] - class399.field5926;
                    class512.field7555 = var3[2] - class399.field5910;
                }
                class403.field5973 = false;
                class467.field6897 = -1;
                class513.field7563 = -1;
            }
            if (class399.field5889.field4958 == 37) {
                class399.field5902 = 3.0F;
                class399.field5905 = 3.0F;
            } else if (class399.field5889.field4958 == 50) {
                class399.field5902 = 4.0F;
                class399.field5905 = 4.0F;
            } else if (class399.field5889.field4958 == 75) {
                class399.field5902 = 6.0F;
                class399.field5905 = 6.0F;
            } else if (class399.field5889.field4958 == 100) {
                class399.field5902 = 8.0F;
                class399.field5905 = 8.0F;
            } else if (class399.field5889.field4958 == 200) {
                class399.field5902 = 16.0F;
                class399.field5905 = 16.0F;
            } else {
                class399.field5902 = 8.0F;
                class399.field5905 = 8.0F;
            }
            class399.field5899 = (int) class399.field5902 >> 1;
            class399.field5901 = class522.method3104(0, class399.field5899);
            class231.method1552(-1);
            class399.method2449();
            class274.field4042 = new class133();
            class399.field5898 += (int) (Math.random() * 5.0D) - 2;
            if (class399.field5898 < -8) {
                class399.field5898 = -8;
            }
            class399.field5907 += (int) (Math.random() * 5.0D) - 2;
            if (class399.field5898 > 8) {
                class399.field5898 = 8;
            }
            if (class399.field5907 < -16) {
                class399.field5907 = -16;
            }
            if (class399.field5907 > 16) {
                class399.field5907 = 16;
            }
            class399.method2459(arg0, class399.field5898 >> 2 << 10, class399.field5907 >> 1);
            class399.field5891.method844(256, false, 1024);
            class399.field5893.method2008(256, 256, 383137607);
            class399.field5897.method791(-27578, 4096);
            class29.field357.method1681(256, 55);
            class228.field3318 = 20;
        } else if (class228.field3318 == 20) {
            class473.method2860(-49, true);
            class399.method2445(arg2, class399.field5898, class399.field5907);
            class228.field3318 = 60;
            class473.method2860(-79, true);
            class350.method2108((byte) 111);
        } else {
            if (arg1 > -22) {
                field5663 = -21;
            }
            if (class228.field3318 == 60) {
                if (class399.field5892.method2366(class399.field5889.field4964 + "_staticelements", -1)) {
                    if (!class399.field5892.method2362(-1, class399.field5889.field4964 + "_staticelements")) {
                        return;
                    }
                    class399.field5900 = class434.method2633(class399.field5892, 48, class399.field5889.field4964 + "_staticelements", class49.field542);
                } else {
                    class399.field5900 = new class14(0);
                }
                class399.method2450();
                class228.field3318 = 70;
                class473.method2860(-71, true);
                class350.method2108((byte) 120);
            } else if (class228.field3318 == 70) {
                class21.field238 = new class191(arg2, 11, true, class148.field2081);
                class228.field3318 = 73;
                class473.method2860(-81, true);
                class350.method2108((byte) -2);
            } else if (class228.field3318 == 73) {
                class297.field4264 = new class191(arg2, 12, true, class148.field2081);
                class228.field3318 = 76;
                class473.method2860(-111, true);
                class350.method2108((byte) 111);
            } else if (class228.field3318 == 76) {
                class88.field1194 = new class191(arg2, 14, true, class148.field2081);
                class228.field3318 = 79;
                class473.method2860(-70, true);
                class350.method2108((byte) 108);
            } else if (class228.field3318 == 79) {
                class460.field6746 = new class191(arg2, 17, true, class148.field2081);
                class228.field3318 = 82;
                class473.method2860(-47, true);
                class350.method2108((byte) -26);
            } else if (class228.field3318 == 82) {
                class227.field3309 = new class191(arg2, 19, true, class148.field2081);
                class228.field3318 = 85;
                class473.method2860(-122, true);
                class350.method2108((byte) -61);
            } else if (class228.field3318 == 85) {
                class502.field7449 = new class191(arg2, 22, true, class148.field2081);
                class228.field3318 = 88;
                class473.method2860(-91, true);
                class350.method2108((byte) 16);
            } else if (class228.field3318 == 88) {
                class403.field5975 = new class191(arg2, 26, true, class148.field2081);
                class228.field3318 = 91;
                class473.method2860(-42, true);
                class350.method2108((byte) 1);
            } else {
                class282.field4108 = new class191(arg2, 30, true, class148.field2081);
                class228.field3318 = 100;
                class473.method2860(-73, true);
                class350.method2108((byte) 108);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IJ)V")
    public final void method2342(int arg0, long arg1) throws IOException {
        field5652++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2349(arg0 + 11127));
        }
        this.field5648 = arg1;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    private final void method2343(int arg0) throws IOException {
        this.field5668 = 0;
        field5664++;
        if (this.field5656 != this.field5648) {
            this.field5654.method1889(this.field5648, arg0 ^ 0xFFFF86C6);
            this.field5656 = this.field5648;
        }
        this.field5662 = this.field5648;
        if (arg0 != -31034) {
            return;
        }
        while (this.field5668 < this.field5669.length) {
            int var2 = this.field5669.length - this.field5668;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field5654.method1886(this.field5668, var2, this.field5669, (byte) -105);
            if (var3 == -1) {
                break;
            }
            this.field5656 += var3;
            this.field5668 += var3;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(III)Z")
    public static final boolean method2344(int arg0, int arg1, int arg2) {
        if (arg2 == 25926) {
            field5655++;
            return ((arg1 & 0x2000) != 0 | class37.method283(arg0, 97, arg1) | class276.method1774(arg0, (byte) 124, arg1)) & class91.method809(arg1, arg0, -122);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
    public static void method2345(int arg0) {
        if (arg0 == 22) {
            field5651 = null;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Z)V")
    public static final void method2346(boolean arg0) {
        class507.field7494 = 0;
        field5671++;
        int var1 = class85.field1163.method576((byte) -30);
        int var2 = class85.field1163.method635(952968608);
        int var3 = class85.field1163.method602((byte) 55);
        boolean var4 = class85.field1163.method607(27574) == 1;
        class525.method3116((byte) 71, var1);
        int var5 = (class26.field314 - class85.field1163.field827) / 16;
        class471.field6962 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class471.field6962[var6][var10] = class85.field1163.method616((byte) 113);
            }
        }
        class264.field3877 = new byte[var5][];
        class506.field7491 = new int[var5];
        class289.field4156 = new int[var5];
        class213.field3061 = new byte[var5][];
        class411.field6110 = new int[var5];
        class413.field6138 = new int[var5];
        class265.field3914 = new byte[var5][];
        class307.field4359 = null;
        class446.field6598 = new int[var5];
        class237.field3484 = new byte[var5][];
        class455.field6700 = null;
        int var7 = 0;
        for (int var8 = (var2 - (class397.field5828 >> 4)) / 8; var8 <= ((class397.field5828 >> 4) + var2) / 8; var8++) {
            for (int var9 = (var3 - (class457.field6713 >> 4)) / 8; var9 <= ((class457.field6713 >> 4) + var3) / 8; var9++) {
                class411.field6110[var7] = (var8 << 8) + var9;
                class413.field6138[var7] = class91.field1256.method2358("m" + var8 + "_" + var9, (byte) -111);
                class506.field7491[var7] = class91.field1256.method2358("l" + var8 + "_" + var9, (byte) 83);
                class289.field4156[var7] = class91.field1256.method2358("um" + var8 + "_" + var9, (byte) -86);
                class446.field6598[var7] = class91.field1256.method2358("ul" + var8 + "_" + var9, (byte) -116);
                var7++;
            }
        }
        class268.method1722(arg0, (byte) 104, var3, var2, var4);
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(IB[BI)V")
    public final void method2347(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        field5670++;
        try {
            if ((arg3 + arg0) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg3 + arg0 - arg2.length);
            }
            if (this.field5653 != -1L && this.field5653 <= this.field5648 && (long) this.field5665 + this.field5653 >= (long) arg0 + this.field5648) {
                class201.method1412(this.field5661, (int) (this.field5648 - this.field5653), arg2, arg3, arg0);
                this.field5648 += arg0;
                return;
            }
            long var5 = this.field5648;
            int var7 = arg3;
            int var8 = arg0;
            if (this.field5662 <= this.field5648 && this.field5648 < (this.field5662 + ((long) this.field5668))) {
                int var9 = (int) (this.field5662 + (long) this.field5668 - this.field5648);
                if (arg0 < var9) {
                    var9 = arg0;
                }
                class201.method1412(this.field5669, (int) (this.field5648 - this.field5662), arg2, arg3, var9);
                arg3 += var9;
                arg0 -= var9;
                this.field5648 += var9;
            }
            if (this.field5669.length < arg0) {
                this.field5654.method1889(this.field5648, 0);
                this.field5656 = this.field5648;
                while (arg0 > 0) {
                    int var11 = this.field5654.method1886(arg3, arg0, arg2, (byte) -102);
                    if (var11 == -1) {
                        break;
                    }
                    this.field5656 += var11;
                    this.field5648 += var11;
                    arg3 += var11;
                    arg0 -= var11;
                }
            } else if (arg0 > 0) {
                this.method2343(-31034);
                int var10 = arg0;
                if (this.field5668 < arg0) {
                    var10 = this.field5668;
                }
                class201.method1412(this.field5669, 0, arg2, arg3, var10);
                this.field5648 += var10;
                arg3 += var10;
                arg0 -= var10;
            }
            if (this.field5653 != -1L) {
                if (this.field5648 < this.field5653 && arg0 > 0) {
                    int var12 = (int) (this.field5653 - this.field5648) + arg3;
                    if (var12 > arg0 + arg3) {
                        var12 = arg0 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        arg0--;
                        this.field5648++;
                    }
                }
                long var13 = -1L;
                if (this.field5653 >= var5 && ((long) var8 + var5) > this.field5653) {
                    var13 = this.field5653;
                } else if (this.field5653 <= var5 && (this.field5653 + ((long) this.field5665)) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if ((long) this.field5665 + this.field5653 > var5 && ((long) this.field5665 + this.field5653) <= (var5 + ((long) var8))) {
                    var15 = (long) this.field5665 + this.field5653;
                } else if (this.field5653 < (long) var8 + var5 && var5 + ((long) var8) <= (long) this.field5665 + this.field5653) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class201.method1412(this.field5661, (int) (var13 - this.field5653), arg2, (int) (var13 - var5) + var7, var17);
                    if (var15 > this.field5648) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field5648));
                        this.field5648 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5656 = -1L;
            throw var19;
        }
        if (arg1 != 110) {
            field5651 = null;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
    private final void method2348(byte arg0) throws IOException {
        if (arg0 != 48) {
            return;
        }
        field5658++;
        if (this.field5653 == -1L) {
            return;
        }
        if (this.field5656 != this.field5653) {
            this.field5654.method1889(this.field5653, arg0 - 48);
            this.field5656 = this.field5653;
        }
        this.field5654.method1885(0, this.field5665, this.field5661, 1);
        this.field5656 += this.field5665;
        if (this.field5657 < this.field5656) {
            this.field5657 = this.field5656;
        }
        long var2 = -1L;
        long var4 = -1L;
        if (this.field5653 >= this.field5662 && this.field5662 + ((long) this.field5668) > this.field5653) {
            var2 = this.field5653;
        } else if (this.field5653 <= this.field5662 && (long) this.field5665 + this.field5653 > this.field5662) {
            var2 = this.field5662;
        }
        if ((this.field5653 + ((long) this.field5665)) > this.field5662 && (long) this.field5665 + this.field5653 <= (long) this.field5668 + this.field5662) {
            var4 = (long) this.field5665 + this.field5653;
        } else if (this.field5653 < ((long) this.field5668 + this.field5662) && ((long) this.field5665 + this.field5653) >= ((long) this.field5668 + this.field5662)) {
            var4 = (long) this.field5668 + this.field5662;
        }
        if (var2 > -1L && var4 > var2) {
            int var6 = (int) (var4 - var2);
            class201.method1412(this.field5661, (int) (var2 - this.field5653), this.field5669, (int) (var2 - this.field5662), var6);
        }
        this.field5653 = -1L;
        this.field5665 = 0;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)Ljava/io/File;")
    private final File method2349(int arg0) {
        field5660++;
        if (arg0 != 11127) {
            this.field5653 = 52L;
        }
        return this.field5654.method1887(-77);
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lrp;II)V")
    public class385(class300 arg0, int arg1, int arg2) throws IOException {
        this.field5654 = arg0;
        this.field5666 = this.field5657 = arg0.method1888(74);
        this.field5648 = 0L;
        this.field5661 = new byte[arg2];
        this.field5669 = new byte[arg1];
    }

    static {
        new class331("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
    }
}
