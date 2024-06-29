import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class307 {

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "Lho;")
    public class422 field4413 = null;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "Lho;")
    public class422 field4414 = null;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "[Lhp;")
    public class355[] field4420 = null;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "Lho;")
    public class422 field4415 = null;

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "[Lhp;")
    public class355[] field4416 = null;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "Z")
    public boolean field4419;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "Lfea;")
    public static class47 field4417 = new class47();

    @OriginalMember(owner = "client!lm", name = "l", descriptor = "[I")
    public static int[] field4424;

    @OriginalMember(owner = "client!lm", name = "m", descriptor = "Z")
    public static boolean field4425;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field4418;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field4422;

    @OriginalMember(owner = "client!lm", name = "k", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!lm", name = "n", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "J")
    public static long field4421;

    static {
        new class567("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field4424 = new int[] { 1, 2, 4, 8 };
        field4425 = false;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(BIILgp;)Lld;", line = 7)
    public static final class560 method1903(byte arg0, int arg1, int arg2, class561 arg3) {
        if (arg0 < 60) {
            field4417 = null;
        }
        field4418++;
        byte[] var4 = arg3.method3175(arg2, (byte) -53, arg1);
        return var4 == null ? null : new class560(var4);
    }

    @OriginalMember(owner = "client!lm", name = "<init>", descriptor = "(Ljj;)V", line = 230)
    public class307(class66 arg0) {
        this.field4419 = arg0.field1218;
        class86.method790(arg0, (byte) -100);
        if (this.field4419) {
            byte[] var2 = class191.method1265(false, class285.field4159, 64);
            this.field4413 = new class422(arg0, 6410, 128, 128, 16, var2, 6410);
            byte[] var3 = class191.method1265(false, class254.field3705, 64);
            this.field4415 = new class422(arg0, 6410, 128, 128, 16, var3, 6410);
            class61 var4 = arg0.field1139;
            if (var4.method485(35632)) {
                byte[] var5 = class191.method1265(false, class596.field8492, 64);
                this.field4414 = new class422(arg0, 6408, 128, 128, 16);
                class422 var6 = new class422(arg0, 6409, 128, 128, 16, var5, 6409);
                if (var4.method486(2.0F, this.field4414, (byte) -99, var6)) {
                    this.field4414.method1479(-55);
                } else {
                    this.field4414.method1482((byte) -77);
                    this.field4414 = null;
                }
                var6.method1482((byte) -77);
                return;
            }
        } else {
            this.field4420 = new class355[16];
            for (int var7 = 0; var7 < 16; var7++) {
                byte[] var10 = class409.method2483(var7 * 128 * 256, class285.field4159, -116, 32768);
                this.field4420[var7] = new class355(arg0, 3553, 6410, 128, 128, true, var10, 6410, false);
            }
            this.field4416 = new class355[16];
            for (int var8 = 0; var8 < 16; var8++) {
                byte[] var9 = class409.method2483(var8 * 128 * 256, class254.field3705, -127, 32768);
                this.field4416[var8] = new class355(arg0, 3553, 6410, 128, 128, true, var9, 6410, false);
            }
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZI)V", line = 33)
    public static final void method1904(boolean arg0, int arg1) {
        field4426++;
        if (class64.field893 == arg1) {
            return;
        }
        if (class64.field893 == 0) {
            class510.method2863((byte) -102);
        }
        if (arg1 == 12) {
            if (class258.field3752 == null) {
                class73.method710(class646.field9387, class343.field4929, class621.field8755, -31566);
            } else {
                class341.method2088(class343.field4929, -2718);
            }
        }
        if (arg1 != 12 && class117.field1905 != null) {
            class117.field1905.method2743((byte) 47);
            class117.field1905 = null;
        }
        if (arg1 == 2) {
            class550.method3094(-1, class609.field8659 != class221.field3318);
        }
        if (arg1 == 6) {
            class185.method1245(-120, class79.field1430 != class609.field8659);
        }
        if (arg1 == 4) {
            if (class258.field3752 == null) {
                class579.method3314(class646.field9387, (byte) -98, class621.field8755);
            } else {
                class5.method15((byte) -114);
            }
        } else if (arg1 == 5) {
            if (class258.field3752 == null) {
                class73.method710(class646.field9387, class343.field4929, class621.field8755, -31566);
            } else {
                class341.method2088(class343.field4929, -2718);
            }
        } else if (arg1 == 8) {
            if (class258.field3752 == null) {
                class73.method710(class646.field9387, class343.field4929, class621.field8755, -31566);
            } else {
                class341.method2088(class343.field4929, -2718);
            }
        } else if (arg1 == 11) {
            if (class258.field3752 == null) {
                class579.method3314(class646.field9387, (byte) -98, class621.field8755);
            } else {
                class5.method15((byte) -114);
            }
        }
        if (class118.method974(class64.field893, -55)) {
            class352.field5018.field8003 = 2;
            class284.field4145.field8003 = 2;
            class129.field2108.field8003 = 2;
            class206.field2901.field8003 = 2;
            class179.field2600.field8003 = 2;
            class220.field3308.field8003 = 2;
            class565.field8087.field8003 = 2;
        }
        if (class118.method974(arg1, 122)) {
            class179.field2612 = 0;
            class62.field860 = 1;
            class534.field7460 = 0;
            class639.field9279 = 1;
            class583.field8317 = 0;
            class382.method2327(true, (byte) 112);
            class352.field5018.field8003 = 1;
            class284.field4145.field8003 = 1;
            class129.field2108.field8003 = 1;
            class206.field2901.field8003 = 1;
            class179.field2600.field8003 = 1;
            class220.field3308.field8003 = 1;
            class565.field8087.field8003 = 1;
        }
        if (arg1 == 10 || arg1 == 2) {
            class266.method1687(-1);
        }
        if (arg1 == 1) {
            class92.method815(class325.field4675, arg0, class159.field2378);
        } else {
            class144.method1058((byte) -114);
        }
        boolean var2 = arg1 == 1 || class332.method2055(arg1, (byte) 106) || class24.method238(-93, arg1);
        boolean var3 = class64.field893 == 1 || class332.method2055(class64.field893, (byte) 114) || class24.method238(37, class64.field893);
        if (var2 != var3) {
            if (var2) {
                class93.field1643 = class567.field8100;
                if (class202.field2854.field7921 == 0) {
                    class277.method1784(-66, 2);
                } else {
                    class553.method3103((byte) 32, class567.field8100, 2, class202.field2854.field7921, class115.field1890, 0, false);
                }
                class384.field5712.method897(-67, false);
            } else {
                class277.method1784(-122, 2);
                class384.field5712.method897(-102, true);
            }
        }
        if (arg0) {
            if (class118.method974(arg1, 22) || arg1 == 12) {
                class159.field2378.method122();
            }
            class64.field893 = arg1;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 220)
    public static void method1905(int arg0) {
        field4424 = null;
        if (arg0 != -16387) {
            field4425 = false;
        }
        field4417 = null;
    }
}
