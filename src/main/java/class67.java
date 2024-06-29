import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class67 extends class170 {

    @OriginalMember(owner = "client!v", name = "Cb", descriptor = "Ljava/lang/String;")
    public static String field987 = "glow3:";

    @OriginalMember(owner = "client!v", name = "Lb", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!v", name = "Gb", descriptor = "I")
    public static int field991 = -1;

    @OriginalMember(owner = "client!v", name = "Pb", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!v", name = "Rb", descriptor = "I")
    public static int field1002;

    @OriginalMember(owner = "client!v", name = "Sb", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!v", name = "Bb", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!v", name = "Db", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!v", name = "Eb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!v", name = "Hb", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!v", name = "Ib", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!v", name = "Jb", descriptor = "I")
    public static int field994;

    @OriginalMember(owner = "client!v", name = "Mb", descriptor = "I")
    private int field997;

    @OriginalMember(owner = "client!v", name = "Nb", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!v", name = "Ob", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!v", name = "Fb", descriptor = "Lia;")
    private class198 field990;

    @OriginalMember(owner = "client!v", name = "Qb", descriptor = "Lvl;")
    public static class73 field1001;

    @OriginalMember(owner = "client!v", name = "Kb", descriptor = "Lvl;")
    public static class73 field995;

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
    public class67(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!v", name = "z", descriptor = "(I)Z")
    public static final boolean method438(int arg0) {
        ++field998;
        if (arg0 <= 37) {
            field995 = null;
        }
        return class294.field4712 != 0 ? true : class179.field2810.method2078(-100);
    }

    @OriginalMember(owner = "client!v", name = "k", descriptor = "(II)I")
    public final int method439(int arg0, int arg1) {
        ++field989;
        int var3 = this.field997 >> 3;
        if (arg0 <= 101) {
            field987 = null;
        }
        int var4 = 8 - (7 & this.field997);
        this.field997 += arg1;
        int var5 = 0;
        while (~arg1 < ~var4) {
            var5 += (super.field2650[var3++] & class46.field557[var4]) << -var4 + arg1;
            arg1 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg1 != ~var4) {
            var6 = (super.field2650[var3] >> -arg1 + var4 & class46.field557[arg1]) + var5;
        } else {
            var6 = (super.field2650[var3] & class46.field557[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "A", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (arg0 != 7551) {
            field987 = null;
        }
        super.field2676 = (this.field997 + 7) / 8;
        ++field993;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[I)V")
    public final void method441(int arg0, int[] arg1) {
        this.field990 = new class198(arg1);
        ++field992;
        if (arg0 != 8) {
            method448(73, 23, 96);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(II[BI)V")
    public final void method442(int arg0, int arg1, byte[] arg2, int arg3) {
        int var5 = 0;
        if (arg1 <= -87) {
            while (arg3 > var5) {
                arg2[arg0 + var5] = (byte) (super.field2650[super.field2676++] + -this.field990.method1382(98));
                ++var5;
            }
            ++field988;
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(B)V")
    public final void method443(byte arg0) {
        ++field994;
        if (arg0 >= 36) {
            this.field997 = super.field2676 * 8;
        }
    }

    @OriginalMember(owner = "client!v", name = "i", descriptor = "(B)I")
    public final int method444(byte arg0) {
        ++field986;
        return arg0 != 48 ? -99 : 255 & super.field2650[super.field2676++] - this.field990.method1382(102);
    }

    @OriginalMember(owner = "client!v", name = "l", descriptor = "(II)V")
    public final void method445(int arg0, int arg1) {
        if (arg1 != 7) {
            this.field997 = -14;
        }
        ++field1000;
        super.field2650[super.field2676++] = (byte) (arg0 + this.field990.method1382(118));
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(Z)V")
    public static void method446(boolean arg0) {
        if (!arg0) {
            field1001 = null;
            field987 = null;
            field995 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BLjava/lang/String;)V")
    public static final void method447(byte arg0, String arg1) {
        ++field1002;
        System.out.println("Error: " + class19.method110("%0a", "\n", arg0 + -21, arg1));
        if (arg0 != -22) {
            method447((byte) 47, (String) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)Lcf;")
    public static final class123 method448(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class123 var4 = var3.field1631;
            var3.field1631 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!v", name = "m", descriptor = "(II)I")
    public final int method449(int arg0, int arg1) {
        ++field1003;
        return arg1 != 8 ? -96 : arg0 * 8 + -this.field997;
    }
}
