import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class139 {

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "I")
    private int field2560 = 0;

    @OriginalMember(owner = "client!wa", name = "q", descriptor = "J")
    private long field2565 = -1L;

    @OriginalMember(owner = "client!wa", name = "w", descriptor = "J")
    private long field2571 = -1L;

    @OriginalMember(owner = "client!wa", name = "D", descriptor = "Lac;")
    private class137 field2578;

    @OriginalMember(owner = "client!wa", name = "E", descriptor = "J")
    private long field2579;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "J")
    private long field2558;

    @OriginalMember(owner = "client!wa", name = "z", descriptor = "[B")
    private byte[] field2574;

    @OriginalMember(owner = "client!wa", name = "t", descriptor = "[B")
    private byte[] field2568;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "J")
    private long field2563;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "Lr;")
    public static class66 field2559 = class93.method641(43, "sl_flags");

    @OriginalMember(owner = "client!wa", name = "s", descriptor = "Lr;")
    private static class66 field2567 = class93.method641(43, "Please wait)3)3)3");

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[[I")
    public static int[][] field2549 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!wa", name = "p", descriptor = "Lr;")
    private static class66 field2564 = class93.method641(43, "glow2:");

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "Lr;")
    public static class66 field2561 = field2564;

    @OriginalMember(owner = "client!wa", name = "x", descriptor = "Lr;")
    public static class66 field2572 = class93.method641(43, "(U0a )2 in: ");

    @OriginalMember(owner = "client!wa", name = "C", descriptor = "Z")
    public static boolean field2577 = false;

    @OriginalMember(owner = "client!wa", name = "r", descriptor = "Lr;")
    public static class66 field2566 = class93.method641(43, "gelb:");

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "Lr;")
    public static class66 field2554 = field2567;

    @OriginalMember(owner = "client!wa", name = "G", descriptor = "Lr;")
    public static class66 field2581 = field2564;

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field2582 = 0;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!wa", name = "y", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!wa", name = "A", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!wa", name = "B", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!wa", name = "F", descriptor = "I")
    private int field2580;

    @OriginalMember(owner = "client!wa", name = "v", descriptor = "J")
    private long field2570;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)Lni;")
    public static final class168 method955(byte arg0) {
        field2562++;
        int var1 = class2.field25[0] * class199.field3443[0];
        int[] var2 = new int[var1];
        byte[] var3 = class44.field777[0];
        int var4 = 0;
        if (arg0 != -83) {
            return null;
        }
        while (var4 < var1) {
            var2[var4] = class136.field2517[class115.method767(255, var3[var4])];
            var4++;
        }
        class168 var5 = new class168(class11.field125, class54.field950, class36.field541[0], class231.field4029[0], class2.field25[0], class199.field3443[0], var2);
        class211.method1365((byte) -93);
        return var5;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lcj;Lcj;Lcj;ZLcj;)V")
    public static final void method956(class28 arg0, class28 arg1, class28 arg2, boolean arg3, class28 arg4) {
        class260.field4593 = arg0;
        class259.field4563 = arg4;
        client.field1648 = arg2;
        if (arg3) {
            field2576++;
            class49.field878 = arg1;
            class31.field466 = new class63[client.field1648.method134(0)][];
            class196.field3394 = new boolean[client.field1648.method134(0)];
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I[B)V")
    public final void method957(int arg0, byte[] arg1) throws IOException {
        field2555++;
        this.method965(0, arg1.length, 0, arg1);
        if (arg0 > -33) {
            method956((class28) null, (class28) null, (class28) null, true, (class28) null);
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(B)J")
    public final long method958(byte arg0) {
        field2573++;
        if (arg0 <= 48) {
            this.field2558 = 100L;
        }
        return this.field2558;
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(III[B)V")
    public final void method959(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2569++;
        try {
            if (arg1 == 0) {
                if (this.field2558 < this.field2563 + ((long) arg0)) {
                    this.field2558 = this.field2563 + ((long) arg0);
                }
                if (this.field2571 != -1L && (this.field2563 < this.field2571 || this.field2571 + ((long) this.field2560) < this.field2563)) {
                    this.method962(arg1 + 86);
                }
                if (this.field2571 != -1L && ((long) this.field2568.length + this.field2571) < ((long) arg0 + this.field2563)) {
                    int var5 = (int) ((long) this.field2568.length + this.field2571 - this.field2563);
                    arg0 -= var5;
                    class46.method331(arg3, arg2, this.field2568, (int) (this.field2563 - this.field2571), var5);
                    this.field2563 += (long) var5;
                    this.field2560 = this.field2568.length;
                    this.method962(40);
                    arg2 += var5;
                }
                if (arg0 > this.field2568.length) {
                    long var6 = -1L;
                    long var8 = -1L;
                    if (this.field2570 != this.field2563) {
                        this.field2578.method942(false, this.field2563);
                        this.field2570 = this.field2563;
                    }
                    this.field2578.method944(arg2, arg3, 18405, arg0);
                    if ((this.field2563 + ((long) arg0)) > this.field2565 && this.field2563 + ((long) arg0) <= (long) this.field2580 + this.field2565) {
                        var6 = (long) arg0 + this.field2563;
                    } else if (((long) this.field2580 + this.field2565) > this.field2563 && ((long) arg0 + this.field2563) >= ((long) this.field2580 + this.field2565)) {
                        var6 = (long) this.field2580 + this.field2565;
                    }
                    this.field2570 += (long) arg0;
                    if (this.field2563 >= this.field2565 && this.field2563 < (this.field2565 + ((long) this.field2580))) {
                        var8 = this.field2563;
                    } else if (this.field2563 <= this.field2565 && this.field2565 < this.field2563 + ((long) arg0)) {
                        var8 = this.field2565;
                    }
                    if (this.field2570 > this.field2579) {
                        this.field2579 = this.field2570;
                    }
                    if (var8 > -1L && var6 > var8) {
                        int var10 = (int) (var6 - var8);
                        class46.method331(arg3, (int) ((long) arg2 + var8 - this.field2563), this.field2574, (int) (var8 - this.field2565), var10);
                    }
                    this.field2563 += (long) arg0;
                } else if (arg0 > 0) {
                    if (this.field2571 == -1L) {
                        this.field2571 = this.field2563;
                    }
                    class46.method331(arg3, arg2, this.field2568, (int) (this.field2563 - this.field2571), arg0);
                    this.field2563 += (long) arg0;
                    if ((this.field2563 - this.field2571) > ((long) this.field2560)) {
                        this.field2560 = (int) (this.field2563 - this.field2571);
                    }
                }
            }
        } catch (IOException var12) {
            this.field2570 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
    public static void method960(boolean arg0) {
        field2561 = null;
        field2566 = null;
        if (!arg0) {
            field2561 = null;
        }
        field2572 = null;
        field2564 = null;
        field2549 = null;
        field2567 = null;
        field2554 = null;
        field2581 = null;
        field2559 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(Z)Ljava/io/File;")
    private final File method961(boolean arg0) {
        field2553++;
        if (!arg0) {
            this.field2571 = 14L;
        }
        return this.field2578.method941(0);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    private final void method962(int arg0) throws IOException {
        field2550++;
        int var2 = -72 % ((arg0 + 42) / 59);
        if (this.field2571 == -1L) {
            return;
        }
        if (this.field2571 != this.field2570) {
            this.field2578.method942(false, this.field2571);
            this.field2570 = this.field2571;
        }
        long var3 = -1L;
        this.field2578.method944(0, this.field2568, 18405, this.field2560);
        this.field2570 += (long) this.field2560;
        if (this.field2565 <= this.field2571 && this.field2571 < (long) this.field2580 + this.field2565) {
            var3 = this.field2571;
        } else if (this.field2571 <= this.field2565 && (this.field2571 + ((long) this.field2560)) > this.field2565) {
            var3 = this.field2565;
        }
        long var5 = -1L;
        if ((long) this.field2560 + this.field2571 > this.field2565 && (long) this.field2560 + this.field2571 <= (long) this.field2580 + this.field2565) {
            var5 = (long) this.field2560 + this.field2571;
        } else if (((long) this.field2580 + this.field2565) > this.field2571 && (this.field2565 + ((long) this.field2580)) <= ((long) this.field2560 + this.field2571)) {
            var5 = (long) this.field2580 + this.field2565;
        }
        if (this.field2570 > this.field2579) {
            this.field2579 = this.field2570;
        }
        if (var3 > -1L && var3 < var5) {
            int var7 = (int) (var5 - var3);
            class46.method331(this.field2568, (int) (var3 - this.field2571), this.field2574, (int) (var3 - this.field2565), var7);
        }
        this.field2571 = -1L;
        this.field2560 = 0;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)V")
    public final void method963(int arg0) throws IOException {
        this.method962(-121);
        if (arg0 == -9715) {
            field2575++;
            this.field2578.method943(arg0 + 1572);
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(JI)V")
    public final void method964(long arg0, int arg1) throws IOException {
        field2552++;
        if (arg0 < 0L) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method961(true));
        }
        this.field2563 = arg0;
        if (arg1 != 1) {
            this.field2558 = -83L;
        }
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(III[B)V")
    public final void method965(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field2551++;
        try {
            if (arg0 + arg1 > arg3.length) {
                throw new ArrayIndexOutOfBoundsException(arg0 + arg1 - arg3.length);
            }
            if (this.field2571 != -1L && this.field2563 >= this.field2571 && ((long) arg1 + this.field2563) <= (this.field2571 + ((long) this.field2560))) {
                class46.method331(this.field2568, (int) (this.field2563 - this.field2571), arg3, arg0, arg1);
                this.field2563 += (long) arg1;
                return;
            }
            long var5 = this.field2563;
            int var7 = arg1;
            int var8 = arg0;
            if (this.field2563 >= this.field2565 && this.field2563 < (long) this.field2580 + this.field2565) {
                int var9 = (int) ((long) this.field2580 - (this.field2563 - this.field2565));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                arg1 -= var9;
                class46.method331(this.field2574, (int) (this.field2563 - this.field2565), arg3, arg0, var9);
                this.field2563 += (long) var9;
                arg0 += var9;
            }
            if (this.field2574.length < arg1) {
                this.field2578.method942(false, this.field2563);
                this.field2570 = this.field2563;
                while (arg1 > 0) {
                    int var10 = this.field2578.method945(arg1, 0, arg0, arg3);
                    if (var10 == -1) {
                        break;
                    }
                    arg0 += var10;
                    arg1 -= var10;
                    this.field2563 += (long) var10;
                    this.field2570 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method966(false);
                int var11 = arg1;
                if (arg1 > this.field2580) {
                    var11 = this.field2580;
                }
                class46.method331(this.field2574, 0, arg3, arg0, var11);
                this.field2563 += (long) var11;
                arg1 -= var11;
                arg0 += var11;
            }
            if (this.field2571 != -1L) {
                if (this.field2571 > this.field2563 && arg1 > 0) {
                    int var12 = (int) (this.field2571 - this.field2563) + arg0;
                    if (var12 > (arg0 + arg1)) {
                        var12 = arg0 + arg1;
                    }
                    while (arg0 < var12) {
                        arg3[arg0++] = 0;
                        this.field2563++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (this.field2571 >= var5 && (var5 + ((long) var7)) > this.field2571) {
                    var13 = this.field2571;
                } else if (this.field2571 <= var5 && var5 < (long) this.field2560 + this.field2571) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < ((long) this.field2560 + this.field2571) && (this.field2571 + ((long) this.field2560)) <= ((long) var7 + var5)) {
                    var15 = (long) this.field2560 + this.field2571;
                } else if (((long) var7 + var5) > this.field2571 && this.field2571 + ((long) this.field2560) >= (long) var7 + var5) {
                    var15 = (long) var7 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class46.method331(this.field2568, (int) (var13 - this.field2571), arg3, var8 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field2563) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field2563));
                        this.field2563 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2570 = -1L;
            throw var19;
        }
        if (arg2 < arg1) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(Z)V")
    private final void method966(boolean arg0) throws IOException {
        field2556++;
        if (arg0) {
            return;
        }
        this.field2580 = 0;
        if (this.field2570 != this.field2563) {
            this.field2578.method942(false, this.field2563);
            this.field2570 = this.field2563;
        }
        this.field2565 = this.field2563;
        while (this.field2580 < this.field2574.length) {
            int var2 = this.field2574.length - this.field2580;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2578.method945(var2, 0, this.field2580, this.field2574);
            if (var3 == -1) {
                break;
            }
            this.field2570 += (long) var3;
            this.field2580 += var3;
        }
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Lac;II)V")
    public class139(class137 arg0, int arg1, int arg2) throws IOException {
        this.field2578 = arg0;
        this.field2558 = this.field2579 = arg0.method940(-1);
        this.field2574 = new byte[arg1];
        this.field2568 = new byte[arg2];
        this.field2563 = 0L;
    }
}
