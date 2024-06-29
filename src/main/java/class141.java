import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class141 extends class19 {

    @OriginalMember(owner = "client!uc", name = "Oc", descriptor = "Laf;")
    public static class7 field3318 = class48.method406(40, "titlebutton");

    @OriginalMember(owner = "client!uc", name = "Sc", descriptor = "Laf;")
    public static class7 field3322 = class48.method406(40, "Nehmen");

    @OriginalMember(owner = "client!uc", name = "Qc", descriptor = "I")
    public static int field3320 = 0;

    @OriginalMember(owner = "client!uc", name = "Xc", descriptor = "Laf;")
    public static class7 field3327 = class48.method406(40, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!uc", name = "Wc", descriptor = "I")
    public static int field3326 = 5063219;

    @OriginalMember(owner = "client!uc", name = "Vc", descriptor = "[B")
    public static byte[] field3325 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!uc", name = "Rc", descriptor = "Lua;")
    public static class139 field3321 = new class139(5000);

    @OriginalMember(owner = "client!uc", name = "bd", descriptor = "Laf;")
    public static class7 field3331 = class48.method406(40, "");

    @OriginalMember(owner = "client!uc", name = "ad", descriptor = "Laf;")
    public static class7 field3330 = class48.method406(40, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!uc", name = "dd", descriptor = "Laf;")
    public static class7 field3333 = class48.method406(40, "welle:");

    @OriginalMember(owner = "client!uc", name = "fd", descriptor = "Laf;")
    private static class7 field3335 = class48.method406(40, "To create a new account you need to");

    @OriginalMember(owner = "client!uc", name = "ed", descriptor = "Laf;")
    public static class7 field3334 = field3335;

    @OriginalMember(owner = "client!uc", name = "hd", descriptor = "I")
    public static int field3337 = 1;

    @OriginalMember(owner = "client!uc", name = "Nc", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!uc", name = "Pc", descriptor = "I")
    public static int field3319;

    @OriginalMember(owner = "client!uc", name = "Uc", descriptor = "I")
    public static int field3324;

    @OriginalMember(owner = "client!uc", name = "Yc", descriptor = "I")
    public static int field3328;

    @OriginalMember(owner = "client!uc", name = "Zc", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!uc", name = "gd", descriptor = "I")
    public static int field3336;

    @OriginalMember(owner = "client!uc", name = "cd", descriptor = "Lbe;")
    public static class13 field3332;

    @OriginalMember(owner = "client!uc", name = "Tc", descriptor = "Lne;")
    public class95 field3323;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(II)I")
    public static int method1150(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILof;)V")
    public static final void method1151(int arg0, class103 arg1) {
        if (class101.field2395 == arg1.field2551) {
            class2.field9[arg1.field2501] = true;
        }
        ++field3336;
        if (arg0 != 15569) {
            field3318 = null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)Leb;")
    public final class31 method190(int arg0) {
        ++field3329;
        if (this.field3323 == null) {
            return null;
        } else {
            class93 var2 = ~super.field478 != 0 && ~super.field457 == -1 ? class87.method710(super.field478, 6491) : null;
            class93 var3 = super.field502 == -1 || ~super.field502 == ~super.field460 && var2 != null ? null : class87.method710(super.field502, 6491);
            class31 var4 = this.field3323.method782(var3, super.field487, var2, super.field489, (byte) 40);
            if (var4 == null) {
                return null;
            } else {
                var4.method262();
                super.field504 = var4.field2386;
                if (~super.field469 != 0 && super.field475 != -1) {
                    class31 var5 = class94.method764(super.field469, -21565).method241(arg0 ^ 14, super.field475);
                    if (var5 != null) {
                        var5.method282(0, -super.field448, 0);
                        class31[] var6 = new class31[] { var4, var5 };
                        var4 = new class31(var6, 2);
                    }
                }
                if (this.field3323.field2220 == arg0) {
                    var4.field799 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "h", descriptor = "(I)V")
    public static final void method1152(int arg0) {
        class4.field63 = 0;
        class19.field449 = 0;
        class145.field3421 = -1;
        class77.field1793 = -1;
        class42.field1012 = 0;
        class121.field2854 = -1;
        class136.field3254 = 0;
        class87.field2026 = 0;
        ++field3328;
        class89.field2073 = -1;
        class135.field3230 = 0;
        class47.field1150.field2903 = 0;
        class91.field2100.field2903 = 0;
        class78.field1817 = false;
        int var1 = 40 % ((arg0 - 68) / 37);
        for (int var2 = 0; ~var2 > ~class18.field425.length; ++var2) {
            if (class18.field425[var2] != null) {
                class18.field425[var2].field445 = -1;
            }
        }
        for (int var3 = 0; class121.field2843.length > var3; ++var3) {
            if (class121.field2843[var3] != null) {
                class121.field2843[var3].field445 = -1;
            }
        }
        class148.method1188(32);
        class111.method880(20, 30);
        for (int var4 = 0; ~var4 > -101; ++var4) {
            class2.field9[var4] = true;
        }
    }

    @OriginalMember(owner = "client!uc", name = "i", descriptor = "(I)V")
    public static void method1153(int arg0) {
        field3334 = null;
        field3335 = null;
        field3331 = null;
        if (arg0 < 34) {
            method1153(127);
        }
        field3333 = null;
        field3330 = null;
        field3321 = null;
        field3332 = null;
        field3322 = null;
        field3318 = null;
        field3325 = null;
        field3327 = null;
    }

    @OriginalMember(owner = "client!uc", name = "g", descriptor = "(I)Z")
    public final boolean method186(int arg0) {
        ++field3324;
        if (arg0 > -125) {
            field3337 = -38;
        }
        return this.field3323 != null;
    }
}
