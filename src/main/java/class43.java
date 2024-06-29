import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class43 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "J")
    private long field709 = -1L;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "J")
    private long field711 = -1L;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    private int field716 = 0;

    @OriginalMember(owner = "client!hc", name = "x", descriptor = "Laa;")
    private class168 field728;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "J")
    private long field718;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "J")
    private long field723;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[B")
    private byte[] field706;

    @OriginalMember(owner = "client!hc", name = "y", descriptor = "J")
    private long field729;

    @OriginalMember(owner = "client!hc", name = "u", descriptor = "[B")
    private byte[] field725;

    @OriginalMember(owner = "client!hc", name = "t", descriptor = "[I")
    public static int[] field724 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field705;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "I")
    public static int field707;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field710;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public static int field712;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field713;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field714;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field715;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field717;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!hc", name = "v", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!hc", name = "w", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!hc", name = "z", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!hc", name = "A", descriptor = "I")
    private int field731;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "J")
    private long field720;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "[[I")
    public static int[][] field721;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[B)V")
    public final void method336(int arg0, byte[] arg1) throws IOException {
        this.method343(arg1.length, arg0, arg1, 121);
        field714++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)Z")
    public static final boolean method337(int arg0, int arg1) {
        field712++;
        if (arg0 != 27065) {
            field705 = -13;
        }
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)Ljava/io/File;")
    private final File method338(int arg0) {
        if (arg0 <= 52) {
            return null;
        } else {
            field726++;
            return this.field728.method1202(123);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
    private final void method339(int arg0) throws IOException {
        field708++;
        if (arg0 != 10441) {
            this.method348(116);
        }
        this.field731 = 0;
        if (this.field729 != this.field720) {
            this.field728.method1198(-2389, this.field729);
            this.field720 = this.field729;
        }
        this.field711 = this.field729;
        while (this.field725.length > this.field731) {
            int var2 = this.field725.length - this.field731;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field728.method1197(this.field731, 0, this.field725, var2);
            if (var3 == -1) {
                break;
            }
            this.field731 += var3;
            this.field720 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II[BI)V")
    public final void method340(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field722++;
        if (arg1 != 7559) {
            method347(78);
        }
        try {
            if ((long) arg3 + this.field729 > this.field723) {
                this.field723 = (long) arg3 + this.field729;
            }
            if (this.field709 != -1L && (this.field709 > this.field729 || ((long) this.field716 + this.field709) < this.field729)) {
                this.method346(-1);
            }
            if (this.field709 != -1L && ((long) this.field706.length + this.field709) < (this.field729 + ((long) arg3))) {
                int var5 = (int) (this.field709 - (this.field729 - (long) this.field706.length));
                arg3 -= var5;
                class66.method463(arg2, arg0, this.field706, (int) (this.field729 - this.field709), var5);
                arg0 += var5;
                this.field729 += (long) var5;
                this.field716 = this.field706.length;
                this.method346(-1);
            }
            if (this.field706.length < arg3) {
                if (this.field729 != this.field720) {
                    this.field728.method1198(-2389, this.field729);
                    this.field720 = this.field729;
                }
                long var6 = -1L;
                this.field728.method1201(arg3, 1, arg2, arg0);
                this.field720 += (long) arg3;
                if (this.field729 >= this.field711 && this.field729 < ((long) this.field731 + this.field711)) {
                    var6 = this.field729;
                } else if (this.field711 >= this.field729 && this.field711 < this.field729 + ((long) arg3)) {
                    var6 = this.field711;
                }
                long var8 = -1L;
                if (this.field718 < this.field720) {
                    this.field718 = this.field720;
                }
                if ((this.field729 + ((long) arg3)) > this.field711 && (long) arg3 + this.field729 <= this.field711 - -((long) this.field731)) {
                    var8 = (long) arg3 + this.field729;
                } else if ((this.field711 + ((long) this.field731)) > this.field729 && (long) arg3 + this.field729 >= (long) this.field731 + this.field711) {
                    var8 = (long) this.field731 + this.field711;
                }
                if (var6 > -1L && var6 < var8) {
                    int var10 = (int) (var8 - var6);
                    class66.method463(arg2, (int) ((long) arg0 + var6 - this.field729), this.field725, (int) (var6 - this.field711), var10);
                }
                this.field729 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field709 == -1L) {
                    this.field709 = this.field729;
                }
                class66.method463(arg2, arg0, this.field706, (int) (this.field729 - this.field709), arg3);
                this.field729 += (long) arg3;
                if (((long) this.field716) < (this.field729 - this.field709)) {
                    this.field716 = (int) (this.field729 - this.field709);
                }
            }
        } catch (IOException var12) {
            this.field720 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Ltg;III)Z")
    public static final boolean method341(class75 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method571(arg2, arg3, arg1 ^ 0xFFFFFF87);
        field717++;
        if (arg1 != -1) {
            return true;
        } else if (var4 == null) {
            return false;
        } else {
            class84.method632((byte) 120, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IJ)V")
    public final void method342(int arg0, long arg1) throws IOException {
        field727++;
        if (arg1 < 0L) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method338(97));
        }
        this.field729 = arg1;
        if (arg0 != 4) {
            method347(-96);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(II[BI)V")
    public final void method343(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field707++;
        try {
            if (arg2.length < (arg1 + arg0)) {
                throw new ArrayIndexOutOfBoundsException(arg1 - (arg2.length - arg0));
            }
            if (this.field709 != -1L && this.field729 >= this.field709 && (long) this.field716 + this.field709 >= this.field729 - -((long) arg0)) {
                class66.method463(this.field706, (int) (this.field729 - this.field709), arg2, arg1, arg0);
                this.field729 += (long) arg0;
                return;
            }
            long var5 = this.field729;
            if (arg3 <= 55) {
                this.field709 = 27L;
            }
            int var7 = arg1;
            int var8 = arg0;
            if (this.field711 <= this.field729 && (this.field711 + ((long) this.field731)) > this.field729) {
                int var9 = (int) ((long) this.field731 + this.field711 - this.field729);
                if (var9 > arg0) {
                    var9 = arg0;
                }
                class66.method463(this.field725, (int) (this.field729 - this.field711), arg2, arg1, var9);
                arg1 += var9;
                this.field729 += (long) var9;
                arg0 -= var9;
            }
            if (arg0 > this.field725.length) {
                this.field728.method1198(-2389, this.field729);
                this.field720 = this.field729;
                while (arg0 > 0) {
                    int var10 = this.field728.method1197(arg1, 0, arg2, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field720 += (long) var10;
                    arg1 += var10;
                    this.field729 += (long) var10;
                    arg0 -= var10;
                }
            } else if (arg0 > 0) {
                this.method339(10441);
                int var11 = arg0;
                if (this.field731 < arg0) {
                    var11 = this.field731;
                }
                arg0 -= var11;
                class66.method463(this.field725, 0, arg2, arg1, var11);
                arg1 += var11;
                this.field729 += (long) var11;
            }
            if (this.field709 != -1L) {
                if (this.field729 < this.field709 && arg0 > 0) {
                    int var12 = (int) (this.field709 - this.field729) + arg1;
                    if (var12 > arg0 + arg1) {
                        var12 = arg1 + arg0;
                    }
                    while (arg1 < var12) {
                        arg0--;
                        arg2[arg1++] = 0;
                        this.field729++;
                    }
                }
                long var13 = -1L;
                if (this.field709 >= var5 && var5 + ((long) var8) > this.field709) {
                    var13 = this.field709;
                } else if (var5 >= this.field709 && (long) this.field716 + this.field709 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field709 + ((long) this.field716)) && ((long) var8 + var5) >= ((long) this.field716 + this.field709)) {
                    var15 = (long) this.field716 + this.field709;
                } else if (this.field709 < ((long) var8 + var5) && (var5 + ((long) var8)) <= (this.field709 + ((long) this.field716))) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var15 > var13) {
                    int var17 = (int) (var15 - var13);
                    class66.method463(this.field706, (int) (var13 - this.field709), arg2, (int) (var13 - var5) + var7, var17);
                    if (this.field729 < var15) {
                        arg0 = (int) ((long) arg0 - (var15 - this.field729));
                        this.field729 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field720 = -1L;
            throw var19;
        }
        if (arg0 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III)V")
    public static final void method344(int arg0, int arg1, int arg2) {
        field710++;
        class48 var3 = class115.field2050[class265.field4640][arg2][arg0];
        if (var3 == null) {
            class122.method910(class265.field4640, arg2, arg0);
        } else if (arg1 == 1) {
            int var4 = -99999999;
            class194 var5 = null;
            for (class194 var6 = (class194) var3.method371((byte) 61); var6 != null; var6 = (class194) var3.method370(true)) {
                class245 var13 = class235.method1605(95, var6.field3362.field201);
                int var14 = var13.field4260;
                if (var13.field4252 == 1) {
                    var14 = (var6.field3362.field202 + 1) * var14;
                }
                if (var14 > var4) {
                    var5 = var6;
                    var4 = var14;
                }
            }
            if (var5 == null) {
                class122.method910(class265.field4640, arg2, arg0);
            } else {
                var3.method378(var5, 0);
                class9 var7 = null;
                class194 var8 = (class194) var3.method371((byte) 61);
                class9 var9 = null;
                while (var8 != null) {
                    class9 var12 = var8.field3362;
                    if (var5.field3362.field201 != var12.field201) {
                        if (var7 == null) {
                            var7 = var12;
                        }
                        if (var7.field201 != var12.field201 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var8 = (class194) var3.method370(true);
                }
                long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
                class145.method1077(class265.field4640, arg2, arg0, class70.method480(class265.field4640, (byte) 126, arg2 * 128 + 64, arg0 * 128 + 64), var5.field3362, var10, var7, var9);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(I)V")
    public final void method345(int arg0) throws IOException {
        this.method346(arg0 - 1012);
        if (arg0 == 1011) {
            field719++;
            this.field728.method1199((byte) 117);
        }
    }

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "(I)V")
    private final void method346(int arg0) throws IOException {
        field713++;
        if ((long) arg0 == this.field709) {
            return;
        }
        if (this.field720 != this.field709) {
            this.field728.method1198(-2389, this.field709);
            this.field720 = this.field709;
        }
        long var2 = -1L;
        this.field728.method1201(this.field716, arg0 + 2, this.field706, 0);
        this.field720 += (long) this.field716;
        if (this.field720 > this.field718) {
            this.field718 = this.field720;
        }
        long var4 = -1L;
        if ((long) this.field716 + this.field709 > this.field711 && (long) this.field731 + this.field711 >= (long) this.field716 + this.field709) {
            var4 = this.field709 + ((long) this.field716);
        } else if (this.field709 < ((long) this.field731 + this.field711) && ((long) this.field731 + this.field711) <= ((long) this.field716 + this.field709)) {
            var4 = (long) this.field731 + this.field711;
        }
        if (this.field709 >= this.field711 && this.field709 < (long) this.field731 + this.field711) {
            var2 = this.field709;
        } else if (this.field711 >= this.field709 && this.field711 < (long) this.field716 + this.field709) {
            var2 = this.field711;
        }
        if (var2 > -1L && var2 < var4) {
            int var6 = (int) (var4 - var2);
            class66.method463(this.field706, (int) (var2 - this.field709), this.field725, (int) (var2 - this.field711), var6);
        }
        this.field709 = -1L;
        this.field716 = 0;
    }

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "(I)V")
    public static void method347(int arg0) {
        field724 = null;
        if (arg0 != 0) {
            method337(67, 121);
        }
        field721 = null;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)J")
    public final long method348(int arg0) {
        field715++;
        if (arg0 >= -14) {
            this.field723 = 87L;
        }
        return this.field723;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Laa;II)V")
    public class43(class168 arg0, int arg1, int arg2) throws IOException {
        this.field728 = arg0;
        this.field723 = this.field718 = arg0.method1200((byte) 84);
        this.field706 = new byte[arg2];
        this.field729 = 0L;
        this.field725 = new byte[arg1];
    }
}
