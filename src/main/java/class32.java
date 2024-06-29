import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class32 extends class82 {

    @OriginalMember(owner = "client!ci", name = "ab", descriptor = "I")
    public static int field562 = 0;

    @OriginalMember(owner = "client!ci", name = "R", descriptor = "I")
    public static int field553 = 0;

    @OriginalMember(owner = "client!ci", name = "cb", descriptor = "Ldj;")
    private static class44 field564 = class89.method650(255, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!ci", name = "Z", descriptor = "Ldj;")
    public static class44 field561 = class89.method650(255, "sl_stars");

    @OriginalMember(owner = "client!ci", name = "X", descriptor = "Ldj;")
    public static class44 field559 = field564;

    @OriginalMember(owner = "client!ci", name = "db", descriptor = "D")
    public static double field565;

    @OriginalMember(owner = "client!ci", name = "S", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!ci", name = "T", descriptor = "I")
    public static int field555;

    @OriginalMember(owner = "client!ci", name = "U", descriptor = "I")
    public static int field556;

    @OriginalMember(owner = "client!ci", name = "V", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!ci", name = "W", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!ci", name = "Y", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!ci", name = "eb", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!ci", name = "gb", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!ci", name = "hb", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!ci", name = "P", descriptor = "Lef;")
    public static class51 field552;

    @OriginalMember(owner = "client!ci", name = "fb", descriptor = "[[[Lga;")
    public static class68[][][] field567;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(II)V")
    private final void method216(int arg0, int arg1) {
        this.field560 = (arg0 & 16711680) >> 12;
        if (arg1 == 65) {
            this.field566 = (arg0 & 255) << 4;
            ++field555;
            this.field557 = (65280 & arg0) >> 4;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(I)V")
    private class32(int arg0) {
        super(0, false);
        this.method216(arg0, 65);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field568;
        if (arg1 == 0) {
            this.method216(arg0.method480(97), 65);
        }
        if (arg2 != 68) {
            this.method2((class66) null, -41, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
    public static void method217(byte arg0) {
        if (arg0 != -32) {
            method219(-87, 0.9413521722950264D);
        }
        field561 = null;
        field559 = null;
        field552 = null;
        field567 = null;
        field564 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lve;BI)Lod;")
    public static final class155 method218(class225 arg0, byte arg1, int arg2) {
        if (arg1 != 42) {
            field562 = -58;
        }
        ++field558;
        return !class156.method1026(255, arg2, arg0) ? null : class136.method917(1760071777);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ID)V")
    public static final void method219(int arg0, double arg1) {
        if (class36.field649 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (255.0D * Math.pow((double) var3 / 255.0D, arg1));
                class116.field2073[var3] = ~var4 >= -256 ? var4 : 255;
            }
            class36.field649 = arg1;
        }
        if (arg0 < 73) {
            field562 = -21;
        }
        ++field569;
    }

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "(II)Z")
    public static final boolean method220(int arg0, int arg1) {
        if (arg1 > -124) {
            field552 = null;
        }
        ++field556;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && ~arg0 >= -91) {
            return true;
        } else {
            return ~arg0 <= -49 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILdj;)I")
    public static final int method221(int arg0, class44 arg1) {
        if (arg0 <= 62) {
            return 82;
        } else {
            ++field563;
            return arg1.method340(3) - -1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)[[I")
    public final int[][] method6(int arg0, int arg1) {
        ++field554;
        if (arg0 >= -59) {
            method220(-22, -15);
        }
        int[][] var3 = super.field1601.method548(arg1, true);
        if (super.field1601.field1343) {
            int[] var4 = var3[1];
            int[] var5 = var3[2];
            int[] var6 = var3[0];
            for (int var7 = 0; var7 < class129.field2287; ++var7) {
                var6[var7] = this.field560;
                var4[var7] = this.field557;
                var5[var7] = this.field566;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class32() {
        this(0);
    }
}
