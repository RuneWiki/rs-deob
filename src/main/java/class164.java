import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class164 {

    @OriginalMember(owner = "client!g", name = "a", descriptor = "Z")
    public boolean field2392 = true;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Z")
    public boolean field2396 = false;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Z")
    public boolean field2393 = true;

    @OriginalMember(owner = "client!g", name = "i", descriptor = "I")
    public int field2400 = 512;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public int field2395 = 8;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public int field2402 = 127;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "I")
    public int field2399 = -1;

    @OriginalMember(owner = "client!g", name = "o", descriptor = "I")
    public int field2406 = -1;

    @OriginalMember(owner = "client!g", name = "p", descriptor = "I")
    public int field2407 = 0;

    @OriginalMember(owner = "client!g", name = "n", descriptor = "I")
    public int field2405 = 64;

    @OriginalMember(owner = "client!g", name = "v", descriptor = "I")
    public int field2413 = 1190717;

    @OriginalMember(owner = "client!g", name = "t", descriptor = "[I")
    public static int[] field2411 = new int[3];

    @OriginalMember(owner = "client!g", name = "q", descriptor = "Ljo;")
    public static class351 field2408 = new class351(30, 3);

    @OriginalMember(owner = "client!g", name = "x", descriptor = "[[I")
    public static int[][] field2415 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public int field2401;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!g", name = "r", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!g", name = "s", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!g", name = "u", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!g", name = "w", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!g", name = "m", descriptor = "Lab;")
    public class696 field2404;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ILrv;)V", line = 7)
    public final void method1279(int arg0, class120 arg1) {
        if (arg0 != 0) {
            method1280((byte) 10);
        }
        while (true) {
            int var3 = arg1.method842(arg0 + 2384);
            if (var3 == 0) {
                field2398++;
                return;
            }
            this.method1283(var3, -101, arg1);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V", line = 27)
    public static void method1280(byte arg0) {
        field2411 = null;
        field2408 = null;
        field2415 = null;
        if (arg0 != -23) {
            method1284(120);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V", line = 44)
    public final void method1281(boolean arg0) {
        if (arg0) {
            this.field2395 = this.field2401 | this.field2395 << 8;
            field2397++;
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIII)V", line = 80)
    public static final void method1282(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2403++;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        class382.method2347(arg0 - arg3, class347.field5087[arg1], arg2, arg4 ^ 0xE, arg0 + arg3);
        int var8 = -1;
        if (arg4 != 9) {
            return;
        }
        while (var5 < var6) {
            var8 += 2;
            var7 += var8;
            var5++;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class347.field5087[arg1 + var6];
                int[] var10 = class347.field5087[arg1 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class382.method2347(var12, var9, arg2, arg4 - 2, var11);
                class382.method2347(var12, var10, arg2, 7, var11);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class347.field5087[arg1 + var5];
            int[] var16 = class347.field5087[arg1 - var5];
            class382.method2347(var14, var15, arg2, 7, var13);
            class382.method2347(var14, var16, arg2, 7, var13);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILrv;)V", line = 144)
    private final void method1283(int arg0, int arg1, class120 arg2) {
        int var4 = -18 / ((arg1 + 42) / 35);
        if (arg0 == 1) {
            this.field2407 = class595.method3446(arg2.method833(-3), (byte) 50);
        } else if (arg0 == 2) {
            this.field2406 = arg2.method842(2384);
        } else if (arg0 == 3) {
            this.field2406 = arg2.method898((byte) -93);
            if (this.field2406 == 65535) {
                this.field2406 = -1;
            }
        } else if (arg0 == 5) {
            this.field2392 = false;
        } else if (arg0 == 7) {
            this.field2399 = class595.method3446(arg2.method833(-3), (byte) 50);
        } else if (arg0 == 8) {
            this.field2404.field9837 = this.field2401;
        } else if (arg0 == 9) {
            this.field2400 = arg2.method898((byte) -79) << 2;
        } else if (arg0 == 10) {
            this.field2393 = false;
        } else if (arg0 == 11) {
            this.field2395 = arg2.method842(2384);
        } else if (arg0 == 12) {
            this.field2396 = true;
        } else if (arg0 == 13) {
            this.field2413 = arg2.method833(-3);
        } else if (arg0 == 14) {
            this.field2405 = arg2.method842(2384) << 2;
        } else if (arg0 == 16) {
            this.field2402 = arg2.method842(2384);
        }
        field2412++;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)[Lpb;", line = 216)
    public static final class680[] method1284(int arg0) {
        if (arg0 >= -4) {
            method1282(-104, -12, 96, -9, -28);
        }
        field2394++;
        return new class680[] { class177.field2704, class90.field1161, class180.field2730, class492.field6986, class543.field7609, class653.field9214 };
    }

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)I", line = 232)
    public static final int method1285(int arg0) {
        field2409++;
        if (arg0 != 12) {
            field2415 = null;
        }
        return class327.field4892;
    }
}
