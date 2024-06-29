import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public abstract class class117 extends class137 {

    @OriginalMember(owner = "client!j", name = "n", descriptor = "Z")
    public boolean field2208;

    @OriginalMember(owner = "client!j", name = "P", descriptor = "[Lj;")
    public class117[] field2236;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "Lhh;")
    private static class163 field2215 = class137.method1065("Jun", 17);

    @OriginalMember(owner = "client!j", name = "A", descriptor = "Lhh;")
    private static class163 field2221 = class137.method1065("Nov", 17);

    @OriginalMember(owner = "client!j", name = "p", descriptor = "Lhh;")
    private static class163 field2210 = class137.method1065("Sep", 17);

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lhh;")
    private static class163 field2219 = class137.method1065("May", 17);

    @OriginalMember(owner = "client!j", name = "r", descriptor = "Lhh;")
    private static class163 field2212 = class137.method1065("Apr", 17);

    @OriginalMember(owner = "client!j", name = "D", descriptor = "Lhh;")
    private static class163 field2224 = class137.method1065("Mar", 17);

    @OriginalMember(owner = "client!j", name = "E", descriptor = "Lhh;")
    private static class163 field2225 = class137.method1065("Jan", 17);

    @OriginalMember(owner = "client!j", name = "F", descriptor = "Lhh;")
    private static class163 field2226 = class137.method1065("Jul", 17);

    @OriginalMember(owner = "client!j", name = "I", descriptor = "Lhh;")
    private static class163 field2229 = class137.method1065("Dec", 17);

    @OriginalMember(owner = "client!j", name = "L", descriptor = "Lhh;")
    private static class163 field2232 = class137.method1065("Oct", 17);

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Lhh;")
    private static class163 field2234 = class137.method1065("Aug", 17);

    @OriginalMember(owner = "client!j", name = "O", descriptor = "Lhh;")
    private static class163 field2235 = class137.method1065("Feb", 17);

    @OriginalMember(owner = "client!j", name = "M", descriptor = "[Lhh;")
    public static class163[] field2233 = new class163[] { field2225, field2235, field2224, field2212, field2219, field2215, field2226, field2234, field2210, field2232, field2221, field2229 };

    @OriginalMember(owner = "client!j", name = "o", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2213;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "I")
    public static int field2220;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "Lpa;")
    public static class123 field2214;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "Lnf;")
    public class133 field2218;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Ljf;")
    public class176 field2228;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)I")
    public int method88(byte arg0) {
        field2216++;
        if (arg0 > -71) {
            method936(96);
        }
        return -1;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(III)[[I")
    public final int[][] method931(int arg0, int arg1, int arg2) {
        int var4 = -128 % ((arg1 + 14) / 61);
        field2231++;
        if (!this.field2236[arg2].field2208) {
            return this.field2236[arg2].method90(arg0, true);
        }
        int[][] var5 = new int[3][];
        int[] var6 = this.field2236[arg2].method61(-21393, arg0);
        var5[0] = var6;
        var5[2] = var6;
        var5[1] = var6;
        return var5;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILpg;)V")
    public void method60(int arg0, int arg1, class81 arg2) {
        field2227++;
        if (arg0 != 0) {
            method936(71);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZ)[[I")
    public int[][] method90(int arg0, boolean arg1) {
        field2209++;
        if (!arg1) {
            this.field2237 = -113;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IZI)[I")
    public final int[] method932(int arg0, boolean arg1, int arg2) {
        field2230++;
        if (arg1) {
            return null;
        } else if (this.field2236[arg2].field2208) {
            return this.field2236[arg2].method61(-21393, arg0);
        } else {
            return this.field2236[arg2].method90(arg0, true)[0];
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public static void method933(int arg0) {
        field2224 = null;
        field2232 = null;
        field2221 = null;
        field2219 = null;
        field2210 = null;
        field2212 = null;
        field2215 = null;
        field2234 = null;
        field2225 = null;
        field2233 = null;
        int var1 = 3 % ((arg0 + 69) / 55);
        field2229 = null;
        field2214 = null;
        field2235 = null;
        field2226 = null;
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(I)V")
    public void method86(int arg0) {
        field2217++;
        if (arg0 != 0) {
            method933(-105);
        }
        if (this.field2208) {
            this.field2218.method1052(arg0 + 28039);
            this.field2218 = null;
        } else {
            this.field2228.method1306(2);
            this.field2228 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(I)I")
    public int method934(int arg0) {
        if (arg0 == -24687) {
            field2213++;
            return -1;
        } else {
            return 49;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IIB)V")
    public final void method935(int arg0, int arg1, byte arg2) {
        field2222++;
        int var4 = this.field2237 == 255 ? arg0 : this.field2237;
        int var5 = 96 / ((-arg2 - 46) / 45);
        if (this.field2208) {
            this.field2218 = new class133(var4, arg0, arg1);
        } else {
            this.field2228 = new class176(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!j", name = "f", descriptor = "(I)V")
    public static final void method936(int arg0) {
        field2223++;
        if (class225.field4072 == 5) {
            if (arg0 != 10735) {
                method936(-114);
            }
            class225.field4072 = 6;
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)V")
    public void method57(byte arg0) {
        field2220++;
        if (arg0 > -92) {
            this.field2208 = false;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[I")
    public int[] method61(int arg0, int arg1) {
        field2211++;
        if (arg0 != -21393) {
            this.method90(4, false);
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(IZ)V")
    public class117(int arg0, boolean arg1) {
        this.field2208 = arg1;
        this.field2236 = new class117[arg0];
    }
}
