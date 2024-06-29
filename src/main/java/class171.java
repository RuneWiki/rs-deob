import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class171 extends class82 {

    @OriginalMember(owner = "client!q", name = "T", descriptor = "I")
    private int field2977 = 585;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Ldj;")
    public static class44 field2975 = class89.method650(255, "gleiten:");

    @OriginalMember(owner = "client!q", name = "X", descriptor = "Ldj;")
    public static class44 field2981 = class89.method650(255, ": ");

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "Lri;")
    public static class189 field2974 = new class189(16);

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "Ldj;")
    private static class44 field2985 = class89.method650(255, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "Z")
    public static boolean field2986 = false;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "I")
    public static int field2984 = 0;

    @OriginalMember(owner = "client!q", name = "db", descriptor = "Ldj;")
    public static class44 field2987 = field2985;

    @OriginalMember(owner = "client!q", name = "eb", descriptor = "Ldj;")
    public static class44 field2988 = class89.method650(255, "headicons_prayer");

    @OriginalMember(owner = "client!q", name = "P", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!q", name = "U", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
    public class171() {
        super(0, true);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(BIILve;)Z")
    public static final boolean method1086(byte arg0, int arg1, int arg2, class225 arg3) {
        ++field2976;
        byte[] var4 = arg3.method1466(arg1, arg2, (byte) -125);
        if (var4 == null) {
            return false;
        } else {
            class172.method1093((byte) 123, var4);
            if (arg0 < 94) {
                field2988 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field2983;
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4 = class212.field3809[arg1];
            for (int var5 = 0; class129.field2287 > var5; ++var5) {
                int var6 = class49.field912[var5];
                if (var6 > this.field2977 && var6 < 4096 - this.field2977 && var4 > 2048 - this.field2977 && var4 < this.field2977 + 2048) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2977 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~(-this.field2977 + 2048) > ~var6 && ~var6 > ~(this.field2977 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field2977;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2977 + 2048);
                } else if (this.field2977 <= var4 && ~var4 >= ~(4096 - this.field2977)) {
                    if (~var6 <= ~this.field2977 && ~(-this.field2977 + 4096) <= ~var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2977 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2977;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2977 + 2048);
                }
            }
        }
        if (arg0 != 25238) {
            field2975 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V")
    public static void method1087(byte arg0) {
        field2975 = null;
        field2988 = null;
        if (arg0 <= 75) {
            field2986 = false;
        }
        field2981 = null;
        field2985 = null;
        field2974 = null;
        field2987 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IB)I")
    public static final int method1088(int arg0, byte arg1) {
        ++field2982;
        return arg1 < 55 ? 72 : 255 & arg0;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IIIBII)V")
    public static final void method1089(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        int var8 = arg2 + 1;
        class42.method290(class108.field1979[arg2], -7, arg0, arg5, arg1);
        int var9 = arg4 - 1;
        class42.method290(class108.field1979[arg4], -7, arg0, arg5, arg1);
        ++field2979;
        for (int var6 = var8; var6 <= var9; ++var6) {
            int[] var7 = class108.field1979[var6];
            var7[arg0] = var7[arg5] = arg1;
        }
        if (arg3 < 55) {
            method1089(-7, 18, -25, (byte) 83, -1, 127);
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        if (~arg1 == -1) {
            this.field2977 = arg0.method500(99);
        }
        ++field2973;
        if (arg2 != 68) {
            this.method2((class66) null, 4, (byte) -4);
        }
    }
}
