import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class158 extends class170 {

    @OriginalMember(owner = "client!oj", name = "cb", descriptor = "I")
    private int field2797 = -1;

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field2792 = -1;

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "I")
    public static volatile int field2791 = 0;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!oj", name = "db", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!oj", name = "eb", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!oj", name = "fb", descriptor = "I")
    public static int field2800;

    @OriginalMember(owner = "client!oj", name = "gb", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!oj", name = "hb", descriptor = "I")
    public static int field2802;

    @OriginalMember(owner = "client!oj", name = "ib", descriptor = "I")
    public int field2803;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "[I")
    public int[] field2793;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "(I)V")
    public static final void method1153(int arg0) {
        int var1 = class284.field4996.method1608(class83.field1533);
        ++field2796;
        for (int var2 = 0; ~class268.field4751 < ~var2; ++var2) {
            int var6 = class284.field4996.method1608(class244.method1718(var2, 0));
            if (var1 < var6) {
                var1 = var6;
            }
        }
        var1 += 8;
        int var3 = -(var1 / 2) + class16.field261;
        int var4 = class268.field4751 * arg0 + 21;
        int var5 = class21.field346;
        if (var1 + var3 > class31.field625) {
            var3 = -var1 + class31.field625;
        }
        if (class244.field4428 < var4 + var5) {
            var5 = -var4 + class244.field4428;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        if (var3 < 0) {
            var3 = 0;
        }
        if (class272.field4796 != 1) {
            if (~class16.field261 == ~class121.field2092 && ~class47.field939 == ~class21.field346) {
                class132.field2279 = var1;
                class214.field3806 = (class221.field4068 ? 26 : 22) + class268.field4751 * 15;
                class256.field4588 = true;
                class17.field268 = var5;
                class182.field3250 = var3;
                class272.field4796 = 0;
            } else {
                class272.field4796 = 1;
                class27.field550 = class47.field939;
                class105.field1870 = class121.field2092;
            }
        } else if (~class16.field261 == ~class105.field1870 && ~class27.field550 == ~class21.field346) {
            class132.field2279 = var1;
            class214.field3806 = class268.field4751 * 15 + (class221.field4068 ? 26 : 22);
            class182.field3250 = var3;
            class256.field4588 = true;
            class17.field268 = var5;
            class272.field4796 = 0;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(I)V")
    public final void method256(int arg0) {
        ++field2799;
        super.method256(arg0);
        this.field2793 = null;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class158() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZ)[[I")
    public int[][] method32(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            ++field2798;
            int[][] var3 = super.field3002.method427(arg0, 239);
            if (super.field3002.field1077 && this.method1154((byte) 122)) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                int var7 = (class30.field620 != this.field2803 ? this.field2803 * arg0 / class30.field620 : arg0) * this.field2801;
                if (class88.field1595 == this.field2801) {
                    for (int var8 = 0; ~class88.field1595 < ~var8; ++var8) {
                        int var9 = this.field2793[var7++];
                        var6[var8] = class121.method860(4080, var9 << 4);
                        var5[var8] = class121.method860(var9 >> 4, 4080);
                        var4[var8] = class121.method860(16711680, var9) >> 12;
                    }
                } else {
                    for (int var10 = 0; ~class88.field1595 < ~var10; ++var10) {
                        int var11 = this.field2801 * var10 / class88.field1595;
                        int var12 = this.field2793[var7 + var11];
                        var6[var10] = class121.method860(var12 << 4, 4080);
                        var5[var10] = class121.method860(65280, var12) >> 4;
                        var4[var10] = class121.method860(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)Z")
    public final boolean method1154(byte arg0) {
        ++field2800;
        if (this.field2793 != null) {
            return true;
        } else {
            if (arg0 <= 113) {
                this.method1154((byte) -103);
            }
            if (~this.field2797 <= -1) {
                class139 var2 = class284.field4986 >= 0 ? class20.method119(class85.field1542, this.field2797, (byte) -45, class284.field4986) : class247.method1739(this.field2797, class85.field1542, (byte) 71);
                var2.method956();
                this.field2801 = var2.field1802;
                this.field2803 = var2.field1811;
                this.field2793 = var2.field2399;
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)I")
    public final int method1155(boolean arg0) {
        ++field2794;
        if (!arg0) {
            method1153(-89);
        }
        return this.field2797;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (arg1 == 5877) {
            if (~arg2 == -1) {
                this.field2797 = arg0.method1050(1272006568);
            }
            ++field2802;
        }
    }
}
