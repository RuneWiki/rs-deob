import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class44 extends class105 {

    @OriginalMember(owner = "client!bj", name = "R", descriptor = "I")
    private int field968 = 4096;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "Z")
    private boolean field972 = true;

    @OriginalMember(owner = "client!bj", name = "O", descriptor = "I")
    public static int field966 = 0;

    @OriginalMember(owner = "client!bj", name = "N", descriptor = "Lvf;")
    public static class265 field965 = class87.method582(-46, "blanc:");

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    public static int field971 = 0;

    @OriginalMember(owner = "client!bj", name = "S", descriptor = "Z")
    public static volatile boolean field969 = false;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field980 = -1;

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "I")
    public static int field976;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!bj", name = "Q", descriptor = "Lgk;")
    public static class6 field967;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "[[I")
    public static int[][] field973;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lhb;Lhb;B)V")
    public static final void method365(class28 arg0, class28 arg1, byte arg2) {
        if (arg2 != 66) {
            method367(-106);
        }
        ++field977;
        if (arg1.field729 != null) {
            arg1.method238((byte) 66);
        }
        arg1.field729 = arg0;
        arg1.field733 = arg0.field733;
        arg1.field729.field733 = arg1;
        arg1.field733.field729 = arg1;
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class44() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lek;ILfl;Lfl;)V")
    public static final void method366(class156 arg0, int arg1, class192 arg2, class192 arg3) {
        class219.field3956 = arg3;
        class17.field480 = arg2;
        class210.field3782 = arg0;
        if (class17.field480 != null) {
            class184.field3298 = class17.field480.method1331(1, (byte) 99);
        }
        if (arg1 == 1000000) {
            ++field970;
            if (class219.field3956 != null) {
                class82.field1537 = class219.field3956.method1331(1, (byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        ++field979;
        if (arg1 != 255) {
            field971 = 49;
        }
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field972 = ~arg2.method920((byte) 88) == -2;
            }
        } else {
            this.field968 = arg2.method927(127);
        }
    }

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
    public static void method367(int arg0) {
        field967 = null;
        field965 = null;
        if (arg0 != -19127) {
            field969 = true;
        }
        field973 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ZI)Lvf;")
    public static final class265 method368(boolean arg0, int arg1) {
        if (!arg0) {
            return null;
        } else {
            ++field976;
            if (~arg1 > -100001) {
                return class148.method1022(10, new class265[] { class193.field3477, class241.method1609(true, arg1), class253.field4358 });
            } else {
                return arg1 < 10000000 ? class148.method1022(10, new class265[] { class238.field4156, class241.method1609(true, arg1 / 1000), class257.field4389, class253.field4358 }) : class148.method1022(10, new class265[] { class28.field737, class241.method1609(true, arg1 / 1000000), class57.field1167, class253.field4358 });
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(Z)V")
    public static final void method369(boolean arg0) {
        if (!arg0) {
            field966 = 7;
        }
        ++field975;
        if (class30.field774 != null) {
            class30.field774.method669(arg0);
        }
        if (class238.field4145 != null) {
            class238.field4145.method669(arg0);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IB)[[I")
    public final int[][] method18(int arg0, byte arg1) {
        int[][] var3 = super.field1870.method569((byte) -117, arg0);
        if (arg1 > -110) {
            method367(45);
        }
        if (super.field1870.field1567) {
            int[] var4 = this.method705(class11.field377 & arg0 + -1, (byte) -46, 0);
            int[] var5 = this.method705(arg0, (byte) -118, 0);
            int[] var6 = this.method705(arg0 + 1 & class11.field377, (byte) -121, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; ~class94.field1668 < ~var10; ++var10) {
                int var11 = (var6[var10] + -var4[var10]) * this.field968;
                int var12 = (var5[var10 - -1 & class1.field20] + -var5[var10 + -1 & class1.field20]) * this.field968;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (4096.0D * Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)));
                int var18;
                int var19;
                int var20;
                if (var17 != 0) {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                } else {
                    var20 = 0;
                    var19 = 0;
                    var18 = 0;
                }
                if (this.field972) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = 2048 - -(var19 >> 1);
                }
                var7[var10] = var18;
                var8[var10] = var20;
                var9[var10] = var19;
            }
        }
        ++field978;
        return var3;
    }
}
