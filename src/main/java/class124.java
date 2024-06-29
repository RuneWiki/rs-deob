import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class124 extends class142 {

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    private int field2365 = 4096;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "Lai;")
    public static class10 field2371 = class44.method278("::qa_op_test", 95);

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "B")
    public static byte field2374 = 0;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2368 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!nf", name = "cb", descriptor = "Lai;")
    private static class10 field2377 = class44.method278("This world is running a closed Beta)3", -40);

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public static int field2376 = 0;

    @OriginalMember(owner = "client!nf", name = "eb", descriptor = "Lai;")
    public static class10 field2379 = field2377;

    @OriginalMember(owner = "client!nf", name = "db", descriptor = "Lke;")
    public static class96 field2378 = new class96(5000);

    @OriginalMember(owner = "client!nf", name = "fb", descriptor = "I")
    public static int field2380 = 0;

    @OriginalMember(owner = "client!nf", name = "hb", descriptor = "Lai;")
    private static class10 field2382 = class44.method278("Your ignore list is full)3 Max of 100 users)3", 127);

    @OriginalMember(owner = "client!nf", name = "ib", descriptor = "Lai;")
    public static class10 field2383 = field2382;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "I")
    public static int field2367;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    public static int field2369;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field2370;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!nf", name = "gb", descriptor = "Lc;")
    public static class21 field2381;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V")
    public static final void method862(int arg0) {
        ++field2373;
        int var1 = 5 / ((arg0 - -39) / 56);
        class147.field2812.method226((byte) -90);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        if (arg2 >= -34) {
            field2378 = null;
        }
        ++field2367;
        if (arg1 == 0) {
            this.field2365 = arg0.method762((byte) 127);
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)V")
    public static void method863(int arg0) {
        if (arg0 == 0) {
            field2377 = null;
            field2371 = null;
            field2383 = null;
            field2368 = null;
            field2381 = null;
            field2378 = null;
            field2379 = null;
            field2382 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        if (arg0) {
            field2374 = 69;
        }
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        ++field2370;
        if (super.field2683.field3516) {
            int[] var4 = this.method963((byte) -121, 0, class205.field3986 & arg1 + -1);
            int[] var5 = this.method963((byte) -121, 0, arg1);
            int[] var6 = this.method963((byte) -121, 0, arg1 - -1 & class205.field3986);
            for (int var7 = 0; var7 < class133.field2499; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field2365;
                int var9 = (var5[class56.field997 & var7 + 1] + -var5[class56.field997 & var7 + -1]) * this.field2365;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var12 - -var13 + 4096) / 4096)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "([Lwa;II)V")
    public static final void method864(class200[] arg0, int arg1, int arg2) {
        int var3 = -105 % ((arg2 - 19) / 50);
        for (int var4 = 0; var4 < arg0.length; ++var4) {
            class200 var5 = arg0[var4];
            if (var5 != null) {
                if (var5.field3888 == 0) {
                    if (var5.field3796 != null) {
                        method864(var5.field3796, arg1, -114);
                    }
                    class118 var6 = (class118) class165.field3162.method213(125, (long) var5.field3833);
                    if (var6 != null) {
                        class73.method460(arg1, var6.field2272, (byte) -110);
                    }
                }
                if (~arg1 == -1 && var5.field3801 != null) {
                    class5 var7 = new class5();
                    var7.field55 = var5;
                    var7.field53 = var5.field3801;
                    class104.method681(200000, var7);
                }
                if (~arg1 == -2 && var5.field3878 != null) {
                    if (~var5.field3871 <= -1) {
                        class200 var8 = class66.method432(var5.field3833, false);
                        if (var8 == null || var8.field3796 == null || var8.field3796.length <= var5.field3871 || var8.field3796[var5.field3871] != var5) {
                            continue;
                        }
                    }
                    class5 var9 = new class5();
                    var9.field53 = var5.field3878;
                    var9.field55 = var5;
                    class104.method681(200000, var9);
                }
            }
        }
        ++field2375;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZLc;Lc;I)V")
    public static final void method865(boolean arg0, class21 arg1, class21 arg2, int arg3) {
        class19.field286 = arg1;
        ++field2366;
        if (arg3 != 0) {
            method862(43);
        }
        class122.field2347 = arg2;
        class100.field1853 = arg0;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V")
    public class124() {
        super(1, true);
    }
}
