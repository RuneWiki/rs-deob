import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class54 {

    @OriginalMember(owner = "client!oe", name = "K", descriptor = "[J")
    private long[] field2363 = new long[10];

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[I")
    public static int[] field2350 = new int[] { 1, 1, 1, 1 };

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "[J")
    public static long[] field2345 = new long[100];

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Loa;")
    public static class98 field2356 = class38.method349(255, "nav");

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Loa;")
    public static class98 field2361 = class38.method349(255, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "Loa;")
    public static class98 field2354 = null;

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    public static int[] field2348 = new int[5];

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "I")
    private int field2353;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    private int field2360;

    @OriginalMember(owner = "client!oe", name = "J", descriptor = "I")
    private int field2362;

    @OriginalMember(owner = "client!oe", name = "L", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!oe", name = "N", descriptor = "I")
    private int field2365;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "J")
    private long field2346;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "Loc;")
    public static class100 field2359;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)I")
    public final int method444(int arg0, int arg1, int arg2) {
        field2349++;
        int var4 = this.field2365;
        this.field2365 = 300;
        int var5 = this.field2353;
        this.field2353 = 1;
        this.field2346 = class44.method375((byte) 11);
        if (this.field2363[this.field2362] == 0L) {
            this.field2365 = var4;
            this.field2353 = var5;
        } else if (this.field2363[this.field2362] < this.field2346) {
            this.field2365 = (int) ((long) (arg2 * 2560) / (this.field2346 - this.field2363[this.field2362]));
        }
        if (this.field2365 < 25) {
            this.field2365 = 25;
        }
        if (arg1 != -16207) {
            this.field2365 = 110;
        }
        if (this.field2365 > 256) {
            this.field2365 = 256;
            this.field2353 = (int) ((long) arg2 - (this.field2346 - this.field2363[this.field2362]) / 10L);
        }
        if (this.field2353 > arg2) {
            this.field2353 = arg2;
        }
        this.field2363[this.field2362] = this.field2346;
        this.field2362 = (this.field2362 + 1) % 10;
        if (this.field2353 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field2363[var6] != 0L) {
                    this.field2363[var6] -= -((long) this.field2353);
                }
            }
        }
        int var7 = 0;
        if (this.field2353 < arg0) {
            this.field2353 = arg0;
        }
        class82.method691((long) this.field2353, (byte) -111);
        while (this.field2360 < 256) {
            var7++;
            this.field2360 += this.field2365;
        }
        this.field2360 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    public final void method441(int arg0) {
        field2347++;
        if (arg0 > -79) {
            method843(-128, (byte) -36);
        }
        this.field2360 = 0;
        this.field2365 = 256;
        this.field2353 = 1;
        this.field2346 = class44.method375((byte) 42);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2363[var2] = this.field2346;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Loa;I)Loa;")
    public static final class98 method840(class98[] arg0, int arg1) {
        if (arg1 != 10) {
            field2350 = null;
        }
        field2364++;
        if (arg0.length < 2) {
            throw new IllegalArgumentException();
        }
        return class62.method507(true, 0, arg0.length, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIII)I")
    public static final int method841(int arg0, int arg1, int arg2, int arg3) {
        field2352++;
        if (arg0 > -20) {
            return -79;
        } else if ((class80.field1771[arg2][arg3][arg1] & 0x8) == 0) {
            return arg2 <= 0 || (class80.field1771[1][arg3][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public final void method440(byte arg0) {
        for (int var2 = 0; var2 < 10; var2++) {
            this.field2363[var2] = 0L;
        }
        field2344++;
        if (arg0 >= -90) {
            field2356 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method842(boolean arg0) {
        field2359 = null;
        field2361 = null;
        field2350 = null;
        if (arg0) {
            method843(-60, (byte) -83);
        }
        field2348 = null;
        field2356 = null;
        field2354 = null;
        field2345 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IB)Z")
    public static final boolean method843(int arg0, byte arg1) {
        field2357++;
        int var2 = -126 % ((35 - arg1) / 41);
        return (arg0 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
    public class102() {
        this.method441(-105);
    }
}
