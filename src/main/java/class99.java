import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class99 extends class205 {

    @OriginalMember(owner = "client!jb", name = "Z", descriptor = "I")
    private int field1858 = 1;

    @OriginalMember(owner = "client!jb", name = "bb", descriptor = "I")
    private int field1860 = 1;

    @OriginalMember(owner = "client!jb", name = "X", descriptor = "I")
    private int field1856 = 204;

    @OriginalMember(owner = "client!jb", name = "V", descriptor = "I")
    public static int field1854 = 0;

    @OriginalMember(owner = "client!jb", name = "ab", descriptor = "[S")
    public static short[] field1859 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jb", name = "hb", descriptor = "Lvd;")
    public static class222 field1866 = class212.method1357("<img=1>", 10731);

    @OriginalMember(owner = "client!jb", name = "cb", descriptor = "Lvd;")
    public static class222 field1861 = class212.method1357("<col=ffff00>*V", 10731);

    @OriginalMember(owner = "client!jb", name = "ib", descriptor = "Lvd;")
    private static class222 field1867 = class212.method1357("Your account has been disabled)3", 10731);

    @OriginalMember(owner = "client!jb", name = "fb", descriptor = "Lvd;")
    public static class222 field1864 = field1867;

    @OriginalMember(owner = "client!jb", name = "W", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!jb", name = "db", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jb", name = "gb", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!jb", name = "jb", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!jb", name = "eb", descriptor = "[Loc;")
    public static class151[] field1863;

    @OriginalMember(owner = "client!jb", name = "Y", descriptor = "[S")
    public static short[] field1857;

    @OriginalMember(owner = "client!jb", name = "<init>", descriptor = "()V")
    public class99() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = -50 % ((-47 - arg1) / 34);
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1856 = arg0.method675(2);
                }
            } else {
                this.field1860 = arg0.method662((byte) -93);
            }
        } else {
            this.field1858 = arg0.method662((byte) -112);
        }
        ++field1865;
    }

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "(I)Z")
    public static final boolean method619(int arg0) {
        ++field1855;
        if (arg0 < 125) {
            return true;
        } else {
            class215 var1 = class180.field3335;
            synchronized (class180.field3335) {
                if (~class221.field4091 == ~class138.field2673) {
                    return false;
                } else {
                    class215.field3992 = class226.field4239[class138.field2673];
                    class21.field496 = class7.field109[class138.field2673];
                    class138.field2673 = 127 & class138.field2673 + 1;
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        if (arg0 != 0) {
            this.method2((class109) null, (byte) 115, -120);
        }
        int[] var3 = super.field3810.method557(arg0 + 6978, arg1);
        if (super.field3810.field1635) {
            for (int var4 = 0; var4 < class118.field2245; ++var4) {
                int var5 = class218.field4051[arg1];
                int var6 = class230.field4319[var4];
                int var7 = var6 % (4096 / this.field1858) * this.field1858;
                int var8 = this.field1858 * var6 >> 12;
                int var9 = var5 % (4096 / this.field1860) * this.field1860;
                int var10 = this.field1860 * var5 >> 12;
                if (~this.field1856 < ~var9) {
                    for (var8 -= var10; var8 < 0; var8 += 4) {
                    }
                    while (var8 > 3) {
                        var8 -= 4;
                    }
                    if (var8 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var7 > ~this.field1856) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field1856 < ~var7) {
                    int var11;
                    for (var11 = var8 - var10; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        ++field1868;
        return var3;
    }

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "(I)V")
    public static void method620(int arg0) {
        field1861 = null;
        field1864 = null;
        if (arg0 == 7475) {
            field1859 = null;
            field1866 = null;
            field1863 = null;
            field1867 = null;
            field1857 = null;
        }
    }
}
