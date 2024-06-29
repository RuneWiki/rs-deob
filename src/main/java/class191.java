import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class191 {

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "J")
    public long field3314 = 0L;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "[Lkb;")
    public static class52[] field3321 = new class52[6];

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "[[S")
    public static short[][] field3324 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Lpj;")
    public static class237 field3326 = class33.method353("overlay2", 105);

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public int field3312;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field3315;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public int field3316;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public int field3317;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field3319;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public int field3320;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field3322;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field3323;

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "I")
    public int field3325;

    @OriginalMember(owner = "client!mc", name = "p", descriptor = "I")
    public int field3327;

    @OriginalMember(owner = "client!mc", name = "q", descriptor = "I")
    public int field3328;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lqe;")
    public class95 field3318;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static void method1292(int arg0) {
        field3324 = null;
        if (arg0 != 7823) {
            method1293((class154[]) null, (class225[]) null, (byte) 2, (class154[]) null, (class239) null, (class154[]) null, (class154[]) null);
        }
        field3321 = null;
        field3326 = null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Lgk;[Lgj;B[Lgk;Lfa;[Lgk;[Lgk;)V")
    public static final void method1293(class154[] arg0, class225[] arg1, byte arg2, class154[] arg3, class239 arg4, class154[] arg5, class154[] arg6) {
        field3313++;
        class252.field4342 = arg6;
        class107.field1907 = arg0;
        class114.field1998 = arg1;
        class147.field2615 = arg4;
        class73.field1408 = arg5;
        class184.field3225 = arg3;
        class210.field3587.method676(16841);
        int var7 = class147.field2615.method1643(class233.field4039, (byte) -66);
        int[] var8 = class147.field2615.method1636(var7, (byte) -34);
        if (arg2 >= -94) {
            method1292(60);
        }
        for (int var9 = 0; var9 < var8.length; var9++) {
            class210.field3587.method675(class78.method601(new class32(class147.field2615.method1645(true, var8[var9], var7)), 1), (byte) -108);
        }
    }
}
