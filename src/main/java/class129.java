import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class129 extends class228 {

    @OriginalMember(owner = "client!qi", name = "eb", descriptor = "I")
    private int field2256 = -1;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "Loa;")
    public static class99 field2244 = class221.method1463(2844, "::mm");

    @OriginalMember(owner = "client!qi", name = "X", descriptor = "Loa;")
    public static class99 field2249 = class221.method1463(2844, "(U (X");

    @OriginalMember(owner = "client!qi", name = "db", descriptor = "Loa;")
    public static class99 field2255 = class221.method1463(2844, "<col=ff0000>");

    @OriginalMember(owner = "client!qi", name = "hb", descriptor = "Loa;")
    public static class99 field2259 = class221.method1463(2844, "Okay");

    @OriginalMember(owner = "client!qi", name = "ab", descriptor = "Loe;")
    public static class143 field2252 = new class143(5000);

    @OriginalMember(owner = "client!qi", name = "T", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!qi", name = "U", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!qi", name = "V", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!qi", name = "Z", descriptor = "I")
    private int field2251;

    @OriginalMember(owner = "client!qi", name = "bb", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!qi", name = "cb", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!qi", name = "fb", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!qi", name = "gb", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!qi", name = "kb", descriptor = "I")
    private int field2262;

    @OriginalMember(owner = "client!qi", name = "Y", descriptor = "Ltg;")
    public static class182 field2250;

    @OriginalMember(owner = "client!qi", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field2260;

    @OriginalMember(owner = "client!qi", name = "W", descriptor = "[I")
    private int[] field2248;

    @OriginalMember(owner = "client!qi", name = "jb", descriptor = "[[[I")
    public static int[][][] field2261;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(B)V")
    public static void method851(byte arg0) {
        int var1 = -25 / ((arg0 - -48) / 47);
        field2259 = null;
        field2249 = null;
        field2250 = null;
        field2252 = null;
        field2261 = null;
        field2255 = null;
        field2244 = null;
        field2260 = null;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public final void method852(int arg0) {
        super.method852(arg0);
        ++field2253;
        this.field2248 = null;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class129() {
        super(0, false);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        ++field2246;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791 && this.method855((byte) 72)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class179.field3122 == this.field2262 ? arg1 : this.field2262 * arg1 / class179.field3122) * this.field2251;
            if (class234.field4046 == this.field2251) {
                for (int var8 = 0; ~class234.field4046 < ~var8; ++var8) {
                    int var9 = this.field2248[var7++];
                    var6[var8] = class71.method502(var9, 255) << 4;
                    var5[var8] = class71.method502(65280, var9) >> 4;
                    var4[var8] = class71.method502(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class234.field4046 > var10; ++var10) {
                    int var11 = this.field2251 * var10 / class234.field4046;
                    int var12 = this.field2248[var7 + var11];
                    var6[var10] = class71.method502(255, var12) << 4;
                    var5[var10] = class71.method502(var12 >> 4, 4080);
                    var4[var10] = class71.method502(var12 >> 12, 4080);
                }
            }
        }
        return arg0 != -27 ? null : var3;
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(II)V")
    public static final void method853(int arg0, int arg1) {
        ++field2245;
        class178.field3102.method1809(arg0, (byte) 120);
        if (arg1 != -863634588) {
            field2252 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "(B)V")
    public static final void method854(byte arg0) {
        if (arg0 > -98) {
            method851((byte) 2);
        }
        ++field2258;
        if (class217.field3766 == null || class123.field2164 == null) {
            class217.field3766 = new int[256];
            class123.field2164 = new int[256];
            for (int var1 = 0; ~var1 > -257; ++var1) {
                double var2 = (double) var1 / 255.0D * 6.283185307179586D;
                class217.field3766[var1] = (int) (4096.0D * Math.sin(var2));
                class123.field2164[var1] = (int) (4096.0D * Math.cos(var2));
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "(B)Z")
    private final boolean method855(byte arg0) {
        ++field2254;
        if (arg0 != 72) {
            return true;
        } else if (this.field2248 != null) {
            return true;
        } else if (this.field2256 >= 0) {
            int var2 = class234.field4046;
            int var3 = class179.field3122;
            int var4 = !class210.field3649.method834(this.field2256, (byte) -85) ? 128 : 64;
            this.field2248 = class210.field3649.method833(this.field2256, 255);
            this.field2251 = var4;
            this.field2262 = var4;
            class278.method1834(1380607564, var3, var2);
            return this.field2248 != null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (arg2 != -7618) {
            this.field2256 = -22;
        }
        ++field2257;
        if (~arg0 == -1) {
            this.field2256 = arg1.method1740((byte) 54);
        }
    }

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "(B)I")
    public final int method856(byte arg0) {
        ++field2247;
        if (arg0 < 119) {
            this.method19((byte) -128, 47);
        }
        return this.field2256;
    }
}
