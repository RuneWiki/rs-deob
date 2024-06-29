import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class123 extends class142 {

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "Z")
    public static boolean field2356 = false;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lai;")
    private static class10 field2350 = class44.method278("You need a members account to login to this world)3", -40);

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "Z")
    public static boolean field2354 = false;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "Lai;")
    private static class10 field2361 = class44.method278("Loading sprites )2 ", -9);

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "Lai;")
    public static class10 field2362 = field2350;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Lai;")
    public static class10 field2349 = field2361;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Z")
    public static boolean field2358 = false;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lai;")
    private static class10 field2359 = class44.method278("Drop", 95);

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "Lai;")
    public static class10 field2357 = field2359;

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "Lai;")
    public static class10 field2364 = class44.method278("Ihr Charakter)2Profil wird in:", -94);

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "Lvb;")
    public static class192 field2360 = new class192();

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field2351;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "I")
    public static int field2363;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(Z)V")
    public static void method858(boolean arg0) {
        field2357 = null;
        field2360 = null;
        field2359 = null;
        field2364 = null;
        field2362 = null;
        field2361 = null;
        if (arg0) {
            field2350 = null;
            field2349 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(Z)V")
    public static final void method859(boolean arg0) {
        if (!arg0) {
            class46.field756.method226((byte) -90);
            ++field2363;
            class160.field3073.method226((byte) -90);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            field2357 = null;
        }
        ++field2355;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (super.field2683.field3516) {
            for (int var4 = 0; ~class133.field2499 < ~var4; ++var4) {
                this.method860(var4, arg1, 0);
                int[] var5 = this.method963((byte) -121, 0, class176.field3380);
                var3[var4] = var5[class46.field757];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(III)V")
    private final void method860(int arg0, int arg1, int arg2) {
        ++field2353;
        if (arg2 != 0) {
            field2359 = null;
        }
        int var4 = class13.field212[arg1];
        int var5 = class79.field1395[arg0];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class176.field3380 = arg1;
            class46.field757 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class46.field757 = arg1;
            class176.field3380 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class176.field3380 = arg0;
            class46.field757 = -arg1 + class133.field2499;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class46.field757 = arg0;
            class176.field3380 = -arg1 + class13.field219;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class176.field3380 = -arg1 + class13.field219;
            class46.field757 = -arg0 + class133.field2499;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class46.field757 = -arg1 + class133.field2499;
            class176.field3380 = class13.field219 - arg0;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class46.field757 = arg1;
            class176.field3380 = -arg0 + class13.field219;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class46.field757 = -arg0 + class133.field2499;
            class176.field3380 = arg1;
        }
        class46.field757 &= class56.field997;
        class176.field3380 &= class205.field3986;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field2352;
        if (arg1 == 0) {
            super.field2684 = arg0.method767(true) == 1;
        }
        if (arg2 >= -34) {
            field2356 = false;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method86(int arg0, boolean arg1) {
        ++field2351;
        if (arg1) {
            return null;
        } else {
            int[][] var3 = super.field2666.method956(arg0, -107);
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            if (super.field2666.field2664) {
                for (int var7 = 0; var7 < class133.field2499; ++var7) {
                    this.method860(var7, arg0, 0);
                    int[][] var8 = this.method961(2, 0, class176.field3380);
                    var6[var7] = var8[0][class46.field757];
                    var4[var7] = var8[1][class46.field757];
                    var5[var7] = var8[2][class46.field757];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V")
    public class123() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)I")
    public static int method861(int arg0, int arg1) {
        return arg0 & arg1;
    }
}
