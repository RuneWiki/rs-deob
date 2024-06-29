import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class322 {

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "J")
    private long field5620 = -1L;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    private int field5626 = 0;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "J")
    private long field5632 = -1L;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lla;")
    private class138 field5633;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "J")
    private long field5635;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "J")
    private long field5629;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "[B")
    private byte[] field5613;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "J")
    private long field5612;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "[B")
    private byte[] field5614;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "Z")
    public static boolean field5634 = true;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field5610;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    private int field5623;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field5625;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "J")
    private long field5622;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lak;")
    public static class311 field5615;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    public static int[] field5630;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 18)
    private final void method2263(byte arg0) throws IOException {
        this.field5623 = 0;
        int var2 = 59 % ((-arg0 - 38) / 46);
        field5621++;
        if (this.field5622 != this.field5612) {
            this.field5633.method873(this.field5612, 68);
            this.field5622 = this.field5612;
        }
        this.field5632 = this.field5612;
        while (this.field5614.length > this.field5623) {
            int var3 = this.field5614.length - this.field5623;
            if (var3 > 200000000) {
                var3 = 200000000;
            }
            int var4 = this.field5633.method871(var3, (byte) -120, this.field5614, this.field5623);
            if (var4 == -1) {
                break;
            }
            this.field5622 += (long) var4;
            this.field5623 += var4;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 67)
    private final void method2264(int arg0) throws IOException {
        field5628++;
        if (arg0 != -23327 || this.field5620 == -1L) {
            return;
        }
        if (this.field5622 != this.field5620) {
            this.field5633.method873(this.field5620, arg0 ^ 0xFFFFA492);
            this.field5622 = this.field5620;
        }
        this.field5633.method872(arg0 ^ 0xFFFFA4E0, this.field5613, this.field5626, 0);
        this.field5622 += (long) this.field5626;
        long var2 = -1L;
        if (this.field5632 <= this.field5620 && this.field5620 < (this.field5632 + ((long) this.field5623))) {
            var2 = this.field5620;
        } else if (this.field5620 <= this.field5632 && this.field5632 < (long) this.field5626 + this.field5620) {
            var2 = this.field5632;
        }
        long var4 = -1L;
        if (this.field5635 < this.field5622) {
            this.field5635 = this.field5622;
        }
        if (((long) this.field5626 + this.field5620) > this.field5632 && (this.field5632 + ((long) this.field5623)) >= (this.field5620 + ((long) this.field5626))) {
            var4 = (long) this.field5626 + this.field5620;
        } else if (this.field5620 < (this.field5632 + ((long) this.field5623)) && (long) this.field5623 + this.field5632 <= (long) this.field5626 + this.field5620) {
            var4 = (long) this.field5623 + this.field5632;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class187.method1243(this.field5613, (int) (var2 - this.field5620), this.field5614, (int) (var2 - this.field5632), var6);
        }
        this.field5626 = 0;
        this.field5620 = -1L;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IJ)V", line = 143)
    public final void method2265(int arg0, long arg1) throws IOException {
        field5619++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method2272(arg0 - 86));
        } else if (arg0 == -2) {
            this.field5612 = arg1;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[B)V", line = 166)
    public final void method2266(int arg0, byte[] arg1) throws IOException {
        field5631++;
        this.method2271(0, arg1.length, (byte) -99, arg1);
        if (arg0 > -106) {
            method2267(-119);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 179)
    public static final void method2267(int arg0) {
        if (arg0 != 0) {
            method2273((class291) null, -2);
        }
        field5616++;
        while (true) {
            class167 var1;
            class249 var3;
            do {
                var1 = (class167) class294.field5030.method1215((byte) -91);
                if (var1 == null) {
                    return;
                }
                if (var1.field2619 < 0) {
                    int var2 = -var1.field2619 - 1;
                    if (class27.field466 == var2) {
                        var3 = class85.field1176;
                    } else {
                        var3 = class22.field380[var2];
                    }
                } else {
                    int var4 = var1.field2619 - 1;
                    var3 = class40.field649[var4];
                }
            } while (var3 == null);
            class270 var5 = class242.method1656(var1.field2613, true);
            if (class23.field400 >= 3) {
            }
            int var6;
            int var7;
            if (var1.field2617 == 1 || var1.field2617 == 3) {
                var6 = var5.field4562;
                var7 = var5.field4618;
            } else {
                var6 = var5.field4618;
                var7 = var5.field4562;
            }
            int var8 = (var6 >> 1) + var1.field2616;
            int var9 = (var7 >> 1) + var1.field2615;
            int var10 = (var6 + 1 >> 1) + var1.field2616;
            int var11 = (var7 + 1 >> 1) + var1.field2615;
            int[][] var12 = class65.field984[class23.field400];
            int var13 = var12[var8][var9] + var12[var10][var9] + var12[var8][var11] + var12[var10][var11] >> 2;
            class73 var14 = null;
            int var15 = class69.field1008[var1.field2624];
            if (var15 == 0) {
                class294 var16 = class235.method1615(class23.field400, var1.field2616, var1.field2615);
                if (var16 != null) {
                    var14 = var16.field5026;
                }
            } else if (var15 == 1) {
                class275 var19 = class58.method383(class23.field400, var1.field2616, var1.field2615);
                if (var19 != null) {
                    var14 = var19.field4707;
                }
            } else if (var15 == 2) {
                class248 var17 = class289.method1943(class23.field400, var1.field2616, var1.field2615);
                if (var17 != null) {
                    var14 = var17.field4144;
                }
            } else if (var15 == 3) {
                class120 var18 = class163.method1096(class23.field400, var1.field2616, var1.field2615);
                if (var18 != null) {
                    var14 = var18.field1684;
                }
            }
            if (var14 != null) {
                class275.method1886(-1, 0, (byte) -109, var1.field2615, 0, var1.field2616, var1.field2622 + 1, var15, class23.field400, var1.field2621 + 1);
                var3.field4247 = var1.field2621 + class142.field2187;
                var3.field4264 = class142.field2187 + var1.field2622;
                var3.field4223 = var1.field2616 * 128 + var6 * 64;
                int var20 = var1.field2625;
                var3.field4221 = var1.field2615 * 128 + (var7 * 64);
                int var21 = var1.field2623;
                int var22 = var1.field2614;
                var3.field4225 = var13;
                var3.field4222 = var14;
                if (var21 < var20) {
                    int var23 = var20;
                    var20 = var21;
                    var21 = var23;
                }
                int var24 = var1.field2629;
                var3.field4252 = var1.field2616 + var21;
                var3.field4256 = var1.field2616 + var20;
                if (var24 > var22) {
                    int var25 = var24;
                    var24 = var22;
                    var22 = var25;
                }
                var3.field4193 = var1.field2615 + var24;
                var3.field4241 = var1.field2615 + var22;
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BZI)V", line = 345)
    public final void method2268(int arg0, byte[] arg1, boolean arg2, int arg3) throws IOException {
        field5627++;
        try {
            if (((long) arg3 + this.field5612) > this.field5629) {
                this.field5629 = (long) arg3 + this.field5612;
            }
            if (this.field5620 != -1L && (this.field5620 > this.field5612 || this.field5620 + ((long) this.field5626) < this.field5612)) {
                this.method2264(-23327);
            }
            if (arg2) {
                if (this.field5620 != -1L && this.field5612 + ((long) arg3) > this.field5620 - -((long) this.field5613.length)) {
                    int var5 = (int) ((long) this.field5613.length - (this.field5612 - this.field5620));
                    class187.method1243(arg1, arg0, this.field5613, (int) (this.field5612 - this.field5620), var5);
                    arg0 += var5;
                    this.field5612 += (long) var5;
                    this.field5626 = this.field5613.length;
                    this.method2264(-23327);
                    arg3 -= var5;
                }
                if (arg3 > this.field5613.length) {
                    if (this.field5622 != this.field5612) {
                        this.field5633.method873(this.field5612, 84);
                        this.field5622 = this.field5612;
                    }
                    long var6 = -1L;
                    long var8 = -1L;
                    this.field5633.method872(1, arg1, arg3, arg0);
                    if (((long) arg3 + this.field5612) > this.field5632 && this.field5612 + ((long) arg3) <= (long) this.field5623 + this.field5632) {
                        var6 = (long) arg3 + this.field5612;
                    } else if (this.field5612 < (this.field5632 + ((long) this.field5623)) && ((long) arg3 + this.field5612) >= ((long) this.field5623 + this.field5632)) {
                        var6 = (long) this.field5623 + this.field5632;
                    }
                    if (this.field5632 <= this.field5612 && this.field5612 < ((long) this.field5623 + this.field5632)) {
                        var8 = this.field5612;
                    } else if (this.field5612 <= this.field5632 && this.field5612 + ((long) arg3) > this.field5632) {
                        var8 = this.field5632;
                    }
                    this.field5622 += (long) arg3;
                    if (this.field5622 > this.field5635) {
                        this.field5635 = this.field5622;
                    }
                    if (var8 > -1L && var6 > var8) {
                        int var10 = (int) (var6 - var8);
                        class187.method1243(arg1, (int) ((long) arg0 + var8 - this.field5612), this.field5614, (int) (var8 - this.field5632), var10);
                    }
                    this.field5612 += (long) arg3;
                } else if (arg3 > 0) {
                    if (this.field5620 == -1L) {
                        this.field5620 = this.field5612;
                    }
                    class187.method1243(arg1, arg0, this.field5613, (int) (this.field5612 - this.field5620), arg3);
                    this.field5612 += (long) arg3;
                    if ((long) this.field5626 < this.field5612 - this.field5620) {
                        this.field5626 = (int) (this.field5612 - this.field5620);
                    }
                }
            }
        } catch (IOException var12) {
            this.field5622 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V", line = 469)
    public static void method2269(boolean arg0) {
        if (arg0) {
            field5615 = (class311) null;
        }
        field5630 = null;
        field5615 = null;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V", line = 482)
    public final void method2270(byte arg0) throws IOException {
        field5617++;
        int var2 = -79 % ((-arg0 - 60) / 59);
        this.method2264(-23327);
        this.field5633.method874(-116);
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lla;II)V", line = 746)
    public class322(class138 arg0, int arg1, int arg2) throws IOException {
        this.field5633 = arg0;
        this.field5629 = this.field5635 = arg0.method876(-1);
        this.field5613 = new byte[arg2];
        this.field5612 = 0L;
        this.field5614 = new byte[arg1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIB[B)V", line = 507)
    public final void method2271(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        field5618++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field5620 != -1L && this.field5620 <= this.field5612 && (long) this.field5626 + this.field5620 >= this.field5612 - -((long) arg1)) {
                class187.method1243(this.field5613, (int) (this.field5612 - this.field5620), arg3, arg0, arg1);
                this.field5612 += (long) arg1;
                return;
            }
            long var5 = this.field5612;
            int var7 = arg0;
            int var8 = arg1;
            if (arg2 != -99) {
                return;
            }
            if (this.field5612 >= this.field5632 && this.field5632 + ((long) this.field5623) > this.field5612) {
                int var9 = (int) ((long) this.field5623 + this.field5632 - this.field5612);
                if (var9 > arg1) {
                    var9 = arg1;
                }
                class187.method1243(this.field5614, (int) (this.field5612 - this.field5632), arg3, arg0, var9);
                arg0 += var9;
                arg1 -= var9;
                this.field5612 += (long) var9;
            }
            if (arg1 > this.field5614.length) {
                this.field5633.method873(this.field5612, 95);
                this.field5622 = this.field5612;
                while (arg1 > 0) {
                    int var10 = this.field5633.method871(arg1, (byte) 61, arg3, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field5622 += (long) var10;
                    arg1 -= var10;
                    arg0 += var10;
                    this.field5612 += (long) var10;
                }
            } else if (arg1 > 0) {
                int var11 = arg1;
                this.method2263((byte) -117);
                if (arg1 > this.field5623) {
                    var11 = this.field5623;
                }
                arg1 -= var11;
                class187.method1243(this.field5614, 0, arg3, arg0, var11);
                arg0 += var11;
                this.field5612 += (long) var11;
            }
            if (this.field5620 != -1L) {
                if (this.field5612 < this.field5620 && arg1 > 0) {
                    int var12 = arg0 + ((int) (this.field5620 - this.field5612));
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg0 + arg1;
                    }
                    while (var12 > arg0) {
                        arg3[arg0++] = 0;
                        this.field5612++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if ((long) this.field5626 + this.field5620 > var5 && this.field5620 + ((long) this.field5626) <= (long) var8 + var5) {
                    var13 = (long) this.field5626 + this.field5620;
                } else if ((long) var8 + var5 > this.field5620 && ((long) var8 + var5) <= ((long) this.field5626 + this.field5620)) {
                    var13 = (long) var8 + var5;
                }
                long var15 = -1L;
                if (this.field5620 >= var5 && var5 + ((long) var8) > this.field5620) {
                    var15 = this.field5620;
                } else if (var5 >= this.field5620 && (this.field5620 + ((long) this.field5626)) > var5) {
                    var15 = var5;
                }
                if (var15 > -1L && var15 < var13) {
                    int var17 = (int) (var13 - var15);
                    class187.method1243(this.field5613, (int) (var15 - this.field5620), arg3, (int) (var15 - var5) + var7, var17);
                    if (this.field5612 < var13) {
                        arg1 = (int) ((long) arg1 - (var13 - this.field5612));
                        this.field5612 = var13;
                    }
                }
            }
        } catch (IOException var19) {
            this.field5622 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)Ljava/io/File;", line = 690)
    private final File method2272(int arg0) {
        if (arg0 > -76) {
            return (File) null;
        } else {
            field5625++;
            return this.field5633.method875(121);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lhi;I)Lnj;", line = 706)
    public static final class225 method2273(class291 arg0, int arg1) {
        class225 var2 = new class225();
        if (arg1 != -3018) {
            method2273((class291) null, -98);
        }
        field5610++;
        var2.field3654 = arg0.method2021((byte) 74);
        var2.field3651 = class22.method177(1, var2.field3654);
        return var2;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)J", line = 723)
    public final long method2274(byte arg0) {
        field5624++;
        if (arg0 != -2) {
            field5630 = (int[]) null;
        }
        return this.field5629;
    }
}
