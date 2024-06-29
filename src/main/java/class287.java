import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class287 extends class23 {

    @OriginalMember(owner = "client!oj", name = "L", descriptor = "I")
    private int field5031 = -1;

    @OriginalMember(owner = "client!oj", name = "K", descriptor = "Lng;")
    public static class139 field5030 = new class139(64);

    @OriginalMember(owner = "client!oj", name = "W", descriptor = "Llc;")
    public static class143 field5040 = class66.method374(")0", -1);

    @OriginalMember(owner = "client!oj", name = "U", descriptor = "Llc;")
    public static class143 field5039 = class66.method374(" <col=ffff00>", -1);

    @OriginalMember(owner = "client!oj", name = "X", descriptor = "I")
    public static int field5041 = 99;

    @OriginalMember(owner = "client!oj", name = "I", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!oj", name = "J", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!oj", name = "M", descriptor = "I")
    public int field5032;

    @OriginalMember(owner = "client!oj", name = "N", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!oj", name = "P", descriptor = "I")
    public static int field5035;

    @OriginalMember(owner = "client!oj", name = "Q", descriptor = "I")
    public int field5036;

    @OriginalMember(owner = "client!oj", name = "R", descriptor = "I")
    public static int field5037;

    @OriginalMember(owner = "client!oj", name = "S", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!oj", name = "Y", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!oj", name = "Z", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!oj", name = "ab", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!oj", name = "O", descriptor = "[I")
    public int[] field5034;

    @OriginalMember(owner = "client!oj", name = "bb", descriptor = "[Llc;")
    public static class143[] field5045;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(I)V")
    public static final void method1877(int arg0) {
        ++field5029;
        if (class67.field1276 > arg0) {
            class39.method252((byte) -110);
        } else {
            class149.field2739 = class17.field298;
            class17.field298 = null;
            class43.method271(40, arg0 ^ -114);
        }
    }

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "(I)V")
    public static final void method1878(int arg0) {
        if (arg0 != 16711680) {
            method1881((byte) -24);
        }
        class243.field4372.method823(true);
        class229.field4186.method823(true);
        ++field5035;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)Z")
    public final boolean method1879(boolean arg0) {
        ++field5028;
        if (!arg0) {
            return true;
        } else if (this.field5034 != null) {
            return true;
        } else if (this.field5031 >= 0) {
            class160 var2 = class179.field3206 >= 0 ? class74.method422(class117.field2089, class179.field3206, false, this.field5031) : class178.method1174(this.field5031, class117.field2089, 0);
            var2.method1056();
            this.field5034 = var2.field2894;
            this.field5036 = var2.field4201;
            this.field5032 = var2.field4208;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field5033;
        if (!arg2) {
            method1878(-36);
        }
        if (~arg1 == -1) {
            this.field5031 = arg0.method1275(128);
        }
    }

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "(B)V")
    public static void method1880(byte arg0) {
        field5039 = null;
        if (arg0 != 91) {
            field5042 = 48;
        }
        field5040 = null;
        field5030 = null;
        field5045 = null;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(II)[[I")
    public int[][] method131(int arg0, int arg1) {
        ++field5044;
        if (arg1 != 1) {
            method1878(20);
        }
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508 && this.method1879(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (~class9.field179 == ~this.field5032 ? arg0 : this.field5032 * arg0 / class9.field179) * this.field5036;
            if (~class72.field1359 == ~this.field5036) {
                for (int var8 = 0; ~var8 > ~class72.field1359; ++var8) {
                    int var9 = this.field5034[var7++];
                    var6[var8] = class129.method777(var9 << 4, 4080);
                    var5[var8] = class129.method777(65280, var9) >> 4;
                    var4[var8] = class129.method777(var9, 16711680) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class72.field1359; ++var10) {
                    int var11 = this.field5036 * var10 / class72.field1359;
                    int var12 = this.field5034[var7 + var11];
                    var6[var10] = class129.method777(255, var12) << 4;
                    var5[var10] = class129.method777(65280, var12) >> 4;
                    var4[var10] = class129.method777(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "()V")
    public class287() {
        super(0, false);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)I")
    public final int method156(byte arg0) {
        if (arg0 != 84) {
            this.field5032 = -117;
        }
        ++field5037;
        return this.field5031;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public final void method126(byte arg0) {
        if (arg0 < 90) {
            this.field5032 = 54;
        }
        super.method126((byte) 112);
        this.field5034 = null;
        ++field5038;
    }

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "(B)V")
    public static final void method1881(byte arg0) {
        if (arg0 == 73) {
            ++field5043;
            if (class112.field1974 != 2) {
                if (class31.field499 == class251.field4522 && class67.field1279 == class12.field233) {
                    class112.field1974 = 0;
                    if (class41.field699 && class128.field2264[81] && class257.field4625 > 2) {
                        class23.method162((byte) -87, class257.field4625 + -2);
                    } else {
                        class23.method162((byte) -87, class257.field4625 + -1);
                    }
                } else {
                    class87.field1590 = class31.field499;
                    class112.field1974 = 2;
                    class159.field2874 = class67.field1279;
                }
            } else if (~class87.field1590 == ~class251.field4522 && class159.field2874 == class12.field233) {
                class112.field1974 = 0;
                if (class41.field699 && class128.field2264[81] && class257.field4625 > 2) {
                    class23.method162((byte) -87, class257.field4625 + -2);
                } else {
                    class23.method162((byte) -87, class257.field4625 + -1);
                }
            }
        }
    }
}
