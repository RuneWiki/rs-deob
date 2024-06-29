import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class102 extends class82 {

    @OriginalMember(owner = "client!jd", name = "bb", descriptor = "I")
    private int field1866 = 0;

    @OriginalMember(owner = "client!jd", name = "X", descriptor = "I")
    private int field1862 = 0;

    @OriginalMember(owner = "client!jd", name = "db", descriptor = "I")
    private int field1868 = 1;

    @OriginalMember(owner = "client!jd", name = "Z", descriptor = "Ldj;")
    public static class44 field1864 = class89.method650(255, "<col=ffffff>");

    @OriginalMember(owner = "client!jd", name = "V", descriptor = "I")
    public static int field1860 = 0;

    @OriginalMember(owner = "client!jd", name = "ab", descriptor = "Ldj;")
    public static class44 field1865 = class89.method650(255, "");

    @OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
    public static int field1863 = -16 + (int) (Math.random() * 33.0D);

    @OriginalMember(owner = "client!jd", name = "Q", descriptor = "I")
    public static int field1855 = 0;

    @OriginalMember(owner = "client!jd", name = "gb", descriptor = "Z")
    public static boolean field1871 = false;

    @OriginalMember(owner = "client!jd", name = "P", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!jd", name = "S", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!jd", name = "T", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jd", name = "W", descriptor = "I")
    public static int field1861;

    @OriginalMember(owner = "client!jd", name = "cb", descriptor = "I")
    public static int field1867;

    @OriginalMember(owner = "client!jd", name = "eb", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!jd", name = "fb", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!jd", name = "hb", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!jd", name = "R", descriptor = "Lnf;")
    public static class147 field1856;

    @OriginalMember(owner = "client!jd", name = "U", descriptor = "Lve;")
    public static class225 field1859;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method752(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        class130 var8 = new class130();
        var8.field2327 = arg2 / 128;
        var8.field2319 = arg3 / 128;
        var8.field2312 = arg4 / 128;
        var8.field2322 = arg5 / 128;
        var8.field2334 = arg1;
        var8.field2321 = arg2;
        var8.field2335 = arg3;
        var8.field2314 = arg4;
        var8.field2329 = arg5;
        var8.field2330 = arg6;
        var8.field2316 = arg7;
        class22.field365[arg0][class22.field370[arg0]++] = var8;
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "()V")
    public class102() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field1869;
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4 = class212.field3809[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class129.field2287 > var6; ++var6) {
                int var7 = class49.field912[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1862 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field1868 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1868;
                }
                int var12 = var11 - (-4096 & var11);
                if (~this.field1866 == -1) {
                    var12 = class153.field2674[(var12 & 4093) >> 4] + 4096 >> 1;
                } else if (this.field1866 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return arg0 != 25238 ? null : var3;
    }

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        ++field1861;
        if (arg0 <= 95) {
            this.method2((class66) null, -117, (byte) -10);
        }
        class71.method558(4096);
    }

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "(I)V")
    public static void method753(int arg0) {
        field1865 = null;
        if (arg0 >= -104) {
            method754(-113, (class44) null);
        }
        field1856 = null;
        field1864 = null;
        field1859 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILdj;)V")
    public static final void method754(int arg0, class44 arg1) {
        ++field1872;
        int var2 = 115 % ((45 - arg0) / 45);
        class5.field75 = arg1;
        class61.method457((byte) 55);
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field1867;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field1868 = arg0.method506(255);
                }
            } else {
                this.field1866 = arg0.method506(arg2 + 187);
            }
        } else {
            this.field1862 = arg0.method506(255);
        }
        if (arg2 != 68) {
            this.field1866 = -65;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILfj;)V")
    public static final void method755(int arg0, class66 arg1) {
        ++field1854;
        if (class237.field4400 != null) {
            try {
                class237.field4400.method130(0L, (byte) 89);
                class237.field4400.method136(24, arg1.field1195, arg1.field1219, (byte) 88);
            } catch (Exception var2) {
            }
        }
        if (arg0 != 0) {
            field1860 = -58;
        }
        arg1.field1195 += 24;
    }
}
