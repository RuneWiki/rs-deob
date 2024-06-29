import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class161 extends class212 {

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    private int field2745 = 585;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "[Lsc;")
    public static class181[] field2749 = new class181[500];

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "Lsc;")
    public static class181 field2752 = class149.method967(255, "Hierhin gehen");

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lsc;")
    private static class181 field2753 = class149.method967(255, "details");

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field2747 = 0;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "Lsc;")
    private static class181 field2755 = class149.method967(255, "glow2:");

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "Lsc;")
    public static class181 field2743 = field2755;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Lsc;")
    public static class181 field2746 = field2755;

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lsc;")
    public static class181 field2756 = class149.method967(255, "Clientscript error in: ");

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field2754;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "Lsc;")
    public static class181 field2744;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lvf;II)V")
    public final void method26(class230 arg0, int arg1, int arg2) {
        if (arg2 == -3) {
            if (~arg1 == -1) {
                this.field2745 = arg0.method1535(2);
            }
            ++field2751;
        }
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(II)I")
    public static final int method1078(int arg0, int arg1) {
        if (arg1 != -26123) {
            return -87;
        } else {
            ++field2748;
            return arg0 & 255;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class161() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(B)V")
    public static void method1079(byte arg0) {
        field2753 = null;
        field2749 = null;
        field2746 = null;
        field2756 = null;
        field2752 = null;
        field2743 = null;
        field2744 = null;
        if (arg0 >= -126) {
            field2747 = 107;
        }
        field2755 = null;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[I")
    public final int[] method24(int arg0, byte arg1) {
        ++field2750;
        if (arg1 <= 25) {
            field2744 = null;
        }
        int[] var3 = super.field3640.method737(true, arg0);
        if (super.field3640.field1813) {
            int var4 = class176.field3090[arg0];
            for (int var5 = 0; ~class26.field452 < ~var5; ++var5) {
                int var6 = class253.field4416[var5];
                if (var6 > this.field2745 && ~(4096 - this.field2745) < ~var6 && var4 > -this.field2745 + 2048 && ~(2048 - -this.field2745) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2745 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(2048 - this.field2745) && this.field2745 + 2048 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field2745;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2745 + 2048);
                } else if (~this.field2745 >= ~var4 && -this.field2745 + 4096 >= var4) {
                    if (var6 >= this.field2745 && ~var6 >= ~(-this.field2745 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field2745);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field2745;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field2745 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "([Lka;Ljb;[Lka;[Lka;[Lpd;I[Lka;)V")
    public static final void method1080(class134[] arg0, class11 arg1, class134[] arg2, class134[] arg3, class48[] arg4, int arg5, class134[] arg6) {
        class66.field1078 = arg4;
        class64.field999 = arg2;
        ++field2754;
        class132.field2187 = arg0;
        class219.field3779 = arg1;
        class115.field1862 = arg6;
        class5.field101 = arg3;
        class60.field917.method1682(-108);
        int var7 = class219.field3779.method107(field2753, 125);
        int[] var8 = class219.field3779.method100(var7, true);
        for (int var9 = 0; var9 < var8.length; ++var9) {
            class60.field917.method1689(class16.method135(new class230(class219.field3779.method89(var8[var9], var7, 117)), (byte) -64), 103);
        }
        if (arg5 >= -110) {
            field2753 = null;
        }
    }
}
