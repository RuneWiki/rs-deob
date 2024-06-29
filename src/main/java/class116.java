import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class116 extends class17 {

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    private int field2002 = 2048;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
    private int field2005 = 12288;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    private int field2003 = 8192;

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
    private int field2010 = 2048;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
    private int field2009 = 0;

    @OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
    private int field2021 = 0;

    @OriginalMember(owner = "client!eb", name = "vb", descriptor = "I")
    private int field2020 = 4096;

    @OriginalMember(owner = "client!eb", name = "rb", descriptor = "Lsf;")
    private static class108 field2016 = class140.method973(255, "yellow:");

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "Lsf;")
    public static class108 field2006 = field2016;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field2000 = 0;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lsf;")
    public static class108 field1999 = class140.method973(255, "mapfunction");

    @OriginalMember(owner = "client!eb", name = "tb", descriptor = "Lsf;")
    public static class108 field2018 = class140.method973(255, "::replacecanvas");

    @OriginalMember(owner = "client!eb", name = "ub", descriptor = "Lsf;")
    public static class108 field2019 = field2016;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "I")
    public static int field2007;

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!eb", name = "mb", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!eb", name = "nb", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!eb", name = "pb", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!eb", name = "qb", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIB)Z", line = 18)
    private final boolean method825(int arg0, int arg1, byte arg2) {
        int var4 = (arg0 + arg1) * this.field2005 >> 12;
        int var5 = class256.field4505[var4 * 255 >> 12 & 0xFF];
        if (arg2 != 54) {
            return false;
        }
        int var6 = (var5 << 12) / this.field2005;
        int var7 = (var6 << 12) / this.field2003;
        int var8 = this.field2020 * var7 >> 12;
        field2017++;
        return arg0 - arg1 < var8 && (-var8) < (arg0 - arg1);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 60)
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(II)Z", line = 50)
    public static final boolean method826(int arg0, int arg1) {
        field2015++;
        if (arg1 != -123) {
            method827((byte) -16);
        }
        return arg0 >= 97 && arg0 <= 122 || arg0 >= 65 && arg0 <= 90;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BLrm;I)V", line = 64)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field2014++;
        if (arg2 == 0) {
            this.field2002 = arg1.method1712(-1);
        } else if (arg2 == 1) {
            this.field2021 = arg1.method1712(-1);
        } else if (arg2 == 2) {
            this.field2009 = arg1.method1712(-1);
        } else if (arg2 == 3) {
            this.field2010 = arg1.method1712(arg0 ^ 0x71);
        } else if (arg2 == 4) {
            this.field2005 = arg1.method1712(-1);
        } else if (arg2 == 5) {
            this.field2020 = arg1.method1712(-1);
        } else if (arg2 == 6) {
            this.field2003 = arg1.method1712(-1);
        }
        if (arg0 != -114) {
            method826(25, -40);
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V", line = 141)
    public static void method827(byte arg0) {
        field2018 = null;
        field2019 = null;
        field1999 = null;
        field2006 = null;
        field2016 = null;
        if (arg0 != -98) {
            field2008 = 77;
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(Z)V", line = 155)
    public final void method116(boolean arg0) {
        class271.method1959(1);
        field2001++;
        if (!arg0) {
            this.method825(-33, 51, (byte) 89);
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(II)[I", line = 173)
    public final int[] method120(int arg0, int arg1) {
        field2012++;
        if (arg0 >= -95) {
            this.method825(-37, -98, (byte) 14);
        }
        int[] var3 = this.field217.method1698(-62, arg1);
        if (this.field217.field4295) {
            int var4 = class36.field504[arg1] - 2048;
            for (int var5 = 0; var5 < field2008; var5++) {
                int var6 = class61.field979[var5] - 2048;
                int var7 = this.field2002 + var6;
                int var8 = this.field2009 + var6;
                int var9 = var7 >= -2048 ? var7 : var7 + 4096;
                int var10 = this.field2021 + var4;
                int var11 = var8 < -2048 ? var8 + 4096 : var8;
                int var12 = var10 < -2048 ? var10 + 4096 : var10;
                int var13 = var9 <= 2048 ? var9 : var9 - 4096;
                int var14 = var11 > 2048 ? var11 - 4096 : var11;
                int var15 = var12 > 2048 ? var12 - 4096 : var12;
                int var16 = this.field2010 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = this.method831(var13, 4096, var15) || this.method825(var18, var14, (byte) 54) ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(ZI)V", line = 237)
    public static final void method828(boolean arg0, int arg1) {
        class185.field3402 = new int[arg1];
        class137.field2418 = new int[arg1];
        field2011++;
        class9.field117 = new int[arg1];
        class203.field3673 = new int[arg1];
        class282.field4937 = new int[arg1];
        if (!arg0) {
            method827((byte) 64);
        }
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(II)V", line = 261)
    public static final void method829(int arg0, int arg1) {
        class223.field3949.method637(arg0, 114);
        int var2 = 31 % ((arg1 + 61) / 59);
        field2007++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V", line = 275)
    public static final void method830(int arg0, byte arg1) {
        field2013++;
        if (class26.field398 == arg0 && arg0 != 0) {
            class41 var2 = class106.field1837[arg0];
            var2.method219(class103.field1799);
        }
        if (arg1 >= -12) {
            field2018 = (class108) null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(III)Z", line = 297)
    private final boolean method831(int arg0, int arg1, int arg2) {
        field2004++;
        int var4 = (arg2 - arg0) * this.field2005 >> 12;
        int var5 = class256.field4505[(var4 * 255 & 0xFF8A4) >> 12];
        int var6 = (var5 << 12) / this.field2005;
        int var7 = (var6 << 12) / this.field2003;
        int var8 = this.field2020 * var7 >> 12;
        if (arg1 != 4096) {
            field2019 = (class108) null;
        }
        return arg0 + arg2 < var8 && arg0 + arg2 > -var8;
    }
}
