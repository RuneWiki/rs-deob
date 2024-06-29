import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class741 {

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "Z")
    private boolean field10399 = false;

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "I")
    public int field10395 = 0;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field10392 = 0;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "Lmia;")
    public static class63 field10386 = new class63(4, 1);

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
    private int field10383;

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field10384;

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public static int field10387;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public static int field10388;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "I")
    public int field10389;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public int field10390;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field10391;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public int field10393;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
    public int field10394;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
    public int field10397;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "I")
    public static int field10398;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public int field10400;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public int field10401;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "J")
    public long field10396;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "Lpga;")
    public static class536 field10402;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "[[Z")
    public static boolean[][] field10403;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(Z)V")
    public static void method4146(boolean arg0) {
        field10386 = null;
        if (arg0) {
            method4149(-4, 45, 96);
        }
        field10402 = null;
        field10403 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILrg;I)V")
    private final void method4147(int arg0, class645 arg1, int arg2) {
        field10385++;
        if (arg0 == 1) {
            this.field10383 = arg1.method3712((byte) 66);
        } else if (arg0 == 2) {
            arg1.method3745(-6314);
        } else if (arg0 == 3) {
            this.field10390 = arg1.method3720(-19541);
            this.field10391 = arg1.method3720(-19541);
            this.field10393 = arg1.method3720(arg2 - 19531);
        } else if (arg0 == 4) {
            this.field10401 = arg1.method3745(-6314);
            this.field10384 = arg1.method3720(-19541);
        } else if (arg0 == 6) {
            this.field10389 = arg1.method3745(-6314);
        } else if (arg0 == 8) {
            this.field10395 = 1;
        } else if (arg0 == 9) {
            this.field10392 = 1;
        } else if (arg0 == 10) {
            this.field10399 = true;
        }
        if (arg2 != -10) {
            this.field10394 = 13;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZLrg;)V")
    public final void method4148(boolean arg0, class645 arg1) {
        field10398++;
        while (true) {
            int var3 = arg1.method3745(-6314);
            if (var3 == 0) {
                if (arg0) {
                    this.method4148(true, null);
                    return;
                } else {
                    return;
                }
            }
            this.method4147(var3, arg1, -10);
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)Z")
    public static final boolean method4149(int arg0, int arg1, int arg2) {
        field10388++;
        if (arg2 == 1) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public final void method4150(byte arg0) {
        field10387++;
        if (arg0 != -50) {
            this.method4150((byte) -82);
        }
        this.field10394 = class373.field5549[this.field10383 << 3];
        long var2 = (long) this.field10390;
        long var4 = (long) this.field10391;
        long var6 = (long) this.field10393;
        this.field10400 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field10384 == 0) {
            this.field10384 = 1;
        }
        if (this.field10401 == 0) {
            this.field10396 = 2147483647L;
        } else if (this.field10401 == 1) {
            this.field10396 = (this.field10400 * 8 / this.field10384);
            this.field10396 *= this.field10396;
        } else if (this.field10401 == 2) {
            this.field10396 = (this.field10400 * 8 / this.field10384);
        }
        if (this.field10399) {
            this.field10400 *= -1;
        }
    }
}
