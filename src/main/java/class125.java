import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class125 extends class92 {

    @OriginalMember(owner = "client!ng", name = "X", descriptor = "I")
    private int field2469 = 0;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "Z")
    public boolean field2483 = false;

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
    private int field2482 = 0;

    @OriginalMember(owner = "client!ng", name = "ub", descriptor = "I")
    public int field2492;

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!ng", name = "pb", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!ng", name = "qb", descriptor = "I")
    private int field2488;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "Lwf;")
    private class205 field2481;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "Led;")
    private static class43 field2475 = class191.method1219("Continue", false);

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "Led;")
    private static class43 field2480 = class191.method1219("You are standing in a members)2only area)3", false);

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "I")
    public static int field2476 = 0;

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "[I")
    public static int[] field2472 = new int[2048];

    @OriginalMember(owner = "client!ng", name = "nb", descriptor = "Led;")
    public static class43 field2485 = field2480;

    @OriginalMember(owner = "client!ng", name = "rb", descriptor = "Led;")
    private static class43 field2489 = class191.method1219("Starting game engine)3)3)3", false);

    @OriginalMember(owner = "client!ng", name = "sb", descriptor = "Led;")
    public static class43 field2490 = field2475;

    @OriginalMember(owner = "client!ng", name = "ob", descriptor = "Led;")
    public static class43 field2486 = field2489;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field2471;

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!ng", name = "tb", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ng", name = "vb", descriptor = "Lga;")
    public static class58 field2493;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V")
    public static void method804(byte arg0) {
        field2472 = null;
        field2486 = null;
        field2489 = null;
        field2480 = null;
        field2490 = null;
        field2475 = null;
        field2485 = null;
        int var1 = 119 % ((-arg0 - 24) / 62);
        field2493 = null;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
    public static final void method805(byte arg0) {
        class124.field2457 = 0;
        class204.field3970 = 0;
        class118.field2307 = 0;
        class198.field3906 = -1;
        class29.field522.field1727 = 0;
        class41.field799 = 0;
        class20.field343 = 0;
        field2473++;
        class96.field1871 = -1;
        class38.field723.field1727 = 0;
        class186.field3665 = false;
        class114.field2215 = 0;
        class157.field3182 = -1;
        class18.field298 = -1;
        int var1 = 0;
        if (arg0 != 90) {
            field2489 = null;
        }
        while (var1 < class12.field183.length) {
            if (class12.field183[var1] != null) {
                class12.field183[var1].field2380 = -1;
            }
            var1++;
        }
        for (int var2 = 0; var2 < class172.field3433.length; var2++) {
            if (class172.field3433[var2] != null) {
                class172.field3433[var2].field2380 = -1;
            }
        }
        class105.method648(121);
        class35.method197((byte) -78, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class107.field2056[var3] = true;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(II)V")
    public final void method806(int arg0, int arg1) {
        field2470++;
        if (arg1 != 12806) {
            method807(-23, 41);
        }
        if (this.field2483) {
            return;
        }
        this.field2469 += arg0;
        while (this.field2469 > this.field2481.field3991[this.field2482]) {
            this.field2469 -= this.field2481.field3991[this.field2482];
            this.field2482++;
            if (this.field2481.field3996.length <= this.field2482) {
                this.field2483 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)Lhf;")
    public static final class71 method807(int arg0, int arg1) {
        field2479++;
        class71 var2 = (class71) class198.field3902.method1106(arg1 ^ 0x60, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class184.field3631.method367(arg1, arg0, (byte) -34);
        class71 var4 = new class71();
        if (var3 != null) {
            var4.method438(new class89(var3), 0, arg0);
        }
        class198.field3902.method1107((long) arg0, var4, 125);
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "(I)Lw;")
    public final class199 method593(int arg0) {
        if (arg0 != 6) {
            this.method806(-109, -23);
        }
        field2491++;
        class194 var2 = class16.method70(-1, this.field2488);
        class199 var3;
        if (this.field2483) {
            var3 = var2.method1237(-110, -1);
        } else {
            var3 = var2.method1237(arg0 ^ 0x75, this.field2482);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(IIIIIII)V")
    public class125(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2492 = arg1;
        this.field2484 = arg3;
        this.field2487 = arg6 + arg5;
        this.field2477 = arg2;
        this.field2488 = arg0;
        this.field2478 = arg4;
        int var8 = class16.method70(-1, this.field2488).field3781;
        if (var8 == -1) {
            this.field2483 = true;
        } else {
            this.field2483 = false;
            this.field2481 = class175.method1101(var8, true);
        }
    }
}
